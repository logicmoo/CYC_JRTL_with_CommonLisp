package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_quantifier_processing_3 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3";
    public static final String myFingerPrint = "410c82132cef4210bd70838111218d5cebeab55a242850df64771b72578df90a";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 5210L)
    private static SubLSymbol $subcollection_function_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 8498L)
    private static SubLSymbol $gen_quant_relations_from$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 8856L)
    private static SubLSymbol $gen_quant_relations_to$;
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 9836L)
    private static SubLSymbol $quantproc_3_microseconds$;
    private static final SubLObject $const0$QuantifierProcessing_3_RLModule;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$IGNORE;
    private static final SubLList $list3;
    private static final SubLObject $const4$NLQuantFn_3;
    private static final SubLList $list5;
    private static final SubLObject $const6$NLDefinitenessFn_3;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLObject $const13$NLGenQuantAttribute;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLObject $const19$GeneralizedQuantifierRelation;
    private static final SubLObject $const20$TypeInstanceTernaryRuleMacroPredi;
    private static final SubLSymbol $kw21$TO_TYPE;
    private static final SubLObject $const22$InstanceTypeTernaryRuleMacroPredi;
    private static final SubLSymbol $kw23$FROM_TYPE;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLInteger $int26$30000;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLObject $const33$is_Underspecified;
    private static final SubLObject $const34$extentCardinality;
    private static final SubLObject $const35$TheSetOf;
    private static final SubLObject $const36$isa;
    private static final SubLString $str37$CardinalityOfFn_1;
    private static final SubLObject $const38$most_GenQuantRelnTo;
    private static final SubLObject $const39$most_GenQuantRelnToType;
    private static final SubLString $str40$3_4;
    private static final SubLObject $const41$few_GenQuantRelnTo;
    private static final SubLObject $const42$few_GenQuantRelnToType;
    private static final SubLString $str43$11_5_1;
    private static final SubLObject $const44$many_GenQuantRelnTo;
    private static final SubLObject $const45$many_GenQuantRelnToType;
    private static final SubLString $str46$2_4;
    private static final SubLObject $const47$several_GenQuantRelnTo;
    private static final SubLObject $const48$several_GenQuantRelnToType;
    private static final SubLString $str49$7_5_1;
    private static final SubLObject $const50$no_GenQuantRelnTo;
    private static final SubLObject $const51$no_GenQuantRelnToFromType;
    private static final SubLString $str52$9_2_5;
    private static final SubLObject $const53$most_GenQuantRelnFrom;
    private static final SubLObject $const54$most_GenQuantRelnFromType;
    private static final SubLString $str55$3_3;
    private static final SubLObject $const56$few_GenQuantRelnFrom;
    private static final SubLObject $const57$few_GenQuantRelnFromType;
    private static final SubLString $str58$11_5_2;
    private static final SubLObject $const59$many_GenQuantRelnFrom;
    private static final SubLObject $const60$many_GenQuantRelnFromType;
    private static final SubLString $str61$2_5;
    private static final SubLObject $const62$several_GenQuantRelnFrom;
    private static final SubLObject $const63$several_GenQuantRelnFromType;
    private static final SubLString $str64$7_5_2;
    private static final SubLObject $const65$no_GenQuantRelnFrom;
    private static final SubLString $str66$9_1_5;
    private static final SubLObject $const67$correspondingGenQuant;
    private static final SubLList $list68;
    private static final SubLObject $const69$Most_NLAttr;
    private static final SubLString $str70$GenQuant_2_1;
    private static final SubLObject $const71$Many_NLAttr;
    private static final SubLString $str72$GenQuant_2_2;
    private static final SubLObject $const73$Few_NLAttr;
    private static final SubLString $str74$GenQuant_2_3;
    private static final SubLObject $const75$Several_NLAttr;
    private static final SubLString $str76$GenQuant_2_4;
    private static final SubLString $str77$GenQuant_3_1;
    private static final SubLString $str78$GenQuant_3_2;
    private static final SubLString $str79$GenQuant_3_3;
    private static final SubLString $str80$GenQuant_3_4;
    private static final SubLObject $const81$Plural_NLAttr;
    private static final SubLString $str82$GenQuant_1;
    private static final SubLObject $const83$RuleMacroPredicate;
    private static final SubLObject $const84$genls;
    private static final SubLObject $const85$Every_NLAttr;
    private static final SubLObject $const86$Some_NLAttr;
    private static final SubLList $list87;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLObject $const90$Generic_NLAttr;
    private static final SubLString $str91$BAREFORM_1;
    private static final SubLString $str92$BAREFORM_2;
    private static final SubLString $str93$BAREFORM_3;
    private static final SubLObject $const94$Singular_NLAttr;
    private static final SubLList $list95;
    private static final SubLString $str96$5_1_or_5_2;
    private static final SubLList $list97;
    private static final SubLString $str98$9_1;
    private static final SubLString $str99$9_2;
    private static final SubLObject $const100$disjointWith;
    private static final SubLString $str101$9_5_;
    private static final SubLList $list102;
    private static final SubLObject $const103$thereExists;
    private static final SubLObject $const104$and;
    private static final SubLString $str105$4_2;
    private static final SubLString $str106$6_1;
    private static final SubLList $list107;
    private static final SubLObject $const108$ComparisonWRTPredicate;
    private static final SubLObject $const109$IndividualLevelPredicate;
    private static final SubLObject $const110$forAll;
    private static final SubLObject $const111$implies;
    private static final SubLString $str112$6_4_1;
    private static final SubLObject $const113$ScalarInterval;
    private static final SubLObject $const114$IntegerExtent;
    private static final SubLObject $const115$num_GenQuant;
    private static final SubLString $str116$10_1;
    private static final SubLObject $const117$SubcollectionFunction;
    private static final SubLSymbol $kw118$1;
    private static final SubLObject $const119$Thing;
    private static final SubLObject $const120$CollectionType;
    private static final SubLObject $const121$CycNLParsingConstant;
    private static final SubLList $list122;
    private static final SubLString $str123$8_1_or_8_2;
    private static final SubLList $list124;
    private static final SubLString $str125$8_2_5;
    private static final SubLList $list126;
    private static final SubLString $str127$8_3_1;
    private static final SubLSymbol $sym128$QUANTPROC_3_NL_QUANT_FN_EXPRESSION_ARG_ORDER;
    private static final SubLList $list129;
    private static final SubLSymbol $kw130$SWITCH_FIRST;
    private static final SubLSymbol $kw131$SHIFT_LEFT;
    private static final SubLSymbol $kw132$SHIFT_RIGHT;
    private static final SubLList $list133;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 1676L)
    public static SubLObject quantproc_3_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (reformulator_module_quantifier_processing_3.NIL != clauses.clauses_p(expression) && reformulator_module_quantifier_processing_3.NIL != list_utilities.singletonP(expression) && reformulator_module_quantifier_processing_3.NIL != clause_utilities.pos_atomic_cnf_p(expression.first())) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            if (reformulator_module_quantifier_processing_3.NIL != el_utilities.el_formula_p(asent)) {
                SubLObject matchP = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
                final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)reformulator_module_quantifier_processing_3.$kw2$IGNORE);
                SubLObject rest;
                SubLObject arg;
                SubLObject pred;
                for (rest = (SubLObject)reformulator_module_quantifier_processing_3.NIL, rest = args; reformulator_module_quantifier_processing_3.NIL == matchP && reformulator_module_quantifier_processing_3.NIL != rest; matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != matchP || reformulator_module_quantifier_processing_3.NIL != quantproc_3_subcol_expressionP(arg, mt)), matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != matchP || reformulator_module_quantifier_processing_3.NIL != quantproc_3_nested_subcol_expressionP(arg, mt)), matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != matchP || reformulator_module_quantifier_processing_3.NIL != quantproc_3_cardinality_of_fn_expressionP(arg, mt)), rest = rest.rest()) {
                    arg = rest.first();
                    if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_any_nl_quant_fn_expressionP(arg, mt)) {
                        pred = cycl_utilities.atomic_sentence_predicate(asent);
                        if (reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_predicateP(pred, mt)) {
                            matchP = (SubLObject)reformulator_module_quantifier_processing_3.T;
                        }
                    }
                }
                matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != matchP || reformulator_module_quantifier_processing_3.NIL != quantproc_3_gen_quant_reln_from_expressionP(asent, mt));
                matchP = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != matchP || reformulator_module_quantifier_processing_3.NIL != quantproc_3_gen_quant_reln_to_expressionP(asent, mt));
                return matchP;
            }
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 2987L)
    public static SubLObject quantproc_3_any_nl_quant_fn_expressionP(final SubLObject expression, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(expression, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list3, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3) || reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(expression, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list5, reformulator_module_quantifier_processing_3.$const6$NLDefinitenessFn_3) || reformulator_module_quantifier_processing_3.NIL != quantproc_3_numerical_quant_fn_expressionP(expression, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 3503L)
    public static SubLObject quantproc_3_nl_quant_fn_expressionP(final SubLObject expression, final SubLObject mt, final SubLObject nl_attr_list, final SubLObject target_nl_quant_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        if (reformulator_module_quantifier_processing_3.NIL != el_utilities.el_formula_p(expression)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pcase_var = el_utilities.formula_arity(expression, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                if (pcase_var.eql((SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER)) {
                    if (reformulator_module_quantifier_processing_3.NIL == ans) {
                        SubLObject csome_list_var;
                        SubLObject nl_attr;
                        for (csome_list_var = nl_attr_list, nl_attr = (SubLObject)reformulator_module_quantifier_processing_3.NIL, nl_attr = csome_list_var.first(); reformulator_module_quantifier_processing_3.NIL == ans && reformulator_module_quantifier_processing_3.NIL != csome_list_var; ans = formula_pattern_match.formula_matches_pattern(expression, (SubLObject)ConsesLow.listS(target_nl_quant_fn, nl_attr, (SubLObject)reformulator_module_quantifier_processing_3.$list7)), csome_list_var = csome_list_var.rest(), nl_attr = csome_list_var.first()) {}
                    }
                }
                else if (pcase_var.eql((SubLObject)reformulator_module_quantifier_processing_3.THREE_INTEGER) && reformulator_module_quantifier_processing_3.NIL == ans) {
                    SubLObject csome_list_var;
                    SubLObject nl_attr;
                    for (csome_list_var = nl_attr_list, nl_attr = (SubLObject)reformulator_module_quantifier_processing_3.NIL, nl_attr = csome_list_var.first(); reformulator_module_quantifier_processing_3.NIL == ans && reformulator_module_quantifier_processing_3.NIL != csome_list_var; ans = formula_pattern_match.formula_matches_pattern(expression, (SubLObject)ConsesLow.listS(target_nl_quant_fn, nl_attr, (SubLObject)reformulator_module_quantifier_processing_3.$list8)), csome_list_var = csome_list_var.rest(), nl_attr = csome_list_var.first()) {}
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 4436L)
    public static SubLObject quantproc_3_numerical_quant_fn_expressionP(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != el_utilities.el_formula_p(expression) && (reformulator_module_quantifier_processing_3.NIL != formula_pattern_match.formula_matches_pattern(expression, (SubLObject)reformulator_module_quantifier_processing_3.$list9) || reformulator_module_quantifier_processing_3.NIL != formula_pattern_match.formula_matches_pattern(expression, (SubLObject)reformulator_module_quantifier_processing_3.$list10)));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 5266L)
    public static SubLObject subcollection_function_naut_sans_mtP(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_module_quantifier_unifier_3.subcollection_function_nautP(naut, reformulator_module_quantifier_processing_3.$subcollection_function_mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 5400L)
    public static SubLObject quantproc_3_subcol_expressionP(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        if (reformulator_module_quantifier_processing_3.NIL != el_utilities.el_formula_p(expression)) {
            final SubLObject _prev_bind_0 = reformulator_module_quantifier_processing_3.$subcollection_function_mt$.currentBinding(thread);
            try {
                reformulator_module_quantifier_processing_3.$subcollection_function_mt$.bind(mt, thread);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    ans = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != formula_pattern_match.formula_matches_pattern(expression, (SubLObject)reformulator_module_quantifier_processing_3.$list11) || reformulator_module_quantifier_processing_3.NIL != formula_pattern_match.formula_matches_pattern(expression, (SubLObject)reformulator_module_quantifier_processing_3.$list12));
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                reformulator_module_quantifier_processing_3.$subcollection_function_mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 6102L)
    public static SubLObject non_gen_quant_attributeP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL == isa.isaP(obj, reformulator_module_quantifier_processing_3.$const13$NLGenQuantAttribute, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 6200L)
    public static SubLObject quantproc_3_nested_subcol_expressionP(final SubLObject expression, final SubLObject mt) {
        if (reformulator_module_quantifier_processing_3.NIL != el_utilities.el_formula_p(expression)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(expression, (SubLObject)reformulator_module_quantifier_processing_3.$kw2$IGNORE);
            SubLObject arg = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
            arg = cdolist_list_var.first();
            while (reformulator_module_quantifier_processing_3.NIL != cdolist_list_var) {
                if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list14, reformulator_module_quantifier_processing_3.$const6$NLDefinitenessFn_3) || reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list15, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3)) {
                    return (SubLObject)reformulator_module_quantifier_processing_3.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 6591L)
    public static SubLObject quantproc_3_cardinality_of_fn_expressionP(final SubLObject expression, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != el_utilities.el_formula_p(expression) && reformulator_module_quantifier_processing_3.NIL != formula_pattern_match.formula_matches_pattern(expression, (SubLObject)reformulator_module_quantifier_processing_3.$list16));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 6796L)
    public static SubLObject quantproc_3_gen_quant_reln_type_arg_position(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_quantifier_processing_3.NIL == el_utilities.el_ternary_formula_p(expression)) {
            return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLObject quant_attr_list = (SubLObject)reformulator_module_quantifier_processing_3.$list17;
        final SubLObject def_attr_list = (SubLObject)reformulator_module_quantifier_processing_3.$list18;
        SubLObject result = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        thread.resetMultipleValues();
        final SubLObject gen_quant_reln = el_utilities.unmake_ternary_formula(expression);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject first_arg = thread.thirdMultipleValue();
        final SubLObject second_arg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (reformulator_module_quantifier_processing_3.NIL == isa.isaP(gen_quant_reln, reformulator_module_quantifier_processing_3.$const19$GeneralizedQuantifierRelation, mt, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) || reformulator_module_quantifier_processing_3.NIL == fort_types_interface.isa_predicateP(pred, mt) || !reformulator_module_quantifier_processing_3.TWO_INTEGER.numE(arity.arity(pred))) {
            return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        if (reformulator_module_quantifier_processing_3.NIL != isa.isaP(gen_quant_reln, reformulator_module_quantifier_processing_3.$const20$TypeInstanceTernaryRuleMacroPredi, mt, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(second_arg, mt, quant_attr_list, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3) || reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(second_arg, mt, def_attr_list, reformulator_module_quantifier_processing_3.$const6$NLDefinitenessFn_3))) {
            result = (SubLObject)reformulator_module_quantifier_processing_3.$kw21$TO_TYPE;
            return result;
        }
        if (reformulator_module_quantifier_processing_3.NIL != isa.isaP(gen_quant_reln, reformulator_module_quantifier_processing_3.$const22$InstanceTypeTernaryRuleMacroPredi, mt, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(first_arg, mt, quant_attr_list, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3) || reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(first_arg, mt, def_attr_list, reformulator_module_quantifier_processing_3.$const6$NLDefinitenessFn_3))) {
            result = (SubLObject)reformulator_module_quantifier_processing_3.$kw23$FROM_TYPE;
            return result;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 8720L)
    public static SubLObject gen_quant_relation_from_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, reformulator_module_quantifier_processing_3.$gen_quant_relations_from$.getGlobalValue(), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 9026L)
    public static SubLObject gen_quant_relation_to_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, reformulator_module_quantifier_processing_3.$gen_quant_relations_to$.getGlobalValue(), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 9158L)
    public static SubLObject quantproc_3_gen_quant_reln_from_expressionP(final SubLObject expression, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != gen_quant_relation_from_p(cycl_utilities.formula_operator(expression)) && quantproc_3_gen_quant_reln_type_arg_position(expression, mt).eql((SubLObject)reformulator_module_quantifier_processing_3.$kw23$FROM_TYPE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 9501L)
    public static SubLObject quantproc_3_gen_quant_reln_to_expressionP(final SubLObject expression, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_quantifier_processing_3.NIL != gen_quant_relation_to_p(cycl_utilities.formula_operator(expression)) && quantproc_3_gen_quant_reln_type_arg_position(expression, mt).eql((SubLObject)reformulator_module_quantifier_processing_3.$kw21$TO_TYPE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 9901L)
    public static SubLObject quantproc_3_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_quantifier_processing_3.$quantproc_3_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 10030L)
    public static SubLObject quantproc_3_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_quantifier_processing_3.NIL != clauses.clauses_p(expression) && reformulator_module_quantifier_processing_3.NIL != clauses.clauses_p(original_clause) && reformulator_module_quantifier_processing_3.NIL != list_utilities.singletonP(expression) && reformulator_module_quantifier_processing_3.NIL != clause_utilities.pos_atomic_cnf_p(expression.first())) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject new_sentence = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
            SubLObject justification = (SubLObject)reformulator_module_quantifier_processing_3.T;
            if (reformulator_module_quantifier_processing_3.NIL != el_utilities.el_formula_p(asent)) {
                SubLObject argnum = (SubLObject)reformulator_module_quantifier_processing_3.ZERO_INTEGER;
                final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)reformulator_module_quantifier_processing_3.$kw2$IGNORE);
                SubLObject rest;
                SubLObject arg;
                SubLObject new_sentence_$2;
                SubLObject justification_$3;
                SubLObject new_sentence_$3;
                SubLObject justification_$4;
                SubLObject new_sentence_$4;
                SubLObject justification_$5;
                for (rest = (SubLObject)reformulator_module_quantifier_processing_3.NIL, rest = args; reformulator_module_quantifier_processing_3.NIL == new_sentence && reformulator_module_quantifier_processing_3.NIL != rest; rest = rest.rest()) {
                    arg = rest.first();
                    argnum = Numbers.add(argnum, (SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER);
                    if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_cardinality_of_fn_expressionP(arg, mt)) {
                        thread.resetMultipleValues();
                        new_sentence_$2 = quantproc_3_reformulate_cardinality_of_fn(asent, argnum, mt, settings, original_clause);
                        justification_$3 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$2;
                        justification = justification_$3;
                    }
                    else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_subcol_expressionP(arg, mt)) {
                        thread.resetMultipleValues();
                        new_sentence_$3 = quantproc_3_reformulate_subcol(asent, argnum, mt, settings, original_clause);
                        justification_$4 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$3;
                        justification = justification_$4;
                    }
                    else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nested_subcol_expressionP(arg, mt)) {
                        thread.resetMultipleValues();
                        new_sentence_$4 = quantproc_3_reformulate_nested_subcol(asent, argnum, mt, settings, original_clause);
                        justification_$5 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$4;
                        justification = justification_$5;
                    }
                }
                if (reformulator_module_quantifier_processing_3.NIL == new_sentence) {
                    if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_gen_quant_reln_from_expressionP(asent, mt)) {
                        thread.resetMultipleValues();
                        final SubLObject new_sentence_$5 = quantproc_3_reformulate_gen_quant_reln_from(asent, mt, settings);
                        final SubLObject justification_$6 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$5;
                        justification = justification_$6;
                    }
                    else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_gen_quant_reln_to_expressionP(asent, mt)) {
                        thread.resetMultipleValues();
                        final SubLObject new_sentence_$6 = quantproc_3_reformulate_gen_quant_reln_to(asent, mt, settings);
                        final SubLObject justification_$7 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$6;
                        justification = justification_$7;
                    }
                    else if (reformulator_module_quantifier_processing_3.NIL == new_sentence) {
                        thread.resetMultipleValues();
                        final SubLObject arg2 = quantproc_3_el_formula_next_arg_argnum(asent, mt);
                        final SubLObject argnum2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list27, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3)) {
                            thread.resetMultipleValues();
                            final SubLObject new_sentence_$7 = quantproc_3_reformulate_every(asent, argnum2, mt, settings, original_clause);
                            final SubLObject justification_$8 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$7;
                            justification = justification_$8;
                        }
                        else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list28, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3)) {
                            thread.resetMultipleValues();
                            final SubLObject new_sentence_$8 = quantproc_3_reformulate_some(asent, argnum2, mt, settings, original_clause);
                            final SubLObject justification_$9 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$8;
                            justification = justification_$9;
                        }
                        else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list15, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3)) {
                            thread.resetMultipleValues();
                            final SubLObject new_sentence_$9 = quantproc_3_reformulate_bare_form(asent, argnum2, mt, settings, original_clause);
                            final SubLObject justification_$10 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$9;
                            justification = justification_$10;
                        }
                        else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list29, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3)) {
                            thread.resetMultipleValues();
                            final SubLObject new_sentence_$10 = quantproc_3_reformulate_each(asent, argnum2, mt, settings, original_clause);
                            final SubLObject justification_$11 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$10;
                            justification = justification_$11;
                        }
                        else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list30, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3)) {
                            thread.resetMultipleValues();
                            final SubLObject new_sentence_$11 = quantproc_3_reformulate_gen_quant(asent, argnum2, mt, settings, original_clause);
                            final SubLObject justification_$12 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$11;
                            justification = justification_$12;
                        }
                        else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list31, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3)) {
                            thread.resetMultipleValues();
                            final SubLObject new_sentence_$12 = quantproc_3_reformulate_no(asent, argnum2, mt, settings, original_clause);
                            final SubLObject justification_$13 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$12;
                            justification = justification_$13;
                        }
                        else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list18, reformulator_module_quantifier_processing_3.$const6$NLDefinitenessFn_3)) {
                            thread.resetMultipleValues();
                            final SubLObject new_sentence_$13 = quantproc_3_reformulate_indefinite(asent, argnum2, mt, settings, original_clause);
                            final SubLObject justification_$14 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$13;
                            justification = justification_$14;
                        }
                        else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list32, reformulator_module_quantifier_processing_3.$const6$NLDefinitenessFn_3)) {
                            thread.resetMultipleValues();
                            final SubLObject new_sentence_$14 = quantproc_3_reformulate_definite(asent, argnum2, mt, settings, original_clause);
                            final SubLObject justification_$15 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$14;
                            justification = justification_$15;
                        }
                        else if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_numerical_quant_fn_expressionP(arg2, mt)) {
                            thread.resetMultipleValues();
                            final SubLObject new_sentence_$15 = quantproc_3_reformulate_numerical(asent, argnum2, mt, settings, original_clause);
                            final SubLObject justification_$16 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$15;
                            justification = justification_$16;
                        }
                    }
                }
            }
            if (reformulator_module_quantifier_processing_3.NIL != new_sentence) {
                return Values.values((SubLObject)ConsesLow.list(clause_utilities.make_gaf_cnf(new_sentence)), justification);
            }
        }
        return Values.values(expression, (SubLObject)reformulator_module_quantifier_processing_3.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 14251L)
    public static SubLObject quantproc_3_reformulate_cardinality_of_fn(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        if (reformulator_module_quantifier_processing_3.NIL == el_utilities.el_binary_formula_p(thesent)) {
            return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLObject asent = conses_high.copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject col = cycl_utilities.formula_arg1(arg, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        if (pred.eql(reformulator_module_quantifier_processing_3.$const33$is_Underspecified) && argnum.numLE((SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER)) {
            final SubLObject the_value = argnum.numE((SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER) ? cycl_utilities.formula_arg(asent, (SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) : cycl_utilities.formula_arg(asent, (SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const34$extentCardinality, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const35$TheSetOf, new_var, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col)), the_value)), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str37$CardinalityOfFn_1));
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 15155L)
    public static SubLObject quantproc_3_reformulate_gen_quant_reln_to(final SubLObject asent, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject gen_quant_reln = el_utilities.unmake_ternary_formula(asent);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject col1 = thread.thirdMultipleValue();
        final SubLObject nl_quant_fn_expr = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_quant_tag = el_utilities.unmake_binary_formula(nl_quant_fn_expr);
        final SubLObject nl_quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
        final SubLObject nl_number_attr = thread.secondMultipleValue();
        final SubLObject col2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = gen_quant_reln;
        if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const38$most_GenQuantRelnTo)) {
            return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const39$most_GenQuantRelnToType, pred, col1, col2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str40$3_4));
        }
        if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const41$few_GenQuantRelnTo)) {
            return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const42$few_GenQuantRelnToType, pred, col1, col2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str43$11_5_1));
        }
        if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const44$many_GenQuantRelnTo)) {
            return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const45$many_GenQuantRelnToType, pred, col1, col2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str46$2_4));
        }
        if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const47$several_GenQuantRelnTo)) {
            return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const48$several_GenQuantRelnToType, pred, col1, col2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str49$7_5_1));
        }
        if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const50$no_GenQuantRelnTo)) {
            return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const51$no_GenQuantRelnToFromType, pred, col1, col2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str52$9_2_5));
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 16599L)
    public static SubLObject quantproc_3_reformulate_gen_quant_reln_from(final SubLObject asent, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject gen_quant_reln = el_utilities.unmake_ternary_formula(asent);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
        final SubLObject col2 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_quant_tag = el_utilities.unmake_binary_formula(nl_quant_fn_expr);
        final SubLObject nl_quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
        final SubLObject nl_number_attr = thread.secondMultipleValue();
        final SubLObject col3 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = gen_quant_reln;
        if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const53$most_GenQuantRelnFrom)) {
            return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const54$most_GenQuantRelnFromType, pred, col3, col2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str55$3_3));
        }
        if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const56$few_GenQuantRelnFrom)) {
            return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const57$few_GenQuantRelnFromType, pred, col3, col2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str58$11_5_2));
        }
        if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const59$many_GenQuantRelnFrom)) {
            return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const60$many_GenQuantRelnFromType, pred, col3, col2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str61$2_5));
        }
        if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const62$several_GenQuantRelnFrom)) {
            return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const63$several_GenQuantRelnFromType, pred, col3, col2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str64$7_5_2));
        }
        if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const65$no_GenQuantRelnFrom)) {
            return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const51$no_GenQuantRelnToFromType, pred, col3, col2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str66$9_1_5));
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 18063L)
    public static SubLObject quantproc_3_reformulate_gen_quant(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_quantifier_processing_3.NIL != el_utilities.formula_arityGE(thesent, (SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) {
            final SubLObject asent = conses_high.copy_tree(thesent);
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject arg1 = cycl_utilities.formula_arg1(asent, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(asent, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            final SubLObject arg3 = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            SubLObject gen_quantifier = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(arg3);
            final SubLObject gen_quant_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            gen_quantifier = kb_mapping_utilities.fpred_value_in_any_mt(gen_quant_attr, reformulator_module_quantifier_processing_3.$const67$correspondingGenQuant, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_processing_3.NIL != subl_promotions.memberP(number, (SubLObject)reformulator_module_quantifier_processing_3.$list68, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) {
                if (argnum.numE((SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER) && reformulator_module_quantifier_processing_3.NIL != el_utilities.el_binary_formula_p(asent) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_predicateP(pred, mt) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_collectionP(col, mt)) {
                    final SubLObject pcase_var = gen_quant_attr;
                    if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const69$Most_NLAttr)) {
                        return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const53$most_GenQuantRelnFrom, pred, arg1, col), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str70$GenQuant_2_1));
                    }
                    if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const71$Many_NLAttr)) {
                        return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const59$many_GenQuantRelnFrom, pred, arg1, col), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str72$GenQuant_2_2));
                    }
                    if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const73$Few_NLAttr)) {
                        return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const56$few_GenQuantRelnFrom, pred, arg1, col), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str74$GenQuant_2_3));
                    }
                    if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const75$Several_NLAttr)) {
                        return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const62$several_GenQuantRelnFrom, pred, arg1, col), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str76$GenQuant_2_4));
                    }
                }
                else if (argnum.numE((SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER) && reformulator_module_quantifier_processing_3.NIL != el_utilities.el_binary_formula_p(asent) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_predicateP(pred, mt) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_collectionP(col, mt)) {
                    final SubLObject pcase_var = gen_quant_attr;
                    if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const69$Most_NLAttr)) {
                        return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const38$most_GenQuantRelnTo, pred, col, arg2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str77$GenQuant_3_1));
                    }
                    if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const71$Many_NLAttr)) {
                        return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const44$many_GenQuantRelnTo, pred, col, arg2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str78$GenQuant_3_2));
                    }
                    if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const73$Few_NLAttr)) {
                        return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const41$few_GenQuantRelnTo, pred, col, arg2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str79$GenQuant_3_3));
                    }
                    if (pcase_var.eql(reformulator_module_quantifier_processing_3.$const75$Several_NLAttr)) {
                        return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const47$several_GenQuantRelnTo, pred, col, arg2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str80$GenQuant_3_4));
                    }
                }
                else if (reformulator_module_quantifier_processing_3.NIL != el_utilities.formula_arityGE(asent, (SubLObject)reformulator_module_quantifier_processing_3.THREE_INTEGER, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && number.eql(reformulator_module_quantifier_processing_3.$const81$Plural_NLAttr)) {
                    final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                    final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
                    return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(gen_quantifier, col, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const35$TheSetOf, new_var, subsentence))), (SubLObject)reformulator_module_quantifier_processing_3.$str82$GenQuant_1);
                }
            }
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 20933L)
    public static SubLObject quantproc_3_reformulate_every(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if (reformulator_module_quantifier_processing_3.NIL == isa.isaP(pred, reformulator_module_quantifier_processing_3.$const83$RuleMacroPredicate, mt, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) || pred.eql(reformulator_module_quantifier_processing_3.$const84$genls)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(arg);
            final SubLObject every = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            final SubLObject consequent = el_utilities.replace_formula_arg(argnum, new_var, asent);
            return Values.values(el_utilities.make_universal(new_var, el_utilities.make_implication(el_utilities.make_binary_formula(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col), consequent)), (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const85$Every_NLAttr));
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 21895L)
    public static SubLObject quantproc_3_reformulate_some(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if (reformulator_module_quantifier_processing_3.NIL == isa.isaP(pred, reformulator_module_quantifier_processing_3.$const83$RuleMacroPredicate, mt, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) || pred.eql(reformulator_module_quantifier_processing_3.$const84$genls)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(arg);
            final SubLObject some = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
            return Values.values(el_utilities.make_existential(new_var, simplifier.conjoin((SubLObject)ConsesLow.list(el_utilities.make_binary_formula(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col), subsentence), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)), (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const86$Some_NLAttr));
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 22859L)
    public static SubLObject quantproc_3_reformulate_bare_form(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_ternary_formula(arg);
        final SubLObject bare_form = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        final SubLObject nl_quant_fn_argnum = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (reformulator_module_quantifier_processing_3.$list87.equal(kb_accessors.argn_isa(pred, argnum, mt)) || reformulator_module_quantifier_processing_3.NIL == at_admitted.admitted_argumentP(col, argnum, pred, mt)) {
            if (nl_quant_fn_argnum.numLE((SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER) && reformulator_module_quantifier_processing_3.NIL != conses_high.member(number, (SubLObject)reformulator_module_quantifier_processing_3.$list88, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) {
                final SubLObject new_arg = list_utilities.replace_nested_nth(arg, (SubLObject)reformulator_module_quantifier_processing_3.$list89, reformulator_module_quantifier_processing_3.$const90$Generic_NLAttr);
                return Values.values(el_utilities.replace_formula_arg(argnum, new_arg, asent), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str91$BAREFORM_1));
            }
            if (nl_quant_fn_argnum.numG((SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER) && reformulator_module_quantifier_processing_3.NIL != conses_high.member(number, (SubLObject)reformulator_module_quantifier_processing_3.$list88, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) {
                final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
                return Values.values(el_utilities.make_existential(new_var, simplifier.conjoin((SubLObject)ConsesLow.list(el_utilities.make_binary_formula(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col), subsentence), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str92$BAREFORM_2));
            }
            if (number.eql(reformulator_module_quantifier_processing_3.$const90$Generic_NLAttr)) {
                final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                final SubLObject consequent = el_utilities.replace_formula_arg(argnum, new_var, asent);
                return Values.values(el_utilities.make_universal(new_var, el_utilities.make_implication(el_utilities.make_binary_formula(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col), consequent)), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str93$BAREFORM_3));
            }
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 26101L)
    public static SubLObject quantproc_3_reformulate_each(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(arg);
        final SubLObject each = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (number.equal(reformulator_module_quantifier_processing_3.$const94$Singular_NLAttr) && reformulator_module_quantifier_processing_3.NIL != subl_promotions.memberP(argnum, (SubLObject)reformulator_module_quantifier_processing_3.$list95, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_collectionP(col, mt)) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            final SubLObject consequent = el_utilities.replace_formula_arg(argnum, new_var, asent);
            return Values.values(el_utilities.make_universal(new_var, el_utilities.make_implication(el_utilities.make_binary_formula(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col), consequent)), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str96$5_1_or_5_2));
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 27100L)
    public static SubLObject quantproc_3_reformulate_no(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_quantifier_processing_3.NIL != el_utilities.formula_arityGE(thesent, (SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) {
            final SubLObject asent = conses_high.copy_tree(thesent);
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject arg1 = cycl_utilities.formula_arg1(asent, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(asent, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            final SubLObject arg3 = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(arg3);
            final SubLObject no = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_processing_3.NIL != subl_promotions.memberP(number, (SubLObject)reformulator_module_quantifier_processing_3.$list97, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) {
                if (argnum.numE((SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER) && reformulator_module_quantifier_processing_3.NIL != el_utilities.el_binary_formula_p(asent) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_predicateP(pred, mt) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_collectionP(col, mt)) {
                    return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const65$no_GenQuantRelnFrom, pred, arg1, col), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str98$9_1));
                }
                if (argnum.numE((SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER) && reformulator_module_quantifier_processing_3.NIL != el_utilities.el_binary_formula_p(asent) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_predicateP(pred, mt) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_collectionP(col, mt)) {
                    return Values.values(el_utilities.make_ternary_formula(reformulator_module_quantifier_processing_3.$const50$no_GenQuantRelnTo, pred, col, arg2), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str99$9_2));
                }
                if (reformulator_module_quantifier_processing_3.NIL != el_utilities.formula_arityGE(asent, (SubLObject)reformulator_module_quantifier_processing_3.THREE_INTEGER, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) {
                    final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                    final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
                    return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const100$disjointWith, col, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const35$TheSetOf, new_var, subsentence))), (SubLObject)reformulator_module_quantifier_processing_3.$str101$9_5_);
                }
            }
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 28643L)
    public static SubLObject quantproc_3_reformulate_indefinite(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(arg);
        final SubLObject indefinite = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (reformulator_module_quantifier_processing_3.NIL != subl_promotions.memberP(number, (SubLObject)reformulator_module_quantifier_processing_3.$list102, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && number.eql(reformulator_module_quantifier_processing_3.$const94$Singular_NLAttr) && (reformulator_module_quantifier_processing_3.$list87.equal(kb_accessors.argn_isa(pred, argnum, mt)) || reformulator_module_quantifier_processing_3.NIL == at_admitted.admitted_argumentP(col, argnum, pred, mt))) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
            return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const103$thereExists, new_var, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const104$and, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col), subsentence))), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str105$4_2));
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 30251L)
    public static SubLObject quantproc_3_reformulate_definite(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(arg);
        final SubLObject definite = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (reformulator_module_quantifier_processing_3.NIL != subl_promotions.memberP(number, (SubLObject)reformulator_module_quantifier_processing_3.$list97, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_predicateP(pred, mt) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_collectionP(col, mt) && (reformulator_module_quantifier_processing_3.$list87.equal(kb_accessors.argn_isa(pred, argnum, mt)) || reformulator_module_quantifier_processing_3.NIL == at_admitted.admitted_argumentP(col, argnum, pred, mt))) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
            return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const103$thereExists, new_var, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const104$and, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col), subsentence))), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str106$6_1));
        }
        if (argnum.numE((SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER) && reformulator_module_quantifier_processing_3.NIL != conses_high.member(number, (SubLObject)reformulator_module_quantifier_processing_3.$list107, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && reformulator_module_quantifier_processing_3.NIL != arity.arity_admitsGE(pred, (SubLObject)reformulator_module_quantifier_processing_3.THREE_INTEGER) && reformulator_module_quantifier_processing_3.NIL == arity.arity_admitsP(pred, (SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER) && reformulator_module_quantifier_processing_3.NIL != isa.isaP(pred, reformulator_module_quantifier_processing_3.$const108$ComparisonWRTPredicate, mt, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && (reformulator_module_quantifier_processing_3.NIL != isa.isaP(pred, reformulator_module_quantifier_processing_3.$const109$IndividualLevelPredicate, mt, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) || (reformulator_module_quantifier_processing_3.$list87.equal(kb_accessors.arg1_isa(pred, mt)) && reformulator_module_quantifier_processing_3.$list87.equal(kb_accessors.arg2_isa(pred, mt))))) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
            final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
            return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const110$forAll, new_var, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const111$implies, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col), subsentence))), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str112$6_4_1));
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 32199L)
    public static SubLObject quantproc_3_reformulate_numerical(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula(arg);
        final SubLObject nl_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject numerical_quant = el_utilities.unmake_binary_formula(nl_attr);
        final SubLObject integer_arg = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (reformulator_module_quantifier_processing_3.NIL != subl_promotions.positive_integer_p(integer_arg) || reformulator_module_quantifier_processing_3.NIL != at_defns.quiet_has_typeP(integer_arg, reformulator_module_quantifier_processing_3.$const113$ScalarInterval, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) || (reformulator_module_quantifier_processing_3.NIL != el_utilities.el_formula_p(integer_arg) && reformulator_module_quantifier_processing_3.NIL != isa.result_isa_colP(cycl_utilities.formula_arg0(integer_arg), reformulator_module_quantifier_processing_3.$const114$IntegerExtent, mt))) {
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (number.eql(reformulator_module_quantifier_processing_3.ONE_INTEGER.eql(integer_arg) ? reformulator_module_quantifier_processing_3.$const94$Singular_NLAttr : reformulator_module_quantifier_processing_3.$const81$Plural_NLAttr)) {
                final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
                return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const115$num_GenQuant, col, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const35$TheSetOf, new_var, subsentence), integer_arg)), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str116$10_1));
            }
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 33533L)
    public static SubLObject quantproc_3_reformulate_subcol(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if (reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_predicateP(pred, mt)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = el_utilities.unmake_ternary_formula(arg);
            final SubLObject nl_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_module_quantifier_processing_3.NIL != genl_predicates.genl_predP(pred, reformulator_module_quantifier_processing_3.$const36$isa, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) {
                return Values.values(el_utilities.replace_formula_arg(argnum, col, asent), (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const117$SubcollectionFunction, (SubLObject)reformulator_module_quantifier_processing_3.$kw118$1));
            }
            SubLObject cdolist_list_var = kb_accessors.argn_isa(pred, argnum, mt);
            SubLObject arg_isa_col = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
            arg_isa_col = cdolist_list_var.first();
            while (reformulator_module_quantifier_processing_3.NIL != cdolist_list_var) {
                if (!reformulator_module_quantifier_processing_3.$const119$Thing.eql(arg_isa_col) && reformulator_module_quantifier_processing_3.NIL != isa.isaP(arg_isa_col, reformulator_module_quantifier_processing_3.$const120$CollectionType, mt, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && reformulator_module_quantifier_processing_3.NIL != isa.isaP(col, arg_isa_col, mt, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) {
                    final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                    final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
                    return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const103$thereExists, new_var, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const104$and, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const84$genls, new_var, col), subsentence))), (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const117$SubcollectionFunction));
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg_isa_col = cdolist_list_var.first();
            }
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 34765L)
    public static SubLObject quantproc_3_reformulate_nested_subcol(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_quantifier_processing_3.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(thesent);
        final SubLObject function_arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if (reformulator_module_quantifier_processing_3.NIL != el_utilities.possibly_naut_p(function_arg) && reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_predicateP(pred, mt)) {
            final SubLObject functor = cycl_utilities.nat_functor(function_arg);
            if (reformulator_module_quantifier_processing_3.NIL != fort_types_interface.isa_functionP(functor, mt) && reformulator_module_quantifier_processing_3.NIL == isa.quoted_isaP(functor, reformulator_module_quantifier_processing_3.$const121$CycNLParsingConstant, mt, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && reformulator_module_quantifier_processing_3.NIL == reformulator_module_quantifier_unifier_3.subcollection_function_nautP(function_arg, mt)) {
                SubLObject function_argnum = (SubLObject)reformulator_module_quantifier_processing_3.ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(function_arg, (SubLObject)reformulator_module_quantifier_processing_3.$kw2$IGNORE);
                SubLObject arg = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
                arg = cdolist_list_var.first();
                while (reformulator_module_quantifier_processing_3.NIL != cdolist_list_var) {
                    function_argnum = Numbers.add(function_argnum, (SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER);
                    if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list14, reformulator_module_quantifier_processing_3.$const6$NLDefinitenessFn_3) || reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expressionP(arg, mt, (SubLObject)reformulator_module_quantifier_processing_3.$list15, reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3)) {
                        thread.resetMultipleValues();
                        final SubLObject nl_quant_fn = el_utilities.unmake_ternary_formula(arg);
                        final SubLObject nl_attr = thread.secondMultipleValue();
                        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                        final SubLObject start_index = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula(nl_number_fn_expr);
                        final SubLObject number = thread.secondMultipleValue();
                        final SubLObject col = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (nl_quant_fn.eql(reformulator_module_quantifier_processing_3.$const6$NLDefinitenessFn_3) && reformulator_module_quantifier_processing_3.NIL != conses_high.member(number, (SubLObject)reformulator_module_quantifier_processing_3.$list122, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && reformulator_module_quantifier_processing_3.NIL == at_admitted.admitted_argumentP(col, function_argnum, functor, mt)) {
                            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                            final SubLObject new_function_expr = el_utilities.replace_formula_arg(function_argnum, new_var, function_arg);
                            final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_function_expr, asent);
                            return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const103$thereExists, new_var, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const104$and, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col), subsentence))), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str123$8_1_or_8_2));
                        }
                        if (nl_quant_fn.eql(reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3) && reformulator_module_quantifier_processing_3.NIL != conses_high.member(nl_attr, (SubLObject)reformulator_module_quantifier_processing_3.$list124, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED) && reformulator_module_quantifier_processing_3.NIL == at_admitted.admitted_argumentP(col, function_argnum, functor, mt) && reformulator_module_quantifier_processing_3.NIL == reformulator_module_quantifier_unifier_3.subcollection_function_nautP(col, mt)) {
                            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                            final SubLObject new_function_expr = el_utilities.replace_formula_arg(function_argnum, new_var, function_arg);
                            final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_function_expr, asent);
                            return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const110$forAll, new_var, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const111$implies, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const36$isa, new_var, col), subsentence))), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str125$8_2_5));
                        }
                        if (((nl_quant_fn.eql(reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3) && reformulator_module_quantifier_processing_3.NIL != conses_high.member(number, (SubLObject)reformulator_module_quantifier_processing_3.$list107, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) || (nl_quant_fn.eql(reformulator_module_quantifier_processing_3.$const6$NLDefinitenessFn_3) && reformulator_module_quantifier_processing_3.NIL != conses_high.member(number, (SubLObject)reformulator_module_quantifier_processing_3.$list126, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED))) && reformulator_module_quantifier_processing_3.NIL != reformulator_module_quantifier_unifier_3.subcollection_function_nautP(col, mt) && reformulator_module_quantifier_processing_3.NIL != at_admitted.admitted_argumentP(col, function_argnum, functor, mt)) {
                            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                            final SubLObject new_function_expr = el_utilities.replace_formula_arg(function_argnum, new_var, function_arg);
                            final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_function_expr, asent);
                            return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const103$thereExists, new_var, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const104$and, (SubLObject)ConsesLow.list(reformulator_module_quantifier_processing_3.$const84$genls, new_var, col), subsentence))), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.$str127$8_3_1));
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 38183L)
    public static SubLObject quantproc_3_el_formula_next_arg_argnum(final SubLObject asent, final SubLObject mt) {
        SubLObject min_order = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        SubLObject best_candidate_arg_number = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        SubLObject best_candidate_sentence = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        SubLObject cur_arg_number = (SubLObject)reformulator_module_quantifier_processing_3.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, (SubLObject)reformulator_module_quantifier_processing_3.$kw2$IGNORE);
        SubLObject cur_sentence = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        cur_sentence = cdolist_list_var.first();
        while (reformulator_module_quantifier_processing_3.NIL != cdolist_list_var) {
            cur_arg_number = Numbers.add(cur_arg_number, (SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER);
            if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_any_nl_quant_fn_expressionP(cur_sentence, mt)) {
                final SubLObject cur_order = cycl_utilities.formula_arg3(cur_sentence, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
                if (reformulator_module_quantifier_processing_3.NIL == cur_order && reformulator_module_quantifier_processing_3.NIL == best_candidate_sentence) {
                    best_candidate_sentence = cur_sentence;
                    best_candidate_arg_number = cur_arg_number;
                }
                else if (cur_order.isInteger() && (reformulator_module_quantifier_processing_3.NIL == min_order || cur_order.numL(min_order))) {
                    min_order = cur_order;
                    best_candidate_sentence = cur_sentence;
                    best_candidate_arg_number = cur_arg_number;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_sentence = cdolist_list_var.first();
        }
        return Values.values(best_candidate_sentence, best_candidate_arg_number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 39131L)
    public static SubLObject quantproc_3_nl_quant_fn_expression_arg_order(final SubLObject poss_quant_fn_expr) {
        if (!poss_quant_fn_expr.isList() || (!reformulator_module_quantifier_processing_3.$const4$NLQuantFn_3.eql(cycl_utilities.sentence_arg0(poss_quant_fn_expr)) && !reformulator_module_quantifier_processing_3.$const6$NLDefinitenessFn_3.eql(cycl_utilities.sentence_arg0(poss_quant_fn_expr)))) {
            return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        }
        final SubLObject arg_order = cycl_utilities.sentence_arg3(poss_quant_fn_expr, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        if (arg_order.isInteger()) {
            return arg_order;
        }
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 39621L)
    public static SubLObject quantproc_3_expression_arg_order_list_apply(final SubLObject asent, SubLObject arg_order_min_list) {
        SubLObject result = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        SubLObject cdolist_list_var = asent;
        SubLObject arg = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        arg = cdolist_list_var.first();
        while (reformulator_module_quantifier_processing_3.NIL != cdolist_list_var) {
            if (reformulator_module_quantifier_processing_3.NIL != quantproc_3_nl_quant_fn_expression_arg_order(arg)) {
                final SubLObject new_arg_order = arg_order_min_list.first();
                arg_order_min_list = arg_order_min_list.rest();
                result = (SubLObject)ConsesLow.cons(list_utilities.replace_nth((SubLObject)reformulator_module_quantifier_processing_3.THREE_INTEGER, new_arg_order, arg), result);
            }
            else {
                result = (SubLObject)ConsesLow.cons(arg, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 40200L)
    public static SubLObject quantproc_3_formula_arg_order_list(final SubLObject asent) {
        return Sequences.remove((SubLObject)reformulator_module_quantifier_processing_3.NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)reformulator_module_quantifier_processing_3.$sym128$QUANTPROC_3_NL_QUANT_FN_EXPRESSION_ARG_ORDER), asent), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 40344L)
    public static SubLObject quantproc_3_el_formula_normalize(final SubLObject asent) {
        final SubLObject arg_order_list = quantproc_3_formula_arg_order_list(asent);
        if (!reformulator_module_quantifier_processing_3.ONE_INTEGER.numE(Sequences.count((SubLObject)reformulator_module_quantifier_processing_3.ZERO_INTEGER, arg_order_list, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) && reformulator_module_quantifier_processing_3.NIL != list_utilities.duplicates(arg_order_list, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED)) {
            return quantproc_3_expression_arg_order_list_apply(asent, (SubLObject)reformulator_module_quantifier_processing_3.$list129);
        }
        return asent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 40972L)
    public static SubLObject quantproc_3_apply_operation(final SubLObject list, final SubLObject operation) {
        if (operation.eql((SubLObject)reformulator_module_quantifier_processing_3.$kw130$SWITCH_FIRST)) {
            if (Sequences.length(list).numG((SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER)) {
                return (SubLObject)ConsesLow.cons(conses_high.cadr(list), (SubLObject)ConsesLow.cons(list.first(), conses_high.cddr(list)));
            }
            return list;
        }
        else {
            if (operation.eql((SubLObject)reformulator_module_quantifier_processing_3.$kw131$SHIFT_LEFT)) {
                return list_utilities.list_rotate_left(list);
            }
            if (operation.eql((SubLObject)reformulator_module_quantifier_processing_3.$kw132$SHIFT_RIGHT)) {
                return list_utilities.list_rotate_right(list);
            }
            return list;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 41299L)
    public static SubLObject quantproc_3_arg_order_list_permutations(final SubLObject arg_order_list) {
        SubLObject arg_order_list_list = (SubLObject)ConsesLow.list(arg_order_list);
        SubLObject cur_arg_order_list = arg_order_list;
        final SubLObject operation_list_orig = (SubLObject)reformulator_module_quantifier_processing_3.$list133;
        final SubLObject arg_order_list_length = Sequences.length(arg_order_list);
        final SubLObject num_steps = (SubLObject)(arg_order_list_length.numG((SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER) ? Numbers.multiply(arg_order_list_length, Numbers.subtract(arg_order_list_length, (SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER)) : reformulator_module_quantifier_processing_3.ONE_INTEGER);
        SubLObject step = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        SubLObject operation_list = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        SubLObject operation = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        step = (SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER;
        operation_list = operation_list_orig;
        operation = operation_list.first();
        while (!step.numGE(num_steps)) {
            cur_arg_order_list = quantproc_3_apply_operation(cur_arg_order_list, operation);
            arg_order_list_list = (SubLObject)ConsesLow.cons(cur_arg_order_list, arg_order_list_list);
            step = Numbers.add(step, (SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER);
            operation_list = list_utilities.list_rotate_left(operation_list);
            operation = operation_list.first();
        }
        arg_order_list_list = Sequences.nreverse(arg_order_list_list);
        arg_order_list_list = Sequences.remove_duplicates(arg_order_list_list, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED);
        return arg_order_list_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-processing-3.lisp", position = 42234L)
    public static SubLObject quantproc_3_el_formula_permutations(final SubLObject asent) {
        final SubLObject arg_order_list_orig = quantproc_3_formula_arg_order_list(asent);
        SubLObject arg_order_list_list = quantproc_3_arg_order_list_permutations(arg_order_list_orig);
        SubLObject result_list = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        SubLObject cdolist_list_var;
        arg_order_list_list = (cdolist_list_var = Sequences.remove_duplicates(arg_order_list_list, Symbols.symbol_function((SubLObject)reformulator_module_quantifier_processing_3.EQUAL), (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED, (SubLObject)reformulator_module_quantifier_processing_3.UNPROVIDED));
        SubLObject arg_order_list = (SubLObject)reformulator_module_quantifier_processing_3.NIL;
        arg_order_list = cdolist_list_var.first();
        while (reformulator_module_quantifier_processing_3.NIL != cdolist_list_var) {
            result_list = (SubLObject)ConsesLow.cons(quantproc_3_expression_arg_order_list_apply(asent, arg_order_list), result_list);
            cdolist_list_var = cdolist_list_var.rest();
            arg_order_list = cdolist_list_var.first();
        }
        result_list = Sequences.nreverse(result_list);
        return result_list;
    }
    
    public static SubLObject declare_reformulator_module_quantifier_processing_3_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_required", "QUANTPROC-3-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_any_nl_quant_fn_expressionP", "QUANTPROC-3-ANY-NL-QUANT-FN-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_nl_quant_fn_expressionP", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_numerical_quant_fn_expressionP", "QUANTPROC-3-NUMERICAL-QUANT-FN-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "subcollection_function_naut_sans_mtP", "SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_subcol_expressionP", "QUANTPROC-3-SUBCOL-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "non_gen_quant_attributeP", "NON-GEN-QUANT-ATTRIBUTE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_nested_subcol_expressionP", "QUANTPROC-3-NESTED-SUBCOL-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_cardinality_of_fn_expressionP", "QUANTPROC-3-CARDINALITY-OF-FN-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_gen_quant_reln_type_arg_position", "QUANTPROC-3-GEN-QUANT-RELN-TYPE-ARG-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "gen_quant_relation_from_p", "GEN-QUANT-RELATION-FROM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "gen_quant_relation_to_p", "GEN-QUANT-RELATION-TO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_gen_quant_reln_from_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-FROM-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_gen_quant_reln_to_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-TO-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_cost", "QUANTPROC-3-COST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate", "QUANTPROC-3-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_cardinality_of_fn", "QUANTPROC-3-REFORMULATE-CARDINALITY-OF-FN", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_gen_quant_reln_to", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-TO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_gen_quant_reln_from", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-FROM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_gen_quant", "QUANTPROC-3-REFORMULATE-GEN-QUANT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_every", "QUANTPROC-3-REFORMULATE-EVERY", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_some", "QUANTPROC-3-REFORMULATE-SOME", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_bare_form", "QUANTPROC-3-REFORMULATE-BARE-FORM", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_each", "QUANTPROC-3-REFORMULATE-EACH", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_no", "QUANTPROC-3-REFORMULATE-NO", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_indefinite", "QUANTPROC-3-REFORMULATE-INDEFINITE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_definite", "QUANTPROC-3-REFORMULATE-DEFINITE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_numerical", "QUANTPROC-3-REFORMULATE-NUMERICAL", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_subcol", "QUANTPROC-3-REFORMULATE-SUBCOL", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_reformulate_nested_subcol", "QUANTPROC-3-REFORMULATE-NESTED-SUBCOL", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_el_formula_next_arg_argnum", "QUANTPROC-3-EL-FORMULA-NEXT-ARG-ARGNUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_nl_quant_fn_expression_arg_order", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION-ARG-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_expression_arg_order_list_apply", "QUANTPROC-3-EXPRESSION-ARG-ORDER-LIST-APPLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_formula_arg_order_list", "QUANTPROC-3-FORMULA-ARG-ORDER-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_el_formula_normalize", "QUANTPROC-3-EL-FORMULA-NORMALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_apply_operation", "QUANTPROC-3-APPLY-OPERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_arg_order_list_permutations", "QUANTPROC-3-ARG-ORDER-LIST-PERMUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3", "quantproc_3_el_formula_permutations", "QUANTPROC-3-EL-FORMULA-PERMUTATIONS", 1, 0, false);
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    public static SubLObject init_reformulator_module_quantifier_processing_3_file() {
        reformulator_module_quantifier_processing_3.$subcollection_function_mt$ = SubLFiles.defparameter("*SUBCOLLECTION-FUNCTION-MT*", (SubLObject)reformulator_module_quantifier_processing_3.NIL);
        reformulator_module_quantifier_processing_3.$gen_quant_relations_from$ = SubLFiles.deflexical("*GEN-QUANT-RELATIONS-FROM*", (SubLObject)reformulator_module_quantifier_processing_3.$list24);
        reformulator_module_quantifier_processing_3.$gen_quant_relations_to$ = SubLFiles.deflexical("*GEN-QUANT-RELATIONS-TO*", (SubLObject)reformulator_module_quantifier_processing_3.$list25);
        reformulator_module_quantifier_processing_3.$quantproc_3_microseconds$ = SubLFiles.deflexical("*QUANTPROC-3-MICROSECONDS*", (SubLObject)reformulator_module_quantifier_processing_3.$int26$30000);
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    public static SubLObject setup_reformulator_module_quantifier_processing_3_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_quantifier_processing_3.$const0$QuantifierProcessing_3_RLModule, (SubLObject)reformulator_module_quantifier_processing_3.$list1);
        return (SubLObject)reformulator_module_quantifier_processing_3.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_reformulator_module_quantifier_processing_3_file();
    }
    
    @Override
	public void initializeVariables() {
        init_reformulator_module_quantifier_processing_3_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_reformulator_module_quantifier_processing_3_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_quantifier_processing_3();
        reformulator_module_quantifier_processing_3.$subcollection_function_mt$ = null;
        reformulator_module_quantifier_processing_3.$gen_quant_relations_from$ = null;
        reformulator_module_quantifier_processing_3.$gen_quant_relations_to$ = null;
        reformulator_module_quantifier_processing_3.$quantproc_3_microseconds$ = null;
        $const0$QuantifierProcessing_3_RLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantifierProcessing-3-RLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("QUANTPROC-3-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("QUANTPROC-3-COST"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("QUANTPROC-3-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Handles the reformulation of NL-quantified expressions."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$contains-Underspecified \n     (#$NLQuantFn-3 #$Every-NLAttr \n \t       (#$NLNumberFn #$Singular-NLAttr #$SNRNP)) \n     (#$NLQuantFn-3 #$Some-NLAttr \n \t       (#$NLNumberFn #$Mass-NLAttr #$RNAMolecule)))"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$implies \n     (#$isa ?VAR0 #$SNRNP) \n     (#$contains-Underspecified ?VAR0 \n      (#$NLQuantFn-3 #$Some-NLAttr \n       (#$NLNumberFn #$Mass-NLAttr #$RNAMolecule))))") });
        $kw2$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list3 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Every-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Some-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BareForm-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Each-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("No-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Many-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Most-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Several-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Few-NLAttr")) });
        $const4$NLQuantFn_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3"));
        $list5 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Indefinite-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr")));
        $const6$NLDefinitenessFn_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3"));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberAttribute"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-COLLECTION?"))));
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberAttribute"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-COLLECTION?"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")));
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericalQuant-NLAttrFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberAttribute"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-COLLECTION?"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")));
        $list10 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericalQuant-NLAttrFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberAttribute"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-COLLECTION?"))));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TAG-FN-FORT-3?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-GEN-QUANT-ATTRIBUTE?")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")));
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TAG-FN-FORT-3?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-GEN-QUANT-ATTRIBUTE?")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?"))));
        $const13$NLGenQuantAttribute = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLGenQuantAttribute"));
        $list14 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Indefinite-NLAttr")));
        $list15 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BareForm-NLAttr")));
        $list16 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardinalityOfFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list17 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BareForm-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Some-NLAttr")));
        $list18 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Indefinite-NLAttr")));
        $const19$GeneralizedQuantifierRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralizedQuantifierRelation"));
        $const20$TypeInstanceTernaryRuleMacroPredi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypeInstanceTernaryRuleMacroPredicate"));
        $kw21$TO_TYPE = SubLObjectFactory.makeKeyword("TO-TYPE");
        $const22$InstanceTypeTernaryRuleMacroPredi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceTypeTernaryRuleMacroPredicate"));
        $kw23$FROM_TYPE = SubLObjectFactory.makeKeyword("FROM-TYPE");
        $list24 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("most-GenQuantRelnFrom")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("many-GenQuantRelnFrom")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("few-GenQuantRelnFrom")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("several-GenQuantRelnFrom")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("no-GenQuantRelnFrom")));
        $list25 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("most-GenQuantRelnTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("many-GenQuantRelnTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("few-GenQuantRelnTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("several-GenQuantRelnTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("no-GenQuantRelnTo")));
        $int26$30000 = SubLObjectFactory.makeInteger(30000);
        $list27 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Every-NLAttr")));
        $list28 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Some-NLAttr")));
        $list29 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Each-NLAttr")));
        $list30 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Most-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Many-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Several-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Few-NLAttr")));
        $list31 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("No-NLAttr")));
        $list32 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr")));
        $const33$is_Underspecified = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("is-Underspecified"));
        $const34$extentCardinality = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extentCardinality"));
        $const35$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $const36$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str37$CardinalityOfFn_1 = SubLObjectFactory.makeString("CardinalityOfFn 1");
        $const38$most_GenQuantRelnTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("most-GenQuantRelnTo"));
        $const39$most_GenQuantRelnToType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("most-GenQuantRelnToType"));
        $str40$3_4 = SubLObjectFactory.makeString("3.4");
        $const41$few_GenQuantRelnTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("few-GenQuantRelnTo"));
        $const42$few_GenQuantRelnToType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("few-GenQuantRelnToType"));
        $str43$11_5_1 = SubLObjectFactory.makeString("11.5.1");
        $const44$many_GenQuantRelnTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("many-GenQuantRelnTo"));
        $const45$many_GenQuantRelnToType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("many-GenQuantRelnToType"));
        $str46$2_4 = SubLObjectFactory.makeString("2.4");
        $const47$several_GenQuantRelnTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("several-GenQuantRelnTo"));
        $const48$several_GenQuantRelnToType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("several-GenQuantRelnToType"));
        $str49$7_5_1 = SubLObjectFactory.makeString("7.5.1");
        $const50$no_GenQuantRelnTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("no-GenQuantRelnTo"));
        $const51$no_GenQuantRelnToFromType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("no-GenQuantRelnToFromType"));
        $str52$9_2_5 = SubLObjectFactory.makeString("9.2.5");
        $const53$most_GenQuantRelnFrom = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("most-GenQuantRelnFrom"));
        $const54$most_GenQuantRelnFromType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("most-GenQuantRelnFromType"));
        $str55$3_3 = SubLObjectFactory.makeString("3.3");
        $const56$few_GenQuantRelnFrom = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("few-GenQuantRelnFrom"));
        $const57$few_GenQuantRelnFromType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("few-GenQuantRelnFromType"));
        $str58$11_5_2 = SubLObjectFactory.makeString("11.5.2");
        $const59$many_GenQuantRelnFrom = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("many-GenQuantRelnFrom"));
        $const60$many_GenQuantRelnFromType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("many-GenQuantRelnFromType"));
        $str61$2_5 = SubLObjectFactory.makeString("2.5");
        $const62$several_GenQuantRelnFrom = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("several-GenQuantRelnFrom"));
        $const63$several_GenQuantRelnFromType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("several-GenQuantRelnFromType"));
        $str64$7_5_2 = SubLObjectFactory.makeString("7.5.2");
        $const65$no_GenQuantRelnFrom = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("no-GenQuantRelnFrom"));
        $str66$9_1_5 = SubLObjectFactory.makeString("9.1.5");
        $const67$correspondingGenQuant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("correspondingGenQuant"));
        $list68 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mass-NLAttr")));
        $const69$Most_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Most-NLAttr"));
        $str70$GenQuant_2_1 = SubLObjectFactory.makeString("GenQuant 2.1");
        $const71$Many_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Many-NLAttr"));
        $str72$GenQuant_2_2 = SubLObjectFactory.makeString("GenQuant 2.2");
        $const73$Few_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Few-NLAttr"));
        $str74$GenQuant_2_3 = SubLObjectFactory.makeString("GenQuant 2.3");
        $const75$Several_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Several-NLAttr"));
        $str76$GenQuant_2_4 = SubLObjectFactory.makeString("GenQuant 2.4");
        $str77$GenQuant_3_1 = SubLObjectFactory.makeString("GenQuant 3.1");
        $str78$GenQuant_3_2 = SubLObjectFactory.makeString("GenQuant 3.2");
        $str79$GenQuant_3_3 = SubLObjectFactory.makeString("GenQuant 3.3");
        $str80$GenQuant_3_4 = SubLObjectFactory.makeString("GenQuant 3.4");
        $const81$Plural_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr"));
        $str82$GenQuant_1 = SubLObjectFactory.makeString("GenQuant 1");
        $const83$RuleMacroPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RuleMacroPredicate"));
        $const84$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const85$Every_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Every-NLAttr"));
        $const86$Some_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Some-NLAttr"));
        $list87 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $list88 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mass-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr")));
        $list89 = ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER, (SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER);
        $const90$Generic_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Generic-NLAttr"));
        $str91$BAREFORM_1 = SubLObjectFactory.makeString("BAREFORM-1");
        $str92$BAREFORM_2 = SubLObjectFactory.makeString("BAREFORM-2");
        $str93$BAREFORM_3 = SubLObjectFactory.makeString("BAREFORM-3");
        $const94$Singular_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr"));
        $list95 = ConsesLow.list((SubLObject)reformulator_module_quantifier_processing_3.ONE_INTEGER, (SubLObject)reformulator_module_quantifier_processing_3.TWO_INTEGER);
        $str96$5_1_or_5_2 = SubLObjectFactory.makeString("5.1 or 5.2");
        $list97 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mass-NLAttr")));
        $str98$9_1 = SubLObjectFactory.makeString("9.1");
        $str99$9_2 = SubLObjectFactory.makeString("9.2");
        $const100$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $str101$9_5_ = SubLObjectFactory.makeString("9.5+");
        $list102 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Generic-NLAttr")));
        $const103$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $const104$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $str105$4_2 = SubLObjectFactory.makeString("4.2");
        $str106$6_1 = SubLObjectFactory.makeString("6.1");
        $list107 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mass-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr")));
        $const108$ComparisonWRTPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComparisonWRTPredicate"));
        $const109$IndividualLevelPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndividualLevelPredicate"));
        $const110$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $const111$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $str112$6_4_1 = SubLObjectFactory.makeString("6.4.1");
        $const113$ScalarInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScalarInterval"));
        $const114$IntegerExtent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntegerExtent"));
        $const115$num_GenQuant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("num-GenQuant"));
        $str116$10_1 = SubLObjectFactory.makeString("10.1");
        $const117$SubcollectionFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionFunction"));
        $kw118$1 = SubLObjectFactory.makeKeyword("1");
        $const119$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const120$CollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $const121$CycNLParsingConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycNLParsingConstant"));
        $list122 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mass-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr")));
        $str123$8_1_or_8_2 = SubLObjectFactory.makeString("8.1 or 8.2");
        $list124 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BareForm-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Every-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Each-NLAttr")));
        $str125$8_2_5 = SubLObjectFactory.makeString("8.2.5");
        $list126 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mass-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr")));
        $str127$8_3_1 = SubLObjectFactory.makeString("8.3.1");
        $sym128$QUANTPROC_3_NL_QUANT_FN_EXPRESSION_ARG_ORDER = SubLObjectFactory.makeSymbol("QUANTPROC-3-NL-QUANT-FN-EXPRESSION-ARG-ORDER");
        $list129 = ConsesLow.list(new SubLObject[] { reformulator_module_quantifier_processing_3.ZERO_INTEGER, reformulator_module_quantifier_processing_3.ONE_INTEGER, reformulator_module_quantifier_processing_3.TWO_INTEGER, reformulator_module_quantifier_processing_3.THREE_INTEGER, reformulator_module_quantifier_processing_3.FOUR_INTEGER, reformulator_module_quantifier_processing_3.FIVE_INTEGER, reformulator_module_quantifier_processing_3.SIX_INTEGER, reformulator_module_quantifier_processing_3.SEVEN_INTEGER, reformulator_module_quantifier_processing_3.EIGHT_INTEGER });
        $kw130$SWITCH_FIRST = SubLObjectFactory.makeKeyword("SWITCH-FIRST");
        $kw131$SHIFT_LEFT = SubLObjectFactory.makeKeyword("SHIFT-LEFT");
        $kw132$SHIFT_RIGHT = SubLObjectFactory.makeKeyword("SHIFT-RIGHT");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SWITCH-FIRST"), (SubLObject)SubLObjectFactory.makeKeyword("SHIFT-LEFT"), (SubLObject)SubLObjectFactory.makeKeyword("SWITCH-FIRST"), (SubLObject)SubLObjectFactory.makeKeyword("SHIFT-RIGHT"));
    }
}

/*

	Total time: 274 ms
	
*/