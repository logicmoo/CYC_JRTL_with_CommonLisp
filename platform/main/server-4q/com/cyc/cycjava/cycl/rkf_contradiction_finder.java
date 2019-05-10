package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_contradiction_finder
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_contradiction_finder";
  public static final String myFingerPrint = "515a6322a74b82cfa76822d42565186edab654e3bbdad5405c075810ca6567d3";
  private static final SubLSymbol $sym0$RKF_REJECTED;
  private static final SubLSymbol $kw1$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw2$HL;
  private static final SubLSymbol $kw3$CACHE_INFERENCE_RESULTS_;
  private static final SubLSymbol $kw4$RETURN;
  private static final SubLSymbol $kw5$BINDINGS_AND_SUPPORTS;
  private static final SubLSymbol $kw6$RESULT_UNIQUENESS;
  private static final SubLSymbol $kw7$PROOF;
  private static final SubLSymbol $kw8$COMPLETENESS_MINIMIZATION_ALLOWED_;
  private static final SubLSymbol $kw9$MAX_NUMBER;
  private static final SubLSymbol $kw10$MAX_TIME;
  private static final SubLSymbol $kw11$MAX_TRANSFORMATION_DEPTH;
  private static final SubLList $list12;
  private static final SubLObject $const13$rejectedSentence;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-contradiction-finder.lisp", position = 790L)
  public static SubLObject rkf_rejected(final SubLObject formula, SubLObject mt, SubLObject number, SubLObject time)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    if( number == UNPROVIDED )
    {
      number = ONE_INTEGER;
    }
    if( time == UNPROVIDED )
    {
      time = TEN_INTEGER;
    }
    return rkf_rejected_internal( formula, mt, number, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-contradiction-finder.lisp", position = 1164L)
  public static SubLObject rkf_rejected_inference_properties(final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject completeness_minimization_allowedP)
  {
    return ConsesLow.list( new SubLObject[] { $kw1$ANSWER_LANGUAGE, $kw2$HL, $kw3$CACHE_INFERENCE_RESULTS_, NIL, $kw4$RETURN, $kw5$BINDINGS_AND_SUPPORTS, $kw6$RESULT_UNIQUENESS, $kw7$PROOF,
      $kw8$COMPLETENESS_MINIMIZATION_ALLOWED_, completeness_minimization_allowedP, $kw9$MAX_NUMBER, number, $kw10$MAX_TIME, time, $kw11$MAX_TRANSFORMATION_DEPTH, backchain
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-contradiction-finder.lisp", position = 1595L)
  public static SubLObject rkf_rejected_internal(final SubLObject formula, final SubLObject mt, final SubLObject number, final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_arguments = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
    final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( NIL, thread );
      wff_utilities.$check_arg_typesP$.bind( NIL, thread );
      at_vars.$at_check_arg_typesP$.bind( NIL, thread );
      wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
      wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
      wff_utilities.$check_var_typesP$.bind( NIL, thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      wff_vars.$validate_constantsP$.bind( NIL, thread );
      system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
      SubLObject v_properties = rkf_rejected_inference_properties( ONE_INTEGER, number, time, T );
      SubLObject cdolist_list_var = inference_kernel.new_cyc_query( ConsesLow.list( $const13$rejectedSentence, formula ), mt, v_properties );
      SubLObject result = NIL;
      result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = result;
        SubLObject v_bindings = NIL;
        SubLObject supports = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
        supports = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != cyc_kernel.closed_query_bindings_p( v_bindings ) )
          {
            final SubLObject item_var = supports;
            if( NIL == conses_high.member( item_var, v_arguments, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              v_arguments = ConsesLow.cons( item_var, v_arguments );
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        result = cdolist_list_var.first();
      }
      v_properties = rkf_rejected_inference_properties( ZERO_INTEGER, number, time, NIL );
      cdolist_list_var = inference_kernel.new_cyc_query( el_utilities.make_negation( formula ), mt, v_properties );
      result = NIL;
      result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = result;
        SubLObject v_bindings = NIL;
        SubLObject supports = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
        supports = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != cyc_kernel.closed_query_bindings_p( v_bindings ) )
          {
            final SubLObject item_var = supports;
            if( NIL == conses_high.member( item_var, v_arguments, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              v_arguments = ConsesLow.cons( item_var, v_arguments );
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        result = cdolist_list_var.first();
      }
    }
    finally
    {
      system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
      wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
      wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
      wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
      wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
      at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
      wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    SubLObject sorted_arguments = NIL;
    SubLObject cdolist_list_var2 = v_arguments;
    SubLObject result2 = NIL;
    result2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      sorted_arguments = ConsesLow.cons( rkf_argument_communicator.rkf_sort_supports( result2 ), sorted_arguments );
      cdolist_list_var2 = cdolist_list_var2.rest();
      result2 = cdolist_list_var2.first();
    }
    return Sequences.nreverse( sorted_arguments );
  }

  public static SubLObject declare_rkf_contradiction_finder_file()
  {
    SubLFiles.declareFunction( me, "rkf_rejected", "RKF-REJECTED", 1, 3, false );
    SubLFiles.declareFunction( me, "rkf_rejected_inference_properties", "RKF-REJECTED-INFERENCE-PROPERTIES", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_rejected_internal", "RKF-REJECTED-INTERNAL", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_contradiction_finder_file()
  {
    return NIL;
  }

  public static SubLObject setup_rkf_contradiction_finder_file()
  {
    access_macros.register_external_symbol( $sym0$RKF_REJECTED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_contradiction_finder_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_contradiction_finder_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_contradiction_finder_file();
  }
  static
  {
    me = new rkf_contradiction_finder();
    $sym0$RKF_REJECTED = makeSymbol( "RKF-REJECTED" );
    $kw1$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw2$HL = makeKeyword( "HL" );
    $kw3$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $kw4$RETURN = makeKeyword( "RETURN" );
    $kw5$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $kw6$RESULT_UNIQUENESS = makeKeyword( "RESULT-UNIQUENESS" );
    $kw7$PROOF = makeKeyword( "PROOF" );
    $kw8$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" );
    $kw9$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw10$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw11$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $list12 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "SUPPORTS" ) );
    $const13$rejectedSentence = constant_handles.reader_make_constant_shell( makeString( "rejectedSentence" ) );
  }
}
/*
 * 
 * Total time: 50 ms
 * 
 */