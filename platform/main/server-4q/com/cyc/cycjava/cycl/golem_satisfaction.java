package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class golem_satisfaction
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.golem_satisfaction";
  public static final String myFingerPrint = "8cc8b1b802684ecf998a273ca02b1c34c6f70f45da3a58b7745566605982cfe4";
  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 1886L)
  private static SubLSymbol $golem_debugP$;
  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 1923L)
  private static SubLSymbol $golem_node$;
  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8188L)
  private static SubLSymbol $golem_correspondence_result_tuples$;
  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8278L)
  private static SubLSymbol $golem_current_correspondence$;
  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8347L)
  private static SubLSymbol $golem_handled_roles$;
  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8416L)
  private static SubLSymbol $golem_handled_sentences$;
  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8485L)
  private static SubLSymbol $golem_remaining_roles$;
  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8554L)
  private static SubLSymbol $golem_remaining_sentences$;
  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8623L)
  private static SubLSymbol $golem_candidate_count_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 23969L)
  private static SubLSymbol $relevant_golems$;
  private static final SubLString $str0$__Attempting_match______model___S;
  private static final SubLString $str1$____node___S;
  private static final SubLString $str2$__Model_has_no_preconditions___S;
  private static final SubLString $str3$Vacuous_correspondence_ignored___;
  private static final SubLString $str4$__Not_a_recognized_node_type___S;
  private static final SubLSymbol $sym5$_EXIT;
  private static final SubLString $str6$__chosen_correspondence___S;
  private static final SubLSymbol $sym7$_;
  private static final SubLSymbol $sym8$LENGTH;
  private static final SubLString $str9$__candidate_correspondence___S;
  private static final SubLSymbol $kw10$UNINITIALIZED;
  private static final SubLSymbol $sym11$REVERSE;
  private static final SubLSymbol $sym12$FIRST;
  private static final SubLList $list13;
  private static final SubLString $str14$__prior_role_inapplicable_wrt_typ;
  private static final SubLString $str15$__handled_already___S;
  private static final SubLString $str16$__role_inapplicable_wrt_types____;
  private static final SubLString $str17$________;
  private static final SubLString $str18$A_correspondence___S__;
  private static final SubLString $str19$A_handled_role__S__;
  private static final SubLString $str20$A_remaining_role__S__;
  private static final SubLString $str21$A_remaining_sentence__S__;
  private static final SubLString $str22$A_handled_sentence__S__;
  private static final SubLString $str23$__handled___S;
  private static final SubLSymbol $sym24$THIRD;
  private static final SubLString $str25$__A_candidate_data___S__;
  private static final SubLString $str26$__Maximal_candidate_data___S__;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$POSSIBLY_GOLEM_TERM_;
  private static final SubLString $str29$__Extending_sentence____S;
  private static final SubLList $list30;
  private static final SubLString $str31$__WARNING__More_than__A_candidate;
  private static final SubLString $str32$A_candidate_data__role__object___;
  private static final SubLList $list33;
  private static final SubLString $str34$__Unsatisfied_precondition____S;
  private static final SubLObject $const35$SomeFn;
  private static final SubLSymbol $sym36$GOLEM_CANDIDATE_EXTENSION_QUERY;
  private static final SubLString $str37$____Asking___ROLE__S__SENTENCE__S;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$GOLEM_SENTENCE_SATISFIED_;
  private static final SubLObject $const40$preconditionFor_PropSit;
  private static final SubLSymbol $sym41$_SENTENCE;
  private static final SubLSymbol $kw42$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw43$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw44$HL;
  private static final SubLSymbol $kw45$RETURN;
  private static final SubLList $list46;
  private static final SubLObject $const47$problemNodeRoleForEventFilledByVa;
  private static final SubLSymbol $kw48$IGNORE;
  private static final SubLSymbol $sym49$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $kw50$GAF;
  private static final SubLSymbol $kw51$TRUE;
  private static final SubLObject $const52$primaryGolemOfModelMt;
  private static final SubLObject $const53$relevantTermForGolemSatisfiabilit;
  private static final SubLSymbol $sym54$KBEQ;
  private static final SubLString $str55$No___primaryGolemInModel_for__S;
  private static final SubLString $str56$__irrelevant_precondition___S;
  private static final SubLSymbol $kw57$MT;
  private static final SubLSymbol $kw58$BROAD_MT;
  private static final SubLString $str59$do_broad_mt_index;
  private static final SubLSymbol $sym60$STRINGP;
  private static final SubLSymbol $kw61$SKIP;
  private static final SubLSymbol $sym62$GOLEM_GAF_FORMULA;
  private static final SubLSymbol $sym63$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym64$GOLEM_GAF_RELEVANT_WITNESS_;
  private static final SubLSymbol $sym65$GOLEM_GAF_IRRELEVANT_WITNESS_;
  private static final SubLObject $const66$golemSentence;
  private static final SubLObject $const67$satisfiableGolemInModel;
  private static final SubLSymbol $kw68$POS;
  private static final SubLSymbol $kw69$REMOVAL_SATISFIABLE_GOLEM_IN_MODEL_CHECK_POS;
  private static final SubLList $list70;
  private static final SubLObject $const71$satisfyingGolemInModelProducesCor;
  private static final SubLSymbol $kw72$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_CHECK_POS;
  private static final SubLList $list73;
  private static final SubLSymbol $kw74$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_GENERATE_POS;
  private static final SubLList $list75;
  private static final SubLObject $const76$satisfiableGolemInModelGivenParti;
  private static final SubLSymbol $kw77$REMOVAL_GOLEM_SATISFACTION_GIVEN_PARTIAL_CORRESPONDENCE_CHECK_POS;
  private static final SubLList $list78;
  private static final SubLObject $const79$satisfiableGolemInModelAtNode;
  private static final SubLSymbol $kw80$REMOVAL_GOLEM_SATISFACTION_AT_NODE_CHECK_POS;
  private static final SubLList $list81;
  private static final SubLObject $const82$golemOfModelMt;
  private static final SubLSymbol $kw83$REMOVAL_GOLEMOFMODELMT;
  private static final SubLList $list84;
  private static final SubLObject $const85$GolemModelMicrotheory;
  private static final SubLObject $const86$TheTerm;
  private static final SubLSymbol $sym87$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const88$EverythingPSC;
  private static final SubLSymbol $sym89$POSSIBLE_GOLEM_OF_A_MODEL_MT_;
  private static final SubLSymbol $kw90$MAPPING_DONE;
  private static final SubLSymbol $kw91$ISA;
  private static final SubLObject $const92$quotedIsa;
  private static final SubLObject $const93$BaseKB;
  private static final SubLObject $const94$isa;
  private static final SubLObject $const95$InferencePSC;
  private static final SubLSymbol $kw96$QUERY;
  private static final SubLObject $const97$thereExists;
  private static final SubLSymbol $sym98$_N;
  private static final SubLObject $const99$and;
  private static final SubLObject $const100$argN;
  private static final SubLList $list101;
  private static final SubLObject $const102$ist_Asserted;
  private static final SubLList $list103;

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 1964L)
  public static SubLObject golem_satisfiableP(final SubLObject golem_mt, final SubLObject golem, final SubLObject v_object, SubLObject object_mt)
  {
    if( object_mt == UNPROVIDED )
    {
      object_mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != golem_satisfaction_produces_correspondence( golem_mt, golem, v_object, NIL, object_mt ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 2369L)
  public static SubLObject golem_satisfaction_produces_correspondence(final SubLObject golem_mt, final SubLObject golem, final SubLObject v_object, SubLObject partial_correspondence, SubLObject object_mt)
  {
    if( partial_correspondence == UNPROVIDED )
    {
      partial_correspondence = NIL;
    }
    if( object_mt == UNPROVIDED )
    {
      object_mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $golem_debugP$.getDynamicValue( thread ) )
    {
      format_nil.force_format( T, $str0$__Attempting_match______model___S, golem_mt, golem, v_object, object_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != $golem_node$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str1$____node___S, $golem_node$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    final SubLObject preconditions = golem_precondition_sentences( golem, golem_mt );
    if( NIL == preconditions && NIL != $golem_debugP$.getDynamicValue( thread ) )
    {
      format_nil.force_format( T, $str2$__Model_has_no_preconditions___S, golem_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != preconditions )
    {
      final SubLObject correspondence = golem_to_object_arbitrary_maximal_correspondence( golem, golem_mt, v_object, partial_correspondence, object_mt );
      if( NIL != $golem_debugP$.getDynamicValue( thread ) && NIL != list_utilities.lengthE( correspondence, ONE_INTEGER, UNPROVIDED ) )
      {
        format_nil.force_format( T, $str3$Vacuous_correspondence_ignored___, correspondence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != list_utilities.lengthGE( correspondence, TWO_INTEGER, UNPROVIDED ) && NIL != golem_correspondence_satisfies_preconditions( correspondence, preconditions, object_mt ) )
      {
        return correspondence;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 4004L)
  public static SubLObject golem_satisfiable_with_partial_correspondenceP(final SubLObject golem_mt, final SubLObject golem, final SubLObject v_object, final SubLObject partial_correspondence, SubLObject object_mt)
  {
    if( object_mt == UNPROVIDED )
    {
      object_mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != golem_satisfaction_produces_correspondence( golem_mt, golem, v_object, partial_correspondence, object_mt ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 4529L)
  public static SubLObject golem_satisfiable_at_nodeP(final SubLObject golem_mt, final SubLObject golem, final SubLObject v_object, final SubLObject node, SubLObject object_mt)
  {
    if( object_mt == UNPROVIDED )
    {
      object_mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == term.nautP( node, UNPROVIDED ) )
    {
      if( NIL != $golem_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str4$__Not_a_recognized_node_type___S, node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return NIL;
    }
    final SubLObject _prev_bind_0 = $golem_node$.currentBinding( thread );
    try
    {
      $golem_node$.bind( node, thread );
      if( NIL != golem_satisfaction_produces_correspondence( golem_mt, golem, v_object, NIL, object_mt ) )
      {
        return T;
      }
    }
    finally
    {
      $golem_node$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 5026L)
  public static SubLObject golem_to_object_arbitrary_maximal_correspondence(final SubLObject golem, final SubLObject golem_mt, final SubLObject v_object, final SubLObject partial_correspondence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject maximal_correspondences = golem_to_object_maximal_correspondences( golem, golem_mt, v_object, partial_correspondence, mt );
    if( NIL != $golem_debugP$.getDynamicValue( thread ) )
    {
      format_nil.force_format( T, $str6$__chosen_correspondence___S, maximal_correspondences.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return maximal_correspondences.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 5733L)
  public static SubLObject golem_to_object_maximal_correspondences(final SubLObject golem, final SubLObject golem_mt, final SubLObject v_object, final SubLObject partial_correspondence, final SubLObject mt)
  {
    final SubLObject all_correspondences = golem_to_object_correspondences( golem, golem_mt, v_object, partial_correspondence, mt );
    final SubLObject sorted_correspondences = Sort.sort( all_correspondences, Symbols.symbol_function( $sym7$_ ), Symbols.symbol_function( $sym8$LENGTH ) );
    final SubLObject maximal_correspondence_size = Sequences.length( sorted_correspondences.first() );
    final SubLObject maximal_correspondences = Sequences.remove( maximal_correspondence_size, sorted_correspondences, Symbols.symbol_function( $sym7$_ ), Symbols.symbol_function( $sym8$LENGTH ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    return maximal_correspondences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 6424L)
  public static SubLObject golem_to_object_correspondences(final SubLObject golem, final SubLObject golem_mt, final SubLObject v_object, final SubLObject partial_correspondence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject golem_terms = golem_roles_relevant_to_satisfiability( golem_mt );
    final SubLObject golem_sentences = all_golem_sentences_wrt_roles( golem_terms, golem_mt );
    final SubLObject correspondences = ( NIL != partial_correspondence ) ? golem_to_object_correspondences_from_partial( golem, golem_terms, golem_sentences, v_object, partial_correspondence, mt )
        : golem_to_object_correspondences_among( golem, golem_terms, golem_sentences, v_object, mt );
    if( NIL != $golem_debugP$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var = correspondences;
      SubLObject correspondence = NIL;
      correspondence = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        format_nil.force_format( T, $str9$__candidate_correspondence___S, correspondence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        correspondence = cdolist_list_var.first();
      }
    }
    return correspondences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 8681L)
  public static SubLObject golem_to_object_correspondences_among(final SubLObject golem, final SubLObject golem_terms, final SubLObject golem_sentences, final SubLObject v_object, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_tuples = NIL;
    final SubLObject _prev_bind_0 = $golem_correspondence_result_tuples$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $golem_handled_roles$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $golem_handled_sentences$.currentBinding( thread );
    try
    {
      $golem_correspondence_result_tuples$.bind( NIL, thread );
      $golem_handled_roles$.bind( NIL, thread );
      $golem_handled_sentences$.bind( NIL, thread );
      golem_extend_correspondence_recursive( golem, v_object, mt, NIL, golem_terms, golem_sentences );
      result_tuples = $golem_correspondence_result_tuples$.getDynamicValue( thread );
    }
    finally
    {
      $golem_handled_sentences$.rebind( _prev_bind_3, thread );
      $golem_handled_roles$.rebind( _prev_bind_2, thread );
      $golem_correspondence_result_tuples$.rebind( _prev_bind_0, thread );
    }
    final SubLObject correspondences = Mapping.mapcar( Symbols.symbol_function( $sym11$REVERSE ), Mapping.mapcar( Symbols.symbol_function( $sym12$FIRST ), result_tuples ) );
    return correspondences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 9285L)
  public static SubLObject golem_to_object_correspondences_from_partial(final SubLObject golem, final SubLObject golem_roles, final SubLObject golem_sentences, final SubLObject v_object,
      final SubLObject partial_correspondence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_tuples = NIL;
    thread.resetMultipleValues();
    final SubLObject verified = verify_partial_correspondence( golem_roles, golem_sentences, mt, partial_correspondence );
    final SubLObject remaining_roles = thread.secondMultipleValue();
    final SubLObject remaining_sentences = thread.thirdMultipleValue();
    final SubLObject handled_roles = thread.fourthMultipleValue();
    final SubLObject handled_sentences = thread.fifthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != verified )
    {
      final SubLObject _prev_bind_0 = $golem_correspondence_result_tuples$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $golem_handled_roles$.currentBinding( thread );
      final SubLObject _prev_bind_3 = $golem_handled_sentences$.currentBinding( thread );
      try
      {
        $golem_correspondence_result_tuples$.bind( NIL, thread );
        $golem_handled_roles$.bind( handled_roles, thread );
        $golem_handled_sentences$.bind( handled_sentences, thread );
        if( NIL != conses_high.member( golem, remaining_roles, UNPROVIDED, UNPROVIDED ) )
        {
          golem_extend_correspondence_recursive( golem, v_object, mt, partial_correspondence, remaining_roles, remaining_sentences );
        }
        else
        {
          golem_find_next_candidate_and_extend_correspondence( mt, partial_correspondence, remaining_roles, remaining_sentences );
        }
        result_tuples = $golem_correspondence_result_tuples$.getDynamicValue( thread );
      }
      finally
      {
        $golem_handled_sentences$.rebind( _prev_bind_3, thread );
        $golem_handled_roles$.rebind( _prev_bind_2, thread );
        $golem_correspondence_result_tuples$.rebind( _prev_bind_0, thread );
      }
    }
    final SubLObject correspondences = Mapping.mapcar( Symbols.symbol_function( $sym11$REVERSE ), Mapping.mapcar( Symbols.symbol_function( $sym12$FIRST ), result_tuples ) );
    return correspondences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 10528L)
  public static SubLObject verify_partial_correspondence(final SubLObject golem_roles, final SubLObject golem_sentences, final SubLObject mt, final SubLObject partial_correspondence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject remaining_roles = golem_roles;
    SubLObject handled_roles = NIL;
    SubLObject cdolist_list_var = partial_correspondence;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding;
      SubLObject role = NIL;
      SubLObject v_object = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
      role = current.first();
      current = ( v_object = current.rest() );
      if( NIL == golem_binding_valid_wrt_typesP( role, v_object, mt ) )
      {
        if( NIL != $golem_debugP$.getDynamicValue( thread ) )
        {
          format_nil.force_format( T, $str14$__prior_role_inapplicable_wrt_typ, role, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        return NIL;
      }
      final SubLObject item_var = role;
      if( NIL == conses_high.member( item_var, handled_roles, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        handled_roles = ConsesLow.cons( item_var, handled_roles );
      }
      remaining_roles = Sequences.remove( role, remaining_roles, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    SubLObject remaining_sentences = bindings.apply_bindings( partial_correspondence, golem_sentences );
    SubLObject handled_sentences = NIL;
    SubLObject cdolist_list_var2 = remaining_sentences;
    SubLObject golem_sentence = NIL;
    golem_sentence = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( golem_sentence_role_count( golem_sentence, UNPROVIDED ).isZero() && NIL != golem_sentence_satisfiedP( golem_sentence, mt, UNPROVIDED ) )
      {
        if( NIL != $golem_debugP$.getDynamicValue( thread ) )
        {
          format_nil.force_format( T, $str15$__handled_already___S, golem_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        handled_sentences = ConsesLow.cons( golem_sentence, handled_sentences );
        remaining_sentences = Sequences.delete( golem_sentence, remaining_sentences, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      golem_sentence = cdolist_list_var2.first();
    }
    return Values.values( T, remaining_roles, remaining_sentences, handled_roles, handled_sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 12138L)
  public static SubLObject golem_extend_correspondence_recursive(final SubLObject role, final SubLObject v_object, final SubLObject mt, final SubLObject correspondence, final SubLObject golem_roles,
      final SubLObject golem_sentences)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == golem_binding_valid_wrt_typesP( role, v_object, mt ) )
    {
      if( NIL != $golem_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str16$__role_inapplicable_wrt_types____, role, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return NIL;
    }
    final SubLObject _prev_bind_0 = $golem_current_correspondence$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $golem_handled_roles$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $golem_remaining_roles$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $golem_remaining_sentences$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $golem_handled_sentences$.currentBinding( thread );
    try
    {
      $golem_current_correspondence$.bind( conses_high.adjoin( bindings.make_variable_binding( role, v_object ), correspondence, UNPROVIDED, UNPROVIDED ), thread );
      $golem_handled_roles$.bind( conses_high.adjoin( role, conses_high.copy_list( $golem_handled_roles$.getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED ), thread );
      $golem_remaining_roles$.bind( Sequences.remove( role, golem_roles, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      $golem_remaining_sentences$.bind( bindings.apply_bindings( $golem_current_correspondence$.getDynamicValue( thread ), golem_sentences ), thread );
      $golem_handled_sentences$.bind( conses_high.copy_list( $golem_handled_sentences$.getDynamicValue( thread ) ), thread );
      if( NIL != $golem_debugP$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str17$________ );
        SubLObject cdolist_list_var = $golem_current_correspondence$.getDynamicValue( thread );
        SubLObject a_correspondence = NIL;
        a_correspondence = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( T, $str18$A_correspondence___S__, a_correspondence );
          cdolist_list_var = cdolist_list_var.rest();
          a_correspondence = cdolist_list_var.first();
        }
        cdolist_list_var = $golem_handled_roles$.getDynamicValue( thread );
        SubLObject a_handled_role = NIL;
        a_handled_role = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( T, $str19$A_handled_role__S__, a_handled_role );
          cdolist_list_var = cdolist_list_var.rest();
          a_handled_role = cdolist_list_var.first();
        }
        cdolist_list_var = $golem_remaining_roles$.getDynamicValue( thread );
        SubLObject a_remaining_role = NIL;
        a_remaining_role = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( T, $str20$A_remaining_role__S__, a_remaining_role );
          cdolist_list_var = cdolist_list_var.rest();
          a_remaining_role = cdolist_list_var.first();
        }
        cdolist_list_var = $golem_remaining_sentences$.getDynamicValue( thread );
        SubLObject a_remaining_sentence = NIL;
        a_remaining_sentence = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( T, $str21$A_remaining_sentence__S__, a_remaining_sentence );
          cdolist_list_var = cdolist_list_var.rest();
          a_remaining_sentence = cdolist_list_var.first();
        }
        cdolist_list_var = $golem_handled_sentences$.getDynamicValue( thread );
        SubLObject a_handled_sentence = NIL;
        a_handled_sentence = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( T, $str22$A_handled_sentence__S__, a_handled_sentence );
          cdolist_list_var = cdolist_list_var.rest();
          a_handled_sentence = cdolist_list_var.first();
        }
        PrintLow.format( T, $str17$________ );
      }
      SubLObject cdolist_list_var = conses_high.copy_list( $golem_remaining_sentences$.getDynamicValue( thread ) );
      SubLObject golem_sentence = NIL;
      golem_sentence = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( golem_sentence_role_count( golem_sentence, UNPROVIDED ).isZero() && NIL != golem_sentence_satisfiedP( golem_sentence, mt, UNPROVIDED ) )
        {
          if( NIL != $golem_debugP$.getDynamicValue( thread ) )
          {
            format_nil.force_format( T, $str23$__handled___S, golem_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          $golem_handled_sentences$.setDynamicValue( ConsesLow.cons( golem_sentence, $golem_handled_sentences$.getDynamicValue( thread ) ), thread );
          $golem_remaining_sentences$.setDynamicValue( Sequences.delete( golem_sentence, $golem_remaining_sentences$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED ), thread );
        }
        cdolist_list_var = cdolist_list_var.rest();
        golem_sentence = cdolist_list_var.first();
      }
      golem_find_next_candidate_and_extend_correspondence( mt, $golem_current_correspondence$.getDynamicValue( thread ), $golem_remaining_roles$.getDynamicValue( thread ), $golem_remaining_sentences$.getDynamicValue(
          thread ) );
    }
    finally
    {
      $golem_handled_sentences$.rebind( _prev_bind_5, thread );
      $golem_remaining_sentences$.rebind( _prev_bind_4, thread );
      $golem_remaining_roles$.rebind( _prev_bind_3, thread );
      $golem_handled_roles$.rebind( _prev_bind_2, thread );
      $golem_current_correspondence$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 14087L)
  public static SubLObject golem_find_next_candidate_and_extend_correspondence(final SubLObject mt, final SubLObject correspondence, final SubLObject remaining_roles, final SubLObject remaining_sentences)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject extension_candidate_data = golem_compute_candidate_extension_map( remaining_roles, remaining_sentences, mt );
    final SubLObject maximal_extension_datum = list_utilities.extremal( extension_candidate_data, Symbols.symbol_function( $sym7$_ ), Symbols.symbol_function( $sym24$THIRD ) );
    if( NIL != $golem_debugP$.getDynamicValue( thread ) )
    {
      PrintLow.format( T, $str17$________ );
      SubLObject cdolist_list_var = extension_candidate_data;
      SubLObject a_candidate = NIL;
      a_candidate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( T, $str25$__A_candidate_data___S__, a_candidate );
        cdolist_list_var = cdolist_list_var.rest();
        a_candidate = cdolist_list_var.first();
      }
      PrintLow.format( T, $str26$__Maximal_candidate_data___S__, maximal_extension_datum );
    }
    if( NIL != maximal_extension_datum )
    {
      SubLObject current;
      final SubLObject datum = current = maximal_extension_datum;
      SubLObject next_role = NIL;
      SubLObject next_object = NIL;
      SubLObject handled_count = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
      next_role = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
      next_object = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
      handled_count = current.first();
      current = current.rest();
      if( NIL == current )
      {
        golem_extend_correspondence_recursive( next_role, next_object, mt, correspondence, remaining_roles, remaining_sentences );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
      }
    }
    else
    {
      final SubLObject result_tuple = ConsesLow.list( correspondence, Sequences.length( $golem_handled_roles$.getDynamicValue( thread ) ), Sequences.length( $golem_handled_sentences$.getDynamicValue( thread ) ) );
      $golem_correspondence_result_tuples$.setDynamicValue( ConsesLow.cons( result_tuple, $golem_correspondence_result_tuples$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 15226L)
  public static SubLObject golem_compute_candidate_extension_map(final SubLObject golem_roles, final SubLObject golem_sentences, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject candidates_mapping = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = golem_sentences;
    SubLObject golem_sentence = NIL;
    golem_sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject remaining_roles = conses_high.intersection( golem_roles, cycl_utilities.expression_gather( golem_sentence, $sym28$POSSIBLY_GOLEM_TERM_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
          UNPROVIDED );
      if( NIL != list_utilities.singletonP( remaining_roles ) )
      {
        if( NIL != $golem_debugP$.getDynamicValue( thread ) )
        {
          format_nil.force_format( T, $str29$__Extending_sentence____S, golem_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        SubLObject current;
        final SubLObject datum = current = remaining_roles;
        SubLObject candidate_role = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
        candidate_role = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject candidate_objects = golem_candidate_extension_query( candidate_role, golem_sentence, mt, UNPROVIDED );
          if( Sequences.length( candidate_objects ).numG( $golem_candidate_count_limit$.getDynamicValue( thread ) ) )
          {
            if( NIL != $golem_debugP$.getDynamicValue( thread ) )
            {
              PrintLow.format( T, $str31$__WARNING__More_than__A_candidate, new SubLObject[] { $golem_candidate_count_limit$.getDynamicValue( thread ), candidate_role, golem_sentence
              } );
            }
          }
          else
          {
            SubLObject cdolist_list_var_$1 = candidate_objects;
            SubLObject candidate_object = NIL;
            candidate_object = cdolist_list_var_$1.first();
            while ( NIL != cdolist_list_var_$1)
            {
              if( NIL != $golem_debugP$.getDynamicValue( thread ) )
              {
                PrintLow.format( T, $str32$A_candidate_data__role__object___, candidate_role, candidate_object );
              }
              final SubLObject candidate_binding = bindings.make_variable_binding( candidate_role, candidate_object );
              dictionary_utilities.dictionary_increment( candidates_mapping, candidate_binding, UNPROVIDED );
              cdolist_list_var_$1 = cdolist_list_var_$1.rest();
              candidate_object = cdolist_list_var_$1.first();
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list30 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      golem_sentence = cdolist_list_var.first();
    }
    SubLObject result_map = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( candidates_mapping ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject candidate_binding2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject current2;
      final SubLObject datum2 = current2 = candidate_binding2;
      SubLObject candidate_role2 = NIL;
      SubLObject candidate_object2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list33 );
      candidate_role2 = current2.first();
      current2 = ( candidate_object2 = current2.rest() );
      result_map = ConsesLow.cons( ConsesLow.list( candidate_role2, candidate_object2, count ), result_map );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Sort.sort( result_map, Symbols.symbol_function( $sym7$_ ), Symbols.symbol_function( $sym24$THIRD ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 17002L)
  public static SubLObject golem_correspondence_satisfies_preconditions(final SubLObject correspondence, final SubLObject preconditions, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject situated_preconditions = bindings.apply_bindings( correspondence, preconditions );
    SubLObject unsatisfied_witness = NIL;
    if( NIL == unsatisfied_witness )
    {
      SubLObject csome_list_var = situated_preconditions;
      SubLObject situated_precondition = NIL;
      situated_precondition = csome_list_var.first();
      while ( NIL == unsatisfied_witness && NIL != csome_list_var)
      {
        if( NIL == golem_precondition_satisfiedP( situated_precondition, mt ) )
        {
          unsatisfied_witness = situated_precondition;
        }
        csome_list_var = csome_list_var.rest();
        situated_precondition = csome_list_var.first();
      }
    }
    if( NIL != $golem_debugP$.getDynamicValue( thread ) && NIL != unsatisfied_witness )
    {
      format_nil.force_format( T, $str34$__Unsatisfied_precondition____S, unsatisfied_witness, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return Values.values( makeBoolean( NIL == unsatisfied_witness ), unsatisfied_witness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 17939L)
  public static SubLObject golem_binding_valid_wrt_typesP(final SubLObject role, final SubLObject v_object, final SubLObject mt)
  {
    if( NIL == cycl_grammar.cycl_unrepresented_term_p( v_object ) )
    {
      return makeBoolean( NIL != isa.min_isa( v_object, mt, UNPROVIDED ) && NIL == disjoint_with.instances_of_disjoint_collectionsP( role, v_object, mt, UNPROVIDED ) );
    }
    final SubLObject object_types = defns.min_defn_admits( v_object, mt );
    SubLObject witness = NIL;
    if( NIL == witness )
    {
      SubLObject csome_list_var = object_types;
      SubLObject object_type = NIL;
      object_type = csome_list_var.first();
      while ( NIL == witness && NIL != csome_list_var)
      {
        if( NIL != disjoint_with.instances_of_disjoint_collectionsP( role, ConsesLow.list( $const35$SomeFn, object_type ), mt, UNPROVIDED ) )
        {
          witness = object_type;
        }
        csome_list_var = csome_list_var.rest();
        object_type = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == witness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 18779L)
  public static SubLObject golem_candidate_extension_query_internal(final SubLObject golem_role, final SubLObject golem_sentence, final SubLObject mt, SubLObject node)
  {
    if( node == UNPROVIDED )
    {
      node = $golem_node$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $golem_debugP$.getDynamicValue( thread ) )
    {
      format_nil.force_format( T, $str37$____Asking___ROLE__S__SENTENCE__S, golem_role, golem_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject result = NIL;
    final SubLObject parameters = $list38;
    result = ask_utilities.query_variable( golem_role, golem_sentence, mt, parameters );
    if( NIL == result && NIL != node && NIL != el_utilities.el_binary_formula_p( golem_sentence ) )
    {
      result = ask_utilities.query_variable( golem_role, golem_sentence_relative_to_node( golem_sentence, $golem_node$.getDynamicValue( thread ) ), mt, parameters );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 18779L)
  public static SubLObject golem_candidate_extension_query(final SubLObject golem_role, final SubLObject golem_sentence, final SubLObject mt, SubLObject node)
  {
    if( node == UNPROVIDED )
    {
      node = $golem_node$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return golem_candidate_extension_query_internal( golem_role, golem_sentence, mt, node );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym36$GOLEM_CANDIDATE_EXTENSION_QUERY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym36$GOLEM_CANDIDATE_EXTENSION_QUERY, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym36$GOLEM_CANDIDATE_EXTENSION_QUERY, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( golem_role, golem_sentence, mt, node );
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
        if( golem_role.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( golem_sentence.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && node.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( golem_candidate_extension_query_internal( golem_role, golem_sentence, mt, node ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( golem_role, golem_sentence, mt, node ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 19431L)
  public static SubLObject golem_sentence_satisfiedP_internal(final SubLObject golem_sentence, final SubLObject mt, SubLObject node)
  {
    if( node == UNPROVIDED )
    {
      node = $golem_node$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    result = inference_kernel.new_cyc_query( golem_sentence, mt, UNPROVIDED );
    if( NIL == result && NIL != node && NIL != el_utilities.el_binary_formula_p( golem_sentence ) )
    {
      result = inference_kernel.new_cyc_query( golem_sentence_relative_to_node( golem_sentence, $golem_node$.getDynamicValue( thread ) ), mt, UNPROVIDED );
    }
    return list_utilities.sublisp_boolean( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 19431L)
  public static SubLObject golem_sentence_satisfiedP(final SubLObject golem_sentence, final SubLObject mt, SubLObject node)
  {
    if( node == UNPROVIDED )
    {
      node = $golem_node$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return golem_sentence_satisfiedP_internal( golem_sentence, mt, node );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym39$GOLEM_SENTENCE_SATISFIED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym39$GOLEM_SENTENCE_SATISFIED_, THREE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym39$GOLEM_SENTENCE_SATISFIED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( golem_sentence, mt, node );
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
        if( golem_sentence.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && node.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( golem_sentence_satisfiedP_internal( golem_sentence, mt, node ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( golem_sentence, mt, node ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 19853L)
  public static SubLObject golem_precondition_sentences(final SubLObject golem, final SubLObject golem_mt)
  {
    final SubLObject preconditions_query = ConsesLow.list( $const40$preconditionFor_PropSit, $sym41$_SENTENCE, golem );
    SubLObject precondition_sentences = inference_kernel.new_cyc_query( preconditions_query, golem_mt, ConsesLow.list( $kw42$MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER, $kw43$ANSWER_LANGUAGE, $kw44$HL, $kw45$RETURN,
        $list46 ) );
    precondition_sentences = golem_preconditions_filtered_wrt_relevant_roles( precondition_sentences, golem_mt );
    precondition_sentences = kb_utilities.sort_terms( precondition_sentences, T, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return precondition_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 20466L)
  public static SubLObject golem_precondition_satisfiedP(final SubLObject precondition_sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( golem_sentence_role_count( precondition_sentence, mt ).isZero() )
    {
      SubLObject result = inference_kernel.new_cyc_query( precondition_sentence, mt, UNPROVIDED );
      if( NIL == result && NIL != $golem_node$.getDynamicValue( thread ) && NIL != el_utilities.el_binary_formula_p( precondition_sentence ) )
      {
        result = inference_kernel.new_cyc_query( golem_sentence_relative_to_node( precondition_sentence, $golem_node$.getDynamicValue( thread ) ), mt, UNPROVIDED );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 20912L)
  public static SubLObject golem_sentence_relative_to_node(final SubLObject golem_sentence, final SubLObject node)
  {
    final SubLObject problem = cycl_utilities.formula_arg1( node, UNPROVIDED );
    final SubLObject arg0 = cycl_utilities.formula_arg0( golem_sentence );
    final SubLObject arg2 = cycl_utilities.formula_arg1( golem_sentence, UNPROVIDED );
    final SubLObject arg3 = cycl_utilities.formula_arg2( golem_sentence, UNPROVIDED );
    return el_utilities.make_el_formula( $const47$problemNodeRoleForEventFilledByVa, ConsesLow.list( problem, node, arg2, arg0, arg3 ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 21270L)
  public static SubLObject all_golem_roles(final SubLObject golem, final SubLObject golem_mt)
  {
    final SubLObject role_set = set_utilities.make_set_from_list( ConsesLow.list( golem ), Symbols.symbol_function( EQL ) );
    final SubLObject role_queue = queues.enqueue( golem, queues.create_queue( UNPROVIDED ) );
    while ( NIL == queues.queue_empty_p( role_queue ))
    {
      final SubLObject role = queues.dequeue( role_queue );
      SubLObject cdolist_list_var;
      final SubLObject role_gafs = cdolist_list_var = all_golem_gafs_in_golem_mt( role, golem_mt );
      SubLObject gaf = NIL;
      gaf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject formula = assertions_high.gaf_formula( gaf );
        SubLObject cdolist_list_var_$2;
        final SubLObject terms = cdolist_list_var_$2 = cycl_utilities.formula_terms( formula, $kw48$IGNORE );
        SubLObject candidate = NIL;
        candidate = cdolist_list_var_$2.first();
        while ( NIL != cdolist_list_var_$2)
        {
          if( NIL != possibly_golem_termP( candidate, golem_mt ) && NIL == set.set_memberP( candidate, role_set ) )
          {
            set.set_add( candidate, role_set );
            queues.enqueue( candidate, role_queue );
          }
          cdolist_list_var_$2 = cdolist_list_var_$2.rest();
          candidate = cdolist_list_var_$2.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        gaf = cdolist_list_var.first();
      }
    }
    return set.set_element_list( role_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 22120L)
  public static SubLObject all_golem_gafs_in_golem_mt(final SubLObject golem, final SubLObject golem_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject gafs = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym49$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( golem_mt, thread );
      final SubLObject pred_var = NIL;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( golem, NIL, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( golem, NIL, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw50$GAF, $kw51$TRUE, NIL );
              SubLObject done_var_$3 = NIL;
              final SubLObject token_var_$4 = NIL;
              while ( NIL == done_var_$3)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( gaf ) );
                if( NIL != valid_$5 )
                {
                  final SubLObject item_var = gaf;
                  if( NIL == conses_high.member( item_var, gafs, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    gafs = ConsesLow.cons( item_var, gafs );
                  }
                }
                done_var_$3 = makeBoolean( NIL == valid_$5 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
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
    return gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 22343L)
  public static SubLObject golem_roles_relevant_to_satisfiability(final SubLObject golem_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject primary_golem = kb_mapping_utilities.fpred_value_in_any_mt( golem_mt, $const52$primaryGolemOfModelMt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject other_roles = kb_mapping_utilities.pred_values_in_any_mt( golem_mt, $const53$relevantTermForGolemSatisfiabilit, ONE_INTEGER, TWO_INTEGER, $kw51$TRUE );
    if( NIL != primary_golem )
    {
      return conses_high.adjoin( primary_golem, other_roles, Symbols.symbol_function( $sym54$KBEQ ), UNPROVIDED );
    }
    if( NIL != $golem_debugP$.getDynamicValue( thread ) )
    {
      Errors.warn( $str55$No___primaryGolemInModel_for__S, golem_mt );
    }
    return other_roles;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 22876L)
  public static SubLObject golem_preconditions_filtered_wrt_relevant_roles(final SubLObject preconditions, final SubLObject golem_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject relevant_roles = golem_roles_relevant_to_satisfiability( golem_mt );
    SubLObject relevant_preconditions = NIL;
    SubLObject cdolist_list_var = preconditions;
    SubLObject precondition = NIL;
    precondition = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject golem_roles = gather_golem_terms( precondition, golem_mt );
      final SubLObject irrelevant_roles = conses_high.set_difference( golem_roles, relevant_roles, UNPROVIDED, UNPROVIDED );
      if( NIL != irrelevant_roles )
      {
        if( NIL != $golem_debugP$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str56$__irrelevant_precondition___S, precondition );
        }
      }
      else
      {
        relevant_preconditions = ConsesLow.cons( precondition, relevant_preconditions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      precondition = cdolist_list_var.first();
    }
    return Sequences.nreverse( relevant_preconditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 23475L)
  public static SubLObject all_golem_sentences_wrt_roles(final SubLObject golem_terms, final SubLObject golem_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject gafs = NIL;
    final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method( golem_mt );
    if( pcase_var.eql( $kw57$MT ) )
    {
      if( NIL != kb_mapping_macros.do_mt_index_key_validator( golem_mt, $kw50$GAF ) )
      {
        final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec( golem_mt );
        SubLObject final_index_iterator = NIL;
        try
        {
          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw50$GAF, $kw51$TRUE, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( gaf ) );
            if( NIL != valid && NIL != golem_gaf_relevant_wrt_golemsP( gaf, golem_terms, golem_mt ) )
            {
              gafs = ConsesLow.cons( gaf, gafs );
            }
            done_var = makeBoolean( NIL == valid );
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
    }
    else if( pcase_var.eql( $kw58$BROAD_MT ) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator( golem_mt, $kw50$GAF ) )
    {
      final SubLObject idx = assertion_handles.do_assertions_table();
      final SubLObject mess = $str59$do_broad_mt_index;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$7 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$7, $kw61$SKIP ) )
          {
            final SubLObject idx_$8 = idx_$7;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$8, $kw61$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$8 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject a_id;
              SubLObject a_handle;
              SubLObject gaf2;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                a_handle = Vectors.aref( vector_var, a_id );
                if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw61$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                  {
                    a_handle = $kw61$SKIP;
                  }
                  gaf2 = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                  if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( gaf2, golem_mt, $kw50$GAF, $kw51$TRUE ) && NIL != golem_gaf_relevant_wrt_golemsP( gaf2, golem_terms, golem_mt ) )
                  {
                    gafs = ConsesLow.cons( gaf2, gafs );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$9 = idx_$7;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$9 ) || NIL == id_index.id_index_skip_tombstones_p( $kw61$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$9 );
              SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$9 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$9 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw61$SKIP ) ) ? NIL : $kw61$SKIP;
              while ( a_id2.numL( end_id ))
              {
                final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw61$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                {
                  final SubLObject gaf3 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                  if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( gaf3, golem_mt, $kw50$GAF, $kw51$TRUE ) && NIL != golem_gaf_relevant_wrt_golemsP( gaf3, golem_terms, golem_mt ) )
                  {
                    gafs = ConsesLow.cons( gaf3, gafs );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                a_id2 = Numbers.add( a_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    return Mapping.mapcar( Symbols.symbol_function( $sym62$GOLEM_GAF_FORMULA ), gafs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 24040L)
  public static SubLObject golem_gaf_relevant_wrt_golemsP(final SubLObject gaf, final SubLObject golem_terms, final SubLObject golem_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject relevant_witness = NIL;
    SubLObject irrelevant_witness = NIL;
    final SubLObject _prev_bind_0 = $relevant_golems$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      $relevant_golems$.bind( golem_terms, thread );
      mt_relevance_macros.$relevant_mt_function$.bind( $sym63$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( golem_mt, thread );
      relevant_witness = golem_gaf_first_relevant_witness( gaf );
      irrelevant_witness = golem_gaf_first_irrelevant_witness( gaf );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      $relevant_golems$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL != relevant_witness && NIL == irrelevant_witness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 24437L)
  public static SubLObject golem_gaf_first_relevant_witness(final SubLObject gaf)
  {
    return cycl_utilities.expression_find_if( $sym64$GOLEM_GAF_RELEVANT_WITNESS_, assertions_high.gaf_formula( gaf ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 24570L)
  public static SubLObject golem_gaf_first_irrelevant_witness(final SubLObject gaf)
  {
    return cycl_utilities.expression_find_if( $sym65$GOLEM_GAF_IRRELEVANT_WITNESS_, assertions_high.gaf_formula( gaf ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 24707L)
  public static SubLObject golem_gaf_relevant_witnessP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != subl_promotions.memberP( v_object, $relevant_golems$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 24842L)
  public static SubLObject golem_gaf_irrelevant_witnessP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != possibly_golem_termP( v_object, UNPROVIDED ) && NIL == subl_promotions.memberP( v_object, $relevant_golems$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 25000L)
  public static SubLObject golem_gaf_formula(final SubLObject gaf)
  {
    if( assertions_high.gaf_arg0( gaf ).eql( $const66$golemSentence ) )
    {
      return assertions_high.gaf_arg1( gaf );
    }
    return assertions_high.gaf_formula( gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 25145L)
  public static SubLObject possibly_golem_termP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_object ) )
    {
      SubLObject result = NIL;
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        result = makeBoolean( NIL != kb_accessors.indeterminate_termP( v_object ) && NIL == kb_accessors.hypothetical_term_p( v_object ) );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 25475L)
  public static SubLObject gather_golem_terms(final SubLObject golem_sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject terms = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      terms = cycl_utilities.expression_gather( golem_sentence, $sym28$POSSIBLY_GOLEM_TERM_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 25698L)
  public static SubLObject golem_sentence_role_count(final SubLObject golem_sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return Sequences.length( gather_golem_terms( golem_sentence, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 35493L)
  public static SubLObject removal_golemofmodelmt_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != variables.fully_bound_p( arg2 ) )
    {
      return control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
    }
    if( NIL != isa.isa_in_any_mtP( arg1, $const85$GolemModelMicrotheory ) )
    {
      return kb_indexing.num_mt_contents( arg1 );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 35861L)
  public static SubLObject possible_golem_of_a_model_mtP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != isa.quoted_isa_in_any_mtP( v_object, $const86$TheTerm ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/golem-satisfaction.lisp", position = 35996L)
  public static SubLObject removal_golemofmodelmt_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym87$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const88$EverythingPSC, thread );
      final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
      final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
      SubLObject results = NIL;
      SubLObject doneP = NIL;
      final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method( arg1 );
      if( pcase_var.eql( $kw57$MT ) )
      {
        if( NIL != kb_mapping_macros.do_mt_index_key_validator( arg1, $kw50$GAF ) )
        {
          final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec( arg1 );
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw50$GAF, $kw51$TRUE, NIL );
            SubLObject done_var = doneP;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject a = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( a ) );
              if( NIL != valid )
              {
                if( NIL != variables.fully_bound_p( arg2 ) )
                {
                  if( NIL != cycl_utilities.expression_find( arg2, fi.assertion_hl_formula( a, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                  {
                    results = ConsesLow.list( arg2 );
                    doneP = T;
                  }
                }
                else
                {
                  SubLObject cdolist_list_var = cycl_utilities.expression_gather( fi.assertion_hl_formula( a, UNPROVIDED ), $sym89$POSSIBLE_GOLEM_OF_A_MODEL_MT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  SubLObject v_term = NIL;
                  v_term = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    final SubLObject item_var = v_term;
                    if( NIL == conses_high.member( item_var, results, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      results = ConsesLow.cons( item_var, results );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != doneP );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw58$BROAD_MT ) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator( arg1, $kw50$GAF ) )
      {
        SubLObject catch_var = NIL;
        try
        {
          thread.throwStack.push( $kw90$MAPPING_DONE );
          final SubLObject idx = assertion_handles.do_assertions_table();
          final SubLObject mess = $str59$do_broad_mt_index;
          final SubLObject total = id_index.id_index_count( idx );
          SubLObject sofar = ZERO_INTEGER;
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$12 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_1_$13 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( mess );
              final SubLObject idx_$14 = idx;
              if( NIL == id_index.id_index_objects_empty_p( idx_$14, $kw61$SKIP ) )
              {
                final SubLObject idx_$15 = idx_$14;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$15, $kw61$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$15 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject a_id;
                  SubLObject a_handle;
                  SubLObject a2;
                  SubLObject cdolist_list_var2;
                  SubLObject v_term2;
                  SubLObject item_var2;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    a_handle = Vectors.aref( vector_var, a_id );
                    if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw61$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                      {
                        a_handle = $kw61$SKIP;
                      }
                      a2 = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                      if( NIL != doneP )
                      {
                        utilities_macros.mapping_finished();
                      }
                      if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( a2, arg1, $kw50$GAF, $kw51$TRUE ) )
                      {
                        if( NIL != variables.fully_bound_p( arg2 ) )
                        {
                          if( NIL != cycl_utilities.expression_find( arg2, fi.assertion_hl_formula( a2, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                          {
                            results = ConsesLow.list( arg2 );
                            doneP = T;
                          }
                        }
                        else
                        {
                          cdolist_list_var2 = cycl_utilities.expression_gather( fi.assertion_hl_formula( a2, UNPROVIDED ), $sym89$POSSIBLE_GOLEM_OF_A_MODEL_MT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          v_term2 = NIL;
                          v_term2 = cdolist_list_var2.first();
                          while ( NIL != cdolist_list_var2)
                          {
                            item_var2 = v_term2;
                            if( NIL == conses_high.member( item_var2, results, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                            {
                              results = ConsesLow.cons( item_var2, results );
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            v_term2 = cdolist_list_var2.first();
                          }
                        }
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
                final SubLObject idx_$16 = idx_$14;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$16 ) || NIL == id_index.id_index_skip_tombstones_p( $kw61$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$16 );
                  SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$16 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$16 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw61$SKIP ) ) ? NIL : $kw61$SKIP;
                  while ( a_id2.numL( end_id ))
                  {
                    final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw61$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                    {
                      final SubLObject a3 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                      if( NIL != doneP )
                      {
                        utilities_macros.mapping_finished();
                      }
                      if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( a3, arg1, $kw50$GAF, $kw51$TRUE ) )
                      {
                        if( NIL != variables.fully_bound_p( arg2 ) )
                        {
                          if( NIL != cycl_utilities.expression_find( arg2, fi.assertion_hl_formula( a3, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                          {
                            results = ConsesLow.list( arg2 );
                            doneP = T;
                          }
                        }
                        else
                        {
                          SubLObject cdolist_list_var3 = cycl_utilities.expression_gather( fi.assertion_hl_formula( a3, UNPROVIDED ), $sym89$POSSIBLE_GOLEM_OF_A_MODEL_MT_, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                              UNPROVIDED );
                          SubLObject v_term3 = NIL;
                          v_term3 = cdolist_list_var3.first();
                          while ( NIL != cdolist_list_var3)
                          {
                            final SubLObject item_var3 = v_term3;
                            if( NIL == conses_high.member( item_var3, results, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                            {
                              results = ConsesLow.cons( item_var3, results );
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            v_term3 = cdolist_list_var3.first();
                          }
                        }
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                    a_id2 = Numbers.add( a_id2, ONE_INTEGER );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$13, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$12, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          catch_var = Errors.handleThrowable( ccatch_env_var, $kw90$MAPPING_DONE );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      SubLObject cdolist_list_var4 = results;
      SubLObject result = NIL;
      result = cdolist_list_var4.first();
      while ( NIL != cdolist_list_var4)
      {
        final SubLObject answer_asent = el_utilities.make_binary_formula( $const82$golemOfModelMt, arg1, result );
        final SubLObject v_bindings = unification_utilities.term_unify( answer_asent, asent, UNPROVIDED, UNPROVIDED );
        if( NIL != v_bindings )
        {
          SubLObject supports = NIL;
          supports = ConsesLow.cons( arguments.make_hl_support( $kw91$ISA, el_utilities.make_binary_formula( $const92$quotedIsa, result, $const86$TheTerm ), $const93$BaseKB, UNPROVIDED ), supports );
          supports = ConsesLow.cons( arguments.make_hl_support( $kw91$ISA, el_utilities.make_binary_formula( $const94$isa, arg1, $const85$GolemModelMicrotheory ), $const95$InferencePSC, UNPROVIDED ), supports );
          supports = ConsesLow.cons( arguments.make_hl_support( $kw96$QUERY, ConsesLow.list( $const97$thereExists, $sym41$_SENTENCE, ConsesLow.list( $const97$thereExists, $sym98$_N, ConsesLow.list( $const99$and,
              ConsesLow.listS( $const100$argN, result, $list101 ), ConsesLow.listS( $const102$ist_Asserted, arg1, $list103 ) ) ) ), $const93$BaseKB, UNPROVIDED ), supports );
          backward.removal_add_node( supports.first(), v_bindings, supports.rest() );
        }
        cdolist_list_var4 = cdolist_list_var4.rest();
        result = cdolist_list_var4.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  public static SubLObject declare_golem_satisfaction_file()
  {
    SubLFiles.declareFunction( me, "golem_satisfiableP", "GOLEM-SATISFIABLE?", 3, 1, false );
    SubLFiles.declareFunction( me, "golem_satisfaction_produces_correspondence", "GOLEM-SATISFACTION-PRODUCES-CORRESPONDENCE", 3, 2, false );
    SubLFiles.declareFunction( me, "golem_satisfiable_with_partial_correspondenceP", "GOLEM-SATISFIABLE-WITH-PARTIAL-CORRESPONDENCE?", 4, 1, false );
    SubLFiles.declareFunction( me, "golem_satisfiable_at_nodeP", "GOLEM-SATISFIABLE-AT-NODE?", 4, 1, false );
    SubLFiles.declareFunction( me, "golem_to_object_arbitrary_maximal_correspondence", "GOLEM-TO-OBJECT-ARBITRARY-MAXIMAL-CORRESPONDENCE", 5, 0, false );
    SubLFiles.declareFunction( me, "golem_to_object_maximal_correspondences", "GOLEM-TO-OBJECT-MAXIMAL-CORRESPONDENCES", 5, 0, false );
    SubLFiles.declareFunction( me, "golem_to_object_correspondences", "GOLEM-TO-OBJECT-CORRESPONDENCES", 5, 0, false );
    SubLFiles.declareFunction( me, "golem_to_object_correspondences_among", "GOLEM-TO-OBJECT-CORRESPONDENCES-AMONG", 5, 0, false );
    SubLFiles.declareFunction( me, "golem_to_object_correspondences_from_partial", "GOLEM-TO-OBJECT-CORRESPONDENCES-FROM-PARTIAL", 6, 0, false );
    SubLFiles.declareFunction( me, "verify_partial_correspondence", "VERIFY-PARTIAL-CORRESPONDENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "golem_extend_correspondence_recursive", "GOLEM-EXTEND-CORRESPONDENCE-RECURSIVE", 6, 0, false );
    SubLFiles.declareFunction( me, "golem_find_next_candidate_and_extend_correspondence", "GOLEM-FIND-NEXT-CANDIDATE-AND-EXTEND-CORRESPONDENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "golem_compute_candidate_extension_map", "GOLEM-COMPUTE-CANDIDATE-EXTENSION-MAP", 3, 0, false );
    SubLFiles.declareFunction( me, "golem_correspondence_satisfies_preconditions", "GOLEM-CORRESPONDENCE-SATISFIES-PRECONDITIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "golem_binding_valid_wrt_typesP", "GOLEM-BINDING-VALID-WRT-TYPES?", 3, 0, false );
    SubLFiles.declareFunction( me, "golem_candidate_extension_query_internal", "GOLEM-CANDIDATE-EXTENSION-QUERY-INTERNAL", 3, 1, false );
    SubLFiles.declareFunction( me, "golem_candidate_extension_query", "GOLEM-CANDIDATE-EXTENSION-QUERY", 3, 1, false );
    SubLFiles.declareFunction( me, "golem_sentence_satisfiedP_internal", "GOLEM-SENTENCE-SATISFIED?-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "golem_sentence_satisfiedP", "GOLEM-SENTENCE-SATISFIED?", 2, 1, false );
    SubLFiles.declareFunction( me, "golem_precondition_sentences", "GOLEM-PRECONDITION-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "golem_precondition_satisfiedP", "GOLEM-PRECONDITION-SATISFIED?", 2, 0, false );
    SubLFiles.declareFunction( me, "golem_sentence_relative_to_node", "GOLEM-SENTENCE-RELATIVE-TO-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "all_golem_roles", "ALL-GOLEM-ROLES", 2, 0, false );
    SubLFiles.declareFunction( me, "all_golem_gafs_in_golem_mt", "ALL-GOLEM-GAFS-IN-GOLEM-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "golem_roles_relevant_to_satisfiability", "GOLEM-ROLES-RELEVANT-TO-SATISFIABILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "golem_preconditions_filtered_wrt_relevant_roles", "GOLEM-PRECONDITIONS-FILTERED-WRT-RELEVANT-ROLES", 2, 0, false );
    SubLFiles.declareFunction( me, "all_golem_sentences_wrt_roles", "ALL-GOLEM-SENTENCES-WRT-ROLES", 2, 0, false );
    SubLFiles.declareFunction( me, "golem_gaf_relevant_wrt_golemsP", "GOLEM-GAF-RELEVANT-WRT-GOLEMS?", 3, 0, false );
    SubLFiles.declareFunction( me, "golem_gaf_first_relevant_witness", "GOLEM-GAF-FIRST-RELEVANT-WITNESS", 1, 0, false );
    SubLFiles.declareFunction( me, "golem_gaf_first_irrelevant_witness", "GOLEM-GAF-FIRST-IRRELEVANT-WITNESS", 1, 0, false );
    SubLFiles.declareFunction( me, "golem_gaf_relevant_witnessP", "GOLEM-GAF-RELEVANT-WITNESS?", 1, 0, false );
    SubLFiles.declareFunction( me, "golem_gaf_irrelevant_witnessP", "GOLEM-GAF-IRRELEVANT-WITNESS?", 1, 0, false );
    SubLFiles.declareFunction( me, "golem_gaf_formula", "GOLEM-GAF-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_golem_termP", "POSSIBLY-GOLEM-TERM?", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_golem_terms", "GATHER-GOLEM-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "golem_sentence_role_count", "GOLEM-SENTENCE-ROLE-COUNT", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_golemofmodelmt_cost", "REMOVAL-GOLEMOFMODELMT-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "possible_golem_of_a_model_mtP", "POSSIBLE-GOLEM-OF-A-MODEL-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_golemofmodelmt_expand", "REMOVAL-GOLEMOFMODELMT-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_golem_satisfaction_file()
  {
    $golem_debugP$ = SubLFiles.defvar( "*GOLEM-DEBUG?*", NIL );
    $golem_node$ = SubLFiles.defparameter( "*GOLEM-NODE*", NIL );
    $golem_correspondence_result_tuples$ = SubLFiles.defparameter( "*GOLEM-CORRESPONDENCE-RESULT-TUPLES*", $kw10$UNINITIALIZED );
    $golem_current_correspondence$ = SubLFiles.defparameter( "*GOLEM-CURRENT-CORRESPONDENCE*", $kw10$UNINITIALIZED );
    $golem_handled_roles$ = SubLFiles.defparameter( "*GOLEM-HANDLED-ROLES*", $kw10$UNINITIALIZED );
    $golem_handled_sentences$ = SubLFiles.defparameter( "*GOLEM-HANDLED-SENTENCES*", $kw10$UNINITIALIZED );
    $golem_remaining_roles$ = SubLFiles.defparameter( "*GOLEM-REMAINING-ROLES*", $kw10$UNINITIALIZED );
    $golem_remaining_sentences$ = SubLFiles.defparameter( "*GOLEM-REMAINING-SENTENCES*", $kw10$UNINITIALIZED );
    $golem_candidate_count_limit$ = SubLFiles.defparameter( "*GOLEM-CANDIDATE-COUNT-LIMIT*", TEN_INTEGER );
    $relevant_golems$ = SubLFiles.defparameter( "*RELEVANT-GOLEMS*", $kw10$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_golem_satisfaction_file()
  {
    memoization_state.note_memoized_function( $sym36$GOLEM_CANDIDATE_EXTENSION_QUERY );
    memoization_state.note_memoized_function( $sym39$GOLEM_SENTENCE_SATISFIED_ );
    utilities_macros.note_funcall_helper_function( $sym64$GOLEM_GAF_RELEVANT_WITNESS_ );
    utilities_macros.note_funcall_helper_function( $sym65$GOLEM_GAF_IRRELEVANT_WITNESS_ );
    inference_modules.register_solely_specific_removal_module_predicate( $const67$satisfiableGolemInModel );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const67$satisfiableGolemInModel, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const67$satisfiableGolemInModel, TWO_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const67$satisfiableGolemInModel, THREE_INTEGER );
    inference_modules.inference_removal_module( $kw69$REMOVAL_SATISFIABLE_GOLEM_IN_MODEL_CHECK_POS, $list70 );
    inference_modules.register_solely_specific_removal_module_predicate( $const71$satisfyingGolemInModelProducesCor );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const71$satisfyingGolemInModelProducesCor, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const71$satisfyingGolemInModelProducesCor, TWO_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const71$satisfyingGolemInModelProducesCor, THREE_INTEGER );
    inference_modules.inference_removal_module( $kw72$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_CHECK_POS, $list73 );
    inference_modules.inference_removal_module( $kw74$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_GENERATE_POS, $list75 );
    inference_modules.register_solely_specific_removal_module_predicate( $const76$satisfiableGolemInModelGivenParti );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const76$satisfiableGolemInModelGivenParti, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const76$satisfiableGolemInModelGivenParti, TWO_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const76$satisfiableGolemInModelGivenParti, THREE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const76$satisfiableGolemInModelGivenParti, FOUR_INTEGER );
    inference_modules.inference_removal_module( $kw77$REMOVAL_GOLEM_SATISFACTION_GIVEN_PARTIAL_CORRESPONDENCE_CHECK_POS, $list78 );
    inference_modules.register_solely_specific_removal_module_predicate( $const79$satisfiableGolemInModelAtNode );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const79$satisfiableGolemInModelAtNode, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const79$satisfiableGolemInModelAtNode, TWO_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const79$satisfiableGolemInModelAtNode, THREE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const79$satisfiableGolemInModelAtNode, FOUR_INTEGER );
    inference_modules.inference_removal_module( $kw80$REMOVAL_GOLEM_SATISFACTION_AT_NODE_CHECK_POS, $list81 );
    preference_modules.doomed_unless_arg_bindable( $kw68$POS, $const82$golemOfModelMt, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw83$REMOVAL_GOLEMOFMODELMT, $list84 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_golem_satisfaction_file();
  }

  @Override
  public void initializeVariables()
  {
    init_golem_satisfaction_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_golem_satisfaction_file();
  }
  static
  {
    me = new golem_satisfaction();
    $golem_debugP$ = null;
    $golem_node$ = null;
    $golem_correspondence_result_tuples$ = null;
    $golem_current_correspondence$ = null;
    $golem_handled_roles$ = null;
    $golem_handled_sentences$ = null;
    $golem_remaining_roles$ = null;
    $golem_remaining_sentences$ = null;
    $golem_candidate_count_limit$ = null;
    $relevant_golems$ = null;
    $str0$__Attempting_match______model___S = makeString( "~%Attempting match: ~%  model: ~S ~%  golem: ~S ~%  object: ~S ~%  object-mt: ~S" );
    $str1$____node___S = makeString( "~%  node: ~S" );
    $str2$__Model_has_no_preconditions___S = makeString( "~%Model has no preconditions: ~S" );
    $str3$Vacuous_correspondence_ignored___ = makeString( "Vacuous correspondence ignored:~%~S" );
    $str4$__Not_a_recognized_node_type___S = makeString( "~%Not a recognized node type: ~S" );
    $sym5$_EXIT = makeSymbol( "%EXIT" );
    $str6$__chosen_correspondence___S = makeString( "~%chosen correspondence: ~S" );
    $sym7$_ = makeSymbol( ">" );
    $sym8$LENGTH = makeSymbol( "LENGTH" );
    $str9$__candidate_correspondence___S = makeString( "~%candidate correspondence: ~S" );
    $kw10$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym11$REVERSE = makeSymbol( "REVERSE" );
    $sym12$FIRST = makeSymbol( "FIRST" );
    $list13 = ConsesLow.cons( makeSymbol( "ROLE" ), makeSymbol( "OBJECT" ) );
    $str14$__prior_role_inapplicable_wrt_typ = makeString( "~%prior role inapplicable wrt types:~%~S~%~S" );
    $str15$__handled_already___S = makeString( "~%handled already: ~S" );
    $str16$__role_inapplicable_wrt_types____ = makeString( "~%role inapplicable wrt types:~%~S~%~S" );
    $str17$________ = makeString( "~%~%~%~%" );
    $str18$A_correspondence___S__ = makeString( "A correspondence: ~S~%" );
    $str19$A_handled_role__S__ = makeString( "A handled role ~S~%" );
    $str20$A_remaining_role__S__ = makeString( "A remaining role ~S~%" );
    $str21$A_remaining_sentence__S__ = makeString( "A remaining sentence ~S~%" );
    $str22$A_handled_sentence__S__ = makeString( "A handled sentence ~S~%" );
    $str23$__handled___S = makeString( "~%handled: ~S" );
    $sym24$THIRD = makeSymbol( "THIRD" );
    $str25$__A_candidate_data___S__ = makeString( "~%A candidate data: ~S~%" );
    $str26$__Maximal_candidate_data___S__ = makeString( "~%Maximal candidate data: ~S~%" );
    $list27 = ConsesLow.list( makeSymbol( "NEXT-ROLE" ), makeSymbol( "NEXT-OBJECT" ), makeSymbol( "HANDLED-COUNT" ) );
    $sym28$POSSIBLY_GOLEM_TERM_ = makeSymbol( "POSSIBLY-GOLEM-TERM?" );
    $str29$__Extending_sentence____S = makeString( "~%Extending sentence:~%~S" );
    $list30 = ConsesLow.list( makeSymbol( "CANDIDATE-ROLE" ) );
    $str31$__WARNING__More_than__A_candidate = makeString( "~%WARNING: More than ~A candidates for ~S in sentence ~S. Skipping.~%" );
    $str32$A_candidate_data__role__object___ = makeString( "A candidate data (role, object): ~S = ~S~%" );
    $list33 = ConsesLow.cons( makeSymbol( "CANDIDATE-ROLE" ), makeSymbol( "CANDIDATE-OBJECT" ) );
    $str34$__Unsatisfied_precondition____S = makeString( "~%Unsatisfied precondition:~%~S" );
    $const35$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $sym36$GOLEM_CANDIDATE_EXTENSION_QUERY = makeSymbol( "GOLEM-CANDIDATE-EXTENSION-QUERY" );
    $str37$____Asking___ROLE__S__SENTENCE__S = makeString( "~%~%Asking:~%ROLE ~S~%SENTENCE ~S" );
    $list38 = ConsesLow.list( makeKeyword( "NEW-TERMS-ALLOWED?" ), NIL );
    $sym39$GOLEM_SENTENCE_SATISFIED_ = makeSymbol( "GOLEM-SENTENCE-SATISFIED?" );
    $const40$preconditionFor_PropSit = constant_handles.reader_make_constant_shell( makeString( "preconditionFor-PropSit" ) );
    $sym41$_SENTENCE = makeSymbol( "?SENTENCE" );
    $kw42$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw43$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw44$HL = makeKeyword( "HL" );
    $kw45$RETURN = makeKeyword( "RETURN" );
    $list46 = ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol( "?SENTENCE" ) );
    $const47$problemNodeRoleForEventFilledByVa = constant_handles.reader_make_constant_shell( makeString( "problemNodeRoleForEventFilledByValue" ) );
    $kw48$IGNORE = makeKeyword( "IGNORE" );
    $sym49$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $kw50$GAF = makeKeyword( "GAF" );
    $kw51$TRUE = makeKeyword( "TRUE" );
    $const52$primaryGolemOfModelMt = constant_handles.reader_make_constant_shell( makeString( "primaryGolemOfModelMt" ) );
    $const53$relevantTermForGolemSatisfiabilit = constant_handles.reader_make_constant_shell( makeString( "relevantTermForGolemSatisfiability" ) );
    $sym54$KBEQ = makeSymbol( "KBEQ" );
    $str55$No___primaryGolemInModel_for__S = makeString( "No #$primaryGolemInModel for ~S" );
    $str56$__irrelevant_precondition___S = makeString( "~%irrelevant precondition: ~S" );
    $kw57$MT = makeKeyword( "MT" );
    $kw58$BROAD_MT = makeKeyword( "BROAD-MT" );
    $str59$do_broad_mt_index = makeString( "do-broad-mt-index" );
    $sym60$STRINGP = makeSymbol( "STRINGP" );
    $kw61$SKIP = makeKeyword( "SKIP" );
    $sym62$GOLEM_GAF_FORMULA = makeSymbol( "GOLEM-GAF-FORMULA" );
    $sym63$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym64$GOLEM_GAF_RELEVANT_WITNESS_ = makeSymbol( "GOLEM-GAF-RELEVANT-WITNESS?" );
    $sym65$GOLEM_GAF_IRRELEVANT_WITNESS_ = makeSymbol( "GOLEM-GAF-IRRELEVANT-WITNESS?" );
    $const66$golemSentence = constant_handles.reader_make_constant_shell( makeString( "golemSentence" ) );
    $const67$satisfiableGolemInModel = constant_handles.reader_make_constant_shell( makeString( "satisfiableGolemInModel" ) );
    $kw68$POS = makeKeyword( "POS" );
    $kw69$REMOVAL_SATISFIABLE_GOLEM_IN_MODEL_CHECK_POS = makeKeyword( "REMOVAL-SATISFIABLE-GOLEM-IN-MODEL-CHECK-POS" );
    $list70 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "satisfiableGolemInModel" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "satisfiableGolemInModel" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword(
          "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow
              .list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "satisfiableGolemInModel" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GOLEM-MT" ) ),
                  ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "OBJECT" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OBJECT" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "GOLEM-MT" ), makeSymbol( "GOLEM" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GOLEM-SATISFIABLE?" ),
          ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OBJECT" ) ) ) ),
      makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$satisfiableGolemInModel <golem-mt> <golem> <object>)" )
    } );
    $const71$satisfyingGolemInModelProducesCor = constant_handles.reader_make_constant_shell( makeString( "satisfyingGolemInModelProducesCorrespondence" ) );
    $kw72$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_CHECK_POS = makeKeyword( "REMOVAL-GOLEM-SATISFACTION-PRODUCES-CORRESPONDENCE-CHECK-POS" );
    $list73 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "satisfyingGolemInModelProducesCorrespondence" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "satisfyingGolemInModelProducesCorrespondence" ) ),
            makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "satisfyingGolemInModelProducesCorrespondence" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GOLEM" ) ), ConsesLow.list(
              makeKeyword( "BIND" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CORRESPONDENCE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                  "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "CORRESPONDENCE" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "GOLEM-MT" ), makeSymbol( "GOLEM" ), makeSymbol( "OBJECT" ),
                          makeSymbol( "CORRESPONDENCE" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INFERENCIFY-KB-BINDING-SET" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                              "CORRESPONDENCE" ) ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CORRESPONDENCE" ) ), ConsesLow.list( ConsesLow
                                  .list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GOLEM-SATISFACTION-PRODUCES-CORRESPONDENCE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow
                                      .list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OBJECT" ) ) ) ) ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow
                                          .list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CORRESPONDENCE" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "KBIFY-BINDING-SET" ),
                                              ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CORRESPONDENCE" ) ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow
                                                  .list( makeSymbol( "EL-CORRESPONDENCE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "satisfyingGolemInModelProducesCorrespondence" ) ),
                                                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword(
                                                          "VALUE" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EL-CORRESPONDENCE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ),
      makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$satisfyingGolemInModelProducesCorrespondence <golem-mt> <golem> <object> <correspondence>)" )
    } );
    $kw74$REMOVAL_GOLEM_SATISFACTION_PRODUCES_CORRESPONDENCE_GENERATE_POS = makeKeyword( "REMOVAL-GOLEM-SATISFACTION-PRODUCES-CORRESPONDENCE-GENERATE-POS" );
    $list75 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "satisfyingGolemInModelProducesCorrespondence" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "satisfyingGolemInModelProducesCorrespondence" ) ),
            makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "satisfyingGolemInModelProducesCorrespondence" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list(
                        makeKeyword( "BIND" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "OBJECT" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword(
                            "VALUE" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OBJECT" ) ) ) ), makeKeyword(
                                "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "GOLEM-MT" ), makeSymbol( "GOLEM" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( ConsesLow
                                    .list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GOLEM-SATISFACTION-PRODUCES-CORRESPONDENCE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow
                                        .list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OBJECT" ) ) ) ) ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow
                                            .list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CORRESPONDENCE" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "KBIFY-BINDING-SET" ),
                                                ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CORRESPONDENCE" ) ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow
                                                    .list( makeSymbol( "EL-CORRESPONDENCE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "satisfyingGolemInModelProducesCorrespondence" ) ),
                                                        ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword(
                                                            "VALUE" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EL-CORRESPONDENCE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ),
      makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$satisfyingGolemInModelProducesCorrespondence <golem-mt> <golem> <object> <not-fully-bound>)" )
    } );
    $const76$satisfiableGolemInModelGivenParti = constant_handles.reader_make_constant_shell( makeString( "satisfiableGolemInModelGivenPartialCorrespondence" ) );
    $kw77$REMOVAL_GOLEM_SATISFACTION_GIVEN_PARTIAL_CORRESPONDENCE_CHECK_POS = makeKeyword( "REMOVAL-GOLEM-SATISFACTION-GIVEN-PARTIAL-CORRESPONDENCE-CHECK-POS" );
    $list78 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "satisfiableGolemInModelGivenPartialCorrespondence" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "satisfiableGolemInModelGivenPartialCorrespondence" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
                "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                    "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "satisfiableGolemInModelGivenPartialCorrespondence" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                        "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                            "CORRESPONDENCE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list(
                                makeKeyword( "VALUE" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CORRESPONDENCE" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
                                    makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "GOLEM-MT" ), makeSymbol( "GOLEM" ), makeSymbol( "OBJECT" ), makeSymbol( "CORRESPONDENCE" ) ), ConsesLow.list( ConsesLow.list(
                                        makeKeyword( "CALL" ), makeSymbol( "INFERENCIFY-KB-BINDING-SET" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CORRESPONDENCE" ) ) ) ) ), makeKeyword(
                                            "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "HL-CORRESPONDENCE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                                "GOLEM-SATISFIABLE-WITH-PARTIAL-CORRESPONDENCE?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                                    "GOLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "HL-CORRESPONDENCE" ) ) ) ),
      makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$satisfiableGolemInModelGivenPartialCorrespondence <golem-mt> <golem> <object> <correspondence>)" )
    } );
    $const79$satisfiableGolemInModelAtNode = constant_handles.reader_make_constant_shell( makeString( "satisfiableGolemInModelAtNode" ) );
    $kw80$REMOVAL_GOLEM_SATISFACTION_AT_NODE_CHECK_POS = makeKeyword( "REMOVAL-GOLEM-SATISFACTION-AT-NODE-CHECK-POS" );
    $list81 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "satisfiableGolemInModelAtNode" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "satisfiableGolemInModelAtNode" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ),
          makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "satisfiableGolemInModelAtNode" ) ), ConsesLow.list(
          makeKeyword( "BIND" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeKeyword(
              "BIND" ), makeSymbol( "NODE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list(
                  makeKeyword( "VALUE" ), makeSymbol( "OBJECT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NODE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ),
                      ConsesLow.list( makeSymbol( "GOLEM-MT" ), makeSymbol( "GOLEM" ), makeSymbol( "OBJECT" ), makeSymbol( "NODE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GOLEM-SATISFIABLE-AT-NODE?" ),
                          ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM-MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GOLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                              "OBJECT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NODE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                  "(#$satisfiableGolemInModelAtNode <golem-mt> <golem> <object> <node>)" )
    } );
    $const82$golemOfModelMt = constant_handles.reader_make_constant_shell( makeString( "golemOfModelMt" ) );
    $kw83$REMOVAL_GOLEMOFMODELMT = makeKeyword( "REMOVAL-GOLEMOFMODELMT" );
    $list84 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "golemOfModelMt" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "golemOfModelMt" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-GOLEMOFMODELMT-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-GOLEMOFMODELMT-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$golemOfModelMt <fully-bound-p> <anything>)" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(golemOfModelMt\n (CanonicalProcessForProblemTypeMtFn MultiplyingADecimalAndAnInteger)\n (The PlacingADecimalPoint))" )
    } );
    $const85$GolemModelMicrotheory = constant_handles.reader_make_constant_shell( makeString( "GolemModelMicrotheory" ) );
    $const86$TheTerm = constant_handles.reader_make_constant_shell( makeString( "TheTerm" ) );
    $sym87$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const88$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym89$POSSIBLE_GOLEM_OF_A_MODEL_MT_ = makeSymbol( "POSSIBLE-GOLEM-OF-A-MODEL-MT?" );
    $kw90$MAPPING_DONE = makeKeyword( "MAPPING-DONE" );
    $kw91$ISA = makeKeyword( "ISA" );
    $const92$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const93$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const94$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const95$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw96$QUERY = makeKeyword( "QUERY" );
    $const97$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym98$_N = makeSymbol( "?N" );
    $const99$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const100$argN = constant_handles.reader_make_constant_shell( makeString( "argN" ) );
    $list101 = ConsesLow.list( makeSymbol( "?N" ), makeSymbol( "?SENTENCE" ) );
    $const102$ist_Asserted = constant_handles.reader_make_constant_shell( makeString( "ist-Asserted" ) );
    $list103 = ConsesLow.list( makeSymbol( "?SENTENCE" ) );
  }
}
/*
 * 
 * Total time: 785 ms
 * 
 */