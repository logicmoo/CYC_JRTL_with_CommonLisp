package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_assertion_arguments extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments";
    public static final String myFingerPrint = "7b1642bca02fe06f05beab0d0426d61085fe3e418da3c597aad8eafadd818ff8";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 3076L)
    private static SubLSymbol $default_assertion_arguments_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 5143L)
    private static SubLSymbol $average_assertion_argument_count$;
    private static final SubLObject $const0$assertionArguments;
    private static final SubLObject $const1$CycDeductionDatastructureFn;
    private static final SubLSymbol $sym2$ARGUMENT_EQUAL;
    private static final SubLObject $const3$HLAssertedArgumentKeywordDatastru;
    private static final SubLObject $const4$CycArchitectureMt;
    private static final SubLObject $const5$subLIdentifier;
    private static final SubLObject $const6$CycAPIMt;
    private static final SubLObject $const7$SubLSymbolEntityFn;
    private static final SubLObject $const8$SubLQuoteFn;
    private static final SubLSymbol $kw9$POS;
    private static final SubLSymbol $kw10$NEG;
    private static final SubLSymbol $kw11$REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG;
    private static final SubLList $list14;
    private static final SubLFloat $float15$1_1;
    private static final SubLSymbol $kw16$REMOVAL_ASSERTION_ARGUMENT_UNIFY;
    private static final SubLList $list17;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 725L)
    public static SubLObject deduction_from_term(final SubLObject v_term) {
        if (cycl_utilities.formula_operator(v_term).eql(removal_modules_assertion_arguments.$const1$CycDeductionDatastructureFn)) {
            final SubLObject deduction_term_index = cycl_utilities.formula_arg1(v_term, (SubLObject)removal_modules_assertion_arguments.UNPROVIDED);
            final SubLObject deduction = deduction_handles.find_deduction_by_id(deduction_term_index);
            return deduction;
        }
        return (SubLObject)removal_modules_assertion_arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 1075L)
    public static SubLObject assertion_deduction_termP(final SubLObject assertion, final SubLObject deduction_term) {
        if (cycl_utilities.formula_operator(deduction_term).eql(removal_modules_assertion_arguments.$const1$CycDeductionDatastructureFn)) {
            final SubLObject deduction = deduction_from_term(deduction_term);
            return conses_high.member(deduction, assertions_high.assertion_deductions(assertion), Symbols.symbol_function((SubLObject)removal_modules_assertion_arguments.$sym2$ARGUMENT_EQUAL), (SubLObject)removal_modules_assertion_arguments.UNPROVIDED);
        }
        return (SubLObject)removal_modules_assertion_arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 1456L)
    public static SubLObject assertion_hl_asserted_argument_keywordP(final SubLObject assertion, final SubLObject keyword_constant) {
        if (removal_modules_assertion_arguments.NIL != isa.isaP(keyword_constant, removal_modules_assertion_arguments.$const3$HLAssertedArgumentKeywordDatastru, removal_modules_assertion_arguments.$const4$CycArchitectureMt, (SubLObject)removal_modules_assertion_arguments.UNPROVIDED)) {
            final SubLObject keyword_link = kb_mapping_utilities.fpred_value_in_mt(keyword_constant, removal_modules_assertion_arguments.$const5$subLIdentifier, removal_modules_assertion_arguments.$const6$CycAPIMt, (SubLObject)removal_modules_assertion_arguments.UNPROVIDED, (SubLObject)removal_modules_assertion_arguments.UNPROVIDED, (SubLObject)removal_modules_assertion_arguments.UNPROVIDED);
            final SubLObject keyword = cycl_utilities.formula_arg2(keyword_link, (SubLObject)removal_modules_assertion_arguments.UNPROVIDED);
            return conses_high.member(keyword, assertions_high.assertion_arguments(assertion), (SubLObject)removal_modules_assertion_arguments.UNPROVIDED, (SubLObject)removal_modules_assertion_arguments.UNPROVIDED);
        }
        return (SubLObject)removal_modules_assertion_arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 1919L)
    public static SubLObject assertion_argument_termP(final SubLObject assertion, final SubLObject argument_term) {
        if (removal_modules_assertion_arguments.NIL != isa.isaP(argument_term, removal_modules_assertion_arguments.$const3$HLAssertedArgumentKeywordDatastru, removal_modules_assertion_arguments.$const4$CycArchitectureMt, (SubLObject)removal_modules_assertion_arguments.UNPROVIDED)) {
            return assertion_hl_asserted_argument_keywordP(assertion, argument_term);
        }
        if (cycl_utilities.formula_operator(argument_term).eql(removal_modules_assertion_arguments.$const1$CycDeductionDatastructureFn)) {
            return assertion_deduction_termP(assertion, argument_term);
        }
        return (SubLObject)removal_modules_assertion_arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-arguments.lisp", position = 2356L)
    public static SubLObject assertion_argument_terms(final SubLObject assertion) {
        final SubLObject argument_list = assertions_high.assertion_arguments(assertion);
        SubLObject argument_term_list = (SubLObject)removal_modules_assertion_arguments.NIL;
        SubLObject cdolist_list_var = argument_list;
        SubLObject arg = (SubLObject)removal_modules_assertion_arguments.NIL;
        arg = cdolist_list_var.first();
        while (removal_modules_assertion_arguments.NIL != cdolist_list_var) {
            if (removal_modules_assertion_arguments.NIL != deduction_handles.deduction_p(arg)) {
                final SubLObject d_id = deduction_handles.deduction_id(arg);
                final SubLObject d_term = (SubLObject)ConsesLow.list(removal_modules_assertion_arguments.$const1$CycDeductionDatastructureFn, d_id);
                argument_term_list = (SubLObject)ConsesLow.cons(d_term, argument_term_list);
            }
            else if (removal_modules_assertion_arguments.NIL != arguments.asserted_argument_p(arg)) {
                final SubLObject asserted_arg_keyword = arg;
                final SubLObject asserted_arg_keyword_term = (SubLObject)ConsesLow.list(removal_modules_assertion_arguments.$const7$SubLSymbolEntityFn, removal_modules_assertion_arguments.$const3$HLAssertedArgumentKeywordDatastru, (SubLObject)ConsesLow.list(removal_modules_assertion_arguments.$const8$SubLQuoteFn, asserted_arg_keyword));
                argument_term_list = (SubLObject)ConsesLow.cons(asserted_arg_keyword_term, argument_term_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return argument_term_list;
    }
    
    public static SubLObject declare_removal_modules_assertion_arguments_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments", "deduction_from_term", "DEDUCTION-FROM-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments", "assertion_deduction_termP", "ASSERTION-DEDUCTION-TERM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments", "assertion_hl_asserted_argument_keywordP", "ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments", "assertion_argument_termP", "ASSERTION-ARGUMENT-TERM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_arguments", "assertion_argument_terms", "ASSERTION-ARGUMENT-TERMS", 1, 0, false);
        return (SubLObject)removal_modules_assertion_arguments.NIL;
    }
    
    public static SubLObject init_removal_modules_assertion_arguments_file() {
        removal_modules_assertion_arguments.$default_assertion_arguments_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_arguments.$average_assertion_argument_count$ = SubLFiles.deflexical("*AVERAGE-ASSERTION-ARGUMENT-COUNT*", (SubLObject)removal_modules_assertion_arguments.$float15$1_1);
        return (SubLObject)removal_modules_assertion_arguments.NIL;
    }
    
    public static SubLObject setup_removal_modules_assertion_arguments_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_arguments.$const0$assertionArguments);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_assertion_arguments.$kw9$POS, removal_modules_assertion_arguments.$const0$assertionArguments, (SubLObject)removal_modules_assertion_arguments.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_arguments.$kw10$NEG, removal_modules_assertion_arguments.$const0$assertionArguments);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_arguments.$kw11$REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS, (SubLObject)removal_modules_assertion_arguments.$list12);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_arguments.$kw13$REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG, (SubLObject)removal_modules_assertion_arguments.$list14);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_arguments.$kw16$REMOVAL_ASSERTION_ARGUMENT_UNIFY, (SubLObject)removal_modules_assertion_arguments.$list17);
        return (SubLObject)removal_modules_assertion_arguments.NIL;
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
        me = (SubLFile)new removal_modules_assertion_arguments();
        removal_modules_assertion_arguments.$default_assertion_arguments_check_cost$ = null;
        removal_modules_assertion_arguments.$average_assertion_argument_count$ = null;
        $const0$assertionArguments = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments"));
        $const1$CycDeductionDatastructureFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycDeductionDatastructureFn"));
        $sym2$ARGUMENT_EQUAL = SubLObjectFactory.makeSymbol("ARGUMENT-EQUAL");
        $const3$HLAssertedArgumentKeywordDatastru = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HLAssertedArgumentKeywordDatastructure"));
        $const4$CycArchitectureMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycArchitectureMt"));
        $const5$subLIdentifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subLIdentifier"));
        $const6$CycAPIMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycAPIMt"));
        $const7$SubLSymbolEntityFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLSymbolEntityFn"));
        $const8$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $kw9$POS = SubLObjectFactory.makeKeyword("POS");
        $kw10$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw11$REMOVAL_ASSERTION_ARGUMENTS_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ARGUMENTS-CHECK-POS");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ARGUMENT-TERM?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionArguments <assertion> <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionArguments  \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueMonotonic)") });
        $kw13$REMOVAL_ASSERTION_ARGUMENTS_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ARGUMENTS-CHECK-NEG");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-ARGUMENTS-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ARGUMENT-TERM?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionArguments <assertion> <fully-bound-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not #$assertionArguments \n     (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate)) #$AssertedTrueDefault))") });
        $float15$1_1 = (SubLFloat)SubLObjectFactory.makeDouble(1.1);
        $kw16$REMOVAL_ASSERTION_ARGUMENT_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-ARGUMENT-UNIFY");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*AVERAGE-ASSERTION-ARGUMENT-COUNT*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ARGUMENT-TERMS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionArguments")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionArguments <assertion> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionArguments\n      (#$ist #$CoreCycLMt (#$genls #$BinaryPredicate #$Predicate))\n      ?ARG)") });
    }
}

/*

	Total time: 88 ms
	
*/