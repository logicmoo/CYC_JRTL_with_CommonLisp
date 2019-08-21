package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.kb_iterators;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.kb_iterators.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class kb_iterators extends SubLTranslatedFile {
    public static final SubLFile me = new kb_iterators();

    public static final String myName = "com.cyc.cycjava.cycl.kb_iterators";

    public static final String myFingerPrint = "062538c4085bdef2dbac8cecdac18bbd9d778d1a70376276f1709bf7148ae9c3";



















    private static final SubLSymbol ITERATOR_SPECS_DONE = makeSymbol("ITERATOR-SPECS-DONE");

    private static final SubLSymbol ITERATOR_SPECS_NEXT = makeSymbol("ITERATOR-SPECS-NEXT");



    private static final SubLList $list12 = list(makeSymbol("PENDING-QUEUE"), makeSymbol("VISITED-TABLE"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLString $str14$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list16 = list(makeSymbol("INSTANCE"), makeUninternedSymbol("MT-VAR"), makeUninternedSymbol("TV-VAR"));

    private static final SubLSymbol ITERATOR_INSTANCES_DONE = makeSymbol("ITERATOR-INSTANCES-DONE");

    private static final SubLSymbol ITERATOR_INSTANCES_NEXT = makeSymbol("ITERATOR-INSTANCES-NEXT");

    private static final SubLList $list19 = list(makeSymbol("SPECS-ITERATOR"), makeSymbol("LOCAL-INSTANCES-ITERATOR"), makeSymbol("VISITED-TABLE"));

    private static final SubLSymbol ITERATOR_ONTOLOGY_DONE = makeSymbol("ITERATOR-ONTOLOGY-DONE");

    private static final SubLSymbol ITERATOR_ONTOLOGY_NEXT = makeSymbol("ITERATOR-ONTOLOGY-NEXT");

    private static final SubLString $str22$Rule_set_is_not_initialized_ = makeString("Rule set is not initialized.");

    private static final SubLSymbol ITERATOR_TRANSITIVE_DONE = makeSymbol("ITERATOR-TRANSITIVE-DONE");

    private static final SubLSymbol ITERATOR_TRANSITIVE_NEXT = makeSymbol("ITERATOR-TRANSITIVE-NEXT");



    public static SubLObject new_gaf_arg_index_iterator(final SubLObject v_term, final SubLObject arg, SubLObject pred, SubLObject mt) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return iteration.new_list_iterator(kb_mapping.gather_gaf_arg_index(v_term, arg, pred, mt, UNPROVIDED));
    }

    public static SubLObject new_nart_arg_index_iterator(final SubLObject v_term, final SubLObject arg, SubLObject func) {
        if (func == UNPROVIDED) {
            func = NIL;
        }
        return iteration.new_list_iterator(kb_mapping.gather_nart_arg_index(v_term, arg, func));
    }

    public static SubLObject new_predicate_extent_index_iterator(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return iteration.new_list_iterator(kb_mapping.gather_predicate_extent_index(pred, mt, UNPROVIDED));
    }

    public static SubLObject new_function_extent_index_iterator(final SubLObject func) {
        return iteration.new_list_iterator(kb_mapping.gather_function_extent_index(func));
    }

    public static SubLObject new_mt_index_iterator(final SubLObject v_term) {
        return iteration.new_list_iterator(kb_mapping.gather_mt_index(v_term));
    }

    public static SubLObject new_best_gaf_lookup_index_iterator(final SubLObject asent, SubLObject truth, SubLObject v_methods) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (v_methods == UNPROVIDED) {
            v_methods = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lookup_index = kb_indexing.best_gaf_lookup_index(asent, truth, v_methods);
        final SubLObject pcase_var;
        final SubLObject index_type = pcase_var = kb_indexing.lookup_index_get_property(lookup_index, $INDEX_TYPE, UNPROVIDED);
        if (pcase_var.eql($GAF_ARG)) {
            final SubLObject v_term = kb_indexing.lookup_index_get_property(lookup_index, $TERM, UNPROVIDED);
            final SubLObject argnum = kb_indexing.lookup_index_get_property(lookup_index, $ARGNUM, UNPROVIDED);
            final SubLObject pred = kb_indexing.lookup_index_get_property(lookup_index, $PREDICATE, UNPROVIDED);
            return new_gaf_arg_index_iterator(v_term, argnum, pred, UNPROVIDED);
        }
        if (pcase_var.eql($PREDICATE_EXTENT)) {
            final SubLObject pred2 = kb_indexing.lookup_index_get_property(lookup_index, $PREDICATE, UNPROVIDED);
            return new_predicate_extent_index_iterator(pred2, UNPROVIDED);
        }
        SubLObject result = NIL;
        final SubLObject l_index = lookup_index;
        final SubLObject pcase_var_$1;
        final SubLObject method = pcase_var_$1 = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var_$1.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term2 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum2 = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum2) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum2, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum2, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                    SubLObject done_var_$2 = NIL;
                                    final SubLObject token_var_$3 = NIL;
                                    while (NIL == done_var_$2) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(gaf));
                                        if (NIL != valid_$4) {
                                            result = cons(gaf, result);
                                        }
                                        done_var_$2 = makeBoolean(NIL == valid_$4);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum2, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum2, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                    SubLObject done_var_$3 = NIL;
                                    final SubLObject token_var_$4 = NIL;
                                    while (NIL == done_var_$3) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(gaf));
                                        if (NIL != valid_$5) {
                                            result = cons(gaf, result);
                                        }
                                        done_var_$3 = makeBoolean(NIL == valid_$5);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(gaf));
                                        if (NIL != valid_$6) {
                                            result = cons(gaf, result);
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                    SubLObject done_var_$5 = NIL;
                                    final SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                        final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(gaf));
                                        if (NIL != valid_$7) {
                                            result = cons(gaf, result);
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var_$1.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                    SubLObject done_var_$6 = NIL;
                                    final SubLObject token_var_$7 = NIL;
                                    while (NIL == done_var_$6) {
                                        final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$7);
                                        final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(gaf2));
                                        if (NIL != valid_$8) {
                                            result = cons(gaf2, result);
                                        }
                                        done_var_$6 = makeBoolean(NIL == valid_$8);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var_$1.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject gaf3 = NIL;
                    gaf3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == truth) || (NIL != assertions_high.assertion_has_truth(gaf3, truth))) {
                            result = cons(gaf3, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        gaf3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        return iteration.new_list_iterator(nreverse(result));
    }

    public static SubLObject new_genls_iterator(final SubLObject collection) {
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        return iteration.new_list_iterator(genls.all_genls(collection, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject new_isa_iterator(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return iteration.new_list_iterator(isa.all_isa(fort, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject new_specs_iterator(final SubLObject collection) {
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        return iteration.new_iterator(make_iterator_specs_state(collection), symbol_function(ITERATOR_SPECS_DONE), symbol_function(ITERATOR_SPECS_NEXT), UNPROVIDED);
    }

    public static SubLObject make_iterator_specs_state(final SubLObject collection) {
        final SubLObject pending_queue = queues.create_queue(UNPROVIDED);
        final SubLObject visited_table = make_hash_table($int$100, symbol_function(EQL), UNPROVIDED);
        queues.enqueue(collection, pending_queue);
        sethash(collection, visited_table, T);
        return list(pending_queue, visited_table);
    }

    public static SubLObject iterator_specs_done(final SubLObject state) {
        return queues.queue_empty_p(state.first());
    }

    public static SubLObject iterator_specs_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pending_queue = NIL;
        SubLObject visited_table = NIL;
        destructuring_bind_must_consp(state, state, $list12);
        pending_queue = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list12);
        visited_table = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject next_item = NIL;
            while ((NIL == queues.queue_empty_p(pending_queue)) && (NIL == next_item)) {
                next_item = queues.dequeue(pending_queue);
                final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? sbhl_module_vars.get_sbhl_module($$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(next_item, sbhl_module_vars.get_sbhl_module($$genls));
                    if (NIL == d_link) {
                        continue;
                    }
                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                    SubLObject direction = NIL;
                    direction = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genls));
                        if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls)))) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$18;
                                for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject sol = link_nodes_var;
                                        if (NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state_$19;
                                            SubLObject spec;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$19 = NIL, state_$19 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$19); state_$19 = set_contents.do_set_contents_update_state(state_$19)) {
                                                spec = set_contents.do_set_contents_next(basis_object, state_$19);
                                                if (((NIL != set_contents.do_set_contents_element_validP(state_$19, spec)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var))) && (NIL == gethash(spec, visited_table, UNPROVIDED))) {
                                                    sethash(spec, visited_table, T);
                                                    queues.enqueue(spec, pending_queue);
                                                }
                                            }
                                        } else
                                            if (sol.isList()) {
                                                SubLObject csome_list_var = sol;
                                                SubLObject spec2 = NIL;
                                                spec2 = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    if ((NIL != mt_relevance_macros.relevant_mtP(mt_var)) && (NIL == gethash(spec2, visited_table, UNPROVIDED))) {
                                                        sethash(spec2, visited_table, T);
                                                        queues.enqueue(spec2, pending_queue);
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    spec2 = csome_list_var.first();
                                                } 
                                            } else {
                                                Errors.error($str14$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }

                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        direction = cdolist_list_var.first();
                    } 
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            } 
            return values(next_item, state, NIL);
        }
        cdestructuring_bind_error(state, $list12);
        return NIL;
    }

    public static SubLObject new_local_instances_iterator(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        SubLObject v_instances = NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$isa) ? sbhl_module_vars.get_sbhl_module($$isa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(collection, sbhl_module_vars.get_sbhl_module($$isa));
            if (NIL != d_link) {
                SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$isa));
                SubLObject direction = NIL;
                direction = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$isa));
                    if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)))) {
                        SubLObject iteration_state;
                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject mt_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            final SubLObject tv_links = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject iteration_state_$20;
                            for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                thread.resetMultipleValues();
                                final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject sol = link_nodes_var;
                                    if (NIL != set.set_p(sol)) {
                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject instance;
                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                            if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var))) {
                                                v_instances = cons(instance, v_instances);
                                            }
                                        }
                                    } else
                                        if (sol.isList()) {
                                            SubLObject csome_list_var = sol;
                                            SubLObject instance2 = NIL;
                                            instance2 = csome_list_var.first();
                                            while (NIL != csome_list_var) {
                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_var)) {
                                                    v_instances = cons(instance2, v_instances);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                instance2 = csome_list_var.first();
                                            } 
                                        } else {
                                            Errors.error($str14$_A_is_neither_SET_P_nor_LISTP_, sol);
                                        }

                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    direction = cdolist_list_var.first();
                } 
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(collection);
        SubLObject instance_tuple = NIL;
        instance_tuple = csome_list_var2.first();
        while (NIL != csome_list_var2) {
            SubLObject current;
            final SubLObject datum = current = instance_tuple;
            SubLObject instance3 = NIL;
            SubLObject mt_var2 = NIL;
            SubLObject tv_var2 = NIL;
            destructuring_bind_must_consp(current, datum, $list16);
            instance3 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list16);
            mt_var2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list16);
            tv_var2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var2)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var2))) {
                    v_instances = cons(instance3, v_instances);
                }
            } else {
                cdestructuring_bind_error(datum, $list16);
            }
            csome_list_var2 = csome_list_var2.rest();
            instance_tuple = csome_list_var2.first();
        } 
        return iteration.new_list_iterator(nreverse(v_instances));
    }

    public static SubLObject new_instances_iterator(final SubLObject collection) {
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        return iteration.new_iterator(make_iterator_instances_state(collection), symbol_function(ITERATOR_INSTANCES_DONE), symbol_function(ITERATOR_INSTANCES_NEXT), UNPROVIDED);
    }

    public static SubLObject make_iterator_instances_state(final SubLObject collection) {
        final SubLObject specs_iterator = new_specs_iterator(collection);
        final SubLObject local_instances_iterator = NIL;
        final SubLObject visited_table = make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED);
        return list(specs_iterator, local_instances_iterator, visited_table);
    }

    public static SubLObject iterator_instances_done(final SubLObject state) {
        return makeBoolean((NIL == state.first()) && (NIL == second(state)));
    }

    public static SubLObject iterator_instances_next(final SubLObject state) {
        SubLObject specs_iterator = NIL;
        SubLObject local_instances_iterator = NIL;
        SubLObject visited_table = NIL;
        destructuring_bind_must_consp(state, state, $list19);
        specs_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list19);
        local_instances_iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        visited_table = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list19);
            return NIL;
        }
        while (true) {
            if ((NIL != local_instances_iterator) && (NIL == iteration.iteration_done(local_instances_iterator))) {
                final SubLObject next_instance = iteration.iteration_next(local_instances_iterator);
                if (NIL == gethash(next_instance, visited_table, UNPROVIDED)) {
                    sethash(next_instance, visited_table, T);
                    return values(next_instance, state, NIL);
                }
                continue;
            } else
                if (NIL != local_instances_iterator) {
                    local_instances_iterator = NIL;
                    set_nth(ONE_INTEGER, state, local_instances_iterator);
                } else {
                    if (NIL != iteration.iteration_done(specs_iterator)) {
                        specs_iterator = NIL;
                        set_nth(ZERO_INTEGER, state, specs_iterator);
                        return values(NIL, state, T);
                    }
                    final SubLObject next_spec = iteration.iteration_next(specs_iterator);
                    local_instances_iterator = new_local_instances_iterator(next_spec);
                    set_nth(ONE_INTEGER, state, local_instances_iterator);
                }

        } 
    }

    public static SubLObject new_ontology_iterator(final SubLObject collection) {
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        return iteration.new_iterator(make_iterator_ontology_state(collection), symbol_function(ITERATOR_ONTOLOGY_DONE), symbol_function(ITERATOR_ONTOLOGY_NEXT), UNPROVIDED);
    }

    public static SubLObject make_iterator_ontology_state(final SubLObject collection) {
        final SubLObject pending_specs_queue = queues.create_queue(UNPROVIDED);
        final SubLObject pending_instances_queue = queues.create_queue(UNPROVIDED);
        final SubLObject visited_table = make_hash_table(add(cardinality_estimates.spec_cardinality(collection), cardinality_estimates.instance_cardinality(collection)), UNPROVIDED, UNPROVIDED);
        queues.enqueue(collection, pending_specs_queue);
        sethash(collection, visited_table, T);
        return list(pending_specs_queue, pending_instances_queue, visited_table);
    }

    public static SubLObject iterator_ontology_done(final SubLObject state) {
        return makeBoolean((NIL != queues.queue_empty_p(state.first())) && (NIL != queues.queue_empty_p(second(state))));
    }

    public static SubLObject iterator_ontology_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pending_specs_queue = state.first();
        final SubLObject pending_instances_queue = second(state);
        final SubLObject visited_table = third(state);
        SubLObject next_item = NIL;
        if (NIL == queues.queue_empty_p(pending_specs_queue)) {
            next_item = queues.dequeue(pending_specs_queue);
            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? sbhl_module_vars.get_sbhl_module($$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(next_item, sbhl_module_vars.get_sbhl_module($$genls));
                if (NIL != d_link) {
                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                    SubLObject direction = NIL;
                    direction = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genls));
                        if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls)))) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$21;
                                for (iteration_state_$21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$21); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next(iteration_state_$21)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$21);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject sol = link_nodes_var;
                                        if (NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state_$22;
                                            SubLObject spec;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$22 = NIL, state_$22 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$22); state_$22 = set_contents.do_set_contents_update_state(state_$22)) {
                                                spec = set_contents.do_set_contents_next(basis_object, state_$22);
                                                if (((NIL != set_contents.do_set_contents_element_validP(state_$22, spec)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var))) && (NIL == gethash(spec, visited_table, UNPROVIDED))) {
                                                    sethash(spec, visited_table, T);
                                                    queues.enqueue(spec, pending_specs_queue);
                                                }
                                            }
                                        } else
                                            if (sol.isList()) {
                                                SubLObject csome_list_var = sol;
                                                SubLObject spec2 = NIL;
                                                spec2 = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    if ((NIL != mt_relevance_macros.relevant_mtP(mt_var)) && (NIL == gethash(spec2, visited_table, UNPROVIDED))) {
                                                        sethash(spec2, visited_table, T);
                                                        queues.enqueue(spec2, pending_specs_queue);
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    spec2 = csome_list_var.first();
                                                } 
                                            } else {
                                                Errors.error($str14$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }

                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$21);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        direction = cdolist_list_var.first();
                    } 
                }
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$isa) ? sbhl_module_vars.get_sbhl_module($$isa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(next_item, sbhl_module_vars.get_sbhl_module($$isa));
                if (NIL != d_link) {
                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$isa));
                    SubLObject direction = NIL;
                    direction = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$isa));
                        if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)))) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$22;
                                for (iteration_state_$22 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$22); iteration_state_$22 = dictionary_contents.do_dictionary_contents_next(iteration_state_$22)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$22);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject sol = link_nodes_var;
                                        if (NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state_$23;
                                            SubLObject instance;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$23 = NIL, state_$23 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$23); state_$23 = set_contents.do_set_contents_update_state(state_$23)) {
                                                instance = set_contents.do_set_contents_next(basis_object, state_$23);
                                                if (((NIL != set_contents.do_set_contents_element_validP(state_$23, instance)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var))) && (NIL == gethash(instance, visited_table, UNPROVIDED))) {
                                                    sethash(instance, visited_table, T);
                                                    queues.enqueue(instance, pending_instances_queue);
                                                }
                                            }
                                        } else
                                            if (sol.isList()) {
                                                SubLObject csome_list_var = sol;
                                                SubLObject instance2 = NIL;
                                                instance2 = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    if ((NIL != mt_relevance_macros.relevant_mtP(mt_var)) && (NIL == gethash(instance2, visited_table, UNPROVIDED))) {
                                                        sethash(instance2, visited_table, T);
                                                        queues.enqueue(instance2, pending_instances_queue);
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    instance2 = csome_list_var.first();
                                                } 
                                            } else {
                                                Errors.error($str14$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }

                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$22);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        direction = cdolist_list_var.first();
                    } 
                }
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(next_item);
            SubLObject instance_tuple = NIL;
            instance_tuple = csome_list_var2.first();
            while (NIL != csome_list_var2) {
                SubLObject current;
                final SubLObject datum = current = instance_tuple;
                SubLObject instance3 = NIL;
                SubLObject mt_var2 = NIL;
                SubLObject tv_var2 = NIL;
                destructuring_bind_must_consp(current, datum, $list16);
                instance3 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list16);
                mt_var2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list16);
                tv_var2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (((NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var2)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var2))) && (NIL == gethash(instance3, visited_table, UNPROVIDED))) {
                        sethash(instance3, visited_table, T);
                        queues.enqueue(instance3, pending_instances_queue);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list16);
                }
                csome_list_var2 = csome_list_var2.rest();
                instance_tuple = csome_list_var2.first();
            } 
            return values(next_item, state);
        }
        if (NIL == queues.queue_empty_p(pending_instances_queue)) {
            next_item = queues.dequeue(pending_instances_queue);
            return values(next_item, state);
        }
        return values(NIL, state, T);
    }

    public static SubLObject new_rule_iterator() {
        final SubLObject rule_set = assertions_low.kb_rule_set();
        if (NIL != keyhash.keyhash_p(rule_set)) {
            return keyhash.new_keyhash_iterator(rule_set);
        }
        if (rule_set.isHashtable()) {
            return iteration.new_hash_table_keys_iterator(rule_set);
        }
        return Errors.error($str22$Rule_set_is_not_initialized_);
    }

    public static SubLObject new_transitive_iterator(final SubLObject fort, final SubLObject predicate, SubLObject argnum) {
        if (argnum == UNPROVIDED) {
            argnum = ONE_INTEGER;
        }
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        assert NIL != forts.fort_p(predicate) : "forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) " + predicate;
        return iteration.new_iterator(make_iterator_transitive_state(fort, predicate, argnum), symbol_function(ITERATOR_TRANSITIVE_DONE), symbol_function(ITERATOR_TRANSITIVE_NEXT), UNPROVIDED);
    }

    public static SubLObject make_iterator_transitive_state(final SubLObject fort, final SubLObject predicate, final SubLObject from_arg) {
        final SubLObject pending_queue = queues.create_queue(UNPROVIDED);
        final SubLObject visited_table = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
        queues.enqueue(fort, pending_queue);
        sethash(fort, visited_table, T);
        return vector(new SubLObject[]{ pending_queue, visited_table, predicate, from_arg });
    }

    public static SubLObject iterator_transitive_done(final SubLObject state) {
        return queues.queue_empty_p(aref(state, ZERO_INTEGER));
    }

    public static SubLObject iterator_transitive_next(final SubLObject state) {
        final SubLObject pending_queue = aref(state, ZERO_INTEGER);
        final SubLObject visited_table = aref(state, ONE_INTEGER);
        final SubLObject predicate = aref(state, TWO_INTEGER);
        final SubLObject from_arg = aref(state, THREE_INTEGER);
        final SubLObject to_arg = (from_arg.eql(ONE_INTEGER)) ? TWO_INTEGER : ONE_INTEGER;
        SubLObject next_item = NIL;
        while ((NIL == queues.queue_empty_p(pending_queue)) && (NIL == next_item)) {
            next_item = queues.dequeue(pending_queue);
            SubLObject spec = NIL;
            final SubLObject pred_var = predicate;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(next_item, from_arg, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(next_item, from_arg, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$25 = NIL;
                            final SubLObject token_var_$26 = NIL;
                            while (NIL == done_var_$25) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(assertion));
                                if (NIL != valid_$27) {
                                    spec = assertions_high.gaf_arg(assertion, to_arg);
                                    if (NIL == gethash(spec, visited_table, UNPROVIDED)) {
                                        sethash(spec, visited_table, T);
                                        queues.enqueue(spec, pending_queue);
                                    }
                                }
                                done_var_$25 = makeBoolean(NIL == valid_$27);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } 
        return values(next_item, state, NIL);
    }

    public static SubLObject declare_kb_iterators_file() {
        declareFunction(me, "new_gaf_arg_index_iterator", "NEW-GAF-ARG-INDEX-ITERATOR", 2, 2, false);
        declareFunction(me, "new_nart_arg_index_iterator", "NEW-NART-ARG-INDEX-ITERATOR", 2, 1, false);
        declareFunction(me, "new_predicate_extent_index_iterator", "NEW-PREDICATE-EXTENT-INDEX-ITERATOR", 1, 1, false);
        declareFunction(me, "new_function_extent_index_iterator", "NEW-FUNCTION-EXTENT-INDEX-ITERATOR", 1, 0, false);
        declareFunction(me, "new_mt_index_iterator", "NEW-MT-INDEX-ITERATOR", 1, 0, false);
        declareFunction(me, "new_best_gaf_lookup_index_iterator", "NEW-BEST-GAF-LOOKUP-INDEX-ITERATOR", 1, 2, false);
        declareFunction(me, "new_genls_iterator", "NEW-GENLS-ITERATOR", 1, 0, false);
        declareFunction(me, "new_isa_iterator", "NEW-ISA-ITERATOR", 1, 0, false);
        declareFunction(me, "new_specs_iterator", "NEW-SPECS-ITERATOR", 1, 0, false);
        declareFunction(me, "make_iterator_specs_state", "MAKE-ITERATOR-SPECS-STATE", 1, 0, false);
        declareFunction(me, "iterator_specs_done", "ITERATOR-SPECS-DONE", 1, 0, false);
        declareFunction(me, "iterator_specs_next", "ITERATOR-SPECS-NEXT", 1, 0, false);
        declareFunction(me, "new_local_instances_iterator", "NEW-LOCAL-INSTANCES-ITERATOR", 1, 0, false);
        declareFunction(me, "new_instances_iterator", "NEW-INSTANCES-ITERATOR", 1, 0, false);
        declareFunction(me, "make_iterator_instances_state", "MAKE-ITERATOR-INSTANCES-STATE", 1, 0, false);
        declareFunction(me, "iterator_instances_done", "ITERATOR-INSTANCES-DONE", 1, 0, false);
        declareFunction(me, "iterator_instances_next", "ITERATOR-INSTANCES-NEXT", 1, 0, false);
        declareFunction(me, "new_ontology_iterator", "NEW-ONTOLOGY-ITERATOR", 1, 0, false);
        declareFunction(me, "make_iterator_ontology_state", "MAKE-ITERATOR-ONTOLOGY-STATE", 1, 0, false);
        declareFunction(me, "iterator_ontology_done", "ITERATOR-ONTOLOGY-DONE", 1, 0, false);
        declareFunction(me, "iterator_ontology_next", "ITERATOR-ONTOLOGY-NEXT", 1, 0, false);
        declareFunction(me, "new_rule_iterator", "NEW-RULE-ITERATOR", 0, 0, false);
        declareFunction(me, "new_transitive_iterator", "NEW-TRANSITIVE-ITERATOR", 2, 1, false);
        declareFunction(me, "make_iterator_transitive_state", "MAKE-ITERATOR-TRANSITIVE-STATE", 3, 0, false);
        declareFunction(me, "iterator_transitive_done", "ITERATOR-TRANSITIVE-DONE", 1, 0, false);
        declareFunction(me, "iterator_transitive_next", "ITERATOR-TRANSITIVE-NEXT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_iterators_file() {
        return NIL;
    }

    public static SubLObject setup_kb_iterators_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_iterators_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_iterators_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_iterators_file();
    }

    static {



























    }
}

/**
 * Total time: 618 ms
 */
