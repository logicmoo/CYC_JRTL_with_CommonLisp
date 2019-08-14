package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rtv extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new rtv();

    public static final String myName = "com.cyc.cycjava_2.cycl.rtv";


    // defvar
    private static final SubLSymbol $rtv_intersection_table$ = makeSymbol("*RTV-INTERSECTION-TABLE*");



    // defparameter
    private static final SubLSymbol $rtv_walk_prevent_loopsP$ = makeSymbol("*RTV-WALK-PREVENT-LOOPS?*");









    private static final SubLList $list4 = list(list(makeSymbol("TARGET-VAR"), makeSymbol("SOURCE"), makeSymbol("&KEY"), makeSymbol("LINK-VAR"), makeSymbol("PREDICATES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list5 = list(makeKeyword("LINK-VAR"), makeKeyword("PREDICATES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $LINK_VAR = makeKeyword("LINK-VAR");



    private static final SubLSymbol $sym9$SOURCE_VAR = makeUninternedSymbol("SOURCE-VAR");



    private static final SubLSymbol DO_RTV_LINKS = makeSymbol("DO-RTV-LINKS");

    private static final SubLSymbol $sym12$LINK = makeUninternedSymbol("LINK");

    private static final SubLSymbol $sym13$INDEX_ARG = makeUninternedSymbol("INDEX-ARG");

    private static final SubLSymbol $sym14$GATHER_ARG = makeUninternedSymbol("GATHER-ARG");

    public static final SubLSymbol $rtv_predicates$ = makeSymbol("*RTV-PREDICATES*");



    private static final SubLList $list17 = list(list(QUOTE, list(ONE_INTEGER, TWO_INTEGER)));



    private static final SubLSymbol RTV_ACCESSIBLE_EDGES = makeSymbol("RTV-ACCESSIBLE-EDGES");



    private static final SubLSymbol $sym21$_ = makeSymbol("=");

    private static final SubLList $list22 = list(ONE_INTEGER);

    private static final SubLList $list23 = list(TWO_INTEGER, ONE_INTEGER);

    private static final SubLSymbol GAF_ARG = makeSymbol("GAF-ARG");

    private static final SubLSymbol RELEVANT_PRED_IS_IN_LIST = makeSymbol("RELEVANT-PRED-IS-IN-LIST");





    private static final SubLList $list28 = list(list(makeSymbol("TARGET-VAR"), makeSymbol("SOURCE"), makeSymbol("EDGE-MAP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym29$SOURCE_VAR = makeUninternedSymbol("SOURCE-VAR");

    private static final SubLSymbol DO_RTV_EDGE_MAP_NODES = makeSymbol("DO-RTV-EDGE-MAP-NODES");

    private static final SubLSymbol $sym31$EDGE_MAP_VAR = makeUninternedSymbol("EDGE-MAP-VAR");

    private static final SubLSymbol $sym32$TARGET_MAP = makeUninternedSymbol("TARGET-MAP");

    private static final SubLSymbol $sym33$EDGE_SET = makeUninternedSymbol("EDGE-SET");

    private static final SubLSymbol MAP_GET_WITHOUT_VALUES = makeSymbol("MAP-GET-WITHOUT-VALUES");

    private static final SubLList $list35 = list(NIL);



    private static final SubLSymbol DO_MAP = makeSymbol("DO-MAP");



    private static final SubLList $list39 = list(list(makeSymbol("LINK-VAR"), makeSymbol("SOURCE"), makeSymbol("TARGET"), makeSymbol("EDGE-MAP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym40$SOURCE_VAR = makeUninternedSymbol("SOURCE-VAR");

    private static final SubLSymbol DO_RTV_EDGE_MAP_LINKS = makeSymbol("DO-RTV-EDGE-MAP-LINKS");

    private static final SubLSymbol $sym42$TARGET_VAR = makeUninternedSymbol("TARGET-VAR");

    private static final SubLSymbol $sym43$EDGE_MAP_VAR = makeUninternedSymbol("EDGE-MAP-VAR");

    private static final SubLSymbol $sym44$TARGET_MAP = makeUninternedSymbol("TARGET-MAP");

    private static final SubLSymbol $sym45$EDGE_SET = makeUninternedSymbol("EDGE-SET");





    private static final SubLString $str48$Unexpected_return_type___S = makeString("Unexpected return type: ~S");

    private static final SubLList $list49 = list(ONE_INTEGER, TWO_INTEGER);

    private static final SubLSymbol MAKE_SET_FROM_LIST = makeSymbol("MAKE-SET-FROM-LIST");

    private static final SubLSymbol SET_SIZE = makeSymbol("SET-SIZE");

    private static final SubLList $list52 = cons(makeSymbol("SOURCE-SET"), makeSymbol("REST-NODE-LEVEL-SETS"));

    private static final SubLList $list53 = cons(makeSymbol("FIRST-NODE-LEVEL"), makeSymbol("NEXT-NODE-LEVELS"));

    private static final SubLList $list54 = cons(makeSymbol("NEXT-NODE-LEVEL"), makeSymbol("AFTER-NODE-LEVELS"));

    private static final SubLList $list55 = list(makeSymbol("CANDIDATE-NODE"), makeUninternedSymbol("EDGE-SET"));

    public static SubLObject new_rtv_intersection_table(SubLObject size) {
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        return keyhash.new_keyhash(size, symbol_function(EQL));
    }

    public static SubLObject rtv_union(final SubLObject left_solution, final SubLObject right_solution) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash_utilities.fast_union(left_solution, right_solution, symbol_function(EQL), symbol_function(IDENTITY), $rtv_intersection_table$.getDynamicValue(thread));
    }

    public static SubLObject rtv_intersection(final SubLObject left_solution, final SubLObject right_solution) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash_utilities.fast_intersection(left_solution, right_solution, symbol_function(EQL), symbol_function(IDENTITY), $rtv_intersection_table$.getDynamicValue(thread));
    }

    public static SubLObject rtv_sort(final SubLObject items, SubLObject return_type) {
        if (return_type == UNPROVIDED) {
            return_type = $NODES;
        }
        final SubLObject pcase_var = return_type;
        if (pcase_var.eql($NODES)) {
            return kb_utilities.sort_terms(items, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql($EDGES)) {
            return assertion_utilities.sort_assertions(items);
        }
        return kb_utilities.sort_terms(items, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject do_rtv_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject target_var = NIL;
        SubLObject source = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        target_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        source = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list4);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list4);
            if (NIL == member(current_$1, $list5, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list4);
        }
        final SubLObject link_var_tail = property_list_member($LINK_VAR, current);
        final SubLObject link_var = (NIL != link_var_tail) ? cadr(link_var_tail) : NIL;
        final SubLObject predicates_tail = property_list_member($PREDICATES, current);
        final SubLObject predicates = (NIL != predicates_tail) ? cadr(predicates_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!source.isAtom()) {
            final SubLObject source_var = $sym9$SOURCE_VAR;
            return list(CLET, list(list(source_var, source)), listS(DO_RTV_LINKS, list(target_var, source_var, $LINK_VAR, link_var, $PREDICATES, predicates), append(body, NIL)));
        }
        if (NIL == link_var) {
            final SubLObject link = $sym12$LINK;
            return listS(DO_RTV_LINKS, list(target_var, source, $LINK_VAR, link, $PREDICATES, predicates), append(body, NIL));
        }
        final SubLObject index_arg = $sym13$INDEX_ARG;
        final SubLObject gather_arg = $sym14$GATHER_ARG;
        return list(CLET, list(list($rtv_predicates$, predicates)), list(CDOLIST, bq_cons(index_arg, $list17), list(DO_LIST, list(link_var, list(RTV_ACCESSIBLE_EDGES, source, index_arg)), listS(CLET, list(list(gather_arg, listS(FIF, listS($sym21$_, index_arg, $list22), $list23)), list(target_var, list(GAF_ARG, link_var, gather_arg))), append(body, NIL)))));
    }

    public static SubLObject rtv_accessible_edges_internal(final SubLObject source_node, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject edges = NIL;
        final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_preds$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_IN_LIST, thread);
            pred_relevance_macros.$relevant_preds$.bind($rtv_predicates$.getDynamicValue(thread), thread);
            final SubLObject pred_var = NIL;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source_node, argnum, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source_node, argnum, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$2 = NIL;
                            final SubLObject token_var_$3 = NIL;
                            while (NIL == done_var_$2) {
                                final SubLObject edge = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(edge));
                                if (NIL != valid_$4) {
                                    edges = cons(edge, edges);
                                }
                                done_var_$2 = makeBoolean(NIL == valid_$4);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            pred_relevance_macros.$relevant_preds$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        return nreverse(edges);
    }

    public static SubLObject rtv_accessible_edges(final SubLObject source_node, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rtv_accessible_edges_internal(source_node, argnum);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RTV_ACCESSIBLE_EDGES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RTV_ACCESSIBLE_EDGES, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RTV_ACCESSIBLE_EDGES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(source_node, argnum);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (source_node.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && argnum.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rtv_accessible_edges_internal(source_node, argnum)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(source_node, argnum));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject do_rtv_edge_map_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject target_var = NIL;
        SubLObject source = NIL;
        SubLObject edge_map = NIL;
        destructuring_bind_must_consp(current, datum, $list28);
        target_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        source = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        edge_map = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list28);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        if (!source.isAtom()) {
            final SubLObject source_var = $sym29$SOURCE_VAR;
            return list(CLET, list(list(source_var, source)), listS(DO_RTV_EDGE_MAP_NODES, list(target_var, source_var, edge_map), append(body, NIL)));
        }
        if (!edge_map.isAtom()) {
            final SubLObject edge_map_var = $sym31$EDGE_MAP_VAR;
            return list(CLET, list(list(edge_map_var, edge_map)), listS(DO_RTV_EDGE_MAP_NODES, list(target_var, source, edge_map_var), append(body, NIL)));
        }
        final SubLObject target_map = $sym32$TARGET_MAP;
        final SubLObject edge_set = $sym33$EDGE_SET;
        return list(CLET, list(list(target_map, listS(MAP_GET_WITHOUT_VALUES, edge_map, source, $list35))), list(PWHEN, target_map, listS(DO_MAP, list(target_var, edge_set, target_map), list(IGNORE, edge_set), append(body, NIL))));
    }

    public static SubLObject do_rtv_edge_map_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_var = NIL;
        SubLObject source = NIL;
        SubLObject target = NIL;
        SubLObject edge_map = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        source = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        target = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        edge_map = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list39);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        if (!source.isAtom()) {
            final SubLObject source_var = $sym40$SOURCE_VAR;
            return list(CLET, list(list(source_var, source)), listS(DO_RTV_EDGE_MAP_LINKS, list(link_var, source_var, target, edge_map), append(body, NIL)));
        }
        if (!target.isAtom()) {
            final SubLObject target_var = $sym42$TARGET_VAR;
            return list(CLET, list(list(target_var, target)), listS(DO_RTV_EDGE_MAP_LINKS, list(link_var, source, target_var, edge_map), append(body, NIL)));
        }
        if (!edge_map.isAtom()) {
            final SubLObject edge_map_var = $sym43$EDGE_MAP_VAR;
            return list(CLET, list(list(edge_map_var, edge_map)), listS(DO_RTV_EDGE_MAP_LINKS, list(link_var, source, target, edge_map_var), append(body, NIL)));
        }
        final SubLObject target_map = $sym44$TARGET_MAP;
        final SubLObject edge_set = $sym45$EDGE_SET;
        return list(CLET, list(list(target_map, listS(MAP_GET_WITHOUT_VALUES, edge_map, source, $list35))), list(PWHEN, target_map, list(CLET, list(list(edge_set, listS(MAP_GET_WITHOUT_VALUES, target_map, target, $list35))), list(PWHEN, edge_set, listS(DO_SET, list(link_var, edge_set), append(body, NIL))))));
    }

    public static SubLObject rtv_walk_from_nodes(final SubLObject source_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(length) : "subl_promotions.non_negative_integer_p(length) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(length) " + length;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rtv_intersection_table$.currentBinding(thread);
        try {
            $rtv_intersection_table$.bind(new_rtv_intersection_table(UNPROVIDED), thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (ZERO_INTEGER.numE(length)) {
                    if (return_type.eql($NODES)) {
                        result = source_nodes;
                    } else
                        if (return_type.eql($EDGES)) {
                            result = NIL;
                        } else {
                            Errors.error($str48$Unexpected_return_type___S, return_type);
                        }

                } else {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            result = rtv_walk_from_nodes_internal(source_nodes, predicates, length, return_type);
                        } finally {
                            final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            $rtv_intersection_table$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rtv_walk_from_nodes_internal(final SubLObject source_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gather_edgesP = eq(return_type, $EDGES);
        final SubLObject visited_edges = (NIL != gather_edgesP) ? set.new_set(symbol_function(EQL), ZERO_INTEGER) : NIL;
        final SubLObject visited_nodes = set_utilities.make_set_from_list(source_nodes, symbol_function(EQL));
        SubLObject swap_var;
        for (SubLObject last_queue = queues.enqueue_all(source_nodes, queues.create_queue(UNPROVIDED)), next_queue = queues.create_queue(UNPROVIDED), remaining_steps = length; !remaining_steps.isZero(); remaining_steps = subtract(remaining_steps, ONE_INTEGER) , swap_var = last_queue , last_queue = next_queue , next_queue = swap_var) {
            SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(last_queue);
            SubLObject source_node = NIL;
            source_node = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0 = $rtv_predicates$.currentBinding(thread);
                try {
                    $rtv_predicates$.bind(predicates, thread);
                    SubLObject cdolist_list_var_$9 = $list49;
                    SubLObject index_arg = NIL;
                    index_arg = cdolist_list_var_$9.first();
                    while (NIL != cdolist_list_var_$9) {
                        SubLObject cdolist_list_var_$10 = rtv_accessible_edges(source_node, index_arg);
                        SubLObject edge = NIL;
                        edge = cdolist_list_var_$10.first();
                        while (NIL != cdolist_list_var_$10) {
                            final SubLObject gather_arg = (index_arg.numE(ONE_INTEGER)) ? TWO_INTEGER : ONE_INTEGER;
                            final SubLObject target_node = assertions_high.gaf_arg(edge, gather_arg);
                            if ((NIL != gather_edgesP) && (NIL == set.set_memberP(edge, visited_edges))) {
                                set.set_add(edge, visited_edges);
                            }
                            if (NIL == set.set_memberP(target_node, visited_nodes)) {
                                queues.enqueue(target_node, next_queue);
                                set.set_add(target_node, visited_nodes);
                            }
                            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                            edge = cdolist_list_var_$10.first();
                        } 
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        index_arg = cdolist_list_var_$9.first();
                    } 
                } finally {
                    $rtv_predicates$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                source_node = cdolist_list_var.first();
            } 
        }
        if (return_type.eql($NODES)) {
            return set.set_element_list(visited_nodes);
        }
        if (return_type.eql($EDGES)) {
            return set.set_element_list(visited_edges);
        }
        return Errors.error($str48$Unexpected_return_type___S, return_type);
    }

    public static SubLObject rtv_walk_between_nodes(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(length) : "subl_promotions.non_negative_integer_p(length) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(length) " + length;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rtv_intersection_table$.currentBinding(thread);
        try {
            $rtv_intersection_table$.bind(new_rtv_intersection_table(UNPROVIDED), thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (ZERO_INTEGER.numE(length)) {
                    if (return_type.eql($NODES)) {
                        result = rtv_intersection(left_nodes, right_nodes);
                    } else
                        if (return_type.eql($EDGES)) {
                            result = NIL;
                        } else {
                            Errors.error($str48$Unexpected_return_type___S, return_type);
                        }

                } else {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            if (NIL != $rtv_walk_prevent_loopsP$.getDynamicValue(thread)) {
                                result = rtv_walk_between_nodes_internal(left_nodes, right_nodes, predicates, length, return_type);
                            } else {
                                result = rtv_walk_between_nodes_recursive(left_nodes, right_nodes, predicates, length, return_type);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$11, thread);
            }
        } finally {
            $rtv_intersection_table$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rtv_length_to_islands(final SubLObject length, final SubLObject left_size, final SubLObject right_size) {
        final SubLObject half = integerDivide(length, TWO_INTEGER);
        if (NIL != evenp(length)) {
            return values(half, half);
        }
        if (left_size.numGE(right_size)) {
            return values(number_utilities.f_1X(half), half);
        }
        return values(half, number_utilities.f_1X(half));
    }

    public static SubLObject rtv_walk_between_nodes_recursive(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ONE_INTEGER.numE(length)) {
            return rtv_walk_between_nodes_directly(left_nodes, right_nodes, predicates, return_type);
        }
        thread.resetMultipleValues();
        final SubLObject left_length = rtv_length_to_islands(length, length(left_nodes), length(right_nodes));
        final SubLObject right_length = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject horizon_from_left = rtv_walk_from_nodes_internal(left_nodes, predicates, left_length, $NODES);
        final SubLObject horizon_from_right = rtv_walk_from_nodes_internal(right_nodes, predicates, right_length, $NODES);
        final SubLObject island_nodes = rtv_intersection(horizon_from_left, horizon_from_right);
        final SubLObject left_subsolution = rtv_walk_between_nodes_recursive(left_nodes, island_nodes, predicates, left_length, return_type);
        final SubLObject right_subsolution = rtv_walk_between_nodes_recursive(island_nodes, right_nodes, predicates, right_length, return_type);
        final SubLObject full_solution = rtv_union(left_subsolution, right_subsolution);
        return full_solution;
    }

    public static SubLObject rtv_walk_between_nodes_directly(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject return_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gather_nodesP = equal(return_type, $NODES);
        final SubLObject gather_edgesP = equal(return_type, $EDGES);
        final SubLObject linked_nodes = (NIL != gather_nodesP) ? set.new_set(symbol_function(EQL), ZERO_INTEGER) : NIL;
        final SubLObject direct_edges = (NIL != gather_edgesP) ? set.new_set(symbol_function(EQL), ZERO_INTEGER) : NIL;
        SubLObject source_nodes = NIL;
        SubLObject target_nodes = NIL;
        SubLObject target_set = NIL;
        if (length(left_nodes).numLE(length(right_nodes))) {
            source_nodes = left_nodes;
            target_nodes = right_nodes;
        } else {
            source_nodes = right_nodes;
            target_nodes = left_nodes;
        }
        target_set = set_utilities.construct_set_from_list(target_nodes, symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = source_nodes;
        SubLObject source_node = NIL;
        source_node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = $rtv_predicates$.currentBinding(thread);
            try {
                $rtv_predicates$.bind(predicates, thread);
                SubLObject cdolist_list_var_$14 = $list49;
                SubLObject index_arg = NIL;
                index_arg = cdolist_list_var_$14.first();
                while (NIL != cdolist_list_var_$14) {
                    SubLObject cdolist_list_var_$15 = rtv_accessible_edges(source_node, index_arg);
                    SubLObject direct_edge = NIL;
                    direct_edge = cdolist_list_var_$15.first();
                    while (NIL != cdolist_list_var_$15) {
                        final SubLObject gather_arg = (index_arg.numE(ONE_INTEGER)) ? TWO_INTEGER : ONE_INTEGER;
                        final SubLObject candidate_node = assertions_high.gaf_arg(direct_edge, gather_arg);
                        if (NIL != set.set_memberP(candidate_node, target_set)) {
                            if (NIL != gather_edgesP) {
                                set.set_add(direct_edge, direct_edges);
                            }
                            if (NIL != gather_nodesP) {
                                set.set_add(source_node, linked_nodes);
                                set.set_add(candidate_node, linked_nodes);
                            }
                        }
                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                        direct_edge = cdolist_list_var_$15.first();
                    } 
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    index_arg = cdolist_list_var_$14.first();
                } 
            } finally {
                $rtv_predicates$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            source_node = cdolist_list_var.first();
        } 
        if (return_type.eql($NODES)) {
            return set.set_element_list(linked_nodes);
        }
        if (return_type.eql($EDGES)) {
            return set.set_element_list(direct_edges);
        }
        return Errors.error($str48$Unexpected_return_type___S, return_type);
    }

    public static SubLObject rtv_walk_between_nodes_internal(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type) {
        SubLObject full_solution = NIL;
        SubLObject end_var;
        SubLObject n;
        SubLObject partial_solution;
        for (end_var = number_utilities.f_1X(length), n = NIL, n = ZERO_INTEGER; !n.numGE(end_var); n = number_utilities.f_1X(n)) {
            partial_solution = rtv_walk_between_nodes_of_length(left_nodes, right_nodes, predicates, n, return_type);
            if (n.isZero()) {
                full_solution = partial_solution;
            } else {
                full_solution = rtv_union(full_solution, partial_solution);
            }
        }
        return full_solution;
    }

    public static SubLObject rtv_walk_between_nodes_of_length(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, final SubLObject return_type) {
        final SubLObject node_level_lists = rtv_walk_node_levels(left_nodes, right_nodes, predicates, length);
        final SubLObject node_level_sets = Mapping.mapcar(symbol_function(MAKE_SET_FROM_LIST), node_level_lists);
        final SubLObject relevant_edge_map = rtv_walk_relevant_edge_map(node_level_sets, predicates);
        final SubLObject length_solution = rtv_walk_across_node_levels(node_level_sets, relevant_edge_map, return_type);
        return length_solution;
    }

    public static SubLObject rtv_walk_node_levels(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length) {
        return rtv_walk_node_levels_recursive(ZERO_INTEGER, length, left_nodes, right_nodes, predicates);
    }

    public static SubLObject rtv_walk_node_levels_recursive(final SubLObject left_level, final SubLObject right_level, final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject length = subtract(right_level, left_level);
        if (ZERO_INTEGER.numE(length)) {
            final SubLObject level_nodes = rtv_intersection(left_nodes, right_nodes);
            return list(level_nodes);
        }
        if (ONE_INTEGER.numE(length)) {
            thread.resetMultipleValues();
            final SubLObject connected_left_nodes = rtv_directly_connected_node_subsets(left_nodes, right_nodes, predicates);
            final SubLObject connected_right_nodes = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return list(connected_left_nodes, connected_right_nodes);
        }
        thread.resetMultipleValues();
        final SubLObject left_length = rtv_length_to_islands(length, length(left_nodes), length(right_nodes));
        final SubLObject right_length = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject horizon_from_left = rtv_walk_from_nodes_internal(left_nodes, predicates, left_length, $NODES);
        final SubLObject horizon_from_right = rtv_walk_from_nodes_internal(right_nodes, predicates, right_length, $NODES);
        final SubLObject island_nodes = rtv_intersection(horizon_from_left, horizon_from_right);
        final SubLObject island_level = add(left_level, left_length);
        final SubLObject left_subsolution = rtv_walk_node_levels_recursive(left_level, island_level, left_nodes, island_nodes, predicates);
        final SubLObject right_subsolution = rtv_walk_node_levels_recursive(island_level, right_level, island_nodes, right_nodes, predicates);
        final SubLObject left_node_levels = butlast(left_subsolution, UNPROVIDED);
        final SubLObject island_node_level_left = list_utilities.last_one(left_subsolution);
        final SubLObject island_node_level_right = right_subsolution.first();
        final SubLObject right_node_levels = right_subsolution.rest();
        final SubLObject island_node_level = rtv_intersection(island_node_level_left, island_node_level_right);
        final SubLObject full_solution = append(left_node_levels, list(island_node_level), right_node_levels);
        return full_solution;
    }

    public static SubLObject rtv_directly_connected_node_subsets(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject connected_source_set = set.new_set(symbol_function(EQL), ZERO_INTEGER);
        final SubLObject connected_target_set = set.new_set(symbol_function(EQL), ZERO_INTEGER);
        SubLObject source_nodes = NIL;
        SubLObject target_nodes = NIL;
        SubLObject swappedP = NIL;
        SubLObject target_set = NIL;
        if (length(left_nodes).numLE(length(right_nodes))) {
            source_nodes = left_nodes;
            target_nodes = right_nodes;
            swappedP = NIL;
        } else {
            source_nodes = right_nodes;
            target_nodes = left_nodes;
            swappedP = T;
        }
        target_set = set_utilities.construct_set_from_list(target_nodes, symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = source_nodes;
        SubLObject source_node = NIL;
        source_node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = $rtv_predicates$.currentBinding(thread);
            try {
                $rtv_predicates$.bind(predicates, thread);
                SubLObject cdolist_list_var_$16 = $list49;
                SubLObject index_arg = NIL;
                index_arg = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    SubLObject cdolist_list_var_$17 = rtv_accessible_edges(source_node, index_arg);
                    SubLObject direct_edge = NIL;
                    direct_edge = cdolist_list_var_$17.first();
                    while (NIL != cdolist_list_var_$17) {
                        final SubLObject gather_arg = (index_arg.numE(ONE_INTEGER)) ? TWO_INTEGER : ONE_INTEGER;
                        final SubLObject candidate_node = assertions_high.gaf_arg(direct_edge, gather_arg);
                        if (NIL != set.set_memberP(candidate_node, target_set)) {
                            set.set_add(source_node, connected_source_set);
                            set.set_add(candidate_node, connected_target_set);
                        }
                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                        direct_edge = cdolist_list_var_$17.first();
                    } 
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    index_arg = cdolist_list_var_$16.first();
                } 
            } finally {
                $rtv_predicates$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            source_node = cdolist_list_var.first();
        } 
        final SubLObject connected_left_nodes = set.set_element_list(NIL != swappedP ? connected_target_set : connected_source_set);
        final SubLObject connected_right_nodes = set.set_element_list(NIL != swappedP ? connected_source_set : connected_target_set);
        return values(connected_left_nodes, connected_right_nodes);
    }

    public static SubLObject rtv_walk_relevant_edge_map(final SubLObject node_level_sets, final SubLObject predicates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject length = number_utilities.f_1_(length(node_level_sets));
        final SubLObject left_size = set.set_size(node_level_sets.first());
        final SubLObject right_size = set.set_size(list_utilities.last_one(node_level_sets));
        thread.resetMultipleValues();
        final SubLObject left_length = rtv_length_to_islands(length, left_size, right_size);
        final SubLObject right_length = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject left_node_level_sets = list_utilities.first_n(number_utilities.f_1X(left_length), node_level_sets);
        final SubLObject right_node_level_sets = list_utilities.first_n(number_utilities.f_1X(right_length), reverse(node_level_sets));
        final SubLObject edge_map = make_hash_table(number_utilities.summation(Mapping.mapcar(symbol_function(SET_SIZE), node_level_sets)), symbol_function(EQL), UNPROVIDED);
        rtv_walk_relevant_edge_map_recursive(left_node_level_sets, predicates, edge_map);
        rtv_walk_relevant_edge_map_recursive(right_node_level_sets, predicates, edge_map);
        return edge_map;
    }

    public static SubLObject rtv_walk_relevant_edge_map_recursive(final SubLObject node_level_sets, final SubLObject predicates, final SubLObject edge_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != node_level_sets) {
            SubLObject source_set = NIL;
            SubLObject rest_node_level_sets = NIL;
            destructuring_bind_must_consp(node_level_sets, node_level_sets, $list52);
            source_set = node_level_sets.first();
            final SubLObject current = rest_node_level_sets = node_level_sets.rest();
            if (NIL != rest_node_level_sets) {
                final SubLObject target_set = rest_node_level_sets.first();
                final SubLObject set_contents_var = set.do_set_internal(source_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject source_node;
                SubLObject _prev_bind_0;
                SubLObject cdolist_list_var;
                SubLObject index_arg;
                SubLObject cdolist_list_var_$18;
                SubLObject direct_edge;
                SubLObject gather_arg;
                SubLObject target_node;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    source_node = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, source_node)) {
                        _prev_bind_0 = $rtv_predicates$.currentBinding(thread);
                        try {
                            $rtv_predicates$.bind(predicates, thread);
                            cdolist_list_var = $list49;
                            index_arg = NIL;
                            index_arg = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cdolist_list_var_$18 = rtv_accessible_edges(source_node, index_arg);
                                direct_edge = NIL;
                                direct_edge = cdolist_list_var_$18.first();
                                while (NIL != cdolist_list_var_$18) {
                                    gather_arg = (index_arg.numE(ONE_INTEGER)) ? TWO_INTEGER : ONE_INTEGER;
                                    target_node = assertions_high.gaf_arg(direct_edge, gather_arg);
                                    if (NIL != set.set_memberP(target_node, target_set)) {
                                        rtv_walk_possibly_add_relevant_edge_to_map(edge_map, source_node, target_node, direct_edge);
                                        rtv_walk_possibly_add_relevant_edge_to_map(edge_map, target_node, source_node, direct_edge);
                                    }
                                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                    direct_edge = cdolist_list_var_$18.first();
                                } 
                                cdolist_list_var = cdolist_list_var.rest();
                                index_arg = cdolist_list_var.first();
                            } 
                        } finally {
                            $rtv_predicates$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                rtv_walk_relevant_edge_map_recursive(rest_node_level_sets, predicates, edge_map);
            }
        }
        return edge_map;
    }

    public static SubLObject rtv_walk_possibly_add_relevant_edge_to_map(final SubLObject edge_map, final SubLObject source_node, final SubLObject target_node, final SubLObject edge) {
        SubLObject target_map = map_utilities.map_get_without_values(edge_map, source_node, NIL);
        if (NIL == target_map) {
            target_map = dictionary.new_dictionary(symbol_function(EQL), ZERO_INTEGER);
            map_utilities.map_put(edge_map, source_node, target_map);
        }
        SubLObject edge_set = map_utilities.map_get_without_values(target_map, target_node, NIL);
        if (NIL == edge_set) {
            edge_set = set.new_set(symbol_function(EQL), ZERO_INTEGER);
            map_utilities.map_put(target_map, target_node, edge_set);
        }
        if (NIL == set.set_memberP(edge, edge_set)) {
            set.set_add(edge, edge_set);
            return T;
        }
        return NIL;
    }

    public static SubLObject rtv_walk_across_node_levels(final SubLObject node_levels, final SubLObject edge_map, final SubLObject return_type) {
        final SubLObject node_length = length(node_levels);
        final SubLObject node_path = make_vector(node_length, UNPROVIDED);
        final SubLObject result_set = set.new_set(symbol_function(EQL), ZERO_INTEGER);
        SubLObject first_node_level = NIL;
        SubLObject next_node_levels = NIL;
        destructuring_bind_must_consp(node_levels, node_levels, $list53);
        first_node_level = node_levels.first();
        final SubLObject current = next_node_levels = node_levels.rest();
        final SubLObject start_level = ZERO_INTEGER;
        final SubLObject set_contents_var = set.do_set_internal(first_node_level);
        SubLObject basis_object;
        SubLObject state;
        SubLObject start_node;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            start_node = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, start_node)) {
                set_aref(node_path, start_level, start_node);
                rtv_walk_across_node_levels_recursive(start_level, start_node, node_path, result_set, next_node_levels, edge_map, return_type);
            }
        }
        final SubLObject result = set.set_element_list(result_set);
        return result;
    }

    public static SubLObject rtv_walk_across_node_levels_recursive(final SubLObject current_level, final SubLObject current_node, final SubLObject node_path, final SubLObject result_set, final SubLObject node_levels, final SubLObject edge_map, final SubLObject return_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == node_levels) {
            rtv_update_result_set_from_path(result_set, node_path, current_level, edge_map, return_type);
        } else {
            final SubLObject next_level = number_utilities.f_1X(current_level);
            SubLObject next_node_level = NIL;
            SubLObject after_node_levels = NIL;
            destructuring_bind_must_consp(node_levels, node_levels, $list54);
            next_node_level = node_levels.first();
            final SubLObject current = after_node_levels = node_levels.rest();
            final SubLObject target_map = map_utilities.map_get_without_values(edge_map, current_node, NIL);
            if (NIL != target_map) {
                final SubLObject iterator = map_utilities.new_map_iterator(target_map);
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject current_$20;
                        final SubLObject datum_$19 = current_$20 = var;
                        SubLObject candidate_node = NIL;
                        SubLObject edge_set = NIL;
                        destructuring_bind_must_consp(current_$20, datum_$19, $list55);
                        candidate_node = current_$20.first();
                        current_$20 = current_$20.rest();
                        destructuring_bind_must_consp(current_$20, datum_$19, $list55);
                        edge_set = current_$20.first();
                        current_$20 = current_$20.rest();
                        if (NIL == current_$20) {
                            if (NIL != set.set_memberP(candidate_node, next_node_level)) {
                                set_aref(node_path, next_level, candidate_node);
                                if (NIL == find(candidate_node, node_path, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, next_level)) {
                                    rtv_walk_across_node_levels_recursive(next_level, candidate_node, node_path, result_set, after_node_levels, edge_map, return_type);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum_$19, $list55);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rtv_update_result_set_from_path(final SubLObject result_set, final SubLObject node_path, final SubLObject current_level, final SubLObject edge_map, final SubLObject return_type) {
        if (return_type.eql($NODES)) {
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject level;
            SubLObject node;
            for (length = length(node_path), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                level = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                node = aref(node_path, level);
                if (!level.numG(current_level)) {
                    set.set_add(node, result_set);
                }
            }
        } else
            if (return_type.eql($EDGES)) {
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject level;
                SubLObject target_node;
                SubLObject source_index;
                SubLObject source_node;
                SubLObject target_map;
                SubLObject edge_set;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject result_edge;
                for (length = length(node_path), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    level = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    target_node = aref(node_path, level);
                    if ((!level.numG(current_level)) && (!level.isZero())) {
                        source_index = number_utilities.f_1_(level);
                        source_node = aref(node_path, source_index);
                        target_map = map_utilities.map_get_without_values(edge_map, source_node, NIL);
                        if (NIL != target_map) {
                            edge_set = map_utilities.map_get_without_values(target_map, target_node, NIL);
                            if (NIL != edge_set) {
                                set_contents_var = set.do_set_internal(edge_set);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    result_edge = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, result_edge)) {
                                        set.set_add(result_edge, result_set);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                Errors.error($str48$Unexpected_return_type___S, return_type);
            }

        return result_set;
    }

    public static SubLObject new_rtv_all_nodes_from_node(final SubLObject source_node, final SubLObject predicates, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return rtv_all_nodes_from_nodes(list(source_node), predicates, length, mt);
    }

    public static SubLObject rtv_all_nodes_from_nodes(final SubLObject source_nodes, final SubLObject predicates, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject nodes = rtv_walk_from_nodes(source_nodes, predicates, length, $NODES, mt);
        return rtv_sort(nodes, $NODES);
    }

    public static SubLObject rtv_all_nodes_between_two_nodes(final SubLObject left_node, final SubLObject right_node, final SubLObject predicates, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return rtv_all_nodes_between_nodes(list(left_node), list(right_node), predicates, length, mt);
    }

    public static SubLObject rtv_all_nodes_between_nodes(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject nodes = rtv_walk_between_nodes(left_nodes, right_nodes, predicates, length, $NODES, mt);
        return rtv_sort(nodes, $NODES);
    }

    public static SubLObject new_rtv_all_edges_from_node(final SubLObject source_node, final SubLObject predicates, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return rtv_all_edges_from_nodes(list(source_node), predicates, length, mt);
    }

    public static SubLObject rtv_all_edges_from_nodes(final SubLObject source_nodes, final SubLObject predicates, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject edges = rtv_walk_from_nodes(source_nodes, predicates, length, $EDGES, mt);
        return rtv_sort(edges, $EDGES);
    }

    public static SubLObject rtv_all_edges_between_two_nodes(final SubLObject left_node, final SubLObject right_node, final SubLObject predicates, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return rtv_all_edges_between_nodes(list(left_node), list(right_node), predicates, length, mt);
    }

    public static SubLObject rtv_all_edges_between_nodes(final SubLObject left_nodes, final SubLObject right_nodes, final SubLObject predicates, final SubLObject length, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject edges = rtv_walk_between_nodes(left_nodes, right_nodes, predicates, length, $EDGES, mt);
        return rtv_sort(edges, $EDGES);
    }

    public static SubLObject rtv_all_edges_among(final SubLObject nodes, final SubLObject predicates, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node_set = set_utilities.construct_set_from_list(nodes, symbol_function(EQL), UNPROVIDED);
        final SubLObject edge_set = set.new_set(symbol_function(EQL), ZERO_INTEGER);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$21 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var = nodes;
                    SubLObject source_node = NIL;
                    source_node = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0_$22 = $rtv_predicates$.currentBinding(thread);
                        try {
                            $rtv_predicates$.bind(predicates, thread);
                            SubLObject cdolist_list_var_$23 = $list49;
                            SubLObject index_arg = NIL;
                            index_arg = cdolist_list_var_$23.first();
                            while (NIL != cdolist_list_var_$23) {
                                SubLObject cdolist_list_var_$24 = rtv_accessible_edges(source_node, index_arg);
                                SubLObject edge = NIL;
                                edge = cdolist_list_var_$24.first();
                                while (NIL != cdolist_list_var_$24) {
                                    final SubLObject gather_arg = (index_arg.numE(ONE_INTEGER)) ? TWO_INTEGER : ONE_INTEGER;
                                    final SubLObject target_node = assertions_high.gaf_arg(edge, gather_arg);
                                    if ((NIL != set.set_memberP(target_node, node_set)) && (NIL == set.set_memberP(edge, edge_set))) {
                                        set.set_add(edge, edge_set);
                                    }
                                    cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                                    edge = cdolist_list_var_$24.first();
                                } 
                                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                                index_arg = cdolist_list_var_$23.first();
                            } 
                        } finally {
                            $rtv_predicates$.rebind(_prev_bind_0_$22, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        source_node = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$21, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(edge_set);
    }

    public static SubLObject declare_rtv_file() {
        declareFunction("new_rtv_intersection_table", "NEW-RTV-INTERSECTION-TABLE", 0, 1, false);
        declareFunction("rtv_union", "RTV-UNION", 2, 0, false);
        declareFunction("rtv_intersection", "RTV-INTERSECTION", 2, 0, false);
        declareFunction("rtv_sort", "RTV-SORT", 1, 1, false);
        declareMacro("do_rtv_links", "DO-RTV-LINKS");
        declareFunction("rtv_accessible_edges_internal", "RTV-ACCESSIBLE-EDGES-INTERNAL", 2, 0, false);
        declareFunction("rtv_accessible_edges", "RTV-ACCESSIBLE-EDGES", 2, 0, false);
        declareMacro("do_rtv_edge_map_nodes", "DO-RTV-EDGE-MAP-NODES");
        declareMacro("do_rtv_edge_map_links", "DO-RTV-EDGE-MAP-LINKS");
        declareFunction("rtv_walk_from_nodes", "RTV-WALK-FROM-NODES", 4, 1, false);
        declareFunction("rtv_walk_from_nodes_internal", "RTV-WALK-FROM-NODES-INTERNAL", 4, 0, false);
        declareFunction("rtv_walk_between_nodes", "RTV-WALK-BETWEEN-NODES", 5, 1, false);
        declareFunction("rtv_length_to_islands", "RTV-LENGTH-TO-ISLANDS", 3, 0, false);
        declareFunction("rtv_walk_between_nodes_recursive", "RTV-WALK-BETWEEN-NODES-RECURSIVE", 5, 0, false);
        declareFunction("rtv_walk_between_nodes_directly", "RTV-WALK-BETWEEN-NODES-DIRECTLY", 4, 0, false);
        declareFunction("rtv_walk_between_nodes_internal", "RTV-WALK-BETWEEN-NODES-INTERNAL", 5, 0, false);
        declareFunction("rtv_walk_between_nodes_of_length", "RTV-WALK-BETWEEN-NODES-OF-LENGTH", 5, 0, false);
        declareFunction("rtv_walk_node_levels", "RTV-WALK-NODE-LEVELS", 4, 0, false);
        declareFunction("rtv_walk_node_levels_recursive", "RTV-WALK-NODE-LEVELS-RECURSIVE", 5, 0, false);
        declareFunction("rtv_directly_connected_node_subsets", "RTV-DIRECTLY-CONNECTED-NODE-SUBSETS", 3, 0, false);
        declareFunction("rtv_walk_relevant_edge_map", "RTV-WALK-RELEVANT-EDGE-MAP", 2, 0, false);
        declareFunction("rtv_walk_relevant_edge_map_recursive", "RTV-WALK-RELEVANT-EDGE-MAP-RECURSIVE", 3, 0, false);
        declareFunction("rtv_walk_possibly_add_relevant_edge_to_map", "RTV-WALK-POSSIBLY-ADD-RELEVANT-EDGE-TO-MAP", 4, 0, false);
        declareFunction("rtv_walk_across_node_levels", "RTV-WALK-ACROSS-NODE-LEVELS", 3, 0, false);
        declareFunction("rtv_walk_across_node_levels_recursive", "RTV-WALK-ACROSS-NODE-LEVELS-RECURSIVE", 7, 0, false);
        declareFunction("rtv_update_result_set_from_path", "RTV-UPDATE-RESULT-SET-FROM-PATH", 5, 0, false);
        declareFunction("new_rtv_all_nodes_from_node", "NEW-RTV-ALL-NODES-FROM-NODE", 3, 1, false);
        declareFunction("rtv_all_nodes_from_nodes", "RTV-ALL-NODES-FROM-NODES", 3, 1, false);
        declareFunction("rtv_all_nodes_between_two_nodes", "RTV-ALL-NODES-BETWEEN-TWO-NODES", 4, 1, false);
        declareFunction("rtv_all_nodes_between_nodes", "RTV-ALL-NODES-BETWEEN-NODES", 4, 1, false);
        declareFunction("new_rtv_all_edges_from_node", "NEW-RTV-ALL-EDGES-FROM-NODE", 3, 1, false);
        declareFunction("rtv_all_edges_from_nodes", "RTV-ALL-EDGES-FROM-NODES", 3, 1, false);
        declareFunction("rtv_all_edges_between_two_nodes", "RTV-ALL-EDGES-BETWEEN-TWO-NODES", 4, 1, false);
        declareFunction("rtv_all_edges_between_nodes", "RTV-ALL-EDGES-BETWEEN-NODES", 4, 1, false);
        declareFunction("rtv_all_edges_among", "RTV-ALL-EDGES-AMONG", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_rtv_file() {
        defvar("*RTV-INTERSECTION-TABLE*", $UNINITIALIZED);
        defparameter("*RTV-PREDICATES*", $UNINTIALIZED);
        defparameter("*RTV-WALK-PREVENT-LOOPS?*", T);
        return NIL;
    }

    public static SubLObject setup_rtv_file() {
        memoization_state.note_memoized_function(RTV_ACCESSIBLE_EDGES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rtv_file();
    }

    @Override
    public void initializeVariables() {
        init_rtv_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rtv_file();
    }

    static {




























































    }
}

/**
 * Total time: 435 ms
 */
