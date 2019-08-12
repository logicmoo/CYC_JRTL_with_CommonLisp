/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_concatenate_strings extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt21$ = makeString("");

    public static final SubLFile me = new removal_modules_concatenate_strings();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings";




    private static final SubLSymbol $REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS = makeKeyword("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS");

    static private final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("concatenateStrings"), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell("concatenateStrings"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("BaseKB"), makeKeyword("DOCUMENTATION"), makeString("(#$concatenateStrings :not-fully-bound . :fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$concatenateStrings ?X \"foo\" \"bar\")\nwill bind ?X to \"foobar\"") });

    private static final SubLSymbol REMOVAL_CONCATENATE_STRINGS_BOUND_ARGS_SUPPORTED_P = makeSymbol("REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P");

    private static final SubLList $list6 = cons(makeSymbol("ARG1"), makeSymbol("STRINGS"));

    private static final SubLSymbol REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS = makeSymbol("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS");

    private static final SubLSymbol $REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG = makeKeyword("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG");

    private static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("concatenateStrings"), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell("concatenateStrings"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("BaseKB"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$concatenateStrings :fully-bound . :fully-bound))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$concatenateStrings \"something unrelated\" \"foo\" \"bar\"))\nwill be provable\n    (#$not (#$concatenateStrings \"foobar\" \"foo\" \"bar\"))\nwill fail to be provable") });

    private static final SubLSymbol REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG = makeSymbol("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG");

    private static final SubLSymbol $REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS = makeKeyword("REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS");

    private static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("concatenateStrings"), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell("concatenateStrings"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("BaseKB"), makeKeyword("DOCUMENTATION"), makeString("(#$concatenateStrings :fully-bound . :not-fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$concatenateStrings \"foobar\" ?X \"o\" ?Z)\nwill bind ?X ?Z to both \"fo\" \"bar\"\nand \"f\" \"obar\".") });

    private static final SubLSymbol REMOVAL_CONCATENATE_STRINGS_PERMUTE_COST = makeSymbol("REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST");

    private static final SubLSymbol REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS_OUTPUT_GENERATE = makeSymbol("REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE");

    private static final SubLSymbol CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_DONE = makeSymbol("CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-DONE");

    private static final SubLSymbol CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_NEXT = makeSymbol("CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT");

    private static final SubLSymbol CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_FINALIZE = makeSymbol("CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-FINALIZE");

    private static final SubLList $list19 = list(makeSymbol("BIG-STRING"), makeSymbol("STRINGY-ITEMS"), makeSymbol("STRINGS-LIST"), makeSymbol("PERMUTATIONS-ITERATOR"), makeSymbol("ASENT"), makeSymbol("BIG-STRING-IS-UNICODE?"));

    private static final SubLSymbol UNICODE_NAUT_P = makeSymbol("UNICODE-NAUT-P");

    private static final SubLSymbol NAT_ARG1 = makeSymbol("NAT-ARG1");

    private static final SubLList $list22 = cons(makeSymbol("BIG-STRING"), makeSymbol("STRINGY-ITEMS"));

    private static final SubLString $str23$ = makeString("");

    // Definitions
    public static final SubLObject removal_concatenate_strings_bound_args_supported_p_alt(SubLObject asent, SubLObject direction) {
        {
            SubLObject badP = NIL;
            if (NIL == badP) {
                {
                    SubLObject csome_list_var = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                    SubLObject arg = NIL;
                    for (arg = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                        if (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings.removal_concatenate_strings_arg_supported_p(arg)) {
                            badP = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == badP);
        }
    }

    // Definitions
    public static SubLObject removal_concatenate_strings_bound_args_supported_p(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject arg = NIL;
            arg = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                if (NIL == removal_concatenate_strings_arg_supported_p(arg)) {
                    badP = T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == badP);
    }

    public static final SubLObject removal_concatenate_strings_arg_supported_p_alt(SubLObject arg) {
        return makeBoolean((NIL == variables.fully_bound_p(arg)) || (NIL != unicode_nauts.string_or_unicode_naut_p(arg)));
    }

    public static SubLObject removal_concatenate_strings_arg_supported_p(final SubLObject arg) {
        return makeBoolean((NIL == variables.fully_bound_p(arg)) || (NIL != cycl_string.cycl_string_p(arg)));
    }

    public static final SubLObject removal_concatenate_strings_concatenate_arg1_pos_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.formula_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject arg1 = NIL;
                SubLObject strings = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt4);
                arg1 = current.first();
                current = current.rest();
                strings = current;
                {
                    SubLObject big_string = evaluation_defns.cyc_concatenate_strings(strings);
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(big_string, arg1, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject bound_arg1 = bindings.subst_bindings(v_bindings, arg1);
                                SubLObject unified_asent = replace_formula_arg(ONE_INTEGER, bound_arg1, asent);
                                return backward.removal_add_node(arguments.make_hl_support($OPAQUE, unified_asent, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_concatenate_strings_concatenate_arg1_pos(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(asent, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject strings = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        arg1 = current.first();
        current = strings = current.rest();
        final SubLObject big_string = evaluation_defns.cyc_concatenate_strings(strings);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(big_string, arg1, T, T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject bound_arg1 = bindings.subst_bindings(v_bindings, arg1);
            final SubLObject unified_asent = replace_formula_arg(ONE_INTEGER, bound_arg1, asent);
            return backward.removal_add_node(arguments.make_hl_support($OPAQUE, unified_asent, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
        }
        return NIL;
    }

    public static final SubLObject removal_concatenate_strings_concatenate_neg_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject datum = cycl_utilities.formula_args(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject arg1 = NIL;
            SubLObject strings = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            arg1 = current.first();
            current = current.rest();
            strings = current;
            {
                SubLObject big_string = evaluation_defns.cyc_concatenate_strings(strings);
                if (NIL == Strings.string_equal(big_string, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return backward.removal_add_node(arguments.make_hl_support($OPAQUE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_concatenate_strings_concatenate_neg(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(asent, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject strings = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        arg1 = current.first();
        current = strings = current.rest();
        final SubLObject big_string = evaluation_defns.cyc_concatenate_strings(strings);
        if (NIL == Strings.string_equal(big_string, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return backward.removal_add_node(arguments.make_hl_support($OPAQUE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * It's important to do an accurate cost estimate, or we may run Cyc out of memory with ridiculous combinatorics
     */
    @LispMethod(comment = "It\'s important to do an accurate cost estimate, or we may run Cyc out of memory with ridiculous combinatorics")
    public static final SubLObject removal_concatenate_strings_permute_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject big_string = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings.preprocess_stringy_args(asent);
                SubLObject stringy_items = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (big_string.isString()) {
                    {
                        SubLObject result = ONE_INTEGER;
                        SubLObject number_of_strings_so_far = ZERO_INTEGER;
                        SubLObject cdolist_list_var = stringy_items;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            if (item.isString()) {
                                number_of_strings_so_far = add(number_of_strings_so_far, ONE_INTEGER);
                                {
                                    SubLObject string = item;
                                    SubLObject count = string_utilities.count_matches(string, big_string, UNPROVIDED, UNPROVIDED);
                                    SubLObject adjusted_count = divide(count, number_of_strings_so_far);
                                    result = multiply(result, adjusted_count);
                                }
                            }
                        }
                        return result;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * It's important to do an accurate cost estimate, or we may run Cyc out of memory with ridiculous combinatorics
     */
    @LispMethod(comment = "It\'s important to do an accurate cost estimate, or we may run Cyc out of memory with ridiculous combinatorics")
    public static SubLObject removal_concatenate_strings_permute_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject big_string = preprocess_stringy_args(asent);
        final SubLObject stringy_items = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (big_string.isString()) {
            SubLObject result = ONE_INTEGER;
            SubLObject number_of_strings_so_far = ZERO_INTEGER;
            SubLObject cdolist_list_var = stringy_items;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (item.isString()) {
                    number_of_strings_so_far = add(number_of_strings_so_far, ONE_INTEGER);
                    final SubLObject string = item;
                    final SubLObject count = string_utilities.count_matches(string, big_string, UNPROVIDED, UNPROVIDED);
                    final SubLObject adjusted_count = divide(count, number_of_strings_so_far);
                    result = multiply(result, adjusted_count);
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            return result;
        }
        return NIL;
    }

    public static final SubLObject removal_concatenate_strings_permute_pos_output_generate_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject big_string_is_unicodeP = unicode_nauts.unicode_naut_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
                thread.resetMultipleValues();
                {
                    SubLObject stringy_big_string = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings.preprocess_stringy_args(asent);
                    SubLObject stringy_items = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (!stringy_big_string.isString()) {
                        return iteration.new_null_iterator();
                    } else {
                        if (NIL != list_utilities.singletonP(stringy_items)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_bindings = unification_utilities.term_unify(stringy_items.first(), stringy_big_string, UNPROVIDED, UNPROVIDED);
                                SubLObject unify_justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                return iteration.new_singleton_iterator(bindings.subst_bindings(v_bindings, asent));
                            }
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject permutation_iterator = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings.generate_concatenate_strings_permutation_iterator(stringy_big_string, stringy_items);
                                SubLObject strings_list = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings.new_concatenate_strings_permute_pos_iterator(stringy_big_string, stringy_items, strings_list, permutation_iterator, asent, big_string_is_unicodeP);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject removal_concatenate_strings_permute_pos_output_generate(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject big_string_is_unicodeP = unicode_nauts.unicode_naut_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject stringy_big_string = preprocess_stringy_args(asent);
        final SubLObject stringy_items = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!stringy_big_string.isString()) {
            return iteration.new_null_iterator();
        }
        if (NIL != list_utilities.singletonP(stringy_items)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(stringy_items.first(), stringy_big_string, UNPROVIDED, UNPROVIDED);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return iteration.new_singleton_iterator(bindings.subst_bindings(v_bindings, asent));
        }
        thread.resetMultipleValues();
        final SubLObject permutation_iterator = generate_concatenate_strings_permutation_iterator(stringy_big_string, stringy_items);
        final SubLObject strings_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return new_concatenate_strings_permute_pos_iterator(stringy_big_string, stringy_items, strings_list, permutation_iterator, asent, big_string_is_unicodeP);
    }

    public static final SubLObject new_concatenate_strings_permute_pos_iterator_alt(SubLObject big_string, SubLObject stringy_items, SubLObject strings_list, SubLObject permutations_iterator, SubLObject asent, SubLObject big_string_is_unicodeP) {
        return iteration.new_iterator(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings.concatenate_strings_permute_pos_iterator_state(big_string, stringy_items, strings_list, permutations_iterator, asent, big_string_is_unicodeP), CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_DONE, CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_NEXT, CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_FINALIZE);
    }

    public static SubLObject new_concatenate_strings_permute_pos_iterator(final SubLObject big_string, final SubLObject stringy_items, final SubLObject strings_list, final SubLObject permutations_iterator, final SubLObject asent, final SubLObject big_string_is_unicodeP) {
        return iteration.new_iterator(concatenate_strings_permute_pos_iterator_state(big_string, stringy_items, strings_list, permutations_iterator, asent, big_string_is_unicodeP), CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_DONE, CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_NEXT, CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_FINALIZE);
    }

    public static final SubLObject concatenate_strings_permute_pos_iterator_state_alt(SubLObject big_string, SubLObject stringy_items, SubLObject strings_list, SubLObject permutations_iterator, SubLObject asent, SubLObject big_string_is_unicodeP) {
        return list(big_string, stringy_items, strings_list, permutations_iterator, asent, big_string_is_unicodeP);
    }

    public static SubLObject concatenate_strings_permute_pos_iterator_state(final SubLObject big_string, final SubLObject stringy_items, final SubLObject strings_list, final SubLObject permutations_iterator, final SubLObject asent, final SubLObject big_string_is_unicodeP) {
        return list(big_string, stringy_items, strings_list, permutations_iterator, asent, big_string_is_unicodeP);
    }

    public static final SubLObject concatenate_strings_permute_pos_iterator_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject big_string = NIL;
            SubLObject stringy_items = NIL;
            SubLObject strings_list = NIL;
            SubLObject permutations_iterator = NIL;
            SubLObject asent = NIL;
            SubLObject big_string_is_unicodeP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            big_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            stringy_items = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            strings_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            permutations_iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            big_string_is_unicodeP = current.first();
            current = current.rest();
            if (NIL == current) {
                return iteration.iteration_done(permutations_iterator);
            } else {
                cdestructuring_bind_error(datum, $list_alt17);
            }
        }
        return NIL;
    }

    public static SubLObject concatenate_strings_permute_pos_iterator_done(final SubLObject state) {
        SubLObject big_string = NIL;
        SubLObject stringy_items = NIL;
        SubLObject strings_list = NIL;
        SubLObject permutations_iterator = NIL;
        SubLObject asent = NIL;
        SubLObject big_string_is_unicodeP = NIL;
        destructuring_bind_must_consp(state, state, $list19);
        big_string = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list19);
        stringy_items = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        strings_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        permutations_iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        big_string_is_unicodeP = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_done(permutations_iterator);
        }
        cdestructuring_bind_error(state, $list19);
        return NIL;
    }

    public static final SubLObject concatenate_strings_permute_pos_iterator_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject big_string = NIL;
            SubLObject stringy_items = NIL;
            SubLObject strings_list = NIL;
            SubLObject permutations_iterator = NIL;
            SubLObject asent = NIL;
            SubLObject big_string_is_unicodeP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            big_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            stringy_items = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            strings_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            permutations_iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            big_string_is_unicodeP = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject result = NIL;
                    SubLObject premature_endP = NIL;
                    while (!((NIL != result) || (NIL != premature_endP))) {
                        if (NIL != iteration.iteration_done(permutations_iterator)) {
                            premature_endP = T;
                        } else {
                            {
                                SubLObject permutation = iteration.iteration_next(permutations_iterator);
                                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings.permutation_ordered_consistentlyP(permutation, strings_list)) {
                                    {
                                        SubLObject v_bindings = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings.concatenate_strings_permute_pos_iterator_next_int(big_string, stringy_items, permutation, big_string_is_unicodeP);
                                        if (NIL != v_bindings) {
                                            result = bindings.subst_bindings(v_bindings, asent);
                                        }
                                    }
                                }
                            }
                        }
                    } 
                    return values(result, state, premature_endP);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt17);
            }
        }
        return NIL;
    }

    public static SubLObject concatenate_strings_permute_pos_iterator_next(final SubLObject state) {
        SubLObject big_string = NIL;
        SubLObject stringy_items = NIL;
        SubLObject strings_list = NIL;
        SubLObject permutations_iterator = NIL;
        SubLObject asent = NIL;
        SubLObject big_string_is_unicodeP = NIL;
        destructuring_bind_must_consp(state, state, $list19);
        big_string = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list19);
        stringy_items = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        strings_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        permutations_iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        big_string_is_unicodeP = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject result = NIL;
            SubLObject premature_endP = NIL;
            while ((NIL == result) && (NIL == premature_endP)) {
                if (NIL != iteration.iteration_done(permutations_iterator)) {
                    premature_endP = T;
                } else {
                    final SubLObject permutation = iteration.iteration_next(permutations_iterator);
                    if (NIL == permutation_ordered_consistentlyP(permutation, strings_list)) {
                        continue;
                    }
                    final SubLObject v_bindings = concatenate_strings_permute_pos_iterator_next_int(big_string, stringy_items, permutation, big_string_is_unicodeP);
                    if (NIL == v_bindings) {
                        continue;
                    }
                    result = bindings.subst_bindings(v_bindings, asent);
                }
            } 
            return values(result, state, premature_endP);
        }
        cdestructuring_bind_error(state, $list19);
        return NIL;
    }

    public static final SubLObject concatenate_strings_permute_pos_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject big_string = NIL;
            SubLObject stringy_items = NIL;
            SubLObject strings_list = NIL;
            SubLObject permutations_iterator = NIL;
            SubLObject asent = NIL;
            SubLObject big_string_is_unicodeP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            big_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            stringy_items = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            strings_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            permutations_iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            asent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            big_string_is_unicodeP = current.first();
            current = current.rest();
            if (NIL == current) {
                return iteration.iteration_finalize(permutations_iterator);
            } else {
                cdestructuring_bind_error(datum, $list_alt17);
            }
        }
        return NIL;
    }

    public static SubLObject concatenate_strings_permute_pos_iterator_finalize(final SubLObject state) {
        SubLObject big_string = NIL;
        SubLObject stringy_items = NIL;
        SubLObject strings_list = NIL;
        SubLObject permutations_iterator = NIL;
        SubLObject asent = NIL;
        SubLObject big_string_is_unicodeP = NIL;
        destructuring_bind_must_consp(state, state, $list19);
        big_string = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list19);
        stringy_items = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        strings_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        permutations_iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list19);
        big_string_is_unicodeP = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_finalize(permutations_iterator);
        }
        cdestructuring_bind_error(state, $list19);
        return NIL;
    }

    /**
     * makes the strings strictly alternate with the variables,
     * and performs other preprocessing transformations
     */
    @LispMethod(comment = "makes the strings strictly alternate with the variables,\r\nand performs other preprocessing transformations\nmakes the strings strictly alternate with the variables,\nand performs other preprocessing transformations")
    public static final SubLObject preprocess_stringy_args_alt(SubLObject asent) {
        {
            SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
            SubLObject stringy_args = transform_list_utilities.transform(args, UNICODE_NAUT_P, NAT_ARG1, UNPROVIDED);
            SubLObject datum = stringy_args;
            SubLObject current = datum;
            SubLObject big_string = NIL;
            SubLObject stringy_items = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            big_string = current.first();
            current = current.rest();
            stringy_items = current;
            stringy_items = string_utilities.concatenate_adjacent_strings(stringy_items);
            stringy_items = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings.insert_empty_strings_between_adjacent_variables(stringy_items);
            return values(big_string, stringy_items);
        }
    }

    @LispMethod(comment = "makes the strings strictly alternate with the variables,\r\nand performs other preprocessing transformations\nmakes the strings strictly alternate with the variables,\nand performs other preprocessing transformations")
    public static SubLObject preprocess_stringy_args(final SubLObject asent) {
        final SubLObject args = cycl_utilities.formula_args(asent, UNPROVIDED);
        final SubLObject stringy_args = transform_list_utilities.transform(args, UNICODE_NAUT_P, NAT_ARG1, UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = stringy_args;
        SubLObject big_string = NIL;
        SubLObject stringy_items = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        big_string = current.first();
        current = stringy_items = current.rest();
        stringy_items = string_utilities.concatenate_adjacent_strings(stringy_items);
        stringy_items = insert_empty_strings_between_adjacent_variables(stringy_items);
        return values(big_string, stringy_items);
    }

    public static final SubLObject generate_concatenate_strings_permutation_iterator_alt(SubLObject big_string, SubLObject stringy_items) {
        {
            SubLObject positions_iterators = NIL;
            SubLObject strings_list = NIL;
            if (stringy_items.first().isString() && (NIL == string_utilities.starts_with(big_string, stringy_items.first()))) {
                return values(iteration.new_null_iterator(), NIL);
            }
            {
                SubLObject cdolist_list_var = stringy_items;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    if (item.isString()) {
                        {
                            SubLObject string = item;
                            SubLObject positions = string_utilities.search_all(string, big_string, UNPROVIDED, UNPROVIDED);
                            if (NIL == positions) {
                                return values(iteration.new_null_iterator(), NIL);
                            }
                            positions_iterators = cons(iteration.new_reusable_list_iterator(positions), positions_iterators);
                            strings_list = cons(item, strings_list);
                        }
                    }
                }
            }
            positions_iterators = nreverse(positions_iterators);
            strings_list = nreverse(strings_list);
            {
                SubLObject permutation_iterator = iteration.new_reusable_iterator_cartesian_iterator(positions_iterators);
                return values(permutation_iterator, strings_list);
            }
        }
    }

    public static SubLObject generate_concatenate_strings_permutation_iterator(final SubLObject big_string, final SubLObject stringy_items) {
        SubLObject positions_iterators = NIL;
        SubLObject strings_list = NIL;
        if (stringy_items.first().isString() && (NIL == string_utilities.starts_with(big_string, stringy_items.first()))) {
            return values(iteration.new_null_iterator(), NIL);
        }
        SubLObject cdolist_list_var = stringy_items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (item.isString()) {
                final SubLObject string = item;
                final SubLObject positions = string_utilities.search_all(string, big_string, UNPROVIDED, UNPROVIDED);
                if (NIL == positions) {
                    return values(iteration.new_null_iterator(), NIL);
                }
                positions_iterators = cons(iteration.new_reusable_list_iterator(positions), positions_iterators);
                strings_list = cons(item, strings_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        positions_iterators = nreverse(positions_iterators);
        strings_list = nreverse(strings_list);
        final SubLObject permutation_iterator = iteration.new_reusable_iterator_cartesian_iterator(positions_iterators);
        return values(permutation_iterator, strings_list);
    }

    public static final SubLObject permutation_ordered_consistentlyP_alt(SubLObject permutation, SubLObject strings) {
        {
            SubLObject previous_position = permutation.first();
            SubLObject previous_string = strings.first();
            SubLObject inconsistentP = NIL;
            SubLObject position = NIL;
            SubLObject position_1 = NIL;
            SubLObject string = NIL;
            SubLObject string_2 = NIL;
            for (position = permutation.rest(), position_1 = position.first(), string = strings.rest(), string_2 = string.first(); !((NIL == string) && (NIL == position)); position = position.rest() , position_1 = position.first() , string = string.rest() , string_2 = string.first()) {
                if (!position_1.numGE(add(previous_position, length(previous_string)))) {
                    inconsistentP = T;
                }
                previous_position = position_1;
                previous_string = string_2;
            }
            return makeBoolean(NIL == inconsistentP);
        }
    }

    public static SubLObject permutation_ordered_consistentlyP(final SubLObject permutation, final SubLObject strings) {
        SubLObject previous_position = permutation.first();
        SubLObject previous_string = strings.first();
        SubLObject inconsistentP = NIL;
        SubLObject position = NIL;
        SubLObject position_$1 = NIL;
        SubLObject string = NIL;
        SubLObject string_$2 = NIL;
        position = permutation.rest();
        position_$1 = position.first();
        string = strings.rest();
        string_$2 = string.first();
        while ((NIL != string) || (NIL != position)) {
            if (!position_$1.numGE(add(previous_position, length(previous_string)))) {
                inconsistentP = T;
            }
            previous_position = position_$1;
            previous_string = string_$2;
            position = position.rest();
            position_$1 = position.first();
            string = string.rest();
            string_$2 = string.first();
        } 
        return makeBoolean(NIL == inconsistentP);
    }

    public static final SubLObject concatenate_strings_permute_pos_iterator_next_int_alt(SubLObject big_string, SubLObject stringy_items, SubLObject permutation, SubLObject big_string_is_unicodeP) {
        {
            SubLObject rest_of_permutation = permutation;
            SubLObject next_permutation_element = rest_of_permutation.first();
            SubLObject start = ZERO_INTEGER;
            SubLObject end = next_permutation_element;
            SubLObject v_bindings = NIL;
            SubLObject cdolist_list_var = stringy_items;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (item.isString()) {
                    start = add(start, length(item));
                    rest_of_permutation = rest_of_permutation.rest();
                    next_permutation_element = rest_of_permutation.first();
                    end = (NIL != next_permutation_element) ? ((SubLObject) (next_permutation_element)) : NIL;
                } else {
                    v_bindings = append(v_bindings, com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings.removal_concatenate_strings_partial_bindings(big_string, item, start, end, big_string_is_unicodeP));
                    start = end;
                }
            }
            return NIL != v_bindings ? ((SubLObject) ((!start.isInteger()) || (NIL != list_utilities.lengthE(big_string, start, UNPROVIDED)) ? ((SubLObject) (v_bindings)) : NIL)) : NIL;
        }
    }

    public static SubLObject concatenate_strings_permute_pos_iterator_next_int(final SubLObject big_string, final SubLObject stringy_items, final SubLObject permutation, final SubLObject big_string_is_unicodeP) {
        SubLObject rest_of_permutation = permutation;
        SubLObject next_permutation_element = rest_of_permutation.first();
        SubLObject start = ZERO_INTEGER;
        SubLObject end = next_permutation_element;
        SubLObject v_bindings = NIL;
        SubLObject cdolist_list_var = stringy_items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (item.isString()) {
                start = add(start, length(item));
                rest_of_permutation = rest_of_permutation.rest();
                next_permutation_element = rest_of_permutation.first();
                end = (NIL != next_permutation_element) ? next_permutation_element : NIL;
            } else {
                v_bindings = append(v_bindings, removal_concatenate_strings_partial_bindings(big_string, item, start, end, big_string_is_unicodeP));
                start = end;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL != v_bindings ? (!start.isInteger()) || (NIL != list_utilities.lengthE(big_string, start, UNPROVIDED)) ? v_bindings : NIL : NIL;
    }

    public static final SubLObject removal_concatenate_strings_partial_bindings_alt(SubLObject big_string, SubLObject var, SubLObject start, SubLObject end, SubLObject big_string_is_unicodeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (end.isInteger() && end.numG(length(big_string))) {
                end = NIL;
            }
            if ((start.isInteger() && end.isInteger()) && start.numG(end)) {
                start = end;
            }
            {
                SubLObject substring = string_utilities.substring(big_string, start, end);
                SubLObject substring_to_use = (NIL != big_string_is_unicodeP) ? ((SubLObject) (unicode_nauts.display_vector_string_to_cycl_safe_string(substring))) : substring;
                thread.resetMultipleValues();
                {
                    SubLObject v_bindings = unification_utilities.term_unify(var, substring_to_use, UNPROVIDED, UNPROVIDED);
                    SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return v_bindings;
                }
            }
        }
    }

    public static SubLObject removal_concatenate_strings_partial_bindings(final SubLObject big_string, final SubLObject var, SubLObject start, SubLObject end, final SubLObject big_string_is_unicodeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (end.isInteger() && end.numG(length(big_string))) {
            end = NIL;
        }
        if ((start.isInteger() && end.isInteger()) && start.numG(end)) {
            start = end;
        }
        final SubLObject substring = string_utilities.substring(big_string, start, end);
        final SubLObject substring_to_use = (NIL != big_string_is_unicodeP) ? unicode_nauts.display_vector_string_to_cycl_safe_string(substring) : substring;
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, substring_to_use, UNPROVIDED, UNPROVIDED);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return v_bindings;
    }

    public static final SubLObject insert_empty_strings_between_adjacent_variables_alt(SubLObject items) {
        {
            SubLObject new_items = NIL;
            SubLObject last_item_was_a_variableP = NIL;
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL != variables.not_fully_bound_p(item)) {
                    if (NIL != last_item_was_a_variableP) {
                        new_items = cons($str_alt21$, new_items);
                        new_items = cons(item, new_items);
                    } else {
                        new_items = cons(item, new_items);
                    }
                    last_item_was_a_variableP = T;
                } else {
                    new_items = cons(item, new_items);
                    last_item_was_a_variableP = NIL;
                }
            }
            return nreverse(new_items);
        }
    }

    public static SubLObject insert_empty_strings_between_adjacent_variables(final SubLObject items) {
        SubLObject new_items = NIL;
        SubLObject last_item_was_a_variableP = NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != variables.not_fully_bound_p(item)) {
                if (NIL != last_item_was_a_variableP) {
                    new_items = cons($str23$, new_items);
                    new_items = cons(item, new_items);
                } else {
                    new_items = cons(item, new_items);
                }
                last_item_was_a_variableP = T;
            } else {
                new_items = cons(item, new_items);
                last_item_was_a_variableP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return nreverse(new_items);
    }

    public static final SubLObject declare_removal_modules_concatenate_strings_file_alt() {
        declareFunction("removal_concatenate_strings_bound_args_supported_p", "REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P", 2, 0, false);
        declareFunction("removal_concatenate_strings_arg_supported_p", "REMOVAL-CONCATENATE-STRINGS-ARG-SUPPORTED-P", 1, 0, false);
        declareFunction("removal_concatenate_strings_concatenate_arg1_pos", "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS", 1, 1, false);
        declareFunction("removal_concatenate_strings_concatenate_neg", "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG", 1, 1, false);
        declareFunction("removal_concatenate_strings_permute_cost", "REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST", 1, 1, false);
        declareFunction("removal_concatenate_strings_permute_pos_output_generate", "REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE", 1, 1, false);
        declareFunction("new_concatenate_strings_permute_pos_iterator", "NEW-CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR", 6, 0, false);
        declareFunction("concatenate_strings_permute_pos_iterator_state", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-STATE", 6, 0, false);
        declareFunction("concatenate_strings_permute_pos_iterator_done", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-DONE", 1, 0, false);
        declareFunction("concatenate_strings_permute_pos_iterator_next", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT", 1, 0, false);
        declareFunction("concatenate_strings_permute_pos_iterator_finalize", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("preprocess_stringy_args", "PREPROCESS-STRINGY-ARGS", 1, 0, false);
        declareFunction("generate_concatenate_strings_permutation_iterator", "GENERATE-CONCATENATE-STRINGS-PERMUTATION-ITERATOR", 2, 0, false);
        declareFunction("permutation_ordered_consistentlyP", "PERMUTATION-ORDERED-CONSISTENTLY?", 2, 0, false);
        declareFunction("concatenate_strings_permute_pos_iterator_next_int", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT-INT", 4, 0, false);
        declareFunction("removal_concatenate_strings_partial_bindings", "REMOVAL-CONCATENATE-STRINGS-PARTIAL-BINDINGS", 5, 0, false);
        declareFunction("insert_empty_strings_between_adjacent_variables", "INSERT-EMPTY-STRINGS-BETWEEN-ADJACENT-VARIABLES", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_removal_modules_concatenate_strings_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("removal_concatenate_strings_bound_args_supported_p", "REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P", 1, 1, false);
            declareFunction("removal_concatenate_strings_arg_supported_p", "REMOVAL-CONCATENATE-STRINGS-ARG-SUPPORTED-P", 1, 0, false);
            declareFunction("removal_concatenate_strings_concatenate_arg1_pos", "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS", 1, 1, false);
            declareFunction("removal_concatenate_strings_concatenate_neg", "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG", 1, 1, false);
            declareFunction("removal_concatenate_strings_permute_cost", "REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST", 1, 1, false);
            declareFunction("removal_concatenate_strings_permute_pos_output_generate", "REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE", 1, 1, false);
            declareFunction("new_concatenate_strings_permute_pos_iterator", "NEW-CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR", 6, 0, false);
            declareFunction("concatenate_strings_permute_pos_iterator_state", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-STATE", 6, 0, false);
            declareFunction("concatenate_strings_permute_pos_iterator_done", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-DONE", 1, 0, false);
            declareFunction("concatenate_strings_permute_pos_iterator_next", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT", 1, 0, false);
            declareFunction("concatenate_strings_permute_pos_iterator_finalize", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-FINALIZE", 1, 0, false);
            declareFunction("preprocess_stringy_args", "PREPROCESS-STRINGY-ARGS", 1, 0, false);
            declareFunction("generate_concatenate_strings_permutation_iterator", "GENERATE-CONCATENATE-STRINGS-PERMUTATION-ITERATOR", 2, 0, false);
            declareFunction("permutation_ordered_consistentlyP", "PERMUTATION-ORDERED-CONSISTENTLY?", 2, 0, false);
            declareFunction("concatenate_strings_permute_pos_iterator_next_int", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT-INT", 4, 0, false);
            declareFunction("removal_concatenate_strings_partial_bindings", "REMOVAL-CONCATENATE-STRINGS-PARTIAL-BINDINGS", 5, 0, false);
            declareFunction("insert_empty_strings_between_adjacent_variables", "INSERT-EMPTY-STRINGS-BETWEEN-ADJACENT-VARIABLES", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("removal_concatenate_strings_bound_args_supported_p", "REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_concatenate_strings_file_Previous() {
        declareFunction("removal_concatenate_strings_bound_args_supported_p", "REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P", 1, 1, false);
        declareFunction("removal_concatenate_strings_arg_supported_p", "REMOVAL-CONCATENATE-STRINGS-ARG-SUPPORTED-P", 1, 0, false);
        declareFunction("removal_concatenate_strings_concatenate_arg1_pos", "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS", 1, 1, false);
        declareFunction("removal_concatenate_strings_concatenate_neg", "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG", 1, 1, false);
        declareFunction("removal_concatenate_strings_permute_cost", "REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST", 1, 1, false);
        declareFunction("removal_concatenate_strings_permute_pos_output_generate", "REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE", 1, 1, false);
        declareFunction("new_concatenate_strings_permute_pos_iterator", "NEW-CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR", 6, 0, false);
        declareFunction("concatenate_strings_permute_pos_iterator_state", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-STATE", 6, 0, false);
        declareFunction("concatenate_strings_permute_pos_iterator_done", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-DONE", 1, 0, false);
        declareFunction("concatenate_strings_permute_pos_iterator_next", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT", 1, 0, false);
        declareFunction("concatenate_strings_permute_pos_iterator_finalize", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("preprocess_stringy_args", "PREPROCESS-STRINGY-ARGS", 1, 0, false);
        declareFunction("generate_concatenate_strings_permutation_iterator", "GENERATE-CONCATENATE-STRINGS-PERMUTATION-ITERATOR", 2, 0, false);
        declareFunction("permutation_ordered_consistentlyP", "PERMUTATION-ORDERED-CONSISTENTLY?", 2, 0, false);
        declareFunction("concatenate_strings_permute_pos_iterator_next_int", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT-INT", 4, 0, false);
        declareFunction("removal_concatenate_strings_partial_bindings", "REMOVAL-CONCATENATE-STRINGS-PARTIAL-BINDINGS", 5, 0, false);
        declareFunction("insert_empty_strings_between_adjacent_variables", "INSERT-EMPTY-STRINGS-BETWEEN-ADJACENT-VARIABLES", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("concatenateStrings"), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell("concatenateStrings"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("BaseKB"), makeKeyword("DOCUMENTATION"), makeString("(#$concatenateStrings :not-fully-bound . :fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$concatenateStrings ?X \"foo\" \"bar\")\nwill bind ?X to \"foobar\"") });

    public static SubLObject init_removal_modules_concatenate_strings_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_concatenate_strings_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$concatenateStrings);
        inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS, $list_alt2);
        note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_BOUND_ARGS_SUPPORTED_P);
        note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS);
        inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG, $list_alt8);
        note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG);
        inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS, $list_alt11);
        note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_PERMUTE_COST);
        note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS_OUTPUT_GENERATE);
        return NIL;
    }

    public static SubLObject setup_removal_modules_concatenate_strings_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$concatenateStrings);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$concatenateStrings);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$concatenateStrings);
            inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS, $list4);
            note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_BOUND_ARGS_SUPPORTED_P);
            note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS);
            inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG, $list10);
            note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG);
            inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS, $list13);
            note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_PERMUTE_COST);
            note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS_OUTPUT_GENERATE);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS, $list_alt2);
            inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG, $list_alt8);
            inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS, $list_alt11);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_concatenate_strings_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$concatenateStrings);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$concatenateStrings);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$concatenateStrings);
        inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS, $list4);
        note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_BOUND_ARGS_SUPPORTED_P);
        note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS);
        inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG, $list10);
        note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG);
        inference_modules.inference_removal_module($REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS, $list13);
        note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_PERMUTE_COST);
        note_funcall_helper_function(REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS_OUTPUT_GENERATE);
        return NIL;
    }

    static private final SubLList $list_alt4 = cons(makeSymbol("ARG1"), makeSymbol("STRINGS"));

    @Override
    public void declareFunctions() {
        declare_removal_modules_concatenate_strings_file();
    }

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("concatenateStrings"), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell("concatenateStrings"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("BaseKB"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$concatenateStrings :fully-bound . :fully-bound))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$concatenateStrings \"something unrelated\" \"foo\" \"bar\"))\nwill be provable\n    (#$not (#$concatenateStrings \"foobar\" \"foo\" \"bar\"))\nwill fail to be provable") });

    @Override
    public void initializeVariables() {
        init_removal_modules_concatenate_strings_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_concatenate_strings_file();
    }

    static {
    }

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("concatenateStrings"), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell("concatenateStrings"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("BaseKB"), makeKeyword("DOCUMENTATION"), makeString("(#$concatenateStrings :fully-bound . :not-fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$concatenateStrings \"foobar\" ?X \"o\" ?Z)\nwill bind ?X ?Z to both \"fo\" \"bar\"\nand \"f\" \"obar\".") });

    static private final SubLList $list_alt17 = list(makeSymbol("BIG-STRING"), makeSymbol("STRINGY-ITEMS"), makeSymbol("STRINGS-LIST"), makeSymbol("PERMUTATIONS-ITERATOR"), makeSymbol("ASENT"), makeSymbol("BIG-STRING-IS-UNICODE?"));

    static private final SubLList $list_alt20 = cons(makeSymbol("BIG-STRING"), makeSymbol("STRINGY-ITEMS"));
}

/**
 * Total time: 76 ms
 */
