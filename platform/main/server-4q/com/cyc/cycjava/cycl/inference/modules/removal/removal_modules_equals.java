package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.$perform_equals_unification$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arithmetic;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
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


public final class removal_modules_equals extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_equals();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals";

    public static final String myFingerPrint = "5af699adaa7d9c1a4a4da9555c4c3300c95d31db99edd79e29aef7307c9adac2";

    // defparameter
    private static final SubLSymbol $default_equals_fort_check_cost$ = makeSymbol("*DEFAULT-EQUALS-FORT-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_all_equals_cost$ = makeSymbol("*DEFAULT-ALL-EQUALS-COST*");

    // defparameter
    public static final SubLSymbol $default_unify_cost$ = makeSymbol("*DEFAULT-UNIFY-COST*");

    // defparameter
    private static final SubLSymbol $default_unique_names_cost$ = makeSymbol("*DEFAULT-UNIQUE-NAMES-COST*");

    // defparameter
    private static final SubLSymbol $default_not_equals_cost$ = makeSymbol("*DEFAULT-NOT-EQUALS-COST*");

    // defparameter
    private static final SubLSymbol $default_not_equals_non_atomic_cost$ = makeSymbol("*DEFAULT-NOT-EQUALS-NON-ATOMIC-COST*");



    // defparameter
    private static final SubLSymbol $default_equal_symbols_check_cost$ = makeSymbol("*DEFAULT-EQUAL-SYMBOLS-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_equal_symbols_unify_cost$ = makeSymbol("*DEFAULT-EQUAL-SYMBOLS-UNIFY-COST*");

    // defparameter
    private static final SubLSymbol $default_not_equal_symbols_cost$ = makeSymbol("*DEFAULT-NOT-EQUAL-SYMBOLS-COST*");



    // defparameter
    private static final SubLSymbol $default_equal_strings_case_insensitive_check_cost$ = makeSymbol("*DEFAULT-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_not_equal_strings_case_insensitive_cost$ = makeSymbol("*DEFAULT-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST*");

    // defparameter
    private static final SubLSymbol $default_equals_via_numerically_equals_cost$ = makeSymbol("*DEFAULT-EQUALS-VIA-NUMERICALLY-EQUALS-COST*");

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");

    private static final SubLSymbol $REMOVAL_NON_WFF_CHECK_NEG = makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");











    private static final SubLSymbol $REMOVAL_EQUALS_FORT_CHECK = makeKeyword("REMOVAL-EQUALS-FORT-CHECK");

    public static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equals")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("equals")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell(makeString("equals")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EQUALS-FORT-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUALS-FORT-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <fort> <fully-bound>))\n    (#$equals <fully-bound> <fort>)\n    via unification and #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals #$Dog #$Dog)\n    (#$equals (#$JuvenileFn #$Dog)(#$JuvenileFn #$Dog))") });

    private static final SubLSymbol $REMOVAL_ALL_EQUALS = makeKeyword("REMOVAL-ALL-EQUALS");

    public static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equals")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("equals")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell(makeString("equals")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-EQUALS-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <fort> <not fully-bound>)\n    (#$equals <not fully-bound> <fort>)\n    via unification and #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals #$Dog ?WHAT)") });



    public static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equals")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equals")), list(makeKeyword("NOT"), makeKeyword("FORT")), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-UNIFY-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-UNIFY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <non-fort> <non-fort>)\n    by unifying ARG1 and ARG2 and using #$equals assertions"), makeKeyword("EXAMPLE"), makeString("(#$equals 212 212)\n    (#$equals 212 ?TERM)\n    (#$equals (#$YearFn 2000) (#$YearFn 2000))\n    (#$equals (#$YearFn 2000) (#$YearFn ?YEAR))\n    (#$equals (?FUNC 2000) (#$YearFn ?YEAR))") });

    private static final SubLSymbol $REMOVAL_UNIQUE_NAMES = makeKeyword("REMOVAL-UNIQUE-NAMES");

    public static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equals")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equals")), makeKeyword("CONSTANT"), makeKeyword("CONSTANT")), makeKeyword("COST"), makeSymbol("REMOVAL-UNIQUE-NAMES-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-UNIQUE-NAMES-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <constant> <constant>))\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog #$Person))") });

    private static final SubLSymbol $REMOVAL_NOT_EQUALS = makeKeyword("REMOVAL-NOT-EQUALS");

    public static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equals")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("equals")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-ATOMIC-TERM-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-ATOMIC-TERM-P"))), list(makeKeyword("NOT"), list(reader_make_constant_shell(makeString("equals")), makeKeyword("CONSTANT"), makeKeyword("CONSTANT")))), makeKeyword("COST"), makeSymbol("REMOVAL-NOT-EQUALS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <atomic term> <atomic term>))\n    where either ARG1 or ARG2 is not a <constant-p>\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog \"Dog\"))\n    (#$not (#$equals 1 2))") });

    private static final SubLFloat $float$1_1 = makeDouble(1.1);

    private static final SubLSymbol $REMOVAL_NOT_EQUALS_NON_ATOMIC = makeKeyword("REMOVAL-NOT-EQUALS-NON-ATOMIC");

    public static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equals")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("equals")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeKeyword("NOT"), list(reader_make_constant_shell(makeString("equals")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-ATOMIC-TERM-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-ATOMIC-TERM-P")))), list(makeKeyword("NOT"), list(reader_make_constant_shell(makeString("equals")), makeKeyword("CONSTANT"), makeKeyword("CONSTANT")))), makeKeyword("COST"), makeSymbol("REMOVAL-NOT-EQUALS-NON-ATOMIC-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equals <fully-bound term> <fully-bound term>))\n    where either ARG1 or ARG2 is not a <constant-p> or <atomic term>\n    by checking for unification failure"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equals #$Dog (#$JuvenileFn \"Dog\")))\n    (#$not (#$equals (#$JuvenileFn \"Dog\") (#$JuvenileFn #$Dog)))") });

    private static final SubLObject $$equalSymbols = reader_make_constant_shell(makeString("equalSymbols"));

    private static final SubLSymbol $EQUAL_SYMBOLS_DELAY_POS = makeKeyword("EQUAL-SYMBOLS-DELAY-POS");

    public static final SubLList $list24 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    public static final SubLSymbol $equal_symbols_defining_mt$ = makeSymbol("*EQUAL-SYMBOLS-DEFINING-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $REMOVAL_EQUAL_SYMBOLS_REJECT = makeKeyword("REMOVAL-EQUAL-SYMBOLS-REJECT");

    public static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-REJECT"))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <whatever> <whatever>)\n    where unification between ARG1 and ARG2 is provably doomed to fail"), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols (#$JuvenileFn ?DOG) (#$MaleFn ?DOG))") });

    private static final SubLSymbol $REMOVAL_EQUAL_SYMBOLS_CHECK = makeKeyword("REMOVAL-EQUAL-SYMBOLS-CHECK");

    public static final SubLList $list30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <fully bound> <fully bound>) using EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols #$Dog #$Dog)\n    (#$equalSymbols 3 3)") });

    private static final SubLSymbol $REMOVAL_EQUAL_SYMBOLS_UNIFY = makeKeyword("REMOVAL-EQUAL-SYMBOLS-UNIFY");

    public static final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-UNIFY-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EQUAL-SYMBOLS-UNIFY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUAL-SYMBOLS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equalSymbols <whatever> <not fully bound>)\n    (#$equalSymbols <not fully bound> <whatever>)\n    using unification, but no #$equals assertions."), makeKeyword("EXAMPLE"), makeString("(#$equalSymbols 212 ?WHAT)\n    (#$equalSymbols #$Dog ?WHAT)\n    (#$equalSymbols (#$YearFn ?YEAR)(?FUNC 2003))") });

    private static final SubLSymbol $REMOVAL_NOT_EQUAL_SYMBOLS = makeKeyword("REMOVAL-NOT-EQUAL-SYMBOLS");

    public static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equalSymbols")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-NOT-EQUAL-SYMBOLS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUAL-SYMBOLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equalSymbols <fully bound> <fully bound>))\n    using failure of EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equalSymbols #$Pi-Number 3.14159))") });

    private static final SubLObject $$equalStrings_CaseInsensitive = reader_make_constant_shell(makeString("equalStrings-CaseInsensitive"));



    public static final SubLSymbol $equal_strings_case_insensitive_defining_mt$ = makeSymbol("*EQUAL-STRINGS-CASE-INSENSITIVE-DEFINING-MT*");



    private static final SubLSymbol $REMOVAL_EQUAL_STRINGS_CASE_INSENSITIVE_CHECK = makeKeyword("REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK");

    private static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equalStrings-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equalStrings-CaseInsensitive")), makeKeyword("STRING"), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equalStrings-CaseInsensitive <string> <string>)\n    using STRING-EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$equalStrings-CaseInsensitive \"DOG\" \"Dog\")") });

    private static final SubLSymbol $REMOVAL_NOT_EQUAL_STRINGS_CASE_INSENSITIVE = makeKeyword("REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE");

    private static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equalStrings-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equalStrings-CaseInsensitive")), makeKeyword("STRING"), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$equalStrings-CaseInsensitive <string> <string>))\n    using failure of STRING-EQUAL"), makeKeyword("EXAMPLE"), makeString("(#$not (#$equalStrings-CaseInsensitive \"DOGG\" \"Dog\"))") });

    private static final SubLObject $$numericallyEquals = reader_make_constant_shell(makeString("numericallyEquals"));

    private static final SubLList $list44 = list(reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("numericallyEquals")), reader_make_constant_shell(makeString("equals")));





    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLSymbol $REMOVAL_EQUALS_VIA_NUMERICALLY_EQUALS = makeKeyword("REMOVAL-EQUALS-VIA-NUMERICALLY-EQUALS");

    private static final SubLList $list49 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equals")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equals")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("IBQE?"))), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("IBQE?")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EQUALS-VIA-NUMERICALLY-EQUALS-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EQUALS-VIA-NUMERICALLY-EQUALS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$equals <fully-bound ibqe> <fully-bound ibqe>)\n    via evaulation of #$numericallyEquals"), makeKeyword("EXAMPLE"), makeString("(#$equals (#$GigaHertz 1) (#$MegaHertz 1000))\n    (#$equals (#$Percent 0 100) (#$Unity 0 1))") });

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

    public static SubLObject make_equal_symbols_hl_support(final SubLObject term1, final SubLObject term2, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        final SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal($$equalSymbols, list(term1, term2));
        final SubLObject hl_support_formula = (NIL != negateP) ? cycl_utilities.negate(atomic_sentence) : atomic_sentence;
        final SubLObject hl_support = arguments.make_hl_support($EQUALITY, hl_support_formula, $equal_symbols_defining_mt$.getGlobalValue(), $TRUE_MON);
        return hl_support;
    }

    public static SubLObject removal_equal_symbols_reject(final SubLObject asent) {
        return inference_equal_symbols_reject(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
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

    public static SubLObject make_equal_string_case_insensitive_support(final SubLObject string1, final SubLObject string2, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        final SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal($$equalStrings_CaseInsensitive, list(string1, string2));
        final SubLObject hl_support_formula = (NIL != negateP) ? cycl_utilities.negate(atomic_sentence) : atomic_sentence;
        final SubLObject hl_support = arguments.make_hl_support($OPAQUE, hl_support_formula, $equal_strings_case_insensitive_defining_mt$.getGlobalValue(), $TRUE_MON);
        return hl_support;
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

    public static SubLObject declare_removal_modules_equals_file() {
        declareFunction(me, "make_equals_hl_support", "MAKE-EQUALS-HL-SUPPORT", 2, 1, false);
        declareFunction(me, "removal_equals_fort_check_expand", "REMOVAL-EQUALS-FORT-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_all_equals_expand", "REMOVAL-ALL-EQUALS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_unify_required", "REMOVAL-UNIFY-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_unify_expand", "REMOVAL-UNIFY-EXPAND", 1, 1, false);
        declareFunction(me, "removal_unique_names_cost", "REMOVAL-UNIQUE-NAMES-COST", 1, 1, false);
        declareFunction(me, "removal_unique_names_expand", "REMOVAL-UNIQUE-NAMES-EXPAND", 1, 1, false);
        declareFunction(me, "removal_not_equals_cost", "REMOVAL-NOT-EQUALS-COST", 1, 1, false);
        declareFunction(me, "removal_not_equals_expand", "REMOVAL-NOT-EQUALS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_not_equals_non_atomic_cost", "REMOVAL-NOT-EQUALS-NON-ATOMIC-COST", 1, 1, false);
        declareFunction(me, "inference_equal_symbols_reject", "INFERENCE-EQUAL-SYMBOLS-REJECT", 2, 0, false);
        declareFunction(me, "make_equal_symbols_hl_support", "MAKE-EQUAL-SYMBOLS-HL-SUPPORT", 2, 1, false);
        declareFunction(me, "removal_equal_symbols_reject", "REMOVAL-EQUAL-SYMBOLS-REJECT", 1, 0, false);
        declareFunction(me, "removal_equal_symbols_check_cost", "REMOVAL-EQUAL-SYMBOLS-CHECK-COST", 1, 1, false);
        declareFunction(me, "removal_equal_symbols_check_expand", "REMOVAL-EQUAL-SYMBOLS-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_equal_symbols_unify_required", "REMOVAL-EQUAL-SYMBOLS-UNIFY-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_equal_symbols_unify_expand", "REMOVAL-EQUAL-SYMBOLS-UNIFY-EXPAND", 1, 1, false);
        declareFunction(me, "removal_not_equal_symbols_cost", "REMOVAL-NOT-EQUAL-SYMBOLS-COST", 1, 1, false);
        declareFunction(me, "removal_not_equal_symbols_expand", "REMOVAL-NOT-EQUAL-SYMBOLS-EXPAND", 1, 1, false);
        declareFunction(me, "make_equal_string_case_insensitive_support", "MAKE-EQUAL-STRING-CASE-INSENSITIVE-SUPPORT", 2, 1, false);
        declareFunction(me, "removal_equal_strings_case_insensitive_check_cost", "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST", 1, 1, false);
        declareFunction(me, "removal_equal_strings_case_insensitive_check_expand", "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_not_equal_strings_case_insensitive_cost", "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST", 1, 1, false);
        declareFunction(me, "removal_not_equal_strings_case_insensitive_expand", "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_equals_via_numerically_equals_expand", "REMOVAL-EQUALS-VIA-NUMERICALLY-EQUALS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_equals_file() {
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

    public static SubLObject setup_removal_modules_equals_file() {
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

    
}

/**
 * Total time: 196 ms
 */
