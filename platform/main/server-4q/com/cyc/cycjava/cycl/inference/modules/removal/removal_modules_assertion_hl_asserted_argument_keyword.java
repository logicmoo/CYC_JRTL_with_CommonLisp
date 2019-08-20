package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_assertion_hl_asserted_argument_keyword extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "edee9dfa29f4050f2566e2b05414ac0817cad25cf66391acf6dbf9c5fe1fb7b4";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-hl-asserted-argument-keyword.lisp", position = 1700L)
    private static SubLSymbol $default_assertion_hl_asserted_argument_keyword_check_cost$;
    private static SubLObject $$assertionHLAssertedArgumentKeywor;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLObject $$ExpandSubLFn;
    private static SubLObject $$subLIdentifier;
    private static SubLSymbol $REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_POS;
    private static SubLList $list6;
    private static SubLSymbol $REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_NEG;
    private static SubLList $list8;
    private static SubLSymbol $REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_UNIFY;
    private static SubLList $list10;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-hl-asserted-argument-keyword.lisp", position = 900L)
    public static SubLObject assertion_keyword_terms(SubLObject assertion) {
        SubLObject argument_list = assertions_high.assertion_arguments(assertion);
        SubLObject keyword_term_list = NIL;
        SubLObject cdolist_list_var = argument_list;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != arguments.asserted_argument_p(arg)) {
                SubLObject expand_subl_misc_asses = kb_mapping.gather_other_index($$ExpandSubLFn);
                SubLObject keyword_func = NIL;
                SubLObject keyword_term = NIL;
                SubLObject keyword_inside_func = NIL;
                SubLObject cdolist_list_var_$1 = expand_subl_misc_asses;
                SubLObject ass = NIL;
                ass = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if (cycl_utilities.formula_operator(ass).eql($$subLIdentifier)) {
                        keyword_func = cycl_utilities.formula_arg2(ass, UNPROVIDED);
                        keyword_inside_func = cycl_utilities.formula_arg2(keyword_func, UNPROVIDED);
                        if (keyword_inside_func.eql(arg)) {
                            keyword_term = cycl_utilities.formula_arg1(ass, UNPROVIDED);
                            keyword_term_list = cons(keyword_term, keyword_term_list);
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
        declareFunction("assertion_keyword_terms", "ASSERTION-KEYWORD-TERMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_assertion_hl_asserted_argument_keyword_file() {
        $default_assertion_hl_asserted_argument_keyword_check_cost$ = defparameter("*DEFAULT-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_assertion_hl_asserted_argument_keyword_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$assertionHLAssertedArgumentKeywor);
        preference_modules.doomed_unless_arg_bindable($POS, $$assertionHLAssertedArgumentKeywor, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$assertionHLAssertedArgumentKeywor);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_POS, $list6);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_NEG, $list8);
        inference_modules.inference_removal_module($REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_UNIFY, $list10);
        return NIL;
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
        me = new removal_modules_assertion_hl_asserted_argument_keyword();
        $default_assertion_hl_asserted_argument_keyword_check_cost$ = null;
        $$assertionHLAssertedArgumentKeywor = makeConstSym(("assertionHLAssertedArgumentKeyword"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $$ExpandSubLFn = makeConstSym(("ExpandSubLFn"));
        $$subLIdentifier = makeConstSym(("subLIdentifier"));
        $REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_POS = makeKeyword("REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-POS");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionHLAssertedArgumentKeyword")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertionHLAssertedArgumentKeyword")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionHLAssertedArgumentKeyword")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("KEYWORD"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("KEYWORD")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("KEYWORD")), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("KEYWORD")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$assertionHLAssertedArgumentKeyword <assertion> <fully-bound-p>)"), makeKeyword("EXAMPLE"),
                makeString("(#$assertionHLAssertedArgumentKeyword  \n     (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     #$AssertedTrueMonotonic)") });
        $REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_NEG = makeKeyword("REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-NEG");
        $list8 = list(new SubLObject[] {
                makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("assertionHLAssertedArgumentKeyword")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("assertionHLAssertedArgumentKeyword")), makeKeyword("ASSERTION"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("assertionHLAssertedArgumentKeyword")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("BIND"), makeSymbol("KEYWORD"))), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("KEYWORD")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("ASSERTION"), makeSymbol("KEYWORD")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD?"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("KEYWORD"))))),
                makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertionHLAssertedArgumentKeyword <assertion> <fully-bound-p>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not #$assertionHLAssertedArgumentKeyword\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n      #$AssertedTrueMonotonic)") });
        $REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_UNIFY = makeKeyword("REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-UNIFY");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("assertionHLAssertedArgumentKeyword")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("assertionHLAssertedArgumentKeyword")), makeKeyword("ASSERTION"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("assertionHLAssertedArgumentKeyword")), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("ASSERTION-ARGUMENT-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("assertionHLAssertedArgumentKeyword")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("INPUT")),
                makeKeyword("DOCUMENTATION"), makeString("(#$assertionHLAssertedArgumentKeyword <assertion> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$assertionHLAssertedArgumentKeyword\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing))\n      ?KEYWORD)") });
    }
}
/*
 *
 * Total time: 81 ms
 *
 */