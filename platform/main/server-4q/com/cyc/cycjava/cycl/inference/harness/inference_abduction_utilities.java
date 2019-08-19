package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arg_type;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_abduction_utilities extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities";
    public static String myFingerPrint = "15f2e35a1b5b77906c078433c15ab9b29c4686b88eaad0d9a41e20e5aca23b52";
    private static SubLSymbol $POS;
    private static SubLSymbol $IGNORE;
    private static SubLList $list2;
    private static SubLObject $$nonAbducibleSentence;
    private static SubLObject $$NonAbducibleRelation;
    private static SubLObject $$NonAbduciblePredicate;
    private static SubLObject $$NonAbducibleCollection;
    private static SubLObject $$notAbducibleForArg;
    private static SubLSymbol $TRUE;
    private static SubLObject $$notAbducibleWRTValueInArg;
    private static SubLSymbol $GAF_ARG;
    private static SubLSymbol $GAF;
    private static SubLSymbol $PREDICATE_EXTENT;
    private static SubLSymbol $OVERLAP;
    private static SubLObject $$notAbducibleWRTTypeInArg;
    private static SubLObject $$isa;
    private static SubLObject $$termOfUnit;
    private static SubLList $list17;
    private static SubLSymbol $FALSE;
    private static SubLSymbol $NEG;

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 900L)
    public static SubLObject reject_proof_due_to_non_abducible_ruleP(SubLObject link, SubLObject supported_problem, SubLObject subproofs) {
        return makeBoolean(NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem.problem_store(supported_problem)) && NIL != inference_worker_transformation.transformation_link_p(link)
                && NIL != kb_accessors.non_abducible_ruleP(inference_worker_transformation.transformation_link_rule_assertion(link)) && NIL != some_abductive_subproofP(subproofs));
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 1300L)
    public static SubLObject some_abductive_subproofP(SubLObject subproofs) {
        SubLObject abductive_subproofP = NIL;
        if (NIL == abductive_subproofP) {
            SubLObject csome_list_var = subproofs;
            SubLObject subproof = NIL;
            subproof = csome_list_var.first();
            while (NIL == abductive_subproofP && NIL != csome_list_var) {
                if ((NIL != inference_worker.content_proof_p(subproof) && NIL != inference_modules.abductive_hl_moduleP(inference_worker.content_proof_hl_module(subproof))) || NIL != some_abductive_subproofP(inference_datastructures_proof.proof_direct_subproofs(subproof))) {
                    abductive_subproofP = T;
                }
                csome_list_var = csome_list_var.rest();
                subproof = csome_list_var.first();
            }
        }
        return abductive_subproofP;
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 1600L)
    public static SubLObject abduction_allowed_on_asentP(SubLObject asent, SubLObject mt, SubLObject sense) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (sense == UNPROVIDED) {
            sense = $POS;
        }
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL == forts.fort_p(predicate)) {
            return NIL;
        }
        if (NIL != non_abducible_relationP(predicate, mt)) {
            return NIL;
        }
        if (NIL != non_abducible_predicateP(predicate, mt)) {
            return NIL;
        }
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, ONE_INTEGER);
            if (!argnum.isZero()) {
                if (NIL != variables.fully_bound_p(arg)) {
                    if (NIL != non_abducible_wrt_value_in_argnumP(predicate, arg, argnum, mt) || NIL != non_abducible_wrt_value_in_argnum_via_typeP(predicate, arg, argnum, mt) || NIL != kb_accessors.complete_extent_enumerable_for_argP(predicate, argnum, mt)) {
                        return NIL;
                    }
                } else if (NIL != non_abducible_for_argnumP(predicate, argnum, mt)) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        if (NIL != non_abducible_sentenceP(asent, mt)) {
            return NIL;
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 3100L)
    public static SubLObject non_abducible_sentenceP(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = inference_worker.currently_active_problem_store();
        SubLObject transformation_link = inference_datastructures_problem_store.problem_store_most_recent_transformation_link(store);
        SubLObject non_abducibleP = NIL;
        if (NIL != inference_worker_transformation.transformation_link_p(transformation_link)) {
            SubLObject v_bindings = inference_worker_transformation.transformation_link_bindings(transformation_link);
            SubLObject new_asent = bindings.subst_bindings(v_bindings, asent);
            SubLObject pragmatic_requirements = inference_worker_transformation.transformation_link_pragmatic_requirements(transformation_link);
            SubLObject pos_lits = inference_czer.contextualized_pos_lits(pragmatic_requirements);
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                if (NIL == non_abducibleP) {
                    SubLObject csome_list_var = pos_lits;
                    SubLObject lit = NIL;
                    lit = csome_list_var.first();
                    while (NIL == non_abducibleP && NIL != csome_list_var) {
                        SubLObject current;
                        SubLObject datum = current = lit;
                        SubLObject lit_mt = NIL;
                        SubLObject lit_formula = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
                        lit_mt = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
                        lit_formula = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (cycl_utilities.formula_operator(lit_formula).eql($$nonAbducibleSentence) && NIL != unification.unify_possible(new_asent, cycl_utilities.formula_arg1(lit_formula, UNPROVIDED)) && NIL != mt_relevance_macros.relevant_mtP(lit_mt)) {
                                non_abducibleP = T;
                            }
                        } else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, $list2);
                        }
                        csome_list_var = csome_list_var.rest();
                        lit = csome_list_var.first();
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return non_abducibleP;
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 4000L)
    public static SubLObject non_abducible_relationP(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.isaP(relation, $$NonAbducibleRelation, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 4100L)
    public static SubLObject non_abducible_predicateP(SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.isaP(predicate, $$NonAbduciblePredicate, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 4300L)
    public static SubLObject non_abducible_collectionP(SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.isaP(collection, $$NonAbducibleCollection, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 4400L)
    public static SubLObject non_abducible_for_argnumP(SubLObject predicate, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$notAbducibleForArg, predicate, argnum, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 4600L)
    public static SubLObject non_abducible_wrt_value_in_argnumP(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asent = el_utilities.make_ternary_formula($$notAbducibleWRTValueInArg, predicate, value, argnum);
        SubLObject non_abducibleP = NIL;
        SubLObject mt_var = mt;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject l_index = kb_indexing.best_gaf_lookup_index(asent, $TRUE, NIL);
            SubLObject pcase_var;
            SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                SubLObject argnum_$1 = thread.secondMultipleValue();
                SubLObject predicate_$2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum_$1) {
                    if (NIL != predicate_$2) {
                        SubLObject pred_var = predicate_$2;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum_$1, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum_$1, pred_var);
                            SubLObject done_var = non_abducibleP;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$3 = non_abducibleP;
                                        SubLObject token_var_$4 = NIL;
                                        while (NIL == done_var_$3) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                            SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(gaf));
                                            if (NIL != valid_$5 && asent.equal(assertions_high.gaf_formula(gaf))) {
                                                non_abducibleP = T;
                                            }
                                            done_var_$3 = makeBoolean(NIL == valid_$5 || NIL != non_abducibleP);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid || NIL != non_abducibleP);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum_$1, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum_$1, pred_var);
                            SubLObject done_var = non_abducibleP;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$4 = non_abducibleP;
                                        SubLObject token_var_$5 = NIL;
                                        while (NIL == done_var_$4) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(gaf));
                                            if (NIL != valid_$6 && asent.equal(assertions_high.gaf_formula(gaf))) {
                                                non_abducibleP = T;
                                            }
                                            done_var_$4 = makeBoolean(NIL == valid_$6 || NIL != non_abducibleP);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values2 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid || NIL != non_abducibleP);
                            }
                        }
                    }
                } else if (NIL != predicate_$2) {
                    SubLObject pred_var = predicate_$2;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = non_abducibleP;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$5 = non_abducibleP;
                                    SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                        SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(gaf));
                                        if (NIL != valid_$7 && asent.equal(assertions_high.gaf_formula(gaf))) {
                                            non_abducibleP = T;
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7 || NIL != non_abducibleP);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values3 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid || NIL != non_abducibleP);
                        }
                    }
                } else {
                    SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = non_abducibleP;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$6 = non_abducibleP;
                                    SubLObject token_var_$7 = NIL;
                                    while (NIL == done_var_$6) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                        SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(gaf));
                                        if (NIL != valid_$8 && asent.equal(assertions_high.gaf_formula(gaf))) {
                                            non_abducibleP = T;
                                        }
                                        done_var_$6 = makeBoolean(NIL == valid_$8 || NIL != non_abducibleP);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values4 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid || NIL != non_abducibleP);
                        }
                    }
                }
            } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    SubLObject str = NIL;
                    SubLObject _prev_bind_0_$10 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    SubLObject _prev_bind_1_$20 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind(T, thread);
                        utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                        utilities_macros.noting_progress_preamble(str);
                        SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = non_abducibleP;
                        SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$7 = non_abducibleP;
                                    SubLObject token_var_$8 = NIL;
                                    while (NIL == done_var_$7) {
                                        SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$8);
                                        SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(gaf2));
                                        if (NIL != valid_$9 && asent.equal(assertions_high.gaf_formula(gaf2))) {
                                            non_abducibleP = T;
                                        }
                                        done_var_$7 = makeBoolean(NIL == valid_$9 || NIL != non_abducibleP);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values5 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2 || NIL != non_abducibleP);
                        }
                        utilities_macros.noting_progress_postamble();
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$20, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            } else if (pcase_var.eql($OVERLAP)) {
                SubLObject rest;
                SubLObject gaf3;
                for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); NIL == non_abducibleP && NIL != rest; rest = rest.rest()) {
                    gaf3 = rest.first();
                    if (NIL != assertions_high.assertion_has_truth(gaf3, $TRUE) && asent.equal(assertions_high.gaf_formula(gaf3))) {
                        non_abducibleP = T;
                    }
                }
            } else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return non_abducibleP;
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 5000L)
    public static SubLObject non_abducible_wrt_value_in_argnum_via_typeP(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject non_abducibleP = NIL;
        SubLObject mt_var = mt;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject pred_var = $$notAbducibleWRTTypeInArg;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = non_abducibleP;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$25 = non_abducibleP;
                            SubLObject token_var_$26 = NIL;
                            while (NIL == done_var_$25) {
                                SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(gaf));
                                if (NIL != valid_$27 && argnum.numE(assertions_high.gaf_arg3(gaf))) {
                                    SubLObject collection = assertions_high.gaf_arg2(gaf);
                                    if (NIL != isa.isaP(value, collection, mt, UNPROVIDED)) {
                                        non_abducibleP = T;
                                    }
                                }
                                done_var_$25 = makeBoolean(NIL == valid_$27 || NIL != non_abducibleP);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid || NIL != non_abducibleP);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return non_abducibleP;
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 5600L)
    public static SubLObject valid_abduction_asentP(SubLObject asent, SubLObject mt, SubLObject sense, SubLObject contains_abduced_termP) {
        if (NIL == variables.fully_bound_p(asent)) {
            return NIL;
        }
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$isa)) {
            return makeBoolean(NIL == provably_false_contextualized_isa_asentP(asent, mt, sense));
        }
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$termOfUnit)) {
            return makeBoolean(NIL == provably_false_contextualized_tou_asentP(asent, mt));
        }
        if (NIL == contains_abduced_termP && NIL != known_to_be_true_or_falseP(asent, mt, sense)) {
            return NIL;
        }
        return abduction_admitted_formula(asent, mt);
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 6200L)
    public static SubLObject abduction_admitted_formula(SubLObject asent, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            if (NIL == cycl_grammar.cycl_sentence_p(asent)) {
                result = NIL;
            } else if (NIL != kb_accessors.irreflexive_predicateP(cycl_utilities.atomic_sentence_predicate(asent)) && NIL != equals.equalsP(cycl_utilities.reify_arg_when_closed_naut(asent, ONE_INTEGER), cycl_utilities.reify_arg_when_closed_naut(asent, TWO_INTEGER), UNPROVIDED, UNPROVIDED)) {
                result = NIL;
            } else {
                SubLObject _prev_bind_0_$29 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                try {
                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                    result = arg_type.formula_args_ok_wrt_typeP(asent, mt);
                } finally {
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_0_$29, thread);
                }
            }
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 6800L)
    public static SubLObject known_to_be_true_or_falseP(SubLObject asent, SubLObject mt, SubLObject sense) {
        SubLObject v_properties = $list17;
        if (sense.eql($POS)) {
            return list_utilities.sublisp_boolean(backward.removal_ask(asent, mt, $FALSE, v_properties));
        }
        if (sense.eql($NEG)) {
            return list_utilities.sublisp_boolean(backward.removal_ask(asent, mt, $TRUE, v_properties));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 7100L)
    public static SubLObject provably_false_contextualized_isa_asentP(SubLObject asent, SubLObject mt, SubLObject sense) {
        if (NIL == el_utilities.groundP(asent, UNPROVIDED)) {
            return NIL;
        }
        SubLObject inst = el_utilities.literal_arg1(asent, UNPROVIDED);
        SubLObject col = el_utilities.literal_arg2(asent, UNPROVIDED);
        if (NIL != isa.isaP(inst, col, mt, UNPROVIDED)) {
            return NIL;
        }
        return at_defns.quiet_not_has_typeP(inst, col, mt);
    }

    @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 7500L)
    public static SubLObject provably_false_contextualized_tou_asentP(SubLObject asent, SubLObject mt) {
        if (NIL == el_utilities.groundP(asent, UNPROVIDED)) {
            return NIL;
        }
        SubLObject arg1 = el_utilities.literal_arg1(asent, UNPROVIDED);
        SubLObject arg2 = el_utilities.literal_arg2(asent, UNPROVIDED);
        return disjoint_with.instances_of_disjoint_collectionsP(arg1, arg2, mt, UNPROVIDED);
    }

    public static SubLObject declare_inference_abduction_utilities_file() {
        declareFunction(myName, "reject_proof_due_to_non_abducible_ruleP", "REJECT-PROOF-DUE-TO-NON-ABDUCIBLE-RULE?", 3, 0, false);
        declareFunction(myName, "some_abductive_subproofP", "SOME-ABDUCTIVE-SUBPROOF?", 1, 0, false);
        declareFunction(myName, "abduction_allowed_on_asentP", "ABDUCTION-ALLOWED-ON-ASENT?", 1, 2, false);
        declareFunction(myName, "non_abducible_sentenceP", "NON-ABDUCIBLE-SENTENCE?", 2, 0, false);
        declareFunction(myName, "non_abducible_relationP", "NON-ABDUCIBLE-RELATION?", 1, 1, false);
        declareFunction(myName, "non_abducible_predicateP", "NON-ABDUCIBLE-PREDICATE?", 1, 1, false);
        declareFunction(myName, "non_abducible_collectionP", "NON-ABDUCIBLE-COLLECTION?", 1, 1, false);
        declareFunction(myName, "non_abducible_for_argnumP", "NON-ABDUCIBLE-FOR-ARGNUM?", 2, 1, false);
        declareFunction(myName, "non_abducible_wrt_value_in_argnumP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM?", 3, 1, false);
        declareFunction(myName, "non_abducible_wrt_value_in_argnum_via_typeP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM-VIA-TYPE?", 3, 1, false);
        declareFunction(myName, "valid_abduction_asentP", "VALID-ABDUCTION-ASENT?", 4, 0, false);
        declareFunction(myName, "abduction_admitted_formula", "ABDUCTION-ADMITTED-FORMULA", 2, 0, false);
        declareFunction(myName, "known_to_be_true_or_falseP", "KNOWN-TO-BE-TRUE-OR-FALSE?", 3, 0, false);
        declareFunction(myName, "provably_false_contextualized_isa_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-ISA-ASENT?", 3, 0, false);
        declareFunction(myName, "provably_false_contextualized_tou_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-TOU-ASENT?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_abduction_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_inference_abduction_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_abduction_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_abduction_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_abduction_utilities_file();
    }

    static {
        me = new inference_abduction_utilities();
        $POS = makeKeyword("POS");
        $IGNORE = makeKeyword("IGNORE");
        $list2 = list(makeSymbol("LIT-MT"), makeSymbol("LIT-FORMULA"));
        $$nonAbducibleSentence = makeConstSym(("nonAbducibleSentence"));
        $$NonAbducibleRelation = makeConstSym(("NonAbducibleRelation"));
        $$NonAbduciblePredicate = makeConstSym(("NonAbduciblePredicate"));
        $$NonAbducibleCollection = makeConstSym(("NonAbducibleCollection"));
        $$notAbducibleForArg = makeConstSym(("notAbducibleForArg"));
        $TRUE = makeKeyword("TRUE");
        $$notAbducibleWRTValueInArg = makeConstSym(("notAbducibleWRTValueInArg"));
        $GAF_ARG = makeKeyword("GAF-ARG");
        $GAF = makeKeyword("GAF");
        $PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
        $OVERLAP = makeKeyword("OVERLAP");
        $$notAbducibleWRTTypeInArg = makeConstSym(("notAbducibleWRTTypeInArg"));
        $$isa = makeConstSym(("isa"));
        $$termOfUnit = makeConstSym(("termOfUnit"));
        $list17 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ALLOWED-MODULES"), ConsesLow.list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"))));
        $FALSE = makeKeyword("FALSE");
        $NEG = makeKeyword("NEG");
    }

}
/*
 *
 * Total time: 633 ms
 *
 */