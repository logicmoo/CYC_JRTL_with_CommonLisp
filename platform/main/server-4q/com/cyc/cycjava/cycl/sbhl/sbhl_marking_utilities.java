/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-MARKING-UTILITIES
 * source file: /cyc/top/cycl/sbhl/sbhl-marking-utilities.lisp
 * created:     2019/07/03 17:37:26
 */
public final class sbhl_marking_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_marking_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities";


    private static final SubLObject $$weak_HL_TimePrecedence = reader_make_constant_shell("weak-HL-TimePrecedence");

    private static final SubLObject $$strict_HL_TimePrecedence = reader_make_constant_shell("strict-HL-TimePrecedence");

    private static final SubLObject $$weakSuccessor_HL_TimePrecedence = reader_make_constant_shell("weakSuccessor-HL-TimePrecedence");

    private static final SubLObject $$successorStrict_HL_TimePrecedence = reader_make_constant_shell("successorStrict-HL-TimePrecedence");

    static private final SubLString $str9$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-preds-unmarking");

    static private final SubLString $str10$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-inverse-unmarking");

    private static final SubLSymbol SBHL_MARKED_P = makeSymbol("SBHL-MARKED-P");

    private static final SubLSymbol SBHL_PREDICATE_PATH_TERMINATION_P = makeSymbol("SBHL-PREDICATE-PATH-TERMINATION-P");

    private static final SubLSymbol SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P = makeSymbol("SBHL-NODES-MARK-EXCEEDS-TEMPORAL-THRESHOLD-P");

    private static final SubLSymbol SET_SBHL_MARKING_STATE_TO_MARKED = makeSymbol("SET-SBHL-MARKING-STATE-TO-MARKED");

    private static final SubLSymbol SBHL_PREDICATE_MARKING_FN = makeSymbol("SBHL-PREDICATE-MARKING-FN");

    private static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_ZERO = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-ZERO");

    private static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_ONE = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-ONE");

    private static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_TWO = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-TWO");

    private static final SubLSymbol INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-MINUS-ONE");

    private static final SubLSymbol SET_SBHL_MARKING_STATE_TO_UNMARKED = makeSymbol("SET-SBHL-MARKING-STATE-TO-UNMARKED");

    private static final SubLSymbol GENL_PREDS_UNMARKING_FN = makeSymbol("GENL-PREDS-UNMARKING-FN");

    private static final SubLSymbol GENL_INVERSE_UNMARKING_FN = makeSymbol("GENL-INVERSE-UNMARKING-FN");

    static private final SubLString $str23$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-preds-marking");

    static private final SubLString $str24$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-inverse-marking");

    private static final SubLString $str25$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str27$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_SPACE_P = makeSymbol("SBHL-SPACE-P");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str32$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    // Definitions
    /**
     * Accessor: returns the marking state of NODE within SPACE / *sbhl-space*
     */
    @LispMethod(comment = "Accessor: returns the marking state of NODE within SPACE / *sbhl-space*")
    public static final SubLObject get_sbhl_marking_state_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return gethash_without_values(node, space, UNPROVIDED);
    }

    // Definitions
    /**
     * Accessor: returns the marking state of NODE within SPACE / *sbhl-space*
     */
    @LispMethod(comment = "Accessor: returns the marking state of NODE within SPACE / *sbhl-space*")
    public static SubLObject get_sbhl_marking_state(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return gethash_without_values(node, space, UNPROVIDED);
    }

    /**
     * Accessor: returns NODE's current marking state (usually boolean). @see get-sbhl-marking-state.
     */
    @LispMethod(comment = "Accessor: returns NODE\'s current marking state (usually boolean). @see get-sbhl-marking-state.")
    public static final SubLObject sbhl_marked_with_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.get_sbhl_marking_state(node, space);
    }

    /**
     * Accessor: returns NODE's current marking state (usually boolean). @see get-sbhl-marking-state.
     */
    @LispMethod(comment = "Accessor: returns NODE\'s current marking state (usually boolean). @see get-sbhl-marking-state.")
    public static SubLObject sbhl_marked_with(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return get_sbhl_marking_state(node, space);
    }

    /**
     * Accessor: does NODE have any non-nil marking in SPACE. @see get-sbhl-marking-state.
     */
    @LispMethod(comment = "Accessor: does NODE have any non-nil marking in SPACE. @see get-sbhl-marking-state.")
    public static final SubLObject sbhl_marked_node_p_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.get_sbhl_marking_state(node, space));
    }

    /**
     * Accessor: does NODE have any non-nil marking in SPACE. @see get-sbhl-marking-state.
     */
    @LispMethod(comment = "Accessor: does NODE have any non-nil marking in SPACE. @see get-sbhl-marking-state.")
    public static SubLObject sbhl_marked_node_p(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return list_utilities.sublisp_boolean(get_sbhl_marking_state(node, space));
    }

    /**
     * Accessor: @return booleanp; whether MARKING has a non-NIL marking state.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING has a non-NIL marking state.")
    public static final SubLObject sbhl_marked_p_alt(SubLObject marking) {
        return list_utilities.sublisp_boolean(marking);
    }

    /**
     * Accessor: @return booleanp; whether MARKING has a non-NIL marking state.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING has a non-NIL marking state.")
    public static SubLObject sbhl_marked_p(final SubLObject marking) {
        return list_utilities.sublisp_boolean(marking);
    }

    /**
     * Accessor: @return booleanp; whether MARKING has a NIL marking state.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING has a NIL marking state.")
    public static final SubLObject sbhl_unmarked_p_alt(SubLObject marking) {
        return makeBoolean(NIL == marking);
    }

    /**
     * Accessor: @return booleanp; whether MARKING has a NIL marking state.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING has a NIL marking state.")
    public static SubLObject sbhl_unmarked_p(final SubLObject marking) {
        return makeBoolean(NIL == marking);
    }

    /**
     * Accessor: @return booleanp; whether SEARCHER is a member of NODE's marking state. Expects marking state to be a list. @see mamber?
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether SEARCHER is a member of NODE\'s marking state. Expects marking state to be a list. @see mamber?")
    public static final SubLObject sbhl_marking_contains_searcherP_alt(SubLObject marking, SubLObject searcher) {
        return subl_promotions.memberP(searcher, marking, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Accessor: @return booleanp; whether SEARCHER is a member of NODE's marking state. Expects marking state to be a list. @see mamber?
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether SEARCHER is a member of NODE\'s marking state. Expects marking state to be a list. @see mamber?")
    public static SubLObject sbhl_marking_contains_searcherP(final SubLObject marking, final SubLObject searcher) {
        return subl_promotions.memberP(searcher, marking, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Accessor: @return booleanp; whether NODE's marking state contains all of SEARCHERS. Expects marking state to be a list. @see sbhl-marked-with
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE\'s marking state contains all of SEARCHERS. Expects marking state to be a list. @see sbhl-marked-with")
    public static final SubLObject sbhl_marking_contains_all_searchersP_alt(SubLObject marking, SubLObject searchers) {
        {
            SubLObject failP = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = searchers;
                    SubLObject searcher = NIL;
                    for (searcher = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , searcher = csome_list_var.first()) {
                        failP = makeBoolean(NIL == subl_promotions.memberP(searcher, marking, UNPROVIDED, UNPROVIDED));
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    /**
     * Accessor: @return booleanp; whether NODE's marking state contains all of SEARCHERS. Expects marking state to be a list. @see sbhl-marked-with
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE\'s marking state contains all of SEARCHERS. Expects marking state to be a list. @see sbhl-marked-with")
    public static SubLObject sbhl_marking_contains_all_searchersP(final SubLObject marking, final SubLObject searchers) {
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var;
            SubLObject searcher;
            for (csome_list_var = searchers, searcher = NIL, searcher = csome_list_var.first(); (NIL == failP) && (NIL != csome_list_var); failP = makeBoolean(NIL == subl_promotions.memberP(searcher, marking, UNPROVIDED, UNPROVIDED)) , csome_list_var = csome_list_var.rest() , searcher = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == failP);
    }

    /**
     * Accessor: @return integerp; the current marking module's increment for search marking.
     */
    @LispMethod(comment = "Accessor: @return integerp; the current marking module\'s increment for search marking.")
    public static final SubLObject sbhl_temporal_increment_alt() {
        return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
    }

    /**
     * Accessor: @return integerp; the current marking module's increment for search marking.
     */
    @LispMethod(comment = "Accessor: @return integerp; the current marking module\'s increment for search marking.")
    public static SubLObject sbhl_temporal_increment() {
        return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
    }

    public static final SubLObject sbhl_temporal_tag_increment_alt(SubLObject tag) {
        {
            SubLObject pcase_var = tag;
            if (pcase_var.eql($WEAK)) {
                return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence));
            } else {
                if (pcase_var.eql($STRICT)) {
                    return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$strict_HL_TimePrecedence));
                } else {
                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                        return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$weakSuccessor_HL_TimePrecedence));
                    } else {
                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                            return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$successorStrict_HL_TimePrecedence));
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject sbhl_temporal_tag_increment(final SubLObject tag) {
        if (tag.eql($WEAK)) {
            return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence));
        }
        if (tag.eql($STRICT)) {
            return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$strict_HL_TimePrecedence));
        }
        if (tag.eql($WEAK_SUCCESSOR)) {
            return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$weakSuccessor_HL_TimePrecedence));
        }
        if (tag.eql($SUCCESSOR_STRICT)) {
            return sbhl_module_utilities.get_sbhl_module_marking_increment(sbhl_module_vars.get_sbhl_module($$successorStrict_HL_TimePrecedence));
        }
        return NIL;
    }

    /**
     * Accessor: @return booleanp; determines if NODE's marking is non-negative.
     */
    @LispMethod(comment = "Accessor: @return booleanp; determines if NODE\'s marking is non-negative.")
    public static final SubLObject sbhl_nodes_marking_non_negative_p_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return makeBoolean(!com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space).isNegative());
    }

    /**
     * Accessor: @return booleanp; determines if NODE's marking is non-negative.
     */
    @LispMethod(comment = "Accessor: @return booleanp; determines if NODE\'s marking is non-negative.")
    public static SubLObject sbhl_nodes_marking_non_negative_p(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return number_utilities.non_negative_number_p(sbhl_marked_with(node, space));
    }

    /**
     * Accessor: @return booleanp; whether MARKING exceeds the new marking (sum of parent marking and temporal increment) or the succession depth threshold.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING exceeds the new marking (sum of parent marking and temporal increment) or the succession depth threshold.")
    public static final SubLObject sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p_alt(SubLObject marking) {
        return list_utilities.sublisp_boolean(marking);
    }

    /**
     * Accessor: @return booleanp; whether MARKING exceeds the new marking (sum of parent marking and temporal increment) or the succession depth threshold.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING exceeds the new marking (sum of parent marking and temporal increment) or the succession depth threshold.")
    public static SubLObject sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p(final SubLObject marking) {
        return list_utilities.sublisp_boolean(marking);
    }

    /**
     * Accessor: @return booleanp; whether NODE is already marked sufficiently.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is already marked sufficiently.")
    public static final SubLObject sbhl_nodes_mark_exceeds_temporal_threshold_p_alt(SubLObject node) {
        if (NIL != sbhl_marking_vars.sbhl_temporality_search_checks_nodes_in_target_space_p()) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_temporality_path_termination_for_searching_marked_nodes_p(node);
        } else {
            return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p(com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED));
        }
    }

    /**
     * Accessor: @return booleanp; whether NODE is already marked sufficiently.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is already marked sufficiently.")
    public static SubLObject sbhl_nodes_mark_exceeds_temporal_threshold_p(final SubLObject node) {
        if (NIL != sbhl_marking_vars.sbhl_temporality_search_checks_nodes_in_target_space_p()) {
            return sbhl_temporality_path_termination_for_searching_marked_nodes_p(node);
        }
        return sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p(sbhl_marked_with(node, UNPROVIDED));
    }

    /**
     * Accessor: @return booleanp; whether NODE is marked in target space and @see sbhl-current-marking-exceeds-pending-marking-or-marking-threshold-p.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is marked in target space and @see sbhl-current-marking-exceeds-pending-marking-or-marking-threshold-p.")
    public static final SubLObject sbhl_temporality_path_termination_for_searching_marked_nodes_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL == com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread))) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p(com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED))));
        }
    }

    /**
     * Accessor: @return booleanp; whether NODE is marked in target space and @see sbhl-current-marking-exceeds-pending-marking-or-marking-threshold-p.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is marked in target space and @see sbhl-current-marking-exceeds-pending-marking-or-marking-threshold-p.")
    public static SubLObject sbhl_temporality_path_termination_for_searching_marked_nodes_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == sbhl_marked_with(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread))) || (NIL != sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p(sbhl_marked_with(node, UNPROVIDED))));
    }

    /**
     * Accessor: @return booleanp; whether the current node has been considered or not.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the current node has been considered or not.")
    public static final SubLObject sbhl_current_temporal_node_not_yet_considered_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_search_vars.get_sbhl_nodes_previous_marking()) {
                return minusp(sbhl_search_vars.$sbhl_nodes_previous_marking$.getDynamicValue(thread));
            } else {
                return T;
            }
        }
    }

    /**
     * Accessor: @return booleanp; whether the current node has been considered or not.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the current node has been considered or not.")
    public static SubLObject sbhl_current_temporal_node_not_yet_considered_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_vars.get_sbhl_nodes_previous_marking()) {
            return minusp(sbhl_search_vars.$sbhl_nodes_previous_marking$.getDynamicValue(thread));
        }
        return T;
    }

    /**
     * Accessor: @return booleanp; whether MARKING indicates path termination for predicate search
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING indicates path termination for predicate search")
    public static final SubLObject sbhl_predicate_path_termination_p_alt(SubLObject marking) {
        return NIL != sbhl_search_vars.genl_inverse_mode_p() ? ((SubLObject) (makeBoolean((NIL != sbhl_marking_vars.genl_inverse_marking_p(marking)) || (NIL != sbhl_marking_vars.genl_preds_and_genl_inverse_marking_p(marking))))) : makeBoolean((NIL != sbhl_marking_vars.genl_preds_marking_p(marking)) || (NIL != sbhl_marking_vars.genl_preds_and_genl_inverse_marking_p(marking)));
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING indicates path termination for predicate search")
    public static SubLObject sbhl_predicate_path_termination_p(final SubLObject marking) {
        return NIL != sbhl_search_vars.genl_inverse_mode_p() ? makeBoolean((NIL != sbhl_marking_vars.genl_inverse_marking_p(marking)) || (NIL != sbhl_marking_vars.genl_preds_and_genl_inverse_marking_p(marking))) : makeBoolean((NIL != sbhl_marking_vars.genl_preds_marking_p(marking)) || (NIL != sbhl_marking_vars.genl_preds_and_genl_inverse_marking_p(marking)));
    }

    /**
     * Modifier: sets the hash slot for NODE in SPACE / *sbhl-space* to VALUE
     */
    @LispMethod(comment = "Modifier: sets the hash slot for NODE in SPACE / *sbhl-space* to VALUE")
    public static final SubLObject set_sbhl_marking_state_alt(SubLObject node, SubLObject value, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        sethash(node, space, value);
        return NIL;
    }

    @LispMethod(comment = "Modifier: sets the hash slot for NODE in SPACE / *sbhl-space* to VALUE")
    public static SubLObject set_sbhl_marking_state(final SubLObject node, final SubLObject value, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        sethash(node, space, value);
        return NIL;
    }

    /**
     * Modifier: sets the hash slot for NODE in *sbhl-space* / SPACE to t. @see set-sbhl-marking-state
     */
    @LispMethod(comment = "Modifier: sets the hash slot for NODE in *sbhl-space* / SPACE to t. @see set-sbhl-marking-state")
    public static final SubLObject set_sbhl_marking_state_to_marked_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, T, space);
        return NIL;
    }

    @LispMethod(comment = "Modifier: sets the hash slot for NODE in *sbhl-space* / SPACE to t. @see set-sbhl-marking-state")
    public static SubLObject set_sbhl_marking_state_to_marked(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        set_sbhl_marking_state(node, T, space);
        return NIL;
    }

    /**
     * Modifier: sets the hash slot for NODE in *sbhl-space* to nil @see set-sbhl-marking-state
     */
    @LispMethod(comment = "Modifier: sets the hash slot for NODE in *sbhl-space* to nil @see set-sbhl-marking-state")
    public static final SubLObject set_sbhl_marking_state_to_unmarked_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, NIL, space);
        return NIL;
    }

    @LispMethod(comment = "Modifier: sets the hash slot for NODE in *sbhl-space* to nil @see set-sbhl-marking-state")
    public static SubLObject set_sbhl_marking_state_to_unmarked(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        set_sbhl_marking_state(node, NIL, space);
        return NIL;
    }

    /**
     * Modifier: for simply marking NODE. @see set-sbhl-marking-state-to-marked.
     */
    @LispMethod(comment = "Modifier: for simply marking NODE. @see set-sbhl-marking-state-to-marked.")
    public static final SubLObject sbhl_mark_node_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state_to_marked(node, space);
    }

    @LispMethod(comment = "Modifier: for simply marking NODE. @see set-sbhl-marking-state-to-marked.")
    public static SubLObject sbhl_mark_node(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return set_sbhl_marking_state_to_marked(node, space);
    }

    /**
     * Modifier: adjoins MARKING to marking state of NODE. @see set-sbhl-marking-state
     */
    @LispMethod(comment = "Modifier: adjoins MARKING to marking state of NODE. @see set-sbhl-marking-state")
    public static final SubLObject adjoin_to_sbhl_marking_state_alt(SubLObject node, SubLObject marking, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject marked_withP = com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.get_sbhl_marking_state(node, space);
            SubLObject new_marking = adjoin(marked_withP, list(marking), UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, new_marking, space);
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: adjoins MARKING to marking state of NODE. @see set-sbhl-marking-state")
    public static SubLObject adjoin_to_sbhl_marking_state(final SubLObject node, final SubLObject marking, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject marked_withP = get_sbhl_marking_state(node, space);
        final SubLObject new_marking = adjoin(marked_withP, list(marking), UNPROVIDED, UNPROVIDED);
        set_sbhl_marking_state(node, new_marking, space);
        return NIL;
    }

    /**
     * Modifier: adjoins MARKING to marking state of NODE. @see set-sbhl-marking-state
     */
    @LispMethod(comment = "Modifier: adjoins MARKING to marking state of NODE. @see set-sbhl-marking-state")
    public static final SubLObject prepend_to_sbhl_marking_state_alt(SubLObject node, SubLObject marking, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        hash_table_utilities.push_hash(node, marking, space);
        return NIL;
    }

    @LispMethod(comment = "Modifier: adjoins MARKING to marking state of NODE. @see set-sbhl-marking-state")
    public static SubLObject prepend_to_sbhl_marking_state(final SubLObject node, final SubLObject marking, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        hash_table_utilities.push_hash(node, marking, space);
        return NIL;
    }

    /**
     * Modifier: removes MARKING from marking state of NODE. @see set-sbhl-marking-state
     */
    @LispMethod(comment = "Modifier: removes MARKING from marking state of NODE. @see set-sbhl-marking-state")
    public static final SubLObject remove_from_sbhl_marking_state_alt(SubLObject node, SubLObject marking, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject marked_withP = com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.get_sbhl_marking_state(node, space);
            SubLObject new_marking = remove(marking, marked_withP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, new_marking, space);
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: removes MARKING from marking state of NODE. @see set-sbhl-marking-state")
    public static SubLObject remove_from_sbhl_marking_state(final SubLObject node, final SubLObject marking, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject marked_withP = get_sbhl_marking_state(node, space);
        final SubLObject new_marking = remove(marking, marked_withP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        set_sbhl_marking_state(node, new_marking, space);
        return NIL;
    }

    public static SubLObject node_unmarked_completely_in_sbhl_marking_stateP(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return sublisp_null(get_sbhl_marking_state(node, space));
    }

    public static SubLObject prune_unmarked_node_from_sbhl_marking_state(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return remhash(node, space);
    }

    /**
     * Modifier: increments marking state of NODE by INCREMENT. if NIL state, sets state to INCREMENT
     */
    @LispMethod(comment = "Modifier: increments marking state of NODE by INCREMENT. if NIL state, sets state to INCREMENT")
    public static final SubLObject increment_sbhl_marking_state_alt(SubLObject node, SubLObject increment, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parent_marking = sbhl_search_vars.get_sbhl_search_parent_marking();
                SubLObject marking = (NIL != parent_marking) ? ((SubLObject) (parent_marking)) : sbhl_time_vars.$sbhl_temporality_succession_depth$.getDynamicValue(thread);
                SubLObject new_marking = add(increment, marking);
                sbhl_search_vars.$sbhl_nodes_previous_marking$.setDynamicValue(com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.get_sbhl_marking_state(node, UNPROVIDED), thread);
                sbhl_search_vars.$sbhl_search_parent_marking$.setDynamicValue(new_marking, thread);
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, new_marking, space);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier: increments marking state of NODE by INCREMENT. if NIL state, sets state to INCREMENT")
    public static SubLObject increment_sbhl_marking_state(final SubLObject node, final SubLObject increment, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject parent_marking = sbhl_search_vars.get_sbhl_search_parent_marking();
        final SubLObject marking = (NIL != parent_marking) ? parent_marking : sbhl_time_vars.$sbhl_temporality_succession_depth$.getDynamicValue(thread);
        final SubLObject new_marking = add(increment, marking);
        sbhl_search_vars.$sbhl_nodes_previous_marking$.setDynamicValue(get_sbhl_marking_state(node, UNPROVIDED), thread);
        sbhl_search_vars.$sbhl_search_parent_marking$.setDynamicValue(new_marking, thread);
        set_sbhl_marking_state(node, new_marking, space);
        return NIL;
    }

    public static final SubLObject increment_sbhl_marking_state_by_zero_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.increment_sbhl_marking_state(node, ZERO_INTEGER, space);
        return NIL;
    }

    public static SubLObject increment_sbhl_marking_state_by_zero(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        increment_sbhl_marking_state(node, ZERO_INTEGER, space);
        return NIL;
    }

    public static final SubLObject increment_sbhl_marking_state_by_minus_one_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.increment_sbhl_marking_state(node, MINUS_ONE_INTEGER, space);
        return NIL;
    }

    public static SubLObject increment_sbhl_marking_state_by_minus_one(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        increment_sbhl_marking_state(node, MINUS_ONE_INTEGER, space);
        return NIL;
    }

    public static final SubLObject increment_sbhl_marking_state_by_one_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.increment_sbhl_marking_state(node, ONE_INTEGER, space);
        return NIL;
    }

    public static SubLObject increment_sbhl_marking_state_by_one(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        increment_sbhl_marking_state(node, ONE_INTEGER, space);
        return NIL;
    }

    public static final SubLObject increment_sbhl_marking_state_by_two_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.increment_sbhl_marking_state(node, TWO_INTEGER, space);
        return NIL;
    }

    public static SubLObject increment_sbhl_marking_state_by_two(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        increment_sbhl_marking_state(node, TWO_INTEGER, space);
        return NIL;
    }

    public static final SubLObject set_sbhl_marking_state_to_zero_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, ZERO_INTEGER, space);
        return NIL;
    }

    public static SubLObject set_sbhl_marking_state_to_zero(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        set_sbhl_marking_state(node, ZERO_INTEGER, space);
        return NIL;
    }

    public static final SubLObject set_sbhl_marking_state_to_depth_alt(SubLObject node, SubLObject depth, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(depth, NUMBERP);
        com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, depth, space);
        return NIL;
    }

    public static SubLObject set_sbhl_marking_state_to_depth(final SubLObject node, final SubLObject depth, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        assert NIL != numberp(depth) : "! numberp(depth) " + ("Types.numberp(depth) " + "CommonSymbols.NIL != Types.numberp(depth) ") + depth;
        set_sbhl_marking_state(node, depth, space);
        return NIL;
    }

    public static final SubLObject sbhl_node_marking_greater_than_depth_p_alt(SubLObject node, SubLObject depth, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(depth, NUMBERP);
        {
            SubLObject node_depth = com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.get_sbhl_marking_state(node, space);
            SubLObject result = NIL;
            if (NIL != node_depth) {
                SubLTrampolineFile.checkType(node_depth, NUMBERP);
                result = numL(depth, node_depth);
            }
            return result;
        }
    }

    public static SubLObject sbhl_node_marking_greater_than_depth_p(final SubLObject node, final SubLObject depth, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        assert NIL != numberp(depth) : "! numberp(depth) " + ("Types.numberp(depth) " + "CommonSymbols.NIL != Types.numberp(depth) ") + depth;
        final SubLObject node_depth = get_sbhl_marking_state(node, space);
        SubLObject result = NIL;
        if (NIL != node_depth) {
            assert NIL != numberp(node_depth) : "! numberp(node_depth) " + ("Types.numberp(node_depth) " + "CommonSymbols.NIL != Types.numberp(node_depth) ") + node_depth;
            result = numL(depth, node_depth);
        }
        return result;
    }

    /**
     * Modifier: adds either #$genlPreds or #$genlInverse to NODE's marking, depending on @see genl-inverse-mode-p
     */
    @LispMethod(comment = "Modifier: adds either #$genlPreds or #$genlInverse to NODE\'s marking, depending on @see genl-inverse-mode-p")
    public static final SubLObject sbhl_predicate_marking_fn_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.genl_inverse_marking_fn(node, space);
        } else {
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.genl_preds_marking_fn(node, space);
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: adds either #$genlPreds or #$genlInverse to NODE\'s marking, depending on @see genl-inverse-mode-p")
    public static SubLObject sbhl_predicate_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            genl_inverse_marking_fn(node, space);
        } else {
            genl_preds_marking_fn(node, space);
        }
        return NIL;
    }

    /**
     * Modifier: adds #$genlPreds to NODE's marking.
     */
    @LispMethod(comment = "Modifier: adds #$genlPreds to NODE\'s marking.")
    public static final SubLObject genl_preds_marking_fn_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject current_marking = com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space);
            if (NIL == current_marking) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue(), space);
            } else {
                if (current_marking == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue(), space);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: adds #$genlPreds to NODE\'s marking.")
    public static SubLObject genl_preds_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = sbhl_marked_with(node, space);
        if (NIL == current_marking) {
            set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue(), space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue(), space);
            }

        return NIL;
    }

    /**
     * Modifier: adds #$genlInverse to NODE's marking.
     */
    @LispMethod(comment = "Modifier: adds #$genlInverse to NODE\'s marking.")
    public static final SubLObject genl_inverse_marking_fn_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject current_marking = com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
            if (NIL == current_marking) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue(), space);
            } else {
                if (current_marking == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue(), space);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: adds #$genlInverse to NODE\'s marking.")
    public static SubLObject genl_inverse_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = sbhl_marked_with(node, UNPROVIDED);
        if (NIL == current_marking) {
            set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue(), space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue(), space);
            }

        return NIL;
    }

    /**
     * Modifier: removes either #$genlPreds or #$genlInverse from NODE's marking, depending on @see genl-inverse-mode-p
     */
    @LispMethod(comment = "Modifier: removes either #$genlPreds or #$genlInverse from NODE\'s marking, depending on @see genl-inverse-mode-p")
    public static final SubLObject sbhl_predicate_unmarking_fn_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.genl_inverse_unmarking_fn(node, space);
        } else {
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.genl_preds_unmarking_fn(node, space);
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: removes either #$genlPreds or #$genlInverse from NODE\'s marking, depending on @see genl-inverse-mode-p")
    public static SubLObject sbhl_predicate_unmarking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            genl_inverse_unmarking_fn(node, space);
        } else {
            genl_preds_unmarking_fn(node, space);
        }
        return NIL;
    }

    /**
     * Modifier: removes #$genlPreds from NODE's marking.
     */
    @LispMethod(comment = "Modifier: removes #$genlPreds from NODE\'s marking.")
    public static final SubLObject genl_preds_unmarking_fn_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject current_marking = com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
            if (current_marking == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, NIL, space);
            } else {
                if (current_marking == sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue(), space);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt9$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     * Modifier: removes #$genlPreds from NODE's marking.
     */
    @LispMethod(comment = "Modifier: removes #$genlPreds from NODE\'s marking.")
    public static SubLObject genl_preds_unmarking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = sbhl_marked_with(node, UNPROVIDED);
        if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
            set_sbhl_marking_state(node, NIL, space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue(), space);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str9$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    /**
     * Modifier: removes #$genlInverse from NODE's marking.
     */
    @LispMethod(comment = "Modifier: removes #$genlInverse from NODE\'s marking.")
    public static final SubLObject genl_inverse_unmarking_fn_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject current_marking = com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
            if (current_marking == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, NIL, space);
            } else {
                if (current_marking == sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue(), space);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt10$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: removes #$genlInverse from NODE\'s marking.")
    public static SubLObject genl_inverse_unmarking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = sbhl_marked_with(node, UNPROVIDED);
        if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
            set_sbhl_marking_state(node, NIL, space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue(), space);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str10$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }/**
     * Modifier: removes #$genlInverse from NODE's marking.
     */


    /**
     * Used in boolean searches that save marking information from search to search. Used therein to indicate nodes which will lead to a goal node.
     */
    @LispMethod(comment = "Used in boolean searches that save marking information from search to search. Used therein to indicate nodes which will lead to a goal node.")
    public static final SubLObject sbhl_mark_node_in_precompute_space_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_marked(node, sbhl_search_vars.$sbhl_precomputed_goal_space$.getDynamicValue(thread));
            return NIL;
        }
    }

    @LispMethod(comment = "Used in boolean searches that save marking information from search to search. Used therein to indicate nodes which will lead to a goal node.")
    public static SubLObject sbhl_mark_node_in_precompute_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_mark_node_marked(node, sbhl_search_vars.$sbhl_precomputed_goal_space$.getDynamicValue(thread));
        return NIL;
    }/**
     * Used in boolean searches that save marking information from search to search. Used therein to indicate nodes which will lead to a goal node.
     */


    /**
     * Used in boolean searches that save marking information from search to search. Used therein to return whether NODE has been marked as a node which leads to a goal.
     */
    @LispMethod(comment = "Used in boolean searches that save marking information from search to search. Used therein to return whether NODE has been marked as a node which leads to a goal.")
    public static final SubLObject sbhl_node_marked_precompute_goal_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_path_terminating_mark_p(node, sbhl_search_vars.$sbhl_precomputed_goal_space$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Used in boolean searches that save marking information from search to search. Used therein to return whether NODE has been marked as a node which leads to a goal.")
    public static SubLObject sbhl_node_marked_precompute_goal_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_path_terminating_mark_p(node, sbhl_search_vars.$sbhl_precomputed_goal_space$.getDynamicValue(thread));
    }/**
     * Used in boolean searches that save marking information from search to search. Used therein to return whether NODE has been marked as a node which leads to a goal.
     */


    public static final SubLObject set_sbhl_boolean_precompute_goal_conditions_alt(SubLObject node) {
        sbhl_search_utilities.set_sbhl_boolean_goal_conditions();
        sbhl_search_vars.$sbhl_result$.setDynamicValue(node);
        return NIL;
    }

    public static SubLObject set_sbhl_boolean_precompute_goal_conditions(final SubLObject node) {
        sbhl_search_utilities.set_sbhl_boolean_goal_conditions();
        sbhl_search_vars.$sbhl_result$.setDynamicValue(node);
        return NIL;
    }

    /**
     * Accessor: applies *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p
     */
    @LispMethod(comment = "Accessor: applies *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p")
    public static final SubLObject sbhl_search_path_termination_p_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (NIL != sbhl_search_vars.sbhl_check_for_goal_marking_p()) {
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_node_marked_precompute_goal_p(node)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_boolean_precompute_goal_conditions(node);
                return T;
            }
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_path_terminating_mark_p(node, space);
    }

    @LispMethod(comment = "Accessor: applies *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p")
    public static SubLObject sbhl_search_path_termination_p(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if ((NIL != sbhl_search_vars.sbhl_check_for_goal_marking_p()) && (NIL != sbhl_node_marked_precompute_goal_p(node))) {
            set_sbhl_boolean_precompute_goal_conditions(node);
            return T;
        }
        return sbhl_path_terminating_mark_p(node, space);
    }/**
     * Accessor: applies *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p
     */


    /**
     * Accessor: applies *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p
     */
    @LispMethod(comment = "Accessor: applies *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p")
    public static final SubLObject sbhl_path_terminating_mark_p_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject path_terminating_markP_fn = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject pcase_var = path_terminating_markP_fn;
            if (pcase_var.eql(SBHL_MARKED_P)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_p(com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space));
            } else {
                if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_predicate_path_termination_p(com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space));
                } else {
                    if (pcase_var.eql(SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_nodes_mark_exceeds_temporal_threshold_p(node);
                    } else {
                        return funcall(path_terminating_markP_fn, node);
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Accessor: applies *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p")
    public static SubLObject sbhl_path_terminating_mark_p(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject path_terminating_markP_fn = pcase_var = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SBHL_MARKED_P)) {
            return sbhl_marked_p(sbhl_marked_with(node, space));
        }
        if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
            return sbhl_predicate_path_termination_p(sbhl_marked_with(node, space));
        }
        if (pcase_var.eql(SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P)) {
            return sbhl_nodes_mark_exceeds_temporal_threshold_p(node);
        }
        return funcall(path_terminating_markP_fn, node);
    }/**
     * Accessor: applies *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p
     */


    /**
     * Accessor: applies to MARKING the *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn.
     */
    @LispMethod(comment = "Accessor: applies to MARKING the *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn.")
    public static final SubLObject sbhl_path_termination_marking_p_alt(SubLObject marking) {
        {
            SubLObject path_terminating_markP_fn = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject pcase_var = path_terminating_markP_fn;
            if (pcase_var.eql(SBHL_MARKED_P)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_p(marking);
            } else {
                if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_predicate_path_termination_p(marking);
                } else {
                    return funcall(path_terminating_markP_fn, marking);
                }
            }
        }
    }

    @LispMethod(comment = "Accessor: applies to MARKING the *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn.")
    public static SubLObject sbhl_path_termination_marking_p(final SubLObject marking) {
        final SubLObject pcase_var;
        final SubLObject path_terminating_markP_fn = pcase_var = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SBHL_MARKED_P)) {
            return sbhl_marked_p(marking);
        }
        if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
            return sbhl_predicate_path_termination_p(marking);
        }
        return funcall(path_terminating_markP_fn, marking);
    }/**
     * Accessor: applies to MARKING the *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn.
     */


    /**
     * Accessor: applies *sbhl-module* defined path-termination-function to NODE's marking within terminating space, @see get-sbhl-termingating-marking-space.
     */
    @LispMethod(comment = "Accessor: applies *sbhl-module* defined path-termination-function to NODE\'s marking within terminating space, @see get-sbhl-termingating-marking-space.")
    public static final SubLObject sbhl_marked_in_terminating_space_p_alt(SubLObject node) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_search_path_termination_p(node, sbhl_marking_vars.get_sbhl_terminating_marking_space());
    }

    @LispMethod(comment = "Accessor: applies *sbhl-module* defined path-termination-function to NODE\'s marking within terminating space, @see get-sbhl-termingating-marking-space.")
    public static SubLObject sbhl_marked_in_terminating_space_p(final SubLObject node) {
        return sbhl_search_path_termination_p(node, sbhl_marking_vars.get_sbhl_terminating_marking_space());
    }/**
     * Accessor: applies *sbhl-module* defined path-termination-function to NODE's marking within terminating space, @see get-sbhl-termingating-marking-space.
     */


    /**
     * Accessor: applies *sbhl-module* defined path-termination-function to NODE's marking within target space, @see *sbhl-target-space*
     */
    @LispMethod(comment = "Accessor: applies *sbhl-module* defined path-termination-function to NODE\'s marking within target space, @see *sbhl-target-space*")
    public static final SubLObject sbhl_marked_in_target_space_p_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_search_path_termination_p(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Accessor: applies *sbhl-module* defined path-termination-function to NODE\'s marking within target space, @see *sbhl-target-space*")
    public static SubLObject sbhl_marked_in_target_space_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_path_termination_p(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
    }/**
     * Accessor: applies *sbhl-module* defined path-termination-function to NODE's marking within target space, @see *sbhl-target-space*
     */


    /**
     * Modifier: applies *sbhl-module* defined marking fn, @see get-sbhl-marking-fn. Relies on current context of *sbhl-space*, and gets search node from SEARCH-STATE as necessary (@see set-sbhl-marking-state-to-marked).
     */
    @LispMethod(comment = "Modifier: applies *sbhl-module* defined marking fn, @see get-sbhl-marking-fn. Relies on current context of *sbhl-space*, and gets search node from SEARCH-STATE as necessary (@see set-sbhl-marking-state-to-marked).")
    public static final SubLObject sbhl_mark_node_marked_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject marking_fn = sbhl_module_utilities.get_sbhl_marking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject pcase_var = marking_fn;
            if (pcase_var.eql(SET_SBHL_MARKING_STATE_TO_MARKED)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state_to_marked(node, space);
            } else {
                if (pcase_var.eql(SBHL_PREDICATE_MARKING_FN)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_predicate_marking_fn(node, space);
                } else {
                    if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_ZERO)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.increment_sbhl_marking_state_by_zero(node, space);
                    } else {
                        if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_ONE)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.increment_sbhl_marking_state_by_one(node, space);
                        } else {
                            if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_TWO)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.increment_sbhl_marking_state_by_two(node, space);
                            } else {
                                if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.increment_sbhl_marking_state_by_minus_one(node, space);
                                } else {
                                    funcall(marking_fn, node);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: applies *sbhl-module* defined marking fn, @see get-sbhl-marking-fn. Relies on current context of *sbhl-space*, and gets search node from SEARCH-STATE as necessary (@see set-sbhl-marking-state-to-marked).")
    public static SubLObject sbhl_mark_node_marked(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject marking_fn = pcase_var = sbhl_module_utilities.get_sbhl_marking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SET_SBHL_MARKING_STATE_TO_MARKED)) {
            set_sbhl_marking_state_to_marked(node, space);
        } else
            if (pcase_var.eql(SBHL_PREDICATE_MARKING_FN)) {
                sbhl_predicate_marking_fn(node, space);
            } else
                if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_ZERO)) {
                    increment_sbhl_marking_state_by_zero(node, space);
                } else
                    if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_ONE)) {
                        increment_sbhl_marking_state_by_one(node, space);
                    } else
                        if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_TWO)) {
                            increment_sbhl_marking_state_by_two(node, space);
                        } else
                            if (pcase_var.eql(INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE)) {
                                increment_sbhl_marking_state_by_minus_one(node, space);
                            } else {
                                funcall(marking_fn, node);
                            }





        return NIL;
    }/**
     * Modifier: applies *sbhl-module* defined marking fn, @see get-sbhl-marking-fn. Relies on current context of *sbhl-space*, and gets search node from SEARCH-STATE as necessary (@see set-sbhl-marking-state-to-marked).
     */


    /**
     * Modifier: applies *sbhl-module* defined unmarking fn, @see get-sbhl-unmarking-fn. Relies on current context of *sbhl-space*, and gets search node from SEARCH-STATE as necessary (@see set-sbhl-marking-state-to-unmarked).
     */
    @LispMethod(comment = "Modifier: applies *sbhl-module* defined unmarking fn, @see get-sbhl-unmarking-fn. Relies on current context of *sbhl-space*, and gets search node from SEARCH-STATE as necessary (@see set-sbhl-marking-state-to-unmarked).")
    public static final SubLObject sbhl_mark_node_unmarked_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject unmarking_fn = sbhl_module_utilities.get_sbhl_unmarking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject pcase_var = unmarking_fn;
            if (pcase_var.eql(SET_SBHL_MARKING_STATE_TO_UNMARKED)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state_to_unmarked(node, space);
            } else {
                if (pcase_var.eql(GENL_PREDS_UNMARKING_FN)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.genl_preds_unmarking_fn(node, space);
                } else {
                    if (pcase_var.eql(GENL_INVERSE_UNMARKING_FN)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.genl_inverse_unmarking_fn(node, space);
                    } else {
                        funcall(unmarking_fn, node);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: applies *sbhl-module* defined unmarking fn, @see get-sbhl-unmarking-fn. Relies on current context of *sbhl-space*, and gets search node from SEARCH-STATE as necessary (@see set-sbhl-marking-state-to-unmarked).")
    public static SubLObject sbhl_mark_node_unmarked(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject unmarking_fn = pcase_var = sbhl_module_utilities.get_sbhl_unmarking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SET_SBHL_MARKING_STATE_TO_UNMARKED)) {
            set_sbhl_marking_state_to_unmarked(node, space);
        } else
            if (pcase_var.eql(GENL_PREDS_UNMARKING_FN)) {
                genl_preds_unmarking_fn(node, space);
            } else
                if (pcase_var.eql(GENL_INVERSE_UNMARKING_FN)) {
                    genl_inverse_unmarking_fn(node, space);
                } else {
                    funcall(unmarking_fn, node);
                }


        return NIL;
    }/**
     * Modifier: applies *sbhl-module* defined unmarking fn, @see get-sbhl-unmarking-fn. Relies on current context of *sbhl-space*, and gets search node from SEARCH-STATE as necessary (@see set-sbhl-marking-state-to-unmarked).
     */


    /**
     * Used for some mapping. marks NODE in *sbhl-target-space*. @see sbhl-mark-node-marked.
     */
    @LispMethod(comment = "Used for some mapping. marks NODE in *sbhl-target-space*. @see sbhl-mark-node-marked.")
    public static final SubLObject sbhl_mark_in_target_space_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
            return NIL;
        }
    }

    @LispMethod(comment = "Used for some mapping. marks NODE in *sbhl-target-space*. @see sbhl-mark-node-marked.")
    public static SubLObject sbhl_mark_in_target_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
        return NIL;
    }/**
     * Used for some mapping. marks NODE in *sbhl-target-space*. @see sbhl-mark-node-marked.
     */


    /**
     * Used for some mapping. marks NODE in *sbhl-target-gather-space*. @see sbhl-mark-node-marked.
     */
    @LispMethod(comment = "Used for some mapping. marks NODE in *sbhl-target-gather-space*. @see sbhl-mark-node-marked.")
    public static final SubLObject sbhl_mark_in_target_gather_space_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
            return NIL;
        }
    }

    @LispMethod(comment = "Used for some mapping. marks NODE in *sbhl-target-gather-space*. @see sbhl-mark-node-marked.")
    public static SubLObject sbhl_mark_in_target_gather_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
        return NIL;
    }/**
     * Used for some mapping. marks NODE in *sbhl-target-gather-space*. @see sbhl-mark-node-marked.
     */


    /**
     * Used for some mapping. marks NODE in *sbhl-apply-marking-space*. @see sbhl-mark-node-marked.
     */
    @LispMethod(comment = "Used for some mapping. marks NODE in *sbhl-apply-marking-space*. @see sbhl-mark-node-marked.")
    public static final SubLObject sbhl_apply_mark_in_space_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_apply_marking_space$.getDynamicValue(thread));
            return NIL;
        }
    }

    @LispMethod(comment = "Used for some mapping. marks NODE in *sbhl-apply-marking-space*. @see sbhl-mark-node-marked.")
    public static SubLObject sbhl_apply_mark_in_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_apply_marking_space$.getDynamicValue(thread));
        return NIL;
    }/**
     * Used for some mapping. marks NODE in *sbhl-apply-marking-space*. @see sbhl-mark-node-marked.
     */


    /**
     * Used for some mapping. unmarks NODE in *sbhl-apply-marking-space*. @see sbhl-mark-node-unmarked.
     */
    @LispMethod(comment = "Used for some mapping. unmarks NODE in *sbhl-apply-marking-space*. @see sbhl-mark-node-unmarked.")
    public static final SubLObject sbhl_apply_unmark_in_space_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_unmarked(node, sbhl_marking_vars.$sbhl_apply_marking_space$.getDynamicValue(thread));
            return NIL;
        }
    }

    @LispMethod(comment = "Used for some mapping. unmarks NODE in *sbhl-apply-marking-space*. @see sbhl-mark-node-unmarked.")
    public static SubLObject sbhl_apply_unmark_in_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_mark_node_unmarked(node, sbhl_marking_vars.$sbhl_apply_marking_space$.getDynamicValue(thread));
        return NIL;
    }/**
     * Used for some mapping. unmarks NODE in *sbhl-apply-marking-space*. @see sbhl-mark-node-unmarked.
     */


    /**
     * Accessor: applies *sbhl-module* defined path termination determining fn to the marking of node. Takes into account the storage of generational information. @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p
     */
    @LispMethod(comment = "Accessor: applies *sbhl-module* defined path termination determining fn to the marking of node. Takes into account the storage of generational information. @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p")
    public static final SubLObject sbhl_generational_search_path_termination_p_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject path_terminating_markP_fn = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject pcase_var = path_terminating_markP_fn;
            if (pcase_var.eql(SBHL_MARKED_P)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_p(com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space));
            } else {
                if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_predicate_path_termination_p(second(com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space)));
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Accessor: applies *sbhl-module* defined path termination determining fn to the marking of node. Takes into account the storage of generational information. @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p")
    public static SubLObject sbhl_generational_search_path_termination_p(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject path_terminating_markP_fn = pcase_var = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SBHL_MARKED_P)) {
            return sbhl_marked_p(sbhl_marked_with(node, space));
        }
        if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
            return sbhl_predicate_path_termination_p(second(sbhl_marked_with(node, space)));
        }
        return NIL;
    }/**
     * Accessor: applies *sbhl-module* defined path termination determining fn to the marking of node. Takes into account the storage of generational information. @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p
     */


    /**
     * Accessor: returns the marking generation for NODE within SPACE.
     */
    @LispMethod(comment = "Accessor: returns the marking generation for NODE within SPACE.")
    public static final SubLObject sbhl_marking_generation_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject path_terminating_markP_fn = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject pcase_var = path_terminating_markP_fn;
            if (pcase_var.eql(SBHL_MARKED_P)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space);
            } else {
                if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space).first();
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Accessor: returns the marking generation for NODE within SPACE.")
    public static SubLObject sbhl_marking_generation(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject path_terminating_markP_fn = pcase_var = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SBHL_MARKED_P)) {
            return sbhl_marked_with(node, space);
        }
        if (pcase_var.eql(SBHL_PREDICATE_PATH_TERMINATION_P)) {
            return sbhl_marked_with(node, space).first();
        }
        return NIL;
    }/**
     * Accessor: returns the marking generation for NODE within SPACE.
     */


    /**
     * Marks NODE in SPACE, with current generation noted within the marking.
     */
    @LispMethod(comment = "Marks NODE in SPACE, with current generation noted within the marking.")
    public static final SubLObject sbhl_generational_mark_node_marked_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject marking_fn = sbhl_module_utilities.get_sbhl_marking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject pcase_var = marking_fn;
            if (pcase_var.eql(SET_SBHL_MARKING_STATE_TO_MARKED)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, sbhl_marking_vars.get_sbhl_marking_generation(), space);
            } else {
                if (pcase_var.eql(SBHL_PREDICATE_MARKING_FN)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_generational_predicate_marking_fn(node, space);
                } else {
                    funcall(marking_fn, node);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Marks NODE in SPACE, with current generation noted within the marking.")
    public static SubLObject sbhl_generational_mark_node_marked(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject marking_fn = pcase_var = sbhl_module_utilities.get_sbhl_marking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        if (pcase_var.eql(SET_SBHL_MARKING_STATE_TO_MARKED)) {
            set_sbhl_marking_state(node, sbhl_marking_vars.get_sbhl_marking_generation(), space);
        } else
            if (pcase_var.eql(SBHL_PREDICATE_MARKING_FN)) {
                sbhl_generational_predicate_marking_fn(node, space);
            } else {
                funcall(marking_fn, node);
            }

        return NIL;
    }/**
     * Marks NODE in SPACE, with current generation noted within the marking.
     */


    /**
     * Modifier: adds either #$genlPreds or #$genlInverse to NODE's marking, depending on @see genl-inverse-mode-p
     */
    @LispMethod(comment = "Modifier: adds either #$genlPreds or #$genlInverse to NODE\'s marking, depending on @see genl-inverse-mode-p")
    public static final SubLObject sbhl_generational_predicate_marking_fn_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.genl_inverse_generational_marking_fn(node, space);
        } else {
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.genl_preds_generational_marking_fn(node, space);
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: adds either #$genlPreds or #$genlInverse to NODE\'s marking, depending on @see genl-inverse-mode-p")
    public static SubLObject sbhl_generational_predicate_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            genl_inverse_generational_marking_fn(node, space);
        } else {
            genl_preds_generational_marking_fn(node, space);
        }
        return NIL;
    }/**
     * Modifier: adds either #$genlPreds or #$genlInverse to NODE's marking, depending on @see genl-inverse-mode-p
     */


    /**
     * Modifier: adds #$genlPreds to second element of NODE's marking. stores generation in first element.
     */
    @LispMethod(comment = "Modifier: adds #$genlPreds to second element of NODE\'s marking. stores generation in first element.")
    public static final SubLObject genl_preds_generational_marking_fn_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject current_marking = second(com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space));
            if (NIL == current_marking) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()), space);
            } else {
                if (current_marking == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()), space);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt23$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: adds #$genlPreds to second element of NODE\'s marking. stores generation in first element.")
    public static SubLObject genl_preds_generational_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = second(sbhl_marked_with(node, space));
        if (NIL == current_marking) {
            set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()), space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()), space);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str23$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }/**
     * Modifier: adds #$genlPreds to second element of NODE's marking. stores generation in first element.
     */


    /**
     * Modifier: adds #$genlInverse to second element of NODE's marking. stores generation in forst element.
     */
    @LispMethod(comment = "Modifier: adds #$genlInverse to second element of NODE\'s marking. stores generation in forst element.")
    public static final SubLObject genl_inverse_generational_marking_fn_alt(SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject current_marking = second(com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED));
            if (NIL == current_marking) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()), space);
            } else {
                if (current_marking == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()), space);
                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt24$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: adds #$genlInverse to second element of NODE\'s marking. stores generation in forst element.")
    public static SubLObject genl_inverse_generational_marking_fn(final SubLObject node, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        final SubLObject current_marking = second(sbhl_marked_with(node, UNPROVIDED));
        if (NIL == current_marking) {
            set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()), space);
        } else
            if (current_marking.eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                set_sbhl_marking_state(node, list(sbhl_marking_vars.get_sbhl_marking_generation(), sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()), space);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str24$Node__a_has_current_marking__a_wi, node, current_marking, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }/**
     * Modifier: adds #$genlInverse to second element of NODE's marking. stores generation in forst element.
     */


    /**
     * Accessor: @return booleanp; whether any of NODES have a marking state. @see sbhl-marked-with
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether any of NODES have a marking state. @see sbhl-marked-with")
    public static final SubLObject sbhl_any_nodes_markedP_alt(SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject markedP = NIL;
            if (NIL == markedP) {
                {
                    SubLObject csome_list_var = nodes;
                    SubLObject node = NIL;
                    for (node = csome_list_var.first(); !((NIL != markedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node = csome_list_var.first()) {
                        markedP = com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space);
                    }
                }
            }
            return markedP;
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether any of NODES have a marking state. @see sbhl-marked-with")
    public static SubLObject sbhl_any_nodes_markedP(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject markedP = NIL;
        if (NIL != set.set_p(nodes)) {
            final SubLObject set_contents_var = set.do_set_internal(nodes);
            SubLObject basis_object;
            SubLObject state;
            SubLObject node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == markedP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                node = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                    markedP = sbhl_marked_with(node, space);
                }
            }
        } else
            if (nodes.isList()) {
                if (NIL == markedP) {
                    SubLObject csome_list_var;
                    SubLObject node2;
                    for (csome_list_var = nodes, node2 = NIL, node2 = csome_list_var.first(); (NIL == markedP) && (NIL != csome_list_var); markedP = sbhl_marked_with(node2, space) , csome_list_var = csome_list_var.rest() , node2 = csome_list_var.first()) {
                    }
                }
            } else {
                Errors.error($str25$_A_is_neither_SET_P_nor_LISTP_, nodes);
            }

        return markedP;
    }/**
     * Accessor: @return booleanp; whether any of NODES have a marking state. @see sbhl-marked-with
     */


    /**
     * Accessor: @return booleanp; whether all of NODES have a marking state.  @see sbhl-marked-with
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether all of NODES have a marking state.  @see sbhl-marked-with")
    public static final SubLObject sbhl_all_nodes_markedP_alt(SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject unmarkedP = NIL;
            if (NIL == unmarkedP) {
                {
                    SubLObject csome_list_var = nodes;
                    SubLObject node = NIL;
                    for (node = csome_list_var.first(); !((NIL != unmarkedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node = csome_list_var.first()) {
                        unmarkedP = makeBoolean(NIL == com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space));
                    }
                }
            }
            return makeBoolean(NIL == unmarkedP);
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether all of NODES have a marking state.  @see sbhl-marked-with")
    public static SubLObject sbhl_all_nodes_markedP(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject unmarkedP = NIL;
        if (NIL != set.set_p(nodes)) {
            final SubLObject set_contents_var = set.do_set_internal(nodes);
            SubLObject basis_object;
            SubLObject state;
            SubLObject node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == unmarkedP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                node = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                    unmarkedP = makeBoolean(NIL == sbhl_marked_with(node, space));
                }
            }
        } else
            if (nodes.isList()) {
                if (NIL == unmarkedP) {
                    SubLObject csome_list_var;
                    SubLObject node2;
                    for (csome_list_var = nodes, node2 = NIL, node2 = csome_list_var.first(); (NIL == unmarkedP) && (NIL != csome_list_var); unmarkedP = makeBoolean(NIL == sbhl_marked_with(node2, space)) , csome_list_var = csome_list_var.rest() , node2 = csome_list_var.first()) {
                    }
                }
            } else {
                Errors.error($str25$_A_is_neither_SET_P_nor_LISTP_, nodes);
            }

        return makeBoolean(NIL == unmarkedP);
    }/**
     * Accessor: @return booleanp; whether all of NODES have a marking state.  @see sbhl-marked-with
     */


    /**
     * Accessor: @return booleanp; whether any of NODES have no marking state. @see sbhl-marked-with
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether any of NODES have no marking state. @see sbhl-marked-with")
    public static final SubLObject sbhl_any_nodes_unmarkedP_alt(SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return makeBoolean(NIL == com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_all_nodes_markedP(nodes, space));
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether any of NODES have no marking state. @see sbhl-marked-with")
    public static SubLObject sbhl_any_nodes_unmarkedP(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return makeBoolean(NIL == sbhl_all_nodes_markedP(nodes, space));
    }/**
     * Accessor: @return booleanp; whether any of NODES have no marking state. @see sbhl-marked-with
     */


    /**
     * Accessor: @return booleanp; whether all of NODES have no marking state. @see sbhl-marked-with
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether all of NODES have no marking state. @see sbhl-marked-with")
    public static final SubLObject sbhl_all_nodes_unmarkedP_alt(SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return makeBoolean(NIL == com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_any_nodes_markedP(nodes, space));
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether all of NODES have no marking state. @see sbhl-marked-with")
    public static SubLObject sbhl_all_nodes_unmarkedP(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        return makeBoolean(NIL == sbhl_any_nodes_markedP(nodes, space));
    }/**
     * Accessor: @return booleanp; whether all of NODES have no marking state. @see sbhl-marked-with
     */


    /**
     * Accessor @return booleanp; whether all of NODES are unsearched or not.
     */
    @LispMethod(comment = "Accessor @return booleanp; whether all of NODES are unsearched or not.")
    public static final SubLObject all_unsearchedP_alt(SubLObject nodes) {
        return T;
    }

    @LispMethod(comment = "Accessor @return booleanp; whether all of NODES are unsearched or not.")
    public static SubLObject all_unsearchedP(final SubLObject nodes) {
        return T;
    }/**
     * Accessor @return booleanp; whether all of NODES are unsearched or not.
     */


    /**
     * Accessor: @return listp; the list of nodes among NODES that have a marking state. @see sbhl-marked-with
     */
    @LispMethod(comment = "Accessor: @return listp; the list of nodes among NODES that have a marking state. @see sbhl-marked-with")
    public static final SubLObject sbhl_all_marked_nodes_alt(SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space)) {
                    result = cons(node, result);
                }
            }
            return nreverse(result);
        }
    }

    @LispMethod(comment = "Accessor: @return listp; the list of nodes among NODES that have a marking state. @see sbhl-marked-with")
    public static SubLObject sbhl_all_marked_nodes(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sbhl_marked_with(node, space)) {
                result = cons(node, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return nreverse(result);
    }/**
     * Accessor: @return listp; the list of nodes among NODES that have a marking state. @see sbhl-marked-with
     */


    /**
     * Accessor: @return listp; the list of nodes among NODES that have no marking state. @see sbhl-marked-with
     */
    @LispMethod(comment = "Accessor: @return listp; the list of nodes among NODES that have no marking state. @see sbhl-marked-with")
    public static final SubLObject sbhl_all_unmarked_nodes_alt(SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_marked_with(node, space)) {
                    result = cons(node, result);
                }
            }
            return nreverse(result);
        }
    }

    @LispMethod(comment = "Accessor: @return listp; the list of nodes among NODES that have no marking state. @see sbhl-marked-with")
    public static SubLObject sbhl_all_unmarked_nodes(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == sbhl_marked_with(node, space)) {
                result = cons(node, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return nreverse(result);
    }/**
     * Accessor: @return listp; the list of nodes among NODES that have no marking state. @see sbhl-marked-with
     */


    /**
     * Accessor: @return listp; the list of those nodes with marking state in SPACE. @see do-sbhl-spaces
     */
    @LispMethod(comment = "Accessor: @return listp; the list of those nodes with marking state in SPACE. @see do-sbhl-spaces")
    public static final SubLObject sbhl_marked_nodes_alt(SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject result = NIL;
            if (space.isHashtable()) {
                {
                    SubLObject node = NIL;
                    SubLObject marking = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(space);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                node = getEntryKey(cdohash_entry);
                                marking = getEntryValue(cdohash_entry);
                                if (NIL != marking) {
                                    result = cons(node, result);
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Accessor: @return listp; the list of those nodes with marking state in SPACE. @see do-sbhl-spaces")
    public static SubLObject sbhl_marked_nodes(SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject result = NIL;
        if (space.isHashtable()) {
            SubLObject node = NIL;
            SubLObject marking = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(space);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    node = getEntryKey(cdohash_entry);
                    marking = getEntryValue(cdohash_entry);
                    if (NIL != marking) {
                        result = cons(node, result);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return result;
    }/**
     * Accessor: @return listp; the list of those nodes with marking state in SPACE. @see do-sbhl-spaces
     */


    /**
     * Modifier: iterates through NODES, calling @see sbhl-mark-as-marked-with
     */
    @LispMethod(comment = "Modifier: iterates through NODES, calling @see sbhl-mark-as-marked-with")
    public static final SubLObject sbhl_mark_all_nodes_marked_alt(SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_marked(node, space);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: iterates through NODES, calling @see sbhl-mark-as-marked-with")
    public static SubLObject sbhl_mark_all_nodes_marked(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_mark_node_marked(node, space);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Modifier: iterates through NODES, calling @see sbhl-mark-as-marked-with
     */


    /**
     * Modifier: iterates through NODES, calling @see sbhl-mark-as-unmarked-with
     */
    @LispMethod(comment = "Modifier: iterates through NODES, calling @see sbhl-mark-as-unmarked-with")
    public static final SubLObject sbhl_mark_all_nodes_unmarked_alt(SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_unmarked(node, space);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Modifier: iterates through NODES, calling @see sbhl-mark-as-unmarked-with")
    public static SubLObject sbhl_mark_all_nodes_unmarked(final SubLObject nodes, SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_mark_node_unmarked(node, space);
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Modifier: iterates through NODES, calling @see sbhl-mark-as-unmarked-with
     */


    /**
     * Modifier: marks each of NODES in @see *sbhl-target-space*
     */
    @LispMethod(comment = "Modifier: marks each of NODES in @see *sbhl-target-space*")
    public static final SubLObject sbhl_mark_nodes_in_target_space_alt(SubLObject nodes) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = nodes;
                SubLObject node = NIL;
                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier: marks each of NODES in @see *sbhl-target-space*")
    public static SubLObject sbhl_mark_nodes_in_target_space(final SubLObject nodes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Modifier: marks each of NODES in @see *sbhl-target-space*
     */


    /**
     * Modifier: marks each of NODES in @see *sbhl-target-space*
     */
    @LispMethod(comment = "Modifier: marks each of NODES in @see *sbhl-target-space*")
    public static final SubLObject sbhl_mark_nodes_in_target_space_gp_alt(SubLObject nodes) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                try {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                    {
                        SubLObject cdolist_list_var = nodes;
                        SubLObject node = NIL;
                        for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                        }
                    }
                } finally {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier: marks each of NODES in @see *sbhl-target-space*")
    public static SubLObject sbhl_mark_nodes_in_target_space_gp(final SubLObject nodes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        try {
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            } 
        } finally {
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Modifier: marks each of NODES in @see *sbhl-target-space*
     */


    /**
     *
     *
     * @return booleanp; whether OBJECT is a hash-table
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a hash-table")
    public static final SubLObject sbhl_space_p_alt(SubLObject v_object) {
        return hash_table_p(v_object);
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a hash-table
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a hash-table")
    public static SubLObject sbhl_space_p(final SubLObject v_object) {
        return hash_table_p(v_object);
    }

    public static final SubLObject list_of_sbhl_space_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject subobject = NIL;
                for (subobject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subobject = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_space_p(subobject)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject list_of_sbhl_space_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == sbhl_space_p(subobject)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    /**
     * Modifier: clears space
     */
    @LispMethod(comment = "Modifier: clears space")
    public static final SubLObject clear_sbhl_space_alt(SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        clrhash(space);
        return NIL;
    }

    @LispMethod(comment = "Modifier: clears space")
    public static SubLObject clear_sbhl_space(SubLObject space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        clrhash(space);
        return NIL;
    }/**
     * Modifier: clears space
     */


    public static final SubLObject empty_sbhl_space_p_alt(SubLObject v_object) {
        return hash_table_utilities.hash_table_empty_p(v_object);
    }

    public static SubLObject empty_sbhl_space_p(final SubLObject v_object) {
        return hash_table_utilities.hash_table_empty_p(v_object);
    }

    /**
     *
     *
     * @return integerp; the number of nodes marked in SPACE.
     */
    @LispMethod(comment = "@return integerp; the number of nodes marked in SPACE.")
    public static final SubLObject sbhl_marked_cardinality_alt(SubLObject space) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_space_p(space)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt26$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt26$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt26$_A_is_not_a__A, space, SBHL_SPACE_P);
                                } else {
                                    Errors.warn($str_alt31$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt26$_A_is_not_a__A, space, SBHL_SPACE_P);
                                }
                            }
                        }
                    }
                }
            }
            return hash_table_count(space);
        }
    }

    /**
     *
     *
     * @return integerp; the number of nodes marked in SPACE.
     */
    @LispMethod(comment = "@return integerp; the number of nodes marked in SPACE.")
    public static SubLObject sbhl_marked_cardinality(final SubLObject space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_space_p(space))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str27$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str27$_A_is_not_a__A, space, SBHL_SPACE_P);
                    } else {
                        Errors.warn($str32$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str27$_A_is_not_a__A, space, SBHL_SPACE_P);
                    }


        }
        return hash_table_count(space);
    }

    /**
     *
     *
     * @return listp; the nodes marked in SPACE.
     */
    @LispMethod(comment = "@return listp; the nodes marked in SPACE.")
    public static final SubLObject sbhl_space_keys_alt(SubLObject space) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.sbhl_space_p(space)) {
                    {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt26$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt26$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str_alt26$_A_is_not_a__A, space, SBHL_SPACE_P);
                                } else {
                                    Errors.warn($str_alt31$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str_alt26$_A_is_not_a__A, space, SBHL_SPACE_P);
                                }
                            }
                        }
                    }
                }
            }
            return hash_table_utilities.hash_table_keys(space);
        }
    }

    /**
     *
     *
     * @return listp; the nodes marked in SPACE.
     */
    @LispMethod(comment = "@return listp; the nodes marked in SPACE.")
    public static SubLObject sbhl_space_keys(final SubLObject space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_space_p(space))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str27$_A_is_not_a__A, space, SBHL_SPACE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str27$_A_is_not_a__A, space, SBHL_SPACE_P);
                    } else {
                        Errors.warn($str32$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str27$_A_is_not_a__A, space, SBHL_SPACE_P);
                    }


        }
        return hash_table_utilities.hash_table_keys(space);
    }

    public static SubLObject declare_sbhl_marking_utilities_file() {
        declareFunction("get_sbhl_marking_state", "GET-SBHL-MARKING-STATE", 1, 1, false);
        declareFunction("sbhl_marked_with", "SBHL-MARKED-WITH", 1, 1, false);
        declareFunction("sbhl_marked_node_p", "SBHL-MARKED-NODE-P", 1, 1, false);
        declareFunction("sbhl_marked_p", "SBHL-MARKED-P", 1, 0, false);
        declareFunction("sbhl_unmarked_p", "SBHL-UNMARKED-P", 1, 0, false);
        declareFunction("sbhl_marking_contains_searcherP", "SBHL-MARKING-CONTAINS-SEARCHER?", 2, 0, false);
        declareFunction("sbhl_marking_contains_all_searchersP", "SBHL-MARKING-CONTAINS-ALL-SEARCHERS?", 2, 0, false);
        declareFunction("sbhl_temporal_increment", "SBHL-TEMPORAL-INCREMENT", 0, 0, false);
        declareFunction("sbhl_temporal_tag_increment", "SBHL-TEMPORAL-TAG-INCREMENT", 1, 0, false);
        declareFunction("sbhl_nodes_marking_non_negative_p", "SBHL-NODES-MARKING-NON-NEGATIVE-P", 1, 1, false);
        declareFunction("sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p", "SBHL-CURRENT-MARKING-EXCEEDS-PENDING-MARKING-OR-MARKING-THRESHOLD-P", 1, 0, false);
        declareFunction("sbhl_nodes_mark_exceeds_temporal_threshold_p", "SBHL-NODES-MARK-EXCEEDS-TEMPORAL-THRESHOLD-P", 1, 0, false);
        declareFunction("sbhl_temporality_path_termination_for_searching_marked_nodes_p", "SBHL-TEMPORALITY-PATH-TERMINATION-FOR-SEARCHING-MARKED-NODES-P", 1, 0, false);
        declareFunction("sbhl_current_temporal_node_not_yet_considered_p", "SBHL-CURRENT-TEMPORAL-NODE-NOT-YET-CONSIDERED-P", 0, 0, false);
        declareFunction("sbhl_predicate_path_termination_p", "SBHL-PREDICATE-PATH-TERMINATION-P", 1, 0, false);
        declareFunction("set_sbhl_marking_state", "SET-SBHL-MARKING-STATE", 2, 1, false);
        declareFunction("set_sbhl_marking_state_to_marked", "SET-SBHL-MARKING-STATE-TO-MARKED", 1, 1, false);
        declareFunction("set_sbhl_marking_state_to_unmarked", "SET-SBHL-MARKING-STATE-TO-UNMARKED", 1, 1, false);
        declareFunction("sbhl_mark_node", "SBHL-MARK-NODE", 1, 1, false);
        declareFunction("adjoin_to_sbhl_marking_state", "ADJOIN-TO-SBHL-MARKING-STATE", 2, 1, false);
        declareFunction("prepend_to_sbhl_marking_state", "PREPEND-TO-SBHL-MARKING-STATE", 2, 1, false);
        declareFunction("remove_from_sbhl_marking_state", "REMOVE-FROM-SBHL-MARKING-STATE", 2, 1, false);
        declareFunction("node_unmarked_completely_in_sbhl_marking_stateP", "NODE-UNMARKED-COMPLETELY-IN-SBHL-MARKING-STATE?", 1, 1, false);
        declareFunction("prune_unmarked_node_from_sbhl_marking_state", "PRUNE-UNMARKED-NODE-FROM-SBHL-MARKING-STATE", 1, 1, false);
        declareFunction("increment_sbhl_marking_state", "INCREMENT-SBHL-MARKING-STATE", 2, 1, false);
        declareFunction("increment_sbhl_marking_state_by_zero", "INCREMENT-SBHL-MARKING-STATE-BY-ZERO", 1, 1, false);
        declareFunction("increment_sbhl_marking_state_by_minus_one", "INCREMENT-SBHL-MARKING-STATE-BY-MINUS-ONE", 1, 1, false);
        declareFunction("increment_sbhl_marking_state_by_one", "INCREMENT-SBHL-MARKING-STATE-BY-ONE", 1, 1, false);
        declareFunction("increment_sbhl_marking_state_by_two", "INCREMENT-SBHL-MARKING-STATE-BY-TWO", 1, 1, false);
        declareFunction("set_sbhl_marking_state_to_zero", "SET-SBHL-MARKING-STATE-TO-ZERO", 1, 1, false);
        declareFunction("set_sbhl_marking_state_to_depth", "SET-SBHL-MARKING-STATE-TO-DEPTH", 2, 1, false);
        declareFunction("sbhl_node_marking_greater_than_depth_p", "SBHL-NODE-MARKING-GREATER-THAN-DEPTH-P", 2, 1, false);
        declareFunction("sbhl_predicate_marking_fn", "SBHL-PREDICATE-MARKING-FN", 1, 1, false);
        declareFunction("genl_preds_marking_fn", "GENL-PREDS-MARKING-FN", 1, 1, false);
        declareFunction("genl_inverse_marking_fn", "GENL-INVERSE-MARKING-FN", 1, 1, false);
        declareFunction("sbhl_predicate_unmarking_fn", "SBHL-PREDICATE-UNMARKING-FN", 1, 1, false);
        new sbhl_marking_utilities.$sbhl_predicate_unmarking_fn$UnaryFunction();
        new sbhl_marking_utilities.$sbhl_predicate_unmarking_fn$BinaryFunction();
        declareFunction("genl_preds_unmarking_fn", "GENL-PREDS-UNMARKING-FN", 1, 1, false);
        declareFunction("genl_inverse_unmarking_fn", "GENL-INVERSE-UNMARKING-FN", 1, 1, false);
        declareFunction("sbhl_mark_node_in_precompute_space", "SBHL-MARK-NODE-IN-PRECOMPUTE-SPACE", 1, 0, false);
        declareFunction("sbhl_node_marked_precompute_goal_p", "SBHL-NODE-MARKED-PRECOMPUTE-GOAL-P", 1, 0, false);
        declareFunction("set_sbhl_boolean_precompute_goal_conditions", "SET-SBHL-BOOLEAN-PRECOMPUTE-GOAL-CONDITIONS", 1, 0, false);
        declareFunction("sbhl_search_path_termination_p", "SBHL-SEARCH-PATH-TERMINATION-P", 1, 1, false);
        declareFunction("sbhl_path_terminating_mark_p", "SBHL-PATH-TERMINATING-MARK-P", 1, 1, false);
        declareFunction("sbhl_path_termination_marking_p", "SBHL-PATH-TERMINATION-MARKING-P", 1, 0, false);
        declareFunction("sbhl_marked_in_terminating_space_p", "SBHL-MARKED-IN-TERMINATING-SPACE-P", 1, 0, false);
        declareFunction("sbhl_marked_in_target_space_p", "SBHL-MARKED-IN-TARGET-SPACE-P", 1, 0, false);
        new sbhl_marking_utilities.$sbhl_marked_in_target_space_p$UnaryFunction();
        declareFunction("sbhl_mark_node_marked", "SBHL-MARK-NODE-MARKED", 1, 1, false);
        declareFunction("sbhl_mark_node_unmarked", "SBHL-MARK-NODE-UNMARKED", 1, 1, false);
        declareFunction("sbhl_mark_in_target_space", "SBHL-MARK-IN-TARGET-SPACE", 1, 0, false);
        declareFunction("sbhl_mark_in_target_gather_space", "SBHL-MARK-IN-TARGET-GATHER-SPACE", 1, 0, false);
        declareFunction("sbhl_apply_mark_in_space", "SBHL-APPLY-MARK-IN-SPACE", 1, 0, false);
        declareFunction("sbhl_apply_unmark_in_space", "SBHL-APPLY-UNMARK-IN-SPACE", 1, 0, false);
        declareFunction("sbhl_generational_search_path_termination_p", "SBHL-GENERATIONAL-SEARCH-PATH-TERMINATION-P", 1, 1, false);
        declareFunction("sbhl_marking_generation", "SBHL-MARKING-GENERATION", 1, 1, false);
        declareFunction("sbhl_generational_mark_node_marked", "SBHL-GENERATIONAL-MARK-NODE-MARKED", 1, 1, false);
        declareFunction("sbhl_generational_predicate_marking_fn", "SBHL-GENERATIONAL-PREDICATE-MARKING-FN", 1, 1, false);
        declareFunction("genl_preds_generational_marking_fn", "GENL-PREDS-GENERATIONAL-MARKING-FN", 1, 1, false);
        declareFunction("genl_inverse_generational_marking_fn", "GENL-INVERSE-GENERATIONAL-MARKING-FN", 1, 1, false);
        declareFunction("sbhl_any_nodes_markedP", "SBHL-ANY-NODES-MARKED?", 1, 1, false);
        declareFunction("sbhl_all_nodes_markedP", "SBHL-ALL-NODES-MARKED?", 1, 1, false);
        declareFunction("sbhl_any_nodes_unmarkedP", "SBHL-ANY-NODES-UNMARKED?", 1, 1, false);
        declareFunction("sbhl_all_nodes_unmarkedP", "SBHL-ALL-NODES-UNMARKED?", 1, 1, false);
        declareFunction("all_unsearchedP", "ALL-UNSEARCHED?", 1, 0, false);
        declareFunction("sbhl_all_marked_nodes", "SBHL-ALL-MARKED-NODES", 1, 1, false);
        declareFunction("sbhl_all_unmarked_nodes", "SBHL-ALL-UNMARKED-NODES", 1, 1, false);
        declareFunction("sbhl_marked_nodes", "SBHL-MARKED-NODES", 0, 1, false);
        declareFunction("sbhl_mark_all_nodes_marked", "SBHL-MARK-ALL-NODES-MARKED", 1, 1, false);
        declareFunction("sbhl_mark_all_nodes_unmarked", "SBHL-MARK-ALL-NODES-UNMARKED", 1, 1, false);
        declareFunction("sbhl_mark_nodes_in_target_space", "SBHL-MARK-NODES-IN-TARGET-SPACE", 1, 0, false);
        declareFunction("sbhl_mark_nodes_in_target_space_gp", "SBHL-MARK-NODES-IN-TARGET-SPACE-GP", 1, 0, false);
        declareFunction("sbhl_space_p", "SBHL-SPACE-P", 1, 0, false);
        declareFunction("list_of_sbhl_space_p", "LIST-OF-SBHL-SPACE-P", 1, 0, false);
        declareFunction("clear_sbhl_space", "CLEAR-SBHL-SPACE", 0, 1, false);
        declareFunction("empty_sbhl_space_p", "EMPTY-SBHL-SPACE-P", 1, 0, false);
        declareFunction("sbhl_marked_cardinality", "SBHL-MARKED-CARDINALITY", 1, 0, false);
        declareFunction("sbhl_space_keys", "SBHL-SPACE-KEYS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_marking_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_sbhl_marking_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_marking_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_marking_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_marking_utilities_file();
    }

    static {
    }

    public static final class $sbhl_predicate_unmarking_fn$UnaryFunction extends UnaryFunction {
        public $sbhl_predicate_unmarking_fn$UnaryFunction() {
            super(extractFunctionNamed("SBHL-PREDICATE-UNMARKING-FN"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_predicate_unmarking_fn(arg1, sbhl_marking_utilities.$sbhl_predicate_unmarking_fn$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $sbhl_predicate_unmarking_fn$BinaryFunction extends BinaryFunction {
        public $sbhl_predicate_unmarking_fn$BinaryFunction() {
            super(extractFunctionNamed("SBHL-PREDICATE-UNMARKING-FN"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return sbhl_predicate_unmarking_fn(arg1, arg2);
        }
    }

    public static final class $sbhl_marked_in_target_space_p$UnaryFunction extends UnaryFunction {
        public $sbhl_marked_in_target_space_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MARKED-IN-TARGET-SPACE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_marked_in_target_space_p(arg1);
        }
    }

    static private final SubLString $str_alt9$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-preds-unmarking");

    static private final SubLString $str_alt10$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-inverse-unmarking");

    static private final SubLString $str_alt23$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-preds-marking");

    static private final SubLString $str_alt24$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-inverse-marking");

    static private final SubLString $str_alt26$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt31$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
}

/**
 * Total time: 210 ms
 */
