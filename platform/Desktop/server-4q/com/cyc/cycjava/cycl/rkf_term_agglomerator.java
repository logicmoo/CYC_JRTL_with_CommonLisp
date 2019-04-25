package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_term_agglomerator
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_term_agglomerator";
  public static final String myFingerPrint = "e4c6676c2215fe2a4d57d53ed2c300caa5b1626de79d21457ca64c95da512a12";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 691L)
  public static SubLSymbol $kr_sugar_on$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 875L)
  private static SubLSymbol $kr_sugar$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 8773L)
  public static SubLSymbol $k_permutations_max$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLSymbol $dtp_agglomeration_state$;
  private static final SubLSymbol $sym0$_KR_SUGAR_;
  private static final SubLObject $const1$RuleMacroPredicate;
  private static final SubLString $str2$___S_KR_sugar_spoons_added_to_the;
  private static final SubLSymbol $sym3$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const4$EverythingPSC;
  private static final SubLSymbol $kw5$FUNCTION;
  private static final SubLSymbol $kw6$PREDICATE;
  private static final SubLList $list7;
  private static final SubLObject $const8$arityMin;
  private static final SubLObject $const9$arityMax;
  private static final SubLString $str10$_;
  private static final SubLString $str11$_;
  private static final SubLInteger $int12$100000;
  private static final SubLSymbol $sym13$AGGLOMERATION_STATE;
  private static final SubLSymbol $sym14$AGGLOMERATION_STATE_P;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym20$AGGLOMERATION_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$AGGLOMERATION_STATE_UNCOVERED_TERMS;
  private static final SubLSymbol $sym23$_CSETF_AGGLOMERATION_STATE_UNCOVERED_TERMS;
  private static final SubLSymbol $sym24$AGGLOMERATION_STATE_AGGLOMERATIONS_AVAILABLE;
  private static final SubLSymbol $sym25$_CSETF_AGGLOMERATION_STATE_AGGLOMERATIONS_AVAILABLE;
  private static final SubLSymbol $sym26$AGGLOMERATION_STATE_AGGLOMERATIONS_USED;
  private static final SubLSymbol $sym27$_CSETF_AGGLOMERATION_STATE_AGGLOMERATIONS_USED;
  private static final SubLSymbol $kw28$UNCOVERED_TERMS;
  private static final SubLSymbol $kw29$AGGLOMERATIONS_AVAILABLE;
  private static final SubLSymbol $kw30$AGGLOMERATIONS_USED;
  private static final SubLString $str31$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw32$BEGIN;
  private static final SubLSymbol $sym33$MAKE_AGGLOMERATION_STATE;
  private static final SubLSymbol $kw34$SLOT;
  private static final SubLSymbol $kw35$END;
  private static final SubLSymbol $sym36$VISIT_DEFSTRUCT_OBJECT_AGGLOMERATION_STATE_METHOD;
  private static final SubLSymbol $sym37$SETS_EQUAL_EQUAL_;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 726L)
  public static SubLObject turn_kr_sugar_on()
  {
    $kr_sugar_on$.setDynamicValue( T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 799L)
  public static SubLObject turn_kr_sugar_off()
  {
    $kr_sugar_on$.setDynamicValue( NIL );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 912L)
  public static SubLObject initialize_kr_sugar_set()
  {
    $kr_sugar$.setGlobalValue( isa.all_fort_instances( $const1$RuleMacroPredicate, UNPROVIDED, UNPROVIDED ) );
    PrintLow.format( T, $str2$___S_KR_sugar_spoons_added_to_the, Sequences.length( $kr_sugar$.getGlobalValue() ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 1103L)
  public static SubLObject rkf_term_agglomerator(final SubLObject new_term, SubLObject old_terms)
  {
    if( old_terms == UNPROVIDED )
    {
      old_terms = NIL;
    }
    if( NIL == old_terms )
    {
      return ConsesLow.list( new_term );
    }
    return agglomerate_list_simple( old_terms, T, new_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 1358L)
  public static SubLObject suggest_agglomerate_simple(final SubLObject list_of_terms, SubLObject tolerant, SubLObject pivot)
  {
    if( tolerant == UNPROVIDED )
    {
      tolerant = NIL;
    }
    if( pivot == UNPROVIDED )
    {
      pivot = NIL;
    }
    final SubLObject agglomeration = agglomerate_list_simple( list_of_terms, tolerant, pivot );
    if( NIL != agglomeration )
    {
      return agglomeration;
    }
    return suggest_list_agglomerations( list_of_terms, pivot );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 1646L)
  public static SubLObject suggest_list_agglomerations(final SubLObject list_of_terms, SubLObject pivot)
  {
    if( pivot == UNPROVIDED )
    {
      pivot = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject i;
    SubLObject cdolist_list_var;
    SubLObject n_tuples;
    SubLObject n_tuple;
    SubLObject cdolist_list_var_$1;
    SubLObject suggestions;
    SubLObject suggestion;
    SubLObject fn_test;
    SubLObject local_result;
    SubLObject _prev_bind_0;
    SubLObject _prev_bind_2;
    for( i = NIL, i = ZERO_INTEGER; i.numL( rkf_tools.$rkf_max_arity$.getGlobalValue() ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      n_tuples = ( cdolist_list_var = ( ( NIL != pivot ) ? pivot_k_permutations_of_list( i, list_of_terms, pivot ) : k_permutations_of_list( i, list_of_terms ) ) );
      n_tuple = NIL;
      n_tuple = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        suggestions = ( cdolist_list_var_$1 = rkf_relationship_suggestor.find_relations_of_terms( n_tuple, UNPROVIDED, UNPROVIDED ) );
        suggestion = NIL;
        suggestion = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          if( suggestion.isList() )
          {
            result = ConsesLow.cons( suggestion, result );
          }
          else
          {
            fn_test = NIL;
            local_result = NIL;
            _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
              mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
              fn_test = fort_types_interface.non_predicate_functionP( suggestion );
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
            }
            if( NIL != fn_test )
            {
              local_result = agglomerations_good_for_functor_n_tuple( ConsesLow.cons( suggestion, n_tuple ), $kw5$FUNCTION, UNPROVIDED );
            }
            else
            {
              local_result = agglomerations_good_for_functor_n_tuple( ConsesLow.cons( suggestion, n_tuple ), $kw6$PREDICATE, UNPROVIDED );
            }
            result = ConsesLow.append( local_result, result );
          }
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          suggestion = cdolist_list_var_$1.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        n_tuple = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 2542L)
  public static SubLObject agglomerate_list_simple(final SubLObject list_of_terms, SubLObject tolerant, SubLObject pivot)
  {
    if( tolerant == UNPROVIDED )
    {
      tolerant = NIL;
    }
    if( pivot == UNPROVIDED )
    {
      pivot = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject functor_test = NIL;
    SubLObject predicate_test = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
      functor_test = fort_types_interface.non_predicate_functionP( pivot );
      predicate_test = fort_types_interface.predicateP( pivot );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != functor_test )
    {
      return functor_list_agglomerate( pivot, $kw5$FUNCTION, list_of_terms, tolerant, NIL );
    }
    if( NIL != predicate_test )
    {
      return functor_list_agglomerate( pivot, $kw6$PREDICATE, list_of_terms, tolerant, NIL );
    }
    SubLObject current;
    final SubLObject datum = current = sort_terms_from_functors( list_of_terms );
    SubLObject terms = NIL;
    SubLObject functions = NIL;
    SubLObject predicates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    terms = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    functions = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    predicates = current.first();
    current = current.rest();
    if( NIL == current )
    {
      terms = ConsesLow.append( predicates, terms );
      if( NIL != $kr_sugar_on$.getDynamicValue( thread ) )
      {
        predicates = ConsesLow.append( $kr_sugar$.getGlobalValue(), predicates );
      }
      SubLObject result = NIL;
      SubLObject cdolist_list_var = functions;
      SubLObject fn = NIL;
      fn = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.append( functor_list_agglomerate( fn, $kw5$FUNCTION, terms, tolerant, pivot ), result );
        cdolist_list_var = cdolist_list_var.rest();
        fn = cdolist_list_var.first();
      }
      cdolist_list_var = predicates;
      SubLObject pr = NIL;
      pr = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.append( functor_list_agglomerate( pr, $kw6$PREDICATE, terms, tolerant, pivot ), result );
        cdolist_list_var = cdolist_list_var.rest();
        pr = cdolist_list_var.first();
      }
      return result;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 3524L)
  public static SubLObject functor_list_agglomerate(final SubLObject functor, final SubLObject keyword, final SubLObject termlist, SubLObject tolerant, SubLObject pivot)
  {
    if( tolerant == UNPROVIDED )
    {
      tolerant = NIL;
    }
    if( pivot == UNPROVIDED )
    {
      pivot = NIL;
    }
    final SubLObject f_arity = arity.arity( functor );
    if( NIL == f_arity )
    {
      return variable_arity_functor_list_agglomerate( functor, keyword, termlist, tolerant, pivot );
    }
    final SubLObject n_tuples = ( NIL != pivot ) ? pivot_k_permutations_of_list( f_arity, termlist, pivot ) : k_permutations_of_list( f_arity, termlist );
    SubLObject results = NIL;
    SubLObject cdolist_list_var = n_tuples;
    SubLObject n_tuple = NIL;
    n_tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject candidate = ConsesLow.cons( functor, n_tuple );
      final SubLObject candidate_results = agglomerations_good_for_functor_n_tuple( candidate, keyword, tolerant );
      results = ConsesLow.append( candidate_results, results );
      cdolist_list_var = cdolist_list_var.rest();
      n_tuple = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 4184L)
  public static SubLObject variable_arity_functor_list_agglomerate(final SubLObject functor, final SubLObject keyword, final SubLObject termlist, SubLObject tolerant, SubLObject pivot)
  {
    if( tolerant == UNPROVIDED )
    {
      tolerant = NIL;
    }
    if( pivot == UNPROVIDED )
    {
      pivot = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject min_arity = NIL;
    SubLObject max_arity = NIL;
    SubLObject results = NIL;
    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
      min_arity = kb_mapping_utilities.fpred_value( functor, $const8$arityMin, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
      max_arity = kb_mapping_utilities.fpred_value( functor, $const9$arityMax, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    for( SubLObject index = min_arity; max_arity.numG( Numbers.subtract( index, ONE_INTEGER ) ); index = Numbers.add( ONE_INTEGER, index ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject n_tuples = cdolist_list_var = ( ( NIL != pivot ) ? pivot_k_permutations_of_list( index, termlist, pivot ) : k_permutations_of_list( index, termlist ) );
      SubLObject n_tuple = NIL;
      n_tuple = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject candidate = ConsesLow.cons( functor, n_tuple );
        final SubLObject candidate_results = agglomerations_good_for_functor_n_tuple( candidate, keyword, tolerant );
        results = ConsesLow.append( candidate_results, results );
        cdolist_list_var = cdolist_list_var.rest();
        n_tuple = cdolist_list_var.first();
      }
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 4970L)
  public static SubLObject agglomerations_good_for_functor_n_tuple(final SubLObject functor_n_tuple_list, final SubLObject keyword, SubLObject tolerant)
  {
    if( tolerant == UNPROVIDED )
    {
      tolerant = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    if( keyword.eql( $kw5$FUNCTION ) )
    {
      SubLObject wft_test = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
        wft_test = wff.el_wftP( functor_n_tuple_list, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      if( NIL != wft_test )
      {
        results = ConsesLow.cons( functor_n_tuple_list, results );
      }
      else if( NIL != tolerant )
      {
        SubLObject cdolist_list_var;
        final SubLObject formulas = cdolist_list_var = replace_one_term_with_descriptive_variable( functor_n_tuple_list );
        SubLObject form = NIL;
        form = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject inner_wft = NIL;
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
            inner_wft = wff.el_wftP( form, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
          }
          if( NIL != inner_wft )
          {
            final SubLObject item_var = form;
            if( NIL == conses_high.member( item_var, results, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              results = ConsesLow.cons( item_var, results );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          form = cdolist_list_var.first();
        }
      }
    }
    else
    {
      SubLObject wff_test = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
        wff_test = wff.el_wffP( functor_n_tuple_list, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      if( NIL != wff_test )
      {
        results = ConsesLow.cons( functor_n_tuple_list, results );
      }
      else if( NIL != tolerant )
      {
        SubLObject cdolist_list_var;
        final SubLObject formulas = cdolist_list_var = replace_one_term_with_descriptive_variable( functor_n_tuple_list );
        SubLObject form = NIL;
        form = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject inner_wff = NIL;
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
            inner_wff = wff.el_wffP( form, NIL, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
          }
          if( NIL != inner_wff )
          {
            final SubLObject item_var = form;
            if( NIL == conses_high.member( item_var, results, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              results = ConsesLow.cons( item_var, results );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          form = cdolist_list_var.first();
        }
      }
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 5988L)
  public static SubLObject pivot_k_permutations_of_list(final SubLObject k, final SubLObject termlist, final SubLObject pivot)
  {
    final SubLObject base_set = ConsesLow.cons( pivot, termlist );
    final SubLObject k_perms = k_permutations_of_list( k, base_set );
    SubLObject results = NIL;
    SubLObject cdolist_list_var = k_perms;
    SubLObject perm = NIL;
    perm = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( pivot, perm, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        results = ConsesLow.cons( perm, results );
      }
      cdolist_list_var = cdolist_list_var.rest();
      perm = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 6270L)
  public static SubLObject replace_one_term_with_descriptive_variable(final SubLObject el_object)
  {
    final SubLObject functor = el_object.first();
    final SubLObject args = el_object.rest();
    final SubLObject arg_len = Sequences.length( args );
    SubLObject open_objects = NIL;
    SubLObject i;
    SubLObject new_arg_list;
    SubLObject j;
    SubLObject j_th_element;
    for( i = NIL, i = ZERO_INTEGER; i.numL( arg_len ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      new_arg_list = NIL;
      for( j = NIL, j = ZERO_INTEGER; j.numL( arg_len ); j = Numbers.add( j, ONE_INTEGER ) )
      {
        j_th_element = ( i.numE( j ) ? funct_num_to_nice_var_name( functor, Numbers.add( i, ONE_INTEGER ) ) : ConsesLow.nth( j, args ) );
        new_arg_list = ConsesLow.cons( j_th_element, new_arg_list );
      }
      open_objects = ConsesLow.cons( ConsesLow.cons( functor, Sequences.nreverse( new_arg_list ) ), open_objects );
    }
    return open_objects;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 6747L)
  public static SubLObject funct_num_to_nice_var_name(final SubLObject functor, final SubLObject num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject arg_isa = NIL;
    SubLObject var_name = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
      arg_isa = kb_accessors.argn_isa( functor, num, UNPROVIDED ).first();
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    var_name = Strings.string_upcase( string_utilities.string_tokenize( pph_main.generate_phrase( arg_isa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first(), UNPROVIDED, UNPROVIDED );
    return Packages.intern( Sequences.cconcatenate( $str10$_, new SubLObject[] { var_name, $str11$_, print_high.prin1_to_string( num )
    } ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 7061L)
  public static SubLObject sort_terms_from_functors(final SubLObject list_of_terms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject terms = NIL;
    SubLObject functions = NIL;
    SubLObject predicates = NIL;
    SubLObject cdolist_list_var = list_of_terms;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject fn_test = NIL;
      SubLObject pred_test = NIL;
      if( !item.isList() )
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
          fn_test = fort_types_interface.non_predicate_functionP( item );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
          pred_test = fort_types_interface.predicateP( item );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      if( item.isList() )
      {
        terms = ConsesLow.cons( item, terms );
      }
      else if( NIL != fn_test )
      {
        functions = ConsesLow.cons( item, functions );
      }
      else if( NIL != pred_test )
      {
        predicates = ConsesLow.cons( item, predicates );
      }
      else
      {
        terms = ConsesLow.cons( item, terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return ConsesLow.list( terms, functions, predicates );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 7573L)
  public static SubLObject k_permutations_of_list(final SubLObject k, final SubLObject some_list)
  {
    final SubLObject len = Sequences.length( some_list );
    if( k.numG( len ) )
    {
      return NIL;
    }
    if( k.numE( len ) )
    {
      return list_utilities.permute_list( some_list, UNPROVIDED );
    }
    return find_k_permutations( ConsesLow.list( ConsesLow.list( NIL, some_list ) ), NIL, k );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 7814L)
  public static SubLObject find_k_permutations(final SubLObject stack, SubLObject result, final SubLObject k)
  {
    if( NIL == stack )
    {
      return result;
    }
    final SubLObject top = stack.first();
    SubLObject rest_stack = stack.rest();
    final SubLObject top_accumulator = top.first();
    final SubLObject top_rest = conses_high.second( top );
    SubLObject working_list = NIL;
    SubLObject head = NIL;
    SubLObject pivot = NIL;
    SubLObject tail = NIL;
    SubLObject new_accumulator = NIL;
    SubLObject new_rest = NIL;
    working_list = top_rest;
    head = NIL;
    pivot = working_list.first();
    tail = working_list.rest();
    new_accumulator = ConsesLow.cons( pivot, top_accumulator );
    new_rest = ConsesLow.append( head, tail );
    while ( NIL != working_list)
    {
      if( k.numE( Sequences.length( new_accumulator ) ) )
      {
        result = ConsesLow.cons( new_accumulator, result );
      }
      else
      {
        rest_stack = ConsesLow.cons( ConsesLow.list( new_accumulator, new_rest ), rest_stack );
      }
      working_list = working_list.rest();
      head = ConsesLow.cons( pivot, head );
      pivot = working_list.first();
      tail = working_list.rest();
      new_accumulator = ConsesLow.cons( pivot, top_accumulator );
      new_rest = ConsesLow.append( head, tail );
    }
    return find_k_permutations( rest_stack, result, k );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 8580L)
  public static SubLObject fact(final SubLObject num)
  {
    if( num.isZero() )
    {
      return ONE_INTEGER;
    }
    return Numbers.multiply( num, fact( Numbers.subtract( num, ONE_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 8670L)
  public static SubLObject k_perm_num(final SubLObject set_num, final SubLObject subset_num)
  {
    return Numbers.divide( fact( set_num ), fact( Numbers.subtract( set_num, subset_num ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 8817L)
  public static SubLObject find_acceptable_k_permutation_size(final SubLObject set_num, final SubLObject subset_num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject high = set_num;
    SubLObject low = subset_num;
    SubLObject current = Numbers.floor( Numbers.divide( Numbers.add( high, low ), TWO_INTEGER ), UNPROVIDED );
    while ( Numbers.subtract( high, low ).numG( ONE_INTEGER ))
    {
      if( k_perm_num( current, subset_num ).numG( $k_permutations_max$.getDynamicValue( thread ) ) )
      {
        high = current;
        current = Numbers.floor( Numbers.divide( Numbers.add( high, low ), TWO_INTEGER ), UNPROVIDED );
      }
      else
      {
        if( !k_perm_num( current, subset_num ).numL( $k_permutations_max$.getDynamicValue( thread ) ) )
        {
          continue;
        }
        low = current;
        current = Numbers.floor( Numbers.divide( Numbers.add( high, low ), TWO_INTEGER ), UNPROVIDED );
      }
    }
    return current;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9304L)
  public static SubLObject make_list_k_permutation_acceptable(final SubLObject list_of_terms, final SubLObject k)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject list_len = Sequences.length( list_of_terms );
    final SubLObject k_perms = k_perm_num( list_len, k );
    if( $k_permutations_max$.getDynamicValue( thread ).numG( k_perms ) )
    {
      return list_of_terms;
    }
    final SubLObject small_list_len = find_acceptable_k_permutation_size( list_len, k );
    final SubLObject index = Numbers.subtract( list_len, ONE_INTEGER );
    SubLObject small_list;
    SubLObject item_var;
    for( small_list = NIL; small_list_len.numG( Sequences.length( small_list ) ); small_list = ConsesLow.cons( item_var, small_list ) )
    {
      item_var = ConsesLow.nth( random.random( index ), list_of_terms );
      if( NIL == conses_high.member( item_var, small_list, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
      }
    }
    return small_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject agglomeration_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject agglomeration_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $agglomeration_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject agglomeration_state_uncovered_terms(final SubLObject v_object)
  {
    assert NIL != agglomeration_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject agglomeration_state_agglomerations_available(final SubLObject v_object)
  {
    assert NIL != agglomeration_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject agglomeration_state_agglomerations_used(final SubLObject v_object)
  {
    assert NIL != agglomeration_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject _csetf_agglomeration_state_uncovered_terms(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != agglomeration_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject _csetf_agglomeration_state_agglomerations_available(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != agglomeration_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject _csetf_agglomeration_state_agglomerations_used(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != agglomeration_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject make_agglomeration_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $agglomeration_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw28$UNCOVERED_TERMS ) )
      {
        _csetf_agglomeration_state_uncovered_terms( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$AGGLOMERATIONS_AVAILABLE ) )
      {
        _csetf_agglomeration_state_agglomerations_available( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$AGGLOMERATIONS_USED ) )
      {
        _csetf_agglomeration_state_agglomerations_used( v_new, current_value );
      }
      else
      {
        Errors.error( $str31$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject visit_defstruct_agglomeration_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw32$BEGIN, $sym33$MAKE_AGGLOMERATION_STATE, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw28$UNCOVERED_TERMS, agglomeration_state_uncovered_terms( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw29$AGGLOMERATIONS_AVAILABLE, agglomeration_state_agglomerations_available( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw30$AGGLOMERATIONS_USED, agglomeration_state_agglomerations_used( obj ) );
    Functions.funcall( visitor_fn, obj, $kw35$END, $sym33$MAKE_AGGLOMERATION_STATE, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 9783L)
  public static SubLObject visit_defstruct_object_agglomeration_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_agglomeration_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 10055L)
  public static SubLObject new_agglomeration_state(final SubLObject term_list, final SubLObject available, final SubLObject used)
  {
    final SubLObject new_state = make_agglomeration_state( UNPROVIDED );
    _csetf_agglomeration_state_uncovered_terms( new_state, term_list );
    _csetf_agglomeration_state_agglomerations_available( new_state, available );
    _csetf_agglomeration_state_agglomerations_used( new_state, used );
    return new_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-term-agglomerator.lisp", position = 10411L)
  public static SubLObject compute_new_agglomeration_states(final SubLObject aggl_state)
  {
    final SubLObject term_list = agglomeration_state_uncovered_terms( aggl_state );
    if( NIL == term_list )
    {
      return NIL;
    }
    final SubLObject available = agglomeration_state_agglomerations_available( aggl_state );
    final SubLObject used = agglomeration_state_agglomerations_used( aggl_state );
    SubLObject auxiliary_list = NIL;
    SubLObject new_agglomeration_states = NIL;
    SubLObject cdolist_list_var = available;
    SubLObject agglomerate = NIL;
    agglomerate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject key = conses_high.intersection( term_list, agglomerate, UNPROVIDED, UNPROVIDED );
      if( NIL != key )
      {
        final SubLObject old_couple = conses_high.assoc( key, auxiliary_list, Symbols.symbol_function( $sym37$SETS_EQUAL_EQUAL_ ), UNPROVIDED );
        final SubLObject old_value = conses_high.second( old_couple );
        final SubLObject new_value = ConsesLow.cons( agglomerate, old_value );
        final SubLObject new_couple = ConsesLow.list( key, new_value );
        if( NIL != old_couple )
        {
          conses_high.subst( new_couple, old_couple, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED );
        }
        else
        {
          auxiliary_list = ConsesLow.cons( new_couple, auxiliary_list );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      agglomerate = cdolist_list_var.first();
    }
    cdolist_list_var = auxiliary_list;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject key = item.first();
      final SubLObject value = conses_high.second( item );
      final SubLObject new_term_list = conses_high.set_difference( term_list, key, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      final SubLObject new_available = conses_high.set_difference( available, value, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      final SubLObject new_used = ConsesLow.append( value, used );
      final SubLObject new_state = new_agglomeration_state( new_term_list, new_available, new_used );
      new_agglomeration_states = ConsesLow.cons( new_state, new_agglomeration_states );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return new_agglomeration_states;
  }

  public static SubLObject declare_rkf_term_agglomerator_file()
  {
    SubLFiles.declareFunction( me, "turn_kr_sugar_on", "TURN-KR-SUGAR-ON", 0, 0, false );
    SubLFiles.declareFunction( me, "turn_kr_sugar_off", "TURN-KR-SUGAR-OFF", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_kr_sugar_set", "INITIALIZE-KR-SUGAR-SET", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_term_agglomerator", "RKF-TERM-AGGLOMERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "suggest_agglomerate_simple", "SUGGEST-AGGLOMERATE-SIMPLE", 1, 2, false );
    SubLFiles.declareFunction( me, "suggest_list_agglomerations", "SUGGEST-LIST-AGGLOMERATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "agglomerate_list_simple", "AGGLOMERATE-LIST-SIMPLE", 1, 2, false );
    SubLFiles.declareFunction( me, "functor_list_agglomerate", "FUNCTOR-LIST-AGGLOMERATE", 3, 2, false );
    SubLFiles.declareFunction( me, "variable_arity_functor_list_agglomerate", "VARIABLE-ARITY-FUNCTOR-LIST-AGGLOMERATE", 3, 2, false );
    SubLFiles.declareFunction( me, "agglomerations_good_for_functor_n_tuple", "AGGLOMERATIONS-GOOD-FOR-FUNCTOR-N-TUPLE", 2, 1, false );
    SubLFiles.declareFunction( me, "pivot_k_permutations_of_list", "PIVOT-K-PERMUTATIONS-OF-LIST", 3, 0, false );
    SubLFiles.declareFunction( me, "replace_one_term_with_descriptive_variable", "REPLACE-ONE-TERM-WITH-DESCRIPTIVE-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "funct_num_to_nice_var_name", "FUNCT-NUM-TO-NICE-VAR-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "sort_terms_from_functors", "SORT-TERMS-FROM-FUNCTORS", 1, 0, false );
    SubLFiles.declareFunction( me, "k_permutations_of_list", "K-PERMUTATIONS-OF-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "find_k_permutations", "FIND-K-PERMUTATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "fact", "FACT", 1, 0, false );
    SubLFiles.declareFunction( me, "k_perm_num", "K-PERM-NUM", 2, 0, false );
    SubLFiles.declareFunction( me, "find_acceptable_k_permutation_size", "FIND-ACCEPTABLE-K-PERMUTATION-SIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_list_k_permutation_acceptable", "MAKE-LIST-K-PERMUTATION-ACCEPTABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "agglomeration_state_print_function_trampoline", "AGGLOMERATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "agglomeration_state_p", "AGGLOMERATION-STATE-P", 1, 0, false );
    new $agglomeration_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "agglomeration_state_uncovered_terms", "AGGLOMERATION-STATE-UNCOVERED-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "agglomeration_state_agglomerations_available", "AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "agglomeration_state_agglomerations_used", "AGGLOMERATION-STATE-AGGLOMERATIONS-USED", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_agglomeration_state_uncovered_terms", "_CSETF-AGGLOMERATION-STATE-UNCOVERED-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_agglomeration_state_agglomerations_available", "_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_agglomeration_state_agglomerations_used", "_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-USED", 2, 0, false );
    SubLFiles.declareFunction( me, "make_agglomeration_state", "MAKE-AGGLOMERATION-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_agglomeration_state", "VISIT-DEFSTRUCT-AGGLOMERATION-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_agglomeration_state_method", "VISIT-DEFSTRUCT-OBJECT-AGGLOMERATION-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_agglomeration_state", "NEW-AGGLOMERATION-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_new_agglomeration_states", "COMPUTE-NEW-AGGLOMERATION-STATES", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_term_agglomerator_file()
  {
    $kr_sugar_on$ = SubLFiles.defparameter( "*KR-SUGAR-ON*", NIL );
    $kr_sugar$ = SubLFiles.deflexical( "*KR-SUGAR*", ( maybeDefault( $sym0$_KR_SUGAR_, $kr_sugar$, NIL ) ) );
    $k_permutations_max$ = SubLFiles.defparameter( "*K-PERMUTATIONS-MAX*", $int12$100000 );
    $dtp_agglomeration_state$ = SubLFiles.defconstant( "*DTP-AGGLOMERATION-STATE*", $sym13$AGGLOMERATION_STATE );
    return NIL;
  }

  public static SubLObject setup_rkf_term_agglomerator_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_KR_SUGAR_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_agglomeration_state$.getGlobalValue(), Symbols.symbol_function( $sym20$AGGLOMERATION_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list21 );
    Structures.def_csetf( $sym22$AGGLOMERATION_STATE_UNCOVERED_TERMS, $sym23$_CSETF_AGGLOMERATION_STATE_UNCOVERED_TERMS );
    Structures.def_csetf( $sym24$AGGLOMERATION_STATE_AGGLOMERATIONS_AVAILABLE, $sym25$_CSETF_AGGLOMERATION_STATE_AGGLOMERATIONS_AVAILABLE );
    Structures.def_csetf( $sym26$AGGLOMERATION_STATE_AGGLOMERATIONS_USED, $sym27$_CSETF_AGGLOMERATION_STATE_AGGLOMERATIONS_USED );
    Equality.identity( $sym13$AGGLOMERATION_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_agglomeration_state$.getGlobalValue(), Symbols.symbol_function(
        $sym36$VISIT_DEFSTRUCT_OBJECT_AGGLOMERATION_STATE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_term_agglomerator_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_term_agglomerator_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_term_agglomerator_file();
  }
  static
  {
    me = new rkf_term_agglomerator();
    $kr_sugar_on$ = null;
    $kr_sugar$ = null;
    $k_permutations_max$ = null;
    $dtp_agglomeration_state$ = null;
    $sym0$_KR_SUGAR_ = makeSymbol( "*KR-SUGAR*" );
    $const1$RuleMacroPredicate = constant_handles.reader_make_constant_shell( makeString( "RuleMacroPredicate" ) );
    $str2$___S_KR_sugar_spoons_added_to_the = makeString( "~%~S KR sugar spoons added to the mix." );
    $sym3$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const4$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw5$FUNCTION = makeKeyword( "FUNCTION" );
    $kw6$PREDICATE = makeKeyword( "PREDICATE" );
    $list7 = ConsesLow.list( makeSymbol( "TERMS" ), makeSymbol( "FUNCTIONS" ), makeSymbol( "PREDICATES" ) );
    $const8$arityMin = constant_handles.reader_make_constant_shell( makeString( "arityMin" ) );
    $const9$arityMax = constant_handles.reader_make_constant_shell( makeString( "arityMax" ) );
    $str10$_ = makeString( "?" );
    $str11$_ = makeString( "-" );
    $int12$100000 = makeInteger( 100000 );
    $sym13$AGGLOMERATION_STATE = makeSymbol( "AGGLOMERATION-STATE" );
    $sym14$AGGLOMERATION_STATE_P = makeSymbol( "AGGLOMERATION-STATE-P" );
    $list15 = ConsesLow.list( makeSymbol( "UNCOVERED-TERMS" ), makeSymbol( "AGGLOMERATIONS-AVAILABLE" ), makeSymbol( "AGGLOMERATIONS-USED" ) );
    $list16 = ConsesLow.list( makeKeyword( "UNCOVERED-TERMS" ), makeKeyword( "AGGLOMERATIONS-AVAILABLE" ), makeKeyword( "AGGLOMERATIONS-USED" ) );
    $list17 = ConsesLow.list( makeSymbol( "AGGLOMERATION-STATE-UNCOVERED-TERMS" ), makeSymbol( "AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE" ), makeSymbol( "AGGLOMERATION-STATE-AGGLOMERATIONS-USED" ) );
    $list18 = ConsesLow.list( makeSymbol( "_CSETF-AGGLOMERATION-STATE-UNCOVERED-TERMS" ), makeSymbol( "_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE" ), makeSymbol(
        "_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-USED" ) );
    $sym19$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym20$AGGLOMERATION_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "AGGLOMERATION-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list21 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "AGGLOMERATION-STATE-P" ) );
    $sym22$AGGLOMERATION_STATE_UNCOVERED_TERMS = makeSymbol( "AGGLOMERATION-STATE-UNCOVERED-TERMS" );
    $sym23$_CSETF_AGGLOMERATION_STATE_UNCOVERED_TERMS = makeSymbol( "_CSETF-AGGLOMERATION-STATE-UNCOVERED-TERMS" );
    $sym24$AGGLOMERATION_STATE_AGGLOMERATIONS_AVAILABLE = makeSymbol( "AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE" );
    $sym25$_CSETF_AGGLOMERATION_STATE_AGGLOMERATIONS_AVAILABLE = makeSymbol( "_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE" );
    $sym26$AGGLOMERATION_STATE_AGGLOMERATIONS_USED = makeSymbol( "AGGLOMERATION-STATE-AGGLOMERATIONS-USED" );
    $sym27$_CSETF_AGGLOMERATION_STATE_AGGLOMERATIONS_USED = makeSymbol( "_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-USED" );
    $kw28$UNCOVERED_TERMS = makeKeyword( "UNCOVERED-TERMS" );
    $kw29$AGGLOMERATIONS_AVAILABLE = makeKeyword( "AGGLOMERATIONS-AVAILABLE" );
    $kw30$AGGLOMERATIONS_USED = makeKeyword( "AGGLOMERATIONS-USED" );
    $str31$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw32$BEGIN = makeKeyword( "BEGIN" );
    $sym33$MAKE_AGGLOMERATION_STATE = makeSymbol( "MAKE-AGGLOMERATION-STATE" );
    $kw34$SLOT = makeKeyword( "SLOT" );
    $kw35$END = makeKeyword( "END" );
    $sym36$VISIT_DEFSTRUCT_OBJECT_AGGLOMERATION_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-AGGLOMERATION-STATE-METHOD" );
    $sym37$SETS_EQUAL_EQUAL_ = makeSymbol( "SETS-EQUAL-EQUAL?" );
  }

  public static final class $agglomeration_state_native
      extends
        SubLStructNative
  {
    public SubLObject $uncovered_terms;
    public SubLObject $agglomerations_available;
    public SubLObject $agglomerations_used;
    private static final SubLStructDeclNative structDecl;

    public $agglomeration_state_native()
    {
      this.$uncovered_terms = CommonSymbols.NIL;
      this.$agglomerations_available = CommonSymbols.NIL;
      this.$agglomerations_used = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $agglomeration_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$uncovered_terms;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$agglomerations_available;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$agglomerations_used;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$uncovered_terms = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$agglomerations_available = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$agglomerations_used = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $agglomeration_state_native.class, $sym13$AGGLOMERATION_STATE, $sym14$AGGLOMERATION_STATE_P, $list15, $list16, new String[] { "$uncovered_terms",
        "$agglomerations_available", "$agglomerations_used"
      }, $list17, $list18, $sym19$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $agglomeration_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $agglomeration_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AGGLOMERATION-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return agglomeration_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 183 ms
 * 
 */