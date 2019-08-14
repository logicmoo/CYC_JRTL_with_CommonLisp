/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$mapping_target$;
import static com.cyc.cycjava.cycl.cycl_grammar.subl_atomic_term_p;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg0;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_args;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_operator;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_terms;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.contains_subformula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.function_terms.unnatify_terms;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.kb_indexing.best_nat_lookup_index;
import static com.cyc.cycjava.cycl.kb_indexing.num_best_nat_lookup_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.all_mts_are_relevantP;
import static com.cyc.cycjava.cycl.mt_relevance_macros.possibly_in_mt_determine_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.possibly_in_mt_determine_mt;
import static com.cyc.cycjava.cycl.nart_handles.do_narts_table;
import static com.cyc.cycjava.cycl.narts_high.find_nart;
import static com.cyc.cycjava.cycl.narts_high.nart_hl_formula;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.invert;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      VIRTUAL-INDEXING
 * source file: /cyc/top/cycl/virtual-indexing.lisp
 * created:     2019/07/03 17:37:24
 */
public final class virtual_indexing extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new virtual_indexing();

 public static final String myName = "com.cyc.cycjava.cycl.virtual_indexing";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $indexing_debugP$ = makeSymbol("*INDEXING-DEBUG?*");

    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $index_overlap_enabledP$ = makeSymbol("*INDEX-OVERLAP-ENABLED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $overlap_index_unreified_reifiable_nat_uses_unfindable_optimizationP$ = makeSymbol("*OVERLAP-INDEX-UNREIFIED-REIFIABLE-NAT-USES-UNFINDABLE-OPTIMIZATION?*");

    // deflexical
    /**
     * The minimum cost, below which it's not even worth it to try the overlap
     * method.
     */
    @LispMethod(comment = "The minimum cost, below which it\'s not even worth it to try the overlap\r\nmethod.\ndeflexical\nThe minimum cost, below which it\'s not even worth it to try the overlap\nmethod.")
    public static final SubLSymbol $lookup_overlap_watermark$ = makeSymbol("*LOOKUP-OVERLAP-WATERMARK*");

    // deflexical
    /**
     * Overlap index is this many times more expensive than other methods, due to
     * additional consing and multiple passes. This value was determined by
     * experiments in August 2005 and should be periodically updated.
     */
    @LispMethod(comment = "Overlap index is this many times more expensive than other methods, due to\r\nadditional consing and multiple passes. This value was determined by\r\nexperiments in August 2005 and should be periodically updated.\ndeflexical\nOverlap index is this many times more expensive than other methods, due to\nadditional consing and multiple passes. This value was determined by\nexperiments in August 2005 and should be periodically updated.")
    private static final SubLSymbol $overlap_index_expense_multiplier$ = makeSymbol("*OVERLAP-INDEX-EXPENSE-MULTIPLIER*");

    static private final SubLSymbol $sym1$_ = makeSymbol("<");

    private static final SubLSymbol ASSERTION_WITH_SEARCH_TERM = makeSymbol("ASSERTION-WITH-SEARCH-TERM");

    private static final SubLSymbol ASSERTION_WITHOUT_SEARCH_TERM = makeSymbol("ASSERTION-WITHOUT-SEARCH-TERM");

    private static final SubLSymbol ASSERTIONS_MENTIONING_TERMS = makeSymbol("ASSERTIONS-MENTIONING-TERMS");

    static private final SubLList $list6 = list(makeSymbol("TERM-LIST"), makeSymbol("&OPTIONAL"), makeSymbol("INCLUDE-META-ASSERTIONS?"));

    static private final SubLString $str7$Return_a_list_of_assertions_that_ = makeString("Return a list of assertions that mention every term in TERM-LIST.");

    static private final SubLList $list8 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));



    private static final SubLSymbol FULLY_INDEXED_TERM_P = makeSymbol("FULLY-INDEXED-TERM-P");

    static private final SubLSymbol $sym13$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    private static final SubLSymbol $sym14$RELEVANT_PRED_ = makeSymbol("RELEVANT-PRED?");

    private static final SubLSymbol GAF_PREDICATE = makeSymbol("GAF-PREDICATE");



    private static final SubLString $str24$Too_many_matching_NARTs_to_use__S = makeString("Too many matching NARTs to use ~S in overlap index");

    private static final SubLSymbol $sym25$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str27$Could_not_use__S_in_overlap_index = makeString("Could not use ~S in overlap index");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");



    private static final SubLString $$$mapping_Cyc_NARTs = makeString("mapping Cyc NARTs");

    private static final SubLList $list34 = list(makeKeyword("FUNCTION-EXTENT"), makeKeyword("NART-ARG"));

    private static final SubLString $str35$_s_vs___s___s__s____ = makeString("~s vs. ~s: ~s ~s~%~%");

    /**
     * Return a list of assertions that mention every term in TERM-LIST.
     */
    @LispMethod(comment = "Return a list of assertions that mention every term in TERM-LIST.")
    public static final SubLObject assertions_mentioning_terms_alt(SubLObject term_list, SubLObject include_meta_assertionsP) {
        if (include_meta_assertionsP == UNPROVIDED) {
            include_meta_assertionsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == term_list) {
                return NIL;
            }
            {
                SubLObject cdolist_list_var = term_list;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(v_term, INDEXED_TERM_P);
                }
            }
            {
                SubLObject ordered_terms = Sort.sort(remove_duplicates(term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym1$_), symbol_function(NUM_INDEX));
                SubLObject index_term = ordered_terms.first();
                SubLObject search_terms = ordered_terms.rest();
                if (NIL == search_terms) {
                    return kb_mapping.gather_term_assertions(index_term, UNPROVIDED);
                } else {
                    {
                        SubLObject map_term = search_terms.first();
                        SubLObject ans = NIL;
                        search_terms = search_terms.rest();
                        {
                            SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
                            try {
                                $mapping_target$.bind(map_term, thread);
                                ans = kb_accessors.selective_assertions_re(index_term, symbol_function(ASSERTION_WITH_SEARCH_TERM), UNPROVIDED);
                                if (NIL != include_meta_assertionsP) {
                                    {
                                        SubLObject meta_assertions = kb_mapping.all_fort_meta_assertions(index_term);
                                        if (NIL != meta_assertions) {
                                            {
                                                SubLObject _prev_bind_0_1 = $mapping_target$.currentBinding(thread);
                                                try {
                                                    $mapping_target$.bind(map_term, thread);
                                                    meta_assertions = delete_if(symbol_function(ASSERTION_WITHOUT_SEARCH_TERM), meta_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    $mapping_target$.rebind(_prev_bind_0_1, thread);
                                                }
                                            }
                                            ans = nconc(ans, meta_assertions);
                                        }
                                    }
                                }
                            } finally {
                                $mapping_target$.rebind(_prev_bind_0, thread);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = search_terms;
                            SubLObject search_term = NIL;
                            for (search_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_term = cdolist_list_var.first()) {
                                {
                                    SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
                                    try {
                                        $mapping_target$.bind(search_term, thread);
                                        ans = delete_if(symbol_function(ASSERTION_WITHOUT_SEARCH_TERM), ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        $mapping_target$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                        return remove_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
    }

    /**
     * Return a list of assertions that mention every term in TERM-LIST.
     */
    @LispMethod(comment = "Return a list of assertions that mention every term in TERM-LIST.")
    public static SubLObject assertions_mentioning_terms(final SubLObject term_list, SubLObject include_meta_assertionsP) {
        if (include_meta_assertionsP == UNPROVIDED) {
            include_meta_assertionsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == term_list) {
            return NIL;
        }
        SubLObject cdolist_list_var = term_list;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != indexed_term_p(v_term) : "! kb_indexing_datastructures.indexed_term_p(v_term) " + ("kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) ") + v_term;
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        final SubLObject ordered_terms = Sort.sort(remove_duplicates(term_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym1$_), symbol_function(NUM_INDEX));
        final SubLObject index_term = ordered_terms.first();
        SubLObject search_terms = ordered_terms.rest();
        if (NIL == search_terms) {
            return kb_mapping.gather_term_assertions(index_term, UNPROVIDED);
        }
        final SubLObject map_term = search_terms.first();
        SubLObject ans = NIL;
        search_terms = search_terms.rest();
        final SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
        try {
            $mapping_target$.bind(map_term, thread);
            ans = kb_accessors.selective_assertions_re(index_term, symbol_function(ASSERTION_WITH_SEARCH_TERM), UNPROVIDED);
            if (NIL != include_meta_assertionsP) {
                SubLObject meta_assertions = (NIL != forts.fort_p(index_term)) ? kb_mapping.all_fort_meta_assertions(index_term) : NIL;
                if (NIL != meta_assertions) {
                    final SubLObject _prev_bind_0_$1 = $mapping_target$.currentBinding(thread);
                    try {
                        $mapping_target$.bind(map_term, thread);
                        meta_assertions = delete_if(symbol_function(ASSERTION_WITHOUT_SEARCH_TERM), meta_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $mapping_target$.rebind(_prev_bind_0_$1, thread);
                    }
                    ans = nconc(ans, meta_assertions);
                }
            }
        } finally {
            $mapping_target$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = search_terms;
        SubLObject search_term = NIL;
        search_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject _prev_bind_2 = $mapping_target$.currentBinding(thread);
            try {
                $mapping_target$.bind(search_term, thread);
                ans = delete_if(symbol_function(ASSERTION_WITHOUT_SEARCH_TERM), ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                $mapping_target$.rebind(_prev_bind_2, thread);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            search_term = cdolist_list_var2.first();
        } 
        return remove_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertions_mentioning_terms_in_mt(SubLObject term_list, final SubLObject mt, SubLObject include_meta_assertionsP) {
        if (include_meta_assertionsP == UNPROVIDED) {
            include_meta_assertionsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        term_list = function_terms.unnatify_terms(term_list);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = assertions_mentioning_terms(term_list, include_meta_assertionsP);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject assertions_mentioning_terms_in_all_mts(SubLObject term_list, SubLObject include_meta_assertionsP) {
        if (include_meta_assertionsP == UNPROVIDED) {
            include_meta_assertionsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        term_list = function_terms.unnatify_terms(term_list);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = assertions_mentioning_terms(term_list, include_meta_assertionsP);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Shorthand for ASSERTIONS-MENTIONING-TERMS
     */
    @LispMethod(comment = "Shorthand for ASSERTIONS-MENTIONING-TERMS")
    public static final SubLObject amt_alt(SubLObject term_list, SubLObject mt, SubLObject include_meta_assertionsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (include_meta_assertionsP == UNPROVIDED) {
            include_meta_assertionsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                term_list = unnatify_terms(term_list);
                if (NIL != mt) {
                    {
                        SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                        try {
                            $relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            $mt$.bind(mt, thread);
                            result = com.cyc.cycjava.cycl.virtual_indexing.assertions_mentioning_terms(term_list, include_meta_assertionsP);
                        } finally {
                            $mt$.rebind(_prev_bind_1, thread);
                            $relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                        try {
                            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            $mt$.bind($$EverythingPSC, thread);
                            result = com.cyc.cycjava.cycl.virtual_indexing.assertions_mentioning_terms(term_list, include_meta_assertionsP);
                        } finally {
                            $mt$.rebind(_prev_bind_1, thread);
                            $relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Shorthand for ASSERTIONS-MENTIONING-TERMS
     */
    @LispMethod(comment = "Shorthand for ASSERTIONS-MENTIONING-TERMS")
    public static SubLObject amt(SubLObject term_list, SubLObject mt, SubLObject include_meta_assertionsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (include_meta_assertionsP == UNPROVIDED) {
            include_meta_assertionsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        term_list = function_terms.unnatify_terms(term_list);
        if (NIL != mt) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                result = assertions_mentioning_terms(term_list, include_meta_assertionsP);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                result = assertions_mentioning_terms(term_list, include_meta_assertionsP);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     *
     *
     * @return listp; a list of gaf assertions mentioning every term in TERMS.
     */
    @LispMethod(comment = "@return listp; a list of gaf assertions mentioning every term in TERMS.")
    public static final SubLObject gather_overlap_index_alt(SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == terms) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(possibly_in_mt_determine_function(mt_var), thread);
                        $mt$.bind(possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject fully_indexed_terms = remove_duplicates(list_utilities.remove_if_not(FULLY_INDEXED_TERM_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject non_fully_indexed_terms = list_utilities.fast_set_difference(terms, fully_indexed_terms, UNPROVIDED);
                            SubLObject ordered_fully_indexed_terms = Sort.sort(fully_indexed_terms, symbol_function($sym1$_), symbol_function(NUM_INDEX));
                            SubLObject index_term = ordered_fully_indexed_terms.first();
                            SubLObject search_terms = append(ordered_fully_indexed_terms.rest(), non_fully_indexed_terms);
                            if (NIL == search_terms) {
                                result = kb_mapping.gather_term_assertions(index_term, UNPROVIDED);
                            } else {
                                {
                                    SubLObject map_term = search_terms.first();
                                    SubLObject ans = NIL;
                                    search_terms = search_terms.rest();
                                    {
                                        SubLObject _prev_bind_0_2 = $mapping_target$.currentBinding(thread);
                                        try {
                                            $mapping_target$.bind(map_term, thread);
                                            ans = kb_accessors.selective_assertions_re(index_term, symbol_function(ASSERTION_WITH_SEARCH_TERM), UNPROVIDED);
                                            {
                                                SubLObject cdolist_list_var = search_terms;
                                                SubLObject search_term = NIL;
                                                for (search_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_term = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject _prev_bind_0_3 = $mapping_target$.currentBinding(thread);
                                                        try {
                                                            $mapping_target$.bind(search_term, thread);
                                                            ans = delete_if(symbol_function(ASSERTION_WITHOUT_SEARCH_TERM), ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            $mapping_target$.rebind(_prev_bind_0_3, thread);
                                                        }
                                                    }
                                                }
                                            }
                                            result = list_utilities.fast_delete_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            $mapping_target$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $mt$.rebind(_prev_bind_1, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return list_utilities.delete_if_not($sym13$GAF_ASSERTION_, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of gaf assertions mentioning every term in TERMS.
     */
    @LispMethod(comment = "@return listp; a list of gaf assertions mentioning every term in TERMS.")
    public static SubLObject gather_overlap_index(final SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == terms) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject fully_indexed_terms = remove_duplicates(list_utilities.remove_if_not(FULLY_INDEXED_TERM_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject non_fully_indexed_terms = list_utilities.fast_set_difference(terms, fully_indexed_terms, UNPROVIDED);
            final SubLObject ordered_fully_indexed_terms = Sort.sort(fully_indexed_terms, symbol_function($sym1$_), symbol_function(NUM_INDEX));
            final SubLObject index_term = ordered_fully_indexed_terms.first();
            SubLObject search_terms = append(ordered_fully_indexed_terms.rest(), non_fully_indexed_terms);
            if (NIL == search_terms) {
                result = kb_mapping.gather_term_assertions(index_term, UNPROVIDED);
            } else {
                final SubLObject map_term = search_terms.first();
                SubLObject ans = NIL;
                search_terms = search_terms.rest();
                final SubLObject _prev_bind_0_$2 = $mapping_target$.currentBinding(thread);
                try {
                    $mapping_target$.bind(map_term, thread);
                    SubLObject doneP = NIL;
                    ans = kb_accessors.selective_assertions_re(index_term, symbol_function(ASSERTION_WITH_SEARCH_TERM), UNPROVIDED);
                    if (NIL == doneP) {
                        SubLObject csome_list_var = search_terms;
                        SubLObject search_term = NIL;
                        search_term = csome_list_var.first();
                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                            final SubLObject _prev_bind_0_$3 = $mapping_target$.currentBinding(thread);
                            try {
                                $mapping_target$.bind(search_term, thread);
                                ans = delete_if(symbol_function(ASSERTION_WITHOUT_SEARCH_TERM), ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                $mapping_target$.rebind(_prev_bind_0_$3, thread);
                            }
                            doneP = sublisp_null(ans);
                            csome_list_var = csome_list_var.rest();
                            search_term = csome_list_var.first();
                        } 
                    }
                    result = list_utilities.fast_delete_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    $mapping_target$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        result = list_utilities.delete_if_not($sym13$GAF_ASSERTION_, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        result = list_utilities.delete_if_not($sym14$RELEVANT_PRED_, result, GAF_PREDICATE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static final SubLObject gather_overlap_index_for_asent_alt(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.virtual_indexing.gather_overlap_index(com.cyc.cycjava.cycl.virtual_indexing.terms_for_overlap_index(asent), mt);
    }

    public static SubLObject gather_overlap_index_for_asent(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return gather_overlap_index(terms_for_overlap_index(asent), mt);
    }

    public static final SubLObject gather_overlap_index_for_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        $mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.virtual_indexing.gather_overlap_index(com.cyc.cycjava.cycl.virtual_indexing.terms_for_overlap_index(mt), UNPROVIDED);
                    } finally {
                        $mt$.rebind(_prev_bind_1, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject gather_overlap_index_for_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = gather_overlap_index(terms_for_overlap_index(mt), UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return integerp; the number of assertions mentioning every term in TERMS.
     */
    @LispMethod(comment = "@return integerp; the number of assertions mentioning every term in TERMS.")
    public static final SubLObject num_overlap_index_alt(SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return length(com.cyc.cycjava.cycl.virtual_indexing.gather_overlap_index(terms, mt));
    }

    /**
     *
     *
     * @return integerp; the number of assertions mentioning every term in TERMS.
     */
    @LispMethod(comment = "@return integerp; the number of assertions mentioning every term in TERMS.")
    public static SubLObject num_overlap_index(final SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return length(gather_overlap_index(terms, mt));
    }

    /**
     *
     *
     * @return integerp; Estimate the number of assertions mentioning every term in TERMS, by
    dividing the size of the smallest index by the number of terms in TERMS.
     */
    @LispMethod(comment = "@return integerp; Estimate the number of assertions mentioning every term in TERMS, by\r\ndividing the size of the smallest index by the number of terms in TERMS.")
    public static final SubLObject estimated_num_overlap_index_alt(SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == terms) {
                return ZERO_INTEGER;
            }
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(possibly_in_mt_determine_function(mt_var), thread);
                        $mt$.bind(possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject fully_indexed_terms = remove_duplicates(list_utilities.remove_if_not(FULLY_INDEXED_TERM_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject min_index = apply(symbol_function(MIN), Mapping.mapcar(symbol_function(NUM_INDEX), fully_indexed_terms));
                            result = round(divide(min_index, length(terms)), UNPROVIDED);
                        }
                    } finally {
                        $mt$.rebind(_prev_bind_1, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return integerp; Estimate the number of assertions mentioning every term in TERMS, by
    dividing the size of the smallest index by the number of terms in TERMS.
     */
    @LispMethod(comment = "@return integerp; Estimate the number of assertions mentioning every term in TERMS, by\r\ndividing the size of the smallest index by the number of terms in TERMS.")
    public static SubLObject estimated_num_overlap_index(final SubLObject terms, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == terms) {
            return ZERO_INTEGER;
        }
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject fully_indexed_terms = remove_duplicates(list_utilities.remove_if_not(FULLY_INDEXED_TERM_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == fully_indexed_terms) {
                result = ZERO_INTEGER;
            } else {
                final SubLObject min_term = list_utilities.extremal(fully_indexed_terms, symbol_function($sym1$_), symbol_function(NUM_INDEX));
                final SubLObject min_index = kb_indexing.num_index(min_term);
                final SubLObject term_count = length(fully_indexed_terms);
                if (min_index.numLE($int$1000)) {
                    result = round(expt(min_index, invert(term_count)), UNPROVIDED);
                } else {
                    result = round(divide(min_index, term_count), UNPROVIDED);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return integerp; the number of assertions mentioning every term in ASENT.
    See @xref estimated-num-overlap-index-for-asent for a more efficient
    but less precise implementation
     */
    @LispMethod(comment = "@return integerp; the number of assertions mentioning every term in ASENT.\r\nSee @xref estimated-num-overlap-index-for-asent for a more efficient\r\nbut less precise implementation")
    public static final SubLObject num_overlap_index_for_asent_alt(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject indexed_terms = com.cyc.cycjava.cycl.virtual_indexing.terms_for_overlap_index(asent);
            return com.cyc.cycjava.cycl.virtual_indexing.num_overlap_index(indexed_terms, mt);
        }
    }

    /**
     *
     *
     * @return integerp; the number of assertions mentioning every term in ASENT.
    See @xref estimated-num-overlap-index-for-asent for a more efficient
    but less precise implementation
     */
    @LispMethod(comment = "@return integerp; the number of assertions mentioning every term in ASENT.\r\nSee @xref estimated-num-overlap-index-for-asent for a more efficient\r\nbut less precise implementation")
    public static SubLObject num_overlap_index_for_asent(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject indexed_terms = terms_for_overlap_index(asent);
        return num_overlap_index(indexed_terms, mt);
    }

    /**
     *
     *
     * @return integerp; the number of assertions mentioning every term in ASENT.
     */
    @LispMethod(comment = "@return integerp; the number of assertions mentioning every term in ASENT.")
    public static final SubLObject estimated_num_overlap_index_for_asent_alt(SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.virtual_indexing.estimated_num_overlap_index_for_formula(asent, mt);
    }

    /**
     *
     *
     * @return integerp; the number of assertions mentioning every term in ASENT.
     */
    @LispMethod(comment = "@return integerp; the number of assertions mentioning every term in ASENT.")
    public static SubLObject estimated_num_overlap_index_for_asent(final SubLObject asent, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return estimated_num_overlap_index_for_formula(asent, mt);
    }

    /**
     *
     *
     * @return integerp; the number of assertions mentioning every term in MT.
     */
    @LispMethod(comment = "@return integerp; the number of assertions mentioning every term in MT.")
    public static final SubLObject estimated_num_overlap_index_for_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != variables.variable_p(mt)) {
                return assertion_handles.assertion_count();
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        $mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.virtual_indexing.estimated_num_overlap_index_for_formula(mt, UNPROVIDED);
                    } finally {
                        $mt$.rebind(_prev_bind_1, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return integerp; the number of assertions mentioning every term in MT.
     */
    @LispMethod(comment = "@return integerp; the number of assertions mentioning every term in MT.")
    public static SubLObject estimated_num_overlap_index_for_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.variable_p(mt)) {
            return assertion_handles.assertion_count();
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = estimated_num_overlap_index_for_formula(mt, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject estimated_num_overlap_index_for_formula_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject indexed_terms = com.cyc.cycjava.cycl.virtual_indexing.terms_for_overlap_index(formula);
            return com.cyc.cycjava.cycl.virtual_indexing.estimated_num_overlap_index(indexed_terms, mt);
        }
    }

    public static SubLObject estimated_num_overlap_index_for_formula(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject gaf_arg_index_estimate = estimated_num_overlap_index_for_formula_using_gaf_arg_index(formula, mt);
        final SubLObject indexed_terms = terms_for_overlap_index(formula);
        final SubLObject overlap_index_estimate = estimated_num_overlap_index(indexed_terms, mt);
        if ((NIL != subl_promotions.positive_integer_p(gaf_arg_index_estimate)) && gaf_arg_index_estimate.numL(overlap_index_estimate)) {
            return gaf_arg_index_estimate;
        }
        return overlap_index_estimate;
    }

    public static SubLObject estimated_num_overlap_index_for_formula_using_gaf_arg_index(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(formula);
        SubLObject arg_count = ZERO_INTEGER;
        SubLObject costs = NIL;
        if (NIL != forts.fort_p(predicate)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                SubLObject argnum = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL != forts.fort_p(arg)) {
                        arg_count = add(arg_count, ONE_INTEGER);
                        costs = cons(kb_indexing.num_gaf_arg_index(arg, argnum, cycl_utilities.formula_arg0(formula), UNPROVIDED), costs);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != costs) {
            return round(divide(apply(symbol_function(MIN), costs), arg_count), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject terms_for_overlap_index_alt(SubLObject formula) {
        return com.cyc.cycjava.cycl.virtual_indexing.terms_for_overlap_index_internal(formula);
    }

    public static SubLObject terms_for_overlap_index(final SubLObject formula) {
        final SubLObject result = terms_for_overlap_index_internal(formula, UNPROVIDED);
        if (result.isCons()) {
            return result;
        }
        return NIL;
    }

    public static final SubLObject terms_for_overlap_index_internal(SubLObject formula) {
        {
            SubLObject terms = NIL;
            SubLObject terms_4 = formula_terms(formula, $IGNORE);
            SubLObject cdolist_list_var = terms_4;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL != el_formula_p(v_term)) {
                    if (NIL == czer_utilities.reifiable_functorP(formula_arg0(v_term), UNPROVIDED)) {
                        terms = append(terms, com.cyc.cycjava.cycl.virtual_indexing.terms_for_overlap_index_internal(v_term));
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.virtual_indexing.good_term_for_overlap_index_p(v_term)) {
                        terms = cons(v_term, terms);
                    }
                }
            }
            return terms;
        }
    }

    public static SubLObject terms_for_overlap_index_internal(final SubLObject formula, SubLObject skip_possible_nart_methodP) {
        if (skip_possible_nart_methodP == UNPROVIDED) {
            skip_possible_nart_methodP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
        try {
            czer_vars.$inside_quote$.bind(NIL != czer_vars.$inside_quote$.getDynamicValue(thread) ? czer_vars.$inside_quote$.getDynamicValue(thread) : cycl_grammar.fast_quote_term_p(formula), thread);
            final SubLObject arg0_term = cycl_utilities.formula_arg0(formula);
            SubLObject terms = NIL;
            if (NIL != czer_utilities.some_canonicalizer_directive_assertions_somewhereP(arg0_term)) {
                skip_possible_nart_methodP = T;
            }
            SubLObject cdolist_list_var;
            final SubLObject terms_$4 = cdolist_list_var = cycl_utilities.formula_terms(formula, $IGNORE);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != good_term_for_overlap_index_p(v_term)) {
                    terms = cons(v_term, terms);
                } else
                    if (((((NIL == czer_vars.$inside_quote$.getDynamicValue(thread)) && (NIL != el_formula_p(v_term))) && (NIL != czer_utilities.reifiable_functorP(cycl_utilities.formula_arg0(v_term), UNPROVIDED))) && (!arg0_term.eql($$termOfUnit))) && (NIL == skip_possible_nart_methodP)) {
                        SubLObject matching_nart = NIL;
                        SubLObject found_more_than_one_nartP = NIL;
                        if (NIL != closedP(v_term, UNPROVIDED)) {
                            final SubLObject possible_nart = narts_high.nart_substitute(v_term);
                            matching_nart = (NIL != nart_handles.nart_p(possible_nart)) ? possible_nart : NIL;
                        } else {
                            final SubLObject l_index = kb_indexing.best_nat_lookup_index(v_term, NIL);
                            final SubLObject pcase_var;
                            final SubLObject method = pcase_var = kb_mapping_macros.do_nli_extract_method(l_index);
                            if (pcase_var.eql($NART_ARG)) {
                                thread.resetMultipleValues();
                                final SubLObject v_term_$5 = kb_mapping_macros.do_nli_vna_extract_keys(l_index);
                                final SubLObject argnum = thread.secondMultipleValue();
                                final SubLObject functor = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != argnum) {
                                    if (NIL != functor) {
                                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term_$5, argnum, functor)) {
                                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term_$5, argnum, functor);
                                            SubLObject done_var = found_more_than_one_nartP;
                                            final SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                if (NIL != valid) {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        SubLObject done_var_$6 = found_more_than_one_nartP;
                                                        final SubLObject token_var_$7 = NIL;
                                                        while (NIL == done_var_$6) {
                                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                                            final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(ass));
                                                            if (NIL != valid_$8) {
                                                                if (NIL == matching_nart) {
                                                                    matching_nart = assertions_high.gaf_arg1(ass);
                                                                } else {
                                                                    found_more_than_one_nartP = T;
                                                                }
                                                            }
                                                            done_var_$6 = makeBoolean((NIL == valid_$8) || (NIL != found_more_than_one_nartP));
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != found_more_than_one_nartP));
                                            } 
                                        }
                                    } else
                                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term_$5, argnum, NIL)) {
                                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term_$5, argnum, NIL);
                                            SubLObject done_var = found_more_than_one_nartP;
                                            final SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                if (NIL != valid) {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        SubLObject done_var_$7 = found_more_than_one_nartP;
                                                        final SubLObject token_var_$8 = NIL;
                                                        while (NIL == done_var_$7) {
                                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                                            final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(ass));
                                                            if (NIL != valid_$9) {
                                                                if (NIL == matching_nart) {
                                                                    matching_nart = assertions_high.gaf_arg1(ass);
                                                                } else {
                                                                    found_more_than_one_nartP = T;
                                                                }
                                                            }
                                                            done_var_$7 = makeBoolean((NIL == valid_$9) || (NIL != found_more_than_one_nartP));
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values2 = getValuesAsVector();
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            restoreValuesFromVector(_values2);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != found_more_than_one_nartP));
                                            } 
                                        }

                                } else
                                    if (NIL != functor) {
                                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term_$5, NIL, functor)) {
                                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term_$5, NIL, functor);
                                            SubLObject done_var = found_more_than_one_nartP;
                                            final SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                if (NIL != valid) {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        SubLObject done_var_$8 = found_more_than_one_nartP;
                                                        final SubLObject token_var_$9 = NIL;
                                                        while (NIL == done_var_$8) {
                                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                                            final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(ass));
                                                            if (NIL != valid_$10) {
                                                                if (NIL == matching_nart) {
                                                                    matching_nart = assertions_high.gaf_arg1(ass);
                                                                } else {
                                                                    found_more_than_one_nartP = T;
                                                                }
                                                            }
                                                            done_var_$8 = makeBoolean((NIL == valid_$10) || (NIL != found_more_than_one_nartP));
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values3 = getValuesAsVector();
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            restoreValuesFromVector(_values3);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != found_more_than_one_nartP));
                                            } 
                                        }
                                    } else
                                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term_$5, NIL, NIL)) {
                                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term_$5, NIL, NIL);
                                            SubLObject done_var = found_more_than_one_nartP;
                                            final SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                if (NIL != valid) {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        SubLObject done_var_$9 = found_more_than_one_nartP;
                                                        final SubLObject token_var_$10 = NIL;
                                                        while (NIL == done_var_$9) {
                                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                                            final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(ass));
                                                            if (NIL != valid_$11) {
                                                                if (NIL == matching_nart) {
                                                                    matching_nart = assertions_high.gaf_arg1(ass);
                                                                } else {
                                                                    found_more_than_one_nartP = T;
                                                                }
                                                            }
                                                            done_var_$9 = makeBoolean((NIL == valid_$11) || (NIL != found_more_than_one_nartP));
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values4 = getValuesAsVector();
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            restoreValuesFromVector(_values4);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != found_more_than_one_nartP));
                                            } 
                                        }


                            } else
                                if (pcase_var.eql($FUNCTION_EXTENT)) {
                                    if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(kb_mapping_macros.do_nli_vfe_extract_key(l_index))) {
                                        final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(kb_mapping_macros.do_nli_vfe_extract_key(l_index));
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                            SubLObject done_var2 = found_more_than_one_nartP;
                                            final SubLObject token_var2 = NIL;
                                            while (NIL == done_var2) {
                                                final SubLObject ass2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                                                final SubLObject valid2 = makeBoolean(!token_var2.eql(ass2));
                                                if (NIL != valid2) {
                                                    if (NIL == matching_nart) {
                                                        matching_nart = assertions_high.gaf_arg1(ass2);
                                                    } else {
                                                        found_more_than_one_nartP = T;
                                                    }
                                                }
                                                done_var2 = makeBoolean((NIL == valid2) || (NIL != found_more_than_one_nartP));
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values5 = getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                restoreValuesFromVector(_values5);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                            }
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($OVERLAP)) {
                                        SubLObject rest;
                                        SubLObject ass3;
                                        for (rest = NIL, rest = gather_overlap_index(kb_mapping_macros.do_nli_vo_extract_key(l_index), UNPROVIDED); (NIL == found_more_than_one_nartP) && (NIL != rest); rest = rest.rest()) {
                                            ass3 = rest.first();
                                            if (NIL == matching_nart) {
                                                matching_nart = assertions_high.gaf_arg1(ass3);
                                            } else {
                                                found_more_than_one_nartP = T;
                                            }
                                        }
                                    } else {
                                        kb_mapping_macros.do_nli_method_error(l_index, method);
                                    }


                        }
                        if (NIL != found_more_than_one_nartP) {
                            if (NIL != $indexing_debugP$.getDynamicValue(thread)) {
                                Errors.warn($str24$Too_many_matching_NARTs_to_use__S, v_term);
                            }
                        } else {
                            if (((NIL != $overlap_index_unreified_reifiable_nat_uses_unfindable_optimizationP$.getDynamicValue(thread)) && (NIL == matching_nart)) && (NIL != closedP(v_term, UNPROVIDED))) {
                                return $NONE;
                            }
                            if (NIL == matching_nart) {
                                if (NIL != $indexing_debugP$.getDynamicValue(thread)) {
                                    Errors.warn($str27$Could_not_use__S_in_overlap_index, v_term);
                                }
                            } else {
                                final SubLObject item_var = matching_nart;
                                if (NIL == member(item_var, terms, KBEQ, symbol_function(IDENTITY))) {
                                    terms = cons(item_var, terms);
                                }
                            }
                        }
                    } else {
                        final SubLObject more_terms = terms_for_overlap_index_internal(v_term, skip_possible_nart_methodP);
                        if (more_terms == $NONE) {
                            return $NONE;
                        }
                        terms = append(terms, more_terms);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            return terms;
        } finally {
            czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
        }
    }

    static private final SubLList $list_alt6 = list(makeSymbol("TERM-LIST"), makeSymbol("&OPTIONAL"), makeSymbol("INCLUDE-META-ASSERTIONS?"));

    static private final SubLString $str_alt7$Return_a_list_of_assertions_that_ = makeString("Return a list of assertions that mention every term in TERM-LIST.");

    static private final SubLList $list_alt8 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLList $list_alt22 = list(makeKeyword("FUNCTION-EXTENT"), makeKeyword("NART-ARG"));

    static private final SubLString $str_alt23$_s_vs___s___s__s____ = makeString("~s vs. ~s: ~s ~s~%~%");

    public static final SubLObject good_term_for_overlap_index_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) || ((!v_object.isCons()) && (NIL != subl_atomic_term_p(v_object))));
    }

    public static SubLObject good_term_for_overlap_index_p(final SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) || ((!v_object.isCons()) && (NIL != cycl_grammar.subl_atomic_term_p(v_object))));
    }

    /**
     *
     *
     * @return boolean; t iff overlap indexing will probably yield a better-focused
    search than any other kind of indexing.
     * @param BEST-COUNT;
     * 		the smallest count of assertions indexed via the best other index.
     */
    @LispMethod(comment = "@return boolean; t iff overlap indexing will probably yield a better-focused\r\nsearch than any other kind of indexing.\r\n@param BEST-COUNT;\r\n\t\tthe smallest count of assertions indexed via the best other index.")
    public static final SubLObject lookup_should_use_index_overlapP_alt(SubLObject formula, SubLObject best_count) {
        if (best_count == UNPROVIDED) {
            best_count = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $index_overlap_enabledP$.getDynamicValue(thread)) {
                return NIL;
            } else {
                if ((NIL != best_count) && best_count.numL($lookup_overlap_watermark$.getGlobalValue())) {
                    return NIL;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.virtual_indexing.too_few_terms_for_index_overlapP(formula)) {
                        return NIL;
                    } else {
                        if ((NIL != best_count) && (NIL != all_mts_are_relevantP())) {
                            thread.resetMultipleValues();
                            {
                                SubLObject fort = kb_accessors.most_specialized_fort(formula, UNPROVIDED);
                                SubLObject best_overlap_count = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                return numL(multiply(best_overlap_count, $overlap_index_expense_multiplier$.getGlobalValue()), best_count);
                            }
                        } else {
                            return T;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff overlap indexing will probably yield a better-focused
    search than any other kind of indexing.
     * @param BEST-COUNT;
     * 		the smallest count of assertions indexed via the best other index.
     */
    @LispMethod(comment = "@return boolean; t iff overlap indexing will probably yield a better-focused\r\nsearch than any other kind of indexing.\r\n@param BEST-COUNT;\r\n\t\tthe smallest count of assertions indexed via the best other index.")
    public static SubLObject lookup_should_use_index_overlapP(final SubLObject formula, SubLObject best_count) {
        if (best_count == UNPROVIDED) {
            best_count = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $index_overlap_enabledP$.getDynamicValue(thread)) {
            return NIL;
        }
        if ((NIL != best_count) && best_count.numL($lookup_overlap_watermark$.getGlobalValue())) {
            return NIL;
        }
        if (NIL != too_few_terms_for_index_overlapP(formula)) {
            return NIL;
        }
        if ((NIL != best_count) && (NIL != mt_relevance_macros.all_mts_are_relevantP())) {
            thread.resetMultipleValues();
            final SubLObject fort = kb_accessors.most_specialized_fort(formula, UNPROVIDED);
            final SubLObject best_overlap_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return numL(multiply(best_overlap_count, $overlap_index_expense_multiplier$.getGlobalValue()), best_count);
        }
        return T;
    }

    public static final SubLObject too_few_terms_for_index_overlapP_alt(SubLObject formula) {
        if (NIL != contains_subformula_p(formula)) {
            return NIL;
        }
        if (NIL == indexed_term_p(formula_operator(formula))) {
            return T;
        }
        {
            SubLObject num_indexed_args = ZERO_INTEGER;
            SubLObject args = formula_args(formula, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.virtual_indexing.good_term_for_overlap_index_p(arg)) {
                    num_indexed_args = add(num_indexed_args, ONE_INTEGER);
                }
            }
            return numLE(num_indexed_args, ONE_INTEGER);
        }
    }

    public static SubLObject too_few_terms_for_index_overlapP(final SubLObject formula) {
        if (NIL != contains_subformula_p(formula)) {
            return NIL;
        }
        if (NIL == indexed_term_p(cycl_utilities.formula_operator(formula))) {
            return T;
        }
        SubLObject num_indexed_args = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != good_term_for_overlap_index_p(arg)) {
                num_indexed_args = add(num_indexed_args, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return numLE(num_indexed_args, ONE_INTEGER);
    }

    /**
     *
     *
     * @return nart-p; the nart for which the overlap index yields the greatest benefit
     */
    @LispMethod(comment = "@return nart-p; the nart for which the overlap index yields the greatest benefit")
    public static final SubLObject overlap_greatest_benefit_nart_alt(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject best_benefit_ratio = ZERO_INTEGER;
                SubLObject best_benefit_nart = NIL;
                SubLObject idx = do_narts_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_NARTs, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_Cyc_NARTs);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject nart = NIL;
                                while (NIL != id) {
                                    nart = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, nart, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject benefit_nart = com.cyc.cycjava.cycl.virtual_indexing.overlap_benefit_ratio(nart, verboseP);
                                            SubLObject benefit_ratio = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if ((NIL != benefit_nart) && (NIL != benefit_ratio)) {
                                                if (benefit_ratio.numG(best_benefit_ratio)) {
                                                    best_benefit_ratio = benefit_ratio;
                                                    best_benefit_nart = benefit_nart;
                                                }
                                            }
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(best_benefit_nart, best_benefit_ratio);
            }
        }
    }

    /**
     *
     *
     * @return nart-p; the nart for which the overlap index yields the greatest benefit
     */
    @LispMethod(comment = "@return nart-p; the nart for which the overlap index yields the greatest benefit")
    public static SubLObject overlap_greatest_benefit_nart(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_benefit_ratio = ZERO_INTEGER;
        SubLObject best_benefit_nart = NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $$$mapping_Cyc_NARTs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$23 = idx;
                if (NIL == id_index_objects_empty_p(idx_$23, $SKIP)) {
                    final SubLObject idx_$24 = idx_$23;
                    if (NIL == id_index_dense_objects_empty_p(idx_$24, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$24);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        SubLObject benefit_nart;
                        SubLObject benefit_ratio;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            nart = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(nart)) {
                                    nart = $SKIP;
                                }
                                thread.resetMultipleValues();
                                benefit_nart = overlap_benefit_ratio(nart, verboseP);
                                benefit_ratio = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (((NIL != benefit_nart) && (NIL != benefit_ratio)) && benefit_ratio.numG(best_benefit_ratio)) {
                                    best_benefit_ratio = benefit_ratio;
                                    best_benefit_nart = benefit_nart;
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$25 = idx_$23;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$25)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$25);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$25);
                        final SubLObject end_id = id_index_next_id(idx_$25);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                thread.resetMultipleValues();
                                final SubLObject benefit_nart2 = overlap_benefit_ratio(nart2, verboseP);
                                final SubLObject benefit_ratio2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (((NIL != benefit_nart2) && (NIL != benefit_ratio2)) && benefit_ratio2.numG(best_benefit_ratio)) {
                                    best_benefit_ratio = benefit_ratio2;
                                    best_benefit_nart = benefit_nart2;
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return values(best_benefit_nart, best_benefit_ratio);
    }

    public static final SubLObject overlap_benefit_ratio_alt(SubLObject nart, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            SubLObject nart_hl_formula = nart_hl_formula(nart);
            SubLObject index = best_nat_lookup_index(nart_hl_formula, UNPROVIDED);
            if ($OVERLAP == getf(index, $INDEX_TYPE, UNPROVIDED)) {
                if (NIL != find_nart(nart_hl_formula)) {
                    {
                        SubLObject best_count = num_best_nat_lookup_index(nart_hl_formula, $list_alt22);
                        SubLObject best_overlap_count = second(arg2(resetMultipleValues(), multiple_value_list(kb_accessors.most_specialized_fort(nart_hl_formula, UNPROVIDED))));
                        if (best_count.isNumber() && best_overlap_count.isNumber()) {
                            {
                                SubLObject benefit_ratio = divide(best_count, best_overlap_count);
                                if (NIL != verboseP) {
                                    format(T, $str_alt23$_s_vs___s___s__s____, new SubLObject[]{ best_overlap_count, best_count, index, nart });
                                }
                                return values(nart, benefit_ratio);
                            }
                        }
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    public static SubLObject overlap_benefit_ratio(final SubLObject nart, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLObject nart_hl_formula = narts_high.nart_hl_formula(nart);
        final SubLObject index = kb_indexing.best_nat_lookup_index(nart_hl_formula, UNPROVIDED);
        if (($OVERLAP == getf(index, $INDEX_TYPE, UNPROVIDED)) && (NIL != narts_high.find_nart(nart_hl_formula))) {
            final SubLObject best_count = kb_indexing.num_best_nat_lookup_index(nart_hl_formula, $list34);
            final SubLObject best_overlap_count = second(arg2(resetMultipleValues(), multiple_value_list(kb_accessors.most_specialized_fort(nart_hl_formula, UNPROVIDED))));
            if (best_count.isNumber() && best_overlap_count.isNumber()) {
                final SubLObject benefit_ratio = divide(best_count, best_overlap_count);
                if (NIL != verboseP) {
                    format(T, $str35$_s_vs___s___s__s____, new SubLObject[]{ best_overlap_count, best_count, index, nart });
                }
                return values(nart, benefit_ratio);
            }
        }
        return values(NIL, NIL);
    }

    public static final SubLObject declare_virtual_indexing_file_alt() {
        declareFunction("assertions_mentioning_terms", "ASSERTIONS-MENTIONING-TERMS", 1, 1, false);
        declareFunction("amt", "AMT", 1, 2, false);
        declareFunction("gather_overlap_index", "GATHER-OVERLAP-INDEX", 1, 1, false);
        declareFunction("gather_overlap_index_for_asent", "GATHER-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
        declareFunction("gather_overlap_index_for_mt", "GATHER-OVERLAP-INDEX-FOR-MT", 1, 0, false);
        declareFunction("num_overlap_index", "NUM-OVERLAP-INDEX", 1, 1, false);
        declareFunction("estimated_num_overlap_index", "ESTIMATED-NUM-OVERLAP-INDEX", 1, 1, false);
        declareFunction("num_overlap_index_for_asent", "NUM-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
        declareFunction("estimated_num_overlap_index_for_asent", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
        declareFunction("estimated_num_overlap_index_for_mt", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-MT", 1, 0, false);
        declareFunction("estimated_num_overlap_index_for_formula", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-FORMULA", 1, 1, false);
        declareFunction("terms_for_overlap_index", "TERMS-FOR-OVERLAP-INDEX", 1, 0, false);
        declareFunction("terms_for_overlap_index_internal", "TERMS-FOR-OVERLAP-INDEX-INTERNAL", 1, 0, false);
        declareFunction("good_term_for_overlap_index_p", "GOOD-TERM-FOR-OVERLAP-INDEX-P", 1, 0, false);
        declareFunction("lookup_should_use_index_overlapP", "LOOKUP-SHOULD-USE-INDEX-OVERLAP?", 1, 1, false);
        declareFunction("too_few_terms_for_index_overlapP", "TOO-FEW-TERMS-FOR-INDEX-OVERLAP?", 1, 0, false);
        declareFunction("overlap_greatest_benefit_nart", "OVERLAP-GREATEST-BENEFIT-NART", 0, 1, false);
        declareFunction("overlap_benefit_ratio", "OVERLAP-BENEFIT-RATIO", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_virtual_indexing_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("assertions_mentioning_terms", "ASSERTIONS-MENTIONING-TERMS", 1, 1, false);
            declareFunction("assertions_mentioning_terms_in_mt", "ASSERTIONS-MENTIONING-TERMS-IN-MT", 2, 1, false);
            declareFunction("assertions_mentioning_terms_in_all_mts", "ASSERTIONS-MENTIONING-TERMS-IN-ALL-MTS", 1, 1, false);
            declareFunction("amt", "AMT", 1, 2, false);
            declareFunction("gather_overlap_index", "GATHER-OVERLAP-INDEX", 1, 1, false);
            declareFunction("gather_overlap_index_for_asent", "GATHER-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
            declareFunction("gather_overlap_index_for_mt", "GATHER-OVERLAP-INDEX-FOR-MT", 1, 0, false);
            declareFunction("num_overlap_index", "NUM-OVERLAP-INDEX", 1, 1, false);
            declareFunction("estimated_num_overlap_index", "ESTIMATED-NUM-OVERLAP-INDEX", 1, 1, false);
            declareFunction("num_overlap_index_for_asent", "NUM-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
            declareFunction("estimated_num_overlap_index_for_asent", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
            declareFunction("estimated_num_overlap_index_for_mt", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-MT", 1, 0, false);
            declareFunction("estimated_num_overlap_index_for_formula", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-FORMULA", 1, 1, false);
            declareFunction("estimated_num_overlap_index_for_formula_using_gaf_arg_index", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-FORMULA-USING-GAF-ARG-INDEX", 1, 1, false);
            declareFunction("terms_for_overlap_index", "TERMS-FOR-OVERLAP-INDEX", 1, 0, false);
            declareFunction("terms_for_overlap_index_internal", "TERMS-FOR-OVERLAP-INDEX-INTERNAL", 1, 1, false);
            declareFunction("good_term_for_overlap_index_p", "GOOD-TERM-FOR-OVERLAP-INDEX-P", 1, 0, false);
            declareFunction("lookup_should_use_index_overlapP", "LOOKUP-SHOULD-USE-INDEX-OVERLAP?", 1, 1, false);
            declareFunction("too_few_terms_for_index_overlapP", "TOO-FEW-TERMS-FOR-INDEX-OVERLAP?", 1, 0, false);
            declareFunction("overlap_greatest_benefit_nart", "OVERLAP-GREATEST-BENEFIT-NART", 0, 1, false);
            declareFunction("overlap_benefit_ratio", "OVERLAP-BENEFIT-RATIO", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("terms_for_overlap_index_internal", "TERMS-FOR-OVERLAP-INDEX-INTERNAL", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_virtual_indexing_file_Previous() {
        declareFunction("assertions_mentioning_terms", "ASSERTIONS-MENTIONING-TERMS", 1, 1, false);
        declareFunction("assertions_mentioning_terms_in_mt", "ASSERTIONS-MENTIONING-TERMS-IN-MT", 2, 1, false);
        declareFunction("assertions_mentioning_terms_in_all_mts", "ASSERTIONS-MENTIONING-TERMS-IN-ALL-MTS", 1, 1, false);
        declareFunction("amt", "AMT", 1, 2, false);
        declareFunction("gather_overlap_index", "GATHER-OVERLAP-INDEX", 1, 1, false);
        declareFunction("gather_overlap_index_for_asent", "GATHER-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
        declareFunction("gather_overlap_index_for_mt", "GATHER-OVERLAP-INDEX-FOR-MT", 1, 0, false);
        declareFunction("num_overlap_index", "NUM-OVERLAP-INDEX", 1, 1, false);
        declareFunction("estimated_num_overlap_index", "ESTIMATED-NUM-OVERLAP-INDEX", 1, 1, false);
        declareFunction("num_overlap_index_for_asent", "NUM-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
        declareFunction("estimated_num_overlap_index_for_asent", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-ASENT", 1, 1, false);
        declareFunction("estimated_num_overlap_index_for_mt", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-MT", 1, 0, false);
        declareFunction("estimated_num_overlap_index_for_formula", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-FORMULA", 1, 1, false);
        declareFunction("estimated_num_overlap_index_for_formula_using_gaf_arg_index", "ESTIMATED-NUM-OVERLAP-INDEX-FOR-FORMULA-USING-GAF-ARG-INDEX", 1, 1, false);
        declareFunction("terms_for_overlap_index", "TERMS-FOR-OVERLAP-INDEX", 1, 0, false);
        declareFunction("terms_for_overlap_index_internal", "TERMS-FOR-OVERLAP-INDEX-INTERNAL", 1, 1, false);
        declareFunction("good_term_for_overlap_index_p", "GOOD-TERM-FOR-OVERLAP-INDEX-P", 1, 0, false);
        declareFunction("lookup_should_use_index_overlapP", "LOOKUP-SHOULD-USE-INDEX-OVERLAP?", 1, 1, false);
        declareFunction("too_few_terms_for_index_overlapP", "TOO-FEW-TERMS-FOR-INDEX-OVERLAP?", 1, 0, false);
        declareFunction("overlap_greatest_benefit_nart", "OVERLAP-GREATEST-BENEFIT-NART", 0, 1, false);
        declareFunction("overlap_benefit_ratio", "OVERLAP-BENEFIT-RATIO", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_virtual_indexing_file_alt() {
        defparameter("*INDEX-OVERLAP-ENABLED?*", T);
        deflexical("*LOOKUP-OVERLAP-WATERMARK*", $int$50);
        deflexical("*OVERLAP-INDEX-EXPENSE-MULTIPLIER*", SEVEN_INTEGER);
        return NIL;
    }

    public static SubLObject init_virtual_indexing_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*INDEXING-DEBUG?*", NIL);
            defparameter("*INDEX-OVERLAP-ENABLED?*", T);
            defparameter("*OVERLAP-INDEX-UNREIFIED-REIFIABLE-NAT-USES-UNFINDABLE-OPTIMIZATION?*", T);
            deflexical("*LOOKUP-OVERLAP-WATERMARK*", $int$25);
            deflexical("*OVERLAP-INDEX-EXPENSE-MULTIPLIER*", SEVEN_INTEGER);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*LOOKUP-OVERLAP-WATERMARK*", $int$50);
        }
        return NIL;
    }

    public static SubLObject init_virtual_indexing_file_Previous() {
        defparameter("*INDEXING-DEBUG?*", NIL);
        defparameter("*INDEX-OVERLAP-ENABLED?*", T);
        defparameter("*OVERLAP-INDEX-UNREIFIED-REIFIABLE-NAT-USES-UNFINDABLE-OPTIMIZATION?*", T);
        deflexical("*LOOKUP-OVERLAP-WATERMARK*", $int$25);
        deflexical("*OVERLAP-INDEX-EXPENSE-MULTIPLIER*", SEVEN_INTEGER);
        return NIL;
    }

    public static SubLObject setup_virtual_indexing_file() {
        register_cyc_api_function(ASSERTIONS_MENTIONING_TERMS, $list6, $str7$Return_a_list_of_assertions_that_, NIL, $list8);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_virtual_indexing_file();
    }

    @Override
    public void initializeVariables() {
        init_virtual_indexing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_virtual_indexing_file();
    }

    static {
    }
}

/**
 * Total time: 738 ms
 */
