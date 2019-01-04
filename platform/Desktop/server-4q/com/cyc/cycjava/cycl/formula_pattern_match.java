package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class formula_pattern_match extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.formula_pattern_match";
    public static final String myFingerPrint = "07e6ae23b4e0c280d8329fb9ebdab7f38f4d2a62d3f7363dda4696fcc8f52257";
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 2024L)
    private static SubLSymbol $pattern_matches_formula_atomic_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 2809L)
    private static SubLSymbol $pattern_matches_formula_methods$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD;
    private static final SubLSymbol $sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PATTERN_MATCHES_FORMULA;
    private static final SubLSymbol $kw8$TEST;
    private static final SubLSymbol $kw9$OWNER;
    private static final SubLSymbol $kw10$CLASSES;
    private static final SubLSymbol $kw11$KB;
    private static final SubLSymbol $kw12$TINY;
    private static final SubLSymbol $kw13$WORKING_;
    private static final SubLList $list14;
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 1171L)
    public static SubLObject pattern_matches_formula(final SubLObject pattern, final SubLObject formula) {
        return pattern_matches_formula_internal(pattern, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 1618L)
    public static SubLObject pattern_matches_formula_without_bindings(final SubLObject pattern, final SubLObject formula) {
        return pattern_matches_formula_without_bindings_internal(pattern, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 1864L)
    public static SubLObject formula_matches_pattern(final SubLObject formula, final SubLObject pattern) {
        return pattern_matches_formula_internal(pattern, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 3697L)
    public static SubLObject pattern_matches_formula_internal(final SubLObject pattern, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = (SubLObject)formula_pattern_match.NIL;
        SubLObject v_bindings = (SubLObject)formula_pattern_match.NIL;
        final SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pattern_match.$pattern_matches_tree_methods$.currentBinding(thread);
        try {
            pattern_match.$pattern_matches_tree_atomic_methods$.bind(formula_pattern_match.$pattern_matches_formula_atomic_methods$.getGlobalValue(), thread);
            pattern_match.$pattern_matches_tree_methods$.bind(formula_pattern_match.$pattern_matches_formula_methods$.getGlobalValue(), thread);
            thread.resetMultipleValues();
            final SubLObject match_success = pattern_match.pattern_matches_tree(pattern, formula);
            final SubLObject match_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            success = match_success;
            v_bindings = match_bindings;
        }
        finally {
            pattern_match.$pattern_matches_tree_methods$.rebind(_prev_bind_2, thread);
            pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(success, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 4367L)
    public static SubLObject pattern_matches_formula_without_bindings_internal(final SubLObject pattern, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = (SubLObject)formula_pattern_match.NIL;
        final SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pattern_match.$pattern_matches_tree_methods$.currentBinding(thread);
        try {
            pattern_match.$pattern_matches_tree_atomic_methods$.bind(formula_pattern_match.$pattern_matches_formula_atomic_methods$.getGlobalValue(), thread);
            pattern_match.$pattern_matches_tree_methods$.bind(formula_pattern_match.$pattern_matches_formula_methods$.getGlobalValue(), thread);
            success = pattern_match.pattern_matches_tree_without_bindings(pattern, formula);
        }
        finally {
            pattern_match.$pattern_matches_tree_methods$.rebind(_prev_bind_2, thread);
            pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
        }
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 4935L)
    public static SubLObject pattern_matches_formula_isa_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject collection = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : formula_pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return call_pattern_matches_formula_isa_method(formula, collection, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list2);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 5197L)
    public static SubLObject call_pattern_matches_formula_isa_method(final SubLObject formula, final SubLObject collection, final SubLObject mt) {
        return at_defns.quiet_has_typeP(formula, collection, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 5374L)
    public static SubLObject pattern_matches_formula_isa_memoized_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject collection = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : formula_pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return memoized_call_pattern_matches_formula_isa_method(formula, collection, mt, (SubLObject)formula_pattern_match.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list2);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 5642L)
    public static SubLObject memoized_call_pattern_matches_formula_isa_method_internal(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info) {
        if (mt_info == formula_pattern_match.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)formula_pattern_match.UNPROVIDED);
        }
        return call_pattern_matches_formula_isa_method(formula, collection, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 5642L)
    public static SubLObject memoized_call_pattern_matches_formula_isa_method(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info) {
        if (mt_info == formula_pattern_match.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)formula_pattern_match.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)formula_pattern_match.NIL;
        if (formula_pattern_match.NIL == v_memoization_state) {
            return memoized_call_pattern_matches_formula_isa_method_internal(formula, collection, mt, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)formula_pattern_match.$sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, (SubLObject)formula_pattern_match.UNPROVIDED);
        if (formula_pattern_match.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)formula_pattern_match.$sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, (SubLObject)formula_pattern_match.FOUR_INTEGER, (SubLObject)formula_pattern_match.NIL, (SubLObject)formula_pattern_match.EQUAL, (SubLObject)formula_pattern_match.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)formula_pattern_match.$sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(formula, collection, mt, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)formula_pattern_match.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)formula_pattern_match.NIL;
            collision = cdolist_list_var.first();
            while (formula_pattern_match.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (collection.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (formula_pattern_match.NIL != cached_args && formula_pattern_match.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(memoized_call_pattern_matches_formula_isa_method_internal(formula, collection, mt, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(formula, collection, mt, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 5890L)
    public static SubLObject pattern_matches_formula_not_isa_disjoint_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject collection = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : formula_pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return call_pattern_matches_formula_not_isa_disjoint_method(formula, collection, mt);
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list2);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 6243L)
    public static SubLObject call_pattern_matches_formula_not_isa_disjoint_method(final SubLObject formula, final SubLObject collection, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(formula_pattern_match.NIL == at_defns.quiet_not_has_typeP(formula, collection, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 6399L)
    public static SubLObject pattern_matches_formula_not_isa_disjoint_memoized_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject collection = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : formula_pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return memoized_call_pattern_matches_formula_not_isa_disjoint_method(formula, collection, mt, (SubLObject)formula_pattern_match.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list2);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 6768L)
    public static SubLObject memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info) {
        if (mt_info == formula_pattern_match.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)formula_pattern_match.UNPROVIDED);
        }
        return call_pattern_matches_formula_not_isa_disjoint_method(formula, collection, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 6768L)
    public static SubLObject memoized_call_pattern_matches_formula_not_isa_disjoint_method(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info) {
        if (mt_info == formula_pattern_match.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)formula_pattern_match.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)formula_pattern_match.NIL;
        if (formula_pattern_match.NIL == v_memoization_state) {
            return memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal(formula, collection, mt, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)formula_pattern_match.$sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, (SubLObject)formula_pattern_match.UNPROVIDED);
        if (formula_pattern_match.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)formula_pattern_match.$sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, (SubLObject)formula_pattern_match.FOUR_INTEGER, (SubLObject)formula_pattern_match.NIL, (SubLObject)formula_pattern_match.EQUAL, (SubLObject)formula_pattern_match.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)formula_pattern_match.$sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(formula, collection, mt, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)formula_pattern_match.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)formula_pattern_match.NIL;
            collision = cdolist_list_var.first();
            while (formula_pattern_match.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (collection.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (formula_pattern_match.NIL != cached_args && formula_pattern_match.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal(formula, collection, mt, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(formula, collection, mt, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 7042L)
    public static SubLObject pattern_matches_formula_genls_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject collection = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : formula_pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(formula_pattern_match.NIL != term.el_fort_p(formula) && formula_pattern_match.NIL != genls.genlsP(formula, collection, mt, (SubLObject)formula_pattern_match.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list2);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 7299L)
    public static SubLObject pattern_matches_formula_spec_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject collection = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list2);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        collection = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : formula_pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, pattern, (SubLObject)formula_pattern_match.$list2);
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(formula_pattern_match.NIL != term.el_fort_p(formula) && formula_pattern_match.NIL != genls.specP(formula, collection, mt, (SubLObject)formula_pattern_match.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list2);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 7551L)
    public static SubLObject pattern_matches_formula_nat_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject subpattern = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list5);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list5);
        subpattern = current.first();
        current = current.rest();
        if (formula_pattern_match.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list5);
            return (SubLObject)formula_pattern_match.NIL;
        }
        if (formula_pattern_match.NIL != nart_handles.nart_p(formula)) {
            return pattern_match.pattern_matches_tree_internal(subpattern, narts_high.nart_el_formula(formula));
        }
        return pattern_match.pattern_matches_tree_internal(subpattern, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 7903L)
    public static SubLObject pattern_matches_formula_unify_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject subpattern = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list5);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list5);
        subpattern = current.first();
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return unification.unify_possible(subpattern, formula);
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list5);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 8114L)
    public static SubLObject pattern_matches_formula_genl_pred_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject predicate = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list6);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list6);
        predicate = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : formula_pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, pattern, (SubLObject)formula_pattern_match.$list6);
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(formula_pattern_match.NIL != forts.fort_p(formula) && formula_pattern_match.NIL != genl_predicates.genl_predicateP(formula, predicate, mt, (SubLObject)formula_pattern_match.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list6);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 8401L)
    public static SubLObject pattern_matches_formula_genl_inverse_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject predicate = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list6);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list6);
        predicate = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : formula_pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, pattern, (SubLObject)formula_pattern_match.$list6);
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(formula_pattern_match.NIL != forts.fort_p(formula) && formula_pattern_match.NIL != genl_predicates.genl_inverseP(formula, predicate, mt, (SubLObject)formula_pattern_match.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list6);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 8689L)
    public static SubLObject pattern_matches_formula_spec_pred_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject predicate = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list6);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list6);
        predicate = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : formula_pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, pattern, (SubLObject)formula_pattern_match.$list6);
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(formula_pattern_match.NIL != forts.fort_p(formula) && formula_pattern_match.NIL != genl_predicates.spec_predicateP(formula, predicate, mt, (SubLObject)formula_pattern_match.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list6);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 8976L)
    public static SubLObject pattern_matches_formula_spec_inverse_method(final SubLObject pattern, final SubLObject formula) {
        SubLObject pattern_operator = (SubLObject)formula_pattern_match.NIL;
        SubLObject predicate = (SubLObject)formula_pattern_match.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pattern, pattern, (SubLObject)formula_pattern_match.$list6);
        pattern_operator = pattern.first();
        SubLObject current = pattern.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pattern, (SubLObject)formula_pattern_match.$list6);
        predicate = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : formula_pattern_match.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, pattern, (SubLObject)formula_pattern_match.$list6);
        current = current.rest();
        if (formula_pattern_match.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(formula_pattern_match.NIL != forts.fort_p(formula) && formula_pattern_match.NIL != genl_predicates.spec_inverseP(formula, predicate, mt, (SubLObject)formula_pattern_match.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(pattern, (SubLObject)formula_pattern_match.$list6);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 9264L)
    public static SubLObject pattern_transform_formula(final SubLObject pattern, final SubLObject formula, SubLObject v_bindings) {
        if (v_bindings == formula_pattern_match.UNPROVIDED) {
            v_bindings = (SubLObject)formula_pattern_match.NIL;
        }
        return pattern_transform_formula_internal(pattern, formula, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 9701L)
    public static SubLObject formula_transform_pattern(final SubLObject formula, final SubLObject pattern, SubLObject v_bindings) {
        if (v_bindings == formula_pattern_match.UNPROVIDED) {
            v_bindings = (SubLObject)formula_pattern_match.NIL;
        }
        return pattern_transform_formula_internal(pattern, formula, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 9907L)
    public static SubLObject pattern_transform_formula_internal(final SubLObject pattern, final SubLObject formula, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answer_transform = (SubLObject)formula_pattern_match.NIL;
        SubLObject answer_bindings = (SubLObject)formula_pattern_match.NIL;
        final SubLObject _prev_bind_0 = pattern_match.$pattern_transform_match_method$.currentBinding(thread);
        try {
            pattern_match.$pattern_transform_match_method$.bind((SubLObject)formula_pattern_match.$sym7$PATTERN_MATCHES_FORMULA, thread);
            thread.resetMultipleValues();
            final SubLObject sub_transform = pattern_match.pattern_transform_tree(pattern, formula, v_bindings);
            final SubLObject sub_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            answer_transform = sub_transform;
            answer_bindings = sub_bindings;
        }
        finally {
            pattern_match.$pattern_transform_match_method$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(answer_transform, answer_bindings);
    }
    
    public static SubLObject declare_formula_pattern_match_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula", "PATTERN-MATCHES-FORMULA", 2, 0, false);
        new $pattern_matches_formula$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_without_bindings", "PATTERN-MATCHES-FORMULA-WITHOUT-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "formula_matches_pattern", "FORMULA-MATCHES-PATTERN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_internal", "PATTERN-MATCHES-FORMULA-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_without_bindings_internal", "PATTERN-MATCHES-FORMULA-WITHOUT-BINDINGS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_isa_method", "PATTERN-MATCHES-FORMULA-ISA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "call_pattern_matches_formula_isa_method", "CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_isa_memoized_method", "PATTERN-MATCHES-FORMULA-ISA-MEMOIZED-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "memoized_call_pattern_matches_formula_isa_method_internal", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "memoized_call_pattern_matches_formula_isa_method", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_not_isa_disjoint_method", "PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "call_pattern_matches_formula_not_isa_disjoint_method", "CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_not_isa_disjoint_memoized_method", "PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-MEMOIZED-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "memoized_call_pattern_matches_formula_not_isa_disjoint_method", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_genls_method", "PATTERN-MATCHES-FORMULA-GENLS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_spec_method", "PATTERN-MATCHES-FORMULA-SPEC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_nat_method", "PATTERN-MATCHES-FORMULA-NAT-METHOD", 2, 0, false);
        new $pattern_matches_formula_nat_method$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_unify_method", "PATTERN-MATCHES-FORMULA-UNIFY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_genl_pred_method", "PATTERN-MATCHES-FORMULA-GENL-PRED-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_genl_inverse_method", "PATTERN-MATCHES-FORMULA-GENL-INVERSE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_spec_pred_method", "PATTERN-MATCHES-FORMULA-SPEC-PRED-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_matches_formula_spec_inverse_method", "PATTERN-MATCHES-FORMULA-SPEC-INVERSE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_transform_formula", "PATTERN-TRANSFORM-FORMULA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "formula_transform_pattern", "FORMULA-TRANSFORM-PATTERN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.formula_pattern_match", "pattern_transform_formula_internal", "PATTERN-TRANSFORM-FORMULA-INTERNAL", 3, 0, false);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    public static SubLObject init_formula_pattern_match_file() {
        formula_pattern_match.$pattern_matches_formula_atomic_methods$ = SubLFiles.deflexical("*PATTERN-MATCHES-FORMULA-ATOMIC-METHODS*", (SubLObject)formula_pattern_match.$list0);
        formula_pattern_match.$pattern_matches_formula_methods$ = SubLFiles.deflexical("*PATTERN-MATCHES-FORMULA-METHODS*", (SubLObject)formula_pattern_match.$list1);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    public static SubLObject setup_formula_pattern_match_file() {
        memoization_state.note_memoized_function((SubLObject)formula_pattern_match.$sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD);
        memoization_state.note_memoized_function((SubLObject)formula_pattern_match.$sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD);
        generic_testing.define_test_case_table_int((SubLObject)formula_pattern_match.$sym7$PATTERN_MATCHES_FORMULA, (SubLObject)ConsesLow.list(new SubLObject[] { formula_pattern_match.$kw8$TEST, formula_pattern_match.NIL, formula_pattern_match.$kw9$OWNER, formula_pattern_match.NIL, formula_pattern_match.$kw10$CLASSES, formula_pattern_match.NIL, formula_pattern_match.$kw11$KB, formula_pattern_match.$kw12$TINY, formula_pattern_match.$kw13$WORKING_, formula_pattern_match.T }), (SubLObject)formula_pattern_match.$list14);
        return (SubLObject)formula_pattern_match.NIL;
    }
    
    public void declareFunctions() {
        declare_formula_pattern_match_file();
    }
    
    public void initializeVariables() {
        init_formula_pattern_match_file();
    }
    
    public void runTopLevelForms() {
        setup_formula_pattern_match_file();
    }
    
    static {
        me = (SubLFile)new formula_pattern_match();
        formula_pattern_match.$pattern_matches_formula_atomic_methods$ = null;
        formula_pattern_match.$pattern_matches_formula_methods$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("FULLY-BOUND-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-FULLY-BOUND-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("CLOSED-HLMT-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLOSED-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("CLOSED-NAUT?")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPEN-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NAUT?")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EL-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VARIABLE-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLLECTION-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FUNCTOR-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTOR-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("MICROTHEORY-P")) });
        $list1 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-ISA-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA-MEMOIZED"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-ISA-MEMOIZED-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT-ISA-DISJOINT"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT-ISA-DISJOINT-MEMOIZED"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-MEMOIZED-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-GENLS-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-NAT-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIFY"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-UNIFY-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-GENL-PRED-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL-INVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-GENL-INVERSE-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPEC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-PRED-METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPEC-INVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-INVERSE-METHOD")) });
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD = SubLObjectFactory.makeSymbol("MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD");
        $sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD = SubLObjectFactory.makeSymbol("MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBPATTERN"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $sym7$PATTERN_MATCHES_FORMULA = SubLObjectFactory.makeSymbol("PATTERN-MATCHES-FORMULA");
        $kw8$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw9$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw10$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw11$KB = SubLObjectFactory.makeKeyword("KB");
        $kw12$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw13$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list14 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)formula_pattern_match.ONE_INTEGER), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeString("test")), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")))), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")))), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOTHING"), (SubLObject)formula_pattern_match.ONE_INTEGER), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOTHING"), (SubLObject)SubLObjectFactory.makeString("test")), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOTHING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")))), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")))), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)SubLObjectFactory.makeString("a")), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)SubLObjectFactory.makeString("test")), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)SubLObjectFactory.makeString("TEST")), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)formula_pattern_match.ONE_INTEGER), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")))), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")))), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FULLY-BOUND-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)formula_pattern_match.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FULLY-BOUND-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)formula_pattern_match.ONE_INTEGER, (SubLObject)formula_pattern_match.TWO_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FULLY-BOUND-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FULLY-BOUND-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FULLY-BOUND-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FULLY-BOUND-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)SubLObjectFactory.makeInteger(212))), (SubLObject)formula_pattern_match.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIFY"), (SubLObject)SubLObjectFactory.makeInteger(212)), (SubLObject)SubLObjectFactory.makeInteger(212)), (SubLObject)formula_pattern_match.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIFY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)SubLObjectFactory.makeInteger(212)), (SubLObject)formula_pattern_match.NIL) });
    }
    
    public static final class $pattern_matches_formula$BinaryFunction extends BinaryFunction
    {
        public $pattern_matches_formula$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PATTERN-MATCHES-FORMULA"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return formula_pattern_match.pattern_matches_formula(arg1, arg2);
        }
    }
    
    public static final class $pattern_matches_formula_nat_method$BinaryFunction extends BinaryFunction
    {
        public $pattern_matches_formula_nat_method$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PATTERN-MATCHES-FORMULA-NAT-METHOD"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return formula_pattern_match.pattern_matches_formula_nat_method(arg1, arg2);
        }
    }
}

/*

	Total time: 217 ms
	
*/