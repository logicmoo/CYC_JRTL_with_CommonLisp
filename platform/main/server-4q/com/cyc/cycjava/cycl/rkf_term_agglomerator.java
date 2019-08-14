/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-TERM-AGGLOMERATOR
 * source file: /cyc/top/cycl/rkf-term-agglomerator.lisp
 * created:     2019/07/03 17:37:59
 */
public final class rkf_term_agglomerator extends SubLTranslatedFile implements V12 {
    public static final class $agglomeration_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native.this.$uncovered_terms;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native.this.$agglomerations_available;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native.this.$agglomerations_used;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native.this.$uncovered_terms = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native.this.$agglomerations_available = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native.this.$agglomerations_used = value;
        }

        public SubLObject $uncovered_terms = Lisp.NIL;

        public SubLObject $agglomerations_available = Lisp.NIL;

        public SubLObject $agglomerations_used = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native.class, AGGLOMERATION_STATE, AGGLOMERATION_STATE_P, $list_alt15, $list_alt16, new String[]{ "$uncovered_terms", "$agglomerations_available", "$agglomerations_used" }, $list_alt17, $list_alt18, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new rkf_term_agglomerator();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_term_agglomerator";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $kr_sugar_on$ = makeSymbol("*KR-SUGAR-ON*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $k_permutations_max$ = makeSymbol("*K-PERMUTATIONS-MAX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_agglomeration_state$ = makeSymbol("*DTP-AGGLOMERATION-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $kr_sugar$ = makeSymbol("*KR-SUGAR*");



    static private final SubLString $str2$___S_KR_sugar_spoons_added_to_the = makeString("~%~S KR sugar spoons added to the mix.");



    static private final SubLList $list7 = list(makeSymbol("TERMS"), makeSymbol("FUNCTIONS"), makeSymbol("PREDICATES"));





    static private final SubLString $str10$_ = makeString("?");

    static private final SubLString $str11$_ = makeString("-");

    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLSymbol AGGLOMERATION_STATE = makeSymbol("AGGLOMERATION-STATE");

    private static final SubLSymbol AGGLOMERATION_STATE_P = makeSymbol("AGGLOMERATION-STATE-P");

    static private final SubLList $list15 = list(makeSymbol("UNCOVERED-TERMS"), makeSymbol("AGGLOMERATIONS-AVAILABLE"), makeSymbol("AGGLOMERATIONS-USED"));

    static private final SubLList $list16 = list(makeKeyword("UNCOVERED-TERMS"), makeKeyword("AGGLOMERATIONS-AVAILABLE"), makeKeyword("AGGLOMERATIONS-USED"));

    static private final SubLList $list17 = list(makeSymbol("AGGLOMERATION-STATE-UNCOVERED-TERMS"), makeSymbol("AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE"), makeSymbol("AGGLOMERATION-STATE-AGGLOMERATIONS-USED"));

    static private final SubLList $list18 = list(makeSymbol("_CSETF-AGGLOMERATION-STATE-UNCOVERED-TERMS"), makeSymbol("_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE"), makeSymbol("_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-USED"));

    private static final SubLSymbol AGGLOMERATION_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AGGLOMERATION-STATE-PRINT-FUNCTION-TRAMPOLINE");

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

    public static final SubLObject turn_kr_sugar_on_alt() {
        $kr_sugar_on$.setDynamicValue(T);
        return T;
    }

    public static SubLObject turn_kr_sugar_on() {
        $kr_sugar_on$.setDynamicValue(T);
        return T;
    }

    public static final SubLObject turn_kr_sugar_off_alt() {
        $kr_sugar_on$.setDynamicValue(NIL);
        return T;
    }

    public static SubLObject turn_kr_sugar_off() {
        $kr_sugar_on$.setDynamicValue(NIL);
        return T;
    }

    public static final SubLObject initialize_kr_sugar_set_alt() {
        $kr_sugar$.setGlobalValue(isa.all_fort_instances($$RuleMacroPredicate, UNPROVIDED, UNPROVIDED));
        format(T, $str_alt2$___S_KR_sugar_spoons_added_to_the, length($kr_sugar$.getGlobalValue()));
        return T;
    }

    public static SubLObject initialize_kr_sugar_set() {
        $kr_sugar$.setGlobalValue(isa.all_fort_instances($$RuleMacroPredicate, UNPROVIDED, UNPROVIDED));
        format(T, $str2$___S_KR_sugar_spoons_added_to_the, length($kr_sugar$.getGlobalValue()));
        return T;
    }

    public static final SubLObject rkf_term_agglomerator_alt(SubLObject new_term, SubLObject old_terms) {
        if (old_terms == UNPROVIDED) {
            old_terms = NIL;
        }
        if (NIL == old_terms) {
            return list(new_term);
        }
        return agglomerate_list_simple(old_terms, T, new_term);
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

    public static final SubLObject suggest_agglomerate_simple_alt(SubLObject list_of_terms, SubLObject tolerant, SubLObject pivot) {
        if (tolerant == UNPROVIDED) {
            tolerant = NIL;
        }
        if (pivot == UNPROVIDED) {
            pivot = NIL;
        }
        {
            SubLObject agglomeration = agglomerate_list_simple(list_of_terms, tolerant, pivot);
            if (NIL != agglomeration) {
                return agglomeration;
            } else {
                return suggest_list_agglomerations(list_of_terms, pivot);
            }
        }
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

    public static final SubLObject suggest_list_agglomerations_alt(SubLObject list_of_terms, SubLObject pivot) {
        if (pivot == UNPROVIDED) {
            pivot = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(rkf_tools.$rkf_max_arity$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject n_tuples = (NIL != pivot) ? ((SubLObject) (pivot_k_permutations_of_list(i, list_of_terms, pivot))) : k_permutations_of_list(i, list_of_terms);
                        SubLObject cdolist_list_var = n_tuples;
                        SubLObject n_tuple = NIL;
                        for (n_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , n_tuple = cdolist_list_var.first()) {
                            {
                                SubLObject suggestions = rkf_relationship_suggestor.find_relations_of_terms(n_tuple, UNPROVIDED, UNPROVIDED);
                                SubLObject cdolist_list_var_1 = suggestions;
                                SubLObject suggestion = NIL;
                                for (suggestion = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , suggestion = cdolist_list_var_1.first()) {
                                    if (suggestion.isList()) {
                                        result = cons(suggestion, result);
                                    } else {
                                        {
                                            SubLObject fn_test = NIL;
                                            SubLObject local_result = NIL;
                                            {
                                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                    fn_test = fort_types_interface.non_predicate_functionP(suggestion);
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                            if (NIL != fn_test) {
                                                local_result = agglomerations_good_for_functor_n_tuple(cons(suggestion, n_tuple), $FUNCTION, UNPROVIDED);
                                            } else {
                                                local_result = agglomerations_good_for_functor_n_tuple(cons(suggestion, n_tuple), $PREDICATE, UNPROVIDED);
                                            }
                                            result = append(local_result, result);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
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

    public static final SubLObject agglomerate_list_simple_alt(SubLObject list_of_terms, SubLObject tolerant, SubLObject pivot) {
        if (tolerant == UNPROVIDED) {
            tolerant = NIL;
        }
        if (pivot == UNPROVIDED) {
            pivot = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject functor_test = NIL;
                SubLObject predicate_test = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        functor_test = fort_types_interface.non_predicate_functionP(pivot);
                        predicate_test = fort_types_interface.predicateP(pivot);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != functor_test) {
                    return functor_list_agglomerate(pivot, $FUNCTION, list_of_terms, tolerant, NIL);
                }
                if (NIL != predicate_test) {
                    return functor_list_agglomerate(pivot, $PREDICATE, list_of_terms, tolerant, NIL);
                }
            }
            {
                SubLObject datum = sort_terms_from_functors(list_of_terms);
                SubLObject current = datum;
                SubLObject terms = NIL;
                SubLObject functions = NIL;
                SubLObject predicates = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt7);
                terms = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                functions = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                predicates = current.first();
                current = current.rest();
                if (NIL == current) {
                    terms = append(predicates, terms);
                    if (NIL != $kr_sugar_on$.getDynamicValue(thread)) {
                        predicates = append($kr_sugar$.getGlobalValue(), predicates);
                    }
                    {
                        SubLObject result = NIL;
                        {
                            SubLObject cdolist_list_var = functions;
                            SubLObject fn = NIL;
                            for (fn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fn = cdolist_list_var.first()) {
                                result = append(functor_list_agglomerate(fn, $FUNCTION, terms, tolerant, pivot), result);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = predicates;
                            SubLObject pr = NIL;
                            for (pr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pr = cdolist_list_var.first()) {
                                result = append(functor_list_agglomerate(pr, $PREDICATE, terms, tolerant, pivot), result);
                            }
                        }
                        return result;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
            }
            return NIL;
        }
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

    public static final SubLObject functor_list_agglomerate_alt(SubLObject functor, SubLObject keyword, SubLObject termlist, SubLObject tolerant, SubLObject pivot) {
        if (tolerant == UNPROVIDED) {
            tolerant = NIL;
        }
        if (pivot == UNPROVIDED) {
            pivot = NIL;
        }
        {
            SubLObject f_arity = arity.arity(functor);
            if (NIL == f_arity) {
                return variable_arity_functor_list_agglomerate(functor, keyword, termlist, tolerant, pivot);
            }
            {
                SubLObject n_tuples = (NIL != pivot) ? ((SubLObject) (pivot_k_permutations_of_list(f_arity, termlist, pivot))) : k_permutations_of_list(f_arity, termlist);
                SubLObject results = NIL;
                SubLObject cdolist_list_var = n_tuples;
                SubLObject n_tuple = NIL;
                for (n_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , n_tuple = cdolist_list_var.first()) {
                    {
                        SubLObject candidate = cons(functor, n_tuple);
                        SubLObject candidate_results = agglomerations_good_for_functor_n_tuple(candidate, keyword, tolerant);
                        results = append(candidate_results, results);
                    }
                }
                return results;
            }
        }
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

    public static final SubLObject variable_arity_functor_list_agglomerate_alt(SubLObject functor, SubLObject keyword, SubLObject termlist, SubLObject tolerant, SubLObject pivot) {
        if (tolerant == UNPROVIDED) {
            tolerant = NIL;
        }
        if (pivot == UNPROVIDED) {
            pivot = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject min_arity = NIL;
                SubLObject max_arity = NIL;
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        min_arity = kb_mapping_utilities.fpred_value(functor, $$arityMin, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        max_arity = kb_mapping_utilities.fpred_value(functor, $$arityMax, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject index = min_arity;
                    while (max_arity.numG(subtract(index, ONE_INTEGER))) {
                        {
                            SubLObject n_tuples = (NIL != pivot) ? ((SubLObject) (pivot_k_permutations_of_list(index, termlist, pivot))) : k_permutations_of_list(index, termlist);
                            SubLObject cdolist_list_var = n_tuples;
                            SubLObject n_tuple = NIL;
                            for (n_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , n_tuple = cdolist_list_var.first()) {
                                {
                                    SubLObject candidate = cons(functor, n_tuple);
                                    SubLObject candidate_results = agglomerations_good_for_functor_n_tuple(candidate, keyword, tolerant);
                                    results = append(candidate_results, results);
                                }
                            }
                        }
                        index = add(ONE_INTEGER, index);
                    } 
                }
                return results;
            }
        }
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

    public static final SubLObject agglomerations_good_for_functor_n_tuple_alt(SubLObject functor_n_tuple_list, SubLObject keyword, SubLObject tolerant) {
        if (tolerant == UNPROVIDED) {
            tolerant = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                if (keyword.eql($FUNCTION)) {
                    {
                        SubLObject wft_test = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                wft_test = wff.el_wftP(functor_n_tuple_list, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != wft_test) {
                            results = cons(functor_n_tuple_list, results);
                        } else {
                            if (NIL != tolerant) {
                                {
                                    SubLObject formulas = replace_one_term_with_descriptive_variable(functor_n_tuple_list);
                                    SubLObject cdolist_list_var = formulas;
                                    SubLObject form = NIL;
                                    for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                                        {
                                            SubLObject inner_wft = NIL;
                                            {
                                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                    inner_wft = wff.el_wftP(form, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                            if (NIL != inner_wft) {
                                                {
                                                    SubLObject item_var = form;
                                                    if (NIL == member(item_var, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        results = cons(item_var, results);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject wff_test = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                wff_test = wff.el_wffP(functor_n_tuple_list, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != wff_test) {
                            results = cons(functor_n_tuple_list, results);
                        } else {
                            if (NIL != tolerant) {
                                {
                                    SubLObject formulas = replace_one_term_with_descriptive_variable(functor_n_tuple_list);
                                    SubLObject cdolist_list_var = formulas;
                                    SubLObject form = NIL;
                                    for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                                        {
                                            SubLObject inner_wff = NIL;
                                            {
                                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                    inner_wff = wff.el_wffP(form, NIL, UNPROVIDED);
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                            if (NIL != inner_wff) {
                                                {
                                                    SubLObject item_var = form;
                                                    if (NIL == member(item_var, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        results = cons(item_var, results);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return results;
            }
        }
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

    public static final SubLObject pivot_k_permutations_of_list_alt(SubLObject k, SubLObject termlist, SubLObject pivot) {
        {
            SubLObject base_set = cons(pivot, termlist);
            SubLObject k_perms = k_permutations_of_list(k, base_set);
            SubLObject results = NIL;
            SubLObject cdolist_list_var = k_perms;
            SubLObject perm = NIL;
            for (perm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , perm = cdolist_list_var.first()) {
                if (NIL != subl_promotions.memberP(pivot, perm, symbol_function(EQUAL), UNPROVIDED)) {
                    results = cons(perm, results);
                }
            }
            return results;
        }
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

    public static final SubLObject replace_one_term_with_descriptive_variable_alt(SubLObject el_object) {
        {
            SubLObject functor = el_object.first();
            SubLObject args = el_object.rest();
            SubLObject arg_len = length(args);
            SubLObject open_objects = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(arg_len); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject new_arg_list = NIL;
                    SubLObject j = NIL;
                    for (j = ZERO_INTEGER; j.numL(arg_len); j = add(j, ONE_INTEGER)) {
                        {
                            SubLObject j_th_element = (i.numE(j)) ? ((SubLObject) (funct_num_to_nice_var_name(functor, add(i, ONE_INTEGER)))) : nth(j, args);
                            new_arg_list = cons(j_th_element, new_arg_list);
                        }
                    }
                    open_objects = cons(cons(functor, nreverse(new_arg_list)), open_objects);
                }
            }
            return open_objects;
        }
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

    public static final SubLObject funct_num_to_nice_var_name_alt(SubLObject functor, SubLObject num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg_isa = NIL;
                SubLObject var_name = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        arg_isa = kb_accessors.argn_isa(functor, num, UNPROVIDED).first();
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                var_name = Strings.string_upcase(string_utilities.string_tokenize(pph_main.generate_phrase(arg_isa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first(), UNPROVIDED, UNPROVIDED);
                return intern(cconcatenate($str_alt10$_, new SubLObject[]{ var_name, $str_alt11$_, prin1_to_string(num) }), UNPROVIDED);
            }
        }
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

    public static final SubLObject sort_terms_from_functors_alt(SubLObject list_of_terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terms = NIL;
                SubLObject functions = NIL;
                SubLObject predicates = NIL;
                SubLObject cdolist_list_var = list_of_terms;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    {
                        SubLObject fn_test = NIL;
                        SubLObject pred_test = NIL;
                        if (!item.isList()) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    fn_test = fort_types_interface.non_predicate_functionP(item);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    pred_test = fort_types_interface.predicateP(item);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        if (item.isList()) {
                            terms = cons(item, terms);
                        } else {
                            if (NIL != fn_test) {
                                functions = cons(item, functions);
                            } else {
                                if (NIL != pred_test) {
                                    predicates = cons(item, predicates);
                                } else {
                                    terms = cons(item, terms);
                                }
                            }
                        }
                    }
                }
                return list(terms, functions, predicates);
            }
        }
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

    public static final SubLObject k_permutations_of_list_alt(SubLObject k, SubLObject some_list) {
        {
            SubLObject len = length(some_list);
            if (k.numG(len)) {
                return NIL;
            } else {
                if (k.numE(len)) {
                    return list_utilities.permute_list(some_list, UNPROVIDED);
                } else {
                    return find_k_permutations(list(list(NIL, some_list)), NIL, k);
                }
            }
        }
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

    public static final SubLObject find_k_permutations_alt(SubLObject stack, SubLObject result, SubLObject k) {
        if (NIL == stack) {
            return result;
        } else {
            {
                SubLObject top = stack.first();
                SubLObject rest_stack = stack.rest();
                SubLObject top_accumulator = top.first();
                SubLObject top_rest = second(top);
                SubLObject working_list = NIL;
                SubLObject head = NIL;
                SubLObject pivot = NIL;
                SubLObject tail = NIL;
                SubLObject new_accumulator = NIL;
                SubLObject new_rest = NIL;
                for (working_list = top_rest, head = NIL, pivot = working_list.first(), tail = working_list.rest(), new_accumulator = cons(pivot, top_accumulator), new_rest = append(head, tail); NIL != working_list; working_list = working_list.rest() , head = cons(pivot, head) , pivot = working_list.first() , tail = working_list.rest() , new_accumulator = cons(pivot, top_accumulator) , new_rest = append(head, tail)) {
                    if (k.numE(length(new_accumulator))) {
                        result = cons(new_accumulator, result);
                    } else {
                        rest_stack = cons(list(new_accumulator, new_rest), rest_stack);
                    }
                }
                return find_k_permutations(rest_stack, result, k);
            }
        }
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

    public static final SubLObject fact_alt(SubLObject num) {
        if (num.isZero()) {
            return ONE_INTEGER;
        } else {
            return multiply(num, fact(subtract(num, ONE_INTEGER)));
        }
    }

    public static SubLObject fact(final SubLObject num) {
        if (num.isZero()) {
            return ONE_INTEGER;
        }
        return multiply(num, fact(subtract(num, ONE_INTEGER)));
    }

    public static final SubLObject k_perm_num_alt(SubLObject set_num, SubLObject subset_num) {
        return divide(fact(set_num), fact(subtract(set_num, subset_num)));
    }

    public static SubLObject k_perm_num(final SubLObject set_num, final SubLObject subset_num) {
        return divide(fact(set_num), fact(subtract(set_num, subset_num)));
    }

    public static final SubLObject find_acceptable_k_permutation_size_alt(SubLObject set_num, SubLObject subset_num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject high = set_num;
                SubLObject low = subset_num;
                SubLObject current = floor(divide(add(high, low), TWO_INTEGER), UNPROVIDED);
                while (subtract(high, low).numG(ONE_INTEGER)) {
                    if (k_perm_num(current, subset_num).numG($k_permutations_max$.getDynamicValue(thread))) {
                        high = current;
                        current = floor(divide(add(high, low), TWO_INTEGER), UNPROVIDED);
                    } else {
                        if (k_perm_num(current, subset_num).numL($k_permutations_max$.getDynamicValue(thread))) {
                            low = current;
                            current = floor(divide(add(high, low), TWO_INTEGER), UNPROVIDED);
                        }
                    }
                } 
                return current;
            }
        }
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

    public static final SubLObject make_list_k_permutation_acceptable_alt(SubLObject list_of_terms, SubLObject k) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_len = length(list_of_terms);
                SubLObject k_perms = k_perm_num(list_len, k);
                if ($k_permutations_max$.getDynamicValue(thread).numG(k_perms)) {
                    return list_of_terms;
                }
                {
                    SubLObject small_list_len = find_acceptable_k_permutation_size(list_len, k);
                    SubLObject index = subtract(list_len, ONE_INTEGER);
                    SubLObject small_list = NIL;
                    while (small_list_len.numG(length(small_list))) {
                        {
                            SubLObject item_var = nth(random.random(index), list_of_terms);
                            if (NIL == member(item_var, small_list, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                small_list = cons(item_var, small_list);
                            }
                        }
                    } 
                    return small_list;
                }
            }
        }
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

    public static final SubLObject agglomeration_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject agglomeration_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject agglomeration_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject agglomeration_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native.class ? T : NIL;
    }

    public static final SubLObject agglomeration_state_uncovered_terms_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AGGLOMERATION_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject agglomeration_state_uncovered_terms(final SubLObject v_object) {
        assert NIL != agglomeration_state_p(v_object) : "! rkf_term_agglomerator.agglomeration_state_p(v_object) " + "rkf_term_agglomerator.agglomeration_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject agglomeration_state_agglomerations_available_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AGGLOMERATION_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject agglomeration_state_agglomerations_available(final SubLObject v_object) {
        assert NIL != agglomeration_state_p(v_object) : "! rkf_term_agglomerator.agglomeration_state_p(v_object) " + "rkf_term_agglomerator.agglomeration_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject agglomeration_state_agglomerations_used_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AGGLOMERATION_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject agglomeration_state_agglomerations_used(final SubLObject v_object) {
        assert NIL != agglomeration_state_p(v_object) : "! rkf_term_agglomerator.agglomeration_state_p(v_object) " + "rkf_term_agglomerator.agglomeration_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_agglomeration_state_uncovered_terms_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AGGLOMERATION_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_agglomeration_state_uncovered_terms(final SubLObject v_object, final SubLObject value) {
        assert NIL != agglomeration_state_p(v_object) : "! rkf_term_agglomerator.agglomeration_state_p(v_object) " + "rkf_term_agglomerator.agglomeration_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_agglomeration_state_agglomerations_available_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AGGLOMERATION_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_agglomeration_state_agglomerations_available(final SubLObject v_object, final SubLObject value) {
        assert NIL != agglomeration_state_p(v_object) : "! rkf_term_agglomerator.agglomeration_state_p(v_object) " + "rkf_term_agglomerator.agglomeration_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_agglomeration_state_agglomerations_used_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AGGLOMERATION_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_agglomeration_state_agglomerations_used(final SubLObject v_object, final SubLObject value) {
        assert NIL != agglomeration_state_p(v_object) : "! rkf_term_agglomerator.agglomeration_state_p(v_object) " + "rkf_term_agglomerator.agglomeration_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_agglomeration_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($UNCOVERED_TERMS)) {
                        _csetf_agglomeration_state_uncovered_terms(v_new, current_value);
                    } else {
                        if (pcase_var.eql($AGGLOMERATIONS_AVAILABLE)) {
                            _csetf_agglomeration_state_agglomerations_available(v_new, current_value);
                        } else {
                            if (pcase_var.eql($AGGLOMERATIONS_USED)) {
                                _csetf_agglomeration_state_agglomerations_used(v_new, current_value);
                            } else {
                                Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_agglomeration_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_term_agglomerator.$agglomeration_state_native();
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

    public static final SubLObject new_agglomeration_state_alt(SubLObject term_list, SubLObject available, SubLObject used) {
        {
            SubLObject new_state = make_agglomeration_state(UNPROVIDED);
            _csetf_agglomeration_state_uncovered_terms(new_state, term_list);
            _csetf_agglomeration_state_agglomerations_available(new_state, available);
            _csetf_agglomeration_state_agglomerations_used(new_state, used);
            return new_state;
        }
    }

    public static SubLObject new_agglomeration_state(final SubLObject term_list, final SubLObject available, final SubLObject used) {
        final SubLObject new_state = make_agglomeration_state(UNPROVIDED);
        _csetf_agglomeration_state_uncovered_terms(new_state, term_list);
        _csetf_agglomeration_state_agglomerations_available(new_state, available);
        _csetf_agglomeration_state_agglomerations_used(new_state, used);
        return new_state;
    }

    public static final SubLObject compute_new_agglomeration_states_alt(SubLObject aggl_state) {
        {
            SubLObject term_list = agglomeration_state_uncovered_terms(aggl_state);
            if (NIL == term_list) {
                return NIL;
            } else {
                {
                    SubLObject available = agglomeration_state_agglomerations_available(aggl_state);
                    SubLObject used = agglomeration_state_agglomerations_used(aggl_state);
                    SubLObject auxiliary_list = NIL;
                    SubLObject new_agglomeration_states = NIL;
                    {
                        SubLObject cdolist_list_var = available;
                        SubLObject agglomerate = NIL;
                        for (agglomerate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , agglomerate = cdolist_list_var.first()) {
                            {
                                SubLObject key = intersection(term_list, agglomerate, UNPROVIDED, UNPROVIDED);
                                if (NIL != key) {
                                    {
                                        SubLObject old_couple = assoc(key, auxiliary_list, symbol_function($sym31$SETS_EQUAL_EQUAL_), UNPROVIDED);
                                        SubLObject old_value = second(old_couple);
                                        SubLObject new_value = cons(agglomerate, old_value);
                                        SubLObject new_couple = list(key, new_value);
                                        if (NIL != old_couple) {
                                            subst(new_couple, old_couple, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                                        } else {
                                            auxiliary_list = cons(new_couple, auxiliary_list);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = auxiliary_list;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            {
                                SubLObject key = item.first();
                                SubLObject value = second(item);
                                SubLObject new_term_list = set_difference(term_list, key, symbol_function(EQUAL), UNPROVIDED);
                                SubLObject new_available = set_difference(available, value, symbol_function(EQUAL), UNPROVIDED);
                                SubLObject new_used = append(value, used);
                                SubLObject new_state = new_agglomeration_state(new_term_list, new_available, new_used);
                                new_agglomeration_states = cons(new_state, new_agglomeration_states);
                            }
                        }
                    }
                    return new_agglomeration_states;
                }
            }
        }
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
        declareFunction("turn_kr_sugar_on", "TURN-KR-SUGAR-ON", 0, 0, false);
        declareFunction("turn_kr_sugar_off", "TURN-KR-SUGAR-OFF", 0, 0, false);
        declareFunction("initialize_kr_sugar_set", "INITIALIZE-KR-SUGAR-SET", 0, 0, false);
        declareFunction("rkf_term_agglomerator", "RKF-TERM-AGGLOMERATOR", 1, 1, false);
        declareFunction("suggest_agglomerate_simple", "SUGGEST-AGGLOMERATE-SIMPLE", 1, 2, false);
        declareFunction("suggest_list_agglomerations", "SUGGEST-LIST-AGGLOMERATIONS", 1, 1, false);
        declareFunction("agglomerate_list_simple", "AGGLOMERATE-LIST-SIMPLE", 1, 2, false);
        declareFunction("functor_list_agglomerate", "FUNCTOR-LIST-AGGLOMERATE", 3, 2, false);
        declareFunction("variable_arity_functor_list_agglomerate", "VARIABLE-ARITY-FUNCTOR-LIST-AGGLOMERATE", 3, 2, false);
        declareFunction("agglomerations_good_for_functor_n_tuple", "AGGLOMERATIONS-GOOD-FOR-FUNCTOR-N-TUPLE", 2, 1, false);
        declareFunction("pivot_k_permutations_of_list", "PIVOT-K-PERMUTATIONS-OF-LIST", 3, 0, false);
        declareFunction("replace_one_term_with_descriptive_variable", "REPLACE-ONE-TERM-WITH-DESCRIPTIVE-VARIABLE", 1, 0, false);
        declareFunction("funct_num_to_nice_var_name", "FUNCT-NUM-TO-NICE-VAR-NAME", 2, 0, false);
        declareFunction("sort_terms_from_functors", "SORT-TERMS-FROM-FUNCTORS", 1, 0, false);
        declareFunction("k_permutations_of_list", "K-PERMUTATIONS-OF-LIST", 2, 0, false);
        declareFunction("find_k_permutations", "FIND-K-PERMUTATIONS", 3, 0, false);
        declareFunction("fact", "FACT", 1, 0, false);
        declareFunction("k_perm_num", "K-PERM-NUM", 2, 0, false);
        declareFunction("find_acceptable_k_permutation_size", "FIND-ACCEPTABLE-K-PERMUTATION-SIZE", 2, 0, false);
        declareFunction("make_list_k_permutation_acceptable", "MAKE-LIST-K-PERMUTATION-ACCEPTABLE", 2, 0, false);
        declareFunction("agglomeration_state_print_function_trampoline", "AGGLOMERATION-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("agglomeration_state_p", "AGGLOMERATION-STATE-P", 1, 0, false);
        new rkf_term_agglomerator.$agglomeration_state_p$UnaryFunction();
        declareFunction("agglomeration_state_uncovered_terms", "AGGLOMERATION-STATE-UNCOVERED-TERMS", 1, 0, false);
        declareFunction("agglomeration_state_agglomerations_available", "AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE", 1, 0, false);
        declareFunction("agglomeration_state_agglomerations_used", "AGGLOMERATION-STATE-AGGLOMERATIONS-USED", 1, 0, false);
        declareFunction("_csetf_agglomeration_state_uncovered_terms", "_CSETF-AGGLOMERATION-STATE-UNCOVERED-TERMS", 2, 0, false);
        declareFunction("_csetf_agglomeration_state_agglomerations_available", "_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE", 2, 0, false);
        declareFunction("_csetf_agglomeration_state_agglomerations_used", "_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-USED", 2, 0, false);
        declareFunction("make_agglomeration_state", "MAKE-AGGLOMERATION-STATE", 0, 1, false);
        declareFunction("visit_defstruct_agglomeration_state", "VISIT-DEFSTRUCT-AGGLOMERATION-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_agglomeration_state_method", "VISIT-DEFSTRUCT-OBJECT-AGGLOMERATION-STATE-METHOD", 2, 0, false);
        declareFunction("new_agglomeration_state", "NEW-AGGLOMERATION-STATE", 3, 0, false);
        declareFunction("compute_new_agglomeration_states", "COMPUTE-NEW-AGGLOMERATION-STATES", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_rkf_term_agglomerator_file_alt() {
        defparameter("*KR-SUGAR-ON*", NIL);
        deflexical("*KR-SUGAR*", NIL != boundp($kr_sugar$) ? ((SubLObject) ($kr_sugar$.getGlobalValue())) : NIL);
        defparameter("*K-PERMUTATIONS-MAX*", $int$100000);
        defconstant("*DTP-AGGLOMERATION-STATE*", AGGLOMERATION_STATE);
        return NIL;
    }

    public static SubLObject init_rkf_term_agglomerator_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*KR-SUGAR-ON*", NIL);
            deflexical("*KR-SUGAR*", SubLTrampolineFile.maybeDefault($kr_sugar$, $kr_sugar$, NIL));
            defparameter("*K-PERMUTATIONS-MAX*", $int$100000);
            defconstant("*DTP-AGGLOMERATION-STATE*", AGGLOMERATION_STATE);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*KR-SUGAR*", NIL != boundp($kr_sugar$) ? ((SubLObject) ($kr_sugar$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_rkf_term_agglomerator_file_Previous() {
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

    public static final class $agglomeration_state_p$UnaryFunction extends UnaryFunction {
        public $agglomeration_state_p$UnaryFunction() {
            super(extractFunctionNamed("AGGLOMERATION-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return agglomeration_state_p(arg1);
        }
    }

    static private final SubLString $str_alt2$___S_KR_sugar_spoons_added_to_the = makeString("~%~S KR sugar spoons added to the mix.");

    static private final SubLList $list_alt7 = list(makeSymbol("TERMS"), makeSymbol("FUNCTIONS"), makeSymbol("PREDICATES"));

    static private final SubLString $str_alt10$_ = makeString("?");

    static private final SubLString $str_alt11$_ = makeString("-");

    static private final SubLList $list_alt15 = list(makeSymbol("UNCOVERED-TERMS"), makeSymbol("AGGLOMERATIONS-AVAILABLE"), makeSymbol("AGGLOMERATIONS-USED"));

    static private final SubLList $list_alt16 = list(makeKeyword("UNCOVERED-TERMS"), makeKeyword("AGGLOMERATIONS-AVAILABLE"), makeKeyword("AGGLOMERATIONS-USED"));

    static private final SubLList $list_alt17 = list(makeSymbol("AGGLOMERATION-STATE-UNCOVERED-TERMS"), makeSymbol("AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE"), makeSymbol("AGGLOMERATION-STATE-AGGLOMERATIONS-USED"));

    static private final SubLList $list_alt18 = list(makeSymbol("_CSETF-AGGLOMERATION-STATE-UNCOVERED-TERMS"), makeSymbol("_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-AVAILABLE"), makeSymbol("_CSETF-AGGLOMERATION-STATE-AGGLOMERATIONS-USED"));

    static private final SubLString $str_alt30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLSymbol $sym31$SETS_EQUAL_EQUAL_ = makeSymbol("SETS-EQUAL-EQUAL?");
}

/**
 * Total time: 183 ms
 */
