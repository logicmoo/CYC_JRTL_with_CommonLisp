package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_negation_processor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_negation_processor";
    public static final String myFingerPrint = "22915467765c01f09c0541a44b60980eff258244fab30b2024e7e5d37d4a4369";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 1835L)
    private static SubLSymbol $negproc_microseconds$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 3393L)
    private static SubLSymbol $negproc_macros$;
    private static final SubLObject $const0$NegationProcessorRLModule;
    private static final SubLList $list1;
    private static final SubLInteger $int2$250;
    private static final SubLObject $const3$NLNegFn;
    private static final SubLList $list4;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 1884L)
    public static SubLObject negproc_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_negation_processor.$negproc_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 2344L)
    public static SubLObject negproc_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_negation_processor.NIL == clauses.clauses_p(expression) && reformulator_module_negation_processor.NIL != el_utilities.el_formula_p(expression) && reformulator_module_negation_processor.NIL != el_utilities.formula_arityE(expression, (SubLObject)reformulator_module_negation_processor.TWO_INTEGER, (SubLObject)reformulator_module_negation_processor.UNPROVIDED) && reformulator_module_negation_processor.$const3$NLNegFn.eql(cycl_utilities.formula_operator(expression)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 2697L)
    public static SubLObject negproc_expression_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLObject scope = cycl_utilities.formula_arg2(expression, (SubLObject)reformulator_module_negation_processor.UNPROVIDED);
        final SubLObject rmp = (SubLObject)((reformulator_module_negation_processor.NIL != el_utilities.el_formula_p(scope)) ? cycl_utilities.formula_operator(scope) : reformulator_module_negation_processor.NIL);
        final SubLObject new_rmp = find_negproc_macro(rmp);
        final SubLObject new_scope = (reformulator_module_negation_processor.NIL != new_rmp) ? cycl_utilities.expression_subst(new_rmp, rmp, scope, (SubLObject)reformulator_module_negation_processor.UNPROVIDED, (SubLObject)reformulator_module_negation_processor.UNPROVIDED) : scope;
        return Values.values(el_utilities.make_negation(new_scope), (SubLObject)reformulator_module_negation_processor.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 3594L)
    public static SubLObject find_negproc_macro(final SubLObject rule_macro_pred) {
        return conses_high.second(conses_high.assoc(rule_macro_pred, reformulator_module_negation_processor.$negproc_macros$.getGlobalValue(), (SubLObject)reformulator_module_negation_processor.UNPROVIDED, (SubLObject)reformulator_module_negation_processor.UNPROVIDED));
    }
    
    public static SubLObject declare_reformulator_module_negation_processor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_negation_processor", "negproc_cost_estimate", "NEGPROC-COST-ESTIMATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_negation_processor", "negproc_expression_required", "NEGPROC-EXPRESSION-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_negation_processor", "negproc_expression_reformulate", "NEGPROC-EXPRESSION-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_negation_processor", "find_negproc_macro", "FIND-NEGPROC-MACRO", 1, 0, false);
        return (SubLObject)reformulator_module_negation_processor.NIL;
    }
    
    public static SubLObject init_reformulator_module_negation_processor_file() {
        reformulator_module_negation_processor.$negproc_microseconds$ = SubLFiles.deflexical("*NEGPROC-MICROSECONDS*", (SubLObject)reformulator_module_negation_processor.$int2$250);
        reformulator_module_negation_processor.$negproc_macros$ = SubLFiles.deflexical("*NEGPROC-MACROS*", (SubLObject)reformulator_module_negation_processor.$list4);
        return (SubLObject)reformulator_module_negation_processor.NIL;
    }
    
    public static SubLObject setup_reformulator_module_negation_processor_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_negation_processor.$const0$NegationProcessorRLModule, (SubLObject)reformulator_module_negation_processor.$list1);
        return (SubLObject)reformulator_module_negation_processor.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_reformulator_module_negation_processor_file();
    }
    
    @Override
	public void initializeVariables() {
        init_reformulator_module_negation_processor_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_reformulator_module_negation_processor_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_negation_processor();
        reformulator_module_negation_processor.$negproc_microseconds$ = null;
        reformulator_module_negation_processor.$negproc_macros$ = null;
        $const0$NegationProcessorRLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NegationProcessorRLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("NEGPROC-EXPRESSION-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("NEGPROC-COST-ESTIMATE"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("NEGPROC-EXPRESSION-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Transforms intermediate vocabulary negations into legitimate #$not"), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$NLNegFn #$NotVP-NLAttr \n     (#$relationAllExists #$catalyst #$DeoxyribonucleotideBonding #$RNAPolymerase))"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$not \n     (#$relationExistsExists #$catalyst #$DeoxyribonucleotideBonding #$RNAPolymerase))") });
        $int2$250 = SubLObjectFactory.makeInteger(250);
        $const3$NLNegFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNegFn"));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsExists"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllAll")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsExists"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllAll"))));
    }
}

/*

	Total time: 18 ms
	
*/