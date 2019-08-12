/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_module_negation_processor extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new reformulator_module_negation_processor();

 public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_negation_processor";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $negproc_microseconds$ = makeSymbol("*NEGPROC-MICROSECONDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $negproc_macros$ = makeSymbol("*NEGPROC-MACROS*");



    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("NEGPROC-EXPRESSION-REQUIRED"), $COST, makeSymbol("NEGPROC-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("NEGPROC-EXPRESSION-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Transforms intermediate vocabulary negations into legitimate #$not"), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$NLNegFn #$NotVP-NLAttr \n     (#$relationAllExists #$catalyst #$DeoxyribonucleotideBonding #$RNAPolymerase))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$not \n     (#$relationExistsExists #$catalyst #$DeoxyribonucleotideBonding #$RNAPolymerase))") });

    private static final SubLInteger $int$250 = makeInteger(250);



    static private final SubLList $list4 = list(list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("relationExistsExists")), list(reader_make_constant_shell("relationAllAll"), reader_make_constant_shell("relationExistsExists")), list(reader_make_constant_shell("relationExistsExists"), reader_make_constant_shell("relationAllAll")));

    /**
     *
     *
     * @param expression;
     * 		EL FORM
     * @return INTEGER
    Estimates the cost of calling the Subcollection Functions RL module
    on EXPRESSION.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param expression;\r\n\t\tEL FORM\r\n@return INTEGER\r\nEstimates the cost of calling the Subcollection Functions RL module\r\non EXPRESSION.\r\n@unknown bertolo")
    public static final SubLObject negproc_cost_estimate_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        return $negproc_microseconds$.getGlobalValue();
    }

    /**
     *
     *
     * @param expression;
     * 		EL FORM
     * @return INTEGER
    Estimates the cost of calling the Subcollection Functions RL module
    on EXPRESSION.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param expression;\r\n\t\tEL FORM\r\n@return INTEGER\r\nEstimates the cost of calling the Subcollection Functions RL module\r\non EXPRESSION.\r\n@unknown bertolo")
    public static SubLObject negproc_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $negproc_microseconds$.getGlobalValue();
    }

    public static final SubLObject negproc_expression_required_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        return makeBoolean((((NIL == clauses.clauses_p(expression)) && (NIL != el_formula_p(expression))) && (NIL != formula_arityE(expression, TWO_INTEGER, UNPROVIDED))) && $$NLNegFn.eql(cycl_utilities.formula_operator(expression)));
    }

    public static SubLObject negproc_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return makeBoolean((((NIL == clauses.clauses_p(expression)) && (NIL != el_formula_p(expression))) && (NIL != formula_arityE(expression, TWO_INTEGER, UNPROVIDED))) && $$NLNegFn.eql(cycl_utilities.formula_operator(expression)));
    }

    /**
     *
     *
     * @param rl-negproc-data;
    RL-NEGPROC-DATA
     * 		
     * @return LIST
    Reassembles all the data in RL-NEGPROC-DATA into a negated EL-FORM
    with the negation in the desired scope.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-negproc-data;\nRL-NEGPROC-DATA\r\n\t\t\r\n@return LIST\r\nReassembles all the data in RL-NEGPROC-DATA into a negated EL-FORM\r\nwith the negation in the desired scope.\r\n@unknown bertolo")
    public static final SubLObject negproc_expression_reformulate_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            SubLObject scope = cycl_utilities.formula_arg2(expression, UNPROVIDED);
            SubLObject rmp = (NIL != el_formula_p(scope)) ? ((SubLObject) (cycl_utilities.formula_operator(scope))) : NIL;
            SubLObject new_rmp = com.cyc.cycjava.cycl.reformulator_module_negation_processor.find_negproc_macro(rmp);
            SubLObject new_scope = (NIL != new_rmp) ? ((SubLObject) (cycl_utilities.expression_subst(new_rmp, rmp, scope, UNPROVIDED, UNPROVIDED))) : scope;
            return values(make_negation(new_scope), T);
        }
    }

    /**
     *
     *
     * @param rl-negproc-data;
    RL-NEGPROC-DATA
     * 		
     * @return LIST
    Reassembles all the data in RL-NEGPROC-DATA into a negated EL-FORM
    with the negation in the desired scope.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param rl-negproc-data;\nRL-NEGPROC-DATA\r\n\t\t\r\n@return LIST\r\nReassembles all the data in RL-NEGPROC-DATA into a negated EL-FORM\r\nwith the negation in the desired scope.\r\n@unknown bertolo")
    public static SubLObject negproc_expression_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLObject scope = cycl_utilities.formula_arg2(expression, UNPROVIDED);
        final SubLObject rmp = (NIL != el_formula_p(scope)) ? cycl_utilities.formula_operator(scope) : NIL;
        final SubLObject new_rmp = find_negproc_macro(rmp);
        final SubLObject new_scope = (NIL != new_rmp) ? cycl_utilities.expression_subst(new_rmp, rmp, scope, UNPROVIDED, UNPROVIDED) : scope;
        return values(make_negation(new_scope), T);
    }

    public static final SubLObject find_negproc_macro_alt(SubLObject rule_macro_pred) {
        return second(assoc(rule_macro_pred, $negproc_macros$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject find_negproc_macro(final SubLObject rule_macro_pred) {
        return second(assoc(rule_macro_pred, $negproc_macros$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject declare_reformulator_module_negation_processor_file() {
        declareFunction("negproc_cost_estimate", "NEGPROC-COST-ESTIMATE", 3, 0, false);
        declareFunction("negproc_expression_required", "NEGPROC-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction("negproc_expression_reformulate", "NEGPROC-EXPRESSION-REFORMULATE", 4, 0, false);
        declareFunction("find_negproc_macro", "FIND-NEGPROC-MACRO", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_negation_processor_file() {
        deflexical("*NEGPROC-MICROSECONDS*", $int$250);
        deflexical("*NEGPROC-MACROS*", $list4);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("NEGPROC-EXPRESSION-REQUIRED"), $COST, makeSymbol("NEGPROC-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("NEGPROC-EXPRESSION-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Transforms intermediate vocabulary negations into legitimate #$not"), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$NLNegFn #$NotVP-NLAttr \n     (#$relationAllExists #$catalyst #$DeoxyribonucleotideBonding #$RNAPolymerase))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$not \n     (#$relationExistsExists #$catalyst #$DeoxyribonucleotideBonding #$RNAPolymerase))") });

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

    static {
    }

    static private final SubLList $list_alt4 = list(list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("relationExistsExists")), list(reader_make_constant_shell("relationAllAll"), reader_make_constant_shell("relationExistsExists")), list(reader_make_constant_shell("relationExistsExists"), reader_make_constant_shell("relationAllAll")));
}

/**
 * Total time: 18 ms
 */
