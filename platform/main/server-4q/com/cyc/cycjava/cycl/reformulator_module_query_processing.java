/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_module_query_processing extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new reformulator_module_query_processing();



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $query_processing_microseconds$ = makeSymbol("*QUERY-PROCESSING-MICROSECONDS*");



    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("QUERY-PROCESSING-EXPRESSION-REQUIRED"), $COST, makeSymbol("QUERY-PROCESSING-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("QUERY-PROCESSING-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Reformulates #$VariableFn expressions so that queries search for bindings of the appropriate type."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$contains-Underspecified (#$VariableFn ?WHICH-THING #$DNAMolecule)\n    #$Ribose)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$and\n     (#$genls ?WHICH-THING #$DNAMolecule)\n     (#$implies\n      (#$isa ?X ?WHICH-THING)\n      (#$contains-Underspecified ?WHICH-THING #$Ribose)))") });

    private static final SubLInteger $int$1200 = makeInteger(1200);

















    static private final SubLList $list12 = list(makeSymbol("?CARDIN"));

    static private final SubLString $str13$__QuantityVariableFn = makeString("#$QuantityVariableFn");

    private static final SubLObject $$is_Underspecified = reader_make_constant_shell("is-Underspecified");

    static private final SubLString $str15$CardinalityOfFn__QP__1 = makeString("CardinalityOfFn (QP) 1");

    static private final SubLString $$$CardinalityOfFn_2 = makeString("CardinalityOfFn 2");





    static private final SubLString $$$VariableFn_specs = makeString("VariableFn specs");

    static private final SubLString $$$VariableFn_instances = makeString("VariableFn instances");

    /**
     *
     *
     * @param expression:
     * 		EL formula
     * @return integer
    Estimates the cost of calling the #$QueryProcessingRLModule on EXPRESSION
     */
    @LispMethod(comment = "@param expression:\r\n\t\tEL formula\r\n@return integer\r\nEstimates the cost of calling the #$QueryProcessingRLModule on EXPRESSION")
    public static final SubLObject query_processing_cost_estimate_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        return $query_processing_microseconds$.getGlobalValue();
    }

    /**
     *
     *
     * @param expression:
     * 		EL formula
     * @return integer
    Estimates the cost of calling the #$QueryProcessingRLModule on EXPRESSION
     */
    @LispMethod(comment = "@param expression:\r\n\t\tEL formula\r\n@return integer\r\nEstimates the cost of calling the #$QueryProcessingRLModule on EXPRESSION")
    public static SubLObject query_processing_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $query_processing_microseconds$.getGlobalValue();
    }

    public static final SubLObject query_proc_check_expression_alt(SubLObject expression) {
        return makeBoolean(((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first())));
    }

    public static SubLObject query_proc_check_expression(final SubLObject expression) {
        return makeBoolean(((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first())));
    }

    /**
     *
     *
     * @return boolean
    T iff the QueryProcessingRLModule applies to EXPRESSION: does EXPRESSION contain an argument of the form
    (#$VariableFn ?VAR COLLECTION)?
     */
    @LispMethod(comment = "@return boolean\r\nT iff the QueryProcessingRLModule applies to EXPRESSION: does EXPRESSION contain an argument of the form\r\n(#$VariableFn ?VAR COLLECTION)?")
    public static final SubLObject query_processing_expression_required_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        {
            SubLObject asent = (NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_check_expression(expression)) ? ((SubLObject) (clause_utilities.gaf_cnf_literal(expression.first()))) : expression;
            if (NIL != el_formula_p(asent)) {
                {
                    SubLObject matchP = NIL;
                    SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                    SubLObject rest = NIL;
                    for (rest = args; !((NIL != matchP) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject arg = rest.first();
                            if (NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_variable_fn_expressionP(arg, mt)) {
                                matchP = T;
                            }
                        }
                    }
                    return matchP;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean
    T iff the QueryProcessingRLModule applies to EXPRESSION: does EXPRESSION contain an argument of the form
    (#$VariableFn ?VAR COLLECTION)?
     */
    @LispMethod(comment = "@return boolean\r\nT iff the QueryProcessingRLModule applies to EXPRESSION: does EXPRESSION contain an argument of the form\r\n(#$VariableFn ?VAR COLLECTION)?")
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

    public static final SubLObject query_proc_variable_fn_expressionP_alt(SubLObject subexpression, SubLObject mt) {
        return makeBoolean((((NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_variable_fn_expression_specsP(subexpression, mt)) || (NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_variable_fn_expression_instancesP(subexpression, mt))) || (NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_quantity_variable_fn_exprP(subexpression, mt))) || (NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_cardinality_of_fn_exprP(subexpression, mt)));
    }

    public static SubLObject query_proc_variable_fn_expressionP(final SubLObject subexpression, final SubLObject mt) {
        return makeBoolean((((NIL != query_proc_variable_fn_expression_specsP(subexpression, mt)) || (NIL != query_proc_variable_fn_expression_instancesP(subexpression, mt))) || (NIL != query_proc_quantity_variable_fn_exprP(subexpression, mt))) || (NIL != query_proc_cardinality_of_fn_exprP(subexpression, mt)));
    }

    /**
     *
     *
     * @return boolean: T if SUBEXPRESSION is of the form (#$VariableFn ?VAR <collection>)
    AND we want to query for SPECS of <collection>
     */
    @LispMethod(comment = "@return boolean: T if SUBEXPRESSION is of the form (#$VariableFn ?VAR <collection>)\r\nAND we want to query for SPECS of <collection>")
    public static final SubLObject query_proc_variable_fn_expression_specsP_alt(SubLObject subexpression, SubLObject mt) {
        if ((NIL != el_formula_p(subexpression)) && (NIL != formula_arityE(subexpression, TWO_INTEGER, UNPROVIDED))) {
            {
                SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
                SubLObject coll_arg = cycl_utilities.formula_arg2(subexpression, UNPROVIDED);
                if ($$VariableFn.eql(function_expr)) {
                    if ((NIL != fort_types_interface.isa_collectionP(coll_arg, mt)) && (NIL != list_utilities.sublisp_boolean(backward.removal_ask(list($$noNotableInstances, coll_arg), mt, UNPROVIDED, UNPROVIDED)))) {
                        return T;
                    }
                } else {
                    return NIL;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean: T if SUBEXPRESSION is of the form (#$VariableFn ?VAR <collection>)
    AND we want to query for SPECS of <collection>
     */
    @LispMethod(comment = "@return boolean: T if SUBEXPRESSION is of the form (#$VariableFn ?VAR <collection>)\r\nAND we want to query for SPECS of <collection>")
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

    /**
     *
     *
     * @return boolean: T if SUBEXPRESSION is of the form (#$VariableFn ?VAR <collection>)
    AND we want to query for INSTANCES of <collection>
     */
    @LispMethod(comment = "@return boolean: T if SUBEXPRESSION is of the form (#$VariableFn ?VAR <collection>)\r\nAND we want to query for INSTANCES of <collection>")
    public static final SubLObject query_proc_variable_fn_expression_instancesP_alt(SubLObject subexpression, SubLObject mt) {
        if ((NIL != el_formula_p(subexpression)) && (NIL != formula_arityE(subexpression, TWO_INTEGER, UNPROVIDED))) {
            {
                SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
                SubLObject coll_arg = cycl_utilities.formula_arg2(subexpression, UNPROVIDED);
                if ($$VariableFn.eql(function_expr)) {
                    if ((NIL != fort_types_interface.isa_collectionP(coll_arg, mt)) && (NIL == list_utilities.sublisp_boolean(backward.removal_ask(list($$noNotableInstances, coll_arg), mt, UNPROVIDED, UNPROVIDED)))) {
                        return T;
                    }
                } else {
                    return NIL;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean: T if SUBEXPRESSION is of the form (#$VariableFn ?VAR <collection>)
    AND we want to query for INSTANCES of <collection>
     */
    @LispMethod(comment = "@return boolean: T if SUBEXPRESSION is of the form (#$VariableFn ?VAR <collection>)\r\nAND we want to query for INSTANCES of <collection>")
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

    /**
     * #return boolean: T is SUBEXPRESSION is of the form (#$QuantityVariableFn ?VAR <collection>)
     */
    @LispMethod(comment = "#return boolean: T is SUBEXPRESSION is of the form (#$QuantityVariableFn ?VAR <collection>)")
    public static final SubLObject query_proc_quantity_variable_fn_exprP_alt(SubLObject subexpression, SubLObject mt) {
        if ((NIL != el_formula_p(subexpression)) && (NIL != formula_arityE(subexpression, TWO_INTEGER, UNPROVIDED))) {
            {
                SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
                SubLObject coll_arg = cycl_utilities.formula_arg2(subexpression, UNPROVIDED);
                if ($$QuantityVariableFn.eql(function_expr)) {
                    return T;
                }
                return NIL;
            }
        }
        return NIL;
    }

    @LispMethod(comment = "#return boolean: T is SUBEXPRESSION is of the form (#$QuantityVariableFn ?VAR <collection>)")
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

    /**
     * #return boolean: T is SUBEXPRESSION is of the form (#$CardinalityOfFn <collection>)
     */
    @LispMethod(comment = "#return boolean: T is SUBEXPRESSION is of the form (#$CardinalityOfFn <collection>)")
    public static final SubLObject query_proc_cardinality_of_fn_exprP_alt(SubLObject subexpression, SubLObject mt) {
        if ((NIL != el_formula_p(subexpression)) && (NIL != formula_arityE(subexpression, ONE_INTEGER, UNPROVIDED))) {
            {
                SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
                SubLObject coll_arg = cycl_utilities.formula_arg1(subexpression, UNPROVIDED);
                if ($$CardinalityOfFn.eql(function_expr)) {
                    return T;
                }
                return NIL;
            }
        }
        return NIL;
    }

    @LispMethod(comment = "#return boolean: T is SUBEXPRESSION is of the form (#$CardinalityOfFn <collection>)")
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

    /**
     *
     *
     * @return 0 el-expression-p
     * @return 1 justification
     */
    @LispMethod(comment = "@return 0 el-expression-p\r\n@return 1 justification")
    public static final SubLObject query_processing_reformulate_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_check_expression(expression)) {
                {
                    SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
                    SubLObject new_sentence = NIL;
                    SubLObject justification = T;
                    if (NIL != el_formula_p(asent)) {
                        {
                            SubLObject argnum = ZERO_INTEGER;
                            SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                            SubLObject rest = NIL;
                            for (rest = args; !((NIL != new_sentence) || (NIL == rest)); rest = rest.rest()) {
                                {
                                    SubLObject arg = rest.first();
                                    argnum = add(argnum, ONE_INTEGER);
                                    if (NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_variable_fn_expression_specsP(arg, mt)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject new_sentence_1 = com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_variable_fn_specs_reformulate(asent, argnum, mt, settings, original_clause);
                                            SubLObject justification_2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            new_sentence = new_sentence_1;
                                            justification = justification_2;
                                        }
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_variable_fn_expression_instancesP(arg, mt)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject new_sentence_3 = com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_variable_fn_instances_reformulate(asent, argnum, mt, settings, original_clause);
                                                SubLObject justification_4 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                new_sentence = new_sentence_3;
                                                justification = justification_4;
                                            }
                                        } else {
                                            if (NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_quantity_variable_fn_exprP(arg, mt)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject new_sentence_5 = com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_quantity_variable_fn_reformulate(asent, argnum, mt, settings, original_clause);
                                                    SubLObject justification_6 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    new_sentence = new_sentence_5;
                                                    justification = justification_6;
                                                }
                                            } else {
                                                if (NIL != com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_cardinality_of_fn_exprP(arg, mt)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject new_sentence_7 = com.cyc.cycjava.cycl.reformulator_module_query_processing.query_proc_cardinality_of_fn_reformulate(asent, argnum, mt, settings, original_clause);
                                                        SubLObject justification_8 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        new_sentence = new_sentence_7;
                                                        justification = justification_8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return values(list(clause_utilities.make_gaf_cnf(new_sentence)), justification);
                }
            }
            return values(expression, NIL);
        }
    }

    /**
     *
     *
     * @return 0 el-expression-p
     * @return 1 justification
     */
    @LispMethod(comment = "@return 0 el-expression-p\r\n@return 1 justification")
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

    /**
     *
     *
     * @return 0 el-expression-p : an extentCardinality (TheSetOf < >, card) query
     * @return 1 reformulation used to get 0
     */
    @LispMethod(comment = "@return 0 el-expression-p : an extentCardinality (TheSetOf < >, card) query\r\n@return 1 reformulation used to get 0")
    public static final SubLObject query_proc_quantity_variable_fn_reformulate_alt(SubLObject expression, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            SubLObject asent = copy_tree(expression);
            SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject col = cycl_utilities.formula_arg2(arg, UNPROVIDED);
            SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
            SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
            return values(list_to_elf(listS($$extentCardinality, list($$TheSetOf, new_var, list($$and, list($$isa, new_var, col), subsentence)), $list_alt12)), list($str_alt13$__QuantityVariableFn));
        }
    }

    /**
     *
     *
     * @return 0 el-expression-p : an extentCardinality (TheSetOf < >, card) query
     * @return 1 reformulation used to get 0
     */
    @LispMethod(comment = "@return 0 el-expression-p : an extentCardinality (TheSetOf < >, card) query\r\n@return 1 reformulation used to get 0")
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

    /**
     *
     *
     * @return 0 el-expression-p
     * @return 1 justification label
     */
    @LispMethod(comment = "@return 0 el-expression-p\r\n@return 1 justification label")
    public static final SubLObject query_proc_cardinality_of_fn_reformulate_alt(SubLObject expression, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            SubLObject asent = copy_tree(expression);
            SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject col = cycl_utilities.formula_arg1(arg, UNPROVIDED);
            SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
            SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
            SubLObject new_set_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent, subsentence), UNPROVIDED);
            if (((pred == $$is_Underspecified) && argnum.numE(ONE_INTEGER)) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
                {
                    SubLObject result = reformulator_module_quantifier_processing_3.quantproc_3_reformulate_cardinality_of_fn(asent, argnum, mt, settings, original_clause);
                    if (NIL != result) {
                        return values(result.first(), list($str_alt15$CardinalityOfFn__QP__1));
                    }
                }
            } else {
                return values(list_to_elf(list($$and, subsentence, list($$extentCardinality, list($$TheSetOf, new_set_var, list($$isa, new_set_var, col)), new_var))), list($$$CardinalityOfFn_2));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return 0 el-expression-p
     * @return 1 justification label
     */
    @LispMethod(comment = "@return 0 el-expression-p\r\n@return 1 justification label")
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

    /**
     *
     *
     * @return 0 el-expression-p
     * @return 1 reformulation used to get 0
     */
    @LispMethod(comment = "@return 0 el-expression-p\r\n@return 1 reformulation used to get 0")
    public static final SubLObject query_proc_variable_fn_specs_reformulate_alt(SubLObject expression, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(expression);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                thread.resetMultipleValues();
                {
                    SubLObject variable_fn = unmake_binary_formula(arg);
                    SubLObject el_var = thread.secondMultipleValue();
                    SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                        SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                        return values(list_to_elf(list($$and, list($$implies, list($$isa, new_var, el_var), subsentence), list($$genls, el_var, col))), list($$$VariableFn_specs));
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return 0 el-expression-p
     * @return 1 reformulation used to get 0
     */
    @LispMethod(comment = "@return 0 el-expression-p\r\n@return 1 reformulation used to get 0")
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

    /**
     *
     *
     * @return 0 el-expression-p
     * @return 1 reformulation used to get 0
     */
    @LispMethod(comment = "@return 0 el-expression-p\r\n@return 1 reformulation used to get 0")
    public static final SubLObject query_proc_variable_fn_instances_reformulate_alt(SubLObject expression, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(expression);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                thread.resetMultipleValues();
                {
                    SubLObject variable_fn = unmake_binary_formula(arg);
                    SubLObject el_var = thread.secondMultipleValue();
                    SubLObject col = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject subsentence = replace_formula_arg(argnum, el_var, asent);
                        if (NIL != fort_types_interface.isa_predicateP(pred, mt)) {
                            return values(list_to_elf(list($$and, list($$isa, el_var, col), subsentence)), list($$$VariableFn_instances));
                        }
                    }
                }
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return 0 el-expression-p
     * @return 1 reformulation used to get 0
     */
    @LispMethod(comment = "@return 0 el-expression-p\r\n@return 1 reformulation used to get 0")
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
        declareFunction("query_processing_cost_estimate", "QUERY-PROCESSING-COST-ESTIMATE", 3, 0, false);
        declareFunction("query_proc_check_expression", "QUERY-PROC-CHECK-EXPRESSION", 1, 0, false);
        declareFunction("query_processing_expression_required", "QUERY-PROCESSING-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction("query_proc_variable_fn_expressionP", "QUERY-PROC-VARIABLE-FN-EXPRESSION?", 2, 0, false);
        declareFunction("query_proc_variable_fn_expression_specsP", "QUERY-PROC-VARIABLE-FN-EXPRESSION-SPECS?", 2, 0, false);
        declareFunction("query_proc_variable_fn_expression_instancesP", "QUERY-PROC-VARIABLE-FN-EXPRESSION-INSTANCES?", 2, 0, false);
        declareFunction("query_proc_quantity_variable_fn_exprP", "QUERY-PROC-QUANTITY-VARIABLE-FN-EXPR?", 2, 0, false);
        declareFunction("query_proc_cardinality_of_fn_exprP", "QUERY-PROC-CARDINALITY-OF-FN-EXPR?", 2, 0, false);
        declareFunction("query_processing_reformulate", "QUERY-PROCESSING-REFORMULATE", 4, 0, false);
        declareFunction("query_proc_quantity_variable_fn_reformulate", "QUERY-PROC-QUANTITY-VARIABLE-FN-REFORMULATE", 4, 1, false);
        declareFunction("query_proc_cardinality_of_fn_reformulate", "QUERY-PROC-CARDINALITY-OF-FN-REFORMULATE", 4, 1, false);
        declareFunction("query_proc_variable_fn_specs_reformulate", "QUERY-PROC-VARIABLE-FN-SPECS-REFORMULATE", 4, 1, false);
        declareFunction("query_proc_variable_fn_instances_reformulate", "QUERY-PROC-VARIABLE-FN-INSTANCES-REFORMULATE", 4, 1, false);
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

    static {
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("QUERY-PROCESSING-EXPRESSION-REQUIRED"), $COST, makeSymbol("QUERY-PROCESSING-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("QUERY-PROCESSING-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Reformulates #$VariableFn expressions so that queries search for bindings of the appropriate type."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$contains-Underspecified (#$VariableFn ?WHICH-THING #$DNAMolecule)\n    #$Ribose)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$and\n     (#$genls ?WHICH-THING #$DNAMolecule)\n     (#$implies\n      (#$isa ?X ?WHICH-THING)\n      (#$contains-Underspecified ?WHICH-THING #$Ribose)))") });

    static private final SubLList $list_alt12 = list(makeSymbol("?CARDIN"));

    static private final SubLString $str_alt13$__QuantityVariableFn = makeString("#$QuantityVariableFn");

    static private final SubLString $str_alt15$CardinalityOfFn__QP__1 = makeString("CardinalityOfFn (QP) 1");
}

/**
 * Total time: 52 ms
 */
