package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class negation_predicate extends SubLTranslatedFile {
    public static final SubLFile me = new negation_predicate();

    public static final String myName = "com.cyc.cycjava.cycl.negation_predicate";

    public static final String myFingerPrint = "223db5c1367843f53428a65305557e4905a795564f44608596d4ffb1b88ec902";

    private static final SubLObject $$negationPreds = reader_make_constant_shell(makeString("negationPreds"));

    private static final SubLObject $$negationInverse = reader_make_constant_shell(makeString("negationInverse"));

    private static final SubLSymbol ALL_NEGATION_PREDICATES_MEMOIZED = makeSymbol("ALL-NEGATION-PREDICATES-MEMOIZED");

    public static final SubLList $list3 = list(list(makeSymbol("NEGATION-PRED"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list4 = list(makeKeyword("MT"), makeKeyword("TV"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    private static final SubLSymbol ALL_NEGATION_PREDICATES = makeSymbol("ALL-NEGATION-PREDICATES");

    private static final SubLSymbol $sym11$NEGATION_PREDICATE__MEMOIZED = makeSymbol("NEGATION-PREDICATE?-MEMOIZED");

    private static final SubLSymbol $sym12$NEGATION_INVERSE__MEMOIZED = makeSymbol("NEGATION-INVERSE?-MEMOIZED");

    private static final SubLSymbol NEGATION_PREDICATE_AFTER_ADDING = makeSymbol("NEGATION-PREDICATE-AFTER-ADDING");

    private static final SubLSymbol NEGATION_INVERSE_AFTER_ADDING = makeSymbol("NEGATION-INVERSE-AFTER-ADDING");

    private static final SubLSymbol ADD_NEGATION_INVERSE = makeSymbol("ADD-NEGATION-INVERSE");

    private static final SubLSymbol NEGATION_PREDICATE_AFTER_REMOVING = makeSymbol("NEGATION-PREDICATE-AFTER-REMOVING");

    private static final SubLSymbol NEGATION_INVERSE_AFTER_REMOVING = makeSymbol("NEGATION-INVERSE-AFTER-REMOVING");

    private static final SubLSymbol REMOVE_NEGATION_INVERSE = makeSymbol("REMOVE-NEGATION-INVERSE");

    public static SubLObject local_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt, tv, UNPROVIDED);
    }

    public static SubLObject local_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt, tv, UNPROVIDED);
    }

    public static SubLObject local_max_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt, tv);
    }

    public static SubLObject local_max_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt, tv);
    }

    public static SubLObject local_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt, tv, UNPROVIDED);
    }

    public static SubLObject local_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt, tv, UNPROVIDED);
    }

    public static SubLObject local_min_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt, tv);
    }

    public static SubLObject local_min_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt, tv);
    }

    public static SubLObject all_negation_predicates_memoized_internal(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return all_negation_predicates(pred, mt, tv);
    }

    public static SubLObject all_negation_predicates_memoized(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return all_negation_predicates_memoized_internal(pred, mt, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_NEGATION_PREDICATES_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_NEGATION_PREDICATES_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ALL_NEGATION_PREDICATES_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, mt, tv);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && tv.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(all_negation_predicates_memoized_internal(pred, mt, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt, tv));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject all_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt, tv);
    }

    public static SubLObject do_all_negation_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject negation_pred = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        negation_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list3);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list3);
            if (NIL == member(current_$1, $list4, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list3);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject tv_tail = property_list_member($TV, current);
        final SubLObject tv = (NIL != tv_tail) ? cadr(tv_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(negation_pred, list(ALL_NEGATION_PREDICATES, pred, mt, tv), $DONE, done), append(body, NIL));
    }

    public static SubLObject all_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return all_negation_predicates(pred, mt, UNPROVIDED);
    }

    public static SubLObject all_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt, tv);
    }

    public static SubLObject all_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt, tv);
    }

    public static SubLObject all_not_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return all_not_negation_predicates(pred, mt, UNPROVIDED);
    }

    public static SubLObject all_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_false_nodes(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt, tv);
    }

    public static SubLObject max_all_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt, tv);
    }

    public static SubLObject negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return max_all_negation_predicates(pred, mt, UNPROVIDED);
    }

    public static SubLObject max_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return max_all_negation_predicates(pred, mt, UNPROVIDED);
    }

    public static SubLObject max_negation_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return max_all_negation_predicates(pred, mt, UNPROVIDED);
    }

    public static SubLObject max_all_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt, tv);
    }

    public static SubLObject max_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return max_all_negation_inverses(pred, mt, UNPROVIDED);
    }

    public static SubLObject min_all_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_implied_min_false_disjoins(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt, tv);
    }

    public static SubLObject min_implied_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module($$negationPreds)), pred, mt, tv);
    }

    public static SubLObject min_all_asserted_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_asserted_false_disjoins(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt, tv);
    }

    public static SubLObject not_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return min_all_not_negation_predicates(pred, mt, UNPROVIDED);
    }

    public static SubLObject min_not_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return min_all_not_negation_predicates(pred, mt, UNPROVIDED);
    }

    public static SubLObject min_not_negation_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return min_all_not_negation_predicates(pred, mt, UNPROVIDED);
    }

    public static SubLObject min_all_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_implied_min_false_disjoins(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt, tv);
    }

    public static SubLObject min_implied_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module($$negationInverse)), pred, mt, tv);
    }

    public static SubLObject min_all_asserted_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_min_asserted_false_disjoins(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt, tv);
    }

    public static SubLObject min_not_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return min_all_not_negation_inverses(pred, mt, UNPROVIDED);
    }

    public static SubLObject negation_predicateP_memoized_internal(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return negation_predicateP(pred1, pred2, mt, tv);
    }

    public static SubLObject negation_predicateP_memoized(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return negation_predicateP_memoized_internal(pred1, pred2, mt, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym11$NEGATION_PREDICATE__MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym11$NEGATION_PREDICATE__MEMOIZED, FOUR_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym11$NEGATION_PREDICATE__MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(pred1, pred2, mt, tv);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred1.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred2.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && tv.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(negation_predicateP_memoized_internal(pred1, pred2, mt, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred1, pred2, mt, tv));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject negation_predicateP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$negationPreds), pred1, pred2, mt, tv);
    }

    public static SubLObject negation_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return negation_predicateP(pred1, pred2, mt, UNPROVIDED);
    }

    public static SubLObject negation_inverseP_memoized_internal(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return negation_inverseP(pred1, pred2, mt, tv);
    }

    public static SubLObject negation_inverseP_memoized(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return negation_inverseP_memoized_internal(pred1, pred2, mt, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym12$NEGATION_INVERSE__MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym12$NEGATION_INVERSE__MEMOIZED, FOUR_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym12$NEGATION_INVERSE__MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(pred1, pred2, mt, tv);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred1.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred2.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && tv.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(negation_inverseP_memoized_internal(pred1, pred2, mt, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred1, pred2, mt, tv));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject negation_inverseP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$negationInverse), pred1, pred2, mt, tv);
    }

    public static SubLObject not_negation_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return not_negation_predicateP(pred1, pred2, mt, UNPROVIDED);
    }

    public static SubLObject not_negation_predicateP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$negationPreds), pred1, pred2, mt, tv);
    }

    public static SubLObject not_negation_inverseP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$negationInverse), pred1, pred2, mt, tv);
    }

    public static SubLObject some_negation_pred_or_inverseP(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return list_utilities.sublisp_boolean(some_negation_pred_or_inverse(pred, mt, tv));
    }

    public static SubLObject some_negation_pred_or_inverse(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_methods.sbhl_gather_first_true_disjoin(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt, tv);
    }

    public static SubLObject basis_for_not_negation_predP(final SubLObject predicate1, final SubLObject predicate2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_not_negation_predP = NIL;
        if (predicate1.eql(predicate2)) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$assume_sbhl_extensions_nonempty$.currentBinding(thread);
            try {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.bind(NIL, thread);
                known_not_negation_predP = not_negation_predP(predicate1, predicate2, mt);
            } finally {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean((predicate1.eql(predicate2) && (NIL != known_not_negation_predP)) || ((!predicate1.eql(predicate2)) && (NIL != not_negation_predP(predicate1, predicate2, mt))));
    }

    public static SubLObject basis_for_not_negation_inverseP(final SubLObject predicate1, final SubLObject predicate2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_not_negation_inverseP = NIL;
        if (predicate1.eql(predicate2)) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$assume_sbhl_extensions_nonempty$.currentBinding(thread);
            try {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.bind(NIL, thread);
                known_not_negation_inverseP = not_negation_inverseP(predicate1, predicate2, mt, UNPROVIDED);
            } finally {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean((predicate1.eql(predicate2) && (NIL != known_not_negation_inverseP)) || ((!predicate1.eql(predicate2)) && (NIL != not_negation_inverseP(predicate1, predicate2, mt, UNPROVIDED))));
    }

    public static SubLObject why_negation_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$negationPreds), pred1, pred2, mt, tv, behavior);
    }

    public static SubLObject why_negation_inverseP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module($$negationInverse), pred1, pred2, mt, tv, behavior);
    }

    public static SubLObject max_floor_mts_of_negation_predicate_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$negationPreds), pred1, pred2, tv);
    }

    public static SubLObject max_floor_mts_of_negation_pred_paths(final SubLObject pred1, final SubLObject pred2) {
        return max_floor_mts_of_negation_predicate_paths(pred1, pred2, UNPROVIDED);
    }

    public static SubLObject min_mts_of_negation_predicate_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$negationPreds), pred1, pred2, tv);
    }

    public static SubLObject min_mts_of_negation_pred_paths(final SubLObject pred1, final SubLObject pred2) {
        return min_mts_of_negation_predicate_paths(pred1, pred2, UNPROVIDED);
    }

    public static SubLObject max_floor_mts_of_not_negation_predicate_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module($$negationPreds), pred2, pred1, tv);
    }

    public static SubLObject min_mts_of_not_negation_predicate_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module($$negationPreds), pred2, pred1, tv);
    }

    public static SubLObject max_floor_mts_of_negation_inverse_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$negationInverse), pred1, pred2, tv);
    }

    public static SubLObject min_mts_of_negation_inverse_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module($$negationInverse), pred1, pred2, tv);
    }

    public static SubLObject max_floor_mts_of_not_negation_inverse_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module($$negationInverse), pred2, pred1, tv);
    }

    public static SubLObject min_mts_of_not_negation_inverse_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module($$negationInverse), pred2, pred1, tv);
    }

    public static SubLObject negation_predicate_mts(final SubLObject pred) {
        return kb_accessors.pred_mts(pred, $$negationPreds, UNPROVIDED);
    }

    public static SubLObject asserted_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt);
    }

    public static SubLObject asserted_not_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt);
    }

    public static SubLObject supported_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt);
    }

    public static SubLObject supported_not_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$negationPreds), pred, mt);
    }

    public static SubLObject negation_inverse_mts(final SubLObject pred) {
        return kb_accessors.pred_mts(pred, sbhl_module_vars.get_sbhl_module($$negationInverse), UNPROVIDED);
    }

    public static SubLObject asserted_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt);
    }

    public static SubLObject asserted_not_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt);
    }

    public static SubLObject supported_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt);
    }

    public static SubLObject supported_not_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module($$negationInverse), pred, mt);
    }

    public static SubLObject negation_predicate_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$negationPreds));
        return NIL;
    }

    public static SubLObject negation_inverse_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($$negationInverse));
        return NIL;
    }

    public static SubLObject add_negation_inverse(SubLObject source, final SubLObject assertion) {
        negation_inverse_after_adding(source, assertion);
        return NIL;
    }

    public static SubLObject negation_predicate_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$negationPreds));
        return NIL;
    }

    public static SubLObject negation_inverse_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($$negationInverse));
        return NIL;
    }

    public static SubLObject remove_negation_inverse(SubLObject source, final SubLObject assertion) {
        negation_inverse_after_removing(source, assertion);
        return NIL;
    }

    public static SubLObject clear_negation_predicate_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$negationPreds));
        return NIL;
    }

    public static SubLObject clear_negation_inverse_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module($$negationInverse));
        return NIL;
    }

    public static SubLObject clear_node_negation_predicate_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$negationPreds), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$negationPreds)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$negationPreds)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$negationPreds), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$negationPreds), node);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.predicateP(node)) {
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

    public static SubLObject clear_node_negation_inverse_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$negationInverse), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$negationInverse)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$negationInverse)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$negationInverse), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module($$negationInverse), node);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != fort_types_interface.predicateP(node)) {
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

    public static SubLObject reset_negation_predicate_links(final SubLObject pred) {
        final SubLObject mts = negation_predicate_mts(pred);
        clear_node_negation_predicate_links(pred);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.predicateP(pred)) {
                reset_negation_predicate_links_in_mt(pred, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reset_negation_inverse_links(final SubLObject pred) {
        final SubLObject mts = negation_inverse_mts(pred);
        clear_node_negation_inverse_links(pred);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.predicateP(pred)) {
                reset_negation_inverse_links_in_mt(pred, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reset_negation_predicate_links_in_mt(final SubLObject pred, final SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(pred, mt, sbhl_module_vars.get_sbhl_module($$negationPreds));
        return NIL;
    }

    public static SubLObject reset_negation_inverse_links_in_mt(final SubLObject pred, final SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(pred, mt, sbhl_module_vars.get_sbhl_module($$negationInverse));
        return NIL;
    }

    public static SubLObject reset_negation_predicate_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            clear_negation_predicate_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$negationPreds));
        return NIL;
    }

    public static SubLObject reset_negation_inverse_graph(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (NIL != clearP) {
            clear_negation_inverse_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module($$negationInverse));
        return NIL;
    }

    public static SubLObject declare_negation_predicate_file() {
        declareFunction(me, "local_negation_predicates", "LOCAL-NEGATION-PREDICATES", 1, 2, false);
        declareFunction(me, "local_negation_inverses", "LOCAL-NEGATION-INVERSES", 1, 2, false);
        declareFunction(me, "local_max_negation_predicates", "LOCAL-MAX-NEGATION-PREDICATES", 1, 2, false);
        declareFunction(me, "local_max_negation_inverses", "LOCAL-MAX-NEGATION-INVERSES", 1, 2, false);
        declareFunction(me, "local_not_negation_predicates", "LOCAL-NOT-NEGATION-PREDICATES", 1, 2, false);
        declareFunction(me, "local_not_negation_inverses", "LOCAL-NOT-NEGATION-INVERSES", 1, 2, false);
        declareFunction(me, "local_min_not_negation_predicates", "LOCAL-MIN-NOT-NEGATION-PREDICATES", 1, 2, false);
        declareFunction(me, "local_min_not_negation_inverses", "LOCAL-MIN-NOT-NEGATION-INVERSES", 1, 2, false);
        declareFunction(me, "all_negation_predicates_memoized_internal", "ALL-NEGATION-PREDICATES-MEMOIZED-INTERNAL", 1, 2, false);
        declareFunction(me, "all_negation_predicates_memoized", "ALL-NEGATION-PREDICATES-MEMOIZED", 1, 2, false);
        declareFunction(me, "all_negation_predicates", "ALL-NEGATION-PREDICATES", 1, 2, false);
        declareMacro(me, "do_all_negation_predicates", "DO-ALL-NEGATION-PREDICATES");
        declareFunction(me, "all_negation_preds", "ALL-NEGATION-PREDS", 1, 1, false);
        declareFunction(me, "all_negation_inverses", "ALL-NEGATION-INVERSES", 1, 2, false);
        declareFunction(me, "all_not_negation_predicates", "ALL-NOT-NEGATION-PREDICATES", 1, 2, false);
        declareFunction(me, "all_not_negation_preds", "ALL-NOT-NEGATION-PREDS", 1, 1, false);
        declareFunction(me, "all_not_negation_inverses", "ALL-NOT-NEGATION-INVERSES", 1, 2, false);
        declareFunction(me, "max_all_negation_predicates", "MAX-ALL-NEGATION-PREDICATES", 1, 2, false);
        declareFunction(me, "negation_preds", "NEGATION-PREDS", 1, 1, false);
        declareFunction(me, "max_negation_preds", "MAX-NEGATION-PREDS", 1, 1, false);
        declareFunction(me, "max_negation_predicates", "MAX-NEGATION-PREDICATES", 1, 1, false);
        declareFunction(me, "max_all_negation_inverses", "MAX-ALL-NEGATION-INVERSES", 1, 2, false);
        declareFunction(me, "max_negation_inverses", "MAX-NEGATION-INVERSES", 1, 1, false);
        declareFunction(me, "min_all_not_negation_predicates", "MIN-ALL-NOT-NEGATION-PREDICATES", 1, 2, false);
        declareFunction(me, "min_implied_not_negation_predicates", "MIN-IMPLIED-NOT-NEGATION-PREDICATES", 1, 2, false);
        declareFunction(me, "min_all_asserted_not_negation_predicates", "MIN-ALL-ASSERTED-NOT-NEGATION-PREDICATES", 1, 2, false);
        declareFunction(me, "not_negation_preds", "NOT-NEGATION-PREDS", 1, 1, false);
        declareFunction(me, "min_not_negation_preds", "MIN-NOT-NEGATION-PREDS", 1, 1, false);
        declareFunction(me, "min_not_negation_predicates", "MIN-NOT-NEGATION-PREDICATES", 1, 1, false);
        declareFunction(me, "min_all_not_negation_inverses", "MIN-ALL-NOT-NEGATION-INVERSES", 1, 2, false);
        declareFunction(me, "min_implied_not_negation_inverses", "MIN-IMPLIED-NOT-NEGATION-INVERSES", 1, 2, false);
        declareFunction(me, "min_all_asserted_not_negation_inverses", "MIN-ALL-ASSERTED-NOT-NEGATION-INVERSES", 1, 2, false);
        declareFunction(me, "min_not_negation_inverses", "MIN-NOT-NEGATION-INVERSES", 1, 1, false);
        declareFunction(me, "negation_predicateP_memoized_internal", "NEGATION-PREDICATE?-MEMOIZED-INTERNAL", 2, 2, false);
        declareFunction(me, "negation_predicateP_memoized", "NEGATION-PREDICATE?-MEMOIZED", 2, 2, false);
        declareFunction(me, "negation_predicateP", "NEGATION-PREDICATE?", 2, 2, false);
        declareFunction(me, "negation_predP", "NEGATION-PRED?", 2, 1, false);
        declareFunction(me, "negation_inverseP_memoized_internal", "NEGATION-INVERSE?-MEMOIZED-INTERNAL", 2, 2, false);
        declareFunction(me, "negation_inverseP_memoized", "NEGATION-INVERSE?-MEMOIZED", 2, 2, false);
        declareFunction(me, "negation_inverseP", "NEGATION-INVERSE?", 2, 2, false);
        declareFunction(me, "not_negation_predP", "NOT-NEGATION-PRED?", 2, 1, false);
        declareFunction(me, "not_negation_predicateP", "NOT-NEGATION-PREDICATE?", 2, 2, false);
        declareFunction(me, "not_negation_inverseP", "NOT-NEGATION-INVERSE?", 2, 2, false);
        declareFunction(me, "some_negation_pred_or_inverseP", "SOME-NEGATION-PRED-OR-INVERSE?", 1, 2, false);
        declareFunction(me, "some_negation_pred_or_inverse", "SOME-NEGATION-PRED-OR-INVERSE", 1, 2, false);
        declareFunction(me, "basis_for_not_negation_predP", "BASIS-FOR-NOT-NEGATION-PRED?", 2, 1, false);
        declareFunction(me, "basis_for_not_negation_inverseP", "BASIS-FOR-NOT-NEGATION-INVERSE?", 2, 1, false);
        declareFunction(me, "why_negation_predP", "WHY-NEGATION-PRED?", 2, 3, false);
        declareFunction(me, "why_negation_inverseP", "WHY-NEGATION-INVERSE?", 2, 3, false);
        declareFunction(me, "max_floor_mts_of_negation_predicate_paths", "MAX-FLOOR-MTS-OF-NEGATION-PREDICATE-PATHS", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_negation_pred_paths", "MAX-FLOOR-MTS-OF-NEGATION-PRED-PATHS", 2, 0, false);
        declareFunction(me, "min_mts_of_negation_predicate_paths", "MIN-MTS-OF-NEGATION-PREDICATE-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_negation_pred_paths", "MIN-MTS-OF-NEGATION-PRED-PATHS", 2, 0, false);
        declareFunction(me, "max_floor_mts_of_not_negation_predicate_paths", "MAX-FLOOR-MTS-OF-NOT-NEGATION-PREDICATE-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_not_negation_predicate_paths", "MIN-MTS-OF-NOT-NEGATION-PREDICATE-PATHS", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_negation_inverse_paths", "MAX-FLOOR-MTS-OF-NEGATION-INVERSE-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_negation_inverse_paths", "MIN-MTS-OF-NEGATION-INVERSE-PATHS", 2, 1, false);
        declareFunction(me, "max_floor_mts_of_not_negation_inverse_paths", "MAX-FLOOR-MTS-OF-NOT-NEGATION-INVERSE-PATHS", 2, 1, false);
        declareFunction(me, "min_mts_of_not_negation_inverse_paths", "MIN-MTS-OF-NOT-NEGATION-INVERSE-PATHS", 2, 1, false);
        declareFunction(me, "negation_predicate_mts", "NEGATION-PREDICATE-MTS", 1, 0, false);
        declareFunction(me, "asserted_negation_preds", "ASSERTED-NEGATION-PREDS", 1, 1, false);
        declareFunction(me, "asserted_not_negation_preds", "ASSERTED-NOT-NEGATION-PREDS", 1, 1, false);
        declareFunction(me, "supported_negation_preds", "SUPPORTED-NEGATION-PREDS", 1, 1, false);
        declareFunction(me, "supported_not_negation_preds", "SUPPORTED-NOT-NEGATION-PREDS", 1, 1, false);
        declareFunction(me, "negation_inverse_mts", "NEGATION-INVERSE-MTS", 1, 0, false);
        declareFunction(me, "asserted_negation_inverses", "ASSERTED-NEGATION-INVERSES", 1, 1, false);
        declareFunction(me, "asserted_not_negation_inverses", "ASSERTED-NOT-NEGATION-INVERSES", 1, 1, false);
        declareFunction(me, "supported_negation_inverses", "SUPPORTED-NEGATION-INVERSES", 1, 1, false);
        declareFunction(me, "supported_not_negation_inverses", "SUPPORTED-NOT-NEGATION-INVERSES", 1, 1, false);
        declareFunction(me, "negation_predicate_after_adding", "NEGATION-PREDICATE-AFTER-ADDING", 2, 0, false);
        declareFunction(me, "negation_inverse_after_adding", "NEGATION-INVERSE-AFTER-ADDING", 2, 0, false);
        declareFunction(me, "add_negation_inverse", "ADD-NEGATION-INVERSE", 2, 0, false);
        declareFunction(me, "negation_predicate_after_removing", "NEGATION-PREDICATE-AFTER-REMOVING", 2, 0, false);
        declareFunction(me, "negation_inverse_after_removing", "NEGATION-INVERSE-AFTER-REMOVING", 2, 0, false);
        declareFunction(me, "remove_negation_inverse", "REMOVE-NEGATION-INVERSE", 2, 0, false);
        declareFunction(me, "clear_negation_predicate_graph", "CLEAR-NEGATION-PREDICATE-GRAPH", 0, 0, false);
        declareFunction(me, "clear_negation_inverse_graph", "CLEAR-NEGATION-INVERSE-GRAPH", 0, 0, false);
        declareFunction(me, "clear_node_negation_predicate_links", "CLEAR-NODE-NEGATION-PREDICATE-LINKS", 1, 0, false);
        declareFunction(me, "clear_node_negation_inverse_links", "CLEAR-NODE-NEGATION-INVERSE-LINKS", 1, 0, false);
        declareFunction(me, "reset_negation_predicate_links", "RESET-NEGATION-PREDICATE-LINKS", 1, 0, false);
        declareFunction(me, "reset_negation_inverse_links", "RESET-NEGATION-INVERSE-LINKS", 1, 0, false);
        declareFunction(me, "reset_negation_predicate_links_in_mt", "RESET-NEGATION-PREDICATE-LINKS-IN-MT", 2, 0, false);
        declareFunction(me, "reset_negation_inverse_links_in_mt", "RESET-NEGATION-INVERSE-LINKS-IN-MT", 2, 0, false);
        declareFunction(me, "reset_negation_predicate_graph", "RESET-NEGATION-PREDICATE-GRAPH", 0, 1, false);
        declareFunction(me, "reset_negation_inverse_graph", "RESET-NEGATION-INVERSE-GRAPH", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_negation_predicate_file() {
        return NIL;
    }

    public static SubLObject setup_negation_predicate_file() {
        memoization_state.note_memoized_function(ALL_NEGATION_PREDICATES_MEMOIZED);
        memoization_state.note_memoized_function($sym11$NEGATION_PREDICATE__MEMOIZED);
        memoization_state.note_memoized_function($sym12$NEGATION_INVERSE__MEMOIZED);
        register_kb_function(NEGATION_PREDICATE_AFTER_ADDING);
        register_kb_function(NEGATION_INVERSE_AFTER_ADDING);
        register_kb_function(ADD_NEGATION_INVERSE);
        register_kb_function(NEGATION_PREDICATE_AFTER_REMOVING);
        register_kb_function(NEGATION_INVERSE_AFTER_REMOVING);
        register_kb_function(REMOVE_NEGATION_INVERSE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_negation_predicate_file();
    }

    @Override
    public void initializeVariables() {
        init_negation_predicate_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_negation_predicate_file();
    }

    
}

/**
 * Total time: 227 ms
 */
