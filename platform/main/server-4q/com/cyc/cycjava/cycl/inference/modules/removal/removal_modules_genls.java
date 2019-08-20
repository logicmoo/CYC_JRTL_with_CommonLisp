package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_iterators;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_genls extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "5d2be9f0058338685071d2a13a2a9969d572416321d625912667306a205b8e4f";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2800L)
    private static SubLSymbol $default_superset_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 5300L)
    private static SubLSymbol $default_nat_all_genls_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 6400L)
    private static SubLSymbol $all_specs_lazy_iteration_threshold$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 7700L)
    private static SubLSymbol $default_not_superset_cost$;
    private static SubLObject $$genls;
    private static SubLSymbol $REMOVAL_BACKCHAIN_REQUIRED_PRUNE;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $ALL_SPECS_OF_FORT_POS;
    private static SubLList $list5;
    private static SubLSymbol $ALL_SPECS_OF_NON_FORT_POS;
    private static SubLList $list7;
    private static SubLSymbol $ALL_GENLS_POS;
    private static SubLList $list9;
    private static SubLSymbol $sym10$GENERALITY_ESTIMATE_;
    private static SubLSymbol $GENLS;
    private static SubLSymbol $REMOVAL_SUPERSET;
    private static SubLList $list13;
    private static SubLSymbol $REMOVAL_NAT_GENLS;
    private static SubLList $list15;
    private static SubLSymbol $REMOVAL_ALL_GENLS;
    private static SubLList $list17;
    private static SubLSymbol $REMOVAL_NAT_ALL_GENLS;
    private static SubLList $list19;
    private static SubLInteger $int$550;
    private static SubLSymbol $REMOVAL_ALL_SPECS;
    private static SubLList $list22;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $REMOVAL_NOT_SUPERSET;
    private static SubLList $list25;
    private static SubLSymbol $REMOVAL_GENLS_BETWEEN;
    private static SubLList $list27;
    private static SubLSymbol $sym28$BINARY_CLAUSE_P;
    private static SubLList $list29;
    private static SubLSymbol $sym30$FORT_P;
    private static SubLSymbol $COMPLETE;
    private static SubLSymbol $INCOMPLETE;
    private static SubLSymbol $sym33$REMOVAL_GENLS_BETWEEN_COMPLETENESS;
    private static SubLList $list34;
    private static SubLList $list35;
    private static SubLList $list36;
    private static SubLList $list37;
    private static SubLSymbol $REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK;
    private static SubLList $list39;
    private static SubLSymbol $REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK;
    private static SubLList $list41;
    private static SubLSymbol $QUERY;
    private static SubLObject $$unknownSentence;
    private static SubLObject $$and;
    private static SubLObject $$subsetOf;
    private static SubLObject $$genlsDown;
    private static SubLSymbol $REMOVAL_GENLS_DOWN_ARG2_BOUND;
    private static SubLList $list48;
    private static SubLSymbol $sym49$REMOVAL_GENLS_DOWN_ARG2_BOUND_COST;
    private static SubLSymbol $sym50$REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS;
    private static SubLSymbol $TRUE_DEF;
    private static SubLSymbol $sym52$REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND;
    private static SubLList $list53;
    private static SubLSymbol $REMOVAL_GENLS_DOWN_ARG2_UNIFY;
    private static SubLList $list55;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 1400L)
    public static SubLObject inference_genlP(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean(NIL != inference_trampolines.inference_collectionP(spec, mt) && (NIL != equals.equalsP(spec, genl, UNPROVIDED, UNPROVIDED) || (NIL != inference_trampolines.inference_collectionP(genl, mt) && NIL != genls.genlP(spec, genl, mt, tv))));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 1800L)
    public static SubLObject inference_not_genlP(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean(NIL == equals.equalsP(spec, genl, UNPROVIDED, UNPROVIDED) && NIL != inference_trampolines.inference_collectionP(spec, mt) && NIL != inference_trampolines.inference_collectionP(genl, mt) && NIL != genls.not_genlP(spec, genl, mt, tv));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2000L)
    public static SubLObject inference_all_genls(SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != inference_trampolines.inference_collectionP(spec, mt)) {
            return Sort.sort(genls.all_genls(spec, mt, tv), $sym10$GENERALITY_ESTIMATE_, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2200L)
    public static SubLObject inference_all_specs(SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != inference_trampolines.inference_collectionP(genl, mt)) {
            return genls.all_specs(genl, mt, tv);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2500L)
    public static SubLObject inference_genls_between(SubLObject lower_bound_col, SubLObject upper_bound_col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != inference_trampolines.inference_collectionP(lower_bound_col, UNPROVIDED) && NIL != inference_trampolines.inference_collectionP(upper_bound_col, UNPROVIDED)) {
                result = genls.all_genls_wrt(lower_bound_col, upper_bound_col, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2900L)
    public static SubLObject removal_superset_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != inference_genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($GENLS, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 3500L)
    public static SubLObject removal_nat_genls_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_superset_expand(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 4200L)
    public static SubLObject removal_all_genls_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 4400L)
    public static SubLObject removal_all_genls_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject collections = cdolist_list_var = inference_all_genls(subset, UNPROVIDED, UNPROVIDED);
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                SubLObject unify_arg2 = bindings.subst_bindings(v_bindings, arg2);
                SubLObject formula = list($$genls, subset, unify_arg2);
                backward.removal_add_node(arguments.make_hl_support($GENLS, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 5400L)
    public static SubLObject removal_nat_all_genls_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_all_genls_expand(asent, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 6000L)
    public static SubLObject removal_all_specs_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return Numbers.max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$genls));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 6500L)
    public static SubLObject removal_all_specs_iterator(SubLObject collection) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (cardinality_estimates.spec_cardinality(collection).numG($all_specs_lazy_iteration_threshold$.getDynamicValue(thread))) {
            return kb_iterators.new_specs_iterator(collection);
        }
        return iteration.new_list_iterator(inference_all_specs(collection, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 7800L)
    public static SubLObject removal_not_superset_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == inference_genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != inference_not_genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($GENLS, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 9600L)
    public static SubLObject removal_genls_between_applicability(SubLObject contextualized_dnf_clause) {
        return removal_sbhl_between_applicability(contextualized_dnf_clause, $$genls);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 10000L)
    public static SubLObject removal_genls_between_cost(SubLObject contextualized_dnf_clause) {
        assert NIL != clause_utilities.binary_clause_p(contextualized_dnf_clause) : contextualized_dnf_clause;
        SubLObject spec = NIL;
        SubLObject genl = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != variables.variable_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) {
                    spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                } else {
                    genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        assert NIL != forts.fort_p(spec) : spec;
        assert NIL != forts.fort_p(genl) : genl;
        SubLObject cardinality_diff = Numbers.subtract(cardinality_estimates.genl_cardinality(spec), cardinality_estimates.genl_cardinality(genl));
        return Numbers.max(ZERO_INTEGER, number_utilities.f_1X(cardinality_diff));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 10600L)
    public static SubLObject removal_genls_between_completeness() {
        return (NIL != kb_accessors.complete_extent_enumerableP($$genls, UNPROVIDED)) ? $COMPLETE : $INCOMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 10800L)
    public static SubLObject removal_genls_between_expand(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent0 = NIL;
        SubLObject contextualized_asent2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
        contextualized_asent0 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
        contextualized_asent2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$2;
            SubLObject datum_$1 = current_$2 = contextualized_asent0;
            SubLObject mt0 = NIL;
            SubLObject asent0 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, $list35);
            mt0 = current_$2.first();
            current_$2 = current_$2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, $list35);
            asent0 = current_$2.first();
            current_$2 = current_$2.rest();
            if (NIL == current_$2) {
                SubLObject current_$3;
                SubLObject datum_$2 = current_$3 = contextualized_asent2;
                SubLObject mt2 = NIL;
                SubLObject asent2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, $list36);
                mt2 = current_$3.first();
                current_$3 = current_$3.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, $list36);
                asent2 = current_$3.first();
                current_$3 = current_$3.rest();
                if (NIL == current_$3) {
                    if (mt0.equal(mt2)) {
                        thread.resetMultipleValues();
                        SubLObject lower_bound_asent = removal_genls_between_categorize_asents(asent0, asent2);
                        SubLObject upper_bound_asent = thread.secondMultipleValue();
                        SubLObject lower_firstP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject lower_bound = cycl_utilities.atomic_sentence_arg1(lower_bound_asent, UNPROVIDED);
                        SubLObject variable = cycl_utilities.atomic_sentence_arg2(lower_bound_asent, UNPROVIDED);
                        SubLObject upper_bound = cycl_utilities.atomic_sentence_arg2(upper_bound_asent, UNPROVIDED);
                        SubLObject cdolist_list_var = inference_genls_between(lower_bound, upper_bound, mt0);
                        SubLObject between_col = NIL;
                        between_col = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            thread.resetMultipleValues();
                            SubLObject v_bindings = unification_utilities.term_unify(variable, between_col, UNPROVIDED, UNPROVIDED);
                            SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                SubLObject lower_support_formula = el_utilities.make_binary_formula($$genls, lower_bound, between_col);
                                SubLObject upper_support_formula = el_utilities.make_binary_formula($$genls, between_col, upper_bound);
                                SubLObject lower_support = arguments.make_hl_support($GENLS, lower_support_formula, mt0, UNPROVIDED);
                                SubLObject upper_support = arguments.make_hl_support($GENLS, upper_support_formula, mt0, UNPROVIDED);
                                SubLObject lower_supports = list(lower_support);
                                SubLObject upper_supports = list(upper_support);
                                SubLObject justifications = (NIL != lower_firstP) ? list(lower_supports, upper_supports) : list(upper_supports, lower_supports);
                                inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            between_col = cdolist_list_var.first();
                        }
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$2, $list36);
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$1, $list35);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list34);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 12300L)
    public static SubLObject removal_sbhl_between_applicability(SubLObject contextualized_dnf_clause, SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = NIL;
        thread.resetMultipleValues();
        SubLObject pos_pred_indices_var_arg1 = find_pos_pred_indices_for_pred_between(contextualized_dnf_clause, predicate);
        SubLObject pos_pred_indices_var_arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != pos_pred_indices_var_arg1 && NIL != pos_pred_indices_var_arg2) {
            SubLObject var2_index = dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED);
            SubLObject cdolist_list_var = pos_pred_indices_var_arg2;
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                SubLObject datum = current = pair;
                SubLObject index = NIL;
                SubLObject variable = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
                index = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
                variable = current.first();
                current = current.rest();
                if (NIL == current) {
                    dictionary_utilities.dictionary_push(var2_index, variable, index);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list37);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
            cdolist_list_var = pos_pred_indices_var_arg1;
            pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                SubLObject datum = current = pair;
                SubLObject index = NIL;
                SubLObject variable = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
                index = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
                variable = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var_$5;
                    SubLObject paired_indices = cdolist_list_var_$5 = dictionary.dictionary_lookup(var2_index, variable, UNPROVIDED);
                    SubLObject paired_index = NIL;
                    paired_index = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        SubLObject subclause_spec = clause_utilities.new_subclause_spec(NIL, list(index, paired_index));
                        subclause_specs = cons(subclause_spec, subclause_specs);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        paired_index = cdolist_list_var_$5.first();
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list37);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(subclause_specs);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 13600L)
    public static SubLObject find_pos_pred_indices_for_pred_between(SubLObject contextualized_dnf_clause, SubLObject predicate) {
        SubLObject pos_pred_indices_var_arg1 = NIL;
        SubLObject pos_pred_indices_var_arg2 = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list29);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                    SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    if (NIL != variables.variable_p(arg1) && NIL != forts.fort_p(arg2)) {
                        pos_pred_indices_var_arg1 = cons(list(index, arg1), pos_pred_indices_var_arg1);
                    } else if (NIL != forts.fort_p(arg1) && NIL != variables.variable_p(arg2)) {
                        pos_pred_indices_var_arg2 = cons(list(index, arg2), pos_pred_indices_var_arg2);
                    }
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list29);
            }
            index = Numbers.add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        pos_pred_indices_var_arg1 = Sequences.nreverse(pos_pred_indices_var_arg1);
        pos_pred_indices_var_arg2 = Sequences.nreverse(pos_pred_indices_var_arg2);
        return Values.values(pos_pred_indices_var_arg1, pos_pred_indices_var_arg2);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 14500L)
    public static SubLObject removal_genls_between_categorize_asents(SubLObject asent0, SubLObject asent1) {
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent0, UNPROVIDED))) {
            return Values.values(asent0, asent1, T);
        }
        return Values.values(asent1, asent0, NIL);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 16700L)
    public static SubLObject removal_genls_collection_subset_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query = removal_genls_collection_subset_construct_query(asent);
        SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        if (NIL != recursive_results) {
            SubLObject query_support = arguments.make_hl_support($QUERY, query, UNPROVIDED, UNPROVIDED);
            if (NIL != cyc_kernel.closed_query_success_token_p(recursive_results)) {
                backward.removal_add_node(query_support, NIL, NIL);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 17200L)
    public static SubLObject removal_genls_collection_subset_check_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query = removal_genls_collection_subset_construct_query(asent);
        SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == recursive_results) {
            SubLObject query_support = arguments.make_hl_support($QUERY, list($$unknownSentence, query), UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(query_support, NIL, NIL);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 17600L)
    public static SubLObject removal_genls_collection_subset_construct_query(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_genls = el_utilities.unmake_binary_formula(asent);
        SubLObject colsub_nat1 = thread.secondMultipleValue();
        SubLObject colsub_nat2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject colsub_func1 = el_utilities.unmake_binary_formula(colsub_nat1);
        SubLObject col1 = thread.secondMultipleValue();
        SubLObject set1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject colsub_func2 = el_utilities.unmake_binary_formula(colsub_nat2);
        SubLObject col2 = thread.secondMultipleValue();
        SubLObject set2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return list($$and, list($$genls, col1, col2), list($$subsetOf, set1, set2));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 19000L)
    public static SubLObject removal_genls_down_arg2_bound_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.fully_bound_p(asent)) {
            return ONE_INTEGER;
        }
        thread.resetMultipleValues();
        SubLObject genls_asent = destructure_genls_down_asent(asent);
        SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_utilities.literal_removal_cost(genls_asent, $POS, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 19300L)
    public static SubLObject removal_genls_down_arg2_bound_completeness(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.fully_bound_p(asent)) {
            return $COMPLETE;
        }
        thread.resetMultipleValues();
        SubLObject genls_asent = destructure_genls_down_asent(asent);
        SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_utilities.literal_removal_completeness(genls_asent, $POS, mt);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 19600L)
    public static SubLObject removal_genls_down_arg2_bound_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject genls_asent = destructure_genls_down_asent(asent);
        SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var;
        SubLObject bindings_list = cdolist_list_var = ask_utilities.inference_recursive_query_unique_bindings(genls_asent, mt, UNPROVIDED);
        SubLObject v_bindings = NIL;
        v_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject support_asent = bindings.apply_bindings(v_bindings, genls_asent);
            SubLObject support = arguments.make_hl_support($QUERY, support_asent, mt, $TRUE_DEF);
            backward.removal_add_node(support, v_bindings, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 20200L)
    public static SubLObject destructure_genls_down_asent(SubLObject asent) {
        SubLObject genls_down = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(asent, asent, $list53);
        genls_down = asent.first();
        SubLObject current = asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, $list53);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asent, $list53);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            return Values.values(el_utilities.make_binary_formula($$genls, arg1, arg2), mt_relevance_macros.current_mt_relevance_mt());
        }
        cdestructuring_bind.cdestructuring_bind_error(asent, $list53);
        return NIL;
    }

    public static SubLObject declare_removal_modules_genls_file() {
        declareFunction("inference_genlP", "INFERENCE-GENL?", 2, 2, false);
        declareFunction("inference_not_genlP", "INFERENCE-NOT-GENL?", 2, 2, false);
        declareFunction("inference_all_genls", "INFERENCE-ALL-GENLS", 1, 2, false);
        declareFunction("inference_all_specs", "INFERENCE-ALL-SPECS", 1, 2, false);
        declareFunction("inference_genls_between", "INFERENCE-GENLS-BETWEEN", 2, 1, false);
        declareFunction("removal_superset_expand", "REMOVAL-SUPERSET-EXPAND", 1, 1, false);
        new $removal_superset_expand$UnaryFunction();
        new $removal_superset_expand$BinaryFunction();
        declareFunction("removal_nat_genls_expand", "REMOVAL-NAT-GENLS-EXPAND", 1, 1, false);
        declareFunction("removal_all_genls_cost", "REMOVAL-ALL-GENLS-COST", 1, 1, false);
        declareFunction("removal_all_genls_expand", "REMOVAL-ALL-GENLS-EXPAND", 1, 1, false);
        declareFunction("removal_nat_all_genls_expand", "REMOVAL-NAT-ALL-GENLS-EXPAND", 1, 1, false);
        declareFunction("removal_all_specs_cost", "REMOVAL-ALL-SPECS-COST", 1, 1, false);
        declareFunction("removal_all_specs_iterator", "REMOVAL-ALL-SPECS-ITERATOR", 1, 0, false);
        declareFunction("removal_not_superset_expand", "REMOVAL-NOT-SUPERSET-EXPAND", 1, 1, false);
        declareFunction("removal_genls_between_applicability", "REMOVAL-GENLS-BETWEEN-APPLICABILITY", 1, 0, false);
        new $removal_genls_between_applicability$UnaryFunction();
        declareFunction("removal_genls_between_cost", "REMOVAL-GENLS-BETWEEN-COST", 1, 0, false);
        declareFunction("removal_genls_between_completeness", "REMOVAL-GENLS-BETWEEN-COMPLETENESS", 0, 0, false);
        declareFunction("removal_genls_between_expand", "REMOVAL-GENLS-BETWEEN-EXPAND", 1, 0, false);
        declareFunction("removal_sbhl_between_applicability", "REMOVAL-SBHL-BETWEEN-APPLICABILITY", 2, 0, false);
        declareFunction("find_pos_pred_indices_for_pred_between", "FIND-POS-PRED-INDICES-FOR-PRED-BETWEEN", 2, 0, false);
        declareFunction("removal_genls_between_categorize_asents", "REMOVAL-GENLS-BETWEEN-CATEGORIZE-ASENTS", 2, 0, false);
        declareFunction("removal_genls_collection_subset_check_pos_expand", "REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_genls_collection_subset_check_neg_expand", "REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_genls_collection_subset_construct_query", "REMOVAL-GENLS-COLLECTION-SUBSET-CONSTRUCT-QUERY", 1, 0, false);
        declareFunction("removal_genls_down_arg2_bound_cost", "REMOVAL-GENLS-DOWN-ARG2-BOUND-COST", 1, 1, false);
        declareFunction("removal_genls_down_arg2_bound_completeness", "REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS", 1, 0, false);
        declareFunction("removal_genls_down_arg2_bound_expand", "REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND", 1, 1, false);
        declareFunction("destructure_genls_down_asent", "DESTRUCTURE-GENLS-DOWN-ASENT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_genls_file() {
        $default_superset_cost$ = defparameter("*DEFAULT-SUPERSET-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $default_nat_all_genls_cost$ = defparameter("*DEFAULT-NAT-ALL-GENLS-COST*", control_vars.$average_all_genls_count$.getDynamicValue());
        $all_specs_lazy_iteration_threshold$ = defparameter("*ALL-SPECS-LAZY-ITERATION-THRESHOLD*", $int$550);
        $default_not_superset_cost$ = defparameter("*DEFAULT-NOT-SUPERSET-COST*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_genls_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$genls);
        inference_modules.inference_removal_module_use_generic($$genls, $REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$genls);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$genls);
        preference_modules.inference_preference_module($ALL_SPECS_OF_FORT_POS, $list5);
        preference_modules.inference_preference_module($ALL_SPECS_OF_NON_FORT_POS, $list7);
        preference_modules.inference_preference_module($ALL_GENLS_POS, $list9);
        inference_modules.inference_removal_module($REMOVAL_SUPERSET, $list13);
        inference_modules.inference_removal_module($REMOVAL_NAT_GENLS, $list15);
        inference_modules.inference_removal_module($REMOVAL_ALL_GENLS, $list17);
        inference_modules.inference_removal_module($REMOVAL_NAT_ALL_GENLS, $list19);
        inference_modules.inference_removal_module($REMOVAL_ALL_SPECS, $list22);
        inference_modules.inference_removal_module($REMOVAL_NOT_SUPERSET, $list25);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_GENLS_BETWEEN, $list27);
        utilities_macros.note_funcall_helper_function($sym33$REMOVAL_GENLS_BETWEEN_COMPLETENESS);
        inference_modules.inference_removal_module($REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK, $list39);
        inference_modules.inference_removal_module($REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK, $list41);
        inference_modules.register_solely_specific_removal_module_predicate($$genlsDown);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$genlsDown);
        inference_modules.inference_removal_module($REMOVAL_GENLS_DOWN_ARG2_BOUND, $list48);
        utilities_macros.note_funcall_helper_function($sym49$REMOVAL_GENLS_DOWN_ARG2_BOUND_COST);
        utilities_macros.note_funcall_helper_function($sym50$REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS);
        utilities_macros.note_funcall_helper_function($sym52$REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_GENLS_DOWN_ARG2_UNIFY, $list55);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_genls_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_genls_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_genls_file();
    }

    static {
        me = new removal_modules_genls();
        $default_superset_cost$ = null;
        $default_nat_all_genls_cost$ = null;
        $all_specs_lazy_iteration_threshold$ = null;
        $default_not_superset_cost$ = null;
        $$genls = makeConstSym(("genls"));
        $REMOVAL_BACKCHAIN_REQUIRED_PRUNE = makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $ALL_SPECS_OF_FORT_POS = makeKeyword("ALL-SPECS-OF-FORT-POS");
        $list5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genls")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));
        $ALL_SPECS_OF_NON_FORT_POS = makeKeyword("ALL-SPECS-OF-NON-FORT-POS");
        $list7 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("genls")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("FORT")))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $ALL_GENLS_POS = makeKeyword("ALL-GENLS-POS");
        $list9 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genls")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISPREFERRED"));
        $sym10$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");
        $GENLS = makeKeyword("GENLS");
        $REMOVAL_SUPERSET = makeKeyword("REMOVAL-SUPERSET");
        $list13 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genls")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-SUPERSET-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUPERSET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genls #$Dog #$Animal)") });
        $REMOVAL_NAT_GENLS = makeKeyword("REMOVAL-NAT-GENLS");
        $list15 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genls")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (<fully-bound> . <fully-bound>) <fully-bound>)\n    via #$resultGenl and #$resultGenlArg"),
                makeKeyword("EXAMPLE"), makeString("(#$genls (#$JuvenileFn #$Cougar) #$Animal)") });
        $REMOVAL_ALL_GENLS = makeKeyword("REMOVAL-ALL-GENLS");
        $list17 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genls")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ALL-GENLS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genls #$Dog ?WHAT)") });
        $REMOVAL_NAT_ALL_GENLS = makeKeyword("REMOVAL-NAT-ALL-GENLS");
        $list19 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genls")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NAT-ALL-GENLS-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$genls (<fully-bound> . <fully-bound>) <not fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), makeKeyword("EXAMPLE"), makeString("(#$genls (#$JuvenileFn #$Cougar) ?WHAT)") });
        $int$550 = makeInteger(550);
        $REMOVAL_ALL_SPECS = makeKeyword("REMOVAL-ALL-SPECS");
        $list22 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genls")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ALL-SPECS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("genls")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-SPECS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("genls")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"),
                makeKeyword("GENLS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genls ?WHAT #$Animal)") });
        $MINIMIZE = makeKeyword("MINIMIZE");
        $REMOVAL_NOT_SUPERSET = makeKeyword("REMOVAL-NOT-SUPERSET");
        $list25 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("genls")), list(makeKeyword("OR"), makeKeyword("FORT"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                list(makeSymbol("FIF"), makeSymbol("*NEGATION-BY-FAILURE*"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeSymbol("*DEFAULT-NOT-SUPERSET-COST*")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-SUPERSET-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$genls <fort> <fully-bound>))\n    (#$not (#$genls (<fully-bound> . <fully-bound>) <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$genls #$Collection #$Individual))\n    (#$not (#$genls (#$JuvenileFn #$Cougar) #$Individual))") });
        $REMOVAL_GENLS_BETWEEN = makeKeyword("REMOVAL-GENLS-BETWEEN");
        $list27 = list(new SubLObject[] { makeKeyword("EVERY-PREDICATES"), list(makeConstSym(("genls"))), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-GENLS-BETWEEN-APPLICABILITY"), makeKeyword("COST"), makeSymbol("REMOVAL-GENLS-BETWEEN-COST"), makeKeyword("COMPLETENESS-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLS-BETWEEN-COMPLETENESS")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-BETWEEN-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$genls <fort1> <varN>)\n           (#$genls <varN> <fort2>))"), makeKeyword("EXAMPLE"),
                makeString("(#$and (#$genls #$Dog ?COL)\n           (#$genls ?COL #$Animal))") });
        $sym28$BINARY_CLAUSE_P = makeSymbol("BINARY-CLAUSE-P");
        $list29 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $sym30$FORT_P = makeSymbol("FORT-P");
        $COMPLETE = makeKeyword("COMPLETE");
        $INCOMPLETE = makeKeyword("INCOMPLETE");
        $sym33$REMOVAL_GENLS_BETWEEN_COMPLETENESS = makeSymbol("REMOVAL-GENLS-BETWEEN-COMPLETENESS");
        $list34 = list(makeSymbol("CONTEXTUALIZED-ASENT0"), makeSymbol("CONTEXTUALIZED-ASENT1"));
        $list35 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));
        $list36 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));
        $list37 = list(makeSymbol("INDEX"), makeSymbol("VARIABLE"));
        $REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK = makeKeyword("REMOVAL-GENLS-COLLECTION-SUBSET-FN-POS-CHECK");
        $list39 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("genls")), list(makeKeyword("NAT"), cons(makeConstSym(("CollectionSubsetFn")), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(makeConstSym(("CollectionSubsetFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>))") });
        $REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK = makeKeyword("REMOVAL-GENLS-COLLECTION-SUBSET-FN-NEG-CHECK");
        $list41 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("genls")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("genls")), list(makeKeyword("NAT"), cons(makeConstSym(("CollectionSubsetFn")), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(makeConstSym(("CollectionSubsetFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>)))") });
        $QUERY = makeKeyword("QUERY");
        $$unknownSentence = makeConstSym(("unknownSentence"));
        $$and = makeConstSym(("and"));
        $$subsetOf = makeConstSym(("subsetOf"));
        $$genlsDown = makeConstSym(("genlsDown"));
        $REMOVAL_GENLS_DOWN_ARG2_BOUND = makeKeyword("REMOVAL-GENLS-DOWN-ARG2-BOUND");
        $list48 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genlsDown")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlsDown")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND"),
                makeKeyword("DOCUMENTATION"), makeString("(#$genlsDown <fully-bound> <fully-bound>)\n(#$genlsDown <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlsDown #$Dog #$Animal)\n(#$genlsDown ?WHAT #$Dog)") });
        $sym49$REMOVAL_GENLS_DOWN_ARG2_BOUND_COST = makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COST");
        $sym50$REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS = makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS");
        $TRUE_DEF = makeKeyword("TRUE-DEF");
        $sym52$REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND = makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND");
        $list53 = list(makeSymbol("GENLS-DOWN"), makeSymbol("ARG1"), makeSymbol("ARG2"));
        $REMOVAL_GENLS_DOWN_ARG2_UNIFY = makeKeyword("REMOVAL-GENLS-DOWN-ARG2-UNIFY");
        $list55 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genlsDown")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlsDown")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("genlsDown")), list(makeKeyword("BIND"), makeSymbol("TERM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(list(makeConstSym(("genlsDown")), makeKeyword("INPUT"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("REFLEXIVE"), makeKeyword("DOCUMENTATION"), makeString("(#$genlsDown <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$genlsDown #$Dog ?WHAT)") });
    }

    public static class $removal_superset_expand$UnaryFunction extends UnaryFunction {
        public $removal_superset_expand$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-SUPERSET-EXPAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_superset_expand(arg1, $removal_superset_expand$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_superset_expand$BinaryFunction extends BinaryFunction {
        public $removal_superset_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-SUPERSET-EXPAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_superset_expand(arg1, arg2);
        }
    }

    public static class $removal_genls_between_applicability$UnaryFunction extends UnaryFunction {
        public $removal_genls_between_applicability$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLS-BETWEEN-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_genls_between_applicability(arg1);
        }
    }
}
/*
 *
 * Total time: 218 ms
 *
 */