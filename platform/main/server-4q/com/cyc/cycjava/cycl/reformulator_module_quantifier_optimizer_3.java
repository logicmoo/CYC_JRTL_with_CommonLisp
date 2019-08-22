package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_ternary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.unmake_ternary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
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


public final class reformulator_module_quantifier_optimizer_3 extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_module_quantifier_optimizer_3();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3";

    public static final String myFingerPrint = "fe84e58d4192a1b8e15d711b84d65b693335302f1591c858dc4dd0b407bd5242";

    // deflexical
    // Definitions
    private static final SubLSymbol $quant_opt_3_microseconds$ = makeSymbol("*QUANT-OPT-3-MICROSECONDS*");

    private static final SubLObject $$QuantifierOptimizer_3_RLModule = reader_make_constant_shell(makeString("QuantifierOptimizer-3-RLModule"));

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("QUANT-OPT-3-EXPRESSION-REQUIRED"), makeKeyword("COST"), makeSymbol("QUANT-OPT-3-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("QUANT-OPT-3-EXPRESSION-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Reorders quantifiers in NATs so that quantifier expressions are in the right place for \n    the Quantifier Processing RL module to handle them in the proper way."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$ProspectiveCollectionFn\n      (#$NLQuantFn-3 #$Every-NLAttr\n\t    (#$NLNumberFn #$Singular-NLAttr #$TranscriptCopy) 0)\n\t     #$MessengerRNA)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$NLQuantFn-3 #$Every-NLAttr\n      (#$NLNumberFn #$Singular-NLAttr\n\t (#$ProspectiveCollectionFn #$TranscriptCopy #$MessengerRNA)) 0)") });

    private static final SubLInteger $int$1200 = makeInteger(1200);

    public static final SubLList $list3 = list(reader_make_constant_shell(makeString("NLQuantFn-3")), reader_make_constant_shell(makeString("NLDefinitenessFn-3")), reader_make_constant_shell(makeString("NLNumberFn")));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$CollectionSubsetFn = reader_make_constant_shell(makeString("CollectionSubsetFn"));

    private static final SubLObject $$TheSetOf = reader_make_constant_shell(makeString("TheSetOf"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLList $list9 = list(reader_make_constant_shell(makeString("NLQuantFn-3")), reader_make_constant_shell(makeString("NLDefinitenessFn-3")));

    private static final SubLObject $$NLNumberFn = reader_make_constant_shell(makeString("NLNumberFn"));

    private static final SubLObject $$CollectionType = reader_make_constant_shell(makeString("CollectionType"));

    public static final SubLString $str12$Reformulator_Quantifier_Optimizat = makeString("Reformulator Quantifier Optimization");

    public static final SubLString $str13$quant_optimizer_test_suite = makeString("quant-optimizer-test-suite");

    public static SubLObject quant_opt_3_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $quant_opt_3_microseconds$.getGlobalValue();
    }

    public static SubLObject quant_opt_3_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (((((NIL != el_formula_p(expression)) && ((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression)))) && (NIL != fort_types_interface.functionP(cycl_utilities.formula_operator(expression)))) && ((NIL != el_binary_formula_p(cycl_utilities.formula_arg1(expression, UNPROVIDED))) || (NIL != el_ternary_formula_p(cycl_utilities.formula_arg1(expression, UNPROVIDED))))) && (NIL != member(cycl_utilities.formula_operator(cycl_utilities.formula_arg1(expression, UNPROVIDED)), $list3, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        if (NIL != quant_opt_3_isa_collection_subsetP(expression, mt)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject quant_opt_3_isa_collection_subsetP(final SubLObject expression, final SubLObject mt) {
        if (((NIL == clauses.clauses_p(expression)) || (NIL == list_utilities.singletonP(expression))) || (NIL == clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            return NIL;
        }
        final SubLObject thesent = clause_utilities.gaf_cnf_literal(expression.first());
        final SubLObject possible_collsubset_arg = cycl_utilities.formula_arg2(thesent, UNPROVIDED);
        if ((($$isa.eql(cycl_utilities.formula_operator(thesent)) && (NIL != term.nautP(possible_collsubset_arg, UNPROVIDED))) && $$CollectionSubsetFn.eql(cycl_utilities.nat_functor(possible_collsubset_arg))) && $$TheSetOf.eql(cycl_utilities.nat_functor(cycl_utilities.nat_arg2(possible_collsubset_arg, UNPROVIDED)))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject quant_opt_3_expression_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        SubLObject result = NIL;
        if (NIL != quant_opt_3_isa_collection_subsetP(expression, mt)) {
            result = quant_opt_3_reformulate_isa_collection_subset(expression, mt);
        } else {
            result = quant_opt_3_reformulate_int(expression, mt);
        }
        if (NIL != result) {
            return values(result, T);
        }
        return values(expression, NIL);
    }

    public static SubLObject quant_opt_3_reformulate_isa_collection_subset(final SubLObject expression, final SubLObject mt) {
        final SubLObject thesent = clause_utilities.gaf_cnf_literal(expression.first());
        final SubLObject collection_subset_nat = cycl_utilities.formula_arg2(thesent, UNPROVIDED);
        final SubLObject instance_of_coll_subset_nat = cycl_utilities.formula_arg1(thesent, UNPROVIDED);
        final SubLObject collection_arg = cycl_utilities.nat_arg1(collection_subset_nat, UNPROVIDED);
        final SubLObject the_set_of_arg = cycl_utilities.nat_arg2(collection_subset_nat, UNPROVIDED);
        if (!$$TheSetOf.eql(cycl_utilities.nat_functor(the_set_of_arg))) {
            return NIL;
        }
        final SubLObject the_set_of_var = cycl_utilities.nat_arg1(the_set_of_arg, UNPROVIDED);
        final SubLObject sentence_arg = cycl_utilities.nat_arg2(the_set_of_arg, UNPROVIDED);
        final SubLObject existential_op = cycl_utilities.formula_operator(sentence_arg);
        if ($$thereExists.eql(existential_op)) {
            final SubLObject new_subsentence = cycl_utilities.formula_subst(instance_of_coll_subset_nat, the_set_of_var, sentence_arg, UNPROVIDED, UNPROVIDED);
            return list_to_elf(list($$and, list($$isa, instance_of_coll_subset_nat, collection_arg), new_subsentence));
        }
        return NIL;
    }

    public static SubLObject quant_opt_3_reformulate_int(final SubLObject expression, final SubLObject mt) {
        if (((NIL != el_binary_formula_p(expression)) || (NIL != el_ternary_formula_p(expression))) && (NIL != quant_opt_3_applies_to_expressionP(expression, mt))) {
            return reformulate_quant_opt_3_expression(expression, mt);
        }
        return NIL;
    }

    public static SubLObject quant_opt_3_applies_to_expressionP(final SubLObject expression, final SubLObject mt) {
        final SubLObject func = cycl_utilities.formula_operator(expression);
        final SubLObject arg1_consts = kb_accessors.arg1_isa(func, mt);
        final SubLObject first_arg = cycl_utilities.formula_arg1(expression, UNPROVIDED);
        final SubLObject nl_func = cycl_utilities.formula_operator(first_arg);
        final SubLObject second_arg_of_first_arg = cycl_utilities.formula_arg2(first_arg, UNPROVIDED);
        final SubLObject second_nl_func = cycl_utilities.formula_operator(second_arg_of_first_arg);
        final SubLObject col_arg = cycl_utilities.formula_arg2(second_arg_of_first_arg, UNPROVIDED);
        SubLObject result = NIL;
        if ((NIL == subl_promotions.memberP(nl_func, $list9, UNPROVIDED, UNPROVIDED)) || (!second_nl_func.eql($$NLNumberFn))) {
            return NIL;
        }
        if (NIL == result) {
            SubLObject csome_list_var = arg1_consts;
            SubLObject arg_const = NIL;
            arg_const = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if ((NIL != isa.isaP(arg_const, $$CollectionType, mt, UNPROVIDED)) && (NIL != isa.isaP(col_arg, arg_const, mt, UNPROVIDED))) {
                    result = T;
                }
                csome_list_var = csome_list_var.rest();
                arg_const = csome_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject reformulate_quant_opt_3_expression(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject func = cycl_utilities.formula_operator(expression);
        final SubLObject first_arg = cycl_utilities.formula_arg1(expression, UNPROVIDED);
        final SubLObject second_arg = cycl_utilities.formula_arg2(expression, UNPROVIDED);
        SubLObject inner_form = NIL;
        if ((NIL != el_ternary_formula_p(expression)) && (NIL == fort_types_interface.isa_predicateP(second_arg, mt))) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject nl_func = unmake_ternary_formula(first_arg);
        final SubLObject quant_attr = thread.secondMultipleValue();
        final SubLObject number_tagged_term = thread.thirdMultipleValue();
        final SubLObject start_index = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = unmake_binary_formula(number_tagged_term);
        final SubLObject number_attr = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject new_expression = replace_formula_arg(ONE_INTEGER, col, expression);
        inner_form = make_formula(nl_number_fn, list(number_attr, new_expression), UNPROVIDED);
        return make_formula(nl_func, list(quant_attr, inner_form, start_index), UNPROVIDED);
    }

    public static SubLObject declare_reformulator_module_quantifier_optimizer_3_file() {
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_cost_estimate", "QUANT-OPT-3-COST-ESTIMATE", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_expression_required", "QUANT-OPT-3-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_isa_collection_subsetP", "QUANT-OPT-3-ISA-COLLECTION-SUBSET?", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_expression_reformulate", "QUANT-OPT-3-EXPRESSION-REFORMULATE", 4, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_reformulate_isa_collection_subset", "QUANT-OPT-3-REFORMULATE-ISA-COLLECTION-SUBSET", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_reformulate_int", "QUANT-OPT-3-REFORMULATE-INT", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_applies_to_expressionP", "QUANT-OPT-3-APPLIES-TO-EXPRESSION?", 2, 0, false);
        declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "reformulate_quant_opt_3_expression", "REFORMULATE-QUANT-OPT-3-EXPRESSION", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_quantifier_optimizer_3_file() {
        deflexical("*QUANT-OPT-3-MICROSECONDS*", $int$1200);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_quantifier_optimizer_3_file() {
        reformulator_module_harness.declare_rl_module($$QuantifierOptimizer_3_RLModule, $list1);
        sunit_external.define_test_category($str12$Reformulator_Quantifier_Optimizat, UNPROVIDED);
        sunit_external.define_test_suite($str13$quant_optimizer_test_suite, list($str12$Reformulator_Quantifier_Optimizat), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_module_quantifier_optimizer_3_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_module_quantifier_optimizer_3_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_module_quantifier_optimizer_3_file();
    }

    
}

/**
 * Total time: 36 ms
 */
