package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class virtual_indexing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.virtual_indexing";
  public static final String myFingerPrint = "c669223bd78d2c8229f5500dc36d11f0781562c6400955cdc47bd9af86df5938";
  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 919L)
  public static SubLSymbol $indexing_debugP$;
  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 967L)
  public static SubLSymbol $index_overlap_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 9430L)
  public static SubLSymbol $overlap_index_unreified_reifiable_nat_uses_unfindable_optimizationP$;
  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 12445L)
  public static SubLSymbol $lookup_overlap_watermark$;
  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 12779L)
  private static SubLSymbol $overlap_index_expense_multiplier$;
  private static final SubLSymbol $sym0$INDEXED_TERM_P;
  private static final SubLSymbol $sym1$_;
  private static final SubLSymbol $sym2$NUM_INDEX;
  private static final SubLSymbol $sym3$ASSERTION_WITH_SEARCH_TERM;
  private static final SubLSymbol $sym4$ASSERTION_WITHOUT_SEARCH_TERM;
  private static final SubLSymbol $sym5$ASSERTIONS_MENTIONING_TERMS;
  private static final SubLList $list6;
  private static final SubLString $str7$Return_a_list_of_assertions_that_;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym10$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const11$EverythingPSC;
  private static final SubLSymbol $sym12$FULLY_INDEXED_TERM_P;
  private static final SubLSymbol $sym13$GAF_ASSERTION_;
  private static final SubLSymbol $sym14$RELEVANT_PRED_;
  private static final SubLSymbol $sym15$GAF_PREDICATE;
  private static final SubLInteger $int16$1000;
  private static final SubLSymbol $kw17$IGNORE;
  private static final SubLSymbol $sym18$MIN;
  private static final SubLObject $const19$termOfUnit;
  private static final SubLSymbol $kw20$NART_ARG;
  private static final SubLSymbol $kw21$GAF;
  private static final SubLSymbol $kw22$FUNCTION_EXTENT;
  private static final SubLSymbol $kw23$OVERLAP;
  private static final SubLString $str24$Too_many_matching_NARTs_to_use__S;
  private static final SubLSymbol $sym25$_EXIT;
  private static final SubLSymbol $kw26$NONE;
  private static final SubLString $str27$Could_not_use__S_in_overlap_index;
  private static final SubLSymbol $sym28$KBEQ;
  private static final SubLInteger $int29$25;
  private static final SubLString $str30$mapping_Cyc_NARTs;
  private static final SubLSymbol $sym31$STRINGP;
  private static final SubLSymbol $kw32$SKIP;
  private static final SubLSymbol $kw33$INDEX_TYPE;
  private static final SubLList $list34;
  private static final SubLString $str35$_s_vs___s___s__s____;

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 1142L)
  public static SubLObject assertions_mentioning_terms(final SubLObject term_list, SubLObject include_meta_assertionsP)
  {
    if( include_meta_assertionsP == UNPROVIDED )
    {
      include_meta_assertionsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == term_list )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = term_list;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    final SubLObject ordered_terms = Sort.sort( Sequences.remove_duplicates( term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym1$_ ), Symbols.symbol_function( $sym2$NUM_INDEX ) );
    final SubLObject index_term = ordered_terms.first();
    SubLObject search_terms = ordered_terms.rest();
    if( NIL == search_terms )
    {
      return kb_mapping.gather_term_assertions( index_term, UNPROVIDED );
    }
    final SubLObject map_term = search_terms.first();
    SubLObject ans = NIL;
    search_terms = search_terms.rest();
    final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding( thread );
    try
    {
      control_vars.$mapping_target$.bind( map_term, thread );
      ans = kb_accessors.selective_assertions_re( index_term, Symbols.symbol_function( $sym3$ASSERTION_WITH_SEARCH_TERM ), UNPROVIDED );
      if( NIL != include_meta_assertionsP )
      {
        SubLObject meta_assertions = ( NIL != forts.fort_p( index_term ) ) ? kb_mapping.all_fort_meta_assertions( index_term ) : NIL;
        if( NIL != meta_assertions )
        {
          final SubLObject _prev_bind_0_$1 = control_vars.$mapping_target$.currentBinding( thread );
          try
          {
            control_vars.$mapping_target$.bind( map_term, thread );
            meta_assertions = Sequences.delete_if( Symbols.symbol_function( $sym4$ASSERTION_WITHOUT_SEARCH_TERM ), meta_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            control_vars.$mapping_target$.rebind( _prev_bind_0_$1, thread );
          }
          ans = ConsesLow.nconc( ans, meta_assertions );
        }
      }
    }
    finally
    {
      control_vars.$mapping_target$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var2 = search_terms;
    SubLObject search_term = NIL;
    search_term = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject _prev_bind_2 = control_vars.$mapping_target$.currentBinding( thread );
      try
      {
        control_vars.$mapping_target$.bind( search_term, thread );
        ans = Sequences.delete_if( Symbols.symbol_function( $sym4$ASSERTION_WITHOUT_SEARCH_TERM ), ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        control_vars.$mapping_target$.rebind( _prev_bind_2, thread );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      search_term = cdolist_list_var2.first();
    }
    return Sequences.remove_duplicates( ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 2850L)
  public static SubLObject assertions_mentioning_terms_in_mt(SubLObject term_list, final SubLObject mt, SubLObject include_meta_assertionsP)
  {
    if( include_meta_assertionsP == UNPROVIDED )
    {
      include_meta_assertionsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    term_list = function_terms.unnatify_terms( term_list );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym9$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      result = assertions_mentioning_terms( term_list, include_meta_assertionsP );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 3145L)
  public static SubLObject assertions_mentioning_terms_in_all_mts(SubLObject term_list, SubLObject include_meta_assertionsP)
  {
    if( include_meta_assertionsP == UNPROVIDED )
    {
      include_meta_assertionsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    term_list = function_terms.unnatify_terms( term_list );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym10$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const11$EverythingPSC, thread );
      result = assertions_mentioning_terms( term_list, include_meta_assertionsP );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 3446L)
  public static SubLObject amt(SubLObject term_list, SubLObject mt, SubLObject include_meta_assertionsP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( include_meta_assertionsP == UNPROVIDED )
    {
      include_meta_assertionsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    term_list = function_terms.unnatify_terms( term_list );
    if( NIL != mt )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym9$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( mt, thread );
        result = assertions_mentioning_terms( term_list, include_meta_assertionsP );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym10$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const11$EverythingPSC, thread );
        result = assertions_mentioning_terms( term_list, include_meta_assertionsP );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 3877L)
  public static SubLObject gather_overlap_index(final SubLObject terms, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == terms )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      final SubLObject fully_indexed_terms = Sequences.remove_duplicates( list_utilities.remove_if_not( $sym12$FULLY_INDEXED_TERM_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
      final SubLObject non_fully_indexed_terms = list_utilities.fast_set_difference( terms, fully_indexed_terms, UNPROVIDED );
      final SubLObject ordered_fully_indexed_terms = Sort.sort( fully_indexed_terms, Symbols.symbol_function( $sym1$_ ), Symbols.symbol_function( $sym2$NUM_INDEX ) );
      final SubLObject index_term = ordered_fully_indexed_terms.first();
      SubLObject search_terms = ConsesLow.append( ordered_fully_indexed_terms.rest(), non_fully_indexed_terms );
      if( NIL == search_terms )
      {
        result = kb_mapping.gather_term_assertions( index_term, UNPROVIDED );
      }
      else
      {
        final SubLObject map_term = search_terms.first();
        SubLObject ans = NIL;
        search_terms = search_terms.rest();
        final SubLObject _prev_bind_0_$2 = control_vars.$mapping_target$.currentBinding( thread );
        try
        {
          control_vars.$mapping_target$.bind( map_term, thread );
          SubLObject doneP = NIL;
          ans = kb_accessors.selective_assertions_re( index_term, Symbols.symbol_function( $sym3$ASSERTION_WITH_SEARCH_TERM ), UNPROVIDED );
          if( NIL == doneP )
          {
            SubLObject csome_list_var = search_terms;
            SubLObject search_term = NIL;
            search_term = csome_list_var.first();
            while ( NIL == doneP && NIL != csome_list_var)
            {
              final SubLObject _prev_bind_0_$3 = control_vars.$mapping_target$.currentBinding( thread );
              try
              {
                control_vars.$mapping_target$.bind( search_term, thread );
                ans = Sequences.delete_if( Symbols.symbol_function( $sym4$ASSERTION_WITHOUT_SEARCH_TERM ), ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                control_vars.$mapping_target$.rebind( _prev_bind_0_$3, thread );
              }
              doneP = Types.sublisp_null( ans );
              csome_list_var = csome_list_var.rest();
              search_term = csome_list_var.first();
            }
          }
          result = list_utilities.fast_delete_duplicates( ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          control_vars.$mapping_target$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.delete_if_not( $sym13$GAF_ASSERTION_, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    result = list_utilities.delete_if_not( $sym14$RELEVANT_PRED_, result, $sym15$GAF_PREDICATE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 5546L)
  public static SubLObject gather_overlap_index_for_asent(final SubLObject asent, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return gather_overlap_index( terms_for_overlap_index( asent ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 5681L)
  public static SubLObject gather_overlap_index_for_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym10$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const11$EverythingPSC, thread );
      result = gather_overlap_index( terms_for_overlap_index( mt ), UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 5930L)
  public static SubLObject num_overlap_index(final SubLObject terms, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return Sequences.length( gather_overlap_index( terms, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 6114L)
  public static SubLObject estimated_num_overlap_index(final SubLObject terms, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == terms )
    {
      return ZERO_INTEGER;
    }
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
      final SubLObject fully_indexed_terms = Sequences.remove_duplicates( list_utilities.remove_if_not( $sym12$FULLY_INDEXED_TERM_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
      if( NIL == fully_indexed_terms )
      {
        result = ZERO_INTEGER;
      }
      else
      {
        final SubLObject min_term = list_utilities.extremal( fully_indexed_terms, Symbols.symbol_function( $sym1$_ ), Symbols.symbol_function( $sym2$NUM_INDEX ) );
        final SubLObject min_index = kb_indexing.num_index( min_term );
        final SubLObject term_count = Sequences.length( fully_indexed_terms );
        if( min_index.numLE( $int16$1000 ) )
        {
          result = Numbers.round( Numbers.expt( min_index, Numbers.invert( term_count ) ), UNPROVIDED );
        }
        else
        {
          result = Numbers.round( Numbers.divide( min_index, term_count ), UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 7085L)
  public static SubLObject num_overlap_index_for_asent(final SubLObject asent, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject indexed_terms = terms_for_overlap_index( asent );
    return num_overlap_index( indexed_terms, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 7443L)
  public static SubLObject estimated_num_overlap_index_for_asent(final SubLObject asent, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return estimated_num_overlap_index_for_formula( asent, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 7657L)
  public static SubLObject estimated_num_overlap_index_for_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != variables.variable_p( mt ) )
    {
      return assertion_handles.assertion_count();
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym10$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const11$EverythingPSC, thread );
      result = estimated_num_overlap_index_for_formula( mt, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 7960L)
  public static SubLObject estimated_num_overlap_index_for_formula(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject gaf_arg_index_estimate = estimated_num_overlap_index_for_formula_using_gaf_arg_index( formula, mt );
    final SubLObject indexed_terms = terms_for_overlap_index( formula );
    final SubLObject overlap_index_estimate = estimated_num_overlap_index( indexed_terms, mt );
    if( NIL != subl_promotions.positive_integer_p( gaf_arg_index_estimate ) && gaf_arg_index_estimate.numL( overlap_index_estimate ) )
    {
      return gaf_arg_index_estimate;
    }
    return overlap_index_estimate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 8738L)
  public static SubLObject estimated_num_overlap_index_for_formula_using_gaf_arg_index(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.formula_arg0( formula );
    SubLObject arg_count = ZERO_INTEGER;
    SubLObject costs = NIL;
    if( NIL != forts.fort_p( predicate ) )
    {
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw17$IGNORE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          argnum = Numbers.add( argnum, ONE_INTEGER );
          if( NIL != forts.fort_p( arg ) )
          {
            arg_count = Numbers.add( arg_count, ONE_INTEGER );
            costs = ConsesLow.cons( kb_indexing.num_gaf_arg_index( arg, argnum, cycl_utilities.formula_arg0( formula ), UNPROVIDED ), costs );
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != costs )
    {
      return Numbers.round( Numbers.divide( Functions.apply( Symbols.symbol_function( $sym18$MIN ), costs ), arg_count ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 9210L)
  public static SubLObject terms_for_overlap_index(final SubLObject formula)
  {
    final SubLObject result = terms_for_overlap_index_internal( formula, UNPROVIDED );
    if( result.isCons() )
    {
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 9628L)
  public static SubLObject terms_for_overlap_index_internal(final SubLObject formula, SubLObject skip_possible_nart_methodP)
  {
    if( skip_possible_nart_methodP == UNPROVIDED )
    {
      skip_possible_nart_methodP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding( thread );
    try
    {
      czer_vars.$inside_quote$.bind( ( NIL != czer_vars.$inside_quote$.getDynamicValue( thread ) ) ? czer_vars.$inside_quote$.getDynamicValue( thread ) : cycl_grammar.fast_quote_term_p( formula ), thread );
      final SubLObject arg0_term = cycl_utilities.formula_arg0( formula );
      SubLObject terms = NIL;
      if( NIL != czer_utilities.some_canonicalizer_directive_assertions_somewhereP( arg0_term ) )
      {
        skip_possible_nart_methodP = T;
      }
      SubLObject cdolist_list_var;
      final SubLObject terms_$4 = cdolist_list_var = cycl_utilities.formula_terms( formula, $kw17$IGNORE );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != good_term_for_overlap_index_p( v_term ) )
        {
          terms = ConsesLow.cons( v_term, terms );
        }
        else if( NIL == czer_vars.$inside_quote$.getDynamicValue( thread ) && NIL != el_utilities.el_formula_p( v_term ) && NIL != czer_utilities.reifiable_functorP( cycl_utilities.formula_arg0( v_term ), UNPROVIDED )
            && !arg0_term.eql( $const19$termOfUnit ) && NIL == skip_possible_nart_methodP )
        {
          SubLObject matching_nart = NIL;
          SubLObject found_more_than_one_nartP = NIL;
          if( NIL != el_utilities.closedP( v_term, UNPROVIDED ) )
          {
            final SubLObject possible_nart = narts_high.nart_substitute( v_term );
            matching_nart = ( NIL != nart_handles.nart_p( possible_nart ) ) ? possible_nart : NIL;
          }
          else
          {
            final SubLObject l_index = kb_indexing.best_nat_lookup_index( v_term, NIL );
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_nli_extract_method( l_index );
            if( pcase_var.eql( $kw20$NART_ARG ) )
            {
              thread.resetMultipleValues();
              final SubLObject v_term_$5 = kb_mapping_macros.do_nli_vna_extract_keys( l_index );
              final SubLObject argnum = thread.secondMultipleValue();
              final SubLObject functor = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              if( NIL != argnum )
              {
                if( NIL != functor )
                {
                  if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term_$5, argnum, functor ) )
                  {
                    final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term_$5, argnum, functor );
                    SubLObject done_var = found_more_than_one_nartP;
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, NIL, NIL );
                          SubLObject done_var_$6 = found_more_than_one_nartP;
                          final SubLObject token_var_$7 = NIL;
                          while ( NIL == done_var_$6)
                          {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$7 );
                            final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( ass ) );
                            if( NIL != valid_$8 )
                            {
                              if( NIL == matching_nart )
                              {
                                matching_nart = assertions_high.gaf_arg1( ass );
                              }
                              else
                              {
                                found_more_than_one_nartP = T;
                              }
                            }
                            done_var_$6 = makeBoolean( NIL == valid_$8 || NIL != found_more_than_one_nartP );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                          }
                        }
                      }
                      done_var = makeBoolean( NIL == valid || NIL != found_more_than_one_nartP );
                    }
                  }
                }
                else if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term_$5, argnum, NIL ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term_$5, argnum, NIL );
                  SubLObject done_var = found_more_than_one_nartP;
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, NIL, NIL );
                        SubLObject done_var_$7 = found_more_than_one_nartP;
                        final SubLObject token_var_$8 = NIL;
                        while ( NIL == done_var_$7)
                        {
                          final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$8 );
                          final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( ass ) );
                          if( NIL != valid_$9 )
                          {
                            if( NIL == matching_nart )
                            {
                              matching_nart = assertions_high.gaf_arg1( ass );
                            }
                            else
                            {
                              found_more_than_one_nartP = T;
                            }
                          }
                          done_var_$7 = makeBoolean( NIL == valid_$9 || NIL != found_more_than_one_nartP );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values2 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                          }
                          Values.restoreValuesFromVector( _values2 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid || NIL != found_more_than_one_nartP );
                  }
                }
              }
              else if( NIL != functor )
              {
                if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term_$5, NIL, functor ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term_$5, NIL, functor );
                  SubLObject done_var = found_more_than_one_nartP;
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, NIL, NIL );
                        SubLObject done_var_$8 = found_more_than_one_nartP;
                        final SubLObject token_var_$9 = NIL;
                        while ( NIL == done_var_$8)
                        {
                          final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$9 );
                          final SubLObject valid_$10 = makeBoolean( !token_var_$9.eql( ass ) );
                          if( NIL != valid_$10 )
                          {
                            if( NIL == matching_nart )
                            {
                              matching_nart = assertions_high.gaf_arg1( ass );
                            }
                            else
                            {
                              found_more_than_one_nartP = T;
                            }
                          }
                          done_var_$8 = makeBoolean( NIL == valid_$10 || NIL != found_more_than_one_nartP );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values3 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                          }
                          Values.restoreValuesFromVector( _values3 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid || NIL != found_more_than_one_nartP );
                  }
                }
              }
              else if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term_$5, NIL, NIL ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term_$5, NIL, NIL );
                SubLObject done_var = found_more_than_one_nartP;
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, NIL, NIL );
                      SubLObject done_var_$9 = found_more_than_one_nartP;
                      final SubLObject token_var_$10 = NIL;
                      while ( NIL == done_var_$9)
                      {
                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$10 );
                        final SubLObject valid_$11 = makeBoolean( !token_var_$10.eql( ass ) );
                        if( NIL != valid_$11 )
                        {
                          if( NIL == matching_nart )
                          {
                            matching_nart = assertions_high.gaf_arg1( ass );
                          }
                          else
                          {
                            found_more_than_one_nartP = T;
                          }
                        }
                        done_var_$9 = makeBoolean( NIL == valid_$11 || NIL != found_more_than_one_nartP );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values4 = Values.getValuesAsVector();
                        if( NIL != final_index_iterator )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                        }
                        Values.restoreValuesFromVector( _values4 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid || NIL != found_more_than_one_nartP );
                }
              }
            }
            else if( pcase_var.eql( $kw22$FUNCTION_EXTENT ) )
            {
              if( NIL != kb_mapping_macros.do_function_extent_index_key_validator( kb_mapping_macros.do_nli_vfe_extract_key( l_index ) ) )
              {
                final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec( kb_mapping_macros.do_nli_vfe_extract_key( l_index ) );
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw21$GAF, NIL, NIL );
                  SubLObject done_var2 = found_more_than_one_nartP;
                  final SubLObject token_var2 = NIL;
                  while ( NIL == done_var2)
                  {
                    final SubLObject ass2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var2 );
                    final SubLObject valid2 = makeBoolean( !token_var2.eql( ass2 ) );
                    if( NIL != valid2 )
                    {
                      if( NIL == matching_nart )
                      {
                        matching_nart = assertions_high.gaf_arg1( ass2 );
                      }
                      else
                      {
                        found_more_than_one_nartP = T;
                      }
                    }
                    done_var2 = makeBoolean( NIL == valid2 || NIL != found_more_than_one_nartP );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values5 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values5 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
                  }
                }
              }
            }
            else if( pcase_var.eql( $kw23$OVERLAP ) )
            {
              SubLObject rest;
              SubLObject ass3;
              for( rest = NIL, rest = gather_overlap_index( kb_mapping_macros.do_nli_vo_extract_key( l_index ), UNPROVIDED ); NIL == found_more_than_one_nartP && NIL != rest; rest = rest.rest() )
              {
                ass3 = rest.first();
                if( NIL == matching_nart )
                {
                  matching_nart = assertions_high.gaf_arg1( ass3 );
                }
                else
                {
                  found_more_than_one_nartP = T;
                }
              }
            }
            else
            {
              kb_mapping_macros.do_nli_method_error( l_index, method );
            }
          }
          if( NIL != found_more_than_one_nartP )
          {
            if( NIL != $indexing_debugP$.getDynamicValue( thread ) )
            {
              Errors.warn( $str24$Too_many_matching_NARTs_to_use__S, v_term );
            }
          }
          else
          {
            if( NIL != $overlap_index_unreified_reifiable_nat_uses_unfindable_optimizationP$.getDynamicValue( thread ) && NIL == matching_nart && NIL != el_utilities.closedP( v_term, UNPROVIDED ) )
            {
              return $kw26$NONE;
            }
            if( NIL == matching_nart )
            {
              if( NIL != $indexing_debugP$.getDynamicValue( thread ) )
              {
                Errors.warn( $str27$Could_not_use__S_in_overlap_index, v_term );
              }
            }
            else
            {
              final SubLObject item_var = matching_nart;
              if( NIL == conses_high.member( item_var, terms, $sym28$KBEQ, Symbols.symbol_function( IDENTITY ) ) )
              {
                terms = ConsesLow.cons( item_var, terms );
              }
            }
          }
        }
        else
        {
          final SubLObject more_terms = terms_for_overlap_index_internal( v_term, skip_possible_nart_methodP );
          if( more_terms == $kw26$NONE )
          {
            return $kw26$NONE;
          }
          terms = ConsesLow.append( terms, more_terms );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      return terms;
    }
    finally
    {
      czer_vars.$inside_quote$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 12284L)
  public static SubLObject good_term_for_overlap_index_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != kb_indexing_datastructures.indexed_term_p( v_object ) || ( !v_object.isCons() && NIL != cycl_grammar.subl_atomic_term_p( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 13122L)
  public static SubLObject lookup_should_use_index_overlapP(final SubLObject formula, SubLObject best_count)
  {
    if( best_count == UNPROVIDED )
    {
      best_count = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $index_overlap_enabledP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( NIL != best_count && best_count.numL( $lookup_overlap_watermark$.getGlobalValue() ) )
    {
      return NIL;
    }
    if( NIL != too_few_terms_for_index_overlapP( formula ) )
    {
      return NIL;
    }
    if( NIL != best_count && NIL != mt_relevance_macros.all_mts_are_relevantP() )
    {
      thread.resetMultipleValues();
      final SubLObject fort = kb_accessors.most_specialized_fort( formula, UNPROVIDED );
      final SubLObject best_overlap_count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Numbers.numL( Numbers.multiply( best_overlap_count, $overlap_index_expense_multiplier$.getGlobalValue() ), best_count );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 14610L)
  public static SubLObject too_few_terms_for_index_overlapP(final SubLObject formula)
  {
    if( NIL != el_utilities.contains_subformula_p( formula ) )
    {
      return NIL;
    }
    if( NIL == kb_indexing_datastructures.indexed_term_p( cycl_utilities.formula_operator( formula ) ) )
    {
      return T;
    }
    SubLObject num_indexed_args = ZERO_INTEGER;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw17$IGNORE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != good_term_for_overlap_index_p( arg ) )
      {
        num_indexed_args = Numbers.add( num_indexed_args, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Numbers.numLE( num_indexed_args, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 15228L)
  public static SubLObject overlap_greatest_benefit_nart(SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject best_benefit_ratio = ZERO_INTEGER;
    SubLObject best_benefit_nart = NIL;
    final SubLObject idx = nart_handles.do_narts_table();
    final SubLObject mess = $str30$mapping_Cyc_NARTs;
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
        final SubLObject idx_$23 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$23, $kw32$SKIP ) )
        {
          final SubLObject idx_$24 = idx_$23;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$24, $kw32$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$24 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject nart;
            SubLObject benefit_nart;
            SubLObject benefit_ratio;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              nart = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( nart ) || NIL == id_index.id_index_skip_tombstones_p( $kw32$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( nart ) )
                {
                  nart = $kw32$SKIP;
                }
                thread.resetMultipleValues();
                benefit_nart = overlap_benefit_ratio( nart, verboseP );
                benefit_ratio = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != benefit_nart && NIL != benefit_ratio && benefit_ratio.numG( best_benefit_ratio ) )
                {
                  best_benefit_ratio = benefit_ratio;
                  best_benefit_nart = benefit_nart;
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$25 = idx_$23;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$25 ) || NIL == id_index.id_index_skip_tombstones_p( $kw32$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$25 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$25 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$25 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw32$SKIP ) ) ? NIL : $kw32$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject nart2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw32$SKIP ) || NIL == id_index.id_index_tombstone_p( nart2 ) )
              {
                thread.resetMultipleValues();
                final SubLObject benefit_nart2 = overlap_benefit_ratio( nart2, verboseP );
                final SubLObject benefit_ratio2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != benefit_nart2 && NIL != benefit_ratio2 && benefit_ratio2.numG( best_benefit_ratio ) )
                {
                  best_benefit_ratio = benefit_ratio2;
                  best_benefit_nart = benefit_nart2;
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
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
    return Values.values( best_benefit_nart, best_benefit_ratio );
  }

  @SubLTranslatedFile.SubL(source = "cycl/virtual-indexing.lisp", position = 15813L)
  public static SubLObject overlap_benefit_ratio(final SubLObject nart, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLObject nart_hl_formula = narts_high.nart_hl_formula( nart );
    final SubLObject index = kb_indexing.best_nat_lookup_index( nart_hl_formula, UNPROVIDED );
    if( $kw23$OVERLAP == conses_high.getf( index, $kw33$INDEX_TYPE, UNPROVIDED ) && NIL != narts_high.find_nart( nart_hl_formula ) )
    {
      final SubLObject best_count = kb_indexing.num_best_nat_lookup_index( nart_hl_formula, $list34 );
      final SubLObject best_overlap_count = conses_high.second( Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( kb_accessors.most_specialized_fort( nart_hl_formula, UNPROVIDED ) ) ) );
      if( best_count.isNumber() && best_overlap_count.isNumber() )
      {
        final SubLObject benefit_ratio = Numbers.divide( best_count, best_overlap_count );
        if( NIL != verboseP )
        {
          PrintLow.format( T, $str35$_s_vs___s___s__s____, new SubLObject[] { best_overlap_count, best_count, index, nart
          } );
        }
        return Values.values( nart, benefit_ratio );
      }
    }
    return Values.values( NIL, NIL );
  }

  public static SubLObject declare_virtual_indexing_file()
  {
    SubLFiles.declareFunction( me, "assertions_mentioning_terms", "ASSERTIONS-MENTIONING-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "assertions_mentioning_terms_in_mt", "ASSERTIONS-MENTIONING-TERMS-IN-MT", 2, 1, false );
    SubLFiles.declareFunction( me, "assertions_mentioning_terms_in_all_mts", "ASSERTIONS-MENTIONING-TERMS-IN-ALL-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "amt", "AMT", 1, 2, false );
    SubLFiles.declareFunction( me, "gather_overlap_index", "GATHER-OVERLAP-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_overlap_index_for_asent", "GATHER-OVERLAP-INDEX-FOR-ASENT", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_overlap_index_for_mt", "GATHER-OVERLAP-INDEX-FOR-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "num_overlap_index", "NUM-OVERLAP-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "estimated_num_overlap_index", "ESTIMATED-NUM-OVERLAP-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "num_overlap_index_for_asent", "NUM-OVERLAP-INDEX-FOR-ASENT", 1, 1, false );
    SubLFiles.declareFunction( me, "estimated_num_overlap_index_for_asent", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-ASENT", 1, 1, false );
    SubLFiles.declareFunction( me, "estimated_num_overlap_index_for_mt", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "estimated_num_overlap_index_for_formula", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "estimated_num_overlap_index_for_formula_using_gaf_arg_index", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-FORMULA-USING-GAF-ARG-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "terms_for_overlap_index", "TERMS-FOR-OVERLAP-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "terms_for_overlap_index_internal", "TERMS-FOR-OVERLAP-INDEX-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "good_term_for_overlap_index_p", "GOOD-TERM-FOR-OVERLAP-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lookup_should_use_index_overlapP", "LOOKUP-SHOULD-USE-INDEX-OVERLAP?", 1, 1, false );
    SubLFiles.declareFunction( me, "too_few_terms_for_index_overlapP", "TOO-FEW-TERMS-FOR-INDEX-OVERLAP?", 1, 0, false );
    SubLFiles.declareFunction( me, "overlap_greatest_benefit_nart", "OVERLAP-GREATEST-BENEFIT-NART", 0, 1, false );
    SubLFiles.declareFunction( me, "overlap_benefit_ratio", "OVERLAP-BENEFIT-RATIO", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_virtual_indexing_file()
  {
    $indexing_debugP$ = SubLFiles.defparameter( "*INDEXING-DEBUG?*", NIL );
    $index_overlap_enabledP$ = SubLFiles.defparameter( "*INDEX-OVERLAP-ENABLED?*", T );
    $overlap_index_unreified_reifiable_nat_uses_unfindable_optimizationP$ = SubLFiles.defparameter( "*OVERLAP-INDEX-UNREIFIED-REIFIABLE-NAT-USES-UNFINDABLE-OPTIMIZATION?*", T );
    $lookup_overlap_watermark$ = SubLFiles.deflexical( "*LOOKUP-OVERLAP-WATERMARK*", $int29$25 );
    $overlap_index_expense_multiplier$ = SubLFiles.deflexical( "*OVERLAP-INDEX-EXPENSE-MULTIPLIER*", SEVEN_INTEGER );
    return NIL;
  }

  public static SubLObject setup_virtual_indexing_file()
  {
    utilities_macros.register_cyc_api_function( $sym5$ASSERTIONS_MENTIONING_TERMS, $list6, $str7$Return_a_list_of_assertions_that_, NIL, $list8 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_virtual_indexing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_virtual_indexing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_virtual_indexing_file();
  }
  static
  {
    me = new virtual_indexing();
    $indexing_debugP$ = null;
    $index_overlap_enabledP$ = null;
    $overlap_index_unreified_reifiable_nat_uses_unfindable_optimizationP$ = null;
    $lookup_overlap_watermark$ = null;
    $overlap_index_expense_multiplier$ = null;
    $sym0$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym1$_ = makeSymbol( "<" );
    $sym2$NUM_INDEX = makeSymbol( "NUM-INDEX" );
    $sym3$ASSERTION_WITH_SEARCH_TERM = makeSymbol( "ASSERTION-WITH-SEARCH-TERM" );
    $sym4$ASSERTION_WITHOUT_SEARCH_TERM = makeSymbol( "ASSERTION-WITHOUT-SEARCH-TERM" );
    $sym5$ASSERTIONS_MENTIONING_TERMS = makeSymbol( "ASSERTIONS-MENTIONING-TERMS" );
    $list6 = ConsesLow.list( makeSymbol( "TERM-LIST" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INCLUDE-META-ASSERTIONS?" ) );
    $str7$Return_a_list_of_assertions_that_ = makeString( "Return a list of assertions that mention every term in TERM-LIST." );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "ASSERTION-P" ) ) );
    $sym9$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym10$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const11$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym12$FULLY_INDEXED_TERM_P = makeSymbol( "FULLY-INDEXED-TERM-P" );
    $sym13$GAF_ASSERTION_ = makeSymbol( "GAF-ASSERTION?" );
    $sym14$RELEVANT_PRED_ = makeSymbol( "RELEVANT-PRED?" );
    $sym15$GAF_PREDICATE = makeSymbol( "GAF-PREDICATE" );
    $int16$1000 = makeInteger( 1000 );
    $kw17$IGNORE = makeKeyword( "IGNORE" );
    $sym18$MIN = makeSymbol( "MIN" );
    $const19$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $kw20$NART_ARG = makeKeyword( "NART-ARG" );
    $kw21$GAF = makeKeyword( "GAF" );
    $kw22$FUNCTION_EXTENT = makeKeyword( "FUNCTION-EXTENT" );
    $kw23$OVERLAP = makeKeyword( "OVERLAP" );
    $str24$Too_many_matching_NARTs_to_use__S = makeString( "Too many matching NARTs to use ~S in overlap index" );
    $sym25$_EXIT = makeSymbol( "%EXIT" );
    $kw26$NONE = makeKeyword( "NONE" );
    $str27$Could_not_use__S_in_overlap_index = makeString( "Could not use ~S in overlap index" );
    $sym28$KBEQ = makeSymbol( "KBEQ" );
    $int29$25 = makeInteger( 25 );
    $str30$mapping_Cyc_NARTs = makeString( "mapping Cyc NARTs" );
    $sym31$STRINGP = makeSymbol( "STRINGP" );
    $kw32$SKIP = makeKeyword( "SKIP" );
    $kw33$INDEX_TYPE = makeKeyword( "INDEX-TYPE" );
    $list34 = ConsesLow.list( makeKeyword( "FUNCTION-EXTENT" ), makeKeyword( "NART-ARG" ) );
    $str35$_s_vs___s___s__s____ = makeString( "~s vs. ~s: ~s ~s~%~%" );
  }
}
/*
 * 
 * Total time: 738 ms
 * 
 */