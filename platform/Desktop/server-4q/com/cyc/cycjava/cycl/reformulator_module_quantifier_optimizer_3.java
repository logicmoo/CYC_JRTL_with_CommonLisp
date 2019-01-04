package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_quantifier_optimizer_3 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3";
    public static final String myFingerPrint = "fe84e58d4192a1b8e15d711b84d65b693335302f1591c858dc4dd0b407bd5242";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-optimizer-3.lisp", position = 2166L)
    private static SubLSymbol $quant_opt_3_microseconds$;
    private static final SubLObject $const0$QuantifierOptimizer_3_RLModule;
    private static final SubLList $list1;
    private static final SubLInteger $int2$1200;
    private static final SubLList $list3;
    private static final SubLObject $const4$isa;
    private static final SubLObject $const5$CollectionSubsetFn;
    private static final SubLObject $const6$TheSetOf;
    private static final SubLObject $const7$thereExists;
    private static final SubLObject $const8$and;
    private static final SubLList $list9;
    private static final SubLObject $const10$NLNumberFn;
    private static final SubLObject $const11$CollectionType;
    private static final SubLString $str12$Reformulator_Quantifier_Optimizat;
    private static final SubLString $str13$quant_optimizer_test_suite;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-optimizer-3.lisp", position = 2220L)
    public static SubLObject quant_opt_3_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_quantifier_optimizer_3.$quant_opt_3_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-optimizer-3.lisp", position = 2514L)
    public static SubLObject quant_opt_3_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (reformulator_module_quantifier_optimizer_3.NIL != el_utilities.el_formula_p(expression) && (reformulator_module_quantifier_optimizer_3.NIL != el_utilities.el_binary_formula_p(expression) || reformulator_module_quantifier_optimizer_3.NIL != el_utilities.el_ternary_formula_p(expression)) && reformulator_module_quantifier_optimizer_3.NIL != fort_types_interface.functionP(cycl_utilities.formula_operator(expression)) && (reformulator_module_quantifier_optimizer_3.NIL != el_utilities.el_binary_formula_p(cycl_utilities.formula_arg1(expression, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED)) || reformulator_module_quantifier_optimizer_3.NIL != el_utilities.el_ternary_formula_p(cycl_utilities.formula_arg1(expression, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED))) && reformulator_module_quantifier_optimizer_3.NIL != conses_high.member(cycl_utilities.formula_operator(cycl_utilities.formula_arg1(expression, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED)), (SubLObject)reformulator_module_quantifier_optimizer_3.$list3, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED)) {
            return (SubLObject)reformulator_module_quantifier_optimizer_3.T;
        }
        if (reformulator_module_quantifier_optimizer_3.NIL != quant_opt_3_isa_collection_subsetP(expression, mt)) {
            return (SubLObject)reformulator_module_quantifier_optimizer_3.T;
        }
        return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-optimizer-3.lisp", position = 3691L)
    public static SubLObject quant_opt_3_isa_collection_subsetP(final SubLObject expression, final SubLObject mt) {
        if (reformulator_module_quantifier_optimizer_3.NIL == clauses.clauses_p(expression) || reformulator_module_quantifier_optimizer_3.NIL == list_utilities.singletonP(expression) || reformulator_module_quantifier_optimizer_3.NIL == clause_utilities.pos_atomic_cnf_p(expression.first())) {
            return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
        }
        final SubLObject thesent = clause_utilities.gaf_cnf_literal(expression.first());
        final SubLObject possible_collsubset_arg = cycl_utilities.formula_arg2(thesent, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        if (reformulator_module_quantifier_optimizer_3.$const4$isa.eql(cycl_utilities.formula_operator(thesent)) && reformulator_module_quantifier_optimizer_3.NIL != term.nautP(possible_collsubset_arg, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED) && reformulator_module_quantifier_optimizer_3.$const5$CollectionSubsetFn.eql(cycl_utilities.nat_functor(possible_collsubset_arg)) && reformulator_module_quantifier_optimizer_3.$const6$TheSetOf.eql(cycl_utilities.nat_functor(cycl_utilities.nat_arg2(possible_collsubset_arg, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED)))) {
            return (SubLObject)reformulator_module_quantifier_optimizer_3.T;
        }
        return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-optimizer-3.lisp", position = 4326L)
    public static SubLObject quant_opt_3_expression_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        SubLObject result = (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
        if (reformulator_module_quantifier_optimizer_3.NIL != quant_opt_3_isa_collection_subsetP(expression, mt)) {
            result = quant_opt_3_reformulate_isa_collection_subset(expression, mt);
        }
        else {
            result = quant_opt_3_reformulate_int(expression, mt);
        }
        if (reformulator_module_quantifier_optimizer_3.NIL != result) {
            return Values.values(result, (SubLObject)reformulator_module_quantifier_optimizer_3.T);
        }
        return Values.values(expression, (SubLObject)reformulator_module_quantifier_optimizer_3.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-optimizer-3.lisp", position = 5198L)
    public static SubLObject quant_opt_3_reformulate_isa_collection_subset(final SubLObject expression, final SubLObject mt) {
        final SubLObject thesent = clause_utilities.gaf_cnf_literal(expression.first());
        final SubLObject collection_subset_nat = cycl_utilities.formula_arg2(thesent, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        final SubLObject instance_of_coll_subset_nat = cycl_utilities.formula_arg1(thesent, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        final SubLObject collection_arg = cycl_utilities.nat_arg1(collection_subset_nat, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        final SubLObject the_set_of_arg = cycl_utilities.nat_arg2(collection_subset_nat, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        if (!reformulator_module_quantifier_optimizer_3.$const6$TheSetOf.eql(cycl_utilities.nat_functor(the_set_of_arg))) {
            return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
        }
        final SubLObject the_set_of_var = cycl_utilities.nat_arg1(the_set_of_arg, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        final SubLObject sentence_arg = cycl_utilities.nat_arg2(the_set_of_arg, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        final SubLObject existential_op = cycl_utilities.formula_operator(sentence_arg);
        if (reformulator_module_quantifier_optimizer_3.$const7$thereExists.eql(existential_op)) {
            final SubLObject new_subsentence = cycl_utilities.formula_subst(instance_of_coll_subset_nat, the_set_of_var, sentence_arg, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
            return el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_optimizer_3.$const8$and, (SubLObject)ConsesLow.list(reformulator_module_quantifier_optimizer_3.$const4$isa, instance_of_coll_subset_nat, collection_arg), new_subsentence));
        }
        return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-optimizer-3.lisp", position = 6226L)
    public static SubLObject quant_opt_3_reformulate_int(final SubLObject expression, final SubLObject mt) {
        if ((reformulator_module_quantifier_optimizer_3.NIL != el_utilities.el_binary_formula_p(expression) || reformulator_module_quantifier_optimizer_3.NIL != el_utilities.el_ternary_formula_p(expression)) && reformulator_module_quantifier_optimizer_3.NIL != quant_opt_3_applies_to_expressionP(expression, mt)) {
            return reformulate_quant_opt_3_expression(expression, mt);
        }
        return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-optimizer-3.lisp", position = 6516L)
    public static SubLObject quant_opt_3_applies_to_expressionP(final SubLObject expression, final SubLObject mt) {
        final SubLObject func = cycl_utilities.formula_operator(expression);
        final SubLObject arg1_consts = kb_accessors.arg1_isa(func, mt);
        final SubLObject first_arg = cycl_utilities.formula_arg1(expression, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        final SubLObject nl_func = cycl_utilities.formula_operator(first_arg);
        final SubLObject second_arg_of_first_arg = cycl_utilities.formula_arg2(first_arg, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        final SubLObject second_nl_func = cycl_utilities.formula_operator(second_arg_of_first_arg);
        final SubLObject col_arg = cycl_utilities.formula_arg2(second_arg_of_first_arg, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        SubLObject result = (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
        if (reformulator_module_quantifier_optimizer_3.NIL == subl_promotions.memberP(nl_func, (SubLObject)reformulator_module_quantifier_optimizer_3.$list9, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED) || !second_nl_func.eql(reformulator_module_quantifier_optimizer_3.$const10$NLNumberFn)) {
            return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
        }
        if (reformulator_module_quantifier_optimizer_3.NIL == result) {
            SubLObject csome_list_var = arg1_consts;
            SubLObject arg_const = (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
            arg_const = csome_list_var.first();
            while (reformulator_module_quantifier_optimizer_3.NIL == result && reformulator_module_quantifier_optimizer_3.NIL != csome_list_var) {
                if (reformulator_module_quantifier_optimizer_3.NIL != isa.isaP(arg_const, reformulator_module_quantifier_optimizer_3.$const11$CollectionType, mt, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED) && reformulator_module_quantifier_optimizer_3.NIL != isa.isaP(col_arg, arg_const, mt, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED)) {
                    result = (SubLObject)reformulator_module_quantifier_optimizer_3.T;
                }
                csome_list_var = csome_list_var.rest();
                arg_const = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-optimizer-3.lisp", position = 7302L)
    public static SubLObject reformulate_quant_opt_3_expression(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject func = cycl_utilities.formula_operator(expression);
        final SubLObject first_arg = cycl_utilities.formula_arg1(expression, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        final SubLObject second_arg = cycl_utilities.formula_arg2(expression, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        SubLObject inner_form = (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
        if (reformulator_module_quantifier_optimizer_3.NIL != el_utilities.el_ternary_formula_p(expression) && reformulator_module_quantifier_optimizer_3.NIL == fort_types_interface.isa_predicateP(second_arg, mt)) {
            return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject nl_func = el_utilities.unmake_ternary_formula(first_arg);
        final SubLObject quant_attr = thread.secondMultipleValue();
        final SubLObject number_tagged_term = thread.thirdMultipleValue();
        final SubLObject start_index = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(number_tagged_term);
        final SubLObject number_attr = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject new_expression = el_utilities.replace_formula_arg((SubLObject)reformulator_module_quantifier_optimizer_3.ONE_INTEGER, col, expression);
        inner_form = el_utilities.make_formula(nl_number_fn, (SubLObject)ConsesLow.list(number_attr, new_expression), (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        return el_utilities.make_formula(nl_func, (SubLObject)ConsesLow.list(quant_attr, inner_form, start_index), (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
    }
    
    public static SubLObject declare_reformulator_module_quantifier_optimizer_3_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_cost_estimate", "QUANT-OPT-3-COST-ESTIMATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_expression_required", "QUANT-OPT-3-EXPRESSION-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_isa_collection_subsetP", "QUANT-OPT-3-ISA-COLLECTION-SUBSET?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_expression_reformulate", "QUANT-OPT-3-EXPRESSION-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_reformulate_isa_collection_subset", "QUANT-OPT-3-REFORMULATE-ISA-COLLECTION-SUBSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_reformulate_int", "QUANT-OPT-3-REFORMULATE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "quant_opt_3_applies_to_expressionP", "QUANT-OPT-3-APPLIES-TO-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_optimizer_3", "reformulate_quant_opt_3_expression", "REFORMULATE-QUANT-OPT-3-EXPRESSION", 2, 0, false);
        return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
    }
    
    public static SubLObject init_reformulator_module_quantifier_optimizer_3_file() {
        reformulator_module_quantifier_optimizer_3.$quant_opt_3_microseconds$ = SubLFiles.deflexical("*QUANT-OPT-3-MICROSECONDS*", (SubLObject)reformulator_module_quantifier_optimizer_3.$int2$1200);
        return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
    }
    
    public static SubLObject setup_reformulator_module_quantifier_optimizer_3_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_quantifier_optimizer_3.$const0$QuantifierOptimizer_3_RLModule, (SubLObject)reformulator_module_quantifier_optimizer_3.$list1);
        sunit_external.define_test_category((SubLObject)reformulator_module_quantifier_optimizer_3.$str12$Reformulator_Quantifier_Optimizat, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)reformulator_module_quantifier_optimizer_3.$str13$quant_optimizer_test_suite, (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_optimizer_3.$str12$Reformulator_Quantifier_Optimizat), (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_optimizer_3.UNPROVIDED);
        return (SubLObject)reformulator_module_quantifier_optimizer_3.NIL;
    }
    
    public void declareFunctions() {
        declare_reformulator_module_quantifier_optimizer_3_file();
    }
    
    public void initializeVariables() {
        init_reformulator_module_quantifier_optimizer_3_file();
    }
    
    public void runTopLevelForms() {
        setup_reformulator_module_quantifier_optimizer_3_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_quantifier_optimizer_3();
        reformulator_module_quantifier_optimizer_3.$quant_opt_3_microseconds$ = null;
        $const0$QuantifierOptimizer_3_RLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantifierOptimizer-3-RLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("QUANT-OPT-3-EXPRESSION-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("QUANT-OPT-3-COST-ESTIMATE"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("QUANT-OPT-3-EXPRESSION-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Reorders quantifiers in NATs so that quantifier expressions are in the right place for \n    the Quantifier Processing RL module to handle them in the proper way."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$ProspectiveCollectionFn\n      (#$NLQuantFn-3 #$Every-NLAttr\n\t    (#$NLNumberFn #$Singular-NLAttr #$TranscriptCopy) 0)\n\t     #$MessengerRNA)"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$NLQuantFn-3 #$Every-NLAttr\n      (#$NLNumberFn #$Singular-NLAttr\n\t (#$ProspectiveCollectionFn #$TranscriptCopy #$MessengerRNA)) 0)") });
        $int2$1200 = SubLObjectFactory.makeInteger(1200);
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")));
        $const4$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const5$CollectionSubsetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $const6$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $const7$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $const8$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3")));
        $const10$NLNumberFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn"));
        $const11$CollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $str12$Reformulator_Quantifier_Optimizat = SubLObjectFactory.makeString("Reformulator Quantifier Optimization");
        $str13$quant_optimizer_test_suite = SubLObjectFactory.makeString("quant-optimizer-test-suite");
    }
}

/*

	Total time: 36 ms
	
*/