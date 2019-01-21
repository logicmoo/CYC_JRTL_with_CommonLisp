package com.cyc.cycjava.cycl.sksi.sks_indexing;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.arity;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_mapping_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities";
    public static final String myFingerPrint = "745629251d4ea076dd55eee6ba28f05526a98b1c289eb86237cd30721e005d80";
    private static final SubLSymbol $kw0$POS;
    private static final SubLSymbol $kw1$RETURN;
    private static final SubLSymbol $kw2$BINDINGS_AND_SUPPORTS;
    private static final SubLSymbol $kw3$ALLOWED_MODULES;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT;
    private static final SubLSymbol $sym7$GATHER_SKSI_GAF_ARG_INDEX_INT;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$RAW;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$ALL;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$SKSI_SKS_MAPPING_ALLOWED_;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 931L)
    public static SubLObject gather_sksi_gaf_lookup_index(final SubLObject asent, final SubLObject sense) {
        if (sksi_sks_mapping_utilities.NIL == sksi_sks_mapping_allowedP((SubLObject)sksi_sks_mapping_utilities.UNPROVIDED)) {
            return (SubLObject)sksi_sks_mapping_utilities.NIL;
        }
        final SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
        final SubLObject ask_sent = (sense == sksi_sks_mapping_utilities.$kw0$POS) ? asent : el_utilities.make_negation(asent);
        final SubLObject allowed_modules_spec = determine_allowed_modules_spec_for_sks_mapping((SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        final SubLObject ask_result = ask_utilities.inference_recursive_query(ask_sent, mt, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_utilities.$kw1$RETURN, (SubLObject)sksi_sks_mapping_utilities.$kw2$BINDINGS_AND_SUPPORTS, (SubLObject)sksi_sks_mapping_utilities.$kw3$ALLOWED_MODULES, allowed_modules_spec));
        SubLObject result = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject cdolist_list_var = ask_result;
        SubLObject bindings_and_supports = (SubLObject)sksi_sks_mapping_utilities.NIL;
        bindings_and_supports = cdolist_list_var.first();
        while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = bindings_and_supports;
            SubLObject v_bindings = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject supports = (SubLObject)sksi_sks_mapping_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list4);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list4);
            supports = current.first();
            current = current.rest();
            if (sksi_sks_mapping_utilities.NIL == current) {
                result = (SubLObject)ConsesLow.cons(supports.first(), result);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_utilities.$list4);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_and_supports = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 1687L)
    public static SubLObject gather_sksi_predicate_extent_index(final SubLObject predicate, final SubLObject truth) {
        if (sksi_sks_mapping_utilities.NIL != sksi_sks_predicate_indexing.sksi_supported_predicateP(predicate) && sksi_sks_mapping_utilities.NIL != sksi_sks_mapping_allowedP((SubLObject)sksi_sks_mapping_utilities.UNPROVIDED)) {
            return gather_sksi_predicate_extent_index_int(predicate, truth);
        }
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 2251L)
    public static SubLObject gather_sksi_predicate_extent_index_int(final SubLObject predicate, final SubLObject truth) {
        final SubLObject query_form_mt_module_list_tuples = sksi_sks_predicate_indexing.gather_query_form_mt_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate(predicate);
        SubLObject answer_list = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject cdolist_list_var = query_form_mt_module_list_tuples;
        SubLObject query_form_mt_module_list_tuple = (SubLObject)sksi_sks_mapping_utilities.NIL;
        query_form_mt_module_list_tuple = cdolist_list_var.first();
        while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_form_mt_module_list_tuple;
            SubLObject query_form = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject mt = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject v_modules = (SubLObject)sksi_sks_mapping_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            query_form = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            v_modules = current.first();
            current = current.rest();
            if (sksi_sks_mapping_utilities.NIL == current) {
                final SubLObject allowed_modules_spec = compute_sksi_modules_allowed_in_current_inference(v_modules);
                SubLObject cdolist_list_var_$1;
                final SubLObject ask_results = cdolist_list_var_$1 = sksi_infrastructure_utilities.removal_ask_template_memoized(query_form, query_form, mt, truth, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_utilities.$kw3$ALLOWED_MODULES, allowed_modules_spec));
                SubLObject formula = (SubLObject)sksi_sks_mapping_utilities.NIL;
                formula = cdolist_list_var_$1.first();
                while (sksi_sks_mapping_utilities.NIL != cdolist_list_var_$1) {
                    answer_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(formula, mt), answer_list);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    formula = cdolist_list_var_$1.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_form_mt_module_list_tuple = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 2997L)
    public static SubLObject gather_sksi_gaf_arg_index_values(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject predicate, final SubLObject truth) {
        if (sksi_sks_mapping_utilities.NIL != sksi_sks_mapping_allowedP((SubLObject)sksi_sks_mapping_utilities.UNPROVIDED)) {
            return gather_sksi_gaf_arg_index_values_int(index_arg, index_argnum, gather_argnum, predicate, truth, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        }
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 3673L)
    public static SubLObject gather_sksi_gaf_arg_index_values_int_internal(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject predicate, final SubLObject truth, SubLObject inference) {
        if (inference == sksi_sks_mapping_utilities.UNPROVIDED) {
            inference = inference_macros.current_controlling_inference();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred_arity = arity.arity(predicate);
        if (sksi_sks_mapping_utilities.NIL != subl_promotions.positive_integer_p(pred_arity)) {
            final SubLObject arg_list = (SubLObject)ConsesLow.make_list(pred_arity, index_arg);
            SubLObject answer_list = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject query_form = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject list_var = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject arg = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject index_1 = (SubLObject)sksi_sks_mapping_utilities.NIL;
            list_var = conses_high.copy_list(arg_list);
            arg = list_var.first();
            for (index_1 = (SubLObject)sksi_sks_mapping_utilities.ZERO_INTEGER; sksi_sks_mapping_utilities.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), index_1 = Numbers.add((SubLObject)sksi_sks_mapping_utilities.ONE_INTEGER, index_1)) {
                if (!index_argnum.eql(number_utilities.f_1X(index_1))) {
                    ConsesLow.set_nth(index_1, arg_list, variables.get_variable(index_1));
                }
            }
            query_form = el_utilities.make_el_formula(predicate, arg_list, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
            final SubLObject gather_var = cycl_utilities.atomic_sentence_arg(query_form, gather_argnum, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
            final SubLObject allowed_modules_spec = determine_allowed_modules_spec_for_sks_mapping(inference);
            SubLObject cdolist_list_var;
            final SubLObject ask_results = cdolist_list_var = list_utilities.fast_delete_duplicates(backward.removal_ask(query_form, mt_relevance_macros.$mt$.getDynamicValue(thread), truth, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_utilities.$kw3$ALLOWED_MODULES, allowed_modules_spec)), (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
            SubLObject ask_result = (SubLObject)sksi_sks_mapping_utilities.NIL;
            ask_result = cdolist_list_var.first();
            while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
                final SubLObject v_bindings = ask_result.first();
                final SubLObject gather_arg_binding = bindings.variable_lookup(gather_var, v_bindings);
                SubLObject cdolist_list_var_$2;
                final SubLObject justifications = cdolist_list_var_$2 = conses_high.second(ask_result);
                SubLObject just = (SubLObject)sksi_sks_mapping_utilities.NIL;
                just = cdolist_list_var_$2.first();
                while (sksi_sks_mapping_utilities.NIL != cdolist_list_var_$2) {
                    answer_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(gather_arg_binding, arguments.support_mt(just)), answer_list);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    just = cdolist_list_var_$2.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                ask_result = cdolist_list_var.first();
            }
            return Sequences.nreverse(answer_list);
        }
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 3673L)
    public static SubLObject gather_sksi_gaf_arg_index_values_int(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject predicate, final SubLObject truth, SubLObject inference) {
        if (inference == sksi_sks_mapping_utilities.UNPROVIDED) {
            inference = inference_macros.current_controlling_inference();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_sks_mapping_utilities.NIL;
        if (sksi_sks_mapping_utilities.NIL == v_memoization_state) {
            return gather_sksi_gaf_arg_index_values_int_internal(index_arg, index_argnum, gather_argnum, predicate, truth, inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_sks_mapping_utilities.$sym6$GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        if (sksi_sks_mapping_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_sks_mapping_utilities.$sym6$GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT, (SubLObject)sksi_sks_mapping_utilities.SIX_INTEGER, (SubLObject)sksi_sks_mapping_utilities.NIL, (SubLObject)sksi_sks_mapping_utilities.EQUAL, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_sks_mapping_utilities.$sym6$GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(index_arg, index_argnum, gather_argnum, predicate, truth, inference);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_sks_mapping_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
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
                                    if (sksi_sks_mapping_utilities.NIL != cached_args && sksi_sks_mapping_utilities.NIL == cached_args.rest() && inference.equal(cached_args.first())) {
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gather_sksi_gaf_arg_index_values_int_internal(index_arg, index_argnum, gather_argnum, predicate, truth, inference)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(index_arg, index_argnum, gather_argnum, predicate, truth, inference));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 4895L)
    public static SubLObject gather_sksi_gaf_arg_index(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject predicate, final SubLObject truth) {
        if (sksi_sks_mapping_utilities.NIL != sksi_sks_mapping_allowedP((SubLObject)sksi_sks_mapping_utilities.UNPROVIDED)) {
            return gather_sksi_gaf_arg_index_int(index_arg, index_argnum, predicate, truth, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        }
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 5294L)
    public static SubLObject gather_sksi_gaf_arg_index_int_internal(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject predicate, final SubLObject truth, SubLObject inference) {
        if (inference == sksi_sks_mapping_utilities.UNPROVIDED) {
            inference = inference_macros.current_controlling_inference();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred_arity = arity.arity(predicate);
        if (!pred_arity.isInteger()) {
            return (SubLObject)sksi_sks_mapping_utilities.NIL;
        }
        final SubLObject arg_list = (SubLObject)ConsesLow.make_list(pred_arity, index_arg);
        SubLObject answer_list = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject query_form = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject list_var = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject arg = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject index_1 = (SubLObject)sksi_sks_mapping_utilities.NIL;
        list_var = conses_high.copy_list(arg_list);
        arg = list_var.first();
        for (index_1 = (SubLObject)sksi_sks_mapping_utilities.ZERO_INTEGER; sksi_sks_mapping_utilities.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), index_1 = Numbers.add((SubLObject)sksi_sks_mapping_utilities.ONE_INTEGER, index_1)) {
            if (!index_argnum.eql(number_utilities.f_1X(index_1))) {
                ConsesLow.set_nth(index_1, arg_list, variables.get_variable(index_1));
            }
        }
        query_form = el_utilities.make_el_formula(predicate, arg_list, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        final SubLObject allowed_modules_spec = determine_allowed_modules_spec_for_sks_mapping(inference);
        SubLObject cdolist_list_var;
        final SubLObject ask_results = cdolist_list_var = list_utilities.fast_delete_duplicates(backward.removal_ask(query_form, mt_relevance_macros.$mt$.getDynamicValue(thread), truth, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_utilities.$kw3$ALLOWED_MODULES, allowed_modules_spec)), (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        SubLObject ask_result = (SubLObject)sksi_sks_mapping_utilities.NIL;
        ask_result = cdolist_list_var.first();
        while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
            final SubLObject v_bindings = ask_result.first();
            SubLObject cdolist_list_var_$3;
            final SubLObject justifications = cdolist_list_var_$3 = conses_high.second(ask_result);
            SubLObject just = (SubLObject)sksi_sks_mapping_utilities.NIL;
            just = cdolist_list_var_$3.first();
            while (sksi_sks_mapping_utilities.NIL != cdolist_list_var_$3) {
                answer_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(bindings.subst_bindings(v_bindings, query_form), arguments.support_mt(just)), answer_list);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                just = cdolist_list_var_$3.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            ask_result = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 5294L)
    public static SubLObject gather_sksi_gaf_arg_index_int(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject predicate, final SubLObject truth, SubLObject inference) {
        if (inference == sksi_sks_mapping_utilities.UNPROVIDED) {
            inference = inference_macros.current_controlling_inference();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_sks_mapping_utilities.NIL;
        if (sksi_sks_mapping_utilities.NIL == v_memoization_state) {
            return gather_sksi_gaf_arg_index_int_internal(index_arg, index_argnum, predicate, truth, inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_sks_mapping_utilities.$sym7$GATHER_SKSI_GAF_ARG_INDEX_INT, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        if (sksi_sks_mapping_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_sks_mapping_utilities.$sym7$GATHER_SKSI_GAF_ARG_INDEX_INT, (SubLObject)sksi_sks_mapping_utilities.FIVE_INTEGER, (SubLObject)sksi_sks_mapping_utilities.NIL, (SubLObject)sksi_sks_mapping_utilities.EQUAL, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_sks_mapping_utilities.$sym7$GATHER_SKSI_GAF_ARG_INDEX_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(index_arg, index_argnum, predicate, truth, inference);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_sks_mapping_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (index_arg.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (index_argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (predicate.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (truth.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (sksi_sks_mapping_utilities.NIL != cached_args && sksi_sks_mapping_utilities.NIL == cached_args.rest() && inference.equal(cached_args.first())) {
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gather_sksi_gaf_arg_index_int_internal(index_arg, index_argnum, predicate, truth, inference)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(index_arg, index_argnum, predicate, truth, inference));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 6752L)
    public static SubLObject gather_sksi_gaf_arg_index_values_relevant_pred(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject truth) {
        if (sksi_sks_mapping_utilities.NIL != sksi_sks_mapping_allowedP((SubLObject)sksi_sks_mapping_utilities.UNPROVIDED)) {
            SubLObject v_answer = (SubLObject)sksi_sks_mapping_utilities.NIL;
            if (sksi_sks_mapping_utilities.NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argumentP(index_arg)) {
                v_answer = gather_sksi_gaf_arg_index_values_relevant_pred_by_term(index_arg, index_argnum, gather_argnum, truth);
            }
            if (sksi_sks_mapping_utilities.NIL == v_answer) {
                v_answer = gather_sksi_gaf_arg_index_values_relevant_pred_int(index_arg, index_argnum, gather_argnum, truth);
            }
            return v_answer;
        }
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 7786L)
    public static SubLObject gather_sksi_gaf_arg_index_values_relevant_pred_by_term(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject truth) {
        final SubLObject query_form_mt_module_list_tuples = sksi_sks_gaf_arg_indexing.gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position(index_arg, index_argnum);
        return gather_bindings_from_query_form_mt_module_list_tuples(query_form_mt_module_list_tuples, gather_argnum, truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 8209L)
    public static SubLObject gather_bindings_from_query_form_mt_module_list_tuples(final SubLObject query_form_mt_module_list_tuples, final SubLObject gather_argnum, final SubLObject truth) {
        SubLObject answer_list = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject cdolist_list_var = query_form_mt_module_list_tuples;
        SubLObject query_form_mt_module_list_tuple = (SubLObject)sksi_sks_mapping_utilities.NIL;
        query_form_mt_module_list_tuple = cdolist_list_var.first();
        while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_form_mt_module_list_tuple;
            SubLObject query_form = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject mt = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject v_modules = (SubLObject)sksi_sks_mapping_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            query_form = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            v_modules = current.first();
            current = current.rest();
            if (sksi_sks_mapping_utilities.NIL == current) {
                final SubLObject allowed_modules_spec = compute_sksi_modules_allowed_in_current_inference(v_modules);
                if (sksi_sks_mapping_utilities.NIL != allowed_modules_spec) {
                    final SubLObject gather_var = cycl_utilities.formula_arg(query_form, gather_argnum, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
                    SubLObject cdolist_list_var_$4;
                    final SubLObject ask_results = cdolist_list_var_$4 = sksi_infrastructure_utilities.removal_ask_hl_variable_memoized(gather_var, query_form, mt, truth, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_utilities.$kw3$ALLOWED_MODULES, allowed_modules_spec));
                    SubLObject binding = (SubLObject)sksi_sks_mapping_utilities.NIL;
                    binding = cdolist_list_var_$4.first();
                    while (sksi_sks_mapping_utilities.NIL != cdolist_list_var_$4) {
                        answer_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(binding, mt, cycl_utilities.formula_operator(query_form)), answer_list);
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        binding = cdolist_list_var_$4.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_form_mt_module_list_tuple = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 8990L)
    public static SubLObject gather_sksi_gaf_arg_index_values_relevant_pred_int(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject truth) {
        final SubLObject meaning_sentence_query_form_mt_module_list_tuples = sksi_sks_predicate_indexing.gather_relevant_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache();
        return gather_bindings_for_index_arg_value_from_meaning_sentence_query_form_mt_module_list_tuples(meaning_sentence_query_form_mt_module_list_tuples, index_arg, index_argnum, gather_argnum, truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 9479L)
    public static SubLObject gather_bindings_for_index_arg_value_from_meaning_sentence_query_form_mt_module_list_tuples(final SubLObject meaning_sentence_query_form_mt_module_list_tuples, final SubLObject index_arg, final SubLObject index_argnum, final SubLObject gather_argnum, final SubLObject truth) {
        final SubLObject allowed_modules_spec = determine_allowed_modules_spec_for_sks_mapping((SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        SubLObject answer_list = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject cdolist_list_var = meaning_sentence_query_form_mt_module_list_tuples;
        SubLObject meaning_sentence_query_form_mt_module_list_tuple = (SubLObject)sksi_sks_mapping_utilities.NIL;
        meaning_sentence_query_form_mt_module_list_tuple = cdolist_list_var.first();
        while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = meaning_sentence_query_form_mt_module_list_tuple;
            SubLObject meaning_sentence = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject query_form = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject mt = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject v_modules = (SubLObject)sksi_sks_mapping_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list8);
            meaning_sentence = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list8);
            query_form = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list8);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list8);
            v_modules = current.first();
            current = current.rest();
            if (sksi_sks_mapping_utilities.NIL == current) {
                final SubLObject index_var = cycl_utilities.formula_arg(query_form, index_argnum, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
                final SubLObject mod_query_form = cycl_utilities.expression_subst(index_arg, index_var, query_form, Symbols.symbol_function((SubLObject)sksi_sks_mapping_utilities.EQUAL), (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
                if (sksi_sks_mapping_utilities.NIL != meaning_sentence_type_check_query_form(mod_query_form, meaning_sentence, mt)) {
                    final SubLObject gather_var = cycl_utilities.formula_arg(query_form, gather_argnum, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
                    SubLObject cdolist_list_var_$5;
                    final SubLObject ask_results = cdolist_list_var_$5 = sksi_infrastructure_utilities.removal_ask_hl_variable_memoized(gather_var, mod_query_form, mt, truth, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_utilities.$kw3$ALLOWED_MODULES, allowed_modules_spec));
                    SubLObject binding = (SubLObject)sksi_sks_mapping_utilities.NIL;
                    binding = cdolist_list_var_$5.first();
                    while (sksi_sks_mapping_utilities.NIL != cdolist_list_var_$5) {
                        answer_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(binding, mt, cycl_utilities.formula_operator(query_form)), answer_list);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        binding = cdolist_list_var_$5.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_utilities.$list8);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence_query_form_mt_module_list_tuple = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 10772L)
    public static SubLObject gather_sksi_gaf_arg_index_relevant_pred(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject truth) {
        if (sksi_sks_mapping_utilities.NIL != sksi_sks_mapping_allowedP((SubLObject)sksi_sks_mapping_utilities.UNPROVIDED)) {
            SubLObject v_answer = (SubLObject)sksi_sks_mapping_utilities.NIL;
            if (sksi_sks_mapping_utilities.NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argumentP(index_arg)) {
                v_answer = gather_sksi_gaf_arg_index_relevant_pred_by_term(index_arg, index_argnum, truth);
            }
            if (sksi_sks_mapping_utilities.NIL == v_answer) {
                v_answer = gather_sksi_gaf_arg_index_relevant_pred_int(index_arg, index_argnum, truth);
            }
            return v_answer;
        }
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 13075L)
    public static SubLObject gather_sksi_gaf_arg_index_relevant_pred_by_term(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject truth) {
        final SubLObject query_form_mt_module_list_tuples = sksi_sks_gaf_arg_indexing.gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position(index_arg, index_argnum);
        return gather_sksi_gaf_arg_index_relevant_pred_by_term_int(query_form_mt_module_list_tuples, truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 13461L)
    public static SubLObject gather_sksi_gaf_arg_index_relevant_pred_by_term_int(final SubLObject query_form_mt_module_list_tuples, final SubLObject truth) {
        SubLObject answer_list = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject cdolist_list_var = query_form_mt_module_list_tuples;
        SubLObject query_form_mt_module_list_tuple = (SubLObject)sksi_sks_mapping_utilities.NIL;
        query_form_mt_module_list_tuple = cdolist_list_var.first();
        while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = query_form_mt_module_list_tuple;
            SubLObject query_form = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject mt = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject v_modules = (SubLObject)sksi_sks_mapping_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            query_form = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            v_modules = current.first();
            current = current.rest();
            if (sksi_sks_mapping_utilities.NIL == current) {
                final SubLObject allowed_modules_spec = compute_sksi_modules_allowed_in_current_inference(v_modules);
                if (sksi_sks_mapping_utilities.NIL != allowed_modules_spec) {
                    SubLObject cdolist_list_var_$6;
                    final SubLObject ask_results = cdolist_list_var_$6 = sksi_infrastructure_utilities.removal_ask_template_memoized(query_form, query_form, mt, truth, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_utilities.$kw3$ALLOWED_MODULES, allowed_modules_spec));
                    SubLObject formula = (SubLObject)sksi_sks_mapping_utilities.NIL;
                    formula = cdolist_list_var_$6.first();
                    while (sksi_sks_mapping_utilities.NIL != cdolist_list_var_$6) {
                        answer_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(formula, mt), answer_list);
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        formula = cdolist_list_var_$6.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_utilities.$list5);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_form_mt_module_list_tuple = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 14136L)
    public static SubLObject gather_sksi_gaf_arg_index_relevant_pred_int(final SubLObject index_arg, final SubLObject index_argnum, final SubLObject truth) {
        final SubLObject meaning_sentence_query_form_mt_module_list_tuples = sksi_sks_predicate_indexing.gather_relevant_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache();
        return gather_instantiated_formulas_from_meaning_sentence_query_form_mt_module_list_tuples(meaning_sentence_query_form_mt_module_list_tuples, index_arg, index_argnum, truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 14573L)
    public static SubLObject gather_instantiated_formulas_from_meaning_sentence_query_form_mt_module_list_tuples(final SubLObject meaning_sentence_query_form_mt_module_list_tuples, final SubLObject index_arg, final SubLObject index_argnum, final SubLObject truth) {
        final SubLObject allowed_modules_spec = determine_allowed_modules_spec_for_sks_mapping((SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        SubLObject answer_list = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject cdolist_list_var = meaning_sentence_query_form_mt_module_list_tuples;
        SubLObject meaning_sentence_query_form_mt_module_list_tuple = (SubLObject)sksi_sks_mapping_utilities.NIL;
        meaning_sentence_query_form_mt_module_list_tuple = cdolist_list_var.first();
        while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = meaning_sentence_query_form_mt_module_list_tuple;
            SubLObject meaning_sentence = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject query_form = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject mt = (SubLObject)sksi_sks_mapping_utilities.NIL;
            SubLObject v_modules = (SubLObject)sksi_sks_mapping_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list8);
            meaning_sentence = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list8);
            query_form = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list8);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_mapping_utilities.$list8);
            v_modules = current.first();
            current = current.rest();
            if (sksi_sks_mapping_utilities.NIL == current) {
                final SubLObject index_var = cycl_utilities.formula_arg(query_form, index_argnum, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
                final SubLObject mod_query_form = cycl_utilities.expression_subst(index_arg, index_var, query_form, Symbols.symbol_function((SubLObject)sksi_sks_mapping_utilities.EQ), (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
                if (sksi_sks_mapping_utilities.NIL != meaning_sentence_type_check_query_form(mod_query_form, meaning_sentence, mt)) {
                    SubLObject cdolist_list_var_$7;
                    final SubLObject ask_results = cdolist_list_var_$7 = sksi_infrastructure_utilities.removal_ask_template_memoized(mod_query_form, mod_query_form, mt, truth, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_mapping_utilities.$kw3$ALLOWED_MODULES, allowed_modules_spec));
                    SubLObject formula = (SubLObject)sksi_sks_mapping_utilities.NIL;
                    formula = cdolist_list_var_$7.first();
                    while (sksi_sks_mapping_utilities.NIL != cdolist_list_var_$7) {
                        answer_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(formula, mt), answer_list);
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        formula = cdolist_list_var_$7.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_mapping_utilities.$list8);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence_query_form_mt_module_list_tuple = cdolist_list_var.first();
        }
        return Sequences.nreverse(answer_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 15755L)
    public static SubLObject meaning_sentence_type_check_query_form(final SubLObject query_form, final SubLObject meaning_sentence, final SubLObject mt) {
        SubLObject new_query_form = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject termnum = (SubLObject)sksi_sks_mapping_utilities.ZERO_INTEGER;
        SubLObject q_term = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject q_term_$8 = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject m_term = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject m_term_$9 = (SubLObject)sksi_sks_mapping_utilities.NIL;
        q_term = query_form;
        q_term_$8 = q_term.first();
        m_term = meaning_sentence;
        m_term_$9 = m_term.first();
        while (sksi_sks_mapping_utilities.NIL != m_term || sksi_sks_mapping_utilities.NIL != q_term) {
            if (sksi_sks_mapping_utilities.NIL != variables.variable_p(q_term_$8)) {
                new_query_form = (SubLObject)ConsesLow.cons(m_term_$9, new_query_form);
            }
            else {
                new_query_form = (SubLObject)ConsesLow.cons(q_term_$8, new_query_form);
            }
            termnum = Numbers.add(termnum, (SubLObject)sksi_sks_mapping_utilities.ONE_INTEGER);
            q_term = q_term.rest();
            q_term_$8 = q_term.first();
            m_term = m_term.rest();
            m_term_$9 = m_term.first();
        }
        new_query_form = Sequences.nreverse(new_query_form);
        return sksi_meaning_sentence_utilities.meaning_sentence_type_check(new_query_form, meaning_sentence, (SubLObject)sksi_sks_mapping_utilities.NIL, mt, sksi_kb_accessors.content_mt_to_mapping_mt(mt), (SubLObject)sksi_sks_mapping_utilities.$kw9$RAW, (SubLObject)sksi_sks_mapping_utilities.T, (SubLObject)sksi_sks_mapping_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 16236L)
    public static SubLObject make_sksi_link_support(final SubLObject asent, final SubLObject mt) {
        return sksi_infrastructure_utilities.make_sksi_support(asent, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 16387L)
    public static SubLObject determine_allowed_modules_spec_for_sks_mapping(SubLObject current_inference) {
        if (current_inference == sksi_sks_mapping_utilities.UNPROVIDED) {
            current_inference = inference_macros.current_controlling_inference();
        }
        if (sksi_sks_mapping_utilities.NIL == inference_datastructures_inference.inference_p(current_inference)) {
            return (SubLObject)sksi_sks_mapping_utilities.$list10;
        }
        final SubLObject inference_allowed_modules_spec = inference_datastructures_inference.inference_allowed_modules(current_inference);
        if (inference_allowed_modules_spec == sksi_sks_mapping_utilities.$kw11$ALL) {
            return (SubLObject)sksi_sks_mapping_utilities.$list10;
        }
        if (sksi_sks_mapping_utilities.NIL != sksi_modules_allowed_in_current_inferenceP()) {
            return (SubLObject)sksi_sks_mapping_utilities.$list10;
        }
        return inference_allowed_modules_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 17533L)
    public static SubLObject compute_sksi_modules_allowed_in_current_inference(final SubLObject v_modules) {
        final SubLObject current_inference = inference_macros.current_controlling_inference();
        if (sksi_sks_mapping_utilities.NIL == inference_datastructures_inference.inference_p(current_inference)) {
            return sksi_infrastructure_utilities.hl_modules_list_to_allowed_modules_spec(v_modules);
        }
        SubLObject allowed_modules = (SubLObject)sksi_sks_mapping_utilities.NIL;
        SubLObject cdolist_list_var = v_modules;
        SubLObject module = (SubLObject)sksi_sks_mapping_utilities.NIL;
        module = cdolist_list_var.first();
        while (sksi_sks_mapping_utilities.NIL != cdolist_list_var) {
            if (sksi_sks_mapping_utilities.NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(current_inference, module)) {
                allowed_modules = (SubLObject)ConsesLow.cons(module, allowed_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        }
        if (sksi_sks_mapping_utilities.NIL != allowed_modules) {
            allowed_modules = Sequences.nreverse(allowed_modules);
            return sksi_infrastructure_utilities.hl_modules_list_to_allowed_modules_spec(allowed_modules);
        }
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 18118L)
    public static SubLObject sksi_modules_allowed_in_current_inferenceP() {
        final SubLObject current_inference = inference_macros.current_controlling_inference();
        if (sksi_sks_mapping_utilities.NIL == inference_datastructures_inference.inference_p(current_inference)) {
            return (SubLObject)sksi_sks_mapping_utilities.T;
        }
        if (sksi_sks_mapping_utilities.NIL == sksi_modules_not_allowed_in_inferenceP(current_inference)) {
            return (SubLObject)sksi_sks_mapping_utilities.T;
        }
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 18407L)
    public static SubLObject sksi_modules_not_allowed_in_inferenceP(final SubLObject inference) {
        final SubLObject allowed_modules_spec = inference_datastructures_inference.inference_allowed_modules(inference);
        return sksi_modules_not_allowed_by_allowed_modules_specP(allowed_modules_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 18632L)
    public static SubLObject sksi_modules_not_allowed_by_allowed_modules_specP(final SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == sksi_sks_mapping_utilities.$kw11$ALL) {
            return (SubLObject)sksi_sks_mapping_utilities.NIL;
        }
        if (!allowed_modules_spec.isList()) {
            return (SubLObject)sksi_sks_mapping_utilities.NIL;
        }
        if (sksi_sks_mapping_utilities.NIL != subl_promotions.memberP((SubLObject)sksi_sks_mapping_utilities.$list12, allowed_modules_spec, Symbols.symbol_function((SubLObject)sksi_sks_mapping_utilities.EQUAL), (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED)) {
            return (SubLObject)sksi_sks_mapping_utilities.T;
        }
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 19350L)
    public static SubLObject sksi_sks_mapping_allowedP_internal(SubLObject mt) {
        if (mt == sksi_sks_mapping_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_sks_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_mapping_utilities.NIL != sksi_query_utilities.some_sksi_removal_module_registeredP() && sksi_sks_mapping_utilities.NIL != sksi_infrastructure_utilities.some_external_source_activated_in_imageP() && sksi_sks_mapping_utilities.NIL != sksi_modules_allowed_in_current_inferenceP() && sksi_sks_mapping_utilities.NIL != sksi_infrastructure_utilities.any_sksi_content_mt_with_registered_module_relevantP());
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-mapping-utilities.lisp", position = 19350L)
    public static SubLObject sksi_sks_mapping_allowedP(SubLObject mt) {
        if (mt == sksi_sks_mapping_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_sks_mapping_utilities.NIL;
        if (sksi_sks_mapping_utilities.NIL == v_memoization_state) {
            return sksi_sks_mapping_allowedP_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_sks_mapping_utilities.$sym13$SKSI_SKS_MAPPING_ALLOWED_, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        if (sksi_sks_mapping_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_sks_mapping_utilities.$sym13$SKSI_SKS_MAPPING_ALLOWED_, (SubLObject)sksi_sks_mapping_utilities.ONE_INTEGER, (SubLObject)sksi_sks_mapping_utilities.NIL, (SubLObject)sksi_sks_mapping_utilities.EQL, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_sks_mapping_utilities.$sym13$SKSI_SKS_MAPPING_ALLOWED_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_sks_mapping_allowedP_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)sksi_sks_mapping_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_sksi_sks_mapping_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_lookup_index", "GATHER-SKSI-GAF-LOOKUP-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_predicate_extent_index", "GATHER-SKSI-PREDICATE-EXTENT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_predicate_extent_index_int", "GATHER-SKSI-PREDICATE-EXTENT-INDEX-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_values", "GATHER-SKSI-GAF-ARG-INDEX-VALUES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_values_int_internal", "GATHER-SKSI-GAF-ARG-INDEX-VALUES-INT-INTERNAL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_values_int", "GATHER-SKSI-GAF-ARG-INDEX-VALUES-INT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index", "GATHER-SKSI-GAF-ARG-INDEX", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_int_internal", "GATHER-SKSI-GAF-ARG-INDEX-INT-INTERNAL", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_int", "GATHER-SKSI-GAF-ARG-INDEX-INT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_values_relevant_pred", "GATHER-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_values_relevant_pred_by_term", "GATHER-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED-BY-TERM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_bindings_from_query_form_mt_module_list_tuples", "GATHER-BINDINGS-FROM-QUERY-FORM-MT-MODULE-LIST-TUPLES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_values_relevant_pred_int", "GATHER-SKSI-GAF-ARG-INDEX-VALUES-RELEVANT-PRED-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_bindings_for_index_arg_value_from_meaning_sentence_query_form_mt_module_list_tuples", "GATHER-BINDINGS-FOR-INDEX-ARG-VALUE-FROM-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_relevant_pred", "GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_relevant_pred_by_term", "GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED-BY-TERM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_relevant_pred_by_term_int", "GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED-BY-TERM-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_sksi_gaf_arg_index_relevant_pred_int", "GATHER-SKSI-GAF-ARG-INDEX-RELEVANT-PRED-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "gather_instantiated_formulas_from_meaning_sentence_query_form_mt_module_list_tuples", "GATHER-INSTANTIATED-FORMULAS-FROM-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "meaning_sentence_type_check_query_form", "MEANING-SENTENCE-TYPE-CHECK-QUERY-FORM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "make_sksi_link_support", "MAKE-SKSI-LINK-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "determine_allowed_modules_spec_for_sks_mapping", "DETERMINE-ALLOWED-MODULES-SPEC-FOR-SKS-MAPPING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "compute_sksi_modules_allowed_in_current_inference", "COMPUTE-SKSI-MODULES-ALLOWED-IN-CURRENT-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "sksi_modules_allowed_in_current_inferenceP", "SKSI-MODULES-ALLOWED-IN-CURRENT-INFERENCE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "sksi_modules_not_allowed_in_inferenceP", "SKSI-MODULES-NOT-ALLOWED-IN-INFERENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "sksi_modules_not_allowed_by_allowed_modules_specP", "SKSI-MODULES-NOT-ALLOWED-BY-ALLOWED-MODULES-SPEC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "sksi_sks_mapping_allowedP_internal", "SKSI-SKS-MAPPING-ALLOWED?-INTERNAL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities", "sksi_sks_mapping_allowedP", "SKSI-SKS-MAPPING-ALLOWED?", 0, 1, false);
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    public static SubLObject init_sksi_sks_mapping_utilities_file() {
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_sks_mapping_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_sks_mapping_utilities.$sym6$GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT);
        memoization_state.note_memoized_function((SubLObject)sksi_sks_mapping_utilities.$sym7$GATHER_SKSI_GAF_ARG_INDEX_INT);
        memoization_state.note_memoized_function((SubLObject)sksi_sks_mapping_utilities.$sym13$SKSI_SKS_MAPPING_ALLOWED_);
        return (SubLObject)sksi_sks_mapping_utilities.NIL;
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
    
    static {
        me = (SubLFile)new sksi_sks_mapping_utilities();
        $kw0$POS = SubLObjectFactory.makeKeyword("POS");
        $kw1$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw2$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $kw3$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("MODULES"));
        $sym6$GATHER_SKSI_GAF_ARG_INDEX_VALUES_INT = SubLObjectFactory.makeSymbol("GATHER-SKSI-GAF-ARG-INDEX-VALUES-INT");
        $sym7$GATHER_SKSI_GAF_ARG_INDEX_INT = SubLObjectFactory.makeSymbol("GATHER-SKSI-GAF-ARG-INDEX-INT");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEANING-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("MODULES"));
        $kw9$RAW = SubLObjectFactory.makeKeyword("RAW");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI"));
        $kw11$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI")));
        $sym13$SKSI_SKS_MAPPING_ALLOWED_ = SubLObjectFactory.makeSymbol("SKSI-SKS-MAPPING-ALLOWED?");
    }
}

/*

	Total time: 176 ms
	
*/