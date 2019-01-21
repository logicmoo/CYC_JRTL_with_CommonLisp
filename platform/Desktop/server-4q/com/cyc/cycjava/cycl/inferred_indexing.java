package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inferred_indexing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inferred_indexing";
    public static final String myFingerPrint = "a12ea05530dd493ba376d0dffb065f2fcb2072f156a659c4d09db070aaadeb65";
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10078L)
    private static SubLSymbol $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10227L)
    private static SubLSymbol $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$;
    private static final SubLObject $const0$Thing;
    private static final SubLObject $const1$EverythingPSC;
    private static final SubLSymbol $kw2$SELF;
    private static final SubLSymbol $kw3$MIDDLE;
    private static final SubLSymbol $kw4$LOWER;
    private static final SubLSymbol $kw5$ASCENDING;
    private static final SubLSymbol $kw6$PREDICATE;
    private static final SubLSymbol $kw7$ONTOLOGY_HORIZON;
    private static final SubLSymbol $kw8$MICROTHEORY;
    private static final SubLObject $const9$genls;
    private static final SubLObject $const10$isa;
    private static final SubLObject $const11$equals;
    private static final SubLSymbol $sym12$FIRST;
    private static final SubLSymbol $sym13$FOURTH;
    private static final SubLSymbol $kw14$ONTOLOGY;
    private static final SubLSymbol $sym15$SECOND;
    private static final SubLString $str16$Unexpected_inheritance_pred__S;
    private static final SubLObject $const17$quotedIsa;
    private static final SubLObject $const18$relationAllInstance;
    private static final SubLSymbol $kw19$QUERY_ISA;
    private static final SubLSymbol $kw20$TRUE;
    private static final SubLObject $const21$relationInstanceAll;
    private static final SubLObject $const22$relationAllExists;
    private static final SubLObject $const23$relationExistsAll;
    private static final SubLObject $const24$transitiveViaArgInverse;
    private static final SubLSymbol $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_;
    private static final SubLSymbol $sym26$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLSymbol $sym27$CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE;
    private static final SubLSymbol $sym28$_CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN;
    private static final SubLSymbol $sym29$CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE;
    private static final SubLSymbol $sym30$_CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$NUM_INFERRED_GAF_ARG_INDEX_TUPLE;
    private static final SubLSymbol $sym33$NUM_INFERRED_GAF_ARG_INDEX_TUPLES;
    private static final SubLSymbol $kw34$ALLOW_PREDICATES;
    private static final SubLSymbol $kw35$ALLOW_PREDICATE_TYPES;
    private static final SubLSymbol $kw36$FORBID_PREDICATES;
    private static final SubLSymbol $kw37$FORBID_PREDICATE_TYPES;
    private static final SubLSymbol $sym38$GENERALITY_ESTIMATE_;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$_;
    private static final SubLSymbol $sym41$THIRD;
    private static final SubLString $str42$Unexpected_order_by____S;
    private static final SubLSymbol $kw43$UNINITIALIZED;
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 840L)
    public static SubLObject term_inheritance_collections(final SubLObject v_term, SubLObject ontology_horizon, SubLObject mt) {
        if (ontology_horizon == inferred_indexing.UNPROVIDED) {
            ontology_horizon = inferred_indexing.$const0$Thing;
        }
        if (mt == inferred_indexing.UNPROVIDED) {
            mt = inferred_indexing.$const1$EverythingPSC;
        }
        if (inferred_indexing.NIL == ontology_horizon) {
            ontology_horizon = inferred_indexing.$const0$Thing;
        }
        final SubLObject pcase_var = ontology_horizon;
        if (pcase_var.eql((SubLObject)inferred_indexing.$kw2$SELF)) {
            return (SubLObject)ConsesLow.list(v_term);
        }
        if (pcase_var.eql((SubLObject)inferred_indexing.$kw3$MIDDLE)) {
            ontology_horizon = middle_upper_ontology_boundary_generality_estimate();
        }
        else if (pcase_var.eql((SubLObject)inferred_indexing.$kw4$LOWER)) {
            ontology_horizon = lower_middle_ontology_boundary_generality_estimate();
        }
        SubLObject candidates = (inferred_indexing.NIL != fort_types_interface.isa_collection_in_any_mtP(v_term)) ? genls.all_genls(v_term, mt, (SubLObject)inferred_indexing.UNPROVIDED) : isa.all_isa(v_term, mt, (SubLObject)inferred_indexing.UNPROVIDED);
        if (!ontology_horizon.eql(inferred_indexing.$const0$Thing)) {
            if (!ontology_horizon.isNumber()) {
                ontology_horizon = cardinality_estimates.generality_estimate(ontology_horizon);
            }
            SubLObject filtered_candidates = (SubLObject)inferred_indexing.NIL;
            SubLObject cdolist_list_var = candidates;
            SubLObject candidate = (SubLObject)inferred_indexing.NIL;
            candidate = cdolist_list_var.first();
            while (inferred_indexing.NIL != cdolist_list_var) {
                final SubLObject generality = cardinality_estimates.generality_estimate(candidate);
                if (!generality.numG(ontology_horizon)) {
                    filtered_candidates = (SubLObject)ConsesLow.cons(candidate, filtered_candidates);
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate = cdolist_list_var.first();
            }
            candidates = filtered_candidates;
        }
        candidates = cardinality_estimates.sort_by_generality_estimate(candidates, (SubLObject)inferred_indexing.$kw5$ASCENDING);
        return candidates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 2019L)
    public static SubLObject new_term_inheritance_iterator(final SubLObject v_term, SubLObject ontology_horizon, SubLObject mt) {
        if (ontology_horizon == inferred_indexing.UNPROVIDED) {
            ontology_horizon = inferred_indexing.$const0$Thing;
        }
        if (mt == inferred_indexing.UNPROVIDED) {
            mt = inferred_indexing.$const1$EverythingPSC;
        }
        final SubLObject candidates = term_inheritance_collections(v_term, ontology_horizon, mt);
        return iteration.new_list_iterator(conses_high.adjoin(v_term, candidates, Symbols.symbol_function((SubLObject)inferred_indexing.EQUAL), (SubLObject)inferred_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 2390L)
    public static SubLObject all_inferred_gaf_arg_index_tuples(final SubLObject v_term, SubLObject filters, SubLObject order_by) {
        if (filters == inferred_indexing.UNPROVIDED) {
            filters = (SubLObject)inferred_indexing.NIL;
        }
        if (order_by == inferred_indexing.UNPROVIDED) {
            order_by = (SubLObject)inferred_indexing.$kw6$PREDICATE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_tuples = (SubLObject)inferred_indexing.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)inferred_indexing.UNPROVIDED, (SubLObject)inferred_indexing.UNPROVIDED, (SubLObject)inferred_indexing.UNPROVIDED, (SubLObject)inferred_indexing.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)inferred_indexing.TWO_INTEGER);
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)inferred_indexing.T, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                    try {
                        final SubLObject current;
                        final SubLObject datum = current = filters;
                        final SubLObject ontology_horizon_tail = cdestructuring_bind.property_list_member((SubLObject)inferred_indexing.$kw7$ONTOLOGY_HORIZON, current);
                        final SubLObject ontology_horizon = (SubLObject)((inferred_indexing.NIL != ontology_horizon_tail) ? conses_high.cadr(ontology_horizon_tail) : inferred_indexing.NIL);
                        final SubLObject microtheory_tail = cdestructuring_bind.property_list_member((SubLObject)inferred_indexing.$kw8$MICROTHEORY, current);
                        final SubLObject microtheory = (inferred_indexing.NIL != microtheory_tail) ? conses_high.cadr(microtheory_tail) : inferred_indexing.$const1$EverythingPSC;
                        final SubLObject default_infer_pred = (inferred_indexing.NIL != fort_types_interface.isa_collection_in_any_mtP(v_term)) ? inferred_indexing.$const9$genls : inferred_indexing.$const10$isa;
                        final SubLObject iterator_var = new_term_inheritance_iterator(v_term, ontology_horizon, microtheory);
                        SubLObject valid;
                        for (SubLObject done_var = (SubLObject)inferred_indexing.NIL; inferred_indexing.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(inferred_indexing.NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject item = iteration.iteration_next(iterator_var);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (inferred_indexing.NIL != valid) {
                                final SubLObject infer_pred = item.equal(v_term) ? inferred_indexing.$const11$equals : default_infer_pred;
                                SubLObject cdolist_list_var;
                                final SubLObject tuples = cdolist_list_var = inferred_gaf_arg_index_tuples(v_term, infer_pred, item, filters);
                                SubLObject tuple = (SubLObject)inferred_indexing.NIL;
                                tuple = cdolist_list_var.first();
                                while (inferred_indexing.NIL != cdolist_list_var) {
                                    all_tuples = (SubLObject)ConsesLow.cons(tuple, all_tuples);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    tuple = cdolist_list_var.first();
                                }
                            }
                        }
                        all_tuples = sort_inferred_gaf_arg_index_tuples(v_term, all_tuples, order_by);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inferred_indexing.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inferred_indexing.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return all_tuples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 3312L)
    public static SubLObject all_inferred_gaf_arg_index_predicates(final SubLObject v_term) {
        final SubLObject all_tuples = all_inferred_gaf_arg_index_tuples(v_term, (SubLObject)inferred_indexing.NIL, (SubLObject)inferred_indexing.$kw6$PREDICATE);
        final SubLObject tuple_groups = categorize_inferred_gaf_arg_index_tuples(v_term, all_tuples, (SubLObject)inferred_indexing.$kw6$PREDICATE);
        final SubLObject first_tuples = list_utilities.nmapcar(Symbols.symbol_function((SubLObject)inferred_indexing.$sym12$FIRST), tuple_groups);
        SubLObject predicates = list_utilities.nmapcar(Symbols.symbol_function((SubLObject)inferred_indexing.$sym13$FOURTH), first_tuples);
        predicates = list_utilities.delete_duplicates_sorted(predicates, (SubLObject)inferred_indexing.UNPROVIDED);
        return predicates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 3723L)
    public static SubLObject all_inferred_gaf_arg_index_ontology_terms(final SubLObject v_term) {
        final SubLObject all_tuples = all_inferred_gaf_arg_index_tuples(v_term, (SubLObject)inferred_indexing.NIL, (SubLObject)inferred_indexing.$kw14$ONTOLOGY);
        final SubLObject tuple_groups = categorize_inferred_gaf_arg_index_tuples(v_term, all_tuples, (SubLObject)inferred_indexing.$kw14$ONTOLOGY);
        final SubLObject first_tuples = list_utilities.nmapcar(Symbols.symbol_function((SubLObject)inferred_indexing.$sym12$FIRST), tuple_groups);
        SubLObject qua_terms = list_utilities.nmapcar(Symbols.symbol_function((SubLObject)inferred_indexing.$sym15$SECOND), first_tuples);
        qua_terms = list_utilities.delete_duplicates_sorted(qua_terms, (SubLObject)inferred_indexing.UNPROVIDED);
        return qua_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 4134L)
    public static SubLObject inferred_index_filters_extract_microtheory(final SubLObject filters) {
        return conses_high.getf(filters, (SubLObject)inferred_indexing.$kw8$MICROTHEORY, inferred_indexing.$const1$EverythingPSC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 4370L)
    public static SubLObject inferred_gaf_arg_index_tuples(final SubLObject v_term, final SubLObject infer_pred, final SubLObject qua, final SubLObject filters) {
        if (infer_pred.eql(inferred_indexing.$const11$equals)) {
            return direct_gaf_arg_index_tuples(v_term, filters);
        }
        if (infer_pred.eql(inferred_indexing.$const10$isa)) {
            return inferred_gaf_arg_index_tuples_via_isa(v_term, qua, filters);
        }
        if (infer_pred.eql(inferred_indexing.$const9$genls)) {
            return inferred_gaf_arg_index_tuples_via_genls(v_term, qua, filters);
        }
        return Errors.error((SubLObject)inferred_indexing.$str16$Unexpected_inheritance_pred__S, infer_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 5329L)
    public static SubLObject direct_gaf_arg_index_tuples(final SubLObject v_term, final SubLObject filters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = (SubLObject)inferred_indexing.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(inferred_index_filters_extract_microtheory(filters));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject argnums = kb_indexing.relevant_key_gaf_arg_index(v_term, (SubLObject)inferred_indexing.UNPROVIDED, (SubLObject)inferred_indexing.UNPROVIDED);
            if (inferred_indexing.NIL != forts.fort_p(v_term) && inferred_indexing.NIL != fort_types_interface.collectionP(v_term)) {
                final SubLObject item_var = (SubLObject)inferred_indexing.TWO_INTEGER;
                if (inferred_indexing.NIL == conses_high.member(item_var, argnums, Symbols.symbol_function((SubLObject)inferred_indexing.EQL), Symbols.symbol_function((SubLObject)inferred_indexing.IDENTITY))) {
                    argnums = (SubLObject)ConsesLow.cons(item_var, argnums);
                }
            }
            SubLObject cdolist_list_var = argnums;
            SubLObject argnum = (SubLObject)inferred_indexing.NIL;
            argnum = cdolist_list_var.first();
            while (inferred_indexing.NIL != cdolist_list_var) {
                SubLObject preds = kb_indexing.relevant_key_gaf_arg_index(v_term, argnum, (SubLObject)inferred_indexing.UNPROVIDED);
                if (inferred_indexing.NIL != forts.fort_p(v_term) && inferred_indexing.NIL != fort_types_interface.collectionP(v_term) && argnum.numE((SubLObject)inferred_indexing.TWO_INTEGER)) {
                    if (cardinality_estimates.instance_cardinality(v_term).isPositive()) {
                        final SubLObject item_var2 = inferred_indexing.$const10$isa;
                        if (inferred_indexing.NIL == conses_high.member(item_var2, preds, Symbols.symbol_function((SubLObject)inferred_indexing.EQL), Symbols.symbol_function((SubLObject)inferred_indexing.IDENTITY))) {
                            preds = (SubLObject)ConsesLow.cons(item_var2, preds);
                        }
                    }
                    if (cardinality_estimates.quoted_instance_cardinality(v_term).isPositive()) {
                        final SubLObject item_var2 = inferred_indexing.$const17$quotedIsa;
                        if (inferred_indexing.NIL == conses_high.member(item_var2, preds, Symbols.symbol_function((SubLObject)inferred_indexing.EQL), Symbols.symbol_function((SubLObject)inferred_indexing.IDENTITY))) {
                            preds = (SubLObject)ConsesLow.cons(item_var2, preds);
                        }
                    }
                }
                SubLObject cdolist_list_var_$4 = preds;
                SubLObject pred = (SubLObject)inferred_indexing.NIL;
                pred = cdolist_list_var_$4.first();
                while (inferred_indexing.NIL != cdolist_list_var_$4) {
                    if (inferred_indexing.NIL != pred_filters_allowP(filters, pred)) {
                        tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inferred_indexing.$const11$equals, v_term, argnum, pred), tuples);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    pred = cdolist_list_var_$4.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                argnum = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sort_inferred_gaf_arg_index_tuples(v_term, tuples, (SubLObject)inferred_indexing.$kw6$PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 6213L)
    public static SubLObject inferred_gaf_arg_index_tuples_via_isa(final SubLObject v_term, final SubLObject qua, final SubLObject filters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = (SubLObject)inferred_indexing.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(inferred_index_filters_extract_microtheory(filters));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (kb_indexing.relevant_num_gaf_arg_index(qua, (SubLObject)inferred_indexing.TWO_INTEGER, inferred_indexing.$const18$relationAllInstance).isPositive()) {
                if (inferred_indexing.NIL != pred_filters_allowP(filters, inferred_indexing.$const18$relationAllInstance)) {
                    tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inferred_indexing.$const10$isa, qua, (SubLObject)inferred_indexing.TWO_INTEGER, inferred_indexing.$const18$relationAllInstance), tuples);
                }
                SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(qua, (SubLObject)inferred_indexing.TWO_INTEGER, inferred_indexing.$const18$relationAllInstance, (SubLObject)inferred_indexing.NIL, (SubLObject)inferred_indexing.$kw20$TRUE);
                SubLObject gaf = (SubLObject)inferred_indexing.NIL;
                gaf = cdolist_list_var.first();
                while (inferred_indexing.NIL != cdolist_list_var) {
                    final SubLObject pred = assertions_high.gaf_arg1(gaf);
                    if (inferred_indexing.NIL != pred_filters_allowP(filters, pred)) {
                        tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inferred_indexing.$kw19$QUERY_ISA, qua, (SubLObject)inferred_indexing.ONE_INTEGER, pred), tuples);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                }
            }
            if (kb_indexing.relevant_num_gaf_arg_index(qua, (SubLObject)inferred_indexing.THREE_INTEGER, inferred_indexing.$const21$relationInstanceAll).isPositive()) {
                if (inferred_indexing.NIL != pred_filters_allowP(filters, inferred_indexing.$const21$relationInstanceAll)) {
                    tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inferred_indexing.$const10$isa, qua, (SubLObject)inferred_indexing.THREE_INTEGER, inferred_indexing.$const21$relationInstanceAll), tuples);
                }
                SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(qua, (SubLObject)inferred_indexing.THREE_INTEGER, inferred_indexing.$const21$relationInstanceAll, (SubLObject)inferred_indexing.NIL, (SubLObject)inferred_indexing.$kw20$TRUE);
                SubLObject gaf = (SubLObject)inferred_indexing.NIL;
                gaf = cdolist_list_var.first();
                while (inferred_indexing.NIL != cdolist_list_var) {
                    final SubLObject pred = assertions_high.gaf_arg1(gaf);
                    if (inferred_indexing.NIL != pred_filters_allowP(filters, pred)) {
                        tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inferred_indexing.$kw19$QUERY_ISA, qua, (SubLObject)inferred_indexing.TWO_INTEGER, pred), tuples);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                }
            }
            if (kb_indexing.relevant_num_gaf_arg_index(qua, (SubLObject)inferred_indexing.TWO_INTEGER, inferred_indexing.$const22$relationAllExists).isPositive() && inferred_indexing.NIL != pred_filters_allowP(filters, inferred_indexing.$const22$relationAllExists)) {
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inferred_indexing.$const10$isa, qua, (SubLObject)inferred_indexing.TWO_INTEGER, inferred_indexing.$const22$relationAllExists), tuples);
            }
            if (kb_indexing.relevant_num_gaf_arg_index(qua, (SubLObject)inferred_indexing.THREE_INTEGER, inferred_indexing.$const23$relationExistsAll).isPositive() && inferred_indexing.NIL != pred_filters_allowP(filters, inferred_indexing.$const23$relationExistsAll)) {
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inferred_indexing.$const10$isa, qua, (SubLObject)inferred_indexing.THREE_INTEGER, inferred_indexing.$const23$relationExistsAll), tuples);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sort_inferred_gaf_arg_index_tuples(v_term, tuples, (SubLObject)inferred_indexing.$kw6$PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 8187L)
    public static SubLObject inferred_gaf_arg_index_tuples_via_genls(final SubLObject v_term, final SubLObject qua, final SubLObject filters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = (SubLObject)inferred_indexing.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(inferred_index_filters_extract_microtheory(filters));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = kb_indexing.relevant_key_gaf_arg_index(qua, (SubLObject)inferred_indexing.UNPROVIDED, (SubLObject)inferred_indexing.UNPROVIDED);
            SubLObject argnum = (SubLObject)inferred_indexing.NIL;
            argnum = cdolist_list_var.first();
            while (inferred_indexing.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$5;
                final SubLObject preds = cdolist_list_var_$5 = kb_indexing.relevant_key_gaf_arg_index(qua, argnum, (SubLObject)inferred_indexing.UNPROVIDED);
                SubLObject pred = (SubLObject)inferred_indexing.NIL;
                pred = cdolist_list_var_$5.first();
                while (inferred_indexing.NIL != cdolist_list_var_$5) {
                    if (!pred.eql(inferred_indexing.$const9$genls) && inferred_indexing.NIL != somewhere_cache.some_pred_assertion_somewhereP(inferred_indexing.$const24$transitiveViaArgInverse, pred, (SubLObject)inferred_indexing.ONE_INTEGER, (SubLObject)inferred_indexing.UNPROVIDED) && inferred_indexing.NIL != pred_filters_allowP(filters, pred) && inferred_indexing.NIL != cached_transitive_via_arg_inverse_genls_in_any_mtP(pred, argnum)) {
                        tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inferred_indexing.$const9$genls, qua, argnum, pred), tuples);
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    pred = cdolist_list_var_$5.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                argnum = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sort_inferred_gaf_arg_index_tuples(v_term, tuples, (SubLObject)inferred_indexing.$kw6$PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 8983L)
    public static SubLObject transitive_via_arg_inverse_genlsP(final SubLObject pred, final SubLObject argnum, SubLObject mt) {
        if (mt == inferred_indexing.UNPROVIDED) {
            mt = (SubLObject)inferred_indexing.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inferred_indexing.NIL != somewhere_cache.some_pred_assertion_somewhereP(inferred_indexing.$const24$transitiveViaArgInverse, pred, (SubLObject)inferred_indexing.ONE_INTEGER, (SubLObject)inferred_indexing.UNPROVIDED) && inferred_indexing.NIL != kb_mapping_utilities.tuple_holds_in_relevant_mts((SubLObject)ConsesLow.list(inferred_indexing.$const24$transitiveViaArgInverse, pred, inferred_indexing.$const9$genls, argnum), mt, (SubLObject)inferred_indexing.ONE_INTEGER, (SubLObject)inferred_indexing.$kw20$TRUE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 9278L)
    public static SubLObject cached_transitive_via_arg_inverse_genls_in_any_mtP_internal(final SubLObject pred, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inferred_indexing.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)inferred_indexing.$sym26$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(inferred_indexing.$const1$EverythingPSC, thread);
            result = transitive_via_arg_inverse_genlsP(pred, argnum, (SubLObject)inferred_indexing.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 9278L)
    public static SubLObject cached_transitive_via_arg_inverse_genls_in_any_mtP(final SubLObject pred, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inferred_indexing.NIL;
        if (inferred_indexing.NIL == v_memoization_state) {
            return cached_transitive_via_arg_inverse_genls_in_any_mtP_internal(pred, argnum);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inferred_indexing.$sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_, (SubLObject)inferred_indexing.UNPROVIDED);
        if (inferred_indexing.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inferred_indexing.$sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_, (SubLObject)inferred_indexing.TWO_INTEGER, (SubLObject)inferred_indexing.NIL, (SubLObject)inferred_indexing.EQL, (SubLObject)inferred_indexing.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inferred_indexing.$sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, argnum);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inferred_indexing.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inferred_indexing.NIL;
            collision = cdolist_list_var.first();
            while (inferred_indexing.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inferred_indexing.NIL != cached_args && inferred_indexing.NIL == cached_args.rest() && argnum.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_transitive_via_arg_inverse_genls_in_any_mtP_internal(pred, argnum)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, argnum));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 9518L)
    public static SubLObject middle_upper_ontology_boundary_generality_estimate() {
        return Numbers.truncate(Numbers.expt(number_utilities.$e$.getGlobalValue(), Numbers.multiply(Numbers.divide((SubLObject)inferred_indexing.TWO_INTEGER, (SubLObject)inferred_indexing.THREE_INTEGER), Numbers.log(cardinality_estimates.generality_estimate(inferred_indexing.$const0$Thing), (SubLObject)inferred_indexing.UNPROVIDED))), (SubLObject)inferred_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 9827L)
    public static SubLObject lower_middle_ontology_boundary_generality_estimate() {
        return Numbers.truncate(Numbers.expt(number_utilities.$e$.getGlobalValue(), Numbers.multiply(Numbers.divide((SubLObject)inferred_indexing.ONE_INTEGER, (SubLObject)inferred_indexing.THREE_INTEGER), Numbers.log(cardinality_estimates.generality_estimate(inferred_indexing.$const0$Thing), (SubLObject)inferred_indexing.UNPROVIDED))), (SubLObject)inferred_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10078L)
    public static SubLObject clear_cached_middle_upper_ontology_boundary_generality_estimate() {
        final SubLObject cs = inferred_indexing.$cached_middle_upper_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
        if (inferred_indexing.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)inferred_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10078L)
    public static SubLObject remove_cached_middle_upper_ontology_boundary_generality_estimate() {
        return memoization_state.caching_state_remove_function_results_with_args(inferred_indexing.$cached_middle_upper_ontology_boundary_generality_estimate_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(inferred_indexing.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)inferred_indexing.UNPROVIDED, (SubLObject)inferred_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10078L)
    public static SubLObject cached_middle_upper_ontology_boundary_generality_estimate_internal() {
        return middle_upper_ontology_boundary_generality_estimate();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10078L)
    public static SubLObject cached_middle_upper_ontology_boundary_generality_estimate() {
        SubLObject caching_state = inferred_indexing.$cached_middle_upper_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
        if (inferred_indexing.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)inferred_indexing.$sym27$CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE, (SubLObject)inferred_indexing.$sym28$_CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN, (SubLObject)inferred_indexing.NIL, (SubLObject)inferred_indexing.EQL, (SubLObject)inferred_indexing.ZERO_INTEGER, (SubLObject)inferred_indexing.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)inferred_indexing.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_middle_upper_ontology_boundary_generality_estimate_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)inferred_indexing.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10227L)
    public static SubLObject clear_cached_lower_middle_ontology_boundary_generality_estimate() {
        final SubLObject cs = inferred_indexing.$cached_lower_middle_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
        if (inferred_indexing.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)inferred_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10227L)
    public static SubLObject remove_cached_lower_middle_ontology_boundary_generality_estimate() {
        return memoization_state.caching_state_remove_function_results_with_args(inferred_indexing.$cached_lower_middle_ontology_boundary_generality_estimate_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(inferred_indexing.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)inferred_indexing.UNPROVIDED, (SubLObject)inferred_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10227L)
    public static SubLObject cached_lower_middle_ontology_boundary_generality_estimate_internal() {
        return lower_middle_ontology_boundary_generality_estimate();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10227L)
    public static SubLObject cached_lower_middle_ontology_boundary_generality_estimate() {
        SubLObject caching_state = inferred_indexing.$cached_lower_middle_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
        if (inferred_indexing.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)inferred_indexing.$sym29$CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE, (SubLObject)inferred_indexing.$sym30$_CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN, (SubLObject)inferred_indexing.NIL, (SubLObject)inferred_indexing.EQL, (SubLObject)inferred_indexing.ZERO_INTEGER, (SubLObject)inferred_indexing.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)inferred_indexing.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_lower_middle_ontology_boundary_generality_estimate_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)inferred_indexing.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10375L)
    public static SubLObject upper_ontology_collection_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inferred_indexing.NIL != forts.fort_p(v_object) && inferred_indexing.NIL != fort_types_interface.collection_p(v_object) && cardinality_estimates.generality_estimate(v_object).numG(cached_middle_upper_ontology_boundary_generality_estimate()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10587L)
    public static SubLObject middle_ontology_collection_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inferred_indexing.NIL != forts.fort_p(v_object) && inferred_indexing.NIL != fort_types_interface.collection_p(v_object) && cardinality_estimates.generality_estimate(v_object).numLE(cached_middle_upper_ontology_boundary_generality_estimate()) && cardinality_estimates.generality_estimate(v_object).numG(cached_lower_middle_ontology_boundary_generality_estimate()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10901L)
    public static SubLObject lower_ontology_collection_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inferred_indexing.NIL != forts.fort_p(v_object) && inferred_indexing.NIL != fort_types_interface.collection_p(v_object) && cardinality_estimates.generality_estimate(v_object).numLE(cached_lower_middle_ontology_boundary_generality_estimate()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 11114L)
    public static SubLObject num_inferred_gaf_arg_index_tuple(final SubLObject tuple, SubLObject mt) {
        if (mt == inferred_indexing.UNPROVIDED) {
            mt = (SubLObject)inferred_indexing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num = (SubLObject)inferred_indexing.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject infer_pred = (SubLObject)inferred_indexing.NIL;
            SubLObject qua = (SubLObject)inferred_indexing.NIL;
            SubLObject argnum = (SubLObject)inferred_indexing.NIL;
            SubLObject pred = (SubLObject)inferred_indexing.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)inferred_indexing.$list31);
            infer_pred = tuple.first();
            SubLObject current = tuple.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)inferred_indexing.$list31);
            qua = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)inferred_indexing.$list31);
            argnum = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)inferred_indexing.$list31);
            pred = current.first();
            current = current.rest();
            if (inferred_indexing.NIL == current) {
                num = kb_indexing.relevant_num_gaf_arg_index(qua, argnum, pred);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)inferred_indexing.$list31);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return num;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 11456L)
    public static SubLObject num_inferred_gaf_arg_index_tuples(final SubLObject tuples, SubLObject mt) {
        if (mt == inferred_indexing.UNPROVIDED) {
            mt = (SubLObject)inferred_indexing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num = (SubLObject)inferred_indexing.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            num = number_utilities.summation(Mapping.mapcar(Symbols.symbol_function((SubLObject)inferred_indexing.$sym32$NUM_INFERRED_GAF_ARG_INDEX_TUPLE), tuples));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return num;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 11688L)
    public static SubLObject num_inferred_gaf_arg_index_tuple_groups(final SubLObject tuple_groups, SubLObject mt) {
        if (mt == inferred_indexing.UNPROVIDED) {
            mt = (SubLObject)inferred_indexing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num = (SubLObject)inferred_indexing.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            num = number_utilities.summation(Mapping.mapcar(Symbols.symbol_function((SubLObject)inferred_indexing.$sym33$NUM_INFERRED_GAF_ARG_INDEX_TUPLES), tuple_groups));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return num;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 11939L)
    public static SubLObject categorize_via_pred_filters(final SubLObject predicates, final SubLObject pred_filters) {
        if (inferred_indexing.NIL == pred_filters) {
            return Values.values(conses_high.copy_list(predicates), (SubLObject)inferred_indexing.NIL);
        }
        SubLObject allowed_predicates = (SubLObject)inferred_indexing.NIL;
        SubLObject disallowed_predicates = (SubLObject)inferred_indexing.NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject predicate = (SubLObject)inferred_indexing.NIL;
        predicate = cdolist_list_var.first();
        while (inferred_indexing.NIL != cdolist_list_var) {
            if (inferred_indexing.NIL != pred_filters_allowP(pred_filters, predicate)) {
                allowed_predicates = (SubLObject)ConsesLow.cons(predicate, allowed_predicates);
            }
            else {
                disallowed_predicates = (SubLObject)ConsesLow.cons(predicate, disallowed_predicates);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(allowed_predicates), Sequences.nreverse(disallowed_predicates));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 12526L)
    public static SubLObject pred_filters_allowP(final SubLObject pred_filters, final SubLObject pred) {
        if (inferred_indexing.NIL == pred_filters) {
            return (SubLObject)inferred_indexing.T;
        }
        final SubLObject allow_predicates_tail = cdestructuring_bind.property_list_member((SubLObject)inferred_indexing.$kw34$ALLOW_PREDICATES, pred_filters);
        final SubLObject allow_predicates = (SubLObject)((inferred_indexing.NIL != allow_predicates_tail) ? conses_high.cadr(allow_predicates_tail) : inferred_indexing.NIL);
        final SubLObject allow_predicate_types_tail = cdestructuring_bind.property_list_member((SubLObject)inferred_indexing.$kw35$ALLOW_PREDICATE_TYPES, pred_filters);
        final SubLObject allow_predicate_types = (SubLObject)((inferred_indexing.NIL != allow_predicate_types_tail) ? conses_high.cadr(allow_predicate_types_tail) : inferred_indexing.NIL);
        final SubLObject forbid_predicates_tail = cdestructuring_bind.property_list_member((SubLObject)inferred_indexing.$kw36$FORBID_PREDICATES, pred_filters);
        final SubLObject forbid_predicates = (SubLObject)((inferred_indexing.NIL != forbid_predicates_tail) ? conses_high.cadr(forbid_predicates_tail) : inferred_indexing.NIL);
        final SubLObject forbid_predicate_types_tail = cdestructuring_bind.property_list_member((SubLObject)inferred_indexing.$kw37$FORBID_PREDICATE_TYPES, pred_filters);
        final SubLObject forbid_predicate_types = (SubLObject)((inferred_indexing.NIL != forbid_predicate_types_tail) ? conses_high.cadr(forbid_predicate_types_tail) : inferred_indexing.NIL);
        if (inferred_indexing.NIL != list_utilities.member_eqP(pred, allow_predicates)) {
            return (SubLObject)inferred_indexing.T;
        }
        if (inferred_indexing.NIL != list_utilities.member_eqP(pred, forbid_predicates)) {
            return (SubLObject)inferred_indexing.NIL;
        }
        SubLObject cdolist_list_var = allow_predicate_types;
        SubLObject type = (SubLObject)inferred_indexing.NIL;
        type = cdolist_list_var.first();
        while (inferred_indexing.NIL != cdolist_list_var) {
            if (inferred_indexing.NIL != isa.isa_in_any_mtP(pred, type) || inferred_indexing.NIL != isa.quoted_isa_in_any_mtP(pred, type)) {
                return (SubLObject)inferred_indexing.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        cdolist_list_var = forbid_predicate_types;
        type = (SubLObject)inferred_indexing.NIL;
        type = cdolist_list_var.first();
        while (inferred_indexing.NIL != cdolist_list_var) {
            if (inferred_indexing.NIL != isa.isa_in_any_mtP(pred, type) || inferred_indexing.NIL != isa.quoted_isa_in_any_mtP(pred, type)) {
                return (SubLObject)inferred_indexing.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        return (SubLObject)inferred_indexing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 13270L)
    public static SubLObject sort_inferred_gaf_arg_index_tuples(final SubLObject v_term, SubLObject tuples, SubLObject order_by) {
        if (order_by == inferred_indexing.UNPROVIDED) {
            order_by = (SubLObject)inferred_indexing.$kw6$PREDICATE;
        }
        final SubLObject pcase_var = order_by;
        if (pcase_var.eql((SubLObject)inferred_indexing.$kw6$PREDICATE)) {
            tuples = kb_utilities.sort_terms(tuples, (SubLObject)inferred_indexing.NIL, (SubLObject)inferred_indexing.T, (SubLObject)inferred_indexing.T, (SubLObject)inferred_indexing.T, Symbols.symbol_function((SubLObject)inferred_indexing.$sym15$SECOND), (SubLObject)inferred_indexing.UNPROVIDED);
            tuples = Sort.stable_sort(tuples, (SubLObject)inferred_indexing.$sym38$GENERALITY_ESTIMATE_, Symbols.symbol_function((SubLObject)inferred_indexing.$sym15$SECOND));
            tuples = list_utilities.stable_sort_via_position(tuples, (SubLObject)inferred_indexing.$list39, Symbols.symbol_function((SubLObject)inferred_indexing.EQL), Symbols.symbol_function((SubLObject)inferred_indexing.$sym12$FIRST));
            tuples = Sort.stable_sort(tuples, (SubLObject)inferred_indexing.$sym40$_, Symbols.symbol_function((SubLObject)inferred_indexing.$sym41$THIRD));
            tuples = sort_inferred_gaf_arg_index_tuples_by_predicates(v_term, tuples);
        }
        else if (pcase_var.eql((SubLObject)inferred_indexing.$kw14$ONTOLOGY)) {
            tuples = Sort.stable_sort(tuples, (SubLObject)inferred_indexing.$sym40$_, Symbols.symbol_function((SubLObject)inferred_indexing.$sym41$THIRD));
            tuples = sort_inferred_gaf_arg_index_tuples_by_predicates(v_term, tuples);
            tuples = kb_utilities.sort_terms(tuples, (SubLObject)inferred_indexing.NIL, (SubLObject)inferred_indexing.T, (SubLObject)inferred_indexing.T, (SubLObject)inferred_indexing.T, Symbols.symbol_function((SubLObject)inferred_indexing.$sym15$SECOND), (SubLObject)inferred_indexing.UNPROVIDED);
            tuples = Sort.stable_sort(tuples, (SubLObject)inferred_indexing.$sym38$GENERALITY_ESTIMATE_, Symbols.symbol_function((SubLObject)inferred_indexing.$sym15$SECOND));
            tuples = list_utilities.stable_sort_via_position(tuples, (SubLObject)inferred_indexing.$list39, Symbols.symbol_function((SubLObject)inferred_indexing.EQL), Symbols.symbol_function((SubLObject)inferred_indexing.$sym12$FIRST));
        }
        else {
            Errors.error((SubLObject)inferred_indexing.$str42$Unexpected_order_by____S, order_by);
        }
        return tuples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 14564L)
    public static SubLObject sort_inferred_gaf_arg_index_tuples_by_predicates(final SubLObject v_term, final SubLObject tuples) {
        return cb_utilities.cb_sort_preds_for_display(v_term, tuples, Symbols.symbol_function((SubLObject)inferred_indexing.$sym13$FOURTH));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 14782L)
    public static SubLObject categorize_inferred_gaf_arg_index_tuples(final SubLObject v_term, final SubLObject all_tuples, final SubLObject order_by) {
        SubLObject tuple_groups = (SubLObject)inferred_indexing.NIL;
        if (order_by.eql((SubLObject)inferred_indexing.$kw14$ONTOLOGY)) {
            SubLObject last_qua = (SubLObject)inferred_indexing.$kw43$UNINITIALIZED;
            SubLObject tuples = (SubLObject)inferred_indexing.NIL;
            SubLObject cdolist_list_var = all_tuples;
            SubLObject tuple = (SubLObject)inferred_indexing.NIL;
            tuple = cdolist_list_var.first();
            while (inferred_indexing.NIL != cdolist_list_var) {
                final SubLObject qua = conses_high.second(tuple);
                if (!qua.equal(last_qua)) {
                    last_qua = qua;
                    if (inferred_indexing.NIL != tuples) {
                        tuple_groups = (SubLObject)ConsesLow.cons(Sequences.nreverse(tuples), tuple_groups);
                        tuples = (SubLObject)inferred_indexing.NIL;
                    }
                }
                tuples = (SubLObject)ConsesLow.cons(tuple, tuples);
                cdolist_list_var = cdolist_list_var.rest();
                tuple = cdolist_list_var.first();
            }
            if (inferred_indexing.NIL != tuples) {
                tuple_groups = (SubLObject)ConsesLow.cons(Sequences.nreverse(tuples), tuple_groups);
            }
        }
        else if (order_by.eql((SubLObject)inferred_indexing.$kw6$PREDICATE)) {
            SubLObject last_argnum = (SubLObject)inferred_indexing.$kw43$UNINITIALIZED;
            SubLObject last_pred = (SubLObject)inferred_indexing.$kw43$UNINITIALIZED;
            SubLObject tuples2 = (SubLObject)inferred_indexing.NIL;
            SubLObject cdolist_list_var2 = all_tuples;
            SubLObject tuple2 = (SubLObject)inferred_indexing.NIL;
            tuple2 = cdolist_list_var2.first();
            while (inferred_indexing.NIL != cdolist_list_var2) {
                final SubLObject argnum = conses_high.third(tuple2);
                final SubLObject pred = conses_high.fourth(tuple2);
                if (!argnum.equal(last_argnum) || !pred.equal(last_pred)) {
                    last_argnum = argnum;
                    last_pred = pred;
                    if (inferred_indexing.NIL != tuples2) {
                        tuple_groups = (SubLObject)ConsesLow.cons(Sequences.nreverse(tuples2), tuple_groups);
                        tuples2 = (SubLObject)inferred_indexing.NIL;
                    }
                }
                tuples2 = (SubLObject)ConsesLow.cons(tuple2, tuples2);
                cdolist_list_var2 = cdolist_list_var2.rest();
                tuple2 = cdolist_list_var2.first();
            }
            if (inferred_indexing.NIL != tuples2) {
                tuple_groups = (SubLObject)ConsesLow.cons(Sequences.nreverse(tuples2), tuple_groups);
            }
        }
        return Sequences.nreverse(tuple_groups);
    }
    
    public static SubLObject declare_inferred_indexing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "term_inheritance_collections", "TERM-INHERITANCE-COLLECTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "new_term_inheritance_iterator", "NEW-TERM-INHERITANCE-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "all_inferred_gaf_arg_index_tuples", "ALL-INFERRED-GAF-ARG-INDEX-TUPLES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "all_inferred_gaf_arg_index_predicates", "ALL-INFERRED-GAF-ARG-INDEX-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "all_inferred_gaf_arg_index_ontology_terms", "ALL-INFERRED-GAF-ARG-INDEX-ONTOLOGY-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "inferred_index_filters_extract_microtheory", "INFERRED-INDEX-FILTERS-EXTRACT-MICROTHEORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "inferred_gaf_arg_index_tuples", "INFERRED-GAF-ARG-INDEX-TUPLES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "direct_gaf_arg_index_tuples", "DIRECT-GAF-ARG-INDEX-TUPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "inferred_gaf_arg_index_tuples_via_isa", "INFERRED-GAF-ARG-INDEX-TUPLES-VIA-ISA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "inferred_gaf_arg_index_tuples_via_genls", "INFERRED-GAF-ARG-INDEX-TUPLES-VIA-GENLS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "transitive_via_arg_inverse_genlsP", "TRANSITIVE-VIA-ARG-INVERSE-GENLS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "cached_transitive_via_arg_inverse_genls_in_any_mtP_internal", "CACHED-TRANSITIVE-VIA-ARG-INVERSE-GENLS-IN-ANY-MT?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "cached_transitive_via_arg_inverse_genls_in_any_mtP", "CACHED-TRANSITIVE-VIA-ARG-INVERSE-GENLS-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "middle_upper_ontology_boundary_generality_estimate", "MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "lower_middle_ontology_boundary_generality_estimate", "LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "clear_cached_middle_upper_ontology_boundary_generality_estimate", "CLEAR-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "remove_cached_middle_upper_ontology_boundary_generality_estimate", "REMOVE-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "cached_middle_upper_ontology_boundary_generality_estimate_internal", "CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "cached_middle_upper_ontology_boundary_generality_estimate", "CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "clear_cached_lower_middle_ontology_boundary_generality_estimate", "CLEAR-CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "remove_cached_lower_middle_ontology_boundary_generality_estimate", "REMOVE-CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "cached_lower_middle_ontology_boundary_generality_estimate_internal", "CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "cached_lower_middle_ontology_boundary_generality_estimate", "CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "upper_ontology_collection_p", "UPPER-ONTOLOGY-COLLECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "middle_ontology_collection_p", "MIDDLE-ONTOLOGY-COLLECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "lower_ontology_collection_p", "LOWER-ONTOLOGY-COLLECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "num_inferred_gaf_arg_index_tuple", "NUM-INFERRED-GAF-ARG-INDEX-TUPLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "num_inferred_gaf_arg_index_tuples", "NUM-INFERRED-GAF-ARG-INDEX-TUPLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "num_inferred_gaf_arg_index_tuple_groups", "NUM-INFERRED-GAF-ARG-INDEX-TUPLE-GROUPS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "categorize_via_pred_filters", "CATEGORIZE-VIA-PRED-FILTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "pred_filters_allowP", "PRED-FILTERS-ALLOW?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "sort_inferred_gaf_arg_index_tuples", "SORT-INFERRED-GAF-ARG-INDEX-TUPLES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "sort_inferred_gaf_arg_index_tuples_by_predicates", "SORT-INFERRED-GAF-ARG-INDEX-TUPLES-BY-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inferred_indexing", "categorize_inferred_gaf_arg_index_tuples", "CATEGORIZE-INFERRED-GAF-ARG-INDEX-TUPLES", 3, 0, false);
        return (SubLObject)inferred_indexing.NIL;
    }
    
    public static SubLObject init_inferred_indexing_file() {
        inferred_indexing.$cached_middle_upper_ontology_boundary_generality_estimate_caching_state$ = SubLFiles.deflexical("*CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*", (SubLObject)inferred_indexing.NIL);
        inferred_indexing.$cached_lower_middle_ontology_boundary_generality_estimate_caching_state$ = SubLFiles.deflexical("*CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*", (SubLObject)inferred_indexing.NIL);
        return (SubLObject)inferred_indexing.NIL;
    }
    
    public static SubLObject setup_inferred_indexing_file() {
        memoization_state.note_memoized_function((SubLObject)inferred_indexing.$sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_);
        memoization_state.note_globally_cached_function((SubLObject)inferred_indexing.$sym27$CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE);
        memoization_state.note_globally_cached_function((SubLObject)inferred_indexing.$sym29$CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE);
        return (SubLObject)inferred_indexing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_inferred_indexing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_inferred_indexing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_inferred_indexing_file();
    }
    
    static {
        me = (SubLFile)new inferred_indexing();
        inferred_indexing.$cached_middle_upper_ontology_boundary_generality_estimate_caching_state$ = null;
        inferred_indexing.$cached_lower_middle_ontology_boundary_generality_estimate_caching_state$ = null;
        $const0$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const1$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw2$SELF = SubLObjectFactory.makeKeyword("SELF");
        $kw3$MIDDLE = SubLObjectFactory.makeKeyword("MIDDLE");
        $kw4$LOWER = SubLObjectFactory.makeKeyword("LOWER");
        $kw5$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $kw6$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw7$ONTOLOGY_HORIZON = SubLObjectFactory.makeKeyword("ONTOLOGY-HORIZON");
        $kw8$MICROTHEORY = SubLObjectFactory.makeKeyword("MICROTHEORY");
        $const9$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const10$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const11$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $sym12$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym13$FOURTH = SubLObjectFactory.makeSymbol("FOURTH");
        $kw14$ONTOLOGY = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $sym15$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str16$Unexpected_inheritance_pred__S = SubLObjectFactory.makeString("Unexpected inheritance pred ~S");
        $const17$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const18$relationAllInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $kw19$QUERY_ISA = SubLObjectFactory.makeKeyword("QUERY-ISA");
        $kw20$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const21$relationInstanceAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceAll"));
        $const22$relationAllExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $const23$relationExistsAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsAll"));
        $const24$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_ = SubLObjectFactory.makeSymbol("CACHED-TRANSITIVE-VIA-ARG-INVERSE-GENLS-IN-ANY-MT?");
        $sym26$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $sym27$CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE");
        $sym28$_CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN = SubLObjectFactory.makeSymbol("*CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*");
        $sym29$CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE");
        $sym30$_CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN = SubLObjectFactory.makeSymbol("*CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFER-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("QUA"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym32$NUM_INFERRED_GAF_ARG_INDEX_TUPLE = SubLObjectFactory.makeSymbol("NUM-INFERRED-GAF-ARG-INDEX-TUPLE");
        $sym33$NUM_INFERRED_GAF_ARG_INDEX_TUPLES = SubLObjectFactory.makeSymbol("NUM-INFERRED-GAF-ARG-INDEX-TUPLES");
        $kw34$ALLOW_PREDICATES = SubLObjectFactory.makeKeyword("ALLOW-PREDICATES");
        $kw35$ALLOW_PREDICATE_TYPES = SubLObjectFactory.makeKeyword("ALLOW-PREDICATE-TYPES");
        $kw36$FORBID_PREDICATES = SubLObjectFactory.makeKeyword("FORBID-PREDICATES");
        $kw37$FORBID_PREDICATE_TYPES = SubLObjectFactory.makeKeyword("FORBID-PREDICATE-TYPES");
        $sym38$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")));
        $sym40$_ = SubLObjectFactory.makeSymbol("<");
        $sym41$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $str42$Unexpected_order_by____S = SubLObjectFactory.makeString("Unexpected order-by : ~S");
        $kw43$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
    }
}

/*

	Total time: 429 ms
	
*/