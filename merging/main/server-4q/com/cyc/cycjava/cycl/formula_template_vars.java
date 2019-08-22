/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FORMULA-TEMPLATE-VARS
 * source file: /cyc/top/cycl/formula-template-vars.lisp
 * created:     2019/07/03 17:37:51
 */
public final class formula_template_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new formula_template_vars();

 public static final String myName = "com.cyc.cycjava.cycl.formula_template_vars";


    // deflexical
    @LispMethod(comment = "deflexical")
    // Definitions
    public static final SubLSymbol $template_topic_memoization$ = makeSymbol("*TEMPLATE-TOPIC-MEMOIZATION*");



    // deflexical
    // Keep track of all such stores.
    /**
     * Keep track of all such stores.
     */
    @LispMethod(comment = "Keep track of all such stores.\ndeflexical")
    private static final SubLSymbol $template_topic_problem_stores$ = makeSymbol("*TEMPLATE-TOPIC-PROBLEM-STORES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $use_formula_template_candidate_replacements_auto_expand$ = makeSymbol("*USE-FORMULA-TEMPLATE-CANDIDATE-REPLACEMENTS-AUTO-EXPAND*");

    static private final SubLList $list1 = list(list(makeSymbol("*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*"), T));

    static private final SubLList $list3 = list(list(makeSymbol("VALUE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $formula_template_autoexpand_candidate_replacementsP$ = makeSymbol("*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*");

    private static final SubLSymbol FIND_OR_CREATE_TEMPLATE_TOPIC_PROBLEM_STORE = makeSymbol("FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE");

    private static final SubLSymbol WITH_TEMPLATE_TOPIC_PROBLEM_STORE = makeSymbol("WITH-TEMPLATE-TOPIC-PROBLEM-STORE");

    private static final SubLSymbol DESTROY_TEMPLATE_TOPIC_PROBLEM_STORE = makeSymbol("DESTROY-TEMPLATE-TOPIC-PROBLEM-STORE");

    static private final SubLSymbol $sym9$REUSED_ = makeUninternedSymbol("REUSED?");

    public static final SubLSymbol $template_topic_problem_store$ = makeSymbol("*TEMPLATE-TOPIC-PROBLEM-STORE*");

    static private final SubLList $list12 = list(makeSymbol("FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE"));

    static private final SubLList $list16 = list(list(makeSymbol("TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?")));

    static private final SubLList $list17 = list(list(makeSymbol("DESTROY-TEMPLATE-TOPIC-PROBLEM-STORE")));

    static private final SubLSymbol $sym18$TEMPLATE_TOPIC_PROBLEM_STORE_HAS_BROWSABLE_INFERENCE_ = makeSymbol("TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?");

    private static final SubLList $list20 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");

    private static final SubLList $list23 = list(list(makeSymbol("GET-TEMPLATE-TOPIC-MEMOIZATION-STATE")));

    private static final SubLList $list24 = list(list(makeSymbol("ELMT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $default_assertion_template_elmt$ = makeSymbol("*DEFAULT-ASSERTION-TEMPLATE-ELMT*");

    public static final SubLObject get_template_topic_memoization_state_alt() {
        return memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_template_topic_memoization_state() {
        return memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject with_candidate_replacements_auto_expand_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt1, bq_cons(PROGN, append(body, NIL)));
        }
    }

    public static SubLObject with_candidate_replacements_auto_expand(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, formula_template_vars.$list1, bq_cons(PROGN, append(body, NIL)));
    }

    public static final SubLObject with_candidate_replacements_auto_expand_value_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, list(list($formula_template_autoexpand_candidate_replacementsP$, value)), bq_cons(PROGN, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_candidate_replacements_auto_expand_value(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, formula_template_vars.$list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, formula_template_vars.$list3);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list(formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$, value)), bq_cons(PROGN, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, formula_template_vars.$list3);
        return NIL;
    }

    public static final SubLObject get_template_topic_problem_store_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($UNINITIALIZED == $template_topic_problem_store$.getDynamicValue(thread)) {
                return NIL;
            } else {
                if (NIL == com.cyc.cycjava.cycl.formula_template_vars.template_topic_problem_store_okP()) {
                    if (NIL != inference_datastructures_problem_store.problem_store_p($template_topic_problem_store$.getDynamicValue(thread))) {
                        com.cyc.cycjava.cycl.formula_template_vars.destroy_template_topic_problem_store(UNPROVIDED);
                    }
                    $template_topic_problem_store$.setDynamicValue(com.cyc.cycjava.cycl.formula_template_vars.new_template_topic_problem_store(), thread);
                }
            }
            return $template_topic_problem_store$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_template_topic_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($UNINITIALIZED == formula_template_vars.$template_topic_problem_store$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL == formula_template_vars.template_topic_problem_store_okP()) {
            if (NIL != inference_datastructures_problem_store.problem_store_p(formula_template_vars.$template_topic_problem_store$.getDynamicValue(thread))) {
                formula_template_vars.destroy_template_topic_problem_store(UNPROVIDED);
            }
            formula_template_vars.$template_topic_problem_store$.setDynamicValue(formula_template_vars.new_template_topic_problem_store(), thread);
        }
        return formula_template_vars.$template_topic_problem_store$.getDynamicValue(thread);
    }

    public static final SubLObject find_or_create_template_topic_problem_store_alt() {
        {
            SubLObject store = com.cyc.cycjava.cycl.formula_template_vars.get_template_topic_problem_store();
            SubLObject reusedP = list_utilities.sublisp_boolean(store);
            return values(NIL != store ? ((SubLObject) (store)) : com.cyc.cycjava.cycl.formula_template_vars.new_template_topic_problem_store(), reusedP);
        }
    }

    public static SubLObject find_or_create_template_topic_problem_store() {
        final SubLObject store = formula_template_vars.get_template_topic_problem_store();
        final SubLObject reusedP = list_utilities.sublisp_boolean(store);
        return values(NIL != store ? store : formula_template_vars.new_template_topic_problem_store(), reusedP);
    }

    public static final SubLObject new_template_topic_problem_store_alt() {
        {
            SubLObject store = inference_datastructures_problem_store.new_problem_store(UNPROVIDED);
            $template_topic_problem_stores$.setGlobalValue(cons(store, $template_topic_problem_stores$.getGlobalValue()));
            return store;
        }
    }

    public static SubLObject new_template_topic_problem_store() {
        final SubLObject store = inference_datastructures_problem_store.new_problem_store(UNPROVIDED);
        formula_template_vars.$template_topic_problem_stores$.setGlobalValue(cons(store, formula_template_vars.$template_topic_problem_stores$.getGlobalValue()));
        return store;
    }

    public static final SubLObject destroy_template_topic_problem_store_alt(SubLObject store) {
        if (store == UNPROVIDED) {
            store = $template_topic_problem_store$.getDynamicValue();
        }
        $template_topic_problem_stores$.setGlobalValue(delete(store, $template_topic_problem_stores$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return inference_datastructures_problem_store.destroy_problem_store(store);
    }

    public static SubLObject destroy_template_topic_problem_store(SubLObject store) {
        if (store == UNPROVIDED) {
            store = formula_template_vars.$template_topic_problem_store$.getDynamicValue();
        }
        formula_template_vars.$template_topic_problem_stores$.setGlobalValue(delete(store, formula_template_vars.$template_topic_problem_stores$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return inference_datastructures_problem_store.destroy_problem_store(store);
    }

    public static final SubLObject template_topic_problem_store_okP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return inference_datastructures_problem_store.valid_problem_store_p($template_topic_problem_store$.getDynamicValue(thread));
        }
    }

    public static SubLObject template_topic_problem_store_okP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_datastructures_problem_store.valid_problem_store_p(formula_template_vars.$template_topic_problem_store$.getDynamicValue(thread));
    }

    public static final SubLObject with_template_topic_problem_store_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject reusedP = $sym9$REUSED_;
            return list(CMULTIPLE_VALUE_BIND, list($template_topic_problem_store$, reusedP), $list_alt12, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(PUNLESS, listS(COR, reusedP, $list_alt16), $list_alt17)));
        }
    }

    public static SubLObject with_template_topic_problem_store(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject reusedP = formula_template_vars.$sym9$REUSED_;
        return list(CMULTIPLE_VALUE_BIND, list(formula_template_vars.$template_topic_problem_store$, reusedP), formula_template_vars.$list12, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(PUNLESS, listS(COR, reusedP, formula_template_vars.$list16), formula_template_vars.$list17)));
    }

    public static final SubLObject template_topic_problem_store_has_browsable_inferenceP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.formula_template_vars.problem_store_has_browsable_inferenceP($template_topic_problem_store$.getDynamicValue(thread));
        }
    }

    public static SubLObject template_topic_problem_store_has_browsable_inferenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return formula_template_vars.problem_store_has_browsable_inferenceP(formula_template_vars.$template_topic_problem_store$.getDynamicValue(thread));
    }

    /**
     *
     *
     * @return booleanp; Does STORE have any browsable inferences?
     */
    @LispMethod(comment = "@return booleanp; Does STORE have any browsable inferences?")
    public static final SubLObject problem_store_has_browsable_inferenceP_alt(SubLObject store) {
        {
            SubLObject ans = NIL;
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                {
                    SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                        {
                            SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                            SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                            SubLObject inference = NIL;
                            while ((NIL != id) && (NIL == ans)) {
                                inference = do_id_index_state_object(idx, $SKIP, id, state_var);
                                if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
                                    ans = inference_datastructures_inference.inference_browsableP(inference);
                                }
                                id = do_id_index_next_id(idx, NIL, id, state_var);
                                state_var = do_id_index_next_state(idx, NIL, id, state_var);
                            } 
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return booleanp; Does STORE have any browsable inferences?
     */
    @LispMethod(comment = "@return booleanp; Does STORE have any browsable inferences?")
    public static SubLObject problem_store_has_browsable_inferenceP(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$1 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$1);
                    final SubLObject backwardP_var = NIL;
                    final SubLObject length = length(vector_var);
                    SubLObject current;
                    final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                    SubLObject start = NIL;
                    SubLObject end = NIL;
                    SubLObject delta = NIL;
                    destructuring_bind_must_consp(current, datum, formula_template_vars.$list20);
                    start = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, formula_template_vars.$list20);
                    end = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, formula_template_vars.$list20);
                    delta = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == ans) {
                            SubLObject end_var;
                            SubLObject id;
                            SubLObject inference;
                            for (end_var = end, id = NIL, id = start; (NIL == ans) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                inference = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(inference)) {
                                        inference = $SKIP;
                                    }
                                    ans = inference_datastructures_inference.inference_browsableP(inference);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, formula_template_vars.$list20);
                    }
                }
                final SubLObject idx_$2 = idx;
                if ((NIL == id_index_sparse_objects_empty_p(idx_$2)) && (NIL == ans)) {
                    SubLObject catch_var = NIL;
                    try {
                        thread.throwStack.push(formula_template_vars.$DO_HASH_TABLE);
                        final SubLObject cdohash_table = id_index_sparse_objects(idx_$2);
                        SubLObject id2 = NIL;
                        SubLObject inference2 = NIL;
                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                id2 = getEntryKey(cdohash_entry);
                                inference2 = getEntryValue(cdohash_entry);
                                subl_macros.do_hash_table_done_check(ans);
                                ans = inference_datastructures_inference.inference_browsableP(inference2);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        catch_var = Errors.handleThrowable(ccatch_env_var, formula_template_vars.$DO_HASH_TABLE);
                    } finally {
                        thread.throwStack.pop();
                    }
                }
            }
        }
        return ans;
    }

    public static final SubLObject with_template_topic_memoization_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_MEMOIZATION_STATE, $list_alt21, append(body, NIL));
        }
    }

    public static SubLObject with_template_topic_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_MEMOIZATION_STATE, formula_template_vars.$list23, append(body, NIL));
    }

    public static final SubLObject with_default_assertion_template_elmt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject elmt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    elmt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($default_assertion_template_elmt$, elmt)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt22);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_default_assertion_template_elmt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, formula_template_vars.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject elmt = NIL;
        destructuring_bind_must_consp(current, datum, formula_template_vars.$list24);
        elmt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list(formula_template_vars.$default_assertion_template_elmt$, elmt)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, formula_template_vars.$list24);
        return NIL;
    }

    public static SubLObject declare_formula_template_vars_file() {
        declareFunction("get_template_topic_memoization_state", "GET-TEMPLATE-TOPIC-MEMOIZATION-STATE", 0, 0, false);
        declareMacro("with_candidate_replacements_auto_expand", "WITH-CANDIDATE-REPLACEMENTS-AUTO-EXPAND");
        declareMacro("with_candidate_replacements_auto_expand_value", "WITH-CANDIDATE-REPLACEMENTS-AUTO-EXPAND-VALUE");
        declareFunction("get_template_topic_problem_store", "GET-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 0, false);
        declareFunction("find_or_create_template_topic_problem_store", "FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 0, false);
        declareFunction("new_template_topic_problem_store", "NEW-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 0, false);
        declareFunction("destroy_template_topic_problem_store", "DESTROY-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 1, false);
        declareFunction("template_topic_problem_store_okP", "TEMPLATE-TOPIC-PROBLEM-STORE-OK?", 0, 0, false);
        declareMacro("with_template_topic_problem_store", "WITH-TEMPLATE-TOPIC-PROBLEM-STORE");
        declareFunction("template_topic_problem_store_has_browsable_inferenceP", "TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?", 0, 0, false);
        declareFunction("problem_store_has_browsable_inferenceP", "PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?", 1, 0, false);
        declareMacro("with_template_topic_memoization", "WITH-TEMPLATE-TOPIC-MEMOIZATION");
        declareMacro("with_default_assertion_template_elmt", "WITH-DEFAULT-ASSERTION-TEMPLATE-ELMT");
        return NIL;
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*"), T));

    static private final SubLList $list_alt3 = list(list(makeSymbol("VALUE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject init_formula_template_vars_file() {
        deflexical("*TEMPLATE-TOPIC-MEMOIZATION*", memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defparameter("*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*", NIL);
        defparameter("*TEMPLATE-TOPIC-PROBLEM-STORE*", $UNINITIALIZED);
        deflexical("*TEMPLATE-TOPIC-PROBLEM-STORES*", NIL);
        deflexical("*USE-FORMULA-TEMPLATE-CANDIDATE-REPLACEMENTS-AUTO-EXPAND*", T);
        defparameter("*DEFAULT-ASSERTION-TEMPLATE-ELMT*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt12 = list(makeSymbol("FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE"));

    public static SubLObject setup_formula_template_vars_file() {
        register_macro_helper(formula_template_vars.FIND_OR_CREATE_TEMPLATE_TOPIC_PROBLEM_STORE, formula_template_vars.WITH_TEMPLATE_TOPIC_PROBLEM_STORE);
        register_macro_helper(formula_template_vars.DESTROY_TEMPLATE_TOPIC_PROBLEM_STORE, formula_template_vars.WITH_TEMPLATE_TOPIC_PROBLEM_STORE);
        register_macro_helper(formula_template_vars.$sym18$TEMPLATE_TOPIC_PROBLEM_STORE_HAS_BROWSABLE_INFERENCE_, formula_template_vars.WITH_TEMPLATE_TOPIC_PROBLEM_STORE);
        return NIL;
    }

    static private final SubLList $list_alt16 = list(list(makeSymbol("TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?")));

    static private final SubLList $list_alt17 = list(list(makeSymbol("DESTROY-TEMPLATE-TOPIC-PROBLEM-STORE")));

    @Override
    public void declareFunctions() {
        formula_template_vars.declare_formula_template_vars_file();
    }

    static private final SubLList $list_alt21 = list(list(makeSymbol("GET-TEMPLATE-TOPIC-MEMOIZATION-STATE")));

    @Override
    public void initializeVariables() {
        formula_template_vars.init_formula_template_vars_file();
    }

    static private final SubLList $list_alt22 = list(list(makeSymbol("ELMT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    @Override
    public void runTopLevelForms() {
        formula_template_vars.setup_formula_template_vars_file();
    }

    
}

/**
 * Total time: 166 ms
 */
