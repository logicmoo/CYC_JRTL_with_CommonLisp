/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.$dtp_constant$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logxor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SXHASH-EXTERNAL-KB
 * source file: /cyc/top/cycl/sxhash-external-kb.lisp
 * created:     2019/07/03 17:37:21
 */
public final class sxhash_external_kb extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sxhash_external_kb();

 public static final String myName = "com.cyc.cycjava.cycl.sxhash_external_kb";


    // deflexical
    /**
     * Temporary control variable to evaluate the efficiency benefits of caching.
     */
    @LispMethod(comment = "Temporary control variable to evaluate the efficiency benefits of caching.\ndeflexical")
    private static final SubLSymbol $sxhash_external_caching_enabled$ = makeSymbol("*SXHASH-EXTERNAL-CACHING-ENABLED*");

    private static final SubLList $list0 = list(makeSymbol("INLINE"), makeSymbol("SXHASH-EXTERNAL-CONSTANT"), makeSymbol("SXHASH-EXTERNAL-CONSTANT-INT"));

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol SXHASH_EXTERNAL_CONSTANT = makeSymbol("SXHASH-EXTERNAL-CONSTANT");

    private static final SubLSymbol $sxhash_external_constant_caching_state$ = makeSymbol("*SXHASH-EXTERNAL-CONSTANT-CACHING-STATE*");

    private static final SubLSymbol SXHASH_EXTERNAL_CONSTANT_METHOD = makeSymbol("SXHASH-EXTERNAL-CONSTANT-METHOD");

    private static final SubLList $list4 = list(makeSymbol("INLINE"), makeSymbol("SXHASH-EXTERNAL-NART"));

    private static final SubLSymbol SXHASH_EXTERNAL_NART_METHOD = makeSymbol("SXHASH-EXTERNAL-NART-METHOD");

    private static final SubLList $list6 = list(makeSymbol("INLINE"), makeSymbol("SXHASH-EXTERNAL-VARIABLE"));

    private static final SubLSymbol SXHASH_EXTERNAL_VARIABLE_METHOD = makeSymbol("SXHASH-EXTERNAL-VARIABLE-METHOD");

    private static final SubLList $list8 = list(makeSymbol("INLINE"), makeSymbol("SXHASH-EXTERNAL-ASSERTION"));

    private static final SubLSymbol SXHASH_EXTERNAL_ASSERTION_METHOD = makeSymbol("SXHASH-EXTERNAL-ASSERTION-METHOD");

    private static final SubLList $list10 = list(makeSymbol("INLINE"), makeSymbol("SXHASH-EXTERNAL-DEDUCTION"));

    private static final SubLSymbol SXHASH_EXTERNAL_DEDUCTION_METHOD = makeSymbol("SXHASH-EXTERNAL-DEDUCTION-METHOD");

    private static final SubLList $list12 = list(makeSymbol("INLINE"), makeSymbol("SXHASH-EXTERNAL-CLAUSE-STRUC"));

    private static final SubLSymbol SXHASH_EXTERNAL_CLAUSE_STRUC_METHOD = makeSymbol("SXHASH-EXTERNAL-CLAUSE-STRUC-METHOD");

    public static final SubLObject sxhash_external_constant_int_alt(SubLObject constant) {
        return sxhash_external.sxhash_external(constants_high.constant_external_id(constant));
    }

    public static SubLObject sxhash_external_constant_int(final SubLObject constant) {
        return sxhash_external.sxhash_external(constants_high.constant_external_id(constant));
    }

    public static final SubLObject clear_sxhash_external_constant_alt() {
        {
            SubLObject cs = $sxhash_external_constant_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_sxhash_external_constant() {
        final SubLObject cs = $sxhash_external_constant_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_sxhash_external_constant_alt(SubLObject constant) {
        return memoization_state.caching_state_remove_function_results_with_args($sxhash_external_constant_caching_state$.getGlobalValue(), list(constant), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_sxhash_external_constant(final SubLObject constant) {
        return memoization_state.caching_state_remove_function_results_with_args($sxhash_external_constant_caching_state$.getGlobalValue(), list(constant), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sxhash_external_constant_internal_alt(SubLObject constant) {
        return com.cyc.cycjava.cycl.sxhash_external_kb.sxhash_external_constant_int(constant);
    }

    public static SubLObject sxhash_external_constant_internal(final SubLObject constant) {
        return sxhash_external_constant_int(constant);
    }

    public static final SubLObject sxhash_external_constant_alt(SubLObject constant) {
        {
            SubLObject caching_state = $sxhash_external_constant_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(SXHASH_EXTERNAL_CONSTANT, $sxhash_external_constant_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, constant, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sxhash_external_kb.sxhash_external_constant_internal(constant)));
                    memoization_state.caching_state_put(caching_state, constant, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject sxhash_external_constant(final SubLObject constant) {
        SubLObject caching_state = $sxhash_external_constant_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SXHASH_EXTERNAL_CONSTANT, $sxhash_external_constant_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, constant, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sxhash_external_constant_internal(constant)));
            memoization_state.caching_state_put(caching_state, constant, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject sxhash_external_constant_method_alt(SubLObject v_object) {
        if (NIL == $sxhash_external_caching_enabled$.getGlobalValue()) {
            return com.cyc.cycjava.cycl.sxhash_external_kb.sxhash_external_constant_int(v_object);
        }
        return com.cyc.cycjava.cycl.sxhash_external_kb.sxhash_external_constant(v_object);
    }

    public static SubLObject sxhash_external_constant_method(final SubLObject v_object) {
        if (NIL == $sxhash_external_caching_enabled$.getGlobalValue()) {
            return sxhash_external_constant_int(v_object);
        }
        return sxhash_external_constant(v_object);
    }

    public static final SubLObject sxhash_external_nart_alt(SubLObject nart) {
        return sxhash_external.sxhash_external(narts_high.nart_hl_formula(nart));
    }

    public static SubLObject sxhash_external_nart(final SubLObject nart) {
        return sxhash_external.sxhash_external(narts_high.nart_hl_formula(nart));
    }

    public static final SubLObject sxhash_external_nart_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external_kb.sxhash_external_nart(v_object);
    }

    public static SubLObject sxhash_external_nart_method(final SubLObject v_object) {
        return sxhash_external_nart(v_object);
    }

    public static final SubLObject sxhash_external_variable_alt(SubLObject variable) {
        return sxhash_external.sxhash_external(variables.variable_id(variable));
    }

    public static SubLObject sxhash_external_variable(final SubLObject variable) {
        return sxhash_external.sxhash_external(variables.variable_id(variable));
    }

    public static final SubLObject sxhash_external_variable_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external_kb.sxhash_external_variable(v_object);
    }

    public static SubLObject sxhash_external_variable_method(final SubLObject v_object) {
        return sxhash_external_variable(v_object);
    }

    public static final SubLObject sxhash_external_assertion_alt(SubLObject assertion) {
        return logxor(sxhash_external.sxhash_external(assertions_high.assertion_cnf(assertion)), sxhash_external.sxhash_external(assertions_high.assertion_mt(assertion)));
    }

    public static SubLObject sxhash_external_assertion(final SubLObject assertion) {
        return logxor(sxhash_external.sxhash_external(assertions_high.assertion_cnf(assertion)), sxhash_external.sxhash_external(assertions_high.assertion_mt(assertion)));
    }

    public static final SubLObject sxhash_external_assertion_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external_kb.sxhash_external_assertion(v_object);
    }

    public static SubLObject sxhash_external_assertion_method(final SubLObject v_object) {
        return sxhash_external_assertion(v_object);
    }

    public static final SubLObject sxhash_external_deduction_alt(SubLObject deduction) {
        return logxor(new SubLObject[]{ sxhash_external.sxhash_external(deductions_high.deduction_assertion(deduction)), sxhash_external.sxhash_external(deductions_high.deduction_supports(deduction)), sxhash_external.sxhash_external(arguments.argument_truth(deduction)) });
    }

    public static SubLObject sxhash_external_deduction(final SubLObject deduction) {
        return logxor(new SubLObject[]{ sxhash_external.sxhash_external(deductions_high.deduction_supported_object(deduction)), sxhash_external.sxhash_external(deductions_high.deduction_supports(deduction)), sxhash_external.sxhash_external(arguments.argument_truth(deduction)) });
    }

    public static final SubLObject sxhash_external_deduction_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external_kb.sxhash_external_deduction(v_object);
    }

    public static SubLObject sxhash_external_deduction_method(final SubLObject v_object) {
        return sxhash_external_deduction(v_object);
    }

    public static final SubLObject sxhash_external_clause_struc_alt(SubLObject clause_struc) {
        return sxhash_external.sxhash_external(clause_strucs.clause_struc_cnf(clause_struc));
    }

    public static SubLObject sxhash_external_clause_struc(final SubLObject clause_struc) {
        return sxhash_external.sxhash_external(clause_strucs.clause_struc_cnf(clause_struc));
    }

    public static final SubLObject sxhash_external_clause_struc_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.sxhash_external_kb.sxhash_external_clause_struc(v_object);
    }

    public static SubLObject sxhash_external_clause_struc_method(final SubLObject v_object) {
        return sxhash_external_clause_struc(v_object);
    }

    public static SubLObject declare_sxhash_external_kb_file() {
        declareFunction("sxhash_external_constant_int", "SXHASH-EXTERNAL-CONSTANT-INT", 1, 0, false);
        declareFunction("clear_sxhash_external_constant", "CLEAR-SXHASH-EXTERNAL-CONSTANT", 0, 0, false);
        declareFunction("remove_sxhash_external_constant", "REMOVE-SXHASH-EXTERNAL-CONSTANT", 1, 0, false);
        declareFunction("sxhash_external_constant_internal", "SXHASH-EXTERNAL-CONSTANT-INTERNAL", 1, 0, false);
        declareFunction("sxhash_external_constant", "SXHASH-EXTERNAL-CONSTANT", 1, 0, false);
        declareFunction("sxhash_external_constant_method", "SXHASH-EXTERNAL-CONSTANT-METHOD", 1, 0, false);
        declareFunction("sxhash_external_nart", "SXHASH-EXTERNAL-NART", 1, 0, false);
        declareFunction("sxhash_external_nart_method", "SXHASH-EXTERNAL-NART-METHOD", 1, 0, false);
        declareFunction("sxhash_external_variable", "SXHASH-EXTERNAL-VARIABLE", 1, 0, false);
        declareFunction("sxhash_external_variable_method", "SXHASH-EXTERNAL-VARIABLE-METHOD", 1, 0, false);
        declareFunction("sxhash_external_assertion", "SXHASH-EXTERNAL-ASSERTION", 1, 0, false);
        declareFunction("sxhash_external_assertion_method", "SXHASH-EXTERNAL-ASSERTION-METHOD", 1, 0, false);
        declareFunction("sxhash_external_deduction", "SXHASH-EXTERNAL-DEDUCTION", 1, 0, false);
        declareFunction("sxhash_external_deduction_method", "SXHASH-EXTERNAL-DEDUCTION-METHOD", 1, 0, false);
        declareFunction("sxhash_external_clause_struc", "SXHASH-EXTERNAL-CLAUSE-STRUC", 1, 0, false);
        declareFunction("sxhash_external_clause_struc_method", "SXHASH-EXTERNAL-CLAUSE-STRUC-METHOD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sxhash_external_kb_file() {
        deflexical("*SXHASH-EXTERNAL-CACHING-ENABLED*", T);
        deflexical("*SXHASH-EXTERNAL-CONSTANT-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_sxhash_external_kb_file() {
        SubLSpecialOperatorDeclarations.proclaim($list0);
        memoization_state.note_globally_cached_function(SXHASH_EXTERNAL_CONSTANT);
        register_method(sxhash_external.$sxhash_external_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_CONSTANT_METHOD));
        SubLSpecialOperatorDeclarations.proclaim($list4);
        register_method(sxhash_external.$sxhash_external_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_NART_METHOD));
        SubLSpecialOperatorDeclarations.proclaim($list6);
        register_method(sxhash_external.$sxhash_external_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_VARIABLE_METHOD));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        register_method(sxhash_external.$sxhash_external_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_ASSERTION_METHOD));
        SubLSpecialOperatorDeclarations.proclaim($list10);
        register_method(sxhash_external.$sxhash_external_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_DEDUCTION_METHOD));
        SubLSpecialOperatorDeclarations.proclaim($list12);
        register_method(sxhash_external.$sxhash_external_method_table$.getGlobalValue(), clause_strucs.$dtp_clause_struc$.getGlobalValue(), symbol_function(SXHASH_EXTERNAL_CLAUSE_STRUC_METHOD));
        return NIL;
    }

    public static final SubLSymbol $kw2$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    @Override
    public void declareFunctions() {
        declare_sxhash_external_kb_file();
    }

    @Override
    public void initializeVariables() {
        init_sxhash_external_kb_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sxhash_external_kb_file();
    }

    static {
    }
}

/**
 * Total time: 60 ms
 */
