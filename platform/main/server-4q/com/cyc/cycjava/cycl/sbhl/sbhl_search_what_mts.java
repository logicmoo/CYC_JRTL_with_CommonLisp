/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.creduce;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
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
 * module:      SBHL-SEARCH-WHAT-MTS
 * source file: /cyc/top/cycl/sbhl/sbhl-search-what-mts.lisp
 * created:     2019/07/03 17:37:26
 */
public final class sbhl_search_what_mts extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_search_what_mts();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts";


    // defparameter
    // Store for path mts results for straightforward searches
    /**
     * Store for path mts results for straightforward searches
     */
    @LispMethod(comment = "Store for path mts results for straightforward searches\ndefparameter")
    public static final SubLSymbol $sbhl_primary_what_mts_mt_paths$ = makeSymbol("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*");

    // defparameter
    // Store for inverse path mts results for straightforward searches
    /**
     * Store for inverse path mts results for straightforward searches
     */
    @LispMethod(comment = "Store for inverse path mts results for straightforward searches\ndefparameter")
    public static final SubLSymbol $sbhl_primary_what_mts_inverse_mt_paths$ = makeSymbol("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*");

    // defparameter
    // Store for path mts results for searches which require two marking spaces
    /**
     * Store for path mts results for searches which require two marking spaces
     */
    @LispMethod(comment = "Store for path mts results for searches which require two marking spaces\ndefparameter")
    public static final SubLSymbol $sbhl_secondary_what_mts_mt_paths$ = makeSymbol("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*");

    // defparameter
    /**
     * Store for inverse path mts results for searches which require two marking
     * spaces
     */
    @LispMethod(comment = "Store for inverse path mts results for searches which require two marking\r\nspaces\ndefparameter\nStore for inverse path mts results for searches which require two marking\nspaces")
    public static final SubLSymbol $sbhl_secondary_what_mts_inverse_mt_paths$ = makeSymbol("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sbhl_verify_naut_mt_relevance$ = makeSymbol("*SBHL-VERIFY-NAUT-MT-RELEVANCE*");

    // defparameter
    // The initial function to call for what-mts search.
    /**
     * The initial function to call for what-mts search.
     */
    @LispMethod(comment = "The initial function to call for what-mts search.\ndefparameter")
    public static final SubLSymbol $sbhl_what_mts_behavior$ = makeSymbol("*SBHL-WHAT-MTS-BEHAVIOR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_path_mts$ = makeSymbol("*SBHL-PATH-MTS*");

    private static final SubLSymbol POSSIBLY_UPDATE_SBHL_PATH_MTS = makeSymbol("POSSIBLY-UPDATE-SBHL-PATH-MTS");

    static private final SubLList $list4 = list(makeSymbol("*SBHL-PATH-MTS*"));

    private static final SubLSymbol SBHL_REBIND_PATH_MTS = makeSymbol("SBHL-REBIND-PATH-MTS");

    static private final SubLList $list6 = list(list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))));

    static private final SubLList $list9 = list(makeSymbol("SPACE-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_what_mts_mt_paths$ = makeSymbol("*SBHL-WHAT-MTS-MT-PATHS*");

    static private final SubLList $list12 = list(makeKeyword("PRIMARY"));

    static private final SubLList $list13 = list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*"), makeSymbol("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*"));

    public static final SubLSymbol $sbhl_what_mts_inverse_mt_paths$ = makeSymbol("*SBHL-WHAT-MTS-INVERSE-MT-PATHS*");

    static private final SubLList $list15 = list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*"), makeSymbol("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*"));

    static private final SubLList $list16 = list(list(makeSymbol("*SBHL-VERIFY-NAUT-MT-RELEVANCE*"), NIL));

    static private final SubLList $list17 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_what_mts_map_function$ = makeSymbol("*SBHL-WHAT-MTS-MAP-FUNCTION*");

    private static final SubLSymbol SBHL_FALSE_WHAT_MTS_STEP = makeSymbol("SBHL-FALSE-WHAT-MTS-STEP");

    private static final SubLSymbol SBHL_FALSE_WHAT_MTS_SWEEP = makeSymbol("SBHL-FALSE-WHAT-MTS-SWEEP");

    private static final SubLSymbol SBHL_WHAT_MTS_TT_SWEEP = makeSymbol("SBHL-WHAT-MTS-TT-SWEEP");

    private static final SubLSymbol SBHL_WHAT_MTS_TT_STEP = makeSymbol("SBHL-WHAT-MTS-TT-STEP");

    private static final SubLSymbol SBHL_WHAT_MTS_STEP_ACROSS_MARKED_DISJOINS = makeSymbol("SBHL-WHAT-MTS-STEP-ACROSS-MARKED-DISJOINS");

    private static final SubLSymbol SBHL_WHAT_MTS_SWEEP_MARKED_DISJOINS = makeSymbol("SBHL-WHAT-MTS-SWEEP-MARKED-DISJOINS");

    private static final SubLSymbol SBHL_WHAT_MTS_SWEEP_FORWARD_STEP_AND_SWEEP_FALSE_DISJOINS = makeSymbol("SBHL-WHAT-MTS-SWEEP-FORWARD-STEP-AND-SWEEP-FALSE-DISJOINS");

    private static final SubLSymbol SBHL_WHAT_MTS_SWEEP_FALSE_DISJOINS = makeSymbol("SBHL-WHAT-MTS-SWEEP-FALSE-DISJOINS");

    static private final SubLList $list27 = list(makeSymbol("NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_what_mts_goal$ = makeSymbol("*SBHL-WHAT-MTS-GOAL*");





    private static final SubLString $str31$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str32$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLSymbol SBHL_CHECK_CUTOFF = makeSymbol("SBHL-CHECK-CUTOFF");



    private static final SubLSymbol SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH = makeSymbol("SBHL-SIMPLE-TRUE-WHAT-MTS-SEARCH");

    private static final SubLSymbol SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH = makeSymbol("SBHL-SIMPLE-FALSE-WHAT-MTS-SEARCH");

    private static final SubLSymbol SBHL_TT_WHAT_MTS_SEARCH = makeSymbol("SBHL-TT-WHAT-MTS-SEARCH");

    private static final SubLSymbol SBHL_WHAT_MTS_TT_BACKWARD_SEARCH = makeSymbol("SBHL-WHAT-MTS-TT-BACKWARD-SEARCH");

    private static final SubLSymbol SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH = makeSymbol("SBHL-WHAT-MTS-TRUE-DISJOINS-SEARCH");

    private static final SubLSymbol SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH = makeSymbol("SBHL-WHAT-MTS-FALSE-DISJOINS-SEARCH");

    private static final SubLString $str42$Search_behavior_not_recognized__S = makeString("Search behavior not recognized. Sorry.");

    private static final SubLList $list43 = list(list(makeSymbol("*SBHL-WHAT-MTS-BEHAVIOR*"), list(makeSymbol("DETERMINE-SBHL-WHAT-MTS-BEHAVIOR"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")), list(makeSymbol("GET-SBHL-SEARCH-DIRECTION")), list(makeSymbol("GET-SBHL-TV")))));

    private static final SubLString $str44$Unsupported_what_mts_behavior__a = makeString("Unsupported what mts behavior ~a");

    private static final SubLString $str47$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str52$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLSymbol SBHL_FALSE_TV_P = makeSymbol("SBHL-FALSE-TV-P");

    private static final SubLObject $$False_JustificationTruth = reader_make_constant_shell("False-JustificationTruth");





    private static final SubLSymbol SBHL_MAX_FLOOR_MTS = makeSymbol("SBHL-MAX-FLOOR-MTS");

    private static final SubLString $str64$Mts_might_not_be_valid_because_in = makeString("Mts might not be valid because initial node was a NAUT which used complicated link generation.");

    private static final SubLSymbol $sym66$SBHL_INVERSE_CARDINALITY_ = makeSymbol("SBHL-INVERSE-CARDINALITY<");

    /**
     * Rebinds @see *sbhl-path-mts*. Conses MT to its head if MT is not already a member of the path mts
     */
    @LispMethod(comment = "Rebinds @see *sbhl-path-mts*. Conses MT to its head if MT is not already a member of the path mts")
    public static final SubLObject sbhl_rebind_path_mts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_path_mts$, listS(POSSIBLY_UPDATE_SBHL_PATH_MTS, mt, $list_alt4))), append(body, NIL));
            }
        }
    }

    /**
     * Rebinds @see *sbhl-path-mts*. Conses MT to its head if MT is not already a member of the path mts
     */
    @LispMethod(comment = "Rebinds @see *sbhl-path-mts*. Conses MT to its head if MT is not already a member of the path mts")
    public static SubLObject sbhl_rebind_path_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_path_mts$, listS(POSSIBLY_UPDATE_SBHL_PATH_MTS, mt, $list4))), append(body, NIL));
    }

    public static final SubLObject possibly_update_sbhl_path_mts_alt(SubLObject mt, SubLObject path_mts) {
        return NIL != mt ? ((SubLObject) (NIL != list_utilities.member_eqP(mt, path_mts) ? ((SubLObject) (path_mts)) : cons(mt, path_mts))) : path_mts;
    }

    public static SubLObject possibly_update_sbhl_path_mts(final SubLObject mt, final SubLObject path_mts) {
        return NIL != mt ? NIL != subl_promotions.memberP(mt, path_mts, symbol_function(EQL), UNPROVIDED) ? path_mts : cons(mt, path_mts) : path_mts;
    }

    /**
     *
     *
     * @unknown *sbhl-primary-what-mts-mt-paths* *sbhl-primary-what-mts-inverse-mt-paths* *sbhl-secondary-what-mts-mt-paths* *sbhl-secondary-what-mts-inverse-mt-paths*. Makes each of these into a new hashtable for the scope of BODY.
     */
    @LispMethod(comment = "@unknown *sbhl-primary-what-mts-mt-paths* *sbhl-primary-what-mts-inverse-mt-paths* *sbhl-secondary-what-mts-mt-paths* *sbhl-secondary-what-mts-inverse-mt-paths*. Makes each of these into a new hashtable for the scope of BODY.")
    public static final SubLObject with_new_sbhl_what_mts_marking_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt6, append(body, NIL));
        }
    }

    /**
     *
     *
     * @unknown *sbhl-primary-what-mts-mt-paths* *sbhl-primary-what-mts-inverse-mt-paths* *sbhl-secondary-what-mts-mt-paths* *sbhl-secondary-what-mts-inverse-mt-paths*. Makes each of these into a new hashtable for the scope of BODY.
     */
    @LispMethod(comment = "@unknown *sbhl-primary-what-mts-mt-paths* *sbhl-primary-what-mts-inverse-mt-paths* *sbhl-secondary-what-mts-mt-paths* *sbhl-secondary-what-mts-inverse-mt-paths*. Makes each of these into a new hashtable for the scope of BODY.")
    public static SubLObject with_new_sbhl_what_mts_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list6, append(body, NIL));
    }

    /**
     * Accessor: returns the keyword :primary. used to determine which what-mts-paths to use.
     */
    @LispMethod(comment = "Accessor: returns the keyword :primary. used to determine which what-mts-paths to use.")
    public static final SubLObject sbhl_primary_what_mts_spaces_alt() {
        return $PRIMARY;
    }

    /**
     * Accessor: returns the keyword :primary. used to determine which what-mts-paths to use.
     */
    @LispMethod(comment = "Accessor: returns the keyword :primary. used to determine which what-mts-paths to use.")
    public static SubLObject sbhl_primary_what_mts_spaces() {
        return $PRIMARY;
    }

    /**
     * Accessor: returns the keyword :secondary used to determine which what-mts-paths to use.
     */
    @LispMethod(comment = "Accessor: returns the keyword :secondary used to determine which what-mts-paths to use.")
    public static final SubLObject sbhl_secondary_what_mts_spaces_alt() {
        return $SECONDARY;
    }

    /**
     * Accessor: returns the keyword :secondary used to determine which what-mts-paths to use.
     */
    @LispMethod(comment = "Accessor: returns the keyword :secondary used to determine which what-mts-paths to use.")
    public static SubLObject sbhl_secondary_what_mts_spaces() {
        return $SECONDARY;
    }

    /**
     *
     *
     * @unknown *sbhl-what-mts-mt-paths* *sbhl-what-mts-inverse-mt-paths*. Binds each of these the the space corresponding to SPACE-ID. :primary denotes primary spaces. :secondary denotes secondary spaces.
     */
    @LispMethod(comment = "@unknown *sbhl-what-mts-mt-paths* *sbhl-what-mts-inverse-mt-paths*. Binds each of these the the space corresponding to SPACE-ID. :primary denotes primary spaces. :secondary denotes secondary spaces.")
    public static final SubLObject within_sbhl_what_mts_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject space_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            space_id = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_what_mts_mt_paths$, listS(FIF, listS(EQ, space_id, $list_alt12), $list_alt13)), list($sbhl_what_mts_inverse_mt_paths$, listS(FIF, listS(EQ, space_id, $list_alt12), $list_alt15))), append(body, NIL));
            }
        }
    }

    /**
     *
     *
     * @unknown *sbhl-what-mts-mt-paths* *sbhl-what-mts-inverse-mt-paths*. Binds each of these the the space corresponding to SPACE-ID. :primary denotes primary spaces. :secondary denotes secondary spaces.
     */
    @LispMethod(comment = "@unknown *sbhl-what-mts-mt-paths* *sbhl-what-mts-inverse-mt-paths*. Binds each of these the the space corresponding to SPACE-ID. :primary denotes primary spaces. :secondary denotes secondary spaces.")
    public static SubLObject within_sbhl_what_mts_spaces(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space_id = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        space_id = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_what_mts_mt_paths$, listS(FIF, listS(EQ, space_id, $list12), $list13)), list($sbhl_what_mts_inverse_mt_paths$, listS(FIF, listS(EQ, space_id, $list12), $list15))), append(body, NIL));
    }

    /**
     * Accessor: @return hash-table-p; the space for what mts marking. @hack genl-inverse-mode-p.
     */
    @LispMethod(comment = "Accessor: @return hash-table-p; the space for what mts marking. @hack genl-inverse-mode-p.")
    public static final SubLObject get_sbhl_what_mts_marking_space_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
                return $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread);
            } else {
                return $sbhl_what_mts_mt_paths$.getDynamicValue(thread);
            }
        }
    }

    /**
     * Accessor: @return hash-table-p; the space for what mts marking. @hack genl-inverse-mode-p.
     */
    @LispMethod(comment = "Accessor: @return hash-table-p; the space for what mts marking. @hack genl-inverse-mode-p.")
    public static SubLObject get_sbhl_what_mts_marking_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            return $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread);
        }
        return $sbhl_what_mts_mt_paths$.getDynamicValue(thread);
    }

    /**
     * Accessor: @return listp; the current what mts marking for NODE. @hack genl-inverse-mode-p.
     */
    @LispMethod(comment = "Accessor: @return listp; the current what mts marking for NODE. @hack genl-inverse-mode-p.")
    public static final SubLObject get_sbhl_what_mts_marking_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
                return gethash(node, $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread), UNPROVIDED);
            } else {
                return gethash(node, $sbhl_what_mts_mt_paths$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    /**
     * Accessor: @return listp; the current what mts marking for NODE. @hack genl-inverse-mode-p.
     */
    @LispMethod(comment = "Accessor: @return listp; the current what mts marking for NODE. @hack genl-inverse-mode-p.")
    public static SubLObject get_sbhl_what_mts_marking(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            return gethash(node, $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread), UNPROVIDED);
        }
        return gethash(node, $sbhl_what_mts_mt_paths$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * Modifier. changes the mt-path marking for NODE based on @see *sbhl-path-mts*. *sbhl-path-mts* is added to the what-mts-marking for NODE, and every path which is a proper superset of *sbhl-path-mts* is removed from the marking.
     */
    @LispMethod(comment = "Modifier. changes the mt-path marking for NODE based on @see *sbhl-path-mts*. *sbhl-path-mts* is added to the what-mts-marking for NODE, and every path which is a proper superset of *sbhl-path-mts* is removed from the marking.")
    public static final SubLObject sbhl_what_mts_mark_mt_paths_to_node_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject what_mts_space = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.get_sbhl_what_mts_marking_space();
                SubLObject redundant_mt_paths = NIL;
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.get_sbhl_what_mts_marking(node);
                    SubLObject mt_path = NIL;
                    for (mt_path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_path = cdolist_list_var.first()) {
                        if (NIL != list_utilities.proper_subsetp($sbhl_path_mts$.getDynamicValue(thread), mt_path, UNPROVIDED, UNPROVIDED)) {
                            redundant_mt_paths = cons(mt_path, redundant_mt_paths);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = redundant_mt_paths;
                    SubLObject mt_path = NIL;
                    for (mt_path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_path = cdolist_list_var.first()) {
                        hash_table_utilities.delete_hash(node, mt_path, what_mts_space, EQUAL, UNPROVIDED);
                    }
                }
                hash_table_utilities.push_hash(node, $sbhl_path_mts$.getDynamicValue(thread), what_mts_space);
            }
            return NIL;
        }
    }

    /**
     * Modifier. changes the mt-path marking for NODE based on @see *sbhl-path-mts*. *sbhl-path-mts* is added to the what-mts-marking for NODE, and every path which is a proper superset of *sbhl-path-mts* is removed from the marking.
     */
    @LispMethod(comment = "Modifier. changes the mt-path marking for NODE based on @see *sbhl-path-mts*. *sbhl-path-mts* is added to the what-mts-marking for NODE, and every path which is a proper superset of *sbhl-path-mts* is removed from the marking.")
    public static SubLObject sbhl_what_mts_mark_mt_paths_to_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject what_mts_space = get_sbhl_what_mts_marking_space();
        SubLObject redundant_mt_paths = NIL;
        SubLObject cdolist_list_var = get_sbhl_what_mts_marking(node);
        SubLObject mt_path = NIL;
        mt_path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.proper_subsetp($sbhl_path_mts$.getDynamicValue(thread), mt_path, UNPROVIDED, UNPROVIDED)) {
                redundant_mt_paths = cons(mt_path, redundant_mt_paths);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_path = cdolist_list_var.first();
        } 
        cdolist_list_var = redundant_mt_paths;
        mt_path = NIL;
        mt_path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hash_table_utilities.delete_hash(node, mt_path, what_mts_space, EQUAL, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            mt_path = cdolist_list_var.first();
        } 
        hash_table_utilities.push_hash(node, $sbhl_path_mts$.getDynamicValue(thread), what_mts_space);
        return NIL;
    }

    /**
     * Accessor. @return booleanp; whether the current *sbhl-path-mts* is a superset of the path-mts markings of NODE.
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether the current *sbhl-path-mts* is a superset of the path-mts markings of NODE.")
    public static final SubLObject sbhl_what_mts_marking_subsumes_marking_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subsumesP = NIL;
                if (NIL == subsumesP) {
                    {
                        SubLObject csome_list_var = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.get_sbhl_what_mts_marking(node);
                        SubLObject mt_path = NIL;
                        for (mt_path = csome_list_var.first(); !((NIL != subsumesP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt_path = csome_list_var.first()) {
                            if (NIL != subsetp(mt_path, $sbhl_path_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                subsumesP = T;
                            }
                        }
                    }
                }
                return subsumesP;
            }
        }
    }

    /**
     * Accessor. @return booleanp; whether the current *sbhl-path-mts* is a superset of the path-mts markings of NODE.
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether the current *sbhl-path-mts* is a superset of the path-mts markings of NODE.")
    public static SubLObject sbhl_what_mts_marking_subsumes_marking_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subsumesP = NIL;
        if (NIL == subsumesP) {
            SubLObject csome_list_var = get_sbhl_what_mts_marking(node);
            SubLObject mt_path = NIL;
            mt_path = csome_list_var.first();
            while ((NIL == subsumesP) && (NIL != csome_list_var)) {
                if (NIL != subsetp(mt_path, $sbhl_path_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    subsumesP = T;
                }
                csome_list_var = csome_list_var.rest();
                mt_path = csome_list_var.first();
            } 
        }
        return subsumesP;
    }

    public static final SubLObject determine_sbhl_link_mt_alt(SubLObject node, SubLObject link_node) {
        if ((NIL != forts.fort_p(node)) || (NIL != (node.isCons() ? ((SubLObject) (narts_high.find_nart(node))) : NIL))) {
            return sbhl_link_vars.get_sbhl_link_mt();
        } else {
            return NIL;
        }
    }

    public static SubLObject determine_sbhl_link_mt(final SubLObject node, final SubLObject link_node) {
        if ((NIL != forts.fort_p(node)) || (NIL != (node.isCons() ? narts_high.find_nart(node) : NIL))) {
            return sbhl_link_vars.get_sbhl_link_mt();
        }
        return NIL;
    }

    public static final SubLObject sbhl_encountered_difficult_naut_mt_generator_alt() {
        $sbhl_verify_naut_mt_relevance$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject sbhl_encountered_difficult_naut_mt_generator() {
        $sbhl_verify_naut_mt_relevance$.setDynamicValue(T);
        return NIL;
    }

    public static final SubLObject with_new_naut_mt_relevance_verification_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt16, append(body, NIL));
        }
    }

    public static SubLObject with_new_naut_mt_relevance_verification(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list16, append(body, NIL));
    }

    public static final SubLObject sbhl_verify_naut_mt_relevance_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_verify_naut_mt_relevance$.getDynamicValue(thread);
        }
    }

    public static SubLObject sbhl_verify_naut_mt_relevance_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_verify_naut_mt_relevance$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @unknown *sbhl-what-mts-map-function*. sets it to FN.
     */
    @LispMethod(comment = "@unknown *sbhl-what-mts-map-function*. sets it to FN.")
    public static final SubLObject with_sbhl_what_mts_map_function_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_what_mts_map_function$, fn)), append(body, NIL));
            }
        }
    }

    /**
     *
     *
     * @unknown *sbhl-what-mts-map-function*. sets it to FN.
     */
    @LispMethod(comment = "@unknown *sbhl-what-mts-map-function*. sets it to FN.")
    public static SubLObject with_sbhl_what_mts_map_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_what_mts_map_function$, fn)), append(body, NIL));
    }

    /**
     * Accessor: returns @see *sbhl-what-mts-map-function*
     */
    @LispMethod(comment = "Accessor: returns @see *sbhl-what-mts-map-function*")
    public static final SubLObject get_sbhl_what_mts_map_function_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_what_mts_map_function$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor: returns @see *sbhl-what-mts-map-function*
     */
    @LispMethod(comment = "Accessor: returns @see *sbhl-what-mts-map-function*")
    public static SubLObject get_sbhl_what_mts_map_function() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_what_mts_map_function$.getDynamicValue(thread);
    }

    /**
     * Accessor: @return booleanp; whether @see *sbhl-what-mts-map-function* is or is not null.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether @see *sbhl-what-mts-map-function* is or is not null.")
    public static final SubLObject sbhl_what_mts_not_mapping_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return sublisp_null($sbhl_what_mts_map_function$.getDynamicValue(thread));
        }
    }

    /**
     * Accessor: @return booleanp; whether @see *sbhl-what-mts-map-function* is or is not null.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether @see *sbhl-what-mts-map-function* is or is not null.")
    public static SubLObject sbhl_what_mts_not_mapping_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sublisp_null($sbhl_what_mts_map_function$.getDynamicValue(thread));
    }

    /**
     *
     *
     * @unknown reduces funcalls. applies @see *sbhl-what-mts-map-function* to NODE
     */
    @LispMethod(comment = "@unknown reduces funcalls. applies @see *sbhl-what-mts-map-function* to NODE")
    public static final SubLObject sbhl_apply_what_mts_map_function_alt(SubLObject node) {
        {
            SubLObject map_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.get_sbhl_what_mts_map_function();
            if (NIL != map_fn) {
                {
                    SubLObject pcase_var = map_fn;
                    if (pcase_var.eql(SBHL_FALSE_WHAT_MTS_STEP)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_false_what_mts_step(node);
                    } else {
                        if (pcase_var.eql(SBHL_FALSE_WHAT_MTS_SWEEP)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_false_what_mts_sweep(node);
                        } else {
                            if (pcase_var.eql(SBHL_WHAT_MTS_TT_SWEEP)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_tt_sweep(node);
                            } else {
                                if (pcase_var.eql(SBHL_WHAT_MTS_TT_STEP)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_tt_step(node);
                                } else {
                                    if (pcase_var.eql(SBHL_WHAT_MTS_STEP_ACROSS_MARKED_DISJOINS)) {
                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_step_across_marked_disjoins(node);
                                    } else {
                                        if (pcase_var.eql(SBHL_WHAT_MTS_SWEEP_MARKED_DISJOINS)) {
                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep_marked_disjoins(node);
                                        } else {
                                            if (pcase_var.eql(SBHL_WHAT_MTS_SWEEP_FORWARD_STEP_AND_SWEEP_FALSE_DISJOINS)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep_forward_step_and_sweep_false_disjoins(node);
                                            } else {
                                                if (pcase_var.eql(SBHL_WHAT_MTS_SWEEP_FALSE_DISJOINS)) {
                                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep_false_disjoins(node);
                                                } else {
                                                    funcall(map_fn, node);
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
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown reduces funcalls. applies @see *sbhl-what-mts-map-function* to NODE
     */
    @LispMethod(comment = "@unknown reduces funcalls. applies @see *sbhl-what-mts-map-function* to NODE")
    public static SubLObject sbhl_apply_what_mts_map_function(final SubLObject node) {
        final SubLObject map_fn = get_sbhl_what_mts_map_function();
        if (NIL != map_fn) {
            final SubLObject pcase_var = map_fn;
            if (pcase_var.eql(SBHL_FALSE_WHAT_MTS_STEP)) {
                sbhl_false_what_mts_step(node);
            } else
                if (pcase_var.eql(SBHL_FALSE_WHAT_MTS_SWEEP)) {
                    sbhl_false_what_mts_sweep(node);
                } else
                    if (pcase_var.eql(SBHL_WHAT_MTS_TT_SWEEP)) {
                        sbhl_what_mts_tt_sweep(node);
                    } else
                        if (pcase_var.eql(SBHL_WHAT_MTS_TT_STEP)) {
                            sbhl_what_mts_tt_step(node);
                        } else
                            if (pcase_var.eql(SBHL_WHAT_MTS_STEP_ACROSS_MARKED_DISJOINS)) {
                                sbhl_what_mts_step_across_marked_disjoins(node);
                            } else
                                if (pcase_var.eql(SBHL_WHAT_MTS_SWEEP_MARKED_DISJOINS)) {
                                    sbhl_what_mts_sweep_marked_disjoins(node);
                                } else
                                    if (pcase_var.eql(SBHL_WHAT_MTS_SWEEP_FORWARD_STEP_AND_SWEEP_FALSE_DISJOINS)) {
                                        sbhl_what_mts_sweep_forward_step_and_sweep_false_disjoins(node);
                                    } else
                                        if (pcase_var.eql(SBHL_WHAT_MTS_SWEEP_FALSE_DISJOINS)) {
                                            sbhl_what_mts_sweep_false_disjoins(node);
                                        } else {
                                            funcall(map_fn, node);
                                        }







        }
        return NIL;
    }

    /**
     *
     *
     * @return sbhl-node-object-p; @see *sbhl-what-mts-goal*
     */
    @LispMethod(comment = "@return sbhl-node-object-p; @see *sbhl-what-mts-goal*")
    public static final SubLObject get_sbhl_what_mts_goal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_what_mts_goal$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return sbhl-node-object-p; @see *sbhl-what-mts-goal*
     */
    @LispMethod(comment = "@return sbhl-node-object-p; @see *sbhl-what-mts-goal*")
    public static SubLObject get_sbhl_what_mts_goal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_what_mts_goal$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @unknown *sbhl-what-mts-goal*; sets it to NODE within BODY
     */
    @LispMethod(comment = "@unknown *sbhl-what-mts-goal*; sets it to NODE within BODY")
    public static final SubLObject with_sbhl_what_mts_goal_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject node = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt27);
            node = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_what_mts_goal$, node)), append(body, NIL));
            }
        }
    }

    /**
     *
     *
     * @unknown *sbhl-what-mts-goal*; sets it to NODE within BODY
     */
    @LispMethod(comment = "@unknown *sbhl-what-mts-goal*; sets it to NODE within BODY")
    public static SubLObject with_sbhl_what_mts_goal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        node = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_what_mts_goal$, node)), append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; whether the search context allows goal checking and if NODE is the @see *sbhl-what-mts-goal*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the search context allows goal checking and if NODE is the @see *sbhl-what-mts-goal*")
    public static final SubLObject sbhl_what_mts_goal_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_not_mapping_p()) {
                {
                    SubLObject add_node_test = sbhl_search_vars.get_sbhl_search_add_node_test();
                    SubLObject check_goalP = T;
                    if (NIL != add_node_test) {
                        check_goalP = funcall(add_node_test);
                    }
                    if (NIL != check_goalP) {
                        return eq(node, $sbhl_what_mts_goal$.getDynamicValue(thread));
                    }
                }
            } else {
                return NIL;
            }
            return NIL;
        }
    }

    /**
     * Accessor: @return booleanp; whether the search context allows goal checking and if NODE is the @see *sbhl-what-mts-goal*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the search context allows goal checking and if NODE is the @see *sbhl-what-mts-goal*")
    public static SubLObject sbhl_what_mts_goal_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_what_mts_not_mapping_p()) {
            return NIL;
        }
        final SubLObject add_node_test = sbhl_search_vars.get_sbhl_search_add_node_test();
        SubLObject check_goalP = T;
        if (NIL != add_node_test) {
            check_goalP = funcall(add_node_test);
        }
        if (NIL != check_goalP) {
            return eql(node, $sbhl_what_mts_goal$.getDynamicValue(thread));
        }
        return NIL;
    }

    /**
     * Accessor: @return booleanp; used for disjoin searches to determine whether to follow links across to the disjoins. @hack, explicitly references #$negationInverse for behavior
     */
    @LispMethod(comment = "Accessor: @return booleanp; used for disjoin searches to determine whether to follow links across to the disjoins. @hack, explicitly references #$negationInverse for behavior")
    public static final SubLObject sbhl_what_mts_proper_mark_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject search_module_pred = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module());
                SubLObject result = NIL;
                if (search_module_pred == $$negationInverse) {
                    {
                        SubLObject _prev_bind_0 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                            result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
                        } finally {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
                }
                return result;
            }
        }
    }

    /**
     * Accessor: @return booleanp; used for disjoin searches to determine whether to follow links across to the disjoins. @hack, explicitly references #$negationInverse for behavior
     */
    @LispMethod(comment = "Accessor: @return booleanp; used for disjoin searches to determine whether to follow links across to the disjoins. @hack, explicitly references #$negationInverse for behavior")
    public static SubLObject sbhl_what_mts_proper_mark_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_module_pred = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module());
        SubLObject result = NIL;
        if (search_module_pred.eql($$negationInverse)) {
            final SubLObject _prev_bind_0 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_search_vars.$genl_inverse_mode_p$.bind(makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
        }
        return result;
    }

    public static final SubLObject sbhl_what_mts_proper_goal_mark_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject search_module_pred = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module());
                SubLObject result = NIL;
                if ((search_module_pred == $$genlInverse) || (search_module_pred == $$negationInverse)) {
                    {
                        SubLObject _prev_bind_0 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                            result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
                        } finally {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
                }
                return result;
            }
        }
    }

    public static SubLObject sbhl_what_mts_proper_goal_mark_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_module_pred = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module());
        SubLObject result = NIL;
        if (search_module_pred.eql($$genlInverse) || search_module_pred.eql($$negationInverse)) {
            final SubLObject _prev_bind_0 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_search_vars.$genl_inverse_mode_p$.bind(makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED);
        }
        return result;
    }

    /**
     * Modifier. recursive workhorse that accumulates mt paths from NODE to goal.
     */
    @LispMethod(comment = "Modifier. recursive workhorse that accumulates mt paths from NODE to goal.")
    public static final SubLObject sbhl_what_mts_mark_and_sweep_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_marking_subsumes_marking_p(node)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_mark_mt_paths_to_node(node);
                com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_apply_what_mts_map_function(node);
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_goal_p(node)) {
                    {
                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        SubLObject cdolist_list_var = accessible_modules;
                        SubLObject module_var = NIL;
                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                            {
                                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                    {
                                        SubLObject node_1 = function_terms.naut_to_nart(node);
                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_1)) {
                                            {
                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_1, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link) {
                                                    {
                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            {
                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            {
                                                                                SubLObject _prev_bind_0_2 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    {
                                                                                        SubLObject iteration_state_3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_3)) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_3);
                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_4 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                SubLObject cdolist_list_var_5 = new_list;
                                                                                                                SubLObject link_node = NIL;
                                                                                                                for (link_node = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , link_node = cdolist_list_var_5.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_6 = $sbhl_path_mts$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            $sbhl_path_mts$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.possibly_update_sbhl_path_mts(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                                                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_mark_and_sweep(link_node);
                                                                                                                        } finally {
                                                                                                                            $sbhl_path_mts$.rebind(_prev_bind_0_6, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_4, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                iteration_state_3 = dictionary_contents.do_dictionary_contents_next(iteration_state_3);
                                                                                            }
                                                                                        } 
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_3);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_2, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                    }
                                                                } 
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt31$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        } else {
                                            if (NIL != obsolete.cnat_p(node_1, UNPROVIDED)) {
                                                {
                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    SubLObject cdolist_list_var_7 = new_list;
                                                    SubLObject generating_fn = NIL;
                                                    for (generating_fn = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , generating_fn = cdolist_list_var_7.first()) {
                                                        {
                                                            SubLObject _prev_bind_0_8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                {
                                                                    SubLObject link_nodes = funcall(generating_fn, node_1);
                                                                    SubLObject new_list_9 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                    SubLObject cdolist_list_var_10 = new_list_9;
                                                                    SubLObject link_node = NIL;
                                                                    for (link_node = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , link_node = cdolist_list_var_10.first()) {
                                                                        {
                                                                            SubLObject _prev_bind_0_11 = $sbhl_path_mts$.currentBinding(thread);
                                                                            try {
                                                                                $sbhl_path_mts$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.possibly_update_sbhl_path_mts(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_mark_and_sweep(link_node);
                                                                            } finally {
                                                                                $sbhl_path_mts$.rebind(_prev_bind_0_11, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_8, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier. recursive workhorse that accumulates mt paths from NODE to goal.
     */
    @LispMethod(comment = "Modifier. recursive workhorse that accumulates mt paths from NODE to goal.")
    public static SubLObject sbhl_what_mts_mark_and_sweep(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_what_mts_marking_subsumes_marking_p(node)) {
            sbhl_what_mts_mark_mt_paths_to_node(node);
            sbhl_apply_what_mts_map_function(node);
            if (NIL == sbhl_what_mts_goal_p(node)) {
                SubLObject cdolist_list_var;
                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject module_var = NIL;
                module_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        final SubLObject node_$1 = function_terms.naut_to_nart(node);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$1)) {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$1, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != d_link) {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                if (NIL != mt_links) {
                                    SubLObject iteration_state;
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        final SubLObject tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            final SubLObject _prev_bind_0_$2 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                SubLObject iteration_state_$3;
                                                for (iteration_state_$3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$3); iteration_state_$3 = dictionary_contents.do_dictionary_contents_next(iteration_state_$3)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$3);
                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        final SubLObject _prev_bind_0_$3 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            final SubLObject sol = link_nodes;
                                                            if (NIL != set.set_p(sol)) {
                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                SubLObject basis_object;
                                                                SubLObject state;
                                                                SubLObject link_node;
                                                                SubLObject _prev_bind_0_$4;
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                        _prev_bind_0_$4 = $sbhl_path_mts$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                            sbhl_what_mts_mark_and_sweep(link_node);
                                                                        } finally {
                                                                            $sbhl_path_mts$.rebind(_prev_bind_0_$4, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } else
                                                                if (sol.isList()) {
                                                                    SubLObject csome_list_var = sol;
                                                                    SubLObject link_node2 = NIL;
                                                                    link_node2 = csome_list_var.first();
                                                                    while (NIL != csome_list_var) {
                                                                        final SubLObject _prev_bind_0_$5 = $sbhl_path_mts$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node2), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                            sbhl_what_mts_mark_and_sweep(link_node2);
                                                                        } finally {
                                                                            $sbhl_path_mts$.rebind(_prev_bind_0_$5, thread);
                                                                        }
                                                                        csome_list_var = csome_list_var.rest();
                                                                        link_node2 = csome_list_var.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$3, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$3);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$2, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str32$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node_$1, UNPROVIDED)) {
                                SubLObject cdolist_list_var_$7;
                                final SubLObject new_list = cdolist_list_var_$7 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$7.first();
                                while (NIL != cdolist_list_var_$7) {
                                    final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        final SubLObject sol2;
                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$1);
                                        if (NIL != set.set_p(sol2)) {
                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject link_node3;
                                            SubLObject _prev_bind_0_$7;
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                    _prev_bind_0_$7 = $sbhl_path_mts$.currentBinding(thread);
                                                    try {
                                                        $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node3), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                        sbhl_what_mts_mark_and_sweep(link_node3);
                                                    } finally {
                                                        $sbhl_path_mts$.rebind(_prev_bind_0_$7, thread);
                                                    }
                                                }
                                            }
                                        } else
                                            if (sol2.isList()) {
                                                SubLObject csome_list_var2 = sol2;
                                                SubLObject link_node4 = NIL;
                                                link_node4 = csome_list_var2.first();
                                                while (NIL != csome_list_var2) {
                                                    final SubLObject _prev_bind_0_$8 = $sbhl_path_mts$.currentBinding(thread);
                                                    try {
                                                        $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node4), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                        sbhl_what_mts_mark_and_sweep(link_node4);
                                                    } finally {
                                                        $sbhl_path_mts$.rebind(_prev_bind_0_$8, thread);
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    link_node4 = csome_list_var2.first();
                                                } 
                                            } else {
                                                Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                    generating_fn = cdolist_list_var_$7.first();
                                } 
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    module_var = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    /**
     * Modifier. recursive workhorse that accumulates mt paths along marked nodes from NODE to goal.
     */
    @LispMethod(comment = "Modifier. recursive workhorse that accumulates mt paths along marked nodes from NODE to goal.")
    public static final SubLObject sbhl_what_mts_mark_and_sweep_marked_nodes_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_proper_mark_p(node)) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_marking_subsumes_marking_p(node)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_mark_mt_paths_to_node(node);
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_apply_what_mts_map_function(node);
                    if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_goal_p(node)) {
                        {
                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            SubLObject cdolist_list_var = accessible_modules;
                            SubLObject module_var = NIL;
                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                {
                                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                        {
                                            SubLObject node_12 = function_terms.naut_to_nart(node);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node_12)) {
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_12, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        {
                                                                                            SubLObject iteration_state_14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_14)) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_14);
                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                    SubLObject cdolist_list_var_16 = new_list;
                                                                                                                    SubLObject link_node = NIL;
                                                                                                                    for (link_node = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , link_node = cdolist_list_var_16.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_17 = $sbhl_path_mts$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                $sbhl_path_mts$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.possibly_update_sbhl_path_mts(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_mark_and_sweep_marked_nodes(link_node);
                                                                                                                            } finally {
                                                                                                                                $sbhl_path_mts$.rebind(_prev_bind_0_17, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_15, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_14 = dictionary_contents.do_dictionary_contents_next(iteration_state_14);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_14);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_13, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                        }
                                                                    } 
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt31$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            } else {
                                                if (NIL != obsolete.cnat_p(node_12, UNPROVIDED)) {
                                                    {
                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject cdolist_list_var_18 = new_list;
                                                        SubLObject generating_fn = NIL;
                                                        for (generating_fn = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , generating_fn = cdolist_list_var_18.first()) {
                                                            {
                                                                SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    {
                                                                        SubLObject link_nodes = funcall(generating_fn, node_12);
                                                                        SubLObject new_list_20 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                        SubLObject cdolist_list_var_21 = new_list_20;
                                                                        SubLObject link_node = NIL;
                                                                        for (link_node = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , link_node = cdolist_list_var_21.first()) {
                                                                            {
                                                                                SubLObject _prev_bind_0_22 = $sbhl_path_mts$.currentBinding(thread);
                                                                                try {
                                                                                    $sbhl_path_mts$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.possibly_update_sbhl_path_mts(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_mark_and_sweep_marked_nodes(link_node);
                                                                                } finally {
                                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_22, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_19, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier. recursive workhorse that accumulates mt paths along marked nodes from NODE to goal.
     */
    @LispMethod(comment = "Modifier. recursive workhorse that accumulates mt paths along marked nodes from NODE to goal.")
    public static SubLObject sbhl_what_mts_mark_and_sweep_marked_nodes(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_what_mts_proper_mark_p(node)) && (NIL == sbhl_what_mts_marking_subsumes_marking_p(node))) {
            sbhl_what_mts_mark_mt_paths_to_node(node);
            sbhl_apply_what_mts_map_function(node);
            if (NIL == sbhl_what_mts_goal_p(node)) {
                SubLObject cdolist_list_var;
                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject module_var = NIL;
                module_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        final SubLObject node_$11 = function_terms.naut_to_nart(node);
                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$11)) {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$11, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            if (NIL != d_link) {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                if (NIL != mt_links) {
                                    SubLObject iteration_state;
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        final SubLObject tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                            final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                SubLObject iteration_state_$13;
                                                for (iteration_state_$13 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$13); iteration_state_$13 = dictionary_contents.do_dictionary_contents_next(iteration_state_$13)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$13);
                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                        final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            final SubLObject sol = link_nodes;
                                                            if (NIL != set.set_p(sol)) {
                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                SubLObject basis_object;
                                                                SubLObject state;
                                                                SubLObject link_node;
                                                                SubLObject _prev_bind_0_$14;
                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                        _prev_bind_0_$14 = $sbhl_path_mts$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                            sbhl_what_mts_mark_and_sweep_marked_nodes(link_node);
                                                                        } finally {
                                                                            $sbhl_path_mts$.rebind(_prev_bind_0_$14, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } else
                                                                if (sol.isList()) {
                                                                    SubLObject csome_list_var = sol;
                                                                    SubLObject link_node2 = NIL;
                                                                    link_node2 = csome_list_var.first();
                                                                    while (NIL != csome_list_var) {
                                                                        final SubLObject _prev_bind_0_$15 = $sbhl_path_mts$.currentBinding(thread);
                                                                        try {
                                                                            $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node2), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                            sbhl_what_mts_mark_and_sweep_marked_nodes(link_node2);
                                                                        } finally {
                                                                            $sbhl_path_mts$.rebind(_prev_bind_0_$15, thread);
                                                                        }
                                                                        csome_list_var = csome_list_var.rest();
                                                                        link_node2 = csome_list_var.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$13, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$13);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$12, thread);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str32$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != obsolete.cnat_p(node_$11, UNPROVIDED)) {
                                SubLObject cdolist_list_var_$17;
                                final SubLObject new_list = cdolist_list_var_$17 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$17.first();
                                while (NIL != cdolist_list_var_$17) {
                                    final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        final SubLObject sol2;
                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$11);
                                        if (NIL != set.set_p(sol2)) {
                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject link_node3;
                                            SubLObject _prev_bind_0_$17;
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                    _prev_bind_0_$17 = $sbhl_path_mts$.currentBinding(thread);
                                                    try {
                                                        $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node3), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                        sbhl_what_mts_mark_and_sweep_marked_nodes(link_node3);
                                                    } finally {
                                                        $sbhl_path_mts$.rebind(_prev_bind_0_$17, thread);
                                                    }
                                                }
                                            }
                                        } else
                                            if (sol2.isList()) {
                                                SubLObject csome_list_var2 = sol2;
                                                SubLObject link_node4 = NIL;
                                                link_node4 = csome_list_var2.first();
                                                while (NIL != csome_list_var2) {
                                                    final SubLObject _prev_bind_0_$18 = $sbhl_path_mts$.currentBinding(thread);
                                                    try {
                                                        $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node4), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                        sbhl_what_mts_mark_and_sweep_marked_nodes(link_node4);
                                                    } finally {
                                                        $sbhl_path_mts$.rebind(_prev_bind_0_$18, thread);
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    link_node4 = csome_list_var2.first();
                                                } 
                                            } else {
                                                Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                            }

                                    } finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                    }
                                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                    generating_fn = cdolist_list_var_$17.first();
                                } 
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    module_var = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    /**
     * Modifier. steps across links, updating the mt path.
     */
    @LispMethod(comment = "Modifier. steps across links, updating the mt path.")
    public static final SubLObject sbhl_what_mts_step_across_links_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject cdolist_list_var = accessible_modules;
                SubLObject module_var = NIL;
                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                            {
                                SubLObject node_23 = function_terms.naut_to_nart(node);
                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_23)) {
                                    {
                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_23, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                        if (NIL != d_link) {
                                            {
                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                if (NIL != mt_links) {
                                                    {
                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    {
                                                                        SubLObject _prev_bind_0_24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            {
                                                                                SubLObject iteration_state_25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_25)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_25);
                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                        SubLObject cdolist_list_var_27 = new_list;
                                                                                                        SubLObject link_node = NIL;
                                                                                                        for (link_node = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , link_node = cdolist_list_var_27.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_28 = $sbhl_path_mts$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    $sbhl_path_mts$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.possibly_update_sbhl_path_mts(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_apply_what_mts_map_function(link_node);
                                                                                                                } finally {
                                                                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_28, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_26, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        iteration_state_25 = dictionary_contents.do_dictionary_contents_next(iteration_state_25);
                                                                                    }
                                                                                } 
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_25);
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_24, thread);
                                                                        }
                                                                    }
                                                                }
                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                }
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt31$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                } else {
                                    if (NIL != obsolete.cnat_p(node_23, UNPROVIDED)) {
                                        {
                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                            SubLObject cdolist_list_var_29 = new_list;
                                            SubLObject generating_fn = NIL;
                                            for (generating_fn = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , generating_fn = cdolist_list_var_29.first()) {
                                                {
                                                    SubLObject _prev_bind_0_30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                        {
                                                            SubLObject link_nodes = funcall(generating_fn, node_23);
                                                            SubLObject new_list_31 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                            SubLObject cdolist_list_var_32 = new_list_31;
                                                            SubLObject link_node = NIL;
                                                            for (link_node = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , link_node = cdolist_list_var_32.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_33 = $sbhl_path_mts$.currentBinding(thread);
                                                                    try {
                                                                        $sbhl_path_mts$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.possibly_update_sbhl_path_mts(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_apply_what_mts_map_function(link_node);
                                                                    } finally {
                                                                        $sbhl_path_mts$.rebind(_prev_bind_0_33, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_30, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier. steps across links, updating the mt path.
     */
    @LispMethod(comment = "Modifier. steps across links, updating the mt path.")
    public static SubLObject sbhl_what_mts_step_across_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject module_var = NIL;
        module_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                final SubLObject node_$21 = function_terms.naut_to_nart(node);
                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$21)) {
                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$21, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                    if (NIL != d_link) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        if (NIL != mt_links) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                    final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        SubLObject iteration_state_$23;
                                        for (iteration_state_$23 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$23); iteration_state_$23 = dictionary_contents.do_dictionary_contents_next(iteration_state_$23)) {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$23);
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    final SubLObject sol = link_nodes;
                                                    if (NIL != set.set_p(sol)) {
                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject link_node;
                                                        SubLObject _prev_bind_0_$24;
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                _prev_bind_0_$24 = $sbhl_path_mts$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                    sbhl_apply_what_mts_map_function(link_node);
                                                                } finally {
                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_$24, thread);
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            SubLObject csome_list_var = sol;
                                                            SubLObject link_node2 = NIL;
                                                            link_node2 = csome_list_var.first();
                                                            while (NIL != csome_list_var) {
                                                                final SubLObject _prev_bind_0_$25 = $sbhl_path_mts$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node2), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                    sbhl_apply_what_mts_map_function(link_node2);
                                                                } finally {
                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_$25, thread);
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                link_node2 = csome_list_var.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$23, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$23);
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$22, thread);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str32$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (NIL != obsolete.cnat_p(node_$21, UNPROVIDED)) {
                        SubLObject cdolist_list_var_$27;
                        final SubLObject new_list = cdolist_list_var_$27 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        SubLObject generating_fn = NIL;
                        generating_fn = cdolist_list_var_$27.first();
                        while (NIL != cdolist_list_var_$27) {
                            final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$21);
                                if (NIL != set.set_p(sol2)) {
                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject link_node3;
                                    SubLObject _prev_bind_0_$27;
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                            _prev_bind_0_$27 = $sbhl_path_mts$.currentBinding(thread);
                                            try {
                                                $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node3), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                sbhl_apply_what_mts_map_function(link_node3);
                                            } finally {
                                                $sbhl_path_mts$.rebind(_prev_bind_0_$27, thread);
                                            }
                                        }
                                    }
                                } else
                                    if (sol2.isList()) {
                                        SubLObject csome_list_var2 = sol2;
                                        SubLObject link_node4 = NIL;
                                        link_node4 = csome_list_var2.first();
                                        while (NIL != csome_list_var2) {
                                            final SubLObject _prev_bind_0_$28 = $sbhl_path_mts$.currentBinding(thread);
                                            try {
                                                $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node4), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                sbhl_apply_what_mts_map_function(link_node4);
                                            } finally {
                                                $sbhl_path_mts$.rebind(_prev_bind_0_$28, thread);
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            link_node4 = csome_list_var2.first();
                                        } 
                                    } else {
                                        Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                    }

                            } finally {
                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$26, thread);
                            }
                            cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                            generating_fn = cdolist_list_var_$27.first();
                        } 
                    }

            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module_var = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Modifier. steps across marked links, updating the mt-path.
     */
    @LispMethod(comment = "Modifier. steps across marked links, updating the mt-path.")
    public static final SubLObject sbhl_what_mts_step_across_marked_links_alt(SubLObject node) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_proper_goal_mark_p(node)) {
            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_step_across_links(node);
        }
        return NIL;
    }

    /**
     * Modifier. steps across marked links, updating the mt-path.
     */
    @LispMethod(comment = "Modifier. steps across marked links, updating the mt-path.")
    public static SubLObject sbhl_what_mts_step_across_marked_links(final SubLObject node) {
        if (NIL != sbhl_what_mts_proper_goal_mark_p(node)) {
            sbhl_what_mts_step_across_links(node);
        }
        return NIL;
    }

    /**
     * Modifier. steps across mt-links, updates mt-path, and sets mt-path marking for link nodes.
     */
    @LispMethod(comment = "Modifier. steps across mt-links, updates mt-path, and sets mt-path marking for link nodes.")
    public static final SubLObject sbhl_what_mts_step_and_update_links_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                SubLObject cdolist_list_var = accessible_modules;
                SubLObject module_var = NIL;
                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                            {
                                SubLObject node_34 = function_terms.naut_to_nart(node);
                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_34)) {
                                    {
                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_34, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                        if (NIL != d_link) {
                                            {
                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                if (NIL != mt_links) {
                                                    {
                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    {
                                                                        SubLObject _prev_bind_0_35 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            {
                                                                                SubLObject iteration_state_36 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_36)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_36);
                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                        SubLObject cdolist_list_var_38 = new_list;
                                                                                                        SubLObject link_node = NIL;
                                                                                                        for (link_node = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , link_node = cdolist_list_var_38.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_39 = $sbhl_path_mts$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    $sbhl_path_mts$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.possibly_update_sbhl_path_mts(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                                                                    if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_marking_subsumes_marking_p(link_node)) {
                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_mark_mt_paths_to_node(link_node);
                                                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_apply_what_mts_map_function(link_node);
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_39, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_37, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        iteration_state_36 = dictionary_contents.do_dictionary_contents_next(iteration_state_36);
                                                                                    }
                                                                                } 
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_36);
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_35, thread);
                                                                        }
                                                                    }
                                                                }
                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                }
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt31$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                } else {
                                    if (NIL != obsolete.cnat_p(node_34, UNPROVIDED)) {
                                        {
                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                            SubLObject cdolist_list_var_40 = new_list;
                                            SubLObject generating_fn = NIL;
                                            for (generating_fn = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , generating_fn = cdolist_list_var_40.first()) {
                                                {
                                                    SubLObject _prev_bind_0_41 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                        {
                                                            SubLObject link_nodes = funcall(generating_fn, node_34);
                                                            SubLObject new_list_42 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                            SubLObject cdolist_list_var_43 = new_list_42;
                                                            SubLObject link_node = NIL;
                                                            for (link_node = cdolist_list_var_43.first(); NIL != cdolist_list_var_43; cdolist_list_var_43 = cdolist_list_var_43.rest() , link_node = cdolist_list_var_43.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_44 = $sbhl_path_mts$.currentBinding(thread);
                                                                    try {
                                                                        $sbhl_path_mts$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.possibly_update_sbhl_path_mts(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                        if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_marking_subsumes_marking_p(link_node)) {
                                                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_mark_mt_paths_to_node(link_node);
                                                                            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_apply_what_mts_map_function(link_node);
                                                                        }
                                                                    } finally {
                                                                        $sbhl_path_mts$.rebind(_prev_bind_0_44, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_41, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier. steps across mt-links, updates mt-path, and sets mt-path marking for link nodes.
     */
    @LispMethod(comment = "Modifier. steps across mt-links, updates mt-path, and sets mt-path marking for link nodes.")
    public static SubLObject sbhl_what_mts_step_and_update_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject module_var = NIL;
        module_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                final SubLObject node_$31 = function_terms.naut_to_nart(node);
                if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$31)) {
                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$31, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                    if (NIL != d_link) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        if (NIL != mt_links) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                    final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                        SubLObject iteration_state_$33;
                                        for (iteration_state_$33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$33); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next(iteration_state_$33)) {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$33);
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                    final SubLObject sol = link_nodes;
                                                    if (NIL != set.set_p(sol)) {
                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject link_node;
                                                        SubLObject _prev_bind_0_$34;
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                _prev_bind_0_$34 = $sbhl_path_mts$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                    if (NIL == sbhl_what_mts_marking_subsumes_marking_p(link_node)) {
                                                                        sbhl_what_mts_mark_mt_paths_to_node(link_node);
                                                                        sbhl_apply_what_mts_map_function(link_node);
                                                                    }
                                                                } finally {
                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_$34, thread);
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            SubLObject csome_list_var = sol;
                                                            SubLObject link_node2 = NIL;
                                                            link_node2 = csome_list_var.first();
                                                            while (NIL != csome_list_var) {
                                                                final SubLObject _prev_bind_0_$35 = $sbhl_path_mts$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node2), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                                    if (NIL == sbhl_what_mts_marking_subsumes_marking_p(link_node2)) {
                                                                        sbhl_what_mts_mark_mt_paths_to_node(link_node2);
                                                                        sbhl_apply_what_mts_map_function(link_node2);
                                                                    }
                                                                } finally {
                                                                    $sbhl_path_mts$.rebind(_prev_bind_0_$35, thread);
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                link_node2 = csome_list_var.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$33, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$33);
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$32, thread);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str32$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if (NIL != obsolete.cnat_p(node_$31, UNPROVIDED)) {
                        SubLObject cdolist_list_var_$37;
                        final SubLObject new_list = cdolist_list_var_$37 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                        SubLObject generating_fn = NIL;
                        generating_fn = cdolist_list_var_$37.first();
                        while (NIL != cdolist_list_var_$37) {
                            final SubLObject _prev_bind_0_$36 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$31);
                                if (NIL != set.set_p(sol2)) {
                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject link_node3;
                                    SubLObject _prev_bind_0_$37;
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                            _prev_bind_0_$37 = $sbhl_path_mts$.currentBinding(thread);
                                            try {
                                                $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node3), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                if (NIL == sbhl_what_mts_marking_subsumes_marking_p(link_node3)) {
                                                    sbhl_what_mts_mark_mt_paths_to_node(link_node3);
                                                    sbhl_apply_what_mts_map_function(link_node3);
                                                }
                                            } finally {
                                                $sbhl_path_mts$.rebind(_prev_bind_0_$37, thread);
                                            }
                                        }
                                    }
                                } else
                                    if (sol2.isList()) {
                                        SubLObject csome_list_var2 = sol2;
                                        SubLObject link_node4 = NIL;
                                        link_node4 = csome_list_var2.first();
                                        while (NIL != csome_list_var2) {
                                            final SubLObject _prev_bind_0_$38 = $sbhl_path_mts$.currentBinding(thread);
                                            try {
                                                $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node4), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                if (NIL == sbhl_what_mts_marking_subsumes_marking_p(link_node4)) {
                                                    sbhl_what_mts_mark_mt_paths_to_node(link_node4);
                                                    sbhl_apply_what_mts_map_function(link_node4);
                                                }
                                            } finally {
                                                $sbhl_path_mts$.rebind(_prev_bind_0_$38, thread);
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            link_node4 = csome_list_var2.first();
                                        } 
                                    } else {
                                        Errors.error($str31$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                    }

                            } finally {
                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$36, thread);
                            }
                            cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                            generating_fn = cdolist_list_var_$37.first();
                        } 
                    }

            } finally {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module_var = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Binds its arguments in setup for @see sbhl-what-mts-mark-and-sweep
     */
    @LispMethod(comment = "Binds its arguments in setup for @see sbhl-what-mts-mark-and-sweep")
    public static final SubLObject sbhl_what_mts_sweep_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject spaces, SubLObject map_fn, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_3 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
                SubLObject _prev_bind_4 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
                SubLObject _prev_bind_5 = $sbhl_what_mts_map_function$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                    sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                    $sbhl_what_mts_mt_paths$.bind(spaces == $PRIMARY ? ((SubLObject) ($sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread))) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
                    $sbhl_what_mts_inverse_mt_paths$.bind(spaces == $PRIMARY ? ((SubLObject) ($sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread))) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
                    $sbhl_what_mts_map_function$.bind(map_fn, thread);
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_mark_and_sweep(node);
                } finally {
                    $sbhl_what_mts_map_function$.rebind(_prev_bind_5, thread);
                    $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_4, thread);
                    $sbhl_what_mts_mt_paths$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Binds its arguments in setup for @see sbhl-what-mts-mark-and-sweep
     */
    @LispMethod(comment = "Binds its arguments in setup for @see sbhl-what-mts-mark-and-sweep")
    public static SubLObject sbhl_what_mts_sweep(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject spaces, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            $sbhl_what_mts_mt_paths$.bind(spaces == $PRIMARY ? $sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_inverse_mt_paths$.bind(spaces == $PRIMARY ? $sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_map_function$.bind(map_fn, thread);
            sbhl_what_mts_mark_and_sweep(node);
        } finally {
            $sbhl_what_mts_map_function$.rebind(_prev_bind_6, thread);
            $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_5, thread);
            $sbhl_what_mts_mt_paths$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Binds its arguments in setup for @see sbhl-what-mts-mark-and-sweep-marked-nodes
     */
    @LispMethod(comment = "Binds its arguments in setup for @see sbhl-what-mts-mark-and-sweep-marked-nodes")
    public static final SubLObject sbhl_what_mts_sweep_marked_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject what_mts_spaces, SubLObject marking_space, SubLObject map_fn, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_3 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
                SubLObject _prev_bind_4 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
                SubLObject _prev_bind_5 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                SubLObject _prev_bind_6 = $sbhl_what_mts_map_function$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                    sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                    $sbhl_what_mts_mt_paths$.bind(what_mts_spaces == $PRIMARY ? ((SubLObject) ($sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread))) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
                    $sbhl_what_mts_inverse_mt_paths$.bind(what_mts_spaces == $PRIMARY ? ((SubLObject) ($sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread))) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
                    sbhl_marking_vars.$sbhl_space$.bind(marking_space, thread);
                    $sbhl_what_mts_map_function$.bind(map_fn, thread);
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_mark_and_sweep_marked_nodes(node);
                } finally {
                    $sbhl_what_mts_map_function$.rebind(_prev_bind_6, thread);
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_5, thread);
                    $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_4, thread);
                    $sbhl_what_mts_mt_paths$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Binds its arguments in setup for @see sbhl-what-mts-mark-and-sweep-marked-nodes
     */
    @LispMethod(comment = "Binds its arguments in setup for @see sbhl-what-mts-mark-and-sweep-marked-nodes")
    public static SubLObject sbhl_what_mts_sweep_marked(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject what_mts_spaces, final SubLObject marking_space, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            $sbhl_what_mts_mt_paths$.bind(what_mts_spaces == $PRIMARY ? $sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_inverse_mt_paths$.bind(what_mts_spaces == $PRIMARY ? $sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
            sbhl_marking_vars.$sbhl_space$.bind(marking_space, thread);
            $sbhl_what_mts_map_function$.bind(map_fn, thread);
            sbhl_what_mts_mark_and_sweep_marked_nodes(node);
        } finally {
            $sbhl_what_mts_map_function$.rebind(_prev_bind_7, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_6, thread);
            $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_5, thread);
            $sbhl_what_mts_mt_paths$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Binds its arguments in setup for @see sbhl-what-mts-step-across-links
     */
    @LispMethod(comment = "Binds its arguments in setup for @see sbhl-what-mts-step-across-links")
    public static final SubLObject sbhl_what_mts_step_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject map_fn, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_3 = $sbhl_what_mts_map_function$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                    sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                    $sbhl_what_mts_map_function$.bind(map_fn, thread);
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_step_across_links(node);
                } finally {
                    $sbhl_what_mts_map_function$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Binds its arguments in setup for @see sbhl-what-mts-step-across-links
     */
    @LispMethod(comment = "Binds its arguments in setup for @see sbhl-what-mts-step-across-links")
    public static SubLObject sbhl_what_mts_step(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            $sbhl_what_mts_map_function$.bind(map_fn, thread);
            sbhl_what_mts_step_across_links(node);
        } finally {
            $sbhl_what_mts_map_function$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Binds its arguments in setup for @see sbhl-what-mts-step-across-marked-links
     */
    @LispMethod(comment = "Binds its arguments in setup for @see sbhl-what-mts-step-across-marked-links")
    public static final SubLObject sbhl_what_mts_step_marked_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject marking_space, SubLObject map_fn, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                SubLObject _prev_bind_4 = $sbhl_what_mts_map_function$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                    sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                    sbhl_marking_vars.$sbhl_space$.bind(marking_space, thread);
                    $sbhl_what_mts_map_function$.bind(map_fn, thread);
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_step_across_marked_links(node);
                } finally {
                    $sbhl_what_mts_map_function$.rebind(_prev_bind_4, thread);
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Binds its arguments in setup for @see sbhl-what-mts-step-across-marked-links
     */
    @LispMethod(comment = "Binds its arguments in setup for @see sbhl-what-mts-step-across-marked-links")
    public static SubLObject sbhl_what_mts_step_marked(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject marking_space, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            sbhl_marking_vars.$sbhl_space$.bind(marking_space, thread);
            $sbhl_what_mts_map_function$.bind(map_fn, thread);
            sbhl_what_mts_step_across_marked_links(node);
        } finally {
            $sbhl_what_mts_map_function$.rebind(_prev_bind_5, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Binds its arguments in setup for @see sbhl-what-mts-step-and-update-links
     */
    @LispMethod(comment = "Binds its arguments in setup for @see sbhl-what-mts-step-and-update-links")
    public static final SubLObject sbhl_what_mts_step_and_update_mts_alt(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject what_mts_spaces, SubLObject map_fn, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_3 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
                SubLObject _prev_bind_4 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
                SubLObject _prev_bind_5 = $sbhl_what_mts_map_function$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
                    sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
                    $sbhl_what_mts_mt_paths$.bind(what_mts_spaces == $PRIMARY ? ((SubLObject) ($sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread))) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
                    $sbhl_what_mts_inverse_mt_paths$.bind(what_mts_spaces == $PRIMARY ? ((SubLObject) ($sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread))) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
                    $sbhl_what_mts_map_function$.bind(map_fn, thread);
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_step_and_update_links(node);
                } finally {
                    $sbhl_what_mts_map_function$.rebind(_prev_bind_5, thread);
                    $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_4, thread);
                    $sbhl_what_mts_mt_paths$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Binds its arguments in setup for @see sbhl-what-mts-step-and-update-links
     */
    @LispMethod(comment = "Binds its arguments in setup for @see sbhl-what-mts-step-and-update-links")
    public static SubLObject sbhl_what_mts_step_and_update_mts(final SubLObject module, final SubLObject link_direction, final SubLObject tv, final SubLObject what_mts_spaces, final SubLObject map_fn, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
            sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
            $sbhl_what_mts_mt_paths$.bind(what_mts_spaces == $PRIMARY ? $sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_inverse_mt_paths$.bind(what_mts_spaces == $PRIMARY ? $sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_map_function$.bind(map_fn, thread);
            sbhl_what_mts_step_and_update_links(node);
        } finally {
            $sbhl_what_mts_map_function$.rebind(_prev_bind_6, thread);
            $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_5, thread);
            $sbhl_what_mts_mt_paths$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_3, thread);
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Used for true what mts searches of simple predicates, sweeping nodes accessible to NODE
     */
    @LispMethod(comment = "Used for true what mts searches of simple predicates, sweeping nodes accessible to NODE")
    public static final SubLObject sbhl_simple_true_what_mts_search_alt(SubLObject node) {
        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_primary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    /**
     * Used for true what mts searches of simple predicates, sweeping nodes accessible to NODE
     */
    @LispMethod(comment = "Used for true what mts searches of simple predicates, sweeping nodes accessible to NODE")
    public static SubLObject sbhl_simple_true_what_mts_search(final SubLObject node) {
        sbhl_what_mts_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    /**
     * Used for the first part of false what mts searches of simple predicates. Sweeps nodes accessible (in opposite of specified direction) to NODE.
     */
    @LispMethod(comment = "Used for the first part of false what mts searches of simple predicates. Sweeps nodes accessible (in opposite of specified direction) to NODE.")
    public static final SubLObject sbhl_simple_false_what_mts_search_alt(SubLObject node) {
        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_primary_what_mts_spaces(), SBHL_FALSE_WHAT_MTS_STEP, node);
        return NIL;
    }

    /**
     * Used for the first part of false what mts searches of simple predicates. Sweeps nodes accessible (in opposite of specified direction) to NODE.
     */
    @LispMethod(comment = "Used for the first part of false what mts searches of simple predicates. Sweeps nodes accessible (in opposite of specified direction) to NODE.")
    public static SubLObject sbhl_simple_false_what_mts_search(final SubLObject node) {
        sbhl_what_mts_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), SBHL_FALSE_WHAT_MTS_STEP, node);
        return NIL;
    }

    /**
     * Used for stepping across the false predicate links in false what mts searches of simple predicates.
     */
    @LispMethod(comment = "Used for stepping across the false predicate links in false what mts searches of simple predicates.")
    public static final SubLObject sbhl_false_what_mts_step_alt(SubLObject node) {
        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_search_module()), sbhl_search_vars.sbhl_search_false_tv(), SBHL_FALSE_WHAT_MTS_SWEEP, node);
        return NIL;
    }

    /**
     * Used for stepping across the false predicate links in false what mts searches of simple predicates.
     */
    @LispMethod(comment = "Used for stepping across the false predicate links in false what mts searches of simple predicates.")
    public static SubLObject sbhl_false_what_mts_step(final SubLObject node) {
        sbhl_what_mts_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_search_module()), sbhl_search_vars.sbhl_search_false_tv(), SBHL_FALSE_WHAT_MTS_SWEEP, node);
        return NIL;
    }

    /**
     * Used as the third part of false what mts searches of simple predicates. Sweeps all of the false relations inherited from @see sbhl-false-what-mts-step.
     */
    @LispMethod(comment = "Used as the third part of false what mts searches of simple predicates. Sweeps all of the false relations inherited from @see sbhl-false-what-mts-step.")
    public static final SubLObject sbhl_false_what_mts_sweep_alt(SubLObject node) {
        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_secondary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    /**
     * Used as the third part of false what mts searches of simple predicates. Sweeps all of the false relations inherited from @see sbhl-false-what-mts-step.
     */
    @LispMethod(comment = "Used as the third part of false what mts searches of simple predicates. Sweeps all of the false relations inherited from @see sbhl-false-what-mts-step.")
    public static SubLObject sbhl_false_what_mts_sweep(final SubLObject node) {
        sbhl_what_mts_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_secondary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    /**
     * Used for forward transfers through what mts searches. Steps across accessible links.
     */
    @LispMethod(comment = "Used for forward transfers through what mts searches. Steps across accessible links.")
    public static final SubLObject sbhl_tt_what_mts_search_alt(SubLObject node) {
        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_search_vars.get_sbhl_search_module()), sbhl_search_vars.get_sbhl_tv(), SBHL_WHAT_MTS_TT_SWEEP, node);
        return NIL;
    }

    /**
     * Used for forward transfers through what mts searches. Steps across accessible links.
     */
    @LispMethod(comment = "Used for forward transfers through what mts searches. Steps across accessible links.")
    public static SubLObject sbhl_tt_what_mts_search(final SubLObject node) {
        sbhl_what_mts_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_search_vars.get_sbhl_search_module()), sbhl_search_vars.get_sbhl_tv(), SBHL_WHAT_MTS_TT_SWEEP, node);
        return NIL;
    }/**
     * Used for forward transfers through what mts searches. Steps across accessible links.
     */


    /**
     * Used as second part of forward transfers through what mts searches. Sweeps all nodes accessible to NODE.
     */
    @LispMethod(comment = "Used as second part of forward transfers through what mts searches. Sweeps all nodes accessible to NODE.")
    public static final SubLObject sbhl_what_mts_tt_sweep_alt(SubLObject node) {
        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_link_vars.get_sbhl_link_direction())) : sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_primary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    /**
     * Used as second part of forward transfers through what mts searches. Sweeps all nodes accessible to NODE.
     */
    @LispMethod(comment = "Used as second part of forward transfers through what mts searches. Sweeps all nodes accessible to NODE.")
    public static SubLObject sbhl_what_mts_tt_sweep(final SubLObject node) {
        sbhl_what_mts_sweep(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_link_vars.get_sbhl_link_direction() : sbhl_link_vars.get_sbhl_opposite_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), NIL, node);
        return NIL;
    }/**
     * Used as second part of forward transfers through what mts searches. Sweeps all nodes accessible to NODE.
     */


    /**
     * Used for backward transfers through what mts searches. Sweeps across links accessible to NODE via the transfers through module.
     */
    @LispMethod(comment = "Used for backward transfers through what mts searches. Sweeps across links accessible to NODE via the transfers through module.")
    public static final SubLObject sbhl_what_mts_tt_backward_search_alt(SubLObject node) {
        {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module))) : sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_primary_what_mts_spaces(), SBHL_WHAT_MTS_TT_STEP, node);
        }
        return NIL;
    }

    /**
     * Used for backward transfers through what mts searches. Sweeps across links accessible to NODE via the transfers through module.
     */
    @LispMethod(comment = "Used for backward transfers through what mts searches. Sweeps across links accessible to NODE via the transfers through module.")
    public static SubLObject sbhl_what_mts_tt_backward_search(final SubLObject node) {
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_what_mts_sweep(tt_module, NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module) : sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), SBHL_WHAT_MTS_TT_STEP, node);
        return NIL;
    }/**
     * Used for backward transfers through what mts searches. Sweeps across links accessible to NODE via the transfers through module.
     */


    /**
     * Used as the second part of backward transfers through what mts searches. Step across links and updates the path mts for the link nodes to NODE.
     */
    @LispMethod(comment = "Used as the second part of backward transfers through what mts searches. Step across links and updates the path mts for the link nodes to NODE.")
    public static final SubLObject sbhl_what_mts_tt_step_alt(SubLObject node) {
        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_step_and_update_mts(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_search_vars.get_sbhl_search_module()), NIL != sbhl_search_vars.sbhl_true_search_p() ? ((SubLObject) (sbhl_search_vars.sbhl_search_true_tv())) : sbhl_search_vars.sbhl_search_false_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_secondary_what_mts_spaces(), NIL, node);
        return NIL;
    }

    /**
     * Used as the second part of backward transfers through what mts searches. Step across links and updates the path mts for the link nodes to NODE.
     */
    @LispMethod(comment = "Used as the second part of backward transfers through what mts searches. Step across links and updates the path mts for the link nodes to NODE.")
    public static SubLObject sbhl_what_mts_tt_step(final SubLObject node) {
        sbhl_what_mts_step_and_update_mts(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_search_vars.get_sbhl_search_module()), NIL != sbhl_search_vars.sbhl_true_search_p() ? sbhl_search_vars.sbhl_search_true_tv() : sbhl_search_vars.sbhl_search_false_tv(), sbhl_secondary_what_mts_spaces(), NIL, node);
        return NIL;
    }/**
     * Used as the second part of backward transfers through what mts searches. Step across links and updates the path mts for the link nodes to NODE.
     */


    /**
     * Used before true disjoins in what mts searches. Marks the forward closure of NODE and all local disjoins along the way.
     */
    @LispMethod(comment = "Used before true disjoins in what mts searches. Marks the forward closure of NODE and all local disjoins along the way.")
    public static final SubLObject sbhl_what_mts_premark_disjoins_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_CHECK_CUTOFF, thread);
                    sbhl_search_utilities.sbhl_sweep_and_gather_disjoins(node);
                } finally {
                    sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Used before true disjoins in what mts searches. Marks the forward closure of NODE and all local disjoins along the way.
     */
    @LispMethod(comment = "Used before true disjoins in what mts searches. Marks the forward closure of NODE and all local disjoins along the way.")
    public static SubLObject sbhl_what_mts_premark_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_CHECK_CUTOFF, thread);
            sbhl_search_utilities.sbhl_sweep_and_gather_disjoins(node);
        } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Used before true disjoins in what mts searches. Marks the forward closure of NODE and all local disjoins along the way.
     */


    /**
     * First part of true disjoins in what mts searches. Premarks in target spaces with @see sbhl-what-mts-premark-disjoins. Sweeps NODE's forward closure.
     */
    @LispMethod(comment = "First part of true disjoins in what mts searches. Premarks in target spaces with @see sbhl-what-mts-premark-disjoins. Sweeps NODE\'s forward closure.")
    public static final SubLObject sbhl_what_mts_true_disjoins_search_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    {
                        SubLObject _prev_bind_0_45 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            {
                                SubLObject _prev_bind_0_46 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread), thread);
                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_premark_disjoins(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.get_sbhl_what_mts_goal());
                                    {
                                        SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_primary_what_mts_spaces(), SBHL_WHAT_MTS_STEP_ACROSS_MARKED_DISJOINS, node);
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_46, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                        } finally {
                            sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_45, thread);
                        }
                    }
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                } finally {
                    sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * First part of true disjoins in what mts searches. Premarks in target spaces with @see sbhl-what-mts-premark-disjoins. Sweeps NODE's forward closure.
     */
    @LispMethod(comment = "First part of true disjoins in what mts searches. Premarks in target spaces with @see sbhl-what-mts-premark-disjoins. Sweeps NODE\'s forward closure.")
    public static SubLObject sbhl_what_mts_true_disjoins_search(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$41 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$42 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread), thread);
                            sbhl_what_mts_premark_disjoins(get_sbhl_what_mts_goal());
                            final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                            sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), SBHL_WHAT_MTS_STEP_ACROSS_MARKED_DISJOINS, node);
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$42, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_$41, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Second part of true disjoins in what mts searches. Steps across links if NODE is marked.
     */
    @LispMethod(comment = "Second part of true disjoins in what mts searches. Steps across links if NODE is marked.")
    public static final SubLObject sbhl_what_mts_step_across_marked_disjoins_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_step_marked(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread), SBHL_WHAT_MTS_SWEEP_MARKED_DISJOINS, node);
            return NIL;
        }
    }

    /**
     * Second part of true disjoins in what mts searches. Steps across links if NODE is marked.
     */
    @LispMethod(comment = "Second part of true disjoins in what mts searches. Steps across links if NODE is marked.")
    public static SubLObject sbhl_what_mts_step_across_marked_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_what_mts_step_marked(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread), SBHL_WHAT_MTS_SWEEP_MARKED_DISJOINS, node);
        return NIL;
    }/**
     * Second part of true disjoins in what mts searches. Steps across links if NODE is marked.
     */


    /**
     * Third part of true disjoins in what mts searches. Sweeps marked backward closure of NODE.
     */
    @LispMethod(comment = "Third part of true disjoins in what mts searches. Sweeps marked backward closure of NODE.")
    public static final SubLObject sbhl_what_mts_sweep_marked_disjoins_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep_marked(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.get_sbhl_what_mts_sweep_disjoins_module(), sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_secondary_what_mts_spaces(), sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), NIL, node);
            }
            return NIL;
        }
    }

    /**
     * Third part of true disjoins in what mts searches. Sweeps marked backward closure of NODE.
     */
    @LispMethod(comment = "Third part of true disjoins in what mts searches. Sweeps marked backward closure of NODE.")
    public static SubLObject sbhl_what_mts_sweep_marked_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_what_mts_sweep_marked(get_sbhl_what_mts_sweep_disjoins_module(), sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_secondary_what_mts_spaces(), sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), NIL, node);
        return NIL;
    }/**
     * Third part of true disjoins in what mts searches. Sweeps marked backward closure of NODE.
     */


    public static final SubLObject get_sbhl_what_mts_sweep_disjoins_module_alt() {
        if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
            if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
                return sbhl_module_vars.get_sbhl_module($$genlInverse);
            } else {
                return sbhl_module_vars.get_sbhl_module($$genlPreds);
            }
        } else {
            return sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
    }

    public static SubLObject get_sbhl_what_mts_sweep_disjoins_module() {
        if (NIL == sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
            return sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            return sbhl_module_vars.get_sbhl_module($$genlInverse);
        }
        return sbhl_module_vars.get_sbhl_module($$genlPreds);
    }

    /**
     * First part of false disjoins in what mts searches. Sweeps backward closure of NODE.
     */
    @LispMethod(comment = "First part of false disjoins in what mts searches. Sweeps backward closure of NODE.")
    public static final SubLObject sbhl_what_mts_false_disjoins_search_alt(SubLObject node) {
        {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_primary_what_mts_spaces(), SBHL_WHAT_MTS_SWEEP_FORWARD_STEP_AND_SWEEP_FALSE_DISJOINS, node);
        }
        return NIL;
    }

    /**
     * First part of false disjoins in what mts searches. Sweeps backward closure of NODE.
     */
    @LispMethod(comment = "First part of false disjoins in what mts searches. Sweeps backward closure of NODE.")
    public static SubLObject sbhl_what_mts_false_disjoins_search(final SubLObject node) {
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_backward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), SBHL_WHAT_MTS_SWEEP_FORWARD_STEP_AND_SWEEP_FALSE_DISJOINS, node);
        return NIL;
    }/**
     * First part of false disjoins in what mts searches. Sweeps backward closure of NODE.
     */


    /**
     * Second part of false disjoins in what mts searches. Sweeps forward closure of NODE, and step across false dijoins links from NODE.
     */
    @LispMethod(comment = "Second part of false disjoins in what mts searches. Sweeps forward closure of NODE, and step across false dijoins links from NODE.")
    public static final SubLObject sbhl_what_mts_sweep_forward_step_and_sweep_false_disjoins_alt(SubLObject node) {
        {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_secondary_what_mts_spaces(), NIL, node);
        }
        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.sbhl_search_false_tv(), SBHL_WHAT_MTS_SWEEP_FALSE_DISJOINS, node);
        return NIL;
    }

    /**
     * Second part of false disjoins in what mts searches. Sweeps forward closure of NODE, and step across false dijoins links from NODE.
     */
    @LispMethod(comment = "Second part of false disjoins in what mts searches. Sweeps forward closure of NODE, and step across false dijoins links from NODE.")
    public static SubLObject sbhl_what_mts_sweep_forward_step_and_sweep_false_disjoins(final SubLObject node) {
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_secondary_what_mts_spaces(), NIL, node);
        sbhl_what_mts_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_undirected_direction(), sbhl_search_vars.sbhl_search_false_tv(), SBHL_WHAT_MTS_SWEEP_FALSE_DISJOINS, node);
        return NIL;
    }/**
     * Second part of false disjoins in what mts searches. Sweeps forward closure of NODE, and step across false dijoins links from NODE.
     */


    /**
     * Third part of false disjoins in what mts searches. Sweeps forward closure of NODE.
     */
    @LispMethod(comment = "Third part of false disjoins in what mts searches. Sweeps forward closure of NODE.")
    public static final SubLObject sbhl_what_mts_sweep_false_disjoins_alt(SubLObject node) {
        {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_secondary_what_mts_spaces(), NIL, node);
        }
        return NIL;
    }

    @LispMethod(comment = "Third part of false disjoins in what mts searches. Sweeps forward closure of NODE.")
    public static SubLObject sbhl_what_mts_sweep_false_disjoins(final SubLObject node) {
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        sbhl_what_mts_sweep(tt_module, sbhl_module_utilities.get_sbhl_module_forward_direction(tt_module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_secondary_what_mts_spaces(), NIL, node);
        return NIL;
    }/**
     * Third part of false disjoins in what mts searches. Sweeps forward closure of NODE.
     */


    /**
     * Accessor: @return function-spec-p. Returns the name of the search function to call, as determined by PRED's type, DIRECTION, and TV.
     */
    @LispMethod(comment = "Accessor: @return function-spec-p. Returns the name of the search function to call, as determined by PRED\'s type, DIRECTION, and TV.")
    public static final SubLObject determine_sbhl_what_mts_behavior_alt(SubLObject module, SubLObject direction, SubLObject tv) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                return SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH;
            } else {
                return SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH;
            }
        } else {
            if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
                    return SBHL_TT_WHAT_MTS_SEARCH;
                } else {
                    return SBHL_WHAT_MTS_TT_BACKWARD_SEARCH;
                }
            } else {
                if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                        return SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH;
                    } else {
                        return SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH;
                    }
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt41$Search_behavior_not_recognized__S, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Accessor: @return function-spec-p. Returns the name of the search function to call, as determined by PRED\'s type, DIRECTION, and TV.")
    public static SubLObject determine_sbhl_what_mts_behavior(final SubLObject module, final SubLObject direction, final SubLObject tv) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                return SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH;
            }
            return SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH;
        } else
            if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
                    return SBHL_TT_WHAT_MTS_SEARCH;
                }
                return SBHL_WHAT_MTS_TT_BACKWARD_SEARCH;
            } else {
                if (NIL == sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str42$Search_behavior_not_recognized__S, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                    return SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH;
                }
                return SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH;
            }

    }/**
     * Accessor: @return function-spec-p. Returns the name of the search function to call, as determined by PRED's type, DIRECTION, and TV.
     */


    /**
     * Accessor. @return function-spec-p. @see *sbhl-what-mts-behavior*
     */
    @LispMethod(comment = "Accessor. @return function-spec-p. @see *sbhl-what-mts-behavior*")
    public static final SubLObject get_sbhl_what_mts_behavior_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_what_mts_behavior$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor. @return function-spec-p. @see *sbhl-what-mts-behavior*")
    public static SubLObject get_sbhl_what_mts_behavior() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_what_mts_behavior$.getDynamicValue(thread);
    }/**
     * Accessor. @return function-spec-p. @see *sbhl-what-mts-behavior*
     */


    /**
     *
     *
     * @unknown *sbhl-what-mts-behavior*, as determined by search module, direction and truth. @see determine-sbhl-what-mts-behavior.
     */
    @LispMethod(comment = "@unknown *sbhl-what-mts-behavior*, as determined by search module, direction and truth. @see determine-sbhl-what-mts-behavior.")
    public static final SubLObject bind_sbhl_what_mts_behavior_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt42, append(body, NIL));
        }
    }

    /**
     *
     *
     * @unknown *sbhl-what-mts-behavior*, as determined by search module, direction and truth. @see determine-sbhl-what-mts-behavior.
     */
    @LispMethod(comment = "@unknown *sbhl-what-mts-behavior*, as determined by search module, direction and truth. @see determine-sbhl-what-mts-behavior.")
    public static SubLObject bind_sbhl_what_mts_behavior(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list43, append(body, NIL));
    }

    /**
     *
     *
     * @unknown reduces funcalls. applies to NODE @see *sbhl-what-mts-behavior*.
     */
    @LispMethod(comment = "@unknown reduces funcalls. applies to NODE @see *sbhl-what-mts-behavior*.")
    public static final SubLObject sbhl_apply_what_mts_behavior_alt(SubLObject node) {
        {
            SubLObject behavior = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.get_sbhl_what_mts_behavior();
            SubLObject pcase_var = behavior;
            if (pcase_var.eql(SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_simple_true_what_mts_search(node);
            } else {
                if (pcase_var.eql(SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_simple_false_what_mts_search(node);
                } else {
                    if (pcase_var.eql(SBHL_TT_WHAT_MTS_SEARCH)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_tt_what_mts_search(node);
                    } else {
                        if (pcase_var.eql(SBHL_WHAT_MTS_TT_BACKWARD_SEARCH)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_tt_backward_search(node);
                        } else {
                            if (pcase_var.eql(SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_true_disjoins_search(node);
                            } else {
                                if (pcase_var.eql(SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_false_disjoins_search(node);
                                } else {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt43$Unsupported_what_mts_behavior__a, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown reduces funcalls. applies to NODE @see *sbhl-what-mts-behavior*.
     */
    @LispMethod(comment = "@unknown reduces funcalls. applies to NODE @see *sbhl-what-mts-behavior*.")
    public static SubLObject sbhl_apply_what_mts_behavior(final SubLObject node) {
        final SubLObject pcase_var;
        final SubLObject behavior = pcase_var = get_sbhl_what_mts_behavior();
        if (pcase_var.eql(SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH)) {
            sbhl_simple_true_what_mts_search(node);
        } else
            if (pcase_var.eql(SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH)) {
                sbhl_simple_false_what_mts_search(node);
            } else
                if (pcase_var.eql(SBHL_TT_WHAT_MTS_SEARCH)) {
                    sbhl_tt_what_mts_search(node);
                } else
                    if (pcase_var.eql(SBHL_WHAT_MTS_TT_BACKWARD_SEARCH)) {
                        sbhl_what_mts_tt_backward_search(node);
                    } else
                        if (pcase_var.eql(SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH)) {
                            sbhl_what_mts_true_disjoins_search(node);
                        } else
                            if (pcase_var.eql(SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH)) {
                                sbhl_what_mts_false_disjoins_search(node);
                            } else {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str44$Unsupported_what_mts_behavior__a, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }





        return NIL;
    }

    /**
     * Accessor. @return keywordp; the tag indicating which set of marking spaces holds the correct marking information for the goal.
     */
    @LispMethod(comment = "Accessor. @return keywordp; the tag indicating which set of marking spaces holds the correct marking information for the goal.")
    public static final SubLObject sbhl_what_mts_terminating_space_alt() {
        {
            SubLObject behavior = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.get_sbhl_what_mts_behavior();
            SubLObject pcase_var = behavior;
            if (pcase_var.eql(SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_primary_what_mts_spaces();
            } else {
                if (pcase_var.eql(SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_secondary_what_mts_spaces();
                } else {
                    if (pcase_var.eql(SBHL_TT_WHAT_MTS_SEARCH)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_primary_what_mts_spaces();
                    } else {
                        if (pcase_var.eql(SBHL_WHAT_MTS_TT_BACKWARD_SEARCH)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_secondary_what_mts_spaces();
                        } else {
                            if (pcase_var.eql(SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH)) {
                                return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_secondary_what_mts_spaces();
                            } else {
                                if (pcase_var.eql(SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH)) {
                                    return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_secondary_what_mts_spaces();
                                } else {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt43$Unsupported_what_mts_behavior__a, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Accessor. @return keywordp; the tag indicating which set of marking spaces holds the correct marking information for the goal.")
    public static SubLObject sbhl_what_mts_terminating_space() {
        final SubLObject pcase_var;
        final SubLObject behavior = pcase_var = get_sbhl_what_mts_behavior();
        if (pcase_var.eql(SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH)) {
            return sbhl_primary_what_mts_spaces();
        }
        if (pcase_var.eql(SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH)) {
            return sbhl_secondary_what_mts_spaces();
        }
        if (pcase_var.eql(SBHL_TT_WHAT_MTS_SEARCH)) {
            return sbhl_primary_what_mts_spaces();
        }
        if (pcase_var.eql(SBHL_WHAT_MTS_TT_BACKWARD_SEARCH)) {
            return sbhl_secondary_what_mts_spaces();
        }
        if (pcase_var.eql(SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH)) {
            return sbhl_secondary_what_mts_spaces();
        }
        if (pcase_var.eql(SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH)) {
            return sbhl_secondary_what_mts_spaces();
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str44$Unsupported_what_mts_behavior__a, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }/**
     * Accessor. @return keywordp; the tag indicating which set of marking spaces holds the correct marking information for the goal.
     */


    /**
     *
     *
     * @unknown explicitly references behavior for #$genlInverse and #$negationInverse. Accessor: @return listp; the final path mts for NODE
     */
    @LispMethod(comment = "@unknown explicitly references behavior for #$genlInverse and #$negationInverse. Accessor: @return listp; the final path mts for NODE")
    public static final SubLObject sbhl_what_mts_final_mt_paths_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
                    try {
                        $sbhl_what_mts_mt_paths$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_terminating_space() == $PRIMARY ? ((SubLObject) ($sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread))) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
                        $sbhl_what_mts_inverse_mt_paths$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_terminating_space() == $PRIMARY ? ((SubLObject) ($sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread))) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
                        if ((sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module()) == $$genlInverse) || (sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module()) == $$negationInverse)) {
                            result = gethash(node, $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread), UNPROVIDED);
                        } else {
                            result = gethash(node, $sbhl_what_mts_mt_paths$.getDynamicValue(thread), UNPROVIDED);
                        }
                    } finally {
                        $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_1, thread);
                        $sbhl_what_mts_mt_paths$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown explicitly references behavior for #$genlInverse and #$negationInverse. Accessor: @return listp; the final path mts for NODE
     */
    @LispMethod(comment = "@unknown explicitly references behavior for #$genlInverse and #$negationInverse. Accessor: @return listp; the final path mts for NODE")
    public static SubLObject sbhl_what_mts_final_mt_paths(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
        try {
            $sbhl_what_mts_mt_paths$.bind(sbhl_what_mts_terminating_space() == $PRIMARY ? $sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread), thread);
            $sbhl_what_mts_inverse_mt_paths$.bind(sbhl_what_mts_terminating_space() == $PRIMARY ? $sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread), thread);
            if (sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module()).eql($$genlInverse) || sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module()).eql($$negationInverse)) {
                result = gethash(node, $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread), UNPROVIDED);
            } else {
                result = gethash(node, $sbhl_what_mts_mt_paths$.getDynamicValue(thread), UNPROVIDED);
            }
        } finally {
            $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_2, thread);
            $sbhl_what_mts_mt_paths$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Accessor: @return listp; the list of path mts for @see *sbhl-what-mts-goal*. @see sbhl-what-mts-final-mt-paths
     */
    @LispMethod(comment = "Accessor: @return listp; the list of path mts for @see *sbhl-what-mts-goal*. @see sbhl-what-mts-final-mt-paths")
    public static final SubLObject sbhl_what_mts_goal_final_mt_paths_alt() {
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_final_mt_paths(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.get_sbhl_what_mts_goal());
    }

    @LispMethod(comment = "Accessor: @return listp; the list of path mts for @see *sbhl-what-mts-goal*. @see sbhl-what-mts-final-mt-paths")
    public static SubLObject sbhl_what_mts_goal_final_mt_paths() {
        return sbhl_what_mts_final_mt_paths(get_sbhl_what_mts_goal());
    }/**
     * Accessor: @return listp; the list of path mts for @see *sbhl-what-mts-goal*. @see sbhl-what-mts-final-mt-paths
     */


    /**
     *
     *
     * @return listp; the mt paths from NODE to GOAL-NODE via MODULE, optionally constrained by TV.
     */
    @LispMethod(comment = "@return listp; the mt paths from NODE to GOAL-NODE via MODULE, optionally constrained by TV.")
    public static final SubLObject sbhl_predicate_mt_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        {
                            SubLObject tv_var = tv;
                            {
                                SubLObject _prev_bind_0_47 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1_48 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt51$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_49 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                        SubLObject _prev_bind_1_50 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_51 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                            {
                                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                {
                                                    SubLObject _prev_bind_0_52 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                        {
                                                            SubLObject _prev_bind_0_53 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                            try {
                                                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                {
                                                                    SubLObject _prev_bind_0_54 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_55 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_56 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                    SubLObject _prev_bind_3_57 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                    SubLObject _prev_bind_4_58 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        {
                                                                            SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                            SubLObject needs_to_releaseP = NIL;
                                                                            try {
                                                                                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                result = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                                                            } finally {
                                                                                if (NIL != needs_to_releaseP) {
                                                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_58, thread);
                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_57, thread);
                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_56, thread);
                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_55, thread);
                                                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_54, thread);
                                                                    }
                                                                }
                                                                if (source == $RESOURCE) {
                                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                }
                                                            } finally {
                                                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_53, thread);
                                                            }
                                                        }
                                                        if (source == $RESOURCE) {
                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_52, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_51, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_50, thread);
                                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_49, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_48, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_47, thread);
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
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the mt paths from NODE to GOAL-NODE via MODULE, optionally constrained by TV.
     */
    @LispMethod(comment = "@return listp; the mt paths from NODE to GOAL-NODE via MODULE, optionally constrained by TV.")
    public static SubLObject sbhl_predicate_mt_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$49 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$50 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$55 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$56 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    result = sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$56, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$55, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$50, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$48, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$49, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$48, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$47, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$49, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$47, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$46, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$46, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$45, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; the mt paths from NODE to GOAL-NODE via the inverse of MODULE, optionally constrained by TV.
     */
    @LispMethod(comment = "@return listp; the mt paths from NODE to GOAL-NODE via the inverse of MODULE, optionally constrained by TV.")
    public static final SubLObject sbhl_inverse_mt_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        {
                            SubLObject tv_var = tv;
                            {
                                SubLObject _prev_bind_0_59 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1_60 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt51$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_61 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                        SubLObject _prev_bind_1_62 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_63 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                            {
                                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                {
                                                    SubLObject _prev_bind_0_64 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                        {
                                                            SubLObject _prev_bind_0_65 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                            try {
                                                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                {
                                                                    SubLObject _prev_bind_0_66 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_67 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_68 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                    SubLObject _prev_bind_3_69 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                    SubLObject _prev_bind_4_70 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        {
                                                                            SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                            SubLObject needs_to_releaseP = NIL;
                                                                            try {
                                                                                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                result = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                                                            } finally {
                                                                                if (NIL != needs_to_releaseP) {
                                                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_70, thread);
                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_69, thread);
                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_68, thread);
                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_67, thread);
                                                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_66, thread);
                                                                    }
                                                                }
                                                                if (source == $RESOURCE) {
                                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                }
                                                            } finally {
                                                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_65, thread);
                                                            }
                                                        }
                                                        if (source == $RESOURCE) {
                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_64, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_63, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_62, thread);
                                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_61, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_60, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_59, thread);
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
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the mt paths from NODE to GOAL-NODE via the inverse of MODULE, optionally constrained by TV.
     */
    @LispMethod(comment = "@return listp; the mt paths from NODE to GOAL-NODE via the inverse of MODULE, optionally constrained by TV.")
    public static SubLObject sbhl_inverse_mt_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$58 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$59 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$61 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$59 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$60 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$61 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$60 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$62 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$67 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    result = sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$68, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$67, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$62, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$60, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$61, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$60, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$59, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$61, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$59, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$58, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$58, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$57, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; the mt paths from NODE to GOAL-NODE via a false MODULE relation, optionally constrained by TV.
     */
    @LispMethod(comment = "@return listp; the mt paths from NODE to GOAL-NODE via a false MODULE relation, optionally constrained by TV.")
    public static final SubLObject sbhl_false_predicate_mt_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        {
                            SubLObject tv_var = tv;
                            {
                                SubLObject _prev_bind_0_71 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1_72 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_false_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_false_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt46$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt46$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt51$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_73 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                        SubLObject _prev_bind_1_74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_truth$.bind($$False_JustificationTruth, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                            {
                                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                {
                                                    SubLObject _prev_bind_0_76 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                        {
                                                            SubLObject _prev_bind_0_77 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                            try {
                                                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                {
                                                                    SubLObject _prev_bind_0_78 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_79 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_80 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                    SubLObject _prev_bind_3_81 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                    SubLObject _prev_bind_4_82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        {
                                                                            SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                            SubLObject needs_to_releaseP = NIL;
                                                                            try {
                                                                                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                result = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                                                            } finally {
                                                                                if (NIL != needs_to_releaseP) {
                                                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_82, thread);
                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_81, thread);
                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_80, thread);
                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_79, thread);
                                                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_78, thread);
                                                                    }
                                                                }
                                                                if (source == $RESOURCE) {
                                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                }
                                                            } finally {
                                                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_77, thread);
                                                            }
                                                        }
                                                        if (source == $RESOURCE) {
                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_76, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_75, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_74, thread);
                                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_73, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_72, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_71, thread);
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
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the mt paths from NODE to GOAL-NODE via a false MODULE relation, optionally constrained by TV.
     */
    @LispMethod(comment = "@return listp; the mt paths from NODE to GOAL-NODE via a false MODULE relation, optionally constrained by TV.")
    public static SubLObject sbhl_false_predicate_mt_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$69 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$70 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_false_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_false_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                            } else {
                                Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$70 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$71 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$73 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_truth$.bind($$False_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$72 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$72 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$74 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$79 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$80 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    result = sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$80, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$79, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$74, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$72, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$73, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$72, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$71, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$73, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$71, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$70, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$70, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$69, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; the mt paths from NODE to GOAL-NODE via a false relation of MODULE's inverse, optionally constrained by TV.
     */
    @LispMethod(comment = "@return listp; the mt paths from NODE to GOAL-NODE via a false relation of MODULE\'s inverse, optionally constrained by TV.")
    public static final SubLObject sbhl_false_inverse_mt_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        {
                            SubLObject tv_var = tv;
                            {
                                SubLObject _prev_bind_0_83 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1_84 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_false_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_false_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt46$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt46$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt51$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_85 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                        SubLObject _prev_bind_1_86 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_87 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_truth$.bind($$False_JustificationTruth, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                            {
                                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                {
                                                    SubLObject _prev_bind_0_88 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                        {
                                                            SubLObject _prev_bind_0_89 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                            try {
                                                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                {
                                                                    SubLObject _prev_bind_0_90 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_91 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_92 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                    SubLObject _prev_bind_3_93 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                    SubLObject _prev_bind_4_94 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        {
                                                                            SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                            SubLObject needs_to_releaseP = NIL;
                                                                            try {
                                                                                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                result = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                                                            } finally {
                                                                                if (NIL != needs_to_releaseP) {
                                                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_94, thread);
                                                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_93, thread);
                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_92, thread);
                                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_91, thread);
                                                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_90, thread);
                                                                    }
                                                                }
                                                                if (source == $RESOURCE) {
                                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                }
                                                            } finally {
                                                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_89, thread);
                                                            }
                                                        }
                                                        if (source == $RESOURCE) {
                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_88, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_87, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_86, thread);
                                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_85, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_84, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_83, thread);
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
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the mt paths from NODE to GOAL-NODE via a false relation of MODULE's inverse, optionally constrained by TV.
     */
    @LispMethod(comment = "@return listp; the mt paths from NODE to GOAL-NODE via a false relation of MODULE\'s inverse, optionally constrained by TV.")
    public static SubLObject sbhl_false_inverse_mt_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_false_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_false_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                            } else {
                                Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_FALSE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$82 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$83 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$85 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_truth$.bind($$False_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$83 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$84 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$85 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$84 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$86 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$91 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$92 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    result = sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$92, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$91, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$86, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$84, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$85, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$84, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$83, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$85, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$83, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$82, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$82, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$81, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; the mt paths from NODE1 to NODE2.
     */
    @LispMethod(comment = "@return listp; the mt paths from NODE1 to NODE2.")
    public static final SubLObject sbhl_what_mt_paths_from_node_to_node_alt(SubLObject node1, SubLObject node2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (node1.equal(node2)) {
                    result = list(list(mt_vars.$mt_root$.getGlobalValue()));
                } else {
                    {
                        SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $sbhl_primary_what_mts_mt_paths$.currentBinding(thread);
                        SubLObject _prev_bind_4 = $sbhl_primary_what_mts_inverse_mt_paths$.currentBinding(thread);
                        SubLObject _prev_bind_5 = $sbhl_secondary_what_mts_mt_paths$.currentBinding(thread);
                        SubLObject _prev_bind_6 = $sbhl_secondary_what_mts_inverse_mt_paths$.currentBinding(thread);
                        SubLObject _prev_bind_7 = $sbhl_what_mts_goal$.currentBinding(thread);
                        SubLObject _prev_bind_8 = $sbhl_what_mts_behavior$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_type$.bind($WHAT_MTS, thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            $sbhl_primary_what_mts_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                            $sbhl_primary_what_mts_inverse_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                            $sbhl_secondary_what_mts_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                            $sbhl_secondary_what_mts_inverse_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                            $sbhl_what_mts_goal$.bind(node2, thread);
                            $sbhl_what_mts_behavior$.bind(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.determine_sbhl_what_mts_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                            com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_apply_what_mts_behavior(node1);
                            result = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_what_mts_goal_final_mt_paths();
                        } finally {
                            $sbhl_what_mts_behavior$.rebind(_prev_bind_8, thread);
                            $sbhl_what_mts_goal$.rebind(_prev_bind_7, thread);
                            $sbhl_secondary_what_mts_inverse_mt_paths$.rebind(_prev_bind_6, thread);
                            $sbhl_secondary_what_mts_mt_paths$.rebind(_prev_bind_5, thread);
                            $sbhl_primary_what_mts_inverse_mt_paths$.rebind(_prev_bind_4, thread);
                            $sbhl_primary_what_mts_mt_paths$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the mt paths from NODE1 to NODE2.
     */
    @LispMethod(comment = "@return listp; the mt paths from NODE1 to NODE2.")
    public static SubLObject sbhl_what_mt_paths_from_node_to_node(final SubLObject node1, final SubLObject node2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (node1.equal(node2)) {
            result = list(list(mt_vars.$mt_root$.getGlobalValue()));
        } else {
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $sbhl_primary_what_mts_mt_paths$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $sbhl_primary_what_mts_inverse_mt_paths$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $sbhl_secondary_what_mts_mt_paths$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $sbhl_secondary_what_mts_inverse_mt_paths$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $sbhl_what_mts_goal$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $sbhl_what_mts_behavior$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_search_type$.bind($WHAT_MTS, thread);
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                $sbhl_primary_what_mts_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                $sbhl_primary_what_mts_inverse_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                $sbhl_secondary_what_mts_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                $sbhl_secondary_what_mts_inverse_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
                $sbhl_what_mts_goal$.bind(node2, thread);
                $sbhl_what_mts_behavior$.bind(determine_sbhl_what_mts_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                sbhl_apply_what_mts_behavior(node1);
                result = sbhl_what_mts_goal_final_mt_paths();
            } finally {
                $sbhl_what_mts_behavior$.rebind(_prev_bind_9, thread);
                $sbhl_what_mts_goal$.rebind(_prev_bind_8, thread);
                $sbhl_secondary_what_mts_inverse_mt_paths$.rebind(_prev_bind_7, thread);
                $sbhl_secondary_what_mts_mt_paths$.rebind(_prev_bind_6, thread);
                $sbhl_primary_what_mts_inverse_mt_paths$.rebind(_prev_bind_5, thread);
                $sbhl_primary_what_mts_mt_paths$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     *
     *
     * @return listp; the minimal mts of each of the path mts in MT-PATHS.
     */
    @LispMethod(comment = "@return listp; the minimal mts of each of the path mts in MT-PATHS.")
    public static final SubLObject sbhl_min_mt_paths_alt(SubLObject mt_paths) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = mt_paths;
            SubLObject mt_path = NIL;
            for (mt_path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_path = cdolist_list_var.first()) {
                mt_path = mt_vars.minimize_mts_wrt_core(mt_path);
                {
                    SubLObject min_mts_of_path = sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt_path, UNPROVIDED, UNPROVIDED);
                    SubLObject failP = NIL;
                    if (NIL == failP) {
                        {
                            SubLObject csome_list_var = result;
                            SubLObject result_mt_path = NIL;
                            for (result_mt_path = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , result_mt_path = csome_list_var.first()) {
                                if (NIL != subsetp(result_mt_path, min_mts_of_path, UNPROVIDED, UNPROVIDED)) {
                                    failP = T;
                                }
                                if ((NIL == failP) && (NIL != subsetp(min_mts_of_path, result_mt_path, UNPROVIDED, UNPROVIDED))) {
                                    result = remove(result_mt_path, result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                    if (NIL == failP) {
                        result = cons(min_mts_of_path, result);
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return listp; the minimal mts of each of the path mts in MT-PATHS.
     */
    @LispMethod(comment = "@return listp; the minimal mts of each of the path mts in MT-PATHS.")
    public static SubLObject sbhl_min_mt_paths(final SubLObject mt_paths) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = mt_paths;
        SubLObject mt_path = NIL;
        mt_path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mt_path = mt_vars.minimize_mts_wrt_core(mt_path);
            final SubLObject min_mts_of_path = sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), mt_path, UNPROVIDED, UNPROVIDED);
            SubLObject failP = NIL;
            if (NIL == failP) {
                SubLObject csome_list_var = result;
                SubLObject result_mt_path = NIL;
                result_mt_path = csome_list_var.first();
                while ((NIL == failP) && (NIL != csome_list_var)) {
                    if (NIL != subsetp(result_mt_path, min_mts_of_path, UNPROVIDED, UNPROVIDED)) {
                        failP = T;
                    }
                    if ((NIL == failP) && (NIL != subsetp(min_mts_of_path, result_mt_path, UNPROVIDED, UNPROVIDED))) {
                        result = remove(result_mt_path, result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    csome_list_var = csome_list_var.rest();
                    result_mt_path = csome_list_var.first();
                } 
            }
            if (NIL == failP) {
                result = cons(min_mts_of_path, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_path = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @return listp; the list of independent mts for which there is a true MODULE relation between NODE and GOAL-NODE.
     */
    @LispMethod(comment = "@return listp; the list of independent mts for which there is a true MODULE relation between NODE and GOAL-NODE.")
    public static final SubLObject sbhl_min_mts_of_predicate_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_min_mt_paths(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_predicate_mt_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the list of independent mts for which there is a true MODULE relation between NODE and GOAL-NODE.
     */
    @LispMethod(comment = "@return listp; the list of independent mts for which there is a true MODULE relation between NODE and GOAL-NODE.")
    public static SubLObject sbhl_min_mts_of_predicate_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_min_mt_paths(sbhl_predicate_mt_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the list of independent mts for which there is a true relation via MODULE's inverse between NODE and GOAL-NODE.
     */
    @LispMethod(comment = "@return listp; the list of independent mts for which there is a true relation via MODULE\'s inverse between NODE and GOAL-NODE.")
    public static final SubLObject sbhl_min_mts_of_inverse_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_min_mt_paths(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_inverse_mt_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the list of independent mts for which there is a true relation via MODULE's inverse between NODE and GOAL-NODE.
     */
    @LispMethod(comment = "@return listp; the list of independent mts for which there is a true relation via MODULE\'s inverse between NODE and GOAL-NODE.")
    public static SubLObject sbhl_min_mts_of_inverse_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_min_mt_paths(sbhl_inverse_mt_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the list of independent mts for which there is a false MODULE relation between NODE and GOAL-NODE.
     */
    @LispMethod(comment = "@return listp; the list of independent mts for which there is a false MODULE relation between NODE and GOAL-NODE.")
    public static final SubLObject sbhl_min_mts_of_false_predicate_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_min_mt_paths(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_false_predicate_mt_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the list of independent mts for which there is a false MODULE relation between NODE and GOAL-NODE.
     */
    @LispMethod(comment = "@return listp; the list of independent mts for which there is a false MODULE relation between NODE and GOAL-NODE.")
    public static SubLObject sbhl_min_mts_of_false_predicate_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_min_mt_paths(sbhl_false_predicate_mt_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the list of independent mts for which there is a false relation via MODULE's inverse between NODE and GOAL-NODE.
     */
    @LispMethod(comment = "@return listp; the list of independent mts for which there is a false relation via MODULE\'s inverse between NODE and GOAL-NODE.")
    public static final SubLObject sbhl_min_mts_of_false_inverse_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_min_mt_paths(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_false_inverse_mt_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the list of independent mts for which there is a false relation via MODULE's inverse between NODE and GOAL-NODE.
     */
    @LispMethod(comment = "@return listp; the list of independent mts for which there is a false relation via MODULE\'s inverse between NODE and GOAL-NODE.")
    public static SubLObject sbhl_min_mts_of_false_inverse_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_min_mt_paths(sbhl_false_inverse_mt_paths(module, node, goal_node, tv));
    }

    /**
     * helper for @see sbhl-max-floor-mts-of-paths
     */
    @LispMethod(comment = "helper for @see sbhl-max-floor-mts-of-paths")
    public static final SubLObject sbhl_max_floor_mts_alt(SubLObject mts) {
        return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($$genlMt), mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "helper for @see sbhl-max-floor-mts-of-paths")
    public static SubLObject sbhl_max_floor_mts(final SubLObject mts) {
        return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($$genlMt), mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * helper for @see sbhl-max-floor-mts-of-paths
     */


    /**
     *
     *
     * @return listp; the most general mt(s) by which all of PATH's mts are visible.
     */
    @LispMethod(comment = "@return listp; the most general mt(s) by which all of PATH\'s mts are visible.")
    public static final SubLObject sbhl_max_floor_mts_of_paths_alt(SubLObject paths) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $sbhl_verify_naut_mt_relevance$.currentBinding(thread);
                    try {
                        $sbhl_verify_naut_mt_relevance$.bind(NIL, thread);
                        result = sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), creduce(UNION, delete(NIL, Mapping.mapcar(SBHL_MAX_FLOOR_MTS, paths), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, NIL, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_verify_naut_mt_relevance_p()) {
                            sbhl_paranoia.sbhl_warn(ONE_INTEGER, $str_alt63$Mts_might_not_be_valid_because_in, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        $sbhl_verify_naut_mt_relevance$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the most general mt(s) by which all of PATH's mts are visible.
     */
    @LispMethod(comment = "@return listp; the most general mt(s) by which all of PATH\'s mts are visible.")
    public static SubLObject sbhl_max_floor_mts_of_paths(final SubLObject paths) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $sbhl_verify_naut_mt_relevance$.currentBinding(thread);
        try {
            $sbhl_verify_naut_mt_relevance$.bind(NIL, thread);
            result = sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($$genlMt), creduce(UNION, delete(NIL, Mapping.mapcar(SBHL_MAX_FLOOR_MTS, paths), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, NIL, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != sbhl_verify_naut_mt_relevance_p()) {
                sbhl_paranoia.sbhl_warn(ONE_INTEGER, $str64$Mts_might_not_be_valid_because_in, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            $sbhl_verify_naut_mt_relevance$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; the most general mt(s) by which all true MODULE relations between NODE and GOAL-NODE are visible.
     */
    @LispMethod(comment = "@return listp; the most general mt(s) by which all true MODULE relations between NODE and GOAL-NODE are visible.")
    public static final SubLObject sbhl_max_floor_mts_of_predicate_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_max_floor_mts_of_paths(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the most general mt(s) by which all true MODULE relations between NODE and GOAL-NODE are visible.
     */
    @LispMethod(comment = "@return listp; the most general mt(s) by which all true MODULE relations between NODE and GOAL-NODE are visible.")
    public static SubLObject sbhl_max_floor_mts_of_predicate_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_max_floor_mts_of_paths(sbhl_min_mts_of_predicate_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the most general mt(s) by which all true relations between NODE and GOAL-NODE via MODULE's inverse are visible.
     */
    @LispMethod(comment = "@return listp; the most general mt(s) by which all true relations between NODE and GOAL-NODE via MODULE\'s inverse are visible.")
    public static final SubLObject sbhl_max_floor_mts_of_inverse_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_max_floor_mts_of_paths(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_min_mts_of_inverse_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the most general mt(s) by which all true relations between NODE and GOAL-NODE via MODULE's inverse are visible.
     */
    @LispMethod(comment = "@return listp; the most general mt(s) by which all true relations between NODE and GOAL-NODE via MODULE\'s inverse are visible.")
    public static SubLObject sbhl_max_floor_mts_of_inverse_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_max_floor_mts_of_paths(sbhl_min_mts_of_inverse_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the most general mt(s) by which all false MODULE relations between NODE and GOAL-NODE are visible.
     */
    @LispMethod(comment = "@return listp; the most general mt(s) by which all false MODULE relations between NODE and GOAL-NODE are visible.")
    public static final SubLObject sbhl_max_floor_mts_of_false_predicate_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_max_floor_mts_of_paths(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_min_mts_of_false_predicate_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the most general mt(s) by which all false MODULE relations between NODE and GOAL-NODE are visible.
     */
    @LispMethod(comment = "@return listp; the most general mt(s) by which all false MODULE relations between NODE and GOAL-NODE are visible.")
    public static SubLObject sbhl_max_floor_mts_of_false_predicate_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_max_floor_mts_of_paths(sbhl_min_mts_of_false_predicate_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the most general mt(s) by which all false relations between NODE and GOAL-NODE via MODULE's inverse are visible.
     */
    @LispMethod(comment = "@return listp; the most general mt(s) by which all false relations between NODE and GOAL-NODE via MODULE\'s inverse are visible.")
    public static final SubLObject sbhl_max_floor_mts_of_false_inverse_paths_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_max_floor_mts_of_paths(com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return listp; the most general mt(s) by which all false relations between NODE and GOAL-NODE via MODULE's inverse are visible.
     */
    @LispMethod(comment = "@return listp; the most general mt(s) by which all false relations between NODE and GOAL-NODE via MODULE\'s inverse are visible.")
    public static SubLObject sbhl_max_floor_mts_of_false_inverse_paths(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_max_floor_mts_of_paths(sbhl_min_mts_of_false_inverse_paths(module, node, goal_node, tv));
    }

    /**
     *
     *
     * @return sbhl-space-p;  a marking table consisting of all of the floor mts of predicate paths from NODE to GOAL-NODE via MODULE (with TV). If MT-TABLE is provided, the returned sbhl-space will be a destructively modified version of MT-TABLE.
     */
    @LispMethod(comment = "@return sbhl-space-p;  a marking table consisting of all of the floor mts of predicate paths from NODE to GOAL-NODE via MODULE (with TV). If MT-TABLE is provided, the returned sbhl-space will be a destructively modified version of MT-TABLE.")
    public static final SubLObject sbhl_mt_table_of_floors_for_predicate_path_alt(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject mt_table, SubLObject tv) {
        if (mt_table == UNPROVIDED) {
            mt_table = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject min_mts = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(module, node, goal_node, tv);
                SubLObject new_mt_table = (NIL != mt_table) ? ((SubLObject) (mt_table)) : sbhl_marking_vars.instantiate_sbhl_marking_space();
                if (NIL == min_mts) {
                    return $NONE;
                }
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        new_mt_table = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_floors_in_space(sbhl_module_vars.get_sbhl_module($$genlMt), min_mts, new_mt_table, NIL, tv);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_mt_table;
            }
        }
    }

    /**
     *
     *
     * @return sbhl-space-p;  a marking table consisting of all of the floor mts of predicate paths from NODE to GOAL-NODE via MODULE (with TV). If MT-TABLE is provided, the returned sbhl-space will be a destructively modified version of MT-TABLE.
     */
    @LispMethod(comment = "@return sbhl-space-p;  a marking table consisting of all of the floor mts of predicate paths from NODE to GOAL-NODE via MODULE (with TV). If MT-TABLE is provided, the returned sbhl-space will be a destructively modified version of MT-TABLE.")
    public static SubLObject sbhl_mt_table_of_floors_for_predicate_path(final SubLObject module, final SubLObject node, final SubLObject goal_node, SubLObject mt_table, SubLObject tv) {
        if (mt_table == UNPROVIDED) {
            mt_table = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject min_mts = sbhl_min_mts_of_predicate_paths(module, node, goal_node, tv);
        SubLObject new_mt_table = (NIL != mt_table) ? mt_table : sbhl_marking_vars.instantiate_sbhl_marking_space();
        if (NIL == min_mts) {
            return $NONE;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            new_mt_table = sbhl_floors_in_space(sbhl_module_vars.get_sbhl_module($$genlMt), min_mts, new_mt_table, NIL, tv);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return new_mt_table;
    }

    /**
     *
     *
     * @return sbhl-space-p; Returns all of the floors of NODES via MODULE in the sbhl-space SPACE.
     */
    @LispMethod(comment = "@return sbhl-space-p; Returns all of the floors of NODES via MODULE in the sbhl-space SPACE.")
    public static final SubLObject sbhl_floors_in_space_alt(SubLObject module, SubLObject nodes, SubLObject space, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                    {
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0_95 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1_96 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2_97 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject tv_var = tv;
                                    {
                                        SubLObject _prev_bind_0_98 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                        SubLObject _prev_bind_1_99 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                            if (NIL != tv_var) {
                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                        {
                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                            if (pcase_var.eql($ERROR)) {
                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                if (pcase_var.eql($CERROR)) {
                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($WARN)) {
                                                                        Errors.warn($str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                    } else {
                                                                        Errors.warn($str_alt51$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                        Errors.cerror($$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject _prev_bind_0_100 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                SubLObject _prev_bind_1_101 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                SubLObject _prev_bind_2_102 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                    {
                                                        SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                        {
                                                            SubLObject _prev_bind_0_103 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                            try {
                                                                sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                {
                                                                    SubLObject _prev_bind_0_104 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                        {
                                                                            SubLObject _prev_bind_0_105 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_106 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_107 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                            SubLObject _prev_bind_3_108 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                            SubLObject _prev_bind_4_109 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                {
                                                                                    SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                    SubLObject needs_to_releaseP = NIL;
                                                                                    try {
                                                                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                        com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_closure_intersection_in_space(nodes, space);
                                                                                    } finally {
                                                                                        if (NIL != needs_to_releaseP) {
                                                                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_109, thread);
                                                                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_108, thread);
                                                                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_107, thread);
                                                                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_106, thread);
                                                                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_105, thread);
                                                                            }
                                                                        }
                                                                        if (source == $RESOURCE) {
                                                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                        }
                                                                    } finally {
                                                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_104, thread);
                                                                    }
                                                                }
                                                                if (source == $RESOURCE) {
                                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                }
                                                            } finally {
                                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_103, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_102, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_101, thread);
                                                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_100, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_99, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_98, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_97, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_96, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_95, thread);
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
            return space;
        }
    }

    /**
     *
     *
     * @return sbhl-space-p; Returns all of the floors of NODES via MODULE in the sbhl-space SPACE.
     */
    @LispMethod(comment = "@return sbhl-space-p; Returns all of the floors of NODES via MODULE in the sbhl-space SPACE.")
    public static SubLObject sbhl_floors_in_space(final SubLObject module, final SubLObject nodes, final SubLObject space, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$93 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$94 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$95 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$95 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$95 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$96 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$96 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$96 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$97 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$98 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$97 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$97 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$106 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$107 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        sbhl_closure_intersection_in_space(nodes, space);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$107, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$106, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$97, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$97, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$98, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$97, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$96, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$96, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$96, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$95, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$95, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$94, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$95, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$94, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$93, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return space;
    }

    /**
     *
     *
     * @return sbhl-space-p; a destructively modified version of SPACE which contains the intersection of NODES's closures.
     */
    @LispMethod(comment = "@return sbhl-space-p; a destructively modified version of SPACE which contains the intersection of NODES\'s closures.")
    public static final SubLObject sbhl_closure_intersection_in_space_alt(SubLObject nodes, SubLObject n_space) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts.sbhl_sort_by_least_inverse_cardinality(list_utilities.fast_delete_duplicates(nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                SubLObject redux_module = (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(sbhl_module_vars.get_sbhl_module(UNPROVIDED))) ? ((SubLObject) (sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) : sbhl_module_vars.get_sbhl_module(UNPROVIDED);
                SubLObject redux_behavior = sbhl_search_utilities.determine_sbhl_search_behavior(redux_module, sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv());
                if (NIL == nodes) {
                } else {
                    if (NIL != list_utilities.singletonP(nodes)) {
                        {
                            SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(redux_module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(redux_module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(redux_module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(redux_module, thread);
                                sbhl_search_vars.$sbhl_search_behavior$.bind(redux_behavior, thread);
                                sbhl_marking_methods.sbhl_mark_closure_in_space(nodes.first(), n_space);
                            } finally {
                                sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_5, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        {
                            SubLObject empty_intersectionP = NIL;
                            SubLObject minimal_intersection = NIL;
                            if (NIL != sbhl_marking_utilities.empty_sbhl_space_p(n_space)) {
                                {
                                    SubLObject initial_node = nodes.first();
                                    new_nodes = nodes.rest();
                                    sbhl_marking_methods.sbhl_mark_closure_in_space(initial_node, n_space);
                                }
                            }
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_target_space$.bind(n_space, thread);
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    if (NIL == empty_intersectionP) {
                                        {
                                            SubLObject csome_list_var = new_nodes;
                                            SubLObject node = NIL;
                                            for (node = csome_list_var.first(); !((NIL != empty_intersectionP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node = csome_list_var.first()) {
                                                minimal_intersection = sbhl_search_methods.sbhl_mark_closure_up_to_horizon(node);
                                                {
                                                    SubLObject _prev_bind_0_110 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                        if (NIL != minimal_intersection) {
                                                            {
                                                                SubLObject _prev_bind_0_111 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_112 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(redux_module, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(redux_module), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(redux_module), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(redux_module, thread);
                                                                    sbhl_search_vars.$sbhl_search_behavior$.bind(redux_behavior, thread);
                                                                    sbhl_marking_vars.clear_sbhl_target_space();
                                                                    {
                                                                        SubLObject _prev_bind_0_113 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                                            {
                                                                                SubLObject cdolist_list_var = minimal_intersection;
                                                                                SubLObject common_node = NIL;
                                                                                for (common_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , common_node = cdolist_list_var.first()) {
                                                                                    sbhl_marking_methods.sbhl_mark_closure_as_marked(common_node);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_113, thread);
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject _prev_bind_0_114 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                                                            {
                                                                                SubLObject cdolist_list_var = minimal_intersection;
                                                                                SubLObject common_node = NIL;
                                                                                for (common_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , common_node = cdolist_list_var.first()) {
                                                                                    sbhl_marking_methods.sbhl_unmark_marked_closure(common_node);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_114, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_5, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_112, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_111, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_marking_vars.clear_sbhl_target_space();
                                                            empty_intersectionP = T;
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_0_110, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_1, thread);
                                    sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return n_space;
        }
    }

    /**
     *
     *
     * @return sbhl-space-p; a destructively modified version of SPACE which contains the intersection of NODES's closures.
     */
    @LispMethod(comment = "@return sbhl-space-p; a destructively modified version of SPACE which contains the intersection of NODES\'s closures.")
    public static SubLObject sbhl_closure_intersection_in_space(final SubLObject nodes, final SubLObject n_space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_nodes = sbhl_sort_by_least_inverse_cardinality(list_utilities.fast_delete_duplicates(nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject redux_module = (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(sbhl_module_vars.get_sbhl_module(UNPROVIDED))) ? sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)) : sbhl_module_vars.get_sbhl_module(UNPROVIDED);
        final SubLObject redux_behavior = sbhl_search_utilities.determine_sbhl_search_behavior(redux_module, sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv());
        if (NIL != nodes) {
            if (NIL != list_utilities.singletonP(nodes)) {
                final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_module$.bind(redux_module, thread);
                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(redux_module), thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(redux_module), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                    sbhl_module_vars.$sbhl_module$.bind(redux_module, thread);
                    sbhl_search_vars.$sbhl_search_behavior$.bind(redux_behavior, thread);
                    sbhl_marking_methods.sbhl_mark_closure_in_space(nodes.first(), n_space);
                } finally {
                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_6, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                }
            } else {
                SubLObject empty_intersectionP = NIL;
                SubLObject minimal_intersection = NIL;
                if (NIL != sbhl_marking_utilities.empty_sbhl_space_p(n_space)) {
                    final SubLObject initial_node = nodes.first();
                    new_nodes = nodes.rest();
                    sbhl_marking_methods.sbhl_mark_closure_in_space(initial_node, n_space);
                }
                final SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                final SubLObject _prev_bind_8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_target_space$.bind(n_space, thread);
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        if (NIL == empty_intersectionP) {
                            SubLObject csome_list_var = new_nodes;
                            SubLObject node = NIL;
                            node = csome_list_var.first();
                            while ((NIL == empty_intersectionP) && (NIL != csome_list_var)) {
                                minimal_intersection = sbhl_search_methods.sbhl_mark_closure_up_to_horizon(node);
                                final SubLObject _prev_bind_0_$108 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    if (NIL != minimal_intersection) {
                                        final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$110 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_11 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_12 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(redux_module, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(redux_module), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(redux_module), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(redux_module, thread);
                                            sbhl_search_vars.$sbhl_search_behavior$.bind(redux_behavior, thread);
                                            sbhl_marking_vars.clear_sbhl_target_space();
                                            final SubLObject _prev_bind_0_$110 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                SubLObject cdolist_list_var = minimal_intersection;
                                                SubLObject common_node = NIL;
                                                common_node = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    sbhl_marking_methods.sbhl_mark_closure_as_marked(common_node);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    common_node = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$110, thread);
                                            }
                                            final SubLObject _prev_bind_0_$111 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                                SubLObject cdolist_list_var = minimal_intersection;
                                                SubLObject common_node = NIL;
                                                common_node = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    sbhl_marking_methods.sbhl_unmark_marked_closure(common_node);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    common_node = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$111, thread);
                                            }
                                        } finally {
                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_12, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_11, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_10, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_9, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$110, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$109, thread);
                                        }
                                    } else {
                                        sbhl_marking_vars.clear_sbhl_target_space();
                                        empty_intersectionP = T;
                                    }
                                } finally {
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_0_$108, thread);
                                }
                                csome_list_var = csome_list_var.rest();
                                node = csome_list_var.first();
                            } 
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_8, thread);
                    sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_7, thread);
                }
            }
        }
        return n_space;
    }

    public static final SubLObject sbhl_sort_by_least_inverse_cardinality_alt(SubLObject nodes, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL != module) {
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(module, thread);
                            result = Sort.sort(nodes, $sym65$SBHL_INVERSE_CARDINALITY_, UNPROVIDED);
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    result = Sort.sort(nodes, $sym65$SBHL_INVERSE_CARDINALITY_, UNPROVIDED);
                }
                return result;
            }
        }
    }

    public static SubLObject sbhl_sort_by_least_inverse_cardinality(final SubLObject nodes, SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != module) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                result = Sort.sort(nodes, $sym66$SBHL_INVERSE_CARDINALITY_, UNPROVIDED);
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = Sort.sort(nodes, $sym66$SBHL_INVERSE_CARDINALITY_, UNPROVIDED);
        }
        return result;
    }

    public static final SubLObject sbhl_inverse_cardinalityL_alt(SubLObject node1, SubLObject node2) {
        return numL(sbhl_module_utilities.sbhl_inverse_cardinality(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node1), sbhl_module_utilities.sbhl_inverse_cardinality(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node2));
    }

    public static SubLObject sbhl_inverse_cardinalityL(final SubLObject node1, final SubLObject node2) {
        return numL(sbhl_module_utilities.sbhl_inverse_cardinality(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node1), sbhl_module_utilities.sbhl_inverse_cardinality(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node2));
    }

    public static SubLObject declare_sbhl_search_what_mts_file() {
        declareMacro("sbhl_rebind_path_mts", "SBHL-REBIND-PATH-MTS");
        declareFunction("possibly_update_sbhl_path_mts", "POSSIBLY-UPDATE-SBHL-PATH-MTS", 2, 0, false);
        declareMacro("with_new_sbhl_what_mts_marking_spaces", "WITH-NEW-SBHL-WHAT-MTS-MARKING-SPACES");
        declareFunction("sbhl_primary_what_mts_spaces", "SBHL-PRIMARY-WHAT-MTS-SPACES", 0, 0, false);
        declareFunction("sbhl_secondary_what_mts_spaces", "SBHL-SECONDARY-WHAT-MTS-SPACES", 0, 0, false);
        declareMacro("within_sbhl_what_mts_spaces", "WITHIN-SBHL-WHAT-MTS-SPACES");
        declareFunction("get_sbhl_what_mts_marking_space", "GET-SBHL-WHAT-MTS-MARKING-SPACE", 0, 0, false);
        declareFunction("get_sbhl_what_mts_marking", "GET-SBHL-WHAT-MTS-MARKING", 1, 0, false);
        declareFunction("sbhl_what_mts_mark_mt_paths_to_node", "SBHL-WHAT-MTS-MARK-MT-PATHS-TO-NODE", 1, 0, false);
        declareFunction("sbhl_what_mts_marking_subsumes_marking_p", "SBHL-WHAT-MTS-MARKING-SUBSUMES-MARKING-P", 1, 0, false);
        declareFunction("determine_sbhl_link_mt", "DETERMINE-SBHL-LINK-MT", 2, 0, false);
        declareFunction("sbhl_encountered_difficult_naut_mt_generator", "SBHL-ENCOUNTERED-DIFFICULT-NAUT-MT-GENERATOR", 0, 0, false);
        declareMacro("with_new_naut_mt_relevance_verification", "WITH-NEW-NAUT-MT-RELEVANCE-VERIFICATION");
        declareFunction("sbhl_verify_naut_mt_relevance_p", "SBHL-VERIFY-NAUT-MT-RELEVANCE-P", 0, 0, false);
        declareMacro("with_sbhl_what_mts_map_function", "WITH-SBHL-WHAT-MTS-MAP-FUNCTION");
        declareFunction("get_sbhl_what_mts_map_function", "GET-SBHL-WHAT-MTS-MAP-FUNCTION", 0, 0, false);
        declareFunction("sbhl_what_mts_not_mapping_p", "SBHL-WHAT-MTS-NOT-MAPPING-P", 0, 0, false);
        declareFunction("sbhl_apply_what_mts_map_function", "SBHL-APPLY-WHAT-MTS-MAP-FUNCTION", 1, 0, false);
        declareFunction("get_sbhl_what_mts_goal", "GET-SBHL-WHAT-MTS-GOAL", 0, 0, false);
        declareMacro("with_sbhl_what_mts_goal", "WITH-SBHL-WHAT-MTS-GOAL");
        declareFunction("sbhl_what_mts_goal_p", "SBHL-WHAT-MTS-GOAL-P", 1, 0, false);
        declareFunction("sbhl_what_mts_proper_mark_p", "SBHL-WHAT-MTS-PROPER-MARK-P", 1, 0, false);
        declareFunction("sbhl_what_mts_proper_goal_mark_p", "SBHL-WHAT-MTS-PROPER-GOAL-MARK-P", 1, 0, false);
        declareFunction("sbhl_what_mts_mark_and_sweep", "SBHL-WHAT-MTS-MARK-AND-SWEEP", 1, 0, false);
        declareFunction("sbhl_what_mts_mark_and_sweep_marked_nodes", "SBHL-WHAT-MTS-MARK-AND-SWEEP-MARKED-NODES", 1, 0, false);
        declareFunction("sbhl_what_mts_step_across_links", "SBHL-WHAT-MTS-STEP-ACROSS-LINKS", 1, 0, false);
        declareFunction("sbhl_what_mts_step_across_marked_links", "SBHL-WHAT-MTS-STEP-ACROSS-MARKED-LINKS", 1, 0, false);
        declareFunction("sbhl_what_mts_step_and_update_links", "SBHL-WHAT-MTS-STEP-AND-UPDATE-LINKS", 1, 0, false);
        declareFunction("sbhl_what_mts_sweep", "SBHL-WHAT-MTS-SWEEP", 6, 0, false);
        declareFunction("sbhl_what_mts_sweep_marked", "SBHL-WHAT-MTS-SWEEP-MARKED", 7, 0, false);
        declareFunction("sbhl_what_mts_step", "SBHL-WHAT-MTS-STEP", 5, 0, false);
        declareFunction("sbhl_what_mts_step_marked", "SBHL-WHAT-MTS-STEP-MARKED", 6, 0, false);
        declareFunction("sbhl_what_mts_step_and_update_mts", "SBHL-WHAT-MTS-STEP-AND-UPDATE-MTS", 6, 0, false);
        declareFunction("sbhl_simple_true_what_mts_search", "SBHL-SIMPLE-TRUE-WHAT-MTS-SEARCH", 1, 0, false);
        declareFunction("sbhl_simple_false_what_mts_search", "SBHL-SIMPLE-FALSE-WHAT-MTS-SEARCH", 1, 0, false);
        declareFunction("sbhl_false_what_mts_step", "SBHL-FALSE-WHAT-MTS-STEP", 1, 0, false);
        declareFunction("sbhl_false_what_mts_sweep", "SBHL-FALSE-WHAT-MTS-SWEEP", 1, 0, false);
        declareFunction("sbhl_tt_what_mts_search", "SBHL-TT-WHAT-MTS-SEARCH", 1, 0, false);
        declareFunction("sbhl_what_mts_tt_sweep", "SBHL-WHAT-MTS-TT-SWEEP", 1, 0, false);
        declareFunction("sbhl_what_mts_tt_backward_search", "SBHL-WHAT-MTS-TT-BACKWARD-SEARCH", 1, 0, false);
        declareFunction("sbhl_what_mts_tt_step", "SBHL-WHAT-MTS-TT-STEP", 1, 0, false);
        declareFunction("sbhl_what_mts_premark_disjoins", "SBHL-WHAT-MTS-PREMARK-DISJOINS", 1, 0, false);
        declareFunction("sbhl_what_mts_true_disjoins_search", "SBHL-WHAT-MTS-TRUE-DISJOINS-SEARCH", 1, 0, false);
        declareFunction("sbhl_what_mts_step_across_marked_disjoins", "SBHL-WHAT-MTS-STEP-ACROSS-MARKED-DISJOINS", 1, 0, false);
        declareFunction("sbhl_what_mts_sweep_marked_disjoins", "SBHL-WHAT-MTS-SWEEP-MARKED-DISJOINS", 1, 0, false);
        declareFunction("get_sbhl_what_mts_sweep_disjoins_module", "GET-SBHL-WHAT-MTS-SWEEP-DISJOINS-MODULE", 0, 0, false);
        declareFunction("sbhl_what_mts_false_disjoins_search", "SBHL-WHAT-MTS-FALSE-DISJOINS-SEARCH", 1, 0, false);
        declareFunction("sbhl_what_mts_sweep_forward_step_and_sweep_false_disjoins", "SBHL-WHAT-MTS-SWEEP-FORWARD-STEP-AND-SWEEP-FALSE-DISJOINS", 1, 0, false);
        declareFunction("sbhl_what_mts_sweep_false_disjoins", "SBHL-WHAT-MTS-SWEEP-FALSE-DISJOINS", 1, 0, false);
        declareFunction("determine_sbhl_what_mts_behavior", "DETERMINE-SBHL-WHAT-MTS-BEHAVIOR", 3, 0, false);
        declareFunction("get_sbhl_what_mts_behavior", "GET-SBHL-WHAT-MTS-BEHAVIOR", 0, 0, false);
        declareMacro("bind_sbhl_what_mts_behavior", "BIND-SBHL-WHAT-MTS-BEHAVIOR");
        declareFunction("sbhl_apply_what_mts_behavior", "SBHL-APPLY-WHAT-MTS-BEHAVIOR", 1, 0, false);
        declareFunction("sbhl_what_mts_terminating_space", "SBHL-WHAT-MTS-TERMINATING-SPACE", 0, 0, false);
        declareFunction("sbhl_what_mts_final_mt_paths", "SBHL-WHAT-MTS-FINAL-MT-PATHS", 1, 0, false);
        declareFunction("sbhl_what_mts_goal_final_mt_paths", "SBHL-WHAT-MTS-GOAL-FINAL-MT-PATHS", 0, 0, false);
        declareFunction("sbhl_predicate_mt_paths", "SBHL-PREDICATE-MT-PATHS", 3, 1, false);
        declareFunction("sbhl_inverse_mt_paths", "SBHL-INVERSE-MT-PATHS", 3, 1, false);
        declareFunction("sbhl_false_predicate_mt_paths", "SBHL-FALSE-PREDICATE-MT-PATHS", 3, 1, false);
        declareFunction("sbhl_false_inverse_mt_paths", "SBHL-FALSE-INVERSE-MT-PATHS", 3, 1, false);
        declareFunction("sbhl_what_mt_paths_from_node_to_node", "SBHL-WHAT-MT-PATHS-FROM-NODE-TO-NODE", 2, 0, false);
        declareFunction("sbhl_min_mt_paths", "SBHL-MIN-MT-PATHS", 1, 0, false);
        declareFunction("sbhl_min_mts_of_predicate_paths", "SBHL-MIN-MTS-OF-PREDICATE-PATHS", 3, 1, false);
        declareFunction("sbhl_min_mts_of_inverse_paths", "SBHL-MIN-MTS-OF-INVERSE-PATHS", 3, 1, false);
        declareFunction("sbhl_min_mts_of_false_predicate_paths", "SBHL-MIN-MTS-OF-FALSE-PREDICATE-PATHS", 3, 1, false);
        declareFunction("sbhl_min_mts_of_false_inverse_paths", "SBHL-MIN-MTS-OF-FALSE-INVERSE-PATHS", 3, 1, false);
        declareFunction("sbhl_max_floor_mts", "SBHL-MAX-FLOOR-MTS", 1, 0, false);
        new sbhl_search_what_mts.$sbhl_max_floor_mts$UnaryFunction();
        declareFunction("sbhl_max_floor_mts_of_paths", "SBHL-MAX-FLOOR-MTS-OF-PATHS", 1, 0, false);
        declareFunction("sbhl_max_floor_mts_of_predicate_paths", "SBHL-MAX-FLOOR-MTS-OF-PREDICATE-PATHS", 3, 1, false);
        declareFunction("sbhl_max_floor_mts_of_inverse_paths", "SBHL-MAX-FLOOR-MTS-OF-INVERSE-PATHS", 3, 1, false);
        declareFunction("sbhl_max_floor_mts_of_false_predicate_paths", "SBHL-MAX-FLOOR-MTS-OF-FALSE-PREDICATE-PATHS", 3, 1, false);
        declareFunction("sbhl_max_floor_mts_of_false_inverse_paths", "SBHL-MAX-FLOOR-MTS-OF-FALSE-INVERSE-PATHS", 3, 1, false);
        declareFunction("sbhl_mt_table_of_floors_for_predicate_path", "SBHL-MT-TABLE-OF-FLOORS-FOR-PREDICATE-PATH", 3, 2, false);
        declareFunction("sbhl_floors_in_space", "SBHL-FLOORS-IN-SPACE", 3, 2, false);
        declareFunction("sbhl_closure_intersection_in_space", "SBHL-CLOSURE-INTERSECTION-IN-SPACE", 2, 0, false);
        declareFunction("sbhl_sort_by_least_inverse_cardinality", "SBHL-SORT-BY-LEAST-INVERSE-CARDINALITY", 1, 1, false);
        declareFunction("sbhl_inverse_cardinalityL", "SBHL-INVERSE-CARDINALITY<", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_search_what_mts_file() {
        defparameter("*SBHL-PATH-MTS*", NIL);
        defparameter("*SBHL-WHAT-MTS-MT-PATHS*", NIL);
        defparameter("*SBHL-WHAT-MTS-INVERSE-MT-PATHS*", NIL);
        defparameter("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*", NIL);
        defparameter("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*", NIL);
        defparameter("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*", NIL);
        defparameter("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*", NIL);
        defparameter("*SBHL-VERIFY-NAUT-MT-RELEVANCE*", NIL);
        defparameter("*SBHL-WHAT-MTS-MAP-FUNCTION*", NIL);
        defparameter("*SBHL-WHAT-MTS-GOAL*", NIL);
        defparameter("*SBHL-WHAT-MTS-BEHAVIOR*", NIL);
        return NIL;
    }

    public static SubLObject setup_sbhl_search_what_mts_file() {
        register_macro_helper(POSSIBLY_UPDATE_SBHL_PATH_MTS, SBHL_REBIND_PATH_MTS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_search_what_mts_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_search_what_mts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_search_what_mts_file();
    }

    static {
    }

    public static final class $sbhl_max_floor_mts$UnaryFunction extends UnaryFunction {
        public $sbhl_max_floor_mts$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MAX-FLOOR-MTS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_max_floor_mts(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt4 = list(makeSymbol("*SBHL-PATH-MTS*"));

    static private final SubLList $list_alt6 = list(list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))));

    static private final SubLList $list_alt9 = list(makeSymbol("SPACE-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt12 = list(makeKeyword("PRIMARY"));

    static private final SubLList $list_alt13 = list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*"), makeSymbol("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*"));

    static private final SubLList $list_alt15 = list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*"), makeSymbol("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*"));

    static private final SubLList $list_alt16 = list(list(makeSymbol("*SBHL-VERIFY-NAUT-MT-RELEVANCE*"), NIL));

    static private final SubLList $list_alt17 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt27 = list(makeSymbol("NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt31$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt41$Search_behavior_not_recognized__S = makeString("Search behavior not recognized. Sorry.");

    static private final SubLList $list_alt42 = list(list(makeSymbol("*SBHL-WHAT-MTS-BEHAVIOR*"), list(makeSymbol("DETERMINE-SBHL-WHAT-MTS-BEHAVIOR"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")), list(makeSymbol("GET-SBHL-SEARCH-DIRECTION")), list(makeSymbol("GET-SBHL-TV")))));

    static private final SubLString $str_alt43$Unsupported_what_mts_behavior__a = makeString("Unsupported what mts behavior ~a");

    static private final SubLString $str_alt46$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt51$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt63$Mts_might_not_be_valid_because_in = makeString("Mts might not be valid because initial node was a NAUT which used complicated link generation.");

    static private final SubLSymbol $sym65$SBHL_INVERSE_CARDINALITY_ = makeSymbol("SBHL-INVERSE-CARDINALITY<");
}

/**
 * Total time: 1112 ms
 */
