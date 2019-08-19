package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_formula_arg_n extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_arg_n";
    public static String myFingerPrint = "e699eb68995320d05ab0f3473de211d038418ab07763e56b925c395629d73950";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 900L)
    public static SubLSymbol $operator_formulas_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 1200L)
    private static SubLSymbol $operator_formulas_code_rule$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 1600L)
    private static SubLSymbol $default_operator_formulas_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 4900L)
    public static SubLSymbol $argn_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 5400L)
    private static SubLSymbol $default_arg_n_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 11400L)
    public static SubLSymbol $formula_arity_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 11500L)
    private static SubLSymbol $default_formula_arity_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 18200L)
    public static SubLSymbol $cycl_for_subl_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 18700L)
    private static SubLSymbol $default_cycl_for_subl_check_cost$;
    private static SubLObject $$operatorFormulas;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $sym3$_OPERATOR_FORMULAS_DEFINING_MT_;
    private static SubLObject $$BaseKB;
    private static SubLSymbol $OPAQUE;
    private static SubLSymbol $TRUE_MON;
    private static SubLList $list7;
    private static SubLSymbol $CODE;
    private static SubLSymbol $REMOVAL_OPERATOR_FORMULAS_CHECK_POS;
    private static SubLList $list10;
    private static SubLSymbol $REMOVAL_OPERATOR_FORMULAS_CHECK_NEG;
    private static SubLList $list12;
    private static SubLSymbol $REMOVAL_OPERATOR_FORMULAS_UNIFY;
    private static SubLList $list14;
    private static SubLObject $$argN;
    private static SubLSymbol $sym16$_ARGN_DEFINING_MT_;
    private static SubLList $list17;
    private static SubLSymbol $REMOVAL_ARG_N_CHECK_POS;
    private static SubLList $list19;
    private static SubLSymbol $REMOVAL_ARG_N_CHECK_NEG;
    private static SubLList $list21;
    private static SubLSymbol $REMOVAL_ARG_N_UNIFY_ARG1;
    private static SubLList $list23;
    private static SubLSymbol $REMOVAL_ARG_N_UNIFY_ARG2;
    private static SubLList $list25;
    private static SubLSymbol $REMOVAL_ARG_N_ITERATE;
    private static SubLList $list27;
    private static SubLSymbol $IGNORE;
    private static SubLObject $$formulaArity;
    private static SubLSymbol $sym30$_FORMULA_ARITY_DEFINING_MT_;
    private static SubLSymbol $REMOVAL_FORMULA_ARITY_CHECK_POS;
    private static SubLList $list32;
    private static SubLSymbol $REMOVAL_FORMULA_ARITY_CHECK_NEG;
    private static SubLList $list34;
    private static SubLSymbol $REMOVAL_FORMULA_ARITY_UNIFY;
    private static SubLList $list36;
    private static SubLObject $$quotedFormulaArity;
    private static SubLSymbol $REMOVAL_QUOTED_FORMULA_ARITY_CHECK_POS;
    private static SubLList $list39;
    private static SubLSymbol $REMOVAL_QUOTED_FORMULA_ARITY_CHECK_NEG;
    private static SubLList $list41;
    private static SubLSymbol $REMOVAL_QUOTED_FORMULA_ARITY_UNIFY;
    private static SubLList $list43;
    private static SubLObject $$cycLForSubL;
    private static SubLSymbol $sym45$_CYCL_FOR_SUBL_DEFINING_MT_;
    private static SubLList $list46;
    private static SubLSymbol $REMOVAL_CYCL_FOR_SUBL_CHECK_POS;
    private static SubLList $list48;
    private static SubLSymbol $REMOVAL_CYCL_FOR_SUBL_CHECK_NEG;
    private static SubLList $list50;
    private static SubLSymbol $REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG1;
    private static SubLList $list52;
    private static SubLSymbol $REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG2;
    private static SubLList $list54;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 1000L)
    public static SubLObject make_operator_formulas_supports(SubLObject support_formula, SubLObject support_mt) {
        SubLObject support = arguments.make_hl_support($OPAQUE, support_formula, support_mt, $TRUE_MON);
        SubLObject more_supports = list(operator_formulas_rule_support());
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 1400L)
    public static SubLObject operator_formulas_rule_support() {
        return arguments.make_hl_support($CODE, $operator_formulas_code_rule$.getGlobalValue(), $operator_formulas_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 1800L)
    public static SubLObject formula_has_operatorP(SubLObject formula, SubLObject operator) {
        return Equality.equal(operator, cycl_utilities.formula_operator(formula));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 5000L)
    public static SubLObject make_arg_n_supports(SubLObject support_formula, SubLObject support_mt) {
        SubLObject support = arguments.make_hl_support($OPAQUE, support_formula, support_mt, $TRUE_MON);
        SubLObject more_supports = list(arg_n_rule_support());
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 5200L)
    public static SubLObject arg_n_rule_support() {
        return arguments.make_hl_support($CODE, $list17, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 5500L)
    public static SubLObject removal_arg_n_check(SubLObject v_term, SubLObject argnum, SubLObject formula) {
        return czer_utilities.terms_equal_at_elP(v_term, cycl_utilities.formula_arg(formula, argnum, UNPROVIDED), NIL);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 10300L)
    public static SubLObject removal_arg_n_iterate_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return el_utilities.formula_arity(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 10400L)
    public static SubLObject removal_arg_n_iterate_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject terms = cycl_utilities.formula_terms(formula, $IGNORE);
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        arg = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            SubLObject bound_asent = el_utilities.make_ternary_formula($$argN, arg, argnum, formula);
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(bound_asent, asent, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bound_asent, $argn_defining_mt$.getGlobalValue(), $TRUE_MON), v_bindings, cons(arg_n_rule_support(), unify_justification));
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 11700L)
    public static SubLObject formula_has_arityP(SubLObject formula, SubLObject v_arity) {
        return el_utilities.formula_arityE(formula, v_arity, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 18300L)
    public static SubLObject make_cycl_for_subl_supports(SubLObject support_formula, SubLObject support_mt) {
        SubLObject support = arguments.make_hl_support($OPAQUE, support_formula, support_mt, $TRUE_MON);
        SubLObject more_supports = list(cycl_for_subl_rule_support());
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 18500L)
    public static SubLObject cycl_for_subl_rule_support() {
        return arguments.make_hl_support($CODE, $list46, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 18800L)
    public static SubLObject removal_cycl_for_subl_check(SubLObject subl_quote_fn_formula, SubLObject subl) {
        return Equality.equal(subl, cycl_utilities.formula_arg(subl_quote_fn_formula, ONE_INTEGER, UNPROVIDED));
    }

    public static SubLObject declare_removal_modules_formula_arg_n_file() {
        declareFunction(myName, "make_operator_formulas_supports", "MAKE-OPERATOR-FORMULAS-SUPPORTS", 2, 0, false);
        declareFunction(myName, "operator_formulas_rule_support", "OPERATOR-FORMULAS-RULE-SUPPORT", 0, 0, false);
        declareFunction(myName, "formula_has_operatorP", "FORMULA-HAS-OPERATOR?", 2, 0, false);
        declareFunction(myName, "make_arg_n_supports", "MAKE-ARG-N-SUPPORTS", 2, 0, false);
        declareFunction(myName, "arg_n_rule_support", "ARG-N-RULE-SUPPORT", 0, 0, false);
        declareFunction(myName, "removal_arg_n_check", "REMOVAL-ARG-N-CHECK", 3, 0, false);
        declareFunction(myName, "removal_arg_n_iterate_cost", "REMOVAL-ARG-N-ITERATE-COST", 1, 1, false);
        declareFunction(myName, "removal_arg_n_iterate_expand", "REMOVAL-ARG-N-ITERATE-EXPAND", 1, 1, false);
        declareFunction(myName, "formula_has_arityP", "FORMULA-HAS-ARITY?", 2, 0, false);
        declareFunction(myName, "make_cycl_for_subl_supports", "MAKE-CYCL-FOR-SUBL-SUPPORTS", 2, 0, false);
        declareFunction(myName, "cycl_for_subl_rule_support", "CYCL-FOR-SUBL-RULE-SUPPORT", 0, 0, false);
        declareFunction(myName, "removal_cycl_for_subl_check", "REMOVAL-CYCL-FOR-SUBL-CHECK", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_formula_arg_n_file() {
        $operator_formulas_defining_mt$ = deflexical("*OPERATOR-FORMULAS-DEFINING-MT*", maybeDefault($sym3$_OPERATOR_FORMULAS_DEFINING_MT_, $operator_formulas_defining_mt$, $$BaseKB));
        $operator_formulas_code_rule$ = deflexical("*OPERATOR-FORMULAS-CODE-RULE*", $list7);
        $default_operator_formulas_check_cost$ = deflexical("*DEFAULT-OPERATOR-FORMULAS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $argn_defining_mt$ = deflexical("*ARGN-DEFINING-MT*", maybeDefault($sym16$_ARGN_DEFINING_MT_, $argn_defining_mt$, $$BaseKB));
        $default_arg_n_check_cost$ = deflexical("*DEFAULT-ARG-N-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $formula_arity_defining_mt$ = deflexical("*FORMULA-ARITY-DEFINING-MT*", maybeDefault($sym30$_FORMULA_ARITY_DEFINING_MT_, $formula_arity_defining_mt$, $$BaseKB));
        $default_formula_arity_check_cost$ = deflexical("*DEFAULT-FORMULA-ARITY-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $cycl_for_subl_defining_mt$ = deflexical("*CYCL-FOR-SUBL-DEFINING-MT*", maybeDefault($sym45$_CYCL_FOR_SUBL_DEFINING_MT_, $cycl_for_subl_defining_mt$, $$BaseKB));
        $default_cycl_for_subl_check_cost$ = deflexical("*DEFAULT-CYCL-FOR-SUBL-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_formula_arg_n_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$operatorFormulas);
        preference_modules.doomed_unless_arg_bindable($POS, $$operatorFormulas, TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$operatorFormulas);
        subl_macro_promotions.declare_defglobal($sym3$_OPERATOR_FORMULAS_DEFINING_MT_);
        mt_vars.note_mt_var($sym3$_OPERATOR_FORMULAS_DEFINING_MT_, $$operatorFormulas);
        inference_modules.inference_removal_module($REMOVAL_OPERATOR_FORMULAS_CHECK_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_OPERATOR_FORMULAS_CHECK_NEG, $list12);
        inference_modules.inference_removal_module($REMOVAL_OPERATOR_FORMULAS_UNIFY, $list14);
        inference_modules.register_solely_specific_removal_module_predicate($$argN);
        preference_modules.doomed_unless_arg_bindable($POS, $$argN, THREE_INTEGER);
        subl_macro_promotions.declare_defglobal($sym16$_ARGN_DEFINING_MT_);
        mt_vars.note_mt_var($sym16$_ARGN_DEFINING_MT_, $$argN);
        inference_modules.inference_removal_module($REMOVAL_ARG_N_CHECK_POS, $list19);
        inference_modules.inference_removal_module($REMOVAL_ARG_N_CHECK_NEG, $list21);
        inference_modules.inference_removal_module($REMOVAL_ARG_N_UNIFY_ARG1, $list23);
        inference_modules.inference_removal_module($REMOVAL_ARG_N_UNIFY_ARG2, $list25);
        inference_modules.inference_removal_module($REMOVAL_ARG_N_ITERATE, $list27);
        inference_modules.register_solely_specific_removal_module_predicate($$formulaArity);
        preference_modules.doomed_unless_arg_bindable($POS, $$formulaArity, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$formulaArity);
        subl_macro_promotions.declare_defglobal($sym30$_FORMULA_ARITY_DEFINING_MT_);
        mt_vars.note_mt_var($sym30$_FORMULA_ARITY_DEFINING_MT_, $$formulaArity);
        inference_modules.inference_removal_module($REMOVAL_FORMULA_ARITY_CHECK_POS, $list32);
        inference_modules.inference_removal_module($REMOVAL_FORMULA_ARITY_CHECK_NEG, $list34);
        inference_modules.inference_removal_module($REMOVAL_FORMULA_ARITY_UNIFY, $list36);
        inference_modules.register_solely_specific_removal_module_predicate($$quotedFormulaArity);
        preference_modules.doomed_unless_arg_bindable($POS, $$quotedFormulaArity, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$quotedFormulaArity);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_FORMULA_ARITY_CHECK_POS, $list39);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_FORMULA_ARITY_CHECK_NEG, $list41);
        inference_modules.inference_removal_module($REMOVAL_QUOTED_FORMULA_ARITY_UNIFY, $list43);
        inference_modules.register_solely_specific_removal_module_predicate($$cycLForSubL);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$cycLForSubL);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$cycLForSubL);
        subl_macro_promotions.declare_defglobal($sym45$_CYCL_FOR_SUBL_DEFINING_MT_);
        mt_vars.note_mt_var($sym45$_CYCL_FOR_SUBL_DEFINING_MT_, $$cycLForSubL);
        inference_modules.inference_removal_module($REMOVAL_CYCL_FOR_SUBL_CHECK_POS, $list48);
        inference_modules.inference_removal_module($REMOVAL_CYCL_FOR_SUBL_CHECK_NEG, $list50);
        inference_modules.inference_removal_module($REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG1, $list52);
        inference_modules.inference_removal_module($REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG2, $list54);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_formula_arg_n_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_formula_arg_n_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_formula_arg_n_file();
    }

    static {
        me = new removal_modules_formula_arg_n();
        $operator_formulas_defining_mt$ = null;
        $operator_formulas_code_rule$ = null;
        $default_operator_formulas_check_cost$ = null;
        $argn_defining_mt$ = null;
        $default_arg_n_check_cost$ = null;
        $formula_arity_defining_mt$ = null;
        $default_formula_arity_check_cost$ = null;
        $cycl_for_subl_defining_mt$ = null;
        $default_cycl_for_subl_check_cost$ = null;
        $$operatorFormulas = makeConstSym(("operatorFormulas"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $sym3$_OPERATOR_FORMULAS_DEFINING_MT_ = makeSymbol("*OPERATOR-FORMULAS-DEFINING-MT*");
        $$BaseKB = makeConstSym(("BaseKB"));
        $OPAQUE = makeKeyword("OPAQUE");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $list7 = list(makeConstSym(("implies")), list(makeConstSym(("equals")), makeSymbol("?FORMULA"), cons(makeSymbol("?RELATION"), makeSymbol("??ARGS"))), list(makeConstSym(("operatorFormulas")), makeSymbol("?RELATION"), makeSymbol("?FORMULA")));
        $CODE = makeKeyword("CODE");
        $REMOVAL_OPERATOR_FORMULAS_CHECK_POS = makeKeyword("REMOVAL-OPERATOR-FORMULAS-CHECK-POS");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("operatorFormulas")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("operatorFormulas")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-OPERATOR-FORMULAS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("operatorFormulas")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-OPERATOR?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("RELATION")))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*OPERATOR-FORMULAS-DEFINING-MT*"), makeKeyword("SUPPORT"), makeSymbol("MAKE-OPERATOR-FORMULAS-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$operatorFormulas <fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"),
                makeString("(#$operatorFormulas #$JuvenileFn (#$JuvenileFn #$Dog))") });
        $REMOVAL_OPERATOR_FORMULAS_CHECK_NEG = makeKeyword("REMOVAL-OPERATOR-FORMULAS-CHECK-NEG");
        $list12 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("operatorFormulas")), makeKeyword("REQUIRED-PATTERN"),
                        list(makeConstSym(("operatorFormulas")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"),
                        list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*DEFAULT-OPERATOR-FORMULAS-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                                list(makeConstSym(("operatorFormulas")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                        makeKeyword("OUTPUT-CHECK-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("FORMULA")),
                                list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-OPERATOR?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("RELATION"))))),
                        makeKeyword("SUPPORT-MT"), makeSymbol("*OPERATOR-FORMULAS-DEFINING-MT*"), makeKeyword("SUPPORT"), makeSymbol("MAKE-OPERATOR-FORMULAS-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$operatorFormulas <fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"),
                        makeString("(#$not (#$operatorFormulas #$isa (#$JuvenileFn #$Dog)))") });
        $REMOVAL_OPERATOR_FORMULAS_UNIFY = makeKeyword("REMOVAL-OPERATOR-FORMULAS-UNIFY");
        $list14 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("operatorFormulas")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("operatorFormulas")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("operatorFormulas")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeConstSym(("operatorFormulas")), list(makeKeyword("CALL"), makeSymbol("FORMULA-OPERATOR"), makeKeyword("INPUT")), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"),
                makeSymbol("*OPERATOR-FORMULAS-DEFINING-MT*"), makeKeyword("SUPPORT"), makeSymbol("MAKE-OPERATOR-FORMULAS-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$operatorFormulas <not fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"),
                makeString("(#$operatorFormulas ?WHAT (#$JuvenileFn #$Dog))") });
        $$argN = makeConstSym(("argN"));
        $sym16$_ARGN_DEFINING_MT_ = makeSymbol("*ARGN-DEFINING-MT*");
        $list17 = list(makeConstSym(("argN")), list(makeConstSym(("FormulaArgFn")), makeSymbol("?N"), makeSymbol("?FORMULA")), makeSymbol("?N"), makeSymbol("?FORMULA"));
        $REMOVAL_ARG_N_CHECK_POS = makeKeyword("REMOVAL-ARG-N-CHECK-POS");
        $list19 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("argN")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(makeConstSym(("argN")), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")),
                        list(makeConstSym(("argN")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))),
                makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ARG-N-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("argN")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("ARGNUM")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("FORMULA")),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-ARG-N-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*ARGN-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-ARG-N-SUPPORTS"), makeKeyword("DOCUMENTATION"),
                makeString("(#$argN <fully-bound> <integer> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$argN #$Dog 1 (#$JuvenileFn #$Dog))") });
        $REMOVAL_ARG_N_CHECK_NEG = makeKeyword("REMOVAL-ARG-N-CHECK-NEG");
        $list21 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("argN")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(makeConstSym(("argN")), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")),
                        list(makeConstSym(("argN")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))),
                makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*DEFAULT-ARG-N-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("argN")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("ARGNUM")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("FORMULA")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ARG-N-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*ARGN-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-ARG-N-SUPPORTS"), makeKeyword("DOCUMENTATION"),
                makeString("(#$argN <fully-bound> <integer> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$not (#$argN #$Muffet 1 (#$JuvenileFn #$Dog)))") });
        $REMOVAL_ARG_N_UNIFY_ARG1 = makeKeyword("REMOVAL-ARG-N-UNIFY-ARG1");
        $list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("argN")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(makeConstSym(("argN")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")),
                        list(makeConstSym(("argN")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("argN")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ARGNUM")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ARGNUM"), makeSymbol("FORMULA")),
                        list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FORMULA-ARG"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM"))))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("argN")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("SUPPORT-MT"), makeSymbol("*ARGN-DEFINING-MT*"),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-ARG-N-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <not fully-bound> <integer> <CycL formula>)"),
                makeKeyword("EXAMPLE"), makeString("(#$argN ?WHAT 1 (#$JuvenileFn #$Dog))") });
        $REMOVAL_ARG_N_UNIFY_ARG2 = makeKeyword("REMOVAL-ARG-N-UNIFY-ARG2");
        $list25 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("argN")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("argN")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("argN")), list(makeKeyword("BIND"), makeSymbol("TERM")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("FORMULA"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ARGNUM"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("FORMULA-ARG-POSITIONS"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), EQUAL)),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("argN")), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("SUPPORT-MT"), makeSymbol("*ARGN-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-ARG-N-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <fully-bound> <not-fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"),
                makeString("(#$argN #$Dog ?WHAT (#$JuvenileFn #$Dog))") });
        $REMOVAL_ARG_N_ITERATE = makeKeyword("REMOVAL-ARG-N-ITERATE");
        $list27 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("argN")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("argN")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("COST"), makeSymbol("REMOVAL-ARG-N-ITERATE-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ARG-N-ITERATE-EXPAND"), makeKeyword("SUPPORT-MT"), makeSymbol("*ARGN-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"),
                makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <not-fully-bound> <not-fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$argN ?ARG ?NUM (#$JuvenileFn #$Dog))") });
        $IGNORE = makeKeyword("IGNORE");
        $$formulaArity = makeConstSym(("formulaArity"));
        $sym30$_FORMULA_ARITY_DEFINING_MT_ = makeSymbol("*FORMULA-ARITY-DEFINING-MT*");
        $REMOVAL_FORMULA_ARITY_CHECK_POS = makeKeyword("REMOVAL-FORMULA-ARITY-CHECK-POS");
        $list32 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("formulaArity")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("formulaArity")), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-FORMULA-ARITY-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("formulaArity")), list(makeKeyword("BIND"), makeSymbol("FORMULA")), list(makeKeyword("BIND"), makeSymbol("ARITY"))), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("ARITY")), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-ARITY?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$formulaArity <CycL formula> <integer>)"),
                makeKeyword("EXAMPLE"), makeString("(#$formulaArity (#$JuvenileFn #$Dog) 1)") });
        $REMOVAL_FORMULA_ARITY_CHECK_NEG = makeKeyword("REMOVAL-FORMULA-ARITY-CHECK-NEG");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("formulaArity")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("formulaArity")), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"),
                list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*DEFAULT-FORMULA-ARITY-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("formulaArity")), list(makeKeyword("BIND"), makeSymbol("FORMULA")), list(makeKeyword("BIND"), makeSymbol("ARITY"))), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("ARITY")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-ARITY?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY"))))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$formulaArity <CycL formula> <integer>))"),
                makeKeyword("EXAMPLE"), makeString("(#$not (#$formulaArity (#$JuvenileFn #$Dog) 2))") });
        $REMOVAL_FORMULA_ARITY_UNIFY = makeKeyword("REMOVAL-FORMULA-ARITY-UNIFY");
        $list36 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("formulaArity")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("formulaArity")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("formulaArity")), list(makeKeyword("BIND"), makeSymbol("FORMULA")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FORMULA-ARITY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("formulaArity")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
                makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$formulaArity <not fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$formulaArity ?WHAT (#$JuvenileFn #$Dog))") });
        $$quotedFormulaArity = makeConstSym(("quotedFormulaArity"));
        $REMOVAL_QUOTED_FORMULA_ARITY_CHECK_POS = makeKeyword("REMOVAL-QUOTED-FORMULA-ARITY-CHECK-POS");
        $list39 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quotedFormulaArity")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("quotedFormulaArity")), list(makeKeyword("AND"), list(makeConstSym(("Quote")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-FORMULA-ARITY-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("quotedFormulaArity")), list(makeConstSym(("Quote")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(makeKeyword("BIND"), makeSymbol("ARITY"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("ARITY")), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-ARITY?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedFormulaArity (#$Quote <CycL formula>) <integer>)"),
                makeKeyword("EXAMPLE"), makeString("(#$quotedFormulaArity (#$Quote (#$JuvenileFn #$Dog)) 1)") });
        $REMOVAL_QUOTED_FORMULA_ARITY_CHECK_NEG = makeKeyword("REMOVAL-QUOTED-FORMULA-ARITY-CHECK-NEG");
        $list41 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("quotedFormulaArity")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("quotedFormulaArity")), list(makeKeyword("AND"), list(makeConstSym(("Quote")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"),
                list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*DEFAULT-FORMULA-ARITY-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("quotedFormulaArity")), list(makeConstSym(("Quote")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(makeKeyword("BIND"), makeSymbol("ARITY"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("ARITY")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-ARITY?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY"))))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$quotedFormulaArity (#$Quote <CycL formula>) <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedFormulaArity (#$Quote (#$JuvenileFn #$Dog)) 2))") });
        $REMOVAL_QUOTED_FORMULA_ARITY_UNIFY = makeKeyword("REMOVAL-QUOTED-FORMULA-ARITY-UNIFY");
        $list43 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quotedFormulaArity")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("quotedFormulaArity")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeConstSym(("Quote")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER,
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("quotedFormulaArity")), list(makeConstSym(("Quote")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FORMULA-ARITY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("quotedFormulaArity")), list(makeConstSym(("Quote")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"),
                makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedFormulaArity <not fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedFormulaArity ?WHAT (#$JuvenileFn #$Dog))") });
        $$cycLForSubL = makeConstSym(("cycLForSubL"));
        $sym45$_CYCL_FOR_SUBL_DEFINING_MT_ = makeSymbol("*CYCL-FOR-SUBL-DEFINING-MT*");
        $list46 = list(makeConstSym(("cycLForSubL")), ConsesLow.list(makeConstSym(("SubLQuoteFn")), makeSymbol("?SUBL")), makeSymbol("?SUBL"));
        $REMOVAL_CYCL_FOR_SUBL_CHECK_POS = makeKeyword("REMOVAL-CYCL-FOR-SUBL-CHECK-POS");
        $list48 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("cycLForSubL")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-CYCL-FOR-SUBL-CHECK-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycLForSubL")), list(makeKeyword("BIND"), makeSymbol("SUBL")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("SUBL")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CYCL-FOR-SUBL-CHECK"), list(makeKeyword("VALUE"), makeSymbol("SUBL")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                makeKeyword("SUPPORT-MT"), makeSymbol("*CYCL-FOR-SUBL-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-CYCL-FOR-SUBL-SUPPORTS"), makeKeyword("DOCUMENTATION"),
                makeString("(#$cycLForSubL (#$SubLQuoteFn <SubL expression>) <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$cycLForSubL #$Dog (#$cycLForSubL #$Dog))") });
        $REMOVAL_CYCL_FOR_SUBL_CHECK_NEG = makeKeyword("REMOVAL-CYCL-FOR-SUBL-CHECK-NEG");
        $list50 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycLForSubL")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")), makeKeyword("FULLY-BOUND")),
                        makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*DEFAULT-CYCL-FOR-SUBL-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycLForSubL")), list(makeKeyword("BIND"), makeSymbol("SUBL")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("SUBL")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))),
                        makeKeyword("OUTPUT-CHECK-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("FORMULA")),
                                list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CYCL-FOR-SUBL-CHECK"), list(makeKeyword("VALUE"), makeSymbol("SUBL")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))))),
                        makeKeyword("SUPPORT-MT"), makeSymbol("*CYCL-FOR-SUBL-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-CYCL-FOR-SUBL-SUPPORTS"),
                        makeKeyword("DOCUMENTATION"), makeString("(#$not (#$cycLForSubL (#$SubLQuoteFn <SubL expression>) <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$cycLForSubL (#$SubLQuoteFn #$Dog) #$Cat))") });
        $REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG1 = makeKeyword("REMOVAL-CYCL-FOR-SUBL-UNIFY-ARG1");
        $list52 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycLForSubL")), makeKeyword("VARIABLE"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycLForSubL")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("SUBL"))), list(list(makeKeyword("VALUE"), makeSymbol("SUBL")))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("SUBL")), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("MAKE-UNARY-FORMULA"), makeConstSym(("SubLQuoteFn")), list(makeKeyword("VALUE"), makeSymbol("SUBL"))))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("cycLForSubL")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("SUBL"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CYCL-FOR-SUBL-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"),
                makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-CYCL-FOR-SUBL-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$cycLForSubL ?CYCL <SubL Formula>"), makeKeyword("EXAMPLE"), makeString("(#$cycLForSubL ?CYCL :FOO)") });
        $REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG2 = makeKeyword("REMOVAL-CYCL-FOR-SUBL-UNIFY-ARG2");
        $list54 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("cycLForSubL")), list(makeKeyword("TEST"), makeSymbol("SUBL-QUOTE-FN-SYNTAX-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycLForSubL")), list(makeKeyword("BIND"), makeSymbol("SUBL-QUOTE-FN-FORMULA")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("SUBL-QUOTE-FN-FORMULA")))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("SUBL-QUOTE-FN-FORMULA")), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FORMULA-ARG"), list(makeKeyword("VALUE"), makeSymbol("SUBL-QUOTE-FN-FORMULA")), ONE_INTEGER))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("cycLForSubL")), list(makeKeyword("VALUE"), makeSymbol("SUBL-QUOTE-FN-FORMULA")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CYCL-FOR-SUBL-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-CYCL-FOR-SUBL-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$cycLForSubL (#$SubLQuoteFn <SubL formula>) ?SUBL)"), makeKeyword("EXAMPLE"),
                makeString("(#$cycLForSubL (#$SubLQuoteFn :FOO) ?FOO)") });
    }
}
/*
 *
 * Total time: 278 ms
 *
 */