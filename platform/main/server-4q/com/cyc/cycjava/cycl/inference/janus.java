package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.encapsulation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class janus
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.janus";
  public static final String myFingerPrint = "75641dd2247477f0fee6a04ea8a075a9d47e2a47ae57d5e2052118fdd4d48789";
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 6102L)
  private static SubLSymbol $janus_transcript_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 11341L)
  private static SubLSymbol $janus_experiment_directory$;
  private static final SubLSymbol $kw0$JANUS_OP;
  private static final SubLSymbol $kw1$CREATE;
  private static final SubLSymbol $kw2$ASSERT;
  private static final SubLSymbol $kw3$QUERY;
  private static final SubLSymbol $sym4$JANUS_CREATE_OPERATION_P;
  private static final SubLSymbol $sym5$JANUS_ASSERT_OPERATION_P;
  private static final SubLSymbol $sym6$JANUS_QUERY_OPERATION_P;
  private static final SubLSymbol $kw7$CONST;
  private static final SubLSymbol $sym8$ASSERTION_IST_FORMULA;
  private static final SubLString $str9$_cyc_projects_inference_janus_tra;
  private static final SubLSymbol $sym10$FILE_VALID_FOR_WRITING_P;
  private static final SubLString $str11$_s_appears_more_than_once__in_pos;
  private static final SubLSymbol $sym12$INVALID_CONSTANT_;
  private static final SubLSymbol $kw13$ALL;
  private static final SubLSymbol $sym14$INVALID_ASSERTION_;
  private static final SubLString $str15$invalid_term_in_assert_op___s__s_;
  private static final SubLString $str16$invalid_constant_in_query_op___s_;
  private static final SubLSymbol $kw17$PROBLEM_STORE;
  private static final SubLString $str18$ignoring_problem_store_reuse_for_;
  private static final SubLString $str19$NEW_CONTINUABLE_INFERENCE___s__s_;
  private static final SubLSymbol $kw20$DEDUCTION;
  private static final SubLString $str21$_cyc_projects_inference_janus_exp;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw25$TRANSCRIPT_FILENAME;
  private static final SubLSymbol $kw26$EXPERIMENT_FILENAME;
  private static final SubLSymbol $kw27$COMMENT;
  private static final SubLSymbol $kw28$OVERRIDING_QUERY_PROPERTIES;
  private static final SubLSymbol $kw29$METRICS;
  private static final SubLList $list30;
  private static final SubLSymbol $kw31$OUTLIER_TIMEOUT;
  private static final SubLSymbol $sym32$_ARETE_OUTLIER_TIMEOUT_;
  private static final SubLSymbol $kw33$SKIP;
  private static final SubLSymbol $kw34$COUNT;
  private static final SubLSymbol $sym35$RUN_KCT_EXPERIMENT;
  private static final SubLSymbol $kw36$TEST_SPEC_SET;
  private static final SubLSymbol $sym37$QUOTE;
  private static final SubLSymbol $kw38$FILENAME;
  private static final SubLSymbol $kw39$INCREMENTAL;
  private static final SubLSymbol $kw40$OVERRIDING_METRICS;
  private static final SubLInteger $int41$600;
  private static final SubLString $str42$Execution_of_Janus_operation__s_f;
  private static final SubLString $str43$unknown_modification_operation_ty;
  private static final SubLSymbol $kw44$NOT_A_QUERY;
  private static final SubLSymbol $kw45$STRENGTH;
  private static final SubLSymbol $kw46$DIRECTION;
  private static final SubLList $list47;
  private static final SubLObject $const48$termOfUnit;
  private static final SubLSymbol $kw49$NAT;
  private static final SubLString $str50$Janus_operation_of_unexpected_typ;
  private static final SubLSymbol $sym51$LISTP;
  private static final SubLString $str52$_s_____s__;
  private static final SubLSymbol $kw53$MORE_COMPLETE;
  private static final SubLSymbol $kw54$EQUALLY_COMPLETE;
  private static final SubLSymbol $kw55$LESS_COMPLETE;
  private static final SubLSymbol $kw56$DIFFERENT;
  private static final SubLSymbol $kw57$TEST;
  private static final SubLSymbol $sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT;
  private static final SubLString $str59$filtered_to_exclude_invalid_forts;
  private static final SubLSymbol $sym60$JANUS_VALID_TEST_RUN_;
  private static final SubLSymbol $sym61$INVALID_INDEXED_TERM_;
  private static final SubLSymbol $kw62$FAILURE;
  private static final SubLSymbol $kw63$BECAME_FAILURE;
  private static final SubLSymbol $kw64$BECAME_SUCCESS;
  private static final SubLSymbol $kw65$CHANGE;

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 850L)
  public static SubLObject janus_operation_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && $kw0$JANUS_OP == v_object.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1051L)
  public static SubLObject janus_operation_type(final SubLObject jop)
  {
    return conses_high.second( jop );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1116L)
  public static SubLObject janus_create_operation_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != janus_operation_p( v_object ) && $kw1$CREATE == janus_operation_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1258L)
  public static SubLObject janus_assert_operation_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != janus_operation_p( v_object ) && $kw2$ASSERT == janus_operation_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1400L)
  public static SubLObject janus_query_operation_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != janus_operation_p( v_object ) && $kw3$QUERY == janus_operation_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1540L)
  public static SubLObject janus_modification_operation_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != janus_create_operation_p( v_object ) || NIL != janus_assert_operation_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1684L)
  public static SubLObject new_janus_create_op(final SubLObject name, final SubLObject external_id, SubLObject tag)
  {
    if( tag == UNPROVIDED )
    {
      tag = control_vars.$janus_tag$.getDynamicValue();
    }
    return encapsulation.encapsulate( ConsesLow.list( $kw0$JANUS_OP, $kw1$CREATE, name, external_id, tag ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1836L)
  public static SubLObject new_janus_deduce_spec(final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    return ConsesLow.list( cnf, mt, direction, variable_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1952L)
  public static SubLObject new_janus_assert_op(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject expected_deduce_specs,
      final SubLObject allowed_rules, SubLObject tag)
  {
    if( tag == UNPROVIDED )
    {
      tag = control_vars.$janus_tag$.getDynamicValue();
    }
    return encapsulation.encapsulate( ConsesLow.list( new SubLObject[] { $kw0$JANUS_OP, $kw2$ASSERT, sentence, mt, strength, direction, expected_deduce_specs, allowed_rules, tag
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 2204L)
  public static SubLObject new_janus_query_op(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties, final SubLObject expected_result, final SubLObject expected_halt_reason, SubLObject tag)
  {
    if( tag == UNPROVIDED )
    {
      tag = control_vars.$janus_tag$.getDynamicValue();
    }
    return encapsulation.encapsulate( ConsesLow.list( $kw0$JANUS_OP, $kw3$QUERY, sentence, mt, query_properties, expected_result, expected_halt_reason, tag ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 2452L)
  public static SubLObject janus_create_op_name(final SubLObject create_jop)
  {
    assert NIL != janus_create_operation_p( create_jop ) : create_jop;
    return encapsulation.unencapsulate_partial( conses_high.third( create_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 2605L)
  public static SubLObject janus_create_op_external_id(final SubLObject create_jop)
  {
    assert NIL != janus_create_operation_p( create_jop ) : create_jop;
    return encapsulation.unencapsulate_partial( conses_high.fourth( create_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 2766L)
  public static SubLObject janus_create_op_tag(final SubLObject create_jop)
  {
    assert NIL != janus_create_operation_p( create_jop ) : create_jop;
    return encapsulation.unencapsulate_partial( conses_high.fifth( create_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 2918L)
  public static SubLObject janus_assert_op_sentence(final SubLObject assert_jop)
  {
    assert NIL != janus_assert_operation_p( assert_jop ) : assert_jop;
    return encapsulation.unencapsulate_partial( conses_high.third( assert_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3075L)
  public static SubLObject janus_assert_op_mt(final SubLObject assert_jop)
  {
    assert NIL != janus_assert_operation_p( assert_jop ) : assert_jop;
    return encapsulation.unencapsulate_partial( conses_high.fourth( assert_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3227L)
  public static SubLObject janus_assert_op_strength(final SubLObject assert_jop)
  {
    assert NIL != janus_assert_operation_p( assert_jop ) : assert_jop;
    return encapsulation.unencapsulate_partial( conses_high.fifth( assert_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3384L)
  public static SubLObject janus_assert_op_direction(final SubLObject assert_jop)
  {
    assert NIL != janus_assert_operation_p( assert_jop ) : assert_jop;
    return encapsulation.unencapsulate_partial( conses_high.sixth( assert_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3542L)
  public static SubLObject janus_assert_op_expected_deduce_specs(final SubLObject assert_jop)
  {
    assert NIL != janus_assert_operation_p( assert_jop ) : assert_jop;
    return encapsulation.unencapsulate_partial( conses_high.seventh( assert_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3714L)
  public static SubLObject janus_assert_op_allowed_rules(final SubLObject assert_jop)
  {
    assert NIL != janus_assert_operation_p( assert_jop ) : assert_jop;
    return encapsulation.unencapsulate_partial( conses_high.eighth( assert_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3877L)
  public static SubLObject janus_assert_op_tag(final SubLObject assert_jop)
  {
    assert NIL != janus_assert_operation_p( assert_jop ) : assert_jop;
    return encapsulation.unencapsulate_partial( conses_high.ninth( assert_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4029L)
  public static SubLObject janus_query_op_sentence(final SubLObject query_jop)
  {
    assert NIL != janus_query_operation_p( query_jop ) : query_jop;
    return encapsulation.unencapsulate_partial( conses_high.third( query_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4181L)
  public static SubLObject janus_query_op_mt(final SubLObject query_jop)
  {
    assert NIL != janus_query_operation_p( query_jop ) : query_jop;
    return encapsulation.unencapsulate_partial( conses_high.fourth( query_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4328L)
  public static SubLObject janus_query_op_query_properties(final SubLObject query_jop)
  {
    assert NIL != janus_query_operation_p( query_jop ) : query_jop;
    return encapsulation.unencapsulate_partial( conses_high.fifth( query_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4488L)
  public static SubLObject janus_query_op_expected_result(final SubLObject query_jop)
  {
    assert NIL != janus_query_operation_p( query_jop ) : query_jop;
    return encapsulation.unencapsulate_partial( conses_high.sixth( query_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4647L)
  public static SubLObject janus_query_op_expected_halt_reason(final SubLObject query_jop)
  {
    assert NIL != janus_query_operation_p( query_jop ) : query_jop;
    return encapsulation.unencapsulate_partial( conses_high.seventh( query_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4813L)
  public static SubLObject janus_query_op_tag(final SubLObject query_jop)
  {
    assert NIL != janus_query_operation_p( query_jop ) : query_jop;
    return encapsulation.unencapsulate_partial( conses_high.eighth( query_jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4961L)
  public static SubLObject janus_new_constantP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && NIL != subl_promotions.memberP( v_object, control_vars.$janus_new_constants$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5114L)
  public static SubLObject janus_dwim_constant(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject position = Sequences.position( constant, control_vars.$janus_new_constants$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ConsesLow.list( $kw7$CONST, position );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5260L)
  public static SubLObject janus_dwimmed_constant_id(final SubLObject constant)
  {
    return conses_high.second( janus_dwim_constant( constant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5363L)
  public static SubLObject janus_dwimmed_constantP(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.doubletonP( v_object ) && $kw7$CONST == v_object.first() && NIL != subl_promotions.non_negative_integer_p( conses_high.second( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5529L)
  public static SubLObject janus_dwim_expression(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject dwimmed_expression = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding( thread );
    try
    {
      czer_vars.$assertion_key$.bind( $sym8$ASSERTION_IST_FORMULA, thread );
      dwimmed_expression = cycl_utilities.hl_to_el( expression );
    }
    finally
    {
      czer_vars.$assertion_key$.rebind( _prev_bind_0, thread );
    }
    return dwimmed_expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5837L)
  public static SubLObject set_janus_tag(final SubLObject tag)
  {
    control_vars.$janus_tag$.setDynamicValue( tag );
    return tag;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5938L)
  public static SubLObject janus_test_case_loggingP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return control_vars.$janus_test_case_loggingP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 6021L)
  public static SubLObject janus_within_somethingP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return control_vars.$janus_within_somethingP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 6202L)
  public static SubLObject janus_transcript_full_filename(final SubLObject filename)
  {
    return arete.arete_experiment_full_filename( filename, $janus_transcript_directory$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 6343L)
  public static SubLObject save_janus_transcript(SubLObject filename, final SubLObject form, SubLObject internalP)
  {
    if( internalP == UNPROVIDED )
    {
      internalP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    filename = janus_transcript_full_filename( filename );
    assert NIL != file_utilities.file_valid_for_writing_p( filename ) : filename;
    thread.resetMultipleValues();
    final SubLObject jops = extract_janus_operations( form );
    final SubLObject time = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != internalP )
    {
      cfasl_utilities.cfasl_save( jops, filename );
    }
    else
    {
      cfasl_utilities.cfasl_save_externalized( jops, filename );
    }
    return time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 6850L)
  public static SubLObject load_janus_transcript(SubLObject filename)
  {
    filename = janus_transcript_full_filename( filename );
    return cfasl_utilities.cfasl_load( filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 7049L)
  public static SubLObject janus_op_index(final SubLObject jops, final SubLObject jop)
  {
    final SubLObject indices = janus_op_indices( jops, jop );
    final SubLObject index = indices.first();
    if( NIL != list_utilities.lengthG( indices, ONE_INTEGER, UNPROVIDED ) )
    {
      Errors.warn( $str11$_s_appears_more_than_once__in_pos, jop, indices );
    }
    return index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 7508L)
  public static SubLObject janus_op_indices(final SubLObject jops, final SubLObject jop)
  {
    SubLObject indices = NIL;
    SubLObject list_var = NIL;
    SubLObject candidate_jop = NIL;
    SubLObject index = NIL;
    list_var = jops;
    candidate_jop = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), candidate_jop = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      if( jop.equalp( candidate_jop ) )
      {
        indices = ConsesLow.cons( index, indices );
      }
    }
    return Sequences.nreverse( indices );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 7804L)
  public static SubLObject extract_janus_operations(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject jops = NIL;
    SubLObject time = NIL;
    final SubLObject _prev_bind_0 = control_vars.$janus_test_case_loggingP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$janus_new_constants$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$janus_operations$.currentBinding( thread );
    try
    {
      control_vars.$janus_test_case_loggingP$.bind( T, thread );
      control_vars.$janus_new_constants$.bind( NIL, thread );
      control_vars.$janus_operations$.bind( NIL, thread );
      final SubLObject time_var = Time.get_internal_real_time();
      final SubLObject _prev_bind_0_$1 = control_vars.$read_require_constant_exists$.currentBinding( thread );
      try
      {
        control_vars.$read_require_constant_exists$.bind( NIL, thread );
        Eval.eval( form );
      }
      finally
      {
        control_vars.$read_require_constant_exists$.rebind( _prev_bind_0_$1, thread );
      }
      time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      jops = Sequences.nreverse( control_vars.$janus_operations$.getDynamicValue( thread ) );
    }
    finally
    {
      control_vars.$janus_operations$.rebind( _prev_bind_3, thread );
      control_vars.$janus_new_constants$.rebind( _prev_bind_2, thread );
      control_vars.$janus_test_case_loggingP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( jops, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 8223L)
  public static SubLObject janus_note_create_finished(final SubLObject new_constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != janus_test_case_loggingP() && NIL != constant_handles.valid_constantP( new_constant, UNPROVIDED ) )
    {
      final SubLObject new_cons = ConsesLow.cons( new_constant, NIL );
      final SubLObject list = control_vars.$janus_new_constants$.getDynamicValue( thread );
      if( NIL != list )
      {
        subl_macros.rplacd_last( list, new_cons );
      }
      else
      {
        control_vars.$janus_new_constants$.setDynamicValue( new_cons, thread );
      }
      final SubLObject name = constants_high.constant_name( new_constant );
      final SubLObject external_id = constants_high.constant_external_id( new_constant );
      control_vars.$janus_operations$.setDynamicValue( ConsesLow.cons( new_janus_create_op( name, external_id, UNPROVIDED ), control_vars.$janus_operations$.getDynamicValue( thread ) ), thread );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 8752L)
  public static SubLObject janus_note_assert_finished(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject deduce_specs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == janus_test_case_loggingP() || NIL != janus_within_somethingP() )
    {
      return NIL;
    }
    deduce_specs = janus_dwim_expression( deduce_specs );
    final SubLObject allowed_rules = kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue( thread );
    if( NIL != cycl_utilities.expression_find_if( $sym12$INVALID_CONSTANT_, sentence, UNPROVIDED, UNPROVIDED ) || NIL != cycl_utilities.expression_find_if( $sym12$INVALID_CONSTANT_, mt, UNPROVIDED, UNPROVIDED )
        || NIL != cycl_utilities.expression_find_if( $sym12$INVALID_CONSTANT_, deduce_specs, UNPROVIDED, UNPROVIDED ) || NIL != ( ( $kw13$ALL == allowed_rules ) ? NIL
            : Sequences.find_if( $sym14$INVALID_ASSERTION_, allowed_rules, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
    {
      Errors.warn( $str15$invalid_term_in_assert_op___s__s_, new SubLObject[] { sentence, mt, deduce_specs, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue( thread )
      } );
      return NIL;
    }
    control_vars.$janus_operations$.setDynamicValue( ConsesLow.cons( new_janus_assert_op( sentence, mt, strength, direction, deduce_specs, allowed_rules, UNPROVIDED ), control_vars.$janus_operations$.getDynamicValue(
        thread ) ), thread );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 9573L)
  public static SubLObject janus_note_query_finished(final SubLObject sentence, final SubLObject mt, SubLObject query_properties, SubLObject result, final SubLObject halt_reason)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != janus_test_case_loggingP() && NIL == janus_within_somethingP() )
    {
      result = janus_dwim_expression( result );
      if( NIL != cycl_utilities.expression_find_if( $sym12$INVALID_CONSTANT_, sentence, UNPROVIDED, UNPROVIDED ) || NIL != cycl_utilities.expression_find_if( $sym12$INVALID_CONSTANT_, mt, UNPROVIDED, UNPROVIDED ) )
      {
        Errors.warn( $str16$invalid_constant_in_query_op___s_, sentence, mt );
        return NIL;
      }
      if( NIL != conses_high.getf( query_properties, $kw17$PROBLEM_STORE, UNPROVIDED ) )
      {
        Errors.warn( $str18$ignoring_problem_store_reuse_for_, sentence, mt, query_properties );
        query_properties = conses_high.remf( conses_high.copy_list( query_properties ), $kw17$PROBLEM_STORE );
      }
      control_vars.$janus_operations$.setDynamicValue( ConsesLow.cons( new_janus_query_op( sentence, mt, query_properties, result, halt_reason, UNPROVIDED ), control_vars.$janus_operations$.getDynamicValue( thread ) ),
          thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 10363L)
  public static SubLObject janus_note_new_continuable_inference(final SubLObject sentence, final SubLObject mt, final SubLObject query_static_properties)
  {
    if( NIL != janus_test_case_loggingP() && NIL == janus_within_somethingP() )
    {
      Errors.warn( $str19$NEW_CONTINUABLE_INFERENCE___s__s_, sentence, mt, query_static_properties );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 10663L)
  public static SubLObject janus_note_argument(final SubLObject argument_spec, SubLObject cnf, SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != janus_test_case_loggingP() || NIL != janus_test_case_runningP() )
    {
      cnf = janus_dwim_expression( cnf );
      mt = janus_dwim_expression( mt );
      if( $kw20$DEDUCTION == arguments.argument_spec_type( argument_spec ) )
      {
        if( NIL != janus_test_case_runningP() )
        {
          control_vars.$janus_testing_deduce_specs$.setDynamicValue( ConsesLow.cons( new_janus_deduce_spec( cnf, mt, direction, variable_map ), control_vars.$janus_testing_deduce_specs$.getDynamicValue( thread ) ),
              thread );
        }
        else
        {
          control_vars.$janus_extraction_deduce_specs$.setDynamicValue( ConsesLow.cons( new_janus_deduce_spec( cnf, mt, direction, variable_map ), control_vars.$janus_extraction_deduce_specs$.getDynamicValue( thread ) ),
              thread );
        }
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 11465L)
  public static SubLObject janus_experiment_full_filename(final SubLObject filename)
  {
    return arete.arete_experiment_full_filename( filename, $janus_experiment_directory$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 11606L)
  public static SubLObject run_janus_experiment(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
      if( NIL == conses_high.member( current_$2, $list23, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw24$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
    }
    final SubLObject transcript_filename_tail = cdestructuring_bind.property_list_member( $kw25$TRANSCRIPT_FILENAME, current );
    final SubLObject transcript_filename = ( NIL != transcript_filename_tail ) ? conses_high.cadr( transcript_filename_tail ) : NIL;
    final SubLObject experiment_filename_tail = cdestructuring_bind.property_list_member( $kw26$EXPERIMENT_FILENAME, current );
    final SubLObject experiment_filename = ( NIL != experiment_filename_tail ) ? conses_high.cadr( experiment_filename_tail ) : NIL;
    final SubLObject comment_tail = cdestructuring_bind.property_list_member( $kw27$COMMENT, current );
    final SubLObject comment = ( NIL != comment_tail ) ? conses_high.cadr( comment_tail ) : NIL;
    final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member( $kw28$OVERRIDING_QUERY_PROPERTIES, current );
    final SubLObject overriding_query_properties = ( NIL != overriding_query_properties_tail ) ? conses_high.cadr( overriding_query_properties_tail ) : NIL;
    final SubLObject metrics_tail = cdestructuring_bind.property_list_member( $kw29$METRICS, current );
    final SubLObject metrics = ( NIL != metrics_tail ) ? conses_high.cadr( metrics_tail ) : $list30;
    final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member( $kw31$OUTLIER_TIMEOUT, current );
    final SubLObject outlier_timeout = ( NIL != outlier_timeout_tail ) ? conses_high.cadr( outlier_timeout_tail ) : $sym32$_ARETE_OUTLIER_TIMEOUT_;
    final SubLObject skip_tail = cdestructuring_bind.property_list_member( $kw33$SKIP, current );
    final SubLObject skip = ( NIL != skip_tail ) ? conses_high.cadr( skip_tail ) : ZERO_INTEGER;
    final SubLObject count_tail = cdestructuring_bind.property_list_member( $kw34$COUNT, current );
    final SubLObject count = ( NIL != count_tail ) ? conses_high.cadr( count_tail ) : NIL;
    final SubLObject jops = load_janus_transcript( transcript_filename );
    final SubLObject experiment_full_filename = janus_experiment_full_filename( experiment_filename );
    return ConsesLow.list( new SubLObject[] { $sym35$RUN_KCT_EXPERIMENT, $kw36$TEST_SPEC_SET, ConsesLow.list( $sym37$QUOTE, jops ), $kw38$FILENAME, experiment_full_filename, $kw27$COMMENT, comment, $kw39$INCREMENTAL, T,
      $kw28$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $kw40$OVERRIDING_METRICS, metrics, $kw31$OUTLIER_TIMEOUT, outlier_timeout, $kw33$SKIP, skip, $kw34$COUNT, count
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 12289L)
  public static SubLObject janus_test_case_runningP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return control_vars.$janus_test_case_runningP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 12372L)
  public static SubLObject execute_janus_operations(final SubLObject jops, SubLObject metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP, SubLObject start,
      SubLObject end)
  {
    if( metrics == UNPROVIDED )
    {
      metrics = NIL;
    }
    if( outlier_timeout == UNPROVIDED )
    {
      outlier_timeout = $int41$600;
    }
    if( overriding_query_properties == UNPROVIDED )
    {
      overriding_query_properties = NIL;
    }
    if( include_resultP == UNPROVIDED )
    {
      include_resultP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    SubLObject count = ZERO_INTEGER;
    final SubLObject overall_result = NIL;
    SubLObject list_var = NIL;
    SubLObject jop = NIL;
    SubLObject index = NIL;
    list_var = jops;
    jop = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), jop = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      if( index.numGE( start ) && ( NIL == end || index.numLE( end ) ) )
      {
        final SubLObject jop_result = execute_janus_operation( jop, metrics, outlier_timeout, overriding_query_properties, include_resultP );
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return Values.values( overall_result, count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 12887L)
  public static SubLObject execute_janus_operation(final SubLObject jop, SubLObject metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP)
  {
    if( metrics == UNPROVIDED )
    {
      metrics = NIL;
    }
    if( outlier_timeout == UNPROVIDED )
    {
      outlier_timeout = $int41$600;
    }
    if( overriding_query_properties == UNPROVIDED )
    {
      overriding_query_properties = NIL;
    }
    if( include_resultP == UNPROVIDED )
    {
      include_resultP = NIL;
    }
    return kbq_query_run.kbq_run_query( jop, metrics, outlier_timeout, overriding_query_properties, include_resultP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 13114L)
  public static SubLObject execute_janus_create_operations(final SubLObject jops)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = jops;
    SubLObject jop = NIL;
    jop = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != janus_create_operation_p( jop ) )
      {
        if( NIL != execute_janus_create( jop ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
        else
        {
          Errors.warn( $str42$Execution_of_Janus_operation__s_f, jop );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      jop = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 13389L)
  public static SubLObject execute_janus_modification_operation(final SubLObject jop)
  {
    final SubLObject pcase_var = janus_operation_type( jop );
    if( pcase_var.eql( $kw1$CREATE ) )
    {
      return execute_janus_create( jop );
    }
    if( pcase_var.eql( $kw2$ASSERT ) )
    {
      return execute_janus_assert( jop );
    }
    return Errors.error( $str43$unknown_modification_operation_ty, janus_operation_type( jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 13748L)
  public static SubLObject kill_janus_constants(final SubLObject jops)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = jops;
    SubLObject jop = NIL;
    jop = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $kw1$CREATE == janus_operation_type( jop ) )
      {
        final SubLObject external_id = janus_create_op_external_id( jop );
        if( NIL != constants_high.constant_external_id_p( external_id ) )
        {
          final SubLObject v_const = constants_high.find_constant_by_external_id( external_id );
          if( NIL != constant_handles.constant_p( v_const ) )
          {
            cyc_kernel.cyc_kill( v_const );
            count = Numbers.add( count, ONE_INTEGER );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      jop = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 14151L)
  public static SubLObject execute_janus_create(final SubLObject jop)
  {
    assert NIL != janus_create_operation_p( jop ) : jop;
    final SubLObject name = janus_create_op_name( jop );
    final SubLObject external_id = janus_create_op_external_id( jop );
    final SubLObject result = cyc_kernel.cyc_create( name, external_id );
    return Values.values( result, $kw44$NOT_A_QUERY, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 14606L)
  public static SubLObject execute_janus_assert(SubLObject jop)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != janus_assert_operation_p( jop ) : jop;
    jop = dwim_janus_assert_operation( jop );
    final SubLObject sentence = janus_assert_op_sentence( jop );
    final SubLObject mt = janus_assert_op_mt( jop );
    final SubLObject strength = janus_assert_op_strength( jop );
    final SubLObject direction = janus_assert_op_direction( jop );
    final SubLObject allowed_rules = janus_assert_op_allowed_rules( jop );
    SubLObject deduce_specs = NIL;
    final SubLObject _prev_bind_0 = control_vars.$janus_test_case_runningP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$janus_testing_deduce_specs$.currentBinding( thread );
    try
    {
      control_vars.$janus_test_case_runningP$.bind( T, thread );
      control_vars.$janus_testing_deduce_specs$.bind( NIL, thread );
      final SubLObject _prev_bind_0_$3 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding( thread );
      try
      {
        kb_control_vars.$forward_inference_allowed_rules$.bind( allowed_rules, thread );
        cyc_kernel.cyc_assert( sentence, mt, ConsesLow.list( $kw45$STRENGTH, strength, $kw46$DIRECTION, direction ) );
      }
      finally
      {
        kb_control_vars.$forward_inference_allowed_rules$.rebind( _prev_bind_0_$3, thread );
      }
      deduce_specs = control_vars.$janus_testing_deduce_specs$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$janus_testing_deduce_specs$.rebind( _prev_bind_2, thread );
      control_vars.$janus_test_case_runningP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( deduce_specs, $kw44$NOT_A_QUERY, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 15562L)
  public static SubLObject dwim_janus_assert_operation(SubLObject jop)
  {
    SubLObject current;
    final SubLObject datum = current = jop;
    SubLObject janus_op = NIL;
    SubLObject type = NIL;
    SubLObject sentence = NIL;
    SubLObject mt = NIL;
    SubLObject strength = NIL;
    SubLObject direction = NIL;
    SubLObject expected_deduce_specs = NIL;
    SubLObject allowed_rules = NIL;
    SubLObject tag = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    janus_op = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    strength = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    expected_deduce_specs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    allowed_rules = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    tag = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != list_utilities.tree_find( constants_high.constant_external_id( $const48$termOfUnit ), sentence, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
      {
        final SubLObject unencapsulated_sentence = encapsulation.unencapsulate_partial( sentence );
        if( NIL != el_utilities.el_formula_with_operator_p( unencapsulated_sentence, $const48$termOfUnit ) )
        {
          final SubLObject nat = cycl_utilities.formula_arg1( unencapsulated_sentence, UNPROVIDED );
          if( NIL != list_utilities.doubletonP( nat ) && $kw49$NAT.equal( nat.first() ) )
          {
            final SubLObject naut = conses_high.second( nat );
            sentence = el_utilities.replace_formula_arg( ONE_INTEGER, naut, sentence );
            jop = new_janus_assert_op( sentence, mt, strength, direction, expected_deduce_specs, allowed_rules, tag );
          }
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
    }
    return jop;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 16352L)
  public static SubLObject dwim_janus_query_properties(final SubLObject v_properties)
  {
    return v_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 16432L)
  public static SubLObject janus_operation_successP(final SubLObject jop, SubLObject result, SubLObject halt_reason)
  {
    if( halt_reason == UNPROVIDED )
    {
      halt_reason = NIL;
    }
    result = janus_dwim_expression( result );
    final SubLObject pcase_var = janus_operation_type( jop );
    if( pcase_var.eql( $kw1$CREATE ) )
    {
      return janus_create_successP( jop, result );
    }
    if( pcase_var.eql( $kw2$ASSERT ) )
    {
      return janus_assert_successP( jop, result );
    }
    if( pcase_var.eql( $kw3$QUERY ) )
    {
      return janus_query_successP( jop, result, halt_reason );
    }
    return Errors.error( $str50$Janus_operation_of_unexpected_typ, janus_operation_type( jop ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 16889L)
  public static SubLObject janus_create_successP(final SubLObject jop, final SubLObject result)
  {
    return list_utilities.sublisp_boolean( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 16982L)
  public static SubLObject janus_assert_successP(final SubLObject jop, final SubLObject deduce_specs)
  {
    assert NIL != Types.listp( deduce_specs ) : deduce_specs;
    final SubLObject expected_deduce_specs = janus_assert_op_expected_deduce_specs( jop );
    final SubLObject successP = list_utilities.sets_equalP( deduce_specs, expected_deduce_specs, Symbols.symbol_function( EQUALP ) );
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 17357L)
  public static SubLObject janus_query_successP(final SubLObject jop, final SubLObject result, SubLObject halt_reason)
  {
    if( halt_reason == UNPROVIDED )
    {
      halt_reason = NIL;
    }
    final SubLObject expected_result = janus_query_op_expected_result( jop );
    final SubLObject expected_halt_reason = janus_query_op_expected_halt_reason( jop );
    final SubLObject result_successP = janus_query_result_successP( result, expected_result );
    final SubLObject halt_reason_successP = makeBoolean( NIL == halt_reason || halt_reason.equal( expected_halt_reason ) );
    final SubLObject successP = makeBoolean( NIL != result_successP && NIL != halt_reason_successP );
    if( NIL == result_successP )
    {
      PrintLow.format( T, $str52$_s_____s__, result, expected_result );
    }
    if( NIL == halt_reason_successP )
    {
      PrintLow.format( T, $str52$_s_____s__, halt_reason, expected_halt_reason );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 18005L)
  public static SubLObject janus_query_result_successP(final SubLObject result, final SubLObject expected_result)
  {
    if( NIL != bindings.binding_lists_p( result ) )
    {
      return bindings.lists_of_binding_lists_equalP( result, expected_result );
    }
    return list_utilities.sets_equal_equalP( result, expected_result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 18233L)
  public static SubLObject load_janus_experiment(final SubLObject filename)
  {
    final SubLObject full_filename = janus_experiment_full_filename( filename );
    return kbq_query_run.kct_load_test_set_run( full_filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 19937L)
  public static SubLObject janus_experiment_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != kbq_query_run.kct_test_set_run_p( v_object ) && NIL != janus_operation_p( kbq_query_run.kct_test_run_test( kbq_query_run.kct_test_set_run_test_runs( v_object ).first() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 20115L)
  public static SubLObject janus_failure_analysis(final SubLObject test_set_run)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject more_complete = janus_categorize_failing_asserts( test_set_run );
    final SubLObject equally_complete = thread.secondMultipleValue();
    final SubLObject less_complete = thread.thirdMultipleValue();
    final SubLObject different = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $kw53$MORE_COMPLETE, Sequences.length( more_complete ), $kw54$EQUALLY_COMPLETE, Sequences.length( equally_complete ), $kw55$LESS_COMPLETE, Sequences.length( less_complete ), $kw56$DIFFERENT,
        Sequences.length( different ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 20513L)
  public static SubLObject janus_newly_failing_op_failure_reasons(final SubLObject baseline, final SubLObject experiment)
  {
    SubLObject failure_reasons = NIL;
    SubLObject cdolist_list_var = kbq_query_run.kct_compare_test_set_run_statuses( baseline, experiment );
    SubLObject diff = NIL;
    diff = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject test = conses_high.getf( diff, $kw57$TEST, UNPROVIDED );
      final SubLObject baseline_test_run = kbq_query_run.kct_lookup_test_run( baseline, test );
      final SubLObject baseline_result = kbq_query_run.kbq_query_run_result( kbq_query_run.kct_test_run_query_run( baseline_test_run ) );
      final SubLObject experiment_test_run = kbq_query_run.kct_lookup_test_run( experiment, test );
      final SubLObject experiment_result = kbq_query_run.kbq_query_run_result( kbq_query_run.kct_test_run_query_run( experiment_test_run ) );
      failure_reasons = ConsesLow.cons( janus_categorize_failing_assert_int( baseline_result, experiment_result ), failure_reasons );
      cdolist_list_var = cdolist_list_var.rest();
      diff = cdolist_list_var.first();
    }
    return Sequences.nreverse( failure_reasons );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 21195L)
  public static SubLObject janus_categorize_failing_asserts(final SubLObject test_set_run)
  {
    SubLObject more_complete = NIL;
    SubLObject equally_complete = NIL;
    SubLObject less_complete = NIL;
    SubLObject different = NIL;
    SubLObject cdolist_list_var;
    final SubLObject test_runs = cdolist_list_var = kbq_query_run.kct_test_set_run_test_runs( kbq_query_run.kct_failing_test_set_run( test_set_run ) );
    SubLObject test_run = NIL;
    test_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != janus_assert_operation_p( kbq_query_run.kct_test_run_test( test_run ) ) )
      {
        final SubLObject pcase_var = janus_categorize_failing_assert( test_run );
        if( pcase_var.eql( $kw53$MORE_COMPLETE ) )
        {
          more_complete = ConsesLow.cons( test_run, more_complete );
        }
        else if( pcase_var.eql( $kw54$EQUALLY_COMPLETE ) )
        {
          equally_complete = ConsesLow.cons( test_run, equally_complete );
        }
        else if( pcase_var.eql( $kw55$LESS_COMPLETE ) )
        {
          less_complete = ConsesLow.cons( test_run, less_complete );
        }
        else if( pcase_var.eql( $kw56$DIFFERENT ) )
        {
          different = ConsesLow.cons( test_run, different );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      test_run = cdolist_list_var.first();
    }
    return Values.values( more_complete, equally_complete, less_complete, different );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 22162L)
  public static SubLObject janus_categorize_failing_assert(final SubLObject test_run)
  {
    final SubLObject jop = kbq_query_run.kct_test_run_test( test_run );
    final SubLObject expected_deduce_specs = janus_assert_op_expected_deduce_specs( jop );
    final SubLObject query_run = kbq_query_run.kct_test_run_query_run( test_run );
    final SubLObject actual_deduce_specs = kbq_query_run.kbq_query_run_result( query_run );
    return janus_categorize_failing_assert_int( expected_deduce_specs, actual_deduce_specs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 22561L)
  public static SubLObject janus_categorize_failing_assert_int(final SubLObject baseline_deduce_specs, final SubLObject experiment_deduce_specs)
  {
    if( NIL != list_utilities.sets_equalP( baseline_deduce_specs, experiment_deduce_specs, Symbols.symbol_function( EQUALP ) ) )
    {
      return $kw54$EQUALLY_COMPLETE;
    }
    if( NIL != conses_high.subsetp( baseline_deduce_specs, experiment_deduce_specs, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
    {
      return $kw53$MORE_COMPLETE;
    }
    if( NIL != conses_high.subsetp( experiment_deduce_specs, baseline_deduce_specs, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
    {
      return $kw55$LESS_COMPLETE;
    }
    return $kw56$DIFFERENT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 23133L)
  public static SubLObject janus_valid_test_set_run(final SubLObject test_set_run)
  {
    return kbq_query_run.kct_filter_test_set_run_by_test( test_set_run, $str59$filtered_to_exclude_invalid_forts, $sym60$JANUS_VALID_TEST_RUN_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 23454L)
  public static SubLObject janus_valid_test_runP(final SubLObject test_run)
  {
    return makeBoolean( NIL == list_utilities.tree_find_if( $sym61$INVALID_INDEXED_TERM_, test_run, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 23567L)
  public static SubLObject janus_more_complete_test_runs(final SubLObject test_set_run)
  {
    return janus_test_runs_with_assert_failure_status( test_set_run, $kw53$MORE_COMPLETE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 23713L)
  public static SubLObject janus_equally_complete_test_runs(final SubLObject test_set_run)
  {
    return janus_test_runs_with_assert_failure_status( test_set_run, $kw54$EQUALLY_COMPLETE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 23865L)
  public static SubLObject janus_less_complete_test_runs(final SubLObject test_set_run)
  {
    return janus_test_runs_with_assert_failure_status( test_set_run, $kw55$LESS_COMPLETE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 24011L)
  public static SubLObject janus_different_test_runs(final SubLObject test_set_run)
  {
    return janus_test_runs_with_assert_failure_status( test_set_run, $kw56$DIFFERENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 24149L)
  public static SubLObject janus_test_runs_with_assert_failure_status(final SubLObject test_set_run, final SubLObject assert_failure_status)
  {
    SubLObject result_test_runs = NIL;
    SubLObject cdolist_list_var;
    final SubLObject test_runs = cdolist_list_var = kbq_query_run.kct_test_set_run_test_runs( test_set_run );
    SubLObject test_run = NIL;
    test_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $kw62$FAILURE == kbq_query_run.kct_test_run_status( test_run ) && NIL != janus_assert_operation_p( kbq_query_run.kct_test_run_test( test_run ) ) && assert_failure_status.eql( janus_categorize_failing_assert(
          test_run ) ) )
      {
        result_test_runs = ConsesLow.cons( test_run, result_test_runs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      test_run = cdolist_list_var.first();
    }
    return Sequences.nreverse( result_test_runs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 24667L)
  public static SubLObject janus_test_runs_that_started_failing(final SubLObject test_set_run_1, final SubLObject test_set_run_2)
  {
    return janus_test_runs_that_became_status( test_set_run_1, test_set_run_2, $kw63$BECAME_FAILURE, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 24961L)
  public static SubLObject janus_test_runs_that_started_succeeding(final SubLObject test_set_run_1, final SubLObject test_set_run_2)
  {
    return janus_test_runs_that_became_status( test_set_run_1, test_set_run_2, $kw64$BECAME_SUCCESS, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 25256L)
  public static SubLObject janus_test_runs_that_became_status(final SubLObject test_set_run_1, final SubLObject test_set_run_2, final SubLObject status, final SubLObject use_run_1P)
  {
    SubLObject test_runs = NIL;
    SubLObject cdolist_list_var;
    final SubLObject jops = cdolist_list_var = janus_operations_that_became_status( test_set_run_1, test_set_run_2, status );
    SubLObject jop = NIL;
    jop = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject test_run = kbq_query_run.kct_lookup_test_run( ( NIL != use_run_1P ) ? test_set_run_1 : test_set_run_2, jop );
      test_runs = ConsesLow.cons( test_run, test_runs );
      cdolist_list_var = cdolist_list_var.rest();
      jop = cdolist_list_var.first();
    }
    return Sequences.nreverse( test_runs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 25662L)
  public static SubLObject janus_operations_that_became_status(final SubLObject test_set_run_1, final SubLObject test_set_run_2, final SubLObject status)
  {
    SubLObject jops = NIL;
    SubLObject cdolist_list_var;
    final SubLObject differences = cdolist_list_var = kbq_query_run.kct_compare_test_set_run_statuses( test_set_run_1, test_set_run_2 );
    SubLObject diff = NIL;
    diff = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( status.eql( conses_high.getf( diff, $kw65$CHANGE, UNPROVIDED ) ) )
      {
        final SubLObject jop = conses_high.getf( diff, $kw57$TEST, UNPROVIDED );
        jops = ConsesLow.cons( jop, jops );
      }
      cdolist_list_var = cdolist_list_var.rest();
      diff = cdolist_list_var.first();
    }
    return Sequences.nreverse( jops );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 26029L)
  public static SubLObject janus_compare_test_set_run_statuses(final SubLObject test_set_run_1, final SubLObject test_set_run_2)
  {
    SubLObject differences = NIL;
    SubLObject test_run_1 = NIL;
    SubLObject test_run_1_$4 = NIL;
    SubLObject test_run_2 = NIL;
    SubLObject test_run_2_$5 = NIL;
    test_run_1 = kbq_query_run.kct_test_set_run_test_runs( test_set_run_1 );
    test_run_1_$4 = test_run_1.first();
    test_run_2 = kbq_query_run.kct_test_set_run_test_runs( test_set_run_2 );
    test_run_2_$5 = test_run_2.first();
    while ( NIL != test_run_2 || NIL != test_run_1)
    {
      final SubLObject test = kbq_query_run.kct_test_run_test( test_run_1_$4 );
      if( NIL != test_run_1_$4 && NIL != test_run_2_$5 )
      {
        final SubLObject difference = kbq_query_run.kct_compare_test_run_statuses( test_run_1_$4, test_run_2_$5 );
        if( NIL != difference )
        {
          differences = ConsesLow.cons( ConsesLow.list( $kw57$TEST, test, $kw65$CHANGE, difference ), differences );
        }
      }
      test_run_1 = test_run_1.rest();
      test_run_1_$4 = test_run_1.first();
      test_run_2 = test_run_2.rest();
      test_run_2_$5 = test_run_2.first();
    }
    differences = Sequences.nreverse( differences );
    return differences;
  }

  public static SubLObject declare_janus_file()
  {
    SubLFiles.declareFunction( me, "janus_operation_p", "JANUS-OPERATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_operation_type", "JANUS-OPERATION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_create_operation_p", "JANUS-CREATE-OPERATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_assert_operation_p", "JANUS-ASSERT-OPERATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_query_operation_p", "JANUS-QUERY-OPERATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_modification_operation_p", "JANUS-MODIFICATION-OPERATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_janus_create_op", "NEW-JANUS-CREATE-OP", 2, 1, false );
    SubLFiles.declareFunction( me, "new_janus_deduce_spec", "NEW-JANUS-DEDUCE-SPEC", 4, 0, false );
    SubLFiles.declareFunction( me, "new_janus_assert_op", "NEW-JANUS-ASSERT-OP", 6, 1, false );
    SubLFiles.declareFunction( me, "new_janus_query_op", "NEW-JANUS-QUERY-OP", 5, 1, false );
    SubLFiles.declareFunction( me, "janus_create_op_name", "JANUS-CREATE-OP-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_create_op_external_id", "JANUS-CREATE-OP-EXTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_create_op_tag", "JANUS-CREATE-OP-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_assert_op_sentence", "JANUS-ASSERT-OP-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_assert_op_mt", "JANUS-ASSERT-OP-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_assert_op_strength", "JANUS-ASSERT-OP-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_assert_op_direction", "JANUS-ASSERT-OP-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_assert_op_expected_deduce_specs", "JANUS-ASSERT-OP-EXPECTED-DEDUCE-SPECS", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_assert_op_allowed_rules", "JANUS-ASSERT-OP-ALLOWED-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_assert_op_tag", "JANUS-ASSERT-OP-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_query_op_sentence", "JANUS-QUERY-OP-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_query_op_mt", "JANUS-QUERY-OP-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_query_op_query_properties", "JANUS-QUERY-OP-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_query_op_expected_result", "JANUS-QUERY-OP-EXPECTED-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_query_op_expected_halt_reason", "JANUS-QUERY-OP-EXPECTED-HALT-REASON", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_query_op_tag", "JANUS-QUERY-OP-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_new_constantP", "JANUS-NEW-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_dwim_constant", "JANUS-DWIM-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_dwimmed_constant_id", "JANUS-DWIMMED-CONSTANT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_dwimmed_constantP", "JANUS-DWIMMED-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_dwim_expression", "JANUS-DWIM-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_janus_tag", "SET-JANUS-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_test_case_loggingP", "JANUS-TEST-CASE-LOGGING?", 0, 0, false );
    SubLFiles.declareFunction( me, "janus_within_somethingP", "JANUS-WITHIN-SOMETHING?", 0, 0, false );
    SubLFiles.declareFunction( me, "janus_transcript_full_filename", "JANUS-TRANSCRIPT-FULL-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "save_janus_transcript", "SAVE-JANUS-TRANSCRIPT", 2, 1, false );
    SubLFiles.declareFunction( me, "load_janus_transcript", "LOAD-JANUS-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_op_index", "JANUS-OP-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "janus_op_indices", "JANUS-OP-INDICES", 2, 0, false );
    SubLFiles.declareFunction( me, "extract_janus_operations", "EXTRACT-JANUS-OPERATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_note_create_finished", "JANUS-NOTE-CREATE-FINISHED", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_note_assert_finished", "JANUS-NOTE-ASSERT-FINISHED", 5, 0, false );
    SubLFiles.declareFunction( me, "janus_note_query_finished", "JANUS-NOTE-QUERY-FINISHED", 5, 0, false );
    SubLFiles.declareFunction( me, "janus_note_new_continuable_inference", "JANUS-NOTE-NEW-CONTINUABLE-INFERENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "janus_note_argument", "JANUS-NOTE-ARGUMENT", 5, 0, false );
    SubLFiles.declareFunction( me, "janus_experiment_full_filename", "JANUS-EXPERIMENT-FULL-FILENAME", 1, 0, false );
    SubLFiles.declareMacro( me, "run_janus_experiment", "RUN-JANUS-EXPERIMENT" );
    SubLFiles.declareFunction( me, "janus_test_case_runningP", "JANUS-TEST-CASE-RUNNING?", 0, 0, false );
    SubLFiles.declareFunction( me, "execute_janus_operations", "EXECUTE-JANUS-OPERATIONS", 1, 6, false );
    SubLFiles.declareFunction( me, "execute_janus_operation", "EXECUTE-JANUS-OPERATION", 1, 4, false );
    SubLFiles.declareFunction( me, "execute_janus_create_operations", "EXECUTE-JANUS-CREATE-OPERATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "execute_janus_modification_operation", "EXECUTE-JANUS-MODIFICATION-OPERATION", 1, 0, false );
    SubLFiles.declareFunction( me, "kill_janus_constants", "KILL-JANUS-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "execute_janus_create", "EXECUTE-JANUS-CREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "execute_janus_assert", "EXECUTE-JANUS-ASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "dwim_janus_assert_operation", "DWIM-JANUS-ASSERT-OPERATION", 1, 0, false );
    SubLFiles.declareFunction( me, "dwim_janus_query_properties", "DWIM-JANUS-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_operation_successP", "JANUS-OPERATION-SUCCESS?", 2, 1, false );
    SubLFiles.declareFunction( me, "janus_create_successP", "JANUS-CREATE-SUCCESS?", 2, 0, false );
    SubLFiles.declareFunction( me, "janus_assert_successP", "JANUS-ASSERT-SUCCESS?", 2, 0, false );
    SubLFiles.declareFunction( me, "janus_query_successP", "JANUS-QUERY-SUCCESS?", 2, 1, false );
    SubLFiles.declareFunction( me, "janus_query_result_successP", "JANUS-QUERY-RESULT-SUCCESS?", 2, 0, false );
    SubLFiles.declareFunction( me, "load_janus_experiment", "LOAD-JANUS-EXPERIMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_experiment_p", "JANUS-EXPERIMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_failure_analysis", "JANUS-FAILURE-ANALYSIS", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_newly_failing_op_failure_reasons", "JANUS-NEWLY-FAILING-OP-FAILURE-REASONS", 2, 0, false );
    SubLFiles.declareFunction( me, "janus_categorize_failing_asserts", "JANUS-CATEGORIZE-FAILING-ASSERTS", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_categorize_failing_assert", "JANUS-CATEGORIZE-FAILING-ASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_categorize_failing_assert_int", "JANUS-CATEGORIZE-FAILING-ASSERT-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "janus_valid_test_set_run", "JANUS-VALID-TEST-SET-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_valid_test_runP", "JANUS-VALID-TEST-RUN?", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_more_complete_test_runs", "JANUS-MORE-COMPLETE-TEST-RUNS", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_equally_complete_test_runs", "JANUS-EQUALLY-COMPLETE-TEST-RUNS", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_less_complete_test_runs", "JANUS-LESS-COMPLETE-TEST-RUNS", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_different_test_runs", "JANUS-DIFFERENT-TEST-RUNS", 1, 0, false );
    SubLFiles.declareFunction( me, "janus_test_runs_with_assert_failure_status", "JANUS-TEST-RUNS-WITH-ASSERT-FAILURE-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "janus_test_runs_that_started_failing", "JANUS-TEST-RUNS-THAT-STARTED-FAILING", 2, 0, false );
    SubLFiles.declareFunction( me, "janus_test_runs_that_started_succeeding", "JANUS-TEST-RUNS-THAT-STARTED-SUCCEEDING", 2, 0, false );
    SubLFiles.declareFunction( me, "janus_test_runs_that_became_status", "JANUS-TEST-RUNS-THAT-BECAME-STATUS", 4, 0, false );
    SubLFiles.declareFunction( me, "janus_operations_that_became_status", "JANUS-OPERATIONS-THAT-BECAME-STATUS", 3, 0, false );
    SubLFiles.declareFunction( me, "janus_compare_test_set_run_statuses", "JANUS-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_janus_file()
  {
    $janus_transcript_directory$ = SubLFiles.deflexical( "*JANUS-TRANSCRIPT-DIRECTORY*", $str9$_cyc_projects_inference_janus_tra );
    $janus_experiment_directory$ = SubLFiles.deflexical( "*JANUS-EXPERIMENT-DIRECTORY*", $str21$_cyc_projects_inference_janus_exp );
    return NIL;
  }

  public static SubLObject setup_janus_file()
  {
    utilities_macros.note_funcall_helper_function( $sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_janus_file();
  }

  @Override
  public void initializeVariables()
  {
    init_janus_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_janus_file();
  }
  static
  {
    me = new janus();
    $janus_transcript_directory$ = null;
    $janus_experiment_directory$ = null;
    $kw0$JANUS_OP = makeKeyword( "JANUS-OP" );
    $kw1$CREATE = makeKeyword( "CREATE" );
    $kw2$ASSERT = makeKeyword( "ASSERT" );
    $kw3$QUERY = makeKeyword( "QUERY" );
    $sym4$JANUS_CREATE_OPERATION_P = makeSymbol( "JANUS-CREATE-OPERATION-P" );
    $sym5$JANUS_ASSERT_OPERATION_P = makeSymbol( "JANUS-ASSERT-OPERATION-P" );
    $sym6$JANUS_QUERY_OPERATION_P = makeSymbol( "JANUS-QUERY-OPERATION-P" );
    $kw7$CONST = makeKeyword( "CONST" );
    $sym8$ASSERTION_IST_FORMULA = makeSymbol( "ASSERTION-IST-FORMULA" );
    $str9$_cyc_projects_inference_janus_tra = makeString( "/cyc/projects/inference/janus/transcripts/" );
    $sym10$FILE_VALID_FOR_WRITING_P = makeSymbol( "FILE-VALID-FOR-WRITING-P" );
    $str11$_s_appears_more_than_once__in_pos = makeString( "~s appears more than once, in positions ~s." );
    $sym12$INVALID_CONSTANT_ = makeSymbol( "INVALID-CONSTANT?" );
    $kw13$ALL = makeKeyword( "ALL" );
    $sym14$INVALID_ASSERTION_ = makeSymbol( "INVALID-ASSERTION?" );
    $str15$invalid_term_in_assert_op___s__s_ = makeString( "invalid term in assert op: ~s ~s ~s" );
    $str16$invalid_constant_in_query_op___s_ = makeString( "invalid constant in query op: ~s ~s" );
    $kw17$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $str18$ignoring_problem_store_reuse_for_ = makeString( "ignoring problem store reuse for query ~s ~s ~s" );
    $str19$NEW_CONTINUABLE_INFERENCE___s__s_ = makeString( "NEW-CONTINUABLE-INFERENCE: ~s ~s ~s~%" );
    $kw20$DEDUCTION = makeKeyword( "DEDUCTION" );
    $str21$_cyc_projects_inference_janus_exp = makeString( "/cyc/projects/inference/janus/experiments/" );
    $list22 = ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "TRANSCRIPT-FILENAME" ), makeSymbol( "EXPERIMENT-FILENAME" ), makeSymbol( "COMMENT" ), makeSymbol( "OVERRIDING-QUERY-PROPERTIES" ),
      ConsesLow.list( makeSymbol( "METRICS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "ALL-QUERY-METRICS" ) ) ) ), ConsesLow.list( makeSymbol( "OUTLIER-TIMEOUT" ), ConsesLow.list( makeSymbol(
          "QUOTE" ), makeSymbol( "*ARETE-OUTLIER-TIMEOUT*" ) ) ), ConsesLow.list( makeSymbol( "SKIP" ), ZERO_INTEGER ), makeSymbol( "COUNT" )
    } );
    $list23 = ConsesLow.list( makeKeyword( "TRANSCRIPT-FILENAME" ), makeKeyword( "EXPERIMENT-FILENAME" ), makeKeyword( "COMMENT" ), makeKeyword( "OVERRIDING-QUERY-PROPERTIES" ), makeKeyword( "METRICS" ), makeKeyword(
        "OUTLIER-TIMEOUT" ), makeKeyword( "SKIP" ), makeKeyword( "COUNT" ) );
    $kw24$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw25$TRANSCRIPT_FILENAME = makeKeyword( "TRANSCRIPT-FILENAME" );
    $kw26$EXPERIMENT_FILENAME = makeKeyword( "EXPERIMENT-FILENAME" );
    $kw27$COMMENT = makeKeyword( "COMMENT" );
    $kw28$OVERRIDING_QUERY_PROPERTIES = makeKeyword( "OVERRIDING-QUERY-PROPERTIES" );
    $kw29$METRICS = makeKeyword( "METRICS" );
    $list30 = ConsesLow.list( makeSymbol( "ALL-QUERY-METRICS" ) );
    $kw31$OUTLIER_TIMEOUT = makeKeyword( "OUTLIER-TIMEOUT" );
    $sym32$_ARETE_OUTLIER_TIMEOUT_ = makeSymbol( "*ARETE-OUTLIER-TIMEOUT*" );
    $kw33$SKIP = makeKeyword( "SKIP" );
    $kw34$COUNT = makeKeyword( "COUNT" );
    $sym35$RUN_KCT_EXPERIMENT = makeSymbol( "RUN-KCT-EXPERIMENT" );
    $kw36$TEST_SPEC_SET = makeKeyword( "TEST-SPEC-SET" );
    $sym37$QUOTE = makeSymbol( "QUOTE" );
    $kw38$FILENAME = makeKeyword( "FILENAME" );
    $kw39$INCREMENTAL = makeKeyword( "INCREMENTAL" );
    $kw40$OVERRIDING_METRICS = makeKeyword( "OVERRIDING-METRICS" );
    $int41$600 = makeInteger( 600 );
    $str42$Execution_of_Janus_operation__s_f = makeString( "Execution of Janus operation ~s failed." );
    $str43$unknown_modification_operation_ty = makeString( "unknown modification operation type ~s" );
    $kw44$NOT_A_QUERY = makeKeyword( "NOT-A-QUERY" );
    $kw45$STRENGTH = makeKeyword( "STRENGTH" );
    $kw46$DIRECTION = makeKeyword( "DIRECTION" );
    $list47 = ConsesLow.list( new SubLObject[] { makeSymbol( "JANUS-OP" ), makeSymbol( "TYPE" ), makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "STRENGTH" ), makeSymbol( "DIRECTION" ), makeSymbol(
        "EXPECTED-DEDUCE-SPECS" ), makeSymbol( "ALLOWED-RULES" ), makeSymbol( "TAG" )
    } );
    $const48$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $kw49$NAT = makeKeyword( "NAT" );
    $str50$Janus_operation_of_unexpected_typ = makeString( "Janus operation of unexpected type ~s" );
    $sym51$LISTP = makeSymbol( "LISTP" );
    $str52$_s_____s__ = makeString( "~s != ~s~%" );
    $kw53$MORE_COMPLETE = makeKeyword( "MORE-COMPLETE" );
    $kw54$EQUALLY_COMPLETE = makeKeyword( "EQUALLY-COMPLETE" );
    $kw55$LESS_COMPLETE = makeKeyword( "LESS-COMPLETE" );
    $kw56$DIFFERENT = makeKeyword( "DIFFERENT" );
    $kw57$TEST = makeKeyword( "TEST" );
    $sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT = makeSymbol( "JANUS-CATEGORIZE-FAILING-ASSERT-INT" );
    $str59$filtered_to_exclude_invalid_forts = makeString( "filtered to exclude invalid forts" );
    $sym60$JANUS_VALID_TEST_RUN_ = makeSymbol( "JANUS-VALID-TEST-RUN?" );
    $sym61$INVALID_INDEXED_TERM_ = makeSymbol( "INVALID-INDEXED-TERM?" );
    $kw62$FAILURE = makeKeyword( "FAILURE" );
    $kw63$BECAME_FAILURE = makeKeyword( "BECAME-FAILURE" );
    $kw64$BECAME_SUCCESS = makeKeyword( "BECAME-SUCCESS" );
    $kw65$CHANGE = makeKeyword( "CHANGE" );
  }
}
/*
 *
 * Total time: 261 ms
 *
 */