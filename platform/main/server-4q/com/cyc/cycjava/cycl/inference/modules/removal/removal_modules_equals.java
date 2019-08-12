/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-EQUALS
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-equals.lisp
 * created:     2019/07/03 17:37:45
 */
public final class removal_modules_equals extends SubLTranslatedFile implements V12 {
    public static final SubLObject removal_regex_string_match_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return regular_expressions.is_regular_expressions_support_availableP();
    }

    public static final SubLObject removal_regex_string_match_case_insensitive_required(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return regular_expressions.is_regular_expressions_support_availableP();
    }

    public static final SubLObject regex_string_match_with_bindings_int(SubLObject asent, SubLObject sense, SubLObject regex_options) {
        {
            SubLObject pattern = cycl_utilities.formula_arg1(asent, UNPROVIDED);
            SubLObject string = cycl_utilities.formula_arg2(asent, UNPROVIDED);
            SubLObject match_var_count = subtract(formula_arity(asent, UNPROVIDED), TWO_INTEGER);
            SubLObject matches = regular_expression_utilities.regexp_capturing_match(pattern, string, regex_options, UNPROVIDED);
            SubLObject result_sentence = make_formula(cycl_utilities.formula_arg0(asent), list(pattern, string), UNPROVIDED);
            SubLObject too_few_matchesP = NIL;
            SubLObject n = NIL;
            for (n = ZERO_INTEGER; n.numL(match_var_count); n = add(n, ONE_INTEGER)) {
                {
                    SubLObject current_match = nth(add(ONE_INTEGER, n), matches);
                    SubLObject new_cons = cons(current_match, NIL);
                    SubLObject list = result_sentence;
                    if (NIL != list) {
                        subl_macros.rplacd_last(list, new_cons);
                    } else {
                        result_sentence = new_cons;
                    }
                    if (NIL == current_match) {
                        too_few_matchesP = T;
                    }
                }
            }
            if (NIL != too_few_matchesP) {
                return NIL;
            } else {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, result_sentence, UNPROVIDED, UNPROVIDED), unification_utilities.asent_unify(asent, result_sentence, T, UNPROVIDED), UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject regex_string_match_with_bindings_case_insensitive(SubLObject asent, SubLObject sense) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.regex_string_match_with_bindings_int(asent, sense, $list_alt58);
    }

    public static final SubLObject regex_string_match_with_bindings(SubLObject asent, SubLObject sense) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.regex_string_match_with_bindings_int(asent, sense, NIL);
    }

    public static final SubLObject regex_string_match_case_insensitive(SubLObject regex_string, SubLObject data_string) {
        SubLTrampolineFile.checkType(regex_string, STRINGP);
        SubLTrampolineFile.checkType(data_string, STRINGP);
        return list_utilities.sublisp_boolean(regular_expression_utilities.find_all_matches_for_regular_expression(regex_string, data_string, $list_alt58, UNPROVIDED));
    }

    public static final SubLObject regex_string_match(SubLObject regex_string, SubLObject data_string) {
        SubLTrampolineFile.checkType(regex_string, STRINGP);
        SubLTrampolineFile.checkType(data_string, STRINGP);
        return list_utilities.sublisp_boolean(regular_expression_utilities.find_all_matches_for_regular_expression(regex_string, data_string, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLSymbol $regex_string_match_case_insensitive_mt$ = makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*");

    public static final SubLSymbol $regex_string_match_mt$ = makeSymbol("*REGEX-STRING-MATCH-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_regex_string_match_case_insensitive_cost$ = makeSymbol("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_regex_string_match_cost$ = makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*");

    public static final SubLFile me = new removal_modules_equals();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_equals_fort_check_cost$ = makeSymbol("*DEFAULT-EQUALS-FORT-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_all_equals_cost$ = makeSymbol("*DEFAULT-ALL-EQUALS-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $default_unify_cost$ = makeSymbol("*DEFAULT-UNIFY-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_unique_names_cost$ = makeSymbol("*DEFAULT-UNIQUE-NAMES-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_equals_cost$ = makeSymbol("*DEFAULT-NOT-EQUALS-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_equals_non_atomic_cost$ = makeSymbol("*DEFAULT-NOT-EQUALS-NON-ATOMIC-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_equal_symbols_check_cost$ = makeSymbol("*DEFAULT-EQUAL-SYMBOLS-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_equal_symbols_unify_cost$ = makeSymbol("*DEFAULT-EQUAL-SYMBOLS-UNIFY-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_equal_symbols_cost$ = makeSymbol("*DEFAULT-NOT-EQUAL-SYMBOLS-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_equal_strings_case_insensitive_check_cost$ = makeSymbol("*DEFAULT-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_equal_strings_case_insensitive_cost$ = makeSymbol("*DEFAULT-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_equals_via_numerically_equals_cost$ = makeSymbol("*DEFAULT-EQUALS-VIA-NUMERICALLY-EQUALS-COST*");



    private static final SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");

    private static final SubLSymbol $REMOVAL_NON_WFF_CHECK_NEG = makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");

    private static final SubLSymbol $REMOVAL_EQUALS_FORT_CHECK = makeKeyword("REMOVAL-EQUALS-FORT-CHECK");

    static private final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("equals"), $FORT, makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell("equals"), makeKeyword("FULLY-BOUND"), $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EQUALS-FORT-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUALS-FORT-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <fort> <fully-bound>))\n    (#$equals <fully-bound> <fort>)\n    via unification and #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals #$Dog #$Dog)\n    (#$equals (#$JuvenileFn #$Dog)(#$JuvenileFn #$Dog))") });

    private static final SubLSymbol $REMOVAL_ALL_EQUALS = makeKeyword("REMOVAL-ALL-EQUALS");

    static private final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("equals"), $FORT, makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell("equals"), makeKeyword("NOT-FULLY-BOUND"), $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-EQUALS-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <fort> <not fully-bound>)\n    (#$equals <not fully-bound> <fort>)\n    via unification and #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals #$Dog ?WHAT)") });

    static private final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equals"), list(makeKeyword("NOT"), $FORT), list(makeKeyword("NOT"), $FORT)), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-UNIFY-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-UNIFY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <non-fort> <non-fort>)\n    by unifying ARG1 and ARG2 and using #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals 212 212)\n    (#$equals 212 ?TERM)\n    (#$equals (#$YearFn 2000) (#$YearFn 2000))\n    (#$equals (#$YearFn 2000) (#$YearFn ?YEAR))\n    (#$equals (?FUNC 2000) (#$YearFn ?YEAR))") });

    private static final SubLSymbol $REMOVAL_UNIQUE_NAMES = makeKeyword("REMOVAL-UNIQUE-NAMES");

    static private final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equals"), makeKeyword("CONSTANT"), makeKeyword("CONSTANT")), $COST, makeSymbol("REMOVAL-UNIQUE-NAMES-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNIQUE-NAMES-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <constant> <constant>))\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog #$Person))") });

    private static final SubLSymbol $REMOVAL_NOT_EQUALS = makeKeyword("REMOVAL-NOT-EQUALS");

    static private final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell("equals"), list($TEST, makeSymbol("INFERENCE-ATOMIC-TERM-P")), list($TEST, makeSymbol("INFERENCE-ATOMIC-TERM-P"))), list(makeKeyword("NOT"), list(reader_make_constant_shell("equals"), makeKeyword("CONSTANT"), makeKeyword("CONSTANT")))), $COST, makeSymbol("REMOVAL-NOT-EQUALS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <atomic term> <atomic term>))\n    where either ARG1 or ARG2 is not a <constant-p>\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog \"Dog\"))\n    (#$not (#$equals 1 2))") });

    private static final SubLFloat $float$1_1 = makeDouble(1.1);

    private static final SubLSymbol $REMOVAL_NOT_EQUALS_NON_ATOMIC = makeKeyword("REMOVAL-NOT-EQUALS-NON-ATOMIC");

    static private final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell("equals"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), list(reader_make_constant_shell("equals"), list($TEST, makeSymbol("INFERENCE-ATOMIC-TERM-P")), list($TEST, makeSymbol("INFERENCE-ATOMIC-TERM-P")))), list(makeKeyword("NOT"), list(reader_make_constant_shell("equals"), makeKeyword("CONSTANT"), makeKeyword("CONSTANT")))), $COST, makeSymbol("REMOVAL-NOT-EQUALS-NON-ATOMIC-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <fully-bound term> <fully-bound term>))\n    where either ARG1 or ARG2 is not a <constant-p> or <atomic term>\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog (#$JuvenileFn \"Dog\")))\n    (#$not (#$equals (#$JuvenileFn \"Dog\") (#$JuvenileFn #$Dog)))") });



    private static final SubLSymbol $EQUAL_SYMBOLS_DELAY_POS = makeKeyword("EQUAL-SYMBOLS-DELAY-POS");

    static private final SubLList $list24 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalSymbols"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equalSymbols"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    public static final SubLSymbol $equal_symbols_defining_mt$ = makeSymbol("*EQUAL-SYMBOLS-DEFINING-MT*");



    private static final SubLSymbol $REMOVAL_EQUAL_SYMBOLS_REJECT = makeKeyword("REMOVAL-EQUAL-SYMBOLS-REJECT");

    static private final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalSymbols"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell("equalSymbols"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list($TEST, makeSymbol("REMOVAL-EQUAL-SYMBOLS-REJECT"))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <whatever> <whatever>)\n    where unification between ARG1 and ARG2 is provably doomed to fail"), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols (#$JuvenileFn ?DOG) (#$MaleFn ?DOG))") });

    private static final SubLSymbol $REMOVAL_EQUAL_SYMBOLS_CHECK = makeKeyword("REMOVAL-EQUAL-SYMBOLS-CHECK");

    static private final SubLList $list30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalSymbols"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equalSymbols"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-EQUAL-SYMBOLS-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <fully bound> <fully bound>) using EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols #$Dog #$Dog)\n    (#$equalSymbols 3 3)") });

    private static final SubLSymbol $REMOVAL_EQUAL_SYMBOLS_UNIFY = makeKeyword("REMOVAL-EQUAL-SYMBOLS-UNIFY");

    static private final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalSymbols"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("equalSymbols"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell("equalSymbols"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-UNIFY-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EQUAL-SYMBOLS-UNIFY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <whatever> <not fully bound>)\n    (#$equalSymbols <not fully bound> <whatever>)\n    using unification, but no #$equals assertions."), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols 212 ?WHAT)\n    (#$equalSymbols #$Dog ?WHAT)\n    (#$equalSymbols (#$YearFn ?YEAR)(?FUNC 2003))") });

    private static final SubLSymbol $REMOVAL_NOT_EQUAL_SYMBOLS = makeKeyword("REMOVAL-NOT-EQUAL-SYMBOLS");

    static private final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalSymbols"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equalSymbols"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-NOT-EQUAL-SYMBOLS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUAL-SYMBOLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equalSymbols <fully bound> <fully bound>))\n    using failure of EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equalSymbols #$Pi-Number 3.14159))") });

    private static final SubLObject $$equalStrings_CaseInsensitive = reader_make_constant_shell("equalStrings-CaseInsensitive");

    public static final SubLSymbol $equal_strings_case_insensitive_defining_mt$ = makeSymbol("*EQUAL-STRINGS-CASE-INSENSITIVE-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_EQUAL_STRINGS_CASE_INSENSITIVE_CHECK = makeKeyword("REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK");

    private static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalStrings-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equalStrings-CaseInsensitive"), makeKeyword("STRING"), makeKeyword("STRING")), $COST, makeSymbol("REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equalStrings-CaseInsensitive <string> <string>)\n    using STRING-EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$equalStrings-CaseInsensitive \"DOG\" \"Dog\")") });

    private static final SubLSymbol $REMOVAL_NOT_EQUAL_STRINGS_CASE_INSENSITIVE = makeKeyword("REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE");

    private static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalStrings-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equalStrings-CaseInsensitive"), makeKeyword("STRING"), makeKeyword("STRING")), $COST, makeSymbol("REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equalStrings-CaseInsensitive <string> <string>))\n    using failure of STRING-EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equalStrings-CaseInsensitive \"DOGG\" \"Dog\"))") });



    private static final SubLList $list44 = list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("numericallyEquals"), reader_make_constant_shell("equals"));



    private static final SubLSymbol $REMOVAL_EQUALS_VIA_NUMERICALLY_EQUALS = makeKeyword("REMOVAL-EQUALS-VIA-NUMERICALLY-EQUALS");

    private static final SubLList $list49 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equals"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("IBQE?"))), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list($TEST, makeSymbol("IBQE?")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EQUALS-VIA-NUMERICALLY-EQUALS-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUALS-VIA-NUMERICALLY-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <fully-bound ibqe> <fully-bound ibqe>)\n    via evaulation of #$numericallyEquals"), makeKeyword("EXAMPLE"), makeString("(#$equals (#$GigaHertz 1) (#$MegaHertz 1000))\n    (#$equals (#$Percent 0 100) (#$Unity 0 1))") });

    // Definitions
    public static final SubLObject make_equals_hl_support_alt(SubLObject term1, SubLObject term2, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject monotonically_universally_equalP = equal(term1, term2);
                SubLObject universally_equalP = makeBoolean((NIL != monotonically_universally_equalP) || (NIL != equals.equal_everywhereP(term1, term2)));
                SubLObject tv = (NIL != monotonically_universally_equalP) ? ((SubLObject) ($TRUE_MON)) : $TRUE_DEF;
                SubLObject mt = (NIL != negateP) ? ((SubLObject) (mt_relevance_macros.$mt$.getDynamicValue(thread))) : NIL != universally_equalP ? ((SubLObject) (mt_vars.$equals_defining_mt$.getGlobalValue())) : mt_relevance_macros.$mt$.getDynamicValue(thread);
                SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal($$equals, list(term1, term2));
                SubLObject hl_support_formula = (NIL != negateP) ? ((SubLObject) (cycl_utilities.negate(atomic_sentence))) : atomic_sentence;
                SubLObject hl_support = arguments.make_hl_support($EQUALITY, hl_support_formula, mt, tv);
                return hl_support;
            }
        }
    }

    // Definitions
    public static SubLObject make_equals_hl_support(final SubLObject term1, final SubLObject term2, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject monotonically_universally_equalP = equal(term1, term2);
        final SubLObject universally_equalP = makeBoolean((NIL != monotonically_universally_equalP) || (NIL != equals.equal_everywhereP(term1, term2)));
        final SubLObject tv = (NIL != monotonically_universally_equalP) ? $TRUE_MON : $TRUE_DEF;
        final SubLObject mt = (NIL != negateP) ? mt_relevance_macros.$mt$.getDynamicValue(thread) : NIL != universally_equalP ? mt_vars.$equals_defining_mt$.getGlobalValue() : mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal($$equals, list(term1, term2));
        final SubLObject hl_support_formula = (NIL != negateP) ? cycl_utilities.negate(atomic_sentence) : atomic_sentence;
        final SubLObject hl_support = arguments.make_hl_support($EQUALITY, hl_support_formula, mt, tv);
        return hl_support;
    }

    public static final SubLObject removal_equals_fort_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject fort = (NIL != forts.fort_p(arg1)) ? ((SubLObject) (arg1)) : arg2;
            SubLObject other = (NIL != forts.fort_p(arg1)) ? ((SubLObject) (arg2)) : arg1;
            if (NIL != equals.equalsP(fort, other, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equals_hl_support(fort, other, UNPROVIDED);
                    backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_equals_fort_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject fort = (NIL != forts.fort_p(arg1)) ? arg1 : arg2;
        final SubLObject other = (NIL != forts.fort_p(arg1)) ? arg2 : arg1;
        if (NIL != equals.equalsP(fort, other, UNPROVIDED, UNPROVIDED)) {
            final SubLObject hl_support = make_equals_hl_support(fort, other, UNPROVIDED);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_all_equals_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject fort = (NIL != forts.fort_p(arg1)) ? ((SubLObject) (arg1)) : arg2;
                SubLObject other = (NIL != forts.fort_p(arg1)) ? ((SubLObject) (arg2)) : arg1;
                SubLObject equal_terms = equals.all_equals(fort, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = equal_terms;
                SubLObject equal_term = NIL;
                for (equal_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , equal_term = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(other, equal_term, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject subst_other = bindings.subst_bindings(v_bindings, other);
                                SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equals_hl_support(fort, subst_other, UNPROVIDED);
                                backward.removal_add_node(hl_support, v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_all_equals_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject fort = (NIL != forts.fort_p(arg1)) ? arg1 : arg2;
        final SubLObject other = (NIL != forts.fort_p(arg1)) ? arg2 : arg1;
        SubLObject cdolist_list_var;
        final SubLObject equal_terms = cdolist_list_var = equals.all_equals(fort, UNPROVIDED, UNPROVIDED);
        SubLObject equal_term = NIL;
        equal_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(other, equal_term, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject subst_other = bindings.subst_bindings(v_bindings, other);
                final SubLObject hl_support = make_equals_hl_support(fort, subst_other, UNPROVIDED);
                backward.removal_add_node(hl_support, v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            equal_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_unify_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject v_bindings = unification_utilities.term_unify(term1, term2, UNPROVIDED, UNPROVIDED);
                    SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        {
                            SubLObject unify_term1 = bindings.subst_bindings(v_bindings, term1);
                            SubLObject unify_term2 = bindings.subst_bindings(v_bindings, term2);
                            if ((NIL != variables.fully_bound_p(unify_term1)) && (NIL != variables.fully_bound_p(unify_term2))) {
                                return T;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(term1, term2, UNPROVIDED, UNPROVIDED);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject unify_term1 = bindings.subst_bindings(v_bindings, term1);
            final SubLObject unify_term2 = bindings.subst_bindings(v_bindings, term2);
            if ((NIL != variables.fully_bound_p(unify_term1)) && (NIL != variables.fully_bound_p(unify_term2))) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject removal_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject v_bindings = unification_utilities.term_unify(term1, term2, T, T);
                    SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        {
                            SubLObject unify_term1 = bindings.subst_bindings(v_bindings, term1);
                            SubLObject unify_term2 = bindings.subst_bindings(v_bindings, term2);
                            SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equals_hl_support(unify_term1, unify_term2, UNPROVIDED);
                            backward.removal_add_node(hl_support, v_bindings, unify_justification);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(term1, term2, T, T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject unify_term1 = bindings.subst_bindings(v_bindings, term1);
            final SubLObject unify_term2 = bindings.subst_bindings(v_bindings, term2);
            final SubLObject hl_support = make_equals_hl_support(unify_term1, unify_term2, UNPROVIDED);
            backward.removal_add_node(hl_support, v_bindings, unify_justification);
        }
        return NIL;
    }

    public static final SubLObject removal_unique_names_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (term1.equal(term2)) {
                    return ZERO_INTEGER;
                } else {
                    return $default_unique_names_cost$.getDynamicValue(thread);
                }
            }
        }
    }

    public static SubLObject removal_unique_names_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (term1.equal(term2)) {
            return ZERO_INTEGER;
        }
        return $default_unique_names_cost$.getDynamicValue(thread);
    }

    public static final SubLObject removal_unique_names_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if ((NIL == equals.unique_names_assumption_applicable_to_termP(term1)) || (NIL == equals.unique_names_assumption_applicable_to_termP(term2))) {
                if (NIL != equals.differentP(list(term1, term2), UNPROVIDED)) {
                    {
                        SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equals_hl_support(term1, term2, T);
                        backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                    }
                }
            } else {
                if (NIL == equals.equalsP(term1, term2, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equals_hl_support(term1, term2, T);
                        backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_unique_names_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if ((NIL == equals.unique_names_assumption_applicable_to_termP(term1)) || (NIL == equals.unique_names_assumption_applicable_to_termP(term2))) {
            if (NIL != equals.differentP(list(term1, term2), UNPROVIDED)) {
                final SubLObject hl_support = make_equals_hl_support(term1, term2, T);
                backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (NIL == equals.equalsP(term1, term2, UNPROVIDED, UNPROVIDED)) {
                final SubLObject hl_support = make_equals_hl_support(term1, term2, T);
                backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static final SubLObject removal_not_equals_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (term1.equal(term2)) {
                    return ZERO_INTEGER;
                } else {
                    return $default_not_equals_cost$.getDynamicValue(thread);
                }
            }
        }
    }

    public static SubLObject removal_not_equals_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (term1.equal(term2)) {
            return ZERO_INTEGER;
        }
        return $default_not_equals_cost$.getDynamicValue(thread);
    }

    public static final SubLObject removal_not_equals_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if ((NIL == equals.unique_names_assumption_applicable_to_termP(term1)) || (NIL == equals.unique_names_assumption_applicable_to_termP(term2))) {
                if (NIL != equals.differentP(list(term1, term2), UNPROVIDED)) {
                    {
                        SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equals_hl_support(term1, term2, T);
                        backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                    }
                }
            } else {
                if (NIL == unification_utilities.term_unify(term1, term2, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equals_hl_support(term1, term2, T);
                        backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_not_equals_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if ((NIL == equals.unique_names_assumption_applicable_to_termP(term1)) || (NIL == equals.unique_names_assumption_applicable_to_termP(term2))) {
            if (NIL != equals.differentP(list(term1, term2), UNPROVIDED)) {
                final SubLObject hl_support = make_equals_hl_support(term1, term2, T);
                backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (NIL == unification_utilities.term_unify(term1, term2, UNPROVIDED, UNPROVIDED)) {
                final SubLObject hl_support = make_equals_hl_support(term1, term2, T);
                backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static final SubLObject removal_not_equals_non_atomic_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (term1.equal(term2)) {
                    return ZERO_INTEGER;
                } else {
                    return $default_not_equals_non_atomic_cost$.getDynamicValue(thread);
                }
            }
        }
    }

    public static SubLObject removal_not_equals_non_atomic_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (term1.equal(term2)) {
            return ZERO_INTEGER;
        }
        return $default_not_equals_non_atomic_cost$.getDynamicValue(thread);
    }

    public static final SubLObject inference_equal_symbols_reject_alt(SubLObject term1, SubLObject term2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $perform_equals_unification$.currentBinding(thread);
                    try {
                        $perform_equals_unification$.bind(NIL, thread);
                        ans = unification.unify_impossible(term1, term2);
                    } finally {
                        $perform_equals_unification$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject inference_equal_symbols_reject(final SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $perform_equals_unification$.currentBinding(thread);
        try {
            $perform_equals_unification$.bind(NIL, thread);
            ans = unification.unify_impossible(term1, term2);
        } finally {
            $perform_equals_unification$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject make_equal_symbols_hl_support_alt(SubLObject term1, SubLObject term2, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        {
            SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal($$equalSymbols, list(term1, term2));
            SubLObject hl_support_formula = (NIL != negateP) ? ((SubLObject) (cycl_utilities.negate(atomic_sentence))) : atomic_sentence;
            SubLObject hl_support = arguments.make_hl_support($EQUALITY, hl_support_formula, $equal_symbols_defining_mt$.getGlobalValue(), $TRUE_MON);
            return hl_support;
        }
    }

    public static SubLObject make_equal_symbols_hl_support(final SubLObject term1, final SubLObject term2, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        final SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal($$equalSymbols, list(term1, term2));
        final SubLObject hl_support_formula = (NIL != negateP) ? cycl_utilities.negate(atomic_sentence) : atomic_sentence;
        final SubLObject hl_support = arguments.make_hl_support($EQUALITY, hl_support_formula, $equal_symbols_defining_mt$.getGlobalValue(), $TRUE_MON);
        return hl_support;
    }

    public static final SubLObject removal_equal_symbols_reject_alt(SubLObject asent) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.inference_equal_symbols_reject(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject removal_equal_symbols_reject(final SubLObject asent) {
        return inference_equal_symbols_reject(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static final SubLObject removal_equal_symbols_check_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (term1.equal(term2)) {
                    return $default_equal_symbols_check_cost$.getDynamicValue(thread);
                } else {
                    return ZERO_INTEGER;
                }
            }
        }
    }

    public static SubLObject removal_equal_symbols_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (term1.equal(term2)) {
            return $default_equal_symbols_check_cost$.getDynamicValue(thread);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_equal_symbols_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (term1.equal(term2)) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equal_symbols_hl_support(term1, term2, UNPROVIDED);
                    backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_equal_symbols_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (term1.equal(term2)) {
            final SubLObject hl_support = make_equal_symbols_hl_support(term1, term2, UNPROVIDED);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_equal_symbols_unify_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject v_bindings = NIL;
                {
                    SubLObject _prev_bind_0 = $perform_equals_unification$.currentBinding(thread);
                    try {
                        $perform_equals_unification$.bind(NIL, thread);
                        v_bindings = unification_utilities.term_unify(term1, term2, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $perform_equals_unification$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != v_bindings) {
                    {
                        SubLObject unify_term1 = bindings.subst_bindings(v_bindings, term1);
                        SubLObject unify_term2 = bindings.subst_bindings(v_bindings, term2);
                        if ((NIL != variables.fully_bound_p(unify_term1)) && (NIL != variables.fully_bound_p(unify_term2))) {
                            return T;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_equal_symbols_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject v_bindings = NIL;
        final SubLObject _prev_bind_0 = $perform_equals_unification$.currentBinding(thread);
        try {
            $perform_equals_unification$.bind(NIL, thread);
            v_bindings = unification_utilities.term_unify(term1, term2, UNPROVIDED, UNPROVIDED);
        } finally {
            $perform_equals_unification$.rebind(_prev_bind_0, thread);
        }
        if (NIL != v_bindings) {
            final SubLObject unify_term1 = bindings.subst_bindings(v_bindings, term1);
            final SubLObject unify_term2 = bindings.subst_bindings(v_bindings, term2);
            if ((NIL != variables.fully_bound_p(unify_term1)) && (NIL != variables.fully_bound_p(unify_term2))) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject removal_equal_symbols_unify_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $perform_equals_unification$.currentBinding(thread);
                    try {
                        $perform_equals_unification$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject v_bindings = unification_utilities.term_unify(term1, term2, T, T);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                {
                                    SubLObject unify_term1 = bindings.subst_bindings(v_bindings, term1);
                                    SubLObject unify_term2 = bindings.subst_bindings(v_bindings, term2);
                                    SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equal_symbols_hl_support(unify_term1, unify_term2, UNPROVIDED);
                                    backward.removal_add_node(hl_support, v_bindings, unify_justification);
                                }
                            }
                        }
                    } finally {
                        $perform_equals_unification$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_equal_symbols_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject _prev_bind_0 = $perform_equals_unification$.currentBinding(thread);
        try {
            $perform_equals_unification$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(term1, term2, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject unify_term1 = bindings.subst_bindings(v_bindings, term1);
                final SubLObject unify_term2 = bindings.subst_bindings(v_bindings, term2);
                final SubLObject hl_support = make_equal_symbols_hl_support(unify_term1, unify_term2, UNPROVIDED);
                backward.removal_add_node(hl_support, v_bindings, unify_justification);
            }
        } finally {
            $perform_equals_unification$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject removal_not_equal_symbols_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (term1.equal(term2)) {
                    return ZERO_INTEGER;
                } else {
                    return $default_not_equal_symbols_cost$.getDynamicValue(thread);
                }
            }
        }
    }

    public static SubLObject removal_not_equal_symbols_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (term1.equal(term2)) {
            return ZERO_INTEGER;
        }
        return $default_not_equal_symbols_cost$.getDynamicValue(thread);
    }

    public static final SubLObject removal_not_equal_symbols_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (!term1.equal(term2)) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equal_symbols_hl_support(term1, term2, T);
                    backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_not_equal_symbols_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (!term1.equal(term2)) {
            final SubLObject hl_support = make_equal_symbols_hl_support(term1, term2, T);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject make_equal_string_case_insensitive_support_alt(SubLObject string1, SubLObject string2, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        {
            SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal($$equalStrings_CaseInsensitive, list(string1, string2));
            SubLObject hl_support_formula = (NIL != negateP) ? ((SubLObject) (cycl_utilities.negate(atomic_sentence))) : atomic_sentence;
            SubLObject hl_support = arguments.make_hl_support($OPAQUE, hl_support_formula, $equal_strings_case_insensitive_defining_mt$.getGlobalValue(), $TRUE_MON);
            return hl_support;
        }
    }

    public static SubLObject make_equal_string_case_insensitive_support(final SubLObject string1, final SubLObject string2, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        final SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal($$equalStrings_CaseInsensitive, list(string1, string2));
        final SubLObject hl_support_formula = (NIL != negateP) ? cycl_utilities.negate(atomic_sentence) : atomic_sentence;
        final SubLObject hl_support = arguments.make_hl_support($OPAQUE, hl_support_formula, $equal_strings_case_insensitive_defining_mt$.getGlobalValue(), $TRUE_MON);
        return hl_support;
    }

    public static final SubLObject removal_equal_strings_case_insensitive_check_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject string2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != Strings.string_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return $default_equal_strings_case_insensitive_check_cost$.getDynamicValue(thread);
                } else {
                    return ZERO_INTEGER;
                }
            }
        }
    }

    public static SubLObject removal_equal_strings_case_insensitive_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject string2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != Strings.string_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $default_equal_strings_case_insensitive_check_cost$.getDynamicValue(thread);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject removal_equal_strings_case_insensitive_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject string1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject string2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != Strings.string_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equal_string_case_insensitive_support(string1, string2, UNPROVIDED);
                    backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_equal_strings_case_insensitive_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject string1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject string2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != Strings.string_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject hl_support = make_equal_string_case_insensitive_support(string1, string2, UNPROVIDED);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_not_equal_strings_case_insensitive_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject string2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != Strings.string_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return ZERO_INTEGER;
                } else {
                    return $default_not_equal_strings_case_insensitive_cost$.getDynamicValue(thread);
                }
            }
        }
    }

    public static SubLObject removal_not_equal_strings_case_insensitive_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject string2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != Strings.string_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return ZERO_INTEGER;
        }
        return $default_not_equal_strings_case_insensitive_cost$.getDynamicValue(thread);
    }

    public static final SubLObject removal_not_equal_strings_case_insensitive_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject string1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject string2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL == Strings.string_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject hl_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals.make_equal_string_case_insensitive_support(string1, string2, T);
                    backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_not_equal_strings_case_insensitive_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject string1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject string2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL == Strings.string_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject hl_support = make_equal_string_case_insensitive_support(string1, string2, T);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_equals_via_numerically_equals_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != arithmetic.cyc_numerically_equal(arg1, arg2)) {
            final SubLObject hl_support_formula_eval = list($$numericallyEquals, arg1, arg2);
            final SubLObject hl_support_formula_genl = $list44;
            final SubLObject hl_support_eval = arguments.make_hl_support($EVAL, hl_support_formula_eval, mt_relevance_macros.$mt$.getDynamicValue(thread), $TRUE_MON);
            final SubLObject hl_support_genl = arguments.make_hl_support($GENLPREDS, hl_support_formula_genl, $$UniversalVocabularyMt, $TRUE_MON);
            backward.removal_add_node(hl_support_eval, NIL, list(hl_support_genl));
        }
        return NIL;
    }

    public static final SubLObject declare_removal_modules_equals_file_alt() {
        declareFunction("make_equals_hl_support", "MAKE-EQUALS-HL-SUPPORT", 2, 1, false);
        declareFunction("removal_equals_fort_check_expand", "REMOVAL-EQUALS-FORT-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_all_equals_expand", "REMOVAL-ALL-EQUALS-EXPAND", 1, 1, false);
        declareFunction("removal_unify_required", "REMOVAL-UNIFY-REQUIRED", 1, 1, false);
        declareFunction("removal_unify_expand", "REMOVAL-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_unique_names_cost", "REMOVAL-UNIQUE-NAMES-COST", 1, 1, false);
        declareFunction("removal_unique_names_expand", "REMOVAL-UNIQUE-NAMES-EXPAND", 1, 1, false);
        declareFunction("removal_not_equals_cost", "REMOVAL-NOT-EQUALS-COST", 1, 1, false);
        declareFunction("removal_not_equals_expand", "REMOVAL-NOT-EQUALS-EXPAND", 1, 1, false);
        declareFunction("removal_not_equals_non_atomic_cost", "REMOVAL-NOT-EQUALS-NON-ATOMIC-COST", 1, 1, false);
        declareFunction("inference_equal_symbols_reject", "INFERENCE-EQUAL-SYMBOLS-REJECT", 2, 0, false);
        declareFunction("make_equal_symbols_hl_support", "MAKE-EQUAL-SYMBOLS-HL-SUPPORT", 2, 1, false);
        declareFunction("removal_equal_symbols_reject", "REMOVAL-EQUAL-SYMBOLS-REJECT", 1, 0, false);
        declareFunction("removal_equal_symbols_check_cost", "REMOVAL-EQUAL-SYMBOLS-CHECK-COST", 1, 1, false);
        declareFunction("removal_equal_symbols_check_expand", "REMOVAL-EQUAL-SYMBOLS-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_equal_symbols_unify_required", "REMOVAL-EQUAL-SYMBOLS-UNIFY-REQUIRED", 1, 1, false);
        declareFunction("removal_equal_symbols_unify_expand", "REMOVAL-EQUAL-SYMBOLS-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_not_equal_symbols_cost", "REMOVAL-NOT-EQUAL-SYMBOLS-COST", 1, 1, false);
        declareFunction("removal_not_equal_symbols_expand", "REMOVAL-NOT-EQUAL-SYMBOLS-EXPAND", 1, 1, false);
        declareFunction("make_equal_string_case_insensitive_support", "MAKE-EQUAL-STRING-CASE-INSENSITIVE-SUPPORT", 2, 1, false);
        declareFunction("removal_equal_strings_case_insensitive_check_cost", "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST", 1, 1, false);
        declareFunction("removal_equal_strings_case_insensitive_check_expand", "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_not_equal_strings_case_insensitive_cost", "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST", 1, 1, false);
        declareFunction("removal_not_equal_strings_case_insensitive_expand", "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-EXPAND", 1, 1, false);
        declareFunction("removal_regex_string_match_required", "REMOVAL-REGEX-STRING-MATCH-REQUIRED", 1, 1, false);
        declareFunction("regex_string_match", "REGEX-STRING-MATCH", 2, 0, false);
        declareFunction("regex_string_match_with_bindings", "REGEX-STRING-MATCH-WITH-BINDINGS", 2, 0, false);
        declareFunction("regex_string_match_with_bindings_int", "REGEX-STRING-MATCH-WITH-BINDINGS-INT", 3, 0, false);
        declareFunction("removal_regex_string_match_case_insensitive_required", "REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED", 1, 1, false);
        declareFunction("regex_string_match_case_insensitive", "REGEX-STRING-MATCH-CASE-INSENSITIVE", 2, 0, false);
        declareFunction("regex_string_match_with_bindings_case_insensitive", "REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_removal_modules_equals_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("make_equals_hl_support", "MAKE-EQUALS-HL-SUPPORT", 2, 1, false);
            declareFunction("removal_equals_fort_check_expand", "REMOVAL-EQUALS-FORT-CHECK-EXPAND", 1, 1, false);
            declareFunction("removal_all_equals_expand", "REMOVAL-ALL-EQUALS-EXPAND", 1, 1, false);
            declareFunction("removal_unify_required", "REMOVAL-UNIFY-REQUIRED", 1, 1, false);
            declareFunction("removal_unify_expand", "REMOVAL-UNIFY-EXPAND", 1, 1, false);
            declareFunction("removal_unique_names_cost", "REMOVAL-UNIQUE-NAMES-COST", 1, 1, false);
            declareFunction("removal_unique_names_expand", "REMOVAL-UNIQUE-NAMES-EXPAND", 1, 1, false);
            declareFunction("removal_not_equals_cost", "REMOVAL-NOT-EQUALS-COST", 1, 1, false);
            declareFunction("removal_not_equals_expand", "REMOVAL-NOT-EQUALS-EXPAND", 1, 1, false);
            declareFunction("removal_not_equals_non_atomic_cost", "REMOVAL-NOT-EQUALS-NON-ATOMIC-COST", 1, 1, false);
            declareFunction("inference_equal_symbols_reject", "INFERENCE-EQUAL-SYMBOLS-REJECT", 2, 0, false);
            declareFunction("make_equal_symbols_hl_support", "MAKE-EQUAL-SYMBOLS-HL-SUPPORT", 2, 1, false);
            declareFunction("removal_equal_symbols_reject", "REMOVAL-EQUAL-SYMBOLS-REJECT", 1, 0, false);
            declareFunction("removal_equal_symbols_check_cost", "REMOVAL-EQUAL-SYMBOLS-CHECK-COST", 1, 1, false);
            declareFunction("removal_equal_symbols_check_expand", "REMOVAL-EQUAL-SYMBOLS-CHECK-EXPAND", 1, 1, false);
            declareFunction("removal_equal_symbols_unify_required", "REMOVAL-EQUAL-SYMBOLS-UNIFY-REQUIRED", 1, 1, false);
            declareFunction("removal_equal_symbols_unify_expand", "REMOVAL-EQUAL-SYMBOLS-UNIFY-EXPAND", 1, 1, false);
            declareFunction("removal_not_equal_symbols_cost", "REMOVAL-NOT-EQUAL-SYMBOLS-COST", 1, 1, false);
            declareFunction("removal_not_equal_symbols_expand", "REMOVAL-NOT-EQUAL-SYMBOLS-EXPAND", 1, 1, false);
            declareFunction("make_equal_string_case_insensitive_support", "MAKE-EQUAL-STRING-CASE-INSENSITIVE-SUPPORT", 2, 1, false);
            declareFunction("removal_equal_strings_case_insensitive_check_cost", "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST", 1, 1, false);
            declareFunction("removal_equal_strings_case_insensitive_check_expand", "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-EXPAND", 1, 1, false);
            declareFunction("removal_not_equal_strings_case_insensitive_cost", "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST", 1, 1, false);
            declareFunction("removal_not_equal_strings_case_insensitive_expand", "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-EXPAND", 1, 1, false);
            declareFunction("removal_equals_via_numerically_equals_expand", "REMOVAL-EQUALS-VIA-NUMERICALLY-EQUALS-EXPAND", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("removal_regex_string_match_required", "REMOVAL-REGEX-STRING-MATCH-REQUIRED", 1, 1, false);
            declareFunction("regex_string_match", "REGEX-STRING-MATCH", 2, 0, false);
            declareFunction("regex_string_match_with_bindings", "REGEX-STRING-MATCH-WITH-BINDINGS", 2, 0, false);
            declareFunction("regex_string_match_with_bindings_int", "REGEX-STRING-MATCH-WITH-BINDINGS-INT", 3, 0, false);
            declareFunction("removal_regex_string_match_case_insensitive_required", "REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED", 1, 1, false);
            declareFunction("regex_string_match_case_insensitive", "REGEX-STRING-MATCH-CASE-INSENSITIVE", 2, 0, false);
            declareFunction("regex_string_match_with_bindings_case_insensitive", "REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_equals_file_Previous() {
        declareFunction("make_equals_hl_support", "MAKE-EQUALS-HL-SUPPORT", 2, 1, false);
        declareFunction("removal_equals_fort_check_expand", "REMOVAL-EQUALS-FORT-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_all_equals_expand", "REMOVAL-ALL-EQUALS-EXPAND", 1, 1, false);
        declareFunction("removal_unify_required", "REMOVAL-UNIFY-REQUIRED", 1, 1, false);
        declareFunction("removal_unify_expand", "REMOVAL-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_unique_names_cost", "REMOVAL-UNIQUE-NAMES-COST", 1, 1, false);
        declareFunction("removal_unique_names_expand", "REMOVAL-UNIQUE-NAMES-EXPAND", 1, 1, false);
        declareFunction("removal_not_equals_cost", "REMOVAL-NOT-EQUALS-COST", 1, 1, false);
        declareFunction("removal_not_equals_expand", "REMOVAL-NOT-EQUALS-EXPAND", 1, 1, false);
        declareFunction("removal_not_equals_non_atomic_cost", "REMOVAL-NOT-EQUALS-NON-ATOMIC-COST", 1, 1, false);
        declareFunction("inference_equal_symbols_reject", "INFERENCE-EQUAL-SYMBOLS-REJECT", 2, 0, false);
        declareFunction("make_equal_symbols_hl_support", "MAKE-EQUAL-SYMBOLS-HL-SUPPORT", 2, 1, false);
        declareFunction("removal_equal_symbols_reject", "REMOVAL-EQUAL-SYMBOLS-REJECT", 1, 0, false);
        declareFunction("removal_equal_symbols_check_cost", "REMOVAL-EQUAL-SYMBOLS-CHECK-COST", 1, 1, false);
        declareFunction("removal_equal_symbols_check_expand", "REMOVAL-EQUAL-SYMBOLS-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_equal_symbols_unify_required", "REMOVAL-EQUAL-SYMBOLS-UNIFY-REQUIRED", 1, 1, false);
        declareFunction("removal_equal_symbols_unify_expand", "REMOVAL-EQUAL-SYMBOLS-UNIFY-EXPAND", 1, 1, false);
        declareFunction("removal_not_equal_symbols_cost", "REMOVAL-NOT-EQUAL-SYMBOLS-COST", 1, 1, false);
        declareFunction("removal_not_equal_symbols_expand", "REMOVAL-NOT-EQUAL-SYMBOLS-EXPAND", 1, 1, false);
        declareFunction("make_equal_string_case_insensitive_support", "MAKE-EQUAL-STRING-CASE-INSENSITIVE-SUPPORT", 2, 1, false);
        declareFunction("removal_equal_strings_case_insensitive_check_cost", "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST", 1, 1, false);
        declareFunction("removal_equal_strings_case_insensitive_check_expand", "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_not_equal_strings_case_insensitive_cost", "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST", 1, 1, false);
        declareFunction("removal_not_equal_strings_case_insensitive_expand", "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-EXPAND", 1, 1, false);
        declareFunction("removal_equals_via_numerically_equals_expand", "REMOVAL-EQUALS-VIA-NUMERICALLY-EQUALS-EXPAND", 1, 1, false);
        return NIL;
    }

    private static final SubLSymbol $EQUALS_DELAY_POS = makeKeyword("EQUALS-DELAY-POS");

    static private final SubLList $list_alt5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equals"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    public static final SubLObject init_removal_modules_equals_file_alt() {
        defparameter("*DEFAULT-EQUALS-FORT-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-ALL-EQUALS-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-UNIFY-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-UNIQUE-NAMES-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-EQUALS-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-NOT-EQUALS-NON-ATOMIC-COST*", $float$1_1);
        deflexical("*EQUAL-SYMBOLS-DEFINING-MT*", NIL != boundp($equal_symbols_defining_mt$) ? ((SubLObject) ($equal_symbols_defining_mt$.getGlobalValue())) : $$BaseKB);
        defparameter("*DEFAULT-EQUAL-SYMBOLS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-EQUAL-SYMBOLS-UNIFY-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-EQUAL-SYMBOLS-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*EQUAL-STRINGS-CASE-INSENSITIVE-DEFINING-MT*", NIL != boundp($equal_strings_case_insensitive_defining_mt$) ? ((SubLObject) ($equal_strings_case_insensitive_defining_mt$.getGlobalValue())) : $$BaseKB);
        defparameter("*DEFAULT-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*REGEX-STRING-MATCH-MT*", NIL != boundp($regex_string_match_mt$) ? ((SubLObject) ($regex_string_match_mt$.getGlobalValue())) : $$BaseKB);
        defparameter("*DEFAULT-REGEX-STRING-MATCH-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*", NIL != boundp($regex_string_match_case_insensitive_mt$) ? ((SubLObject) ($regex_string_match_case_insensitive_mt$.getGlobalValue())) : $$BaseKB);
        defparameter("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject init_removal_modules_equals_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*DEFAULT-EQUALS-FORT-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
            defparameter("*DEFAULT-ALL-EQUALS-COST*", ONE_INTEGER);
            defparameter("*DEFAULT-UNIFY-COST*", ONE_INTEGER);
            defparameter("*DEFAULT-UNIQUE-NAMES-COST*", $hl_module_check_cost$.getDynamicValue());
            defparameter("*DEFAULT-NOT-EQUALS-COST*", ONE_INTEGER);
            defparameter("*DEFAULT-NOT-EQUALS-NON-ATOMIC-COST*", $float$1_1);
            deflexical("*EQUAL-SYMBOLS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($equal_symbols_defining_mt$, $equal_symbols_defining_mt$, $$BaseKB));
            defparameter("*DEFAULT-EQUAL-SYMBOLS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
            defparameter("*DEFAULT-EQUAL-SYMBOLS-UNIFY-COST*", $hl_module_check_cost$.getDynamicValue());
            defparameter("*DEFAULT-NOT-EQUAL-SYMBOLS-COST*", $hl_module_check_cost$.getDynamicValue());
            deflexical("*EQUAL-STRINGS-CASE-INSENSITIVE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($equal_strings_case_insensitive_defining_mt$, $equal_strings_case_insensitive_defining_mt$, $$BaseKB));
            defparameter("*DEFAULT-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
            defparameter("*DEFAULT-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST*", $hl_module_check_cost$.getDynamicValue());
            defparameter("*DEFAULT-EQUALS-VIA-NUMERICALLY-EQUALS-COST*", $hl_module_check_cost$.getDynamicValue());
        }
        if (SubLFiles.USE_V2) {
            deflexical("*EQUAL-SYMBOLS-DEFINING-MT*", NIL != boundp($equal_symbols_defining_mt$) ? ((SubLObject) ($equal_symbols_defining_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*EQUAL-STRINGS-CASE-INSENSITIVE-DEFINING-MT*", NIL != boundp($equal_strings_case_insensitive_defining_mt$) ? ((SubLObject) ($equal_strings_case_insensitive_defining_mt$.getGlobalValue())) : $$BaseKB);
            deflexical("*REGEX-STRING-MATCH-MT*", NIL != boundp($regex_string_match_mt$) ? ((SubLObject) ($regex_string_match_mt$.getGlobalValue())) : $$BaseKB);
            defparameter("*DEFAULT-REGEX-STRING-MATCH-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
            deflexical("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*", NIL != boundp($regex_string_match_case_insensitive_mt$) ? ((SubLObject) ($regex_string_match_case_insensitive_mt$.getGlobalValue())) : $$BaseKB);
            defparameter("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject init_removal_modules_equals_file_Previous() {
        defparameter("*DEFAULT-EQUALS-FORT-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-ALL-EQUALS-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-UNIFY-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-UNIQUE-NAMES-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-EQUALS-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-NOT-EQUALS-NON-ATOMIC-COST*", $float$1_1);
        deflexical("*EQUAL-SYMBOLS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($equal_symbols_defining_mt$, $equal_symbols_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-EQUAL-SYMBOLS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-EQUAL-SYMBOLS-UNIFY-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-EQUAL-SYMBOLS-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*EQUAL-STRINGS-CASE-INSENSITIVE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($equal_strings_case_insensitive_defining_mt$, $equal_strings_case_insensitive_defining_mt$, $$BaseKB));
        defparameter("*DEFAULT-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-EQUALS-VIA-NUMERICALLY-EQUALS-COST*", $hl_module_check_cost$.getDynamicValue());
        return NIL;
    }

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("equals"), $FORT, makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell("equals"), makeKeyword("FULLY-BOUND"), $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EQUALS-FORT-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUALS-FORT-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <fort> <fully-bound>))\n    (#$equals <fully-bound> <fort>)\n    via unification and #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals #$Dog #$Dog)\n    (#$equals (#$JuvenileFn #$Dog)(#$JuvenileFn #$Dog))") });

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("equals"), $FORT, makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell("equals"), makeKeyword("NOT-FULLY-BOUND"), $FORT)), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-EQUALS-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <fort> <not fully-bound>)\n    (#$equals <not fully-bound> <fort>)\n    via unification and #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals #$Dog ?WHAT)") });

    public static final SubLObject setup_removal_modules_equals_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$equals);
        inference_modules.inference_removal_module_use_meta_removal($$equals, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$equals, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        inference_modules.inference_removal_module_dont_use_universal($$equals, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.inference_preference_module($EQUALS_DELAY_POS, $list_alt5);
        inference_modules.inference_removal_module($REMOVAL_EQUALS_FORT_CHECK, $list_alt10);
        inference_modules.inference_removal_module($REMOVAL_ALL_EQUALS, $list_alt12);
        inference_modules.inference_removal_module($REMOVAL_UNIFY, $list_alt14);
        inference_modules.inference_removal_module($REMOVAL_UNIQUE_NAMES, $list_alt16);
        inference_modules.inference_removal_module($REMOVAL_NOT_EQUALS, $list_alt18);
        inference_modules.inference_removal_module($REMOVAL_NOT_EQUALS_NON_ATOMIC, $list_alt21);
        inference_modules.register_solely_specific_removal_module_predicate($$equalSymbols);
        inference_modules.inference_removal_module_dont_use_universal($$equalSymbols, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.inference_preference_module($EQUAL_SYMBOLS_DELAY_POS, $list_alt24);
        declare_defglobal($equal_symbols_defining_mt$);
        mt_vars.note_mt_var($equal_symbols_defining_mt$, $$equalSymbols);
        inference_modules.inference_removal_module($REMOVAL_EQUAL_SYMBOLS_REJECT, $list_alt28);
        inference_modules.inference_removal_module($REMOVAL_EQUAL_SYMBOLS_CHECK, $list_alt30);
        inference_modules.inference_removal_module($REMOVAL_EQUAL_SYMBOLS_UNIFY, $list_alt32);
        inference_modules.inference_removal_module($REMOVAL_NOT_EQUAL_SYMBOLS, $list_alt34);
        inference_modules.register_solely_specific_removal_module_predicate($$equalStrings_CaseInsensitive);
        declare_defglobal($equal_strings_case_insensitive_defining_mt$);
        mt_vars.note_mt_var($equal_strings_case_insensitive_defining_mt$, $$equalStrings_CaseInsensitive);
        inference_modules.inference_removal_module($REMOVAL_EQUAL_STRINGS_CASE_INSENSITIVE_CHECK, $list_alt39);
        inference_modules.inference_removal_module($REMOVAL_NOT_EQUAL_STRINGS_CASE_INSENSITIVE, $list_alt41);
        inference_modules.register_solely_specific_removal_module_predicate($$regexStringMatch);
        declare_defglobal($regex_string_match_mt$);
        mt_vars.note_mt_var($regex_string_match_mt$, $$regexStringMatch);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_POS, $list_alt45);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_NEG, $list_alt47);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS, $list_alt50);
        note_funcall_helper_function(REGEX_STRING_MATCH_WITH_BINDINGS);
        inference_modules.register_solely_specific_removal_module_predicate($$regexStringMatch_CaseInsensitive);
        declare_defglobal($regex_string_match_case_insensitive_mt$);
        mt_vars.note_mt_var($regex_string_match_case_insensitive_mt$, $$regexStringMatch_CaseInsensitive);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS, $list_alt55);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG, $list_alt57);
        inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS, $list_alt60);
        note_funcall_helper_function(REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE);
        return NIL;
    }

    public static SubLObject setup_removal_modules_equals_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$equals);
            inference_modules.inference_removal_module_use_meta_removal($$equals, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
            inference_modules.inference_removal_module_use_meta_removal($$equals, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
            inference_modules.inference_removal_module_dont_use_universal($$equals, $REMOVAL_NON_WFF_CHECK_NEG);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$equals);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$equals);
            inference_modules.inference_removal_module($REMOVAL_EQUALS_FORT_CHECK, $list10);
            inference_modules.inference_removal_module($REMOVAL_ALL_EQUALS, $list12);
            inference_modules.inference_removal_module($REMOVAL_UNIFY, $list14);
            inference_modules.inference_removal_module($REMOVAL_UNIQUE_NAMES, $list16);
            inference_modules.inference_removal_module($REMOVAL_NOT_EQUALS, $list18);
            inference_modules.inference_removal_module($REMOVAL_NOT_EQUALS_NON_ATOMIC, $list21);
            inference_modules.register_solely_specific_removal_module_predicate($$equalSymbols);
            inference_modules.inference_removal_module_dont_use_universal($$equalSymbols, $REMOVAL_NON_WFF_CHECK_NEG);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$equalSymbols);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$equalSymbols);
            preference_modules.inference_preference_module($EQUAL_SYMBOLS_DELAY_POS, $list24);
            declare_defglobal($equal_symbols_defining_mt$);
            mt_vars.note_mt_var($equal_symbols_defining_mt$, $$equalSymbols);
            inference_modules.inference_removal_module($REMOVAL_EQUAL_SYMBOLS_REJECT, $list28);
            inference_modules.inference_removal_module($REMOVAL_EQUAL_SYMBOLS_CHECK, $list30);
            inference_modules.inference_removal_module($REMOVAL_EQUAL_SYMBOLS_UNIFY, $list32);
            inference_modules.inference_removal_module($REMOVAL_NOT_EQUAL_SYMBOLS, $list34);
            inference_modules.register_solely_specific_removal_module_predicate($$equalStrings_CaseInsensitive);
            preference_modules.doomed_unless_all_args_bindable($BOTH, $$equalStrings_CaseInsensitive);
            declare_defglobal($equal_strings_case_insensitive_defining_mt$);
            mt_vars.note_mt_var($equal_strings_case_insensitive_defining_mt$, $$equalStrings_CaseInsensitive);
            inference_modules.inference_removal_module($REMOVAL_EQUAL_STRINGS_CASE_INSENSITIVE_CHECK, $list40);
            inference_modules.inference_removal_module($REMOVAL_NOT_EQUAL_STRINGS_CASE_INSENSITIVE, $list42);
            inference_modules.inference_removal_module($REMOVAL_EQUALS_VIA_NUMERICALLY_EQUALS, $list49);
        }
        if (SubLFiles.USE_V2) {
            preference_modules.inference_preference_module($EQUALS_DELAY_POS, $list_alt5);
            inference_modules.inference_removal_module($REMOVAL_EQUAL_STRINGS_CASE_INSENSITIVE_CHECK, $list_alt39);
            inference_modules.inference_removal_module($REMOVAL_NOT_EQUAL_STRINGS_CASE_INSENSITIVE, $list_alt41);
            inference_modules.register_solely_specific_removal_module_predicate($$regexStringMatch);
            declare_defglobal($regex_string_match_mt$);
            mt_vars.note_mt_var($regex_string_match_mt$, $$regexStringMatch);
            inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_POS, $list_alt45);
            inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_NEG, $list_alt47);
            inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS, $list_alt50);
            note_funcall_helper_function(REGEX_STRING_MATCH_WITH_BINDINGS);
            inference_modules.register_solely_specific_removal_module_predicate($$regexStringMatch_CaseInsensitive);
            declare_defglobal($regex_string_match_case_insensitive_mt$);
            mt_vars.note_mt_var($regex_string_match_case_insensitive_mt$, $$regexStringMatch_CaseInsensitive);
            inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS, $list_alt55);
            inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG, $list_alt57);
            inference_modules.inference_removal_module($REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS, $list_alt60);
            note_funcall_helper_function(REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_equals_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$equals);
        inference_modules.inference_removal_module_use_meta_removal($$equals, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$equals, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        inference_modules.inference_removal_module_dont_use_universal($$equals, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$equals);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$equals);
        inference_modules.inference_removal_module($REMOVAL_EQUALS_FORT_CHECK, $list10);
        inference_modules.inference_removal_module($REMOVAL_ALL_EQUALS, $list12);
        inference_modules.inference_removal_module($REMOVAL_UNIFY, $list14);
        inference_modules.inference_removal_module($REMOVAL_UNIQUE_NAMES, $list16);
        inference_modules.inference_removal_module($REMOVAL_NOT_EQUALS, $list18);
        inference_modules.inference_removal_module($REMOVAL_NOT_EQUALS_NON_ATOMIC, $list21);
        inference_modules.register_solely_specific_removal_module_predicate($$equalSymbols);
        inference_modules.inference_removal_module_dont_use_universal($$equalSymbols, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$equalSymbols);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$equalSymbols);
        preference_modules.inference_preference_module($EQUAL_SYMBOLS_DELAY_POS, $list24);
        declare_defglobal($equal_symbols_defining_mt$);
        mt_vars.note_mt_var($equal_symbols_defining_mt$, $$equalSymbols);
        inference_modules.inference_removal_module($REMOVAL_EQUAL_SYMBOLS_REJECT, $list28);
        inference_modules.inference_removal_module($REMOVAL_EQUAL_SYMBOLS_CHECK, $list30);
        inference_modules.inference_removal_module($REMOVAL_EQUAL_SYMBOLS_UNIFY, $list32);
        inference_modules.inference_removal_module($REMOVAL_NOT_EQUAL_SYMBOLS, $list34);
        inference_modules.register_solely_specific_removal_module_predicate($$equalStrings_CaseInsensitive);
        preference_modules.doomed_unless_all_args_bindable($BOTH, $$equalStrings_CaseInsensitive);
        declare_defglobal($equal_strings_case_insensitive_defining_mt$);
        mt_vars.note_mt_var($equal_strings_case_insensitive_defining_mt$, $$equalStrings_CaseInsensitive);
        inference_modules.inference_removal_module($REMOVAL_EQUAL_STRINGS_CASE_INSENSITIVE_CHECK, $list40);
        inference_modules.inference_removal_module($REMOVAL_NOT_EQUAL_STRINGS_CASE_INSENSITIVE, $list42);
        inference_modules.inference_removal_module($REMOVAL_EQUALS_VIA_NUMERICALLY_EQUALS, $list49);
        return NIL;
    }

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equals"), list(makeKeyword("NOT"), $FORT), list(makeKeyword("NOT"), $FORT)), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-UNIFY-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-UNIFY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <non-fort> <non-fort>)\n    by unifying ARG1 and ARG2 and using #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals 212 212)\n    (#$equals 212 ?TERM)\n    (#$equals (#$YearFn 2000) (#$YearFn 2000))\n    (#$equals (#$YearFn 2000) (#$YearFn ?YEAR))\n    (#$equals (?FUNC 2000) (#$YearFn ?YEAR))") });

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equals"), makeKeyword("CONSTANT"), makeKeyword("CONSTANT")), $COST, makeSymbol("REMOVAL-UNIQUE-NAMES-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNIQUE-NAMES-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <constant> <constant>))\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog #$Person))") });

    static private final SubLList $list_alt18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell("equals"), list($TEST, makeSymbol("INFERENCE-ATOMIC-TERM-P")), list($TEST, makeSymbol("INFERENCE-ATOMIC-TERM-P"))), list(makeKeyword("NOT"), list(reader_make_constant_shell("equals"), makeKeyword("CONSTANT"), makeKeyword("CONSTANT")))), $COST, makeSymbol("REMOVAL-NOT-EQUALS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <atomic term> <atomic term>))\n    where either ARG1 or ARG2 is not a <constant-p>\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog \"Dog\"))\n    (#$not (#$equals 1 2))") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_equals_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_equals_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_equals_file();
    }

    static {
    }

    static private final SubLList $list_alt21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("equals"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell("equals"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), list(reader_make_constant_shell("equals"), list($TEST, makeSymbol("INFERENCE-ATOMIC-TERM-P")), list($TEST, makeSymbol("INFERENCE-ATOMIC-TERM-P")))), list(makeKeyword("NOT"), list(reader_make_constant_shell("equals"), makeKeyword("CONSTANT"), makeKeyword("CONSTANT")))), $COST, makeSymbol("REMOVAL-NOT-EQUALS-NON-ATOMIC-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <fully-bound term> <fully-bound term>))\n    where either ARG1 or ARG2 is not a <constant-p> or <atomic term>\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog (#$JuvenileFn \"Dog\")))\n    (#$not (#$equals (#$JuvenileFn \"Dog\") (#$JuvenileFn #$Dog)))") });

    static private final SubLList $list_alt24 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalSymbols"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equalSymbols"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalSymbols"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell("equalSymbols"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list($TEST, makeSymbol("REMOVAL-EQUAL-SYMBOLS-REJECT"))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <whatever> <whatever>)\n    where unification between ARG1 and ARG2 is provably doomed to fail"), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols (#$JuvenileFn ?DOG) (#$MaleFn ?DOG))") });

    static private final SubLList $list_alt30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalSymbols"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equalSymbols"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-EQUAL-SYMBOLS-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <fully bound> <fully bound>) using EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols #$Dog #$Dog)\n    (#$equalSymbols 3 3)") });

    static private final SubLList $list_alt32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalSymbols"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("equalSymbols"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell("equalSymbols"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-UNIFY-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EQUAL-SYMBOLS-UNIFY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <whatever> <not fully bound>)\n    (#$equalSymbols <not fully bound> <whatever>)\n    using unification, but no #$equals assertions."), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols 212 ?WHAT)\n    (#$equalSymbols #$Dog ?WHAT)\n    (#$equalSymbols (#$YearFn ?YEAR)(?FUNC 2003))") });

    static private final SubLList $list_alt34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalSymbols"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equalSymbols"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-NOT-EQUAL-SYMBOLS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUAL-SYMBOLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equalSymbols <fully bound> <fully bound>))\n    using failure of EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equalSymbols #$Pi-Number 3.14159))") });

    static private final SubLList $list_alt39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalStrings-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equalStrings-CaseInsensitive"), makeKeyword("STRING"), makeKeyword("STRING")), $COST, makeSymbol("REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equalStrings-CaseInsensitive <string> <string>)\n    using STRING-EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$equalStrings-CaseInsensitive \"DOG\" \"Dog\")") });

    static private final SubLList $list_alt41 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("equalStrings-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("equalStrings-CaseInsensitive"), makeKeyword("STRING"), makeKeyword("STRING")), $COST, makeSymbol("REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equalStrings-CaseInsensitive <string> <string>))\n    using failure of STRING-EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equalStrings-CaseInsensitive \"DOGG\" \"Dog\"))") });



    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_POS = makeKeyword("REMOVAL-REGEX-STRING-MATCH-POS");

    static private final SubLList $list_alt45 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("regexStringMatch"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("regexStringMatch"), makeKeyword("STRING"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-REGEX-STRING-MATCH-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("regexStringMatch"), list($BIND, makeSymbol("REGULAR-EXPRESSION")), list($BIND, makeSymbol("DATA"))), list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("REGEX-STRING-MATCH"), list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*REGEX-STRING-MATCH-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$regexStringMatch <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>"), makeKeyword("EXAMPLE"), makeString("(#$regexStringMatch \"[FD]og\" \"Dog\")") });

    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_NEG = makeKeyword("REMOVAL-REGEX-STRING-MATCH-NEG");

    static private final SubLList $list_alt47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("regexStringMatch"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("regexStringMatch"), makeKeyword("STRING"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("regexStringMatch"), list($BIND, makeSymbol("REGULAR-EXPRESSION")), list($BIND, makeSymbol("DATA"))), list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("REGEX-STRING-MATCH"), list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*REGEX-STRING-MATCH-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$regexStringMatch <regular-expression string> <data string>))\n    when <data string> doesn\'t match the regular expression in <regular-expression string>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$regexStringMatch \"[FD]og\" \"Log\"))") });

    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS = makeKeyword("REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-POS");

    static private final SubLList $list_alt50 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("regexStringMatch"), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell("regexStringMatch"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("BaseKB"), makeKeyword("DOCUMENTATION"), makeString("(#$regexStringMatch <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied to <data string>"), makeKeyword("EXAMPLE"), makeString("(#$regexStringMatch \"dog(.*)mice\" \"dogs hate mice\" \"s hate \")") });

    private static final SubLSymbol REGEX_STRING_MATCH_WITH_BINDINGS = makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS");

    public static final SubLObject $$regexStringMatch_CaseInsensitive = reader_make_constant_shell("regexStringMatch-CaseInsensitive");

    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS = makeKeyword("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-POS");

    static private final SubLList $list_alt55 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("regexStringMatch-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("regexStringMatch-CaseInsensitive"), makeKeyword("STRING"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("regexStringMatch-CaseInsensitive"), list($BIND, makeSymbol("REGULAR-EXPRESSION")), list($BIND, makeSymbol("DATA"))), list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("REGEX-STRING-MATCH-CASE-INSENSITIVE"), list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>"), makeKeyword("EXAMPLE"), makeString("(#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Dog\")") });

    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG = makeKeyword("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-NEG");

    static private final SubLList $list_alt57 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("regexStringMatch-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("regexStringMatch-CaseInsensitive"), makeKeyword("STRING"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("regexStringMatch-CaseInsensitive"), list($BIND, makeSymbol("REGULAR-EXPRESSION")), list($BIND, makeSymbol("DATA"))), list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("REGEX-STRING-MATCH-CASE-INSENSITIVE"), list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")), list(makeKeyword("VALUE"), makeSymbol("DATA")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>))\n    when <data string> doesn\'t match the regular expression in <regular-expression string>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Log\"))") });

    static private final SubLList $list_alt58 = list(makeKeyword("CASELESS"));

    private static final SubLSymbol $REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS = makeKeyword("REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE-POS");

    static private final SubLList $list_alt60 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("regexStringMatch-CaseInsensitive"), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell("regexStringMatch-CaseInsensitive"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("BaseKB"), makeKeyword("DOCUMENTATION"), makeString("(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied case-insensitively \n    to <data string>"), makeKeyword("EXAMPLE"), makeString("(#$regexStringMatch-CaseInsensitive \"Dog(.*)mice\" \"dogs hate mice\" \"s hate \")") });

    private static final SubLSymbol REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE = makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE");
}

/**
 * Total time: 196 ms
 */
