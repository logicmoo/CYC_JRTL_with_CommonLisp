/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.assertion_handles.assertion_id;
import static com.cyc.cycjava.cycl.assertion_handles.find_assertion_by_id;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.list_utilities.fast_set_difference;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FACETS
 * source file: /cyc/top/cycl/facets.lisp
 * created:     2019/07/03 17:38:14
 */
public final class facets extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new facets();

 public static final String myName = "com.cyc.cycjava.cycl.facets";


    // defconstant
    // Definitions
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $facet_predicates_disjoint$ = makeSymbol("*FACET-PREDICATES-DISJOINT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $facet_predicates_not_disjoint$ = makeSymbol("*FACET-PREDICATES-NOT-DISJOINT*");

    // defconstant
    /**
     * The ordered (from most strict and useful to most lenient and useless) list of
     * facet predicates.
     */
    @LispMethod(comment = "The ordered (from most strict and useful to most lenient and useless) list of\r\nfacet predicates.\ndefconstant\nThe ordered (from most strict and useful to most lenient and useless) list of\nfacet predicates.")
    public static final SubLSymbol $facet_predicates$ = makeSymbol("*FACET-PREDICATES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("facets-Partition"), reader_make_constant_shell("partitionedInto"), reader_make_constant_shell("facets-Strict"));

    static private final SubLList $list1 = list(reader_make_constant_shell("facets-Covering"), reader_make_constant_shell("covering"), reader_make_constant_shell("facets-Generic"));

    private static final SubLSymbol FACET_P = makeSymbol("FACET-P");





    private static final SubLSymbol $sym8$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLObject $$facets_Partition = reader_make_constant_shell("facets-Partition");



    private static final SubLObject $$facets_Strict = reader_make_constant_shell("facets-Strict");

    static private final SubLList $list15 = list(reader_make_constant_shell("ArbitraryUnion"));

    public static final SubLObject facet_predicates_alt(SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (NIL == type) {
            return $facet_predicates$.getGlobalValue();
        } else {
            if (type == $DISJOINT) {
                return $facet_predicates_disjoint$.getGlobalValue();
            } else {
                if (type == $NOT_DISJOINT) {
                    return $facet_predicates_not_disjoint$.getGlobalValue();
                } else {
                    Errors.warn($str_alt4$facet_predicates__invalid_TYPE);
                    return NIL;
                }
            }
        }
    }

    public static SubLObject facet_predicates(SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (NIL == type) {
            return $facet_predicates$.getGlobalValue();
        }
        if (type == $DISJOINT) {
            return $facet_predicates_disjoint$.getGlobalValue();
        }
        if (type == $NOT_DISJOINT) {
            return $facet_predicates_not_disjoint$.getGlobalValue();
        }
        return NIL;
    }

    public static final SubLObject facet_p_alt(SubLObject facet) {
        SubLTrampolineFile.checkType(facet, ASSERTION_P);
        if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(assertions_high.assertion_formula(facet)), com.cyc.cycjava.cycl.facets.facet_predicates(UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            return T;
        } else {
            return NIL;
        }
    }

    public static SubLObject facet_p(final SubLObject facet) {
        assert NIL != assertion_handles.assertion_p(facet) : "! assertion_handles.assertion_p(facet) " + ("assertion_handles.assertion_p(facet) " + "CommonSymbols.NIL != assertion_handles.assertion_p(facet) ") + facet;
        if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(assertions_high.assertion_formula(facet)), facet_predicates(UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return The #$specPred of #$facets-Generic used in FACET.
     */
    @LispMethod(comment = "@return The #$specPred of #$facets-Generic used in FACET.")
    public static final SubLObject facet_assertion_alt(SubLObject facet) {
        SubLTrampolineFile.checkType(facet, FACET_P);
        return facet;
    }

    /**
     *
     *
     * @return The #$specPred of #$facets-Generic used in FACET.
     */
    @LispMethod(comment = "@return The #$specPred of #$facets-Generic used in FACET.")
    public static SubLObject facet_assertion(final SubLObject facet) {
        assert NIL != facet_p(facet) : "! facets.facet_p(facet) " + ("facets.facet_p(facet) " + "CommonSymbols.NIL != facets.facet_p(facet) ") + facet;
        return facet;
    }

    /**
     *
     *
     * @return The #$specPred of #$facets-Generic used in FACET.
     */
    @LispMethod(comment = "@return The #$specPred of #$facets-Generic used in FACET.")
    public static final SubLObject facet_id_alt(SubLObject facet) {
        SubLTrampolineFile.checkType(facet, FACET_P);
        return assertion_id(facet);
    }

    /**
     *
     *
     * @return The #$specPred of #$facets-Generic used in FACET.
     */
    @LispMethod(comment = "@return The #$specPred of #$facets-Generic used in FACET.")
    public static SubLObject facet_id(final SubLObject facet) {
        assert NIL != facet_p(facet) : "! facets.facet_p(facet) " + ("facets.facet_p(facet) " + "CommonSymbols.NIL != facets.facet_p(facet) ") + facet;
        return assertion_handles.assertion_id(facet);
    }

    /**
     *
     *
     * @return The #$specPred of #$facets-Generic used in FACET.
     */
    @LispMethod(comment = "@return The #$specPred of #$facets-Generic used in FACET.")
    public static final SubLObject find_facet_by_id_alt(SubLObject facet_id) {
        return find_assertion_by_id(facet_id);
    }

    /**
     *
     *
     * @return The #$specPred of #$facets-Generic used in FACET.
     */
    @LispMethod(comment = "@return The #$specPred of #$facets-Generic used in FACET.")
    public static SubLObject find_facet_by_id(final SubLObject facet_id) {
        return assertion_handles.find_assertion_by_id(facet_id);
    }

    /**
     *
     *
     * @return The #$specPred of #$facets-Generic used in FACET.
     */
    @LispMethod(comment = "@return The #$specPred of #$facets-Generic used in FACET.")
    public static final SubLObject facet_strength_alt(SubLObject facet) {
        SubLTrampolineFile.checkType(facet, FACET_P);
        {
            SubLObject facet_formula = assertions_high.assertion_formula(facet);
            return cycl_utilities.formula_arg0(facet_formula);
        }
    }

    /**
     *
     *
     * @return The #$specPred of #$facets-Generic used in FACET.
     */
    @LispMethod(comment = "@return The #$specPred of #$facets-Generic used in FACET.")
    public static SubLObject facet_strength(final SubLObject facet) {
        assert NIL != facet_p(facet) : "! facets.facet_p(facet) " + ("facets.facet_p(facet) " + "CommonSymbols.NIL != facets.facet_p(facet) ") + facet;
        final SubLObject facet_formula = assertions_high.assertion_formula(facet);
        return cycl_utilities.formula_arg0(facet_formula);
    }

    /**
     *
     *
     * @return The collection faceted by FACET.
     */
    @LispMethod(comment = "@return The collection faceted by FACET.")
    public static final SubLObject facet_col_alt(SubLObject facet) {
        SubLTrampolineFile.checkType(facet, FACET_P);
        {
            SubLObject facet_formula = assertions_high.assertion_formula(facet);
            return cycl_utilities.formula_arg1(facet_formula, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return The collection faceted by FACET.
     */
    @LispMethod(comment = "@return The collection faceted by FACET.")
    public static SubLObject facet_col(final SubLObject facet) {
        assert NIL != facet_p(facet) : "! facets.facet_p(facet) " + ("facets.facet_p(facet) " + "CommonSymbols.NIL != facets.facet_p(facet) ") + facet;
        final SubLObject facet_formula = assertions_high.assertion_formula(facet);
        return cycl_utilities.formula_arg1(facet_formula, UNPROVIDED);
    }

    /**
     *
     *
     * @return The collection type doing the faceting in FACET.
     */
    @LispMethod(comment = "@return The collection type doing the faceting in FACET.")
    public static final SubLObject facet_col_type_alt(SubLObject facet) {
        SubLTrampolineFile.checkType(facet, FACET_P);
        {
            SubLObject facet_formula = assertions_high.assertion_formula(facet);
            return cycl_utilities.formula_arg2(facet_formula, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return The collection type doing the faceting in FACET.
     */
    @LispMethod(comment = "@return The collection type doing the faceting in FACET.")
    public static SubLObject facet_col_type(final SubLObject facet) {
        assert NIL != facet_p(facet) : "! facets.facet_p(facet) " + ("facets.facet_p(facet) " + "CommonSymbols.NIL != facets.facet_p(facet) ") + facet;
        final SubLObject facet_formula = assertions_high.assertion_formula(facet);
        return cycl_utilities.formula_arg2(facet_formula, UNPROVIDED);
    }

    /**
     *
     *
     * @return The microtheory FACET is asserted in.
     */
    @LispMethod(comment = "@return The microtheory FACET is asserted in.")
    public static final SubLObject facet_mt_alt(SubLObject facet) {
        SubLTrampolineFile.checkType(facet, FACET_P);
        return assertions_high.assertion_mt(facet);
    }

    /**
     *
     *
     * @return The microtheory FACET is asserted in.
     */
    @LispMethod(comment = "@return The microtheory FACET is asserted in.")
    public static SubLObject facet_mt(final SubLObject facet) {
        assert NIL != facet_p(facet) : "! facets.facet_p(facet) " + ("facets.facet_p(facet) " + "CommonSymbols.NIL != facets.facet_p(facet) ") + facet;
        return assertions_high.assertion_mt(facet);
    }

    /**
     *
     *
     * @return list; the instances of the type collection in MT.
     * @unknown If instead of a constant we have a ThePartition NAT, we return the members of the partition.
     */
    @LispMethod(comment = "@return list; the instances of the type collection in MT.\r\n@unknown If instead of a constant we have a ThePartition NAT, we return the members of the partition.")
    public static final SubLObject facet_instances_alt(SubLObject facet, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(facet, FACET_P);
        {
            SubLObject facet_col_type = com.cyc.cycjava.cycl.facets.facet_col_type(facet);
            SubLObject v_instances = NIL;
            if ($$ThePartition.equal(cycl_utilities.formula_arg0(facet_col_type)) || $$TheCovering.equal(cycl_utilities.formula_arg0(facet_col_type))) {
                v_instances = copy_tree(cycl_utilities.formula_args(facet_col_type, UNPROVIDED));
            } else {
                v_instances = isa.all_fort_instances(facet_col_type, mt, UNPROVIDED);
            }
            return v_instances;
        }
    }

    /**
     *
     *
     * @return list; the instances of the type collection in MT.
     * @unknown If instead of a constant we have a ThePartition NAT, we return the members of the partition.
     */
    @LispMethod(comment = "@return list; the instances of the type collection in MT.\r\n@unknown If instead of a constant we have a ThePartition NAT, we return the members of the partition.")
    public static SubLObject facet_instances(final SubLObject facet, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != facet_p(facet) : "! facets.facet_p(facet) " + ("facets.facet_p(facet) " + "CommonSymbols.NIL != facets.facet_p(facet) ") + facet;
        final SubLObject facet_col_type = facet_col_type(facet);
        SubLObject v_instances = NIL;
        if ($$ThePartition.equal(cycl_utilities.formula_arg0(facet_col_type)) || $$TheCovering.equal(cycl_utilities.formula_arg0(facet_col_type))) {
            v_instances = copy_tree(cycl_utilities.formula_args(facet_col_type, UNPROVIDED));
        } else {
            v_instances = isa.all_fort_instances(facet_col_type, mt, UNPROVIDED);
        }
        return v_instances;
    }

    /**
     *
     *
     * @return list; collections that are instances of the facet's col-type collection in the mt the facet assertion is defined in.
     */
    @LispMethod(comment = "@return list; collections that are instances of the facet\'s col-type collection in the mt the facet assertion is defined in.")
    public static final SubLObject facet_instances_in_facet_mt_alt(SubLObject facet) {
        SubLTrampolineFile.checkType(facet, FACET_P);
        {
            SubLObject mt = com.cyc.cycjava.cycl.facets.facet_mt(facet);
            return com.cyc.cycjava.cycl.facets.facet_instances(facet, mt);
        }
    }

    /**
     *
     *
     * @return list; collections that are instances of the facet's col-type collection in the mt the facet assertion is defined in.
     */
    @LispMethod(comment = "@return list; collections that are instances of the facet\'s col-type collection in the mt the facet assertion is defined in.")
    public static SubLObject facet_instances_in_facet_mt(final SubLObject facet) {
        assert NIL != facet_p(facet) : "! facets.facet_p(facet) " + ("facets.facet_p(facet) " + "CommonSymbols.NIL != facets.facet_p(facet) ") + facet;
        final SubLObject mt = facet_mt(facet);
        return facet_instances(facet, mt);
    }

    /**
     * Find all facets-assertions for COLS.
     *
     * @return list; the facet assertions in MT that have an element of COLS in the arg1 position.
     */
    @LispMethod(comment = "Find all facets-assertions for COLS.\r\n\r\n@return list; the facet assertions in MT that have an element of COLS in the arg1 position.")
    public static final SubLObject facets_from_cols_alt(SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject all_facets = NIL;
            SubLObject all_col_types_list = NIL;
            SubLObject all_col_types = NIL;
            SubLObject cdolist_list_var = nreverse(Sort.sort(cols, symbol_function($sym9$GENERALITY_ESTIMATE_), UNPROVIDED));
            SubLObject col = NIL;
            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                all_col_types_list = cons(com.cyc.cycjava.cycl.facets.all_col_types(col), all_col_types_list);
            }
            all_col_types = apply(symbol_function(APPEND), all_col_types_list);
            all_col_types = genls.min_cols(all_col_types, mt, UNPROVIDED);
            all_facets = com.cyc.cycjava.cycl.facets.facets_from_col_types(all_col_types, mt);
            return all_facets;
        }
    }

    @LispMethod(comment = "Find all facets-assertions for COLS.\r\n\r\n@return list; the facet assertions in MT that have an element of COLS in the arg1 position.")
    public static SubLObject facets_from_cols(final SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject all_facets = NIL;
        SubLObject all_col_types_list = NIL;
        SubLObject all_col_types = NIL;
        SubLObject cdolist_list_var = nreverse(Sort.sort(cols, symbol_function($sym8$GENERALITY_ESTIMATE_), UNPROVIDED));
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            all_col_types_list = cons(all_col_types(col), all_col_types_list);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        all_col_types = apply(symbol_function(APPEND), all_col_types_list);
        all_col_types = list_utilities.remove_if_not(symbol_function(COLLECTION_P), all_col_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        all_col_types = genls.min_cols(all_col_types, mt, UNPROVIDED);
        all_facets = facets_from_col_types(all_col_types, mt);
        return all_facets;
    }

    /**
     * Find all facets-assertions for COL-TYPE.
     *
     * @return list; the facet assertions in MT that have COL-TYPE in the arg2 position.
     */
    @LispMethod(comment = "Find all facets-assertions for COL-TYPE.\r\n\r\n@return list; the facet assertions in MT that have COL-TYPE in the arg2 position.")
    public static final SubLObject facets_from_col_types_alt(SubLObject col_types, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_facets = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject cdolist_list_var = col_types;
                            SubLObject col_type = NIL;
                            for (col_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col_type = cdolist_list_var.first()) {
                                {
                                    SubLObject foundP = NIL;
                                    SubLObject some_assertions = NIL;
                                    if (NIL == foundP) {
                                        {
                                            SubLObject csome_list_var = $facet_predicates$.getGlobalValue();
                                            SubLObject facet_pred = NIL;
                                            for (facet_pred = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , facet_pred = csome_list_var.first()) {
                                                some_assertions = kb_mapping.gather_gaf_arg_index(col_type, TWO_INTEGER, facet_pred, UNPROVIDED, UNPROVIDED);
                                                if (NIL != some_assertions) {
                                                    {
                                                        SubLObject cdolist_list_var_1 = some_assertions;
                                                        SubLObject an_assertion = NIL;
                                                        for (an_assertion = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , an_assertion = cdolist_list_var_1.first()) {
                                                            {
                                                                SubLObject item_var = an_assertion;
                                                                if (NIL == member(item_var, all_facets, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    all_facets = cons(item_var, all_facets);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    foundP = T;
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
                return nreverse(all_facets);
            }
        }
    }

    @LispMethod(comment = "Find all facets-assertions for COL-TYPE.\r\n\r\n@return list; the facet assertions in MT that have COL-TYPE in the arg2 position.")
    public static SubLObject facets_from_col_types(final SubLObject col_types, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_facets = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var = col_types;
            SubLObject col_type = NIL;
            col_type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject foundP = NIL;
                SubLObject some_assertions = NIL;
                if (NIL == foundP) {
                    SubLObject csome_list_var = $facet_predicates$.getGlobalValue();
                    SubLObject facet_pred = NIL;
                    facet_pred = csome_list_var.first();
                    while ((NIL == foundP) && (NIL != csome_list_var)) {
                        some_assertions = kb_mapping.gather_gaf_arg_index(col_type, TWO_INTEGER, facet_pred, UNPROVIDED, UNPROVIDED);
                        if (NIL != some_assertions) {
                            SubLObject cdolist_list_var_$1 = some_assertions;
                            SubLObject an_assertion = NIL;
                            an_assertion = cdolist_list_var_$1.first();
                            while (NIL != cdolist_list_var_$1) {
                                final SubLObject item_var = an_assertion;
                                if (NIL == member(item_var, all_facets, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    all_facets = cons(item_var, all_facets);
                                }
                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                an_assertion = cdolist_list_var_$1.first();
                            } 
                            foundP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        facet_pred = csome_list_var.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                col_type = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return nreverse(all_facets);
    }

    /**
     *
     *
     * @return list; facet assertions that pertain to the FORT in any mt.
    If FOR-HYP-INSTANCE is T, we pretend to have an instance of FORT and return facets for it.
     */
    @LispMethod(comment = "@return list; facet assertions that pertain to the FORT in any mt.\r\nIf FOR-HYP-INSTANCE is T, we pretend to have an instance of FORT and return facets for it.")
    public static final SubLObject all_facets_with_mt_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.facets.facets_from_cols(isa.all_isa(fort, mt, UNPROVIDED), mt);
    }

    /**
     *
     *
     * @return list; facet assertions that pertain to the FORT in any mt.
    If FOR-HYP-INSTANCE is T, we pretend to have an instance of FORT and return facets for it.
     */
    @LispMethod(comment = "@return list; facet assertions that pertain to the FORT in any mt.\r\nIf FOR-HYP-INSTANCE is T, we pretend to have an instance of FORT and return facets for it.")
    public static SubLObject all_facets_with_mt(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return facets_from_cols(isa.all_isa(fort, mt, UNPROVIDED), mt);
    }

    /**
     *
     *
     * @return list; those members of the FACETs type collection that FORT belongs to.
     */
    @LispMethod(comment = "@return list; those members of the FACETs type collection that FORT belongs to.")
    public static final SubLObject current_fort_faceting_alt(SubLObject fort, SubLObject facet, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject sup_facet_cols = NIL;
            SubLObject not_sup_facet_cols = NIL;
            SubLObject facet_strength = com.cyc.cycjava.cycl.facets.facet_strength(facet);
            SubLObject all_fort_instances = com.cyc.cycjava.cycl.facets.facet_instances(facet, mt);
            sup_facet_cols = isa.all_isa_among(fort, all_fort_instances, mt, UNPROVIDED);
            if (($$facets_Partition.equal(facet_strength) || $$partitionedInto.equal(facet_strength)) || $$facets_Strict.equal(facet_strength)) {
                if (!((NIL == all_fort_instances) || (NIL == sup_facet_cols))) {
                    not_sup_facet_cols = set_difference(all_fort_instances, sup_facet_cols, UNPROVIDED, UNPROVIDED);
                }
            } else {
                not_sup_facet_cols = isa.not_isa_among(fort, all_fort_instances, mt, UNPROVIDED);
            }
            return values(sup_facet_cols, not_sup_facet_cols);
        }
    }

    /**
     *
     *
     * @return list; those members of the FACETs type collection that FORT belongs to.
     */
    @LispMethod(comment = "@return list; those members of the FACETs type collection that FORT belongs to.")
    public static SubLObject current_fort_faceting(final SubLObject fort, final SubLObject facet, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject sup_facet_cols = NIL;
        SubLObject not_sup_facet_cols = NIL;
        final SubLObject facet_strength = facet_strength(facet);
        final SubLObject all_fort_instances = facet_instances(facet, mt);
        sup_facet_cols = isa.all_isa_among(fort, all_fort_instances, mt, UNPROVIDED);
        if (($$facets_Partition.equal(facet_strength) || $$partitionedInto.equal(facet_strength)) || $$facets_Strict.equal(facet_strength)) {
            if ((NIL != all_fort_instances) && (NIL != sup_facet_cols)) {
                not_sup_facet_cols = set_difference(all_fort_instances, sup_facet_cols, UNPROVIDED, UNPROVIDED);
            }
        } else {
            not_sup_facet_cols = isa.not_isa_among(fort, all_fort_instances, mt, UNPROVIDED);
        }
        return values(sup_facet_cols, not_sup_facet_cols);
    }

    public static final SubLObject all_col_types_alt(SubLObject col) {
        {
            SubLObject all_col_types = NIL;
            SubLObject cdolist_list_var = $facet_predicates$.getGlobalValue();
            SubLObject facet_predicate = NIL;
            for (facet_predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , facet_predicate = cdolist_list_var.first()) {
                {
                    SubLObject possible_col_types = kb_mapping_utilities.pred_values_in_any_mt(col, facet_predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var_2 = possible_col_types;
                    SubLObject possible_col_type = NIL;
                    for (possible_col_type = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , possible_col_type = cdolist_list_var_2.first()) {
                        if (NIL != forts.fort_p(possible_col_type)) {
                            all_col_types = cons(possible_col_type, all_col_types);
                        }
                    }
                }
            }
            return all_col_types;
        }
    }

    public static SubLObject all_col_types(final SubLObject col) {
        SubLObject all_col_types = NIL;
        SubLObject cdolist_list_var = $facet_predicates$.getGlobalValue();
        SubLObject facet_predicate = NIL;
        facet_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject possible_col_types = cdolist_list_var_$2 = kb_mapping_utilities.pred_values_in_any_mt(col, facet_predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject possible_col_type = NIL;
            possible_col_type = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                if (NIL != forts.fort_p(possible_col_type)) {
                    all_col_types = cons(possible_col_type, all_col_types);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                possible_col_type = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            facet_predicate = cdolist_list_var.first();
        } 
        return all_col_types;
    }

    public static final SubLObject min_col_types_alt(SubLObject col) {
        return genls.min_cols(com.cyc.cycjava.cycl.facets.all_col_types(col), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject min_col_types(final SubLObject col) {
        return genls.min_cols(all_col_types(col), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject all_specs_no_instances_of_alt(SubLObject col, SubLObject filter_cols, SubLObject mt) {
        if (filter_cols == UNPROVIDED) {
            filter_cols = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject all_specs = genls.all_specs(col, mt, UNPROVIDED);
            SubLObject all_specs_ok = NIL;
            SubLObject cdolist_list_var = all_specs;
            SubLObject spec = NIL;
            for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                if (!((spec == col) || (NIL != isa.isa_anyP(spec, filter_cols, UNPROVIDED, UNPROVIDED)))) {
                    all_specs_ok = cons(spec, all_specs_ok);
                }
            }
            return nreverse(all_specs_ok);
        }
    }

    public static SubLObject all_specs_no_instances_of(final SubLObject col, SubLObject filter_cols, SubLObject mt) {
        if (filter_cols == UNPROVIDED) {
            filter_cols = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject all_specs = genls.all_specs(col, mt, UNPROVIDED);
        SubLObject all_specs_ok = NIL;
        SubLObject cdolist_list_var = all_specs;
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!spec.eql(col)) && (NIL == isa.isa_anyP(spec, filter_cols, UNPROVIDED, UNPROVIDED))) {
                all_specs_ok = cons(spec, all_specs_ok);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return nreverse(all_specs_ok);
    }

    public static final SubLObject all_specs_no_arbitrary_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.facets.all_specs_no_instances_of(col, $list_alt15, mt);
    }

    public static SubLObject all_specs_no_arbitrary(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return all_specs_no_instances_of(col, $list15, mt);
    }

    public static final SubLObject all_genls_no_instances_of_alt(SubLObject col, SubLObject filter_cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject all_genls = genls.all_genls(col, mt, UNPROVIDED);
            SubLObject all_genls_ok = NIL;
            SubLObject cdolist_list_var = all_genls;
            SubLObject genl = NIL;
            for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                if (!((genl == col) || (NIL != isa.isa_anyP(genl, filter_cols, UNPROVIDED, UNPROVIDED)))) {
                    all_genls_ok = cons(genl, all_genls_ok);
                }
            }
            return nreverse(all_genls_ok);
        }
    }

    public static SubLObject all_genls_no_instances_of(final SubLObject col, final SubLObject filter_cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject all_genls = genls.all_genls(col, mt, UNPROVIDED);
        SubLObject all_genls_ok = NIL;
        SubLObject cdolist_list_var = all_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!genl.eql(col)) && (NIL == isa.isa_anyP(genl, filter_cols, UNPROVIDED, UNPROVIDED))) {
                all_genls_ok = cons(genl, all_genls_ok);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return nreverse(all_genls_ok);
    }

    public static final SubLObject all_genls_no_arbitrary_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.facets.all_genls_no_instances_of(col, $list_alt15, mt);
    }

    public static SubLObject all_genls_no_arbitrary(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return all_genls_no_instances_of(col, $list15, mt);
    }

    public static final SubLObject asserted_links_alt(SubLObject v_term, SubLObject pred, SubLObject inverseP, SubLObject mt) {
        {
            SubLObject asserted_true = kb_mapping_utilities.pred_values_in_relevant_mts(v_term, pred, mt, NIL != inverseP ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER, NIL != inverseP ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER, $TRUE);
            SubLObject asserted_false = kb_mapping_utilities.pred_values_in_relevant_mts(v_term, pred, mt, NIL != inverseP ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER, NIL != inverseP ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER, $FALSE);
            SubLObject coextensional = (NIL != inverseP) ? ((SubLObject) (sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module(pred), v_term, asserted_true, mt, UNPROVIDED))) : sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module(pred), v_term, asserted_true, mt, UNPROVIDED);
            SubLObject strict_asserted_true = set_difference(asserted_true, coextensional, UNPROVIDED, UNPROVIDED);
            SubLObject strict_asserted_false = set_difference(asserted_false, coextensional, UNPROVIDED, UNPROVIDED);
            SubLObject reduced_asserted_true = (NIL != inverseP) ? ((SubLObject) (sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, UNPROVIDED, UNPROVIDED))) : sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, UNPROVIDED);
            SubLObject reduced_asserted_false = (NIL != inverseP) ? ((SubLObject) (sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, UNPROVIDED))) : sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, UNPROVIDED, UNPROVIDED);
            SubLObject redundant_true = fast_set_difference(strict_asserted_true, reduced_asserted_true, UNPROVIDED);
            SubLObject redundant_false = fast_set_difference(strict_asserted_false, reduced_asserted_false, UNPROVIDED);
            return list(new SubLObject[]{ $ASSERTED_TRUE, asserted_true, $REDUNDANT_TRUE, redundant_true, $COEXTENSIONAL, coextensional, $REDUNDANT_FALSE, redundant_false, $ASSERTED_FALSE, asserted_false });
        }
    }

    public static SubLObject asserted_links(final SubLObject v_term, final SubLObject pred, final SubLObject inverseP, final SubLObject mt) {
        final SubLObject asserted_true = kb_mapping_utilities.pred_values_in_relevant_mts(v_term, pred, mt, NIL != inverseP ? TWO_INTEGER : ONE_INTEGER, NIL != inverseP ? ONE_INTEGER : TWO_INTEGER, $TRUE);
        final SubLObject asserted_false = kb_mapping_utilities.pred_values_in_relevant_mts(v_term, pred, mt, NIL != inverseP ? TWO_INTEGER : ONE_INTEGER, NIL != inverseP ? ONE_INTEGER : TWO_INTEGER, $FALSE);
        final SubLObject coextensional = (NIL != inverseP) ? sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module(pred), v_term, asserted_true, mt, UNPROVIDED) : sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module(pred), v_term, asserted_true, mt, UNPROVIDED);
        final SubLObject strict_asserted_true = set_difference(asserted_true, coextensional, UNPROVIDED, UNPROVIDED);
        final SubLObject strict_asserted_false = set_difference(asserted_false, coextensional, UNPROVIDED, UNPROVIDED);
        final SubLObject reduced_asserted_true = (NIL != inverseP) ? sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, UNPROVIDED, UNPROVIDED) : sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, UNPROVIDED);
        final SubLObject reduced_asserted_false = (NIL != inverseP) ? sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, UNPROVIDED) : sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, UNPROVIDED, UNPROVIDED);
        final SubLObject redundant_true = list_utilities.fast_set_difference(strict_asserted_true, reduced_asserted_true, UNPROVIDED);
        final SubLObject redundant_false = list_utilities.fast_set_difference(strict_asserted_false, reduced_asserted_false, UNPROVIDED);
        return list(new SubLObject[]{ $ASSERTED_TRUE, asserted_true, $REDUNDANT_TRUE, redundant_true, $COEXTENSIONAL, coextensional, $REDUNDANT_FALSE, redundant_false, $ASSERTED_FALSE, asserted_false });
    }

    public static SubLObject declare_facets_file() {
        declareFunction("facet_predicates", "FACET-PREDICATES", 0, 1, false);
        declareFunction("facet_p", "FACET-P", 1, 0, false);
        declareFunction("facet_assertion", "FACET-ASSERTION", 1, 0, false);
        declareFunction("facet_id", "FACET-ID", 1, 0, false);
        declareFunction("find_facet_by_id", "FIND-FACET-BY-ID", 1, 0, false);
        declareFunction("facet_strength", "FACET-STRENGTH", 1, 0, false);
        declareFunction("facet_col", "FACET-COL", 1, 0, false);
        declareFunction("facet_col_type", "FACET-COL-TYPE", 1, 0, false);
        declareFunction("facet_mt", "FACET-MT", 1, 0, false);
        declareFunction("facet_instances", "FACET-INSTANCES", 1, 1, false);
        declareFunction("facet_instances_in_facet_mt", "FACET-INSTANCES-IN-FACET-MT", 1, 0, false);
        declareFunction("facets_from_cols", "FACETS-FROM-COLS", 1, 1, false);
        declareFunction("facets_from_col_types", "FACETS-FROM-COL-TYPES", 1, 1, false);
        declareFunction("all_facets_with_mt", "ALL-FACETS-WITH-MT", 1, 1, false);
        declareFunction("current_fort_faceting", "CURRENT-FORT-FACETING", 2, 1, false);
        declareFunction("all_col_types", "ALL-COL-TYPES", 1, 0, false);
        declareFunction("min_col_types", "MIN-COL-TYPES", 1, 0, false);
        declareFunction("all_specs_no_instances_of", "ALL-SPECS-NO-INSTANCES-OF", 1, 2, false);
        declareFunction("all_specs_no_arbitrary", "ALL-SPECS-NO-ARBITRARY", 1, 1, false);
        declareFunction("all_genls_no_instances_of", "ALL-GENLS-NO-INSTANCES-OF", 2, 1, false);
        declareFunction("all_genls_no_arbitrary", "ALL-GENLS-NO-ARBITRARY", 1, 1, false);
        declareFunction("asserted_links", "ASSERTED-LINKS", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_facets_file() {
        defconstant("*FACET-PREDICATES-DISJOINT*", $list0);
        defconstant("*FACET-PREDICATES-NOT-DISJOINT*", $list1);
        defconstant("*FACET-PREDICATES*", append($facet_predicates_disjoint$.getGlobalValue(), $facet_predicates_not_disjoint$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject setup_facets_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_facets_file();
    }

    @Override
    public void initializeVariables() {
        init_facets_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_facets_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("facets-Partition"), reader_make_constant_shell("partitionedInto"), reader_make_constant_shell("facets-Strict"));

    static private final SubLList $list_alt1 = list(reader_make_constant_shell("facets-Covering"), reader_make_constant_shell("covering"), reader_make_constant_shell("facets-Generic"));

    static private final SubLString $str_alt4$facet_predicates__invalid_TYPE = makeString("facet-predicates: invalid TYPE");

    static private final SubLSymbol $sym9$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    static private final SubLList $list_alt15 = list(reader_make_constant_shell("ArbitraryUnion"));
}

/**
 * Total time: 195 ms
 */
