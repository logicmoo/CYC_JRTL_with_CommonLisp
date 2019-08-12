/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


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
 * module:      RULE-AFTER-ADDING
 * source file: /cyc/top/cycl/inference/harness/rule-after-adding.lisp
 * created:     2019/07/03 17:37:37
 */
public final class rule_after_adding extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rule_after_adding();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.rule_after_adding";


    // deflexical
    // Definitions
    /**
     * The predicates whose extent implement the ruleAfterAdding and
     * ruleAfterRemoving support.
     */
    @LispMethod(comment = "The predicates whose extent implement the ruleAfterAdding and\r\nruleAfterRemoving support.\ndeflexical\nThe predicates whose extent implement the ruleAfterAdding and\nruleAfterRemoving support.")
    public static final SubLSymbol $rule_after_adding_predicates$ = makeSymbol("*RULE-AFTER-ADDING-PREDICATES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $rule_after_addings_hash$ = makeSymbol("*RULE-AFTER-ADDINGS-HASH*");

    public static final SubLSymbol $rule_after_removings_hash$ = makeSymbol("*RULE-AFTER-REMOVINGS-HASH*");

    static private final SubLList $list4 = cons(makeSymbol("FUN"), makeSymbol("FUN-MT"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");





    static private final SubLList $list12 = list(makeSymbol("RULE-AFTER-ADDING-PRED"), makeSymbol("PRED"), makeSymbol("RULE-AFTER-ADDING"));



    static private final SubLList $list14 = list(makeSymbol("RULE-AFTER-REMOVING-PRED"), makeSymbol("PRED"), makeSymbol("RULE-AFTER-REMOVING"));

    private static final SubLSymbol PROPAGATE_RULE_AFTER_ADDING = makeSymbol("PROPAGATE-RULE-AFTER-ADDING");

    private static final SubLSymbol RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");

    public static final SubLObject clear_rule_after_addings_alt() {
        if (NIL != $rule_after_addings_hash$.getGlobalValue()) {
            clrhash($rule_after_addings_hash$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject clear_rule_after_addings() {
        if (NIL != $rule_after_addings_hash$.getGlobalValue()) {
            clrhash($rule_after_addings_hash$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject clear_rule_after_removings_alt() {
        if (NIL != $rule_after_removings_hash$.getGlobalValue()) {
            clrhash($rule_after_removings_hash$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject clear_rule_after_removings() {
        if (NIL != $rule_after_removings_hash$.getGlobalValue()) {
            clrhash($rule_after_removings_hash$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject handle_rule_after_addings_alt(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(argument, ARGUMENT_P);
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            if (NIL == after_adding.$after_addings_disabledP$.getDynamicValue(thread)) {
                if (NIL != assertions_high.rule_assertionP(assertion)) {
                    {
                        SubLObject cnf = assertions_high.assertion_cnf(assertion);
                        {
                            SubLObject cdolist_list_var = clauses.neg_lits(cnf);
                            SubLObject literal = NIL;
                            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.inference.harness.rule_after_adding.handle_rule_after_addings_int(argument, literal, assertion);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = clauses.pos_lits(cnf);
                            SubLObject literal = NIL;
                            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.inference.harness.rule_after_adding.handle_rule_after_addings_int(argument, literal, assertion);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject handle_rule_after_addings(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if ((NIL == after_adding.$after_addings_disabledP$.getDynamicValue(thread)) && (NIL != assertions_high.rule_assertionP(assertion))) {
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf);
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                handle_rule_after_addings_int(argument, literal, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
            cdolist_list_var = clauses.pos_lits(cnf);
            literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                handle_rule_after_addings_int(argument, literal, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject handle_rule_after_addings_int_alt(SubLObject argument, SubLObject literal, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = literal_arg(literal, ZERO_INTEGER, UNPROVIDED);
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
                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.rule_after_adding.get_rule_after_addings(pred);
                                    SubLObject info = NIL;
                                    for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum = info;
                                            SubLObject current = datum;
                                            SubLObject fun = NIL;
                                            SubLObject fun_mt = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt4);
                                            fun = current.first();
                                            current = current.rest();
                                            fun_mt = current;
                                            if (fun.isFunctionSpec() && (NIL != mt_relevance_macros.relevant_mtP(fun_mt))) {
                                                {
                                                    SubLObject ignore_errors_tag = NIL;
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                try {
                                                                    com.cyc.cycjava.cycl.inference.harness.rule_after_adding.handle_rule_after_adding(fun, argument, literal, assertion);
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
            return NIL;
        }
    }

    public static SubLObject handle_rule_after_addings_int(final SubLObject argument, final SubLObject literal, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = literal_arg(literal, ZERO_INTEGER, UNPROVIDED);
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
                SubLObject cdolist_list_var = get_rule_after_addings(pred);
                SubLObject info = NIL;
                info = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = info;
                    SubLObject fun = NIL;
                    SubLObject fun_mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list4);
                    fun = current.first();
                    current = fun_mt = current.rest();
                    if (fun.isFunctionSpec() && (NIL != mt_relevance_macros.relevant_mtP(fun_mt))) {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    handle_rule_after_adding(fun, argument, literal, assertion);
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
        return NIL;
    }

    public static final SubLObject handle_rule_after_removings_alt(SubLObject argument, SubLObject assertion) {
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            {
                SubLObject cnf = assertions_high.assertion_cnf(assertion);
                {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf);
                    SubLObject literal = NIL;
                    for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.inference.harness.rule_after_adding.handle_rule_after_removings_int(argument, literal, assertion);
                    }
                }
                {
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf);
                    SubLObject literal = NIL;
                    for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.inference.harness.rule_after_adding.handle_rule_after_removings_int(argument, literal, assertion);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject handle_rule_after_removings(final SubLObject argument, final SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf);
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                handle_rule_after_removings_int(argument, literal, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
            cdolist_list_var = clauses.pos_lits(cnf);
            literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                handle_rule_after_removings_int(argument, literal, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject handle_rule_after_removings_int_alt(SubLObject argument, SubLObject literal, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = literal_arg(assertion, ZERO_INTEGER, UNPROVIDED);
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
                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.rule_after_adding.get_rule_after_removings(pred);
                                    SubLObject info = NIL;
                                    for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum = info;
                                            SubLObject current = datum;
                                            SubLObject fun = NIL;
                                            SubLObject fun_mt = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt4);
                                            fun = current.first();
                                            current = current.rest();
                                            fun_mt = current;
                                            if (fun.isFunctionSpec() && (NIL != mt_relevance_macros.relevant_mtP(fun_mt))) {
                                                {
                                                    SubLObject ignore_errors_tag = NIL;
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                try {
                                                                    com.cyc.cycjava.cycl.inference.harness.rule_after_adding.handle_rule_after_removing(fun, argument, literal, assertion);
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
            return NIL;
        }
    }

    public static SubLObject handle_rule_after_removings_int(final SubLObject argument, final SubLObject literal, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = literal_arg(assertion, ZERO_INTEGER, UNPROVIDED);
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
                SubLObject cdolist_list_var = get_rule_after_removings(pred);
                SubLObject info = NIL;
                info = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = info;
                    SubLObject fun = NIL;
                    SubLObject fun_mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list4);
                    fun = current.first();
                    current = fun_mt = current.rest();
                    if (fun.isFunctionSpec() && (NIL != mt_relevance_macros.relevant_mtP(fun_mt))) {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    handle_rule_after_removing(fun, argument, literal, assertion);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
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
        return NIL;
    }

    public static final SubLObject get_rule_after_addings_alt(SubLObject pred) {
        if (NIL == $rule_after_addings_hash$.getGlobalValue()) {
            com.cyc.cycjava.cycl.inference.harness.rule_after_adding.initialize_rule_after_addings_hash();
        }
        return gethash_without_values(pred, $rule_after_addings_hash$.getGlobalValue(), NIL);
    }

    public static SubLObject get_rule_after_addings(final SubLObject pred) {
        if (NIL == $rule_after_addings_hash$.getGlobalValue()) {
            initialize_rule_after_addings_hash();
        }
        return gethash_without_values(pred, $rule_after_addings_hash$.getGlobalValue(), NIL);
    }

    public static final SubLObject get_rule_after_removings_alt(SubLObject pred) {
        if (NIL == $rule_after_removings_hash$.getGlobalValue()) {
            com.cyc.cycjava.cycl.inference.harness.rule_after_adding.initialize_rule_after_removings_hash();
        }
        return gethash_without_values(pred, $rule_after_removings_hash$.getGlobalValue(), NIL);
    }

    public static SubLObject get_rule_after_removings(final SubLObject pred) {
        if (NIL == $rule_after_removings_hash$.getGlobalValue()) {
            initialize_rule_after_removings_hash();
        }
        return gethash_without_values(pred, $rule_after_removings_hash$.getGlobalValue(), NIL);
    }

    public static final SubLObject handle_rule_after_adding_alt(SubLObject function, SubLObject argument, SubLObject literal, SubLObject assertion) {
        {
            SubLObject lock = $hl_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                funcall(function, argument, literal, assertion);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject handle_rule_after_adding(final SubLObject function, final SubLObject argument, final SubLObject literal, final SubLObject assertion) {
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_lock$.getGlobalValue());
            funcall(function, argument, literal, assertion);
        } finally {
            if (NIL != release) {
                release_lock($hl_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject handle_rule_after_removing_alt(SubLObject function, SubLObject argument, SubLObject literal, SubLObject assertion) {
        {
            SubLObject lock = $hl_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                funcall(function, argument, literal, assertion);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject handle_rule_after_removing(final SubLObject function, final SubLObject argument, final SubLObject literal, final SubLObject assertion) {
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_lock$.getGlobalValue());
            funcall(function, argument, literal, assertion);
        } finally {
            if (NIL != release) {
                release_lock($hl_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject rebuild_rule_after_adding_caches_alt() {
        com.cyc.cycjava.cycl.inference.harness.rule_after_adding.initialize_rule_after_addings_hash();
        com.cyc.cycjava.cycl.inference.harness.rule_after_adding.initialize_rule_after_removings_hash();
        return NIL;
    }

    public static SubLObject rebuild_rule_after_adding_caches() {
        initialize_rule_after_addings_hash();
        initialize_rule_after_removings_hash();
        return NIL;
    }

    public static final SubLObject initialize_rule_after_addings_hash_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $rule_after_addings_hash$.getGlobalValue()) {
                clrhash($rule_after_addings_hash$.getGlobalValue());
            } else {
                $rule_after_addings_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
            }
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject pred_var = $$ruleAfterAdding;
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
                                                                        SubLObject rule_after_adding_pred = NIL;
                                                                        SubLObject pred = NIL;
                                                                        SubLObject v_rule_after_adding = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt12);
                                                                        rule_after_adding_pred = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt12);
                                                                        pred = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt12);
                                                                        v_rule_after_adding = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != forts.valid_fortP(pred)) {
                                                                                v_rule_after_adding = cycl_subl_symbol_symbol(v_rule_after_adding);
                                                                                {
                                                                                    SubLObject item_var = cons(v_rule_after_adding, assertions_high.assertion_mt(ass));
                                                                                    if (NIL == member(item_var, gethash(pred, $rule_after_addings_hash$.getGlobalValue(), UNPROVIDED), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                        sethash(pred, $rule_after_addings_hash$.getGlobalValue(), cons(item_var, gethash(pred, $rule_after_addings_hash$.getGlobalValue(), UNPROVIDED)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list_alt12);
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

    public static SubLObject initialize_rule_after_addings_hash() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $rule_after_addings_hash$.getGlobalValue()) {
            clrhash($rule_after_addings_hash$.getGlobalValue());
        } else {
            $rule_after_addings_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$ruleAfterAdding;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$3 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = $progress_last_pacification_time$.currentBinding(thread);
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
                                SubLObject done_var_$5 = NIL;
                                final SubLObject token_var_$6 = NIL;
                                while (NIL == done_var_$5) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                    final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(ass));
                                    if (NIL != valid_$7) {
                                        final SubLObject formula = assertions_high.gaf_formula(ass);
                                        SubLObject current;
                                        final SubLObject datum = current = formula;
                                        SubLObject rule_after_adding_pred = NIL;
                                        SubLObject pred = NIL;
                                        SubLObject v_rule_after_adding = NIL;
                                        destructuring_bind_must_consp(current, datum, $list12);
                                        rule_after_adding_pred = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list12);
                                        pred = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list12);
                                        v_rule_after_adding = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != forts.valid_fortP(pred)) {
                                                v_rule_after_adding = cycl_subl_symbol_symbol(v_rule_after_adding);
                                                final SubLObject item_var = cons(v_rule_after_adding, assertions_high.assertion_mt(ass));
                                                if (NIL == member(item_var, gethash(pred, $rule_after_addings_hash$.getGlobalValue(), UNPROVIDED), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    sethash(pred, $rule_after_addings_hash$.getGlobalValue(), cons(item_var, gethash(pred, $rule_after_addings_hash$.getGlobalValue(), UNPROVIDED)));
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list12);
                                        }
                                    }
                                    done_var_$5 = makeBoolean(NIL == valid_$7);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
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
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$4, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject initialize_rule_after_removings_hash_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$rule_after_removings_hash$.getGlobalValue().isHashtable()) {
                $rule_after_removings_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
            } else {
                clrhash($rule_after_removings_hash$.getGlobalValue());
            }
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject pred_var = $$ruleAfterRemoving;
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
                                                                        SubLObject rule_after_removing_pred = NIL;
                                                                        SubLObject pred = NIL;
                                                                        SubLObject rule_after_removing = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt14);
                                                                        rule_after_removing_pred = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt14);
                                                                        pred = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt14);
                                                                        rule_after_removing = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != forts.valid_fortP(pred)) {
                                                                                rule_after_removing = cycl_subl_symbol_symbol(rule_after_removing);
                                                                                {
                                                                                    SubLObject item_var = cons(rule_after_removing, assertions_high.assertion_mt(ass));
                                                                                    if (NIL == member(item_var, gethash(pred, $rule_after_removings_hash$.getGlobalValue(), UNPROVIDED), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                        sethash(pred, $rule_after_removings_hash$.getGlobalValue(), cons(item_var, gethash(pred, $rule_after_removings_hash$.getGlobalValue(), UNPROVIDED)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list_alt14);
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

    public static SubLObject initialize_rule_after_removings_hash() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$rule_after_removings_hash$.getGlobalValue().isHashtable()) {
            $rule_after_removings_hash$.setGlobalValue(make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        } else {
            clrhash($rule_after_removings_hash$.getGlobalValue());
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$ruleAfterRemoving;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$9 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$10 = $progress_last_pacification_time$.currentBinding(thread);
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
                                SubLObject done_var_$11 = NIL;
                                final SubLObject token_var_$12 = NIL;
                                while (NIL == done_var_$11) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                    final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(ass));
                                    if (NIL != valid_$13) {
                                        final SubLObject formula = assertions_high.gaf_formula(ass);
                                        SubLObject current;
                                        final SubLObject datum = current = formula;
                                        SubLObject rule_after_removing_pred = NIL;
                                        SubLObject pred = NIL;
                                        SubLObject rule_after_removing = NIL;
                                        destructuring_bind_must_consp(current, datum, $list14);
                                        rule_after_removing_pred = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list14);
                                        pred = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list14);
                                        rule_after_removing = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != forts.valid_fortP(pred)) {
                                                rule_after_removing = cycl_subl_symbol_symbol(rule_after_removing);
                                                final SubLObject item_var = cons(rule_after_removing, assertions_high.assertion_mt(ass));
                                                if (NIL == member(item_var, gethash(pred, $rule_after_removings_hash$.getGlobalValue(), UNPROVIDED), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    sethash(pred, $rule_after_removings_hash$.getGlobalValue(), cons(item_var, gethash(pred, $rule_after_removings_hash$.getGlobalValue(), UNPROVIDED)));
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list14);
                                        }
                                    }
                                    done_var_$11 = makeBoolean(NIL == valid_$13);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
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
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$10, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject recache_rule_after_addings_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            if (NIL == $rule_after_addings_hash$.getGlobalValue()) {
                com.cyc.cycjava.cycl.inference.harness.rule_after_adding.initialize_rule_after_addings_hash();
            }
            remhash(predicate, $rule_after_addings_hash$.getGlobalValue());
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = $$ruleAfterAdding;
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
                                                                                SubLObject v_rule_after_adding = cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, TWO_INTEGER));
                                                                                SubLObject item_var = cons(v_rule_after_adding, assertions_high.assertion_mt(ass));
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
                    sethash(predicate, $rule_after_addings_hash$.getGlobalValue(), nreverse(ans));
                }
            }
            return NIL;
        }
    }

    public static SubLObject recache_rule_after_addings(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        if (NIL == $rule_after_addings_hash$.getGlobalValue()) {
            initialize_rule_after_addings_hash();
        }
        remhash(predicate, $rule_after_addings_hash$.getGlobalValue());
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$ruleAfterAdding;
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
                            SubLObject done_var_$15 = NIL;
                            final SubLObject token_var_$16 = NIL;
                            while (NIL == done_var_$15) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$16);
                                final SubLObject valid_$17 = makeBoolean(!token_var_$16.eql(ass));
                                if ((NIL != valid_$17) && (NIL != assertions_high.assertion_arguments(ass))) {
                                    final SubLObject v_rule_after_adding = cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, TWO_INTEGER));
                                    final SubLObject item_var = cons(v_rule_after_adding, assertions_high.assertion_mt(ass));
                                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                                done_var_$15 = makeBoolean(NIL == valid_$17);
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
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != ans) {
            sethash(predicate, $rule_after_addings_hash$.getGlobalValue(), nreverse(ans));
        }
        return NIL;
    }

    public static final SubLObject recache_rule_after_removings_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            if (NIL == $rule_after_removings_hash$.getGlobalValue()) {
                com.cyc.cycjava.cycl.inference.harness.rule_after_adding.initialize_rule_after_removings_hash();
            }
            remhash(predicate, $rule_after_removings_hash$.getGlobalValue());
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = $$ruleAfterRemoving;
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
                                                                                SubLObject rule_after_removing = cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, TWO_INTEGER));
                                                                                SubLObject item_var = cons(rule_after_removing, assertions_high.assertion_mt(ass));
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
                    sethash(predicate, $rule_after_removings_hash$.getGlobalValue(), nreverse(ans));
                }
            }
            return NIL;
        }
    }

    public static SubLObject recache_rule_after_removings(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        if (NIL == $rule_after_removings_hash$.getGlobalValue()) {
            initialize_rule_after_removings_hash();
        }
        remhash(predicate, $rule_after_removings_hash$.getGlobalValue());
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$ruleAfterRemoving;
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
                            SubLObject done_var_$19 = NIL;
                            final SubLObject token_var_$20 = NIL;
                            while (NIL == done_var_$19) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(ass));
                                if ((NIL != valid_$21) && (NIL != assertions_high.assertion_arguments(ass))) {
                                    final SubLObject rule_after_removing = cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, TWO_INTEGER));
                                    final SubLObject item_var = cons(rule_after_removing, assertions_high.assertion_mt(ass));
                                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                                done_var_$19 = makeBoolean(NIL == valid_$21);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
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
            sethash(predicate, $rule_after_removings_hash$.getGlobalValue(), nreverse(ans));
        }
        return NIL;
    }

    public static final SubLObject propagate_rule_after_adding_alt(SubLObject argument, SubLObject assertion) {
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
                            if (function != PROPAGATE_RULE_AFTER_ADDING) {
                                com.cyc.cycjava.cycl.inference.harness.rule_after_adding.repropagate_rule_after_adding(predicate, function, mt);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject propagate_rule_after_adding(final SubLObject argument, final SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != assertions_high.assertion_has_truth(assertion, $TRUE))) {
            final SubLObject formula = assertions_high.gaf_formula(assertion);
            if (literal_arity(formula, UNPROVIDED).numE(TWO_INTEGER)) {
                final SubLObject predicate = literal_arg1(formula, UNPROVIDED);
                final SubLObject function = cycl_subl_symbol_symbol(literal_arg2(formula, UNPROVIDED));
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                if ((((NIL != forts.fort_p(predicate)) && function.isSymbol()) && (NIL != fboundp(function))) && (function != PROPAGATE_RULE_AFTER_ADDING)) {
                    repropagate_rule_after_adding(predicate, function, mt);
                }
            }
        }
        return NIL;
    }

    /**
     * Completely repropagate the rule-after-adding FUNCTION for all arguments supporting
     * all assertions about PREDICATE in spec mts of MT.
     */
    @LispMethod(comment = "Completely repropagate the rule-after-adding FUNCTION for all arguments supporting\r\nall assertions about PREDICATE in spec mts of MT.\nCompletely repropagate the rule-after-adding FUNCTION for all arguments supporting\nall assertions about PREDICATE in spec mts of MT.")
    public static final SubLObject repropagate_rule_after_adding_alt(SubLObject predicate, SubLObject function, SubLObject mt) {
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
                        if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, NIL, NIL)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, NIL, NIL);
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
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                    {
                                                        SubLObject done_var_19 = NIL;
                                                        SubLObject token_var_20 = NIL;
                                                        while (NIL == done_var_19) {
                                                            {
                                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_20);
                                                                SubLObject valid_21 = makeBoolean(token_var_20 != assertion);
                                                                if (NIL != valid_21) {
                                                                    com.cyc.cycjava.cycl.inference.harness.rule_after_adding.repropagate_rule_after_adding_internal(assertion, predicate);
                                                                }
                                                                done_var_19 = makeBoolean(NIL == valid_21);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
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
     * Completely repropagate the rule-after-adding FUNCTION for all arguments supporting
     * all assertions about PREDICATE in spec mts of MT.
     */
    @LispMethod(comment = "Completely repropagate the rule-after-adding FUNCTION for all arguments supporting\r\nall assertions about PREDICATE in spec mts of MT.\nCompletely repropagate the rule-after-adding FUNCTION for all arguments supporting\nall assertions about PREDICATE in spec mts of MT.")
    public static SubLObject repropagate_rule_after_adding(final SubLObject predicate, final SubLObject function, final SubLObject mt) {
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
                if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, NIL, NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                SubLObject done_var_$23 = NIL;
                                final SubLObject token_var_$24 = NIL;
                                while (NIL == done_var_$23) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                    final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(assertion));
                                    if (NIL != valid_$25) {
                                        repropagate_rule_after_adding_internal(assertion, predicate);
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
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                $mapping_target$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject repropagate_rule_after_adding_internal_alt(SubLObject assertion, SubLObject predicate) {
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
                                {
                                    SubLObject ignore_errors_tag = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_23 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                try {
                                                    {
                                                        SubLObject cdolist_list_var_24 = com.cyc.cycjava.cycl.inference.harness.rule_after_adding.gather_literals_with_pred(assertion, predicate);
                                                        SubLObject literal = NIL;
                                                        for (literal = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , literal = cdolist_list_var_24.first()) {
                                                            com.cyc.cycjava.cycl.inference.harness.rule_after_adding.handle_rule_after_adding($mapping_target$.getDynamicValue(thread), argument, literal, assertion);
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_23, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                    }
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

    public static SubLObject repropagate_rule_after_adding_internal(final SubLObject assertion, final SubLObject predicate) {
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
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$27 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            SubLObject cdolist_list_var_$28 = gather_literals_with_pred(assertion, predicate);
                            SubLObject literal = NIL;
                            literal = cdolist_list_var_$28.first();
                            while (NIL != cdolist_list_var_$28) {
                                handle_rule_after_adding($mapping_target$.getDynamicValue(thread), argument, literal, assertion);
                                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                literal = cdolist_list_var_$28.first();
                            } 
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$27, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
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

    public static final SubLObject gather_literals_with_pred_alt(SubLObject assertion, SubLObject pred) {
        {
            SubLObject literals = NIL;
            SubLObject v_arity = arity.arity(pred);
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf);
            SubLObject literal = NIL;
            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                if ((pred == literal_arg(literal, ZERO_INTEGER, UNPROVIDED)) && (NIL != formula_arityE(literal, v_arity, UNPROVIDED))) {
                    literals = cons(literal, literals);
                }
            }
            return literals;
        }
    }

    public static SubLObject gather_literals_with_pred(final SubLObject assertion, final SubLObject pred) {
        SubLObject literals = NIL;
        final SubLObject v_arity = arity.arity(pred);
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        SubLObject cdolist_list_var = clauses.pos_lits(cnf);
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (pred.eql(literal_arg(literal, ZERO_INTEGER, UNPROVIDED)) && (NIL != formula_arityE(literal, v_arity, UNPROVIDED))) {
                literals = cons(literal, literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return literals;
    }

    public static SubLObject declare_rule_after_adding_file() {
        declareFunction("clear_rule_after_addings", "CLEAR-RULE-AFTER-ADDINGS", 0, 0, false);
        declareFunction("clear_rule_after_removings", "CLEAR-RULE-AFTER-REMOVINGS", 0, 0, false);
        declareFunction("handle_rule_after_addings", "HANDLE-RULE-AFTER-ADDINGS", 2, 0, false);
        declareFunction("handle_rule_after_addings_int", "HANDLE-RULE-AFTER-ADDINGS-INT", 3, 0, false);
        declareFunction("handle_rule_after_removings", "HANDLE-RULE-AFTER-REMOVINGS", 2, 0, false);
        declareFunction("handle_rule_after_removings_int", "HANDLE-RULE-AFTER-REMOVINGS-INT", 3, 0, false);
        declareFunction("get_rule_after_addings", "GET-RULE-AFTER-ADDINGS", 1, 0, false);
        declareFunction("get_rule_after_removings", "GET-RULE-AFTER-REMOVINGS", 1, 0, false);
        declareFunction("handle_rule_after_adding", "HANDLE-RULE-AFTER-ADDING", 4, 0, false);
        declareFunction("handle_rule_after_removing", "HANDLE-RULE-AFTER-REMOVING", 4, 0, false);
        declareFunction("rebuild_rule_after_adding_caches", "REBUILD-RULE-AFTER-ADDING-CACHES", 0, 0, false);
        declareFunction("initialize_rule_after_addings_hash", "INITIALIZE-RULE-AFTER-ADDINGS-HASH", 0, 0, false);
        declareFunction("initialize_rule_after_removings_hash", "INITIALIZE-RULE-AFTER-REMOVINGS-HASH", 0, 0, false);
        declareFunction("recache_rule_after_addings", "RECACHE-RULE-AFTER-ADDINGS", 1, 0, false);
        declareFunction("recache_rule_after_removings", "RECACHE-RULE-AFTER-REMOVINGS", 1, 0, false);
        declareFunction("propagate_rule_after_adding", "PROPAGATE-RULE-AFTER-ADDING", 2, 0, false);
        declareFunction("repropagate_rule_after_adding", "REPROPAGATE-RULE-AFTER-ADDING", 3, 0, false);
        declareFunction("repropagate_rule_after_adding_internal", "REPROPAGATE-RULE-AFTER-ADDING-INTERNAL", 2, 0, false);
        declareFunction("gather_literals_with_pred", "GATHER-LITERALS-WITH-PRED", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_rule_after_adding_file_alt() {
        deflexical("*RULE-AFTER-ADDING-PREDICATES*", NIL);
        deflexical("*RULE-AFTER-ADDINGS-HASH*", NIL != boundp($rule_after_addings_hash$) ? ((SubLObject) ($rule_after_addings_hash$.getGlobalValue())) : NIL);
        deflexical("*RULE-AFTER-REMOVINGS-HASH*", NIL != boundp($rule_after_removings_hash$) ? ((SubLObject) ($rule_after_removings_hash$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_rule_after_adding_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*RULE-AFTER-ADDING-PREDICATES*", NIL);
            deflexical("*RULE-AFTER-ADDINGS-HASH*", SubLTrampolineFile.maybeDefault($rule_after_addings_hash$, $rule_after_addings_hash$, NIL));
            deflexical("*RULE-AFTER-REMOVINGS-HASH*", SubLTrampolineFile.maybeDefault($rule_after_removings_hash$, $rule_after_removings_hash$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RULE-AFTER-ADDINGS-HASH*", NIL != boundp($rule_after_addings_hash$) ? ((SubLObject) ($rule_after_addings_hash$.getGlobalValue())) : NIL);
            deflexical("*RULE-AFTER-REMOVINGS-HASH*", NIL != boundp($rule_after_removings_hash$) ? ((SubLObject) ($rule_after_removings_hash$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_rule_after_adding_file_Previous() {
        deflexical("*RULE-AFTER-ADDING-PREDICATES*", NIL);
        deflexical("*RULE-AFTER-ADDINGS-HASH*", SubLTrampolineFile.maybeDefault($rule_after_addings_hash$, $rule_after_addings_hash$, NIL));
        deflexical("*RULE-AFTER-REMOVINGS-HASH*", SubLTrampolineFile.maybeDefault($rule_after_removings_hash$, $rule_after_removings_hash$, NIL));
        return NIL;
    }

    public static SubLObject setup_rule_after_adding_file() {
        declare_defglobal($rule_after_addings_hash$);
        declare_defglobal($rule_after_removings_hash$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rule_after_adding_file();
    }

    @Override
    public void initializeVariables() {
        init_rule_after_adding_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rule_after_adding_file();
    }

    static {
    }

    static private final SubLList $list_alt4 = cons(makeSymbol("FUN"), makeSymbol("FUN-MT"));

    static private final SubLList $list_alt12 = list(makeSymbol("RULE-AFTER-ADDING-PRED"), makeSymbol("PRED"), makeSymbol("RULE-AFTER-ADDING"));

    static private final SubLList $list_alt14 = list(makeSymbol("RULE-AFTER-REMOVING-PRED"), makeSymbol("PRED"), makeSymbol("RULE-AFTER-REMOVING"));
}

/**
 * Total time: 388 ms
 */
