package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_assertion_arguments extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments";
    public static String myFingerPrint = "7b1642bca02fe06f05beab0d0426d61085fe3e418da3c597aad8eafadd818ff8";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 3000L)
    private static SubLSymbol $default_assertion_arguments_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 5100L)
    private static SubLSymbol $average_assertion_argument_count$;
    private static SubLObject $$assertionArguments;
    private static SubLObject $$CycDeductionDatastructureFn;
    private static SubLSymbol $sym2$ARGUMENT_EQUAL;
    private static SubLObject $$HLAssertedArgumentKeywordDatastru;
    private static SubLObject $$CycArchitectureMt;
    private static SubLObject $$subLIdentifier;
    private static SubLObject $$CycAPIMt;
    private static SubLObject $$SubLSymbolEntityFn;
    private static SubLObject $$SubLQuoteFn;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS;
    private static SubLList $list12;
    private static SubLSymbol $REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG;
    private static SubLList $list14;
    private static SubLFloat $float$1_1;
    private static SubLSymbol $REMOVAL_ASSERTION_ARGUMENT_UNIFY;
    private static SubLList $list17;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 700L)
    public static SubLObject deduction_from_term(SubLObject v_term) {
        if (cycl_utilities.formula_operator(v_term).eql($$CycDeductionDatastructureFn)) {
            SubLObject deduction_term_index = cycl_utilities.formula_arg1(v_term, UNPROVIDED);
            SubLObject deduction = deduction_handles.find_deduction_by_id(deduction_term_index);
            return deduction;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 1000L)
    public static SubLObject assertion_deduction_termP(SubLObject assertion, SubLObject deduction_term) {
        if (cycl_utilities.formula_operator(deduction_term).eql($$CycDeductionDatastructureFn)) {
            SubLObject deduction = deduction_from_term(deduction_term);
            return conses_high.member(deduction, assertions_high.assertion_deductions(assertion), Symbols.symbol_function($sym2$ARGUMENT_EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 1400L)
    public static SubLObject assertion_hl_asserted_argument_keywordP(SubLObject assertion, SubLObject keyword_constant) {
        if (NIL != isa.isaP(keyword_constant, $$HLAssertedArgumentKeywordDatastru, $$CycArchitectureMt, UNPROVIDED)) {
            SubLObject keyword_link = kb_mapping_utilities.fpred_value_in_mt(keyword_constant, $$subLIdentifier, $$CycAPIMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject keyword = cycl_utilities.formula_arg2(keyword_link, UNPROVIDED);
            return conses_high.member(keyword, assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 1900L)
    public static SubLObject assertion_argument_termP(SubLObject assertion, SubLObject argument_term) {
        if (NIL != isa.isaP(argument_term, $$HLAssertedArgumentKeywordDatastru, $$CycArchitectureMt, UNPROVIDED)) {
            return assertion_hl_asserted_argument_keywordP(assertion, argument_term);
        }
        if (cycl_utilities.formula_operator(argument_term).eql($$CycDeductionDatastructureFn)) {
            return assertion_deduction_termP(assertion, argument_term);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 2300L)
    public static SubLObject assertion_argument_terms(SubLObject assertion) {
        SubLObject argument_list = assertions_high.assertion_arguments(assertion);
        SubLObject argument_term_list = NIL;
        SubLObject cdolist_list_var = argument_list;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != deduction_handles.deduction_p(arg)) {
                SubLObject d_id = deduction_handles.deduction_id(arg);
                SubLObject d_term = list($$CycDeductionDatastructureFn, d_id);
                argument_term_list = cons(d_term, argument_term_list);
            } else if (NIL != arguments.asserted_argument_p(arg)) {
                SubLObject asserted_arg_keyword = arg;
                SubLObject asserted_arg_keyword_term = list($$SubLSymbolEntityFn, $$HLAssertedArgumentKeywordDatastru, list($$SubLQuoteFn, asserted_arg_keyword));
                argument_term_list = cons(asserted_arg_keyword_term, argument_term_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return argument_term_list;
    }

    public static SubLObject declare_removal_modules_assertion_arguments_file() {
        declareFunction(myName, "deduction_from_term", "DEDUCTION-FROM-TERM", 1, 0, false);
        declareFunction(myName, "assertion_deduction_termP", "ASSERTION-DEDUCTION-TERM?", 2, 0, false);
        declareFunction(myName, "assertion_hl_asserted_argument_keywordP", "ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD?", 2, 0, false);
        declareFunction(myName, "assertion_argument_termP", "ASSERTION-ARGUMENT-TERM?", 2, 0, false);
        declareFunction(myName, "assertion_argument_terms", "ASSERTION-ARGUMENT-TERMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_assertion_arguments_file() {
        $default_assertion_arguments_check_cost$ = defparameter("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $average_assertion_argument_count$ = deflexical("*AVERAGE-ASSERTION-ARGUMENT-COUNT*", $float$1_1);
        return NIL;
    }

    public static SubLObject setup_removal_modules_assertion_arguments_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertionArguments);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionArguments, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionArguments);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS, $list12);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG, $list14);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENT_UNIFY, $list17);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_assertion_arguments_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_assertion_arguments_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_assertion_arguments_file();
    }

    static {
        me = new removal_modules_assertion_arguments();
        $default_assertion_arguments_check_cost$ = null;
        $average_assertion_argument_count$ = null;
        $$assertionArguments = makeConstSym(("assertionArguments"));
        $$CycDeductionDatastructureFn = makeConstSym(("CycDeductionDatastructureFn"));
        $sym2$ARGUMENT_EQUAL = makeSymbol("ARGUMENT-EQUAL");
        $$HLAssertedArgumentKeywordDatastru = makeConstSym(("HLAssertedArgumentKeywordDatastructure"));
        $$CycArchitectureMt = makeConstSym(("CycArchitectureMt"));
        $$subLIdentifier = makeConstSym(("subLIdentifier"));
        $$CycAPIMt = makeConstSym(("CycAPIMt"));
        $$SubLSymbolEntityFn = makeConstSym(("SubLSymbolEntityFn"));
        $$SubLQuoteFn = makeConstSym(("SubLQuoteFn"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ARGUMENTS-CHECK-POS");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionArguments")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionArguments")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionArguments")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("ARGUMENT"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ARGUMENT-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT")))), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertionArguments <assertion> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionArguments  \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueMonotonic)") });
        $REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ARGUMENTS-CHECK-NEG");
        $list14 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionArguments")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionArguments")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("assertionArguments")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("ARGUMENT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-ARGUMENT-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT"))))),
                makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionArguments <assertion> <fully-bound-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not #$assertionArguments \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueDefault))") });
        $float$1_1 = makeDouble(1.1);
        $REMOVAL_ASSERTION_ARGUMENT_UNIFY = makeKeyword("REMOVAL-ASSERTION-ARGUMENT-UNIFY");
        $list17 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionArguments")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionArguments")), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ASSERTION-ARGUMENT-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionArguments")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ASSERTION-ARGUMENT-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionArguments")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertionArguments <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionArguments\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?ARG)") });
    }
}
/*
 *
 * Total time: 88 ms
 *
 */