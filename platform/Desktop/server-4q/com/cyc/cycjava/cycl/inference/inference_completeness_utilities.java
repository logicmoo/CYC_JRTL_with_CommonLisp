package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_completeness_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.inference_completeness_utilities";
    public static final String myFingerPrint = "a76a0c15bfda1005e81b50dae82539710913197a76379d7d2ea62f37ab89f461";
    private static final SubLSymbol $sym0$INFERENCE_MINIMIZE_EXTENT_;
    private static final SubLSymbol $sym1$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS;
    private static final SubLInteger $int2$8192;
    private static final SubLSymbol $sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS;
    private static final SubLSymbol $sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS;
    private static final SubLSymbol $sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS;
    private static final SubLSymbol $sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS;
    private static final SubLSymbol $sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS;
    private static final SubLSymbol $sym8$INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS;
    private static final SubLSymbol $kw9$IGNORE;
    private static final SubLObject $const10$isa;
    private static final SubLSymbol $sym11$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 1378L)
    public static SubLObject inference_minimize_extentP_internal(final SubLObject predicate) {
        return kb_accessors.minimize_extent(predicate, (SubLObject)inference_completeness_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 1378L)
    public static SubLObject inference_minimize_extentP(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_completeness_utilities.NIL;
        if (inference_completeness_utilities.NIL == v_memoization_state) {
            return inference_minimize_extentP_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym0$INFERENCE_MINIMIZE_EXTENT_, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (inference_completeness_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_completeness_utilities.$sym0$INFERENCE_MINIMIZE_EXTENT_, (SubLObject)inference_completeness_utilities.ONE_INTEGER, (SubLObject)inference_completeness_utilities.NIL, (SubLObject)inference_completeness_utilities.EQL, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym0$INFERENCE_MINIMIZE_EXTENT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_minimize_extentP_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 1939L)
    public static SubLObject inference_complete_extent_assertedP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_asserted_gaf(predicate, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 2177L)
    public static SubLObject inference_complete_extent_asserted_gaf(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gaf = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.complete_extent_asserted_gaf(predicate, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 2663L)
    public static SubLObject inference_complete_extent_asserted_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_asserted_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 2981L)
    public static SubLObject inference_complete_extent_asserted_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 3439L)
    public static SubLObject inference_complete_extent_asserted_for_value_in_arg_gafs_internal(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject var;
        final SubLObject stronger_gaf = var = inference_complete_extent_asserted_gaf(predicate, mt);
        if (inference_completeness_utilities.NIL != var) {
            gafs = (SubLObject)ConsesLow.cons(var, gafs);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var2;
            final SubLObject gaf = var2 = kb_accessors.complete_extent_asserted_for_value_in_arg_gaf(predicate, value, argnum, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            if (inference_completeness_utilities.NIL != var2) {
                gafs = (SubLObject)ConsesLow.cons(var2, gafs);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 3439L)
    public static SubLObject inference_complete_extent_asserted_for_value_in_arg_gafs(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_completeness_utilities.NIL;
        if (inference_completeness_utilities.NIL == v_memoization_state) {
            return inference_complete_extent_asserted_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym1$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (inference_completeness_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_completeness_utilities.$sym1$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, (SubLObject)inference_completeness_utilities.FOUR_INTEGER, (SubLObject)inference_completeness_utilities.$int2$8192, (SubLObject)inference_completeness_utilities.EQL, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym1$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_completeness_utilities.NIL;
            collision = cdolist_list_var.first();
            while (inference_completeness_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (value.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (inference_completeness_utilities.NIL != cached_args && inference_completeness_utilities.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_complete_extent_asserted_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, value, argnum, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 4389L)
    public static SubLObject inference_complete_extent_enumerableP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_gaf(predicate, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 4617L)
    public static SubLObject inference_complete_extent_enumerable_gaf(final SubLObject predicate, final SubLObject mt) {
        return inference_complete_extent_enumerable_gafs(predicate, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 4985L)
    public static SubLObject inference_complete_extent_enumerable_gafs_internal(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject var;
        final SubLObject stronger_gaf = var = inference_complete_extent_asserted_gaf(predicate, mt);
        if (inference_completeness_utilities.NIL != var) {
            gafs = (SubLObject)ConsesLow.cons(var, gafs);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var2;
            final SubLObject gaf = var2 = kb_accessors.complete_extent_enumerable_gaf(predicate, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            if (inference_completeness_utilities.NIL != var2) {
                gafs = (SubLObject)ConsesLow.cons(var2, gafs);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 4985L)
    public static SubLObject inference_complete_extent_enumerable_gafs(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_completeness_utilities.NIL;
        if (inference_completeness_utilities.NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (inference_completeness_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_completeness_utilities.$sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, (SubLObject)inference_completeness_utilities.TWO_INTEGER, (SubLObject)inference_completeness_utilities.$int2$8192, (SubLObject)inference_completeness_utilities.EQL, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_completeness_utilities.NIL;
            collision = cdolist_list_var.first();
            while (inference_completeness_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference_completeness_utilities.NIL != cached_args && inference_completeness_utilities.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_complete_extent_enumerable_gafs_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 5803L)
    public static SubLObject inference_complete_extent_decidableP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_decidable_gaf(predicate, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 6028L)
    public static SubLObject inference_complete_extent_decidable_gaf(final SubLObject predicate, final SubLObject mt) {
        return inference_complete_extent_decidable_gafs(predicate, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 6393L)
    public static SubLObject inference_complete_extent_decidable_gafs_internal(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = (SubLObject)inference_completeness_utilities.NIL;
        SubLObject cdolist_list_var;
        final SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_gafs(predicate, mt);
        SubLObject stronger_gaf = (SubLObject)inference_completeness_utilities.NIL;
        stronger_gaf = cdolist_list_var.first();
        while (inference_completeness_utilities.NIL != cdolist_list_var) {
            gafs = (SubLObject)ConsesLow.cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_decidable_gaf(predicate, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            if (inference_completeness_utilities.NIL != var) {
                gafs = (SubLObject)ConsesLow.cons(var, gafs);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 6393L)
    public static SubLObject inference_complete_extent_decidable_gafs(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_completeness_utilities.NIL;
        if (inference_completeness_utilities.NIL == v_memoization_state) {
            return inference_complete_extent_decidable_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (inference_completeness_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_completeness_utilities.$sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, (SubLObject)inference_completeness_utilities.TWO_INTEGER, (SubLObject)inference_completeness_utilities.$int2$8192, (SubLObject)inference_completeness_utilities.EQL, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_completeness_utilities.NIL;
            collision = cdolist_list_var.first();
            while (inference_completeness_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference_completeness_utilities.NIL != cached_args && inference_completeness_utilities.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_complete_extent_decidable_gafs_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 7252L)
    public static SubLObject inference_complete_extent_enumerable_for_argP(final SubLObject predicate, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_for_arg_gaf(predicate, argnum, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 7521L)
    public static SubLObject inference_complete_extent_enumerable_for_arg_gaf(final SubLObject predicate, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 7930L)
    public static SubLObject inference_complete_extent_enumerable_for_arg_gafs_internal(final SubLObject predicate, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = (SubLObject)inference_completeness_utilities.NIL;
        SubLObject cdolist_list_var;
        final SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_gafs(predicate, mt);
        SubLObject stronger_gaf = (SubLObject)inference_completeness_utilities.NIL;
        stronger_gaf = cdolist_list_var.first();
        while (inference_completeness_utilities.NIL != cdolist_list_var) {
            gafs = (SubLObject)ConsesLow.cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_enumerable_for_arg_gaf(predicate, argnum, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            if (inference_completeness_utilities.NIL != var) {
                gafs = (SubLObject)ConsesLow.cons(var, gafs);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 7930L)
    public static SubLObject inference_complete_extent_enumerable_for_arg_gafs(final SubLObject predicate, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_completeness_utilities.NIL;
        if (inference_completeness_utilities.NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_for_arg_gafs_internal(predicate, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (inference_completeness_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_completeness_utilities.$sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, (SubLObject)inference_completeness_utilities.THREE_INTEGER, (SubLObject)inference_completeness_utilities.$int2$8192, (SubLObject)inference_completeness_utilities.EQL, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_completeness_utilities.NIL;
            collision = cdolist_list_var.first();
            while (inference_completeness_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (inference_completeness_utilities.NIL != cached_args && inference_completeness_utilities.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_complete_extent_enumerable_for_arg_gafs_internal(predicate, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, argnum, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 8863L)
    public static SubLObject inference_complete_extent_enumerable_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 9171L)
    public static SubLObject inference_complete_extent_enumerable_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 9619L)
    public static SubLObject inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = (SubLObject)inference_completeness_utilities.NIL;
        SubLObject cdolist_list_var;
        SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt);
        SubLObject stronger_gaf = (SubLObject)inference_completeness_utilities.NIL;
        stronger_gaf = cdolist_list_var.first();
        while (inference_completeness_utilities.NIL != cdolist_list_var) {
            gafs = (SubLObject)ConsesLow.cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        }
        stronger_gafs = (cdolist_list_var = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt));
        stronger_gaf = (SubLObject)inference_completeness_utilities.NIL;
        stronger_gaf = cdolist_list_var.first();
        while (inference_completeness_utilities.NIL != cdolist_list_var) {
            gafs = (SubLObject)ConsesLow.cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_enumerable_for_value_in_arg_gaf(predicate, value, argnum, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            if (inference_completeness_utilities.NIL != var) {
                gafs = (SubLObject)ConsesLow.cons(var, gafs);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 9619L)
    public static SubLObject inference_complete_extent_enumerable_for_value_in_arg_gafs(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_completeness_utilities.NIL;
        if (inference_completeness_utilities.NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (inference_completeness_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_completeness_utilities.$sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, (SubLObject)inference_completeness_utilities.FOUR_INTEGER, (SubLObject)inference_completeness_utilities.$int2$8192, (SubLObject)inference_completeness_utilities.EQL, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_completeness_utilities.NIL;
            collision = cdolist_list_var.first();
            while (inference_completeness_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (value.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (inference_completeness_utilities.NIL != cached_args && inference_completeness_utilities.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, value, argnum, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 11013L)
    public static SubLObject inference_complete_extent_decidable_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_decidable_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 11309L)
    public static SubLObject inference_complete_extent_decidable_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_decidable_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 11745L)
    public static SubLObject inference_complete_extent_decidable_for_value_in_arg_gafs_internal(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = (SubLObject)inference_completeness_utilities.NIL;
        SubLObject cdolist_list_var;
        final SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt);
        SubLObject stronger_gaf = (SubLObject)inference_completeness_utilities.NIL;
        stronger_gaf = cdolist_list_var.first();
        while (inference_completeness_utilities.NIL != cdolist_list_var) {
            gafs = (SubLObject)ConsesLow.cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_decidable_for_value_in_arg_gaf(predicate, value, argnum, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            if (inference_completeness_utilities.NIL != var) {
                gafs = (SubLObject)ConsesLow.cons(var, gafs);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 11745L)
    public static SubLObject inference_complete_extent_decidable_for_value_in_arg_gafs(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_completeness_utilities.NIL;
        if (inference_completeness_utilities.NIL == v_memoization_state) {
            return inference_complete_extent_decidable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (inference_completeness_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_completeness_utilities.$sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, (SubLObject)inference_completeness_utilities.FOUR_INTEGER, (SubLObject)inference_completeness_utilities.$int2$8192, (SubLObject)inference_completeness_utilities.EQL, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_completeness_utilities.NIL;
            collision = cdolist_list_var.first();
            while (inference_completeness_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (value.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (inference_completeness_utilities.NIL != cached_args && inference_completeness_utilities.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_complete_extent_decidable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, value, argnum, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 12731L)
    public static SubLObject inference_completely_enumerable_collectionP(final SubLObject collection, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_enumerable_collection_gaf(collection, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 12996L)
    public static SubLObject inference_completely_enumerable_collection_gaf(final SubLObject collection, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gaf = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.completely_enumerable_collection_gaf(collection, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 13478L)
    public static SubLObject inference_completely_decidable_collectionP(final SubLObject collection, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_decidable_collection_gaf(collection, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 13709L)
    public static SubLObject inference_completely_decidable_collection_gaf(final SubLObject collection, final SubLObject mt) {
        return inference_completely_decidable_collection_gafs(collection, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 14080L)
    public static SubLObject inference_completely_decidable_collection_gafs_internal(final SubLObject collection, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject var;
        final SubLObject stronger_gaf = var = inference_completely_enumerable_collection_gaf(collection, mt);
        if (inference_completeness_utilities.NIL != var) {
            gafs = (SubLObject)ConsesLow.cons(var, gafs);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var2;
            final SubLObject gaf = var2 = kb_accessors.completely_decidable_collection_gaf(collection, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            if (inference_completeness_utilities.NIL != var2) {
                gafs = (SubLObject)ConsesLow.cons(var2, gafs);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 14080L)
    public static SubLObject inference_completely_decidable_collection_gafs(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_completeness_utilities.NIL;
        if (inference_completeness_utilities.NIL == v_memoization_state) {
            return inference_completely_decidable_collection_gafs_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym8$INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (inference_completeness_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_completeness_utilities.$sym8$INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, (SubLObject)inference_completeness_utilities.TWO_INTEGER, (SubLObject)inference_completeness_utilities.$int2$8192, (SubLObject)inference_completeness_utilities.EQL, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym8$INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_completeness_utilities.NIL;
            collision = cdolist_list_var.first();
            while (inference_completeness_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (collection.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference_completeness_utilities.NIL != cached_args && inference_completeness_utilities.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_completely_decidable_collection_gafs_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(collection, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 14923L)
    public static SubLObject inference_complete_asentP(final SubLObject asent, final SubLObject mt) {
        if (inference_completeness_utilities.NIL != variables.fully_bound_p(asent)) {
            return inference_completely_decidable_asentP(asent, mt);
        }
        return inference_completely_enumerable_asentP(asent, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 15373L)
    public static SubLObject inference_completely_asserted_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_asserted_asent_gaf(asent, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 15714L)
    public static SubLObject inference_completely_asserted_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_asserted_asent_gafs(asent, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 16093L)
    public static SubLObject inference_completely_asserted_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (inference_completeness_utilities.NIL != forts.fort_p(predicate)) {
            final SubLObject gaf = inference_complete_extent_asserted_gaf(predicate, mt);
            if (inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent)) {
                final SubLObject var = gaf;
                if (inference_completeness_utilities.NIL != var) {
                    result_gafs = (SubLObject)ConsesLow.cons(var, result_gafs);
                }
            }
            final SubLObject terms = cycl_utilities.formula_terms(asent, (SubLObject)inference_completeness_utilities.$kw9$IGNORE);
            SubLObject list_var = (SubLObject)inference_completeness_utilities.NIL;
            SubLObject value = (SubLObject)inference_completeness_utilities.NIL;
            SubLObject argnum = (SubLObject)inference_completeness_utilities.NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = (SubLObject)inference_completeness_utilities.ZERO_INTEGER; inference_completeness_utilities.NIL != list_var; list_var = list_var.rest(), value = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                if (inference_completeness_utilities.NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs = inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt);
                    if (inference_completeness_utilities.NIL != gafs && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum)) {
                        SubLObject cdolist_list_var = gafs;
                        SubLObject gaf2 = (SubLObject)inference_completeness_utilities.NIL;
                        gaf2 = cdolist_list_var.first();
                        while (inference_completeness_utilities.NIL != cdolist_list_var) {
                            final SubLObject item_var = gaf2;
                            if (inference_completeness_utilities.NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function((SubLObject)inference_completeness_utilities.EQL), Symbols.symbol_function((SubLObject)inference_completeness_utilities.IDENTITY))) {
                                result_gafs = (SubLObject)ConsesLow.cons(item_var, result_gafs);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            gaf2 = cdolist_list_var.first();
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(result_gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 17330L)
    public static SubLObject inference_completely_enumerable_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_enumerable_asent_gaf(asent, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 17682L)
    public static SubLObject inference_completely_enumerable_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_enumerable_asent_gafs(asent, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 18064L)
    public static SubLObject inference_completely_enumerable_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (inference_completeness_utilities.NIL != forts.fort_p(predicate)) {
            final SubLObject gafs = inference_complete_extent_enumerable_gafs(predicate, mt);
            if (inference_completeness_utilities.NIL != gafs && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent)) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = (SubLObject)inference_completeness_utilities.NIL;
                gaf = cdolist_list_var.first();
                while (inference_completeness_utilities.NIL != cdolist_list_var) {
                    result_gafs = (SubLObject)ConsesLow.cons(gaf, result_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                }
            }
            if (inference_completeness_utilities.$const10$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)inference_completeness_utilities.UNPROVIDED);
                if (inference_completeness_utilities.NIL != forts.fort_p(collection)) {
                    final SubLObject gaf2 = inference_completely_enumerable_collection_gaf(collection, mt);
                    if (inference_completeness_utilities.NIL != gaf2 && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)inference_completeness_utilities.UNPROVIDED))) {
                        result_gafs = (SubLObject)ConsesLow.cons(gaf2, result_gafs);
                    }
                }
            }
            SubLObject terms = cycl_utilities.formula_terms(asent, (SubLObject)inference_completeness_utilities.$kw9$IGNORE);
            SubLObject list_var = (SubLObject)inference_completeness_utilities.NIL;
            SubLObject value = (SubLObject)inference_completeness_utilities.NIL;
            SubLObject argnum = (SubLObject)inference_completeness_utilities.NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = (SubLObject)inference_completeness_utilities.ZERO_INTEGER; inference_completeness_utilities.NIL != list_var; list_var = list_var.rest(), value = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                if (inference_completeness_utilities.NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs2 = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                    if (inference_completeness_utilities.NIL != gafs2 && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum)) {
                        SubLObject cdolist_list_var2 = gafs2;
                        SubLObject gaf3 = (SubLObject)inference_completeness_utilities.NIL;
                        gaf3 = cdolist_list_var2.first();
                        while (inference_completeness_utilities.NIL != cdolist_list_var2) {
                            final SubLObject item_var = gaf3;
                            if (inference_completeness_utilities.NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function((SubLObject)inference_completeness_utilities.EQL), Symbols.symbol_function((SubLObject)inference_completeness_utilities.IDENTITY))) {
                                result_gafs = (SubLObject)ConsesLow.cons(item_var, result_gafs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf3 = cdolist_list_var2.first();
                        }
                    }
                }
            }
            terms = cycl_utilities.formula_terms(asent, (SubLObject)inference_completeness_utilities.$kw9$IGNORE);
            list_var = (SubLObject)inference_completeness_utilities.NIL;
            value = (SubLObject)inference_completeness_utilities.NIL;
            argnum = (SubLObject)inference_completeness_utilities.NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = (SubLObject)inference_completeness_utilities.ZERO_INTEGER; inference_completeness_utilities.NIL != list_var; list_var = list_var.rest(), value = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                if (inference_completeness_utilities.NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs2 = inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                    if (inference_completeness_utilities.NIL != gafs2 && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum)) {
                        SubLObject cdolist_list_var2 = gafs2;
                        SubLObject gaf3 = (SubLObject)inference_completeness_utilities.NIL;
                        gaf3 = cdolist_list_var2.first();
                        while (inference_completeness_utilities.NIL != cdolist_list_var2) {
                            final SubLObject item_var = gaf3;
                            if (inference_completeness_utilities.NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function((SubLObject)inference_completeness_utilities.EQL), Symbols.symbol_function((SubLObject)inference_completeness_utilities.IDENTITY))) {
                                result_gafs = (SubLObject)ConsesLow.cons(item_var, result_gafs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf3 = cdolist_list_var2.first();
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(result_gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 20114L)
    public static SubLObject inference_completely_decidable_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_decidable_asent_gaf(asent, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 20351L)
    public static SubLObject inference_completely_decidable_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_decidable_asent_gafs(asent, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 20645L)
    public static SubLObject inference_completely_decidable_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (inference_completeness_utilities.NIL != forts.fort_p(predicate)) {
            SubLObject gafs = inference_complete_extent_enumerable_gafs(predicate, mt);
            if (inference_completeness_utilities.NIL != gafs && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent)) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = (SubLObject)inference_completeness_utilities.NIL;
                gaf = cdolist_list_var.first();
                while (inference_completeness_utilities.NIL != cdolist_list_var) {
                    result_gafs = (SubLObject)ConsesLow.cons(gaf, result_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                }
            }
            if (inference_completeness_utilities.$const10$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)inference_completeness_utilities.UNPROVIDED);
                if (inference_completeness_utilities.NIL != forts.fort_p(collection)) {
                    final SubLObject gaf2 = inference_completely_enumerable_collection_gaf(collection, mt);
                    if (inference_completeness_utilities.NIL != gaf2 && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)inference_completeness_utilities.UNPROVIDED))) {
                        result_gafs = (SubLObject)ConsesLow.cons(gaf2, result_gafs);
                    }
                }
            }
            gafs = inference_complete_extent_decidable_gafs(predicate, mt);
            if (inference_completeness_utilities.NIL != gafs && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent)) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = (SubLObject)inference_completeness_utilities.NIL;
                gaf = cdolist_list_var.first();
                while (inference_completeness_utilities.NIL != cdolist_list_var) {
                    final SubLObject item_var = gaf;
                    if (inference_completeness_utilities.NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function((SubLObject)inference_completeness_utilities.EQL), Symbols.symbol_function((SubLObject)inference_completeness_utilities.IDENTITY))) {
                        result_gafs = (SubLObject)ConsesLow.cons(item_var, result_gafs);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                }
            }
            if (inference_completeness_utilities.$const10$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)inference_completeness_utilities.UNPROVIDED);
                if (inference_completeness_utilities.NIL != forts.fort_p(collection)) {
                    final SubLObject gafs2 = inference_completely_decidable_collection_gafs(collection, mt);
                    if (inference_completeness_utilities.NIL != gafs2 && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)inference_completeness_utilities.UNPROVIDED))) {
                        SubLObject cdolist_list_var2 = gafs2;
                        SubLObject gaf3 = (SubLObject)inference_completeness_utilities.NIL;
                        gaf3 = cdolist_list_var2.first();
                        while (inference_completeness_utilities.NIL != cdolist_list_var2) {
                            final SubLObject item_var2 = gaf3;
                            if (inference_completeness_utilities.NIL == conses_high.member(item_var2, result_gafs, Symbols.symbol_function((SubLObject)inference_completeness_utilities.EQL), Symbols.symbol_function((SubLObject)inference_completeness_utilities.IDENTITY))) {
                                result_gafs = (SubLObject)ConsesLow.cons(item_var2, result_gafs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf3 = cdolist_list_var2.first();
                        }
                    }
                }
            }
            SubLObject terms = cycl_utilities.formula_terms(asent, (SubLObject)inference_completeness_utilities.$kw9$IGNORE);
            SubLObject list_var = (SubLObject)inference_completeness_utilities.NIL;
            SubLObject value = (SubLObject)inference_completeness_utilities.NIL;
            SubLObject argnum = (SubLObject)inference_completeness_utilities.NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = (SubLObject)inference_completeness_utilities.ZERO_INTEGER; inference_completeness_utilities.NIL != list_var; list_var = list_var.rest(), value = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                if (inference_completeness_utilities.NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs3 = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                    if (inference_completeness_utilities.NIL != gafs3 && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum)) {
                        SubLObject cdolist_list_var3 = gafs3;
                        SubLObject gaf4 = (SubLObject)inference_completeness_utilities.NIL;
                        gaf4 = cdolist_list_var3.first();
                        while (inference_completeness_utilities.NIL != cdolist_list_var3) {
                            final SubLObject item_var3 = gaf4;
                            if (inference_completeness_utilities.NIL == conses_high.member(item_var3, result_gafs, Symbols.symbol_function((SubLObject)inference_completeness_utilities.EQL), Symbols.symbol_function((SubLObject)inference_completeness_utilities.IDENTITY))) {
                                result_gafs = (SubLObject)ConsesLow.cons(item_var3, result_gafs);
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            gaf4 = cdolist_list_var3.first();
                        }
                    }
                }
            }
            terms = cycl_utilities.formula_terms(asent, (SubLObject)inference_completeness_utilities.$kw9$IGNORE);
            list_var = (SubLObject)inference_completeness_utilities.NIL;
            value = (SubLObject)inference_completeness_utilities.NIL;
            argnum = (SubLObject)inference_completeness_utilities.NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = (SubLObject)inference_completeness_utilities.ZERO_INTEGER; inference_completeness_utilities.NIL != list_var; list_var = list_var.rest(), value = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                if (inference_completeness_utilities.NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs3 = inference_complete_extent_decidable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                    if (inference_completeness_utilities.NIL != gafs3 && inference_completeness_utilities.NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum)) {
                        SubLObject cdolist_list_var3 = gafs3;
                        SubLObject gaf4 = (SubLObject)inference_completeness_utilities.NIL;
                        gaf4 = cdolist_list_var3.first();
                        while (inference_completeness_utilities.NIL != cdolist_list_var3) {
                            final SubLObject item_var3 = gaf4;
                            if (inference_completeness_utilities.NIL == conses_high.member(item_var3, result_gafs, Symbols.symbol_function((SubLObject)inference_completeness_utilities.EQL), Symbols.symbol_function((SubLObject)inference_completeness_utilities.IDENTITY))) {
                                result_gafs = (SubLObject)ConsesLow.cons(item_var3, result_gafs);
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            gaf4 = cdolist_list_var3.first();
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(result_gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 23276L)
    public static SubLObject completeness_constraint_mt(final SubLObject mt) {
        return mt_relevance_macros.conservative_constraint_mt(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 23601L)
    public static SubLObject inference_complete_extent_enumerable_via_backchainP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_via_backchain_gaf(predicate, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 24004L)
    public static SubLObject inference_complete_extent_enumerable_via_backchain_gaf(final SubLObject predicate, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        return inference_complete_extent_enumerable_via_backchain_gafs(predicate, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 24370L)
    public static SubLObject inference_complete_extent_enumerable_via_backchain_gafs_internal(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_enumerable_via_backchain_gaf(predicate, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            if (inference_completeness_utilities.NIL != var) {
                gafs = (SubLObject)ConsesLow.cons(var, gafs);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 24370L)
    public static SubLObject inference_complete_extent_enumerable_via_backchain_gafs(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_completeness_utilities.NIL;
        if (inference_completeness_utilities.NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_via_backchain_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym11$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (inference_completeness_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_completeness_utilities.$sym11$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, (SubLObject)inference_completeness_utilities.TWO_INTEGER, (SubLObject)inference_completeness_utilities.$int2$8192, (SubLObject)inference_completeness_utilities.EQL, (SubLObject)inference_completeness_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_completeness_utilities.$sym11$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_completeness_utilities.NIL;
            collision = cdolist_list_var.first();
            while (inference_completeness_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference_completeness_utilities.NIL != cached_args && inference_completeness_utilities.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_complete_extent_enumerable_via_backchain_gafs_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 24905L)
    public static SubLObject inference_collection_completely_enumerable_via_backchainP(final SubLObject collection, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_collection_completely_enumerable_via_backchain_gaf(collection, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 25185L)
    public static SubLObject inference_collection_completely_enumerable_via_backchain_gaf(final SubLObject collection, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gaf = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.collection_completely_enumerable_via_backchain_gaf(collection, (SubLObject)inference_completeness_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 25611L)
    public static SubLObject inference_completely_enumerable_via_backchain_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_enumerable_via_backchain_asent_gaf(asent, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 25905L)
    public static SubLObject inference_completely_enumerable_via_backchain_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_enumerable_via_backchain_asent_gafs(asent, mt).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 26254L)
    public static SubLObject inference_completely_enumerable_via_backchain_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = (SubLObject)inference_completeness_utilities.NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (inference_completeness_utilities.NIL != forts.fort_p(predicate)) {
            final SubLObject gafs = inference_complete_extent_enumerable_via_backchain_gafs(predicate, mt);
            if (inference_completeness_utilities.NIL != gafs) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = (SubLObject)inference_completeness_utilities.NIL;
                gaf = cdolist_list_var.first();
                while (inference_completeness_utilities.NIL != cdolist_list_var) {
                    result_gafs = (SubLObject)ConsesLow.cons(gaf, result_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                }
            }
            if (inference_completeness_utilities.$const10$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)inference_completeness_utilities.UNPROVIDED);
                if (inference_completeness_utilities.NIL != forts.fort_p(collection)) {
                    final SubLObject gaf2 = inference_collection_completely_enumerable_via_backchain_gaf(collection, mt);
                    if (inference_completeness_utilities.NIL != gaf2) {
                        result_gafs = (SubLObject)ConsesLow.cons(gaf2, result_gafs);
                    }
                }
            }
        }
        return Sequences.nreverse(result_gafs);
    }
    
    public static SubLObject declare_inference_completeness_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_minimize_extentP_internal", "INFERENCE-MINIMIZE-EXTENT?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_minimize_extentP", "INFERENCE-MINIMIZE-EXTENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_assertedP", "INFERENCE-COMPLETE-EXTENT-ASSERTED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_asserted_gaf", "INFERENCE-COMPLETE-EXTENT-ASSERTED-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_asserted_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_asserted_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_asserted_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_asserted_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerableP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_decidableP", "INFERENCE-COMPLETE-EXTENT-DECIDABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_decidable_gaf", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_decidable_gafs_internal", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_decidable_gafs", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_for_argP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_for_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_for_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_for_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_decidable_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_decidable_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_decidable_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_decidable_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_enumerable_collectionP", "INFERENCE-COMPLETELY-ENUMERABLE-COLLECTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_enumerable_collection_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-COLLECTION-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_decidable_collectionP", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_decidable_collection_gaf", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_decidable_collection_gafs_internal", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_decidable_collection_gafs", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_asentP", "INFERENCE-COMPLETE-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_asserted_asentP", "INFERENCE-COMPLETELY-ASSERTED-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_asserted_asent_gaf", "INFERENCE-COMPLETELY-ASSERTED-ASENT-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_asserted_asent_gafs", "INFERENCE-COMPLETELY-ASSERTED-ASENT-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_enumerable_asentP", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_enumerable_asent_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_enumerable_asent_gafs", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_decidable_asentP", "INFERENCE-COMPLETELY-DECIDABLE-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_decidable_asent_gaf", "INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_decidable_asent_gafs", "INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "completeness_constraint_mt", "COMPLETENESS-CONSTRAINT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_via_backchainP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_via_backchain_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_via_backchain_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_complete_extent_enumerable_via_backchain_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_collection_completely_enumerable_via_backchainP", "INFERENCE-COLLECTION-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_collection_completely_enumerable_via_backchain_gaf", "INFERENCE-COLLECTION-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_enumerable_via_backchain_asentP", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_enumerable_via_backchain_asent_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_completeness_utilities", "inference_completely_enumerable_via_backchain_asent_gafs", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT-GAFS", 2, 0, false);
        return (SubLObject)inference_completeness_utilities.NIL;
    }
    
    public static SubLObject init_inference_completeness_utilities_file() {
        return (SubLObject)inference_completeness_utilities.NIL;
    }
    
    public static SubLObject setup_inference_completeness_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)inference_completeness_utilities.$sym0$INFERENCE_MINIMIZE_EXTENT_);
        memoization_state.note_memoized_function((SubLObject)inference_completeness_utilities.$sym1$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS);
        memoization_state.note_memoized_function((SubLObject)inference_completeness_utilities.$sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS);
        memoization_state.note_memoized_function((SubLObject)inference_completeness_utilities.$sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS);
        memoization_state.note_memoized_function((SubLObject)inference_completeness_utilities.$sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS);
        memoization_state.note_memoized_function((SubLObject)inference_completeness_utilities.$sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS);
        memoization_state.note_memoized_function((SubLObject)inference_completeness_utilities.$sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS);
        memoization_state.note_memoized_function((SubLObject)inference_completeness_utilities.$sym8$INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS);
        memoization_state.note_memoized_function((SubLObject)inference_completeness_utilities.$sym11$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS);
        return (SubLObject)inference_completeness_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_inference_completeness_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_inference_completeness_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_inference_completeness_utilities_file();
    }
    
    static {
        me = (SubLFile)new inference_completeness_utilities();
        $sym0$INFERENCE_MINIMIZE_EXTENT_ = SubLObjectFactory.makeSymbol("INFERENCE-MINIMIZE-EXTENT?");
        $sym1$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS = SubLObjectFactory.makeSymbol("INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS");
        $int2$8192 = SubLObjectFactory.makeInteger(8192);
        $sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS = SubLObjectFactory.makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS");
        $sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS = SubLObjectFactory.makeSymbol("INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS");
        $sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS = SubLObjectFactory.makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS");
        $sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS = SubLObjectFactory.makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS");
        $sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS = SubLObjectFactory.makeSymbol("INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS");
        $sym8$INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS = SubLObjectFactory.makeSymbol("INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS");
        $kw9$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const10$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym11$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS = SubLObjectFactory.makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS");
    }
}

/*

	Total time: 207 ms
	
*/