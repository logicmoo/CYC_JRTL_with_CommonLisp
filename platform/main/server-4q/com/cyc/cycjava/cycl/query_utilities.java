/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_logical_operator_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_el_quantified_sentence_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      QUERY-UTILITIES
 * source file: /cyc/top/cycl/query-utilities.lisp
 * created:     2019/07/03 17:37:51
 */
public final class query_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new query_utilities();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $indexicalized_query_term$ = makeSymbol("*INDEXICALIZED-QUERY-TERM*");





    static private final SubLSymbol $sym3$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLSymbol $sym9$_REFERENT = makeSymbol("?REFERENT");



    static private final SubLList $list11 = list(makeSymbol("?REFERENT"));

    private static final SubLSymbol INDEXICALIZED_QUERY_INDEXICAL_P = makeSymbol("INDEXICALIZED-QUERY-INDEXICAL-P");

    private static final SubLSymbol INDEXICALIZED_QUERY_TERM_FOR_INDEXICAL = makeSymbol("INDEXICALIZED-QUERY-TERM-FOR-INDEXICAL");

    // Definitions
    public static final SubLObject get_possible_sentence_combinations_wrt_argpos_alt(SubLObject sentence, SubLObject mt, SubLObject arg_pos, SubLObject template_sentence, SubLObject template_mt) {
        {
            SubLObject arg_pos_term = cycl_utilities.formula_arg_position(sentence, arg_pos, UNPROVIDED);
            SubLObject new_sentence = copy_tree(sentence);
            if (NIL == variables.variable_p(arg_pos_term)) {
                arg_pos_term = czer_utilities.unique_el_var_wrt_expression(sentence, UNPROVIDED);
                new_sentence = cycl_utilities.formula_arg_position_subst(arg_pos_term, arg_pos, new_sentence);
            }
            return com.cyc.cycjava.cycl.query_utilities.get_possible_sentence_combinations_wrt_var(new_sentence, mt, template_sentence, template_mt, arg_pos_term);
        }
    }

    // Definitions
    public static SubLObject get_possible_sentence_combinations_wrt_argpos(final SubLObject sentence, final SubLObject mt, final SubLObject arg_pos, final SubLObject template_sentence, final SubLObject template_mt) {
        SubLObject arg_pos_term = cycl_utilities.formula_arg_position(sentence, arg_pos, UNPROVIDED);
        SubLObject new_sentence = copy_tree(sentence);
        if (NIL == variables.variable_p(arg_pos_term)) {
            arg_pos_term = czer_utilities.unique_el_var_wrt_expression(sentence, UNPROVIDED);
            new_sentence = cycl_utilities.formula_arg_position_subst(arg_pos_term, arg_pos, new_sentence);
        }
        return get_possible_sentence_combinations_wrt_var(new_sentence, mt, template_sentence, template_mt, arg_pos_term);
    }

    /**
     *
     *
     * @return listp; a list of terms and variables in SENTENCE2
    VARIABLE should be a variable in SENTENCE1, else nil is returned for both the list of variables and terms.
    VARIABLE can replace a variable or term in the output lists in the conjunction of SENTENCE1
    and SENTENCE2 without causing any disjointness in constraints in both MT1 and MT2.
     */
    @LispMethod(comment = "@return listp; a list of terms and variables in SENTENCE2\r\nVARIABLE should be a variable in SENTENCE1, else nil is returned for both the list of variables and terms.\r\nVARIABLE can replace a variable or term in the output lists in the conjunction of SENTENCE1\r\nand SENTENCE2 without causing any disjointness in constraints in both MT1 and MT2.")
    public static final SubLObject get_possible_sentence_combinations_wrt_var_alt(SubLObject sentence1, SubLObject mt1, SubLObject sentence2, SubLObject mt2, SubLObject variable) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject var_to_term_dict = com.cyc.cycjava.cycl.query_utilities.qu_get_replaceable_variables_for_terms(sentence2);
                SubLObject all_variables = NIL;
                if ((mt1 == $$EverythingPSC) || (mt1 == $$InferencePSC)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            all_variables = com.cyc.cycjava.cycl.query_utilities.qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt1, variable, var_to_term_dict);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    all_variables = remove_duplicates(all_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if ((mt2 == $$EverythingPSC) || (mt2 == $$InferencePSC)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                all_variables = com.cyc.cycjava.cycl.query_utilities.qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt2, variable, var_to_term_dict);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        all_variables = remove_duplicates(all_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        {
                            SubLObject combined_variables_in_mt1 = com.cyc.cycjava.cycl.query_utilities.qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt1, variable, var_to_term_dict);
                            SubLObject combined_variables_in_mt2 = com.cyc.cycjava.cycl.query_utilities.qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt2, variable, var_to_term_dict);
                            SubLObject temp_variables = NIL;
                            temp_variables = append(combined_variables_in_mt1, combined_variables_in_mt2);
                            temp_variables = remove_duplicates(temp_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = temp_variables;
                                SubLObject var = NIL;
                                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                                    if ((NIL != subl_promotions.memberP(var, combined_variables_in_mt1, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(var, combined_variables_in_mt2, UNPROVIDED, UNPROVIDED))) {
                                        all_variables = cons(var, all_variables);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject replaceable = NIL;
                    SubLObject cdolist_list_var = all_variables;
                    SubLObject combine_variable = NIL;
                    for (combine_variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , combine_variable = cdolist_list_var.first()) {
                        {
                            SubLObject v_term = dictionary.dictionary_lookup(var_to_term_dict, combine_variable, UNPROVIDED);
                            if (NIL != v_term) {
                                replaceable = cons(v_term, replaceable);
                            } else {
                                replaceable = cons(combine_variable, replaceable);
                            }
                        }
                    }
                    return replaceable;
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of terms and variables in SENTENCE2
    VARIABLE should be a variable in SENTENCE1, else nil is returned for both the list of variables and terms.
    VARIABLE can replace a variable or term in the output lists in the conjunction of SENTENCE1
    and SENTENCE2 without causing any disjointness in constraints in both MT1 and MT2.
     */
    @LispMethod(comment = "@return listp; a list of terms and variables in SENTENCE2\r\nVARIABLE should be a variable in SENTENCE1, else nil is returned for both the list of variables and terms.\r\nVARIABLE can replace a variable or term in the output lists in the conjunction of SENTENCE1\r\nand SENTENCE2 without causing any disjointness in constraints in both MT1 and MT2.")
    public static SubLObject get_possible_sentence_combinations_wrt_var(final SubLObject sentence1, final SubLObject mt1, final SubLObject sentence2, final SubLObject mt2, final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_to_term_dict = qu_get_replaceable_variables_for_terms(sentence2);
        SubLObject all_variables = NIL;
        if (mt1.eql($$EverythingPSC) || mt1.eql($$InferencePSC)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                all_variables = qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt1, variable, var_to_term_dict);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            all_variables = remove_duplicates(all_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (mt2.eql($$EverythingPSC) || mt2.eql($$InferencePSC)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    all_variables = qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt2, variable, var_to_term_dict);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                all_variables = remove_duplicates(all_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                final SubLObject combined_variables_in_mt1 = qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt1, variable, var_to_term_dict);
                final SubLObject combined_variables_in_mt2 = qu_get_possible_sentence_combinations_wrt_var_in_mt(sentence1, sentence2, mt2, variable, var_to_term_dict);
                SubLObject temp_variables = NIL;
                temp_variables = append(combined_variables_in_mt1, combined_variables_in_mt2);
                SubLObject cdolist_list_var;
                temp_variables = cdolist_list_var = remove_duplicates(temp_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject var = NIL;
                var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL != subl_promotions.memberP(var, combined_variables_in_mt1, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(var, combined_variables_in_mt2, UNPROVIDED, UNPROVIDED))) {
                        all_variables = cons(var, all_variables);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                } 
            }

        SubLObject replaceable = NIL;
        SubLObject cdolist_list_var2 = all_variables;
        SubLObject combine_variable = NIL;
        combine_variable = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject v_term = dictionary.dictionary_lookup(var_to_term_dict, combine_variable, UNPROVIDED);
            if (NIL != v_term) {
                replaceable = cons(v_term, replaceable);
            } else {
                replaceable = cons(combine_variable, replaceable);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            combine_variable = cdolist_list_var2.first();
        } 
        return replaceable;
    }

    /**
     *
     *
     * @return listp; a list of variables in SENTENCE2
    Internals of get-possible-sentence-combinations-wrt-var.
     */
    @LispMethod(comment = "@return listp; a list of variables in SENTENCE2\r\nInternals of get-possible-sentence-combinations-wrt-var.")
    public static final SubLObject qu_get_possible_sentence_combinations_wrt_var_in_mt_alt(SubLObject sentence1, SubLObject sentence2, SubLObject mt, SubLObject variable, SubLObject var_to_term_dict) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject combine_variables = NIL;
                SubLObject sentence1_arg_constraints = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                    try {
                        wff_vars.$validate_expansionsP$.bind(T, thread);
                        sentence1_arg_constraints = at_var_types.formula_variables_arg_constraints_dict(sentence1, mt, $sym3$CYC_VAR_, NIL);
                    } finally {
                        wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject variable_constraints = dictionary.dictionary_lookup(sentence1_arg_constraints, variable, UNPROVIDED);
                    SubLObject isa_constraints = variable_constraints.first();
                    SubLObject genl_constraints = second(variable_constraints);
                    SubLObject quoted_isa_constraints = third(variable_constraints);
                    if (NIL == variable_constraints) {
                        return NIL;
                    }
                    combine_variables = com.cyc.cycjava.cycl.query_utilities.qu_get_variable_combinations(variable, isa_constraints, genl_constraints, sentence2, mt);
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_to_term_dict));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject v_term = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                combine_variables = append(combine_variables, com.cyc.cycjava.cycl.query_utilities.qu_get_variable_combinations_replacing_term(variable, isa_constraints, genl_constraints, sentence2, mt, v_term, var));
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
                return combine_variables;
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of variables in SENTENCE2
    Internals of get-possible-sentence-combinations-wrt-var.
     */
    @LispMethod(comment = "@return listp; a list of variables in SENTENCE2\r\nInternals of get-possible-sentence-combinations-wrt-var.")
    public static SubLObject qu_get_possible_sentence_combinations_wrt_var_in_mt(final SubLObject sentence1, final SubLObject sentence2, final SubLObject mt, final SubLObject variable, final SubLObject var_to_term_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject combine_variables = NIL;
        SubLObject sentence1_arg_constraints = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
        try {
            wff_vars.$validate_expansionsP$.bind(T, thread);
            sentence1_arg_constraints = at_var_types.formula_variables_arg_constraints_dict(sentence1, mt, $sym3$CYC_VAR_, NIL);
        } finally {
            wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject variable_constraints = dictionary.dictionary_lookup(sentence1_arg_constraints, variable, UNPROVIDED);
        final SubLObject isa_constraints = variable_constraints.first();
        final SubLObject genl_constraints = second(variable_constraints);
        final SubLObject quoted_isa_constraints = third(variable_constraints);
        if (NIL == variable_constraints) {
            return NIL;
        }
        combine_variables = qu_get_variable_combinations(variable, isa_constraints, genl_constraints, sentence2, mt);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_to_term_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject v_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            combine_variables = append(combine_variables, qu_get_variable_combinations_replacing_term(variable, isa_constraints, genl_constraints, sentence2, mt, v_term, var));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return combine_variables;
    }

    /**
     * Replace REPLACING-VAR for TERM in SENTENCE and then find the variables of SENTENCE which do not have
     * constraints disjoint from the constraints on VARIABLE. The constraints on VARIABLE are specified
     * in ISA-CONSTRAINTS and GENL-CONSTRAINTS.  The disjointness checking in done in MT.
     *
     * @return listp; returns a list of variables from SENTENCE which do not have constraints disjoint
    from constraints on VARIABLE.
     */
    @LispMethod(comment = "Replace REPLACING-VAR for TERM in SENTENCE and then find the variables of SENTENCE which do not have\r\nconstraints disjoint from the constraints on VARIABLE. The constraints on VARIABLE are specified\r\nin ISA-CONSTRAINTS and GENL-CONSTRAINTS.  The disjointness checking in done in MT.\r\n\r\n@return listp; returns a list of variables from SENTENCE which do not have constraints disjoint\r\nfrom constraints on VARIABLE.\nReplace REPLACING-VAR for TERM in SENTENCE and then find the variables of SENTENCE which do not have\nconstraints disjoint from the constraints on VARIABLE. The constraints on VARIABLE are specified\nin ISA-CONSTRAINTS and GENL-CONSTRAINTS.  The disjointness checking in done in MT.")
    public static final SubLObject qu_get_variable_combinations_replacing_term_alt(SubLObject variable, SubLObject isa_constraints, SubLObject genl_constraints, SubLObject sentence, SubLObject mt, SubLObject v_term, SubLObject replacing_var) {
        {
            SubLObject replaced_sentence = subst(replacing_var, v_term, sentence, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.query_utilities.qu_get_variable_combinations(variable, isa_constraints, genl_constraints, replaced_sentence, mt);
        }
    }

    @LispMethod(comment = "Replace REPLACING-VAR for TERM in SENTENCE and then find the variables of SENTENCE which do not have\r\nconstraints disjoint from the constraints on VARIABLE. The constraints on VARIABLE are specified\r\nin ISA-CONSTRAINTS and GENL-CONSTRAINTS.  The disjointness checking in done in MT.\r\n\r\n@return listp; returns a list of variables from SENTENCE which do not have constraints disjoint\r\nfrom constraints on VARIABLE.\nReplace REPLACING-VAR for TERM in SENTENCE and then find the variables of SENTENCE which do not have\nconstraints disjoint from the constraints on VARIABLE. The constraints on VARIABLE are specified\nin ISA-CONSTRAINTS and GENL-CONSTRAINTS.  The disjointness checking in done in MT.")
    public static SubLObject qu_get_variable_combinations_replacing_term(final SubLObject variable, final SubLObject isa_constraints, final SubLObject genl_constraints, final SubLObject sentence, final SubLObject mt, final SubLObject v_term, final SubLObject replacing_var) {
        final SubLObject replaced_sentence = subst(replacing_var, v_term, sentence, UNPROVIDED, UNPROVIDED);
        return qu_get_variable_combinations(variable, isa_constraints, genl_constraints, replaced_sentence, mt);
    }/**
     * Replace REPLACING-VAR for TERM in SENTENCE and then find the variables of SENTENCE which do not have
     * constraints disjoint from the constraints on VARIABLE. The constraints on VARIABLE are specified
     * in ISA-CONSTRAINTS and GENL-CONSTRAINTS.  The disjointness checking in done in MT.
     *
     * @return listp; returns a list of variables from SENTENCE which do not have constraints disjoint
    from constraints on VARIABLE.
     */


    /**
     * Find the variables which do not have constraints disjoint from the constraints on VARIABLE.
     * The constraints on VARIABLE are specified in ISA-CONSTRAINTS and  GENL-CONSTRAINTS.
     * The disjointness checking in done in MT.
     *
     * @return listp; returns a list of variables from SENTENCE which do not have constraints disjoint
    from constraints on VARIABLE.
     */
    @LispMethod(comment = "Find the variables which do not have constraints disjoint from the constraints on VARIABLE.\r\nThe constraints on VARIABLE are specified in ISA-CONSTRAINTS and  GENL-CONSTRAINTS.\r\nThe disjointness checking in done in MT.\r\n\r\n@return listp; returns a list of variables from SENTENCE which do not have constraints disjoint\r\nfrom constraints on VARIABLE.\nFind the variables which do not have constraints disjoint from the constraints on VARIABLE.\nThe constraints on VARIABLE are specified in ISA-CONSTRAINTS and  GENL-CONSTRAINTS.\nThe disjointness checking in done in MT.")
    public static final SubLObject qu_get_variable_combinations_alt(SubLObject variable, SubLObject isa_constraints, SubLObject genl_constraints, SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject replaceable_variables = NIL;
                SubLObject sentence_vars = list_utilities.tree_gather(sentence, $sym3$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject sentence_arg_constraints = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                    try {
                        wff_vars.$validate_expansionsP$.bind(T, thread);
                        sentence_arg_constraints = at_var_types.formula_variables_arg_constraints_dict(sentence, mt, $sym3$CYC_VAR_, NIL);
                    } finally {
                        wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sentence_arg_constraints));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject isa_genl_quoted_isa_consts = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != var) && (NIL != subl_promotions.memberP(var, sentence_vars, UNPROVIDED, UNPROVIDED))) {
                                if ((NIL != com.cyc.cycjava.cycl.query_utilities.qu_constraints_combination_okP(variable, isa_constraints, isa_genl_quoted_isa_consts.first(), $ISA, mt)) && (NIL != com.cyc.cycjava.cycl.query_utilities.qu_constraints_combination_okP(variable, genl_constraints, second(isa_genl_quoted_isa_consts), $GENLS, mt))) {
                                    replaceable_variables = cons(var, replaceable_variables);
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return replaceable_variables;
            }
        }
    }

    /**
     * Find the variables which do not have constraints disjoint from the constraints on VARIABLE.
     * The constraints on VARIABLE are specified in ISA-CONSTRAINTS and  GENL-CONSTRAINTS.
     * The disjointness checking in done in MT.
     *
     * @return listp; returns a list of variables from SENTENCE which do not have constraints disjoint
    from constraints on VARIABLE.
     */
    @LispMethod(comment = "Find the variables which do not have constraints disjoint from the constraints on VARIABLE.\r\nThe constraints on VARIABLE are specified in ISA-CONSTRAINTS and  GENL-CONSTRAINTS.\r\nThe disjointness checking in done in MT.\r\n\r\n@return listp; returns a list of variables from SENTENCE which do not have constraints disjoint\r\nfrom constraints on VARIABLE.\nFind the variables which do not have constraints disjoint from the constraints on VARIABLE.\nThe constraints on VARIABLE are specified in ISA-CONSTRAINTS and  GENL-CONSTRAINTS.\nThe disjointness checking in done in MT.")
    public static SubLObject qu_get_variable_combinations(final SubLObject variable, final SubLObject isa_constraints, final SubLObject genl_constraints, final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject replaceable_variables = NIL;
        final SubLObject sentence_vars = list_utilities.tree_gather(sentence, $sym3$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject sentence_arg_constraints = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding(thread);
        try {
            wff_vars.$validate_expansionsP$.bind(T, thread);
            sentence_arg_constraints = at_var_types.formula_variables_arg_constraints_dict(sentence, mt, $sym3$CYC_VAR_, NIL);
        } finally {
            wff_vars.$validate_expansionsP$.rebind(_prev_bind_0, thread);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sentence_arg_constraints)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject isa_genl_quoted_isa_consts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((((NIL != var) && (NIL != subl_promotions.memberP(var, sentence_vars, UNPROVIDED, UNPROVIDED))) && (NIL != qu_constraints_combination_okP(variable, isa_constraints, isa_genl_quoted_isa_consts.first(), $ISA, mt))) && (NIL != qu_constraints_combination_okP(variable, genl_constraints, second(isa_genl_quoted_isa_consts), $GENLS, mt))) {
                replaceable_variables = cons(var, replaceable_variables);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return replaceable_variables;
    }

    /**
     *
     *
     * @return booleanp; returns whether the CONSTRAINTS1 and CONSTRAINTS2 together do not have any
    disjointness with regards to TYPE in MT.
    TYPE can be either :isa or :genls
     */
    @LispMethod(comment = "@return booleanp; returns whether the CONSTRAINTS1 and CONSTRAINTS2 together do not have any\r\ndisjointness with regards to TYPE in MT.\r\nTYPE can be either :isa or :genls")
    public static final SubLObject qu_constraints_combination_okP_alt(SubLObject var, SubLObject constraints1, SubLObject constraints2, SubLObject type, SubLObject mt) {
        {
            SubLObject total_constraints = append(constraints1, constraints2);
            total_constraints = cons(var, total_constraints);
            return at_var_types.constraint_var_types_okP(list(total_constraints), type, mt);
        }
    }

    /**
     *
     *
     * @return booleanp; returns whether the CONSTRAINTS1 and CONSTRAINTS2 together do not have any
    disjointness with regards to TYPE in MT.
    TYPE can be either :isa or :genls
     */
    @LispMethod(comment = "@return booleanp; returns whether the CONSTRAINTS1 and CONSTRAINTS2 together do not have any\r\ndisjointness with regards to TYPE in MT.\r\nTYPE can be either :isa or :genls")
    public static SubLObject qu_constraints_combination_okP(final SubLObject var, final SubLObject constraints1, final SubLObject constraints2, final SubLObject type, final SubLObject mt) {
        SubLObject total_constraints = append(constraints1, constraints2);
        total_constraints = cons(var, total_constraints);
        return at_var_types.constraint_var_types_okP(list(total_constraints), type, mt);
    }

    /**
     *
     *
     * @return dictionary-p; returns a dictionary containing mapping from
    variables to terms of the SENTENCE. Replacing the variable instead
    of the term in the SENTENCE should will not cause any overlapping
    with existing variables of the SENTENCE.
     */
    @LispMethod(comment = "@return dictionary-p; returns a dictionary containing mapping from\r\nvariables to terms of the SENTENCE. Replacing the variable instead\r\nof the term in the SENTENCE should will not cause any overlapping\r\nwith existing variables of the SENTENCE.")
    public static final SubLObject qu_get_replaceable_variables_for_terms_alt(SubLObject sentence) {
        {
            SubLObject terms = com.cyc.cycjava.cycl.query_utilities.qu_get_args_recursive(sentence);
            SubLObject replaced_sent = copy_list(sentence);
            SubLObject var_to_term_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(replaced_sent, UNPROVIDED);
                    dictionary.dictionary_enter(var_to_term_dict, new_var, v_term);
                    replaced_sent = subst(new_var, v_term, replaced_sent, symbol_function(EQUAL), UNPROVIDED);
                }
            }
            return var_to_term_dict;
        }
    }

    /**
     *
     *
     * @return dictionary-p; returns a dictionary containing mapping from
    variables to terms of the SENTENCE. Replacing the variable instead
    of the term in the SENTENCE should will not cause any overlapping
    with existing variables of the SENTENCE.
     */
    @LispMethod(comment = "@return dictionary-p; returns a dictionary containing mapping from\r\nvariables to terms of the SENTENCE. Replacing the variable instead\r\nof the term in the SENTENCE should will not cause any overlapping\r\nwith existing variables of the SENTENCE.")
    public static SubLObject qu_get_replaceable_variables_for_terms(final SubLObject sentence) {
        final SubLObject terms = qu_get_args_recursive(sentence);
        SubLObject replaced_sent = copy_list(sentence);
        final SubLObject var_to_term_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(replaced_sent, UNPROVIDED);
            dictionary.dictionary_enter(var_to_term_dict, new_var, v_term);
            replaced_sent = subst(new_var, v_term, replaced_sent, symbol_function(EQUAL), UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return var_to_term_dict;
    }

    /**
     *
     *
     * @return listp; a list of terms from sentence which are args of the top-level
    predicate literals in the sentence. Doesnt descend into function formulas or sentences
    inside top-level predicate literal.
     */
    @LispMethod(comment = "@return listp; a list of terms from sentence which are args of the top-level\r\npredicate literals in the sentence. Doesnt descend into function formulas or sentences\r\ninside top-level predicate literal.")
    public static final SubLObject qu_get_args_recursive_alt(SubLObject sentence) {
        {
            SubLObject args = NIL;
            if ((NIL != el_logical_operator_formula_p(sentence)) || (NIL != possibly_el_quantified_sentence_p(sentence))) {
                {
                    SubLObject cdolist_list_var = cycl_utilities.formula_args(sentence, UNPROVIDED);
                    SubLObject sub_sentence = NIL;
                    for (sub_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_sentence = cdolist_list_var.first()) {
                        if (NIL != el_formula_p(sub_sentence)) {
                            args = append(args, com.cyc.cycjava.cycl.query_utilities.qu_get_args_recursive(sub_sentence));
                        }
                    }
                    args = remove_duplicates(args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                {
                    SubLObject formula_args = cycl_utilities.formula_args(sentence, UNPROVIDED);
                    SubLObject cdolist_list_var = formula_args;
                    SubLObject formula_arg = NIL;
                    for (formula_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_arg = cdolist_list_var.first()) {
                        if (NIL == cycl_variables.el_varP(formula_arg)) {
                            args = cons(formula_arg, args);
                        }
                    }
                }
            }
            return args;
        }
    }

    /**
     *
     *
     * @return listp; a list of terms from sentence which are args of the top-level
    predicate literals in the sentence. Doesnt descend into function formulas or sentences
    inside top-level predicate literal.
     */
    @LispMethod(comment = "@return listp; a list of terms from sentence which are args of the top-level\r\npredicate literals in the sentence. Doesnt descend into function formulas or sentences\r\ninside top-level predicate literal.")
    public static SubLObject qu_get_args_recursive(final SubLObject sentence) {
        SubLObject args = NIL;
        if ((NIL != el_logical_operator_formula_p(sentence)) || (NIL != possibly_el_quantified_sentence_p(sentence))) {
            SubLObject cdolist_list_var = cycl_utilities.formula_args(sentence, UNPROVIDED);
            SubLObject sub_sentence = NIL;
            sub_sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != el_formula_p(sub_sentence)) {
                    args = append(args, qu_get_args_recursive(sub_sentence));
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_sentence = cdolist_list_var.first();
            } 
            args = remove_duplicates(args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            SubLObject cdolist_list_var2;
            final SubLObject formula_args = cdolist_list_var2 = cycl_utilities.formula_args(sentence, UNPROVIDED);
            SubLObject formula_arg = NIL;
            formula_arg = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL == cycl_variables.el_varP(formula_arg)) {
                    args = cons(formula_arg, args);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                formula_arg = cdolist_list_var2.first();
            } 
        }
        return args;
    }

    public static final SubLObject new_cyc_query_from_indexicalized_kbq_alt(SubLObject query_spec, SubLObject v_term, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = overriding_query_properties;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, QUERY_PROPERTY_P);
                        }
                    }
                }
            }
            {
                SubLObject result = NIL;
                SubLObject halt_reason = NIL;
                SubLObject inference = NIL;
                SubLObject metric_values = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject raw_sentence = kb_query.kbq_query_arguments(query_spec);
                    SubLObject raw_mt = thread.secondMultipleValue();
                    SubLObject query_properties = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    query_properties = inference_datastructures_enumerated_types.merge_query_properties(query_properties, overriding_query_properties);
                    {
                        SubLObject sentence = com.cyc.cycjava.cycl.query_utilities.indexicalized_query_substitute_term(v_term, raw_sentence);
                        SubLObject mt = com.cyc.cycjava.cycl.query_utilities.indexicalized_query_substitute_term(v_term, raw_mt);
                        thread.resetMultipleValues();
                        {
                            SubLObject result_1 = inference_kernel.new_cyc_query(sentence, mt, query_properties);
                            SubLObject halt_reason_2 = thread.secondMultipleValue();
                            SubLObject inference_3 = thread.thirdMultipleValue();
                            SubLObject metric_values_4 = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            result = result_1;
                            halt_reason = halt_reason_2;
                            inference = inference_3;
                            metric_values = metric_values_4;
                        }
                    }
                }
                return values(result, halt_reason, inference, metric_values);
            }
        }
    }

    public static SubLObject new_cyc_query_from_indexicalized_kbq(final SubLObject query_spec, final SubLObject v_term, SubLObject overriding_query_properties) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject plist_var = overriding_query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "! inference_datastructures_enumerated_types.query_property_p(property) " + ("inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) ") + property;
        }
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject metric_values = NIL;
        thread.resetMultipleValues();
        final SubLObject raw_sentence = kb_query.kbq_query_arguments(query_spec, UNPROVIDED);
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
        return values(result, halt_reason, inference, metric_values);
    }

    public static final SubLObject indexicalized_query_term_for_indexical_alt(SubLObject indexical) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $indexicalized_query_term$.getDynamicValue(thread);
        }
    }

    public static SubLObject indexicalized_query_term_for_indexical(final SubLObject indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $indexicalized_query_term$.getDynamicValue(thread);
    }

    public static final SubLObject indexicalized_query_indexical_p_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((((!$indexicalized_query_term$.getDynamicValue(thread).equal(expression)) && (NIL != kb_accessors.indexical_p(expression))) && (NIL == backward.removal_ask_variable($sym9$_REFERENT, listS($$indexicalReferent, expression, $list_alt11), $$InferencePSC, UNPROVIDED, UNPROVIDED))) && (NIL == relation_evaluation.cyc_evaluate(expression)));
        }
    }

    public static SubLObject indexicalized_query_indexical_p(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((((!$indexicalized_query_term$.getDynamicValue(thread).equal(expression)) && (NIL != kb_accessors.indexical_p(expression))) && (NIL == backward.removal_ask_variable($sym9$_REFERENT, listS($$indexicalReferent, expression, $list11), $$InferencePSC, UNPROVIDED, UNPROVIDED))) && (NIL == relation_evaluation.cyc_evaluate(expression))) && (NIL == cycl_utilities.expression_find(expression, $indexicalized_query_term$.getDynamicValue(thread), NIL, symbol_function(EQUAL), UNPROVIDED)));
    }

    public static final SubLObject indexicalized_query_substitute_term_alt(SubLObject v_term, SubLObject raw_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $indexicalized_query_term$.currentBinding(thread);
                    try {
                        $indexicalized_query_term$.bind(v_term, thread);
                        ans = cycl_utilities.expression_transform(cycl_utilities.hl_to_el(raw_expression), INDEXICALIZED_QUERY_INDEXICAL_P, INDEXICALIZED_QUERY_TERM_FOR_INDEXICAL, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $indexicalized_query_term$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject indexicalized_query_substitute_term(final SubLObject v_term, final SubLObject raw_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $indexicalized_query_term$.currentBinding(thread);
        try {
            $indexicalized_query_term$.bind(v_term, thread);
            ans = cycl_utilities.expression_transform(cycl_utilities.hl_to_el(raw_expression), INDEXICALIZED_QUERY_INDEXICAL_P, INDEXICALIZED_QUERY_TERM_FOR_INDEXICAL, UNPROVIDED, UNPROVIDED);
        } finally {
            $indexicalized_query_term$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject declare_query_utilities_file() {
        declareFunction("get_possible_sentence_combinations_wrt_argpos", "GET-POSSIBLE-SENTENCE-COMBINATIONS-WRT-ARGPOS", 5, 0, false);
        declareFunction("get_possible_sentence_combinations_wrt_var", "GET-POSSIBLE-SENTENCE-COMBINATIONS-WRT-VAR", 5, 0, false);
        declareFunction("qu_get_possible_sentence_combinations_wrt_var_in_mt", "QU-GET-POSSIBLE-SENTENCE-COMBINATIONS-WRT-VAR-IN-MT", 5, 0, false);
        declareFunction("qu_get_variable_combinations_replacing_term", "QU-GET-VARIABLE-COMBINATIONS-REPLACING-TERM", 7, 0, false);
        declareFunction("qu_get_variable_combinations", "QU-GET-VARIABLE-COMBINATIONS", 5, 0, false);
        declareFunction("qu_constraints_combination_okP", "QU-CONSTRAINTS-COMBINATION-OK?", 5, 0, false);
        declareFunction("qu_get_replaceable_variables_for_terms", "QU-GET-REPLACEABLE-VARIABLES-FOR-TERMS", 1, 0, false);
        declareFunction("qu_get_args_recursive", "QU-GET-ARGS-RECURSIVE", 1, 0, false);
        declareFunction("new_cyc_query_from_indexicalized_kbq", "NEW-CYC-QUERY-FROM-INDEXICALIZED-KBQ", 2, 1, false);
        declareFunction("indexicalized_query_term_for_indexical", "INDEXICALIZED-QUERY-TERM-FOR-INDEXICAL", 1, 0, false);
        declareFunction("indexicalized_query_indexical_p", "INDEXICALIZED-QUERY-INDEXICAL-P", 1, 0, false);
        declareFunction("indexicalized_query_substitute_term", "INDEXICALIZED-QUERY-SUBSTITUTE-TERM", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_query_utilities_file() {
        defparameter("*INDEXICALIZED-QUERY-TERM*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_query_utilities_file() {
        return NIL;
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
    }

    static private final SubLList $list_alt11 = list(makeSymbol("?REFERENT"));
}

/**
 * Total time: 199 ms
 */
