/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.list_utilities.delete_subsumed_items;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_obsolete_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DISJOINT-WITH
 * source file: /cyc/top/cycl/disjoint-with.lisp
 * created:     2019/07/03 17:37:27
 */
public final class disjoint_with extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new disjoint_with();

 public static final String myName = "com.cyc.cycjava.cycl.disjoint_with";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $any_disjoint_with_anyP_cached_caching_state$ = makeSymbol("*ANY-DISJOINT-WITH-ANY?-CACHED-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $maximal_consistent_subsets$ = makeSymbol("*MAXIMAL-CONSISTENT-SUBSETS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $maximal_consistent_subsets_visited_subsets$ = makeSymbol("*MAXIMAL-CONSISTENT-SUBSETS-VISITED-SUBSETS*");



    private static final SubLSymbol ANY_DISJOINT_COLLECTION_PAIR = makeSymbol("ANY-DISJOINT-COLLECTION-PAIR");

    static private final SubLList $list3 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str4$Returns_a_pair_of_disjoint_elemen = makeString("Returns a pair of disjoint elements of COLS (if any exist)");

    static private final SubLList $list5 = list(list(makeSymbol("COLS"), makeSymbol("LISTP")));

    static private final SubLList $list6 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));





    private static final SubLSymbol $sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT = makeSymbol("ANY-DISJOINT-WITH-ANY?-MEMOIZED-INT");

    private static final SubLSymbol $sym12$ANY_DISJOINT_WITH_ANY__CACHED = makeSymbol("ANY-DISJOINT-WITH-ANY?-CACHED");

    private static final SubLSymbol $sym13$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $sym14$_ANY_DISJOINT_WITH_ANY__CACHED_CACHING_STATE_ = makeSymbol("*ANY-DISJOINT-WITH-ANY?-CACHED-CACHING-STATE*");

    private static final SubLSymbol $sym16$CLEAR_ANY_DISJOINT_WITH_ANY__CACHED = makeSymbol("CLEAR-ANY-DISJOINT-WITH-ANY?-CACHED");

    private static final SubLSymbol $sym17$ANY_DISJOINT_COLLECTION_PAIR_ = makeSymbol("ANY-DISJOINT-COLLECTION-PAIR?");

    private static final SubLString $str18$Are_any_two_collections_in_COLS_d = makeString("Are any two collections in COLS disjoint?");

    static private final SubLList $list19 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol $sym21$COLLECTIONS_DISJOINT_ = makeSymbol("COLLECTIONS-DISJOINT?");

    static private final SubLList $list22 = list(makeSymbol("DISJOINT-WITH?"));

    private static final SubLList $list23 = list(makeSymbol("COL-1"), makeSymbol("COL-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str24$_see_disjoint_with_ = makeString("@see disjoint-with?");

    static private final SubLList $list25 = list(list(makeSymbol("COL-1"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-2"), makeSymbol("EL-FORT-P")));

    private static final SubLSymbol $sym26$WHY_COLLECTIONS_DISJOINT_ = makeSymbol("WHY-COLLECTIONS-DISJOINT?");

    private static final SubLList $list27 = list(makeSymbol("WHY-DISJOINT-WITH?"));

    private static final SubLList $list28 = list(makeSymbol("C1"), makeSymbol("C2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLString $str29$_see_why_disjoint_with_ = makeString("@see why-disjoint-with?");

    private static final SubLList $list30 = list(list(makeSymbol("C1"), makeSymbol("EL-FORT-P")), list(makeSymbol("C2"), makeSymbol("EL-FORT-P")));

    private static final SubLList $list31 = list(makeSymbol("LISTP"));

    private static final SubLSymbol MDW_AFTER_ADDING = makeSymbol("MDW-AFTER-ADDING");

    private static final SubLSymbol MDW_AFTER_REMOVING = makeSymbol("MDW-AFTER-REMOVING");

    private static final SubLSymbol SUPERSETP = makeSymbol("SUPERSETP");

    // Definitions
    /**
     * the collections delcared to be disjoint with <col>
     */
    @LispMethod(comment = "the collections delcared to be disjoint with <col>")
    public static final SubLObject local_disjoint_with_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv, UNPROVIDED);
    }

    // Definitions
    /**
     * the collections delcared to be disjoint with <col>
     */
    @LispMethod(comment = "the collections delcared to be disjoint with <col>")
    public static SubLObject local_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv, UNPROVIDED);
    }

    /**
     * the most-general among the collections delcared to be disjoint with <col>
     */
    @LispMethod(comment = "the most-general among the collections delcared to be disjoint with <col>")
    public static final SubLObject local_max_disjoint_with_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * the most-general among the collections delcared to be disjoint with <col>
     */
    @LispMethod(comment = "the most-general among the collections delcared to be disjoint with <col>")
    public static SubLObject local_max_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * the collections delcared to not be disjoint with <col>
     */
    @LispMethod(comment = "the collections delcared to not be disjoint with <col>")
    public static final SubLObject local_not_disjoint_with_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv, UNPROVIDED);
    }

    /**
     * the collections delcared to not be disjoint with <col>
     */
    @LispMethod(comment = "the collections delcared to not be disjoint with <col>")
    public static SubLObject local_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv, UNPROVIDED);
    }

    /**
     * the least general among the collections delcared to not be disjoint with <col>
     */
    @LispMethod(comment = "the least general among the collections delcared to not be disjoint with <col>")
    public static final SubLObject local_min_not_disjoint_with_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * the least general among the collections delcared to not be disjoint with <col>
     */
    @LispMethod(comment = "the least general among the collections delcared to not be disjoint with <col>")
    public static SubLObject local_min_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * all collections disjoint with <col>
     */
    @LispMethod(comment = "all collections disjoint with <col>")
    public static final SubLObject all_disjoint_with_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * all collections disjoint with <col>
     */
    @LispMethod(comment = "all collections disjoint with <col>")
    public static SubLObject all_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * all collections not disjoint with <col>
     */
    @LispMethod(comment = "all collections not disjoint with <col>")
    public static final SubLObject all_not_disjoint_with_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * all collections not disjoint with <col>
     */
    @LispMethod(comment = "all collections not disjoint with <col>")
    public static SubLObject all_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * most superordinate of collections disjoint with <col>
     */
    @LispMethod(comment = "most superordinate of collections disjoint with <col>")
    public static final SubLObject max_all_disjoint_with_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * most superordinate of collections disjoint with <col>
     */
    @LispMethod(comment = "most superordinate of collections disjoint with <col>")
    public static SubLObject max_all_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * most superordinate of collections disjoint with <col> ignoring sibling disjointness
     */
    @LispMethod(comment = "most superordinate of collections disjoint with <col> ignoring sibling disjointness")
    public static final SubLObject max_all_disjoint_with_no_sdc_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_true_disjoins(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * most superordinate of collections disjoint with <col> ignoring sibling disjointness
     */
    @LispMethod(comment = "most superordinate of collections disjoint with <col> ignoring sibling disjointness")
    public static SubLObject max_all_disjoint_with_no_sdc(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_true_disjoins(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * most subordinate of all collections not disjoint with <col>
     */
    @LispMethod(comment = "most subordinate of all collections not disjoint with <col>")
    public static final SubLObject min_all_not_disjoint_with_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_implied_min_false_disjoins(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * most subordinate of all collections not disjoint with <col>
     */
    @LispMethod(comment = "most subordinate of all collections not disjoint with <col>")
    public static SubLObject min_all_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_implied_min_false_disjoins(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * most subordinate of the specs of <col>
     */
    @LispMethod(comment = "most subordinate of the specs of <col>")
    public static final SubLObject min_implied_not_disjoint_with_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module($$disjointWith)), col, mt, tv);
    }

    /**
     * most subordinate of the specs of <col>
     */
    @LispMethod(comment = "most subordinate of the specs of <col>")
    public static SubLObject min_implied_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module($$disjointWith)), col, mt, tv);
    }

    /**
     * most subordinate of the asserted not-disjoins of the specs of <col>
     */
    @LispMethod(comment = "most subordinate of the asserted not-disjoins of the specs of <col>")
    public static final SubLObject min_all_asserted_not_disjoint_with_alt(SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_asserted_false_disjoins(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * most subordinate of the asserted not-disjoins of the specs of <col>
     */
    @LispMethod(comment = "most subordinate of the asserted not-disjoins of the specs of <col>")
    public static SubLObject min_all_asserted_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_asserted_false_disjoins(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt, tv);
    }

    /**
     * Returns a pair of disjoint elements of COLS (if any exist)
     */
    @LispMethod(comment = "Returns a pair of disjoint elements of COLS (if any exist)")
    public static final SubLObject any_disjoint_collection_pair_alt(SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(cols, LISTP);
        {
            SubLObject disjoint = NIL;
            SubLObject n = ZERO_INTEGER;
            if (NIL == disjoint) {
                {
                    SubLObject csome_list_var = cols;
                    SubLObject col_1 = NIL;
                    for (col_1 = csome_list_var.first(); !((NIL != disjoint) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col_1 = csome_list_var.first()) {
                        n = add(n, ONE_INTEGER);
                        if (NIL == disjoint) {
                            {
                                SubLObject csome_list_var_1 = nthcdr(n, cols);
                                SubLObject col_2 = NIL;
                                for (col_2 = csome_list_var_1.first(); !((NIL != disjoint) || (NIL == csome_list_var_1)); csome_list_var_1 = csome_list_var_1.rest() , col_2 = csome_list_var_1.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.disjoint_with.disjoint_withP(col_1, col_2, mt, UNPROVIDED)) {
                                        disjoint = list(col_1, col_2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return disjoint;
        }
    }

    /**
     * Returns a pair of disjoint elements of COLS (if any exist)
     */
    @LispMethod(comment = "Returns a pair of disjoint elements of COLS (if any exist)")
    public static SubLObject any_disjoint_collection_pair(final SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(cols, LISTP);
        SubLObject disjoint = NIL;
        SubLObject n = ZERO_INTEGER;
        if (NIL == disjoint) {
            SubLObject csome_list_var = cols;
            SubLObject col_1 = NIL;
            col_1 = csome_list_var.first();
            while ((NIL == disjoint) && (NIL != csome_list_var)) {
                n = add(n, ONE_INTEGER);
                if (NIL == disjoint) {
                    SubLObject csome_list_var_$1 = nthcdr(n, cols);
                    SubLObject col_2 = NIL;
                    col_2 = csome_list_var_$1.first();
                    while ((NIL == disjoint) && (NIL != csome_list_var_$1)) {
                        if (NIL != disjoint_withP(col_1, col_2, mt, UNPROVIDED)) {
                            disjoint = list(col_1, col_2);
                        }
                        csome_list_var_$1 = csome_list_var_$1.rest();
                        col_2 = csome_list_var_$1.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                col_1 = csome_list_var.first();
            } 
        }
        return disjoint;
    }

    /**
     * Marks the local disjoins of all genls of NODE in current *sbhl-space*
     */
    @LispMethod(comment = "Marks the local disjoins of all genls of NODE in current *sbhl-space*")
    public static final SubLObject sbhl_record_max_true_disjoint_with_alt(SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_marking_methods.sbhl_record_max_true_disjoins(sbhl_module_vars.get_sbhl_module($$genls), node, mt, tv);
        return NIL;
    }

    /**
     * Marks the local disjoins of all genls of NODE in current *sbhl-space*
     */
    @LispMethod(comment = "Marks the local disjoins of all genls of NODE in current *sbhl-space*")
    public static SubLObject sbhl_record_max_true_disjoint_with(final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_marking_methods.sbhl_record_max_true_disjoins(sbhl_module_vars.get_sbhl_module($$genls), node, mt, tv);
        return NIL;
    }

    /**
     * Unmarks the local disjoins of all genls of NODE in current *sbhl-space*
     */
    @LispMethod(comment = "Unmarks the local disjoins of all genls of NODE in current *sbhl-space*")
    public static final SubLObject sbhl_unrecord_max_true_disjoint_with_alt(SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_marking_methods.sbhl_unrecord_max_true_disjoins(sbhl_module_vars.get_sbhl_module($$genls), node, mt, tv);
        return NIL;
    }

    /**
     * Unmarks the local disjoins of all genls of NODE in current *sbhl-space*
     */
    @LispMethod(comment = "Unmarks the local disjoins of all genls of NODE in current *sbhl-space*")
    public static SubLObject sbhl_unrecord_max_true_disjoint_with(final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        sbhl_marking_methods.sbhl_unrecord_max_true_disjoins(sbhl_module_vars.get_sbhl_module($$genls), node, mt, tv);
        return NIL;
    }

    public static final SubLObject instances_of_disjoint_collectionsP_alt(SubLObject term1, SubLObject term2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (term1 == term2) {
            return NIL;
        }
        {
            SubLObject term1_isas = isa.min_isa(term1, mt, tv);
            SubLObject term2_isas = isa.min_isa(term2, mt, tv);
            return com.cyc.cycjava.cycl.disjoint_with.any_disjoint_with_anyP(term1_isas, term2_isas, mt, tv);
        }
    }

    public static SubLObject instances_of_disjoint_collectionsP(final SubLObject term1, final SubLObject term2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (term1.eql(term2)) {
            return NIL;
        }
        final SubLObject term1_isas = isa.min_isa(term1, mt, tv);
        final SubLObject term2_isas = isa.min_isa(term2, mt, tv);
        return any_disjoint_with_anyP(term1_isas, term2_isas, mt, tv, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown a list of hl-supports
     */
    @LispMethod(comment = "@unknown a list of hl-supports")
    public static final SubLObject why_instances_of_disjoint_collections_alt(SubLObject term1, SubLObject term2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = NIL;
                SubLObject disjointP = NIL;
                if (term1 == term2) {
                    return NIL;
                }
                {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, FOUR_INTEGER), thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                            {
                                SubLObject term1_isas = isa.min_isa(term1, mt, tv);
                                SubLObject term2_isas = isa.min_isa(term2, mt, tv);
                                if (NIL == disjointP) {
                                    {
                                        SubLObject csome_list_var = term1_isas;
                                        SubLObject term1_isa = NIL;
                                        for (term1_isa = csome_list_var.first(); !((NIL != disjointP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , term1_isa = csome_list_var.first()) {
                                            if (NIL == disjointP) {
                                                {
                                                    SubLObject csome_list_var_2 = term2_isas;
                                                    SubLObject term2_isa = NIL;
                                                    for (term2_isa = csome_list_var_2.first(); !((NIL != disjointP) || (NIL == csome_list_var_2)); csome_list_var_2 = csome_list_var_2.rest() , term2_isa = csome_list_var_2.first()) {
                                                        if (NIL != com.cyc.cycjava.cycl.disjoint_with.disjoint_withP(term1_isa, term2_isa, mt, tv)) {
                                                            supports = cons(arguments.make_hl_support($ISA, make_binary_formula($$isa, term1, term1_isa), UNPROVIDED, UNPROVIDED), supports);
                                                            supports = cons(arguments.make_hl_support($ISA, make_binary_formula($$isa, term2, term2_isa), UNPROVIDED, UNPROVIDED), supports);
                                                            supports = cons(arguments.make_hl_support($DISJOINTWITH, make_binary_formula($$disjointWith, term1_isa, term2_isa), UNPROVIDED, UNPROVIDED), supports);
                                                            disjointP = T;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return supports;
            }
        }
    }

    /**
     *
     *
     * @unknown a list of hl-supports
     */
    @LispMethod(comment = "@unknown a list of hl-supports")
    public static SubLObject why_instances_of_disjoint_collections(final SubLObject term1, final SubLObject term2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        SubLObject disjointP = NIL;
        if (term1.eql(term2)) {
            return NIL;
        }
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, FOUR_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject term1_isas = isa.min_isa(term1, mt, tv);
            final SubLObject term2_isas = isa.min_isa(term2, mt, tv);
            if (NIL == disjointP) {
                SubLObject csome_list_var = term1_isas;
                SubLObject term1_isa = NIL;
                term1_isa = csome_list_var.first();
                while ((NIL == disjointP) && (NIL != csome_list_var)) {
                    if (NIL == disjointP) {
                        SubLObject csome_list_var_$2 = term2_isas;
                        SubLObject term2_isa = NIL;
                        term2_isa = csome_list_var_$2.first();
                        while ((NIL == disjointP) && (NIL != csome_list_var_$2)) {
                            if (NIL != disjoint_withP(term1_isa, term2_isa, mt, tv)) {
                                supports = cons(arguments.make_hl_support($ISA, make_binary_formula($$isa, term1, term1_isa), UNPROVIDED, UNPROVIDED), supports);
                                supports = cons(arguments.make_hl_support($ISA, make_binary_formula($$isa, term2, term2_isa), UNPROVIDED, UNPROVIDED), supports);
                                supports = cons(arguments.make_hl_support($DISJOINTWITH, make_binary_formula($$disjointWith, term1_isa, term2_isa), UNPROVIDED, UNPROVIDED), supports);
                                disjointP = T;
                            }
                            csome_list_var_$2 = csome_list_var_$2.rest();
                            term2_isa = csome_list_var_$2.first();
                        } 
                    }
                    csome_list_var = csome_list_var.rest();
                    term1_isa = csome_list_var.first();
                } 
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    /**
     * are collections <c1> and <c2> disjoint?
     */
    @LispMethod(comment = "are collections <c1> and <c2> disjoint?")
    public static final SubLObject disjoint_withP_alt(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != term.first_order_nautP(c1)) {
            return com.cyc.cycjava.cycl.disjoint_with.nat_disjoint_withP(c1, c2, mt, tv);
        } else {
            return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1, c2, mt, tv);
        }
    }

    /**
     * are collections <c1> and <c2> disjoint?
     */
    @LispMethod(comment = "are collections <c1> and <c2> disjoint?")
    public static SubLObject disjoint_withP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != term.first_order_nautP(c1)) {
            return nat_disjoint_withP(c1, c2, mt, tv);
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1, c2, mt, tv);
    }

    /**
     * if (nat-p) nat-formula, then call collections-disjoint, else call
     * any-collection-disjoint-wrt?
     */
    @LispMethod(comment = "if (nat-p) nat-formula, then call collections-disjoint, else call\r\nany-collection-disjoint-wrt?\nif (nat-p) nat-formula, then call collections-disjoint, else call\nany-collection-disjoint-wrt?")
    public static final SubLObject nat_disjoint_withP_alt(SubLObject nat_formula, SubLObject col_2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            SubLObject nat = narts_high.find_nart(nat_formula);
            if (NIL != nart_handles.nart_p(nat)) {
                return com.cyc.cycjava.cycl.disjoint_with.disjoint_withP(nat, col_2, mt, tv);
            } else {
                return com.cyc.cycjava.cycl.disjoint_with.any_disjoint_withP(genls.nat_min_genls(nat_formula, mt, UNPROVIDED), col_2, mt, tv);
            }
        }
    }

    /**
     * if (nat-p) nat-formula, then call collections-disjoint, else call
     * any-collection-disjoint-wrt?
     */
    @LispMethod(comment = "if (nat-p) nat-formula, then call collections-disjoint, else call\r\nany-collection-disjoint-wrt?\nif (nat-p) nat-formula, then call collections-disjoint, else call\nany-collection-disjoint-wrt?")
    public static SubLObject nat_disjoint_withP(final SubLObject nat_formula, final SubLObject col_2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject nat = narts_high.find_nart(nat_formula);
        if (NIL != nart_handles.nart_p(nat)) {
            return disjoint_withP(nat, col_2, mt, tv);
        }
        return any_disjoint_withP(genls.nat_min_genls(nat_formula, mt, UNPROVIDED), col_2, mt, tv);
    }

    /**
     * is any c1 in <c1s> disjoint with c2?
     */
    @LispMethod(comment = "is any c1 in <c1s> disjoint with c2?")
    public static final SubLObject any_disjoint_withP_alt(SubLObject c1s, SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_any_with_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1s, c2, mt, tv);
    }

    /**
     * is any c1 in <c1s> disjoint with c2?
     */
    @LispMethod(comment = "is any c1 in <c1s> disjoint with c2?")
    public static SubLObject any_disjoint_withP(final SubLObject c1s, final SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL == c1s) {
            return NIL;
        }
        return sbhl_search_implied_relations.sbhl_any_with_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1s, c2, mt, tv);
    }

    /**
     * is any c1 in <c1s> disjoint with c2?
     */
    @LispMethod(comment = "is any c1 in <c1s> disjoint with c2?")
    public static final SubLObject any_disjoint_with_anyP(SubLObject c1s, SubLObject c2s, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_between_any_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1s, c2s, mt, tv);
    }

    public static SubLObject any_disjoint_with_anyP(final SubLObject c1s, final SubLObject c2s, SubLObject mt, SubLObject tv, SubLObject assume_cols_not_self_disjointP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (assume_cols_not_self_disjointP == UNPROVIDED) {
            assume_cols_not_self_disjointP = NIL;
        }
        if (NIL != assume_cols_not_self_disjointP) {
            final SubLObject use_c1P = list_utilities.lesser_length_p(c1s, c2s);
            final SubLObject shorter = (NIL != use_c1P) ? c1s : c2s;
            final SubLObject longer = (NIL != use_c1P) ? c2s : c1s;
            SubLObject cdolist_list_var = shorter;
            SubLObject c = NIL;
            c = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != any_disjoint_withP(remove(c, longer, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), c, mt, tv)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                c = cdolist_list_var.first();
            } 
            return NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_between_any_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1s, c2s, mt, tv);
    }

    public static SubLObject any_disjoint_with_anyP_memoized(final SubLObject cols1, final SubLObject cols2, SubLObject mt, SubLObject assume_cols_not_self_disjointP, SubLObject ignoring_sdcP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (assume_cols_not_self_disjointP == UNPROVIDED) {
            assume_cols_not_self_disjointP = NIL;
        }
        if (ignoring_sdcP == UNPROVIDED) {
            ignoring_sdcP = sdc.$ignoring_sdcP$.getDynamicValue();
        }
        return any_disjoint_with_anyP_memoized_int(kb_utilities.sort_terms(cols1, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), kb_utilities.sort_terms(cols2, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, assume_cols_not_self_disjointP, ignoring_sdcP, UNPROVIDED);
    }

    public static SubLObject any_disjoint_with_anyP_memoized_int_internal(final SubLObject cols1, final SubLObject cols2, final SubLObject mt, final SubLObject assume_cols_not_self_disjointP, final SubLObject ignoring_sdcP, SubLObject exception_transfers_thru_specsP) {
        if (exception_transfers_thru_specsP == UNPROVIDED) {
            exception_transfers_thru_specsP = sdc.$sdc_exception_transfers_thru_specsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(ignoring_sdcP, thread);
            result = any_disjoint_with_anyP_cached(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP);
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject any_disjoint_with_anyP_memoized_int(final SubLObject cols1, final SubLObject cols2, final SubLObject mt, final SubLObject assume_cols_not_self_disjointP, final SubLObject ignoring_sdcP, SubLObject exception_transfers_thru_specsP) {
        if (exception_transfers_thru_specsP == UNPROVIDED) {
            exception_transfers_thru_specsP = sdc.$sdc_exception_transfers_thru_specsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_disjoint_with_anyP_memoized_int_internal(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cols1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cols2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (assume_cols_not_self_disjointP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (ignoring_sdcP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && exception_transfers_thru_specsP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(any_disjoint_with_anyP_memoized_int_internal(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_any_disjoint_with_anyP_cached() {
        final SubLObject cs = $any_disjoint_with_anyP_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_any_disjoint_with_anyP_cached(final SubLObject cols1, final SubLObject cols2, final SubLObject mt, final SubLObject assume_cols_not_self_disjointP, final SubLObject ignoring_sdcP, final SubLObject exception_transfers_thru_specsP) {
        return memoization_state.caching_state_remove_function_results_with_args($any_disjoint_with_anyP_cached_caching_state$.getGlobalValue(), list(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject any_disjoint_with_anyP_cached_internal(final SubLObject cols1, final SubLObject cols2, final SubLObject mt, final SubLObject assume_cols_not_self_disjointP, final SubLObject ignoring_sdcP, final SubLObject exception_transfers_thru_specsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$sdc_exception_transfers_thru_specsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$sdc_exception_transfers_thru_specsP$.bind(exception_transfers_thru_specsP, thread);
            sdc.$ignoring_sdcP$.bind(ignoring_sdcP, thread);
            return any_disjoint_with_anyP(cols1, cols2, mt, NIL, assume_cols_not_self_disjointP);
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_2, thread);
            sdc.$sdc_exception_transfers_thru_specsP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject any_disjoint_with_anyP_cached(final SubLObject cols1, final SubLObject cols2, final SubLObject mt, final SubLObject assume_cols_not_self_disjointP, final SubLObject ignoring_sdcP, final SubLObject exception_transfers_thru_specsP) {
        SubLObject caching_state = $any_disjoint_with_anyP_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym12$ANY_DISJOINT_WITH_ANY__CACHED, $sym14$_ANY_DISJOINT_WITH_ANY__CACHED_CACHING_STATE_, $int$4096, EQUAL, SIX_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym16$CLEAR_ANY_DISJOINT_WITH_ANY__CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cols1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cols2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (assume_cols_not_self_disjointP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (ignoring_sdcP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && exception_transfers_thru_specsP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(any_disjoint_with_anyP_cached_internal(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP));
        return memoization_state.caching_results(results3);
    }

    /**
     * are collections <c1> and <c2> not disjoint?
     */
    @LispMethod(comment = "are collections <c1> and <c2> not disjoint?")
    public static final SubLObject not_disjoint_withP_alt(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1, c2, mt, tv);
    }

    /**
     * are collections <c1> and <c2> not disjoint?
     */
    @LispMethod(comment = "are collections <c1> and <c2> not disjoint?")
    public static SubLObject not_disjoint_withP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1, c2, mt, tv);
    }

    /**
     * is COL-1 disjoint with some all-spec of COL-2?
     */
    @LispMethod(comment = "is COL-1 disjoint with some all-spec of COL-2?")
    public static final SubLObject disjoint_with_specsP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject max_disjoins = com.cyc.cycjava.cycl.disjoint_with.max_all_disjoint_with(col_1, mt, UNPROVIDED);
            return sbhl_search_methods.sbhl_inverse_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genls), col_2, max_disjoins, mt, UNPROVIDED);
        }
    }

    /**
     * is COL-1 disjoint with some all-spec of COL-2?
     */
    @LispMethod(comment = "is COL-1 disjoint with some all-spec of COL-2?")
    public static SubLObject disjoint_with_specsP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject max_disjoins = max_all_disjoint_with(col_1, mt, UNPROVIDED);
        return sbhl_search_methods.sbhl_inverse_relation_with_any_p(sbhl_module_vars.get_sbhl_module($$genls), col_2, max_disjoins, mt, UNPROVIDED);
    }

    /**
     * Are any two collections in COLS disjoint?
     */
    @LispMethod(comment = "Are any two collections in COLS disjoint?")
    public static final SubLObject any_disjoint_collection_pairP_alt(SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(cols, LISTP);
        {
            SubLObject disjointP = NIL;
            SubLObject n = ZERO_INTEGER;
            if (NIL == disjointP) {
                {
                    SubLObject csome_list_var = cols;
                    SubLObject col_1 = NIL;
                    for (col_1 = csome_list_var.first(); !((NIL != disjointP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col_1 = csome_list_var.first()) {
                        n = add(n, ONE_INTEGER);
                        if (NIL == disjointP) {
                            {
                                SubLObject csome_list_var_3 = nthcdr(n, cols);
                                SubLObject col_2 = NIL;
                                for (col_2 = csome_list_var_3.first(); !((NIL != disjointP) || (NIL == csome_list_var_3)); csome_list_var_3 = csome_list_var_3.rest() , col_2 = csome_list_var_3.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.disjoint_with.disjoint_withP(col_1, col_2, mt, UNPROVIDED)) {
                                        disjointP = T;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return disjointP;
        }
    }

    /**
     * Are any two collections in COLS disjoint?
     */
    @LispMethod(comment = "Are any two collections in COLS disjoint?")
    public static SubLObject any_disjoint_collection_pairP(final SubLObject cols, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(cols, LISTP);
        SubLObject disjointP = NIL;
        SubLObject n = ZERO_INTEGER;
        if (NIL == disjointP) {
            SubLObject csome_list_var = cols;
            SubLObject col_1 = NIL;
            col_1 = csome_list_var.first();
            while ((NIL == disjointP) && (NIL != csome_list_var)) {
                n = add(n, ONE_INTEGER);
                if (NIL == disjointP) {
                    SubLObject csome_list_var_$3 = nthcdr(n, cols);
                    SubLObject col_2 = NIL;
                    col_2 = csome_list_var_$3.first();
                    while ((NIL == disjointP) && (NIL != csome_list_var_$3)) {
                        if (NIL != disjoint_withP(col_1, col_2, mt, UNPROVIDED)) {
                            disjointP = T;
                        }
                        csome_list_var_$3 = csome_list_var_$3.rest();
                        col_2 = csome_list_var_$3.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                col_1 = csome_list_var.first();
            } 
        }
        return disjointP;
    }

    /**
     *
     *
     * @see disjoint-with?
     */
    @LispMethod(comment = "@see disjoint-with?")
    public static final SubLObject collections_disjointP_alt(SubLObject col_1, SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(col_1, EL_FORT_P);
        SubLTrampolineFile.checkType(col_2, EL_FORT_P);
        return com.cyc.cycjava.cycl.disjoint_with.disjoint_withP(col_1, col_2, mt, UNPROVIDED);
    }

    /**
     *
     *
     * @see disjoint-with?
     */
    @LispMethod(comment = "@see disjoint-with?")
    public static SubLObject collections_disjointP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(col_1, EL_FORT_P);
        SubLTrampolineFile.enforceType(col_2, EL_FORT_P);
        return disjoint_withP(col_1, col_2, mt, UNPROVIDED);
    }

    /**
     * If collection1 and collection2 are the same, returns T if there is a _known_
     * (i.e. not assumed) reason for believing they are not mdw.
     * If they are not the same, then it considers assumed reasons
     * as well, and returns T if there is some reason for believing
     * they are not mdw with all reasons considered.
     */
    @LispMethod(comment = "If collection1 and collection2 are the same, returns T if there is a _known_\r\n(i.e. not assumed) reason for believing they are not mdw.\r\nIf they are not the same, then it considers assumed reasons\r\nas well, and returns T if there is some reason for believing\r\nthey are not mdw with all reasons considered.\nIf collection1 and collection2 are the same, returns T if there is a _known_\n(i.e. not assumed) reason for believing they are not mdw.\nIf they are not the same, then it considers assumed reasons\nas well, and returns T if there is some reason for believing\nthey are not mdw with all reasons considered.")
    public static final SubLObject basis_for_not_mdwP_alt(SubLObject collection1, SubLObject collection2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject known_not_mdwP = NIL;
                if (collection1 == collection2) {
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$assume_sbhl_extensions_nonempty$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$assume_sbhl_extensions_nonempty$.bind(NIL, thread);
                            known_not_mdwP = com.cyc.cycjava.cycl.disjoint_with.not_disjoint_withP(collection1, collection2, mt, tv);
                        } finally {
                            sbhl_module_vars.$assume_sbhl_extensions_nonempty$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return makeBoolean(((collection1 == collection2) && (NIL != known_not_mdwP)) || ((collection1 != collection2) && (NIL != com.cyc.cycjava.cycl.disjoint_with.not_disjoint_withP(collection1, collection2, mt, tv))));
            }
        }
    }

    /**
     * If collection1 and collection2 are the same, returns T if there is a _known_
     * (i.e. not assumed) reason for believing they are not mdw.
     * If they are not the same, then it considers assumed reasons
     * as well, and returns T if there is some reason for believing
     * they are not mdw with all reasons considered.
     */
    @LispMethod(comment = "If collection1 and collection2 are the same, returns T if there is a _known_\r\n(i.e. not assumed) reason for believing they are not mdw.\r\nIf they are not the same, then it considers assumed reasons\r\nas well, and returns T if there is some reason for believing\r\nthey are not mdw with all reasons considered.\nIf collection1 and collection2 are the same, returns T if there is a _known_\n(i.e. not assumed) reason for believing they are not mdw.\nIf they are not the same, then it considers assumed reasons\nas well, and returns T if there is some reason for believing\nthey are not mdw with all reasons considered.")
    public static SubLObject basis_for_not_mdwP(final SubLObject collection1, final SubLObject collection2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_not_mdwP = NIL;
        if (collection1.eql(collection2)) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$assume_sbhl_extensions_nonempty$.currentBinding(thread);
            try {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.bind(NIL, thread);
                known_not_mdwP = not_disjoint_withP(collection1, collection2, mt, tv);
            } finally {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean((collection1.eql(collection2) && (NIL != known_not_mdwP)) || ((!collection1.eql(collection2)) && (NIL != not_disjoint_withP(collection1, collection2, mt, tv))));
    }

    /**
     * justification of (disjointWith c1 c2)
     */
    @LispMethod(comment = "justification of (disjointWith c1 c2)")
    public static final SubLObject why_disjoint_withP_alt(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1, c2, mt, tv, behavior);
    }

    /**
     * justification of (disjointWith c1 c2)
     */
    @LispMethod(comment = "justification of (disjointWith c1 c2)")
    public static SubLObject why_disjoint_withP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1, c2, mt, tv, behavior);
    }

    /**
     *
     *
     * @see why-disjoint-with?
     */
    @LispMethod(comment = "@see why-disjoint-with?")
    public static final SubLObject why_collections_disjointP_alt(SubLObject c1, SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(c1, EL_FORT_P);
        SubLTrampolineFile.checkType(c2, EL_FORT_P);
        return com.cyc.cycjava.cycl.disjoint_with.why_disjoint_withP(c1, c2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @see why-disjoint-with?
     */
    @LispMethod(comment = "@see why-disjoint-with?")
    public static SubLObject why_collections_disjointP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(c1, EL_FORT_P);
        SubLTrampolineFile.enforceType(c2, EL_FORT_P);
        return why_disjoint_withP(c1, c2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * justification of (not (disjointWith c1 c2))
     */
    @LispMethod(comment = "justification of (not (disjointWith c1 c2))")
    public static final SubLObject why_not_disjoint_withP_alt(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_methods.why_sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1, c2, mt, tv, behavior);
    }

    /**
     * justification of (not (disjointWith c1 c2))
     */
    @LispMethod(comment = "justification of (not (disjointWith c1 c2))")
    public static SubLObject why_not_disjoint_withP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_methods.why_sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$disjointWith), c1, c2, mt, tv, behavior);
    }

    /**
     *
     *
     * @return listp; Returns in what (most-genl) mts COL2 is a disjoint-with of COL1
     */
    @LispMethod(comment = "@return listp; Returns in what (most-genl) mts COL2 is a disjoint-with of COL1")
    public static final SubLObject max_floor_mts_of_disjoint_with_paths_alt(SubLObject col1, SubLObject col2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$disjointWith), col1, col2, tv);
    }

    /**
     *
     *
     * @return listp; Returns in what (most-genl) mts COL2 is a disjoint-with of COL1
     */
    @LispMethod(comment = "@return listp; Returns in what (most-genl) mts COL2 is a disjoint-with of COL1")
    public static SubLObject max_floor_mts_of_disjoint_with_paths(final SubLObject col1, final SubLObject col2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$disjointWith), col1, col2, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with disjoint-with paths from COL1 to COL2?
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with disjoint-with paths from COL1 to COL2?")
    public static final SubLObject min_mts_of_disjoint_with_paths_alt(SubLObject col1, SubLObject col2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$disjointWith), col1, col2, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with disjoint-with paths from COL1 to COL2?
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with disjoint-with paths from COL1 to COL2?")
    public static SubLObject min_mts_of_disjoint_with_paths(final SubLObject col1, final SubLObject col2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$disjointWith), col1, col2, tv);
    }

    /**
     *
     *
     * @return listp; the most genl mts by which COL2 is accessible to COL1 by a false disjoint-with path.
     */
    @LispMethod(comment = "@return listp; the most genl mts by which COL2 is accessible to COL1 by a false disjoint-with path.")
    public static final SubLObject max_floor_mts_of_not_disjoint_with_paths_alt(SubLObject col1, SubLObject col2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module($$disjointWith), col2, col1, tv);
    }

    /**
     *
     *
     * @return listp; the most genl mts by which COL2 is accessible to COL1 by a false disjoint-with path.
     */
    @LispMethod(comment = "@return listp; the most genl mts by which COL2 is accessible to COL1 by a false disjoint-with path.")
    public static SubLObject max_floor_mts_of_not_disjoint_with_paths(final SubLObject col1, final SubLObject col2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module($$disjointWith), col2, col1, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with false disjoint-with paths from COL1 to COL2?.
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with false disjoint-with paths from COL1 to COL2?.")
    public static final SubLObject min_mts_of_not_disjoint_with_paths_alt(SubLObject col1, SubLObject col2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module($$disjointWith), col2, col1, tv);
    }

    /**
     *
     *
     * @return listp; what minimal sets of mts are associated with false disjoint-with paths from COL1 to COL2?.
     */
    @LispMethod(comment = "@return listp; what minimal sets of mts are associated with false disjoint-with paths from COL1 to COL2?.")
    public static SubLObject min_mts_of_not_disjoint_with_paths(final SubLObject col1, final SubLObject col2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module($$disjointWith), col2, col1, tv);
    }

    /**
     *
     *
     * @return listp; the microtheories in which COL has disjoint-with assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which COL has disjoint-with assertions.")
    public static final SubLObject disjoint_with_mts_alt(SubLObject col) {
        return kb_accessors.pred_mts(col, $$disjointWith, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the microtheories in which COL has disjoint-with assertions.
     */
    @LispMethod(comment = "@return listp; the microtheories in which COL has disjoint-with assertions.")
    public static SubLObject disjoint_with_mts(final SubLObject col) {
        return kb_accessors.pred_mts(col, $$disjointWith, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the asserted true links for COL in MT / *mt* via disjoint-with.
     */
    @LispMethod(comment = "@return listp; the asserted true links for COL in MT / *mt* via disjoint-with.")
    public static final SubLObject asserted_disjoint_with_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted true links for COL in MT / *mt* via disjoint-with.
     */
    @LispMethod(comment = "@return listp; the asserted true links for COL in MT / *mt* via disjoint-with.")
    public static SubLObject asserted_disjoint_with(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false links for COL in MT / *mt* via disjoint-with.
     */
    @LispMethod(comment = "@return listp; the asserted false links for COL in MT / *mt* via disjoint-with.")
    public static final SubLObject asserted_not_disjoint_with_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt);
    }

    /**
     *
     *
     * @return listp; the asserted false links for COL in MT / *mt* via disjoint-with.
     */
    @LispMethod(comment = "@return listp; the asserted false links for COL in MT / *mt* via disjoint-with.")
    public static SubLObject asserted_not_disjoint_with(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported true links for COL in MT / *mt* via disjoint-with.
     */
    @LispMethod(comment = "@return listp; the supported true links for COL in MT / *mt* via disjoint-with.")
    public static final SubLObject supported_disjoint_with_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported true links for COL in MT / *mt* via disjoint-with.
     */
    @LispMethod(comment = "@return listp; the supported true links for COL in MT / *mt* via disjoint-with.")
    public static SubLObject supported_disjoint_with(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported false links for COL in MT / *mt* via disjoint-with.
     */
    @LispMethod(comment = "@return listp; the supported false links for COL in MT / *mt* via disjoint-with.")
    public static final SubLObject supported_not_disjoint_with_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt);
    }

    /**
     *
     *
     * @return listp; the supported false links for COL in MT / *mt* via disjoint-with.
     */
    @LispMethod(comment = "@return listp; the supported false links for COL in MT / *mt* via disjoint-with.")
    public static SubLObject supported_not_disjoint_with(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$disjointWith), col, mt);
    }

    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static final SubLObject mdw_after_adding_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$disjointWith));
        return NIL;
    }

    /**
     * Modifier. Adds sbhl links with @see sbhl-after-adding.
     */
    @LispMethod(comment = "Modifier. Adds sbhl links with @see sbhl-after-adding.")
    public static SubLObject mdw_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$disjointWith));
        return NIL;
    }

    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static final SubLObject mdw_after_removing_alt(SubLObject source, SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$disjointWith));
        return NIL;
    }

    /**
     * Modifier. Removes sbhl links with @see sbhl-after-removing.
     */
    @LispMethod(comment = "Modifier. Removes sbhl links with @see sbhl-after-removing.")
    public static SubLObject mdw_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$disjointWith));
        return NIL;
    }

    public static final SubLObject clear_mdw_graph_alt() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$disjointWith));
        return NIL;
    }

    public static SubLObject clear_mdw_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$disjointWith));
        return NIL;
    }

    public static final SubLObject clear_node_mdw_links_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$disjointWith), thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$disjointWith)), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$disjointWith)), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$disjointWith), thread);
                    {
                        SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$disjointWith), node);
                        SubLObject mt = NIL;
                        for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                            if (NIL != fort_types_interface.collectionP(node)) {
                                sbhl_link_methods.clear_sbhl_links_within_mt(node, mt, UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject clear_node_mdw_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$disjointWith), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$disjointWith)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$disjointWith)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$disjointWith), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$disjointWith), node);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.collectionP(node)) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(node, mt, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject reset_mdw_links_alt(SubLObject col) {
        {
            SubLObject mts = com.cyc.cycjava.cycl.disjoint_with.disjoint_with_mts(col);
            com.cyc.cycjava.cycl.disjoint_with.clear_node_mdw_links(col);
            {
                SubLObject cdolist_list_var = mts;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    if (NIL != fort_types_interface.collectionP(col)) {
                        com.cyc.cycjava.cycl.disjoint_with.reset_mdw_links_in_mt(col, mt);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject reset_mdw_links(final SubLObject col) {
        final SubLObject mts = disjoint_with_mts(col);
        clear_node_mdw_links(col);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.collectionP(col)) {
                reset_mdw_links_in_mt(col, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject reset_mdw_links_in_mt_alt(SubLObject col, SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(col, mt, sbhl_module_vars.get_sbhl_module($$disjointWith));
        return NIL;
    }

    public static SubLObject reset_mdw_links_in_mt(final SubLObject col, final SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(col, mt, sbhl_module_vars.get_sbhl_module($$disjointWith));
        return NIL;
    }

    public static final SubLObject reset_mdw_graph_alt(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            com.cyc.cycjava.cycl.disjoint_with.clear_mdw_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$disjointWith));
        return NIL;
    }

    public static SubLObject reset_mdw_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            clear_mdw_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$disjointWith));
        return NIL;
    }

    public static final SubLObject maximal_consistent_subsets_alt(SubLObject cols) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject disjointness_map = com.cyc.cycjava.cycl.disjoint_with.disjointness_map(cols);
                SubLObject subsets = NIL;
                if (NIL != dictionary.dictionary_empty_p(disjointness_map)) {
                    subsets = list(cols);
                } else {
                    {
                        SubLObject _prev_bind_0 = $maximal_consistent_subsets$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $maximal_consistent_subsets_visited_subsets$.currentBinding(thread);
                        try {
                            $maximal_consistent_subsets$.bind(NIL, thread);
                            $maximal_consistent_subsets_visited_subsets$.bind(set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                            com.cyc.cycjava.cycl.disjoint_with.maximal_consistent_subsets_recursive(cols, disjointness_map);
                            subsets = delete_subsumed_items($maximal_consistent_subsets$.getDynamicValue(thread), SUPERSETP, UNPROVIDED);
                        } finally {
                            $maximal_consistent_subsets_visited_subsets$.rebind(_prev_bind_1, thread);
                            $maximal_consistent_subsets$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return subsets;
            }
        }
    }

    public static SubLObject maximal_consistent_subsets(final SubLObject cols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disjointness_map = disjointness_map(cols);
        SubLObject subsets = NIL;
        if (NIL != dictionary.dictionary_empty_p(disjointness_map)) {
            subsets = list(cols);
        } else {
            final SubLObject _prev_bind_0 = $maximal_consistent_subsets$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $maximal_consistent_subsets_visited_subsets$.currentBinding(thread);
            try {
                $maximal_consistent_subsets$.bind(NIL, thread);
                $maximal_consistent_subsets_visited_subsets$.bind(set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
                maximal_consistent_subsets_recursive(cols, disjointness_map);
                subsets = list_utilities.delete_subsumed_items($maximal_consistent_subsets$.getDynamicValue(thread), SUPERSETP, UNPROVIDED);
            } finally {
                $maximal_consistent_subsets_visited_subsets$.rebind(_prev_bind_2, thread);
                $maximal_consistent_subsets$.rebind(_prev_bind_0, thread);
            }
        }
        return subsets;
    }

    public static final SubLObject maximal_consistent_subsetP_alt(SubLObject cols, SubLObject subset) {
        {
            SubLObject maximal_consistent_subsetP = NIL;
            if (NIL != subsetp(subset, cols, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject disjointness_map = com.cyc.cycjava.cycl.disjoint_with.disjointness_map(cols);
                    if (NIL == com.cyc.cycjava.cycl.disjoint_with.first_disjointness(subset, disjointness_map)) {
                        {
                            SubLObject remaining_cols = set_difference(cols, subset, symbol_function(EQUAL), UNPROVIDED);
                            SubLObject failureP = NIL;
                            if (NIL == failureP) {
                                {
                                    SubLObject csome_list_var = remaining_cols;
                                    SubLObject col = NIL;
                                    for (col = csome_list_var.first(); !((NIL != failureP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                        {
                                            SubLObject disjoint_cols = dictionary.dictionary_lookup_without_values(disjointness_map, col, UNPROVIDED);
                                            if (NIL == keyhash_utilities.fast_intersectP(subset, disjoint_cols, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED)) {
                                                failureP = T;
                                            }
                                        }
                                    }
                                }
                            }
                            maximal_consistent_subsetP = makeBoolean(NIL == failureP);
                        }
                    }
                }
            }
            return maximal_consistent_subsetP;
        }
    }

    public static SubLObject maximal_consistent_subsetP(final SubLObject cols, final SubLObject subset) {
        SubLObject maximal_consistent_subsetP = NIL;
        if (NIL != subsetp(subset, cols, UNPROVIDED, UNPROVIDED)) {
            final SubLObject disjointness_map = disjointness_map(cols);
            if (NIL == first_disjointness(subset, disjointness_map)) {
                final SubLObject remaining_cols = set_difference(cols, subset, symbol_function(EQUAL), UNPROVIDED);
                SubLObject failureP = NIL;
                if (NIL == failureP) {
                    SubLObject csome_list_var = remaining_cols;
                    SubLObject col = NIL;
                    col = csome_list_var.first();
                    while ((NIL == failureP) && (NIL != csome_list_var)) {
                        final SubLObject disjoint_cols = dictionary.dictionary_lookup_without_values(disjointness_map, col, UNPROVIDED);
                        if (NIL == keyhash_utilities.fast_intersectP(subset, disjoint_cols, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED)) {
                            failureP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        col = csome_list_var.first();
                    } 
                }
                maximal_consistent_subsetP = makeBoolean(NIL == failureP);
            }
        }
        return maximal_consistent_subsetP;
    }

    public static final SubLObject maximal_consistent_subsets_recursive_alt(SubLObject cols, SubLObject disjointness_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != set.set_memberP(cols, $maximal_consistent_subsets_visited_subsets$.getDynamicValue(thread))) || (NIL != subl_promotions.memberP(cols, $maximal_consistent_subsets$.getDynamicValue(thread), symbol_function(SUBSETP), UNPROVIDED)))) {
                set.set_add(cols, $maximal_consistent_subsets_visited_subsets$.getDynamicValue(thread));
                {
                    SubLObject first_disjointness = com.cyc.cycjava.cycl.disjoint_with.first_disjointness(cols, disjointness_map);
                    if (NIL != first_disjointness) {
                        {
                            SubLObject cols1 = remove(first_disjointness.first(), cols, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cols2 = set_difference(cols, first_disjointness.rest(), symbol_function(EQUAL), UNPROVIDED);
                            com.cyc.cycjava.cycl.disjoint_with.maximal_consistent_subsets_recursive(cols1, disjointness_map);
                            com.cyc.cycjava.cycl.disjoint_with.maximal_consistent_subsets_recursive(cols2, disjointness_map);
                        }
                    } else {
                        $maximal_consistent_subsets$.setDynamicValue(cons(cols, $maximal_consistent_subsets$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject maximal_consistent_subsets_recursive(final SubLObject cols, final SubLObject disjointness_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == set.set_memberP(cols, $maximal_consistent_subsets_visited_subsets$.getDynamicValue(thread))) && (NIL == subl_promotions.memberP(cols, $maximal_consistent_subsets$.getDynamicValue(thread), symbol_function(SUBSETP), UNPROVIDED))) {
            set.set_add(cols, $maximal_consistent_subsets_visited_subsets$.getDynamicValue(thread));
            final SubLObject first_disjointness = first_disjointness(cols, disjointness_map);
            if (NIL != first_disjointness) {
                final SubLObject cols2 = remove(first_disjointness.first(), cols, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject cols3 = set_difference(cols, first_disjointness.rest(), symbol_function(EQUAL), UNPROVIDED);
                maximal_consistent_subsets_recursive(cols2, disjointness_map);
                maximal_consistent_subsets_recursive(cols3, disjointness_map);
            } else {
                $maximal_consistent_subsets$.setDynamicValue(cons(cols, $maximal_consistent_subsets$.getDynamicValue(thread)), thread);
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt4$Returns_a_pair_of_disjoint_elemen = makeString("Returns a pair of disjoint elements of COLS (if any exist)");

    static private final SubLList $list_alt5 = list(list(makeSymbol("COLS"), makeSymbol("LISTP")));

    public static final SubLObject disjointness_map_alt(SubLObject cols) {
        {
            SubLObject disjointness_map = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdr_var = NIL;
            for (cdr_var = cols; !cdr_var.isAtom(); cdr_var = cdr_var.rest()) {
                {
                    SubLObject col = cdr_var.first();
                    SubLObject remainder = cdr_var.rest();
                    SubLObject cdolist_list_var = remainder;
                    SubLObject other_col = NIL;
                    for (other_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_col = cdolist_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.disjoint_with.disjoint_withP(col, other_col, UNPROVIDED, UNPROVIDED)) {
                            dictionary_utilities.dictionary_pushnew(disjointness_map, col, other_col, symbol_function(EQUAL), UNPROVIDED);
                            dictionary_utilities.dictionary_pushnew(disjointness_map, other_col, col, symbol_function(EQUAL), UNPROVIDED);
                        }
                    }
                }
            }
            return disjointness_map;
        }
    }

    public static SubLObject disjointness_map(final SubLObject cols) {
        final SubLObject disjointness_map = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdr_var;
        SubLObject col;
        SubLObject cdolist_list_var;
        SubLObject remainder;
        SubLObject other_col;
        for (cdr_var = NIL, cdr_var = cols; !cdr_var.isAtom(); cdr_var = cdr_var.rest()) {
            col = cdr_var.first();
            remainder = cdolist_list_var = cdr_var.rest();
            other_col = NIL;
            other_col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != disjoint_withP(col, other_col, UNPROVIDED, UNPROVIDED)) {
                    dictionary_utilities.dictionary_pushnew(disjointness_map, col, other_col, symbol_function(EQUAL), UNPROVIDED);
                    dictionary_utilities.dictionary_pushnew(disjointness_map, other_col, col, symbol_function(EQUAL), UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                other_col = cdolist_list_var.first();
            } 
        }
        return disjointness_map;
    }

    static private final SubLList $list_alt6 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));

    static private final SubLSymbol $sym11$ANY_DISJOINT_COLLECTION_PAIR_ = makeSymbol("ANY-DISJOINT-COLLECTION-PAIR?");

    static private final SubLString $str_alt12$Are_any_two_collections_in_COLS_d = makeString("Are any two collections in COLS disjoint?");

    static private final SubLList $list_alt13 = list(makeSymbol("BOOLEANP"));

    static private final SubLSymbol $sym15$COLLECTIONS_DISJOINT_ = makeSymbol("COLLECTIONS-DISJOINT?");

    static private final SubLList $list_alt16 = list(makeSymbol("DISJOINT-WITH?"));

    static private final SubLList $list_alt17 = list(makeSymbol("COL-1"), makeSymbol("COL-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt18$_see_disjoint_with_ = makeString("@see disjoint-with?");

    static private final SubLList $list_alt19 = list(list(makeSymbol("COL-1"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-2"), makeSymbol("EL-FORT-P")));

    public static final SubLObject first_disjointness_alt(SubLObject subset, SubLObject disjointness_map) {
        {
            SubLObject first_disjointness = NIL;
            SubLObject cdr_var = NIL;
            for (cdr_var = subset; !((NIL != first_disjointness) || cdr_var.isAtom()); cdr_var = cdr_var.rest()) {
                {
                    SubLObject col = cdr_var.first();
                    SubLObject tail = cdr_var.rest();
                    if (NIL != tail) {
                        {
                            SubLObject disjoint_cols = dictionary.dictionary_lookup_without_values(disjointness_map, col, UNPROVIDED);
                            SubLObject intersection = keyhash_utilities.fast_intersection(disjoint_cols, tail, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                            if (NIL != intersection) {
                                first_disjointness = cons(col, intersection);
                            }
                        }
                    }
                }
            }
            return first_disjointness;
        }
    }

    public static SubLObject first_disjointness(final SubLObject subset, final SubLObject disjointness_map) {
        SubLObject first_disjointness;
        SubLObject cdr_var;
        SubLObject col;
        SubLObject tail;
        SubLObject disjoint_cols;
        SubLObject intersection;
        for (first_disjointness = NIL, cdr_var = NIL, cdr_var = subset; (NIL == first_disjointness) && (!cdr_var.isAtom()); cdr_var = cdr_var.rest()) {
            col = cdr_var.first();
            tail = cdr_var.rest();
            if (NIL != tail) {
                disjoint_cols = dictionary.dictionary_lookup_without_values(disjointness_map, col, UNPROVIDED);
                intersection = keyhash_utilities.fast_intersection(disjoint_cols, tail, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                if (NIL != intersection) {
                    first_disjointness = cons(col, intersection);
                }
            }
        }
        return first_disjointness;
    }

    static private final SubLSymbol $sym20$WHY_COLLECTIONS_DISJOINT_ = makeSymbol("WHY-COLLECTIONS-DISJOINT?");

    static private final SubLList $list_alt21 = list(makeSymbol("WHY-DISJOINT-WITH?"));

    static private final SubLList $list_alt22 = list(makeSymbol("C1"), makeSymbol("C2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt23$_see_why_disjoint_with_ = makeString("@see why-disjoint-with?");

    static private final SubLList $list_alt24 = list(list(makeSymbol("C1"), makeSymbol("EL-FORT-P")), list(makeSymbol("C2"), makeSymbol("EL-FORT-P")));

    static private final SubLList $list_alt25 = list(makeSymbol("LISTP"));

    public static final SubLObject declare_disjoint_with_file_alt() {
        declareFunction("local_disjoint_with", "LOCAL-DISJOINT-WITH", 1, 2, false);
        declareFunction("local_max_disjoint_with", "LOCAL-MAX-DISJOINT-WITH", 1, 2, false);
        declareFunction("local_not_disjoint_with", "LOCAL-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("local_min_not_disjoint_with", "LOCAL-MIN-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("all_disjoint_with", "ALL-DISJOINT-WITH", 1, 2, false);
        declareFunction("all_not_disjoint_with", "ALL-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("max_all_disjoint_with", "MAX-ALL-DISJOINT-WITH", 1, 2, false);
        declareFunction("max_all_disjoint_with_no_sdc", "MAX-ALL-DISJOINT-WITH-NO-SDC", 1, 2, false);
        declareFunction("min_all_not_disjoint_with", "MIN-ALL-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("min_implied_not_disjoint_with", "MIN-IMPLIED-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("min_all_asserted_not_disjoint_with", "MIN-ALL-ASSERTED-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("any_disjoint_collection_pair", "ANY-DISJOINT-COLLECTION-PAIR", 1, 1, false);
        declareFunction("sbhl_record_max_true_disjoint_with", "SBHL-RECORD-MAX-TRUE-DISJOINT-WITH", 1, 2, false);
        declareFunction("sbhl_unrecord_max_true_disjoint_with", "SBHL-UNRECORD-MAX-TRUE-DISJOINT-WITH", 1, 2, false);
        declareFunction("instances_of_disjoint_collectionsP", "INSTANCES-OF-DISJOINT-COLLECTIONS?", 2, 2, false);
        declareFunction("why_instances_of_disjoint_collections", "WHY-INSTANCES-OF-DISJOINT-COLLECTIONS", 2, 2, false);
        declareFunction("disjoint_withP", "DISJOINT-WITH?", 2, 2, false);
        declareFunction("nat_disjoint_withP", "NAT-DISJOINT-WITH?", 2, 2, false);
        declareFunction("any_disjoint_withP", "ANY-DISJOINT-WITH?", 2, 2, false);
        declareFunction("any_disjoint_with_anyP", "ANY-DISJOINT-WITH-ANY?", 2, 2, false);
        declareFunction("not_disjoint_withP", "NOT-DISJOINT-WITH?", 2, 2, false);
        declareFunction("disjoint_with_specsP", "DISJOINT-WITH-SPECS?", 2, 1, false);
        declareFunction("any_disjoint_collection_pairP", "ANY-DISJOINT-COLLECTION-PAIR?", 1, 1, false);
        declareFunction("collections_disjointP", "COLLECTIONS-DISJOINT?", 2, 1, false);
        declareFunction("basis_for_not_mdwP", "BASIS-FOR-NOT-MDW?", 2, 2, false);
        declareFunction("why_disjoint_withP", "WHY-DISJOINT-WITH?", 2, 3, false);
        declareFunction("why_collections_disjointP", "WHY-COLLECTIONS-DISJOINT?", 2, 1, false);
        declareFunction("why_not_disjoint_withP", "WHY-NOT-DISJOINT-WITH?", 2, 3, false);
        declareFunction("max_floor_mts_of_disjoint_with_paths", "MAX-FLOOR-MTS-OF-DISJOINT-WITH-PATHS", 2, 1, false);
        declareFunction("min_mts_of_disjoint_with_paths", "MIN-MTS-OF-DISJOINT-WITH-PATHS", 2, 1, false);
        declareFunction("max_floor_mts_of_not_disjoint_with_paths", "MAX-FLOOR-MTS-OF-NOT-DISJOINT-WITH-PATHS", 2, 1, false);
        declareFunction("min_mts_of_not_disjoint_with_paths", "MIN-MTS-OF-NOT-DISJOINT-WITH-PATHS", 2, 1, false);
        declareFunction("disjoint_with_mts", "DISJOINT-WITH-MTS", 1, 0, false);
        declareFunction("asserted_disjoint_with", "ASSERTED-DISJOINT-WITH", 1, 1, false);
        declareFunction("asserted_not_disjoint_with", "ASSERTED-NOT-DISJOINT-WITH", 1, 1, false);
        declareFunction("supported_disjoint_with", "SUPPORTED-DISJOINT-WITH", 1, 1, false);
        declareFunction("supported_not_disjoint_with", "SUPPORTED-NOT-DISJOINT-WITH", 1, 1, false);
        declareFunction("mdw_after_adding", "MDW-AFTER-ADDING", 2, 0, false);
        declareFunction("mdw_after_removing", "MDW-AFTER-REMOVING", 2, 0, false);
        declareFunction("clear_mdw_graph", "CLEAR-MDW-GRAPH", 0, 0, false);
        declareFunction("clear_node_mdw_links", "CLEAR-NODE-MDW-LINKS", 1, 0, false);
        declareFunction("reset_mdw_links", "RESET-MDW-LINKS", 1, 0, false);
        declareFunction("reset_mdw_links_in_mt", "RESET-MDW-LINKS-IN-MT", 2, 0, false);
        declareFunction("reset_mdw_graph", "RESET-MDW-GRAPH", 0, 1, false);
        declareFunction("maximal_consistent_subsets", "MAXIMAL-CONSISTENT-SUBSETS", 1, 0, false);
        declareFunction("maximal_consistent_subsetP", "MAXIMAL-CONSISTENT-SUBSET?", 2, 0, false);
        declareFunction("maximal_consistent_subsets_recursive", "MAXIMAL-CONSISTENT-SUBSETS-RECURSIVE", 2, 0, false);
        declareFunction("disjointness_map", "DISJOINTNESS-MAP", 1, 0, false);
        declareFunction("first_disjointness", "FIRST-DISJOINTNESS", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_disjoint_with_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("local_disjoint_with", "LOCAL-DISJOINT-WITH", 1, 2, false);
            declareFunction("local_max_disjoint_with", "LOCAL-MAX-DISJOINT-WITH", 1, 2, false);
            declareFunction("local_not_disjoint_with", "LOCAL-NOT-DISJOINT-WITH", 1, 2, false);
            declareFunction("local_min_not_disjoint_with", "LOCAL-MIN-NOT-DISJOINT-WITH", 1, 2, false);
            declareFunction("all_disjoint_with", "ALL-DISJOINT-WITH", 1, 2, false);
            declareFunction("all_not_disjoint_with", "ALL-NOT-DISJOINT-WITH", 1, 2, false);
            declareFunction("max_all_disjoint_with", "MAX-ALL-DISJOINT-WITH", 1, 2, false);
            declareFunction("max_all_disjoint_with_no_sdc", "MAX-ALL-DISJOINT-WITH-NO-SDC", 1, 2, false);
            declareFunction("min_all_not_disjoint_with", "MIN-ALL-NOT-DISJOINT-WITH", 1, 2, false);
            declareFunction("min_implied_not_disjoint_with", "MIN-IMPLIED-NOT-DISJOINT-WITH", 1, 2, false);
            declareFunction("min_all_asserted_not_disjoint_with", "MIN-ALL-ASSERTED-NOT-DISJOINT-WITH", 1, 2, false);
            declareFunction("any_disjoint_collection_pair", "ANY-DISJOINT-COLLECTION-PAIR", 1, 1, false);
            declareFunction("sbhl_record_max_true_disjoint_with", "SBHL-RECORD-MAX-TRUE-DISJOINT-WITH", 1, 2, false);
            declareFunction("sbhl_unrecord_max_true_disjoint_with", "SBHL-UNRECORD-MAX-TRUE-DISJOINT-WITH", 1, 2, false);
            declareFunction("instances_of_disjoint_collectionsP", "INSTANCES-OF-DISJOINT-COLLECTIONS?", 2, 2, false);
            declareFunction("why_instances_of_disjoint_collections", "WHY-INSTANCES-OF-DISJOINT-COLLECTIONS", 2, 2, false);
            declareFunction("disjoint_withP", "DISJOINT-WITH?", 2, 2, false);
            declareFunction("nat_disjoint_withP", "NAT-DISJOINT-WITH?", 2, 2, false);
            declareFunction("any_disjoint_withP", "ANY-DISJOINT-WITH?", 2, 2, false);
            declareFunction("any_disjoint_with_anyP", "ANY-DISJOINT-WITH-ANY?", 2, 3, false);
            declareFunction("any_disjoint_with_anyP_memoized", "ANY-DISJOINT-WITH-ANY?-MEMOIZED", 2, 3, false);
            declareFunction("any_disjoint_with_anyP_memoized_int_internal", "ANY-DISJOINT-WITH-ANY?-MEMOIZED-INT-INTERNAL", 5, 1, false);
            declareFunction("any_disjoint_with_anyP_memoized_int", "ANY-DISJOINT-WITH-ANY?-MEMOIZED-INT", 5, 1, false);
            declareFunction("clear_any_disjoint_with_anyP_cached", "CLEAR-ANY-DISJOINT-WITH-ANY?-CACHED", 0, 0, false);
            declareFunction("remove_any_disjoint_with_anyP_cached", "REMOVE-ANY-DISJOINT-WITH-ANY?-CACHED", 6, 0, false);
            declareFunction("any_disjoint_with_anyP_cached_internal", "ANY-DISJOINT-WITH-ANY?-CACHED-INTERNAL", 6, 0, false);
            declareFunction("any_disjoint_with_anyP_cached", "ANY-DISJOINT-WITH-ANY?-CACHED", 6, 0, false);
            declareFunction("not_disjoint_withP", "NOT-DISJOINT-WITH?", 2, 2, false);
            declareFunction("disjoint_with_specsP", "DISJOINT-WITH-SPECS?", 2, 1, false);
            declareFunction("any_disjoint_collection_pairP", "ANY-DISJOINT-COLLECTION-PAIR?", 1, 1, false);
            declareFunction("collections_disjointP", "COLLECTIONS-DISJOINT?", 2, 1, false);
            declareFunction("basis_for_not_mdwP", "BASIS-FOR-NOT-MDW?", 2, 2, false);
            declareFunction("why_disjoint_withP", "WHY-DISJOINT-WITH?", 2, 3, false);
            declareFunction("why_collections_disjointP", "WHY-COLLECTIONS-DISJOINT?", 2, 1, false);
            declareFunction("why_not_disjoint_withP", "WHY-NOT-DISJOINT-WITH?", 2, 3, false);
            declareFunction("max_floor_mts_of_disjoint_with_paths", "MAX-FLOOR-MTS-OF-DISJOINT-WITH-PATHS", 2, 1, false);
            declareFunction("min_mts_of_disjoint_with_paths", "MIN-MTS-OF-DISJOINT-WITH-PATHS", 2, 1, false);
            declareFunction("max_floor_mts_of_not_disjoint_with_paths", "MAX-FLOOR-MTS-OF-NOT-DISJOINT-WITH-PATHS", 2, 1, false);
            declareFunction("min_mts_of_not_disjoint_with_paths", "MIN-MTS-OF-NOT-DISJOINT-WITH-PATHS", 2, 1, false);
            declareFunction("disjoint_with_mts", "DISJOINT-WITH-MTS", 1, 0, false);
            declareFunction("asserted_disjoint_with", "ASSERTED-DISJOINT-WITH", 1, 1, false);
            declareFunction("asserted_not_disjoint_with", "ASSERTED-NOT-DISJOINT-WITH", 1, 1, false);
            declareFunction("supported_disjoint_with", "SUPPORTED-DISJOINT-WITH", 1, 1, false);
            declareFunction("supported_not_disjoint_with", "SUPPORTED-NOT-DISJOINT-WITH", 1, 1, false);
            declareFunction("mdw_after_adding", "MDW-AFTER-ADDING", 2, 0, false);
            declareFunction("mdw_after_removing", "MDW-AFTER-REMOVING", 2, 0, false);
            declareFunction("clear_mdw_graph", "CLEAR-MDW-GRAPH", 0, 0, false);
            declareFunction("clear_node_mdw_links", "CLEAR-NODE-MDW-LINKS", 1, 0, false);
            declareFunction("reset_mdw_links", "RESET-MDW-LINKS", 1, 0, false);
            declareFunction("reset_mdw_links_in_mt", "RESET-MDW-LINKS-IN-MT", 2, 0, false);
            declareFunction("reset_mdw_graph", "RESET-MDW-GRAPH", 0, 1, false);
            declareFunction("maximal_consistent_subsets", "MAXIMAL-CONSISTENT-SUBSETS", 1, 0, false);
            declareFunction("maximal_consistent_subsetP", "MAXIMAL-CONSISTENT-SUBSET?", 2, 0, false);
            declareFunction("maximal_consistent_subsets_recursive", "MAXIMAL-CONSISTENT-SUBSETS-RECURSIVE", 2, 0, false);
            declareFunction("disjointness_map", "DISJOINTNESS-MAP", 1, 0, false);
            declareFunction("first_disjointness", "FIRST-DISJOINTNESS", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("any_disjoint_with_anyP", "ANY-DISJOINT-WITH-ANY?", 2, 2, false);
        }
        return NIL;
    }

    public static SubLObject declare_disjoint_with_file_Previous() {
        declareFunction("local_disjoint_with", "LOCAL-DISJOINT-WITH", 1, 2, false);
        declareFunction("local_max_disjoint_with", "LOCAL-MAX-DISJOINT-WITH", 1, 2, false);
        declareFunction("local_not_disjoint_with", "LOCAL-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("local_min_not_disjoint_with", "LOCAL-MIN-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("all_disjoint_with", "ALL-DISJOINT-WITH", 1, 2, false);
        declareFunction("all_not_disjoint_with", "ALL-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("max_all_disjoint_with", "MAX-ALL-DISJOINT-WITH", 1, 2, false);
        declareFunction("max_all_disjoint_with_no_sdc", "MAX-ALL-DISJOINT-WITH-NO-SDC", 1, 2, false);
        declareFunction("min_all_not_disjoint_with", "MIN-ALL-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("min_implied_not_disjoint_with", "MIN-IMPLIED-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("min_all_asserted_not_disjoint_with", "MIN-ALL-ASSERTED-NOT-DISJOINT-WITH", 1, 2, false);
        declareFunction("any_disjoint_collection_pair", "ANY-DISJOINT-COLLECTION-PAIR", 1, 1, false);
        declareFunction("sbhl_record_max_true_disjoint_with", "SBHL-RECORD-MAX-TRUE-DISJOINT-WITH", 1, 2, false);
        declareFunction("sbhl_unrecord_max_true_disjoint_with", "SBHL-UNRECORD-MAX-TRUE-DISJOINT-WITH", 1, 2, false);
        declareFunction("instances_of_disjoint_collectionsP", "INSTANCES-OF-DISJOINT-COLLECTIONS?", 2, 2, false);
        declareFunction("why_instances_of_disjoint_collections", "WHY-INSTANCES-OF-DISJOINT-COLLECTIONS", 2, 2, false);
        declareFunction("disjoint_withP", "DISJOINT-WITH?", 2, 2, false);
        declareFunction("nat_disjoint_withP", "NAT-DISJOINT-WITH?", 2, 2, false);
        declareFunction("any_disjoint_withP", "ANY-DISJOINT-WITH?", 2, 2, false);
        declareFunction("any_disjoint_with_anyP", "ANY-DISJOINT-WITH-ANY?", 2, 3, false);
        declareFunction("any_disjoint_with_anyP_memoized", "ANY-DISJOINT-WITH-ANY?-MEMOIZED", 2, 3, false);
        declareFunction("any_disjoint_with_anyP_memoized_int_internal", "ANY-DISJOINT-WITH-ANY?-MEMOIZED-INT-INTERNAL", 5, 1, false);
        declareFunction("any_disjoint_with_anyP_memoized_int", "ANY-DISJOINT-WITH-ANY?-MEMOIZED-INT", 5, 1, false);
        declareFunction("clear_any_disjoint_with_anyP_cached", "CLEAR-ANY-DISJOINT-WITH-ANY?-CACHED", 0, 0, false);
        declareFunction("remove_any_disjoint_with_anyP_cached", "REMOVE-ANY-DISJOINT-WITH-ANY?-CACHED", 6, 0, false);
        declareFunction("any_disjoint_with_anyP_cached_internal", "ANY-DISJOINT-WITH-ANY?-CACHED-INTERNAL", 6, 0, false);
        declareFunction("any_disjoint_with_anyP_cached", "ANY-DISJOINT-WITH-ANY?-CACHED", 6, 0, false);
        declareFunction("not_disjoint_withP", "NOT-DISJOINT-WITH?", 2, 2, false);
        declareFunction("disjoint_with_specsP", "DISJOINT-WITH-SPECS?", 2, 1, false);
        declareFunction("any_disjoint_collection_pairP", "ANY-DISJOINT-COLLECTION-PAIR?", 1, 1, false);
        declareFunction("collections_disjointP", "COLLECTIONS-DISJOINT?", 2, 1, false);
        declareFunction("basis_for_not_mdwP", "BASIS-FOR-NOT-MDW?", 2, 2, false);
        declareFunction("why_disjoint_withP", "WHY-DISJOINT-WITH?", 2, 3, false);
        declareFunction("why_collections_disjointP", "WHY-COLLECTIONS-DISJOINT?", 2, 1, false);
        declareFunction("why_not_disjoint_withP", "WHY-NOT-DISJOINT-WITH?", 2, 3, false);
        declareFunction("max_floor_mts_of_disjoint_with_paths", "MAX-FLOOR-MTS-OF-DISJOINT-WITH-PATHS", 2, 1, false);
        declareFunction("min_mts_of_disjoint_with_paths", "MIN-MTS-OF-DISJOINT-WITH-PATHS", 2, 1, false);
        declareFunction("max_floor_mts_of_not_disjoint_with_paths", "MAX-FLOOR-MTS-OF-NOT-DISJOINT-WITH-PATHS", 2, 1, false);
        declareFunction("min_mts_of_not_disjoint_with_paths", "MIN-MTS-OF-NOT-DISJOINT-WITH-PATHS", 2, 1, false);
        declareFunction("disjoint_with_mts", "DISJOINT-WITH-MTS", 1, 0, false);
        declareFunction("asserted_disjoint_with", "ASSERTED-DISJOINT-WITH", 1, 1, false);
        declareFunction("asserted_not_disjoint_with", "ASSERTED-NOT-DISJOINT-WITH", 1, 1, false);
        declareFunction("supported_disjoint_with", "SUPPORTED-DISJOINT-WITH", 1, 1, false);
        declareFunction("supported_not_disjoint_with", "SUPPORTED-NOT-DISJOINT-WITH", 1, 1, false);
        declareFunction("mdw_after_adding", "MDW-AFTER-ADDING", 2, 0, false);
        declareFunction("mdw_after_removing", "MDW-AFTER-REMOVING", 2, 0, false);
        declareFunction("clear_mdw_graph", "CLEAR-MDW-GRAPH", 0, 0, false);
        declareFunction("clear_node_mdw_links", "CLEAR-NODE-MDW-LINKS", 1, 0, false);
        declareFunction("reset_mdw_links", "RESET-MDW-LINKS", 1, 0, false);
        declareFunction("reset_mdw_links_in_mt", "RESET-MDW-LINKS-IN-MT", 2, 0, false);
        declareFunction("reset_mdw_graph", "RESET-MDW-GRAPH", 0, 1, false);
        declareFunction("maximal_consistent_subsets", "MAXIMAL-CONSISTENT-SUBSETS", 1, 0, false);
        declareFunction("maximal_consistent_subsetP", "MAXIMAL-CONSISTENT-SUBSET?", 2, 0, false);
        declareFunction("maximal_consistent_subsets_recursive", "MAXIMAL-CONSISTENT-SUBSETS-RECURSIVE", 2, 0, false);
        declareFunction("disjointness_map", "DISJOINTNESS-MAP", 1, 0, false);
        declareFunction("first_disjointness", "FIRST-DISJOINTNESS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_disjoint_with_file() {
        deflexical("*ANY-DISJOINT-WITH-ANY?-CACHED-CACHING-STATE*", NIL);
        defparameter("*MAXIMAL-CONSISTENT-SUBSETS*", NIL);
        defparameter("*MAXIMAL-CONSISTENT-SUBSETS-VISITED-SUBSETS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_disjoint_with_file_alt() {
        register_cyc_api_function(ANY_DISJOINT_COLLECTION_PAIR, $list_alt3, $str_alt4$Returns_a_pair_of_disjoint_elemen, $list_alt5, $list_alt6);
        register_cyc_api_function($sym11$ANY_DISJOINT_COLLECTION_PAIR_, $list_alt3, $str_alt12$Are_any_two_collections_in_COLS_d, $list_alt5, $list_alt13);
        register_obsolete_cyc_api_function($sym15$COLLECTIONS_DISJOINT_, $list_alt16, $list_alt17, $str_alt18$_see_disjoint_with_, $list_alt19, $list_alt13);
        register_obsolete_cyc_api_function($sym20$WHY_COLLECTIONS_DISJOINT_, $list_alt21, $list_alt22, $str_alt23$_see_why_disjoint_with_, $list_alt24, $list_alt25);
        register_kb_function(MDW_AFTER_ADDING);
        register_kb_function(MDW_AFTER_REMOVING);
        return NIL;
    }

    public static SubLObject setup_disjoint_with_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function(ANY_DISJOINT_COLLECTION_PAIR, $list3, $str4$Returns_a_pair_of_disjoint_elemen, $list5, $list6);
            memoization_state.note_memoized_function($sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT);
            memoization_state.note_globally_cached_function($sym12$ANY_DISJOINT_WITH_ANY__CACHED);
            register_cyc_api_function($sym17$ANY_DISJOINT_COLLECTION_PAIR_, $list3, $str18$Are_any_two_collections_in_COLS_d, $list5, $list19);
            register_obsolete_cyc_api_function($sym21$COLLECTIONS_DISJOINT_, $list22, $list23, $str24$_see_disjoint_with_, $list25, $list19);
            register_obsolete_cyc_api_function($sym26$WHY_COLLECTIONS_DISJOINT_, $list27, $list28, $str29$_see_why_disjoint_with_, $list30, $list31);
            register_kb_function(MDW_AFTER_ADDING);
            register_kb_function(MDW_AFTER_REMOVING);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function($sym11$ANY_DISJOINT_COLLECTION_PAIR_, $list_alt3, $str_alt12$Are_any_two_collections_in_COLS_d, $list_alt5, $list_alt13);
            register_obsolete_cyc_api_function($sym15$COLLECTIONS_DISJOINT_, $list_alt16, $list_alt17, $str_alt18$_see_disjoint_with_, $list_alt19, $list_alt13);
            register_obsolete_cyc_api_function($sym20$WHY_COLLECTIONS_DISJOINT_, $list_alt21, $list_alt22, $str_alt23$_see_why_disjoint_with_, $list_alt24, $list_alt25);
        }
        return NIL;
    }

    public static SubLObject setup_disjoint_with_file_Previous() {
        register_cyc_api_function(ANY_DISJOINT_COLLECTION_PAIR, $list3, $str4$Returns_a_pair_of_disjoint_elemen, $list5, $list6);
        memoization_state.note_memoized_function($sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT);
        memoization_state.note_globally_cached_function($sym12$ANY_DISJOINT_WITH_ANY__CACHED);
        register_cyc_api_function($sym17$ANY_DISJOINT_COLLECTION_PAIR_, $list3, $str18$Are_any_two_collections_in_COLS_d, $list5, $list19);
        register_obsolete_cyc_api_function($sym21$COLLECTIONS_DISJOINT_, $list22, $list23, $str24$_see_disjoint_with_, $list25, $list19);
        register_obsolete_cyc_api_function($sym26$WHY_COLLECTIONS_DISJOINT_, $list27, $list28, $str29$_see_why_disjoint_with_, $list30, $list31);
        register_kb_function(MDW_AFTER_ADDING);
        register_kb_function(MDW_AFTER_REMOVING);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_disjoint_with_file();
    }

    @Override
    public void initializeVariables() {
        init_disjoint_with_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_disjoint_with_file();
    }

    static {
    }
}

/**
 * Total time: 323 ms
 */
