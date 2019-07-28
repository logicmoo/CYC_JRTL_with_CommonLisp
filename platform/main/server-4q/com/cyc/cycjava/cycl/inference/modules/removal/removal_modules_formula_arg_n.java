package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_arg_n;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_arg_n.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_formula_arg_n extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_formula_arg_n();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_arg_n";

    public static final String myFingerPrint = "e699eb68995320d05ab0f3473de211d038418ab07763e56b925c395629d73950";



    // deflexical
    private static final SubLSymbol $operator_formulas_code_rule$ = makeSymbol("*OPERATOR-FORMULAS-CODE-RULE*");

    // deflexical
    private static final SubLSymbol $default_operator_formulas_check_cost$ = makeSymbol("*DEFAULT-OPERATOR-FORMULAS-CHECK-COST*");



    // deflexical
    private static final SubLSymbol $default_arg_n_check_cost$ = makeSymbol("*DEFAULT-ARG-N-CHECK-COST*");



    // deflexical
    private static final SubLSymbol $default_formula_arity_check_cost$ = makeSymbol("*DEFAULT-FORMULA-ARITY-CHECK-COST*");



    // deflexical
    private static final SubLSymbol $default_cycl_for_subl_check_cost$ = makeSymbol("*DEFAULT-CYCL-FOR-SUBL-CHECK-COST*");

    private static final SubLObject $$operatorFormulas = reader_make_constant_shell(makeString("operatorFormulas"));





    public static final SubLSymbol $operator_formulas_defining_mt$ = makeSymbol("*OPERATOR-FORMULAS-DEFINING-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));





    private static final SubLList $list7 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?FORMULA"), cons(makeSymbol("?RELATION"), makeSymbol("??ARGS"))), list(reader_make_constant_shell(makeString("operatorFormulas")), makeSymbol("?RELATION"), makeSymbol("?FORMULA")));



    private static final SubLSymbol $REMOVAL_OPERATOR_FORMULAS_CHECK_POS = makeKeyword("REMOVAL-OPERATOR-FORMULAS-CHECK-POS");

    public static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("operatorFormulas")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("operatorFormulas")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-OPERATOR-FORMULAS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("operatorFormulas")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-OPERATOR?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("RELATION")))), makeKeyword("SUPPORT-MT"), makeSymbol("*OPERATOR-FORMULAS-DEFINING-MT*"), makeKeyword("SUPPORT"), makeSymbol("MAKE-OPERATOR-FORMULAS-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$operatorFormulas <fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$operatorFormulas #$JuvenileFn (#$JuvenileFn #$Dog))") });

    private static final SubLSymbol $REMOVAL_OPERATOR_FORMULAS_CHECK_NEG = makeKeyword("REMOVAL-OPERATOR-FORMULAS-CHECK-NEG");

    public static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("operatorFormulas")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("operatorFormulas")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*DEFAULT-OPERATOR-FORMULAS-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("operatorFormulas")), list(makeKeyword("BIND"), makeSymbol("RELATION")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("RELATION")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("RELATION"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-OPERATOR?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("RELATION"))))), makeKeyword("SUPPORT-MT"), makeSymbol("*OPERATOR-FORMULAS-DEFINING-MT*"), makeKeyword("SUPPORT"), makeSymbol("MAKE-OPERATOR-FORMULAS-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$operatorFormulas <fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$not (#$operatorFormulas #$isa (#$JuvenileFn #$Dog)))") });

    private static final SubLSymbol $REMOVAL_OPERATOR_FORMULAS_UNIFY = makeKeyword("REMOVAL-OPERATOR-FORMULAS-UNIFY");

    private static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("operatorFormulas")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("operatorFormulas")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("operatorFormulas")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(reader_make_constant_shell(makeString("operatorFormulas")), list(makeKeyword("CALL"), makeSymbol("FORMULA-OPERATOR"), makeKeyword("INPUT")), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("*OPERATOR-FORMULAS-DEFINING-MT*"), makeKeyword("SUPPORT"), makeSymbol("MAKE-OPERATOR-FORMULAS-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$operatorFormulas <not fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$operatorFormulas ?WHAT (#$JuvenileFn #$Dog))") });

    private static final SubLObject $$argN = reader_make_constant_shell(makeString("argN"));

    public static final SubLSymbol $argn_defining_mt$ = makeSymbol("*ARGN-DEFINING-MT*");

    public static final SubLList $list17 = list(reader_make_constant_shell(makeString("argN")), list(reader_make_constant_shell(makeString("FormulaArgFn")), makeSymbol("?N"), makeSymbol("?FORMULA")), makeSymbol("?N"), makeSymbol("?FORMULA"));

    private static final SubLSymbol $REMOVAL_ARG_N_CHECK_POS = makeKeyword("REMOVAL-ARG-N-CHECK-POS");

    public static final SubLList $list19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("argN")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("argN")), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell(makeString("argN")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ARG-N-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("argN")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("ARGNUM")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ARG-N-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("SUPPORT-MT"), makeSymbol("*ARGN-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-ARG-N-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <fully-bound> <integer> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$argN #$Dog 1 (#$JuvenileFn #$Dog))") });

    private static final SubLSymbol $REMOVAL_ARG_N_CHECK_NEG = makeKeyword("REMOVAL-ARG-N-CHECK-NEG");

    public static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("argN")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("argN")), makeKeyword("FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell(makeString("argN")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*DEFAULT-ARG-N-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("argN")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("ARGNUM")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ARG-N-CHECK"), list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))))), makeKeyword("SUPPORT-MT"), makeSymbol("*ARGN-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-ARG-N-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <fully-bound> <integer> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$not (#$argN #$Muffet 1 (#$JuvenileFn #$Dog)))") });

    private static final SubLSymbol $REMOVAL_ARG_N_UNIFY_ARG1 = makeKeyword("REMOVAL-ARG-N-UNIFY-ARG1");

    public static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("argN")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("argN")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER"), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell(makeString("argN")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("argN")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ARGNUM")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ARGNUM"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FORMULA-ARG"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM"))))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("argN")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("SUPPORT-MT"), makeSymbol("*ARGN-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-ARG-N-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <not fully-bound> <integer> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$argN ?WHAT 1 (#$JuvenileFn #$Dog))") });

    private static final SubLSymbol $REMOVAL_ARG_N_UNIFY_ARG2 = makeKeyword("REMOVAL-ARG-N-UNIFY-ARG2");

    public static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("argN")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("argN")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("argN")), list(makeKeyword("BIND"), makeSymbol("TERM")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("TERM")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ARGNUM"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("FORMULA-ARG-POSITIONS"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARGNUM")), EQUAL)), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("argN")), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("SUPPORT-MT"), makeSymbol("*ARGN-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-ARG-N-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <fully-bound> <not-fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$argN #$Dog ?WHAT (#$JuvenileFn #$Dog))") });

    private static final SubLSymbol $REMOVAL_ARG_N_ITERATE = makeKeyword("REMOVAL-ARG-N-ITERATE");

    private static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("argN")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("argN")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("COST"), makeSymbol("REMOVAL-ARG-N-ITERATE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ARG-N-ITERATE-EXPAND"), makeKeyword("SUPPORT-MT"), makeSymbol("*ARGN-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$argN <not-fully-bound> <not-fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$argN ?ARG ?NUM (#$JuvenileFn #$Dog))") });



    private static final SubLObject $$formulaArity = reader_make_constant_shell(makeString("formulaArity"));

    public static final SubLSymbol $formula_arity_defining_mt$ = makeSymbol("*FORMULA-ARITY-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_FORMULA_ARITY_CHECK_POS = makeKeyword("REMOVAL-FORMULA-ARITY-CHECK-POS");

    public static final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("formulaArity")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("formulaArity")), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-FORMULA-ARITY-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("formulaArity")), list(makeKeyword("BIND"), makeSymbol("FORMULA")), list(makeKeyword("BIND"), makeSymbol("ARITY"))), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("ARITY")), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-ARITY?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))), makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$formulaArity <CycL formula> <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$formulaArity (#$JuvenileFn #$Dog) 1)") });

    private static final SubLSymbol $REMOVAL_FORMULA_ARITY_CHECK_NEG = makeKeyword("REMOVAL-FORMULA-ARITY-CHECK-NEG");

    public static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("formulaArity")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("formulaArity")), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*DEFAULT-FORMULA-ARITY-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("formulaArity")), list(makeKeyword("BIND"), makeSymbol("FORMULA")), list(makeKeyword("BIND"), makeSymbol("ARITY"))), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("ARITY")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-ARITY?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY"))))), makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$formulaArity <CycL formula> <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$formulaArity (#$JuvenileFn #$Dog) 2))") });

    private static final SubLSymbol $REMOVAL_FORMULA_ARITY_UNIFY = makeKeyword("REMOVAL-FORMULA-ARITY-UNIFY");

    private static final SubLList $list36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("formulaArity")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("formulaArity")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("formulaArity")), list(makeKeyword("BIND"), makeSymbol("FORMULA")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FORMULA-ARITY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("formulaArity")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$formulaArity <not fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$formulaArity ?WHAT (#$JuvenileFn #$Dog))") });

    private static final SubLObject $$quotedFormulaArity = reader_make_constant_shell(makeString("quotedFormulaArity"));

    private static final SubLSymbol $REMOVAL_QUOTED_FORMULA_ARITY_CHECK_POS = makeKeyword("REMOVAL-QUOTED-FORMULA-ARITY-CHECK-POS");

    public static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("quotedFormulaArity")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("quotedFormulaArity")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("Quote")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-FORMULA-ARITY-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("quotedFormulaArity")), list(reader_make_constant_shell(makeString("Quote")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(makeKeyword("BIND"), makeSymbol("ARITY"))), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("ARITY")), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-ARITY?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))), makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedFormulaArity (#$Quote <CycL formula>) <integer>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedFormulaArity (#$Quote (#$JuvenileFn #$Dog)) 1)") });

    private static final SubLSymbol $REMOVAL_QUOTED_FORMULA_ARITY_CHECK_NEG = makeKeyword("REMOVAL-QUOTED-FORMULA-ARITY-CHECK-NEG");

    public static final SubLList $list41 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("quotedFormulaArity")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("quotedFormulaArity")), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("Quote")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P"))), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*DEFAULT-FORMULA-ARITY-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("quotedFormulaArity")), list(reader_make_constant_shell(makeString("Quote")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(makeKeyword("BIND"), makeSymbol("ARITY"))), list(list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FORMULA"), makeSymbol("ARITY")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("FORMULA-HAS-ARITY?"), list(makeKeyword("VALUE"), makeSymbol("FORMULA")), list(makeKeyword("VALUE"), makeSymbol("ARITY"))))), makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedFormulaArity (#$Quote <CycL formula>) <integer>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedFormulaArity (#$Quote (#$JuvenileFn #$Dog)) 2))") });

    private static final SubLSymbol $REMOVAL_QUOTED_FORMULA_ARITY_UNIFY = makeKeyword("REMOVAL-QUOTED-FORMULA-ARITY-UNIFY");

    public static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("quotedFormulaArity")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("quotedFormulaArity")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(reader_make_constant_shell(makeString("Quote")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("quotedFormulaArity")), list(reader_make_constant_shell(makeString("Quote")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FORMULA-ARITY"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("quotedFormulaArity")), list(reader_make_constant_shell(makeString("Quote")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*FORMULA-ARITY-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedFormulaArity <not fully-bound> <CycL formula>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedFormulaArity ?WHAT (#$JuvenileFn #$Dog))") });

    private static final SubLObject $$cycLForSubL = reader_make_constant_shell(makeString("cycLForSubL"));

    public static final SubLSymbol $cycl_for_subl_defining_mt$ = makeSymbol("*CYCL-FOR-SUBL-DEFINING-MT*");

    private static final SubLList $list46 = list(reader_make_constant_shell(makeString("cycLForSubL")), list(reader_make_constant_shell(makeString("SubLQuoteFn")), makeSymbol("?SUBL")), makeSymbol("?SUBL"));

    private static final SubLSymbol $REMOVAL_CYCL_FOR_SUBL_CHECK_POS = makeKeyword("REMOVAL-CYCL-FOR-SUBL-CHECK-POS");

    private static final SubLList $list48 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cycLForSubL")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-CYCL-FOR-SUBL-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("cycLForSubL")), list(makeKeyword("BIND"), makeSymbol("SUBL")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("SUBL")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CYCL-FOR-SUBL-CHECK"), list(makeKeyword("VALUE"), makeSymbol("SUBL")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("SUPPORT-MT"), makeSymbol("*CYCL-FOR-SUBL-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-CYCL-FOR-SUBL-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$cycLForSubL (#$SubLQuoteFn <SubL expression>) <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$cycLForSubL #$Dog (#$cycLForSubL #$Dog))") });

    private static final SubLSymbol $REMOVAL_CYCL_FOR_SUBL_CHECK_NEG = makeKeyword("REMOVAL-CYCL-FOR-SUBL-CHECK-NEG");

    private static final SubLList $list50 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cycLForSubL")), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-CYCL-FORMULA-P")), makeKeyword("FULLY-BOUND")), makeKeyword("CHECK"), T, makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*DEFAULT-CYCL-FOR-SUBL-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("cycLForSubL")), list(makeKeyword("BIND"), makeSymbol("SUBL")), list(makeKeyword("BIND"), makeSymbol("FORMULA"))), list(list(makeKeyword("VALUE"), makeSymbol("SUBL")), list(makeKeyword("VALUE"), makeSymbol("FORMULA")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TERM"), makeSymbol("FORMULA")), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CYCL-FOR-SUBL-CHECK"), list(makeKeyword("VALUE"), makeSymbol("SUBL")), list(makeKeyword("VALUE"), makeSymbol("FORMULA"))))), makeKeyword("SUPPORT-MT"), makeSymbol("*CYCL-FOR-SUBL-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-CYCL-FOR-SUBL-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$cycLForSubL (#$SubLQuoteFn <SubL expression>) <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$cycLForSubL (#$SubLQuoteFn #$Dog) #$Cat))") });

    private static final SubLSymbol $REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG1 = makeKeyword("REMOVAL-CYCL-FOR-SUBL-UNIFY-ARG1");

    private static final SubLList $list52 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cycLForSubL")), makeKeyword("VARIABLE"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("cycLForSubL")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("SUBL"))), list(list(makeKeyword("VALUE"), makeSymbol("SUBL")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SUBL")), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("MAKE-UNARY-FORMULA"), reader_make_constant_shell(makeString("SubLQuoteFn")), list(makeKeyword("VALUE"), makeSymbol("SUBL"))))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("cycLForSubL")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("SUBL"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CYCL-FOR-SUBL-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-CYCL-FOR-SUBL-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$cycLForSubL ?CYCL <SubL Formula>"), makeKeyword("EXAMPLE"), makeString("(#$cycLForSubL ?CYCL :FOO)") });

    private static final SubLSymbol $REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG2 = makeKeyword("REMOVAL-CYCL-FOR-SUBL-UNIFY-ARG2");

    private static final SubLList $list54 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("cycLForSubL")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("cycLForSubL")), list(makeKeyword("TEST"), makeSymbol("SUBL-QUOTE-FN-SYNTAX-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("cycLForSubL")), list(makeKeyword("BIND"), makeSymbol("SUBL-QUOTE-FN-FORMULA")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("SUBL-QUOTE-FN-FORMULA")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SUBL-QUOTE-FN-FORMULA")), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FORMULA-ARG"), list(makeKeyword("VALUE"), makeSymbol("SUBL-QUOTE-FN-FORMULA")), ONE_INTEGER))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("cycLForSubL")), list(makeKeyword("VALUE"), makeSymbol("SUBL-QUOTE-FN-FORMULA")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CYCL-FOR-SUBL-DEFINING-MT*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT"), makeSymbol("MAKE-CYCL-FOR-SUBL-SUPPORTS"), makeKeyword("DOCUMENTATION"), makeString("(#$cycLForSubL (#$SubLQuoteFn <SubL formula>) ?SUBL)"), makeKeyword("EXAMPLE"), makeString("(#$cycLForSubL (#$SubLQuoteFn :FOO) ?FOO)") });

    public static SubLObject make_operator_formulas_supports(final SubLObject support_formula, final SubLObject support_mt) {
        final SubLObject support = arguments.make_hl_support($OPAQUE, support_formula, support_mt, $TRUE_MON);
        final SubLObject more_supports = list(operator_formulas_rule_support());
        return values(support, more_supports);
    }

    public static SubLObject operator_formulas_rule_support() {
        return arguments.make_hl_support($CODE, $operator_formulas_code_rule$.getGlobalValue(), $operator_formulas_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject formula_has_operatorP(final SubLObject formula, final SubLObject operator) {
        return equal(operator, cycl_utilities.formula_operator(formula));
    }

    public static SubLObject make_arg_n_supports(final SubLObject support_formula, final SubLObject support_mt) {
        final SubLObject support = arguments.make_hl_support($OPAQUE, support_formula, support_mt, $TRUE_MON);
        final SubLObject more_supports = list(arg_n_rule_support());
        return values(support, more_supports);
    }

    public static SubLObject arg_n_rule_support() {
        return arguments.make_hl_support($CODE, $list17, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_arg_n_check(final SubLObject v_term, final SubLObject argnum, final SubLObject formula) {
        return czer_utilities.terms_equal_at_elP(v_term, cycl_utilities.formula_arg(formula, argnum, UNPROVIDED), NIL);
    }

    public static SubLObject removal_arg_n_iterate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return formula_arity(asent, UNPROVIDED);
    }

    public static SubLObject removal_arg_n_iterate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject terms = cycl_utilities.formula_terms(formula, $IGNORE);
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        arg = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            final SubLObject bound_asent = make_ternary_formula($$argN, arg, argnum, formula);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(bound_asent, asent, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bound_asent, $argn_defining_mt$.getGlobalValue(), $TRUE_MON), v_bindings, cons(arg_n_rule_support(), unify_justification));
            }
        }
        return NIL;
    }

    public static SubLObject formula_has_arityP(final SubLObject formula, final SubLObject v_arity) {
        return formula_arityE(formula, v_arity, UNPROVIDED);
    }

    public static SubLObject make_cycl_for_subl_supports(final SubLObject support_formula, final SubLObject support_mt) {
        final SubLObject support = arguments.make_hl_support($OPAQUE, support_formula, support_mt, $TRUE_MON);
        final SubLObject more_supports = list(cycl_for_subl_rule_support());
        return values(support, more_supports);
    }

    public static SubLObject cycl_for_subl_rule_support() {
        return arguments.make_hl_support($CODE, $list46, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_cycl_for_subl_check(final SubLObject subl_quote_fn_formula, final SubLObject subl) {
        return equal(subl, cycl_utilities.formula_arg(subl_quote_fn_formula, ONE_INTEGER, UNPROVIDED));
    }

    public static SubLObject declare_removal_modules_formula_arg_n_file() {
        declareFunction(me, "make_operator_formulas_supports", "MAKE-OPERATOR-FORMULAS-SUPPORTS", 2, 0, false);
        declareFunction(me, "operator_formulas_rule_support", "OPERATOR-FORMULAS-RULE-SUPPORT", 0, 0, false);
        declareFunction(me, "formula_has_operatorP", "FORMULA-HAS-OPERATOR?", 2, 0, false);
        declareFunction(me, "make_arg_n_supports", "MAKE-ARG-N-SUPPORTS", 2, 0, false);
        declareFunction(me, "arg_n_rule_support", "ARG-N-RULE-SUPPORT", 0, 0, false);
        declareFunction(me, "removal_arg_n_check", "REMOVAL-ARG-N-CHECK", 3, 0, false);
        declareFunction(me, "removal_arg_n_iterate_cost", "REMOVAL-ARG-N-ITERATE-COST", 1, 1, false);
        declareFunction(me, "removal_arg_n_iterate_expand", "REMOVAL-ARG-N-ITERATE-EXPAND", 1, 1, false);
        declareFunction(me, "formula_has_arityP", "FORMULA-HAS-ARITY?", 2, 0, false);
        declareFunction(me, "make_cycl_for_subl_supports", "MAKE-CYCL-FOR-SUBL-SUPPORTS", 2, 0, false);
        declareFunction(me, "cycl_for_subl_rule_support", "CYCL-FOR-SUBL-RULE-SUPPORT", 0, 0, false);
        declareFunction(me, "removal_cycl_for_subl_check", "REMOVAL-CYCL-FOR-SUBL-CHECK", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_formula_arg_n_file() {
        deflexical("*OPERATOR-FORMULAS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($operator_formulas_defining_mt$, $operator_formulas_defining_mt$, $$BaseKB));
        deflexical("*OPERATOR-FORMULAS-CODE-RULE*", $list7);
        deflexical("*DEFAULT-OPERATOR-FORMULAS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*ARGN-DEFINING-MT*", SubLTrampolineFile.maybeDefault($argn_defining_mt$, $argn_defining_mt$, $$BaseKB));
        deflexical("*DEFAULT-ARG-N-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*FORMULA-ARITY-DEFINING-MT*", SubLTrampolineFile.maybeDefault($formula_arity_defining_mt$, $formula_arity_defining_mt$, $$BaseKB));
        deflexical("*DEFAULT-FORMULA-ARITY-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        deflexical("*CYCL-FOR-SUBL-DEFINING-MT*", SubLTrampolineFile.maybeDefault($cycl_for_subl_defining_mt$, $cycl_for_subl_defining_mt$, $$BaseKB));
        deflexical("*DEFAULT-CYCL-FOR-SUBL-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_formula_arg_n_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$operatorFormulas);
        preference_modules.doomed_unless_arg_bindable($POS, $$operatorFormulas, TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$operatorFormulas);
        declare_defglobal($operator_formulas_defining_mt$);
        mt_vars.note_mt_var($operator_formulas_defining_mt$, $$operatorFormulas);
        inference_modules.inference_removal_module($REMOVAL_OPERATOR_FORMULAS_CHECK_POS, $list10);
        inference_modules.inference_removal_module($REMOVAL_OPERATOR_FORMULAS_CHECK_NEG, $list12);
        inference_modules.inference_removal_module($REMOVAL_OPERATOR_FORMULAS_UNIFY, $list14);
        inference_modules.register_solely_specific_removal_module_predicate($$argN);
        preference_modules.doomed_unless_arg_bindable($POS, $$argN, THREE_INTEGER);
        declare_defglobal($argn_defining_mt$);
        mt_vars.note_mt_var($argn_defining_mt$, $$argN);
        inference_modules.inference_removal_module($REMOVAL_ARG_N_CHECK_POS, $list19);
        inference_modules.inference_removal_module($REMOVAL_ARG_N_CHECK_NEG, $list21);
        inference_modules.inference_removal_module($REMOVAL_ARG_N_UNIFY_ARG1, $list23);
        inference_modules.inference_removal_module($REMOVAL_ARG_N_UNIFY_ARG2, $list25);
        inference_modules.inference_removal_module($REMOVAL_ARG_N_ITERATE, $list27);
        inference_modules.register_solely_specific_removal_module_predicate($$formulaArity);
        preference_modules.doomed_unless_arg_bindable($POS, $$formulaArity, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$formulaArity);
        declare_defglobal($formula_arity_defining_mt$);
        mt_vars.note_mt_var($formula_arity_defining_mt$, $$formulaArity);
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
        declare_defglobal($cycl_for_subl_defining_mt$);
        mt_vars.note_mt_var($cycl_for_subl_defining_mt$, $$cycLForSubL);
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

































































    }
}

/**
 * Total time: 278 ms
 */
