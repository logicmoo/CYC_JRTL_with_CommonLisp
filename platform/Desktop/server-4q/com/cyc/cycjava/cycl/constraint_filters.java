package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constraint_filters extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constraint_filters";
    public static final String myFingerPrint = "5f90365ca969bf41a7c6ef4ef2e9ff98d674680f32aa878cf9ba7a564df5dcc6";
    private static final SubLSymbol $sym0$FORT_OR_CHLMT_P;
    private static final SubLSymbol $sym1$FILTER_TERMS_FOR_ARG_CONSTRAINTS_AT_ARGPOS;
    private static final SubLSymbol $sym2$FILTER_TERMS_FOR_ARG_CONSTRAINTS;
    private static final SubLList $list3;
    private static final SubLObject $const4$BaseKB;
    private static final SubLObject $const5$Individual;
    private static final SubLObject $const6$Date;
    private static final SubLSymbol $sym7$CONSTRAINT_FILTER_MIN_ISA;
    private static final SubLObject $const8$Number_General;
    private static final SubLSymbol $sym9$ANY_NOT_ISA_;
    private static final SubLSymbol $sym10$ANY_NOT_QUOTED_ISA_;
    private static final SubLSymbol $sym11$ANY_DEFNS_REJECT_;
    private static final SubLSymbol $sym12$ANY_SPEC_OF_;
    private static final SubLSymbol $sym13$FORMULA_TERM_ARG_CONSTRAINTS;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$QUOTED_COLLECTION_;
    private static final SubLSymbol $sym16$CONSTRAINED_CYCL_FILTER;
    private static final SubLSymbol $kw17$TEST;
    private static final SubLSymbol $kw18$OWNER;
    private static final SubLSymbol $kw19$CLASSES;
    private static final SubLSymbol $kw20$KB;
    private static final SubLSymbol $kw21$FULL;
    private static final SubLSymbol $kw22$WORKING_;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$SETS_EQUALP;
    private static final SubLList $list25;
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 931L)
    public static SubLObject filter_terms_by_constraining_collection(final SubLObject constraining_collection, final SubLObject mt, final SubLObject terms) {
        if (constraint_filters.NIL != hlmt.fort_or_chlmt_p(constraining_collection) && constraint_filters.NIL != list_utilities.list_of_type_p(Symbols.symbol_function((SubLObject)constraint_filters.$sym0$FORT_OR_CHLMT_P), terms)) {
            return isa.all_instances_among(constraining_collection, terms, mt, (SubLObject)constraint_filters.UNPROVIDED);
        }
        SubLObject result = (SubLObject)constraint_filters.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)constraint_filters.NIL;
        v_term = cdolist_list_var.first();
        while (constraint_filters.NIL != cdolist_list_var) {
            if (constraint_filters.NIL != lexicon_accessors.denot_has_typeP(v_term, constraining_collection, mt)) {
                result = (SubLObject)ConsesLow.cons(v_term, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 1692L)
    public static SubLObject filter_terms_for_arg_constraints_at_argpos(final SubLObject arg_position, final SubLObject formula, final SubLObject mt, final SubLObject possible_substitutions, SubLObject use_all_mentionsP) {
        if (use_all_mentionsP == constraint_filters.UNPROVIDED) {
            use_all_mentionsP = (SubLObject)constraint_filters.T;
        }
        return filter_terms_for_arg_constraints(cycl_utilities.formula_arg_position(formula, arg_position, (SubLObject)constraint_filters.UNPROVIDED), formula, mt, possible_substitutions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 2418L)
    public static SubLObject filter_terms_for_arg_constraints(final SubLObject v_term, final SubLObject formula, final SubLObject mt, final SubLObject possible_substitutions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)constraint_filters.NIL;
        SubLObject filtered = (SubLObject)constraint_filters.NIL;
        SubLObject subst_requires_individualP = (SubLObject)constraint_filters.NIL;
        final SubLObject disjointness_check_mt = (constraint_filters.NIL != subl_promotions.memberP(mt, (SubLObject)constraint_filters.$list3, (SubLObject)constraint_filters.UNPROVIDED, (SubLObject)constraint_filters.UNPROVIDED)) ? constraint_filters.$const4$BaseKB : mt;
        thread.resetMultipleValues();
        final SubLObject isa_constraints = formula_term_arg_constraints(v_term, formula, mt);
        final SubLObject genls_constraints = thread.secondMultipleValue();
        final SubLObject quoted_isa_constraints = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        subst_requires_individualP = any_spec_ofP(isa_constraints, constraint_filters.$const5$Individual, mt);
        SubLObject cdolist_list_var = possible_substitutions;
        SubLObject substitution = (SubLObject)constraint_filters.NIL;
        substitution = cdolist_list_var.first();
        while (constraint_filters.NIL != cdolist_list_var) {
            if (constraint_filters.NIL != subst_requires_individualP && constraint_filters.NIL != fort_types_interface.isa_collectionP(substitution, (SubLObject)constraint_filters.UNPROVIDED)) {
                filtered = (SubLObject)ConsesLow.cons(substitution, filtered);
            }
            else if (constraint_filters.NIL != any_defns_rejectP(isa_constraints, substitution, mt)) {
                filtered = (SubLObject)ConsesLow.cons(substitution, filtered);
            }
            else if (constraint_filters.NIL != disjoint_with.any_disjoint_with_anyP(genls_constraints, genls.min_genls(substitution, mt, (SubLObject)constraint_filters.UNPROVIDED), disjointness_check_mt, (SubLObject)constraint_filters.UNPROVIDED, (SubLObject)constraint_filters.UNPROVIDED)) {
                filtered = (SubLObject)ConsesLow.cons(substitution, filtered);
            }
            else if (constraint_filters.NIL != any_spec_ofP(isa_constraints, constraint_filters.$const6$Date, mt) && constraint_filters.NIL == date_utilities.date_p(substitution)) {
                filtered = (SubLObject)ConsesLow.cons(substitution, filtered);
            }
            else if (constraint_filters.NIL == isa.isa_allP(substitution, isa_constraints, mt) && (constraint_filters.NIL != disjoint_with.any_disjoint_with_anyP(isa_constraints, constraint_filter_min_isa(substitution, mt), disjointness_check_mt, (SubLObject)constraint_filters.UNPROVIDED, (SubLObject)constraint_filters.UNPROVIDED) || constraint_filters.NIL != any_not_isaP(isa_constraints, substitution, mt))) {
                filtered = (SubLObject)ConsesLow.cons(substitution, filtered);
            }
            else if (constraint_filters.NIL != any_not_quoted_isaP(quoted_isa_constraints, substitution, mt)) {
                filtered = (SubLObject)ConsesLow.cons(substitution, filtered);
            }
            else {
                result = (SubLObject)ConsesLow.cons(substitution, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            substitution = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(result), Sequences.nreverse(filtered));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 4266L)
    public static SubLObject constraint_filter_min_isa_internal(final SubLObject v_term, final SubLObject mt) {
        SubLObject result = isa.min_isa(v_term, mt, (SubLObject)constraint_filters.UNPROVIDED);
        if (constraint_filters.NIL == result && v_term.isNumber()) {
            result = (SubLObject)ConsesLow.list(constraint_filters.$const8$Number_General);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 4266L)
    public static SubLObject constraint_filter_min_isa(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)constraint_filters.NIL;
        if (constraint_filters.NIL == v_memoization_state) {
            return constraint_filter_min_isa_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)constraint_filters.$sym7$CONSTRAINT_FILTER_MIN_ISA, (SubLObject)constraint_filters.UNPROVIDED);
        if (constraint_filters.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)constraint_filters.$sym7$CONSTRAINT_FILTER_MIN_ISA, (SubLObject)constraint_filters.TWO_INTEGER, (SubLObject)constraint_filters.NIL, (SubLObject)constraint_filters.EQUAL, (SubLObject)constraint_filters.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)constraint_filters.$sym7$CONSTRAINT_FILTER_MIN_ISA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)constraint_filters.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)constraint_filters.NIL;
            collision = cdolist_list_var.first();
            while (constraint_filters.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (constraint_filters.NIL != cached_args && constraint_filters.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(constraint_filter_min_isa_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 4677L)
    public static SubLObject any_not_isaP_internal(final SubLObject isa_constraints, final SubLObject v_term, final SubLObject mt) {
        SubLObject rejectP = (SubLObject)constraint_filters.NIL;
        if (constraint_filters.NIL == rejectP) {
            SubLObject csome_list_var = isa_constraints;
            SubLObject isa_constraint = (SubLObject)constraint_filters.NIL;
            isa_constraint = csome_list_var.first();
            while (constraint_filters.NIL == rejectP && constraint_filters.NIL != csome_list_var) {
                if (constraint_filters.NIL != isa.not_isaP(v_term, isa_constraint, mt, (SubLObject)constraint_filters.UNPROVIDED)) {
                    rejectP = (SubLObject)constraint_filters.T;
                }
                csome_list_var = csome_list_var.rest();
                isa_constraint = csome_list_var.first();
            }
        }
        return rejectP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 4677L)
    public static SubLObject any_not_isaP(final SubLObject isa_constraints, final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)constraint_filters.NIL;
        if (constraint_filters.NIL == v_memoization_state) {
            return any_not_isaP_internal(isa_constraints, v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)constraint_filters.$sym9$ANY_NOT_ISA_, (SubLObject)constraint_filters.UNPROVIDED);
        if (constraint_filters.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)constraint_filters.$sym9$ANY_NOT_ISA_, (SubLObject)constraint_filters.THREE_INTEGER, (SubLObject)constraint_filters.NIL, (SubLObject)constraint_filters.EQUAL, (SubLObject)constraint_filters.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)constraint_filters.$sym9$ANY_NOT_ISA_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(isa_constraints, v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)constraint_filters.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)constraint_filters.NIL;
            collision = cdolist_list_var.first();
            while (constraint_filters.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (isa_constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (constraint_filters.NIL != cached_args && constraint_filters.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(any_not_isaP_internal(isa_constraints, v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(isa_constraints, v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 4918L)
    public static SubLObject any_not_quoted_isaP_internal(final SubLObject quoted_isa_constraints, final SubLObject v_term, final SubLObject mt) {
        SubLObject rejectP = (SubLObject)constraint_filters.NIL;
        if (constraint_filters.NIL == rejectP) {
            SubLObject csome_list_var = quoted_isa_constraints;
            SubLObject quoted_isa_constraint = (SubLObject)constraint_filters.NIL;
            quoted_isa_constraint = csome_list_var.first();
            while (constraint_filters.NIL == rejectP && constraint_filters.NIL != csome_list_var) {
                if (constraint_filters.NIL == at_defns.quiet_quoted_has_typeP(v_term, quoted_isa_constraint, mt)) {
                    rejectP = (SubLObject)constraint_filters.T;
                }
                csome_list_var = csome_list_var.rest();
                quoted_isa_constraint = csome_list_var.first();
            }
        }
        return rejectP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 4918L)
    public static SubLObject any_not_quoted_isaP(final SubLObject quoted_isa_constraints, final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)constraint_filters.NIL;
        if (constraint_filters.NIL == v_memoization_state) {
            return any_not_quoted_isaP_internal(quoted_isa_constraints, v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)constraint_filters.$sym10$ANY_NOT_QUOTED_ISA_, (SubLObject)constraint_filters.UNPROVIDED);
        if (constraint_filters.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)constraint_filters.$sym10$ANY_NOT_QUOTED_ISA_, (SubLObject)constraint_filters.THREE_INTEGER, (SubLObject)constraint_filters.NIL, (SubLObject)constraint_filters.EQUAL, (SubLObject)constraint_filters.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)constraint_filters.$sym10$ANY_NOT_QUOTED_ISA_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(quoted_isa_constraints, v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)constraint_filters.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)constraint_filters.NIL;
            collision = cdolist_list_var.first();
            while (constraint_filters.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (quoted_isa_constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (constraint_filters.NIL != cached_args && constraint_filters.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(any_not_quoted_isaP_internal(quoted_isa_constraints, v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(quoted_isa_constraints, v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 5210L)
    public static SubLObject any_defns_rejectP_internal(final SubLObject isa_constraints, final SubLObject substitution, final SubLObject mt) {
        SubLObject rejectP = (SubLObject)constraint_filters.NIL;
        if (constraint_filters.NIL == rejectP) {
            SubLObject csome_list_var;
            SubLObject isa_constraint;
            for (csome_list_var = isa_constraints, isa_constraint = (SubLObject)constraint_filters.NIL, isa_constraint = csome_list_var.first(); constraint_filters.NIL == rejectP && constraint_filters.NIL != csome_list_var; rejectP = at_defns.defns_rejectP(isa_constraint, substitution, mt), csome_list_var = csome_list_var.rest(), isa_constraint = csome_list_var.first()) {}
        }
        return rejectP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 5210L)
    public static SubLObject any_defns_rejectP(final SubLObject isa_constraints, final SubLObject substitution, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)constraint_filters.NIL;
        if (constraint_filters.NIL == v_memoization_state) {
            return any_defns_rejectP_internal(isa_constraints, substitution, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)constraint_filters.$sym11$ANY_DEFNS_REJECT_, (SubLObject)constraint_filters.UNPROVIDED);
        if (constraint_filters.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)constraint_filters.$sym11$ANY_DEFNS_REJECT_, (SubLObject)constraint_filters.THREE_INTEGER, (SubLObject)constraint_filters.NIL, (SubLObject)constraint_filters.EQUAL, (SubLObject)constraint_filters.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)constraint_filters.$sym11$ANY_DEFNS_REJECT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(isa_constraints, substitution, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)constraint_filters.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)constraint_filters.NIL;
            collision = cdolist_list_var.first();
            while (constraint_filters.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (isa_constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (substitution.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (constraint_filters.NIL != cached_args && constraint_filters.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(any_defns_rejectP_internal(isa_constraints, substitution, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(isa_constraints, substitution, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 5542L)
    public static SubLObject any_spec_ofP_internal(final SubLObject terms, final SubLObject genl, final SubLObject mt) {
        SubLObject result = (SubLObject)constraint_filters.NIL;
        if (constraint_filters.NIL == result) {
            SubLObject csome_list_var = terms;
            SubLObject v_term = (SubLObject)constraint_filters.NIL;
            v_term = csome_list_var.first();
            while (constraint_filters.NIL == result && constraint_filters.NIL != csome_list_var) {
                if (constraint_filters.NIL != genls.genlsP(v_term, genl, mt, (SubLObject)constraint_filters.UNPROVIDED)) {
                    result = (SubLObject)constraint_filters.T;
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 5542L)
    public static SubLObject any_spec_ofP(final SubLObject terms, final SubLObject genl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)constraint_filters.NIL;
        if (constraint_filters.NIL == v_memoization_state) {
            return any_spec_ofP_internal(terms, genl, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)constraint_filters.$sym12$ANY_SPEC_OF_, (SubLObject)constraint_filters.UNPROVIDED);
        if (constraint_filters.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)constraint_filters.$sym12$ANY_SPEC_OF_, (SubLObject)constraint_filters.THREE_INTEGER, (SubLObject)constraint_filters.NIL, (SubLObject)constraint_filters.EQUAL, (SubLObject)constraint_filters.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)constraint_filters.$sym12$ANY_SPEC_OF_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(terms, genl, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)constraint_filters.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)constraint_filters.NIL;
            collision = cdolist_list_var.first();
            while (constraint_filters.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (terms.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (constraint_filters.NIL != cached_args && constraint_filters.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(any_spec_ofP_internal(terms, genl, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(terms, genl, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 5825L)
    public static SubLObject formula_term_arg_constraints_internal(final SubLObject v_term, final SubLObject formula, final SubLObject mt) {
        final SubLObject var = czer_utilities.unique_el_var_wrt_expression(formula, (SubLObject)constraint_filters.UNPROVIDED);
        final SubLObject var_formula = cycl_utilities.expression_subst(var, v_term, formula, (SubLObject)constraint_filters.EQUALP, (SubLObject)constraint_filters.UNPROVIDED);
        final SubLObject constraint_dict = at_var_types.formula_variables_arg_constraints_dict(var_formula, mt, (SubLObject)constraint_filters.UNPROVIDED, (SubLObject)constraint_filters.UNPROVIDED);
        final SubLObject constraints = dictionary.dictionary_lookup(constraint_dict, var, (SubLObject)constraint_filters.UNPROVIDED);
        if (constraint_filters.NIL != constraints) {
            SubLObject current;
            final SubLObject datum = current = constraints;
            SubLObject isa_constraints = (SubLObject)constraint_filters.NIL;
            SubLObject genls_constraints = (SubLObject)constraint_filters.NIL;
            SubLObject quoted_isa_constraints = (SubLObject)constraint_filters.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constraint_filters.$list14);
            isa_constraints = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constraint_filters.$list14);
            genls_constraints = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constraint_filters.$list14);
            quoted_isa_constraints = current.first();
            current = current.rest();
            if (constraint_filters.NIL == current) {
                return Values.values(Sequences.remove_if((SubLObject)constraint_filters.$sym15$QUOTED_COLLECTION_, isa_constraints, (SubLObject)constraint_filters.UNPROVIDED, (SubLObject)constraint_filters.UNPROVIDED, (SubLObject)constraint_filters.UNPROVIDED, (SubLObject)constraint_filters.UNPROVIDED), Sequences.remove_if((SubLObject)constraint_filters.$sym15$QUOTED_COLLECTION_, genls_constraints, (SubLObject)constraint_filters.UNPROVIDED, (SubLObject)constraint_filters.UNPROVIDED, (SubLObject)constraint_filters.UNPROVIDED, (SubLObject)constraint_filters.UNPROVIDED), quoted_isa_constraints);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constraint_filters.$list14);
        }
        return Values.values((SubLObject)constraint_filters.NIL, (SubLObject)constraint_filters.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constraint-filters.lisp", position = 5825L)
    public static SubLObject formula_term_arg_constraints(final SubLObject v_term, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)constraint_filters.NIL;
        if (constraint_filters.NIL == v_memoization_state) {
            return formula_term_arg_constraints_internal(v_term, formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)constraint_filters.$sym13$FORMULA_TERM_ARG_CONSTRAINTS, (SubLObject)constraint_filters.UNPROVIDED);
        if (constraint_filters.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)constraint_filters.$sym13$FORMULA_TERM_ARG_CONSTRAINTS, (SubLObject)constraint_filters.THREE_INTEGER, (SubLObject)constraint_filters.NIL, (SubLObject)constraint_filters.EQUAL, (SubLObject)constraint_filters.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)constraint_filters.$sym13$FORMULA_TERM_ARG_CONSTRAINTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)constraint_filters.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)constraint_filters.NIL;
            collision = cdolist_list_var.first();
            while (constraint_filters.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (formula.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (constraint_filters.NIL != cached_args && constraint_filters.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(formula_term_arg_constraints_internal(v_term, formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, formula, mt));
        return memoization_state.caching_results(results3);
    }
    
    public static SubLObject declare_constraint_filters_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "filter_terms_by_constraining_collection", "FILTER-TERMS-BY-CONSTRAINING-COLLECTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "filter_terms_for_arg_constraints_at_argpos", "FILTER-TERMS-FOR-ARG-CONSTRAINTS-AT-ARGPOS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "filter_terms_for_arg_constraints", "FILTER-TERMS-FOR-ARG-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "constraint_filter_min_isa_internal", "CONSTRAINT-FILTER-MIN-ISA-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "constraint_filter_min_isa", "CONSTRAINT-FILTER-MIN-ISA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "any_not_isaP_internal", "ANY-NOT-ISA?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "any_not_isaP", "ANY-NOT-ISA?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "any_not_quoted_isaP_internal", "ANY-NOT-QUOTED-ISA?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "any_not_quoted_isaP", "ANY-NOT-QUOTED-ISA?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "any_defns_rejectP_internal", "ANY-DEFNS-REJECT?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "any_defns_rejectP", "ANY-DEFNS-REJECT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "any_spec_ofP_internal", "ANY-SPEC-OF?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "any_spec_ofP", "ANY-SPEC-OF?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "formula_term_arg_constraints_internal", "FORMULA-TERM-ARG-CONSTRAINTS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constraint_filters", "formula_term_arg_constraints", "FORMULA-TERM-ARG-CONSTRAINTS", 3, 0, false);
        return (SubLObject)constraint_filters.NIL;
    }
    
    public static SubLObject init_constraint_filters_file() {
        return (SubLObject)constraint_filters.NIL;
    }
    
    public static SubLObject setup_constraint_filters_file() {
        access_macros.register_external_symbol((SubLObject)constraint_filters.$sym1$FILTER_TERMS_FOR_ARG_CONSTRAINTS_AT_ARGPOS);
        access_macros.register_external_symbol((SubLObject)constraint_filters.$sym2$FILTER_TERMS_FOR_ARG_CONSTRAINTS);
        memoization_state.note_memoized_function((SubLObject)constraint_filters.$sym7$CONSTRAINT_FILTER_MIN_ISA);
        memoization_state.note_memoized_function((SubLObject)constraint_filters.$sym9$ANY_NOT_ISA_);
        memoization_state.note_memoized_function((SubLObject)constraint_filters.$sym10$ANY_NOT_QUOTED_ISA_);
        memoization_state.note_memoized_function((SubLObject)constraint_filters.$sym11$ANY_DEFNS_REJECT_);
        memoization_state.note_memoized_function((SubLObject)constraint_filters.$sym12$ANY_SPEC_OF_);
        memoization_state.note_memoized_function((SubLObject)constraint_filters.$sym13$FORMULA_TERM_ARG_CONSTRAINTS);
        generic_testing.define_test_case_table_int((SubLObject)constraint_filters.$sym16$CONSTRAINED_CYCL_FILTER, (SubLObject)ConsesLow.list(new SubLObject[] { constraint_filters.$kw17$TEST, constraint_filters.NIL, constraint_filters.$kw18$OWNER, constraint_filters.NIL, constraint_filters.$kw19$CLASSES, constraint_filters.NIL, constraint_filters.$kw20$KB, constraint_filters.$kw21$FULL, constraint_filters.$kw22$WORKING_, constraint_filters.T }), (SubLObject)constraint_filters.$list23);
        generic_testing.define_test_case_table_int((SubLObject)constraint_filters.$sym2$FILTER_TERMS_FOR_ARG_CONSTRAINTS, (SubLObject)ConsesLow.list(new SubLObject[] { constraint_filters.$kw17$TEST, constraint_filters.$sym24$SETS_EQUALP, constraint_filters.$kw18$OWNER, constraint_filters.NIL, constraint_filters.$kw19$CLASSES, constraint_filters.NIL, constraint_filters.$kw20$KB, constraint_filters.$kw21$FULL, constraint_filters.$kw22$WORKING_, constraint_filters.T }), (SubLObject)constraint_filters.$list25);
        return (SubLObject)constraint_filters.NIL;
    }
    
    public void declareFunctions() {
        declare_constraint_filters_file();
    }
    
    public void initializeVariables() {
        init_constraint_filters_file();
    }
    
    public void runTopLevelForms() {
        setup_constraint_filters_file();
    }
    
    static {
        me = (SubLFile)new constraint_filters();
        $sym0$FORT_OR_CHLMT_P = SubLObjectFactory.makeSymbol("FORT-OR-CHLMT-P");
        $sym1$FILTER_TERMS_FOR_ARG_CONSTRAINTS_AT_ARGPOS = SubLObjectFactory.makeSymbol("FILTER-TERMS-FOR-ARG-CONSTRAINTS-AT-ARGPOS");
        $sym2$FILTER_TERMS_FOR_ARG_CONSTRAINTS = SubLObjectFactory.makeSymbol("FILTER-TERMS-FOR-ARG-CONSTRAINTS");
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")));
        $const4$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const5$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $const6$Date = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"));
        $sym7$CONSTRAINT_FILTER_MIN_ISA = SubLObjectFactory.makeSymbol("CONSTRAINT-FILTER-MIN-ISA");
        $const8$Number_General = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-General"));
        $sym9$ANY_NOT_ISA_ = SubLObjectFactory.makeSymbol("ANY-NOT-ISA?");
        $sym10$ANY_NOT_QUOTED_ISA_ = SubLObjectFactory.makeSymbol("ANY-NOT-QUOTED-ISA?");
        $sym11$ANY_DEFNS_REJECT_ = SubLObjectFactory.makeSymbol("ANY-DEFNS-REJECT?");
        $sym12$ANY_SPEC_OF_ = SubLObjectFactory.makeSymbol("ANY-SPEC-OF?");
        $sym13$FORMULA_TERM_ARG_CONSTRAINTS = SubLObjectFactory.makeSymbol("FORMULA-TERM-ARG-CONSTRAINTS");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS-CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTED-ISA-CONSTRAINTS"));
        $sym15$QUOTED_COLLECTION_ = SubLObjectFactory.makeSymbol("QUOTED-COLLECTION?");
        $sym16$CONSTRAINED_CYCL_FILTER = SubLObjectFactory.makeSymbol("CONSTRAINED-CYCL-FILTER");
        $kw17$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw18$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw19$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw20$KB = SubLObjectFactory.makeKeyword("KB");
        $kw21$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw22$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000)), (SubLObject)SubLObjectFactory.makeInteger(2000)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallyBetween")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?EARLIER"), (SubLObject)SubLObjectFactory.makeSymbol("?LATER")), (SubLObject)ConsesLow.list((SubLObject)constraint_filters.TWO_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)SubLObjectFactory.makeSymbol("FILTER-CONSTRAINED-CYCLS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000)))));
        $sym24$SETS_EQUALP = SubLObjectFactory.makeSymbol("SETS-EQUALP");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("is-Underspecified")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarmelBird-Author")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LarryBird")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bird")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BirdWatching")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BirdWatching")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bird")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("is-Underspecified")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarmelBird-Author")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LarryBird")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bird")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BirdWatching")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarmelBird-Author")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LarryBird")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bird")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BirdWatching")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cityInState")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BillingsMustangs-BaseballTeam")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), (SubLObject)SubLObjectFactory.makeString("Billings"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Montana-State"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), (SubLObject)SubLObjectFactory.makeString("Billings"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Montana-State"))))));
    }
}

/*

	Total time: 299 ms
	
*/