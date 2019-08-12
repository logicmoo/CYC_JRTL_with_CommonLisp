/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sbhl_search_implied_relations extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_search_implied_relations();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $use_fast_sbhl_sibling_disjoint_any_boolean_fnP$ = makeSymbol("*USE-FAST-SBHL-SIBLING-DISJOINT-ANY-BOOLEAN-FN?*");



    private static final SubLSymbol ALL_SDC = makeSymbol("ALL-SDC");

    private static final SubLSymbol MAX_SDC = makeSymbol("MAX-SDC");

    static private final SubLSymbol $sym4$SDC_ = makeSymbol("SDC?");

    static private final SubLSymbol $sym5$ANY_SDC_WRT_ = makeSymbol("ANY-SDC-WRT?");

    static private final SubLSymbol $sym6$ANY_SDC_ANY_ = makeSymbol("ANY-SDC-ANY?");

    static private final SubLSymbol $sym7$WHY_SDC_ = makeSymbol("WHY-SDC?");

    private static final SubLSymbol SBHL_GATHER_ALL_DISJOINS = makeSymbol("SBHL-GATHER-ALL-DISJOINS");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    static private final SubLString $str14$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str19$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str20$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str21$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str22$Method_only_valid_for_simple_and_ = makeString("Method only valid for simple and transfer-through modules, not ~a");

    private static final SubLSymbol SBHL_NODE_IS_GOAL_NODE = makeSymbol("SBHL-NODE-IS-GOAL-NODE");



    private static final SubLSymbol SBHL_NODE_MARKED_AS_GOAL_NODE = makeSymbol("SBHL-NODE-MARKED-AS-GOAL-NODE");

    private static final SubLSymbol SBHL_PREDICATE_RELATION_P = makeSymbol("SBHL-PREDICATE-RELATION-P");

    private static final SubLString $str28$Method_only_valid_for_disjoins_mo = makeString("Method only valid for disjoins modules, not ~a");

    private static final SubLString $str29$Boolean_methods_using_ALL_are_cur = makeString("Boolean methods using ALL are currently unsupported for justifications.");

    private static final SubLSymbol SBHL_IMPLIED_FALSE_PREDICATE_RELATION_P = makeSymbol("SBHL-IMPLIED-FALSE-PREDICATE-RELATION-P");

    private static final SubLSymbol SBHL_IMPLIED_FALSE_INVERSE_RELATION_P = makeSymbol("SBHL-IMPLIED-FALSE-INVERSE-RELATION-P");

    private static final SubLSymbol SBHL_IMPLIED_DISJOINS_RELATION_P = makeSymbol("SBHL-IMPLIED-DISJOINS-RELATION-P");

    // Definitions
    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static final SubLObject get_sbhl_sibling_disjoint_closure_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
            if (pcase_var.eql($$genls)) {
                return ALL_SDC;
            } else {
                return NIL;
            }
        }
    }

    // Definitions
    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static SubLObject get_sbhl_sibling_disjoint_closure_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql($$genls)) {
            return ALL_SDC;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static final SubLObject sbhl_all_sibling_disjoint_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject sd_closure_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.get_sbhl_sibling_disjoint_closure_fn(module);
            SubLObject result = NIL;
            if (NIL != sd_closure_fn) {
                result = funcall(sd_closure_fn, node, mt);
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static SubLObject sbhl_all_sibling_disjoint_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject sd_closure_fn = get_sbhl_sibling_disjoint_closure_fn(module);
        SubLObject result = NIL;
        if (NIL != sd_closure_fn) {
            result = funcall(sd_closure_fn, node, mt);
        }
        return result;
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static final SubLObject get_sbhl_sibling_disjoint_max_nodes_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
            if (pcase_var.eql($$genls)) {
                return MAX_SDC;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static SubLObject get_sbhl_sibling_disjoint_max_nodes_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql($$genls)) {
            return MAX_SDC;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static final SubLObject sbhl_max_sibling_disjoint_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject sd_max_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.get_sbhl_sibling_disjoint_max_nodes_fn(module);
            SubLObject result = NIL;
            if (NIL != sd_max_fn) {
                result = funcall(sd_max_fn, node, mt);
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static SubLObject sbhl_max_sibling_disjoint_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject sd_max_fn = get_sbhl_sibling_disjoint_max_nodes_fn(module);
        SubLObject result = NIL;
        if (NIL != sd_max_fn) {
            result = funcall(sd_max_fn, node, mt);
        }
        return result;
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static final SubLObject get_sbhl_sibling_disjoint_boolean_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
            if (pcase_var.eql($$genls)) {
                return $sym4$SDC_;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static SubLObject get_sbhl_sibling_disjoint_boolean_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql($$genls)) {
            return $sym4$SDC_;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static final SubLObject sbhl_sibling_disjoint_relation_p_alt(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject sd_boolean_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.get_sbhl_sibling_disjoint_boolean_fn(module);
            SubLObject result = NIL;
            if (NIL != sd_boolean_fn) {
                result = funcall(sd_boolean_fn, node1, node2, mt);
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static SubLObject sbhl_sibling_disjoint_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject sd_boolean_fn = get_sbhl_sibling_disjoint_boolean_fn(module);
        SubLObject result = NIL;
        if (NIL != sd_boolean_fn) {
            result = funcall(sd_boolean_fn, node1, node2, mt);
        }
        return result;
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static final SubLObject get_sbhl_sibling_disjoint_any_boolean_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
            if (pcase_var.eql($$genls)) {
                return $sym5$ANY_SDC_WRT_;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static SubLObject get_sbhl_sibling_disjoint_any_boolean_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql($$genls)) {
            return $sym5$ANY_SDC_WRT_;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static final SubLObject sbhl_any_with_sibling_disjoint_relation_p_alt(SubLObject module, SubLObject nodes1, SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject sd_any_boolean_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.get_sbhl_sibling_disjoint_any_boolean_fn(module);
            SubLObject result = NIL;
            if (NIL != sd_any_boolean_fn) {
                result = funcall(sd_any_boolean_fn, nodes1, node2, mt);
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static SubLObject sbhl_any_with_sibling_disjoint_relation_p(final SubLObject module, final SubLObject nodes1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject sd_any_boolean_fn = get_sbhl_sibling_disjoint_any_boolean_fn(module);
        SubLObject result = NIL;
        if (NIL != sd_any_boolean_fn) {
            result = funcall(sd_any_boolean_fn, nodes1, node2, mt);
        }
        return result;
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static final SubLObject get_sbhl_sibling_disjoint_any_boolean_any_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
            if (pcase_var.eql($$genls)) {
                return $sym6$ANY_SDC_ANY_;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static SubLObject get_sbhl_sibling_disjoint_any_boolean_any_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql($$genls)) {
            return $sym6$ANY_SDC_ANY_;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static final SubLObject sbhl_sibling_disjoint_relation_between_any_p_alt(SubLObject module, SubLObject nodes1, SubLObject nodes2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject sd_any_boolean_any_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.get_sbhl_sibling_disjoint_any_boolean_any_fn(module);
            SubLObject result = NIL;
            if (NIL != sd_any_boolean_any_fn) {
                result = funcall(sd_any_boolean_any_fn, nodes1, nodes2, mt);
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static SubLObject sbhl_sibling_disjoint_relation_between_any_p(final SubLObject module, final SubLObject nodes1, final SubLObject nodes2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject sd_any_boolean_any_fn = get_sbhl_sibling_disjoint_any_boolean_any_fn(module);
        SubLObject result = NIL;
        if (NIL != sd_any_boolean_any_fn) {
            result = funcall(sd_any_boolean_any_fn, nodes1, nodes2, mt);
        }
        return result;
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static final SubLObject get_sbhl_sibling_disjoint_justification_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
            if (pcase_var.eql($$genls)) {
                return $sym7$WHY_SDC_;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return function-spec-p
     */
    @LispMethod(comment = "@return function-spec-p")
    public static SubLObject get_sbhl_sibling_disjoint_justification_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql($$genls)) {
            return $sym7$WHY_SDC_;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static final SubLObject sbhl_sibling_disjoint_justification_alt(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject sd_just_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.get_sbhl_sibling_disjoint_justification_fn(module);
            SubLObject result = NIL;
            if (NIL != sd_just_fn) {
                result = funcall(sd_just_fn, node1, node2, mt);
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization.
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization.")
    public static SubLObject sbhl_sibling_disjoint_justification(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject sd_just_fn = get_sbhl_sibling_disjoint_justification_fn(module);
        SubLObject result = NIL;
        if (NIL != sd_just_fn) {
            result = funcall(sd_just_fn, node1, node2, mt);
        }
        return result;
    }

    /**
     *
     *
     * @return listp; the disjoins with backward nodes from NODE. these nodes are part of the false predicate closure.
     */
    @LispMethod(comment = "@return listp; the disjoins with backward nodes from NODE. these nodes are part of the false predicate closure.")
    public static final SubLObject sbhl_disjoins_of_backward_closure_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
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
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject _prev_bind_0_1 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject _prev_bind_0_2 = sbhl_marking_vars.$sbhl_mapping_marking_space$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_mapping_marking_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                        sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.bind(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread), thread);
                                        sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.bind(T, thread);
                                        sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                        try {
                                            result = sbhl_search_methods.sbhl_gather_all_backward_true_nodes(module, node, SBHL_GATHER_ALL_DISJOINS, mt, tv, UNPROVIDED);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_3, thread);
                                        sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.rebind(_prev_bind_2, thread);
                                        sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.rebind(_prev_bind_1, thread);
                                        sbhl_marking_vars.$sbhl_mapping_marking_space$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                            } finally {
                                sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    } finally {
                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return listp; the disjoins with backward nodes from NODE. these nodes are part of the false predicate closure.
     */
    @LispMethod(comment = "@return listp; the disjoins with backward nodes from NODE. these nodes are part of the false predicate closure.")
    public static SubLObject sbhl_disjoins_of_backward_closure(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_mapping_marking_space$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_mapping_marking_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.bind(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.bind(T, thread);
                            sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                            try {
                                result = sbhl_search_methods.sbhl_gather_all_backward_true_nodes(module, node, SBHL_GATHER_ALL_DISJOINS, mt, tv, UNPROVIDED);
                            } finally {
                                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                        } finally {
                            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_4, thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$sbhl_mapping_marking_space$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Modifier. Gathers all disjoins from node in mapping spaces.
     */
    @LispMethod(comment = "Modifier. Gathers all disjoins from node in mapping spaces.")
    public static final SubLObject sbhl_gather_all_disjoins_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_search_vars.get_sbhl_search_module());
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    SubLObject _prev_bind_7 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        {
                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                            {
                                SubLObject _prev_bind_0_4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                    {
                                        SubLObject _prev_bind_0_5 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                            {
                                                SubLObject _prev_bind_0_6 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                SubLObject _prev_bind_1_7 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                SubLObject _prev_bind_2_8 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                SubLObject _prev_bind_3_9 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                SubLObject _prev_bind_4_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                            {
                                                                SubLObject _prev_bind_0_11 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_12 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_13 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                                                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                                                                    sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                                                                    sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(node);
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2_13, thread);
                                                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_12, thread);
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_11, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            if (NIL != needs_to_releaseP) {
                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_10, thread);
                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_9, thread);
                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_8, thread);
                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_7, thread);
                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_6, thread);
                                                }
                                            }
                                            if (source == $RESOURCE) {
                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_5, thread);
                                        }
                                    }
                                    if (source == $RESOURCE) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_6, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_5, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. Gathers all disjoins from node in mapping spaces.")
    public static SubLObject sbhl_gather_all_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_search_vars.get_sbhl_search_module());
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
        final SubLObject _prev_bind_8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
            sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                    final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$11 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                            final SubLObject _prev_bind_0_$9 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$10 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$11 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                                sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(node);
                            } finally {
                                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2_$11, thread);
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$10, thread);
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$9, thread);
                            }
                        } finally {
                            if (NIL != needs_to_releaseP) {
                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                            }
                        }
                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$12, thread);
                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$11, thread);
                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$10, thread);
                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$9, thread);
                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$8, thread);
                    }
                    if (source == $RESOURCE) {
                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$7, thread);
                }
                if (source == $RESOURCE) {
                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_8, thread);
            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_7, thread);
            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_6, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown this implementation could reuse spaces. @see sbhl-disjoins-of-backward-closure.
     */
    @LispMethod(comment = "@unknown this implementation could reuse spaces. @see sbhl-disjoins-of-backward-closure.")
    public static final SubLObject sbhl_all_sibling_disjoint_nodes_of_backward_closure_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject backward_nodes = sbhl_search_methods.sbhl_all_backward_true_nodes(module, node, mt, tv);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = backward_nodes;
            SubLObject back_node = NIL;
            for (back_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , back_node = cdolist_list_var.first()) {
                result = append(com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_all_sibling_disjoint_nodes(module, back_node, mt, tv), result);
            }
            return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @unknown this implementation could reuse spaces. @see sbhl-disjoins-of-backward-closure.
     */
    @LispMethod(comment = "@unknown this implementation could reuse spaces. @see sbhl-disjoins-of-backward-closure.")
    public static SubLObject sbhl_all_sibling_disjoint_nodes_of_backward_closure(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject backward_nodes = sbhl_search_methods.sbhl_all_backward_true_nodes(module, node, mt, tv);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = backward_nodes;
        SubLObject back_node = NIL;
        back_node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = append(sbhl_all_sibling_disjoint_nodes(module, back_node, mt, tv), result);
            cdolist_list_var = cdolist_list_var.rest();
            back_node = cdolist_list_var.first();
        } 
        return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown this implementation should be abstracted. Gathers all the disjoins of the nodes one step from NODE via PRED.
     */
    @LispMethod(comment = "@unknown this implementation should be abstracted. Gathers all the disjoins of the nodes one step from NODE via PRED.")
    public static final SubLObject sbhl_disjoins_of_tt_closure_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
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
                SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_module_utilities.get_sbhl_transfers_through_module(module));
                SubLObject result = NIL;
                SubLObject link_disjoins = NIL;
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
                                SubLObject _prev_bind_0_14 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_15 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_16 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = tv;
                                        {
                                            SubLObject _prev_bind_0_17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_19 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_20 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_21 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_22 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_23 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_24 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_25 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_26 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_27 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                            {
                                                                                                SubLObject _prev_bind_0_29 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                                                                                                    {
                                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                                        SubLObject module_var = NIL;
                                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_30 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                SubLObject _prev_bind_1_31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                    {
                                                                                                                        SubLObject node_32 = function_terms.naut_to_nart(node);
                                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_32)) {
                                                                                                                            {
                                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_32, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != d_link) {
                                                                                                                                    {
                                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                        if (NIL != mt_links) {
                                                                                                                                            {
                                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject mt_33 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_33)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_33, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject iteration_state_35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_35)) {
                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject tv_36 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_35);
                                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_36)) {
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                        try {
                                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv_36, thread);
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                SubLObject cdolist_list_var_38 = new_list;
                                                                                                                                                                                                SubLObject link_node = NIL;
                                                                                                                                                                                                for (link_node = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , link_node = cdolist_list_var_38.first()) {
                                                                                                                                                                                                    {
                                                                                                                                                                                                        SubLObject _prev_bind_0_39 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                {
                                                                                                                                                                                                                    SubLObject _prev_bind_0_40 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                                                                                                                                                    SubLObject _prev_bind_1_41 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                                                                                                                                                    SubLObject _prev_bind_2_42 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                                                                                                                                                    SubLObject _prev_bind_3_43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                                                                                                                    SubLObject _prev_bind_4_44 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                                                                                                                                                                                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                                                                                                                                                                                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                                                                                                                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                                                                                                                        sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                                                                                                                                                                                                                        sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(link_node);
                                                                                                                                                                                                                    } finally {
                                                                                                                                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_44, thread);
                                                                                                                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_43, thread);
                                                                                                                                                                                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_42, thread);
                                                                                                                                                                                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_41, thread);
                                                                                                                                                                                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_40, thread);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } finally {
                                                                                                                                                                                                                {
                                                                                                                                                                                                                    SubLObject _prev_bind_0_45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                                                                                        link_disjoins = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                                                                                                                                                    } finally {
                                                                                                                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_45, thread);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } finally {
                                                                                                                                                                                                            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_39, thread);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    result = append(link_disjoins, result);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        } finally {
                                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_37, thread);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                iteration_state_35 = dictionary_contents.do_dictionary_contents_next(iteration_state_35);
                                                                                                                                                                            }
                                                                                                                                                                        } 
                                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_35);
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_34, thread);
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
                                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt20$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            if (NIL != obsolete.cnat_p(node_32, UNPROVIDED)) {
                                                                                                                                {
                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    SubLObject cdolist_list_var_46 = new_list;
                                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                                    for (generating_fn = cdolist_list_var_46.first(); NIL != cdolist_list_var_46; cdolist_list_var_46 = cdolist_list_var_46.rest() , generating_fn = cdolist_list_var_46.first()) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_47 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node_32);
                                                                                                                                                    SubLObject new_list_48 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                    SubLObject cdolist_list_var_49 = new_list_48;
                                                                                                                                                    SubLObject link_node = NIL;
                                                                                                                                                    for (link_node = cdolist_list_var_49.first(); NIL != cdolist_list_var_49; cdolist_list_var_49 = cdolist_list_var_49.rest() , link_node = cdolist_list_var_49.first()) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_50 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                                                                                                                                try {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_51 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                                                                                                        SubLObject _prev_bind_1_52 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                                                                                                        SubLObject _prev_bind_2_53 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                                                                                                        SubLObject _prev_bind_3_54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                                                                        SubLObject _prev_bind_4_55 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                                                                                                                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                                                                                                                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                                                                                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                                                                            sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                                                                                                                                                                            sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(link_node);
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_55, thread);
                                                                                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_54, thread);
                                                                                                                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_53, thread);
                                                                                                                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_52, thread);
                                                                                                                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_51, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                                            link_disjoins = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                                                                                                        } finally {
                                                                                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_56, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_50, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        result = append(link_disjoins, result);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_47, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_31, thread);
                                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_30, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0_29, thread);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_28, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_27, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_26, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_25, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_24, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_23, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_22, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_21, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_20, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_18, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_17, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_16, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_15, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_14, thread);
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
                return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @unknown this implementation should be abstracted. Gathers all the disjoins of the nodes one step from NODE via PRED.
     */
    @LispMethod(comment = "@unknown this implementation should be abstracted. Gathers all the disjoins of the nodes one step from NODE via PRED.")
    public static SubLObject sbhl_disjoins_of_tt_closure(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_module_utilities.get_sbhl_transfers_through_module(module));
        SubLObject result = NIL;
        SubLObject link_disjoins = NIL;
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
            final SubLObject _prev_bind_0_$16 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$18 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$19 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$19 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$20 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$20 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$29 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                        final SubLObject _prev_bind_0_$22 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$23 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node_$34 = function_terms.naut_to_nart(node);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$34)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$34, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$35 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$35)) {
                                                                        final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$35, thread);
                                                                            SubLObject iteration_state_$37;
                                                                            for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv_$38 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$38)) {
                                                                                    final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$38, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject link_node;
                                                                                            SubLObject _prev_bind_0_$26;
                                                                                            SubLObject _prev_bind_0_$27;
                                                                                            SubLObject _prev_bind_1_$22;
                                                                                            SubLObject _prev_bind_2_$21;
                                                                                            SubLObject _prev_bind_3_$30;
                                                                                            SubLObject _prev_bind_4_$31;
                                                                                            SubLObject _prev_bind_0_$28;
                                                                                            SubLObject _values;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                                    _prev_bind_0_$26 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                                                                        try {
                                                                                                            _prev_bind_0_$27 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                                            _prev_bind_1_$22 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                                            _prev_bind_2_$21 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                                            _prev_bind_3_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            _prev_bind_4_$31 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                                                                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                                                                                                                sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(link_node);
                                                                                                            } finally {
                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$31, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$30, thread);
                                                                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$21, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$22, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$27, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                _values = getValuesAsVector();
                                                                                                                link_disjoins = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                                                restoreValuesFromVector(_values);
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$26, thread);
                                                                                                    }
                                                                                                    result = append(link_disjoins, result);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject link_node2 = NIL;
                                                                                                link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    final SubLObject _prev_bind_0_$29 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                                                                        try {
                                                                                                            final SubLObject _prev_bind_0_$30 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                                            final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                                            final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                                            final SubLObject _prev_bind_3_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            final SubLObject _prev_bind_4_$32 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                                                                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                                                                                                                sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(link_node2);
                                                                                                            } finally {
                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$32, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$31, thread);
                                                                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$22, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$23, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$30, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                final SubLObject _values2 = getValuesAsVector();
                                                                                                                link_disjoins = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                                                restoreValuesFromVector(_values2);
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$29, thread);
                                                                                                    }
                                                                                                    result = append(link_disjoins, result);
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$25, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$24, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str21$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node_$34, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$54;
                                                            final SubLObject new_list = cdolist_list_var_$54 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$54.first();
                                                            while (NIL != cdolist_list_var_$54) {
                                                                final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node_$34);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject link_node3;
                                                                        SubLObject _prev_bind_0_$33;
                                                                        SubLObject _prev_bind_0_$34;
                                                                        SubLObject _prev_bind_1_$24;
                                                                        SubLObject _prev_bind_2_$23;
                                                                        SubLObject _prev_bind_3_$32;
                                                                        SubLObject _prev_bind_4_$33;
                                                                        SubLObject _prev_bind_0_$35;
                                                                        SubLObject _values3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                                                _prev_bind_0_$33 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                                                    try {
                                                                                        _prev_bind_0_$34 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                        _prev_bind_1_$24 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                        _prev_bind_2_$23 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                        _prev_bind_3_$32 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        _prev_bind_4_$33 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                            sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                                                                                            sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(link_node3);
                                                                                        } finally {
                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$33, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$32, thread);
                                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$23, thread);
                                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$24, thread);
                                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$34, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            _values3 = getValuesAsVector();
                                                                                            link_disjoins = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                            restoreValuesFromVector(_values3);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$33, thread);
                                                                                }
                                                                                result = append(link_disjoins, result);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject link_node4 = NIL;
                                                                            link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                                                    try {
                                                                                        final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                        final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                        final SubLObject _prev_bind_2_$24 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                        final SubLObject _prev_bind_3_$33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        final SubLObject _prev_bind_4_$34 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                            sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                                                                                            sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(link_node4);
                                                                                        } finally {
                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$34, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$33, thread);
                                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$24, thread);
                                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$25, thread);
                                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$37, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            final SubLObject _values4 = getValuesAsVector();
                                                                                            link_disjoins = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                            restoreValuesFromVector(_values4);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$36, thread);
                                                                                }
                                                                                result = append(link_disjoins, result);
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$32, thread);
                                                                }
                                                                cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                                                                generating_fn = cdolist_list_var_$54.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$23, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0_$22, thread);
                                        }
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$30, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$29, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$20, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$20, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$21, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$20, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$19, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$19, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$19, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$18, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$18, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$18, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$17, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$16, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown this implementation could reuse spaces. @see sbhl-disjoins-of-tt-closure
     */
    @LispMethod(comment = "@unknown this implementation could reuse spaces. @see sbhl-disjoins-of-tt-closure")
    public static final SubLObject sbhl_all_sibling_disjoint_nodes_of_tt_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject tt_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = tt_nodes;
            SubLObject tt_node = NIL;
            for (tt_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tt_node = cdolist_list_var.first()) {
                result = append(com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_all_sibling_disjoint_nodes(sbhl_module_utilities.get_sbhl_transfers_through_module(module), tt_node, mt, tv), result);
            }
            return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @unknown this implementation could reuse spaces. @see sbhl-disjoins-of-tt-closure
     */
    @LispMethod(comment = "@unknown this implementation could reuse spaces. @see sbhl-disjoins-of-tt-closure")
    public static SubLObject sbhl_all_sibling_disjoint_nodes_of_tt(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject tt_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = tt_nodes;
        SubLObject tt_node = NIL;
        tt_node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = append(sbhl_all_sibling_disjoint_nodes(sbhl_module_utilities.get_sbhl_transfers_through_module(module), tt_node, mt, tv), result);
            cdolist_list_var = cdolist_list_var.rest();
            tt_node = cdolist_list_var.first();
        } 
        return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown this needs abstraction. gathers all disjoins and then the backward true closure of their union.
     */
    @LispMethod(comment = "@unknown this needs abstraction. gathers all disjoins and then the backward true closure of their union.")
    public static final SubLObject sbhl_tt_closure_of_disjoins_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_module_utilities.get_sbhl_transfers_through_module(module));
            SubLObject all_disjoins = sbhl_search_methods.sbhl_all_forward_true_nodes(disjoins_module, node, mt, tv);
            SubLObject result = NIL;
            result = sbhl_search_methods.sbhl_union_all_backward_true_nodes(module, all_disjoins, mt, tv);
            return result;
        }
    }

    /**
     *
     *
     * @unknown this needs abstraction. gathers all disjoins and then the backward true closure of their union.
     */
    @LispMethod(comment = "@unknown this needs abstraction. gathers all disjoins and then the backward true closure of their union.")
    public static SubLObject sbhl_tt_closure_of_disjoins(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_module_utilities.get_sbhl_transfers_through_module(module));
        final SubLObject all_disjoins = sbhl_search_methods.sbhl_all_forward_true_nodes(disjoins_module, node, mt, tv);
        SubLObject result = NIL;
        result = sbhl_search_methods.sbhl_union_all_backward_true_nodes(module, all_disjoins, mt, tv);
        return result;
    }

    /**
     *
     *
     * @unknown needs abstraction. @see sbhl-tt-closure-of-disjoins.
     */
    @LispMethod(comment = "@unknown needs abstraction. @see sbhl-tt-closure-of-disjoins.")
    public static final SubLObject sbhl_all_tt_nodes_of_sibling_disjoint_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
            SubLObject all_sibling_disjoins = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_all_sibling_disjoint_nodes(tt_module, node, mt, tv);
            SubLObject result = NIL;
            result = sbhl_search_methods.sbhl_union_all_backward_true_nodes(module, all_sibling_disjoins, mt, tv);
            return result;
        }
    }

    /**
     *
     *
     * @unknown needs abstraction. @see sbhl-tt-closure-of-disjoins.
     */
    @LispMethod(comment = "@unknown needs abstraction. @see sbhl-tt-closure-of-disjoins.")
    public static SubLObject sbhl_all_tt_nodes_of_sibling_disjoint_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
        final SubLObject all_sibling_disjoins = sbhl_all_sibling_disjoint_nodes(tt_module, node, mt, tv);
        SubLObject result = NIL;
        result = sbhl_search_methods.sbhl_union_all_backward_true_nodes(module, all_sibling_disjoins, mt, tv);
        return result;
    }

    /**
     *
     *
     * @unknown expensive. gathers all false genls and all disjoins and sibling disjoins with specs. gathers all false isas and all disjoins of isas.
     */
    @LispMethod(comment = "@unknown expensive. gathers all false genls and all disjoins and sibling disjoins with specs. gathers all false isas and all disjoins of isas.")
    public static final SubLObject sbhl_all_implied_forward_false_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
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
                        if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                            {
                                SubLObject false_closure = NIL;
                                SubLObject disjoins_of_all_specs = NIL;
                                SubLObject sibling_disjoint_nodes = NIL;
                                false_closure = sbhl_search_methods.sbhl_all_forward_false_nodes(module, node, mt, tv);
                                disjoins_of_all_specs = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_disjoins_of_backward_closure(module, node, mt, tv);
                                sibling_disjoint_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_all_sibling_disjoint_nodes_of_backward_closure(module, node, mt, tv);
                                result = append(false_closure, disjoins_of_all_specs, sibling_disjoint_nodes);
                            }
                        } else {
                            if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                                {
                                    SubLObject false_closure = NIL;
                                    SubLObject disjoins_of_tt = NIL;
                                    SubLObject sibling_disjoins_of_tt = NIL;
                                    false_closure = sbhl_search_methods.sbhl_all_forward_false_nodes(module, node, mt, tv);
                                    disjoins_of_tt = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_disjoins_of_tt_closure(module, node, mt, tv);
                                    sibling_disjoins_of_tt = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_all_sibling_disjoint_nodes_of_tt(module, node, mt, tv);
                                    result = append(false_closure, disjoins_of_tt, sibling_disjoins_of_tt);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @unknown expensive. gathers all false genls and all disjoins and sibling disjoins with specs. gathers all false isas and all disjoins of isas.
     */
    @LispMethod(comment = "@unknown expensive. gathers all false genls and all disjoins and sibling disjoins with specs. gathers all false isas and all disjoins of isas.")
    public static SubLObject sbhl_all_implied_forward_false_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
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
            if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                SubLObject false_closure = NIL;
                SubLObject disjoins_of_all_specs = NIL;
                SubLObject sibling_disjoint_nodes = NIL;
                false_closure = sbhl_search_methods.sbhl_all_forward_false_nodes(module, node, mt, tv);
                disjoins_of_all_specs = sbhl_disjoins_of_backward_closure(module, node, mt, tv);
                sibling_disjoint_nodes = (NIL != sdc.ignoring_sdcP()) ? NIL : sbhl_all_sibling_disjoint_nodes_of_backward_closure(module, node, mt, tv);
                result = append(false_closure, disjoins_of_all_specs, sibling_disjoint_nodes);
            } else
                if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                    SubLObject false_closure = NIL;
                    SubLObject disjoins_of_tt = NIL;
                    SubLObject sibling_disjoins_of_tt = NIL;
                    false_closure = sbhl_search_methods.sbhl_all_forward_false_nodes(module, node, mt, tv);
                    disjoins_of_tt = sbhl_disjoins_of_tt_closure(module, node, mt, tv);
                    sibling_disjoins_of_tt = (NIL != sdc.ignoring_sdcP()) ? NIL : sbhl_all_sibling_disjoint_nodes_of_tt(module, node, mt, tv);
                    result = append(false_closure, disjoins_of_tt, sibling_disjoins_of_tt);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str22$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }

        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown expensive. gathers all false specs, and all specs of all disjoins and sibling disjoins. gathers all false isas and all instances of all disjoins.
     */
    @LispMethod(comment = "@unknown expensive. gathers all false specs, and all specs of all disjoins and sibling disjoins. gathers all false isas and all instances of all disjoins.")
    public static final SubLObject sbhl_all_implied_backward_false_nodes_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
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
                        if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                            {
                                SubLObject false_closure = NIL;
                                SubLObject all_disjoins = NIL;
                                SubLObject sibling_disjoint_nodes = NIL;
                                false_closure = sbhl_search_methods.sbhl_all_backward_false_nodes(module, node, mt, tv);
                                all_disjoins = sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_search_vars.get_sbhl_search_module()), node, mt, tv);
                                sibling_disjoint_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_all_sibling_disjoint_nodes(module, node, mt, tv);
                                result = append(false_closure, all_disjoins, sibling_disjoint_nodes);
                            }
                        } else {
                            if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                                {
                                    SubLObject false_closure = NIL;
                                    SubLObject tt_of_disjoins = NIL;
                                    SubLObject tt_of_sibling_disjoins = NIL;
                                    false_closure = sbhl_search_methods.sbhl_all_backward_false_nodes(module, node, mt, tv);
                                    tt_of_disjoins = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_tt_closure_of_disjoins(module, node, mt, tv);
                                    tt_of_sibling_disjoins = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_all_tt_nodes_of_sibling_disjoint_nodes(module, node, mt, tv);
                                    result = append(false_closure, tt_of_disjoins, tt_of_sibling_disjoins);
                                }
                            } else {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @unknown expensive. gathers all false specs, and all specs of all disjoins and sibling disjoins. gathers all false isas and all instances of all disjoins.
     */
    @LispMethod(comment = "@unknown expensive. gathers all false specs, and all specs of all disjoins and sibling disjoins. gathers all false isas and all instances of all disjoins.")
    public static SubLObject sbhl_all_implied_backward_false_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
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
            if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                SubLObject false_closure = NIL;
                SubLObject all_disjoins = NIL;
                SubLObject sibling_disjoint_nodes = NIL;
                false_closure = sbhl_search_methods.sbhl_all_backward_false_nodes(module, node, mt, tv);
                all_disjoins = sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_search_vars.get_sbhl_search_module()), node, mt, tv);
                sibling_disjoint_nodes = (NIL != sdc.ignoring_sdcP()) ? NIL : sbhl_all_sibling_disjoint_nodes(module, node, mt, tv);
                result = append(false_closure, all_disjoins, sibling_disjoint_nodes);
            } else
                if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                    SubLObject false_closure = NIL;
                    SubLObject tt_of_disjoins = NIL;
                    SubLObject tt_of_sibling_disjoins = NIL;
                    false_closure = sbhl_search_methods.sbhl_all_backward_false_nodes(module, node, mt, tv);
                    tt_of_disjoins = sbhl_tt_closure_of_disjoins(module, node, mt, tv);
                    tt_of_sibling_disjoins = (NIL != sdc.ignoring_sdcP()) ? NIL : sbhl_all_tt_nodes_of_sibling_disjoint_nodes(module, node, mt, tv);
                    result = append(false_closure, tt_of_disjoins, tt_of_sibling_disjoins);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str22$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }

        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown could reuse spaces. gathers all disjoins and sibling disjoins.
     */
    @LispMethod(comment = "@unknown could reuse spaces. gathers all disjoins and sibling disjoins.")
    public static final SubLObject sbhl_all_implied_disjoins_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
            SubLObject disjoin_nodes = NIL;
            SubLObject sibling_disjoins = NIL;
            disjoin_nodes = sbhl_search_methods.sbhl_all_forward_true_nodes(module, node, mt, tv);
            sibling_disjoins = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_all_sibling_disjoint_nodes(tt_module, node, mt, tv);
            return nunion(disjoin_nodes, sibling_disjoins, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @unknown could reuse spaces. gathers all disjoins and sibling disjoins.
     */
    @LispMethod(comment = "@unknown could reuse spaces. gathers all disjoins and sibling disjoins.")
    public static SubLObject sbhl_all_implied_disjoins(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
        SubLObject disjoin_nodes = NIL;
        SubLObject sibling_disjoins = NIL;
        disjoin_nodes = sbhl_search_methods.sbhl_all_forward_true_nodes(module, node, mt, tv);
        sibling_disjoins = (NIL != sdc.ignoring_sdcP()) ? NIL : sbhl_all_sibling_disjoint_nodes(tt_module, node, mt, tv);
        return nunion(disjoin_nodes, sibling_disjoins, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown could reuse spaces. gathers all max disjoins and max sibling disjoins, and maximizes among these.
     */
    @LispMethod(comment = "@unknown could reuse spaces. gathers all max disjoins and max sibling disjoins, and maximizes among these.")
    public static final SubLObject sbhl_implied_max_disjoins_alt(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
            SubLObject max_disjoin_nodes = NIL;
            SubLObject max_sibling_disjoins = NIL;
            max_disjoin_nodes = sbhl_search_methods.sbhl_max_true_disjoins(module, node, mt, tv);
            max_sibling_disjoins = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_max_sibling_disjoint_nodes(tt_module, node, mt, tv);
            return sbhl_search_methods.sbhl_max_nodes(tt_module, nconc(max_disjoin_nodes, max_sibling_disjoins), mt, tv, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @unknown could reuse spaces. gathers all max disjoins and max sibling disjoins, and maximizes among these.
     */
    @LispMethod(comment = "@unknown could reuse spaces. gathers all max disjoins and max sibling disjoins, and maximizes among these.")
    public static SubLObject sbhl_implied_max_disjoins(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
        SubLObject max_disjoin_nodes = NIL;
        SubLObject max_sibling_disjoins = NIL;
        max_disjoin_nodes = sbhl_search_methods.sbhl_max_true_disjoins(module, node, mt, tv);
        max_sibling_disjoins = (NIL != sdc.ignoring_sdcP()) ? NIL : sbhl_max_sibling_disjoint_nodes(tt_module, node, mt, tv);
        return sbhl_search_methods.sbhl_max_nodes(tt_module, nconc(max_disjoin_nodes, max_sibling_disjoins), mt, tv, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether NOT-NODE is disjoint with some spec of NODE.
     */
    @LispMethod(comment = "@return booleanp; whether NOT-NODE is disjoint with some spec of NODE.")
    public static final SubLObject sbhl_disjoins_relation_with_backward_nodes_p_alt(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
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
                SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(module);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                        sbhl_search_vars.$sbhl_search_type$.bind($BOOLEAN, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_57 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_58 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_59 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = tv;
                                        {
                                            SubLObject _prev_bind_0_60 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_61 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_62 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_63 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_64 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_65 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_66 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_67 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_68 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_69 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_70 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_71 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                            {
                                                                                                SubLObject premarkingP = sbhl_search_utilities.sbhl_module_premarks_gather_nodes_p();
                                                                                                SubLObject goal_fn = SBHL_NODE_IS_GOAL_NODE;
                                                                                                SubLObject goal_node = not_node;
                                                                                                SubLObject goal_space = sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
                                                                                                if (NIL != premarkingP) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_72 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_73 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(sbhl_module_utilities.get_sbhl_link_pred(sbhl_search_vars.get_sbhl_search_module()) == $$negationInverse ? ((SubLObject) (T)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            sbhl_marking_methods.sbhl_premark_gather_nodes(goal_node);
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_73, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_72, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    goal_fn = SBHL_NODE_MARKED_AS_GOAL_NODE;
                                                                                                    goal_space = sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
                                                                                                }
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_74 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_2_76 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_3_77 = sbhl_search_vars.$sbhl_goal_node$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_4_78 = sbhl_marking_vars.$sbhl_goal_space$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_5_79 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                        sbhl_search_vars.$sbhl_consider_node_fn$.bind(goal_fn, thread);
                                                                                                        sbhl_search_vars.$sbhl_goal_node$.bind(goal_node, thread);
                                                                                                        sbhl_marking_vars.$sbhl_goal_space$.bind(goal_space, thread);
                                                                                                        sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                                                                        try {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_80 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                                    sbhl_search_utilities.sbhl_check_disjoins_of_all_backward_nodes(node);
                                                                                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                                                                                                } finally {
                                                                                                                    sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_80, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                                                } finally {
                                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_81, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_5_79, thread);
                                                                                                        sbhl_marking_vars.$sbhl_goal_space$.rebind(_prev_bind_4_78, thread);
                                                                                                        sbhl_search_vars.$sbhl_goal_node$.rebind(_prev_bind_3_77, thread);
                                                                                                        sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2_76, thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_75, thread);
                                                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_74, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_71, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_70, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_69, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_68, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_67, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_66, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_65, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_64, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_63, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_62, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_61, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_60, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_59, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_58, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_57, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_5, thread);
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
     * @return booleanp; whether NOT-NODE is disjoint with some spec of NODE.
     */
    @LispMethod(comment = "@return booleanp; whether NOT-NODE is disjoint with some spec of NODE.")
    public static SubLObject sbhl_disjoins_relation_with_backward_nodes_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(module);
        SubLObject result = NIL;
        if (NIL != disjoins_module) {
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                sbhl_search_vars.$sbhl_search_type$.bind($BOOLEAN, thread);
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$71 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2_$72 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject tv_var = tv;
                    final SubLObject _prev_bind_0_$71 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$72 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str14$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$73 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                            final SubLObject _prev_bind_0_$73 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$74 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                    final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$74 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$83 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                    final SubLObject _prev_bind_4_$84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                            final SubLObject premarkingP = sbhl_search_utilities.sbhl_module_premarks_gather_nodes_p();
                                            SubLObject goal_fn = SBHL_NODE_IS_GOAL_NODE;
                                            SubLObject goal_space = sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
                                            if (NIL != premarkingP) {
                                                final SubLObject _prev_bind_0_$76 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(sbhl_module_utilities.get_sbhl_link_pred(sbhl_search_vars.get_sbhl_search_module()).eql($$negationInverse) ? T : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    sbhl_marking_methods.sbhl_premark_gather_nodes(not_node);
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$75, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$76, thread);
                                                }
                                                goal_fn = SBHL_NODE_MARKED_AS_GOAL_NODE;
                                                goal_space = sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
                                            }
                                            final SubLObject _prev_bind_0_$77 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$75 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                            final SubLObject _prev_bind_3_$84 = sbhl_search_vars.$sbhl_goal_node$.currentBinding(thread);
                                            final SubLObject _prev_bind_4_$85 = sbhl_marking_vars.$sbhl_goal_space$.currentBinding(thread);
                                            final SubLObject _prev_bind_5_$92 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_search_vars.$sbhl_consider_node_fn$.bind(goal_fn, thread);
                                                sbhl_search_vars.$sbhl_goal_node$.bind(not_node, thread);
                                                sbhl_marking_vars.$sbhl_goal_space$.bind(goal_space, thread);
                                                sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                try {
                                                    final SubLObject _prev_bind_0_$78 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        try {
                                                            sbhl_search_utilities.sbhl_check_disjoins_of_all_backward_nodes(node);
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$79 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$78, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$80 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_5_$92, thread);
                                                sbhl_marking_vars.$sbhl_goal_space$.rebind(_prev_bind_4_$85, thread);
                                                sbhl_search_vars.$sbhl_goal_node$.rebind(_prev_bind_3_$84, thread);
                                                sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2_$75, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$76, thread);
                                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$77, thread);
                                            }
                                        } finally {
                                            if (NIL != needs_to_releaseP) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$84, thread);
                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$83, thread);
                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$74, thread);
                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$74, thread);
                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$75, thread);
                                    }
                                    if (source == $RESOURCE) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$74, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$73, thread);
                            }
                        } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$73, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$73, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$72, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$72, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$71, thread);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$72, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$71, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$70, thread);
                }
            } finally {
                sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_6, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     *
     *
     * @return booleanp; whether NOT-NODE is disjoint with some tt node of NODE. @hack
     */
    @LispMethod(comment = "@return booleanp; whether NOT-NODE is disjoint with some tt node of NODE. @hack")
    public static final SubLObject sbhl_disjoins_with_tt_nodes_relation_p_alt(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
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
                SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
                SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(tt_module);
                SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
                SubLObject result = NIL;
                result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(disjoins_module, link_nodes, not_node, mt, tv);
                if ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                    sbhl_search_vars.sbhl_justification_behavior_defaults_old();
                    {
                        SubLObject link_node = second(sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread).first().first());
                        sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(cons(list(list(sbhl_module_vars.get_sbhl_module_link_pred(module), node, link_node), NIL != mt ? ((SubLObject) (mt)) : mt_relevance_macros.$mt$.getDynamicValue(thread), NIL != tv ? ((SubLObject) (sbhl_search_vars.sbhl_true_tv(tv))) : sbhl_search_vars.sbhl_search_true_tv()), sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)), thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether NOT-NODE is disjoint with some tt node of NODE. @hack
     */
    @LispMethod(comment = "@return booleanp; whether NOT-NODE is disjoint with some tt node of NODE. @hack")
    public static SubLObject sbhl_disjoins_with_tt_nodes_relation_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
        final SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(tt_module);
        final SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
        SubLObject result = NIL;
        result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(disjoins_module, link_nodes, not_node, mt, tv);
        if ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
            sbhl_search_vars.sbhl_justification_behavior_defaults_old();
            final SubLObject link_node = second(sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread).first().first());
            sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(cons(list(list(sbhl_module_vars.get_sbhl_module_link_pred(module), node, link_node), NIL != mt ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), NIL != tv ? sbhl_search_vars.sbhl_true_tv(tv) : sbhl_search_vars.sbhl_search_true_tv()), sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)), thread);
        }
        return result;
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization. this would be incredibly slow right now
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization. this would be incredibly slow right now")
    public static final SubLObject sbhl_sibling_disjoint_with_backward_nodes_justification_alt(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject sd_just_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.get_sbhl_sibling_disjoint_justification_fn(module);
            SubLObject result = NIL;
            if (NIL != sd_just_fn) {
                {
                    SubLObject backward_nodes = nreverse(sbhl_search_methods.sbhl_all_backward_true_nodes(module, node, mt, tv));
                    SubLObject disjointP = NIL;
                    if (NIL == disjointP) {
                        {
                            SubLObject csome_list_var = backward_nodes;
                            SubLObject back_node = NIL;
                            for (back_node = csome_list_var.first(); !((NIL != disjointP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , back_node = csome_list_var.first()) {
                                result = funcall(sd_just_fn, back_node, not_node, mt);
                                if (NIL != result) {
                                    if (node != back_node) {
                                        result = nconc(sbhl_search_utilities.sbhl_handle_justification(SBHL_PREDICATE_RELATION_P, module, back_node, node, mt, tv, $OLD, T), result);
                                    }
                                    sbhl_search_vars.sbhl_justification_assembled();
                                    disjointP = T;
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown the various sibling disjoint behaviors need modularization. this would be incredibly slow right now
     */
    @LispMethod(comment = "@unknown the various sibling disjoint behaviors need modularization. this would be incredibly slow right now")
    public static SubLObject sbhl_sibling_disjoint_with_backward_nodes_justification(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject sd_just_fn = get_sbhl_sibling_disjoint_justification_fn(module);
        SubLObject result = NIL;
        if (NIL != sd_just_fn) {
            final SubLObject backward_nodes = set.set_or_list_to_list(sbhl_search_methods.sbhl_all_backward_true_nodes(module, node, mt, tv));
            SubLObject disjointP = NIL;
            if (NIL == disjointP) {
                SubLObject csome_list_var = cons(node, backward_nodes);
                SubLObject back_node = NIL;
                back_node = csome_list_var.first();
                while ((NIL == disjointP) && (NIL != csome_list_var)) {
                    result = funcall(sd_just_fn, back_node, not_node, mt);
                    if (NIL != result) {
                        if (!node.eql(back_node)) {
                            result = nconc(sbhl_search_utilities.sbhl_handle_justification(SBHL_PREDICATE_RELATION_P, module, back_node, node, mt, tv, NIL, T), result);
                        }
                        sbhl_search_vars.sbhl_justification_assembled();
                        disjointP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    back_node = csome_list_var.first();
                } 
            }
        }
        return result;
    }

    /**
     *
     *
     * @return booleanp; whether NOT-NODE is sibling disjoint with some spec of NODE.
     */
    @LispMethod(comment = "@return booleanp; whether NOT-NODE is sibling disjoint with some spec of NODE.")
    public static final SubLObject sbhl_sibling_disjoint_relation_with_backward_nodes_p_alt(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject sd_boolean_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.get_sbhl_sibling_disjoint_boolean_fn(module);
            SubLObject result = NIL;
            if (NIL != sd_boolean_fn) {
                {
                    SubLObject backward_nodes = sbhl_search_methods.sbhl_all_backward_true_nodes(module, node, mt, tv);
                    SubLObject disjointP = NIL;
                    if (NIL == disjointP) {
                        {
                            SubLObject csome_list_var = backward_nodes;
                            SubLObject back_node = NIL;
                            for (back_node = csome_list_var.first(); !((NIL != disjointP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , back_node = csome_list_var.first()) {
                                result = funcall(sd_boolean_fn, back_node, not_node, mt);
                                if (NIL != result) {
                                    disjointP = T;
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return booleanp; whether NOT-NODE is sibling disjoint with some spec of NODE.
     */
    @LispMethod(comment = "@return booleanp; whether NOT-NODE is sibling disjoint with some spec of NODE.")
    public static SubLObject sbhl_sibling_disjoint_relation_with_backward_nodes_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject sd_boolean_fn = get_sbhl_sibling_disjoint_boolean_fn(module);
        final SubLObject sd_any_boolean_fn = get_sbhl_sibling_disjoint_any_boolean_fn(module);
        SubLObject result = NIL;
        if (NIL != sd_boolean_fn) {
            final SubLObject backward_nodes = sbhl_search_methods.sbhl_all_backward_true_nodes(module, node, mt, tv);
            SubLObject disjointP = NIL;
            if ((NIL != $use_fast_sbhl_sibling_disjoint_any_boolean_fnP$.getDynamicValue(thread)) && (NIL != sd_any_boolean_fn)) {
                if (NIL != funcall(sd_any_boolean_fn, backward_nodes, not_node, mt)) {
                    result = T;
                }
            } else {
                final SubLObject sol = backward_nodes;
                if (NIL != set.set_p(sol)) {
                    final SubLObject set_contents_var = set.do_set_internal(sol);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject back_node;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == disjointP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        back_node = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, back_node)) {
                            result = funcall(sd_boolean_fn, back_node, not_node, mt);
                            if (NIL != result) {
                                disjointP = T;
                            }
                        }
                    }
                } else
                    if (sol.isList()) {
                        if (NIL == disjointP) {
                            SubLObject csome_list_var = sol;
                            SubLObject back_node2 = NIL;
                            back_node2 = csome_list_var.first();
                            while ((NIL == disjointP) && (NIL != csome_list_var)) {
                                result = funcall(sd_boolean_fn, back_node2, not_node, mt);
                                if (NIL != result) {
                                    disjointP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                back_node2 = csome_list_var.first();
                            } 
                        }
                    } else {
                        Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, sol);
                    }

            }
        }
        return result;
    }

    /**
     *
     *
     * @unknown we can reuse spaces rather than reinitiating searches for each link-node. returns whether NOT-NODE is disjoint with some tt node of NODE.
     */
    @LispMethod(comment = "@unknown we can reuse spaces rather than reinitiating searches for each link-node. returns whether NOT-NODE is disjoint with some tt node of NODE.")
    public static final SubLObject sbhl_sibling_disjoint_relation_tt_p_alt(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
            SubLObject sd_boolean_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.get_sbhl_sibling_disjoint_boolean_fn(tt_module);
            SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
            SubLObject result = NIL;
            if (NIL == result) {
                {
                    SubLObject csome_list_var = link_nodes;
                    SubLObject link_node = NIL;
                    for (link_node = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , link_node = csome_list_var.first()) {
                        result = funcall(sd_boolean_fn, link_node, not_node, mt);
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown we can reuse spaces rather than reinitiating searches for each link-node. returns whether NOT-NODE is disjoint with some tt node of NODE.
     */
    @LispMethod(comment = "@unknown we can reuse spaces rather than reinitiating searches for each link-node. returns whether NOT-NODE is disjoint with some tt node of NODE.")
    public static SubLObject sbhl_sibling_disjoint_relation_tt_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
        final SubLObject sd_boolean_fn = get_sbhl_sibling_disjoint_boolean_fn(tt_module);
        final SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject sol = link_nodes;
        if (NIL != set.set_p(sol)) {
            final SubLObject set_contents_var = set.do_set_internal(sol);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link_node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == result) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                link_node = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                    result = funcall(sd_boolean_fn, link_node, not_node, mt);
                }
            }
        } else
            if (sol.isList()) {
                if (NIL == result) {
                    SubLObject csome_list_var;
                    SubLObject link_node2;
                    for (csome_list_var = sol, link_node2 = NIL, link_node2 = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = funcall(sd_boolean_fn, link_node2, not_node, mt) , csome_list_var = csome_list_var.rest() , link_node2 = csome_list_var.first()) {
                    }
                }
            } else {
                Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, sol);
            }

        return result;
    }

    /**
     *
     *
     * @unknown @see sbhl-sibling-disjoint-relation-tt-p.
     */
    @LispMethod(comment = "@unknown @see sbhl-sibling-disjoint-relation-tt-p.")
    public static final SubLObject sbhl_sibling_disjoint_tt_justification_alt(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
            SubLObject sd_just_fn = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.get_sbhl_sibling_disjoint_justification_fn(tt_module);
            SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
            SubLObject justification = NIL;
            SubLObject result = NIL;
            if (NIL == justification) {
                {
                    SubLObject csome_list_var = link_nodes;
                    SubLObject link_node = NIL;
                    for (link_node = csome_list_var.first(); !((NIL != justification) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , link_node = csome_list_var.first()) {
                        justification = funcall(sd_just_fn, link_node, not_node, mt);
                        if (NIL != justification) {
                            result = nconc(sbhl_search_utilities.sbhl_handle_justification(SBHL_PREDICATE_RELATION_P, module, node, link_node, mt, tv, NIL, T), justification);
                            sbhl_search_vars.sbhl_justification_assembled();
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown @see sbhl-sibling-disjoint-relation-tt-p.
     */
    @LispMethod(comment = "@unknown @see sbhl-sibling-disjoint-relation-tt-p.")
    public static SubLObject sbhl_sibling_disjoint_tt_justification(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
        final SubLObject sd_just_fn = get_sbhl_sibling_disjoint_justification_fn(tt_module);
        final SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
        SubLObject justification = NIL;
        SubLObject result = NIL;
        final SubLObject sol = link_nodes;
        if (NIL != set.set_p(sol)) {
            final SubLObject set_contents_var = set.do_set_internal(sol);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link_node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == justification) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                link_node = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                    justification = funcall(sd_just_fn, link_node, not_node, mt);
                    if (NIL != justification) {
                        result = nconc(sbhl_search_utilities.sbhl_handle_justification(SBHL_PREDICATE_RELATION_P, module, node, link_node, mt, tv, NIL, T), justification);
                        sbhl_search_vars.sbhl_justification_assembled();
                    }
                }
            }
        } else
            if (sol.isList()) {
                if (NIL == justification) {
                    SubLObject csome_list_var = sol;
                    SubLObject link_node2 = NIL;
                    link_node2 = csome_list_var.first();
                    while ((NIL == justification) && (NIL != csome_list_var)) {
                        justification = funcall(sd_just_fn, link_node2, not_node, mt);
                        if (NIL != justification) {
                            result = nconc(sbhl_search_utilities.sbhl_handle_justification(SBHL_PREDICATE_RELATION_P, module, node, link_node2, mt, tv, NIL, T), justification);
                            sbhl_search_vars.sbhl_justification_assembled();
                        }
                        csome_list_var = csome_list_var.rest();
                        link_node2 = csome_list_var.first();
                    } 
                }
            } else {
                Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, sol);
            }

        return result;
    }

    /**
     *
     *
     * @return booleanp; Returns t iff NOT-NODE is not known to have a MODULE relation with NODE or is known to have a false MODULE relation with NODE. @see sbhl-predicate-relation-p. @see sbhl-implied-false-predicate-relation-p
     */
    @LispMethod(comment = "@return booleanp; Returns t iff NOT-NODE is not known to have a MODULE relation with NODE or is known to have a false MODULE relation with NODE. @see sbhl-predicate-relation-p. @see sbhl-implied-false-predicate-relation-p")
    public static final SubLObject sbhl_argumentation_false_predicate_relation_p_alt(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_search_methods.sbhl_predicate_relation_p(module, node, not_node, mt, tv)) {
            return NIL;
        } else {
            return com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(module, node, not_node, mt, tv);
        }
    }

    /**
     *
     *
     * @return booleanp; Returns t iff NOT-NODE is not known to have a MODULE relation with NODE or is known to have a false MODULE relation with NODE. @see sbhl-predicate-relation-p. @see sbhl-implied-false-predicate-relation-p
     */
    @LispMethod(comment = "@return booleanp; Returns t iff NOT-NODE is not known to have a MODULE relation with NODE or is known to have a false MODULE relation with NODE. @see sbhl-predicate-relation-p. @see sbhl-implied-false-predicate-relation-p")
    public static SubLObject sbhl_argumentation_false_predicate_relation_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_search_methods.sbhl_predicate_relation_p(module, node, not_node, mt, tv)) {
            return NIL;
        }
        return sbhl_implied_false_predicate_relation_p(module, node, not_node, mt, tv);
    }

    /**
     *
     *
     * @unknown @return booleanp; whether NOT-NODE is known to have a false MODULE relation with NODE.
     */
    @LispMethod(comment = "@unknown @return booleanp; whether NOT-NODE is known to have a false MODULE relation with NODE.")
    public static final SubLObject sbhl_implied_false_predicate_relation_p_alt(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
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
                SubLObject coerced_tv = tv;
                SubLObject result = NIL;
                if (NIL != sbhl_search_vars.sbhl_false_tv_p(tv)) {
                    coerced_tv = sbhl_search_vars.sbhl_opposite_tv(tv);
                }
                if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                    result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
                    if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_disjoins_relation_with_backward_nodes_p(module, node, not_node, mt, coerced_tv);
                    }
                    if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                        if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                            {
                                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                                SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                                    sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                                    result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_with_backward_nodes_justification(module, node, not_node, mt, UNPROVIDED);
                                } finally {
                                    sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_relation_with_backward_nodes_p(module, node, not_node, mt, coerced_tv);
                        }
                    }
                    return result;
                } else {
                    if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                        result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
                        if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                            result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_disjoins_with_tt_nodes_relation_p(module, node, not_node, mt, coerced_tv);
                        }
                        if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                            if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                {
                                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                                        sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_tt_justification(module, node, not_node, mt, UNPROVIDED);
                                    } finally {
                                        sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
                                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } else {
                                result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_relation_tt_p(module, node, not_node, mt, coerced_tv);
                            }
                        }
                        return result;
                    } else {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown @return booleanp; whether NOT-NODE is known to have a false MODULE relation with NODE.
     */
    @LispMethod(comment = "@unknown @return booleanp; whether NOT-NODE is known to have a false MODULE relation with NODE.")
    public static SubLObject sbhl_implied_false_predicate_relation_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject coerced_tv = tv;
        SubLObject result = NIL;
        if (NIL != sbhl_search_vars.sbhl_false_tv_p(tv)) {
            coerced_tv = sbhl_search_vars.sbhl_opposite_tv(tv);
        }
        if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
            if ((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
                result = sbhl_disjoins_relation_with_backward_nodes_p(module, node, not_node, mt, coerced_tv);
            }
            if (((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) && (NIL == sdc.ignoring_sdcP())) {
                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                        result = sbhl_sibling_disjoint_with_backward_nodes_justification(module, node, not_node, mt, UNPROVIDED);
                    } finally {
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    result = sbhl_sibling_disjoint_relation_with_backward_nodes_p(module, node, not_node, mt, coerced_tv);
                }
            }
            return result;
        }
        if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
            if ((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
                result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, not_node, mt, coerced_tv);
            }
            if (((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) && (NIL == sdc.ignoring_sdcP())) {
                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                        result = sbhl_sibling_disjoint_tt_justification(module, node, not_node, mt, UNPROVIDED);
                    } finally {
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    result = sbhl_sibling_disjoint_relation_tt_p(module, node, not_node, mt, coerced_tv);
                }
            }
            return result;
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str22$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    /**
     *
     *
     * @unknown @return booleanp; whether NOT-NODE is known to have a false inverse-MODULE relation with NODE. e.g. for genls -> (not-specs NODE NOT-NODE).
     */
    @LispMethod(comment = "@unknown @return booleanp; whether NOT-NODE is known to have a false inverse-MODULE relation with NODE. e.g. for genls -> (not-specs NODE NOT-NODE).")
    public static final SubLObject sbhl_implied_false_inverse_relation_p_alt(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
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
                SubLObject result = NIL;
                if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                    result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, node, not_node, mt, tv);
                    if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                        result = sbhl_search_methods.sbhl_disjoins_relation_p(module, node, not_node, mt, tv);
                    }
                    if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                        if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                            {
                                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                                SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                                    sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                                    result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_justification(module, node, not_node, mt, tv);
                                } finally {
                                    sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_relation_p(module, node, not_node, mt, tv);
                        }
                        if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                            sbhl_search_vars.sbhl_justification_assembled();
                        }
                    }
                    return result;
                } else {
                    if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                        result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
                        if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                            result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_disjoins_with_tt_nodes_relation_p(module, not_node, node, mt, tv);
                        }
                        if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                            if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                {
                                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                                        sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_tt_justification(module, not_node, node, mt, UNPROVIDED);
                                    } finally {
                                        sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
                                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } else {
                                result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_relation_tt_p(module, not_node, node, mt, tv);
                            }
                        }
                        return result;
                    } else {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown @return booleanp; whether NOT-NODE is known to have a false inverse-MODULE relation with NODE. e.g. for genls -> (not-specs NODE NOT-NODE).
     */
    @LispMethod(comment = "@unknown @return booleanp; whether NOT-NODE is known to have a false inverse-MODULE relation with NODE. e.g. for genls -> (not-specs NODE NOT-NODE).")
    public static SubLObject sbhl_implied_false_inverse_relation_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, node, not_node, mt, tv);
            if ((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
                result = sbhl_search_methods.sbhl_disjoins_relation_p(module, node, not_node, mt, tv);
            }
            if (((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) && (NIL == sdc.ignoring_sdcP())) {
                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                        result = sbhl_sibling_disjoint_justification(module, node, not_node, mt, tv);
                    } finally {
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    result = sbhl_sibling_disjoint_relation_p(module, node, not_node, mt, tv);
                }
                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    sbhl_search_vars.sbhl_justification_assembled();
                }
            }
            return result;
        }
        if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
            if ((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
                result = sbhl_disjoins_with_tt_nodes_relation_p(module, not_node, node, mt, tv);
            }
            if (((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) && (NIL == sdc.ignoring_sdcP())) {
                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                        result = sbhl_sibling_disjoint_tt_justification(module, not_node, node, mt, UNPROVIDED);
                    } finally {
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    result = sbhl_sibling_disjoint_relation_tt_p(module, not_node, node, mt, tv);
                }
            }
            return result;
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str22$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    /**
     *
     *
     * @unknown @return booleanp; whether NODE1 and NODE2 are disjoint wrt module relations.
     */
    @LispMethod(comment = "@unknown @return booleanp; whether NODE1 and NODE2 are disjoint wrt module relations.")
    public static final SubLObject sbhl_implied_disjoins_relation_p_alt(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv) {
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
                SubLObject result = NIL;
                if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                    result = sbhl_search_methods.sbhl_predicate_relation_p(module, node1, node2, mt, tv);
                    if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                        {
                            SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
                            if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                {
                                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                                        sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_justification(tt_module, node1, node2, mt, tv);
                                    } finally {
                                        sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
                                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } else {
                                result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_relation_p(tt_module, node1, node2, mt, tv);
                            }
                        }
                        if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                            sbhl_search_vars.sbhl_justification_assembled();
                        }
                        return result;
                    }
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt27$Method_only_valid_for_disjoins_mo, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown @return booleanp; whether NODE1 and NODE2 are disjoint wrt module relations.
     */
    @LispMethod(comment = "@unknown @return booleanp; whether NODE1 and NODE2 are disjoint wrt module relations.")
    public static SubLObject sbhl_implied_disjoins_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
            result = sbhl_search_methods.sbhl_predicate_relation_p(module, node1, node2, mt, tv);
            if (((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) && (NIL == sdc.ignoring_sdcP())) {
                final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                        result = sbhl_sibling_disjoint_justification(tt_module, node1, node2, mt, tv);
                    } finally {
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    result = sbhl_sibling_disjoint_relation_p(tt_module, node1, node2, mt, tv);
                }
                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    sbhl_search_vars.sbhl_justification_assembled();
                }
                return result;
            }
        } else {
            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str28$Method_only_valid_for_disjoins_mo, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    /**
     *
     *
     * @unknown @return booleanp. @example any-not-spec? any-not-instance?
     */
    @LispMethod(comment = "@unknown @return booleanp. @example any-not-spec? any-not-instance?")
    public static final SubLObject sbhl_any_with_implied_false_inverse_relation_p_alt(SubLObject module, SubLObject nodes, SubLObject node, SubLObject mt, SubLObject tv) {
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
                SubLObject result = NIL;
                if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                    result = sbhl_search_methods.sbhl_any_with_false_inverse_relation_p(module, nodes, node, mt, tv);
                    if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                        result = sbhl_search_methods.sbhl_any_with_disjoins_relation_p(module, nodes, node, mt, tv);
                    }
                    if (!((NIL != result) || (NIL != sbhl_search_vars.sbhl_justification_search_p()))) {
                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_any_with_sibling_disjoint_relation_p(module, nodes, node, mt, tv);
                    }
                    return result;
                } else {
                    if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                        result = sbhl_search_methods.sbhl_any_with_false_inverse_relation_p(module, nodes, node, mt, tv);
                        if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                            if (NIL == result) {
                                {
                                    SubLObject csome_list_var = nodes;
                                    SubLObject node1 = NIL;
                                    for (node1 = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node1 = csome_list_var.first()) {
                                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_disjoins_with_tt_nodes_relation_p(module, node, node1, mt, tv);
                                        if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                            result = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                                        }
                                    }
                                }
                            }
                        }
                        if (!((NIL != result) || (NIL != sbhl_search_vars.sbhl_justification_search_p()))) {
                            if (NIL == result) {
                                {
                                    SubLObject csome_list_var = nodes;
                                    SubLObject node1 = NIL;
                                    for (node1 = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node1 = csome_list_var.first()) {
                                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_relation_tt_p(module, node, node1, mt, tv);
                                    }
                                }
                            }
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown @return booleanp. @example any-not-spec? any-not-instance?
     */
    @LispMethod(comment = "@unknown @return booleanp. @example any-not-spec? any-not-instance?")
    public static SubLObject sbhl_any_with_implied_false_inverse_relation_p(final SubLObject module, final SubLObject nodes, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            result = sbhl_search_methods.sbhl_any_with_false_inverse_relation_p(module, nodes, node, mt, tv);
            if ((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
                result = sbhl_search_methods.sbhl_any_with_disjoins_relation_p(module, nodes, node, mt, tv);
            }
            if (((NIL == result) && (NIL == sbhl_search_vars.sbhl_justification_search_p())) && (NIL == sdc.ignoring_sdcP())) {
                result = sbhl_any_with_sibling_disjoint_relation_p(module, nodes, node, mt, tv);
            }
            return result;
        }
        if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
            result = sbhl_search_methods.sbhl_any_with_false_inverse_relation_p(module, nodes, node, mt, tv);
            if ((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
                if (NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == result) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, node2)) {
                            result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, node2, mt, tv);
                            if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                result = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                            }
                        }
                    }
                } else
                    if (nodes.isList()) {
                        if (NIL == result) {
                            SubLObject csome_list_var = nodes;
                            SubLObject node3 = NIL;
                            node3 = csome_list_var.first();
                            while ((NIL == result) && (NIL != csome_list_var)) {
                                result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, node3, mt, tv);
                                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                    result = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                                }
                                csome_list_var = csome_list_var.rest();
                                node3 = csome_list_var.first();
                            } 
                        }
                    } else {
                        Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                    }

            }
            if (((NIL == result) && (NIL == sbhl_search_vars.sbhl_justification_search_p())) && (NIL == sdc.ignoring_sdcP())) {
                if (NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == result) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, node2)) {
                            result = sbhl_sibling_disjoint_relation_tt_p(module, node, node2, mt, tv);
                        }
                    }
                } else
                    if (nodes.isList()) {
                        if (NIL == result) {
                            SubLObject csome_list_var;
                            SubLObject node3;
                            for (csome_list_var = nodes, node3 = NIL, node3 = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = sbhl_sibling_disjoint_relation_tt_p(module, node, node3, mt, tv) , csome_list_var = csome_list_var.rest() , node3 = csome_list_var.first()) {
                            }
                        }
                    } else {
                        Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                    }

            }
        } else {
            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str22$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    /**
     *
     *
     * @unknown @return booleanp. @example not-genl-any?
     */
    @LispMethod(comment = "@unknown @return booleanp. @example not-genl-any?")
    public static final SubLObject sbhl_implied_false_predicate_relation_with_any_p_alt(SubLObject module, SubLObject node, SubLObject nodes, SubLObject mt, SubLObject tv) {
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
                SubLObject result = NIL;
                if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                    result = sbhl_search_methods.sbhl_false_predicate_relation_with_any_p(module, node, nodes, mt, tv);
                    if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                        result = sbhl_search_methods.sbhl_disjoins_relation_with_any_p(module, node, nodes, mt, tv);
                    }
                    if (!((NIL != result) || (NIL != sbhl_search_vars.sbhl_justification_search_p()))) {
                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_any_with_sibling_disjoint_relation_p(module, nodes, node, mt, tv);
                    }
                    return result;
                } else {
                    if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                        result = sbhl_search_methods.sbhl_false_predicate_relation_with_any_p(module, node, nodes, mt, tv);
                        if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                            if (NIL == result) {
                                {
                                    SubLObject csome_list_var = nodes;
                                    SubLObject node1 = NIL;
                                    for (node1 = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node1 = csome_list_var.first()) {
                                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_disjoins_with_tt_nodes_relation_p(module, node, node1, mt, tv);
                                        if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                            result = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                                        }
                                    }
                                }
                            }
                        }
                        if (!((NIL != result) || (NIL != sbhl_search_vars.sbhl_justification_search_p()))) {
                            if (NIL == result) {
                                {
                                    SubLObject csome_list_var = nodes;
                                    SubLObject node1 = NIL;
                                    for (node1 = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node1 = csome_list_var.first()) {
                                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_relation_tt_p(module, node, node1, mt, tv);
                                    }
                                }
                            }
                        }
                    } else {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown @return booleanp. @example not-genl-any?
     */
    @LispMethod(comment = "@unknown @return booleanp. @example not-genl-any?")
    public static SubLObject sbhl_implied_false_predicate_relation_with_any_p(final SubLObject module, final SubLObject node, final SubLObject nodes, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_predicate_relation_with_any_p(module, node, nodes, mt, tv);
            if ((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
                result = sbhl_search_methods.sbhl_disjoins_relation_with_any_p(module, node, nodes, mt, tv);
            }
            if (((NIL == result) && (NIL == sbhl_search_vars.sbhl_justification_search_p())) && (NIL == sdc.ignoring_sdcP())) {
                result = sbhl_any_with_sibling_disjoint_relation_p(module, nodes, node, mt, tv);
            }
            return result;
        }
        if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_predicate_relation_with_any_p(module, node, nodes, mt, tv);
            if ((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
                if (NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == result) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, node2)) {
                            result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, node2, mt, tv);
                            if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                result = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                            }
                        }
                    }
                } else
                    if (nodes.isList()) {
                        if (NIL == result) {
                            SubLObject csome_list_var = nodes;
                            SubLObject node3 = NIL;
                            node3 = csome_list_var.first();
                            while ((NIL == result) && (NIL != csome_list_var)) {
                                result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, node3, mt, tv);
                                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                    result = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                                }
                                csome_list_var = csome_list_var.rest();
                                node3 = csome_list_var.first();
                            } 
                        }
                    } else {
                        Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                    }

            }
            if (((NIL == result) && (NIL == sbhl_search_vars.sbhl_justification_search_p())) && (NIL == sdc.ignoring_sdcP())) {
                if (NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == result) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, node2)) {
                            result = sbhl_sibling_disjoint_relation_tt_p(module, node, node2, mt, tv);
                        }
                    }
                } else
                    if (nodes.isList()) {
                        if (NIL == result) {
                            SubLObject csome_list_var;
                            SubLObject node3;
                            for (csome_list_var = nodes, node3 = NIL, node3 = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = sbhl_sibling_disjoint_relation_tt_p(module, node, node3, mt, tv) , csome_list_var = csome_list_var.rest() , node3 = csome_list_var.first()) {
                            }
                        }
                    } else {
                        Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                    }

            }
        } else {
            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str22$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    /**
     *
     *
     * @unknown @return booleanp. @example all-not-spec?
     */
    @LispMethod(comment = "@unknown @return booleanp. @example all-not-spec?")
    public static final SubLObject sbhl_all_with_implied_false_inverse_relation_p_alt(SubLObject module, SubLObject nodes, SubLObject node, SubLObject mt, SubLObject tv) {
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
                SubLObject result = NIL;
                SubLObject doneP = NIL;
                if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                    result = sbhl_search_methods.sbhl_all_with_false_inverse_relation_p(module, nodes, node, mt, tv);
                    if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                        result = sbhl_search_methods.sbhl_all_with_disjoins_relation_p(module, nodes, node, mt, tv);
                    }
                    if (!((NIL != result) || (NIL != sbhl_search_vars.sbhl_justification_search_p()))) {
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = node;
                                SubLObject node1 = NIL;
                                for (node1 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node1 = csome_list_var.first()) {
                                    if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_relation_p(module, node1, node, mt, tv)) {
                                        doneP = T;
                                    }
                                }
                            }
                        }
                        result = makeBoolean(NIL == doneP);
                    }
                    return result;
                } else {
                    if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                        result = sbhl_search_methods.sbhl_all_with_false_inverse_relation_p(module, nodes, node, mt, tv);
                        if (!((NIL != result) || ((NIL != sbhl_search_vars.sbhl_justification_search_p()) && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))) {
                            if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt28$Boolean_methods_using_ALL_are_cur, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = nodes;
                                    SubLObject node1 = NIL;
                                    for (node1 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node1 = csome_list_var.first()) {
                                        if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_disjoins_with_tt_nodes_relation_p(module, node1, node, mt, tv)) {
                                            doneP = T;
                                        }
                                    }
                                }
                            }
                            result = makeBoolean(NIL == doneP);
                        }
                        if (!((NIL != result) || (NIL != sbhl_search_vars.sbhl_justification_search_p()))) {
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = nodes;
                                    SubLObject node1 = NIL;
                                    for (node1 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node1 = csome_list_var.first()) {
                                        if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_sibling_disjoint_relation_tt_p(module, node1, node, mt, tv)) {
                                            doneP = T;
                                        }
                                    }
                                }
                            }
                            result = makeBoolean(NIL == doneP);
                        }
                        return result;
                    } else {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown @return booleanp. @example all-not-spec?
     */
    @LispMethod(comment = "@unknown @return booleanp. @example all-not-spec?")
    public static SubLObject sbhl_all_with_implied_false_inverse_relation_p(final SubLObject module, final SubLObject nodes, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        if (NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            result = sbhl_search_methods.sbhl_all_with_false_inverse_relation_p(module, nodes, node, mt, tv);
            if ((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
                result = sbhl_search_methods.sbhl_all_with_disjoins_relation_p(module, nodes, node, mt, tv);
            }
            if (((NIL == result) && (NIL == sbhl_search_vars.sbhl_justification_search_p())) && (NIL == sdc.ignoring_sdcP())) {
                if (NIL != set.set_p(node)) {
                    final SubLObject set_contents_var = set.do_set_internal(node);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if ((NIL != set_contents.do_set_contents_element_validP(state, node2)) && (NIL == sbhl_sibling_disjoint_relation_p(module, node2, node, mt, tv))) {
                            doneP = T;
                        }
                    }
                } else
                    if (node.isList()) {
                        if (NIL == doneP) {
                            SubLObject csome_list_var = node;
                            SubLObject node3 = NIL;
                            node3 = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if (NIL == sbhl_sibling_disjoint_relation_p(module, node3, node, mt, tv)) {
                                    doneP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                node3 = csome_list_var.first();
                            } 
                        }
                    } else {
                        Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, node);
                    }

                result = makeBoolean(NIL == doneP);
            }
            return result;
        }
        if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
            result = sbhl_search_methods.sbhl_all_with_false_inverse_relation_p(module, nodes, node, mt, tv);
            if ((NIL == result) && ((NIL == sbhl_search_vars.sbhl_justification_search_p()) || (NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
                if (NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str29$Boolean_methods_using_ALL_are_cur, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if ((NIL != set_contents.do_set_contents_element_validP(state, node2)) && (NIL == sbhl_disjoins_with_tt_nodes_relation_p(module, node2, node, mt, tv))) {
                            doneP = T;
                        }
                    }
                } else
                    if (nodes.isList()) {
                        if (NIL == doneP) {
                            SubLObject csome_list_var = nodes;
                            SubLObject node3 = NIL;
                            node3 = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if (NIL == sbhl_disjoins_with_tt_nodes_relation_p(module, node3, node, mt, tv)) {
                                    doneP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                node3 = csome_list_var.first();
                            } 
                        }
                    } else {
                        Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                    }

                result = makeBoolean(NIL == doneP);
            }
            if (((NIL == result) && (NIL == sbhl_search_vars.sbhl_justification_search_p())) && (NIL == sdc.ignoring_sdcP())) {
                if (NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if ((NIL != set_contents.do_set_contents_element_validP(state, node2)) && (NIL == sbhl_sibling_disjoint_relation_tt_p(module, node2, node, mt, tv))) {
                            doneP = T;
                        }
                    }
                } else
                    if (nodes.isList()) {
                        if (NIL == doneP) {
                            SubLObject csome_list_var = nodes;
                            SubLObject node3 = NIL;
                            node3 = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if (NIL == sbhl_sibling_disjoint_relation_tt_p(module, node3, node, mt, tv)) {
                                    doneP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                node3 = csome_list_var.first();
                            } 
                        }
                    } else {
                        Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                    }

                result = makeBoolean(NIL == doneP);
            }
            return result;
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str22$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    /**
     *
     *
     * @unknown @return booleanp. @example any-disjoint-with?
     */
    @LispMethod(comment = "@unknown @return booleanp. @example any-disjoint-with?")
    public static final SubLObject sbhl_any_with_implied_disjoins_relation_p_alt(SubLObject module, SubLObject nodes, SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject result = NIL;
            if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(module, nodes, node, mt, tv);
                if (!((NIL != result) || (NIL != sbhl_search_vars.sbhl_justification_search_p()))) {
                    {
                        SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
                        result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_any_with_sibling_disjoint_relation_p(tt_module, nodes, node, mt, tv);
                    }
                }
                return result;
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt27$Method_only_valid_for_disjoins_mo, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown @return booleanp. @example any-disjoint-with?
     */
    @LispMethod(comment = "@unknown @return booleanp. @example any-disjoint-with?")
    public static SubLObject sbhl_any_with_implied_disjoins_relation_p(final SubLObject module, final SubLObject nodes, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
            result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(module, nodes, node, mt, tv);
            if (((NIL == result) && (NIL == sbhl_search_vars.sbhl_justification_search_p())) && (NIL == sdc.ignoring_sdcP())) {
                final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
                result = sbhl_any_with_sibling_disjoint_relation_p(tt_module, nodes, node, mt, tv);
            }
            return result;
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str28$Method_only_valid_for_disjoins_mo, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    /**
     *
     *
     * @unknown @return booleanp. @example any-disjoint-with-any?
     */
    @LispMethod(comment = "@unknown @return booleanp. @example any-disjoint-with-any?")
    public static final SubLObject sbhl_implied_disjoins_relation_between_any_p_alt(SubLObject module, SubLObject nodes1, SubLObject nodes2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject result = NIL;
            if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                result = sbhl_search_methods.sbhl_predicate_relation_between_any_p(module, nodes1, nodes2, mt, tv);
                if (!((NIL != result) || (NIL != sbhl_search_vars.sbhl_justification_search_p()))) {
                    {
                        SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
                        if (NIL == result) {
                            {
                                SubLObject csome_list_var = nodes2;
                                SubLObject node2 = NIL;
                                for (node2 = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node2 = csome_list_var.first()) {
                                    result = com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations.sbhl_any_with_sibling_disjoint_relation_p(tt_module, nodes1, node2, mt, tv);
                                }
                            }
                        }
                    }
                }
                return result;
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt27$Method_only_valid_for_disjoins_mo, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return result;
        }
    }

    /**
     *
     *
     * @unknown @return booleanp. @example any-disjoint-with-any?
     */
    @LispMethod(comment = "@unknown @return booleanp. @example any-disjoint-with-any?")
    public static SubLObject sbhl_implied_disjoins_relation_between_any_p(final SubLObject module, final SubLObject nodes1, final SubLObject nodes2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        if (NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
            result = sbhl_search_methods.sbhl_predicate_relation_between_any_p(module, nodes1, nodes2, mt, tv);
            if (((NIL == result) && (NIL == sbhl_search_vars.sbhl_justification_search_p())) && (NIL == sdc.ignoring_sdcP())) {
                final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
                if (NIL != set.set_p(nodes2)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes2);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == result) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, node2)) {
                            result = sbhl_any_with_sibling_disjoint_relation_p(tt_module, nodes1, node2, mt, tv);
                        }
                    }
                } else
                    if (nodes2.isList()) {
                        if (NIL == result) {
                            SubLObject csome_list_var;
                            SubLObject node3;
                            for (csome_list_var = nodes2, node3 = NIL, node3 = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = sbhl_any_with_sibling_disjoint_relation_p(tt_module, nodes1, node3, mt, tv) , csome_list_var = csome_list_var.rest() , node3 = csome_list_var.first()) {
                            }
                        }
                    } else {
                        Errors.error($str20$_A_is_neither_SET_P_nor_LISTP_, nodes2);
                    }

            }
            return result;
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str28$Method_only_valid_for_disjoins_mo, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    /**
     *
     *
     * @unknown @see sbhl-implied-false-predicate-relation-p
     */
    @LispMethod(comment = "@unknown @see sbhl-implied-false-predicate-relation-p")
    public static final SubLObject why_sbhl_implied_false_predicate_relation_p_alt(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_search_utilities.sbhl_handle_justification(SBHL_IMPLIED_FALSE_PREDICATE_RELATION_P, module, node1, node2, mt, tv, behavior, NIL);
    }

    /**
     *
     *
     * @unknown @see sbhl-implied-false-predicate-relation-p
     */
    @LispMethod(comment = "@unknown @see sbhl-implied-false-predicate-relation-p")
    public static SubLObject why_sbhl_implied_false_predicate_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_search_utilities.sbhl_handle_justification(SBHL_IMPLIED_FALSE_PREDICATE_RELATION_P, module, node1, node2, mt, tv, behavior, NIL);
    }

    /**
     *
     *
     * @unknown @see sbhl-implied-false-inverse-relation-p
     */
    @LispMethod(comment = "@unknown @see sbhl-implied-false-inverse-relation-p")
    public static final SubLObject why_sbhl_implied_false_inverse_relation_p_alt(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_search_utilities.sbhl_handle_justification(SBHL_IMPLIED_FALSE_INVERSE_RELATION_P, module, node1, node2, mt, tv, behavior, NIL);
    }

    /**
     *
     *
     * @unknown @see sbhl-implied-false-inverse-relation-p
     */
    @LispMethod(comment = "@unknown @see sbhl-implied-false-inverse-relation-p")
    public static SubLObject why_sbhl_implied_false_inverse_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_search_utilities.sbhl_handle_justification(SBHL_IMPLIED_FALSE_INVERSE_RELATION_P, module, node1, node2, mt, tv, behavior, NIL);
    }

    /**
     *
     *
     * @unknown @see sbhl-implied-disjoins-relation-p
     */
    @LispMethod(comment = "@unknown @see sbhl-implied-disjoins-relation-p")
    public static final SubLObject why_sbhl_implied_disjoins_relation_p_alt(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_search_utilities.sbhl_handle_justification(SBHL_IMPLIED_DISJOINS_RELATION_P, module, node1, node2, mt, tv, behavior, NIL);
    }

    /**
     *
     *
     * @unknown @see sbhl-implied-disjoins-relation-p
     */
    @LispMethod(comment = "@unknown @see sbhl-implied-disjoins-relation-p")
    public static SubLObject why_sbhl_implied_disjoins_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_search_utilities.sbhl_handle_justification(SBHL_IMPLIED_DISJOINS_RELATION_P, module, node1, node2, mt, tv, behavior, NIL);
    }

    public static SubLObject declare_sbhl_search_implied_relations_file() {
        declareFunction("get_sbhl_sibling_disjoint_closure_fn", "GET-SBHL-SIBLING-DISJOINT-CLOSURE-FN", 1, 0, false);
        declareFunction("sbhl_all_sibling_disjoint_nodes", "SBHL-ALL-SIBLING-DISJOINT-NODES", 2, 2, false);
        declareFunction("get_sbhl_sibling_disjoint_max_nodes_fn", "GET-SBHL-SIBLING-DISJOINT-MAX-NODES-FN", 1, 0, false);
        declareFunction("sbhl_max_sibling_disjoint_nodes", "SBHL-MAX-SIBLING-DISJOINT-NODES", 2, 2, false);
        declareFunction("get_sbhl_sibling_disjoint_boolean_fn", "GET-SBHL-SIBLING-DISJOINT-BOOLEAN-FN", 1, 0, false);
        declareFunction("sbhl_sibling_disjoint_relation_p", "SBHL-SIBLING-DISJOINT-RELATION-P", 3, 2, false);
        declareFunction("get_sbhl_sibling_disjoint_any_boolean_fn", "GET-SBHL-SIBLING-DISJOINT-ANY-BOOLEAN-FN", 1, 0, false);
        declareFunction("sbhl_any_with_sibling_disjoint_relation_p", "SBHL-ANY-WITH-SIBLING-DISJOINT-RELATION-P", 3, 2, false);
        declareFunction("get_sbhl_sibling_disjoint_any_boolean_any_fn", "GET-SBHL-SIBLING-DISJOINT-ANY-BOOLEAN-ANY-FN", 1, 0, false);
        declareFunction("sbhl_sibling_disjoint_relation_between_any_p", "SBHL-SIBLING-DISJOINT-RELATION-BETWEEN-ANY-P", 3, 2, false);
        declareFunction("get_sbhl_sibling_disjoint_justification_fn", "GET-SBHL-SIBLING-DISJOINT-JUSTIFICATION-FN", 1, 0, false);
        declareFunction("sbhl_sibling_disjoint_justification", "SBHL-SIBLING-DISJOINT-JUSTIFICATION", 3, 2, false);
        declareFunction("sbhl_disjoins_of_backward_closure", "SBHL-DISJOINS-OF-BACKWARD-CLOSURE", 2, 2, false);
        declareFunction("sbhl_gather_all_disjoins", "SBHL-GATHER-ALL-DISJOINS", 1, 0, false);
        declareFunction("sbhl_all_sibling_disjoint_nodes_of_backward_closure", "SBHL-ALL-SIBLING-DISJOINT-NODES-OF-BACKWARD-CLOSURE", 2, 2, false);
        declareFunction("sbhl_disjoins_of_tt_closure", "SBHL-DISJOINS-OF-TT-CLOSURE", 2, 2, false);
        declareFunction("sbhl_all_sibling_disjoint_nodes_of_tt", "SBHL-ALL-SIBLING-DISJOINT-NODES-OF-TT", 2, 2, false);
        declareFunction("sbhl_tt_closure_of_disjoins", "SBHL-TT-CLOSURE-OF-DISJOINS", 2, 2, false);
        declareFunction("sbhl_all_tt_nodes_of_sibling_disjoint_nodes", "SBHL-ALL-TT-NODES-OF-SIBLING-DISJOINT-NODES", 2, 2, false);
        declareFunction("sbhl_all_implied_forward_false_nodes", "SBHL-ALL-IMPLIED-FORWARD-FALSE-NODES", 2, 2, false);
        declareFunction("sbhl_all_implied_backward_false_nodes", "SBHL-ALL-IMPLIED-BACKWARD-FALSE-NODES", 2, 2, false);
        declareFunction("sbhl_all_implied_disjoins", "SBHL-ALL-IMPLIED-DISJOINS", 2, 2, false);
        declareFunction("sbhl_implied_max_disjoins", "SBHL-IMPLIED-MAX-DISJOINS", 2, 2, false);
        declareFunction("sbhl_disjoins_relation_with_backward_nodes_p", "SBHL-DISJOINS-RELATION-WITH-BACKWARD-NODES-P", 3, 2, false);
        declareFunction("sbhl_disjoins_with_tt_nodes_relation_p", "SBHL-DISJOINS-WITH-TT-NODES-RELATION-P", 3, 2, false);
        declareFunction("sbhl_sibling_disjoint_with_backward_nodes_justification", "SBHL-SIBLING-DISJOINT-WITH-BACKWARD-NODES-JUSTIFICATION", 3, 2, false);
        declareFunction("sbhl_sibling_disjoint_relation_with_backward_nodes_p", "SBHL-SIBLING-DISJOINT-RELATION-WITH-BACKWARD-NODES-P", 3, 2, false);
        declareFunction("sbhl_sibling_disjoint_relation_tt_p", "SBHL-SIBLING-DISJOINT-RELATION-TT-P", 3, 2, false);
        declareFunction("sbhl_sibling_disjoint_tt_justification", "SBHL-SIBLING-DISJOINT-TT-JUSTIFICATION", 3, 2, false);
        declareFunction("sbhl_argumentation_false_predicate_relation_p", "SBHL-ARGUMENTATION-FALSE-PREDICATE-RELATION-P", 3, 2, false);
        declareFunction("sbhl_implied_false_predicate_relation_p", "SBHL-IMPLIED-FALSE-PREDICATE-RELATION-P", 3, 2, false);
        declareFunction("sbhl_implied_false_inverse_relation_p", "SBHL-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 2, false);
        declareFunction("sbhl_implied_disjoins_relation_p", "SBHL-IMPLIED-DISJOINS-RELATION-P", 3, 2, false);
        declareFunction("sbhl_any_with_implied_false_inverse_relation_p", "SBHL-ANY-WITH-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 2, false);
        declareFunction("sbhl_implied_false_predicate_relation_with_any_p", "SBHL-IMPLIED-FALSE-PREDICATE-RELATION-WITH-ANY-P", 3, 2, false);
        declareFunction("sbhl_all_with_implied_false_inverse_relation_p", "SBHL-ALL-WITH-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 2, false);
        declareFunction("sbhl_any_with_implied_disjoins_relation_p", "SBHL-ANY-WITH-IMPLIED-DISJOINS-RELATION-P", 3, 2, false);
        declareFunction("sbhl_implied_disjoins_relation_between_any_p", "SBHL-IMPLIED-DISJOINS-RELATION-BETWEEN-ANY-P", 3, 2, false);
        declareFunction("why_sbhl_implied_false_predicate_relation_p", "WHY-SBHL-IMPLIED-FALSE-PREDICATE-RELATION-P", 3, 3, false);
        declareFunction("why_sbhl_implied_false_inverse_relation_p", "WHY-SBHL-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 3, false);
        declareFunction("why_sbhl_implied_disjoins_relation_p", "WHY-SBHL-IMPLIED-DISJOINS-RELATION-P", 3, 3, false);
        return NIL;
    }

    public static SubLObject init_sbhl_search_implied_relations_file() {
        defparameter("*USE-FAST-SBHL-SIBLING-DISJOINT-ANY-BOOLEAN-FN?*", T);
        return NIL;
    }

    public static SubLObject setup_sbhl_search_implied_relations_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_search_implied_relations_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_search_implied_relations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_search_implied_relations_file();
    }

    static {
    }

    static private final SubLString $str_alt14$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt19$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt20$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt21$Method_only_valid_for_simple_and_ = makeString("Method only valid for simple and transfer-through modules, not ~a");

    static private final SubLString $str_alt27$Method_only_valid_for_disjoins_mo = makeString("Method only valid for disjoins modules, not ~a");

    static private final SubLString $str_alt28$Boolean_methods_using_ALL_are_cur = makeString("Boolean methods using ALL are currently unsupported for justifications.");
}

/**
 * Total time: 1636 ms
 */
