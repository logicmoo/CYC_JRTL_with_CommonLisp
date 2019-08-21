package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.ghl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.ghl_search_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class ghl_search_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new ghl_search_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.ghl_search_utilities";

    public static final String myFingerPrint = "73841efc4c29225ce49dcc5e559d81fe3a50b4ec29822e9d63d0a2b87f5c35a9";



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list2 = list(reader_make_constant_shell(makeString("ReflexiveBinaryPredicate")));



    private static final SubLObject $$ReflexiveBinaryPredicate = reader_make_constant_shell(makeString("ReflexiveBinaryPredicate"));

    public static SubLObject ghl_table_p(final SubLObject obj) {
        return hash_table_p(obj);
    }

    public static SubLObject ghl_goal_nodeP(final SubLObject v_search, final SubLObject node, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (NIL != list_utilities.sublisp_boolean(ghl_search_vars.ghl_goal_fn(v_search))) {
            return funcall(ghl_search_vars.ghl_goal_fn(v_search), v_search, node);
        }
        if (ghl_search_vars.ghl_goal(v_search).isList()) {
            return subl_promotions.memberP(node, ghl_search_vars.ghl_goal(v_search), test, UNPROVIDED);
        }
        return funcall(test, ghl_search_vars.ghl_goal(v_search), node);
    }

    public static SubLObject ghl_goal_or_marked_as_goalP(final SubLObject v_search, final SubLObject node, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if ((NIL != ghl_table_p(ghl_search_vars.ghl_goal_space(v_search))) && (NIL != ghl_marking_utilities.ghl_node_marked_in_space_p(node, ghl_search_vars.ghl_goal_space(v_search)))) {
            return T;
        }
        if (NIL != ghl_graph_utilities.ghl_node_p(ghl_search_vars.ghl_goal(v_search))) {
            return funcall(test, ghl_search_vars.ghl_goal(v_search), node);
        }
        if (ghl_search_vars.ghl_goal(v_search).isList()) {
            return subl_promotions.memberP(node, ghl_search_vars.ghl_goal(v_search), test, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject ghl_node_satisfies_pred_arg_typeP(final SubLObject pred, final SubLObject node) {
        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
            return sbhl_module_utilities.sbhl_node_has_type_associated_to_predicate_p(node, sbhl_module_vars.get_sbhl_module(pred));
        }
        return T;
    }

    public static SubLObject ghl_inverse_cardinality(final SubLObject pred, final SubLObject node) {
        final SubLObject kb_cardinality = (NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) ? sbhl_module_utilities.sbhl_inverse_cardinality(sbhl_module_vars.get_sbhl_module(pred), node) : cardinality_estimates.gt_inverse_cardinality(pred, node);
        SubLObject sksi_cardinality = ZERO_INTEGER;
        if (NIL != sksi_tva_utilities.sksi_transitivity_possibleP()) {
            sksi_cardinality = sksi_tva_utilities.sksi_inverse_cardinality(pred, node, UNPROVIDED);
        }
        return add(kb_cardinality, sksi_cardinality);
    }

    public static SubLObject ghl_predicate_cardinality(final SubLObject pred, final SubLObject node) {
        final SubLObject kb_cardinality = (NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) ? sbhl_module_utilities.sbhl_predicate_cardinality(sbhl_module_vars.get_sbhl_module(pred), node) : cardinality_estimates.gt_predicate_cardinality(pred, node);
        SubLObject sksi_cardinality = ZERO_INTEGER;
        if (NIL != sksi_tva_utilities.sksi_transitivity_possibleP()) {
            sksi_cardinality = sksi_tva_utilities.sksi_predicate_cardinality(pred, node, UNPROVIDED);
        }
        return add(kb_cardinality, sksi_cardinality);
    }

    public static SubLObject ghl_resolve_goal_found(final SubLObject v_search, final SubLObject node) {
        if (NIL == ghl_search_vars.ghl_compute_justifyP(v_search)) {
            ghl_search_vars.ghl_set_result(v_search, node);
        }
        ghl_search_vars.set_ghl_goal_found_p(v_search, T);
        graphl_graph_utilities.$graphl_finishedP$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject ghl_add_gt_assertion_to_result(final SubLObject v_search, final SubLObject assertion) {
        ghl_search_vars.ghl_add_to_result(v_search, assertion, UNPROVIDED);
        return NIL;
    }

    public static SubLObject ghl_add_sbhl_assertion_to_result(final SubLObject v_search, final SubLObject pred, final SubLObject node, final SubLObject link_node, final SubLObject direction, final SubLObject mt) {
        SubLObject formula = NIL;
        SubLObject result = NIL;
        if (NIL != ghl_search_vars.ghl_forward_direction_p(direction)) {
            formula = list(pred, node, link_node);
        } else {
            formula = list(pred, link_node, node);
        }
        result = kb_indexing.find_gaf(formula, mt);
        if (NIL != result) {
            ghl_search_vars.ghl_add_to_result(v_search, result, UNPROVIDED);
            return NIL;
        }
        if (NIL == sbhl_module_utilities.sbhl_module_directed_linksP(sbhl_module_vars.get_sbhl_module(pred))) {
            if (NIL != ghl_search_vars.ghl_forward_direction_p(direction)) {
                result = kb_indexing.find_gaf(list(pred, link_node, node), mt);
            } else {
                result = kb_indexing.find_gaf(list(pred, node, link_node), mt);
            }
            if (NIL != result) {
                ghl_search_vars.ghl_add_to_result(v_search, result, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject ghl_add_reflexivity_justification(final SubLObject v_search, final SubLObject node, final SubLObject reflexive_assertion) {
        final SubLObject reflexive_just = list(reflexive_assertion, arguments.make_hl_support($ISA, listS($$isa, assertions_high.gaf_predicate(reflexive_assertion), $list2), UNPROVIDED, UNPROVIDED));
        ghl_search_vars.ghl_append_to_result(v_search, reflexive_just);
        return NIL;
    }

    public static SubLObject ghl_node_admitted_by_some_reflexive_gaf(final SubLObject v_search, final SubLObject node) {
        SubLObject reflexiveP = NIL;
        SubLObject pred_var = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var);
            SubLObject done_var = reflexiveP;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$1 = reflexiveP;
                        final SubLObject token_var_$2 = NIL;
                        while (NIL == done_var_$1) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                            if (NIL != valid_$3) {
                                final SubLObject pred = assertions_high.gaf_predicate(assertion);
                                if (((NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion))) && (NIL != ghl_search_vars.ghl_relevant_predP(v_search, pred))) && (NIL != isa.isaP(pred, $$ReflexiveBinaryPredicate, UNPROVIDED, UNPROVIDED))) {
                                    reflexiveP = assertion;
                                }
                            }
                            done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != reflexiveP));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != reflexiveP));
            } 
        }
        pred_var = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, TWO_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, TWO_INTEGER, pred_var);
            SubLObject done_var = reflexiveP;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$2 = reflexiveP;
                        final SubLObject token_var_$3 = NIL;
                        while (NIL == done_var_$2) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                            final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                            if (NIL != valid_$4) {
                                final SubLObject pred = assertions_high.gaf_predicate(assertion);
                                if (((NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion))) && (NIL != ghl_search_vars.ghl_relevant_predP(v_search, pred))) && (NIL != isa.isaP(pred, $$ReflexiveBinaryPredicate, UNPROVIDED, UNPROVIDED))) {
                                    reflexiveP = assertion;
                                }
                            }
                            done_var_$2 = makeBoolean((NIL == valid_$4) || (NIL != reflexiveP));
                        } 
                    } finally {
                        final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != reflexiveP));
            } 
        }
        return reflexiveP;
    }

    public static SubLObject declare_ghl_search_utilities_file() {
        declareFunction(me, "ghl_table_p", "GHL-TABLE-P", 1, 0, false);
        declareFunction(me, "ghl_goal_nodeP", "GHL-GOAL-NODE?", 2, 1, false);
        declareFunction(me, "ghl_goal_or_marked_as_goalP", "GHL-GOAL-OR-MARKED-AS-GOAL?", 2, 1, false);
        declareFunction(me, "ghl_node_satisfies_pred_arg_typeP", "GHL-NODE-SATISFIES-PRED-ARG-TYPE?", 2, 0, false);
        declareFunction(me, "ghl_inverse_cardinality", "GHL-INVERSE-CARDINALITY", 2, 0, false);
        declareFunction(me, "ghl_predicate_cardinality", "GHL-PREDICATE-CARDINALITY", 2, 0, false);
        declareFunction(me, "ghl_resolve_goal_found", "GHL-RESOLVE-GOAL-FOUND", 2, 0, false);
        declareFunction(me, "ghl_add_gt_assertion_to_result", "GHL-ADD-GT-ASSERTION-TO-RESULT", 2, 0, false);
        declareFunction(me, "ghl_add_sbhl_assertion_to_result", "GHL-ADD-SBHL-ASSERTION-TO-RESULT", 6, 0, false);
        declareFunction(me, "ghl_add_reflexivity_justification", "GHL-ADD-REFLEXIVITY-JUSTIFICATION", 3, 0, false);
        declareFunction(me, "ghl_node_admitted_by_some_reflexive_gaf", "GHL-NODE-ADMITTED-BY-SOME-REFLEXIVE-GAF", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_ghl_search_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_ghl_search_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ghl_search_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_ghl_search_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ghl_search_utilities_file();
    }

    static {






    }
}

/**
 * Total time: 130 ms
 */
