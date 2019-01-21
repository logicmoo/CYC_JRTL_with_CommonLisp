package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_assertion_hl_asserted_argument_keyword extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_hl_asserted_argument_keyword";
    public static final String myFingerPrint = "edee9dfa29f4050f2566e2b05414ac0817cad25cf66391acf6dbf9c5fe1fb7b4";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-hl-asserted-argument-keyword.lisp", position = 1749L)
    private static SubLSymbol $default_assertion_hl_asserted_argument_keyword_check_cost$;
    private static final SubLObject $const0$assertionHLAssertedArgumentKeywor;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLObject $const3$ExpandSubLFn;
    private static final SubLObject $const4$subLIdentifier;
    private static final SubLSymbol $kw5$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_POS;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_NEG;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_UNIFY;
    private static final SubLList $list10;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-hl-asserted-argument-keyword.lisp", position = 923L)
    public static SubLObject assertion_keyword_terms(final SubLObject assertion) {
        final SubLObject argument_list = assertions_high.assertion_arguments(assertion);
        SubLObject keyword_term_list = (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.NIL;
        SubLObject cdolist_list_var = argument_list;
        SubLObject arg = (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.NIL;
        arg = cdolist_list_var.first();
        while (removal_modules_assertion_hl_asserted_argument_keyword.NIL != cdolist_list_var) {
            if (removal_modules_assertion_hl_asserted_argument_keyword.NIL != arguments.asserted_argument_p(arg)) {
                final SubLObject expand_subl_misc_asses = kb_mapping.gather_other_index(removal_modules_assertion_hl_asserted_argument_keyword.$const3$ExpandSubLFn);
                SubLObject keyword_func = (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.NIL;
                SubLObject keyword_term = (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.NIL;
                SubLObject keyword_inside_func = (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.NIL;
                SubLObject cdolist_list_var_$1 = expand_subl_misc_asses;
                SubLObject ass = (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.NIL;
                ass = cdolist_list_var_$1.first();
                while (removal_modules_assertion_hl_asserted_argument_keyword.NIL != cdolist_list_var_$1) {
                    if (cycl_utilities.formula_operator(ass).eql(removal_modules_assertion_hl_asserted_argument_keyword.$const4$subLIdentifier)) {
                        keyword_func = cycl_utilities.formula_arg2(ass, (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.UNPROVIDED);
                        keyword_inside_func = cycl_utilities.formula_arg2(keyword_func, (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.UNPROVIDED);
                        if (keyword_inside_func.eql(arg)) {
                            keyword_term = cycl_utilities.formula_arg1(ass, (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.UNPROVIDED);
                            keyword_term_list = (SubLObject)ConsesLow.cons(keyword_term, keyword_term_list);
                        }
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    ass = cdolist_list_var_$1.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return keyword_term_list;
    }
    
    public static SubLObject declare_removal_modules_assertion_hl_asserted_argument_keyword_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_hl_asserted_argument_keyword", "assertion_keyword_terms", "ASSERTION-KEYWORD-TERMS", 1, 0, false);
        return (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.NIL;
    }
    
    public static SubLObject init_removal_modules_assertion_hl_asserted_argument_keyword_file() {
        removal_modules_assertion_hl_asserted_argument_keyword.$default_assertion_hl_asserted_argument_keyword_check_cost$ = SubLFiles.defparameter("*DEFAULT-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        return (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.NIL;
    }
    
    public static SubLObject setup_removal_modules_assertion_hl_asserted_argument_keyword_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_assertion_hl_asserted_argument_keyword.$const0$assertionHLAssertedArgumentKeywor);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.$kw1$POS, removal_modules_assertion_hl_asserted_argument_keyword.$const0$assertionHLAssertedArgumentKeywor, (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.$kw2$NEG, removal_modules_assertion_hl_asserted_argument_keyword.$const0$assertionHLAssertedArgumentKeywor);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.$kw5$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_POS, (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.$list6);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.$kw7$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_NEG, (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.$list8);
        inference_modules.inference_removal_module((SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.$kw9$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_UNIFY, (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.$list10);
        return (SubLObject)removal_modules_assertion_hl_asserted_argument_keyword.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_assertion_hl_asserted_argument_keyword_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_assertion_hl_asserted_argument_keyword_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_assertion_hl_asserted_argument_keyword_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_assertion_hl_asserted_argument_keyword();
        removal_modules_assertion_hl_asserted_argument_keyword.$default_assertion_hl_asserted_argument_keyword_check_cost$ = null;
        $const0$assertionHLAssertedArgumentKeywor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $const3$ExpandSubLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $const4$subLIdentifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subLIdentifier"));
        $kw5$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-POS");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionHLAssertedArgumentKeyword <assertion> <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionHLAssertedArgumentKeyword  \n     (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     #$AssertedTrueMonotonic)") });
        $kw7$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-NEG");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertionHLAssertedArgumentKeyword <assertion> <fully-bound-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not #$assertionHLAssertedArgumentKeyword\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n      #$AssertedTrueMonotonic)") });
        $kw9$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-UNIFY");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_assertion_hl_asserted_argument_keyword.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ARGUMENT-TERMS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionHLAssertedArgumentKeyword")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertionHLAssertedArgumentKeyword <assertion> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertionHLAssertedArgumentKeyword\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing))\n      ?KEYWORD)") });
    }
}

/*

	Total time: 81 ms
	
*/