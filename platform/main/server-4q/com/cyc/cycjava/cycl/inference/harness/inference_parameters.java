package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.proof_view;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.modules.transformation_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_parameters
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_parameters";
  public static final String myFingerPrint = "e5b9b94ec29269dddbc0da7cbbafa4c9115167d6bd9980415cdfff340c9ad69e";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 7114L)
  private static SubLSymbol $gather_inference_answer_query_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 8588L)
  private static SubLSymbol $boolean_query_properties_to_include_on_merge$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 9586L)
  private static SubLSymbol $query_properties_efficiency_hierarchy$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11144L)
  private static SubLSymbol $numeric_query_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11550L)
  private static SubLSymbol $numeric_query_properties_that_max_out_at_positive_infinity$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 22797L)
  private static SubLSymbol $proof_query_properties_to_override$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 32740L)
  private static SubLSymbol $inference_mode_query_properties_table$;
  private static final SubLSymbol $kw0$UNSPECIFIED;
  private static final SubLSymbol $kw1$CONDITIONAL_SENTENCE_;
  private static final SubLObject $const2$BaseKB;
  private static final SubLSymbol $sym3$QUERY_PROPERTIES_P;
  private static final SubLSymbol $kw4$INFERENCE_MODE;
  private static final SubLSymbol $kw5$CUSTOM;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$CAR;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLString $str12$Invalid_value_for_the_properties_;
  private static final SubLString $str13$unexpected_property__s;
  private static final SubLSymbol $sym14$PROBLEM_STORE_P;
  private static final SubLSymbol $kw15$UNDETERMINED;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$BINDINGS;
  private static final SubLSymbol $kw19$MAX_PROBLEM_COUNT;
  private static final SubLSymbol $kw20$MAX_TIME;
  private static final SubLSymbol $kw21$MAX_STEP;
  private static final SubLSymbol $kw22$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLFloat $float23$1_0;
  private static final SubLSymbol $kw24$SKIP;
  private static final SubLSymbol $kw25$ILL_FORMED;
  private static final SubLSymbol $kw26$INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $kw27$MAX_NUMBER;
  private static final SubLFloat $float28$1_1;
  private static final SubLSymbol $kw29$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw30$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw31$HL;
  private static final SubLSymbol $kw32$EL;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$HL_SUPPORT_P;
  private static final SubLSymbol $kw35$PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $kw36$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw37$TRANSFORMATION_ALLOWED_;
  private static final SubLSymbol $kw38$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw39$REWRITE_ALLOWED_;
  private static final SubLSymbol $kw40$ABDUCTION_ALLOWED_;
  private static final SubLSymbol $kw41$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw42$TRANS_ISA_POS;
  private static final SubLSymbol $kw43$ALLOW_HL_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw44$REMOVAL_TVA_UNIFY_CLOSURE;
  private static final SubLSymbol $kw45$TRANSITIVE_CLOSURE_MODE;
  private static final SubLSymbol $kw46$EVALUATE_SUBL_ALLOWED_;
  private static final SubLSymbol $kw47$NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $kw48$MINIMIZE;
  private static final SubLSymbol $kw49$NEGATION_BY_FAILURE_;
  private static final SubLSymbol $kw50$ABNORMAL;
  private static final SubLSymbol $kw51$ALLOW_ABNORMALITY_CHECKING_;
  private static final SubLSymbol $kw52$COMPLETENESS_MINIMIZATION_ALLOWED_;
  private static final SubLSymbol $kw53$MAX_PROOF_DEPTH;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$QUERY_PROPERTIES_MORE_EFFICIENT_;
  private static final SubLSymbol $sym56$QUERY_PROPERTIES_LESS_EFFICIENT_;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$INFERENCE_MODE_P;
  private static final SubLSymbol $kw59$MIN_RULE_UTILITY;
  private static final SubLSymbol $sym60$INFERENCE_MERGE_QUERY_PROPERTIES;
  private static final SubLSymbol $kw61$TEST;
  private static final SubLSymbol $kw62$OWNER;
  private static final SubLSymbol $kw63$CLASSES;
  private static final SubLSymbol $kw64$KB;
  private static final SubLSymbol $kw65$TINY;
  private static final SubLSymbol $kw66$WORKING_;
  private static final SubLList $list67;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 1364L)
  public static SubLObject explicify_inference_engine_query_property_defaults(final SubLObject query_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject explicified_query_properties = NIL;
    final SubLObject strengthened_query_properties = inference_strategist.explicify_inference_mode_defaults( query_properties );
    SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_query_properties();
    SubLObject query_property = NIL;
    query_property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject v_default = inference_datastructures_enumerated_types.inference_engine_default_for_property( query_property );
      final SubLObject default_specifiedP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject current = conses_high.getf( strengthened_query_properties, query_property, $kw0$UNSPECIFIED );
      if( current != $kw0$UNSPECIFIED )
      {
        explicified_query_properties = conses_high.putf( explicified_query_properties, query_property, current );
      }
      else if( NIL != default_specifiedP )
      {
        explicified_query_properties = conses_high.putf( explicified_query_properties, query_property, v_default );
      }
      cdolist_list_var = cdolist_list_var.rest();
      query_property = cdolist_list_var.first();
    }
    return explicified_query_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 2588L)
  public static SubLObject explicify_query_tool_query_property_defaults(final SubLObject query_properties, final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject explicified_query_properties = NIL;
    final SubLObject strengthened_query_properties = inference_strategist.explicify_inference_mode_defaults( query_properties );
    SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_query_properties();
    SubLObject query_property = NIL;
    query_property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      SubLObject v_default = cb_query.query_tool_default_for_property( query_property );
      SubLObject default_specifiedP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( $kw1$CONDITIONAL_SENTENCE_ == query_property )
      {
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist_permissive( sentence, $const2$BaseKB );
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != el_utilities.el_implication_p( right_sentence ) )
        {
          v_default = T;
          default_specifiedP = T;
        }
      }
      final SubLObject current = conses_high.getf( strengthened_query_properties, query_property, $kw0$UNSPECIFIED );
      if( current != $kw0$UNSPECIFIED )
      {
        explicified_query_properties = conses_high.putf( explicified_query_properties, query_property, current );
      }
      else if( NIL != default_specifiedP )
      {
        explicified_query_properties = conses_high.putf( explicified_query_properties, query_property, v_default );
      }
      cdolist_list_var = cdolist_list_var.rest();
      query_property = cdolist_list_var.first();
    }
    return explicified_query_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 4041L)
  public static SubLObject remove_inference_engine_query_property_defaults(final SubLObject query_properties)
  {
    SubLObject implicified_query_properties = NIL;
    final SubLObject weakened_query_properties = inference_strategist.implicify_inference_mode_defaults( query_properties );
    SubLObject remainder;
    SubLObject query_property;
    SubLObject value;
    for( remainder = NIL, remainder = weakened_query_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      query_property = remainder.first();
      value = conses_high.cadr( remainder );
      if( !value.equal( inference_datastructures_enumerated_types.inference_engine_default_for_property( query_property ) ) )
      {
        implicified_query_properties = conses_high.putf( implicified_query_properties, query_property, value );
      }
    }
    return implicified_query_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 4867L)
  public static SubLObject inference_merge_query_properties(SubLObject query_properties_1, SubLObject query_properties_2)
  {
    assert NIL != inference_datastructures_enumerated_types.query_properties_p( query_properties_1 ) : query_properties_1;
    assert NIL != inference_datastructures_enumerated_types.query_properties_p( query_properties_2 ) : query_properties_2;
    final SubLObject mode1 = inference_datastructures_enumerated_types.inference_query_property_lookup( query_properties_1, $kw4$INFERENCE_MODE );
    final SubLObject mode2 = inference_datastructures_enumerated_types.inference_query_property_lookup( query_properties_2, $kw4$INFERENCE_MODE );
    if( !makeBoolean( mode1 != $kw5$CUSTOM ).eql( makeBoolean( mode2 != $kw5$CUSTOM ) ) )
    {
      query_properties_1 = inference_strategist.explicify_inference_mode_defaults( query_properties_1 );
      query_properties_2 = inference_strategist.explicify_inference_mode_defaults( query_properties_2 );
    }
    final SubLObject relevant_properties = union_plist_properties( query_properties_1, query_properties_2 );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = relevant_properties;
    SubLObject property = NIL;
    property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject value1 = inference_datastructures_enumerated_types.inference_query_property_lookup( query_properties_1, property );
      final SubLObject value2 = inference_datastructures_enumerated_types.inference_query_property_lookup( query_properties_2, property );
      final SubLObject conservative_value = inference_conservatively_select_property_value_for_merge( property, value1, value2 );
      result = conses_high.putf( result, property, conservative_value );
      cdolist_list_var = cdolist_list_var.rest();
      property = cdolist_list_var.first();
    }
    result = list_utilities.sort_plist_via_position( result, inference_datastructures_enumerated_types.all_query_properties(), UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 6574L)
  public static SubLObject union_plist_properties(final SubLObject plist1, final SubLObject plist2)
  {
    return conses_high.nunion( list_utilities.plist_properties( plist1 ), list_utilities.plist_properties( plist2 ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 6802L)
  public static SubLObject inference_conservatively_select_property_value_for_merge(final SubLObject property, final SubLObject value1, final SubLObject value2)
  {
    if( NIL != boolean_query_property_to_include_on_mergeP( property ) )
    {
      return makeBoolean( NIL != value1 || NIL != value2 );
    }
    return ( NIL != query_property_value_at_least_as_completeP( property, value1, value2 ) ) ? value1 : value2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 8330L)
  public static SubLObject gather_inference_answer_query_propertyP(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $gather_inference_answer_query_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 8464L)
  public static SubLObject gather_inference_answer_query_properties()
  {
    return conses_high.copy_list( $gather_inference_answer_query_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 9436L)
  public static SubLObject boolean_query_property_to_include_on_mergeP(final SubLObject property)
  {
    return list_utilities.member_eqP( property, $boolean_query_properties_to_include_on_merge$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 10877L)
  public static SubLObject query_property_in_efficiency_hierarchyP(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $query_properties_efficiency_hierarchy$.getGlobalValue(), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym9$CAR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11022L)
  public static SubLObject query_properties_efficiency_hierarchy()
  {
    return conses_high.copy_alist( $query_properties_efficiency_hierarchy$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11837L)
  public static SubLObject numeric_query_properties()
  {
    return conses_high.copy_list( $numeric_query_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11930L)
  public static SubLObject numeric_query_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $numeric_query_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 12037L)
  public static SubLObject numeric_query_property_max(final SubLObject numeric_query_property)
  {
    if( NIL != list_utilities.member_eqP( numeric_query_property, $numeric_query_properties_that_max_out_at_positive_infinity$.getGlobalValue() ) )
    {
      return number_utilities.positive_infinity();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 12262L)
  public static SubLObject query_property_value_more_efficientP(final SubLObject property, SubLObject value1, SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.member_eqP( property, $numeric_query_properties$.getGlobalValue() ) )
    {
      if( NIL == value1 )
      {
        value1 = number_utilities.positive_infinity();
      }
      if( NIL == value2 )
      {
        value2 = number_utilities.positive_infinity();
      }
      return number_utilities.potentially_infinite_number_L( value1, value2 );
    }
    final SubLObject hierarchy = list_utilities.alist_lookup( $query_properties_efficiency_hierarchy$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED );
    if( NIL != hierarchy )
    {
      final SubLObject value1_rank = Sequences.position( value1, hierarchy, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject value2_rank = Sequences.position( value2, hierarchy, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == value1_rank )
      {
        Errors.error( $str12$Invalid_value_for_the_properties_, property, value1 );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == value2_rank )
      {
        Errors.error( $str12$Invalid_value_for_the_properties_, property, value2 );
      }
      return Numbers.numL( value1_rank, value2_rank );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 13145L)
  public static SubLObject query_property_value_more_completeP(final SubLObject property, final SubLObject value1, final SubLObject value2)
  {
    return query_property_value_more_efficientP( property, value2, value1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 13296L)
  public static SubLObject query_property_value_at_least_as_efficientP(final SubLObject property, final SubLObject value1, final SubLObject value2)
  {
    return makeBoolean( value1.equal( value2 ) || NIL != query_property_value_more_efficientP( property, value1, value2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 13488L)
  public static SubLObject query_property_value_at_least_as_completeP(final SubLObject property, final SubLObject value1, final SubLObject value2)
  {
    return makeBoolean( value1.equal( value2 ) || NIL != query_property_value_more_completeP( property, value1, value2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 13678L)
  public static SubLObject most_efficient_value_for_query_property(final SubLObject property)
  {
    if( NIL != query_property_in_efficiency_hierarchyP( property ) )
    {
      final SubLObject values = list_utilities.alist_lookup( $query_properties_efficiency_hierarchy$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED );
      return values.first();
    }
    if( NIL != numeric_query_property_p( property ) )
    {
      return ZERO_INTEGER;
    }
    return Errors.error( $str13$unexpected_property__s, property );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 14031L)
  public static SubLObject most_efficient_value_for_query_propertyP(final SubLObject property, final SubLObject value)
  {
    return Equality.equal( value, most_efficient_value_for_query_property( property ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 14182L)
  public static SubLObject most_complete_value_for_query_property(final SubLObject property)
  {
    if( NIL != query_property_in_efficiency_hierarchyP( property ) )
    {
      final SubLObject values = list_utilities.alist_lookup( $query_properties_efficiency_hierarchy$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED );
      return list_utilities.last_one( values );
    }
    if( NIL != numeric_query_property_p( property ) )
    {
      return numeric_query_property_max( property );
    }
    return Errors.error( $str13$unexpected_property__s, property );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 14573L)
  public static SubLObject most_complete_value_for_query_propertyP(final SubLObject property, final SubLObject value)
  {
    return Equality.equal( value, most_complete_value_for_query_property( property ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 14722L)
  public static SubLObject problem_store_allows_reuse_wrt_query_propertiesP(final SubLObject store, final SubLObject query_properties)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    final SubLObject problem_store_static_properties = inference_datastructures_enumerated_types.extract_problem_store_static_properties( query_properties );
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = problem_store_static_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      if( NIL == problem_store_allows_reuse_wrt_query_property( store, property, value ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 15216L)
  public static SubLObject problem_store_allows_reuse_wrt_query_property(final SubLObject store, final SubLObject query_property, final SubLObject value)
  {
    if( NIL != inference_datastructures_enumerated_types.problem_store_static_property_p( query_property ) )
    {
      final SubLObject store_value = inference_utilities.problem_store_property_lookup( store, query_property, $kw15$UNDETERMINED );
      if( $kw15$UNDETERMINED != store_value && !store_value.equal( value ) )
      {
        if( NIL != boolean_query_property_to_include_on_mergeP( query_property ) )
        {
          return makeBoolean( NIL == value || NIL != store_value );
        }
        if( NIL != query_property_in_efficiency_hierarchyP( query_property ) )
        {
          return query_property_value_at_least_as_completeP( query_property, store_value, value );
        }
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 15847L)
  public static SubLObject inference_compute_all_answers_query_properties(final SubLObject inference)
  {
    final SubLObject property_sets = inference_compute_inference_answer_query_properties( inference );
    if( NIL == property_sets )
    {
      return $list16;
    }
    SubLObject current;
    final SubLObject datum = current = property_sets;
    SubLObject first = NIL;
    SubLObject rest = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    first = current.first();
    current = ( rest = current.rest() );
    SubLObject running_result;
    final SubLObject first_query_properties = running_result = conses_high.remf( first, $kw18$BINDINGS );
    SubLObject cdolist_list_var = rest;
    SubLObject next = NIL;
    next = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject next_query_properties = conses_high.remf( next, $kw18$BINDINGS );
      running_result = inference_merge_query_properties( running_result, next_query_properties );
      cdolist_list_var = cdolist_list_var.rest();
      next = cdolist_list_var.first();
    }
    final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject max_problem_count = inference_datastructures_problem_store.problem_store_historical_problem_count( store );
    SubLObject max_time = inference_datastructures_inference.inference_last_answer_elapsed_time( inference );
    final SubLObject max_step = inference_datastructures_inference.inference_last_answer_step_count( inference );
    max_time = Numbers.ceiling( max_time, UNPROVIDED );
    running_result = conses_high.putf( running_result, $kw19$MAX_PROBLEM_COUNT, max_problem_count );
    running_result = conses_high.putf( running_result, $kw20$MAX_TIME, max_time );
    running_result = conses_high.putf( running_result, $kw21$MAX_STEP, max_step );
    running_result = conses_high.putf( running_result, $kw22$PROBABLY_APPROXIMATELY_DONE, $float23$1_0 );
    return running_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 17502L)
  public static SubLObject inference_compute_some_answer_query_properties(final SubLObject inference)
  {
    return compute_most_efficient_query_properties( inference_compute_inference_answer_query_properties( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 17812L)
  public static SubLObject inference_compute_proof_query_properties(final SubLObject inference)
  {
    return inference_compute_inference_answer_query_properties_int( inference, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 17987L)
  public static SubLObject inference_compute_inference_answer_query_properties(final SubLObject inference)
  {
    return inference_compute_inference_answer_query_properties_int( inference, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 18151L)
  public static SubLObject compute_most_complete_query_properties(final SubLObject query_properties_list)
  {
    return compute_extremal_query_properties_int( query_properties_list, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 18403L)
  public static SubLObject compute_most_efficient_query_properties(final SubLObject query_properties_list)
  {
    return compute_extremal_query_properties_int( query_properties_list, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 18658L)
  public static SubLObject compute_extremal_query_properties_int(final SubLObject query_properties_list, final SubLObject most_completeP)
  {
    SubLObject extremal_properties = NIL;
    SubLObject max_time = ZERO_INTEGER;
    SubLObject max_step = ZERO_INTEGER;
    SubLObject time = NIL;
    SubLObject step = NIL;
    SubLObject cdolist_list_var = conses_high.copy_tree( query_properties_list );
    SubLObject v_properties = NIL;
    v_properties = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      time = conses_high.getf( v_properties, $kw20$MAX_TIME, ZERO_INTEGER );
      step = conses_high.getf( v_properties, $kw21$MAX_STEP, ZERO_INTEGER );
      conses_high.remf( v_properties, $kw20$MAX_TIME );
      conses_high.remf( v_properties, $kw21$MAX_STEP );
      if( time.numG( max_time ) )
      {
        max_time = time;
      }
      if( step.numG( max_step ) )
      {
        max_step = step;
      }
      extremal_properties = ( ( NIL != most_completeP ) ? get_least_efficient_query_properties( extremal_properties, v_properties ) : get_most_efficient_query_properties( extremal_properties, v_properties ) );
      cdolist_list_var = cdolist_list_var.rest();
      v_properties = cdolist_list_var.first();
    }
    conses_high.putf( extremal_properties, $kw20$MAX_TIME, max_time );
    conses_high.putf( extremal_properties, $kw21$MAX_STEP, max_step );
    return conses_high.remf( conses_high.copy_list( extremal_properties ), $kw18$BINDINGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 19606L)
  public static SubLObject inference_compute_inference_answer_query_properties_int(final SubLObject inference, final SubLObject include_proof_propertiesP)
  {
    SubLObject inference_answer_query_properties_list = NIL;
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw24$SKIP ) )
    {
      final SubLObject idx_$1 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw24$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference_answer;
        SubLObject answer_properties;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw24$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference_answer ) )
            {
              inference_answer = $kw24$SKIP;
            }
            answer_properties = inference_answer_compute_inference_answer_query_properties( inference_answer, inference, include_proof_propertiesP );
            if( NIL != include_proof_propertiesP )
            {
              inference_answer_query_properties_list = ConsesLow.nconc( answer_properties, inference_answer_query_properties_list );
            }
            else
            {
              inference_answer_query_properties_list = ConsesLow.cons( answer_properties, inference_answer_query_properties_list );
            }
          }
        }
      }
      final SubLObject idx_$2 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$2 );
        SubLObject id2 = NIL;
        SubLObject inference_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference_answer2 = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject answer_properties2 = inference_answer_compute_inference_answer_query_properties( inference_answer2, inference, include_proof_propertiesP );
            if( NIL != include_proof_propertiesP )
            {
              inference_answer_query_properties_list = ConsesLow.nconc( answer_properties2, inference_answer_query_properties_list );
            }
            else
            {
              inference_answer_query_properties_list = ConsesLow.cons( answer_properties2, inference_answer_query_properties_list );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return Sequences.nreverse( inference_answer_query_properties_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 20260L)
  public static SubLObject inference_answer_compute_inference_answer_query_properties(final SubLObject inference_answer, final SubLObject inference, final SubLObject include_proof_propertiesP)
  {
    final SubLObject proof_properties_list = compute_proof_query_properties_list( inference_answer, inference );
    final SubLObject answer_properties = inference_answer_compute_inference_answer_query_properties_int( proof_properties_list, inference_answer );
    if( NIL == include_proof_propertiesP )
    {
      return answer_properties;
    }
    return distribute_answer_properties_over_proof_properties_list( answer_properties, proof_properties_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 20793L)
  public static SubLObject inference_answer_compute_inference_answer_query_properties_int(final SubLObject proof_properties_list, final SubLObject inference_answer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answer_properties = most_efficient_query_properties( proof_properties_list );
    final SubLObject store = inference_datastructures_inference.inference_answer_problem_store( inference_answer );
    SubLObject rejected_proofs = NIL;
    SubLObject doneP = NIL;
    if( NIL != inference_datastructures_problem_store.problem_store_some_rejected_proofsP( store ) )
    {
      rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs( store );
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( rejected_proofs ) ); NIL == doneP && NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject proof = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( reason == $kw25$ILL_FORMED )
        {
          answer_properties = conses_high.putf( answer_properties, $kw26$INTERMEDIATE_STEP_VALIDATION_LEVEL, inference_datastructures_problem_store.problem_store_intermediate_step_validation_level( store ) );
          doneP = T;
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    }
    answer_properties = conses_high.putf( answer_properties, $kw27$MAX_NUMBER, Numbers.add( ONE_INTEGER, inference_datastructures_inference.inference_answer_suid( inference_answer ) ) );
    final SubLObject elapsed_time = Numbers.add( ONE_INTEGER, Numbers.multiply( $float28$1_1, inference_datastructures_inference.inference_answer_elapsed_time( inference_answer, NIL ) ) );
    final SubLObject pad = inference_datastructures_inference.compute_pad_from_time( elapsed_time );
    answer_properties = conses_high.putf( answer_properties, $kw20$MAX_TIME, elapsed_time );
    if( NIL != pad )
    {
      answer_properties = conses_high.putf( answer_properties, $kw22$PROBABLY_APPROXIMATELY_DONE, pad );
    }
    final SubLObject total_steps = inference_datastructures_inference.inference_answer_step_count( inference_answer );
    answer_properties = conses_high.putf( answer_properties, $kw21$MAX_STEP, total_steps );
    final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( inference_answer );
    if( NIL != inference_strategist.some_answer_bindings_are_indeterminateP( v_bindings ) )
    {
      answer_properties = conses_high.putf( answer_properties, $kw29$ALLOW_INDETERMINATE_RESULTS_, T );
    }
    if( NIL != inference_strategist.some_answer_bindings_are_hlP( v_bindings ) )
    {
      answer_properties = conses_high.putf( answer_properties, $kw30$ANSWER_LANGUAGE, $kw31$HL );
    }
    else
    {
      answer_properties = conses_high.putf( answer_properties, $kw30$ANSWER_LANGUAGE, $kw32$EL );
    }
    answer_properties = conses_high.putf( answer_properties, $kw18$BINDINGS, v_bindings );
    return answer_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 23159L)
  public static SubLObject distribute_answer_properties_over_proof_properties_list(final SubLObject answer_properties, final SubLObject proof_properties_list)
  {
    SubLObject new_proof_properties_list = NIL;
    SubLObject cdolist_list_var = proof_properties_list;
    SubLObject proof_properties = NIL;
    proof_properties = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      proof_properties = conses_high.copy_list( proof_properties );
      SubLObject cdolist_list_var_$3 = $proof_query_properties_to_override$.getGlobalValue();
      SubLObject property = NIL;
      property = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        final SubLObject overriding_value = conses_high.getf( answer_properties, property, UNPROVIDED );
        proof_properties = conses_high.putf( proof_properties, property, overriding_value );
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        property = cdolist_list_var_$3.first();
      }
      new_proof_properties_list = ConsesLow.cons( proof_properties, new_proof_properties_list );
      cdolist_list_var = cdolist_list_var.rest();
      proof_properties = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_proof_properties_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 23741L)
  public static SubLObject compute_proof_query_properties_list(final SubLObject inference_answer, final SubLObject inference)
  {
    SubLObject proof_properties_list = NIL;
    SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( inference_answer );
    SubLObject justification = NIL;
    justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$4 = inference_datastructures_inference.inference_answer_justification_proofs( justification );
      SubLObject proof = NIL;
      proof = cdolist_list_var_$4.first();
      while ( NIL != cdolist_list_var_$4)
      {
        final SubLObject proof_properties = proof_query_properties( proof, prepare_proof_query_properties(), inference );
        proof_properties_list = ConsesLow.cons( proof_properties, proof_properties_list );
        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
        proof = cdolist_list_var_$4.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      justification = cdolist_list_var.first();
    }
    return proof_properties_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 24411L)
  public static SubLObject proof_query_properties(final SubLObject proof, SubLObject v_properties, final SubLObject inference)
  {
    final SubLObject v_hl_supports = list_utilities.tree_gather( inference_datastructures_proof.proof_supports( proof ), Symbols.symbol_function( $sym34$HL_SUPPORT_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject link = inference_datastructures_proof.proof_link( proof );
    SubLObject tactic = NIL;
    SubLObject problem = NIL;
    SubLObject hl_module = NIL;
    SubLObject module_name = NIL;
    if( NIL != inference_worker.content_link_p( link ) )
    {
      tactic = inference_worker.content_link_tactic( link );
    }
    else if( NIL != inference_worker.connected_conjunction_link_p( link ) )
    {
      tactic = inference_worker.connected_conjunction_link_tactic( link );
    }
    problem = ( NIL != tactic ) ? inference_datastructures_tactic.tactic_problem( tactic ) : NIL;
    hl_module = ( NIL != tactic ) ? inference_datastructures_tactic.tactic_hl_module( tactic ) : NIL;
    module_name = ( NIL != hl_module ) ? inference_modules.hl_module_name( hl_module ) : NIL;
    if( NIL != problem )
    {
      final SubLObject max_problem_id = conses_high.getf( v_properties, $kw19$MAX_PROBLEM_COUNT, UNPROVIDED );
      final SubLObject problem_id = Numbers.add( TWO_INTEGER, inference_datastructures_problem.problem_suid( problem ) );
      if( problem_id.numG( max_problem_id ) )
      {
        v_properties = conses_high.putf( v_properties, $kw19$MAX_PROBLEM_COUNT, problem_id );
      }
    }
    if( NIL != tactic )
    {
      final SubLObject max_productivity_limit = conses_high.getf( v_properties, $kw35$PRODUCTIVITY_LIMIT, UNPROVIDED );
      final SubLObject tactic_productivity = inference_datastructures_tactic.tactic_original_productivity( tactic );
      if( NIL != list_utilities.safe_G( tactic_productivity, max_productivity_limit ) )
      {
        v_properties = conses_high.putf( v_properties, $kw35$PRODUCTIVITY_LIMIT, tactic_productivity );
      }
      if( NIL != problem && NIL != hl_module && NIL != inference_worker_transformation.transformation_tactic_p( tactic ) )
      {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( problem );
        SubLObject trans_tactic = NIL;
        trans_tactic = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match( trans_tactic, hl_module ) && NIL != inference_worker_transformation.transformation_tactic_p( trans_tactic )
              && NIL == inference_worker_transformation.transformation_rule_tactic_p( trans_tactic ) )
          {
            final SubLObject max_productivity_limit2 = conses_high.getf( v_properties, $kw35$PRODUCTIVITY_LIMIT, UNPROVIDED );
            final SubLObject tactic_productivity2 = inference_datastructures_tactic.tactic_original_productivity( trans_tactic );
            if( tactic_productivity2.numG( max_productivity_limit2 ) )
            {
              v_properties = conses_high.putf( v_properties, $kw35$PRODUCTIVITY_LIMIT, tactic_productivity2 );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          trans_tactic = cdolist_list_var.first();
        }
      }
    }
    final SubLObject transformation_linkP = inference_worker_transformation.transformation_link_p( link );
    if( NIL != transformation_linkP || NIL != inference_worker_residual_transformation.residual_transformation_link_p( link ) )
    {
      v_properties = conses_high.putf( v_properties, $kw36$MAX_TRANSFORMATION_DEPTH, Numbers.add( inference_worker.transformation_depth_increment( link, inference ), conses_high.getf( v_properties,
          $kw36$MAX_TRANSFORMATION_DEPTH, UNPROVIDED ) ) );
      v_properties = conses_high.putf( v_properties, $kw37$TRANSFORMATION_ALLOWED_, T );
    }
    if( NIL != transformation_linkP && NIL != problem && NIL != inference_tactician_strategic_uninterestingness.problem_uses_hl_predicateP( problem ) )
    {
      v_properties = conses_high.putf( v_properties, $kw38$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, T );
    }
    if( NIL != inference_worker_rewrite.rewrite_link_p( link ) )
    {
      v_properties = conses_high.putf( v_properties, $kw39$REWRITE_ALLOWED_, T );
    }
    if( NIL != hl_module )
    {
      if( NIL != removal_modules_abduction.abductive_removal_moduleP( module_name ) )
      {
        v_properties = conses_high.putf( v_properties, $kw40$ABDUCTION_ALLOWED_, T );
      }
      if( NIL != transformation_modules.module_requires_unbound_predicate_transformationP( module_name ) )
      {
        v_properties = conses_high.putf( v_properties, $kw41$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, T );
      }
      if( NIL != transformation_modules.module_requires_hl_predicate_transformationP( module_name ) && ( $kw42$TRANS_ISA_POS != module_name || NIL == inference_tactician_strategic_uninterestingness
          .problem_uses_hl_predicateP( problem ) || NIL == inference_tactician_strategic_uninterestingness.collection_backchain_encouraged_problemP( problem ) ) )
      {
        v_properties = conses_high.putf( v_properties, $kw43$ALLOW_HL_PREDICATE_TRANSFORMATION_, T );
      }
      if( NIL != removal_modules_abduction.abductive_removal_moduleP( module_name ) )
      {
        v_properties = conses_high.putf( v_properties, $kw40$ABDUCTION_ALLOWED_, T );
      }
      if( $kw44$REMOVAL_TVA_UNIFY_CLOSURE == module_name )
      {
        v_properties = conses_high.putf( v_properties, $kw45$TRANSITIVE_CLOSURE_MODE, inference_datastructures_inference.inference_transitive_closure_mode( inference ) );
      }
      if( NIL != removal_module_utilities.module_requires_evaluate_sublP( module_name ) )
      {
        v_properties = conses_high.putf( v_properties, $kw46$EVALUATE_SUBL_ALLOWED_, T );
      }
      if( NIL != removal_module_utilities.module_requires_new_terms_allowedP( module_name ) )
      {
        v_properties = conses_high.putf( v_properties, $kw47$NEW_TERMS_ALLOWED_, T );
      }
      SubLObject cdolist_list_var = v_hl_supports;
      SubLObject hl_support = NIL;
      hl_support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject hl_support_module = arguments.hl_support_module( hl_support );
        if( hl_support_module == $kw48$MINIMIZE && NIL != removal_module_utilities.module_requires_negation_by_failureP( module_name ) )
        {
          v_properties = conses_high.putf( v_properties, $kw49$NEGATION_BY_FAILURE_, T );
        }
        if( hl_support_module == $kw50$ABNORMAL )
        {
          v_properties = conses_high.putf( v_properties, $kw51$ALLOW_ABNORMALITY_CHECKING_, T );
        }
        if( NIL != removal_module_utilities.module_requires_completeness_minimization_for_supportP( module_name, hl_support_module ) )
        {
          v_properties = conses_high.putf( v_properties, $kw52$COMPLETENESS_MINIMIZATION_ALLOWED_, T );
        }
        cdolist_list_var = cdolist_list_var.rest();
        hl_support = cdolist_list_var.first();
      }
    }
    final SubLObject proof_depth = proof_view.inference_proof_get_depth_memoized( proof );
    if( proof_depth.numG( conses_high.getf( v_properties, $kw53$MAX_PROOF_DEPTH, UNPROVIDED ) ) )
    {
      v_properties = conses_high.putf( v_properties, $kw53$MAX_PROOF_DEPTH, proof_depth );
    }
    SubLObject cdolist_list_var2 = inference_datastructures_proof.proof_direct_subproofs( proof );
    SubLObject subproof = NIL;
    subproof = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      v_properties = proof_query_properties( subproof, v_properties, inference );
      cdolist_list_var2 = cdolist_list_var2.rest();
      subproof = cdolist_list_var2.first();
    }
    return v_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 30155L)
  public static SubLObject prepare_proof_query_properties()
  {
    SubLObject proof_properties = NIL;
    SubLObject cdolist_list_var = numeric_query_properties();
    SubLObject numeric_property = NIL;
    numeric_property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      proof_properties = conses_high.putf( proof_properties, numeric_property, ZERO_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      numeric_property = cdolist_list_var.first();
    }
    proof_properties = conses_high.putf( proof_properties, $kw22$PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER );
    cdolist_list_var = query_properties_efficiency_hierarchy();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject property = NIL;
      SubLObject hierarchy = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
      property = current.first();
      current = ( hierarchy = current.rest() );
      proof_properties = conses_high.putf( proof_properties, property, hierarchy.first() );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return proof_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 30638L)
  public static SubLObject get_most_efficient_query_properties(final SubLObject properties1, final SubLObject properties2)
  {
    SubLObject p1 = NIL;
    SubLObject p2 = NIL;
    if( Sequences.length( properties2 ).numG( Sequences.length( properties1 ) ) )
    {
      p1 = properties2;
      p2 = properties1;
    }
    else
    {
      p1 = properties1;
      p2 = properties2;
    }
    if( NIL == p2 )
    {
      return p1;
    }
    if( NIL != query_properties_more_efficientP( p1, p2 ) )
    {
      return p1;
    }
    return p2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 30981L)
  public static SubLObject get_least_efficient_query_properties(final SubLObject properties1, final SubLObject properties2)
  {
    SubLObject p1 = NIL;
    SubLObject p2 = NIL;
    if( Sequences.length( properties2 ).numG( Sequences.length( properties1 ) ) )
    {
      p1 = properties2;
      p2 = properties1;
    }
    else
    {
      p1 = properties1;
      p2 = properties2;
    }
    if( NIL == p2 )
    {
      return p1;
    }
    if( NIL != query_properties_more_efficientP( p1, p2 ) )
    {
      return p2;
    }
    return p1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 31325L)
  public static SubLObject query_properties_more_efficientP(final SubLObject p1, final SubLObject p2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject count1 = get_query_properties_efficiency_count( p1, p2 );
    final SubLObject count2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Numbers.numG( count1, count2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 31564L)
  public static SubLObject query_properties_less_efficientP(final SubLObject p1, final SubLObject p2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject count1 = get_query_properties_efficiency_count( p1, p2 );
    final SubLObject count2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Numbers.numL( count1, count2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 31803L)
  public static SubLObject get_query_properties_efficiency_count(final SubLObject p1, final SubLObject p2)
  {
    SubLObject count1 = ZERO_INTEGER;
    SubLObject count2 = ZERO_INTEGER;
    SubLObject remainder;
    SubLObject property;
    SubLObject value1;
    SubLObject value2;
    for( remainder = NIL, remainder = p1; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value1 = conses_high.cadr( remainder );
      value2 = conses_high.getf( p2, property, UNPROVIDED );
      if( !value1.eql( value2 ) )
      {
        if( NIL != query_property_value_more_efficientP( property, value1, value2 ) )
        {
          count1 = Numbers.add( count1, ONE_INTEGER );
        }
        else
        {
          count2 = Numbers.add( count2, ONE_INTEGER );
        }
      }
    }
    return Values.values( count1, count2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 32159L)
  public static SubLObject most_efficient_query_properties(final SubLObject query_properties_list)
  {
    return list_utilities.extremal( query_properties_list, $sym55$QUERY_PROPERTIES_MORE_EFFICIENT_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 32310L)
  public static SubLObject most_complete_query_properties(final SubLObject query_properties_list)
  {
    return list_utilities.extremal( query_properties_list, $sym56$QUERY_PROPERTIES_LESS_EFFICIENT_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 32460L)
  public static SubLObject least_efficient_query_properties(final SubLObject query_properties_list)
  {
    return most_complete_query_properties( query_properties_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 32600L)
  public static SubLObject least_complete_query_properties(final SubLObject query_properties_list)
  {
    return most_efficient_query_properties( query_properties_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 37049L)
  public static SubLObject query_properties_for_inference_mode(final SubLObject inference_mode)
  {
    assert NIL != inference_datastructures_enumerated_types.inference_mode_p( inference_mode ) : inference_mode;
    return list_utilities.alist_lookup_without_values( $inference_mode_query_properties_table$.getGlobalValue(), inference_mode, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 37259L)
  public static SubLObject query_property_for_inference_mode(final SubLObject inference_mode, final SubLObject query_property, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    return conses_high.getf( query_properties_for_inference_mode( inference_mode ), query_property, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 37451L)
  public static SubLObject min_rule_utility_for_inference_mode(final SubLObject inference_mode)
  {
    return query_property_for_inference_mode( inference_mode, $kw59$MIN_RULE_UTILITY, UNPROVIDED );
  }

  public static SubLObject declare_inference_parameters_file()
  {
    SubLFiles.declareFunction( me, "explicify_inference_engine_query_property_defaults", "EXPLICIFY-INFERENCE-ENGINE-QUERY-PROPERTY-DEFAULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "explicify_query_tool_query_property_defaults", "EXPLICIFY-QUERY-TOOL-QUERY-PROPERTY-DEFAULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_inference_engine_query_property_defaults", "REMOVE-INFERENCE-ENGINE-QUERY-PROPERTY-DEFAULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_merge_query_properties", "INFERENCE-MERGE-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "union_plist_properties", "UNION-PLIST-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_conservatively_select_property_value_for_merge", "INFERENCE-CONSERVATIVELY-SELECT-PROPERTY-VALUE-FOR-MERGE", 3, 0, false );
    SubLFiles.declareFunction( me, "gather_inference_answer_query_propertyP", "GATHER-INFERENCE-ANSWER-QUERY-PROPERTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_inference_answer_query_properties", "GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "boolean_query_property_to_include_on_mergeP", "BOOLEAN-QUERY-PROPERTY-TO-INCLUDE-ON-MERGE?", 1, 0, false );
    SubLFiles.declareFunction( me, "query_property_in_efficiency_hierarchyP", "QUERY-PROPERTY-IN-EFFICIENCY-HIERARCHY?", 1, 0, false );
    SubLFiles.declareFunction( me, "query_properties_efficiency_hierarchy", "QUERY-PROPERTIES-EFFICIENCY-HIERARCHY", 0, 0, false );
    SubLFiles.declareFunction( me, "numeric_query_properties", "NUMERIC-QUERY-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "numeric_query_property_p", "NUMERIC-QUERY-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "numeric_query_property_max", "NUMERIC-QUERY-PROPERTY-MAX", 1, 0, false );
    SubLFiles.declareFunction( me, "query_property_value_more_efficientP", "QUERY-PROPERTY-VALUE-MORE-EFFICIENT?", 3, 0, false );
    SubLFiles.declareFunction( me, "query_property_value_more_completeP", "QUERY-PROPERTY-VALUE-MORE-COMPLETE?", 3, 0, false );
    SubLFiles.declareFunction( me, "query_property_value_at_least_as_efficientP", "QUERY-PROPERTY-VALUE-AT-LEAST-AS-EFFICIENT?", 3, 0, false );
    SubLFiles.declareFunction( me, "query_property_value_at_least_as_completeP", "QUERY-PROPERTY-VALUE-AT-LEAST-AS-COMPLETE?", 3, 0, false );
    SubLFiles.declareFunction( me, "most_efficient_value_for_query_property", "MOST-EFFICIENT-VALUE-FOR-QUERY-PROPERTY", 1, 0, false );
    SubLFiles.declareFunction( me, "most_efficient_value_for_query_propertyP", "MOST-EFFICIENT-VALUE-FOR-QUERY-PROPERTY?", 2, 0, false );
    SubLFiles.declareFunction( me, "most_complete_value_for_query_property", "MOST-COMPLETE-VALUE-FOR-QUERY-PROPERTY", 1, 0, false );
    SubLFiles.declareFunction( me, "most_complete_value_for_query_propertyP", "MOST-COMPLETE-VALUE-FOR-QUERY-PROPERTY?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_allows_reuse_wrt_query_propertiesP", "PROBLEM-STORE-ALLOWS-REUSE-WRT-QUERY-PROPERTIES?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_allows_reuse_wrt_query_property", "PROBLEM-STORE-ALLOWS-REUSE-WRT-QUERY-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_compute_all_answers_query_properties", "INFERENCE-COMPUTE-ALL-ANSWERS-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_compute_some_answer_query_properties", "INFERENCE-COMPUTE-SOME-ANSWER-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_compute_proof_query_properties", "INFERENCE-COMPUTE-PROOF-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_compute_inference_answer_query_properties", "INFERENCE-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_most_complete_query_properties", "COMPUTE-MOST-COMPLETE-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_most_efficient_query_properties", "COMPUTE-MOST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_extremal_query_properties_int", "COMPUTE-EXTREMAL-QUERY-PROPERTIES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_compute_inference_answer_query_properties_int", "INFERENCE-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_compute_inference_answer_query_properties", "INFERENCE-ANSWER-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_compute_inference_answer_query_properties_int", "INFERENCE-ANSWER-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "distribute_answer_properties_over_proof_properties_list", "DISTRIBUTE-ANSWER-PROPERTIES-OVER-PROOF-PROPERTIES-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_proof_query_properties_list", "COMPUTE-PROOF-QUERY-PROPERTIES-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_query_properties", "PROOF-QUERY-PROPERTIES", 3, 0, false );
    SubLFiles.declareFunction( me, "prepare_proof_query_properties", "PREPARE-PROOF-QUERY-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_most_efficient_query_properties", "GET-MOST-EFFICIENT-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_least_efficient_query_properties", "GET-LEAST-EFFICIENT-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "query_properties_more_efficientP", "QUERY-PROPERTIES-MORE-EFFICIENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "query_properties_less_efficientP", "QUERY-PROPERTIES-LESS-EFFICIENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_query_properties_efficiency_count", "GET-QUERY-PROPERTIES-EFFICIENCY-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "most_efficient_query_properties", "MOST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "most_complete_query_properties", "MOST-COMPLETE-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "least_efficient_query_properties", "LEAST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "least_complete_query_properties", "LEAST-COMPLETE-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "query_properties_for_inference_mode", "QUERY-PROPERTIES-FOR-INFERENCE-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "query_property_for_inference_mode", "QUERY-PROPERTY-FOR-INFERENCE-MODE", 2, 1, false );
    SubLFiles.declareFunction( me, "min_rule_utility_for_inference_mode", "MIN-RULE-UTILITY-FOR-INFERENCE-MODE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_parameters_file()
  {
    $gather_inference_answer_query_properties$ = SubLFiles.deflexical( "*GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES*", $list6 );
    $boolean_query_properties_to_include_on_merge$ = SubLFiles.deflexical( "*BOOLEAN-QUERY-PROPERTIES-TO-INCLUDE-ON-MERGE*", $list7 );
    $query_properties_efficiency_hierarchy$ = SubLFiles.deflexical( "*QUERY-PROPERTIES-EFFICIENCY-HIERARCHY*", $list8 );
    $numeric_query_properties$ = SubLFiles.deflexical( "*NUMERIC-QUERY-PROPERTIES*", $list10 );
    $numeric_query_properties_that_max_out_at_positive_infinity$ = SubLFiles.deflexical( "*NUMERIC-QUERY-PROPERTIES-THAT-MAX-OUT-AT-POSITIVE-INFINITY*", $list11 );
    $proof_query_properties_to_override$ = SubLFiles.deflexical( "*PROOF-QUERY-PROPERTIES-TO-OVERRIDE*", $list33 );
    $inference_mode_query_properties_table$ = SubLFiles.deflexical( "*INFERENCE-MODE-QUERY-PROPERTIES-TABLE*", $list57 );
    return NIL;
  }

  public static SubLObject setup_inference_parameters_file()
  {
    generic_testing.define_test_case_table_int( $sym60$INFERENCE_MERGE_QUERY_PROPERTIES, ConsesLow.list( new SubLObject[] { $kw61$TEST, Symbols.symbol_function( EQUAL ), $kw62$OWNER, NIL, $kw63$CLASSES, NIL, $kw64$KB,
      $kw65$TINY, $kw66$WORKING_, T
    } ), $list67 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_parameters_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_parameters_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_parameters_file();
  }
  static
  {
    me = new inference_parameters();
    $gather_inference_answer_query_properties$ = null;
    $boolean_query_properties_to_include_on_merge$ = null;
    $query_properties_efficiency_hierarchy$ = null;
    $numeric_query_properties$ = null;
    $numeric_query_properties_that_max_out_at_positive_infinity$ = null;
    $proof_query_properties_to_override$ = null;
    $inference_mode_query_properties_table$ = null;
    $kw0$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $kw1$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $const2$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym3$QUERY_PROPERTIES_P = makeSymbol( "QUERY-PROPERTIES-P" );
    $kw4$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $kw5$CUSTOM = makeKeyword( "CUSTOM" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "BINDINGS" ), makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeKeyword( "MAX-PROBLEM-COUNT" ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), makeKeyword(
        "NEGATION-BY-FAILURE?" ), makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" ), makeKeyword( "EVALUATE-SUBL-ALLOWED?" ), makeKeyword( "REWRITE-ALLOWED?" ), makeKeyword( "ABDUCTION-ALLOWED?" ), makeKeyword(
            "NEW-TERMS-ALLOWED?" ), makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ),
      makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" ), makeKeyword( "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "MAX-PROOF-DEPTH" ), makeKeyword( "MAX-TRANSFORMATION-DEPTH" ),
      makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ), makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "MAX-NUMBER" ), makeKeyword( "MAX-TIME" ), makeKeyword( "MAX-STEP" ), makeKeyword(
          "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), makeKeyword( "PRODUCTIVITY-LIMIT" )
    } );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "ABDUCTION-ALLOWED?" ), makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" ), makeKeyword(
        "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ),
      makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" ), makeKeyword( "EVALUATE-SUBL-ALLOWED?" ), makeKeyword( "NEGATION-BY-FAILURE?" ), makeKeyword( "NEW-TERMS-ALLOWED?" ), makeKeyword( "REWRITE-ALLOWED?" ),
      makeKeyword( "TRANSFORMATION-ALLOWED?" )
    } );
    $list8 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "ABDUCTION-ALLOWED?" ), NIL, T ), ConsesLow.list( makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), NIL, T ), ConsesLow.list(
        makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" ), NIL, T ), ConsesLow.list( makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), NIL, T ), ConsesLow.list( makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ),
            NIL, T ), ConsesLow.list( makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), T, NIL ), ConsesLow.list( makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), NIL, T ), ConsesLow.list( makeKeyword(
                "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "EL" ) ), ConsesLow.list( makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" ), T, NIL ), ConsesLow.list( makeKeyword( "EVALUATE-SUBL-ALLOWED?" ),
                    NIL, T ), ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword( "MINIMAL" ), makeKeyword( "SHALLOW" ), makeKeyword( "EXTENDED" ), makeKeyword( "MAXIMAL" ), makeKeyword( "CUSTOM" ) ), ConsesLow
                        .list( makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeKeyword( "NONE" ), makeKeyword( "MINIMAL" ), makeKeyword( "ARG-TYPE" ), makeKeyword( "ALL" ) ), ConsesLow.list( makeKeyword(
                            "NEGATION-BY-FAILURE?" ), T, NIL ), ConsesLow.list( makeKeyword( "NEW-TERMS-ALLOWED?" ), NIL, T ), ConsesLow.list( makeKeyword( "REWRITE-ALLOWED?" ), NIL, T ), ConsesLow.list( makeKeyword(
                                "TRANSFORMATION-ALLOWED?" ), NIL, T ), ConsesLow.list( makeKeyword( "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "NONE" ), makeKeyword( "FOCUSED" ), makeKeyword( "ALL" ) )
    } );
    $sym9$CAR = makeSymbol( "CAR" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "MAX-PROBLEM-COUNT" ), makeKeyword( "MAX-PROOF-DEPTH" ), makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ), makeKeyword(
        "MAX-NUMBER" ), makeKeyword( "MAX-TIME" ), makeKeyword( "MAX-STEP" ), makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), makeKeyword( "PRODUCTIVITY-LIMIT" )
    } );
    $list11 = ConsesLow.list( makeKeyword( "MAX-PROBLEM-COUNT" ), makeKeyword( "PRODUCTIVITY-LIMIT" ), makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ) );
    $str12$Invalid_value_for_the_properties_ = makeString( "Invalid value for the properties ~a : ~a" );
    $str13$unexpected_property__s = makeString( "unexpected property ~s" );
    $sym14$PROBLEM_STORE_P = makeSymbol( "PROBLEM-STORE-P" );
    $kw15$UNDETERMINED = makeKeyword( "UNDETERMINED" );
    $list16 = ConsesLow.list( makeKeyword( "MAX-TIME" ), ZERO_INTEGER );
    $list17 = ConsesLow.cons( makeSymbol( "FIRST" ), makeSymbol( "REST" ) );
    $kw18$BINDINGS = makeKeyword( "BINDINGS" );
    $kw19$MAX_PROBLEM_COUNT = makeKeyword( "MAX-PROBLEM-COUNT" );
    $kw20$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw21$MAX_STEP = makeKeyword( "MAX-STEP" );
    $kw22$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $float23$1_0 = makeDouble( 1.0 );
    $kw24$SKIP = makeKeyword( "SKIP" );
    $kw25$ILL_FORMED = makeKeyword( "ILL-FORMED" );
    $kw26$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $kw27$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $float28$1_1 = makeDouble( 1.1 );
    $kw29$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw30$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw31$HL = makeKeyword( "HL" );
    $kw32$EL = makeKeyword( "EL" );
    $list33 = ConsesLow.list( makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeKeyword( "MAX-TIME" ), makeKeyword( "MAX-STEP" ), makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ), makeKeyword(
        "ALLOW-INDETERMINATE-RESULTS?" ), makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "BINDINGS" ) );
    $sym34$HL_SUPPORT_P = makeSymbol( "HL-SUPPORT-P" );
    $kw35$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $kw36$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw37$TRANSFORMATION_ALLOWED_ = makeKeyword( "TRANSFORMATION-ALLOWED?" );
    $kw38$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" );
    $kw39$REWRITE_ALLOWED_ = makeKeyword( "REWRITE-ALLOWED?" );
    $kw40$ABDUCTION_ALLOWED_ = makeKeyword( "ABDUCTION-ALLOWED?" );
    $kw41$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" );
    $kw42$TRANS_ISA_POS = makeKeyword( "TRANS-ISA-POS" );
    $kw43$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" );
    $kw44$REMOVAL_TVA_UNIFY_CLOSURE = makeKeyword( "REMOVAL-TVA-UNIFY-CLOSURE" );
    $kw45$TRANSITIVE_CLOSURE_MODE = makeKeyword( "TRANSITIVE-CLOSURE-MODE" );
    $kw46$EVALUATE_SUBL_ALLOWED_ = makeKeyword( "EVALUATE-SUBL-ALLOWED?" );
    $kw47$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw48$MINIMIZE = makeKeyword( "MINIMIZE" );
    $kw49$NEGATION_BY_FAILURE_ = makeKeyword( "NEGATION-BY-FAILURE?" );
    $kw50$ABNORMAL = makeKeyword( "ABNORMAL" );
    $kw51$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" );
    $kw52$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" );
    $kw53$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $list54 = ConsesLow.cons( makeSymbol( "PROPERTY" ), makeSymbol( "HIERARCHY" ) );
    $sym55$QUERY_PROPERTIES_MORE_EFFICIENT_ = makeSymbol( "QUERY-PROPERTIES-MORE-EFFICIENT?" );
    $sym56$QUERY_PROPERTIES_LESS_EFFICIENT_ = makeSymbol( "QUERY-PROPERTIES-LESS-EFFICIENT?" );
    $list57 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeKeyword( "MINIMAL" ), makeKeyword( "NEW-TERMS-ALLOWED?" ), NIL, makeKeyword( "MAX-PROOF-DEPTH" ), FIFTEEN_INTEGER, makeKeyword(
        "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), ZERO_INTEGER, makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), T, makeKeyword( "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "NONE" ), makeKeyword(
            "MAX-PROBLEM-COUNT" ), makeInteger( 100000 ), makeKeyword( "PRODUCTIVITY-LIMIT" ), makeInteger( 20000000 ), makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword(
                "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword( "MIN-RULE-UTILITY" ),
      makeInteger( -100 ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), NIL
    } ), ConsesLow.list( new SubLObject[] { makeKeyword( "SHALLOW" ), makeKeyword( "NEW-TERMS-ALLOWED?" ), NIL, makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ),
      ZERO_INTEGER, makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), T, makeKeyword( "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "NONE" ), makeKeyword( "MAX-PROBLEM-COUNT" ), makeInteger( 100000 ), makeKeyword(
          "PRODUCTIVITY-LIMIT" ), makeInteger( 20000000 ), makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword(
              "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER, makeKeyword( "MIN-RULE-UTILITY" ), makeInteger( -100 ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), T
    } ), ConsesLow.list( new SubLObject[] { makeKeyword( "EXTENDED" ), makeKeyword( "NEW-TERMS-ALLOWED?" ), T, makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ),
      ZERO_INTEGER, makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), T, makeKeyword( "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "NONE" ), makeKeyword( "MAX-PROBLEM-COUNT" ), makeInteger( 100000 ), makeKeyword(
          "PRODUCTIVITY-LIMIT" ), makeInteger( 20000000 ), makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), T, makeKeyword(
              "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), TWO_INTEGER, makeKeyword( "MIN-RULE-UTILITY" ), makeInteger( -100 ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), T
    } ), ConsesLow.list( new SubLObject[] { makeKeyword( "MAXIMAL" ), makeKeyword( "NEW-TERMS-ALLOWED?" ), T, makeKeyword( "MAX-PROOF-DEPTH" ), NIL, makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), makeKeyword(
        "POSITIVE-INFINITY" ), makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), T, makeKeyword( "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "ALL" ), makeKeyword( "MAX-PROBLEM-COUNT" ), makeKeyword(
            "POSITIVE-INFINITY" ), makeKeyword( "PRODUCTIVITY-LIMIT" ), makeKeyword( "POSITIVE-INFINITY" ), makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), T, makeKeyword(
                "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), T, makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), T, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), NIL, makeKeyword( "MIN-RULE-UTILITY" ), makeInteger(
                    -100 ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), T
    } ) );
    $sym58$INFERENCE_MODE_P = makeSymbol( "INFERENCE-MODE-P" );
    $kw59$MIN_RULE_UTILITY = makeKeyword( "MIN-RULE-UTILITY" );
    $sym60$INFERENCE_MERGE_QUERY_PROPERTIES = makeSymbol( "INFERENCE-MERGE-QUERY-PROPERTIES" );
    $kw61$TEST = makeKeyword( "TEST" );
    $kw62$OWNER = makeKeyword( "OWNER" );
    $kw63$CLASSES = makeKeyword( "CLASSES" );
    $kw64$KB = makeKeyword( "KB" );
    $kw65$TINY = makeKeyword( "TINY" );
    $kw66$WORKING_ = makeKeyword( "WORKING?" );
    $list67 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "MAX-TIME" ), TEN_INTEGER ), ConsesLow.list( makeKeyword( "MAX-TIME" ), TWENTY_INTEGER ) ), ConsesLow.list(
        makeKeyword( "MAX-TIME" ), TWENTY_INTEGER ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "MAX-TIME" ), TWENTY_INTEGER ), ConsesLow.list( makeKeyword( "MAX-TIME" ), TEN_INTEGER ) ), ConsesLow
            .list( makeKeyword( "MAX-TIME" ), TWENTY_INTEGER ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "MAX-TIME" ), TEN_INTEGER ), NIL ), ConsesLow.list( makeKeyword( "MAX-TIME" ), NIL ) ),
      ConsesLow.list( ConsesLow.list( NIL, ConsesLow.list( makeKeyword( "MAX-TIME" ), TEN_INTEGER ) ), ConsesLow.list( makeKeyword( "MAX-TIME" ), NIL ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword(
          "MAX-STEP" ), TEN_INTEGER ), ConsesLow.list( makeKeyword( "MAX-STEP" ), TWENTY_INTEGER ) ), ConsesLow.list( makeKeyword( "MAX-STEP" ), TWENTY_INTEGER ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
              makeKeyword( "MAX-STEP" ), TWENTY_INTEGER ), ConsesLow.list( makeKeyword( "MAX-STEP" ), TEN_INTEGER ) ), ConsesLow.list( makeKeyword( "MAX-STEP" ), TWENTY_INTEGER ) ), ConsesLow.list( ConsesLow.list(
                  ConsesLow.list( makeKeyword( "MAX-STEP" ), TEN_INTEGER ), NIL ), ConsesLow.list( makeKeyword( "MAX-STEP" ), NIL ) ), ConsesLow.list( ConsesLow.list( NIL, ConsesLow.list( makeKeyword( "MAX-STEP" ),
                      TEN_INTEGER ) ), ConsesLow.list( makeKeyword( "MAX-STEP" ), NIL ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), T ), ConsesLow.list( makeKeyword(
                          "ALLOW-INDETERMINATE-RESULTS?" ), NIL ) ), ConsesLow.list( makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), T ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword(
                              "ALLOW-INDETERMINATE-RESULTS?" ), NIL ), ConsesLow.list( makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), T ) ), ConsesLow.list( makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), T ) ), ConsesLow
                                  .list( ConsesLow.list( ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword( "MINIMAL" ) ), ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword( "SHALLOW" ) ) ),
                                      ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword( "SHALLOW" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword(
                                          "SHALLOW" ) ), ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword( "MINIMAL" ) ) ), ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword( "SHALLOW" ) ) ),
      ConsesLow.list( ConsesLow.list( NIL, ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword( "SHALLOW" ) ) ), ConsesLow.list( new SubLObject[]
      { makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword(
          "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "NONE" ), makeKeyword( "MAX-PROBLEM-COUNT" ), makeInteger( 100000 ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), T, makeKeyword(
              "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), T, makeKeyword( "NEW-TERMS-ALLOWED?" ), T, makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), ZERO_INTEGER, makeKeyword( "MAX-PROOF-DEPTH" ), NIL,
        makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER, makeKeyword( "MIN-RULE-UTILITY" ), makeInteger( -100 ), makeKeyword( "INFERENCE-MODE" ), makeKeyword( "CUSTOM" ), makeKeyword( "PRODUCTIVITY-LIMIT" ),
        makeInteger( 20000000 )
      } ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "NEW-TERMS-ALLOWED?" ), T, makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), T, makeKeyword( "MAX-TIME" ), makeInteger( 60 ) ), ConsesLow.list(
          makeKeyword( "INFERENCE-MODE" ), makeKeyword( "SHALLOW" ) ) ), ConsesLow.list( new SubLObject[]
          { makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword( "ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), NIL, makeKeyword(
              "ALLOW-INDETERMINATE-RESULTS?" ), T, makeKeyword( "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "NONE" ), makeKeyword( "MAX-PROBLEM-COUNT" ), makeInteger( 100000 ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), T,
            makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), T, makeKeyword( "NEW-TERMS-ALLOWED?" ), T, makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ), ZERO_INTEGER, makeKeyword( "MAX-PROOF-DEPTH" ),
            NIL, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER, makeKeyword( "MIN-RULE-UTILITY" ), makeInteger( -100 ), makeKeyword( "MAX-TIME" ), NIL, makeKeyword( "INFERENCE-MODE" ), makeKeyword( "CUSTOM" ),
            makeKeyword( "PRODUCTIVITY-LIMIT" ), makeInteger( 20000000 )
      } ) )
    } );
  }
}
/*
 * 
 * Total time: 388 ms
 * 
 */