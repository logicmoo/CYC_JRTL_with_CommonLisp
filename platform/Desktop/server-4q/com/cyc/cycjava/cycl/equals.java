package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class equals extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.equals";
    public static final String myFingerPrint = "3a53b0d8f2e543b36e4e0b27c43615087ccf9c52a11807459c4484ab581fb799";
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 6384L)
    private static SubLSymbol $preferred_rewrite_term_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 6759L)
    public static SubLSymbol $preferred_rewrite_term_max_recursion_depth$;
    private static final SubLObject $const0$equals;
    private static final SubLSymbol $kw1$REFLEXIVE;
    private static final SubLObject $const2$InferencePSC;
    private static final SubLSymbol $sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_;
    private static final SubLSymbol $sym4$OPAQUE_ARG_WRT_QUOTING_;
    private static final SubLObject $const5$BaseKB;
    private static final SubLSymbol $sym6$HAS_PREFERRED_REWRITE_TERM_;
    private static final SubLSymbol $sym7$PREFERRED_REWRITE_TERM;
    private static final SubLSymbol $sym8$_PREFERRED_REWRITE_TERM_CACHING_STATE_;
    private static final SubLInteger $int9$128;
    private static final SubLSymbol $sym10$CLEAR_PREFERRED_REWRITE_TERM;
    private static final SubLSymbol $kw11$MAX_RECURSION_DEPTH_REACHED;
    private static final SubLObject $const12$rewriteOf;
    private static final SubLSymbol $kw13$PREFERRED_TERM_NOT_FOUND;
    private static final SubLSymbol $kw14$TOO_MANY_PREFERRED_TERMS_FOUND;
    private static final SubLSymbol $kw15$REWRITE_CYCLE_DETECTED;
    private static final SubLSymbol $sym16$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym17$FORT_P;
    private static final SubLObject $const18$different;
    private static final SubLSymbol $kw19$TRUE;
    private static final SubLSymbol $kw20$FALSE;
    private static final SubLSymbol $kw21$OPAQUE;
    private static final SubLSymbol $kw22$ISA;
    private static final SubLObject $const23$isa;
    private static final SubLSymbol $kw24$DISJOINTWITH;
    private static final SubLObject $const25$disjointWith;
    private static final SubLObject $const26$TermExemptFromUniqueNamesAssumpti;
    private static final SubLSymbol $kw27$IGNORE;
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 710L)
    public static SubLObject all_equals(final SubLObject obj, SubLObject mt, SubLObject tv) {
        if (mt == equals.UNPROVIDED) {
            mt = (SubLObject)equals.NIL;
        }
        if (tv == equals.UNPROVIDED) {
            tv = (SubLObject)equals.NIL;
        }
        return ghl_search_methods.ghl_closure(equals.$const0$equals, obj, ghl_search_vars.ghl_forward_direction(), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 879L)
    public static SubLObject equalsP(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject tv) {
        if (mt == equals.UNPROVIDED) {
            mt = (SubLObject)equals.NIL;
        }
        if (tv == equals.UNPROVIDED) {
            tv = (SubLObject)equals.NIL;
        }
        if (obj1.equal(obj2)) {
            return (SubLObject)equals.T;
        }
        if (equals.NIL != forts.fort_p(obj1)) {
            if (equals.NIL != forts.fort_p(obj2)) {
                return equal_fortsP(obj1, obj2, mt, tv);
            }
            return equal_fortP(obj1, obj2, mt, tv);
        }
        else {
            if (equals.NIL != forts.fort_p(obj2)) {
                return equal_fortP(obj2, obj1, mt, tv);
            }
            return equal_nautP(obj1, obj2, mt, tv);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 1210L)
    public static SubLObject why_equals(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject tv) {
        if (mt == equals.UNPROVIDED) {
            mt = (SubLObject)equals.NIL;
        }
        if (tv == equals.UNPROVIDED) {
            tv = (SubLObject)equals.NIL;
        }
        if (obj1.equal(obj2)) {
            return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)equals.$kw1$REFLEXIVE, el_utilities.make_binary_formula(equals.$const0$equals, obj1, obj2), mt_vars.$equals_defining_mt$.getGlobalValue(), (SubLObject)equals.UNPROVIDED));
        }
        if (equals.NIL != forts.fort_p(obj1)) {
            return ghl_search_methods.why_gt_predicate_relation_p(equals.$const0$equals, obj1, obj2, mt, tv);
        }
        if (equals.NIL != forts.fort_p(obj2)) {
            return ghl_search_methods.why_gt_predicate_relation_p(equals.$const0$equals, obj2, obj1, mt, tv);
        }
        return ghl_search_methods.why_gt_predicate_relation_p(equals.$const0$equals, obj1, obj2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 1637L)
    public static SubLObject not_equalsP(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject tv) {
        if (mt == equals.UNPROVIDED) {
            mt = (SubLObject)equals.NIL;
        }
        if (tv == equals.UNPROVIDED) {
            tv = (SubLObject)equals.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(equals.NIL == equalsP(obj1, obj2, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 1735L)
    public static SubLObject equal_fortP(final SubLObject fort, final SubLObject non_fort, SubLObject mt, SubLObject tv) {
        if (mt == equals.UNPROVIDED) {
            mt = (SubLObject)equals.NIL;
        }
        if (tv == equals.UNPROVIDED) {
            tv = (SubLObject)equals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)equals.NIL;
        if (equals.NIL != control_vars.$perform_equals_unification$.getDynamicValue(thread) && equals.NIL == cycl_grammar.meta_variable_p(non_fort) && equals.NIL != equality_store.some_equality_assertionsP(fort, (SubLObject)equals.UNPROVIDED)) {
            ans = ghl_search_methods.gt_predicate_relation_p(equals.$const0$equals, fort, non_fort, mt, tv, (SubLObject)equals.UNPROVIDED);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 2208L)
    public static SubLObject equal_fortsP(final SubLObject fort1, final SubLObject fort2, SubLObject mt, SubLObject tv) {
        if (mt == equals.UNPROVIDED) {
            mt = (SubLObject)equals.NIL;
        }
        if (tv == equals.UNPROVIDED) {
            tv = (SubLObject)equals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)equals.NIL;
        if (equals.NIL != control_vars.$perform_equals_unification$.getDynamicValue(thread) && equals.NIL != equality_store.some_equality_assertions_somewhereP(fort1) && equals.NIL != equality_store.some_equality_assertions_somewhereP(fort2) && equals.NIL != equality_store.some_equality_assertionsP(fort1, (SubLObject)equals.UNPROVIDED) && equals.NIL != equality_store.some_equality_assertionsP(fort2, (SubLObject)equals.UNPROVIDED)) {
            ans = ghl_search_methods.gt_predicate_relation_p(equals.$const0$equals, fort1, fort2, mt, tv, (SubLObject)equals.UNPROVIDED);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 2793L)
    public static SubLObject equal_nautP(final SubLObject naut1, final SubLObject naut2, SubLObject mt, SubLObject tv) {
        if (mt == equals.UNPROVIDED) {
            mt = (SubLObject)equals.NIL;
        }
        if (tv == equals.UNPROVIDED) {
            tv = (SubLObject)equals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)equals.NIL;
        if (equals.NIL != el_utilities.evaluatable_el_expressionP(naut1) && equals.NIL != el_utilities.evaluatable_el_expressionP(naut2)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject naut1_evaluated = relation_evaluation.cyc_evaluate(naut1);
                final SubLObject naut2_evaluated = relation_evaluation.cyc_evaluate(naut2);
                if (equals.NIL != naut1_evaluated && equals.NIL != naut2_evaluated) {
                    result = Equality.equal(naut1_evaluated, naut2_evaluated);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (equals.NIL == result && equals.NIL != list_utilities.non_dotted_list_p(naut1) && equals.NIL != list_utilities.non_dotted_list_p(naut2) && equals.NIL != list_utilities.same_length_p(naut1, naut2)) {
            SubLObject syntactically_differentP = (SubLObject)equals.NIL;
            if (equals.NIL == syntactically_differentP) {
                SubLObject naut1_arg = (SubLObject)equals.NIL;
                SubLObject naut1_arg_$1 = (SubLObject)equals.NIL;
                SubLObject naut2_arg = (SubLObject)equals.NIL;
                SubLObject naut2_arg_$2 = (SubLObject)equals.NIL;
                naut1_arg = naut1;
                naut1_arg_$1 = naut1_arg.first();
                naut2_arg = naut2;
                naut2_arg_$2 = naut2_arg.first();
                while (equals.NIL == syntactically_differentP && (equals.NIL != naut2_arg || equals.NIL != naut1_arg)) {
                    if (equals.NIL == equalsP(naut1_arg_$1, naut2_arg_$2, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED)) {
                        syntactically_differentP = (SubLObject)equals.T;
                    }
                    naut1_arg = naut1_arg.rest();
                    naut1_arg_$1 = naut1_arg.first();
                    naut2_arg = naut2_arg.rest();
                    naut2_arg_$2 = naut2_arg.first();
                }
            }
            result = (SubLObject)SubLObjectFactory.makeBoolean(equals.NIL == syntactically_differentP);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 3713L)
    public static SubLObject max_floor_mts_where_equals(SubLObject source, final SubLObject target) {
        if (equals.NIL != equal_everywhereP(source, target)) {
            return (SubLObject)ConsesLow.list(mt_vars.$equals_defining_mt$.getGlobalValue());
        }
        if (equals.NIL != forts.fort_p(source)) {
            return max_floor_mts_where_equals_fort(source, target);
        }
        if (equals.NIL != forts.fort_p(target)) {
            return max_floor_mts_where_equals_fort(target, source);
        }
        return max_floor_mts_where_equals_non_forts(source, target);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 4172L)
    public static SubLObject max_floor_mts_where_equals_fort(final SubLObject source_fort, final SubLObject target) {
        return ghl_search_methods.gt_max_floor_mts_of_predicate_paths(equals.$const0$equals, source_fort, target, (SubLObject)equals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 4317L)
    public static SubLObject max_floor_mts_where_equals_non_forts(SubLObject source, final SubLObject target) {
        return (SubLObject)((equals.NIL != equal_somewhereP(source, target)) ? equals.$const2$InferencePSC : equals.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 4794L)
    public static SubLObject equal_everywhereP(final SubLObject term1, final SubLObject term2) {
        return equalsP(term1, term2, mt_vars.$equals_defining_mt$.getGlobalValue(), (SubLObject)equals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 4894L)
    public static SubLObject equal_somewhereP(final SubLObject term1, final SubLObject term2) {
        return equalsP(term1, term2, equals.$const2$InferencePSC, (SubLObject)equals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 4987L)
    public static SubLObject possibly_subst_preferred_rewrite_terms(final SubLObject formula, SubLObject mt) {
        if (mt == equals.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (equals.NIL != preferred_rewrite_terms_subst_applicableP(formula, mt)) {
            return preferred_rewrite_terms_subst_apply(formula, mt);
        }
        return Values.values(formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 5345L)
    public static SubLObject preferred_rewrite_terms_subst_applicableP(final SubLObject sentence, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(equals.NIL != control_vars.within_queryP() && (equals.NIL != cycl_utilities.expression_find_if((SubLObject)equals.$sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, sentence, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED) || equals.NIL != cycl_utilities.expression_find_if((SubLObject)equals.$sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, mt, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 5631L)
    public static SubLObject preferred_rewrite_terms_subst_apply(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind((SubLObject)equals.$sym4$OPAQUE_ARG_WRT_QUOTING_, thread);
            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(equals.$const5$BaseKB);
            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                mt = cycl_utilities.expression_ntransform(mt, (SubLObject)equals.$sym6$HAS_PREFERRED_REWRITE_TERM_, (SubLObject)equals.$sym7$PREFERRED_REWRITE_TERM, (SubLObject)equals.T, (SubLObject)equals.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
            }
            mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                sentence = cycl_utilities.expression_ntransform(sentence, (SubLObject)equals.$sym6$HAS_PREFERRED_REWRITE_TERM_, (SubLObject)equals.$sym7$PREFERRED_REWRITE_TERM, (SubLObject)equals.T, (SubLObject)equals.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
            }
        }
        finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return Values.values(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 6072L)
    public static SubLObject has_preferred_rewrite_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == equals.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (equals.NIL != equality_store.some_source_rewrite_of_assertions_somewhereP(v_term)) {
            final SubLObject preferred_term = preferred_rewrite_term(v_term, mt);
            if (equals.NIL != preferred_term && !preferred_term.equal(v_term)) {
                return (SubLObject)equals.T;
            }
        }
        return (SubLObject)equals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 6384L)
    public static SubLObject clear_preferred_rewrite_term() {
        final SubLObject cs = equals.$preferred_rewrite_term_caching_state$.getGlobalValue();
        if (equals.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)equals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 6384L)
    public static SubLObject remove_preferred_rewrite_term(final SubLObject v_term, SubLObject mt) {
        if (mt == equals.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(equals.$preferred_rewrite_term_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, mt), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 6384L)
    public static SubLObject preferred_rewrite_term_internal(final SubLObject v_term, final SubLObject mt) {
        final SubLObject preferred_term = preferred_rewrite_term_int(v_term, mt, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
        final SubLObject result = (SubLObject)((equals.NIL != kb_utilities.kbeq(v_term, preferred_term)) ? equals.NIL : preferred_term);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 6384L)
    public static SubLObject preferred_rewrite_term(final SubLObject v_term, SubLObject mt) {
        if (mt == equals.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = equals.$preferred_rewrite_term_caching_state$.getGlobalValue();
        if (equals.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)equals.$sym7$PREFERRED_REWRITE_TERM, (SubLObject)equals.$sym8$_PREFERRED_REWRITE_TERM_CACHING_STATE_, (SubLObject)equals.$int9$128, (SubLObject)equals.EQUAL, (SubLObject)equals.TWO_INTEGER, (SubLObject)equals.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)equals.$sym10$CLEAR_PREFERRED_REWRITE_TERM);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)equals.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)equals.NIL;
            collision = cdolist_list_var.first();
            while (equals.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (equals.NIL != cached_args && equals.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(preferred_rewrite_term_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 6832L)
    public static SubLObject preferred_rewrite_term_int(final SubLObject v_term, final SubLObject mt, SubLObject depth, SubLObject candidate_terms) {
        if (depth == equals.UNPROVIDED) {
            depth = (SubLObject)equals.ZERO_INTEGER;
        }
        if (candidate_terms == equals.UNPROVIDED) {
            candidate_terms = (SubLObject)equals.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)equals.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (depth.numG(equals.$preferred_rewrite_term_max_recursion_depth$.getDynamicValue(thread))) {
                result = (SubLObject)equals.$kw11$MAX_RECURSION_DEPTH_REACHED;
            }
            else if (equals.NIL != equality_store.some_source_rewrite_of_assertions_somewhereP(v_term)) {
                final SubLObject preferred_terms = kb_mapping_utilities.pred_values(v_term, equals.$const12$rewriteOf, (SubLObject)equals.TWO_INTEGER, (SubLObject)equals.ONE_INTEGER, (SubLObject)equals.UNPROVIDED);
                if (equals.NIL == preferred_terms) {
                    result = (SubLObject)equals.$kw13$PREFERRED_TERM_NOT_FOUND;
                }
                else if (equals.NIL == list_utilities.singletonP(preferred_terms)) {
                    result = (SubLObject)equals.$kw14$TOO_MANY_PREFERRED_TERMS_FOUND;
                }
                else {
                    final SubLObject preferred_term = preferred_terms.first();
                    if (equals.NIL != list_utilities.member_kbeqP(preferred_term, candidate_terms)) {
                        result = (SubLObject)equals.$kw15$REWRITE_CYCLE_DETECTED;
                    }
                    else {
                        result = preferred_rewrite_term_int(preferred_term, mt, Numbers.add((SubLObject)equals.ONE_INTEGER, depth), (SubLObject)ConsesLow.cons(preferred_term, candidate_terms));
                    }
                }
            }
            else {
                result = v_term;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        result = ((equals.NIL != forts.fort_p(result) || depth.numG((SubLObject)equals.ZERO_INTEGER)) ? result : v_term);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 7961L)
    public static SubLObject direct_rewrite_ofP(final SubLObject simple_fort, final SubLObject complex_term, SubLObject mt) {
        if (mt == equals.UNPROVIDED) {
            mt = (SubLObject)equals.NIL;
        }
        if (equals.NIL != narts_high.naut_p(complex_term)) {
            return list_utilities.member_equalP(complex_term, kb_mapping_utilities.pred_values(simple_fort, equals.$const12$rewriteOf, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(equals.NIL != equality_store.some_source_rewrite_of_assertions_somewhereP(complex_term) && equals.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(equals.$const12$rewriteOf, simple_fort, complex_term, mt, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 8462L)
    public static SubLObject any_direct_rewrite_ofP(final SubLObject simple_forts, final SubLObject complex_term, SubLObject mt) {
        if (mt == equals.UNPROVIDED) {
            mt = (SubLObject)equals.NIL;
        }
        SubLObject v_answer = (SubLObject)equals.NIL;
        if (equals.NIL == v_answer) {
            SubLObject csome_list_var = simple_forts;
            SubLObject simple_fort = (SubLObject)equals.NIL;
            simple_fort = csome_list_var.first();
            while (equals.NIL == v_answer && equals.NIL != csome_list_var) {
                if (equals.NIL != direct_rewrite_ofP(simple_fort, complex_term, mt)) {
                    v_answer = (SubLObject)equals.T;
                }
                csome_list_var = csome_list_var.rest();
                simple_fort = csome_list_var.first();
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 8846L)
    public static SubLObject simplest_forts_wrt_rewrite(final SubLObject v_forts, SubLObject mt) {
        if (mt == equals.UNPROVIDED) {
            mt = (SubLObject)equals.NIL;
        }
        assert equals.NIL != list_utilities.non_dotted_list_p(v_forts) : v_forts;
        SubLObject cdolist_list_var = v_forts;
        SubLObject elem = (SubLObject)equals.NIL;
        elem = cdolist_list_var.first();
        while (equals.NIL != cdolist_list_var) {
            assert equals.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject simplest_forts = v_forts;
        cdolist_list_var = v_forts;
        SubLObject fort = (SubLObject)equals.NIL;
        fort = cdolist_list_var.first();
        while (equals.NIL != cdolist_list_var) {
            if (equals.NIL != any_direct_rewrite_ofP(v_forts, fort, mt)) {
                simplest_forts = Sequences.remove(fort, simplest_forts, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        return simplest_forts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 9367L)
    public static SubLObject differentP(final SubLObject objects, SubLObject unknown_value) {
        if (unknown_value == equals.UNPROVIDED) {
            unknown_value = (SubLObject)equals.NIL;
        }
        SubLObject result = (SubLObject)equals.T;
        SubLObject failureP = (SubLObject)equals.NIL;
        SubLObject v_object = (SubLObject)equals.NIL;
        SubLObject other_objects = (SubLObject)equals.NIL;
        v_object = objects.first();
        for (other_objects = objects.rest(); equals.NIL == failureP && equals.NIL != other_objects; other_objects = other_objects.rest()) {
            if (equals.NIL == failureP) {
                SubLObject csome_list_var = other_objects;
                SubLObject other_object = (SubLObject)equals.NIL;
                other_object = csome_list_var.first();
                while (equals.NIL == failureP && equals.NIL != csome_list_var) {
                    final SubLObject different = differentP_binary(v_object, other_object, unknown_value);
                    if (different.eql(unknown_value)) {
                        failureP = (SubLObject)equals.T;
                        result = unknown_value;
                    }
                    else if (equals.NIL == different) {
                        failureP = (SubLObject)equals.T;
                        result = (SubLObject)equals.NIL;
                    }
                    csome_list_var = csome_list_var.rest();
                    other_object = csome_list_var.first();
                }
            }
            v_object = other_objects.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 9980L)
    public static SubLObject differentP_binary(final SubLObject obj1, final SubLObject obj2, SubLObject unknown_value) {
        if (unknown_value == equals.UNPROVIDED) {
            unknown_value = (SubLObject)equals.NIL;
        }
        if (equals.NIL != unification_utilities.term_unify(obj1, obj2, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED)) {
            return (SubLObject)equals.NIL;
        }
        if (equals.NIL != cycl_grammar.subl_strict_atomic_term_p(obj1) && equals.NIL != cycl_grammar.subl_strict_atomic_term_p(obj2)) {
            return (SubLObject)equals.T;
        }
        if (equals.NIL != unique_names_assumption_applicable_to_termP(obj1) && equals.NIL != unique_names_assumption_applicable_to_termP(obj2)) {
            return (SubLObject)equals.T;
        }
        if (equals.NIL != asserted_differentP(obj1, obj2)) {
            return (SubLObject)equals.T;
        }
        if (equals.NIL != different_by_disjointnessP(obj1, obj2)) {
            return (SubLObject)equals.T;
        }
        return unknown_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 10615L)
    public static SubLObject asserted_differentP(final SubLObject obj1, final SubLObject obj2) {
        return list_utilities.sublisp_boolean(find_different_assertion(obj1, obj2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 10719L)
    public static SubLObject find_different_assertion(final SubLObject obj1, final SubLObject obj2) {
        SubLObject different_assertion;
        SubLObject rest;
        SubLObject assertion;
        SubLObject predicate;
        SubLObject args;
        for (different_assertion = (SubLObject)equals.NIL, rest = (SubLObject)equals.NIL, rest = virtual_indexing.gather_overlap_index((SubLObject)ConsesLow.list(equals.$const18$different, obj1, obj2), (SubLObject)equals.UNPROVIDED); equals.NIL == different_assertion && equals.NIL != rest; rest = rest.rest()) {
            assertion = rest.first();
            if (equals.NIL != assertions_high.assertion_has_truth(assertion, (SubLObject)equals.$kw19$TRUE) && equals.NIL != assertions_high.gaf_assertionP(assertion)) {
                predicate = assertions_high.gaf_predicate(assertion);
                args = assertions_high.gaf_args(assertion);
                if (equals.$const18$different.eql(predicate) && equals.NIL != list_utilities.member_equalP(obj1, args) && equals.NIL != list_utilities.member_equalP(obj2, Sequences.remove(obj1, args, Symbols.symbol_function((SubLObject)equals.EQUAL), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED))) {
                    different_assertion = assertion;
                }
            }
        }
        for (rest = (SubLObject)equals.NIL, rest = virtual_indexing.gather_overlap_index((SubLObject)ConsesLow.list(equals.$const0$equals, obj1, obj2), (SubLObject)equals.UNPROVIDED); equals.NIL == different_assertion && equals.NIL != rest; rest = rest.rest()) {
            assertion = rest.first();
            if (equals.NIL != assertions_high.assertion_has_truth(assertion, (SubLObject)equals.$kw20$FALSE) && equals.NIL != assertions_high.gaf_assertionP(assertion)) {
                predicate = assertions_high.gaf_predicate(assertion);
                args = assertions_high.gaf_args(assertion);
                if (equals.$const0$equals.eql(predicate) && equals.NIL != list_utilities.member_equalP(obj1, args) && equals.NIL != list_utilities.member_equalP(obj2, Sequences.remove(obj1, args, Symbols.symbol_function((SubLObject)equals.EQUAL), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED))) {
                    different_assertion = assertion;
                }
            }
        }
        return different_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 12162L)
    public static SubLObject different_by_disjointnessP(final SubLObject obj1, final SubLObject obj2) {
        if (equals.NIL != cycl_grammar.cycl_represented_term_p(obj1) && equals.NIL != cycl_grammar.cycl_represented_term_p(obj2)) {
            return disjoint_with.instances_of_disjoint_collectionsP(obj1, obj2, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
        }
        if (equals.NIL != cycl_grammar.cycl_represented_term_p(obj1)) {
            return different_by_disjointnessP_rep_unrep(obj1, obj2);
        }
        if (equals.NIL != cycl_grammar.cycl_represented_term_p(obj2)) {
            return different_by_disjointnessP_rep_unrep(obj2, obj1);
        }
        return (SubLObject)equals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 12562L)
    public static SubLObject different_by_disjointnessP_rep_unrep(final SubLObject rep_term, final SubLObject unrep_term) {
        SubLObject differentP = (SubLObject)equals.NIL;
        if (equals.NIL == differentP) {
            SubLObject csome_list_var = isa.min_isa(rep_term, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
            SubLObject col = (SubLObject)equals.NIL;
            col = csome_list_var.first();
            while (equals.NIL == differentP && equals.NIL != csome_list_var) {
                if (equals.NIL != at_defns.quiet_not_has_typeP(unrep_term, col, (SubLObject)equals.UNPROVIDED)) {
                    differentP = (SubLObject)equals.T;
                }
                if (equals.NIL == differentP) {
                    SubLObject csome_list_var_$5 = disjoint_with.max_all_disjoint_with(col, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
                    SubLObject disj_col = (SubLObject)equals.NIL;
                    disj_col = csome_list_var_$5.first();
                    while (equals.NIL == differentP && equals.NIL != csome_list_var_$5) {
                        if (equals.NIL != at_defns.quiet_has_typeP(unrep_term, disj_col, (SubLObject)equals.UNPROVIDED)) {
                            differentP = (SubLObject)equals.T;
                        }
                        csome_list_var_$5 = csome_list_var_$5.rest();
                        disj_col = csome_list_var_$5.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                col = csome_list_var.first();
            }
        }
        return differentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 12992L)
    public static SubLObject why_different(final SubLObject objects) {
        SubLObject justification = (SubLObject)equals.NIL;
        SubLObject failureP = (SubLObject)equals.NIL;
        SubLObject v_object = (SubLObject)equals.NIL;
        SubLObject other_objects = (SubLObject)equals.NIL;
        v_object = objects.first();
        for (other_objects = objects.rest(); equals.NIL == failureP && equals.NIL != other_objects; other_objects = other_objects.rest()) {
            if (equals.NIL == failureP) {
                SubLObject csome_list_var = other_objects;
                SubLObject other_object = (SubLObject)equals.NIL;
                other_object = csome_list_var.first();
                while (equals.NIL == failureP && equals.NIL != csome_list_var) {
                    final SubLObject binary_justification = why_different_binary(v_object, other_object);
                    if (equals.NIL != binary_justification) {
                        justification = ConsesLow.nconc(justification, binary_justification);
                    }
                    else {
                        justification = (SubLObject)equals.NIL;
                        failureP = (SubLObject)equals.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    other_object = csome_list_var.first();
                }
            }
            v_object = other_objects.first();
        }
        return list_utilities.fast_delete_duplicates(justification, Symbols.symbol_function((SubLObject)equals.EQUAL), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 13569L)
    public static SubLObject why_different_binary(final SubLObject obj1, final SubLObject obj2) {
        if (equals.NIL != unification_utilities.term_unify(obj1, obj2, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED)) {
            return (SubLObject)equals.NIL;
        }
        if (equals.NIL != cycl_grammar.subl_strict_atomic_term_p(obj1) && equals.NIL != cycl_grammar.subl_strict_atomic_term_p(obj2)) {
            final SubLObject support = arguments.make_hl_support((SubLObject)equals.$kw21$OPAQUE, el_utilities.make_binary_formula(equals.$const18$different, obj1, obj2), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
            return (SubLObject)ConsesLow.list(support);
        }
        if (equals.NIL != unique_names_assumption_applicable_to_termP(obj1) && equals.NIL != unique_names_assumption_applicable_to_termP(obj2)) {
            final SubLObject support = arguments.make_hl_support((SubLObject)equals.$kw21$OPAQUE, el_utilities.make_binary_formula(equals.$const18$different, obj1, obj2), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
            return (SubLObject)ConsesLow.list(support);
        }
        if (equals.NIL != asserted_differentP(obj1, obj2)) {
            return why_asserted_different(obj1, obj2);
        }
        if (equals.NIL != different_by_disjointnessP(obj1, obj2)) {
            return why_different_by_disjointness(obj1, obj2);
        }
        return (SubLObject)equals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 14460L)
    public static SubLObject why_asserted_different(final SubLObject obj1, final SubLObject obj2) {
        return (SubLObject)ConsesLow.list(find_different_assertion(obj1, obj2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 14564L)
    public static SubLObject why_different_by_disjointness(final SubLObject obj1, final SubLObject obj2) {
        if (equals.NIL != cycl_grammar.cycl_represented_term_p(obj1) && equals.NIL != cycl_grammar.cycl_represented_term_p(obj2)) {
            return disjoint_with.why_instances_of_disjoint_collections(obj1, obj2, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
        }
        if (equals.NIL != cycl_grammar.cycl_represented_term_p(obj1)) {
            return why_different_by_disjointness_rep_unrep(obj1, obj2);
        }
        if (equals.NIL != cycl_grammar.cycl_represented_term_p(obj2)) {
            return why_different_by_disjointness_rep_unrep(obj2, obj1);
        }
        return (SubLObject)equals.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 14976L)
    public static SubLObject why_different_by_disjointness_rep_unrep(final SubLObject rep_term, final SubLObject unrep_term) {
        SubLObject justification = (SubLObject)equals.NIL;
        if (equals.NIL == justification) {
            SubLObject csome_list_var = isa.min_isa(rep_term, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
            SubLObject col = (SubLObject)equals.NIL;
            col = csome_list_var.first();
            while (equals.NIL == justification && equals.NIL != csome_list_var) {
                if (equals.NIL != at_defns.quiet_not_has_typeP(unrep_term, col, (SubLObject)equals.UNPROVIDED)) {
                    final SubLObject support1 = arguments.make_hl_support((SubLObject)equals.$kw22$ISA, el_utilities.make_binary_formula(equals.$const23$isa, rep_term, col), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
                    final SubLObject support2 = arguments.make_hl_support((SubLObject)equals.$kw22$ISA, el_utilities.make_negation(el_utilities.make_binary_formula(equals.$const23$isa, unrep_term, col)), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
                    justification = (SubLObject)ConsesLow.list(support1, support2);
                }
                if (equals.NIL == justification) {
                    SubLObject csome_list_var_$6 = disjoint_with.max_all_disjoint_with(col, (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
                    SubLObject disj_col = (SubLObject)equals.NIL;
                    disj_col = csome_list_var_$6.first();
                    while (equals.NIL == justification && equals.NIL != csome_list_var_$6) {
                        if (equals.NIL != at_defns.quiet_has_typeP(unrep_term, disj_col, (SubLObject)equals.UNPROVIDED)) {
                            final SubLObject support3 = arguments.make_hl_support((SubLObject)equals.$kw22$ISA, el_utilities.make_binary_formula(equals.$const23$isa, rep_term, col), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
                            final SubLObject support4 = arguments.make_hl_support((SubLObject)equals.$kw22$ISA, el_utilities.make_binary_formula(equals.$const23$isa, unrep_term, disj_col), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
                            final SubLObject support5 = arguments.make_hl_support((SubLObject)equals.$kw24$DISJOINTWITH, el_utilities.make_binary_formula(equals.$const25$disjointWith, col, disj_col), (SubLObject)equals.UNPROVIDED, (SubLObject)equals.UNPROVIDED);
                            justification = (SubLObject)ConsesLow.list(support3, support4, support5);
                        }
                        csome_list_var_$6 = csome_list_var_$6.rest();
                        disj_col = csome_list_var_$6.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                col = csome_list_var.first();
            }
        }
        return justification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 15941L)
    public static SubLObject unique_names_assumption_applicable_to_termP(final SubLObject v_term) {
        if (equals.NIL != constant_handles.valid_constantP(equals.$const26$TermExemptFromUniqueNamesAssumpti, (SubLObject)equals.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(equals.NIL == kb_accessors.term_exempt_from_unique_names_assumptionP(v_term));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(equals.NIL == inference_trampolines.inference_indeterminate_termP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 16355L)
    public static SubLObject unique_names_assumption_applicable_to_all_argsP(final SubLObject formula) {
        SubLObject failureP = (SubLObject)equals.NIL;
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)equals.$kw27$IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = (SubLObject)equals.NIL, rest = args; equals.NIL == failureP && equals.NIL != rest; rest = rest.rest()) {
            arg = rest.first();
            if (equals.NIL == unique_names_assumption_applicable_to_termP(arg)) {
                failureP = (SubLObject)equals.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(equals.NIL == failureP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equals.lisp", position = 16692L)
    public static SubLObject unique_names_assumption_applicable_to_all_args_exceptP(final SubLObject formula, final SubLObject argnum) {
        SubLObject failureP = (SubLObject)equals.NIL;
        SubLObject n = (SubLObject)equals.ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)equals.$kw27$IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = (SubLObject)equals.NIL, rest = args; equals.NIL == failureP && equals.NIL != rest; rest = rest.rest()) {
            arg = rest.first();
            n = Numbers.add(n, (SubLObject)equals.ONE_INTEGER);
            if (!n.eql(argnum) && equals.NIL == unique_names_assumption_applicable_to_termP(arg)) {
                failureP = (SubLObject)equals.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(equals.NIL == failureP);
    }
    
    public static SubLObject declare_equals_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "all_equals", "ALL-EQUALS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "equalsP", "EQUALS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "why_equals", "WHY-EQUALS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "not_equalsP", "NOT-EQUALS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "equal_fortP", "EQUAL-FORT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "equal_fortsP", "EQUAL-FORTS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "equal_nautP", "EQUAL-NAUT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "max_floor_mts_where_equals", "MAX-FLOOR-MTS-WHERE-EQUALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "max_floor_mts_where_equals_fort", "MAX-FLOOR-MTS-WHERE-EQUALS-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "max_floor_mts_where_equals_non_forts", "MAX-FLOOR-MTS-WHERE-EQUALS-NON-FORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "equal_everywhereP", "EQUAL-EVERYWHERE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "equal_somewhereP", "EQUAL-SOMEWHERE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "possibly_subst_preferred_rewrite_terms", "POSSIBLY-SUBST-PREFERRED-REWRITE-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "preferred_rewrite_terms_subst_applicableP", "PREFERRED-REWRITE-TERMS-SUBST-APPLICABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "preferred_rewrite_terms_subst_apply", "PREFERRED-REWRITE-TERMS-SUBST-APPLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "has_preferred_rewrite_termP", "HAS-PREFERRED-REWRITE-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "clear_preferred_rewrite_term", "CLEAR-PREFERRED-REWRITE-TERM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "remove_preferred_rewrite_term", "REMOVE-PREFERRED-REWRITE-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "preferred_rewrite_term_internal", "PREFERRED-REWRITE-TERM-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "preferred_rewrite_term", "PREFERRED-REWRITE-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "preferred_rewrite_term_int", "PREFERRED-REWRITE-TERM-INT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "direct_rewrite_ofP", "DIRECT-REWRITE-OF?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "any_direct_rewrite_ofP", "ANY-DIRECT-REWRITE-OF?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "simplest_forts_wrt_rewrite", "SIMPLEST-FORTS-WRT-REWRITE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "differentP", "DIFFERENT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "differentP_binary", "DIFFERENT?-BINARY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "asserted_differentP", "ASSERTED-DIFFERENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "find_different_assertion", "FIND-DIFFERENT-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "different_by_disjointnessP", "DIFFERENT-BY-DISJOINTNESS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "different_by_disjointnessP_rep_unrep", "DIFFERENT-BY-DISJOINTNESS?-REP-UNREP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "why_different", "WHY-DIFFERENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "why_different_binary", "WHY-DIFFERENT-BINARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "why_asserted_different", "WHY-ASSERTED-DIFFERENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "why_different_by_disjointness", "WHY-DIFFERENT-BY-DISJOINTNESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "why_different_by_disjointness_rep_unrep", "WHY-DIFFERENT-BY-DISJOINTNESS-REP-UNREP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "unique_names_assumption_applicable_to_termP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "unique_names_assumption_applicable_to_all_argsP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-ALL-ARGS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equals", "unique_names_assumption_applicable_to_all_args_exceptP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-ALL-ARGS-EXCEPT?", 2, 0, false);
        return (SubLObject)equals.NIL;
    }
    
    public static SubLObject init_equals_file() {
        equals.$preferred_rewrite_term_caching_state$ = SubLFiles.deflexical("*PREFERRED-REWRITE-TERM-CACHING-STATE*", (SubLObject)equals.NIL);
        equals.$preferred_rewrite_term_max_recursion_depth$ = SubLFiles.defparameter("*PREFERRED-REWRITE-TERM-MAX-RECURSION-DEPTH*", (SubLObject)equals.SEVEN_INTEGER);
        return (SubLObject)equals.NIL;
    }
    
    public static SubLObject setup_equals_file() {
        memoization_state.note_globally_cached_function((SubLObject)equals.$sym7$PREFERRED_REWRITE_TERM);
        return (SubLObject)equals.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_equals_file();
    }
    
    @Override
	public void initializeVariables() {
        init_equals_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_equals_file();
    }
    
    static {
        me = (SubLFile)new equals();
        equals.$preferred_rewrite_term_caching_state$ = null;
        equals.$preferred_rewrite_term_max_recursion_depth$ = null;
        $const0$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw1$REFLEXIVE = SubLObjectFactory.makeKeyword("REFLEXIVE");
        $const2$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_ = SubLObjectFactory.makeSymbol("SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?");
        $sym4$OPAQUE_ARG_WRT_QUOTING_ = SubLObjectFactory.makeSymbol("OPAQUE-ARG-WRT-QUOTING?");
        $const5$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym6$HAS_PREFERRED_REWRITE_TERM_ = SubLObjectFactory.makeSymbol("HAS-PREFERRED-REWRITE-TERM?");
        $sym7$PREFERRED_REWRITE_TERM = SubLObjectFactory.makeSymbol("PREFERRED-REWRITE-TERM");
        $sym8$_PREFERRED_REWRITE_TERM_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PREFERRED-REWRITE-TERM-CACHING-STATE*");
        $int9$128 = SubLObjectFactory.makeInteger(128);
        $sym10$CLEAR_PREFERRED_REWRITE_TERM = SubLObjectFactory.makeSymbol("CLEAR-PREFERRED-REWRITE-TERM");
        $kw11$MAX_RECURSION_DEPTH_REACHED = SubLObjectFactory.makeKeyword("MAX-RECURSION-DEPTH-REACHED");
        $const12$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $kw13$PREFERRED_TERM_NOT_FOUND = SubLObjectFactory.makeKeyword("PREFERRED-TERM-NOT-FOUND");
        $kw14$TOO_MANY_PREFERRED_TERMS_FOUND = SubLObjectFactory.makeKeyword("TOO-MANY-PREFERRED-TERMS-FOUND");
        $kw15$REWRITE_CYCLE_DETECTED = SubLObjectFactory.makeKeyword("REWRITE-CYCLE-DETECTED");
        $sym16$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym17$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const18$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $kw19$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw20$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw21$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw22$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const23$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw24$DISJOINTWITH = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $const25$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $const26$TermExemptFromUniqueNamesAssumpti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TermExemptFromUniqueNamesAssumption"));
        $kw27$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
    }
}

/*

	Total time: 283 ms
	
*/