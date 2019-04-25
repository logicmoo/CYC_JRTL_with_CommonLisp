package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class function_terms
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.function_terms";
  public static final String myFingerPrint = "cc631df5d6c9938f5f267fd10b971d30c60d95aa8cc5e0ffe1a8dd50f990e330";
  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2172L)
  public static SubLSymbol $term_functional_complexity_internal_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4213L)
  public static SubLSymbol $term_relational_complexity_internal_method_table$;
  private static final SubLSymbol $sym0$TERM_OF_UNIT;
  private static final SubLSymbol $sym1$NART_P;
  private static final SubLSymbol $sym2$RELEVANT_MT_IS_EQ;
  private static final SubLObject $const3$termOfUnit;
  private static final SubLSymbol $kw4$GAF;
  private static final SubLSymbol $sym5$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const6$EverythingPSC;
  private static final SubLInteger $int7$256;
  private static final SubLSymbol $sym8$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD;
  private static final SubLSymbol $sym9$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_NART_METHOD;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONS_METHOD;
  private static final SubLSymbol $sym12$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD;
  private static final SubLSymbol $sym13$TERM_RELATIONAL_COMPLEXITY_INTERNAL_NART_METHOD;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONS_METHOD;
  private static final SubLSymbol $sym16$FORT_P;
  private static final SubLSymbol $sym17$INTEGERP;

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 377L)
  public static SubLObject term_of_unit(final SubLObject nart)
  {
    if( NIL != nart_handles.nart_p( nart ) )
    {
      return narts_high.nart_hl_formula( nart );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 478L)
  public static SubLObject term_of_unit_assertion(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != nart_handles.nart_p( nart ) : nart;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym2$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt_vars.$tou_mt$.getGlobalValue(), thread );
      final SubLObject pred_var = $const3$termOfUnit;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( nart, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( nart, ONE_INTEGER, pred_var );
        SubLObject done_var = ans;
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw4$GAF, NIL, NIL );
              SubLObject done_var_$1 = ans;
              final SubLObject token_var_$2 = NIL;
              while ( NIL == done_var_$1)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
                if( NIL != valid_$3 )
                {
                  ans = assertion;
                }
                done_var_$1 = makeBoolean( NIL == valid_$3 || NIL != ans );
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
          done_var = makeBoolean( NIL == valid || NIL != ans );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 844L)
  public static SubLObject term_of_unit_assertions(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != nart_handles.nart_p( nart ) : nart;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym2$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt_vars.$tou_mt$.getGlobalValue(), thread );
      final SubLObject pred_var = $const3$termOfUnit;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( nart, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( nart, ONE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw4$GAF, NIL, NIL );
              SubLObject done_var_$5 = NIL;
              final SubLObject token_var_$6 = NIL;
              while ( NIL == done_var_$5)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( assertion ) );
                if( NIL != valid_$7 )
                {
                  ans = ConsesLow.cons( assertion, ans );
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
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 1175L)
  public static SubLObject nart_hl_formula_via_term_of_unit_assertion(final SubLObject nart)
  {
    final SubLObject tou_ass = term_of_unit_assertion( nart );
    if( NIL != tou_ass )
    {
      return assertions_high.gaf_arg2( tou_ass );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 1344L)
  public static SubLObject term_of_unit_assertion_p(final SubLObject v_object)
  {
    return assertion_utilities.gaf_assertion_with_pred_p( v_object, $const3$termOfUnit );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 1451L)
  public static SubLObject tou_assertionP(final SubLObject assertion)
  {
    return term_of_unit_assertion_p( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 1546L)
  public static SubLObject term_functional_complexity(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym5$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const6$EverythingPSC, thread );
      ans = term_functional_complexity_internal( v_object );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 1862L)
  public static SubLObject within_term_functional_complexity_cutoffP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == control_vars.$term_functional_complexity_cutoff$.getDynamicValue( thread ) )
    {
      return T;
    }
    return Numbers.numLE( term_functional_complexity( v_term ), control_vars.$term_functional_complexity_cutoff$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2172L)
  public static SubLObject term_functional_complexity_internal(final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( v_object, $term_functional_complexity_internal_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2263L)
  public static SubLObject term_functional_complexity_internal_constant_method(final SubLObject v_object)
  {
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2364L)
  public static SubLObject term_functional_complexity_internal_nart_method(final SubLObject v_object)
  {
    return term_functional_complexity_nart( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2482L)
  public static SubLObject term_functional_complexity_nart(final SubLObject nart)
  {
    return term_functional_complexity( narts_high.nart_hl_formula( nart ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2599L)
  public static SubLObject term_functional_complexity_internal_cons_method(final SubLObject v_object)
  {
    SubLObject function = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list10 );
    function = v_object.first();
    final SubLObject current = args = v_object.rest();
    if( NIL != forts.fort_p( function ) && NIL == fort_types_interface.non_predicate_functionP( function ) )
    {
      return ZERO_INTEGER;
    }
    SubLObject arg_max_complexity = term_functional_complexity_internal( function );
    SubLObject rest;
    SubLObject arg;
    SubLObject arg_complexity;
    for( rest = NIL, rest = args; !rest.isAtom(); rest = rest.rest() )
    {
      arg = rest.first();
      arg_complexity = term_functional_complexity_internal( arg );
      arg_max_complexity = Numbers.max( arg_max_complexity, arg_complexity );
    }
    return Numbers.add( arg_max_complexity, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 3250L)
  public static SubLObject term_relational_complexity(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym5$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const6$EverythingPSC, thread );
      ans = term_relational_complexity_internal( v_object );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 3564L)
  public static SubLObject within_term_relational_complexity_cutoffP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == control_vars.$term_relational_complexity_cutoff$.getDynamicValue( thread ) )
    {
      return T;
    }
    return Numbers.numLE( term_relational_complexity( v_term ), control_vars.$term_relational_complexity_cutoff$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 3789L)
  public static SubLObject relational_complexity_L(final SubLObject obj1, final SubLObject obj2)
  {
    if( obj2.isAtom() )
    {
      return NIL;
    }
    if( NIL == obj1 )
    {
      return NIL;
    }
    if( obj1.isAtom() )
    {
      return T;
    }
    final SubLObject depth1 = term_relational_complexity( obj1 );
    final SubLObject depth2 = term_relational_complexity( obj2 );
    if( depth1.numL( depth2 ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4213L)
  public static SubLObject term_relational_complexity_internal(final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( v_object, $term_relational_complexity_internal_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4304L)
  public static SubLObject term_relational_complexity_internal_constant_method(final SubLObject v_object)
  {
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4405L)
  public static SubLObject term_relational_complexity_internal_nart_method(final SubLObject v_object)
  {
    return term_relational_complexity_nart( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4523L)
  public static SubLObject term_relational_complexity_nart(final SubLObject nart)
  {
    return term_relational_complexity( narts_high.nart_hl_formula( nart ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4640L)
  public static SubLObject term_relational_complexity_internal_cons_method(final SubLObject v_object)
  {
    SubLObject relation = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list14 );
    relation = v_object.first();
    final SubLObject current = args = v_object.rest();
    SubLObject arg_max_complexity = term_relational_complexity_internal( relation );
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject arg_complexity = term_relational_complexity_internal( arg );
      arg_max_complexity = Numbers.max( arg_max_complexity, arg_complexity );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Numbers.add( arg_max_complexity, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 5042L)
  public static SubLObject nat_formula_p(final SubLObject v_object)
  {
    return el_utilities.possibly_naut_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 5267L)
  public static SubLObject narts_of_function(final SubLObject function)
  {
    assert NIL != forts.fort_p( function ) : function;
    SubLObject result = NIL;
    if( NIL != kb_mapping_macros.do_function_extent_index_key_validator( function ) )
    {
      final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec( function );
      SubLObject final_index_iterator = NIL;
      try
      {
        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw4$GAF, NIL, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject tou = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( tou ) );
          if( NIL != valid )
          {
            final SubLObject nart = assertions_high.gaf_arg1( tou );
            result = ConsesLow.cons( nart, result );
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
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 5532L)
  public static SubLObject narts_of_term(final SubLObject function, final SubLObject v_term, SubLObject arg)
  {
    if( arg == UNPROVIDED )
    {
      arg = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( function ) : function;
    assert NIL != forts.fort_p( v_term ) : v_term;
    assert NIL != Types.integerp( arg ) : arg;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym2$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt_vars.$tou_mt$.getGlobalValue(), thread );
      if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, arg, function ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, arg, function );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw4$GAF, NIL, NIL );
              SubLObject done_var_$9 = NIL;
              final SubLObject token_var_$10 = NIL;
              while ( NIL == done_var_$9)
              {
                final SubLObject tou_ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$10 );
                final SubLObject valid_$11 = makeBoolean( !token_var_$10.eql( tou_ass ) );
                if( NIL != valid_$11 )
                {
                  final SubLObject nart = assertions_high.gaf_arg1( tou_ass );
                  result = ConsesLow.cons( nart, result );
                }
                done_var_$9 = makeBoolean( NIL == valid_$11 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
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
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 5966L)
  public static SubLObject unnatify_terms(final SubLObject terms)
  {
    SubLObject result = NIL;
    SubLObject v_const = NIL;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.nautP( v_term, UNPROVIDED ) )
      {
        v_const = narts_high.find_nart( v_term );
        if( NIL != v_const )
        {
          result = ConsesLow.cons( v_const, result );
        }
      }
      else
      {
        result = ConsesLow.cons( v_term, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 6285L)
  public static SubLObject naut_to_nart(final SubLObject obj)
  {
    if( NIL != term.closed_nautP( obj, UNPROVIDED ) )
    {
      final SubLObject nart = narts_high.find_nart( obj );
      return ( NIL != nart ) ? nart : obj;
    }
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 6523L)
  public static SubLObject nart_to_naut(final SubLObject obj)
  {
    if( NIL != nart_handles.nart_p( obj ) )
    {
      return narts_high.nart_el_formula( obj );
    }
    return obj;
  }

  public static SubLObject declare_function_terms_file()
  {
    SubLFiles.declareFunction( me, "term_of_unit", "TERM-OF-UNIT", 1, 0, false );
    SubLFiles.declareFunction( me, "term_of_unit_assertion", "TERM-OF-UNIT-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "term_of_unit_assertions", "TERM-OF-UNIT-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_hl_formula_via_term_of_unit_assertion", "NART-HL-FORMULA-VIA-TERM-OF-UNIT-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "term_of_unit_assertion_p", "TERM-OF-UNIT-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tou_assertionP", "TOU-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_functional_complexity", "TERM-FUNCTIONAL-COMPLEXITY", 1, 0, false );
    SubLFiles.declareFunction( me, "within_term_functional_complexity_cutoffP", "WITHIN-TERM-FUNCTIONAL-COMPLEXITY-CUTOFF?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_functional_complexity_internal", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "term_functional_complexity_internal_constant_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_functional_complexity_internal_nart_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-NART-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_functional_complexity_nart", "TERM-FUNCTIONAL-COMPLEXITY-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "term_functional_complexity_internal_cons_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_relational_complexity", "TERM-RELATIONAL-COMPLEXITY", 1, 0, false );
    SubLFiles.declareFunction( me, "within_term_relational_complexity_cutoffP", "WITHIN-TERM-RELATIONAL-COMPLEXITY-CUTOFF?", 1, 0, false );
    SubLFiles.declareFunction( me, "relational_complexity_L", "RELATIONAL-COMPLEXITY-<", 2, 0, false );
    SubLFiles.declareFunction( me, "term_relational_complexity_internal", "TERM-RELATIONAL-COMPLEXITY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "term_relational_complexity_internal_constant_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_relational_complexity_internal_nart_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-NART-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_relational_complexity_nart", "TERM-RELATIONAL-COMPLEXITY-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "term_relational_complexity_internal_cons_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nat_formula_p", "NAT-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "narts_of_function", "NARTS-OF-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "narts_of_term", "NARTS-OF-TERM", 2, 1, false );
    SubLFiles.declareFunction( me, "unnatify_terms", "UNNATIFY-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "naut_to_nart", "NAUT-TO-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_to_naut", "NART-TO-NAUT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_function_terms_file()
  {
    $term_functional_complexity_internal_method_table$ = SubLFiles.deflexical( "*TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-METHOD-TABLE*", Vectors.make_vector( $int7$256, NIL ) );
    $term_relational_complexity_internal_method_table$ = SubLFiles.deflexical( "*TERM-RELATIONAL-COMPLEXITY-INTERNAL-METHOD-TABLE*", Vectors.make_vector( $int7$256, NIL ) );
    return NIL;
  }

  public static SubLObject setup_function_terms_file()
  {
    access_macros.define_obsolete_register( $sym0$TERM_OF_UNIT, NIL );
    Structures.register_method( $term_functional_complexity_internal_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function(
        $sym8$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD ) );
    Structures.register_method( $term_functional_complexity_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function(
        $sym9$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_NART_METHOD ) );
    Structures.register_method( $term_functional_complexity_internal_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function( $sym11$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONS_METHOD ) );
    Structures.register_method( $term_relational_complexity_internal_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function(
        $sym12$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD ) );
    Structures.register_method( $term_relational_complexity_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function(
        $sym13$TERM_RELATIONAL_COMPLEXITY_INTERNAL_NART_METHOD ) );
    Structures.register_method( $term_relational_complexity_internal_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function( $sym15$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONS_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_function_terms_file();
  }

  @Override
  public void initializeVariables()
  {
    init_function_terms_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_function_terms_file();
  }
  static
  {
    me = new function_terms();
    $term_functional_complexity_internal_method_table$ = null;
    $term_relational_complexity_internal_method_table$ = null;
    $sym0$TERM_OF_UNIT = makeSymbol( "TERM-OF-UNIT" );
    $sym1$NART_P = makeSymbol( "NART-P" );
    $sym2$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $const3$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $kw4$GAF = makeKeyword( "GAF" );
    $sym5$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const6$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $int7$256 = makeInteger( 256 );
    $sym8$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD = makeSymbol( "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD" );
    $sym9$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_NART_METHOD = makeSymbol( "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-NART-METHOD" );
    $list10 = ConsesLow.cons( makeSymbol( "FUNCTION" ), makeSymbol( "ARGS" ) );
    $sym11$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONS_METHOD = makeSymbol( "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONS-METHOD" );
    $sym12$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD = makeSymbol( "TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD" );
    $sym13$TERM_RELATIONAL_COMPLEXITY_INTERNAL_NART_METHOD = makeSymbol( "TERM-RELATIONAL-COMPLEXITY-INTERNAL-NART-METHOD" );
    $list14 = ConsesLow.cons( makeSymbol( "RELATION" ), makeSymbol( "ARGS" ) );
    $sym15$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONS_METHOD = makeSymbol( "TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONS-METHOD" );
    $sym16$FORT_P = makeSymbol( "FORT-P" );
    $sym17$INTEGERP = makeSymbol( "INTEGERP" );
  }
}
/*
 * 
 * Total time: 223 ms
 * 
 */