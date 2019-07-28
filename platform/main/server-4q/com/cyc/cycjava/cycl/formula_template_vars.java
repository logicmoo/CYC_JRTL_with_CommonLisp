package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.formula_template_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.formula_template_vars.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class formula_template_vars extends SubLTranslatedFile {
    public static final SubLFile me = new formula_template_vars();

    public static final String myName = "com.cyc.cycjava.cycl.formula_template_vars";

    public static final String myFingerPrint = "c0e085f4caa2fd7f4ef2b995742da4895488ddf4ac910e77bd8d008d2dd0991d";

    // deflexical
    public static final SubLSymbol $template_topic_memoization$ = makeSymbol("*TEMPLATE-TOPIC-MEMOIZATION*");

    // defparameter
    public static final SubLSymbol $formula_template_autoexpand_candidate_replacementsP$ = makeSymbol("*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*");



    // deflexical
    // Keep track of all such stores.
    private static final SubLSymbol $template_topic_problem_stores$ = makeSymbol("*TEMPLATE-TOPIC-PROBLEM-STORES*");

    // deflexical
    public static final SubLSymbol $use_formula_template_candidate_replacements_auto_expand$ = makeSymbol("*USE-FORMULA-TEMPLATE-CANDIDATE-REPLACEMENTS-AUTO-EXPAND*");





    public static final SubLList $list1 = list(list(makeSymbol("*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*"), T));



    public static final SubLList $list3 = list(list(makeSymbol("VALUE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym4$_FORMULA_TEMPLATE_AUTOEXPAND_CANDIDATE_REPLACEMENTS__ = makeSymbol("*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*");



    public static final SubLSymbol FIND_OR_CREATE_TEMPLATE_TOPIC_PROBLEM_STORE = makeSymbol("FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE");

    public static final SubLSymbol WITH_TEMPLATE_TOPIC_PROBLEM_STORE = makeSymbol("WITH-TEMPLATE-TOPIC-PROBLEM-STORE");

    public static final SubLSymbol DESTROY_TEMPLATE_TOPIC_PROBLEM_STORE = makeSymbol("DESTROY-TEMPLATE-TOPIC-PROBLEM-STORE");

    public static final SubLSymbol $sym9$REUSED_ = makeUninternedSymbol("REUSED?");



    public static final SubLSymbol $template_topic_problem_store$ = makeSymbol("*TEMPLATE-TOPIC-PROBLEM-STORE*");

    public static final SubLList $list12 = list(makeSymbol("FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE"));







    public static final SubLList $list16 = list(list(makeSymbol("TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?")));

    public static final SubLList $list17 = list(list(makeSymbol("DESTROY-TEMPLATE-TOPIC-PROBLEM-STORE")));

    public static final SubLSymbol $sym18$TEMPLATE_TOPIC_PROBLEM_STORE_HAS_BROWSABLE_INFERENCE_ = makeSymbol("TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?");



    private static final SubLList $list20 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");



    private static final SubLList $list23 = list(list(makeSymbol("GET-TEMPLATE-TOPIC-MEMOIZATION-STATE")));

    private static final SubLList $list24 = list(list(makeSymbol("ELMT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $default_assertion_template_elmt$ = makeSymbol("*DEFAULT-ASSERTION-TEMPLATE-ELMT*");

    public static SubLObject get_template_topic_memoization_state() {
        return memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject with_candidate_replacements_auto_expand(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list1, bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject with_candidate_replacements_auto_expand_value(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list($sym4$_FORMULA_TEMPLATE_AUTOEXPAND_CANDIDATE_REPLACEMENTS__, value)), bq_cons(PROGN, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static SubLObject get_template_topic_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($UNINITIALIZED == $template_topic_problem_store$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL == template_topic_problem_store_okP()) {
            if (NIL != inference_datastructures_problem_store.problem_store_p($template_topic_problem_store$.getDynamicValue(thread))) {
                destroy_template_topic_problem_store(UNPROVIDED);
            }
            $template_topic_problem_store$.setDynamicValue(new_template_topic_problem_store(), thread);
        }
        return $template_topic_problem_store$.getDynamicValue(thread);
    }

    public static SubLObject find_or_create_template_topic_problem_store() {
        final SubLObject store = get_template_topic_problem_store();
        final SubLObject reusedP = list_utilities.sublisp_boolean(store);
        return values(NIL != store ? store : new_template_topic_problem_store(), reusedP);
    }

    public static SubLObject new_template_topic_problem_store() {
        final SubLObject store = inference_datastructures_problem_store.new_problem_store(UNPROVIDED);
        $template_topic_problem_stores$.setGlobalValue(cons(store, $template_topic_problem_stores$.getGlobalValue()));
        return store;
    }

    public static SubLObject destroy_template_topic_problem_store(SubLObject store) {
        if (store == UNPROVIDED) {
            store = $template_topic_problem_store$.getDynamicValue();
        }
        $template_topic_problem_stores$.setGlobalValue(delete(store, $template_topic_problem_stores$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return inference_datastructures_problem_store.destroy_problem_store(store);
    }

    public static SubLObject template_topic_problem_store_okP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_datastructures_problem_store.valid_problem_store_p($template_topic_problem_store$.getDynamicValue(thread));
    }

    public static SubLObject with_template_topic_problem_store(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject reusedP = $sym9$REUSED_;
        return list(CMULTIPLE_VALUE_BIND, list($template_topic_problem_store$, reusedP), $list12, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(PUNLESS, listS(COR, reusedP, $list16), $list17)));
    }

    public static SubLObject template_topic_problem_store_has_browsable_inferenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return problem_store_has_browsable_inferenceP($template_topic_problem_store$.getDynamicValue(thread));
    }

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
                    destructuring_bind_must_consp(current, datum, $list20);
                    start = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list20);
                    end = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list20);
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
                        cdestructuring_bind_error(datum, $list20);
                    }
                }
                final SubLObject idx_$2 = idx;
                if ((NIL == id_index_sparse_objects_empty_p(idx_$2)) && (NIL == ans)) {
                    SubLObject catch_var = NIL;
                    try {
                        thread.throwStack.push($DO_HASH_TABLE);
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
                        catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                    } finally {
                        thread.throwStack.pop();
                    }
                }
            }
        }
        return ans;
    }

    public static SubLObject with_template_topic_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_MEMOIZATION_STATE, $list23, append(body, NIL));
    }

    public static SubLObject with_default_assertion_template_elmt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject elmt = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        elmt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($default_assertion_template_elmt$, elmt)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list24);
        return NIL;
    }

    public static SubLObject declare_formula_template_vars_file() {
        declareFunction(me, "get_template_topic_memoization_state", "GET-TEMPLATE-TOPIC-MEMOIZATION-STATE", 0, 0, false);
        declareMacro(me, "with_candidate_replacements_auto_expand", "WITH-CANDIDATE-REPLACEMENTS-AUTO-EXPAND");
        declareMacro(me, "with_candidate_replacements_auto_expand_value", "WITH-CANDIDATE-REPLACEMENTS-AUTO-EXPAND-VALUE");
        declareFunction(me, "get_template_topic_problem_store", "GET-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 0, false);
        declareFunction(me, "find_or_create_template_topic_problem_store", "FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 0, false);
        declareFunction(me, "new_template_topic_problem_store", "NEW-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 0, false);
        declareFunction(me, "destroy_template_topic_problem_store", "DESTROY-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 1, false);
        declareFunction(me, "template_topic_problem_store_okP", "TEMPLATE-TOPIC-PROBLEM-STORE-OK?", 0, 0, false);
        declareMacro(me, "with_template_topic_problem_store", "WITH-TEMPLATE-TOPIC-PROBLEM-STORE");
        declareFunction(me, "template_topic_problem_store_has_browsable_inferenceP", "TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?", 0, 0, false);
        declareFunction(me, "problem_store_has_browsable_inferenceP", "PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?", 1, 0, false);
        declareMacro(me, "with_template_topic_memoization", "WITH-TEMPLATE-TOPIC-MEMOIZATION");
        declareMacro(me, "with_default_assertion_template_elmt", "WITH-DEFAULT-ASSERTION-TEMPLATE-ELMT");
        return NIL;
    }

    public static SubLObject init_formula_template_vars_file() {
        deflexical("*TEMPLATE-TOPIC-MEMOIZATION*", memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defparameter("*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*", NIL);
        defparameter("*TEMPLATE-TOPIC-PROBLEM-STORE*", $UNINITIALIZED);
        deflexical("*TEMPLATE-TOPIC-PROBLEM-STORES*", NIL);
        deflexical("*USE-FORMULA-TEMPLATE-CANDIDATE-REPLACEMENTS-AUTO-EXPAND*", T);
        defparameter("*DEFAULT-ASSERTION-TEMPLATE-ELMT*", NIL);
        return NIL;
    }

    public static SubLObject setup_formula_template_vars_file() {
        register_macro_helper(FIND_OR_CREATE_TEMPLATE_TOPIC_PROBLEM_STORE, WITH_TEMPLATE_TOPIC_PROBLEM_STORE);
        register_macro_helper(DESTROY_TEMPLATE_TOPIC_PROBLEM_STORE, WITH_TEMPLATE_TOPIC_PROBLEM_STORE);
        register_macro_helper($sym18$TEMPLATE_TOPIC_PROBLEM_STORE_HAS_BROWSABLE_INFERENCE_, WITH_TEMPLATE_TOPIC_PROBLEM_STORE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_formula_template_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_formula_template_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_formula_template_vars_file();
    }

    static {

































    }
}

/**
 * Total time: 166 ms
 */
