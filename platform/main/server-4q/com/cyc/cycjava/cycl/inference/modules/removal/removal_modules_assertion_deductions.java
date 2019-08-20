package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_assertion_deductions extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "03c499ba240103d689589f8e1d1b4ac7dce1aee28fe6aa62c83840ac71f6620d";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-deductions.lisp", position = 1200L)
    private static SubLSymbol $default_assertion_deductions_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-deductions.lisp", position = 3200L)
    private static SubLSymbol $average_assertion_deduction_count$;
    private static SubLObject $$assertionDeductions;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLObject $$CycDeductionDatastructureFn;
    private static SubLSymbol $REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS;
    private static SubLList $list5;
    private static SubLSymbol $REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG;
    private static SubLList $list7;
    private static SubLFloat $float$0_3;
    private static SubLSymbol $REMOVAL_ASSERTION_DEDUCTION_UNIFY;
    private static SubLList $list10;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-deductions.lisp", position = 800L)
    public static SubLObject assertion_deduction_terms(SubLObject assertion) {
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
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return argument_term_list;
    }

    public static SubLObject declare_removal_modules_assertion_deductions_file() {
        declareFunction("assertion_deduction_terms", "ASSERTION-DEDUCTION-TERMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_assertion_deductions_file() {
        $default_assertion_deductions_check_cost$ = defparameter("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $average_assertion_deduction_count$ = deflexical("*AVERAGE-ASSERTION-DEDUCTION-COUNT*", $float$0_3);
        return NIL;
    }

    public static SubLObject setup_removal_modules_assertion_deductions_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertionDeductions);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionDeductions, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionDeductions);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS, $list5);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG, $list7);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTION_UNIFY, $list10);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_assertion_deductions_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_assertion_deductions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_assertion_deductions_file();
    }

    static {
        me = new removal_modules_assertion_deductions();
        $default_assertion_deductions_check_cost$ = null;
        $average_assertion_deduction_count$ = null;
        $$assertionDeductions = makeConstSym(("assertionDeductions"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $$CycDeductionDatastructureFn = makeConstSym(("CycDeductionDatastructureFn"));
        $REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-DEDUCTIONS-CHECK-POS");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionDeductions")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionDeductions")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionDeductions")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("DEDUCTION"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("DEDUCTION")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-DEDUCTION-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$assertionDeductions <assertion> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionDeductions  \n     (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     (#$CycDeductionDatastructureFn 403530))") });
        $REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-DEDUCTIONS-CHECK-NEG");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionDeductions")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionDeductions")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("assertionDeductions")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("DEDUCTION"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("DEDUCTION")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-DEDUCTION-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION"))))),
                makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionDeductions <assertion> <fully-bound-p>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not #$assertionDeductions\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     (#$CycDeductionDatastructureFn 403530))") });
        $float$0_3 = makeDouble(0.3);
        $REMOVAL_ASSERTION_DEDUCTION_UNIFY = makeKeyword("REMOVAL-ASSERTION-DEDUCTION-UNIFY");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionDeductions")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionDeductions")), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ASSERTION-DEDUCTION-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionDeductions")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ASSERTION-DEDUCTION-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionDeductions")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"),
                makeString("(#$assertionDeductions <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionDeductions\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing))\n      ?DED)") });
    }
}
/*
 *
 * Total time: 83 ms
 *
 */