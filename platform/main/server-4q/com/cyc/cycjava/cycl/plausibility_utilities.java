package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class plausibility_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.plausibility_utilities";
  public static final String myFingerPrint = "fdcdf5fa1b65e7c935ee1303afca672a75bf0e9d0822b724f48c16063430f7ee";
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 943L)
  private static SubLSymbol $default_plausibility_check_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1021L)
  private static SubLSymbol $implausibility_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1704L)
  private static SubLSymbol $debug_implausibilityP$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1756L)
  private static SubLSymbol $debug_implausibility_wf_checksP$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1817L)
  private static SubLSymbol $implausibility_override_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1881L)
  private static SubLSymbol $implausibility_stats_table$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1937L)
  private static SubLSymbol $default_plausibility_percent_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2002L)
  private static SubLSymbol $plausibility_factor_completely_implausible$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2075L)
  private static SubLSymbol $plausibility_factor_non_wff$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2216L)
  private static SubLSymbol $plausibility_factor_type_violation$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2352L)
  private static SubLSymbol $plausibility_factor_arg_violation$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2501L)
  private static SubLSymbol $plausibility_factor_arg_disjointness$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2638L)
  private static SubLSymbol $plausibility_factor_not_isa_or_genls$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2781L)
  private static SubLSymbol $plausibility_factor_inter_sentential_contradiction$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2905L)
  private static SubLSymbol $plausibility_factor_implied_arg_restriction$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3193L)
  private static SubLSymbol $plausibility_factor_no_type_restriction$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3354L)
  private static SubLSymbol $plausibility_factor_typical_volume_violation$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3557L)
  private static SubLSymbol $plausibility_factor_esoteric_term$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3685L)
  private static SubLSymbol $plausibility_factor_splitting_hairs_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3833L)
  private static SubLSymbol $plausibility_factor_completely_plausible$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3905L)
  private static SubLSymbol $default_sentence_plausibility_score_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 43308L)
  private static SubLSymbol $typical_volume_applicable_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 43399L)
  private static SubLSymbol $typical_volume_applicable_pred_inverses$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 49624L)
  private static SubLSymbol $tweak_implausibility_type_restrictions_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50058L)
  private static SubLSymbol $implied_argn_type_requirements_for_pred_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50569L)
  private static SubLSymbol $implied_argn_type_restrictions_for_pred_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53486L)
  private static SubLSymbol $tva_check_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53651L)
  private static SubLSymbol $implausible_admitted_argumentP_caching_state$;
  private static final SubLObject $const0$PlausibilityQueryMt;
  private static final SubLList $list1;
  private static final SubLFloat $float2$0_5;
  private static final SubLFloat $float3$0_01;
  private static final SubLFloat $float4$0_02;
  private static final SubLFloat $float5$0_03;
  private static final SubLFloat $float6$0_04;
  private static final SubLFloat $float7$0_05;
  private static final SubLFloat $float8$0_055;
  private static final SubLFloat $float9$0_06;
  private static final SubLFloat $float10$0_07;
  private static final SubLFloat $float11$0_08;
  private static final SubLFloat $float12$0_09;
  private static final SubLFloat $float13$0_1;
  private static final SubLSymbol $kw14$JUSTIFY_;
  private static final SubLInteger $int15$100;
  private static final SubLSymbol $kw16$MAX_TIME;
  private static final SubLSymbol $kw17$PERCENT_CUTOFF;
  private static final SubLSymbol $kw18$CLEAR_CACHES_;
  private static final SubLSymbol $kw19$SUPPRESS_PLAUSIBLE_NART_;
  private static final SubLSymbol $sym20$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $kw21$GATHER_STATS_;
  private static final SubLSymbol $kw22$TIMED_OUT_;
  private static final SubLSymbol $kw23$IMPLAUSIBLE_;
  private static final SubLSymbol $kw24$PLAUSIBLE_;
  private static final SubLString $str25$Bad_justification_;
  private static final SubLSymbol $kw26$PERCENT_CLIPPING_;
  private static final SubLSymbol $kw27$RETURN_BOOLEAN_;
  private static final SubLSymbol $kw28$EAGER;
  private static final SubLObject $const29$equalSymbols;
  private static final SubLObject $const30$equals;
  private static final SubLSymbol $kw31$FORCE_GENLS_TRUTH_CHECK_;
  private static final SubLObject $const32$genls;
  private static final SubLList $list33;
  private static final SubLObject $const34$isa;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$IGNORE;
  private static final SubLObject $const37$admittedArgument;
  private static final SubLObject $const38$False;
  private static final SubLSymbol $kw39$OPAQUE;
  private static final SubLObject $const40$wffViolation;
  private static final SubLString $str41$Sentence_contains_contradictory_c;
  private static final SubLSymbol $kw42$LAZY;
  private static final SubLSymbol $kw43$FROM;
  private static final SubLSymbol $kw44$RELATION_DIRECTION;
  private static final SubLSymbol $kw45$COL_ARG;
  private static final SubLList $list46;
  private static final SubLSymbol $kw47$ARG_ORDER;
  private static final SubLSymbol $kw48$TYPE_COL_PRED;
  private static final SubLList $list49;
  private static final SubLObject $const50$CollectionIntersection2Fn;
  private static final SubLList $list51;
  private static final SubLObject $const52$CollectionUnionFn;
  private static final SubLSymbol $sym53$POSSIBLY_FIND_NART;
  private static final SubLSymbol $sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE;
  private static final SubLObject $const55$SubcollectionOfWithRelationToType;
  private static final SubLList $list56;
  private static final SubLObject $const57$SubcollectionOfWithRelationFromTy;
  private static final SubLList $list58;
  private static final SubLObject $const59$SubcollectionOfWithoutRelationToT;
  private static final SubLList $list60;
  private static final SubLObject $const61$SubcollectionOfWithoutRelationFro;
  private static final SubLList $list62;
  private static final SubLObject $const63$SitTypeSpecWithTypeRestrictionOnR;
  private static final SubLList $list64;
  private static final SubLObject $const65$SubcollectionOfWithRelationToFn;
  private static final SubLList $list66;
  private static final SubLObject $const67$SubcollectionOfWithRelationFromFn;
  private static final SubLList $list68;
  private static final SubLObject $const69$SubcollectionOfWithoutRelationToF;
  private static final SubLList $list70;
  private static final SubLObject $const71$SubcollectionOfWithoutRelationFro;
  private static final SubLList $list72;
  private static final SubLObject $const73$UsingAForFn;
  private static final SubLList $list74;
  private static final SubLObject $const75$ReifiableFunction;
  private static final SubLSymbol $kw76$SUPPRESS_WFF_CHECKS_;
  private static final SubLSymbol $kw77$SUPPRESS_WF_CHECKS_;
  private static final SubLString $str78$__implausible_sentence_wrt_variab;
  private static final SubLString $str79$Variable_types_are_disjoint_;
  private static final SubLSymbol $kw80$SUPPRESS_WFT_CHECKS_;
  private static final SubLSymbol $kw81$WFT_CHECK_TYPE;
  private static final SubLString $str82$__implausible_term_wrt_wft___S__;
  private static final SubLList $list83;
  private static final SubLSymbol $kw84$WFF_CHECK_TYPE;
  private static final SubLString $str85$__implausible_sentence_wrt_wff___;
  private static final SubLObject $const86$not;
  private static final SubLList $list87;
  private static final SubLObject $const88$quotedIsa;
  private static final SubLList $list89;
  private static final SubLObject $const90$Collection;
  private static final SubLList $list91;
  private static final SubLObject $const92$argIsa;
  private static final SubLObject $const93$disjointWith;
  private static final SubLObject $const94$AnytimePSC;
  private static final SubLObject $const95$argSometimesIsa;
  private static final SubLObject $const96$unknownSentence;
  private static final SubLSymbol $kw97$MIN_CEILING_COLS;
  private static final SubLObject $const98$genlPreds;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLSymbol $kw103$PRED;
  private static final SubLSymbol $kw104$INVERSE;
  private static final SubLObject $const105$typicallyMoreVoluminousThan;
  private static final SubLSymbol $sym106$CLOSED_;
  private static final SubLSymbol $sym107$ESOTERIC_TERM_;
  private static final SubLList $list108;
  private static final SubLObject $const109$EsotericTerm;
  private static final SubLObject $const110$ExotericTerm;
  private static final SubLSymbol $sym111$CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS;
  private static final SubLSymbol $sym112$CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED;
  private static final SubLSymbol $sym113$CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED;
  private static final SubLSymbol $sym114$CLEAR_TVA_CHECK_CACHED;
  private static final SubLSymbol $sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_;
  private static final SubLSymbol $sym116$CLEAR_DO_TVA_QUERY_TYPE_TYPE;
  private static final SubLSymbol $sym117$CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH;
  private static final SubLString $str118$__tweak_implausibility_type_restr;
  private static final SubLSymbol $sym119$_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS_CACHING_STATE_;
  private static final SubLString $str120$__implied_argn_type_requirements_;
  private static final SubLSymbol $sym121$_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED_CACHING_STATE_;
  private static final SubLString $str122$__implied_argn_type_restrictions_;
  private static final SubLSymbol $sym123$_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED_CACHING_STATE_;
  private static final SubLString $str124$__tva_check_cached___A__;
  private static final SubLSymbol $sym125$_TVA_CHECK_CACHED_CACHING_STATE_;
  private static final SubLString $str126$__implausible_admitted_argument__;
  private static final SubLSymbol $sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_;
  private static final SubLString $str128$__do_tva_query_type_type___A__;
  private static final SubLSymbol $sym129$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_;
  private static final SubLString $str130$__do_tva_query_type_disjoint_with;
  private static final SubLSymbol $sym131$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_;
  private static final SubLSymbol $sym132$TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS;
  private static final SubLInteger $int133$4096;
  private static final SubLSymbol $sym134$IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED;
  private static final SubLObject $const135$relationNotExistsExists;
  private static final SubLSymbol $sym136$IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED;
  private static final SubLObject $const137$relationAllExists;
  private static final SubLObject $const138$someTypePlaysRoleInSituationType;
  private static final SubLList $list139;
  private static final SubLSymbol $kw140$NONE;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$TVA_CHECK_CACHED;
  private static final SubLSymbol $sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_;
  private static final SubLSymbol $sym144$INTEGERP;
  private static final SubLInteger $int145$8192;
  private static final SubLString $str146$hl_justify_asent_not_legal_to_cal;
  private static final SubLList $list147;
  private static final SubLSymbol $kw148$CONDITIONAL_SENTENCE_;
  private static final SubLString $str149$Could_not_find_hl_support_for__S_;

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3983L)
  public static SubLObject sentence_plausibility_factor(final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = $default_plausibility_check_mt$.getDynamicValue();
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    v_properties = list_utilities.merge_plist( $default_sentence_plausibility_score_properties$.getDynamicValue( thread ), v_properties );
    return implausible_sentenceP( sentence, mt, v_properties, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 4365L)
  public static SubLObject why_sentence_plausibility_factor(final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = $default_plausibility_check_mt$.getDynamicValue();
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    v_properties = list_utilities.merge_plist( $default_sentence_plausibility_score_properties$.getDynamicValue( thread ), v_properties );
    v_properties = conses_high.putf( v_properties, $kw14$JUSTIFY_, T );
    return implausible_sentenceP( sentence, mt, v_properties, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 4808L)
  public static SubLObject sentence_plausibility_score(final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = $default_plausibility_check_mt$.getDynamicValue();
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    v_properties = list_utilities.merge_plist( $default_sentence_plausibility_score_properties$.getDynamicValue( thread ), v_properties );
    thread.resetMultipleValues();
    final SubLObject plausibility_factor = implausible_sentenceP( sentence, mt, v_properties, UNPROVIDED );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( Numbers.floor( Numbers.multiply( $int15$100, plausibility_factor ), UNPROVIDED ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 5323L)
  public static SubLObject why_sentence_plausibility_score(final SubLObject sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = $default_plausibility_check_mt$.getDynamicValue();
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    v_properties = list_utilities.merge_plist( $default_sentence_plausibility_score_properties$.getDynamicValue( thread ), v_properties );
    v_properties = conses_high.putf( v_properties, $kw14$JUSTIFY_, T );
    thread.resetMultipleValues();
    final SubLObject plausibility_factor = implausible_sentenceP( sentence, mt, v_properties, UNPROVIDED );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( Numbers.floor( Numbers.multiply( $int15$100, plausibility_factor ), UNPROVIDED ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 5899L)
  public static SubLObject implausible_sentenceP(final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = $default_plausibility_check_mt$.getDynamicValue();
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject justifyP = get_implausibility_property( $kw14$JUSTIFY_, v_properties, UNPROVIDED );
    final SubLObject max_time = get_implausibility_property( $kw16$MAX_TIME, v_properties, UNPROVIDED );
    final SubLObject percent_cutoff = get_implausibility_property( $kw17$PERCENT_CUTOFF, v_properties, $default_plausibility_percent_cutoff$.getDynamicValue( thread ) );
    if( v_properties == T )
    {
      v_properties = NIL;
    }
    if( NIL != get_implausibility_property( $kw18$CLEAR_CACHES_, v_properties, UNPROVIDED ) )
    {
      clear_plausibility_caches();
    }
    if( NIL != $debug_implausibilityP$.getDynamicValue( thread ) )
    {
      v_properties = conses_high.putf( v_properties, $kw14$JUSTIFY_, T );
    }
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    SubLObject timed_outP = NIL;
    final SubLObject start_time = Time.get_internal_real_time();
    SubLObject actual_time = NIL;
    final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
    try
    {
      thread.throwStack.push( tag );
      final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
      try
      {
        subl_macro_promotions.$within_with_timeout$.bind( T, thread );
        SubLObject timer = NIL;
        try
        {
          final SubLObject _prev_bind_0_$1 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
            timer = subl_macro_promotions.with_timeout_start_timer( max_time, tag );
            final SubLObject _prev_bind_0_$2 = sdc.$ignoring_sdcP$.currentBinding( thread );
            try
            {
              sdc.$ignoring_sdcP$.bind( T, thread );
              final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
              final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, EIGHT_INTEGER ), thread );
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding( thread );
                try
                {
                  memoization_state.$memoization_state$.bind( local_state, thread );
                  final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                  try
                  {
                    thread.resetMultipleValues();
                    final SubLObject plausibility_factor_$5 = implausible_sentenceP_recursive( sentence, mt, justifyP, v_properties, depth );
                    final SubLObject justification_$6 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    plausibility_factor = plausibility_factor_$5;
                    justification = justification_$6;
                    if( NIL == plausibility_factor && NIL == get_implausibility_property( $kw19$SUPPRESS_PLAUSIBLE_NART_, v_properties, UNPROVIDED ) && !percent_cutoff.numLE( $plausibility_factor_splitting_hairs_cutoff$
                        .getDynamicValue( thread ) ) )
                    {
                      final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$8 = mt_relevance_macros.$mt$.currentBinding( thread );
                      try
                      {
                        mt_relevance_macros.$relevant_mt_function$.bind( $sym20$RELEVANT_MT_IS_GENL_MT, thread );
                        mt_relevance_macros.$mt$.bind( mt, thread );
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$6 = plausible_narts.plausibility_of_sentence( sentence, justifyP, mt );
                        final SubLObject justification_$7 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$6;
                        justification = justification_$7;
                      }
                      finally
                      {
                        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$8, thread );
                        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$5, thread );
                      }
                      if( plausibility_factor.isNumber() && plausibility_factor.numLE( $plausibility_factor_splitting_hairs_cutoff$.getDynamicValue( thread ) ) )
                      {
                        plausibility_factor = Numbers.add( $float3$0_01, $plausibility_factor_splitting_hairs_cutoff$.getDynamicValue( thread ) );
                      }
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                    }
                  }
                }
                finally
                {
                  memoization_state.$memoization_state$.rebind( _prev_bind_0_$4, thread );
                }
              }
              finally
              {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$3, thread );
              }
            }
            finally
            {
              sdc.$ignoring_sdcP$.rebind( _prev_bind_0_$2, thread );
            }
          }
          finally
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$1, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            subl_macro_promotions.with_timeout_stop_timer( timer );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
          }
        }
      }
      finally
      {
        subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == plausibility_factor )
    {
      plausibility_factor = $plausibility_factor_completely_plausible$.getDynamicValue( thread );
    }
    actual_time = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds( numeric_date_utilities.elapsed_internal_real_time( start_time, Time.get_internal_real_time() ) );
    if( NIL != get_implausibility_property( $kw21$GATHER_STATS_, v_properties, UNPROVIDED ) && $implausibility_stats_table$.getDynamicValue( thread ).isHashtable() )
    {
      if( NIL != timed_outP || ( max_time.isNumber() && actual_time.isNumber() && actual_time.numG( max_time ) ) )
      {
        hash_table_utilities.cinc_hash( $kw22$TIMED_OUT_, $implausibility_stats_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      else if( plausibility_factor.numL( percent_cutoff ) )
      {
        hash_table_utilities.cinc_hash( $kw23$IMPLAUSIBLE_, $implausibility_stats_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      else
      {
        hash_table_utilities.cinc_hash( $kw24$PLAUSIBLE_, $implausibility_stats_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
    }
    if( NIL != $debug_implausibilityP$.getDynamicValue( thread ) && NIL == arguments.hl_justification_p( justification ) )
    {
      format_nil.print_one_per_line( justification, UNPROVIDED );
      Errors.sublisp_break( $str25$Bad_justification_, EMPTY_SUBL_OBJECT_ARRAY );
    }
    if( NIL != get_implausibility_property( $kw26$PERCENT_CLIPPING_, v_properties, UNPROVIDED ) && percent_cutoff.isNumber() && plausibility_factor.isNumber() && plausibility_factor.numLE( percent_cutoff ) )
    {
      plausibility_factor = $plausibility_factor_completely_implausible$.getDynamicValue( thread );
    }
    if( NIL != get_implausibility_property( $kw27$RETURN_BOOLEAN_, v_properties, UNPROVIDED ) && plausibility_factor.isNumber() )
    {
      plausibility_factor = Numbers.numL( plausibility_factor, percent_cutoff );
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 9671L)
  public static SubLObject implausible_nautP(final SubLObject naut, SubLObject mt, SubLObject v_properties, SubLObject depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = $default_plausibility_check_mt$.getDynamicValue();
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    return implausible_sentenceP( naut, mt, v_properties, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 9838L)
  public static SubLObject get_implausibility_property(final SubLObject property, final SubLObject v_properties, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = v_default;
    if( T == v_properties )
    {
      return ( property == $kw14$JUSTIFY_ ) ? T : v_default;
    }
    if( NIL != list_utilities.property_list_p( v_properties ) )
    {
      result = conses_high.getf( v_properties, property, result );
    }
    if( NIL != list_utilities.property_list_p( $implausibility_override_properties$.getDynamicValue( thread ) ) )
    {
      result = conses_high.getf( $implausibility_override_properties$.getDynamicValue( thread ), property, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 10387L)
  public static SubLObject implausible_sentenceP_recursive(final SubLObject sentence, final SubLObject mt, final SubLObject justifyP, final SubLObject v_properties, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cycl_grammar.cycl_nat_p( sentence ) )
    {
      return implausible_nautP_recursive( sentence, mt, justifyP, v_properties, depth );
    }
    if( NIL == el_utilities.possibly_sentence_p( sentence ) )
    {
      return Values.values( NIL, NIL );
    }
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL == plausibility_factor )
    {
      thread.resetMultipleValues();
      final SubLObject plausibility_factor_$13 = implausible_sentence_wrt_wff( sentence, mt, justifyP, $kw28$EAGER, v_properties );
      final SubLObject justification_$14 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      plausibility_factor = plausibility_factor_$13;
      justification = justification_$14;
    }
    if( NIL == plausibility_factor )
    {
      final SubLObject depth_increment = ( NIL != el_utilities.el_formula_with_operator_p( sentence, $const29$equalSymbols ) || NIL != el_utilities.el_formula_with_operator_p( sentence, $const30$equals )
          || NIL != el_utilities.el_conjunction_p( sentence ) ) ? ZERO_INTEGER : ONE_INTEGER;
      if( NIL == plausibility_factor )
      {
        SubLObject csome_list_var = sentence;
        SubLObject arg = NIL;
        arg = csome_list_var.first();
        while ( NIL == plausibility_factor && NIL != csome_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject plausibility_factor_$14 = implausible_sentenceP_recursive( arg, mt, justifyP, v_properties, Numbers.add( depth, depth_increment ) );
          final SubLObject justification_$15 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          plausibility_factor = plausibility_factor_$14;
          justification = justification_$15;
          csome_list_var = csome_list_var.rest();
          arg = csome_list_var.first();
        }
      }
    }
    if( NIL != get_implausibility_property( $kw31$FORCE_GENLS_TRUTH_CHECK_, v_properties, UNPROVIDED ) && NIL == plausibility_factor && NIL != el_utilities.el_formula_with_operator_p( sentence, $const32$genls ) )
    {
      SubLObject v_genls = NIL;
      SubLObject col1 = NIL;
      SubLObject col2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( sentence, sentence, $list33 );
      v_genls = sentence.first();
      SubLObject current = sentence.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, sentence, $list33 );
      col1 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, sentence, $list33 );
      col2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        thread.resetMultipleValues();
        final SubLObject plausibility_factor_$15 = implausible_genlsP( col1, col2, mt, justifyP, depth );
        final SubLObject justification_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        plausibility_factor = plausibility_factor_$15;
        justification = justification_$16;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( sentence, $list33 );
      }
    }
    if( NIL == plausibility_factor && NIL != el_utilities.el_formula_with_operator_p( sentence, $const34$isa ) )
    {
      SubLObject v_isa = NIL;
      SubLObject inst = NIL;
      SubLObject col3 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( sentence, sentence, $list35 );
      v_isa = sentence.first();
      SubLObject current = sentence.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, sentence, $list35 );
      inst = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, sentence, $list35 );
      col3 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        thread.resetMultipleValues();
        final SubLObject plausibility_factor_$16 = implausible_isaP( inst, col3, mt, justifyP, depth );
        final SubLObject justification_$17 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        plausibility_factor = plausibility_factor_$16;
        justification = justification_$17;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( sentence, $list35 );
      }
    }
    if( NIL == plausibility_factor )
    {
      SubLObject predicate = cycl_utilities.formula_operator( sentence );
      predicate = possibly_find_nart( predicate );
      SubLObject argnum = ZERO_INTEGER;
      SubLObject args = cycl_utilities.formula_args( sentence, $kw36$IGNORE );
      SubLObject rest;
      SubLObject arg2;
      for( rest = NIL, rest = args; NIL == plausibility_factor && NIL != rest; rest = rest.rest() )
      {
        arg2 = rest.first();
        argnum = Numbers.add( argnum, ONE_INTEGER );
        if( NIL == implausible_admitted_argumentP( arg2, argnum, predicate, mt ) )
        {
          plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue( thread );
          if( NIL != justifyP )
          {
            justification = ConsesLow.append( justification, hl_justify_asent_fast( el_utilities.make_negation( el_utilities.make_ternary_formula( $const37$admittedArgument, arg2, argnum, predicate ) ), mt ) );
          }
        }
      }
      argnum = ZERO_INTEGER;
      args = cycl_utilities.formula_args( sentence, $kw36$IGNORE );
      for( rest = NIL, rest = args; NIL == plausibility_factor && NIL != rest; rest = rest.rest() )
      {
        arg2 = rest.first();
        argnum = Numbers.add( argnum, ONE_INTEGER );
        if( NIL == implausible_admitted_argument_to_formulaP( arg2, argnum, predicate, sentence, mt ) )
        {
          plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue( thread );
          if( NIL != justifyP )
          {
            justification = ConsesLow.append( justification, hl_justify_asent_fast( el_utilities.make_negation( el_utilities.make_ternary_formula( $const37$admittedArgument, arg2, argnum, predicate ) ), mt ) );
          }
        }
      }
    }
    final SubLObject _prev_bind_0 = czer_vars.$simplify_contradictionsP$.currentBinding( thread );
    try
    {
      czer_vars.$simplify_contradictionsP$.bind( T, thread );
      final SubLObject simplification = simplifier.fast_simplify_cycl_sentence( sentence, mt, UNPROVIDED );
      if( $const38$False.eql( simplification ) )
      {
        plausibility_factor = $plausibility_factor_inter_sentential_contradiction$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          justification = ConsesLow.list( arguments.make_hl_support( $kw39$OPAQUE, el_utilities.make_binary_formula( $const40$wffViolation, sentence, $str41$Sentence_contains_contradictory_c ), UNPROVIDED,
              UNPROVIDED ) );
        }
      }
    }
    finally
    {
      czer_vars.$simplify_contradictionsP$.rebind( _prev_bind_0, thread );
    }
    if( NIL == plausibility_factor )
    {
      thread.resetMultipleValues();
      final SubLObject plausibility_factor_$17 = implausible_sentence_wrt_wff( sentence, mt, justifyP, $kw42$LAZY, v_properties );
      final SubLObject justification_$18 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      plausibility_factor = plausibility_factor_$17;
      justification = justification_$18;
    }
    if( NIL == plausibility_factor )
    {
      thread.resetMultipleValues();
      final SubLObject plausibility_factor_$18 = implausible_sentence_wrt_variable_argumentsP( sentence, mt, justifyP, v_properties );
      final SubLObject justification_$19 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      plausibility_factor = plausibility_factor_$18;
      justification = justification_$19;
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 14056L)
  public static SubLObject implausible_nautP_recursive(final SubLObject v_object, final SubLObject mt, final SubLObject justifyP, final SubLObject v_properties, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == narts_high.naut_p( v_object ) )
    {
      return Values.values( NIL, NIL );
    }
    final SubLObject functor = cycl_utilities.naut_functor( v_object );
    final SubLObject functor_categories = categorize_subcollection_predicate( functor );
    final SubLObject argnum = ( $kw43$FROM == conses_high.getf( functor_categories, $kw44$RELATION_DIRECTION, UNPROVIDED ) ) ? ONE_INTEGER : TWO_INTEGER;
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL == plausibility_factor )
    {
      thread.resetMultipleValues();
      final SubLObject plausibility_factor_$25 = implausible_term_wrt_wft( v_object, mt, justifyP, $kw28$EAGER, v_properties );
      final SubLObject justification_$26 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      plausibility_factor = plausibility_factor_$25;
      justification = justification_$26;
    }
    if( NIL == plausibility_factor )
    {
      if( T == conses_high.getf( functor_categories, $kw45$COL_ARG, UNPROVIDED ) )
      {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.naut_args( v_object, UNPROVIDED );
        SubLObject col_arg = NIL;
        SubLObject pred = NIL;
        SubLObject type = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
        col_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
        type = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( conses_high.getf( functor_categories, $kw47$ARG_ORDER, UNPROVIDED ) == $kw48$TYPE_COL_PRED )
          {
            final SubLObject arg1 = col_arg;
            final SubLObject arg2 = pred;
            final SubLObject arg3 = type;
            col_arg = arg2;
            type = arg1;
            pred = arg3;
          }
          col_arg = possibly_find_nart( col_arg );
          pred = possibly_find_nart( pred );
          type = possibly_find_nart( type );
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$26 = implausible_typeP( col_arg, mt, justifyP );
            final SubLObject justification_$27 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$26;
            justification = justification_$27;
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$27 = implausible_typeP( type, mt, justifyP );
            final SubLObject justification_$28 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$27;
            justification = justification_$28;
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$28 = implausible_col_wrt_arg_isa_constraintP( pred, misc_utilities.other_binary_arg( argnum ), col_arg, mt, justifyP );
            final SubLObject justification_$29 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$28;
            justification = justification_$29;
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$29 = implausible_col_wrt_arg_isa_constraintP( pred, argnum, type, mt, justifyP );
            final SubLObject justification_$30 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$29;
            justification = justification_$30;
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$30 = implausible_col_wrt_arg_sometimes_isa_constraintP( pred, argnum, type, mt, justifyP );
            final SubLObject justification_$31 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$30;
            justification = justification_$31;
          }
          if( NIL == plausibility_factor && NIL == plausibility_factor )
          {
            SubLObject csome_list_var = possible_naut_genls( col_arg );
            SubLObject col = NIL;
            col = csome_list_var.first();
            while ( NIL == plausibility_factor && NIL != csome_list_var)
            {
              if( NIL == plausibility_factor )
              {
                thread.resetMultipleValues();
                final SubLObject plausibility_factor_$31 = implausible_col_wrt_implied_argn_type_requirements_for_predP( pred, argnum, col, type, mt, justifyP );
                final SubLObject justification_$32 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                plausibility_factor = plausibility_factor_$31;
                justification = justification_$32;
              }
              if( NIL == plausibility_factor )
              {
                thread.resetMultipleValues();
                final SubLObject plausibility_factor_$32 = implausible_col_wrt_implied_argn_type_restrictions_for_predP( pred, argnum, col, type, mt, justifyP );
                final SubLObject justification_$33 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                plausibility_factor = plausibility_factor_$32;
                justification = justification_$33;
              }
              csome_list_var = csome_list_var.rest();
              col = csome_list_var.first();
            }
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$33 = implausible_col_wrt_typical_volumeP( pred, argnum, col_arg, type, mt, justifyP );
            final SubLObject justification_$34 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$33;
            justification = justification_$34;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list46 );
        }
      }
      else if( NIL != functor_categories && NIL == conses_high.getf( functor_categories, $kw45$COL_ARG, UNPROVIDED ) )
      {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.naut_args( v_object, UNPROVIDED );
        SubLObject col_arg = NIL;
        SubLObject pred = NIL;
        SubLObject thing = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
        col_arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
        thing = current.first();
        current = current.rest();
        if( NIL == current )
        {
          col_arg = possibly_find_nart( col_arg );
          pred = possibly_find_nart( pred );
          thing = possibly_find_nart( thing );
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$34 = implausible_typeP( col_arg, mt, justifyP );
            final SubLObject justification_$35 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$34;
            justification = justification_$35;
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$35 = implausible_col_wrt_arg_isa_constraintP( pred, misc_utilities.other_binary_arg( argnum ), col_arg, mt, justifyP );
            final SubLObject justification_$36 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$35;
            justification = justification_$36;
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$36 = implausible_thing_wrt_arg_isa_constraintP( pred, argnum, thing, mt, justifyP );
            final SubLObject justification_$37 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$36;
            justification = justification_$37;
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$37 = implausible_thing_wrt_arg_sometimes_isa_constraintP( pred, argnum, thing, mt, justifyP );
            final SubLObject justification_$38 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$37;
            justification = justification_$38;
          }
          if( NIL == plausibility_factor )
          {
            final SubLObject cols = possible_naut_genls( col_arg );
            if( NIL == plausibility_factor )
            {
              SubLObject csome_list_var2 = cols;
              SubLObject col2 = NIL;
              col2 = csome_list_var2.first();
              while ( NIL == plausibility_factor && NIL != csome_list_var2)
              {
                if( NIL == plausibility_factor )
                {
                  thread.resetMultipleValues();
                  final SubLObject plausibility_factor_$38 = implausible_thing_wrt_implied_argn_type_requirements_for_predP( pred, argnum, col2, thing, mt, justifyP );
                  final SubLObject justification_$39 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  plausibility_factor = plausibility_factor_$38;
                  justification = justification_$39;
                }
                if( NIL == plausibility_factor )
                {
                  thread.resetMultipleValues();
                  final SubLObject plausibility_factor_$39 = implausible_thing_wrt_implied_argn_type_restrictions_for_predP( pred, argnum, col2, thing, mt, justifyP );
                  final SubLObject justification_$40 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  plausibility_factor = plausibility_factor_$39;
                  justification = justification_$40;
                }
                csome_list_var2 = csome_list_var2.rest();
                col2 = csome_list_var2.first();
              }
            }
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$40 = implausible_col_wrt_genls_pred_disjointnessP( pred, argnum, col_arg, thing, mt, justifyP );
            final SubLObject justification_$41 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$40;
            justification = justification_$41;
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$41 = implausible_col_wrt_isa_pred_disjointnessP( pred, argnum, col_arg, thing, mt, justifyP );
            final SubLObject justification_$42 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$41;
            justification = justification_$42;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list49 );
        }
      }
      else if( NIL != kb_utilities.kbeq( functor, $const50$CollectionIntersection2Fn ) )
      {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.naut_args( v_object, UNPROVIDED );
        SubLObject col3 = NIL;
        SubLObject col4 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
        col3 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
        col4 = current.first();
        current = current.rest();
        if( NIL == current )
        {
          col3 = possibly_find_nart( col3 );
          col4 = possibly_find_nart( col4 );
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$42 = implausible_typeP( col3, mt, justifyP );
            final SubLObject justification_$43 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$42;
            justification = justification_$43;
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$43 = implausible_typeP( col4, mt, justifyP );
            final SubLObject justification_$44 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$43;
            justification = justification_$44;
          }
          if( NIL == plausibility_factor )
          {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$44 = implausible_intersection_of_two_colsP( col3, col4, mt, justifyP );
            final SubLObject justification_$45 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$44;
            justification = justification_$45;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list51 );
        }
      }
      else if( NIL != kb_utilities.kbeq( functor, $const52$CollectionUnionFn ) )
      {
        SubLObject cols2 = el_utilities.el_set_items( cycl_utilities.naut_arg1( v_object, UNPROVIDED ) );
        cols2 = Mapping.mapcar( $sym53$POSSIBLY_FIND_NART, cols2 );
        if( NIL == plausibility_factor )
        {
          thread.resetMultipleValues();
          final SubLObject plausibility_factor_$45 = implausible_union_of_colsP( cols2, mt, justifyP );
          final SubLObject justification_$46 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          plausibility_factor = plausibility_factor_$45;
          justification = justification_$46;
        }
      }
      else
      {
        SubLObject functor_$67 = cycl_utilities.formula_operator( v_object );
        functor_$67 = possibly_find_nart( functor_$67 );
        SubLObject argnum_$68 = ZERO_INTEGER;
        SubLObject args = cycl_utilities.formula_args( v_object, $kw36$IGNORE );
        SubLObject rest;
        SubLObject arg4;
        for( rest = NIL, rest = args; NIL == plausibility_factor && NIL != rest; rest = rest.rest() )
        {
          arg4 = rest.first();
          argnum_$68 = Numbers.add( argnum_$68, ONE_INTEGER );
          if( NIL == implausible_admitted_argumentP( arg4, argnum_$68, functor_$67, mt ) )
          {
            plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue( thread );
            if( NIL != justifyP )
            {
              justification = ConsesLow.append( justification, hl_justify_asent_fast( el_utilities.make_negation( el_utilities.make_ternary_formula( $const37$admittedArgument, arg4, argnum_$68, functor_$67 ) ), mt ) );
            }
          }
        }
        SubLObject argnum_$69 = ZERO_INTEGER;
        args = cycl_utilities.formula_args( v_object, $kw36$IGNORE );
        for( rest = NIL, rest = args; NIL == plausibility_factor && NIL != rest; rest = rest.rest() )
        {
          arg4 = rest.first();
          argnum_$69 = Numbers.add( argnum_$69, ONE_INTEGER );
          if( NIL == implausible_admitted_argument_to_formulaP( arg4, argnum_$69, functor_$67, v_object, mt ) )
          {
            plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue( thread );
            if( NIL != justifyP )
            {
              justification = ConsesLow.append( justification, hl_justify_asent_fast( el_utilities.make_negation( el_utilities.make_ternary_formula( $const37$admittedArgument, arg4, argnum_$69, functor_$67 ) ), mt ) );
            }
          }
        }
      }
    }
    if( NIL == plausibility_factor )
    {
      final SubLObject args2 = cycl_utilities.formula_args( v_object, $kw36$IGNORE );
      SubLObject rest2;
      SubLObject arg5;
      SubLObject sub_plausibility_factor;
      SubLObject sub_justification;
      for( rest2 = NIL, rest2 = args2; NIL == plausibility_factor && NIL != rest2; rest2 = rest2.rest() )
      {
        arg5 = rest2.first();
        thread.resetMultipleValues();
        sub_plausibility_factor = implausible_sentenceP_recursive( arg5, mt, justifyP, v_properties, Numbers.add( depth, ONE_INTEGER ) );
        sub_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != sub_plausibility_factor )
        {
          plausibility_factor = sub_plausibility_factor;
          justification = ConsesLow.append( justification, sub_justification );
        }
      }
    }
    if( NIL == plausibility_factor )
    {
      thread.resetMultipleValues();
      final SubLObject plausibility_factor_$46 = implausible_term_wrt_wft( v_object, mt, justifyP, $kw42$LAZY, v_properties );
      final SubLObject justification_$47 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      plausibility_factor = plausibility_factor_$46;
      justification = justification_$47;
    }
    return Values.values( plausibility_factor, list_utilities.remove_duplicates_sorted( justification, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 21218L)
  public static SubLObject categorize_subcollection_predicate_internal(final SubLObject pred)
  {
    return pred.eql( $const55$SubcollectionOfWithRelationToType ) ? $list56
        : ( pred.eql( $const57$SubcollectionOfWithRelationFromTy ) ? $list58
            : ( pred.eql( $const59$SubcollectionOfWithoutRelationToT ) ? $list60
                : ( pred.eql( $const61$SubcollectionOfWithoutRelationFro ) ? $list62
                    : ( pred.eql( $const63$SitTypeSpecWithTypeRestrictionOnR ) ? $list64
                        : ( pred.eql( $const65$SubcollectionOfWithRelationToFn ) ? $list66
                            : ( pred.eql( $const67$SubcollectionOfWithRelationFromFn ) ? $list68
                                : ( pred.eql( $const69$SubcollectionOfWithoutRelationToF ) ? $list70
                                    : ( pred.eql( $const71$SubcollectionOfWithoutRelationFro ) ? $list72 : ( pred.eql( $const73$UsingAForFn ) ? $list74 : NIL ) ) ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 21218L)
  public static SubLObject categorize_subcollection_predicate(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return categorize_subcollection_predicate_internal( pred );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( categorize_subcollection_predicate_internal( pred ) ) );
      memoization_state.caching_state_put( caching_state, pred, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 22747L)
  public static SubLObject possibly_find_nart(final SubLObject v_object)
  {
    final SubLObject possible_nart = ( NIL != el_utilities.possibly_naut_p( v_object ) && NIL != isa.isa_in_any_mtP( cycl_utilities.el_formula_operator( v_object ), $const75$ReifiableFunction ) ) ? narts_high.find_nart(
        v_object ) : NIL;
    return ( NIL != possible_nart ) ? possible_nart : v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 23016L)
  public static SubLObject possible_naut_genls(final SubLObject col)
  {
    return ( NIL != narts_high.naut_p( col ) ) ? genls.min_cols( genls.naut_genls( col, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) : ConsesLow.list( col );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 23136L)
  public static SubLObject implausible_sentence_wrt_variable_argumentsP(final SubLObject sentence, final SubLObject mt, final SubLObject justifyP, final SubLObject v_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL == get_implausibility_property( $kw76$SUPPRESS_WFF_CHECKS_, v_properties, UNPROVIDED ) && NIL == get_implausibility_property( $kw77$SUPPRESS_WF_CHECKS_, v_properties, UNPROVIDED ) && NIL == cyclifier
        .variable_arguments_okP( sentence, mt ) )
    {
      plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue( thread );
      if( NIL != $debug_implausibility_wf_checksP$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str78$__implausible_sentence_wrt_variab, sentence );
      }
      if( NIL != justifyP )
      {
        justification = ConsesLow.list( arguments.make_hl_support( $kw39$OPAQUE, el_utilities.make_binary_formula( $const40$wffViolation, sentence, $str79$Variable_types_are_disjoint_ ), UNPROVIDED, UNPROVIDED ) );
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 24038L)
  public static SubLObject implausible_term_wrt_wft(final SubLObject v_term, final SubLObject mt, final SubLObject justifyP, final SubLObject check_type, final SubLObject v_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL == get_implausibility_property( $kw80$SUPPRESS_WFT_CHECKS_, v_properties, UNPROVIDED ) && NIL == get_implausibility_property( $kw77$SUPPRESS_WF_CHECKS_, v_properties, UNPROVIDED ) && check_type.eql(
        get_implausibility_property( $kw81$WFT_CHECK_TYPE, v_properties, UNPROVIDED ) ) )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_check_not_sdcP$.currentBinding( thread );
      try
      {
        at_vars.$at_check_not_sdcP$.bind( NIL, thread );
        if( NIL == wff.el_wft_fast_in_mtP( v_term, mt ) )
        {
          plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue( thread );
          if( NIL != $debug_implausibility_wf_checksP$.getDynamicValue( thread ) )
          {
            PrintLow.format( T, $str82$__implausible_term_wrt_wft___S__, v_term );
          }
          if( NIL != justifyP )
          {
            final SubLObject string = wff.explanation_of_why_not_wft( v_term, mt, $list83 );
            justification = ConsesLow.list( arguments.make_hl_support( $kw39$OPAQUE, el_utilities.make_binary_formula( $const40$wffViolation, v_term, string ), UNPROVIDED, UNPROVIDED ) );
          }
        }
      }
      finally
      {
        at_vars.$at_check_not_sdcP$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 25051L)
  public static SubLObject implausible_sentence_wrt_wff(final SubLObject sentence, final SubLObject mt, final SubLObject justifyP, final SubLObject check_type, final SubLObject v_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL == get_implausibility_property( $kw76$SUPPRESS_WFF_CHECKS_, v_properties, UNPROVIDED ) && NIL == get_implausibility_property( $kw77$SUPPRESS_WF_CHECKS_, v_properties, UNPROVIDED ) && check_type.eql(
        get_implausibility_property( $kw84$WFF_CHECK_TYPE, v_properties, UNPROVIDED ) ) )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_check_not_sdcP$.currentBinding( thread );
      try
      {
        at_vars.$at_check_not_sdcP$.bind( NIL, thread );
        if( NIL == wff.el_lenient_wff_assertibleP( sentence, mt, UNPROVIDED ) )
        {
          plausibility_factor = $plausibility_factor_non_wff$.getDynamicValue( thread );
          if( NIL != $debug_implausibility_wf_checksP$.getDynamicValue( thread ) )
          {
            PrintLow.format( T, $str85$__implausible_sentence_wrt_wff___, sentence );
          }
          if( NIL != justifyP )
          {
            final SubLObject string = wff.explanation_of_why_not_lenient_wff_assert( sentence, mt, $list83 );
            justification = ConsesLow.list( arguments.make_hl_support( $kw39$OPAQUE, el_utilities.make_binary_formula( $const40$wffViolation, sentence, string ), UNPROVIDED, UNPROVIDED ) );
          }
        }
      }
      finally
      {
        at_vars.$at_check_not_sdcP$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 26112L)
  public static SubLObject implausible_genlsP(SubLObject col1, SubLObject col2, final SubLObject mt, final SubLObject justifyP, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( col1, UNPROVIDED ) && NIL != el_utilities.closedP( col2, UNPROVIDED ) )
    {
      col1 = possibly_find_nart( col1 );
      col2 = possibly_find_nart( col2 );
      if( NIL == plausibility_factor )
      {
        thread.resetMultipleValues();
        final SubLObject plausibility_factor_$72 = implausible_typeP( col1, mt, justifyP );
        final SubLObject justification_$73 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        plausibility_factor = plausibility_factor_$72;
        justification = justification_$73;
      }
      if( NIL == plausibility_factor )
      {
        thread.resetMultipleValues();
        final SubLObject plausibility_factor_$73 = implausible_typeP( col2, mt, justifyP );
        final SubLObject justification_$74 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        plausibility_factor = plausibility_factor_$73;
        justification = justification_$74;
      }
      if( NIL == plausibility_factor )
      {
        final SubLObject col1_order = fort_types_interface.collection_order( col1 );
        final SubLObject col2_order = fort_types_interface.collection_order( col2 );
        if( col1_order.isInteger() && col2_order.isInteger() && !col1_order.numE( col2_order ) )
        {
          plausibility_factor = $plausibility_factor_not_isa_or_genls$.getDynamicValue( thread );
          if( NIL != justifyP )
          {
            justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const86$not, ConsesLow.list( $const32$genls, col1, col2 ) ), mt ) );
          }
        }
      }
      if( NIL == plausibility_factor && depth.numE( ZERO_INTEGER ) )
      {
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding( thread );
        try
        {
          sdc.$ignoring_sdcP$.bind( T, thread );
          if( NIL != genls.not_genlP( col1, col2, mt, UNPROVIDED ) )
          {
            plausibility_factor = $plausibility_factor_not_isa_or_genls$.getDynamicValue( thread );
            if( NIL != justifyP )
            {
              justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const86$not, ConsesLow.list( $const32$genls, col1, col2 ) ), mt ) );
            }
          }
        }
        finally
        {
          sdc.$ignoring_sdcP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 27627L)
  public static SubLObject implausible_isaP(SubLObject inst, SubLObject col, final SubLObject mt, final SubLObject justifyP, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( inst, UNPROVIDED ) && NIL != el_utilities.closedP( col, UNPROVIDED ) )
    {
      inst = possibly_find_nart( inst );
      col = possibly_find_nart( col );
      if( NIL == plausibility_factor )
      {
        thread.resetMultipleValues();
        final SubLObject plausibility_factor_$76 = implausible_typeP( col, mt, justifyP );
        final SubLObject justification_$77 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        plausibility_factor = plausibility_factor_$76;
        justification = justification_$77;
      }
      if( NIL == plausibility_factor )
      {
        final SubLObject inst_order = fort_types_interface.collection_order( inst );
        final SubLObject col_order = fort_types_interface.collection_order( col );
        if( inst_order.isInteger() && col_order.isInteger() && !Numbers.add( inst_order, ONE_INTEGER ).numE( col_order ) )
        {
          plausibility_factor = $plausibility_factor_not_isa_or_genls$.getDynamicValue( thread );
          if( NIL != justifyP )
          {
            justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const86$not, ConsesLow.list( $const34$isa, inst, col ) ), mt ) );
          }
        }
      }
      if( NIL == plausibility_factor && NIL != kb_indexing_datastructures.indexed_term_p( inst ) && NIL == plausibility_factor )
      {
        SubLObject csome_list_var = possible_naut_genls( col );
        SubLObject genl = NIL;
        genl = csome_list_var.first();
        while ( NIL == plausibility_factor && NIL != csome_list_var)
        {
          if( NIL != genls.genlP( inst, genl, mt, UNPROVIDED ) )
          {
            plausibility_factor = $plausibility_factor_not_isa_or_genls$.getDynamicValue( thread );
            if( NIL != justifyP )
            {
              justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const32$genls, inst, genl ), mt ) );
            }
          }
          csome_list_var = csome_list_var.rest();
          genl = csome_list_var.first();
        }
      }
      if( NIL == plausibility_factor && depth.numE( ZERO_INTEGER ) && NIL != kb_indexing_datastructures.indexed_term_p( col ) && NIL == isa.isaP( inst, col, mt, UNPROVIDED ) && NIL != isa.not_isaP( inst, col, mt,
          UNPROVIDED ) )
      {
        plausibility_factor = $plausibility_factor_not_isa_or_genls$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const86$not, ConsesLow.list( $const34$isa, inst, col ) ), mt ) );
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 30175L)
  public static SubLObject implausible_typeP(final SubLObject type, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( type, UNPROVIDED ) )
    {
      if( NIL == plausibility_factor && ( NIL != cycl_grammar.cycl_unrepresented_term_p( type ) || NIL != cycl_grammar.cycl_variable_p( type ) ) )
      {
        plausibility_factor = $plausibility_factor_type_violation$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const86$not, ConsesLow.listS( $const34$isa, type, $list87 ) ), mt ) );
        }
      }
      if( NIL == plausibility_factor && NIL != forts.fort_p( type ) && NIL == fort_types_interface.collectionP( type ) )
      {
        plausibility_factor = $plausibility_factor_type_violation$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.listS( $const88$quotedIsa, type, $list89 ), mt ) );
          justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const86$not, ConsesLow.listS( $const34$isa, type, $list87 ) ), mt ) );
        }
      }
      if( NIL == plausibility_factor && NIL != narts_high.naut_p( type ) && NIL == isa.nat_isaP( type, $const90$Collection, UNPROVIDED, UNPROVIDED ) )
      {
        plausibility_factor = $plausibility_factor_type_violation$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.listS( $const88$quotedIsa, type, $list91 ), mt ) );
          justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const86$not, ConsesLow.listS( $const34$isa, type, $list87 ) ), mt ) );
        }
      }
      return Values.values( plausibility_factor, justification );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 31554L)
  public static SubLObject implausible_col_wrt_arg_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject type, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( pred, UNPROVIDED ) && NIL != el_utilities.closedP( type, UNPROVIDED ) )
    {
      final SubLObject type_isa_constraints = kb_accessors.argn_isa( pred, argnum, mt );
      if( NIL != type_isa_constraints && NIL != disjoint_with.any_disjoint_with_anyP_memoized( ConsesLow.list( type ), type_isa_constraints, mt, UNPROVIDED, UNPROVIDED ) )
      {
        plausibility_factor = $plausibility_factor_arg_disjointness$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          SubLObject cdolist_list_var = type_isa_constraints;
          SubLObject type_isa_constraint = NIL;
          type_isa_constraint = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != disjoint_with.disjoint_withP( type, type_isa_constraint, mt, UNPROVIDED ) )
            {
              justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const92$argIsa, pred, argnum, type_isa_constraint ), mt ) );
              justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const93$disjointWith, type, type_isa_constraint ), mt ) );
            }
            cdolist_list_var = cdolist_list_var.rest();
            type_isa_constraint = cdolist_list_var.first();
          }
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 32420L)
  public static SubLObject implausible_col_wrt_arg_sometimes_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject type, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( pred, UNPROVIDED ) && NIL != el_utilities.closedP( type, UNPROVIDED ) )
    {
      final SubLObject type_isa_constraints = kb_accessors.argn_sometimes_isa( pred, argnum, mt );
      final SubLObject anytime_mt = hlmt.replace_time_dimension( mt, $const94$AnytimePSC, UNPROVIDED );
      if( NIL != type_isa_constraints && NIL == genls.all_genlP( type, type_isa_constraints, anytime_mt, UNPROVIDED ) )
      {
        plausibility_factor = $plausibility_factor_arg_violation$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          SubLObject cdolist_list_var = type_isa_constraints;
          SubLObject type_isa_constraint = NIL;
          type_isa_constraint = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL == genls.genlP( type, type_isa_constraint, mt, UNPROVIDED ) )
            {
              justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const95$argSometimesIsa, pred, argnum, type_isa_constraint ), mt ) );
              justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const96$unknownSentence, ConsesLow.list( $const32$genls, type, type_isa_constraint ) ), anytime_mt ) );
            }
            cdolist_list_var = cdolist_list_var.rest();
            type_isa_constraint = cdolist_list_var.first();
          }
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 33409L)
  public static SubLObject implausible_thing_wrt_arg_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject thing, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( pred, UNPROVIDED ) && NIL != el_utilities.closedP( thing, UNPROVIDED ) )
    {
      final SubLObject thing_isa_constraints = kb_accessors.argn_isa( pred, argnum, mt );
      if( NIL != thing_isa_constraints && NIL != ( ( NIL != cycl_grammar.cycl_unrepresented_term_p( thing ) ) ? makeBoolean( NIL == at_defns.quiet_has_any_typeP( thing, thing_isa_constraints, mt ) )
          : disjoint_with.any_disjoint_with_anyP_memoized( isa.isa( thing, mt, UNPROVIDED ), thing_isa_constraints, mt, UNPROVIDED, UNPROVIDED ) ) )
      {
        plausibility_factor = $plausibility_factor_arg_disjointness$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          SubLObject doneP = NIL;
          if( NIL == doneP )
          {
            SubLObject csome_list_var = thing_isa_constraints;
            SubLObject thing_isa_constraint = NIL;
            thing_isa_constraint = csome_list_var.first();
            while ( NIL == doneP && NIL != csome_list_var)
            {
              if( NIL == doneP )
              {
                SubLObject csome_list_var_$78 = isa.isa( thing, mt, UNPROVIDED );
                SubLObject thing_isa = NIL;
                thing_isa = csome_list_var_$78.first();
                while ( NIL == doneP && NIL != csome_list_var_$78)
                {
                  if( NIL != disjoint_with.disjoint_withP( thing_isa, thing_isa_constraint, mt, UNPROVIDED ) )
                  {
                    doneP = T;
                    justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const92$argIsa, pred, argnum, thing_isa_constraint ), mt ) );
                    justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const34$isa, thing, thing_isa ), mt ) );
                    justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const93$disjointWith, thing_isa, thing_isa_constraint ), mt ) );
                  }
                  csome_list_var_$78 = csome_list_var_$78.rest();
                  thing_isa = csome_list_var_$78.first();
                }
              }
              csome_list_var = csome_list_var.rest();
              thing_isa_constraint = csome_list_var.first();
            }
          }
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 34657L)
  public static SubLObject implausible_thing_wrt_arg_sometimes_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject thing, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( pred, UNPROVIDED ) && NIL != el_utilities.closedP( thing, UNPROVIDED ) )
    {
      final SubLObject thing_isa_constraints = kb_accessors.argn_sometimes_isa( pred, argnum, mt );
      final SubLObject anytime_mt = hlmt.replace_time_dimension( mt, $const94$AnytimePSC, UNPROVIDED );
      if( NIL != thing_isa_constraints && NIL != ( ( NIL != cycl_grammar.cycl_unrepresented_term_p( thing ) ) ? makeBoolean( NIL == at_defns.quiet_has_any_typeP( thing, thing_isa_constraints, anytime_mt ) )
          : makeBoolean( NIL == isa.all_isaP( thing, thing_isa_constraints, anytime_mt, UNPROVIDED ) ) ) )
      {
        plausibility_factor = $plausibility_factor_arg_violation$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          SubLObject cdolist_list_var = thing_isa_constraints;
          SubLObject thing_isa_constraint = NIL;
          thing_isa_constraint = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL == isa.isaP( thing, thing_isa_constraint, anytime_mt, UNPROVIDED ) )
            {
              justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const95$argSometimesIsa, pred, argnum, thing_isa_constraint ), mt ) );
              justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const96$unknownSentence, ConsesLow.list( $const34$isa, thing, thing_isa_constraint ) ), anytime_mt ) );
            }
            cdolist_list_var = cdolist_list_var.rest();
            thing_isa_constraint = cdolist_list_var.first();
          }
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 35833L)
  public static SubLObject implausible_col_wrt_implied_argn_type_requirements_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject type, final SubLObject mt,
      final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( pred, UNPROVIDED ) && NIL != el_utilities.closedP( col, UNPROVIDED ) && NIL != el_utilities.closedP( type, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject type_requirements = implied_argn_type_requirements_for_pred( pred, argnum, col, mt, justifyP );
      final SubLObject tr_justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != genls.any_genlP( type, type_requirements, mt, UNPROVIDED ) )
      {
        plausibility_factor = $plausibility_factor_implied_arg_restriction$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          SubLObject type_requirement = NIL;
          SubLObject type_requirement_$79 = NIL;
          SubLObject tr_justification = NIL;
          SubLObject tr_justification_$80 = NIL;
          type_requirement = type_requirements;
          type_requirement_$79 = type_requirement.first();
          tr_justification = tr_justifications;
          tr_justification_$80 = tr_justification.first();
          while ( NIL != tr_justification || NIL != type_requirement)
          {
            if( NIL != genls.genlP( type, type_requirement_$79, mt, UNPROVIDED ) )
            {
              justification = ConsesLow.append( justification, tr_justification_$80 );
              justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const32$genls, type, type_requirement_$79 ), mt ) );
            }
            type_requirement = type_requirement.rest();
            type_requirement_$79 = type_requirement.first();
            tr_justification = tr_justification.rest();
            tr_justification_$80 = tr_justification.first();
          }
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 36724L)
  public static SubLObject implausible_thing_wrt_implied_argn_type_requirements_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject thing, final SubLObject mt,
      final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( pred, UNPROVIDED ) && NIL != el_utilities.closedP( col, UNPROVIDED ) && NIL != el_utilities.closedP( thing, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject type_requirements = implied_argn_type_requirements_for_pred( pred, argnum, col, mt, justifyP );
      final SubLObject tr_justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != isa.any_isaP( thing, type_requirements, mt, UNPROVIDED ) )
      {
        plausibility_factor = $plausibility_factor_implied_arg_restriction$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          SubLObject type_requirement = NIL;
          SubLObject type_requirement_$81 = NIL;
          SubLObject tr_justification = NIL;
          SubLObject tr_justification_$82 = NIL;
          type_requirement = type_requirements;
          type_requirement_$81 = type_requirement.first();
          tr_justification = tr_justifications;
          tr_justification_$82 = tr_justification.first();
          while ( NIL != tr_justification || NIL != type_requirement)
          {
            if( NIL != isa.isaP( thing, type_requirement_$81, mt, UNPROVIDED ) )
            {
              justification = ConsesLow.append( justification, tr_justification_$82 );
              justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const34$isa, thing, type_requirement_$81 ), mt ) );
            }
            type_requirement = type_requirement.rest();
            type_requirement_$81 = type_requirement.first();
            tr_justification = tr_justification.rest();
            tr_justification_$82 = tr_justification.first();
          }
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 37617L)
  public static SubLObject implausible_col_wrt_implied_argn_type_restrictions_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject type, final SubLObject mt,
      final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL == el_utilities.closedP( pred, UNPROVIDED ) || NIL == el_utilities.closedP( col, UNPROVIDED ) || NIL == el_utilities.closedP( type, UNPROVIDED ) )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject type_restrictions = implied_argn_type_restrictions_for_pred( pred, argnum, col, mt, justifyP );
    final SubLObject tr_justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != genls.any_genlP( type, type_restrictions, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL == type_restrictions )
    {
      return NIL;
    }
    if( NIL == plausibility_factor && NIL == genls.any_genlP( type, type_restrictions, mt, UNPROVIDED ) )
    {
      plausibility_factor = $plausibility_factor_implied_arg_restriction$.getDynamicValue( thread );
      if( NIL != justifyP )
      {
        SubLObject cdolist_list_var = type_restrictions;
        SubLObject type_restriction = NIL;
        type_restriction = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const96$unknownSentence, ConsesLow.list( $const32$genls, type, type_restriction ) ), mt ) );
          cdolist_list_var = cdolist_list_var.rest();
          type_restriction = cdolist_list_var.first();
        }
        cdolist_list_var = tr_justifications;
        SubLObject tr_justification = NIL;
        tr_justification = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          justification = ConsesLow.append( justification, tr_justification );
          cdolist_list_var = cdolist_list_var.rest();
          tr_justification = cdolist_list_var.first();
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 40088L)
  public static SubLObject implausible_thing_wrt_implied_argn_type_restrictions_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject thing, final SubLObject mt,
      final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( pred, UNPROVIDED ) && NIL != el_utilities.closedP( col, UNPROVIDED ) && NIL != el_utilities.closedP( thing, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject type_restrictions = implied_argn_type_restrictions_for_pred( pred, argnum, col, mt, justifyP );
      final SubLObject tr_justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != isa.any_isaP( thing, type_restrictions, mt, UNPROVIDED ) )
      {
        return NIL;
      }
      if( NIL == type_restrictions )
      {
        return NIL;
      }
      if( NIL == plausibility_factor )
      {
        thread.resetMultipleValues();
        final SubLObject tweaked_type_restrictions = tweak_implausibility_type_restrictions( type_restrictions, mt );
        final SubLObject tweak_method = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != constraint_filters.any_not_isaP( tweaked_type_restrictions, thing, mt ) )
        {
          plausibility_factor = $plausibility_factor_implied_arg_restriction$.getDynamicValue( thread );
          if( NIL != justifyP )
          {
            SubLObject doneP = NIL;
            if( NIL == doneP )
            {
              SubLObject type_restriction = NIL;
              SubLObject type_restriction_$83 = NIL;
              SubLObject tr_justification = NIL;
              SubLObject tr_justification_$84 = NIL;
              type_restriction = tweaked_type_restrictions;
              type_restriction_$83 = type_restriction.first();
              tr_justification = tr_justifications;
              tr_justification_$84 = tr_justification.first();
              while ( NIL == doneP && ( NIL != tr_justification || NIL != type_restriction ))
              {
                if( NIL != isa.not_isaP( thing, type_restriction_$83, mt, UNPROVIDED ) )
                {
                  doneP = T;
                  justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const86$not, ConsesLow.list( $const34$isa, thing, type_restriction_$83 ) ), mt ) );
                  justification = ConsesLow.append( justification, tr_justification_$84 );
                  if( tweak_method == $kw97$MIN_CEILING_COLS )
                  {
                    SubLObject found_genlsP = NIL;
                    if( NIL == found_genlsP )
                    {
                      SubLObject csome_list_var = type_restrictions;
                      SubLObject type = NIL;
                      type = csome_list_var.first();
                      while ( NIL == found_genlsP && NIL != csome_list_var)
                      {
                        if( NIL != genls.genlsP( type, type_restriction_$83, UNPROVIDED, UNPROVIDED ) )
                        {
                          found_genlsP = T;
                          justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const32$genls, type, type_restriction_$83 ), mt ) );
                        }
                        csome_list_var = csome_list_var.rest();
                        type = csome_list_var.first();
                      }
                    }
                  }
                }
                type_restriction = type_restriction.rest();
                type_restriction_$83 = type_restriction.first();
                tr_justification = tr_justification.rest();
                tr_justification_$84 = tr_justification.first();
              }
            }
          }
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 41819L)
  public static SubLObject implausible_col_wrt_genls_pred_disjointnessP(final SubLObject pred, final SubLObject argnum, final SubLObject col_arg, final SubLObject type, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( pred, UNPROVIDED ) && NIL != el_utilities.closedP( col_arg, UNPROVIDED ) && NIL != el_utilities.closedP( type, UNPROVIDED ) && NIL != forts.fort_p( pred ) )
    {
      final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding( thread );
      try
      {
        sdc.$ignoring_sdcP$.bind( NIL, thread );
        if( NIL != genl_predicates.genl_predP( pred, $const32$genls, mt, UNPROVIDED ) && NIL != disjoint_with.disjoint_withP( col_arg, type, UNPROVIDED, UNPROVIDED ) )
        {
          plausibility_factor = $plausibility_factor_arg_disjointness$.getDynamicValue( thread );
          if( NIL != justifyP )
          {
            justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.listS( $const98$genlPreds, pred, $list99 ), mt ) );
            justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const93$disjointWith, col_arg, type ), mt ) );
          }
        }
      }
      finally
      {
        sdc.$ignoring_sdcP$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 42564L)
  public static SubLObject implausible_col_wrt_isa_pred_disjointnessP(final SubLObject pred, final SubLObject argnum, final SubLObject col_arg, final SubLObject type, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( pred, UNPROVIDED ) && NIL != el_utilities.closedP( col_arg, UNPROVIDED ) && NIL != el_utilities.closedP( type, UNPROVIDED ) && NIL != forts.fort_p( pred ) )
    {
      final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding( thread );
      try
      {
        sdc.$ignoring_sdcP$.bind( NIL, thread );
        if( argnum.eql( TWO_INTEGER ) && NIL != genl_predicates.genl_predP( pred, $const34$isa, mt, UNPROVIDED ) && NIL != disjoint_with.disjoint_withP( col_arg, type, UNPROVIDED, UNPROVIDED ) )
        {
          plausibility_factor = $plausibility_factor_arg_disjointness$.getDynamicValue( thread );
          if( NIL != justifyP )
          {
            justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.listS( $const98$genlPreds, pred, $list100 ), mt ) );
            justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const93$disjointWith, col_arg, type ), mt ) );
          }
        }
      }
      finally
      {
        sdc.$ignoring_sdcP$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 43491L)
  public static SubLObject implausible_col_wrt_typical_volumeP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject type, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( pred, UNPROVIDED ) && NIL != el_utilities.closedP( col, UNPROVIDED ) && NIL != el_utilities.closedP( type, UNPROVIDED ) && NIL != forts.fort_p( pred ) )
    {
      SubLObject arg_order = NIL;
      if( NIL != genl_predicates.any_genl_predP( pred, $typical_volume_applicable_predicates$.getDynamicValue( thread ), mt, UNPROVIDED ) || NIL != genl_predicates.any_genl_inverseP( pred,
          $typical_volume_applicable_pred_inverses$.getDynamicValue( thread ), mt, UNPROVIDED ) )
      {
        arg_order = $kw103$PRED;
      }
      if( NIL != genl_predicates.any_genl_predP( pred, $typical_volume_applicable_pred_inverses$.getDynamicValue( thread ), mt, UNPROVIDED ) || NIL != genl_predicates.any_genl_inverseP( pred,
          $typical_volume_applicable_predicates$.getDynamicValue( thread ), mt, UNPROVIDED ) )
      {
        arg_order = $kw104$INVERSE;
      }
      if( NIL != arg_order )
      {
        final SubLObject cols = possible_naut_genls( type );
        final SubLObject types = possible_naut_genls( col );
        if( NIL == plausibility_factor )
        {
          SubLObject csome_list_var = cols;
          SubLObject this_col = NIL;
          this_col = csome_list_var.first();
          while ( NIL == plausibility_factor && NIL != csome_list_var)
          {
            if( NIL == plausibility_factor )
            {
              SubLObject csome_list_var_$85 = types;
              SubLObject this_type = NIL;
              this_type = csome_list_var_$85.first();
              while ( NIL == plausibility_factor && NIL != csome_list_var_$85)
              {
                final SubLObject tva_sentence = ( ( argnum.eql( ONE_INTEGER ) && arg_order == $kw103$PRED ) || ( argnum.eql( TWO_INTEGER ) && arg_order == $kw104$INVERSE ) ) ? el_utilities.make_binary_formula(
                    $const105$typicallyMoreVoluminousThan, this_type, this_col )
                    : ( ( ( argnum.eql( ONE_INTEGER ) && arg_order == $kw104$INVERSE ) || ( argnum.eql( TWO_INTEGER ) && arg_order == $kw103$PRED ) ) ? el_utilities.make_binary_formula(
                        $const105$typicallyMoreVoluminousThan, this_col, this_type ) : NIL );
                if( NIL != tva_sentence && NIL != tva_check_cached( tva_sentence, mt ) )
                {
                  plausibility_factor = $plausibility_factor_typical_volume_violation$.getDynamicValue( thread );
                  if( NIL != justifyP )
                  {
                    justification = removal_modules_tva_lookup.tva_justify( tva_sentence, mt );
                  }
                }
                csome_list_var_$85 = csome_list_var_$85.rest();
                this_type = csome_list_var_$85.first();
              }
            }
            csome_list_var = csome_list_var.rest();
            this_col = csome_list_var.first();
          }
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 45031L)
  public static SubLObject implausible_intersection_of_two_colsP(final SubLObject col1, final SubLObject col2, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != el_utilities.closedP( col1, UNPROVIDED ) && NIL != el_utilities.closedP( col2, UNPROVIDED ) )
    {
      final SubLObject cols_1 = possible_naut_genls( col1 );
      final SubLObject cols_2 = possible_naut_genls( col2 );
      final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding( thread );
      try
      {
        sdc.$ignoring_sdcP$.bind( NIL, thread );
        if( NIL != disjoint_with.any_disjoint_with_anyP_memoized( cols_1, cols_2, mt, UNPROVIDED, UNPROVIDED ) )
        {
          plausibility_factor = $plausibility_factor_arg_disjointness$.getDynamicValue( thread );
          if( NIL != justifyP )
          {
            final SubLObject doneP = NIL;
            if( NIL == doneP )
            {
              SubLObject csome_list_var = cols_1;
              SubLObject this_col_1 = NIL;
              this_col_1 = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                if( NIL == doneP )
                {
                  SubLObject csome_list_var_$86 = cols_2;
                  SubLObject this_col_2 = NIL;
                  this_col_2 = csome_list_var_$86.first();
                  while ( NIL == doneP && NIL != csome_list_var_$86)
                  {
                    if( NIL != disjoint_with.disjoint_withP( this_col_1, this_col_2, mt, UNPROVIDED ) )
                    {
                      if( NIL == equals.equalsP( col1, this_col_1, UNPROVIDED, UNPROVIDED ) )
                      {
                        justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const32$genls, col1, this_col_1 ), mt ) );
                      }
                      if( NIL == equals.equalsP( col2, this_col_2, UNPROVIDED, UNPROVIDED ) )
                      {
                        justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const32$genls, col2, this_col_2 ), mt ) );
                      }
                      justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const93$disjointWith, this_col_1, this_col_2 ), mt ) );
                    }
                    csome_list_var_$86 = csome_list_var_$86.rest();
                    this_col_2 = csome_list_var_$86.first();
                  }
                }
                csome_list_var = csome_list_var.rest();
                this_col_1 = csome_list_var.first();
              }
            }
          }
        }
      }
      finally
      {
        sdc.$ignoring_sdcP$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 46109L)
  public static SubLObject implausible_union_of_colsP(final SubLObject cols, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plausibility_factor = NIL;
    SubLObject justification = NIL;
    if( NIL != list_utilities.every_in_list( $sym106$CLOSED_, cols, UNPROVIDED ) )
    {
      SubLObject check_cols = NIL;
      SubLObject expanded_cols = NIL;
      SubLObject cdolist_list_var = cols;
      SubLObject col = NIL;
      col = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$87 = possible_naut_genls( col );
        SubLObject check_col = NIL;
        check_col = cdolist_list_var_$87.first();
        while ( NIL != cdolist_list_var_$87)
        {
          if( NIL == list_utilities.member_kbeqP( col, cols ) )
          {
            final SubLObject item_var = check_col;
            if( NIL == conses_high.member( item_var, expanded_cols, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              expanded_cols = ConsesLow.cons( item_var, expanded_cols );
            }
          }
          final SubLObject item_var = check_col;
          if( NIL == conses_high.member( item_var, check_cols, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            check_cols = ConsesLow.cons( item_var, check_cols );
          }
          cdolist_list_var_$87 = cdolist_list_var_$87.rest();
          check_col = cdolist_list_var_$87.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        col = cdolist_list_var.first();
      }
      final SubLObject min_ceiling_cols = genls.min_ceiling_cols( check_cols, NIL, mt, UNPROVIDED );
      if( NIL != Sequences.find_if( $sym107$ESOTERIC_TERM_, min_ceiling_cols, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        plausibility_factor = $plausibility_factor_esoteric_term$.getDynamicValue( thread );
        if( NIL != justifyP )
        {
          SubLObject doneP = NIL;
          if( NIL == doneP )
          {
            SubLObject csome_list_var = min_ceiling_cols;
            SubLObject min_ceiling_col = NIL;
            min_ceiling_col = csome_list_var.first();
            while ( NIL == doneP && NIL != csome_list_var)
            {
              if( NIL != esoteric_termP( min_ceiling_col ) )
              {
                doneP = T;
                justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.listS( $const88$quotedIsa, min_ceiling_col, $list108 ), mt ) );
                SubLObject cdolist_list_var2 = cols;
                SubLObject col2 = NIL;
                col2 = cdolist_list_var2.first();
                while ( NIL != cdolist_list_var2)
                {
                  justification = ConsesLow.append( justification, hl_justify_asent_fast( ConsesLow.list( $const32$genls, col2, min_ceiling_col ), mt ) );
                  cdolist_list_var2 = cdolist_list_var2.rest();
                  col2 = cdolist_list_var2.first();
                }
              }
              csome_list_var = csome_list_var.rest();
              min_ceiling_col = csome_list_var.first();
            }
          }
        }
      }
    }
    return Values.values( plausibility_factor, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 47168L)
  public static SubLObject esoteric_termP(final SubLObject v_term)
  {
    return isa.quoted_isa_in_any_mtP( v_term, $const109$EsotericTerm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 47262L)
  public static SubLObject exoteric_termP(final SubLObject v_term)
  {
    return isa.quoted_isa_in_any_mtP( v_term, $const110$ExotericTerm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 47356L)
  public static SubLObject clear_plausibility_caches()
  {
    Functions.funcall( $sym111$CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS );
    Functions.funcall( $sym112$CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED );
    Functions.funcall( $sym113$CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED );
    Functions.funcall( $sym114$CLEAR_TVA_CHECK_CACHED );
    Functions.funcall( $sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_ );
    Functions.funcall( $sym116$CLEAR_DO_TVA_QUERY_TYPE_TYPE );
    Functions.funcall( $sym117$CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 48068L)
  public static SubLObject print_plausibility_cache_sizes()
  {
    PrintLow.format( T, $str118$__tweak_implausibility_type_restr, ( NIL != Symbols.boundp( $sym119$_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS_CACHING_STATE_ ) ) ? memoization_state.caching_state_size( Symbols.symbol_value(
        $sym119$_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS_CACHING_STATE_ ), UNPROVIDED ) : NIL );
    PrintLow.format( T, $str120$__implied_argn_type_requirements_, ( NIL != Symbols.boundp( $sym121$_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED_CACHING_STATE_ ) ) ? memoization_state.caching_state_size( Symbols
        .symbol_value( $sym121$_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED_CACHING_STATE_ ), UNPROVIDED ) : NIL );
    PrintLow.format( T, $str122$__implied_argn_type_restrictions_, ( NIL != Symbols.boundp( $sym123$_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED_CACHING_STATE_ ) ) ? memoization_state.caching_state_size( Symbols
        .symbol_value( $sym123$_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED_CACHING_STATE_ ), UNPROVIDED ) : NIL );
    PrintLow.format( T, $str124$__tva_check_cached___A__, ( NIL != Symbols.boundp( $sym125$_TVA_CHECK_CACHED_CACHING_STATE_ ) ) ? memoization_state.caching_state_size( Symbols.symbol_value(
        $sym125$_TVA_CHECK_CACHED_CACHING_STATE_ ), UNPROVIDED ) : NIL );
    PrintLow.format( T, $str126$__implausible_admitted_argument__, ( NIL != Symbols.boundp( $sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_ ) ) ? memoization_state.caching_state_size( Symbols.symbol_value(
        $sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_ ), UNPROVIDED ) : NIL );
    PrintLow.format( T, $str128$__do_tva_query_type_type___A__, ( NIL != Symbols.boundp( $sym129$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_ ) ) ? memoization_state.caching_state_size( Symbols.symbol_value(
        $sym129$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_ ), UNPROVIDED ) : NIL );
    PrintLow.format( T, $str130$__do_tva_query_type_disjoint_with, ( NIL != Symbols.boundp( $sym131$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_ ) ) ? memoization_state.caching_state_size( Symbols.symbol_value(
        $sym131$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_ ), UNPROVIDED ) : NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 49624L)
  public static SubLObject clear_tweak_implausibility_type_restrictions()
  {
    final SubLObject cs = $tweak_implausibility_type_restrictions_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 49624L)
  public static SubLObject remove_tweak_implausibility_type_restrictions(final SubLObject type_restrictions, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $tweak_implausibility_type_restrictions_caching_state$.getGlobalValue(), ConsesLow.list( type_restrictions, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 49624L)
  public static SubLObject tweak_implausibility_type_restrictions_internal(final SubLObject type_restrictions, final SubLObject mt)
  {
    if( NIL != disjoint_with.any_disjoint_with_anyP_memoized( type_restrictions, type_restrictions, mt, UNPROVIDED, UNPROVIDED ) )
    {
      return Values.values( genls.min_ceiling_cols( type_restrictions, NIL, mt, UNPROVIDED ), $kw97$MIN_CEILING_COLS );
    }
    return Values.values( type_restrictions, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 49624L)
  public static SubLObject tweak_implausibility_type_restrictions(final SubLObject type_restrictions, final SubLObject mt)
  {
    SubLObject caching_state = $tweak_implausibility_type_restrictions_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym132$TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS, $sym119$_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS_CACHING_STATE_, $int133$4096, EQUAL,
          TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym111$CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( type_restrictions, mt );
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
        if( type_restrictions.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( tweak_implausibility_type_restrictions_internal( type_restrictions, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( type_restrictions, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50058L)
  public static SubLObject clear_implied_argn_type_requirements_for_pred()
  {
    final SubLObject cs = $implied_argn_type_requirements_for_pred_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50058L)
  public static SubLObject remove_implied_argn_type_requirements_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $implied_argn_type_requirements_for_pred_caching_state$.getGlobalValue(), ConsesLow.list( pred, argnum, col, mt, justifyP ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50058L)
  public static SubLObject implied_argn_type_requirements_for_pred_internal(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLObject var0 = variables.get_variable( ZERO_INTEGER );
    return argnum.eql( TWO_INTEGER ) ? tva_unify_with_variable_lookup_and_values( ConsesLow.list( $const135$relationNotExistsExists, pred, col, var0 ), var0, mt, NIL, justifyP, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : ( argnum.eql( ONE_INTEGER ) ? tva_unify_with_variable_lookup_and_values( ConsesLow.list( $const135$relationNotExistsExists, pred, var0, col ), var0, mt, NIL, justifyP, UNPROVIDED, UNPROVIDED, UNPROVIDED )
            : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50058L)
  public static SubLObject implied_argn_type_requirements_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP)
  {
    SubLObject caching_state = $implied_argn_type_requirements_for_pred_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym134$IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED, $sym121$_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED_CACHING_STATE_, $int133$4096, EQUAL,
          FIVE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym112$CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( pred, argnum, col, mt, justifyP );
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
        if( pred.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( argnum.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( col.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && justifyP.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( implied_argn_type_requirements_for_pred_internal( pred, argnum, col, mt, justifyP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, argnum, col, mt, justifyP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50569L)
  public static SubLObject clear_implied_argn_type_restrictions_for_pred()
  {
    final SubLObject cs = $implied_argn_type_restrictions_for_pred_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50569L)
  public static SubLObject remove_implied_argn_type_restrictions_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $implied_argn_type_restrictions_for_pred_caching_state$.getGlobalValue(), ConsesLow.list( pred, argnum, col, mt, justifyP ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50569L)
  public static SubLObject implied_argn_type_restrictions_for_pred_internal(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject justifications = NIL;
    final SubLObject var0 = variables.get_variable( ZERO_INTEGER );
    thread.resetMultipleValues();
    SubLObject this_result = argnum.eql( TWO_INTEGER ) ? tva_unify_with_variable_lookup_and_values( ConsesLow.list( $const137$relationAllExists, pred, col, var0 ), var0, mt, NIL, justifyP, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) : NIL;
    SubLObject this_justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    result = ConsesLow.append( result, this_result );
    justifications = ConsesLow.append( justifications, this_justifications );
    thread.resetMultipleValues();
    this_result = argnum.eql( TWO_INTEGER ) ? tva_unify_with_variable_lookup_and_values( ConsesLow.list( $const138$someTypePlaysRoleInSituationType, col, var0, pred ), var0, mt, NIL, justifyP, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) : NIL;
    this_justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    result = ConsesLow.append( result, this_result );
    justifications = ConsesLow.append( justifications, this_justifications );
    SubLObject min_result = genls.min_cols( conses_high.copy_list( result ), mt, UNPROVIDED );
    SubLObject unique_result = NIL;
    SubLObject unique_justifications = NIL;
    SubLObject cdolist_list_var = $list139;
    SubLObject too_general_col = NIL;
    too_general_col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == list_utilities.singletonP( min_result ) )
      {
        min_result = conses_high.set_difference( min_result, genls.all_genls_among( too_general_col, result, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      too_general_col = cdolist_list_var.first();
    }
    SubLObject this_result2 = NIL;
    SubLObject this_result_$88 = NIL;
    SubLObject this_justification = NIL;
    SubLObject this_justification_$89 = NIL;
    this_result2 = result;
    this_result_$88 = this_result2.first();
    this_justification = justifications;
    this_justification_$89 = this_justification.first();
    while ( NIL != this_justification || NIL != this_result2)
    {
      if( NIL != list_utilities.member_kbeqP( this_result_$88, min_result ) && NIL == list_utilities.member_kbeqP( this_result_$88, unique_result ) )
      {
        unique_result = ConsesLow.cons( this_result_$88, unique_result );
        unique_justifications = ConsesLow.cons( this_justification_$89, unique_justifications );
      }
      this_result2 = this_result2.rest();
      this_result_$88 = this_result2.first();
      this_justification = this_justification.rest();
      this_justification_$89 = this_justification.first();
    }
    result = Sequences.nreverse( unique_result );
    justifications = Sequences.nreverse( unique_justifications );
    return Values.values( result, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50569L)
  public static SubLObject implied_argn_type_restrictions_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP)
  {
    SubLObject caching_state = $implied_argn_type_restrictions_for_pred_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym136$IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED, $sym123$_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED_CACHING_STATE_, $int133$4096, EQUAL,
          FIVE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym113$CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( pred, argnum, col, mt, justifyP );
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
        if( pred.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( argnum.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( col.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && justifyP.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( implied_argn_type_restrictions_for_pred_internal( pred, argnum, col, mt, justifyP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, argnum, col, mt, justifyP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 52805L)
  public static SubLObject tva_unify_with_variable_lookup_and_values(final SubLObject asent, final SubLObject var, SubLObject mt, SubLObject return_one_answer_p, SubLObject compute_justifications_p,
      SubLObject closure_mode, SubLObject checking_spec_preds_for_cache_resultsP, SubLObject prove_negationP)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( return_one_answer_p == UNPROVIDED )
    {
      return_one_answer_p = NIL;
    }
    if( compute_justifications_p == UNPROVIDED )
    {
      compute_justifications_p = NIL;
    }
    if( closure_mode == UNPROVIDED )
    {
      closure_mode = $kw140$NONE;
    }
    if( checking_spec_preds_for_cache_resultsP == UNPROVIDED )
    {
      checking_spec_preds_for_cache_resultsP = T;
    }
    if( prove_negationP == UNPROVIDED )
    {
      prove_negationP = NIL;
    }
    final SubLObject bindings_justifications = tva_inference.tva_unify( asent, mt, return_one_answer_p, compute_justifications_p, closure_mode, checking_spec_preds_for_cache_resultsP, prove_negationP );
    SubLObject result = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = bindings_justifications;
    SubLObject bindings_justification = NIL;
    bindings_justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = bindings_justification;
      SubLObject v_bindings = NIL;
      SubLObject justification = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list141 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list141 );
      justification = current.first();
      current = current.rest();
      if( NIL == current )
      {
        result = ConsesLow.cons( bindings.variable_lookup( var, v_bindings ), result );
        justifications = ConsesLow.cons( justification, justifications );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list141 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      bindings_justification = cdolist_list_var.first();
    }
    return Values.values( result, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53486L)
  public static SubLObject clear_tva_check_cached()
  {
    final SubLObject cs = $tva_check_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53486L)
  public static SubLObject remove_tva_check_cached(final SubLObject sentence, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $tva_check_cached_caching_state$.getGlobalValue(), ConsesLow.list( sentence, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53486L)
  public static SubLObject tva_check_cached_internal(final SubLObject sentence, final SubLObject mt)
  {
    return removal_modules_tva_lookup.tva_check( sentence, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53486L)
  public static SubLObject tva_check_cached(final SubLObject sentence, final SubLObject mt)
  {
    SubLObject caching_state = $tva_check_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym142$TVA_CHECK_CACHED, $sym125$_TVA_CHECK_CACHED_CACHING_STATE_, $int133$4096, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym114$CLEAR_TVA_CHECK_CACHED );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( sentence, mt );
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
        if( sentence.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( tva_check_cached_internal( sentence, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53651L)
  public static SubLObject clear_implausible_admitted_argumentP()
  {
    final SubLObject cs = $implausible_admitted_argumentP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53651L)
  public static SubLObject remove_implausible_admitted_argumentP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $implausible_admitted_argumentP_caching_state$.getGlobalValue(), ConsesLow.list( v_term, argnum, relation, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53651L)
  public static SubLObject implausible_admitted_argumentP_internal(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( argnum ) : argnum;
    if( NIL == el_utilities.closedP( relation, UNPROVIDED ) || NIL == el_utilities.closedP( v_term, UNPROVIDED ) )
    {
      return T;
    }
    SubLObject admittedP = NIL;
    final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = at_vars.$at_reln$.currentBinding( thread );
    final SubLObject _prev_bind_7 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_8 = at_vars.$at_argnum$.currentBinding( thread );
    final SubLObject _prev_bind_9 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = at_vars.$at_check_defining_mtsP$.currentBinding( thread );
    final SubLObject _prev_bind_11 = at_vars.$at_check_arg_genlsP$.currentBinding( thread );
    final SubLObject _prev_bind_12 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_13 = at_vars.$at_check_arg_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_14 = at_vars.$at_check_arg_not_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_15 = at_vars.$at_check_arg_quoted_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_16 = at_vars.$at_check_not_isa_disjointP$.currentBinding( thread );
    final SubLObject _prev_bind_17 = at_vars.$at_check_not_quoted_isa_disjointP$.currentBinding( thread );
    final SubLObject _prev_bind_18 = at_vars.$at_check_not_genls_disjointP$.currentBinding( thread );
    final SubLObject _prev_bind_19 = at_vars.$at_check_inter_arg_differentP$.currentBinding( thread );
    final SubLObject _prev_bind_20 = at_vars.$at_check_inter_arg_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_21 = at_vars.$at_check_inter_arg_genlP$.currentBinding( thread );
    final SubLObject _prev_bind_22 = at_vars.$at_check_inter_arg_not_genlP$.currentBinding( thread );
    final SubLObject _prev_bind_23 = at_vars.$at_check_inter_arg_isa_genlP$.currentBinding( thread );
    final SubLObject _prev_bind_24 = at_vars.$at_check_inter_arg_genl_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_25 = at_vars.$at_check_inter_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_26 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    final SubLObject _prev_bind_27 = at_vars.$at_some_arg_isa_requiredP$.currentBinding( thread );
    final SubLObject _prev_bind_28 = at_vars.$gather_at_constraintsP$.currentBinding( thread );
    final SubLObject _prev_bind_29 = czer_vars.$accumulating_semantic_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_30 = czer_vars.$within_negationP$.currentBinding( thread );
    final SubLObject _prev_bind_31 = at_vars.$within_functionP$.currentBinding( thread );
    final SubLObject _prev_bind_32 = at_vars.$within_predicateP$.currentBinding( thread );
    final SubLObject _prev_bind_33 = czer_vars.$distributing_meta_knowledgeP$.currentBinding( thread );
    try
    {
      at_vars.$noting_at_violationsP$.bind( NIL, thread );
      at_vars.$accumulating_at_violationsP$.bind( NIL, thread );
      wff_vars.$noting_wff_violationsP$.bind( NIL, thread );
      wff_vars.$accumulating_wff_violationsP$.bind( NIL, thread );
      wff_vars.$provide_wff_suggestionsP$.bind( NIL, thread );
      at_vars.$at_reln$.bind( relation, thread );
      at_vars.$at_arg$.bind( v_term, thread );
      at_vars.$at_argnum$.bind( argnum, thread );
      at_vars.$at_check_arg_typesP$.bind( NIL, thread );
      at_vars.$at_check_defining_mtsP$.bind( NIL, thread );
      at_vars.$at_check_arg_genlsP$.bind( T, thread );
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      at_vars.$at_check_arg_isaP$.bind( T, thread );
      at_vars.$at_check_arg_not_isaP$.bind( NIL, thread );
      at_vars.$at_check_arg_quoted_isaP$.bind( NIL, thread );
      at_vars.$at_check_not_isa_disjointP$.bind( T, thread );
      at_vars.$at_check_not_quoted_isa_disjointP$.bind( NIL, thread );
      at_vars.$at_check_not_genls_disjointP$.bind( T, thread );
      at_vars.$at_check_inter_arg_differentP$.bind( NIL, thread );
      at_vars.$at_check_inter_arg_isaP$.bind( NIL, thread );
      at_vars.$at_check_inter_arg_genlP$.bind( NIL, thread );
      at_vars.$at_check_inter_arg_not_genlP$.bind( NIL, thread );
      at_vars.$at_check_inter_arg_isa_genlP$.bind( NIL, thread );
      at_vars.$at_check_inter_arg_genl_isaP$.bind( NIL, thread );
      at_vars.$at_check_inter_arg_formatP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      at_vars.$at_some_arg_isa_requiredP$.bind( NIL, thread );
      at_vars.$gather_at_constraintsP$.bind( NIL, thread );
      czer_vars.$accumulating_semantic_violationsP$.bind( NIL, thread );
      czer_vars.$within_negationP$.bind( arg_type.at_within_negationP( at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ) ), thread );
      at_vars.$within_functionP$.bind( makeBoolean( NIL != control_vars.$within_assert$.getDynamicValue( thread ) && NIL != arg_type.at_within_functionP( at_vars.$at_reln$.getDynamicValue( thread ) ) ), thread );
      at_vars.$within_predicateP$.bind( makeBoolean( NIL != control_vars.$within_assert$.getDynamicValue( thread ) && NIL != arg_type.at_within_predicateP( at_vars.$at_reln$.getDynamicValue( thread ) ) ), thread );
      czer_vars.$distributing_meta_knowledgeP$.bind( czer_utilities.distributing_meta_predP( at_vars.$at_reln$.getDynamicValue( thread ) ), thread );
      admittedP = implausible_admitted_argument_intP( v_term, argnum, relation, mt );
    }
    finally
    {
      czer_vars.$distributing_meta_knowledgeP$.rebind( _prev_bind_33, thread );
      at_vars.$within_predicateP$.rebind( _prev_bind_32, thread );
      at_vars.$within_functionP$.rebind( _prev_bind_31, thread );
      czer_vars.$within_negationP$.rebind( _prev_bind_30, thread );
      czer_vars.$accumulating_semantic_violationsP$.rebind( _prev_bind_29, thread );
      at_vars.$gather_at_constraintsP$.rebind( _prev_bind_28, thread );
      at_vars.$at_some_arg_isa_requiredP$.rebind( _prev_bind_27, thread );
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_26, thread );
      at_vars.$at_check_inter_arg_formatP$.rebind( _prev_bind_25, thread );
      at_vars.$at_check_inter_arg_genl_isaP$.rebind( _prev_bind_24, thread );
      at_vars.$at_check_inter_arg_isa_genlP$.rebind( _prev_bind_23, thread );
      at_vars.$at_check_inter_arg_not_genlP$.rebind( _prev_bind_22, thread );
      at_vars.$at_check_inter_arg_genlP$.rebind( _prev_bind_21, thread );
      at_vars.$at_check_inter_arg_isaP$.rebind( _prev_bind_20, thread );
      at_vars.$at_check_inter_arg_differentP$.rebind( _prev_bind_19, thread );
      at_vars.$at_check_not_genls_disjointP$.rebind( _prev_bind_18, thread );
      at_vars.$at_check_not_quoted_isa_disjointP$.rebind( _prev_bind_17, thread );
      at_vars.$at_check_not_isa_disjointP$.rebind( _prev_bind_16, thread );
      at_vars.$at_check_arg_quoted_isaP$.rebind( _prev_bind_15, thread );
      at_vars.$at_check_arg_not_isaP$.rebind( _prev_bind_14, thread );
      at_vars.$at_check_arg_isaP$.rebind( _prev_bind_13, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_12, thread );
      at_vars.$at_check_arg_genlsP$.rebind( _prev_bind_11, thread );
      at_vars.$at_check_defining_mtsP$.rebind( _prev_bind_10, thread );
      at_vars.$at_check_arg_typesP$.rebind( _prev_bind_9, thread );
      at_vars.$at_argnum$.rebind( _prev_bind_8, thread );
      at_vars.$at_arg$.rebind( _prev_bind_7, thread );
      at_vars.$at_reln$.rebind( _prev_bind_6, thread );
      wff_vars.$provide_wff_suggestionsP$.rebind( _prev_bind_5, thread );
      wff_vars.$accumulating_wff_violationsP$.rebind( _prev_bind_4, thread );
      wff_vars.$noting_wff_violationsP$.rebind( _prev_bind_3, thread );
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_2, thread );
      at_vars.$noting_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return admittedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53651L)
  public static SubLObject implausible_admitted_argumentP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject caching_state = $implausible_admitted_argumentP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_, $sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_, $int145$8192, EQUAL, FOUR_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_ );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( v_term, argnum, relation, mt );
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
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( argnum.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( relation.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( implausible_admitted_argumentP_internal( v_term, argnum, relation, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, argnum, relation, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 55652L)
  public static SubLObject implausible_admitted_argument_intP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_arity = ( NIL != wff_utilities.$check_arityP$.getDynamicValue( thread ) ) ? arity.max_arity( relation ) : NIL;
    return makeBoolean( NIL != kb_accessors.relationP( relation ) && ( !v_arity.isNumber() || v_arity.numGE( argnum ) ) && ( argnum.numG( ZERO_INTEGER ) || ( argnum.numE( ZERO_INTEGER ) && NIL != kb_utilities.kbeq(
        v_term, relation ) ) ) && NIL != arg_type.relation_arg_okP( relation, v_term, argnum, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 56077L)
  public static SubLObject implausible_admitted_argument_to_formulaP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( argnum ) : argnum;
    if( NIL == el_utilities.closedP( relation, UNPROVIDED ) || NIL == el_utilities.closedP( v_term, UNPROVIDED ) )
    {
      return T;
    }
    SubLObject admittedP = NIL;
    final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = at_vars.$at_reln$.currentBinding( thread );
    final SubLObject _prev_bind_7 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_8 = at_vars.$at_formula$.currentBinding( thread );
    final SubLObject _prev_bind_9 = at_vars.$at_argnum$.currentBinding( thread );
    final SubLObject _prev_bind_10 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_11 = at_vars.$at_check_defining_mtsP$.currentBinding( thread );
    final SubLObject _prev_bind_12 = at_vars.$at_check_arg_genlsP$.currentBinding( thread );
    final SubLObject _prev_bind_13 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_14 = at_vars.$at_check_arg_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_15 = at_vars.$at_check_arg_not_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_16 = at_vars.$at_check_arg_quoted_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_17 = at_vars.$at_check_not_isa_disjointP$.currentBinding( thread );
    final SubLObject _prev_bind_18 = at_vars.$at_check_not_quoted_isa_disjointP$.currentBinding( thread );
    final SubLObject _prev_bind_19 = at_vars.$at_check_not_genls_disjointP$.currentBinding( thread );
    final SubLObject _prev_bind_20 = at_vars.$at_check_inter_arg_differentP$.currentBinding( thread );
    final SubLObject _prev_bind_21 = at_vars.$at_check_inter_arg_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_22 = at_vars.$at_check_inter_arg_genlP$.currentBinding( thread );
    final SubLObject _prev_bind_23 = at_vars.$at_check_inter_arg_not_genlP$.currentBinding( thread );
    final SubLObject _prev_bind_24 = at_vars.$at_check_inter_arg_isa_genlP$.currentBinding( thread );
    final SubLObject _prev_bind_25 = at_vars.$at_check_inter_arg_genl_isaP$.currentBinding( thread );
    final SubLObject _prev_bind_26 = at_vars.$at_check_inter_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_27 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    final SubLObject _prev_bind_28 = at_vars.$at_some_arg_isa_requiredP$.currentBinding( thread );
    final SubLObject _prev_bind_29 = at_vars.$gather_at_constraintsP$.currentBinding( thread );
    final SubLObject _prev_bind_30 = czer_vars.$accumulating_semantic_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_31 = czer_vars.$within_negationP$.currentBinding( thread );
    final SubLObject _prev_bind_32 = at_vars.$within_functionP$.currentBinding( thread );
    final SubLObject _prev_bind_33 = at_vars.$within_predicateP$.currentBinding( thread );
    final SubLObject _prev_bind_34 = czer_vars.$distributing_meta_knowledgeP$.currentBinding( thread );
    try
    {
      at_vars.$noting_at_violationsP$.bind( NIL, thread );
      at_vars.$accumulating_at_violationsP$.bind( NIL, thread );
      wff_vars.$noting_wff_violationsP$.bind( NIL, thread );
      wff_vars.$accumulating_wff_violationsP$.bind( NIL, thread );
      wff_vars.$provide_wff_suggestionsP$.bind( NIL, thread );
      at_vars.$at_reln$.bind( relation, thread );
      at_vars.$at_arg$.bind( v_term, thread );
      at_vars.$at_formula$.bind( formula, thread );
      at_vars.$at_argnum$.bind( argnum, thread );
      at_vars.$at_check_arg_typesP$.bind( NIL, thread );
      at_vars.$at_check_defining_mtsP$.bind( NIL, thread );
      at_vars.$at_check_arg_genlsP$.bind( T, thread );
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      at_vars.$at_check_arg_isaP$.bind( NIL, thread );
      at_vars.$at_check_arg_not_isaP$.bind( NIL, thread );
      at_vars.$at_check_arg_quoted_isaP$.bind( NIL, thread );
      at_vars.$at_check_not_isa_disjointP$.bind( NIL, thread );
      at_vars.$at_check_not_quoted_isa_disjointP$.bind( NIL, thread );
      at_vars.$at_check_not_genls_disjointP$.bind( T, thread );
      at_vars.$at_check_inter_arg_differentP$.bind( NIL, thread );
      at_vars.$at_check_inter_arg_isaP$.bind( NIL, thread );
      at_vars.$at_check_inter_arg_genlP$.bind( T, thread );
      at_vars.$at_check_inter_arg_not_genlP$.bind( T, thread );
      at_vars.$at_check_inter_arg_isa_genlP$.bind( NIL, thread );
      at_vars.$at_check_inter_arg_genl_isaP$.bind( NIL, thread );
      at_vars.$at_check_inter_arg_formatP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      at_vars.$at_some_arg_isa_requiredP$.bind( NIL, thread );
      at_vars.$gather_at_constraintsP$.bind( NIL, thread );
      czer_vars.$accumulating_semantic_violationsP$.bind( NIL, thread );
      czer_vars.$within_negationP$.bind( arg_type.at_within_negationP( at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ) ), thread );
      at_vars.$within_functionP$.bind( makeBoolean( NIL != control_vars.$within_assert$.getDynamicValue( thread ) && NIL != arg_type.at_within_functionP( at_vars.$at_reln$.getDynamicValue( thread ) ) ), thread );
      at_vars.$within_predicateP$.bind( makeBoolean( NIL != control_vars.$within_assert$.getDynamicValue( thread ) && NIL != arg_type.at_within_predicateP( at_vars.$at_reln$.getDynamicValue( thread ) ) ), thread );
      czer_vars.$distributing_meta_knowledgeP$.bind( czer_utilities.distributing_meta_predP( at_vars.$at_reln$.getDynamicValue( thread ) ), thread );
      admittedP = implausible_admitted_argument_intP( v_term, argnum, relation, mt );
    }
    finally
    {
      czer_vars.$distributing_meta_knowledgeP$.rebind( _prev_bind_34, thread );
      at_vars.$within_predicateP$.rebind( _prev_bind_33, thread );
      at_vars.$within_functionP$.rebind( _prev_bind_32, thread );
      czer_vars.$within_negationP$.rebind( _prev_bind_31, thread );
      czer_vars.$accumulating_semantic_violationsP$.rebind( _prev_bind_30, thread );
      at_vars.$gather_at_constraintsP$.rebind( _prev_bind_29, thread );
      at_vars.$at_some_arg_isa_requiredP$.rebind( _prev_bind_28, thread );
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_27, thread );
      at_vars.$at_check_inter_arg_formatP$.rebind( _prev_bind_26, thread );
      at_vars.$at_check_inter_arg_genl_isaP$.rebind( _prev_bind_25, thread );
      at_vars.$at_check_inter_arg_isa_genlP$.rebind( _prev_bind_24, thread );
      at_vars.$at_check_inter_arg_not_genlP$.rebind( _prev_bind_23, thread );
      at_vars.$at_check_inter_arg_genlP$.rebind( _prev_bind_22, thread );
      at_vars.$at_check_inter_arg_isaP$.rebind( _prev_bind_21, thread );
      at_vars.$at_check_inter_arg_differentP$.rebind( _prev_bind_20, thread );
      at_vars.$at_check_not_genls_disjointP$.rebind( _prev_bind_19, thread );
      at_vars.$at_check_not_quoted_isa_disjointP$.rebind( _prev_bind_18, thread );
      at_vars.$at_check_not_isa_disjointP$.rebind( _prev_bind_17, thread );
      at_vars.$at_check_arg_quoted_isaP$.rebind( _prev_bind_16, thread );
      at_vars.$at_check_arg_not_isaP$.rebind( _prev_bind_15, thread );
      at_vars.$at_check_arg_isaP$.rebind( _prev_bind_14, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_13, thread );
      at_vars.$at_check_arg_genlsP$.rebind( _prev_bind_12, thread );
      at_vars.$at_check_defining_mtsP$.rebind( _prev_bind_11, thread );
      at_vars.$at_check_arg_typesP$.rebind( _prev_bind_10, thread );
      at_vars.$at_argnum$.rebind( _prev_bind_9, thread );
      at_vars.$at_formula$.rebind( _prev_bind_8, thread );
      at_vars.$at_arg$.rebind( _prev_bind_7, thread );
      at_vars.$at_reln$.rebind( _prev_bind_6, thread );
      wff_vars.$provide_wff_suggestionsP$.rebind( _prev_bind_5, thread );
      wff_vars.$accumulating_wff_violationsP$.rebind( _prev_bind_4, thread );
      wff_vars.$noting_wff_violationsP$.rebind( _prev_bind_3, thread );
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_2, thread );
      at_vars.$noting_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return admittedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 58136L)
  public static SubLObject hl_justify_asent_fast(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding( thread );
    try
    {
      czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind( T, thread );
      result = hl_justify_asent( sentence, mt );
    }
    finally
    {
      czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 58491L)
  public static SubLObject hl_justify_asent(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.within_queryP() )
    {
      Errors.error( $str146$hl_justify_asent_not_legal_to_cal );
    }
    SubLObject query_properties = $list147;
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject right_sentence = czer_utilities.unwrap_if_ist( sentence, mt, UNPROVIDED );
    final SubLObject right_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != el_utilities.el_implication_p( right_sentence ) )
    {
      query_properties = conses_high.putf( query_properties, $kw148$CONDITIONAL_SENTENCE_, T );
    }
    result = inference_kernel.new_cyc_query( right_sentence, right_mt, query_properties );
    result = result.first();
    if( NIL == result )
    {
      if( NIL != $debug_implausibilityP$.getDynamicValue( thread ) )
      {
        Errors.warn( $str149$Could_not_find_hl_support_for__S_, sentence, mt );
      }
      result = ConsesLow.list( arguments.make_hl_support( $kw39$OPAQUE, sentence, mt, UNPROVIDED ) );
    }
    return result;
  }

  public static SubLObject declare_plausibility_utilities_file()
  {
    SubLFiles.declareFunction( me, "sentence_plausibility_factor", "SENTENCE-PLAUSIBILITY-FACTOR", 1, 2, false );
    SubLFiles.declareFunction( me, "why_sentence_plausibility_factor", "WHY-SENTENCE-PLAUSIBILITY-FACTOR", 1, 2, false );
    SubLFiles.declareFunction( me, "sentence_plausibility_score", "SENTENCE-PLAUSIBILITY-SCORE", 1, 2, false );
    SubLFiles.declareFunction( me, "why_sentence_plausibility_score", "WHY-SENTENCE-PLAUSIBILITY-SCORE", 1, 2, false );
    SubLFiles.declareFunction( me, "implausible_sentenceP", "IMPLAUSIBLE-SENTENCE?", 1, 3, false );
    SubLFiles.declareFunction( me, "implausible_nautP", "IMPLAUSIBLE-NAUT?", 1, 3, false );
    SubLFiles.declareFunction( me, "get_implausibility_property", "GET-IMPLAUSIBILITY-PROPERTY", 2, 1, false );
    SubLFiles.declareFunction( me, "implausible_sentenceP_recursive", "IMPLAUSIBLE-SENTENCE?-RECURSIVE", 5, 0, false );
    SubLFiles.declareFunction( me, "implausible_nautP_recursive", "IMPLAUSIBLE-NAUT?-RECURSIVE", 5, 0, false );
    SubLFiles.declareFunction( me, "categorize_subcollection_predicate_internal", "CATEGORIZE-SUBCOLLECTION-PREDICATE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "categorize_subcollection_predicate", "CATEGORIZE-SUBCOLLECTION-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_find_nart", "POSSIBLY-FIND-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_naut_genls", "POSSIBLE-NAUT-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "implausible_sentence_wrt_variable_argumentsP", "IMPLAUSIBLE-SENTENCE-WRT-VARIABLE-ARGUMENTS?", 4, 0, false );
    SubLFiles.declareFunction( me, "implausible_term_wrt_wft", "IMPLAUSIBLE-TERM-WRT-WFT", 5, 0, false );
    SubLFiles.declareFunction( me, "implausible_sentence_wrt_wff", "IMPLAUSIBLE-SENTENCE-WRT-WFF", 5, 0, false );
    SubLFiles.declareFunction( me, "implausible_genlsP", "IMPLAUSIBLE-GENLS?", 5, 0, false );
    SubLFiles.declareFunction( me, "implausible_isaP", "IMPLAUSIBLE-ISA?", 5, 0, false );
    SubLFiles.declareFunction( me, "implausible_typeP", "IMPLAUSIBLE-TYPE?", 3, 0, false );
    SubLFiles.declareFunction( me, "implausible_col_wrt_arg_isa_constraintP", "IMPLAUSIBLE-COL-WRT-ARG-ISA-CONSTRAINT?", 5, 0, false );
    SubLFiles.declareFunction( me, "implausible_col_wrt_arg_sometimes_isa_constraintP", "IMPLAUSIBLE-COL-WRT-ARG-SOMETIMES-ISA-CONSTRAINT?", 5, 0, false );
    SubLFiles.declareFunction( me, "implausible_thing_wrt_arg_isa_constraintP", "IMPLAUSIBLE-THING-WRT-ARG-ISA-CONSTRAINT?", 5, 0, false );
    SubLFiles.declareFunction( me, "implausible_thing_wrt_arg_sometimes_isa_constraintP", "IMPLAUSIBLE-THING-WRT-ARG-SOMETIMES-ISA-CONSTRAINT?", 5, 0, false );
    SubLFiles.declareFunction( me, "implausible_col_wrt_implied_argn_type_requirements_for_predP", "IMPLAUSIBLE-COL-WRT-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED?", 6, 0, false );
    SubLFiles.declareFunction( me, "implausible_thing_wrt_implied_argn_type_requirements_for_predP", "IMPLAUSIBLE-THING-WRT-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED?", 6, 0, false );
    SubLFiles.declareFunction( me, "implausible_col_wrt_implied_argn_type_restrictions_for_predP", "IMPLAUSIBLE-COL-WRT-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED?", 6, 0, false );
    SubLFiles.declareFunction( me, "implausible_thing_wrt_implied_argn_type_restrictions_for_predP", "IMPLAUSIBLE-THING-WRT-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED?", 6, 0, false );
    SubLFiles.declareFunction( me, "implausible_col_wrt_genls_pred_disjointnessP", "IMPLAUSIBLE-COL-WRT-GENLS-PRED-DISJOINTNESS?", 6, 0, false );
    SubLFiles.declareFunction( me, "implausible_col_wrt_isa_pred_disjointnessP", "IMPLAUSIBLE-COL-WRT-ISA-PRED-DISJOINTNESS?", 6, 0, false );
    SubLFiles.declareFunction( me, "implausible_col_wrt_typical_volumeP", "IMPLAUSIBLE-COL-WRT-TYPICAL-VOLUME?", 6, 0, false );
    SubLFiles.declareFunction( me, "implausible_intersection_of_two_colsP", "IMPLAUSIBLE-INTERSECTION-OF-TWO-COLS?", 4, 0, false );
    SubLFiles.declareFunction( me, "implausible_union_of_colsP", "IMPLAUSIBLE-UNION-OF-COLS?", 3, 0, false );
    SubLFiles.declareFunction( me, "esoteric_termP", "ESOTERIC-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "exoteric_termP", "EXOTERIC-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_plausibility_caches", "CLEAR-PLAUSIBILITY-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "print_plausibility_cache_sizes", "PRINT-PLAUSIBILITY-CACHE-SIZES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_tweak_implausibility_type_restrictions", "CLEAR-TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_tweak_implausibility_type_restrictions", "REMOVE-TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "tweak_implausibility_type_restrictions_internal", "TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "tweak_implausibility_type_restrictions", "TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_implied_argn_type_requirements_for_pred", "CLEAR-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_implied_argn_type_requirements_for_pred", "REMOVE-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED", 5, 0, false );
    SubLFiles.declareFunction( me, "implied_argn_type_requirements_for_pred_internal", "IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "implied_argn_type_requirements_for_pred", "IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED", 5, 0, false );
    SubLFiles.declareFunction( me, "clear_implied_argn_type_restrictions_for_pred", "CLEAR-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_implied_argn_type_restrictions_for_pred", "REMOVE-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED", 5, 0, false );
    SubLFiles.declareFunction( me, "implied_argn_type_restrictions_for_pred_internal", "IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "implied_argn_type_restrictions_for_pred", "IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED", 5, 0, false );
    SubLFiles.declareFunction( me, "tva_unify_with_variable_lookup_and_values", "TVA-UNIFY-WITH-VARIABLE-LOOKUP-AND-VALUES", 2, 6, false );
    SubLFiles.declareFunction( me, "clear_tva_check_cached", "CLEAR-TVA-CHECK-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_tva_check_cached", "REMOVE-TVA-CHECK-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "tva_check_cached_internal", "TVA-CHECK-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "tva_check_cached", "TVA-CHECK-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_implausible_admitted_argumentP", "CLEAR-IMPLAUSIBLE-ADMITTED-ARGUMENT?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_implausible_admitted_argumentP", "REMOVE-IMPLAUSIBLE-ADMITTED-ARGUMENT?", 3, 1, false );
    SubLFiles.declareFunction( me, "implausible_admitted_argumentP_internal", "IMPLAUSIBLE-ADMITTED-ARGUMENT?-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "implausible_admitted_argumentP", "IMPLAUSIBLE-ADMITTED-ARGUMENT?", 3, 1, false );
    SubLFiles.declareFunction( me, "implausible_admitted_argument_intP", "IMPLAUSIBLE-ADMITTED-ARGUMENT-INT?", 4, 0, false );
    SubLFiles.declareFunction( me, "implausible_admitted_argument_to_formulaP", "IMPLAUSIBLE-ADMITTED-ARGUMENT-TO-FORMULA?", 4, 1, false );
    SubLFiles.declareFunction( me, "hl_justify_asent_fast", "HL-JUSTIFY-ASENT-FAST", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_justify_asent", "HL-JUSTIFY-ASENT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_plausibility_utilities_file()
  {
    $default_plausibility_check_mt$ = SubLFiles.defparameter( "*DEFAULT-PLAUSIBILITY-CHECK-MT*", $const0$PlausibilityQueryMt );
    $implausibility_properties$ = SubLFiles.deflexical( "*IMPLAUSIBILITY-PROPERTIES*", $list1 );
    $debug_implausibilityP$ = SubLFiles.defparameter( "*DEBUG-IMPLAUSIBILITY?*", NIL );
    $debug_implausibility_wf_checksP$ = SubLFiles.defparameter( "*DEBUG-IMPLAUSIBILITY-WF-CHECKS?*", NIL );
    $implausibility_override_properties$ = SubLFiles.defparameter( "*IMPLAUSIBILITY-OVERRIDE-PROPERTIES*", NIL );
    $implausibility_stats_table$ = SubLFiles.defparameter( "*IMPLAUSIBILITY-STATS-TABLE*", NIL );
    $default_plausibility_percent_cutoff$ = SubLFiles.defparameter( "*DEFAULT-PLAUSIBILITY-PERCENT-CUTOFF*", $float2$0_5 );
    $plausibility_factor_completely_implausible$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-COMPLETELY-IMPLAUSIBLE*", ZERO_INTEGER );
    $plausibility_factor_non_wff$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-NON-WFF*", $float3$0_01 );
    $plausibility_factor_type_violation$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-TYPE-VIOLATION*", $float4$0_02 );
    $plausibility_factor_arg_violation$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-ARG-VIOLATION*", $float5$0_03 );
    $plausibility_factor_arg_disjointness$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-ARG-DISJOINTNESS*", $float6$0_04 );
    $plausibility_factor_not_isa_or_genls$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-NOT-ISA-OR-GENLS*", $float7$0_05 );
    $plausibility_factor_inter_sentential_contradiction$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-INTER-SENTENTIAL-CONTRADICTION*", $float8$0_055 );
    $plausibility_factor_implied_arg_restriction$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-IMPLIED-ARG-RESTRICTION*", $float9$0_06 );
    $plausibility_factor_no_type_restriction$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-NO-TYPE-RESTRICTION*", $float10$0_07 );
    $plausibility_factor_typical_volume_violation$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-TYPICAL-VOLUME-VIOLATION*", $float11$0_08 );
    $plausibility_factor_esoteric_term$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-ESOTERIC-TERM*", $float12$0_09 );
    $plausibility_factor_splitting_hairs_cutoff$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-SPLITTING-HAIRS-CUTOFF*", $float13$0_1 );
    $plausibility_factor_completely_plausible$ = SubLFiles.defparameter( "*PLAUSIBILITY-FACTOR-COMPLETELY-PLAUSIBLE*", ONE_INTEGER );
    $default_sentence_plausibility_score_properties$ = SubLFiles.defparameter( "*DEFAULT-SENTENCE-PLAUSIBILITY-SCORE-PROPERTIES*", NIL );
    $typical_volume_applicable_predicates$ = SubLFiles.defparameter( "*TYPICAL-VOLUME-APPLICABLE-PREDICATES*", $list101 );
    $typical_volume_applicable_pred_inverses$ = SubLFiles.defparameter( "*TYPICAL-VOLUME-APPLICABLE-PRED-INVERSES*", $list102 );
    $tweak_implausibility_type_restrictions_caching_state$ = SubLFiles.deflexical( "*TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS-CACHING-STATE*", NIL );
    $implied_argn_type_requirements_for_pred_caching_state$ = SubLFiles.deflexical( "*IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED-CACHING-STATE*", NIL );
    $implied_argn_type_restrictions_for_pred_caching_state$ = SubLFiles.deflexical( "*IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED-CACHING-STATE*", NIL );
    $tva_check_cached_caching_state$ = SubLFiles.deflexical( "*TVA-CHECK-CACHED-CACHING-STATE*", NIL );
    $implausible_admitted_argumentP_caching_state$ = SubLFiles.deflexical( "*IMPLAUSIBLE-ADMITTED-ARGUMENT?-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_plausibility_utilities_file()
  {
    memoization_state.note_memoized_function( $sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE );
    memoization_state.note_globally_cached_function( $sym132$TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS );
    memoization_state.note_globally_cached_function( $sym134$IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED );
    memoization_state.note_globally_cached_function( $sym136$IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED );
    memoization_state.note_globally_cached_function( $sym142$TVA_CHECK_CACHED );
    memoization_state.note_globally_cached_function( $sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_plausibility_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_plausibility_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_plausibility_utilities_file();
  }
  static
  {
    me = new plausibility_utilities();
    $default_plausibility_check_mt$ = null;
    $implausibility_properties$ = null;
    $debug_implausibilityP$ = null;
    $debug_implausibility_wf_checksP$ = null;
    $implausibility_override_properties$ = null;
    $implausibility_stats_table$ = null;
    $default_plausibility_percent_cutoff$ = null;
    $plausibility_factor_completely_implausible$ = null;
    $plausibility_factor_non_wff$ = null;
    $plausibility_factor_type_violation$ = null;
    $plausibility_factor_arg_violation$ = null;
    $plausibility_factor_arg_disjointness$ = null;
    $plausibility_factor_not_isa_or_genls$ = null;
    $plausibility_factor_inter_sentential_contradiction$ = null;
    $plausibility_factor_implied_arg_restriction$ = null;
    $plausibility_factor_no_type_restriction$ = null;
    $plausibility_factor_typical_volume_violation$ = null;
    $plausibility_factor_esoteric_term$ = null;
    $plausibility_factor_splitting_hairs_cutoff$ = null;
    $plausibility_factor_completely_plausible$ = null;
    $default_sentence_plausibility_score_properties$ = null;
    $typical_volume_applicable_predicates$ = null;
    $typical_volume_applicable_pred_inverses$ = null;
    $tweak_implausibility_type_restrictions_caching_state$ = null;
    $implied_argn_type_requirements_for_pred_caching_state$ = null;
    $implied_argn_type_restrictions_for_pred_caching_state$ = null;
    $tva_check_cached_caching_state$ = null;
    $implausible_admitted_argumentP_caching_state$ = null;
    $const0$PlausibilityQueryMt = constant_handles.reader_make_constant_shell( makeString( "PlausibilityQueryMt" ) );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "JUSTIFY?" ), makeKeyword( "RETURN-BOOLEAN?" ), makeKeyword( "PERCENT-CUTOFF" ), makeKeyword( "PERCENT-CLIPPING?" ), makeKeyword( "MAX-TIME" ), makeKeyword(
        "MAX-STEP" ), makeKeyword( "CLEAR-CACHES?" ), makeKeyword( "GATHER-STATS?" ), makeKeyword( "SUPPRESS-WFF-CHECKS?" ), makeKeyword( "WFF-CHECK-TYPE" ), makeKeyword( "SUPPRESS-WFT-CHECKS?" ), makeKeyword(
            "WFT-CHECK-TYPE" ), makeKeyword( "SUPPRESS-WF-CHECKS?" ), makeKeyword( "SUPPRESS-PLAUSIBLE-NART?" ), makeKeyword( "FORCE-GENLS-TRUTH-CHECK?" )
    } );
    $float2$0_5 = makeDouble( 0.5 );
    $float3$0_01 = makeDouble( 0.01 );
    $float4$0_02 = makeDouble( 0.02 );
    $float5$0_03 = makeDouble( 0.03 );
    $float6$0_04 = makeDouble( 0.04 );
    $float7$0_05 = makeDouble( 0.05 );
    $float8$0_055 = makeDouble( 0.055 );
    $float9$0_06 = makeDouble( 0.06 );
    $float10$0_07 = makeDouble( 0.07 );
    $float11$0_08 = makeDouble( 0.08 );
    $float12$0_09 = makeDouble( 0.09 );
    $float13$0_1 = makeDouble( 0.1 );
    $kw14$JUSTIFY_ = makeKeyword( "JUSTIFY?" );
    $int15$100 = makeInteger( 100 );
    $kw16$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw17$PERCENT_CUTOFF = makeKeyword( "PERCENT-CUTOFF" );
    $kw18$CLEAR_CACHES_ = makeKeyword( "CLEAR-CACHES?" );
    $kw19$SUPPRESS_PLAUSIBLE_NART_ = makeKeyword( "SUPPRESS-PLAUSIBLE-NART?" );
    $sym20$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $kw21$GATHER_STATS_ = makeKeyword( "GATHER-STATS?" );
    $kw22$TIMED_OUT_ = makeKeyword( "TIMED-OUT?" );
    $kw23$IMPLAUSIBLE_ = makeKeyword( "IMPLAUSIBLE?" );
    $kw24$PLAUSIBLE_ = makeKeyword( "PLAUSIBLE?" );
    $str25$Bad_justification_ = makeString( "Bad justification!" );
    $kw26$PERCENT_CLIPPING_ = makeKeyword( "PERCENT-CLIPPING?" );
    $kw27$RETURN_BOOLEAN_ = makeKeyword( "RETURN-BOOLEAN?" );
    $kw28$EAGER = makeKeyword( "EAGER" );
    $const29$equalSymbols = constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) );
    $const30$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $kw31$FORCE_GENLS_TRUTH_CHECK_ = makeKeyword( "FORCE-GENLS-TRUTH-CHECK?" );
    $const32$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list33 = ConsesLow.list( makeSymbol( "GENLS" ), makeSymbol( "COL1" ), makeSymbol( "COL2" ) );
    $const34$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list35 = ConsesLow.list( makeSymbol( "ISA" ), makeSymbol( "INST" ), makeSymbol( "COL" ) );
    $kw36$IGNORE = makeKeyword( "IGNORE" );
    $const37$admittedArgument = constant_handles.reader_make_constant_shell( makeString( "admittedArgument" ) );
    $const38$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $kw39$OPAQUE = makeKeyword( "OPAQUE" );
    $const40$wffViolation = constant_handles.reader_make_constant_shell( makeString( "wffViolation" ) );
    $str41$Sentence_contains_contradictory_c = makeString( "Sentence contains contradictory conjuncts" );
    $kw42$LAZY = makeKeyword( "LAZY" );
    $kw43$FROM = makeKeyword( "FROM" );
    $kw44$RELATION_DIRECTION = makeKeyword( "RELATION-DIRECTION" );
    $kw45$COL_ARG = makeKeyword( "COL-ARG" );
    $list46 = ConsesLow.list( makeSymbol( "COL-ARG" ), makeSymbol( "PRED" ), makeSymbol( "TYPE" ) );
    $kw47$ARG_ORDER = makeKeyword( "ARG-ORDER" );
    $kw48$TYPE_COL_PRED = makeKeyword( "TYPE-COL-PRED" );
    $list49 = ConsesLow.list( makeSymbol( "COL-ARG" ), makeSymbol( "PRED" ), makeSymbol( "THING" ) );
    $const50$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) );
    $list51 = ConsesLow.list( makeSymbol( "COL1" ), makeSymbol( "COL2" ) );
    $const52$CollectionUnionFn = constant_handles.reader_make_constant_shell( makeString( "CollectionUnionFn" ) );
    $sym53$POSSIBLY_FIND_NART = makeSymbol( "POSSIBLY-FIND-NART" );
    $sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE = makeSymbol( "CATEGORIZE-SUBCOLLECTION-PREDICATE" );
    $const55$SubcollectionOfWithRelationToType = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToTypeFn" ) );
    $list56 = ConsesLow.list( makeKeyword( "RELATION-DIRECTION" ), makeKeyword( "TO" ), makeKeyword( "COL-ARG" ), T );
    $const57$SubcollectionOfWithRelationFromTy = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromTypeFn" ) );
    $list58 = ConsesLow.list( makeKeyword( "RELATION-DIRECTION" ), makeKeyword( "FROM" ), makeKeyword( "COL-ARG" ), T );
    $const59$SubcollectionOfWithoutRelationToT = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithoutRelationToTypeFn" ) );
    $list60 = ConsesLow.list( makeKeyword( "RELATION-DIRECTION" ), makeKeyword( "TO" ), makeKeyword( "COL-ARG" ), T, makeKeyword( "INVERSE-SUBSET" ), T );
    $const61$SubcollectionOfWithoutRelationFro = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithoutRelationFromTypeFn" ) );
    $list62 = ConsesLow.list( makeKeyword( "RELATION-DIRECTION" ), makeKeyword( "FROM" ), makeKeyword( "COL-ARG" ), T, makeKeyword( "INVERSE-SUBSET" ), T );
    $const63$SitTypeSpecWithTypeRestrictionOnR = constant_handles.reader_make_constant_shell( makeString( "SitTypeSpecWithTypeRestrictionOnRolePlayerFn" ) );
    $list64 = ConsesLow.list( makeKeyword( "RELATION-DIRECTION" ), makeKeyword( "TO" ), makeKeyword( "COL-ARG" ), T, makeKeyword( "TEMPORALLY-SANE?" ), T );
    $const65$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) );
    $list66 = ConsesLow.list( makeKeyword( "RELATION-DIRECTION" ), makeKeyword( "TO" ), makeKeyword( "COL-ARG" ), NIL );
    $const67$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) );
    $list68 = ConsesLow.list( makeKeyword( "RELATION-DIRECTION" ), makeKeyword( "FROM" ), makeKeyword( "COL-ARG" ), NIL );
    $const69$SubcollectionOfWithoutRelationToF = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithoutRelationToFn" ) );
    $list70 = ConsesLow.list( makeKeyword( "RELATION-DIRECTION" ), makeKeyword( "TO" ), makeKeyword( "COL-ARG" ), NIL, makeKeyword( "INVERSE-SUBSET" ), T );
    $const71$SubcollectionOfWithoutRelationFro = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithoutRelationFromFn" ) );
    $list72 = ConsesLow.list( makeKeyword( "RELATION-DIRECTION" ), makeKeyword( "FROM" ), makeKeyword( "COL-ARG" ), NIL, makeKeyword( "INVERSE-SUBSET" ), T );
    $const73$UsingAForFn = constant_handles.reader_make_constant_shell( makeString( "UsingAForFn" ) );
    $list74 = ConsesLow.list( makeKeyword( "RELATION-DIRECTION" ), makeKeyword( "TO" ), makeKeyword( "COL-ARG" ), T, makeKeyword( "ARG-ORDER" ), makeKeyword( "TYPE-COL-PRED" ) );
    $const75$ReifiableFunction = constant_handles.reader_make_constant_shell( makeString( "ReifiableFunction" ) );
    $kw76$SUPPRESS_WFF_CHECKS_ = makeKeyword( "SUPPRESS-WFF-CHECKS?" );
    $kw77$SUPPRESS_WF_CHECKS_ = makeKeyword( "SUPPRESS-WF-CHECKS?" );
    $str78$__implausible_sentence_wrt_variab = makeString( "~&implausible-sentence-wrt-variable-arguments: ~S~%" );
    $str79$Variable_types_are_disjoint_ = makeString( "Variable types are disjoint." );
    $kw80$SUPPRESS_WFT_CHECKS_ = makeKeyword( "SUPPRESS-WFT-CHECKS?" );
    $kw81$WFT_CHECK_TYPE = makeKeyword( "WFT-CHECK-TYPE" );
    $str82$__implausible_term_wrt_wft___S__ = makeString( "~&implausible-term-wrt-wft: ~S~%" );
    $list83 = ConsesLow.list( makeKeyword( "IO-MODE" ), makeKeyword( "NL" ) );
    $kw84$WFF_CHECK_TYPE = makeKeyword( "WFF-CHECK-TYPE" );
    $str85$__implausible_sentence_wrt_wff___ = makeString( "~&implausible-sentence-wrt-wff: ~S~%" );
    $const86$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $list87 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) );
    $const88$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $list89 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycLReifiedDenotationalTerm" ) ) );
    $const90$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $list91 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycLClosedDenotationalTerm" ) ) );
    $const92$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $const93$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $const94$AnytimePSC = constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) );
    $const95$argSometimesIsa = constant_handles.reader_make_constant_shell( makeString( "argSometimesIsa" ) );
    $const96$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $kw97$MIN_CEILING_COLS = makeKeyword( "MIN-CEILING-COLS" );
    $const98$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $list99 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $list100 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ) );
    $list101 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "physicalDecompositions" ) ) );
    $list102 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "objectFoundInLocation" ) ) );
    $kw103$PRED = makeKeyword( "PRED" );
    $kw104$INVERSE = makeKeyword( "INVERSE" );
    $const105$typicallyMoreVoluminousThan = constant_handles.reader_make_constant_shell( makeString( "typicallyMoreVoluminousThan" ) );
    $sym106$CLOSED_ = makeSymbol( "CLOSED?" );
    $sym107$ESOTERIC_TERM_ = makeSymbol( "ESOTERIC-TERM?" );
    $list108 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "EsotericTerm" ) ) );
    $const109$EsotericTerm = constant_handles.reader_make_constant_shell( makeString( "EsotericTerm" ) );
    $const110$ExotericTerm = constant_handles.reader_make_constant_shell( makeString( "ExotericTerm" ) );
    $sym111$CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS = makeSymbol( "CLEAR-TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS" );
    $sym112$CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED = makeSymbol( "CLEAR-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED" );
    $sym113$CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED = makeSymbol( "CLEAR-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED" );
    $sym114$CLEAR_TVA_CHECK_CACHED = makeSymbol( "CLEAR-TVA-CHECK-CACHED" );
    $sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_ = makeSymbol( "CLEAR-IMPLAUSIBLE-ADMITTED-ARGUMENT?" );
    $sym116$CLEAR_DO_TVA_QUERY_TYPE_TYPE = makeSymbol( "CLEAR-DO-TVA-QUERY-TYPE-TYPE" );
    $sym117$CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH = makeSymbol( "CLEAR-DO-TVA-QUERY-TYPE-DISJOINT-WITH" );
    $str118$__tweak_implausibility_type_restr = makeString( "~&tweak-implausibility-type-restrictions: ~A~%" );
    $sym119$_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS_CACHING_STATE_ = makeSymbol( "*TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS-CACHING-STATE*" );
    $str120$__implied_argn_type_requirements_ = makeString( "~&implied-argn-type-requirements-for-pred: ~A~%" );
    $sym121$_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED_CACHING_STATE_ = makeSymbol( "*IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED-CACHING-STATE*" );
    $str122$__implied_argn_type_restrictions_ = makeString( "~&implied-argn-type-restrictions-for-pred: ~A~%" );
    $sym123$_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED_CACHING_STATE_ = makeSymbol( "*IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED-CACHING-STATE*" );
    $str124$__tva_check_cached___A__ = makeString( "~&tva-check-cached: ~A~%" );
    $sym125$_TVA_CHECK_CACHED_CACHING_STATE_ = makeSymbol( "*TVA-CHECK-CACHED-CACHING-STATE*" );
    $str126$__implausible_admitted_argument__ = makeString( "~&implausible-admitted-argument?: ~A~%" );
    $sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_ = makeSymbol( "*IMPLAUSIBLE-ADMITTED-ARGUMENT?-CACHING-STATE*" );
    $str128$__do_tva_query_type_type___A__ = makeString( "~&do-tva-query-type-type: ~A~%" );
    $sym129$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_ = makeSymbol( "*DO-TVA-QUERY-TYPE-TYPE-CACHING-STATE*" );
    $str130$__do_tva_query_type_disjoint_with = makeString( "~&do-tva-query-type-disjoint-with: ~A~%" );
    $sym131$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_ = makeSymbol( "*DO-TVA-QUERY-TYPE-DISJOINT-WITH-CACHING-STATE*" );
    $sym132$TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS = makeSymbol( "TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS" );
    $int133$4096 = makeInteger( 4096 );
    $sym134$IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED = makeSymbol( "IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED" );
    $const135$relationNotExistsExists = constant_handles.reader_make_constant_shell( makeString( "relationNotExistsExists" ) );
    $sym136$IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED = makeSymbol( "IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED" );
    $const137$relationAllExists = constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) );
    $const138$someTypePlaysRoleInSituationType = constant_handles.reader_make_constant_shell( makeString( "someTypePlaysRoleInSituationType" ) );
    $list139 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PartiallyTangible" ) ) );
    $kw140$NONE = makeKeyword( "NONE" );
    $list141 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "JUSTIFICATION" ) );
    $sym142$TVA_CHECK_CACHED = makeSymbol( "TVA-CHECK-CACHED" );
    $sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_ = makeSymbol( "IMPLAUSIBLE-ADMITTED-ARGUMENT?" );
    $sym144$INTEGERP = makeSymbol( "INTEGERP" );
    $int145$8192 = makeInteger( 8192 );
    $str146$hl_justify_asent_not_legal_to_cal = makeString( "hl-justify-asent not legal to call within inference to avoid infinite recursion" );
    $list147 = ConsesLow.list( makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "RETURN" ), makeKeyword( "SUPPORTS" ), makeKeyword( "RESULT-UNIQUENESS" ), makeKeyword( "PROOF" ), makeKeyword(
        "MAX-NUMBER" ), ONE_INTEGER );
    $kw148$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $str149$Could_not_find_hl_support_for__S_ = makeString( "Could not find hl-support for ~S in ~S, using :OPAQUE" );
  }
}
/*
 * 
 * Total time: 1045 ms
 * 
 */