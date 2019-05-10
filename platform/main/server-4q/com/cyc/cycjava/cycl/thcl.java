package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class thcl
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.thcl";
  public static final String myFingerPrint = "4606d88bb56ce1d7dfda906cf0f6e6fc2655b39fdd176840ffd903312bbd3cb1";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1717L)
  private static SubLSymbol $thcl_generality_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1892L)
  private static SubLSymbol $thcl_kb_subset_collection$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2039L)
  public static SubLSymbol $thcl_forts_by_fiat$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8935L)
  private static SubLSymbol $thcl_pred_argument_types_for_non_definitional_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10244L)
  private static SubLSymbol $fort_passes_cached_thcl_testsP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10394L)
  private static SubLSymbol $thcl_filter_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10914L)
  private static SubLSymbol $thcl_nart_filter_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10971L)
  private static SubLSymbol $thcl_quoted_filter_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11143L)
  private static SubLSymbol $thcl_quoted_filter_exceptions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11210L)
  private static SubLSymbol $thcl_genls_filter_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13168L)
  private static SubLSymbol $random_thcl_assertion_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14707L)
  private static SubLSymbol $ke_irrelevant_termP_via_inference_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14904L)
  private static SubLSymbol $clarifying_collectionP_caching_state$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$MESSAGE;
  private static final SubLSymbol $sym4$DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE;
  private static final SubLSymbol $sym5$DO_FORTS;
  private static final SubLSymbol $sym6$PWHEN;
  private static final SubLSymbol $sym7$THCL_FORT_;
  private static final SubLSymbol $sym8$PCOND;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$STRINGP;
  private static final SubLInteger $int11$1000;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$CLET;
  private static final SubLSymbol $sym14$_THCL_FORTS_BY_FIAT_;
  private static final SubLSymbol $sym15$CONS;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$FIF;
  private static final SubLSymbol $sym19$FORT_P;
  private static final SubLSymbol $sym20$EASILY_UNDERSTOOD_BY_HUMANS;
  private static final SubLString $str21$_is_a_THCL_FORT_by_fiat__cf___THC;
  private static final SubLString $str22$_is_not_a_FORT_;
  private static final SubLString $str23$RKF_irrelevance_cache_says_;
  private static final SubLString $str24$_is_not_THCL_;
  private static final SubLSymbol $sym25$COMPUTE_THCL_STATUS_OF_FORT;
  private static final SubLString $str26$_is_a_predicate;
  private static final SubLString $str27$_is_a_functor;
  private static final SubLString $str28$_is_a_logical_operator;
  private static final SubLString $str29$_is_a_microtheory;
  private static final SubLString $str30$Allowing_;
  private static final SubLString $str31$__because_it_is_a_ClarifyingColle;
  private static final SubLString $str32$_is_too_general__generality___;
  private static final SubLString $str33$__vs_cutoff_of_;
  private static final SubLString $str34$_;
  private static final SubLString $str35$_fails_the_THCL_KB_subset_test;
  private static final SubLString $str36$_fails_a_cached_test;
  private static final SubLString $str37$Sentence_arity_is_less_than_2____;
  private static final SubLString $str38$Sentence_uses_a_function_and_its_;
  private static final SubLObject $const39$CandidateForPredicatePopulation;
  private static final SubLString $str40$Non_THCL_arg___S;
  private static final SubLList $list41;
  private static final SubLObject $const42$UniversalVocabularyMt;
  private static final SubLObject $const43$QuantificationalRuleMacroPredicat;
  private static final SubLObject $const44$valueOfFunctionForArgs;
  private static final SubLSymbol $sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE;
  private static final SubLObject $const46$InferencePSC;
  private static final SubLSymbol $sym47$_FN;
  private static final SubLObject $const48$functionCorrespondingPredicate_Ge;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLObject $const51$BaseKB;
  private static final SubLString $str52$_S_is_RKF_irrelevant_in___BaseKB_;
  private static final SubLObject $const53$IntermediateVocabPredicate;
  private static final SubLString $str54$_S_is_an___IntermediateVocabPredi;
  private static final SubLObject $const55$CycLTerm;
  private static final SubLSymbol $sym56$GENL_;
  private static final SubLList $list57;
  private static final SubLString $str58$_S_has_a_quoted___CycLTerm_argume;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$NON_THCL_ARG_;
  private static final SubLObject $const61$ResearchCycDefinitionalPredicate;
  private static final SubLString $str62$Allowing__S_as_arg_of_non_definit;
  private static final SubLObject $const63$genlPreds;
  private static final SubLInteger $int64$500;
  private static final SubLString $str65$Allowing__S_as_arg_of___genlPreds;
  private static final SubLString $str66$Non_thcl_arg___S;
  private static final SubLSymbol $sym67$FORT_PASSES_CACHED_THCL_TESTS_;
  private static final SubLSymbol $sym68$_FORT_PASSES_CACHED_THCL_TESTS__CACHING_STATE_;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLObject $const73$highlyRelevantTerm;
  private static final SubLString $str74$_S_is_a___highlyRelevantTerm__so_;
  private static final SubLObject $const75$True_JustificationTruth;
  private static final SubLString $str76$_S_is_an_instance_of____S;
  private static final SubLString $str77$_S_is_a_NART_and_is_an_instance_o;
  private static final SubLString $str78$_S_is_a_lexical_word;
  private static final SubLString $str79$_S_is_a_quoted_instance_of_one_of;
  private static final SubLList $list80;
  private static final SubLString $str81$_S_was_created_by__S;
  private static final SubLObject $const82$CollectionType;
  private static final SubLString $str83$_S_is_either_a___CollectionType_o;
  private static final SubLObject $const84$CurrentWorldDataCollectorMt_NonHo;
  private static final SubLSymbol $sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE;
  private static final SubLObject $const86$keIrrelevantTerm;
  private static final SubLSymbol $sym87$_KE_IRRELEVANT_TERM__VIA_INFERENCE_CACHING_STATE_;
  private static final SubLInteger $int88$10000;
  private static final SubLSymbol $sym89$CLARIFYING_COLLECTION_;
  private static final SubLObject $const90$ClarifyingCollectionType;
  private static final SubLSymbol $sym91$_CLARIFYING_COLLECTION__CACHING_STATE_;
  private static final SubLSymbol $sym92$CLEAR_CLARIFYING_COLLECTION_;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 844L)
  public static SubLObject do_thcl_forts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject fort = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    fort = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject message_tail = cdestructuring_bind.property_list_member( $kw3$MESSAGE, current );
    final SubLObject message = ( NIL != message_tail ) ? conses_high.cadr( message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_supports_thclP() )
    {
      return ConsesLow.listS( $sym4$DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE, ConsesLow.list( fort, message ), ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.list( $sym5$DO_FORTS, ConsesLow.list( fort, message ), ConsesLow.listS( $sym6$PWHEN, ConsesLow.list( $sym7$THCL_FORT_, fort ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1238L)
  public static SubLObject do_thcl_forts_2(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject fort = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    fort = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$2, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject message_tail = cdestructuring_bind.property_list_member( $kw3$MESSAGE, current );
    final SubLObject message = ( NIL != message_tail ) ? conses_high.cadr( message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym8$PCOND, ConsesLow.list( $list9, ConsesLow.listS( $sym4$DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE, ConsesLow.list( fort, message ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list(
        ConsesLow.list( $sym10$STRINGP, message ), ConsesLow.list( $sym5$DO_FORTS, ConsesLow.list( fort, message ), ConsesLow.listS( $sym6$PWHEN, ConsesLow.list( $sym7$THCL_FORT_, fort ), ConsesLow.append( body,
            NIL ) ) ) ), ConsesLow.list( T, ConsesLow.list( $sym5$DO_FORTS, ConsesLow.list( fort ), ConsesLow.listS( $sym6$PWHEN, ConsesLow.list( $sym7$THCL_FORT_, fort ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2088L)
  public static SubLObject with_thcl_fort(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject fort = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    fort = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym13$CLET, ConsesLow.list( ConsesLow.list( $sym14$_THCL_FORTS_BY_FIAT_, ConsesLow.listS( $sym15$CONS, fort, $list16 ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2229L)
  public static SubLObject possibly_with_thcl_fort(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject maybe_fort = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    maybe_fort = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym13$CLET, ConsesLow.list( ConsesLow.list( $sym14$_THCL_FORTS_BY_FIAT_, ConsesLow.listS( $sym18$FIF, ConsesLow.list( $sym19$FORT_P, maybe_fort ), ConsesLow.listS( $sym15$CONS, maybe_fort,
          $list16 ), $list16 ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2454L)
  public static SubLObject thcl_constantP(final SubLObject v_object, SubLObject warnP)
  {
    if( warnP == UNPROVIDED )
    {
      warnP = NIL;
    }
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && NIL != thcl_fortP( v_object, warnP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2668L)
  public static SubLObject easily_understood_by_humans(final SubLObject v_object)
  {
    return thcl_fortP( v_object, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2759L)
  public static SubLObject not_thcl_fortP(final SubLObject obj, final SubLObject mt, SubLObject warnP)
  {
    if( warnP == UNPROVIDED )
    {
      warnP = NIL;
    }
    return makeBoolean( NIL == thcl_fortP( obj, warnP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2871L)
  public static SubLObject thcl_fortP(final SubLObject v_object, SubLObject warnP)
  {
    if( warnP == UNPROVIDED )
    {
      warnP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject thcl_fortP = NIL;
    SubLObject reason = NIL;
    if( NIL != list_utilities.member_equalP( v_object, $thcl_forts_by_fiat$.getDynamicValue( thread ) ) )
    {
      if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( v_object ), $str21$_is_a_THCL_FORT_by_fiat__cf___THC );
      }
      thcl_fortP = T;
    }
    else if( NIL == forts.fort_p( v_object ) )
    {
      if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( v_object ), $str22$_is_not_a_FORT_ );
      }
    }
    else if( NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_supports_thclP() )
    {
      if( NIL != rkf_irrelevant_fort_cache.rkf_irrelevant_cache_thclP( v_object ) )
      {
        thcl_fortP = T;
      }
      else if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( $str23$RKF_irrelevance_cache_says_, new SubLObject[] { format_nil.format_nil_s_no_copy( v_object ), $str24$_is_not_THCL_
        } );
      }
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject thcl_fortP_$3 = compute_thcl_status_of_fort( v_object, warnP, NIL, UNPROVIDED );
      final SubLObject reason_$4 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      thcl_fortP = thcl_fortP_$3;
      reason = reason_$4;
    }
    if( NIL != warnP && reason.isString() )
    {
      Errors.warn( reason );
    }
    return thcl_fortP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3793L)
  public static SubLObject compute_thcl_status_of_fort_internal(final SubLObject fort, final SubLObject warnP, SubLObject assume_ke_relevantP, SubLObject generality_cutoff)
  {
    if( assume_ke_relevantP == UNPROVIDED )
    {
      assume_ke_relevantP = NIL;
    }
    if( generality_cutoff == UNPROVIDED )
    {
      generality_cutoff = $thcl_generality_cutoff$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject thcl_fortP = NIL;
    SubLObject reason = NIL;
    if( NIL != fort_types_interface.predicate_p( fort ) )
    {
      if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( fort ), $str26$_is_a_predicate );
      }
    }
    else if( NIL != fort_types_interface.functor_p( fort ) )
    {
      if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( fort ), $str27$_is_a_functor );
      }
    }
    else if( NIL != cycl_grammar.cycl_logical_operator_p( fort ) )
    {
      if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( fort ), $str28$_is_a_logical_operator );
      }
    }
    else if( NIL != fort_types_interface.microtheory_p( fort ) )
    {
      if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( fort ), $str29$_is_a_microtheory );
      }
    }
    else if( NIL != clarifying_collectionP( fort, UNPROVIDED ) )
    {
      thcl_fortP = T;
      if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( $str30$Allowing_, new SubLObject[] { format_nil.format_nil_s_no_copy( fort ), $str31$__because_it_is_a_ClarifyingColle
        } );
      }
    }
    else if( cardinality_estimates.generality_estimate( fort ).numG( generality_cutoff ) )
    {
      if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( fort ), new SubLObject[] { $str32$_is_too_general__generality___, format_nil.format_nil_s_no_copy( cardinality_estimates.generality_estimate(
            fort ) ), $str33$__vs_cutoff_of_, format_nil.format_nil_s_no_copy( $thcl_generality_cutoff$.getDynamicValue( thread ) ), $str34$_
        } );
      }
    }
    else if( NIL == fort_passes_thcl_kb_subset_testP( fort ) )
    {
      if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( fort ), $str35$_fails_the_THCL_KB_subset_test );
      }
    }
    else if( NIL == fort_passes_cached_thcl_testsP( fort ) )
    {
      if( NIL != warnP )
      {
        reason = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( fort ), $str36$_fails_a_cached_test );
        thcl_filter_fortP( fort, T );
      }
    }
    else
    {
      thcl_fortP = T;
    }
    return Values.values( thcl_fortP, reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3793L)
  public static SubLObject compute_thcl_status_of_fort(final SubLObject fort, final SubLObject warnP, SubLObject assume_ke_relevantP, SubLObject generality_cutoff)
  {
    if( assume_ke_relevantP == UNPROVIDED )
    {
      assume_ke_relevantP = NIL;
    }
    if( generality_cutoff == UNPROVIDED )
    {
      generality_cutoff = $thcl_generality_cutoff$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return compute_thcl_status_of_fort_internal( fort, warnP, assume_ke_relevantP, generality_cutoff );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym25$COMPUTE_THCL_STATUS_OF_FORT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym25$COMPUTE_THCL_STATUS_OF_FORT, FOUR_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym25$COMPUTE_THCL_STATUS_OF_FORT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( fort, warnP, assume_ke_relevantP, generality_cutoff );
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
        if( fort.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( warnP.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( assume_ke_relevantP.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && generality_cutoff.eql( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( compute_thcl_status_of_fort_internal( fort, warnP, assume_ke_relevantP, generality_cutoff ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( fort, warnP, assume_ke_relevantP, generality_cutoff ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5494L)
  public static SubLObject fort_passes_thcl_kb_subset_testP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == constant_handles.valid_constantP( $thcl_kb_subset_collection$.getDynamicValue( thread ), UNPROVIDED ) || NIL != isa.quoted_isa_in_any_mtP( fort, $thcl_kb_subset_collection$.getDynamicValue(
        thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5677L)
  public static SubLObject thcl_formulaP(final SubLObject formula, SubLObject warnP)
  {
    if( warnP == UNPROVIDED )
    {
      warnP = NIL;
    }
    SubLObject badP = NIL;
    if( NIL != collection_defns.cycl_sentenceP( formula ) && el_utilities.formula_arity( formula, UNPROVIDED ).numL( TWO_INTEGER ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str37$Sentence_arity_is_less_than_2____, formula );
      }
      badP = T;
    }
    else if( NIL != function_corresponding_predicate_sentenceP( formula ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str38$Sentence_uses_a_function_and_its_, formula );
      }
      badP = T;
    }
    SubLObject list_var = NIL;
    SubLObject arg = NIL;
    SubLObject argnum = NIL;
    list_var = cycl_utilities.formula_terms( formula, UNPROVIDED );
    arg = list_var.first();
    for( argnum = ZERO_INTEGER; NIL == badP && NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = Numbers.add( ONE_INTEGER, argnum ) )
    {
      if( argnum.isZero() && NIL != isa.isa_in_any_mtP( arg, $const39$CandidateForPredicatePopulation ) )
      {
        return T;
      }
      if( NIL != thcl_functor_argP( arg, argnum, formula, warnP ) )
      {
        badP = non_thcl_functorP( arg, warnP );
      }
      else
      {
        badP = non_thcl_argP( arg, argnum, formula, warnP );
      }
      if( NIL != badP && NIL != warnP )
      {
        Errors.warn( $str40$Non_THCL_arg___S, arg );
      }
    }
    return makeBoolean( NIL == badP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6642L)
  public static SubLObject thcl_functor_argP(final SubLObject arg, final SubLObject argnum, final SubLObject formula, final SubLObject warnP)
  {
    if( argnum.isZero() )
    {
      return T;
    }
    if( argnum.eql( THREE_INTEGER ) && NIL != isa.isa_anyP( cycl_utilities.formula_arg0( formula ), $list41, $const42$UniversalVocabularyMt, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != fort_types_interface.rule_macro_predicate_p( cycl_utilities.formula_arg0( formula ) ) && NIL != forts.fort_p( arg ) && NIL != fort_types_interface.predicate_p( arg ) && ONE_INTEGER.eql( argnum )
        && NIL != isa.isa_in_any_mtP( cycl_utilities.formula_arg0( formula ), $const43$QuantificationalRuleMacroPredicat ) )
    {
      return T;
    }
    if( ONE_INTEGER.eql( argnum ) && $const44$valueOfFunctionForArgs.eql( cycl_utilities.formula_arg0( formula ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7340L)
  public static SubLObject function_corresponding_predicate_sentenceP(final SubLObject formula)
  {
    SubLObject ans = NIL;
    if( NIL != collection_defns.cycl_sentenceP( formula ) && NIL != el_utilities.groundP( formula, UNPROVIDED ) && ( NIL != assertions_high.atomic_assertionP( formula ) || NIL != el_utilities.atomic_sentenceP(
        formula ) ) && NIL == ans )
    {
      SubLObject csome_list_var = functions_corresponding_to_predicate( cycl_utilities.formula_arg0( formula ), UNPROVIDED );
      SubLObject fn = NIL;
      fn = csome_list_var.first();
      while ( NIL == ans && NIL != csome_list_var)
      {
        if( NIL != cycl_utilities.expression_find( fn, formula, T, UNPROVIDED, UNPROVIDED ) )
        {
          ans = T;
        }
        csome_list_var = csome_list_var.rest();
        fn = csome_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7729L)
  public static SubLObject functions_corresponding_to_predicate_internal(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const46$InferencePSC;
    }
    return ask_utilities.query_variable( $sym47$_FN, ConsesLow.listS( $const48$functionCorrespondingPredicate_Ge, $sym47$_FN, predicate, $list49 ), mt, $list50 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7729L)
  public static SubLObject functions_corresponding_to_predicate(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const46$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return functions_corresponding_to_predicate_internal( predicate, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( predicate, mt );
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
        if( predicate.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( functions_corresponding_to_predicate_internal( predicate, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( predicate, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8007L)
  public static SubLObject non_thcl_functorP(final SubLObject functor, SubLObject warnP)
  {
    if( warnP == UNPROVIDED )
    {
      warnP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.member_equalP( functor, $thcl_forts_by_fiat$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    if( NIL == forts.fort_p( functor ) )
    {
      return T;
    }
    if( NIL != rkf_relevance_utilities.rkf_irrelevant_term( functor, $const51$BaseKB ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str52$_S_is_RKF_irrelevant_in___BaseKB_, functor );
      }
      return T;
    }
    if( NIL != lexicon_vars.name_string_predP( functor ) )
    {
      return T;
    }
    if( NIL != lexicon_accessors.speech_part_predP( functor, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != isa.isa_in_any_mtP( functor, $const53$IntermediateVocabPredicate ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str54$_S_is_an___IntermediateVocabPredi, functor );
      }
      return T;
    }
    if( NIL == fort_passes_thcl_kb_subset_testP( functor ) )
    {
      return T;
    }
    if( NIL != kb_accessors.some_quoted_argumentP( functor ) && NIL != conses_high.member( $const55$CycLTerm, kb_accessors.arg_isa( functor, UNPROVIDED ), Symbols.symbol_function( $sym56$GENL_ ), UNPROVIDED )
        && NIL == conses_high.member( functor, $list57, Symbols.symbol_function( EQL ), UNPROVIDED ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str58$_S_has_a_quoted___CycLTerm_argume, functor );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9108L)
  public static SubLObject non_thcl_argP_internal(final SubLObject arg, final SubLObject argnum, final SubLObject formula, SubLObject warnP)
  {
    if( warnP == UNPROVIDED )
    {
      warnP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject thclP = NIL;
    if( NIL != thcl_fortP( arg, makeBoolean( NIL != warnP && NIL != forts.fort_p( arg ) ) ) )
    {
      thclP = T;
    }
    else if( NIL != fort_types_interface.predicate_p( arg ) && NIL != isa.isa_anyP( arg, $thcl_pred_argument_types_for_non_definitional_preds$.getDynamicValue( thread ), $const42$UniversalVocabularyMt, UNPROVIDED )
        && NIL == isa.isa_in_any_mtP( cycl_utilities.formula_arg0( formula ), $const61$ResearchCycDefinitionalPredicate ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str62$Allowing__S_as_arg_of_non_definit, arg, cycl_utilities.formula_arg0( formula ) );
      }
      thclP = T;
    }
    else if( NIL != fort_types_interface.predicate_p( arg ) && cycl_utilities.formula_arg0( formula ).eql( $const63$genlPreds ) && cardinality_estimates.generality_estimate( arg ).numL( $int64$500 ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str65$Allowing__S_as_arg_of___genlPreds, arg );
      }
      thclP = T;
    }
    else if( NIL != forts.fort_p( arg ) )
    {
      thclP = NIL;
    }
    else if( arg.isString() )
    {
      thclP = T;
    }
    else if( arg.isNumber() )
    {
      thclP = T;
    }
    else if( NIL != cycl_variables.el_varP( arg ) )
    {
      thclP = T;
    }
    else if( NIL != el_utilities.el_formula_p( arg ) )
    {
      thclP = thcl_formulaP( arg, warnP );
    }
    if( NIL == thclP && NIL != warnP )
    {
      Errors.warn( $str66$Non_thcl_arg___S, arg );
    }
    return makeBoolean( NIL == thclP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9108L)
  public static SubLObject non_thcl_argP(final SubLObject arg, final SubLObject argnum, final SubLObject formula, SubLObject warnP)
  {
    if( warnP == UNPROVIDED )
    {
      warnP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return non_thcl_argP_internal( arg, argnum, formula, warnP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym60$NON_THCL_ARG_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym60$NON_THCL_ARG_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym60$NON_THCL_ARG_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( arg, argnum, formula, warnP );
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
        if( arg.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( argnum.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( formula.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && warnP.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( non_thcl_argP_internal( arg, argnum, formula, warnP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( arg, argnum, formula, warnP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10244L)
  public static SubLObject clear_fort_passes_cached_thcl_testsP()
  {
    final SubLObject cs = $fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10244L)
  public static SubLObject remove_fort_passes_cached_thcl_testsP(final SubLObject fort)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue(), ConsesLow.list( fort ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10244L)
  public static SubLObject fort_passes_cached_thcl_testsP_internal(final SubLObject fort)
  {
    return makeBoolean( NIL == thcl_filter_fortP( fort, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10244L)
  public static SubLObject fort_passes_cached_thcl_testsP(final SubLObject fort)
  {
    SubLObject caching_state = $fort_passes_cached_thcl_testsP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym67$FORT_PASSES_CACHED_THCL_TESTS_, $sym68$_FORT_PASSES_CACHED_THCL_TESTS__CACHING_STATE_, $int64$500, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( fort_passes_cached_thcl_testsP_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11378L)
  public static SubLObject thcl_filter_fortP(final SubLObject fort, SubLObject warnP)
  {
    if( warnP == UNPROVIDED )
    {
      warnP = NIL;
    }
    SubLObject filterP = NIL;
    if( NIL != kb_mapping_utilities.some_pred_value_in_any_mt( fort, $const73$highlyRelevantTerm, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str74$_S_is_a___highlyRelevantTerm__so_, fort );
      }
    }
    else if( NIL != isa.isa_anyP( fort, $thcl_filter_collections$.getGlobalValue(), $const46$InferencePSC, $const75$True_JustificationTruth ) )
    {
      if( NIL != warnP )
      {
        SubLObject cdolist_list_var = $thcl_filter_collections$.getGlobalValue();
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != isa.isaP( fort, col, $const46$InferencePSC, $const75$True_JustificationTruth ) )
          {
            Errors.warn( $str76$_S_is_an_instance_of____S, fort, col );
          }
          cdolist_list_var = cdolist_list_var.rest();
          col = cdolist_list_var.first();
        }
      }
      filterP = T;
    }
    else if( NIL != nart_handles.nart_p( fort ) && NIL != isa.isa_anyP( fort, $thcl_nart_filter_collections$.getGlobalValue(), $const46$InferencePSC, $const75$True_JustificationTruth ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str77$_S_is_a_NART_and_is_an_instance_o, fort, $thcl_nart_filter_collections$.getGlobalValue() );
      }
      filterP = T;
    }
    else if( NIL != lexicon_accessors.quick_lexical_wordP( fort, UNPROVIDED ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str78$_S_is_a_lexical_word, fort );
      }
      filterP = T;
    }
    else if( NIL != isa.any_quoted_isaP( fort, $thcl_quoted_filter_collections$.getGlobalValue(), $const46$InferencePSC, $const75$True_JustificationTruth ) && NIL == subl_promotions.memberP( fort,
        $thcl_quoted_filter_exceptions$.getGlobalValue(), Symbols.symbol_function( EQL ), UNPROVIDED ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str79$_S_is_a_quoted_instance_of_one_of, fort, $thcl_quoted_filter_collections$.getGlobalValue() );
      }
      filterP = T;
    }
    else if( NIL != conses_high.member( bookkeeping_store.creator( fort, UNPROVIDED ), $list80, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str81$_S_was_created_by__S, bookkeeping_store.creator( fort, UNPROVIDED ) );
      }
      filterP = T;
    }
    else if( NIL != fort_types_interface.collection_p( fort ) && ( NIL != isa.isaP( fort, $const82$CollectionType, UNPROVIDED, UNPROVIDED ) || NIL != genls.any_genlP( fort, $thcl_genls_filter_collections$
        .getGlobalValue(), $const46$InferencePSC, $const75$True_JustificationTruth ) ) )
    {
      if( NIL != warnP )
      {
        Errors.warn( $str83$_S_is_either_a___CollectionType_o, $thcl_genls_filter_collections$.getGlobalValue() );
      }
      filterP = T;
    }
    return filterP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13318L)
  public static SubLObject random_thcl_assertion_mt()
  {
    return $random_thcl_assertion_mt$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13401L)
  public static SubLObject random_thcl_constant_and_assertion(SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = NIL;
    }
    return random_thcl_constant_and_assertion_int( cyclist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13533L)
  public static SubLObject random_thcl_constant_and_assertion_int(final SubLObject cyclist)
  {
    SubLObject constant = NIL;
    SubLObject assertion = NIL;
    for( final SubLObject abortP = NIL; ( NIL == constant || NIL == assertion ) && NIL == abortP; assertion = random_thcl_assertion( constant, cyclist ) )
    {
      constant = constants_high.random_constant( UNPROVIDED );
      if( NIL != thcl_constantP( constant, UNPROVIDED ) )
      {
      }
    }
    return Values.values( constant, assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13889L)
  public static SubLObject random_thcl_assertion(final SubLObject fort, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = NIL;
    }
    final SubLObject thcl_assertion = NIL;
    final SubLObject all_assertions = NIL;
    return thcl_assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14500L)
  public static SubLObject ke_irrelevant_termP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const46$InferencePSC;
    }
    return rkf_relevance_utilities.rkf_irrelevant_term( v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14707L)
  public static SubLObject clear_ke_irrelevant_termP_via_inference()
  {
    final SubLObject cs = $ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14707L)
  public static SubLObject remove_ke_irrelevant_termP_via_inference(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const46$InferencePSC;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue(), ConsesLow.list( v_term, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14707L)
  public static SubLObject ke_irrelevant_termP_via_inference_internal(final SubLObject v_term, final SubLObject mt)
  {
    return ask_utilities.query_boolean( ConsesLow.list( $const86$keIrrelevantTerm, v_term ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14707L)
  public static SubLObject ke_irrelevant_termP_via_inference(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const46$InferencePSC;
    }
    SubLObject caching_state = $ke_irrelevant_termP_via_inference_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE, $sym87$_KE_IRRELEVANT_TERM__VIA_INFERENCE_CACHING_STATE_, $int88$10000, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, mt );
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
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ke_irrelevant_termP_via_inference_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14904L)
  public static SubLObject clear_clarifying_collectionP()
  {
    final SubLObject cs = $clarifying_collectionP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14904L)
  public static SubLObject remove_clarifying_collectionP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const46$InferencePSC;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $clarifying_collectionP_caching_state$.getGlobalValue(), ConsesLow.list( v_object, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14904L)
  public static SubLObject clarifying_collectionP_internal(final SubLObject v_object, final SubLObject mt)
  {
    return isa.isaP( v_object, $const90$ClarifyingCollectionType, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14904L)
  public static SubLObject clarifying_collectionP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const46$InferencePSC;
    }
    SubLObject caching_state = $clarifying_collectionP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym89$CLARIFYING_COLLECTION_, $sym91$_CLARIFYING_COLLECTION__CACHING_STATE_, $int88$10000, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_isa_dependent_cache_clear_callback( $sym92$CLEAR_CLARIFYING_COLLECTION_ );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_object, mt );
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
        if( v_object.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( clarifying_collectionP_internal( v_object, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_object, mt ) );
    return memoization_state.caching_results( results3 );
  }

  public static SubLObject declare_thcl_file()
  {
    SubLFiles.declareMacro( me, "do_thcl_forts", "DO-THCL-FORTS" );
    SubLFiles.declareMacro( me, "do_thcl_forts_2", "DO-THCL-FORTS-2" );
    SubLFiles.declareMacro( me, "with_thcl_fort", "WITH-THCL-FORT" );
    SubLFiles.declareMacro( me, "possibly_with_thcl_fort", "POSSIBLY-WITH-THCL-FORT" );
    SubLFiles.declareFunction( me, "thcl_constantP", "THCL-CONSTANT?", 1, 1, false );
    SubLFiles.declareFunction( me, "easily_understood_by_humans", "EASILY-UNDERSTOOD-BY-HUMANS", 1, 0, false );
    SubLFiles.declareFunction( me, "not_thcl_fortP", "NOT-THCL-FORT?", 2, 1, false );
    SubLFiles.declareFunction( me, "thcl_fortP", "THCL-FORT?", 1, 1, false );
    SubLFiles.declareFunction( me, "compute_thcl_status_of_fort_internal", "COMPUTE-THCL-STATUS-OF-FORT-INTERNAL", 2, 2, false );
    SubLFiles.declareFunction( me, "compute_thcl_status_of_fort", "COMPUTE-THCL-STATUS-OF-FORT", 2, 2, false );
    SubLFiles.declareFunction( me, "fort_passes_thcl_kb_subset_testP", "FORT-PASSES-THCL-KB-SUBSET-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "thcl_formulaP", "THCL-FORMULA?", 1, 1, false );
    SubLFiles.declareFunction( me, "thcl_functor_argP", "THCL-FUNCTOR-ARG?", 4, 0, false );
    SubLFiles.declareFunction( me, "function_corresponding_predicate_sentenceP", "FUNCTION-CORRESPONDING-PREDICATE-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "functions_corresponding_to_predicate_internal", "FUNCTIONS-CORRESPONDING-TO-PREDICATE-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "functions_corresponding_to_predicate", "FUNCTIONS-CORRESPONDING-TO-PREDICATE", 1, 1, false );
    SubLFiles.declareFunction( me, "non_thcl_functorP", "NON-THCL-FUNCTOR?", 1, 1, false );
    SubLFiles.declareFunction( me, "non_thcl_argP_internal", "NON-THCL-ARG?-INTERNAL", 3, 1, false );
    SubLFiles.declareFunction( me, "non_thcl_argP", "NON-THCL-ARG?", 3, 1, false );
    SubLFiles.declareFunction( me, "clear_fort_passes_cached_thcl_testsP", "CLEAR-FORT-PASSES-CACHED-THCL-TESTS?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_fort_passes_cached_thcl_testsP", "REMOVE-FORT-PASSES-CACHED-THCL-TESTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_passes_cached_thcl_testsP_internal", "FORT-PASSES-CACHED-THCL-TESTS?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_passes_cached_thcl_testsP", "FORT-PASSES-CACHED-THCL-TESTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "thcl_filter_fortP", "THCL-FILTER-FORT?", 1, 1, false );
    SubLFiles.declareFunction( me, "random_thcl_assertion_mt", "RANDOM-THCL-ASSERTION-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "random_thcl_constant_and_assertion", "RANDOM-THCL-CONSTANT-AND-ASSERTION", 0, 1, false );
    SubLFiles.declareFunction( me, "random_thcl_constant_and_assertion_int", "RANDOM-THCL-CONSTANT-AND-ASSERTION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "random_thcl_assertion", "RANDOM-THCL-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "ke_irrelevant_termP", "KE-IRRELEVANT-TERM?", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_ke_irrelevant_termP_via_inference", "CLEAR-KE-IRRELEVANT-TERM?-VIA-INFERENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ke_irrelevant_termP_via_inference", "REMOVE-KE-IRRELEVANT-TERM?-VIA-INFERENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "ke_irrelevant_termP_via_inference_internal", "KE-IRRELEVANT-TERM?-VIA-INFERENCE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "ke_irrelevant_termP_via_inference", "KE-IRRELEVANT-TERM?-VIA-INFERENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_clarifying_collectionP", "CLEAR-CLARIFYING-COLLECTION?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_clarifying_collectionP", "REMOVE-CLARIFYING-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "clarifying_collectionP_internal", "CLARIFYING-COLLECTION?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "clarifying_collectionP", "CLARIFYING-COLLECTION?", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_thcl_file()
  {
    $thcl_generality_cutoff$ = SubLFiles.defparameter( "*THCL-GENERALITY-CUTOFF*", $int11$1000 );
    $thcl_kb_subset_collection$ = SubLFiles.defparameter( "*THCL-KB-SUBSET-COLLECTION*", NIL );
    $thcl_forts_by_fiat$ = SubLFiles.defparameter( "*THCL-FORTS-BY-FIAT*", NIL );
    $thcl_pred_argument_types_for_non_definitional_preds$ = SubLFiles.defparameter( "*THCL-PRED-ARGUMENT-TYPES-FOR-NON-DEFINITIONAL-PREDS*", $list59 );
    $fort_passes_cached_thcl_testsP_caching_state$ = SubLFiles.deflexical( "*FORT-PASSES-CACHED-THCL-TESTS?-CACHING-STATE*", NIL );
    $thcl_filter_collections$ = SubLFiles.deflexical( "*THCL-FILTER-COLLECTIONS*", $list69 );
    $thcl_nart_filter_collections$ = SubLFiles.deflexical( "*THCL-NART-FILTER-COLLECTIONS*", NIL );
    $thcl_quoted_filter_collections$ = SubLFiles.deflexical( "*THCL-QUOTED-FILTER-COLLECTIONS*", $list70 );
    $thcl_quoted_filter_exceptions$ = SubLFiles.deflexical( "*THCL-QUOTED-FILTER-EXCEPTIONS*", $list71 );
    $thcl_genls_filter_collections$ = SubLFiles.deflexical( "*THCL-GENLS-FILTER-COLLECTIONS*", $list72 );
    $random_thcl_assertion_mt$ = SubLFiles.deflexical( "*RANDOM-THCL-ASSERTION-MT*", $const84$CurrentWorldDataCollectorMt_NonHo );
    $ke_irrelevant_termP_via_inference_caching_state$ = SubLFiles.deflexical( "*KE-IRRELEVANT-TERM?-VIA-INFERENCE-CACHING-STATE*", NIL );
    $clarifying_collectionP_caching_state$ = SubLFiles.deflexical( "*CLARIFYING-COLLECTION?-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_thcl_file()
  {
    utilities_macros.register_kb_function( $sym20$EASILY_UNDERSTOOD_BY_HUMANS );
    memoization_state.note_memoized_function( $sym25$COMPUTE_THCL_STATUS_OF_FORT );
    memoization_state.note_memoized_function( $sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE );
    memoization_state.note_memoized_function( $sym60$NON_THCL_ARG_ );
    memoization_state.note_globally_cached_function( $sym67$FORT_PASSES_CACHED_THCL_TESTS_ );
    memoization_state.note_globally_cached_function( $sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE );
    memoization_state.note_globally_cached_function( $sym89$CLARIFYING_COLLECTION_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_thcl_file();
  }

  @Override
  public void initializeVariables()
  {
    init_thcl_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_thcl_file();
  }
  static
  {
    me = new thcl();
    $thcl_generality_cutoff$ = null;
    $thcl_kb_subset_collection$ = null;
    $thcl_forts_by_fiat$ = null;
    $thcl_pred_argument_types_for_non_definitional_preds$ = null;
    $fort_passes_cached_thcl_testsP_caching_state$ = null;
    $thcl_filter_collections$ = null;
    $thcl_nart_filter_collections$ = null;
    $thcl_quoted_filter_collections$ = null;
    $thcl_quoted_filter_exceptions$ = null;
    $thcl_genls_filter_collections$ = null;
    $random_thcl_assertion_mt$ = null;
    $ke_irrelevant_termP_via_inference_caching_state$ = null;
    $clarifying_collectionP_caching_state$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&KEY" ), makeSymbol( "MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "MESSAGE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$MESSAGE = makeKeyword( "MESSAGE" );
    $sym4$DO_THCL_FORTS_FROM_RKF_IRRELEVANCE_CACHE = makeSymbol( "DO-THCL-FORTS-FROM-RKF-IRRELEVANCE-CACHE" );
    $sym5$DO_FORTS = makeSymbol( "DO-FORTS" );
    $sym6$PWHEN = makeSymbol( "PWHEN" );
    $sym7$THCL_FORT_ = makeSymbol( "THCL-FORT?" );
    $sym8$PCOND = makeSymbol( "PCOND" );
    $list9 = ConsesLow.list( makeSymbol( "FWHEN-FEATURE" ), makeKeyword( "CYC-RKF" ), ConsesLow.list( makeSymbol( "RKF-IRRELEVANT-CACHE-SUPPORTS-THCL?" ) ) );
    $sym10$STRINGP = makeSymbol( "STRINGP" );
    $int11$1000 = makeInteger( 1000 );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym13$CLET = makeSymbol( "CLET" );
    $sym14$_THCL_FORTS_BY_FIAT_ = makeSymbol( "*THCL-FORTS-BY-FIAT*" );
    $sym15$CONS = makeSymbol( "CONS" );
    $list16 = ConsesLow.list( makeSymbol( "*THCL-FORTS-BY-FIAT*" ) );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "MAYBE-FORT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym18$FIF = makeSymbol( "FIF" );
    $sym19$FORT_P = makeSymbol( "FORT-P" );
    $sym20$EASILY_UNDERSTOOD_BY_HUMANS = makeSymbol( "EASILY-UNDERSTOOD-BY-HUMANS" );
    $str21$_is_a_THCL_FORT_by_fiat__cf___THC = makeString( " is a THCL FORT by fiat (cf. *THCL-FORTS-BY-FIAT*)" );
    $str22$_is_not_a_FORT_ = makeString( " is not a FORT." );
    $str23$RKF_irrelevance_cache_says_ = makeString( "RKF irrelevance cache says " );
    $str24$_is_not_THCL_ = makeString( " is not THCL." );
    $sym25$COMPUTE_THCL_STATUS_OF_FORT = makeSymbol( "COMPUTE-THCL-STATUS-OF-FORT" );
    $str26$_is_a_predicate = makeString( " is a predicate" );
    $str27$_is_a_functor = makeString( " is a functor" );
    $str28$_is_a_logical_operator = makeString( " is a logical operator" );
    $str29$_is_a_microtheory = makeString( " is a microtheory" );
    $str30$Allowing_ = makeString( "Allowing " );
    $str31$__because_it_is_a_ClarifyingColle = makeString( ", because it is a ClarifyingCollectionType" );
    $str32$_is_too_general__generality___ = makeString( " is too general (generality = " );
    $str33$__vs_cutoff_of_ = makeString( ", vs cutoff of " );
    $str34$_ = makeString( ")" );
    $str35$_fails_the_THCL_KB_subset_test = makeString( " fails the THCL KB subset test" );
    $str36$_fails_a_cached_test = makeString( " fails a cached test" );
    $str37$Sentence_arity_is_less_than_2____ = makeString( "Sentence arity is less than 2:~% ~S" );
    $str38$Sentence_uses_a_function_and_its_ = makeString( "Sentence uses a function and its corresponding predicate:~% ~S" );
    $const39$CandidateForPredicatePopulation = constant_handles.reader_make_constant_shell( makeString( "CandidateForPredicatePopulation" ) );
    $str40$Non_THCL_arg___S = makeString( "Non-THCL arg: ~S" );
    $list41 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CapabilityPredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "IncapabilityPredicate" ) ) );
    $const42$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const43$QuantificationalRuleMacroPredicat = constant_handles.reader_make_constant_shell( makeString( "QuantificationalRuleMacroPredicate-Canonical" ) );
    $const44$valueOfFunctionForArgs = constant_handles.reader_make_constant_shell( makeString( "valueOfFunctionForArgs" ) );
    $sym45$FUNCTIONS_CORRESPONDING_TO_PREDICATE = makeSymbol( "FUNCTIONS-CORRESPONDING-TO-PREDICATE" );
    $const46$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym47$_FN = makeSymbol( "?FN" );
    $const48$functionCorrespondingPredicate_Ge = constant_handles.reader_make_constant_shell( makeString( "functionCorrespondingPredicate-Generic" ) );
    $list49 = ConsesLow.list( makeSymbol( "?N" ) );
    $list50 = ConsesLow.list( makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $const51$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $str52$_S_is_RKF_irrelevant_in___BaseKB_ = makeString( "~S is RKF-irrelevant in #$BaseKB." );
    $const53$IntermediateVocabPredicate = constant_handles.reader_make_constant_shell( makeString( "IntermediateVocabPredicate" ) );
    $str54$_S_is_an___IntermediateVocabPredi = makeString( "~S is an #$IntermediateVocabPredicate." );
    $const55$CycLTerm = constant_handles.reader_make_constant_shell( makeString( "CycLTerm" ) );
    $sym56$GENL_ = makeSymbol( "GENL?" );
    $list57 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ) );
    $str58$_S_has_a_quoted___CycLTerm_argume = makeString( "~S has a quoted #$CycLTerm argument." );
    $list59 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BinaryRolePredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "VectorOrQuantitySlot" ) ), constant_handles
        .reader_make_constant_shell( makeString( "KindLevelPredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "CapabilityPredicate" ) ) );
    $sym60$NON_THCL_ARG_ = makeSymbol( "NON-THCL-ARG?" );
    $const61$ResearchCycDefinitionalPredicate = constant_handles.reader_make_constant_shell( makeString( "ResearchCycDefinitionalPredicate" ) );
    $str62$Allowing__S_as_arg_of_non_definit = makeString( "Allowing ~S as arg of non-definitional predicate ~S" );
    $const63$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $int64$500 = makeInteger( 500 );
    $str65$Allowing__S_as_arg_of___genlPreds = makeString( "Allowing ~S as arg of #$genlPreds" );
    $str66$Non_thcl_arg___S = makeString( "Non-thcl arg: ~S" );
    $sym67$FORT_PASSES_CACHED_THCL_TESTS_ = makeSymbol( "FORT-PASSES-CACHED-THCL-TESTS?" );
    $sym68$_FORT_PASSES_CACHED_THCL_TESTS__CACHING_STATE_ = makeSymbol( "*FORT-PASSES-CACHED-THCL-TESTS?-CACHING-STATE*" );
    $list69 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "DocumentationConstant" ) ), constant_handles.reader_make_constant_shell( makeString( "Format" ) ),
      constant_handles.reader_make_constant_shell( makeString( "ComputerCode" ) ), constant_handles.reader_make_constant_shell( makeString( "CycLQuerySpecification" ) ), constant_handles.reader_make_constant_shell(
          makeString( "Assignment-Specification" ) ), constant_handles.reader_make_constant_shell( makeString( "Allotment" ) ), constant_handles.reader_make_constant_shell( makeString( "Evaluating" ) ), constant_handles
              .reader_make_constant_shell( makeString( "KEInteractionResource" ) ), constant_handles.reader_make_constant_shell( makeString( "KBContentTest" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "CharacterString" ) ), constant_handles.reader_make_constant_shell( makeString( "ComputerVulnerabilityReport-CW" ) ), constant_handles.reader_make_constant_shell( makeString( "BugReport" ) ),
      constant_handles.reader_make_constant_shell( makeString( "BugzillaBugReportType" ) ), constant_handles.reader_make_constant_shell( makeString( "Allotment" ) ), constant_handles.reader_make_constant_shell(
          makeString( "WordNetSynset" ) ), constant_handles.reader_make_constant_shell( makeString( "DealingWithAStringInNounLearnerTool" ) ), constant_handles.reader_make_constant_shell( makeString(
              "SoftwareAgentCommunicating" ) ), constant_handles.reader_make_constant_shell( makeString( "KBContentTest" ) ), constant_handles.reader_make_constant_shell( makeString( "CoaDiagramObject" ) ),
      constant_handles.reader_make_constant_shell( makeString( "ReferenceWorkEntry" ) )
    } );
    $list70 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DocumentationConstant" ) ), constant_handles.reader_make_constant_shell( makeString( "ImplementationConstant" ) ), constant_handles
        .reader_make_constant_shell( makeString( "IndexicalConcept" ) ), constant_handles.reader_make_constant_shell( makeString( "IndeterminateTerm" ) ), constant_handles.reader_make_constant_shell( makeString(
            "UMLFORT" ) ) );
    $list71 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Now" ) ) );
    $list72 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationalStructure" ) ), constant_handles.reader_make_constant_shell( makeString( "Set-Mathematical" ) ), constant_handles
        .reader_make_constant_shell( makeString( "FormulaTemplate" ) ), constant_handles.reader_make_constant_shell( makeString( "Relation" ) ), constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ),
        constant_handles.reader_make_constant_shell( makeString( "CycLExpression" ) ) );
    $const73$highlyRelevantTerm = constant_handles.reader_make_constant_shell( makeString( "highlyRelevantTerm" ) );
    $str74$_S_is_a___highlyRelevantTerm__so_ = makeString( "~S is a #$highlyRelevantTerm, so not filtering..." );
    $const75$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $str76$_S_is_an_instance_of____S = makeString( "~S is an instance of~% ~S" );
    $str77$_S_is_a_NART_and_is_an_instance_o = makeString( "~S is a NART and is an instance of one of~% ~S" );
    $str78$_S_is_a_lexical_word = makeString( "~S is a lexical word" );
    $str79$_S_is_a_quoted_instance_of_one_of = makeString( "~S is a quoted instance of one of~% ~S" );
    $list80 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BUTLERAgent" ) ) );
    $str81$_S_was_created_by__S = makeString( "~S was created by ~S" );
    $const82$CollectionType = constant_handles.reader_make_constant_shell( makeString( "CollectionType" ) );
    $str83$_S_is_either_a___CollectionType_o = makeString( "~S is either a #$CollectionType or a spec of one of~% ~S" );
    $const84$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) );
    $sym85$KE_IRRELEVANT_TERM__VIA_INFERENCE = makeSymbol( "KE-IRRELEVANT-TERM?-VIA-INFERENCE" );
    $const86$keIrrelevantTerm = constant_handles.reader_make_constant_shell( makeString( "keIrrelevantTerm" ) );
    $sym87$_KE_IRRELEVANT_TERM__VIA_INFERENCE_CACHING_STATE_ = makeSymbol( "*KE-IRRELEVANT-TERM?-VIA-INFERENCE-CACHING-STATE*" );
    $int88$10000 = makeInteger( 10000 );
    $sym89$CLARIFYING_COLLECTION_ = makeSymbol( "CLARIFYING-COLLECTION?" );
    $const90$ClarifyingCollectionType = constant_handles.reader_make_constant_shell( makeString( "ClarifyingCollectionType" ) );
    $sym91$_CLARIFYING_COLLECTION__CACHING_STATE_ = makeSymbol( "*CLARIFYING-COLLECTION?-CACHING-STATE*" );
    $sym92$CLEAR_CLARIFYING_COLLECTION_ = makeSymbol( "CLEAR-CLARIFYING-COLLECTION?" );
  }
}
/*
 * 
 * Total time: 359 ms
 * 
 */