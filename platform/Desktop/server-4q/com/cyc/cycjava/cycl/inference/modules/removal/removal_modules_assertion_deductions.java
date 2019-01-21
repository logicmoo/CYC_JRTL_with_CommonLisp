package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_assertion_deductions extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_deductions";
    public static final String myFingerPrint = "03c499ba240103d689589f8e1d1b4ac7dce1aee28fe6aa62c83840ac71f6620d";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-deductions.lisp", position = 1275L)
    private static SubLSymbol $default_assertion_deductions_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-deductions.lisp", position = 3290L)
    private static SubLSymbol $average_assertion_deduction_count$;
    private static final SubLObject $const0$assertionDeductions;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLObject $const3$CycDeductionDatastructureFn;
    private static final SubLSymbol $kw4$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG;
    private static final SubLList $list7;
    private static final SubLFloat $float8$0_3;
    private static final SubLSymbol $kw9$REMOVAL_ASSERTION_DEDUCTION_UNIFY;
    private static final SubLList $list10;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-deductions.lisp", position = 848L)
    public static SubLObject assertion_deduction_terms(final SubLObject assertion) {
        final SubLObject argument_list = assertions_high.assertion_arguments(assertion);
        SubLObject argument_term_list = (SubLObject)removal_modules_assertion_deductions.NIL;
        SubLObject cdolist_list_var = argument_list;
        SubLObject arg = (SubLObject)removal_modules_assertion_deductions.NIL;
        arg = cdolist_list_var.first();
        while (removal_modules_assertion_deductions.NIL != cdolist_list_var) {
            if (removal_modules_assertion_deductions.NIL != deduction_handles.deduction_p(arg)) {
                final SubLObject d_id = deduction_handles.deduction_id(arg);
                final SubLObject d_term = (SubLObject)ConsesLow.list(removal_modules_assertion_deductions.$const3$CycDeductionDatastructureFn, d_id);
                argument_term_list = (SubLObject)ConsesLow.cons(d_term, argument_term_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return argument_term_list;
    }
    
    public static SubLObject declare_removal_modules_assertion_deductions_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_deductions", "assertion_deduction_terms", "ASSERTION-DEDUCTION-TERMS", 1, 0, false);
        return (SubLObject)removal_modules_assertion_deductions.NIL;
    }
    
    public static SubLObject init_removal_modules_assertion_deductions_file() {
        removal_modules_assertion_deductions.$default_assertion_deductions_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_assertion_deductions.$average_assertion_deduction_count$ = SubLFiles.deflexical("*AVERAGE-ASSERTION-DEDUCTION-COUNT*", (SubLObject)removal_modules_assertion_deductions.$float8$0_3);
        return (SubLObject)removal_modules_assertion_deductions.NIL;
    }
    
    public static SubLObject setup_removal_modules_assertion_deductions_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_deductions.$const0$assertionDeductions);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_assertion_deductions.$kw1$POS, removal_modules_assertion_deductions.$const0$assertionDeductions, (SubLObject)removal_modules_assertion_deductions.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_deductions.$kw2$NEG, removal_modules_assertion_deductions.$const0$assertionDeductions);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_deductions.$kw4$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS, (SubLObject)removal_modules_assertion_deductions.$list5);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_deductions.$kw6$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG, (SubLObject)removal_modules_assertion_deductions.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_deductions.$kw9$REMOVAL_ASSERTION_DEDUCTION_UNIFY, (SubLObject)removal_modules_assertion_deductions.$list10);
        return (SubLObject)removal_modules_assertion_deductions.NIL;
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
        me = (SubLFile)new removal_modules_assertion_deductions();
        removal_modules_assertion_deductions.$default_assertion_deductions_check_cost$ = null;
        removal_modules_assertion_deductions.$average_assertion_deduction_count$ = null;
        $const0$assertionDeductions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $const3$CycDeductionDatastructureFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycDeductionDatastructureFn"));
        $kw4$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-DEDUCTIONS-CHECK-POS");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-DEDUCTION-TERM?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionDeductions <assertion> <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionDeductions  \n     (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     (#$CycDeductionDatastructureFn 403530))") });
        $kw6$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-DEDUCTIONS-CHECK-NEG");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-DEDUCTION-TERM?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionDeductions <assertion> <fully-bound-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not #$assertionDeductions\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     (#$CycDeductionDatastructureFn 403530))") });
        $float8$0_3 = (SubLFloat)SubLObjectFactory.makeDouble(0.3);
        $kw9$REMOVAL_ASSERTION_DEDUCTION_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-DEDUCTION-UNIFY");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*AVERAGE-ASSERTION-DEDUCTION-COUNT*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-DEDUCTION-TERMS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDeductions")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionDeductions <assertion> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionDeductions\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing))\n      ?DED)") });
    }
}

/*

	Total time: 83 ms
	
*/