package com.cyc.cycjava.cycl.sksi.sks_indexing;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.transitivity;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.ghl_marking_utilities;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.ghl_link_iterators;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_tva_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities";
    public static final String myFingerPrint = "941cb87f67ce09637361af960f5934b92c55b7bfa8a10155a546e238fecd4429";
    private static final SubLSymbol $sym0$SKSI_PRED_AND_RELEVANCE_P;
    private static final SubLSymbol $kw1$TRUE;
    private static final SubLSymbol $sym2$SKSI_INVERSE_CARDINALITY;
    private static final SubLSymbol $sym3$SKSI_PREDICATE_CARDINALITY;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 977L)
    public static SubLObject sksi_pred_and_relevance_p_internal(final SubLObject predicate) {
        return sksi_sks_predicate_indexing.predicate_sksi_indexed_relevant_in_mtP(predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 977L)
    public static SubLObject sksi_pred_and_relevance_p(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_tva_utilities.NIL;
        if (sksi_tva_utilities.NIL == v_memoization_state) {
            return sksi_pred_and_relevance_p_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_tva_utilities.$sym0$SKSI_PRED_AND_RELEVANCE_P, (SubLObject)sksi_tva_utilities.UNPROVIDED);
        if (sksi_tva_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_tva_utilities.$sym0$SKSI_PRED_AND_RELEVANCE_P, (SubLObject)sksi_tva_utilities.ONE_INTEGER, (SubLObject)sksi_tva_utilities.NIL, (SubLObject)sksi_tva_utilities.EQ, (SubLObject)sksi_tva_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_tva_utilities.$sym0$SKSI_PRED_AND_RELEVANCE_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_pred_and_relevance_p_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, (SubLObject)sksi_tva_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 1107L)
    public static SubLObject sksi_gaf_arg_impossible_p(final SubLObject pred, final SubLObject v_term, final SubLObject argnum) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_tva_utilities.NIL == sksi_gaf_arg_possible_p(pred, v_term, argnum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 1230L)
    public static SubLObject sksi_gaf_arg_possible_p(final SubLObject pred, final SubLObject v_term, final SubLObject argnum) {
        return sksi_transitivity_possibleP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 1871L)
    public static SubLObject sksi_transitivity_possibleP() {
        return sksi_sks_mapping_utilities.sksi_sks_mapping_allowedP((SubLObject)sksi_tva_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 2203L)
    public static SubLObject sksi_gt_relevant_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (sksi_tva_utilities.NIL != ghl_search_vars.$sksi_gt_search_pred$.getDynamicValue(thread)) ? ghl_link_iterators.gt_relevant_predP(pred, ghl_search_vars.$sksi_gt_search_pred$.getDynamicValue(thread)) : pred_relevance_macros.relevant_predP(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 2369L)
    public static SubLObject sksi_record_all_backward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sksi_tva_utilities.UNPROVIDED) {
            mt = (SubLObject)sksi_tva_utilities.NIL;
        }
        if (tv == sksi_tva_utilities.UNPROVIDED) {
            tv = (SubLObject)sksi_tva_utilities.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject backward_nodes = cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(node, (SubLObject)sksi_tva_utilities.TWO_INTEGER, (SubLObject)sksi_tva_utilities.ONE_INTEGER, module, (SubLObject)sksi_tva_utilities.$kw1$TRUE);
        SubLObject backward_node = (SubLObject)sksi_tva_utilities.NIL;
        backward_node = cdolist_list_var.first();
        while (sksi_tva_utilities.NIL != cdolist_list_var) {
            ghl_marking_utilities.ghl_mark_node_in_ghl_table(backward_node, (SubLObject)sksi_tva_utilities.T);
            cdolist_list_var = cdolist_list_var.rest();
            backward_node = cdolist_list_var.first();
        }
        return (SubLObject)sksi_tva_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 2695L)
    public static SubLObject sksi_record_all_forward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sksi_tva_utilities.UNPROVIDED) {
            mt = (SubLObject)sksi_tva_utilities.NIL;
        }
        if (tv == sksi_tva_utilities.UNPROVIDED) {
            tv = (SubLObject)sksi_tva_utilities.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject forward_nodes = cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_values(node, (SubLObject)sksi_tva_utilities.ONE_INTEGER, (SubLObject)sksi_tva_utilities.TWO_INTEGER, module, (SubLObject)sksi_tva_utilities.$kw1$TRUE);
        SubLObject forward_node = (SubLObject)sksi_tva_utilities.NIL;
        forward_node = cdolist_list_var.first();
        while (sksi_tva_utilities.NIL != cdolist_list_var) {
            ghl_marking_utilities.ghl_mark_node_in_ghl_table(forward_node, (SubLObject)sksi_tva_utilities.T);
            cdolist_list_var = cdolist_list_var.rest();
            forward_node = cdolist_list_var.first();
        }
        return (SubLObject)sksi_tva_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 3067L)
    public static SubLObject sksi_inverse_cardinality_internal(final SubLObject pred, final SubLObject node, SubLObject mt_info) {
        if (mt_info == sksi_tva_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_tva_utilities.UNPROVIDED);
        }
        return sksi_sks_gaf_arg_indexing.gather_sum_of_relevant_counts_for_term_argnum_pred(node, transitivity.ggt_gather_arg(pred), pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 3067L)
    public static SubLObject sksi_inverse_cardinality(final SubLObject pred, final SubLObject node, SubLObject mt_info) {
        if (mt_info == sksi_tva_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_tva_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_tva_utilities.NIL;
        if (sksi_tva_utilities.NIL == v_memoization_state) {
            return sksi_inverse_cardinality_internal(pred, node, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_tva_utilities.$sym2$SKSI_INVERSE_CARDINALITY, (SubLObject)sksi_tva_utilities.UNPROVIDED);
        if (sksi_tva_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_tva_utilities.$sym2$SKSI_INVERSE_CARDINALITY, (SubLObject)sksi_tva_utilities.THREE_INTEGER, (SubLObject)sksi_tva_utilities.NIL, (SubLObject)sksi_tva_utilities.EQ, (SubLObject)sksi_tva_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_tva_utilities.$sym2$SKSI_INVERSE_CARDINALITY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, node, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_tva_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_tva_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_tva_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (node.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_tva_utilities.NIL != cached_args && sksi_tva_utilities.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_inverse_cardinality_internal(pred, node, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, node, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 3334L)
    public static SubLObject sksi_predicate_cardinality_internal(final SubLObject pred, final SubLObject node, SubLObject mt_info) {
        if (mt_info == sksi_tva_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_tva_utilities.UNPROVIDED);
        }
        return sksi_sks_gaf_arg_indexing.gather_sum_of_relevant_counts_for_term_argnum_pred(node, transitivity.ggt_index_arg(pred), pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-tva-utilities.lisp", position = 3334L)
    public static SubLObject sksi_predicate_cardinality(final SubLObject pred, final SubLObject node, SubLObject mt_info) {
        if (mt_info == sksi_tva_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_tva_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_tva_utilities.NIL;
        if (sksi_tva_utilities.NIL == v_memoization_state) {
            return sksi_predicate_cardinality_internal(pred, node, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_tva_utilities.$sym3$SKSI_PREDICATE_CARDINALITY, (SubLObject)sksi_tva_utilities.UNPROVIDED);
        if (sksi_tva_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_tva_utilities.$sym3$SKSI_PREDICATE_CARDINALITY, (SubLObject)sksi_tva_utilities.THREE_INTEGER, (SubLObject)sksi_tva_utilities.NIL, (SubLObject)sksi_tva_utilities.EQ, (SubLObject)sksi_tva_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_tva_utilities.$sym3$SKSI_PREDICATE_CARDINALITY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, node, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_tva_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_tva_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_tva_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (node.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_tva_utilities.NIL != cached_args && sksi_tva_utilities.NIL == cached_args.rest() && mt_info.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_predicate_cardinality_internal(pred, node, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, node, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    public static SubLObject declare_sksi_tva_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_pred_and_relevance_p_internal", "SKSI-PRED-AND-RELEVANCE-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_pred_and_relevance_p", "SKSI-PRED-AND-RELEVANCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_gaf_arg_impossible_p", "SKSI-GAF-ARG-IMPOSSIBLE-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_gaf_arg_possible_p", "SKSI-GAF-ARG-POSSIBLE-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_transitivity_possibleP", "SKSI-TRANSITIVITY-POSSIBLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_gt_relevant_predP", "SKSI-GT-RELEVANT-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_record_all_backward_true_nodes", "SKSI-RECORD-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_record_all_forward_true_nodes", "SKSI-RECORD-ALL-FORWARD-TRUE-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_inverse_cardinality_internal", "SKSI-INVERSE-CARDINALITY-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_inverse_cardinality", "SKSI-INVERSE-CARDINALITY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_predicate_cardinality_internal", "SKSI-PREDICATE-CARDINALITY-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities", "sksi_predicate_cardinality", "SKSI-PREDICATE-CARDINALITY", 2, 1, false);
        return (SubLObject)sksi_tva_utilities.NIL;
    }
    
    public static SubLObject init_sksi_tva_utilities_file() {
        return (SubLObject)sksi_tva_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_tva_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_tva_utilities.$sym0$SKSI_PRED_AND_RELEVANCE_P);
        memoization_state.note_memoized_function((SubLObject)sksi_tva_utilities.$sym2$SKSI_INVERSE_CARDINALITY);
        memoization_state.note_memoized_function((SubLObject)sksi_tva_utilities.$sym3$SKSI_PREDICATE_CARDINALITY);
        return (SubLObject)sksi_tva_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_tva_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_tva_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_tva_utilities_file();
    }
    
    static {
        me = (SubLFile)new sksi_tva_utilities();
        $sym0$SKSI_PRED_AND_RELEVANCE_P = SubLObjectFactory.makeSymbol("SKSI-PRED-AND-RELEVANCE-P");
        $kw1$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym2$SKSI_INVERSE_CARDINALITY = SubLObjectFactory.makeSymbol("SKSI-INVERSE-CARDINALITY");
        $sym3$SKSI_PREDICATE_CARDINALITY = SubLObjectFactory.makeSymbol("SKSI-PREDICATE-CARDINALITY");
    }
}

/*

	Total time: 90 ms
	
*/