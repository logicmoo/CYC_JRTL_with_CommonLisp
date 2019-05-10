package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.forward_propagate_assertions;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.conflicts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.fi;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class prove
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.prove";
  public static final String myFingerPrint = "445b0f7679eb1df4ac234b6092bdf439aea9811f82e5e64699fd80fbb256771e";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 1162L)
  private static SubLSymbol $conflicting_support_sets$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 7603L)
  private static SubLSymbol $something_asserted_within_hypothesize_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 25474L)
  private static SubLSymbol $fi_prove_new_cyc_query_trampoline_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 28424L)
  public static SubLSymbol $proof_hypothesis_forward_propagation_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 33802L)
  private static SubLSymbol $hypothesis_mt_table$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 37306L)
  public static SubLSymbol $proof_assume_consequent_type_constraintsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 38660L)
  private static SubLSymbol $proof_mt_table$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 40692L)
  public static SubLSymbol $proof_hypothesis_forward_absolute_time_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 40894L)
  public static SubLSymbol $proof_hypothesis_forward_time_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 40963L)
  public static SubLSymbol $proof_hypothesis_forward_removal_cost_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 41033L)
  public static SubLSymbol $proof_hypothesis_forward_propagation_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 41900L)
  private static SubLSymbol $hypothesize_spec_mt_sentence$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 43176L)
  private static SubLSymbol $use_new_non_wff_conflict_supports_explain_methodP$;
  private static final SubLSymbol $sym0$INFERENCE_RETURN_BLISTS_AND_SUPPORTS;
  private static final SubLString $str1$HYP;
  private static final SubLSymbol $kw2$HYPOTHESIZE;
  private static final SubLSymbol $sym3$FI_HYPOTHESIZE;
  private static final SubLList $list4;
  private static final SubLString $str5$Cyc_attempts_to_check_if_SENTENCE;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$ARG_ERROR;
  private static final SubLString $str8$Expected_a_cons__got__S;
  private static final SubLString $str9$Expected_a_string__got__S;
  private static final SubLObject $const10$and;
  private static final SubLString $str11$;
  private static final SubLObject $const12$False;
  private static final SubLObject $const13$True;
  private static final SubLSymbol $kw14$CONFLICT;
  private static final SubLSymbol $sym15$CONFLICT_HANDLER;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$QUOTED_COLLECTION_;
  private static final SubLObject $const18$CycLConstant;
  private static final SubLList $list19;
  private static final SubLString $str20$Constraint_variable_mismatch_erro;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$ANECT_;
  private static final SubLObject $const23$equalSymbols;
  private static final SubLObject $const24$isa;
  private static final SubLObject $const25$UniversalVocabularyMt;
  private static final SubLObject $const26$quotedIsa;
  private static final SubLObject $const27$genls;
  private static final SubLSymbol $sym28$STRINGP;
  private static final SubLString $str29$_A__A__A;
  private static final SubLObject $const30$definingMt;
  private static final SubLList $list31;
  private static final SubLObject $const32$hypotheticalTerm;
  private static final SubLList $list33;
  private static final SubLObject $const34$CycLReifiableDenotationalTerm;
  private static final SubLSymbol $sym35$_;
  private static final SubLSymbol $sym36$SPEC_CARDINALITY;
  private static final SubLString $str37$Term;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$FORT_P;
  private static final SubLSymbol $sym41$CONSTANT_NAME;
  private static final SubLSymbol $sym42$CONSTANT_P;
  private static final SubLSymbol $kw43$PROVE;
  private static final SubLSymbol $sym44$FI_PROVE;
  private static final SubLList $list45;
  private static final SubLString $str46$Attempts_to_prove_SENTENCE_is_tru;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLString $str49$Expected_an_integer__got__S;
  private static final SubLObject $const50$implies;
  private static final SubLSymbol $kw51$CONDITIONAL_SENTENCE_;
  private static final SubLSymbol $kw52$TAUTOLOGY;
  private static final SubLObject $const53$Always_TimeInterval;
  private static final SubLObject $const54$TimePoint;
  private static final SubLObject $const55$AnytimePSC;
  private static final SubLSymbol $sym56$_HYPOTHESIS_MT_TABLE_;
  private static final SubLList $list57;
  private static final SubLObject $const58$HypotheticalContext;
  private static final SubLString $str59$Hypothesis;
  private static final SubLSymbol $sym60$HLMT_P;
  private static final SubLSymbol $sym61$KILL_CACHED_HYPOTHESIS_MT;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$_PROOF_MT_TABLE_;
  private static final SubLString $str64$Proof;
  private static final SubLInteger $int65$120;
  private static final SubLList $list66;
  private static final SubLSymbol $kw67$MT;
  private static final SubLSymbol $sym68$_SPEC_MT;
  private static final SubLObject $const69$highlyRelevantMt;
  private static final SubLString $str70$HYP_;
  private static final SubLSymbol $sym71$HYPOTHETICAL_CONSTANT;
  private static final SubLSymbol $sym72$ASSERTED_ASSERTION_;
  private static final SubLSymbol $sym73$HYPOTHETICAL_TERM_P;
  private static final SubLSymbol $kw74$QUERY;
  private static final SubLSymbol $sym75$GENERALITY_ESTIMATE_;
  private static final SubLSymbol $sym76$CONVERT_TO_HL_SUPPORT;
  private static final SubLSymbol $kw77$OPAQUE;
  private static final SubLSymbol $sym78$EPHEMERAL_TERM_;
  private static final SubLObject $const79$ist;
  private static final SubLSymbol $kw80$IGNORE;
  private static final SubLList $list81;
  private static final SubLSymbol $kw82$ISA;
  private static final SubLSymbol $kw83$GENLS;
  private static final SubLObject $const84$genlPreds;
  private static final SubLObject $const85$genlInverse;
  private static final SubLSymbol $kw86$GENLPREDS;
  private static final SubLObject $const87$evaluate;
  private static final SubLSymbol $kw88$EVAL;
  private static final SubLSymbol $sym89$FI_PROVE_INT;
  private static final SubLSymbol $kw90$TEST;
  private static final SubLSymbol $kw91$OWNER;
  private static final SubLSymbol $kw92$CLASSES;
  private static final SubLSymbol $kw93$KB;
  private static final SubLSymbol $kw94$TINY;
  private static final SubLSymbol $kw95$WORKING_;
  private static final SubLList $list96;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 1278L)
  public static SubLObject prove_justified(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
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
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject status = NIL;
    final SubLObject _prev_bind_0 = control_vars.$inference_answer_handler$.currentBinding( thread );
    try
    {
      control_vars.$inference_answer_handler$.bind( $sym0$INFERENCE_RETURN_BLISTS_AND_SUPPORTS, thread );
      thread.resetMultipleValues();
      final SubLObject ask_results = fi_prove_int( sentence, mt, backchain, number, time, depth );
      final SubLObject ask_status = thread.secondMultipleValue();
      thread.resetMultipleValues();
      results = ask_results;
      status = ask_status;
    }
    finally
    {
      control_vars.$inference_answer_handler$.rebind( _prev_bind_0, thread );
    }
    return Values.values( results, status );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 1799L)
  public static SubLObject fi_hypothesize(final SubLObject sentence, final SubLObject mt, SubLObject name_prefix, SubLObject term_ids)
  {
    if( name_prefix == UNPROVIDED )
    {
      name_prefix = $str1$HYP;
    }
    if( term_ids == UNPROVIDED )
    {
      term_ids = NIL;
    }
    return fi.fi( $kw2$HYPOTHESIZE, sentence, mt, name_prefix, term_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 2945L)
  public static SubLObject fi_hypothesize_int(final SubLObject sentence, SubLObject mt, SubLObject name_prefix, SubLObject term_ids)
  {
    if( name_prefix == UNPROVIDED )
    {
      name_prefix = $str1$HYP;
    }
    if( term_ids == UNPROVIDED )
    {
      term_ids = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    fi.reset_fi_error_state();
    if( !sentence.isCons() )
    {
      fi.signal_fi_error( ConsesLow.list( $kw7$ARG_ERROR, $str8$Expected_a_cons__got__S, sentence ) );
      return NIL;
    }
    mt = fi.fi_convert_to_assert_hlmt_if_wft( mt );
    if( NIL != fi.fi_error_signaledP() )
    {
      return NIL;
    }
    if( !name_prefix.isString() )
    {
      fi.signal_fi_error( ConsesLow.list( $kw7$ARG_ERROR, $str9$Expected_a_string__got__S, name_prefix ) );
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject var_term_bindings = hypothesize_terms( sentence, mt, name_prefix, term_ids );
    final SubLObject success = thread.secondMultipleValue();
    final SubLObject failure_reasons = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == success )
    {
      return Values.values( NIL, failure_reasons );
    }
    if( NIL == var_term_bindings )
    {
      return Values.values( bindings.unification_success_token(), NIL );
    }
    return Values.values( var_term_bindings, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 3950L)
  public static SubLObject hypothesize_terms(final SubLObject sentence, final SubLObject mt, SubLObject name_prefix, SubLObject term_ids)
  {
    if( name_prefix == UNPROVIDED )
    {
      name_prefix = $str1$HYP;
    }
    if( term_ids == UNPROVIDED )
    {
      term_ids = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject canonical_sentence = inference_czer.canonicalize_hypothesis( sentence, mt );
    final SubLObject canonical_mt = thread.secondMultipleValue();
    final SubLObject free_vars = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject literals = inference_czer.categorize_hypothesis_formulas( canonical_sentence );
    final SubLObject rules = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject literals_sentence = reader.bq_cons( $const10$and, ConsesLow.append( literals, NIL ) );
    thread.resetMultipleValues();
    SubLObject ans = hypothesize_terms_for_antecedent( literals_sentence, rules, canonical_mt, name_prefix, term_ids, free_vars );
    final SubLObject terms = thread.secondMultipleValue();
    final SubLObject successP = thread.thirdMultipleValue();
    final SubLObject failure_reasons = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( NIL == successP )
    {
      ans = NIL;
      SubLObject cdolist_list_var = terms;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        fi.fi_kill_int( v_term );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    return Values.values( ans, successP, failure_reasons );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 5023L)
  public static SubLObject hypothesize_terms_for_antecedent(final SubLObject antecedent, final SubLObject rules, final SubLObject mt, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject free_vars)
  {
    return hypothesize_terms_int( antecedent, rules, mt, name_prefix, term_ids, NIL, T, free_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 5228L)
  public static SubLObject hypothesize_terms_for_consequent(final SubLObject consequent, final SubLObject mt, final SubLObject term_bindings, final SubLObject free_vars)
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( FOUR_INTEGER ), hypothesize_terms_int( consequent, NIL, mt, $str11$, NIL, term_bindings, NIL, free_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 5434L)
  public static SubLObject hypothesize_terms_int(final SubLObject sentence, final SubLObject rules, SubLObject mt, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject term_bindings,
      final SubLObject assert_sentenceP, final SubLObject free_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_bindings = NIL;
    SubLObject terms = NIL;
    SubLObject successP = NIL;
    SubLObject something_assertedP = NIL;
    SubLObject failure_reasons = NIL;
    conflicts.clear_inconsistent_support_sets();
    final SubLObject _prev_bind_0 = $conflicting_support_sets$.currentBinding( thread );
    try
    {
      $conflicting_support_sets$.bind( NIL, thread );
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        SubLObject canon_versions = NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$2 = inference_czer.canonicalize_hypothetical_ask( sentence, mt );
        final SubLObject mt_$3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$2;
        mt = mt_$3;
        if( NIL == canon_versions )
        {
          note_non_wff_conflict( sentence, mt, UNPROVIDED );
        }
        else if( canon_versions.eql( $const12$False ) )
        {
          note_non_wff_conflict( sentence, mt, UNPROVIDED );
        }
        else if( canon_versions.eql( $const13$True ) && NIL == rules )
        {
          successP = T;
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject result_bindings_$4 = hypothesize_terms_int_2( canon_versions, mt, rules, name_prefix, term_ids, term_bindings, assert_sentenceP, free_vars );
          final SubLObject terms_$5 = thread.secondMultipleValue();
          final SubLObject successP_$6 = thread.thirdMultipleValue();
          final SubLObject something_assertedP_$7 = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          result_bindings = result_bindings_$4;
          terms = terms_$5;
          successP = successP_$6;
          something_assertedP = something_assertedP_$7;
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$1, thread );
      }
      failure_reasons = $conflicting_support_sets$.getDynamicValue( thread );
    }
    finally
    {
      $conflicting_support_sets$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result_bindings, terms, successP, failure_reasons, something_assertedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 7678L)
  public static SubLObject hypothesize_terms_int_2(final SubLObject canon_versions, final SubLObject mt, final SubLObject rules, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject term_bindings,
      final SubLObject assert_sentenceP, final SubLObject free_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_bindings = NIL;
    SubLObject terms = NIL;
    SubLObject successP = NIL;
    SubLObject something_assertedP = NIL;
    SubLObject num_vars = ZERO_INTEGER;
    SubLObject term_variable_map = NIL;
    final SubLObject _prev_bind_0 = $something_asserted_within_hypothesize_termsP$.currentBinding( thread );
    try
    {
      $something_asserted_within_hypothesize_termsP$.bind( NIL, thread );
      try
      {
        thread.throwStack.push( $kw14$CONFLICT );
        final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym15$CONFLICT_HANDLER ), thread );
          try
          {
            final SubLObject _prev_bind_0_$9 = control_vars.$conflicts_from_invalid_deductions$.currentBinding( thread );
            final SubLObject _prev_bind_2 = Errors.$ignore_warnsP$.currentBinding( thread );
            final SubLObject _prev_bind_3 = wff_vars.$enforce_literal_wff_idiosyncrasiesP$.currentBinding( thread );
            final SubLObject _prev_bind_4 = control_vars.$record_inconsistent_support_sets$.currentBinding( thread );
            try
            {
              control_vars.$conflicts_from_invalid_deductions$.bind( T, thread );
              Errors.$ignore_warnsP$.bind( T, thread );
              wff_vars.$enforce_literal_wff_idiosyncrasiesP$.bind( NIL, thread );
              control_vars.$record_inconsistent_support_sets$.bind( T, thread );
              final SubLObject _prev_bind_0_$10 = control_vars.$ignore_non_definitional_conflictsP$.currentBinding( thread );
              try
              {
                control_vars.$ignore_non_definitional_conflictsP$.bind( T, thread );
                if( !canon_versions.eql( $const13$True ) )
                {
                  final SubLObject canon_version = canon_versions.first();
                  final SubLObject canon_var_map = conses_high.second( canon_version );
                  thread.resetMultipleValues();
                  final SubLObject dnf = fi.fi_canonicalize( canon_version, UNPROVIDED, UNPROVIDED );
                  final SubLObject v_variables = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  num_vars = Sequences.length( v_variables );
                  final SubLObject var_equality_constraints = hypothesize_dnf_equality_constraints( dnf, mt );
                  final SubLObject var_isa_constraints = hypothesize_dnf_isa_constraints( dnf, mt );
                  if( Sequences.length( var_isa_constraints ).numE( num_vars ) )
                  {
                    final SubLObject var_quoted_isa_constraints = hypothesize_dnf_quoted_isa_constraints( dnf, mt );
                    if( Sequences.length( var_quoted_isa_constraints ).numE( num_vars ) )
                    {
                      final SubLObject var_genl_constraints = hypothesize_dnf_genl_constraints( dnf, mt );
                      if( Sequences.length( var_genl_constraints ).numE( num_vars ) )
                      {
                        thread.resetMultipleValues();
                        final SubLObject terms_$11 = hypothesize_terms_for_variables( var_equality_constraints, var_isa_constraints, var_quoted_isa_constraints, var_genl_constraints, mt, canon_var_map, terms,
                            name_prefix, term_ids, term_bindings );
                        final SubLObject term_variable_map_$12 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        terms = terms_$11;
                        term_variable_map = term_variable_map_$12;
                        if( NIL != assert_sentenceP )
                        {
                          assert_hypothetical_term_content_gafs( dnf, mt, term_variable_map );
                          SubLObject i;
                          SubLObject var;
                          SubLObject v_term;
                          for( i = NIL, i = ZERO_INTEGER; i.numL( num_vars ); i = Numbers.add( i, ONE_INTEGER ) )
                          {
                            var = ConsesLow.nth( i, v_variables );
                            v_term = conses_high.assoc( variables.find_variable_by_id( i ), term_variable_map, UNPROVIDED, UNPROVIDED ).rest();
                            if( NIL != subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
                            {
                              result_bindings = ConsesLow.cons( ConsesLow.cons( var, v_term ), result_bindings );
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              finally
              {
                control_vars.$ignore_non_definitional_conflictsP$.rebind( _prev_bind_0_$10, thread );
              }
              assert_hypothetical_term_rules( rules, mt, term_variable_map, result_bindings );
              result_bindings = Sequences.nreverse( result_bindings );
              successP = T;
              something_assertedP = $something_asserted_within_hypothesize_termsP$.getDynamicValue( thread );
            }
            finally
            {
              control_vars.$record_inconsistent_support_sets$.rebind( _prev_bind_4, thread );
              wff_vars.$enforce_literal_wff_idiosyncrasiesP$.rebind( _prev_bind_3, thread );
              Errors.$ignore_warnsP$.rebind( _prev_bind_2, thread );
              control_vars.$conflicts_from_invalid_deductions$.rebind( _prev_bind_0_$9, thread );
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0_$8, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        result_bindings = Errors.handleThrowable( ccatch_env_var, $kw14$CONFLICT );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      $something_asserted_within_hypothesize_termsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result_bindings, terms, successP, something_assertedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 10529L)
  public static SubLObject hypothesize_terms_for_variables(final SubLObject var_equality_constraints, final SubLObject var_isa_constraints, final SubLObject var_quoted_isa_constraints,
      final SubLObject var_genl_constraints, final SubLObject mt, final SubLObject canon_var_map, SubLObject terms, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject term_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject term_variable_map = NIL;
    SubLObject var_isa_constraint = NIL;
    SubLObject var_isa_constraint_$13 = NIL;
    SubLObject var_quoted_isa_constraint = NIL;
    SubLObject var_quoted_isa_constraint_$14 = NIL;
    SubLObject var_genl_constraint = NIL;
    SubLObject var_genl_constraint_$15 = NIL;
    var_isa_constraint = var_isa_constraints;
    var_isa_constraint_$13 = var_isa_constraint.first();
    var_quoted_isa_constraint = var_quoted_isa_constraints;
    var_quoted_isa_constraint_$14 = var_quoted_isa_constraint.first();
    var_genl_constraint = var_genl_constraints;
    var_genl_constraint_$15 = var_genl_constraint.first();
    while ( NIL != var_genl_constraint || NIL != var_quoted_isa_constraint || NIL != var_isa_constraint)
    {
      SubLObject current;
      final SubLObject datum = current = var_isa_constraint_$13;
      SubLObject variable = NIL;
      SubLObject new_term_name = NIL;
      SubLObject isa_constraints = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
      variable = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
      new_term_name = current.first();
      current = ( isa_constraints = current.rest() );
      final SubLObject equal_symbol = list_utilities.alist_lookup( var_equality_constraints, variable, UNPROVIDED, UNPROVIDED );
      if( NIL != equal_symbol )
      {
        final SubLObject new_binding = bindings.make_variable_binding( variable, equal_symbol );
        term_variable_map = ConsesLow.cons( new_binding, term_variable_map );
      }
      else
      {
        final SubLObject quoted_col_isa_constraints = list_utilities.remove_if_not( $sym17$QUOTED_COLLECTION_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL == disjoint_with.any_disjoint_withP( quoted_col_isa_constraints, $const18$CycLConstant, UNPROVIDED, UNPROVIDED ) )
        {
          SubLObject current_$17;
          final SubLObject datum_$16 = current_$17 = var_genl_constraint_$15;
          SubLObject variable2 = NIL;
          SubLObject genl_constraints = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$17, datum_$16, $list19 );
          variable2 = current_$17.first();
          current_$17 = ( genl_constraints = current_$17.rest() );
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !variable.eql( variable2 ) )
          {
            Errors.error( $str20$Constraint_variable_mismatch_erro, variable, variable2 );
          }
          SubLObject current_$18;
          final SubLObject datum_$17 = current_$18 = var_quoted_isa_constraint_$14;
          SubLObject variable3 = NIL;
          SubLObject quoted_isa_constraints = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$18, datum_$17, $list21 );
          variable3 = current_$18.first();
          current_$18 = ( quoted_isa_constraints = current_$18.rest() );
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !variable.eql( variable3 ) )
          {
            Errors.error( $str20$Constraint_variable_mismatch_erro, variable, variable3 );
          }
          final SubLObject current_el_variable = conses_high.rassoc( variable, canon_var_map, UNPROVIDED, UNPROVIDED ).first();
          final SubLObject new_term_id = conses_high.assoc( current_el_variable, term_ids, UNPROVIDED, UNPROVIDED ).rest();
          final SubLObject new_term = ( NIL != term_bindings ) ? list_utilities.alist_lookup( term_bindings, current_el_variable, UNPROVIDED, UNPROVIDED )
              : create_hypothesized_constant( name_prefix, new_term_name, new_term_id );
          final SubLObject newP = makeBoolean( NIL == term_bindings );
          final SubLObject new_binding2 = bindings.make_variable_binding( variable, new_term );
          if( NIL != new_term )
          {
            term_variable_map = ConsesLow.cons( new_binding2, term_variable_map );
            terms = ConsesLow.cons( new_term, terms );
            final SubLObject non_anect_isa_constraints = Sequences.remove_if( $sym22$ANECT_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != non_anect_isa_constraints )
            {
              final SubLObject min_anects = at_utilities.union_min_anects( non_anect_isa_constraints, mt );
              isa_constraints = ConsesLow.append( min_anects, isa_constraints );
            }
            final SubLObject non_anect_quoted_isa_constraints = Sequences.remove_if( $sym22$ANECT_, quoted_isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != non_anect_quoted_isa_constraints )
            {
              final SubLObject min_anects = at_utilities.union_min_anects( non_anect_quoted_isa_constraints, mt );
              quoted_isa_constraints = ConsesLow.append( min_anects, quoted_isa_constraints );
            }
            final SubLObject non_anect_genl_constraints = Sequences.remove_if( $sym22$ANECT_, genl_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != non_anect_genl_constraints )
            {
              final SubLObject min_anects = at_utilities.union_min_anects( non_anect_genl_constraints, mt );
              genl_constraints = ConsesLow.append( min_anects, genl_constraints );
            }
            final SubLObject isas_okP = assert_hypothetical_term_isa_constraints( new_term, new_binding2, isa_constraints, mt );
            if( NIL != newP )
            {
              assert_that_term_is_hypothetical( new_term, mt );
            }
            if( NIL == isas_okP )
            {
              conflicts.conflict_abort();
            }
            assert_hypothetical_term_quoted_isa_constraints( new_term, new_binding2, quoted_isa_constraints, mt );
            assert_hypothetical_term_genl_constraints( new_term, new_binding2, genl_constraints, mt );
          }
        }
      }
      var_isa_constraint = var_isa_constraint.rest();
      var_isa_constraint_$13 = var_isa_constraint.first();
      var_quoted_isa_constraint = var_quoted_isa_constraint.rest();
      var_quoted_isa_constraint_$14 = var_quoted_isa_constraint.first();
      var_genl_constraint = var_genl_constraint.rest();
      var_genl_constraint_$15 = var_genl_constraint.first();
    }
    terms = Sequences.nreverse( terms );
    return Values.values( terms, term_variable_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 14400L)
  public static SubLObject assert_within_hypothetical(final SubLObject sentence, final SubLObject mt, final SubLObject variable_map, SubLObject abort_on_failureP)
  {
    if( abort_on_failureP == UNPROVIDED )
    {
      abort_on_failureP = T;
    }
    fi.fi_assert_int( sentence, mt, UNPROVIDED, UNPROVIDED );
    if( NIL == fi.fi_error_signaledP() )
    {
      $something_asserted_within_hypothesize_termsP$.setDynamicValue( T );
      return T;
    }
    note_non_wff_conflict( sentence, mt, variable_map );
    if( NIL != el_utilities.el_formula_with_operator_p( sentence, $const23$equalSymbols ) )
    {
      return NIL;
    }
    if( NIL != abort_on_failureP )
    {
      conflicts.conflict_abort();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 14905L)
  public static SubLObject assert_hypothetical_term_isa_constraints(final SubLObject new_term, final SubLObject new_binding, final SubLObject isa_constraints, final SubLObject mt)
  {
    SubLObject cdolist_list_var = isa_constraints;
    SubLObject isa_constraint = NIL;
    isa_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject assert_mt = mt;
      if( NIL == isa.isaP( new_term, isa_constraint, mt, UNPROVIDED ) )
      {
        final SubLObject isa_constraint_sentence = ConsesLow.list( $const24$isa, new_term, isa_constraint );
        if( NIL != kb_accessors.anectP( isa_constraint ) )
        {
          assert_mt = $const25$UniversalVocabularyMt;
        }
        if( NIL == assert_within_hypothetical( isa_constraint_sentence, assert_mt, ConsesLow.list( new_binding ), NIL ) )
        {
          return NIL;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      isa_constraint = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 15634L)
  public static SubLObject assert_hypothetical_term_quoted_isa_constraints(final SubLObject new_term, final SubLObject new_binding, final SubLObject quoted_isa_constraints, final SubLObject mt)
  {
    SubLObject cdolist_list_var = quoted_isa_constraints;
    SubLObject quoted_isa_constraint = NIL;
    quoted_isa_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == at_defns.quoted_has_typeP( new_term, quoted_isa_constraint, mt ) )
      {
        final SubLObject quoted_isa_constraint_sentence = ConsesLow.list( $const26$quotedIsa, new_term, quoted_isa_constraint );
        if( NIL == assert_within_hypothetical( quoted_isa_constraint_sentence, mt, ConsesLow.list( new_binding ), UNPROVIDED ) )
        {
          return NIL;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      quoted_isa_constraint = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 16312L)
  public static SubLObject assert_hypothetical_term_genl_constraints(final SubLObject new_term, final SubLObject new_binding, final SubLObject genl_constraints, final SubLObject mt)
  {
    SubLObject cdolist_list_var = genl_constraints;
    SubLObject genl_constraint = NIL;
    genl_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == genls.genlsP( new_term, genl_constraint, mt, UNPROVIDED ) )
      {
        final SubLObject genl_constraint_sentence = ConsesLow.list( $const27$genls, new_term, genl_constraint );
        if( NIL == assert_within_hypothetical( genl_constraint_sentence, mt, ConsesLow.list( new_binding ), UNPROVIDED ) )
        {
          return NIL;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl_constraint = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 16902L)
  public static SubLObject assert_hypothetical_term_content_gafs(SubLObject dnf, final SubLObject mt, final SubLObject term_variable_map)
  {
    dnf = conses_high.nsublis( term_variable_map, dnf, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = czer_utilities.definitional_lits_to_front( clauses.pos_lits( dnf ) );
    SubLObject new_sentence = NIL;
    new_sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == assert_within_hypothetical( new_sentence, mt, term_variable_map, UNPROVIDED ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      new_sentence = cdolist_list_var.first();
    }
    cdolist_list_var = czer_utilities.definitional_lits_to_front( clauses.neg_lits( dnf ) );
    SubLObject neg_lit = NIL;
    neg_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_sentence2 = cycl_utilities.negate( neg_lit );
      if( NIL == assert_within_hypothetical( new_sentence2, mt, term_variable_map, UNPROVIDED ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      neg_lit = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 17713L)
  public static SubLObject assert_hypothetical_term_rules(final SubLObject rules, final SubLObject mt, final SubLObject term_variable_map, final SubLObject v_bindings)
  {
    SubLObject cdolist_list_var = rules;
    SubLObject rule = NIL;
    rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject new_rule = rule;
      if( NIL != v_bindings )
      {
        new_rule = conses_high.sublis( v_bindings, rule, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == assert_within_hypothetical( new_rule, mt, term_variable_map, UNPROVIDED ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      rule = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 18049L)
  public static SubLObject create_hypothesized_constant(final SubLObject name_prefix, final SubLObject start_name, final SubLObject external_id)
  {
    assert NIL != Types.stringp( name_prefix ) : name_prefix;
    assert NIL != Types.stringp( start_name ) : start_name;
    final SubLObject initial_name = constant_completion_high.uniquify_constant_name( start_name, UNPROVIDED );
    final SubLObject v_term = fi.fi_create_int( initial_name, external_id );
    if( NIL != constant_handles.constant_p( v_term ) )
    {
      final SubLObject term_id = constants_high.constant_internal_id( v_term );
      SubLObject final_name = PrintLow.format( NIL, $str29$_A__A__A, new SubLObject[] { name_prefix, start_name, term_id
      } );
      final_name = constant_completion_high.uniquify_constant_name( final_name, UNPROVIDED );
      fi.fi_rename_int( v_term, final_name );
      return v_term;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 19323L)
  public static SubLObject assert_that_term_is_hypothetical(final SubLObject v_term, final SubLObject mt)
  {
    final SubLObject monad_mt = hlmt.hlmt_monad_mt( mt );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const30$definingMt, v_term, monad_mt ), mt_vars.$defining_mt_mt$.getGlobalValue(), $list31 );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const32$hypotheticalTerm, v_term ), mt, $list31 );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 19840L)
  public static SubLObject hypothesize_dnf_equality_constraints(final SubLObject dnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject equality_alist = NIL;
    final SubLObject equality_dict = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject conflict_vars = NIL;
    SubLObject cdolist_list_var = clauses.pos_lits( dnf );
    SubLObject asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject items_var = simplifier.fold_equals_in_asent( asent, equality_dict, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( items_var.isVector() )
      {
        final SubLObject vector_var = items_var;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          item = Vectors.aref( vector_var, element_num );
          conflict_vars = ConsesLow.cons( item, conflict_vars );
        }
      }
      else
      {
        SubLObject cdolist_list_var_$20 = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var_$20.first();
        while ( NIL != cdolist_list_var_$20)
        {
          conflict_vars = ConsesLow.cons( item2, conflict_vars );
          cdolist_list_var_$20 = cdolist_list_var_$20.rest();
          item2 = cdolist_list_var_$20.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      asent = cdolist_list_var.first();
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( equality_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject open_term = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject closed_term = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == subl_promotions.memberP( open_term, conflict_vars, UNPROVIDED, UNPROVIDED ) )
      {
        equality_alist = ConsesLow.cons( ConsesLow.cons( open_term, closed_term ), equality_alist );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return equality_alist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 20413L)
  public static SubLObject hypothesize_dnf_isa_constraints(final SubLObject dnf, final SubLObject mt)
  {
    final SubLObject variable_isa_constraints = antecedent_dnf_variables_isa_constraints( dnf, mt );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = variable_isa_constraints;
    SubLObject variable_isa_constraint = NIL;
    variable_isa_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = variable_isa_constraint;
      SubLObject variable = NIL;
      SubLObject isa_constraints = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      variable = current.first();
      current = ( isa_constraints = current.rest() );
      isa_constraints = Sequences.delete( $const34$CycLReifiableDenotationalTerm, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject most_specific = list_utilities.extremal( isa_constraints, Symbols.symbol_function( $sym35$_ ), Symbols.symbol_function( $sym36$SPEC_CARDINALITY ) );
      SubLObject suggested_name = $str37$Term;
      if( NIL != forts.fort_p( most_specific ) )
      {
        suggested_name = suggest_string_from_fort_el_formula( most_specific );
      }
      ans = ConsesLow.cons( ConsesLow.listS( variable, suggested_name, ConsesLow.append( isa_constraints, NIL ) ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      variable_isa_constraint = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 21455L)
  public static SubLObject hypothesize_dnf_quoted_isa_constraints(final SubLObject dnf, final SubLObject mt)
  {
    final SubLObject variable_quoted_isa_constraints = antecedent_dnf_variables_quoted_isa_constraints( dnf, mt );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = variable_quoted_isa_constraints;
    SubLObject variable_quoted_isa_constraint = NIL;
    variable_quoted_isa_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = variable_quoted_isa_constraint;
      SubLObject variable = NIL;
      SubLObject quoted_isa_constraints = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
      variable = current.first();
      current = ( quoted_isa_constraints = current.rest() );
      quoted_isa_constraints = Sequences.delete( $const34$CycLReifiableDenotationalTerm, quoted_isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      ans = ConsesLow.cons( reader.bq_cons( variable, ConsesLow.append( quoted_isa_constraints, NIL ) ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      variable_quoted_isa_constraint = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 22329L)
  public static SubLObject hypothesize_dnf_genl_constraints(final SubLObject dnf, final SubLObject mt)
  {
    final SubLObject variable_genl_constraints = antecedent_dnf_variables_genl_constraints( dnf, mt );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = variable_genl_constraints;
    SubLObject variable_genl_constraint = NIL;
    variable_genl_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = variable_genl_constraint;
      SubLObject variable = NIL;
      SubLObject genl_constraints = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
      variable = current.first();
      current = ( genl_constraints = current.rest() );
      genl_constraints = Sequences.delete( $const34$CycLReifiableDenotationalTerm, genl_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      ans = ConsesLow.cons( reader.bq_cons( variable, ConsesLow.append( genl_constraints, NIL ) ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      variable_genl_constraint = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 23195L)
  public static SubLObject antecedent_dnf_variables_isa_constraints(final SubLObject dnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding( thread );
    try
    {
      at_vars.$within_disjunctionP$.bind( T, thread );
      result = at_var_types.dnf_variables_isa_constraints( dnf, mt, UNPROVIDED );
    }
    finally
    {
      at_vars.$within_disjunctionP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 23510L)
  public static SubLObject antecedent_dnf_variables_quoted_isa_constraints(final SubLObject dnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding( thread );
    try
    {
      at_vars.$within_disjunctionP$.bind( T, thread );
      result = at_var_types.dnf_variables_quoted_isa_constraints( dnf, mt, UNPROVIDED );
    }
    finally
    {
      at_vars.$within_disjunctionP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 23839L)
  public static SubLObject antecedent_dnf_variables_genl_constraints(final SubLObject dnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding( thread );
    try
    {
      at_vars.$within_disjunctionP$.bind( T, thread );
      result = at_var_types.dnf_variables_genl_constraints( dnf, mt, UNPROVIDED );
    }
    finally
    {
      at_vars.$within_disjunctionP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 24156L)
  public static SubLObject suggest_string_from_fort_el_formula(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return string_utilities.strcat( Mapping.mapcar( Symbols.symbol_function( $sym41$CONSTANT_NAME ), list_utilities.delete_if_not( Symbols.symbol_function( $sym42$CONSTANT_P ), list_utilities.flatten( forts
          .fort_el_formula( fort ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    }
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constants_high.constant_name( fort );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 24524L)
  public static SubLObject fi_prove(final SubLObject sentence, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
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
    return fi.fi( $kw43$PROVE, sentence, mt, backchain, number, time, depth, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 25547L)
  public static SubLObject fi_prove_int(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
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
    fi.reset_fi_error_state();
    if( !sentence.isCons() )
    {
      fi.signal_fi_error( ConsesLow.list( $kw7$ARG_ERROR, $str8$Expected_a_cons__got__S, sentence ) );
      return NIL;
    }
    if( NIL != fi.fi_ask_ist_query_p( sentence ) )
    {
      SubLObject ist = NIL;
      SubLObject ist_mt = NIL;
      SubLObject ist_sentence = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( sentence, sentence, $list48 );
      ist = sentence.first();
      SubLObject current = sentence.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, sentence, $list48 );
      ist_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, sentence, $list48 );
      ist_sentence = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return fi_prove_int( ist_sentence, ist_mt, backchain, number, time, depth );
      }
      cdestructuring_bind.cdestructuring_bind_error( sentence, $list48 );
      return NIL;
    }
    else
    {
      mt = fi.fi_convert_to_fort( mt );
      if( NIL != fi.fi_error_signaledP() )
      {
        return NIL;
      }
      if( NIL != backchain && backchain != T && !backchain.isInteger() )
      {
        fi.signal_fi_error( ConsesLow.list( $kw7$ARG_ERROR, $str49$Expected_an_integer__got__S, backchain ) );
        return NIL;
      }
      if( NIL != number && !number.isInteger() )
      {
        fi.signal_fi_error( ConsesLow.list( $kw7$ARG_ERROR, $str49$Expected_an_integer__got__S, number ) );
        return NIL;
      }
      if( NIL != time && !time.isInteger() )
      {
        fi.signal_fi_error( ConsesLow.list( $kw7$ARG_ERROR, $str49$Expected_an_integer__got__S, time ) );
        return NIL;
      }
      if( NIL != depth && !depth.isInteger() )
      {
        fi.signal_fi_error( ConsesLow.list( $kw7$ARG_ERROR, $str49$Expected_an_integer__got__S, depth ) );
        return NIL;
      }
      if( NIL != $fi_prove_new_cyc_query_trampoline_enabledP$.getDynamicValue( thread ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_answer = fi_prove_int_new_cyc_query_trampoline( sentence, mt, backchain, number, time, depth );
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values( v_answer, reason );
      }
      if( sentence.isCons() && sentence.first().eql( $const50$implies ) )
      {
        return prove_from( conses_high.second( sentence ), conses_high.third( sentence ), mt, backchain, number, time, depth );
      }
      return prove_from( $const13$True, sentence, mt, backchain, number, time, depth );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 27207L)
  public static SubLObject fi_prove_int_new_cyc_query_trampoline(final SubLObject sentence, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
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
    SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters( backchain, number, time, depth );
    query_properties = conses_high.copy_list( query_properties );
    if( NIL != el_utilities.el_implication_p( sentence ) )
    {
      query_properties = conses_high.putf( query_properties, $kw51$CONDITIONAL_SENTENCE_, T );
    }
    return inference_kernel.new_cyc_query( sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 27652L)
  public static SubLObject prove_from(final SubLObject antecedant, final SubLObject consequent, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
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
    final SubLObject forward_time = prove_from_forward_time( time );
    final SubLObject backward_time = prove_from_backward_time( time );
    thread.resetMultipleValues();
    final SubLObject proof_sentence = prepare_for_proof( antecedant, consequent, mt, forward_time );
    final SubLObject proof_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == proof_sentence || NIL == proof_mt )
    {
      final SubLObject v_answer = cyc_kernel.closed_query_success_token();
      final SubLObject reason = $kw52$TAUTOLOGY;
      return Values.values( v_answer, reason );
    }
    thread.resetMultipleValues();
    final SubLObject v_answer = fi.fi_ask_int( proof_sentence, proof_mt, backchain, number, backward_time, depth );
    final SubLObject reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( v_answer, reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 28623L)
  public static SubLObject prove_from_forward_time(final SubLObject total_time_cutoff)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $proof_hypothesis_forward_propagation_enabled$.getDynamicValue( thread ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL == total_time_cutoff )
    {
      return NIL;
    }
    return Numbers.integerDivide( total_time_cutoff, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 28927L)
  public static SubLObject prove_from_backward_time(final SubLObject total_time_cutoff)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $proof_hypothesis_forward_propagation_enabled$.getDynamicValue( thread ) )
    {
      return total_time_cutoff;
    }
    if( NIL == total_time_cutoff )
    {
      return NIL;
    }
    return Numbers.integerDivide( total_time_cutoff, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 29248L)
  public static SubLObject new_prepare_for_proof(final SubLObject antecedent, final SubLObject consequent, final SubLObject input_query_mt)
  {
    return prepare_for_proof( antecedent, consequent, input_query_mt, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 30466L)
  public static SubLObject prepare_for_proof(final SubLObject antecedent, final SubLObject consequent, SubLObject input_query_mt, final SubLObject forward_time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    input_query_mt = hlmt_czer.canonicalize_hlmt( input_query_mt );
    final SubLObject assumption_mt = prepare_assumption_mt( input_query_mt );
    thread.resetMultipleValues();
    final SubLObject hypothesis_mt = prepare_hypothesis_mt( antecedent, assumption_mt, forward_time );
    final SubLObject term_bindings = thread.secondMultipleValue();
    final SubLObject failure_reasons = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != failure_reasons )
    {
      return Values.values( NIL, NIL, NIL, failure_reasons );
    }
    thread.resetMultipleValues();
    final SubLObject proof_mt = prepare_proof_mt( consequent, hypothesis_mt, term_bindings );
    final SubLObject failure_reasons_$21 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != failure_reasons_$21 )
    {
      return Values.values( NIL, NIL, NIL, failure_reasons_$21 );
    }
    final SubLObject query_sentence = bindings.apply_bindings( term_bindings, consequent );
    final SubLObject query_mt = prepare_query_mt( input_query_mt, proof_mt );
    return Values.values( query_sentence, query_mt, term_bindings, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 31275L)
  public static SubLObject prepare_assumption_mt(final SubLObject input_query_mt)
  {
    if( NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP( input_query_mt ) )
    {
      return mt_vars.$theory_mt_root$.getGlobalValue();
    }
    if( NIL != hlmt.anytime_psc_hlmtP( input_query_mt ) )
    {
      return hlmt.replace_time_dimension( input_query_mt, $const53$Always_TimeInterval, $const54$TimePoint );
    }
    return input_query_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 31835L)
  public static SubLObject prepare_query_mt(final SubLObject input_query_mt, final SubLObject proof_mt)
  {
    if( NIL == proof_mt )
    {
      return proof_mt;
    }
    if( NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP( input_query_mt ) )
    {
      return input_query_mt;
    }
    if( NIL != hlmt.anytime_psc_hlmtP( input_query_mt ) )
    {
      return hlmt.replace_time_dimension( proof_mt, $const55$AnytimePSC, UNPROVIDED );
    }
    return proof_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 32308L)
  public static SubLObject prepare_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time)
  {
    if( forward_time == UNPROVIDED )
    {
      forward_time = ZERO_INTEGER;
    }
    if( hypothesis_sentence.eql( $const13$True ) )
    {
      return Values.values( mt, NIL, NIL );
    }
    return find_or_create_hypothesis_mt( hypothesis_sentence, mt, forward_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 33267L)
  public static SubLObject find_or_create_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time)
  {
    if( forward_time == UNPROVIDED )
    {
      forward_time = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject hypothesis_mt = find_hypothesis_mt( hypothesis_sentence, mt );
    SubLObject term_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != hypothesis_mt )
    {
      return Values.values( hypothesis_mt, term_bindings, NIL );
    }
    thread.resetMultipleValues();
    hypothesis_mt = create_hypothesis_mt( hypothesis_sentence, mt, forward_time );
    term_bindings = thread.secondMultipleValue();
    final SubLObject failure_reasons = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != failure_reasons )
    {
      return Values.values( NIL, NIL, failure_reasons );
    }
    return Values.values( hypothesis_mt, term_bindings, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 33872L)
  public static SubLObject find_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt)
  {
    final SubLObject ist_sentence = el_utilities.make_ist_sentence( mt, hypothesis_sentence );
    final SubLObject hypothesis_info = dictionary.dictionary_lookup( $hypothesis_mt_table$.getGlobalValue(), ist_sentence, UNPROVIDED );
    if( NIL == hypothesis_info )
    {
      return Values.values( NIL, NIL );
    }
    SubLObject current;
    final SubLObject datum = current = hypothesis_info;
    SubLObject hypothesis_mt = NIL;
    SubLObject term_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    hypothesis_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    term_bindings = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list57 );
      return NIL;
    }
    if( NIL == valid_hypothesis_mt_infoP( hypothesis_mt, term_bindings ) )
    {
      dictionary.dictionary_remove( $hypothesis_mt_table$.getGlobalValue(), ist_sentence );
      return Values.values( NIL, NIL );
    }
    return Values.values( hypothesis_mt, term_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 34413L)
  public static SubLObject valid_hypothesis_mt_infoP(final SubLObject hypothesis_mt, final SubLObject term_bindings)
  {
    if( NIL == hlmt.valid_hlmtP( hypothesis_mt, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL == isa.isaP( hlmt.hlmt_monad_mt( hypothesis_mt ), $const58$HypotheticalContext, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = term_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject hypothesized_term_constant = bindings.variable_binding_value( binding );
      if( NIL == constant_handles.valid_constantP( hypothesized_term_constant, UNPROVIDED ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 34983L)
  public static SubLObject create_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time)
  {
    if( forward_time == UNPROVIDED )
    {
      forward_time = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject hypothesis_mt = create_hypothesis_mt_int( hypothesis_sentence, mt, forward_time );
    final SubLObject term_bindings = thread.secondMultipleValue();
    final SubLObject failure_reasons = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != hypothesis_mt )
    {
      final SubLObject ist_sentence = el_utilities.make_ist_sentence( mt, hypothesis_sentence );
      final SubLObject hypothesis_info = ConsesLow.list( hypothesis_mt, term_bindings );
      dictionary.dictionary_enter( $hypothesis_mt_table$.getGlobalValue(), ist_sentence, hypothesis_info );
    }
    return Values.values( hypothesis_mt, term_bindings, failure_reasons );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 35509L)
  public static SubLObject create_hypothesis_mt_int(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time)
  {
    if( forward_time == UNPROVIDED )
    {
      forward_time = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hypothesis_mt = NIL;
    SubLObject term_bindings = NIL;
    SubLObject failedP = NIL;
    SubLObject failure_reasons = NIL;
    hypothesis_mt = hypothesize_spec_mt( mt, $str59$Hypothesis );
    if( NIL != hypothesis_mt )
    {
      final SubLObject hypothesis_monad_mt = hlmt.hlmt_monad_mt( hypothesis_mt );
      try
      {
        thread.resetMultipleValues();
        final SubLObject term_bindings_$22 = fi_hypothesize_int( hypothesis_sentence, hypothesis_mt, UNPROVIDED, UNPROVIDED );
        final SubLObject failure_reasons_$23 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        term_bindings = term_bindings_$22;
        failure_reasons = failure_reasons_$23;
        if( NIL != term_bindings )
        {
          if( NIL != bindings.unification_success_token_p( term_bindings ) )
          {
            term_bindings = NIL;
          }
          note_hypothesis_mt_term_bindings( hypothesis_mt, term_bindings );
        }
        else
        {
          failedP = T;
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != failedP )
          {
            fi.fi_kill_int( hypothesis_monad_mt );
            hypothesis_mt = NIL;
            term_bindings = NIL;
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      failedP = T;
    }
    if( NIL == failedP )
    {
      if( NIL != $proof_hypothesis_forward_propagation_enabled$.getDynamicValue( thread ) )
      {
        forward_propagate_proof_hypothesis_mt( hypothesis_mt, forward_time );
      }
      return Values.values( hypothesis_mt, term_bindings, NIL );
    }
    return Values.values( NIL, NIL, failure_reasons );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 36682L)
  public static SubLObject note_hypothesis_mt_term_bindings(final SubLObject hypothesis_mt, final SubLObject term_bindings)
  {
    assert NIL != hlmt.hlmt_p( hypothesis_mt ) : hypothesis_mt;
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 37139L)
  public static SubLObject kill_cached_hypothesis_mt(final SubLObject hypothesis_mt)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 37505L)
  public static SubLObject prepare_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $proof_assume_consequent_type_constraintsP$.getDynamicValue( thread ) )
    {
      return Values.values( hypothesis_mt, NIL );
    }
    SubLObject consequent_mentions_antecedent_variableP;
    SubLObject rest;
    SubLObject term_binding;
    SubLObject current;
    SubLObject datum;
    SubLObject variable;
    SubLObject value;
    for( consequent_mentions_antecedent_variableP = NIL, rest = NIL, rest = term_bindings; NIL == consequent_mentions_antecedent_variableP && NIL != rest; consequent_mentions_antecedent_variableP = cycl_utilities
        .expression_find( variable, consequent_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ), rest = rest.rest() )
    {
      term_binding = rest.first();
      datum = ( current = term_binding );
      variable = NIL;
      value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
      variable = current.first();
      current = ( value = current.rest() );
    }
    if( NIL == consequent_mentions_antecedent_variableP )
    {
      return Values.values( hypothesis_mt, NIL );
    }
    return find_or_create_proof_mt( consequent_sentence, hypothesis_mt, term_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 38373L)
  public static SubLObject find_or_create_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings)
  {
    final SubLObject proof_mt = find_proof_mt( consequent_sentence, hypothesis_mt );
    if( NIL != proof_mt )
    {
      return Values.values( proof_mt, NIL );
    }
    return create_proof_mt( consequent_sentence, hypothesis_mt, term_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 38725L)
  public static SubLObject find_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt)
  {
    final SubLObject ist_sentence = el_utilities.make_ist_sentence( hypothesis_mt, consequent_sentence );
    SubLObject proof_mt = dictionary.dictionary_lookup( $proof_mt_table$.getGlobalValue(), ist_sentence, UNPROVIDED );
    if( NIL != proof_mt && NIL == hlmt.valid_hlmt_p( proof_mt, UNPROVIDED ) )
    {
      dictionary.dictionary_remove( $proof_mt_table$.getGlobalValue(), ist_sentence );
      proof_mt = NIL;
    }
    return proof_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 39089L)
  public static SubLObject create_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject proof_mt = create_proof_mt_int( consequent_sentence, hypothesis_mt, term_bindings );
    final SubLObject failure_reasons = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != proof_mt )
    {
      final SubLObject ist_sentence = el_utilities.make_ist_sentence( hypothesis_mt, consequent_sentence );
      dictionary.dictionary_enter( $proof_mt_table$.getGlobalValue(), ist_sentence, proof_mt );
    }
    return Values.values( proof_mt, failure_reasons );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 39509L)
  public static SubLObject create_proof_mt_int(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject proof_mt = hypothesize_spec_mt( hypothesis_mt, $str64$Proof );
    final SubLObject failure_reasons = NIL;
    if( NIL == proof_mt )
    {
      return Values.values( NIL, NIL );
    }
    final SubLObject proof_monad_mt = hlmt.hlmt_monad_mt( proof_mt );
    SubLObject something_assertedP = NIL;
    final SubLObject free_vars = el_utilities.sentence_free_variables( consequent_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = at_vars.$at_include_isa_literal_constraints$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_include_genl_literal_constraints$.currentBinding( thread );
    try
    {
      at_vars.$at_include_isa_literal_constraints$.bind( NIL, thread );
      at_vars.$at_include_genl_literal_constraints$.bind( NIL, thread );
      something_assertedP = hypothesize_terms_for_consequent( consequent_sentence, proof_mt, term_bindings, free_vars );
    }
    finally
    {
      at_vars.$at_include_genl_literal_constraints$.rebind( _prev_bind_2, thread );
      at_vars.$at_include_isa_literal_constraints$.rebind( _prev_bind_0, thread );
    }
    if( NIL == something_assertedP )
    {
      fi.fi_kill_int( proof_monad_mt );
      proof_mt = hypothesis_mt;
    }
    return Values.values( proof_mt, failure_reasons );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 41102L)
  public static SubLObject forward_propagate_proof_hypothesis_mt(final SubLObject hypothesis_mt, SubLObject forward_time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !forward_time.isInteger() || !forward_time.numLE( ZERO_INTEGER ) )
    {
      if( NIL == forward_time )
      {
        forward_time = $proof_hypothesis_forward_absolute_time_cutoff$.getDynamicValue( thread );
      }
      final SubLObject _prev_bind_0 = control_vars.$unbound_rule_backchain_enabled$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$forward_inference_removal_cost_cutoff$.currentBinding( thread );
      final SubLObject _prev_bind_3 = kb_control_vars.$forward_inference_time_cutoff$.currentBinding( thread );
      final SubLObject _prev_bind_4 = control_vars.$filter_deductions_for_trivially_derivable_gafs$.currentBinding( thread );
      final SubLObject _prev_bind_5 = kb_control_vars.$forward_propagate_from_negations$.currentBinding( thread );
      final SubLObject _prev_bind_6 = kb_control_vars.$forward_propagate_to_negations$.currentBinding( thread );
      try
      {
        control_vars.$unbound_rule_backchain_enabled$.bind( T, thread );
        control_vars.$forward_inference_removal_cost_cutoff$.bind( $proof_hypothesis_forward_removal_cost_cutoff$.getDynamicValue( thread ), thread );
        kb_control_vars.$forward_inference_time_cutoff$.bind( $proof_hypothesis_forward_time_cutoff$.getDynamicValue( thread ), thread );
        control_vars.$filter_deductions_for_trivially_derivable_gafs$.bind( T, thread );
        kb_control_vars.$forward_propagate_from_negations$.bind( NIL, thread );
        kb_control_vars.$forward_propagate_to_negations$.bind( NIL, thread );
        forward_propagate_assertions.forward_propagate_mt( hypothesis_mt, hypothesis_mt, NIL, forward_time, $proof_hypothesis_forward_propagation_depth$.getDynamicValue( thread ) );
      }
      finally
      {
        kb_control_vars.$forward_propagate_to_negations$.rebind( _prev_bind_6, thread );
        kb_control_vars.$forward_propagate_from_negations$.rebind( _prev_bind_5, thread );
        control_vars.$filter_deductions_for_trivially_derivable_gafs$.rebind( _prev_bind_4, thread );
        kb_control_vars.$forward_inference_time_cutoff$.rebind( _prev_bind_3, thread );
        control_vars.$forward_inference_removal_cost_cutoff$.rebind( _prev_bind_2, thread );
        control_vars.$unbound_rule_backchain_enabled$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 42328L)
  public static SubLObject hypothesize_spec_mt(final SubLObject mt, SubLObject name_prefix)
  {
    if( name_prefix == UNPROVIDED )
    {
      name_prefix = $str1$HYP;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    final SubLObject monad_mt = hlmt.hlmt_monad_mt( mt );
    final SubLObject sentence = conses_high.subst( monad_mt, $kw67$MT, $hypothesize_spec_mt_sentence$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    SubLObject hyp_mt = NIL;
    SubLObject hyp_hlmt = NIL;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_enabledP$.bind( NIL, thread );
      final SubLObject v_bindings = fi_hypothesize_int( sentence, mt_vars.$mt_mt$.getGlobalValue(), name_prefix, UNPROVIDED );
      if( NIL != v_bindings )
      {
        hyp_mt = bindings.apply_bindings( v_bindings, $sym68$_SPEC_MT );
        if( NIL != hyp_mt )
        {
          hyp_hlmt = hlmt.replace_monad_dimension( mt, hyp_mt );
          cyc_kernel.cyc_assert_wff( ConsesLow.list( $const69$highlyRelevantMt, hyp_hlmt ), hyp_hlmt, UNPROVIDED );
        }
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_0, thread );
    }
    return hyp_hlmt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 43040L)
  public static SubLObject hypothetical_constant(final SubLObject v_object)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && NIL != string_utilities.starts_with( constants_high.constant_name( v_object ), $str70$HYP_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 43254L)
  public static SubLObject construct_non_wff_conflict_supports(final SubLObject sentence, final SubLObject mt, SubLObject generic_var_map)
  {
    if( generic_var_map == UNPROVIDED )
    {
      generic_var_map = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $use_new_non_wff_conflict_supports_explain_methodP$.getDynamicValue( thread ) )
    {
      final SubLObject hyp_terms = cycl_utilities.expression_gather( sentence, $sym71$HYPOTHETICAL_CONSTANT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject hyp_assertions = NIL;
      SubLObject cdolist_list_var = hyp_terms;
      SubLObject hyp_term = NIL;
      hyp_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$24 = list_utilities.remove_if_not( $sym72$ASSERTED_ASSERTION_, virtual_indexing.assertions_mentioning_terms( ConsesLow.list( hyp_term ), UNPROVIDED ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED );
        SubLObject hyp_ass = NIL;
        hyp_ass = cdolist_list_var_$24.first();
        while ( NIL != cdolist_list_var_$24)
        {
          final SubLObject item_var = hyp_ass;
          if( NIL == conses_high.member( item_var, hyp_assertions, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            hyp_assertions = ConsesLow.cons( item_var, hyp_assertions );
          }
          cdolist_list_var_$24 = cdolist_list_var_$24.rest();
          hyp_ass = cdolist_list_var_$24.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        hyp_term = cdolist_list_var.first();
      }
      SubLObject result = NIL;
      SubLObject cdolist_list_var2 = hyp_assertions;
      SubLObject hyp_ass2 = NIL;
      hyp_ass2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject el_formula = bindings.apply_bindings_backwards( generic_var_map, uncanonicalizer.assertion_el_formula( hyp_ass2 ) );
        if( NIL == cycl_utilities.expression_find_if( $sym73$HYPOTHETICAL_TERM_P, el_formula, UNPROVIDED, UNPROVIDED ) && NIL == cycl_utilities.expression_find( $const32$hypotheticalTerm, el_formula, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.cons( el_formula, result );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        hyp_ass2 = cdolist_list_var2.first();
      }
      result = el_utilities.make_conjunction( result );
      result = el_utilities.make_implication( result, bindings.apply_bindings_backwards( generic_var_map, el_utilities.make_negation( sentence ) ) );
      result = arguments.make_hl_support( $kw74$QUERY, result, Sort.sort( genl_mts.asserted_genl_mts( mt, UNPROVIDED ), $sym75$GENERALITY_ESTIMATE_, UNPROVIDED ).first(), UNPROVIDED );
      return ConsesLow.list( result );
    }
    SubLObject supports = flatten_explain_hl_why_not_wff( wff.hl_explain_why_not_wff( sentence, mt, UNPROVIDED ) );
    if( !supports.isList() )
    {
      supports = NIL;
    }
    if( supports.isCons() && supports.first().eql( $const10$and ) )
    {
      supports = supports.rest();
    }
    if( NIL != supports )
    {
      supports = Sequences.delete( NIL, Mapping.mapcar( Symbols.symbol_function( $sym76$CONVERT_TO_HL_SUPPORT ), supports ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == supports )
    {
      supports = ConsesLow.list( arguments.make_hl_support( $kw77$OPAQUE, sentence, mt, UNPROVIDED ) );
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 44939L)
  public static SubLObject flatten_explain_hl_why_not_wff(final SubLObject supports)
  {
    final SubLObject v_answer = flatten_explain_hl_why_not_wff_recursive( supports, NIL );
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 45119L)
  public static SubLObject flatten_explain_hl_why_not_wff_recursive(final SubLObject sentence, SubLObject accumulator)
  {
    if( NIL != assertion_handles.assertion_p( sentence ) )
    {
      final SubLObject el_formula = uncanonicalizer.assertion_el_formula( sentence );
      if( NIL != list_utilities.tree_find_if( $sym78$EPHEMERAL_TERM_, el_formula, UNPROVIDED ) )
      {
        accumulator = ConsesLow.cons( ConsesLow.list( $const79$ist, assertions_high.assertion_mt( sentence ), el_formula ), accumulator );
      }
      else
      {
        accumulator = ConsesLow.cons( sentence, accumulator );
      }
    }
    else if( NIL != cycl_grammar.cycl_sentence_p( sentence ) )
    {
      if( NIL != el_utilities.ist_sentence_p( sentence, UNPROVIDED ) )
      {
        accumulator = ConsesLow.cons( sentence, accumulator );
      }
      else
      {
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms( sentence, $kw80$IGNORE );
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          accumulator = flatten_explain_hl_why_not_wff_recursive( v_term, accumulator );
          cdolist_list_var = cdolist_list_var.rest();
          v_term = cdolist_list_var.first();
        }
      }
    }
    return accumulator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 45704L)
  public static SubLObject convert_to_hl_support(final SubLObject v_object)
  {
    if( NIL != assertion_handles.assertion_p( v_object ) )
    {
      return v_object;
    }
    if( NIL != arguments.support_p( v_object ) )
    {
      return v_object;
    }
    if( NIL == el_utilities.el_formula_p( v_object ) )
    {
      return NIL;
    }
    if( NIL == el_utilities.ist_sentence_p( v_object, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( v_object, UNPROVIDED );
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list81 );
    current = current.rest();
    final SubLObject sentence = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list81 );
    current = current.rest();
    if( NIL == current )
    {
      return convert_ist_formula_to_hl_support( sentence, mt );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list81 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 46089L)
  public static SubLObject convert_ist_formula_to_hl_support(final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject pcase_var = el_utilities.literal_predicate( sentence, UNPROVIDED );
    if( pcase_var.eql( $const24$isa ) )
    {
      return arguments.make_hl_support( $kw82$ISA, sentence, mt, UNPROVIDED );
    }
    if( pcase_var.eql( $const27$genls ) )
    {
      return arguments.make_hl_support( $kw83$GENLS, sentence, mt, UNPROVIDED );
    }
    if( pcase_var.eql( $const84$genlPreds ) || pcase_var.eql( $const85$genlInverse ) )
    {
      return arguments.make_hl_support( $kw86$GENLPREDS, sentence, mt, UNPROVIDED );
    }
    if( pcase_var.eql( $const87$evaluate ) )
    {
      return arguments.make_hl_support( $kw88$EVAL, sentence, mt, UNPROVIDED );
    }
    return arguments.make_hl_support( $kw77$OPAQUE, sentence, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/lisp", position = 46530L)
  public static SubLObject note_non_wff_conflict(final SubLObject sentence, final SubLObject mt, SubLObject generic_var_map)
  {
    if( generic_var_map == UNPROVIDED )
    {
      generic_var_map = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$record_inconsistent_support_sets$.getDynamicValue( thread ) )
    {
      final SubLObject supports = construct_non_wff_conflict_supports( sentence, mt, generic_var_map );
      conflicts.add_inconsistent_support_set( supports );
      $conflicting_support_sets$.setDynamicValue( ConsesLow.cons( supports, $conflicting_support_sets$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  public static SubLObject declare_prove_file()
  {
    SubLFiles.declareFunction( me, "prove_justified", "PROVE-JUSTIFIED", 1, 5, false );
    SubLFiles.declareFunction( me, "fi_hypothesize", "FI-HYPOTHESIZE", 2, 2, false );
    SubLFiles.declareFunction( me, "fi_hypothesize_int", "FI-HYPOTHESIZE-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "hypothesize_terms", "HYPOTHESIZE-TERMS", 2, 2, false );
    SubLFiles.declareFunction( me, "hypothesize_terms_for_antecedent", "HYPOTHESIZE-TERMS-FOR-ANTECEDENT", 6, 0, false );
    SubLFiles.declareFunction( me, "hypothesize_terms_for_consequent", "HYPOTHESIZE-TERMS-FOR-CONSEQUENT", 4, 0, false );
    SubLFiles.declareFunction( me, "hypothesize_terms_int", "HYPOTHESIZE-TERMS-INT", 8, 0, false );
    SubLFiles.declareFunction( me, "hypothesize_terms_int_2", "HYPOTHESIZE-TERMS-INT-2", 8, 0, false );
    SubLFiles.declareFunction( me, "hypothesize_terms_for_variables", "HYPOTHESIZE-TERMS-FOR-VARIABLES", 10, 0, false );
    SubLFiles.declareFunction( me, "assert_within_hypothetical", "ASSERT-WITHIN-HYPOTHETICAL", 3, 1, false );
    SubLFiles.declareFunction( me, "assert_hypothetical_term_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-ISA-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "assert_hypothetical_term_quoted_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-QUOTED-ISA-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "assert_hypothetical_term_genl_constraints", "ASSERT-HYPOTHETICAL-TERM-GENL-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "assert_hypothetical_term_content_gafs", "ASSERT-HYPOTHETICAL-TERM-CONTENT-GAFS", 3, 0, false );
    SubLFiles.declareFunction( me, "assert_hypothetical_term_rules", "ASSERT-HYPOTHETICAL-TERM-RULES", 4, 0, false );
    SubLFiles.declareFunction( me, "create_hypothesized_constant", "CREATE-HYPOTHESIZED-CONSTANT", 3, 0, false );
    SubLFiles.declareFunction( me, "assert_that_term_is_hypothetical", "ASSERT-THAT-TERM-IS-HYPOTHETICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "hypothesize_dnf_equality_constraints", "HYPOTHESIZE-DNF-EQUALITY-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "hypothesize_dnf_isa_constraints", "HYPOTHESIZE-DNF-ISA-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "hypothesize_dnf_quoted_isa_constraints", "HYPOTHESIZE-DNF-QUOTED-ISA-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "hypothesize_dnf_genl_constraints", "HYPOTHESIZE-DNF-GENL-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "antecedent_dnf_variables_isa_constraints", "ANTECEDENT-DNF-VARIABLES-ISA-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "antecedent_dnf_variables_quoted_isa_constraints", "ANTECEDENT-DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "antecedent_dnf_variables_genl_constraints", "ANTECEDENT-DNF-VARIABLES-GENL-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "suggest_string_from_fort_el_formula", "SUGGEST-STRING-FROM-FORT-EL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "fi_prove", "FI-PROVE", 2, 4, false );
    SubLFiles.declareFunction( me, "fi_prove_int", "FI-PROVE-INT", 2, 4, false );
    SubLFiles.declareFunction( me, "fi_prove_int_new_cyc_query_trampoline", "FI-PROVE-INT-NEW-CYC-QUERY-TRAMPOLINE", 2, 4, false );
    SubLFiles.declareFunction( me, "prove_from", "PROVE-FROM", 3, 4, false );
    SubLFiles.declareFunction( me, "prove_from_forward_time", "PROVE-FROM-FORWARD-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "prove_from_backward_time", "PROVE-FROM-BACKWARD-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "new_prepare_for_proof", "NEW-PREPARE-FOR-PROOF", 3, 0, false );
    SubLFiles.declareFunction( me, "prepare_for_proof", "PREPARE-FOR-PROOF", 4, 0, false );
    SubLFiles.declareFunction( me, "prepare_assumption_mt", "PREPARE-ASSUMPTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "prepare_query_mt", "PREPARE-QUERY-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "prepare_hypothesis_mt", "PREPARE-HYPOTHESIS-MT", 2, 1, false );
    SubLFiles.declareFunction( me, "find_or_create_hypothesis_mt", "FIND-OR-CREATE-HYPOTHESIS-MT", 2, 1, false );
    SubLFiles.declareFunction( me, "find_hypothesis_mt", "FIND-HYPOTHESIS-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_hypothesis_mt_infoP", "VALID-HYPOTHESIS-MT-INFO?", 2, 0, false );
    SubLFiles.declareFunction( me, "create_hypothesis_mt", "CREATE-HYPOTHESIS-MT", 2, 1, false );
    SubLFiles.declareFunction( me, "create_hypothesis_mt_int", "CREATE-HYPOTHESIS-MT-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "note_hypothesis_mt_term_bindings", "NOTE-HYPOTHESIS-MT-TERM-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "kill_cached_hypothesis_mt", "KILL-CACHED-HYPOTHESIS-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "prepare_proof_mt", "PREPARE-PROOF-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_proof_mt", "FIND-OR-CREATE-PROOF-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "find_proof_mt", "FIND-PROOF-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "create_proof_mt", "CREATE-PROOF-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "create_proof_mt_int", "CREATE-PROOF-MT-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "forward_propagate_proof_hypothesis_mt", "FORWARD-PROPAGATE-PROOF-HYPOTHESIS-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "hypothesize_spec_mt", "HYPOTHESIZE-SPEC-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "hypothetical_constant", "HYPOTHETICAL-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_non_wff_conflict_supports", "CONSTRUCT-NON-WFF-CONFLICT-SUPPORTS", 2, 1, false );
    SubLFiles.declareFunction( me, "flatten_explain_hl_why_not_wff", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF", 1, 0, false );
    SubLFiles.declareFunction( me, "flatten_explain_hl_why_not_wff_recursive", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF-RECURSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "convert_to_hl_support", "CONVERT-TO-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_ist_formula_to_hl_support", "CONVERT-IST-FORMULA-TO-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "note_non_wff_conflict", "NOTE-NON-WFF-CONFLICT", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_prove_file()
  {
    $conflicting_support_sets$ = SubLFiles.defparameter( "*CONFLICTING-SUPPORT-SETS*", NIL );
    $something_asserted_within_hypothesize_termsP$ = SubLFiles.defparameter( "*SOMETHING-ASSERTED-WITHIN-HYPOTHESIZE-TERMS?*", NIL );
    $fi_prove_new_cyc_query_trampoline_enabledP$ = SubLFiles.defparameter( "*FI-PROVE-NEW-CYC-QUERY-TRAMPOLINE-ENABLED?*", NIL );
    $proof_hypothesis_forward_propagation_enabled$ = SubLFiles.defparameter( "*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-ENABLED*", NIL );
    $hypothesis_mt_table$ = SubLFiles.deflexical( "*HYPOTHESIS-MT-TABLE*", maybeDefault( $sym56$_HYPOTHESIS_MT_TABLE_, $hypothesis_mt_table$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ),
        ZERO_INTEGER ) ) ) );
    $proof_assume_consequent_type_constraintsP$ = SubLFiles.defvar( "*PROOF-ASSUME-CONSEQUENT-TYPE-CONSTRAINTS?*", T );
    $proof_mt_table$ = SubLFiles.deflexical( "*PROOF-MT-TABLE*", maybeDefault( $sym63$_PROOF_MT_TABLE_, $proof_mt_table$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), ZERO_INTEGER ) ) ) );
    $proof_hypothesis_forward_absolute_time_cutoff$ = SubLFiles.defvar( "*PROOF-HYPOTHESIS-FORWARD-ABSOLUTE-TIME-CUTOFF*", $int65$120 );
    $proof_hypothesis_forward_time_cutoff$ = SubLFiles.defvar( "*PROOF-HYPOTHESIS-FORWARD-TIME-CUTOFF*", FIVE_INTEGER );
    $proof_hypothesis_forward_removal_cost_cutoff$ = SubLFiles.defvar( "*PROOF-HYPOTHESIS-FORWARD-REMOVAL-COST-CUTOFF*", TWENTY_INTEGER );
    $proof_hypothesis_forward_propagation_depth$ = SubLFiles.defvar( "*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-DEPTH*", ONE_INTEGER );
    $hypothesize_spec_mt_sentence$ = SubLFiles.defparameter( "*HYPOTHESIZE-SPEC-MT-SENTENCE*", $list66 );
    $use_new_non_wff_conflict_supports_explain_methodP$ = SubLFiles.defparameter( "*USE-NEW-NON-WFF-CONFLICT-SUPPORTS-EXPLAIN-METHOD?*", T );
    return NIL;
  }

  public static SubLObject setup_prove_file()
  {
    utilities_macros.register_cyc_api_function( $sym3$FI_HYPOTHESIZE, $list4, $str5$Cyc_attempts_to_check_if_SENTENCE, NIL, $list6 );
    utilities_macros.register_cyc_api_function( $sym44$FI_PROVE, $list45, $str46$Attempts_to_prove_SENTENCE_is_tru, NIL, $list47 );
    subl_macro_promotions.declare_defglobal( $sym56$_HYPOTHESIS_MT_TABLE_ );
    access_macros.define_obsolete_register( $sym61$KILL_CACHED_HYPOTHESIS_MT, NIL );
    subl_macro_promotions.declare_defglobal( $sym63$_PROOF_MT_TABLE_ );
    generic_testing.define_test_case_table_int( $sym89$FI_PROVE_INT, ConsesLow.list( new SubLObject[] { $kw90$TEST, NIL, $kw91$OWNER, NIL, $kw92$CLASSES, NIL, $kw93$KB, $kw94$TINY, $kw95$WORKING_, T
    } ), $list96 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_prove_file();
  }

  @Override
  public void initializeVariables()
  {
    init_prove_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_prove_file();
  }
  static
  {
    me = new prove();
    $conflicting_support_sets$ = null;
    $something_asserted_within_hypothesize_termsP$ = null;
    $fi_prove_new_cyc_query_trampoline_enabledP$ = null;
    $proof_hypothesis_forward_propagation_enabled$ = null;
    $hypothesis_mt_table$ = null;
    $proof_assume_consequent_type_constraintsP$ = null;
    $proof_mt_table$ = null;
    $proof_hypothesis_forward_absolute_time_cutoff$ = null;
    $proof_hypothesis_forward_time_cutoff$ = null;
    $proof_hypothesis_forward_removal_cost_cutoff$ = null;
    $proof_hypothesis_forward_propagation_depth$ = null;
    $hypothesize_spec_mt_sentence$ = null;
    $use_new_non_wff_conflict_supports_explain_methodP$ = null;
    $sym0$INFERENCE_RETURN_BLISTS_AND_SUPPORTS = makeSymbol( "INFERENCE-RETURN-BLISTS-AND-SUPPORTS" );
    $str1$HYP = makeString( "HYP" );
    $kw2$HYPOTHESIZE = makeKeyword( "HYPOTHESIZE" );
    $sym3$FI_HYPOTHESIZE = makeSymbol( "FI-HYPOTHESIZE" );
    $list4 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "NAME-PREFIX" ), makeString( "HYP" ) ), makeSymbol( "TERM-IDS" ) );
    $str5$Cyc_attempts_to_check_if_SENTENCE = makeString(
        "Cyc attempts to check if SENTENCE is satisfiable in MT by 'hypothesizing'\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\nand asserting the new sentence in MT.  If this would trigger a \ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\nconstant pairs is returned, indicating the constants which were \nsuccessfully 'hypothesized'.  The form ((T . T)) is returned if no new terms\nrequired creation for the assertion of SENTENCE.\nNAME-PREFIX is a string which is used as a prefix for the name of each new\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\nthat the specified id should be used when generating the constant for the variable\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\nconstants." );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "LISTP" ) ) );
    $kw7$ARG_ERROR = makeKeyword( "ARG-ERROR" );
    $str8$Expected_a_cons__got__S = makeString( "Expected a cons, got ~S" );
    $str9$Expected_a_string__got__S = makeString( "Expected a string, got ~S" );
    $const10$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $str11$ = makeString( "" );
    $const12$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $const13$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $kw14$CONFLICT = makeKeyword( "CONFLICT" );
    $sym15$CONFLICT_HANDLER = makeSymbol( "CONFLICT-HANDLER" );
    $list16 = ConsesLow.listS( makeSymbol( "VARIABLE" ), makeSymbol( "NEW-TERM-NAME" ), makeSymbol( "ISA-CONSTRAINTS" ) );
    $sym17$QUOTED_COLLECTION_ = makeSymbol( "QUOTED-COLLECTION?" );
    $const18$CycLConstant = constant_handles.reader_make_constant_shell( makeString( "CycLConstant" ) );
    $list19 = ConsesLow.cons( makeSymbol( "VARIABLE2" ), makeSymbol( "GENL-CONSTRAINTS" ) );
    $str20$Constraint_variable_mismatch_erro = makeString( "Constraint variable mismatch error in hypothesis: ~a != ~a" );
    $list21 = ConsesLow.cons( makeSymbol( "VARIABLE3" ), makeSymbol( "QUOTED-ISA-CONSTRAINTS" ) );
    $sym22$ANECT_ = makeSymbol( "ANECT?" );
    $const23$equalSymbols = constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) );
    $const24$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const25$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const26$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const27$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym28$STRINGP = makeSymbol( "STRINGP" );
    $str29$_A__A__A = makeString( "~A-~A-~A" );
    $const30$definingMt = constant_handles.reader_make_constant_shell( makeString( "definingMt" ) );
    $list31 = ConsesLow.list( makeKeyword( "STRENGTH" ), makeKeyword( "MONOTONIC" ) );
    $const32$hypotheticalTerm = constant_handles.reader_make_constant_shell( makeString( "hypotheticalTerm" ) );
    $list33 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "ISA-CONSTRAINTS" ) );
    $const34$CycLReifiableDenotationalTerm = constant_handles.reader_make_constant_shell( makeString( "CycLReifiableDenotationalTerm" ) );
    $sym35$_ = makeSymbol( "<" );
    $sym36$SPEC_CARDINALITY = makeSymbol( "SPEC-CARDINALITY" );
    $str37$Term = makeString( "Term" );
    $list38 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "QUOTED-ISA-CONSTRAINTS" ) );
    $list39 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "GENL-CONSTRAINTS" ) );
    $sym40$FORT_P = makeSymbol( "FORT-P" );
    $sym41$CONSTANT_NAME = makeSymbol( "CONSTANT-NAME" );
    $sym42$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $kw43$PROVE = makeKeyword( "PROVE" );
    $sym44$FI_PROVE = makeSymbol( "FI-PROVE" );
    $list45 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "BACKCHAIN" ), makeSymbol( "NUMBER" ), makeSymbol( "TIME" ), makeSymbol( "DEPTH" ) );
    $str46$Attempts_to_prove_SENTENCE_is_tru = makeString(
        "Attempts to prove SENTENCE is true in MT under the given resource constraints.\n   BACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\n   SENTENCE is interpreted as follows:\n   If SENTENCE is of the form (#$implies [antecedant] [consequent]) then\n   (1) free variables in [antecedant] are assumed to be universally quantified\n   (2) remaining variables in [consequent] are assumed to be existentially quantified.\n   Otherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\n   It returns NIL or a list of arguments as described for FI-JUSTIFY." );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "LISTP" ) ) ) );
    $list48 = ConsesLow.list( makeSymbol( "IST" ), makeSymbol( "IST-MT" ), makeSymbol( "IST-SENTENCE" ) );
    $str49$Expected_an_integer__got__S = makeString( "Expected an integer, got ~S" );
    $const50$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $kw51$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $kw52$TAUTOLOGY = makeKeyword( "TAUTOLOGY" );
    $const53$Always_TimeInterval = constant_handles.reader_make_constant_shell( makeString( "Always-TimeInterval" ) );
    $const54$TimePoint = constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) );
    $const55$AnytimePSC = constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) );
    $sym56$_HYPOTHESIS_MT_TABLE_ = makeSymbol( "*HYPOTHESIS-MT-TABLE*" );
    $list57 = ConsesLow.list( makeSymbol( "HYPOTHESIS-MT" ), makeSymbol( "TERM-BINDINGS" ) );
    $const58$HypotheticalContext = constant_handles.reader_make_constant_shell( makeString( "HypotheticalContext" ) );
    $str59$Hypothesis = makeString( "Hypothesis" );
    $sym60$HLMT_P = makeSymbol( "HLMT-P" );
    $sym61$KILL_CACHED_HYPOTHESIS_MT = makeSymbol( "KILL-CACHED-HYPOTHESIS-MT" );
    $list62 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "VALUE" ) );
    $sym63$_PROOF_MT_TABLE_ = makeSymbol( "*PROOF-MT-TABLE*" );
    $str64$Proof = makeString( "Proof" );
    $int65$120 = makeInteger( 120 );
    $list66 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?SPEC-MT" ),
        constant_handles.reader_make_constant_shell( makeString( "HypotheticalContext" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ), makeSymbol( "?SPEC-MT" ), makeKeyword(
            "MT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termDependsOn" ) ), makeSymbol( "?SPEC-MT" ), makeKeyword( "MT" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "ephemeralTerm" ) ), makeSymbol( "?SPEC-MT" ) ) );
    $kw67$MT = makeKeyword( "MT" );
    $sym68$_SPEC_MT = makeSymbol( "?SPEC-MT" );
    $const69$highlyRelevantMt = constant_handles.reader_make_constant_shell( makeString( "highlyRelevantMt" ) );
    $str70$HYP_ = makeString( "HYP-" );
    $sym71$HYPOTHETICAL_CONSTANT = makeSymbol( "HYPOTHETICAL-CONSTANT" );
    $sym72$ASSERTED_ASSERTION_ = makeSymbol( "ASSERTED-ASSERTION?" );
    $sym73$HYPOTHETICAL_TERM_P = makeSymbol( "HYPOTHETICAL-TERM-P" );
    $kw74$QUERY = makeKeyword( "QUERY" );
    $sym75$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE<" );
    $sym76$CONVERT_TO_HL_SUPPORT = makeSymbol( "CONVERT-TO-HL-SUPPORT" );
    $kw77$OPAQUE = makeKeyword( "OPAQUE" );
    $sym78$EPHEMERAL_TERM_ = makeSymbol( "EPHEMERAL-TERM?" );
    $const79$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $kw80$IGNORE = makeKeyword( "IGNORE" );
    $list81 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "SENTENCE" ) );
    $kw82$ISA = makeKeyword( "ISA" );
    $kw83$GENLS = makeKeyword( "GENLS" );
    $const84$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const85$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $kw86$GENLPREDS = makeKeyword( "GENLPREDS" );
    $const87$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $kw88$EVAL = makeKeyword( "EVAL" );
    $sym89$FI_PROVE_INT = makeSymbol( "FI-PROVE-INT" );
    $kw90$TEST = makeKeyword( "TEST" );
    $kw91$OWNER = makeKeyword( "OWNER" );
    $kw92$CLASSES = makeKeyword( "CLASSES" );
    $kw93$KB = makeKeyword( "KB" );
    $kw94$TINY = makeKeyword( "TINY" );
    $kw95$WORKING_ = makeKeyword( "WORKING?" );
    $list96 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeInteger( 212 ), constant_handles
        .reader_make_constant_shell( makeString( "Integer" ) ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) ), ConsesLow.list( NIL ), makeKeyword( "EXHAUST-TOTAL" ) ), ConsesLow.list(
            ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), constant_handles.reader_make_constant_shell( makeString( "True" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "isa" ) ), makeInteger( 212 ), constant_handles.reader_make_constant_shell( makeString( "Integer" ) ) ) ), constant_handles.reader_make_constant_shell( makeString(
                    "BaseKB" ) ) ), ConsesLow.list( NIL ), makeKeyword( "EXHAUST-TOTAL" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ),
                        constant_handles.reader_make_constant_shell( makeString( "False" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeInteger( 212 ), constant_handles
                            .reader_make_constant_shell( makeString( "Integer" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) ), ConsesLow.list( NIL ), makeKeyword( "TAUTOLOGY" ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
          makeInteger( 212 ), constant_handles.reader_make_constant_shell( makeString( "Integer" ) ) ), constant_handles.reader_make_constant_shell( makeString( "True" ) ) ), constant_handles.reader_make_constant_shell(
              makeString( "BaseKB" ) ) ), ConsesLow.list( NIL ), makeKeyword( "TAUTOLOGY" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ),
                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeInteger( 212 ), constant_handles.reader_make_constant_shell( makeString( "Integer" ) ) ), constant_handles
                      .reader_make_constant_shell( makeString( "False" ) ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) ), NIL, makeKeyword( "CONTRADICTION" ) ), ConsesLow.list( ConsesLow
                          .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ) ), ConsesLow
                              .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeInteger( 212 ), constant_handles.reader_make_constant_shell( makeString( "Integer" ) ) ) ), constant_handles
                                  .reader_make_constant_shell( makeString( "BaseKB" ) ) ), ConsesLow.list( NIL ), makeKeyword( "EXHAUST-TOTAL" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ) ), ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "isa" ) ), makeInteger( 212 ), constant_handles.reader_make_constant_shell( makeString( "Integer" ) ) ) ), constant_handles
                                              .reader_make_constant_shell( makeString( "BaseKB" ) ) ), ConsesLow.list( NIL ), makeKeyword( "TAUTOLOGY" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeInteger( 212 ),
                                                      constant_handles.reader_make_constant_shell( makeString( "Integer" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ) ) ),
                                                  constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) ), ConsesLow.list( NIL ), makeKeyword( "TAUTOLOGY" ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                      .list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                          makeInteger( 212 ), constant_handles.reader_make_constant_shell( makeString( "Integer" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                              makeString( "or" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) ), NIL, makeKeyword( "CONTRADICTION" ) )
    } );
  }
}
/*
 * 
 * Total time: 380 ms
 * 
 */