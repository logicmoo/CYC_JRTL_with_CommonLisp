/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
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


public final class removal_modules_assertion_arguments extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_assertion_arguments();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_assertion_arguments_check_cost$ = makeSymbol("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*");

    // deflexical
    // The expected number of arguments for an assertion.
    /**
     * The expected number of arguments for an assertion.
     */
    @LispMethod(comment = "The expected number of arguments for an assertion.\ndeflexical")
    private static final SubLSymbol $average_assertion_argument_count$ = makeSymbol("*AVERAGE-ASSERTION-ARGUMENT-COUNT*");





    private static final SubLSymbol ARGUMENT_EQUAL = makeSymbol("ARGUMENT-EQUAL");

    private static final SubLObject $const3$HLAssertedArgumentKeywordDatastru = reader_make_constant_shell("HLAssertedArgumentKeywordDatastructure");











    private static final SubLSymbol $REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-ARGUMENTS-CHECK-POS");

    static private final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionArguments"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionArguments"), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionArguments"), list($BIND, makeSymbol("ASSERTION")), list($BIND, makeSymbol("ARGUMENT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT")), list($CALL, makeSymbol("ASSERTION-ARGUMENT-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT")))), makeKeyword("DOCUMENTATION"), makeString("(#$assertionArguments <assertion> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionArguments  \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueMonotonic)") });

    private static final SubLSymbol $REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-ARGUMENTS-CHECK-NEG");

    private static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionArguments"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionArguments"), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionArguments"), list($BIND, makeSymbol("ASSERTION")), list($BIND, makeSymbol("ARGUMENT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("ASSERTION-ARGUMENT-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT"))))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionArguments <assertion> <fully-bound-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not #$assertionArguments \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueDefault))") });

    private static final SubLFloat $float$1_1 = makeDouble(1.1);

    private static final SubLSymbol $REMOVAL_ASSERTION_ARGUMENT_UNIFY = makeKeyword("REMOVAL-ASSERTION-ARGUMENT-UNIFY");

    private static final SubLList $list17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionArguments"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionArguments"), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ASSERTION-ARGUMENT-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionArguments"), list($BIND, makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("ASSERTION-ARGUMENT-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("assertionArguments"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$assertionArguments <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionArguments\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?ARG)") });

    // Definitions
    /**
     * Return the deduction-p that corresponds to DEDUCTION-TERM, if any, else NIL.
     */
    @LispMethod(comment = "Return the deduction-p that corresponds to DEDUCTION-TERM, if any, else NIL.")
    public static final SubLObject deduction_from_term_alt(SubLObject v_term) {
        if (cycl_utilities.formula_operator(v_term) == $$CycDeductionDatastructureFn) {
            {
                SubLObject deduction_term_index = cycl_utilities.formula_arg1(v_term, UNPROVIDED);
                SubLObject deduction = deduction_handles.find_deduction_by_id(deduction_term_index);
                return deduction;
            }
        } else {
            return NIL;
        }
    }

    // Definitions
    /**
     * Return the deduction-p that corresponds to DEDUCTION-TERM, if any, else NIL.
     */
    @LispMethod(comment = "Return the deduction-p that corresponds to DEDUCTION-TERM, if any, else NIL.")
    public static SubLObject deduction_from_term(final SubLObject v_term) {
        if (cycl_utilities.formula_operator(v_term).eql($$CycDeductionDatastructureFn)) {
            final SubLObject deduction_term_index = cycl_utilities.formula_arg1(v_term, UNPROVIDED);
            final SubLObject deduction = deduction_handles.find_deduction_by_id(deduction_term_index);
            return deduction;
        }
        return NIL;
    }

    /**
     * Return T iff DEDUCTION-TERM denotes a deduction for ASSERTION.
     */
    @LispMethod(comment = "Return T iff DEDUCTION-TERM denotes a deduction for ASSERTION.")
    public static final SubLObject assertion_deduction_termP_alt(SubLObject assertion, SubLObject deduction_term) {
        if (cycl_utilities.formula_operator(deduction_term) == $$CycDeductionDatastructureFn) {
            {
                SubLObject deduction = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments.deduction_from_term(deduction_term);
                return member(deduction, assertions_high.assertion_deductions(assertion), symbol_function(ARGUMENT_EQUAL), UNPROVIDED);
            }
        } else {
            return NIL;
        }
    }

    /**
     * Return T iff DEDUCTION-TERM denotes a deduction for ASSERTION.
     */
    @LispMethod(comment = "Return T iff DEDUCTION-TERM denotes a deduction for ASSERTION.")
    public static SubLObject assertion_deduction_termP(final SubLObject assertion, final SubLObject deduction_term) {
        if (cycl_utilities.formula_operator(deduction_term).eql($$CycDeductionDatastructureFn)) {
            final SubLObject deduction = deduction_from_term(deduction_term);
            return member(deduction, assertions_high.assertion_deductions(assertion), symbol_function(ARGUMENT_EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Return T iff KEYWORD-CONSTANT denotes an argument for ASSERTION.
     */
    @LispMethod(comment = "Return T iff KEYWORD-CONSTANT denotes an argument for ASSERTION.")
    public static final SubLObject assertion_hl_asserted_argument_keywordP_alt(SubLObject assertion, SubLObject keyword_constant) {
        if (NIL != isa.isaP(keyword_constant, $const3$HLAssertedArgumentKeywordDatastru, $$CycArchitectureMt, UNPROVIDED)) {
            {
                SubLObject keyword_link = kb_mapping_utilities.fpred_value_in_mt(keyword_constant, $$subLIdentifier, $$CycAPIMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject keyword = cycl_utilities.formula_arg2(keyword_link, UNPROVIDED);
                return member(keyword, assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED);
            }
        } else {
            return NIL;
        }
    }

    /**
     * Return T iff KEYWORD-CONSTANT denotes an argument for ASSERTION.
     */
    @LispMethod(comment = "Return T iff KEYWORD-CONSTANT denotes an argument for ASSERTION.")
    public static SubLObject assertion_hl_asserted_argument_keywordP(final SubLObject assertion, final SubLObject keyword_constant) {
        if (NIL != isa.isaP(keyword_constant, $const3$HLAssertedArgumentKeywordDatastru, $$CycArchitectureMt, UNPROVIDED)) {
            final SubLObject keyword_link = kb_mapping_utilities.fpred_value_in_mt(keyword_constant, $$subLIdentifier, $$CycAPIMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject keyword = cycl_utilities.formula_arg2(keyword_link, UNPROVIDED);
            return member(keyword, assertions_high.assertion_arguments(assertion), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionArguments"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionArguments"), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionArguments"), list($BIND, makeSymbol("ASSERTION")), list($BIND, makeSymbol("ARGUMENT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT")), list($CALL, makeSymbol("ASSERTION-ARGUMENT-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT")))), makeKeyword("DOCUMENTATION"), makeString("(#$assertionArguments <assertion> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionArguments  \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueMonotonic)") });

    /**
     * Return T iff ARGUMENT-TERM denotes an argument for ASSERTION.
     */
    @LispMethod(comment = "Return T iff ARGUMENT-TERM denotes an argument for ASSERTION.")
    public static final SubLObject assertion_argument_termP_alt(SubLObject assertion, SubLObject argument_term) {
        if (NIL != isa.isaP(argument_term, $const3$HLAssertedArgumentKeywordDatastru, $$CycArchitectureMt, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments.assertion_hl_asserted_argument_keywordP(assertion, argument_term);
        } else {
            if (cycl_utilities.formula_operator(argument_term) == $$CycDeductionDatastructureFn) {
                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments.assertion_deduction_termP(assertion, argument_term);
            }
        }
        return NIL;
    }

    /**
     * Return T iff ARGUMENT-TERM denotes an argument for ASSERTION.
     */
    @LispMethod(comment = "Return T iff ARGUMENT-TERM denotes an argument for ASSERTION.")
    public static SubLObject assertion_argument_termP(final SubLObject assertion, final SubLObject argument_term) {
        if (NIL != isa.isaP(argument_term, $const3$HLAssertedArgumentKeywordDatastru, $$CycArchitectureMt, UNPROVIDED)) {
            return assertion_hl_asserted_argument_keywordP(assertion, argument_term);
        }
        if (cycl_utilities.formula_operator(argument_term).eql($$CycDeductionDatastructureFn)) {
            return assertion_deduction_termP(assertion, argument_term);
        }
        return NIL;
    }

    /**
     * Return a list of terms denoting the arguments for ASSERTION.
     */
    @LispMethod(comment = "Return a list of terms denoting the arguments for ASSERTION.")
    public static final SubLObject assertion_argument_terms_alt(SubLObject assertion) {
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
                } else {
                    if (NIL != arguments.asserted_argument_p(arg)) {
                        {
                            SubLObject asserted_arg_keyword = arg;
                            SubLObject asserted_arg_keyword_term = list($$SubLSymbolEntityFn, $const3$HLAssertedArgumentKeywordDatastru, list($$SubLQuoteFn, asserted_arg_keyword));
                            argument_term_list = cons(asserted_arg_keyword_term, argument_term_list);
                        }
                    }
                }
            }
            return argument_term_list;
        }
    }

    /**
     * Return a list of terms denoting the arguments for ASSERTION.
     */
    @LispMethod(comment = "Return a list of terms denoting the arguments for ASSERTION.")
    public static SubLObject assertion_argument_terms(final SubLObject assertion) {
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
            } else
                if (NIL != arguments.asserted_argument_p(arg)) {
                    final SubLObject asserted_arg_keyword = arg;
                    final SubLObject asserted_arg_keyword_term = list($$SubLSymbolEntityFn, $const3$HLAssertedArgumentKeywordDatastru, list($$SubLQuoteFn, asserted_arg_keyword));
                    argument_term_list = cons(asserted_arg_keyword_term, argument_term_list);
                }

            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return argument_term_list;
    }

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionArguments"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionArguments"), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionArguments"), list($BIND, makeSymbol("ASSERTION")), list($BIND, makeSymbol("ARGUMENT"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT")), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("ASSERTION-ARGUMENT-TERM?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ARGUMENT"))))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionArguments <assertion> <fully-bound-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not #$assertionArguments \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueDefault))") });

    public static SubLObject declare_removal_modules_assertion_arguments_file() {
        declareFunction("deduction_from_term", "DEDUCTION-FROM-TERM", 1, 0, false);
        declareFunction("assertion_deduction_termP", "ASSERTION-DEDUCTION-TERM?", 2, 0, false);
        declareFunction("assertion_hl_asserted_argument_keywordP", "ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD?", 2, 0, false);
        declareFunction("assertion_argument_termP", "ASSERTION-ARGUMENT-TERM?", 2, 0, false);
        declareFunction("assertion_argument_terms", "ASSERTION-ARGUMENT-TERMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_assertion_arguments_file() {
        defparameter("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*AVERAGE-ASSERTION-ARGUMENT-COUNT*", $float$1_1);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_assertion_arguments_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertionArguments);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS, $list_alt10);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG, $list_alt12);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENT_UNIFY, $list_alt15);
        return NIL;
    }

    public static SubLObject setup_removal_modules_assertion_arguments_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$assertionArguments);
            preference_modules.doomed_unless_arg_bindable($POS, $$assertionArguments, ONE_INTEGER);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionArguments);
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS, $list12);
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG, $list14);
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENT_UNIFY, $list17);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS, $list_alt10);
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG, $list_alt12);
            inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENT_UNIFY, $list_alt15);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_assertion_arguments_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertionArguments);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionArguments, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionArguments);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS, $list12);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG, $list14);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_ARGUMENT_UNIFY, $list17);
        return NIL;
    }

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("assertionArguments"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("assertionArguments"), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ASSERTION-ARGUMENT-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("assertionArguments"), list($BIND, makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("ASSERTION-ARGUMENT-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("assertionArguments"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$assertionArguments <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionArguments\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?ARG)") });

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

    
}

/**
 * Total time: 88 ms
 */
