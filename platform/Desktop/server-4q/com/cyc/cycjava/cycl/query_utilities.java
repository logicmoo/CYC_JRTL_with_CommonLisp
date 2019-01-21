package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class query_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.query_utilities";
    public static final String myFingerPrint = "d93639e8e7755ce0f56ab3540489144c9764ec37f9ea045177125ba649b08e68";
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 9583L)
    private static SubLSymbol $indexicalized_query_term$;
    private static final SubLObject $const0$EverythingPSC;
    private static final SubLObject $const1$InferencePSC;
    private static final SubLSymbol $sym2$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLSymbol $sym3$CYC_VAR_;
    private static final SubLSymbol $kw4$ISA;
    private static final SubLSymbol $kw5$GENLS;
    private static final SubLSymbol $sym6$PROPERTY_LIST_P;
    private static final SubLSymbol $sym7$QUERY_PROPERTY_P;
    private static final SubLSymbol $kw8$UNINITIALIZED;
    private static final SubLSymbol $sym9$_REFERENT;
    private static final SubLObject $const10$indexicalReferent;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$INDEXICALIZED_QUERY_INDEXICAL_P;
    private static final SubLSymbol $sym13$INDEXICALIZED_QUERY_TERM_FOR_INDEXICAL;
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 941L)
    public static SubLObject get_possible_sentence_combinations_wrt_argpos(final SubLObject sentence, final SubLObject mt, final SubLObject arg_pos, final SubLObject template_sentence, final SubLObject template_mt) {
        SubLObject arg_pos_term = cycl_utilities.formula_arg_position(sentence, arg_pos, (SubLObject)query_utilities.UNPROVIDED);
        SubLObject new_sentence = conses_high.copy_tree(sentence);
        if (query_utilities.NIL == variables.variable_p(arg_pos_term)) {
            arg_pos_term = czer_utilities.unique_el_var_wrt_expression(sentence, (SubLObject)query_utilities.UNPROVIDED);
            new_sentence = cycl_utilities.formula_arg_position_subst(arg_pos_term, arg_pos, new_sentence);
        }
        return get_possible_sentence_combinations_wrt_var(new_sentence, mt, template_sentence, template_mt, arg_pos_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 1558L)
    public static SubLObject get_possible_sentence_combinations_wrt_var(final SubLObject sentence1, final SubLObject mt1, final SubLObject sentence2, final SubLObject mt2, final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_to_term_dict = qu_get_replaceable_variables_for_terms(sentence2);
        SubLObject all_variables = (SubLObject)query_utilities.NIL;
        if (mt1.eql(query_utilities.$const0$EverythingPSC) || mt1.eql(query_utilities.$const1$InferencePSC)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)query_utilities.$sym2$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(query_utilities.$const0$EverythingPSC, thread);
                all_variables = qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt1, variable, var_to_term_dict);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            all_variables = Sequences.remove_duplicates(all_variables, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED);
        }
        else if (mt2.eql(query_utilities.$const0$EverythingPSC) || mt2.eql(query_utilities.$const1$InferencePSC)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)query_utilities.$sym2$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(query_utilities.$const0$EverythingPSC, thread);
                all_variables = qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt2, variable, var_to_term_dict);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            all_variables = Sequences.remove_duplicates(all_variables, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED);
        }
        else {
            final SubLObject combined_variables_in_mt1 = qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt1, variable, var_to_term_dict);
            final SubLObject combined_variables_in_mt2 = qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt2, variable, var_to_term_dict);
            SubLObject temp_variables = (SubLObject)query_utilities.NIL;
            temp_variables = ConsesLow.append(combined_variables_in_mt1, combined_variables_in_mt2);
            SubLObject cdolist_list_var;
            temp_variables = (cdolist_list_var = Sequences.remove_duplicates(temp_variables, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED));
            SubLObject var = (SubLObject)query_utilities.NIL;
            var = cdolist_list_var.first();
            while (query_utilities.NIL != cdolist_list_var) {
                if (query_utilities.NIL != subl_promotions.memberP(var, combined_variables_in_mt1, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED) && query_utilities.NIL != subl_promotions.memberP(var, combined_variables_in_mt2, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED)) {
                    all_variables = (SubLObject)ConsesLow.cons(var, all_variables);
                }
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            }
        }
        SubLObject replaceable = (SubLObject)query_utilities.NIL;
        SubLObject cdolist_list_var2 = all_variables;
        SubLObject combine_variable = (SubLObject)query_utilities.NIL;
        combine_variable = cdolist_list_var2.first();
        while (query_utilities.NIL != cdolist_list_var2) {
            final SubLObject v_term = dictionary.dictionary_lookup(var_to_term_dict, combine_variable, (SubLObject)query_utilities.UNPROVIDED);
            if (query_utilities.NIL != v_term) {
                replaceable = (SubLObject)ConsesLow.cons(v_term, replaceable);
            }
            else {
                replaceable = (SubLObject)ConsesLow.cons(combine_variable, replaceable);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            combine_variable = cdolist_list_var2.first();
        }
        return replaceable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 3738L)
    public static SubLObject qu_get_possible_sentence_combinations_wrt_var_in_mt(final SubLObject sentence1, final SubLObject sentence2, final SubLObject mt, final SubLObject variable, final SubLObject var_to_term_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject combine_variables = (SubLObject)query_utilities.NIL;
        SubLObject sentence1_arg_constraints = (SubLObject)query_utilities.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
        try {
            wff_vars.$validate_expansionsP$.bind((SubLObject)query_utilities.T, thread);
            sentence1_arg_constraints = at_var_types.formula_variables_arg_constraints_dict(sentence1, mt, (SubLObject)query_utilities.$sym3$CYC_VAR_, (SubLObject)query_utilities.NIL);
        }
        finally {
            wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject variable_constraints = dictionary.dictionary_lookup(sentence1_arg_constraints, variable, (SubLObject)query_utilities.UNPROVIDED);
        final SubLObject isa_constraints = variable_constraints.first();
        final SubLObject genl_constraints = conses_high.second(variable_constraints);
        final SubLObject quoted_isa_constraints = conses_high.third(variable_constraints);
        if (query_utilities.NIL == variable_constraints) {
            return (SubLObject)query_utilities.NIL;
        }
        combine_variables = qu_get_variable_combinations(variable, isa_constraints, genl_constraints, sentence2, mt);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_to_term_dict)); query_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject v_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            combine_variables = ConsesLow.append(combine_variables, qu_get_variable_combinations_replacing_term(variable, isa_constraints, genl_constraints, sentence2, mt, v_term, var));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return combine_variables;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 4935L)
    public static SubLObject qu_get_variable_combinations_replacing_term(final SubLObject variable, final SubLObject isa_constraints, final SubLObject genl_constraints, final SubLObject sentence, final SubLObject mt, final SubLObject v_term, final SubLObject replacing_var) {
        final SubLObject replaced_sentence = conses_high.subst(replacing_var, v_term, sentence, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED);
        return qu_get_variable_combinations(variable, isa_constraints, genl_constraints, replaced_sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 5675L)
    public static SubLObject qu_get_variable_combinations(final SubLObject variable, final SubLObject isa_constraints, final SubLObject genl_constraints, final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject replaceable_variables = (SubLObject)query_utilities.NIL;
        final SubLObject sentence_vars = list_utilities.tree_gather(sentence, (SubLObject)query_utilities.$sym3$CYC_VAR_, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED);
        SubLObject sentence_arg_constraints = (SubLObject)query_utilities.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
        try {
            wff_vars.$validate_expansionsP$.bind((SubLObject)query_utilities.T, thread);
            sentence_arg_constraints = at_var_types.formula_variables_arg_constraints_dict(sentence, mt, (SubLObject)query_utilities.$sym3$CYC_VAR_, (SubLObject)query_utilities.NIL);
        }
        finally {
            wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sentence_arg_constraints)); query_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject isa_genl_quoted_isa_consts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (query_utilities.NIL != var && query_utilities.NIL != subl_promotions.memberP(var, sentence_vars, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED) && query_utilities.NIL != qu_constraints_combination_okP(variable, isa_constraints, isa_genl_quoted_isa_consts.first(), (SubLObject)query_utilities.$kw4$ISA, mt) && query_utilities.NIL != qu_constraints_combination_okP(variable, genl_constraints, conses_high.second(isa_genl_quoted_isa_consts), (SubLObject)query_utilities.$kw5$GENLS, mt)) {
                replaceable_variables = (SubLObject)ConsesLow.cons(var, replaceable_variables);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return replaceable_variables;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 6847L)
    public static SubLObject qu_constraints_combination_okP(final SubLObject var, final SubLObject constraints1, final SubLObject constraints2, final SubLObject type, final SubLObject mt) {
        SubLObject total_constraints = ConsesLow.append(constraints1, constraints2);
        total_constraints = (SubLObject)ConsesLow.cons(var, total_constraints);
        return at_var_types.constraint_var_types_okP((SubLObject)ConsesLow.list(total_constraints), type, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 7281L)
    public static SubLObject qu_get_replaceable_variables_for_terms(final SubLObject sentence) {
        final SubLObject terms = qu_get_args_recursive(sentence);
        SubLObject replaced_sent = conses_high.copy_list(sentence);
        final SubLObject var_to_term_dict = dictionary.new_dictionary((SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)query_utilities.NIL;
        v_term = cdolist_list_var.first();
        while (query_utilities.NIL != cdolist_list_var) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(replaced_sent, (SubLObject)query_utilities.UNPROVIDED);
            dictionary.dictionary_enter(var_to_term_dict, new_var, v_term);
            replaced_sent = conses_high.subst(new_var, v_term, replaced_sent, Symbols.symbol_function((SubLObject)query_utilities.EQUAL), (SubLObject)query_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return var_to_term_dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 7993L)
    public static SubLObject qu_get_args_recursive(final SubLObject sentence) {
        SubLObject args = (SubLObject)query_utilities.NIL;
        if (query_utilities.NIL != el_utilities.el_logical_operator_formula_p(sentence) || query_utilities.NIL != el_utilities.possibly_el_quantified_sentence_p(sentence)) {
            SubLObject cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)query_utilities.UNPROVIDED);
            SubLObject sub_sentence = (SubLObject)query_utilities.NIL;
            sub_sentence = cdolist_list_var.first();
            while (query_utilities.NIL != cdolist_list_var) {
                if (query_utilities.NIL != el_utilities.el_formula_p(sub_sentence)) {
                    args = ConsesLow.append(args, qu_get_args_recursive(sub_sentence));
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_sentence = cdolist_list_var.first();
            }
            args = Sequences.remove_duplicates(args, Symbols.symbol_function((SubLObject)query_utilities.EQUAL), (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED);
        }
        else {
            SubLObject cdolist_list_var2;
            final SubLObject formula_args = cdolist_list_var2 = cycl_utilities.formula_args(sentence, (SubLObject)query_utilities.UNPROVIDED);
            SubLObject formula_arg = (SubLObject)query_utilities.NIL;
            formula_arg = cdolist_list_var2.first();
            while (query_utilities.NIL != cdolist_list_var2) {
                if (query_utilities.NIL == cycl_variables.el_varP(formula_arg)) {
                    args = (SubLObject)ConsesLow.cons(formula_arg, args);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                formula_arg = cdolist_list_var2.first();
            }
        }
        return args;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 8791L)
    public static SubLObject new_cyc_query_from_indexicalized_kbq(final SubLObject query_spec, final SubLObject v_term, SubLObject overriding_query_properties) {
        if (overriding_query_properties == query_utilities.UNPROVIDED) {
            overriding_query_properties = (SubLObject)query_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = overriding_query_properties;
        assert query_utilities.NIL != list_utilities.property_list_p(plist_var) : plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)query_utilities.NIL, remainder = plist_var; query_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert query_utilities.NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
        }
        SubLObject result = (SubLObject)query_utilities.NIL;
        SubLObject halt_reason = (SubLObject)query_utilities.NIL;
        SubLObject inference = (SubLObject)query_utilities.NIL;
        SubLObject metric_values = (SubLObject)query_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject raw_sentence = kb_query.kbq_query_arguments(query_spec, (SubLObject)query_utilities.UNPROVIDED);
        final SubLObject raw_mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
        final SubLObject sentence = indexicalized_query_substitute_term(v_term, raw_sentence);
        final SubLObject mt = indexicalized_query_substitute_term(v_term, raw_mt);
        thread.resetMultipleValues();
        final SubLObject result_$1 = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        final SubLObject halt_reason_$2 = thread.secondMultipleValue();
        final SubLObject inference_$3 = thread.thirdMultipleValue();
        final SubLObject metric_values_$4 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        result = result_$1;
        halt_reason = halt_reason_$2;
        inference = inference_$3;
        metric_values = metric_values_$4;
        return Values.values(result, halt_reason, inference, metric_values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 9649L)
    public static SubLObject indexicalized_query_term_for_indexical(final SubLObject indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return query_utilities.$indexicalized_query_term$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 9774L)
    public static SubLObject indexicalized_query_indexical_p(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(!query_utilities.$indexicalized_query_term$.getDynamicValue(thread).equal(expression) && query_utilities.NIL != kb_accessors.indexical_p(expression) && query_utilities.NIL == backward.removal_ask_variable((SubLObject)query_utilities.$sym9$_REFERENT, (SubLObject)ConsesLow.listS(query_utilities.$const10$indexicalReferent, expression, (SubLObject)query_utilities.$list11), query_utilities.$const1$InferencePSC, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED) && query_utilities.NIL == relation_evaluation.cyc_evaluate(expression) && query_utilities.NIL == cycl_utilities.expression_find(expression, query_utilities.$indexicalized_query_term$.getDynamicValue(thread), (SubLObject)query_utilities.NIL, Symbols.symbol_function((SubLObject)query_utilities.EQUAL), (SubLObject)query_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-utilities.lisp", position = 10257L)
    public static SubLObject indexicalized_query_substitute_term(final SubLObject v_term, final SubLObject raw_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)query_utilities.NIL;
        final SubLObject _prev_bind_0 = query_utilities.$indexicalized_query_term$.currentBinding(thread);
        try {
            query_utilities.$indexicalized_query_term$.bind(v_term, thread);
            ans = cycl_utilities.expression_transform(cycl_utilities.hl_to_el(raw_expression), (SubLObject)query_utilities.$sym12$INDEXICALIZED_QUERY_INDEXICAL_P, (SubLObject)query_utilities.$sym13$INDEXICALIZED_QUERY_TERM_FOR_INDEXICAL, (SubLObject)query_utilities.UNPROVIDED, (SubLObject)query_utilities.UNPROVIDED);
        }
        finally {
            query_utilities.$indexicalized_query_term$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    public static SubLObject declare_query_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "get_possible_sentence_combinations_wrt_argpos", "GET-POSSIBLE-SENTENCE-COMBINATIONS-WRT-ARGPOS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "get_possible_sentence_combinations_wrt_var", "GET-POSSIBLE-SENTENCE-COMBINATIONS-WRT-VAR", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "qu_get_possible_sentence_combinations_wrt_var_in_mt", "QU-GET-POSSIBLE-SENTENCE-COMBINATIONS-WRT-VAR-IN-MT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "qu_get_variable_combinations_replacing_term", "QU-GET-VARIABLE-COMBINATIONS-REPLACING-TERM", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "qu_get_variable_combinations", "QU-GET-VARIABLE-COMBINATIONS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "qu_constraints_combination_okP", "QU-CONSTRAINTS-COMBINATION-OK?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "qu_get_replaceable_variables_for_terms", "QU-GET-REPLACEABLE-VARIABLES-FOR-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "qu_get_args_recursive", "QU-GET-ARGS-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "new_cyc_query_from_indexicalized_kbq", "NEW-CYC-QUERY-FROM-INDEXICALIZED-KBQ", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "indexicalized_query_term_for_indexical", "INDEXICALIZED-QUERY-TERM-FOR-INDEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "indexicalized_query_indexical_p", "INDEXICALIZED-QUERY-INDEXICAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_utilities", "indexicalized_query_substitute_term", "INDEXICALIZED-QUERY-SUBSTITUTE-TERM", 2, 0, false);
        return (SubLObject)query_utilities.NIL;
    }
    
    public static SubLObject init_query_utilities_file() {
        query_utilities.$indexicalized_query_term$ = SubLFiles.defparameter("*INDEXICALIZED-QUERY-TERM*", (SubLObject)query_utilities.$kw8$UNINITIALIZED);
        return (SubLObject)query_utilities.NIL;
    }
    
    public static SubLObject setup_query_utilities_file() {
        return (SubLObject)query_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_query_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_query_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_query_utilities_file();
    }
    
    static {
        me = (SubLFile)new query_utilities();
        query_utilities.$indexicalized_query_term$ = null;
        $const0$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const1$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym2$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $sym3$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $kw4$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw5$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $sym6$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $sym7$QUERY_PROPERTY_P = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $kw8$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym9$_REFERENT = SubLObjectFactory.makeSymbol("?REFERENT");
        $const10$indexicalReferent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?REFERENT"));
        $sym12$INDEXICALIZED_QUERY_INDEXICAL_P = SubLObjectFactory.makeSymbol("INDEXICALIZED-QUERY-INDEXICAL-P");
        $sym13$INDEXICALIZED_QUERY_TERM_FOR_INDEXICAL = SubLObjectFactory.makeSymbol("INDEXICALIZED-QUERY-TERM-FOR-INDEXICAL");
    }
}

/*

	Total time: 199 ms
	
*/