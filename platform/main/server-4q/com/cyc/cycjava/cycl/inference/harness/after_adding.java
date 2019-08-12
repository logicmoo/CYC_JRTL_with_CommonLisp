/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      AFTER-ADDING
 * source file: /cyc/top/cycl/inference/harness/after-adding.lisp
 * created:     2019/07/03 17:37:37
 */
public final class after_adding extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new after_adding();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.after_adding";


    // defparameter
    // Definitions
    /**
     * Set this to T if you want to see errors caused by afterAddings instead of
     * catching them
     */
    @LispMethod(comment = "Set this to T if you want to see errors caused by afterAddings instead of\r\ncatching them\ndefparameter\nSet this to T if you want to see errors caused by afterAddings instead of\ncatching them")
    public static final SubLSymbol $debug_after_addingsP$ = makeSymbol("*DEBUG-AFTER-ADDINGS?*");

    // deflexical
    /**
     * The predicates whose extent implement the afterAdding and afterRemoving
     * support.
     */
    @LispMethod(comment = "The predicates whose extent implement the afterAdding and afterRemoving\r\nsupport.\ndeflexical\nThe predicates whose extent implement the afterAdding and afterRemoving\nsupport.")
    public static final SubLSymbol $gaf_after_adding_predicates$ = makeSymbol("*GAF-AFTER-ADDING-PREDICATES*");

    // defparameter
    // When non-nil, afterAddings are disabled.
    /**
     * When non-nil, afterAddings are disabled.
     */
    @LispMethod(comment = "When non-nil, afterAddings are disabled.\ndefparameter")
    public static final SubLSymbol $after_addings_disabledP$ = makeSymbol("*AFTER-ADDINGS-DISABLED?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("afterAdding"), reader_make_constant_shell("afterRemoving"));

    public static final SubLSymbol $gaf_after_addings_hash$ = makeSymbol("*GAF-AFTER-ADDINGS-HASH*");

    public static final SubLSymbol $gaf_after_removings_hash$ = makeSymbol("*GAF-AFTER-REMOVINGS-HASH*");

    static private final SubLList $list4 = list(list(makeSymbol("*AFTER-ADDINGS-DISABLED?*"), T));

    static private final SubLList $list7 = cons(makeSymbol("FUN"), makeSymbol("FUN-MT"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");





    private static final SubLList $list16 = list(makeSymbol("GAF-AFTER-ADDING-PRED"), makeSymbol("PRED"), makeSymbol("GAF-AFTER-ADDING"));



    private static final SubLList $list18 = list(makeSymbol("GAF-AFTER-REMOVING-PRED"), makeSymbol("PRED"), makeSymbol("GAF-AFTER-REMOVING"));

    private static final SubLSymbol PROPAGATE_GAF_AFTER_ADDING = makeSymbol("PROPAGATE-GAF-AFTER-ADDING");

    private static final SubLSymbol RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");

    private static final SubLSymbol REPROPAGATE_GAF_AFTER_ADDING_INTERNAL = makeSymbol("REPROPAGATE-GAF-AFTER-ADDING-INTERNAL");

    public static final SubLObject clear_after_addings_alt() {
        com.cyc.cycjava.cycl.inference.harness.after_adding.clear_gaf_after_addings();
        rule_after_adding.clear_rule_after_addings();
        return NIL;
    }

    public static SubLObject clear_after_addings() {
        clear_gaf_after_addings();
        rule_after_adding.clear_rule_after_addings();
        return NIL;
    }

    public static final SubLObject clear_gaf_after_addings_alt() {
        if (NIL != $gaf_after_addings_hash$.getGlobalValue()) {
            clrhash($gaf_after_addings_hash$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject clear_gaf_after_addings() {
        if (NIL != $gaf_after_addings_hash$.getGlobalValue()) {
            clrhash($gaf_after_addings_hash$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject clear_after_removings_alt() {
        com.cyc.cycjava.cycl.inference.harness.after_adding.clear_gaf_after_removings();
        rule_after_adding.clear_rule_after_removings();
        return NIL;
    }

    public static SubLObject clear_after_removings() {
        clear_gaf_after_removings();
        rule_after_adding.clear_rule_after_removings();
        return NIL;
    }

    public static final SubLObject clear_gaf_after_removings_alt() {
        if (NIL != $gaf_after_removings_hash$.getGlobalValue()) {
            clrhash($gaf_after_removings_hash$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject clear_gaf_after_removings() {
        if (NIL != $gaf_after_removings_hash$.getGlobalValue()) {
            clrhash($gaf_after_removings_hash$.getGlobalValue());
        }
        return NIL;
    }

    /**
     * Execute BODY with all afterAddings (gaf and rule) disabled.
     * This is normally only used for bootstrapping.
     */
    @LispMethod(comment = "Execute BODY with all afterAddings (gaf and rule) disabled.\r\nThis is normally only used for bootstrapping.\nExecute BODY with all afterAddings (gaf and rule) disabled.\nThis is normally only used for bootstrapping.")
    public static final SubLObject disable_after_addings_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt4, append(body, NIL));
        }
    }

    /**
     * Execute BODY with all afterAddings (gaf and rule) disabled.
     * This is normally only used for bootstrapping.
     */
    @LispMethod(comment = "Execute BODY with all afterAddings (gaf and rule) disabled.\r\nThis is normally only used for bootstrapping.\nExecute BODY with all afterAddings (gaf and rule) disabled.\nThis is normally only used for bootstrapping.")
    public static SubLObject disable_after_addings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    public static final SubLObject handle_after_addings_alt(SubLObject argument, SubLObject assertion) {
        com.cyc.cycjava.cycl.inference.harness.after_adding.handle_gaf_after_addings(argument, assertion);
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            rule_after_adding.handle_rule_after_addings(argument, assertion);
        }
        return NIL;
    }

    public static SubLObject handle_after_addings(final SubLObject argument, final SubLObject assertion) {
        handle_gaf_after_addings(argument, assertion);
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            rule_after_adding.handle_rule_after_addings(argument, assertion);
        }
        return NIL;
    }

    public static final SubLObject handle_gaf_after_addings_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(argument, ARGUMENT_P);
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            if (NIL == $after_addings_disabledP$.getDynamicValue(thread)) {
                if (NIL != assertions_high.gaf_assertionP(assertion)) {
                    {
                        SubLObject pred = assertions_high.gaf_arg(assertion, ZERO_INTEGER);
                        SubLObject mt = assertions_high.assertion_mt(assertion);
                        if (NIL != forts.fort_p(pred)) {
                            {
                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        {
                                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.after_adding.get_gaf_after_addings(pred);
                                            SubLObject info = NIL;
                                            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = info;
                                                    SubLObject current = datum;
                                                    SubLObject fun = NIL;
                                                    SubLObject fun_mt = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt7);
                                                    fun = current.first();
                                                    current = current.rest();
                                                    fun_mt = current;
                                                    if (fun.isFunctionSpec() && (NIL != mt_relevance_macros.relevant_mtP(fun_mt))) {
                                                        if (NIL == $debug_after_addingsP$.getDynamicValue(thread)) {
                                                            {
                                                                SubLObject ignore_errors_tag = NIL;
                                                                try {
                                                                    {
                                                                        SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                                                        try {
                                                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                            try {
                                                                                com.cyc.cycjava.cycl.inference.harness.after_adding.handle_gaf_after_adding(fun, argument, assertion);
                                                                            } catch (Throwable catch_var) {
                                                                                Errors.handleThrowable(catch_var, NIL);
                                                                            }
                                                                        } finally {
                                                                            Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                                                        }
                                                                    }
                                                                } catch (Throwable ccatch_env_var) {
                                                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                                }
                                                            }
                                                        } else {
                                                            com.cyc.cycjava.cycl.inference.harness.after_adding.handle_gaf_after_adding(fun, argument, assertion);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject handle_gaf_after_addings(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if ((NIL == $after_addings_disabledP$.getDynamicValue(thread)) && (NIL != assertions_high.gaf_assertionP(assertion))) {
            final SubLObject pred = assertions_high.gaf_arg(assertion, ZERO_INTEGER);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL != forts.fort_p(pred)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject cdolist_list_var = get_gaf_after_addings(pred);
                    SubLObject info = NIL;
                    info = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = info;
                        SubLObject fun = NIL;
                        SubLObject fun_mt = NIL;
                        destructuring_bind_must_consp(current, datum, $list7);
                        fun = current.first();
                        current = fun_mt = current.rest();
                        if (fun.isFunctionSpec() && (NIL != mt_relevance_macros.relevant_mtP(fun_mt))) {
                            if (NIL == $debug_after_addingsP$.getDynamicValue(thread)) {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                                            final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                                            final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                                            final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                                            if ((NIL != last_metric_type) && (NIL != last_metric)) {
                                                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
                                            }
                                            final SubLObject _prev_bind_0_$2 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$3 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$4 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                                            final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                                            try {
                                                hl_macros.$forward_inference_metric_last_metric_type$.bind($AFTER_ADDING, thread);
                                                hl_macros.$forward_inference_metric_last_metric$.bind(fun, thread);
                                                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                                                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                                                try {
                                                    handle_gaf_after_adding(fun, argument, assertion);
                                                } finally {
                                                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        inference_metrics.increment_forward_inference_metrics($AFTER_ADDING, fun, NIL, NIL, NIL);
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                                    }
                                                }
                                            } finally {
                                                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                                                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$4, thread);
                                                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$3, thread);
                                                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$2, thread);
                                            }
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                            } else {
                                final SubLObject last_metric_type2 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                                final SubLObject last_metric2 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                                final SubLObject last_gaf2 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                                final SubLObject last_rule2 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                                if ((NIL != last_metric_type2) && (NIL != last_metric2)) {
                                    inference_metrics.increment_forward_inference_metrics(last_metric_type2, last_metric2, last_gaf2, last_rule2, ZERO_INTEGER);
                                }
                                final SubLObject _prev_bind_0_$4 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$5 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                                try {
                                    hl_macros.$forward_inference_metric_last_metric_type$.bind($AFTER_ADDING, thread);
                                    hl_macros.$forward_inference_metric_last_metric$.bind(fun, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                                    try {
                                        handle_gaf_after_adding(fun, argument, assertion);
                                    } finally {
                                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            inference_metrics.increment_forward_inference_metrics($AFTER_ADDING, fun, NIL, NIL, NIL);
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                } finally {
                                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_5, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$5, thread);
                                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$4, thread);
                                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        info = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject handle_after_removings_alt(SubLObject argument, SubLObject assertion) {
        com.cyc.cycjava.cycl.inference.harness.after_adding.handle_gaf_after_removings(argument, assertion);
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            rule_after_adding.handle_rule_after_removings(argument, assertion);
        }
        return NIL;
    }

    public static SubLObject handle_after_removings(final SubLObject argument, final SubLObject assertion) {
        handle_gaf_after_removings(argument, assertion);
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            rule_after_adding.handle_rule_after_removings(argument, assertion);
        }
        return NIL;
    }

    public static final SubLObject handle_gaf_after_removings_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(argument, ARGUMENT_P);
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject pred = assertions_high.gaf_arg(assertion, ZERO_INTEGER);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    if (NIL != forts.fort_p(pred)) {
                        {
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.after_adding.get_gaf_after_removings(pred);
                                        SubLObject info = NIL;
                                        for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum = info;
                                                SubLObject current = datum;
                                                SubLObject fun = NIL;
                                                SubLObject fun_mt = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt7);
                                                fun = current.first();
                                                current = current.rest();
                                                fun_mt = current;
                                                if (fun.isFunctionSpec() && (NIL != mt_relevance_macros.relevant_mtP(fun_mt))) {
                                                    if (NIL == $debug_after_addingsP$.getDynamicValue(thread)) {
                                                        {
                                                            SubLObject ignore_errors_tag = NIL;
                                                            try {
                                                                {
                                                                    SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                                                                    try {
                                                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                        try {
                                                                            com.cyc.cycjava.cycl.inference.harness.after_adding.handle_gaf_after_removing(fun, argument, assertion);
                                                                        } catch (Throwable catch_var) {
                                                                            Errors.handleThrowable(catch_var, NIL);
                                                                        }
                                                                    } finally {
                                                                        Errors.$error_handler$.rebind(_prev_bind_0_2, thread);
                                                                    }
                                                                }
                                                            } catch (Throwable ccatch_env_var) {
                                                                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                            }
                                                        }
                                                    } else {
                                                        com.cyc.cycjava.cycl.inference.harness.after_adding.handle_gaf_after_removing(fun, argument, assertion);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject handle_gaf_after_removings(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_arg(assertion, ZERO_INTEGER);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL != forts.fort_p(pred)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject cdolist_list_var = get_gaf_after_removings(pred);
                    SubLObject info = NIL;
                    info = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = info;
                        SubLObject fun = NIL;
                        SubLObject fun_mt = NIL;
                        destructuring_bind_must_consp(current, datum, $list7);
                        fun = current.first();
                        current = fun_mt = current.rest();
                        if (fun.isFunctionSpec() && (NIL != mt_relevance_macros.relevant_mtP(fun_mt))) {
                            if (NIL == $debug_after_addingsP$.getDynamicValue(thread)) {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            handle_gaf_after_removing(fun, argument, assertion);
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                            } else {
                                handle_gaf_after_removing(fun, argument, assertion);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        info = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject get_gaf_after_addings_alt(SubLObject pred) {
        if (NIL == $gaf_after_addings_hash$.getGlobalValue()) {
            com.cyc.cycjava.cycl.inference.harness.after_adding.initialize_gaf_after_addings_hash();
        }
        {
            SubLObject result = gethash_without_values(pred, $gaf_after_addings_hash$.getGlobalValue(), NIL);
            if (NIL != somewhere_cache.somewhere_cached_pred_p(pred)) {
                result = cons(somewhere_cache.$somewhere_cache_gaf_after_adding_info$.getGlobalValue(), result);
            }
            return result;
        }
    }

    public static SubLObject get_gaf_after_addings(final SubLObject pred) {
        if (NIL == $gaf_after_addings_hash$.getGlobalValue()) {
            initialize_gaf_after_addings_hash();
        }
        SubLObject result = gethash_without_values(pred, $gaf_after_addings_hash$.getGlobalValue(), NIL);
        if (NIL != somewhere_cache.somewhere_cached_pred_p(pred)) {
            result = cons(somewhere_cache.$somewhere_cache_gaf_after_adding_info$.getGlobalValue(), result);
        }
        return result;
    }

    public static final SubLObject get_gaf_after_removings_alt(SubLObject pred) {
        if (NIL == $gaf_after_removings_hash$.getGlobalValue()) {
            com.cyc.cycjava.cycl.inference.harness.after_adding.initialize_gaf_after_removings_hash();
        }
        {
            SubLObject result = gethash_without_values(pred, $gaf_after_removings_hash$.getGlobalValue(), NIL);
            if (NIL != somewhere_cache.somewhere_cached_pred_p(pred)) {
                result = cons(somewhere_cache.$somewhere_cache_gaf_after_adding_info$.getGlobalValue(), result);
            }
            return result;
        }
    }

    public static SubLObject get_gaf_after_removings(final SubLObject pred) {
        if (NIL == $gaf_after_removings_hash$.getGlobalValue()) {
            initialize_gaf_after_removings_hash();
        }
        SubLObject result = gethash_without_values(pred, $gaf_after_removings_hash$.getGlobalValue(), NIL);
        if (NIL != somewhere_cache.somewhere_cached_pred_p(pred)) {
            result = cons(somewhere_cache.$somewhere_cache_gaf_after_adding_info$.getGlobalValue(), result);
        }
        return result;
    }

    public static final SubLObject handle_gaf_after_adding_alt(SubLObject function, SubLObject argument, SubLObject assertion) {
        {
            SubLObject lock = $hl_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                funcall(function, argument, assertion);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject handle_gaf_after_adding(final SubLObject function, final SubLObject argument, final SubLObject assertion) {
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_lock$.getGlobalValue());
            funcall(function, argument, assertion);
        } finally {
            if (NIL != release) {
                release_lock($hl_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject handle_gaf_after_removing_alt(SubLObject function, SubLObject argument, SubLObject assertion) {
        {
            SubLObject lock = $hl_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                funcall(function, argument, assertion);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject handle_gaf_after_removing(final SubLObject function, final SubLObject argument, final SubLObject assertion) {
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_lock$.getGlobalValue());
            funcall(function, argument, assertion);
        } finally {
            if (NIL != release) {
                release_lock($hl_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject rebuild_after_adding_caches_alt() {
        com.cyc.cycjava.cycl.inference.harness.after_adding.rebuild_gaf_after_adding_caches();
        rule_after_adding.rebuild_rule_after_adding_caches();
        return NIL;
    }

    public static SubLObject rebuild_after_adding_caches() {
        rebuild_gaf_after_adding_caches();
        rule_after_adding.rebuild_rule_after_adding_caches();
        return NIL;
    }

    public static final SubLObject rebuild_gaf_after_adding_caches_alt() {
        com.cyc.cycjava.cycl.inference.harness.after_adding.initialize_gaf_after_addings_hash();
        com.cyc.cycjava.cycl.inference.harness.after_adding.initialize_gaf_after_removings_hash();
        return NIL;
    }

    public static SubLObject rebuild_gaf_after_adding_caches() {
        initialize_gaf_after_addings_hash();
        initialize_gaf_after_removings_hash();
        return NIL;
    }

    public static final SubLObject initialize_gaf_after_addings_hash_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $gaf_after_addings_hash$.getGlobalValue()) {
                clrhash($gaf_after_addings_hash$.getGlobalValue());
            } else {
                $gaf_after_addings_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
            }
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject pred_var = $$afterAdding;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                        if (NIL != valid) {
                                            {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                    {
                                                        SubLObject done_var_3 = NIL;
                                                        SubLObject token_var_4 = NIL;
                                                        while (NIL == done_var_3) {
                                                            {
                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                                SubLObject valid_5 = makeBoolean(token_var_4 != ass);
                                                                if (NIL != valid_5) {
                                                                    {
                                                                        SubLObject formula = assertions_high.gaf_formula(ass);
                                                                        SubLObject datum = formula;
                                                                        SubLObject current = datum;
                                                                        SubLObject gaf_after_adding_pred = NIL;
                                                                        SubLObject pred = NIL;
                                                                        SubLObject gaf_after_adding = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt15);
                                                                        gaf_after_adding_pred = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt15);
                                                                        pred = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt15);
                                                                        gaf_after_adding = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != forts.valid_fortP(pred)) {
                                                                                gaf_after_adding = cycl_subl_symbol_symbol(gaf_after_adding);
                                                                                {
                                                                                    SubLObject item_var = cons(gaf_after_adding, assertions_high.assertion_mt(ass));
                                                                                    if (NIL == member(item_var, gethash(pred, $gaf_after_addings_hash$.getGlobalValue(), UNPROVIDED), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                        sethash(pred, $gaf_after_addings_hash$.getGlobalValue(), cons(item_var, gethash(pred, $gaf_after_addings_hash$.getGlobalValue(), UNPROVIDED)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list_alt15);
                                                                        }
                                                                    }
                                                                }
                                                                done_var_3 = makeBoolean(NIL == valid_5);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_gaf_after_addings_hash() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $gaf_after_addings_hash$.getGlobalValue()) {
            clrhash($gaf_after_addings_hash$.getGlobalValue());
        } else {
            $gaf_after_addings_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$afterAdding;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$11 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$12 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$13 = NIL;
                                final SubLObject token_var_$14 = NIL;
                                while (NIL == done_var_$13) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$14);
                                    final SubLObject valid_$15 = makeBoolean(!token_var_$14.eql(ass));
                                    if (NIL != valid_$15) {
                                        final SubLObject formula = assertions_high.gaf_formula(ass);
                                        SubLObject current;
                                        final SubLObject datum = current = formula;
                                        SubLObject gaf_after_adding_pred = NIL;
                                        SubLObject pred = NIL;
                                        SubLObject gaf_after_adding = NIL;
                                        destructuring_bind_must_consp(current, datum, $list16);
                                        gaf_after_adding_pred = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list16);
                                        pred = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list16);
                                        gaf_after_adding = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != forts.valid_fortP(pred)) {
                                                gaf_after_adding = cycl_subl_symbol_symbol(gaf_after_adding);
                                                final SubLObject item_var = cons(gaf_after_adding, assertions_high.assertion_mt(ass));
                                                if (NIL == member(item_var, gethash(pred, $gaf_after_addings_hash$.getGlobalValue(), UNPROVIDED), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    sethash(pred, $gaf_after_addings_hash$.getGlobalValue(), cons(item_var, gethash(pred, $gaf_after_addings_hash$.getGlobalValue(), UNPROVIDED)));
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list16);
                                        }
                                    }
                                    done_var_$13 = makeBoolean(NIL == valid_$15);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$12, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject initialize_gaf_after_removings_hash_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$gaf_after_removings_hash$.getGlobalValue().isHashtable()) {
                $gaf_after_removings_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
            } else {
                clrhash($gaf_after_removings_hash$.getGlobalValue());
            }
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject pred_var = $$afterRemoving;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                        if (NIL != valid) {
                                            {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                    {
                                                        SubLObject done_var_7 = NIL;
                                                        SubLObject token_var_8 = NIL;
                                                        while (NIL == done_var_7) {
                                                            {
                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                                SubLObject valid_9 = makeBoolean(token_var_8 != ass);
                                                                if (NIL != valid_9) {
                                                                    {
                                                                        SubLObject formula = assertions_high.gaf_formula(ass);
                                                                        SubLObject datum = formula;
                                                                        SubLObject current = datum;
                                                                        SubLObject gaf_after_removing_pred = NIL;
                                                                        SubLObject pred = NIL;
                                                                        SubLObject gaf_after_removing = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt17);
                                                                        gaf_after_removing_pred = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt17);
                                                                        pred = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt17);
                                                                        gaf_after_removing = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != forts.valid_fortP(pred)) {
                                                                                gaf_after_removing = cycl_subl_symbol_symbol(gaf_after_removing);
                                                                                {
                                                                                    SubLObject item_var = cons(gaf_after_removing, assertions_high.assertion_mt(ass));
                                                                                    if (NIL == member(item_var, gethash(pred, $gaf_after_removings_hash$.getGlobalValue(), UNPROVIDED), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                        sethash(pred, $gaf_after_removings_hash$.getGlobalValue(), cons(item_var, gethash(pred, $gaf_after_removings_hash$.getGlobalValue(), UNPROVIDED)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list_alt17);
                                                                        }
                                                                    }
                                                                }
                                                                done_var_7 = makeBoolean(NIL == valid_9);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_gaf_after_removings_hash() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$gaf_after_removings_hash$.getGlobalValue().isHashtable()) {
            $gaf_after_removings_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        } else {
            clrhash($gaf_after_removings_hash$.getGlobalValue());
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$afterRemoving;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$17 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$18 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$19 = NIL;
                                final SubLObject token_var_$20 = NIL;
                                while (NIL == done_var_$19) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                    final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(ass));
                                    if (NIL != valid_$21) {
                                        final SubLObject formula = assertions_high.gaf_formula(ass);
                                        SubLObject current;
                                        final SubLObject datum = current = formula;
                                        SubLObject gaf_after_removing_pred = NIL;
                                        SubLObject pred = NIL;
                                        SubLObject gaf_after_removing = NIL;
                                        destructuring_bind_must_consp(current, datum, $list18);
                                        gaf_after_removing_pred = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list18);
                                        pred = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list18);
                                        gaf_after_removing = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != forts.valid_fortP(pred)) {
                                                gaf_after_removing = cycl_subl_symbol_symbol(gaf_after_removing);
                                                final SubLObject item_var = cons(gaf_after_removing, assertions_high.assertion_mt(ass));
                                                if (NIL == member(item_var, gethash(pred, $gaf_after_removings_hash$.getGlobalValue(), UNPROVIDED), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    sethash(pred, $gaf_after_removings_hash$.getGlobalValue(), cons(item_var, gethash(pred, $gaf_after_removings_hash$.getGlobalValue(), UNPROVIDED)));
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list18);
                                        }
                                    }
                                    done_var_$19 = makeBoolean(NIL == valid_$21);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$18, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject recache_gaf_after_addings_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            if (NIL == $gaf_after_addings_hash$.getGlobalValue()) {
                com.cyc.cycjava.cycl.inference.harness.after_adding.initialize_gaf_after_addings_hash();
            }
            remhash(predicate, $gaf_after_addings_hash$.getGlobalValue());
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = $$afterAdding;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, NIL, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, NIL, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_11 = NIL;
                                                            SubLObject token_var_12 = NIL;
                                                            while (NIL == done_var_11) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_12);
                                                                    SubLObject valid_13 = makeBoolean(token_var_12 != ass);
                                                                    if (NIL != valid_13) {
                                                                        if (NIL != assertions_high.assertion_arguments(ass)) {
                                                                            {
                                                                                SubLObject gaf_after_adding = cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, TWO_INTEGER));
                                                                                SubLObject item_var = cons(gaf_after_adding, assertions_high.assertion_mt(ass));
                                                                                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                    ans = cons(item_var, ans);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_11 = makeBoolean(NIL == valid_13);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != ans) {
                    sethash(predicate, $gaf_after_addings_hash$.getGlobalValue(), nreverse(ans));
                }
            }
            return NIL;
        }
    }

    public static SubLObject recache_gaf_after_addings(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        if (NIL == $gaf_after_addings_hash$.getGlobalValue()) {
            initialize_gaf_after_addings_hash();
        }
        remhash(predicate, $gaf_after_addings_hash$.getGlobalValue());
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$afterAdding;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, NIL, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$23 = NIL;
                            final SubLObject token_var_$24 = NIL;
                            while (NIL == done_var_$23) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(ass));
                                if ((NIL != valid_$25) && (NIL != assertions_high.assertion_arguments(ass))) {
                                    final SubLObject gaf_after_adding = cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, TWO_INTEGER));
                                    final SubLObject item_var = cons(gaf_after_adding, assertions_high.assertion_mt(ass));
                                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                                done_var_$23 = makeBoolean(NIL == valid_$25);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != ans) {
            sethash(predicate, $gaf_after_addings_hash$.getGlobalValue(), nreverse(ans));
        }
        return NIL;
    }

    public static final SubLObject recache_gaf_after_removings_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            if (NIL == $gaf_after_removings_hash$.getGlobalValue()) {
                com.cyc.cycjava.cycl.inference.harness.after_adding.initialize_gaf_after_removings_hash();
            }
            remhash(predicate, $gaf_after_removings_hash$.getGlobalValue());
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = $$afterRemoving;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, NIL, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, NIL, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_15 = NIL;
                                                            SubLObject token_var_16 = NIL;
                                                            while (NIL == done_var_15) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_16);
                                                                    SubLObject valid_17 = makeBoolean(token_var_16 != ass);
                                                                    if (NIL != valid_17) {
                                                                        if (NIL != assertions_high.assertion_arguments(ass)) {
                                                                            {
                                                                                SubLObject gaf_after_removing = cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, TWO_INTEGER));
                                                                                SubLObject item_var = cons(gaf_after_removing, assertions_high.assertion_mt(ass));
                                                                                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                    ans = cons(item_var, ans);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_15 = makeBoolean(NIL == valid_17);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_18, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != ans) {
                    sethash(predicate, $gaf_after_removings_hash$.getGlobalValue(), nreverse(ans));
                }
            }
            return NIL;
        }
    }

    public static SubLObject recache_gaf_after_removings(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        if (NIL == $gaf_after_removings_hash$.getGlobalValue()) {
            initialize_gaf_after_removings_hash();
        }
        remhash(predicate, $gaf_after_removings_hash$.getGlobalValue());
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$afterRemoving;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, NIL, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$27 = NIL;
                            final SubLObject token_var_$28 = NIL;
                            while (NIL == done_var_$27) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$28);
                                final SubLObject valid_$29 = makeBoolean(!token_var_$28.eql(ass));
                                if ((NIL != valid_$29) && (NIL != assertions_high.assertion_arguments(ass))) {
                                    final SubLObject gaf_after_removing = cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, TWO_INTEGER));
                                    final SubLObject item_var = cons(gaf_after_removing, assertions_high.assertion_mt(ass));
                                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                                done_var_$27 = makeBoolean(NIL == valid_$29);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != ans) {
            sethash(predicate, $gaf_after_removings_hash$.getGlobalValue(), nreverse(ans));
        }
        return NIL;
    }

    public static final SubLObject propagate_gaf_after_adding_alt(SubLObject argument, SubLObject assertion) {
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != assertions_high.assertion_has_truth(assertion, $TRUE))) {
            {
                SubLObject formula = assertions_high.gaf_formula(assertion);
                if (literal_arity(formula, UNPROVIDED).numE(TWO_INTEGER)) {
                    {
                        SubLObject predicate = literal_arg1(formula, UNPROVIDED);
                        SubLObject function = cycl_subl_symbol_symbol(literal_arg2(formula, UNPROVIDED));
                        SubLObject mt = assertions_high.assertion_mt(assertion);
                        if (((NIL != forts.fort_p(predicate)) && function.isSymbol()) && (NIL != fboundp(function))) {
                            if (function != PROPAGATE_GAF_AFTER_ADDING) {
                                com.cyc.cycjava.cycl.inference.harness.after_adding.repropagate_gaf_after_adding(predicate, function, mt);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject propagate_gaf_after_adding(final SubLObject argument, final SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != assertions_high.assertion_has_truth(assertion, $TRUE))) {
            final SubLObject formula = assertions_high.gaf_formula(assertion);
            if (literal_arity(formula, UNPROVIDED).numE(TWO_INTEGER)) {
                final SubLObject predicate = literal_arg1(formula, UNPROVIDED);
                final SubLObject function = cycl_subl_symbol_symbol(literal_arg2(formula, UNPROVIDED));
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                if ((((NIL != forts.fort_p(predicate)) && function.isSymbol()) && (NIL != fboundp(function))) && (function != PROPAGATE_GAF_AFTER_ADDING)) {
                    repropagate_gaf_after_adding(predicate, function, mt);
                }
            }
        }
        return NIL;
    }

    /**
     * Completely repropagate the gaf-after-adding FUNCTION for all arguments supporting
     * all assertions about PREDICATE in spec mts of MT.
     */
    @LispMethod(comment = "Completely repropagate the gaf-after-adding FUNCTION for all arguments supporting\r\nall assertions about PREDICATE in spec mts of MT.\nCompletely repropagate the gaf-after-adding FUNCTION for all arguments supporting\nall assertions about PREDICATE in spec mts of MT.")
    public static final SubLObject repropagate_gaf_after_adding_alt(SubLObject predicate, SubLObject function, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            SubLTrampolineFile.checkType(function, SYMBOLP);
            SubLTrampolineFile.checkType(mt, HLMT_P);
            if (NIL != fboundp(function)) {
                {
                    SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        $mapping_target$.bind(function, thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kb_mapping.map_predicate_extent_index(symbol_function(REPROPAGATE_GAF_AFTER_ADDING_INTERNAL), predicate, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        $mapping_target$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Completely repropagate the gaf-after-adding FUNCTION for all arguments supporting
     * all assertions about PREDICATE in spec mts of MT.
     */
    @LispMethod(comment = "Completely repropagate the gaf-after-adding FUNCTION for all arguments supporting\r\nall assertions about PREDICATE in spec mts of MT.\nCompletely repropagate the gaf-after-adding FUNCTION for all arguments supporting\nall assertions about PREDICATE in spec mts of MT.")
    public static SubLObject repropagate_gaf_after_adding(final SubLObject predicate, final SubLObject function, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        assert NIL != symbolp(function) : "! symbolp(function) " + ("Types.symbolp(function) " + "CommonSymbols.NIL != Types.symbolp(function) ") + function;
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        if (NIL != fboundp(function)) {
            final SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                $mapping_target$.bind(function, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                kb_mapping.map_predicate_extent_index(symbol_function(REPROPAGATE_GAF_AFTER_ADDING_INTERNAL), predicate, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                $mapping_target$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject repropagate_gaf_after_adding_internal_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(assertions_high.assertion_mt(assertion), thread);
                        {
                            SubLObject cdolist_list_var = v_arguments;
                            SubLObject argument = NIL;
                            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                if (NIL == $debug_after_addingsP$.getDynamicValue(thread)) {
                                    {
                                        SubLObject ignore_errors_tag = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_19 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                    try {
                                                        com.cyc.cycjava.cycl.inference.harness.after_adding.handle_gaf_after_adding($mapping_target$.getDynamicValue(thread), argument, assertion);
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_19, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                        }
                                    }
                                } else {
                                    com.cyc.cycjava.cycl.inference.harness.after_adding.handle_gaf_after_adding($mapping_target$.getDynamicValue(thread), argument, assertion);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject repropagate_gaf_after_adding_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(assertions_high.assertion_mt(assertion), thread);
            SubLObject cdolist_list_var = v_arguments;
            SubLObject argument = NIL;
            argument = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == $debug_after_addingsP$.getDynamicValue(thread)) {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$31 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                handle_gaf_after_adding($mapping_target$.getDynamicValue(thread), argument, assertion);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$31, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    } finally {
                        thread.throwStack.pop();
                    }
                } else {
                    handle_gaf_after_adding($mapping_target$.getDynamicValue(thread), argument, assertion);
                }
                cdolist_list_var = cdolist_list_var.rest();
                argument = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("afterAdding"), reader_make_constant_shell("afterRemoving"));

    public static SubLObject initial_assertion_argumentP(final SubLObject argument, final SubLObject assertion) {
        return assertion_sole_argumentP(argument, assertion);
    }

    static private final SubLList $list_alt4 = list(list(makeSymbol("*AFTER-ADDINGS-DISABLED?*"), T));

    public static SubLObject final_assertion_argumentP(final SubLObject argument, final SubLObject assertion) {
        return assertion_sole_argumentP(argument, assertion);
    }

    static private final SubLList $list_alt7 = cons(makeSymbol("FUN"), makeSymbol("FUN-MT"));

    public static SubLObject assertion_sole_argumentP(final SubLObject argument, final SubLObject assertion) {
        final SubLObject assertion_arguments = assertions_high.assertion_arguments(assertion);
        return makeBoolean((NIL != list_utilities.singletonP(assertion_arguments)) && (NIL != subl_promotions.memberP(argument, assertion_arguments, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject declare_after_adding_file() {
        declareFunction("clear_after_addings", "CLEAR-AFTER-ADDINGS", 0, 0, false);
        declareFunction("clear_gaf_after_addings", "CLEAR-GAF-AFTER-ADDINGS", 0, 0, false);
        declareFunction("clear_after_removings", "CLEAR-AFTER-REMOVINGS", 0, 0, false);
        declareFunction("clear_gaf_after_removings", "CLEAR-GAF-AFTER-REMOVINGS", 0, 0, false);
        declareMacro("disable_after_addings", "DISABLE-AFTER-ADDINGS");
        declareFunction("handle_after_addings", "HANDLE-AFTER-ADDINGS", 2, 0, false);
        declareFunction("handle_gaf_after_addings", "HANDLE-GAF-AFTER-ADDINGS", 2, 0, false);
        declareFunction("handle_after_removings", "HANDLE-AFTER-REMOVINGS", 2, 0, false);
        declareFunction("handle_gaf_after_removings", "HANDLE-GAF-AFTER-REMOVINGS", 2, 0, false);
        declareFunction("get_gaf_after_addings", "GET-GAF-AFTER-ADDINGS", 1, 0, false);
        declareFunction("get_gaf_after_removings", "GET-GAF-AFTER-REMOVINGS", 1, 0, false);
        declareFunction("handle_gaf_after_adding", "HANDLE-GAF-AFTER-ADDING", 3, 0, false);
        declareFunction("handle_gaf_after_removing", "HANDLE-GAF-AFTER-REMOVING", 3, 0, false);
        declareFunction("rebuild_after_adding_caches", "REBUILD-AFTER-ADDING-CACHES", 0, 0, false);
        declareFunction("rebuild_gaf_after_adding_caches", "REBUILD-GAF-AFTER-ADDING-CACHES", 0, 0, false);
        declareFunction("initialize_gaf_after_addings_hash", "INITIALIZE-GAF-AFTER-ADDINGS-HASH", 0, 0, false);
        declareFunction("initialize_gaf_after_removings_hash", "INITIALIZE-GAF-AFTER-REMOVINGS-HASH", 0, 0, false);
        declareFunction("recache_gaf_after_addings", "RECACHE-GAF-AFTER-ADDINGS", 1, 0, false);
        declareFunction("recache_gaf_after_removings", "RECACHE-GAF-AFTER-REMOVINGS", 1, 0, false);
        declareFunction("propagate_gaf_after_adding", "PROPAGATE-GAF-AFTER-ADDING", 2, 0, false);
        declareFunction("repropagate_gaf_after_adding", "REPROPAGATE-GAF-AFTER-ADDING", 3, 0, false);
        declareFunction("repropagate_gaf_after_adding_internal", "REPROPAGATE-GAF-AFTER-ADDING-INTERNAL", 1, 0, false);
        declareFunction("initial_assertion_argumentP", "INITIAL-ASSERTION-ARGUMENT?", 2, 0, false);
        declareFunction("final_assertion_argumentP", "FINAL-ASSERTION-ARGUMENT?", 2, 0, false);
        declareFunction("assertion_sole_argumentP", "ASSERTION-SOLE-ARGUMENT?", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt15 = list(makeSymbol("GAF-AFTER-ADDING-PRED"), makeSymbol("PRED"), makeSymbol("GAF-AFTER-ADDING"));

    static private final SubLList $list_alt17 = list(makeSymbol("GAF-AFTER-REMOVING-PRED"), makeSymbol("PRED"), makeSymbol("GAF-AFTER-REMOVING"));

    public static final SubLObject init_after_adding_file_alt() {
        defparameter("*DEBUG-AFTER-ADDINGS?*", NIL);
        deflexical("*GAF-AFTER-ADDING-PREDICATES*", $list_alt0);
        deflexical("*GAF-AFTER-ADDINGS-HASH*", NIL != boundp($gaf_after_addings_hash$) ? ((SubLObject) ($gaf_after_addings_hash$.getGlobalValue())) : NIL);
        deflexical("*GAF-AFTER-REMOVINGS-HASH*", NIL != boundp($gaf_after_removings_hash$) ? ((SubLObject) ($gaf_after_removings_hash$.getGlobalValue())) : NIL);
        defparameter("*AFTER-ADDINGS-DISABLED?*", NIL);
        return NIL;
    }

    public static SubLObject init_after_adding_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*DEBUG-AFTER-ADDINGS?*", NIL);
            deflexical("*GAF-AFTER-ADDING-PREDICATES*", $list0);
            deflexical("*GAF-AFTER-ADDINGS-HASH*", SubLTrampolineFile.maybeDefault($gaf_after_addings_hash$, $gaf_after_addings_hash$, NIL));
            deflexical("*GAF-AFTER-REMOVINGS-HASH*", SubLTrampolineFile.maybeDefault($gaf_after_removings_hash$, $gaf_after_removings_hash$, NIL));
            defparameter("*AFTER-ADDINGS-DISABLED?*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*GAF-AFTER-ADDINGS-HASH*", NIL != boundp($gaf_after_addings_hash$) ? ((SubLObject) ($gaf_after_addings_hash$.getGlobalValue())) : NIL);
            deflexical("*GAF-AFTER-REMOVINGS-HASH*", NIL != boundp($gaf_after_removings_hash$) ? ((SubLObject) ($gaf_after_removings_hash$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_after_adding_file_Previous() {
        defparameter("*DEBUG-AFTER-ADDINGS?*", NIL);
        deflexical("*GAF-AFTER-ADDING-PREDICATES*", $list0);
        deflexical("*GAF-AFTER-ADDINGS-HASH*", SubLTrampolineFile.maybeDefault($gaf_after_addings_hash$, $gaf_after_addings_hash$, NIL));
        deflexical("*GAF-AFTER-REMOVINGS-HASH*", SubLTrampolineFile.maybeDefault($gaf_after_removings_hash$, $gaf_after_removings_hash$, NIL));
        defparameter("*AFTER-ADDINGS-DISABLED?*", NIL);
        return NIL;
    }

    public static SubLObject setup_after_adding_file() {
        declare_defglobal($gaf_after_addings_hash$);
        declare_defglobal($gaf_after_removings_hash$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_after_adding_file();
    }

    @Override
    public void initializeVariables() {
        init_after_adding_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_after_adding_file();
    }

    static {
    }
}

/**
 * Total time: 400 ms
 */
