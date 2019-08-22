package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.el_utilities.possibly_inference_sentence_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inference_iterators extends SubLTranslatedFile {
    public static final SubLFile me = new inference_iterators();

    public static final String myName = "com.cyc.cycjava.cycl.inference.inference_iterators";

    public static final String myFingerPrint = "92163ba67342e07ce2eb1be3c49178831a957bc6d2dd2a8c6842a5e24edbd88e";

    // defparameter
    private static final SubLSymbol $new_cyc_query_iterative_results$ = makeSymbol("*NEW-CYC-QUERY-ITERATIVE-RESULTS*");



    public static final SubLSymbol QUERY_DYNAMIC_PROPERTIES_P = makeSymbol("QUERY-DYNAMIC-PROPERTIES-P");



    public static final SubLSymbol INFERENCE_ITERATOR_DONE = makeSymbol("INFERENCE-ITERATOR-DONE");

    public static final SubLSymbol INFERENCE_ITERATOR_NEXT = makeSymbol("INFERENCE-ITERATOR-NEXT");

    public static final SubLSymbol INFERENCE_ITERATOR_FINALIZE = makeSymbol("INFERENCE-ITERATOR-FINALIZE");





    public static final SubLList $list8 = list(makeSymbol("PENDING-QUEUE"), makeSymbol("&REST"), makeSymbol("REST"));





    public static final SubLList $list11 = list(makeSymbol("PENDING-QUEUE"), makeSymbol("INFERENCE"), makeSymbol("QUERY-DYNAMIC-PROPERTIES"), makeSymbol("&REST"), makeSymbol("REST"));

    public static final SubLList $list12 = list(makeSymbol("PENDING-QUEUE"), makeSymbol("INFERENCE"), makeSymbol("QUERY-DYNAMIC-PROPERTIES"), makeSymbol("INFERENCE-FINALIZER"));

    public static final SubLSymbol POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");







    public static final SubLSymbol QUERY_ITERATOR_DONE = makeSymbol("QUERY-ITERATOR-DONE");

    public static final SubLSymbol QUERY_ITERATOR_NEXT = makeSymbol("QUERY-ITERATOR-NEXT");

    public static final SubLSymbol QUERY_ITERATOR_FINALIZE = makeSymbol("QUERY-ITERATOR-FINALIZE");



    public static final SubLList $list21 = list(makeSymbol("CURRENT"), makeSymbol("&REST"), makeSymbol("REST"));

    public static final SubLList $list22 = list(makeSymbol("INFERENCE-ITERATOR"), makeSymbol("&REST"), makeSymbol("REST"));

    public static final SubLList $list23 = list(makeSymbol("INFERENCE-ITERATOR"), makeSymbol("INFERENCE"), makeSymbol("PROBLEM-STORE-PROVIDED?"));







    public static SubLObject new_inference_iterator(final SubLObject inference, SubLObject query_dynamic_properties, SubLObject inference_finalizer) {
        if (query_dynamic_properties == UNPROVIDED) {
            query_dynamic_properties = NIL;
        }
        if (inference_finalizer == UNPROVIDED) {
            inference_finalizer = NIL;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        assert NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(query_dynamic_properties) : "inference_datastructures_enumerated_types.query_dynamic_properties_p(query_dynamic_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(query_dynamic_properties) " + query_dynamic_properties;
        if (((NIL != inference_finalizer) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == function_spec_p(inference_finalizer))) {
            throw new AssertionError(inference_finalizer);
        }
        return iteration.new_iterator(make_inference_iterator_state(inference, query_dynamic_properties, inference_finalizer), INFERENCE_ITERATOR_DONE, INFERENCE_ITERATOR_NEXT, INFERENCE_ITERATOR_FINALIZE);
    }

    public static SubLObject make_inference_iterator_state(final SubLObject inference, SubLObject query_dynamic_properties, final SubLObject inference_finalizer) {
        query_dynamic_properties = putf(query_dynamic_properties, $CONTINUABLE_, T);
        query_dynamic_properties = putf(query_dynamic_properties, $MAX_NUMBER, ONE_INTEGER);
        final SubLObject pending_queue = queues.create_queue(UNPROVIDED);
        return list(pending_queue, inference, query_dynamic_properties, inference_finalizer);
    }

    public static SubLObject inference_iterator_done(final SubLObject state) {
        SubLObject pending_queue = NIL;
        destructuring_bind_must_consp(state, state, $list8);
        pending_queue = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        return eq($DONE, pending_queue);
    }

    public static SubLObject inference_iterator_next(final SubLObject state) {
        SubLObject next_item = $UNDETERMINED;
        SubLObject halted_early = NIL;
        SubLObject pending_queue = NIL;
        SubLObject inference = NIL;
        SubLObject query_dynamic_properties = NIL;
        destructuring_bind_must_consp(state, state, $list11);
        pending_queue = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list11);
        inference = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list11);
        query_dynamic_properties = current.first();
        final SubLObject rest;
        current = rest = current.rest();
        while (($UNDETERMINED == next_item) && ((NIL == queues.queue_empty_p(pending_queue)) || ((NIL != inference_datastructures_inference.continuable_inference_p(inference)) && (NIL == inference_datastructures_inference.exhausted_inference_p(inference))))) {
            if (NIL == queues.queue_empty_p(pending_queue)) {
                next_item = queues.dequeue(pending_queue);
            } else {
                SubLObject cdolist_list_var;
                final SubLObject new_results = cdolist_list_var = inference_kernel.continue_inference(inference, query_dynamic_properties);
                SubLObject new_result = NIL;
                new_result = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    queues.enqueue(new_result, pending_queue);
                    cdolist_list_var = cdolist_list_var.rest();
                    new_result = cdolist_list_var.first();
                } 
            }
        } 
        if (next_item == $UNDETERMINED) {
            halted_early = T;
            set_nth(ZERO_INTEGER, state, $DONE);
        }
        return values(next_item, state, halted_early);
    }

    public static SubLObject inference_iterator_finalize(final SubLObject state) {
        SubLObject pending_queue = NIL;
        SubLObject inference = NIL;
        SubLObject query_dynamic_properties = NIL;
        SubLObject inference_finalizer = NIL;
        destructuring_bind_must_consp(state, state, $list12);
        pending_queue = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list12);
        inference = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list12);
        query_dynamic_properties = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list12);
        inference_finalizer = current.first();
        current = current.rest();
        if (NIL == current) {
            if (inference_finalizer.isFunctionSpec()) {
                return funcall(inference_finalizer, inference);
            }
        } else {
            cdestructuring_bind_error(state, $list12);
        }
        return NIL;
    }

    public static SubLObject new_query_iterator(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        assert NIL != possibly_inference_sentence_p(sentence) : "el_utilities.possibly_inference_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_inference_sentence_p(sentence) " + sentence;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.possibly_mt_p(mt))) {
            throw new AssertionError(mt);
        }
        final SubLObject plist_var = query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        return iteration.new_iterator(make_query_iterator_state(sentence, mt, query_properties), QUERY_ITERATOR_DONE, QUERY_ITERATOR_NEXT, QUERY_ITERATOR_FINALIZE);
    }

    public static SubLObject make_query_iterator_state(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties) {
        final SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(query_properties);
        final SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(query_properties);
        final SubLObject problem_store_providedP = inference_datastructures_problem_store.problem_store_p(getf(query_static_properties, $PROBLEM_STORE, UNPROVIDED));
        final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, query_static_properties);
        final SubLObject inference_iterator = new_inference_iterator(inference, query_dynamic_properties, UNPROVIDED);
        return list(inference_iterator, inference, problem_store_providedP);
    }

    public static SubLObject query_iterator_done(final SubLObject state) {
        SubLObject current_$1 = NIL;
        destructuring_bind_must_consp(state, state, $list21);
        current_$1 = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        return eq($DONE, current_$1);
    }

    public static SubLObject query_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference_iterator = NIL;
        destructuring_bind_must_consp(state, state, $list22);
        inference_iterator = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        thread.resetMultipleValues();
        final SubLObject next = iteration.iteration_next(inference_iterator);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == valid) {
            query_iterator_finalize(state);
            return values(NIL, state, T);
        }
        return values(next, state, NIL);
    }

    public static SubLObject query_iterator_finalize(final SubLObject state) {
        SubLObject current_$2 = NIL;
        destructuring_bind_must_consp(state, state, $list21);
        current_$2 = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        if (NIL != iteration.iterator_p(current_$2)) {
            SubLObject inference_iterator = NIL;
            SubLObject inference = NIL;
            SubLObject problem_store_providedP = NIL;
            destructuring_bind_must_consp(state, state, $list23);
            inference_iterator = state.first();
            SubLObject current_$3 = state.rest();
            destructuring_bind_must_consp(current_$3, state, $list23);
            inference = current_$3.first();
            current_$3 = current_$3.rest();
            destructuring_bind_must_consp(current_$3, state, $list23);
            problem_store_providedP = current_$3.first();
            current_$3 = current_$3.rest();
            if (NIL == current_$3) {
                iteration.iteration_finalize(inference_iterator);
                if (NIL != problem_store_providedP) {
                    inference_datastructures_inference.destroy_inference(inference);
                } else {
                    inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                }
                final SubLObject update = $DONE;
                rplaca(state, update);
                rplacd(state, NIL);
                return T;
            }
            cdestructuring_bind_error(state, $list23);
        }
        return NIL;
    }

    public static SubLObject new_cyc_query_iterative(final SubLObject sentence, SubLObject mt, SubLObject query_properties, SubLObject result_handler) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (result_handler == UNPROVIDED) {
            result_handler = symbol_function(PRINT);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != possibly_inference_sentence_p(sentence) : "el_utilities.possibly_inference_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_inference_sentence_p(sentence) " + sentence;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.possibly_mt_p(mt))) {
            throw new AssertionError(mt);
        }
        final SubLObject plist_var = query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        assert NIL != function_spec_p(result_handler) : "Types.function_spec_p(result_handler) " + "CommonSymbols.NIL != Types.function_spec_p(result_handler) " + result_handler;
        final SubLObject max_number = getf(query_properties, $MAX_NUMBER, NIL);
        final SubLObject max_time = getf(query_properties, $MAX_TIME, NIL);
        query_properties = copy_list(query_properties);
        query_properties = putf(query_properties, $MAX_TIME, NIL);
        SubLObject timed_outP = NIL;
        SubLObject max_numberP = NIL;
        SubLObject results = NIL;
        final SubLObject query_iterator = new_query_iterator(sentence, mt, query_properties);
        final SubLObject _prev_bind_0 = $new_cyc_query_iterative_results$.currentBinding(thread);
        try {
            $new_cyc_query_iterative_results$.bind(NIL, thread);
            if (NIL != max_time) {
                final SubLObject tag = with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$5 = $within_with_timeout$.currentBinding(thread);
                    try {
                        $within_with_timeout$.bind(T, thread);
                        SubLObject timer = NIL;
                        try {
                            final SubLObject _prev_bind_0_$6 = $with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = with_timeout_start_timer(max_time, tag);
                                max_numberP = new_cyc_query_iterative_int(query_iterator, max_number, result_handler);
                            } finally {
                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$6, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                with_timeout_stop_timer(timer);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                    } finally {
                        $within_with_timeout$.rebind(_prev_bind_0_$5, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                } finally {
                    thread.throwStack.pop();
                }
            } else {
                max_numberP = new_cyc_query_iterative_int(query_iterator, max_number, result_handler);
            }
            results = nreverse($new_cyc_query_iterative_results$.getDynamicValue(thread));
        } finally {
            $new_cyc_query_iterative_results$.rebind(_prev_bind_0, thread);
        }
        final SubLObject suspend_status = (NIL != timed_outP) ? $MAX_TIME : NIL != max_numberP ? $MAX_NUMBER : $EXHAUST;
        return values(results, suspend_status);
    }

    public static SubLObject new_cyc_query_iterative_int(final SubLObject query_iterator, final SubLObject max_number, final SubLObject result_handler) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answer_count = ZERO_INTEGER;
        SubLObject doneP = (NIL != max_number) ? numGE(answer_count, max_number) : NIL;
        try {
            SubLObject valid;
            for (SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != doneP))) {
                thread.resetMultipleValues();
                final SubLObject result = iteration.iteration_next(query_iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    answer_count = add(answer_count, ONE_INTEGER);
                    doneP = (NIL != max_number) ? numGE(answer_count, max_number) : NIL;
                    funcall(result_handler, result);
                    $new_cyc_query_iterative_results$.setDynamicValue(cons(result, $new_cyc_query_iterative_results$.getDynamicValue(thread)), thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                iteration.iteration_finalize(query_iterator);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return doneP;
    }

    public static SubLObject declare_inference_iterators_file() {
        declareFunction(me, "new_inference_iterator", "NEW-INFERENCE-ITERATOR", 1, 2, false);
        declareFunction(me, "make_inference_iterator_state", "MAKE-INFERENCE-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "inference_iterator_done", "INFERENCE-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "inference_iterator_next", "INFERENCE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "inference_iterator_finalize", "INFERENCE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "new_query_iterator", "NEW-QUERY-ITERATOR", 1, 2, false);
        declareFunction(me, "make_query_iterator_state", "MAKE-QUERY-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "query_iterator_done", "QUERY-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "query_iterator_next", "QUERY-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "query_iterator_finalize", "QUERY-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "new_cyc_query_iterative", "NEW-CYC-QUERY-ITERATIVE", 1, 3, false);
        declareFunction(me, "new_cyc_query_iterative_int", "NEW-CYC-QUERY-ITERATIVE-INT", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_iterators_file() {
        defparameter("*NEW-CYC-QUERY-ITERATIVE-RESULTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_iterators_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_iterators_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_iterators_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_iterators_file();
    }

    
}

/**
 * Total time: 167 ms synthetic
 */
