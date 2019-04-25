package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class upward_ontology_closure extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.upward_ontology_closure";
    public static final String myFingerPrint = "3d78083ff734c2be4a53b5413281c37e8d785f178ad04e99348bf812b9b29c87";
    @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 898L)
    private static SubLSymbol $upward_ontology_closure_trace$;
    private static final SubLSymbol $sym0$INFERENCE_P;
    private static final SubLSymbol $sym1$FORT_P;
    private static final SubLObject $const2$isa;
    private static final SubLSymbol $kw3$GAF;
    private static final SubLSymbol $kw4$TRUE;
    private static final SubLObject $const5$genls;
    private static final SubLSymbol $kw6$IGNORE;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLObject $const9$genlMt;
    private static final SubLString $str10$___S_via__S;
    private static final SubLString $str11$__seeding__S;
    private static final SubLList $list12;
    
    @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 958L)
    public static SubLObject upward_ontology_closure_wrt_inference(final SubLObject inference, SubLObject closure_mt, SubLObject traceP) {
        if (closure_mt == upward_ontology_closure.UNPROVIDED) {
            closure_mt = (SubLObject)upward_ontology_closure.NIL;
        }
        if (traceP == upward_ontology_closure.UNPROVIDED) {
            traceP = (SubLObject)upward_ontology_closure.NIL;
        }
        assert upward_ontology_closure.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject seed_terms = inference_complete_vocabulary_wrt_answers(inference);
        if (upward_ontology_closure.NIL == closure_mt) {
            closure_mt = inference_datastructures_inference.inference_mt(inference);
        }
        return upward_ontology_closure(seed_terms, closure_mt, traceP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 1302L)
    public static SubLObject inference_complete_vocabulary_wrt_answers(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert upward_ontology_closure.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject query = inference_datastructures_inference.inference_el_query(inference);
        final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
        thread.resetMultipleValues();
        final SubLObject backward_theory = inference_complete_backward_theory_for_answers(inference);
        final SubLObject intermediate_hl_supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject theory_vocab = cycl_utilities.expression_gather(backward_theory, Symbols.symbol_function((SubLObject)upward_ontology_closure.$sym1$FORT_P), (SubLObject)upward_ontology_closure.T, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED);
        final SubLObject hl_support_vocab = cycl_utilities.expression_gather(intermediate_hl_supports, Symbols.symbol_function((SubLObject)upward_ontology_closure.$sym1$FORT_P), (SubLObject)upward_ontology_closure.T, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED);
        final SubLObject query_vocab = cycl_utilities.expression_gather(query, Symbols.symbol_function((SubLObject)upward_ontology_closure.$sym1$FORT_P), (SubLObject)upward_ontology_closure.T, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED);
        final SubLObject mt_vocab = cycl_utilities.expression_gather(mt, Symbols.symbol_function((SubLObject)upward_ontology_closure.$sym1$FORT_P), (SubLObject)upward_ontology_closure.T, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED);
        final SubLObject vocab_set = set_utilities.construct_set_from_list(theory_vocab, Symbols.symbol_function((SubLObject)upward_ontology_closure.EQ), (SubLObject)upward_ontology_closure.UNPROVIDED);
        set_utilities.set_add_all(hl_support_vocab, vocab_set);
        set_utilities.set_add_all(query_vocab, vocab_set);
        set_utilities.set_add_all(mt_vocab, vocab_set);
        return set.set_element_list(vocab_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 2152L)
    public static SubLObject inference_complete_backward_theory_for_answers(final SubLObject inference) {
        assert upward_ontology_closure.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
        final SubLObject explicit_supports = inference_datastructures_inference.inference_all_answer_supports(inference);
        return hl_supports.hl_justification_complete_backward_theory(explicit_supports, mt, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 2448L)
    public static SubLObject upward_ontology_closure(final SubLObject seed_terms, SubLObject mt, SubLObject traceP) {
        if (mt == upward_ontology_closure.UNPROVIDED) {
            mt = (SubLObject)upward_ontology_closure.NIL;
        }
        if (traceP == upward_ontology_closure.UNPROVIDED) {
            traceP = (SubLObject)upward_ontology_closure.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total_set = set.new_set(Symbols.symbol_function((SubLObject)upward_ontology_closure.EQUAL), Sequences.length(seed_terms));
        final SubLObject unprocessed_queue = queues.create_queue((SubLObject)upward_ontology_closure.UNPROVIDED);
        final SubLObject _prev_bind_0 = upward_ontology_closure.$upward_ontology_closure_trace$.currentBinding(thread);
        try {
            upward_ontology_closure.$upward_ontology_closure_trace$.bind(traceP, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = seed_terms;
                SubLObject seed_term = (SubLObject)upward_ontology_closure.NIL;
                seed_term = cdolist_list_var.first();
                while (upward_ontology_closure.NIL != cdolist_list_var) {
                    upward_ontology_closure_possibly_add_new_term_via(seed_term, total_set, unprocessed_queue, (SubLObject)upward_ontology_closure.NIL);
                    cdolist_list_var = cdolist_list_var.rest();
                    seed_term = cdolist_list_var.first();
                }
                while (upward_ontology_closure.NIL == queues.queue_empty_p(unprocessed_queue)) {
                    final SubLObject v_term = queues.dequeue(unprocessed_queue);
                    SubLObject pred_var = upward_ontology_closure.$const2$isa;
                    if (upward_ontology_closure.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)upward_ontology_closure.NIL;
                        final SubLObject token_var = (SubLObject)upward_ontology_closure.NIL;
                        while (upward_ontology_closure.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (upward_ontology_closure.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)upward_ontology_closure.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)upward_ontology_closure.$kw3$GAF, (SubLObject)upward_ontology_closure.$kw4$TRUE, (SubLObject)upward_ontology_closure.NIL);
                                    SubLObject done_var_$2 = (SubLObject)upward_ontology_closure.NIL;
                                    final SubLObject token_var_$3 = (SubLObject)upward_ontology_closure.NIL;
                                    while (upward_ontology_closure.NIL == done_var_$2) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(gaf));
                                        if (upward_ontology_closure.NIL != valid_$4 && upward_ontology_closure.NIL != assertions_high.asserted_assertionP(gaf)) {
                                            final SubLObject other_term = assertions_high.gaf_arg2(gaf);
                                            upward_ontology_closure_possibly_add_new_term_via(other_term, total_set, unprocessed_queue, v_term);
                                        }
                                        done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid_$4);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)upward_ontology_closure.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (upward_ontology_closure.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid);
                        }
                    }
                    if (upward_ontology_closure.NIL != forts.fort_p(v_term)) {
                        if (upward_ontology_closure.NIL != fort_types_interface.collectionP(v_term)) {
                            pred_var = upward_ontology_closure.$const5$genls;
                            if (upward_ontology_closure.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var);
                                SubLObject done_var = (SubLObject)upward_ontology_closure.NIL;
                                final SubLObject token_var = (SubLObject)upward_ontology_closure.NIL;
                                while (upward_ontology_closure.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (upward_ontology_closure.NIL != valid) {
                                        SubLObject final_index_iterator = (SubLObject)upward_ontology_closure.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)upward_ontology_closure.$kw3$GAF, (SubLObject)upward_ontology_closure.$kw4$TRUE, (SubLObject)upward_ontology_closure.NIL);
                                            SubLObject done_var_$3 = (SubLObject)upward_ontology_closure.NIL;
                                            final SubLObject token_var_$4 = (SubLObject)upward_ontology_closure.NIL;
                                            while (upward_ontology_closure.NIL == done_var_$3) {
                                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                                final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(gaf));
                                                if (upward_ontology_closure.NIL != valid_$5 && upward_ontology_closure.NIL != assertions_high.asserted_assertionP(gaf)) {
                                                    final SubLObject other_term = assertions_high.gaf_arg2(gaf);
                                                    upward_ontology_closure_possibly_add_new_term_via(other_term, total_set, unprocessed_queue, v_term);
                                                }
                                                done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid_$5);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)upward_ontology_closure.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                if (upward_ontology_closure.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid);
                                }
                            }
                        }
                        if (upward_ontology_closure.NIL != kb_accessors.relationP(v_term)) {
                            SubLObject cdolist_list_var2 = all_arg_constraint_preds();
                            SubLObject arg_constraint_pred = (SubLObject)upward_ontology_closure.NIL;
                            arg_constraint_pred = cdolist_list_var2.first();
                            while (upward_ontology_closure.NIL != cdolist_list_var2) {
                                final SubLObject pred_var2 = arg_constraint_pred;
                                if (upward_ontology_closure.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var2)) {
                                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var2);
                                    SubLObject done_var2 = (SubLObject)upward_ontology_closure.NIL;
                                    final SubLObject token_var2 = (SubLObject)upward_ontology_closure.NIL;
                                    while (upward_ontology_closure.NIL == done_var2) {
                                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                        if (upward_ontology_closure.NIL != valid2) {
                                            SubLObject final_index_iterator2 = (SubLObject)upward_ontology_closure.NIL;
                                            try {
                                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)upward_ontology_closure.$kw3$GAF, (SubLObject)upward_ontology_closure.$kw4$TRUE, (SubLObject)upward_ontology_closure.NIL);
                                                SubLObject done_var_$4 = (SubLObject)upward_ontology_closure.NIL;
                                                final SubLObject token_var_$5 = (SubLObject)upward_ontology_closure.NIL;
                                                while (upward_ontology_closure.NIL == done_var_$4) {
                                                    final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$5);
                                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(gaf2));
                                                    if (upward_ontology_closure.NIL != valid_$6 && upward_ontology_closure.NIL != assertions_high.asserted_assertionP(gaf2)) {
                                                        SubLObject argnum = (SubLObject)upward_ontology_closure.ZERO_INTEGER;
                                                        SubLObject cdolist_list_var_$13;
                                                        final SubLObject args = cdolist_list_var_$13 = cycl_utilities.formula_args(assertions_high.gaf_formula(gaf2), (SubLObject)upward_ontology_closure.$kw6$IGNORE);
                                                        SubLObject other_term2 = (SubLObject)upward_ontology_closure.NIL;
                                                        other_term2 = cdolist_list_var_$13.first();
                                                        while (upward_ontology_closure.NIL != cdolist_list_var_$13) {
                                                            argnum = Numbers.add(argnum, (SubLObject)upward_ontology_closure.ONE_INTEGER);
                                                            if (argnum.numG((SubLObject)upward_ontology_closure.ONE_INTEGER) && upward_ontology_closure.NIL != forts.fort_p(other_term2)) {
                                                                upward_ontology_closure_possibly_add_new_term_via(other_term2, total_set, unprocessed_queue, v_term);
                                                            }
                                                            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                                            other_term2 = cdolist_list_var_$13.first();
                                                        }
                                                    }
                                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid_$6);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)upward_ontology_closure.T, thread);
                                                    final SubLObject _values3 = Values.getValuesAsVector();
                                                    if (upward_ontology_closure.NIL != final_index_iterator2) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                    }
                                                    Values.restoreValuesFromVector(_values3);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                                }
                                            }
                                        }
                                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid2);
                                    }
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                arg_constraint_pred = cdolist_list_var2.first();
                            }
                        }
                        if (upward_ontology_closure.NIL != fort_types_interface.predicateP(v_term)) {
                            SubLObject cdolist_list_var2 = (SubLObject)upward_ontology_closure.$list7;
                            SubLObject genl_predicate = (SubLObject)upward_ontology_closure.NIL;
                            genl_predicate = cdolist_list_var2.first();
                            while (upward_ontology_closure.NIL != cdolist_list_var2) {
                                final SubLObject pred_var2 = genl_predicate;
                                if (upward_ontology_closure.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var2)) {
                                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var2);
                                    SubLObject done_var2 = (SubLObject)upward_ontology_closure.NIL;
                                    final SubLObject token_var2 = (SubLObject)upward_ontology_closure.NIL;
                                    while (upward_ontology_closure.NIL == done_var2) {
                                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                        if (upward_ontology_closure.NIL != valid2) {
                                            SubLObject final_index_iterator2 = (SubLObject)upward_ontology_closure.NIL;
                                            try {
                                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)upward_ontology_closure.$kw3$GAF, (SubLObject)upward_ontology_closure.$kw4$TRUE, (SubLObject)upward_ontology_closure.NIL);
                                                SubLObject done_var_$5 = (SubLObject)upward_ontology_closure.NIL;
                                                final SubLObject token_var_$6 = (SubLObject)upward_ontology_closure.NIL;
                                                while (upward_ontology_closure.NIL == done_var_$5) {
                                                    final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(gaf2));
                                                    if (upward_ontology_closure.NIL != valid_$7 && upward_ontology_closure.NIL != assertions_high.asserted_assertionP(gaf2)) {
                                                        final SubLObject other_term3 = assertions_high.gaf_arg2(gaf2);
                                                        upward_ontology_closure_possibly_add_new_term_via(other_term3, total_set, unprocessed_queue, v_term);
                                                    }
                                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid_$7);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)upward_ontology_closure.T, thread);
                                                    final SubLObject _values4 = Values.getValuesAsVector();
                                                    if (upward_ontology_closure.NIL != final_index_iterator2) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                    }
                                                    Values.restoreValuesFromVector(_values4);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                                }
                                            }
                                        }
                                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid2);
                                    }
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                genl_predicate = cdolist_list_var2.first();
                            }
                        }
                        if (upward_ontology_closure.NIL != fort_types_interface.functionP(v_term)) {
                            SubLObject cdolist_list_var2 = (SubLObject)upward_ontology_closure.$list8;
                            SubLObject result_predicate = (SubLObject)upward_ontology_closure.NIL;
                            result_predicate = cdolist_list_var2.first();
                            while (upward_ontology_closure.NIL != cdolist_list_var2) {
                                final SubLObject pred_var2 = result_predicate;
                                if (upward_ontology_closure.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var2)) {
                                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var2);
                                    SubLObject done_var2 = (SubLObject)upward_ontology_closure.NIL;
                                    final SubLObject token_var2 = (SubLObject)upward_ontology_closure.NIL;
                                    while (upward_ontology_closure.NIL == done_var2) {
                                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                        if (upward_ontology_closure.NIL != valid2) {
                                            SubLObject final_index_iterator2 = (SubLObject)upward_ontology_closure.NIL;
                                            try {
                                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)upward_ontology_closure.$kw3$GAF, (SubLObject)upward_ontology_closure.$kw4$TRUE, (SubLObject)upward_ontology_closure.NIL);
                                                SubLObject done_var_$6 = (SubLObject)upward_ontology_closure.NIL;
                                                final SubLObject token_var_$7 = (SubLObject)upward_ontology_closure.NIL;
                                                while (upward_ontology_closure.NIL == done_var_$6) {
                                                    final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$7);
                                                    final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(gaf2));
                                                    if (upward_ontology_closure.NIL != valid_$8 && upward_ontology_closure.NIL != assertions_high.asserted_assertionP(gaf2)) {
                                                        final SubLObject other_term3 = assertions_high.gaf_arg2(gaf2);
                                                        upward_ontology_closure_possibly_add_new_term_via(other_term3, total_set, unprocessed_queue, v_term);
                                                    }
                                                    done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid_$8);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)upward_ontology_closure.T, thread);
                                                    final SubLObject _values5 = Values.getValuesAsVector();
                                                    if (upward_ontology_closure.NIL != final_index_iterator2) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                    }
                                                    Values.restoreValuesFromVector(_values5);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                                }
                                            }
                                        }
                                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid2);
                                    }
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                result_predicate = cdolist_list_var2.first();
                            }
                        }
                        if (upward_ontology_closure.NIL == fort_types_interface.microtheory_p(v_term)) {
                            continue;
                        }
                        pred_var = upward_ontology_closure.$const9$genlMt;
                        if (upward_ontology_closure.NIL == kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var)) {
                            continue;
                        }
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)upward_ontology_closure.ONE_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)upward_ontology_closure.NIL;
                        final SubLObject token_var = (SubLObject)upward_ontology_closure.NIL;
                        while (upward_ontology_closure.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (upward_ontology_closure.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)upward_ontology_closure.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)upward_ontology_closure.$kw3$GAF, (SubLObject)upward_ontology_closure.$kw4$TRUE, (SubLObject)upward_ontology_closure.NIL);
                                    SubLObject done_var_$7 = (SubLObject)upward_ontology_closure.NIL;
                                    final SubLObject token_var_$8 = (SubLObject)upward_ontology_closure.NIL;
                                    while (upward_ontology_closure.NIL == done_var_$7) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                        final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(gaf));
                                        if (upward_ontology_closure.NIL != valid_$9 && upward_ontology_closure.NIL != assertions_high.asserted_assertionP(gaf)) {
                                            final SubLObject other_term = assertions_high.gaf_arg2(gaf);
                                            upward_ontology_closure_possibly_add_new_term_via(other_term, total_set, unprocessed_queue, v_term);
                                        }
                                        done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid_$9);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)upward_ontology_closure.T, thread);
                                        final SubLObject _values6 = Values.getValuesAsVector();
                                        if (upward_ontology_closure.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values6);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(upward_ontology_closure.NIL == valid);
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            upward_ontology_closure.$upward_ontology_closure_trace$.rebind(_prev_bind_0, thread);
        }
        return total_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 6087L)
    public static SubLObject upward_ontology_closure_possibly_add_new_term_via(final SubLObject new_term, final SubLObject total_set, final SubLObject unprocessed_queue, final SubLObject source_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (upward_ontology_closure.NIL == set.set_memberP(new_term, total_set)) {
            set.set_add(new_term, total_set);
            queues.enqueue(new_term, unprocessed_queue);
            if (upward_ontology_closure.NIL != upward_ontology_closure.$upward_ontology_closure_trace$.getDynamicValue(thread)) {
                if (upward_ontology_closure.NIL != source_term) {
                    format_nil.force_format(upward_ontology_closure.$upward_ontology_closure_trace$.getDynamicValue(thread), (SubLObject)upward_ontology_closure.$str10$___S_via__S, new_term, source_term, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED);
                }
                else {
                    format_nil.force_format(upward_ontology_closure.$upward_ontology_closure_trace$.getDynamicValue(thread), (SubLObject)upward_ontology_closure.$str11$__seeding__S, new_term, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED, (SubLObject)upward_ontology_closure.UNPROVIDED);
                }
            }
            return new_term;
        }
        return (SubLObject)upward_ontology_closure.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 6577L)
    public static SubLObject all_arg_constraint_preds() {
        return (SubLObject)upward_ontology_closure.$list12;
    }
    
    public static SubLObject declare_upward_ontology_closure_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.upward_ontology_closure", "upward_ontology_closure_wrt_inference", "UPWARD-ONTOLOGY-CLOSURE-WRT-INFERENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.upward_ontology_closure", "inference_complete_vocabulary_wrt_answers", "INFERENCE-COMPLETE-VOCABULARY-WRT-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.upward_ontology_closure", "inference_complete_backward_theory_for_answers", "INFERENCE-COMPLETE-BACKWARD-THEORY-FOR-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.upward_ontology_closure", "upward_ontology_closure", "UPWARD-ONTOLOGY-CLOSURE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.upward_ontology_closure", "upward_ontology_closure_possibly_add_new_term_via", "UPWARD-ONTOLOGY-CLOSURE-POSSIBLY-ADD-NEW-TERM-VIA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.upward_ontology_closure", "all_arg_constraint_preds", "ALL-ARG-CONSTRAINT-PREDS", 0, 0, false);
        return (SubLObject)upward_ontology_closure.NIL;
    }
    
    public static SubLObject init_upward_ontology_closure_file() {
        upward_ontology_closure.$upward_ontology_closure_trace$ = SubLFiles.defparameter("*UPWARD-ONTOLOGY-CLOSURE-TRACE*", (SubLObject)upward_ontology_closure.NIL);
        return (SubLObject)upward_ontology_closure.NIL;
    }
    
    public static SubLObject setup_upward_ontology_closure_file() {
        return (SubLObject)upward_ontology_closure.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_upward_ontology_closure_file();
    }
    
    @Override
	public void initializeVariables() {
        init_upward_ontology_closure_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_upward_ontology_closure_file();
    }
    
    static {
        me = (SubLFile)new upward_ontology_closure();
        upward_ontology_closure.$upward_ontology_closure_trace$ = null;
        $sym0$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $sym1$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const2$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw3$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw4$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const5$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw6$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $list8 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenl")));
        $const9$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $str10$___S_via__S = SubLObjectFactory.makeString("~%~S via ~S");
        $str11$__seeding__S = SubLObjectFactory.makeString("~%seeding ~S");
        $list12 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Genl")) });
    }
}

/*

	Total time: 805 ms
	
*/