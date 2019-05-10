package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_quantifier_processing_3
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3";
  public static final String myFingerPrint = "410c82132cef4210bd70838111218d5cebeab55a242850df64771b72578df90a";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 5210L)
  private static SubLSymbol $subcollection_function_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 8498L)
  private static SubLSymbol $gen_quant_relations_from$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 8856L)
  private static SubLSymbol $gen_quant_relations_to$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 9836L)
  private static SubLSymbol $quantproc_3_microseconds$;
  private static final SubLObject $const0$QuantifierProcessing_3_RLModule;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$IGNORE;
  private static final SubLList $list3;
  private static final SubLObject $const4$NLQuantFn_3;
  private static final SubLList $list5;
  private static final SubLObject $const6$NLDefinitenessFn_3;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLObject $const13$NLGenQuantAttribute;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLObject $const19$GeneralizedQuantifierRelation;
  private static final SubLObject $const20$TypeInstanceTernaryRuleMacroPredi;
  private static final SubLSymbol $kw21$TO_TYPE;
  private static final SubLObject $const22$InstanceTypeTernaryRuleMacroPredi;
  private static final SubLSymbol $kw23$FROM_TYPE;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLInteger $int26$30000;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLObject $const33$is_Underspecified;
  private static final SubLObject $const34$extentCardinality;
  private static final SubLObject $const35$TheSetOf;
  private static final SubLObject $const36$isa;
  private static final SubLString $str37$CardinalityOfFn_1;
  private static final SubLObject $const38$most_GenQuantRelnTo;
  private static final SubLObject $const39$most_GenQuantRelnToType;
  private static final SubLString $str40$3_4;
  private static final SubLObject $const41$few_GenQuantRelnTo;
  private static final SubLObject $const42$few_GenQuantRelnToType;
  private static final SubLString $str43$11_5_1;
  private static final SubLObject $const44$many_GenQuantRelnTo;
  private static final SubLObject $const45$many_GenQuantRelnToType;
  private static final SubLString $str46$2_4;
  private static final SubLObject $const47$several_GenQuantRelnTo;
  private static final SubLObject $const48$several_GenQuantRelnToType;
  private static final SubLString $str49$7_5_1;
  private static final SubLObject $const50$no_GenQuantRelnTo;
  private static final SubLObject $const51$no_GenQuantRelnToFromType;
  private static final SubLString $str52$9_2_5;
  private static final SubLObject $const53$most_GenQuantRelnFrom;
  private static final SubLObject $const54$most_GenQuantRelnFromType;
  private static final SubLString $str55$3_3;
  private static final SubLObject $const56$few_GenQuantRelnFrom;
  private static final SubLObject $const57$few_GenQuantRelnFromType;
  private static final SubLString $str58$11_5_2;
  private static final SubLObject $const59$many_GenQuantRelnFrom;
  private static final SubLObject $const60$many_GenQuantRelnFromType;
  private static final SubLString $str61$2_5;
  private static final SubLObject $const62$several_GenQuantRelnFrom;
  private static final SubLObject $const63$several_GenQuantRelnFromType;
  private static final SubLString $str64$7_5_2;
  private static final SubLObject $const65$no_GenQuantRelnFrom;
  private static final SubLString $str66$9_1_5;
  private static final SubLObject $const67$correspondingGenQuant;
  private static final SubLList $list68;
  private static final SubLObject $const69$Most_NLAttr;
  private static final SubLString $str70$GenQuant_2_1;
  private static final SubLObject $const71$Many_NLAttr;
  private static final SubLString $str72$GenQuant_2_2;
  private static final SubLObject $const73$Few_NLAttr;
  private static final SubLString $str74$GenQuant_2_3;
  private static final SubLObject $const75$Several_NLAttr;
  private static final SubLString $str76$GenQuant_2_4;
  private static final SubLString $str77$GenQuant_3_1;
  private static final SubLString $str78$GenQuant_3_2;
  private static final SubLString $str79$GenQuant_3_3;
  private static final SubLString $str80$GenQuant_3_4;
  private static final SubLObject $const81$Plural_NLAttr;
  private static final SubLString $str82$GenQuant_1;
  private static final SubLObject $const83$RuleMacroPredicate;
  private static final SubLObject $const84$genls;
  private static final SubLObject $const85$Every_NLAttr;
  private static final SubLObject $const86$Some_NLAttr;
  private static final SubLList $list87;
  private static final SubLList $list88;
  private static final SubLList $list89;
  private static final SubLObject $const90$Generic_NLAttr;
  private static final SubLString $str91$BAREFORM_1;
  private static final SubLString $str92$BAREFORM_2;
  private static final SubLString $str93$BAREFORM_3;
  private static final SubLObject $const94$Singular_NLAttr;
  private static final SubLList $list95;
  private static final SubLString $str96$5_1_or_5_2;
  private static final SubLList $list97;
  private static final SubLString $str98$9_1;
  private static final SubLString $str99$9_2;
  private static final SubLObject $const100$disjointWith;
  private static final SubLString $str101$9_5_;
  private static final SubLList $list102;
  private static final SubLObject $const103$thereExists;
  private static final SubLObject $const104$and;
  private static final SubLString $str105$4_2;
  private static final SubLString $str106$6_1;
  private static final SubLList $list107;
  private static final SubLObject $const108$ComparisonWRTPredicate;
  private static final SubLObject $const109$IndividualLevelPredicate;
  private static final SubLObject $const110$forAll;
  private static final SubLObject $const111$implies;
  private static final SubLString $str112$6_4_1;
  private static final SubLObject $const113$ScalarInterval;
  private static final SubLObject $const114$IntegerExtent;
  private static final SubLObject $const115$num_GenQuant;
  private static final SubLString $str116$10_1;
  private static final SubLObject $const117$SubcollectionFunction;
  private static final SubLSymbol $kw118$1;
  private static final SubLObject $const119$Thing;
  private static final SubLObject $const120$CollectionType;
  private static final SubLObject $const121$CycNLParsingConstant;
  private static final SubLList $list122;
  private static final SubLString $str123$8_1_or_8_2;
  private static final SubLList $list124;
  private static final SubLString $str125$8_2_5;
  private static final SubLList $list126;
  private static final SubLString $str127$8_3_1;
  private static final SubLSymbol $sym128$QUANTPROC_3_NL_QUANT_FN_EXPRESSION_ARG_ORDER;
  private static final SubLList $list129;
  private static final SubLSymbol $kw130$SWITCH_FIRST;
  private static final SubLSymbol $kw131$SHIFT_LEFT;
  private static final SubLSymbol $kw132$SHIFT_RIGHT;
  private static final SubLList $list133;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 1676L)
  public static SubLObject quantproc_3_required(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    if( NIL != clauses.clauses_p( expression ) && NIL != list_utilities.singletonP( expression ) && NIL != clause_utilities.pos_atomic_cnf_p( expression.first() ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( expression.first() );
      if( NIL != el_utilities.el_formula_p( asent ) )
      {
        SubLObject matchP = NIL;
        final SubLObject args = cycl_utilities.formula_args( asent, $kw2$IGNORE );
        SubLObject rest;
        SubLObject arg;
        SubLObject pred;
        for( rest = NIL, rest = args; NIL == matchP && NIL != rest; matchP = makeBoolean( NIL != matchP || NIL != quantproc_3_subcol_expressionP( arg, mt ) ), matchP = makeBoolean( NIL != matchP
            || NIL != quantproc_3_nested_subcol_expressionP( arg, mt ) ), matchP = makeBoolean( NIL != matchP || NIL != quantproc_3_cardinality_of_fn_expressionP( arg, mt ) ), rest = rest.rest() )
        {
          arg = rest.first();
          if( NIL != quantproc_3_any_nl_quant_fn_expressionP( arg, mt ) )
          {
            pred = cycl_utilities.atomic_sentence_predicate( asent );
            if( NIL != fort_types_interface.isa_predicateP( pred, mt ) )
            {
              matchP = T;
            }
          }
        }
        matchP = makeBoolean( NIL != matchP || NIL != quantproc_3_gen_quant_reln_from_expressionP( asent, mt ) );
        matchP = makeBoolean( NIL != matchP || NIL != quantproc_3_gen_quant_reln_to_expressionP( asent, mt ) );
        return matchP;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 2987L)
  public static SubLObject quantproc_3_any_nl_quant_fn_expressionP(final SubLObject expression, final SubLObject mt)
  {
    return makeBoolean( NIL != quantproc_3_nl_quant_fn_expressionP( expression, mt, $list3, $const4$NLQuantFn_3 ) || NIL != quantproc_3_nl_quant_fn_expressionP( expression, mt, $list5, $const6$NLDefinitenessFn_3 )
        || NIL != quantproc_3_numerical_quant_fn_expressionP( expression, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 3503L)
  public static SubLObject quantproc_3_nl_quant_fn_expressionP(final SubLObject expression, final SubLObject mt, final SubLObject nl_attr_list, final SubLObject target_nl_quant_fn)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != el_utilities.el_formula_p( expression ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject pcase_var = el_utilities.formula_arity( expression, UNPROVIDED );
        if( pcase_var.eql( TWO_INTEGER ) )
        {
          if( NIL == ans )
          {
            SubLObject csome_list_var;
            SubLObject nl_attr;
            for( csome_list_var = nl_attr_list, nl_attr = NIL, nl_attr = csome_list_var.first(); NIL == ans && NIL != csome_list_var; ans = formula_pattern_match.formula_matches_pattern( expression, ConsesLow.listS(
                target_nl_quant_fn, nl_attr, $list7 ) ), csome_list_var = csome_list_var.rest(), nl_attr = csome_list_var.first() )
            {
            }
          }
        }
        else if( pcase_var.eql( THREE_INTEGER ) && NIL == ans )
        {
          SubLObject csome_list_var;
          SubLObject nl_attr;
          for( csome_list_var = nl_attr_list, nl_attr = NIL, nl_attr = csome_list_var.first(); NIL == ans && NIL != csome_list_var; ans = formula_pattern_match.formula_matches_pattern( expression, ConsesLow.listS(
              target_nl_quant_fn, nl_attr, $list8 ) ), csome_list_var = csome_list_var.rest(), nl_attr = csome_list_var.first() )
          {
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 4436L)
  public static SubLObject quantproc_3_numerical_quant_fn_expressionP(final SubLObject expression, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ans = makeBoolean( NIL != el_utilities.el_formula_p( expression ) && ( NIL != formula_pattern_match.formula_matches_pattern( expression, $list9 ) || NIL != formula_pattern_match.formula_matches_pattern( expression,
          $list10 ) ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 5266L)
  public static SubLObject subcollection_function_naut_sans_mtP(final SubLObject naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return reformulator_module_quantifier_unifier_3.subcollection_function_nautP( naut, $subcollection_function_mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 5400L)
  public static SubLObject quantproc_3_subcol_expressionP(final SubLObject expression, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != el_utilities.el_formula_p( expression ) )
    {
      final SubLObject _prev_bind_0 = $subcollection_function_mt$.currentBinding( thread );
      try
      {
        $subcollection_function_mt$.bind( mt, thread );
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
        final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          ans = makeBoolean( NIL != formula_pattern_match.formula_matches_pattern( expression, $list11 ) || NIL != formula_pattern_match.formula_matches_pattern( expression, $list12 ) );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        $subcollection_function_mt$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 6102L)
  public static SubLObject non_gen_quant_attributeP(final SubLObject obj)
  {
    return makeBoolean( NIL == isa.isaP( obj, $const13$NLGenQuantAttribute, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 6200L)
  public static SubLObject quantproc_3_nested_subcol_expressionP(final SubLObject expression, final SubLObject mt)
  {
    if( NIL != el_utilities.el_formula_p( expression ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( expression, $kw2$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != quantproc_3_nl_quant_fn_expressionP( arg, mt, $list14, $const6$NLDefinitenessFn_3 ) || NIL != quantproc_3_nl_quant_fn_expressionP( arg, mt, $list15, $const4$NLQuantFn_3 ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 6591L)
  public static SubLObject quantproc_3_cardinality_of_fn_expressionP(final SubLObject expression, final SubLObject mt)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( expression ) && NIL != formula_pattern_match.formula_matches_pattern( expression, $list16 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 6796L)
  public static SubLObject quantproc_3_gen_quant_reln_type_arg_position(final SubLObject expression, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == el_utilities.el_ternary_formula_p( expression ) )
    {
      return NIL;
    }
    final SubLObject quant_attr_list = $list17;
    final SubLObject def_attr_list = $list18;
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject gen_quant_reln = el_utilities.unmake_ternary_formula( expression );
    final SubLObject pred = thread.secondMultipleValue();
    final SubLObject first_arg = thread.thirdMultipleValue();
    final SubLObject second_arg = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( NIL == isa.isaP( gen_quant_reln, $const19$GeneralizedQuantifierRelation, mt, UNPROVIDED ) || NIL == fort_types_interface.isa_predicateP( pred, mt ) || !TWO_INTEGER.numE( arity.arity( pred ) ) )
    {
      return NIL;
    }
    if( NIL != isa.isaP( gen_quant_reln, $const20$TypeInstanceTernaryRuleMacroPredi, mt, UNPROVIDED ) && ( NIL != quantproc_3_nl_quant_fn_expressionP( second_arg, mt, quant_attr_list, $const4$NLQuantFn_3 )
        || NIL != quantproc_3_nl_quant_fn_expressionP( second_arg, mt, def_attr_list, $const6$NLDefinitenessFn_3 ) ) )
    {
      result = $kw21$TO_TYPE;
      return result;
    }
    if( NIL != isa.isaP( gen_quant_reln, $const22$InstanceTypeTernaryRuleMacroPredi, mt, UNPROVIDED ) && ( NIL != quantproc_3_nl_quant_fn_expressionP( first_arg, mt, quant_attr_list, $const4$NLQuantFn_3 )
        || NIL != quantproc_3_nl_quant_fn_expressionP( first_arg, mt, def_attr_list, $const6$NLDefinitenessFn_3 ) ) )
    {
      result = $kw23$FROM_TYPE;
      return result;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 8720L)
  public static SubLObject gen_quant_relation_from_p(final SubLObject obj)
  {
    return subl_promotions.memberP( obj, $gen_quant_relations_from$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 9026L)
  public static SubLObject gen_quant_relation_to_p(final SubLObject obj)
  {
    return subl_promotions.memberP( obj, $gen_quant_relations_to$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 9158L)
  public static SubLObject quantproc_3_gen_quant_reln_from_expressionP(final SubLObject expression, final SubLObject mt)
  {
    return makeBoolean( NIL != gen_quant_relation_from_p( cycl_utilities.formula_operator( expression ) ) && quantproc_3_gen_quant_reln_type_arg_position( expression, mt ).eql( $kw23$FROM_TYPE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 9501L)
  public static SubLObject quantproc_3_gen_quant_reln_to_expressionP(final SubLObject expression, final SubLObject mt)
  {
    return makeBoolean( NIL != gen_quant_relation_to_p( cycl_utilities.formula_operator( expression ) ) && quantproc_3_gen_quant_reln_type_arg_position( expression, mt ).eql( $kw21$TO_TYPE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 9901L)
  public static SubLObject quantproc_3_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    return $quantproc_3_microseconds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 10030L)
  public static SubLObject quantproc_3_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != clauses.clauses_p( expression ) && NIL != clauses.clauses_p( original_clause ) && NIL != list_utilities.singletonP( expression ) && NIL != clause_utilities.pos_atomic_cnf_p( expression.first() ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( expression.first() );
      SubLObject new_sentence = NIL;
      SubLObject justification = T;
      if( NIL != el_utilities.el_formula_p( asent ) )
      {
        SubLObject argnum = ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args( asent, $kw2$IGNORE );
        SubLObject rest;
        SubLObject arg;
        SubLObject new_sentence_$2;
        SubLObject justification_$3;
        SubLObject new_sentence_$3;
        SubLObject justification_$4;
        SubLObject new_sentence_$4;
        SubLObject justification_$5;
        for( rest = NIL, rest = args; NIL == new_sentence && NIL != rest; rest = rest.rest() )
        {
          arg = rest.first();
          argnum = Numbers.add( argnum, ONE_INTEGER );
          if( NIL != quantproc_3_cardinality_of_fn_expressionP( arg, mt ) )
          {
            thread.resetMultipleValues();
            new_sentence_$2 = quantproc_3_reformulate_cardinality_of_fn( asent, argnum, mt, settings, original_clause );
            justification_$3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_sentence = new_sentence_$2;
            justification = justification_$3;
          }
          else if( NIL != quantproc_3_subcol_expressionP( arg, mt ) )
          {
            thread.resetMultipleValues();
            new_sentence_$3 = quantproc_3_reformulate_subcol( asent, argnum, mt, settings, original_clause );
            justification_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_sentence = new_sentence_$3;
            justification = justification_$4;
          }
          else if( NIL != quantproc_3_nested_subcol_expressionP( arg, mt ) )
          {
            thread.resetMultipleValues();
            new_sentence_$4 = quantproc_3_reformulate_nested_subcol( asent, argnum, mt, settings, original_clause );
            justification_$5 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_sentence = new_sentence_$4;
            justification = justification_$5;
          }
        }
        if( NIL == new_sentence )
        {
          if( NIL != quantproc_3_gen_quant_reln_from_expressionP( asent, mt ) )
          {
            thread.resetMultipleValues();
            final SubLObject new_sentence_$5 = quantproc_3_reformulate_gen_quant_reln_from( asent, mt, settings );
            final SubLObject justification_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_sentence = new_sentence_$5;
            justification = justification_$6;
          }
          else if( NIL != quantproc_3_gen_quant_reln_to_expressionP( asent, mt ) )
          {
            thread.resetMultipleValues();
            final SubLObject new_sentence_$6 = quantproc_3_reformulate_gen_quant_reln_to( asent, mt, settings );
            final SubLObject justification_$7 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_sentence = new_sentence_$6;
            justification = justification_$7;
          }
          else if( NIL == new_sentence )
          {
            thread.resetMultipleValues();
            final SubLObject arg2 = quantproc_3_el_formula_next_arg_argnum( asent, mt );
            final SubLObject argnum2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != quantproc_3_nl_quant_fn_expressionP( arg2, mt, $list27, $const4$NLQuantFn_3 ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_sentence_$7 = quantproc_3_reformulate_every( asent, argnum2, mt, settings, original_clause );
              final SubLObject justification_$8 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              new_sentence = new_sentence_$7;
              justification = justification_$8;
            }
            else if( NIL != quantproc_3_nl_quant_fn_expressionP( arg2, mt, $list28, $const4$NLQuantFn_3 ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_sentence_$8 = quantproc_3_reformulate_some( asent, argnum2, mt, settings, original_clause );
              final SubLObject justification_$9 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              new_sentence = new_sentence_$8;
              justification = justification_$9;
            }
            else if( NIL != quantproc_3_nl_quant_fn_expressionP( arg2, mt, $list15, $const4$NLQuantFn_3 ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_sentence_$9 = quantproc_3_reformulate_bare_form( asent, argnum2, mt, settings, original_clause );
              final SubLObject justification_$10 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              new_sentence = new_sentence_$9;
              justification = justification_$10;
            }
            else if( NIL != quantproc_3_nl_quant_fn_expressionP( arg2, mt, $list29, $const4$NLQuantFn_3 ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_sentence_$10 = quantproc_3_reformulate_each( asent, argnum2, mt, settings, original_clause );
              final SubLObject justification_$11 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              new_sentence = new_sentence_$10;
              justification = justification_$11;
            }
            else if( NIL != quantproc_3_nl_quant_fn_expressionP( arg2, mt, $list30, $const4$NLQuantFn_3 ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_sentence_$11 = quantproc_3_reformulate_gen_quant( asent, argnum2, mt, settings, original_clause );
              final SubLObject justification_$12 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              new_sentence = new_sentence_$11;
              justification = justification_$12;
            }
            else if( NIL != quantproc_3_nl_quant_fn_expressionP( arg2, mt, $list31, $const4$NLQuantFn_3 ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_sentence_$12 = quantproc_3_reformulate_no( asent, argnum2, mt, settings, original_clause );
              final SubLObject justification_$13 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              new_sentence = new_sentence_$12;
              justification = justification_$13;
            }
            else if( NIL != quantproc_3_nl_quant_fn_expressionP( arg2, mt, $list18, $const6$NLDefinitenessFn_3 ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_sentence_$13 = quantproc_3_reformulate_indefinite( asent, argnum2, mt, settings, original_clause );
              final SubLObject justification_$14 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              new_sentence = new_sentence_$13;
              justification = justification_$14;
            }
            else if( NIL != quantproc_3_nl_quant_fn_expressionP( arg2, mt, $list32, $const6$NLDefinitenessFn_3 ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_sentence_$14 = quantproc_3_reformulate_definite( asent, argnum2, mt, settings, original_clause );
              final SubLObject justification_$15 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              new_sentence = new_sentence_$14;
              justification = justification_$15;
            }
            else if( NIL != quantproc_3_numerical_quant_fn_expressionP( arg2, mt ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_sentence_$15 = quantproc_3_reformulate_numerical( asent, argnum2, mt, settings, original_clause );
              final SubLObject justification_$16 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              new_sentence = new_sentence_$15;
              justification = justification_$16;
            }
          }
        }
      }
      if( NIL != new_sentence )
      {
        return Values.values( ConsesLow.list( clause_utilities.make_gaf_cnf( new_sentence ) ), justification );
      }
    }
    return Values.values( expression, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 14251L)
  public static SubLObject quantproc_3_reformulate_cardinality_of_fn(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    if( NIL == el_utilities.el_binary_formula_p( thesent ) )
    {
      return NIL;
    }
    final SubLObject asent = conses_high.copy_tree( thesent );
    final SubLObject arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject col = cycl_utilities.formula_arg1( arg, UNPROVIDED );
    final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
    if( pred.eql( $const33$is_Underspecified ) && argnum.numLE( TWO_INTEGER ) )
    {
      final SubLObject the_value = argnum.numE( TWO_INTEGER ) ? cycl_utilities.formula_arg( asent, ONE_INTEGER, UNPROVIDED ) : cycl_utilities.formula_arg( asent, TWO_INTEGER, UNPROVIDED );
      return Values.values( el_utilities.list_to_elf( ConsesLow.list( $const34$extentCardinality, ConsesLow.list( $const35$TheSetOf, new_var, ConsesLow.list( $const36$isa, new_var, col ) ), the_value ) ), ConsesLow.list(
          $str37$CardinalityOfFn_1 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 15155L)
  public static SubLObject quantproc_3_reformulate_gen_quant_reln_to(final SubLObject asent, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject gen_quant_reln = el_utilities.unmake_ternary_formula( asent );
    final SubLObject pred = thread.secondMultipleValue();
    final SubLObject col1 = thread.thirdMultipleValue();
    final SubLObject nl_quant_fn_expr = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_quant_tag = el_utilities.unmake_binary_formula( nl_quant_fn_expr );
    final SubLObject nl_quant_attr = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
    final SubLObject nl_number_attr = thread.secondMultipleValue();
    final SubLObject col2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject pcase_var = gen_quant_reln;
    if( pcase_var.eql( $const38$most_GenQuantRelnTo ) )
    {
      return Values.values( el_utilities.make_ternary_formula( $const39$most_GenQuantRelnToType, pred, col1, col2 ), ConsesLow.list( $str40$3_4 ) );
    }
    if( pcase_var.eql( $const41$few_GenQuantRelnTo ) )
    {
      return Values.values( el_utilities.make_ternary_formula( $const42$few_GenQuantRelnToType, pred, col1, col2 ), ConsesLow.list( $str43$11_5_1 ) );
    }
    if( pcase_var.eql( $const44$many_GenQuantRelnTo ) )
    {
      return Values.values( el_utilities.make_ternary_formula( $const45$many_GenQuantRelnToType, pred, col1, col2 ), ConsesLow.list( $str46$2_4 ) );
    }
    if( pcase_var.eql( $const47$several_GenQuantRelnTo ) )
    {
      return Values.values( el_utilities.make_ternary_formula( $const48$several_GenQuantRelnToType, pred, col1, col2 ), ConsesLow.list( $str49$7_5_1 ) );
    }
    if( pcase_var.eql( $const50$no_GenQuantRelnTo ) )
    {
      return Values.values( el_utilities.make_ternary_formula( $const51$no_GenQuantRelnToFromType, pred, col1, col2 ), ConsesLow.list( $str52$9_2_5 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 16599L)
  public static SubLObject quantproc_3_reformulate_gen_quant_reln_from(final SubLObject asent, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject gen_quant_reln = el_utilities.unmake_ternary_formula( asent );
    final SubLObject pred = thread.secondMultipleValue();
    final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
    final SubLObject col2 = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_quant_tag = el_utilities.unmake_binary_formula( nl_quant_fn_expr );
    final SubLObject nl_quant_attr = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
    final SubLObject nl_number_attr = thread.secondMultipleValue();
    final SubLObject col3 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject pcase_var = gen_quant_reln;
    if( pcase_var.eql( $const53$most_GenQuantRelnFrom ) )
    {
      return Values.values( el_utilities.make_ternary_formula( $const54$most_GenQuantRelnFromType, pred, col3, col2 ), ConsesLow.list( $str55$3_3 ) );
    }
    if( pcase_var.eql( $const56$few_GenQuantRelnFrom ) )
    {
      return Values.values( el_utilities.make_ternary_formula( $const57$few_GenQuantRelnFromType, pred, col3, col2 ), ConsesLow.list( $str58$11_5_2 ) );
    }
    if( pcase_var.eql( $const59$many_GenQuantRelnFrom ) )
    {
      return Values.values( el_utilities.make_ternary_formula( $const60$many_GenQuantRelnFromType, pred, col3, col2 ), ConsesLow.list( $str61$2_5 ) );
    }
    if( pcase_var.eql( $const62$several_GenQuantRelnFrom ) )
    {
      return Values.values( el_utilities.make_ternary_formula( $const63$several_GenQuantRelnFromType, pred, col3, col2 ), ConsesLow.list( $str64$7_5_2 ) );
    }
    if( pcase_var.eql( $const65$no_GenQuantRelnFrom ) )
    {
      return Values.values( el_utilities.make_ternary_formula( $const51$no_GenQuantRelnToFromType, pred, col3, col2 ), ConsesLow.list( $str66$9_1_5 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 18063L)
  public static SubLObject quantproc_3_reformulate_gen_quant(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.formula_arityGE( thesent, TWO_INTEGER, UNPROVIDED ) )
    {
      final SubLObject asent = conses_high.copy_tree( thesent );
      final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
      final SubLObject arg1 = cycl_utilities.formula_arg1( asent, UNPROVIDED );
      final SubLObject arg2 = cycl_utilities.formula_arg2( asent, UNPROVIDED );
      final SubLObject arg3 = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
      SubLObject gen_quantifier = NIL;
      thread.resetMultipleValues();
      final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( arg3 );
      final SubLObject gen_quant_attr = thread.secondMultipleValue();
      final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      gen_quantifier = kb_mapping_utilities.fpred_value_in_any_mt( gen_quant_attr, $const67$correspondingGenQuant, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
      final SubLObject number = thread.secondMultipleValue();
      final SubLObject col = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != subl_promotions.memberP( number, $list68, UNPROVIDED, UNPROVIDED ) )
      {
        if( argnum.numE( TWO_INTEGER ) && NIL != el_utilities.el_binary_formula_p( asent ) && NIL != fort_types_interface.isa_predicateP( pred, mt ) && NIL != fort_types_interface.isa_collectionP( col, mt ) )
        {
          final SubLObject pcase_var = gen_quant_attr;
          if( pcase_var.eql( $const69$Most_NLAttr ) )
          {
            return Values.values( el_utilities.make_ternary_formula( $const53$most_GenQuantRelnFrom, pred, arg1, col ), ConsesLow.list( $str70$GenQuant_2_1 ) );
          }
          if( pcase_var.eql( $const71$Many_NLAttr ) )
          {
            return Values.values( el_utilities.make_ternary_formula( $const59$many_GenQuantRelnFrom, pred, arg1, col ), ConsesLow.list( $str72$GenQuant_2_2 ) );
          }
          if( pcase_var.eql( $const73$Few_NLAttr ) )
          {
            return Values.values( el_utilities.make_ternary_formula( $const56$few_GenQuantRelnFrom, pred, arg1, col ), ConsesLow.list( $str74$GenQuant_2_3 ) );
          }
          if( pcase_var.eql( $const75$Several_NLAttr ) )
          {
            return Values.values( el_utilities.make_ternary_formula( $const62$several_GenQuantRelnFrom, pred, arg1, col ), ConsesLow.list( $str76$GenQuant_2_4 ) );
          }
        }
        else if( argnum.numE( ONE_INTEGER ) && NIL != el_utilities.el_binary_formula_p( asent ) && NIL != fort_types_interface.isa_predicateP( pred, mt ) && NIL != fort_types_interface.isa_collectionP( col, mt ) )
        {
          final SubLObject pcase_var = gen_quant_attr;
          if( pcase_var.eql( $const69$Most_NLAttr ) )
          {
            return Values.values( el_utilities.make_ternary_formula( $const38$most_GenQuantRelnTo, pred, col, arg2 ), ConsesLow.list( $str77$GenQuant_3_1 ) );
          }
          if( pcase_var.eql( $const71$Many_NLAttr ) )
          {
            return Values.values( el_utilities.make_ternary_formula( $const44$many_GenQuantRelnTo, pred, col, arg2 ), ConsesLow.list( $str78$GenQuant_3_2 ) );
          }
          if( pcase_var.eql( $const73$Few_NLAttr ) )
          {
            return Values.values( el_utilities.make_ternary_formula( $const41$few_GenQuantRelnTo, pred, col, arg2 ), ConsesLow.list( $str79$GenQuant_3_3 ) );
          }
          if( pcase_var.eql( $const75$Several_NLAttr ) )
          {
            return Values.values( el_utilities.make_ternary_formula( $const47$several_GenQuantRelnTo, pred, col, arg2 ), ConsesLow.list( $str80$GenQuant_3_4 ) );
          }
        }
        else if( NIL != el_utilities.formula_arityGE( asent, THREE_INTEGER, UNPROVIDED ) && number.eql( $const81$Plural_NLAttr ) )
        {
          final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
          final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_var, asent );
          return Values.values( el_utilities.list_to_elf( ConsesLow.list( gen_quantifier, col, ConsesLow.list( $const35$TheSetOf, new_var, subsentence ) ) ), $str82$GenQuant_1 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 20933L)
  public static SubLObject quantproc_3_reformulate_every(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = conses_high.copy_tree( thesent );
    final SubLObject arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    if( NIL == isa.isaP( pred, $const83$RuleMacroPredicate, mt, UNPROVIDED ) || pred.eql( $const84$genls ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( arg );
      final SubLObject every = thread.secondMultipleValue();
      final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
      final SubLObject number = thread.secondMultipleValue();
      final SubLObject col = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
      final SubLObject consequent = el_utilities.replace_formula_arg( argnum, new_var, asent );
      return Values.values( el_utilities.make_universal( new_var, el_utilities.make_implication( el_utilities.make_binary_formula( $const36$isa, new_var, col ), consequent ) ), ConsesLow.list( $const85$Every_NLAttr ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 21895L)
  public static SubLObject quantproc_3_reformulate_some(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = conses_high.copy_tree( thesent );
    final SubLObject arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    if( NIL == isa.isaP( pred, $const83$RuleMacroPredicate, mt, UNPROVIDED ) || pred.eql( $const84$genls ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( arg );
      final SubLObject some = thread.secondMultipleValue();
      final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
      final SubLObject number = thread.secondMultipleValue();
      final SubLObject col = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
      final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_var, asent );
      return Values.values( el_utilities.make_existential( new_var, simplifier.conjoin( ConsesLow.list( el_utilities.make_binary_formula( $const36$isa, new_var, col ), subsentence ), UNPROVIDED ) ), ConsesLow.list(
          $const86$Some_NLAttr ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 22859L)
  public static SubLObject quantproc_3_reformulate_bare_form(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = conses_high.copy_tree( thesent );
    final SubLObject arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    thread.resetMultipleValues();
    final SubLObject nl_quant_fn = el_utilities.unmake_ternary_formula( arg );
    final SubLObject bare_form = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    final SubLObject nl_quant_fn_argnum = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
    final SubLObject number = thread.secondMultipleValue();
    final SubLObject col = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( $list87.equal( kb_accessors.argn_isa( pred, argnum, mt ) ) || NIL == at_admitted.admitted_argumentP( col, argnum, pred, mt ) )
    {
      if( nl_quant_fn_argnum.numLE( ONE_INTEGER ) && NIL != conses_high.member( number, $list88, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject new_arg = list_utilities.replace_nested_nth( arg, $list89, $const90$Generic_NLAttr );
        return Values.values( el_utilities.replace_formula_arg( argnum, new_arg, asent ), ConsesLow.list( $str91$BAREFORM_1 ) );
      }
      if( nl_quant_fn_argnum.numG( ONE_INTEGER ) && NIL != conses_high.member( number, $list88, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
        final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_var, asent );
        return Values.values( el_utilities.make_existential( new_var, simplifier.conjoin( ConsesLow.list( el_utilities.make_binary_formula( $const36$isa, new_var, col ), subsentence ), UNPROVIDED ) ), ConsesLow.list(
            $str92$BAREFORM_2 ) );
      }
      if( number.eql( $const90$Generic_NLAttr ) )
      {
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
        final SubLObject consequent = el_utilities.replace_formula_arg( argnum, new_var, asent );
        return Values.values( el_utilities.make_universal( new_var, el_utilities.make_implication( el_utilities.make_binary_formula( $const36$isa, new_var, col ), consequent ) ), ConsesLow.list( $str93$BAREFORM_3 ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 26101L)
  public static SubLObject quantproc_3_reformulate_each(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = conses_high.copy_tree( thesent );
    final SubLObject arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    thread.resetMultipleValues();
    final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( arg );
    final SubLObject each = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
    final SubLObject number = thread.secondMultipleValue();
    final SubLObject col = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( number.equal( $const94$Singular_NLAttr ) && NIL != subl_promotions.memberP( argnum, $list95, UNPROVIDED, UNPROVIDED ) && NIL != fort_types_interface.isa_collectionP( col, mt ) )
    {
      final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
      final SubLObject consequent = el_utilities.replace_formula_arg( argnum, new_var, asent );
      return Values.values( el_utilities.make_universal( new_var, el_utilities.make_implication( el_utilities.make_binary_formula( $const36$isa, new_var, col ), consequent ) ), ConsesLow.list( $str96$5_1_or_5_2 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 27100L)
  public static SubLObject quantproc_3_reformulate_no(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.formula_arityGE( thesent, TWO_INTEGER, UNPROVIDED ) )
    {
      final SubLObject asent = conses_high.copy_tree( thesent );
      final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
      final SubLObject arg1 = cycl_utilities.formula_arg1( asent, UNPROVIDED );
      final SubLObject arg2 = cycl_utilities.formula_arg2( asent, UNPROVIDED );
      final SubLObject arg3 = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( arg3 );
      final SubLObject no = thread.secondMultipleValue();
      final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
      final SubLObject number = thread.secondMultipleValue();
      final SubLObject col = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != subl_promotions.memberP( number, $list97, UNPROVIDED, UNPROVIDED ) )
      {
        if( argnum.numE( TWO_INTEGER ) && NIL != el_utilities.el_binary_formula_p( asent ) && NIL != fort_types_interface.isa_predicateP( pred, mt ) && NIL != fort_types_interface.isa_collectionP( col, mt ) )
        {
          return Values.values( el_utilities.make_ternary_formula( $const65$no_GenQuantRelnFrom, pred, arg1, col ), ConsesLow.list( $str98$9_1 ) );
        }
        if( argnum.numE( ONE_INTEGER ) && NIL != el_utilities.el_binary_formula_p( asent ) && NIL != fort_types_interface.isa_predicateP( pred, mt ) && NIL != fort_types_interface.isa_collectionP( col, mt ) )
        {
          return Values.values( el_utilities.make_ternary_formula( $const50$no_GenQuantRelnTo, pred, col, arg2 ), ConsesLow.list( $str99$9_2 ) );
        }
        if( NIL != el_utilities.formula_arityGE( asent, THREE_INTEGER, UNPROVIDED ) )
        {
          final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
          final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_var, asent );
          return Values.values( el_utilities.list_to_elf( ConsesLow.list( $const100$disjointWith, col, ConsesLow.list( $const35$TheSetOf, new_var, subsentence ) ) ), $str101$9_5_ );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 28643L)
  public static SubLObject quantproc_3_reformulate_indefinite(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = conses_high.copy_tree( thesent );
    final SubLObject arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    thread.resetMultipleValues();
    final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( arg );
    final SubLObject indefinite = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
    final SubLObject number = thread.secondMultipleValue();
    final SubLObject col = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != subl_promotions.memberP( number, $list102, UNPROVIDED, UNPROVIDED ) && number.eql( $const94$Singular_NLAttr ) && ( $list87.equal( kb_accessors.argn_isa( pred, argnum, mt ) ) || NIL == at_admitted
        .admitted_argumentP( col, argnum, pred, mt ) ) )
    {
      final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
      final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_var, asent );
      return Values.values( el_utilities.list_to_elf( ConsesLow.list( $const103$thereExists, new_var, ConsesLow.list( $const104$and, ConsesLow.list( $const36$isa, new_var, col ), subsentence ) ) ), ConsesLow.list(
          $str105$4_2 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 30251L)
  public static SubLObject quantproc_3_reformulate_definite(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = conses_high.copy_tree( thesent );
    final SubLObject arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    thread.resetMultipleValues();
    final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( arg );
    final SubLObject definite = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
    final SubLObject number = thread.secondMultipleValue();
    final SubLObject col = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != subl_promotions.memberP( number, $list97, UNPROVIDED, UNPROVIDED ) && NIL != fort_types_interface.isa_predicateP( pred, mt ) && NIL != fort_types_interface.isa_collectionP( col, mt ) && ( $list87.equal(
        kb_accessors.argn_isa( pred, argnum, mt ) ) || NIL == at_admitted.admitted_argumentP( col, argnum, pred, mt ) ) )
    {
      final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
      final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_var, asent );
      return Values.values( el_utilities.list_to_elf( ConsesLow.list( $const103$thereExists, new_var, ConsesLow.list( $const104$and, ConsesLow.list( $const36$isa, new_var, col ), subsentence ) ) ), ConsesLow.list(
          $str106$6_1 ) );
    }
    if( argnum.numE( TWO_INTEGER ) && NIL != conses_high.member( number, $list107, UNPROVIDED, UNPROVIDED ) && NIL != arity.arity_admitsGE( pred, THREE_INTEGER ) && NIL == arity.arity_admitsP( pred, TWO_INTEGER )
        && NIL != isa.isaP( pred, $const108$ComparisonWRTPredicate, mt, UNPROVIDED ) && ( NIL != isa.isaP( pred, $const109$IndividualLevelPredicate, mt, UNPROVIDED ) || ( $list87.equal( kb_accessors.arg1_isa( pred,
            mt ) ) && $list87.equal( kb_accessors.arg2_isa( pred, mt ) ) ) ) )
    {
      final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
      final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_var, asent );
      return Values.values( el_utilities.list_to_elf( ConsesLow.list( $const110$forAll, new_var, ConsesLow.list( $const111$implies, ConsesLow.list( $const36$isa, new_var, col ), subsentence ) ) ), ConsesLow.list(
          $str112$6_4_1 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 32199L)
  public static SubLObject quantproc_3_reformulate_numerical(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = conses_high.copy_tree( thesent );
    final SubLObject arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( arg );
    final SubLObject nl_attr = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject numerical_quant = el_utilities.unmake_binary_formula( nl_attr );
    final SubLObject integer_arg = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != subl_promotions.positive_integer_p( integer_arg ) || NIL != at_defns.quiet_has_typeP( integer_arg, $const113$ScalarInterval, UNPROVIDED ) || ( NIL != el_utilities.el_formula_p( integer_arg ) && NIL != isa
        .result_isa_colP( cycl_utilities.formula_arg0( integer_arg ), $const114$IntegerExtent, mt ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
      final SubLObject number = thread.secondMultipleValue();
      final SubLObject col = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( number.eql( ONE_INTEGER.eql( integer_arg ) ? $const94$Singular_NLAttr : $const81$Plural_NLAttr ) )
      {
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
        final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_var, asent );
        return Values.values( el_utilities.list_to_elf( ConsesLow.list( $const115$num_GenQuant, col, ConsesLow.list( $const35$TheSetOf, new_var, subsentence ), integer_arg ) ), ConsesLow.list( $str116$10_1 ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 33533L)
  public static SubLObject quantproc_3_reformulate_subcol(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = conses_high.copy_tree( thesent );
    final SubLObject arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    if( NIL != fort_types_interface.isa_predicateP( pred, mt ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_quant_fn = el_utilities.unmake_ternary_formula( arg );
      final SubLObject nl_attr = thread.secondMultipleValue();
      final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
      final SubLObject number = thread.secondMultipleValue();
      final SubLObject col = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != genl_predicates.genl_predP( pred, $const36$isa, UNPROVIDED, UNPROVIDED ) )
      {
        return Values.values( el_utilities.replace_formula_arg( argnum, col, asent ), ConsesLow.list( $const117$SubcollectionFunction, $kw118$1 ) );
      }
      SubLObject cdolist_list_var = kb_accessors.argn_isa( pred, argnum, mt );
      SubLObject arg_isa_col = NIL;
      arg_isa_col = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !$const119$Thing.eql( arg_isa_col ) && NIL != isa.isaP( arg_isa_col, $const120$CollectionType, mt, UNPROVIDED ) && NIL != isa.isaP( col, arg_isa_col, mt, UNPROVIDED ) )
        {
          final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
          final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_var, asent );
          return Values.values( el_utilities.list_to_elf( ConsesLow.list( $const103$thereExists, new_var, ConsesLow.list( $const104$and, ConsesLow.list( $const84$genls, new_var, col ), subsentence ) ) ), ConsesLow.list(
              $const117$SubcollectionFunction ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg_isa_col = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 34765L)
  public static SubLObject quantproc_3_reformulate_nested_subcol(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject asent = conses_high.copy_tree( thesent );
    final SubLObject function_arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    if( NIL != el_utilities.possibly_naut_p( function_arg ) && NIL != fort_types_interface.isa_predicateP( pred, mt ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( function_arg );
      if( NIL != fort_types_interface.isa_functionP( functor, mt ) && NIL == isa.quoted_isaP( functor, $const121$CycNLParsingConstant, mt, UNPROVIDED ) && NIL == reformulator_module_quantifier_unifier_3
          .subcollection_function_nautP( function_arg, mt ) )
      {
        SubLObject function_argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( function_arg, $kw2$IGNORE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          function_argnum = Numbers.add( function_argnum, ONE_INTEGER );
          if( NIL != quantproc_3_nl_quant_fn_expressionP( arg, mt, $list14, $const6$NLDefinitenessFn_3 ) || NIL != quantproc_3_nl_quant_fn_expressionP( arg, mt, $list15, $const4$NLQuantFn_3 ) )
          {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_ternary_formula( arg );
            final SubLObject nl_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            final SubLObject start_index = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( nl_quant_fn.eql( $const6$NLDefinitenessFn_3 ) && NIL != conses_high.member( number, $list122, UNPROVIDED, UNPROVIDED ) && NIL == at_admitted.admitted_argumentP( col, function_argnum, functor, mt ) )
            {
              final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
              final SubLObject new_function_expr = el_utilities.replace_formula_arg( function_argnum, new_var, function_arg );
              final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_function_expr, asent );
              return Values.values( el_utilities.list_to_elf( ConsesLow.list( $const103$thereExists, new_var, ConsesLow.list( $const104$and, ConsesLow.list( $const36$isa, new_var, col ), subsentence ) ) ), ConsesLow
                  .list( $str123$8_1_or_8_2 ) );
            }
            if( nl_quant_fn.eql( $const4$NLQuantFn_3 ) && NIL != conses_high.member( nl_attr, $list124, UNPROVIDED, UNPROVIDED ) && NIL == at_admitted.admitted_argumentP( col, function_argnum, functor, mt )
                && NIL == reformulator_module_quantifier_unifier_3.subcollection_function_nautP( col, mt ) )
            {
              final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
              final SubLObject new_function_expr = el_utilities.replace_formula_arg( function_argnum, new_var, function_arg );
              final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_function_expr, asent );
              return Values.values( el_utilities.list_to_elf( ConsesLow.list( $const110$forAll, new_var, ConsesLow.list( $const111$implies, ConsesLow.list( $const36$isa, new_var, col ), subsentence ) ) ), ConsesLow.list(
                  $str125$8_2_5 ) );
            }
            if( ( ( nl_quant_fn.eql( $const4$NLQuantFn_3 ) && NIL != conses_high.member( number, $list107, UNPROVIDED, UNPROVIDED ) ) || ( nl_quant_fn.eql( $const6$NLDefinitenessFn_3 ) && NIL != conses_high.member(
                number, $list126, UNPROVIDED, UNPROVIDED ) ) ) && NIL != reformulator_module_quantifier_unifier_3.subcollection_function_nautP( col, mt ) && NIL != at_admitted.admitted_argumentP( col, function_argnum,
                    functor, mt ) )
            {
              final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
              final SubLObject new_function_expr = el_utilities.replace_formula_arg( function_argnum, new_var, function_arg );
              final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_function_expr, asent );
              return Values.values( el_utilities.list_to_elf( ConsesLow.list( $const103$thereExists, new_var, ConsesLow.list( $const104$and, ConsesLow.list( $const84$genls, new_var, col ), subsentence ) ) ), ConsesLow
                  .list( $str127$8_3_1 ) );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 38183L)
  public static SubLObject quantproc_3_el_formula_next_arg_argnum(final SubLObject asent, final SubLObject mt)
  {
    SubLObject min_order = NIL;
    SubLObject best_candidate_arg_number = NIL;
    SubLObject best_candidate_sentence = NIL;
    SubLObject cur_arg_number = ZERO_INTEGER;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( asent, $kw2$IGNORE );
    SubLObject cur_sentence = NIL;
    cur_sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cur_arg_number = Numbers.add( cur_arg_number, ONE_INTEGER );
      if( NIL != quantproc_3_any_nl_quant_fn_expressionP( cur_sentence, mt ) )
      {
        final SubLObject cur_order = cycl_utilities.formula_arg3( cur_sentence, UNPROVIDED );
        if( NIL == cur_order && NIL == best_candidate_sentence )
        {
          best_candidate_sentence = cur_sentence;
          best_candidate_arg_number = cur_arg_number;
        }
        else if( cur_order.isInteger() && ( NIL == min_order || cur_order.numL( min_order ) ) )
        {
          min_order = cur_order;
          best_candidate_sentence = cur_sentence;
          best_candidate_arg_number = cur_arg_number;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      cur_sentence = cdolist_list_var.first();
    }
    return Values.values( best_candidate_sentence, best_candidate_arg_number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 39131L)
  public static SubLObject quantproc_3_nl_quant_fn_expression_arg_order(final SubLObject poss_quant_fn_expr)
  {
    if( !poss_quant_fn_expr.isList() || ( !$const4$NLQuantFn_3.eql( cycl_utilities.sentence_arg0( poss_quant_fn_expr ) ) && !$const6$NLDefinitenessFn_3.eql( cycl_utilities.sentence_arg0( poss_quant_fn_expr ) ) ) )
    {
      return NIL;
    }
    final SubLObject arg_order = cycl_utilities.sentence_arg3( poss_quant_fn_expr, UNPROVIDED );
    if( arg_order.isInteger() )
    {
      return arg_order;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 39621L)
  public static SubLObject quantproc_3_expression_arg_order_list_apply(final SubLObject asent, SubLObject arg_order_min_list)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = asent;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != quantproc_3_nl_quant_fn_expression_arg_order( arg ) )
      {
        final SubLObject new_arg_order = arg_order_min_list.first();
        arg_order_min_list = arg_order_min_list.rest();
        result = ConsesLow.cons( list_utilities.replace_nth( THREE_INTEGER, new_arg_order, arg ), result );
      }
      else
      {
        result = ConsesLow.cons( arg, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 40200L)
  public static SubLObject quantproc_3_formula_arg_order_list(final SubLObject asent)
  {
    return Sequences.remove( NIL, Mapping.mapcar( Symbols.symbol_function( $sym128$QUANTPROC_3_NL_QUANT_FN_EXPRESSION_ARG_ORDER ), asent ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 40344L)
  public static SubLObject quantproc_3_el_formula_normalize(final SubLObject asent)
  {
    final SubLObject arg_order_list = quantproc_3_formula_arg_order_list( asent );
    if( !ONE_INTEGER.numE( Sequences.count( ZERO_INTEGER, arg_order_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) && NIL != list_utilities.duplicates( arg_order_list, UNPROVIDED, UNPROVIDED ) )
    {
      return quantproc_3_expression_arg_order_list_apply( asent, $list129 );
    }
    return asent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 40972L)
  public static SubLObject quantproc_3_apply_operation(final SubLObject list, final SubLObject operation)
  {
    if( operation.eql( $kw130$SWITCH_FIRST ) )
    {
      if( Sequences.length( list ).numG( ONE_INTEGER ) )
      {
        return ConsesLow.cons( conses_high.cadr( list ), ConsesLow.cons( list.first(), conses_high.cddr( list ) ) );
      }
      return list;
    }
    else
    {
      if( operation.eql( $kw131$SHIFT_LEFT ) )
      {
        return list_utilities.list_rotate_left( list );
      }
      if( operation.eql( $kw132$SHIFT_RIGHT ) )
      {
        return list_utilities.list_rotate_right( list );
      }
      return list;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 41299L)
  public static SubLObject quantproc_3_arg_order_list_permutations(final SubLObject arg_order_list)
  {
    SubLObject arg_order_list_list = ConsesLow.list( arg_order_list );
    SubLObject cur_arg_order_list = arg_order_list;
    final SubLObject operation_list_orig = $list133;
    final SubLObject arg_order_list_length = Sequences.length( arg_order_list );
    final SubLObject num_steps = arg_order_list_length.numG( ONE_INTEGER ) ? Numbers.multiply( arg_order_list_length, Numbers.subtract( arg_order_list_length, ONE_INTEGER ) ) : ONE_INTEGER;
    SubLObject step = NIL;
    SubLObject operation_list = NIL;
    SubLObject operation = NIL;
    step = ONE_INTEGER;
    operation_list = operation_list_orig;
    operation = operation_list.first();
    while ( !step.numGE( num_steps ))
    {
      cur_arg_order_list = quantproc_3_apply_operation( cur_arg_order_list, operation );
      arg_order_list_list = ConsesLow.cons( cur_arg_order_list, arg_order_list_list );
      step = Numbers.add( step, ONE_INTEGER );
      operation_list = list_utilities.list_rotate_left( operation_list );
      operation = operation_list.first();
    }
    arg_order_list_list = Sequences.nreverse( arg_order_list_list );
    arg_order_list_list = Sequences.remove_duplicates( arg_order_list_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return arg_order_list_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 42234L)
  public static SubLObject quantproc_3_el_formula_permutations(final SubLObject asent)
  {
    final SubLObject arg_order_list_orig = quantproc_3_formula_arg_order_list( asent );
    SubLObject arg_order_list_list = quantproc_3_arg_order_list_permutations( arg_order_list_orig );
    SubLObject result_list = NIL;
    SubLObject cdolist_list_var;
    arg_order_list_list = ( cdolist_list_var = Sequences.remove_duplicates( arg_order_list_list, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject arg_order_list = NIL;
    arg_order_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result_list = ConsesLow.cons( quantproc_3_expression_arg_order_list_apply( asent, arg_order_list ), result_list );
      cdolist_list_var = cdolist_list_var.rest();
      arg_order_list = cdolist_list_var.first();
    }
    result_list = Sequences.nreverse( result_list );
    return result_list;
  }

  public static SubLObject declare_reformulator_module_quantifier_processing_3_file()
  {
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_required", "QUANTPROC-3-REQUIRED", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_any_nl_quant_fn_expressionP", "QUANTPROC-3-ANY-NL-QUANT-FN-EXPRESSION?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_nl_quant_fn_expressionP", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION?", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_numerical_quant_fn_expressionP", "QUANTPROC-3-NUMERICAL-QUANT-FN-EXPRESSION?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "subcollection_function_naut_sans_mtP", "SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_subcol_expressionP", "QUANTPROC-3-SUBCOL-EXPRESSION?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "non_gen_quant_attributeP", "NON-GEN-QUANT-ATTRIBUTE?", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_nested_subcol_expressionP", "QUANTPROC-3-NESTED-SUBCOL-EXPRESSION?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_cardinality_of_fn_expressionP", "QUANTPROC-3-CARDINALITY-OF-FN-EXPRESSION?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_gen_quant_reln_type_arg_position", "QUANTPROC-3-GEN-QUANT-RELN-TYPE-ARG-POSITION", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "gen_quant_relation_from_p", "GEN-QUANT-RELATION-FROM-P", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "gen_quant_relation_to_p", "GEN-QUANT-RELATION-TO-P", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_gen_quant_reln_from_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-FROM-EXPRESSION?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_gen_quant_reln_to_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-TO-EXPRESSION?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_cost", "QUANTPROC-3-COST", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate", "QUANTPROC-3-REFORMULATE", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_cardinality_of_fn", "QUANTPROC-3-REFORMULATE-CARDINALITY-OF-FN", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_gen_quant_reln_to", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-TO", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_gen_quant_reln_from", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-FROM", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_gen_quant", "QUANTPROC-3-REFORMULATE-GEN-QUANT", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_every", "QUANTPROC-3-REFORMULATE-EVERY", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_some", "QUANTPROC-3-REFORMULATE-SOME", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_bare_form", "QUANTPROC-3-REFORMULATE-BARE-FORM", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_each", "QUANTPROC-3-REFORMULATE-EACH", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_no", "QUANTPROC-3-REFORMULATE-NO", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_indefinite", "QUANTPROC-3-REFORMULATE-INDEFINITE", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_definite", "QUANTPROC-3-REFORMULATE-DEFINITE", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_numerical", "QUANTPROC-3-REFORMULATE-NUMERICAL", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_subcol", "QUANTPROC-3-REFORMULATE-SUBCOL", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_nested_subcol", "QUANTPROC-3-REFORMULATE-NESTED-SUBCOL", 4, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_el_formula_next_arg_argnum", "QUANTPROC-3-EL-FORMULA-NEXT-ARG-ARGNUM", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_nl_quant_fn_expression_arg_order", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION-ARG-ORDER", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_expression_arg_order_list_apply", "QUANTPROC-3-EXPRESSION-ARG-ORDER-LIST-APPLY", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_formula_arg_order_list", "QUANTPROC-3-FORMULA-ARG-ORDER-LIST", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_el_formula_normalize", "QUANTPROC-3-EL-FORMULA-NORMALIZE", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_apply_operation", "QUANTPROC-3-APPLY-OPERATION", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_arg_order_list_permutations", "QUANTPROC-3-ARG-ORDER-LIST-PERMUTATIONS", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_el_formula_permutations", "QUANTPROC-3-EL-FORMULA-PERMUTATIONS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_reformulator_module_quantifier_processing_3_file()
  {
    $subcollection_function_mt$ = SubLFiles.defparameter( "*SUBCOLLECTION-FUNCTION-MT*", NIL );
    $gen_quant_relations_from$ = SubLFiles.deflexical( "*GEN-QUANT-RELATIONS-FROM*", $list24 );
    $gen_quant_relations_to$ = SubLFiles.deflexical( "*GEN-QUANT-RELATIONS-TO*", $list25 );
    $quantproc_3_microseconds$ = SubLFiles.deflexical( "*QUANTPROC-3-MICROSECONDS*", $int26$30000 );
    return NIL;
  }

  public static SubLObject setup_reformulator_module_quantifier_processing_3_file()
  {
    reformulator_module_harness.declare_rl_module( $const0$QuantifierProcessing_3_RLModule, $list1 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_module_quantifier_processing_3_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_module_quantifier_processing_3_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_module_quantifier_processing_3_file();
  }
  static
  {
    me = new reformulator_module_quantifier_processing_3();
    $subcollection_function_mt$ = null;
    $gen_quant_relations_from$ = null;
    $gen_quant_relations_to$ = null;
    $quantproc_3_microseconds$ = null;
    $const0$QuantifierProcessing_3_RLModule = constant_handles.reader_make_constant_shell( makeString( "QuantifierProcessing-3-RLModule" ) );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "REQUIRED" ), makeSymbol( "QUANTPROC-3-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "QUANTPROC-3-COST" ), makeKeyword( "REFORMULATE" ), makeSymbol(
        "QUANTPROC-3-REFORMULATE" ), makeKeyword( "DOCUMENTATION" ), makeString( "Handles the reformulation of NL-quantified expressions." ), makeKeyword( "EXAMPLE-SOURCE" ), makeString(
            "(#$contains-Underspecified \n     (#$NLQuantFn-3 #$Every-NLAttr \n \t       (#$NLNumberFn #$Singular-NLAttr #$SNRNP)) \n     (#$NLQuantFn-3 #$Some-NLAttr \n \t       (#$NLNumberFn #$Mass-NLAttr #$RNAMolecule)))" ),
      makeKeyword( "EXAMPLE-TARGET" ), makeString(
          "(#$implies \n     (#$isa ?VAR0 #$SNRNP) \n     (#$contains-Underspecified ?VAR0 \n      (#$NLQuantFn-3 #$Some-NLAttr \n       (#$NLNumberFn #$Mass-NLAttr #$RNAMolecule))))" )
    } );
    $kw2$IGNORE = makeKeyword( "IGNORE" );
    $list3 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "Every-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Some-NLAttr" ) ), constant_handles
        .reader_make_constant_shell( makeString( "BareForm-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Each-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString(
            "No-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Many-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Most-NLAttr" ) ), constant_handles
                .reader_make_constant_shell( makeString( "Several-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Few-NLAttr" ) )
    } );
    $const4$NLQuantFn_3 = constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) );
    $list5 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Indefinite-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ) );
    $const6$NLDefinitenessFn_3 = constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) );
    $list7 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), ConsesLow.list( makeKeyword( "ISA" ), constant_handles.reader_make_constant_shell( makeString(
        "NLNumberAttribute" ) ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ISA-COLLECTION?" ) ) ) );
    $list8 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), ConsesLow.list( makeKeyword( "ISA" ), constant_handles.reader_make_constant_shell( makeString(
        "NLNumberAttribute" ) ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ISA-COLLECTION?" ) ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NUMBERP" ) ) );
    $list9 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NumericalQuant-NLAttrFn" ) ),
        makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), ConsesLow.list( makeKeyword( "ISA" ), constant_handles.reader_make_constant_shell(
            makeString( "NLNumberAttribute" ) ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ISA-COLLECTION?" ) ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NUMBERP" ) ) );
    $list10 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NumericalQuant-NLAttrFn" ) ), makeKeyword(
        "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), ConsesLow.list( makeKeyword( "ISA" ), constant_handles.reader_make_constant_shell( makeString(
            "NLNumberAttribute" ) ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ISA-COLLECTION?" ) ) ) );
    $list11 = ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NL-TAG-FN-FORT-3?" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-GEN-QUANT-ATTRIBUTE?" ) ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?" ) ) ), ConsesLow
            .list( makeKeyword( "TEST" ), makeSymbol( "NUMBERP" ) ) );
    $list12 = ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NL-TAG-FN-FORT-3?" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-GEN-QUANT-ATTRIBUTE?" ) ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?" ) ) ) );
    $const13$NLGenQuantAttribute = constant_handles.reader_make_constant_shell( makeString( "NLGenQuantAttribute" ) );
    $list14 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Indefinite-NLAttr" ) ) );
    $list15 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BareForm-NLAttr" ) ) );
    $list16 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CardinalityOfFn" ) ), makeKeyword( "ANYTHING" ) );
    $list17 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BareForm-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Some-NLAttr" ) ) );
    $list18 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Indefinite-NLAttr" ) ) );
    $const19$GeneralizedQuantifierRelation = constant_handles.reader_make_constant_shell( makeString( "GeneralizedQuantifierRelation" ) );
    $const20$TypeInstanceTernaryRuleMacroPredi = constant_handles.reader_make_constant_shell( makeString( "TypeInstanceTernaryRuleMacroPredicate" ) );
    $kw21$TO_TYPE = makeKeyword( "TO-TYPE" );
    $const22$InstanceTypeTernaryRuleMacroPredi = constant_handles.reader_make_constant_shell( makeString( "InstanceTypeTernaryRuleMacroPredicate" ) );
    $kw23$FROM_TYPE = makeKeyword( "FROM-TYPE" );
    $list24 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "most-GenQuantRelnFrom" ) ), constant_handles.reader_make_constant_shell( makeString( "many-GenQuantRelnFrom" ) ), constant_handles
        .reader_make_constant_shell( makeString( "few-GenQuantRelnFrom" ) ), constant_handles.reader_make_constant_shell( makeString( "several-GenQuantRelnFrom" ) ), constant_handles.reader_make_constant_shell(
            makeString( "no-GenQuantRelnFrom" ) ) );
    $list25 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "most-GenQuantRelnTo" ) ), constant_handles.reader_make_constant_shell( makeString( "many-GenQuantRelnTo" ) ), constant_handles
        .reader_make_constant_shell( makeString( "few-GenQuantRelnTo" ) ), constant_handles.reader_make_constant_shell( makeString( "several-GenQuantRelnTo" ) ), constant_handles.reader_make_constant_shell( makeString(
            "no-GenQuantRelnTo" ) ) );
    $int26$30000 = makeInteger( 30000 );
    $list27 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Every-NLAttr" ) ) );
    $list28 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Some-NLAttr" ) ) );
    $list29 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Each-NLAttr" ) ) );
    $list30 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Most-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Many-NLAttr" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Several-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Few-NLAttr" ) ) );
    $list31 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "No-NLAttr" ) ) );
    $list32 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ) );
    $const33$is_Underspecified = constant_handles.reader_make_constant_shell( makeString( "is-Underspecified" ) );
    $const34$extentCardinality = constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) );
    $const35$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $const36$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $str37$CardinalityOfFn_1 = makeString( "CardinalityOfFn 1" );
    $const38$most_GenQuantRelnTo = constant_handles.reader_make_constant_shell( makeString( "most-GenQuantRelnTo" ) );
    $const39$most_GenQuantRelnToType = constant_handles.reader_make_constant_shell( makeString( "most-GenQuantRelnToType" ) );
    $str40$3_4 = makeString( "3.4" );
    $const41$few_GenQuantRelnTo = constant_handles.reader_make_constant_shell( makeString( "few-GenQuantRelnTo" ) );
    $const42$few_GenQuantRelnToType = constant_handles.reader_make_constant_shell( makeString( "few-GenQuantRelnToType" ) );
    $str43$11_5_1 = makeString( "11.5.1" );
    $const44$many_GenQuantRelnTo = constant_handles.reader_make_constant_shell( makeString( "many-GenQuantRelnTo" ) );
    $const45$many_GenQuantRelnToType = constant_handles.reader_make_constant_shell( makeString( "many-GenQuantRelnToType" ) );
    $str46$2_4 = makeString( "2.4" );
    $const47$several_GenQuantRelnTo = constant_handles.reader_make_constant_shell( makeString( "several-GenQuantRelnTo" ) );
    $const48$several_GenQuantRelnToType = constant_handles.reader_make_constant_shell( makeString( "several-GenQuantRelnToType" ) );
    $str49$7_5_1 = makeString( "7.5.1" );
    $const50$no_GenQuantRelnTo = constant_handles.reader_make_constant_shell( makeString( "no-GenQuantRelnTo" ) );
    $const51$no_GenQuantRelnToFromType = constant_handles.reader_make_constant_shell( makeString( "no-GenQuantRelnToFromType" ) );
    $str52$9_2_5 = makeString( "9.2.5" );
    $const53$most_GenQuantRelnFrom = constant_handles.reader_make_constant_shell( makeString( "most-GenQuantRelnFrom" ) );
    $const54$most_GenQuantRelnFromType = constant_handles.reader_make_constant_shell( makeString( "most-GenQuantRelnFromType" ) );
    $str55$3_3 = makeString( "3.3" );
    $const56$few_GenQuantRelnFrom = constant_handles.reader_make_constant_shell( makeString( "few-GenQuantRelnFrom" ) );
    $const57$few_GenQuantRelnFromType = constant_handles.reader_make_constant_shell( makeString( "few-GenQuantRelnFromType" ) );
    $str58$11_5_2 = makeString( "11.5.2" );
    $const59$many_GenQuantRelnFrom = constant_handles.reader_make_constant_shell( makeString( "many-GenQuantRelnFrom" ) );
    $const60$many_GenQuantRelnFromType = constant_handles.reader_make_constant_shell( makeString( "many-GenQuantRelnFromType" ) );
    $str61$2_5 = makeString( "2.5" );
    $const62$several_GenQuantRelnFrom = constant_handles.reader_make_constant_shell( makeString( "several-GenQuantRelnFrom" ) );
    $const63$several_GenQuantRelnFromType = constant_handles.reader_make_constant_shell( makeString( "several-GenQuantRelnFromType" ) );
    $str64$7_5_2 = makeString( "7.5.2" );
    $const65$no_GenQuantRelnFrom = constant_handles.reader_make_constant_shell( makeString( "no-GenQuantRelnFrom" ) );
    $str66$9_1_5 = makeString( "9.1.5" );
    $const67$correspondingGenQuant = constant_handles.reader_make_constant_shell( makeString( "correspondingGenQuant" ) );
    $list68 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Plural-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Mass-NLAttr" ) ) );
    $const69$Most_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Most-NLAttr" ) );
    $str70$GenQuant_2_1 = makeString( "GenQuant 2.1" );
    $const71$Many_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Many-NLAttr" ) );
    $str72$GenQuant_2_2 = makeString( "GenQuant 2.2" );
    $const73$Few_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Few-NLAttr" ) );
    $str74$GenQuant_2_3 = makeString( "GenQuant 2.3" );
    $const75$Several_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Several-NLAttr" ) );
    $str76$GenQuant_2_4 = makeString( "GenQuant 2.4" );
    $str77$GenQuant_3_1 = makeString( "GenQuant 3.1" );
    $str78$GenQuant_3_2 = makeString( "GenQuant 3.2" );
    $str79$GenQuant_3_3 = makeString( "GenQuant 3.3" );
    $str80$GenQuant_3_4 = makeString( "GenQuant 3.4" );
    $const81$Plural_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Plural-NLAttr" ) );
    $str82$GenQuant_1 = makeString( "GenQuant 1" );
    $const83$RuleMacroPredicate = constant_handles.reader_make_constant_shell( makeString( "RuleMacroPredicate" ) );
    $const84$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const85$Every_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Every-NLAttr" ) );
    $const86$Some_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Some-NLAttr" ) );
    $list87 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) );
    $list88 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Plural-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Mass-NLAttr" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Singular-NLAttr" ) ) );
    $list89 = ConsesLow.list( TWO_INTEGER, ONE_INTEGER );
    $const90$Generic_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Generic-NLAttr" ) );
    $str91$BAREFORM_1 = makeString( "BAREFORM-1" );
    $str92$BAREFORM_2 = makeString( "BAREFORM-2" );
    $str93$BAREFORM_3 = makeString( "BAREFORM-3" );
    $const94$Singular_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) );
    $list95 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER );
    $str96$5_1_or_5_2 = makeString( "5.1 or 5.2" );
    $list97 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Plural-NLAttr" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Mass-NLAttr" ) ) );
    $str98$9_1 = makeString( "9.1" );
    $str99$9_2 = makeString( "9.2" );
    $const100$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $str101$9_5_ = makeString( "9.5+" );
    $list102 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Generic-NLAttr" ) ) );
    $const103$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const104$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $str105$4_2 = makeString( "4.2" );
    $str106$6_1 = makeString( "6.1" );
    $list107 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Mass-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Plural-NLAttr" ) ) );
    $const108$ComparisonWRTPredicate = constant_handles.reader_make_constant_shell( makeString( "ComparisonWRTPredicate" ) );
    $const109$IndividualLevelPredicate = constant_handles.reader_make_constant_shell( makeString( "IndividualLevelPredicate" ) );
    $const110$forAll = constant_handles.reader_make_constant_shell( makeString( "forAll" ) );
    $const111$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $str112$6_4_1 = makeString( "6.4.1" );
    $const113$ScalarInterval = constant_handles.reader_make_constant_shell( makeString( "ScalarInterval" ) );
    $const114$IntegerExtent = constant_handles.reader_make_constant_shell( makeString( "IntegerExtent" ) );
    $const115$num_GenQuant = constant_handles.reader_make_constant_shell( makeString( "num-GenQuant" ) );
    $str116$10_1 = makeString( "10.1" );
    $const117$SubcollectionFunction = constant_handles.reader_make_constant_shell( makeString( "SubcollectionFunction" ) );
    $kw118$1 = makeKeyword( "1" );
    $const119$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const120$CollectionType = constant_handles.reader_make_constant_shell( makeString( "CollectionType" ) );
    $const121$CycNLParsingConstant = constant_handles.reader_make_constant_shell( makeString( "CycNLParsingConstant" ) );
    $list122 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Mass-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) ) );
    $str123$8_1_or_8_2 = makeString( "8.1 or 8.2" );
    $list124 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BareForm-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Every-NLAttr" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Each-NLAttr" ) ) );
    $str125$8_2_5 = makeString( "8.2.5" );
    $list126 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Mass-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Plural-NLAttr" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Singular-NLAttr" ) ) );
    $str127$8_3_1 = makeString( "8.3.1" );
    $sym128$QUANTPROC_3_NL_QUANT_FN_EXPRESSION_ARG_ORDER = makeSymbol( "QUANTPROC-3-NL-QUANT-FN-EXPRESSION-ARG-ORDER" );
    $list129 = ConsesLow.list( new SubLObject[] { ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER
    } );
    $kw130$SWITCH_FIRST = makeKeyword( "SWITCH-FIRST" );
    $kw131$SHIFT_LEFT = makeKeyword( "SHIFT-LEFT" );
    $kw132$SHIFT_RIGHT = makeKeyword( "SHIFT-RIGHT" );
    $list133 = ConsesLow.list( makeKeyword( "SWITCH-FIRST" ), makeKeyword( "SHIFT-LEFT" ), makeKeyword( "SWITCH-FIRST" ), makeKeyword( "SHIFT-RIGHT" ) );
  }
}
/*
 * 
 * Total time: 274 ms
 * 
 */