package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.numeric_quantification;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import java.util.ArrayList;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.wff_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.backward_results;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ask_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.ask_utilities";
  public static final String myFingerPrint = "16529ab8eb14c94e188a0a944c331e521ff51ca27f39e4af20544420ae859cad";
  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 10674L)
  private static SubLSymbol $recursive_queries_browsableP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 12349L)
  private static SubLSymbol $max_recursive_query_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 12467L)
  private static SubLSymbol $recursive_query_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 23564L)
  private static SubLSymbol $allow_the_set_of_via_generalized_queryP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 24967L)
  private static SubLSymbol $be_careful_when_solving_the_set_of_via_generalized_queryP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 25201L)
  private static SubLSymbol $debug_the_set_of_problem_solvable_via_generalized_queryP$;
  private static final SubLSymbol $kw0$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw1$MAX_NUMBER;
  private static final SubLSymbol $kw2$MAX_TIME;
  private static final SubLSymbol $kw3$MAX_PROOF_DEPTH;
  private static final SubLSymbol $kw4$CACHE_INFERENCE_RESULTS_;
  private static final SubLSymbol $kw5$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw6$EL;
  private static final SubLSymbol $kw7$HL;
  private static final SubLSymbol $kw8$ALLOWED_RULES;
  private static final SubLSymbol $kw9$ALL;
  private static final SubLSymbol $sym10$INFERENCE_RETURN_BLISTS;
  private static final SubLSymbol $kw11$RETURN;
  private static final SubLSymbol $kw12$BINDINGS;
  private static final SubLSymbol $kw13$RESULT_UNIQUENESS;
  private static final SubLSymbol $sym14$INFERENCE_RETURN_BLISTS_AND_SUPPORTS;
  private static final SubLSymbol $kw15$BINDINGS_AND_SUPPORTS;
  private static final SubLSymbol $kw16$PROOF;
  private static final SubLSymbol $sym17$INFERENCE_RETURN_TEMPLATE;
  private static final SubLSymbol $kw18$TEMPLATE;
  private static final SubLSymbol $kw19$ALLOW_HL_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw20$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw21$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw22$PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $kw23$INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $kw24$NEGATION_BY_FAILURE_;
  private static final SubLInteger $int25$100;
  private static final SubLSymbol $sym26$QUERY_JUSTIFIED;
  private static final SubLList $list27;
  private static final SubLString $str28$Ask_for_bindings_for_free_variabl;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$ASK_JUSTIFIED;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLString $str33$Ask_for_bindings_for_free_variabl;
  private static final SubLSymbol $sym34$QUERY_TEMPLATE;
  private static final SubLList $list35;
  private static final SubLString $str36$Ask_SENTENCE_in_MT___Return_resul;
  private static final SubLSymbol $sym37$ASK_TEMPLATE;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLString $str40$Ask_SENTENCE_in_MT___Return_resul;
  private static final SubLSymbol $sym41$QUERY_VARIABLE;
  private static final SubLList $list42;
  private static final SubLString $str43$Ask_SENTENCE_in_MT_treating_VARIA;
  private static final SubLSymbol $sym44$ASK_VARIABLE;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLString $str47$Ask_SENTENCE_in_MT_treating_VARIA;
  private static final SubLSymbol $sym48$QUERY_TEMPLATE_EVAL;
  private static final SubLString $str49$Ask_SENTENCE_in_MT_under_the_reso;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$ASK_TEMPLATE_EVAL;
  private static final SubLList $list52;
  private static final SubLString $str53$Ask_SENTENCE_in_MT_under_the_reso;
  private static final SubLSymbol $kw54$ONLY_FOR_EXISTING_STORES;
  private static final SubLSymbol $kw55$NONE;
  private static final SubLSymbol $kw56$PROBLEM_STORE;
  private static final SubLInteger $int57$27;
  private static final SubLSymbol $kw58$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLSymbol $kw59$BROWSABLE_;
  private static final SubLString $str60$max_recursive_query_depth_of__s_e;
  private static final SubLString $str61$Either_deeper_thought_is_required;
  private static final SubLSymbol $sym62$QUEUE_P;
  private static final SubLSymbol $kw63$CONTINUABLE_;
  private static final SubLSymbol $sym64$QUERY_PROPERTY_INHERITED_BY_RECURSIVE_QUERY_;
  private static final SubLSymbol $kw65$COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLList $list66;
  private static final SubLSymbol $kw67$TRUE;
  private static final SubLSymbol $kw68$FALSE;
  private static final SubLSymbol $kw69$UNKNOWN;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$FIRST;
  private static final SubLObject $const73$TheSetOf;
  private static final SubLSymbol $kw74$NO_THE_SET_OF_EXPRESSION_FOUND;
  private static final SubLSymbol $kw75$THE_SET_OF_VIA_GENERALIZED_QUERY_NOT_ALLOWED;
  private static final SubLSymbol $kw76$SKSI_STRONGLY_PREFER_CONJUNCTIVE_REMOVAL_MODULES_NOT_T;
  private static final SubLSymbol $kw77$PROBLEM_NOT_VALID;
  private static final SubLSymbol $kw78$CANNOT_FIND_UNRESTRICTED_PROBLEM_OF_THE_SET_OF_EXPRESSION_PROBLEM;
  private static final SubLSymbol $kw79$CANNOT_FIND_JO_LINK_AND_FOCAL_PROBLEM_OF_SUPPORTED_PROBLEM;
  private static final SubLSymbol $kw80$GENERALIZED_QUERY_PROPERTIES_DIFFERENT_THAN_RESTRICTED_QUERY_PROP;
  private static final SubLSymbol $kw81$GENERALIZED_QUERY_NOT_GENERALIZED__CONTAINS_RESTRICTED_QUERY;
  private static final SubLSymbol $sym82$PRED_NOT_ALLOWED_IN_GENERALIZED_QUERY_FOR_THE_SET_OF_;
  private static final SubLSymbol $kw83$GENERALIZED_QUERY_CONTAINS_PRED_NOT_ALLOWED_IN_GENERALIZED_QUERY_;
  private static final SubLSymbol $sym84$EQUALS_EL_;
  private static final SubLString $str85$the_set_of_via_generalized_query_;
  private static final SubLString $str86$__Generalized_query___new_cyc_que;
  private static final SubLString $str87$__Restricted__query___new_cyc_que;
  private static final SubLString $str88$__Missed_answer___S_____S__;
  private static final SubLSymbol $kw89$FALLTHROUGH_NIL;
  private static final SubLObject $const90$predNotAllowedInGeneralizedQueryF;
  private static final SubLSymbol $sym91$EL_INTENSIONAL_SET_P;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$JOIN_ORDERED_LINK_P;
  private static final SubLSymbol $sym94$THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED;
  private static final SubLSymbol $kw95$EXHAUST;

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 734L)
  public static SubLObject query_properties_from_legacy_ask_parameters(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_properties = NIL;
    if( NIL != backchain )
    {
      v_properties = conses_high.putf( v_properties, $kw0$MAX_TRANSFORMATION_DEPTH, ( T == backchain ) ? NIL : backchain );
    }
    if( NIL != number )
    {
      v_properties = conses_high.putf( v_properties, $kw1$MAX_NUMBER, number );
    }
    if( NIL != time )
    {
      v_properties = conses_high.putf( v_properties, $kw2$MAX_TIME, time );
    }
    if( NIL != depth )
    {
      v_properties = conses_high.putf( v_properties, $kw3$MAX_PROOF_DEPTH, depth );
    }
    v_properties = conses_high.putf( v_properties, $kw4$CACHE_INFERENCE_RESULTS_, list_utilities.sublisp_boolean( control_vars.$cache_inference_results$.getDynamicValue( thread ) ) );
    if( NIL != api_control_vars.$generate_readable_fi_results$.getDynamicValue( thread ) )
    {
      v_properties = conses_high.putf( v_properties, $kw5$ANSWER_LANGUAGE, $kw6$EL );
    }
    else
    {
      v_properties = conses_high.putf( v_properties, $kw5$ANSWER_LANGUAGE, $kw7$HL );
    }
    if( NIL != control_vars.$proof_checking_enabled$.getDynamicValue( thread ) )
    {
      v_properties = conses_high.putf( v_properties, $kw8$ALLOWED_RULES, control_vars.$proof_checker_rules$.getDynamicValue( thread ) );
    }
    else
    {
      v_properties = conses_high.putf( v_properties, $kw8$ALLOWED_RULES, $kw9$ALL );
    }
    final SubLObject pcase_var = control_vars.$inference_answer_handler$.getDynamicValue( thread );
    if( pcase_var.eql( $sym10$INFERENCE_RETURN_BLISTS ) )
    {
      v_properties = conses_high.putf( v_properties, $kw11$RETURN, $kw12$BINDINGS );
      v_properties = conses_high.putf( v_properties, $kw13$RESULT_UNIQUENESS, $kw12$BINDINGS );
    }
    else if( pcase_var.eql( $sym14$INFERENCE_RETURN_BLISTS_AND_SUPPORTS ) )
    {
      v_properties = conses_high.putf( v_properties, $kw11$RETURN, $kw15$BINDINGS_AND_SUPPORTS );
      v_properties = conses_high.putf( v_properties, $kw13$RESULT_UNIQUENESS, $kw16$PROOF );
      v_properties = conses_high.putf( v_properties, $kw5$ANSWER_LANGUAGE, $kw7$HL );
    }
    else if( pcase_var.eql( $sym17$INFERENCE_RETURN_TEMPLATE ) )
    {
      v_properties = conses_high.putf( v_properties, $kw11$RETURN, ConsesLow.list( $kw18$TEMPLATE, backward_results.$inference_answer_template$.getDynamicValue( thread ) ) );
      v_properties = conses_high.putf( v_properties, $kw13$RESULT_UNIQUENESS, $kw12$BINDINGS );
    }
    v_properties = conses_high.putf( v_properties, $kw19$ALLOW_HL_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean( control_vars.$hl_failure_backchaining$.getDynamicValue( thread ) ) );
    v_properties = conses_high.putf( v_properties, $kw20$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean( control_vars.$unbound_rule_backchain_enabled$.getDynamicValue( thread ) ) );
    v_properties = conses_high.putf( v_properties, $kw21$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, list_utilities.sublisp_boolean( control_vars.$evaluatable_backchain_enabled$.getDynamicValue( thread ) ) );
    final SubLObject productivity_limit = productivity_limit_from_removal_cost_cutoff( control_vars.$removal_cost_cutoff$.getDynamicValue( thread ) );
    v_properties = conses_high.putf( v_properties, $kw22$PRODUCTIVITY_LIMIT, productivity_limit );
    v_properties = conses_high.putf( v_properties, $kw23$INTERMEDIATE_STEP_VALIDATION_LEVEL, backward_results.$inference_intermediate_step_validation_level$.getDynamicValue( thread ) );
    v_properties = conses_high.putf( v_properties, $kw24$NEGATION_BY_FAILURE_, list_utilities.sublisp_boolean( control_vars.$negation_by_failure$.getDynamicValue( thread ) ) );
    return v_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 3995L)
  public static SubLObject productivity_limit_from_removal_cost_cutoff(final SubLObject cost_cutoff)
  {
    return ( NIL != cost_cutoff ) ? Numbers.floor( Numbers.multiply( TWO_INTEGER, $int25$100, cost_cutoff ), UNPROVIDED ) : number_utilities.positive_infinity();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 4256L)
  public static SubLObject query_static_properties_from_legacy_ask_parameters()
  {
    final SubLObject query_properties = query_properties_from_legacy_ask_parameters( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return inference_datastructures_enumerated_types.extract_query_static_properties( query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 4504L)
  public static SubLObject query_dynamic_properties_from_legacy_ask_parameters(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth, SubLObject reconsider_deepP)
  {
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( reconsider_deepP == UNPROVIDED )
    {
      reconsider_deepP = NIL;
    }
    final SubLObject query_properties = query_properties_from_legacy_ask_parameters( backchain, number, time, depth );
    return inference_datastructures_enumerated_types.extract_query_dynamic_properties( query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 4864L)
  public static SubLObject query_justified(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mt )
    {
      mt = mt_vars.$default_ask_mt$.getGlobalValue();
    }
    SubLObject new_query_properties = conses_high.putf( conses_high.copy_list( query_properties ), $kw5$ANSWER_LANGUAGE, $kw7$HL );
    new_query_properties = conses_high.putf( new_query_properties, $kw11$RETURN, $kw15$BINDINGS_AND_SUPPORTS );
    thread.resetMultipleValues();
    final SubLObject results = inference_kernel.new_cyc_query( sentence, mt, new_query_properties );
    final SubLObject suspend_status = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( results, suspend_status );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 5629L)
  public static SubLObject ask_justified(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject query_properties = query_properties_from_legacy_ask_parameters( backchain, number, time, depth );
    return query_justified( sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 6725L)
  public static SubLObject query_template(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mt )
    {
      mt = mt_vars.$default_ask_mt$.getGlobalValue();
    }
    SubLObject new_query_properties = conses_high.putf( conses_high.copy_list( query_properties ), $kw13$RESULT_UNIQUENESS, $kw12$BINDINGS );
    new_query_properties = conses_high.putf( new_query_properties, $kw11$RETURN, ConsesLow.list( $kw18$TEMPLATE, template ) );
    thread.resetMultipleValues();
    final SubLObject results = inference_kernel.new_cyc_query( sentence, mt, new_query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( results, halt_reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 7458L)
  public static SubLObject ask_template(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject query_properties = query_properties_from_legacy_ask_parameters( backchain, number, time, depth );
    return query_template( template, sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 7926L)
  public static SubLObject query_variable(final SubLObject variable_token, final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject variable = czer_utilities.unique_el_var_wrt_expression( sentence, UNPROVIDED );
    final SubLObject query_sentence = cycl_utilities.expression_subst( variable, variable_token, sentence, UNPROVIDED, UNPROVIDED );
    thread.resetMultipleValues();
    SubLObject results = query_template( variable, query_sentence, mt, query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    results = Sequences.delete_duplicates( results, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Values.values( results, halt_reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 8559L)
  public static SubLObject ask_variable(final SubLObject variable_token, final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject query_properties = query_properties_from_legacy_ask_parameters( backchain, number, time, depth );
    return query_variable( variable_token, sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 9090L)
  public static SubLObject query_template_eval(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    SubLObject cdolist_list_var;
    final SubLObject actions = cdolist_list_var = query_template( template, sentence, mt, query_properties );
    SubLObject action = NIL;
    action = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      eval_in_api.cyc_api_eval( action );
      cdolist_list_var = cdolist_list_var.rest();
      action = cdolist_list_var.first();
    }
    return Sequences.length( actions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 9657L)
  public static SubLObject ask_template_eval(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject query_properties = query_properties_from_legacy_ask_parameters( backchain, number, time, depth );
    return query_template_eval( template, sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 10350L)
  public static SubLObject query_boolean(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject results = inference_kernel.new_cyc_query( sentence, mt, query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( list_utilities.sublisp_boolean( results ), halt_reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 11595L)
  public static SubLObject recursive_ask_query_properties_from_legacy_ask_parameters(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject query_properties = query_properties_from_legacy_ask_parameters( backchain, number, time, depth );
    query_properties = conses_high.putf( query_properties, $kw4$CACHE_INFERENCE_RESULTS_, NIL );
    query_properties = conses_high.putf( query_properties, $kw5$ANSWER_LANGUAGE, $kw7$HL );
    query_properties = conses_high.putf( query_properties, $kw23$INTERMEDIATE_STEP_VALIDATION_LEVEL, $kw55$NONE );
    if( NIL != inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.getDynamicValue( thread ) && NIL == kb_control_vars.within_forward_inferenceP() )
    {
      final SubLObject problem_store = inference_worker.currently_active_problem_store();
      query_properties = conses_high.putf( query_properties, $kw56$PROBLEM_STORE, problem_store );
    }
    return query_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 12569L)
  public static SubLObject within_recursive_queryP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.positive_integer_p( $recursive_query_depth$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 12668L)
  public static SubLObject recursive_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_query_properties = conses_high.copy_list( query_properties );
    final SubLObject problem_store = recursive_query_problem_store_to_reuse( new_query_properties );
    if( NIL != problem_store )
    {
      new_query_properties = conses_high.putf( new_query_properties, $kw56$PROBLEM_STORE, problem_store );
    }
    if( NIL == conses_high.getf( new_query_properties, $kw58$PROBABLY_APPROXIMATELY_DONE, UNPROVIDED ) )
    {
      new_query_properties = conses_high.putf( new_query_properties, $kw58$PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER );
    }
    SubLObject inference = inference_macros.current_controlling_inference();
    if( NIL != inference_datastructures_inference.inference_p( inference ) )
    {
      SubLObject cdolist_list_var = control_vars.$query_properties_inherited_by_recursive_queries$.getDynamicValue( thread );
      SubLObject query_property = NIL;
      query_property = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == conses_high.getf( new_query_properties, query_property, UNPROVIDED ) )
        {
          final SubLObject value = inference_datastructures_inference.inference_input_query_property( inference, query_property, UNPROVIDED );
          if( NIL != value )
          {
            new_query_properties = conses_high.putf( new_query_properties, query_property, value );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        query_property = cdolist_list_var.first();
      }
    }
    if( NIL == list_utilities.indicator_presentP( new_query_properties, $kw5$ANSWER_LANGUAGE ) )
    {
      new_query_properties = conses_high.putf( new_query_properties, $kw5$ANSWER_LANGUAGE, $kw7$HL );
    }
    inference = inference_macros.current_controlling_inference();
    if( NIL != inference_datastructures_inference.running_inference_p( inference ) && NIL != inference_datastructures_inference.inference_browsableP( inference ) && ( ( $recursive_queries_browsableP$.getDynamicValue(
        thread ) == $kw54$ONLY_FOR_EXISTING_STORES && NIL != conses_high.getf( new_query_properties, $kw56$PROBLEM_STORE, UNPROVIDED ) ) || $recursive_queries_browsableP$.getDynamicValue( thread ) == T ) )
    {
      new_query_properties = conses_high.putf( new_query_properties, $kw59$BROWSABLE_, T );
    }
    SubLObject results = NIL;
    SubLObject halt_reason = NIL;
    SubLObject inference2 = NIL;
    SubLObject metrics = NIL;
    final SubLObject _prev_bind_0 = $recursive_query_depth$.currentBinding( thread );
    try
    {
      $recursive_query_depth$.bind( ( NIL != $recursive_query_depth$.getDynamicValue( thread ) ) ? number_utilities.f_1X( $recursive_query_depth$.getDynamicValue( thread ) ) : ONE_INTEGER, thread );
      if( $recursive_query_depth$.getDynamicValue( thread ).numG( $max_recursive_query_depth$.getGlobalValue() ) )
      {
        if( NIL != control_vars.$inference_debugP$.getDynamicValue( thread ) )
        {
          Errors.error( $str60$max_recursive_query_depth_of__s_e, $max_recursive_query_depth$.getGlobalValue(), sentence, mt );
        }
        else
        {
          Errors.error( $str61$Either_deeper_thought_is_required );
        }
      }
      else
      {
        final SubLObject cprogv_var = utilities_macros.$fi_state_variables$.getGlobalValue();
        final ArrayList old_values = Dynamic.extract_dynamic_values( cprogv_var );
        try
        {
          Dynamic.bind_dynamic_vars( cprogv_var, ConsesLow.make_list( Sequences.length( utilities_macros.$fi_state_variables$.getGlobalValue() ), NIL ) );
          final SubLObject environment = forward.get_forward_inference_environment();
          assert NIL != queues.queue_p( environment ) : environment;
          final SubLObject _prev_bind_0_$1 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
          final SubLObject _prev_bind_2 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
          final SubLObject _prev_bind_3 = czer_vars.$simplify_non_wff_literalP$.currentBinding( thread );
          try
          {
            kb_control_vars.$forward_inference_environment$.bind( environment, thread );
            wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
            czer_vars.$simplify_non_wff_literalP$.bind( NIL, thread );
            thread.resetMultipleValues();
            final SubLObject results_$2 = inference_kernel.new_cyc_query( sentence, mt, new_query_properties );
            final SubLObject halt_reason_$3 = thread.secondMultipleValue();
            final SubLObject inference_$4 = thread.thirdMultipleValue();
            final SubLObject metrics_$5 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            results = results_$2;
            halt_reason = halt_reason_$3;
            inference2 = inference_$4;
            metrics = metrics_$5;
          }
          finally
          {
            czer_vars.$simplify_non_wff_literalP$.rebind( _prev_bind_3, thread );
            wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_2, thread );
            kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0_$1, thread );
          }
        }
        finally
        {
          Dynamic.rebind_dynamic_vars( cprogv_var, old_values );
        }
      }
    }
    finally
    {
      $recursive_query_depth$.rebind( _prev_bind_0, thread );
    }
    if( NIL == conses_high.getf( query_properties, $kw59$BROWSABLE_, UNPROVIDED ) && NIL == conses_high.getf( query_properties, $kw63$CONTINUABLE_, UNPROVIDED ) )
    {
      inference_datastructures_inference.destroy_inference( inference2 );
    }
    return Values.values( results, halt_reason, inference2, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 15879L)
  public static SubLObject query_property_inherited_by_recursive_queryP(final SubLObject property)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.member_eqP( property, control_vars.$query_properties_inherited_by_recursive_queries$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 16035L)
  public static SubLObject filter_query_properties_for_recursive_query(final SubLObject query_properties)
  {
    return list_utilities.filter_plist( query_properties, $sym64$QUERY_PROPERTY_INHERITED_BY_RECURSIVE_QUERY_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 16204L)
  public static SubLObject recursive_query_problem_store_to_reuse(final SubLObject query_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.getDynamicValue( thread ) && NIL == kb_control_vars.within_forward_inferenceP() )
    {
      final SubLObject problem_store = inference_worker.currently_active_problem_store();
      if( NIL != problem_store && NIL != inference_parameters.problem_store_allows_reuse_wrt_query_propertiesP( problem_store, query_properties ) )
      {
        return problem_store;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 16731L)
  public static SubLObject kappa_tuples(final SubLObject v_variables, final SubLObject sentence, final SubLObject mt, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fi_variables = uncanonicalizer.uncanonicalize_recursive_query_vars( v_variables );
    final SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query( sentence );
    SubLObject new_query_properties = conses_high.copy_list( query_properties );
    new_query_properties = conses_high.putf( new_query_properties, $kw11$RETURN, ConsesLow.list( $kw18$TEMPLATE, fi_variables ) );
    new_query_properties = conses_high.putf( new_query_properties, $kw13$RESULT_UNIQUENESS, $kw12$BINDINGS );
    new_query_properties = conses_high.putf( new_query_properties, $kw65$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL );
    new_query_properties = conses_high.putf( new_query_properties, $kw23$INTERMEDIATE_STEP_VALIDATION_LEVEL, $kw55$NONE );
    new_query_properties = conses_high.putf( new_query_properties, $kw5$ANSWER_LANGUAGE, $kw7$HL );
    thread.resetMultipleValues();
    SubLObject tuples = recursive_query( fi_sentence, mt, new_query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    tuples = Sequences.delete_duplicates( tuples, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Values.values( tuples, halt_reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 17690L)
  public static SubLObject kappa_tuples_justified(final SubLObject v_variables, final SubLObject sentence, final SubLObject mt, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fi_variables = uncanonicalizer.uncanonicalize_recursive_query_vars( v_variables );
    final SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query( sentence );
    SubLObject new_query_properties = conses_high.copy_list( query_properties );
    new_query_properties = conses_high.putf( new_query_properties, $kw11$RETURN, ConsesLow.list( $kw18$TEMPLATE, ConsesLow.append( ConsesLow.list( fi_variables ), $list66 ) ) );
    new_query_properties = conses_high.putf( new_query_properties, $kw13$RESULT_UNIQUENESS, $kw12$BINDINGS );
    new_query_properties = conses_high.putf( new_query_properties, $kw23$INTERMEDIATE_STEP_VALIDATION_LEVEL, $kw55$NONE );
    new_query_properties = conses_high.putf( new_query_properties, $kw5$ANSWER_LANGUAGE, $kw7$HL );
    thread.resetMultipleValues();
    SubLObject tuples = recursive_query( fi_sentence, mt, new_query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    tuples = Sequences.delete_duplicates( tuples, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Values.values( tuples, halt_reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 18567L)
  public static SubLObject inference_recursive_ask(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( NIL == mt )
    {
      mt = mt_vars.$default_ask_mt$.getGlobalValue();
    }
    final SubLObject query_properties = recursive_ask_query_properties_from_legacy_ask_parameters( backchain, number, time, depth );
    return inference_recursive_query( sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 19098L)
  public static SubLObject inference_recursive_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hl_variables = variables.gather_hl_variables( sentence );
    final SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query( sentence );
    SubLObject new_query_properties = conses_high.copy_list( query_properties );
    new_query_properties = conses_high.putf( new_query_properties, $kw5$ANSWER_LANGUAGE, $kw7$HL );
    new_query_properties = conses_high.putf( new_query_properties, $kw13$RESULT_UNIQUENESS, $kw16$PROOF );
    new_query_properties = conses_high.putf( new_query_properties, $kw11$RETURN, $kw15$BINDINGS_AND_SUPPORTS );
    thread.resetMultipleValues();
    final SubLObject results = recursive_query( fi_sentence, mt, new_query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    final SubLObject inference = thread.thirdMultipleValue();
    final SubLObject metrics = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = results;
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_bindings = result.first();
      if( NIL != v_bindings )
      {
        ConsesLow.set_nth( ZERO_INTEGER, result, inference_recursive_query_convert_to_hl_bindings( v_bindings, hl_variables ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    return Values.values( results, halt_reason, inference, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 20066L)
  public static SubLObject inference_recursive_query_unique_bindings(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mt )
    {
      mt = mt_vars.$default_ask_mt$.getGlobalValue();
    }
    final SubLObject hl_variables = variables.gather_hl_variables( sentence );
    final SubLObject fi_sentence = uncanonicalizer.uncanonicalize_recursive_query( sentence );
    SubLObject new_query_properties = conses_high.copy_list( query_properties );
    new_query_properties = conses_high.putf( new_query_properties, $kw5$ANSWER_LANGUAGE, $kw7$HL );
    new_query_properties = conses_high.putf( new_query_properties, $kw13$RESULT_UNIQUENESS, $kw12$BINDINGS );
    new_query_properties = conses_high.putf( new_query_properties, $kw65$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL );
    new_query_properties = conses_high.putf( new_query_properties, $kw11$RETURN, $kw12$BINDINGS );
    thread.resetMultipleValues();
    final SubLObject results = recursive_query( fi_sentence, mt, new_query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    final SubLObject inference = thread.thirdMultipleValue();
    final SubLObject metrics = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject final_results = NIL;
    SubLObject cdolist_list_var = results;
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final_results = ConsesLow.cons( inference_recursive_query_convert_to_hl_bindings( result, hl_variables ), final_results );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    final_results = Sequences.nreverse( final_results );
    return Values.values( final_results, halt_reason, inference, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 21217L)
  public static SubLObject inference_recursive_ask_unique_bindings(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject query_properties = recursive_ask_query_properties_from_legacy_ask_parameters( backchain, number, time, depth );
    return inference_recursive_query_unique_bindings( sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 21697L)
  public static SubLObject inference_recursive_query_convert_to_hl_bindings(final SubLObject result_bindings, final SubLObject hl_variables)
  {
    if( NIL == hl_variables || NIL != cyc_kernel.closed_query_bindings_p( result_bindings ) )
    {
      return result_bindings;
    }
    SubLObject answer_bindings = NIL;
    SubLObject cdolist_list_var = hl_variables;
    SubLObject hl_variable = NIL;
    hl_variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject el_variable = variables.default_el_var_for_hl_var( hl_variable );
      final SubLObject value = bindings.variable_lookup( el_variable, result_bindings );
      answer_bindings = ConsesLow.cons( bindings.make_variable_binding( hl_variable, value ), answer_bindings );
      cdolist_list_var = cdolist_list_var.rest();
      hl_variable = cdolist_list_var.first();
    }
    return Sequences.nreverse( answer_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 22221L)
  public static SubLObject inference_literal_truth(final SubLObject literal, final SubLObject mt)
  {
    if( NIL != inference_literal_ask( literal, mt ) )
    {
      return $kw67$TRUE;
    }
    if( NIL != inference_literal_ask( cycl_utilities.negate( literal ), mt ) )
    {
      return $kw68$FALSE;
    }
    return $kw69$UNKNOWN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 22586L)
  public static SubLObject inference_literal_ask(final SubLObject literal, final SubLObject mt)
  {
    return list_utilities.sublisp_boolean( inference_recursive_query_unique_bindings( literal, mt, $list70 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 22796L)
  public static SubLObject the_set_of_elements(final SubLObject v_set, SubLObject answer_language, SubLObject mt)
  {
    if( answer_language == UNPROVIDED )
    {
      answer_language = $kw6$EL;
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != the_set_of_problem_solvable_via_generalized_queryP( v_set, UNPROVIDED, UNPROVIDED ) )
    {
      return the_set_of_elements_via_generalized_query( UNPROVIDED, UNPROVIDED );
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.nat_args( v_set, UNPROVIDED );
    SubLObject variable = NIL;
    SubLObject query = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    query = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject fi_variable = uncanonicalizer.uncanonicalize_recursive_query_vars( variable );
      final SubLObject fi_query = uncanonicalizer.uncanonicalize_recursive_query( query );
      SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties( fi_query, mt );
      SubLObject tuples = NIL;
      query_properties = conses_high.putf( query_properties, $kw5$ANSWER_LANGUAGE, answer_language );
      tuples = kappa_tuples( ConsesLow.list( fi_variable ), fi_query, mt, query_properties );
      return Mapping.mapcar( Symbols.symbol_function( $sym72$FIRST ), tuples );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 25288L)
  public static SubLObject the_set_of_problem_solvable_via_generalized_queryP(SubLObject v_set, SubLObject problem, SubLObject mt)
  {
    if( v_set == UNPROVIDED )
    {
      v_set = NIL;
    }
    if( problem == UNPROVIDED )
    {
      problem = inference_worker.currently_active_problem();
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == inference_datastructures_problem.problem_p( problem ) || NIL == cycl_utilities.expression_find( $const73$TheSetOf, inference_datastructures_problem.problem_query( problem ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) )
    {
      return Values.values( NIL, $kw74$NO_THE_SET_OF_EXPRESSION_FOUND );
    }
    if( NIL == $allow_the_set_of_via_generalized_queryP$.getDynamicValue( thread ) )
    {
      return Values.values( NIL, $kw75$THE_SET_OF_VIA_GENERALIZED_QUERY_NOT_ALLOWED );
    }
    if( NIL == sksi_conjunctive_removal_modules_cost.$sksi_strongly_prefer_conjunctive_removal_modulesP$.getDynamicValue( thread ) )
    {
      return Values.values( NIL, $kw76$SKSI_STRONGLY_PREFER_CONJUNCTIVE_REMOVAL_MODULES_NOT_T );
    }
    if( NIL == inference_datastructures_problem.problem_p( problem ) )
    {
      return Values.values( NIL, $kw77$PROBLEM_NOT_VALID );
    }
    SubLObject unrestricted_problem = find_unrestricted_problem_of_the_set_of_expression_problem( problem );
    if( NIL == unrestricted_problem )
    {
      return Values.values( NIL, $kw78$CANNOT_FIND_UNRESTRICTED_PROBLEM_OF_THE_SET_OF_EXPRESSION_PROBLEM );
    }
    if( NIL == find_jo_link_and_focal_problem_of_supported_problem( unrestricted_problem ) )
    {
      return Values.values( NIL, $kw79$CANNOT_FIND_JO_LINK_AND_FOCAL_PROBLEM_OF_SUPPORTED_PROBLEM );
    }
    thread.resetMultipleValues();
    unrestricted_problem = find_unrestricted_problem_of_the_set_of_expression_problem( problem );
    final SubLObject unrestricted_the_set_of_expression = thread.secondMultipleValue();
    final SubLObject restriction_link_bindings = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != unrestricted_problem && NIL != unrestricted_the_set_of_expression && NIL != restriction_link_bindings )
    {
      if( NIL != el_utilities.el_intensional_set_p( v_set ) )
      {
        final SubLObject generalized_query = compute_the_set_of_elements_generalized_query( problem );
        final SubLObject generalized_query_properties = determine_the_set_of_elements_generalized_query_properties( generalized_query, mt );
        final SubLObject restricted_query = cycl_utilities.formula_arg2( v_set, UNPROVIDED );
        final SubLObject set_el_var = cycl_utilities.formula_arg1( v_set, UNPROVIDED );
        final SubLObject restricted_query_properties = determine_the_set_of_elements_generalized_query_properties( restricted_query, mt );
        if( !generalized_query_properties.equal( restricted_query_properties ) )
        {
          return Values.values( NIL, $kw80$GENERALIZED_QUERY_PROPERTIES_DIFFERENT_THAN_RESTRICTED_QUERY_PROP );
        }
        if( NIL != cycl_utilities.expression_find( restricted_query, generalized_query, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED ) )
        {
          return Values.values( NIL, $kw81$GENERALIZED_QUERY_NOT_GENERALIZED__CONTAINS_RESTRICTED_QUERY );
        }
        if( NIL != cycl_utilities.expression_gather( generalized_query, $sym82$PRED_NOT_ALLOWED_IN_GENERALIZED_QUERY_FOR_THE_SET_OF_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          return Values.values( NIL, $kw83$GENERALIZED_QUERY_CONTAINS_PRED_NOT_ALLOWED_IN_GENERALIZED_QUERY_ );
        }
        if( NIL != $debug_the_set_of_problem_solvable_via_generalized_queryP$.getDynamicValue( thread ) )
        {
          final SubLObject generalized_answers = the_set_of_elements_via_generalized_query( problem, mt );
          thread.resetMultipleValues();
          final SubLObject answers = query_template( set_el_var, restricted_query, mt, restricted_query_properties );
          final SubLObject halt_reason = thread.secondMultipleValue();
          final SubLObject inference = thread.thirdMultipleValue();
          final SubLObject metrics = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          if( NIL != conses_high.set_difference( answers, generalized_answers, $sym84$EQUALS_EL_, UNPROVIDED ) )
          {
            format_nil.force_format( T, $str85$the_set_of_via_generalized_query_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            format_nil.force_format( T, $str86$__Generalized_query___new_cyc_que, el_utilities.sefify( compute_the_set_of_elements_generalized_query( problem ) ), el_utilities.sefify( mt ), el_utilities.sefify(
                generalized_query_properties ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            format_nil.force_format( T, $str87$__Restricted__query___new_cyc_que, el_utilities.sefify( restricted_query ), el_utilities.sefify( mt ), el_utilities.sefify( restricted_query_properties ), UNPROVIDED,
                UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = conses_high.set_difference( answers, generalized_answers, $sym84$EQUALS_EL_, UNPROVIDED );
            SubLObject x = NIL;
            x = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              format_nil.force_format( T, $str88$__Missed_answer___S_____S__, set_el_var, x, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              x = cdolist_list_var.first();
            }
          }
        }
      }
      return Values.values( T, NIL );
    }
    return Values.values( NIL, $kw89$FALLTHROUGH_NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 29475L)
  public static SubLObject pred_not_allowed_in_generalized_query_for_the_set_ofP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != fort_types_interface.predicateP( v_object ) && NIL != somewhere_cache.some_pred_assertion_somewhereP( $const90$predNotAllowedInGeneralizedQueryF,
        v_object, ONE_INTEGER, UNPROVIDED ) && NIL != kb_mapping_utilities.fpred_value( v_object, $const90$predNotAllowedInGeneralizedQueryF, ONE_INTEGER, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 29841L)
  public static SubLObject the_set_of_elements_via_generalized_query(SubLObject problem, SubLObject mt)
  {
    if( problem == UNPROVIDED )
    {
      problem = inference_worker.currently_active_problem();
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject generalized_query = compute_the_set_of_elements_generalized_query( problem );
    final SubLObject the_set_of_variable = thread.secondMultipleValue();
    final SubLObject supported_restriction_bindings = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject expanded_answers = the_set_of_elements_generalized_query_memoized( generalized_query, mt );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = expanded_answers;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.fast_subsetP( supported_restriction_bindings, binding, Symbols.symbol_function( EQUAL ) ) )
      {
        result = ConsesLow.cons( bindings.variable_lookup( the_set_of_variable, binding ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 30468L)
  public static SubLObject compute_the_set_of_elements_generalized_query(SubLObject problem)
  {
    if( problem == UNPROVIDED )
    {
      problem = inference_worker.currently_active_problem();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject unrestricted_problem = find_unrestricted_problem_of_the_set_of_expression_problem( problem );
    final SubLObject unrestricted_the_set_of_expression = thread.secondMultipleValue();
    final SubLObject restriction_link_bindings = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject focal_jo_link = find_jo_link_and_focal_problem_of_supported_problem( unrestricted_problem );
    final SubLObject focal_problem = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != focal_problem )
    {
      final SubLObject jo_link_focal_to_supp_bindings = inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map( focal_jo_link );
      final SubLObject jo_link_non_focal_to_supp_bindings = inference_worker_join_ordered.join_ordered_link_non_focal_to_supported_variable_map( focal_jo_link );
      final SubLObject the_set_of_variable = cycl_utilities.formula_arg1( unrestricted_the_set_of_expression, UNPROVIDED );
      final SubLObject unrestricted_the_set_of_formula = cycl_utilities.formula_arg2( unrestricted_the_set_of_expression, UNPROVIDED );
      final SubLObject focal_problem_formula = inference_datastructures_problem.problem_formula( focal_problem );
      final SubLObject supported_generator_formula = bindings.apply_bindings( jo_link_focal_to_supp_bindings, focal_problem_formula );
      final SubLObject supported_the_set_of_formula = bindings.apply_bindings( jo_link_non_focal_to_supp_bindings, unrestricted_the_set_of_formula );
      final SubLObject supported_restriction_bindings = bindings.apply_bindings( jo_link_non_focal_to_supp_bindings, restriction_link_bindings );
      final SubLObject numeric_quantification_value_formula = numeric_quantification.compute_possible_numeric_quantification_value_formula( the_set_of_variable );
      final SubLObject generalized_query = el_utilities.make_conjunction( ConsesLow.listS( supported_generator_formula, supported_the_set_of_formula, ConsesLow.append( ( NIL != numeric_quantification_value_formula )
          ? ConsesLow.list( numeric_quantification_value_formula )
          : NIL, NIL ) ) );
      return Values.values( generalized_query, the_set_of_variable, supported_restriction_bindings );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 32611L)
  public static SubLObject find_unrestricted_problem_of_the_set_of_expression_problem(final SubLObject problem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject restricted_the_set_of_expressions = cycl_utilities.expression_gather( inference_datastructures_problem.problem_formula( problem ), $sym91$EL_INTENSIONAL_SET_P, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject link;
    SubLObject possible_unrestricted_problem;
    SubLObject restriction_link_bindings;
    SubLObject unrestricted_the_set_of_expressions;
    SubLObject candidate_results;
    SubLObject cdolist_list_var;
    SubLObject this_restricted_the_set_of_expression;
    SubLObject cdolist_list_var_$6;
    SubLObject this_unrestricted_the_set_of_expression;
    SubLObject current;
    SubLObject datum;
    SubLObject possible_unrestricted_problem_$7;
    SubLObject this_unrestricted_the_set_of_expression2;
    SubLObject restriction_link_bindings_$8;
    SubLObject dependent_problem;
    SubLObject unrestricted_problem;
    SubLObject unrestricted_the_set_of_expression;
    SubLObject restriction_link_bindings2;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, link ) )
      {
        if( NIL != inference_worker_restriction.restriction_link_p( link ) )
        {
          possible_unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem( link );
          restriction_link_bindings = inference_worker_restriction.restriction_link_bindings( link );
          if( NIL != inference_datastructures_problem.problem_p( possible_unrestricted_problem ) )
          {
            unrestricted_the_set_of_expressions = cycl_utilities.expression_gather( inference_datastructures_problem.problem_formula( possible_unrestricted_problem ), $sym91$EL_INTENSIONAL_SET_P, UNPROVIDED, UNPROVIDED,
                UNPROVIDED, UNPROVIDED );
            candidate_results = NIL;
            cdolist_list_var = restricted_the_set_of_expressions;
            this_restricted_the_set_of_expression = NIL;
            this_restricted_the_set_of_expression = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cdolist_list_var_$6 = unrestricted_the_set_of_expressions;
              this_unrestricted_the_set_of_expression = NIL;
              this_unrestricted_the_set_of_expression = cdolist_list_var_$6.first();
              while ( NIL != cdolist_list_var_$6)
              {
                if( this_restricted_the_set_of_expression.equal( bindings.apply_bindings( restriction_link_bindings, this_unrestricted_the_set_of_expression ) ) )
                {
                  candidate_results = ConsesLow.cons( ConsesLow.list( possible_unrestricted_problem, this_unrestricted_the_set_of_expression, restriction_link_bindings ), candidate_results );
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                this_unrestricted_the_set_of_expression = cdolist_list_var_$6.first();
              }
              cdolist_list_var = cdolist_list_var.rest();
              this_restricted_the_set_of_expression = cdolist_list_var.first();
            }
            if( NIL == $be_careful_when_solving_the_set_of_via_generalized_queryP$.getDynamicValue( thread ) || NIL != list_utilities.singletonP( candidate_results ) )
            {
              datum = ( current = list_utilities.only_one( candidate_results ) );
              possible_unrestricted_problem_$7 = NIL;
              this_unrestricted_the_set_of_expression2 = NIL;
              restriction_link_bindings_$8 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
              possible_unrestricted_problem_$7 = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
              this_unrestricted_the_set_of_expression2 = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
              restriction_link_bindings_$8 = current.first();
              current = current.rest();
              if( NIL == current )
              {
                return Values.values( possible_unrestricted_problem_$7, this_unrestricted_the_set_of_expression2, restriction_link_bindings_$8 );
              }
              cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
            }
          }
        }
        else if( NIL != inference_worker_join_ordered.join_ordered_link_p( link ) )
        {
          dependent_problem = inference_datastructures_problem_link.problem_link_supported_problem( link );
          if( NIL != inference_datastructures_problem.problem_p( dependent_problem ) )
          {
            thread.resetMultipleValues();
            unrestricted_problem = find_unrestricted_problem_of_the_set_of_expression_problem( dependent_problem );
            unrestricted_the_set_of_expression = thread.secondMultipleValue();
            restriction_link_bindings2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( NIL != unrestricted_problem )
            {
              return Values.values( unrestricted_problem, unrestricted_the_set_of_expression, restriction_link_bindings2 );
            }
          }
        }
        else if( NIL != inference_worker_split.split_link_p( link ) )
        {
          return find_unrestricted_problem_of_the_set_of_expression_problem( inference_datastructures_problem_link.problem_link_supported_problem( link ) );
        }
      }
    }
    return Values.values( NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 35013L)
  public static SubLObject find_jo_link_and_focal_problem_of_supported_problem(final SubLObject supported_problem)
  {
    SubLObject cdolist_list_var = list_utilities.find_all_if( $sym93$JOIN_ORDERED_LINK_P, inference_datastructures_problem.problem_all_dependent_links( supported_problem ), UNPROVIDED );
    SubLObject jo_link = NIL;
    jo_link = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject possible_focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem( jo_link );
      if( supported_problem.eql( inference_worker_join_ordered.join_ordered_link_non_focal_problem( jo_link ) ) )
      {
        return Values.values( jo_link, possible_focal_problem );
      }
      cdolist_list_var = cdolist_list_var.rest();
      jo_link = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 35511L)
  public static SubLObject the_set_of_elements_generalized_query_memoized_internal(final SubLObject generalized_query, final SubLObject mt)
  {
    final SubLObject query_properties = determine_the_set_of_elements_generalized_query_properties( generalized_query, mt );
    return recursive_query( generalized_query, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 35511L)
  public static SubLObject the_set_of_elements_generalized_query_memoized(final SubLObject generalized_query, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return the_set_of_elements_generalized_query_memoized_internal( generalized_query, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym94$THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym94$THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED, TWO_INTEGER, $int25$100, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym94$THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( generalized_query, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( generalized_query.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( the_set_of_elements_generalized_query_memoized_internal( generalized_query, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( generalized_query, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 35829L)
  public static SubLObject determine_the_set_of_elements_generalized_query_properties(final SubLObject generalized_query, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties( generalized_query, mt );
    query_properties = conses_high.putf( query_properties, $kw65$COMPUTE_ANSWER_JUSTIFICATIONS_, inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.getDynamicValue( thread ) );
    return query_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/ask-utilities.lisp", position = 36382L)
  public static SubLObject cyc_query_with_minimal_required_transformation(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_query_properties = conses_high.copy_list( query_properties );
    SubLObject max_max_transformation_depth = conses_high.getf( query_properties, $kw0$MAX_TRANSFORMATION_DEPTH, UNPROVIDED );
    SubLObject results = NIL;
    SubLObject halt_reason = NIL;
    if( !max_max_transformation_depth.isInteger() )
    {
      max_max_transformation_depth = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    new_query_properties = conses_high.putf( new_query_properties, $kw63$CONTINUABLE_, T );
    new_query_properties = conses_high.putf( new_query_properties, $kw0$MAX_TRANSFORMATION_DEPTH, MINUS_ONE_INTEGER );
    final SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties( new_query_properties );
    SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties( new_query_properties );
    final SubLObject inference = inference_kernel.new_continuable_inference( sentence, mt, query_static_properties );
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      SubLObject max_transformation_depth = conses_high.getf( query_dynamic_properties, $kw0$MAX_TRANSFORMATION_DEPTH, UNPROVIDED );
      max_transformation_depth = Numbers.add( max_transformation_depth, ONE_INTEGER );
      if( max_transformation_depth.numG( max_max_transformation_depth ) )
      {
        halt_reason = $kw95$EXHAUST;
        doneP = T;
      }
      else
      {
        query_dynamic_properties = conses_high.putf( query_dynamic_properties, $kw0$MAX_TRANSFORMATION_DEPTH, max_transformation_depth );
        thread.resetMultipleValues();
        final SubLObject results_$9 = inference_kernel.continue_inference( inference, query_dynamic_properties );
        final SubLObject halt_reason_$10 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        results = results_$9;
        halt_reason = halt_reason_$10;
        if( NIL == results )
        {
          continue;
        }
        doneP = T;
      }
    }
    return Values.values( results, halt_reason, inference );
  }

  public static SubLObject declare_ask_utilities_file()
  {
    SubLFiles.declareFunction( me, "query_properties_from_legacy_ask_parameters", "QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false );
    SubLFiles.declareFunction( me, "productivity_limit_from_removal_cost_cutoff", "PRODUCTIVITY-LIMIT-FROM-REMOVAL-COST-CUTOFF", 1, 0, false );
    SubLFiles.declareFunction( me, "query_static_properties_from_legacy_ask_parameters", "QUERY-STATIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 0, false );
    SubLFiles.declareFunction( me, "query_dynamic_properties_from_legacy_ask_parameters", "QUERY-DYNAMIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 5, false );
    SubLFiles.declareFunction( me, "query_justified", "QUERY-JUSTIFIED", 1, 2, false );
    SubLFiles.declareFunction( me, "ask_justified", "ASK-JUSTIFIED", 1, 5, false );
    SubLFiles.declareFunction( me, "query_template", "QUERY-TEMPLATE", 2, 2, false );
    SubLFiles.declareFunction( me, "ask_template", "ASK-TEMPLATE", 2, 5, false );
    SubLFiles.declareFunction( me, "query_variable", "QUERY-VARIABLE", 2, 2, false );
    SubLFiles.declareFunction( me, "ask_variable", "ASK-VARIABLE", 2, 5, false );
    SubLFiles.declareFunction( me, "query_template_eval", "QUERY-TEMPLATE-EVAL", 2, 2, false );
    SubLFiles.declareFunction( me, "ask_template_eval", "ASK-TEMPLATE-EVAL", 2, 5, false );
    SubLFiles.declareFunction( me, "query_boolean", "QUERY-BOOLEAN", 1, 2, false );
    SubLFiles.declareFunction( me, "recursive_ask_query_properties_from_legacy_ask_parameters", "RECURSIVE-ASK-QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false );
    SubLFiles.declareFunction( me, "within_recursive_queryP", "WITHIN-RECURSIVE-QUERY?", 0, 0, false );
    SubLFiles.declareFunction( me, "recursive_query", "RECURSIVE-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "query_property_inherited_by_recursive_queryP", "QUERY-PROPERTY-INHERITED-BY-RECURSIVE-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_query_properties_for_recursive_query", "FILTER-QUERY-PROPERTIES-FOR-RECURSIVE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "recursive_query_problem_store_to_reuse", "RECURSIVE-QUERY-PROBLEM-STORE-TO-REUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "kappa_tuples", "KAPPA-TUPLES", 3, 1, false );
    SubLFiles.declareFunction( me, "kappa_tuples_justified", "KAPPA-TUPLES-JUSTIFIED", 3, 1, false );
    SubLFiles.declareFunction( me, "inference_recursive_ask", "INFERENCE-RECURSIVE-ASK", 1, 5, false );
    SubLFiles.declareFunction( me, "inference_recursive_query", "INFERENCE-RECURSIVE-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "inference_recursive_query_unique_bindings", "INFERENCE-RECURSIVE-QUERY-UNIQUE-BINDINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "inference_recursive_ask_unique_bindings", "INFERENCE-RECURSIVE-ASK-UNIQUE-BINDINGS", 1, 5, false );
    SubLFiles.declareFunction( me, "inference_recursive_query_convert_to_hl_bindings", "INFERENCE-RECURSIVE-QUERY-CONVERT-TO-HL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_literal_truth", "INFERENCE-LITERAL-TRUTH", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_literal_ask", "INFERENCE-LITERAL-ASK", 2, 0, false );
    SubLFiles.declareFunction( me, "the_set_of_elements", "THE-SET-OF-ELEMENTS", 1, 2, false );
    SubLFiles.declareFunction( me, "the_set_of_problem_solvable_via_generalized_queryP", "THE-SET-OF-PROBLEM-SOLVABLE-VIA-GENERALIZED-QUERY?", 0, 3, false );
    SubLFiles.declareFunction( me, "pred_not_allowed_in_generalized_query_for_the_set_ofP", "PRED-NOT-ALLOWED-IN-GENERALIZED-QUERY-FOR-THE-SET-OF?", 1, 0, false );
    SubLFiles.declareFunction( me, "the_set_of_elements_via_generalized_query", "THE-SET-OF-ELEMENTS-VIA-GENERALIZED-QUERY", 0, 2, false );
    SubLFiles.declareFunction( me, "compute_the_set_of_elements_generalized_query", "COMPUTE-THE-SET-OF-ELEMENTS-GENERALIZED-QUERY", 0, 1, false );
    SubLFiles.declareFunction( me, "find_unrestricted_problem_of_the_set_of_expression_problem", "FIND-UNRESTRICTED-PROBLEM-OF-THE-SET-OF-EXPRESSION-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "find_jo_link_and_focal_problem_of_supported_problem", "FIND-JO-LINK-AND-FOCAL-PROBLEM-OF-SUPPORTED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "the_set_of_elements_generalized_query_memoized_internal", "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "the_set_of_elements_generalized_query_memoized", "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_the_set_of_elements_generalized_query_properties", "DETERMINE-THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_query_with_minimal_required_transformation", "CYC-QUERY-WITH-MINIMAL-REQUIRED-TRANSFORMATION", 1, 2, false );
    return NIL;
  }

  public static SubLObject init_ask_utilities_file()
  {
    $recursive_queries_browsableP$ = SubLFiles.defvar( "*RECURSIVE-QUERIES-BROWSABLE?*", $kw54$ONLY_FOR_EXISTING_STORES );
    $max_recursive_query_depth$ = SubLFiles.deflexical( "*MAX-RECURSIVE-QUERY-DEPTH*", $int57$27 );
    $recursive_query_depth$ = SubLFiles.defparameter( "*RECURSIVE-QUERY-DEPTH*", NIL );
    $allow_the_set_of_via_generalized_queryP$ = SubLFiles.defparameter( "*ALLOW-THE-SET-OF-VIA-GENERALIZED-QUERY?*", T );
    $be_careful_when_solving_the_set_of_via_generalized_queryP$ = SubLFiles.defparameter( "*BE-CAREFUL-WHEN-SOLVING-THE-SET-OF-VIA-GENERALIZED-QUERY?*", T );
    $debug_the_set_of_problem_solvable_via_generalized_queryP$ = SubLFiles.defparameter( "*DEBUG-THE-SET-OF-PROBLEM-SOLVABLE-VIA-GENERALIZED-QUERY?*", NIL );
    return NIL;
  }

  public static SubLObject setup_ask_utilities_file()
  {
    utilities_macros.register_cyc_api_function( $sym26$QUERY_JUSTIFIED, $list27, $str28$Ask_for_bindings_for_free_variabl, NIL, $list29 );
    utilities_macros.register_obsolete_cyc_api_function( $sym30$ASK_JUSTIFIED, $list31, $list32, $str33$Ask_for_bindings_for_free_variabl, NIL, $list29 );
    utilities_macros.register_cyc_api_function( $sym34$QUERY_TEMPLATE, $list35, $str36$Ask_SENTENCE_in_MT___Return_resul, NIL, $list29 );
    utilities_macros.register_obsolete_cyc_api_function( $sym37$ASK_TEMPLATE, $list38, $list39, $str40$Ask_SENTENCE_in_MT___Return_resul, NIL, $list29 );
    utilities_macros.register_cyc_api_function( $sym41$QUERY_VARIABLE, $list42, $str43$Ask_SENTENCE_in_MT_treating_VARIA, NIL, $list29 );
    utilities_macros.register_obsolete_cyc_api_function( $sym44$ASK_VARIABLE, $list45, $list46, $str47$Ask_SENTENCE_in_MT_treating_VARIA, NIL, $list29 );
    utilities_macros.register_cyc_api_function( $sym48$QUERY_TEMPLATE_EVAL, $list35, $str49$Ask_SENTENCE_in_MT_under_the_reso, NIL, $list50 );
    utilities_macros.register_obsolete_cyc_api_function( $sym51$ASK_TEMPLATE_EVAL, $list52, $list39, $str53$Ask_SENTENCE_in_MT_under_the_reso, NIL, $list50 );
    memoization_state.note_memoized_function( $sym94$THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ask_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ask_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ask_utilities_file();
  }
  static
  {
    me = new ask_utilities();
    $recursive_queries_browsableP$ = null;
    $max_recursive_query_depth$ = null;
    $recursive_query_depth$ = null;
    $allow_the_set_of_via_generalized_queryP$ = null;
    $be_careful_when_solving_the_set_of_via_generalized_queryP$ = null;
    $debug_the_set_of_problem_solvable_via_generalized_queryP$ = null;
    $kw0$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw1$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw2$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw3$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $kw4$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $kw5$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw6$EL = makeKeyword( "EL" );
    $kw7$HL = makeKeyword( "HL" );
    $kw8$ALLOWED_RULES = makeKeyword( "ALLOWED-RULES" );
    $kw9$ALL = makeKeyword( "ALL" );
    $sym10$INFERENCE_RETURN_BLISTS = makeSymbol( "INFERENCE-RETURN-BLISTS" );
    $kw11$RETURN = makeKeyword( "RETURN" );
    $kw12$BINDINGS = makeKeyword( "BINDINGS" );
    $kw13$RESULT_UNIQUENESS = makeKeyword( "RESULT-UNIQUENESS" );
    $sym14$INFERENCE_RETURN_BLISTS_AND_SUPPORTS = makeSymbol( "INFERENCE-RETURN-BLISTS-AND-SUPPORTS" );
    $kw15$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $kw16$PROOF = makeKeyword( "PROOF" );
    $sym17$INFERENCE_RETURN_TEMPLATE = makeSymbol( "INFERENCE-RETURN-TEMPLATE" );
    $kw18$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw19$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" );
    $kw20$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" );
    $kw21$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" );
    $kw22$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $kw23$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $kw24$NEGATION_BY_FAILURE_ = makeKeyword( "NEGATION-BY-FAILURE?" );
    $int25$100 = makeInteger( 100 );
    $sym26$QUERY_JUSTIFIED = makeSymbol( "QUERY-JUSTIFIED" );
    $list27 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "QUERY-PROPERTIES" ) );
    $str28$Ask_for_bindings_for_free_variabl = makeString(
        "Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   Returns a list of binding and justificaion pairs." );
    $list29 = ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "QUERY-HALT-REASON-P" ) );
    $sym30$ASK_JUSTIFIED = makeSymbol( "ASK-JUSTIFIED" );
    $list31 = ConsesLow.list( makeSymbol( "QUERY-JUSTIFIED" ) );
    $list32 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "BACKCHAIN" ), makeSymbol( "NUMBER" ), makeSymbol( "TIME" ), makeSymbol( "DEPTH" ) );
    $str33$Ask_for_bindings_for_free_variabl = makeString(
        "Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   If BACKCHAIN is NIL, no inference is performed.\n   If BACKCHAIN is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If BACKCHAIN is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If NUMBER is an integer, then at most that number of bindings are returned.\n   If TIME is an integer, then at most TIME seconds are consumed by the search for bindings.\n   If DEPTH is an integer, then the inference paths are limited to that number of total steps.\n   Returns a list of binding and justificaion pairs.\n   Deprecated in favor of query-justified." );
    $sym34$QUERY_TEMPLATE = makeSymbol( "QUERY-TEMPLATE" );
    $list35 = ConsesLow.list( makeSymbol( "TEMPLATE" ), makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "QUERY-PROPERTIES" ) );
    $str36$Ask_SENTENCE_in_MT___Return_resul = makeString( "Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE." );
    $sym37$ASK_TEMPLATE = makeSymbol( "ASK-TEMPLATE" );
    $list38 = ConsesLow.list( makeSymbol( "QUERY-TEMPLATE" ) );
    $list39 = ConsesLow.list( makeSymbol( "TEMPLATE" ), makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "BACKCHAIN" ), makeSymbol( "NUMBER" ), makeSymbol( "TIME" ), makeSymbol(
        "DEPTH" ) );
    $str40$Ask_SENTENCE_in_MT___Return_resul = makeString( "Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.\n   Deprecated in favor of query-template." );
    $sym41$QUERY_VARIABLE = makeSymbol( "QUERY-VARIABLE" );
    $list42 = ConsesLow.list( makeSymbol( "VARIABLE-TOKEN" ), makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "QUERY-PROPERTIES" ) );
    $str43$Ask_SENTENCE_in_MT_treating_VARIA = makeString( "Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired." );
    $sym44$ASK_VARIABLE = makeSymbol( "ASK-VARIABLE" );
    $list45 = ConsesLow.list( makeSymbol( "QUERY-VARIABLE" ) );
    $list46 = ConsesLow.list( makeSymbol( "VARIABLE-TOKEN" ), makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "BACKCHAIN" ), makeSymbol( "NUMBER" ), makeSymbol( "TIME" ), makeSymbol(
        "DEPTH" ) );
    $str47$Ask_SENTENCE_in_MT_treating_VARIA = makeString(
        "Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.\n   Deprecated in favor of query-variable." );
    $sym48$QUERY_TEMPLATE_EVAL = makeSymbol( "QUERY-TEMPLATE-EVAL" );
    $str49$Ask_SENTENCE_in_MT_under_the_reso = makeString(
        "Ask SENTENCE in MT under the resource constraints query-properties\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed." );
    $list50 = ConsesLow.list( makeSymbol( "NON-NEGATIVE-INTEGER-P" ) );
    $sym51$ASK_TEMPLATE_EVAL = makeSymbol( "ASK-TEMPLATE-EVAL" );
    $list52 = ConsesLow.list( makeSymbol( "QUERY-TEMPLATE-EVAL" ) );
    $str53$Ask_SENTENCE_in_MT_under_the_reso = makeString(
        "Ask SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.\n Deprecated in favor of query-template-eval." );
    $kw54$ONLY_FOR_EXISTING_STORES = makeKeyword( "ONLY-FOR-EXISTING-STORES" );
    $kw55$NONE = makeKeyword( "NONE" );
    $kw56$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $int57$27 = makeInteger( 27 );
    $kw58$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $kw59$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $str60$max_recursive_query_depth_of__s_e = makeString( "max recursive query depth of ~s exceeded with query ~s in mt ~s" );
    $str61$Either_deeper_thought_is_required = makeString( "Either deeper thought is required to answer this query, or it is a paradox." );
    $sym62$QUEUE_P = makeSymbol( "QUEUE-P" );
    $kw63$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $sym64$QUERY_PROPERTY_INHERITED_BY_RECURSIVE_QUERY_ = makeSymbol( "QUERY-PROPERTY-INHERITED-BY-RECURSIVE-QUERY?" );
    $kw65$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $list66 = ConsesLow.list( makeKeyword( "SUPPORTS" ) );
    $kw67$TRUE = makeKeyword( "TRUE" );
    $kw68$FALSE = makeKeyword( "FALSE" );
    $kw69$UNKNOWN = makeKeyword( "UNKNOWN" );
    $list70 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $list71 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "QUERY" ) );
    $sym72$FIRST = makeSymbol( "FIRST" );
    $const73$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $kw74$NO_THE_SET_OF_EXPRESSION_FOUND = makeKeyword( "NO-THE-SET-OF-EXPRESSION-FOUND" );
    $kw75$THE_SET_OF_VIA_GENERALIZED_QUERY_NOT_ALLOWED = makeKeyword( "THE-SET-OF-VIA-GENERALIZED-QUERY-NOT-ALLOWED" );
    $kw76$SKSI_STRONGLY_PREFER_CONJUNCTIVE_REMOVAL_MODULES_NOT_T = makeKeyword( "SKSI-STRONGLY-PREFER-CONJUNCTIVE-REMOVAL-MODULES-NOT-T" );
    $kw77$PROBLEM_NOT_VALID = makeKeyword( "PROBLEM-NOT-VALID" );
    $kw78$CANNOT_FIND_UNRESTRICTED_PROBLEM_OF_THE_SET_OF_EXPRESSION_PROBLEM = makeKeyword( "CANNOT-FIND-UNRESTRICTED-PROBLEM-OF-THE-SET-OF-EXPRESSION-PROBLEM" );
    $kw79$CANNOT_FIND_JO_LINK_AND_FOCAL_PROBLEM_OF_SUPPORTED_PROBLEM = makeKeyword( "CANNOT-FIND-JO-LINK-AND-FOCAL-PROBLEM-OF-SUPPORTED-PROBLEM" );
    $kw80$GENERALIZED_QUERY_PROPERTIES_DIFFERENT_THAN_RESTRICTED_QUERY_PROP = makeKeyword( "GENERALIZED-QUERY-PROPERTIES-DIFFERENT-THAN-RESTRICTED-QUERY-PROPERTIES" );
    $kw81$GENERALIZED_QUERY_NOT_GENERALIZED__CONTAINS_RESTRICTED_QUERY = makeKeyword( "GENERALIZED-QUERY-NOT-GENERALIZED--CONTAINS-RESTRICTED-QUERY" );
    $sym82$PRED_NOT_ALLOWED_IN_GENERALIZED_QUERY_FOR_THE_SET_OF_ = makeSymbol( "PRED-NOT-ALLOWED-IN-GENERALIZED-QUERY-FOR-THE-SET-OF?" );
    $kw83$GENERALIZED_QUERY_CONTAINS_PRED_NOT_ALLOWED_IN_GENERALIZED_QUERY_ = makeKeyword( "GENERALIZED-QUERY-CONTAINS-PRED-NOT-ALLOWED-IN-GENERALIZED-QUERY-FOR-THE-SET-OF" );
    $sym84$EQUALS_EL_ = makeSymbol( "EQUALS-EL?" );
    $str85$the_set_of_via_generalized_query_ = makeString( "the-set-of-via-generalized-query missed an answer!~%" );
    $str86$__Generalized_query___new_cyc_que = makeString( "  Generalized query: (new-cyc-query ~S ~S ~S)~%" );
    $str87$__Restricted__query___new_cyc_que = makeString( "  Restricted  query: (new-cyc-query ~S ~S ~S)~%" );
    $str88$__Missed_answer___S_____S__ = makeString( "  Missed answer: ~S -> ~S~%" );
    $kw89$FALLTHROUGH_NIL = makeKeyword( "FALLTHROUGH-NIL" );
    $const90$predNotAllowedInGeneralizedQueryF = constant_handles.reader_make_constant_shell( makeString( "predNotAllowedInGeneralizedQueryForTheSetOf" ) );
    $sym91$EL_INTENSIONAL_SET_P = makeSymbol( "EL-INTENSIONAL-SET-P" );
    $list92 = ConsesLow.list( makeSymbol( "POSSIBLE-UNRESTRICTED-PROBLEM" ), makeSymbol( "THIS-UNRESTRICTED-THE-SET-OF-EXPRESSION" ), makeSymbol( "RESTRICTION-LINK-BINDINGS" ) );
    $sym93$JOIN_ORDERED_LINK_P = makeSymbol( "JOIN-ORDERED-LINK-P" );
    $sym94$THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED = makeSymbol( "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED" );
    $kw95$EXHAUST = makeKeyword( "EXHAUST" );
  }
}
/*
 *
 * Total time: 261 ms
 *
 */