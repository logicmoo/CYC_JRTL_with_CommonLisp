package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.kb_cleanup;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_prototypes extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.hl_prototypes";
    public static final String myFingerPrint = "bcebc931fb4bf2531fbdafb317616ca381abb7f166f7e85db7ab112ff20d6026";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1156L)
    private static SubLSymbol $hl_prototypes_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1284L)
    private static SubLSymbol $gather_hl_prototype_statisticsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1344L)
    private static SubLSymbol $hl_prototype_hits$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1386L)
    private static SubLSymbol $hl_prototype_hit_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1453L)
    private static SubLSymbol $hl_prototype_misses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3329L)
    private static SubLSymbol $the_hl_prototype_ke_irrelevant_rule_caching_state$;
    private static final SubLSymbol $sym0$_HL_PROTOTYPE_HITS_;
    private static final SubLSymbol $sym1$_HL_PROTOTYPE_HIT_TABLE_;
    private static final SubLSymbol $sym2$_HL_PROTOTYPE_MISSES_;
    private static final SubLSymbol $sym3$HL_PROTOTYPICAL_INSTANCE_AFTER_ADDING;
    private static final SubLSymbol $sym4$HL_PROTOTYPICAL_INSTANCE_AFTER_REMOVING;
    private static final SubLSymbol $sym5$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE;
    private static final SubLObject $const6$quotedIsa;
    private static final SubLList $list7;
    private static final SubLObject $const8$keIrrelevantTerm;
    private static final SubLObject $const9$UniversalVocabularyMt;
    private static final SubLSymbol $sym10$_THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE_CACHING_STATE_;
    private static final SubLObject $const11$isa;
    private static final SubLObject $const12$hlPrototypicalInstance;
    private static final SubLSymbol $sym13$QUEUE_P;
    private static final SubLSymbol $kw14$ALL;
    private static final SubLString $str15$ThePrototypical;
    private static final SubLSymbol $sym16$GAF_ARG2;
    private static final SubLString $str17$Hits_____a__;
    private static final SubLString $str18$Misses___a__;
    private static final SubLString $str19$Ratio____a___;
    private static final SubLString $str20$cdolist;
    private static final SubLSymbol $sym21$CAR;
    private static final SubLSymbol $sym22$_;
    private static final SubLString $str23$mapping_Cyc_constants;
    private static final SubLSymbol $sym24$STRINGP;
    private static final SubLSymbol $kw25$SKIP;
    private static final SubLSymbol $kw26$TRUE;
    private static final SubLSymbol $sym27$ASSERTED_ASSERTION_;
    private static final SubLString $str28$Foo;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$SIMPLEST_HYPOTHETICAL;
    private static final SubLSymbol $kw31$TERSE;
    private static final SubLSymbol $kw32$STANDARD;
    private static final SubLList $list33;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1497L)
    public static SubLObject hl_prototypes_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hl_prototypes.$hl_prototypes_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1597L)
    public static SubLObject hl_prototype_allowed_forward_rules(final SubLObject assertions_found_or_created) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hl_prototypes.NIL != hl_prototypes_enabledP() && hl_prototypes.NIL != list_utilities.singletonP(assertions_found_or_created)) {
            final SubLObject assertion = assertions_found_or_created.first();
            if (hl_prototypes.NIL != possibly_hl_prototype_assertionP(assertion)) {
                final SubLObject col = assertions_high.gaf_arg2(assertion);
                final SubLObject prototypical_instance = find_or_create_hl_prototypical_instance(col, (SubLObject)hl_prototypes.UNPROVIDED);
                final SubLObject rules = relevant_hl_prototype_rules(prototypical_instance);
                if (hl_prototypes.NIL != hl_prototypes.$gather_hl_prototype_statisticsP$.getDynamicValue(thread)) {
                    hl_prototypes.$hl_prototype_hits$.setGlobalValue(Numbers.add(hl_prototypes.$hl_prototype_hits$.getGlobalValue(), (SubLObject)hl_prototypes.ONE_INTEGER));
                    dictionary_utilities.dictionary_increment(hl_prototypes.$hl_prototype_hit_table$.getGlobalValue(), col, (SubLObject)hl_prototypes.UNPROVIDED);
                }
                return rules;
            }
        }
        if (hl_prototypes.NIL != hl_prototypes.$gather_hl_prototype_statisticsP$.getDynamicValue(thread)) {
            hl_prototypes.$hl_prototype_misses$.setGlobalValue(Numbers.add(hl_prototypes.$hl_prototype_misses$.getGlobalValue(), (SubLObject)hl_prototypes.ONE_INTEGER));
        }
        return forward.forward_inference_allowed_rules();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 2338L)
    public static SubLObject hl_prototype_forbidden_forward_rules(final SubLObject assertions_found_or_created) {
        if (hl_prototypes.NIL != hl_prototypes_enabledP() && hl_prototypes.NIL != list_utilities.singletonP(assertions_found_or_created)) {
            final SubLObject assertion = assertions_found_or_created.first();
            if (hl_prototypes.NIL != possibly_hl_prototype_assertionP(assertion)) {
                if (forward.forward_inference_forbidden_rules().isCons()) {
                    return list_utilities.fast_remove_duplicates((SubLObject)ConsesLow.cons(the_hl_prototype_ke_irrelevant_rule(), forward.forward_inference_forbidden_rules()), (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED);
                }
                return (SubLObject)ConsesLow.list(the_hl_prototype_ke_irrelevant_rule());
            }
        }
        return forward.forward_inference_forbidden_rules();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 2919L)
    public static SubLObject hl_prototypical_instance_after_adding(final SubLObject assertion, final SubLObject argument) {
        return (SubLObject)hl_prototypes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3149L)
    public static SubLObject hl_prototypical_instance_after_removing(final SubLObject assertion, final SubLObject argument) {
        return (SubLObject)hl_prototypes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3329L)
    public static SubLObject clear_the_hl_prototype_ke_irrelevant_rule() {
        final SubLObject cs = hl_prototypes.$the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue();
        if (hl_prototypes.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)hl_prototypes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3329L)
    public static SubLObject remove_the_hl_prototype_ke_irrelevant_rule() {
        return memoization_state.caching_state_remove_function_results_with_args(hl_prototypes.$the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(hl_prototypes.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3329L)
    public static SubLObject the_hl_prototype_ke_irrelevant_rule_internal() {
        return kb_indexing.find_assertion((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(hl_prototypes.$const6$quotedIsa, variables.find_variable_by_id((SubLObject)hl_prototypes.ZERO_INTEGER), (SubLObject)hl_prototypes.$list7)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(hl_prototypes.$const8$keIrrelevantTerm, variables.find_variable_by_id((SubLObject)hl_prototypes.ZERO_INTEGER)))), hl_prototypes.$const9$UniversalVocabularyMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3329L)
    public static SubLObject the_hl_prototype_ke_irrelevant_rule() {
        SubLObject caching_state = hl_prototypes.$the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue();
        if (hl_prototypes.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)hl_prototypes.$sym5$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE, (SubLObject)hl_prototypes.$sym10$_THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE_CACHING_STATE_, (SubLObject)hl_prototypes.NIL, (SubLObject)hl_prototypes.EQ, (SubLObject)hl_prototypes.ZERO_INTEGER, (SubLObject)hl_prototypes.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)hl_prototypes.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(the_hl_prototype_ke_irrelevant_rule_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)hl_prototypes.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3776L)
    public static SubLObject relevant_hl_prototype_rules(final SubLObject v_term) {
        final SubLObject rules = assertion_utilities.safe_all_forward_rules_relevant_to_term(v_term);
        if (rules.isCons()) {
            return rules;
        }
        return forward.forward_inference_allowed_rules();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3975L)
    public static SubLObject clear_hl_prototype_caches() {
        clear_the_hl_prototype_ke_irrelevant_rule();
        return (SubLObject)hl_prototypes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 4080L)
    public static SubLObject possibly_hl_prototype_assertionP(final SubLObject assertion) {
        if (hl_prototypes.NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, hl_prototypes.$const11$isa)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (mt.eql(mt_vars.$anect_mt$.getGlobalValue()) || mt.eql(mt_vars.$core_mt_floor$.getGlobalValue())) {
                final SubLObject new_term = assertions_high.gaf_arg1(assertion);
                if (hl_prototypes.NIL != number_utilities.onep(kb_indexing.num_index(new_term))) {
                    return (SubLObject)hl_prototypes.T;
                }
            }
        }
        return (SubLObject)hl_prototypes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 4599L)
    public static SubLObject find_or_create_hl_prototypical_instance(final SubLObject col, SubLObject use_transcriptP) {
        if (use_transcriptP == hl_prototypes.UNPROVIDED) {
            use_transcriptP = (SubLObject)hl_prototypes.NIL;
        }
        final SubLObject prototypical_instance = hl_prototypical_instance(col);
        return (hl_prototypes.NIL != prototypical_instance) ? prototypical_instance : create_hl_prototypical_instance(col, use_transcriptP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 4852L)
    public static SubLObject hl_prototypical_instance(final SubLObject col) {
        return kb_mapping_utilities.fpred_value(col, hl_prototypes.$const12$hlPrototypicalInstance, (SubLObject)hl_prototypes.TWO_INTEGER, (SubLObject)hl_prototypes.ONE_INTEGER, (SubLObject)hl_prototypes.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 5035L)
    public static SubLObject create_hl_prototypical_instance(final SubLObject col, SubLObject use_transcriptP) {
        if (use_transcriptP == hl_prototypes.UNPROVIDED) {
            use_transcriptP = (SubLObject)hl_prototypes.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = hl_prototypical_instance_name(col);
        final SubLObject v_const = (hl_prototypes.NIL != use_transcriptP) ? ke.ke_create_now(name, (SubLObject)hl_prototypes.UNPROVIDED) : cyc_kernel.cyc_create_new_ephemeral(name);
        final SubLObject environment = forward.get_forward_inference_environment();
        assert hl_prototypes.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_prototypes.$hl_prototypes_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            hl_prototypes.$hl_prototypes_enabledP$.bind((SubLObject)hl_prototypes.NIL, thread);
            final SubLObject _prev_bind_0_$1 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(removal_module_utilities.non_null_answer_to_singleton(the_hl_prototype_ke_irrelevant_rule()), thread);
                if (hl_prototypes.NIL != use_transcriptP) {
                    ke.ke_assert_now((SubLObject)ConsesLow.listS(hl_prototypes.$const6$quotedIsa, v_const, (SubLObject)hl_prototypes.$list7), mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED);
                }
                else {
                    cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(hl_prototypes.$const6$quotedIsa, v_const, (SubLObject)hl_prototypes.$list7), mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)hl_prototypes.UNPROVIDED);
                }
            }
            finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$1, thread);
            }
            final SubLObject _prev_bind_0_$2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind((SubLObject)hl_prototypes.NIL, thread);
                if (hl_prototypes.NIL != use_transcriptP) {
                    ke.ke_assert_now((SubLObject)ConsesLow.list(hl_prototypes.$const12$hlPrototypicalInstance, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED);
                }
                else {
                    cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(hl_prototypes.$const12$hlPrototypicalInstance, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)hl_prototypes.UNPROVIDED);
                }
            }
            finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$2, thread);
            }
            final SubLObject _prev_bind_0_$3 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind((SubLObject)hl_prototypes.$kw14$ALL, thread);
                if (hl_prototypes.NIL != use_transcriptP) {
                    ke.ke_assert_now((SubLObject)ConsesLow.list(hl_prototypes.$const11$isa, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED);
                }
                else {
                    cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(hl_prototypes.$const11$isa, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)hl_prototypes.UNPROVIDED);
                }
            }
            finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$3, thread);
            }
        }
        finally {
            hl_prototypes.$hl_prototypes_enabledP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return v_const;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 6173L)
    public static SubLObject hl_prototypical_instance_name(final SubLObject col) {
        return string_utilities.make_valid_constant_name(Sequences.cconcatenate((SubLObject)hl_prototypes.$str15$ThePrototypical, kb_paths.fort_name(col)), (SubLObject)hl_prototypes.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 6311L)
    public static SubLObject hl_prototype_collections() {
        return Mapping.mapcar((SubLObject)hl_prototypes.$sym16$GAF_ARG2, kb_mapping.gather_predicate_extent_index(hl_prototypes.$const12$hlPrototypicalInstance, (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 6537L)
    public static SubLObject hl_prototypical_collection(final SubLObject prototypical_instance) {
        return (SubLObject)((hl_prototypes.NIL != kb_indexing_datastructures.indexed_term_p(prototypical_instance)) ? kb_mapping_utilities.fpred_value(prototypical_instance, hl_prototypes.$const12$hlPrototypicalInstance, (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED) : hl_prototypes.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 6824L)
    public static SubLObject hl_prototypical_instanceP(final SubLObject thing) {
        return list_utilities.sublisp_boolean(hl_prototypical_collection(thing));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 6931L)
    public static SubLObject show_hl_prototype_statistics() {
        dictionary_utilities.print_dictionary_contents(hl_prototypes.$hl_prototype_hit_table$.getGlobalValue(), (SubLObject)hl_prototypes.UNPROVIDED);
        PrintLow.format((SubLObject)hl_prototypes.T, (SubLObject)hl_prototypes.$str17$Hits_____a__, hl_prototypes.$hl_prototype_hits$.getGlobalValue());
        PrintLow.format((SubLObject)hl_prototypes.T, (SubLObject)hl_prototypes.$str18$Misses___a__, hl_prototypes.$hl_prototype_misses$.getGlobalValue());
        final SubLObject total = Numbers.add(hl_prototypes.$hl_prototype_hits$.getGlobalValue(), hl_prototypes.$hl_prototype_misses$.getGlobalValue());
        if (total.isPositive()) {
            final SubLObject hit_ratio = number_utilities.percent(Numbers.divide(hl_prototypes.$hl_prototype_hits$.getGlobalValue(), total), (SubLObject)hl_prototypes.ONE_INTEGER, (SubLObject)hl_prototypes.FOUR_INTEGER);
            PrintLow.format((SubLObject)hl_prototypes.T, (SubLObject)hl_prototypes.$str19$Ratio____a___, hit_ratio);
            return hit_ratio;
        }
        return (SubLObject)hl_prototypes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 7366L)
    public static SubLObject clear_hl_prototype_statistics() {
        hl_prototypes.$hl_prototype_misses$.setGlobalValue((SubLObject)hl_prototypes.ZERO_INTEGER);
        hl_prototypes.$hl_prototype_hits$.setGlobalValue((SubLObject)hl_prototypes.ZERO_INTEGER);
        dictionary.clear_dictionary(hl_prototypes.$hl_prototype_hit_table$.getGlobalValue());
        return (SubLObject)hl_prototypes.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 7539L)
    public static SubLObject create_hl_prototypical_instances_for_common_collections(final SubLObject n, SubLObject dict) {
        if (dict == hl_prototypes.UNPROVIDED) {
            dict = most_useful_hl_prototypical_instances_dict();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var = n_most_useful_hl_prototype_collections(n, dict);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)hl_prototypes.$str20$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)hl_prototypes.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_prototypes.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_prototypes.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_prototypes.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject col = (SubLObject)hl_prototypes.NIL;
                col = csome_list_var.first();
                while (hl_prototypes.NIL != csome_list_var) {
                    find_or_create_hl_prototypical_instance(col, (SubLObject)hl_prototypes.T);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)hl_prototypes.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    col = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_prototypes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return n;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 7860L)
    public static SubLObject n_most_useful_hl_prototype_collections(final SubLObject n, SubLObject dict) {
        if (dict == hl_prototypes.UNPROVIDED) {
            dict = most_useful_hl_prototypical_instances_dict();
        }
        return list_utilities.first_n(n, Mapping.mapcar(Symbols.symbol_function((SubLObject)hl_prototypes.$sym21$CAR), dictionary_utilities.sort_dictionary_by_values(dict, Symbols.symbol_function((SubLObject)hl_prototypes.$sym22$_))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8055L)
    public static SubLObject most_useful_hl_prototypical_instances_dict() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)hl_prototypes.EQL), (SubLObject)hl_prototypes.UNPROVIDED);
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = (SubLObject)hl_prototypes.$str23$mapping_Cyc_constants;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)hl_prototypes.ZERO_INTEGER;
        assert hl_prototypes.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_prototypes.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_prototypes.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_prototypes.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$5 = idx;
                if (hl_prototypes.NIL == id_index.id_index_objects_empty_p(idx_$5, (SubLObject)hl_prototypes.$kw25$SKIP)) {
                    final SubLObject idx_$6 = idx_$5;
                    if (hl_prototypes.NIL == id_index.id_index_dense_objects_empty_p(idx_$6, (SubLObject)hl_prototypes.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                        final SubLObject backwardP_var = (SubLObject)hl_prototypes.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        SubLObject col;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)hl_prototypes.NIL, v_iteration = (SubLObject)hl_prototypes.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)hl_prototypes.ONE_INTEGER)) {
                            id = ((hl_prototypes.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)hl_prototypes.ONE_INTEGER) : v_iteration);
                            c = Vectors.aref(vector_var, id);
                            if (hl_prototypes.NIL == id_index.id_index_tombstone_p(c) || hl_prototypes.NIL == id_index.id_index_skip_tombstones_p((SubLObject)hl_prototypes.$kw25$SKIP)) {
                                if (hl_prototypes.NIL != id_index.id_index_tombstone_p(c)) {
                                    c = (SubLObject)hl_prototypes.$kw25$SKIP;
                                }
                                col = likely_first_asserted_isa_col(c);
                                if (hl_prototypes.NIL != col) {
                                    dictionary_utilities.dictionary_increment(dict, col, (SubLObject)hl_prototypes.UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)hl_prototypes.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$7 = idx_$5;
                    if (hl_prototypes.NIL == id_index.id_index_sparse_objects_empty_p(idx_$7) || hl_prototypes.NIL == id_index.id_index_skip_tombstones_p((SubLObject)hl_prototypes.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$7);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$7);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$7);
                        final SubLObject v_default = (SubLObject)((hl_prototypes.NIL != id_index.id_index_skip_tombstones_p((SubLObject)hl_prototypes.$kw25$SKIP)) ? hl_prototypes.NIL : hl_prototypes.$kw25$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject c2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (hl_prototypes.NIL == id_index.id_index_skip_tombstones_p((SubLObject)hl_prototypes.$kw25$SKIP) || hl_prototypes.NIL == id_index.id_index_tombstone_p(c2)) {
                                final SubLObject col2 = likely_first_asserted_isa_col(c2);
                                if (hl_prototypes.NIL != col2) {
                                    dictionary_utilities.dictionary_increment(dict, col2, (SubLObject)hl_prototypes.UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)hl_prototypes.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)hl_prototypes.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_prototypes.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8301L)
    public static SubLObject likely_first_asserted_isa_col(final SubLObject v_const) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_prototypes.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$anect_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject gafs = kb_mapping.gather_gaf_arg_index(v_const, (SubLObject)hl_prototypes.ONE_INTEGER, hl_prototypes.$const11$isa, (SubLObject)hl_prototypes.NIL, (SubLObject)hl_prototypes.$kw26$TRUE);
            final SubLObject first_gaf = likely_first_asserted_isa_gaf(gafs);
            final SubLObject col = result = (SubLObject)((hl_prototypes.NIL != first_gaf) ? assertions_high.gaf_arg2(first_gaf) : hl_prototypes.NIL);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8643L)
    public static SubLObject likely_first_asserted_isa_gaf(SubLObject gafs) {
        gafs = list_utilities.remove_if_not((SubLObject)hl_prototypes.$sym27$ASSERTED_ASSERTION_, gafs, (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED, (SubLObject)hl_prototypes.UNPROVIDED);
        final SubLObject earliest_gaf = assertion_utilities.earliest_assertion(gafs);
        return (hl_prototypes.NIL != earliest_gaf) ? earliest_gaf : list_utilities.random_element(gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8863L)
    public static SubLObject hl_prototype_benchmark_1(SubLObject n) {
        if (n == hl_prototypes.UNPROVIDED) {
            n = (SubLObject)hl_prototypes.TEN_INTEGER;
        }
        SubLObject total_time = (SubLObject)hl_prototypes.ZERO_INTEGER;
        SubLObject i;
        SubLObject v_const;
        SubLObject time;
        SubLObject time_var;
        for (i = (SubLObject)hl_prototypes.NIL, i = (SubLObject)hl_prototypes.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)hl_prototypes.ONE_INTEGER)) {
            v_const = (SubLObject)hl_prototypes.NIL;
            v_const = cyc_kernel.cyc_create_new_permanent((SubLObject)hl_prototypes.$str28$Foo);
            time = (SubLObject)hl_prototypes.NIL;
            time_var = Time.get_internal_real_time();
            cyc_kernel.cyc_assert((SubLObject)ConsesLow.listS(hl_prototypes.$const11$isa, v_const, (SubLObject)hl_prototypes.$list29), mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)hl_prototypes.UNPROVIDED);
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time = Numbers.add(total_time, time);
            cyc_kernel.cyc_kill(v_const);
        }
        return total_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8863L)
    public static SubLObject hl_prototype_benchmark_2(SubLObject n) {
        if (n == hl_prototypes.UNPROVIDED) {
            n = (SubLObject)hl_prototypes.TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_time = (SubLObject)hl_prototypes.ZERO_INTEGER;
        SubLObject i;
        SubLObject time;
        SubLObject time_var;
        for (i = (SubLObject)hl_prototypes.NIL, i = (SubLObject)hl_prototypes.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)hl_prototypes.ONE_INTEGER)) {
            kb_cleanup.forget_ephemeral_terms((SubLObject)hl_prototypes.UNPROVIDED);
            time = (SubLObject)hl_prototypes.NIL;
            time_var = Time.get_internal_real_time();
            cyc_testing_utilities.run_cyc_test_int((SubLObject)hl_prototypes.$kw30$SIMPLEST_HYPOTHETICAL, (SubLObject)hl_prototypes.$kw31$TERSE, (SubLObject)hl_prototypes.NIL, (SubLObject)hl_prototypes.NIL, (SubLObject)hl_prototypes.$kw32$STANDARD, StreamsLow.$standard_output$.getDynamicValue(thread), cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread));
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time = Numbers.add(total_time, time);
        }
        return total_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8863L)
    public static SubLObject hl_prototype_benchmark_3(SubLObject n) {
        if (n == hl_prototypes.UNPROVIDED) {
            n = (SubLObject)hl_prototypes.TEN_INTEGER;
        }
        SubLObject total_time = (SubLObject)hl_prototypes.ZERO_INTEGER;
        SubLObject i;
        SubLObject v_const;
        SubLObject time;
        SubLObject time_var;
        for (i = (SubLObject)hl_prototypes.NIL, i = (SubLObject)hl_prototypes.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)hl_prototypes.ONE_INTEGER)) {
            v_const = (SubLObject)hl_prototypes.NIL;
            v_const = cyc_kernel.cyc_create_new_permanent((SubLObject)hl_prototypes.$str28$Foo);
            time = (SubLObject)hl_prototypes.NIL;
            time_var = Time.get_internal_real_time();
            cyc_kernel.cyc_assert((SubLObject)ConsesLow.listS(hl_prototypes.$const11$isa, v_const, (SubLObject)hl_prototypes.$list33), mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)hl_prototypes.UNPROVIDED);
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time = Numbers.add(total_time, time);
            cyc_kernel.cyc_kill(v_const);
        }
        return total_time;
    }
    
    public static SubLObject declare_hl_prototypes_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototypes_enabledP", "HL-PROTOTYPES-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototype_allowed_forward_rules", "HL-PROTOTYPE-ALLOWED-FORWARD-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototype_forbidden_forward_rules", "HL-PROTOTYPE-FORBIDDEN-FORWARD-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototypical_instance_after_adding", "HL-PROTOTYPICAL-INSTANCE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototypical_instance_after_removing", "HL-PROTOTYPICAL-INSTANCE-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "clear_the_hl_prototype_ke_irrelevant_rule", "CLEAR-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "remove_the_hl_prototype_ke_irrelevant_rule", "REMOVE-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "the_hl_prototype_ke_irrelevant_rule_internal", "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "the_hl_prototype_ke_irrelevant_rule", "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "relevant_hl_prototype_rules", "RELEVANT-HL-PROTOTYPE-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "clear_hl_prototype_caches", "CLEAR-HL-PROTOTYPE-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "possibly_hl_prototype_assertionP", "POSSIBLY-HL-PROTOTYPE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "find_or_create_hl_prototypical_instance", "FIND-OR-CREATE-HL-PROTOTYPICAL-INSTANCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototypical_instance", "HL-PROTOTYPICAL-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "create_hl_prototypical_instance", "CREATE-HL-PROTOTYPICAL-INSTANCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototypical_instance_name", "HL-PROTOTYPICAL-INSTANCE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototype_collections", "HL-PROTOTYPE-COLLECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototypical_collection", "HL-PROTOTYPICAL-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototypical_instanceP", "HL-PROTOTYPICAL-INSTANCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "show_hl_prototype_statistics", "SHOW-HL-PROTOTYPE-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "clear_hl_prototype_statistics", "CLEAR-HL-PROTOTYPE-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "create_hl_prototypical_instances_for_common_collections", "CREATE-HL-PROTOTYPICAL-INSTANCES-FOR-COMMON-COLLECTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "n_most_useful_hl_prototype_collections", "N-MOST-USEFUL-HL-PROTOTYPE-COLLECTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "most_useful_hl_prototypical_instances_dict", "MOST-USEFUL-HL-PROTOTYPICAL-INSTANCES-DICT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "likely_first_asserted_isa_col", "LIKELY-FIRST-ASSERTED-ISA-COL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "likely_first_asserted_isa_gaf", "LIKELY-FIRST-ASSERTED-ISA-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototype_benchmark_1", "HL-PROTOTYPE-BENCHMARK-1", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototype_benchmark_2", "HL-PROTOTYPE-BENCHMARK-2", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.hl_prototypes", "hl_prototype_benchmark_3", "HL-PROTOTYPE-BENCHMARK-3", 0, 1, false);
        return (SubLObject)hl_prototypes.NIL;
    }
    
    public static SubLObject init_hl_prototypes_file() {
        hl_prototypes.$hl_prototypes_enabledP$ = SubLFiles.defparameter("*HL-PROTOTYPES-ENABLED?*", (SubLObject)hl_prototypes.T);
        hl_prototypes.$gather_hl_prototype_statisticsP$ = SubLFiles.defparameter("*GATHER-HL-PROTOTYPE-STATISTICS?*", (SubLObject)hl_prototypes.T);
        hl_prototypes.$hl_prototype_hits$ = SubLFiles.deflexical("*HL-PROTOTYPE-HITS*", (SubLObject)(maybeDefault((SubLObject)hl_prototypes.$sym0$_HL_PROTOTYPE_HITS_, hl_prototypes.$hl_prototype_hits$, hl_prototypes.ZERO_INTEGER)));
        hl_prototypes.$hl_prototype_hit_table$ = SubLFiles.deflexical("*HL-PROTOTYPE-HIT-TABLE*", maybeDefault((SubLObject)hl_prototypes.$sym1$_HL_PROTOTYPE_HIT_TABLE_, hl_prototypes.$hl_prototype_hit_table$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)hl_prototypes.EQ), (SubLObject)hl_prototypes.UNPROVIDED))));
        hl_prototypes.$hl_prototype_misses$ = SubLFiles.deflexical("*HL-PROTOTYPE-MISSES*", (SubLObject)(maybeDefault((SubLObject)hl_prototypes.$sym2$_HL_PROTOTYPE_MISSES_, hl_prototypes.$hl_prototype_misses$, hl_prototypes.ZERO_INTEGER)));
        hl_prototypes.$the_hl_prototype_ke_irrelevant_rule_caching_state$ = SubLFiles.deflexical("*THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-CACHING-STATE*", (SubLObject)hl_prototypes.NIL);
        return (SubLObject)hl_prototypes.NIL;
    }
    
    public static SubLObject setup_hl_prototypes_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)hl_prototypes.$sym0$_HL_PROTOTYPE_HITS_);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_prototypes.$sym1$_HL_PROTOTYPE_HIT_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_prototypes.$sym2$_HL_PROTOTYPE_MISSES_);
        utilities_macros.register_kb_function((SubLObject)hl_prototypes.$sym3$HL_PROTOTYPICAL_INSTANCE_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)hl_prototypes.$sym4$HL_PROTOTYPICAL_INSTANCE_AFTER_REMOVING);
        memoization_state.note_globally_cached_function((SubLObject)hl_prototypes.$sym5$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE);
        return (SubLObject)hl_prototypes.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_hl_prototypes_file();
    }
    
    @Override
	public void initializeVariables() {
        init_hl_prototypes_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_hl_prototypes_file();
    }
    
    static {
        me = (SubLFile)new hl_prototypes();
        hl_prototypes.$hl_prototypes_enabledP$ = null;
        hl_prototypes.$gather_hl_prototype_statisticsP$ = null;
        hl_prototypes.$hl_prototype_hits$ = null;
        hl_prototypes.$hl_prototype_hit_table$ = null;
        hl_prototypes.$hl_prototype_misses$ = null;
        hl_prototypes.$the_hl_prototype_ke_irrelevant_rule_caching_state$ = null;
        $sym0$_HL_PROTOTYPE_HITS_ = SubLObjectFactory.makeSymbol("*HL-PROTOTYPE-HITS*");
        $sym1$_HL_PROTOTYPE_HIT_TABLE_ = SubLObjectFactory.makeSymbol("*HL-PROTOTYPE-HIT-TABLE*");
        $sym2$_HL_PROTOTYPE_MISSES_ = SubLObjectFactory.makeSymbol("*HL-PROTOTYPE-MISSES*");
        $sym3$HL_PROTOTYPICAL_INSTANCE_AFTER_ADDING = SubLObjectFactory.makeSymbol("HL-PROTOTYPICAL-INSTANCE-AFTER-ADDING");
        $sym4$HL_PROTOTYPICAL_INSTANCE_AFTER_REMOVING = SubLObjectFactory.makeSymbol("HL-PROTOTYPICAL-INSTANCE-AFTER-REMOVING");
        $sym5$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE = SubLObjectFactory.makeSymbol("THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE");
        $const6$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HLPrototypicalTerm")));
        $const8$keIrrelevantTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keIrrelevantTerm"));
        $const9$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $sym10$_THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-CACHING-STATE*");
        $const11$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const12$hlPrototypicalInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hlPrototypicalInstance"));
        $sym13$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $kw14$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str15$ThePrototypical = SubLObjectFactory.makeString("ThePrototypical");
        $sym16$GAF_ARG2 = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $str17$Hits_____a__ = SubLObjectFactory.makeString("Hits:   ~a~%");
        $str18$Misses___a__ = SubLObjectFactory.makeString("Misses: ~a~%");
        $str19$Ratio____a___ = SubLObjectFactory.makeString("Ratio:  ~a%~%");
        $str20$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym21$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym22$_ = SubLObjectFactory.makeSymbol(">");
        $str23$mapping_Cyc_constants = SubLObjectFactory.makeString("mapping Cyc constants");
        $sym24$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw25$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw26$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym27$ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $str28$Foo = SubLObjectFactory.makeString("Foo");
        $list29 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")));
        $kw30$SIMPLEST_HYPOTHETICAL = SubLObjectFactory.makeKeyword("SIMPLEST-HYPOTHETICAL");
        $kw31$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $kw32$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $list33 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")));
    }
}

/*

	Total time: 205 ms
	
*/