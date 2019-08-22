package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_module_query_processing extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_module_query_processing();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_query_processing";

    public static final String myFingerPrint = "f8f53045aeeafcdeaddea67cba8f502db08030efcc5dfbd12ea3b9c20c456fdb";

    // deflexical
    // Definitions
    private static final SubLSymbol $query_processing_microseconds$ = makeSymbol("*QUERY-PROCESSING-MICROSECONDS*");

    private static final SubLObject $$QueryProcessingRLModule = reader_make_constant_shell(makeString("QueryProcessingRLModule"));

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("QUERY-PROCESSING-EXPRESSION-REQUIRED"), makeKeyword("COST"), makeSymbol("QUERY-PROCESSING-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("QUERY-PROCESSING-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Reformulates #$VariableFn expressions so that queries search for bindings of the appropriate type."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$contains-Underspecified (#$VariableFn ?WHICH-THING #$DNAMolecule)\n    #$Ribose)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$and\n     (#$genls ?WHICH-THING #$DNAMolecule)\n     (#$implies\n      (#$isa ?X ?WHICH-THING)\n      (#$contains-Underspecified ?WHICH-THING #$Ribose)))") });

    private static final SubLInteger $int$1200 = makeInteger(1200);



    private static final SubLObject $$VariableFn = reader_make_constant_shell(makeString("VariableFn"));

    private static final SubLObject $$noNotableInstances = reader_make_constant_shell(makeString("noNotableInstances"));

    private static final SubLObject $$QuantityVariableFn = reader_make_constant_shell(makeString("QuantityVariableFn"));

    private static final SubLObject $$CardinalityOfFn = reader_make_constant_shell(makeString("CardinalityOfFn"));

    private static final SubLObject $$extentCardinality = reader_make_constant_shell(makeString("extentCardinality"));

    private static final SubLObject $$TheSetOf = reader_make_constant_shell(makeString("TheSetOf"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list12 = list(makeSymbol("?CARDIN"));

    public static final SubLString $str13$__QuantityVariableFn = makeString("#$QuantityVariableFn");

    private static final SubLObject $$is_Underspecified = reader_make_constant_shell(makeString("is-Underspecified"));

    public static final SubLString $str15$CardinalityOfFn__QP__1 = makeString("CardinalityOfFn (QP) 1");

    public static final SubLString $$$CardinalityOfFn_2 = makeString("CardinalityOfFn 2");

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static final SubLString $$$VariableFn_specs = makeString("VariableFn specs");

    public static final SubLString $$$VariableFn_instances = makeString("VariableFn instances");

    public static SubLObject query_processing_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $query_processing_microseconds$.getGlobalValue();
    }

    public static SubLObject query_proc_check_expression(final SubLObject expression) {
        return makeBoolean(((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first())));
    }

    public static SubLObject query_processing_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLObject asent = (NIL != query_proc_check_expression(expression)) ? clause_utilities.gaf_cnf_literal(expression.first()) : expression;
        if (NIL != el_formula_p(asent)) {
            SubLObject matchP = NIL;
            final SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = NIL, rest = args; (NIL == matchP) && (NIL != rest); rest = rest.rest()) {
                arg = rest.first();
                if (NIL != query_proc_variable_fn_expressionP(arg, mt)) {
                    matchP = T;
                }
            }
            return matchP;
        }
        return NIL;
    }

    public static SubLObject query_proc_variable_fn_expressionP(final SubLObject subexpression, final SubLObject mt) {
        return makeBoolean((((NIL != query_proc_variable_fn_expression_specsP(subexpression, mt)) || (NIL != query_proc_variable_fn_expression_instancesP(subexpression, mt))) || (NIL != query_proc_quantity_variable_fn_exprP(subexpression, mt))) || (NIL != query_proc_cardinality_of_fn_exprP(subexpression, mt)));
    }

    public static SubLObject query_proc_variable_fn_expression_specsP(final SubLObject subexpression, final SubLObject mt) {
        if ((NIL != el_formula_p(subexpression)) && (NIL != formula_arityE(subexpression, TWO_INTEGER, UNPROVIDED))) {
            final SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
            final SubLObject coll_arg = cycl_utilities.formula_arg2(subexpression, UNPROVIDED);
            if (!$$VariableFn.eql(function_expr)) {
                return NIL;
            }
            if ((NIL != fort_types_interface.isa_collectionP(coll_arg, mt)) && (NIL != list_utilities.sublisp_boolean(backward.removal_ask(list($$noNotableInstances, coll_arg), mt, UNPROVIDED, UNPROVIDED)))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject query_proc_variable_fn_expression_instancesP(final SubLObject subexpression, final SubLObject mt) {
        if ((NIL != el_formula_p(subexpression)) && (NIL != formula_arityE(subexpression, TWO_INTEGER, UNPROVIDED))) {
            final SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
            final SubLObject coll_arg = cycl_utilities.formula_arg2(subexpression, UNPROVIDED);
            if (!$$VariableFn.eql(function_expr)) {
                return NIL;
            }
            if ((NIL != fort_types_interface.isa_collectionP(coll_arg, mt)) && (NIL == list_utilities.sublisp_boolean(backward.removal_ask(list($$noNotableInstances, coll_arg), mt, UNPROVIDED, UNPROVIDED)))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject query_proc_quantity_variable_fn_exprP(final SubLObject subexpression, final SubLObject mt) {
        if ((NIL == el_formula_p(subexpression)) || (NIL == formula_arityE(subexpression, TWO_INTEGER, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
        final SubLObject coll_arg = cycl_utilities.formula_arg2(subexpression, UNPROVIDED);
        if ($$QuantityVariableFn.eql(function_expr)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject query_proc_cardinality_of_fn_exprP(final SubLObject subexpression, final SubLObject mt) {
        if ((NIL == el_formula_p(subexpression)) || (NIL == formula_arityE(subexpression, ONE_INTEGER, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
        final SubLObject coll_arg = cycl_utilities.formula_arg1(subexpression, UNPROVIDED);
        if ($$CardinalityOfFn.eql(function_expr)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject query_processing_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != query_proc_check_expression(expression)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject new_sentence = NIL;
            SubLObject justification = T;
            if (NIL != el_formula_p(asent)) {
                SubLObject argnum = ZERO_INTEGER;
                final SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                SubLObject rest;
                SubLObject arg;
                SubLObject new_sentence_$1;
                SubLObject justification_$2;
                SubLObject new_sentence_$2;
                SubLObject justification_$3;
                SubLObject new_sentence_$3;
                SubLObject justification_$4;
                SubLObject new_sentence_$4;
                SubLObject justification_$5;
                for (rest = NIL, rest = args; (NIL == new_sentence) && (NIL != rest); rest = rest.rest()) {
                    arg = rest.first();
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL != query_proc_variable_fn_expression_specsP(arg, mt)) {
                        thread.resetMultipleValues();
                        new_sentence_$1 = query_proc_variable_fn_specs_reformulate(asent, argnum, mt, settings, original_clause);
                        justification_$2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$1;
                        justification = justification_$2;
                    } else
                        if (NIL != query_proc_variable_fn_expression_instancesP(arg, mt)) {
                            thread.resetMultipleValues();
                            new_sentence_$2 = query_proc_variable_fn_instances_reformulate(asent, argnum, mt, settings, original_clause);
                            justification_$3 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$2;
                            justification = justification_$3;
                        } else
                            if (NIL != query_proc_quantity_variable_fn_exprP(arg, mt)) {
                                thread.resetMultipleValues();
                                new_sentence_$3 = query_proc_quantity_variable_fn_reformulate(asent, argnum, mt, settings, original_clause);
                                justification_$4 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                new_sentence = new_sentence_$3;
                                justification = justification_$4;
                            } else
                                if (NIL != query_proc_cardinality_of_fn_exprP(arg, mt)) {
                                    thread.resetMultipleValues();
                                    new_sentence_$4 = query_proc_cardinality_of_fn_reformulate(asent, argnum, mt, settings, original_clause);
                                    justification_$5 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    new_sentence = new_sentence_$4;
                                    justification = justification_$5;
                                }



                }
            }
            return values(list(clause_utilities.make_gaf_cnf(new_sentence)), justification);
        }
        return values(expression, NIL);
    }

    public static SubLObject query_proc_quantity_variable_fn_reformulate(final SubLObject expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLObject asent = copy_tree(expression);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject col = cycl_utilities.formula_arg2(arg, UNPROVIDED);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
        final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
        return values(list_to_elf(listS($$extentCardinality, list($$TheSetOf, new_var, list($$and, list($$isa, new_var, col), subsentence)), $list12)), list($str13$__QuantityVariableFn));
    }

    public static SubLObject query_proc_cardinality_of_fn_reformulate(final SubLObject expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLObject asent = copy_tree(expression);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject col = cycl_utilities.formula_arg1(arg, UNPROVIDED);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
        final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
        final SubLObject new_set_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent, subsentence), UNPROVIDED);
        if (((!pred.eql($$is_Underspecified)) || (!argnum.numE(ONE_INTEGER))) || (NIL == fort_types_interface.isa_collectionP(col, mt))) {
            return values(list_to_elf(list($$and, subsentence, list($$extentCardinality, list($$TheSetOf, new_set_var, list($$isa, new_set_var, col)), new_var))), list($$$CardinalityOfFn_2));
        }
        final SubLObject result = reformulator_module_quantifier_processing_3.quantproc_3_reformulate_cardinality_of_fn(asent, argnum, mt, settings, original_clause);
        if (NIL != result) {
            return values(result.first(), list($str15$CardinalityOfFn__QP__1));
        }
        return NIL;
    }

    public static SubLObject query_proc_variable_fn_specs_reformulate(final SubLObject expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(expression);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject variable_fn = unmake_binary_formula(arg);
        final SubLObject el_var = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
        final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
        return values(list_to_elf(list($$and, list($$implies, list($$isa, new_var, el_var), subsentence), list($$genls, el_var, col))), list($$$VariableFn_specs));
    }

    public static SubLObject query_proc_variable_fn_instances_reformulate(final SubLObject expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(expression);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject variable_fn = unmake_binary_formula(arg);
        final SubLObject el_var = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject subsentence = replace_formula_arg(argnum, el_var, asent);
        if (NIL != fort_types_interface.isa_predicateP(pred, mt)) {
            return values(list_to_elf(list($$and, list($$isa, el_var, col), subsentence)), list($$$VariableFn_instances));
        }
        return NIL;
    }

    public static SubLObject declare_reformulator_module_query_processing_file() {
        declareFunction(me, "query_processing_cost_estimate", "QUERY-PROCESSING-COST-ESTIMATE", 3, 0, false);
        declareFunction(me, "query_proc_check_expression", "QUERY-PROC-CHECK-EXPRESSION", 1, 0, false);
        declareFunction(me, "query_processing_expression_required", "QUERY-PROCESSING-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction(me, "query_proc_variable_fn_expressionP", "QUERY-PROC-VARIABLE-FN-EXPRESSION?", 2, 0, false);
        declareFunction(me, "query_proc_variable_fn_expression_specsP", "QUERY-PROC-VARIABLE-FN-EXPRESSION-SPECS?", 2, 0, false);
        declareFunction(me, "query_proc_variable_fn_expression_instancesP", "QUERY-PROC-VARIABLE-FN-EXPRESSION-INSTANCES?", 2, 0, false);
        declareFunction(me, "query_proc_quantity_variable_fn_exprP", "QUERY-PROC-QUANTITY-VARIABLE-FN-EXPR?", 2, 0, false);
        declareFunction(me, "query_proc_cardinality_of_fn_exprP", "QUERY-PROC-CARDINALITY-OF-FN-EXPR?", 2, 0, false);
        declareFunction(me, "query_processing_reformulate", "QUERY-PROCESSING-REFORMULATE", 4, 0, false);
        declareFunction(me, "query_proc_quantity_variable_fn_reformulate", "QUERY-PROC-QUANTITY-VARIABLE-FN-REFORMULATE", 4, 1, false);
        declareFunction(me, "query_proc_cardinality_of_fn_reformulate", "QUERY-PROC-CARDINALITY-OF-FN-REFORMULATE", 4, 1, false);
        declareFunction(me, "query_proc_variable_fn_specs_reformulate", "QUERY-PROC-VARIABLE-FN-SPECS-REFORMULATE", 4, 1, false);
        declareFunction(me, "query_proc_variable_fn_instances_reformulate", "QUERY-PROC-VARIABLE-FN-INSTANCES-REFORMULATE", 4, 1, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_query_processing_file() {
        deflexical("*QUERY-PROCESSING-MICROSECONDS*", $int$1200);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_query_processing_file() {
        reformulator_module_harness.declare_rl_module($$QueryProcessingRLModule, $list1);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_module_query_processing_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_module_query_processing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_module_query_processing_file();
    }

    
}

/**
 * Total time: 52 ms
 */
