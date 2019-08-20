package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_integer_between extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "c48cb2be6f75355a028581e7ba74c464d2c2851f7a52d513740187740b727e1b";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 700L)
    private static SubLSymbol $default_integer_between_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 1700L)
    public static SubLSymbol $integer_between_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 3600L)
    private static SubLSymbol $default_not_integer_between_check_cost$;
    private static SubLObject $$integerBetween;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_INTEGER_BETWEEN_CHECK;
    private static SubLList $list4;
    private static SubLSymbol $sym5$_INTEGER_BETWEEN_DEFINING_MT_;
    private static SubLObject $$BaseKB;
    private static SubLSymbol $sym7$INTEGERP;
    private static SubLSymbol $CODE;
    private static SubLSymbol $TRUE_MON;
    private static SubLList $list10;
    private static SubLSymbol $REMOVAL_INTEGER_BETWEEN_UNIFY;
    private static SubLList $list12;
    private static SubLSymbol $REMOVAL_NOT_INTEGER_BETWEEN_CHECK;
    private static SubLList $list14;
    private static SubLSymbol $REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN;
    private static SubLList $list16;
    private static SubLList $list17;
    private static SubLObject $$isa;
    private static SubLObject $$Integer;
    private static SubLObject $$greaterThanOrEqualTo;
    private static SubLSymbol $sym21$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_APPLICABILITY;
    private static SubLSymbol $sym22$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_COST;
    private static SubLSymbol $ISA;
    private static SubLSymbol $EVAL;
    private static SubLSymbol $sym25$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_EXPAND;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 900L)
    public static SubLObject removal_integer_between_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject low = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject med = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject high = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        if (low.numLE(med) && med.numLE(high)) {
            backward.removal_add_node(make_integer_between_support(low, med, high, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 1800L)
    public static SubLObject make_integer_between_support(SubLObject low, SubLObject med, SubLObject high, SubLObject negate) {
        if (negate == UNPROVIDED) {
            negate = NIL;
        }
        assert NIL != Types.integerp(low) : low;
        assert NIL != Types.integerp(med) : med;
        assert NIL != Types.integerp(high) : high;
        SubLObject formula = list($$integerBetween, low, med, high);
        if (NIL != negate) {
            formula = cycl_utilities.negate(formula);
        }
        SubLObject hl_support = arguments.make_hl_support($CODE, formula, $integer_between_defining_mt$.getGlobalValue(), $TRUE_MON);
        return hl_support;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 2200L)
    public static SubLObject removal_integer_between_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject low = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject high = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject range = Numbers.add(ONE_INTEGER, Numbers.subtract(high, low));
        return Numbers.max(ZERO_INTEGER, range);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 2600L)
    public static SubLObject removal_integer_between_verify(SubLObject cycl_input) {
        SubLObject low = NIL;
        SubLObject high = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(cycl_input, cycl_input, $list10);
        low = cycl_input.first();
        SubLObject current = cycl_input.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, cycl_input, $list10);
        high = current.first();
        current = current.rest();
        if (NIL == current) {
            return Numbers.numLE(low, high);
        }
        cdestructuring_bind.cdestructuring_bind_error(cycl_input, $list10);
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 3800L)
    public static SubLObject removal_not_integer_between_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject low = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject med = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject high = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        if (!low.numLE(med) || !med.numLE(high)) {
            backward.removal_add_node(make_integer_between_support(low, med, high, T), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 5900L)
    public static SubLObject removal_conjunctive_integer_between_applicability(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isa_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject gt_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject lt_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != el_utilities.el_binary_formula_p(asent)) {
                    thread.resetMultipleValues();
                    SubLObject pred = el_utilities.unmake_binary_formula(asent);
                    SubLObject arg1 = thread.secondMultipleValue();
                    SubLObject arg2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject pcase_var = pred;
                    if (pcase_var.eql($$isa)) {
                        if ($$Integer.eql(arg2)) {
                            dictionary_utilities.dictionary_push(isa_dict, arg1, index);
                        }
                    } else if (pcase_var.eql($$greaterThanOrEqualTo)) {
                        if (NIL != variables.variable_p(arg1) && arg2.isInteger()) {
                            dictionary_utilities.dictionary_push(gt_dict, arg1, index);
                        } else if (arg1.isInteger() && NIL != variables.variable_p(arg2)) {
                            dictionary_utilities.dictionary_push(lt_dict, arg2, index);
                        }
                    }
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list17);
            }
            index = Numbers.add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        SubLObject subclause_specs = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(gt_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject gt_indices = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject lt_indices = dictionary.dictionary_lookup(lt_dict, var, UNPROVIDED);
            if (NIL != lt_indices) {
                SubLObject isa_indices = dictionary.dictionary_lookup(isa_dict, var, UNPROVIDED);
                if (NIL != isa_indices) {
                    SubLObject cdolist_list_var2;
                    SubLObject index_sets = cdolist_list_var2 = list_utilities.cartesian_product(list(isa_indices, gt_indices, lt_indices), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject indices = NIL;
                    indices = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        subclause_specs = cons(clause_utilities.new_subclause_spec(NIL, indices), subclause_specs);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        indices = cdolist_list_var2.first();
                    }
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sequences.nreverse(subclause_specs);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 7200L)
    public static SubLObject removal_conjunctive_integer_between_cost(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject min = removal_conjunctive_integer_between_destructure(contextualized_dnf_clause);
        SubLObject max = thread.secondMultipleValue();
        SubLObject variable = thread.thirdMultipleValue();
        SubLObject ordering = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (max.numL(min)) {
            return ZERO_INTEGER;
        }
        return number_utilities.f_1X(Numbers.subtract(max, min));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 7500L)
    public static SubLObject removal_conjunctive_integer_between_expand(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject min = removal_conjunctive_integer_between_destructure(contextualized_dnf_clause);
        SubLObject max = thread.secondMultipleValue();
        SubLObject variable = thread.thirdMultipleValue();
        SubLObject ordering = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        for (SubLObject n = min; n.numLE(max); n = Numbers.add(n, ONE_INTEGER)) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(variable, n, UNPROVIDED, UNPROVIDED);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject isa_support_sentence = el_utilities.make_binary_formula($$isa, n, $$Integer);
                SubLObject gt_support_sentence = el_utilities.make_binary_formula($$greaterThanOrEqualTo, n, min);
                SubLObject lt_support_sentence = el_utilities.make_binary_formula($$greaterThanOrEqualTo, max, n);
                SubLObject isa_supports = list(arguments.make_hl_support($ISA, isa_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED));
                SubLObject gt_supports = list(arguments.make_hl_support($EVAL, gt_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED));
                SubLObject lt_supports = list(arguments.make_hl_support($EVAL, lt_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED));
                SubLObject justifications = list_utilities.permute(list(isa_supports, gt_supports, lt_supports), ordering);
                inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 8600L)
    public static SubLObject removal_conjunctive_integer_between_destructure(SubLObject contextualized_dnf_clause) {
        SubLObject min = NIL;
        SubLObject max = NIL;
        SubLObject variable = NIL;
        SubLObject permutation = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$greaterThanOrEqualTo) && cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED).isInteger()) {
                    min = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    permutation = cons(ONE_INTEGER, permutation);
                } else if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $$greaterThanOrEqualTo) && cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED).isInteger()) {
                    max = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    permutation = cons(TWO_INTEGER, permutation);
                } else {
                    variable = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    permutation = cons(ZERO_INTEGER, permutation);
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list17);
            }
            index = Numbers.add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        permutation = Sequences.nreverse(permutation);
        return Values.values(min, max, variable, permutation);
    }

    public static SubLObject declare_removal_modules_integer_between_file() {
        declareFunction("removal_integer_between_check_expand", "REMOVAL-INTEGER-BETWEEN-CHECK-EXPAND", 1, 1, false);
        declareFunction("make_integer_between_support", "MAKE-INTEGER-BETWEEN-SUPPORT", 3, 1, false);
        declareFunction("removal_integer_between_unify_cost", "REMOVAL-INTEGER-BETWEEN-UNIFY-COST", 1, 1, false);
        declareFunction("removal_integer_between_verify", "REMOVAL-INTEGER-BETWEEN-VERIFY", 1, 0, false);
        declareFunction("removal_not_integer_between_check_expand", "REMOVAL-NOT-INTEGER-BETWEEN-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_conjunctive_integer_between_applicability", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-APPLICABILITY", 1, 0, false);
        declareFunction("removal_conjunctive_integer_between_cost", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-COST", 1, 0, false);
        declareFunction("removal_conjunctive_integer_between_expand", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-EXPAND", 1, 0, false);
        declareFunction("removal_conjunctive_integer_between_destructure", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-DESTRUCTURE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_integer_between_file() {
        $default_integer_between_check_cost$ = defparameter("*DEFAULT-INTEGER-BETWEEN-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $integer_between_defining_mt$ = deflexical("*INTEGER-BETWEEN-DEFINING-MT*", maybeDefault($sym5$_INTEGER_BETWEEN_DEFINING_MT_, $integer_between_defining_mt$, $$BaseKB));
        $default_not_integer_between_check_cost$ = defparameter("*DEFAULT-NOT-INTEGER-BETWEEN-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_integer_between_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$integerBetween);
        preference_modules.doomed_unless_arg_bindable($POS, $$integerBetween, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$integerBetween, THREE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$integerBetween);
        inference_modules.inference_removal_module($REMOVAL_INTEGER_BETWEEN_CHECK, $list4);
        subl_macro_promotions.declare_defglobal($sym5$_INTEGER_BETWEEN_DEFINING_MT_);
        mt_vars.note_mt_var($sym5$_INTEGER_BETWEEN_DEFINING_MT_, $$integerBetween);
        inference_modules.inference_removal_module($REMOVAL_INTEGER_BETWEEN_UNIFY, $list12);
        inference_modules.inference_removal_module($REMOVAL_NOT_INTEGER_BETWEEN_CHECK, $list14);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN, $list16);
        utilities_macros.note_funcall_helper_function($sym21$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_APPLICABILITY);
        utilities_macros.note_funcall_helper_function($sym22$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_COST);
        utilities_macros.note_funcall_helper_function($sym25$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_EXPAND);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_integer_between_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_integer_between_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_integer_between_file();
    }

    static {
        me = new removal_modules_integer_between();
        $default_integer_between_check_cost$ = null;
        $integer_between_defining_mt$ = null;
        $default_not_integer_between_check_cost$ = null;
        $$integerBetween = makeConstSym(("integerBetween"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $REMOVAL_INTEGER_BETWEEN_CHECK = makeKeyword("REMOVAL-INTEGER-BETWEEN-CHECK");
        $list4 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("integerBetween")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("integerBetween")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INTEGER-BETWEEN-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INTEGER-BETWEEN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$integerBetween <integer> <integer> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$integerBetween 1 2 3)") });
        $sym5$_INTEGER_BETWEEN_DEFINING_MT_ = makeSymbol("*INTEGER-BETWEEN-DEFINING-MT*");
        $$BaseKB = makeConstSym(("BaseKB"));
        $sym7$INTEGERP = makeSymbol("INTEGERP");
        $CODE = makeKeyword("CODE");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $list10 = list(makeSymbol("LOW"), makeSymbol("HIGH"));
        $REMOVAL_INTEGER_BETWEEN_UNIFY = makeKeyword("REMOVAL-INTEGER-BETWEEN-UNIFY");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("integerBetween")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("integerBetween")), makeKeyword("INTEGER"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER")),
                makeKeyword("COST"), makeSymbol("REMOVAL-INTEGER-BETWEEN-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("integerBetween")), list(makeKeyword("BIND"), makeSymbol("LOW")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("HIGH"))), list(list(makeKeyword("VALUE"), makeSymbol("LOW")), list(makeKeyword("VALUE"), makeSymbol("HIGH")))),
                makeKeyword("INPUT-VERIFY-PATTERN"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-INTEGER-BETWEEN-VERIFY")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("LOW"), makeSymbol("HIGH")),
                        list(makeKeyword("CALL"), makeSymbol("NEW-INTEGER-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("LOW")), list(makeKeyword("CALL"), makeSymbol("1+"), list(makeKeyword("VALUE"), makeSymbol("HIGH"))), ONE_INTEGER)),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("integerBetween")), list(makeKeyword("VALUE"), makeSymbol("LOW")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("HIGH"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-MT"),
                makeSymbol("*INTEGER-BETWEEN-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$integerBetween <integer> <whatever> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$integerBetween 1 ?NUM 10)") });
        $REMOVAL_NOT_INTEGER_BETWEEN_CHECK = makeKeyword("REMOVAL-NOT-INTEGER-BETWEEN-CHECK");
        $list14 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("integerBetween")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("integerBetween")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-INTEGER-BETWEEN-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-INTEGER-BETWEEN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$integerBetween <integer> <whatever> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$integerBetween 1 42 10))") });
        $REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN = makeKeyword("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN");
        $list16 = list(new SubLObject[] { makeKeyword("EVERY-PREDICATES"), list(makeConstSym(("isa")), makeConstSym(("greaterThanOrEqualTo"))), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-APPLICABILITY"), makeKeyword("COST"),
                makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$and (#$isa ?NUM #$Integer) (#$greaterThanOrEqualTo ?NUM <int1>) (#$greaterThanOrEqualTo <int2> ?NUM))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa ?NUM #$Integer) (#$greaterThanOrEqualTo ?NUM 1) (#$greaterThanOrEqualTo 212 ?NUM))") });
        $list17 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $$isa = makeConstSym(("isa"));
        $$Integer = makeConstSym(("Integer"));
        $$greaterThanOrEqualTo = makeConstSym(("greaterThanOrEqualTo"));
        $sym21$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_APPLICABILITY = makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-APPLICABILITY");
        $sym22$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_COST = makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-COST");
        $ISA = makeKeyword("ISA");
        $EVAL = makeKeyword("EVAL");
        $sym25$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_EXPAND = makeSymbol("REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-EXPAND");
    }
}
/*
 *
 * Total time: 81 ms
 *
 */