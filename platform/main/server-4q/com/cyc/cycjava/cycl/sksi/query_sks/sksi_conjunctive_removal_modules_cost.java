package com.cyc.cycjava.cycl.sksi.query_sks;


import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$expensive_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.$removal_cost_cutoff$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_conjunctive_removal_modules_cost extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_conjunctive_removal_modules_cost();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost";

    public static final String myFingerPrint = "5ae1f41277cdfbf3a0fe51c5950d70d90a4d45c5cb82d34c812d73f724140815";

    // defvar
    public static final SubLSymbol $sksi_strongly_prefer_conjunctive_removal_modulesP$ = makeSymbol("*SKSI-STRONGLY-PREFER-CONJUNCTIVE-REMOVAL-MODULES?*");

    // defparameter
    private static final SubLSymbol $phoenix_hospitals_hackP$ = makeSymbol("*PHOENIX-HOSPITALS-HACK?*");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$RDFTripleStore_Physical = reader_make_constant_shell(makeString("RDFTripleStore-Physical"));





    private static final SubLFloat $float$0_01 = makeDouble(0.01);





    private static final SubLList $list8 = list(reader_make_constant_shell(makeString("CATS-KS")), reader_make_constant_shell(makeString("CATS-hospital-KS")));



    public static final SubLList $list10 = list(makeSymbol("MT"), makeSymbol("ASENT"));



    public static final SubLSymbol $sym12$MEANING_SENTENCE_GAF_COMPLETE_ = makeSymbol("MEANING-SENTENCE-GAF-COMPLETE?");

    private static final SubLList $list13 = list(reader_make_constant_shell(makeString("objectFoundInLocation")), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Hospital"))), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("USCity"))));

    public static final SubLList $list14 = list(makeSymbol("FIRST"), makeSymbol("SECOND"));

    public static final SubLList $list15 = list(reader_make_constant_shell(makeString("objectFoundInLocation")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("USCity"))));

    public static final SubLList $list16 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), reader_make_constant_shell(makeString("Hospital")));

    public static final SubLList $list17 = list(reader_make_constant_shell(makeString("objectFoundInLocation")), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Hospital"))), makeKeyword("NOT-FULLY-BOUND"));

    public static final SubLList $list18 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), reader_make_constant_shell(makeString("USCity")));

    public static final SubLList $list19 = list(makeSymbol("FIRST"), makeSymbol("SECOND"), makeSymbol("THIRD"));

    public static final SubLList $list20 = list(reader_make_constant_shell(makeString("objectFoundInLocation")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));

    public static SubLObject removal_sksi_conjunction_pos_lits_cost(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        return sksi_query_cost_contextualized_dnf(contextualized_dnf_clause, sks);
    }

    public static SubLObject sksi_query_cost_contextualized_dnf(final SubLObject contextualized_dnf_clause, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = sksi_query_utilities.look_up_sksi_query_cost_contextualized_dnf(contextualized_dnf_clause, sks, UNPROVIDED);
        SubLObject sks_type = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            sks_type = sksi_kb_accessors.sk_source_ks_type(sks);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != kb_utilities.kbeq(sks_type, $$RDFTripleStore_Physical)) {
            if (NIL == number_utilities.positive_number_p(cost)) {
                cost = guess_cost_from_literals_rdf_store(contextualized_dnf_clause, sks);
            }
        } else
            if (NIL == cost) {
                cost = guess_cost_from_literals(contextualized_dnf_clause, sks);
            }

        return cost;
    }

    public static SubLObject guess_cost_from_literals(final SubLObject contextualized_dnf_clause, final SubLObject sks) {
        SubLObject costs = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
            final SubLObject asent_cost = sksi_query_utilities.look_up_sksi_query_cost_asent_sense(asent, $POS, sks, UNPROVIDED);
            if (NIL != asent_cost) {
                costs = cons(asent_cost, costs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return guess_cost_from_literal_costs(costs);
    }

    public static SubLObject guess_cost_from_literal_costs(final SubLObject costs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = NIL;
        if (NIL != costs) {
            final SubLObject min_cost = apply(MIN, costs);
            cost = (min_cost.isZero()) ? min_cost : max(adjust_cost_guess(min_cost), $float$0_01);
        } else {
            cost = adjust_cost_guess(sksi_query_utilities.$sksi_default_query_cost$.getGlobalValue());
        }
        cost = min(cost, number_utilities.f_1_($removal_cost_cutoff$.getDynamicValue(thread)));
        if (NIL != list_utilities.every_in_list(ZEROP, costs, UNPROVIDED)) {
            cost = ZERO_INTEGER;
        } else {
            cost = max(cost, $expensive_hl_module_check_cost$.getGlobalValue());
        }
        return cost;
    }

    public static SubLObject adjust_cost_guess(final SubLObject cost) {
        return divide(cost, THREE_INTEGER);
    }

    public static SubLObject guess_cost_from_literals_rdf_store(final SubLObject contextualized_dnf_clause, final SubLObject sks) {
        SubLObject costs = NIL;
        SubLObject focused_costs = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
            final SubLObject focused_cost_estimateP = numGE(length(cycl_utilities.formula_gather(asent, INDEXED_TERM_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), TWO_INTEGER);
            final SubLObject asent_cost = sksi_query_utilities.look_up_sksi_query_cost_asent_sense(asent, $POS, sks, UNPROVIDED);
            if (NIL != number_utilities.positive_number_p(asent_cost)) {
                if (NIL != focused_cost_estimateP) {
                    focused_costs = cons(asent_cost, focused_costs);
                }
                costs = cons(asent_cost, costs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        final SubLObject focused_cost = guess_cost_from_literal_costs_rdf_triple_store(focused_costs);
        if ((NIL != focused_cost) && ZERO_INTEGER.numG(focused_cost)) {
            return focused_cost;
        }
        return guess_cost_from_literal_costs_rdf_triple_store(costs);
    }

    public static SubLObject guess_cost_from_literal_costs_rdf_triple_store(final SubLObject costs) {
        SubLObject cost = ZERO_INTEGER;
        if (NIL != costs) {
            cost = apply(MIN, costs);
            SubLObject cdotimes_end_var;
            SubLObject n;
            for (cdotimes_end_var = subtract(length(costs), ONE_INTEGER), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                cost = truncate(divide(cost, TWO_INTEGER), UNPROVIDED);
            }
        }
        return cost;
    }

    public static SubLObject removal_sksi_conjunction_pos_lits_completeness(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject completeness = NIL;
        if (((NIL != $phoenix_hospitals_hackP$.getDynamicValue(thread)) && (NIL != list_utilities.member_eqP(sksi_query_datastructures.sks_profile_sks(sks_profile), $list8))) && (NIL != hospitals_found_in_us_city(contextualized_dnf_clause, sks_profile))) {
            return $COMPLETE;
        }
        if (NIL != $sksi_strongly_prefer_conjunctive_removal_modulesP$.getDynamicValue(thread)) {
            completeness = $COMPLETE;
        } else {
            final SubLObject logical_schemata = sksi_query_datastructures.sks_profile_logical_schemata(sks_profile);
            final SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
            SubLObject ms_gaf_iterators = NIL;
            final SubLObject mt_var = mapping_mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
                SubLObject lit = NIL;
                lit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = lit;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list10);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list10);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        ms_gaf_iterators = cons(sksi_conjunctive_removal_module_utilities.get_meaning_sentence_gaf_iterator_for_asent(asent, logical_schemata, T, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED), ms_gaf_iterators);
                    } else {
                        cdestructuring_bind_error(datum, $list10);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lit = cdolist_list_var.first();
                } 
                completeness = removal_sksi_conjunction_pos_lits_completeness_int(ms_gaf_iterators);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return completeness;
    }

    public static SubLObject removal_sksi_conjunction_pos_lits_completeness_int(final SubLObject ms_gaf_iterators) {
        return NIL != removal_sksi_conjunction_pos_lits_completeness_int_recursive(NIL, ms_gaf_iterators) ? $COMPLETE : $INCOMPLETE;
    }

    public static SubLObject removal_sksi_conjunction_pos_lits_completeness_int_recursive(final SubLObject gafs_so_far, final SubLObject remaining_iterators) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        if (NIL == remaining_iterators) {
            SubLObject failureP = NIL;
            if (NIL == failureP) {
                SubLObject csome_list_var;
                SubLObject gaf;
                for (csome_list_var = gafs_so_far, gaf = NIL, gaf = csome_list_var.first(); (NIL == failureP) && (NIL != csome_list_var); failureP = makeBoolean(NIL == meaning_sentence_gaf_completeP(gaf)) , csome_list_var = csome_list_var.rest() , gaf = csome_list_var.first()) {
                }
            }
            successP = makeBoolean(NIL == failureP);
        } else {
            final SubLObject iterator = remaining_iterators.first();
            if (NIL != iterator) {
                SubLObject valid;
                for (SubLObject done_var = successP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != successP))) {
                    thread.resetMultipleValues();
                    final SubLObject gaf = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        successP = removal_sksi_conjunction_pos_lits_completeness_int_recursive(cons(gaf, gafs_so_far), remaining_iterators.rest());
                    }
                }
                if (NIL == successP) {
                    iteration.reset_reusable_iterator(iterator);
                }
            } else {
                successP = removal_sksi_conjunction_pos_lits_completeness_int_recursive(gafs_so_far, remaining_iterators.rest());
            }
        }
        return successP;
    }

    public static SubLObject meaning_sentence_gaf_completeP_internal(final SubLObject meaning_sentence_gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject logical_schemata = sksi_meaning_sentence_utilities.get_relevant_logical_schemata_and_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
        final SubLObject meaning_sentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject predicate = cycl_utilities.formula_operator(meaning_sentence);
        SubLObject incompleteP = NIL;
        if (NIL == incompleteP) {
            SubLObject csome_list_var = logical_schemata;
            SubLObject logical_schema = NIL;
            logical_schema = csome_list_var.first();
            while ((NIL == incompleteP) && (NIL != csome_list_var)) {
                if (NIL == sksi_kb_accessors.logical_schema_complete_extent_known_for_predicateP(logical_schema, predicate, UNPROVIDED)) {
                    incompleteP = T;
                }
                csome_list_var = csome_list_var.rest();
                logical_schema = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == incompleteP);
    }

    public static SubLObject meaning_sentence_gaf_completeP(final SubLObject meaning_sentence_gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return meaning_sentence_gaf_completeP_internal(meaning_sentence_gaf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym12$MEANING_SENTENCE_GAF_COMPLETE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym12$MEANING_SENTENCE_GAF_COMPLETE_, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym12$MEANING_SENTENCE_GAF_COMPLETE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, meaning_sentence_gaf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(meaning_sentence_gaf_completeP_internal(meaning_sentence_gaf)));
            memoization_state.caching_state_put(caching_state, meaning_sentence_gaf, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject hospitals_found_in_us_city(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = second(clause_utilities.decontextualize_contextualized_clause(contextualized_dnf_clause));
        SubLObject result = NIL;
        final SubLObject mt_var = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = hospitals_found_in_us_city_int(pos_lits);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject hospitals_found_in_us_city_int(final SubLObject pos_lits) {
        final SubLObject pcase_var = length(pos_lits);
        if (pcase_var.eql(ONE_INTEGER)) {
            return formula_pattern_match.pattern_matches_formula($list13, pos_lits.first());
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            SubLObject first = NIL;
            SubLObject second = NIL;
            destructuring_bind_must_consp(pos_lits, pos_lits, $list14);
            first = pos_lits.first();
            SubLObject current = pos_lits.rest();
            destructuring_bind_must_consp(current, pos_lits, $list14);
            second = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != formula_pattern_match.pattern_matches_formula($list15, first)) {
                    return makeBoolean((NIL != formula_pattern_match.pattern_matches_formula($list16, second)) && cycl_utilities.formula_arg1(first, UNPROVIDED).equal(cycl_utilities.formula_arg1(second, UNPROVIDED)));
                }
                if (NIL != formula_pattern_match.pattern_matches_formula($list17, first)) {
                    return makeBoolean((NIL != formula_pattern_match.pattern_matches_formula($list18, second)) && cycl_utilities.formula_arg2(first, UNPROVIDED).equal(cycl_utilities.formula_arg1(second, UNPROVIDED)));
                }
                if (NIL != formula_pattern_match.pattern_matches_formula($list16, first)) {
                    return makeBoolean((NIL != formula_pattern_match.pattern_matches_formula($list15, second)) && cycl_utilities.formula_arg1(first, UNPROVIDED).equal(cycl_utilities.formula_arg1(second, UNPROVIDED)));
                }
                if (NIL != formula_pattern_match.pattern_matches_formula($list18, first)) {
                    return makeBoolean((NIL != formula_pattern_match.pattern_matches_formula($list17, second)) && cycl_utilities.formula_arg1(first, UNPROVIDED).equal(cycl_utilities.formula_arg2(second, UNPROVIDED)));
                }
                return NIL;
            } else {
                cdestructuring_bind_error(pos_lits, $list14);
            }
        } else {
            if (!pcase_var.eql(THREE_INTEGER)) {
                return NIL;
            }
            SubLObject first = NIL;
            SubLObject second = NIL;
            SubLObject third = NIL;
            destructuring_bind_must_consp(pos_lits, pos_lits, $list19);
            first = pos_lits.first();
            SubLObject current = pos_lits.rest();
            destructuring_bind_must_consp(current, pos_lits, $list19);
            second = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, pos_lits, $list19);
            third = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != formula_pattern_match.pattern_matches_formula($list20, first)) {
                    if ((NIL != formula_pattern_match.pattern_matches_formula($list16, second)) && cycl_utilities.formula_arg1(first, UNPROVIDED).equal(cycl_utilities.formula_arg1(second, UNPROVIDED))) {
                        return makeBoolean((NIL != formula_pattern_match.pattern_matches_formula($list18, third)) && cycl_utilities.formula_arg2(first, UNPROVIDED).equal(cycl_utilities.formula_arg1(third, UNPROVIDED)));
                    }
                    if ((NIL != formula_pattern_match.pattern_matches_formula($list18, second)) && cycl_utilities.formula_arg2(first, UNPROVIDED).equal(cycl_utilities.formula_arg1(second, UNPROVIDED))) {
                        return makeBoolean((NIL != formula_pattern_match.pattern_matches_formula($list16, third)) && cycl_utilities.formula_arg1(first, UNPROVIDED).equal(cycl_utilities.formula_arg1(third, UNPROVIDED)));
                    }
                    return NIL;
                } else
                    if (NIL != formula_pattern_match.pattern_matches_formula($list16, first)) {
                        if ((NIL != formula_pattern_match.pattern_matches_formula($list20, second)) && cycl_utilities.formula_arg1(first, UNPROVIDED).equal(cycl_utilities.formula_arg1(second, UNPROVIDED))) {
                            return makeBoolean((NIL != formula_pattern_match.pattern_matches_formula($list18, third)) && cycl_utilities.formula_arg2(second, UNPROVIDED).equal(cycl_utilities.formula_arg1(third, UNPROVIDED)));
                        }
                        if (NIL != formula_pattern_match.pattern_matches_formula($list18, second)) {
                            return makeBoolean(((NIL != formula_pattern_match.pattern_matches_formula($list20, third)) && cycl_utilities.formula_arg1(first, UNPROVIDED).equal(cycl_utilities.formula_arg1(third, UNPROVIDED))) && cycl_utilities.formula_arg1(second, UNPROVIDED).equal(cycl_utilities.formula_arg2(third, UNPROVIDED)));
                        }
                        return NIL;
                    } else {
                        if (NIL == formula_pattern_match.pattern_matches_formula($list18, first)) {
                            return NIL;
                        }
                        if ((NIL != formula_pattern_match.pattern_matches_formula($list20, second)) && cycl_utilities.formula_arg1(first, UNPROVIDED).equal(cycl_utilities.formula_arg2(second, UNPROVIDED))) {
                            return makeBoolean((NIL != formula_pattern_match.pattern_matches_formula($list16, third)) && cycl_utilities.formula_arg2(second, UNPROVIDED).equal(cycl_utilities.formula_arg1(third, UNPROVIDED)));
                        }
                        if (NIL != formula_pattern_match.pattern_matches_formula($list16, second)) {
                            return makeBoolean(((NIL != formula_pattern_match.pattern_matches_formula($list20, third)) && cycl_utilities.formula_arg1(first, UNPROVIDED).equal(cycl_utilities.formula_arg2(third, UNPROVIDED))) && cycl_utilities.formula_arg1(second, UNPROVIDED).equal(cycl_utilities.formula_arg1(third, UNPROVIDED)));
                        }
                        return NIL;
                    }

            } else {
                cdestructuring_bind_error(pos_lits, $list19);
            }
        }
        return NIL;
    }

    public static SubLObject declare_sksi_conjunctive_removal_modules_cost_file() {
        declareFunction(me, "removal_sksi_conjunction_pos_lits_cost", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-COST", 2, 0, false);
        declareFunction(me, "sksi_query_cost_contextualized_dnf", "SKSI-QUERY-COST-CONTEXTUALIZED-DNF", 2, 0, false);
        declareFunction(me, "guess_cost_from_literals", "GUESS-COST-FROM-LITERALS", 2, 0, false);
        declareFunction(me, "guess_cost_from_literal_costs", "GUESS-COST-FROM-LITERAL-COSTS", 1, 0, false);
        declareFunction(me, "adjust_cost_guess", "ADJUST-COST-GUESS", 1, 0, false);
        declareFunction(me, "guess_cost_from_literals_rdf_store", "GUESS-COST-FROM-LITERALS-RDF-STORE", 2, 0, false);
        declareFunction(me, "guess_cost_from_literal_costs_rdf_triple_store", "GUESS-COST-FROM-LITERAL-COSTS-RDF-TRIPLE-STORE", 1, 0, false);
        declareFunction(me, "removal_sksi_conjunction_pos_lits_completeness", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-COMPLETENESS", 2, 0, false);
        declareFunction(me, "removal_sksi_conjunction_pos_lits_completeness_int", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-COMPLETENESS-INT", 1, 0, false);
        declareFunction(me, "removal_sksi_conjunction_pos_lits_completeness_int_recursive", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-COMPLETENESS-INT-RECURSIVE", 2, 0, false);
        declareFunction(me, "meaning_sentence_gaf_completeP_internal", "MEANING-SENTENCE-GAF-COMPLETE?-INTERNAL", 1, 0, false);
        declareFunction(me, "meaning_sentence_gaf_completeP", "MEANING-SENTENCE-GAF-COMPLETE?", 1, 0, false);
        declareFunction(me, "hospitals_found_in_us_city", "HOSPITALS-FOUND-IN-US-CITY", 2, 0, false);
        declareFunction(me, "hospitals_found_in_us_city_int", "HOSPITALS-FOUND-IN-US-CITY-INT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_conjunctive_removal_modules_cost_file() {
        defvar("*SKSI-STRONGLY-PREFER-CONJUNCTIVE-REMOVAL-MODULES?*", T);
        defparameter("*PHOENIX-HOSPITALS-HACK?*", NIL);
        return NIL;
    }

    public static SubLObject setup_sksi_conjunctive_removal_modules_cost_file() {
        memoization_state.note_memoized_function($sym12$MEANING_SENTENCE_GAF_COMPLETE_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_conjunctive_removal_modules_cost_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_conjunctive_removal_modules_cost_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_conjunctive_removal_modules_cost_file();
    }

    static {
























    }
}

/**
 * Total time: 157 ms
 */
