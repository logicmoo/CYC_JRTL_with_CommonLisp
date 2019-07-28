package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.rkf_term_agglomerator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.rkf_term_agglomerator.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rkf_term_agglomerator extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_term_agglomerator();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_term_agglomerator";

    public static final String myFingerPrint = "e4c6676c2215fe2a4d57d53ed2c300caa5b1626de79d21457ca64c95da512a12";

    // defparameter
    public static final SubLSymbol $kr_sugar_on$ = makeSymbol("*KR-SUGAR-ON*");



    // defparameter
    public static final SubLSymbol $k_permutations_max$ = makeSymbol("*K-PERMUTATIONS-MAX*");

    // defconstant
    public static final SubLSymbol $dtp_agglomeration_state$ = makeSymbol("*DTP-AGGLOMERATION-STATE*");

    // Internal Constants
    public static final SubLSymbol $kr_sugar$ = makeSymbol("*KR-SUGAR*");

    private static final SubLObject $$RuleMacroPredicate = reader_make_constant_shell(makeString("RuleMacroPredicate"));

    public static final SubLString $str2$___S_KR_sugar_spoons_added_to_the = makeString("~%~S KR sugar spoons added to the mix.");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    public static final SubLList $list7 = list(makeSymbol("TERMS"), makeSymbol("FUNCTIONS"), makeSymbol("PREDICATES"));

    private static final SubLObject $$arityMin = reader_make_constant_shell(makeString("arityMin"));

    private static final SubLObject $$arityMax = reader_make_constant_shell(makeString("arityMax"));

    public static final SubLString $str10$_ = makeString("?");

    public static final SubLString $str11$_ = makeString("-");

    private static final SubLInteger $int$100000 = makeInteger(100000);

    public static final SubLSymbol AGGLOMERATION_STATE = makeSymbol("AGGLOMERATION-STATE");

    public static final SubLSymbol AGGLOMERATION_STATE_P = makeSymbol("AGGLOMERATION-STATE-P");

    public static final SubLList $list15 = list(makeSymbol("UNCOVERED-TERMS"), makeSymbol("AGGLOMERATIONS-AVAILABLE"), makeSymbol("AGGLOMERATIONS-USED"));

    public static final SubLList $list16 = list(makeKeyword("UNCOVERED-TERMS"), makeKeyword("AGGLOMERATIONS-AVAILABLE"), makeKeyword("AGGLOMERATIONS-USED"));

    public static final SubLList $list17 = list(makeSymbol("AGGLOMERATION-STATE-UNCOVERED-TERMS"), makeSymbol("AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE"), makeSymbol("AGGLOMERATION-STATE-AGGLOMERATIONS-USED"));

    public static final SubLList $list18 = list(makeSymbol("_CSETF-AGGLOMERATION-STATE-UNCOVERED-TERMS"), makeSymbol("_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE"), makeSymbol("_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-USED"));



    public static final SubLSymbol AGGLOMERATION_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AGGLOMERATION-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list21 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AGGLOMERATION-STATE-P"));

    private static final SubLSymbol AGGLOMERATION_STATE_UNCOVERED_TERMS = makeSymbol("AGGLOMERATION-STATE-UNCOVERED-TERMS");

    private static final SubLSymbol _CSETF_AGGLOMERATION_STATE_UNCOVERED_TERMS = makeSymbol("_CSETF-AGGLOMERATION-STATE-UNCOVERED-TERMS");

    private static final SubLSymbol AGGLOMERATION_STATE_AGGLOMERATIONS_AVAILABLE = makeSymbol("AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE");

    private static final SubLSymbol _CSETF_AGGLOMERATION_STATE_AGGLOMERATIONS_AVAILABLE = makeSymbol("_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE");

    private static final SubLSymbol AGGLOMERATION_STATE_AGGLOMERATIONS_USED = makeSymbol("AGGLOMERATION-STATE-AGGLOMERATIONS-USED");

    private static final SubLSymbol _CSETF_AGGLOMERATION_STATE_AGGLOMERATIONS_USED = makeSymbol("_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-USED");







    private static final SubLString $str31$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_AGGLOMERATION_STATE = makeSymbol("MAKE-AGGLOMERATION-STATE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AGGLOMERATION_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AGGLOMERATION-STATE-METHOD");

    private static final SubLSymbol $sym37$SETS_EQUAL_EQUAL_ = makeSymbol("SETS-EQUAL-EQUAL?");

    public static SubLObject turn_kr_sugar_on() {
        $kr_sugar_on$.setDynamicValue(T);
        return T;
    }

    public static SubLObject turn_kr_sugar_off() {
        $kr_sugar_on$.setDynamicValue(NIL);
        return T;
    }

    public static SubLObject initialize_kr_sugar_set() {
        $kr_sugar$.setGlobalValue(isa.all_fort_instances($$RuleMacroPredicate, UNPROVIDED, UNPROVIDED));
        format(T, $str2$___S_KR_sugar_spoons_added_to_the, length($kr_sugar$.getGlobalValue()));
        return T;
    }

    public static SubLObject rkf_term_agglomerator(final SubLObject new_term, SubLObject old_terms) {
        if (old_terms == UNPROVIDED) {
            old_terms = NIL;
        }
        if (NIL == old_terms) {
            return list(new_term);
        }
        return agglomerate_list_simple(old_terms, T, new_term);
    }

    public static SubLObject suggest_agglomerate_simple(final SubLObject list_of_terms, SubLObject tolerant, SubLObject pivot) {
        if (tolerant == UNPROVIDED) {
            tolerant = NIL;
        }
        if (pivot == UNPROVIDED) {
            pivot = NIL;
        }
        final SubLObject agglomeration = agglomerate_list_simple(list_of_terms, tolerant, pivot);
        if (NIL != agglomeration) {
            return agglomeration;
        }
        return suggest_list_agglomerations(list_of_terms, pivot);
    }

    public static SubLObject suggest_list_agglomerations(final SubLObject list_of_terms, SubLObject pivot) {
        if (pivot == UNPROVIDED) {
            pivot = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject i;
        SubLObject cdolist_list_var;
        SubLObject n_tuples;
        SubLObject n_tuple;
        SubLObject cdolist_list_var_$1;
        SubLObject suggestions;
        SubLObject suggestion;
        SubLObject fn_test;
        SubLObject local_result;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        for (i = NIL, i = ZERO_INTEGER; i.numL(rkf_tools.$rkf_max_arity$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
            n_tuples = cdolist_list_var = (NIL != pivot) ? pivot_k_permutations_of_list(i, list_of_terms, pivot) : k_permutations_of_list(i, list_of_terms);
            n_tuple = NIL;
            n_tuple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                suggestions = cdolist_list_var_$1 = rkf_relationship_suggestor.find_relations_of_terms(n_tuple, UNPROVIDED, UNPROVIDED);
                suggestion = NIL;
                suggestion = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if (suggestion.isList()) {
                        result = cons(suggestion, result);
                    } else {
                        fn_test = NIL;
                        local_result = NIL;
                        _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            fn_test = fort_types_interface.non_predicate_functionP(suggestion);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                        if (NIL != fn_test) {
                            local_result = agglomerations_good_for_functor_n_tuple(cons(suggestion, n_tuple), $FUNCTION, UNPROVIDED);
                        } else {
                            local_result = agglomerations_good_for_functor_n_tuple(cons(suggestion, n_tuple), $PREDICATE, UNPROVIDED);
                        }
                        result = append(local_result, result);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    suggestion = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                n_tuple = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject agglomerate_list_simple(final SubLObject list_of_terms, SubLObject tolerant, SubLObject pivot) {
        if (tolerant == UNPROVIDED) {
            tolerant = NIL;
        }
        if (pivot == UNPROVIDED) {
            pivot = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject functor_test = NIL;
        SubLObject predicate_test = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            functor_test = fort_types_interface.non_predicate_functionP(pivot);
            predicate_test = fort_types_interface.predicateP(pivot);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != functor_test) {
            return functor_list_agglomerate(pivot, $FUNCTION, list_of_terms, tolerant, NIL);
        }
        if (NIL != predicate_test) {
            return functor_list_agglomerate(pivot, $PREDICATE, list_of_terms, tolerant, NIL);
        }
        SubLObject current;
        final SubLObject datum = current = sort_terms_from_functors(list_of_terms);
        SubLObject terms = NIL;
        SubLObject functions = NIL;
        SubLObject predicates = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        terms = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        functions = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        predicates = current.first();
        current = current.rest();
        if (NIL == current) {
            terms = append(predicates, terms);
            if (NIL != $kr_sugar_on$.getDynamicValue(thread)) {
                predicates = append($kr_sugar$.getGlobalValue(), predicates);
            }
            SubLObject result = NIL;
            SubLObject cdolist_list_var = functions;
            SubLObject fn = NIL;
            fn = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = append(functor_list_agglomerate(fn, $FUNCTION, terms, tolerant, pivot), result);
                cdolist_list_var = cdolist_list_var.rest();
                fn = cdolist_list_var.first();
            } 
            cdolist_list_var = predicates;
            SubLObject pr = NIL;
            pr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = append(functor_list_agglomerate(pr, $PREDICATE, terms, tolerant, pivot), result);
                cdolist_list_var = cdolist_list_var.rest();
                pr = cdolist_list_var.first();
            } 
            return result;
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static SubLObject functor_list_agglomerate(final SubLObject functor, final SubLObject keyword, final SubLObject termlist, SubLObject tolerant, SubLObject pivot) {
        if (tolerant == UNPROVIDED) {
            tolerant = NIL;
        }
        if (pivot == UNPROVIDED) {
            pivot = NIL;
        }
        final SubLObject f_arity = arity.arity(functor);
        if (NIL == f_arity) {
            return variable_arity_functor_list_agglomerate(functor, keyword, termlist, tolerant, pivot);
        }
        final SubLObject n_tuples = (NIL != pivot) ? pivot_k_permutations_of_list(f_arity, termlist, pivot) : k_permutations_of_list(f_arity, termlist);
        SubLObject results = NIL;
        SubLObject cdolist_list_var = n_tuples;
        SubLObject n_tuple = NIL;
        n_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject candidate = cons(functor, n_tuple);
            final SubLObject candidate_results = agglomerations_good_for_functor_n_tuple(candidate, keyword, tolerant);
            results = append(candidate_results, results);
            cdolist_list_var = cdolist_list_var.rest();
            n_tuple = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject variable_arity_functor_list_agglomerate(final SubLObject functor, final SubLObject keyword, final SubLObject termlist, SubLObject tolerant, SubLObject pivot) {
        if (tolerant == UNPROVIDED) {
            tolerant = NIL;
        }
        if (pivot == UNPROVIDED) {
            pivot = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject min_arity = NIL;
        SubLObject max_arity = NIL;
        SubLObject results = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            min_arity = kb_mapping_utilities.fpred_value(functor, $$arityMin, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            max_arity = kb_mapping_utilities.fpred_value(functor, $$arityMax, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        for (SubLObject index = min_arity; max_arity.numG(subtract(index, ONE_INTEGER)); index = add(ONE_INTEGER, index)) {
            SubLObject cdolist_list_var;
            final SubLObject n_tuples = cdolist_list_var = (NIL != pivot) ? pivot_k_permutations_of_list(index, termlist, pivot) : k_permutations_of_list(index, termlist);
            SubLObject n_tuple = NIL;
            n_tuple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject candidate = cons(functor, n_tuple);
                final SubLObject candidate_results = agglomerations_good_for_functor_n_tuple(candidate, keyword, tolerant);
                results = append(candidate_results, results);
                cdolist_list_var = cdolist_list_var.rest();
                n_tuple = cdolist_list_var.first();
            } 
        }
        return results;
    }

    public static SubLObject agglomerations_good_for_functor_n_tuple(final SubLObject functor_n_tuple_list, final SubLObject keyword, SubLObject tolerant) {
        if (tolerant == UNPROVIDED) {
            tolerant = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        if (keyword.eql($FUNCTION)) {
            SubLObject wft_test = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                wft_test = wff.el_wftP(functor_n_tuple_list, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            if (NIL != wft_test) {
                results = cons(functor_n_tuple_list, results);
            } else
                if (NIL != tolerant) {
                    SubLObject cdolist_list_var;
                    final SubLObject formulas = cdolist_list_var = replace_one_term_with_descriptive_variable(functor_n_tuple_list);
                    SubLObject form = NIL;
                    form = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject inner_wft = NIL;
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            inner_wft = wff.el_wftP(form, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                        }
                        if (NIL != inner_wft) {
                            final SubLObject item_var = form;
                            if (NIL == member(item_var, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                results = cons(item_var, results);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        form = cdolist_list_var.first();
                    } 
                }

        } else {
            SubLObject wff_test = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                wff_test = wff.el_wffP(functor_n_tuple_list, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            if (NIL != wff_test) {
                results = cons(functor_n_tuple_list, results);
            } else
                if (NIL != tolerant) {
                    SubLObject cdolist_list_var;
                    final SubLObject formulas = cdolist_list_var = replace_one_term_with_descriptive_variable(functor_n_tuple_list);
                    SubLObject form = NIL;
                    form = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject inner_wff = NIL;
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            inner_wff = wff.el_wffP(form, NIL, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                        }
                        if (NIL != inner_wff) {
                            final SubLObject item_var = form;
                            if (NIL == member(item_var, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                results = cons(item_var, results);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        form = cdolist_list_var.first();
                    } 
                }

        }
        return results;
    }

    public static SubLObject pivot_k_permutations_of_list(final SubLObject k, final SubLObject termlist, final SubLObject pivot) {
        final SubLObject base_set = cons(pivot, termlist);
        final SubLObject k_perms = k_permutations_of_list(k, base_set);
        SubLObject results = NIL;
        SubLObject cdolist_list_var = k_perms;
        SubLObject perm = NIL;
        perm = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(pivot, perm, symbol_function(EQUAL), UNPROVIDED)) {
                results = cons(perm, results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            perm = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject replace_one_term_with_descriptive_variable(final SubLObject el_object) {
        final SubLObject functor = el_object.first();
        final SubLObject args = el_object.rest();
        final SubLObject arg_len = length(args);
        SubLObject open_objects = NIL;
        SubLObject i;
        SubLObject new_arg_list;
        SubLObject j;
        SubLObject j_th_element;
        for (i = NIL, i = ZERO_INTEGER; i.numL(arg_len); i = add(i, ONE_INTEGER)) {
            new_arg_list = NIL;
            for (j = NIL, j = ZERO_INTEGER; j.numL(arg_len); j = add(j, ONE_INTEGER)) {
                j_th_element = (i.numE(j)) ? funct_num_to_nice_var_name(functor, add(i, ONE_INTEGER)) : nth(j, args);
                new_arg_list = cons(j_th_element, new_arg_list);
            }
            open_objects = cons(cons(functor, nreverse(new_arg_list)), open_objects);
        }
        return open_objects;
    }

    public static SubLObject funct_num_to_nice_var_name(final SubLObject functor, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg_isa = NIL;
        SubLObject var_name = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            arg_isa = kb_accessors.argn_isa(functor, num, UNPROVIDED).first();
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        var_name = Strings.string_upcase(string_utilities.string_tokenize(pph_main.generate_phrase(arg_isa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first(), UNPROVIDED, UNPROVIDED);
        return intern(cconcatenate($str10$_, new SubLObject[]{ var_name, $str11$_, prin1_to_string(num) }), UNPROVIDED);
    }

    public static SubLObject sort_terms_from_functors(final SubLObject list_of_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terms = NIL;
        SubLObject functions = NIL;
        SubLObject predicates = NIL;
        SubLObject cdolist_list_var = list_of_terms;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject fn_test = NIL;
            SubLObject pred_test = NIL;
            if (!item.isList()) {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    fn_test = fort_types_interface.non_predicate_functionP(item);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    pred_test = fort_types_interface.predicateP(item);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            if (item.isList()) {
                terms = cons(item, terms);
            } else
                if (NIL != fn_test) {
                    functions = cons(item, functions);
                } else
                    if (NIL != pred_test) {
                        predicates = cons(item, predicates);
                    } else {
                        terms = cons(item, terms);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return list(terms, functions, predicates);
    }

    public static SubLObject k_permutations_of_list(final SubLObject k, final SubLObject some_list) {
        final SubLObject len = length(some_list);
        if (k.numG(len)) {
            return NIL;
        }
        if (k.numE(len)) {
            return list_utilities.permute_list(some_list, UNPROVIDED);
        }
        return find_k_permutations(list(list(NIL, some_list)), NIL, k);
    }

    public static SubLObject find_k_permutations(final SubLObject stack, SubLObject result, final SubLObject k) {
        if (NIL == stack) {
            return result;
        }
        final SubLObject top = stack.first();
        SubLObject rest_stack = stack.rest();
        final SubLObject top_accumulator = top.first();
        final SubLObject top_rest = second(top);
        SubLObject working_list = NIL;
        SubLObject head = NIL;
        SubLObject pivot = NIL;
        SubLObject tail = NIL;
        SubLObject new_accumulator = NIL;
        SubLObject new_rest = NIL;
        working_list = top_rest;
        head = NIL;
        pivot = working_list.first();
        tail = working_list.rest();
        new_accumulator = cons(pivot, top_accumulator);
        new_rest = append(head, tail);
        while (NIL != working_list) {
            if (k.numE(length(new_accumulator))) {
                result = cons(new_accumulator, result);
            } else {
                rest_stack = cons(list(new_accumulator, new_rest), rest_stack);
            }
            working_list = working_list.rest();
            head = cons(pivot, head);
            pivot = working_list.first();
            tail = working_list.rest();
            new_accumulator = cons(pivot, top_accumulator);
            new_rest = append(head, tail);
        } 
        return find_k_permutations(rest_stack, result, k);
    }

    public static SubLObject fact(final SubLObject num) {
        if (num.isZero()) {
            return ONE_INTEGER;
        }
        return multiply(num, fact(subtract(num, ONE_INTEGER)));
    }

    public static SubLObject k_perm_num(final SubLObject set_num, final SubLObject subset_num) {
        return divide(fact(set_num), fact(subtract(set_num, subset_num)));
    }

    public static SubLObject find_acceptable_k_permutation_size(final SubLObject set_num, final SubLObject subset_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject high = set_num;
        SubLObject low = subset_num;
        SubLObject current = floor(divide(add(high, low), TWO_INTEGER), UNPROVIDED);
        while (subtract(high, low).numG(ONE_INTEGER)) {
            if (k_perm_num(current, subset_num).numG($k_permutations_max$.getDynamicValue(thread))) {
                high = current;
                current = floor(divide(add(high, low), TWO_INTEGER), UNPROVIDED);
            } else {
                if (!k_perm_num(current, subset_num).numL($k_permutations_max$.getDynamicValue(thread))) {
                    continue;
                }
                low = current;
                current = floor(divide(add(high, low), TWO_INTEGER), UNPROVIDED);
            }
        } 
        return current;
    }

    public static SubLObject make_list_k_permutation_acceptable(final SubLObject list_of_terms, final SubLObject k) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_len = length(list_of_terms);
        final SubLObject k_perms = k_perm_num(list_len, k);
        if ($k_permutations_max$.getDynamicValue(thread).numG(k_perms)) {
            return list_of_terms;
        }
        final SubLObject small_list_len = find_acceptable_k_permutation_size(list_len, k);
        final SubLObject index = subtract(list_len, ONE_INTEGER);
        SubLObject small_list;
        SubLObject item_var;
        for (small_list = NIL; small_list_len.numG(length(small_list)); small_list = cons(item_var, small_list)) {
            item_var = nth(random.random(index), list_of_terms);
            if (NIL == member(item_var, small_list, symbol_function(EQUAL), symbol_function(IDENTITY))) {
            }
        }
        return small_list;
    }

    public static SubLObject agglomeration_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject agglomeration_state_p(final SubLObject v_object) {
        return v_object.getClass() == rkf_term_agglomerator.$agglomeration_state_native.class ? T : NIL;
    }

    public static SubLObject agglomeration_state_uncovered_terms(final SubLObject v_object) {
        assert NIL != agglomeration_state_p(v_object) : "rkf_term_agglomerator.agglomeration_state_p(v_object) " + "CommonSymbols.NIL != rkf_term_agglomerator.agglomeration_state_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject agglomeration_state_agglomerations_available(final SubLObject v_object) {
        assert NIL != agglomeration_state_p(v_object) : "rkf_term_agglomerator.agglomeration_state_p(v_object) " + "CommonSymbols.NIL != rkf_term_agglomerator.agglomeration_state_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject agglomeration_state_agglomerations_used(final SubLObject v_object) {
        assert NIL != agglomeration_state_p(v_object) : "rkf_term_agglomerator.agglomeration_state_p(v_object) " + "CommonSymbols.NIL != rkf_term_agglomerator.agglomeration_state_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_agglomeration_state_uncovered_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != agglomeration_state_p(v_object) : "rkf_term_agglomerator.agglomeration_state_p(v_object) " + "CommonSymbols.NIL != rkf_term_agglomerator.agglomeration_state_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_agglomeration_state_agglomerations_available(final SubLObject v_object, final SubLObject value) {
        assert NIL != agglomeration_state_p(v_object) : "rkf_term_agglomerator.agglomeration_state_p(v_object) " + "CommonSymbols.NIL != rkf_term_agglomerator.agglomeration_state_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_agglomeration_state_agglomerations_used(final SubLObject v_object, final SubLObject value) {
        assert NIL != agglomeration_state_p(v_object) : "rkf_term_agglomerator.agglomeration_state_p(v_object) " + "CommonSymbols.NIL != rkf_term_agglomerator.agglomeration_state_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_agglomeration_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new rkf_term_agglomerator.$agglomeration_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($UNCOVERED_TERMS)) {
                _csetf_agglomeration_state_uncovered_terms(v_new, current_value);
            } else
                if (pcase_var.eql($AGGLOMERATIONS_AVAILABLE)) {
                    _csetf_agglomeration_state_agglomerations_available(v_new, current_value);
                } else
                    if (pcase_var.eql($AGGLOMERATIONS_USED)) {
                        _csetf_agglomeration_state_agglomerations_used(v_new, current_value);
                    } else {
                        Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_agglomeration_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AGGLOMERATION_STATE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $UNCOVERED_TERMS, agglomeration_state_uncovered_terms(obj));
        funcall(visitor_fn, obj, $SLOT, $AGGLOMERATIONS_AVAILABLE, agglomeration_state_agglomerations_available(obj));
        funcall(visitor_fn, obj, $SLOT, $AGGLOMERATIONS_USED, agglomeration_state_agglomerations_used(obj));
        funcall(visitor_fn, obj, $END, MAKE_AGGLOMERATION_STATE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_agglomeration_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_agglomeration_state(obj, visitor_fn);
    }

    public static SubLObject new_agglomeration_state(final SubLObject term_list, final SubLObject available, final SubLObject used) {
        final SubLObject new_state = make_agglomeration_state(UNPROVIDED);
        _csetf_agglomeration_state_uncovered_terms(new_state, term_list);
        _csetf_agglomeration_state_agglomerations_available(new_state, available);
        _csetf_agglomeration_state_agglomerations_used(new_state, used);
        return new_state;
    }

    public static SubLObject compute_new_agglomeration_states(final SubLObject aggl_state) {
        final SubLObject term_list = agglomeration_state_uncovered_terms(aggl_state);
        if (NIL == term_list) {
            return NIL;
        }
        final SubLObject available = agglomeration_state_agglomerations_available(aggl_state);
        final SubLObject used = agglomeration_state_agglomerations_used(aggl_state);
        SubLObject auxiliary_list = NIL;
        SubLObject new_agglomeration_states = NIL;
        SubLObject cdolist_list_var = available;
        SubLObject agglomerate = NIL;
        agglomerate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key = intersection(term_list, agglomerate, UNPROVIDED, UNPROVIDED);
            if (NIL != key) {
                final SubLObject old_couple = assoc(key, auxiliary_list, symbol_function($sym37$SETS_EQUAL_EQUAL_), UNPROVIDED);
                final SubLObject old_value = second(old_couple);
                final SubLObject new_value = cons(agglomerate, old_value);
                final SubLObject new_couple = list(key, new_value);
                if (NIL != old_couple) {
                    subst(new_couple, old_couple, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                } else {
                    auxiliary_list = cons(new_couple, auxiliary_list);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            agglomerate = cdolist_list_var.first();
        } 
        cdolist_list_var = auxiliary_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key = item.first();
            final SubLObject value = second(item);
            final SubLObject new_term_list = set_difference(term_list, key, symbol_function(EQUAL), UNPROVIDED);
            final SubLObject new_available = set_difference(available, value, symbol_function(EQUAL), UNPROVIDED);
            final SubLObject new_used = append(value, used);
            final SubLObject new_state = new_agglomeration_state(new_term_list, new_available, new_used);
            new_agglomeration_states = cons(new_state, new_agglomeration_states);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return new_agglomeration_states;
    }

    public static SubLObject declare_rkf_term_agglomerator_file() {
        declareFunction(me, "turn_kr_sugar_on", "TURN-KR-SUGAR-ON", 0, 0, false);
        declareFunction(me, "turn_kr_sugar_off", "TURN-KR-SUGAR-OFF", 0, 0, false);
        declareFunction(me, "initialize_kr_sugar_set", "INITIALIZE-KR-SUGAR-SET", 0, 0, false);
        declareFunction(me, "rkf_term_agglomerator", "RKF-TERM-AGGLOMERATOR", 1, 1, false);
        declareFunction(me, "suggest_agglomerate_simple", "SUGGEST-AGGLOMERATE-SIMPLE", 1, 2, false);
        declareFunction(me, "suggest_list_agglomerations", "SUGGEST-LIST-AGGLOMERATIONS", 1, 1, false);
        declareFunction(me, "agglomerate_list_simple", "AGGLOMERATE-LIST-SIMPLE", 1, 2, false);
        declareFunction(me, "functor_list_agglomerate", "FUNCTOR-LIST-AGGLOMERATE", 3, 2, false);
        declareFunction(me, "variable_arity_functor_list_agglomerate", "VARIABLE-ARITY-FUNCTOR-LIST-AGGLOMERATE", 3, 2, false);
        declareFunction(me, "agglomerations_good_for_functor_n_tuple", "AGGLOMERATIONS-GOOD-FOR-FUNCTOR-N-TUPLE", 2, 1, false);
        declareFunction(me, "pivot_k_permutations_of_list", "PIVOT-K-PERMUTATIONS-OF-LIST", 3, 0, false);
        declareFunction(me, "replace_one_term_with_descriptive_variable", "REPLACE-ONE-TERM-WITH-DESCRIPTIVE-VARIABLE", 1, 0, false);
        declareFunction(me, "funct_num_to_nice_var_name", "FUNCT-NUM-TO-NICE-VAR-NAME", 2, 0, false);
        declareFunction(me, "sort_terms_from_functors", "SORT-TERMS-FROM-FUNCTORS", 1, 0, false);
        declareFunction(me, "k_permutations_of_list", "K-PERMUTATIONS-OF-LIST", 2, 0, false);
        declareFunction(me, "find_k_permutations", "FIND-K-PERMUTATIONS", 3, 0, false);
        declareFunction(me, "fact", "FACT", 1, 0, false);
        declareFunction(me, "k_perm_num", "K-PERM-NUM", 2, 0, false);
        declareFunction(me, "find_acceptable_k_permutation_size", "FIND-ACCEPTABLE-K-PERMUTATION-SIZE", 2, 0, false);
        declareFunction(me, "make_list_k_permutation_acceptable", "MAKE-LIST-K-PERMUTATION-ACCEPTABLE", 2, 0, false);
        declareFunction(me, "agglomeration_state_print_function_trampoline", "AGGLOMERATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "agglomeration_state_p", "AGGLOMERATION-STATE-P", 1, 0, false);
        new rkf_term_agglomerator.$agglomeration_state_p$UnaryFunction();
        declareFunction(me, "agglomeration_state_uncovered_terms", "AGGLOMERATION-STATE-UNCOVERED-TERMS", 1, 0, false);
        declareFunction(me, "agglomeration_state_agglomerations_available", "AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE", 1, 0, false);
        declareFunction(me, "agglomeration_state_agglomerations_used", "AGGLOMERATION-STATE-AGGLOMERATIONS-USED", 1, 0, false);
        declareFunction(me, "_csetf_agglomeration_state_uncovered_terms", "_CSETF-AGGLOMERATION-STATE-UNCOVERED-TERMS", 2, 0, false);
        declareFunction(me, "_csetf_agglomeration_state_agglomerations_available", "_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE", 2, 0, false);
        declareFunction(me, "_csetf_agglomeration_state_agglomerations_used", "_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-USED", 2, 0, false);
        declareFunction(me, "make_agglomeration_state", "MAKE-AGGLOMERATION-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_agglomeration_state", "VISIT-DEFSTRUCT-AGGLOMERATION-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_agglomeration_state_method", "VISIT-DEFSTRUCT-OBJECT-AGGLOMERATION-STATE-METHOD", 2, 0, false);
        declareFunction(me, "new_agglomeration_state", "NEW-AGGLOMERATION-STATE", 3, 0, false);
        declareFunction(me, "compute_new_agglomeration_states", "COMPUTE-NEW-AGGLOMERATION-STATES", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_term_agglomerator_file() {
        defparameter("*KR-SUGAR-ON*", NIL);
        deflexical("*KR-SUGAR*", SubLTrampolineFile.maybeDefault($kr_sugar$, $kr_sugar$, NIL));
        defparameter("*K-PERMUTATIONS-MAX*", $int$100000);
        defconstant("*DTP-AGGLOMERATION-STATE*", AGGLOMERATION_STATE);
        return NIL;
    }

    public static SubLObject setup_rkf_term_agglomerator_file() {
        declare_defglobal($kr_sugar$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_agglomeration_state$.getGlobalValue(), symbol_function(AGGLOMERATION_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list21);
        def_csetf(AGGLOMERATION_STATE_UNCOVERED_TERMS, _CSETF_AGGLOMERATION_STATE_UNCOVERED_TERMS);
        def_csetf(AGGLOMERATION_STATE_AGGLOMERATIONS_AVAILABLE, _CSETF_AGGLOMERATION_STATE_AGGLOMERATIONS_AVAILABLE);
        def_csetf(AGGLOMERATION_STATE_AGGLOMERATIONS_USED, _CSETF_AGGLOMERATION_STATE_AGGLOMERATIONS_USED);
        identity(AGGLOMERATION_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_agglomeration_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AGGLOMERATION_STATE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_term_agglomerator_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_term_agglomerator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_term_agglomerator_file();
    }

    static {











































    }

    public static final class $agglomeration_state_native extends SubLStructNative {
        public SubLObject $uncovered_terms;

        public SubLObject $agglomerations_available;

        public SubLObject $agglomerations_used;

        private static final SubLStructDeclNative structDecl;

        public $agglomeration_state_native() {
            this.$uncovered_terms = Lisp.NIL;
            this.$agglomerations_available = Lisp.NIL;
            this.$agglomerations_used = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$uncovered_terms;
        }

        @Override
        public SubLObject getField3() {
            return this.$agglomerations_available;
        }

        @Override
        public SubLObject getField4() {
            return this.$agglomerations_used;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$uncovered_terms = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$agglomerations_available = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$agglomerations_used = value;
        }

        static {
            structDecl = makeStructDeclNative(rkf_term_agglomerator.$agglomeration_state_native.class, AGGLOMERATION_STATE, AGGLOMERATION_STATE_P, $list15, $list16, new String[]{ "$uncovered_terms", "$agglomerations_available", "$agglomerations_used" }, $list17, $list18, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $agglomeration_state_p$UnaryFunction extends UnaryFunction {
        public $agglomeration_state_p$UnaryFunction() {
            super(extractFunctionNamed("AGGLOMERATION-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return agglomeration_state_p(arg1);
        }
    }
}

/**
 * Total time: 183 ms
 */
