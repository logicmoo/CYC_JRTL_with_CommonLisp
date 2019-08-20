package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_el_set;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_relevant_weighted_similarity extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_relevant_weighted_similarity();



    private static final SubLObject $const0$weightedSimilarityQuaInstanceOf_S = reader_make_constant_shell(makeString("weightedSimilarityQuaInstanceOf-SetExplicit"));



    private static final SubLSymbol $REMOVAL_WEIGHTEDSIMILARITYQUAINSTANCEOF_SETEXPLICIT = makeKeyword("REMOVAL-WEIGHTEDSIMILARITYQUAINSTANCEOF-SETEXPLICIT");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("weightedSimilarityQuaInstanceOf-SetExplicit")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("weightedSimilarityQuaInstanceOf-SetExplicit")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WEIGHTEDSIMILARITYQUAINSTANCEOF-SETEXPLICIT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$weightedSimilarityQuaInstanceOf-SetExplicit <fully-bound-p> <fully-bound-p> <fully-bound-p> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$weightedSimilarityQuaInstanceOf-SetExplicit #$Zappos #$Ecco #$Organization ?SCORE ?NUMERATOR-SET)") });

    private static final SubLObject $$salientSimilaritySlots_Weighted = reader_make_constant_shell(makeString("salientSimilaritySlots-Weighted"));

    private static final SubLList $list5 = list(makeSymbol("?PRED"), makeSymbol("?WEIGHT"));

    private static final SubLSymbol $sym6$_PRED = makeSymbol("?PRED");

    private static final SubLSymbol $sym7$_WEIGHT = makeSymbol("?WEIGHT");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list9 = list(makeSymbol("?COMMON-VALUE"));

    private static final SubLList $list10 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol $sym11$_COMMON_VALUE = makeSymbol("?COMMON-VALUE");



    public static SubLObject removal_weightedsimilarityquainstanceof_setexplicit_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject instance1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject instance2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject focal_type = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject score_term = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
        final SubLObject numerator_set_term = cycl_utilities.atomic_sentence_arg5(asent, UNPROVIDED);
        final SubLObject common_types = genls.all_specs_among(focal_type, intersection(isa.all_isa(instance1, UNPROVIDED, UNPROVIDED), isa.all_isa(instance2, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        SubLObject all_pred_weight_bindings = NIL;
        SubLObject answer_scores_and_sets = NIL;
        SubLObject cdolist_list_var = common_types;
        SubLObject common_type = NIL;
        common_type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1;
            final SubLObject pred_weight_bindings = cdolist_list_var_$1 = ask_utilities.recursive_query(listS($$salientSimilaritySlots_Weighted, common_type, $list5), UNPROVIDED, UNPROVIDED);
            SubLObject pred_weight_binding = NIL;
            pred_weight_binding = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject item_var = pred_weight_binding;
                if (NIL == member(item_var, all_pred_weight_bindings, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    all_pred_weight_bindings = cons(item_var, all_pred_weight_bindings);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                pred_weight_binding = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            common_type = cdolist_list_var.first();
        } 
        SubLObject score = ZERO_INTEGER;
        SubLObject numerators = NIL;
        SubLObject cdolist_list_var2 = all_pred_weight_bindings;
        SubLObject pred_weight_binding2 = NIL;
        pred_weight_binding2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject pred = bindings.variable_lookup($sym6$_PRED, pred_weight_binding2);
            final SubLObject weight = bindings.variable_lookup($sym7$_WEIGHT, pred_weight_binding2);
            SubLObject cdolist_list_var_$2;
            final SubLObject common_value_bindings = cdolist_list_var_$2 = ask_utilities.recursive_query(list($$and, listS(pred, instance1, $list9), listS(pred, instance2, $list9)), NIL, $list10);
            SubLObject common_value_binding = NIL;
            common_value_binding = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject common_value = bindings.variable_lookup($sym11$_COMMON_VALUE, common_value_binding);
                score = add(score, weight);
                numerators = cons(list($$and, list(pred, instance1, common_value), list(pred, instance2, common_value)), numerators);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                common_value_binding = cdolist_list_var_$2.first();
            } 
            cdolist_list_var2 = cdolist_list_var2.rest();
            pred_weight_binding2 = cdolist_list_var2.first();
        } 
        if (NIL != number_utilities.positive_number_p(score)) {
            answer_scores_and_sets = cons(list(score, make_el_set(numerators, UNPROVIDED)), answer_scores_and_sets);
        }
        cdolist_list_var = answer_scores_and_sets;
        SubLObject answer_score_and_set = NIL;
        answer_score_and_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject score2 = answer_score_and_set.first();
            final SubLObject numerator_set = second(answer_score_and_set);
            final SubLObject v_bindings = nconc(unification_utilities.term_unify(score_term, score2, UNPROVIDED, UNPROVIDED), unification_utilities.term_unify(numerator_set_term, numerator_set, UNPROVIDED, UNPROVIDED));
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            answer_score_and_set = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_removal_modules_relevant_weighted_similarity_file() {
        declareFunction("removal_weightedsimilarityquainstanceof_setexplicit_expand", "REMOVAL-WEIGHTEDSIMILARITYQUAINSTANCEOF-SETEXPLICIT-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_relevant_weighted_similarity_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_relevant_weighted_similarity_file() {
        inference_modules.register_solely_specific_removal_module_predicate($const0$weightedSimilarityQuaInstanceOf_S);
        preference_modules.doomed_unless_arg_bindable($POS, $const0$weightedSimilarityQuaInstanceOf_S, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const0$weightedSimilarityQuaInstanceOf_S, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const0$weightedSimilarityQuaInstanceOf_S, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_WEIGHTEDSIMILARITYQUAINSTANCEOF_SETEXPLICIT, $list3);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_relevant_weighted_similarity_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_relevant_weighted_similarity_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_relevant_weighted_similarity_file();
    }

    static {














    }
}

/**
 * Total time: 200 ms
 */
