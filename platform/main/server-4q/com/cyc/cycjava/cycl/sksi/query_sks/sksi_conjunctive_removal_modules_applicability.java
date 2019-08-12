/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.query_sks;


import static com.cyc.cycjava.cycl.clause_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.hlmt.*;
import static com.cyc.cycjava.cycl.keyhash_utilities.*;
import static com.cyc.cycjava.cycl.memoization_state.*;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_interpretation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-CONJUNCTIVE-REMOVAL-MODULES-APPLICABILITY
 * source file: /cyc/top/cycl/sksi/query-sks/sksi-conjunctive-removal-modules-applicability.lisp
 * created:     2019/07/03 17:38:33
 */
public final class sksi_conjunctive_removal_modules_applicability extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_conjunctive_removal_modules_applicability();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sksi_crm_ignore_subsumed_subclause_specsP$ = makeSymbol("*SKSI-CRM-IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sksi_crm_applicability_max_time_enabledP$ = makeSymbol("*SKSI-CRM-APPLICABILITY-MAX-TIME-ENABLED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sksi_crm_applicability_max_time_override$ = makeSymbol("*SKSI-CRM-APPLICABILITY-MAX-TIME-OVERRIDE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sksi_crm_applicability_start_time$ = makeSymbol("*SKSI-CRM-APPLICABILITY-START-TIME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sksi_crm_gathered_pos_subclause_specs$ = makeSymbol("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sksi_crm_rejected_pos_subclause_specs$ = makeSymbol("*SKSI-CRM-REJECTED-POS-SUBCLAUSE-SPECS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sksi_crm_gather_literals_using_iterative_methodP$ = makeSymbol("*SKSI-CRM-GATHER-LITERALS-USING-ITERATIVE-METHOD?*");

    // defparameter
    /**
     * Finish when the first applicability is found. Will prevent doing extra work
     * to find more applicable subsets, but is much faster.
     */
    @LispMethod(comment = "Finish when the first applicability is found. Will prevent doing extra work\r\nto find more applicable subsets, but is much faster.\ndefparameter\nFinish when the first applicability is found. Will prevent doing extra work\nto find more applicable subsets, but is much faster.")
    private static final SubLSymbol $sksi_crm_gather_literals_iterative_method_return_first_successP$ = makeSymbol("*SKSI-CRM-GATHER-LITERALS-ITERATIVE-METHOD-RETURN-FIRST-SUCCESS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sksi_crm_gather_literals_stop_if_total_subclause_specs_fails_enumerability_optimizationP$ = makeSymbol("*SKSI-CRM-GATHER-LITERALS-STOP-IF-TOTAL-SUBCLAUSE-SPECS-FAILS-ENUMERABILITY-OPTIMIZATION?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$ = makeSymbol("*SKSI-CRM-GATHER-LITERALS-SUBCLAUSE-SPECS-FAILED-DUE-TO-ENUMERABILITY?*");

    private static final SubLSymbol $SKSI_CRM_APPLICABILITY_MAX_TIME = makeKeyword("SKSI-CRM-APPLICABILITY-MAX-TIME");

    private static final SubLString $str1$SKSI_conjunctive_removal_was_appl = makeString("SKSI conjunctive removal was applicable to problem ");

    private static final SubLString $str3$_but_was_lacking_this___sksiUnkno = makeString(" but was lacking this #$sksiUnknownSentence literal: ");

    private static final SubLSymbol NEW_POS_SUBCLAUSE_SPEC = makeSymbol("NEW-POS-SUBCLAUSE-SPEC");

    private static final SubLList $list5 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    private static final SubLObject $$RDFTripleStore_Physical = reader_make_constant_shell("RDFTripleStore-Physical");

    private static final SubLSymbol SKSI_SUPPORTED_FUNCTION_P = makeSymbol("SKSI-SUPPORTED-FUNCTION-P");

    private static final SubLSymbol SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS = makeSymbol("SKSI-CRM-FULLY-FORBIDDEN-COMPARISON-OPERATORS");

    static private final SubLList $list9 = list(list(makeSymbol("RESULT-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list11 = list(list(makeSymbol("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*"), NIL), list(makeSymbol("*SKSI-CRM-REJECTED-POS-SUBCLAUSE-SPECS*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUAL))));

    private static final SubLList $list13 = list(list(makeSymbol("FIF"), makeSymbol("*SKSI-CRM-IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*"), list(makeSymbol("DELETE-SUBSUMED-ITEMS"), makeSymbol("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*"), list(QUOTE, makeSymbol("SUPERSETP"))), makeSymbol("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*")));

    private static final SubLSymbol NCANONICALIZE_LITERAL_INDICES = makeSymbol("NCANONICALIZE-LITERAL-INDICES");

    private static final SubLSymbol SUPERSETP = makeSymbol("SUPERSETP");

    private static final SubLSymbol $sym17$POS_SUBCLAUSE_SPEC__ = makeSymbol("POS-SUBCLAUSE-SPEC->");

    private static final SubLSymbol $sym18$_ = makeSymbol("=");

    private static final SubLList $list19 = list(makeSymbol("MT"), makeSymbol("LIT"));

    private static final SubLString $str23$__SKSI__A_ = makeString("~&SKSI-~A ");

    private static final SubLString $str24$Could_not_form_a_CSQL_query_with_ = makeString("Could not form a CSQL query with:~%  Meaning sentence GAFs: ~a~%  Literals: ~a~% for the reason: ~a");

    private static final SubLObject $$Database_Physical = reader_make_constant_shell("Database-Physical");

    private static final SubLString $str27$Could_not_form_a_SQL_query_with__ = makeString("Could not form a SQL query with:~%  Meaning sentence GAFs: ~a~%  Literals: ~a~% for the reason: ~a");

    private static final SubLSymbol $sym28$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list31 = list(NIL);

    private static final SubLSymbol LOGICAL_FIELD_INDEXICAL_P = makeSymbol("LOGICAL-FIELD-INDEXICAL-P");

    private static final SubLSymbol CONTEXTUALIZED_LITERAL_HL_VARIABLES = makeSymbol("CONTEXTUALIZED-LITERAL-HL-VARIABLES");



    private static final SubLSymbol $sym38$SKSI_CRM_ANY_FULLY_BOUND_ARG_ = makeSymbol("SKSI-CRM-ANY-FULLY-BOUND-ARG?");

    private static final SubLSymbol CONTEXTUALIZED_ASENT_ASENT = makeSymbol("CONTEXTUALIZED-ASENT-ASENT");

    private static final SubLSymbol LOGICAL_SCHEMA_PHYSICAL_SCHEMATA = makeSymbol("LOGICAL-SCHEMA-PHYSICAL-SCHEMATA");

    private static final SubLSymbol COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL = makeSymbol("COLLECT-PHYSICAL-SCHEMATA-FROM-LOGICAL-FIELD-INDEXICAL");



    private static final SubLSymbol $sym45$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLSymbol $sym46$HL_VAR_ = makeSymbol("HL-VAR?");

    public static final SubLObject removal_sksi_conjunction_pos_lits_applicability_alt(SubLObject contextualized_dnf_clause, SubLObject sks_profile) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subclause_specs = NIL;
                {
                    SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.currentBinding(thread);
                    try {
                        sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.bind(T, thread);
                        if (NIL != sksi_infrastructure_utilities.external_source_activated_in_imageP(sksi_query_datastructures.sks_profile_sks(sks_profile))) {
                            {
                                SubLObject mt_var = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
                                {
                                    SubLObject _prev_bind_0_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject candidate_lit_nums = com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_get_subclause_candidates(contextualized_dnf_clause, sks_profile);
                                            SubLObject meaning_sentence_gaf_iterators = thread.secondMultipleValue();
                                            SubLObject comparison_lit_nums = thread.thirdMultipleValue();
                                            SubLObject evaluate_lit_nums = thread.fourthMultipleValue();
                                            SubLObject sksi_unknown_sentence_lit_nums = thread.fifthMultipleValue();
                                            thread.resetMultipleValues();
                                            if ((NIL != candidate_lit_nums) && ((((NIL != list_utilities.lengthGE(candidate_lit_nums, sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.getDynamicValue(thread), UNPROVIDED)) || (NIL != comparison_lit_nums)) || (NIL != evaluate_lit_nums)) || (NIL != sksi_unknown_sentence_lit_nums))) {
                                                {
                                                    SubLObject pos_subclause_specs = com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_gather_literals(candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                                                    if ((NIL != pos_subclause_specs) && (NIL == sksi_debugging.sksi_ignore_errorsP())) {
                                                        {
                                                            SubLObject cdolist_list_var = sksi_unknown_sentence_lit_nums;
                                                            SubLObject lit_num = NIL;
                                                            for (lit_num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit_num = cdolist_list_var.first()) {
                                                                if (NIL == list_utilities.member_eqP(lit_num, pos_subclause_specs.first())) {
                                                                    {
                                                                        SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(nth(lit_num, clauses.pos_lits(contextualized_dnf_clause)));
                                                                        if (NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p(asent)) {
                                                                            sksi_debugging.sksi_error(cconcatenate($str_alt0$SKSI_conjunctive_removal_was_appl, new SubLObject[]{ format_nil.format_nil_a_no_copy(NIL != inference_worker.currently_active_problem() ? ((SubLObject) (inference_datastructures_problem.problem_suid(inference_worker.currently_active_problem()))) : $UNKNOWN), $str_alt2$_but_was_lacking_this___sksiUnkno, format_nil.format_nil_a_no_copy(asent) }));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    subclause_specs = Mapping.mapcar(NEW_POS_SUBCLAUSE_SPEC, pos_subclause_specs);
                                                }
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.rebind(_prev_bind_0, thread);
                    }
                }
                return subclause_specs;
            }
        }
    }

    public static SubLObject removal_sksi_conjunction_pos_lits_applicability(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        SubLObject subclause_specs = NIL;
        if (NIL != sksi_crm_profile_relevantP(sks_profile, contextualized_dnf_clause)) {
            subclause_specs = removal_sksi_conjunction_pos_lits_applicability_int(contextualized_dnf_clause, sks_profile);
        }
        SubLObject good_subclause_specs = NIL;
        SubLObject cdolist_list_var = subclause_specs;
        SubLObject subclause_spec = NIL;
        subclause_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!sksi_conjunctive_removal_modules_cost.removal_sksi_conjunction_pos_lits_cost(clause_utilities.subclause_specified_by_spec(contextualized_dnf_clause, subclause_spec), sks_profile).isZero()) {
                good_subclause_specs = cons(subclause_spec, good_subclause_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subclause_spec = cdolist_list_var.first();
        } 
        return nreverse(good_subclause_specs);
    }

    public static SubLObject removal_sksi_conjunction_pos_lits_applicability_int(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = NIL;
        SubLObject max_time_cutoff_reached = NIL;
        final SubLObject time = NIL;
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $sksi_crm_applicability_start_time$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.bind(T, thread);
            $sksi_crm_applicability_start_time$.bind(get_universal_time(), thread);
            try {
                thread.throwStack.push($SKSI_CRM_APPLICABILITY_MAX_TIME);
                final SubLObject mt_var = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject candidate_lit_nums = sksi_crm_get_subclause_candidates(contextualized_dnf_clause, sks_profile);
                    final SubLObject meaning_sentence_gaf_iterators = thread.secondMultipleValue();
                    final SubLObject comparison_lit_nums = thread.thirdMultipleValue();
                    final SubLObject evaluate_lit_nums = thread.fourthMultipleValue();
                    final SubLObject sksi_unknown_sentence_lit_nums = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != candidate_lit_nums) && ((((NIL != list_utilities.lengthGE(candidate_lit_nums, sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.getDynamicValue(thread), UNPROVIDED)) || (NIL != comparison_lit_nums)) || (NIL != evaluate_lit_nums)) || (NIL != sksi_unknown_sentence_lit_nums))) {
                        final SubLObject pos_subclause_specs = sksi_crm_gather_literals(candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                        if ((NIL != pos_subclause_specs) && (NIL == sksi_debugging.sksi_ignore_errorsP())) {
                            SubLObject cdolist_list_var = sksi_unknown_sentence_lit_nums;
                            SubLObject lit_num = NIL;
                            lit_num = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if (NIL == list_utilities.member_eqP(lit_num, pos_subclause_specs.first())) {
                                    final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(nth(lit_num, clauses.pos_lits(contextualized_dnf_clause)));
                                    if (NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p(asent)) {
                                        sksi_debugging.sksi_error(cconcatenate($str1$SKSI_conjunctive_removal_was_appl, new SubLObject[]{ format_nil.format_nil_a_no_copy(NIL != inference_worker.currently_active_problem() ? inference_datastructures_problem.problem_suid(inference_worker.currently_active_problem()) : $UNKNOWN), $str3$_but_was_lacking_this___sksiUnkno, format_nil.format_nil_a_no_copy(asent) }));
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                lit_num = cdolist_list_var.first();
                            } 
                        }
                        subclause_specs = Mapping.mapcar(NEW_POS_SUBCLAUSE_SPEC, pos_subclause_specs);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                max_time_cutoff_reached = Errors.handleThrowable(ccatch_env_var, $SKSI_CRM_APPLICABILITY_MAX_TIME);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != max_time_cutoff_reached) {
            }
        } finally {
            $sksi_crm_applicability_start_time$.rebind(_prev_bind_2, thread);
            sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.rebind(_prev_bind_0, thread);
        }
        return subclause_specs;
    }

    public static SubLObject sksi_crm_profile_relevantP(final SubLObject sks_profile, final SubLObject contextualized_dnf_clause) {
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        return sksi_crm_sks_relevantP(sks, contextualized_dnf_clause);
    }

    public static SubLObject sksi_crm_sks_relevantP(final SubLObject sks, final SubLObject contextualized_dnf_clause) {
        if (NIL != sksi_infrastructure_utilities.external_source_activated_in_imageP(sks)) {
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(sks);
            SubLObject relevantP = NIL;
            SubLObject count = ZERO_INTEGER;
            SubLObject rest;
            SubLObject lit;
            SubLObject current;
            SubLObject datum;
            SubLObject mt;
            SubLObject asent;
            for (rest = NIL, rest = clauses.pos_lits(contextualized_dnf_clause); (NIL == relevantP) && (NIL != rest); rest = rest.rest()) {
                lit = rest.first();
                datum = current = lit;
                mt = NIL;
                asent = NIL;
                destructuring_bind_must_consp(current, datum, $list5);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list5);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != hlmt.hlmt_equalP(mt, content_mt)) || (NIL != sksi_infrastructure_utilities.mt_relevant_to_mt_memoizedP(mt, content_mt, UNPROVIDED))) {
                        count = add(count, ONE_INTEGER);
                    }
                    if (count.numGE(TWO_INTEGER)) {
                        relevantP = T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list5);
                }
            }
            if (NIL != relevantP) {
                final SubLObject parent_sks = sksi_crm_genl_ks(sks);
                return makeBoolean((NIL == parent_sks) || (NIL == sksi_crm_sks_relevantP(parent_sks, contextualized_dnf_clause)));
            }
        }
        return NIL;
    }

    public static SubLObject sksi_crm_genl_ks(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject genl_ks = NIL;
        final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(sks);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            genl_ks = sksi_kb_accessors.immediate_genl_ks(sks);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return genl_ks;
    }

    /**
     * This returns a list of candidate lit nums, a meaning sentence GAF iterator for each
     * candidate lit num, and a list of comparison lit nums (disjoint from the list of
     * candidate lit nums).
     */
    @LispMethod(comment = "This returns a list of candidate lit nums, a meaning sentence GAF iterator for each\r\ncandidate lit num, and a list of comparison lit nums (disjoint from the list of\r\ncandidate lit nums).\nThis returns a list of candidate lit nums, a meaning sentence GAF iterator for each\ncandidate lit num, and a list of comparison lit nums (disjoint from the list of\ncandidate lit nums).")
    public static final SubLObject sksi_crm_get_subclause_candidates_alt(SubLObject contextualized_dnf_clause, SubLObject sks_profile) {
        {
            SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
            SubLObject content_mt = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
            SubLObject logical_schemata = sksi_query_datastructures.sks_profile_logical_schemata(sks_profile);
            SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
            SubLObject forbidden_comp_ops = com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_fully_forbidden_comparison_operators(physical_schemata);
            SubLObject candidate_lit_nums = NIL;
            SubLObject meaning_sentence_gaf_iterators = NIL;
            SubLObject comparison_lit_nums = NIL;
            SubLObject evaluate_lit_nums = NIL;
            SubLObject sksi_unknown_sentence_lit_nums = NIL;
            SubLObject num = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                {
                    SubLObject datum = lit;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL != hlmt_equalP(mt, content_mt)) || (NIL != sksi_infrastructure_utilities.mt_relevant_to_mt_memoizedP(mt, content_mt, UNPROVIDED))) {
                            if (NIL != sksi_query_utilities.comparison_literal_p(asent)) {
                                if (NIL == list_utilities.member_eqP(literal_predicate(asent, UNPROVIDED), forbidden_comp_ops)) {
                                    comparison_lit_nums = cons(num, comparison_lit_nums);
                                }
                                meaning_sentence_gaf_iterators = cons(NIL, meaning_sentence_gaf_iterators);
                            } else {
                                if (NIL != sksi_query_utilities.evaluate_literal_p(asent)) {
                                    if ((NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sks_supports_evaluation_asentsP(sks)) && (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_supported_evaluate_asentP(asent))) {
                                        evaluate_lit_nums = cons(num, evaluate_lit_nums);
                                    }
                                    meaning_sentence_gaf_iterators = cons(NIL, meaning_sentence_gaf_iterators);
                                } else {
                                    if (NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p(asent)) {
                                        sksi_unknown_sentence_lit_nums = cons(num, sksi_unknown_sentence_lit_nums);
                                        meaning_sentence_gaf_iterators = cons(NIL, meaning_sentence_gaf_iterators);
                                    } else {
                                        {
                                            SubLObject lit_meaning_sentence_gaf_iterator = sksi_conjunctive_removal_module_utilities.get_meaning_sentence_gaf_iterator_for_asent(asent, logical_schemata, sksi_query_datastructures.sks_profile_sks(sks_profile), T, mt, UNPROVIDED, UNPROVIDED);
                                            meaning_sentence_gaf_iterators = cons(lit_meaning_sentence_gaf_iterator, meaning_sentence_gaf_iterators);
                                            if (NIL != lit_meaning_sentence_gaf_iterator) {
                                                candidate_lit_nums = cons(num, candidate_lit_nums);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            meaning_sentence_gaf_iterators = cons(NIL, meaning_sentence_gaf_iterators);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt4);
                    }
                }
                num = add(num, ONE_INTEGER);
            }
            return values(nreverse(candidate_lit_nums), nreverse(meaning_sentence_gaf_iterators), nreverse(comparison_lit_nums), nreverse(evaluate_lit_nums), nreverse(sksi_unknown_sentence_lit_nums));
        }
    }

    /**
     * This returns a list of candidate lit nums, a meaning sentence GAF iterator for each
     * candidate lit num, and a list of comparison lit nums (disjoint from the list of
     * candidate lit nums).
     */
    @LispMethod(comment = "This returns a list of candidate lit nums, a meaning sentence GAF iterator for each\r\ncandidate lit num, and a list of comparison lit nums (disjoint from the list of\r\ncandidate lit nums).\nThis returns a list of candidate lit nums, a meaning sentence GAF iterator for each\ncandidate lit num, and a list of comparison lit nums (disjoint from the list of\ncandidate lit nums).")
    public static SubLObject sksi_crm_get_subclause_candidates(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        final SubLObject content_mt = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
        final SubLObject logical_schemata = sksi_query_datastructures.sks_profile_logical_schemata(sks_profile);
        final SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
        final SubLObject forbidden_comp_ops = sksi_crm_fully_forbidden_comparison_operators(physical_schemata);
        SubLObject candidate_lit_nums = NIL;
        SubLObject meaning_sentence_gaf_iterators = NIL;
        SubLObject comparison_lit_nums = NIL;
        SubLObject evaluate_lit_nums = NIL;
        SubLObject sksi_unknown_sentence_lit_nums = NIL;
        SubLObject num = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = lit;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list5);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list5);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != hlmt.hlmt_equalP(mt, content_mt)) || (NIL != sksi_infrastructure_utilities.mt_relevant_to_mt_memoizedP(mt, content_mt, UNPROVIDED))) {
                    if (NIL != sksi_query_utilities.comparison_literal_p(asent)) {
                        if (NIL == list_utilities.member_eqP(literal_predicate(asent, UNPROVIDED), forbidden_comp_ops)) {
                            comparison_lit_nums = cons(num, comparison_lit_nums);
                        }
                        meaning_sentence_gaf_iterators = cons(NIL, meaning_sentence_gaf_iterators);
                    } else
                        if (NIL != sksi_query_utilities.evaluate_literal_p(asent)) {
                            if ((NIL != sks_supports_evaluation_asentsP(sks)) && (NIL != sksi_supported_evaluate_asentP(asent))) {
                                evaluate_lit_nums = cons(num, evaluate_lit_nums);
                            }
                            meaning_sentence_gaf_iterators = cons(NIL, meaning_sentence_gaf_iterators);
                        } else
                            if (NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p(asent)) {
                                sksi_unknown_sentence_lit_nums = cons(num, sksi_unknown_sentence_lit_nums);
                                meaning_sentence_gaf_iterators = cons(NIL, meaning_sentence_gaf_iterators);
                            } else {
                                final SubLObject lit_meaning_sentence_gaf_iterator = sksi_conjunctive_removal_module_utilities.get_meaning_sentence_gaf_iterator_for_asent(asent, logical_schemata, sksi_query_datastructures.sks_profile_sks(sks_profile), T, mt, UNPROVIDED, UNPROVIDED);
                                meaning_sentence_gaf_iterators = cons(lit_meaning_sentence_gaf_iterator, meaning_sentence_gaf_iterators);
                                if (NIL != lit_meaning_sentence_gaf_iterator) {
                                    candidate_lit_nums = cons(num, candidate_lit_nums);
                                }
                            }


                } else {
                    meaning_sentence_gaf_iterators = cons(NIL, meaning_sentence_gaf_iterators);
                }
            } else {
                cdestructuring_bind_error(datum, $list5);
            }
            num = add(num, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return values(nreverse(candidate_lit_nums), nreverse(meaning_sentence_gaf_iterators), nreverse(comparison_lit_nums), nreverse(evaluate_lit_nums), nreverse(sksi_unknown_sentence_lit_nums));
    }

    public static final SubLObject sks_supports_evaluation_asentsP_alt(SubLObject sks) {
        return makeBoolean($$RDFTripleStore_Physical != sk_source_ks_type(sks));
    }

    public static SubLObject sks_supports_evaluation_asentsP(final SubLObject sks) {
        return makeBoolean(NIL == kb_utilities.kbeq($$RDFTripleStore_Physical, sksi_kb_accessors.sk_source_ks_type(sks)));
    }

    public static final SubLObject sksi_supported_evaluate_asentP_alt(SubLObject asent) {
        return cycl_utilities.expression_find_if(SKSI_SUPPORTED_FUNCTION_P, asent, T, UNPROVIDED);
    }

    public static SubLObject sksi_supported_evaluate_asentP(final SubLObject asent) {
        return cycl_utilities.expression_find_if(SKSI_SUPPORTED_FUNCTION_P, asent, T, UNPROVIDED);
    }

    public static SubLObject sksi_crm_fully_forbidden_comparison_operators_internal(final SubLObject physical_schemata) {
        SubLObject comparison_operators = sksi_kb_accessors.physical_schema_forbidden_comparison_operators(physical_schemata.first());
        SubLObject doneP = sublisp_null(comparison_operators);
        if (NIL == doneP) {
            SubLObject csome_list_var = physical_schemata.rest();
            SubLObject physical_schema = NIL;
            physical_schema = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                final SubLObject ps_comparison_operators = sksi_kb_accessors.physical_schema_forbidden_comparison_operators(physical_schema);
                comparison_operators = keyhash_utilities.fast_intersection(comparison_operators, ps_comparison_operators, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
                if (NIL == comparison_operators) {
                    doneP = T;
                }
                csome_list_var = csome_list_var.rest();
                physical_schema = csome_list_var.first();
            } 
        }
        return comparison_operators;
    }

    public static final SubLObject sksi_crm_fully_forbidden_comparison_operators_alt(SubLObject physical_schemata) {
        {
            SubLObject comparison_operators = physical_schema_forbidden_comparison_operators(physical_schemata.first());
            SubLObject doneP = sublisp_null(comparison_operators);
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = physical_schemata.rest();
                    SubLObject physical_schema = NIL;
                    for (physical_schema = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , physical_schema = csome_list_var.first()) {
                        {
                            SubLObject ps_comparison_operators = physical_schema_forbidden_comparison_operators(physical_schema);
                            comparison_operators = fast_intersection(comparison_operators, ps_comparison_operators, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
                            if (NIL == comparison_operators) {
                                doneP = T;
                            }
                        }
                    }
                }
            }
            return comparison_operators;
        }
    }

    public static SubLObject sksi_crm_fully_forbidden_comparison_operators(final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_crm_fully_forbidden_comparison_operators_internal(physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schemata, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_crm_fully_forbidden_comparison_operators_internal(physical_schemata)));
            memoization_state.caching_state_put(caching_state, physical_schemata, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject with_sksi_crm_pos_subclause_spec_gathering_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject result_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt7);
                    result_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, $list_alt9, append(body, list(listS(CSETQ, result_var, $list_alt11))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt7);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_sksi_crm_pos_subclause_spec_gathering(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result_var = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        result_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, $list11, append(body, list(listS(CSETQ, result_var, $list13))));
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static final SubLObject sksi_crm_add_pos_subclause_spec_alt(SubLObject pos_subclause_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject item_var = pos_subclause_spec;
                if (NIL == member(item_var, $sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    $sksi_crm_gathered_pos_subclause_specs$.setDynamicValue(cons(item_var, $sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject sksi_crm_add_pos_subclause_spec(final SubLObject pos_subclause_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == member(pos_subclause_spec, $sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            $sksi_crm_gathered_pos_subclause_specs$.setDynamicValue(cons(pos_subclause_spec, $sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject sksi_crm_reject_pos_subclause_spec_alt(SubLObject pos_subclause_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            dictionary.dictionary_enter($sksi_crm_rejected_pos_subclause_specs$.getDynamicValue(thread), pos_subclause_spec, T);
            return NIL;
        }
    }

    public static SubLObject sksi_crm_reject_pos_subclause_spec(final SubLObject pos_subclause_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.dictionary_enter($sksi_crm_rejected_pos_subclause_specs$.getDynamicValue(thread), pos_subclause_spec, T);
        return NIL;
    }

    public static final SubLObject sksi_crm_pos_subclause_spec_irrelevantP_alt(SubLObject pos_subclause_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.lengthL(pos_subclause_spec, sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.getDynamicValue(thread), UNPROVIDED)) {
                return T;
            } else {
                if (NIL != dictionary.dictionary_lookup_without_values($sksi_crm_rejected_pos_subclause_specs$.getDynamicValue(thread), pos_subclause_spec, UNPROVIDED)) {
                    return T;
                } else {
                    if (NIL != $sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) {
                        if (NIL != subl_promotions.memberP(pos_subclause_spec, $sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), symbol_function(SUBSETP), UNPROVIDED)) {
                            return T;
                        }
                    } else {
                        if (NIL != subl_promotions.memberP(pos_subclause_spec, $sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)) {
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sksi_crm_pos_subclause_spec_irrelevantP(final SubLObject pos_subclause_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.lengthL(pos_subclause_spec, sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$.getDynamicValue(thread), UNPROVIDED)) {
            return T;
        }
        if (NIL != dictionary.dictionary_lookup_without_values($sksi_crm_rejected_pos_subclause_specs$.getDynamicValue(thread), pos_subclause_spec, UNPROVIDED)) {
            return T;
        }
        if (NIL != $sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) {
            if (NIL != subl_promotions.memberP(pos_subclause_spec, $sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), symbol_function(SUBSETP), UNPROVIDED)) {
                return T;
            }
        } else
            if (NIL != subl_promotions.memberP(pos_subclause_spec, $sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)) {
            }

        return NIL;
    }

    public static final SubLObject sksi_crm_gather_literals_alt(SubLObject candidate_lit_nums, SubLObject comparison_lit_nums, SubLObject evaluate_lit_nums, SubLObject sksi_unknown_sentence_lit_nums, SubLObject contextualized_dnf_clause, SubLObject meaning_sentence_gaf_iterators, SubLObject sks_profile) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_subclause_spec = append(candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums);
                if ((NIL != sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue(thread)) && (length(pos_subclause_spec) != length(clauses.pos_lits(contextualized_dnf_clause)))) {
                    return NIL;
                }
                {
                    SubLObject islands = list_utilities.nmapcar(NCANONICALIZE_LITERAL_INDICES, com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_form_islands(pos_subclause_spec, contextualized_dnf_clause, UNPROVIDED));
                    SubLObject result = NIL;
                    if ((NIL != sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(islands))) {
                        return NIL;
                    }
                    {
                        SubLObject _prev_bind_0 = $sksi_crm_gathered_pos_subclause_specs$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $sksi_crm_rejected_pos_subclause_specs$.currentBinding(thread);
                        try {
                            $sksi_crm_gathered_pos_subclause_specs$.bind(NIL, thread);
                            $sksi_crm_rejected_pos_subclause_specs$.bind(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED), thread);
                            if (NIL == $sksi_crm_gather_literals_using_iterative_methodP$.getDynamicValue(thread)) {
                                {
                                    SubLObject cdolist_list_var = islands;
                                    SubLObject island = NIL;
                                    for (island = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , island = cdolist_list_var.first()) {
                                        com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_gather_literals_recursive(island, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                                    }
                                }
                            } else {
                                {
                                    SubLObject cdolist_list_var = islands;
                                    SubLObject island = NIL;
                                    for (island = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , island = cdolist_list_var.first()) {
                                        com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_gather_literals_iterative(island, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                                    }
                                }
                            }
                            result = (NIL != $sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) ? ((SubLObject) (list_utilities.delete_subsumed_items($sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), SUPERSETP, UNPROVIDED))) : $sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread);
                        } finally {
                            $sksi_crm_rejected_pos_subclause_specs$.rebind(_prev_bind_1, thread);
                            $sksi_crm_gathered_pos_subclause_specs$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
        }
    }

    public static SubLObject sksi_crm_gather_literals(final SubLObject candidate_lit_nums, final SubLObject comparison_lit_nums, final SubLObject evaluate_lit_nums, final SubLObject sksi_unknown_sentence_lit_nums, final SubLObject contextualized_dnf_clause, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_subclause_spec = append(candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums);
        if ((NIL != sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue(thread)) && (!length(pos_subclause_spec).eql(length(clauses.pos_lits(contextualized_dnf_clause))))) {
            return NIL;
        }
        final SubLObject islands = list_utilities.nmapcar(NCANONICALIZE_LITERAL_INDICES, sksi_crm_form_islands(pos_subclause_spec, contextualized_dnf_clause, UNPROVIDED));
        SubLObject result = NIL;
        if ((NIL != sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(islands))) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = $sksi_crm_gathered_pos_subclause_specs$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $sksi_crm_rejected_pos_subclause_specs$.currentBinding(thread);
        try {
            $sksi_crm_gathered_pos_subclause_specs$.bind(NIL, thread);
            $sksi_crm_rejected_pos_subclause_specs$.bind(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED), thread);
            if (NIL == $sksi_crm_gather_literals_using_iterative_methodP$.getDynamicValue(thread)) {
                SubLObject cdolist_list_var = islands;
                SubLObject island = NIL;
                island = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sksi_crm_gather_literals_recursive(island, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                    cdolist_list_var = cdolist_list_var.rest();
                    island = cdolist_list_var.first();
                } 
            } else {
                SubLObject cdolist_list_var = islands;
                SubLObject island = NIL;
                island = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sksi_crm_gather_literals_iterative(island, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                    cdolist_list_var = cdolist_list_var.rest();
                    island = cdolist_list_var.first();
                } 
            }
            result = (NIL != $sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) ? list_utilities.delete_subsumed_items($sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread), SUPERSETP, UNPROVIDED) : $sksi_crm_gathered_pos_subclause_specs$.getDynamicValue(thread);
        } finally {
            $sksi_crm_rejected_pos_subclause_specs$.rebind(_prev_bind_2, thread);
            $sksi_crm_gathered_pos_subclause_specs$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sksi_crm_gather_literals_iterative_alt(SubLObject initial_pos_subclause_spec, SubLObject candidate_lit_nums, SubLObject comparison_lit_nums, SubLObject evaluate_lit_nums, SubLObject sksi_unknown_sentence_lit_nums, SubLObject contextualized_dnf_clause, SubLObject meaning_sentence_gaf_iterators, SubLObject sks_profile) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_subclause_specs_queue = queues.create_p_queue(NIL, IDENTITY, $sym15$POS_SUBCLAUSE_SPEC__);
                SubLObject max_added_subclause_spec_length = ZERO_INTEGER;
                pos_subclause_specs_queue = queues.p_enqueue(initial_pos_subclause_spec, pos_subclause_specs_queue);
                while ((NIL == queues.p_queue_empty_p(pos_subclause_specs_queue)) && (!((NIL != $sksi_crm_gather_literals_iterative_method_return_first_successP$.getDynamicValue(thread)) && (NIL != number_utilities.positive_number_p(max_added_subclause_spec_length))))) {
                    {
                        SubLObject pos_subclause_spec = queues.p_dequeue(pos_subclause_specs_queue, UNPROVIDED);
                        SubLObject add_smaller_specs_to_queueP = NIL;
                        if (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_pos_subclause_spec_irrelevantP(pos_subclause_spec)) {
                            add_smaller_specs_to_queueP = T;
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_valid_queryP(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile)) {
                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_add_pos_subclause_spec(pos_subclause_spec);
                                if (max_added_subclause_spec_length.isZero()) {
                                    max_added_subclause_spec_length = length(pos_subclause_spec);
                                }
                                if (NIL == $sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) {
                                    add_smaller_specs_to_queueP = T;
                                }
                            } else {
                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_reject_pos_subclause_spec(pos_subclause_spec);
                            }
                        }
                        if (!((NIL != add_smaller_specs_to_queueP) || ((NIL != $sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) && max_added_subclause_spec_length.numG(length(pos_subclause_spec))))) {
                            {
                                SubLObject cdolist_list_var = pos_subclause_spec;
                                SubLObject num = NIL;
                                for (num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , num = cdolist_list_var.first()) {
                                    {
                                        SubLObject test_spec = remove(num, pos_subclause_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject islands = list_utilities.nmapcar(NCANONICALIZE_LITERAL_INDICES, com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_form_islands(test_spec, contextualized_dnf_clause, UNPROVIDED));
                                        SubLObject cdolist_list_var_2 = islands;
                                        SubLObject island = NIL;
                                        for (island = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , island = cdolist_list_var_2.first()) {
                                            if (!((NIL != queues.p_queue_full_p(pos_subclause_specs_queue)) || (NIL != queues.p_queue_find(island, pos_subclause_specs_queue, symbol_function(EQUAL), UNPROVIDED)))) {
                                                queues.p_enqueue(island, pos_subclause_specs_queue);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } 
            }
            return NIL;
        }
    }

    public static SubLObject sksi_crm_gather_literals_iterative(final SubLObject initial_pos_subclause_spec, final SubLObject candidate_lit_nums, final SubLObject comparison_lit_nums, final SubLObject evaluate_lit_nums, final SubLObject sksi_unknown_sentence_lit_nums, final SubLObject contextualized_dnf_clause, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pos_subclause_specs_queue = queues.create_p_queue(NIL, IDENTITY, $sym17$POS_SUBCLAUSE_SPEC__);
        SubLObject max_added_subclause_spec_length = ZERO_INTEGER;
        pos_subclause_specs_queue = queues.p_enqueue(initial_pos_subclause_spec, pos_subclause_specs_queue);
        while ((NIL == queues.p_queue_empty_p(pos_subclause_specs_queue)) && ((NIL == $sksi_crm_gather_literals_iterative_method_return_first_successP$.getDynamicValue(thread)) || (NIL == number_utilities.positive_number_p(max_added_subclause_spec_length)))) {
            final SubLObject _prev_bind_0 = $sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$.currentBinding(thread);
            try {
                $sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$.bind(NIL, thread);
                final SubLObject pos_subclause_spec = queues.p_dequeue(pos_subclause_specs_queue, UNPROVIDED);
                SubLObject add_smaller_specs_to_queueP = NIL;
                if (NIL != sksi_crm_pos_subclause_spec_irrelevantP(pos_subclause_spec)) {
                    add_smaller_specs_to_queueP = T;
                } else
                    if (NIL != sksi_crm_valid_queryP(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile)) {
                        sksi_crm_add_pos_subclause_spec(pos_subclause_spec);
                        if (max_added_subclause_spec_length.isZero()) {
                            max_added_subclause_spec_length = length(pos_subclause_spec);
                        }
                        if (NIL == $sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) {
                            add_smaller_specs_to_queueP = T;
                        }
                    } else {
                        sksi_crm_reject_pos_subclause_spec(pos_subclause_spec);
                    }

                if ((((NIL != sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.getDynamicValue(thread)) || (NIL != add_smaller_specs_to_queueP)) || ((NIL != $sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) && max_added_subclause_spec_length.numG(length(pos_subclause_spec)))) || (((NIL != $sksi_crm_gather_literals_stop_if_total_subclause_specs_fails_enumerability_optimizationP$.getDynamicValue(thread)) && (NIL != list_utilities.same_length_p(pos_subclause_spec, initial_pos_subclause_spec))) && (NIL != $sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$.getDynamicValue(thread)))) {
                    continue;
                }
                SubLObject cdolist_list_var = pos_subclause_spec;
                SubLObject num = NIL;
                num = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject test_spec = remove(num, pos_subclause_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var_$3;
                    final SubLObject islands = cdolist_list_var_$3 = list_utilities.nmapcar(NCANONICALIZE_LITERAL_INDICES, sksi_crm_form_islands(test_spec, contextualized_dnf_clause, UNPROVIDED));
                    SubLObject island = NIL;
                    island = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        if ((NIL == queues.p_queue_full_p(pos_subclause_specs_queue)) && (NIL == queues.p_queue_find(island, pos_subclause_specs_queue, symbol_function(EQUAL), UNPROVIDED))) {
                            queues.p_enqueue(island, pos_subclause_specs_queue);
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        island = cdolist_list_var_$3.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    num = cdolist_list_var.first();
                } 
            } finally {
                $sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$.rebind(_prev_bind_0, thread);
            }
        } 
        return NIL;
    }

    public static final SubLObject pos_subclause_spec_G_alt(SubLObject pos_subclause_spec_1, SubLObject pos_subclause_spec_2) {
        {
            SubLObject pos_subclause_spec_1_length = length(pos_subclause_spec_1);
            SubLObject pos_subclause_spec_2_length = length(pos_subclause_spec_2);
            if (pos_subclause_spec_1_length.numL(pos_subclause_spec_2_length)) {
                return NIL;
            } else {
                if (pos_subclause_spec_2_length.numL(pos_subclause_spec_1_length)) {
                    return T;
                } else {
                    if (NIL == pos_subclause_spec_1) {
                        return NIL;
                    } else {
                        if (NIL == pos_subclause_spec_2) {
                            return NIL;
                        } else {
                            if (pos_subclause_spec_2.first().numL(pos_subclause_spec_1.first())) {
                                return NIL;
                            } else {
                                if (pos_subclause_spec_1.first().numL(pos_subclause_spec_2.first())) {
                                    return T;
                                } else {
                                    return com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.pos_subclause_spec_G(pos_subclause_spec_1.rest(), pos_subclause_spec_2.rest());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject pos_subclause_spec_G(final SubLObject pos_subclause_spec_1, final SubLObject pos_subclause_spec_2) {
        final SubLObject pos_subclause_spec_1_length = length(pos_subclause_spec_1);
        final SubLObject pos_subclause_spec_2_length = length(pos_subclause_spec_2);
        if (pos_subclause_spec_1_length.numL(pos_subclause_spec_2_length)) {
            return NIL;
        }
        if (pos_subclause_spec_2_length.numL(pos_subclause_spec_1_length)) {
            return T;
        }
        if (NIL == pos_subclause_spec_1) {
            return NIL;
        }
        if (NIL == pos_subclause_spec_2) {
            return NIL;
        }
        if (pos_subclause_spec_2.first().numL(pos_subclause_spec_1.first())) {
            return NIL;
        }
        if (pos_subclause_spec_1.first().numL(pos_subclause_spec_2.first())) {
            return T;
        }
        return pos_subclause_spec_G(pos_subclause_spec_1.rest(), pos_subclause_spec_2.rest());
    }

    public static final SubLObject sksi_crm_gather_literals_recursive_alt(SubLObject pos_subclause_spec, SubLObject candidate_lit_nums, SubLObject comparison_lit_nums, SubLObject evaluate_lit_nums, SubLObject sksi_unknown_sentence_lit_nums, SubLObject contextualized_dnf_clause, SubLObject meaning_sentence_gaf_iterators, SubLObject sks_profile) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_pos_subclause_spec_irrelevantP(pos_subclause_spec)) {
                return NIL;
            } else {
                if (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_valid_queryP(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile)) {
                    com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_add_pos_subclause_spec(pos_subclause_spec);
                    if (NIL == $sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) {
                        com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_gather_literals_recursive_continue_recursion(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                    }
                    return NIL;
                } else {
                    com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_reject_pos_subclause_spec(pos_subclause_spec);
                    com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_gather_literals_recursive_continue_recursion(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                    return NIL;
                }
            }
        }
    }

    public static SubLObject sksi_crm_gather_literals_recursive(final SubLObject pos_subclause_spec, final SubLObject candidate_lit_nums, final SubLObject comparison_lit_nums, final SubLObject evaluate_lit_nums, final SubLObject sksi_unknown_sentence_lit_nums, final SubLObject contextualized_dnf_clause, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_crm_pos_subclause_spec_irrelevantP(pos_subclause_spec)) {
            return NIL;
        }
        if (NIL != sksi_crm_valid_queryP(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile)) {
            sksi_crm_add_pos_subclause_spec(pos_subclause_spec);
            if (NIL == $sksi_crm_ignore_subsumed_subclause_specsP$.getDynamicValue(thread)) {
                sksi_crm_gather_literals_recursive_continue_recursion(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
            }
            return NIL;
        }
        sksi_crm_reject_pos_subclause_spec(pos_subclause_spec);
        sksi_crm_gather_literals_recursive_continue_recursion(pos_subclause_spec, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
        return NIL;
    }

    public static final SubLObject sksi_crm_gather_literals_recursive_continue_recursion_alt(SubLObject pos_subclause_spec, SubLObject candidate_lit_nums, SubLObject comparison_lit_nums, SubLObject evaluate_lit_nums, SubLObject sksi_unknown_sentence_lit_nums, SubLObject contextualized_dnf_clause, SubLObject meaning_sentence_gaf_iterators, SubLObject sks_profile) {
        {
            SubLObject cdolist_list_var = pos_subclause_spec;
            SubLObject num = NIL;
            for (num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , num = cdolist_list_var.first()) {
                {
                    SubLObject test_spec = remove(num, pos_subclause_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject islands = list_utilities.nmapcar(NCANONICALIZE_LITERAL_INDICES, com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_form_islands(test_spec, contextualized_dnf_clause, UNPROVIDED));
                    SubLObject cdolist_list_var_3 = islands;
                    SubLObject island = NIL;
                    for (island = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , island = cdolist_list_var_3.first()) {
                        com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_gather_literals_recursive(island, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject sksi_crm_gather_literals_recursive_continue_recursion(final SubLObject pos_subclause_spec, final SubLObject candidate_lit_nums, final SubLObject comparison_lit_nums, final SubLObject evaluate_lit_nums, final SubLObject sksi_unknown_sentence_lit_nums, final SubLObject contextualized_dnf_clause, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        SubLObject cdolist_list_var = pos_subclause_spec;
        SubLObject num = NIL;
        num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject test_spec = remove(num, pos_subclause_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var_$4;
            final SubLObject islands = cdolist_list_var_$4 = list_utilities.nmapcar(NCANONICALIZE_LITERAL_INDICES, sksi_crm_form_islands(test_spec, contextualized_dnf_clause, UNPROVIDED));
            SubLObject island = NIL;
            island = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                sksi_crm_gather_literals_recursive(island, candidate_lit_nums, comparison_lit_nums, evaluate_lit_nums, sksi_unknown_sentence_lit_nums, contextualized_dnf_clause, meaning_sentence_gaf_iterators, sks_profile);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                island = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject sksi_crm_valid_queryP_alt(SubLObject pos_subclause_spec, SubLObject candidate_lit_nums, SubLObject comparison_lit_nums, SubLObject evaluate_lit_nums, SubLObject sksi_unknown_sentence_lit_nums, SubLObject contextualized_dnf_clause, SubLObject meaning_sentence_gaf_iterators, SubLObject sks_profile) {
        {
            SubLObject candidate_spec = list_utilities.ordered_intersection(candidate_lit_nums, pos_subclause_spec, symbol_function($sym16$_), UNPROVIDED);
            SubLObject comparison_spec = list_utilities.ordered_intersection(comparison_lit_nums, pos_subclause_spec, symbol_function($sym16$_), UNPROVIDED);
            SubLObject evaluate_spec = list_utilities.ordered_intersection(evaluate_lit_nums, pos_subclause_spec, symbol_function($sym16$_), UNPROVIDED);
            SubLObject sksi_unknown_sentence_spec = list_utilities.ordered_intersection(sksi_unknown_sentence_lit_nums, pos_subclause_spec, symbol_function($sym16$_), UNPROVIDED);
            SubLObject asents = clauses.pos_lits(subclause_specified_by_spec(contextualized_dnf_clause, new_subclause_spec(NIL, candidate_spec)));
            SubLObject comparison_asents = clauses.pos_lits(subclause_specified_by_spec(contextualized_dnf_clause, new_subclause_spec(NIL, comparison_spec)));
            SubLObject evaluate_asents = clauses.pos_lits(subclause_specified_by_spec(contextualized_dnf_clause, new_subclause_spec(NIL, evaluate_spec)));
            SubLObject sksi_unknown_sentence_asents = clauses.pos_lits(subclause_specified_by_spec(contextualized_dnf_clause, new_subclause_spec(NIL, sksi_unknown_sentence_spec)));
            SubLObject lit_meaning_sentence_gaf_iterators = list_utilities.nths(candidate_spec, meaning_sentence_gaf_iterators);
            return com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_valid_query_int(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, lit_meaning_sentence_gaf_iterators, sks_profile);
        }
    }

    public static SubLObject sksi_crm_valid_queryP(final SubLObject pos_subclause_spec, final SubLObject candidate_lit_nums, final SubLObject comparison_lit_nums, final SubLObject evaluate_lit_nums, final SubLObject sksi_unknown_sentence_lit_nums, final SubLObject contextualized_dnf_clause, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != inference_worker.currently_active_problem()) && (NIL != inference_strategist.current_controlling_inference_max_time_reachedP())) || (((NIL != number_utilities.positive_number_p($sksi_crm_applicability_max_time_override$.getDynamicValue(thread))) && (NIL != number_utilities.positive_number_p($sksi_crm_applicability_start_time$.getDynamicValue(thread)))) && add($sksi_crm_applicability_start_time$.getDynamicValue(thread), $sksi_crm_applicability_max_time_override$.getDynamicValue(thread)).numLE(get_universal_time()))) {
            sublisp_throw($SKSI_CRM_APPLICABILITY_MAX_TIME, subtract(get_universal_time(), $sksi_crm_applicability_start_time$.getDynamicValue(thread)));
        }
        final SubLObject candidate_spec = list_utilities.ordered_intersection(candidate_lit_nums, pos_subclause_spec, symbol_function($sym18$_), UNPROVIDED);
        final SubLObject comparison_spec = list_utilities.ordered_intersection(comparison_lit_nums, pos_subclause_spec, symbol_function($sym18$_), UNPROVIDED);
        final SubLObject evaluate_spec = list_utilities.ordered_intersection(evaluate_lit_nums, pos_subclause_spec, symbol_function($sym18$_), UNPROVIDED);
        final SubLObject sksi_unknown_sentence_spec = list_utilities.ordered_intersection(sksi_unknown_sentence_lit_nums, pos_subclause_spec, symbol_function($sym18$_), UNPROVIDED);
        final SubLObject asents = clauses.pos_lits(clause_utilities.subclause_specified_by_spec(contextualized_dnf_clause, clause_utilities.new_subclause_spec(NIL, candidate_spec)));
        final SubLObject comparison_asents = clauses.pos_lits(clause_utilities.subclause_specified_by_spec(contextualized_dnf_clause, clause_utilities.new_subclause_spec(NIL, comparison_spec)));
        final SubLObject evaluate_asents = clauses.pos_lits(clause_utilities.subclause_specified_by_spec(contextualized_dnf_clause, clause_utilities.new_subclause_spec(NIL, evaluate_spec)));
        final SubLObject sksi_unknown_sentence_asents = clauses.pos_lits(clause_utilities.subclause_specified_by_spec(contextualized_dnf_clause, clause_utilities.new_subclause_spec(NIL, sksi_unknown_sentence_spec)));
        final SubLObject lit_meaning_sentence_gaf_iterators = list_utilities.nths(candidate_spec, meaning_sentence_gaf_iterators);
        return sksi_crm_valid_query_int(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, lit_meaning_sentence_gaf_iterators, sks_profile);
    }

    public static final SubLObject sksi_crm_valid_query_int_alt(SubLObject asents, SubLObject comparison_asents, SubLObject evaluate_asents, SubLObject sksi_unknown_sentence_asents, SubLObject meaning_sentence_gaf_iterators, SubLObject sks_profile) {
        return com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_applicability_iterate_over_meaning_sentence_gafs(NIL, meaning_sentence_gaf_iterators, NIL, asents, asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
    }

    public static SubLObject sksi_crm_valid_query_int(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gaf_iterators, final SubLObject sks_profile) {
        return sksi_crm_applicability_iterate_over_meaning_sentence_gafs(NIL, meaning_sentence_gaf_iterators, NIL, asents, asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
    }

    public static final SubLObject sksi_crm_applicability_iterate_over_meaning_sentence_gafs_alt(SubLObject meaning_sentence_gafs_so_far, SubLObject remaining_meaning_sentence_gaf_iterators, SubLObject lits_so_far, SubLObject remaining_lits, SubLObject asents, SubLObject comparison_asents, SubLObject evaluate_asents, SubLObject sksi_unknown_sentence_asents, SubLObject sks_profile) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                if (NIL == remaining_meaning_sentence_gaf_iterators) {
                    successP = com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_applicability_process_meaning_sentence_gafs(meaning_sentence_gafs_so_far, asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
                } else {
                    {
                        SubLObject iterator = remaining_meaning_sentence_gaf_iterators.first();
                        if (NIL != iterator) {
                            {
                                SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
                                SubLObject asent = remaining_lits.first();
                                SubLObject datum = asent;
                                SubLObject current = datum;
                                SubLObject mt = NIL;
                                SubLObject lit = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt17);
                                mt = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt17);
                                lit = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject done_var = successP;
                                        while (NIL == done_var) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject gaf = iteration.iteration_next(iterator);
                                                SubLObject valid = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != valid) {
                                                    if ((NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_literal_coherentP(lit, mt, list(gaf), physical_schemata, sksi_query_datastructures.sks_profile_sks(sks_profile))) && (NIL != sksi_conjunctive_removal_module_utilities.sksi_crm_literal_coherent_with_other_literalsP(asent, gaf, lits_so_far, meaning_sentence_gafs_so_far, physical_schemata))) {
                                                        successP = com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_applicability_iterate_over_meaning_sentence_gafs(list_utilities.snoc(gaf, meaning_sentence_gafs_so_far), remaining_meaning_sentence_gaf_iterators.rest(), list_utilities.snoc(asent, lits_so_far), remaining_lits.rest(), asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != successP));
                                            }
                                        } 
                                        iteration.reset_reusable_iterator(iterator);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt17);
                                }
                            }
                        } else {
                            successP = com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_applicability_iterate_over_meaning_sentence_gafs(list_utilities.snoc(NIL, meaning_sentence_gafs_so_far), remaining_meaning_sentence_gaf_iterators.rest(), lits_so_far, remaining_lits.rest(), asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
                        }
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject sksi_crm_applicability_iterate_over_meaning_sentence_gafs(final SubLObject meaning_sentence_gafs_so_far, final SubLObject remaining_meaning_sentence_gaf_iterators, final SubLObject lits_so_far, final SubLObject remaining_lits, final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        if (NIL == remaining_meaning_sentence_gaf_iterators) {
            successP = sksi_crm_applicability_process_meaning_sentence_gafs(meaning_sentence_gafs_so_far, asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
        } else {
            final SubLObject iterator = remaining_meaning_sentence_gaf_iterators.first();
            if (NIL != iterator) {
                final SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
                final SubLObject asent = remaining_lits.first();
                SubLObject current;
                final SubLObject datum = current = asent;
                SubLObject mt = NIL;
                SubLObject lit = NIL;
                destructuring_bind_must_consp(current, datum, $list19);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list19);
                lit = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject valid;
                    for (SubLObject done_var = successP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != successP))) {
                        thread.resetMultipleValues();
                        final SubLObject gaf = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (((NIL != valid) && (NIL != sksi_crm_literal_coherentP(lit, mt, list(gaf), physical_schemata, sksi_query_datastructures.sks_profile_sks(sks_profile)))) && (NIL != sksi_conjunctive_removal_module_utilities.sksi_crm_literal_coherent_with_other_literalsP(asent, gaf, lits_so_far, meaning_sentence_gafs_so_far, physical_schemata))) {
                            successP = sksi_crm_applicability_iterate_over_meaning_sentence_gafs(list_utilities.snoc(gaf, meaning_sentence_gafs_so_far), remaining_meaning_sentence_gaf_iterators.rest(), list_utilities.snoc(asent, lits_so_far), remaining_lits.rest(), asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
                        }
                    }
                    iteration.reset_reusable_iterator(iterator);
                } else {
                    cdestructuring_bind_error(datum, $list19);
                }
            } else {
                successP = sksi_crm_applicability_iterate_over_meaning_sentence_gafs(list_utilities.snoc(NIL, meaning_sentence_gafs_so_far), remaining_meaning_sentence_gaf_iterators.rest(), lits_so_far, remaining_lits.rest(), asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, sks_profile);
            }
        }
        return successP;
    }

    public static final SubLObject sksi_crm_applicability_process_meaning_sentence_gafs_alt(SubLObject meaning_sentence_gafs, SubLObject lits, SubLObject comparison_asents, SubLObject evaluate_asents, SubLObject sksi_unknown_sentence_asents, SubLObject sks_profile) {
        {
            SubLObject asents = NIL;
            SubLObject keywords = NIL;
            SubLObject new_meaning_sentence_gafs = NIL;
            SubLObject successP = NIL;
            if (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_enumerability_check_asents(lits, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs)) {
                {
                    SubLObject list_var = NIL;
                    SubLObject lit = NIL;
                    SubLObject num = NIL;
                    for (list_var = lits, lit = list_var.first(), num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , lit = list_var.first() , num = add(ONE_INTEGER, num)) {
                        {
                            SubLObject datum = lit;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt4);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt4);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject meaning_sentence_gaf = nth(num, meaning_sentence_gafs);
                                    if (NIL != meaning_sentence_gaf) {
                                        {
                                            SubLObject asent_args = cycl_utilities.formula_args(asent, UNPROVIDED);
                                            SubLObject inverse_args = reverse(asent_args);
                                            SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
                                            new_meaning_sentence_gafs = cons(meaning_sentence_gaf, new_meaning_sentence_gafs);
                                            asents = cons(NIL, asents);
                                            keywords = cons(NIL, keywords);
                                            if (NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(asent)) {
                                                set_nth(ZERO_INTEGER, asents, cons(lit, nth(ZERO_INTEGER, asents)));
                                                set_nth(ZERO_INTEGER, keywords, cons($VARPRED, nth(ZERO_INTEGER, keywords)));
                                            } else {
                                                {
                                                    SubLObject asent_pred = literal_predicate(asent, UNPROVIDED);
                                                    SubLObject spec_preds = sksi_conjunctive_removal_module_utilities.sksi_relevant_spec_preds_from_meaning_sentence(asent_pred, meaning_sentence, mt, UNPROVIDED, UNPROVIDED);
                                                    SubLObject spec_inverses = sksi_conjunctive_removal_module_utilities.sksi_relevant_spec_inverses_from_meaning_sentence(asent_pred, meaning_sentence, mt, UNPROVIDED, UNPROVIDED);
                                                    if (!((NIL != spec_preds) || (NIL != spec_inverses))) {
                                                        return NIL;
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var = spec_preds;
                                                        SubLObject spec_pred = NIL;
                                                        for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject new_asent = list_to_elf(cons(spec_pred, asent_args));
                                                                SubLObject new_lit = inference_datastructures_problem_query.make_contextualized_asent(mt, new_asent);
                                                                set_nth(ZERO_INTEGER, asents, cons(new_lit, nth(ZERO_INTEGER, asents)));
                                                                set_nth(ZERO_INTEGER, keywords, cons($GENLPREDS, nth(ZERO_INTEGER, keywords)));
                                                            }
                                                        }
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var = spec_inverses;
                                                        SubLObject spec_inverse = NIL;
                                                        for (spec_inverse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_inverse = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject new_asent = list_to_elf(cons(spec_inverse, inverse_args));
                                                                SubLObject new_lit = inference_datastructures_problem_query.make_contextualized_asent(mt, new_asent);
                                                                set_nth(ZERO_INTEGER, asents, cons(new_lit, nth(ZERO_INTEGER, asents)));
                                                                set_nth(ZERO_INTEGER, keywords, cons($GENLINVERSE, nth(ZERO_INTEGER, keywords)));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        keywords = cons(NIL, keywords);
                                        asents = cons(lit, asents);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt4);
                            }
                        }
                    }
                }
                asents = nreverse(asents);
                keywords = nreverse(keywords);
                new_meaning_sentence_gafs = nreverse(new_meaning_sentence_gafs);
                successP = com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_applicability_iterate_over_asents(NIL, asents, NIL, keywords, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, new_meaning_sentence_gafs, sks_profile);
            }
            return successP;
        }
    }

    public static SubLObject sksi_crm_applicability_process_meaning_sentence_gafs(final SubLObject meaning_sentence_gafs, final SubLObject lits, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject sks_profile) {
        SubLObject asents = NIL;
        SubLObject keywords = NIL;
        SubLObject new_meaning_sentence_gafs = NIL;
        SubLObject successP = NIL;
        if (NIL == sksi_crm_enumerability_check_asents(lits, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs)) {
            $sksi_crm_gather_literals_subclause_specs_failed_due_to_enumerabilityP$.setDynamicValue(T);
        } else {
            SubLObject list_var = NIL;
            SubLObject lit = NIL;
            SubLObject num = NIL;
            list_var = lits;
            lit = list_var.first();
            for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , lit = list_var.first() , num = add(ONE_INTEGER, num)) {
                SubLObject current;
                final SubLObject datum = current = lit;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list5);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list5);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject meaning_sentence_gaf = nth(num, meaning_sentence_gafs);
                    if (NIL != meaning_sentence_gaf) {
                        final SubLObject asent_args = cycl_utilities.formula_args(asent, UNPROVIDED);
                        final SubLObject inverse_args = reverse(asent_args);
                        final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
                        new_meaning_sentence_gafs = cons(meaning_sentence_gaf, new_meaning_sentence_gafs);
                        asents = cons(NIL, asents);
                        keywords = cons(NIL, keywords);
                        if (NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(asent)) {
                            set_nth(ZERO_INTEGER, asents, cons(lit, nth(ZERO_INTEGER, asents)));
                            set_nth(ZERO_INTEGER, keywords, cons($VARPRED, nth(ZERO_INTEGER, keywords)));
                        } else {
                            final SubLObject asent_pred = literal_predicate(asent, UNPROVIDED);
                            final SubLObject spec_preds = sksi_conjunctive_removal_module_utilities.sksi_relevant_spec_preds_from_meaning_sentence(asent_pred, meaning_sentence, mt, UNPROVIDED, UNPROVIDED);
                            final SubLObject spec_inverses = sksi_conjunctive_removal_module_utilities.sksi_relevant_spec_inverses_from_meaning_sentence(asent_pred, meaning_sentence, mt, UNPROVIDED, UNPROVIDED);
                            if ((NIL == spec_preds) && (NIL == spec_inverses)) {
                                return NIL;
                            }
                            SubLObject cdolist_list_var = spec_preds;
                            SubLObject spec_pred = NIL;
                            spec_pred = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject new_asent = list_to_elf(cons(spec_pred, asent_args));
                                final SubLObject new_lit = inference_datastructures_problem_query.make_contextualized_asent(mt, new_asent);
                                set_nth(ZERO_INTEGER, asents, cons(new_lit, nth(ZERO_INTEGER, asents)));
                                set_nth(ZERO_INTEGER, keywords, cons($GENLPREDS, nth(ZERO_INTEGER, keywords)));
                                cdolist_list_var = cdolist_list_var.rest();
                                spec_pred = cdolist_list_var.first();
                            } 
                            cdolist_list_var = spec_inverses;
                            SubLObject spec_inverse = NIL;
                            spec_inverse = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject new_asent = list_to_elf(cons(spec_inverse, inverse_args));
                                final SubLObject new_lit = inference_datastructures_problem_query.make_contextualized_asent(mt, new_asent);
                                set_nth(ZERO_INTEGER, asents, cons(new_lit, nth(ZERO_INTEGER, asents)));
                                set_nth(ZERO_INTEGER, keywords, cons($GENLINVERSE, nth(ZERO_INTEGER, keywords)));
                                cdolist_list_var = cdolist_list_var.rest();
                                spec_inverse = cdolist_list_var.first();
                            } 
                        }
                    } else {
                        keywords = cons(NIL, keywords);
                        asents = cons(lit, asents);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list5);
                }
            }
            asents = nreverse(asents);
            keywords = nreverse(keywords);
            new_meaning_sentence_gafs = nreverse(new_meaning_sentence_gafs);
            successP = sksi_crm_applicability_iterate_over_asents(NIL, asents, NIL, keywords, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, new_meaning_sentence_gafs, sks_profile);
        }
        return successP;
    }

    public static final SubLObject sksi_crm_applicability_iterate_over_asents_alt(SubLObject asents_so_far, SubLObject remaining_asents, SubLObject keywords_so_far, SubLObject remaining_keywords, SubLObject comparison_asents, SubLObject evaluate_asents, SubLObject sksi_unknown_sentence_asents, SubLObject meaning_sentence_gafs, SubLObject sks_profile) {
        {
            SubLObject successP = NIL;
            if (NIL == remaining_asents) {
                successP = makeBoolean(((NIL != sksi_conjunctive_removal_module_utilities.sksi_crm_joinable_asentsP(asents_so_far, meaning_sentence_gafs, sksi_query_datastructures.sks_profile_physical_schemata(sks_profile))) && (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_multi_table_check(meaning_sentence_gafs, sksi_query_datastructures.sks_profile_physical_schemata(sks_profile)))) && (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_asents_generate_csqlP(asents_so_far, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile)));
            } else {
                if (NIL == successP) {
                    {
                        SubLObject asent = NIL;
                        SubLObject asent_4 = NIL;
                        SubLObject keyword = NIL;
                        SubLObject keyword_5 = NIL;
                        for (asent = remaining_asents.first(), asent_4 = asent.first(), keyword = remaining_keywords.first(), keyword_5 = keyword.first(); !((NIL != successP) || ((NIL == keyword) && (NIL == asent))); asent = asent.rest() , asent_4 = asent.first() , keyword = keyword.rest() , keyword_5 = keyword.first()) {
                            successP = com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_applicability_iterate_over_asents(list_utilities.snoc(asent_4, asents_so_far), remaining_asents.rest(), list_utilities.snoc(keyword_5, keywords_so_far), remaining_keywords.rest(), comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile);
                        }
                    }
                }
            }
            return successP;
        }
    }

    public static SubLObject sksi_crm_applicability_iterate_over_asents(final SubLObject asents_so_far, final SubLObject remaining_asents, final SubLObject keywords_so_far, final SubLObject remaining_keywords, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs, final SubLObject sks_profile) {
        SubLObject successP = NIL;
        if (NIL == remaining_asents) {
            successP = makeBoolean((NIL != sksi_conjunctive_removal_module_utilities.sksi_crm_joinable_asentsP(asents_so_far, meaning_sentence_gafs, sksi_query_datastructures.sks_profile_physical_schemata(sks_profile))) && (NIL != sksi_crm_asents_generate_sqlP(asents_so_far, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile)));
        } else
            if (NIL == successP) {
                SubLObject asent;
                SubLObject asent_$5;
                SubLObject keyword;
                SubLObject keyword_$6;
                for (asent = NIL, asent_$5 = NIL, keyword = NIL, keyword_$6 = NIL, asent = remaining_asents.first(), asent_$5 = asent.first(), keyword = remaining_keywords.first(), keyword_$6 = keyword.first(); (NIL == successP) && ((NIL != keyword) || (NIL != asent)); successP = sksi_crm_applicability_iterate_over_asents(list_utilities.snoc(asent_$5, asents_so_far), remaining_asents.rest(), list_utilities.snoc(keyword_$6, keywords_so_far), remaining_keywords.rest(), comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile) , asent = asent.rest() , asent_$5 = asent.first() , keyword = keyword.rest() , keyword_$6 = keyword.first()) {
                }
            }

        return successP;
    }

    public static final SubLObject sksi_crm_asents_generate_csqlP_alt(SubLObject asents, SubLObject comparison_asents, SubLObject evaluate_asents, SubLObject sksi_unknown_sentence_asents, SubLObject meaning_sentence_gafs, SubLObject sks_profile) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject csql = sksi_conjunctive_removal_module_utilities.sksi_crm_generate_csql_for_query(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile);
                SubLObject var_decoding_map = thread.secondMultipleValue();
                SubLObject booleanP = thread.thirdMultipleValue();
                SubLObject error_message = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != error_message) {
                    if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(FIVE_INTEGER)) {
                        format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str_alt21$SKSI_, new SubLObject[]{ $str_alt22$Could_not_form_a_CSQL_query_with_, $str_alt23$__ }), new SubLObject[]{ meaning_sentence_gafs, append(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents), error_message });
                        force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                    }
                }
                return sublisp_null(error_message);
            }
        }
    }

    public static SubLObject sksi_crm_asents_generate_csqlP(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.bind(NIL, thread);
            error_message = nth_value_step_2(nth_value_step_1(THREE_INTEGER), sksi_conjunctive_removal_module_utilities.sksi_crm_generate_csql_for_query(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile));
        } finally {
            sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.rebind(_prev_bind_0, thread);
        }
        if ((NIL != error_message) && (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(FIVE_INTEGER))) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str23$__SKSI__A_, $str24$Could_not_form_a_CSQL_query_with_), new SubLObject[]{ FIVE_INTEGER, meaning_sentence_gafs, append(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents), error_message });
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return sublisp_null(error_message);
    }

    public static SubLObject sksi_crm_asents_generate_sqlP(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sksi_query_datastructures.print_sks_profile_contents(sks_profile, UNPROVIDED);
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject csql = sksi_conjunctive_removal_module_utilities.sksi_crm_generate_csql_for_query(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs, sks_profile);
            final SubLObject var_decoding_map = thread.secondMultipleValue();
            final SubLObject booleanP = thread.thirdMultipleValue();
            SubLObject error_message = thread.fourthMultipleValue();
            final SubLObject var_pfi_encodings = thread.fifthMultipleValue();
            final SubLObject var_lit_pfis = thread.sixthMultipleValue();
            final SubLObject lit_pfi_selects = thread.seventhMultipleValue();
            final SubLObject var_lfi_map = thread.eighthMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == error_message) && (NIL != kb_utilities.kbeq($$Database_Physical, sksi_query_datastructures.sks_profile_type(sks_profile)))) {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sksi_kb_accessors.sk_source_sql_flavor(sksi_query_datastructures.sks_profile_sks(sks_profile)), UNPROVIDED);
                            if (NIL == sql) {
                                if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(FIVE_INTEGER)) {
                                    format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str23$__SKSI__A_, $str27$Could_not_form_a_SQL_query_with__), new SubLObject[]{ FIVE_INTEGER, meaning_sentence_gafs, append(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents), error_message });
                                    force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                                }
                                return NIL;
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            }
            if ((NIL != error_message) && (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(FIVE_INTEGER))) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str23$__SKSI__A_, $str24$Could_not_form_a_CSQL_query_with_), new SubLObject[]{ FIVE_INTEGER, meaning_sentence_gafs, append(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents), error_message });
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return sublisp_null(error_message);
        } finally {
            sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * This creates islands by shared variables.  All fully-bound literals are put in the
     * same island (which is returned unless FULLY-BOUND-ISLAND? is NIL).
     */
    @LispMethod(comment = "This creates islands by shared variables.  All fully-bound literals are put in the\r\nsame island (which is returned unless FULLY-BOUND-ISLAND? is NIL).\nThis creates islands by shared variables.  All fully-bound literals are put in the\nsame island (which is returned unless FULLY-BOUND-ISLAND? is NIL).")
    public static final SubLObject sksi_crm_form_islands_alt(SubLObject pos_lits_subclause_spec, SubLObject contextualized_dnf_clause, SubLObject fully_bound_islandP) {
        if (fully_bound_islandP == UNPROVIDED) {
            fully_bound_islandP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vars = NIL;
                SubLObject prepared_spec = NIL;
                SubLObject islands = NIL;
                {
                    SubLObject cdolist_list_var = pos_lits_subclause_spec;
                    SubLObject lit_num = NIL;
                    for (lit_num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit_num = cdolist_list_var.first()) {
                        {
                            SubLObject lit_vars = com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.clause_literal_variables(contextualized_dnf_clause, $POS, lit_num);
                            vars = append(vars, lit_vars, NIL);
                            prepared_spec = cons(list(lit_num, lit_vars), prepared_spec);
                        }
                    }
                }
                vars = cons(NIL, list_utilities.fast_delete_duplicates(vars, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                thread.resetMultipleValues();
                {
                    SubLObject connected_proto_islands = graph_utilities.categorize_nodes_via_links(vars, prepared_spec, UNPROVIDED);
                    SubLObject isolated_proto_islands = thread.secondMultipleValue();
                    SubLObject naked_proto_islands = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject nil_islands = NIL;
                        {
                            SubLObject cdolist_list_var = connected_proto_islands;
                            SubLObject proto_island = NIL;
                            for (proto_island = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proto_island = cdolist_list_var.first()) {
                                {
                                    SubLObject pre_island = cadr(proto_island);
                                    SubLObject island = Mapping.mapcar(symbol_function(FIRST), pre_island);
                                    islands = cons(island, islands);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = isolated_proto_islands;
                            SubLObject proto_island = NIL;
                            for (proto_island = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proto_island = cdolist_list_var.first()) {
                                {
                                    SubLObject island_nodes = proto_island.first();
                                    SubLObject pre_island = cadr(proto_island);
                                    SubLObject island = Mapping.mapcar(symbol_function(FIRST), pre_island);
                                    if (island_nodes.equal($list_alt26)) {
                                        nil_islands = append(nil_islands, island);
                                    } else {
                                        islands = cons(island, islands);
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = naked_proto_islands;
                            SubLObject proto_island = NIL;
                            for (proto_island = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proto_island = cdolist_list_var.first()) {
                                {
                                    SubLObject island_nodes = proto_island.first();
                                    SubLObject pre_island = cadr(proto_island);
                                    SubLObject island = Mapping.mapcar(symbol_function(FIRST), pre_island);
                                    if (island_nodes.equal($list_alt26)) {
                                        nil_islands = append(nil_islands, island);
                                    } else {
                                        islands = cons(island, islands);
                                    }
                                }
                            }
                        }
                        if ((NIL != fully_bound_islandP) && (NIL != nil_islands)) {
                            islands = cons(nil_islands, islands);
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(islands, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * This creates islands by shared variables.  All fully-bound literals are put in the
     * same island (which is returned unless FULLY-BOUND-ISLAND? is NIL).
     */
    @LispMethod(comment = "This creates islands by shared variables.  All fully-bound literals are put in the\r\nsame island (which is returned unless FULLY-BOUND-ISLAND? is NIL).\nThis creates islands by shared variables.  All fully-bound literals are put in the\nsame island (which is returned unless FULLY-BOUND-ISLAND? is NIL).")
    public static SubLObject sksi_crm_form_islands(final SubLObject pos_lits_subclause_spec, final SubLObject contextualized_dnf_clause, SubLObject fully_bound_islandP) {
        if (fully_bound_islandP == UNPROVIDED) {
            fully_bound_islandP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vars = NIL;
        SubLObject prepared_spec = NIL;
        SubLObject islands = NIL;
        SubLObject cdolist_list_var = pos_lits_subclause_spec;
        SubLObject lit_num = NIL;
        lit_num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lit_vars = clause_literal_variables(contextualized_dnf_clause, $POS, lit_num);
            vars = append(vars, lit_vars, NIL);
            prepared_spec = cons(list(lit_num, lit_vars), prepared_spec);
            cdolist_list_var = cdolist_list_var.rest();
            lit_num = cdolist_list_var.first();
        } 
        vars = cons(NIL, list_utilities.fast_delete_duplicates(vars, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        thread.resetMultipleValues();
        final SubLObject connected_proto_islands = graph_utilities.categorize_nodes_via_links(vars, prepared_spec, UNPROVIDED);
        final SubLObject isolated_proto_islands = thread.secondMultipleValue();
        final SubLObject naked_proto_islands = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject nil_islands = NIL;
        SubLObject cdolist_list_var2 = connected_proto_islands;
        SubLObject proto_island = NIL;
        proto_island = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject pre_island = cadr(proto_island);
            final SubLObject island = Mapping.mapcar(symbol_function(FIRST), pre_island);
            islands = cons(island, islands);
            cdolist_list_var2 = cdolist_list_var2.rest();
            proto_island = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = isolated_proto_islands;
        proto_island = NIL;
        proto_island = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject island_nodes = proto_island.first();
            final SubLObject pre_island2 = cadr(proto_island);
            final SubLObject island2 = Mapping.mapcar(symbol_function(FIRST), pre_island2);
            if (island_nodes.equal($list31)) {
                nil_islands = append(nil_islands, island2);
            } else {
                islands = cons(island2, islands);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            proto_island = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = naked_proto_islands;
        proto_island = NIL;
        proto_island = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject island_nodes = proto_island.first();
            final SubLObject pre_island2 = cadr(proto_island);
            final SubLObject island2 = Mapping.mapcar(symbol_function(FIRST), pre_island2);
            if (island_nodes.equal($list31)) {
                nil_islands = append(nil_islands, island2);
            } else {
                islands = cons(island2, islands);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            proto_island = cdolist_list_var2.first();
        } 
        if ((NIL != fully_bound_islandP) && (NIL != nil_islands)) {
            islands = cons(nil_islands, islands);
        }
        return list_utilities.fast_delete_duplicates(islands, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sksi_crm_literal_coherentP_alt(SubLObject lit, SubLObject mt, SubLObject lit_meaning_sentence_gafs, SubLObject physical_schemata, SubLObject sks) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_literal_coherent(lit, mt, lit_meaning_sentence_gafs, physical_schemata, sks));
    }

    public static SubLObject sksi_crm_literal_coherentP(final SubLObject lit, final SubLObject mt, final SubLObject lit_meaning_sentence_gafs, final SubLObject physical_schemata, final SubLObject sks) {
        return list_utilities.sublisp_boolean(sksi_crm_literal_coherent(lit, mt, lit_meaning_sentence_gafs, physical_schemata, sks));
    }

    /**
     * A literal is coherent just in case:
     * - whenever a variable has multiple occurrences, the corresponding logical field
     * indexicals are commensurate and have at least some decoding in common
     * - whenever all the meaning sentence predicates are logical fields, the literal
     * predicate is either a variable or reformulatable
     */
    @LispMethod(comment = "A literal is coherent just in case:\r\n- whenever a variable has multiple occurrences, the corresponding logical field\r\nindexicals are commensurate and have at least some decoding in common\r\n- whenever all the meaning sentence predicates are logical fields, the literal\r\npredicate is either a variable or reformulatable\nA literal is coherent just in case:\n- whenever a variable has multiple occurrences, the corresponding logical field\nindexicals are commensurate and have at least some decoding in common\n- whenever all the meaning sentence predicates are logical fields, the literal\npredicate is either a variable or reformulatable")
    public static final SubLObject sksi_crm_literal_coherent_alt(SubLObject lit, SubLObject mt, SubLObject lit_meaning_sentence_gafs, SubLObject physical_schemata, SubLObject sks) {
        {
            SubLObject inverse_lit = sksi_conjunctive_removal_module_utilities.invert_lit(lit);
            SubLObject lit_vars = cycl_utilities.expression_gather(lit, VARIABLE_P, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject new_lit_meaning_sentence_gafs = NIL;
            SubLObject cdolist_list_var = lit_meaning_sentence_gafs;
            SubLObject meaning_sentence_gaf = NIL;
            for (meaning_sentence_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meaning_sentence_gaf = cdolist_list_var.first()) {
                {
                    SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
                    SubLObject genl_pred_incoherentP = NIL;
                    SubLObject genl_inverse_incoherentP = NIL;
                    if (NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(meaning_sentence, lit, mt, UNPROVIDED)) {
                        if (NIL == genl_pred_incoherentP) {
                            {
                                SubLObject csome_list_var = lit_vars;
                                SubLObject lit_var = NIL;
                                for (lit_var = csome_list_var.first(); !((NIL != genl_pred_incoherentP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit_var = csome_list_var.first()) {
                                    {
                                        SubLObject var_positions = list_utilities.tree_positions(lit_var, lit, symbol_function(EQ), UNPROVIDED);
                                        if (NIL == list_utilities.singletonP(var_positions)) {
                                            if (NIL == com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_literal_coherent_int(meaning_sentence, var_positions, physical_schemata)) {
                                                genl_pred_incoherentP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(meaning_sentence, lit, mt, UNPROVIDED)) {
                        if (NIL == genl_inverse_incoherentP) {
                            {
                                SubLObject csome_list_var = lit_vars;
                                SubLObject lit_var = NIL;
                                for (lit_var = csome_list_var.first(); !((NIL != genl_inverse_incoherentP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit_var = csome_list_var.first()) {
                                    {
                                        SubLObject var_positions = list_utilities.tree_positions(lit_var, inverse_lit, symbol_function(EQ), UNPROVIDED);
                                        if (NIL == list_utilities.singletonP(var_positions)) {
                                            if (NIL == com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_literal_coherent_int(meaning_sentence, var_positions, physical_schemata)) {
                                                genl_inverse_incoherentP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!((NIL != genl_pred_incoherentP) && (NIL != genl_inverse_incoherentP))) {
                        new_lit_meaning_sentence_gafs = cons(meaning_sentence_gaf, new_lit_meaning_sentence_gafs);
                    }
                }
            }
            return new_lit_meaning_sentence_gafs;
        }
    }

    /**
     * A literal is coherent just in case:
     * - whenever a variable has multiple occurrences, the corresponding logical field
     * indexicals are commensurate and have at least some decoding in common
     * - whenever all the meaning sentence predicates are logical fields, the literal
     * predicate is either a variable or reformulatable
     */
    @LispMethod(comment = "A literal is coherent just in case:\r\n- whenever a variable has multiple occurrences, the corresponding logical field\r\nindexicals are commensurate and have at least some decoding in common\r\n- whenever all the meaning sentence predicates are logical fields, the literal\r\npredicate is either a variable or reformulatable\nA literal is coherent just in case:\n- whenever a variable has multiple occurrences, the corresponding logical field\nindexicals are commensurate and have at least some decoding in common\n- whenever all the meaning sentence predicates are logical fields, the literal\npredicate is either a variable or reformulatable")
    public static SubLObject sksi_crm_literal_coherent(final SubLObject lit, final SubLObject mt, final SubLObject lit_meaning_sentence_gafs, final SubLObject physical_schemata, final SubLObject sks) {
        final SubLObject inverse_lit = sksi_conjunctive_removal_module_utilities.invert_lit(lit);
        final SubLObject lit_vars = cycl_utilities.expression_gather(lit, VARIABLE_P, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_lit_meaning_sentence_gafs = NIL;
        SubLObject cdolist_list_var = lit_meaning_sentence_gafs;
        SubLObject meaning_sentence_gaf = NIL;
        meaning_sentence_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
            SubLObject genl_pred_incoherentP = NIL;
            SubLObject genl_inverse_incoherentP = NIL;
            if ((NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(meaning_sentence, lit, mt, UNPROVIDED)) && (NIL == genl_pred_incoherentP)) {
                SubLObject csome_list_var = lit_vars;
                SubLObject lit_var = NIL;
                lit_var = csome_list_var.first();
                while ((NIL == genl_pred_incoherentP) && (NIL != csome_list_var)) {
                    final SubLObject var_positions = list_utilities.tree_positions(lit_var, lit, symbol_function(EQ), UNPROVIDED);
                    if ((NIL == list_utilities.singletonP(var_positions)) && (NIL == sksi_crm_literal_coherent_int(meaning_sentence, var_positions, physical_schemata))) {
                        genl_pred_incoherentP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    lit_var = csome_list_var.first();
                } 
            }
            if ((NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(meaning_sentence, lit, mt, UNPROVIDED)) && (NIL == genl_inverse_incoherentP)) {
                SubLObject csome_list_var = lit_vars;
                SubLObject lit_var = NIL;
                lit_var = csome_list_var.first();
                while ((NIL == genl_inverse_incoherentP) && (NIL != csome_list_var)) {
                    final SubLObject var_positions = list_utilities.tree_positions(lit_var, inverse_lit, symbol_function(EQ), UNPROVIDED);
                    if ((NIL == list_utilities.singletonP(var_positions)) && (NIL == sksi_crm_literal_coherent_int(meaning_sentence, var_positions, physical_schemata))) {
                        genl_inverse_incoherentP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    lit_var = csome_list_var.first();
                } 
            }
            if ((NIL == genl_pred_incoherentP) || (NIL == genl_inverse_incoherentP)) {
                new_lit_meaning_sentence_gafs = cons(meaning_sentence_gaf, new_lit_meaning_sentence_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence_gaf = cdolist_list_var.first();
        } 
        return new_lit_meaning_sentence_gafs;
    }

    public static final SubLObject sksi_crm_literal_coherent_int_alt(SubLObject meaning_sentence, SubLObject positions, SubLObject physical_schemata) {
        {
            SubLObject meaning_sentence_terms = list_utilities.fast_delete_duplicates(list_utilities.tree_nths(positions, meaning_sentence), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject coherentP = NIL;
            if (NIL != list_utilities.singletonP(meaning_sentence_terms)) {
                coherentP = T;
            } else {
                {
                    SubLObject term0 = find_if(LOGICAL_FIELD_INDEXICAL_P, meaning_sentence_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != term0) {
                        {
                            SubLObject other_terms = remove(term0, meaning_sentence_terms, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject incoherentP = NIL;
                            if (NIL == incoherentP) {
                                {
                                    SubLObject csome_list_var = other_terms;
                                    SubLObject v_term = NIL;
                                    for (v_term = csome_list_var.first(); !((NIL != incoherentP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                        if (NIL != logical_field_indexical_p(v_term)) {
                                            incoherentP = makeBoolean(NIL == sksi_conjunctive_removal_module_utilities.logical_field_indexicals_joinableP(term0, v_term, physical_schemata));
                                        } else {
                                            incoherentP = T;
                                        }
                                    }
                                }
                            }
                            coherentP = makeBoolean(NIL == incoherentP);
                        }
                    }
                }
            }
            return coherentP;
        }
    }

    public static SubLObject sksi_crm_literal_coherent_int(final SubLObject meaning_sentence, final SubLObject positions, final SubLObject physical_schemata) {
        final SubLObject meaning_sentence_terms = list_utilities.fast_delete_duplicates(list_utilities.tree_nths(positions, meaning_sentence), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject coherentP = NIL;
        if (NIL != list_utilities.singletonP(meaning_sentence_terms)) {
            coherentP = T;
        } else {
            final SubLObject term0 = find_if(LOGICAL_FIELD_INDEXICAL_P, meaning_sentence_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != term0) {
                final SubLObject other_terms = remove(term0, meaning_sentence_terms, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject incoherentP = NIL;
                if (NIL == incoherentP) {
                    SubLObject csome_list_var = other_terms;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var.first();
                    while ((NIL == incoherentP) && (NIL != csome_list_var)) {
                        if (NIL != sksi_kb_accessors.logical_field_indexical_p(v_term)) {
                            incoherentP = makeBoolean(NIL == sksi_conjunctive_removal_module_utilities.logical_field_indexicals_joinableP(term0, v_term, physical_schemata));
                        } else {
                            incoherentP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    } 
                }
                coherentP = makeBoolean(NIL == incoherentP);
            }
        }
        return coherentP;
    }

    /**
     * Two literals are coherent together just in case for every variable they have in
     * common, the corresponding logical field indexicals are joinable.
     */
    @LispMethod(comment = "Two literals are coherent together just in case for every variable they have in\r\ncommon, the corresponding logical field indexicals are joinable.\nTwo literals are coherent together just in case for every variable they have in\ncommon, the corresponding logical field indexicals are joinable.")
    public static final SubLObject sksi_crm_literals_coherent_together_alt(SubLObject lit0, SubLObject lit0_meaning_sentence_gafs, SubLObject lit1, SubLObject lit1_meaning_sentence_gafs, SubLObject physical_schemata) {
        {
            SubLObject inverse_lit0 = sksi_conjunctive_removal_module_utilities.invert_lit(lit0);
            SubLObject inverse_lit1 = sksi_conjunctive_removal_module_utilities.invert_lit(lit1);
            SubLObject coherent = NIL;
            SubLObject cdolist_list_var = lit0_meaning_sentence_gafs;
            SubLObject lit0_meaning_sentence_gaf = NIL;
            for (lit0_meaning_sentence_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit0_meaning_sentence_gaf = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_6 = lit1_meaning_sentence_gafs;
                    SubLObject lit1_meaning_sentence_gaf = NIL;
                    for (lit1_meaning_sentence_gaf = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , lit1_meaning_sentence_gaf = cdolist_list_var_6.first()) {
                        coherent = append(com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_literals_coherent_together_int(lit0, inverse_lit0, lit1, inverse_lit1, lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf, physical_schemata), coherent);
                    }
                }
            }
            return coherent;
        }
    }

    /**
     * Two literals are coherent together just in case for every variable they have in
     * common, the corresponding logical field indexicals are joinable.
     */
    @LispMethod(comment = "Two literals are coherent together just in case for every variable they have in\r\ncommon, the corresponding logical field indexicals are joinable.\nTwo literals are coherent together just in case for every variable they have in\ncommon, the corresponding logical field indexicals are joinable.")
    public static SubLObject sksi_crm_literals_coherent_together(final SubLObject lit0, final SubLObject lit0_meaning_sentence_gafs, final SubLObject lit1, final SubLObject lit1_meaning_sentence_gafs, final SubLObject physical_schemata) {
        final SubLObject inverse_lit0 = sksi_conjunctive_removal_module_utilities.invert_lit(lit0);
        final SubLObject inverse_lit2 = sksi_conjunctive_removal_module_utilities.invert_lit(lit1);
        SubLObject coherent = NIL;
        SubLObject cdolist_list_var = lit0_meaning_sentence_gafs;
        SubLObject lit0_meaning_sentence_gaf = NIL;
        lit0_meaning_sentence_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = lit1_meaning_sentence_gafs;
            SubLObject lit1_meaning_sentence_gaf = NIL;
            lit1_meaning_sentence_gaf = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                coherent = append(sksi_crm_literals_coherent_together_int(lit0, inverse_lit0, lit1, inverse_lit2, lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf, physical_schemata), coherent);
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                lit1_meaning_sentence_gaf = cdolist_list_var_$8.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            lit0_meaning_sentence_gaf = cdolist_list_var.first();
        } 
        return coherent;
    }

    public static final SubLObject sksi_crm_literals_coherent_together_int_alt(SubLObject lit0, SubLObject inverse_lit0, SubLObject lit1, SubLObject inverse_lit1, SubLObject lit0_meaning_sentence_gaf, SubLObject lit1_meaning_sentence_gaf, SubLObject physical_schemata) {
        {
            SubLObject lit0_meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(lit0_meaning_sentence_gaf, UNPROVIDED);
            SubLObject lit1_meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(lit1_meaning_sentence_gaf, UNPROVIDED);
            SubLObject coherent = NIL;
            if (((NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(lit0)) || (NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(lit0_meaning_sentence))) || (NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(lit0_meaning_sentence, lit0, UNPROVIDED, UNPROVIDED))) {
                if (((NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(lit1)) || (NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(lit1_meaning_sentence))) || (NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(lit1_meaning_sentence, lit1, UNPROVIDED, UNPROVIDED))) {
                    if (NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(lit0, lit0_meaning_sentence, lit1, lit1_meaning_sentence, physical_schemata)) {
                        coherent = cons(list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
                    }
                }
                if (NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(lit1_meaning_sentence, lit1, UNPROVIDED, UNPROVIDED)) {
                    if (NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(lit0, lit0_meaning_sentence, inverse_lit1, lit1_meaning_sentence, physical_schemata)) {
                        coherent = cons(list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
                    }
                }
            }
            if (NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(lit0_meaning_sentence, lit0, UNPROVIDED, UNPROVIDED)) {
                if (((NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(lit1)) || (NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(lit1_meaning_sentence))) || (NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(lit1_meaning_sentence, lit1, UNPROVIDED, UNPROVIDED))) {
                    if (NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(inverse_lit0, lit0_meaning_sentence, lit1, lit1_meaning_sentence, physical_schemata)) {
                        coherent = cons(list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
                    }
                }
                if (NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(lit1_meaning_sentence, lit1, UNPROVIDED, UNPROVIDED)) {
                    if (NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(inverse_lit0, lit0_meaning_sentence, inverse_lit1, lit1_meaning_sentence, physical_schemata)) {
                        coherent = cons(list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
                    }
                }
            }
            return coherent;
        }
    }

    public static SubLObject sksi_crm_literals_coherent_together_int(final SubLObject lit0, final SubLObject inverse_lit0, final SubLObject lit1, final SubLObject inverse_lit1, final SubLObject lit0_meaning_sentence_gaf, final SubLObject lit1_meaning_sentence_gaf, final SubLObject physical_schemata) {
        final SubLObject lit0_meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(lit0_meaning_sentence_gaf, UNPROVIDED);
        final SubLObject lit1_meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(lit1_meaning_sentence_gaf, UNPROVIDED);
        SubLObject coherent = NIL;
        if (((NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(lit0)) || (NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(lit0_meaning_sentence))) || (NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(lit0_meaning_sentence, lit0, UNPROVIDED, UNPROVIDED))) {
            if ((((NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(lit1)) || (NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(lit1_meaning_sentence))) || (NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(lit1_meaning_sentence, lit1, UNPROVIDED, UNPROVIDED))) && (NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(lit0, lit0_meaning_sentence, lit1, lit1_meaning_sentence, physical_schemata))) {
                coherent = cons(list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
            }
            if ((NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(lit1_meaning_sentence, lit1, UNPROVIDED, UNPROVIDED)) && (NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(lit0, lit0_meaning_sentence, inverse_lit1, lit1_meaning_sentence, physical_schemata))) {
                coherent = cons(list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
            }
        }
        if (NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(lit0_meaning_sentence, lit0, UNPROVIDED, UNPROVIDED)) {
            if ((((NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP(lit1)) || (NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(lit1_meaning_sentence))) || (NIL != sksi_conjunctive_removal_module_utilities.genl_pred_meaning_sentenceP(lit1_meaning_sentence, lit1, UNPROVIDED, UNPROVIDED))) && (NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(inverse_lit0, lit0_meaning_sentence, lit1, lit1_meaning_sentence, physical_schemata))) {
                coherent = cons(list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
            }
            if ((NIL != sksi_conjunctive_removal_module_utilities.genl_inverse_meaning_sentenceP(lit1_meaning_sentence, lit1, UNPROVIDED, UNPROVIDED)) && (NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(inverse_lit0, lit0_meaning_sentence, inverse_lit1, lit1_meaning_sentence, physical_schemata))) {
                coherent = cons(list(lit0_meaning_sentence_gaf, lit1_meaning_sentence_gaf), coherent);
            }
        }
        return coherent;
    }

    /**
     * This makes sure that if all the asents of ASENTS are fully unbound, then all the relevant
     * physical schemata are enumerable.
     */
    @LispMethod(comment = "This makes sure that if all the asents of ASENTS are fully unbound, then all the relevant\r\nphysical schemata are enumerable.\nThis makes sure that if all the asents of ASENTS are fully unbound, then all the relevant\nphysical schemata are enumerable.")
    public static final SubLObject sksi_crm_enumerability_check_asents_alt(SubLObject asents, SubLObject comparison_asents, SubLObject evaluate_asents, SubLObject sksi_unknown_sentence_asents, SubLObject meaning_sentence_gafs) {
        return makeBoolean(((NIL == com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_fully_unbound_asentsP(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs)) || (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_enumerability_check(meaning_sentence_gafs))) && ((NIL == sksi_unknown_sentence_asents) || (NIL == com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_unbound_unknown_sentence_asentsP(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs))));
    }

    /**
     * This makes sure that if all the asents of ASENTS are fully unbound, then all the relevant
     * physical schemata are enumerable.
     */
    @LispMethod(comment = "This makes sure that if all the asents of ASENTS are fully unbound, then all the relevant\r\nphysical schemata are enumerable.\nThis makes sure that if all the asents of ASENTS are fully unbound, then all the relevant\nphysical schemata are enumerable.")
    public static SubLObject sksi_crm_enumerability_check_asents(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs) {
        return makeBoolean(((NIL == sksi_crm_fully_unbound_asentsP(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs)) || (NIL != sksi_crm_enumerability_check(meaning_sentence_gafs))) && ((NIL == sksi_unknown_sentence_asents) || (NIL == sksi_crm_unbound_unknown_sentence_asentsP(asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs))));
    }

    public static final SubLObject sksi_crm_unbound_unknown_sentence_asentsP_alt(SubLObject asents, SubLObject comparison_asents, SubLObject evaluate_asents, SubLObject sksi_unknown_sentence_asents, SubLObject meaning_sentence_gafs) {
        {
            SubLObject unboundP = NIL;
            SubLObject all_asent_vars = Mapping.mapcan(CONTEXTUALIZED_LITERAL_HL_VARIABLES, asents, EMPTY_SUBL_OBJECT_ARRAY);
            if (NIL == unboundP) {
                {
                    SubLObject csome_list_var = sksi_unknown_sentence_asents;
                    SubLObject unkown_sentence_asent = NIL;
                    for (unkown_sentence_asent = csome_list_var.first(); !((NIL != unboundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , unkown_sentence_asent = csome_list_var.first()) {
                        if (NIL == list_utilities.fast_subsetP(com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.contextualized_literal_hl_variables(unkown_sentence_asent), all_asent_vars, UNPROVIDED)) {
                            unboundP = T;
                        }
                    }
                }
            }
            return unboundP;
        }
    }

    public static SubLObject sksi_crm_unbound_unknown_sentence_asentsP(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs) {
        SubLObject unboundP = NIL;
        final SubLObject all_asent_vars = append(Mapping.mapcan(CONTEXTUALIZED_LITERAL_HL_VARIABLES, asents, EMPTY_SUBL_OBJECT_ARRAY), Mapping.mapcan(CONTEXTUALIZED_LITERAL_HL_VARIABLES, comparison_asents, EMPTY_SUBL_OBJECT_ARRAY), Mapping.mapcan(CONTEXTUALIZED_LITERAL_HL_VARIABLES, evaluate_asents, EMPTY_SUBL_OBJECT_ARRAY));
        if (NIL == unboundP) {
            SubLObject csome_list_var = sksi_unknown_sentence_asents;
            SubLObject unknown_sentence_asent = NIL;
            unknown_sentence_asent = csome_list_var.first();
            while ((NIL == unboundP) && (NIL != csome_list_var)) {
                if (NIL == list_utilities.fast_subsetP(contextualized_literal_hl_variables(unknown_sentence_asent), all_asent_vars, UNPROVIDED)) {
                    unboundP = T;
                }
                csome_list_var = csome_list_var.rest();
                unknown_sentence_asent = csome_list_var.first();
            } 
        }
        return unboundP;
    }

    public static final SubLObject sksi_crm_enumerability_check_alt(SubLObject meaning_sentence_gafs) {
        {
            SubLObject physical_schemata = com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.collect_physical_schemata_from_meaning_sentence_gafs(meaning_sentence_gafs);
            SubLObject non_enumerableP = NIL;
            if (NIL == non_enumerableP) {
                {
                    SubLObject csome_list_var = physical_schemata;
                    SubLObject physical_schema = NIL;
                    for (physical_schema = csome_list_var.first(); !((NIL != non_enumerableP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , physical_schema = csome_list_var.first()) {
                        {
                            SubLObject pred_var = $$enumerableSchema;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(physical_schema, ONE_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(physical_schema, ONE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $FALSE, NIL);
                                                        {
                                                            SubLObject done_var_7 = NIL;
                                                            SubLObject token_var_8 = NIL;
                                                            while (NIL == done_var_7) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                                    SubLObject valid_9 = makeBoolean(token_var_8 != assertion);
                                                                    if (NIL != valid_9) {
                                                                        non_enumerableP = T;
                                                                    }
                                                                    done_var_7 = makeBoolean(NIL == valid_9);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                            try {
                                                                bind($is_thread_performing_cleanupP$, T);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == non_enumerableP);
        }
    }

    public static SubLObject sksi_crm_enumerability_check(final SubLObject meaning_sentence_gafs) {
        final SubLObject physical_schemata = collect_physical_schemata_from_meaning_sentence_gafs(meaning_sentence_gafs);
        SubLObject non_enumerableP = NIL;
        if (NIL == non_enumerableP) {
            SubLObject csome_list_var = physical_schemata;
            SubLObject physical_schema = NIL;
            physical_schema = csome_list_var.first();
            while ((NIL == non_enumerableP) && (NIL != csome_list_var)) {
                final SubLObject pred_var = $$enumerableSchema;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(physical_schema, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(physical_schema, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $FALSE, NIL);
                                SubLObject done_var_$9 = NIL;
                                final SubLObject token_var_$10 = NIL;
                                while (NIL == done_var_$9) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                    final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(assertion));
                                    if (NIL != valid_$11) {
                                        non_enumerableP = T;
                                    }
                                    done_var_$9 = makeBoolean(NIL == valid_$11);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                csome_list_var = csome_list_var.rest();
                physical_schema = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == non_enumerableP);
    }

    /**
     * This returns T iff either the removal module applies to only one physical schema or the query involves
     * multiple physical schemata.
     */
    @LispMethod(comment = "This returns T iff either the removal module applies to only one physical schema or the query involves\r\nmultiple physical schemata.\nThis returns T iff either the removal module applies to only one physical schema or the query involves\nmultiple physical schemata.")
    public static final SubLObject sksi_crm_multi_table_check_alt(SubLObject meaning_sentence_gafs, SubLObject physical_schemata) {
        return makeBoolean((NIL != list_utilities.singletonP(physical_schemata)) || (NIL == list_utilities.singletonP(com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.collect_physical_schemata_from_meaning_sentence_gafs(meaning_sentence_gafs))));
    }

    /**
     * This returns T iff either the removal module applies to only one physical schema or the query involves
     * multiple physical schemata.
     */
    @LispMethod(comment = "This returns T iff either the removal module applies to only one physical schema or the query involves\r\nmultiple physical schemata.\nThis returns T iff either the removal module applies to only one physical schema or the query involves\nmultiple physical schemata.")
    public static SubLObject sksi_crm_multi_table_check(final SubLObject meaning_sentence_gafs, final SubLObject physical_schemata) {
        return makeBoolean((NIL != list_utilities.singletonP(physical_schemata)) || (NIL == list_utilities.singletonP(collect_physical_schemata_from_meaning_sentence_gafs(meaning_sentence_gafs))));
    }

    public static final SubLObject sksi_crm_fully_unbound_asentsP_alt(SubLObject asents, SubLObject comparison_asents, SubLObject evaluate_asents, SubLObject sksi_unknown_sentence_asents, SubLObject meaning_sentence_gafs) {
        {
            SubLObject boundP = list_utilities.any_in_list($sym33$SKSI_CRM_ANY_FULLY_BOUND_ARG_, comparison_asents, CONTEXTUALIZED_ASENT_ASENT);
            if (NIL == boundP) {
                if (NIL == boundP) {
                    {
                        SubLObject asent = NIL;
                        SubLObject asent_10 = NIL;
                        SubLObject meaning_sentence_gaf = NIL;
                        SubLObject meaning_sentence_gaf_11 = NIL;
                        for (asent = asents, asent_10 = asent.first(), meaning_sentence_gaf = meaning_sentence_gafs, meaning_sentence_gaf_11 = meaning_sentence_gaf.first(); !((NIL != boundP) || ((NIL == meaning_sentence_gaf) && (NIL == asent))); asent = asent.rest() , asent_10 = asent.first() , meaning_sentence_gaf = meaning_sentence_gaf.rest() , meaning_sentence_gaf_11 = meaning_sentence_gaf.first()) {
                            {
                                SubLObject lit = inference_datastructures_problem_query.contextualized_asent_asent(asent_10);
                                SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf_11, UNPROVIDED);
                                if (NIL == com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_fully_unbound_for_meaning_sentenceP(lit, meaning_sentence)) {
                                    boundP = T;
                                }
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == boundP);
        }
    }

    public static SubLObject sksi_crm_fully_unbound_asentsP(final SubLObject asents, final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, final SubLObject meaning_sentence_gafs) {
        SubLObject boundP = list_utilities.any_in_list($sym38$SKSI_CRM_ANY_FULLY_BOUND_ARG_, comparison_asents, CONTEXTUALIZED_ASENT_ASENT);
        if ((NIL == boundP) && (NIL == boundP)) {
            SubLObject asent = NIL;
            SubLObject asent_$12 = NIL;
            SubLObject meaning_sentence_gaf = NIL;
            SubLObject meaning_sentence_gaf_$13 = NIL;
            asent = asents;
            asent_$12 = asent.first();
            meaning_sentence_gaf = meaning_sentence_gafs;
            meaning_sentence_gaf_$13 = meaning_sentence_gaf.first();
            while ((NIL == boundP) && ((NIL != meaning_sentence_gaf) || (NIL != asent))) {
                final SubLObject lit = inference_datastructures_problem_query.contextualized_asent_asent(asent_$12);
                final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf_$13, UNPROVIDED);
                if (NIL == sksi_crm_fully_unbound_for_meaning_sentenceP(lit, meaning_sentence)) {
                    boundP = T;
                }
                asent = asent.rest();
                asent_$12 = asent.first();
                meaning_sentence_gaf = meaning_sentence_gaf.rest();
                meaning_sentence_gaf_$13 = meaning_sentence_gaf.first();
            } 
        }
        return makeBoolean(NIL == boundP);
    }

    public static final SubLObject sksi_crm_any_fully_bound_argP_alt(SubLObject formula) {
        return list_utilities.any_in_list(FULLY_BOUND_P, cycl_utilities.formula_args(formula, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject sksi_crm_any_fully_bound_argP(final SubLObject formula) {
        return list_utilities.any_in_list(FULLY_BOUND_P, cycl_utilities.formula_args(formula, UNPROVIDED), UNPROVIDED);
    }

    public static final SubLObject sksi_crm_fully_unbound_for_meaning_sentenceP_alt(SubLObject formula, SubLObject meaning_sentence) {
        {
            SubLObject formula_list = elf_to_list(formula);
            SubLObject ms_list = elf_to_list(meaning_sentence);
            return com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_fully_unbound_for_meaning_sentence_int(formula_list, ms_list);
        }
    }

    public static SubLObject sksi_crm_fully_unbound_for_meaning_sentenceP(final SubLObject formula, final SubLObject meaning_sentence) {
        final SubLObject formula_list = elf_to_list(formula);
        final SubLObject ms_list = elf_to_list(meaning_sentence);
        return sksi_crm_fully_unbound_for_meaning_sentence_int(formula_list, ms_list);
    }

    public static final SubLObject sksi_crm_fully_unbound_for_meaning_sentence_int_alt(SubLObject formula_tree, SubLObject ms_tree) {
        {
            SubLObject boundP = NIL;
            if (NIL != logical_field_indexical_p(ms_tree)) {
                boundP = makeBoolean(NIL == variables.variable_p(formula_tree));
            } else {
                if (ms_tree.isCons()) {
                    if (NIL == boundP) {
                        {
                            SubLObject formula_elt = NIL;
                            SubLObject formula_elt_12 = NIL;
                            SubLObject ms_elt = NIL;
                            SubLObject ms_elt_13 = NIL;
                            for (formula_elt = formula_tree, formula_elt_12 = formula_elt.first(), ms_elt = ms_tree, ms_elt_13 = ms_elt.first(); !((NIL != boundP) || ((NIL == ms_elt) && (NIL == formula_elt))); formula_elt = formula_elt.rest() , formula_elt_12 = formula_elt.first() , ms_elt = ms_elt.rest() , ms_elt_13 = ms_elt.first()) {
                                if (NIL == com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.sksi_crm_fully_unbound_for_meaning_sentence_int(formula_elt_12, ms_elt_13)) {
                                    boundP = T;
                                }
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == boundP);
        }
    }

    public static SubLObject sksi_crm_fully_unbound_for_meaning_sentence_int(final SubLObject formula_tree, final SubLObject ms_tree) {
        SubLObject boundP = NIL;
        if (NIL != sksi_kb_accessors.logical_field_indexical_p(ms_tree)) {
            boundP = makeBoolean(NIL == variables.variable_p(formula_tree));
        } else
            if (ms_tree.isCons() && (NIL == boundP)) {
                SubLObject formula_elt = NIL;
                SubLObject formula_elt_$14 = NIL;
                SubLObject ms_elt = NIL;
                SubLObject ms_elt_$15 = NIL;
                formula_elt = formula_tree;
                formula_elt_$14 = formula_elt.first();
                ms_elt = ms_tree;
                ms_elt_$15 = ms_elt.first();
                while ((NIL == boundP) && ((NIL != ms_elt) || (NIL != formula_elt))) {
                    if (NIL == sksi_crm_fully_unbound_for_meaning_sentence_int(formula_elt_$14, ms_elt_$15)) {
                        boundP = T;
                    }
                    formula_elt = formula_elt.rest();
                    formula_elt_$14 = formula_elt.first();
                    ms_elt = ms_elt.rest();
                    ms_elt_$15 = ms_elt.first();
                } 
            }

        return makeBoolean(NIL == boundP);
    }

    public static final SubLObject collect_physical_schemata_from_meaning_sentence_gafs_alt(SubLObject meaning_sentence_gafs) {
        {
            SubLObject physical_schemata = NIL;
            SubLObject cdolist_list_var = meaning_sentence_gafs;
            SubLObject meaning_sentence_gaf = NIL;
            for (meaning_sentence_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meaning_sentence_gaf = cdolist_list_var.first()) {
                if (NIL != sksi_meaning_sentence_utilities.gaf_assertion_is_conditional_meaning_sentence_gafP(meaning_sentence_gaf)) {
                    {
                        SubLObject ant_lses = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf);
                        SubLObject ant_ms = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(meaning_sentence_gaf);
                        SubLObject con_lses = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf);
                        SubLObject con_ms = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
                        physical_schemata = nconc(new SubLObject[]{ physical_schemata, Mapping.mapcan(LOGICAL_SCHEMA_PHYSICAL_SCHEMATA, ant_lses, EMPTY_SUBL_OBJECT_ARRAY), Mapping.mapcan(LOGICAL_SCHEMA_PHYSICAL_SCHEMATA, con_lses, EMPTY_SUBL_OBJECT_ARRAY), com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.collect_physical_schemata_from_meaning_sentence(ant_ms), com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.collect_physical_schemata_from_meaning_sentence(con_ms) });
                    }
                } else {
                    {
                        SubLObject ms = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
                        physical_schemata = nconc(physical_schemata, com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.collect_physical_schemata_from_meaning_sentence(ms));
                    }
                }
            }
            return list_utilities.fast_delete_duplicates(physical_schemata, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject collect_physical_schemata_from_meaning_sentence_gafs(final SubLObject meaning_sentence_gafs) {
        SubLObject physical_schemata = NIL;
        SubLObject cdolist_list_var = meaning_sentence_gafs;
        SubLObject meaning_sentence_gaf = NIL;
        meaning_sentence_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sksi_meaning_sentence_utilities.gaf_assertion_is_conditional_meaning_sentence_gafP(meaning_sentence_gaf)) {
                final SubLObject ant_lses = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf);
                final SubLObject ant_ms = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(meaning_sentence_gaf);
                final SubLObject con_lses = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf);
                final SubLObject con_ms = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
                physical_schemata = nconc(new SubLObject[]{ physical_schemata, Mapping.mapcan(LOGICAL_SCHEMA_PHYSICAL_SCHEMATA, ant_lses, EMPTY_SUBL_OBJECT_ARRAY), Mapping.mapcan(LOGICAL_SCHEMA_PHYSICAL_SCHEMATA, con_lses, EMPTY_SUBL_OBJECT_ARRAY), collect_physical_schemata_from_meaning_sentence(ant_ms), collect_physical_schemata_from_meaning_sentence(con_ms) });
            } else {
                final SubLObject ms = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
                physical_schemata = nconc(physical_schemata, collect_physical_schemata_from_meaning_sentence(ms));
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence_gaf = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(physical_schemata, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject collect_physical_schemata_from_meaning_sentence_alt(SubLObject meaning_sentence) {
        {
            SubLObject lfis = cycl_utilities.expression_gather(meaning_sentence, LOGICAL_FIELD_INDEXICAL_P, T, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
            SubLObject physical_schemata = NIL;
            SubLObject cdolist_list_var = lfis;
            SubLObject lfi = NIL;
            for (lfi = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lfi = cdolist_list_var.first()) {
                physical_schemata = append(com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.collect_physical_schemata_from_logical_field_indexical(lfi), physical_schemata);
            }
            return list_utilities.fast_delete_duplicates(physical_schemata, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject collect_physical_schemata_from_meaning_sentence(final SubLObject meaning_sentence) {
        final SubLObject lfis = cycl_utilities.expression_gather(meaning_sentence, LOGICAL_FIELD_INDEXICAL_P, T, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        SubLObject physical_schemata = NIL;
        SubLObject cdolist_list_var = lfis;
        SubLObject lfi = NIL;
        lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            physical_schemata = append(collect_physical_schemata_from_logical_field_indexical(lfi), physical_schemata);
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(physical_schemata, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject collect_physical_schemata_from_logical_field_indexical_internal_alt(SubLObject logical_field_indexical) {
        {
            SubLObject logical_field = logical_field_for_indexical(logical_field_indexical);
            SubLObject physical_schemata = NIL;
            SubLObject pred_var = $$logicalPhysicalFieldMap;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_field, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_field, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        {
                                            SubLObject done_var_14 = NIL;
                                            SubLObject token_var_15 = NIL;
                                            while (NIL == done_var_14) {
                                                {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_15);
                                                    SubLObject valid_16 = makeBoolean(token_var_15 != assertion);
                                                    if (NIL != valid_16) {
                                                        {
                                                            SubLObject physical_field = assertions_high.gaf_arg2(assertion);
                                                            SubLObject physical_schema = physical_field_schema(physical_field);
                                                            physical_schemata = cons(physical_schema, physical_schemata);
                                                        }
                                                    }
                                                    done_var_14 = makeBoolean(NIL == valid_16);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
            }
            return list_utilities.fast_delete_duplicates(physical_schemata, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject collect_physical_schemata_from_logical_field_indexical_internal(final SubLObject logical_field_indexical) {
        final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
        SubLObject physical_schemata = NIL;
        final SubLObject pred_var = $$logicalPhysicalFieldMap;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(logical_field, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(logical_field, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$16 = NIL;
                        final SubLObject token_var_$17 = NIL;
                        while (NIL == done_var_$16) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                            final SubLObject valid_$18 = makeBoolean(!token_var_$17.eql(assertion));
                            if (NIL != valid_$18) {
                                final SubLObject physical_field = assertions_high.gaf_arg2(assertion);
                                final SubLObject physical_schema = sksi_kb_accessors.physical_field_schema(physical_field);
                                physical_schemata = cons(physical_schema, physical_schemata);
                            }
                            done_var_$16 = makeBoolean(NIL == valid_$18);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return list_utilities.fast_delete_duplicates(physical_schemata, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject collect_physical_schemata_from_logical_field_indexical_alt(SubLObject logical_field_indexical) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.collect_physical_schemata_from_logical_field_indexical_internal(logical_field_indexical);
                }
                caching_state = memoization_state_lookup(v_memoization_state, COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = create_caching_state(memoization_state_lock(v_memoization_state), COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state_put(v_memoization_state, COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL, caching_state);
                }
                {
                    SubLObject results = caching_state_lookup(caching_state, logical_field_indexical, $kw40$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw40$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.collect_physical_schemata_from_logical_field_indexical_internal(logical_field_indexical)));
                        caching_state_put(caching_state, logical_field_indexical, results, UNPROVIDED);
                    }
                    return caching_results(results);
                }
            }
        }
    }

    public static SubLObject collect_physical_schemata_from_logical_field_indexical(final SubLObject logical_field_indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return collect_physical_schemata_from_logical_field_indexical_internal(logical_field_indexical);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, logical_field_indexical, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(collect_physical_schemata_from_logical_field_indexical_internal(logical_field_indexical)));
            memoization_state.caching_state_put(caching_state, logical_field_indexical, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Collects the variables that appear in the literal of CLAUSE denoted by SENSE and NUM.
     */
    @LispMethod(comment = "Collects the variables that appear in the literal of CLAUSE denoted by SENSE and NUM.")
    public static final SubLObject clause_literal_variables_alt(SubLObject clause, SubLObject sense, SubLObject num) {
        {
            SubLObject lit = clauses.clause_literal(clause, sense, num);
            return com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_applicability.contextualized_literal_variables(lit);
        }
    }

    /**
     * Collects the variables that appear in the literal of CLAUSE denoted by SENSE and NUM.
     */
    @LispMethod(comment = "Collects the variables that appear in the literal of CLAUSE denoted by SENSE and NUM.")
    public static SubLObject clause_literal_variables(final SubLObject clause, final SubLObject sense, final SubLObject num) {
        final SubLObject lit = clauses.clause_literal(clause, sense, num);
        return contextualized_literal_variables(lit);
    }

    /**
     * Collects the variables that appear in the contextualized literal LIT.
     */
    @LispMethod(comment = "Collects the variables that appear in the contextualized literal LIT.")
    public static final SubLObject contextualized_literal_variables_alt(SubLObject lit) {
        {
            SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
            return cycl_utilities.expression_gather(asent, $sym41$CYC_VAR_, NIL, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Collects the variables that appear in the contextualized literal LIT.
     */
    @LispMethod(comment = "Collects the variables that appear in the contextualized literal LIT.")
    public static SubLObject contextualized_literal_variables(final SubLObject lit) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
        return cycl_utilities.expression_gather(asent, $sym45$CYC_VAR_, NIL, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Collects the HL variables that appear in the contextualized literal LIT.
     */
    @LispMethod(comment = "Collects the HL variables that appear in the contextualized literal LIT.")
    public static final SubLObject contextualized_literal_hl_variables_alt(SubLObject lit) {
        {
            SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
            return cycl_utilities.expression_gather(asent, $sym42$HL_VAR_, NIL, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Collects the HL variables that appear in the contextualized literal LIT.
     */
    @LispMethod(comment = "Collects the HL variables that appear in the contextualized literal LIT.")
    public static SubLObject contextualized_literal_hl_variables(final SubLObject lit) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
        return cycl_utilities.expression_gather(asent, $sym46$HL_VAR_, NIL, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_sksi_conjunctive_removal_modules_applicability_file() {
        declareFunction("removal_sksi_conjunction_pos_lits_applicability", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-APPLICABILITY", 2, 0, false);
        declareFunction("removal_sksi_conjunction_pos_lits_applicability_int", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-APPLICABILITY-INT", 2, 0, false);
        declareFunction("sksi_crm_profile_relevantP", "SKSI-CRM-PROFILE-RELEVANT?", 2, 0, false);
        declareFunction("sksi_crm_sks_relevantP", "SKSI-CRM-SKS-RELEVANT?", 2, 0, false);
        declareFunction("sksi_crm_genl_ks", "SKSI-CRM-GENL-KS", 1, 0, false);
        declareFunction("sksi_crm_get_subclause_candidates", "SKSI-CRM-GET-SUBCLAUSE-CANDIDATES", 2, 0, false);
        declareFunction("sks_supports_evaluation_asentsP", "SKS-SUPPORTS-EVALUATION-ASENTS?", 1, 0, false);
        declareFunction("sksi_supported_evaluate_asentP", "SKSI-SUPPORTED-EVALUATE-ASENT?", 1, 0, false);
        declareFunction("sksi_crm_fully_forbidden_comparison_operators_internal", "SKSI-CRM-FULLY-FORBIDDEN-COMPARISON-OPERATORS-INTERNAL", 1, 0, false);
        declareFunction("sksi_crm_fully_forbidden_comparison_operators", "SKSI-CRM-FULLY-FORBIDDEN-COMPARISON-OPERATORS", 1, 0, false);
        declareMacro("with_sksi_crm_pos_subclause_spec_gathering", "WITH-SKSI-CRM-POS-SUBCLAUSE-SPEC-GATHERING");
        declareFunction("sksi_crm_add_pos_subclause_spec", "SKSI-CRM-ADD-POS-SUBCLAUSE-SPEC", 1, 0, false);
        declareFunction("sksi_crm_reject_pos_subclause_spec", "SKSI-CRM-REJECT-POS-SUBCLAUSE-SPEC", 1, 0, false);
        declareFunction("sksi_crm_pos_subclause_spec_irrelevantP", "SKSI-CRM-POS-SUBCLAUSE-SPEC-IRRELEVANT?", 1, 0, false);
        declareFunction("sksi_crm_gather_literals", "SKSI-CRM-GATHER-LITERALS", 7, 0, false);
        declareFunction("sksi_crm_gather_literals_iterative", "SKSI-CRM-GATHER-LITERALS-ITERATIVE", 8, 0, false);
        declareFunction("pos_subclause_spec_G", "POS-SUBCLAUSE-SPEC->", 2, 0, false);
        new sksi_conjunctive_removal_modules_applicability.$pos_subclause_spec_G$BinaryFunction();
        declareFunction("sksi_crm_gather_literals_recursive", "SKSI-CRM-GATHER-LITERALS-RECURSIVE", 8, 0, false);
        declareFunction("sksi_crm_gather_literals_recursive_continue_recursion", "SKSI-CRM-GATHER-LITERALS-RECURSIVE-CONTINUE-RECURSION", 8, 0, false);
        declareFunction("sksi_crm_valid_queryP", "SKSI-CRM-VALID-QUERY?", 8, 0, false);
        declareFunction("sksi_crm_valid_query_int", "SKSI-CRM-VALID-QUERY-INT", 6, 0, false);
        declareFunction("sksi_crm_applicability_iterate_over_meaning_sentence_gafs", "SKSI-CRM-APPLICABILITY-ITERATE-OVER-MEANING-SENTENCE-GAFS", 9, 0, false);
        declareFunction("sksi_crm_applicability_process_meaning_sentence_gafs", "SKSI-CRM-APPLICABILITY-PROCESS-MEANING-SENTENCE-GAFS", 6, 0, false);
        declareFunction("sksi_crm_applicability_iterate_over_asents", "SKSI-CRM-APPLICABILITY-ITERATE-OVER-ASENTS", 9, 0, false);
        declareFunction("sksi_crm_asents_generate_csqlP", "SKSI-CRM-ASENTS-GENERATE-CSQL?", 6, 0, false);
        declareFunction("sksi_crm_asents_generate_sqlP", "SKSI-CRM-ASENTS-GENERATE-SQL?", 6, 0, false);
        declareFunction("sksi_crm_form_islands", "SKSI-CRM-FORM-ISLANDS", 2, 1, false);
        declareFunction("sksi_crm_literal_coherentP", "SKSI-CRM-LITERAL-COHERENT?", 5, 0, false);
        declareFunction("sksi_crm_literal_coherent", "SKSI-CRM-LITERAL-COHERENT", 5, 0, false);
        declareFunction("sksi_crm_literal_coherent_int", "SKSI-CRM-LITERAL-COHERENT-INT", 3, 0, false);
        declareFunction("sksi_crm_literals_coherent_together", "SKSI-CRM-LITERALS-COHERENT-TOGETHER", 5, 0, false);
        declareFunction("sksi_crm_literals_coherent_together_int", "SKSI-CRM-LITERALS-COHERENT-TOGETHER-INT", 7, 0, false);
        declareFunction("sksi_crm_enumerability_check_asents", "SKSI-CRM-ENUMERABILITY-CHECK-ASENTS", 5, 0, false);
        declareFunction("sksi_crm_unbound_unknown_sentence_asentsP", "SKSI-CRM-UNBOUND-UNKNOWN-SENTENCE-ASENTS?", 5, 0, false);
        declareFunction("sksi_crm_enumerability_check", "SKSI-CRM-ENUMERABILITY-CHECK", 1, 0, false);
        declareFunction("sksi_crm_multi_table_check", "SKSI-CRM-MULTI-TABLE-CHECK", 2, 0, false);
        declareFunction("sksi_crm_fully_unbound_asentsP", "SKSI-CRM-FULLY-UNBOUND-ASENTS?", 5, 0, false);
        declareFunction("sksi_crm_any_fully_bound_argP", "SKSI-CRM-ANY-FULLY-BOUND-ARG?", 1, 0, false);
        declareFunction("sksi_crm_fully_unbound_for_meaning_sentenceP", "SKSI-CRM-FULLY-UNBOUND-FOR-MEANING-SENTENCE?", 2, 0, false);
        declareFunction("sksi_crm_fully_unbound_for_meaning_sentence_int", "SKSI-CRM-FULLY-UNBOUND-FOR-MEANING-SENTENCE-INT", 2, 0, false);
        declareFunction("collect_physical_schemata_from_meaning_sentence_gafs", "COLLECT-PHYSICAL-SCHEMATA-FROM-MEANING-SENTENCE-GAFS", 1, 0, false);
        declareFunction("collect_physical_schemata_from_meaning_sentence", "COLLECT-PHYSICAL-SCHEMATA-FROM-MEANING-SENTENCE", 1, 0, false);
        declareFunction("collect_physical_schemata_from_logical_field_indexical_internal", "COLLECT-PHYSICAL-SCHEMATA-FROM-LOGICAL-FIELD-INDEXICAL-INTERNAL", 1, 0, false);
        declareFunction("collect_physical_schemata_from_logical_field_indexical", "COLLECT-PHYSICAL-SCHEMATA-FROM-LOGICAL-FIELD-INDEXICAL", 1, 0, false);
        declareFunction("clause_literal_variables", "CLAUSE-LITERAL-VARIABLES", 3, 0, false);
        declareFunction("contextualized_literal_variables", "CONTEXTUALIZED-LITERAL-VARIABLES", 1, 0, false);
        declareFunction("contextualized_literal_hl_variables", "CONTEXTUALIZED-LITERAL-HL-VARIABLES", 1, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$SKSI_conjunctive_removal_was_appl = makeString("SKSI conjunctive removal was applicable to problem ");

    static private final SubLString $str_alt2$_but_was_lacking_this___sksiUnkno = makeString(" but was lacking this #$sksiUnknownSentence literal: ");

    static private final SubLList $list_alt4 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLList $list_alt7 = list(list(makeSymbol("RESULT-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt9 = list(list(makeSymbol("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*"), NIL), list(makeSymbol("*SKSI-CRM-REJECTED-POS-SUBCLAUSE-SPECS*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUAL))));

    static private final SubLList $list_alt11 = list(list(makeSymbol("FIF"), makeSymbol("*SKSI-CRM-IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*"), list(makeSymbol("DELETE-SUBSUMED-ITEMS"), makeSymbol("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*"), list(QUOTE, makeSymbol("SUPERSETP"))), makeSymbol("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*")));

    static private final SubLSymbol $sym15$POS_SUBCLAUSE_SPEC__ = makeSymbol("POS-SUBCLAUSE-SPEC->");

    static private final SubLSymbol $sym16$_ = makeSymbol("=");

    static private final SubLList $list_alt17 = list(makeSymbol("MT"), makeSymbol("LIT"));

    static private final SubLString $str_alt21$SKSI_ = makeString("SKSI ");

    static private final SubLString $str_alt22$Could_not_form_a_CSQL_query_with_ = makeString("Could not form a CSQL query with:~%  Meaning sentence GAFs: ~a~%  Literals: ~a~% for the reason: ~a");

    static private final SubLString $str_alt23$__ = makeString("~%");

    static private final SubLList $list_alt26 = list(NIL);

    static private final SubLSymbol $sym33$SKSI_CRM_ANY_FULLY_BOUND_ARG_ = makeSymbol("SKSI-CRM-ANY-FULLY-BOUND-ARG?");

    public static final SubLSymbol $kw40$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym41$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLSymbol $sym42$HL_VAR_ = makeSymbol("HL-VAR?");

    public static SubLObject init_sksi_conjunctive_removal_modules_applicability_file() {
        defparameter("*SKSI-CRM-IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*", T);
        deflexical("*SKSI-CRM-APPLICABILITY-MAX-TIME-ENABLED?*", T);
        defparameter("*SKSI-CRM-APPLICABILITY-MAX-TIME-OVERRIDE*", NIL);
        defparameter("*SKSI-CRM-APPLICABILITY-START-TIME*", NIL);
        defparameter("*SKSI-CRM-GATHERED-POS-SUBCLAUSE-SPECS*", NIL);
        defparameter("*SKSI-CRM-REJECTED-POS-SUBCLAUSE-SPECS*", NIL);
        defparameter("*SKSI-CRM-GATHER-LITERALS-USING-ITERATIVE-METHOD?*", T);
        defparameter("*SKSI-CRM-GATHER-LITERALS-ITERATIVE-METHOD-RETURN-FIRST-SUCCESS?*", T);
        defparameter("*SKSI-CRM-GATHER-LITERALS-STOP-IF-TOTAL-SUBCLAUSE-SPECS-FAILS-ENUMERABILITY-OPTIMIZATION?*", T);
        defparameter("*SKSI-CRM-GATHER-LITERALS-SUBCLAUSE-SPECS-FAILED-DUE-TO-ENUMERABILITY?*", NIL);
        return NIL;
    }

    public static SubLObject setup_sksi_conjunctive_removal_modules_applicability_file() {
        memoization_state.note_memoized_function(SKSI_CRM_FULLY_FORBIDDEN_COMPARISON_OPERATORS);
        memoization_state.note_memoized_function(COLLECT_PHYSICAL_SCHEMATA_FROM_LOGICAL_FIELD_INDEXICAL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_conjunctive_removal_modules_applicability_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_conjunctive_removal_modules_applicability_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_conjunctive_removal_modules_applicability_file();
    }

    static {
    }

    public static final class $pos_subclause_spec_G$BinaryFunction extends BinaryFunction {
        public $pos_subclause_spec_G$BinaryFunction() {
            super(extractFunctionNamed("POS-SUBCLAUSE-SPEC->"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pos_subclause_spec_G(arg1, arg2);
        }
    }
}

/**
 * Total time: 639 ms
 */
