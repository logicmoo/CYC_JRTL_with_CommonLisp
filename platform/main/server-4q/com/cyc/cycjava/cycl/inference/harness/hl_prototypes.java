package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.kb_cleanup;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class hl_prototypes extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "bcebc931fb4bf2531fbdafb317616ca381abb7f166f7e85db7ab112ff20d6026";
    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1100L)
    private static SubLSymbol $hl_prototypes_enabledP$;
    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1200L)
    private static SubLSymbol $gather_hl_prototype_statisticsP$;
    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1300L)
    private static SubLSymbol $hl_prototype_hits$;
    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1300L)
    private static SubLSymbol $hl_prototype_hit_table$;
    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1400L)
    private static SubLSymbol $hl_prototype_misses$;
    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3300L)
    private static SubLSymbol $the_hl_prototype_ke_irrelevant_rule_caching_state$;
    private static SubLSymbol $sym0$_HL_PROTOTYPE_HITS_;
    private static SubLSymbol $sym1$_HL_PROTOTYPE_HIT_TABLE_;
    private static SubLSymbol $sym2$_HL_PROTOTYPE_MISSES_;
    private static SubLSymbol $sym3$HL_PROTOTYPICAL_INSTANCE_AFTER_ADDING;
    private static SubLSymbol $sym4$HL_PROTOTYPICAL_INSTANCE_AFTER_REMOVING;
    private static SubLSymbol $sym5$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE;
    private static SubLObject $$quotedIsa;
    private static SubLList $list7;
    private static SubLObject $$keIrrelevantTerm;
    private static SubLObject $$UniversalVocabularyMt;
    private static SubLSymbol $sym10$_THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE_CACHING_STATE_;
    private static SubLObject $$isa;
    private static SubLObject $$hlPrototypicalInstance;
    private static SubLSymbol $sym13$QUEUE_P;
    private static SubLSymbol $ALL;
    private static SubLString $str15$ThePrototypical;
    private static SubLSymbol $sym16$GAF_ARG2;
    private static SubLString $str17$Hits_____a__;
    private static SubLString $str18$Misses___a__;
    private static SubLString $str19$Ratio____a___;
    private static SubLString $str20$cdolist;
    private static SubLSymbol $sym21$CAR;
    private static SubLSymbol $sym22$_;
    private static SubLString $str23$mapping_Cyc_constants;
    private static SubLSymbol $sym24$STRINGP;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $sym27$ASSERTED_ASSERTION_;
    private static SubLString $str28$Foo;
    private static SubLList $list29;
    private static SubLSymbol $SIMPLEST_HYPOTHETICAL;
    private static SubLSymbol $TERSE;
    private static SubLSymbol $STANDARD;
    private static SubLList $list33;

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1400L)
    public static SubLObject hl_prototypes_enabledP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $hl_prototypes_enabledP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 1500L)
    public static SubLObject hl_prototype_allowed_forward_rules(SubLObject assertions_found_or_created) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != hl_prototypes_enabledP() && NIL != list_utilities.singletonP(assertions_found_or_created)) {
            SubLObject assertion = assertions_found_or_created.first();
            if (NIL != possibly_hl_prototype_assertionP(assertion)) {
                SubLObject col = assertions_high.gaf_arg2(assertion);
                SubLObject prototypical_instance = find_or_create_hl_prototypical_instance(col, UNPROVIDED);
                SubLObject rules = relevant_hl_prototype_rules(prototypical_instance);
                if (NIL != $gather_hl_prototype_statisticsP$.getDynamicValue(thread)) {
                    $hl_prototype_hits$.setGlobalValue(Numbers.add($hl_prototype_hits$.getGlobalValue(), ONE_INTEGER));
                    dictionary_utilities.dictionary_increment($hl_prototype_hit_table$.getGlobalValue(), col, UNPROVIDED);
                }
                return rules;
            }
        }
        if (NIL != $gather_hl_prototype_statisticsP$.getDynamicValue(thread)) {
            $hl_prototype_misses$.setGlobalValue(Numbers.add($hl_prototype_misses$.getGlobalValue(), ONE_INTEGER));
        }
        return forward.forward_inference_allowed_rules();
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 2300L)
    public static SubLObject hl_prototype_forbidden_forward_rules(SubLObject assertions_found_or_created) {
        if (NIL != hl_prototypes_enabledP() && NIL != list_utilities.singletonP(assertions_found_or_created)) {
            SubLObject assertion = assertions_found_or_created.first();
            if (NIL != possibly_hl_prototype_assertionP(assertion)) {
                if (forward.forward_inference_forbidden_rules().isCons()) {
                    return list_utilities.fast_remove_duplicates(cons(the_hl_prototype_ke_irrelevant_rule(), forward.forward_inference_forbidden_rules()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return list(the_hl_prototype_ke_irrelevant_rule());
            }
        }
        return forward.forward_inference_forbidden_rules();
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 2900L)
    public static SubLObject hl_prototypical_instance_after_adding(SubLObject assertion, SubLObject argument) {
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3100L)
    public static SubLObject hl_prototypical_instance_after_removing(SubLObject assertion, SubLObject argument) {
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3300L)
    public static SubLObject clear_the_hl_prototype_ke_irrelevant_rule() {
        SubLObject cs = $the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3300L)
    public static SubLObject remove_the_hl_prototype_ke_irrelevant_rule() {
        return memoization_state.caching_state_remove_function_results_with_args($the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3300L)
    public static SubLObject the_hl_prototype_ke_irrelevant_rule_internal() {
        return kb_indexing.find_assertion(list(list(listS($$quotedIsa, variables.find_variable_by_id(ZERO_INTEGER), $list7)), list(list($$keIrrelevantTerm, variables.find_variable_by_id(ZERO_INTEGER)))), $$UniversalVocabularyMt);
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3300L)
    public static SubLObject the_hl_prototype_ke_irrelevant_rule() {
        SubLObject caching_state = $the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym5$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE, $sym10$_THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE_CACHING_STATE_, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(the_hl_prototype_ke_irrelevant_rule_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3700L)
    public static SubLObject relevant_hl_prototype_rules(SubLObject v_term) {
        SubLObject rules = assertion_utilities.safe_all_forward_rules_relevant_to_term(v_term);
        if (rules.isCons()) {
            return rules;
        }
        return forward.forward_inference_allowed_rules();
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 3900L)
    public static SubLObject clear_hl_prototype_caches() {
        clear_the_hl_prototype_ke_irrelevant_rule();
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 4000L)
    public static SubLObject possibly_hl_prototype_assertionP(SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$isa)) {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if (mt.eql(mt_vars.$anect_mt$.getGlobalValue()) || mt.eql(mt_vars.$core_mt_floor$.getGlobalValue())) {
                SubLObject new_term = assertions_high.gaf_arg1(assertion);
                if (NIL != number_utilities.onep(kb_indexing.num_index(new_term))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 4500L)
    public static SubLObject find_or_create_hl_prototypical_instance(SubLObject col, SubLObject use_transcriptP) {
        if (use_transcriptP == UNPROVIDED) {
            use_transcriptP = NIL;
        }
        SubLObject prototypical_instance = hl_prototypical_instance(col);
        return (NIL != prototypical_instance) ? prototypical_instance : create_hl_prototypical_instance(col, use_transcriptP);
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 4800L)
    public static SubLObject hl_prototypical_instance(SubLObject col) {
        return kb_mapping_utilities.fpred_value(col, $$hlPrototypicalInstance, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 5000L)
    public static SubLObject create_hl_prototypical_instance(SubLObject col, SubLObject use_transcriptP) {
        if (use_transcriptP == UNPROVIDED) {
            use_transcriptP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name = hl_prototypical_instance_name(col);
        SubLObject v_const = (NIL != use_transcriptP) ? ke.ke_create_now(name, UNPROVIDED) : cyc_kernel.cyc_create_new_ephemeral(name);
        SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : environment;
        SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        SubLObject _prev_bind_2 = $hl_prototypes_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            $hl_prototypes_enabledP$.bind(NIL, thread);
            SubLObject _prev_bind_0_$1 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(removal_module_utilities.non_null_answer_to_singleton(the_hl_prototype_ke_irrelevant_rule()), thread);
                if (NIL != use_transcriptP) {
                    ke.ke_assert_now(listS($$quotedIsa, v_const, $list7), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                } else {
                    cyc_kernel.cyc_assert_wff(listS($$quotedIsa, v_const, $list7), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                }
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$1, thread);
            }
            SubLObject _prev_bind_0_$2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
                if (NIL != use_transcriptP) {
                    ke.ke_assert_now(list($$hlPrototypicalInstance, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                } else {
                    cyc_kernel.cyc_assert_wff(list($$hlPrototypicalInstance, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                }
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$2, thread);
            }
            SubLObject _prev_bind_0_$3 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind($ALL, thread);
                if (NIL != use_transcriptP) {
                    ke.ke_assert_now(list($$isa, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                } else {
                    cyc_kernel.cyc_assert_wff(list($$isa, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                }
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            $hl_prototypes_enabledP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return v_const;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 6100L)
    public static SubLObject hl_prototypical_instance_name(SubLObject col) {
        return string_utilities.make_valid_constant_name(Sequences.cconcatenate($str15$ThePrototypical, kb_paths.fort_name(col)), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 6300L)
    public static SubLObject hl_prototype_collections() {
        return Mapping.mapcar($sym16$GAF_ARG2, kb_mapping.gather_predicate_extent_index($$hlPrototypicalInstance, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 6500L)
    public static SubLObject hl_prototypical_collection(SubLObject prototypical_instance) {
        return (NIL != kb_indexing_datastructures.indexed_term_p(prototypical_instance)) ? kb_mapping_utilities.fpred_value(prototypical_instance, $$hlPrototypicalInstance, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 6800L)
    public static SubLObject hl_prototypical_instanceP(SubLObject thing) {
        return list_utilities.sublisp_boolean(hl_prototypical_collection(thing));
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 6900L)
    public static SubLObject show_hl_prototype_statistics() {
        dictionary_utilities.print_dictionary_contents($hl_prototype_hit_table$.getGlobalValue(), UNPROVIDED);
        PrintLow.format(T, $str17$Hits_____a__, $hl_prototype_hits$.getGlobalValue());
        PrintLow.format(T, $str18$Misses___a__, $hl_prototype_misses$.getGlobalValue());
        SubLObject total = Numbers.add($hl_prototype_hits$.getGlobalValue(), $hl_prototype_misses$.getGlobalValue());
        if (total.isPositive()) {
            SubLObject hit_ratio = number_utilities.percent(Numbers.divide($hl_prototype_hits$.getGlobalValue(), total), ONE_INTEGER, FOUR_INTEGER);
            PrintLow.format(T, $str19$Ratio____a___, hit_ratio);
            return hit_ratio;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 7300L)
    public static SubLObject clear_hl_prototype_statistics() {
        $hl_prototype_misses$.setGlobalValue(ZERO_INTEGER);
        $hl_prototype_hits$.setGlobalValue(ZERO_INTEGER);
        dictionary.clear_dictionary($hl_prototype_hit_table$.getGlobalValue());
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 7500L)
    public static SubLObject create_hl_prototypical_instances_for_common_collections(SubLObject n, SubLObject dict) {
        if (dict == UNPROVIDED) {
            dict = most_useful_hl_prototypical_instances_dict();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject list_var = n_most_useful_hl_prototype_collections(n, dict);
        SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind($str20$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject col = NIL;
                col = csome_list_var.first();
                while (NIL != csome_list_var) {
                    find_or_create_hl_prototypical_instance(col, T);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    col = csome_list_var.first();
                }
            } finally {
                SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
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

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 7800L)
    public static SubLObject n_most_useful_hl_prototype_collections(SubLObject n, SubLObject dict) {
        if (dict == UNPROVIDED) {
            dict = most_useful_hl_prototypical_instances_dict();
        }
        return list_utilities.first_n(n, Mapping.mapcar(Symbols.symbol_function($sym21$CAR), dictionary_utilities.sort_dictionary_by_values(dict, Symbols.symbol_function($sym22$_))));
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8000L)
    public static SubLObject most_useful_hl_prototypical_instances_dict() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED);
        SubLObject idx = constant_handles.do_constants_table();
        SubLObject mess = $str23$mapping_Cyc_constants;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp(mess) : mess;
        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                SubLObject idx_$5 = idx;
                if (NIL == id_index.id_index_objects_empty_p(idx_$5, $SKIP)) {
                    SubLObject idx_$6 = idx_$5;
                    if (NIL == id_index.id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                        SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                        SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        SubLObject col;
                        for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                            c = Vectors.aref(vector_var, id);
                            if (NIL == id_index.id_index_tombstone_p(c) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(c)) {
                                    c = $SKIP;
                                }
                                col = likely_first_asserted_isa_col(c);
                                if (NIL != col) {
                                    dictionary_utilities.dictionary_increment(dict, col, UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    SubLObject idx_$7 = idx_$5;
                    if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$7) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        SubLObject sparse = id_index.id_index_sparse_objects(idx_$7);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$7);
                        SubLObject end_id = id_index.id_index_next_id(idx_$7);
                        SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            SubLObject c2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(c2)) {
                                SubLObject col2 = likely_first_asserted_isa_col(c2);
                                if (NIL != col2) {
                                    dictionary_utilities.dictionary_increment(dict, col2, UNPROVIDED);
                                }
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, ONE_INTEGER);
                        }
                    }
                }
            } finally {
                SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return dict;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8300L)
    public static SubLObject likely_first_asserted_isa_col(SubLObject v_const) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$anect_mt$.getGlobalValue());
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject gafs = kb_mapping.gather_gaf_arg_index(v_const, ONE_INTEGER, $$isa, NIL, $TRUE);
            SubLObject first_gaf = likely_first_asserted_isa_gaf(gafs);
            SubLObject col = result = (NIL != first_gaf) ? assertions_high.gaf_arg2(first_gaf) : NIL;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8600L)
    public static SubLObject likely_first_asserted_isa_gaf(SubLObject gafs) {
        gafs = list_utilities.remove_if_not($sym27$ASSERTED_ASSERTION_, gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject earliest_gaf = assertion_utilities.earliest_assertion(gafs);
        return (NIL != earliest_gaf) ? earliest_gaf : list_utilities.random_element(gafs);
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8800L)
    public static SubLObject hl_prototype_benchmark_1(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        SubLObject total_time = ZERO_INTEGER;
        SubLObject i;
        SubLObject v_const;
        SubLObject time;
        SubLObject time_var;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = Numbers.add(i, ONE_INTEGER)) {
            v_const = NIL;
            v_const = cyc_kernel.cyc_create_new_permanent($str28$Foo);
            time = NIL;
            time_var = Time.get_internal_real_time();
            cyc_kernel.cyc_assert(listS($$isa, v_const, $list29), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time = Numbers.add(total_time, time);
            cyc_kernel.cyc_kill(v_const);
        }
        return total_time;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8800L)
    public static SubLObject hl_prototype_benchmark_2(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_time = ZERO_INTEGER;
        SubLObject i;
        SubLObject time;
        SubLObject time_var;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = Numbers.add(i, ONE_INTEGER)) {
            kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
            time = NIL;
            time_var = Time.get_internal_real_time();
            cyc_testing_utilities.run_cyc_test_int($SIMPLEST_HYPOTHETICAL, $TERSE, NIL, NIL, $STANDARD, StreamsLow.$standard_output$.getDynamicValue(thread), cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread));
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time = Numbers.add(total_time, time);
        }
        return total_time;
    }

    @SubL(source = "cycl/inference/harness/hl-prototypes.lisp", position = 8800L)
    public static SubLObject hl_prototype_benchmark_3(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        SubLObject total_time = ZERO_INTEGER;
        SubLObject i;
        SubLObject v_const;
        SubLObject time;
        SubLObject time_var;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = Numbers.add(i, ONE_INTEGER)) {
            v_const = NIL;
            v_const = cyc_kernel.cyc_create_new_permanent($str28$Foo);
            time = NIL;
            time_var = Time.get_internal_real_time();
            cyc_kernel.cyc_assert(listS($$isa, v_const, $list33), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time = Numbers.add(total_time, time);
            cyc_kernel.cyc_kill(v_const);
        }
        return total_time;
    }

    public static SubLObject declare_hl_prototypes_file() {
        declareFunction("hl_prototypes_enabledP", "HL-PROTOTYPES-ENABLED?", 0, 0, false);
        declareFunction("hl_prototype_allowed_forward_rules", "HL-PROTOTYPE-ALLOWED-FORWARD-RULES", 1, 0, false);
        declareFunction("hl_prototype_forbidden_forward_rules", "HL-PROTOTYPE-FORBIDDEN-FORWARD-RULES", 1, 0, false);
        declareFunction("hl_prototypical_instance_after_adding", "HL-PROTOTYPICAL-INSTANCE-AFTER-ADDING", 2, 0, false);
        declareFunction("hl_prototypical_instance_after_removing", "HL-PROTOTYPICAL-INSTANCE-AFTER-REMOVING", 2, 0, false);
        declareFunction("clear_the_hl_prototype_ke_irrelevant_rule", "CLEAR-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
        declareFunction("remove_the_hl_prototype_ke_irrelevant_rule", "REMOVE-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
        declareFunction("the_hl_prototype_ke_irrelevant_rule_internal", "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-INTERNAL", 0, 0, false);
        declareFunction("the_hl_prototype_ke_irrelevant_rule", "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
        declareFunction("relevant_hl_prototype_rules", "RELEVANT-HL-PROTOTYPE-RULES", 1, 0, false);
        declareFunction("clear_hl_prototype_caches", "CLEAR-HL-PROTOTYPE-CACHES", 0, 0, false);
        declareFunction("possibly_hl_prototype_assertionP", "POSSIBLY-HL-PROTOTYPE-ASSERTION?", 1, 0, false);
        declareFunction("find_or_create_hl_prototypical_instance", "FIND-OR-CREATE-HL-PROTOTYPICAL-INSTANCE", 1, 1, false);
        declareFunction("hl_prototypical_instance", "HL-PROTOTYPICAL-INSTANCE", 1, 0, false);
        declareFunction("create_hl_prototypical_instance", "CREATE-HL-PROTOTYPICAL-INSTANCE", 1, 1, false);
        declareFunction("hl_prototypical_instance_name", "HL-PROTOTYPICAL-INSTANCE-NAME", 1, 0, false);
        declareFunction("hl_prototype_collections", "HL-PROTOTYPE-COLLECTIONS", 0, 0, false);
        declareFunction("hl_prototypical_collection", "HL-PROTOTYPICAL-COLLECTION", 1, 0, false);
        declareFunction("hl_prototypical_instanceP", "HL-PROTOTYPICAL-INSTANCE?", 1, 0, false);
        declareFunction("show_hl_prototype_statistics", "SHOW-HL-PROTOTYPE-STATISTICS", 0, 0, false);
        declareFunction("clear_hl_prototype_statistics", "CLEAR-HL-PROTOTYPE-STATISTICS", 0, 0, false);
        declareFunction("create_hl_prototypical_instances_for_common_collections", "CREATE-HL-PROTOTYPICAL-INSTANCES-FOR-COMMON-COLLECTIONS", 1, 1, false);
        declareFunction("n_most_useful_hl_prototype_collections", "N-MOST-USEFUL-HL-PROTOTYPE-COLLECTIONS", 1, 1, false);
        declareFunction("most_useful_hl_prototypical_instances_dict", "MOST-USEFUL-HL-PROTOTYPICAL-INSTANCES-DICT", 0, 0, false);
        declareFunction("likely_first_asserted_isa_col", "LIKELY-FIRST-ASSERTED-ISA-COL", 1, 0, false);
        declareFunction("likely_first_asserted_isa_gaf", "LIKELY-FIRST-ASSERTED-ISA-GAF", 1, 0, false);
        declareFunction("hl_prototype_benchmark_1", "HL-PROTOTYPE-BENCHMARK-1", 0, 1, false);
        declareFunction("hl_prototype_benchmark_2", "HL-PROTOTYPE-BENCHMARK-2", 0, 1, false);
        declareFunction("hl_prototype_benchmark_3", "HL-PROTOTYPE-BENCHMARK-3", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_hl_prototypes_file() {
        $hl_prototypes_enabledP$ = defparameter("*HL-PROTOTYPES-ENABLED?*", T);
        $gather_hl_prototype_statisticsP$ = defparameter("*GATHER-HL-PROTOTYPE-STATISTICS?*", T);
        $hl_prototype_hits$ = deflexical("*HL-PROTOTYPE-HITS*", (maybeDefault($sym0$_HL_PROTOTYPE_HITS_, $hl_prototype_hits$, ZERO_INTEGER)));
        $hl_prototype_hit_table$ = deflexical("*HL-PROTOTYPE-HIT-TABLE*", maybeDefault($sym1$_HL_PROTOTYPE_HIT_TABLE_, $hl_prototype_hit_table$, () -> (dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED))));
        $hl_prototype_misses$ = deflexical("*HL-PROTOTYPE-MISSES*", (maybeDefault($sym2$_HL_PROTOTYPE_MISSES_, $hl_prototype_misses$, ZERO_INTEGER)));
        $the_hl_prototype_ke_irrelevant_rule_caching_state$ = SubLFiles.deflexical("*THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_hl_prototypes_file() {
        subl_macro_promotions.declare_defglobal($sym0$_HL_PROTOTYPE_HITS_);
        subl_macro_promotions.declare_defglobal($sym1$_HL_PROTOTYPE_HIT_TABLE_);
        subl_macro_promotions.declare_defglobal($sym2$_HL_PROTOTYPE_MISSES_);
        utilities_macros.register_kb_function($sym3$HL_PROTOTYPICAL_INSTANCE_AFTER_ADDING);
        utilities_macros.register_kb_function($sym4$HL_PROTOTYPICAL_INSTANCE_AFTER_REMOVING);
        memoization_state.note_globally_cached_function($sym5$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE);
        return NIL;
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
        me = new hl_prototypes();
        $hl_prototypes_enabledP$ = null;
        $gather_hl_prototype_statisticsP$ = null;
        $hl_prototype_hits$ = null;
        $hl_prototype_hit_table$ = null;
        $hl_prototype_misses$ = null;
        $the_hl_prototype_ke_irrelevant_rule_caching_state$ = null;
        $sym0$_HL_PROTOTYPE_HITS_ = makeSymbol("*HL-PROTOTYPE-HITS*");
        $sym1$_HL_PROTOTYPE_HIT_TABLE_ = makeSymbol("*HL-PROTOTYPE-HIT-TABLE*");
        $sym2$_HL_PROTOTYPE_MISSES_ = makeSymbol("*HL-PROTOTYPE-MISSES*");
        $sym3$HL_PROTOTYPICAL_INSTANCE_AFTER_ADDING = makeSymbol("HL-PROTOTYPICAL-INSTANCE-AFTER-ADDING");
        $sym4$HL_PROTOTYPICAL_INSTANCE_AFTER_REMOVING = makeSymbol("HL-PROTOTYPICAL-INSTANCE-AFTER-REMOVING");
        $sym5$THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE = makeSymbol("THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE");
        $$quotedIsa = makeConstSym(("quotedIsa"));
        $list7 = list(makeConstSym(("HLPrototypicalTerm")));
        $$keIrrelevantTerm = makeConstSym(("keIrrelevantTerm"));
        $$UniversalVocabularyMt = makeConstSym(("UniversalVocabularyMt"));
        $sym10$_THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE_CACHING_STATE_ = makeSymbol("*THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-CACHING-STATE*");
        $$isa = makeConstSym(("isa"));
        $$hlPrototypicalInstance = makeConstSym(("hlPrototypicalInstance"));
        $sym13$QUEUE_P = makeSymbol("QUEUE-P");
        $ALL = makeKeyword("ALL");
        $str15$ThePrototypical = makeString("ThePrototypical");
        $sym16$GAF_ARG2 = makeSymbol("GAF-ARG2");
        $str17$Hits_____a__ = makeString("Hits:   ~a~%");
        $str18$Misses___a__ = makeString("Misses: ~a~%");
        $str19$Ratio____a___ = makeString("Ratio:  ~a%~%");
        $str20$cdolist = makeString("cdolist");
        $sym21$CAR = makeSymbol("CAR");
        $sym22$_ = makeSymbol(">");
        $str23$mapping_Cyc_constants = makeString("mapping Cyc constants");
        $sym24$STRINGP = makeSymbol("STRINGP");
        $SKIP = makeKeyword("SKIP");
        $TRUE = makeKeyword("TRUE");
        $sym27$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");
        $str28$Foo = makeString("Foo");
        $list29 = list(makeConstSym(("Individual")));
        $SIMPLEST_HYPOTHETICAL = makeKeyword("SIMPLEST-HYPOTHETICAL");
        $TERSE = makeKeyword("TERSE");
        $STANDARD = makeKeyword("STANDARD");
        $list33 = list(makeConstSym(("Person")));
    }
}
/*
 *
 * Total time: 205 ms
 *
 */