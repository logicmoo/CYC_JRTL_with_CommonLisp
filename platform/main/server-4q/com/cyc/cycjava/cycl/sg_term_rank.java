/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SG-TERM-RANK
 *  source file: /cyc/top/cycl/sg-term-rank.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class sg_term_rank extends SubLTranslatedFile implements V02 {
    // // Constructor
    private sg_term_rank() {
    }

    public static final SubLFile me = new sg_term_rank();

    public static final String myName = "com.cyc.cycjava.cycl.sg_term_rank";

    // // Definitions
    // defparameter
    private static final SubLSymbol $sg_tr_weight_rank_index$ = makeSymbol("*SG-TR-WEIGHT-RANK-INDEX*");









    /**
     * This parameter regulates how important the value each of the
     * forward and backward term rankings. The combined value then
     * becomes the value of the full Term Rank heuristic.
     */
    // defparameter
    private static final SubLSymbol $sg_tr_term_rank_parameter$ = makeSymbol("*SG-TR-TERM-RANK-PARAMETER*");

    // defparameter
    private static final SubLSymbol $sg_tr_term_rank_decay$ = makeSymbol("*SG-TR-TERM-RANK-DECAY*");

    // defparameter
    public static final SubLSymbol $term_rank_utility_label$ = makeSymbol("*TERM-RANK-UTILITY-LABEL*");

    /**
     *
     *
     * @return numberp
     */
    public static final SubLObject sg_tr_term_rank_value(SubLObject v_term) {
        if (v_term.isInteger()) {
            return ZERO_INTEGER;
        } else
            if (NIL != forts.fort_p(v_term)) {
                return sg_tr_term_rank_value_int(v_term);
            } else {
                {
                    SubLObject nart = narts_high.nart_lookup(v_term);
                    if (NIL != nart) {
                        return sg_tr_term_rank_value_int(nart);
                    } else {
                        return ZERO_INTEGER;
                    }
                }
            }

    }

    public static final SubLObject sg_tr_term_rank_value_int(SubLObject v_term) {
        {
            SubLObject result = forts.fort_id_index_lookup($sg_tr_rank_index$.getGlobalValue(), v_term);
            if (NIL == result) {
                result = ZERO_INTEGER;
            }
            return result;
        }
    }

    public static final SubLObject sg_tr_antecedent_term_rank(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return multiply($sg_tr_term_rank_parameter$.getDynamicValue(thread), $sg_tr_term_rank_decay$.getDynamicValue(thread), sg_tr_term_rank_value_int(v_term));
        }
    }

    public static final SubLObject sg_tr_consequent_term_rank(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return multiply(subtract(ONE_INTEGER, $sg_tr_term_rank_parameter$.getDynamicValue(thread)), $sg_tr_term_rank_decay$.getDynamicValue(thread), sg_tr_term_rank_value_int(v_term));
        }
    }

    public static final SubLObject sg_tr_set_term_rank(SubLObject v_term, SubLObject rank) {
        return forts.fort_id_index_enter($sg_tr_rank_index$.getGlobalValue(), v_term, rank);
    }

    public static final SubLObject sg_tr_term_weight(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return forts.fort_id_index_lookup($sg_tr_weight_rank_index$.getDynamicValue(thread), v_term);
        }
    }

    public static final SubLObject sg_tr_term_consequents(SubLObject v_term) {
        return forts.fort_id_index_lookup($sg_tr_consequent_index$.getGlobalValue(), v_term);
    }

    public static final SubLObject sg_tr_term_antecedents(SubLObject v_term) {
        return forts.fort_id_index_lookup($sg_tr_antecedent_index$.getGlobalValue(), v_term);
    }

    public static final SubLObject sg_tr_term_antecedent_count(SubLObject v_term) {
        return length(sg_tr_term_antecedents(v_term));
    }

    public static final SubLObject sg_tr_term_consequent_count(SubLObject v_term) {
        return length(sg_tr_term_consequents(v_term));
    }

    public static final SubLObject sg_tr_consequent_index_push_list(SubLObject v_term, SubLObject term_list) {
        {
            SubLObject old_entry = sg_tr_term_consequents(v_term);
            return forts.fort_id_index_enter($sg_tr_consequent_index$.getGlobalValue(), v_term, append(old_entry, term_list));
        }
    }

    public static final SubLObject sg_tr_antecedent_index_push_list(SubLObject v_term, SubLObject term_list) {
        {
            SubLObject old_entry = sg_tr_term_antecedents(v_term);
            return forts.fort_id_index_enter($sg_tr_antecedent_index$.getGlobalValue(), v_term, append(old_entry, term_list));
        }
    }

    public static final SubLObject sg_tr_make_new_rank_index(SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = ZERO_INTEGER;
        }
        {
            SubLObject rank_index = forts.new_fort_id_index();
            {
                SubLObject fii = $sg_tr_antecedent_index$.getGlobalValue();
                {
                    SubLObject idx = forts.do_fii_get_constants(fii);
                    if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                        {
                            SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                            SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                            SubLObject value = NIL;
                            while (NIL != id) {
                                value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                    {
                                        SubLObject v_term = constants_high.find_constant_by_internal_id(id);
                                        if (NIL != v_term) {
                                            forts.fort_id_index_enter(rank_index, v_term, default_value);
                                        }
                                    }
                                }
                                id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                                state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                            } 
                        }
                    }
                }
                {
                    SubLObject idx = forts.do_fii_get_narts(fii);
                    if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                        {
                            SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                            SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                            SubLObject value = NIL;
                            while (NIL != id) {
                                value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                    {
                                        SubLObject v_term = nart_handles.find_nart_by_id(id);
                                        if (NIL != v_term) {
                                            forts.fort_id_index_enter(rank_index, v_term, default_value);
                                        }
                                    }
                                }
                                id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                                state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                            } 
                        }
                    }
                }
            }
            {
                SubLObject fii = $sg_tr_consequent_index$.getGlobalValue();
                {
                    SubLObject idx = forts.do_fii_get_constants(fii);
                    if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                        {
                            SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                            SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                            SubLObject value = NIL;
                            while (NIL != id) {
                                value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                    {
                                        SubLObject v_term = constants_high.find_constant_by_internal_id(id);
                                        if (NIL != v_term) {
                                            forts.fort_id_index_enter(rank_index, v_term, default_value);
                                        }
                                    }
                                }
                                id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                                state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                            } 
                        }
                    }
                }
                {
                    SubLObject idx = forts.do_fii_get_narts(fii);
                    if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                        {
                            SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                            SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                            SubLObject value = NIL;
                            while (NIL != id) {
                                value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                    {
                                        SubLObject v_term = nart_handles.find_nart_by_id(id);
                                        if (NIL != v_term) {
                                            forts.fort_id_index_enter(rank_index, v_term, default_value);
                                        }
                                    }
                                }
                                id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                                state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                            } 
                        }
                    }
                }
            }
            return rank_index;
        }
    }

    public static final SubLObject sg_tr_init_term_rank() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_count = forts.fort_id_index_count(sg_tr_make_new_rank_index(UNPROVIDED));
                SubLObject rank = divide(ONE_INTEGER, term_count);
                $sg_tr_weight_rank_index$.setDynamicValue(sg_tr_make_new_rank_index(rank), thread);
                $sg_tr_rank_index$.setGlobalValue($sg_tr_weight_rank_index$.getDynamicValue(thread));
                return NIL;
            }
        }
    }

    public static final SubLObject sg_tr_init_favorite_term_rank(SubLObject favorite_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rank = ZERO_INTEGER;
                $sg_tr_weight_rank_index$.setDynamicValue(sg_tr_make_new_rank_index(rank), thread);
                forts.fort_id_index_enter($sg_tr_weight_rank_index$.getDynamicValue(thread), favorite_term, ONE_INTEGER);
                $sg_tr_rank_index$.setGlobalValue($sg_tr_weight_rank_index$.getDynamicValue(thread));
                return NIL;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $sg_tr_rule_macro_predicateP_caching_state$ = makeSymbol("*SG-TR-RULE-MACRO-PREDICATE?-CACHING-STATE*");

    public static final SubLObject clear_sg_tr_rule_macro_predicateP() {
        {
            SubLObject cs = $sg_tr_rule_macro_predicateP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_sg_tr_rule_macro_predicateP(SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($sg_tr_rule_macro_predicateP_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sg_tr_rule_macro_predicateP_internal(SubLObject pred) {
        return isa.isaP(pred, $$RuleMacroPredicate, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sg_tr_rule_macro_predicateP(SubLObject pred) {
        {
            SubLObject caching_state = $sg_tr_rule_macro_predicateP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym8$SG_TR_RULE_MACRO_PREDICATE_, $sym10$_SG_TR_RULE_MACRO_PREDICATE__CACHING_STATE_, NIL, EQ, ONE_INTEGER, $int$100);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, $kw12$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw12$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(sg_tr_rule_macro_predicateP_internal(pred)));
                    memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    // defparameter
    private static final SubLSymbol $sg_tr_kb_dependent_terms$ = makeSymbol("*SG-TR-KB-DEPENDENT-TERMS*");

    public static final SubLObject sg_tr_kb_dependent_relationP(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($sg_tr_kb_dependent_terms$.getDynamicValue(thread) == NIL) {
                $sg_tr_kb_dependent_terms$.setDynamicValue(isa.all_fort_instances($$KBDependentRelation, UNPROVIDED, UNPROVIDED), thread);
            }
            return list_utilities.sublisp_boolean(member(v_term, $sg_tr_kb_dependent_terms$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        }
    }

    /**
     * These terms are special in that they don't correspond well the simplify assumptions
     * we are making about rules. Typically they have a syntatic nature that precludes their
     * use in semantic datastructure like the inferentially-related term connectivity graph.
     */
    // defparameter
    private static final SubLSymbol $sg_tr_bad_terms$ = makeSymbol("*SG-TR-BAD-TERMS*");

    public static final SubLObject sg_tr_bad_termP(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cycl_utilities.non_indexed_fort_p(v_term)) {
                return T;
            } else
                if (NIL != hl_supports.hl_predicate_p(v_term)) {
                    return T;
                } else
                    if (NIL != sg_tr_kb_dependent_relationP(v_term)) {
                        return T;
                    } else
                        if (NIL != member(v_term, $sg_tr_bad_terms$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            return T;
                        } else {
                            return NIL;
                        }



        }
    }

    public static final SubLObject sg_tr_init_handle_rule_formula(SubLObject formula) {
        if (NIL != el_utilities.el_implication_p(formula)) {
            {
                SubLObject lhs = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                SubLObject rhs = cycl_utilities.formula_arg2(formula, UNPROVIDED);
                SubLObject antecedent_terms = remove_if($sym15$SG_TR_BAD_TERM_, cycl_utilities.formula_forts(lhs, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject consequent_terms = remove_if($sym15$SG_TR_BAD_TERM_, cycl_utilities.formula_forts(rhs, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = antecedent_terms;
                    SubLObject antecedent_term = NIL;
                    for (antecedent_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , antecedent_term = cdolist_list_var.first()) {
                        sg_tr_consequent_index_push_list(antecedent_term, consequent_terms);
                    }
                }
                {
                    SubLObject cdolist_list_var = consequent_terms;
                    SubLObject consequent_term = NIL;
                    for (consequent_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , consequent_term = cdolist_list_var.first()) {
                        sg_tr_antecedent_index_push_list(consequent_term, antecedent_terms);
                    }
                }
                return NIL;
            }
        }
        return NIL;
    }

    public static final SubLObject sg_tr_init_handle_rule_macro_gaf(SubLObject gaf) {
        {
            SubLObject formula = assertions_high.assertion_formula(gaf);
            SubLObject rule_formula = uncanonicalizer.undo_implications(verbosifier.verbosify_cycl(formula, UNPROVIDED, UNPROVIDED));
            return sg_tr_init_handle_rule_formula(rule_formula);
        }
    }

    public static final SubLObject sg_tr_init_handle_gaf(SubLObject gaf) {
        {
            SubLObject pred = assertions_high.gaf_predicate(gaf);
            if (NIL != sg_tr_rule_macro_predicateP(pred)) {
                return sg_tr_init_handle_rule_macro_gaf(gaf);
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject sg_tr_init_handle_rule(SubLObject rule) {
        return sg_tr_init_handle_rule_formula(assertions_high.assertion_formula(rule));
    }

    public static final SubLObject sg_tr_init_handle_assertion(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return sg_tr_init_handle_gaf(assertion);
        } else {
            return sg_tr_init_handle_rule(assertion);
        }
    }

    public static final SubLObject sg_tr_init_term_indices() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $sg_tr_consequent_index$.setGlobalValue(forts.new_fort_id_index());
            $sg_tr_antecedent_index$.setGlobalValue(forts.new_fort_id_index());
            {
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt16$Initializing_Term_connectivity_fr, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt16$Initializing_Term_connectivity_fr);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject ass = NIL;
                                while (NIL != id) {
                                    ass = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        sg_tr_init_handle_assertion(ass);
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_tr_rank_index_diff(SubLObject index1, SubLObject index2) {
        {
            SubLObject sum = ZERO_INTEGER;
            SubLObject fii = index1;
            {
                SubLObject idx = forts.do_fii_get_constants(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value1 = NIL;
                        while (NIL != id) {
                            value1 = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value1, $SKIP)) {
                                {
                                    SubLObject v_term = constants_high.find_constant_by_internal_id(id);
                                    if (NIL != v_term) {
                                        {
                                            SubLObject value2 = forts.fort_id_index_lookup(index2, v_term);
                                            sum = add(sum, abs(subtract(value1, value2)));
                                        }
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            {
                SubLObject idx = forts.do_fii_get_narts(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value1 = NIL;
                        while (NIL != id) {
                            value1 = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value1, $SKIP)) {
                                {
                                    SubLObject v_term = nart_handles.find_nart_by_id(id);
                                    if (NIL != v_term) {
                                        {
                                            SubLObject value2 = forts.fort_id_index_lookup(index2, v_term);
                                            sum = add(sum, abs(subtract(value1, value2)));
                                        }
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            return sum;
        }
    }

    public static final SubLObject sg_tr_rank_index_sum(SubLObject index) {
        {
            SubLObject sum = ZERO_INTEGER;
            SubLObject fii = index;
            {
                SubLObject idx = forts.do_fii_get_constants(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject v_term = constants_high.find_constant_by_internal_id(id);
                                    if (NIL != v_term) {
                                        sum = add(sum, abs(value));
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            {
                SubLObject idx = forts.do_fii_get_narts(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject v_term = nart_handles.find_nart_by_id(id);
                                    if (NIL != v_term) {
                                        sum = add(sum, abs(value));
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            return sum;
        }
    }

    public static final SubLObject sg_tr_rank_index_max(SubLObject index) {
        {
            SubLObject max_value = ZERO_INTEGER;
            SubLObject max = NIL;
            SubLObject fii = index;
            {
                SubLObject idx = forts.do_fii_get_constants(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject v_term = constants_high.find_constant_by_internal_id(id);
                                    if (NIL != v_term) {
                                        if (value.numG(max_value)) {
                                            max_value = value;
                                            max = v_term;
                                        }
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            {
                SubLObject idx = forts.do_fii_get_narts(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject v_term = nart_handles.find_nart_by_id(id);
                                    if (NIL != v_term) {
                                        if (value.numG(max_value)) {
                                            max_value = value;
                                            max = v_term;
                                        }
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            return values(max, max_value);
        }
    }

    public static final SubLObject sg_tr_rank_index_range(SubLObject index, SubLObject threshold, SubLObject test) {
        {
            SubLObject alist = NIL;
            SubLObject fii = index;
            {
                SubLObject idx = forts.do_fii_get_constants(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject v_term = constants_high.find_constant_by_internal_id(id);
                                    if (NIL != v_term) {
                                        if (NIL != funcall(test, value, threshold)) {
                                            alist = cons(cons(v_term, value), alist);
                                        }
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            {
                SubLObject idx = forts.do_fii_get_narts(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject v_term = nart_handles.find_nart_by_id(id);
                                    if (NIL != v_term) {
                                        if (NIL != funcall(test, value, threshold)) {
                                            alist = cons(cons(v_term, value), alist);
                                        }
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            return alist;
        }
    }

    public static final SubLObject sg_tr_show_top_terms(SubLObject threshold) {
        return format_nil.print_one_per_line(Sort.sort(sg_tr_rank_index_range($sg_tr_rank_index$.getGlobalValue(), threshold, symbol_function($sym18$_)), symbol_function($sym18$_), symbol_function(CDR)), UNPROVIDED);
    }

    /**
     * Prints out the top N terms with their rankings.
     */
    public static final SubLObject sg_tr_show_top_n_terms(SubLObject n) {
        {
            SubLObject top_n_terms = queues.create_p_queue(n, symbol_function(CDR), symbol_function($sym18$_));
            SubLObject fii = $sg_tr_rank_index$.getGlobalValue();
            {
                SubLObject idx = forts.do_fii_get_constants(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject v_term = constants_high.find_constant_by_internal_id(id);
                                    if (NIL != v_term) {
                                        if (NIL == queues.p_queue_full_p(top_n_terms)) {
                                            queues.p_enqueue(cons(v_term, value), top_n_terms);
                                        } else
                                            if (value.numG(queues.p_queue_worst(top_n_terms).rest())) {
                                                queues.p_dequeue(top_n_terms, T);
                                                queues.p_enqueue(cons(v_term, value), top_n_terms);
                                            }

                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            {
                SubLObject idx = forts.do_fii_get_narts(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject v_term = nart_handles.find_nart_by_id(id);
                                    if (NIL != v_term) {
                                        if (NIL == queues.p_queue_full_p(top_n_terms)) {
                                            queues.p_enqueue(cons(v_term, value), top_n_terms);
                                        } else
                                            if (value.numG(queues.p_queue_worst(top_n_terms).rest())) {
                                                queues.p_dequeue(top_n_terms, T);
                                                queues.p_enqueue(cons(v_term, value), top_n_terms);
                                            }

                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            {
                SubLObject cdolist_list_var = queues.p_queue_elements(top_n_terms);
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    {
                        SubLObject datum = item;
                        SubLObject current = datum;
                        SubLObject v_term = NIL;
                        SubLObject rank = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt20);
                        v_term = current.first();
                        current = current.rest();
                        rank = current;
                        format(T, $str_alt21$_40a__15a__, v_term, rank);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_tr_rank_index_percentage_zeroed_terms(SubLObject index) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject fii = index;
            {
                SubLObject idx = forts.do_fii_get_constants(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject rank = NIL;
                        while (NIL != id) {
                            rank = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, rank, $SKIP)) {
                                {
                                    SubLObject v_term = constants_high.find_constant_by_internal_id(id);
                                    if (NIL != v_term) {
                                        if (rank.isZero()) {
                                            count = add(count, ONE_INTEGER);
                                        }
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            {
                SubLObject idx = forts.do_fii_get_narts(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject rank = NIL;
                        while (NIL != id) {
                            rank = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, rank, $SKIP)) {
                                {
                                    SubLObject v_term = nart_handles.find_nart_by_id(id);
                                    if (NIL != v_term) {
                                        if (rank.isZero()) {
                                            count = add(count, ONE_INTEGER);
                                        }
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            return multiply($int$100, divide(count, forts.fort_id_index_count(index)));
        }
    }

    public static final SubLObject sg_tr_compute_term_rank(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        {
            SubLObject consequent_terms = sg_tr_term_consequents(v_term);
            SubLObject antecedent_terms = sg_tr_term_antecedents(v_term);
            SubLObject sum = ZERO_INTEGER;
            {
                SubLObject cdolist_list_var = consequent_terms;
                SubLObject consequent = NIL;
                for (consequent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , consequent = cdolist_list_var.first()) {
                    sum = add(sum, divide(sg_tr_antecedent_term_rank(consequent), sg_tr_term_antecedent_count(consequent)));
                }
            }
            {
                SubLObject cdolist_list_var = antecedent_terms;
                SubLObject antecedent = NIL;
                for (antecedent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , antecedent = cdolist_list_var.first()) {
                    sum = add(sum, divide(sg_tr_consequent_term_rank(antecedent), sg_tr_term_consequent_count(antecedent)));
                }
            }
            return sum;
        }
    }

    public static final SubLObject sg_tr_recalculate_term_rank() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_rank_index = forts.new_fort_id_index();
                SubLObject total = forts.fort_id_index_count($sg_tr_rank_index$.getGlobalValue());
                SubLObject i = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt23$Computing_next_rank_vector___);
                        {
                            SubLObject fii = $sg_tr_rank_index$.getGlobalValue();
                            {
                                SubLObject idx = forts.do_fii_get_constants(fii);
                                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                                        SubLObject value = NIL;
                                        while (NIL != id) {
                                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                                {
                                                    SubLObject v_term = constants_high.find_constant_by_internal_id(id);
                                                    if (NIL != v_term) {
                                                        {
                                                            SubLObject new_rank = sg_tr_compute_term_rank(v_term);
                                                            forts.fort_id_index_enter(new_rank_index, v_term, new_rank);
                                                        }
                                                        utilities_macros.note_percent_progress(i, total);
                                                        i = add(i, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                                        } 
                                    }
                                }
                            }
                            {
                                SubLObject idx = forts.do_fii_get_narts(fii);
                                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                                        SubLObject value = NIL;
                                        while (NIL != id) {
                                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                                {
                                                    SubLObject v_term = nart_handles.find_nart_by_id(id);
                                                    if (NIL != v_term) {
                                                        {
                                                            SubLObject new_rank = sg_tr_compute_term_rank(v_term);
                                                            forts.fort_id_index_enter(new_rank_index, v_term, new_rank);
                                                        }
                                                        utilities_macros.note_percent_progress(i, total);
                                                        i = add(i, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                                        } 
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_rank_index;
            }
        }
    }

    public static final SubLObject sg_tr_adjust_rank_with_weight(SubLObject index, SubLObject rank_loss) {
        {
            SubLObject fii = index;
            {
                SubLObject idx = forts.do_fii_get_constants(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject v_term = constants_high.find_constant_by_internal_id(id);
                                    if (NIL != v_term) {
                                        forts.fort_id_index_enter(index, v_term, add(value, multiply(rank_loss, sg_tr_term_weight(v_term))));
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            {
                SubLObject idx = forts.do_fii_get_narts(fii);
                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = id_index.do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = id_index.do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject value = NIL;
                        while (NIL != id) {
                            value = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != id_index.do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                {
                                    SubLObject v_term = nart_handles.find_nart_by_id(id);
                                    if (NIL != v_term) {
                                        forts.fort_id_index_enter(index, v_term, add(value, multiply(rank_loss, sg_tr_term_weight(v_term))));
                                    }
                                }
                            }
                            id = id_index.do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = id_index.do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
        }
        return index;
    }

    /**
     * The difference between iterations of term ranks below which the term rank algorithm
     * should halt. Beware making this lower than 0.003, since rate of convergence seems to
     * fall of considerably once the diff gets to 0.005 or so.
     */
    // defparameter
    private static final SubLSymbol $sg_tr_convergence_threshold$ = makeSymbol("*SG-TR-CONVERGENCE-THRESHOLD*");

    public static final SubLObject sg_tr_compute_stable_term_rank(SubLObject max_iteration) {
        if (max_iteration == UNPROVIDED) {
            max_iteration = $int$50;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_rank_index = NIL;
                SubLObject old_norm = NIL;
                SubLObject new_norm = NIL;
                SubLObject rank_loss = NIL;
                SubLObject diff = ONE_INTEGER;
                SubLObject epsilon = $sg_tr_convergence_threshold$.getDynamicValue(thread);
                SubLObject v_iteration = ONE_INTEGER;
                SubLObject old_rank_index = NIL;
                for (old_rank_index = $sg_tr_rank_index$.getGlobalValue(); !(epsilon.numG(diff) || v_iteration.numG(max_iteration)); old_rank_index = $sg_tr_rank_index$.getGlobalValue()) {
                    format(T, $str_alt26$Iteration__s, v_iteration);
                    new_rank_index = sg_tr_recalculate_term_rank();
                    old_norm = sg_tr_rank_index_sum(old_rank_index);
                    new_norm = sg_tr_rank_index_sum(new_rank_index);
                    rank_loss = subtract(old_norm, new_norm);
                    new_rank_index = sg_tr_adjust_rank_with_weight(new_rank_index, rank_loss);
                    diff = sg_tr_rank_index_diff(new_rank_index, old_rank_index);
                    format(T, $str_alt27$__Delta___10_10f__, diff);
                    format(T, $str_alt28$Percentage_Zeroed_Terms___8_2f___, sg_tr_rank_index_percentage_zeroed_terms(new_rank_index));
                    v_iteration = add(v_iteration, ONE_INTEGER);
                    $sg_tr_rank_index$.setGlobalValue(new_rank_index);
                }
                return NIL;
            }
        }
    }

    public static final SubLObject sg_tr_rank_index_filename(SubLObject v_term) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        {
            SubLObject filename = NIL;
            SubLObject pathname = NIL;
            if (NIL != constant_handles.constant_p(v_term)) {
                filename = cconcatenate($str_alt29$tr_, new SubLObject[]{ Strings.string_downcase(constants_high.constant_name(v_term), UNPROVIDED, UNPROVIDED), $str_alt30$_, write_to_string(control_vars.kb_loaded(), EMPTY_SUBL_OBJECT_ARRAY), $str_alt31$_cfasl });
            } else {
                if (NIL == v_term) {
                    filename = cconcatenate($str_alt32$tr_normal_, new SubLObject[]{ write_to_string(control_vars.kb_loaded(), EMPTY_SUBL_OBJECT_ARRAY), $str_alt31$_cfasl });
                } else {
                    filename = cconcatenate($str_alt33$tr_nonatomic_, new SubLObject[]{ write_to_string(control_vars.kb_loaded(), EMPTY_SUBL_OBJECT_ARRAY), $str_alt31$_cfasl });
                }
            }
            pathname = filename;
            return pathname;
        }
    }

    public static final SubLObject sg_tr_make_term_rank() {
        sg_tr_init_term_indices();
        sg_tr_init_term_rank();
        sg_tr_compute_stable_term_rank(UNPROVIDED);
        sg_tr_init_ranking_order(UNPROVIDED);
        sg_tr_dump_term_rank(sg_tr_rank_index_filename(UNPROVIDED));
        return NIL;
    }

    public static final SubLObject sg_tr_make_favorite_term_rank(SubLObject v_term) {
        sg_tr_init_term_indices();
        sg_tr_init_favorite_term_rank(v_term);
        sg_tr_compute_stable_term_rank(UNPROVIDED);
        sg_tr_init_ranking_order(UNPROVIDED);
        sg_tr_dump_term_rank(sg_tr_rank_index_filename(v_term));
        return NIL;
    }

    /**
     * Typically this should be (fort-count), so that utility is
     * never negative. By using a lower max, we could implement a utility
     * threshold by throwing away stuff that has negative interestness.
     */
    // defparameter
    private static final SubLSymbol $sg_tr_max_utility$ = makeSymbol("*SG-TR-MAX-UTILITY*");

    public static final SubLObject sg_tr_max_utility() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $sg_tr_max_utility$.getDynamicValue(thread)) {
                return $sg_tr_max_utility$.getDynamicValue(thread);
            } else {
                {
                    SubLObject max = forts.fort_count();
                    $sg_tr_max_utility$.setDynamicValue(max, thread);
                    return $sg_tr_max_utility$.getDynamicValue(thread);
                }
            }
        }
    }

    public static final SubLObject sg_tr_term_utility(SubLObject v_term) {
        {
            SubLObject rank = sg_tr_term_rank(v_term);
            if (NIL != rank) {
                return subtract(sg_tr_max_utility(), rank);
            }
            return ZERO_INTEGER;
        }
    }

    /**
     * Returns a heurisitic value for formula that depends on the terms
     * it mentions. Implements a L2 norm.
     */
    public static final SubLObject sg_tr_formula_utility(SubLObject formula) {
        if (NIL == forts.fort_id_index_p($sg_tr_rank_index$.getGlobalValue())) {
            return ONE_INTEGER;
        }
        {
            SubLObject term_set = set_utilities.construct_set_from_list(cycl_utilities.formula_forts(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            SubLObject formula_utility = sg_tr_term_set_utility(term_set);
            return formula_utility;
        }
    }

    public static final SubLObject sg_tr_sentence_utility(SubLObject sentence) {
        return sg_tr_formula_utility(sentence);
    }

    public static final SubLObject sg_tr_term_set_utility(SubLObject set_of_terms) {
        SubLTrampolineFile.checkType(set_of_terms, SET_P);
        {
            SubLObject term_values = NIL;
            SubLObject total_term_value = ZERO_INTEGER;
            SubLObject utility = ZERO_INTEGER;
            SubLObject set_contents_var = set.do_set_internal(set_of_terms);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject v_term = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                        {
                            SubLObject rank = sg_tr_term_rank(v_term);
                            if (NIL != rank) {
                                term_values = cons(rank, term_values);
                            }
                        }
                    }
                }
            }
            {
                SubLObject num_values = length(term_values);
                if (num_values.numG(ZERO_INTEGER)) {
                    total_term_value = subtract(integerDivide(apply($sym35$_, term_values), num_values), num_values);
                    utility = subtract(sg_tr_max_utility(), total_term_value);
                }
            }
            return utility;
        }
    }

    public static final SubLObject sg_tr_term_list_utility(SubLObject term_list) {
        return sg_tr_term_set_utility(set_utilities.construct_set_from_list(term_list, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject sg_tr_assertion_utility(SubLObject assertion) {
        return sg_tr_term_list_utility(assertions_high.assertion_forts(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Computes an estimate for the normalization factor for this ranking.
     */
    public static final SubLObject sg_tr_estimate_normalizing_factor(SubLObject index) {
        if (index == UNPROVIDED) {
            index = $sg_tr_rank_index$.getGlobalValue();
        }
        {
            SubLObject threshold = $float$9_999999999999999e_7;
            SubLObject alist = Sort.sort(sg_tr_rank_index_range(index, threshold, symbol_function($sym37$_)), symbol_function($sym18$_), symbol_function(CDR));
            SubLObject total = length(alist);
            SubLObject sum = ZERO_INTEGER;
            SubLObject average_factor = NIL;
            SubLObject list_var = NIL;
            SubLObject entry = NIL;
            SubLObject rank = NIL;
            for (list_var = alist, entry = list_var.first(), rank = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , entry = list_var.first() , rank = add(ONE_INTEGER, rank)) {
                {
                    SubLObject factor = multiply(number_utilities.f_1X(rank), entry.rest());
                    format(T, $str_alt38$_a___a__a__, new SubLObject[]{ number_utilities.f_1X(rank), entry.first(), factor });
                    sum = add(sum, factor);
                }
            }
            average_factor = divide(sum, total);
            format(T, $str_alt39$Average___a__, average_factor);
            return average_factor;
        }
    }

    public static final SubLObject sg_tr_term_rank(SubLObject v_term) {
        if (NIL == dictionary.dictionary_p($sg_tr_term_ranking_order$.getGlobalValue())) {
            return NIL;
        }
        {
            SubLObject rank = dictionary.dictionary_lookup($sg_tr_term_ranking_order$.getGlobalValue(), v_term, UNPROVIDED);
            if (rank.isInteger()) {
                return rank;
            }
            return NIL;
        }
    }

    public static final SubLObject sg_tr_init_ranking_order(SubLObject index) {
        if (index == UNPROVIDED) {
            index = $sg_tr_rank_index$.getGlobalValue();
        }
        $sg_tr_term_ranking_order$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQ), forts.fort_count()));
        {
            SubLObject range = sg_tr_rank_index_range(index, ZERO_INTEGER, symbol_function($sym18$_));
            SubLObject sorted_range = Sort.sort(range, symbol_function($sym18$_), symbol_function(CDR));
            SubLObject current_rank = ONE_INTEGER;
            SubLObject cdolist_list_var = sorted_range;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject v_term = NIL;
                    SubLObject rank_value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt40);
                    v_term = current.first();
                    current = current.rest();
                    rank_value = current;
                    dictionary.dictionary_enter($sg_tr_term_ranking_order$.getGlobalValue(), v_term, current_rank);
                    current_rank = add(current_rank, ONE_INTEGER);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_tr_dump_term_rank(SubLObject filename) {
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt42$Unable_to_open__S, filename);
                }
                {
                    SubLObject stream_1 = stream;
                    cfasl_output($sg_tr_rank_index$.getGlobalValue(), stream_1);
                    cfasl_output($sg_tr_term_ranking_order$.getGlobalValue(), stream_1);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject sg_tr_load_term_rank(SubLObject filename) {
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_binary(filename, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt42$Unable_to_open__S, filename);
                }
                {
                    SubLObject stream_2 = stream;
                    $sg_tr_rank_index$.setGlobalValue(cfasl_input(stream_2, UNPROVIDED, UNPROVIDED));
                    $sg_tr_term_ranking_order$.setGlobalValue(cfasl_input(stream_2, UNPROVIDED, UNPROVIDED));
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_sg_term_rank_file() {
        declareFunction("sg_tr_term_rank_value", "SG-TR-TERM-RANK-VALUE", 1, 0, false);
        declareFunction("sg_tr_term_rank_value_int", "SG-TR-TERM-RANK-VALUE-INT", 1, 0, false);
        declareFunction("sg_tr_antecedent_term_rank", "SG-TR-ANTECEDENT-TERM-RANK", 1, 0, false);
        declareFunction("sg_tr_consequent_term_rank", "SG-TR-CONSEQUENT-TERM-RANK", 1, 0, false);
        declareFunction("sg_tr_set_term_rank", "SG-TR-SET-TERM-RANK", 2, 0, false);
        declareFunction("sg_tr_term_weight", "SG-TR-TERM-WEIGHT", 1, 0, false);
        declareFunction("sg_tr_term_consequents", "SG-TR-TERM-CONSEQUENTS", 1, 0, false);
        declareFunction("sg_tr_term_antecedents", "SG-TR-TERM-ANTECEDENTS", 1, 0, false);
        declareFunction("sg_tr_term_antecedent_count", "SG-TR-TERM-ANTECEDENT-COUNT", 1, 0, false);
        declareFunction("sg_tr_term_consequent_count", "SG-TR-TERM-CONSEQUENT-COUNT", 1, 0, false);
        declareFunction("sg_tr_consequent_index_push_list", "SG-TR-CONSEQUENT-INDEX-PUSH-LIST", 2, 0, false);
        declareFunction("sg_tr_antecedent_index_push_list", "SG-TR-ANTECEDENT-INDEX-PUSH-LIST", 2, 0, false);
        declareFunction("sg_tr_make_new_rank_index", "SG-TR-MAKE-NEW-RANK-INDEX", 0, 1, false);
        declareFunction("sg_tr_init_term_rank", "SG-TR-INIT-TERM-RANK", 0, 0, false);
        declareFunction("sg_tr_init_favorite_term_rank", "SG-TR-INIT-FAVORITE-TERM-RANK", 1, 0, false);
        declareFunction("clear_sg_tr_rule_macro_predicateP", "CLEAR-SG-TR-RULE-MACRO-PREDICATE?", 0, 0, false);
        declareFunction("remove_sg_tr_rule_macro_predicateP", "REMOVE-SG-TR-RULE-MACRO-PREDICATE?", 1, 0, false);
        declareFunction("sg_tr_rule_macro_predicateP_internal", "SG-TR-RULE-MACRO-PREDICATE?-INTERNAL", 1, 0, false);
        declareFunction("sg_tr_rule_macro_predicateP", "SG-TR-RULE-MACRO-PREDICATE?", 1, 0, false);
        declareFunction("sg_tr_kb_dependent_relationP", "SG-TR-KB-DEPENDENT-RELATION?", 1, 0, false);
        declareFunction("sg_tr_bad_termP", "SG-TR-BAD-TERM?", 1, 0, false);
        declareFunction("sg_tr_init_handle_rule_formula", "SG-TR-INIT-HANDLE-RULE-FORMULA", 1, 0, false);
        declareFunction("sg_tr_init_handle_rule_macro_gaf", "SG-TR-INIT-HANDLE-RULE-MACRO-GAF", 1, 0, false);
        declareFunction("sg_tr_init_handle_gaf", "SG-TR-INIT-HANDLE-GAF", 1, 0, false);
        declareFunction("sg_tr_init_handle_rule", "SG-TR-INIT-HANDLE-RULE", 1, 0, false);
        declareFunction("sg_tr_init_handle_assertion", "SG-TR-INIT-HANDLE-ASSERTION", 1, 0, false);
        declareFunction("sg_tr_init_term_indices", "SG-TR-INIT-TERM-INDICES", 0, 0, false);
        declareFunction("sg_tr_rank_index_diff", "SG-TR-RANK-INDEX-DIFF", 2, 0, false);
        declareFunction("sg_tr_rank_index_sum", "SG-TR-RANK-INDEX-SUM", 1, 0, false);
        declareFunction("sg_tr_rank_index_max", "SG-TR-RANK-INDEX-MAX", 1, 0, false);
        declareFunction("sg_tr_rank_index_range", "SG-TR-RANK-INDEX-RANGE", 3, 0, false);
        declareFunction("sg_tr_show_top_terms", "SG-TR-SHOW-TOP-TERMS", 1, 0, false);
        declareFunction("sg_tr_show_top_n_terms", "SG-TR-SHOW-TOP-N-TERMS", 1, 0, false);
        declareFunction("sg_tr_rank_index_percentage_zeroed_terms", "SG-TR-RANK-INDEX-PERCENTAGE-ZEROED-TERMS", 1, 0, false);
        declareFunction("sg_tr_compute_term_rank", "SG-TR-COMPUTE-TERM-RANK", 1, 0, false);
        declareFunction("sg_tr_recalculate_term_rank", "SG-TR-RECALCULATE-TERM-RANK", 0, 0, false);
        declareFunction("sg_tr_adjust_rank_with_weight", "SG-TR-ADJUST-RANK-WITH-WEIGHT", 2, 0, false);
        declareFunction("sg_tr_compute_stable_term_rank", "SG-TR-COMPUTE-STABLE-TERM-RANK", 0, 1, false);
        declareFunction("sg_tr_rank_index_filename", "SG-TR-RANK-INDEX-FILENAME", 0, 1, false);
        declareFunction("sg_tr_make_term_rank", "SG-TR-MAKE-TERM-RANK", 0, 0, false);
        declareFunction("sg_tr_make_favorite_term_rank", "SG-TR-MAKE-FAVORITE-TERM-RANK", 1, 0, false);
        declareFunction("sg_tr_max_utility", "SG-TR-MAX-UTILITY", 0, 0, false);
        declareFunction("sg_tr_term_utility", "SG-TR-TERM-UTILITY", 1, 0, false);
        declareFunction("sg_tr_formula_utility", "SG-TR-FORMULA-UTILITY", 1, 0, false);
        declareFunction("sg_tr_sentence_utility", "SG-TR-SENTENCE-UTILITY", 1, 0, false);
        declareFunction("sg_tr_term_set_utility", "SG-TR-TERM-SET-UTILITY", 1, 0, false);
        declareFunction("sg_tr_term_list_utility", "SG-TR-TERM-LIST-UTILITY", 1, 0, false);
        declareFunction("sg_tr_assertion_utility", "SG-TR-ASSERTION-UTILITY", 1, 0, false);
        declareFunction("sg_tr_estimate_normalizing_factor", "SG-TR-ESTIMATE-NORMALIZING-FACTOR", 0, 1, false);
        declareFunction("sg_tr_term_rank", "SG-TR-TERM-RANK", 1, 0, false);
        declareFunction("sg_tr_init_ranking_order", "SG-TR-INIT-RANKING-ORDER", 0, 1, false);
        declareFunction("sg_tr_dump_term_rank", "SG-TR-DUMP-TERM-RANK", 1, 0, false);
        declareFunction("sg_tr_load_term_rank", "SG-TR-LOAD-TERM-RANK", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sg_term_rank_file() {
        defparameter("*SG-TR-WEIGHT-RANK-INDEX*", NIL);
        deflexical("*SG-TR-RANK-INDEX*", NIL != boundp($sg_tr_rank_index$) ? ((SubLObject) ($sg_tr_rank_index$.getGlobalValue())) : NIL);
        deflexical("*SG-TR-CONSEQUENT-INDEX*", NIL != boundp($sg_tr_consequent_index$) ? ((SubLObject) ($sg_tr_consequent_index$.getGlobalValue())) : NIL);
        deflexical("*SG-TR-ANTECEDENT-INDEX*", NIL != boundp($sg_tr_antecedent_index$) ? ((SubLObject) ($sg_tr_antecedent_index$.getGlobalValue())) : NIL);
        deflexical("*SG-TR-TERM-RANKING-ORDER*", NIL != boundp($sg_tr_term_ranking_order$) ? ((SubLObject) ($sg_tr_term_ranking_order$.getGlobalValue())) : NIL);
        defparameter("*SG-TR-TERM-RANK-PARAMETER*", $float$0_5);
        defparameter("*SG-TR-TERM-RANK-DECAY*", $float$0_9);
        defparameter("*TERM-RANK-UTILITY-LABEL*", $$$Abductive_Utility);
        deflexical("*SG-TR-RULE-MACRO-PREDICATE?-CACHING-STATE*", NIL);
        defparameter("*SG-TR-KB-DEPENDENT-TERMS*", NIL);
        defparameter("*SG-TR-BAD-TERMS*", $list_alt14);
        defparameter("*SG-TR-CONVERGENCE-THRESHOLD*", $float$0_005);
        defparameter("*SG-TR-MAX-UTILITY*", NIL);
        return NIL;
    }

    public static final SubLObject setup_sg_term_rank_file() {
                subl_macro_promotions.declare_defglobal($sg_tr_rank_index$);
        subl_macro_promotions.declare_defglobal($sg_tr_consequent_index$);
        subl_macro_promotions.declare_defglobal($sg_tr_antecedent_index$);
        subl_macro_promotions.declare_defglobal($sg_tr_term_ranking_order$);
        memoization_state.note_globally_cached_function($sym8$SG_TR_RULE_MACRO_PREDICATE_);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $sg_tr_rank_index$ = makeSymbol("*SG-TR-RANK-INDEX*");

    public static final SubLSymbol $sg_tr_consequent_index$ = makeSymbol("*SG-TR-CONSEQUENT-INDEX*");

    public static final SubLSymbol $sg_tr_antecedent_index$ = makeSymbol("*SG-TR-ANTECEDENT-INDEX*");

    public static final SubLSymbol $sg_tr_term_ranking_order$ = makeSymbol("*SG-TR-TERM-RANKING-ORDER*");

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    public static final SubLFloat $float$0_9 = makeDouble(0.9);

    static private final SubLString $$$Abductive_Utility = makeString("Abductive Utility");



    static private final SubLSymbol $sym8$SG_TR_RULE_MACRO_PREDICATE_ = makeSymbol("SG-TR-RULE-MACRO-PREDICATE?");

    public static final SubLObject $$RuleMacroPredicate = constant_handles.reader_make_constant_shell(makeString("RuleMacroPredicate"));

    static private final SubLSymbol $sym10$_SG_TR_RULE_MACRO_PREDICATE__CACHING_STATE_ = makeSymbol("*SG-TR-RULE-MACRO-PREDICATE?-CACHING-STATE*");



    public static final SubLSymbol $kw12$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLObject $$KBDependentRelation = constant_handles.reader_make_constant_shell(makeString("KBDependentRelation"));

    static private final SubLList $list_alt14 = list(constant_handles.reader_make_constant_shell(makeString("operatorFormulas")), constant_handles.reader_make_constant_shell(makeString("argN")), constant_handles.reader_make_constant_shell(makeString("FormulaArgFn")), constant_handles.reader_make_constant_shell(makeString("natArgument")), constant_handles.reader_make_constant_shell(makeString("natFunction")), constant_handles.reader_make_constant_shell(makeString("termFormulas")), constant_handles.reader_make_constant_shell(makeString("likelihood")));

    static private final SubLSymbol $sym15$SG_TR_BAD_TERM_ = makeSymbol("SG-TR-BAD-TERM?");

    static private final SubLString $str_alt16$Initializing_Term_connectivity_fr = makeString("Initializing Term connectivity from KB assertions");



    static private final SubLSymbol $sym18$_ = makeSymbol(">");



    static private final SubLList $list_alt20 = cons(makeSymbol("TERM"), makeSymbol("RANK"));

    static private final SubLString $str_alt21$_40a__15a__ = makeString("~40a ~15a~%");



    static private final SubLString $str_alt23$Computing_next_rank_vector___ = makeString("Computing next rank vector...");

    public static final SubLFloat $float$0_005 = makeDouble(0.005);

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $str_alt26$Iteration__s = makeString("Iteration ~s");

    static private final SubLString $str_alt27$__Delta___10_10f__ = makeString("~%Delta: ~10,10f~%");

    static private final SubLString $str_alt28$Percentage_Zeroed_Terms___8_2f___ = makeString("Percentage Zeroed Terms: ~8,2f%~%");

    static private final SubLString $str_alt29$tr_ = makeString("tr-");

    static private final SubLString $str_alt30$_ = makeString("-");

    static private final SubLString $str_alt31$_cfasl = makeString(".cfasl");

    static private final SubLString $str_alt32$tr_normal_ = makeString("tr-normal-");

    static private final SubLString $str_alt33$tr_nonatomic_ = makeString("tr-nonatomic-");



    static private final SubLSymbol $sym35$_ = makeSymbol("+");

    public static final SubLFloat $float$9_999999999999999e_7 = makeDouble(1.0E-6);

    static private final SubLSymbol $sym37$_ = makeSymbol("<");

    static private final SubLString $str_alt38$_a___a__a__ = makeString("~a. ~a ~a~%");

    static private final SubLString $str_alt39$Average___a__ = makeString("Average: ~a~%");

    static private final SubLList $list_alt40 = cons(makeSymbol("TERM"), makeSymbol("RANK-VALUE"));



    static private final SubLString $str_alt42$Unable_to_open__S = makeString("Unable to open ~S");



    // // Initializers
    @Override
    public void declareFunctions() {
        declare_sg_term_rank_file();
    }

    @Override
    public void initializeVariables() {
        init_sg_term_rank_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sg_term_rank_file();
    }
}

