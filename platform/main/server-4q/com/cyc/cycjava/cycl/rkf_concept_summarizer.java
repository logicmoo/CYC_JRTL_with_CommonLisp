package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_concept_summarizer extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_concept_summarizer();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_concept_summarizer";

    public static final String myFingerPrint = "ae785f2f75441a1c0fc1f18532bb2655d7d0460f124052fcbb474d7bbcdd69f6";

    // defparameter
    // Generality estimate above which is deemed too general
    private static final SubLSymbol $rkf_view_generality_cutoff$ = makeSymbol("*RKF-VIEW-GENERALITY-CUTOFF*");









    public static final SubLList $list4 = cons(makeSymbol("PREDICATE"), makeSymbol("ARGS"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static final SubLSymbol FIND_EQUAL = makeSymbol("FIND-EQUAL");

    public static final SubLSymbol SENTENCE_ARG2 = makeSymbol("SENTENCE-ARG2");

    public static final SubLList $list9 = list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, ONE_INTEGER);

    public static final SubLSymbol ARITY_OF_ARG2 = makeSymbol("ARITY-OF-ARG2");

    public static final SubLSymbol FORMULA_ARITY = makeSymbol("FORMULA-ARITY");

    public static final SubLList $list12 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));

    public static final SubLSymbol OPERATOR_OF_ARG2 = makeSymbol("OPERATOR-OF-ARG2");



    public static final SubLList $list15 = list(makeSymbol("?ARG2"));

    public static final SubLSymbol $sym16$_ARG1 = makeSymbol("?ARG1");

    public static final SubLList $list17 = list(reader_make_constant_shell(makeString("Collection")));

    private static final SubLObject $$nearestGenls = reader_make_constant_shell(makeString("nearestGenls"));

    public static final SubLList $list19 = cons(makeSymbol("VAR"), makeSymbol("VALUE"));

    private static final SubLInteger $int$100000 = makeInteger(100000);

    public static final SubLSymbol $sym21$_ = makeSymbol("<");



    public static final SubLSymbol $sym23$_FORMULA = makeSymbol("?FORMULA");

    private static final SubLObject $$inheritedTermSentences = reader_make_constant_shell(makeString("inheritedTermSentences"));

    public static final SubLList $list25 = list(makeSymbol("?FORMULA"));

    public static final SubLString $$$exampleSentences = makeString("exampleSentences");

    public static final SubLString $$$exampleFormulas = makeString("exampleFormulas");

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    public static SubLObject rkf_summarize(final SubLObject fort_or_naut, SubLObject mt, SubLObject include_nartsP) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (include_nartsP == UNPROVIDED) {
            include_nartsP = T;
        }
        if (NIL != forts.fort_p(fort_or_naut)) {
            final SubLObject fort_view_formulas = rkf_summarize_fort_view(fort_or_naut, mt);
            final SubLObject function_view_formulas = (NIL != include_nartsP) ? rkf_summarize_function_view(fort_or_naut, mt) : NIL;
            SubLObject view_formulas = nconc(fort_view_formulas, function_view_formulas);
            view_formulas = delete_duplicates(view_formulas, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            view_formulas = rkf_sort_view_formulas(fort_or_naut, view_formulas, UNPROVIDED);
            return view_formulas;
        }
        SubLObject view_formulas2;
        final SubLObject naut_view_formulas = view_formulas2 = rkf_summarize_naut_view(fort_or_naut, mt);
        view_formulas2 = delete_duplicates(view_formulas2, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        view_formulas2 = rkf_sort_view_formulas(fort_or_naut, view_formulas2, UNPROVIDED);
        return view_formulas2;
    }

    public static SubLObject rkf_summarize_fort_view(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLObject asserted_term_formulas = rkf_asserted_term_formulas(fort, mt);
        SubLObject fort_view_formulas = NIL;
        SubLObject cdolist_list_var = asserted_term_formulas;
        SubLObject asserted_term_formula = NIL;
        asserted_term_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, asserted_term_formula, mt)) {
                fort_view_formulas = cons(asserted_term_formula, fort_view_formulas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            asserted_term_formula = cdolist_list_var.first();
        } 
        return nreverse(fort_view_formulas);
    }

    public static SubLObject rkf_summarize_function_view(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLObject narts = indexing_utilities.dependent_narts(fort);
        SubLObject function_view_formulas = NIL;
        SubLObject cdolist_list_var = narts;
        SubLObject nart = NIL;
        nart = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1;
            final SubLObject nart_fort_view_formulas = cdolist_list_var_$1 = rkf_summarize_fort_view(nart, mt);
            SubLObject nart_fort_view_formula = NIL;
            nart_fort_view_formula = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                if (NIL == rkf_taxonomic_term_formula(nart, nart_fort_view_formula, mt)) {
                    function_view_formulas = cons(nart_fort_view_formula, function_view_formulas);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                nart_fort_view_formula = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            nart = cdolist_list_var.first();
        } 
        return nreverse(function_view_formulas);
    }

    public static SubLObject rkf_asserted_term_formulas(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject asserted_term_formulas = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject arg_keys = cdolist_list_var = kb_indexing.relevant_key_gaf_arg_index(fort, UNPROVIDED, UNPROVIDED);
            SubLObject arg_key = NIL;
            arg_key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$2;
                final SubLObject predicate_keys = cdolist_list_var_$2 = kb_indexing.relevant_key_gaf_arg_index(fort, arg_key, UNPROVIDED);
                SubLObject predicate = NIL;
                predicate = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, arg_key, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, arg_key, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$3 = NIL;
                                    final SubLObject token_var_$4 = NIL;
                                    while (NIL == done_var_$3) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                        if (NIL != valid_$5) {
                                            final SubLObject _prev_bind_0_$6 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                                            try {
                                                api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                                                final SubLObject formula = copy_tree(fi.assertion_fi_formula(assertion, UNPROVIDED));
                                                asserted_term_formulas = cons(formula, asserted_term_formulas);
                                            } finally {
                                                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0_$6, thread);
                                            }
                                        }
                                        done_var_$3 = makeBoolean(NIL == valid_$5);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    predicate = cdolist_list_var_$2.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                arg_key = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return asserted_term_formulas;
    }

    public static SubLObject rkf_taxonomic_term_formula(final SubLObject fort, final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        SubLObject predicate = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(formula, formula, $list4);
        predicate = formula.first();
        final SubLObject current = args = formula.rest();
        final SubLObject pcase_var = predicate;
        if (pcase_var.eql($$isa)) {
            return T;
        }
        if (pcase_var.eql($$genls)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject arity_of_arg2(final SubLObject formula) {
        return formula_arity(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject operator_of_arg2(final SubLObject formula) {
        return cycl_utilities.formula_operator(cycl_utilities.formula_arg2(formula, UNPROVIDED));
    }

    public static SubLObject rkf_sort_view_formulas(final SubLObject v_term, final SubLObject formulas, SubLObject istP) {
        if (istP == UNPROVIDED) {
            istP = NIL;
        }
        SubLObject formulas_not_directly_about_term = remove(v_term, formulas, symbol_function(FIND_EQUAL), NIL != istP ? SENTENCE_ARG2 : IDENTITY, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject formulas_directly_about_term = set_difference(formulas, formulas_not_directly_about_term, UNPROVIDED, UNPROVIDED);
        formulas_directly_about_term = list_utilities.sort_via_position(formulas_directly_about_term, $list9, symbol_function(EQL), NIL != istP ? ARITY_OF_ARG2 : FORMULA_ARITY);
        formulas_directly_about_term = list_utilities.stable_sort_via_position(formulas_directly_about_term, $list12, symbol_function(EQ), NIL != istP ? OPERATOR_OF_ARG2 : FORMULA_OPERATOR);
        formulas_not_directly_about_term = list_utilities.sort_via_position(formulas_not_directly_about_term, $list9, symbol_function(EQL), NIL != istP ? ARITY_OF_ARG2 : FORMULA_ARITY);
        return nconc(formulas_directly_about_term, formulas_not_directly_about_term);
    }

    public static SubLObject rkf_summarize_naut_view(final SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        SubLObject formulae = NIL;
        SubLObject cdolist_list_var;
        SubLObject queries = cdolist_list_var = list(listS($$isa, naut, $list15), list($$isa, $sym16$_ARG1, naut));
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject binding_lists = rkf_query_utilities.rkf_extract_bindings_from_results(rkf_query_utilities.rkf_query(query, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != binding_lists) {
                formulae = nconc(rkf_instantiate_formula(query, binding_lists), formulae);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        if (NIL != rkf_query_utilities.rkf_known(listS($$isa, naut, $list17), mt, UNPROVIDED)) {
            queries = cdolist_list_var = list(listS($$nearestGenls, naut, $list15), list($$nearestGenls, $sym16$_ARG1, naut));
            query = NIL;
            query = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject binding_lists = rkf_query_utilities.rkf_extract_bindings_from_results(rkf_query_utilities.rkf_query(query, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                final SubLObject nearest_genls_formulae = rkf_instantiate_formula(query, binding_lists);
                if (NIL != binding_lists) {
                    SubLObject cdolist_list_var_$8 = nearest_genls_formulae;
                    SubLObject formula = NIL;
                    formula = cdolist_list_var_$8.first();
                    while (NIL != cdolist_list_var_$8) {
                        formulae = cons(cycl_utilities.expression_nsubst($$genls, $$nearestGenls, formula, UNPROVIDED, UNPROVIDED), formulae);
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        formula = cdolist_list_var_$8.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                query = cdolist_list_var.first();
            } 
        }
        return nreverse(formulae);
    }

    public static SubLObject rkf_instantiate_formula(final SubLObject formula, final SubLObject binding_lists) {
        if (NIL == formula) {
            return NIL;
        }
        SubLObject formulae = NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject binding_list = NIL;
        binding_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject instance = copy_expression(formula);
            SubLObject cdolist_list_var_$9 = binding_list;
            SubLObject cons = NIL;
            cons = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject var = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list19);
                var = current.first();
                current = value = current.rest();
                instance = cycl_utilities.expression_nsubst(value, var, instance, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                cons = cdolist_list_var_$9.first();
            } 
            formulae = cons(instance, formulae);
            cdolist_list_var = cdolist_list_var.rest();
            binding_list = cdolist_list_var.first();
        } 
        return nreverse(formulae);
    }

    public static SubLObject find_equal(final SubLObject v_term, final SubLObject list) {
        return find(v_term, list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_summarize_all(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        final SubLObject local_view_formulas = rkf_summarize(fort, mt, UNPROVIDED);
        final SubLObject inherited_views = rkf_inherited_views(fort, mt);
        SubLObject all_view_formulas = list(list(fort, local_view_formulas));
        SubLObject cdolist_list_var = inherited_views;
        SubLObject inherited_view = NIL;
        inherited_view = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject inherited_view_formulas = rkf_summarize_inherited_view(fort, inherited_view, mt);
            if (NIL != inherited_view_formulas) {
                all_view_formulas = cons(list(inherited_view, inherited_view_formulas), all_view_formulas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inherited_view = cdolist_list_var.first();
        } 
        all_view_formulas = nreverse(all_view_formulas);
        return all_view_formulas;
    }

    public static SubLObject rkf_inherited_views(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject views = NIL;
        if (NIL != fort_types_interface.collectionP(fort)) {
            views = delete(fort, genls.all_genls(fort, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            views = isa.all_isa(fort, mt, UNPROVIDED);
        }
        views = rkf_relevance_utilities.rkf_filter_irrelevant_terms(views, mt);
        views = delete($rkf_view_generality_cutoff$.getDynamicValue(thread), views, symbol_function($sym21$_), symbol_function(GENERALITY_ESTIMATE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        views = Sort.sort(views, symbol_function($sym21$_), symbol_function(GENERALITY_ESTIMATE));
        return views;
    }

    public static SubLObject rkf_summarize_inherited_view(final SubLObject fort, final SubLObject view, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject view_formulas = NIL;
        final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $compute_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $unique_inference_result_bindings$.currentBinding(thread);
        try {
            $cache_inference_results$.bind(NIL, thread);
            $compute_inference_results$.bind(NIL, thread);
            $unique_inference_result_bindings$.bind(T, thread);
            view_formulas = ask_utilities.ask_template($sym23$_FORMULA, listS($$inheritedTermSentences, fort, view, $list25), mt, ONE_INTEGER, NIL, NIL, NIL);
        } finally {
            $unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
            $compute_inference_results$.rebind(_prev_bind_2, thread);
            $cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return view_formulas;
    }

    public static SubLObject rkf_example_predicate() {
        final SubLObject first_try = constants_high.find_constant($$$exampleSentences);
        if (NIL != first_try) {
            return first_try;
        }
        final SubLObject second_try = constants_high.find_constant($$$exampleFormulas);
        if (NIL != second_try) {
            return second_try;
        }
        return NIL;
    }

    public static SubLObject rkf_term_examples(final SubLObject fort, SubLObject number, SubLObject mt) {
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject examples = NIL;
        final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $compute_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $unique_inference_result_bindings$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            $cache_inference_results$.bind(NIL, thread);
            $compute_inference_results$.bind(NIL, thread);
            $unique_inference_result_bindings$.bind(T, thread);
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            examples = ask_utilities.ask_template($sym23$_FORMULA, listS(rkf_example_predicate(), fort, $list25), mt, NIL, number, UNPROVIDED, UNPROVIDED);
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_4, thread);
            $unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
            $compute_inference_results$.rebind(_prev_bind_2, thread);
            $cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return examples;
    }

    public static SubLObject rkf_unknown_term_formulas(final SubLObject fort, final SubLObject indexical, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject formulas = rkf_summarize(fort, mt, UNPROVIDED);
        formulas = copy_tree(formulas);
        formulas = subst(indexical, fort, formulas, symbol_function(EQUAL), UNPROVIDED);
        return formulas;
    }

    public static SubLObject rkf_asserted_sentences(final SubLObject fort_or_naut, final SubLObject domain_mt) {
        SubLObject sentences = (NIL != forts.fort_p(fort_or_naut)) ? rkf_asserted_sentences_for_fort(fort_or_naut, domain_mt) : rkf_asserted_sentences_for_naut(fort_or_naut, domain_mt);
        sentences = list_utilities.fast_delete_duplicates(sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sentences = rkf_sort_view_formulas(fort_or_naut, sentences, UNPROVIDED);
        return sentences;
    }

    public static SubLObject rkf_asserted_sentences_for_fort(final SubLObject fort, final SubLObject domain_mt) {
        final SubLObject assertions = kb_accessors.relevant_term_assertions(fort, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject sentences = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_high.asserted_assertionP(assertion)) {
                final SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
                if (NIL == rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, sentence, domain_mt)) {
                    sentences = cons(sentence, sentences);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return sentences;
    }

    public static SubLObject rkf_asserted_sentences_for_naut(final SubLObject naut, final SubLObject domain_mt) {
        return rkf_summarize_naut_view(naut, domain_mt);
    }

    public static SubLObject rkf_ist_sentences(final SubLObject fort_or_naut, final SubLObject domain_mt) {
        SubLObject sentences = (NIL != forts.fort_p(fort_or_naut)) ? rkf_ist_sentences_for_fort(fort_or_naut, domain_mt) : rkf_ist_sentences_for_naut(fort_or_naut, domain_mt);
        sentences = list_utilities.fast_delete_duplicates(sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sentences = rkf_sort_view_formulas(fort_or_naut, sentences, T);
        return sentences;
    }

    public static SubLObject rkf_ist_sentences_for_fort(final SubLObject fort, final SubLObject domain_mt) {
        final SubLObject assertions = kb_accessors.relevant_term_assertions(fort, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject sentences = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject hl_sentence = fi.assertion_hl_formula(assertion, UNPROVIDED);
            final SubLObject el_sentence = uncanonicalizer.assertion_el_formula(assertion);
            if ((NIL == rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, hl_sentence, domain_mt)) || (NIL == rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, el_sentence, domain_mt))) {
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                sentences = cons(list($$ist, mt, el_sentence), sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return sentences;
    }

    public static SubLObject rkf_ist_sentences_for_naut(final SubLObject naut, final SubLObject domain_mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var;
        final SubLObject sentences = cdolist_list_var = rkf_summarize_naut_view(naut, domain_mt);
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list($$ist, domain_mt, sentence), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject declare_rkf_concept_summarizer_file() {
        declareFunction(me, "rkf_summarize", "RKF-SUMMARIZE", 1, 2, false);
        declareFunction(me, "rkf_summarize_fort_view", "RKF-SUMMARIZE-FORT-VIEW", 1, 1, false);
        declareFunction(me, "rkf_summarize_function_view", "RKF-SUMMARIZE-FUNCTION-VIEW", 1, 1, false);
        declareFunction(me, "rkf_asserted_term_formulas", "RKF-ASSERTED-TERM-FORMULAS", 1, 1, false);
        declareFunction(me, "rkf_taxonomic_term_formula", "RKF-TAXONOMIC-TERM-FORMULA", 2, 1, false);
        declareFunction(me, "arity_of_arg2", "ARITY-OF-ARG2", 1, 0, false);
        declareFunction(me, "operator_of_arg2", "OPERATOR-OF-ARG2", 1, 0, false);
        declareFunction(me, "rkf_sort_view_formulas", "RKF-SORT-VIEW-FORMULAS", 2, 1, false);
        declareFunction(me, "rkf_summarize_naut_view", "RKF-SUMMARIZE-NAUT-VIEW", 1, 1, false);
        declareFunction(me, "rkf_instantiate_formula", "RKF-INSTANTIATE-FORMULA", 2, 0, false);
        declareFunction(me, "find_equal", "FIND-EQUAL", 2, 0, false);
        declareFunction(me, "rkf_summarize_all", "RKF-SUMMARIZE-ALL", 1, 1, false);
        declareFunction(me, "rkf_inherited_views", "RKF-INHERITED-VIEWS", 1, 1, false);
        declareFunction(me, "rkf_summarize_inherited_view", "RKF-SUMMARIZE-INHERITED-VIEW", 2, 1, false);
        declareFunction(me, "rkf_example_predicate", "RKF-EXAMPLE-PREDICATE", 0, 0, false);
        declareFunction(me, "rkf_term_examples", "RKF-TERM-EXAMPLES", 1, 2, false);
        declareFunction(me, "rkf_unknown_term_formulas", "RKF-UNKNOWN-TERM-FORMULAS", 2, 1, false);
        declareFunction(me, "rkf_asserted_sentences", "RKF-ASSERTED-SENTENCES", 2, 0, false);
        declareFunction(me, "rkf_asserted_sentences_for_fort", "RKF-ASSERTED-SENTENCES-FOR-FORT", 2, 0, false);
        declareFunction(me, "rkf_asserted_sentences_for_naut", "RKF-ASSERTED-SENTENCES-FOR-NAUT", 2, 0, false);
        declareFunction(me, "rkf_ist_sentences", "RKF-IST-SENTENCES", 2, 0, false);
        declareFunction(me, "rkf_ist_sentences_for_fort", "RKF-IST-SENTENCES-FOR-FORT", 2, 0, false);
        declareFunction(me, "rkf_ist_sentences_for_naut", "RKF-IST-SENTENCES-FOR-NAUT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_concept_summarizer_file() {
        defparameter("*RKF-VIEW-GENERALITY-CUTOFF*", $int$100000);
        return NIL;
    }

    public static SubLObject setup_rkf_concept_summarizer_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_concept_summarizer_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_concept_summarizer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_concept_summarizer_file();
    }

    
}

/**
 * Total time: 192 ms
 */
