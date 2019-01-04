package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_concept_summarizer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_concept_summarizer";
    public static final String myFingerPrint = "ae785f2f75441a1c0fc1f18532bb2655d7d0460f124052fcbb474d7bbcdd69f6";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 7642L)
    private static SubLSymbol $rkf_view_generality_cutoff$;
    private static final SubLSymbol $sym0$FORT_P;
    private static final SubLSymbol $sym1$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $kw2$GAF;
    private static final SubLSymbol $kw3$TRUE;
    private static final SubLList $list4;
    private static final SubLObject $const5$isa;
    private static final SubLObject $const6$genls;
    private static final SubLSymbol $sym7$FIND_EQUAL;
    private static final SubLSymbol $sym8$SENTENCE_ARG2;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$ARITY_OF_ARG2;
    private static final SubLSymbol $sym11$FORMULA_ARITY;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$OPERATOR_OF_ARG2;
    private static final SubLSymbol $sym14$FORMULA_OPERATOR;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$_ARG1;
    private static final SubLList $list17;
    private static final SubLObject $const18$nearestGenls;
    private static final SubLList $list19;
    private static final SubLInteger $int20$100000;
    private static final SubLSymbol $sym21$_;
    private static final SubLSymbol $sym22$GENERALITY_ESTIMATE;
    private static final SubLSymbol $sym23$_FORMULA;
    private static final SubLObject $const24$inheritedTermSentences;
    private static final SubLList $list25;
    private static final SubLString $str26$exampleSentences;
    private static final SubLString $str27$exampleFormulas;
    private static final SubLObject $const28$ist;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 800L)
    public static SubLObject rkf_summarize(final SubLObject fort_or_naut, SubLObject mt, SubLObject include_nartsP) {
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        if (include_nartsP == rkf_concept_summarizer.UNPROVIDED) {
            include_nartsP = (SubLObject)rkf_concept_summarizer.T;
        }
        if (rkf_concept_summarizer.NIL != forts.fort_p(fort_or_naut)) {
            final SubLObject fort_view_formulas = rkf_summarize_fort_view(fort_or_naut, mt);
            final SubLObject function_view_formulas = (SubLObject)((rkf_concept_summarizer.NIL != include_nartsP) ? rkf_summarize_function_view(fort_or_naut, mt) : rkf_concept_summarizer.NIL);
            SubLObject view_formulas = ConsesLow.nconc(fort_view_formulas, function_view_formulas);
            view_formulas = Sequences.delete_duplicates(view_formulas, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.EQUAL), (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
            view_formulas = rkf_sort_view_formulas(fort_or_naut, view_formulas, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
            return view_formulas;
        }
        SubLObject view_formulas2;
        final SubLObject naut_view_formulas = view_formulas2 = rkf_summarize_naut_view(fort_or_naut, mt);
        view_formulas2 = Sequences.delete_duplicates(view_formulas2, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.EQUAL), (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        view_formulas2 = rkf_sort_view_formulas(fort_or_naut, view_formulas2, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        return view_formulas2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 1948L)
    public static SubLObject rkf_summarize_fort_view(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLObject asserted_term_formulas = rkf_asserted_term_formulas(fort, mt);
        SubLObject fort_view_formulas = (SubLObject)rkf_concept_summarizer.NIL;
        SubLObject cdolist_list_var = asserted_term_formulas;
        SubLObject asserted_term_formula = (SubLObject)rkf_concept_summarizer.NIL;
        asserted_term_formula = cdolist_list_var.first();
        while (rkf_concept_summarizer.NIL != cdolist_list_var) {
            if (rkf_concept_summarizer.NIL == rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, asserted_term_formula, mt)) {
                fort_view_formulas = (SubLObject)ConsesLow.cons(asserted_term_formula, fort_view_formulas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            asserted_term_formula = cdolist_list_var.first();
        }
        return Sequences.nreverse(fort_view_formulas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 2405L)
    public static SubLObject rkf_summarize_function_view(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLObject narts = indexing_utilities.dependent_narts(fort);
        SubLObject function_view_formulas = (SubLObject)rkf_concept_summarizer.NIL;
        SubLObject cdolist_list_var = narts;
        SubLObject nart = (SubLObject)rkf_concept_summarizer.NIL;
        nart = cdolist_list_var.first();
        while (rkf_concept_summarizer.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1;
            final SubLObject nart_fort_view_formulas = cdolist_list_var_$1 = rkf_summarize_fort_view(nart, mt);
            SubLObject nart_fort_view_formula = (SubLObject)rkf_concept_summarizer.NIL;
            nart_fort_view_formula = cdolist_list_var_$1.first();
            while (rkf_concept_summarizer.NIL != cdolist_list_var_$1) {
                if (rkf_concept_summarizer.NIL == rkf_taxonomic_term_formula(nart, nart_fort_view_formula, mt)) {
                    function_view_formulas = (SubLObject)ConsesLow.cons(nart_fort_view_formula, function_view_formulas);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                nart_fort_view_formula = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            nart = cdolist_list_var.first();
        }
        return Sequences.nreverse(function_view_formulas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 3015L)
    public static SubLObject rkf_asserted_term_formulas(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_concept_summarizer.NIL != forts.fort_p(fort) : fort;
        SubLObject asserted_term_formulas = (SubLObject)rkf_concept_summarizer.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_concept_summarizer.$sym1$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject arg_keys = cdolist_list_var = kb_indexing.relevant_key_gaf_arg_index(fort, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
            SubLObject arg_key = (SubLObject)rkf_concept_summarizer.NIL;
            arg_key = cdolist_list_var.first();
            while (rkf_concept_summarizer.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$2;
                final SubLObject predicate_keys = cdolist_list_var_$2 = kb_indexing.relevant_key_gaf_arg_index(fort, arg_key, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
                SubLObject predicate = (SubLObject)rkf_concept_summarizer.NIL;
                predicate = cdolist_list_var_$2.first();
                while (rkf_concept_summarizer.NIL != cdolist_list_var_$2) {
                    final SubLObject pred_var = predicate;
                    if (rkf_concept_summarizer.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, arg_key, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, arg_key, pred_var);
                        SubLObject done_var = (SubLObject)rkf_concept_summarizer.NIL;
                        final SubLObject token_var = (SubLObject)rkf_concept_summarizer.NIL;
                        while (rkf_concept_summarizer.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (rkf_concept_summarizer.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)rkf_concept_summarizer.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rkf_concept_summarizer.$kw2$GAF, (SubLObject)rkf_concept_summarizer.$kw3$TRUE, (SubLObject)rkf_concept_summarizer.NIL);
                                    SubLObject done_var_$3 = (SubLObject)rkf_concept_summarizer.NIL;
                                    final SubLObject token_var_$4 = (SubLObject)rkf_concept_summarizer.NIL;
                                    while (rkf_concept_summarizer.NIL == done_var_$3) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                                        if (rkf_concept_summarizer.NIL != valid_$5) {
                                            final SubLObject _prev_bind_0_$6 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                                            try {
                                                api_control_vars.$generate_readable_fi_results$.bind((SubLObject)rkf_concept_summarizer.NIL, thread);
                                                final SubLObject formula = conses_high.copy_tree(fi.assertion_fi_formula(assertion, (SubLObject)rkf_concept_summarizer.UNPROVIDED));
                                                asserted_term_formulas = (SubLObject)ConsesLow.cons(formula, asserted_term_formulas);
                                            }
                                            finally {
                                                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0_$6, thread);
                                            }
                                        }
                                        done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(rkf_concept_summarizer.NIL == valid_$5);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_concept_summarizer.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (rkf_concept_summarizer.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(rkf_concept_summarizer.NIL == valid);
                        }
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    predicate = cdolist_list_var_$2.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg_key = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return asserted_term_formulas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 3751L)
    public static SubLObject rkf_taxonomic_term_formula(final SubLObject fort, final SubLObject formula, SubLObject mt) {
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        SubLObject predicate = (SubLObject)rkf_concept_summarizer.NIL;
        SubLObject args = (SubLObject)rkf_concept_summarizer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)rkf_concept_summarizer.$list4);
        predicate = formula.first();
        final SubLObject current = args = formula.rest();
        final SubLObject pcase_var = predicate;
        if (pcase_var.eql(rkf_concept_summarizer.$const5$isa)) {
            return (SubLObject)rkf_concept_summarizer.T;
        }
        if (pcase_var.eql(rkf_concept_summarizer.$const6$genls)) {
            return (SubLObject)rkf_concept_summarizer.T;
        }
        return (SubLObject)rkf_concept_summarizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 4040L)
    public static SubLObject arity_of_arg2(final SubLObject formula) {
        return el_utilities.formula_arity(cycl_utilities.formula_arg2(formula, (SubLObject)rkf_concept_summarizer.UNPROVIDED), (SubLObject)rkf_concept_summarizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 4129L)
    public static SubLObject operator_of_arg2(final SubLObject formula) {
        return cycl_utilities.formula_operator(cycl_utilities.formula_arg2(formula, (SubLObject)rkf_concept_summarizer.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 4224L)
    public static SubLObject rkf_sort_view_formulas(final SubLObject v_term, final SubLObject formulas, SubLObject istP) {
        if (istP == rkf_concept_summarizer.UNPROVIDED) {
            istP = (SubLObject)rkf_concept_summarizer.NIL;
        }
        SubLObject formulas_not_directly_about_term = Sequences.remove(v_term, formulas, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.$sym7$FIND_EQUAL), (SubLObject)((rkf_concept_summarizer.NIL != istP) ? rkf_concept_summarizer.$sym8$SENTENCE_ARG2 : rkf_concept_summarizer.IDENTITY), (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        SubLObject formulas_directly_about_term = conses_high.set_difference(formulas, formulas_not_directly_about_term, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        formulas_directly_about_term = list_utilities.sort_via_position(formulas_directly_about_term, (SubLObject)rkf_concept_summarizer.$list9, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.EQL), (SubLObject)((rkf_concept_summarizer.NIL != istP) ? rkf_concept_summarizer.$sym10$ARITY_OF_ARG2 : rkf_concept_summarizer.$sym11$FORMULA_ARITY));
        formulas_directly_about_term = list_utilities.stable_sort_via_position(formulas_directly_about_term, (SubLObject)rkf_concept_summarizer.$list12, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.EQ), (SubLObject)((rkf_concept_summarizer.NIL != istP) ? rkf_concept_summarizer.$sym13$OPERATOR_OF_ARG2 : rkf_concept_summarizer.$sym14$FORMULA_OPERATOR));
        formulas_not_directly_about_term = list_utilities.sort_via_position(formulas_not_directly_about_term, (SubLObject)rkf_concept_summarizer.$list9, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.EQL), (SubLObject)((rkf_concept_summarizer.NIL != istP) ? rkf_concept_summarizer.$sym10$ARITY_OF_ARG2 : rkf_concept_summarizer.$sym11$FORMULA_ARITY));
        return ConsesLow.nconc(formulas_directly_about_term, formulas_not_directly_about_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 5346L)
    public static SubLObject rkf_summarize_naut_view(final SubLObject naut, SubLObject mt) {
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        SubLObject formulae = (SubLObject)rkf_concept_summarizer.NIL;
        SubLObject cdolist_list_var;
        SubLObject queries = cdolist_list_var = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(rkf_concept_summarizer.$const5$isa, naut, (SubLObject)rkf_concept_summarizer.$list15), (SubLObject)ConsesLow.list(rkf_concept_summarizer.$const5$isa, (SubLObject)rkf_concept_summarizer.$sym16$_ARG1, naut));
        SubLObject query = (SubLObject)rkf_concept_summarizer.NIL;
        query = cdolist_list_var.first();
        while (rkf_concept_summarizer.NIL != cdolist_list_var) {
            final SubLObject binding_lists = rkf_query_utilities.rkf_extract_bindings_from_results(rkf_query_utilities.rkf_query(query, mt, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED));
            if (rkf_concept_summarizer.NIL != binding_lists) {
                formulae = ConsesLow.nconc(rkf_instantiate_formula(query, binding_lists), formulae);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        if (rkf_concept_summarizer.NIL != rkf_query_utilities.rkf_known((SubLObject)ConsesLow.listS(rkf_concept_summarizer.$const5$isa, naut, (SubLObject)rkf_concept_summarizer.$list17), mt, (SubLObject)rkf_concept_summarizer.UNPROVIDED)) {
            queries = (cdolist_list_var = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(rkf_concept_summarizer.$const18$nearestGenls, naut, (SubLObject)rkf_concept_summarizer.$list15), (SubLObject)ConsesLow.list(rkf_concept_summarizer.$const18$nearestGenls, (SubLObject)rkf_concept_summarizer.$sym16$_ARG1, naut)));
            query = (SubLObject)rkf_concept_summarizer.NIL;
            query = cdolist_list_var.first();
            while (rkf_concept_summarizer.NIL != cdolist_list_var) {
                final SubLObject binding_lists = rkf_query_utilities.rkf_extract_bindings_from_results(rkf_query_utilities.rkf_query(query, mt, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED));
                final SubLObject nearest_genls_formulae = rkf_instantiate_formula(query, binding_lists);
                if (rkf_concept_summarizer.NIL != binding_lists) {
                    SubLObject cdolist_list_var_$8 = nearest_genls_formulae;
                    SubLObject formula = (SubLObject)rkf_concept_summarizer.NIL;
                    formula = cdolist_list_var_$8.first();
                    while (rkf_concept_summarizer.NIL != cdolist_list_var_$8) {
                        formulae = (SubLObject)ConsesLow.cons(cycl_utilities.expression_nsubst(rkf_concept_summarizer.$const6$genls, rkf_concept_summarizer.$const18$nearestGenls, formula, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED), formulae);
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        formula = cdolist_list_var_$8.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                query = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(formulae);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 6318L)
    public static SubLObject rkf_instantiate_formula(final SubLObject formula, final SubLObject binding_lists) {
        if (rkf_concept_summarizer.NIL == formula) {
            return (SubLObject)rkf_concept_summarizer.NIL;
        }
        SubLObject formulae = (SubLObject)rkf_concept_summarizer.NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject binding_list = (SubLObject)rkf_concept_summarizer.NIL;
        binding_list = cdolist_list_var.first();
        while (rkf_concept_summarizer.NIL != cdolist_list_var) {
            SubLObject instance = el_utilities.copy_expression(formula);
            SubLObject cdolist_list_var_$9 = binding_list;
            SubLObject cons = (SubLObject)rkf_concept_summarizer.NIL;
            cons = cdolist_list_var_$9.first();
            while (rkf_concept_summarizer.NIL != cdolist_list_var_$9) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject var = (SubLObject)rkf_concept_summarizer.NIL;
                SubLObject value = (SubLObject)rkf_concept_summarizer.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_summarizer.$list19);
                var = current.first();
                current = (value = current.rest());
                instance = cycl_utilities.expression_nsubst(value, var, instance, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                cons = cdolist_list_var_$9.first();
            }
            formulae = (SubLObject)ConsesLow.cons(instance, formulae);
            cdolist_list_var = cdolist_list_var.rest();
            binding_list = cdolist_list_var.first();
        }
        return Sequences.nreverse(formulae);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 6711L)
    public static SubLObject find_equal(final SubLObject v_term, final SubLObject list) {
        return Sequences.find(v_term, list, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.EQUAL), (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 6785L)
    public static SubLObject rkf_summarize_all(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        assert rkf_concept_summarizer.NIL != forts.fort_p(fort) : fort;
        final SubLObject local_view_formulas = rkf_summarize(fort, mt, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        final SubLObject inherited_views = rkf_inherited_views(fort, mt);
        SubLObject all_view_formulas = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(fort, local_view_formulas));
        SubLObject cdolist_list_var = inherited_views;
        SubLObject inherited_view = (SubLObject)rkf_concept_summarizer.NIL;
        inherited_view = cdolist_list_var.first();
        while (rkf_concept_summarizer.NIL != cdolist_list_var) {
            final SubLObject inherited_view_formulas = rkf_summarize_inherited_view(fort, inherited_view, mt);
            if (rkf_concept_summarizer.NIL != inherited_view_formulas) {
                all_view_formulas = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inherited_view, inherited_view_formulas), all_view_formulas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inherited_view = cdolist_list_var.first();
        }
        all_view_formulas = Sequences.nreverse(all_view_formulas);
        return all_view_formulas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 7782L)
    public static SubLObject rkf_inherited_views(final SubLObject fort, SubLObject mt) {
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_concept_summarizer.NIL != forts.fort_p(fort) : fort;
        SubLObject views = (SubLObject)rkf_concept_summarizer.NIL;
        if (rkf_concept_summarizer.NIL != fort_types_interface.collectionP(fort)) {
            views = Sequences.delete(fort, genls.all_genls(fort, mt, (SubLObject)rkf_concept_summarizer.UNPROVIDED), (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        }
        else {
            views = isa.all_isa(fort, mt, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        }
        views = rkf_relevance_utilities.rkf_filter_irrelevant_terms(views, mt);
        views = Sequences.delete(rkf_concept_summarizer.$rkf_view_generality_cutoff$.getDynamicValue(thread), views, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.$sym21$_), Symbols.symbol_function((SubLObject)rkf_concept_summarizer.$sym22$GENERALITY_ESTIMATE), (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        views = Sort.sort(views, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.$sym21$_), Symbols.symbol_function((SubLObject)rkf_concept_summarizer.$sym22$GENERALITY_ESTIMATE));
        return views;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 8377L)
    public static SubLObject rkf_summarize_inherited_view(final SubLObject fort, final SubLObject view, SubLObject mt) {
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject view_formulas = (SubLObject)rkf_concept_summarizer.NIL;
        final SubLObject _prev_bind_0 = control_vars.$cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$compute_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$unique_inference_result_bindings$.currentBinding(thread);
        try {
            control_vars.$cache_inference_results$.bind((SubLObject)rkf_concept_summarizer.NIL, thread);
            control_vars.$compute_inference_results$.bind((SubLObject)rkf_concept_summarizer.NIL, thread);
            control_vars.$unique_inference_result_bindings$.bind((SubLObject)rkf_concept_summarizer.T, thread);
            view_formulas = ask_utilities.ask_template((SubLObject)rkf_concept_summarizer.$sym23$_FORMULA, (SubLObject)ConsesLow.listS(rkf_concept_summarizer.$const24$inheritedTermSentences, fort, view, (SubLObject)rkf_concept_summarizer.$list25), mt, (SubLObject)rkf_concept_summarizer.ONE_INTEGER, (SubLObject)rkf_concept_summarizer.NIL, (SubLObject)rkf_concept_summarizer.NIL, (SubLObject)rkf_concept_summarizer.NIL);
        }
        finally {
            control_vars.$unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
            control_vars.$compute_inference_results$.rebind(_prev_bind_2, thread);
            control_vars.$cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return view_formulas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 8788L)
    public static SubLObject rkf_example_predicate() {
        final SubLObject first_try = constants_high.find_constant((SubLObject)rkf_concept_summarizer.$str26$exampleSentences);
        if (rkf_concept_summarizer.NIL != first_try) {
            return first_try;
        }
        final SubLObject second_try = constants_high.find_constant((SubLObject)rkf_concept_summarizer.$str27$exampleFormulas);
        if (rkf_concept_summarizer.NIL != second_try) {
            return second_try;
        }
        return (SubLObject)rkf_concept_summarizer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 9514L)
    public static SubLObject rkf_term_examples(final SubLObject fort, SubLObject number, SubLObject mt) {
        if (number == rkf_concept_summarizer.UNPROVIDED) {
            number = (SubLObject)rkf_concept_summarizer.ONE_INTEGER;
        }
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_concept_summarizer.NIL != forts.fort_p(fort) : fort;
        SubLObject examples = (SubLObject)rkf_concept_summarizer.NIL;
        final SubLObject _prev_bind_0 = control_vars.$cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$compute_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$unique_inference_result_bindings$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            control_vars.$cache_inference_results$.bind((SubLObject)rkf_concept_summarizer.NIL, thread);
            control_vars.$compute_inference_results$.bind((SubLObject)rkf_concept_summarizer.NIL, thread);
            control_vars.$unique_inference_result_bindings$.bind((SubLObject)rkf_concept_summarizer.T, thread);
            api_control_vars.$generate_readable_fi_results$.bind((SubLObject)rkf_concept_summarizer.NIL, thread);
            examples = ask_utilities.ask_template((SubLObject)rkf_concept_summarizer.$sym23$_FORMULA, (SubLObject)ConsesLow.listS(rkf_example_predicate(), fort, (SubLObject)rkf_concept_summarizer.$list25), mt, (SubLObject)rkf_concept_summarizer.NIL, number, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        }
        finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_4, thread);
            control_vars.$unique_inference_result_bindings$.rebind(_prev_bind_3, thread);
            control_vars.$compute_inference_results$.rebind(_prev_bind_2, thread);
            control_vars.$cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return examples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 9996L)
    public static SubLObject rkf_unknown_term_formulas(final SubLObject fort, final SubLObject indexical, SubLObject mt) {
        if (mt == rkf_concept_summarizer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        assert rkf_concept_summarizer.NIL != forts.fort_p(fort) : fort;
        SubLObject formulas = rkf_summarize(fort, mt, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        formulas = conses_high.copy_tree(formulas);
        formulas = conses_high.subst(indexical, fort, formulas, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.EQUAL), (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        return formulas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 10365L)
    public static SubLObject rkf_asserted_sentences(final SubLObject fort_or_naut, final SubLObject domain_mt) {
        SubLObject sentences = (rkf_concept_summarizer.NIL != forts.fort_p(fort_or_naut)) ? rkf_asserted_sentences_for_fort(fort_or_naut, domain_mt) : rkf_asserted_sentences_for_naut(fort_or_naut, domain_mt);
        sentences = list_utilities.fast_delete_duplicates(sentences, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.EQUAL), (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        sentences = rkf_sort_view_formulas(fort_or_naut, sentences, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 11147L)
    public static SubLObject rkf_asserted_sentences_for_fort(final SubLObject fort, final SubLObject domain_mt) {
        final SubLObject assertions = kb_accessors.relevant_term_assertions(fort, domain_mt, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        SubLObject sentences = (SubLObject)rkf_concept_summarizer.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)rkf_concept_summarizer.NIL;
        assertion = cdolist_list_var.first();
        while (rkf_concept_summarizer.NIL != cdolist_list_var) {
            if (rkf_concept_summarizer.NIL != assertions_high.asserted_assertionP(assertion)) {
                final SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
                if (rkf_concept_summarizer.NIL == rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, sentence, domain_mt)) {
                    sentences = (SubLObject)ConsesLow.cons(sentence, sentences);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 11553L)
    public static SubLObject rkf_asserted_sentences_for_naut(final SubLObject naut, final SubLObject domain_mt) {
        return rkf_summarize_naut_view(naut, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 11669L)
    public static SubLObject rkf_ist_sentences(final SubLObject fort_or_naut, final SubLObject domain_mt) {
        SubLObject sentences = (rkf_concept_summarizer.NIL != forts.fort_p(fort_or_naut)) ? rkf_ist_sentences_for_fort(fort_or_naut, domain_mt) : rkf_ist_sentences_for_naut(fort_or_naut, domain_mt);
        sentences = list_utilities.fast_delete_duplicates(sentences, Symbols.symbol_function((SubLObject)rkf_concept_summarizer.EQUAL), (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        sentences = rkf_sort_view_formulas(fort_or_naut, sentences, (SubLObject)rkf_concept_summarizer.T);
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 12340L)
    public static SubLObject rkf_ist_sentences_for_fort(final SubLObject fort, final SubLObject domain_mt) {
        final SubLObject assertions = kb_accessors.relevant_term_assertions(fort, domain_mt, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
        SubLObject sentences = (SubLObject)rkf_concept_summarizer.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)rkf_concept_summarizer.NIL;
        assertion = cdolist_list_var.first();
        while (rkf_concept_summarizer.NIL != cdolist_list_var) {
            final SubLObject hl_sentence = fi.assertion_hl_formula(assertion, (SubLObject)rkf_concept_summarizer.UNPROVIDED);
            final SubLObject el_sentence = uncanonicalizer.assertion_el_formula(assertion);
            if (rkf_concept_summarizer.NIL == rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, hl_sentence, domain_mt) || rkf_concept_summarizer.NIL == rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, el_sentence, domain_mt)) {
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rkf_concept_summarizer.$const28$ist, mt, el_sentence), sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-summarizer.lisp", position = 13054L)
    public static SubLObject rkf_ist_sentences_for_naut(final SubLObject naut, final SubLObject domain_mt) {
        SubLObject result = (SubLObject)rkf_concept_summarizer.NIL;
        SubLObject cdolist_list_var;
        final SubLObject sentences = cdolist_list_var = rkf_summarize_naut_view(naut, domain_mt);
        SubLObject sentence = (SubLObject)rkf_concept_summarizer.NIL;
        sentence = cdolist_list_var.first();
        while (rkf_concept_summarizer.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rkf_concept_summarizer.$const28$ist, domain_mt, sentence), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    public static SubLObject declare_rkf_concept_summarizer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_summarize", "RKF-SUMMARIZE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_summarize_fort_view", "RKF-SUMMARIZE-FORT-VIEW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_summarize_function_view", "RKF-SUMMARIZE-FUNCTION-VIEW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_asserted_term_formulas", "RKF-ASSERTED-TERM-FORMULAS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_taxonomic_term_formula", "RKF-TAXONOMIC-TERM-FORMULA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "arity_of_arg2", "ARITY-OF-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "operator_of_arg2", "OPERATOR-OF-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_sort_view_formulas", "RKF-SORT-VIEW-FORMULAS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_summarize_naut_view", "RKF-SUMMARIZE-NAUT-VIEW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_instantiate_formula", "RKF-INSTANTIATE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "find_equal", "FIND-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_summarize_all", "RKF-SUMMARIZE-ALL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_inherited_views", "RKF-INHERITED-VIEWS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_summarize_inherited_view", "RKF-SUMMARIZE-INHERITED-VIEW", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_example_predicate", "RKF-EXAMPLE-PREDICATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_term_examples", "RKF-TERM-EXAMPLES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_unknown_term_formulas", "RKF-UNKNOWN-TERM-FORMULAS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_asserted_sentences", "RKF-ASSERTED-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_asserted_sentences_for_fort", "RKF-ASSERTED-SENTENCES-FOR-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_asserted_sentences_for_naut", "RKF-ASSERTED-SENTENCES-FOR-NAUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_ist_sentences", "RKF-IST-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_ist_sentences_for_fort", "RKF-IST-SENTENCES-FOR-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_summarizer", "rkf_ist_sentences_for_naut", "RKF-IST-SENTENCES-FOR-NAUT", 2, 0, false);
        return (SubLObject)rkf_concept_summarizer.NIL;
    }
    
    public static SubLObject init_rkf_concept_summarizer_file() {
        rkf_concept_summarizer.$rkf_view_generality_cutoff$ = SubLFiles.defparameter("*RKF-VIEW-GENERALITY-CUTOFF*", (SubLObject)rkf_concept_summarizer.$int20$100000);
        return (SubLObject)rkf_concept_summarizer.NIL;
    }
    
    public static SubLObject setup_rkf_concept_summarizer_file() {
        return (SubLObject)rkf_concept_summarizer.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_concept_summarizer_file();
    }
    
    public void initializeVariables() {
        init_rkf_concept_summarizer_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_concept_summarizer_file();
    }
    
    static {
        me = (SubLFile)new rkf_concept_summarizer();
        rkf_concept_summarizer.$rkf_view_generality_cutoff$ = null;
        $sym0$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym1$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $kw2$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw3$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list4 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $const5$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const6$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym7$FIND_EQUAL = SubLObjectFactory.makeSymbol("FIND-EQUAL");
        $sym8$SENTENCE_ARG2 = SubLObjectFactory.makeSymbol("SENTENCE-ARG2");
        $list9 = ConsesLow.list((SubLObject)rkf_concept_summarizer.TWO_INTEGER, (SubLObject)rkf_concept_summarizer.THREE_INTEGER, (SubLObject)rkf_concept_summarizer.FOUR_INTEGER, (SubLObject)rkf_concept_summarizer.ONE_INTEGER);
        $sym10$ARITY_OF_ARG2 = SubLObjectFactory.makeSymbol("ARITY-OF-ARG2");
        $sym11$FORMULA_ARITY = SubLObjectFactory.makeSymbol("FORMULA-ARITY");
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $sym13$OPERATOR_OF_ARG2 = SubLObjectFactory.makeSymbol("OPERATOR-OF-ARG2");
        $sym14$FORMULA_OPERATOR = SubLObjectFactory.makeSymbol("FORMULA-OPERATOR");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARG2"));
        $sym16$_ARG1 = SubLObjectFactory.makeSymbol("?ARG1");
        $list17 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")));
        $const18$nearestGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestGenls"));
        $list19 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $int20$100000 = SubLObjectFactory.makeInteger(100000);
        $sym21$_ = SubLObjectFactory.makeSymbol("<");
        $sym22$GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE");
        $sym23$_FORMULA = SubLObjectFactory.makeSymbol("?FORMULA");
        $const24$inheritedTermSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inheritedTermSentences"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?FORMULA"));
        $str26$exampleSentences = SubLObjectFactory.makeString("exampleSentences");
        $str27$exampleFormulas = SubLObjectFactory.makeString("exampleFormulas");
        $const28$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
    }
}

/*

	Total time: 192 ms
	
*/