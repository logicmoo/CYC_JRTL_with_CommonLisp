package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class object_similarity extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.object_similarity";
    public static final String myFingerPrint = "51932f7a98ae34559a6031e472155504ae2cfbbf601a59d0ecf9621e7a485785";
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 2157L)
    private static SubLSymbol $object_similarity_unknown_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 11691L)
    private static SubLSymbol $object_similarity_no_common_assertions_base$;
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 12602L)
    private static SubLSymbol $object_similarity_common_assertions_common_base$;
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 12680L)
    private static SubLSymbol $object_similarity_common_assertions_uncommon_base$;
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 13566L)
    private static SubLSymbol $object_similarity_core_mt_weight$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PWHEN;
    private static final SubLSymbol $sym2$OBJECT_SIMILARITY_JUSTIFY_;
    private static final SubLSymbol $sym3$CSETQ;
    private static final SubLSymbol $kw4$EQUAL;
    private static final SubLSymbol $kw5$PROBABLY_EQUAL;
    private static final SubLFloat $float6$0_2;
    private static final SubLString $str7$Similarity__s_out_of_bounds_;
    private static final SubLSymbol $kw8$DIFFERENT;
    private static final SubLSymbol $kw9$PROBABLY_DIFFERENT;
    private static final SubLSymbol $kw10$UNKNOWN;
    private static final SubLSymbol $sym11$FORT_P;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$JUSTIFICATION_PAIRS_EQUAL_;
    private static final SubLSymbol $kw14$TRUE;
    private static final SubLSymbol $kw15$FALSE;
    private static final SubLString $str16$Unknown_truth_value__s;
    private static final SubLSymbol $sym17$OBJECT_SIMILARITY_ASSERTION_SUBSUMES_;
    private static final SubLSymbol $sym18$OPAQUE_ARG_WRT_QUOTING_;
    private static final SubLFloat $float19$1_2;
    private static final SubLSymbol $sym20$NUMBERP;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$JUSTIFICATIONS_EQUAL_;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$DESTROY_PROBLEM_STORE_ON_COMPLETION_;
    private static final SubLSymbol $kw27$PROBLEM_STORE;
    private static final SubLSymbol $kw28$JUSTIFY_;
    private static final SubLSymbol $kw29$CONSIDER_META_ASSERTIONS_;
    private static final SubLSymbol $kw30$IRRELEVANT_PREDICATES;
    private static final SubLList $list31;
    private static final SubLList $list32;
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 1083L)
    public static SubLObject possibly_set_similarity_justification(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)object_similarity.NIL;
        SubLObject justification = (SubLObject)object_similarity.NIL;
        SubLObject v_properties = (SubLObject)object_similarity.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object_similarity.$list0);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object_similarity.$list0);
        justification = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object_similarity.$list0);
        v_properties = current.first();
        current = current.rest();
        if (object_similarity.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)object_similarity.$sym1$PWHEN, (SubLObject)ConsesLow.list((SubLObject)object_similarity.$sym2$OBJECT_SIMILARITY_JUSTIFY_, v_properties), (SubLObject)ConsesLow.list((SubLObject)object_similarity.$sym3$CSETQ, variable, justification));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)object_similarity.$list0);
        return (SubLObject)object_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 1759L)
    public static SubLObject objects_probably_equalP(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        if (mt == object_similarity.UNPROVIDED) {
            mt = (SubLObject)object_similarity.NIL;
        }
        if (v_properties == object_similarity.UNPROVIDED) {
            v_properties = (SubLObject)object_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject keyword = qualitative_object_similarity(obj1, obj2, mt, v_properties);
        final SubLObject doneP = thread.secondMultipleValue();
        final SubLObject justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject equalP = (SubLObject)SubLObjectFactory.makeBoolean(object_similarity.$kw4$EQUAL == keyword || object_similarity.$kw5$PROBABLY_EQUAL == keyword);
        return Values.values(equalP, doneP, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 2219L)
    public static SubLObject qualitative_object_similarity(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        if (mt == object_similarity.UNPROVIDED) {
            mt = (SubLObject)object_similarity.NIL;
        }
        if (v_properties == object_similarity.UNPROVIDED) {
            v_properties = (SubLObject)object_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject keyword = (SubLObject)object_similarity.NIL;
        thread.resetMultipleValues();
        final SubLObject v_similarity = object_similarity(obj1, obj2, mt, v_properties);
        final SubLObject doneP = thread.secondMultipleValue();
        final SubLObject justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (object_similarity.MINUS_ONE_INTEGER.numG(v_similarity) || object_similarity.ONE_INTEGER.numL(v_similarity)) {
            Errors.error((SubLObject)object_similarity.$str7$Similarity__s_out_of_bounds_, v_similarity);
        }
        else if (object_similarity.MINUS_ONE_INTEGER.numE(v_similarity)) {
            keyword = (SubLObject)object_similarity.$kw8$DIFFERENT;
        }
        else if (object_similarity.ONE_INTEGER.numE(v_similarity)) {
            keyword = (SubLObject)object_similarity.$kw4$EQUAL;
        }
        else if (Numbers.minus(object_similarity.$object_similarity_unknown_bound$.getDynamicValue(thread)).numG(v_similarity)) {
            keyword = (SubLObject)object_similarity.$kw9$PROBABLY_DIFFERENT;
        }
        else if (object_similarity.$object_similarity_unknown_bound$.getDynamicValue(thread).numL(v_similarity)) {
            keyword = (SubLObject)object_similarity.$kw5$PROBABLY_EQUAL;
        }
        else {
            keyword = (SubLObject)object_similarity.$kw10$UNKNOWN;
        }
        return Values.values(keyword, doneP, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 3056L)
    public static SubLObject object_similarity(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject v_properties) {
        if (mt == object_similarity.UNPROVIDED) {
            mt = (SubLObject)object_similarity.NIL;
        }
        if (v_properties == object_similarity.UNPROVIDED) {
            v_properties = (SubLObject)object_similarity.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert object_similarity.NIL != forts.fort_p(obj1) : obj1;
        assert object_similarity.NIL != forts.fort_p(obj2) : obj2;
        SubLObject v_similarity = (SubLObject)object_similarity.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)object_similarity.NIL;
        SubLObject equals_justification = (SubLObject)object_similarity.NIL;
        SubLObject different_justification = (SubLObject)object_similarity.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (object_similarity.NIL != equals.asserted_differentP(obj1, obj2)) {
                v_similarity = (SubLObject)object_similarity.MINUS_ONE_INTEGER;
                if (object_similarity.NIL != object_similarity_justifyP(v_properties)) {
                    different_justification = equals.why_asserted_different(obj1, obj2);
                }
                doneP = (SubLObject)object_similarity.T;
            }
            else if (object_similarity.NIL != equals.equalsP(obj1, obj2, (SubLObject)object_similarity.UNPROVIDED, (SubLObject)object_similarity.UNPROVIDED)) {
                v_similarity = (SubLObject)object_similarity.ONE_INTEGER;
                if (object_similarity.NIL != object_similarity_justifyP(v_properties)) {
                    equals_justification = equals.why_equals(obj1, obj2, (SubLObject)object_similarity.UNPROVIDED, (SubLObject)object_similarity.UNPROVIDED);
                }
                doneP = (SubLObject)object_similarity.T;
            }
            else if (object_similarity.NIL != disjoint_with.instances_of_disjoint_collectionsP(obj1, obj2, (SubLObject)object_similarity.UNPROVIDED, (SubLObject)object_similarity.UNPROVIDED)) {
                v_similarity = (SubLObject)object_similarity.MINUS_ONE_INTEGER;
                if (object_similarity.NIL != object_similarity_justifyP(v_properties)) {
                    different_justification = disjoint_with.why_instances_of_disjoint_collections(obj1, obj2, (SubLObject)object_similarity.UNPROVIDED, (SubLObject)object_similarity.UNPROVIDED);
                }
                doneP = (SubLObject)object_similarity.T;
            }
            else {
                thread.resetMultipleValues();
                final SubLObject v_similarity_$1 = object_similarity_int(obj1, obj2, mt, v_properties);
                final SubLObject doneP_$2 = thread.secondMultipleValue();
                final SubLObject equals_justification_$3 = thread.thirdMultipleValue();
                final SubLObject different_justification_$4 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                v_similarity = v_similarity_$1;
                doneP = doneP_$2;
                equals_justification = equals_justification_$3;
                different_justification = different_justification_$4;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(v_similarity, doneP, (SubLObject)ConsesLow.list(equals_justification, different_justification));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 5498L)
    public static SubLObject object_similarity_int(final SubLObject obj1, final SubLObject obj2, final SubLObject mt, SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_similarity = (SubLObject)object_similarity.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)object_similarity.NIL;
        SubLObject equals_justification = (SubLObject)object_similarity.NIL;
        SubLObject different_justification = (SubLObject)object_similarity.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                v_properties = object_similarity_process_properties(v_properties);
                thread.resetMultipleValues();
                final SubLObject common_assertions = object_similarity_categorize_assertions(obj1, obj2, mt, v_properties);
                final SubLObject conflicting_assertions = thread.secondMultipleValue();
                final SubLObject obj1_assertions = thread.thirdMultipleValue();
                final SubLObject obj2_assertions = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (object_similarity.NIL != conflicting_assertions) {
                    v_similarity = (SubLObject)object_similarity.MINUS_ONE_INTEGER;
                    SubLObject current;
                    final SubLObject datum = current = conflicting_assertions;
                    SubLObject assertion = (SubLObject)object_similarity.NIL;
                    SubLObject justification = (SubLObject)object_similarity.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object_similarity.$list12);
                    assertion = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object_similarity.$list12);
                    justification = current.first();
                    current = current.rest();
                    if (object_similarity.NIL == current) {
                        if (object_similarity.NIL != object_similarity_justifyP(v_properties)) {
                            different_justification = (SubLObject)ConsesLow.cons(assertion, justification);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)object_similarity.$list12);
                    }
                    doneP = (SubLObject)object_similarity.T;
                }
                else if (object_similarity.NIL == common_assertions) {
                    v_similarity = object_similarity_no_common_assertions(obj1, obj2, obj1_assertions, obj2_assertions);
                    doneP = (SubLObject)object_similarity.T;
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject v_similarity_$5 = object_similarity_common_assertions(obj1, obj2, common_assertions, obj1_assertions, obj2_assertions, v_properties);
                    final SubLObject equals_justification_$6 = thread.secondMultipleValue();
                    final SubLObject different_justification_$7 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    v_similarity = v_similarity_$5;
                    equals_justification = equals_justification_$6;
                    different_justification = different_justification_$7;
                    doneP = (SubLObject)object_similarity.T;
                }
                if (object_similarity.NIL != object_similarity_destroy_problem_store_on_completionP(v_properties)) {
                    inference_datastructures_problem_store.destroy_problem_store(object_similarity_problem_store(v_properties));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object_similarity.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(v_similarity, doneP, equals_justification, different_justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 6814L)
    public static SubLObject object_similarity_categorize_assertions(final SubLObject obj1, final SubLObject obj2, final SubLObject mt, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject obj1_common_assertions = object_similarity_categorize_assertions_int(obj1, obj2, mt, v_properties);
        final SubLObject obj1_conflicting_assertions = thread.secondMultipleValue();
        final SubLObject obj1_assertions = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (object_similarity.NIL != obj1_conflicting_assertions) {
            return Values.values((SubLObject)object_similarity.NIL, obj1_conflicting_assertions, (SubLObject)object_similarity.NIL, (SubLObject)object_similarity.NIL);
        }
        thread.resetMultipleValues();
        final SubLObject obj2_common_assertions = object_similarity_categorize_assertions_int(obj2, obj1, mt, v_properties);
        final SubLObject obj2_conflicting_assertions = thread.secondMultipleValue();
        final SubLObject obj2_assertions = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (object_similarity.NIL != obj2_conflicting_assertions) {
            return Values.values((SubLObject)object_similarity.NIL, obj2_conflicting_assertions, (SubLObject)object_similarity.NIL, (SubLObject)object_similarity.NIL);
        }
        final SubLObject common_assertions = Sequences.delete_duplicates(ConsesLow.append(obj1_common_assertions, obj2_common_assertions), (SubLObject)object_similarity.$sym13$JUSTIFICATION_PAIRS_EQUAL_, (SubLObject)object_similarity.UNPROVIDED, (SubLObject)object_similarity.UNPROVIDED, (SubLObject)object_similarity.UNPROVIDED);
        return Values.values(common_assertions, (SubLObject)object_similarity.NIL, obj1_assertions, obj2_assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 8111L)
    public static SubLObject object_similarity_categorize_assertions_int(final SubLObject focal_obj, final SubLObject other_obj, final SubLObject mt, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_focal_obj = cycl_utilities.hl_to_el(focal_obj);
        final SubLObject el_other_obj = cycl_utilities.hl_to_el(other_obj);
        SubLObject common_assertions = (SubLObject)object_similarity.NIL;
        SubLObject conflicting_assertions = (SubLObject)object_similarity.NIL;
        SubLObject focal_assertions = (SubLObject)object_similarity.NIL;
        if (object_similarity.NIL == conflicting_assertions) {
            SubLObject csome_list_var = gather_relevant_term_assertions(focal_obj, v_properties);
            SubLObject focal_assertion = (SubLObject)object_similarity.NIL;
            focal_assertion = csome_list_var.first();
            while (object_similarity.NIL == conflicting_assertions && object_similarity.NIL != csome_list_var) {
                thread.resetMultipleValues();
                final SubLObject truth = object_similarity_categorize_assertion(focal_assertion, el_focal_obj, el_other_obj, mt, v_properties);
                final SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject pcase_var = truth;
                if (pcase_var.eql((SubLObject)object_similarity.$kw14$TRUE)) {
                    common_assertions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(focal_assertion), justification), common_assertions);
                }
                else if (pcase_var.eql((SubLObject)object_similarity.$kw15$FALSE)) {
                    conflicting_assertions = (SubLObject)ConsesLow.list(focal_assertion, justification);
                }
                else if (pcase_var.eql((SubLObject)object_similarity.$kw10$UNKNOWN)) {
                    focal_assertions = (SubLObject)ConsesLow.cons(focal_assertion, focal_assertions);
                }
                else {
                    Errors.error((SubLObject)object_similarity.$str16$Unknown_truth_value__s, truth);
                }
                csome_list_var = csome_list_var.rest();
                focal_assertion = csome_list_var.first();
            }
        }
        return Values.values(common_assertions, conflicting_assertions, focal_assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 9022L)
    public static SubLObject object_similarity_categorize_assertion(final SubLObject assertion, final SubLObject focal_obj, final SubLObject other_obj, final SubLObject mt, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_sentence = cycl_utilities.hl_to_el(assertions_high.assertion_formula(assertion));
        final SubLObject query_sentence = cycl_utilities.expression_subst(other_obj, focal_obj, el_sentence, Symbols.symbol_function((SubLObject)object_similarity.EQUAL), (SubLObject)object_similarity.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject negP = object_similarity_query(cycl_utilities.negate(query_sentence), mt, v_properties);
        final SubLObject neg_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject posP = object_similarity_query(query_sentence, mt, v_properties);
        final SubLObject pos_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (object_similarity.NIL != negP && object_similarity.NIL != posP) {
            return Values.values((SubLObject)object_similarity.$kw10$UNKNOWN, conses_high.union(neg_justification, pos_justification, Symbols.symbol_function((SubLObject)object_similarity.EQUAL), (SubLObject)object_similarity.UNPROVIDED));
        }
        if (object_similarity.NIL != negP) {
            return Values.values((SubLObject)object_similarity.$kw15$FALSE, neg_justification);
        }
        if (object_similarity.NIL != posP) {
            return Values.values((SubLObject)object_similarity.$kw14$TRUE, pos_justification);
        }
        return Values.values((SubLObject)object_similarity.$kw10$UNKNOWN, (SubLObject)object_similarity.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 9956L)
    public static SubLObject gather_relevant_term_assertions(final SubLObject v_term, final SubLObject v_properties) {
        SubLObject assertions = (SubLObject)object_similarity.NIL;
        if (object_similarity.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)object_similarity.NIL)) {
            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)object_similarity.NIL);
            SubLObject done_var = (SubLObject)object_similarity.NIL;
            final SubLObject token_var = (SubLObject)object_similarity.NIL;
            while (object_similarity.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (object_similarity.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)object_similarity.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)object_similarity.NIL, (SubLObject)object_similarity.NIL, (SubLObject)object_similarity.NIL);
                        SubLObject done_var_$9 = (SubLObject)object_similarity.NIL;
                        final SubLObject token_var_$10 = (SubLObject)object_similarity.NIL;
                        while (object_similarity.NIL == done_var_$9) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                            final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(assertion));
                            if (object_similarity.NIL != valid_$11 && object_similarity.NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec) && object_similarity.NIL == object_similarity_irrelevant_assertionP(assertion, v_term, v_properties)) {
                                assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                            }
                            done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(object_similarity.NIL == valid_$11);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)object_similarity.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (object_similarity.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(object_similarity.NIL == valid);
            }
        }
        assertions = list_utilities.delete_subsumed_items(assertions, (SubLObject)object_similarity.$sym17$OBJECT_SIMILARITY_ASSERTION_SUBSUMES_, (SubLObject)object_similarity.UNPROVIDED);
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 10315L)
    public static SubLObject object_similarity_irrelevant_assertionP(final SubLObject assertion, final SubLObject v_term, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (object_similarity.NIL == assertions_high.gaf_assertionP(assertion)) {
            return (SubLObject)object_similarity.T;
        }
        if (object_similarity.NIL != function_terms.tou_assertionP(assertion)) {
            return (SubLObject)object_similarity.T;
        }
        if (object_similarity.NIL == object_similarity_consider_meta_assertionsP(v_properties) && object_similarity.NIL != assertions_high.meta_assertionP(assertion)) {
            return (SubLObject)object_similarity.T;
        }
        if (object_similarity.NIL != list_utilities.member_eqP(assertions_high.gaf_predicate(assertion), object_similarity_irrelevant_predicates(v_properties))) {
            return (SubLObject)object_similarity.T;
        }
        SubLObject irrelevantP = (SubLObject)object_similarity.NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind((SubLObject)object_similarity.$sym18$OPAQUE_ARG_WRT_QUOTING_, thread);
            irrelevantP = (SubLObject)SubLObjectFactory.makeBoolean(object_similarity.NIL == cycl_utilities.expression_find(v_term, assertion, (SubLObject)object_similarity.T, (SubLObject)object_similarity.UNPROVIDED, (SubLObject)object_similarity.UNPROVIDED));
        }
        finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return irrelevantP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 10944L)
    public static SubLObject object_similarity_assertion_subsumesP(final SubLObject assertion1, final SubLObject assertion2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertion1.eql(assertion2) || (assertions_high.assertion_formula(assertion1).equal(assertions_high.assertion_formula(assertion2)) && object_similarity.NIL != genl_mts.genl_mtP(assertions_high.assertion_mt(assertion1), assertions_high.assertion_mt(assertion2), (SubLObject)object_similarity.UNPROVIDED, (SubLObject)object_similarity.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 11214L)
    public static SubLObject object_similarity_query(final SubLObject sentence, final SubLObject mt, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_properties = object_similarity_query_properties(sentence, v_properties);
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metrics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (object_similarity.NIL != results) {
            final SubLObject result = results.first();
            final SubLObject justification = conses_high.second(result);
            return Values.values((SubLObject)object_similarity.T, justification);
        }
        return Values.values((SubLObject)object_similarity.NIL, (SubLObject)object_similarity.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 11792L)
    public static SubLObject object_similarity_no_common_assertions(final SubLObject obj1, final SubLObject obj2, final SubLObject obj1_assertions, final SubLObject obj2_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return object_similarity_from_uncommon_assertions(obj1_assertions, obj2_assertions, object_similarity.$object_similarity_no_common_assertions_base$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 12105L)
    public static SubLObject object_similarity_from_uncommon_assertions(final SubLObject obj1_assertions, final SubLObject obj2_assertions, final SubLObject base) {
        assert object_similarity.NIL != Types.numberp(base) : base;
        final SubLObject count1 = Sequences.length(obj1_assertions);
        final SubLObject count2 = Sequences.length(obj2_assertions);
        return Numbers.add((SubLObject)object_similarity.MINUS_ONE_INTEGER, Numbers.expt(base, Numbers.minus(Numbers.min(count1, count2))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 12759L)
    public static SubLObject object_similarity_common_assertions(final SubLObject obj1, final SubLObject obj2, final SubLObject common_assertions, final SubLObject obj1_assertions, final SubLObject obj2_assertions, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_similarity = (SubLObject)object_similarity.ZERO_INTEGER;
        SubLObject equals_justification = (SubLObject)object_similarity.NIL;
        SubLObject different_justification = (SubLObject)object_similarity.NIL;
        v_similarity = Numbers.add(v_similarity, object_similarity_from_common_assertions(common_assertions, object_similarity.$object_similarity_common_assertions_common_base$.getDynamicValue(thread)));
        if (object_similarity.NIL != object_similarity_justifyP(v_properties)) {
            equals_justification = common_assertions;
        }
        v_similarity = Numbers.add(v_similarity, object_similarity_from_uncommon_assertions(obj1_assertions, obj2_assertions, object_similarity.$object_similarity_common_assertions_uncommon_base$.getDynamicValue(thread)));
        if (object_similarity.NIL != object_similarity_justifyP(v_properties)) {
            different_justification = ConsesLow.append(obj1_assertions, obj2_assertions);
        }
        return Values.values(v_similarity, equals_justification, different_justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 13629L)
    public static SubLObject object_similarity_from_common_assertions(final SubLObject common_assertions, final SubLObject base) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_weight = (SubLObject)object_similarity.ZERO_INTEGER;
        SubLObject cdolist_list_var = common_assertions;
        SubLObject common_assertion = (SubLObject)object_similarity.NIL;
        common_assertion = cdolist_list_var.first();
        while (object_similarity.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = common_assertion;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object_similarity.$list21);
            final SubLObject temp = current.rest();
            current = current.first();
            SubLObject assertion = (SubLObject)object_similarity.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object_similarity.$list21);
            assertion = current.first();
            current = current.rest();
            if (object_similarity.NIL == current) {
                current = temp;
                SubLObject justification = (SubLObject)object_similarity.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)object_similarity.$list21);
                justification = current.first();
                current = current.rest();
                if (object_similarity.NIL == current) {
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject weight = (SubLObject)((object_similarity.NIL != mt_vars.core_microtheory_p(mt)) ? object_similarity.$object_similarity_core_mt_weight$.getDynamicValue(thread) : object_similarity.ONE_INTEGER);
                    total_weight = Numbers.add(total_weight, weight);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)object_similarity.$list21);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)object_similarity.$list21);
            }
            cdolist_list_var = cdolist_list_var.rest();
            common_assertion = cdolist_list_var.first();
        }
        return Numbers.subtract((SubLObject)object_similarity.ONE_INTEGER, Numbers.expt(base, Numbers.minus(total_weight)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 14395L)
    public static SubLObject justification_pairs_equalP(final SubLObject just_pair1, final SubLObject just_pair2) {
        SubLObject just11 = (SubLObject)object_similarity.NIL;
        SubLObject just12 = (SubLObject)object_similarity.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(just_pair1, just_pair1, (SubLObject)object_similarity.$list22);
        just11 = just_pair1.first();
        SubLObject current = just_pair1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, just_pair1, (SubLObject)object_similarity.$list22);
        just12 = current.first();
        current = current.rest();
        if (object_similarity.NIL == current) {
            SubLObject just13 = (SubLObject)object_similarity.NIL;
            SubLObject just14 = (SubLObject)object_similarity.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(just_pair2, just_pair2, (SubLObject)object_similarity.$list23);
            just13 = just_pair2.first();
            SubLObject current_$13 = just_pair2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$13, just_pair2, (SubLObject)object_similarity.$list23);
            just14 = current_$13.first();
            current_$13 = current_$13.rest();
            if (object_similarity.NIL == current_$13) {
                if ((object_similarity.NIL != list_utilities.sets_equalP(just11, just13, Symbols.symbol_function((SubLObject)object_similarity.EQUAL)) && object_similarity.NIL != list_utilities.sets_equalP(just12, just14, Symbols.symbol_function((SubLObject)object_similarity.EQUAL))) || (object_similarity.NIL != list_utilities.sets_equalP(just11, just14, Symbols.symbol_function((SubLObject)object_similarity.EQUAL)) && object_similarity.NIL != list_utilities.sets_equalP(just12, just13, Symbols.symbol_function((SubLObject)object_similarity.EQUAL)))) {
                    return (SubLObject)object_similarity.T;
                }
                final SubLObject expand11 = hl_supports.hl_justification_expand(just11);
                final SubLObject expand12 = hl_supports.hl_justification_expand(just12);
                final SubLObject expand13 = hl_supports.hl_justification_expand(just13);
                final SubLObject expand14 = hl_supports.hl_justification_expand(just14);
                return (SubLObject)SubLObjectFactory.makeBoolean((object_similarity.NIL != list_utilities.sets_equalP(expand11, expand13, (SubLObject)object_similarity.UNPROVIDED) && object_similarity.NIL != list_utilities.sets_equalP(expand12, expand14, (SubLObject)object_similarity.UNPROVIDED)) || (object_similarity.NIL != list_utilities.sets_equalP(expand11, expand14, (SubLObject)object_similarity.UNPROVIDED) && object_similarity.NIL != list_utilities.sets_equalP(expand12, expand13, (SubLObject)object_similarity.UNPROVIDED)));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(just_pair2, (SubLObject)object_similarity.$list23);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(just_pair1, (SubLObject)object_similarity.$list22);
        }
        return (SubLObject)object_similarity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 15139L)
    public static SubLObject justifications_equalP_internal(final SubLObject just1, final SubLObject just2) {
        if (object_similarity.NIL != list_utilities.sets_equalP(just1, just2, Symbols.symbol_function((SubLObject)object_similarity.EQUAL))) {
            return (SubLObject)object_similarity.T;
        }
        final SubLObject expanded_just1 = hl_supports.hl_justification_expand(just1);
        final SubLObject expanded_just2 = hl_supports.hl_justification_expand(just2);
        return list_utilities.sets_equalP(expanded_just1, expanded_just2, Symbols.symbol_function((SubLObject)object_similarity.EQUAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 15139L)
    public static SubLObject justifications_equalP(final SubLObject just1, final SubLObject just2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)object_similarity.NIL;
        if (object_similarity.NIL == v_memoization_state) {
            return justifications_equalP_internal(just1, just2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)object_similarity.$sym24$JUSTIFICATIONS_EQUAL_, (SubLObject)object_similarity.UNPROVIDED);
        if (object_similarity.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)object_similarity.$sym24$JUSTIFICATIONS_EQUAL_, (SubLObject)object_similarity.TWO_INTEGER, (SubLObject)object_similarity.NIL, (SubLObject)object_similarity.EQUAL, (SubLObject)object_similarity.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)object_similarity.$sym24$JUSTIFICATIONS_EQUAL_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(just1, just2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)object_similarity.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)object_similarity.NIL;
            collision = cdolist_list_var.first();
            while (object_similarity.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (just1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (object_similarity.NIL != cached_args && object_similarity.NIL == cached_args.rest() && just2.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(justifications_equalP_internal(just1, just2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(just1, just2));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 15467L)
    public static SubLObject object_similarity_process_properties(SubLObject v_properties) {
        SubLObject problem_store = object_similarity_problem_store(v_properties);
        if (object_similarity.NIL == inference_datastructures_problem_store.problem_store_p(problem_store)) {
            final SubLObject inference = inference_macros.current_controlling_inference();
            if (object_similarity.NIL != inference_datastructures_inference.inference_p(inference)) {
                problem_store = inference_datastructures_inference.inference_problem_store(inference);
            }
            else {
                problem_store = inference_datastructures_problem_store.new_problem_store((SubLObject)object_similarity.$list25);
                v_properties = conses_high.putf(v_properties, (SubLObject)object_similarity.$kw26$DESTROY_PROBLEM_STORE_ON_COMPLETION_, (SubLObject)object_similarity.T);
            }
            v_properties = conses_high.putf(v_properties, (SubLObject)object_similarity.$kw27$PROBLEM_STORE, problem_store);
        }
        return v_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 16096L)
    public static SubLObject object_similarity_justifyP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)object_similarity.$kw28$JUSTIFY_, (SubLObject)object_similarity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 16190L)
    public static SubLObject object_similarity_problem_store(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)object_similarity.$kw27$PROBLEM_STORE, (SubLObject)object_similarity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 16294L)
    public static SubLObject object_similarity_destroy_problem_store_on_completionP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)object_similarity.$kw26$DESTROY_PROBLEM_STORE_ON_COMPLETION_, (SubLObject)object_similarity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 16444L)
    public static SubLObject object_similarity_consider_meta_assertionsP(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)object_similarity.$kw29$CONSIDER_META_ASSERTIONS_, (SubLObject)object_similarity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 16572L)
    public static SubLObject object_similarity_irrelevant_predicates(final SubLObject v_properties) {
        return conses_high.getf(v_properties, (SubLObject)object_similarity.$kw30$IRRELEVANT_PREDICATES, (SubLObject)object_similarity.$list31);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-similarity.lisp", position = 16707L)
    public static SubLObject object_similarity_query_properties(final SubLObject query_sentence, final SubLObject v_properties) {
        final SubLObject problem_store = object_similarity_problem_store(v_properties);
        final SubLObject query_properties = (SubLObject)ConsesLow.listS((SubLObject)object_similarity.$kw27$PROBLEM_STORE, problem_store, (SubLObject)object_similarity.$list32);
        return query_properties;
    }
    
    public static SubLObject declare_object_similarity_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.object_similarity", "possibly_set_similarity_justification", "POSSIBLY-SET-SIMILARITY-JUSTIFICATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "objects_probably_equalP", "OBJECTS-PROBABLY-EQUAL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "qualitative_object_similarity", "QUALITATIVE-OBJECT-SIMILARITY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity", "OBJECT-SIMILARITY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_int", "OBJECT-SIMILARITY-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_categorize_assertions", "OBJECT-SIMILARITY-CATEGORIZE-ASSERTIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_categorize_assertions_int", "OBJECT-SIMILARITY-CATEGORIZE-ASSERTIONS-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_categorize_assertion", "OBJECT-SIMILARITY-CATEGORIZE-ASSERTION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "gather_relevant_term_assertions", "GATHER-RELEVANT-TERM-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_irrelevant_assertionP", "OBJECT-SIMILARITY-IRRELEVANT-ASSERTION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_assertion_subsumesP", "OBJECT-SIMILARITY-ASSERTION-SUBSUMES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_query", "OBJECT-SIMILARITY-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_no_common_assertions", "OBJECT-SIMILARITY-NO-COMMON-ASSERTIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_from_uncommon_assertions", "OBJECT-SIMILARITY-FROM-UNCOMMON-ASSERTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_common_assertions", "OBJECT-SIMILARITY-COMMON-ASSERTIONS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_from_common_assertions", "OBJECT-SIMILARITY-FROM-COMMON-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "justification_pairs_equalP", "JUSTIFICATION-PAIRS-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "justifications_equalP_internal", "JUSTIFICATIONS-EQUAL?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "justifications_equalP", "JUSTIFICATIONS-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_process_properties", "OBJECT-SIMILARITY-PROCESS-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_justifyP", "OBJECT-SIMILARITY-JUSTIFY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_problem_store", "OBJECT-SIMILARITY-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_destroy_problem_store_on_completionP", "OBJECT-SIMILARITY-DESTROY-PROBLEM-STORE-ON-COMPLETION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_consider_meta_assertionsP", "OBJECT-SIMILARITY-CONSIDER-META-ASSERTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_irrelevant_predicates", "OBJECT-SIMILARITY-IRRELEVANT-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_similarity", "object_similarity_query_properties", "OBJECT-SIMILARITY-QUERY-PROPERTIES", 2, 0, false);
        return (SubLObject)object_similarity.NIL;
    }
    
    public static SubLObject init_object_similarity_file() {
        object_similarity.$object_similarity_unknown_bound$ = SubLFiles.defparameter("*OBJECT-SIMILARITY-UNKNOWN-BOUND*", (SubLObject)object_similarity.$float6$0_2);
        object_similarity.$object_similarity_no_common_assertions_base$ = SubLFiles.defparameter("*OBJECT-SIMILARITY-NO-COMMON-ASSERTIONS-BASE*", (SubLObject)object_similarity.$float19$1_2);
        object_similarity.$object_similarity_common_assertions_common_base$ = SubLFiles.defparameter("*OBJECT-SIMILARITY-COMMON-ASSERTIONS-COMMON-BASE*", (SubLObject)object_similarity.$float19$1_2);
        object_similarity.$object_similarity_common_assertions_uncommon_base$ = SubLFiles.defparameter("*OBJECT-SIMILARITY-COMMON-ASSERTIONS-UNCOMMON-BASE*", (SubLObject)object_similarity.$float19$1_2);
        object_similarity.$object_similarity_core_mt_weight$ = SubLFiles.defparameter("*OBJECT-SIMILARITY-CORE-MT-WEIGHT*", (SubLObject)object_similarity.$float6$0_2);
        return (SubLObject)object_similarity.NIL;
    }
    
    public static SubLObject setup_object_similarity_file() {
        memoization_state.note_memoized_function((SubLObject)object_similarity.$sym24$JUSTIFICATIONS_EQUAL_);
        return (SubLObject)object_similarity.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_object_similarity_file();
    }
    
    @Override
	public void initializeVariables() {
        init_object_similarity_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_object_similarity_file();
    }
    
    static {
        me = (SubLFile)new object_similarity();
        object_similarity.$object_similarity_unknown_bound$ = null;
        object_similarity.$object_similarity_no_common_assertions_base$ = null;
        object_similarity.$object_similarity_common_assertions_common_base$ = null;
        object_similarity.$object_similarity_common_assertions_uncommon_base$ = null;
        object_similarity.$object_similarity_core_mt_weight$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"));
        $sym1$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym2$OBJECT_SIMILARITY_JUSTIFY_ = SubLObjectFactory.makeSymbol("OBJECT-SIMILARITY-JUSTIFY?");
        $sym3$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $kw4$EQUAL = SubLObjectFactory.makeKeyword("EQUAL");
        $kw5$PROBABLY_EQUAL = SubLObjectFactory.makeKeyword("PROBABLY-EQUAL");
        $float6$0_2 = (SubLFloat)SubLObjectFactory.makeDouble(0.2);
        $str7$Similarity__s_out_of_bounds_ = SubLObjectFactory.makeString("Similarity ~s out of bounds.");
        $kw8$DIFFERENT = SubLObjectFactory.makeKeyword("DIFFERENT");
        $kw9$PROBABLY_DIFFERENT = SubLObjectFactory.makeKeyword("PROBABLY-DIFFERENT");
        $kw10$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym11$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $sym13$JUSTIFICATION_PAIRS_EQUAL_ = SubLObjectFactory.makeSymbol("JUSTIFICATION-PAIRS-EQUAL?");
        $kw14$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw15$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $str16$Unknown_truth_value__s = SubLObjectFactory.makeString("Unknown truth value ~s");
        $sym17$OBJECT_SIMILARITY_ASSERTION_SUBSUMES_ = SubLObjectFactory.makeSymbol("OBJECT-SIMILARITY-ASSERTION-SUBSUMES?");
        $sym18$OPAQUE_ARG_WRT_QUOTING_ = SubLObjectFactory.makeSymbol("OPAQUE-ARG-WRT-QUOTING?");
        $float19$1_2 = (SubLFloat)SubLObjectFactory.makeDouble(1.2);
        $sym20$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JUST11"), (SubLObject)SubLObjectFactory.makeSymbol("JUST12"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JUST21"), (SubLObject)SubLObjectFactory.makeSymbol("JUST22"));
        $sym24$JUSTIFICATIONS_EQUAL_ = SubLObjectFactory.makeSymbol("JUSTIFICATIONS-EQUAL?");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)object_similarity.NIL);
        $kw26$DESTROY_PROBLEM_STORE_ON_COMPLETION_ = SubLObjectFactory.makeKeyword("DESTROY-PROBLEM-STORE-ON-COMPLETION?");
        $kw27$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw28$JUSTIFY_ = SubLObjectFactory.makeKeyword("JUSTIFY?");
        $kw29$CONSIDER_META_ASSERTIONS_ = SubLObjectFactory.makeKeyword("CONSIDER-META-ASSERTIONS?");
        $kw30$IRRELEVANT_PREDICATES = SubLObjectFactory.makeKeyword("IRRELEVANT-PREDICATES");
        $list31 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("CONTINUABLE?"), (SubLObject)object_similarity.NIL);
    }
}

/*

	Total time: 333 ms
	
*/