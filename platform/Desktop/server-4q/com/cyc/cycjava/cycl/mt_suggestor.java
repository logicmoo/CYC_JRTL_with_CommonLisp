package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mt_suggestor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.mt_suggestor";
    public static final String myFingerPrint = "2c39bcf7f5a0e4e591febd0ea8e36fc5ed345f9a20939e3f88c6863a84bd2b62";
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 2634L)
    public static SubLSymbol $mts_forbid_lexical_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 2829L)
    public static SubLSymbol $mts_forbid_project_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 3054L)
    public static SubLSymbol $mts_forbid_high_level_mts_for_content_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 4220L)
    private static SubLSymbol $predicate_determined_gaf_cutoff_percent$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 5053L)
    private static SubLSymbol $predicate_determined_gaf_cutoff_number$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 7065L)
    private static SubLSymbol $mtsugg_related_assertion_formulas_query_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 7370L)
    private static SubLSymbol $mtsugg_related_assertion_formulas_query_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 11075L)
    private static SubLSymbol $frequency_list_of_mts_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 16387L)
    private static SubLSymbol $mtsugg_too_general_term_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 16676L)
    private static SubLSymbol $mtsugg_too_general_collection_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 16783L)
    private static SubLSymbol $mtsugg_too_general_quoted_collection_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18977L)
    private static SubLSymbol $top_mt_percent_count_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 20289L)
    private static SubLSymbol $examination_formulas$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 21076L)
    private static SubLSymbol $examination_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 21247L)
    private static SubLSymbol $mts_incorrect_formulas$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 21368L)
    private static SubLSymbol $mts_actual_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 21530L)
    private static SubLSymbol $mts_guessed_mts$;
    private static final SubLSymbol $sym0$EL_FORMULA_P;
    private static final SubLSymbol $sym1$MTS_NOT_COMMONSENSE_MT_;
    private static final SubLSymbol $sym2$CAR;
    private static final SubLObject $const3$BaseKB;
    private static final SubLFloat $float4$0_8;
    private static final SubLObject $const5$BookkeepingMt;
    private static final SubLObject $const6$UniversalVocabularyMt;
    private static final SubLObject $const7$LexicalMicrotheory;
    private static final SubLObject $const8$ProjectMicrotheory;
    private static final SubLObject $const9$ApplicationContext;
    private static final SubLObject $const10$SourceMicrotheory;
    private static final SubLObject $const11$MappingMicrotheory;
    private static final SubLObject $const12$ProblemSolvingCntxt;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$GAF_;
    private static final SubLSymbol $sym16$_X;
    private static final SubLSymbol $sym17$_MT;
    private static final SubLSymbol $kw18$IGNORE;
    private static final SubLObject $const19$ist_Asserted;
    private static final SubLSymbol $sym20$ASSERTION_MONAD_MT;
    private static final SubLInteger $int21$100;
    private static final SubLInteger $int22$10000;
    private static final SubLFloat $float23$0_5;
    private static final SubLFloat $float24$0_2;
    private static final SubLSymbol $sym25$FREQUENCY_LIST_OF_MTS;
    private static final SubLSymbol $sym26$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const27$EverythingPSC;
    private static final SubLSymbol $kw28$GAF;
    private static final SubLSymbol $kw29$RULE;
    private static final SubLSymbol $sym30$_FREQUENCY_LIST_OF_MTS_CACHING_STATE_;
    private static final SubLSymbol $sym31$MTS_TOO_GENERAL_;
    private static final SubLObject $const32$Dog;
    private static final SubLSymbol $sym33$MTS_TOO_GENERAL_LIGHT_FILTERING_;
    private static final SubLSymbol $sym34$CONS;
    private static final SubLSymbol $sym35$_;
    private static final SubLSymbol $sym36$CADDR;
    private static final SubLSymbol $sym37$CADR;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLObject $const41$MetaRelation;
    private static final SubLObject $const42$CoreConstant;
    private static final SubLObject $const43$KEFacilitationPredicate;
    private static final SubLInteger $int44$20000;
    private static final SubLSymbol $sym45$RELEVANT_MT_IS_ANY_MT;
    private static final SubLSymbol $sym46$ASSERTION_MT;
    private static final SubLSymbol $sym47$TOP_MT_PERCENT_COUNT;
    private static final SubLSymbol $sym48$_;
    private static final SubLSymbol $sym49$CDR;
    private static final SubLSymbol $sym50$_TOP_MT_PERCENT_COUNT_CACHING_STATE_;
    private static final SubLInteger $int51$25;
    private static final SubLSymbol $sym52$LISTP;
    private static final SubLSymbol $sym53$ATOM;
    private static final SubLSymbol $sym54$LAST;
    private static final SubLList $list55;
    private static final SubLString $str56$Running_test__;
    private static final SubLString $str57$_RESULTS__;
    private static final SubLString $str58$Incorrect_Formula__;
    private static final SubLString $str59$Suggested_Mt__;
    private static final SubLString $str60$Actual_Mt__;
    private static final SubLString $str61$Frequency_list_of_suggested_mts__;
    private static final SubLString $str62$Frequency_list_of_actual_mts__;
    private static final SubLObject $const63$SAICLegacyAssertionsMt;
    private static final SubLObject $const64$PredicatePopulationMt;
    private static final SubLObject $const65$TestVocabularyMt;
    private static final SubLObject $const66$MotleyFoolUKGlossaryMt;
    private static final SubLObject $const67$WebSearchEnhancementMt;
    private static final SubLObject $const68$DesertShieldMt;
    private static final SubLObject $const69$OilEconModelMt;
    private static final SubLObject $const70$Y2Scenario_Stage1Mt;
    private static final SubLObject $const71$BeachWalkIMt;
    private static final SubLObject $const72$PQ204Mt;
    private static final SubLObject $const73$isa;
    private static final SubLObject $const74$genls;
    private static final SubLObject $const75$MetaPredicate;
    private static final SubLObject $const76$RuleMacroPredicate;
    private static final SubLObject $const77$BiologyMt;
    private static final SubLObject $const78$ModernMilitaryTacticsMt;
    private static final SubLObject $const79$HumanSocialLifeMt;
    private static final SubLObject $const80$ChemistryMt;
    private static final SubLObject $const81$EnglishLexiconMt;
    private static final SubLObject $const82$EnglishParaphraseMt;
    private static final SubLObject $const83$LogicalTruthMt;
    private static final SubLObject $const84$LogicalTruthImplementationMt;
    private static final SubLObject $const85$CoreCycLMt;
    private static final SubLString $str86$Trying_Formula__;
    private static final SubLString $str87$Got_;
    private static final SubLString $str88$_out_of_;
    private static final SubLSymbol $kw89$MT;
    private static final SubLSymbol $kw90$BROAD_MT;
    private static final SubLSymbol $kw91$MAPPING_DONE;
    private static final SubLString $str92$do_broad_mt_index;
    private static final SubLSymbol $sym93$STRINGP;
    private static final SubLSymbol $kw94$SKIP;
    private static final SubLInteger $int95$100000;
    private static final SubLObject $const96$InferencePSC;
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 3251L)
    public static SubLObject suggest_mt(final SubLObject formula) {
        assert mt_suggestor.NIL != el_utilities.el_formula_p(formula) : formula;
        if (mt_suggestor.NIL != el_utilities.gafP(formula)) {
            return suggest_mt_for_gaf(formula);
        }
        return suggest_mt_by_content(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 3556L)
    public static SubLObject suggest_mt_by_content(final SubLObject formula) {
        final SubLObject data = mts_get_summed_data(formula);
        final SubLObject filtered = Sequences.remove_if((SubLObject)mt_suggestor.$sym1$MTS_NOT_COMMONSENSE_MT_, data, (SubLObject)mt_suggestor.$sym2$CAR, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
        final SubLObject just_mts = Mapping.mapcar((SubLObject)mt_suggestor.$sym2$CAR, filtered);
        return (mt_suggestor.NIL == just_mts) ? mt_suggestor.$const3$BaseKB : just_mts.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 5119L)
    public static SubLObject suggest_mt_for_gaf(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_list_with_count = mt_list_from_related(gaf);
        final SubLObject mt_list = Mapping.mapcar((SubLObject)mt_suggestor.$sym2$CAR, mt_list_with_count);
        if (mt_suggestor.NIL != mt_list_with_count && mt_suggestor.THREE_INTEGER.numL(conses_high.cdar(mt_list_with_count))) {
            return mt_list.first();
        }
        final SubLObject predicate_results = top_mt_percent_count(gaf.first(), (SubLObject)mt_suggestor.UNPROVIDED);
        if (mt_suggestor.NIL != predicate_results && conses_high.second(predicate_results).numG(mt_suggestor.$predicate_determined_gaf_cutoff_percent$.getDynamicValue(thread)) && conses_high.third(predicate_results).numG(mt_suggestor.$predicate_determined_gaf_cutoff_number$.getDynamicValue(thread))) {
            return predicate_results.first();
        }
        return suggest_mt_by_content(gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 5904L)
    public static SubLObject mts_not_commonsense_mtP(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(mt.equal(mt_suggestor.$const5$BookkeepingMt) || (mt_suggestor.NIL != mt_suggestor.$mts_forbid_high_level_mts_for_content_assertions$.getDynamicValue(thread) && mt.equal(mt_suggestor.$const3$BaseKB)) || (mt_suggestor.NIL != mt_suggestor.$mts_forbid_high_level_mts_for_content_assertions$.getDynamicValue(thread) && mt.equal(mt_suggestor.$const6$UniversalVocabularyMt)) || (mt_suggestor.NIL != mt_suggestor.$mts_forbid_lexical_mts$.getDynamicValue(thread) && mt_suggestor.NIL != isa.isaP(mt, mt_suggestor.$const7$LexicalMicrotheory, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED)) || (mt_suggestor.NIL != mt_suggestor.$mts_forbid_project_mts$.getDynamicValue(thread) && mt_suggestor.NIL != likely_project_related_assertionP(mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 6585L)
    public static SubLObject likely_project_related_assertionP(final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == constant_handles.constant_p(mt) || mt_suggestor.NIL != isa.isa_in_any_mtP(mt, mt_suggestor.$const8$ProjectMicrotheory) || (mt_suggestor.NIL != isa.isa_in_any_mtP(mt, mt_suggestor.$const9$ApplicationContext) && mt_suggestor.NIL == isa.isaP(mt, mt_suggestor.$const7$LexicalMicrotheory, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED)) || mt_suggestor.NIL != isa.isaP(mt, mt_suggestor.$const10$SourceMicrotheory, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED) || mt_suggestor.NIL != isa.isaP(mt, mt_suggestor.$const11$MappingMicrotheory, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED) || mt_suggestor.NIL != isa.isaP(mt, mt_suggestor.$const12$ProblemSolvingCntxt, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 7527L)
    public static SubLObject mtsugg_get_related_assertions(final SubLObject formula) {
        assert mt_suggestor.NIL != el_utilities.gafP(formula) : formula;
        if (arity.arity(cycl_utilities.formula_arg0(formula)).numL((SubLObject)mt_suggestor.TWO_INTEGER)) {
            return (SubLObject)mt_suggestor.NIL;
        }
        final SubLObject missing_term = (SubLObject)mt_suggestor.$sym16$_X;
        final SubLObject mt_term = (SubLObject)mt_suggestor.$sym17$_MT;
        SubLObject answers = (SubLObject)mt_suggestor.NIL;
        SubLObject query_formula = (SubLObject)mt_suggestor.NIL;
        SubLObject term_num = (SubLObject)mt_suggestor.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)mt_suggestor.$kw18$IGNORE);
        SubLObject v_term = (SubLObject)mt_suggestor.NIL;
        v_term = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            term_num = Numbers.add(term_num, (SubLObject)mt_suggestor.ONE_INTEGER);
            query_formula = conses_high.copy_tree(formula);
            ConsesLow.set_nth(term_num, query_formula, missing_term);
            SubLObject cdolist_list_var_$1;
            final SubLObject v_bindings = cdolist_list_var_$1 = inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(mt_suggestor.$const19$ist_Asserted, mt_term, query_formula), mt_suggestor.$mtsugg_related_assertion_formulas_query_mt$.getGlobalValue(), mt_suggestor.$mtsugg_related_assertion_formulas_query_properties$.getGlobalValue());
            SubLObject binding = (SubLObject)mt_suggestor.NIL;
            binding = cdolist_list_var_$1.first();
            while (mt_suggestor.NIL != cdolist_list_var_$1) {
                final SubLObject related_formula = conses_high.copy_tree(formula);
                ConsesLow.set_nth(term_num, related_formula, bindings.variable_binding_value(bindings.get_variable_binding(missing_term, binding)));
                final SubLObject mt = bindings.variable_binding_value(bindings.get_variable_binding(mt_term, binding));
                final SubLObject assertion = czer_meta.find_assertion_cycl(related_formula, mt);
                if (mt_suggestor.NIL != assertion_handles.assertion_p(assertion)) {
                    answers = (SubLObject)ConsesLow.cons(assertion, answers);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                binding = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 9351L)
    public static SubLObject mt_list_from_related(final SubLObject formula) {
        assert mt_suggestor.NIL != el_utilities.gafP(formula) : formula;
        final SubLObject assertions = mtsugg_get_related_assertions(formula);
        if (mt_suggestor.NIL != assertions) {
            final SubLObject mts = Mapping.mapcar((SubLObject)mt_suggestor.$sym20$ASSERTION_MONAD_MT, assertions);
            return number_utilities.get_sorted_frequency_list(mts);
        }
        return (SubLObject)mt_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 10008L)
    public static SubLObject mts_specificity_estimate(final SubLObject v_term) {
        final SubLObject generality = cardinality_estimates.generality_estimate(v_term);
        if (generality.numL((SubLObject)mt_suggestor.$int21$100)) {
            return (SubLObject)mt_suggestor.ONE_INTEGER;
        }
        if (generality.numL((SubLObject)mt_suggestor.$int22$10000)) {
            return (SubLObject)mt_suggestor.$float23$0_5;
        }
        return (SubLObject)mt_suggestor.$float24$0_2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 10331L)
    public static SubLObject frequency_list_of_mts_adjusted(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == mt_suggestor.UNPROVIDED) {
            function_or_predicate = (SubLObject)mt_suggestor.NIL;
        }
        if (rule_assertion == mt_suggestor.UNPROVIDED) {
            rule_assertion = (SubLObject)mt_suggestor.NIL;
        }
        final SubLObject freqlist = frequency_list_of_mts(v_term, function_or_predicate, rule_assertion);
        final SubLObject specificity = mts_specificity_estimate(v_term);
        SubLObject adjusted = (SubLObject)mt_suggestor.NIL;
        SubLObject cdolist_list_var = freqlist;
        SubLObject pair = (SubLObject)mt_suggestor.NIL;
        pair = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            adjusted = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pair.first(), Numbers.multiply(pair.rest(), specificity)), adjusted);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return Sequences.nreverse(adjusted);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 11075L)
    public static SubLObject clear_frequency_list_of_mts() {
        final SubLObject cs = mt_suggestor.$frequency_list_of_mts_caching_state$.getGlobalValue();
        if (mt_suggestor.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)mt_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 11075L)
    public static SubLObject remove_frequency_list_of_mts(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == mt_suggestor.UNPROVIDED) {
            function_or_predicate = (SubLObject)mt_suggestor.NIL;
        }
        if (rule_assertion == mt_suggestor.UNPROVIDED) {
            rule_assertion = (SubLObject)mt_suggestor.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(mt_suggestor.$frequency_list_of_mts_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, function_or_predicate, rule_assertion), (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 11075L)
    public static SubLObject frequency_list_of_mts_internal(final SubLObject v_term, final SubLObject function_or_predicate, final SubLObject rule_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = (SubLObject)mt_suggestor.NIL;
        if (mt_suggestor.NIL != list_utilities.sublisp_boolean(function_or_predicate)) {
            if (mt_suggestor.NIL != fort_types_interface.predicateP(v_term)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)mt_suggestor.$sym26$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(mt_suggestor.$const27$EverythingPSC, thread);
                    if (mt_suggestor.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(v_term)) {
                        final SubLObject str = (SubLObject)mt_suggestor.NIL;
                        final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)mt_suggestor.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)mt_suggestor.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)mt_suggestor.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)mt_suggestor.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((mt_suggestor.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : mt_suggestor.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(v_term);
                            SubLObject done_var = (SubLObject)mt_suggestor.NIL;
                            final SubLObject token_var = (SubLObject)mt_suggestor.NIL;
                            while (mt_suggestor.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (mt_suggestor.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)mt_suggestor.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)mt_suggestor.$kw28$GAF, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL);
                                        SubLObject done_var_$4 = (SubLObject)mt_suggestor.NIL;
                                        final SubLObject token_var_$5 = (SubLObject)mt_suggestor.NIL;
                                        while (mt_suggestor.NIL == done_var_$4) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(gaf));
                                            if (mt_suggestor.NIL != valid_$6) {
                                                mts = (SubLObject)ConsesLow.cons(hlmt.assertion_monad_mt(gaf), mts);
                                            }
                                            done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid_$6);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mt_suggestor.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (mt_suggestor.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    if (mt_suggestor.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(v_term, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(v_term, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL);
                        SubLObject done_var2 = (SubLObject)mt_suggestor.NIL;
                        final SubLObject token_var2 = (SubLObject)mt_suggestor.NIL;
                        while (mt_suggestor.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (mt_suggestor.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)mt_suggestor.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)mt_suggestor.$kw29$RULE, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL);
                                    SubLObject done_var_$5 = (SubLObject)mt_suggestor.NIL;
                                    final SubLObject token_var_$6 = (SubLObject)mt_suggestor.NIL;
                                    while (mt_suggestor.NIL == done_var_$5) {
                                        final SubLObject asst = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(asst));
                                        if (mt_suggestor.NIL != valid_$7) {
                                            mts = (SubLObject)ConsesLow.cons(hlmt.assertion_monad_mt(asst), mts);
                                        }
                                        done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid_$7);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mt_suggestor.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (mt_suggestor.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid2);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                if (mt_suggestor.NIL == fort_types_interface.functionP(v_term)) {
                    return frequency_list_of_mts(v_term, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.UNPROVIDED);
                }
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)mt_suggestor.$sym26$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(mt_suggestor.$const27$EverythingPSC, thread);
                    if (mt_suggestor.NIL != kb_mapping_macros.do_function_rule_index_key_validator(v_term, (SubLObject)mt_suggestor.NIL)) {
                        final SubLObject iterator_var3 = kb_mapping_macros.new_function_rule_final_index_spec_iterator(v_term, (SubLObject)mt_suggestor.NIL);
                        SubLObject done_var3 = (SubLObject)mt_suggestor.NIL;
                        final SubLObject token_var3 = (SubLObject)mt_suggestor.NIL;
                        while (mt_suggestor.NIL == done_var3) {
                            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                            final SubLObject valid3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var3.eql(final_index_spec3));
                            if (mt_suggestor.NIL != valid3) {
                                SubLObject final_index_iterator3 = (SubLObject)mt_suggestor.NIL;
                                try {
                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, (SubLObject)mt_suggestor.$kw29$RULE, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL);
                                    SubLObject done_var_$6 = (SubLObject)mt_suggestor.NIL;
                                    final SubLObject token_var_$7 = (SubLObject)mt_suggestor.NIL;
                                    while (mt_suggestor.NIL == done_var_$6) {
                                        final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$7);
                                        final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(asst2));
                                        if (mt_suggestor.NIL != valid_$8) {
                                            mts = (SubLObject)ConsesLow.cons(hlmt.assertion_monad_mt(asst2), mts);
                                        }
                                        done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid_$8);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mt_suggestor.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (mt_suggestor.NIL != final_index_iterator3) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            done_var3 = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid3);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            if (Sequences.length(mts).numL((SubLObject)mt_suggestor.FOUR_INTEGER)) {
                return frequency_list_of_mts(v_term, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.UNPROVIDED);
            }
        }
        else if (mt_suggestor.NIL != list_utilities.sublisp_boolean(rule_assertion)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)mt_suggestor.$sym26$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(mt_suggestor.$const27$EverythingPSC, thread);
                if (mt_suggestor.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)mt_suggestor.NIL)) {
                    final SubLObject iterator_var3 = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)mt_suggestor.NIL);
                    SubLObject done_var3 = (SubLObject)mt_suggestor.NIL;
                    final SubLObject token_var3 = (SubLObject)mt_suggestor.NIL;
                    while (mt_suggestor.NIL == done_var3) {
                        final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                        final SubLObject valid3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var3.eql(final_index_spec3));
                        if (mt_suggestor.NIL != valid3) {
                            SubLObject final_index_iterator3 = (SubLObject)mt_suggestor.NIL;
                            try {
                                final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL);
                                SubLObject done_var_$7 = (SubLObject)mt_suggestor.NIL;
                                final SubLObject token_var_$8 = (SubLObject)mt_suggestor.NIL;
                                while (mt_suggestor.NIL == done_var_$7) {
                                    final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$8);
                                    final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(asst2));
                                    if (mt_suggestor.NIL != valid_$9 && mt_suggestor.NIL != kb_mapping_macros.do_term_index_assertion_match_p(asst2, final_index_spec3) && mt_suggestor.NIL != assertions_high.rule_assertionP(asst2)) {
                                        mts = (SubLObject)ConsesLow.cons(hlmt.assertion_monad_mt(asst2), mts);
                                    }
                                    done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid_$9);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mt_suggestor.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (mt_suggestor.NIL != final_index_iterator3) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        }
                        done_var3 = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid3);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)mt_suggestor.$sym26$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(mt_suggestor.$const27$EverythingPSC, thread);
                if (mt_suggestor.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)mt_suggestor.NIL)) {
                    final SubLObject iterator_var3 = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)mt_suggestor.NIL);
                    SubLObject done_var3 = (SubLObject)mt_suggestor.NIL;
                    final SubLObject token_var3 = (SubLObject)mt_suggestor.NIL;
                    while (mt_suggestor.NIL == done_var3) {
                        final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                        final SubLObject valid3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var3.eql(final_index_spec3));
                        if (mt_suggestor.NIL != valid3) {
                            SubLObject final_index_iterator3 = (SubLObject)mt_suggestor.NIL;
                            try {
                                final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL);
                                SubLObject done_var_$8 = (SubLObject)mt_suggestor.NIL;
                                final SubLObject token_var_$9 = (SubLObject)mt_suggestor.NIL;
                                while (mt_suggestor.NIL == done_var_$8) {
                                    final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$9);
                                    final SubLObject valid_$10 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$9.eql(asst2));
                                    if (mt_suggestor.NIL != valid_$10 && mt_suggestor.NIL != kb_mapping_macros.do_term_index_assertion_match_p(asst2, final_index_spec3)) {
                                        mts = (SubLObject)ConsesLow.cons(hlmt.assertion_monad_mt(asst2), mts);
                                    }
                                    done_var_$8 = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid_$10);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mt_suggestor.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (mt_suggestor.NIL != final_index_iterator3) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
                        }
                        done_var3 = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid3);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (mt_suggestor.NIL != list_utilities.sublisp_boolean(mts)) {
            return number_utilities.get_sorted_frequency_list(mts);
        }
        return (SubLObject)mt_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 11075L)
    public static SubLObject frequency_list_of_mts(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == mt_suggestor.UNPROVIDED) {
            function_or_predicate = (SubLObject)mt_suggestor.NIL;
        }
        if (rule_assertion == mt_suggestor.UNPROVIDED) {
            rule_assertion = (SubLObject)mt_suggestor.NIL;
        }
        SubLObject caching_state = mt_suggestor.$frequency_list_of_mts_caching_state$.getGlobalValue();
        if (mt_suggestor.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)mt_suggestor.$sym25$FREQUENCY_LIST_OF_MTS, (SubLObject)mt_suggestor.$sym30$_FREQUENCY_LIST_OF_MTS_CACHING_STATE_, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.EQUAL, (SubLObject)mt_suggestor.THREE_INTEGER, (SubLObject)mt_suggestor.FOUR_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, function_or_predicate, rule_assertion);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)mt_suggestor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)mt_suggestor.NIL;
            collision = cdolist_list_var.first();
            while (mt_suggestor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (function_or_predicate.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt_suggestor.NIL != cached_args && mt_suggestor.NIL == cached_args.rest() && rule_assertion.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(frequency_list_of_mts_internal(v_term, function_or_predicate, rule_assertion)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, function_or_predicate, rule_assertion));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 12674L)
    public static SubLObject mts_get_formula_frequency_data(final SubLObject formula) {
        final SubLObject v_forts = cycl_utilities.formula_forts(formula, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
        final SubLObject filtered = Sequences.remove_if((SubLObject)mt_suggestor.$sym31$MTS_TOO_GENERAL_, v_forts, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
        SubLObject frequency_data = (SubLObject)mt_suggestor.NIL;
        SubLObject cdolist_list_var = filtered;
        SubLObject v_term = (SubLObject)mt_suggestor.NIL;
        v_term = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            frequency_data = (SubLObject)ConsesLow.cons(reader.bq_cons(v_term, Sequences.subseq(Sequences.remove_if((SubLObject)mt_suggestor.$sym1$MTS_NOT_COMMONSENSE_MT_, frequency_list_of_mts_adjusted(v_term, used_as_function_or_predicateP(mt_suggestor.$const32$Dog, formula), (SubLObject)mt_suggestor.UNPROVIDED), (SubLObject)mt_suggestor.$sym2$CAR, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED), (SubLObject)mt_suggestor.ZERO_INTEGER, (SubLObject)mt_suggestor.FIVE_INTEGER)), frequency_data);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return frequency_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 13577L)
    public static SubLObject mts_get_summed_data(final SubLObject formula) {
        final SubLObject v_forts = cycl_utilities.formula_forts(formula, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
        SubLObject filtered = Sequences.remove_if((SubLObject)mt_suggestor.$sym31$MTS_TOO_GENERAL_, v_forts, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
        SubLObject mts_for_term = (SubLObject)mt_suggestor.NIL;
        SubLObject mts_for_term_adjusted = (SubLObject)mt_suggestor.NIL;
        SubLObject all_mt_frequencies = (SubLObject)mt_suggestor.NIL;
        SubLObject freqlist = (SubLObject)mt_suggestor.NIL;
        SubLObject summed_data = (SubLObject)mt_suggestor.NIL;
        if (Sequences.length(filtered).numLE((SubLObject)mt_suggestor.TWO_INTEGER)) {
            filtered = Sequences.remove_if((SubLObject)mt_suggestor.$sym33$MTS_TOO_GENERAL_LIGHT_FILTERING_, v_forts, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
        }
        SubLObject cdolist_list_var = filtered;
        SubLObject v_term = (SubLObject)mt_suggestor.NIL;
        v_term = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            freqlist = list_utilities.first_n((SubLObject)mt_suggestor.FIVE_INTEGER, Sequences.remove_if((SubLObject)mt_suggestor.$sym1$MTS_NOT_COMMONSENSE_MT_, frequency_list_of_mts_adjusted(v_term, used_as_function_or_predicateP(v_term, formula), el_utilities.el_implication_p(formula)), (SubLObject)mt_suggestor.$sym2$CAR, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED));
            mts_for_term = Mapping.mapcar((SubLObject)mt_suggestor.$sym2$CAR, freqlist);
            mts_for_term_adjusted = Mapping.mapcar((SubLObject)mt_suggestor.$sym34$CONS, mts_for_term, new SubLObject[] { ConsesLow.make_list(Sequences.length(mts_for_term), mts_specificity_estimate(v_term)) });
            all_mt_frequencies = ConsesLow.append(all_mt_frequencies, freqlist);
            summed_data = ConsesLow.append(summed_data, mts_for_term_adjusted);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        final SubLObject small_number_hash = Hashtables.make_hash_table((SubLObject)mt_suggestor.TEN_INTEGER, (SubLObject)mt_suggestor.EQUAL, (SubLObject)mt_suggestor.UNPROVIDED);
        final SubLObject big_number_hash = Hashtables.make_hash_table((SubLObject)mt_suggestor.TEN_INTEGER, (SubLObject)mt_suggestor.EQUAL, (SubLObject)mt_suggestor.UNPROVIDED);
        SubLObject cdolist_list_var2 = summed_data;
        SubLObject dotted_pair = (SubLObject)mt_suggestor.NIL;
        dotted_pair = cdolist_list_var2.first();
        while (mt_suggestor.NIL != cdolist_list_var2) {
            hash_table_utilities.cinc_hash(dotted_pair.first(), small_number_hash, dotted_pair.rest(), (SubLObject)mt_suggestor.UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            dotted_pair = cdolist_list_var2.first();
        }
        cdolist_list_var2 = all_mt_frequencies;
        dotted_pair = (SubLObject)mt_suggestor.NIL;
        dotted_pair = cdolist_list_var2.first();
        while (mt_suggestor.NIL != cdolist_list_var2) {
            hash_table_utilities.cinc_hash(dotted_pair.first(), big_number_hash, dotted_pair.rest(), (SubLObject)mt_suggestor.UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            dotted_pair = cdolist_list_var2.first();
        }
        final SubLObject combined_data = get_combined_list_for_mts_summed_data(hash_table_utilities.hash_table_to_alist(small_number_hash), hash_table_utilities.hash_table_to_alist(big_number_hash));
        final SubLObject semi_sorted = Sort.sort(combined_data, (SubLObject)mt_suggestor.$sym35$_, (SubLObject)mt_suggestor.$sym36$CADDR);
        final SubLObject sorted = Sort.stable_sort(semi_sorted, (SubLObject)mt_suggestor.$sym35$_, (SubLObject)mt_suggestor.$sym37$CADR);
        return sorted;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 16027L)
    public static SubLObject get_combined_list_for_mts_summed_data(final SubLObject lst1, final SubLObject lst2) {
        SubLObject final_list = (SubLObject)mt_suggestor.NIL;
        SubLObject one_element = (SubLObject)mt_suggestor.NIL;
        SubLObject pair = (SubLObject)mt_suggestor.NIL;
        SubLObject cdolist_list_var = lst1;
        SubLObject elt = (SubLObject)mt_suggestor.NIL;
        elt = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            pair = Sequences.find(elt.first(), lst2, (SubLObject)mt_suggestor.EQUAL, (SubLObject)mt_suggestor.$sym2$CAR, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
            one_element = (SubLObject)ConsesLow.list(elt.first(), elt.rest(), pair.rest());
            final_list = (SubLObject)ConsesLow.cons(one_element, final_list);
            cdolist_list_var = cdolist_list_var.rest();
            elt = cdolist_list_var.first();
        }
        return final_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 16872L)
    public static SubLObject mts_too_generalP(final SubLObject v_term, SubLObject light_filtering) {
        if (light_filtering == mt_suggestor.UNPROVIDED) {
            light_filtering = (SubLObject)mt_suggestor.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL != subl_promotions.memberP(v_term, mt_suggestor.$mtsugg_too_general_term_filter$.getGlobalValue(), (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED) || (mt_suggestor.NIL == light_filtering && (mt_suggestor.NIL != isa.isaP(v_term, mt_suggestor.$const41$MetaRelation, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED) || mt_suggestor.NIL != isa.quoted_isaP(v_term, mt_suggestor.$const42$CoreConstant, mt_suggestor.$const27$EverythingPSC, (SubLObject)mt_suggestor.UNPROVIDED) || mt_suggestor.NIL != isa.isaP(v_term, mt_suggestor.$const43$KEFacilitationPredicate, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18067L)
    public static SubLObject mts_too_general_light_filteringP(final SubLObject v_term) {
        return mts_too_generalP(v_term, (SubLObject)mt_suggestor.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18227L)
    public static SubLObject get_mt_list_for_predicate(final SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == mt_suggestor.UNPROVIDED) {
            max_assertions = (SubLObject)mt_suggestor.$int44$20000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_indexing.num_predicate_extent_index(predicate, (SubLObject)mt_suggestor.UNPROVIDED).numG(max_assertions)) {
            return (SubLObject)mt_suggestor.NIL;
        }
        SubLObject result = (SubLObject)mt_suggestor.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)mt_suggestor.$sym45$RELEVANT_MT_IS_ANY_MT, thread);
            final SubLObject assertions = kb_mapping.gather_predicate_extent_index(predicate, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
            final SubLObject mts = Mapping.mapcar((SubLObject)mt_suggestor.$sym46$ASSERTION_MT, assertions);
            result = (SubLObject)((mt_suggestor.NIL != mts) ? number_utilities.get_sorted_frequency_list(mts) : mt_suggestor.NIL);
        }
        finally {
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18977L)
    public static SubLObject clear_top_mt_percent_count() {
        final SubLObject cs = mt_suggestor.$top_mt_percent_count_caching_state$.getGlobalValue();
        if (mt_suggestor.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)mt_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18977L)
    public static SubLObject remove_top_mt_percent_count(final SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == mt_suggestor.UNPROVIDED) {
            max_assertions = (SubLObject)mt_suggestor.$int44$20000;
        }
        return memoization_state.caching_state_remove_function_results_with_args(mt_suggestor.$top_mt_percent_count_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(predicate, max_assertions), (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18977L)
    public static SubLObject top_mt_percent_count_internal(final SubLObject predicate, final SubLObject max_assertions) {
        final SubLObject freq_list = get_mt_list_for_predicate(predicate, max_assertions);
        final SubLObject total = (SubLObject)((mt_suggestor.NIL != freq_list) ? Functions.apply((SubLObject)mt_suggestor.$sym48$_, Mapping.mapcar((SubLObject)mt_suggestor.$sym49$CDR, freq_list)) : mt_suggestor.NIL);
        return (SubLObject)((mt_suggestor.NIL != freq_list) ? ConsesLow.list(conses_high.caar(freq_list), Numbers.divide(conses_high.cdar(freq_list), total), total) : mt_suggestor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18977L)
    public static SubLObject top_mt_percent_count(final SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == mt_suggestor.UNPROVIDED) {
            max_assertions = (SubLObject)mt_suggestor.$int44$20000;
        }
        SubLObject caching_state = mt_suggestor.$top_mt_percent_count_caching_state$.getGlobalValue();
        if (mt_suggestor.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)mt_suggestor.$sym47$TOP_MT_PERCENT_COUNT, (SubLObject)mt_suggestor.$sym50$_TOP_MT_PERCENT_COUNT_CACHING_STATE_, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.EQUAL, (SubLObject)mt_suggestor.TWO_INTEGER, (SubLObject)mt_suggestor.$int51$25);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, max_assertions);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)mt_suggestor.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)mt_suggestor.NIL;
            collision = cdolist_list_var.first();
            while (mt_suggestor.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt_suggestor.NIL != cached_args && mt_suggestor.NIL == cached_args.rest() && max_assertions.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(top_mt_percent_count_internal(predicate, max_assertions)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, max_assertions));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 19805L)
    public static SubLObject used_as_function_or_predicateP(final SubLObject v_term, final SubLObject formula) {
        final SubLObject positions = list_utilities.tree_positions(v_term, formula, (SubLObject)mt_suggestor.EQUAL, (SubLObject)mt_suggestor.UNPROVIDED);
        final SubLObject atoms = Sequences.remove_if((SubLObject)mt_suggestor.$sym52$LISTP, positions, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
        final SubLObject lists = Sequences.remove_if((SubLObject)mt_suggestor.$sym53$ATOM, positions, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
        final SubLObject last_elements = Mapping.mapcar((SubLObject)mt_suggestor.$sym2$CAR, Mapping.mapcar((SubLObject)mt_suggestor.$sym54$LAST, lists));
        return (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL != subl_promotions.memberP((SubLObject)mt_suggestor.ZERO_INTEGER, atoms, (SubLObject)mt_suggestor.EQUAL, (SubLObject)mt_suggestor.UNPROVIDED) || mt_suggestor.NIL != conses_high.member((SubLObject)mt_suggestor.ZERO_INTEGER, last_elements, (SubLObject)mt_suggestor.EQUAL, (SubLObject)mt_suggestor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 21685L)
    public static SubLObject mts_run_all_tests(SubLObject verbose) {
        if (verbose == mt_suggestor.UNPROVIDED) {
            verbose = (SubLObject)mt_suggestor.NIL;
        }
        final SubLObject all_tests = (SubLObject)mt_suggestor.$list55;
        SubLObject results = (SubLObject)mt_suggestor.NIL;
        SubLObject testname = (SubLObject)mt_suggestor.NIL;
        mts_clear_test_results();
        mts_clear_tests();
        SubLObject cdolist_list_var = all_tests;
        SubLObject test = (SubLObject)mt_suggestor.NIL;
        test = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            testname = Sequences.subseq(Symbols.symbol_name(test), (SubLObject)mt_suggestor.FOUR_INTEGER, (SubLObject)mt_suggestor.UNPROVIDED);
            print_high.princ((SubLObject)mt_suggestor.$str56$Running_test__, (SubLObject)mt_suggestor.UNPROVIDED);
            print_high.princ(testname, (SubLObject)mt_suggestor.UNPROVIDED);
            streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
            results = Functions.funcall(test, verbose);
            streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
            print_high.princ(testname, (SubLObject)mt_suggestor.UNPROVIDED);
            print_high.princ((SubLObject)mt_suggestor.$str57$_RESULTS__, (SubLObject)mt_suggestor.UNPROVIDED);
            print_high.princ(results, (SubLObject)mt_suggestor.UNPROVIDED);
            streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
            streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            test = cdolist_list_var.first();
        }
        return (SubLObject)mt_suggestor.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 22618L)
    public static SubLObject mts_clear_tests() {
        mt_suggestor.$examination_mts$.setGlobalValue((SubLObject)mt_suggestor.NIL);
        mt_suggestor.$examination_formulas$.setGlobalValue((SubLObject)mt_suggestor.NIL);
        return (SubLObject)mt_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 22795L)
    public static SubLObject mts_clear_test_results() {
        mt_suggestor.$mts_incorrect_formulas$.setGlobalValue((SubLObject)mt_suggestor.NIL);
        mt_suggestor.$mts_actual_mts$.setGlobalValue((SubLObject)mt_suggestor.NIL);
        mt_suggestor.$mts_guessed_mts$.setGlobalValue((SubLObject)mt_suggestor.NIL);
        return (SubLObject)mt_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 23012L)
    public static SubLObject mts_print_test_results(SubLObject verbose) {
        if (verbose == mt_suggestor.UNPROVIDED) {
            verbose = (SubLObject)mt_suggestor.T;
        }
        if (mt_suggestor.NIL != verbose) {
            SubLObject cdotimes_end_var;
            SubLObject n;
            for (cdotimes_end_var = Sequences.length(mt_suggestor.$mts_incorrect_formulas$.getGlobalValue()), n = (SubLObject)mt_suggestor.NIL, n = (SubLObject)mt_suggestor.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)mt_suggestor.ONE_INTEGER)) {
                print_high.princ((SubLObject)mt_suggestor.$str58$Incorrect_Formula__, (SubLObject)mt_suggestor.UNPROVIDED);
                streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
                print_high.princ(ConsesLow.nth(n, mt_suggestor.$mts_incorrect_formulas$.getGlobalValue()), (SubLObject)mt_suggestor.UNPROVIDED);
                streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
                print_high.princ((SubLObject)mt_suggestor.$str59$Suggested_Mt__, (SubLObject)mt_suggestor.UNPROVIDED);
                print_high.princ(ConsesLow.nth(n, mt_suggestor.$mts_guessed_mts$.getGlobalValue()), (SubLObject)mt_suggestor.UNPROVIDED);
                streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
                print_high.princ((SubLObject)mt_suggestor.$str60$Actual_Mt__, (SubLObject)mt_suggestor.UNPROVIDED);
                print_high.princ(ConsesLow.nth(n, mt_suggestor.$mts_actual_mts$.getGlobalValue()), (SubLObject)mt_suggestor.UNPROVIDED);
                streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
            }
        }
        print_high.princ((SubLObject)mt_suggestor.$str61$Frequency_list_of_suggested_mts__, (SubLObject)mt_suggestor.UNPROVIDED);
        streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
        print_high.princ(number_utilities.get_sorted_frequency_list(mt_suggestor.$mts_guessed_mts$.getGlobalValue()), (SubLObject)mt_suggestor.UNPROVIDED);
        streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
        print_high.princ((SubLObject)mt_suggestor.$str62$Frequency_list_of_actual_mts__, (SubLObject)mt_suggestor.UNPROVIDED);
        streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
        print_high.princ(number_utilities.get_sorted_frequency_list(mt_suggestor.$mts_actual_mts$.getGlobalValue()), (SubLObject)mt_suggestor.UNPROVIDED);
        streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
        streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
        streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
        return (SubLObject)mt_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 23845L)
    public static SubLObject mts_default_test(SubLObject print) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        return test_mt_suggestor(mt_suggestor.$examination_formulas$.getGlobalValue(), mt_suggestor.$examination_mts$.getGlobalValue(), print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 24059L)
    public static SubLObject run_new_project_assertions_test(SubLObject print, SubLObject assertions) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        mts_clear_tests();
        final SubLObject numassertions = Numbers.divide(assertions, (SubLObject)mt_suggestor.FOUR_INTEGER);
        add_n_assertions_in_mt(mt_suggestor.$const63$SAICLegacyAssertionsMt, numassertions, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const64$PredicatePopulationMt, numassertions, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const65$TestVocabularyMt, numassertions, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const66$MotleyFoolUKGlossaryMt, numassertions, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.T);
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 24868L)
    public static SubLObject run_old_project_assertions_test(SubLObject print, SubLObject assertions) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        mts_clear_tests();
        final SubLObject numrules = Numbers.divide(assertions, (SubLObject)mt_suggestor.SIX_INTEGER);
        add_n_assertions_in_mt(mt_suggestor.$const67$WebSearchEnhancementMt, numrules, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const68$DesertShieldMt, numrules, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const69$OilEconModelMt, numrules, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const70$Y2Scenario_Stage1Mt, numrules, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const71$BeachWalkIMt, numrules, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const72$PQ204Mt, numrules, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.T);
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 25665L)
    public static SubLObject run_definitional_assertions_test(SubLObject print, SubLObject assertions) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        mts_clear_tests();
        SubLObject cdolist_list_var;
        final SubLObject assts = cdolist_list_var = ConsesLow.append(get_about_n_representative_assertions_from_pred(mt_suggestor.$const73$isa, Numbers.divide(assertions, (SubLObject)mt_suggestor.TWO_INTEGER)), get_about_n_representative_assertions_from_pred(mt_suggestor.$const74$genls, Numbers.divide(assertions, (SubLObject)mt_suggestor.TWO_INTEGER)));
        SubLObject assertion = (SubLObject)mt_suggestor.NIL;
        assertion = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            mt_suggestor.$examination_formulas$.setGlobalValue((SubLObject)ConsesLow.cons(assertions_high.assertion_formula(assertion), mt_suggestor.$examination_formulas$.getGlobalValue()));
            mt_suggestor.$examination_mts$.setGlobalValue((SubLObject)ConsesLow.cons(assertions_high.assertion_mt(assertion), mt_suggestor.$examination_mts$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 26440L)
    public static SubLObject run_meta_predicates_test(SubLObject print, SubLObject assertions) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        mts_clear_tests();
        final SubLObject numpredicates = Numbers.ceiling(Numbers.divide(assertions, (SubLObject)mt_suggestor.FIVE_INTEGER), (SubLObject)mt_suggestor.UNPROVIDED);
        final SubLObject predicates = mts_random_subset(isa.all_fort_instances(mt_suggestor.$const75$MetaPredicate, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED), numpredicates);
        SubLObject assts = (SubLObject)mt_suggestor.NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject pred = (SubLObject)mt_suggestor.NIL;
        pred = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            assts = ConsesLow.append(assts, get_about_n_representative_assertions_from_pred(pred, Numbers.ceiling(Numbers.divide(assertions, numpredicates), (SubLObject)mt_suggestor.UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        cdolist_list_var = assts;
        SubLObject assertion = (SubLObject)mt_suggestor.NIL;
        assertion = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            mt_suggestor.$examination_formulas$.setGlobalValue((SubLObject)ConsesLow.cons(assertions_high.assertion_formula(assertion), mt_suggestor.$examination_formulas$.getGlobalValue()));
            mt_suggestor.$examination_mts$.setGlobalValue((SubLObject)ConsesLow.cons(assertions_high.assertion_mt(assertion), mt_suggestor.$examination_mts$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 27301L)
    public static SubLObject run_rule_macro_predicates_test(SubLObject print, SubLObject assertions) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        mts_clear_tests();
        final SubLObject numpredicates = Numbers.ceiling(Numbers.divide(assertions, (SubLObject)mt_suggestor.FIVE_INTEGER), (SubLObject)mt_suggestor.UNPROVIDED);
        final SubLObject predicates = mts_random_subset(isa.all_fort_instances(mt_suggestor.$const76$RuleMacroPredicate, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED), numpredicates);
        SubLObject assts = (SubLObject)mt_suggestor.NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject pred = (SubLObject)mt_suggestor.NIL;
        pred = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            assts = ConsesLow.append(assts, get_about_n_representative_assertions_from_pred(pred, Numbers.ceiling(Numbers.divide(assertions, numpredicates), (SubLObject)mt_suggestor.UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        cdolist_list_var = assts;
        SubLObject assertion = (SubLObject)mt_suggestor.NIL;
        assertion = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            mt_suggestor.$examination_formulas$.setGlobalValue((SubLObject)ConsesLow.cons(assertions_high.assertion_formula(assertion), mt_suggestor.$examination_formulas$.getGlobalValue()));
            mt_suggestor.$examination_mts$.setGlobalValue((SubLObject)ConsesLow.cons(assertions_high.assertion_mt(assertion), mt_suggestor.$examination_mts$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 28167L)
    public static SubLObject run_large_commonsense_mt_rules_test(SubLObject print, SubLObject assertions) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        mts_clear_tests();
        final SubLObject numrules = Numbers.divide(assertions, (SubLObject)mt_suggestor.FOUR_INTEGER);
        add_n_assertions_in_mt(mt_suggestor.$const77$BiologyMt, numrules, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const78$ModernMilitaryTacticsMt, numrules, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const79$HumanSocialLifeMt, numrules, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.T);
        add_n_assertions_in_mt(mt_suggestor.$const80$ChemistryMt, numrules, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.T);
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 28884L)
    public static SubLObject run_large_commonsense_mt_gafs_test(SubLObject print, SubLObject assertions) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        mts_clear_tests();
        final SubLObject numgafs = Numbers.divide(assertions, (SubLObject)mt_suggestor.FOUR_INTEGER);
        add_n_assertions_in_mt(mt_suggestor.$const77$BiologyMt, numgafs, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.NIL);
        add_n_assertions_in_mt(mt_suggestor.$const78$ModernMilitaryTacticsMt, numgafs, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.NIL);
        add_n_assertions_in_mt(mt_suggestor.$const79$HumanSocialLifeMt, numgafs, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.NIL);
        add_n_assertions_in_mt(mt_suggestor.$const80$ChemistryMt, numgafs, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.NIL);
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 29584L)
    public static SubLObject run_base_kb_rules_test(SubLObject print, SubLObject assertions) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        mts_clear_tests();
        add_n_assertions_in_mt(mt_suggestor.$const3$BaseKB, assertions, (SubLObject)mt_suggestor.UNPROVIDED, (SubLObject)mt_suggestor.UNPROVIDED);
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 30022L)
    public static SubLObject run_lexical_rules_test(SubLObject print, SubLObject assertions) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        mts_clear_tests();
        add_n_assertions_in_mt(mt_suggestor.$const81$EnglishLexiconMt, assertions, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.T);
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 30469L)
    public static SubLObject run_lexical_gafs_test(SubLObject print, SubLObject assertions) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        mts_clear_tests();
        final SubLObject numgafs = Numbers.divide(assertions, (SubLObject)mt_suggestor.TWO_INTEGER);
        add_n_assertions_in_mt(mt_suggestor.$const82$EnglishParaphraseMt, numgafs, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.NIL);
        add_n_assertions_in_mt(mt_suggestor.$const81$EnglishLexiconMt, numgafs, (SubLObject)mt_suggestor.T, (SubLObject)mt_suggestor.NIL);
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 31010L)
    public static SubLObject run_high_level_assertions_test(SubLObject print, SubLObject assertions, SubLObject gafsP, SubLObject rulesP) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.NIL;
        }
        if (assertions == mt_suggestor.UNPROVIDED) {
            assertions = (SubLObject)mt_suggestor.$int21$100;
        }
        if (gafsP == mt_suggestor.UNPROVIDED) {
            gafsP = (SubLObject)mt_suggestor.T;
        }
        if (rulesP == mt_suggestor.UNPROVIDED) {
            rulesP = (SubLObject)mt_suggestor.T;
        }
        mts_clear_tests();
        final SubLObject numassertions = Numbers.divide(assertions, (SubLObject)mt_suggestor.FOUR_INTEGER);
        add_n_assertions_in_mt(mt_suggestor.$const83$LogicalTruthMt, numassertions, gafsP, rulesP);
        add_n_assertions_in_mt(mt_suggestor.$const84$LogicalTruthImplementationMt, numassertions, gafsP, rulesP);
        add_n_assertions_in_mt(mt_suggestor.$const85$CoreCycLMt, numassertions, gafsP, rulesP);
        add_n_assertions_in_mt(mt_suggestor.$const85$CoreCycLMt, numassertions, gafsP, rulesP);
        return mts_default_test(print);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 31886L)
    public static SubLObject test_mt_suggestor(final SubLObject assertionlist, final SubLObject mtlist, SubLObject print) {
        if (print == mt_suggestor.UNPROVIDED) {
            print = (SubLObject)mt_suggestor.T;
        }
        SubLObject i = (SubLObject)mt_suggestor.ZERO_INTEGER;
        SubLObject right = (SubLObject)mt_suggestor.ZERO_INTEGER;
        SubLObject suggestion = (SubLObject)mt_suggestor.NIL;
        SubLObject cdolist_list_var = assertionlist;
        SubLObject asst = (SubLObject)mt_suggestor.NIL;
        asst = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            if (mt_suggestor.NIL != print) {
                print_high.princ((SubLObject)mt_suggestor.$str86$Trying_Formula__, (SubLObject)mt_suggestor.UNPROVIDED);
                print_high.princ(i, (SubLObject)mt_suggestor.UNPROVIDED);
                streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
            }
            suggestion = suggest_mt(asst);
            if (mt_suggestor.NIL != print) {
                print_high.princ((SubLObject)mt_suggestor.$str59$Suggested_Mt__, (SubLObject)mt_suggestor.UNPROVIDED);
                print_high.princ(suggestion, (SubLObject)mt_suggestor.UNPROVIDED);
                streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
                print_high.princ((SubLObject)mt_suggestor.$str60$Actual_Mt__, (SubLObject)mt_suggestor.UNPROVIDED);
                print_high.princ(ConsesLow.nth(i, mtlist), (SubLObject)mt_suggestor.UNPROVIDED);
                streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
                streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
            }
            if (suggestion.equal(ConsesLow.nth(i, mtlist))) {
                right = Numbers.add(right, (SubLObject)mt_suggestor.ONE_INTEGER);
            }
            else {
                mt_suggestor.$mts_incorrect_formulas$.setGlobalValue((SubLObject)ConsesLow.cons(asst, mt_suggestor.$mts_incorrect_formulas$.getGlobalValue()));
                mt_suggestor.$mts_guessed_mts$.setGlobalValue((SubLObject)ConsesLow.cons(suggestion, mt_suggestor.$mts_guessed_mts$.getGlobalValue()));
                mt_suggestor.$mts_actual_mts$.setGlobalValue((SubLObject)ConsesLow.cons(ConsesLow.nth(i, mtlist), mt_suggestor.$mts_actual_mts$.getGlobalValue()));
            }
            i = Numbers.add(i, (SubLObject)mt_suggestor.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asst = cdolist_list_var.first();
        }
        if (mt_suggestor.NIL != print) {
            print_high.princ((SubLObject)mt_suggestor.$str87$Got_, (SubLObject)mt_suggestor.UNPROVIDED);
            print_high.princ(right, (SubLObject)mt_suggestor.UNPROVIDED);
            print_high.princ((SubLObject)mt_suggestor.$str88$_out_of_, (SubLObject)mt_suggestor.UNPROVIDED);
            print_high.princ(i, (SubLObject)mt_suggestor.UNPROVIDED);
            streams_high.terpri((SubLObject)mt_suggestor.UNPROVIDED);
        }
        return Numbers.divide(right, i);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 32910L)
    public static SubLObject add_n_assertions_in_mt(final SubLObject mt, SubLObject n, SubLObject include_gafs, SubLObject include_rules) {
        if (n == mt_suggestor.UNPROVIDED) {
            n = (SubLObject)mt_suggestor.$int21$100;
        }
        if (include_gafs == mt_suggestor.UNPROVIDED) {
            include_gafs = (SubLObject)mt_suggestor.NIL;
        }
        if (include_rules == mt_suggestor.UNPROVIDED) {
            include_rules = (SubLObject)mt_suggestor.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stopP = (SubLObject)mt_suggestor.NIL;
        SubLObject numsofar = (SubLObject)mt_suggestor.ZERO_INTEGER;
        SubLObject formula = (SubLObject)mt_suggestor.NIL;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql((SubLObject)mt_suggestor.$kw89$MT)) {
            if (mt_suggestor.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)mt_suggestor.NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = (SubLObject)mt_suggestor.NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL);
                    SubLObject done_var = stopP;
                    final SubLObject token_var = (SubLObject)mt_suggestor.NIL;
                    while (mt_suggestor.NIL == done_var) {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
                        if (mt_suggestor.NIL != valid) {
                            formula = assertions_high.assertion_formula(assertion);
                            if ((mt_suggestor.NIL != include_rules && mt_suggestor.NIL != el_utilities.el_implication_p(formula)) || (mt_suggestor.NIL != include_gafs && mt_suggestor.NIL == el_utilities.el_implication_p(formula) && (Sequences.length(formula).numL((SubLObject)mt_suggestor.TWO_INTEGER) || mt_suggestor.NIL == fort_types_interface.skolem_functionP(conses_high.second(formula), (SubLObject)mt_suggestor.UNPROVIDED)))) {
                                mt_suggestor.$examination_formulas$.setGlobalValue((SubLObject)ConsesLow.cons(formula, mt_suggestor.$examination_formulas$.getGlobalValue()));
                                mt_suggestor.$examination_mts$.setGlobalValue((SubLObject)ConsesLow.cons(assertions_high.assertion_mt(assertion), mt_suggestor.$examination_mts$.getGlobalValue()));
                                numsofar = Numbers.add(numsofar, (SubLObject)mt_suggestor.ONE_INTEGER);
                            }
                            if (numsofar.numGE(n)) {
                                stopP = (SubLObject)mt_suggestor.T;
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid || mt_suggestor.NIL != stopP);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mt_suggestor.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (mt_suggestor.NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)mt_suggestor.$kw90$BROAD_MT) && mt_suggestor.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, (SubLObject)mt_suggestor.NIL)) {
            SubLObject catch_var = (SubLObject)mt_suggestor.NIL;
            try {
                thread.throwStack.push(mt_suggestor.$kw91$MAPPING_DONE);
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = (SubLObject)mt_suggestor.$str92$do_broad_mt_index;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)mt_suggestor.ZERO_INTEGER;
                assert mt_suggestor.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)mt_suggestor.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)mt_suggestor.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)mt_suggestor.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$24 = idx;
                        if (mt_suggestor.NIL == id_index.id_index_objects_empty_p(idx_$24, (SubLObject)mt_suggestor.$kw94$SKIP)) {
                            final SubLObject idx_$25 = idx_$24;
                            if (mt_suggestor.NIL == id_index.id_index_dense_objects_empty_p(idx_$25, (SubLObject)mt_suggestor.$kw94$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$25);
                                final SubLObject backwardP_var = (SubLObject)mt_suggestor.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject assertion2;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)mt_suggestor.NIL, v_iteration = (SubLObject)mt_suggestor.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)mt_suggestor.ONE_INTEGER)) {
                                    a_id = ((mt_suggestor.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)mt_suggestor.ONE_INTEGER) : v_iteration);
                                    a_handle = Vectors.aref(vector_var, a_id);
                                    if (mt_suggestor.NIL == id_index.id_index_tombstone_p(a_handle) || mt_suggestor.NIL == id_index.id_index_skip_tombstones_p((SubLObject)mt_suggestor.$kw94$SKIP)) {
                                        if (mt_suggestor.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                            a_handle = (SubLObject)mt_suggestor.$kw94$SKIP;
                                        }
                                        assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (mt_suggestor.NIL != stopP) {
                                            utilities_macros.mapping_finished();
                                        }
                                        if (mt_suggestor.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL)) {
                                            formula = assertions_high.assertion_formula(assertion2);
                                            if ((mt_suggestor.NIL != include_rules && mt_suggestor.NIL != el_utilities.el_implication_p(formula)) || (mt_suggestor.NIL != include_gafs && mt_suggestor.NIL == el_utilities.el_implication_p(formula) && (Sequences.length(formula).numL((SubLObject)mt_suggestor.TWO_INTEGER) || mt_suggestor.NIL == fort_types_interface.skolem_functionP(conses_high.second(formula), (SubLObject)mt_suggestor.UNPROVIDED)))) {
                                                mt_suggestor.$examination_formulas$.setGlobalValue((SubLObject)ConsesLow.cons(formula, mt_suggestor.$examination_formulas$.getGlobalValue()));
                                                mt_suggestor.$examination_mts$.setGlobalValue((SubLObject)ConsesLow.cons(assertions_high.assertion_mt(assertion2), mt_suggestor.$examination_mts$.getGlobalValue()));
                                                numsofar = Numbers.add(numsofar, (SubLObject)mt_suggestor.ONE_INTEGER);
                                            }
                                            if (numsofar.numGE(n)) {
                                                stopP = (SubLObject)mt_suggestor.T;
                                            }
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)mt_suggestor.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$26 = idx_$24;
                            if (mt_suggestor.NIL == id_index.id_index_sparse_objects_empty_p(idx_$26) || mt_suggestor.NIL == id_index.id_index_skip_tombstones_p((SubLObject)mt_suggestor.$kw94$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$26);
                                SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$26);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$26);
                                final SubLObject v_default = (SubLObject)((mt_suggestor.NIL != id_index.id_index_skip_tombstones_p((SubLObject)mt_suggestor.$kw94$SKIP)) ? mt_suggestor.NIL : mt_suggestor.$kw94$SKIP);
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                    if (mt_suggestor.NIL == id_index.id_index_skip_tombstones_p((SubLObject)mt_suggestor.$kw94$SKIP) || mt_suggestor.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                        final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (mt_suggestor.NIL != stopP) {
                                            utilities_macros.mapping_finished();
                                        }
                                        if (mt_suggestor.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL)) {
                                            formula = assertions_high.assertion_formula(assertion3);
                                            if ((mt_suggestor.NIL != include_rules && mt_suggestor.NIL != el_utilities.el_implication_p(formula)) || (mt_suggestor.NIL != include_gafs && mt_suggestor.NIL == el_utilities.el_implication_p(formula) && (Sequences.length(formula).numL((SubLObject)mt_suggestor.TWO_INTEGER) || mt_suggestor.NIL == fort_types_interface.skolem_functionP(conses_high.second(formula), (SubLObject)mt_suggestor.UNPROVIDED)))) {
                                                mt_suggestor.$examination_formulas$.setGlobalValue((SubLObject)ConsesLow.cons(formula, mt_suggestor.$examination_formulas$.getGlobalValue()));
                                                mt_suggestor.$examination_mts$.setGlobalValue((SubLObject)ConsesLow.cons(assertions_high.assertion_mt(assertion3), mt_suggestor.$examination_mts$.getGlobalValue()));
                                                numsofar = Numbers.add(numsofar, (SubLObject)mt_suggestor.ONE_INTEGER);
                                            }
                                            if (numsofar.numGE(n)) {
                                                stopP = (SubLObject)mt_suggestor.T;
                                            }
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)mt_suggestor.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                    a_id2 = Numbers.add(a_id2, (SubLObject)mt_suggestor.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mt_suggestor.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)mt_suggestor.$kw91$MAPPING_DONE);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return (SubLObject)mt_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 33792L)
    public static SubLObject get_about_n_representative_assertions_from_pred(final SubLObject pred, final SubLObject n) {
        final SubLObject extent = kb_indexing.num_predicate_extent_index(pred, (SubLObject)mt_suggestor.UNPROVIDED);
        final SubLObject prob = (SubLObject)(extent.numE((SubLObject)mt_suggestor.ZERO_INTEGER) ? mt_suggestor.ONE_INTEGER : Numbers.min((SubLObject)mt_suggestor.ONE_INTEGER, Numbers.divide(n, extent)));
        return get_n_assertions_from_pred_with_prob(pred, n, prob);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 34394L)
    public static SubLObject get_about_n_representative_assertions_from_mt(final SubLObject mt, final SubLObject n) {
        final SubLObject extent = (SubLObject)((mt_suggestor.NIL != kb_indexing.broad_mtP(mt)) ? mt_suggestor.$int95$100000 : kb_indexing.num_mt_index(mt));
        final SubLObject prob = (SubLObject)(extent.numE((SubLObject)mt_suggestor.ZERO_INTEGER) ? mt_suggestor.ONE_INTEGER : Numbers.min((SubLObject)mt_suggestor.ONE_INTEGER, Numbers.divide(n, extent)));
        return get_n_assertions_from_mt_with_prob(mt, n, prob);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 35100L)
    public static SubLObject get_n_assertions_from_pred_with_prob(final SubLObject pred, final SubLObject n, final SubLObject prob) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = (SubLObject)mt_suggestor.NIL;
        SubLObject assertion_count = (SubLObject)mt_suggestor.ZERO_INTEGER;
        SubLObject assertions = (SubLObject)mt_suggestor.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)mt_suggestor.$sym45$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(mt_suggestor.$const96$InferencePSC, thread);
            if (mt_suggestor.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                final SubLObject str = (SubLObject)mt_suggestor.NIL;
                final SubLObject _prev_bind_0_$28 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$29 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)mt_suggestor.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)mt_suggestor.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)mt_suggestor.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)mt_suggestor.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((mt_suggestor.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : mt_suggestor.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = doneP;
                    final SubLObject token_var = (SubLObject)mt_suggestor.NIL;
                    while (mt_suggestor.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (mt_suggestor.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)mt_suggestor.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)mt_suggestor.$kw28$GAF, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL);
                                SubLObject done_var_$30 = doneP;
                                final SubLObject token_var_$31 = (SubLObject)mt_suggestor.NIL;
                                while (mt_suggestor.NIL == done_var_$30) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                                    final SubLObject valid_$32 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$31.eql(assertion));
                                    if (mt_suggestor.NIL != valid_$32 && mt_suggestor.NIL != number_utilities.true_with_probability(prob)) {
                                        assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                                        assertion_count = Numbers.add(assertion_count, (SubLObject)mt_suggestor.ONE_INTEGER);
                                        doneP = Numbers.numGE(assertion_count, n);
                                    }
                                    done_var_$30 = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid_$32 || mt_suggestor.NIL != doneP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mt_suggestor.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (mt_suggestor.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid || mt_suggestor.NIL != doneP);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$29, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$28, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 35752L)
    public static SubLObject get_n_assertions_from_mt_with_prob(final SubLObject mt, final SubLObject n, final SubLObject prob) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = (SubLObject)mt_suggestor.NIL;
        SubLObject assertion_count = (SubLObject)mt_suggestor.ZERO_INTEGER;
        SubLObject assertions = (SubLObject)mt_suggestor.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)mt_suggestor.$sym45$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(mt_suggestor.$const96$InferencePSC, thread);
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
            if (pcase_var.eql((SubLObject)mt_suggestor.$kw89$MT)) {
                if (mt_suggestor.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)mt_suggestor.NIL)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = (SubLObject)mt_suggestor.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = (SubLObject)mt_suggestor.NIL;
                        while (mt_suggestor.NIL == done_var) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
                            if (mt_suggestor.NIL != valid && mt_suggestor.NIL != number_utilities.true_with_probability(prob)) {
                                assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                                assertion_count = Numbers.add(assertion_count, (SubLObject)mt_suggestor.ONE_INTEGER);
                                doneP = Numbers.numGE(assertion_count, n);
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(mt_suggestor.NIL == valid || mt_suggestor.NIL != doneP);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mt_suggestor.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (mt_suggestor.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)mt_suggestor.$kw90$BROAD_MT) && mt_suggestor.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, (SubLObject)mt_suggestor.NIL)) {
                SubLObject catch_var = (SubLObject)mt_suggestor.NIL;
                try {
                    thread.throwStack.push(mt_suggestor.$kw91$MAPPING_DONE);
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = (SubLObject)mt_suggestor.$str92$do_broad_mt_index;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)mt_suggestor.ZERO_INTEGER;
                    assert mt_suggestor.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$35 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$36 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)mt_suggestor.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)mt_suggestor.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)mt_suggestor.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$37 = idx;
                            if (mt_suggestor.NIL == id_index.id_index_objects_empty_p(idx_$37, (SubLObject)mt_suggestor.$kw94$SKIP)) {
                                final SubLObject idx_$38 = idx_$37;
                                if (mt_suggestor.NIL == id_index.id_index_dense_objects_empty_p(idx_$38, (SubLObject)mt_suggestor.$kw94$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$38);
                                    final SubLObject backwardP_var = (SubLObject)mt_suggestor.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject assertion2;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)mt_suggestor.NIL, v_iteration = (SubLObject)mt_suggestor.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)mt_suggestor.ONE_INTEGER)) {
                                        a_id = ((mt_suggestor.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)mt_suggestor.ONE_INTEGER) : v_iteration);
                                        a_handle = Vectors.aref(vector_var, a_id);
                                        if (mt_suggestor.NIL == id_index.id_index_tombstone_p(a_handle) || mt_suggestor.NIL == id_index.id_index_skip_tombstones_p((SubLObject)mt_suggestor.$kw94$SKIP)) {
                                            if (mt_suggestor.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                                a_handle = (SubLObject)mt_suggestor.$kw94$SKIP;
                                            }
                                            assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (mt_suggestor.NIL != doneP) {
                                                utilities_macros.mapping_finished();
                                            }
                                            if (mt_suggestor.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL) && mt_suggestor.NIL != number_utilities.true_with_probability(prob)) {
                                                assertions = (SubLObject)ConsesLow.cons(assertion2, assertions);
                                                assertion_count = Numbers.add(assertion_count, (SubLObject)mt_suggestor.ONE_INTEGER);
                                                doneP = Numbers.numGE(assertion_count, n);
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)mt_suggestor.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$39 = idx_$37;
                                if (mt_suggestor.NIL == id_index.id_index_sparse_objects_empty_p(idx_$39) || mt_suggestor.NIL == id_index.id_index_skip_tombstones_p((SubLObject)mt_suggestor.$kw94$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$39);
                                    SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$39);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$39);
                                    final SubLObject v_default = (SubLObject)((mt_suggestor.NIL != id_index.id_index_skip_tombstones_p((SubLObject)mt_suggestor.$kw94$SKIP)) ? mt_suggestor.NIL : mt_suggestor.$kw94$SKIP);
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                        if (mt_suggestor.NIL == id_index.id_index_skip_tombstones_p((SubLObject)mt_suggestor.$kw94$SKIP) || mt_suggestor.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                            final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (mt_suggestor.NIL != doneP) {
                                                utilities_macros.mapping_finished();
                                            }
                                            if (mt_suggestor.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, (SubLObject)mt_suggestor.NIL, (SubLObject)mt_suggestor.NIL) && mt_suggestor.NIL != number_utilities.true_with_probability(prob)) {
                                                assertions = (SubLObject)ConsesLow.cons(assertion3, assertions);
                                                assertion_count = Numbers.add(assertion_count, (SubLObject)mt_suggestor.ONE_INTEGER);
                                                doneP = Numbers.numGE(assertion_count, n);
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)mt_suggestor.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        a_id2 = Numbers.add(a_id2, (SubLObject)mt_suggestor.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mt_suggestor.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$36, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$35, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)mt_suggestor.$kw91$MAPPING_DONE);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 36360L)
    public static SubLObject get_summed_frequencies_from_frequency_list(final SubLObject freq_list) {
        return Functions.apply((SubLObject)mt_suggestor.$sym48$_, Mapping.mapcar((SubLObject)mt_suggestor.$sym49$CDR, freq_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 36476L)
    public static SubLObject mts_random_subset(final SubLObject lst, final SubLObject size) {
        final SubLObject integers = number_utilities.n_random_integers(size, Sequences.length(lst), (SubLObject)mt_suggestor.UNPROVIDED);
        SubLObject subset = (SubLObject)mt_suggestor.NIL;
        SubLObject cdolist_list_var = integers;
        SubLObject integer = (SubLObject)mt_suggestor.NIL;
        integer = cdolist_list_var.first();
        while (mt_suggestor.NIL != cdolist_list_var) {
            subset = (SubLObject)ConsesLow.cons(ConsesLow.nth(integer, lst), subset);
            cdolist_list_var = cdolist_list_var.rest();
            integer = cdolist_list_var.first();
        }
        return subset;
    }
    
    public static SubLObject declare_mt_suggestor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "suggest_mt", "SUGGEST-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "suggest_mt_by_content", "SUGGEST-MT-BY-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "suggest_mt_for_gaf", "SUGGEST-MT-FOR-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_not_commonsense_mtP", "MTS-NOT-COMMONSENSE-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "likely_project_related_assertionP", "LIKELY-PROJECT-RELATED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mtsugg_get_related_assertions", "MTSUGG-GET-RELATED-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mt_list_from_related", "MT-LIST-FROM-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_specificity_estimate", "MTS-SPECIFICITY-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "frequency_list_of_mts_adjusted", "FREQUENCY-LIST-OF-MTS-ADJUSTED", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "clear_frequency_list_of_mts", "CLEAR-FREQUENCY-LIST-OF-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "remove_frequency_list_of_mts", "REMOVE-FREQUENCY-LIST-OF-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "frequency_list_of_mts_internal", "FREQUENCY-LIST-OF-MTS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "frequency_list_of_mts", "FREQUENCY-LIST-OF-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_get_formula_frequency_data", "MTS-GET-FORMULA-FREQUENCY-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_get_summed_data", "MTS-GET-SUMMED-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "get_combined_list_for_mts_summed_data", "GET-COMBINED-LIST-FOR-MTS-SUMMED-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_too_generalP", "MTS-TOO-GENERAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_too_general_light_filteringP", "MTS-TOO-GENERAL-LIGHT-FILTERING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "get_mt_list_for_predicate", "GET-MT-LIST-FOR-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "clear_top_mt_percent_count", "CLEAR-TOP-MT-PERCENT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "remove_top_mt_percent_count", "REMOVE-TOP-MT-PERCENT-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "top_mt_percent_count_internal", "TOP-MT-PERCENT-COUNT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "top_mt_percent_count", "TOP-MT-PERCENT-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "used_as_function_or_predicateP", "USED-AS-FUNCTION-OR-PREDICATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_run_all_tests", "MTS-RUN-ALL-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_clear_tests", "MTS-CLEAR-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_clear_test_results", "MTS-CLEAR-TEST-RESULTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_print_test_results", "MTS-PRINT-TEST-RESULTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_default_test", "MTS-DEFAULT-TEST", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_new_project_assertions_test", "RUN-NEW-PROJECT-ASSERTIONS-TEST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_old_project_assertions_test", "RUN-OLD-PROJECT-ASSERTIONS-TEST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_definitional_assertions_test", "RUN-DEFINITIONAL-ASSERTIONS-TEST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_meta_predicates_test", "RUN-META-PREDICATES-TEST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_rule_macro_predicates_test", "RUN-RULE-MACRO-PREDICATES-TEST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_large_commonsense_mt_rules_test", "RUN-LARGE-COMMONSENSE-MT-RULES-TEST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_large_commonsense_mt_gafs_test", "RUN-LARGE-COMMONSENSE-MT-GAFS-TEST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_base_kb_rules_test", "RUN-BASE-KB-RULES-TEST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_lexical_rules_test", "RUN-LEXICAL-RULES-TEST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_lexical_gafs_test", "RUN-LEXICAL-GAFS-TEST", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "run_high_level_assertions_test", "RUN-HIGH-LEVEL-ASSERTIONS-TEST", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "test_mt_suggestor", "TEST-MT-SUGGESTOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "add_n_assertions_in_mt", "ADD-N-ASSERTIONS-IN-MT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "get_about_n_representative_assertions_from_pred", "GET-ABOUT-N-REPRESENTATIVE-ASSERTIONS-FROM-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "get_about_n_representative_assertions_from_mt", "GET-ABOUT-N-REPRESENTATIVE-ASSERTIONS-FROM-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "get_n_assertions_from_pred_with_prob", "GET-N-ASSERTIONS-FROM-PRED-WITH-PROB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "get_n_assertions_from_mt_with_prob", "GET-N-ASSERTIONS-FROM-MT-WITH-PROB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "get_summed_frequencies_from_frequency_list", "GET-SUMMED-FREQUENCIES-FROM-FREQUENCY-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_suggestor", "mts_random_subset", "MTS-RANDOM-SUBSET", 2, 0, false);
        return (SubLObject)mt_suggestor.NIL;
    }
    
    public static SubLObject init_mt_suggestor_file() {
        mt_suggestor.$mts_forbid_lexical_mts$ = SubLFiles.defparameter("*MTS-FORBID-LEXICAL-MTS*", (SubLObject)mt_suggestor.NIL);
        mt_suggestor.$mts_forbid_project_mts$ = SubLFiles.defparameter("*MTS-FORBID-PROJECT-MTS*", (SubLObject)mt_suggestor.NIL);
        mt_suggestor.$mts_forbid_high_level_mts_for_content_assertions$ = SubLFiles.defparameter("*MTS-FORBID-HIGH-LEVEL-MTS-FOR-CONTENT-ASSERTIONS*", (SubLObject)mt_suggestor.T);
        mt_suggestor.$predicate_determined_gaf_cutoff_percent$ = SubLFiles.defparameter("*PREDICATE-DETERMINED-GAF-CUTOFF-PERCENT*", (SubLObject)mt_suggestor.$float4$0_8);
        mt_suggestor.$predicate_determined_gaf_cutoff_number$ = SubLFiles.defparameter("*PREDICATE-DETERMINED-GAF-CUTOFF-NUMBER*", (SubLObject)mt_suggestor.THREE_INTEGER);
        mt_suggestor.$mtsugg_related_assertion_formulas_query_properties$ = SubLFiles.deflexical("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-PROPERTIES*", (SubLObject)mt_suggestor.$list13);
        mt_suggestor.$mtsugg_related_assertion_formulas_query_mt$ = SubLFiles.deflexical("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-MT*", (SubLObject)mt_suggestor.$list14);
        mt_suggestor.$frequency_list_of_mts_caching_state$ = SubLFiles.deflexical("*FREQUENCY-LIST-OF-MTS-CACHING-STATE*", (SubLObject)mt_suggestor.NIL);
        mt_suggestor.$mtsugg_too_general_term_filter$ = SubLFiles.deflexical("*MTSUGG-TOO-GENERAL-TERM-FILTER*", (SubLObject)mt_suggestor.$list38);
        mt_suggestor.$mtsugg_too_general_collection_filter$ = SubLFiles.deflexical("*MTSUGG-TOO-GENERAL-COLLECTION-FILTER*", (SubLObject)mt_suggestor.$list39);
        mt_suggestor.$mtsugg_too_general_quoted_collection_filter$ = SubLFiles.deflexical("*MTSUGG-TOO-GENERAL-QUOTED-COLLECTION-FILTER*", (SubLObject)mt_suggestor.$list40);
        mt_suggestor.$top_mt_percent_count_caching_state$ = SubLFiles.deflexical("*TOP-MT-PERCENT-COUNT-CACHING-STATE*", (SubLObject)mt_suggestor.NIL);
        mt_suggestor.$examination_formulas$ = SubLFiles.deflexical("*EXAMINATION-FORMULAS*", (SubLObject)mt_suggestor.NIL);
        mt_suggestor.$examination_mts$ = SubLFiles.deflexical("*EXAMINATION-MTS*", (SubLObject)mt_suggestor.NIL);
        mt_suggestor.$mts_incorrect_formulas$ = SubLFiles.deflexical("*MTS-INCORRECT-FORMULAS*", (SubLObject)mt_suggestor.NIL);
        mt_suggestor.$mts_actual_mts$ = SubLFiles.deflexical("*MTS-ACTUAL-MTS*", (SubLObject)mt_suggestor.NIL);
        mt_suggestor.$mts_guessed_mts$ = SubLFiles.deflexical("*MTS-GUESSED-MTS*", (SubLObject)mt_suggestor.NIL);
        return (SubLObject)mt_suggestor.NIL;
    }
    
    public static SubLObject setup_mt_suggestor_file() {
        memoization_state.note_globally_cached_function((SubLObject)mt_suggestor.$sym25$FREQUENCY_LIST_OF_MTS);
        memoization_state.note_globally_cached_function((SubLObject)mt_suggestor.$sym47$TOP_MT_PERCENT_COUNT);
        return (SubLObject)mt_suggestor.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_mt_suggestor_file();
    }
    
    @Override
	public void initializeVariables() {
        init_mt_suggestor_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_mt_suggestor_file();
    }
    
    static {
        me = (SubLFile)new mt_suggestor();
        mt_suggestor.$mts_forbid_lexical_mts$ = null;
        mt_suggestor.$mts_forbid_project_mts$ = null;
        mt_suggestor.$mts_forbid_high_level_mts_for_content_assertions$ = null;
        mt_suggestor.$predicate_determined_gaf_cutoff_percent$ = null;
        mt_suggestor.$predicate_determined_gaf_cutoff_number$ = null;
        mt_suggestor.$mtsugg_related_assertion_formulas_query_properties$ = null;
        mt_suggestor.$mtsugg_related_assertion_formulas_query_mt$ = null;
        mt_suggestor.$frequency_list_of_mts_caching_state$ = null;
        mt_suggestor.$mtsugg_too_general_term_filter$ = null;
        mt_suggestor.$mtsugg_too_general_collection_filter$ = null;
        mt_suggestor.$mtsugg_too_general_quoted_collection_filter$ = null;
        mt_suggestor.$top_mt_percent_count_caching_state$ = null;
        mt_suggestor.$examination_formulas$ = null;
        mt_suggestor.$examination_mts$ = null;
        mt_suggestor.$mts_incorrect_formulas$ = null;
        mt_suggestor.$mts_actual_mts$ = null;
        mt_suggestor.$mts_guessed_mts$ = null;
        $sym0$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym1$MTS_NOT_COMMONSENSE_MT_ = SubLObjectFactory.makeSymbol("MTS-NOT-COMMONSENSE-MT?");
        $sym2$CAR = SubLObjectFactory.makeSymbol("CAR");
        $const3$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $float4$0_8 = (SubLFloat)SubLObjectFactory.makeDouble(0.8);
        $const5$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $const6$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const7$LexicalMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalMicrotheory"));
        $const8$ProjectMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProjectMicrotheory"));
        $const9$ApplicationContext = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApplicationContext"));
        $const10$SourceMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceMicrotheory"));
        $const11$MappingMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MappingMicrotheory"));
        $const12$ProblemSolvingCntxt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProblemSolvingCntxt"));
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION"), SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), mt_suggestor.T, SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), mt_suggestor.T, SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSITIVE-INFINITY") });
        $list14 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now"))));
        $sym15$GAF_ = SubLObjectFactory.makeSymbol("GAF?");
        $sym16$_X = SubLObjectFactory.makeSymbol("?X");
        $sym17$_MT = SubLObjectFactory.makeSymbol("?MT");
        $kw18$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const19$ist_Asserted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $sym20$ASSERTION_MONAD_MT = SubLObjectFactory.makeSymbol("ASSERTION-MONAD-MT");
        $int21$100 = SubLObjectFactory.makeInteger(100);
        $int22$10000 = SubLObjectFactory.makeInteger(10000);
        $float23$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $float24$0_2 = (SubLFloat)SubLObjectFactory.makeDouble(0.2);
        $sym25$FREQUENCY_LIST_OF_MTS = SubLObjectFactory.makeSymbol("FREQUENCY-LIST-OF-MTS");
        $sym26$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const27$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw28$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw29$RULE = SubLObjectFactory.makeKeyword("RULE");
        $sym30$_FREQUENCY_LIST_OF_MTS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FREQUENCY-LIST-OF-MTS-CACHING-STATE*");
        $sym31$MTS_TOO_GENERAL_ = SubLObjectFactory.makeSymbol("MTS-TOO-GENERAL?");
        $const32$Dog = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog"));
        $sym33$MTS_TOO_GENERAL_LIGHT_FILTERING_ = SubLObjectFactory.makeSymbol("MTS-TOO-GENERAL-LIGHT-FILTERING?");
        $sym34$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym35$_ = SubLObjectFactory.makeSymbol(">");
        $sym36$CADDR = SubLObjectFactory.makeSymbol("CADDR");
        $sym37$CADR = SubLObjectFactory.makeSymbol("CADR");
        $list38 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExistingObjectType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sharedNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("similarTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")) });
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MetaRelation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KEFaciliationPredicate")));
        $list40 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoreConstant")));
        $const41$MetaRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MetaRelation"));
        $const42$CoreConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoreConstant"));
        $const43$KEFacilitationPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KEFacilitationPredicate"));
        $int44$20000 = SubLObjectFactory.makeInteger(20000);
        $sym45$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $sym46$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $sym47$TOP_MT_PERCENT_COUNT = SubLObjectFactory.makeSymbol("TOP-MT-PERCENT-COUNT");
        $sym48$_ = SubLObjectFactory.makeSymbol("+");
        $sym49$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym50$_TOP_MT_PERCENT_COUNT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TOP-MT-PERCENT-COUNT-CACHING-STATE*");
        $int51$25 = SubLObjectFactory.makeInteger(25);
        $sym52$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym53$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $sym54$LAST = SubLObjectFactory.makeSymbol("LAST");
        $list55 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("RUN-LARGE-COMMONSENSE-MT-RULES-TEST"), SubLObjectFactory.makeSymbol("RUN-BASE-KB-RULES-TEST"), SubLObjectFactory.makeSymbol("RUN-LEXICAL-RULES-TEST"), SubLObjectFactory.makeSymbol("RUN-LEXICAL-GAFS-TEST"), SubLObjectFactory.makeSymbol("RUN-LARGE-COMMONSENSE-MT-GAFS-TEST"), SubLObjectFactory.makeSymbol("RUN-META-PREDICATES-TEST"), SubLObjectFactory.makeSymbol("RUN-RULE-MACRO-PREDICATES-TEST"), SubLObjectFactory.makeSymbol("RUN-NEW-PROJECT-ASSERTIONS-TEST"), SubLObjectFactory.makeSymbol("RUN-OLD-PROJECT-ASSERTIONS-TEST") });
        $str56$Running_test__ = SubLObjectFactory.makeString("Running test: ");
        $str57$_RESULTS__ = SubLObjectFactory.makeString(" RESULTS: ");
        $str58$Incorrect_Formula__ = SubLObjectFactory.makeString("Incorrect Formula: ");
        $str59$Suggested_Mt__ = SubLObjectFactory.makeString("Suggested Mt: ");
        $str60$Actual_Mt__ = SubLObjectFactory.makeString("Actual Mt: ");
        $str61$Frequency_list_of_suggested_mts__ = SubLObjectFactory.makeString("Frequency list of suggested mts: ");
        $str62$Frequency_list_of_actual_mts__ = SubLObjectFactory.makeString("Frequency list of actual mts: ");
        $const63$SAICLegacyAssertionsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SAICLegacyAssertionsMt"));
        $const64$PredicatePopulationMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PredicatePopulationMt"));
        $const65$TestVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $const66$MotleyFoolUKGlossaryMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MotleyFoolUKGlossaryMt"));
        $const67$WebSearchEnhancementMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebSearchEnhancementMt"));
        $const68$DesertShieldMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DesertShieldMt"));
        $const69$OilEconModelMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OilEconModelMt"));
        $const70$Y2Scenario_Stage1Mt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Y2Scenario-Stage1Mt"));
        $const71$BeachWalkIMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BeachWalkIMt"));
        $const72$PQ204Mt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PQ204Mt"));
        $const73$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const74$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const75$MetaPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MetaPredicate"));
        $const76$RuleMacroPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RuleMacroPredicate"));
        $const77$BiologyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BiologyMt"));
        $const78$ModernMilitaryTacticsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModernMilitaryTacticsMt"));
        $const79$HumanSocialLifeMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanSocialLifeMt"));
        $const80$ChemistryMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChemistryMt"));
        $const81$EnglishLexiconMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishLexiconMt"));
        $const82$EnglishParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"));
        $const83$LogicalTruthMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalTruthMt"));
        $const84$LogicalTruthImplementationMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalTruthImplementationMt"));
        $const85$CoreCycLMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoreCycLMt"));
        $str86$Trying_Formula__ = SubLObjectFactory.makeString("Trying Formula: ");
        $str87$Got_ = SubLObjectFactory.makeString("Got ");
        $str88$_out_of_ = SubLObjectFactory.makeString(" out of ");
        $kw89$MT = SubLObjectFactory.makeKeyword("MT");
        $kw90$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $kw91$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $str92$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym93$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw94$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $int95$100000 = SubLObjectFactory.makeInteger(100000);
        $const96$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
    }
}

/*

	Total time: 934 ms
	
*/