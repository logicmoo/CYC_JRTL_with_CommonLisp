/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONSTRAINT-FILTERS
 * source file: /cyc/top/cycl/constraint-filters.lisp
 * created:     2019/07/03 17:38:14
 */
public final class constraint_filters extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new constraint_filters();

 public static final String myName = "com.cyc.cycjava.cycl.constraint_filters";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol FORT_OR_CHLMT_P = makeSymbol("FORT-OR-CHLMT-P");

    private static final SubLSymbol FILTER_TERMS_FOR_ARG_CONSTRAINTS_AT_ARGPOS = makeSymbol("FILTER-TERMS-FOR-ARG-CONSTRAINTS-AT-ARGPOS");

    private static final SubLSymbol FILTER_TERMS_FOR_ARG_CONSTRAINTS = makeSymbol("FILTER-TERMS-FOR-ARG-CONSTRAINTS");

    static private final SubLList $list3 = list(reader_make_constant_shell("InferencePSC"), reader_make_constant_shell("EverythingPSC"));







    private static final SubLSymbol CONSTRAINT_FILTER_MIN_ISA = makeSymbol("CONSTRAINT-FILTER-MIN-ISA");

    private static final SubLObject $$Number_General = reader_make_constant_shell("Number-General");

    private static final SubLSymbol $sym9$ANY_NOT_ISA_ = makeSymbol("ANY-NOT-ISA?");

    private static final SubLSymbol $sym10$ANY_NOT_QUOTED_ISA_ = makeSymbol("ANY-NOT-QUOTED-ISA?");

    private static final SubLSymbol $sym11$ANY_DEFNS_REJECT_ = makeSymbol("ANY-DEFNS-REJECT?");

    private static final SubLSymbol $sym12$ANY_SPEC_OF_ = makeSymbol("ANY-SPEC-OF?");

    private static final SubLSymbol FORMULA_TERM_ARG_CONSTRAINTS = makeSymbol("FORMULA-TERM-ARG-CONSTRAINTS");

    private static final SubLList $list14 = list(makeSymbol("ISA-CONSTRAINTS"), makeSymbol("GENLS-CONSTRAINTS"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));

    private static final SubLSymbol $sym15$QUOTED_COLLECTION_ = makeSymbol("QUOTED-COLLECTION?");

    private static final SubLSymbol CONSTRAINED_CYCL_FILTER = makeSymbol("CONSTRAINED-CYCL-FILTER");

    private static final SubLList $list23 = list(list(list(list(list(reader_make_constant_shell("YearFn"), makeInteger(2000)), makeInteger(2000)), list(reader_make_constant_shell("temporallyBetween"), makeSymbol("?EVENT"), makeSymbol("?EARLIER"), makeSymbol("?LATER")), list(TWO_INTEGER), reader_make_constant_shell("Thing"), reader_make_constant_shell("TKBSourceSpindleCollectorMt"), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(list(reader_make_constant_shell("YearFn"), makeInteger(2000)))));

    private static final SubLSymbol SETS_EQUALP = makeSymbol("SETS-EQUALP");

    static private final SubLList $list25 = list(list(list(makeSymbol("?Y"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("is-Underspecified"), makeSymbol("?X"), makeSymbol("?Y"))), reader_make_constant_shell("InferencePSC"), list(reader_make_constant_shell("CarmelBird-Author"), reader_make_constant_shell("LarryBird"), reader_make_constant_shell("Bird"), reader_make_constant_shell("BirdWatching"))), list(reader_make_constant_shell("BirdWatching"), reader_make_constant_shell("Bird"))), list(list(makeSymbol("?Y"), list(reader_make_constant_shell("is-Underspecified"), makeSymbol("?X"), makeSymbol("?Y")), reader_make_constant_shell("InferencePSC"), list(reader_make_constant_shell("CarmelBird-Author"), reader_make_constant_shell("LarryBird"), reader_make_constant_shell("Bird"), reader_make_constant_shell("BirdWatching"))), list(reader_make_constant_shell("CarmelBird-Author"), reader_make_constant_shell("LarryBird"), reader_make_constant_shell("Bird"), reader_make_constant_shell("BirdWatching"))), list(list(makeSymbol("?X"), list(reader_make_constant_shell("cityInState"), makeSymbol("?X"), makeSymbol("?Y")), reader_make_constant_shell("InferencePSC"), list(reader_make_constant_shell("BillingsMustangs-BaseballTeam"), list(reader_make_constant_shell("CityNamedFn"), makeString("Billings"), reader_make_constant_shell("Montana-State")))), list(list(reader_make_constant_shell("CityNamedFn"), makeString("Billings"), reader_make_constant_shell("Montana-State")))));

    // Definitions
    /**
     * Return TERMS minus any element that is not an instance of CONSTRAINING-COLLECTION in MT.
     * It's like @xref ALL-INSTANCES-AMONG, but can handle non-forts.
     */
    @LispMethod(comment = "Return TERMS minus any element that is not an instance of CONSTRAINING-COLLECTION in MT.\r\nIt\'s like @xref ALL-INSTANCES-AMONG, but can handle non-forts.\nReturn TERMS minus any element that is not an instance of CONSTRAINING-COLLECTION in MT.\nIt\'s like @xref ALL-INSTANCES-AMONG, but can handle non-forts.")
    public static final SubLObject filter_terms_by_constraining_collection_alt(SubLObject constraining_collection, SubLObject mt, SubLObject terms) {
        if ((NIL != hlmt.fort_or_chlmt_p(constraining_collection)) && (NIL != list_utilities.list_of_type_p(symbol_function(FORT_OR_CHLMT_P), terms))) {
            return isa.all_instances_among(constraining_collection, terms, mt, UNPROVIDED);
        } else {
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    if (NIL != lexicon_accessors.denot_has_typeP(v_term, constraining_collection, mt)) {
                        result = cons(v_term, result);
                    }
                }
                return nreverse(result);
            }
        }
    }

    // Definitions
    /**
     * Return TERMS minus any element that is not an instance of CONSTRAINING-COLLECTION in MT.
     * It's like @xref ALL-INSTANCES-AMONG, but can handle non-forts.
     */
    @LispMethod(comment = "Return TERMS minus any element that is not an instance of CONSTRAINING-COLLECTION in MT.\r\nIt\'s like @xref ALL-INSTANCES-AMONG, but can handle non-forts.\nReturn TERMS minus any element that is not an instance of CONSTRAINING-COLLECTION in MT.\nIt\'s like @xref ALL-INSTANCES-AMONG, but can handle non-forts.")
    public static SubLObject filter_terms_by_constraining_collection(final SubLObject constraining_collection, final SubLObject mt, final SubLObject terms) {
        if ((NIL != hlmt.fort_or_chlmt_p(constraining_collection)) && (NIL != list_utilities.list_of_type_p(symbol_function(FORT_OR_CHLMT_P), terms))) {
            return isa.all_instances_among(constraining_collection, terms, mt, UNPROVIDED);
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != lexicon_accessors.denot_has_typeP(v_term, constraining_collection, mt)) {
                result = cons(v_term, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * determine which members of POSSIBLE-SUBSTITUTIONS could be used in ARG-POSITION in FORMULA
     *
     * @param ARG-POSITION
    arg-position-p
     * 		
     * @param FORMULA
    el-formula-p
     * 		
     * @param MT
    hlmt-p
     * 		
     * @param POSSIBLE-SUBSTITUTIONS
     * 		listp of cycl terms
     * @param USE-ALL-MENTIONS?
     * 		boolean; should all instances of the term at ARG-POSITION be used when determining constraints?
     * @unknown the nil value of USE-ALL-MENTIONS? is not presently supported
     */
    @LispMethod(comment = "determine which members of POSSIBLE-SUBSTITUTIONS could be used in ARG-POSITION in FORMULA\r\n\r\n@param ARG-POSITION\narg-position-p\r\n\t\t\r\n@param FORMULA\nel-formula-p\r\n\t\t\r\n@param MT\nhlmt-p\r\n\t\t\r\n@param POSSIBLE-SUBSTITUTIONS\r\n\t\tlistp of cycl terms\r\n@param USE-ALL-MENTIONS?\r\n\t\tboolean; should all instances of the term at ARG-POSITION be used when determining constraints?\r\n@unknown the nil value of USE-ALL-MENTIONS? is not presently supported")
    public static final SubLObject filter_terms_for_arg_constraints_at_argpos_alt(SubLObject arg_position, SubLObject formula, SubLObject mt, SubLObject possible_substitutions, SubLObject use_all_mentionsP) {
        if (use_all_mentionsP == UNPROVIDED) {
            use_all_mentionsP = T;
        }
        return com.cyc.cycjava.cycl.constraint_filters.filter_terms_for_arg_constraints(cycl_utilities.formula_arg_position(formula, arg_position, UNPROVIDED), formula, mt, possible_substitutions);
    }

    /**
     * determine which members of POSSIBLE-SUBSTITUTIONS could be used in ARG-POSITION in FORMULA
     *
     * @param ARG-POSITION
    		arg-position-p
     * 		
     * @param FORMULA
    		el-formula-p
     * 		
     * @param MT
    		hlmt-p
     * 		
     * @param POSSIBLE-SUBSTITUTIONS
     * 		listp of cycl terms
     * @param USE-ALL-MENTIONS?
     * 		boolean; should all instances of the term at ARG-POSITION be used when determining constraints?
     * @unknown the nil value of USE-ALL-MENTIONS? is not presently supported
     */
    @LispMethod(comment = "determine which members of POSSIBLE-SUBSTITUTIONS could be used in ARG-POSITION in FORMULA\r\n\r\n@param ARG-POSITION\n\t\targ-position-p\r\n\t\t\r\n@param FORMULA\n\t\tel-formula-p\r\n\t\t\r\n@param MT\n\t\thlmt-p\r\n\t\t\r\n@param POSSIBLE-SUBSTITUTIONS\r\n\t\tlistp of cycl terms\r\n@param USE-ALL-MENTIONS?\r\n\t\tboolean; should all instances of the term at ARG-POSITION be used when determining constraints?\r\n@unknown the nil value of USE-ALL-MENTIONS? is not presently supported")
    public static SubLObject filter_terms_for_arg_constraints_at_argpos(final SubLObject arg_position, final SubLObject formula, final SubLObject mt, final SubLObject possible_substitutions, SubLObject use_all_mentionsP) {
        if (use_all_mentionsP == UNPROVIDED) {
            use_all_mentionsP = T;
        }
        return filter_terms_for_arg_constraints(cycl_utilities.formula_arg_position(formula, arg_position, UNPROVIDED), formula, mt, possible_substitutions);
    }

    /**
     * determine which members of POSSIBLE-SUBSTITUTIONS could be used in place of TERM in FORMULA
     *
     * @param TERM
     * 		cycl term present in FORMULA
     * @param FORMULA
    el-formula-p
     * 		
     * @param MT
    hlmt-p
     * 		
     * @param POSSIBLE-SUBSTITUTIONS
     * 		listp of cycl terms
     * @unknown in the interests of speed, this function uses disjointness for filtering--a more thorough version would ask if the
    negation could be proved.
     */
    @LispMethod(comment = "determine which members of POSSIBLE-SUBSTITUTIONS could be used in place of TERM in FORMULA\r\n\r\n@param TERM\r\n\t\tcycl term present in FORMULA\r\n@param FORMULA\nel-formula-p\r\n\t\t\r\n@param MT\nhlmt-p\r\n\t\t\r\n@param POSSIBLE-SUBSTITUTIONS\r\n\t\tlistp of cycl terms\r\n@unknown in the interests of speed, this function uses disjointness for filtering--a more thorough version would ask if the\r\nnegation could be proved.")
    public static final SubLObject filter_terms_for_arg_constraints_alt(SubLObject v_term, SubLObject formula, SubLObject mt, SubLObject possible_substitutions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject filtered = NIL;
                SubLObject subst_requires_individualP = NIL;
                SubLObject disjointness_check_mt = (NIL != subl_promotions.memberP(mt, $list_alt3, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($$BaseKB)) : mt;
                thread.resetMultipleValues();
                {
                    SubLObject isa_constraints = com.cyc.cycjava.cycl.constraint_filters.formula_term_arg_constraints(v_term, formula, mt);
                    SubLObject genls_constraints = thread.secondMultipleValue();
                    SubLObject quoted_isa_constraints = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    subst_requires_individualP = com.cyc.cycjava.cycl.constraint_filters.any_spec_ofP(isa_constraints, $$Individual, mt);
                    {
                        SubLObject cdolist_list_var = possible_substitutions;
                        SubLObject substitution = NIL;
                        for (substitution = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , substitution = cdolist_list_var.first()) {
                            if ((NIL != subst_requires_individualP) && (NIL != fort_types_interface.isa_collectionP(substitution, UNPROVIDED))) {
                                filtered = cons(substitution, filtered);
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.constraint_filters.any_defns_rejectP(isa_constraints, substitution, mt)) {
                                    filtered = cons(substitution, filtered);
                                } else {
                                    if (NIL != disjoint_with.any_disjoint_with_anyP(genls_constraints, genls.min_genls(substitution, mt, UNPROVIDED), disjointness_check_mt, UNPROVIDED)) {
                                        filtered = cons(substitution, filtered);
                                    } else {
                                        if ((NIL != com.cyc.cycjava.cycl.constraint_filters.any_spec_ofP(isa_constraints, $$Date, mt)) && (NIL == date_utilities.date_p(substitution))) {
                                            filtered = cons(substitution, filtered);
                                        } else {
                                            if ((NIL == isa.isa_anyP(substitution, isa_constraints, mt, UNPROVIDED)) && ((NIL != disjoint_with.any_disjoint_with_anyP(isa_constraints, com.cyc.cycjava.cycl.constraint_filters.constraint_filter_min_isa(substitution, mt), disjointness_check_mt, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.constraint_filters.any_not_isaP(isa_constraints, substitution, mt)))) {
                                                filtered = cons(substitution, filtered);
                                            } else {
                                                if (NIL != com.cyc.cycjava.cycl.constraint_filters.any_not_quoted_isaP(quoted_isa_constraints, substitution, mt)) {
                                                    filtered = cons(substitution, filtered);
                                                } else {
                                                    result = cons(substitution, result);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(result, filtered);
            }
        }
    }

    /**
     * determine which members of POSSIBLE-SUBSTITUTIONS could be used in place of TERM in FORMULA
     *
     * @param TERM
     * 		cycl term present in FORMULA
     * @param FORMULA
    		el-formula-p
     * 		
     * @param MT
    		hlmt-p
     * 		
     * @param POSSIBLE-SUBSTITUTIONS
     * 		listp of cycl terms
     * @unknown in the interests of speed, this function uses disjointness for filtering--a more thorough version would ask if the
    negation could be proved.
     */
    @LispMethod(comment = "determine which members of POSSIBLE-SUBSTITUTIONS could be used in place of TERM in FORMULA\r\n\r\n@param TERM\r\n\t\tcycl term present in FORMULA\r\n@param FORMULA\n\t\tel-formula-p\r\n\t\t\r\n@param MT\n\t\thlmt-p\r\n\t\t\r\n@param POSSIBLE-SUBSTITUTIONS\r\n\t\tlistp of cycl terms\r\n@unknown in the interests of speed, this function uses disjointness for filtering--a more thorough version would ask if the\r\nnegation could be proved.")
    public static SubLObject filter_terms_for_arg_constraints(final SubLObject v_term, final SubLObject formula, final SubLObject mt, final SubLObject possible_substitutions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject filtered = NIL;
        SubLObject subst_requires_individualP = NIL;
        final SubLObject disjointness_check_mt = (NIL != subl_promotions.memberP(mt, $list3, UNPROVIDED, UNPROVIDED)) ? $$BaseKB : mt;
        thread.resetMultipleValues();
        final SubLObject isa_constraints = formula_term_arg_constraints(v_term, formula, mt);
        final SubLObject genls_constraints = thread.secondMultipleValue();
        final SubLObject quoted_isa_constraints = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        subst_requires_individualP = any_spec_ofP(isa_constraints, $$Individual, mt);
        SubLObject cdolist_list_var = possible_substitutions;
        SubLObject substitution = NIL;
        substitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != subst_requires_individualP) && (NIL != fort_types_interface.isa_collectionP(substitution, UNPROVIDED))) {
                filtered = cons(substitution, filtered);
            } else
                if (NIL != any_defns_rejectP(isa_constraints, substitution, mt)) {
                    filtered = cons(substitution, filtered);
                } else
                    if (NIL != disjoint_with.any_disjoint_with_anyP(genls_constraints, genls.min_genls(substitution, mt, UNPROVIDED), disjointness_check_mt, UNPROVIDED, UNPROVIDED)) {
                        filtered = cons(substitution, filtered);
                    } else
                        if ((NIL != any_spec_ofP(isa_constraints, $$Date, mt)) && (NIL == date_utilities.date_p(substitution))) {
                            filtered = cons(substitution, filtered);
                        } else
                            if ((NIL == isa.isa_allP(substitution, isa_constraints, mt)) && ((NIL != disjoint_with.any_disjoint_with_anyP(isa_constraints, constraint_filter_min_isa(substitution, mt), disjointness_check_mt, UNPROVIDED, UNPROVIDED)) || (NIL != any_not_isaP(isa_constraints, substitution, mt)))) {
                                filtered = cons(substitution, filtered);
                            } else
                                if (NIL != any_not_quoted_isaP(quoted_isa_constraints, substitution, mt)) {
                                    filtered = cons(substitution, filtered);
                                } else {
                                    result = cons(substitution, result);
                                }





            cdolist_list_var = cdolist_list_var.rest();
            substitution = cdolist_list_var.first();
        } 
        return values(nreverse(result), nreverse(filtered));
    }

    /**
     * This function is a @hack to get around the fact that Cyc doesn't do any removals for non-indexed terms like numbers
     * or strings (e.g. that it returns no answers for (#$isa 2000 ?X)).
     */
    @LispMethod(comment = "This function is a @hack to get around the fact that Cyc doesn\'t do any removals for non-indexed terms like numbers\r\nor strings (e.g. that it returns no answers for (#$isa 2000 ?X)).\nThis function is a @hack to get around the fact that Cyc doesn\'t do any removals for non-indexed terms like numbers\nor strings (e.g. that it returns no answers for (#$isa 2000 ?X)).")
    public static final SubLObject constraint_filter_min_isa_internal_alt(SubLObject v_term, SubLObject mt) {
        {
            SubLObject result = isa.min_isa(v_term, mt, UNPROVIDED);
            if ((NIL == result) && v_term.isNumber()) {
                result = list($$Number_General);
            }
            return result;
        }
    }

    /**
     * This function is a @hack to get around the fact that Cyc doesn't do any removals for non-indexed terms like numbers
     * or strings (e.g. that it returns no answers for (#$isa 2000 ?X)).
     */
    @LispMethod(comment = "This function is a @hack to get around the fact that Cyc doesn\'t do any removals for non-indexed terms like numbers\r\nor strings (e.g. that it returns no answers for (#$isa 2000 ?X)).\nThis function is a @hack to get around the fact that Cyc doesn\'t do any removals for non-indexed terms like numbers\nor strings (e.g. that it returns no answers for (#$isa 2000 ?X)).")
    public static SubLObject constraint_filter_min_isa_internal(final SubLObject v_term, final SubLObject mt) {
        SubLObject result = isa.min_isa(v_term, mt, UNPROVIDED);
        if ((NIL == result) && v_term.isNumber()) {
            result = list($$Number_General);
        }
        return result;
    }

    public static final SubLObject constraint_filter_min_isa_alt(SubLObject v_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.constraint_filters.constraint_filter_min_isa_internal(v_term, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CONSTRAINT_FILTER_MIN_ISA, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CONSTRAINT_FILTER_MIN_ISA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, CONSTRAINT_FILTER_MIN_ISA, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.constraint_filters.constraint_filter_min_isa_internal(v_term, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject constraint_filter_min_isa(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return constraint_filter_min_isa_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CONSTRAINT_FILTER_MIN_ISA, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CONSTRAINT_FILTER_MIN_ISA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CONSTRAINT_FILTER_MIN_ISA, caching_state);
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(constraint_filter_min_isa_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject any_not_isaP_internal_alt(SubLObject isa_constraints, SubLObject v_term, SubLObject mt) {
        {
            SubLObject rejectP = NIL;
            if (NIL == rejectP) {
                {
                    SubLObject csome_list_var = isa_constraints;
                    SubLObject isa_constraint = NIL;
                    for (isa_constraint = csome_list_var.first(); !((NIL != rejectP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , isa_constraint = csome_list_var.first()) {
                        if (NIL != isa.not_isaP(v_term, isa_constraint, mt, UNPROVIDED)) {
                            rejectP = T;
                        }
                    }
                }
            }
            return rejectP;
        }
    }

    public static SubLObject any_not_isaP_internal(final SubLObject isa_constraints, final SubLObject v_term, final SubLObject mt) {
        SubLObject rejectP = NIL;
        if (NIL == rejectP) {
            SubLObject csome_list_var = isa_constraints;
            SubLObject isa_constraint = NIL;
            isa_constraint = csome_list_var.first();
            while ((NIL == rejectP) && (NIL != csome_list_var)) {
                if (NIL != isa.not_isaP(v_term, isa_constraint, mt, UNPROVIDED)) {
                    rejectP = T;
                }
                csome_list_var = csome_list_var.rest();
                isa_constraint = csome_list_var.first();
            } 
        }
        return rejectP;
    }

    public static final SubLObject any_not_isaP_alt(SubLObject isa_constraints, SubLObject v_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.constraint_filters.any_not_isaP_internal(isa_constraints, v_term, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym10$ANY_NOT_ISA_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym10$ANY_NOT_ISA_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym10$ANY_NOT_ISA_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(isa_constraints, v_term, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (isa_constraints.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (v_term.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.constraint_filters.any_not_isaP_internal(isa_constraints, v_term, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(isa_constraints, v_term, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject any_not_isaP(final SubLObject isa_constraints, final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_not_isaP_internal(isa_constraints, v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym9$ANY_NOT_ISA_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym9$ANY_NOT_ISA_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym9$ANY_NOT_ISA_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(isa_constraints, v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (isa_constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(any_not_isaP_internal(isa_constraints, v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(isa_constraints, v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject any_not_quoted_isaP_internal_alt(SubLObject quoted_isa_constraints, SubLObject v_term, SubLObject mt) {
        {
            SubLObject rejectP = NIL;
            if (NIL == rejectP) {
                {
                    SubLObject csome_list_var = quoted_isa_constraints;
                    SubLObject quoted_isa_constraint = NIL;
                    for (quoted_isa_constraint = csome_list_var.first(); !((NIL != rejectP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , quoted_isa_constraint = csome_list_var.first()) {
                        if (NIL == at_defns.quiet_quoted_has_typeP(v_term, quoted_isa_constraint, mt)) {
                            rejectP = T;
                        }
                    }
                }
            }
            return rejectP;
        }
    }

    public static SubLObject any_not_quoted_isaP_internal(final SubLObject quoted_isa_constraints, final SubLObject v_term, final SubLObject mt) {
        SubLObject rejectP = NIL;
        if (NIL == rejectP) {
            SubLObject csome_list_var = quoted_isa_constraints;
            SubLObject quoted_isa_constraint = NIL;
            quoted_isa_constraint = csome_list_var.first();
            while ((NIL == rejectP) && (NIL != csome_list_var)) {
                if (NIL == at_defns.quiet_quoted_has_typeP(v_term, quoted_isa_constraint, mt)) {
                    rejectP = T;
                }
                csome_list_var = csome_list_var.rest();
                quoted_isa_constraint = csome_list_var.first();
            } 
        }
        return rejectP;
    }

    public static final SubLObject any_not_quoted_isaP_alt(SubLObject quoted_isa_constraints, SubLObject v_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.constraint_filters.any_not_quoted_isaP_internal(quoted_isa_constraints, v_term, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym11$ANY_NOT_QUOTED_ISA_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym11$ANY_NOT_QUOTED_ISA_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym11$ANY_NOT_QUOTED_ISA_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(quoted_isa_constraints, v_term, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (quoted_isa_constraints.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (v_term.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.constraint_filters.any_not_quoted_isaP_internal(quoted_isa_constraints, v_term, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(quoted_isa_constraints, v_term, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject any_not_quoted_isaP(final SubLObject quoted_isa_constraints, final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_not_quoted_isaP_internal(quoted_isa_constraints, v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym10$ANY_NOT_QUOTED_ISA_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym10$ANY_NOT_QUOTED_ISA_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym10$ANY_NOT_QUOTED_ISA_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(quoted_isa_constraints, v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (quoted_isa_constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(any_not_quoted_isaP_internal(quoted_isa_constraints, v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(quoted_isa_constraints, v_term, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return BOOLEANP; Do any defns on ISA-CONSTRAINTS reject SUBSTITUTION in MT?
     */
    @LispMethod(comment = "@return BOOLEANP; Do any defns on ISA-CONSTRAINTS reject SUBSTITUTION in MT?")
    public static final SubLObject any_defns_rejectP_internal_alt(SubLObject isa_constraints, SubLObject substitution, SubLObject mt) {
        {
            SubLObject rejectP = NIL;
            if (NIL == rejectP) {
                {
                    SubLObject csome_list_var = isa_constraints;
                    SubLObject isa_constraint = NIL;
                    for (isa_constraint = csome_list_var.first(); !((NIL != rejectP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , isa_constraint = csome_list_var.first()) {
                        rejectP = at_defns.defns_rejectP(isa_constraint, substitution, mt);
                    }
                }
            }
            return rejectP;
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Do any defns on ISA-CONSTRAINTS reject SUBSTITUTION in MT?
     */
    @LispMethod(comment = "@return BOOLEANP; Do any defns on ISA-CONSTRAINTS reject SUBSTITUTION in MT?")
    public static SubLObject any_defns_rejectP_internal(final SubLObject isa_constraints, final SubLObject substitution, final SubLObject mt) {
        SubLObject rejectP = NIL;
        if (NIL == rejectP) {
            SubLObject csome_list_var;
            SubLObject isa_constraint;
            for (csome_list_var = isa_constraints, isa_constraint = NIL, isa_constraint = csome_list_var.first(); (NIL == rejectP) && (NIL != csome_list_var); rejectP = at_defns.defns_rejectP(isa_constraint, substitution, mt) , csome_list_var = csome_list_var.rest() , isa_constraint = csome_list_var.first()) {
            }
        }
        return rejectP;
    }

    public static final SubLObject any_defns_rejectP_alt(SubLObject isa_constraints, SubLObject substitution, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.constraint_filters.any_defns_rejectP_internal(isa_constraints, substitution, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym12$ANY_DEFNS_REJECT_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym12$ANY_DEFNS_REJECT_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym12$ANY_DEFNS_REJECT_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(isa_constraints, substitution, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (isa_constraints.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (substitution.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.constraint_filters.any_defns_rejectP_internal(isa_constraints, substitution, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(isa_constraints, substitution, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject any_defns_rejectP(final SubLObject isa_constraints, final SubLObject substitution, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_defns_rejectP_internal(isa_constraints, substitution, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym11$ANY_DEFNS_REJECT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym11$ANY_DEFNS_REJECT_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym11$ANY_DEFNS_REJECT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(isa_constraints, substitution, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (isa_constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (substitution.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(any_defns_rejectP_internal(isa_constraints, substitution, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(isa_constraints, substitution, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * is any member of TERMS a spec of #$Individual?
     *
     * @param TERMS
    listp
     * 		
     * @param MT
    hlmt-p
     * 		
     */
    @LispMethod(comment = "is any member of TERMS a spec of #$Individual?\r\n\r\n@param TERMS\nlistp\r\n\t\t\r\n@param MT\nhlmt-p")
    public static final SubLObject any_spec_ofP_internal_alt(SubLObject terms, SubLObject genl, SubLObject mt) {
        {
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = terms;
                    SubLObject v_term = NIL;
                    for (v_term = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                        if (NIL != genls.genlsP(v_term, genl, mt, UNPROVIDED)) {
                            result = T;
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "is any member of TERMS a spec of #$Individual?\r\n\r\n@param TERMS\n\t\tlistp\r\n\t\t\r\n@param MT\n\t\thlmt-p")
    public static SubLObject any_spec_ofP_internal(final SubLObject terms, final SubLObject genl, final SubLObject mt) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = terms;
            SubLObject v_term = NIL;
            v_term = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if (NIL != genls.genlsP(v_term, genl, mt, UNPROVIDED)) {
                    result = T;
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            } 
        }
        return result;
    }/**
     * is any member of TERMS a spec of #$Individual?
     *
     * @param TERMS
    		listp
     * 		
     * @param MT
    		hlmt-p
     * 		
     */


    public static final SubLObject any_spec_ofP_alt(SubLObject terms, SubLObject genl, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.constraint_filters.any_spec_ofP_internal(terms, genl, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym13$ANY_SPEC_OF_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym13$ANY_SPEC_OF_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym13$ANY_SPEC_OF_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(terms, genl, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (terms.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (genl.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.constraint_filters.any_spec_ofP_internal(terms, genl, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(terms, genl, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject any_spec_ofP(final SubLObject terms, final SubLObject genl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_spec_ofP_internal(terms, genl, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym12$ANY_SPEC_OF_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym12$ANY_SPEC_OF_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym12$ANY_SPEC_OF_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(terms, genl, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (terms.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(any_spec_ofP_internal(terms, genl, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(terms, genl, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * what are the isa and genl constraints on TERM in FORMULA?
     *
     * @return 0 listp; list of isas for TERM in FORMULA
     * @return 1 listp; list of genls for TERM in FORMULA
     * @unknown fix this so it doesn't generate the constraints on all the vars, only to ignore most of them
     */
    @LispMethod(comment = "what are the isa and genl constraints on TERM in FORMULA?\r\n\r\n@return 0 listp; list of isas for TERM in FORMULA\r\n@return 1 listp; list of genls for TERM in FORMULA\r\n@unknown fix this so it doesn\'t generate the constraints on all the vars, only to ignore most of them")
    public static final SubLObject formula_term_arg_constraints_internal_alt(SubLObject v_term, SubLObject formula, SubLObject mt) {
        {
            SubLObject var = czer_utilities.unique_el_var_wrt_expression(formula, UNPROVIDED);
            SubLObject var_formula = cycl_utilities.expression_subst(var, v_term, formula, EQUALP, UNPROVIDED);
            SubLObject constraint_dict = at_var_types.formula_variables_arg_constraints_dict(var_formula, mt, UNPROVIDED, UNPROVIDED);
            SubLObject constraints = dictionary.dictionary_lookup(constraint_dict, var, UNPROVIDED);
            if (NIL != constraints) {
                {
                    SubLObject datum = constraints;
                    SubLObject current = datum;
                    SubLObject isa_constraints = NIL;
                    SubLObject genls_constraints = NIL;
                    SubLObject quoted_isa_constraints = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    isa_constraints = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    genls_constraints = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    quoted_isa_constraints = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return values(remove_if($sym16$QUOTED_COLLECTION_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), remove_if($sym16$QUOTED_COLLECTION_, genls_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), quoted_isa_constraints);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt15);
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    @LispMethod(comment = "what are the isa and genl constraints on TERM in FORMULA?\r\n\r\n@return 0 listp; list of isas for TERM in FORMULA\r\n@return 1 listp; list of genls for TERM in FORMULA\r\n@unknown fix this so it doesn\'t generate the constraints on all the vars, only to ignore most of them")
    public static SubLObject formula_term_arg_constraints_internal(final SubLObject v_term, final SubLObject formula, final SubLObject mt) {
        final SubLObject var = czer_utilities.unique_el_var_wrt_expression(formula, UNPROVIDED);
        final SubLObject var_formula = cycl_utilities.expression_subst(var, v_term, formula, EQUALP, UNPROVIDED);
        final SubLObject constraint_dict = at_var_types.formula_variables_arg_constraints_dict(var_formula, mt, UNPROVIDED, UNPROVIDED);
        final SubLObject constraints = dictionary.dictionary_lookup(constraint_dict, var, UNPROVIDED);
        if (NIL != constraints) {
            SubLObject current;
            final SubLObject datum = current = constraints;
            SubLObject isa_constraints = NIL;
            SubLObject genls_constraints = NIL;
            SubLObject quoted_isa_constraints = NIL;
            destructuring_bind_must_consp(current, datum, $list14);
            isa_constraints = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list14);
            genls_constraints = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list14);
            quoted_isa_constraints = current.first();
            current = current.rest();
            if (NIL == current) {
                return values(remove_if($sym15$QUOTED_COLLECTION_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), remove_if($sym15$QUOTED_COLLECTION_, genls_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), quoted_isa_constraints);
            }
            cdestructuring_bind_error(datum, $list14);
        }
        return values(NIL, NIL);
    }

    public static final SubLObject formula_term_arg_constraints_alt(SubLObject v_term, SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.constraint_filters.formula_term_arg_constraints_internal(v_term, formula, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FORMULA_TERM_ARG_CONSTRAINTS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FORMULA_TERM_ARG_CONSTRAINTS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, FORMULA_TERM_ARG_CONSTRAINTS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, formula, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (formula.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.constraint_filters.formula_term_arg_constraints_internal(v_term, formula, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, formula, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject formula_term_arg_constraints(final SubLObject v_term, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return formula_term_arg_constraints_internal(v_term, formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FORMULA_TERM_ARG_CONSTRAINTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FORMULA_TERM_ARG_CONSTRAINTS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FORMULA_TERM_ARG_CONSTRAINTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, formula, mt);
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
                    if (formula.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(formula_term_arg_constraints_internal(v_term, formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, formula, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject declare_constraint_filters_file() {
        declareFunction("filter_terms_by_constraining_collection", "FILTER-TERMS-BY-CONSTRAINING-COLLECTION", 3, 0, false);
        declareFunction("filter_terms_for_arg_constraints_at_argpos", "FILTER-TERMS-FOR-ARG-CONSTRAINTS-AT-ARGPOS", 4, 1, false);
        declareFunction("filter_terms_for_arg_constraints", "FILTER-TERMS-FOR-ARG-CONSTRAINTS", 4, 0, false);
        declareFunction("constraint_filter_min_isa_internal", "CONSTRAINT-FILTER-MIN-ISA-INTERNAL", 2, 0, false);
        declareFunction("constraint_filter_min_isa", "CONSTRAINT-FILTER-MIN-ISA", 2, 0, false);
        declareFunction("any_not_isaP_internal", "ANY-NOT-ISA?-INTERNAL", 3, 0, false);
        declareFunction("any_not_isaP", "ANY-NOT-ISA?", 3, 0, false);
        declareFunction("any_not_quoted_isaP_internal", "ANY-NOT-QUOTED-ISA?-INTERNAL", 3, 0, false);
        declareFunction("any_not_quoted_isaP", "ANY-NOT-QUOTED-ISA?", 3, 0, false);
        declareFunction("any_defns_rejectP_internal", "ANY-DEFNS-REJECT?-INTERNAL", 3, 0, false);
        declareFunction("any_defns_rejectP", "ANY-DEFNS-REJECT?", 3, 0, false);
        declareFunction("any_spec_ofP_internal", "ANY-SPEC-OF?-INTERNAL", 3, 0, false);
        declareFunction("any_spec_ofP", "ANY-SPEC-OF?", 3, 0, false);
        declareFunction("formula_term_arg_constraints_internal", "FORMULA-TERM-ARG-CONSTRAINTS-INTERNAL", 3, 0, false);
        declareFunction("formula_term_arg_constraints", "FORMULA-TERM-ARG-CONSTRAINTS", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_constraint_filters_file() {
        return NIL;
    }

    public static final SubLObject setup_constraint_filters_file_alt() {
        register_external_symbol(FILTER_TERMS_FOR_ARG_CONSTRAINTS_AT_ARGPOS);
        register_external_symbol(FILTER_TERMS_FOR_ARG_CONSTRAINTS);
        memoization_state.note_memoized_function(CONSTRAINT_FILTER_MIN_ISA);
        memoization_state.note_memoized_function($sym10$ANY_NOT_ISA_);
        memoization_state.note_memoized_function($sym11$ANY_NOT_QUOTED_ISA_);
        memoization_state.note_memoized_function($sym12$ANY_DEFNS_REJECT_);
        memoization_state.note_memoized_function($sym13$ANY_SPEC_OF_);
        memoization_state.note_memoized_function(FORMULA_TERM_ARG_CONSTRAINTS);
        define_test_case_table_int(CONSTRAINED_CYCL_FILTER, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt25);
        return NIL;
    }

    public static SubLObject setup_constraint_filters_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(FILTER_TERMS_FOR_ARG_CONSTRAINTS_AT_ARGPOS);
            register_external_symbol(FILTER_TERMS_FOR_ARG_CONSTRAINTS);
            memoization_state.note_memoized_function(CONSTRAINT_FILTER_MIN_ISA);
            memoization_state.note_memoized_function($sym9$ANY_NOT_ISA_);
            memoization_state.note_memoized_function($sym10$ANY_NOT_QUOTED_ISA_);
            memoization_state.note_memoized_function($sym11$ANY_DEFNS_REJECT_);
            memoization_state.note_memoized_function($sym12$ANY_SPEC_OF_);
            memoization_state.note_memoized_function(FORMULA_TERM_ARG_CONSTRAINTS);
            define_test_case_table_int(CONSTRAINED_CYCL_FILTER, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list23);
            define_test_case_table_int(FILTER_TERMS_FOR_ARG_CONSTRAINTS, list(new SubLObject[]{ $TEST, SETS_EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list25);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym10$ANY_NOT_ISA_);
            memoization_state.note_memoized_function($sym11$ANY_NOT_QUOTED_ISA_);
            memoization_state.note_memoized_function($sym12$ANY_DEFNS_REJECT_);
            memoization_state.note_memoized_function($sym13$ANY_SPEC_OF_);
            define_test_case_table_int(CONSTRAINED_CYCL_FILTER, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt25);
        }
        return NIL;
    }

    public static SubLObject setup_constraint_filters_file_Previous() {
        register_external_symbol(FILTER_TERMS_FOR_ARG_CONSTRAINTS_AT_ARGPOS);
        register_external_symbol(FILTER_TERMS_FOR_ARG_CONSTRAINTS);
        memoization_state.note_memoized_function(CONSTRAINT_FILTER_MIN_ISA);
        memoization_state.note_memoized_function($sym9$ANY_NOT_ISA_);
        memoization_state.note_memoized_function($sym10$ANY_NOT_QUOTED_ISA_);
        memoization_state.note_memoized_function($sym11$ANY_DEFNS_REJECT_);
        memoization_state.note_memoized_function($sym12$ANY_SPEC_OF_);
        memoization_state.note_memoized_function(FORMULA_TERM_ARG_CONSTRAINTS);
        define_test_case_table_int(CONSTRAINED_CYCL_FILTER, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list23);
        define_test_case_table_int(FILTER_TERMS_FOR_ARG_CONSTRAINTS, list(new SubLObject[]{ $TEST, SETS_EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list25);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constraint_filters_file();
    }

    @Override
    public void initializeVariables() {
        init_constraint_filters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constraint_filters_file();
    }

    static {
    }

    static private final SubLList $list_alt3 = list(reader_make_constant_shell("InferencePSC"), reader_make_constant_shell("EverythingPSC"));

    public static final SubLSymbol $kw9$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym10$ANY_NOT_ISA_ = makeSymbol("ANY-NOT-ISA?");

    static private final SubLSymbol $sym11$ANY_NOT_QUOTED_ISA_ = makeSymbol("ANY-NOT-QUOTED-ISA?");

    static private final SubLSymbol $sym12$ANY_DEFNS_REJECT_ = makeSymbol("ANY-DEFNS-REJECT?");

    static private final SubLSymbol $sym13$ANY_SPEC_OF_ = makeSymbol("ANY-SPEC-OF?");

    static private final SubLList $list_alt15 = list(makeSymbol("ISA-CONSTRAINTS"), makeSymbol("GENLS-CONSTRAINTS"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));

    static private final SubLSymbol $sym16$QUOTED_COLLECTION_ = makeSymbol("QUOTED-COLLECTION?");

    static private final SubLString $$$daves = makeString("daves");

    static private final SubLList $list_alt25 = list(list(list(list(list(reader_make_constant_shell("YearFn"), makeInteger(2000)), makeInteger(2000)), list(reader_make_constant_shell("temporallyBetween"), makeSymbol("?EVENT"), makeSymbol("?EARLIER"), makeSymbol("?LATER")), list(TWO_INTEGER), reader_make_constant_shell("Thing"), reader_make_constant_shell("TKBSourceSpindleCollectorMt"), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(list(reader_make_constant_shell("YearFn"), makeInteger(2000)))));
}

/**
 * Total time: 299 ms
 */
