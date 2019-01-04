package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_relevant_weighted_similarity extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_weighted_similarity";
    public static final String myFingerPrint = "34264a9ac5fd0c6265e8f6dddf0c0ec945134cdffb2075330404f002053ea723";
    private static final SubLObject $const0$weightedSimilarityQuaInstanceOf_S;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_WEIGHTEDSIMILARITYQUAINSTANCEOF_SETEXPLICIT;
    private static final SubLList $list3;
    private static final SubLObject $const4$salientSimilaritySlots_Weighted;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$_PRED;
    private static final SubLSymbol $sym7$_WEIGHT;
    private static final SubLObject $const8$and;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$_COMMON_VALUE;
    private static final SubLSymbol $kw12$OPAQUE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relevant-weighted-similarity.lisp", position = 2124L)
    public static SubLObject removal_weightedsimilarityquainstanceof_setexplicit_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relevant_weighted_similarity.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
        }
        final SubLObject instance1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED);
        final SubLObject instance2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED);
        final SubLObject focal_type = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED);
        final SubLObject score_term = cycl_utilities.atomic_sentence_arg4(asent, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED);
        final SubLObject numerator_set_term = cycl_utilities.atomic_sentence_arg5(asent, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED);
        final SubLObject common_types = genls.all_specs_among(focal_type, conses_high.intersection(isa.all_isa(instance1, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED), isa.all_isa(instance2, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED), (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED), (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED);
        SubLObject all_pred_weight_bindings = (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
        SubLObject answer_scores_and_sets = (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
        SubLObject cdolist_list_var = common_types;
        SubLObject common_type = (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
        common_type = cdolist_list_var.first();
        while (removal_modules_relevant_weighted_similarity.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1;
            final SubLObject pred_weight_bindings = cdolist_list_var_$1 = ask_utilities.recursive_query((SubLObject)ConsesLow.listS(removal_modules_relevant_weighted_similarity.$const4$salientSimilaritySlots_Weighted, common_type, (SubLObject)removal_modules_relevant_weighted_similarity.$list5), (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED);
            SubLObject pred_weight_binding = (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
            pred_weight_binding = cdolist_list_var_$1.first();
            while (removal_modules_relevant_weighted_similarity.NIL != cdolist_list_var_$1) {
                final SubLObject item_var = pred_weight_binding;
                if (removal_modules_relevant_weighted_similarity.NIL == conses_high.member(item_var, all_pred_weight_bindings, Symbols.symbol_function((SubLObject)removal_modules_relevant_weighted_similarity.EQUAL), Symbols.symbol_function((SubLObject)removal_modules_relevant_weighted_similarity.IDENTITY))) {
                    all_pred_weight_bindings = (SubLObject)ConsesLow.cons(item_var, all_pred_weight_bindings);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                pred_weight_binding = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            common_type = cdolist_list_var.first();
        }
        SubLObject score = (SubLObject)removal_modules_relevant_weighted_similarity.ZERO_INTEGER;
        SubLObject numerators = (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
        SubLObject cdolist_list_var2 = all_pred_weight_bindings;
        SubLObject pred_weight_binding2 = (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
        pred_weight_binding2 = cdolist_list_var2.first();
        while (removal_modules_relevant_weighted_similarity.NIL != cdolist_list_var2) {
            final SubLObject pred = bindings.variable_lookup((SubLObject)removal_modules_relevant_weighted_similarity.$sym6$_PRED, pred_weight_binding2);
            final SubLObject weight = bindings.variable_lookup((SubLObject)removal_modules_relevant_weighted_similarity.$sym7$_WEIGHT, pred_weight_binding2);
            SubLObject cdolist_list_var_$2;
            final SubLObject common_value_bindings = cdolist_list_var_$2 = ask_utilities.recursive_query((SubLObject)ConsesLow.list(removal_modules_relevant_weighted_similarity.$const8$and, (SubLObject)ConsesLow.listS(pred, instance1, (SubLObject)removal_modules_relevant_weighted_similarity.$list9), (SubLObject)ConsesLow.listS(pred, instance2, (SubLObject)removal_modules_relevant_weighted_similarity.$list9)), (SubLObject)removal_modules_relevant_weighted_similarity.NIL, (SubLObject)removal_modules_relevant_weighted_similarity.$list10);
            SubLObject common_value_binding = (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
            common_value_binding = cdolist_list_var_$2.first();
            while (removal_modules_relevant_weighted_similarity.NIL != cdolist_list_var_$2) {
                final SubLObject common_value = bindings.variable_lookup((SubLObject)removal_modules_relevant_weighted_similarity.$sym11$_COMMON_VALUE, common_value_binding);
                score = Numbers.add(score, weight);
                numerators = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(removal_modules_relevant_weighted_similarity.$const8$and, (SubLObject)ConsesLow.list(pred, instance1, common_value), (SubLObject)ConsesLow.list(pred, instance2, common_value)), numerators);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                common_value_binding = cdolist_list_var_$2.first();
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            pred_weight_binding2 = cdolist_list_var2.first();
        }
        if (removal_modules_relevant_weighted_similarity.NIL != number_utilities.positive_number_p(score)) {
            answer_scores_and_sets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(score, el_utilities.make_el_set(numerators, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED)), answer_scores_and_sets);
        }
        cdolist_list_var = answer_scores_and_sets;
        SubLObject answer_score_and_set = (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
        answer_score_and_set = cdolist_list_var.first();
        while (removal_modules_relevant_weighted_similarity.NIL != cdolist_list_var) {
            final SubLObject score2 = answer_score_and_set.first();
            final SubLObject numerator_set = conses_high.second(answer_score_and_set);
            final SubLObject v_bindings = ConsesLow.nconc(unification_utilities.term_unify(score_term, score2, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED), unification_utilities.term_unify(numerator_set_term, numerator_set, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED));
            if (removal_modules_relevant_weighted_similarity.NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_relevant_weighted_similarity.$kw12$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED), v_bindings, (SubLObject)removal_modules_relevant_weighted_similarity.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            answer_score_and_set = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
    }
    
    public static SubLObject declare_removal_modules_relevant_weighted_similarity_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relevant_weighted_similarity", "removal_weightedsimilarityquainstanceof_setexplicit_expand", "REMOVAL-WEIGHTEDSIMILARITYQUAINSTANCEOF-SETEXPLICIT-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
    }
    
    public static SubLObject init_removal_modules_relevant_weighted_similarity_file() {
        return (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
    }
    
    public static SubLObject setup_removal_modules_relevant_weighted_similarity_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_relevant_weighted_similarity.$const0$weightedSimilarityQuaInstanceOf_S);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_relevant_weighted_similarity.$kw1$POS, removal_modules_relevant_weighted_similarity.$const0$weightedSimilarityQuaInstanceOf_S, (SubLObject)removal_modules_relevant_weighted_similarity.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_relevant_weighted_similarity.$kw1$POS, removal_modules_relevant_weighted_similarity.$const0$weightedSimilarityQuaInstanceOf_S, (SubLObject)removal_modules_relevant_weighted_similarity.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_relevant_weighted_similarity.$kw1$POS, removal_modules_relevant_weighted_similarity.$const0$weightedSimilarityQuaInstanceOf_S, (SubLObject)removal_modules_relevant_weighted_similarity.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_relevant_weighted_similarity.$kw2$REMOVAL_WEIGHTEDSIMILARITYQUAINSTANCEOF_SETEXPLICIT, (SubLObject)removal_modules_relevant_weighted_similarity.$list3);
        return (SubLObject)removal_modules_relevant_weighted_similarity.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_relevant_weighted_similarity_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_relevant_weighted_similarity_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_relevant_weighted_similarity_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_relevant_weighted_similarity();
        $const0$weightedSimilarityQuaInstanceOf_S = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weightedSimilarityQuaInstanceOf-SetExplicit"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_WEIGHTEDSIMILARITYQUAINSTANCEOF_SETEXPLICIT = SubLObjectFactory.makeKeyword("REMOVAL-WEIGHTEDSIMILARITYQUAINSTANCEOF-SETEXPLICIT");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weightedSimilarityQuaInstanceOf-SetExplicit")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weightedSimilarityQuaInstanceOf-SetExplicit")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-WEIGHTEDSIMILARITYQUAINSTANCEOF-SETEXPLICIT-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$weightedSimilarityQuaInstanceOf-SetExplicit <fully-bound-p> <fully-bound-p> <fully-bound-p> <anything> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$weightedSimilarityQuaInstanceOf-SetExplicit #$Zappos #$Ecco #$Organization ?SCORE ?NUMERATOR-SET)") });
        $const4$salientSimilaritySlots_Weighted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("salientSimilaritySlots-Weighted"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?WEIGHT"));
        $sym6$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $sym7$_WEIGHT = SubLObjectFactory.makeSymbol("?WEIGHT");
        $const8$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COMMON-VALUE"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)removal_modules_relevant_weighted_similarity.ONE_INTEGER);
        $sym11$_COMMON_VALUE = SubLObjectFactory.makeSymbol("?COMMON-VALUE");
        $kw12$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
    }
}

/*

	Total time: 200 ms
	
*/