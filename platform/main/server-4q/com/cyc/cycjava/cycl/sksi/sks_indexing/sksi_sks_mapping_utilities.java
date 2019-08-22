package com.cyc.cycjava.cycl.sksi.sks_indexing;


import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_sks_mapping_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_sks_mapping_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities";

    public static final String myFingerPrint = "745629251d4ea076dd55eee6ba28f05526a98b1c289eb86237cd30721e005d80";





    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");



    public static final SubLList $list4 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    public static final SubLList $list5 = list(makeSymbol("QUERY-FORM"), makeSymbol("MT"), makeSymbol("MODULES"));

    public static final SubLSymbol GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT = makeSymbol("GATHER-SKSI-GAF-ARG-INDEX-VALUES-INT");

    private static final SubLSymbol GATHER_SKSI_GAF_ARG_INDEX_INT = makeSymbol("GATHER-SKSI-GAF-ARG-INDEX-INT");

    private static final SubLList $list8 = list(makeSymbol("MEANING-SENTENCE"), makeSymbol("QUERY-FORM"), makeSymbol("MT"), makeSymbol("MODULES"));



    private static final SubLList $list10 = list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("SKSI"));



    private static final SubLList $list12 = list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("SKSI")));

    private static final SubLSymbol $sym13$SKSI_SKS_MAPPING_ALLOWED_ = makeSymbol("SKSI-SKS-MAPPING-ALLOWED?");

    public static SubLObject gather_sksi_gaf_lookup_index(final SubLObject asent, final SubLObject sense) {
        if (NIL == sksi_sks_mapping_allowedP(UNPROVIDED)) {
            return NIL;
        }
        final SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
        final SubLObject ask_sent = (sense == $POS) ? asent : make_negation(asent);
        final SubLObject allowed_modules_spec = determine_allowed_modules_spec_for_sks_mapping(UNPROVIDED);
        final SubLObject ask_result = ask_utilities.inference_recursive_query(ask_sent, mt, list($RETURN, $BINDINGS_AND_SUPPORTS, $ALLOWED_MODULES, allowed_modules_spec));
        SubLObject result = NIL;
        SubLObject cdolist_list_var = ask_result;
        SubLObject bindings_and_supports = NIL;
        bindings_and_supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = bindings_and_supports;
            SubLObject v_bindings = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list4);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list4);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                result = cons(supports.first(), result);
            } else {
                cdestructuring_bind_error(datum, $list4);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_and_supports = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject gather_sksi_predicate_extent_index(final SubLObject predicate, final SubLObject truth) {
        if ((NIL != sksi_sks_predicate_indexing.sksi_supported_predicateP(predicate)) && (NIL != sksi_sks_mapping_allowedP(UNPROVIDED))) {
            return gather_sksi_predicate_extent_index_int(predicate, truth);
        }
        return NIL;
    }

    public static SubLObject gather_sksi_predicate_extent_index_int(final SubLObject predicate, final SubLObject truth) {
        final SubLObject query_form_mt_module_list_tuples = sksi_sks_predicate_indexing.gather_query_form_mt_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate(predicate);
        SubLObject answer_list = NIL;
        SubLObject cdolist_list_var = query_form_mt_module_list_tuples;
        SubLObject query_form_mt_module_list_tuple = NIL;
        query_form_mt_module_list_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_form_mt_module_list_tuple;
            SubLObject query_form = NIL;
            SubLObject mt = NIL;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list5);
            query_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list5);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list5);
            v_modules = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject allowed_modules_spec = compute_sksi_modules_allowed_in_current_inference(v_modules);
                SubLObject cdolist_list_var_$1;
                final SubLObject ask_results = cdolist_list_var_$1 = sksi_infrastructure_utilities.removal_ask_template_memoized(query_form, query_form, mt, truth, list($ALLOWED_MODULES, allowed_modules_spec));
                SubLObject formula = NIL;
                formula = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    answer_list = cons(list(formula, mt), answer_list);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    formula = cdolist_list_var_$1.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list5);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_form_mt_module_list_tuple = cdolist_list_var.first();
        } 
        return nreverse(answer_list);
    }

    public static SubLObject gather_sksi_gaf_arg_index_values(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject predicate, final SubLObject truth) {
        if (NIL != sksi_sks_mapping_allowedP(UNPROVIDED)) {
            return gather_sksi_gaf_arg_index_values_int(index_arg, index_argnum, gather_argnum, predicate, truth, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject gather_sksi_gaf_arg_index_values_int_internal(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject predicate, final SubLObject truth, SubLObject inference) {
        if (inference == UNPROVIDED) {
            inference = inference_macros.current_controlling_inference();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred_arity = arity.arity(predicate);
        if (NIL != subl_promotions.positive_integer_p(pred_arity)) {
            final SubLObject arg_list = make_list(pred_arity, index_arg);
            SubLObject answer_list = NIL;
            SubLObject query_form = NIL;
            SubLObject list_var = NIL;
            SubLObject arg = NIL;
            SubLObject index_1 = NIL;
            list_var = copy_list(arg_list);
            arg = list_var.first();
            for (index_1 = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , index_1 = add(ONE_INTEGER, index_1)) {
                if (!index_argnum.eql(number_utilities.f_1X(index_1))) {
                    set_nth(index_1, arg_list, variables.get_variable(index_1));
                }
            }
            query_form = make_el_formula(predicate, arg_list, UNPROVIDED);
            final SubLObject gather_var = cycl_utilities.atomic_sentence_arg(query_form, gather_argnum, UNPROVIDED);
            final SubLObject allowed_modules_spec = determine_allowed_modules_spec_for_sks_mapping(inference);
            SubLObject cdolist_list_var;
            final SubLObject ask_results = cdolist_list_var = list_utilities.fast_delete_duplicates(backward.removal_ask(query_form, mt_relevance_macros.$mt$.getDynamicValue(thread), truth, list($ALLOWED_MODULES, allowed_modules_spec)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject ask_result = NIL;
            ask_result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_bindings = ask_result.first();
                final SubLObject gather_arg_binding = bindings.variable_lookup(gather_var, v_bindings);
                SubLObject cdolist_list_var_$2;
                final SubLObject justifications = cdolist_list_var_$2 = second(ask_result);
                SubLObject just = NIL;
                just = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    answer_list = cons(list(gather_arg_binding, arguments.support_mt(just)), answer_list);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    just = cdolist_list_var_$2.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                ask_result = cdolist_list_var.first();
            } 
            return nreverse(answer_list);
        }
        return NIL;
    }

    public static SubLObject gather_sksi_gaf_arg_index_values_int(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject predicate, final SubLObject truth, SubLObject inference) {
        if (inference == UNPROVIDED) {
            inference = inference_macros.current_controlling_inference();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return gather_sksi_gaf_arg_index_values_int_internal(index_arg, index_argnum, gather_argnum, predicate, truth, inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(index_arg, index_argnum, gather_argnum, predicate, truth, inference);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (index_arg.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (index_argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (gather_argnum.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (predicate.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (truth.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && inference.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(gather_sksi_gaf_arg_index_values_int_internal(index_arg, index_argnum, gather_argnum, predicate, truth, inference)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(index_arg, index_argnum, gather_argnum, predicate, truth, inference));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject gather_sksi_gaf_arg_index(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject predicate, final SubLObject truth) {
        if (NIL != sksi_sks_mapping_allowedP(UNPROVIDED)) {
            return gather_sksi_gaf_arg_index_int(index_arg, index_argnum, predicate, truth, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject gather_sksi_gaf_arg_index_int_internal(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject predicate, final SubLObject truth, SubLObject inference) {
        if (inference == UNPROVIDED) {
            inference = inference_macros.current_controlling_inference();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred_arity = arity.arity(predicate);
        if (!pred_arity.isInteger()) {
            return NIL;
        }
        final SubLObject arg_list = make_list(pred_arity, index_arg);
        SubLObject answer_list = NIL;
        SubLObject query_form = NIL;
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject index_1 = NIL;
        list_var = copy_list(arg_list);
        arg = list_var.first();
        for (index_1 = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , index_1 = add(ONE_INTEGER, index_1)) {
            if (!index_argnum.eql(number_utilities.f_1X(index_1))) {
                set_nth(index_1, arg_list, variables.get_variable(index_1));
            }
        }
        query_form = make_el_formula(predicate, arg_list, UNPROVIDED);
        final SubLObject allowed_modules_spec = determine_allowed_modules_spec_for_sks_mapping(inference);
        SubLObject cdolist_list_var;
        final SubLObject ask_results = cdolist_list_var = list_utilities.fast_delete_duplicates(backward.removal_ask(query_form, mt_relevance_macros.$mt$.getDynamicValue(thread), truth, list($ALLOWED_MODULES, allowed_modules_spec)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject ask_result = NIL;
        ask_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = ask_result.first();
            SubLObject cdolist_list_var_$3;
            final SubLObject justifications = cdolist_list_var_$3 = second(ask_result);
            SubLObject just = NIL;
            just = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                answer_list = cons(list(bindings.subst_bindings(v_bindings, query_form), arguments.support_mt(just)), answer_list);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                just = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            ask_result = cdolist_list_var.first();
        } 
        return nreverse(answer_list);
    }

    public static SubLObject gather_sksi_gaf_arg_index_int(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject predicate, final SubLObject truth, SubLObject inference) {
        if (inference == UNPROVIDED) {
            inference = inference_macros.current_controlling_inference();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return gather_sksi_gaf_arg_index_int_internal(index_arg, index_argnum, predicate, truth, inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GATHER_SKSI_GAF_ARG_INDEX_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GATHER_SKSI_GAF_ARG_INDEX_INT, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GATHER_SKSI_GAF_ARG_INDEX_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(index_arg, index_argnum, predicate, truth, inference);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (index_arg.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (index_argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (predicate.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (truth.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && inference.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(gather_sksi_gaf_arg_index_int_internal(index_arg, index_argnum, predicate, truth, inference)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(index_arg, index_argnum, predicate, truth, inference));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject gather_sksi_gaf_arg_index_values_relevant_pred(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject truth) {
        if (NIL != sksi_sks_mapping_allowedP(UNPROVIDED)) {
            SubLObject v_answer = NIL;
            if (NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argumentP(index_arg)) {
                v_answer = gather_sksi_gaf_arg_index_values_relevant_pred_by_term(index_arg, index_argnum, gather_argnum, truth);
            }
            if (NIL == v_answer) {
                v_answer = gather_sksi_gaf_arg_index_values_relevant_pred_int(index_arg, index_argnum, gather_argnum, truth);
            }
            return v_answer;
        }
        return NIL;
    }

    public static SubLObject gather_sksi_gaf_arg_index_values_relevant_pred_by_term(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject truth) {
        final SubLObject query_form_mt_module_list_tuples = sksi_sks_gaf_arg_indexing.gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position(index_arg, index_argnum);
        return gather_bindings_from_query_form_mt_module_list_tuples(query_form_mt_module_list_tuples, gather_argnum, truth);
    }

    public static SubLObject gather_bindings_from_query_form_mt_module_list_tuples(final SubLObject query_form_mt_module_list_tuples, final SubLObject gather_argnum, final SubLObject truth) {
        SubLObject answer_list = NIL;
        SubLObject cdolist_list_var = query_form_mt_module_list_tuples;
        SubLObject query_form_mt_module_list_tuple = NIL;
        query_form_mt_module_list_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_form_mt_module_list_tuple;
            SubLObject query_form = NIL;
            SubLObject mt = NIL;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list5);
            query_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list5);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list5);
            v_modules = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject allowed_modules_spec = compute_sksi_modules_allowed_in_current_inference(v_modules);
                if (NIL != allowed_modules_spec) {
                    final SubLObject gather_var = cycl_utilities.formula_arg(query_form, gather_argnum, UNPROVIDED);
                    SubLObject cdolist_list_var_$4;
                    final SubLObject ask_results = cdolist_list_var_$4 = sksi_infrastructure_utilities.removal_ask_hl_variable_memoized(gather_var, query_form, mt, truth, list($ALLOWED_MODULES, allowed_modules_spec));
                    SubLObject binding = NIL;
                    binding = cdolist_list_var_$4.first();
                    while (NIL != cdolist_list_var_$4) {
                        answer_list = cons(list(binding, mt, cycl_utilities.formula_operator(query_form)), answer_list);
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        binding = cdolist_list_var_$4.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list5);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_form_mt_module_list_tuple = cdolist_list_var.first();
        } 
        return nreverse(answer_list);
    }

    public static SubLObject gather_sksi_gaf_arg_index_values_relevant_pred_int(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject truth) {
        final SubLObject meaning_sentence_query_form_mt_module_list_tuples = sksi_sks_predicate_indexing.gather_relevant_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache();
        return gather_bindings_for_index_arg_value_from_meaning_sentence_query_form_mt_module_list_tuples(meaning_sentence_query_form_mt_module_list_tuples, index_arg, index_argnum, gather_argnum, truth);
    }

    public static SubLObject gather_bindings_for_index_arg_value_from_meaning_sentence_query_form_mt_module_list_tuples(final SubLObject meaning_sentence_query_form_mt_module_list_tuples, final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject truth) {
        final SubLObject allowed_modules_spec = determine_allowed_modules_spec_for_sks_mapping(UNPROVIDED);
        SubLObject answer_list = NIL;
        SubLObject cdolist_list_var = meaning_sentence_query_form_mt_module_list_tuples;
        SubLObject meaning_sentence_query_form_mt_module_list_tuple = NIL;
        meaning_sentence_query_form_mt_module_list_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = meaning_sentence_query_form_mt_module_list_tuple;
            SubLObject meaning_sentence = NIL;
            SubLObject query_form = NIL;
            SubLObject mt = NIL;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list8);
            meaning_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list8);
            query_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list8);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list8);
            v_modules = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject index_var = cycl_utilities.formula_arg(query_form, index_argnum, UNPROVIDED);
                final SubLObject mod_query_form = cycl_utilities.expression_subst(index_arg, index_var, query_form, symbol_function(EQUAL), UNPROVIDED);
                if (NIL != meaning_sentence_type_check_query_form(mod_query_form, meaning_sentence, mt)) {
                    final SubLObject gather_var = cycl_utilities.formula_arg(query_form, gather_argnum, UNPROVIDED);
                    SubLObject cdolist_list_var_$5;
                    final SubLObject ask_results = cdolist_list_var_$5 = sksi_infrastructure_utilities.removal_ask_hl_variable_memoized(gather_var, mod_query_form, mt, truth, list($ALLOWED_MODULES, allowed_modules_spec));
                    SubLObject binding = NIL;
                    binding = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        answer_list = cons(list(binding, mt, cycl_utilities.formula_operator(query_form)), answer_list);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        binding = cdolist_list_var_$5.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list8);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence_query_form_mt_module_list_tuple = cdolist_list_var.first();
        } 
        return nreverse(answer_list);
    }

    public static SubLObject gather_sksi_gaf_arg_index_relevant_pred(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject truth) {
        if (NIL != sksi_sks_mapping_allowedP(UNPROVIDED)) {
            SubLObject v_answer = NIL;
            if (NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argumentP(index_arg)) {
                v_answer = gather_sksi_gaf_arg_index_relevant_pred_by_term(index_arg, index_argnum, truth);
            }
            if (NIL == v_answer) {
                v_answer = gather_sksi_gaf_arg_index_relevant_pred_int(index_arg, index_argnum, truth);
            }
            return v_answer;
        }
        return NIL;
    }

    public static SubLObject gather_sksi_gaf_arg_index_relevant_pred_by_term(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject truth) {
        final SubLObject query_form_mt_module_list_tuples = sksi_sks_gaf_arg_indexing.gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position(index_arg, index_argnum);
        return gather_sksi_gaf_arg_index_relevant_pred_by_term_int(query_form_mt_module_list_tuples, truth);
    }

    public static SubLObject gather_sksi_gaf_arg_index_relevant_pred_by_term_int(final SubLObject query_form_mt_module_list_tuples, final SubLObject truth) {
        SubLObject answer_list = NIL;
        SubLObject cdolist_list_var = query_form_mt_module_list_tuples;
        SubLObject query_form_mt_module_list_tuple = NIL;
        query_form_mt_module_list_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_form_mt_module_list_tuple;
            SubLObject query_form = NIL;
            SubLObject mt = NIL;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list5);
            query_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list5);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list5);
            v_modules = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject allowed_modules_spec = compute_sksi_modules_allowed_in_current_inference(v_modules);
                if (NIL != allowed_modules_spec) {
                    SubLObject cdolist_list_var_$6;
                    final SubLObject ask_results = cdolist_list_var_$6 = sksi_infrastructure_utilities.removal_ask_template_memoized(query_form, query_form, mt, truth, list($ALLOWED_MODULES, allowed_modules_spec));
                    SubLObject formula = NIL;
                    formula = cdolist_list_var_$6.first();
                    while (NIL != cdolist_list_var_$6) {
                        answer_list = cons(list(formula, mt), answer_list);
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        formula = cdolist_list_var_$6.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list5);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_form_mt_module_list_tuple = cdolist_list_var.first();
        } 
        return nreverse(answer_list);
    }

    public static SubLObject gather_sksi_gaf_arg_index_relevant_pred_int(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject truth) {
        final SubLObject meaning_sentence_query_form_mt_module_list_tuples = sksi_sks_predicate_indexing.gather_relevant_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache();
        return gather_instantiated_formulas_from_meaning_sentence_query_form_mt_module_list_tuples(meaning_sentence_query_form_mt_module_list_tuples, index_arg, index_argnum, truth);
    }

    public static SubLObject gather_instantiated_formulas_from_meaning_sentence_query_form_mt_module_list_tuples(final SubLObject meaning_sentence_query_form_mt_module_list_tuples, final SubLObject index_arg, final SubLObject index_argnum, final SubLObject truth) {
        final SubLObject allowed_modules_spec = determine_allowed_modules_spec_for_sks_mapping(UNPROVIDED);
        SubLObject answer_list = NIL;
        SubLObject cdolist_list_var = meaning_sentence_query_form_mt_module_list_tuples;
        SubLObject meaning_sentence_query_form_mt_module_list_tuple = NIL;
        meaning_sentence_query_form_mt_module_list_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = meaning_sentence_query_form_mt_module_list_tuple;
            SubLObject meaning_sentence = NIL;
            SubLObject query_form = NIL;
            SubLObject mt = NIL;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list8);
            meaning_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list8);
            query_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list8);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list8);
            v_modules = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject index_var = cycl_utilities.formula_arg(query_form, index_argnum, UNPROVIDED);
                final SubLObject mod_query_form = cycl_utilities.expression_subst(index_arg, index_var, query_form, symbol_function(EQ), UNPROVIDED);
                if (NIL != meaning_sentence_type_check_query_form(mod_query_form, meaning_sentence, mt)) {
                    SubLObject cdolist_list_var_$7;
                    final SubLObject ask_results = cdolist_list_var_$7 = sksi_infrastructure_utilities.removal_ask_template_memoized(mod_query_form, mod_query_form, mt, truth, list($ALLOWED_MODULES, allowed_modules_spec));
                    SubLObject formula = NIL;
                    formula = cdolist_list_var_$7.first();
                    while (NIL != cdolist_list_var_$7) {
                        answer_list = cons(list(formula, mt), answer_list);
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        formula = cdolist_list_var_$7.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list8);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence_query_form_mt_module_list_tuple = cdolist_list_var.first();
        } 
        return nreverse(answer_list);
    }

    public static SubLObject meaning_sentence_type_check_query_form(final SubLObject query_form, final SubLObject meaning_sentence, final SubLObject mt) {
        SubLObject new_query_form = NIL;
        SubLObject termnum = ZERO_INTEGER;
        SubLObject q_term = NIL;
        SubLObject q_term_$8 = NIL;
        SubLObject m_term = NIL;
        SubLObject m_term_$9 = NIL;
        q_term = query_form;
        q_term_$8 = q_term.first();
        m_term = meaning_sentence;
        m_term_$9 = m_term.first();
        while ((NIL != m_term) || (NIL != q_term)) {
            if (NIL != variables.variable_p(q_term_$8)) {
                new_query_form = cons(m_term_$9, new_query_form);
            } else {
                new_query_form = cons(q_term_$8, new_query_form);
            }
            termnum = add(termnum, ONE_INTEGER);
            q_term = q_term.rest();
            q_term_$8 = q_term.first();
            m_term = m_term.rest();
            m_term_$9 = m_term.first();
        } 
        new_query_form = nreverse(new_query_form);
        return sksi_meaning_sentence_utilities.meaning_sentence_type_check(new_query_form, meaning_sentence, NIL, mt, sksi_kb_accessors.content_mt_to_mapping_mt(mt), $RAW, T, T);
    }

    public static SubLObject make_sksi_link_support(final SubLObject asent, final SubLObject mt) {
        return sksi_infrastructure_utilities.make_sksi_support(asent, mt);
    }

    public static SubLObject determine_allowed_modules_spec_for_sks_mapping(SubLObject current_inference) {
        if (current_inference == UNPROVIDED) {
            current_inference = inference_macros.current_controlling_inference();
        }
        if (NIL == inference_datastructures_inference.inference_p(current_inference)) {
            return $list10;
        }
        final SubLObject inference_allowed_modules_spec = inference_datastructures_inference.inference_allowed_modules(current_inference);
        if (inference_allowed_modules_spec == $ALL) {
            return $list10;
        }
        if (NIL != sksi_modules_allowed_in_current_inferenceP()) {
            return $list10;
        }
        return inference_allowed_modules_spec;
    }

    public static SubLObject compute_sksi_modules_allowed_in_current_inference(final SubLObject v_modules) {
        final SubLObject current_inference = inference_macros.current_controlling_inference();
        if (NIL == inference_datastructures_inference.inference_p(current_inference)) {
            return sksi_infrastructure_utilities.hl_modules_list_to_allowed_modules_spec(v_modules);
        }
        SubLObject allowed_modules = NIL;
        SubLObject cdolist_list_var = v_modules;
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(current_inference, module)) {
                allowed_modules = cons(module, allowed_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        if (NIL != allowed_modules) {
            allowed_modules = nreverse(allowed_modules);
            return sksi_infrastructure_utilities.hl_modules_list_to_allowed_modules_spec(allowed_modules);
        }
        return NIL;
    }

    public static SubLObject sksi_modules_allowed_in_current_inferenceP() {
        final SubLObject current_inference = inference_macros.current_controlling_inference();
        if (NIL == inference_datastructures_inference.inference_p(current_inference)) {
            return T;
        }
        if (NIL == sksi_modules_not_allowed_in_inferenceP(current_inference)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject sksi_modules_not_allowed_in_inferenceP(final SubLObject inference) {
        final SubLObject allowed_modules_spec = inference_datastructures_inference.inference_allowed_modules(inference);
        return sksi_modules_not_allowed_by_allowed_modules_specP(allowed_modules_spec);
    }

    public static SubLObject sksi_modules_not_allowed_by_allowed_modules_specP(final SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == $ALL) {
            return NIL;
        }
        if (!allowed_modules_spec.isList()) {
            return NIL;
        }
        if (NIL != subl_promotions.memberP($list12, allowed_modules_spec, symbol_function(EQUAL), UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject sksi_sks_mapping_allowedP_internal(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = makeBoolean((((NIL != sksi_query_utilities.some_sksi_removal_module_registeredP()) && (NIL != sksi_infrastructure_utilities.some_external_source_activated_in_imageP())) && (NIL != sksi_modules_allowed_in_current_inferenceP())) && (NIL != sksi_infrastructure_utilities.any_sksi_content_mt_with_registered_module_relevantP()));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sksi_sks_mapping_allowedP(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_sks_mapping_allowedP_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym13$SKSI_SKS_MAPPING_ALLOWED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym13$SKSI_SKS_MAPPING_ALLOWED_, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym13$SKSI_SKS_MAPPING_ALLOWED_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_sks_mapping_allowedP_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_sksi_sks_mapping_utilities_file() {
        declareFunction(me, "gather_sksi_gaf_lookup_index", "GATHER-SKSI-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction(me, "gather_sksi_predicate_extent_index", "GATHER-SKSI-PREDICATE-EXTENT-INDEX", 2, 0, false);
        declareFunction(me, "gather_sksi_predicate_extent_index_int", "GATHER-SKSI-PREDICATE-EXTENT-INDEX-INT", 2, 0, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_values", "GATHER-SKSI-GAF-ARG-INDEX-VALUES", 5, 0, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_values_int_internal", "GATHER-SKSI-GAF-ARG-INDEX-VALUES-INT-INTERNAL", 5, 1, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_values_int", "GATHER-SKSI-GAF-ARG-INDEX-VALUES-INT", 5, 1, false);
        declareFunction(me, "gather_sksi_gaf_arg_index", "GATHER-SKSI-GAF-ARG-INDEX", 4, 0, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_int_internal", "GATHER-SKSI-GAF-ARG-INDEX-INT-INTERNAL", 4, 1, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_int", "GATHER-SKSI-GAF-ARG-INDEX-INT", 4, 1, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_values_relevant_pred", "GATHER-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED", 4, 0, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_values_relevant_pred_by_term", "GATHER-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED-BY-TERM", 4, 0, false);
        declareFunction(me, "gather_bindings_from_query_form_mt_module_list_tuples", "GATHER-BINDINGS-FROM-QUERY-FORM-MT-MODULE-LIST-TUPLES", 3, 0, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_values_relevant_pred_int", "GATHER-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED-INT", 4, 0, false);
        declareFunction(me, "gather_bindings_for_index_arg_value_from_meaning_sentence_query_form_mt_module_list_tuples", "GATHER-BINDINGS-FOR-INDEX-ARG-VALUE-FROM-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES", 5, 0, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_relevant_pred", "GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED", 3, 0, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_relevant_pred_by_term", "GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED-BY-TERM", 3, 0, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_relevant_pred_by_term_int", "GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED-BY-TERM-INT", 2, 0, false);
        declareFunction(me, "gather_sksi_gaf_arg_index_relevant_pred_int", "GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED-INT", 3, 0, false);
        declareFunction(me, "gather_instantiated_formulas_from_meaning_sentence_query_form_mt_module_list_tuples", "GATHER-INSTANTIATED-FORMULAS-FROM-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES", 4, 0, false);
        declareFunction(me, "meaning_sentence_type_check_query_form", "MEANING-SENTENCE-TYPE-CHECK-QUERY-FORM", 3, 0, false);
        declareFunction(me, "make_sksi_link_support", "MAKE-SKSI-LINK-SUPPORT", 2, 0, false);
        declareFunction(me, "determine_allowed_modules_spec_for_sks_mapping", "DETERMINE-ALLOWED-MODULES-SPEC-FOR-SKS-MAPPING", 0, 1, false);
        declareFunction(me, "compute_sksi_modules_allowed_in_current_inference", "COMPUTE-SKSI-MODULES-ALLOWED-IN-CURRENT-INFERENCE", 1, 0, false);
        declareFunction(me, "sksi_modules_allowed_in_current_inferenceP", "SKSI-MODULES-ALLOWED-IN-CURRENT-INFERENCE?", 0, 0, false);
        declareFunction(me, "sksi_modules_not_allowed_in_inferenceP", "SKSI-MODULES-NOT-ALLOWED-IN-INFERENCE?", 1, 0, false);
        declareFunction(me, "sksi_modules_not_allowed_by_allowed_modules_specP", "SKSI-MODULES-NOT-ALLOWED-BY-ALLOWED-MODULES-SPEC?", 1, 0, false);
        declareFunction(me, "sksi_sks_mapping_allowedP_internal", "SKSI-SKS-MAPPING-ALLOWED?-INTERNAL", 0, 1, false);
        declareFunction(me, "sksi_sks_mapping_allowedP", "SKSI-SKS-MAPPING-ALLOWED?", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_sksi_sks_mapping_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_sks_mapping_utilities_file() {
        memoization_state.note_memoized_function(GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT);
        memoization_state.note_memoized_function(GATHER_SKSI_GAF_ARG_INDEX_INT);
        memoization_state.note_memoized_function($sym13$SKSI_SKS_MAPPING_ALLOWED_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_sks_mapping_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_sks_mapping_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_sks_mapping_utilities_file();
    }

    
}

/**
 * Total time: 176 ms
 */
