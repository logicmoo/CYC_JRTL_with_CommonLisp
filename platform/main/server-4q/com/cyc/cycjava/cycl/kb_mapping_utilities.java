package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_mapping_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_mapping_utilities";
  public static final String myFingerPrint = "a23968c0642ea6c612fd92deccc9090219a0e1b8d9d695003bcaf830fa877712";
  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 35312L)
  private static SubLSymbol $use_optimized_pred_arg_values_fixed_arityP$;
  private static final SubLSymbol $kw0$TRUE;
  private static final SubLSymbol $sym1$INDEXED_TERM_P;
  private static final SubLSymbol $sym2$FORT_P;
  private static final SubLSymbol $sym3$INTEGERP;
  private static final SubLSymbol $sym4$TRUTH_P;
  private static final SubLSymbol $kw5$GAF;
  private static final SubLSymbol $sym6$SOME_PRED_VALUE;
  private static final SubLList $list7;
  private static final SubLString $str8$Find_the_first_gaf_assertion_such;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$HLMT_P;
  private static final SubLSymbol $sym12$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $sym13$SOME_PRED_VALUE_IN_MT;
  private static final SubLList $list14;
  private static final SubLString $str15$Find_the_first_gaf_assertion_such;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$LISTP;
  private static final SubLSymbol $sym18$RELEVANT_MT_IS_IN_LIST;
  private static final SubLSymbol $sym19$SOME_PRED_VALUE_IN_MTS;
  private static final SubLList $list20;
  private static final SubLString $str21$Find_the_first_gaf_assertion_such;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const24$EverythingPSC;
  private static final SubLSymbol $sym25$SOME_PRED_VALUE_IN_ANY_MT;
  private static final SubLString $str26$Find_the_first_gaf_assertion_such;
  private static final SubLSymbol $sym27$SOME_PRED_VALUE_IN_RELEVANT_MTS;
  private static final SubLList $list28;
  private static final SubLString $str29$If_MT_is_NIL__behaves_like_SOME_P;
  private static final SubLSymbol $sym30$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym31$FPRED_VALUE;
  private static final SubLList $list32;
  private static final SubLString $str33$Find_the_first_gaf_assertion_such;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$FPRED_VALUE_IN_MT;
  private static final SubLList $list37;
  private static final SubLString $str38$Find_the_first_gaf_assertion_such;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$FPRED_VALUE_IN_MTS;
  private static final SubLList $list41;
  private static final SubLString $str42$Find_the_first_gaf_assertion_such;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$FPRED_VALUE_IN_ANY_MT;
  private static final SubLString $str45$Find_the_first_gaf_assertion_such;
  private static final SubLSymbol $sym46$FPRED_VALUE_IN_RELEVANT_MTS;
  private static final SubLList $list47;
  private static final SubLString $str48$If_MT_is_NIL__behaves_like_FPRED_;
  private static final SubLSymbol $sym49$PRED_VALUES;
  private static final SubLString $str50$Find_all_gaf_assertions_such_that;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$PRED_VALUES_IN_MT;
  private static final SubLString $str53$Find_all_gaf_assertions_such_that;
  private static final SubLSymbol $sym54$PRED_VALUES_IN_MTS;
  private static final SubLString $str55$Find_all_gaf_assertions_such_that;
  private static final SubLSymbol $sym56$PRED_VALUES_IN_ANY_MT;
  private static final SubLString $str57$Find_all_gaf_assertions_such_that;
  private static final SubLSymbol $sym58$PRED_VALUES_IN_RELEVANT_MTS;
  private static final SubLString $str59$If_MT_is_NIL__behaves_like_PRED_V;
  private static final SubLSymbol $sym60$PRED_REFS;
  private static final SubLList $list61;
  private static final SubLString $str62$Find_all_gaf_assertions_such_that;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$PRED_REFS_IN_MT;
  private static final SubLList $list65;
  private static final SubLString $str66$Find_all_gaf_assertions_such_that;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$PRED_REFS_IN_MTS;
  private static final SubLList $list69;
  private static final SubLString $str70$Find_all_gaf_assertions_such_that;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$PRED_REFS_IN_ANY_MT;
  private static final SubLString $str73$Find_all_gaf_assertions_such_that;
  private static final SubLSymbol $sym74$PRED_REFS_IN_RELEVANT_MTS;
  private static final SubLList $list75;
  private static final SubLString $str76$If_MT_is_NIL__behaves_like_PRED_R;
  private static final SubLSymbol $sym77$HL_TERM_P;
  private static final SubLSymbol $sym78$PRED_U_V_HOLDS;
  private static final SubLList $list79;
  private static final SubLString $str80$Find_the_first_gaf_assertion_such;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$PRED_U_V_HOLDS_IN_MT;
  private static final SubLList $list83;
  private static final SubLString $str84$Find_the_first_gaf_assertion_such;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$PRED_U_V_HOLDS_IN_MTS;
  private static final SubLList $list87;
  private static final SubLString $str88$Find_the_first_gaf_assertion_such;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$PRED_U_V_HOLDS_IN_ANY_MT;
  private static final SubLString $str91$Find_the_first_gaf_assertion_such;
  private static final SubLSymbol $sym92$PRED_U_V_HOLDS_IN_RELEVANT_MTS;
  private static final SubLList $list93;
  private static final SubLString $str94$If_MT_is_NIL__behaves_like_PRED_U;
  private static final SubLSymbol $sym95$CONSP;
  private static final SubLSymbol $kw96$GAF_ARG;
  private static final SubLSymbol $kw97$PREDICATE_EXTENT;
  private static final SubLSymbol $kw98$OVERLAP;
  private static final SubLString $str99$_S_is_not_a_valid_arg_position_li;
  private static final SubLSymbol $sym100$PRED_VALUE_TUPLES;
  private static final SubLList $list101;
  private static final SubLString $str102$Find_all_gaf_assertions_such_that;
  private static final SubLList $list103;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$PRED_VALUE_TUPLES_IN_MT;
  private static final SubLList $list106;
  private static final SubLString $str107$Find_all_gaf_assertions_such_that;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$PRED_VALUE_TUPLES_IN_MTS;
  private static final SubLList $list110;
  private static final SubLString $str111$Find_all_gaf_assertions_such_that;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$PRED_VALUE_TUPLES_IN_ANY_MT;
  private static final SubLString $str114$Find_all_gaf_assertions_such_that;
  private static final SubLSymbol $sym115$PRED_VALUE_TUPLES_IN_RELEVANT_MTS;
  private static final SubLList $list116;
  private static final SubLString $str117$If_MT_is_NIL__behaves_like_PRED_V;
  private static final SubLSymbol $sym118$_EXIT;

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 1393L)
  public static SubLObject some_pred_value(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, index_arg, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, index_arg, pred );
      SubLObject done_var = v_answer;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$1 = v_answer;
            final SubLObject token_var_$2 = NIL;
            while ( NIL == done_var_$1)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
              final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
              if( NIL != valid_$3 )
              {
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                v_answer = T;
              }
              done_var_$1 = makeBoolean( NIL == valid_$3 || NIL != v_answer );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != v_answer );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 2263L)
  public static SubLObject some_pred_value_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( mt, $sym11$HLMT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      v_answer = some_pred_value( v_term, pred, index_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 2913L)
  public static SubLObject some_pred_value_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( mts, $sym17$LISTP );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym18$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      v_answer = some_pred_value( v_term, pred, index_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 3592L)
  public static SubLObject some_pred_value_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = some_pred_value( v_term, pred, index_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 4243L)
  public static SubLObject some_pred_value_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = some_pred_value( v_term, pred, index_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 4692L)
  public static SubLObject some_pred_value_if(final SubLObject v_term, final SubLObject pred, final SubLObject test, SubLObject index_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    assert NIL != forts.fort_p( pred ) : pred;
    assert NIL != Types.function_spec_p( test ) : test;
    assert NIL != Types.integerp( index_arg ) : index_arg;
    assert NIL != enumeration_types.truth_p( truth ) : truth;
    SubLObject v_answer = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, index_arg, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, index_arg, pred );
      SubLObject done_var = v_answer;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$4 = v_answer;
            final SubLObject token_var_$5 = NIL;
            while ( NIL == done_var_$4)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
              final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( assertion ) );
              if( NIL != valid_$6 && NIL != Functions.funcall( test, assertion ) )
              {
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                v_answer = T;
              }
              done_var_$4 = makeBoolean( NIL == valid_$6 || NIL != v_answer );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != v_answer );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 5752L)
  public static SubLObject fpred_value_gaf(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth)
  {
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, index_argnum, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, index_argnum, pred );
      SubLObject done_var = v_answer;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$7 = v_answer;
            final SubLObject token_var_$8 = NIL;
            while ( NIL == done_var_$7)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$8 );
              final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( assertion ) );
              if( NIL != valid_$9 )
              {
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                v_answer = assertion;
              }
              done_var_$7 = makeBoolean( NIL == valid_$9 || NIL != v_answer );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != v_answer );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 6497L)
  public static SubLObject fpred_value_gaf_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_argnum, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = fpred_value_gaf( v_term, pred, index_argnum, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 6817L)
  public static SubLObject fpred_value_gaf_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth)
  {
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = fpred_value_gaf( v_term, pred, index_argnum, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 7090L)
  public static SubLObject fpred_value(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    final SubLObject assertion = fpred_value_gaf( v_term, pred, index_arg, truth );
    if( NIL != assertion )
    {
      return assertions_high.gaf_arg( assertion, gather_arg );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 7851L)
  public static SubLObject fpred_value_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( mt, $sym11$HLMT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      v_answer = fpred_value( v_term, pred, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 8587L)
  public static SubLObject fpred_value_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( mts, $sym17$LISTP );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym18$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      v_answer = fpred_value( v_term, pred, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 9352L)
  public static SubLObject fpred_value_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = fpred_value( v_term, pred, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 10089L)
  public static SubLObject fpred_value_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = fpred_value( v_term, pred, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 10577L)
  public static SubLObject pred_value_gafs(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth)
  {
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertions = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, index_argnum, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, index_argnum, pred );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$10 = NIL;
            final SubLObject token_var_$11 = NIL;
            while ( NIL == done_var_$10)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$11 );
              final SubLObject valid_$12 = makeBoolean( !token_var_$11.eql( assertion ) );
              if( NIL != valid_$12 )
              {
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                assertions = ConsesLow.cons( assertion, assertions );
              }
              done_var_$10 = makeBoolean( NIL == valid_$12 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 11317L)
  public static SubLObject pred_value_gafs_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_argnum, SubLObject truth)
  {
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      v_answer = pred_value_gafs( v_term, pred, index_argnum, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 12020L)
  public static SubLObject pred_value_gafs_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_argnum, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = pred_value_gafs( v_term, pred, index_argnum, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 12534L)
  public static SubLObject pred_value_gafs_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth)
  {
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = pred_value_gafs( v_term, pred, index_argnum, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 13229L)
  public static SubLObject pred_values(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject values = NIL;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$13 = NIL;
            final SubLObject token_var_$14 = NIL;
            while ( NIL == done_var_$13)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$14 );
              final SubLObject valid_$15 = makeBoolean( !token_var_$14.eql( assertion ) );
              if( NIL != valid_$15 )
              {
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                final SubLObject value = assertions_high.gaf_arg( assertion, gather_arg );
                values = ConsesLow.cons( value, values );
              }
              done_var_$13 = makeBoolean( NIL == valid_$15 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    if( NIL != control_vars.$mapping_equality_test$.getDynamicValue( thread ) )
    {
      values = list_utilities.fast_delete_duplicates( values, control_vars.$mapping_equality_test$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 14253L)
  public static SubLObject pred_values_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( mt, $sym11$HLMT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      v_answer = pred_values( v_term, pred, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 14964L)
  public static SubLObject pred_values_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( mts, $sym17$LISTP );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym18$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      v_answer = pred_values( v_term, pred, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 15704L)
  public static SubLObject pred_values_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = pred_values( v_term, pred, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 16416L)
  public static SubLObject pred_values_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = pred_values( v_term, pred, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 16905L)
  public static SubLObject pred_refs(final SubLObject pred, SubLObject gather_arg, SubLObject truth)
  {
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym2$FORT_P );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    SubLObject answer_already_calculated = NIL;
    if( NIL == control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
    {
      answer_already_calculated = T;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) && NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
                SubLObject done_var_$17 = NIL;
                final SubLObject token_var_$18 = NIL;
                while ( NIL == done_var_$17)
                {
                  final SubLObject assertion_var = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$18 );
                  final SubLObject valid_$19 = makeBoolean( !token_var_$18.eql( assertion_var ) );
                  if( NIL != valid_$19 )
                  {
                    final SubLObject v_term = assertions_high.gaf_arg( assertion_var, gather_arg );
                    v_answer = ConsesLow.cons( v_term, v_answer );
                  }
                  done_var_$17 = makeBoolean( NIL == valid_$19 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    if( NIL == answer_already_calculated && NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
    {
      final SubLObject str2 = NIL;
      final SubLObject _prev_bind_9 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
      final SubLObject _prev_bind_11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
      final SubLObject _prev_bind_12 = utilities_macros.$progress_notification_count$.currentBinding( thread );
      final SubLObject _prev_bind_13 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
      final SubLObject _prev_bind_14 = utilities_macros.$progress_count$.currentBinding( thread );
      final SubLObject _prev_bind_15 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
      final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$is_noting_progressP$.bind( T, thread );
        utilities_macros.$silent_progressP$.bind( ( NIL != str2 ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
        utilities_macros.noting_progress_preamble( str2 );
        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred );
        SubLObject done_var2 = NIL;
        final SubLObject token_var2 = NIL;
        while ( NIL == done_var2)
        {
          final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
          final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
          if( NIL != valid2 )
          {
            utilities_macros.note_progress();
            SubLObject final_index_iterator2 = NIL;
            try
            {
              final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw5$GAF, truth, NIL );
              SubLObject done_var_$18 = NIL;
              final SubLObject token_var_$19 = NIL;
              while ( NIL == done_var_$18)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$19 );
                final SubLObject valid_$20 = makeBoolean( !token_var_$19.eql( assertion ) );
                if( NIL != valid_$20 )
                {
                  if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                  {
                    Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                  }
                  v_answer = ConsesLow.cons( assertions_high.gaf_arg( assertion, gather_arg ), v_answer );
                }
                done_var_$18 = makeBoolean( NIL == valid_$20 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator2 )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
              }
            }
          }
          done_var2 = makeBoolean( NIL == valid2 );
        }
        utilities_macros.noting_progress_postamble();
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_16, thread );
        utilities_macros.$is_noting_progressP$.rebind( _prev_bind_15, thread );
        utilities_macros.$progress_count$.rebind( _prev_bind_14, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_13, thread );
        utilities_macros.$progress_notification_count$.rebind( _prev_bind_12, thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_11, thread );
        utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_10, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_9, thread );
      }
    }
    if( NIL != control_vars.$mapping_equality_test$.getDynamicValue( thread ) )
    {
      v_answer = list_utilities.fast_delete_duplicates( v_answer, control_vars.$mapping_equality_test$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 18081L)
  public static SubLObject pred_refs_in_mt(final SubLObject pred, final SubLObject mt, SubLObject gather_arg, SubLObject truth)
  {
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym2$FORT_P );
    enforceType( mt, $sym11$HLMT_P );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      v_answer = pred_refs( pred, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 18662L)
  public static SubLObject pred_refs_in_mts(final SubLObject pred, final SubLObject mts, SubLObject gather_arg, SubLObject truth)
  {
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym2$FORT_P );
    enforceType( mts, $sym17$LISTP );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym18$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      v_answer = pred_refs( pred, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 19272L)
  public static SubLObject pred_refs_in_any_mt(final SubLObject pred, SubLObject gather_arg, SubLObject truth)
  {
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym2$FORT_P );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = pred_refs( pred, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 19854L)
  public static SubLObject pred_refs_in_relevant_mts(final SubLObject pred, SubLObject mt, SubLObject gather_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym2$FORT_P );
    enforceType( gather_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = pred_refs( pred, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 20258L)
  public static SubLObject pred_u_v_holds_gafs(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertions = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( u, u_arg, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( u, u_arg, pred );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$25 = NIL;
            final SubLObject token_var_$26 = NIL;
            while ( NIL == done_var_$25)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$26 );
              final SubLObject valid_$27 = makeBoolean( !token_var_$26.eql( assertion ) );
              if( NIL != valid_$27 && NIL != Functions.funcall( control_vars.$mapping_equality_test$.getDynamicValue( thread ), assertions_high.gaf_arg( assertion, v_arg ), v ) )
              {
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                assertions = ConsesLow.cons( assertion, assertions );
              }
              done_var_$25 = makeBoolean( NIL == valid_$27 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 21103L)
  public static SubLObject pred_u_v_holds_tuples(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject gather_args, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( u, u_arg, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( u, u_arg, pred );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$28 = NIL;
            final SubLObject token_var_$29 = NIL;
            while ( NIL == done_var_$28)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$29 );
              final SubLObject valid_$30 = makeBoolean( !token_var_$29.eql( assertion ) );
              if( NIL != valid_$30 && NIL != Functions.funcall( control_vars.$mapping_equality_test$.getDynamicValue( thread ), assertions_high.gaf_arg( assertion, v_arg ), v ) )
              {
                SubLObject tuple = NIL;
                SubLObject cdolist_list_var = gather_args;
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  tuple = ConsesLow.cons( assertions_high.gaf_arg( assertion, arg ), tuple );
                  cdolist_list_var = cdolist_list_var.rest();
                  arg = cdolist_list_var.first();
                }
                tuple = Sequences.nreverse( tuple );
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                v_answer = ConsesLow.cons( tuple, v_answer );
              }
              done_var_$28 = makeBoolean( NIL == valid_$30 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    if( NIL != control_vars.$mapping_equality_test$.getDynamicValue( thread ) )
    {
      v_answer = list_utilities.fast_delete_duplicates( v_answer, control_vars.$mapping_equality_test$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 22481L)
  public static SubLObject pred_u_v_w_holds_tuples(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject w, final SubLObject gather_args, SubLObject u_arg, SubLObject v_arg, SubLObject w_arg,
      SubLObject truth)
  {
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( w_arg == UNPROVIDED )
    {
      w_arg = THREE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( u, u_arg, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( u, u_arg, pred );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$31 = NIL;
            final SubLObject token_var_$32 = NIL;
            while ( NIL == done_var_$31)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$32 );
              final SubLObject valid_$33 = makeBoolean( !token_var_$32.eql( assertion ) );
              if( NIL != valid_$33 && NIL != Functions.funcall( control_vars.$mapping_equality_test$.getDynamicValue( thread ), assertions_high.gaf_arg( assertion, v_arg ), v ) && NIL != Functions.funcall(
                  control_vars.$mapping_equality_test$.getDynamicValue( thread ), assertions_high.gaf_arg( assertion, w_arg ), w ) )
              {
                SubLObject tuple = NIL;
                SubLObject cdolist_list_var = gather_args;
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  tuple = ConsesLow.cons( assertions_high.gaf_arg( assertion, arg ), tuple );
                  cdolist_list_var = cdolist_list_var.rest();
                  arg = cdolist_list_var.first();
                }
                tuple = Sequences.nreverse( tuple );
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                v_answer = ConsesLow.cons( tuple, v_answer );
              }
              done_var_$31 = makeBoolean( NIL == valid_$33 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    if( NIL != control_vars.$mapping_equality_test$.getDynamicValue( thread ) )
    {
      v_answer = list_utilities.fast_delete_duplicates( v_answer, control_vars.$mapping_equality_test$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 24060L)
  public static SubLObject fpred_u_v_holds_gaf(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( u, u_arg, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( u, u_arg, pred );
      SubLObject done_var = v_answer;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$34 = v_answer;
            final SubLObject token_var_$35 = NIL;
            while ( NIL == done_var_$34)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$35 );
              final SubLObject valid_$36 = makeBoolean( !token_var_$35.eql( assertion ) );
              if( NIL != valid_$36 && NIL != Functions.funcall( control_vars.$mapping_equality_test$.getDynamicValue( thread ), assertions_high.gaf_arg( assertion, v_arg ), v ) )
              {
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                v_answer = assertion;
              }
              done_var_$34 = makeBoolean( NIL == valid_$36 || NIL != v_answer );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != v_answer );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 24862L)
  public static SubLObject pred_u_v_holds_gafs_in_relevant_mts(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertions = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      assertions = pred_u_v_holds_gafs( pred, u, v, u_arg, v_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 25218L)
  public static SubLObject fpred_u_v_holds_gaf_in_relevant_mts(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertion = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      assertion = fpred_u_v_holds_gaf( pred, u, v, u_arg, v_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 25572L)
  public static SubLObject pred_u_v_holds_gafs_in_any_mt(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = pred_u_v_holds_gafs( pred, u, v, u_arg, v_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 26119L)
  public static SubLObject fpred_u_v_holds_gaf_in_any_mt(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = fpred_u_v_holds_gaf( pred, u, v, u_arg, v_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 26681L)
  public static SubLObject pred_u_v_holds(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym2$FORT_P );
    enforceType( u, $sym1$INDEXED_TERM_P );
    enforceType( v, $sym77$HL_TERM_P );
    enforceType( u_arg, $sym3$INTEGERP );
    enforceType( v_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( u, u_arg, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( u, u_arg, pred );
      SubLObject done_var = v_answer;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$37 = v_answer;
            final SubLObject token_var_$38 = NIL;
            while ( NIL == done_var_$37)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$38 );
              final SubLObject valid_$39 = makeBoolean( !token_var_$38.eql( assertion ) );
              if( NIL != valid_$39 && NIL != Functions.funcall( control_vars.$mapping_equality_test$.getDynamicValue( thread ), assertions_high.gaf_arg( assertion, v_arg ), v ) )
              {
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                v_answer = T;
              }
              done_var_$37 = makeBoolean( NIL == valid_$39 || NIL != v_answer );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != v_answer );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 27618L)
  public static SubLObject pred_u_v_holds_in_mt(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym2$FORT_P );
    enforceType( u, $sym1$INDEXED_TERM_P );
    enforceType( v, $sym77$HL_TERM_P );
    enforceType( mt, $sym11$HLMT_P );
    enforceType( u_arg, $sym3$INTEGERP );
    enforceType( v_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      v_answer = pred_u_v_holds( pred, u, v, u_arg, v_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 28331L)
  public static SubLObject pred_u_v_holds_in_mts(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject mts, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym2$FORT_P );
    enforceType( u, $sym1$INDEXED_TERM_P );
    enforceType( v, $sym77$HL_TERM_P );
    enforceType( mts, $sym17$LISTP );
    enforceType( u_arg, $sym3$INTEGERP );
    enforceType( v_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym18$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      v_answer = pred_u_v_holds( pred, u, v, u_arg, v_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 29073L)
  public static SubLObject pred_u_v_holds_in_any_mt(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym2$FORT_P );
    enforceType( u, $sym1$INDEXED_TERM_P );
    enforceType( v, $sym77$HL_TERM_P );
    enforceType( u_arg, $sym3$INTEGERP );
    enforceType( v_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = pred_u_v_holds( pred, u, v, u_arg, v_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 29787L)
  public static SubLObject pred_u_v_holds_in_relevant_mts(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( u_arg == UNPROVIDED )
    {
      u_arg = ONE_INTEGER;
    }
    if( v_arg == UNPROVIDED )
    {
      v_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( pred, $sym2$FORT_P );
    enforceType( u, $sym1$INDEXED_TERM_P );
    enforceType( v, $sym77$HL_TERM_P );
    enforceType( u_arg, $sym3$INTEGERP );
    enforceType( v_arg, $sym3$INTEGERP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = pred_u_v_holds( pred, u, v, u_arg, v_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 30262L)
  public static SubLObject tuple_holds(final SubLObject tuple, SubLObject index_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.consp( tuple ) : tuple;
    assert NIL != Types.integerp( index_arg ) : index_arg;
    assert NIL != enumeration_types.truth_p( truth ) : truth;
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( tuple );
    final SubLObject index_term = cycl_utilities.atomic_sentence_arg( tuple, index_arg, UNPROVIDED );
    assert NIL != forts.fort_p( pred ) : pred;
    assert NIL != kb_indexing_datastructures.indexed_term_p( index_term ) : index_term;
    SubLObject v_answer = NIL;
    final SubLObject pred_var = pred;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( index_term, index_arg, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( index_term, index_arg, pred_var );
      SubLObject done_var = v_answer;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$40 = v_answer;
            final SubLObject token_var_$41 = NIL;
            while ( NIL == done_var_$40)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$41 );
              final SubLObject valid_$42 = makeBoolean( !token_var_$41.eql( assertion ) );
              if( NIL != valid_$42 && assertions_high.gaf_formula( assertion ).equal( tuple ) )
              {
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                v_answer = T;
              }
              done_var_$40 = makeBoolean( NIL == valid_$42 || NIL != v_answer );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != v_answer );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 31344L)
  public static SubLObject tuple_holds_in_mt(final SubLObject tuple, final SubLObject mt, SubLObject index_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      v_answer = tuple_holds( tuple, index_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 31898L)
  public static SubLObject tuple_holds_in_mts(final SubLObject tuple, final SubLObject mts, SubLObject index_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( mts ) : mts;
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym18$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      v_answer = tuple_holds( tuple, index_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 32481L)
  public static SubLObject tuple_holds_in_any_mt(final SubLObject tuple, SubLObject index_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = tuple_holds( tuple, index_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 33023L)
  public static SubLObject tuple_holds_in_relevant_mts(final SubLObject tuple, SubLObject mt, SubLObject index_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = tuple_holds( tuple, index_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 33320L)
  public static SubLObject pred_values_mentioning(final SubLObject v_term, final SubLObject pred, final SubLObject item, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    assert NIL != forts.fort_p( pred ) : pred;
    assert NIL != term.hl_term_p( item ) : item;
    assert NIL != Types.integerp( index_arg ) : index_arg;
    assert NIL != Types.integerp( gather_arg ) : gather_arg;
    assert NIL != enumeration_types.truth_p( truth ) : truth;
    SubLObject v_answer = NIL;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$43 = NIL;
            final SubLObject token_var_$44 = NIL;
            while ( NIL == done_var_$43)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$44 );
              final SubLObject valid_$45 = makeBoolean( !token_var_$44.eql( assertion ) );
              if( NIL != valid_$45 )
              {
                final SubLObject arg = assertions_high.gaf_arg( assertion, gather_arg );
                if( NIL != list_utilities.tree_find( item, arg, UNPROVIDED, UNPROVIDED ) )
                {
                  if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                  {
                    Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                  }
                  v_answer = ConsesLow.cons( arg, v_answer );
                }
              }
              done_var_$43 = makeBoolean( NIL == valid_$45 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    if( NIL != control_vars.$mapping_equality_test$.getDynamicValue( thread ) )
    {
      v_answer = list_utilities.fast_delete_duplicates( v_answer, control_vars.$mapping_equality_test$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 34193L)
  public static SubLObject pred_values_mentioning_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject item, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      v_answer = pred_values_mentioning( v_term, pred, item, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 34482L)
  public static SubLObject pred_values_mentioning_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject item, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( mts ) : mts;
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym18$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      v_answer = pred_values_mentioning( v_term, pred, item, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 34774L)
  public static SubLObject pred_values_mentioning_in_any_mt(final SubLObject v_term, final SubLObject pred, final SubLObject item, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = pred_values_mentioning( v_term, pred, item, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 35036L)
  public static SubLObject pred_values_mentioning_in_relevant_mts(final SubLObject v_term, final SubLObject pred, final SubLObject item, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = pred_values_mentioning( v_term, pred, item, index_arg, gather_arg, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 35441L)
  public static SubLObject fpred_arg_value(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth)
  {
    if( term_psn == UNPROVIDED )
    {
      term_psn = ONE_INTEGER;
    }
    if( arg_psn == UNPROVIDED )
    {
      arg_psn = TWO_INTEGER;
    }
    if( gather_psn == UNPROVIDED )
    {
      gather_psn = THREE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    return pred_arg_values( v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, ONE_INTEGER ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 35638L)
  public static SubLObject pred_arg_values(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth, SubLObject number)
  {
    if( term_psn == UNPROVIDED )
    {
      term_psn = ONE_INTEGER;
    }
    if( arg_psn == UNPROVIDED )
    {
      arg_psn = TWO_INTEGER;
    }
    if( gather_psn == UNPROVIDED )
    {
      gather_psn = THREE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    assert NIL != forts.fort_p( pred ) : pred;
    assert NIL != Types.integerp( term_psn ) : term_psn;
    assert NIL != Types.integerp( arg_psn ) : arg_psn;
    assert NIL != Types.integerp( gather_psn ) : gather_psn;
    assert NIL != enumeration_types.truth_p( truth ) : truth;
    return ( NIL != $use_optimized_pred_arg_values_fixed_arityP$.getDynamicValue( thread ) && NIL != arity.arity( pred ) ) ? pred_arg_values_fixed_arity( v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, number )
        : pred_arg_values_int( v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 36211L)
  public static SubLObject pred_arg_values_int(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth, SubLObject number)
  {
    if( term_psn == UNPROVIDED )
    {
      term_psn = ONE_INTEGER;
    }
    if( arg_psn == UNPROVIDED )
    {
      arg_psn = TWO_INTEGER;
    }
    if( gather_psn == UNPROVIDED )
    {
      gather_psn = THREE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_count = ZERO_INTEGER;
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, term_psn, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, term_psn, pred );
      SubLObject done_var = doneP;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$46 = doneP;
            final SubLObject token_var_$47 = NIL;
            while ( NIL == done_var_$46)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$47 );
              final SubLObject valid_$48 = makeBoolean( !token_var_$47.eql( assertion ) );
              if( NIL != valid_$48 && arg.equalp( assertions_high.gaf_arg( assertion, arg_psn ) ) )
              {
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                result = ConsesLow.cons( assertions_high.gaf_arg( assertion, gather_psn ), result );
                result_count = Numbers.add( result_count, ONE_INTEGER );
                doneP = makeBoolean( number.isNumber() && result_count.numGE( number ) );
              }
              done_var_$46 = makeBoolean( NIL == valid_$48 || NIL != doneP );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != doneP );
      }
    }
    if( NIL != control_vars.$mapping_equality_test$.getDynamicValue( thread ) )
    {
      result = list_utilities.fast_delete_duplicates( result, control_vars.$mapping_equality_test$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 36956L)
  public static SubLObject pred_arg_values_fixed_arity(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth,
      SubLObject number)
  {
    if( term_psn == UNPROVIDED )
    {
      term_psn = ONE_INTEGER;
    }
    if( arg_psn == UNPROVIDED )
    {
      arg_psn = TWO_INTEGER;
    }
    if( gather_psn == UNPROVIDED )
    {
      gather_psn = THREE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_arity = arity.arity( pred );
    SubLObject result_count = ZERO_INTEGER;
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    SubLObject asent = NIL;
    SubLObject variable_num = ZERO_INTEGER;
    asent = ConsesLow.cons( pred, asent );
    SubLObject end_var;
    SubLObject n;
    for( end_var = Numbers.add( v_arity, ONE_INTEGER ), n = NIL, n = ONE_INTEGER; !n.numGE( end_var ); n = number_utilities.f_1X( n ) )
    {
      if( n.eql( term_psn ) )
      {
        asent = ConsesLow.cons( v_term, asent );
      }
      else if( n.eql( arg_psn ) )
      {
        asent = ConsesLow.cons( arg, asent );
      }
      else
      {
        asent = ConsesLow.cons( variables.get_variable( variable_num ), asent );
        variable_num = Numbers.add( variable_num, ONE_INTEGER );
      }
    }
    asent = Sequences.nreverse( asent );
    final SubLObject l_index = kb_indexing.best_gaf_lookup_index( asent, truth, NIL );
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
    if( pcase_var.eql( $kw96$GAF_ARG ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term_$49 = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
      final SubLObject argnum = thread.secondMultipleValue();
      final SubLObject predicate = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != argnum )
      {
        if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$49, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$49, argnum, pred_var );
            SubLObject done_var = doneP;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
                  SubLObject done_var_$50 = doneP;
                  final SubLObject token_var_$51 = NIL;
                  while ( NIL == done_var_$50)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$51 );
                    final SubLObject valid_$52 = makeBoolean( !token_var_$51.eql( assertion ) );
                    if( NIL != valid_$52 && NIL != unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) )
                    {
                      if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                      {
                        Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                      }
                      result = ConsesLow.cons( assertions_high.gaf_arg( assertion, gather_psn ), result );
                      result_count = Numbers.add( result_count, ONE_INTEGER );
                      doneP = makeBoolean( number.isNumber() && result_count.numGE( number ) );
                    }
                    done_var_$50 = makeBoolean( NIL == valid_$52 || NIL != doneP );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != doneP );
            }
          }
        }
        else
        {
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$49, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$49, argnum, pred_var );
            SubLObject done_var = doneP;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
                  SubLObject done_var_$51 = doneP;
                  final SubLObject token_var_$52 = NIL;
                  while ( NIL == done_var_$51)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$52 );
                    final SubLObject valid_$53 = makeBoolean( !token_var_$52.eql( assertion ) );
                    if( NIL != valid_$53 && NIL != unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) )
                    {
                      if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                      {
                        Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                      }
                      result = ConsesLow.cons( assertions_high.gaf_arg( assertion, gather_psn ), result );
                      result_count = Numbers.add( result_count, ONE_INTEGER );
                      doneP = makeBoolean( number.isNumber() && result_count.numGE( number ) );
                    }
                    done_var_$51 = makeBoolean( NIL == valid_$53 || NIL != doneP );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != doneP );
            }
          }
        }
      }
      else if( NIL != predicate )
      {
        final SubLObject pred_var = predicate;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$49, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$49, NIL, pred_var );
          SubLObject done_var = doneP;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
                SubLObject done_var_$52 = doneP;
                final SubLObject token_var_$53 = NIL;
                while ( NIL == done_var_$52)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$53 );
                  final SubLObject valid_$54 = makeBoolean( !token_var_$53.eql( assertion ) );
                  if( NIL != valid_$54 && NIL != unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) )
                  {
                    if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                    {
                      Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                    }
                    result = ConsesLow.cons( assertions_high.gaf_arg( assertion, gather_psn ), result );
                    result_count = Numbers.add( result_count, ONE_INTEGER );
                    doneP = makeBoolean( number.isNumber() && result_count.numGE( number ) );
                  }
                  done_var_$52 = makeBoolean( NIL == valid_$54 || NIL != doneP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != doneP );
          }
        }
      }
      else
      {
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$49, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$49, NIL, pred_var );
          SubLObject done_var = doneP;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
                SubLObject done_var_$53 = doneP;
                final SubLObject token_var_$54 = NIL;
                while ( NIL == done_var_$53)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$54 );
                  final SubLObject valid_$55 = makeBoolean( !token_var_$54.eql( assertion ) );
                  if( NIL != valid_$55 && NIL != unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) )
                  {
                    if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                    {
                      Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                    }
                    result = ConsesLow.cons( assertions_high.gaf_arg( assertion, gather_psn ), result );
                    result_count = Numbers.add( result_count, ONE_INTEGER );
                    doneP = makeBoolean( number.isNumber() && result_count.numGE( number ) );
                  }
                  done_var_$53 = makeBoolean( NIL == valid_$55 || NIL != doneP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != doneP );
          }
        }
      }
    }
    else if( pcase_var.eql( $kw97$PREDICATE_EXTENT ) )
    {
      final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
          SubLObject done_var2 = doneP;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw5$GAF, truth, NIL );
                SubLObject done_var_$54 = doneP;
                final SubLObject token_var_$55 = NIL;
                while ( NIL == done_var_$54)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$55 );
                  final SubLObject valid_$56 = makeBoolean( !token_var_$55.eql( assertion2 ) );
                  if( NIL != valid_$56 && NIL != unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion2 ), UNPROVIDED, UNPROVIDED ) )
                  {
                    if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                    {
                      Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion2 );
                    }
                    result = ConsesLow.cons( assertions_high.gaf_arg( assertion2, gather_psn ), result );
                    result_count = Numbers.add( result_count, ONE_INTEGER );
                    doneP = makeBoolean( number.isNumber() && result_count.numGE( number ) );
                  }
                  done_var_$54 = makeBoolean( NIL == valid_$56 || NIL != doneP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$65, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 || NIL != doneP );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_12, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_11, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_10, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_9, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_8, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_5, thread );
        }
      }
    }
    else if( pcase_var.eql( $kw98$OVERLAP ) )
    {
      SubLObject rest;
      SubLObject assertion3;
      for( rest = NIL, rest = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED ); NIL == doneP && NIL != rest; rest = rest.rest() )
      {
        assertion3 = rest.first();
        if( ( NIL == truth || NIL != assertions_high.assertion_has_truth( assertion3, truth ) ) && NIL != unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion3 ), UNPROVIDED,
            UNPROVIDED ) )
        {
          if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
          {
            Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion3 );
          }
          result = ConsesLow.cons( assertions_high.gaf_arg( assertion3, gather_psn ), result );
          result_count = Numbers.add( result_count, ONE_INTEGER );
          doneP = makeBoolean( number.isNumber() && result_count.numGE( number ) );
        }
      }
    }
    else
    {
      kb_mapping_macros.do_gli_method_error( l_index, method );
    }
    if( NIL != control_vars.$mapping_equality_test$.getDynamicValue( thread ) )
    {
      result = list_utilities.fast_delete_duplicates( result, control_vars.$mapping_equality_test$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 37988L)
  public static SubLObject pred_arg_values_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject arg, final SubLObject mt, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn,
      SubLObject truth)
  {
    if( term_psn == UNPROVIDED )
    {
      term_psn = ONE_INTEGER;
    }
    if( arg_psn == UNPROVIDED )
    {
      arg_psn = TWO_INTEGER;
    }
    if( gather_psn == UNPROVIDED )
    {
      gather_psn = THREE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      v_answer = pred_arg_values( v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 38279L)
  public static SubLObject pred_arg_values_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject arg, final SubLObject mts, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn,
      SubLObject truth)
  {
    if( term_psn == UNPROVIDED )
    {
      term_psn = ONE_INTEGER;
    }
    if( arg_psn == UNPROVIDED )
    {
      arg_psn = TWO_INTEGER;
    }
    if( gather_psn == UNPROVIDED )
    {
      gather_psn = THREE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( mts ) : mts;
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym18$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      v_answer = pred_arg_values( v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 38574L)
  public static SubLObject pred_arg_values_in_any_mt(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth)
  {
    if( term_psn == UNPROVIDED )
    {
      term_psn = ONE_INTEGER;
    }
    if( arg_psn == UNPROVIDED )
    {
      arg_psn = TWO_INTEGER;
    }
    if( gather_psn == UNPROVIDED )
    {
      gather_psn = THREE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = pred_arg_values( v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 38839L)
  public static SubLObject pred_arg_values_in_relevant_mts(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject mt, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn,
      SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( term_psn == UNPROVIDED )
    {
      term_psn = ONE_INTEGER;
    }
    if( arg_psn == UNPROVIDED )
    {
      arg_psn = TWO_INTEGER;
    }
    if( gather_psn == UNPROVIDED )
    {
      gather_psn = THREE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = pred_arg_values( v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 39117L)
  public static SubLObject pred_value_tuples(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_args, $sym17$LISTP );
    enforceType( truth, $sym4$TRUTH_P );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.every_in_list( Symbols.symbol_function( $sym3$INTEGERP ), gather_args, UNPROVIDED ) )
    {
      Errors.error( $str99$_S_is_not_a_valid_arg_position_li );
    }
    SubLObject v_answer = NIL;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, truth, NIL );
            SubLObject done_var_$66 = NIL;
            final SubLObject token_var_$67 = NIL;
            while ( NIL == done_var_$66)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$67 );
              final SubLObject valid_$68 = makeBoolean( !token_var_$67.eql( assertion ) );
              if( NIL != valid_$68 )
              {
                SubLObject tuple = NIL;
                SubLObject cdolist_list_var = gather_args;
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  tuple = ConsesLow.cons( assertions_high.gaf_arg( assertion, arg ), tuple );
                  cdolist_list_var = cdolist_list_var.rest();
                  arg = cdolist_list_var.first();
                }
                tuple = Sequences.nreverse( tuple );
                if( NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ) )
                {
                  Functions.funcall( control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue( thread ), assertion );
                }
                v_answer = ConsesLow.cons( tuple, v_answer );
              }
              done_var_$66 = makeBoolean( NIL == valid_$68 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    if( NIL != control_vars.$mapping_equality_test$.getDynamicValue( thread ) )
    {
      v_answer = list_utilities.fast_delete_duplicates( v_answer, control_vars.$mapping_equality_test$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 40357L)
  public static SubLObject pred_value_tuples_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, final SubLObject mt, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_args, $sym17$LISTP );
    enforceType( mt, $sym11$HLMT_P );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      v_answer = pred_value_tuples( v_term, pred, index_arg, gather_args, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 41078L)
  public static SubLObject pred_value_tuples_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, final SubLObject mts, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_args, $sym17$LISTP );
    enforceType( mts, $sym17$LISTP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym18$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      v_answer = pred_value_tuples( v_term, pred, index_arg, gather_args, truth );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 41832L)
  public static SubLObject pred_value_tuples_in_any_mt(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_args, $sym17$LISTP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      v_answer = pred_value_tuples( v_term, pred, index_arg, gather_args, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 42554L)
  public static SubLObject pred_value_tuples_in_relevant_mts(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw0$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_term, $sym1$INDEXED_TERM_P );
    enforceType( pred, $sym2$FORT_P );
    enforceType( index_arg, $sym3$INTEGERP );
    enforceType( gather_args, $sym17$LISTP );
    enforceType( truth, $sym4$TRUTH_P );
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      v_answer = pred_value_tuples( v_term, pred, index_arg, gather_args, truth );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 43055L)
  public static SubLObject gaf_truth_known(final SubLObject gaf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject truth = NIL;
    final SubLObject l_index = kb_indexing.best_gaf_lookup_index( gaf, NIL, NIL );
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
    if( pcase_var.eql( $kw96$GAF_ARG ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
      final SubLObject argnum = thread.secondMultipleValue();
      final SubLObject predicate = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != argnum )
      {
        if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
            SubLObject done_var = truth;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                  SubLObject done_var_$69 = truth;
                  final SubLObject token_var_$70 = NIL;
                  while ( NIL == done_var_$69)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$70 );
                    final SubLObject valid_$71 = makeBoolean( !token_var_$70.eql( assertion ) );
                    if( NIL != valid_$71 && NIL != unification_utilities.asent_unify( gaf, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) )
                    {
                      truth = assertions_high.assertion_truth( assertion );
                    }
                    done_var_$69 = makeBoolean( NIL == valid_$71 || NIL != truth );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != truth );
            }
          }
        }
        else
        {
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
            SubLObject done_var = truth;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                  SubLObject done_var_$70 = truth;
                  final SubLObject token_var_$71 = NIL;
                  while ( NIL == done_var_$70)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$71 );
                    final SubLObject valid_$72 = makeBoolean( !token_var_$71.eql( assertion ) );
                    if( NIL != valid_$72 && NIL != unification_utilities.asent_unify( gaf, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) )
                    {
                      truth = assertions_high.assertion_truth( assertion );
                    }
                    done_var_$70 = makeBoolean( NIL == valid_$72 || NIL != truth );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != truth );
            }
          }
        }
      }
      else if( NIL != predicate )
      {
        final SubLObject pred_var = predicate;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
          SubLObject done_var = truth;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                SubLObject done_var_$71 = truth;
                final SubLObject token_var_$72 = NIL;
                while ( NIL == done_var_$71)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$72 );
                  final SubLObject valid_$73 = makeBoolean( !token_var_$72.eql( assertion ) );
                  if( NIL != valid_$73 && NIL != unification_utilities.asent_unify( gaf, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) )
                  {
                    truth = assertions_high.assertion_truth( assertion );
                  }
                  done_var_$71 = makeBoolean( NIL == valid_$73 || NIL != truth );
                }
              }
              finally
              {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != truth );
          }
        }
      }
      else
      {
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
          SubLObject done_var = truth;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                SubLObject done_var_$72 = truth;
                final SubLObject token_var_$73 = NIL;
                while ( NIL == done_var_$72)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$73 );
                  final SubLObject valid_$74 = makeBoolean( !token_var_$73.eql( assertion ) );
                  if( NIL != valid_$74 && NIL != unification_utilities.asent_unify( gaf, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) )
                  {
                    truth = assertions_high.assertion_truth( assertion );
                  }
                  done_var_$72 = makeBoolean( NIL == valid_$74 || NIL != truth );
                }
              }
              finally
              {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != truth );
          }
        }
      }
    }
    else if( pcase_var.eql( $kw97$PREDICATE_EXTENT ) )
    {
      final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
          SubLObject done_var2 = truth;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw5$GAF, NIL, NIL );
                SubLObject done_var_$73 = truth;
                final SubLObject token_var_$74 = NIL;
                while ( NIL == done_var_$73)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$74 );
                  final SubLObject valid_$75 = makeBoolean( !token_var_$74.eql( assertion2 ) );
                  if( NIL != valid_$75 && NIL != unification_utilities.asent_unify( gaf, assertions_high.gaf_formula( assertion2 ), UNPROVIDED, UNPROVIDED ) )
                  {
                    truth = assertions_high.assertion_truth( assertion2 );
                  }
                  done_var_$73 = makeBoolean( NIL == valid_$75 || NIL != truth );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$84, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 || NIL != truth );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_12, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_11, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_10, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_9, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_8, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_5, thread );
        }
      }
    }
    else if( pcase_var.eql( $kw98$OVERLAP ) )
    {
      SubLObject rest;
      SubLObject assertion3;
      for( rest = NIL, rest = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED ); NIL == truth && NIL != rest; rest = rest.rest() )
      {
        assertion3 = rest.first();
        if( NIL != unification_utilities.asent_unify( gaf, assertions_high.gaf_formula( assertion3 ), UNPROVIDED, UNPROVIDED ) )
        {
          truth = assertions_high.assertion_truth( assertion3 );
        }
      }
    }
    else
    {
      kb_mapping_macros.do_gli_method_error( l_index, method );
    }
    return truth;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 43343L)
  public static SubLObject gaf_trueP(final SubLObject gaf_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject l_index = kb_indexing.best_gaf_lookup_index( gaf_formula, NIL, NIL );
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
    if( pcase_var.eql( $kw96$GAF_ARG ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
      final SubLObject argnum = thread.secondMultipleValue();
      final SubLObject predicate = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != argnum )
      {
        if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                  SubLObject done_var_$85 = NIL;
                  final SubLObject token_var_$86 = NIL;
                  while ( NIL == done_var_$85)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$86 );
                    final SubLObject valid_$87 = makeBoolean( !token_var_$86.eql( assertion ) );
                    if( NIL != valid_$87 && NIL != unification_utilities.asent_unify( gaf_formula, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) && $kw0$TRUE == assertions_high.assertion_truth(
                        assertion ) )
                    {
                      return T;
                    }
                    done_var_$85 = makeBoolean( NIL == valid_$87 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else
        {
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                  SubLObject done_var_$86 = NIL;
                  final SubLObject token_var_$87 = NIL;
                  while ( NIL == done_var_$86)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$87 );
                    final SubLObject valid_$88 = makeBoolean( !token_var_$87.eql( assertion ) );
                    if( NIL != valid_$88 && NIL != unification_utilities.asent_unify( gaf_formula, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) && $kw0$TRUE == assertions_high.assertion_truth(
                        assertion ) )
                    {
                      return T;
                    }
                    done_var_$86 = makeBoolean( NIL == valid_$88 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( NIL != predicate )
      {
        final SubLObject pred_var = predicate;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                SubLObject done_var_$87 = NIL;
                final SubLObject token_var_$88 = NIL;
                while ( NIL == done_var_$87)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$88 );
                  final SubLObject valid_$89 = makeBoolean( !token_var_$88.eql( assertion ) );
                  if( NIL != valid_$89 && NIL != unification_utilities.asent_unify( gaf_formula, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) && $kw0$TRUE == assertions_high.assertion_truth(
                      assertion ) )
                  {
                    return T;
                  }
                  done_var_$87 = makeBoolean( NIL == valid_$89 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else
      {
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw5$GAF, NIL, NIL );
                SubLObject done_var_$88 = NIL;
                final SubLObject token_var_$89 = NIL;
                while ( NIL == done_var_$88)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$89 );
                  final SubLObject valid_$90 = makeBoolean( !token_var_$89.eql( assertion ) );
                  if( NIL != valid_$90 && NIL != unification_utilities.asent_unify( gaf_formula, assertions_high.gaf_formula( assertion ), UNPROVIDED, UNPROVIDED ) && $kw0$TRUE == assertions_high.assertion_truth(
                      assertion ) )
                  {
                    return T;
                  }
                  done_var_$88 = makeBoolean( NIL == valid_$90 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
    }
    else if( pcase_var.eql( $kw97$PREDICATE_EXTENT ) )
    {
      final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
          SubLObject done_var2 = NIL;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw5$GAF, NIL, NIL );
                SubLObject done_var_$89 = NIL;
                final SubLObject token_var_$90 = NIL;
                while ( NIL == done_var_$89)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$90 );
                  final SubLObject valid_$91 = makeBoolean( !token_var_$90.eql( assertion2 ) );
                  if( NIL != valid_$91 && NIL != unification_utilities.asent_unify( gaf_formula, assertions_high.gaf_formula( assertion2 ), UNPROVIDED, UNPROVIDED ) && $kw0$TRUE == assertions_high.assertion_truth(
                      assertion2 ) )
                  {
                    return T;
                  }
                  done_var_$89 = makeBoolean( NIL == valid_$91 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$100 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$100, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_12, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_11, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_10, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_9, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_8, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_5, thread );
        }
      }
    }
    else if( pcase_var.eql( $kw98$OVERLAP ) )
    {
      SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
      SubLObject assertion3 = NIL;
      assertion3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != unification_utilities.asent_unify( gaf_formula, assertions_high.gaf_formula( assertion3 ), UNPROVIDED, UNPROVIDED ) && $kw0$TRUE == assertions_high.assertion_truth( assertion3 ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion3 = cdolist_list_var.first();
      }
    }
    else
    {
      kb_mapping_macros.do_gli_method_error( l_index, method );
    }
    return NIL;
  }

  public static SubLObject declare_kb_mapping_utilities_file()
  {
    SubLFiles.declareFunction( me, "some_pred_value", "SOME-PRED-VALUE", 2, 2, false );
    SubLFiles.declareFunction( me, "some_pred_value_in_mt", "SOME-PRED-VALUE-IN-MT", 3, 2, false );
    SubLFiles.declareFunction( me, "some_pred_value_in_mts", "SOME-PRED-VALUE-IN-MTS", 3, 2, false );
    SubLFiles.declareFunction( me, "some_pred_value_in_any_mt", "SOME-PRED-VALUE-IN-ANY-MT", 2, 2, false );
    SubLFiles.declareFunction( me, "some_pred_value_in_relevant_mts", "SOME-PRED-VALUE-IN-RELEVANT-MTS", 2, 3, false );
    SubLFiles.declareFunction( me, "some_pred_value_if", "SOME-PRED-VALUE-IF", 3, 2, false );
    SubLFiles.declareFunction( me, "fpred_value_gaf", "FPRED-VALUE-GAF", 2, 2, false );
    SubLFiles.declareFunction( me, "fpred_value_gaf_in_relevant_mts", "FPRED-VALUE-GAF-IN-RELEVANT-MTS", 2, 3, false );
    SubLFiles.declareFunction( me, "fpred_value_gaf_in_any_mt", "FPRED-VALUE-GAF-IN-ANY-MT", 2, 2, false );
    SubLFiles.declareFunction( me, "fpred_value", "FPRED-VALUE", 2, 3, false );
    SubLFiles.declareFunction( me, "fpred_value_in_mt", "FPRED-VALUE-IN-MT", 3, 3, false );
    SubLFiles.declareFunction( me, "fpred_value_in_mts", "FPRED-VALUE-IN-MTS", 3, 3, false );
    SubLFiles.declareFunction( me, "fpred_value_in_any_mt", "FPRED-VALUE-IN-ANY-MT", 2, 3, false );
    SubLFiles.declareFunction( me, "fpred_value_in_relevant_mts", "FPRED-VALUE-IN-RELEVANT-MTS", 2, 4, false );
    SubLFiles.declareFunction( me, "pred_value_gafs", "PRED-VALUE-GAFS", 2, 2, false );
    SubLFiles.declareFunction( me, "pred_value_gafs_in_mt", "PRED-VALUE-GAFS-IN-MT", 3, 2, false );
    SubLFiles.declareFunction( me, "pred_value_gafs_in_relevant_mts", "PRED-VALUE-GAFS-IN-RELEVANT-MTS", 2, 3, false );
    SubLFiles.declareFunction( me, "pred_value_gafs_in_any_mt", "PRED-VALUE-GAFS-IN-ANY-MT", 2, 2, false );
    SubLFiles.declareFunction( me, "pred_values", "PRED-VALUES", 2, 3, false );
    SubLFiles.declareFunction( me, "pred_values_in_mt", "PRED-VALUES-IN-MT", 3, 3, false );
    SubLFiles.declareFunction( me, "pred_values_in_mts", "PRED-VALUES-IN-MTS", 3, 3, false );
    SubLFiles.declareFunction( me, "pred_values_in_any_mt", "PRED-VALUES-IN-ANY-MT", 2, 3, false );
    SubLFiles.declareFunction( me, "pred_values_in_relevant_mts", "PRED-VALUES-IN-RELEVANT-MTS", 2, 4, false );
    SubLFiles.declareFunction( me, "pred_refs", "PRED-REFS", 1, 2, false );
    SubLFiles.declareFunction( me, "pred_refs_in_mt", "PRED-REFS-IN-MT", 2, 2, false );
    SubLFiles.declareFunction( me, "pred_refs_in_mts", "PRED-REFS-IN-MTS", 2, 2, false );
    SubLFiles.declareFunction( me, "pred_refs_in_any_mt", "PRED-REFS-IN-ANY-MT", 1, 2, false );
    SubLFiles.declareFunction( me, "pred_refs_in_relevant_mts", "PRED-REFS-IN-RELEVANT-MTS", 1, 3, false );
    SubLFiles.declareFunction( me, "pred_u_v_holds_gafs", "PRED-U-V-HOLDS-GAFS", 3, 3, false );
    SubLFiles.declareFunction( me, "pred_u_v_holds_tuples", "PRED-U-V-HOLDS-TUPLES", 4, 3, false );
    SubLFiles.declareFunction( me, "pred_u_v_w_holds_tuples", "PRED-U-V-W-HOLDS-TUPLES", 5, 4, false );
    SubLFiles.declareFunction( me, "fpred_u_v_holds_gaf", "FPRED-U-V-HOLDS-GAF", 3, 3, false );
    SubLFiles.declareFunction( me, "pred_u_v_holds_gafs_in_relevant_mts", "PRED-U-V-HOLDS-GAFS-IN-RELEVANT-MTS", 3, 4, false );
    SubLFiles.declareFunction( me, "fpred_u_v_holds_gaf_in_relevant_mts", "FPRED-U-V-HOLDS-GAF-IN-RELEVANT-MTS", 3, 4, false );
    SubLFiles.declareFunction( me, "pred_u_v_holds_gafs_in_any_mt", "PRED-U-V-HOLDS-GAFS-IN-ANY-MT", 3, 3, false );
    SubLFiles.declareFunction( me, "fpred_u_v_holds_gaf_in_any_mt", "FPRED-U-V-HOLDS-GAF-IN-ANY-MT", 3, 3, false );
    SubLFiles.declareFunction( me, "pred_u_v_holds", "PRED-U-V-HOLDS", 3, 3, false );
    SubLFiles.declareFunction( me, "pred_u_v_holds_in_mt", "PRED-U-V-HOLDS-IN-MT", 4, 3, false );
    SubLFiles.declareFunction( me, "pred_u_v_holds_in_mts", "PRED-U-V-HOLDS-IN-MTS", 4, 3, false );
    SubLFiles.declareFunction( me, "pred_u_v_holds_in_any_mt", "PRED-U-V-HOLDS-IN-ANY-MT", 3, 3, false );
    SubLFiles.declareFunction( me, "pred_u_v_holds_in_relevant_mts", "PRED-U-V-HOLDS-IN-RELEVANT-MTS", 3, 4, false );
    SubLFiles.declareFunction( me, "tuple_holds", "TUPLE-HOLDS", 1, 2, false );
    SubLFiles.declareFunction( me, "tuple_holds_in_mt", "TUPLE-HOLDS-IN-MT", 2, 2, false );
    SubLFiles.declareFunction( me, "tuple_holds_in_mts", "TUPLE-HOLDS-IN-MTS", 2, 2, false );
    SubLFiles.declareFunction( me, "tuple_holds_in_any_mt", "TUPLE-HOLDS-IN-ANY-MT", 1, 2, false );
    SubLFiles.declareFunction( me, "tuple_holds_in_relevant_mts", "TUPLE-HOLDS-IN-RELEVANT-MTS", 1, 3, false );
    SubLFiles.declareFunction( me, "pred_values_mentioning", "PRED-VALUES-MENTIONING", 3, 3, false );
    SubLFiles.declareFunction( me, "pred_values_mentioning_in_mt", "PRED-VALUES-MENTIONING-IN-MT", 4, 3, false );
    SubLFiles.declareFunction( me, "pred_values_mentioning_in_mts", "PRED-VALUES-MENTIONING-IN-MTS", 4, 3, false );
    SubLFiles.declareFunction( me, "pred_values_mentioning_in_any_mt", "PRED-VALUES-MENTIONING-IN-ANY-MT", 3, 3, false );
    SubLFiles.declareFunction( me, "pred_values_mentioning_in_relevant_mts", "PRED-VALUES-MENTIONING-IN-RELEVANT-MTS", 3, 4, false );
    SubLFiles.declareFunction( me, "fpred_arg_value", "FPRED-ARG-VALUE", 3, 4, false );
    SubLFiles.declareFunction( me, "pred_arg_values", "PRED-ARG-VALUES", 3, 5, false );
    SubLFiles.declareFunction( me, "pred_arg_values_int", "PRED-ARG-VALUES-INT", 3, 5, false );
    SubLFiles.declareFunction( me, "pred_arg_values_fixed_arity", "PRED-ARG-VALUES-FIXED-ARITY", 3, 5, false );
    SubLFiles.declareFunction( me, "pred_arg_values_in_mt", "PRED-ARG-VALUES-IN-MT", 4, 4, false );
    SubLFiles.declareFunction( me, "pred_arg_values_in_mts", "PRED-ARG-VALUES-IN-MTS", 4, 4, false );
    SubLFiles.declareFunction( me, "pred_arg_values_in_any_mt", "PRED-ARG-VALUES-IN-ANY-MT", 3, 4, false );
    SubLFiles.declareFunction( me, "pred_arg_values_in_relevant_mts", "PRED-ARG-VALUES-IN-RELEVANT-MTS", 3, 5, false );
    SubLFiles.declareFunction( me, "pred_value_tuples", "PRED-VALUE-TUPLES", 4, 1, false );
    SubLFiles.declareFunction( me, "pred_value_tuples_in_mt", "PRED-VALUE-TUPLES-IN-MT", 5, 1, false );
    SubLFiles.declareFunction( me, "pred_value_tuples_in_mts", "PRED-VALUE-TUPLES-IN-MTS", 5, 1, false );
    SubLFiles.declareFunction( me, "pred_value_tuples_in_any_mt", "PRED-VALUE-TUPLES-IN-ANY-MT", 4, 1, false );
    SubLFiles.declareFunction( me, "pred_value_tuples_in_relevant_mts", "PRED-VALUE-TUPLES-IN-RELEVANT-MTS", 4, 2, false );
    SubLFiles.declareFunction( me, "gaf_truth_known", "GAF-TRUTH-KNOWN", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_trueP", "GAF-TRUE?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_mapping_utilities_file()
  {
    $use_optimized_pred_arg_values_fixed_arityP$ = SubLFiles.defparameter( "*USE-OPTIMIZED-PRED-ARG-VALUES-FIXED-ARITY?*", T );
    return NIL;
  }

  public static SubLObject setup_kb_mapping_utilities_file()
  {
    utilities_macros.register_cyc_api_function( $sym6$SOME_PRED_VALUE, $list7, $str8$Find_the_first_gaf_assertion_such, $list9, $list10 );
    utilities_macros.register_cyc_api_function( $sym13$SOME_PRED_VALUE_IN_MT, $list14, $str15$Find_the_first_gaf_assertion_such, $list16, $list10 );
    utilities_macros.register_cyc_api_function( $sym19$SOME_PRED_VALUE_IN_MTS, $list20, $str21$Find_the_first_gaf_assertion_such, $list22, $list10 );
    utilities_macros.register_cyc_api_function( $sym25$SOME_PRED_VALUE_IN_ANY_MT, $list7, $str26$Find_the_first_gaf_assertion_such, $list9, $list10 );
    utilities_macros.register_cyc_api_function( $sym27$SOME_PRED_VALUE_IN_RELEVANT_MTS, $list28, $str29$If_MT_is_NIL__behaves_like_SOME_P, $list9, $list10 );
    utilities_macros.register_cyc_api_function( $sym31$FPRED_VALUE, $list32, $str33$Find_the_first_gaf_assertion_such, $list34, $list35 );
    utilities_macros.register_cyc_api_function( $sym36$FPRED_VALUE_IN_MT, $list37, $str38$Find_the_first_gaf_assertion_such, $list39, $list35 );
    utilities_macros.register_cyc_api_function( $sym40$FPRED_VALUE_IN_MTS, $list41, $str42$Find_the_first_gaf_assertion_such, $list43, $list35 );
    utilities_macros.register_cyc_api_function( $sym44$FPRED_VALUE_IN_ANY_MT, $list32, $str45$Find_the_first_gaf_assertion_such, $list34, $list35 );
    utilities_macros.register_cyc_api_function( $sym46$FPRED_VALUE_IN_RELEVANT_MTS, $list47, $str48$If_MT_is_NIL__behaves_like_FPRED_, $list34, $list35 );
    utilities_macros.register_cyc_api_function( $sym49$PRED_VALUES, $list32, $str50$Find_all_gaf_assertions_such_that, $list34, $list51 );
    utilities_macros.register_cyc_api_function( $sym52$PRED_VALUES_IN_MT, $list37, $str53$Find_all_gaf_assertions_such_that, $list39, $list51 );
    utilities_macros.register_cyc_api_function( $sym54$PRED_VALUES_IN_MTS, $list41, $str55$Find_all_gaf_assertions_such_that, $list43, $list51 );
    utilities_macros.register_cyc_api_function( $sym56$PRED_VALUES_IN_ANY_MT, $list32, $str57$Find_all_gaf_assertions_such_that, $list34, $list51 );
    utilities_macros.register_cyc_api_function( $sym58$PRED_VALUES_IN_RELEVANT_MTS, $list47, $str59$If_MT_is_NIL__behaves_like_PRED_V, $list34, $list51 );
    utilities_macros.register_cyc_api_function( $sym60$PRED_REFS, $list61, $str62$Find_all_gaf_assertions_such_that, $list63, $list51 );
    utilities_macros.register_cyc_api_function( $sym64$PRED_REFS_IN_MT, $list65, $str66$Find_all_gaf_assertions_such_that, $list67, $list51 );
    utilities_macros.register_cyc_api_function( $sym68$PRED_REFS_IN_MTS, $list69, $str70$Find_all_gaf_assertions_such_that, $list71, $list51 );
    utilities_macros.register_cyc_api_function( $sym72$PRED_REFS_IN_ANY_MT, $list61, $str73$Find_all_gaf_assertions_such_that, $list63, $list51 );
    utilities_macros.register_cyc_api_function( $sym74$PRED_REFS_IN_RELEVANT_MTS, $list75, $str76$If_MT_is_NIL__behaves_like_PRED_R, $list63, $list51 );
    utilities_macros.register_cyc_api_function( $sym78$PRED_U_V_HOLDS, $list79, $str80$Find_the_first_gaf_assertion_such, $list81, $list10 );
    utilities_macros.register_cyc_api_function( $sym82$PRED_U_V_HOLDS_IN_MT, $list83, $str84$Find_the_first_gaf_assertion_such, $list85, $list10 );
    utilities_macros.register_cyc_api_function( $sym86$PRED_U_V_HOLDS_IN_MTS, $list87, $str88$Find_the_first_gaf_assertion_such, $list89, $list10 );
    utilities_macros.register_cyc_api_function( $sym90$PRED_U_V_HOLDS_IN_ANY_MT, $list79, $str91$Find_the_first_gaf_assertion_such, $list81, $list10 );
    utilities_macros.register_cyc_api_function( $sym92$PRED_U_V_HOLDS_IN_RELEVANT_MTS, $list93, $str94$If_MT_is_NIL__behaves_like_PRED_U, $list81, $list10 );
    utilities_macros.register_cyc_api_function( $sym100$PRED_VALUE_TUPLES, $list101, $str102$Find_all_gaf_assertions_such_that, $list103, $list104 );
    utilities_macros.register_cyc_api_function( $sym105$PRED_VALUE_TUPLES_IN_MT, $list106, $str107$Find_all_gaf_assertions_such_that, $list108, $list104 );
    utilities_macros.register_cyc_api_function( $sym109$PRED_VALUE_TUPLES_IN_MTS, $list110, $str111$Find_all_gaf_assertions_such_that, $list112, $list104 );
    utilities_macros.register_cyc_api_function( $sym113$PRED_VALUE_TUPLES_IN_ANY_MT, $list101, $str114$Find_all_gaf_assertions_such_that, $list103, $list104 );
    utilities_macros.register_cyc_api_function( $sym115$PRED_VALUE_TUPLES_IN_RELEVANT_MTS, $list116, $str117$If_MT_is_NIL__behaves_like_PRED_V, $list103, $list104 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_mapping_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_mapping_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_mapping_utilities_file();
  }
  static
  {
    me = new kb_mapping_utilities();
    $use_optimized_pred_arg_values_fixed_arityP$ = null;
    $kw0$TRUE = makeKeyword( "TRUE" );
    $sym1$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym2$FORT_P = makeSymbol( "FORT-P" );
    $sym3$INTEGERP = makeSymbol( "INTEGERP" );
    $sym4$TRUTH_P = makeSymbol( "TRUTH-P" );
    $kw5$GAF = makeKeyword( "GAF" );
    $sym6$SOME_PRED_VALUE = makeSymbol( "SOME-PRED-VALUE" );
    $list7 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword(
        "TRUE" ) ) );
    $str8$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL." );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), makeSymbol(
        "INTEGERP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $list10 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym11$HLMT_P = makeSymbol( "HLMT-P" );
    $sym12$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $sym13$SOME_PRED_VALUE_IN_MT = makeSymbol( "SOME-PRED-VALUE-IN-MT" );
    $list14 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ),
        makeKeyword( "TRUE" ) ) );
    $str15$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL." );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol(
        "HLMT-P" ) ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $sym17$LISTP = makeSymbol( "LISTP" );
    $sym18$RELEVANT_MT_IS_IN_LIST = makeSymbol( "RELEVANT-MT-IS-IN-LIST" );
    $sym19$SOME_PRED_VALUE_IN_MTS = makeSymbol( "SOME-PRED-VALUE-IN-MTS" );
    $list20 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "MTS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ),
        makeKeyword( "TRUE" ) ) );
    $str21$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL." );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "MTS" ), makeSymbol(
        "LISTP" ) ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $sym23$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const24$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym25$SOME_PRED_VALUE_IN_ANY_MT = makeSymbol( "SOME-PRED-VALUE-IN-ANY-MT" );
    $str26$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL." );
    $sym27$SOME_PRED_VALUE_IN_RELEVANT_MTS = makeSymbol( "SOME-PRED-VALUE-IN-RELEVANT-MTS" );
    $list28 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ),
        makeKeyword( "TRUE" ) ) );
    $str29$If_MT_is_NIL__behaves_like_SOME_P = makeString( "If MT is NIL, behaves like SOME-PRED-VALUE.  Otherwise, behaves like SOME-PRED-VALUE-IN-MT" );
    $sym30$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym31$FPRED_VALUE = makeSymbol( "FPRED-VALUE" );
    $list32 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), TWO_INTEGER ),
        ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str33$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL." );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), makeSymbol(
        "INTEGERP" ) ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "HL-TERM-P" ) ) );
    $sym36$FPRED_VALUE_IN_MT = makeSymbol( "FPRED-VALUE-IN-MT" );
    $list37 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol(
        "GATHER-ARG" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str38$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL." );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol(
        "HLMT-P" ) ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol(
            "TRUTH-P" ) ) );
    $sym40$FPRED_VALUE_IN_MTS = makeSymbol( "FPRED-VALUE-IN-MTS" );
    $list41 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "MTS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol(
        "GATHER-ARG" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str42$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL." );
    $list43 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "MTS" ), makeSymbol(
        "LISTP" ) ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol(
            "TRUTH-P" ) ) );
    $sym44$FPRED_VALUE_IN_ANY_MT = makeSymbol( "FPRED-VALUE-IN-ANY-MT" );
    $str45$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL." );
    $sym46$FPRED_VALUE_IN_RELEVANT_MTS = makeSymbol( "FPRED-VALUE-IN-RELEVANT-MTS" );
    $list47 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol(
        "GATHER-ARG" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str48$If_MT_is_NIL__behaves_like_FPRED_ = makeString( "If MT is NIL, behaves like FPRED-VALUE.  Otherwise, looks in all genlMts of MT." );
    $sym49$PRED_VALUES = makeSymbol( "PRED-VALUES" );
    $str50$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions." );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "HL-TERM-P" ) ) );
    $sym52$PRED_VALUES_IN_MT = makeSymbol( "PRED-VALUES-IN-MT" );
    $str53$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions." );
    $sym54$PRED_VALUES_IN_MTS = makeSymbol( "PRED-VALUES-IN-MTS" );
    $str55$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions." );
    $sym56$PRED_VALUES_IN_ANY_MT = makeSymbol( "PRED-VALUES-IN-ANY-MT" );
    $str57$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions." );
    $sym58$PRED_VALUES_IN_RELEVANT_MTS = makeSymbol( "PRED-VALUES-IN-RELEVANT-MTS" );
    $str59$If_MT_is_NIL__behaves_like_PRED_V = makeString( "If MT is NIL, behaves like PRED-VALUES.  Otherwise, behaves like PRED-VALUES-IN-MT" );
    $sym60$PRED_REFS = makeSymbol( "PRED-REFS" );
    $list61 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str62$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions." );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol(
        "TRUTH-P" ) ) );
    $sym64$PRED_REFS_IN_MT = makeSymbol( "PRED-REFS-IN-MT" );
    $list65 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword(
        "TRUE" ) ) );
    $str66$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions." );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), makeSymbol(
        "INTEGERP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $sym68$PRED_REFS_IN_MTS = makeSymbol( "PRED-REFS-IN-MTS" );
    $list69 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "MTS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword(
        "TRUE" ) ) );
    $str70$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions." );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "MTS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), makeSymbol(
        "INTEGERP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $sym72$PRED_REFS_IN_ANY_MT = makeSymbol( "PRED-REFS-IN-ANY-MT" );
    $str73$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions." );
    $sym74$PRED_REFS_IN_RELEVANT_MTS = makeSymbol( "PRED-REFS-IN-RELEVANT-MTS" );
    $list75 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword(
        "TRUE" ) ) );
    $str76$If_MT_is_NIL__behaves_like_PRED_R = makeString( "If MT is NIL, behaves like PRED-REFS.  Otherwise, behaves like PRED-REFS-IN-MT" );
    $sym77$HL_TERM_P = makeSymbol( "HL-TERM-P" );
    $sym78$PRED_U_V_HOLDS = makeSymbol( "PRED-U-V-HOLDS" );
    $list79 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "U" ), makeSymbol( "V" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "U-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "V-ARG" ),
        TWO_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str80$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL." );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "U" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "V" ), makeSymbol(
        "HL-TERM-P" ) ), ConsesLow.list( makeSymbol( "U-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "V-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol(
            "TRUTH-P" ) ) );
    $sym82$PRED_U_V_HOLDS_IN_MT = makeSymbol( "PRED-U-V-HOLDS-IN-MT" );
    $list83 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "U" ), makeSymbol( "V" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "U-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol(
        "V-ARG" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str84$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL." );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "U" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "V" ), makeSymbol(
        "HL-TERM-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ), ConsesLow.list( makeSymbol( "U-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "V-ARG" ), makeSymbol( "INTEGERP" ) ),
        ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $sym86$PRED_U_V_HOLDS_IN_MTS = makeSymbol( "PRED-U-V-HOLDS-IN-MTS" );
    $list87 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "U" ), makeSymbol( "V" ), makeSymbol( "MTS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "U-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol(
        "V-ARG" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str88$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL." );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "U" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "V" ), makeSymbol(
        "HL-TERM-P" ) ), ConsesLow.list( makeSymbol( "MTS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "U-ARG" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "V-ARG" ), makeSymbol( "INTEGERP" ) ),
        ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $sym90$PRED_U_V_HOLDS_IN_ANY_MT = makeSymbol( "PRED-U-V-HOLDS-IN-ANY-MT" );
    $str91$Find_the_first_gaf_assertion_such = makeString(
        "Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL." );
    $sym92$PRED_U_V_HOLDS_IN_RELEVANT_MTS = makeSymbol( "PRED-U-V-HOLDS-IN-RELEVANT-MTS" );
    $list93 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "U" ), makeSymbol( "V" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "U-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol(
        "V-ARG" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str94$If_MT_is_NIL__behaves_like_PRED_U = makeString( "If MT is NIL, behaves like PRED-U-V-HOLDS.  Otherwise, behaves like PRED-U-V-HOLDS-IN-MT" );
    $sym95$CONSP = makeSymbol( "CONSP" );
    $kw96$GAF_ARG = makeKeyword( "GAF-ARG" );
    $kw97$PREDICATE_EXTENT = makeKeyword( "PREDICATE-EXTENT" );
    $kw98$OVERLAP = makeKeyword( "OVERLAP" );
    $str99$_S_is_not_a_valid_arg_position_li = makeString( "~S is not a valid arg-position list" );
    $sym100$PRED_VALUE_TUPLES = makeSymbol( "PRED-VALUE-TUPLES" );
    $list101 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "INDEX-ARG" ), makeSymbol( "GATHER-ARGS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword(
        "TRUE" ) ) );
    $str102$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions." );
    $list103 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "INDEX-ARG" ),
        makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "GATHER-ARGS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol( "TRUTH-P" ) ) );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "LISTP" ) ) );
    $sym105$PRED_VALUE_TUPLES_IN_MT = makeSymbol( "PRED-VALUE-TUPLES-IN-MT" );
    $list106 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "INDEX-ARG" ), makeSymbol( "GATHER-ARGS" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TRUTH" ),
        makeKeyword( "TRUE" ) ) );
    $str107$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions." );
    $list108 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "INDEX-ARG" ),
        makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "GATHER-ARGS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol(
            "TRUTH-P" ) ) );
    $sym109$PRED_VALUE_TUPLES_IN_MTS = makeSymbol( "PRED-VALUE-TUPLES-IN-MTS" );
    $list110 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "INDEX-ARG" ), makeSymbol( "GATHER-ARGS" ), makeSymbol( "MTS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TRUTH" ),
        makeKeyword( "TRUE" ) ) );
    $str111$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions." );
    $list112 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ), ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "INDEX-ARG" ),
        makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "GATHER-ARGS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "MTS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "TRUTH" ), makeSymbol(
            "TRUTH-P" ) ) );
    $sym113$PRED_VALUE_TUPLES_IN_ANY_MT = makeSymbol( "PRED-VALUE-TUPLES-IN-ANY-MT" );
    $str114$Find_all_gaf_assertions_such_that = makeString(
        "Find all gaf assertions such that:\n (a) the assertion is allowed to be from any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions." );
    $sym115$PRED_VALUE_TUPLES_IN_RELEVANT_MTS = makeSymbol( "PRED-VALUE-TUPLES-IN-RELEVANT-MTS" );
    $list116 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "INDEX-ARG" ), makeSymbol( "GATHER-ARGS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "TRUTH" ),
        makeKeyword( "TRUE" ) ) );
    $str117$If_MT_is_NIL__behaves_like_PRED_V = makeString( "If MT is NIL, behaves like PRED-VALUE-TUPLES.  Otherwise, behaves like PRED-VALUE-TUPLES-IN-MT" );
    $sym118$_EXIT = makeSymbol( "%EXIT" );
  }
}
/*
 * 
 * Total time: 2061 ms
 * 
 */