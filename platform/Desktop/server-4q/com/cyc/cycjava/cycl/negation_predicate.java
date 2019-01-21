package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class negation_predicate extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.negation_predicate";
    public static final String myFingerPrint = "223db5c1367843f53428a65305557e4905a795564f44608596d4ffb1b88ec902";
    private static final SubLObject $const0$negationPreds;
    private static final SubLObject $const1$negationInverse;
    private static final SubLSymbol $sym2$ALL_NEGATION_PREDICATES_MEMOIZED;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw6$MT;
    private static final SubLSymbol $kw7$TV;
    private static final SubLSymbol $kw8$DONE;
    private static final SubLSymbol $sym9$DO_LIST;
    private static final SubLSymbol $sym10$ALL_NEGATION_PREDICATES;
    private static final SubLSymbol $sym11$NEGATION_PREDICATE__MEMOIZED;
    private static final SubLSymbol $sym12$NEGATION_INVERSE__MEMOIZED;
    private static final SubLSymbol $sym13$NEGATION_PREDICATE_AFTER_ADDING;
    private static final SubLSymbol $sym14$NEGATION_INVERSE_AFTER_ADDING;
    private static final SubLSymbol $sym15$ADD_NEGATION_INVERSE;
    private static final SubLSymbol $sym16$NEGATION_PREDICATE_AFTER_REMOVING;
    private static final SubLSymbol $sym17$NEGATION_INVERSE_AFTER_REMOVING;
    private static final SubLSymbol $sym18$REMOVE_NEGATION_INVERSE;
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 866L)
    public static SubLObject local_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt, tv, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 1340L)
    public static SubLObject local_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt, tv, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 1545L)
    public static SubLObject local_max_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 1781L)
    public static SubLObject local_max_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 2015L)
    public static SubLObject local_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt, tv, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 2230L)
    public static SubLObject local_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt, tv, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 2444L)
    public static SubLObject local_min_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 2689L)
    public static SubLObject local_min_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 2932L)
    public static SubLObject all_negation_predicates_memoized_internal(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return all_negation_predicates(pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 2932L)
    public static SubLObject all_negation_predicates_memoized(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)negation_predicate.NIL;
        if (negation_predicate.NIL == v_memoization_state) {
            return all_negation_predicates_memoized_internal(pred, mt, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)negation_predicate.$sym2$ALL_NEGATION_PREDICATES_MEMOIZED, (SubLObject)negation_predicate.UNPROVIDED);
        if (negation_predicate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)negation_predicate.$sym2$ALL_NEGATION_PREDICATES_MEMOIZED, (SubLObject)negation_predicate.THREE_INTEGER, (SubLObject)negation_predicate.NIL, (SubLObject)negation_predicate.EQUAL, (SubLObject)negation_predicate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)negation_predicate.$sym2$ALL_NEGATION_PREDICATES_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, mt, tv);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)negation_predicate.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)negation_predicate.NIL;
            collision = cdolist_list_var.first();
            while (negation_predicate.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (negation_predicate.NIL != cached_args && negation_predicate.NIL == cached_args.rest() && tv.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_negation_predicates_memoized_internal(pred, mt, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt, tv));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 3127L)
    public static SubLObject all_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 3317L)
    public static SubLObject do_all_negation_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)negation_predicate.$list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject negation_pred = (SubLObject)negation_predicate.NIL;
        SubLObject pred = (SubLObject)negation_predicate.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)negation_predicate.$list3);
        negation_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)negation_predicate.$list3);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)negation_predicate.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)negation_predicate.NIL;
        SubLObject current_$1 = (SubLObject)negation_predicate.NIL;
        while (negation_predicate.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)negation_predicate.$list3);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)negation_predicate.$list3);
            if (negation_predicate.NIL == conses_high.member(current_$1, (SubLObject)negation_predicate.$list4, (SubLObject)negation_predicate.UNPROVIDED, (SubLObject)negation_predicate.UNPROVIDED)) {
                bad = (SubLObject)negation_predicate.T;
            }
            if (current_$1 == negation_predicate.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (negation_predicate.NIL != bad && negation_predicate.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)negation_predicate.$list3);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)negation_predicate.$kw6$MT, current);
        final SubLObject mt = (SubLObject)((negation_predicate.NIL != mt_tail) ? conses_high.cadr(mt_tail) : negation_predicate.NIL);
        final SubLObject tv_tail = cdestructuring_bind.property_list_member((SubLObject)negation_predicate.$kw7$TV, current);
        final SubLObject tv = (SubLObject)((negation_predicate.NIL != tv_tail) ? conses_high.cadr(tv_tail) : negation_predicate.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)negation_predicate.$kw8$DONE, current);
        final SubLObject done = (SubLObject)((negation_predicate.NIL != done_tail) ? conses_high.cadr(done_tail) : negation_predicate.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)negation_predicate.$sym9$DO_LIST, (SubLObject)ConsesLow.list(negation_pred, (SubLObject)ConsesLow.list((SubLObject)negation_predicate.$sym10$ALL_NEGATION_PREDICATES, pred, mt, tv), (SubLObject)negation_predicate.$kw8$DONE, done), ConsesLow.append(body, (SubLObject)negation_predicate.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 3521L)
    public static SubLObject all_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return all_negation_predicates(pred, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 3625L)
    public static SubLObject all_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 3811L)
    public static SubLObject all_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_false_nodes(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 4013L)
    public static SubLObject all_not_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return all_not_negation_predicates(pred, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 4125L)
    public static SubLObject all_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_false_nodes(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 4324L)
    public static SubLObject max_all_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 4600L)
    public static SubLObject negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return max_all_negation_predicates(pred, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 4704L)
    public static SubLObject max_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return max_all_negation_predicates(pred, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 4811L)
    public static SubLObject max_negation_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return max_all_negation_predicates(pred, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 4923L)
    public static SubLObject max_all_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 5117L)
    public static SubLObject max_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return max_all_negation_inverses(pred, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 5226L)
    public static SubLObject min_all_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_implied_min_false_disjoins(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 5444L)
    public static SubLObject min_implied_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds)), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 5669L)
    public static SubLObject min_all_asserted_not_negation_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_min_asserted_false_disjoins(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 5927L)
    public static SubLObject not_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return min_all_not_negation_predicates(pred, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 6039L)
    public static SubLObject min_not_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return min_all_not_negation_predicates(pred, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 6154L)
    public static SubLObject min_not_negation_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return min_all_not_negation_predicates(pred, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 6274L)
    public static SubLObject min_all_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_implied_min_false_disjoins(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 6489L)
    public static SubLObject min_implied_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse)), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 6714L)
    public static SubLObject min_all_asserted_not_negation_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_min_asserted_false_disjoins(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 6970L)
    public static SubLObject min_not_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return min_all_not_negation_inverses(pred, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 7087L)
    public static SubLObject negation_predicateP_memoized_internal(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return negation_predicateP(pred1, pred2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 7087L)
    public static SubLObject negation_predicateP_memoized(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)negation_predicate.NIL;
        if (negation_predicate.NIL == v_memoization_state) {
            return negation_predicateP_memoized_internal(pred1, pred2, mt, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)negation_predicate.$sym11$NEGATION_PREDICATE__MEMOIZED, (SubLObject)negation_predicate.UNPROVIDED);
        if (negation_predicate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)negation_predicate.$sym11$NEGATION_PREDICATE__MEMOIZED, (SubLObject)negation_predicate.FOUR_INTEGER, (SubLObject)negation_predicate.NIL, (SubLObject)negation_predicate.EQL, (SubLObject)negation_predicate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)negation_predicate.$sym11$NEGATION_PREDICATE__MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(pred1, pred2, mt, tv);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)negation_predicate.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)negation_predicate.NIL;
            collision = cdolist_list_var.first();
            while (negation_predicate.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred1.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred2.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (negation_predicate.NIL != cached_args && negation_predicate.NIL == cached_args.rest() && tv.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(negation_predicateP_memoized_internal(pred1, pred2, mt, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred1, pred2, mt, tv));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 7686L)
    public static SubLObject negation_predicateP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred1, pred2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 7899L)
    public static SubLObject negation_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return negation_predicateP(pred1, pred2, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 8067L)
    public static SubLObject negation_inverseP_memoized_internal(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return negation_inverseP(pred1, pred2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 8067L)
    public static SubLObject negation_inverseP_memoized(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)negation_predicate.NIL;
        if (negation_predicate.NIL == v_memoization_state) {
            return negation_inverseP_memoized_internal(pred1, pred2, mt, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)negation_predicate.$sym12$NEGATION_INVERSE__MEMOIZED, (SubLObject)negation_predicate.UNPROVIDED);
        if (negation_predicate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)negation_predicate.$sym12$NEGATION_INVERSE__MEMOIZED, (SubLObject)negation_predicate.FOUR_INTEGER, (SubLObject)negation_predicate.NIL, (SubLObject)negation_predicate.EQL, (SubLObject)negation_predicate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)negation_predicate.$sym12$NEGATION_INVERSE__MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(pred1, pred2, mt, tv);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)negation_predicate.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)negation_predicate.NIL;
            collision = cdolist_list_var.first();
            while (negation_predicate.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred1.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred2.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (negation_predicate.NIL != cached_args && negation_predicate.NIL == cached_args.rest() && tv.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(negation_inverseP_memoized_internal(pred1, pred2, mt, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred1, pred2, mt, tv));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 8223L)
    public static SubLObject negation_inverseP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred1, pred2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 8434L)
    public static SubLObject not_negation_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return not_negation_predicateP(pred1, pred2, mt, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 8865L)
    public static SubLObject not_negation_predicateP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred1, pred2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 9083L)
    public static SubLObject not_negation_inverseP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred1, pred2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 9299L)
    public static SubLObject some_negation_pred_or_inverseP(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return list_utilities.sublisp_boolean(some_negation_pred_or_inverse(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 9549L)
    public static SubLObject some_negation_pred_or_inverse(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_methods.sbhl_gather_first_true_disjoin(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 9798L)
    public static SubLObject basis_for_not_negation_predP(final SubLObject predicate1, final SubLObject predicate2, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_not_negation_predP = (SubLObject)negation_predicate.NIL;
        if (predicate1.eql(predicate2)) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$assume_sbhl_extensions_nonempty$.currentBinding(thread);
            try {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.bind((SubLObject)negation_predicate.NIL, thread);
                known_not_negation_predP = not_negation_predP(predicate1, predicate2, mt);
            }
            finally {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((predicate1.eql(predicate2) && negation_predicate.NIL != known_not_negation_predP) || (!predicate1.eql(predicate2) && negation_predicate.NIL != not_negation_predP(predicate1, predicate2, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 10834L)
    public static SubLObject basis_for_not_negation_inverseP(final SubLObject predicate1, final SubLObject predicate2, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_not_negation_inverseP = (SubLObject)negation_predicate.NIL;
        if (predicate1.eql(predicate2)) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$assume_sbhl_extensions_nonempty$.currentBinding(thread);
            try {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.bind((SubLObject)negation_predicate.NIL, thread);
                known_not_negation_inverseP = not_negation_inverseP(predicate1, predicate2, mt, (SubLObject)negation_predicate.UNPROVIDED);
            }
            finally {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((predicate1.eql(predicate2) && negation_predicate.NIL != known_not_negation_inverseP) || (!predicate1.eql(predicate2) && negation_predicate.NIL != not_negation_inverseP(predicate1, predicate2, mt, (SubLObject)negation_predicate.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 11858L)
    public static SubLObject why_negation_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        if (behavior == negation_predicate.UNPROVIDED) {
            behavior = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred1, pred2, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 12142L)
    public static SubLObject why_negation_inverseP(final SubLObject pred1, final SubLObject pred2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        if (behavior == negation_predicate.UNPROVIDED) {
            behavior = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred1, pred2, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 12376L)
    public static SubLObject max_floor_mts_of_negation_predicate_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred1, pred2, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 12917L)
    public static SubLObject max_floor_mts_of_negation_pred_paths(final SubLObject pred1, final SubLObject pred2) {
        return max_floor_mts_of_negation_predicate_paths(pred1, pred2, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 13055L)
    public static SubLObject min_mts_of_negation_predicate_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred1, pred2, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 13336L)
    public static SubLObject min_mts_of_negation_pred_paths(final SubLObject pred1, final SubLObject pred2) {
        return min_mts_of_negation_predicate_paths(pred1, pred2, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 13462L)
    public static SubLObject max_floor_mts_of_not_negation_predicate_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred2, pred1, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 13818L)
    public static SubLObject min_mts_of_not_negation_predicate_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred2, pred1, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 14168L)
    public static SubLObject max_floor_mts_of_negation_inverse_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred1, pred2, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 14474L)
    public static SubLObject min_mts_of_negation_inverse_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred1, pred2, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 14754L)
    public static SubLObject max_floor_mts_of_not_negation_inverse_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred2, pred1, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 15056L)
    public static SubLObject min_mts_of_not_negation_inverse_paths(final SubLObject pred1, final SubLObject pred2, SubLObject tv) {
        if (tv == negation_predicate.UNPROVIDED) {
            tv = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred2, pred1, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 15352L)
    public static SubLObject negation_predicate_mts(final SubLObject pred) {
        return kb_accessors.pred_mts(pred, negation_predicate.$const0$negationPreds, (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 15650L)
    public static SubLObject asserted_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 15877L)
    public static SubLObject asserted_not_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 16110L)
    public static SubLObject supported_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 16340L)
    public static SubLObject supported_not_negation_preds(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 16576L)
    public static SubLObject negation_inverse_mts(final SubLObject pred) {
        return kb_accessors.pred_mts(pred, sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), (SubLObject)negation_predicate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 16777L)
    public static SubLObject asserted_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 17007L)
    public static SubLObject asserted_not_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 17243L)
    public static SubLObject supported_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 17476L)
    public static SubLObject supported_not_negation_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == negation_predicate.UNPROVIDED) {
            mt = (SubLObject)negation_predicate.NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 17716L)
    public static SubLObject negation_predicate_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds));
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 18223L)
    public static SubLObject negation_inverse_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse));
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 18441L)
    public static SubLObject add_negation_inverse(SubLObject source, final SubLObject assertion) {
        negation_inverse_after_adding(source, assertion);
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 18643L)
    public static SubLObject negation_predicate_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds));
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 18961L)
    public static SubLObject negation_inverse_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse));
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 19190L)
    public static SubLObject remove_negation_inverse(SubLObject source, final SubLObject assertion) {
        negation_inverse_after_removing(source, assertion);
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 19387L)
    public static SubLObject clear_negation_predicate_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds));
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 19715L)
    public static SubLObject clear_negation_inverse_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse));
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 19840L)
    public static SubLObject clear_node_negation_predicate_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)negation_predicate.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds), node);
            SubLObject mt = (SubLObject)negation_predicate.NIL;
            mt = cdolist_list_var.first();
            while (negation_predicate.NIL != cdolist_list_var) {
                if (negation_predicate.NIL != fort_types_interface.predicateP(node)) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(node, mt, (SubLObject)negation_predicate.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 20118L)
    public static SubLObject clear_node_negation_inverse_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)negation_predicate.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse), node);
            SubLObject mt = (SubLObject)negation_predicate.NIL;
            mt = cdolist_list_var.first();
            while (negation_predicate.NIL != cdolist_list_var) {
                if (negation_predicate.NIL != fort_types_interface.predicateP(node)) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(node, mt, (SubLObject)negation_predicate.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 20398L)
    public static SubLObject reset_negation_predicate_links(final SubLObject pred) {
        final SubLObject mts = negation_predicate_mts(pred);
        clear_node_negation_predicate_links(pred);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = (SubLObject)negation_predicate.NIL;
        mt = cdolist_list_var.first();
        while (negation_predicate.NIL != cdolist_list_var) {
            if (negation_predicate.NIL != fort_types_interface.predicateP(pred)) {
                reset_negation_predicate_links_in_mt(pred, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 20663L)
    public static SubLObject reset_negation_inverse_links(final SubLObject pred) {
        final SubLObject mts = negation_inverse_mts(pred);
        clear_node_negation_inverse_links(pred);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = (SubLObject)negation_predicate.NIL;
        mt = cdolist_list_var.first();
        while (negation_predicate.NIL != cdolist_list_var) {
            if (negation_predicate.NIL != fort_types_interface.predicateP(pred)) {
                reset_negation_inverse_links_in_mt(pred, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 20920L)
    public static SubLObject reset_negation_predicate_links_in_mt(final SubLObject pred, final SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(pred, mt, sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds));
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 21063L)
    public static SubLObject reset_negation_inverse_links_in_mt(final SubLObject pred, final SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(pred, mt, sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse));
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 21206L)
    public static SubLObject reset_negation_predicate_graph(SubLObject clearP) {
        if (clearP == negation_predicate.UNPROVIDED) {
            clearP = (SubLObject)negation_predicate.T;
        }
        if (negation_predicate.NIL != clearP) {
            clear_negation_predicate_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module(negation_predicate.$const0$negationPreds));
        return (SubLObject)negation_predicate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-predicate.lisp", position = 21409L)
    public static SubLObject reset_negation_inverse_graph(SubLObject clearP) {
        if (clearP == negation_predicate.UNPROVIDED) {
            clearP = (SubLObject)negation_predicate.T;
        }
        if (negation_predicate.NIL != clearP) {
            clear_negation_inverse_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module(negation_predicate.$const1$negationInverse));
        return (SubLObject)negation_predicate.NIL;
    }
    
    public static SubLObject declare_negation_predicate_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "local_negation_predicates", "LOCAL-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "local_negation_inverses", "LOCAL-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "local_max_negation_predicates", "LOCAL-MAX-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "local_max_negation_inverses", "LOCAL-MAX-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "local_not_negation_predicates", "LOCAL-NOT-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "local_not_negation_inverses", "LOCAL-NOT-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "local_min_not_negation_predicates", "LOCAL-MIN-NOT-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "local_min_not_negation_inverses", "LOCAL-MIN-NOT-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "all_negation_predicates_memoized_internal", "ALL-NEGATION-PREDICATES-MEMOIZED-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "all_negation_predicates_memoized", "ALL-NEGATION-PREDICATES-MEMOIZED", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "all_negation_predicates", "ALL-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.negation_predicate", "do_all_negation_predicates", "DO-ALL-NEGATION-PREDICATES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "all_negation_preds", "ALL-NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "all_negation_inverses", "ALL-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "all_not_negation_predicates", "ALL-NOT-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "all_not_negation_preds", "ALL-NOT-NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "all_not_negation_inverses", "ALL-NOT-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "max_all_negation_predicates", "MAX-ALL-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_preds", "NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "max_negation_preds", "MAX-NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "max_negation_predicates", "MAX-NEGATION-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "max_all_negation_inverses", "MAX-ALL-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "max_negation_inverses", "MAX-NEGATION-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_all_not_negation_predicates", "MIN-ALL-NOT-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_implied_not_negation_predicates", "MIN-IMPLIED-NOT-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_all_asserted_not_negation_predicates", "MIN-ALL-ASSERTED-NOT-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "not_negation_preds", "NOT-NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_not_negation_preds", "MIN-NOT-NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_not_negation_predicates", "MIN-NOT-NEGATION-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_all_not_negation_inverses", "MIN-ALL-NOT-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_implied_not_negation_inverses", "MIN-IMPLIED-NOT-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_all_asserted_not_negation_inverses", "MIN-ALL-ASSERTED-NOT-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_not_negation_inverses", "MIN-NOT-NEGATION-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_predicateP_memoized_internal", "NEGATION-PREDICATE?-MEMOIZED-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_predicateP_memoized", "NEGATION-PREDICATE?-MEMOIZED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_predicateP", "NEGATION-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_predP", "NEGATION-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_inverseP_memoized_internal", "NEGATION-INVERSE?-MEMOIZED-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_inverseP_memoized", "NEGATION-INVERSE?-MEMOIZED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_inverseP", "NEGATION-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "not_negation_predP", "NOT-NEGATION-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "not_negation_predicateP", "NOT-NEGATION-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "not_negation_inverseP", "NOT-NEGATION-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "some_negation_pred_or_inverseP", "SOME-NEGATION-PRED-OR-INVERSE?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "some_negation_pred_or_inverse", "SOME-NEGATION-PRED-OR-INVERSE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "basis_for_not_negation_predP", "BASIS-FOR-NOT-NEGATION-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "basis_for_not_negation_inverseP", "BASIS-FOR-NOT-NEGATION-INVERSE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "why_negation_predP", "WHY-NEGATION-PRED?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "why_negation_inverseP", "WHY-NEGATION-INVERSE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "max_floor_mts_of_negation_predicate_paths", "MAX-FLOOR-MTS-OF-NEGATION-PREDICATE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "max_floor_mts_of_negation_pred_paths", "MAX-FLOOR-MTS-OF-NEGATION-PRED-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_mts_of_negation_predicate_paths", "MIN-MTS-OF-NEGATION-PREDICATE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_mts_of_negation_pred_paths", "MIN-MTS-OF-NEGATION-PRED-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "max_floor_mts_of_not_negation_predicate_paths", "MAX-FLOOR-MTS-OF-NOT-NEGATION-PREDICATE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_mts_of_not_negation_predicate_paths", "MIN-MTS-OF-NOT-NEGATION-PREDICATE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "max_floor_mts_of_negation_inverse_paths", "MAX-FLOOR-MTS-OF-NEGATION-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_mts_of_negation_inverse_paths", "MIN-MTS-OF-NEGATION-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "max_floor_mts_of_not_negation_inverse_paths", "MAX-FLOOR-MTS-OF-NOT-NEGATION-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "min_mts_of_not_negation_inverse_paths", "MIN-MTS-OF-NOT-NEGATION-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_predicate_mts", "NEGATION-PREDICATE-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "asserted_negation_preds", "ASSERTED-NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "asserted_not_negation_preds", "ASSERTED-NOT-NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "supported_negation_preds", "SUPPORTED-NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "supported_not_negation_preds", "SUPPORTED-NOT-NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_inverse_mts", "NEGATION-INVERSE-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "asserted_negation_inverses", "ASSERTED-NEGATION-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "asserted_not_negation_inverses", "ASSERTED-NOT-NEGATION-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "supported_negation_inverses", "SUPPORTED-NEGATION-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "supported_not_negation_inverses", "SUPPORTED-NOT-NEGATION-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_predicate_after_adding", "NEGATION-PREDICATE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_inverse_after_adding", "NEGATION-INVERSE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "add_negation_inverse", "ADD-NEGATION-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_predicate_after_removing", "NEGATION-PREDICATE-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "negation_inverse_after_removing", "NEGATION-INVERSE-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "remove_negation_inverse", "REMOVE-NEGATION-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "clear_negation_predicate_graph", "CLEAR-NEGATION-PREDICATE-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "clear_negation_inverse_graph", "CLEAR-NEGATION-INVERSE-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "clear_node_negation_predicate_links", "CLEAR-NODE-NEGATION-PREDICATE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "clear_node_negation_inverse_links", "CLEAR-NODE-NEGATION-INVERSE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "reset_negation_predicate_links", "RESET-NEGATION-PREDICATE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "reset_negation_inverse_links", "RESET-NEGATION-INVERSE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "reset_negation_predicate_links_in_mt", "RESET-NEGATION-PREDICATE-LINKS-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "reset_negation_inverse_links_in_mt", "RESET-NEGATION-INVERSE-LINKS-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "reset_negation_predicate_graph", "RESET-NEGATION-PREDICATE-GRAPH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_predicate", "reset_negation_inverse_graph", "RESET-NEGATION-INVERSE-GRAPH", 0, 1, false);
        return (SubLObject)negation_predicate.NIL;
    }
    
    public static SubLObject init_negation_predicate_file() {
        return (SubLObject)negation_predicate.NIL;
    }
    
    public static SubLObject setup_negation_predicate_file() {
        memoization_state.note_memoized_function((SubLObject)negation_predicate.$sym2$ALL_NEGATION_PREDICATES_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)negation_predicate.$sym11$NEGATION_PREDICATE__MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)negation_predicate.$sym12$NEGATION_INVERSE__MEMOIZED);
        utilities_macros.register_kb_function((SubLObject)negation_predicate.$sym13$NEGATION_PREDICATE_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)negation_predicate.$sym14$NEGATION_INVERSE_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)negation_predicate.$sym15$ADD_NEGATION_INVERSE);
        utilities_macros.register_kb_function((SubLObject)negation_predicate.$sym16$NEGATION_PREDICATE_AFTER_REMOVING);
        utilities_macros.register_kb_function((SubLObject)negation_predicate.$sym17$NEGATION_INVERSE_AFTER_REMOVING);
        utilities_macros.register_kb_function((SubLObject)negation_predicate.$sym18$REMOVE_NEGATION_INVERSE);
        return (SubLObject)negation_predicate.NIL;
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
    
    static {
        me = (SubLFile)new negation_predicate();
        $const0$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $const1$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $sym2$ALL_NEGATION_PREDICATES_MEMOIZED = SubLObjectFactory.makeSymbol("ALL-NEGATION-PREDICATES-MEMOIZED");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATION-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw5$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw6$MT = SubLObjectFactory.makeKeyword("MT");
        $kw7$TV = SubLObjectFactory.makeKeyword("TV");
        $kw8$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym9$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym10$ALL_NEGATION_PREDICATES = SubLObjectFactory.makeSymbol("ALL-NEGATION-PREDICATES");
        $sym11$NEGATION_PREDICATE__MEMOIZED = SubLObjectFactory.makeSymbol("NEGATION-PREDICATE?-MEMOIZED");
        $sym12$NEGATION_INVERSE__MEMOIZED = SubLObjectFactory.makeSymbol("NEGATION-INVERSE?-MEMOIZED");
        $sym13$NEGATION_PREDICATE_AFTER_ADDING = SubLObjectFactory.makeSymbol("NEGATION-PREDICATE-AFTER-ADDING");
        $sym14$NEGATION_INVERSE_AFTER_ADDING = SubLObjectFactory.makeSymbol("NEGATION-INVERSE-AFTER-ADDING");
        $sym15$ADD_NEGATION_INVERSE = SubLObjectFactory.makeSymbol("ADD-NEGATION-INVERSE");
        $sym16$NEGATION_PREDICATE_AFTER_REMOVING = SubLObjectFactory.makeSymbol("NEGATION-PREDICATE-AFTER-REMOVING");
        $sym17$NEGATION_INVERSE_AFTER_REMOVING = SubLObjectFactory.makeSymbol("NEGATION-INVERSE-AFTER-REMOVING");
        $sym18$REMOVE_NEGATION_INVERSE = SubLObjectFactory.makeSymbol("REMOVE-NEGATION-INVERSE");
    }
}

/*

	Total time: 227 ms
	
*/