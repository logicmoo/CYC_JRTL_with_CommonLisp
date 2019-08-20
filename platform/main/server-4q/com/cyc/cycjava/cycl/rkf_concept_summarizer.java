/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cache_inference_results$;
import static com.cyc.cycjava.cycl.control_vars.$compute_inference_results$;
import static com.cyc.cycjava.cycl.control_vars.$rkf_mt$;
import static com.cyc.cycjava.cycl.control_vars.$unique_inference_result_bindings$;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-CONCEPT-SUMMARIZER
 * source file: /cyc/top/cycl/rkf-concept-summarizer.lisp
 * created:     2019/07/03 17:37:59
 */
public final class rkf_concept_summarizer extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_concept_summarizer();



    // defparameter
    // Generality estimate above which is deemed too general
    /**
     * Generality estimate above which is deemed too general
     */
    @LispMethod(comment = "Generality estimate above which is deemed too general\ndefparameter")
    private static final SubLSymbol $rkf_view_generality_cutoff$ = makeSymbol("*RKF-VIEW-GENERALITY-CUTOFF*");

    static private final SubLList $list4 = cons(makeSymbol("PREDICATE"), makeSymbol("ARGS"));





    private static final SubLSymbol FIND_EQUAL = makeSymbol("FIND-EQUAL");

    private static final SubLSymbol SENTENCE_ARG2 = makeSymbol("SENTENCE-ARG2");

    static private final SubLList $list9 = list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, ONE_INTEGER);

    private static final SubLSymbol ARITY_OF_ARG2 = makeSymbol("ARITY-OF-ARG2");

    private static final SubLSymbol FORMULA_ARITY = makeSymbol("FORMULA-ARITY");

    static private final SubLList $list12 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    private static final SubLSymbol OPERATOR_OF_ARG2 = makeSymbol("OPERATOR-OF-ARG2");

    static private final SubLList $list15 = list(makeSymbol("?ARG2"));

    static private final SubLSymbol $sym16$_ARG1 = makeSymbol("?ARG1");

    static private final SubLList $list17 = list(reader_make_constant_shell("Collection"));



    static private final SubLList $list19 = cons(makeSymbol("VAR"), makeSymbol("VALUE"));

    private static final SubLInteger $int$100000 = makeInteger(100000);

    static private final SubLSymbol $sym21$_ = makeSymbol("<");

    static private final SubLSymbol $sym23$_FORMULA = makeSymbol("?FORMULA");



    static private final SubLList $list25 = list(makeSymbol("?FORMULA"));

    static private final SubLString $$$exampleSentences = makeString("exampleSentences");

    static private final SubLString $$$exampleFormulas = makeString("exampleFormulas");



    // Definitions
    /**
     *
     *
     * @return LISTP of CycL sentences referencing FORT-OR-NAUT, visible from MT.
    If INCLUDE-NARTS? is non-nil, also include sentences referencing narts of which
    FORT-OR-NAUT is an argument.
     */
    @LispMethod(comment = "@return LISTP of CycL sentences referencing FORT-OR-NAUT, visible from MT.\r\nIf INCLUDE-NARTS? is non-nil, also include sentences referencing narts of which\r\nFORT-OR-NAUT is an argument.")
    public static final SubLObject rkf_summarize_alt(SubLObject fort_or_naut, SubLObject mt, SubLObject include_nartsP) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (include_nartsP == UNPROVIDED) {
            include_nartsP = T;
        }
        if (NIL != forts.fort_p(fort_or_naut)) {
            {
                SubLObject fort = fort_or_naut;
                SubLObject fort_view_formulas = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_summarize_fort_view(fort, mt);
                SubLObject function_view_formulas = (NIL != include_nartsP) ? ((SubLObject) (com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_summarize_function_view(fort, mt))) : NIL;
                SubLObject view_formulas = nconc(fort_view_formulas, function_view_formulas);
                view_formulas = delete_duplicates(view_formulas, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                view_formulas = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_sort_view_formulas(fort, view_formulas, UNPROVIDED);
                return view_formulas;
            }
        } else {
            {
                SubLObject naut = fort_or_naut;
                SubLObject naut_view_formulas = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_summarize_naut_view(naut, mt);
                SubLObject view_formulas = naut_view_formulas;
                view_formulas = delete_duplicates(view_formulas, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                view_formulas = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_sort_view_formulas(naut, view_formulas, UNPROVIDED);
                return view_formulas;
            }
        }
    }

    // Definitions
    /**
     *
     *
     * @return LISTP of CycL sentences referencing FORT-OR-NAUT, visible from MT.
    If INCLUDE-NARTS? is non-nil, also include sentences referencing narts of which
    FORT-OR-NAUT is an argument.
     */
    @LispMethod(comment = "@return LISTP of CycL sentences referencing FORT-OR-NAUT, visible from MT.\r\nIf INCLUDE-NARTS? is non-nil, also include sentences referencing narts of which\r\nFORT-OR-NAUT is an argument.")
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

    public static final SubLObject rkf_summarize_fort_view_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            SubLObject asserted_term_formulas = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_asserted_term_formulas(fort, mt);
            SubLObject fort_view_formulas = NIL;
            SubLObject cdolist_list_var = asserted_term_formulas;
            SubLObject asserted_term_formula = NIL;
            for (asserted_term_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asserted_term_formula = cdolist_list_var.first()) {
                if (NIL == rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, asserted_term_formula, mt)) {
                    fort_view_formulas = cons(asserted_term_formula, fort_view_formulas);
                }
            }
            return nreverse(fort_view_formulas);
        }
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

    /**
     *
     *
     * @return LISTP of CycL sentences referencing NARTs of which FORT is an argument.
     */
    @LispMethod(comment = "@return LISTP of CycL sentences referencing NARTs of which FORT is an argument.")
    public static final SubLObject rkf_summarize_function_view_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            SubLObject narts = kb_indexing.dependent_narts(fort);
            SubLObject function_view_formulas = NIL;
            SubLObject cdolist_list_var = narts;
            SubLObject nart = NIL;
            for (nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nart = cdolist_list_var.first()) {
                {
                    SubLObject nart_fort_view_formulas = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_summarize_fort_view(nart, mt);
                    SubLObject cdolist_list_var_1 = nart_fort_view_formulas;
                    SubLObject nart_fort_view_formula = NIL;
                    for (nart_fort_view_formula = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , nart_fort_view_formula = cdolist_list_var_1.first()) {
                        if (NIL == com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_taxonomic_term_formula(nart, nart_fort_view_formula, mt)) {
                            function_view_formulas = cons(nart_fort_view_formula, function_view_formulas);
                        }
                    }
                }
            }
            return nreverse(function_view_formulas);
        }
    }

    /**
     *
     *
     * @return LISTP of CycL sentences referencing NARTs of which FORT is an argument.
     */
    @LispMethod(comment = "@return LISTP of CycL sentences referencing NARTs of which FORT is an argument.")
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

    /**
     * Return all asserted term formulas of FORT visible in MT
     */
    @LispMethod(comment = "Return all asserted term formulas of FORT visible in MT")
    public static final SubLObject rkf_asserted_term_formulas_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fort, FORT_P);
            {
                SubLObject asserted_term_formulas = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject arg_keys = kb_indexing.relevant_key_gaf_arg_index(fort, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = arg_keys;
                            SubLObject arg_key = NIL;
                            for (arg_key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_key = cdolist_list_var.first()) {
                                {
                                    SubLObject predicate_keys = kb_indexing.relevant_key_gaf_arg_index(fort, arg_key, UNPROVIDED);
                                    SubLObject cdolist_list_var_2 = predicate_keys;
                                    SubLObject predicate = NIL;
                                    for (predicate = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , predicate = cdolist_list_var_2.first()) {
                                        {
                                            SubLObject pred_var = predicate;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, arg_key, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, arg_key, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                        {
                                                                            SubLObject done_var_3 = NIL;
                                                                            SubLObject token_var_4 = NIL;
                                                                            while (NIL == done_var_3) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                                                    SubLObject valid_5 = makeBoolean(token_var_4 != assertion);
                                                                                    if (NIL != valid_5) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_6 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                                                                                            try {
                                                                                                api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                                                                                                {
                                                                                                    SubLObject formula = copy_tree(fi.assertion_fi_formula(assertion, UNPROVIDED));
                                                                                                    asserted_term_formulas = cons(formula, asserted_term_formulas);
                                                                                                }
                                                                                            } finally {
                                                                                                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0_6, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_3 = makeBoolean(NIL == valid_5);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return asserted_term_formulas;
            }
        }
    }

    /**
     * Return all asserted term formulas of FORT visible in MT
     */
    @LispMethod(comment = "Return all asserted term formulas of FORT visible in MT")
    public static SubLObject rkf_asserted_term_formulas(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
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

    public static final SubLObject rkf_taxonomic_term_formula_alt(SubLObject fort, SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject predicate = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            predicate = current.first();
            current = current.rest();
            args = current;
            {
                SubLObject pcase_var = predicate;
                if (pcase_var.eql($$isa)) {
                    return T;
                } else {
                    if (pcase_var.eql($$genls)) {
                        return T;
                    } else {
                        return NIL;
                    }
                }
            }
        }
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

    public static final SubLObject arity_of_arg2_alt(SubLObject formula) {
        return formula_arity(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject arity_of_arg2(final SubLObject formula) {
        return formula_arity(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
    }

    public static final SubLObject operator_of_arg2_alt(SubLObject formula) {
        return cycl_utilities.formula_operator(cycl_utilities.formula_arg2(formula, UNPROVIDED));
    }

    public static SubLObject operator_of_arg2(final SubLObject formula) {
        return cycl_utilities.formula_operator(cycl_utilities.formula_arg2(formula, UNPROVIDED));
    }

    /**
     *
     *
     * @param ist?;
     * 		whether FORMULAS are all #$ist sentences.
     */
    @LispMethod(comment = "@param ist?;\r\n\t\twhether FORMULAS are all #$ist sentences.")
    public static final SubLObject rkf_sort_view_formulas_alt(SubLObject v_term, SubLObject formulas, SubLObject istP) {
        if (istP == UNPROVIDED) {
            istP = NIL;
        }
        {
            SubLObject formulas_not_directly_about_term = remove(v_term, formulas, symbol_function(FIND_EQUAL), NIL != istP ? ((SubLObject) (SENTENCE_ARG2)) : IDENTITY, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject formulas_directly_about_term = set_difference(formulas, formulas_not_directly_about_term, UNPROVIDED, UNPROVIDED);
            formulas_directly_about_term = list_utilities.sort_via_position(formulas_directly_about_term, $list_alt9, symbol_function(EQL), NIL != istP ? ((SubLObject) (ARITY_OF_ARG2)) : FORMULA_ARITY);
            formulas_directly_about_term = list_utilities.stable_sort_via_position(formulas_directly_about_term, $list_alt12, symbol_function(EQ), NIL != istP ? ((SubLObject) (OPERATOR_OF_ARG2)) : FORMULA_OPERATOR);
            formulas_not_directly_about_term = list_utilities.sort_via_position(formulas_not_directly_about_term, $list_alt9, symbol_function(EQL), NIL != istP ? ((SubLObject) (ARITY_OF_ARG2)) : FORMULA_ARITY);
            return nconc(formulas_directly_about_term, formulas_not_directly_about_term);
        }
    }

    /**
     *
     *
     * @param ist?;
     * 		whether FORMULAS are all #$ist sentences.
     */
    @LispMethod(comment = "@param ist?;\r\n\t\twhether FORMULAS are all #$ist sentences.")
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

    public static final SubLObject rkf_summarize_naut_view_alt(SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            SubLObject formulae = NIL;
            {
                SubLObject queries = list(listS($$isa, naut, $list_alt15), list($$isa, $sym16$_ARG1, naut));
                SubLObject cdolist_list_var = queries;
                SubLObject query = NIL;
                for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                    {
                        SubLObject binding_lists = rkf_query_utilities.rkf_extract_bindings_from_results(rkf_query_utilities.rkf_query(query, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        if (NIL != binding_lists) {
                            formulae = nconc(com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_instantiate_formula(query, binding_lists), formulae);
                        }
                    }
                }
            }
            if (NIL != rkf_query_utilities.rkf_known(listS($$isa, naut, $list_alt17), mt, UNPROVIDED)) {
                {
                    SubLObject queries = list(listS($$nearestGenls, naut, $list_alt15), list($$nearestGenls, $sym16$_ARG1, naut));
                    SubLObject cdolist_list_var = queries;
                    SubLObject query = NIL;
                    for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                        {
                            SubLObject binding_lists = rkf_query_utilities.rkf_extract_bindings_from_results(rkf_query_utilities.rkf_query(query, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            SubLObject nearest_genls_formulae = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_instantiate_formula(query, binding_lists);
                            if (NIL != binding_lists) {
                                {
                                    SubLObject cdolist_list_var_8 = nearest_genls_formulae;
                                    SubLObject formula = NIL;
                                    for (formula = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , formula = cdolist_list_var_8.first()) {
                                        formulae = cons(cycl_utilities.expression_nsubst($$genls, $$nearestGenls, formula, UNPROVIDED, UNPROVIDED), formulae);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(formulae);
        }
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

    public static final SubLObject rkf_instantiate_formula_alt(SubLObject formula, SubLObject binding_lists) {
        if (NIL == formula) {
            return NIL;
        } else {
            {
                SubLObject formulae = NIL;
                SubLObject cdolist_list_var = binding_lists;
                SubLObject binding_list = NIL;
                for (binding_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_list = cdolist_list_var.first()) {
                    {
                        SubLObject instance = copy_expression(formula);
                        SubLObject cdolist_list_var_9 = binding_list;
                        SubLObject cons = NIL;
                        for (cons = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , cons = cdolist_list_var_9.first()) {
                            {
                                SubLObject datum = cons;
                                SubLObject current = datum;
                                SubLObject var = NIL;
                                SubLObject value = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt19);
                                var = current.first();
                                current = current.rest();
                                value = current;
                                instance = cycl_utilities.expression_nsubst(value, var, instance, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        formulae = cons(instance, formulae);
                    }
                }
                return nreverse(formulae);
            }
        }
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

    public static final SubLObject find_equal_alt(SubLObject v_term, SubLObject list) {
        return find(v_term, list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject find_equal(final SubLObject v_term, final SubLObject list) {
        return find(v_term, list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_summarize_all_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject local_view_formulas = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_summarize(fort, mt, UNPROVIDED);
            SubLObject inherited_views = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_inherited_views(fort, mt);
            SubLObject all_view_formulas = list(list(fort, local_view_formulas));
            SubLObject cdolist_list_var = inherited_views;
            SubLObject inherited_view = NIL;
            for (inherited_view = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inherited_view = cdolist_list_var.first()) {
                {
                    SubLObject inherited_view_formulas = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_summarize_inherited_view(fort, inherited_view, mt);
                    if (NIL != inherited_view_formulas) {
                        all_view_formulas = cons(list(inherited_view, inherited_view_formulas), all_view_formulas);
                    }
                }
            }
            all_view_formulas = nreverse(all_view_formulas);
            return all_view_formulas;
        }
    }

    public static SubLObject rkf_summarize_all(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
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

    public static final SubLObject rkf_inherited_views_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fort, FORT_P);
            {
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
        }
    }

    public static SubLObject rkf_inherited_views(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
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

    public static final SubLObject rkf_summarize_inherited_view_alt(SubLObject fort, SubLObject view, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject view_formulas = NIL;
                {
                    SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $compute_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $unique_inference_result_bindings$.currentBinding(thread);
                    try {
                        $cache_inference_results$.bind(NIL, thread);
                        $compute_inference_results$.bind(NIL, thread);
                        $unique_inference_result_bindings$.bind(T, thread);
                        view_formulas = ask_utilities.ask_template($sym23$_FORMULA, listS($$inheritedTermSentences, fort, view, $list_alt25), mt, ONE_INTEGER, NIL, NIL, NIL);
                    } finally {
                        $unique_inference_result_bindings$.rebind(_prev_bind_2, thread);
                        $compute_inference_results$.rebind(_prev_bind_1, thread);
                        $cache_inference_results$.rebind(_prev_bind_0, thread);
                    }
                }
                return view_formulas;
            }
        }
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

    /**
     * temporary dwimming function to ameliorate rename of constant in code
     */
    @LispMethod(comment = "temporary dwimming function to ameliorate rename of constant in code")
    public static final SubLObject rkf_example_predicate_alt() {
        {
            SubLObject first_try = constants_high.find_constant($$$exampleSentences);
            if (NIL != first_try) {
                return first_try;
            }
        }
        {
            SubLObject second_try = constants_high.find_constant($$$exampleFormulas);
            if (NIL != second_try) {
                return second_try;
            }
        }
        return NIL;
    }

    @LispMethod(comment = "temporary dwimming function to ameliorate rename of constant in code")
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
    }/**
     * temporary dwimming function to ameliorate rename of constant in code
     */


    public static final SubLObject rkf_term_examples_alt(SubLObject fort, SubLObject number, SubLObject mt) {
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fort, FORT_P);
            {
                SubLObject examples = NIL;
                {
                    SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $compute_inference_results$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $unique_inference_result_bindings$.currentBinding(thread);
                    SubLObject _prev_bind_3 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                    try {
                        $cache_inference_results$.bind(NIL, thread);
                        $compute_inference_results$.bind(NIL, thread);
                        $unique_inference_result_bindings$.bind(T, thread);
                        api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                        examples = ask_utilities.ask_template($sym23$_FORMULA, listS(com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_example_predicate(), fort, $list_alt25), mt, NIL, number, UNPROVIDED, UNPROVIDED);
                    } finally {
                        api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_3, thread);
                        $unique_inference_result_bindings$.rebind(_prev_bind_2, thread);
                        $compute_inference_results$.rebind(_prev_bind_1, thread);
                        $cache_inference_results$.rebind(_prev_bind_0, thread);
                    }
                }
                return examples;
            }
        }
    }

    public static SubLObject rkf_term_examples(final SubLObject fort, SubLObject number, SubLObject mt) {
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
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

    public static final SubLObject rkf_unknown_term_formulas_alt(SubLObject fort, SubLObject indexical, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject formulas = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_summarize(fort, mt, UNPROVIDED);
            formulas = copy_tree(formulas);
            formulas = subst(indexical, fort, formulas, symbol_function(EQUAL), UNPROVIDED);
            return formulas;
        }
    }

    public static SubLObject rkf_unknown_term_formulas(final SubLObject fort, final SubLObject indexical, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        SubLObject formulas = rkf_summarize(fort, mt, UNPROVIDED);
        formulas = copy_tree(formulas);
        formulas = subst(indexical, fort, formulas, symbol_function(EQUAL), UNPROVIDED);
        return formulas;
    }

    /**
     * Returns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are
     * visible from DOMAIN-MT.
     */
    @LispMethod(comment = "Returns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are\r\nvisible from DOMAIN-MT.\nReturns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are\nvisible from DOMAIN-MT.")
    public static final SubLObject rkf_asserted_sentences_alt(SubLObject fort_or_naut, SubLObject domain_mt) {
        {
            SubLObject sentences = (NIL != forts.fort_p(fort_or_naut)) ? ((SubLObject) (com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_asserted_sentences_for_fort(fort_or_naut, domain_mt))) : com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_asserted_sentences_for_naut(fort_or_naut, domain_mt);
            sentences = list_utilities.fast_delete_duplicates(sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            sentences = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_sort_view_formulas(fort_or_naut, sentences, UNPROVIDED);
            return sentences;
        }
    }

    @LispMethod(comment = "Returns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are\r\nvisible from DOMAIN-MT.\nReturns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are\nvisible from DOMAIN-MT.")
    public static SubLObject rkf_asserted_sentences(final SubLObject fort_or_naut, final SubLObject domain_mt) {
        SubLObject sentences = (NIL != forts.fort_p(fort_or_naut)) ? rkf_asserted_sentences_for_fort(fort_or_naut, domain_mt) : rkf_asserted_sentences_for_naut(fort_or_naut, domain_mt);
        sentences = list_utilities.fast_delete_duplicates(sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sentences = rkf_sort_view_formulas(fort_or_naut, sentences, UNPROVIDED);
        return sentences;
    }/**
     * Returns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are
     * visible from DOMAIN-MT.
     */


    public static final SubLObject rkf_asserted_sentences_for_fort_alt(SubLObject fort, SubLObject domain_mt) {
        {
            SubLObject assertions = kb_accessors.relevant_term_assertions(fort, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject sentences = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                if (NIL != assertions_high.asserted_assertionP(assertion)) {
                    {
                        SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
                        if (NIL == rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, sentence, domain_mt)) {
                            sentences = cons(sentence, sentences);
                        }
                    }
                }
            }
            return sentences;
        }
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

    public static final SubLObject rkf_asserted_sentences_for_naut_alt(SubLObject naut, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_summarize_naut_view(naut, domain_mt);
    }

    public static SubLObject rkf_asserted_sentences_for_naut(final SubLObject naut, final SubLObject domain_mt) {
        return rkf_summarize_naut_view(naut, domain_mt);
    }

    /**
     * Returns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are
     * visible from DOMAIN-MT, in #$ist format.
     */
    @LispMethod(comment = "Returns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are\r\nvisible from DOMAIN-MT, in #$ist format.\nReturns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are\nvisible from DOMAIN-MT, in #$ist format.")
    public static final SubLObject rkf_ist_sentences_alt(SubLObject fort_or_naut, SubLObject domain_mt) {
        {
            SubLObject sentences = (NIL != forts.fort_p(fort_or_naut)) ? ((SubLObject) (com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_ist_sentences_for_fort(fort_or_naut, domain_mt))) : com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_ist_sentences_for_naut(fort_or_naut, domain_mt);
            sentences = list_utilities.fast_delete_duplicates(sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            sentences = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_sort_view_formulas(fort_or_naut, sentences, T);
            return sentences;
        }
    }

    @LispMethod(comment = "Returns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are\r\nvisible from DOMAIN-MT, in #$ist format.\nReturns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are\nvisible from DOMAIN-MT, in #$ist format.")
    public static SubLObject rkf_ist_sentences(final SubLObject fort_or_naut, final SubLObject domain_mt) {
        SubLObject sentences = (NIL != forts.fort_p(fort_or_naut)) ? rkf_ist_sentences_for_fort(fort_or_naut, domain_mt) : rkf_ist_sentences_for_naut(fort_or_naut, domain_mt);
        sentences = list_utilities.fast_delete_duplicates(sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sentences = rkf_sort_view_formulas(fort_or_naut, sentences, T);
        return sentences;
    }/**
     * Returns a sorted list of all relevant assertions asserted about FORT-OR-NAUT which are
     * visible from DOMAIN-MT, in #$ist format.
     */


    public static final SubLObject rkf_ist_sentences_for_fort_alt(SubLObject fort, SubLObject domain_mt) {
        {
            SubLObject assertions = kb_accessors.relevant_term_assertions(fort, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject sentences = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                {
                    SubLObject hl_sentence = fi.assertion_hl_formula(assertion, UNPROVIDED);
                    SubLObject el_sentence = uncanonicalizer.assertion_el_formula(assertion);
                    if (!((NIL != rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, hl_sentence, domain_mt)) && (NIL != rkf_relevance_utilities.rkf_irrelevant_term_formula(fort, el_sentence, domain_mt)))) {
                        {
                            SubLObject mt = assertions_high.assertion_mt(assertion);
                            sentences = cons(list($$ist, mt, el_sentence), sentences);
                        }
                    }
                }
            }
            return sentences;
        }
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

    public static final SubLObject rkf_ist_sentences_for_naut_alt(SubLObject naut, SubLObject domain_mt) {
        {
            SubLObject result = NIL;
            SubLObject sentences = com.cyc.cycjava.cycl.rkf_concept_summarizer.rkf_summarize_naut_view(naut, domain_mt);
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                result = cons(list($$ist, domain_mt, sentence), result);
            }
            return nreverse(result);
        }
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
        declareFunction("rkf_summarize", "RKF-SUMMARIZE", 1, 2, false);
        declareFunction("rkf_summarize_fort_view", "RKF-SUMMARIZE-FORT-VIEW", 1, 1, false);
        declareFunction("rkf_summarize_function_view", "RKF-SUMMARIZE-FUNCTION-VIEW", 1, 1, false);
        declareFunction("rkf_asserted_term_formulas", "RKF-ASSERTED-TERM-FORMULAS", 1, 1, false);
        declareFunction("rkf_taxonomic_term_formula", "RKF-TAXONOMIC-TERM-FORMULA", 2, 1, false);
        declareFunction("arity_of_arg2", "ARITY-OF-ARG2", 1, 0, false);
        declareFunction("operator_of_arg2", "OPERATOR-OF-ARG2", 1, 0, false);
        declareFunction("rkf_sort_view_formulas", "RKF-SORT-VIEW-FORMULAS", 2, 1, false);
        declareFunction("rkf_summarize_naut_view", "RKF-SUMMARIZE-NAUT-VIEW", 1, 1, false);
        declareFunction("rkf_instantiate_formula", "RKF-INSTANTIATE-FORMULA", 2, 0, false);
        declareFunction("find_equal", "FIND-EQUAL", 2, 0, false);
        declareFunction("rkf_summarize_all", "RKF-SUMMARIZE-ALL", 1, 1, false);
        declareFunction("rkf_inherited_views", "RKF-INHERITED-VIEWS", 1, 1, false);
        declareFunction("rkf_summarize_inherited_view", "RKF-SUMMARIZE-INHERITED-VIEW", 2, 1, false);
        declareFunction("rkf_example_predicate", "RKF-EXAMPLE-PREDICATE", 0, 0, false);
        declareFunction("rkf_term_examples", "RKF-TERM-EXAMPLES", 1, 2, false);
        declareFunction("rkf_unknown_term_formulas", "RKF-UNKNOWN-TERM-FORMULAS", 2, 1, false);
        declareFunction("rkf_asserted_sentences", "RKF-ASSERTED-SENTENCES", 2, 0, false);
        declareFunction("rkf_asserted_sentences_for_fort", "RKF-ASSERTED-SENTENCES-FOR-FORT", 2, 0, false);
        declareFunction("rkf_asserted_sentences_for_naut", "RKF-ASSERTED-SENTENCES-FOR-NAUT", 2, 0, false);
        declareFunction("rkf_ist_sentences", "RKF-IST-SENTENCES", 2, 0, false);
        declareFunction("rkf_ist_sentences_for_fort", "RKF-IST-SENTENCES-FOR-FORT", 2, 0, false);
        declareFunction("rkf_ist_sentences_for_naut", "RKF-IST-SENTENCES-FOR-NAUT", 2, 0, false);
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

    static {
    }

    static private final SubLList $list_alt4 = cons(makeSymbol("PREDICATE"), makeSymbol("ARGS"));

    static private final SubLList $list_alt9 = list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, ONE_INTEGER);

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLList $list_alt15 = list(makeSymbol("?ARG2"));

    static private final SubLList $list_alt17 = list(reader_make_constant_shell("Collection"));

    static private final SubLList $list_alt19 = cons(makeSymbol("VAR"), makeSymbol("VALUE"));

    static private final SubLList $list_alt25 = list(makeSymbol("?FORMULA"));
}

/**
 * Total time: 192 ms
 */
