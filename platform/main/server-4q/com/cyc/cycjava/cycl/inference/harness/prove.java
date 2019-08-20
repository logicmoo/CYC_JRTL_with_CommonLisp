package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.conflicts;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.forward_propagate_assertions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class prove extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "445b0f7679eb1df4ac234b6092bdf439aea9811f82e5e64699fd80fbb256771e";
    @SubL(source = "cycl/inference/harness.lisp", position = 1100L)
    private static SubLSymbol $conflicting_support_sets$;
    @SubL(source = "cycl/inference/harness.lisp", position = 7600L)
    private static SubLSymbol $something_asserted_within_hypothesize_termsP$;
    @SubL(source = "cycl/inference/harness.lisp", position = 25400L)
    private static SubLSymbol $fi_prove_new_cyc_query_trampoline_enabledP$;
    @SubL(source = "cycl/inference/harness.lisp", position = 28400L)
    public static SubLSymbol $proof_hypothesis_forward_propagation_enabled$;
    @SubL(source = "cycl/inference/harness.lisp", position = 33800L)
    private static SubLSymbol $hypothesis_mt_table$;
    @SubL(source = "cycl/inference/harness.lisp", position = 37300L)
    public static SubLSymbol $proof_assume_consequent_type_constraintsP$;
    @SubL(source = "cycl/inference/harness.lisp", position = 38600L)
    private static SubLSymbol $proof_mt_table$;
    @SubL(source = "cycl/inference/harness.lisp", position = 40600L)
    public static SubLSymbol $proof_hypothesis_forward_absolute_time_cutoff$;
    @SubL(source = "cycl/inference/harness.lisp", position = 40800L)
    public static SubLSymbol $proof_hypothesis_forward_time_cutoff$;
    @SubL(source = "cycl/inference/harness.lisp", position = 40900L)
    public static SubLSymbol $proof_hypothesis_forward_removal_cost_cutoff$;
    @SubL(source = "cycl/inference/harness.lisp", position = 41000L)
    public static SubLSymbol $proof_hypothesis_forward_propagation_depth$;
    @SubL(source = "cycl/inference/harness.lisp", position = 41900L)
    private static SubLSymbol $hypothesize_spec_mt_sentence$;
    @SubL(source = "cycl/inference/harness.lisp", position = 43100L)
    private static SubLSymbol $use_new_non_wff_conflict_supports_explain_methodP$;
    private static SubLSymbol $sym0$INFERENCE_RETURN_BLISTS_AND_SUPPORTS;
    private static SubLString $str1$HYP;
    private static SubLSymbol $HYPOTHESIZE;
    private static SubLSymbol $sym3$FI_HYPOTHESIZE;
    private static SubLList $list4;
    private static SubLString $str5$Cyc_attempts_to_check_if_SENTENCE;
    private static SubLList $list6;
    private static SubLSymbol $ARG_ERROR;
    private static SubLString $str8$Expected_a_cons__got__S;
    private static SubLString $str9$Expected_a_string__got__S;
    private static SubLObject $$and;
    private static SubLString $str11$;
    private static SubLObject $$False;
    private static SubLObject $$True;
    private static SubLSymbol $CONFLICT;
    private static SubLSymbol $sym15$CONFLICT_HANDLER;
    private static SubLList $list16;
    private static SubLSymbol $sym17$QUOTED_COLLECTION_;
    private static SubLObject $$CycLConstant;
    private static SubLList $list19;
    private static SubLString $str20$Constraint_variable_mismatch_erro;
    private static SubLList $list21;
    private static SubLSymbol $sym22$ANECT_;
    private static SubLObject $$equalSymbols;
    private static SubLObject $$isa;
    private static SubLObject $$UniversalVocabularyMt;
    private static SubLObject $$quotedIsa;
    private static SubLObject $$genls;
    private static SubLSymbol $sym28$STRINGP;
    private static SubLString $str29$_A__A__A;
    private static SubLObject $$definingMt;
    private static SubLList $list31;
    private static SubLObject $$hypotheticalTerm;
    private static SubLList $list33;
    private static SubLObject $$CycLReifiableDenotationalTerm;
    private static SubLSymbol $sym35$_;
    private static SubLSymbol $sym36$SPEC_CARDINALITY;
    private static SubLString $str37$Term;
    private static SubLList $list38;
    private static SubLList $list39;
    private static SubLSymbol $sym40$FORT_P;
    private static SubLSymbol $sym41$CONSTANT_NAME;
    private static SubLSymbol $sym42$CONSTANT_P;
    private static SubLSymbol $PROVE;
    private static SubLSymbol $sym44$FI_PROVE;
    private static SubLList $list45;
    private static SubLString $str46$Attempts_to_prove_SENTENCE_is_tru;
    private static SubLList $list47;
    private static SubLList $list48;
    private static SubLString $str49$Expected_an_integer__got__S;
    private static SubLObject $$implies;
    private static SubLSymbol $CONDITIONAL_SENTENCE_;
    private static SubLSymbol $TAUTOLOGY;
    private static SubLObject $$Always_TimeInterval;
    private static SubLObject $$TimePoint;
    private static SubLObject $$AnytimePSC;
    private static SubLSymbol $sym56$_HYPOTHESIS_MT_TABLE_;
    private static SubLList $list57;
    private static SubLObject $$HypotheticalContext;
    private static SubLString $str59$Hypothesis;
    private static SubLSymbol $sym60$HLMT_P;
    private static SubLSymbol $sym61$KILL_CACHED_HYPOTHESIS_MT;
    private static SubLList $list62;
    private static SubLSymbol $sym63$_PROOF_MT_TABLE_;
    private static SubLString $str64$Proof;
    private static SubLInteger $int$120;
    private static SubLList $list66;
    private static SubLSymbol $MT;
    private static SubLSymbol $sym68$_SPEC_MT;
    private static SubLObject $$highlyRelevantMt;
    private static SubLString $str70$HYP_;
    private static SubLSymbol $sym71$HYPOTHETICAL_CONSTANT;
    private static SubLSymbol $sym72$ASSERTED_ASSERTION_;
    private static SubLSymbol $sym73$HYPOTHETICAL_TERM_P;
    private static SubLSymbol $QUERY;
    private static SubLSymbol $sym75$GENERALITY_ESTIMATE_;
    private static SubLSymbol $sym76$CONVERT_TO_HL_SUPPORT;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $sym78$EPHEMERAL_TERM_;
    private static SubLObject $$ist;
    private static SubLSymbol $IGNORE;
    private static SubLList $list81;
    private static SubLSymbol $ISA;
    private static SubLSymbol $GENLS;
    private static SubLObject $$genlPreds;
    private static SubLObject $$genlInverse;
    private static SubLSymbol $GENLPREDS;
    private static SubLObject $$evaluate;
    private static SubLSymbol $EVAL;
    private static SubLSymbol $sym89$FI_PROVE_INT;
    private static SubLSymbol $TEST;
    private static SubLSymbol $OWNER;
    private static SubLSymbol $CLASSES;
    private static SubLSymbol $KB;
    private static SubLSymbol $TINY;
    private static SubLSymbol $WORKING_;
    private static SubLList $list96;

    @SubL(source = "cycl/inference/harness.lisp", position = 1200L)
    public static SubLObject prove_justified(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject status = NIL;
        SubLObject _prev_bind_0 = control_vars.$inference_answer_handler$.currentBinding(thread);
        try {
            control_vars.$inference_answer_handler$.bind($sym0$INFERENCE_RETURN_BLISTS_AND_SUPPORTS, thread);
            thread.resetMultipleValues();
            SubLObject ask_results = fi_prove_int(sentence, mt, backchain, number, time, depth);
            SubLObject ask_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            results = ask_results;
            status = ask_status;
        } finally {
            control_vars.$inference_answer_handler$.rebind(_prev_bind_0, thread);
        }
        return Values.values(results, status);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 1700L)
    public static SubLObject fi_hypothesize(SubLObject sentence, SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $str1$HYP;
        }
        if (term_ids == UNPROVIDED) {
            term_ids = NIL;
        }
        return fi.fi($HYPOTHESIZE, sentence, mt, name_prefix, term_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 2900L)
    public static SubLObject fi_hypothesize_int(SubLObject sentence, SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $str1$HYP;
        }
        if (term_ids == UNPROVIDED) {
            term_ids = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        fi.reset_fi_error_state();
        if (!sentence.isCons()) {
            fi.signal_fi_error(list($ARG_ERROR, $str8$Expected_a_cons__got__S, sentence));
            return NIL;
        }
        mt = fi.fi_convert_to_assert_hlmt_if_wft(mt);
        if (NIL != fi.fi_error_signaledP()) {
            return NIL;
        }
        if (!name_prefix.isString()) {
            fi.signal_fi_error(list($ARG_ERROR, $str9$Expected_a_string__got__S, name_prefix));
            return NIL;
        }
        thread.resetMultipleValues();
        SubLObject var_term_bindings = hypothesize_terms(sentence, mt, name_prefix, term_ids);
        SubLObject success = thread.secondMultipleValue();
        SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == success) {
            return Values.values(NIL, failure_reasons);
        }
        if (NIL == var_term_bindings) {
            return Values.values(bindings.unification_success_token(), NIL);
        }
        return Values.values(var_term_bindings, NIL);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 3900L)
    public static SubLObject hypothesize_terms(SubLObject sentence, SubLObject mt, SubLObject name_prefix, SubLObject term_ids) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $str1$HYP;
        }
        if (term_ids == UNPROVIDED) {
            term_ids = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject canonical_sentence = inference_czer.canonicalize_hypothesis(sentence, mt);
        SubLObject canonical_mt = thread.secondMultipleValue();
        SubLObject free_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject literals = inference_czer.categorize_hypothesis_formulas(canonical_sentence);
        SubLObject rules = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject literals_sentence = reader.bq_cons($$and, append(literals, NIL));
        thread.resetMultipleValues();
        SubLObject ans = hypothesize_terms_for_antecedent(literals_sentence, rules, canonical_mt, name_prefix, term_ids, free_vars);
        SubLObject terms = thread.secondMultipleValue();
        SubLObject successP = thread.thirdMultipleValue();
        SubLObject failure_reasons = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            ans = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                fi.fi_kill_int(v_term);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
        }
        return Values.values(ans, successP, failure_reasons);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 5000L)
    public static SubLObject hypothesize_terms_for_antecedent(SubLObject antecedent, SubLObject rules, SubLObject mt, SubLObject name_prefix, SubLObject term_ids, SubLObject free_vars) {
        return hypothesize_terms_int(antecedent, rules, mt, name_prefix, term_ids, NIL, T, free_vars);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 5200L)
    public static SubLObject hypothesize_terms_for_consequent(SubLObject consequent, SubLObject mt, SubLObject term_bindings, SubLObject free_vars) {
        return Values.nth_value_step_2(Values.nth_value_step_1(FOUR_INTEGER), hypothesize_terms_int(consequent, NIL, mt, $str11$, NIL, term_bindings, NIL, free_vars));
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 5400L)
    public static SubLObject hypothesize_terms_int(SubLObject sentence, SubLObject rules, SubLObject mt, SubLObject name_prefix, SubLObject term_ids, SubLObject term_bindings, SubLObject assert_sentenceP, SubLObject free_vars) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_bindings = NIL;
        SubLObject terms = NIL;
        SubLObject successP = NIL;
        SubLObject something_assertedP = NIL;
        SubLObject failure_reasons = NIL;
        conflicts.clear_inconsistent_support_sets();
        SubLObject _prev_bind_0 = $conflicting_support_sets$.currentBinding(thread);
        try {
            $conflicting_support_sets$.bind(NIL, thread);
            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject canon_versions = NIL;
                thread.resetMultipleValues();
                SubLObject canon_versions_$2 = inference_czer.canonicalize_hypothetical_ask(sentence, mt);
                SubLObject mt_$3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$2;
                mt = mt_$3;
                if (NIL == canon_versions) {
                    note_non_wff_conflict(sentence, mt, UNPROVIDED);
                } else if (canon_versions.eql($$False)) {
                    note_non_wff_conflict(sentence, mt, UNPROVIDED);
                } else if (canon_versions.eql($$True) && NIL == rules) {
                    successP = T;
                } else {
                    thread.resetMultipleValues();
                    SubLObject result_bindings_$4 = hypothesize_terms_int_2(canon_versions, mt, rules, name_prefix, term_ids, term_bindings, assert_sentenceP, free_vars);
                    SubLObject terms_$5 = thread.secondMultipleValue();
                    SubLObject successP_$6 = thread.thirdMultipleValue();
                    SubLObject something_assertedP_$7 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    result_bindings = result_bindings_$4;
                    terms = terms_$5;
                    successP = successP_$6;
                    something_assertedP = something_assertedP_$7;
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
            }
            failure_reasons = $conflicting_support_sets$.getDynamicValue(thread);
        } finally {
            $conflicting_support_sets$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result_bindings, terms, successP, failure_reasons, something_assertedP);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 7600L)
    public static SubLObject hypothesize_terms_int_2(SubLObject canon_versions, SubLObject mt, SubLObject rules, SubLObject name_prefix, SubLObject term_ids, SubLObject term_bindings, SubLObject assert_sentenceP, SubLObject free_vars) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_bindings = NIL;
        SubLObject terms = NIL;
        SubLObject successP = NIL;
        SubLObject something_assertedP = NIL;
        SubLObject num_vars = ZERO_INTEGER;
        SubLObject term_variable_map = NIL;
        SubLObject _prev_bind_0 = $something_asserted_within_hypothesize_termsP$.currentBinding(thread);
        try {
            $something_asserted_within_hypothesize_termsP$.bind(NIL, thread);
            try {
                thread.throwStack.push($CONFLICT);
                SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function($sym15$CONFLICT_HANDLER), thread);
                    try {
                        SubLObject _prev_bind_0_$9 = control_vars.$conflicts_from_invalid_deductions$.currentBinding(thread);
                        SubLObject _prev_bind_2 = Errors.$ignore_warnsP$.currentBinding(thread);
                        SubLObject _prev_bind_3 = wff_vars.$enforce_literal_wff_idiosyncrasiesP$.currentBinding(thread);
                        SubLObject _prev_bind_4 = control_vars.$record_inconsistent_support_sets$.currentBinding(thread);
                        try {
                            control_vars.$conflicts_from_invalid_deductions$.bind(T, thread);
                            Errors.$ignore_warnsP$.bind(T, thread);
                            wff_vars.$enforce_literal_wff_idiosyncrasiesP$.bind(NIL, thread);
                            control_vars.$record_inconsistent_support_sets$.bind(T, thread);
                            SubLObject _prev_bind_0_$10 = control_vars.$ignore_non_definitional_conflictsP$.currentBinding(thread);
                            try {
                                control_vars.$ignore_non_definitional_conflictsP$.bind(T, thread);
                                if (!canon_versions.eql($$True)) {
                                    SubLObject canon_version = canon_versions.first();
                                    SubLObject canon_var_map = conses_high.second(canon_version);
                                    thread.resetMultipleValues();
                                    SubLObject dnf = fi.fi_canonicalize(canon_version, UNPROVIDED, UNPROVIDED);
                                    SubLObject v_variables = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    num_vars = Sequences.length(v_variables);
                                    SubLObject var_equality_constraints = hypothesize_dnf_equality_constraints(dnf, mt);
                                    SubLObject var_isa_constraints = hypothesize_dnf_isa_constraints(dnf, mt);
                                    if (Sequences.length(var_isa_constraints).numE(num_vars)) {
                                        SubLObject var_quoted_isa_constraints = hypothesize_dnf_quoted_isa_constraints(dnf, mt);
                                        if (Sequences.length(var_quoted_isa_constraints).numE(num_vars)) {
                                            SubLObject var_genl_constraints = hypothesize_dnf_genl_constraints(dnf, mt);
                                            if (Sequences.length(var_genl_constraints).numE(num_vars)) {
                                                thread.resetMultipleValues();
                                                SubLObject terms_$11 = hypothesize_terms_for_variables(var_equality_constraints, var_isa_constraints, var_quoted_isa_constraints, var_genl_constraints, mt, canon_var_map, terms, name_prefix, term_ids, term_bindings);
                                                SubLObject term_variable_map_$12 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                terms = terms_$11;
                                                term_variable_map = term_variable_map_$12;
                                                if (NIL != assert_sentenceP) {
                                                    assert_hypothetical_term_content_gafs(dnf, mt, term_variable_map);
                                                    SubLObject i;
                                                    SubLObject var;
                                                    SubLObject v_term;
                                                    for (i = NIL, i = ZERO_INTEGER; i.numL(num_vars); i = Numbers.add(i, ONE_INTEGER)) {
                                                        var = nth(i, v_variables);
                                                        v_term = conses_high.assoc(variables.find_variable_by_id(i), term_variable_map, UNPROVIDED, UNPROVIDED).rest();
                                                        if (NIL != subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED)) {
                                                            result_bindings = ConsesLow.cons(cons(var, v_term), result_bindings);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                control_vars.$ignore_non_definitional_conflictsP$.rebind(_prev_bind_0_$10, thread);
                            }
                            assert_hypothetical_term_rules(rules, mt, term_variable_map, result_bindings);
                            result_bindings = Sequences.nreverse(result_bindings);
                            successP = T;
                            something_assertedP = $something_asserted_within_hypothesize_termsP$.getDynamicValue(thread);
                        } finally {
                            control_vars.$record_inconsistent_support_sets$.rebind(_prev_bind_4, thread);
                            wff_vars.$enforce_literal_wff_idiosyncrasiesP$.rebind(_prev_bind_3, thread);
                            Errors.$ignore_warnsP$.rebind(_prev_bind_2, thread);
                            control_vars.$conflicts_from_invalid_deductions$.rebind(_prev_bind_0_$9, thread);
                        }
                    } catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                }
            } catch (Throwable ccatch_env_var) {
                result_bindings = Errors.handleThrowable(ccatch_env_var, $CONFLICT);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            $something_asserted_within_hypothesize_termsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result_bindings, terms, successP, something_assertedP);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 10500L)
    public static SubLObject hypothesize_terms_for_variables(SubLObject var_equality_constraints, SubLObject var_isa_constraints, SubLObject var_quoted_isa_constraints, SubLObject var_genl_constraints, SubLObject mt, SubLObject canon_var_map, SubLObject terms, SubLObject name_prefix,
            SubLObject term_ids, SubLObject term_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
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
        while (NIL != var_genl_constraint || NIL != var_quoted_isa_constraint || NIL != var_isa_constraint) {
            SubLObject current;
            SubLObject datum = current = var_isa_constraint_$13;
            SubLObject variable = NIL;
            SubLObject new_term_name = NIL;
            SubLObject isa_constraints = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            variable = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            new_term_name = current.first();
            current = (isa_constraints = current.rest());
            SubLObject equal_symbol = list_utilities.alist_lookup(var_equality_constraints, variable, UNPROVIDED, UNPROVIDED);
            if (NIL != equal_symbol) {
                SubLObject new_binding = bindings.make_variable_binding(variable, equal_symbol);
                term_variable_map = cons(new_binding, term_variable_map);
            } else {
                SubLObject quoted_col_isa_constraints = list_utilities.remove_if_not($sym17$QUOTED_COLLECTION_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == disjoint_with.any_disjoint_withP(quoted_col_isa_constraints, $$CycLConstant, UNPROVIDED, UNPROVIDED)) {
                    SubLObject current_$17;
                    SubLObject datum_$16 = current_$17 = var_genl_constraint_$15;
                    SubLObject variable2 = NIL;
                    SubLObject genl_constraints = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$16, $list19);
                    variable2 = current_$17.first();
                    current_$17 = (genl_constraints = current_$17.rest());
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !variable.eql(variable2)) {
                        Errors.error($str20$Constraint_variable_mismatch_erro, variable, variable2);
                    }
                    SubLObject current_$18;
                    SubLObject datum_$17 = current_$18 = var_quoted_isa_constraint_$14;
                    SubLObject variable3 = NIL;
                    SubLObject quoted_isa_constraints = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, $list21);
                    variable3 = current_$18.first();
                    current_$18 = (quoted_isa_constraints = current_$18.rest());
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !variable.eql(variable3)) {
                        Errors.error($str20$Constraint_variable_mismatch_erro, variable, variable3);
                    }
                    SubLObject current_el_variable = conses_high.rassoc(variable, canon_var_map, UNPROVIDED, UNPROVIDED).first();
                    SubLObject new_term_id = conses_high.assoc(current_el_variable, term_ids, UNPROVIDED, UNPROVIDED).rest();
                    SubLObject new_term = (NIL != term_bindings) ? list_utilities.alist_lookup(term_bindings, current_el_variable, UNPROVIDED, UNPROVIDED) : create_hypothesized_constant(name_prefix, new_term_name, new_term_id);
                    SubLObject newP = makeBoolean(NIL == term_bindings);
                    SubLObject new_binding2 = bindings.make_variable_binding(variable, new_term);
                    if (NIL != new_term) {
                        term_variable_map = cons(new_binding2, term_variable_map);
                        terms = cons(new_term, terms);
                        SubLObject non_anect_isa_constraints = Sequences.remove_if($sym22$ANECT_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != non_anect_isa_constraints) {
                            SubLObject min_anects = at_utilities.union_min_anects(non_anect_isa_constraints, mt);
                            isa_constraints = append(min_anects, isa_constraints);
                        }
                        SubLObject non_anect_quoted_isa_constraints = Sequences.remove_if($sym22$ANECT_, quoted_isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != non_anect_quoted_isa_constraints) {
                            SubLObject min_anects = at_utilities.union_min_anects(non_anect_quoted_isa_constraints, mt);
                            quoted_isa_constraints = append(min_anects, quoted_isa_constraints);
                        }
                        SubLObject non_anect_genl_constraints = Sequences.remove_if($sym22$ANECT_, genl_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != non_anect_genl_constraints) {
                            SubLObject min_anects = at_utilities.union_min_anects(non_anect_genl_constraints, mt);
                            genl_constraints = append(min_anects, genl_constraints);
                        }
                        SubLObject isas_okP = assert_hypothetical_term_isa_constraints(new_term, new_binding2, isa_constraints, mt);
                        if (NIL != newP) {
                            assert_that_term_is_hypothetical(new_term, mt);
                        }
                        if (NIL == isas_okP) {
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

    @SubL(source = "cycl/inference/harness.lisp", position = 14400L)
    public static SubLObject assert_within_hypothetical(SubLObject sentence, SubLObject mt, SubLObject variable_map, SubLObject abort_on_failureP) {
        if (abort_on_failureP == UNPROVIDED) {
            abort_on_failureP = T;
        }
        fi.fi_assert_int(sentence, mt, UNPROVIDED, UNPROVIDED);
        if (NIL == fi.fi_error_signaledP()) {
            $something_asserted_within_hypothesize_termsP$.setDynamicValue(T);
            return T;
        }
        note_non_wff_conflict(sentence, mt, variable_map);
        if (NIL != el_utilities.el_formula_with_operator_p(sentence, $$equalSymbols)) {
            return NIL;
        }
        if (NIL != abort_on_failureP) {
            conflicts.conflict_abort();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 14900L)
    public static SubLObject assert_hypothetical_term_isa_constraints(SubLObject new_term, SubLObject new_binding, SubLObject isa_constraints, SubLObject mt) {
        SubLObject cdolist_list_var = isa_constraints;
        SubLObject isa_constraint = NIL;
        isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject assert_mt = mt;
            if (NIL == isa.isaP(new_term, isa_constraint, mt, UNPROVIDED)) {
                SubLObject isa_constraint_sentence = list($$isa, new_term, isa_constraint);
                if (NIL != kb_accessors.anectP(isa_constraint)) {
                    assert_mt = $$UniversalVocabularyMt;
                }
                if (NIL == assert_within_hypothetical(isa_constraint_sentence, assert_mt, list(new_binding), NIL)) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_constraint = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 15600L)
    public static SubLObject assert_hypothetical_term_quoted_isa_constraints(SubLObject new_term, SubLObject new_binding, SubLObject quoted_isa_constraints, SubLObject mt) {
        SubLObject cdolist_list_var = quoted_isa_constraints;
        SubLObject quoted_isa_constraint = NIL;
        quoted_isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == at_defns.quoted_has_typeP(new_term, quoted_isa_constraint, mt)) {
                SubLObject quoted_isa_constraint_sentence = list($$quotedIsa, new_term, quoted_isa_constraint);
                if (NIL == assert_within_hypothetical(quoted_isa_constraint_sentence, mt, list(new_binding), UNPROVIDED)) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            quoted_isa_constraint = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 16300L)
    public static SubLObject assert_hypothetical_term_genl_constraints(SubLObject new_term, SubLObject new_binding, SubLObject genl_constraints, SubLObject mt) {
        SubLObject cdolist_list_var = genl_constraints;
        SubLObject genl_constraint = NIL;
        genl_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == genls.genlsP(new_term, genl_constraint, mt, UNPROVIDED)) {
                SubLObject genl_constraint_sentence = list($$genls, new_term, genl_constraint);
                if (NIL == assert_within_hypothetical(genl_constraint_sentence, mt, list(new_binding), UNPROVIDED)) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_constraint = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 16900L)
    public static SubLObject assert_hypothetical_term_content_gafs(SubLObject dnf, SubLObject mt, SubLObject term_variable_map) {
        dnf = conses_high.nsublis(term_variable_map, dnf, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = czer_utilities.definitional_lits_to_front(clauses.pos_lits(dnf));
        SubLObject new_sentence = NIL;
        new_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == assert_within_hypothetical(new_sentence, mt, term_variable_map, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_sentence = cdolist_list_var.first();
        }
        cdolist_list_var = czer_utilities.definitional_lits_to_front(clauses.neg_lits(dnf));
        SubLObject neg_lit = NIL;
        neg_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_sentence2 = cycl_utilities.negate(neg_lit);
            if (NIL == assert_within_hypothetical(new_sentence2, mt, term_variable_map, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            neg_lit = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 17700L)
    public static SubLObject assert_hypothetical_term_rules(SubLObject rules, SubLObject mt, SubLObject term_variable_map, SubLObject v_bindings) {
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_rule = rule;
            if (NIL != v_bindings) {
                new_rule = conses_high.sublis(v_bindings, rule, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == assert_within_hypothetical(new_rule, mt, term_variable_map, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 18000L)
    public static SubLObject create_hypothesized_constant(SubLObject name_prefix, SubLObject start_name, SubLObject external_id) {
        assert NIL != Types.stringp(name_prefix) : name_prefix;
        assert NIL != Types.stringp(start_name) : start_name;
        SubLObject initial_name = constant_completion_high.uniquify_constant_name(start_name, UNPROVIDED);
        SubLObject v_term = fi.fi_create_int(initial_name, external_id);
        if (isConstSym(v_term)) {
            SubLObject term_id = constants_high.constant_internal_id(v_term);
            SubLObject final_name = PrintLow.format(NIL, $str29$_A__A__A, new SubLObject[] { name_prefix, start_name, term_id });
            final_name = constant_completion_high.uniquify_constant_name(final_name, UNPROVIDED);
            fi.fi_rename_int(v_term, final_name);
            return v_term;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 19300L)
    public static SubLObject assert_that_term_is_hypothetical(SubLObject v_term, SubLObject mt) {
        SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
        cyc_kernel.cyc_assert_wff(list($$definingMt, v_term, monad_mt), mt_vars.$defining_mt_mt$.getGlobalValue(), $list31);
        cyc_kernel.cyc_assert_wff(list($$hypotheticalTerm, v_term), mt, $list31);
        return v_term;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 19800L)
    public static SubLObject hypothesize_dnf_equality_constraints(SubLObject dnf, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject equality_alist = NIL;
        SubLObject equality_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject conflict_vars = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(dnf);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject items_var = simplifier.fold_equals_in_asent(asent, equality_dict, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (items_var.isVector()) {
                SubLObject vector_var = items_var;
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    element_num = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    item = Vectors.aref(vector_var, element_num);
                    conflict_vars = cons(item, conflict_vars);
                }
            } else {
                SubLObject cdolist_list_var_$20 = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var_$20.first();
                while (NIL != cdolist_list_var_$20) {
                    conflict_vars = cons(item2, conflict_vars);
                    cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                    item2 = cdolist_list_var_$20.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(equality_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            SubLObject open_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject closed_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == subl_promotions.memberP(open_term, conflict_vars, UNPROVIDED, UNPROVIDED)) {
                equality_alist = cons(cons(open_term, closed_term), equality_alist);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return equality_alist;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 20400L)
    public static SubLObject hypothesize_dnf_isa_constraints(SubLObject dnf, SubLObject mt) {
        SubLObject variable_isa_constraints = antecedent_dnf_variables_isa_constraints(dnf, mt);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = variable_isa_constraints;
        SubLObject variable_isa_constraint = NIL;
        variable_isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = variable_isa_constraint;
            SubLObject variable = NIL;
            SubLObject isa_constraints = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list33);
            variable = current.first();
            current = (isa_constraints = current.rest());
            isa_constraints = Sequences.delete($$CycLReifiableDenotationalTerm, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject most_specific = list_utilities.extremal(isa_constraints, Symbols.symbol_function($sym35$_), Symbols.symbol_function($sym36$SPEC_CARDINALITY));
            SubLObject suggested_name = $str37$Term;
            if (NIL != forts.fort_p(most_specific)) {
                suggested_name = suggest_string_from_fort_el_formula(most_specific);
            }
            ans = cons(listS(variable, suggested_name, append(isa_constraints, NIL)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            variable_isa_constraint = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 21400L)
    public static SubLObject hypothesize_dnf_quoted_isa_constraints(SubLObject dnf, SubLObject mt) {
        SubLObject variable_quoted_isa_constraints = antecedent_dnf_variables_quoted_isa_constraints(dnf, mt);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = variable_quoted_isa_constraints;
        SubLObject variable_quoted_isa_constraint = NIL;
        variable_quoted_isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = variable_quoted_isa_constraint;
            SubLObject variable = NIL;
            SubLObject quoted_isa_constraints = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list38);
            variable = current.first();
            current = (quoted_isa_constraints = current.rest());
            quoted_isa_constraints = Sequences.delete($$CycLReifiableDenotationalTerm, quoted_isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            ans = cons(reader.bq_cons(variable, append(quoted_isa_constraints, NIL)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            variable_quoted_isa_constraint = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 22300L)
    public static SubLObject hypothesize_dnf_genl_constraints(SubLObject dnf, SubLObject mt) {
        SubLObject variable_genl_constraints = antecedent_dnf_variables_genl_constraints(dnf, mt);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = variable_genl_constraints;
        SubLObject variable_genl_constraint = NIL;
        variable_genl_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = variable_genl_constraint;
            SubLObject variable = NIL;
            SubLObject genl_constraints = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
            variable = current.first();
            current = (genl_constraints = current.rest());
            genl_constraints = Sequences.delete($$CycLReifiableDenotationalTerm, genl_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            ans = cons(reader.bq_cons(variable, append(genl_constraints, NIL)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            variable_genl_constraint = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 23100L)
    public static SubLObject antecedent_dnf_variables_isa_constraints(SubLObject dnf, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind(T, thread);
            result = at_var_types.dnf_variables_isa_constraints(dnf, mt, UNPROVIDED);
        } finally {
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 23500L)
    public static SubLObject antecedent_dnf_variables_quoted_isa_constraints(SubLObject dnf, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind(T, thread);
            result = at_var_types.dnf_variables_quoted_isa_constraints(dnf, mt, UNPROVIDED);
        } finally {
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 23800L)
    public static SubLObject antecedent_dnf_variables_genl_constraints(SubLObject dnf, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
        try {
            at_vars.$within_disjunctionP$.bind(T, thread);
            result = at_var_types.dnf_variables_genl_constraints(dnf, mt, UNPROVIDED);
        } finally {
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 24100L)
    public static SubLObject suggest_string_from_fort_el_formula(SubLObject fort) {
        assert NIL != forts.fort_p(fort) : fort;
        if (NIL != nart_handles.nart_p(fort)) {
            return string_utilities.strcat(Mapping.mapcar(Symbols.symbol_function($sym41$CONSTANT_NAME), list_utilities.delete_if_not(Symbols.symbol_function($sym42$CONSTANT_P), list_utilities.flatten(forts.fort_el_formula(fort)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        if (isConstSym(fort)) {
            return constants_high.constant_name(fort);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 24500L)
    public static SubLObject fi_prove(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        return fi.fi($PROVE, sentence, mt, backchain, number, time, depth, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 25500L)
    public static SubLObject fi_prove_int(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        fi.reset_fi_error_state();
        if (!sentence.isCons()) {
            fi.signal_fi_error(list($ARG_ERROR, $str8$Expected_a_cons__got__S, sentence));
            return NIL;
        }
        if (NIL != fi.fi_ask_ist_query_p(sentence)) {
            SubLObject ist = NIL;
            SubLObject ist_mt = NIL;
            SubLObject ist_sentence = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(sentence, sentence, $list48);
            ist = sentence.first();
            SubLObject current = sentence.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, sentence, $list48);
            ist_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, sentence, $list48);
            ist_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                return fi_prove_int(ist_sentence, ist_mt, backchain, number, time, depth);
            }
            cdestructuring_bind.cdestructuring_bind_error(sentence, $list48);
            return NIL;
        } else {
            mt = fi.fi_convert_to_fort(mt);
            if (NIL != fi.fi_error_signaledP()) {
                return NIL;
            }
            if (NIL != backchain && backchain != T && !backchain.isInteger()) {
                fi.signal_fi_error(list($ARG_ERROR, $str49$Expected_an_integer__got__S, backchain));
                return NIL;
            }
            if (NIL != number && !number.isInteger()) {
                fi.signal_fi_error(list($ARG_ERROR, $str49$Expected_an_integer__got__S, number));
                return NIL;
            }
            if (NIL != time && !time.isInteger()) {
                fi.signal_fi_error(list($ARG_ERROR, $str49$Expected_an_integer__got__S, time));
                return NIL;
            }
            if (NIL != depth && !depth.isInteger()) {
                fi.signal_fi_error(list($ARG_ERROR, $str49$Expected_an_integer__got__S, depth));
                return NIL;
            }
            if (NIL != $fi_prove_new_cyc_query_trampoline_enabledP$.getDynamicValue(thread)) {
                thread.resetMultipleValues();
                SubLObject v_answer = fi_prove_int_new_cyc_query_trampoline(sentence, mt, backchain, number, time, depth);
                SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return Values.values(v_answer, reason);
            }
            if (sentence.isCons() && sentence.first().eql($$implies)) {
                return prove_from(conses_high.second(sentence), conses_high.third(sentence), mt, backchain, number, time, depth);
            }
            return prove_from($$True, sentence, mt, backchain, number, time, depth);
        }
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 27200L)
    public static SubLObject fi_prove_int_new_cyc_query_trampoline(SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        query_properties = conses_high.copy_list(query_properties);
        if (NIL != el_utilities.el_implication_p(sentence)) {
            query_properties = conses_high.putf(query_properties, $CONDITIONAL_SENTENCE_, T);
        }
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 27600L)
    public static SubLObject prove_from(SubLObject antecedant, SubLObject consequent, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forward_time = prove_from_forward_time(time);
        SubLObject backward_time = prove_from_backward_time(time);
        thread.resetMultipleValues();
        SubLObject proof_sentence = prepare_for_proof(antecedant, consequent, mt, forward_time);
        SubLObject proof_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == proof_sentence || NIL == proof_mt) {
            SubLObject v_answer = cyc_kernel.closed_query_success_token();
            SubLObject reason = $TAUTOLOGY;
            return Values.values(v_answer, reason);
        }
        thread.resetMultipleValues();
        SubLObject v_answer = fi.fi_ask_int(proof_sentence, proof_mt, backchain, number, backward_time, depth);
        SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(v_answer, reason);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 28600L)
    public static SubLObject prove_from_forward_time(SubLObject total_time_cutoff) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
            return ZERO_INTEGER;
        }
        if (NIL == total_time_cutoff) {
            return NIL;
        }
        return Numbers.integerDivide(total_time_cutoff, TWO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 28900L)
    public static SubLObject prove_from_backward_time(SubLObject total_time_cutoff) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
            return total_time_cutoff;
        }
        if (NIL == total_time_cutoff) {
            return NIL;
        }
        return Numbers.integerDivide(total_time_cutoff, TWO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 29200L)
    public static SubLObject new_prepare_for_proof(SubLObject antecedent, SubLObject consequent, SubLObject input_query_mt) {
        return prepare_for_proof(antecedent, consequent, input_query_mt, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 30400L)
    public static SubLObject prepare_for_proof(SubLObject antecedent, SubLObject consequent, SubLObject input_query_mt, SubLObject forward_time) {
        SubLThread thread = SubLProcess.currentSubLThread();
        input_query_mt = hlmt_czer.canonicalize_hlmt(input_query_mt);
        SubLObject assumption_mt = prepare_assumption_mt(input_query_mt);
        thread.resetMultipleValues();
        SubLObject hypothesis_mt = prepare_hypothesis_mt(antecedent, assumption_mt, forward_time);
        SubLObject term_bindings = thread.secondMultipleValue();
        SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != failure_reasons) {
            return Values.values(NIL, NIL, NIL, failure_reasons);
        }
        thread.resetMultipleValues();
        SubLObject proof_mt = prepare_proof_mt(consequent, hypothesis_mt, term_bindings);
        SubLObject failure_reasons_$21 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != failure_reasons_$21) {
            return Values.values(NIL, NIL, NIL, failure_reasons_$21);
        }
        SubLObject query_sentence = bindings.apply_bindings(term_bindings, consequent);
        SubLObject query_mt = prepare_query_mt(input_query_mt, proof_mt);
        return Values.values(query_sentence, query_mt, term_bindings, NIL);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 31200L)
    public static SubLObject prepare_assumption_mt(SubLObject input_query_mt) {
        if (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(input_query_mt)) {
            return mt_vars.$theory_mt_root$.getGlobalValue();
        }
        if (NIL != hlmt.anytime_psc_hlmtP(input_query_mt)) {
            return hlmt.replace_time_dimension(input_query_mt, $$Always_TimeInterval, $$TimePoint);
        }
        return input_query_mt;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 31800L)
    public static SubLObject prepare_query_mt(SubLObject input_query_mt, SubLObject proof_mt) {
        if (NIL == proof_mt) {
            return proof_mt;
        }
        if (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(input_query_mt)) {
            return input_query_mt;
        }
        if (NIL != hlmt.anytime_psc_hlmtP(input_query_mt)) {
            return hlmt.replace_time_dimension(proof_mt, $$AnytimePSC, UNPROVIDED);
        }
        return proof_mt;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 32300L)
    public static SubLObject prepare_hypothesis_mt(SubLObject hypothesis_sentence, SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        if (hypothesis_sentence.eql($$True)) {
            return Values.values(mt, NIL, NIL);
        }
        return find_or_create_hypothesis_mt(hypothesis_sentence, mt, forward_time);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 33200L)
    public static SubLObject find_or_create_hypothesis_mt(SubLObject hypothesis_sentence, SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject hypothesis_mt = find_hypothesis_mt(hypothesis_sentence, mt);
        SubLObject term_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != hypothesis_mt) {
            return Values.values(hypothesis_mt, term_bindings, NIL);
        }
        thread.resetMultipleValues();
        hypothesis_mt = create_hypothesis_mt(hypothesis_sentence, mt, forward_time);
        term_bindings = thread.secondMultipleValue();
        SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != failure_reasons) {
            return Values.values(NIL, NIL, failure_reasons);
        }
        return Values.values(hypothesis_mt, term_bindings, NIL);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 33800L)
    public static SubLObject find_hypothesis_mt(SubLObject hypothesis_sentence, SubLObject mt) {
        SubLObject ist_sentence = el_utilities.make_ist_sentence(mt, hypothesis_sentence);
        SubLObject hypothesis_info = dictionary.dictionary_lookup($hypothesis_mt_table$.getGlobalValue(), ist_sentence, UNPROVIDED);
        if (NIL == hypothesis_info) {
            return Values.values(NIL, NIL);
        }
        SubLObject current;
        SubLObject datum = current = hypothesis_info;
        SubLObject hypothesis_mt = NIL;
        SubLObject term_bindings = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list57);
        hypothesis_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list57);
        term_bindings = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list57);
            return NIL;
        }
        if (NIL == valid_hypothesis_mt_infoP(hypothesis_mt, term_bindings)) {
            dictionary.dictionary_remove($hypothesis_mt_table$.getGlobalValue(), ist_sentence);
            return Values.values(NIL, NIL);
        }
        return Values.values(hypothesis_mt, term_bindings);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 34400L)
    public static SubLObject valid_hypothesis_mt_infoP(SubLObject hypothesis_mt, SubLObject term_bindings) {
        if (NIL == hlmt.valid_hlmtP(hypothesis_mt, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == isa.isaP(hlmt.hlmt_monad_mt(hypothesis_mt), $$HypotheticalContext, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject cdolist_list_var = term_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject hypothesized_term_constant = bindings.variable_binding_value(binding);
            if (NIL == constant_handles.valid_constantP(hypothesized_term_constant, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 34900L)
    public static SubLObject create_hypothesis_mt(SubLObject hypothesis_sentence, SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject hypothesis_mt = create_hypothesis_mt_int(hypothesis_sentence, mt, forward_time);
        SubLObject term_bindings = thread.secondMultipleValue();
        SubLObject failure_reasons = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != hypothesis_mt) {
            SubLObject ist_sentence = el_utilities.make_ist_sentence(mt, hypothesis_sentence);
            SubLObject hypothesis_info = list(hypothesis_mt, term_bindings);
            dictionary.dictionary_enter($hypothesis_mt_table$.getGlobalValue(), ist_sentence, hypothesis_info);
        }
        return Values.values(hypothesis_mt, term_bindings, failure_reasons);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 35500L)
    public static SubLObject create_hypothesis_mt_int(SubLObject hypothesis_sentence, SubLObject mt, SubLObject forward_time) {
        if (forward_time == UNPROVIDED) {
            forward_time = ZERO_INTEGER;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothesis_mt = NIL;
        SubLObject term_bindings = NIL;
        SubLObject failedP = NIL;
        SubLObject failure_reasons = NIL;
        hypothesis_mt = hypothesize_spec_mt(mt, $str59$Hypothesis);
        if (NIL != hypothesis_mt) {
            SubLObject hypothesis_monad_mt = hlmt.hlmt_monad_mt(hypothesis_mt);
            try {
                thread.resetMultipleValues();
                SubLObject term_bindings_$22 = fi_hypothesize_int(hypothesis_sentence, hypothesis_mt, UNPROVIDED, UNPROVIDED);
                SubLObject failure_reasons_$23 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                term_bindings = term_bindings_$22;
                failure_reasons = failure_reasons_$23;
                if (NIL != term_bindings) {
                    if (NIL != bindings.unification_success_token_p(term_bindings)) {
                        term_bindings = NIL;
                    }
                    note_hypothesis_mt_term_bindings(hypothesis_mt, term_bindings);
                } else {
                    failedP = T;
                }
            } finally {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    if (NIL != failedP) {
                        fi.fi_kill_int(hypothesis_monad_mt);
                        hypothesis_mt = NIL;
                        term_bindings = NIL;
                    }
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            failedP = T;
        }
        if (NIL == failedP) {
            if (NIL != $proof_hypothesis_forward_propagation_enabled$.getDynamicValue(thread)) {
                forward_propagate_proof_hypothesis_mt(hypothesis_mt, forward_time);
            }
            return Values.values(hypothesis_mt, term_bindings, NIL);
        }
        return Values.values(NIL, NIL, failure_reasons);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 36600L)
    public static SubLObject note_hypothesis_mt_term_bindings(SubLObject hypothesis_mt, SubLObject term_bindings) {
        assert NIL != hlmt.hlmt_p(hypothesis_mt) : hypothesis_mt;
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 37100L)
    public static SubLObject kill_cached_hypothesis_mt(SubLObject hypothesis_mt) {
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 37500L)
    public static SubLObject prepare_proof_mt(SubLObject consequent_sentence, SubLObject hypothesis_mt, SubLObject term_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $proof_assume_consequent_type_constraintsP$.getDynamicValue(thread)) {
            return Values.values(hypothesis_mt, NIL);
        }
        SubLObject consequent_mentions_antecedent_variableP;
        SubLObject rest;
        SubLObject term_binding;
        SubLObject current;
        SubLObject datum;
        SubLObject variable;
        SubLObject value;
        for (consequent_mentions_antecedent_variableP = NIL, rest = NIL, rest = term_bindings; NIL == consequent_mentions_antecedent_variableP
                && NIL != rest; consequent_mentions_antecedent_variableP = cycl_utilities.expression_find(variable, consequent_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED), rest = rest.rest()) {
            term_binding = rest.first();
            datum = (current = term_binding);
            variable = NIL;
            value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list62);
            variable = current.first();
            current = (value = current.rest());
        }
        if (NIL == consequent_mentions_antecedent_variableP) {
            return Values.values(hypothesis_mt, NIL);
        }
        return find_or_create_proof_mt(consequent_sentence, hypothesis_mt, term_bindings);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 38300L)
    public static SubLObject find_or_create_proof_mt(SubLObject consequent_sentence, SubLObject hypothesis_mt, SubLObject term_bindings) {
        SubLObject proof_mt = find_proof_mt(consequent_sentence, hypothesis_mt);
        if (NIL != proof_mt) {
            return Values.values(proof_mt, NIL);
        }
        return create_proof_mt(consequent_sentence, hypothesis_mt, term_bindings);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 38700L)
    public static SubLObject find_proof_mt(SubLObject consequent_sentence, SubLObject hypothesis_mt) {
        SubLObject ist_sentence = el_utilities.make_ist_sentence(hypothesis_mt, consequent_sentence);
        SubLObject proof_mt = dictionary.dictionary_lookup($proof_mt_table$.getGlobalValue(), ist_sentence, UNPROVIDED);
        if (NIL != proof_mt && NIL == hlmt.valid_hlmt_p(proof_mt, UNPROVIDED)) {
            dictionary.dictionary_remove($proof_mt_table$.getGlobalValue(), ist_sentence);
            proof_mt = NIL;
        }
        return proof_mt;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 39000L)
    public static SubLObject create_proof_mt(SubLObject consequent_sentence, SubLObject hypothesis_mt, SubLObject term_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject proof_mt = create_proof_mt_int(consequent_sentence, hypothesis_mt, term_bindings);
        SubLObject failure_reasons = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != proof_mt) {
            SubLObject ist_sentence = el_utilities.make_ist_sentence(hypothesis_mt, consequent_sentence);
            dictionary.dictionary_enter($proof_mt_table$.getGlobalValue(), ist_sentence, proof_mt);
        }
        return Values.values(proof_mt, failure_reasons);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 39500L)
    public static SubLObject create_proof_mt_int(SubLObject consequent_sentence, SubLObject hypothesis_mt, SubLObject term_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proof_mt = hypothesize_spec_mt(hypothesis_mt, $str64$Proof);
        SubLObject failure_reasons = NIL;
        if (NIL == proof_mt) {
            return Values.values(NIL, NIL);
        }
        SubLObject proof_monad_mt = hlmt.hlmt_monad_mt(proof_mt);
        SubLObject something_assertedP = NIL;
        SubLObject free_vars = el_utilities.sentence_free_variables(consequent_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject _prev_bind_0 = at_vars.$at_include_isa_literal_constraints$.currentBinding(thread);
        SubLObject _prev_bind_2 = at_vars.$at_include_genl_literal_constraints$.currentBinding(thread);
        try {
            at_vars.$at_include_isa_literal_constraints$.bind(NIL, thread);
            at_vars.$at_include_genl_literal_constraints$.bind(NIL, thread);
            something_assertedP = hypothesize_terms_for_consequent(consequent_sentence, proof_mt, term_bindings, free_vars);
        } finally {
            at_vars.$at_include_genl_literal_constraints$.rebind(_prev_bind_2, thread);
            at_vars.$at_include_isa_literal_constraints$.rebind(_prev_bind_0, thread);
        }
        if (NIL == something_assertedP) {
            fi.fi_kill_int(proof_monad_mt);
            proof_mt = hypothesis_mt;
        }
        return Values.values(proof_mt, failure_reasons);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 41100L)
    public static SubLObject forward_propagate_proof_hypothesis_mt(SubLObject hypothesis_mt, SubLObject forward_time) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (!forward_time.isInteger() || !forward_time.numLE(ZERO_INTEGER)) {
            if (NIL == forward_time) {
                forward_time = $proof_hypothesis_forward_absolute_time_cutoff$.getDynamicValue(thread);
            }
            SubLObject _prev_bind_0 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
            SubLObject _prev_bind_2 = control_vars.$forward_inference_removal_cost_cutoff$.currentBinding(thread);
            SubLObject _prev_bind_3 = kb_control_vars.$forward_inference_time_cutoff$.currentBinding(thread);
            SubLObject _prev_bind_4 = control_vars.$filter_deductions_for_trivially_derivable_gafs$.currentBinding(thread);
            SubLObject _prev_bind_5 = kb_control_vars.$forward_propagate_from_negations$.currentBinding(thread);
            SubLObject _prev_bind_6 = kb_control_vars.$forward_propagate_to_negations$.currentBinding(thread);
            try {
                control_vars.$unbound_rule_backchain_enabled$.bind(T, thread);
                control_vars.$forward_inference_removal_cost_cutoff$.bind($proof_hypothesis_forward_removal_cost_cutoff$.getDynamicValue(thread), thread);
                kb_control_vars.$forward_inference_time_cutoff$.bind($proof_hypothesis_forward_time_cutoff$.getDynamicValue(thread), thread);
                control_vars.$filter_deductions_for_trivially_derivable_gafs$.bind(T, thread);
                kb_control_vars.$forward_propagate_from_negations$.bind(NIL, thread);
                kb_control_vars.$forward_propagate_to_negations$.bind(NIL, thread);
                forward_propagate_assertions.forward_propagate_mt(hypothesis_mt, hypothesis_mt, NIL, forward_time, $proof_hypothesis_forward_propagation_depth$.getDynamicValue(thread));
            } finally {
                kb_control_vars.$forward_propagate_to_negations$.rebind(_prev_bind_6, thread);
                kb_control_vars.$forward_propagate_from_negations$.rebind(_prev_bind_5, thread);
                control_vars.$filter_deductions_for_trivially_derivable_gafs$.rebind(_prev_bind_4, thread);
                kb_control_vars.$forward_inference_time_cutoff$.rebind(_prev_bind_3, thread);
                control_vars.$forward_inference_removal_cost_cutoff$.rebind(_prev_bind_2, thread);
                control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 42300L)
    public static SubLObject hypothesize_spec_mt(SubLObject mt, SubLObject name_prefix) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $str1$HYP;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : mt;
        SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
        SubLObject sentence = conses_high.subst(monad_mt, $MT, $hypothesize_spec_mt_sentence$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        SubLObject hyp_mt = NIL;
        SubLObject hyp_hlmt = NIL;
        SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            SubLObject v_bindings = fi_hypothesize_int(sentence, mt_vars.$mt_mt$.getGlobalValue(), name_prefix, UNPROVIDED);
            if (NIL != v_bindings) {
                hyp_mt = bindings.apply_bindings(v_bindings, $sym68$_SPEC_MT);
                if (NIL != hyp_mt) {
                    hyp_hlmt = hlmt.replace_monad_dimension(mt, hyp_mt);
                    cyc_kernel.cyc_assert_wff(list($$highlyRelevantMt, hyp_hlmt), hyp_hlmt, UNPROVIDED);
                }
            }
        } finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return hyp_hlmt;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 43000L)
    public static SubLObject hypothetical_constant(SubLObject v_object) {
        return makeBoolean(isConstSym(v_object) && NIL != string_utilities.starts_with(constants_high.constant_name(v_object), $str70$HYP_));
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 43200L)
    public static SubLObject construct_non_wff_conflict_supports(SubLObject sentence, SubLObject mt, SubLObject generic_var_map) {
        if (generic_var_map == UNPROVIDED) {
            generic_var_map = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_non_wff_conflict_supports_explain_methodP$.getDynamicValue(thread)) {
            SubLObject hyp_terms = cycl_utilities.expression_gather(sentence, $sym71$HYPOTHETICAL_CONSTANT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject hyp_assertions = NIL;
            SubLObject cdolist_list_var = hyp_terms;
            SubLObject hyp_term = NIL;
            hyp_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$24 = list_utilities.remove_if_not($sym72$ASSERTED_ASSERTION_, virtual_indexing.assertions_mentioning_terms(list(hyp_term), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject hyp_ass = NIL;
                hyp_ass = cdolist_list_var_$24.first();
                while (NIL != cdolist_list_var_$24) {
                    SubLObject item_var = hyp_ass;
                    if (NIL == conses_high.member(item_var, hyp_assertions, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                        hyp_assertions = cons(item_var, hyp_assertions);
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
            while (NIL != cdolist_list_var2) {
                SubLObject el_formula = bindings.apply_bindings_backwards(generic_var_map, uncanonicalizer.assertion_el_formula(hyp_ass2));
                if (NIL == cycl_utilities.expression_find_if($sym73$HYPOTHETICAL_TERM_P, el_formula, UNPROVIDED, UNPROVIDED) && NIL == cycl_utilities.expression_find($$hypotheticalTerm, el_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    result = cons(el_formula, result);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                hyp_ass2 = cdolist_list_var2.first();
            }
            result = el_utilities.make_conjunction(result);
            result = el_utilities.make_implication(result, bindings.apply_bindings_backwards(generic_var_map, el_utilities.make_negation(sentence)));
            result = arguments.make_hl_support($QUERY, result, Sort.sort(genl_mts.asserted_genl_mts(mt, UNPROVIDED), $sym75$GENERALITY_ESTIMATE_, UNPROVIDED).first(), UNPROVIDED);
            return list(result);
        }
        SubLObject supports = flatten_explain_hl_why_not_wff(wff.hl_explain_why_not_wff(sentence, mt, UNPROVIDED));
        if (!supports.isList()) {
            supports = NIL;
        }
        if (supports.isCons() && supports.first().eql($$and)) {
            supports = supports.rest();
        }
        if (NIL != supports) {
            supports = Sequences.delete(NIL, Mapping.mapcar(Symbols.symbol_function($sym76$CONVERT_TO_HL_SUPPORT), supports), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == supports) {
            supports = list(arguments.make_hl_support($OPAQUE, sentence, mt, UNPROVIDED));
        }
        return supports;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 44900L)
    public static SubLObject flatten_explain_hl_why_not_wff(SubLObject supports) {
        SubLObject v_answer = flatten_explain_hl_why_not_wff_recursive(supports, NIL);
        return Sequences.nreverse(v_answer);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 45100L)
    public static SubLObject flatten_explain_hl_why_not_wff_recursive(SubLObject sentence, SubLObject accumulator) {
        if (NIL != assertion_handles.assertion_p(sentence)) {
            SubLObject el_formula = uncanonicalizer.assertion_el_formula(sentence);
            if (NIL != list_utilities.tree_find_if($sym78$EPHEMERAL_TERM_, el_formula, UNPROVIDED)) {
                accumulator = cons(list($$ist, assertions_high.assertion_mt(sentence), el_formula), accumulator);
            } else {
                accumulator = cons(sentence, accumulator);
            }
        } else if (NIL != cycl_grammar.cycl_sentence_p(sentence)) {
            if (NIL != el_utilities.ist_sentence_p(sentence, UNPROVIDED)) {
                accumulator = cons(sentence, accumulator);
            } else {
                SubLObject cdolist_list_var;
                SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(sentence, $IGNORE);
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    accumulator = flatten_explain_hl_why_not_wff_recursive(v_term, accumulator);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
            }
        }
        return accumulator;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 45700L)
    public static SubLObject convert_to_hl_support(SubLObject v_object) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return v_object;
        }
        if (NIL != arguments.support_p(v_object)) {
            return v_object;
        }
        if (NIL == el_utilities.el_formula_p(v_object)) {
            return NIL;
        }
        if (NIL == el_utilities.ist_sentence_p(v_object, UNPROVIDED)) {
            return NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.formula_args(v_object, UNPROVIDED);
        SubLObject mt = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list81);
        current = current.rest();
        SubLObject sentence = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list81);
        current = current.rest();
        if (NIL == current) {
            return convert_ist_formula_to_hl_support(sentence, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list81);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 46000L)
    public static SubLObject convert_ist_formula_to_hl_support(SubLObject sentence, SubLObject mt) {
        SubLObject pcase_var = el_utilities.literal_predicate(sentence, UNPROVIDED);
        if (pcase_var.eql($$isa)) {
            return arguments.make_hl_support($ISA, sentence, mt, UNPROVIDED);
        }
        if (pcase_var.eql($$genls)) {
            return arguments.make_hl_support($GENLS, sentence, mt, UNPROVIDED);
        }
        if (pcase_var.eql($$genlPreds) || pcase_var.eql($$genlInverse)) {
            return arguments.make_hl_support($GENLPREDS, sentence, mt, UNPROVIDED);
        }
        if (pcase_var.eql($$evaluate)) {
            return arguments.make_hl_support($EVAL, sentence, mt, UNPROVIDED);
        }
        return arguments.make_hl_support($OPAQUE, sentence, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 46500L)
    public static SubLObject note_non_wff_conflict(SubLObject sentence, SubLObject mt, SubLObject generic_var_map) {
        if (generic_var_map == UNPROVIDED) {
            generic_var_map = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != control_vars.$record_inconsistent_support_sets$.getDynamicValue(thread)) {
            SubLObject supports = construct_non_wff_conflict_supports(sentence, mt, generic_var_map);
            conflicts.add_inconsistent_support_set(supports);
            $conflicting_support_sets$.setDynamicValue(cons(supports, $conflicting_support_sets$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static SubLObject declare_prove_file() {
        declareFunction("prove_justified", "PROVE-JUSTIFIED", 1, 5, false);
        declareFunction("fi_hypothesize", "FI-HYPOTHESIZE", 2, 2, false);
        declareFunction("fi_hypothesize_int", "FI-HYPOTHESIZE-INT", 2, 2, false);
        declareFunction("hypothesize_terms", "HYPOTHESIZE-TERMS", 2, 2, false);
        declareFunction("hypothesize_terms_for_antecedent", "HYPOTHESIZE-TERMS-FOR-ANTECEDENT", 6, 0, false);
        declareFunction("hypothesize_terms_for_consequent", "HYPOTHESIZE-TERMS-FOR-CONSEQUENT", 4, 0, false);
        declareFunction("hypothesize_terms_int", "HYPOTHESIZE-TERMS-INT", 8, 0, false);
        declareFunction("hypothesize_terms_int_2", "HYPOTHESIZE-TERMS-INT-2", 8, 0, false);
        declareFunction("hypothesize_terms_for_variables", "HYPOTHESIZE-TERMS-FOR-VARIABLES", 10, 0, false);
        declareFunction("assert_within_hypothetical", "ASSERT-WITHIN-HYPOTHETICAL", 3, 1, false);
        declareFunction("assert_hypothetical_term_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("assert_hypothetical_term_quoted_isa_constraints", "ASSERT-HYPOTHETICAL-TERM-QUOTED-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction("assert_hypothetical_term_genl_constraints", "ASSERT-HYPOTHETICAL-TERM-GENL-CONSTRAINTS", 4, 0, false);
        declareFunction("assert_hypothetical_term_content_gafs", "ASSERT-HYPOTHETICAL-TERM-CONTENT-GAFS", 3, 0, false);
        declareFunction("assert_hypothetical_term_rules", "ASSERT-HYPOTHETICAL-TERM-RULES", 4, 0, false);
        declareFunction("create_hypothesized_constant", "CREATE-HYPOTHESIZED-CONSTANT", 3, 0, false);
        declareFunction("assert_that_term_is_hypothetical", "ASSERT-THAT-TERM-IS-HYPOTHETICAL", 2, 0, false);
        declareFunction("hypothesize_dnf_equality_constraints", "HYPOTHESIZE-DNF-EQUALITY-CONSTRAINTS", 2, 0, false);
        declareFunction("hypothesize_dnf_isa_constraints", "HYPOTHESIZE-DNF-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("hypothesize_dnf_quoted_isa_constraints", "HYPOTHESIZE-DNF-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("hypothesize_dnf_genl_constraints", "HYPOTHESIZE-DNF-GENL-CONSTRAINTS", 2, 0, false);
        declareFunction("antecedent_dnf_variables_isa_constraints", "ANTECEDENT-DNF-VARIABLES-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("antecedent_dnf_variables_quoted_isa_constraints", "ANTECEDENT-DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction("antecedent_dnf_variables_genl_constraints", "ANTECEDENT-DNF-VARIABLES-GENL-CONSTRAINTS", 2, 0, false);
        declareFunction("suggest_string_from_fort_el_formula", "SUGGEST-STRING-FROM-FORT-EL-FORMULA", 1, 0, false);
        declareFunction("fi_prove", "FI-PROVE", 2, 4, false);
        declareFunction("fi_prove_int", "FI-PROVE-INT", 2, 4, false);
        declareFunction("fi_prove_int_new_cyc_query_trampoline", "FI-PROVE-INT-NEW-CYC-QUERY-TRAMPOLINE", 2, 4, false);
        declareFunction("prove_from", "PROVE-FROM", 3, 4, false);
        declareFunction("prove_from_forward_time", "PROVE-FROM-FORWARD-TIME", 1, 0, false);
        declareFunction("prove_from_backward_time", "PROVE-FROM-BACKWARD-TIME", 1, 0, false);
        declareFunction("new_prepare_for_proof", "NEW-PREPARE-FOR-PROOF", 3, 0, false);
        declareFunction("prepare_for_proof", "PREPARE-FOR-PROOF", 4, 0, false);
        declareFunction("prepare_assumption_mt", "PREPARE-ASSUMPTION-MT", 1, 0, false);
        declareFunction("prepare_query_mt", "PREPARE-QUERY-MT", 2, 0, false);
        declareFunction("prepare_hypothesis_mt", "PREPARE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction("find_or_create_hypothesis_mt", "FIND-OR-CREATE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction("find_hypothesis_mt", "FIND-HYPOTHESIS-MT", 2, 0, false);
        declareFunction("valid_hypothesis_mt_infoP", "VALID-HYPOTHESIS-MT-INFO?", 2, 0, false);
        declareFunction("create_hypothesis_mt", "CREATE-HYPOTHESIS-MT", 2, 1, false);
        declareFunction("create_hypothesis_mt_int", "CREATE-HYPOTHESIS-MT-INT", 2, 1, false);
        declareFunction("note_hypothesis_mt_term_bindings", "NOTE-HYPOTHESIS-MT-TERM-BINDINGS", 2, 0, false);
        declareFunction("kill_cached_hypothesis_mt", "KILL-CACHED-HYPOTHESIS-MT", 1, 0, false);
        declareFunction("prepare_proof_mt", "PREPARE-PROOF-MT", 3, 0, false);
        declareFunction("find_or_create_proof_mt", "FIND-OR-CREATE-PROOF-MT", 3, 0, false);
        declareFunction("find_proof_mt", "FIND-PROOF-MT", 2, 0, false);
        declareFunction("create_proof_mt", "CREATE-PROOF-MT", 3, 0, false);
        declareFunction("create_proof_mt_int", "CREATE-PROOF-MT-INT", 3, 0, false);
        declareFunction("forward_propagate_proof_hypothesis_mt", "FORWARD-PROPAGATE-PROOF-HYPOTHESIS-MT", 2, 0, false);
        declareFunction("hypothesize_spec_mt", "HYPOTHESIZE-SPEC-MT", 1, 1, false);
        declareFunction("hypothetical_constant", "HYPOTHETICAL-CONSTANT", 1, 0, false);
        declareFunction("construct_non_wff_conflict_supports", "CONSTRUCT-NON-WFF-CONFLICT-SUPPORTS", 2, 1, false);
        declareFunction("flatten_explain_hl_why_not_wff", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF", 1, 0, false);
        declareFunction("flatten_explain_hl_why_not_wff_recursive", "FLATTEN-EXPLAIN-HL-WHY-NOT-WFF-RECURSIVE", 2, 0, false);
        declareFunction("convert_to_hl_support", "CONVERT-TO-HL-SUPPORT", 1, 0, false);
        declareFunction("convert_ist_formula_to_hl_support", "CONVERT-IST-FORMULA-TO-HL-SUPPORT", 2, 0, false);
        declareFunction("note_non_wff_conflict", "NOTE-NON-WFF-CONFLICT", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_prove_file() {
        $conflicting_support_sets$ = defparameter("*CONFLICTING-SUPPORT-SETS*", NIL);
        $something_asserted_within_hypothesize_termsP$ = SubLFiles.defparameter("*SOMETHING-ASSERTED-WITHIN-HYPOTHESIZE-TERMS?*", NIL);
        $fi_prove_new_cyc_query_trampoline_enabledP$ = SubLFiles.defparameter("*FI-PROVE-NEW-CYC-QUERY-TRAMPOLINE-ENABLED?*", NIL);
        $proof_hypothesis_forward_propagation_enabled$ = SubLFiles.defparameter("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-ENABLED*", NIL);
        $hypothesis_mt_table$ = deflexical("*HYPOTHESIS-MT-TABLE*", maybeDefault($sym56$_HYPOTHESIS_MT_TABLE_, $hypothesis_mt_table$, () -> (dictionary.new_dictionary(Symbols.symbol_function(EQUAL), ZERO_INTEGER))));
        $proof_assume_consequent_type_constraintsP$ = defvar("*PROOF-ASSUME-CONSEQUENT-TYPE-CONSTRAINTS?*", T);
        $proof_mt_table$ = deflexical("*PROOF-MT-TABLE*", maybeDefault($sym63$_PROOF_MT_TABLE_, $proof_mt_table$, () -> (dictionary.new_dictionary(Symbols.symbol_function(EQUAL), ZERO_INTEGER))));
        $proof_hypothesis_forward_absolute_time_cutoff$ = SubLFiles.defvar("*PROOF-HYPOTHESIS-FORWARD-ABSOLUTE-TIME-CUTOFF*", $int$120);
        $proof_hypothesis_forward_time_cutoff$ = defvar("*PROOF-HYPOTHESIS-FORWARD-TIME-CUTOFF*", FIVE_INTEGER);
        $proof_hypothesis_forward_removal_cost_cutoff$ = SubLFiles.defvar("*PROOF-HYPOTHESIS-FORWARD-REMOVAL-COST-CUTOFF*", TWENTY_INTEGER);
        $proof_hypothesis_forward_propagation_depth$ = defvar("*PROOF-HYPOTHESIS-FORWARD-PROPAGATION-DEPTH*", ONE_INTEGER);
        $hypothesize_spec_mt_sentence$ = defparameter("*HYPOTHESIZE-SPEC-MT-SENTENCE*", $list66);
        $use_new_non_wff_conflict_supports_explain_methodP$ = SubLFiles.defparameter("*USE-NEW-NON-WFF-CONFLICT-SUPPORTS-EXPLAIN-METHOD?*", T);
        return NIL;
    }

    public static SubLObject setup_prove_file() {
        utilities_macros.register_cyc_api_function($sym3$FI_HYPOTHESIZE, $list4, $str5$Cyc_attempts_to_check_if_SENTENCE, NIL, $list6);
        utilities_macros.register_cyc_api_function($sym44$FI_PROVE, $list45, $str46$Attempts_to_prove_SENTENCE_is_tru, NIL, $list47);
        subl_macro_promotions.declare_defglobal($sym56$_HYPOTHESIS_MT_TABLE_);
        access_macros.define_obsolete_register($sym61$KILL_CACHED_HYPOTHESIS_MT, NIL);
        subl_macro_promotions.declare_defglobal($sym63$_PROOF_MT_TABLE_);
        generic_testing.define_test_case_table_int($sym89$FI_PROVE_INT, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list96);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_prove_file();
    }

    @Override
    public void initializeVariables() {
        init_prove_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_prove_file();
    }

    static {
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
        $sym0$INFERENCE_RETURN_BLISTS_AND_SUPPORTS = makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS");
        $str1$HYP = makeString("HYP");
        $HYPOTHESIZE = makeKeyword("HYPOTHESIZE");
        $sym3$FI_HYPOTHESIZE = makeSymbol("FI-HYPOTHESIZE");
        $list4 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NAME-PREFIX"), makeString("HYP")), makeSymbol("TERM-IDS"));
        $str5$Cyc_attempts_to_check_if_SENTENCE = makeString(
                "Cyc attempts to check if SENTENCE is satisfiable in MT by 'hypothesizing'\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\nand asserting the new sentence in MT.  If this would trigger a \ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\nconstant pairs is returned, indicating the constants which were \nsuccessfully 'hypothesized'.  The form ((T . T)) is returned if no new terms\nrequired creation for the assertion of SENTENCE.\nNAME-PREFIX is a string which is used as a prefix for the name of each new\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\nthat the specified id should be used when generating the constant for the variable\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\nconstants.");
        $list6 = list(list(makeSymbol("NIL-OR"), makeSymbol("LISTP")));
        $ARG_ERROR = makeKeyword("ARG-ERROR");
        $str8$Expected_a_cons__got__S = makeString("Expected a cons, got ~S");
        $str9$Expected_a_string__got__S = makeString("Expected a string, got ~S");
        $$and = makeConstSym(("and"));
        $str11$ = makeString("");
        $$False = makeConstSym(("False"));
        $$True = makeConstSym(("True"));
        $CONFLICT = makeKeyword("CONFLICT");
        $sym15$CONFLICT_HANDLER = makeSymbol("CONFLICT-HANDLER");
        $list16 = listS(makeSymbol("VARIABLE"), makeSymbol("NEW-TERM-NAME"), makeSymbol("ISA-CONSTRAINTS"));
        $sym17$QUOTED_COLLECTION_ = makeSymbol("QUOTED-COLLECTION?");
        $$CycLConstant = makeConstSym(("CycLConstant"));
        $list19 = cons(makeSymbol("VARIABLE2"), makeSymbol("GENL-CONSTRAINTS"));
        $str20$Constraint_variable_mismatch_erro = makeString("Constraint variable mismatch error in hypothesis: ~a != ~a");
        $list21 = cons(makeSymbol("VARIABLE3"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));
        $sym22$ANECT_ = makeSymbol("ANECT?");
        $$equalSymbols = makeConstSym(("equalSymbols"));
        $$isa = makeConstSym(("isa"));
        $$UniversalVocabularyMt = makeConstSym(("UniversalVocabularyMt"));
        $$quotedIsa = makeConstSym(("quotedIsa"));
        $$genls = makeConstSym(("genls"));
        $sym28$STRINGP = makeSymbol("STRINGP");
        $str29$_A__A__A = makeString("~A-~A-~A");
        $$definingMt = makeConstSym(("definingMt"));
        $list31 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"));
        $$hypotheticalTerm = makeConstSym(("hypotheticalTerm"));
        $list33 = cons(makeSymbol("VARIABLE"), makeSymbol("ISA-CONSTRAINTS"));
        $$CycLReifiableDenotationalTerm = makeConstSym(("CycLReifiableDenotationalTerm"));
        $sym35$_ = makeSymbol("<");
        $sym36$SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");
        $str37$Term = makeString("Term");
        $list38 = cons(makeSymbol("VARIABLE"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));
        $list39 = cons(makeSymbol("VARIABLE"), makeSymbol("GENL-CONSTRAINTS"));
        $sym40$FORT_P = makeSymbol("FORT-P");
        $sym41$CONSTANT_NAME = makeSymbol("CONSTANT-NAME");
        $sym42$CONSTANT_P = makeSymbol("CONSTANT-P");
        $PROVE = makeKeyword("PROVE");
        $sym44$FI_PROVE = makeSymbol("FI-PROVE");
        $list45 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));
        $str46$Attempts_to_prove_SENTENCE_is_tru = makeString(
                "Attempts to prove SENTENCE is true in MT under the given resource constraints.\n   BACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\n   SENTENCE is interpreted as follows:\n   If SENTENCE is of the form (#$implies [antecedant] [consequent]) then\n   (1) free variables in [antecedant] are assumed to be universally quantified\n   (2) remaining variables in [consequent] are assumed to be existentially quantified.\n   Otherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\n   It returns NIL or a list of arguments as described for FI-JUSTIFY.");
        $list47 = ConsesLow.list(list(makeSymbol("NIL-OR"), list(makeSymbol("LIST"), makeSymbol("LISTP"))));
        $list48 = list(makeSymbol("IST"), makeSymbol("IST-MT"), makeSymbol("IST-SENTENCE"));
        $str49$Expected_an_integer__got__S = makeString("Expected an integer, got ~S");
        $$implies = makeConstSym(("implies"));
        $CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
        $TAUTOLOGY = makeKeyword("TAUTOLOGY");
        $$Always_TimeInterval = makeConstSym(("Always-TimeInterval"));
        $$TimePoint = makeConstSym(("TimePoint"));
        $$AnytimePSC = makeConstSym(("AnytimePSC"));
        $sym56$_HYPOTHESIS_MT_TABLE_ = makeSymbol("*HYPOTHESIS-MT-TABLE*");
        $list57 = list(makeSymbol("HYPOTHESIS-MT"), makeSymbol("TERM-BINDINGS"));
        $$HypotheticalContext = makeConstSym(("HypotheticalContext"));
        $str59$Hypothesis = makeString("Hypothesis");
        $sym60$HLMT_P = makeSymbol("HLMT-P");
        $sym61$KILL_CACHED_HYPOTHESIS_MT = makeSymbol("KILL-CACHED-HYPOTHESIS-MT");
        $list62 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
        $sym63$_PROOF_MT_TABLE_ = makeSymbol("*PROOF-MT-TABLE*");
        $str64$Proof = makeString("Proof");
        $int$120 = makeInteger(120);
        $list66 = list(makeConstSym(("and")), list(makeConstSym(("isa")), makeSymbol("?SPEC-MT"), makeConstSym(("HypotheticalContext"))), list(makeConstSym(("genlMt")), makeSymbol("?SPEC-MT"), makeKeyword("MT")), list(makeConstSym(("termDependsOn")), makeSymbol("?SPEC-MT"), makeKeyword("MT")),
                list(makeConstSym(("ephemeralTerm")), makeSymbol("?SPEC-MT")));
        $MT = makeKeyword("MT");
        $sym68$_SPEC_MT = makeSymbol("?SPEC-MT");
        $$highlyRelevantMt = makeConstSym(("highlyRelevantMt"));
        $str70$HYP_ = makeString("HYP-");
        $sym71$HYPOTHETICAL_CONSTANT = makeSymbol("HYPOTHETICAL-CONSTANT");
        $sym72$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");
        $sym73$HYPOTHETICAL_TERM_P = makeSymbol("HYPOTHETICAL-TERM-P");
        $QUERY = makeKeyword("QUERY");
        $sym75$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");
        $sym76$CONVERT_TO_HL_SUPPORT = makeSymbol("CONVERT-TO-HL-SUPPORT");
        $OPAQUE = makeKeyword("OPAQUE");
        $sym78$EPHEMERAL_TERM_ = makeSymbol("EPHEMERAL-TERM?");
        $$ist = makeConstSym(("ist"));
        $IGNORE = makeKeyword("IGNORE");
        $list81 = list(makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("SENTENCE"));
        $ISA = makeKeyword("ISA");
        $GENLS = makeKeyword("GENLS");
        $$genlPreds = makeConstSym(("genlPreds"));
        $$genlInverse = makeConstSym(("genlInverse"));
        $GENLPREDS = makeKeyword("GENLPREDS");
        $$evaluate = makeConstSym(("evaluate"));
        $EVAL = makeKeyword("EVAL");
        $sym89$FI_PROVE_INT = makeSymbol("FI-PROVE-INT");
        $TEST = makeKeyword("TEST");
        $OWNER = makeKeyword("OWNER");
        $CLASSES = makeKeyword("CLASSES");
        $KB = makeKeyword("KB");
        $TINY = makeKeyword("TINY");
        $WORKING_ = makeKeyword("WORKING?");
        $list96 = ConsesLow.list(new SubLObject[] { list(list(list(makeConstSym(("isa")), makeInteger(212), makeConstSym(("Integer"))), makeConstSym(("BaseKB"))), list(NIL), makeKeyword("EXHAUST-TOTAL")),
                list(list(list(makeConstSym(("implies")), makeConstSym(("True")), list(makeConstSym(("isa")), makeInteger(212), makeConstSym(("Integer")))), makeConstSym(("BaseKB"))), list(NIL), makeKeyword("EXHAUST-TOTAL")),
                list(list(list(makeConstSym(("implies")), makeConstSym(("False")), list(makeConstSym(("isa")), makeInteger(212), makeConstSym(("Integer")))), makeConstSym(("BaseKB"))), list(NIL), makeKeyword("TAUTOLOGY")),
                list(list(list(makeConstSym(("implies")), list(makeConstSym(("isa")), makeInteger(212), makeConstSym(("Integer"))), makeConstSym(("True"))), makeConstSym(("BaseKB"))), list(NIL), makeKeyword("TAUTOLOGY")),
                list(list(list(makeConstSym(("implies")), list(makeConstSym(("isa")), makeInteger(212), makeConstSym(("Integer"))), makeConstSym(("False"))), makeConstSym(("BaseKB"))), NIL, makeKeyword("CONTRADICTION")),
                list(list(list(makeConstSym(("implies")), list(makeConstSym(("and"))), list(makeConstSym(("isa")), makeInteger(212), makeConstSym(("Integer")))), makeConstSym(("BaseKB"))), list(NIL), makeKeyword("EXHAUST-TOTAL")),
                list(list(ConsesLow.list(makeConstSym(("implies")), list(makeConstSym(("or"))), list(makeConstSym(("isa")), makeInteger(212), makeConstSym(("Integer")))), makeConstSym(("BaseKB"))), list(NIL), makeKeyword("TAUTOLOGY")),
                list(list(list(makeConstSym(("implies")), list(makeConstSym(("isa")), makeInteger(212), makeConstSym(("Integer"))), list(makeConstSym(("and")))), makeConstSym(("BaseKB"))), list(NIL), makeKeyword("TAUTOLOGY")),
                list(list(list(makeConstSym(("implies")), list(makeConstSym(("isa")), makeInteger(212), makeConstSym(("Integer"))), list(makeConstSym(("or")))), makeConstSym(("BaseKB"))), NIL, makeKeyword("CONTRADICTION")) });
    }
}
/*
 *
 * Total time: 380 ms
 *
 */