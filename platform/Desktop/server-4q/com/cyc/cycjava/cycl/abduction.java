package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class abduction
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.abduction";
  public static final String myFingerPrint = "f46516c715c42045f30e3a9f91cc213d6dbe01d67b1974e99fdc221b1613b790";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1003L)
  private static SubLSymbol $default_abductive_inference_properties$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLObject $const2$AbducedTermFn;
  private static final SubLSymbol $kw3$ABDUCTION;
  private static final SubLSymbol $sym4$INFERENCE_ANSWER_JUSTIFICATION_ABDUCTION_COUNT;
  private static final SubLSymbol $sym5$_;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1767L)
  public static SubLObject default_abduction_inference_parameters()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.copy_list( $default_abductive_inference_properties$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1890L)
  public static SubLObject default_abduction_answer_filter(final SubLObject v_bindings, final SubLObject inference)
  {
    final SubLObject query = inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence( inference_datastructures_inference.inference_hl_query( inference ) );
    SubLObject good_bindings = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding;
      SubLObject binding_list = NIL;
      SubLObject supports = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
      binding_list = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
      supports = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != list_utilities.singletonP( supports ) )
        {
          final SubLObject v_abduction = supports.first();
          final SubLObject sentence = arguments.support_sentence( v_abduction );
          if( NIL == unification_utilities.asent_unify( query, sentence, UNPROVIDED, UNPROVIDED ) )
          {
            good_bindings = ConsesLow.cons( binding, good_bindings );
          }
        }
        else
        {
          good_bindings = ConsesLow.cons( binding, good_bindings );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( good_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2617L)
  public static SubLObject cyc_abduction(final SubLObject formula, final SubLObject mt, SubLObject v_inference_parameters, SubLObject ranking_fn, SubLObject type_check_enabled)
  {
    if( v_inference_parameters == UNPROVIDED )
    {
      v_inference_parameters = NIL;
    }
    if( ranking_fn == UNPROVIDED )
    {
      ranking_fn = NIL;
    }
    if( type_check_enabled == UNPROVIDED )
    {
      type_check_enabled = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_properties = list_utilities.nmerge_plist( default_abduction_inference_parameters(), v_inference_parameters );
    SubLObject v_bindings = NIL;
    SubLObject reason = NIL;
    SubLObject inference = NIL;
    final SubLObject _prev_bind_0 = inference_worker_transformation.$inference_transformation_type_checking_enabledP$.currentBinding( thread );
    try
    {
      inference_worker_transformation.$inference_transformation_type_checking_enabledP$.bind( type_check_enabled, thread );
      thread.resetMultipleValues();
      final SubLObject v_bindings_$1 = inference_kernel.new_cyc_query( formula, mt, inference_properties );
      final SubLObject reason_$2 = thread.secondMultipleValue();
      final SubLObject inference_$3 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      v_bindings = v_bindings_$1;
      reason = reason_$2;
      inference = inference_$3;
    }
    finally
    {
      inference_worker_transformation.$inference_transformation_type_checking_enabledP$.rebind( _prev_bind_0, thread );
    }
    v_bindings = default_abduction_answer_filter( v_bindings, inference );
    if( ranking_fn.isFunctionSpec() )
    {
      v_bindings = Sort.sort( v_bindings, ranking_fn, UNPROVIDED );
    }
    return Values.values( v_bindings, reason, inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3971L)
  public static SubLObject abduced_term_p(final SubLObject nat)
  {
    return cycl_utilities.nat_with_functor_p( nat, $const2$AbducedTermFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4214L)
  public static SubLObject abduction_support_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != arguments.hl_support_p( v_object ) && arguments.hl_support_module( v_object ) == $kw3$ABDUCTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4346L)
  public static SubLObject abduction_supports(final SubLObject supports)
  {
    SubLObject abductions = NIL;
    SubLObject cdolist_list_var = supports;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != abduction_support_p( support ) )
      {
        abductions = ConsesLow.cons( support, abductions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return Sequences.nreverse( abductions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4615L)
  public static SubLObject proof_abductions(final SubLObject proof)
  {
    return abduction_supports( inference_datastructures_proof.all_proof_supports( proof ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4716L)
  public static SubLObject proof_abduced_support_ratio(final SubLObject proof)
  {
    final SubLObject total_support_count = Sequences.length( inference_datastructures_proof.all_proof_supports( proof ) );
    return total_support_count.isPositive() ? Numbers.divide( Sequences.length( proof_abductions( proof ) ), total_support_count ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5005L)
  public static SubLObject inference_answer_justification_abductions(final SubLObject justification)
  {
    return abduction_supports( inference_datastructures_inference.inference_answer_justification_supports( justification ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5168L)
  public static SubLObject inference_answer_justification_abduction_count(final SubLObject justification)
  {
    return Sequences.length( inference_answer_justification_abductions( justification ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5329L)
  public static SubLObject inference_answer_minimal_abduction_count(final SubLObject inference_answer)
  {
    final SubLObject abduction_counts = Mapping.mapcar( $sym4$INFERENCE_ANSWER_JUSTIFICATION_ABDUCTION_COUNT, inference_datastructures_inference.inference_answer_justifications( inference_answer ) );
    return list_utilities.extremal( abduction_counts, Symbols.symbol_function( $sym5$_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5598L)
  public static SubLObject minimal_use_of_abduction_supports(final SubLObject result1, final SubLObject result2)
  {
    final SubLObject ab_supports1 = abduction_supports( conses_high.second( result1 ) );
    final SubLObject ab_supports2 = abduction_supports( conses_high.second( result2 ) );
    return Numbers.numLE( Sequences.length( ab_supports1 ), Sequences.length( ab_supports2 ) );
  }

  public static SubLObject declare_abduction_file()
  {
    SubLFiles.declareFunction( me, "default_abduction_inference_parameters", "DEFAULT-ABDUCTION-INFERENCE-PARAMETERS", 0, 0, false );
    SubLFiles.declareFunction( me, "default_abduction_answer_filter", "DEFAULT-ABDUCTION-ANSWER-FILTER", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_abduction", "CYC-ABDUCTION", 2, 3, false );
    SubLFiles.declareFunction( me, "abduced_term_p", "ABDUCED-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "abduction_support_p", "ABDUCTION-SUPPORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "abduction_supports", "ABDUCTION-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_abductions", "PROOF-ABDUCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_abduced_support_ratio", "PROOF-ABDUCED-SUPPORT-RATIO", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_abductions", "INFERENCE-ANSWER-JUSTIFICATION-ABDUCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_abduction_count", "INFERENCE-ANSWER-JUSTIFICATION-ABDUCTION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_minimal_abduction_count", "INFERENCE-ANSWER-MINIMAL-ABDUCTION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "minimal_use_of_abduction_supports", "MINIMAL-USE-OF-ABDUCTION-SUPPORTS", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_abduction_file()
  {
    $default_abductive_inference_properties$ = SubLFiles.defparameter( "*DEFAULT-ABDUCTIVE-INFERENCE-PROPERTIES*", $list0 );
    return NIL;
  }

  public static SubLObject setup_abduction_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_abduction_file();
  }

  @Override
  public void initializeVariables()
  {
    init_abduction_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_abduction_file();
  }
  static
  {
    me = new abduction();
    $default_abductive_inference_properties$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { makeKeyword( "ABDUCTION-ALLOWED?" ), T, makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), T, makeKeyword( "RESULT-UNIQUENESS" ), makeKeyword( "PROOF" ), makeKeyword(
        "RETURN" ), makeKeyword( "BINDINGS-AND-SUPPORTS" ), makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), T, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER, makeKeyword( "MAX-NUMBER" ), TEN_INTEGER,
      makeKeyword( "MAX-TIME" ), makeInteger( 300 ), makeKeyword( "BROWSABLE?" ), T, makeKeyword( "CONTINUABLE?" ), T
    } );
    $list1 = ConsesLow.list( makeSymbol( "BINDING-LIST" ), makeSymbol( "SUPPORTS" ) );
    $const2$AbducedTermFn = constant_handles.reader_make_constant_shell( makeString( "AbducedTermFn" ) );
    $kw3$ABDUCTION = makeKeyword( "ABDUCTION" );
    $sym4$INFERENCE_ANSWER_JUSTIFICATION_ABDUCTION_COUNT = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION-ABDUCTION-COUNT" );
    $sym5$_ = makeSymbol( "<" );
  }
}
/*
 * 
 * Total time: 38 ms
 * 
 */