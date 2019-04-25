package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_conjunctive_removal_modules_cost extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost";
    public static final String myFingerPrint = "5ae1f41277cdfbf3a0fe51c5950d70d90a4d45c5cb82d34c812d73f724140815";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 857L)
    public static SubLSymbol $sksi_strongly_prefer_conjunctive_removal_modulesP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 4488L)
    private static SubLSymbol $phoenix_hospitals_hackP$;
    private static final SubLSymbol $sym0$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const1$EverythingPSC;
    private static final SubLObject $const2$RDFTripleStore_Physical;
    private static final SubLSymbol $kw3$POS;
    private static final SubLSymbol $sym4$MIN;
    private static final SubLFloat $float5$0_01;
    private static final SubLSymbol $sym6$ZEROP;
    private static final SubLSymbol $sym7$INDEXED_TERM_P;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$COMPLETE;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$INCOMPLETE;
    private static final SubLSymbol $sym12$MEANING_SENTENCE_GAF_COMPLETE_;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLList $list20;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 1196L)
    public static SubLObject removal_sksi_conjunction_pos_lits_cost(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        return sksi_query_cost_contextualized_dnf(contextualized_dnf_clause, sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 1445L)
    public static SubLObject sksi_query_cost_contextualized_dnf(final SubLObject contextualized_dnf_clause, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = sksi_query_utilities.look_up_sksi_query_cost_contextualized_dnf(contextualized_dnf_clause, sks, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED);
        SubLObject sks_type = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_conjunctive_removal_modules_cost.$sym0$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(sksi_conjunctive_removal_modules_cost.$const1$EverythingPSC, thread);
            sks_type = sksi_kb_accessors.sk_source_ks_type(sks);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (sksi_conjunctive_removal_modules_cost.NIL != kb_utilities.kbeq(sks_type, sksi_conjunctive_removal_modules_cost.$const2$RDFTripleStore_Physical)) {
            if (sksi_conjunctive_removal_modules_cost.NIL == number_utilities.positive_number_p(cost)) {
                cost = guess_cost_from_literals_rdf_store(contextualized_dnf_clause, sks);
            }
        }
        else if (sksi_conjunctive_removal_modules_cost.NIL == cost) {
            cost = guess_cost_from_literals(contextualized_dnf_clause, sks);
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 2041L)
    public static SubLObject guess_cost_from_literals(final SubLObject contextualized_dnf_clause, final SubLObject sks) {
        SubLObject costs = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        lit = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_cost.NIL != cdolist_list_var) {
            final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
            final SubLObject asent_cost = sksi_query_utilities.look_up_sksi_query_cost_asent_sense(asent, (SubLObject)sksi_conjunctive_removal_modules_cost.$kw3$POS, sks, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED);
            if (sksi_conjunctive_removal_modules_cost.NIL != asent_cost) {
                costs = (SubLObject)ConsesLow.cons(asent_cost, costs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return guess_cost_from_literal_costs(costs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 2412L)
    public static SubLObject guess_cost_from_literal_costs(final SubLObject costs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        if (sksi_conjunctive_removal_modules_cost.NIL != costs) {
            final SubLObject min_cost = Functions.apply((SubLObject)sksi_conjunctive_removal_modules_cost.$sym4$MIN, costs);
            cost = (min_cost.isZero() ? min_cost : Numbers.max(adjust_cost_guess(min_cost), (SubLObject)sksi_conjunctive_removal_modules_cost.$float5$0_01));
        }
        else {
            cost = adjust_cost_guess(sksi_query_utilities.$sksi_default_query_cost$.getGlobalValue());
        }
        cost = Numbers.min(cost, number_utilities.f_1_(control_vars.$removal_cost_cutoff$.getDynamicValue(thread)));
        if (sksi_conjunctive_removal_modules_cost.NIL != list_utilities.every_in_list((SubLObject)sksi_conjunctive_removal_modules_cost.$sym6$ZEROP, costs, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)) {
            cost = (SubLObject)sksi_conjunctive_removal_modules_cost.ZERO_INTEGER;
        }
        else {
            cost = Numbers.max(cost, control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 3365L)
    public static SubLObject adjust_cost_guess(final SubLObject cost) {
        return Numbers.divide(cost, (SubLObject)sksi_conjunctive_removal_modules_cost.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 3429L)
    public static SubLObject guess_cost_from_literals_rdf_store(final SubLObject contextualized_dnf_clause, final SubLObject sks) {
        SubLObject costs = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        SubLObject focused_costs = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        lit = cdolist_list_var.first();
        while (sksi_conjunctive_removal_modules_cost.NIL != cdolist_list_var) {
            final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
            final SubLObject focused_cost_estimateP = Numbers.numGE(Sequences.length(cycl_utilities.formula_gather(asent, (SubLObject)sksi_conjunctive_removal_modules_cost.$sym7$INDEXED_TERM_P, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)), (SubLObject)sksi_conjunctive_removal_modules_cost.TWO_INTEGER);
            final SubLObject asent_cost = sksi_query_utilities.look_up_sksi_query_cost_asent_sense(asent, (SubLObject)sksi_conjunctive_removal_modules_cost.$kw3$POS, sks, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED);
            if (sksi_conjunctive_removal_modules_cost.NIL != number_utilities.positive_number_p(asent_cost)) {
                if (sksi_conjunctive_removal_modules_cost.NIL != focused_cost_estimateP) {
                    focused_costs = (SubLObject)ConsesLow.cons(asent_cost, focused_costs);
                }
                costs = (SubLObject)ConsesLow.cons(asent_cost, costs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        final SubLObject focused_cost = guess_cost_from_literal_costs_rdf_triple_store(focused_costs);
        if (sksi_conjunctive_removal_modules_cost.NIL != focused_cost && sksi_conjunctive_removal_modules_cost.ZERO_INTEGER.numG(focused_cost)) {
            return focused_cost;
        }
        return guess_cost_from_literal_costs_rdf_triple_store(costs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 4234L)
    public static SubLObject guess_cost_from_literal_costs_rdf_triple_store(final SubLObject costs) {
        SubLObject cost = (SubLObject)sksi_conjunctive_removal_modules_cost.ZERO_INTEGER;
        if (sksi_conjunctive_removal_modules_cost.NIL != costs) {
            cost = Functions.apply((SubLObject)sksi_conjunctive_removal_modules_cost.$sym4$MIN, costs);
            SubLObject cdotimes_end_var;
            SubLObject n;
            for (cdotimes_end_var = Numbers.subtract(Sequences.length(costs), (SubLObject)sksi_conjunctive_removal_modules_cost.ONE_INTEGER), n = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL, n = (SubLObject)sksi_conjunctive_removal_modules_cost.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)sksi_conjunctive_removal_modules_cost.ONE_INTEGER)) {
                cost = Numbers.truncate(Numbers.divide(cost, (SubLObject)sksi_conjunctive_removal_modules_cost.TWO_INTEGER), (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED);
            }
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 4589L)
    public static SubLObject removal_sksi_conjunction_pos_lits_completeness(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject completeness = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        if (sksi_conjunctive_removal_modules_cost.NIL != sksi_conjunctive_removal_modules_cost.$phoenix_hospitals_hackP$.getDynamicValue(thread) && sksi_conjunctive_removal_modules_cost.NIL != list_utilities.member_eqP(sksi_query_datastructures.sks_profile_sks(sks_profile), (SubLObject)sksi_conjunctive_removal_modules_cost.$list8) && sksi_conjunctive_removal_modules_cost.NIL != hospitals_found_in_us_city(contextualized_dnf_clause, sks_profile)) {
            return (SubLObject)sksi_conjunctive_removal_modules_cost.$kw9$COMPLETE;
        }
        if (sksi_conjunctive_removal_modules_cost.NIL != sksi_conjunctive_removal_modules_cost.$sksi_strongly_prefer_conjunctive_removal_modulesP$.getDynamicValue(thread)) {
            completeness = (SubLObject)sksi_conjunctive_removal_modules_cost.$kw9$COMPLETE;
        }
        else {
            final SubLObject logical_schemata = sksi_query_datastructures.sks_profile_logical_schemata(sks_profile);
            final SubLObject mapping_mt = sksi_query_datastructures.sks_profile_mapping_mt(sks_profile);
            SubLObject ms_gaf_iterators = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
            final SubLObject mt_var = mapping_mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
                SubLObject lit = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
                lit = cdolist_list_var.first();
                while (sksi_conjunctive_removal_modules_cost.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = lit;
                    SubLObject mt = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
                    SubLObject asent = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_cost.$list10);
                    mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_modules_cost.$list10);
                    asent = current.first();
                    current = current.rest();
                    if (sksi_conjunctive_removal_modules_cost.NIL == current) {
                        ms_gaf_iterators = (SubLObject)ConsesLow.cons(sksi_conjunctive_removal_module_utilities.get_meaning_sentence_gaf_iterator_for_asent(asent, logical_schemata, (SubLObject)sksi_conjunctive_removal_modules_cost.T, mt, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED), ms_gaf_iterators);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_modules_cost.$list10);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lit = cdolist_list_var.first();
                }
                completeness = removal_sksi_conjunction_pos_lits_completeness_int(ms_gaf_iterators);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return completeness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 5654L)
    public static SubLObject removal_sksi_conjunction_pos_lits_completeness_int(final SubLObject ms_gaf_iterators) {
        return (SubLObject)((sksi_conjunctive_removal_modules_cost.NIL != removal_sksi_conjunction_pos_lits_completeness_int_recursive((SubLObject)sksi_conjunctive_removal_modules_cost.NIL, ms_gaf_iterators)) ? sksi_conjunctive_removal_modules_cost.$kw9$COMPLETE : sksi_conjunctive_removal_modules_cost.$kw11$INCOMPLETE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 5872L)
    public static SubLObject removal_sksi_conjunction_pos_lits_completeness_int_recursive(final SubLObject gafs_so_far, final SubLObject remaining_iterators) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        if (sksi_conjunctive_removal_modules_cost.NIL == remaining_iterators) {
            SubLObject failureP = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
            if (sksi_conjunctive_removal_modules_cost.NIL == failureP) {
                SubLObject csome_list_var;
                SubLObject gaf;
                for (csome_list_var = gafs_so_far, gaf = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL, gaf = csome_list_var.first(); sksi_conjunctive_removal_modules_cost.NIL == failureP && sksi_conjunctive_removal_modules_cost.NIL != csome_list_var; failureP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL == meaning_sentence_gaf_completeP(gaf)), csome_list_var = csome_list_var.rest(), gaf = csome_list_var.first()) {}
            }
            successP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL == failureP);
        }
        else {
            final SubLObject iterator = remaining_iterators.first();
            if (sksi_conjunctive_removal_modules_cost.NIL != iterator) {
                SubLObject valid;
                for (SubLObject done_var = successP; sksi_conjunctive_removal_modules_cost.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL == valid || sksi_conjunctive_removal_modules_cost.NIL != successP)) {
                    thread.resetMultipleValues();
                    final SubLObject gaf = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (sksi_conjunctive_removal_modules_cost.NIL != valid) {
                        successP = removal_sksi_conjunction_pos_lits_completeness_int_recursive((SubLObject)ConsesLow.cons(gaf, gafs_so_far), remaining_iterators.rest());
                    }
                }
                if (sksi_conjunctive_removal_modules_cost.NIL == successP) {
                    iteration.reset_reusable_iterator(iterator);
                }
            }
            else {
                successP = removal_sksi_conjunction_pos_lits_completeness_int_recursive(gafs_so_far, remaining_iterators.rest());
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 6743L)
    public static SubLObject meaning_sentence_gaf_completeP_internal(final SubLObject meaning_sentence_gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject logical_schemata = sksi_meaning_sentence_utilities.get_relevant_logical_schemata_and_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED);
        final SubLObject meaning_sentence = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject predicate = cycl_utilities.formula_operator(meaning_sentence);
        SubLObject incompleteP = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        if (sksi_conjunctive_removal_modules_cost.NIL == incompleteP) {
            SubLObject csome_list_var = logical_schemata;
            SubLObject logical_schema = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
            logical_schema = csome_list_var.first();
            while (sksi_conjunctive_removal_modules_cost.NIL == incompleteP && sksi_conjunctive_removal_modules_cost.NIL != csome_list_var) {
                if (sksi_conjunctive_removal_modules_cost.NIL == sksi_kb_accessors.logical_schema_complete_extent_known_for_predicateP(logical_schema, predicate, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)) {
                    incompleteP = (SubLObject)sksi_conjunctive_removal_modules_cost.T;
                }
                csome_list_var = csome_list_var.rest();
                logical_schema = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL == incompleteP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 6743L)
    public static SubLObject meaning_sentence_gaf_completeP(final SubLObject meaning_sentence_gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        if (sksi_conjunctive_removal_modules_cost.NIL == v_memoization_state) {
            return meaning_sentence_gaf_completeP_internal(meaning_sentence_gaf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_modules_cost.$sym12$MEANING_SENTENCE_GAF_COMPLETE_, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED);
        if (sksi_conjunctive_removal_modules_cost.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_modules_cost.$sym12$MEANING_SENTENCE_GAF_COMPLETE_, (SubLObject)sksi_conjunctive_removal_modules_cost.ONE_INTEGER, (SubLObject)sksi_conjunctive_removal_modules_cost.NIL, (SubLObject)sksi_conjunctive_removal_modules_cost.EQ, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_modules_cost.$sym12$MEANING_SENTENCE_GAF_COMPLETE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, meaning_sentence_gaf, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(meaning_sentence_gaf_completeP_internal(meaning_sentence_gaf)));
            memoization_state.caching_state_put(caching_state, meaning_sentence_gaf, results, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 7282L)
    public static SubLObject hospitals_found_in_us_city(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = conses_high.second(clause_utilities.decontextualize_contextualized_clause(contextualized_dnf_clause));
        SubLObject result = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
        final SubLObject mt_var = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = hospitals_found_in_us_city_int(pos_lits);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-cost.lisp", position = 7671L)
    public static SubLObject hospitals_found_in_us_city_int(final SubLObject pos_lits) {
        final SubLObject pcase_var = Sequences.length(pos_lits);
        if (pcase_var.eql((SubLObject)sksi_conjunctive_removal_modules_cost.ONE_INTEGER)) {
            return formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list13, pos_lits.first());
        }
        if (pcase_var.eql((SubLObject)sksi_conjunctive_removal_modules_cost.TWO_INTEGER)) {
            SubLObject first = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
            SubLObject second = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(pos_lits, pos_lits, (SubLObject)sksi_conjunctive_removal_modules_cost.$list14);
            first = pos_lits.first();
            SubLObject current = pos_lits.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, pos_lits, (SubLObject)sksi_conjunctive_removal_modules_cost.$list14);
            second = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_modules_cost.NIL == current) {
                if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list15, first)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list16, second) && cycl_utilities.formula_arg1(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)));
                }
                if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list17, first)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list18, second) && cycl_utilities.formula_arg2(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)));
                }
                if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list16, first)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list15, second) && cycl_utilities.formula_arg1(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)));
                }
                if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list18, first)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list17, second) && cycl_utilities.formula_arg1(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg2(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)));
                }
                return (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(pos_lits, (SubLObject)sksi_conjunctive_removal_modules_cost.$list14);
            }
        }
        else {
            if (!pcase_var.eql((SubLObject)sksi_conjunctive_removal_modules_cost.THREE_INTEGER)) {
                return (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
            }
            SubLObject first = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
            SubLObject second = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
            SubLObject third = (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(pos_lits, pos_lits, (SubLObject)sksi_conjunctive_removal_modules_cost.$list19);
            first = pos_lits.first();
            SubLObject current = pos_lits.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, pos_lits, (SubLObject)sksi_conjunctive_removal_modules_cost.$list19);
            second = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, pos_lits, (SubLObject)sksi_conjunctive_removal_modules_cost.$list19);
            third = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_modules_cost.NIL == current) {
                if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list20, first)) {
                    if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list16, second) && cycl_utilities.formula_arg1(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED))) {
                        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list18, third) && cycl_utilities.formula_arg2(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(third, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)));
                    }
                    if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list18, second) && cycl_utilities.formula_arg2(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED))) {
                        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list16, third) && cycl_utilities.formula_arg1(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(third, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)));
                    }
                    return (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
                }
                else if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list16, first)) {
                    if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list20, second) && cycl_utilities.formula_arg1(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED))) {
                        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list18, third) && cycl_utilities.formula_arg2(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(third, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)));
                    }
                    if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list18, second)) {
                        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list20, third) && cycl_utilities.formula_arg1(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(third, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)) && cycl_utilities.formula_arg1(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg2(third, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)));
                    }
                    return (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
                }
                else {
                    if (sksi_conjunctive_removal_modules_cost.NIL == formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list18, first)) {
                        return (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
                    }
                    if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list20, second) && cycl_utilities.formula_arg1(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg2(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED))) {
                        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list16, third) && cycl_utilities.formula_arg2(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(third, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)));
                    }
                    if (sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list16, second)) {
                        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_modules_cost.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)sksi_conjunctive_removal_modules_cost.$list20, third) && cycl_utilities.formula_arg1(first, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg2(third, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)) && cycl_utilities.formula_arg1(second, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED).equal(cycl_utilities.formula_arg1(third, (SubLObject)sksi_conjunctive_removal_modules_cost.UNPROVIDED)));
                    }
                    return (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(pos_lits, (SubLObject)sksi_conjunctive_removal_modules_cost.$list19);
            }
        }
        return (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
    }
    
    public static SubLObject declare_sksi_conjunctive_removal_modules_cost_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "removal_sksi_conjunction_pos_lits_cost", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "sksi_query_cost_contextualized_dnf", "SKSI-QUERY-COST-CONTEXTUALIZED-DNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "guess_cost_from_literals", "GUESS-COST-FROM-LITERALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "guess_cost_from_literal_costs", "GUESS-COST-FROM-LITERAL-COSTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "adjust_cost_guess", "ADJUST-COST-GUESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "guess_cost_from_literals_rdf_store", "GUESS-COST-FROM-LITERALS-RDF-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "guess_cost_from_literal_costs_rdf_triple_store", "GUESS-COST-FROM-LITERAL-COSTS-RDF-TRIPLE-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "removal_sksi_conjunction_pos_lits_completeness", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "removal_sksi_conjunction_pos_lits_completeness_int", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-COMPLETENESS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "removal_sksi_conjunction_pos_lits_completeness_int_recursive", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-COMPLETENESS-INT-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "meaning_sentence_gaf_completeP_internal", "MEANING-SENTENCE-GAF-COMPLETE?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "meaning_sentence_gaf_completeP", "MEANING-SENTENCE-GAF-COMPLETE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "hospitals_found_in_us_city", "HOSPITALS-FOUND-IN-US-CITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost", "hospitals_found_in_us_city_int", "HOSPITALS-FOUND-IN-US-CITY-INT", 1, 0, false);
        return (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
    }
    
    public static SubLObject init_sksi_conjunctive_removal_modules_cost_file() {
        sksi_conjunctive_removal_modules_cost.$sksi_strongly_prefer_conjunctive_removal_modulesP$ = SubLFiles.defvar("*SKSI-STRONGLY-PREFER-CONJUNCTIVE-REMOVAL-MODULES?*", (SubLObject)sksi_conjunctive_removal_modules_cost.T);
        sksi_conjunctive_removal_modules_cost.$phoenix_hospitals_hackP$ = SubLFiles.defparameter("*PHOENIX-HOSPITALS-HACK?*", (SubLObject)sksi_conjunctive_removal_modules_cost.NIL);
        return (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
    }
    
    public static SubLObject setup_sksi_conjunctive_removal_modules_cost_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_modules_cost.$sym12$MEANING_SENTENCE_GAF_COMPLETE_);
        return (SubLObject)sksi_conjunctive_removal_modules_cost.NIL;
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
        me = (SubLFile)new sksi_conjunctive_removal_modules_cost();
        sksi_conjunctive_removal_modules_cost.$sksi_strongly_prefer_conjunctive_removal_modulesP$ = null;
        sksi_conjunctive_removal_modules_cost.$phoenix_hospitals_hackP$ = null;
        $sym0$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const1$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const2$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTripleStore-Physical"));
        $kw3$POS = SubLObjectFactory.makeKeyword("POS");
        $sym4$MIN = SubLObjectFactory.makeSymbol("MIN");
        $float5$0_01 = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $sym6$ZEROP = SubLObjectFactory.makeSymbol("ZEROP");
        $sym7$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $list8 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CATS-KS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CATS-hospital-KS")));
        $kw9$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $kw11$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $sym12$MEANING_SENTENCE_GAF_COMPLETE_ = SubLObjectFactory.makeSymbol("MEANING-SENTENCE-GAF-COMPLETE?");
        $list13 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hospital"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("USCity"))));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"));
        $list15 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("USCity"))));
        $list16 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hospital")));
        $list17 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hospital"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"));
        $list18 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("USCity")));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("THIRD"));
        $list20 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"));
    }
}

/*

	Total time: 157 ms
	
*/