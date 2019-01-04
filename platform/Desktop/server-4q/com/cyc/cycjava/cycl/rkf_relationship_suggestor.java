package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_relationship_suggestor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_relationship_suggestor";
    public static final String myFingerPrint = "5b67232ac9ac769d315cc8ba056a42c0a64bc4ba77b83fd6be89836baa9707fd";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 2483L)
    private static SubLSymbol $specificity_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 4446L)
    private static SubLSymbol $specific_term_relations$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 6979L)
    private static SubLSymbol $term_relations$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 7343L)
    private static SubLSymbol $term_isas$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 7583L)
    private static SubLSymbol $terms_candidate_relations$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 7793L)
    private static SubLSymbol $candidate_relations_sbhl_space$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 8037L)
    private static SubLSymbol $cr_mapping_result$;
    private static final SubLFloat $float0$5_0e_4;
    private static final SubLObject $const1$Thing;
    private static final SubLSymbol $kw2$ALL;
    private static final SubLSymbol $sym3$TERM_;
    private static final SubLSymbol $sym4$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const5$EverythingPSC;
    private static final SubLInteger $int6$512;
    private static final SubLSymbol $sym7$MARK_ALL_TERM_ISAS;
    private static final SubLSymbol $sym8$GATHER_SPECIFIC_COL_RELATIONS;
    private static final SubLObject $const9$argIsa;
    private static final SubLSymbol $kw10$TRUE;
    private static final SubLSymbol $sym11$GATHER_ALL_COL_LEGAL_RELATIONS;
    private static final SubLSymbol $sym12$CR_ARGISA_COL_SEARCHED_;
    private static final SubLSymbol $sym13$GATHER_COL_LEGAL_RELATIONS;
    private static final SubLObject $const14$genls;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 2719L)
    public static SubLObject rkf_candidate_formulas_relating_terms(final SubLObject terms, final SubLObject domain_interaction_mt) {
        return find_relations_of_terms(terms, rkf_relationship_suggestor.$const1$Thing, domain_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 2932L)
    public static SubLObject find_relations_of_terms(final SubLObject list_of_terms, SubLObject specific_term, SubLObject mt) {
        if (specific_term == rkf_relationship_suggestor.UNPROVIDED) {
            specific_term = rkf_relationship_suggestor.$const1$Thing;
        }
        if (mt == rkf_relationship_suggestor.UNPROVIDED) {
            mt = (SubLObject)rkf_relationship_suggestor.$kw2$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = list_of_terms;
        SubLObject each_term = (SubLObject)rkf_relationship_suggestor.NIL;
        each_term = cdolist_list_var.first();
        while (rkf_relationship_suggestor.NIL != cdolist_list_var) {
            assert rkf_relationship_suggestor.NIL != term.termP(each_term, (SubLObject)rkf_relationship_suggestor.UNPROVIDED) : each_term;
            cdolist_list_var = cdolist_list_var.rest();
            each_term = cdolist_list_var.first();
        }
        SubLObject answers = (SubLObject)rkf_relationship_suggestor.NIL;
        if (rkf_relationship_suggestor.NIL != hlmt.hlmt_equal((SubLObject)rkf_relationship_suggestor.$kw2$ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_relationship_suggestor.$sym4$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(rkf_relationship_suggestor.$const5$EverythingPSC, thread);
                answers = call_right_find_relations(list_of_terms, specific_term);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (rkf_relationship_suggestor.NIL != hlmt.hlmt_p(mt)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                answers = call_right_find_relations(list_of_terms, specific_term);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 3643L)
    public static SubLObject call_right_find_relations(final SubLObject list_of_terms, final SubLObject specific_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject g_spec_term = cardinality_estimates.generality_estimate(specific_term);
        final SubLObject g_thing = cardinality_estimates.generality_estimate(rkf_relationship_suggestor.$const1$Thing);
        final SubLObject g_ratio = Numbers.divide(g_spec_term, g_thing);
        SubLObject answers = (SubLObject)rkf_relationship_suggestor.NIL;
        if (g_ratio.numL(rkf_relationship_suggestor.$specificity_cutoff$.getDynamicValue(thread))) {
            answers = specific_legal_relations_of_terms_isa(list_of_terms, specific_term);
        }
        else {
            answers = legal_relations_of_terms_isa(list_of_terms);
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 4791L)
    public static SubLObject specific_legal_relations_of_terms_isa(final SubLObject list_of_terms, final SubLObject specific_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_relationship_suggestor.NIL;
        SubLObject relations = (SubLObject)rkf_relationship_suggestor.NIL;
        final SubLObject right_arity = conses_high.list_length(list_of_terms);
        final SubLObject _prev_bind_0 = rkf_relationship_suggestor.$specific_term_relations$.currentBinding(thread);
        try {
            rkf_relationship_suggestor.$specific_term_relations$.bind(Hashtables.make_hash_table((SubLObject)rkf_relationship_suggestor.$int6$512, (SubLObject)rkf_relationship_suggestor.UNPROVIDED, (SubLObject)rkf_relationship_suggestor.UNPROVIDED), thread);
            final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_relationship_suggestor.NIL, thread);
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                        Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_relationship_suggestor.$sym7$MARK_ALL_TERM_ISAS), list_of_terms);
                        SubLObject cdohash_table = sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread);
                        SubLObject candidate = (SubLObject)rkf_relationship_suggestor.NIL;
                        SubLObject value = (SubLObject)rkf_relationship_suggestor.NIL;
                        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                candidate = Hashtables.getEntryKey(cdohash_entry);
                                value = Hashtables.getEntryValue(cdohash_entry);
                                if (rkf_relationship_suggestor.NIL != cardinality_estimates.generality_estimateL(candidate, specific_term)) {
                                    gather_all_specific_col_relations(candidate);
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                        cdohash_table = rkf_relationship_suggestor.$specific_term_relations$.getDynamicValue(thread);
                        candidate = (SubLObject)rkf_relationship_suggestor.NIL;
                        value = (SubLObject)rkf_relationship_suggestor.NIL;
                        cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                candidate = Hashtables.getEntryKey(cdohash_entry);
                                value = Hashtables.getEntryValue(cdohash_entry);
                                if (rkf_relationship_suggestor.NIL != (value.first().isInteger() ? Numbers.numE(value.first(), right_arity) : rkf_relationship_suggestor.T)) {
                                    final SubLObject item_var = candidate;
                                    if (rkf_relationship_suggestor.NIL != conses_high.member(item_var, relations, Symbols.symbol_function((SubLObject)rkf_relationship_suggestor.EQL), Symbols.symbol_function((SubLObject)rkf_relationship_suggestor.IDENTITY))) {
                                        continue;
                                    }
                                    relations = (SubLObject)ConsesLow.cons(item_var, relations);
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                        result = relations;
                    }
                    finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$3, thread);
                        sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_relationship_suggestor.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            rkf_relationship_suggestor.$specific_term_relations$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 6256L)
    public static SubLObject gather_all_specific_col_relations(final SubLObject col) {
        kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)rkf_relationship_suggestor.$sym8$GATHER_SPECIFIC_COL_RELATIONS), col, (SubLObject)rkf_relationship_suggestor.THREE_INTEGER, rkf_relationship_suggestor.$const9$argIsa, (SubLObject)rkf_relationship_suggestor.$kw10$TRUE, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 6404L)
    public static SubLObject gather_specific_col_relations(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_relationship_suggestor.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject collection = (SubLObject)((rkf_relationship_suggestor.NIL != forts.fort_p(relation)) ? assertions_high.gaf_arg3(assertion) : rkf_relationship_suggestor.NIL);
            if (rkf_relationship_suggestor.NIL != forts.fort_p(collection) && rkf_relationship_suggestor.NIL != sbhl_marking_methods.sbhl_recorded_node_p(collection, sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread))) {
                hash_table_utilities.pushnew_hash(relation, arity.arity(relation), rkf_relationship_suggestor.$specific_term_relations$.getDynamicValue(thread), (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
            }
        }
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 8249L)
    public static SubLObject legal_relations_of_terms_isa(final SubLObject list_of_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relations = (SubLObject)rkf_relationship_suggestor.NIL;
        SubLObject answers = (SubLObject)rkf_relationship_suggestor.NIL;
        final SubLObject right_arity = conses_high.list_length(list_of_terms);
        SubLObject list_var = (SubLObject)rkf_relationship_suggestor.NIL;
        SubLObject each_term = (SubLObject)rkf_relationship_suggestor.NIL;
        SubLObject index = (SubLObject)rkf_relationship_suggestor.NIL;
        list_var = list_of_terms;
        each_term = list_var.first();
        for (index = (SubLObject)rkf_relationship_suggestor.ZERO_INTEGER; rkf_relationship_suggestor.NIL != list_var; list_var = list_var.rest(), each_term = list_var.first(), index = Numbers.add((SubLObject)rkf_relationship_suggestor.ONE_INTEGER, index)) {
            final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_relationship_suggestor.NIL, thread);
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$6 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                        mark_all_term_isas(each_term);
                        Vectors.set_aref(rkf_relationship_suggestor.$term_isas$.getDynamicValue(thread), index, sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread));
                    }
                    finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$6, thread);
                        sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_$5, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_relationship_suggestor.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0, thread);
            }
            Vectors.set_aref(rkf_relationship_suggestor.$term_relations$.getDynamicValue(thread), index, Hashtables.make_hash_table((SubLObject)rkf_relationship_suggestor.$int6$512, (SubLObject)rkf_relationship_suggestor.UNPROVIDED, (SubLObject)rkf_relationship_suggestor.UNPROVIDED));
        }
        SubLObject new_index = (SubLObject)rkf_relationship_suggestor.ZERO_INTEGER;
        final SubLObject _prev_bind_3 = rkf_relationship_suggestor.$terms_candidate_relations$.currentBinding(thread);
        try {
            rkf_relationship_suggestor.$terms_candidate_relations$.bind(Hashtables.make_hash_table((SubLObject)rkf_relationship_suggestor.$int6$512, (SubLObject)rkf_relationship_suggestor.UNPROVIDED, (SubLObject)rkf_relationship_suggestor.UNPROVIDED), thread);
            final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rkf_relationship_suggestor.NIL, thread);
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$8 = sbhl_marking_vars.$sbhl_space_3$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$7 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space_3$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p2, thread);
                        SubLObject cdolist_list_var = list_of_terms;
                        SubLObject each_term2 = (SubLObject)rkf_relationship_suggestor.NIL;
                        each_term2 = cdolist_list_var.first();
                        while (rkf_relationship_suggestor.NIL != cdolist_list_var) {
                            if (rkf_relationship_suggestor.NIL != forts.fort_p(each_term2)) {
                                isa.map_all_isa(Symbols.symbol_function((SubLObject)rkf_relationship_suggestor.$sym11$GATHER_ALL_COL_LEGAL_RELATIONS), each_term2, (SubLObject)rkf_relationship_suggestor.UNPROVIDED, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
                            }
                            else {
                                final SubLObject cdohash_table = Vectors.aref(rkf_relationship_suggestor.$term_isas$.getDynamicValue(thread), new_index);
                                SubLObject each_isa_of_term = (SubLObject)rkf_relationship_suggestor.NIL;
                                SubLObject value = (SubLObject)rkf_relationship_suggestor.NIL;
                                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                try {
                                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                        each_isa_of_term = Hashtables.getEntryKey(cdohash_entry);
                                        value = Hashtables.getEntryValue(cdohash_entry);
                                        gather_all_col_legal_relations(each_isa_of_term);
                                    }
                                }
                                finally {
                                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                            new_index = Numbers.add(new_index, (SubLObject)rkf_relationship_suggestor.ONE_INTEGER);
                            cdolist_list_var = cdolist_list_var.rest();
                            each_term2 = cdolist_list_var.first();
                        }
                    }
                    finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$7, thread);
                        sbhl_marking_vars.$sbhl_space_3$.rebind(_prev_bind_0_$8, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_relationship_suggestor.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_4, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$7, thread);
            }
            final SubLObject cdohash_table2 = rkf_relationship_suggestor.$terms_candidate_relations$.getDynamicValue(thread);
            SubLObject candidate = (SubLObject)rkf_relationship_suggestor.NIL;
            SubLObject v_arity = (SubLObject)rkf_relationship_suggestor.NIL;
            final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator(cdohash_table2);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                    final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                    candidate = Hashtables.getEntryKey(cdohash_entry2);
                    v_arity = Hashtables.getEntryValue(cdohash_entry2);
                    if (rkf_relationship_suggestor.NIL != (v_arity.isInteger() ? Numbers.numE(v_arity, right_arity) : rkf_relationship_suggestor.T) && rkf_relationship_suggestor.NIL != takes_all_terms_as_argsP(candidate, right_arity) && rkf_relationship_suggestor.NIL != satisfies_all_arg_isasP(candidate, right_arity)) {
                        final SubLObject item_var = candidate;
                        if (rkf_relationship_suggestor.NIL != conses_high.member(item_var, relations, Symbols.symbol_function((SubLObject)rkf_relationship_suggestor.EQL), Symbols.symbol_function((SubLObject)rkf_relationship_suggestor.IDENTITY))) {
                            continue;
                        }
                        relations = (SubLObject)ConsesLow.cons(item_var, relations);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator2);
            }
        }
        finally {
            rkf_relationship_suggestor.$terms_candidate_relations$.rebind(_prev_bind_3, thread);
        }
        SubLObject cdolist_list_var2 = relations;
        SubLObject each_rel = (SubLObject)rkf_relationship_suggestor.NIL;
        each_rel = cdolist_list_var2.first();
        while (rkf_relationship_suggestor.NIL != cdolist_list_var2) {
            answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(each_rel, list_of_terms), answers);
            cdolist_list_var2 = cdolist_list_var2.rest();
            each_rel = cdolist_list_var2.first();
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 10723L)
    public static SubLObject satisfies_all_arg_isasP(final SubLObject relation, final SubLObject no_of_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result;
        SubLObject index;
        for (result = (SubLObject)rkf_relationship_suggestor.T, index = (SubLObject)rkf_relationship_suggestor.NIL, index = (SubLObject)rkf_relationship_suggestor.ZERO_INTEGER; !index.numE(no_of_args) && rkf_relationship_suggestor.NIL != result; result = cr_all_arg_isa_cachedP(relation, Numbers.add(index, (SubLObject)rkf_relationship_suggestor.ONE_INTEGER)), index = Numbers.add(index, (SubLObject)rkf_relationship_suggestor.ONE_INTEGER)) {
            rkf_relationship_suggestor.$candidate_relations_sbhl_space$.setDynamicValue(Vectors.aref(rkf_relationship_suggestor.$term_isas$.getDynamicValue(thread), index), thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 11147L)
    public static SubLObject cr_all_arg_isa_cachedP(final SubLObject relation, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = (SubLObject)rkf_relationship_suggestor.NIL;
        final SubLObject _prev_bind_0 = rkf_relationship_suggestor.$cr_mapping_result$.currentBinding(thread);
        try {
            rkf_relationship_suggestor.$cr_mapping_result$.bind((SubLObject)rkf_relationship_suggestor.T, thread);
            final SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(argnum, (SubLObject)rkf_relationship_suggestor.UNPROVIDED, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
            kb_mapping.map_gaf_arg_index((SubLObject)rkf_relationship_suggestor.$sym12$CR_ARGISA_COL_SEARCHED_, relation, (SubLObject)rkf_relationship_suggestor.ONE_INTEGER, arg_isa_pred, (SubLObject)rkf_relationship_suggestor.$kw10$TRUE, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
            v_boolean = rkf_relationship_suggestor.$cr_mapping_result$.getDynamicValue(thread);
        }
        finally {
            rkf_relationship_suggestor.$cr_mapping_result$.rebind(_prev_bind_0, thread);
        }
        return v_boolean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 11549L)
    public static SubLObject cr_argisa_col_searchedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = assertions_high.gaf_arg2(assertion);
        if (rkf_relationship_suggestor.NIL != forts.fort_p(col) && rkf_relationship_suggestor.NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, rkf_relationship_suggestor.$candidate_relations_sbhl_space$.getDynamicValue(thread))) {
            rkf_relationship_suggestor.$cr_mapping_result$.setDynamicValue((SubLObject)rkf_relationship_suggestor.NIL, thread);
            utilities_macros.mapping_finished();
        }
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 11900L)
    public static SubLObject takes_all_terms_as_argsP(final SubLObject relation, final SubLObject no_of_args) {
        SubLThread thread;
        SubLObject result;
        SubLObject index;
        for (thread = SubLProcess.currentSubLThread(), result = (SubLObject)rkf_relationship_suggestor.T, index = (SubLObject)rkf_relationship_suggestor.NIL, index = (SubLObject)rkf_relationship_suggestor.ZERO_INTEGER; !index.numE(no_of_args) && rkf_relationship_suggestor.NIL != result; result = Hashtables.gethash(relation, Vectors.aref(rkf_relationship_suggestor.$term_relations$.getDynamicValue(thread), index), (SubLObject)rkf_relationship_suggestor.UNPROVIDED), index = Numbers.add(index, (SubLObject)rkf_relationship_suggestor.ONE_INTEGER)) {}
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 12287L)
    public static SubLObject gather_all_col_legal_relations(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_relationship_suggestor.NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, sbhl_marking_vars.$sbhl_space_3$.getDynamicValue(thread))) {
            sbhl_marking_methods.sbhl_record_node(col, sbhl_marking_vars.$sbhl_space_3$.getDynamicValue(thread));
            kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)rkf_relationship_suggestor.$sym13$GATHER_COL_LEGAL_RELATIONS), col, (SubLObject)rkf_relationship_suggestor.THREE_INTEGER, rkf_relationship_suggestor.$const9$argIsa, (SubLObject)rkf_relationship_suggestor.$kw10$TRUE, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
        }
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 12625L)
    public static SubLObject gather_col_legal_relations(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_relationship_suggestor.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject argnum = (SubLObject)((rkf_relationship_suggestor.NIL != forts.fort_p(relation)) ? assertions_high.gaf_arg2(assertion) : rkf_relationship_suggestor.NIL);
            final SubLObject collection = (SubLObject)(argnum.isInteger() ? assertions_high.gaf_arg3(assertion) : rkf_relationship_suggestor.NIL);
            if (argnum.numG((SubLObject)rkf_relationship_suggestor.ZERO_INTEGER) && argnum.numLE(rkf_tools.$rkf_max_arity$.getGlobalValue())) {
                final SubLObject space = Vectors.aref(rkf_relationship_suggestor.$term_isas$.getDynamicValue(thread), Numbers.subtract(argnum, (SubLObject)rkf_relationship_suggestor.ONE_INTEGER));
                final SubLObject relation_hash = (SubLObject)((rkf_relationship_suggestor.NIL != space) ? Vectors.aref(rkf_relationship_suggestor.$term_relations$.getDynamicValue(thread), Numbers.subtract(argnum, (SubLObject)rkf_relationship_suggestor.ONE_INTEGER)) : rkf_relationship_suggestor.NIL);
                if (rkf_relationship_suggestor.NIL != relation_hash && rkf_relationship_suggestor.NIL != forts.fort_p(collection) && rkf_relationship_suggestor.NIL != sbhl_marking_methods.sbhl_recorded_node_p(collection, space)) {
                    hash_table_utilities.pushnew_hash(relation, argnum, relation_hash, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
                    Hashtables.sethash(relation, rkf_relationship_suggestor.$terms_candidate_relations$.getDynamicValue(thread), arity.arity(relation));
                }
            }
        }
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 13679L)
    public static SubLObject mark_all_term_isas(final SubLObject v_term) {
        if (rkf_relationship_suggestor.NIL != forts.fort_p(v_term)) {
            isa.sbhl_record_all_isa(v_term, (SubLObject)rkf_relationship_suggestor.UNPROVIDED, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
        }
        else if (rkf_relationship_suggestor.NIL != term.nautP(v_term, (SubLObject)rkf_relationship_suggestor.UNPROVIDED)) {
            mark_all_isas_of_naut(v_term);
        }
        else {
            mark_all_defns_of_term(v_term);
        }
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 14016L)
    public static SubLObject mark_all_isas_of_naut(final SubLObject v_term) {
        final SubLObject functor = cycl_utilities.nat_functor(v_term);
        final SubLObject result_isas = kb_accessors.result_isa(functor, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
        final SubLObject result_isa_args = kb_accessors.result_isa_args(v_term, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
        SubLObject cdolist_list_var = result_isas;
        SubLObject result_isa = (SubLObject)rkf_relationship_suggestor.NIL;
        result_isa = cdolist_list_var.first();
        while (rkf_relationship_suggestor.NIL != cdolist_list_var) {
            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(rkf_relationship_suggestor.$const14$genls), result_isa, (SubLObject)rkf_relationship_suggestor.UNPROVIDED, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            result_isa = cdolist_list_var.first();
        }
        cdolist_list_var = result_isa_args;
        result_isa = (SubLObject)rkf_relationship_suggestor.NIL;
        result_isa = cdolist_list_var.first();
        while (rkf_relationship_suggestor.NIL != cdolist_list_var) {
            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(rkf_relationship_suggestor.$const14$genls), result_isa, (SubLObject)rkf_relationship_suggestor.UNPROVIDED, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            result_isa = cdolist_list_var.first();
        }
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-relationship-suggestor.lisp", position = 14477L)
    public static SubLObject mark_all_defns_of_term(final SubLObject v_term) {
        SubLObject cdolist_list_var;
        final SubLObject collections_admitting_term_via_defns = cdolist_list_var = at_defns.collections_admitting_term_via_defns(v_term);
        SubLObject col = (SubLObject)rkf_relationship_suggestor.NIL;
        col = cdolist_list_var.first();
        while (rkf_relationship_suggestor.NIL != cdolist_list_var) {
            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(rkf_relationship_suggestor.$const14$genls), col, (SubLObject)rkf_relationship_suggestor.UNPROVIDED, (SubLObject)rkf_relationship_suggestor.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    public static SubLObject declare_rkf_relationship_suggestor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "rkf_candidate_formulas_relating_terms", "RKF-CANDIDATE-FORMULAS-RELATING-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "find_relations_of_terms", "FIND-RELATIONS-OF-TERMS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "call_right_find_relations", "CALL-RIGHT-FIND-RELATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "specific_legal_relations_of_terms_isa", "SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "gather_all_specific_col_relations", "GATHER-ALL-SPECIFIC-COL-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "gather_specific_col_relations", "GATHER-SPECIFIC-COL-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "legal_relations_of_terms_isa", "LEGAL-RELATIONS-OF-TERMS-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "satisfies_all_arg_isasP", "SATISFIES-ALL-ARG-ISAS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "cr_all_arg_isa_cachedP", "CR-ALL-ARG-ISA-CACHED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "cr_argisa_col_searchedP", "CR-ARGISA-COL-SEARCHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "takes_all_terms_as_argsP", "TAKES-ALL-TERMS-AS-ARGS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "gather_all_col_legal_relations", "GATHER-ALL-COL-LEGAL-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "gather_col_legal_relations", "GATHER-COL-LEGAL-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "mark_all_term_isas", "MARK-ALL-TERM-ISAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "mark_all_isas_of_naut", "MARK-ALL-ISAS-OF-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_relationship_suggestor", "mark_all_defns_of_term", "MARK-ALL-DEFNS-OF-TERM", 1, 0, false);
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    public static SubLObject init_rkf_relationship_suggestor_file() {
        rkf_relationship_suggestor.$specificity_cutoff$ = SubLFiles.defparameter("*SPECIFICITY-CUTOFF*", (SubLObject)rkf_relationship_suggestor.$float0$5_0e_4);
        rkf_relationship_suggestor.$specific_term_relations$ = SubLFiles.defparameter("*SPECIFIC-TERM-RELATIONS*", (SubLObject)rkf_relationship_suggestor.NIL);
        rkf_relationship_suggestor.$term_relations$ = SubLFiles.defparameter("*TERM-RELATIONS*", Vectors.make_vector(rkf_tools.$rkf_max_arity$.getGlobalValue(), (SubLObject)rkf_relationship_suggestor.NIL));
        rkf_relationship_suggestor.$term_isas$ = SubLFiles.defparameter("*TERM-ISAS*", Vectors.make_vector(rkf_tools.$rkf_max_arity$.getGlobalValue(), (SubLObject)rkf_relationship_suggestor.NIL));
        rkf_relationship_suggestor.$terms_candidate_relations$ = SubLFiles.defparameter("*TERMS-CANDIDATE-RELATIONS*", (SubLObject)rkf_relationship_suggestor.NIL);
        rkf_relationship_suggestor.$candidate_relations_sbhl_space$ = SubLFiles.defparameter("*CANDIDATE-RELATIONS-SBHL-SPACE*", (SubLObject)rkf_relationship_suggestor.NIL);
        rkf_relationship_suggestor.$cr_mapping_result$ = SubLFiles.defparameter("*CR-MAPPING-RESULT*", (SubLObject)rkf_relationship_suggestor.NIL);
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    public static SubLObject setup_rkf_relationship_suggestor_file() {
        return (SubLObject)rkf_relationship_suggestor.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_relationship_suggestor_file();
    }
    
    public void initializeVariables() {
        init_rkf_relationship_suggestor_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_relationship_suggestor_file();
    }
    
    static {
        me = (SubLFile)new rkf_relationship_suggestor();
        rkf_relationship_suggestor.$specificity_cutoff$ = null;
        rkf_relationship_suggestor.$specific_term_relations$ = null;
        rkf_relationship_suggestor.$term_relations$ = null;
        rkf_relationship_suggestor.$term_isas$ = null;
        rkf_relationship_suggestor.$terms_candidate_relations$ = null;
        rkf_relationship_suggestor.$candidate_relations_sbhl_space$ = null;
        rkf_relationship_suggestor.$cr_mapping_result$ = null;
        $float0$5_0e_4 = (SubLFloat)SubLObjectFactory.makeDouble(5.0E-4);
        $const1$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $kw2$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym3$TERM_ = SubLObjectFactory.makeSymbol("TERM?");
        $sym4$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const5$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $int6$512 = SubLObjectFactory.makeInteger(512);
        $sym7$MARK_ALL_TERM_ISAS = SubLObjectFactory.makeSymbol("MARK-ALL-TERM-ISAS");
        $sym8$GATHER_SPECIFIC_COL_RELATIONS = SubLObjectFactory.makeSymbol("GATHER-SPECIFIC-COL-RELATIONS");
        $const9$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $kw10$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym11$GATHER_ALL_COL_LEGAL_RELATIONS = SubLObjectFactory.makeSymbol("GATHER-ALL-COL-LEGAL-RELATIONS");
        $sym12$CR_ARGISA_COL_SEARCHED_ = SubLObjectFactory.makeSymbol("CR-ARGISA-COL-SEARCHED?");
        $sym13$GATHER_COL_LEGAL_RELATIONS = SubLObjectFactory.makeSymbol("GATHER-COL-LEGAL-RELATIONS");
        $const14$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
    }
}

/*

	Total time: 376 ms
	
*/