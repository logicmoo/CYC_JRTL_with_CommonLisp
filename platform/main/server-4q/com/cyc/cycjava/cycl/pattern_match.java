package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pattern_match extends SubLTranslatedFile {
    public static final SubLFile me = new pattern_match();

    public static final String myName = "com.cyc.cycjava.cycl.pattern_match";

    public static final String myFingerPrint = "57f74d5232215c437181a29fccc023b458d7985e877d92c91fc579d24342fe10";

    // defparameter
    // Definitions
    private static final SubLSymbol $pattern_matches_tree_bindings$ = makeSymbol("*PATTERN-MATCHES-TREE-BINDINGS*");

    // defparameter
    /**
     * Additional atomic methods for pattern-matches-tree. Entries are of the form
     * (operator method). OPERATOR is a token indicating the match method. METHOD
     * must be suitable for (funcall method <tree>).
     */
    public static final SubLSymbol $pattern_matches_tree_atomic_methods$ = makeSymbol("*PATTERN-MATCHES-TREE-ATOMIC-METHODS*");

    // defparameter
    /**
     * Additional methods for pattern-matches-tree. Entries are of the form
     * (operator method). OPERATOR is a token indicating the match method. METHOD
     * must be suitable for (funcall method <pattern> <tree>).
     */
    public static final SubLSymbol $pattern_matches_tree_methods$ = makeSymbol("*PATTERN-MATCHES-TREE-METHODS*");

    // defparameter
    private static final SubLSymbol $pattern_transform_tree_bindings$ = makeSymbol("*PATTERN-TRANSFORM-TREE-BINDINGS*");

    // defparameter
    public static final SubLSymbol $pattern_transform_match_method$ = makeSymbol("*PATTERN-TRANSFORM-MATCH-METHOD*");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    public static final SubLList $list2 = list(list(makeSymbol("VARIABLES"), makeSymbol("TREE"), makeSymbol("PATTERN"), makeSymbol("&KEY"), makeSymbol("MATCH-METHOD")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list3 = list(makeKeyword("MATCH-METHOD"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLSymbol TREE_MATCHES_PATTERN = makeSymbol("TREE-MATCHES-PATTERN");

    public static final SubLSymbol $sym7$SUCCESS = makeUninternedSymbol("SUCCESS");

    public static final SubLSymbol $sym8$BINDINGS = makeUninternedSymbol("BINDINGS");









    public static final SubLSymbol ALIST_LOOKUP_WITHOUT_VALUES = makeSymbol("ALIST-LOOKUP-WITHOUT-VALUES");







    public static final SubLList $list17 = list(makeSymbol("METHOD-OPERATOR"), makeSymbol("METHOD"));

    public static final SubLList $list18 = cons(makeSymbol("PATTERN-OPERATOR"), makeSymbol("PATTERN-ARGS"));











    public static final SubLList $list24 = list(makeSymbol("SUB-PATTERN"));



    public static final SubLList $list26 = list(makeSymbol("TEST"));

    public static final SubLList $list27 = list(makeSymbol("TEST"), makeSymbol("&OPTIONAL"), makeSymbol("ARG2"));

    public static final SubLList $list28 = list(makeSymbol("TEST"), makeSymbol("&OPTIONAL"), makeSymbol("ARG2"), makeSymbol("ARG3"));

    public static final SubLList $list29 = list(makeSymbol("TEST"), makeSymbol("&OPTIONAL"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"));



    private static final SubLSymbol $TREE_FIND_IF = makeKeyword("TREE-FIND-IF");



    private static final SubLList $list33 = list(makeSymbol("QUOTED-OBJECT"));

    private static final SubLSymbol PATTERN_MATCHES_TREE_RECURSIVE = makeSymbol("PATTERN-MATCHES-TREE-RECURSIVE");

    private static final SubLList $list35 = cons(makeSymbol("TREE-OPERATOR"), makeSymbol("TREE-ARGS"));







    private static final SubLList $list39 = list(makeSymbol("VARIABLE"));







    public static final SubLList $list43 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLES"), makeSymbol("SUBPATTERN"));

    public static final SubLList $list44 = list(makeSymbol("OPERATOR"), makeSymbol("MATCH-PATTERN"), makeSymbol("SUBPATTERN"));

    public static final SubLList $list45 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    public static final SubLList $list46 = list(makeSymbol("OPERATOR"), makeSymbol("METHOD"), makeSymbol("&REST"), makeSymbol("METHOD-ARGS"));

    private static final SubLList $list47 = list(makeSymbol("&OPTIONAL"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("ARG3"), makeSymbol("ARG4"));

    public static final SubLList $list48 = list(list(makeSymbol("VARIABLES"), makeSymbol("FORMULA"), makeSymbol("PATTERN")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_TREE_PATTERN_BINDINGS = makeSymbol("WITH-TREE-PATTERN-BINDINGS");

    private static final SubLList $list50 = list(makeKeyword("MATCH-METHOD"), makeSymbol("FORMULA-MATCHES-PATTERN"));

    private static final SubLSymbol PATTERN_MATCHES_TREE = makeSymbol("PATTERN-MATCHES-TREE");











    private static final SubLList $list57 = list(list(list(list(makeKeyword("AND"), cons(makeKeyword("DIFFERENT"), makeKeyword("ANYTHING")), list(makeKeyword("BIND"), makeSymbol("ASENT"))), list(makeKeyword("DIFFERENT"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), T, list(list(makeSymbol("ASENT"), makeKeyword("DIFFERENT"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER))), list(list(list(makeKeyword("AND"), list(makeKeyword("DIFFERENT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ARG"))), list(makeKeyword("BIND"), makeSymbol("ASENT"))), list(makeKeyword("DIFFERENT"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), T, list(cons(makeSymbol("ARG"), THREE_INTEGER), list(makeSymbol("ASENT"), makeKeyword("DIFFERENT"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER))), list(list(list(makeKeyword("AND"), list(makeKeyword("DIFFERENT"), makeKeyword("BIND"), makeSymbol("ARGS")), list(makeKeyword("BIND"), makeSymbol("ASENT"))), list(makeKeyword("DIFFERENT"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), T, list(list(makeSymbol("ARGS"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER), list(makeSymbol("ASENT"), makeKeyword("DIFFERENT"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER))), list(list(list(makeKeyword("AND"), list(makeKeyword("DIFFERENT"), list(makeKeyword("BIND"), makeSymbol("ARG1")), list(makeKeyword("BIND"), makeSymbol("ARG2")), makeKeyword("BIND"), makeSymbol("ARGS")), list(makeKeyword("BIND"), makeSymbol("ASENT"))), list(makeKeyword("DIFFERENT"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER)), T, list(cons(makeSymbol("ARG1"), ONE_INTEGER), cons(makeSymbol("ARG2"), TWO_INTEGER), list(makeSymbol("ARGS"), THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER), list(makeSymbol("ASENT"), makeKeyword("DIFFERENT"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER))));

    public static SubLObject pattern_matches_tree(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = NIL;
        SubLObject v_bindings = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject _prev_bind_0_$1 = $pattern_matches_tree_bindings$.currentBinding(thread);
                    try {
                        $pattern_matches_tree_bindings$.bind(NIL, thread);
                        if (NIL != pattern_matches_tree_internal(pattern, tree)) {
                            success = T;
                            v_bindings = nreverse($pattern_matches_tree_bindings$.getDynamicValue(thread));
                        }
                    } finally {
                        $pattern_matches_tree_bindings$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return subl_promotions.values2(success, v_bindings);
    }

    public static SubLObject pattern_matches_tree_without_bindings(final SubLObject pattern, final SubLObject tree) {
        return pattern_matches_tree_internal(pattern, tree);
    }

    public static SubLObject tree_matches_pattern(final SubLObject tree, final SubLObject pattern) {
        return pattern_matches_tree(pattern, tree);
    }

    public static SubLObject with_tree_pattern_bindings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_variables = NIL;
        SubLObject tree = NIL;
        SubLObject pattern = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        v_variables = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        tree = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        pattern = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list2);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list2);
            if (NIL == member(current_$2, $list3, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list2);
        }
        final SubLObject match_method_tail = property_list_member($MATCH_METHOD, current);
        SubLObject match_method = (NIL != match_method_tail) ? cadr(match_method_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == match_method) {
            match_method = TREE_MATCHES_PATTERN;
        }
        final SubLObject success = $sym7$SUCCESS;
        final SubLObject v_bindings = $sym8$BINDINGS;
        final SubLObject variable_specs = pattern_bindings_variable_specs(v_variables, v_bindings);
        return listS(CMULTIPLE_VALUE_BIND, list(success, v_bindings), list(match_method, tree, pattern), append(NIL != variable_specs ? list(list(PWHEN, success, listS(CLET, variable_specs, append(body, NIL)))) : list(list(IGNORE, v_bindings), listS(PWHEN, success, append(body, NIL))), NIL));
    }

    public static SubLObject pattern_bindings_variable_specs(final SubLObject v_variables, final SubLObject bindings_var) {
        SubLObject variable_specs = NIL;
        SubLObject cdolist_list_var = v_variables;
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject variable_spec = list(variable, list(ALIST_LOOKUP_WITHOUT_VALUES, bindings_var, list(QUOTE, variable)));
            variable_specs = cons(variable_spec, variable_specs);
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        return variable_specs;
    }

    public static SubLObject pattern_matches_tree_internal(final SubLObject pattern, final SubLObject tree) {
        return pattern_matches_tree_recursive(pattern, tree);
    }

    public static SubLObject pattern_matches_tree_atomic_method_funcall(final SubLObject method, final SubLObject tree) {
        return funcall(method, tree);
    }

    public static SubLObject pattern_matches_tree_method_funcall(final SubLObject method, final SubLObject pattern, final SubLObject tree) {
        return funcall(method, pattern, tree);
    }

    public static SubLObject pattern_matches_tree_recursive(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pattern.isAtom()) {
            if (pattern.eql($ANYTHING)) {
                return T;
            }
            if (pattern.eql($NOTHING)) {
                return NIL;
            }
            SubLObject cdolist_list_var = $pattern_matches_tree_atomic_methods$.getDynamicValue(thread);
            SubLObject method_info = NIL;
            method_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = method_info;
                SubLObject method_operator = NIL;
                SubLObject method = NIL;
                destructuring_bind_must_consp(current, datum, $list17);
                method_operator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list17);
                method = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (method_operator.eql(pattern)) {
                        return pattern_matches_tree_atomic_method_funcall(method, tree);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list17);
                }
                cdolist_list_var = cdolist_list_var.rest();
                method_info = cdolist_list_var.first();
            } 
            return equal(pattern, tree);
        } else {
            SubLObject pattern_operator = NIL;
            SubLObject pattern_args = NIL;
            destructuring_bind_must_consp(pattern, pattern, $list18);
            pattern_operator = pattern.first();
            final SubLObject current2 = pattern_args = pattern.rest();
            final SubLObject pcase_var = pattern_operator;
            if (pcase_var.eql($BIND)) {
                return pattern_matches_tree_bind(pattern, tree);
            }
            if (pcase_var.eql($VALUE)) {
                return pattern_matches_tree_value(pattern, tree);
            }
            if (pcase_var.eql($AND)) {
                return pattern_matches_tree_and(pattern, tree);
            }
            if (pcase_var.eql($OR)) {
                return pattern_matches_tree_or(pattern, tree);
            }
            if (pcase_var.eql($NOT)) {
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = pattern_args;
                SubLObject sub_pattern = NIL;
                destructuring_bind_must_consp(current_$4, datum_$3, $list24);
                sub_pattern = current_$4.first();
                current_$4 = current_$4.rest();
                if (NIL == current_$4) {
                    return makeBoolean(NIL == pattern_matches_tree_recursive(sub_pattern, tree));
                }
                cdestructuring_bind_error(datum_$3, $list24);
            } else
                if (pcase_var.eql($TEST)) {
                    final SubLObject extra_arg_count = subtract(length(pattern_args), ONE_INTEGER);
                    if (ZERO_INTEGER.eql(extra_arg_count)) {
                        SubLObject current_$5;
                        final SubLObject datum_$4 = current_$5 = pattern_args;
                        SubLObject test = NIL;
                        destructuring_bind_must_consp(current_$5, datum_$4, $list26);
                        test = current_$5.first();
                        current_$5 = current_$5.rest();
                        if (NIL == current_$5) {
                            return list_utilities.sublisp_boolean(pattern_matches_tree_test_funcall(test, tree));
                        }
                        cdestructuring_bind_error(datum_$4, $list26);
                    } else
                        if (ONE_INTEGER.eql(extra_arg_count)) {
                            SubLObject current_$6;
                            final SubLObject datum_$5 = current_$6 = pattern_args;
                            SubLObject test = NIL;
                            destructuring_bind_must_consp(current_$6, datum_$5, $list27);
                            test = current_$6.first();
                            current_$6 = current_$6.rest();
                            final SubLObject arg2 = (current_$6.isCons()) ? current_$6.first() : NIL;
                            destructuring_bind_must_listp(current_$6, datum_$5, $list27);
                            current_$6 = current_$6.rest();
                            if (NIL == current_$6) {
                                return list_utilities.sublisp_boolean(pattern_matches_tree_test_funcall_2(test, tree, arg2));
                            }
                            cdestructuring_bind_error(datum_$5, $list27);
                        } else
                            if (TWO_INTEGER.eql(extra_arg_count)) {
                                SubLObject current_$7;
                                final SubLObject datum_$6 = current_$7 = pattern_args;
                                SubLObject test = NIL;
                                destructuring_bind_must_consp(current_$7, datum_$6, $list28);
                                test = current_$7.first();
                                current_$7 = current_$7.rest();
                                final SubLObject arg2 = (current_$7.isCons()) ? current_$7.first() : NIL;
                                destructuring_bind_must_listp(current_$7, datum_$6, $list28);
                                current_$7 = current_$7.rest();
                                final SubLObject arg3 = (current_$7.isCons()) ? current_$7.first() : NIL;
                                destructuring_bind_must_listp(current_$7, datum_$6, $list28);
                                current_$7 = current_$7.rest();
                                if (NIL == current_$7) {
                                    return list_utilities.sublisp_boolean(pattern_matches_tree_test_funcall_3(test, tree, arg2, arg3));
                                }
                                cdestructuring_bind_error(datum_$6, $list28);
                            } else
                                if (THREE_INTEGER.eql(extra_arg_count)) {
                                    SubLObject current_$8;
                                    final SubLObject datum_$7 = current_$8 = pattern_args;
                                    SubLObject test = NIL;
                                    destructuring_bind_must_consp(current_$8, datum_$7, $list29);
                                    test = current_$8.first();
                                    current_$8 = current_$8.rest();
                                    final SubLObject arg2 = (current_$8.isCons()) ? current_$8.first() : NIL;
                                    destructuring_bind_must_listp(current_$8, datum_$7, $list29);
                                    current_$8 = current_$8.rest();
                                    final SubLObject arg3 = (current_$8.isCons()) ? current_$8.first() : NIL;
                                    destructuring_bind_must_listp(current_$8, datum_$7, $list29);
                                    current_$8 = current_$8.rest();
                                    final SubLObject arg4 = (current_$8.isCons()) ? current_$8.first() : NIL;
                                    destructuring_bind_must_listp(current_$8, datum_$7, $list29);
                                    current_$8 = current_$8.rest();
                                    if (NIL == current_$8) {
                                        return list_utilities.sublisp_boolean(pattern_matches_tree_test_funcall_4(test, tree, arg2, arg3, arg4));
                                    }
                                    cdestructuring_bind_error(datum_$7, $list29);
                                }



                } else
                    if (pcase_var.eql($TREE_FIND)) {
                        SubLObject current_$9;
                        final SubLObject datum_$8 = current_$9 = pattern_args;
                        SubLObject sub_pattern = NIL;
                        destructuring_bind_must_consp(current_$9, datum_$8, $list24);
                        sub_pattern = current_$9.first();
                        current_$9 = current_$9.rest();
                        if (NIL == current_$9) {
                            return pattern_matches_tree_tree_find(sub_pattern, tree);
                        }
                        cdestructuring_bind_error(datum_$8, $list24);
                    } else
                        if (pcase_var.eql($TREE_FIND_IF)) {
                            SubLObject current_$10;
                            final SubLObject datum_$9 = current_$10 = pattern_args;
                            SubLObject sub_pattern = NIL;
                            destructuring_bind_must_consp(current_$10, datum_$9, $list24);
                            sub_pattern = current_$10.first();
                            current_$10 = current_$10.rest();
                            if (NIL == current_$10) {
                                return pattern_matches_tree_tree_find_if(sub_pattern, tree);
                            }
                            cdestructuring_bind_error(datum_$9, $list24);
                        } else {
                            if (!pcase_var.eql($QUOTE)) {
                                SubLObject cdolist_list_var2 = $pattern_matches_tree_methods$.getDynamicValue(thread);
                                SubLObject method_info2 = NIL;
                                method_info2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    SubLObject current_$11;
                                    final SubLObject datum_$10 = current_$11 = method_info2;
                                    SubLObject method_operator2 = NIL;
                                    SubLObject method2 = NIL;
                                    destructuring_bind_must_consp(current_$11, datum_$10, $list17);
                                    method_operator2 = current_$11.first();
                                    current_$11 = current_$11.rest();
                                    destructuring_bind_must_consp(current_$11, datum_$10, $list17);
                                    method2 = current_$11.first();
                                    current_$11 = current_$11.rest();
                                    if (NIL == current_$11) {
                                        if (method_operator2.eql(pattern_operator)) {
                                            return pattern_matches_tree_method_funcall(method2, pattern, tree);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_$10, $list17);
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    method_info2 = cdolist_list_var2.first();
                                } 
                                return pattern_matches_tree_cons(pattern, tree);
                            }
                            SubLObject current_$12;
                            final SubLObject datum_$11 = current_$12 = pattern_args;
                            SubLObject quoted_object = NIL;
                            destructuring_bind_must_consp(current_$12, datum_$11, $list33);
                            quoted_object = current_$12.first();
                            current_$12 = current_$12.rest();
                            if (NIL == current_$12) {
                                return equal(quoted_object, tree);
                            }
                            cdestructuring_bind_error(datum_$11, $list33);
                        }



            return NIL;
        }
    }

    public static SubLObject pattern_matches_tree_bind(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variable = second(pattern);
        $pattern_matches_tree_bindings$.setDynamicValue(list_utilities.alist_enter_without_values($pattern_matches_tree_bindings$.getDynamicValue(thread), variable, tree, symbol_function(EQL)), thread);
        return T;
    }

    public static SubLObject pattern_matches_tree_value(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variable = second(pattern);
        thread.resetMultipleValues();
        final SubLObject value = list_utilities.alist_lookup($pattern_matches_tree_bindings$.getDynamicValue(thread), variable, symbol_function(EQL), UNPROVIDED);
        final SubLObject presentP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != presentP) {
            return pattern_matches_tree_recursive(value, tree);
        }
        return NIL;
    }

    public static SubLObject pattern_matches_tree_and(final SubLObject pattern, final SubLObject tree) {
        SubLObject cdolist_list_var = pattern.rest();
        SubLObject sub_pattern = NIL;
        sub_pattern = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == pattern_matches_tree_recursive(sub_pattern, tree)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_pattern = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject pattern_matches_tree_or(final SubLObject pattern, final SubLObject tree) {
        SubLObject cdolist_list_var = pattern.rest();
        SubLObject sub_pattern = NIL;
        sub_pattern = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pattern_matches_tree_recursive(sub_pattern, tree)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_pattern = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject pattern_matches_tree_test_funcall(final SubLObject test, final SubLObject tree) {
        if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(test)) {
            return eval_in_api.possibly_cyc_api_funcall_1(test, tree);
        }
        return NIL;
    }

    public static SubLObject pattern_matches_tree_test_funcall_2(final SubLObject test, final SubLObject tree, final SubLObject arg2) {
        if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(test)) {
            return eval_in_api.possibly_cyc_api_funcall_2(test, tree, arg2);
        }
        return NIL;
    }

    public static SubLObject pattern_matches_tree_test_funcall_3(final SubLObject test, final SubLObject tree, final SubLObject arg2, final SubLObject arg3) {
        if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(test)) {
            return eval_in_api.possibly_cyc_api_funcall_3(test, tree, arg2, arg3);
        }
        return NIL;
    }

    public static SubLObject pattern_matches_tree_test_funcall_4(final SubLObject test, final SubLObject tree, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4) {
        if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(test)) {
            return eval_in_api.possibly_cyc_api_funcall_4(test, tree, arg2, arg3, arg4);
        }
        return NIL;
    }

    public static SubLObject pattern_matches_tree_tree_find(final SubLObject sub_pattern, final SubLObject tree) {
        return list_utilities.tree_find(sub_pattern, tree, symbol_function(PATTERN_MATCHES_TREE_RECURSIVE), UNPROVIDED);
    }

    public static SubLObject pattern_matches_tree_tree_find_if(final SubLObject sub_pattern, final SubLObject tree) {
        return list_utilities.tree_find_if(sub_pattern, tree, UNPROVIDED);
    }

    public static SubLObject pattern_matches_tree_cons(final SubLObject pattern, final SubLObject tree) {
        if (tree.isAtom()) {
            return NIL;
        }
        SubLObject pattern_operator = NIL;
        SubLObject pattern_args = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list18);
        pattern_operator = pattern.first();
        final SubLObject current = pattern_args = pattern.rest();
        SubLObject tree_operator = NIL;
        SubLObject tree_args = NIL;
        destructuring_bind_must_consp(tree, tree, $list35);
        tree_operator = tree.first();
        final SubLObject current_$22 = tree_args = tree.rest();
        if (NIL == pattern_matches_tree_recursive(pattern_operator, tree_operator)) {
            return NIL;
        }
        if (NIL != possibly_match_pattern_p(pattern_args)) {
            return pattern_matches_tree_recursive(pattern_args, tree_args);
        }
        SubLObject rest_pattern_args;
        SubLObject rest_tree_args;
        SubLObject next_pattern_arg;
        SubLObject next_tree_arg;
        for (rest_pattern_args = NIL, rest_tree_args = NIL, rest_pattern_args = pattern_args, rest_tree_args = tree_args; (!rest_pattern_args.isAtom()) && (!rest_tree_args.isAtom()); rest_pattern_args = rest_pattern_args.rest() , rest_tree_args = rest_tree_args.rest()) {
            next_pattern_arg = rest_pattern_args.first();
            next_tree_arg = rest_tree_args.first();
            if (NIL == pattern_matches_tree_recursive(next_pattern_arg, next_tree_arg)) {
                return NIL;
            }
        }
        return pattern_matches_tree_recursive(rest_pattern_args, rest_tree_args);
    }

    public static SubLObject possibly_match_pattern_p(final SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != cycl_utilities.expression_find_if(symbol_function(KEYWORDP), v_object, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pattern_transform_tree(final SubLObject pattern, final SubLObject tree, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject new_bindings = NIL;
        final SubLObject _prev_bind_0 = $pattern_transform_tree_bindings$.currentBinding(thread);
        try {
            $pattern_transform_tree_bindings$.bind(v_bindings, thread);
            v_answer = pattern_transform_tree_internal(pattern, tree);
            new_bindings = $pattern_transform_tree_bindings$.getDynamicValue(thread);
        } finally {
            $pattern_transform_tree_bindings$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(v_answer, new_bindings);
    }

    public static SubLObject tree_pattern_transform(final SubLObject tree, final SubLObject pattern, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        return pattern_transform_tree(pattern, tree, v_bindings);
    }

    public static SubLObject pattern_transform_tree_internal(final SubLObject pattern, final SubLObject tree) {
        return pattern_transform_tree_recursive(pattern, tree);
    }

    public static SubLObject pattern_transform_tree_recursive(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!pattern.isAtom()) {
            SubLObject pattern_operator = NIL;
            SubLObject pattern_args = NIL;
            destructuring_bind_must_consp(pattern, pattern, $list18);
            pattern_operator = pattern.first();
            final SubLObject current = pattern_args = pattern.rest();
            final SubLObject pcase_var = pattern_operator;
            if (pcase_var.eql($VALUE)) {
                SubLObject current_$24;
                final SubLObject datum_$23 = current_$24 = pattern_args;
                SubLObject variable = NIL;
                destructuring_bind_must_consp(current_$24, datum_$23, $list39);
                variable = current_$24.first();
                current_$24 = current_$24.rest();
                if (NIL == current_$24) {
                    return list_utilities.alist_lookup_without_values($pattern_transform_tree_bindings$.getDynamicValue(thread), variable, symbol_function(EQL), NIL);
                }
                cdestructuring_bind_error(datum_$23, $list39);
            } else {
                if (pcase_var.eql($TUPLE)) {
                    return pattern_transform_tuple(pattern, tree);
                }
                if (pcase_var.eql($TEMPLATE)) {
                    return pattern_transform_template(pattern, tree);
                }
                if (pcase_var.eql($CALL)) {
                    return pattern_transform_call(pattern, tree);
                }
                if (!pcase_var.eql($QUOTE)) {
                    return pattern_transform_cons(pattern, tree);
                }
                SubLObject current_$25;
                final SubLObject datum_$24 = current_$25 = pattern_args;
                SubLObject quoted_object = NIL;
                destructuring_bind_must_consp(current_$25, datum_$24, $list33);
                quoted_object = current_$25.first();
                current_$25 = current_$25.rest();
                if (NIL == current_$25) {
                    return quoted_object;
                }
                cdestructuring_bind_error(datum_$24, $list33);
            }
            return NIL;
        }
        if (pattern.eql($INPUT)) {
            return tree;
        }
        if (pattern.eql($BINDINGS)) {
            return $pattern_transform_tree_bindings$.getDynamicValue(thread);
        }
        return pattern;
    }

    public static SubLObject pattern_transform_tuple(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject v_variables = NIL;
        SubLObject subpattern = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list43);
        operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list43);
        v_variables = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, pattern, $list43);
        subpattern = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(pattern, $list43);
            return NIL;
        }
        if (((!tree.isList()) || (!v_variables.isList())) || (NIL == list_utilities.lengthE(tree, length(v_variables), UNPROVIDED))) {
            return NIL;
        }
        SubLObject variable = NIL;
        SubLObject variable_$27 = NIL;
        SubLObject subtree = NIL;
        SubLObject subtree_$28 = NIL;
        variable = v_variables;
        variable_$27 = variable.first();
        subtree = tree;
        subtree_$28 = subtree.first();
        while ((NIL != subtree) || (NIL != variable)) {
            $pattern_transform_tree_bindings$.setDynamicValue(list_utilities.alist_enter_without_values($pattern_transform_tree_bindings$.getDynamicValue(thread), variable_$27, subtree_$28, symbol_function(EQL)), thread);
            variable = variable.rest();
            variable_$27 = variable.first();
            subtree = subtree.rest();
            subtree_$28 = subtree.first();
        } 
        return pattern_transform_tree_recursive(subpattern, tree);
    }

    public static SubLObject pattern_transform_template(final SubLObject pattern, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = NIL;
        SubLObject match_pattern = NIL;
        SubLObject subpattern = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list44);
        operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list44);
        match_pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, pattern, $list44);
        subpattern = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(pattern, $list44);
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject success = (NIL != $pattern_transform_match_method$.getDynamicValue(thread)) ? funcall($pattern_transform_match_method$.getDynamicValue(thread), match_pattern, tree) : pattern_matches_tree(match_pattern, tree);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == success) {
            return NIL;
        }
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current_$30;
            final SubLObject datum_$29 = current_$30 = binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current_$30, datum_$29, $list45);
            variable = current_$30.first();
            current_$30 = value = current_$30.rest();
            $pattern_transform_tree_bindings$.setDynamicValue(list_utilities.alist_enter_without_values($pattern_transform_tree_bindings$.getDynamicValue(thread), variable, value, symbol_function(EQL)), thread);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return pattern_transform_tree_recursive(subpattern, tree);
    }

    public static SubLObject pattern_transform_call(final SubLObject pattern, final SubLObject tree) {
        SubLObject operator = NIL;
        SubLObject method = NIL;
        destructuring_bind_must_consp(pattern, pattern, $list46);
        operator = pattern.first();
        SubLObject current = pattern.rest();
        destructuring_bind_must_consp(current, pattern, $list46);
        method = current.first();
        SubLObject method_args;
        current = method_args = current.rest();
        final SubLObject arg_count = length(method_args);
        if ((!arg_count.numLE(FOUR_INTEGER)) || (NIL == fboundp(method))) {
            method_args = copy_list(method_args);
            SubLObject rest_args;
            SubLObject next_arg;
            for (rest_args = NIL, rest_args = method_args; !rest_args.isAtom(); rest_args = rest_args.rest()) {
                next_arg = rest_args.first();
                rplaca(rest_args, pattern_transform_tree_recursive(next_arg, tree));
            }
            return eval_in_api.possibly_cyc_api_apply(method, method_args);
        }
        SubLObject current_$32;
        final SubLObject datum_$31 = current_$32 = method_args;
        SubLObject arg1 = (current_$32.isCons()) ? current_$32.first() : NIL;
        destructuring_bind_must_listp(current_$32, datum_$31, $list47);
        current_$32 = current_$32.rest();
        SubLObject arg2 = (current_$32.isCons()) ? current_$32.first() : NIL;
        destructuring_bind_must_listp(current_$32, datum_$31, $list47);
        current_$32 = current_$32.rest();
        SubLObject arg3 = (current_$32.isCons()) ? current_$32.first() : NIL;
        destructuring_bind_must_listp(current_$32, datum_$31, $list47);
        current_$32 = current_$32.rest();
        SubLObject arg4 = (current_$32.isCons()) ? current_$32.first() : NIL;
        destructuring_bind_must_listp(current_$32, datum_$31, $list47);
        current_$32 = current_$32.rest();
        if (NIL != current_$32) {
            cdestructuring_bind_error(datum_$31, $list47);
            return NIL;
        }
        if (ZERO_INTEGER.numL(arg_count)) {
            arg1 = pattern_transform_tree_recursive(arg1, tree);
            if (ONE_INTEGER.numL(arg_count)) {
                arg2 = pattern_transform_tree_recursive(arg2, tree);
                if (TWO_INTEGER.numL(arg_count)) {
                    arg3 = pattern_transform_tree_recursive(arg3, tree);
                    if (THREE_INTEGER.numL(arg_count)) {
                        arg4 = pattern_transform_tree_recursive(arg4, tree);
                    }
                }
            }
        }
        final SubLObject pcase_var = arg_count;
        if (pcase_var.eql(ZERO_INTEGER)) {
            return funcall(method);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return funcall(method, arg1);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return funcall(method, arg1, arg2);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return funcall(method, arg1, arg2, arg3);
        }
        return funcall(method, arg1, arg2, arg3, arg4);
    }

    public static SubLObject pattern_transform_cons(final SubLObject pattern, final SubLObject tree) {
        final SubLObject v_answer = copy_list(pattern);
        SubLObject rest_answer;
        for (rest_answer = NIL, rest_answer = v_answer; !rest_answer.rest().isAtom(); rest_answer = rest_answer.rest()) {
            rplaca(rest_answer, pattern_transform_tree_recursive(rest_answer.first(), tree));
        }
        rplaca(rest_answer, pattern_transform_tree_recursive(rest_answer.first(), tree));
        if (NIL != rest_answer.rest()) {
            rplacd(rest_answer, pattern_transform_tree_recursive(rest_answer.rest(), tree));
        }
        return v_answer;
    }

    public static SubLObject with_formula_pattern_bindings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_variables = NIL;
        SubLObject formula = NIL;
        SubLObject pattern = NIL;
        destructuring_bind_must_consp(current, datum, $list48);
        v_variables = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        formula = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        pattern = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_TREE_PATTERN_BINDINGS, listS(v_variables, formula, pattern, $list50), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list48);
        return NIL;
    }

    public static SubLObject declare_pattern_match_file() {
        declareFunction(me, "pattern_matches_tree", "PATTERN-MATCHES-TREE", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_without_bindings", "PATTERN-MATCHES-TREE-WITHOUT-BINDINGS", 2, 0, false);
        declareFunction(me, "tree_matches_pattern", "TREE-MATCHES-PATTERN", 2, 0, false);
        declareMacro(me, "with_tree_pattern_bindings", "WITH-TREE-PATTERN-BINDINGS");
        declareFunction(me, "pattern_bindings_variable_specs", "PATTERN-BINDINGS-VARIABLE-SPECS", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_internal", "PATTERN-MATCHES-TREE-INTERNAL", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_atomic_method_funcall", "PATTERN-MATCHES-TREE-ATOMIC-METHOD-FUNCALL", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_method_funcall", "PATTERN-MATCHES-TREE-METHOD-FUNCALL", 3, 0, false);
        declareFunction(me, "pattern_matches_tree_recursive", "PATTERN-MATCHES-TREE-RECURSIVE", 2, 0, false);
        new pattern_match.$pattern_matches_tree_recursive$BinaryFunction();
        declareFunction(me, "pattern_matches_tree_bind", "PATTERN-MATCHES-TREE-BIND", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_value", "PATTERN-MATCHES-TREE-VALUE", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_and", "PATTERN-MATCHES-TREE-AND", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_or", "PATTERN-MATCHES-TREE-OR", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_test_funcall", "PATTERN-MATCHES-TREE-TEST-FUNCALL", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_test_funcall_2", "PATTERN-MATCHES-TREE-TEST-FUNCALL-2", 3, 0, false);
        declareFunction(me, "pattern_matches_tree_test_funcall_3", "PATTERN-MATCHES-TREE-TEST-FUNCALL-3", 4, 0, false);
        declareFunction(me, "pattern_matches_tree_test_funcall_4", "PATTERN-MATCHES-TREE-TEST-FUNCALL-4", 5, 0, false);
        declareFunction(me, "pattern_matches_tree_tree_find", "PATTERN-MATCHES-TREE-TREE-FIND", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_tree_find_if", "PATTERN-MATCHES-TREE-TREE-FIND-IF", 2, 0, false);
        declareFunction(me, "pattern_matches_tree_cons", "PATTERN-MATCHES-TREE-CONS", 2, 0, false);
        declareFunction(me, "possibly_match_pattern_p", "POSSIBLY-MATCH-PATTERN-P", 1, 0, false);
        declareFunction(me, "pattern_transform_tree", "PATTERN-TRANSFORM-TREE", 2, 1, false);
        declareFunction(me, "tree_pattern_transform", "TREE-PATTERN-TRANSFORM", 2, 1, false);
        declareFunction(me, "pattern_transform_tree_internal", "PATTERN-TRANSFORM-TREE-INTERNAL", 2, 0, false);
        declareFunction(me, "pattern_transform_tree_recursive", "PATTERN-TRANSFORM-TREE-RECURSIVE", 2, 0, false);
        declareFunction(me, "pattern_transform_tuple", "PATTERN-TRANSFORM-TUPLE", 2, 0, false);
        declareFunction(me, "pattern_transform_template", "PATTERN-TRANSFORM-TEMPLATE", 2, 0, false);
        declareFunction(me, "pattern_transform_call", "PATTERN-TRANSFORM-CALL", 2, 0, false);
        declareFunction(me, "pattern_transform_cons", "PATTERN-TRANSFORM-CONS", 2, 0, false);
        declareMacro(me, "with_formula_pattern_bindings", "WITH-FORMULA-PATTERN-BINDINGS");
        return NIL;
    }

    public static SubLObject init_pattern_match_file() {
        defparameter("*PATTERN-MATCHES-TREE-BINDINGS*", NIL);
        defparameter("*PATTERN-MATCHES-TREE-ATOMIC-METHODS*", NIL);
        defparameter("*PATTERN-MATCHES-TREE-METHODS*", NIL);
        defparameter("*PATTERN-TRANSFORM-TREE-BINDINGS*", NIL);
        defparameter("*PATTERN-TRANSFORM-MATCH-METHOD*", NIL);
        return NIL;
    }

    public static SubLObject setup_pattern_match_file() {
        define_test_case_table_int(PATTERN_MATCHES_TREE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list57);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pattern_match_file();
    }

    @Override
    public void initializeVariables() {
        init_pattern_match_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pattern_match_file();
    }

    

    public static final class $pattern_matches_tree_recursive$BinaryFunction extends BinaryFunction {
        public $pattern_matches_tree_recursive$BinaryFunction() {
            super(extractFunctionNamed("PATTERN-MATCHES-TREE-RECURSIVE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return pattern_matches_tree_recursive(arg1, arg2);
        }
    }
}

/**
 * Total time: 248 ms
 */
