package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_module_negation_processor extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_module_negation_processor();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_negation_processor";

    public static final String myFingerPrint = "22915467765c01f09c0541a44b60980eff258244fab30b2024e7e5d37d4a4369";

    // deflexical
    // Definitions
    private static final SubLSymbol $negproc_microseconds$ = makeSymbol("*NEGPROC-MICROSECONDS*");

    // deflexical
    private static final SubLSymbol $negproc_macros$ = makeSymbol("*NEGPROC-MACROS*");

    private static final SubLObject $$NegationProcessorRLModule = reader_make_constant_shell(makeString("NegationProcessorRLModule"));

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("NEGPROC-EXPRESSION-REQUIRED"), makeKeyword("COST"), makeSymbol("NEGPROC-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("NEGPROC-EXPRESSION-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Transforms intermediate vocabulary negations into legitimate #$not"), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$NLNegFn #$NotVP-NLAttr \n     (#$relationAllExists #$catalyst #$DeoxyribonucleotideBonding #$RNAPolymerase))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$not \n     (#$relationExistsExists #$catalyst #$DeoxyribonucleotideBonding #$RNAPolymerase))") });

    private static final SubLInteger $int$250 = makeInteger(250);

    private static final SubLObject $$NLNegFn = reader_make_constant_shell(makeString("NLNegFn"));

    public static final SubLList $list4 = list(list(reader_make_constant_shell(makeString("relationAllExists")), reader_make_constant_shell(makeString("relationExistsExists"))), list(reader_make_constant_shell(makeString("relationAllAll")), reader_make_constant_shell(makeString("relationExistsExists"))), list(reader_make_constant_shell(makeString("relationExistsExists")), reader_make_constant_shell(makeString("relationAllAll"))));

    public static SubLObject negproc_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $negproc_microseconds$.getGlobalValue();
    }

    public static SubLObject negproc_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return makeBoolean((((NIL == clauses.clauses_p(expression)) && (NIL != el_formula_p(expression))) && (NIL != formula_arityE(expression, TWO_INTEGER, UNPROVIDED))) && $$NLNegFn.eql(cycl_utilities.formula_operator(expression)));
    }

    public static SubLObject negproc_expression_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLObject scope = cycl_utilities.formula_arg2(expression, UNPROVIDED);
        final SubLObject rmp = (NIL != el_formula_p(scope)) ? cycl_utilities.formula_operator(scope) : NIL;
        final SubLObject new_rmp = find_negproc_macro(rmp);
        final SubLObject new_scope = (NIL != new_rmp) ? cycl_utilities.expression_subst(new_rmp, rmp, scope, UNPROVIDED, UNPROVIDED) : scope;
        return values(make_negation(new_scope), T);
    }

    public static SubLObject find_negproc_macro(final SubLObject rule_macro_pred) {
        return second(assoc(rule_macro_pred, $negproc_macros$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject declare_reformulator_module_negation_processor_file() {
        declareFunction(me, "negproc_cost_estimate", "NEGPROC-COST-ESTIMATE", 3, 0, false);
        declareFunction(me, "negproc_expression_required", "NEGPROC-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction(me, "negproc_expression_reformulate", "NEGPROC-EXPRESSION-REFORMULATE", 4, 0, false);
        declareFunction(me, "find_negproc_macro", "FIND-NEGPROC-MACRO", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_negation_processor_file() {
        deflexical("*NEGPROC-MICROSECONDS*", $int$250);
        deflexical("*NEGPROC-MACROS*", $list4);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_negation_processor_file() {
        reformulator_module_harness.declare_rl_module($$NegationProcessorRLModule, $list1);
        return NIL;
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

    
}

/**
 * Total time: 18 ms
 */
