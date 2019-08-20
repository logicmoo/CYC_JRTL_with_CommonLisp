/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_assertion_deductions extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_assertion_deductions();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_assertion_deductions_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*");

    // deflexical
    // The expected number of deductions for an assertion.
    /**
     * The expected number of deductions for an assertion.
     */
    @LispMethod(comment = "The expected number of deductions for an assertion.\ndeflexical")
    private static final SubLSymbol $average_assertion_deduction_count$ = makeSymbol("*AVERAGE-ASSERTION-DEDUCTION-COUNT*");





    private static final SubLSymbol $REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-DEDUCTIONS-CHECK-POS");

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionDeductions"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionDeductions"), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionDeductions"), list($BIND, makeSymbol("ASSERTION")), list($BIND, makeSymbol("DEDUCTION"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("DEDUCTION")), list($CALL, makeSymbol("ASSERTION-DEDUCTION-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION")))), makeKeyword("DOCUMENTATION"), makeString("(#$assertionDeductions <assertion> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionDeductions  \n     (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     (#$CycDeductionDatastructureFn 403530))") });

    private static final SubLSymbol $REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-DEDUCTIONS-CHECK-NEG");

    private static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionDeductions"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionDeductions"), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionDeductions"), list($BIND, makeSymbol("ASSERTION")), list($BIND, makeSymbol("DEDUCTION"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("DEDUCTION")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("ASSERTION-DEDUCTION-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION"))))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionDeductions <assertion> <fully-bound-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not #$assertionDeductions\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     (#$CycDeductionDatastructureFn 403530))") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionDeductions"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionDeductions"), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionDeductions"), list($BIND, makeSymbol("ASSERTION")), list($BIND, makeSymbol("DEDUCTION"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("DEDUCTION")), list($CALL, makeSymbol("ASSERTION-DEDUCTION-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION")))), makeKeyword("DOCUMENTATION"), makeString("(#$assertionDeductions <assertion> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionDeductions  \n     (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     (#$CycDeductionDatastructureFn 403530))") });

    private static final SubLFloat $float$0_3 = makeDouble(0.3);

    private static final SubLSymbol $REMOVAL_ASSERTION_DEDUCTION_UNIFY = makeKeyword("REMOVAL-ASSERTION-DEDUCTION-UNIFY");

    private static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionDeductions"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionDeductions"), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ASSERTION-DEDUCTION-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionDeductions"), list($BIND, makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("ASSERTION-DEDUCTION-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("assertionDeductions"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$assertionDeductions <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionDeductions\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing))\n      ?DED)") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionDeductions"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionDeductions"), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionDeductions"), list($BIND, makeSymbol("ASSERTION")), list($BIND, makeSymbol("DEDUCTION"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("DEDUCTION")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("ASSERTION-DEDUCTION-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION"))))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionDeductions <assertion> <fully-bound-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not #$assertionDeductions\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     (#$CycDeductionDatastructureFn 403530))") });

    // Definitions
    /**
     * Return a list of terms denoting the deductions for ASSERTION.
     */
    @LispMethod(comment = "Return a list of terms denoting the deductions for ASSERTION.")
    public static final SubLObject assertion_deduction_terms_alt(SubLObject assertion) {
        {
            SubLObject argument_list = assertions_high.assertion_arguments(assertion);
            SubLObject argument_term_list = NIL;
            SubLObject cdolist_list_var = argument_list;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (NIL != deduction_handles.deduction_p(arg)) {
                    {
                        SubLObject d_id = deduction_handles.deduction_id(arg);
                        SubLObject d_term = list($$CycDeductionDatastructureFn, d_id);
                        argument_term_list = cons(d_term, argument_term_list);
                    }
                }
            }
            return argument_term_list;
        }
    }

    // Definitions
    /**
     * Return a list of terms denoting the deductions for ASSERTION.
     */
    @LispMethod(comment = "Return a list of terms denoting the deductions for ASSERTION.")
    public static SubLObject assertion_deduction_terms(final SubLObject assertion) {
        final SubLObject argument_list = assertions_high.assertion_arguments(assertion);
        SubLObject argument_term_list = NIL;
        SubLObject cdolist_list_var = argument_list;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != deduction_handles.deduction_p(arg)) {
                final SubLObject d_id = deduction_handles.deduction_id(arg);
                final SubLObject d_term = list($$CycDeductionDatastructureFn, d_id);
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
        defparameter("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*AVERAGE-ASSERTION-DEDUCTION-COUNT*", $float$0_3);
        return NIL;
    }

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionDeductions"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionDeductions"), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ASSERTION-DEDUCTION-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionDeductions"), list($BIND, makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("ASSERTION-DEDUCTION-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("assertionDeductions"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$assertionDeductions <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionDeductions\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing))\n      ?DED)") });

    public static final SubLObject setup_removal_modules_assertion_deductions_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertionDeductions);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS, $list_alt3);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG, $list_alt5);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTION_UNIFY, $list_alt8);
        return NIL;
    }

    public static SubLObject setup_removal_modules_assertion_deductions_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$assertionDeductions);
            preference_modules.doomed_unless_arg_bindable($POS, $$assertionDeductions, ONE_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionDeductions);
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS, $list5);
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG, $list7);
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTION_UNIFY, $list10);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS, $list_alt3);
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG, $list_alt5);
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_DEDUCTION_UNIFY, $list_alt8);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_assertion_deductions_file_Previous() {
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
    }
}

/**
 * Total time: 83 ms
 */
