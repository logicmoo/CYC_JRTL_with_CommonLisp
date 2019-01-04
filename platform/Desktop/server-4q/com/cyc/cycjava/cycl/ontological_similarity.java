package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ontological_similarity extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ontological_similarity";
    public static final String myFingerPrint = "0d1b585c90dc599b369ac63a3f47012e46ce52e0cca4f212602b48e8f5d9cf08";
    private static final SubLSymbol $kw0$ASCENDING;
    private static final SubLSymbol $sym1$ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL;
    private static final SubLSymbol $kw2$UNINITIALIZED;
    private static final SubLSymbol $sym3$ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL;
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 1304L)
    public static SubLObject ontological_signature(final SubLObject v_object, SubLObject mt) {
        if (mt == ontological_similarity.UNPROVIDED) {
            mt = (SubLObject)ontological_similarity.NIL;
        }
        if (ontological_similarity.NIL != cycl_grammar.cycl_unrepresented_term_p(v_object)) {
            return defns.all_defn_admits(v_object, mt);
        }
        if (ontological_similarity.NIL != fort_types_interface.isa_collectionP(v_object, mt)) {
            return genls.all_genls(v_object, mt, (SubLObject)ontological_similarity.UNPROVIDED);
        }
        return isa.all_isa(v_object, mt, (SubLObject)ontological_similarity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 1781L)
    public static SubLObject ontological_signature_ordered(final SubLObject v_object, SubLObject mt) {
        if (mt == ontological_similarity.UNPROVIDED) {
            mt = (SubLObject)ontological_similarity.NIL;
        }
        return cardinality_estimates.sort_by_generality_estimate(ontological_signature(v_object, mt), (SubLObject)ontological_similarity.$kw0$ASCENDING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 2035L)
    public static SubLObject ontological_signature_memoized(final SubLObject v_term, SubLObject mt) {
        if (mt == ontological_similarity.UNPROVIDED) {
            mt = (SubLObject)ontological_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)ontological_similarity.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = ontological_signature_memoized_internal(v_term, mt_relevance_macros.mt_info(mt));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 2320L)
    public static SubLObject ontological_signature_memoized_internal_internal(final SubLObject v_term, final SubLObject mt_info) {
        return ontological_signature_ordered(v_term, (SubLObject)ontological_similarity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 2320L)
    public static SubLObject ontological_signature_memoized_internal(final SubLObject v_term, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)ontological_similarity.NIL;
        if (ontological_similarity.NIL == v_memoization_state) {
            return ontological_signature_memoized_internal_internal(v_term, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)ontological_similarity.$sym1$ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL, (SubLObject)ontological_similarity.UNPROVIDED);
        if (ontological_similarity.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)ontological_similarity.$sym1$ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL, (SubLObject)ontological_similarity.TWO_INTEGER, (SubLObject)ontological_similarity.NIL, (SubLObject)ontological_similarity.EQUAL, (SubLObject)ontological_similarity.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)ontological_similarity.$sym1$ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)ontological_similarity.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)ontological_similarity.NIL;
            collision = cdolist_list_var.first();
            while (ontological_similarity.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (ontological_similarity.NIL != cached_args && ontological_similarity.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(ontological_signature_memoized_internal_internal(v_term, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 2507L)
    public static SubLObject ontological_comparison(final SubLObject terms, SubLObject mt) {
        if (mt == ontological_similarity.UNPROVIDED) {
            mt = (SubLObject)ontological_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ontological_similarity.NIL == terms) {
            return Values.values((SubLObject)ontological_similarity.NIL, (SubLObject)ontological_similarity.NIL);
        }
        if (ontological_similarity.NIL != list_utilities.singletonP(terms)) {
            final SubLObject common = conses_high.copy_list(ontological_signature_memoized(terms.first(), mt));
            return Values.values(common, (SubLObject)ontological_similarity.NIL);
        }
        thread.resetMultipleValues();
        SubLObject common = ontological_comparison_int(terms, mt);
        final SubLObject union_hash = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject union = keyhash_utilities.keyhash_element_list(union_hash);
        SubLObject unique = list_utilities.fast_set_difference(union, common, Symbols.symbol_function((SubLObject)ontological_similarity.EQUAL));
        common = cardinality_estimates.sort_by_generality_estimate(common, (SubLObject)ontological_similarity.$kw0$ASCENDING);
        unique = cardinality_estimates.sort_by_generality_estimate(unique, (SubLObject)ontological_similarity.$kw0$ASCENDING);
        return Values.values(common, unique);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 3474L)
    public static SubLObject ontological_similarity(final SubLObject terms, SubLObject mt) {
        if (mt == ontological_similarity.UNPROVIDED) {
            mt = (SubLObject)ontological_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ontological_similarity.NIL == terms) {
            return (SubLObject)ontological_similarity.ZERO_INTEGER;
        }
        if (ontological_similarity.NIL != list_utilities.singletonP(terms)) {
            return (SubLObject)ontological_similarity.ONE_INTEGER;
        }
        if (ontological_similarity.NIL != list_utilities.doubletonP(terms) && terms.first().equal(conses_high.second(terms))) {
            return (SubLObject)ontological_similarity.ONE_INTEGER;
        }
        thread.resetMultipleValues();
        final SubLObject common = ontological_comparison_int(terms, mt);
        final SubLObject union = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject common_count = Sequences.length(common);
        final SubLObject union_count = keyhash.keyhash_count(union);
        if (union_count.isZero()) {
            return (SubLObject)ontological_similarity.ZERO_INTEGER;
        }
        return Numbers.divide(common_count, union_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 4287L)
    public static SubLObject ontological_distance(final SubLObject term1, final SubLObject term2, SubLObject mt) {
        if (mt == ontological_similarity.UNPROVIDED) {
            mt = (SubLObject)ontological_similarity.NIL;
        }
        if (term1.equal(term2)) {
            return (SubLObject)ontological_similarity.ZERO_INTEGER;
        }
        final SubLObject terms = kb_utilities.sort_terms((SubLObject)ConsesLow.list(term1, term2), (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED);
        return Numbers.subtract((SubLObject)ontological_similarity.ONE_INTEGER, ontological_similarity(terms, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 4596L)
    public static SubLObject ontological_distance_memoized(final SubLObject candidate, final SubLObject compare, SubLObject mt) {
        if (mt == ontological_similarity.UNPROVIDED) {
            mt = (SubLObject)ontological_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ontological_similarity.NIL != kb_utilities.term_L(compare, candidate, (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED)) {
            return ontological_distance_memoized(compare, candidate, mt);
        }
        SubLObject result = (SubLObject)ontological_similarity.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = ontological_distance_memoized_internal(candidate, compare, mt_relevance_macros.mt_info(mt));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 5004L)
    public static SubLObject ontological_comparison_int(final SubLObject terms, SubLObject mt) {
        if (mt == ontological_similarity.UNPROVIDED) {
            mt = (SubLObject)ontological_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject union = keyhash.new_keyhash(Numbers.multiply(Sequences.length(terms), control_vars.$average_all_genls_count$.getDynamicValue(thread)), Symbols.symbol_function((SubLObject)ontological_similarity.EQUAL));
        SubLObject common = (SubLObject)ontological_similarity.$kw2$UNINITIALIZED;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)ontological_similarity.NIL;
        v_term = cdolist_list_var.first();
        while (ontological_similarity.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1;
            final SubLObject signature = cdolist_list_var_$1 = ontological_signature_memoized(v_term, mt);
            SubLObject col = (SubLObject)ontological_similarity.NIL;
            col = cdolist_list_var_$1.first();
            while (ontological_similarity.NIL != cdolist_list_var_$1) {
                keyhash.setkeyhash(col, union);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                col = cdolist_list_var_$1.first();
            }
            if (common == ontological_similarity.$kw2$UNINITIALIZED) {
                common = conses_high.copy_list(signature);
            }
            else {
                common = conses_high.nintersection(common, signature, Symbols.symbol_function((SubLObject)ontological_similarity.EQUAL), (SubLObject)ontological_similarity.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Values.values(common, union);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 5515L)
    public static SubLObject ontological_distance_memoized_internal_internal(final SubLObject candidate, final SubLObject compare, final SubLObject mt_info) {
        return ontological_distance(candidate, compare, (SubLObject)ontological_similarity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 5515L)
    public static SubLObject ontological_distance_memoized_internal(final SubLObject candidate, final SubLObject compare, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)ontological_similarity.NIL;
        if (ontological_similarity.NIL == v_memoization_state) {
            return ontological_distance_memoized_internal_internal(candidate, compare, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)ontological_similarity.$sym3$ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL, (SubLObject)ontological_similarity.UNPROVIDED);
        if (ontological_similarity.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)ontological_similarity.$sym3$ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL, (SubLObject)ontological_similarity.THREE_INTEGER, (SubLObject)ontological_similarity.NIL, (SubLObject)ontological_similarity.EQUAL, (SubLObject)ontological_similarity.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)ontological_similarity.$sym3$ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(candidate, compare, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)ontological_similarity.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)ontological_similarity.NIL;
            collision = cdolist_list_var.first();
            while (ontological_similarity.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (candidate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (compare.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (ontological_similarity.NIL != cached_args && ontological_similarity.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(ontological_distance_memoized_internal_internal(candidate, compare, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(candidate, compare, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 5704L)
    public static SubLObject maximally_ontologically_distant_element_wrt(final SubLObject candidates, final SubLObject comparison_terms, SubLObject mt) {
        if (mt == ontological_similarity.UNPROVIDED) {
            mt = (SubLObject)ontological_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject farthest_term = (SubLObject)ontological_similarity.$kw2$UNINITIALIZED;
        SubLObject farthest_error = (SubLObject)ontological_similarity.$kw2$UNINITIALIZED;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = candidates;
                SubLObject candidate = (SubLObject)ontological_similarity.NIL;
                candidate = cdolist_list_var.first();
                while (ontological_similarity.NIL != cdolist_list_var) {
                    SubLObject error = (SubLObject)ontological_similarity.ZERO_INTEGER;
                    SubLObject cdolist_list_var_$2 = comparison_terms;
                    SubLObject compare = (SubLObject)ontological_similarity.NIL;
                    compare = cdolist_list_var_$2.first();
                    while (ontological_similarity.NIL != cdolist_list_var_$2) {
                        final SubLObject distance = ontological_distance_memoized(candidate, compare, mt);
                        final SubLObject distX2 = Numbers.multiply(distance, distance);
                        error = Numbers.add(error, distX2);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        compare = cdolist_list_var_$2.first();
                    }
                    if (ontological_similarity.$kw2$UNINITIALIZED == farthest_error || error.numG(farthest_error)) {
                        farthest_term = candidate;
                        farthest_error = error;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ontological_similarity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return farthest_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ontological-similarity.lisp", position = 6492L)
    public static SubLObject minimally_ontologically_distant_element_wrt(final SubLObject candidates, final SubLObject comparison_terms, SubLObject mt) {
        if (mt == ontological_similarity.UNPROVIDED) {
            mt = (SubLObject)ontological_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nearest_term = (SubLObject)ontological_similarity.$kw2$UNINITIALIZED;
        SubLObject nearest_error = (SubLObject)ontological_similarity.$kw2$UNINITIALIZED;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED, (SubLObject)ontological_similarity.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = candidates;
                SubLObject candidate = (SubLObject)ontological_similarity.NIL;
                candidate = cdolist_list_var.first();
                while (ontological_similarity.NIL != cdolist_list_var) {
                    SubLObject error = (SubLObject)ontological_similarity.ZERO_INTEGER;
                    SubLObject cdolist_list_var_$4 = comparison_terms;
                    SubLObject compare = (SubLObject)ontological_similarity.NIL;
                    compare = cdolist_list_var_$4.first();
                    while (ontological_similarity.NIL != cdolist_list_var_$4) {
                        final SubLObject distance = ontological_distance_memoized(candidate, compare, mt);
                        final SubLObject distX2 = Numbers.multiply(distance, distance);
                        error = Numbers.add(error, distX2);
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        compare = cdolist_list_var_$4.first();
                    }
                    if (ontological_similarity.$kw2$UNINITIALIZED == nearest_error || error.numL(nearest_error)) {
                        nearest_term = candidate;
                        nearest_error = error;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ontological_similarity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nearest_term;
    }
    
    public static SubLObject declare_ontological_similarity_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_signature", "ONTOLOGICAL-SIGNATURE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_signature_ordered", "ONTOLOGICAL-SIGNATURE-ORDERED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_signature_memoized", "ONTOLOGICAL-SIGNATURE-MEMOIZED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_signature_memoized_internal_internal", "ONTOLOGICAL-SIGNATURE-MEMOIZED-INTERNAL-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_signature_memoized_internal", "ONTOLOGICAL-SIGNATURE-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_comparison", "ONTOLOGICAL-COMPARISON", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_similarity", "ONTOLOGICAL-SIMILARITY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_distance", "ONTOLOGICAL-DISTANCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_distance_memoized", "ONTOLOGICAL-DISTANCE-MEMOIZED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_comparison_int", "ONTOLOGICAL-COMPARISON-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_distance_memoized_internal_internal", "ONTOLOGICAL-DISTANCE-MEMOIZED-INTERNAL-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "ontological_distance_memoized_internal", "ONTOLOGICAL-DISTANCE-MEMOIZED-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "maximally_ontologically_distant_element_wrt", "MAXIMALLY-ONTOLOGICALLY-DISTANT-ELEMENT-WRT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ontological_similarity", "minimally_ontologically_distant_element_wrt", "MINIMALLY-ONTOLOGICALLY-DISTANT-ELEMENT-WRT", 2, 1, false);
        return (SubLObject)ontological_similarity.NIL;
    }
    
    public static SubLObject init_ontological_similarity_file() {
        return (SubLObject)ontological_similarity.NIL;
    }
    
    public static SubLObject setup_ontological_similarity_file() {
        memoization_state.note_memoized_function((SubLObject)ontological_similarity.$sym1$ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL);
        memoization_state.note_memoized_function((SubLObject)ontological_similarity.$sym3$ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL);
        return (SubLObject)ontological_similarity.NIL;
    }
    
    public void declareFunctions() {
        declare_ontological_similarity_file();
    }
    
    public void initializeVariables() {
        init_ontological_similarity_file();
    }
    
    public void runTopLevelForms() {
        setup_ontological_similarity_file();
    }
    
    static {
        me = (SubLFile)new ontological_similarity();
        $kw0$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $sym1$ONTOLOGICAL_SIGNATURE_MEMOIZED_INTERNAL = SubLObjectFactory.makeSymbol("ONTOLOGICAL-SIGNATURE-MEMOIZED-INTERNAL");
        $kw2$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym3$ONTOLOGICAL_DISTANCE_MEMOIZED_INTERNAL = SubLObjectFactory.makeSymbol("ONTOLOGICAL-DISTANCE-MEMOIZED-INTERNAL");
    }
}

/*

	Total time: 119 ms
	
*/