/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FORMULA-PATTERN-MATCH
 * source file: /cyc/top/cycl/formula-pattern-match.lisp
 * created:     2019/07/03 17:37:37
 */
public final class formula_pattern_match extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new formula_pattern_match();

 public static final String myName = "com.cyc.cycjava.cycl.formula_pattern_match";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pattern_matches_formula_atomic_methods$ = makeSymbol("*PATTERN-MATCHES-FORMULA-ATOMIC-METHODS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pattern_matches_formula_methods$ = makeSymbol("*PATTERN-MATCHES-FORMULA-METHODS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ list(makeKeyword("FULLY-BOUND"), makeSymbol("FULLY-BOUND-P")), list(makeKeyword("NOT-FULLY-BOUND"), makeSymbol("NOT-FULLY-BOUND-P")), list(makeKeyword("STRING"), makeSymbol("STRINGP")), list(makeKeyword("INTEGER"), makeSymbol("INTEGERP")), list($FORT, makeSymbol("FORT-P")), list($HLMT, makeSymbol("HLMT-P")), list(makeKeyword("CLOSED-HLMT"), makeSymbol("CLOSED-HLMT-P")), list(makeKeyword("CONSTANT"), makeSymbol("CONSTANT-P")), list($NART, makeSymbol("NART-P")), list(makeKeyword("CLOSED-NAUT"), makeSymbol("CLOSED-NAUT?")), list(makeKeyword("OPEN-NAUT"), makeSymbol("OPEN-NAUT?")), list(makeKeyword("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeKeyword("SENTENCE"), makeSymbol("CYCL-SENTENCE-P")), list(makeKeyword("VARIABLE"), makeSymbol("VARIABLE-P")), list(makeKeyword("EL-VARIABLE"), makeSymbol("EL-VARIABLE-P")), list(makeKeyword("COLLECTION-FORT"), makeSymbol("COLLECTION-P")), list(makeKeyword("PREDICATE-FORT"), makeSymbol("PREDICATE-P")), list(makeKeyword("FUNCTOR-FORT"), makeSymbol("FUNCTOR-P")), list(makeKeyword("MT-FORT"), makeSymbol("MICROTHEORY-P")) });

    static private final SubLList $list1 = list(new SubLObject[]{ list(makeKeyword("ISA"), makeSymbol("PATTERN-MATCHES-FORMULA-ISA-METHOD")), list(makeKeyword("ISA-MEMOIZED"), makeSymbol("PATTERN-MATCHES-FORMULA-ISA-MEMOIZED-METHOD")), list(makeKeyword("NOT-ISA-DISJOINT"), makeSymbol("PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD")), list(makeKeyword("NOT-ISA-DISJOINT-MEMOIZED"), makeSymbol("PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-MEMOIZED-METHOD")), list(makeKeyword("GENLS"), makeSymbol("PATTERN-MATCHES-FORMULA-GENLS-METHOD")), list($SPEC, makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-METHOD")), list(makeKeyword("NAT"), makeSymbol("PATTERN-MATCHES-FORMULA-NAT-METHOD")), list(makeKeyword("UNIFY"), makeSymbol("PATTERN-MATCHES-FORMULA-UNIFY-METHOD")), list(makeKeyword("GENL-PRED"), makeSymbol("PATTERN-MATCHES-FORMULA-GENL-PRED-METHOD")), list(makeKeyword("GENL-INVERSE"), makeSymbol("PATTERN-MATCHES-FORMULA-GENL-INVERSE-METHOD")), list(makeKeyword("SPEC-PRED"), makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-PRED-METHOD")), list(makeKeyword("SPEC-INVERSE"), makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-INVERSE-METHOD")) });

    static private final SubLList $list2 = list(makeSymbol("PATTERN-OPERATOR"), makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLSymbol MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD = makeSymbol("MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD");

    private static final SubLSymbol MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD = makeSymbol("MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD");

    private static final SubLList $list5 = list(makeSymbol("PATTERN-OPERATOR"), makeSymbol("SUBPATTERN"));

    static private final SubLList $list6 = list(makeSymbol("PATTERN-OPERATOR"), makeSymbol("PREDICATE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLSymbol PATTERN_MATCHES_FORMULA = makeSymbol("PATTERN-MATCHES-FORMULA");

    private static final SubLList $list14 = list(new SubLObject[]{ list(list(makeKeyword("ANYTHING"), ONE_INTEGER), T), list(list(makeKeyword("ANYTHING"), makeString("test")), T), list(list(makeKeyword("ANYTHING"), reader_make_constant_shell("Thing")), T), list(list(makeKeyword("ANYTHING"), list(reader_make_constant_shell("and"))), T), list(list(makeKeyword("ANYTHING"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))), T), list(list(makeKeyword("NOTHING"), ONE_INTEGER), NIL), list(list(makeKeyword("NOTHING"), makeString("test")), NIL), list(list(makeKeyword("NOTHING"), reader_make_constant_shell("Thing")), NIL), list(list(makeKeyword("NOTHING"), list(reader_make_constant_shell("and"))), NIL), list(list(makeKeyword("NOTHING"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))), NIL), list(list(list($TEST, makeSymbol("STRINGP")), makeString("a")), T), list(list(list($TEST, makeSymbol("STRINGP")), makeString("test")), T), list(list(list($TEST, makeSymbol("STRINGP")), makeString("TEST")), T), list(list(list($TEST, makeSymbol("STRINGP")), makeString("")), T), list(list(list($TEST, makeSymbol("STRINGP")), ONE_INTEGER), NIL), list(list(list($TEST, makeSymbol("STRINGP")), reader_make_constant_shell("Thing")), NIL), list(list(list($TEST, makeSymbol("STRINGP")), list(reader_make_constant_shell("and"))), NIL), list(list(list($TEST, makeSymbol("STRINGP")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))), NIL), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("isa"), ONE_INTEGER, reader_make_constant_shell("Thing"))), T), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("PlusFn"), ONE_INTEGER, TWO_INTEGER), reader_make_constant_shell("Thing"))), T), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("genls"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing"))), NIL), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"))), NIL), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing"))), NIL), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), makeInteger(212))), NIL), list(list(list(makeKeyword("UNIFY"), makeInteger(212)), makeInteger(212)), T), list(list(list(makeKeyword("UNIFY"), reader_make_constant_shell("Thing")), makeInteger(212)), NIL) });

    // Definitions
    /**
     * Return T iff PATTERN matches FORMULA.
     */
    @LispMethod(comment = "Return T iff PATTERN matches FORMULA.")
    public static final SubLObject pattern_matches_formula_alt(SubLObject pattern, SubLObject formula) {
        return com.cyc.cycjava.cycl.formula_pattern_match.pattern_matches_formula_internal(pattern, formula);
    }

    // Definitions
    /**
     * Return T iff PATTERN matches FORMULA.
     */
    @LispMethod(comment = "Return T iff PATTERN matches FORMULA.")
    public static SubLObject pattern_matches_formula(final SubLObject pattern, final SubLObject formula) {
        return pattern_matches_formula_internal(pattern, formula);
    }

    /**
     * Return T iff PATTERN matches FORMULA.
     * :BIND expressions are not allowed within PATTERN
     */
    @LispMethod(comment = "Return T iff PATTERN matches FORMULA.\r\n:BIND expressions are not allowed within PATTERN\nReturn T iff PATTERN matches FORMULA.\n:BIND expressions are not allowed within PATTERN")
    public static final SubLObject pattern_matches_formula_without_bindings_alt(SubLObject pattern, SubLObject formula) {
        return com.cyc.cycjava.cycl.formula_pattern_match.pattern_matches_formula_without_bindings_internal(pattern, formula);
    }

    /**
     * Return T iff PATTERN matches FORMULA.
     * :BIND expressions are not allowed within PATTERN
     */
    @LispMethod(comment = "Return T iff PATTERN matches FORMULA.\r\n:BIND expressions are not allowed within PATTERN\nReturn T iff PATTERN matches FORMULA.\n:BIND expressions are not allowed within PATTERN")
    public static SubLObject pattern_matches_formula_without_bindings(final SubLObject pattern, final SubLObject formula) {
        return pattern_matches_formula_without_bindings_internal(pattern, formula);
    }

    /**
     * Return T iff FORMULA matches PATTERN.
     */
    @LispMethod(comment = "Return T iff FORMULA matches PATTERN.")
    public static final SubLObject formula_matches_pattern_alt(SubLObject formula, SubLObject pattern) {
        return com.cyc.cycjava.cycl.formula_pattern_match.pattern_matches_formula_internal(pattern, formula);
    }

    /**
     * Return T iff FORMULA matches PATTERN.
     */
    @LispMethod(comment = "Return T iff FORMULA matches PATTERN.")
    public static SubLObject formula_matches_pattern(final SubLObject formula, final SubLObject pattern) {
        return pattern_matches_formula_internal(pattern, formula);
    }

    public static final SubLObject pattern_matches_formula_internal_alt(SubLObject pattern, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject success = NIL;
                SubLObject v_bindings = NIL;
                {
                    SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pattern_match.$pattern_matches_tree_methods$.currentBinding(thread);
                    try {
                        pattern_match.$pattern_matches_tree_atomic_methods$.bind($pattern_matches_formula_atomic_methods$.getGlobalValue(), thread);
                        pattern_match.$pattern_matches_tree_methods$.bind($pattern_matches_formula_methods$.getGlobalValue(), thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject match_success = pattern_match.pattern_matches_tree(pattern, formula);
                            SubLObject match_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            success = match_success;
                            v_bindings = match_bindings;
                        }
                    } finally {
                        pattern_match.$pattern_matches_tree_methods$.rebind(_prev_bind_1, thread);
                        pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(success, v_bindings);
            }
        }
    }

    public static SubLObject pattern_matches_formula_internal(final SubLObject pattern, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = NIL;
        SubLObject v_bindings = NIL;
        final SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pattern_match.$pattern_matches_tree_methods$.currentBinding(thread);
        try {
            pattern_match.$pattern_matches_tree_atomic_methods$.bind($pattern_matches_formula_atomic_methods$.getGlobalValue(), thread);
            pattern_match.$pattern_matches_tree_methods$.bind($pattern_matches_formula_methods$.getGlobalValue(), thread);
            thread.resetMultipleValues();
            final SubLObject match_success = pattern_match.pattern_matches_tree(pattern, formula);
            final SubLObject match_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            success = match_success;
            v_bindings = match_bindings;
        } finally {
            pattern_match.$pattern_matches_tree_methods$.rebind(_prev_bind_2, thread);
            pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(success, v_bindings);
    }

    public static final SubLObject pattern_matches_formula_without_bindings_internal_alt(SubLObject pattern, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject success = NIL;
                {
                    SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pattern_match.$pattern_matches_tree_methods$.currentBinding(thread);
                    try {
                        pattern_match.$pattern_matches_tree_atomic_methods$.bind($pattern_matches_formula_atomic_methods$.getGlobalValue(), thread);
                        pattern_match.$pattern_matches_tree_methods$.bind($pattern_matches_formula_methods$.getGlobalValue(), thread);
                        success = pattern_match.pattern_matches_tree_without_bindings(pattern, formula);
                    } finally {
                        pattern_match.$pattern_matches_tree_methods$.rebind(_prev_bind_1, thread);
                        pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
                    }
                }
                return success;
            }
        }
    }

    public static SubLObject pattern_matches_formula_without_bindings_internal(final SubLObject pattern, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = NIL;
        final SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pattern_match.$pattern_matches_tree_methods$.currentBinding(thread);
        try {
            pattern_match.$pattern_matches_tree_atomic_methods$.bind($pattern_matches_formula_atomic_methods$.getGlobalValue(), thread);
            pattern_match.$pattern_matches_tree_methods$.bind($pattern_matches_formula_methods$.getGlobalValue(), thread);
            success = pattern_match.pattern_matches_tree_without_bindings(pattern, formula);
        } finally {
            pattern_match.$pattern_matches_tree_methods$.rebind(_prev_bind_2, thread);
            pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
        }
        return success;
    }

    public static final SubLObject pattern_matches_formula_isa_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject collection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            collection = current.first();
            current = current.rest();
            {
                SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt2);
                current = current.rest();
                if (NIL == current) {
                    return com.cyc.cycjava.cycl.formula_pattern_match.call_pattern_matches_formula_isa_method(formula, collection, mt);
                } else {
                    cdestructuring_bind_error(datum, $list_alt2);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_isa_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, pattern, $list2);
        current = current.rest();
        if (NIL == current) {
            return call_pattern_matches_formula_isa_method(formula, collection, mt);
        }
        cdestructuring_bind_error(pattern, $list2);
        return NIL;
    }

    public static final SubLObject call_pattern_matches_formula_isa_method_alt(SubLObject formula, SubLObject collection, SubLObject mt) {
        return at_defns.quiet_has_typeP(formula, collection, mt);
    }

    public static SubLObject call_pattern_matches_formula_isa_method(final SubLObject formula, final SubLObject collection, final SubLObject mt) {
        return at_defns.quiet_has_typeP(formula, collection, mt);
    }

    public static final SubLObject pattern_matches_formula_isa_memoized_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject collection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            collection = current.first();
            current = current.rest();
            {
                SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt2);
                current = current.rest();
                if (NIL == current) {
                    return com.cyc.cycjava.cycl.formula_pattern_match.memoized_call_pattern_matches_formula_isa_method(formula, collection, mt, UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum, $list_alt2);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_isa_memoized_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, pattern, $list2);
        current = current.rest();
        if (NIL == current) {
            return memoized_call_pattern_matches_formula_isa_method(formula, collection, mt, UNPROVIDED);
        }
        cdestructuring_bind_error(pattern, $list2);
        return NIL;
    }

    public static final SubLObject memoized_call_pattern_matches_formula_isa_method_internal_alt(SubLObject formula, SubLObject collection, SubLObject mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return com.cyc.cycjava.cycl.formula_pattern_match.call_pattern_matches_formula_isa_method(formula, collection, mt);
    }

    public static SubLObject memoized_call_pattern_matches_formula_isa_method_internal(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return call_pattern_matches_formula_isa_method(formula, collection, mt);
    }

    public static final SubLObject memoized_call_pattern_matches_formula_isa_method_alt(SubLObject formula, SubLObject collection, SubLObject mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.formula_pattern_match.memoized_call_pattern_matches_formula_isa_method_internal(formula, collection, mt, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(formula, collection, mt, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw4$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (formula.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (collection.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.formula_pattern_match.memoized_call_pattern_matches_formula_isa_method_internal(formula, collection, mt, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, collection, mt, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject memoized_call_pattern_matches_formula_isa_method(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_call_pattern_matches_formula_isa_method_internal(formula, collection, mt, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(formula, collection, mt, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (collection.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_call_pattern_matches_formula_isa_method_internal(formula, collection, mt, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, collection, mt, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject pattern_matches_formula_not_isa_disjoint_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject collection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            collection = current.first();
            current = current.rest();
            {
                SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt2);
                current = current.rest();
                if (NIL == current) {
                    return com.cyc.cycjava.cycl.formula_pattern_match.call_pattern_matches_formula_not_isa_disjoint_method(formula, collection, mt);
                } else {
                    cdestructuring_bind_error(datum, $list_alt2);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_not_isa_disjoint_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, pattern, $list2);
        current = current.rest();
        if (NIL == current) {
            return call_pattern_matches_formula_not_isa_disjoint_method(formula, collection, mt);
        }
        cdestructuring_bind_error(pattern, $list2);
        return NIL;
    }

    public static final SubLObject call_pattern_matches_formula_not_isa_disjoint_method_alt(SubLObject formula, SubLObject collection, SubLObject mt) {
        return makeBoolean(NIL == at_defns.quiet_not_has_typeP(formula, collection, mt));
    }

    public static SubLObject call_pattern_matches_formula_not_isa_disjoint_method(final SubLObject formula, final SubLObject collection, final SubLObject mt) {
        return makeBoolean(NIL == at_defns.quiet_not_has_typeP(formula, collection, mt));
    }

    public static final SubLObject pattern_matches_formula_not_isa_disjoint_memoized_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject collection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            collection = current.first();
            current = current.rest();
            {
                SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt2);
                current = current.rest();
                if (NIL == current) {
                    return com.cyc.cycjava.cycl.formula_pattern_match.memoized_call_pattern_matches_formula_not_isa_disjoint_method(formula, collection, mt, UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum, $list_alt2);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_not_isa_disjoint_memoized_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, pattern, $list2);
        current = current.rest();
        if (NIL == current) {
            return memoized_call_pattern_matches_formula_not_isa_disjoint_method(formula, collection, mt, UNPROVIDED);
        }
        cdestructuring_bind_error(pattern, $list2);
        return NIL;
    }

    public static final SubLObject memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal_alt(SubLObject formula, SubLObject collection, SubLObject mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return com.cyc.cycjava.cycl.formula_pattern_match.call_pattern_matches_formula_not_isa_disjoint_method(formula, collection, mt);
    }

    public static SubLObject memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return call_pattern_matches_formula_not_isa_disjoint_method(formula, collection, mt);
    }

    public static final SubLObject memoized_call_pattern_matches_formula_not_isa_disjoint_method_alt(SubLObject formula, SubLObject collection, SubLObject mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.formula_pattern_match.memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal(formula, collection, mt, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(formula, collection, mt, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw4$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (formula.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (collection.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.formula_pattern_match.memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal(formula, collection, mt, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, collection, mt, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject memoized_call_pattern_matches_formula_not_isa_disjoint_method(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal(formula, collection, mt, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(formula, collection, mt, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (collection.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal(formula, collection, mt, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, collection, mt, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject pattern_matches_formula_genls_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject collection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            collection = current.first();
            current = current.rest();
            {
                SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt2);
                current = current.rest();
                if (NIL == current) {
                    return makeBoolean((NIL != term.el_fort_p(formula)) && (NIL != genls.genlsP(formula, collection, mt, UNPROVIDED)));
                } else {
                    cdestructuring_bind_error(datum, $list_alt2);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_genls_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, pattern, $list2);
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != term.el_fort_p(formula)) && (NIL != genls.genlsP(formula, collection, mt, UNPROVIDED)));
        }
        cdestructuring_bind_error(pattern, $list2);
        return NIL;
    }

    public static final SubLObject pattern_matches_formula_spec_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject collection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            collection = current.first();
            current = current.rest();
            {
                SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt2);
                current = current.rest();
                if (NIL == current) {
                    return makeBoolean((NIL != term.el_fort_p(formula)) && (NIL != genls.specP(formula, collection, mt, UNPROVIDED)));
                } else {
                    cdestructuring_bind_error(datum, $list_alt2);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_spec_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject collection = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, pattern, $list2);
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != term.el_fort_p(formula)) && (NIL != genls.specP(formula, collection, mt, UNPROVIDED)));
        }
        cdestructuring_bind_error(pattern, $list2);
        return NIL;
    }

    public static final SubLObject pattern_matches_formula_nat_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject subpattern = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt6);
            subpattern = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != nart_handles.nart_p(formula)) {
                    return pattern_match.pattern_matches_tree_internal(subpattern, narts_high.nart_el_formula(formula));
                } else {
                    return pattern_match.pattern_matches_tree_internal(subpattern, formula);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt6);
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_nat_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject subpattern = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list5);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list5);
        subpattern = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(pattern, $list5);
            return NIL;
        }
        if (NIL != nart_handles.nart_p(formula)) {
            return pattern_match.pattern_matches_tree_internal(subpattern, narts_high.nart_el_formula(formula));
        }
        return pattern_match.pattern_matches_tree_internal(subpattern, formula);
    }

    public static final SubLObject pattern_matches_formula_unify_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject subpattern = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt6);
            subpattern = current.first();
            current = current.rest();
            if (NIL == current) {
                return unification.unify_possible(subpattern, formula);
            } else {
                cdestructuring_bind_error(datum, $list_alt6);
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_unify_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject subpattern = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list5);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list5);
        subpattern = current.first();
        current = current.rest();
        if (NIL == current) {
            return unification.unify_possible(subpattern, formula);
        }
        cdestructuring_bind_error(pattern, $list5);
        return NIL;
    }

    public static final SubLObject pattern_matches_formula_genl_pred_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            predicate = current.first();
            current = current.rest();
            {
                SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt7);
                current = current.rest();
                if (NIL == current) {
                    return makeBoolean((NIL != forts.fort_p(formula)) && (NIL != genl_predicates.genl_predicateP(formula, predicate, mt, UNPROVIDED)));
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_genl_pred_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list6);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list6);
        predicate = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, pattern, $list6);
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != forts.fort_p(formula)) && (NIL != genl_predicates.genl_predicateP(formula, predicate, mt, UNPROVIDED)));
        }
        cdestructuring_bind_error(pattern, $list6);
        return NIL;
    }

    public static final SubLObject pattern_matches_formula_genl_inverse_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            predicate = current.first();
            current = current.rest();
            {
                SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt7);
                current = current.rest();
                if (NIL == current) {
                    return makeBoolean((NIL != forts.fort_p(formula)) && (NIL != genl_predicates.genl_inverseP(formula, predicate, mt, UNPROVIDED)));
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_genl_inverse_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list6);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list6);
        predicate = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, pattern, $list6);
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != forts.fort_p(formula)) && (NIL != genl_predicates.genl_inverseP(formula, predicate, mt, UNPROVIDED)));
        }
        cdestructuring_bind_error(pattern, $list6);
        return NIL;
    }

    public static final SubLObject pattern_matches_formula_spec_pred_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            predicate = current.first();
            current = current.rest();
            {
                SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt7);
                current = current.rest();
                if (NIL == current) {
                    return makeBoolean((NIL != forts.fort_p(formula)) && (NIL != genl_predicates.spec_predicateP(formula, predicate, mt, UNPROVIDED)));
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_spec_pred_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list6);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list6);
        predicate = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, pattern, $list6);
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != forts.fort_p(formula)) && (NIL != genl_predicates.spec_predicateP(formula, predicate, mt, UNPROVIDED)));
        }
        cdestructuring_bind_error(pattern, $list6);
        return NIL;
    }

    public static final SubLObject pattern_matches_formula_spec_inverse_method_alt(SubLObject pattern, SubLObject formula) {
        {
            SubLObject datum = pattern;
            SubLObject current = datum;
            SubLObject pattern_operator = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            pattern_operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            predicate = current.first();
            current = current.rest();
            {
                SubLObject mt = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt7);
                current = current.rest();
                if (NIL == current) {
                    return makeBoolean((NIL != forts.fort_p(formula)) && (NIL != genl_predicates.spec_inverseP(formula, predicate, mt, UNPROVIDED)));
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
            }
        }
        return NIL;
    }

    public static SubLObject pattern_matches_formula_spec_inverse_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list6);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list6);
        predicate = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, pattern, $list6);
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != forts.fort_p(formula)) && (NIL != genl_predicates.spec_inverseP(formula, predicate, mt, UNPROVIDED)));
        }
        cdestructuring_bind_error(pattern, $list6);
        return NIL;
    }

    /**
     * Use PATTERN to transform FORMULA, assuming BINDINGS.
     */
    @LispMethod(comment = "Use PATTERN to transform FORMULA, assuming BINDINGS.")
    public static final SubLObject pattern_transform_formula_alt(SubLObject pattern, SubLObject formula, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        return com.cyc.cycjava.cycl.formula_pattern_match.pattern_transform_formula_internal(pattern, formula, v_bindings);
    }

    @LispMethod(comment = "Use PATTERN to transform FORMULA, assuming BINDINGS.")
    public static SubLObject pattern_transform_formula(final SubLObject pattern, final SubLObject formula, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        return pattern_transform_formula_internal(pattern, formula, v_bindings);
    }

    /**
     * Transform FORMULA using PATTERN, assuming BINDINGS.
     */
    @LispMethod(comment = "Transform FORMULA using PATTERN, assuming BINDINGS.")
    public static final SubLObject formula_transform_pattern_alt(SubLObject formula, SubLObject pattern, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        return com.cyc.cycjava.cycl.formula_pattern_match.pattern_transform_formula_internal(pattern, formula, v_bindings);
    }

    @LispMethod(comment = "Transform FORMULA using PATTERN, assuming BINDINGS.")
    public static SubLObject formula_transform_pattern(final SubLObject formula, final SubLObject pattern, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        return pattern_transform_formula_internal(pattern, formula, v_bindings);
    }

    public static final SubLObject pattern_transform_formula_internal_alt(SubLObject pattern, SubLObject formula, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answer_transform = NIL;
                SubLObject answer_bindings = NIL;
                {
                    SubLObject _prev_bind_0 = pattern_match.$pattern_transform_match_method$.currentBinding(thread);
                    try {
                        pattern_match.$pattern_transform_match_method$.bind(PATTERN_MATCHES_FORMULA, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject sub_transform = pattern_match.pattern_transform_tree(pattern, formula, v_bindings);
                            SubLObject sub_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            answer_transform = sub_transform;
                            answer_bindings = sub_bindings;
                        }
                    } finally {
                        pattern_match.$pattern_transform_match_method$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(answer_transform, answer_bindings);
            }
        }
    }

    public static SubLObject pattern_transform_formula_internal(final SubLObject pattern, final SubLObject formula, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answer_transform = NIL;
        SubLObject answer_bindings = NIL;
        final SubLObject _prev_bind_0 = pattern_match.$pattern_transform_match_method$.currentBinding(thread);
        try {
            pattern_match.$pattern_transform_match_method$.bind(PATTERN_MATCHES_FORMULA, thread);
            thread.resetMultipleValues();
            final SubLObject sub_transform = pattern_match.pattern_transform_tree(pattern, formula, v_bindings);
            final SubLObject sub_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            answer_transform = sub_transform;
            answer_bindings = sub_bindings;
        } finally {
            pattern_match.$pattern_transform_match_method$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(answer_transform, answer_bindings);
    }

    public static SubLObject declare_formula_pattern_match_file() {
        declareFunction("pattern_matches_formula", "PATTERN-MATCHES-FORMULA", 2, 0, false);
        new formula_pattern_match.$pattern_matches_formula$BinaryFunction();
        declareFunction("pattern_matches_formula_without_bindings", "PATTERN-MATCHES-FORMULA-WITHOUT-BINDINGS", 2, 0, false);
        declareFunction("formula_matches_pattern", "FORMULA-MATCHES-PATTERN", 2, 0, false);
        declareFunction("pattern_matches_formula_internal", "PATTERN-MATCHES-FORMULA-INTERNAL", 2, 0, false);
        declareFunction("pattern_matches_formula_without_bindings_internal", "PATTERN-MATCHES-FORMULA-WITHOUT-BINDINGS-INTERNAL", 2, 0, false);
        declareFunction("pattern_matches_formula_isa_method", "PATTERN-MATCHES-FORMULA-ISA-METHOD", 2, 0, false);
        declareFunction("call_pattern_matches_formula_isa_method", "CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD", 3, 0, false);
        declareFunction("pattern_matches_formula_isa_memoized_method", "PATTERN-MATCHES-FORMULA-ISA-MEMOIZED-METHOD", 2, 0, false);
        declareFunction("memoized_call_pattern_matches_formula_isa_method_internal", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD-INTERNAL", 3, 1, false);
        declareFunction("memoized_call_pattern_matches_formula_isa_method", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD", 3, 1, false);
        declareFunction("pattern_matches_formula_not_isa_disjoint_method", "PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 2, 0, false);
        declareFunction("call_pattern_matches_formula_not_isa_disjoint_method", "CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 3, 0, false);
        declareFunction("pattern_matches_formula_not_isa_disjoint_memoized_method", "PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-MEMOIZED-METHOD", 2, 0, false);
        declareFunction("memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD-INTERNAL", 3, 1, false);
        declareFunction("memoized_call_pattern_matches_formula_not_isa_disjoint_method", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 3, 1, false);
        declareFunction("pattern_matches_formula_genls_method", "PATTERN-MATCHES-FORMULA-GENLS-METHOD", 2, 0, false);
        declareFunction("pattern_matches_formula_spec_method", "PATTERN-MATCHES-FORMULA-SPEC-METHOD", 2, 0, false);
        declareFunction("pattern_matches_formula_nat_method", "PATTERN-MATCHES-FORMULA-NAT-METHOD", 2, 0, false);
        new formula_pattern_match.$pattern_matches_formula_nat_method$BinaryFunction();
        declareFunction("pattern_matches_formula_unify_method", "PATTERN-MATCHES-FORMULA-UNIFY-METHOD", 2, 0, false);
        declareFunction("pattern_matches_formula_genl_pred_method", "PATTERN-MATCHES-FORMULA-GENL-PRED-METHOD", 2, 0, false);
        declareFunction("pattern_matches_formula_genl_inverse_method", "PATTERN-MATCHES-FORMULA-GENL-INVERSE-METHOD", 2, 0, false);
        declareFunction("pattern_matches_formula_spec_pred_method", "PATTERN-MATCHES-FORMULA-SPEC-PRED-METHOD", 2, 0, false);
        declareFunction("pattern_matches_formula_spec_inverse_method", "PATTERN-MATCHES-FORMULA-SPEC-INVERSE-METHOD", 2, 0, false);
        declareFunction("pattern_transform_formula", "PATTERN-TRANSFORM-FORMULA", 2, 1, false);
        declareFunction("formula_transform_pattern", "FORMULA-TRANSFORM-PATTERN", 2, 1, false);
        declareFunction("pattern_transform_formula_internal", "PATTERN-TRANSFORM-FORMULA-INTERNAL", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_formula_pattern_match_file() {
        deflexical("*PATTERN-MATCHES-FORMULA-ATOMIC-METHODS*", $list0);
        deflexical("*PATTERN-MATCHES-FORMULA-METHODS*", $list1);
        return NIL;
    }

    public static final SubLObject setup_formula_pattern_match_file_alt() {
        memoization_state.note_memoized_function(MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD);
        memoization_state.note_memoized_function(MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD);
        define_test_case_table_int(PATTERN_MATCHES_FORMULA, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt16);
        return NIL;
    }

    public static SubLObject setup_formula_pattern_match_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD);
            memoization_state.note_memoized_function(MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD);
            define_test_case_table_int(PATTERN_MATCHES_FORMULA, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list14);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(PATTERN_MATCHES_FORMULA, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt16);
        }
        return NIL;
    }

    public static SubLObject setup_formula_pattern_match_file_Previous() {
        memoization_state.note_memoized_function(MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD);
        memoization_state.note_memoized_function(MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD);
        define_test_case_table_int(PATTERN_MATCHES_FORMULA, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list14);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ list(makeKeyword("FULLY-BOUND"), makeSymbol("FULLY-BOUND-P")), list(makeKeyword("NOT-FULLY-BOUND"), makeSymbol("NOT-FULLY-BOUND-P")), list(makeKeyword("STRING"), makeSymbol("STRINGP")), list(makeKeyword("INTEGER"), makeSymbol("INTEGERP")), list($FORT, makeSymbol("FORT-P")), list($HLMT, makeSymbol("HLMT-P")), list(makeKeyword("CLOSED-HLMT"), makeSymbol("CLOSED-HLMT-P")), list(makeKeyword("CONSTANT"), makeSymbol("CONSTANT-P")), list($NART, makeSymbol("NART-P")), list(makeKeyword("CLOSED-NAUT"), makeSymbol("CLOSED-NAUT?")), list(makeKeyword("OPEN-NAUT"), makeSymbol("OPEN-NAUT?")), list(makeKeyword("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeKeyword("SENTENCE"), makeSymbol("EL-SENTENCE-P")), list(makeKeyword("VARIABLE"), makeSymbol("VARIABLE-P")), list(makeKeyword("EL-VARIABLE"), makeSymbol("EL-VARIABLE-P")), list(makeKeyword("COLLECTION-FORT"), makeSymbol("COLLECTION-P")), list(makeKeyword("PREDICATE-FORT"), makeSymbol("PREDICATE-P")), list(makeKeyword("FUNCTOR-FORT"), makeSymbol("FUNCTOR-P")), list(makeKeyword("MT-FORT"), makeSymbol("MICROTHEORY-P")) });

    @Override
    public void declareFunctions() {
        declare_formula_pattern_match_file();
    }

    @Override
    public void initializeVariables() {
        init_formula_pattern_match_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_formula_pattern_match_file();
    }

    

    public static final class $pattern_matches_formula$BinaryFunction extends BinaryFunction {
        public $pattern_matches_formula$BinaryFunction() {
            super(extractFunctionNamed("PATTERN-MATCHES-FORMULA"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pattern_matches_formula(arg1, arg2);
        }
    }

    public static final class $pattern_matches_formula_nat_method$BinaryFunction extends BinaryFunction {
        public $pattern_matches_formula_nat_method$BinaryFunction() {
            super(extractFunctionNamed("PATTERN-MATCHES-FORMULA-NAT-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pattern_matches_formula_nat_method(arg1, arg2);
        }
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ list(makeKeyword("ISA"), makeSymbol("PATTERN-MATCHES-FORMULA-ISA-METHOD")), list(makeKeyword("ISA-MEMOIZED"), makeSymbol("PATTERN-MATCHES-FORMULA-ISA-MEMOIZED-METHOD")), list(makeKeyword("NOT-ISA-DISJOINT"), makeSymbol("PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD")), list(makeKeyword("NOT-ISA-DISJOINT-MEMOIZED"), makeSymbol("PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-MEMOIZED-METHOD")), list(makeKeyword("GENLS"), makeSymbol("PATTERN-MATCHES-FORMULA-GENLS-METHOD")), list($SPEC, makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-METHOD")), list(makeKeyword("NAT"), makeSymbol("PATTERN-MATCHES-FORMULA-NAT-METHOD")), list(makeKeyword("UNIFY"), makeSymbol("PATTERN-MATCHES-FORMULA-UNIFY-METHOD")), list(makeKeyword("GENL-PRED"), makeSymbol("PATTERN-MATCHES-FORMULA-GENL-PRED-METHOD")), list(makeKeyword("GENL-INVERSE"), makeSymbol("PATTERN-MATCHES-FORMULA-GENL-INVERSE-METHOD")), list(makeKeyword("SPEC-PRED"), makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-PRED-METHOD")), list(makeKeyword("SPEC-INVERSE"), makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-INVERSE-METHOD")) });

    static private final SubLList $list_alt2 = list(makeSymbol("PATTERN-OPERATOR"), makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    public static final SubLSymbol $kw4$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt6 = list(makeSymbol("PATTERN-OPERATOR"), makeSymbol("SUBPATTERN"));

    static private final SubLList $list_alt7 = list(makeSymbol("PATTERN-OPERATOR"), makeSymbol("PREDICATE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $$$goolsbey = makeString("goolsbey");

    static private final SubLList $list_alt16 = list(new SubLObject[]{ list(list(makeKeyword("ANYTHING"), ONE_INTEGER), T), list(list(makeKeyword("ANYTHING"), makeString("test")), T), list(list(makeKeyword("ANYTHING"), reader_make_constant_shell("Thing")), T), list(list(makeKeyword("ANYTHING"), list(reader_make_constant_shell("and"))), T), list(list(makeKeyword("ANYTHING"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))), T), list(list(makeKeyword("NOTHING"), ONE_INTEGER), NIL), list(list(makeKeyword("NOTHING"), makeString("test")), NIL), list(list(makeKeyword("NOTHING"), reader_make_constant_shell("Thing")), NIL), list(list(makeKeyword("NOTHING"), list(reader_make_constant_shell("and"))), NIL), list(list(makeKeyword("NOTHING"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))), NIL), list(list(list($TEST, makeSymbol("STRINGP")), makeString("a")), T), list(list(list($TEST, makeSymbol("STRINGP")), makeString("test")), T), list(list(list($TEST, makeSymbol("STRINGP")), makeString("TEST")), T), list(list(list($TEST, makeSymbol("STRINGP")), makeString("")), T), list(list(list($TEST, makeSymbol("STRINGP")), ONE_INTEGER), NIL), list(list(list($TEST, makeSymbol("STRINGP")), reader_make_constant_shell("Thing")), NIL), list(list(list($TEST, makeSymbol("STRINGP")), list(reader_make_constant_shell("and"))), NIL), list(list(list($TEST, makeSymbol("STRINGP")), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Collection"))), NIL), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("isa"), ONE_INTEGER, reader_make_constant_shell("Thing"))), T), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("PlusFn"), ONE_INTEGER, TWO_INTEGER), reader_make_constant_shell("Thing"))), T), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("genls"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing"))), NIL), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"))), NIL), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing"), reader_make_constant_shell("Thing"))), NIL), list(list(list(reader_make_constant_shell("isa"), list($TEST, makeSymbol("FULLY-BOUND-P")), list($TEST, makeSymbol("FORT-P"))), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Thing"), makeInteger(212))), NIL), list(list(list(makeKeyword("UNIFY"), makeInteger(212)), makeInteger(212)), T), list(list(list(makeKeyword("UNIFY"), reader_make_constant_shell("Thing")), makeInteger(212)), NIL) });
}

/**
 * Total time: 217 ms
 */
