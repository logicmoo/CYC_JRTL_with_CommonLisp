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

public final class prove extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.prove";
    public static final String myFingerPrint = "445b0f7679eb1df4ac234b6092bdf439aea9811f82e5e64699fd80fbb256771e";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 1162L)
    private static SubLSymbol $conflicting_support_sets$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 7603L)
    private static SubLSymbol $something_asserted_within_hypothesize_termsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 25474L)
    private static SubLSymbol $fi_prove_new_cyc_query_trampoline_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 28424L)
    public static SubLSymbol $proof_hypothesis_forward_propagation_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 33802L)
    private static SubLSymbol $hypothesis_mt_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 37306L)
    public static SubLSymbol $proof_assume_consequent_type_constraintsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 38660L)
    private static SubLSymbol $proof_mt_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 40692L)
    public static SubLSymbol $proof_hypothesis_forward_absolute_time_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 40894L)
    public static SubLSymbol $proof_hypothesis_forward_time_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 40963L)
    public static SubLSymbol $proof_hypothesis_forward_removal_cost_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 41033L)
    public static SubLSymbol $proof_hypothesis_forward_propagation_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 41900L)
    private static SubLSymbol $hypothesize_spec_mt_sentence$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 43176L)
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 1278L)
    public static SubLObject prove_justified(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == prove.UNPROVIDED) {
            mt = (SubLObject)prove.NIL;
        }
        if (backchain == prove.UNPROVIDED) {
            backchain = (SubLObject)prove.NIL;
        }
        if (number == prove.UNPROVIDED) {
            number = (SubLObject)prove.NIL;
        }
        if (time == prove.UNPROVIDED) {
            time = (SubLObject)prove.NIL;
        }
        if (depth == prove.UNPROVIDED) {
            depth = (SubLObject)prove.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)prove.NIL;
        SubLObject status = (SubLObject)prove.NIL;
        final SubLObject _prev_bind_0 = control_vars.$inference_answer_handler$.currentBinding(thread);
        try {
            control_vars.$inference_answer_handler$.bind((SubLObject)prove.$sym0$INFERENCE_RETURN_BLISTS_AND_SUPPORTS, thread);
            thread.resetMultipleValues();
            final SubLObject ask_results = fi_prove_int(sentence, mt, backchain, number, time, depth);
            final SubLObject ask_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            results = ask_results;
            status = ask_status;
        }
        finally {
            control_vars.$inference_answer_handler$.rebind(_prev_bind_0, thread);
        }
        return Values.values(results, status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 1799L)
    public static SubLObject fi_hypothesize(final SubLObject sentence, final SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == prove.UNPROVIDED) {
            name_prefix = (SubLObject)prove.$str1$HYP;
        }
        if (term_ids == prove.UNPROVIDED) {
            term_ids = (SubLObject)prove.NIL;
        }
        return fi.fi((SubLObject)prove.$kw2$HYPOTHESIZE, sentence, mt, name_prefix, term_ids, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 2945L)
    public static SubLObject fi_hypothesize_int(final SubLObject sentence, SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == prove.UNPROVIDED) {
            name_prefix = (SubLObject)prove.$str1$HYP;
        }
        if (term_ids == prove.UNPROVIDED) {
            term_ids = (SubLObject)prove.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        fi.reset_fi_error_state();
        if (!sentence.isCons()) {
            fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)prove.$kw7$ARG_ERROR, (SubLObject)prove.$str8$Expected_a_cons__got__S, sentence));
            return (SubLObject)prove.NIL;
        }
        mt = fi.fi_convert_to_assert_hlmt_if_wft(mt);
        if (prove.NIL != fi.fi_error_signaledP()) {
            return (SubLObject)prove.NIL;
        }
        if (!name_prefix.isString()) {
            fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)prove.$kw7$ARG_ERROR, (SubLObject)prove.$str9$Expected_a_string__got__S, name_prefix));
            return (SubLObject)prove.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject var_term_bindings = hypothesize_terms(sentence, mt, name_prefix, term_ids);
        final SubLObject success = thread.secondMultipleValue();
        final SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (prove.NIL == success) {
            return Values.values((SubLObject)prove.NIL, failure_reasons);
        }
        if (prove.NIL == var_term_bindings) {
            return Values.values(bindings.unification_success_token(), (SubLObject)prove.NIL);
        }
        return Values.values(var_term_bindings, (SubLObject)prove.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 3950L)
    public static SubLObject hypothesize_terms(final SubLObject sentence, final SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == prove.UNPROVIDED) {
            name_prefix = (SubLObject)prove.$str1$HYP;
        }
        if (term_ids == prove.UNPROVIDED) {
            term_ids = (SubLObject)prove.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject canonical_sentence = inference_czer.canonicalize_hypothesis(sentence, mt);
        final SubLObject canonical_mt = thread.secondMultipleValue();
        final SubLObject free_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject literals = inference_czer.categorize_hypothesis_formulas(canonical_sentence);
        final SubLObject rules = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject literals_sentence = reader.bq_cons(prove.$const10$and, ConsesLow.append(literals, (SubLObject)prove.NIL));
        thread.resetMultipleValues();
        SubLObject ans = hypothesize_terms_for_antecedent(literals_sentence, rules, canonical_mt, name_prefix, term_ids, free_vars);
        final SubLObject terms = thread.secondMultipleValue();
        final SubLObject successP = thread.thirdMultipleValue();
        final SubLObject failure_reasons = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (prove.NIL == successP) {
            ans = (SubLObject)prove.NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = (SubLObject)prove.NIL;
            v_term = cdolist_list_var.first();
            while (prove.NIL != cdolist_list_var) {
                fi.fi_kill_int(v_term);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
        }
        return Values.values(ans, successP, failure_reasons);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 5023L)
    public static SubLObject hypothesize_terms_for_antecedent(final SubLObject antecedent, final SubLObject rules, final SubLObject mt, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject free_vars) {
        return hypothesize_terms_int(antecedent, rules, mt, name_prefix, term_ids, (SubLObject)prove.NIL, (SubLObject)prove.T, free_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 5228L)
    public static SubLObject hypothesize_terms_for_consequent(final SubLObject consequent, final SubLObject mt, final SubLObject term_bindings, final SubLObject free_vars) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)prove.FOUR_INTEGER), hypothesize_terms_int(consequent, (SubLObject)prove.NIL, mt, (SubLObject)prove.$str11$, (SubLObject)prove.NIL, term_bindings, (SubLObject)prove.NIL, free_vars));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 5434L)
    public static SubLObject hypothesize_terms_int(final SubLObject sentence, final SubLObject rules, SubLObject mt, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject term_bindings, final SubLObject assert_sentenceP, final SubLObject free_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_bindings = (SubLObject)prove.NIL;
        SubLObject terms = (SubLObject)prove.NIL;
        SubLObject successP = (SubLObject)prove.NIL;
        SubLObject something_assertedP = (SubLObject)prove.NIL;
        SubLObject failure_reasons = (SubLObject)prove.NIL;
        conflicts.clear_inconsistent_support_sets();
        final SubLObject _prev_bind_0 = prove.$conflicting_support_sets$.currentBinding(thread);
        try {
            prove.$conflicting_support_sets$.bind((SubLObject)prove.NIL, thread);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject canon_versions = (SubLObject)prove.NIL;
                thread.resetMultipleValues();
                final SubLObject canon_versions_$2 = inference_czer.canonicalize_hypothetical_ask(sentence, mt);
                final SubLObject mt_$3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$2;
                mt = mt_$3;
                if (prove.NIL == canon_versions) {
                    note_non_wff_conflict(sentence, mt, (SubLObject)prove.UNPROVIDED);
                }
                else if (canon_versions.eql(prove.$const12$False)) {
                    note_non_wff_conflict(sentence, mt, (SubLObject)prove.UNPROVIDED);
                }
                else if (canon_versions.eql(prove.$const13$True) && prove.NIL == rules) {
                    successP = (SubLObject)prove.T;
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject result_bindings_$4 = hypothesize_terms_int_2(canon_versions, mt, rules, name_prefix, term_ids, term_bindings, assert_sentenceP, free_vars);
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
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
            }
            failure_reasons = prove.$conflicting_support_sets$.getDynamicValue(thread);
        }
        finally {
            prove.$conflicting_support_sets$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result_bindings, terms, successP, failure_reasons, something_assertedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 7678L)
    public static SubLObject hypothesize_terms_int_2(final SubLObject canon_versions, final SubLObject mt, final SubLObject rules, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject term_bindings, final SubLObject assert_sentenceP, final SubLObject free_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_bindings = (SubLObject)prove.NIL;
        SubLObject terms = (SubLObject)prove.NIL;
        SubLObject successP = (SubLObject)prove.NIL;
        SubLObject something_assertedP = (SubLObject)prove.NIL;
        SubLObject num_vars = (SubLObject)prove.ZERO_INTEGER;
        SubLObject term_variable_map = (SubLObject)prove.NIL;
        final SubLObject _prev_bind_0 = prove.$something_asserted_within_hypothesize_termsP$.currentBinding(thread);
        try {
            prove.$something_asserted_within_hypothesize_termsP$.bind((SubLObject)prove.NIL, thread);
            try {
                thread.throwStack.push(prove.$kw14$CONFLICT);
                final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)prove.$sym15$CONFLICT_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$9 = control_vars.$conflicts_from_invalid_deductions$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = Errors.$ignore_warnsP$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = wff_vars.$enforce_literal_wff_idiosyncrasiesP$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = control_vars.$record_inconsistent_support_sets$.currentBinding(thread);
                        try {
                            control_vars.$conflicts_from_invalid_deductions$.bind((SubLObject)prove.T, thread);
                            Errors.$ignore_warnsP$.bind((SubLObject)prove.T, thread);
                            wff_vars.$enforce_literal_wff_idiosyncrasiesP$.bind((SubLObject)prove.NIL, thread);
                            control_vars.$record_inconsistent_support_sets$.bind((SubLObject)prove.T, thread);
                            final SubLObject _prev_bind_0_$10 = control_vars.$ignore_non_definitional_conflictsP$.currentBinding(thread);
                            try {
                                control_vars.$ignore_non_definitional_conflictsP$.bind((SubLObject)prove.T, thread);
                                if (!canon_versions.eql(prove.$const13$True)) {
                                    final SubLObject canon_version = canon_versions.first();
                                    final SubLObject canon_var_map = conses_high.second(canon_version);
                                    thread.resetMultipleValues();
                                    final SubLObject dnf = fi.fi_canonicalize(canon_version, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
                                    final SubLObject v_variables = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    num_vars = Sequences.length(v_variables);
                                    final SubLObject var_equality_constraints = hypothesize_dnf_equality_constraints(dnf, mt);
                                    final SubLObject var_isa_constraints = hypothesize_dnf_isa_constraints(dnf, mt);
                                    if (Sequences.length(var_isa_constraints).numE(num_vars)) {
                                        final SubLObject var_quoted_isa_constraints = hypothesize_dnf_quoted_isa_constraints(dnf, mt);
                                        if (Sequences.length(var_quoted_isa_constraints).numE(num_vars)) {
                                            final SubLObject var_genl_constraints = hypothesize_dnf_genl_constraints(dnf, mt);
                                            if (Sequences.length(var_genl_constraints).numE(num_vars)) {
                                                thread.resetMultipleValues();
                                                final SubLObject terms_$11 = hypothesize_terms_for_variables(var_equality_constraints, var_isa_constraints, var_quoted_isa_constraints, var_genl_constraints, mt, canon_var_map, terms, name_prefix, term_ids, term_bindings);
                                                final SubLObject term_variable_map_$12 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                terms = terms_$11;
                                                term_variable_map = term_variable_map_$12;
                                                if (prove.NIL != assert_sentenceP) {
                                                    assert_hypothetical_term_content_gafs(dnf, mt, term_variable_map);
                                                    SubLObject i;
                                                    SubLObject var;
                                                    SubLObject v_term;
                                                    for (i = (SubLObject)prove.NIL, i = (SubLObject)prove.ZERO_INTEGER; i.numL(num_vars); i = Numbers.add(i, (SubLObject)prove.ONE_INTEGER)) {
                                                        var = ConsesLow.nth(i, v_variables);
                                                        v_term = conses_high.assoc(variables.find_variable_by_id(i), term_variable_map, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED).rest();
                                                        if (prove.NIL != subl_promotions.memberP(var, free_vars, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED)) {
                                                            result_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var, v_term), result_bindings);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            finally {
                                control_vars.$ignore_non_definitional_conflictsP$.rebind(_prev_bind_0_$10, thread);
                            }
                            assert_hypothetical_term_rules(rules, mt, term_variable_map, result_bindings);
                            result_bindings = Sequences.nreverse(result_bindings);
                            successP = (SubLObject)prove.T;
                            something_assertedP = prove.$something_asserted_within_hypothesize_termsP$.getDynamicValue(thread);
                        }
                        finally {
                            control_vars.$record_inconsistent_support_sets$.rebind(_prev_bind_4, thread);
                            wff_vars.$enforce_literal_wff_idiosyncrasiesP$.rebind(_prev_bind_3, thread);
                            Errors.$ignore_warnsP$.rebind(_prev_bind_2, thread);
                            control_vars.$conflicts_from_invalid_deductions$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)prove.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                result_bindings = Errors.handleThrowable(ccatch_env_var, (SubLObject)prove.$kw14$CONFLICT);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            prove.$something_asserted_within_hypothesize_termsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result_bindings, terms, successP, something_assertedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 10529L)
    public static SubLObject hypothesize_terms_for_variables(final SubLObject var_equality_constraints, final SubLObject var_isa_constraints, final SubLObject var_quoted_isa_constraints, final SubLObject var_genl_constraints, final SubLObject mt, final SubLObject canon_var_map, SubLObject terms, final SubLObject name_prefix, final SubLObject term_ids, final SubLObject term_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term_variable_map = (SubLObject)prove.NIL;
        SubLObject var_isa_constraint = (SubLObject)prove.NIL;
        SubLObject var_isa_constraint_$13 = (SubLObject)prove.NIL;
        SubLObject var_quoted_isa_constraint = (SubLObject)prove.NIL;
        SubLObject var_quoted_isa_constraint_$14 = (SubLObject)prove.NIL;
        SubLObject var_genl_constraint = (SubLObject)prove.NIL;
        SubLObject var_genl_constraint_$15 = (SubLObject)prove.NIL;
        var_isa_constraint = var_isa_constraints;
        var_isa_constraint_$13 = var_isa_constraint.first();
        var_quoted_isa_constraint = var_quoted_isa_constraints;
        var_quoted_isa_constraint_$14 = var_quoted_isa_constraint.first();
        var_genl_constraint = var_genl_constraints;
        var_genl_constraint_$15 = var_genl_constraint.first();
        while (prove.NIL != var_genl_constraint || prove.NIL != var_quoted_isa_constraint || prove.NIL != var_isa_constraint) {
            SubLObject current;
            final SubLObject datum = current = var_isa_constraint_$13;
            SubLObject variable = (SubLObject)prove.NIL;
            SubLObject new_term_name = (SubLObject)prove.NIL;
            SubLObject isa_constraints = (SubLObject)prove.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)prove.$list16);
            variable = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)prove.$list16);
            new_term_name = current.first();
            current = (isa_constraints = current.rest());
            final SubLObject equal_symbol = list_utilities.alist_lookup(var_equality_constraints, variable, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
            if (prove.NIL != equal_symbol) {
                final SubLObject new_binding = bindings.make_variable_binding(variable, equal_symbol);
                term_variable_map = (SubLObject)ConsesLow.cons(new_binding, term_variable_map);
            }
            else {
                final SubLObject quoted_col_isa_constraints = list_utilities.remove_if_not((SubLObject)prove.$sym17$QUOTED_COLLECTION_, isa_constraints, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
                if (prove.NIL == disjoint_with.any_disjoint_withP(quoted_col_isa_constraints, prove.$const18$CycLConstant, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED)) {
                    SubLObject current_$17;
                    final SubLObject datum_$16 = current_$17 = var_genl_constraint_$15;
                    SubLObject variable2 = (SubLObject)prove.NIL;
                    SubLObject genl_constraints = (SubLObject)prove.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$16, (SubLObject)prove.$list19);
                    variable2 = current_$17.first();
                    current_$17 = (genl_constraints = current_$17.rest());
                    if (prove.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !variable.eql(variable2)) {
                        Errors.error((SubLObject)prove.$str20$Constraint_variable_mismatch_erro, variable, variable2);
                    }
                    SubLObject current_$18;
                    final SubLObject datum_$17 = current_$18 = var_quoted_isa_constraint_$14;
                    SubLObject variable3 = (SubLObject)prove.NIL;
                    SubLObject quoted_isa_constraints = (SubLObject)prove.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)prove.$list21);
                    variable3 = current_$18.first();
                    current_$18 = (quoted_isa_constraints = current_$18.rest());
                    if (prove.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !variable.eql(variable3)) {
                        Errors.error((SubLObject)prove.$str20$Constraint_variable_mismatch_erro, variable, variable3);
                    }
                    final SubLObject current_el_variable = conses_high.rassoc(variable, canon_var_map, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED).first();
                    final SubLObject new_term_id = conses_high.assoc(current_el_variable, term_ids, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED).rest();
                    final SubLObject new_term = (prove.NIL != term_bindings) ? list_utilities.alist_lookup(term_bindings, current_el_variable, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED) : create_hypothesized_constant(name_prefix, new_term_name, new_term_id);
                    final SubLObject newP = (SubLObject)SubLObjectFactory.makeBoolean(prove.NIL == term_bindings);
                    final SubLObject new_binding2 = bindings.make_variable_binding(variable, new_term);
                    if (prove.NIL != new_term) {
                        term_variable_map = (SubLObject)ConsesLow.cons(new_binding2, term_variable_map);
                        terms = (SubLObject)ConsesLow.cons(new_term, terms);
                        final SubLObject non_anect_isa_constraints = Sequences.remove_if((SubLObject)prove.$sym22$ANECT_, isa_constraints, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
                        if (prove.NIL != non_anect_isa_constraints) {
                            final SubLObject min_anects = at_utilities.union_min_anects(non_anect_isa_constraints, mt);
                            isa_constraints = ConsesLow.append(min_anects, isa_constraints);
                        }
                        final SubLObject non_anect_quoted_isa_constraints = Sequences.remove_if((SubLObject)prove.$sym22$ANECT_, quoted_isa_constraints, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
                        if (prove.NIL != non_anect_quoted_isa_constraints) {
                            final SubLObject min_anects = at_utilities.union_min_anects(non_anect_quoted_isa_constraints, mt);
                            quoted_isa_constraints = ConsesLow.append(min_anects, quoted_isa_constraints);
                        }
                        final SubLObject non_anect_genl_constraints = Sequences.remove_if((SubLObject)prove.$sym22$ANECT_, genl_constraints, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
                        if (prove.NIL != non_anect_genl_constraints) {
                            final SubLObject min_anects = at_utilities.union_min_anects(non_anect_genl_constraints, mt);
                            genl_constraints = ConsesLow.append(min_anects, genl_constraints);
                        }
                        final SubLObject isas_okP = assert_hypothetical_term_isa_constraints(new_term, new_binding2, isa_constraints, mt);
                        if (prove.NIL != newP) {
                            assert_that_term_is_hypothetical(new_term, mt);
                        }
                        if (prove.NIL == isas_okP) {
                            conflicts.conflict_abort();
                        }
                        assert_hypothetical_term_quoted_isa_constraints(new_term, new_binding2, quoted_isa_constraints, mt);
                        assert_hypothetical_term_genl_constraints(new_term, new_binding2, genl_constraints, mt);
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
        terms = Sequences.nreverse(terms);
        return Values.values(terms, term_variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 14400L)
    public static SubLObject assert_within_hypothetical(final SubLObject sentence, final SubLObject mt, final SubLObject variable_map, SubLObject abort_on_failureP) {
        if (abort_on_failureP == prove.UNPROVIDED) {
            abort_on_failureP = (SubLObject)prove.T;
        }
        fi.fi_assert_int(sentence, mt, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
        if (prove.NIL == fi.fi_error_signaledP()) {
            prove.$something_asserted_within_hypothesize_termsP$.setDynamicValue((SubLObject)prove.T);
            return (SubLObject)prove.T;
        }
        note_non_wff_conflict(sentence, mt, variable_map);
        if (prove.NIL != el_utilities.el_formula_with_operator_p(sentence, prove.$const23$equalSymbols)) {
            return (SubLObject)prove.NIL;
        }
        if (prove.NIL != abort_on_failureP) {
            conflicts.conflict_abort();
        }
        return (SubLObject)prove.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 14905L)
    public static SubLObject assert_hypothetical_term_isa_constraints(final SubLObject new_term, final SubLObject new_binding, final SubLObject isa_constraints, final SubLObject mt) {
        SubLObject cdolist_list_var = isa_constraints;
        SubLObject isa_constraint = (SubLObject)prove.NIL;
        isa_constraint = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            SubLObject assert_mt = mt;
            if (prove.NIL == isa.isaP(new_term, isa_constraint, mt, (SubLObject)prove.UNPROVIDED)) {
                final SubLObject isa_constraint_sentence = (SubLObject)ConsesLow.list(prove.$const24$isa, new_term, isa_constraint);
                if (prove.NIL != kb_accessors.anectP(isa_constraint)) {
                    assert_mt = prove.$const25$UniversalVocabularyMt;
                }
                if (prove.NIL == assert_within_hypothetical(isa_constraint_sentence, assert_mt, (SubLObject)ConsesLow.list(new_binding), (SubLObject)prove.NIL)) {
                    return (SubLObject)prove.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_constraint = cdolist_list_var.first();
        }
        return (SubLObject)prove.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 15634L)
    public static SubLObject assert_hypothetical_term_quoted_isa_constraints(final SubLObject new_term, final SubLObject new_binding, final SubLObject quoted_isa_constraints, final SubLObject mt) {
        SubLObject cdolist_list_var = quoted_isa_constraints;
        SubLObject quoted_isa_constraint = (SubLObject)prove.NIL;
        quoted_isa_constraint = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            if (prove.NIL == at_defns.quoted_has_typeP(new_term, quoted_isa_constraint, mt)) {
                final SubLObject quoted_isa_constraint_sentence = (SubLObject)ConsesLow.list(prove.$const26$quotedIsa, new_term, quoted_isa_constraint);
                if (prove.NIL == assert_within_hypothetical(quoted_isa_constraint_sentence, mt, (SubLObject)ConsesLow.list(new_binding), (SubLObject)prove.UNPROVIDED)) {
                    return (SubLObject)prove.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            quoted_isa_constraint = cdolist_list_var.first();
        }
        return (SubLObject)prove.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 16312L)
    public static SubLObject assert_hypothetical_term_genl_constraints(final SubLObject new_term, final SubLObject new_binding, final SubLObject genl_constraints, final SubLObject mt) {
        SubLObject cdolist_list_var = genl_constraints;
        SubLObject genl_constraint = (SubLObject)prove.NIL;
        genl_constraint = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            if (prove.NIL == genls.genlsP(new_term, genl_constraint, mt, (SubLObject)prove.UNPROVIDED)) {
                final SubLObject genl_constraint_sentence = (SubLObject)ConsesLow.list(prove.$const27$genls, new_term, genl_constraint);
                if (prove.NIL == assert_within_hypothetical(genl_constraint_sentence, mt, (SubLObject)ConsesLow.list(new_binding), (SubLObject)prove.UNPROVIDED)) {
                    return (SubLObject)prove.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_constraint = cdolist_list_var.first();
        }
        return (SubLObject)prove.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 16902L)
    public static SubLObject assert_hypothetical_term_content_gafs(SubLObject dnf, final SubLObject mt, final SubLObject term_variable_map) {
        dnf = conses_high.nsublis(term_variable_map, dnf, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
        SubLObject cdolist_list_var = czer_utilities.definitional_lits_to_front(clauses.pos_lits(dnf));
        SubLObject new_sentence = (SubLObject)prove.NIL;
        new_sentence = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            if (prove.NIL == assert_within_hypothetical(new_sentence, mt, term_variable_map, (SubLObject)prove.UNPROVIDED)) {
                return (SubLObject)prove.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_sentence = cdolist_list_var.first();
        }
        cdolist_list_var = czer_utilities.definitional_lits_to_front(clauses.neg_lits(dnf));
        SubLObject neg_lit = (SubLObject)prove.NIL;
        neg_lit = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            final SubLObject new_sentence2 = cycl_utilities.negate(neg_lit);
            if (prove.NIL == assert_within_hypothetical(new_sentence2, mt, term_variable_map, (SubLObject)prove.UNPROVIDED)) {
                return (SubLObject)prove.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            neg_lit = cdolist_list_var.first();
        }
        return (SubLObject)prove.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 17713L)
    public static SubLObject assert_hypothetical_term_rules(final SubLObject rules, final SubLObject mt, final SubLObject term_variable_map, final SubLObject v_bindings) {
        SubLObject cdolist_list_var = rules;
        SubLObject rule = (SubLObject)prove.NIL;
        rule = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            SubLObject new_rule = rule;
            if (prove.NIL != v_bindings) {
                new_rule = conses_high.sublis(v_bindings, rule, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
            }
            if (prove.NIL == assert_within_hypothetical(new_rule, mt, term_variable_map, (SubLObject)prove.UNPROVIDED)) {
                return (SubLObject)prove.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return (SubLObject)prove.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 18049L)
    public static SubLObject create_hypothesized_constant(final SubLObject name_prefix, final SubLObject start_name, final SubLObject external_id) {
        assert prove.NIL != Types.stringp(name_prefix) : name_prefix;
        assert prove.NIL != Types.stringp(start_name) : start_name;
        final SubLObject initial_name = constant_completion_high.uniquify_constant_name(start_name, (SubLObject)prove.UNPROVIDED);
        final SubLObject v_term = fi.fi_create_int(initial_name, external_id);
        if (prove.NIL != constant_handles.constant_p(v_term)) {
            final SubLObject term_id = constants_high.constant_internal_id(v_term);
            SubLObject final_name = PrintLow.format((SubLObject)prove.NIL, (SubLObject)prove.$str29$_A__A__A, new SubLObject[] { name_prefix, start_name, term_id });
            final_name = constant_completion_high.uniquify_constant_name(final_name, (SubLObject)prove.UNPROVIDED);
            fi.fi_rename_int(v_term, final_name);
            return v_term;
        }
        return (SubLObject)prove.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 19323L)
    public static SubLObject assert_that_term_is_hypothetical(final SubLObject v_term, final SubLObject mt) {
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(prove.$const30$definingMt, v_term, monad_mt), mt_vars.$defining_mt_mt$.getGlobalValue(), (SubLObject)prove.$list31);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(prove.$const32$hypotheticalTerm, v_term), mt, (SubLObject)prove.$list31);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 19840L)
    public static SubLObject hypothesize_dnf_equality_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject equality_alist = (SubLObject)prove.NIL;
        final SubLObject equality_dict = dictionary.new_dictionary((SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
        SubLObject conflict_vars = (SubLObject)prove.NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(dnf);
        SubLObject asent = (SubLObject)prove.NIL;
        asent = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            final SubLObject items_var = simplifier.fold_equals_in_asent(asent, equality_dict, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = (SubLObject)prove.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)prove.NIL, v_iteration = (SubLObject)prove.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)prove.ONE_INTEGER)) {
                    element_num = ((prove.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)prove.ONE_INTEGER) : v_iteration);
                    item = Vectors.aref(vector_var, element_num);
                    conflict_vars = (SubLObject)ConsesLow.cons(item, conflict_vars);
                }
            }
            else {
                SubLObject cdolist_list_var_$20 = items_var;
                SubLObject item2 = (SubLObject)prove.NIL;
                item2 = cdolist_list_var_$20.first();
                while (prove.NIL != cdolist_list_var_$20) {
                    conflict_vars = (SubLObject)ConsesLow.cons(item2, conflict_vars);
                    cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                    item2 = cdolist_list_var_$20.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(equality_dict)); prove.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject open_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject closed_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (prove.NIL == subl_promotions.memberP(open_term, conflict_vars, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED)) {
                equality_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(open_term, closed_term), equality_alist);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return equality_alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 20413L)
    public static SubLObject hypothesize_dnf_isa_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLObject variable_isa_constraints = antecedent_dnf_variables_isa_constraints(dnf, mt);
        SubLObject ans = (SubLObject)prove.NIL;
        SubLObject cdolist_list_var = variable_isa_constraints;
        SubLObject variable_isa_constraint = (SubLObject)prove.NIL;
        variable_isa_constraint = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable_isa_constraint;
            SubLObject variable = (SubLObject)prove.NIL;
            SubLObject isa_constraints = (SubLObject)prove.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)prove.$list33);
            variable = current.first();
            current = (isa_constraints = current.rest());
            isa_constraints = Sequences.delete(prove.$const34$CycLReifiableDenotationalTerm, isa_constraints, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
            final SubLObject most_specific = list_utilities.extremal(isa_constraints, Symbols.symbol_function((SubLObject)prove.$sym35$_), Symbols.symbol_function((SubLObject)prove.$sym36$SPEC_CARDINALITY));
            SubLObject suggested_name = (SubLObject)prove.$str37$Term;
            if (prove.NIL != forts.fort_p(most_specific)) {
                suggested_name = suggest_string_from_fort_el_formula(most_specific);
            }
            ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(variable, suggested_name, ConsesLow.append(isa_constraints, (SubLObject)prove.NIL)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            variable_isa_constraint = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 21455L)
    public static SubLObject hypothesize_dnf_quoted_isa_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLObject variable_quoted_isa_constraints = antecedent_dnf_variables_quoted_isa_constraints(dnf, mt);
        SubLObject ans = (SubLObject)prove.NIL;
        SubLObject cdolist_list_var = variable_quoted_isa_constraints;
        SubLObject variable_quoted_isa_constraint = (SubLObject)prove.NIL;
        variable_quoted_isa_constraint = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable_quoted_isa_constraint;
            SubLObject variable = (SubLObject)prove.NIL;
            SubLObject quoted_isa_constraints = (SubLObject)prove.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)prove.$list38);
            variable = current.first();
            current = (quoted_isa_constraints = current.rest());
            quoted_isa_constraints = Sequences.delete(prove.$const34$CycLReifiableDenotationalTerm, quoted_isa_constraints, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
            ans = (SubLObject)ConsesLow.cons(reader.bq_cons(variable, ConsesLow.append(quoted_isa_constraints, (SubLObject)prove.NIL)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            variable_quoted_isa_constraint = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 22329L)
    public static SubLObject hypothesize_dnf_genl_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLObject variable_genl_constraints = antecedent_dnf_variables_genl_constraints(dnf, mt);
        SubLObject ans = (SubLObject)prove.NIL;
        SubLObject cdolist_list_var = variable_genl_constraints;
        SubLObject variable_genl_constraint = (SubLObject)prove.NIL;
        variable_genl_constraint = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable_genl_constraint;
            SubLObject variable = (SubLObject)prove.NIL;
            SubLObject genl_constraints = (SubLObject)prove.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)prove.$list39);
            variable = current.first();
            current = (genl_constraints = current.rest());
            genl_constraints = Sequences.delete(prove.$const34$CycLReifiableDenotationalTerm, genl_constraints, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
            ans = (SubLObject)ConsesLow.cons(reader.bq_cons(variable, ConsesLow.append(genl_constraints, (SubLObject)prove.NIL)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            variable_genl_constraint = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 23195L)
    public static SubLObject antecedent_dnf_variables_isa_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)prove.NIL;
        final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind((SubLObject)prove.T, thread);
            result = at_var_types.dnf_variables_isa_constraints(dnf, mt, (SubLObject)prove.UNPROVIDED);
        }
        finally {
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 23510L)
    public static SubLObject antecedent_dnf_variables_quoted_isa_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)prove.NIL;
        final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind((SubLObject)prove.T, thread);
            result = at_var_types.dnf_variables_quoted_isa_constraints(dnf, mt, (SubLObject)prove.UNPROVIDED);
        }
        finally {
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 23839L)
    public static SubLObject antecedent_dnf_variables_genl_constraints(final SubLObject dnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)prove.NIL;
        final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind((SubLObject)prove.T, thread);
            result = at_var_types.dnf_variables_genl_constraints(dnf, mt, (SubLObject)prove.UNPROVIDED);
        }
        finally {
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 24156L)
    public static SubLObject suggest_string_from_fort_el_formula(final SubLObject fort) {
        assert prove.NIL != forts.fort_p(fort) : fort;
        if (prove.NIL != nart_handles.nart_p(fort)) {
            return string_utilities.strcat(Mapping.mapcar(Symbols.symbol_function((SubLObject)prove.$sym41$CONSTANT_NAME), list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)prove.$sym42$CONSTANT_P), list_utilities.flatten(forts.fort_el_formula(fort)), (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED)));
        }
        if (prove.NIL != constant_handles.constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        return (SubLObject)prove.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 24524L)
    public static SubLObject fi_prove(final SubLObject sentence, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == prove.UNPROVIDED) {
            backchain = (SubLObject)prove.NIL;
        }
        if (number == prove.UNPROVIDED) {
            number = (SubLObject)prove.NIL;
        }
        if (time == prove.UNPROVIDED) {
            time = (SubLObject)prove.NIL;
        }
        if (depth == prove.UNPROVIDED) {
            depth = (SubLObject)prove.NIL;
        }
        return fi.fi((SubLObject)prove.$kw43$PROVE, sentence, mt, backchain, number, time, depth, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 25547L)
    public static SubLObject fi_prove_int(final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == prove.UNPROVIDED) {
            backchain = (SubLObject)prove.NIL;
        }
        if (number == prove.UNPROVIDED) {
            number = (SubLObject)prove.NIL;
        }
        if (time == prove.UNPROVIDED) {
            time = (SubLObject)prove.NIL;
        }
        if (depth == prove.UNPROVIDED) {
            depth = (SubLObject)prove.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        fi.reset_fi_error_state();
        if (!sentence.isCons()) {
            fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)prove.$kw7$ARG_ERROR, (SubLObject)prove.$str8$Expected_a_cons__got__S, sentence));
            return (SubLObject)prove.NIL;
        }
        if (prove.NIL != fi.fi_ask_ist_query_p(sentence)) {
            SubLObject ist = (SubLObject)prove.NIL;
            SubLObject ist_mt = (SubLObject)prove.NIL;
            SubLObject ist_sentence = (SubLObject)prove.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(sentence, sentence, (SubLObject)prove.$list48);
            ist = sentence.first();
            SubLObject current = sentence.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, sentence, (SubLObject)prove.$list48);
            ist_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, sentence, (SubLObject)prove.$list48);
            ist_sentence = current.first();
            current = current.rest();
            if (prove.NIL == current) {
                return fi_prove_int(ist_sentence, ist_mt, backchain, number, time, depth);
            }
            cdestructuring_bind.cdestructuring_bind_error(sentence, (SubLObject)prove.$list48);
            return (SubLObject)prove.NIL;
        }
        else {
            mt = fi.fi_convert_to_fort(mt);
            if (prove.NIL != fi.fi_error_signaledP()) {
                return (SubLObject)prove.NIL;
            }
            if (prove.NIL != backchain && backchain != prove.T && !backchain.isInteger()) {
                fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)prove.$kw7$ARG_ERROR, (SubLObject)prove.$str49$Expected_an_integer__got__S, backchain));
                return (SubLObject)prove.NIL;
            }
            if (prove.NIL != number && !number.isInteger()) {
                fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)prove.$kw7$ARG_ERROR, (SubLObject)prove.$str49$Expected_an_integer__got__S, number));
                return (SubLObject)prove.NIL;
            }
            if (prove.NIL != time && !time.isInteger()) {
                fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)prove.$kw7$ARG_ERROR, (SubLObject)prove.$str49$Expected_an_integer__got__S, time));
                return (SubLObject)prove.NIL;
            }
            if (prove.NIL != depth && !depth.isInteger()) {
                fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)prove.$kw7$ARG_ERROR, (SubLObject)prove.$str49$Expected_an_integer__got__S, depth));
                return (SubLObject)prove.NIL;
            }
            if (prove.NIL != prove.$fi_prove_new_cyc_query_trampoline_enabledP$.getDynamicValue(thread)) {
                thread.resetMultipleValues();
                final SubLObject v_answer = fi_prove_int_new_cyc_query_trampoline(sentence, mt, backchain, number, time, depth);
                final SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return Values.values(v_answer, reason);
            }
            if (sentence.isCons() && sentence.first().eql(prove.$const50$implies)) {
                return prove_from(conses_high.second(sentence), conses_high.third(sentence), mt, backchain, number, time, depth);
            }
            return prove_from(prove.$const13$True, sentence, mt, backchain, number, time, depth);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 27207L)
    public static SubLObject fi_prove_int_new_cyc_query_trampoline(final SubLObject sentence, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == prove.UNPROVIDED) {
            backchain = (SubLObject)prove.NIL;
        }
        if (number == prove.UNPROVIDED) {
            number = (SubLObject)prove.NIL;
        }
        if (time == prove.UNPROVIDED) {
            time = (SubLObject)prove.NIL;
        }
        if (depth == prove.UNPROVIDED) {
            depth = (SubLObject)prove.NIL;
        }
        SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        query_properties = conses_high.copy_list(query_properties);
        if (prove.NIL != el_utilities.el_implication_p(sentence)) {
            query_properties = conses_high.putf(query_properties, (SubLObject)prove.$kw51$CONDITIONAL_SENTENCE_, (SubLObject)prove.T);
        }
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 27652L)
    public static SubLObject prove_from(final SubLObject antecedant, final SubLObject consequent, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == prove.UNPROVIDED) {
            backchain = (SubLObject)prove.NIL;
        }
        if (number == prove.UNPROVIDED) {
            number = (SubLObject)prove.NIL;
        }
        if (time == prove.UNPROVIDED) {
            time = (SubLObject)prove.NIL;
        }
        if (depth == prove.UNPROVIDED) {
            depth = (SubLObject)prove.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject forward_time = prove_from_forward_time(time);
        final SubLObject backward_time = prove_from_backward_time(time);
        thread.resetMultipleValues();
        final SubLObject proof_sentence = prepare_for_proof(antecedant, consequent, mt, forward_time);
        final SubLObject proof_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (prove.NIL == proof_sentence || prove.NIL == proof_mt) {
            final SubLObject v_answer = cyc_kernel.closed_query_success_token();
            final SubLObject reason = (SubLObject)prove.$kw52$TAUTOLOGY;
            return Values.values(v_answer, reason);
        }
        thread.resetMultipleValues();
        final SubLObject v_answer = fi.fi_ask_int(proof_sentence, proof_mt, backchain, number, backward_time, depth);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(v_answer, reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 28623L)
    public static SubLObject prove_from_forward_time(final SubLObject total_time_cutoff) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prove.NIL == prove.$proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
            return (SubLObject)prove.ZERO_INTEGER;
        }
        if (prove.NIL == total_time_cutoff) {
            return (SubLObject)prove.NIL;
        }
        return Numbers.integerDivide(total_time_cutoff, (SubLObject)prove.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 28927L)
    public static SubLObject prove_from_backward_time(final SubLObject total_time_cutoff) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prove.NIL == prove.$proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
            return total_time_cutoff;
        }
        if (prove.NIL == total_time_cutoff) {
            return (SubLObject)prove.NIL;
        }
        return Numbers.integerDivide(total_time_cutoff, (SubLObject)prove.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 29248L)
    public static SubLObject new_prepare_for_proof(final SubLObject antecedent, final SubLObject consequent, final SubLObject input_query_mt) {
        return prepare_for_proof(antecedent, consequent, input_query_mt, (SubLObject)prove.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 30466L)
    public static SubLObject prepare_for_proof(final SubLObject antecedent, final SubLObject consequent, SubLObject input_query_mt, final SubLObject forward_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        input_query_mt = hlmt_czer.canonicalize_hlmt(input_query_mt);
        final SubLObject assumption_mt = prepare_assumption_mt(input_query_mt);
        thread.resetMultipleValues();
        final SubLObject hypothesis_mt = prepare_hypothesis_mt(antecedent, assumption_mt, forward_time);
        final SubLObject term_bindings = thread.secondMultipleValue();
        final SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (prove.NIL != failure_reasons) {
            return Values.values((SubLObject)prove.NIL, (SubLObject)prove.NIL, (SubLObject)prove.NIL, failure_reasons);
        }
        thread.resetMultipleValues();
        final SubLObject proof_mt = prepare_proof_mt(consequent, hypothesis_mt, term_bindings);
        final SubLObject failure_reasons_$21 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (prove.NIL != failure_reasons_$21) {
            return Values.values((SubLObject)prove.NIL, (SubLObject)prove.NIL, (SubLObject)prove.NIL, failure_reasons_$21);
        }
        final SubLObject query_sentence = bindings.apply_bindings(term_bindings, consequent);
        final SubLObject query_mt = prepare_query_mt(input_query_mt, proof_mt);
        return Values.values(query_sentence, query_mt, term_bindings, (SubLObject)prove.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 31275L)
    public static SubLObject prepare_assumption_mt(final SubLObject input_query_mt) {
        if (prove.NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(input_query_mt)) {
            return mt_vars.$theory_mt_root$.getGlobalValue();
        }
        if (prove.NIL != hlmt.anytime_psc_hlmtP(input_query_mt)) {
            return hlmt.replace_time_dimension(input_query_mt, prove.$const53$Always_TimeInterval, prove.$const54$TimePoint);
        }
        return input_query_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 31835L)
    public static SubLObject prepare_query_mt(final SubLObject input_query_mt, final SubLObject proof_mt) {
        if (prove.NIL == proof_mt) {
            return proof_mt;
        }
        if (prove.NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(input_query_mt)) {
            return input_query_mt;
        }
        if (prove.NIL != hlmt.anytime_psc_hlmtP(input_query_mt)) {
            return hlmt.replace_time_dimension(proof_mt, prove.$const55$AnytimePSC, (SubLObject)prove.UNPROVIDED);
        }
        return proof_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 32308L)
    public static SubLObject prepare_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time) {
        if (forward_time == prove.UNPROVIDED) {
            forward_time = (SubLObject)prove.ZERO_INTEGER;
        }
        if (hypothesis_sentence.eql(prove.$const13$True)) {
            return Values.values(mt, (SubLObject)prove.NIL, (SubLObject)prove.NIL);
        }
        return find_or_create_hypothesis_mt(hypothesis_sentence, mt, forward_time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 33267L)
    public static SubLObject find_or_create_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time) {
        if (forward_time == prove.UNPROVIDED) {
            forward_time = (SubLObject)prove.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject hypothesis_mt = find_hypothesis_mt(hypothesis_sentence, mt);
        SubLObject term_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (prove.NIL != hypothesis_mt) {
            return Values.values(hypothesis_mt, term_bindings, (SubLObject)prove.NIL);
        }
        thread.resetMultipleValues();
        hypothesis_mt = create_hypothesis_mt(hypothesis_sentence, mt, forward_time);
        term_bindings = thread.secondMultipleValue();
        final SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (prove.NIL != failure_reasons) {
            return Values.values((SubLObject)prove.NIL, (SubLObject)prove.NIL, failure_reasons);
        }
        return Values.values(hypothesis_mt, term_bindings, (SubLObject)prove.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 33872L)
    public static SubLObject find_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt) {
        final SubLObject ist_sentence = el_utilities.make_ist_sentence(mt, hypothesis_sentence);
        final SubLObject hypothesis_info = dictionary.dictionary_lookup(prove.$hypothesis_mt_table$.getGlobalValue(), ist_sentence, (SubLObject)prove.UNPROVIDED);
        if (prove.NIL == hypothesis_info) {
            return Values.values((SubLObject)prove.NIL, (SubLObject)prove.NIL);
        }
        SubLObject current;
        final SubLObject datum = current = hypothesis_info;
        SubLObject hypothesis_mt = (SubLObject)prove.NIL;
        SubLObject term_bindings = (SubLObject)prove.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)prove.$list57);
        hypothesis_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)prove.$list57);
        term_bindings = current.first();
        current = current.rest();
        if (prove.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)prove.$list57);
            return (SubLObject)prove.NIL;
        }
        if (prove.NIL == valid_hypothesis_mt_infoP(hypothesis_mt, term_bindings)) {
            dictionary.dictionary_remove(prove.$hypothesis_mt_table$.getGlobalValue(), ist_sentence);
            return Values.values((SubLObject)prove.NIL, (SubLObject)prove.NIL);
        }
        return Values.values(hypothesis_mt, term_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 34413L)
    public static SubLObject valid_hypothesis_mt_infoP(final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        if (prove.NIL == hlmt.valid_hlmtP(hypothesis_mt, (SubLObject)prove.UNPROVIDED)) {
            return (SubLObject)prove.NIL;
        }
        if (prove.NIL == isa.isaP(hlmt.hlmt_monad_mt(hypothesis_mt), prove.$const58$HypotheticalContext, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED)) {
            return (SubLObject)prove.NIL;
        }
        SubLObject cdolist_list_var = term_bindings;
        SubLObject binding = (SubLObject)prove.NIL;
        binding = cdolist_list_var.first();
        while (prove.NIL != cdolist_list_var) {
            final SubLObject hypothesized_term_constant = bindings.variable_binding_value(binding);
            if (prove.NIL == constant_handles.valid_constantP(hypothesized_term_constant, (SubLObject)prove.UNPROVIDED)) {
                return (SubLObject)prove.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return (SubLObject)prove.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 34983L)
    public static SubLObject create_hypothesis_mt(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time) {
        if (forward_time == prove.UNPROVIDED) {
            forward_time = (SubLObject)prove.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject hypothesis_mt = create_hypothesis_mt_int(hypothesis_sentence, mt, forward_time);
        final SubLObject term_bindings = thread.secondMultipleValue();
        final SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (prove.NIL != hypothesis_mt) {
            final SubLObject ist_sentence = el_utilities.make_ist_sentence(mt, hypothesis_sentence);
            final SubLObject hypothesis_info = (SubLObject)ConsesLow.list(hypothesis_mt, term_bindings);
            dictionary.dictionary_enter(prove.$hypothesis_mt_table$.getGlobalValue(), ist_sentence, hypothesis_info);
        }
        return Values.values(hypothesis_mt, term_bindings, failure_reasons);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 35509L)
    public static SubLObject create_hypothesis_mt_int(final SubLObject hypothesis_sentence, final SubLObject mt, SubLObject forward_time) {
        if (forward_time == prove.UNPROVIDED) {
            forward_time = (SubLObject)prove.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothesis_mt = (SubLObject)prove.NIL;
        SubLObject term_bindings = (SubLObject)prove.NIL;
        SubLObject failedP = (SubLObject)prove.NIL;
        SubLObject failure_reasons = (SubLObject)prove.NIL;
        hypothesis_mt = hypothesize_spec_mt(mt, (SubLObject)prove.$str59$Hypothesis);
        if (prove.NIL != hypothesis_mt) {
            final SubLObject hypothesis_monad_mt = hlmt.hlmt_monad_mt(hypothesis_mt);
            try {
                thread.resetMultipleValues();
                final SubLObject term_bindings_$22 = fi_hypothesize_int(hypothesis_sentence, hypothesis_mt, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
                final SubLObject failure_reasons_$23 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                term_bindings = term_bindings_$22;
                failure_reasons = failure_reasons_$23;
                if (prove.NIL != term_bindings) {
                    if (prove.NIL != bindings.unification_success_token_p(term_bindings)) {
                        term_bindings = (SubLObject)prove.NIL;
                    }
                    note_hypothesis_mt_term_bindings(hypothesis_mt, term_bindings);
                }
                else {
                    failedP = (SubLObject)prove.T;
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)prove.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (prove.NIL != failedP) {
                        fi.fi_kill_int(hypothesis_monad_mt);
                        hypothesis_mt = (SubLObject)prove.NIL;
                        term_bindings = (SubLObject)prove.NIL;
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            failedP = (SubLObject)prove.T;
        }
        if (prove.NIL == failedP) {
            if (prove.NIL != prove.$proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
                forward_propagate_proof_hypothesis_mt(hypothesis_mt, forward_time);
            }
            return Values.values(hypothesis_mt, term_bindings, (SubLObject)prove.NIL);
        }
        return Values.values((SubLObject)prove.NIL, (SubLObject)prove.NIL, failure_reasons);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 36682L)
    public static SubLObject note_hypothesis_mt_term_bindings(final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        assert prove.NIL != hlmt.hlmt_p(hypothesis_mt) : hypothesis_mt;
        return (SubLObject)prove.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 37139L)
    public static SubLObject kill_cached_hypothesis_mt(final SubLObject hypothesis_mt) {
        return (SubLObject)prove.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 37505L)
    public static SubLObject prepare_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prove.NIL == prove.$proof_assume_consequent_type_constraintsP$.getDynamicValue(thread)) {
            return Values.values(hypothesis_mt, (SubLObject)prove.NIL);
        }
        SubLObject consequent_mentions_antecedent_variableP;
        SubLObject rest;
        SubLObject term_binding;
        SubLObject current;
        SubLObject datum;
        SubLObject variable;
        SubLObject value;
        for (consequent_mentions_antecedent_variableP = (SubLObject)prove.NIL, rest = (SubLObject)prove.NIL, rest = term_bindings; prove.NIL == consequent_mentions_antecedent_variableP && prove.NIL != rest; consequent_mentions_antecedent_variableP = cycl_utilities.expression_find(variable, consequent_sentence, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED), rest = rest.rest()) {
            term_binding = rest.first();
            datum = (current = term_binding);
            variable = (SubLObject)prove.NIL;
            value = (SubLObject)prove.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)prove.$list62);
            variable = current.first();
            current = (value = current.rest());
        }
        if (prove.NIL == consequent_mentions_antecedent_variableP) {
            return Values.values(hypothesis_mt, (SubLObject)prove.NIL);
        }
        return find_or_create_proof_mt(consequent_sentence, hypothesis_mt, term_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 38373L)
    public static SubLObject find_or_create_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        final SubLObject proof_mt = find_proof_mt(consequent_sentence, hypothesis_mt);
        if (prove.NIL != proof_mt) {
            return Values.values(proof_mt, (SubLObject)prove.NIL);
        }
        return create_proof_mt(consequent_sentence, hypothesis_mt, term_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 38725L)
    public static SubLObject find_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt) {
        final SubLObject ist_sentence = el_utilities.make_ist_sentence(hypothesis_mt, consequent_sentence);
        SubLObject proof_mt = dictionary.dictionary_lookup(prove.$proof_mt_table$.getGlobalValue(), ist_sentence, (SubLObject)prove.UNPROVIDED);
        if (prove.NIL != proof_mt && prove.NIL == hlmt.valid_hlmt_p(proof_mt, (SubLObject)prove.UNPROVIDED)) {
            dictionary.dictionary_remove(prove.$proof_mt_table$.getGlobalValue(), ist_sentence);
            proof_mt = (SubLObject)prove.NIL;
        }
        return proof_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 39089L)
    public static SubLObject create_proof_mt(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject proof_mt = create_proof_mt_int(consequent_sentence, hypothesis_mt, term_bindings);
        final SubLObject failure_reasons = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (prove.NIL != proof_mt) {
            final SubLObject ist_sentence = el_utilities.make_ist_sentence(hypothesis_mt, consequent_sentence);
            dictionary.dictionary_enter(prove.$proof_mt_table$.getGlobalValue(), ist_sentence, proof_mt);
        }
        return Values.values(proof_mt, failure_reasons);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 39509L)
    public static SubLObject create_proof_mt_int(final SubLObject consequent_sentence, final SubLObject hypothesis_mt, final SubLObject term_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_mt = hypothesize_spec_mt(hypothesis_mt, (SubLObject)prove.$str64$Proof);
        final SubLObject failure_reasons = (SubLObject)prove.NIL;
        if (prove.NIL == proof_mt) {
            return Values.values((SubLObject)prove.NIL, (SubLObject)prove.NIL);
        }
        final SubLObject proof_monad_mt = hlmt.hlmt_monad_mt(proof_mt);
        SubLObject something_assertedP = (SubLObject)prove.NIL;
        final SubLObject free_vars = el_utilities.sentence_free_variables(consequent_sentence, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
        final SubLObject _prev_bind_0 = at_vars.$at_include_isa_literal_constraints$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_include_genl_literal_constraints$.currentBinding(thread);
        try {
            at_vars.$at_include_isa_literal_constraints$.bind((SubLObject)prove.NIL, thread);
            at_vars.$at_include_genl_literal_constraints$.bind((SubLObject)prove.NIL, thread);
            something_assertedP = hypothesize_terms_for_consequent(consequent_sentence, proof_mt, term_bindings, free_vars);
        }
        finally {
            at_vars.$at_include_genl_literal_constraints$.rebind(_prev_bind_2, thread);
            at_vars.$at_include_isa_literal_constraints$.rebind(_prev_bind_0, thread);
        }
        if (prove.NIL == something_assertedP) {
            fi.fi_kill_int(proof_monad_mt);
            proof_mt = hypothesis_mt;
        }
        return Values.values(proof_mt, failure_reasons);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 41102L)
    public static SubLObject forward_propagate_proof_hypothesis_mt(final SubLObject hypothesis_mt, SubLObject forward_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!forward_time.isInteger() || !forward_time.numLE((SubLObject)prove.ZERO_INTEGER)) {
            if (prove.NIL == forward_time) {
                forward_time = prove.$proof_hypothesis_forward_absolute_time_cutoff$.getDynamicValue(thread);
            }
            final SubLObject _prev_bind_0 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
            final SubLObject _prev_bind_2 = control_vars.$forward_inference_removal_cost_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_3 = kb_control_vars.$forward_inference_time_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_4 = control_vars.$filter_deductions_for_trivially_derivable_gafs$.currentBinding(thread);
            final SubLObject _prev_bind_5 = kb_control_vars.$forward_propagate_from_negations$.currentBinding(thread);
            final SubLObject _prev_bind_6 = kb_control_vars.$forward_propagate_to_negations$.currentBinding(thread);
            try {
                control_vars.$unbound_rule_backchain_enabled$.bind((SubLObject)prove.T, thread);
                control_vars.$forward_inference_removal_cost_cutoff$.bind(prove.$proof_hypothesis_forward_removal_cost_cutoff$.getDynamicValue(thread), thread);
                kb_control_vars.$forward_inference_time_cutoff$.bind(prove.$proof_hypothesis_forward_time_cutoff$.getDynamicValue(thread), thread);
                control_vars.$filter_deductions_for_trivially_derivable_gafs$.bind((SubLObject)prove.T, thread);
                kb_control_vars.$forward_propagate_from_negations$.bind((SubLObject)prove.NIL, thread);
                kb_control_vars.$forward_propagate_to_negations$.bind((SubLObject)prove.NIL, thread);
                forward_propagate_assertions.forward_propagate_mt(hypothesis_mt, hypothesis_mt, (SubLObject)prove.NIL, forward_time, prove.$proof_hypothesis_forward_propagation_depth$.getDynamicValue(thread));
            }
            finally {
                kb_control_vars.$forward_propagate_to_negations$.rebind(_prev_bind_6, thread);
                kb_control_vars.$forward_propagate_from_negations$.rebind(_prev_bind_5, thread);
                control_vars.$filter_deductions_for_trivially_derivable_gafs$.rebind(_prev_bind_4, thread);
                kb_control_vars.$forward_inference_time_cutoff$.rebind(_prev_bind_3, thread);
                control_vars.$forward_inference_removal_cost_cutoff$.rebind(_prev_bind_2, thread);
                control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)prove.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 42328L)
    public static SubLObject hypothesize_spec_mt(final SubLObject mt, SubLObject name_prefix) {
        if (name_prefix == prove.UNPROVIDED) {
            name_prefix = (SubLObject)prove.$str1$HYP;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert prove.NIL != hlmt.hlmt_p(mt) : mt;
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
        final SubLObject sentence = conses_high.subst(monad_mt, (SubLObject)prove.$kw67$MT, prove.$hypothesize_spec_mt_sentence$.getDynamicValue(thread), (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
        SubLObject hyp_mt = (SubLObject)prove.NIL;
        SubLObject hyp_hlmt = (SubLObject)prove.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)prove.NIL, thread);
            final SubLObject v_bindings = fi_hypothesize_int(sentence, mt_vars.$mt_mt$.getGlobalValue(), name_prefix, (SubLObject)prove.UNPROVIDED);
            if (prove.NIL != v_bindings) {
                hyp_mt = bindings.apply_bindings(v_bindings, (SubLObject)prove.$sym68$_SPEC_MT);
                if (prove.NIL != hyp_mt) {
                    hyp_hlmt = hlmt.replace_monad_dimension(mt, hyp_mt);
                    cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(prove.$const69$highlyRelevantMt, hyp_hlmt), hyp_hlmt, (SubLObject)prove.UNPROVIDED);
                }
            }
        }
        finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return hyp_hlmt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 43040L)
    public static SubLObject hypothetical_constant(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(prove.NIL != constant_handles.constant_p(v_object) && prove.NIL != string_utilities.starts_with(constants_high.constant_name(v_object), (SubLObject)prove.$str70$HYP_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 43254L)
    public static SubLObject construct_non_wff_conflict_supports(final SubLObject sentence, final SubLObject mt, SubLObject generic_var_map) {
        if (generic_var_map == prove.UNPROVIDED) {
            generic_var_map = (SubLObject)prove.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prove.NIL != prove.$use_new_non_wff_conflict_supports_explain_methodP$.getDynamicValue(thread)) {
            final SubLObject hyp_terms = cycl_utilities.expression_gather(sentence, (SubLObject)prove.$sym71$HYPOTHETICAL_CONSTANT, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
            SubLObject hyp_assertions = (SubLObject)prove.NIL;
            SubLObject cdolist_list_var = hyp_terms;
            SubLObject hyp_term = (SubLObject)prove.NIL;
            hyp_term = cdolist_list_var.first();
            while (prove.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$24 = list_utilities.remove_if_not((SubLObject)prove.$sym72$ASSERTED_ASSERTION_, virtual_indexing.assertions_mentioning_terms((SubLObject)ConsesLow.list(hyp_term), (SubLObject)prove.UNPROVIDED), (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
                SubLObject hyp_ass = (SubLObject)prove.NIL;
                hyp_ass = cdolist_list_var_$24.first();
                while (prove.NIL != cdolist_list_var_$24) {
                    final SubLObject item_var = hyp_ass;
                    if (prove.NIL == conses_high.member(item_var, hyp_assertions, Symbols.symbol_function((SubLObject)prove.EQL), Symbols.symbol_function((SubLObject)prove.IDENTITY))) {
                        hyp_assertions = (SubLObject)ConsesLow.cons(item_var, hyp_assertions);
                    }
                    cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                    hyp_ass = cdolist_list_var_$24.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                hyp_term = cdolist_list_var.first();
            }
            SubLObject result = (SubLObject)prove.NIL;
            SubLObject cdolist_list_var2 = hyp_assertions;
            SubLObject hyp_ass2 = (SubLObject)prove.NIL;
            hyp_ass2 = cdolist_list_var2.first();
            while (prove.NIL != cdolist_list_var2) {
                final SubLObject el_formula = bindings.apply_bindings_backwards(generic_var_map, uncanonicalizer.assertion_el_formula(hyp_ass2));
                if (prove.NIL == cycl_utilities.expression_find_if((SubLObject)prove.$sym73$HYPOTHETICAL_TERM_P, el_formula, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED) && prove.NIL == cycl_utilities.expression_find(prove.$const32$hypotheticalTerm, el_formula, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(el_formula, result);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                hyp_ass2 = cdolist_list_var2.first();
            }
            result = el_utilities.make_conjunction(result);
            result = el_utilities.make_implication(result, bindings.apply_bindings_backwards(generic_var_map, el_utilities.make_negation(sentence)));
            result = arguments.make_hl_support((SubLObject)prove.$kw74$QUERY, result, Sort.sort(genl_mts.asserted_genl_mts(mt, (SubLObject)prove.UNPROVIDED), (SubLObject)prove.$sym75$GENERALITY_ESTIMATE_, (SubLObject)prove.UNPROVIDED).first(), (SubLObject)prove.UNPROVIDED);
            return (SubLObject)ConsesLow.list(result);
        }
        SubLObject supports = flatten_explain_hl_why_not_wff(wff.hl_explain_why_not_wff(sentence, mt, (SubLObject)prove.UNPROVIDED));
        if (!supports.isList()) {
            supports = (SubLObject)prove.NIL;
        }
        if (supports.isCons() && supports.first().eql(prove.$const10$and)) {
            supports = supports.rest();
        }
        if (prove.NIL != supports) {
            supports = Sequences.delete((SubLObject)prove.NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)prove.$sym76$CONVERT_TO_HL_SUPPORT), supports), (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED, (SubLObject)prove.UNPROVIDED);
        }
        if (prove.NIL == supports) {
            supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)prove.$kw77$OPAQUE, sentence, mt, (SubLObject)prove.UNPROVIDED));
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 44939L)
    public static SubLObject flatten_explain_hl_why_not_wff(final SubLObject supports) {
        final SubLObject v_answer = flatten_explain_hl_why_not_wff_recursive(supports, (SubLObject)prove.NIL);
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 45119L)
    public static SubLObject flatten_explain_hl_why_not_wff_recursive(final SubLObject sentence, SubLObject accumulator) {
        if (prove.NIL != assertion_handles.assertion_p(sentence)) {
            final SubLObject el_formula = uncanonicalizer.assertion_el_formula(sentence);
            if (prove.NIL != list_utilities.tree_find_if((SubLObject)prove.$sym78$EPHEMERAL_TERM_, el_formula, (SubLObject)prove.UNPROVIDED)) {
                accumulator = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(prove.$const79$ist, assertions_high.assertion_mt(sentence), el_formula), accumulator);
            }
            else {
                accumulator = (SubLObject)ConsesLow.cons(sentence, accumulator);
            }
        }
        else if (prove.NIL != cycl_grammar.cycl_sentence_p(sentence)) {
            if (prove.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)prove.UNPROVIDED)) {
                accumulator = (SubLObject)ConsesLow.cons(sentence, accumulator);
            }
            else {
                SubLObject cdolist_list_var;
                final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(sentence, (SubLObject)prove.$kw80$IGNORE);
                SubLObject v_term = (SubLObject)prove.NIL;
                v_term = cdolist_list_var.first();
                while (prove.NIL != cdolist_list_var) {
                    accumulator = flatten_explain_hl_why_not_wff_recursive(v_term, accumulator);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 45704L)
    public static SubLObject convert_to_hl_support(final SubLObject v_object) {
        if (prove.NIL != assertion_handles.assertion_p(v_object)) {
            return v_object;
        }
        if (prove.NIL != arguments.support_p(v_object)) {
            return v_object;
        }
        if (prove.NIL == el_utilities.el_formula_p(v_object)) {
            return (SubLObject)prove.NIL;
        }
        if (prove.NIL == el_utilities.ist_sentence_p(v_object, (SubLObject)prove.UNPROVIDED)) {
            return (SubLObject)prove.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(v_object, (SubLObject)prove.UNPROVIDED);
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : prove.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)prove.$list81);
        current = current.rest();
        final SubLObject sentence = (SubLObject)(current.isCons() ? current.first() : prove.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)prove.$list81);
        current = current.rest();
        if (prove.NIL == current) {
            return convert_ist_formula_to_hl_support(sentence, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)prove.$list81);
        return (SubLObject)prove.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 46089L)
    public static SubLObject convert_ist_formula_to_hl_support(final SubLObject sentence, final SubLObject mt) {
        final SubLObject pcase_var = el_utilities.literal_predicate(sentence, (SubLObject)prove.UNPROVIDED);
        if (pcase_var.eql(prove.$const24$isa)) {
            return arguments.make_hl_support((SubLObject)prove.$kw82$ISA, sentence, mt, (SubLObject)prove.UNPROVIDED);
        }
        if (pcase_var.eql(prove.$const27$genls)) {
            return arguments.make_hl_support((SubLObject)prove.$kw83$GENLS, sentence, mt, (SubLObject)prove.UNPROVIDED);
        }
        if (pcase_var.eql(prove.$const84$genlPreds) || pcase_var.eql(prove.$const85$genlInverse)) {
            return arguments.make_hl_support((SubLObject)prove.$kw86$GENLPREDS, sentence, mt, (SubLObject)prove.UNPROVIDED);
        }
        if (pcase_var.eql(prove.$const87$evaluate)) {
            return arguments.make_hl_support((SubLObject)prove.$kw88$EVAL, sentence, mt, (SubLObject)prove.UNPROVIDED);
        }
        return arguments.make_hl_support((SubLObject)prove.$kw77$OPAQUE, sentence, mt, (SubLObject)prove.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/prove.lisp", position = 46530L)
    public static SubLObject note_non_wff_conflict(final SubLObject sentence, final SubLObject mt, SubLObject generic_var_map) {
        if (generic_var_map == prove.UNPROVIDED) {
            generic_var_map = (SubLObject)prove.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prove.NIL != control_vars.$record_inconsistent_support_sets$.getDynamicValue(thread)) {
            final SubLObject supports = construct_non_wff_conflict_supports(sentence, mt, generic_var_map);
            conflicts.add_inconsistent_support_set(supports);
            prove.$conflicting_support_sets$.setDynamicValue((SubLObject)ConsesLow.cons(supports, prove.$conflicting_support_sets$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)prove.NIL;
    }
    
    public static SubLObject declare_prove_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "prove_justified", "PROVE-JUSTIFIED", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "fi_hypothesize", "FI-HYPOTHESIZE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "fi_hypothesize_int", "FI-HYPOTHESIZE-INT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_terms", "HYPOTHESIZE-TERMS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_terms_for_antecedent", "HYPOTHESIZE-TERMS-FOR-ANTECEDENT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_terms_for_consequent", "HYPOTHESIZE-TERMS-FOR-CONSEQUENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_terms_int", "HYPOTHESIZE-TERMS-INT", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_terms_int_2", "HYPOTHESIZE-TERMS-INT-2", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_terms_for_variables", "HYPOTHESIZE-TERMS-FOR-VARIABLES", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "assert_within_hypothetical", "ASSERT-WITHIN-HYPOTHETICAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "assert_hypothetical_term_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-ISA-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "assert_hypothetical_term_quoted_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-QUOTED-ISA-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "assert_hypothetical_term_genl_constraints", "ASSERT-HYPOTHETICAL-TERM-GENL-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "assert_hypothetical_term_content_gafs", "ASSERT-HYPOTHETICAL-TERM-CONTENT-GAFS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "assert_hypothetical_term_rules", "ASSERT-HYPOTHETICAL-TERM-RULES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "create_hypothesized_constant", "CREATE-HYPOTHESIZED-CONSTANT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "assert_that_term_is_hypothetical", "ASSERT-THAT-TERM-IS-HYPOTHETICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_dnf_equality_constraints", "HYPOTHESIZE-DNF-EQUALITY-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_dnf_isa_constraints", "HYPOTHESIZE-DNF-ISA-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_dnf_quoted_isa_constraints", "HYPOTHESIZE-DNF-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_dnf_genl_constraints", "HYPOTHESIZE-DNF-GENL-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "antecedent_dnf_variables_isa_constraints", "ANTECEDENT-DNF-VARIABLES-ISA-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "antecedent_dnf_variables_quoted_isa_constraints", "ANTECEDENT-DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "antecedent_dnf_variables_genl_constraints", "ANTECEDENT-DNF-VARIABLES-GENL-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "suggest_string_from_fort_el_formula", "SUGGEST-STRING-FROM-FORT-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "fi_prove", "FI-PROVE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "fi_prove_int", "FI-PROVE-INT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "fi_prove_int_new_cyc_query_trampoline", "FI-PROVE-INT-NEW-CYC-QUERY-TRAMPOLINE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "prove_from", "PROVE-FROM", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "prove_from_forward_time", "PROVE-FROM-FORWARD-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "prove_from_backward_time", "PROVE-FROM-BACKWARD-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "new_prepare_for_proof", "NEW-PREPARE-FOR-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "prepare_for_proof", "PREPARE-FOR-PROOF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "prepare_assumption_mt", "PREPARE-ASSUMPTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "prepare_query_mt", "PREPARE-QUERY-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "prepare_hypothesis_mt", "PREPARE-HYPOTHESIS-MT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "find_or_create_hypothesis_mt", "FIND-OR-CREATE-HYPOTHESIS-MT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "find_hypothesis_mt", "FIND-HYPOTHESIS-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "valid_hypothesis_mt_infoP", "VALID-HYPOTHESIS-MT-INFO?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "create_hypothesis_mt", "CREATE-HYPOTHESIS-MT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "create_hypothesis_mt_int", "CREATE-HYPOTHESIS-MT-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "note_hypothesis_mt_term_bindings", "NOTE-HYPOTHESIS-MT-TERM-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "kill_cached_hypothesis_mt", "KILL-CACHED-HYPOTHESIS-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "prepare_proof_mt", "PREPARE-PROOF-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "find_or_create_proof_mt", "FIND-OR-CREATE-PROOF-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "find_proof_mt", "FIND-PROOF-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "create_proof_mt", "CREATE-PROOF-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "create_proof_mt_int", "CREATE-PROOF-MT-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "forward_propagate_proof_hypothesis_mt", "FORWARD-PROPAGATE-PROOF-HYPOTHESIS-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothesize_spec_mt", "HYPOTHESIZE-SPEC-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "hypothetical_constant", "HYPOTHETICAL-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "construct_non_wff_conflict_supports", "CONSTRUCT-NON-WFF-CONFLICT-SUPPORTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "flatten_explain_hl_why_not_wff", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "flatten_explain_hl_why_not_wff_recursive", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "convert_to_hl_support", "CONVERT-TO-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "convert_ist_formula_to_hl_support", "CONVERT-IST-FORMULA-TO-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.prove", "note_non_wff_conflict", "NOTE-NON-WFF-CONFLICT", 2, 1, false);
        return (SubLObject)prove.NIL;
    }
    
    public static SubLObject init_prove_file() {
        prove.$conflicting_support_sets$ = SubLFiles.defparameter("*CONFLICTING-SUPPORT-SETS*", (SubLObject)prove.NIL);
        prove.$something_asserted_within_hypothesize_termsP$ = SubLFiles.defparameter("*SOMETHING-ASSERTED-WITHIN-HYPOTHESIZE-TERMS?*", (SubLObject)prove.NIL);
        prove.$fi_prove_new_cyc_query_trampoline_enabledP$ = SubLFiles.defparameter("*FI-PROVE-NEW-CYC-QUERY-TRAMPOLINE-ENABLED?*", (SubLObject)prove.NIL);
        prove.$proof_hypothesis_forward_propagation_enabled$ = SubLFiles.defparameter("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-ENABLED*", (SubLObject)prove.NIL);
        prove.$hypothesis_mt_table$ = SubLFiles.deflexical("*HYPOTHESIS-MT-TABLE*", (prove.NIL != Symbols.boundp((SubLObject)prove.$sym56$_HYPOTHESIS_MT_TABLE_)) ? prove.$hypothesis_mt_table$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)prove.EQUAL), (SubLObject)prove.ZERO_INTEGER));
        prove.$proof_assume_consequent_type_constraintsP$ = SubLFiles.defvar("*PROOF-ASSUME-CONSEQUENT-TYPE-CONSTRAINTS?*", (SubLObject)prove.T);
        prove.$proof_mt_table$ = SubLFiles.deflexical("*PROOF-MT-TABLE*", (prove.NIL != Symbols.boundp((SubLObject)prove.$sym63$_PROOF_MT_TABLE_)) ? prove.$proof_mt_table$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)prove.EQUAL), (SubLObject)prove.ZERO_INTEGER));
        prove.$proof_hypothesis_forward_absolute_time_cutoff$ = SubLFiles.defvar("*PROOF-HYPOTHESIS-FORWARD-ABSOLUTE-TIME-CUTOFF*", (SubLObject)prove.$int65$120);
        prove.$proof_hypothesis_forward_time_cutoff$ = SubLFiles.defvar("*PROOF-HYPOTHESIS-FORWARD-TIME-CUTOFF*", (SubLObject)prove.FIVE_INTEGER);
        prove.$proof_hypothesis_forward_removal_cost_cutoff$ = SubLFiles.defvar("*PROOF-HYPOTHESIS-FORWARD-REMOVAL-COST-CUTOFF*", (SubLObject)prove.TWENTY_INTEGER);
        prove.$proof_hypothesis_forward_propagation_depth$ = SubLFiles.defvar("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-DEPTH*", (SubLObject)prove.ONE_INTEGER);
        prove.$hypothesize_spec_mt_sentence$ = SubLFiles.defparameter("*HYPOTHESIZE-SPEC-MT-SENTENCE*", (SubLObject)prove.$list66);
        prove.$use_new_non_wff_conflict_supports_explain_methodP$ = SubLFiles.defparameter("*USE-NEW-NON-WFF-CONFLICT-SUPPORTS-EXPLAIN-METHOD?*", (SubLObject)prove.T);
        return (SubLObject)prove.NIL;
    }
    
    public static SubLObject setup_prove_file() {
        utilities_macros.register_cyc_api_function((SubLObject)prove.$sym3$FI_HYPOTHESIZE, (SubLObject)prove.$list4, (SubLObject)prove.$str5$Cyc_attempts_to_check_if_SENTENCE, (SubLObject)prove.NIL, (SubLObject)prove.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)prove.$sym44$FI_PROVE, (SubLObject)prove.$list45, (SubLObject)prove.$str46$Attempts_to_prove_SENTENCE_is_tru, (SubLObject)prove.NIL, (SubLObject)prove.$list47);
        subl_macro_promotions.declare_defglobal((SubLObject)prove.$sym56$_HYPOTHESIS_MT_TABLE_);
        access_macros.define_obsolete_register((SubLObject)prove.$sym61$KILL_CACHED_HYPOTHESIS_MT, (SubLObject)prove.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)prove.$sym63$_PROOF_MT_TABLE_);
        generic_testing.define_test_case_table_int((SubLObject)prove.$sym89$FI_PROVE_INT, (SubLObject)ConsesLow.list(new SubLObject[] { prove.$kw90$TEST, prove.NIL, prove.$kw91$OWNER, prove.NIL, prove.$kw92$CLASSES, prove.NIL, prove.$kw93$KB, prove.$kw94$TINY, prove.$kw95$WORKING_, prove.T }), (SubLObject)prove.$list96);
        return (SubLObject)prove.NIL;
    }
    
    public void declareFunctions() {
        declare_prove_file();
    }
    
    public void initializeVariables() {
        init_prove_file();
    }
    
    public void runTopLevelForms() {
        setup_prove_file();
    }
    
    static {
        me = (SubLFile)new prove();
        prove.$conflicting_support_sets$ = null;
        prove.$something_asserted_within_hypothesize_termsP$ = null;
        prove.$fi_prove_new_cyc_query_trampoline_enabledP$ = null;
        prove.$proof_hypothesis_forward_propagation_enabled$ = null;
        prove.$hypothesis_mt_table$ = null;
        prove.$proof_assume_consequent_type_constraintsP$ = null;
        prove.$proof_mt_table$ = null;
        prove.$proof_hypothesis_forward_absolute_time_cutoff$ = null;
        prove.$proof_hypothesis_forward_time_cutoff$ = null;
        prove.$proof_hypothesis_forward_removal_cost_cutoff$ = null;
        prove.$proof_hypothesis_forward_propagation_depth$ = null;
        prove.$hypothesize_spec_mt_sentence$ = null;
        prove.$use_new_non_wff_conflict_supports_explain_methodP$ = null;
        $sym0$INFERENCE_RETURN_BLISTS_AND_SUPPORTS = SubLObjectFactory.makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS");
        $str1$HYP = SubLObjectFactory.makeString("HYP");
        $kw2$HYPOTHESIZE = SubLObjectFactory.makeKeyword("HYPOTHESIZE");
        $sym3$FI_HYPOTHESIZE = SubLObjectFactory.makeSymbol("FI-HYPOTHESIZE");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-PREFIX"), (SubLObject)SubLObjectFactory.makeString("HYP")), (SubLObject)SubLObjectFactory.makeSymbol("TERM-IDS"));
        $str5$Cyc_attempts_to_check_if_SENTENCE = SubLObjectFactory.makeString("Cyc attempts to check if SENTENCE is satisfiable in MT by 'hypothesizing'\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\nand asserting the new sentence in MT.  If this would trigger a \ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\nconstant pairs is returned, indicating the constants which were \nsuccessfully 'hypothesized'.  The form ((T . T)) is returned if no new terms\nrequired creation for the assertion of SENTENCE.\nNAME-PREFIX is a string which is used as a prefix for the name of each new\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\nthat the specified id should be used when generating the constant for the variable\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\nconstants.");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $kw7$ARG_ERROR = SubLObjectFactory.makeKeyword("ARG-ERROR");
        $str8$Expected_a_cons__got__S = SubLObjectFactory.makeString("Expected a cons, got ~S");
        $str9$Expected_a_string__got__S = SubLObjectFactory.makeString("Expected a string, got ~S");
        $const10$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $str11$ = SubLObjectFactory.makeString("");
        $const12$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $const13$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $kw14$CONFLICT = SubLObjectFactory.makeKeyword("CONFLICT");
        $sym15$CONFLICT_HANDLER = SubLObjectFactory.makeSymbol("CONFLICT-HANDLER");
        $list16 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TERM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-CONSTRAINTS"));
        $sym17$QUOTED_COLLECTION_ = SubLObjectFactory.makeSymbol("QUOTED-COLLECTION?");
        $const18$CycLConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLConstant"));
        $list19 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE2"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-CONSTRAINTS"));
        $str20$Constraint_variable_mismatch_erro = SubLObjectFactory.makeString("Constraint variable mismatch error in hypothesis: ~a != ~a");
        $list21 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE3"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTED-ISA-CONSTRAINTS"));
        $sym22$ANECT_ = SubLObjectFactory.makeSymbol("ANECT?");
        $const23$equalSymbols = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols"));
        $const24$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const25$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const26$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const27$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym28$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str29$_A__A__A = SubLObjectFactory.makeString("~A-~A-~A");
        $const30$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"));
        $const32$hypotheticalTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hypotheticalTerm"));
        $list33 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-CONSTRAINTS"));
        $const34$CycLReifiableDenotationalTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLReifiableDenotationalTerm"));
        $sym35$_ = SubLObjectFactory.makeSymbol("<");
        $sym36$SPEC_CARDINALITY = SubLObjectFactory.makeSymbol("SPEC-CARDINALITY");
        $str37$Term = SubLObjectFactory.makeString("Term");
        $list38 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTED-ISA-CONSTRAINTS"));
        $list39 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-CONSTRAINTS"));
        $sym40$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym41$CONSTANT_NAME = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $sym42$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $kw43$PROVE = SubLObjectFactory.makeKeyword("PROVE");
        $sym44$FI_PROVE = SubLObjectFactory.makeSymbol("FI-PROVE");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $str46$Attempts_to_prove_SENTENCE_is_tru = SubLObjectFactory.makeString("Attempts to prove SENTENCE is true in MT under the given resource constraints.\n   BACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\n   SENTENCE is interpreted as follows:\n   If SENTENCE is of the form (#$implies [antecedant] [consequent]) then\n   (1) free variables in [antecedant] are assumed to be universally quantified\n   (2) remaining variables in [consequent] are assumed to be existentially quantified.\n   Otherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\n   It returns NIL or a list of arguments as described for FI-JUSTIFY.");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"))));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IST"), (SubLObject)SubLObjectFactory.makeSymbol("IST-MT"), (SubLObject)SubLObjectFactory.makeSymbol("IST-SENTENCE"));
        $str49$Expected_an_integer__got__S = SubLObjectFactory.makeString("Expected an integer, got ~S");
        $const50$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $kw51$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $kw52$TAUTOLOGY = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $const53$Always_TimeInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval"));
        $const54$TimePoint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint"));
        $const55$AnytimePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $sym56$_HYPOTHESIS_MT_TABLE_ = SubLObjectFactory.makeSymbol("*HYPOTHESIS-MT-TABLE*");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HYPOTHESIS-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-BINDINGS"));
        $const58$HypotheticalContext = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypotheticalContext"));
        $str59$Hypothesis = SubLObjectFactory.makeString("Hypothesis");
        $sym60$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym61$KILL_CACHED_HYPOTHESIS_MT = SubLObjectFactory.makeSymbol("KILL-CACHED-HYPOTHESIS-MT");
        $list62 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym63$_PROOF_MT_TABLE_ = SubLObjectFactory.makeSymbol("*PROOF-MT-TABLE*");
        $str64$Proof = SubLObjectFactory.makeString("Proof");
        $int65$120 = SubLObjectFactory.makeInteger(120);
        $list66 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypotheticalContext"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-MT"), (SubLObject)SubLObjectFactory.makeKeyword("MT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termDependsOn")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-MT"), (SubLObject)SubLObjectFactory.makeKeyword("MT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ephemeralTerm")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-MT")));
        $kw67$MT = SubLObjectFactory.makeKeyword("MT");
        $sym68$_SPEC_MT = SubLObjectFactory.makeSymbol("?SPEC-MT");
        $const69$highlyRelevantMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("highlyRelevantMt"));
        $str70$HYP_ = SubLObjectFactory.makeString("HYP-");
        $sym71$HYPOTHETICAL_CONSTANT = SubLObjectFactory.makeSymbol("HYPOTHETICAL-CONSTANT");
        $sym72$ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $sym73$HYPOTHETICAL_TERM_P = SubLObjectFactory.makeSymbol("HYPOTHETICAL-TERM-P");
        $kw74$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $sym75$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
        $sym76$CONVERT_TO_HL_SUPPORT = SubLObjectFactory.makeSymbol("CONVERT-TO-HL-SUPPORT");
        $kw77$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $sym78$EPHEMERAL_TERM_ = SubLObjectFactory.makeSymbol("EPHEMERAL-TERM?");
        $const79$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $kw80$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"));
        $kw82$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw83$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $const84$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const85$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $kw86$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $const87$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $kw88$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $sym89$FI_PROVE_INT = SubLObjectFactory.makeSymbol("FI-PROVE-INT");
        $kw90$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw91$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw92$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw93$KB = SubLObjectFactory.makeKeyword("KB");
        $kw94$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw95$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list96 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)ConsesLow.list((SubLObject)prove.NIL), (SubLObject)SubLObjectFactory.makeKeyword("EXHAUST-TOTAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)ConsesLow.list((SubLObject)prove.NIL), (SubLObject)SubLObjectFactory.makeKeyword("EXHAUST-TOTAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)ConsesLow.list((SubLObject)prove.NIL), (SubLObject)SubLObjectFactory.makeKeyword("TAUTOLOGY")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)ConsesLow.list((SubLObject)prove.NIL), (SubLObject)SubLObjectFactory.makeKeyword("TAUTOLOGY")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)prove.NIL, (SubLObject)SubLObjectFactory.makeKeyword("CONTRADICTION")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)ConsesLow.list((SubLObject)prove.NIL), (SubLObject)SubLObjectFactory.makeKeyword("EXHAUST-TOTAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)ConsesLow.list((SubLObject)prove.NIL), (SubLObject)SubLObjectFactory.makeKeyword("TAUTOLOGY")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)ConsesLow.list((SubLObject)prove.NIL), (SubLObject)SubLObjectFactory.makeKeyword("TAUTOLOGY")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)prove.NIL, (SubLObject)SubLObjectFactory.makeKeyword("CONTRADICTION")) });
    }
}

/*

	Total time: 380 ms
	
*/