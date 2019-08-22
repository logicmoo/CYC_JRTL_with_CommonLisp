/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
 * module:      HL-MACROS
 * source file: /cyc/top/cycl/hl-macros.lisp
 * created:     2019/07/03 17:37:19
 */
public final class hl_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new hl_macros();

 public static final String myName = "com.cyc.cycjava.cycl.hl_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("FORM"));

    public static final SubLSymbol $recording_hl_transcript_operationsP$ = makeSymbol("*RECORDING-HL-TRANSCRIPT-OPERATIONS?*");

    private static final SubLSymbol RECORD_HL_TRANSCRIPT_OPERATION = makeSymbol("RECORD-HL-TRANSCRIPT-OPERATION");

    private static final SubLList $list4 = list(list(makeSymbol("FORT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("FORM"));

    public static final SubLSymbol $forts_being_removed$ = makeSymbol("*FORTS-BEING-REMOVED*");

    private static final SubLList $list8 = list(makeSymbol("*FORTS-BEING-REMOVED*"));

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");



    private static final SubLList $list11 = list(list(makeSymbol("METRIC-TYPE"), makeSymbol("METRIC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym12$OUTERMOST_INIT_ = makeUninternedSymbol("OUTERMOST-INIT?");

    private static final SubLList $list13 = list(list(makeSymbol("NULL"), makeSymbol("*FORWARD-INFERENCE-LAST-METRIC-TIME*")));

    private static final SubLSymbol $forward_inference_last_metric_time$ = makeSymbol("*FORWARD-INFERENCE-LAST-METRIC-TIME*");

    private static final SubLList $list17 = list(list(makeSymbol("INITIAL-FORWARD-INFERENCE-METRIC-TIME")), makeSymbol("*FORWARD-INFERENCE-LAST-METRIC-TIME*"));

    private static final SubLSymbol POSSIBLY_WITH_FORWARD_INFERENCE_METRIC_PROFILING = makeSymbol("POSSIBLY-WITH-FORWARD-INFERENCE-METRIC-PROFILING");

    private static final SubLList $list19 = list(makeKeyword("NO-GAF"), makeKeyword("NO-RULE"));

    private static final SubLList $list22 = list(list(makeSymbol("CSETQ"), makeSymbol("*FORWARD-INFERENCE-LAST-METRIC-TIME*"), list(makeSymbol("INITIAL-FORWARD-INFERENCE-METRIC-TIME"))));

    private static final SubLList $list23 = list(list(makeSymbol("METRIC-TYPE"), makeSymbol("METRIC"), makeSymbol("&OPTIONAL"), makeSymbol("GAF"), makeSymbol("RULE"), makeSymbol("COUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym24$LAST_METRIC_TYPE = makeUninternedSymbol("LAST-METRIC-TYPE");

    private static final SubLSymbol $sym25$LAST_METRIC = makeUninternedSymbol("LAST-METRIC");

    private static final SubLSymbol $sym26$LAST_GAF = makeUninternedSymbol("LAST-GAF");

    private static final SubLSymbol $sym27$LAST_RULE = makeUninternedSymbol("LAST-RULE");

    private static final SubLList $list28 = list(makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-METRIC-TYPE*"));

    private static final SubLList $list29 = list(makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-METRIC*"));

    private static final SubLList $list30 = list(makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-GAF*"));

    private static final SubLList $list31 = list(makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-RULE*"));

    private static final SubLSymbol INCREMENT_FORWARD_INFERENCE_METRICS = makeSymbol("INCREMENT-FORWARD-INFERENCE-METRICS");

    private static final SubLList $list34 = list(ZERO_INTEGER);

    public static final SubLSymbol $forward_inference_metric_last_metric_type$ = makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-METRIC-TYPE*");

    public static final SubLSymbol $forward_inference_metric_last_metric$ = makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-METRIC*");

    public static final SubLSymbol $forward_inference_metric_last_forward_inference_gaf$ = makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-GAF*");

    public static final SubLSymbol $forward_inference_metric_last_forward_inference_rule$ = makeSymbol("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-RULE*");

    // Definitions
    public static final SubLObject possibly_record_hl_transcript_operation_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject form = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            form = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PWHEN, $recording_hl_transcript_operationsP$, list(RECORD_HL_TRANSCRIPT_OPERATION, form));
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject possibly_record_hl_transcript_operation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        form = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, $recording_hl_transcript_operationsP$, list(RECORD_HL_TRANSCRIPT_OPERATION, form));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject note_fort_being_removed(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        fort = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($forts_being_removed$, listS(CONS, fort, $list8))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    public static SubLObject some_fort_being_removedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($forts_being_removed$.getDynamicValue(thread));
    }

    public static SubLObject fort_being_removedP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.member_kbeqP(fort, $forts_being_removed$.getDynamicValue(thread));
    }

    public static SubLObject forts_being_removed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($forts_being_removed$.getDynamicValue(thread));
    }

    public static SubLObject forts_that_will_be_removed() {
        SubLObject forts_to_process = forts_being_removed();
        SubLObject result = forts_being_removed();
        while (NIL != forts_to_process) {
            final SubLObject fort_to_process = forts_to_process.first();
            forts_to_process = forts_to_process.rest();
            final SubLObject item_var = fort_to_process;
            if (NIL == member(item_var, result, symbol_function(KBEQ), symbol_function(IDENTITY))) {
                result = cons(item_var, result);
            }
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(fort_to_process, $$termDependsOn, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject dependent_term = NIL;
            dependent_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == list_utilities.member_kbeqP(dependent_term, result)) {
                    final SubLObject item_var2 = dependent_term;
                    if (NIL == member(item_var2, forts_to_process, symbol_function(EQL), symbol_function(IDENTITY))) {
                        forts_to_process = cons(item_var2, forts_to_process);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                dependent_term = cdolist_list_var.first();
            } 
        } 
        return result;
    }

    public static SubLObject fort_being_removed_or_will_be_removedP(final SubLObject fort) {
        return makeBoolean((NIL != fort_being_removedP(fort)) || (NIL != list_utilities.member_kbeqP(fort, forts_that_will_be_removed())));
    }

    public static SubLObject with_forward_inference_metric_profiling_initialized(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject metric_type = NIL;
        SubLObject metric = NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        metric_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        metric = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject outermost_initP = $sym12$OUTERMOST_INIT_;
            return list(CLET, list(bq_cons(outermost_initP, $list13)), list(CUNWIND_PROTECT, list(CLET, list(list($forward_inference_last_metric_time$, listS(FIF, outermost_initP, $list17))), list(POSSIBLY_WITH_FORWARD_INFERENCE_METRIC_PROFILING, listS(metric_type, metric, $list19), bq_cons(PROGN, append(body, NIL)))), listS(PUNLESS, outermost_initP, $list22)));
        }
        cdestructuring_bind_error(datum, $list11);
        return NIL;
    }

    public static SubLObject possibly_with_forward_inference_metric_profiling(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject metric_type = NIL;
        SubLObject metric = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        metric_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        metric = current.first();
        current = current.rest();
        final SubLObject gaf = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject rule = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        final SubLObject count = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list23);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject last_metric_type = $sym24$LAST_METRIC_TYPE;
            final SubLObject last_metric = $sym25$LAST_METRIC;
            final SubLObject last_gaf = $sym26$LAST_GAF;
            final SubLObject last_rule = $sym27$LAST_RULE;
            return list(CLET, list(bq_cons(last_metric_type, $list28), bq_cons(last_metric, $list29), bq_cons(last_gaf, $list30), bq_cons(last_rule, $list31)), list(PWHEN, list(CAND, last_metric_type, last_metric), listS(INCREMENT_FORWARD_INFERENCE_METRICS, last_metric_type, last_metric, last_gaf, last_rule, $list34)), list(CLET, list(list($forward_inference_metric_last_metric_type$, metric_type), list($forward_inference_metric_last_metric$, metric), list($forward_inference_metric_last_forward_inference_gaf$, gaf), list($forward_inference_metric_last_forward_inference_rule$, rule)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(INCREMENT_FORWARD_INFERENCE_METRICS, metric_type, metric, gaf, rule, count))));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject declare_hl_macros_file() {
        declareMacro("possibly_record_hl_transcript_operation", "POSSIBLY-RECORD-HL-TRANSCRIPT-OPERATION");
        declareMacro("note_fort_being_removed", "NOTE-FORT-BEING-REMOVED");
        declareFunction("some_fort_being_removedP", "SOME-FORT-BEING-REMOVED?", 0, 0, false);
        declareFunction("fort_being_removedP", "FORT-BEING-REMOVED?", 1, 0, false);
        declareFunction("forts_being_removed", "FORTS-BEING-REMOVED", 0, 0, false);
        declareFunction("forts_that_will_be_removed", "FORTS-THAT-WILL-BE-REMOVED", 0, 0, false);
        declareFunction("fort_being_removed_or_will_be_removedP", "FORT-BEING-REMOVED-OR-WILL-BE-REMOVED?", 1, 0, false);
        declareMacro("with_forward_inference_metric_profiling_initialized", "WITH-FORWARD-INFERENCE-METRIC-PROFILING-INITIALIZED");
        declareMacro("possibly_with_forward_inference_metric_profiling", "POSSIBLY-WITH-FORWARD-INFERENCE-METRIC-PROFILING");
        return NIL;
    }

    public static SubLObject init_hl_macros_file() {
        defparameter("*FORTS-BEING-REMOVED*", NIL);
        defparameter("*FORWARD-INFERENCE-METRIC-LAST-METRIC-TYPE*", NIL);
        defparameter("*FORWARD-INFERENCE-METRIC-LAST-METRIC*", NIL);
        defparameter("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-GAF*", NIL);
        defparameter("*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-RULE*", NIL);
        return NIL;
    }

    public static SubLObject setup_hl_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_hl_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_hl_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hl_macros_file();
    }

    
}

/**
 * Total time: 124 ms
 */
