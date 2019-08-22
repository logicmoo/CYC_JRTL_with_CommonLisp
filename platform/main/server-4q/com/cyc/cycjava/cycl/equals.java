package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$perform_equals_unification$;
import static com.cyc.cycjava.cycl.control_vars.within_queryP;
import static com.cyc.cycjava.cycl.el_utilities.evaluatable_el_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class equals extends SubLTranslatedFile {
    public static final SubLFile me = new equals();

    public static final String myName = "com.cyc.cycjava.cycl.equals";

    public static final String myFingerPrint = "3a53b0d8f2e543b36e4e0b27c43615087ccf9c52a11807459c4484ab581fb799";



    // defparameter
    public static final SubLSymbol $preferred_rewrite_term_max_recursion_depth$ = makeSymbol("*PREFERRED-REWRITE-TERM-MAX-RECURSION-DEPTH*");

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol $sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_ = makeSymbol("SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?");

    private static final SubLSymbol $sym4$OPAQUE_ARG_WRT_QUOTING_ = makeSymbol("OPAQUE-ARG-WRT-QUOTING?");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $sym6$HAS_PREFERRED_REWRITE_TERM_ = makeSymbol("HAS-PREFERRED-REWRITE-TERM?");

    private static final SubLSymbol PREFERRED_REWRITE_TERM = makeSymbol("PREFERRED-REWRITE-TERM");

    private static final SubLSymbol $preferred_rewrite_term_caching_state$ = makeSymbol("*PREFERRED-REWRITE-TERM-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol CLEAR_PREFERRED_REWRITE_TERM = makeSymbol("CLEAR-PREFERRED-REWRITE-TERM");

    private static final SubLSymbol $MAX_RECURSION_DEPTH_REACHED = makeKeyword("MAX-RECURSION-DEPTH-REACHED");

    private static final SubLObject $$rewriteOf = reader_make_constant_shell(makeString("rewriteOf"));

    private static final SubLSymbol $PREFERRED_TERM_NOT_FOUND = makeKeyword("PREFERRED-TERM-NOT-FOUND");

    private static final SubLSymbol $TOO_MANY_PREFERRED_TERMS_FOUND = makeKeyword("TOO-MANY-PREFERRED-TERMS-FOUND");

    private static final SubLSymbol $REWRITE_CYCLE_DETECTED = makeKeyword("REWRITE-CYCLE-DETECTED");





    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));









    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLObject $const26$TermExemptFromUniqueNamesAssumpti = reader_make_constant_shell(makeString("TermExemptFromUniqueNamesAssumption"));



    public static SubLObject all_equals(final SubLObject obj, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return ghl_search_methods.ghl_closure($$equals, obj, ghl_search_vars.ghl_forward_direction(), mt, tv);
    }

    public static SubLObject equalsP(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (obj1.equal(obj2)) {
            return T;
        }
        if (NIL != forts.fort_p(obj1)) {
            if (NIL != forts.fort_p(obj2)) {
                return equal_fortsP(obj1, obj2, mt, tv);
            }
            return equal_fortP(obj1, obj2, mt, tv);
        } else {
            if (NIL != forts.fort_p(obj2)) {
                return equal_fortP(obj2, obj1, mt, tv);
            }
            return equal_nautP(obj1, obj2, mt, tv);
        }
    }

    public static SubLObject why_equals(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (obj1.equal(obj2)) {
            return list(arguments.make_hl_support($REFLEXIVE, make_binary_formula($$equals, obj1, obj2), mt_vars.$equals_defining_mt$.getGlobalValue(), UNPROVIDED));
        }
        if (NIL != forts.fort_p(obj1)) {
            return ghl_search_methods.why_gt_predicate_relation_p($$equals, obj1, obj2, mt, tv);
        }
        if (NIL != forts.fort_p(obj2)) {
            return ghl_search_methods.why_gt_predicate_relation_p($$equals, obj2, obj1, mt, tv);
        }
        return ghl_search_methods.why_gt_predicate_relation_p($$equals, obj1, obj2, mt, tv);
    }

    public static SubLObject not_equalsP(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean(NIL == equalsP(obj1, obj2, mt, tv));
    }

    public static SubLObject equal_fortP(final SubLObject fort, final SubLObject non_fort, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (((NIL != $perform_equals_unification$.getDynamicValue(thread)) && (NIL == cycl_grammar.meta_variable_p(non_fort))) && (NIL != equality_store.some_equality_assertionsP(fort, UNPROVIDED))) {
            ans = ghl_search_methods.gt_predicate_relation_p($$equals, fort, non_fort, mt, tv, UNPROVIDED);
        }
        return ans;
    }

    public static SubLObject equal_fortsP(final SubLObject fort1, final SubLObject fort2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (((((NIL != $perform_equals_unification$.getDynamicValue(thread)) && (NIL != equality_store.some_equality_assertions_somewhereP(fort1))) && (NIL != equality_store.some_equality_assertions_somewhereP(fort2))) && (NIL != equality_store.some_equality_assertionsP(fort1, UNPROVIDED))) && (NIL != equality_store.some_equality_assertionsP(fort2, UNPROVIDED))) {
            ans = ghl_search_methods.gt_predicate_relation_p($$equals, fort1, fort2, mt, tv, UNPROVIDED);
        }
        return ans;
    }

    public static SubLObject equal_nautP(final SubLObject naut1, final SubLObject naut2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if ((NIL != evaluatable_el_expressionP(naut1)) && (NIL != evaluatable_el_expressionP(naut2))) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject naut1_evaluated = relation_evaluation.cyc_evaluate(naut1);
                final SubLObject naut2_evaluated = relation_evaluation.cyc_evaluate(naut2);
                if ((NIL != naut1_evaluated) && (NIL != naut2_evaluated)) {
                    result = equal(naut1_evaluated, naut2_evaluated);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if ((((NIL == result) && (NIL != list_utilities.non_dotted_list_p(naut1))) && (NIL != list_utilities.non_dotted_list_p(naut2))) && (NIL != list_utilities.same_length_p(naut1, naut2))) {
            SubLObject syntactically_differentP = NIL;
            if (NIL == syntactically_differentP) {
                SubLObject naut1_arg = NIL;
                SubLObject naut1_arg_$1 = NIL;
                SubLObject naut2_arg = NIL;
                SubLObject naut2_arg_$2 = NIL;
                naut1_arg = naut1;
                naut1_arg_$1 = naut1_arg.first();
                naut2_arg = naut2;
                naut2_arg_$2 = naut2_arg.first();
                while ((NIL == syntactically_differentP) && ((NIL != naut2_arg) || (NIL != naut1_arg))) {
                    if (NIL == equalsP(naut1_arg_$1, naut2_arg_$2, UNPROVIDED, UNPROVIDED)) {
                        syntactically_differentP = T;
                    }
                    naut1_arg = naut1_arg.rest();
                    naut1_arg_$1 = naut1_arg.first();
                    naut2_arg = naut2_arg.rest();
                    naut2_arg_$2 = naut2_arg.first();
                } 
            }
            result = makeBoolean(NIL == syntactically_differentP);
        }
        return result;
    }

    public static SubLObject max_floor_mts_where_equals(SubLObject source, final SubLObject target) {
        if (NIL != equal_everywhereP(source, target)) {
            return list(mt_vars.$equals_defining_mt$.getGlobalValue());
        }
        if (NIL != forts.fort_p(source)) {
            return max_floor_mts_where_equals_fort(source, target);
        }
        if (NIL != forts.fort_p(target)) {
            return max_floor_mts_where_equals_fort(target, source);
        }
        return max_floor_mts_where_equals_non_forts(source, target);
    }

    public static SubLObject max_floor_mts_where_equals_fort(final SubLObject source_fort, final SubLObject target) {
        return ghl_search_methods.gt_max_floor_mts_of_predicate_paths($$equals, source_fort, target, UNPROVIDED);
    }

    public static SubLObject max_floor_mts_where_equals_non_forts(SubLObject source, final SubLObject target) {
        return NIL != equal_somewhereP(source, target) ? $$InferencePSC : NIL;
    }

    public static SubLObject equal_everywhereP(final SubLObject term1, final SubLObject term2) {
        return equalsP(term1, term2, mt_vars.$equals_defining_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject equal_somewhereP(final SubLObject term1, final SubLObject term2) {
        return equalsP(term1, term2, $$InferencePSC, UNPROVIDED);
    }

    public static SubLObject possibly_subst_preferred_rewrite_terms(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != preferred_rewrite_terms_subst_applicableP(formula, mt)) {
            return preferred_rewrite_terms_subst_apply(formula, mt);
        }
        return values(formula, mt);
    }

    public static SubLObject preferred_rewrite_terms_subst_applicableP(final SubLObject sentence, final SubLObject mt) {
        return makeBoolean((NIL != within_queryP()) && ((NIL != cycl_utilities.expression_find_if($sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, sentence, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find_if($sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, mt, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject preferred_rewrite_terms_subst_apply(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind($sym4$OPAQUE_ARG_WRT_QUOTING_, thread);
            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$BaseKB);
            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                mt = cycl_utilities.expression_ntransform(mt, $sym6$HAS_PREFERRED_REWRITE_TERM_, PREFERRED_REWRITE_TERM, T, UNPROVIDED);
            } finally {
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
                sentence = cycl_utilities.expression_ntransform(sentence, $sym6$HAS_PREFERRED_REWRITE_TERM_, PREFERRED_REWRITE_TERM, T, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return values(sentence, mt);
    }

    public static SubLObject has_preferred_rewrite_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != equality_store.some_source_rewrite_of_assertions_somewhereP(v_term)) {
            final SubLObject preferred_term = preferred_rewrite_term(v_term, mt);
            if ((NIL != preferred_term) && (!preferred_term.equal(v_term))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject clear_preferred_rewrite_term() {
        final SubLObject cs = $preferred_rewrite_term_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_preferred_rewrite_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($preferred_rewrite_term_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject preferred_rewrite_term_internal(final SubLObject v_term, final SubLObject mt) {
        final SubLObject preferred_term = preferred_rewrite_term_int(v_term, mt, UNPROVIDED, UNPROVIDED);
        final SubLObject result = (NIL != kb_utilities.kbeq(v_term, preferred_term)) ? NIL : preferred_term;
        return result;
    }

    public static SubLObject preferred_rewrite_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $preferred_rewrite_term_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PREFERRED_REWRITE_TERM, $preferred_rewrite_term_caching_state$, $int$128, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_PREFERRED_REWRITE_TERM);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(preferred_rewrite_term_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject preferred_rewrite_term_int(final SubLObject v_term, final SubLObject mt, SubLObject depth, SubLObject candidate_terms) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (candidate_terms == UNPROVIDED) {
            candidate_terms = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (depth.numG($preferred_rewrite_term_max_recursion_depth$.getDynamicValue(thread))) {
                result = $MAX_RECURSION_DEPTH_REACHED;
            } else
                if (NIL != equality_store.some_source_rewrite_of_assertions_somewhereP(v_term)) {
                    final SubLObject preferred_terms = kb_mapping_utilities.pred_values(v_term, $$rewriteOf, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    if (NIL == preferred_terms) {
                        result = $PREFERRED_TERM_NOT_FOUND;
                    } else
                        if (NIL == list_utilities.singletonP(preferred_terms)) {
                            result = $TOO_MANY_PREFERRED_TERMS_FOUND;
                        } else {
                            final SubLObject preferred_term = preferred_terms.first();
                            if (NIL != list_utilities.member_kbeqP(preferred_term, candidate_terms)) {
                                result = $REWRITE_CYCLE_DETECTED;
                            } else {
                                result = preferred_rewrite_term_int(preferred_term, mt, add(ONE_INTEGER, depth), cons(preferred_term, candidate_terms));
                            }
                        }

                } else {
                    result = v_term;
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        result = ((NIL != forts.fort_p(result)) || depth.numG(ZERO_INTEGER)) ? result : v_term;
        return result;
    }

    public static SubLObject direct_rewrite_ofP(final SubLObject simple_fort, final SubLObject complex_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != narts_high.naut_p(complex_term)) {
            return list_utilities.member_equalP(complex_term, kb_mapping_utilities.pred_values(simple_fort, $$rewriteOf, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return makeBoolean((NIL != equality_store.some_source_rewrite_of_assertions_somewhereP(complex_term)) && (NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts($$rewriteOf, simple_fort, complex_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject any_direct_rewrite_ofP(final SubLObject simple_forts, final SubLObject complex_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject v_answer = NIL;
        if (NIL == v_answer) {
            SubLObject csome_list_var = simple_forts;
            SubLObject simple_fort = NIL;
            simple_fort = csome_list_var.first();
            while ((NIL == v_answer) && (NIL != csome_list_var)) {
                if (NIL != direct_rewrite_ofP(simple_fort, complex_term, mt)) {
                    v_answer = T;
                }
                csome_list_var = csome_list_var.rest();
                simple_fort = csome_list_var.first();
            } 
        }
        return v_answer;
    }

    public static SubLObject simplest_forts_wrt_rewrite(final SubLObject v_forts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != list_utilities.non_dotted_list_p(v_forts) : "list_utilities.non_dotted_list_p(v_forts) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(v_forts) " + v_forts;
        SubLObject cdolist_list_var = v_forts;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject simplest_forts = v_forts;
        cdolist_list_var = v_forts;
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != any_direct_rewrite_ofP(v_forts, fort, mt)) {
                simplest_forts = remove(fort, simplest_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        } 
        return simplest_forts;
    }

    public static SubLObject differentP(final SubLObject objects, SubLObject unknown_value) {
        if (unknown_value == UNPROVIDED) {
            unknown_value = NIL;
        }
        SubLObject result = T;
        SubLObject failureP = NIL;
        SubLObject v_object = NIL;
        SubLObject other_objects = NIL;
        v_object = objects.first();
        for (other_objects = objects.rest(); (NIL == failureP) && (NIL != other_objects); other_objects = other_objects.rest()) {
            if (NIL == failureP) {
                SubLObject csome_list_var = other_objects;
                SubLObject other_object = NIL;
                other_object = csome_list_var.first();
                while ((NIL == failureP) && (NIL != csome_list_var)) {
                    final SubLObject different = differentP_binary(v_object, other_object, unknown_value);
                    if (different.eql(unknown_value)) {
                        failureP = T;
                        result = unknown_value;
                    } else
                        if (NIL == different) {
                            failureP = T;
                            result = NIL;
                        }

                    csome_list_var = csome_list_var.rest();
                    other_object = csome_list_var.first();
                } 
            }
            v_object = other_objects.first();
        }
        return result;
    }

    public static SubLObject differentP_binary(final SubLObject obj1, final SubLObject obj2, SubLObject unknown_value) {
        if (unknown_value == UNPROVIDED) {
            unknown_value = NIL;
        }
        if (NIL != unification_utilities.term_unify(obj1, obj2, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if ((NIL != cycl_grammar.subl_strict_atomic_term_p(obj1)) && (NIL != cycl_grammar.subl_strict_atomic_term_p(obj2))) {
            return T;
        }
        if ((NIL != unique_names_assumption_applicable_to_termP(obj1)) && (NIL != unique_names_assumption_applicable_to_termP(obj2))) {
            return T;
        }
        if (NIL != asserted_differentP(obj1, obj2)) {
            return T;
        }
        if (NIL != different_by_disjointnessP(obj1, obj2)) {
            return T;
        }
        return unknown_value;
    }

    public static SubLObject asserted_differentP(final SubLObject obj1, final SubLObject obj2) {
        return list_utilities.sublisp_boolean(find_different_assertion(obj1, obj2));
    }

    public static SubLObject find_different_assertion(final SubLObject obj1, final SubLObject obj2) {
        SubLObject different_assertion;
        SubLObject rest;
        SubLObject assertion;
        SubLObject predicate;
        SubLObject args;
        for (different_assertion = NIL, rest = NIL, rest = virtual_indexing.gather_overlap_index(list($$different, obj1, obj2), UNPROVIDED); (NIL == different_assertion) && (NIL != rest); rest = rest.rest()) {
            assertion = rest.first();
            if ((NIL != assertions_high.assertion_has_truth(assertion, $TRUE)) && (NIL != assertions_high.gaf_assertionP(assertion))) {
                predicate = assertions_high.gaf_predicate(assertion);
                args = assertions_high.gaf_args(assertion);
                if (($$different.eql(predicate) && (NIL != list_utilities.member_equalP(obj1, args))) && (NIL != list_utilities.member_equalP(obj2, remove(obj1, args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                    different_assertion = assertion;
                }
            }
        }
        for (rest = NIL, rest = virtual_indexing.gather_overlap_index(list($$equals, obj1, obj2), UNPROVIDED); (NIL == different_assertion) && (NIL != rest); rest = rest.rest()) {
            assertion = rest.first();
            if ((NIL != assertions_high.assertion_has_truth(assertion, $FALSE)) && (NIL != assertions_high.gaf_assertionP(assertion))) {
                predicate = assertions_high.gaf_predicate(assertion);
                args = assertions_high.gaf_args(assertion);
                if (($$equals.eql(predicate) && (NIL != list_utilities.member_equalP(obj1, args))) && (NIL != list_utilities.member_equalP(obj2, remove(obj1, args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                    different_assertion = assertion;
                }
            }
        }
        return different_assertion;
    }

    public static SubLObject different_by_disjointnessP(final SubLObject obj1, final SubLObject obj2) {
        if ((NIL != cycl_grammar.cycl_represented_term_p(obj1)) && (NIL != cycl_grammar.cycl_represented_term_p(obj2))) {
            return disjoint_with.instances_of_disjoint_collectionsP(obj1, obj2, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != cycl_grammar.cycl_represented_term_p(obj1)) {
            return different_by_disjointnessP_rep_unrep(obj1, obj2);
        }
        if (NIL != cycl_grammar.cycl_represented_term_p(obj2)) {
            return different_by_disjointnessP_rep_unrep(obj2, obj1);
        }
        return NIL;
    }

    public static SubLObject different_by_disjointnessP_rep_unrep(final SubLObject rep_term, final SubLObject unrep_term) {
        SubLObject differentP = NIL;
        if (NIL == differentP) {
            SubLObject csome_list_var = isa.min_isa(rep_term, UNPROVIDED, UNPROVIDED);
            SubLObject col = NIL;
            col = csome_list_var.first();
            while ((NIL == differentP) && (NIL != csome_list_var)) {
                if (NIL != at_defns.quiet_not_has_typeP(unrep_term, col, UNPROVIDED)) {
                    differentP = T;
                }
                if (NIL == differentP) {
                    SubLObject csome_list_var_$5 = disjoint_with.max_all_disjoint_with(col, UNPROVIDED, UNPROVIDED);
                    SubLObject disj_col = NIL;
                    disj_col = csome_list_var_$5.first();
                    while ((NIL == differentP) && (NIL != csome_list_var_$5)) {
                        if (NIL != at_defns.quiet_has_typeP(unrep_term, disj_col, UNPROVIDED)) {
                            differentP = T;
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

    public static SubLObject why_different(final SubLObject objects) {
        SubLObject justification = NIL;
        SubLObject failureP = NIL;
        SubLObject v_object = NIL;
        SubLObject other_objects = NIL;
        v_object = objects.first();
        for (other_objects = objects.rest(); (NIL == failureP) && (NIL != other_objects); other_objects = other_objects.rest()) {
            if (NIL == failureP) {
                SubLObject csome_list_var = other_objects;
                SubLObject other_object = NIL;
                other_object = csome_list_var.first();
                while ((NIL == failureP) && (NIL != csome_list_var)) {
                    final SubLObject binary_justification = why_different_binary(v_object, other_object);
                    if (NIL != binary_justification) {
                        justification = nconc(justification, binary_justification);
                    } else {
                        justification = NIL;
                        failureP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    other_object = csome_list_var.first();
                } 
            }
            v_object = other_objects.first();
        }
        return list_utilities.fast_delete_duplicates(justification, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject why_different_binary(final SubLObject obj1, final SubLObject obj2) {
        if (NIL != unification_utilities.term_unify(obj1, obj2, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if ((NIL != cycl_grammar.subl_strict_atomic_term_p(obj1)) && (NIL != cycl_grammar.subl_strict_atomic_term_p(obj2))) {
            final SubLObject support = arguments.make_hl_support($OPAQUE, make_binary_formula($$different, obj1, obj2), UNPROVIDED, UNPROVIDED);
            return list(support);
        }
        if ((NIL != unique_names_assumption_applicable_to_termP(obj1)) && (NIL != unique_names_assumption_applicable_to_termP(obj2))) {
            final SubLObject support = arguments.make_hl_support($OPAQUE, make_binary_formula($$different, obj1, obj2), UNPROVIDED, UNPROVIDED);
            return list(support);
        }
        if (NIL != asserted_differentP(obj1, obj2)) {
            return why_asserted_different(obj1, obj2);
        }
        if (NIL != different_by_disjointnessP(obj1, obj2)) {
            return why_different_by_disjointness(obj1, obj2);
        }
        return NIL;
    }

    public static SubLObject why_asserted_different(final SubLObject obj1, final SubLObject obj2) {
        return list(find_different_assertion(obj1, obj2));
    }

    public static SubLObject why_different_by_disjointness(final SubLObject obj1, final SubLObject obj2) {
        if ((NIL != cycl_grammar.cycl_represented_term_p(obj1)) && (NIL != cycl_grammar.cycl_represented_term_p(obj2))) {
            return disjoint_with.why_instances_of_disjoint_collections(obj1, obj2, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != cycl_grammar.cycl_represented_term_p(obj1)) {
            return why_different_by_disjointness_rep_unrep(obj1, obj2);
        }
        if (NIL != cycl_grammar.cycl_represented_term_p(obj2)) {
            return why_different_by_disjointness_rep_unrep(obj2, obj1);
        }
        return NIL;
    }

    public static SubLObject why_different_by_disjointness_rep_unrep(final SubLObject rep_term, final SubLObject unrep_term) {
        SubLObject justification = NIL;
        if (NIL == justification) {
            SubLObject csome_list_var = isa.min_isa(rep_term, UNPROVIDED, UNPROVIDED);
            SubLObject col = NIL;
            col = csome_list_var.first();
            while ((NIL == justification) && (NIL != csome_list_var)) {
                if (NIL != at_defns.quiet_not_has_typeP(unrep_term, col, UNPROVIDED)) {
                    final SubLObject support1 = arguments.make_hl_support($ISA, make_binary_formula($$isa, rep_term, col), UNPROVIDED, UNPROVIDED);
                    final SubLObject support2 = arguments.make_hl_support($ISA, make_negation(make_binary_formula($$isa, unrep_term, col)), UNPROVIDED, UNPROVIDED);
                    justification = list(support1, support2);
                }
                if (NIL == justification) {
                    SubLObject csome_list_var_$6 = disjoint_with.max_all_disjoint_with(col, UNPROVIDED, UNPROVIDED);
                    SubLObject disj_col = NIL;
                    disj_col = csome_list_var_$6.first();
                    while ((NIL == justification) && (NIL != csome_list_var_$6)) {
                        if (NIL != at_defns.quiet_has_typeP(unrep_term, disj_col, UNPROVIDED)) {
                            final SubLObject support3 = arguments.make_hl_support($ISA, make_binary_formula($$isa, rep_term, col), UNPROVIDED, UNPROVIDED);
                            final SubLObject support4 = arguments.make_hl_support($ISA, make_binary_formula($$isa, unrep_term, disj_col), UNPROVIDED, UNPROVIDED);
                            final SubLObject support5 = arguments.make_hl_support($DISJOINTWITH, make_binary_formula($$disjointWith, col, disj_col), UNPROVIDED, UNPROVIDED);
                            justification = list(support3, support4, support5);
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

    public static SubLObject unique_names_assumption_applicable_to_termP(final SubLObject v_term) {
        if (NIL != valid_constantP($const26$TermExemptFromUniqueNamesAssumpti, UNPROVIDED)) {
            return makeBoolean(NIL == kb_accessors.term_exempt_from_unique_names_assumptionP(v_term));
        }
        return makeBoolean(NIL == inference_trampolines.inference_indeterminate_termP(v_term));
    }

    public static SubLObject unique_names_assumption_applicable_to_all_argsP(final SubLObject formula) {
        SubLObject failureP = NIL;
        final SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = NIL, rest = args; (NIL == failureP) && (NIL != rest); rest = rest.rest()) {
            arg = rest.first();
            if (NIL == unique_names_assumption_applicable_to_termP(arg)) {
                failureP = T;
            }
        }
        return makeBoolean(NIL == failureP);
    }

    public static SubLObject unique_names_assumption_applicable_to_all_args_exceptP(final SubLObject formula, final SubLObject argnum) {
        SubLObject failureP = NIL;
        SubLObject n = ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = NIL, rest = args; (NIL == failureP) && (NIL != rest); rest = rest.rest()) {
            arg = rest.first();
            n = add(n, ONE_INTEGER);
            if ((!n.eql(argnum)) && (NIL == unique_names_assumption_applicable_to_termP(arg))) {
                failureP = T;
            }
        }
        return makeBoolean(NIL == failureP);
    }

    public static SubLObject declare_equals_file() {
        declareFunction(me, "all_equals", "ALL-EQUALS", 1, 2, false);
        declareFunction(me, "equalsP", "EQUALS?", 2, 2, false);
        declareFunction(me, "why_equals", "WHY-EQUALS", 2, 2, false);
        declareFunction(me, "not_equalsP", "NOT-EQUALS?", 2, 2, false);
        declareFunction(me, "equal_fortP", "EQUAL-FORT?", 2, 2, false);
        declareFunction(me, "equal_fortsP", "EQUAL-FORTS?", 2, 2, false);
        declareFunction(me, "equal_nautP", "EQUAL-NAUT?", 2, 2, false);
        declareFunction(me, "max_floor_mts_where_equals", "MAX-FLOOR-MTS-WHERE-EQUALS", 2, 0, false);
        declareFunction(me, "max_floor_mts_where_equals_fort", "MAX-FLOOR-MTS-WHERE-EQUALS-FORT", 2, 0, false);
        declareFunction(me, "max_floor_mts_where_equals_non_forts", "MAX-FLOOR-MTS-WHERE-EQUALS-NON-FORTS", 2, 0, false);
        declareFunction(me, "equal_everywhereP", "EQUAL-EVERYWHERE?", 2, 0, false);
        declareFunction(me, "equal_somewhereP", "EQUAL-SOMEWHERE?", 2, 0, false);
        declareFunction(me, "possibly_subst_preferred_rewrite_terms", "POSSIBLY-SUBST-PREFERRED-REWRITE-TERMS", 1, 1, false);
        declareFunction(me, "preferred_rewrite_terms_subst_applicableP", "PREFERRED-REWRITE-TERMS-SUBST-APPLICABLE?", 2, 0, false);
        declareFunction(me, "preferred_rewrite_terms_subst_apply", "PREFERRED-REWRITE-TERMS-SUBST-APPLY", 2, 0, false);
        declareFunction(me, "has_preferred_rewrite_termP", "HAS-PREFERRED-REWRITE-TERM?", 1, 1, false);
        declareFunction(me, "clear_preferred_rewrite_term", "CLEAR-PREFERRED-REWRITE-TERM", 0, 0, false);
        declareFunction(me, "remove_preferred_rewrite_term", "REMOVE-PREFERRED-REWRITE-TERM", 1, 1, false);
        declareFunction(me, "preferred_rewrite_term_internal", "PREFERRED-REWRITE-TERM-INTERNAL", 2, 0, false);
        declareFunction(me, "preferred_rewrite_term", "PREFERRED-REWRITE-TERM", 1, 1, false);
        declareFunction(me, "preferred_rewrite_term_int", "PREFERRED-REWRITE-TERM-INT", 2, 2, false);
        declareFunction(me, "direct_rewrite_ofP", "DIRECT-REWRITE-OF?", 2, 1, false);
        declareFunction(me, "any_direct_rewrite_ofP", "ANY-DIRECT-REWRITE-OF?", 2, 1, false);
        declareFunction(me, "simplest_forts_wrt_rewrite", "SIMPLEST-FORTS-WRT-REWRITE", 1, 1, false);
        declareFunction(me, "differentP", "DIFFERENT?", 1, 1, false);
        declareFunction(me, "differentP_binary", "DIFFERENT?-BINARY", 2, 1, false);
        declareFunction(me, "asserted_differentP", "ASSERTED-DIFFERENT?", 2, 0, false);
        declareFunction(me, "find_different_assertion", "FIND-DIFFERENT-ASSERTION", 2, 0, false);
        declareFunction(me, "different_by_disjointnessP", "DIFFERENT-BY-DISJOINTNESS?", 2, 0, false);
        declareFunction(me, "different_by_disjointnessP_rep_unrep", "DIFFERENT-BY-DISJOINTNESS?-REP-UNREP", 2, 0, false);
        declareFunction(me, "why_different", "WHY-DIFFERENT", 1, 0, false);
        declareFunction(me, "why_different_binary", "WHY-DIFFERENT-BINARY", 2, 0, false);
        declareFunction(me, "why_asserted_different", "WHY-ASSERTED-DIFFERENT", 2, 0, false);
        declareFunction(me, "why_different_by_disjointness", "WHY-DIFFERENT-BY-DISJOINTNESS", 2, 0, false);
        declareFunction(me, "why_different_by_disjointness_rep_unrep", "WHY-DIFFERENT-BY-DISJOINTNESS-REP-UNREP", 2, 0, false);
        declareFunction(me, "unique_names_assumption_applicable_to_termP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-TERM?", 1, 0, false);
        declareFunction(me, "unique_names_assumption_applicable_to_all_argsP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-ALL-ARGS?", 1, 0, false);
        declareFunction(me, "unique_names_assumption_applicable_to_all_args_exceptP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-ALL-ARGS-EXCEPT?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_equals_file() {
        deflexical("*PREFERRED-REWRITE-TERM-CACHING-STATE*", NIL);
        defparameter("*PREFERRED-REWRITE-TERM-MAX-RECURSION-DEPTH*", SEVEN_INTEGER);
        return NIL;
    }

    public static SubLObject setup_equals_file() {
        memoization_state.note_globally_cached_function(PREFERRED_REWRITE_TERM);
        return NIL;
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

    
}

/**
 * Total time: 283 ms
 */
