package com.cyc.cycjava.cycl.sksi.query_sks;


import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.sunit_external;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.$expensive_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVENTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_query_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_query_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities";

    public static final String myFingerPrint = "8432e58c748b87291a29795069ef7f7597e7f234e5cff3094ac06489aa73389b";

    // deflexical
    private static final SubLSymbol $sksi_query_history_limit$ = makeSymbol("*SKSI-QUERY-HISTORY-LIMIT*");



    // defparameter
    /**
     * Is set to T within the SKSI query code when we know we do not want to record
     * a cost due to connection error, running with the source disabled, etc. Used
     * from GENERATE-SKSI-SINGLE-LITERAL-COST-RECORDING-ITERATOR and
     * REMOVAL-SKSI-CONJUNCTION-POS-LITS-OUTPUT-GENERATE.
     */
    public static final SubLSymbol $sksi_cost_recording_suspended_for_current_iteratorP$ = makeSymbol("*SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR?*");

    // deflexical
    public static final SubLSymbol $sksi_default_query_cost$ = makeSymbol("*SKSI-DEFAULT-QUERY-COST*");

    private static final SubLSymbol $sksi_query_costs$ = makeSymbol("*SKSI-QUERY-COSTS*");

    private static final SubLSymbol SKSI_COST_REFORMAT_PROBLEM_QUERY = makeSymbol("SKSI-COST-REFORMAT-PROBLEM-QUERY");





    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol NEUTRALIZE_QUERY_CLAUSE = makeSymbol("NEUTRALIZE-QUERY-CLAUSE");

    private static final SubLList $list6 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    private static final SubLSymbol NEUTRALIZE_LITERAL = makeSymbol("NEUTRALIZE-LITERAL");





    private static final SubLSymbol $sym10$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    private static final SubLString $str11$__logicalResultSetCardinalityWRTV = makeString("#$logicalResultSetCardinalityWRTValue does not yet support multiple bound fields: ~A");







    private static final SubLString $str15$Attempted_to_suspend_SKSI_cost_re = makeString("Attempted to suspend SKSI cost recording when not in a known SKSI cost recording context (single or multiple literal removal.)");



    private static final SubLSymbol SKSI_COST_RECORDING_ITERATOR_NEXT = makeSymbol("SKSI-COST-RECORDING-ITERATOR-NEXT");

    private static final SubLSymbol SKSI_COST_RECORDING_ITERATOR_DONE = makeSymbol("SKSI-COST-RECORDING-ITERATOR-DONE");

    private static final SubLSymbol SKSI_COST_RECORDING_ITERATOR_FINALIZE = makeSymbol("SKSI-COST-RECORDING-ITERATOR-FINALIZE");

    private static final SubLList $list20 = list(makeSymbol("ITERATOR"), makeSymbol("SKS"));

    private static final SubLSymbol SKSI_COST_RECORDING_ITERATOR_P = makeSymbol("SKSI-COST-RECORDING-ITERATOR-P");

    private static final SubLSymbol SKSI_UNREFORMULATABLE_P = makeSymbol("SKSI-UNREFORMULATABLE-P");





    private static final SubLSymbol SKSI_POS_SENTENCE_COST = makeSymbol("SKSI-POS-SENTENCE-COST");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));





    private static final SubLSymbol SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P = makeSymbol("SKSI-COMPARISON-LITERAL-SUPPORTED-PREDICATE-P");

    private static final SubLSymbol COMPARISON_LITERAL_P = makeSymbol("COMPARISON-LITERAL-P");

    private static final SubLSymbol SKSI_UNKNOWN_SENTENCE_LITERAL_P = makeSymbol("SKSI-UNKNOWN-SENTENCE-LITERAL-P");

    private static final SubLObject $$sksiUnknownSentence = reader_make_constant_shell(makeString("sksiUnknownSentence"));

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLSymbol $SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL = makeKeyword("SKSI-MISSING-PHYSICAL-FIELD-FOR-INDEXICAL");

    private static final SubLSymbol SK_SOURCES_FOR_PHYSICAL_SCHEMA = makeSymbol("SK-SOURCES-FOR-PHYSICAL-SCHEMA");

    private static final SubLSymbol LFI_ALIAS_FN_NAUT_P = makeSymbol("LFI-ALIAS-FN-NAUT-P");



    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$CSQLAnd = reader_make_constant_shell(makeString("CSQLAnd"));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$CSQLOr = reader_make_constant_shell(makeString("CSQLOr"));

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLObject $$CSQLNot = reader_make_constant_shell(makeString("CSQLNot"));

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLObject $$equiv = reader_make_constant_shell(makeString("equiv"));

    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    private static final SubLSymbol $SKSI_MISSING_ENCODINGS = makeKeyword("SKSI-MISSING-ENCODINGS");





    private static final SubLSymbol $SKSI_MISSING_DECODINGS = makeKeyword("SKSI-MISSING-DECODINGS");

    private static final SubLSymbol DECODING_PHYSICAL_FIELD_INDEXICALS_ORDERED = makeSymbol("DECODING-PHYSICAL-FIELD-INDEXICALS-ORDERED");



    private static final SubLSymbol LFI_FORT_FOR_LFI = makeSymbol("LFI-FORT-FOR-LFI");

    private static final SubLObject $$Time_Quantity = reader_make_constant_shell(makeString("Time-Quantity"));

    private static final SubLObject $$CSQLSecondsDurationFn = reader_make_constant_shell(makeString("CSQLSecondsDurationFn"));

    private static final SubLObject $$CSQLMonthsDurationFn = reader_make_constant_shell(makeString("CSQLMonthsDurationFn"));

    private static final SubLObject $$CSQLYearsDurationFn = reader_make_constant_shell(makeString("CSQLYearsDurationFn"));

    private static final SubLString $str61$__SKSI__A_ = makeString("~&SKSI-~A ");

    private static final SubLString $str62$SKSI_could_not_convert___Time_Qua = makeString("SKSI could not convert #$Time-Quantity ~S");

    private static final SubLObject $$QuantityConversionFn = reader_make_constant_shell(makeString("QuantityConversionFn"));

    private static final SubLObject $$CSQLTimesFn = reader_make_constant_shell(makeString("CSQLTimesFn"));

    private static final SubLSymbol PHYSICAL_FIELD_INDEXICAL_P = makeSymbol("PHYSICAL-FIELD-INDEXICAL-P");



    private static final SubLSymbol PFI_ALIAS_FN_NAUT_P = makeSymbol("PFI-ALIAS-FN-NAUT-P");

    private static final SubLSymbol CONTEXTUALIZED_ASENT_ASENT = makeSymbol("CONTEXTUALIZED-ASENT-ASENT");

    private static final SubLList $list69 = list(makeSymbol("FIELD-ENCODING"), makeSymbol("PF-INDEXICAL"));



    private static final SubLSymbol CADADR = makeSymbol("CADADR");



    private static final SubLList $list73 = list(makeSymbol("LEFT-PFI-LIST"), makeSymbol("RIGHT-PFI-LIST"));

    private static final SubLSymbol BINARY_PREDICATE_MEMOIZED = makeSymbol("BINARY-PREDICATE-MEMOIZED");

    private static final SubLSymbol $SKSI_LIST_LENGTH_MISMATCH = makeKeyword("SKSI-LIST-LENGTH-MISMATCH");

    private static final SubLSymbol CSQL_DISJOIN_EXPRESSIONS = makeSymbol("CSQL-DISJOIN-EXPRESSIONS");

    private static final SubLSymbol CSQL_CONJOIN_EXPRESSIONS = makeSymbol("CSQL-CONJOIN-EXPRESSIONS");

    private static final SubLString $$$SKSI_Query_Utilities_Category = makeString("SKSI Query Utilities Category");

    private static final SubLString $$$SKSI_Category = makeString("SKSI Category");

    public static SubLObject register_combined_sksi_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject add_to_allowed_ksesP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (add_to_allowed_ksesP == UNPROVIDED) {
            add_to_allowed_ksesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = NIL;
        SubLObject pm_count = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                thread.resetMultipleValues();
                final SubLObject rm_count_$1 = sksi_removal_module_generation.register_sksi_removal_modules_for_sks(sks, mapping_mt, T, NIL);
                final SubLObject pm_count_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                rm_count = rm_count_$1;
                pm_count = pm_count_$2;
                rm_count = add(new SubLObject[]{ rm_count, sksi_conjunctive_removal_module_generation.register_sksi_conjunctive_removal_modules_for_sks(sks, mapping_mt, UNPROVIDED), corba_module_utilities.register_sksi_corba_modules_for_sks(sks, mapping_mt, UNPROVIDED), sksi_sparql_removal_module_generation.register_sksi_sparql_removal_modules_for_sks(sks, mapping_mt, UNPROVIDED) });
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (NIL != add_to_allowed_ksesP) {
            sksi_infrastructure_utilities.add_to_external_sources_activated_in_image(sks, UNPROVIDED);
        }
        return values(rm_count, pm_count);
    }

    public static SubLObject deregister_combined_sksi_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject remove_from_allowed_ksesP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (remove_from_allowed_ksesP == UNPROVIDED) {
            remove_from_allowed_ksesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = NIL;
        SubLObject pm_count = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                thread.resetMultipleValues();
                final SubLObject rm_count_$4 = sksi_removal_module_generation.deregister_sksi_removal_modules_for_sks(sks, mapping_mt, UNPROVIDED, UNPROVIDED);
                final SubLObject pm_count_$5 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                rm_count = rm_count_$4;
                pm_count = pm_count_$5;
                rm_count = add(new SubLObject[]{ rm_count, sksi_conjunctive_removal_module_generation.deregister_sksi_conjunctive_removal_modules_for_sks(sks, mapping_mt, UNPROVIDED), corba_module_utilities.deregister_sksi_corba_modules_for_sks(sks, mapping_mt, UNPROVIDED), sksi_sparql_removal_module_generation.deregister_sksi_sparql_removal_modules_for_just_sks(sks, mapping_mt) });
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (NIL != remove_from_allowed_ksesP) {
            sksi_infrastructure_utilities.remove_from_external_sources_activated_in_image(sks, UNPROVIDED);
        }
        return values(rm_count, pm_count);
    }

    public static SubLObject deregister_all_combined_sksi_removal_modules(SubLObject clear_allowed_ksesP) {
        if (clear_allowed_ksesP == UNPROVIDED) {
            clear_allowed_ksesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = NIL;
        SubLObject pm_count = NIL;
        thread.resetMultipleValues();
        final SubLObject rm_count_$7 = sksi_removal_module_generation.deregister_all_sksi_removal_modules();
        final SubLObject pm_count_$8 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        rm_count = rm_count_$7;
        pm_count = pm_count_$8;
        rm_count = add(new SubLObject[]{ rm_count, sksi_conjunctive_removal_module_generation.deregister_all_sksi_conjunctive_removal_modules(), corba_module_utilities.deregister_all_sksi_corba_modules(), sksi_sparql_removal_module_generation.deregister_all_sksi_sparql_removal_modules() });
        if (NIL != clear_allowed_ksesP) {
            sksi_infrastructure_utilities.clear_external_sources_activated_in_image();
        }
        return values(rm_count, pm_count);
    }

    public static SubLObject combined_sksi_removal_modules_count() {
        return add(new SubLObject[]{ sksi_removal_module_generation.sksi_modules_count(), sksi_conjunctive_removal_module_generation.sksi_conjunctive_removal_modules_count(), corba_module_utilities.sksi_corba_modules_count(), sksi_sparql_removal_module_generation.sksi_sparql_removal_modules_count() });
    }

    public static SubLObject some_sksi_removal_module_registeredP() {
        return makeBoolean((((NIL != sksi_removal_module_generation.some_sksi_single_literal_removal_module_registeredP()) || (NIL != sksi_conjunctive_removal_module_generation.some_sksi_conjunctive_removal_module_registeredP())) || (NIL != corba_module_utilities.some_sksi_corba_removal_module_registeredP())) || (NIL != sksi_sparql_removal_module_generation.some_sksi_sparql_removal_modules_registeredP()));
    }

    public static SubLObject clear_sksi_query_costs() {
        return dictionary.clear_dictionary($sksi_query_costs$.getGlobalValue());
    }

    public static SubLObject look_up_sksi_query_information(final SubLObject query, final SubLObject sks) {
        return dictionary.dictionary_lookup($sksi_query_costs$.getGlobalValue(), list(query, sks), UNPROVIDED);
    }

    public static SubLObject look_up_sksi_query_cost(final SubLObject query, final SubLObject sks, final SubLObject guess_costP) {
        SubLObject query_info = look_up_sksi_query_information(query, sks);
        if ((NIL == query_info) && (NIL != guess_costP)) {
            final SubLObject neutral_query = neutralize_query(query);
            query_info = look_up_sksi_query_information(neutral_query, sks);
        }
        if (NIL != query_info) {
            SubLObject sum = ZERO_INTEGER;
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = query_info;
            SubLObject cost = NIL;
            cost = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sum = add(sum, cost);
                count = add(count, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                cost = cdolist_list_var.first();
            } 
            return divide(sum, count);
        }
        return NIL;
    }

    public static SubLObject look_up_sksi_query_cost_problem_query(final SubLObject problem_query, final SubLObject sks, SubLObject guess_costP) {
        if (guess_costP == UNPROVIDED) {
            guess_costP = T;
        }
        final SubLObject query = sksi_cost_reformat_problem_query(problem_query);
        return look_up_sksi_query_cost(query, sks, guess_costP);
    }

    public static SubLObject look_up_sksi_query_cost_contextualized_dnf(final SubLObject contextualized_dnf, final SubLObject sks, SubLObject guess_costP) {
        if (guess_costP == UNPROVIDED) {
            guess_costP = T;
        }
        final SubLObject query = sksi_cost_reformat_contextualized_dnf(contextualized_dnf);
        return look_up_sksi_query_cost(query, sks, guess_costP);
    }

    public static SubLObject look_up_sksi_query_cost_asent_sense(final SubLObject asent, final SubLObject sense, final SubLObject sks, SubLObject guess_costP) {
        if (guess_costP == UNPROVIDED) {
            guess_costP = T;
        }
        final SubLObject query = sksi_cost_reformat_asent_sense(asent, sense);
        SubLObject cost = look_up_sksi_query_cost(query, sks, guess_costP);
        if (NIL == cost) {
            cost = sksi_sentence_cost(asent, sense, sks);
        }
        return cost;
    }

    public static SubLObject update_sksi_query_cost(final SubLObject query, final SubLObject sks, SubLObject cost, SubLObject replace_historical_costsP) {
        if (replace_historical_costsP == UNPROVIDED) {
            replace_historical_costsP = NIL;
        }
        if (cost.isZero()) {
            cost = $cheap_hl_module_check_cost$.getGlobalValue();
        }
        final SubLObject query_info = look_up_sksi_query_information(query, sks);
        final SubLObject neutral_query = neutralize_query(query);
        final SubLObject neutral_query_info = look_up_sksi_query_information(neutral_query, sks);
        if (NIL != query_info) {
            SubLObject new_query_info = (NIL != replace_historical_costsP) ? list(cost) : cons(cost, query_info);
            if (NIL != list_utilities.lengthG(new_query_info, $sksi_query_history_limit$.getGlobalValue(), UNPROVIDED)) {
                new_query_info = list_utilities.first_n($sksi_query_history_limit$.getGlobalValue(), new_query_info);
            }
            dictionary.dictionary_enter($sksi_query_costs$.getGlobalValue(), list(query, sks), new_query_info);
        } else {
            dictionary.dictionary_enter($sksi_query_costs$.getGlobalValue(), list(query, sks), list(cost));
        }
        if (NIL != neutral_query_info) {
            SubLObject new_query_info = (NIL != replace_historical_costsP) ? list(cost) : cons(cost, neutral_query_info);
            if (NIL != list_utilities.lengthG(new_query_info, $sksi_query_history_limit$.getGlobalValue(), UNPROVIDED)) {
                new_query_info = list_utilities.first_n($sksi_query_history_limit$.getGlobalValue(), new_query_info);
            }
            dictionary.dictionary_enter($sksi_query_costs$.getGlobalValue(), list(neutral_query, sks), new_query_info);
        } else {
            dictionary.dictionary_enter($sksi_query_costs$.getGlobalValue(), list(neutral_query, sks), list(cost));
        }
        return T;
    }

    public static SubLObject update_sksi_query_cost_problem_query(final SubLObject problem_query, final SubLObject sks, final SubLObject cost) {
        final SubLObject query = sksi_cost_reformat_problem_query(problem_query);
        return update_sksi_query_cost(query, sks, cost, UNPROVIDED);
    }

    public static SubLObject update_sksi_query_cost_contextualized_dnf(final SubLObject contextualized_dnf, final SubLObject sks, final SubLObject cost) {
        final SubLObject query = sksi_cost_reformat_contextualized_dnf(contextualized_dnf);
        return update_sksi_query_cost(query, sks, cost, UNPROVIDED);
    }

    public static SubLObject update_sksi_query_cost_asent_sense(final SubLObject asent, final SubLObject sense, final SubLObject sks, final SubLObject cost) {
        final SubLObject query = sksi_cost_reformat_asent_sense(asent, sense);
        return update_sksi_query_cost(query, sks, cost, UNPROVIDED);
    }

    public static SubLObject sksi_cost_reformat_problem_query_internal(final SubLObject problem_query) {
        final SubLObject new_problem_query = Mapping.mapcar(symbol_function(FIRST), czer_main.rename_clauses_vars_safe(copy_clauses(problem_query)));
        return clause_utilities.decontextualize_contextualized_clauses(new_problem_query);
    }

    public static SubLObject sksi_cost_reformat_problem_query(final SubLObject problem_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_cost_reformat_problem_query_internal(problem_query);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_COST_REFORMAT_PROBLEM_QUERY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_COST_REFORMAT_PROBLEM_QUERY, ONE_INTEGER, $int$1000, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_COST_REFORMAT_PROBLEM_QUERY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, problem_query, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_cost_reformat_problem_query_internal(problem_query)));
            memoization_state.caching_state_put(caching_state, problem_query, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sksi_cost_reformat_contextualized_dnf(final SubLObject contextualized_dnf) {
        final SubLObject problem_query = inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(contextualized_dnf);
        return sksi_cost_reformat_problem_query(problem_query);
    }

    public static SubLObject sksi_cost_reformat_asent_sense(final SubLObject asent, final SubLObject sense) {
        final SubLObject casent = inference_datastructures_problem_query.make_contextualized_asent($$BaseKB, asent);
        final SubLObject problem_query = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(casent, sense);
        return sksi_cost_reformat_problem_query(problem_query);
    }

    public static SubLObject neutralize_query(final SubLObject query) {
        return Mapping.mapcar(NEUTRALIZE_QUERY_CLAUSE, query);
    }

    public static SubLObject neutralize_query_clause(final SubLObject query_clause) {
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(query_clause, query_clause, $list6);
        neg_lits = query_clause.first();
        SubLObject current = query_clause.rest();
        destructuring_bind_must_consp(current, query_clause, $list6);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(Mapping.mapcar(NEUTRALIZE_LITERAL, neg_lits), Mapping.mapcar(NEUTRALIZE_LITERAL, pos_lits));
        }
        cdestructuring_bind_error(query_clause, $list6);
        return NIL;
    }

    public static SubLObject neutralize_literal(final SubLObject lit) {
        return cons(lit.first(), list_utilities.substitute_if_not($FULLY_BOUND, VARIABLE_P, lit.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject guess_cost_from_lrs_cardinality_gafs(final SubLObject select_fields, final SubLObject where_fields, final SubLObject lrs_cardinality_gafs) {
        SubLObject cdolist_list_var = lrs_cardinality_gafs;
        SubLObject lrs_cardinality_gaf = NIL;
        lrs_cardinality_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject bound_fields = extensional_set_elements(sksi_kb_accessors.logical_result_set_cardinality_gaf_bound_fields_set(lrs_cardinality_gaf));
            final SubLObject unbound_fields = extensional_set_elements(sksi_kb_accessors.logical_result_set_cardinality_gaf_unbound_fields_set(lrs_cardinality_gaf));
            if ((NIL != list_utilities.sets_equalP(where_fields, bound_fields, symbol_function(EQUAL))) && (NIL != list_utilities.sets_equalP(select_fields, unbound_fields, symbol_function(EQUAL)))) {
                return sksi_kb_accessors.logical_result_set_cardinality_gaf_cost_expression(lrs_cardinality_gaf);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lrs_cardinality_gaf = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject guess_cost_from_rs_cardinality_gafs(final SubLObject select_fields, final SubLObject where_fields, final SubLObject rs_cardinality_gafs, SubLObject select_test, SubLObject where_test, SubLObject cycl_for_where_expression) {
        if (select_test == UNPROVIDED) {
            select_test = $sym10$SETS_EQUAL_;
        }
        if (where_test == UNPROVIDED) {
            where_test = $sym10$SETS_EQUAL_;
        }
        if (cycl_for_where_expression == UNPROVIDED) {
            cycl_for_where_expression = NIL;
        }
        SubLObject exact_matchP = NIL;
        SubLObject cost = NIL;
        if (NIL == exact_matchP) {
            SubLObject csome_list_var = rs_cardinality_gafs;
            SubLObject rs_cardinality_gaf = NIL;
            rs_cardinality_gaf = csome_list_var.first();
            while ((NIL == exact_matchP) && (NIL != csome_list_var)) {
                final SubLObject bound_fields = extensional_set_elements(sksi_kb_accessors.result_set_cardinality_gaf_bound_fields_set(rs_cardinality_gaf));
                final SubLObject unbound_fields = extensional_set_elements(sksi_kb_accessors.result_set_cardinality_gaf_unbound_fields_set(rs_cardinality_gaf));
                if (((NIL != list_utilities.sets_equalP(where_fields, bound_fields, symbol_function(EQUAL))) && (NIL != list_utilities.sets_equalP(select_fields, unbound_fields, symbol_function(EQUAL)))) && ((NIL == cycl_for_where_expression) || (NIL != czer_utilities.equals_elP(cycl_for_where_expression, sksi_kb_accessors.result_set_cardinality_gaf_constraints(rs_cardinality_gaf), UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                    exact_matchP = T;
                    cost = sksi_kb_accessors.result_set_cardinality_gaf_cost_expression(rs_cardinality_gaf);
                } else
                    if (((((select_test != $sym10$SETS_EQUAL_) || (where_test != $sym10$SETS_EQUAL_)) && (NIL != funcall(where_test, where_fields, bound_fields, symbol_function(EQUAL)))) && (NIL != funcall(select_test, select_fields, unbound_fields, symbol_function(EQUAL)))) && ((NIL == cycl_for_where_expression) || (NIL != czer_utilities.equals_elP(cycl_for_where_expression, sksi_kb_accessors.result_set_cardinality_gaf_constraints(rs_cardinality_gaf), UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                        final SubLObject this_cost = sksi_kb_accessors.result_set_cardinality_gaf_cost_expression(rs_cardinality_gaf);
                        if (this_cost.isNumber() && cost.isNumber()) {
                            cost = min(this_cost, cost);
                        } else {
                            cost = this_cost;
                        }
                    }

                csome_list_var = csome_list_var.rest();
                rs_cardinality_gaf = csome_list_var.first();
            } 
        }
        return cost;
    }

    public static SubLObject cache_cost_from_lrs_cardinality_wrt_value_gafs(final SubLObject sentence, final SubLObject select_fields, final SubLObject where_fields, final SubLObject lrs_cardinality_wrt_value_gafs, final SubLObject sk_source) {
        SubLObject cdolist_list_var = lrs_cardinality_wrt_value_gafs;
        SubLObject lrs_cardinality_wrt_value_gaf = NIL;
        lrs_cardinality_wrt_value_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject bound_fields = extensional_set_elements(sksi_kb_accessors.logical_result_set_cardinality_wrt_value_gaf_bound_fields_set(lrs_cardinality_wrt_value_gaf));
            final SubLObject unbound_fields = extensional_set_elements(sksi_kb_accessors.logical_result_set_cardinality_wrt_value_gaf_unbound_fields_set(lrs_cardinality_wrt_value_gaf));
            if (NIL == list_utilities.singletonP(bound_fields)) {
                Errors.warn($str11$__logicalResultSetCardinalityWRTV, lrs_cardinality_wrt_value_gaf);
                return NIL;
            }
            if ((NIL != list_utilities.sets_equalP(where_fields, bound_fields, symbol_function(EQUAL))) && (NIL != list_utilities.sets_equalP(select_fields, unbound_fields, symbol_function(EQUAL)))) {
                final SubLObject value = sksi_kb_accessors.logical_result_set_cardinality_wrt_value_gaf_value(lrs_cardinality_wrt_value_gaf);
                final SubLObject cost = sksi_kb_accessors.logical_result_set_cardinality_wrt_value_gaf_cost_expression(lrs_cardinality_wrt_value_gaf);
                SubLObject cost_sentence = sentence;
                SubLObject list_var = NIL;
                SubLObject unbound_field = NIL;
                SubLObject n = NIL;
                list_var = unbound_fields;
                unbound_field = list_var.first();
                for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , unbound_field = list_var.first() , n = add(ONE_INTEGER, n)) {
                    final SubLObject unbound_field_indexical = sksi_kb_accessors.indexical_for_logical_field(unbound_field);
                    cost_sentence = list_utilities.tree_substitute(cost_sentence, unbound_field_indexical, variables.get_variable(n));
                }
                cost_sentence = list_utilities.tree_substitute(cost_sentence, sksi_kb_accessors.indexical_for_logical_field(bound_fields.first()), value);
                update_sksi_query_cost(sksi_cost_reformat_asent_sense(cost_sentence, $POS), sk_source, cost, T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lrs_cardinality_wrt_value_gaf = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_cost_recording_suspended_for_current_iteratorP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($sksi_cost_recording_suspended_for_current_iteratorP$.getDynamicValue(thread), $SUSPENDED);
    }

    public static SubLObject sksi_cost_recording_suspended_for_current_iterator_initial_state() {
        return $IN_PROGRESS;
    }

    public static SubLObject sksi_suspend_cost_recording_for_current_iterator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($sksi_cost_recording_suspended_for_current_iteratorP$.getDynamicValue(thread) == $IN_PROGRESS) {
            $sksi_cost_recording_suspended_for_current_iteratorP$.setDynamicValue($SUSPENDED, thread);
        } else {
            Errors.warn($str15$Attempted_to_suspend_SKSI_cost_re);
        }
        return NIL;
    }

    public static SubLObject generate_sksi_conjunctive_cost_recording_iterator(final SubLObject result_set_iterators, final SubLObject sks) {
        final SubLObject pcase_var = length(result_set_iterators);
        if (pcase_var.eql(ZERO_INTEGER)) {
            update_sksi_query_cost_store_for_current_tactic(sks);
            return NIL;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return new_sksi_cost_recording_iterator(result_set_iterators.first(), sks);
        }
        return new_sksi_cost_recording_iterator(iteration.new_iterator_iterator(result_set_iterators), sks);
    }

    public static SubLObject generate_sksi_single_literal_cost_recording_iterator(final SubLObject csql, final SubLObject sks, SubLObject content_mt, SubLObject start_row, SubLObject end_row, SubLObject translation_style) {
        if (content_mt == UNPROVIDED) {
            content_mt = NIL;
        }
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        if (translation_style == UNPROVIDED) {
            translation_style = $NORMAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $sksi_cost_recording_suspended_for_current_iteratorP$.currentBinding(thread);
        try {
            $sksi_cost_recording_suspended_for_current_iteratorP$.bind(sksi_cost_recording_suspended_for_current_iterator_initial_state(), thread);
            final SubLObject iterator = sksi_sks_interaction.generate_iterator_from_csql(csql, sks, content_mt, start_row, end_row, translation_style);
            if (NIL != iteration.iterator_p(iterator)) {
                if (NIL != sksi_cost_recording_suspended_for_current_iteratorP()) {
                    result = iterator;
                } else {
                    result = new_sksi_cost_recording_iterator(iterator, sks);
                }
            } else {
                if (NIL == sksi_cost_recording_suspended_for_current_iteratorP()) {
                    update_sksi_query_cost_store_for_current_tactic(sks);
                }
                result = iterator;
            }
        } finally {
            $sksi_cost_recording_suspended_for_current_iteratorP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sksi_cost_recording_iterator_p(final SubLObject v_object) {
        return makeBoolean((NIL != iteration.iterator_p(v_object)) && (iteration.iteration_next_peek(v_object) == SKSI_COST_RECORDING_ITERATOR_NEXT));
    }

    public static SubLObject new_sksi_cost_recording_iterator(final SubLObject iterator, final SubLObject sks) {
        return NIL != iteration.iterator_p(iterator) ? iteration.new_iterator(list(iterator, sks), SKSI_COST_RECORDING_ITERATOR_DONE, SKSI_COST_RECORDING_ITERATOR_NEXT, SKSI_COST_RECORDING_ITERATOR_FINALIZE) : NIL;
    }

    public static SubLObject sksi_cost_recording_iterator_done(final SubLObject state) {
        SubLObject iterator = NIL;
        SubLObject sks = NIL;
        destructuring_bind_must_consp(state, state, $list20);
        iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list20);
        sks = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_done(iterator);
        }
        cdestructuring_bind_error(state, $list20);
        return NIL;
    }

    public static SubLObject sksi_cost_recording_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterator = NIL;
        SubLObject sks = NIL;
        destructuring_bind_must_consp(state, state, $list20);
        iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list20);
        sks = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject premature_endP = iteration.iteration_done(iterator);
            SubLObject next = NIL;
            SubLObject valid_nextP = NIL;
            while ((NIL == valid_nextP) && (NIL == premature_endP)) {
                thread.resetMultipleValues();
                final SubLObject value = iteration.iteration_next(iterator);
                final SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != validP) {
                    next = value;
                    valid_nextP = T;
                } else {
                    premature_endP = iteration.iteration_done(iterator);
                }
            } 
            return values(next, state, premature_endP);
        }
        cdestructuring_bind_error(state, $list20);
        return NIL;
    }

    public static SubLObject sksi_cost_recording_iterator_finalize(final SubLObject state) {
        SubLObject result = NIL;
        SubLObject iterator = NIL;
        SubLObject sks = NIL;
        destructuring_bind_must_consp(state, state, $list20);
        iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list20);
        sks = current.first();
        current = current.rest();
        if (NIL == current) {
            try {
                update_sksi_query_cost_store_for_current_tactic(sks);
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    result = iteration.iteration_finalize(iterator);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        } else {
            cdestructuring_bind_error(state, $list20);
        }
        return result;
    }

    public static SubLObject update_sksi_query_cost_store_for_current_tactic(final SubLObject sks) {
        final SubLObject tactic = inference_worker.currently_executing_tactic();
        if (NIL != inference_datastructures_tactic.tactic_p(tactic)) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            final SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
            final SubLObject actual_productivity = inference_worker.content_tactic_actual_productivity(tactic);
            final SubLObject actual_cost = inference_datastructures_enumerated_types.cost_for_productivity(actual_productivity);
            return update_sksi_query_cost_problem_query(problem_query, sks, actual_cost);
        }
        return NIL;
    }

    public static SubLObject sksi_cost_recording_iterator_size(final SubLObject sks_cr_iterator) {
        assert NIL != sksi_cost_recording_iterator_p(sks_cr_iterator) : "sksi_query_utilities.sksi_cost_recording_iterator_p(sks_cr_iterator) " + "CommonSymbols.NIL != sksi_query_utilities.sksi_cost_recording_iterator_p(sks_cr_iterator) " + sks_cr_iterator;
        final SubLObject state = iteration.iteration_state_peek(sks_cr_iterator);
        if (NIL != list_utilities.proper_list_p(state)) {
            final SubLObject result_iterator = state.first();
            if (NIL != sksi_conjunctive_removal_modules_expand.sksi_crm_result_iterator_p(result_iterator)) {
                return sksi_conjunctive_removal_modules_expand.sksi_crm_result_iterator_size(result_iterator);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_reformulation_check(final SubLObject list) {
        return makeBoolean(NIL == find_if(SKSI_UNREFORMULATABLE_P, list, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject sksi_unreformulatable_p(final SubLObject v_object) {
        return eq($UNREFORMULATABLE, v_object);
    }

    public static SubLObject sksi_not_containing_nil_p(final SubLObject list) {
        return makeBoolean(NIL == list_utilities.member_eqP(NIL, list));
    }

    public static SubLObject get_sksi_removal_module_cost(final SubLObject asent, final SubLObject sense, final SubLObject sks, SubLObject default_cost) {
        if (default_cost == UNPROVIDED) {
            default_cost = $sksi_default_query_cost$.getGlobalValue();
        }
        final SubLObject cost = look_up_sksi_query_cost_asent_sense(asent, sense, sks, NIL);
        return NIL != cost ? cost : default_cost;
    }

    public static SubLObject sksi_sentence_cost(final SubLObject asent, final SubLObject sense, SubLObject sks) {
        if (sks == UNPROVIDED) {
            sks = NIL;
        }
        if (sense.eql($POS)) {
            final SubLObject mt_info = mt_relevance_macros.mt_info(NIL != sks ? sksi_kb_accessors.sk_source_content_mt_in_any_mt(sks) : NIL);
            return sksi_pos_sentence_cost(asent, sks, mt_info, UNPROVIDED);
        }
        if (sense.eql($NEG)) {
            return NIL != variables.fully_bound_p(asent) ? $expensive_hl_module_check_cost$.getGlobalValue() : NIL;
        }
        return NIL;
    }

    public static SubLObject sksi_pos_sentence_cost_internal(final SubLObject asent, final SubLObject sks, final SubLObject mt_info, SubLObject default_cost) {
        if (default_cost == UNPROVIDED) {
            default_cost = $sksi_default_query_cost$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = ZERO_INTEGER;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject hl_modules = inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, $POS);
                final SubLObject mapping_mt = (NIL != sks) ? sksi_kb_accessors.sk_source_mapping_mt(sks) : NIL;
                SubLObject cdolist_list_var = hl_modules;
                SubLObject mod = NIL;
                mod = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL != sksi_removal_module_generation.sksi_module_p(mod)) && (NIL != inference_worker_removal.hl_module_applicable_to_asentP(mod, asent))) {
                        SubLObject relevant_ksP = T;
                        final SubLObject mt_var = mapping_mt;
                        final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            if ((NIL != sks) && (NIL == sksi_kb_accessors.sk_source_super_ksP(inference_modules.hl_module_source(mod), sks))) {
                                relevant_ksP = NIL;
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$10, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$9, thread);
                        }
                        if (NIL != relevant_ksP) {
                            final SubLObject mod_cost = inference_modules.hl_module_cost_expression(mod);
                            if (mod_cost.isNumber()) {
                                cost = add(cost, mod_cost);
                            } else {
                                cost = add(cost, default_cost);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mod = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    final SubLObject hl_modules = inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, $POS);
                    final SubLObject mapping_mt = (NIL != sks) ? sksi_kb_accessors.sk_source_mapping_mt(sks) : NIL;
                    SubLObject cdolist_list_var = hl_modules;
                    SubLObject mod = NIL;
                    mod = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL != sksi_removal_module_generation.sksi_module_p(mod)) && (NIL != inference_worker_removal.hl_module_applicable_to_asentP(mod, asent))) {
                            SubLObject relevant_ksP = T;
                            final SubLObject mt_var = mapping_mt;
                            final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if ((NIL != sks) && (NIL == sksi_kb_accessors.sk_source_super_ksP(inference_modules.hl_module_source(mod), sks))) {
                                    relevant_ksP = NIL;
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$11, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$10, thread);
                            }
                            if (NIL != relevant_ksP) {
                                final SubLObject mod_cost = inference_modules.hl_module_cost_expression(mod);
                                if (mod_cost.isNumber()) {
                                    cost = add(cost, mod_cost);
                                } else {
                                    cost = add(cost, default_cost);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mod = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                        final SubLObject hl_modules = inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, $POS);
                        final SubLObject mapping_mt = (NIL != sks) ? sksi_kb_accessors.sk_source_mapping_mt(sks) : NIL;
                        SubLObject cdolist_list_var = hl_modules;
                        SubLObject mod = NIL;
                        mod = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL != sksi_removal_module_generation.sksi_module_p(mod)) && (NIL != inference_worker_removal.hl_module_applicable_to_asentP(mod, asent))) {
                                SubLObject relevant_ksP = T;
                                final SubLObject mt_var = mapping_mt;
                                final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$12 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    if ((NIL != sks) && (NIL == sksi_kb_accessors.sk_source_super_ksP(inference_modules.hl_module_source(mod), sks))) {
                                        relevant_ksP = NIL;
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$12, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$11, thread);
                                }
                                if (NIL != relevant_ksP) {
                                    final SubLObject mod_cost = inference_modules.hl_module_cost_expression(mod);
                                    if (mod_cost.isNumber()) {
                                        cost = add(cost, mod_cost);
                                    } else {
                                        cost = add(cost, default_cost);
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            mod = cdolist_list_var.first();
                        } 
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                        final SubLObject hl_modules = inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, $POS);
                        final SubLObject mapping_mt = (NIL != sks) ? sksi_kb_accessors.sk_source_mapping_mt(sks) : NIL;
                        SubLObject cdolist_list_var = hl_modules;
                        SubLObject mod = NIL;
                        mod = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL != sksi_removal_module_generation.sksi_module_p(mod)) && (NIL != inference_worker_removal.hl_module_applicable_to_asentP(mod, asent))) {
                                SubLObject relevant_ksP = T;
                                final SubLObject mt_var = mapping_mt;
                                final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$13 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    if ((NIL != sks) && (NIL == sksi_kb_accessors.sk_source_super_ksP(inference_modules.hl_module_source(mod), sks))) {
                                        relevant_ksP = NIL;
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$13, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$12, thread);
                                }
                                if (NIL != relevant_ksP) {
                                    final SubLObject mod_cost = inference_modules.hl_module_cost_expression(mod);
                                    if (mod_cost.isNumber()) {
                                        cost = add(cost, mod_cost);
                                    } else {
                                        cost = add(cost, default_cost);
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            mod = cdolist_list_var.first();
                        } 
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return cost;
    }

    public static SubLObject sksi_pos_sentence_cost(final SubLObject asent, final SubLObject sks, final SubLObject mt_info, SubLObject default_cost) {
        if (default_cost == UNPROVIDED) {
            default_cost = $sksi_default_query_cost$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_pos_sentence_cost_internal(asent, sks, mt_info, default_cost);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_POS_SENTENCE_COST, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_POS_SENTENCE_COST, FOUR_INTEGER, $int$1000, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_POS_SENTENCE_COST, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(asent, sks, mt_info, default_cost);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sks.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt_info.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && default_cost.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_pos_sentence_cost_internal(asent, sks, mt_info, default_cost)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(asent, sks, mt_info, default_cost));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject comparison_literal_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_literal_p(v_object)) && (NIL != fort_types_interface.sksi_supported_comparison_predicate_p(literal_predicate(v_object, UNPROVIDED))));
    }

    public static SubLObject sksi_comparison_literal_supported_predicate_p_internal(final SubLObject predicate) {
        return fort_types_interface.sksi_supported_comparison_predicate_p(predicate);
    }

    public static SubLObject sksi_comparison_literal_supported_predicate_p(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_comparison_literal_supported_predicate_p_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_comparison_literal_supported_predicate_p_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject contextualized_comparison_literal_p(final SubLObject lit) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
        return comparison_literal_p(asent);
    }

    public static SubLObject comparison_sentence_p(final SubLObject sentence) {
        return cycl_grammar.cycl_boolean_combination_of_type(COMPARISON_LITERAL_P, sentence);
    }

    public static SubLObject comparison_operator_forbidden_for_physical_field_indexicalP(final SubLObject operator, final SubLObject physical_field_indexical) {
        final SubLObject physical_schema = sksi_kb_accessors.physical_field_indexical_schema(physical_field_indexical);
        return sksi_kb_accessors.physical_schema_forbidden_comparison_operator_p(physical_schema, operator);
    }

    public static SubLObject comparison_operator_forbidden_for_some_physical_field_indexicalP(final SubLObject operator, final SubLObject physical_field_indexicals) {
        SubLObject forbiddenP = NIL;
        if (NIL == forbiddenP) {
            SubLObject csome_list_var = physical_field_indexicals;
            SubLObject physical_field_indexical = NIL;
            physical_field_indexical = csome_list_var.first();
            while ((NIL == forbiddenP) && (NIL != csome_list_var)) {
                if (NIL != comparison_operator_forbidden_for_physical_field_indexicalP(operator, physical_field_indexical)) {
                    forbiddenP = T;
                }
                csome_list_var = csome_list_var.rest();
                physical_field_indexical = csome_list_var.first();
            } 
        }
        return forbiddenP;
    }

    public static SubLObject sksi_unknown_sentence_literal_p_internal(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_literal_p(v_object)) && (NIL != kb_utilities.kbeq($$sksiUnknownSentence, literal_predicate(v_object, UNPROVIDED))));
    }

    public static SubLObject sksi_unknown_sentence_literal_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_unknown_sentence_literal_p_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_UNKNOWN_SENTENCE_LITERAL_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_UNKNOWN_SENTENCE_LITERAL_P, ONE_INTEGER, $int$2048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_UNKNOWN_SENTENCE_LITERAL_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_unknown_sentence_literal_p_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject physical_field_indexical_field_table_tuples(final SubLObject physical_field_indexical, SubLObject sk_source, SubLObject lit, SubLObject tac) {
        if (sk_source == UNPROVIDED) {
            sk_source = NIL;
        }
        if (lit == UNPROVIDED) {
            lit = NIL;
        }
        if (tac == UNPROVIDED) {
            tac = NIL;
        }
        final SubLObject physical_field = sksi_kb_accessors.physical_field_for_indexical(physical_field_indexical);
        if (NIL == physical_field) {
            sublisp_throw($SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL, physical_field_indexical);
        }
        final SubLObject alias_index = sksi_kb_accessors.pfi_index_for_pfi(physical_field_indexical, ZERO_INTEGER);
        final SubLObject field_name = sksi_kb_accessors.physical_field_name(physical_field);
        final SubLObject schema = sksi_kb_accessors.physical_field_schema(physical_field);
        final SubLObject tables = sk_sources_for_physical_schema(schema, sk_source);
        SubLObject field_table_tuples = NIL;
        SubLObject cdolist_list_var = tables;
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject table_name = sksi_kb_accessors.sk_source_name(table);
            final SubLObject namespace = sksi_kb_accessors.sk_source_namespace(table);
            if ((NIL != lit) && (NIL != tac)) {
                table_name = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, alias_index);
                field_table_tuples = cons(list(field_name, table_name, namespace), field_table_tuples);
            } else {
                if (!alias_index.isZero()) {
                    table_name = sksi_csql_generation.make_table_alias_name(table_name, alias_index);
                }
                field_table_tuples = cons(list(field_name, table_name, namespace), field_table_tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        return field_table_tuples;
    }

    public static SubLObject sk_sources_for_physical_schema_internal(final SubLObject physical_schema, SubLObject sk_source) {
        if (sk_source == UNPROVIDED) {
            sk_source = NIL;
        }
        final SubLObject ps_sk_sources = sksi_kb_accessors.physical_schema_sk_sources_memoized(physical_schema);
        SubLObject tables = NIL;
        if (NIL != sk_source) {
            SubLObject cdolist_list_var = ps_sk_sources;
            SubLObject ps_sk_source = NIL;
            ps_sk_source = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != sksi_kb_accessors.sk_source_sub_ksP(sk_source, ps_sk_source)) {
                    tables = cons(ps_sk_source, tables);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ps_sk_source = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = ps_sk_sources;
            SubLObject ps_sk_source = NIL;
            ps_sk_source = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                tables = cons(ps_sk_source, tables);
                cdolist_list_var = cdolist_list_var.rest();
                ps_sk_source = cdolist_list_var.first();
            } 
        }
        return list_utilities.fast_delete_duplicates(tables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sk_sources_for_physical_schema(final SubLObject physical_schema, SubLObject sk_source) {
        if (sk_source == UNPROVIDED) {
            sk_source = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sk_sources_for_physical_schema_internal(physical_schema, sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SK_SOURCES_FOR_PHYSICAL_SCHEMA, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SK_SOURCES_FOR_PHYSICAL_SCHEMA, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SK_SOURCES_FOR_PHYSICAL_SCHEMA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(physical_schema, sk_source);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (physical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && sk_source.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sk_sources_for_physical_schema_internal(physical_schema, sk_source)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(physical_schema, sk_source));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject get_from_expression_from_antecedent_meaning_sentence(final SubLObject conditional_meaning_sentence_gaf, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, SubLObject tac) {
        if (tac == UNPROVIDED) {
            tac = NIL;
        }
        final SubLObject ant_ls_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
        final SubLObject ant_ms = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf);
        final SubLObject con_ls_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
        final SubLObject con_ms = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, UNPROVIDED);
        return get_from_expression_from_antecedent_meaning_sentence_int(ant_ls_set, ant_ms, con_ls_set, con_ms, content_mt, sks, physical_schemata, tac);
    }

    public static SubLObject get_from_expression_from_antecedent_meaning_sentence_int(final SubLObject ant_ls_set, final SubLObject ant_ms, final SubLObject con_ls_set, final SubLObject con_ms, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject tac) {
        final SubLObject lfi_alias_fn_nauts = cycl_utilities.expression_gather(ant_ms, LFI_ALIAS_FN_NAUT_P, T, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        SubLObject csql_table_select = NIL;
        SubLObject cdolist_list_var = ant_ls_set;
        SubLObject ant_ls = NIL;
        ant_ls = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject ant_sks = sksi_kb_accessors.logical_schema_sources(ant_ls).first();
            final SubLObject ant_sks_name = sksi_kb_accessors.sk_source_name(ant_sks);
            SubLObject table_alias_list = NIL;
            SubLObject cdolist_list_var_$17 = lfi_alias_fn_nauts;
            SubLObject lfi = NIL;
            lfi = cdolist_list_var_$17.first();
            while (NIL != cdolist_list_var_$17) {
                if (NIL != kb_utilities.kbeq(ant_ls, sksi_kb_accessors.logical_field_indexical_schema(sksi_kb_accessors.lfi_fort_for_lfi(lfi)))) {
                    table_alias_list = cons(list(ant_sks_name, sksi_kb_accessors.lfi_alias_fn_naut_index(lfi)), table_alias_list);
                }
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                lfi = cdolist_list_var_$17.first();
            } 
            if (NIL == table_alias_list) {
                table_alias_list = cons(ant_sks_name, table_alias_list);
            }
            table_alias_list = nreverse(list_utilities.fast_delete_duplicates(table_alias_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            csql_table_select = append(sksi_csql_generation.sksi_determine_csql_table_select(table_alias_list), csql_table_select);
            cdolist_list_var = cdolist_list_var.rest();
            ant_ls = cdolist_list_var.first();
        } 
        return nreverse(list_utilities.fast_delete_duplicates(csql_table_select, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject get_where_expression_from_antecedent_meaning_sentence(final SubLObject conditional_meaning_sentence_gaf, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, SubLObject lit, SubLObject tac) {
        if (lit == UNPROVIDED) {
            lit = NIL;
        }
        if (tac == UNPROVIDED) {
            tac = NIL;
        }
        final SubLObject ant_ls_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
        final SubLObject ant_ms = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf);
        final SubLObject con_ls_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
        final SubLObject con_ms = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, UNPROVIDED);
        return get_where_expression_from_antecedent_meaning_sentence_int(conditional_meaning_sentence_gaf, ant_ms, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, lit, tac);
    }

    public static SubLObject get_where_expression_from_antecedent_meaning_sentence_int(final SubLObject cms_gaf, final SubLObject ant_ms, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject lit, final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject csql_where = get_where_expression_from_sentence_recursive(cms_gaf, ant_ms, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, lit, tac, UNPROVIDED);
        final SubLObject eval_conditions = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(sksi_csql_utilities.contract_where_expression(csql_where), eval_conditions);
    }

    public static SubLObject possibly_reorder_conjunctive_antecedent_sentence_conjunts(final SubLObject sentence) {
        SubLObject preceding_conjuncts = NIL;
        SubLObject following_conjuncts = NIL;
        SubLObject new_sentence = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != comparison_literal_p(conjunct)) || (NIL != evaluate_literal_p(conjunct))) {
                following_conjuncts = cons(conjunct, following_conjuncts);
            } else {
                final SubLObject lfis = sksi_infrastructure_utilities.expression_logical_field_indexicals(sentence, T, T);
                SubLObject any_virtual_lfisP = NIL;
                if (NIL == any_virtual_lfisP) {
                    SubLObject csome_list_var = lfis;
                    SubLObject lfi = NIL;
                    lfi = csome_list_var.first();
                    while ((NIL == any_virtual_lfisP) && (NIL != csome_list_var)) {
                        if (NIL != sksi_kb_accessors.logical_field_indexical_virtualP(lfi)) {
                            any_virtual_lfisP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        lfi = csome_list_var.first();
                    } 
                }
                if (NIL != any_virtual_lfisP) {
                    preceding_conjuncts = cons(conjunct, preceding_conjuncts);
                } else {
                    following_conjuncts = cons(conjunct, following_conjuncts);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        preceding_conjuncts = nreverse(preceding_conjuncts);
        following_conjuncts = nreverse(following_conjuncts);
        new_sentence = make_conjunction(append(preceding_conjuncts, following_conjuncts));
        return new_sentence;
    }

    public static SubLObject get_where_expression_from_sentence_recursive(final SubLObject cms_gaf, SubLObject sentence, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac, SubLObject eval_conditions_for_later_use) {
        if (eval_conditions_for_later_use == UNPROVIDED) {
            eval_conditions_for_later_use = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_operator(sentence);
        SubLObject where = NIL;
        SubLObject eval_conditions = NIL;
        SubLObject failP = NIL;
        final SubLObject pcase_var = operator;
        if (pcase_var.eql($$and)) {
            sentence = possibly_reorder_conjunctive_antecedent_sentence_conjunts(sentence);
            final SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject rest;
            SubLObject conjunct;
            SubLObject conjunct_where;
            SubLObject conjunct_eval;
            SubLObject conjunct_eval_conditions_for_later_use;
            for (rest = NIL, rest = args; (NIL == failP) && (NIL != rest); rest = rest.rest()) {
                conjunct = rest.first();
                thread.resetMultipleValues();
                conjunct_where = get_where_expression_from_sentence_recursive(cms_gaf, conjunct, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, eval_conditions_for_later_use);
                conjunct_eval = thread.secondMultipleValue();
                conjunct_eval_conditions_for_later_use = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL == conjunct_where) && (NIL == conjunct_eval)) {
                    failP = T;
                } else {
                    if (NIL != conjunct_where) {
                        where = cons(conjunct_where, where);
                    }
                    if (NIL != conjunct_eval) {
                        eval_conditions = append(eval_conditions, conjunct_eval);
                    }
                    if (NIL != conjunct_eval_conditions_for_later_use) {
                        eval_conditions_for_later_use = append(eval_conditions_for_later_use, conjunct_eval_conditions_for_later_use);
                    }
                }
            }
            if ((NIL == failP) && (NIL != where)) {
                where = cons($$CSQLAnd, where);
            }
        } else
            if (pcase_var.eql($$or)) {
                final SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                SubLObject rest;
                SubLObject disjunct;
                SubLObject disjunct_where;
                for (rest = NIL, rest = args; (NIL == failP) && (NIL != rest); rest = rest.rest()) {
                    disjunct = rest.first();
                    disjunct_where = get_where_expression_from_sentence_recursive(cms_gaf, disjunct, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, UNPROVIDED);
                    if (NIL != disjunct_where) {
                        where = cons(disjunct_where, where);
                    } else {
                        failP = T;
                    }
                }
                if (NIL == failP) {
                    where = cons($$CSQLOr, where);
                }
            } else
                if (pcase_var.eql($$not)) {
                    final SubLObject not_where = get_where_expression_from_sentence_recursive(cms_gaf, cycl_utilities.formula_arg1(sentence, UNPROVIDED), ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, UNPROVIDED);
                    if (NIL != not_where) {
                        where = (NIL != kb_utilities.kbeq($$CSQLNot, not_where.first())) ? cadr(not_where) : list($$CSQLNot, not_where);
                    } else {
                        failP = T;
                    }
                } else
                    if (pcase_var.eql($$implies)) {
                        final SubLObject ant = get_where_expression_from_sentence_recursive(cms_gaf, cycl_utilities.formula_arg1(sentence, UNPROVIDED), ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, UNPROVIDED);
                        final SubLObject con = get_where_expression_from_sentence_recursive(cms_gaf, cycl_utilities.formula_arg2(sentence, UNPROVIDED), ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, UNPROVIDED);
                        SubLObject not_ant = NIL;
                        if ((NIL != ant) && (NIL != con)) {
                            not_ant = (NIL != kb_utilities.kbeq($$CSQLNot, ant.first())) ? cadr(ant) : list($$CSQLNot, ant);
                            where = list($$CSQLOr, not_ant, con);
                        } else {
                            failP = T;
                        }
                    } else
                        if (pcase_var.eql($$equiv)) {
                            final SubLObject left = get_where_expression_from_sentence_recursive(cms_gaf, cycl_utilities.formula_arg1(sentence, UNPROVIDED), ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, UNPROVIDED);
                            final SubLObject right = get_where_expression_from_sentence_recursive(cms_gaf, cycl_utilities.formula_arg2(sentence, UNPROVIDED), ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, UNPROVIDED);
                            SubLObject not_left = NIL;
                            SubLObject not_right = NIL;
                            if ((NIL != left) && (NIL != right)) {
                                not_left = (NIL != kb_utilities.kbeq($$CSQLNot, left.first())) ? cadr(left) : list($$CSQLNot, left);
                                not_right = (NIL != kb_utilities.kbeq($$CSQLNot, right.first())) ? cadr(right) : list($$CSQLNot, right);
                                where = list($$CSQLOr, list($$CSQLAnd, left, right), list($$CSQLAnd, not_left, not_right));
                            } else {
                                failP = T;
                            }
                        } else {
                            thread.resetMultipleValues();
                            final SubLObject csql_where = get_where_expression_from_literal(cms_gaf, sentence, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, eval_conditions_for_later_use);
                            final SubLObject literal_eval_conditions_for_later_use = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            eval_conditions_for_later_use = append(eval_conditions_for_later_use, literal_eval_conditions_for_later_use);
                            if (NIL == csql_where) {
                                failP = T;
                            } else
                                if (csql_where.isCons() && (NIL != sksi_csql_utilities.csql_eval_expression_p(second(csql_where)))) {
                                    eval_conditions = cons(csql_where, eval_conditions);
                                    where = T;
                                } else {
                                    where = csql_where;
                                }

                        }




        return NIL != failP ? values(NIL, NIL, NIL) : values(where, eval_conditions, eval_conditions_for_later_use);
    }

    public static SubLObject evaluate_literal_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_literal_p(v_object)) && (NIL != kb_utilities.kbeq($$evaluate, literal_predicate(v_object, UNPROVIDED))));
    }

    public static SubLObject get_where_expression_from_literal(final SubLObject cms_gaf, final SubLObject literal, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac, SubLObject eval_conditions_for_later_use) {
        if (eval_conditions_for_later_use == UNPROVIDED) {
            eval_conditions_for_later_use = NIL;
        }
        if (NIL != comparison_literal_p(literal)) {
            return values(get_where_expression_from_comparison_literal(literal, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac), NIL);
        }
        if (NIL != evaluate_literal_p(literal)) {
            return values(get_where_expression_from_evaluate_literal(literal, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, eval_conditions_for_later_use), NIL);
        }
        return get_where_expression_from_other_literal(cms_gaf, literal, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac);
    }

    public static SubLObject get_where_expression_from_comparison_literal(final SubLObject literal, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac) {
        final SubLObject pred = literal_predicate(literal, UNPROVIDED);
        final SubLObject args = literal_args(literal, UNPROVIDED);
        final SubLObject left = args.first();
        final SubLObject right = second(args);
        SubLObject csql_operator = sksi_kb_accessors.cycl_operator_to_csql_operator(pred);
        SubLObject negatedP = NIL;
        SubLObject where = NIL;
        if (NIL != sksi_csql_utilities.csql_where_clause_negated_comparison_operator_p(csql_operator)) {
            negatedP = T;
            csql_operator = sksi_csql_utilities.csql_negate_comparison_relation(csql_operator);
        }
        if (NIL != sksi_kb_accessors.logical_field_indexical_p(left)) {
            if (NIL != sksi_kb_accessors.logical_field_indexical_p(right)) {
                where = get_where_expression_from_comparison_literal_double_lfis(left, right, csql_operator, content_mt, sks, physical_schemata, query_lit, tac);
            } else {
                where = get_where_expression_from_comparison_literal_single_lfi(left, right, csql_operator, content_mt, sks, physical_schemata, query_lit, tac);
            }
        } else
            if (NIL != sksi_kb_accessors.logical_field_indexical_p(right)) {
                where = get_where_expression_from_comparison_literal_single_lfi(left, right, csql_operator, content_mt, sks, physical_schemata, query_lit, tac);
            } else
                if (NIL != sksi_infrastructure_utilities.sksi_supported_function_expression_p(left)) {
                    final SubLObject new_left = get_where_expression_from_evaluate_literal_int(left, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, UNPROVIDED);
                    if (NIL != sksi_infrastructure_utilities.sksi_supported_function_expression_p(right)) {
                        final SubLObject new_right = get_where_expression_from_evaluate_literal_int(right, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, UNPROVIDED);
                        where = list(list(csql_operator, new_left, new_right));
                    } else {
                        where = list(list(csql_operator, new_left, right));
                    }
                } else
                    if (NIL != sksi_infrastructure_utilities.sksi_supported_function_expression_p(right)) {
                        final SubLObject new_right2 = get_where_expression_from_evaluate_literal_int(right, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, UNPROVIDED);
                        where = list(list(csql_operator, left, new_right2));
                    }



        if (((NIL == sksi_csql_utilities.csql_true_p(where)) && (NIL == list_utilities.singletonP(where))) && (NIL == sksi_csql_utilities.csql_conjunction_p(where))) {
            where = sksi_csql_utilities.csql_conjoin_expressions(where);
        }
        if (NIL != list_utilities.singletonP(where)) {
            where = where.first();
        }
        if (NIL != negatedP) {
            where = sksi_csql_utilities.csql_negate_expression(where);
        }
        return where;
    }

    public static SubLObject get_where_expression_from_comparison_literal_single_lfi(final SubLObject left, final SubLObject right, final SubLObject csql_operator, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac) {
        final SubLObject left_lfiP = (NIL != sksi_kb_accessors.logical_field_indexical_p(left)) ? T : NIL;
        final SubLObject lfi = (NIL != left_lfiP) ? left : right;
        final SubLObject non_lfi = (NIL != left_lfiP) ? right : left;
        final SubLObject encodings = sksi_field_translation_utilities.generate_encoding_compositions_from_logical_field_indexical(lfi, NIL, physical_schemata, UNPROVIDED);
        SubLObject where = NIL;
        if (NIL == encodings) {
            sublisp_throw($SKSI_MISSING_ENCODINGS, lfi);
        } else {
            SubLObject cdolist_list_var = encodings;
            SubLObject encoding_pfi_pair = NIL;
            encoding_pfi_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject physical_field_indexical = encoding_pfi_pair.first();
                final SubLObject encoding = second(encoding_pfi_pair);
                final SubLObject field_table_tuples = physical_field_indexical_field_table_tuples(physical_field_indexical, sks, query_lit, tac);
                final SubLObject reformed = sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate(list(bq_cons(lfi, non_lfi)), encoding, sks, content_mt);
                if (NIL != sksi_unreformulatable_p(reformed)) {
                    sublisp_throw($SKSI_UNREFORMULATABLE, non_lfi);
                } else
                    if (NIL != left_lfiP) {
                        SubLObject cdolist_list_var_$18 = field_table_tuples;
                        SubLObject field_table_tuple = NIL;
                        field_table_tuple = cdolist_list_var_$18.first();
                        while (NIL != cdolist_list_var_$18) {
                            where = cons(list(csql_operator, bq_cons($FIELD, field_table_tuple), reformed), where);
                            cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                            field_table_tuple = cdolist_list_var_$18.first();
                        } 
                    } else {
                        SubLObject cdolist_list_var_$19 = field_table_tuples;
                        SubLObject field_table_tuple = NIL;
                        field_table_tuple = cdolist_list_var_$19.first();
                        while (NIL != cdolist_list_var_$19) {
                            where = cons(list(csql_operator, reformed, bq_cons($FIELD, field_table_tuple)), where);
                            cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                            field_table_tuple = cdolist_list_var_$19.first();
                        } 
                    }

                cdolist_list_var = cdolist_list_var.rest();
                encoding_pfi_pair = cdolist_list_var.first();
            } 
        }
        return where;
    }

    public static SubLObject get_where_expression_from_comparison_literal_double_lfis(final SubLObject left, final SubLObject right, final SubLObject csql_operator, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac) {
        final SubLObject left_decodings = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(left, NIL, physical_schemata);
        final SubLObject right_decodings = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(right, NIL, physical_schemata);
        SubLObject where = NIL;
        if (NIL == left_decodings) {
            sublisp_throw($SKSI_MISSING_DECODINGS, left);
        } else
            if (NIL == right_decodings) {
                sublisp_throw($SKSI_MISSING_DECODINGS, right);
            } else {
                final SubLObject left_pfi_lists = Mapping.mapcar(DECODING_PHYSICAL_FIELD_INDEXICALS_ORDERED, left_decodings);
                final SubLObject right_pfi_lists = Mapping.mapcar(DECODING_PHYSICAL_FIELD_INDEXICALS_ORDERED, right_decodings);
                SubLObject cdolist_list_var = left_pfi_lists;
                SubLObject left_pfi_list = NIL;
                left_pfi_list = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$20 = right_pfi_lists;
                    SubLObject right_pfi_list = NIL;
                    right_pfi_list = cdolist_list_var_$20.first();
                    while (NIL != cdolist_list_var_$20) {
                        where = cons(get_pair_expression(csql_operator, list(left_pfi_list, right_pfi_list), sks, query_lit, tac), where);
                        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                        right_pfi_list = cdolist_list_var_$20.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    left_pfi_list = cdolist_list_var.first();
                } 
                if (NIL == list_utilities.singletonP(where)) {
                    where = sksi_csql_utilities.csql_conjoin_expressions(where);
                }
            }

        return where;
    }

    public static SubLObject get_where_expression_from_evaluate_literal(final SubLObject literal, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac, SubLObject eval_conditions_for_later_use) {
        if (eval_conditions_for_later_use == UNPROVIDED) {
            eval_conditions_for_later_use = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject literal_var_lfi = cycl_utilities.formula_arg1(literal, UNPROVIDED);
        final SubLObject literal_eval_expression = cycl_utilities.formula_arg2(literal, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject csql_eval_expression = get_where_expression_from_evaluate_literal_int(literal_eval_expression, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, eval_conditions_for_later_use);
        final SubLObject unit_of_measure = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return list(literal_var_lfi, sksi_csql_utilities.make_csql_expression($EVAL, list(csql_eval_expression)), unit_of_measure);
    }

    public static SubLObject get_where_expression_from_evaluate_literal_int(final SubLObject literal_eval_expression, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac, SubLObject eval_conditions_for_later_use) {
        if (eval_conditions_for_later_use == UNPROVIDED) {
            eval_conditions_for_later_use = NIL;
        }
        SubLObject literal_eval_expression_copy = copy_expression(literal_eval_expression);
        final SubLObject literal_logical_field_indexicals = sksi_infrastructure_utilities.expression_logical_field_indexicals(literal_eval_expression, NIL, UNPROVIDED);
        final SubLObject literal_logical_field_indexical_forts = list_utilities.fast_delete_duplicates(Mapping.mapcar(LFI_FORT_FOR_LFI, literal_logical_field_indexicals), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject literal_ls = NIL;
        SubLObject literal_ps = NIL;
        SubLObject literal_ks = NIL;
        if (NIL == literal_ls) {
            SubLObject csome_list_var = ant_ls_set;
            SubLObject ls = NIL;
            ls = csome_list_var.first();
            while ((NIL == literal_ls) && (NIL != csome_list_var)) {
                final SubLObject ls_lfis = sksi_kb_accessors.logical_schema_field_indexicals(ls);
                if (NIL != list_utilities.fast_subsetP(literal_logical_field_indexical_forts, ls_lfis, UNPROVIDED)) {
                    literal_ls = ls;
                }
                csome_list_var = csome_list_var.rest();
                ls = csome_list_var.first();
            } 
        }
        literal_ps = keyhash_utilities.fast_intersection(sksi_kb_accessors.logical_schema_physical_schemata(literal_ls), physical_schemata, symbol_function(EQ), UNPROVIDED, UNPROVIDED).first();
        if (NIL == literal_ks) {
            SubLObject csome_list_var = sksi_kb_accessors.logical_schema_sources(literal_ls);
            SubLObject ks = NIL;
            ks = csome_list_var.first();
            while ((NIL == literal_ks) && (NIL != csome_list_var)) {
                if (NIL != sksi_kb_accessors.sk_source_sub_ksP(sks, ks)) {
                    literal_ks = ks;
                }
                csome_list_var = csome_list_var.rest();
                ks = csome_list_var.first();
            } 
        }
        SubLObject cdolist_list_var = literal_logical_field_indexicals;
        SubLObject lfi = NIL;
        lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject lfi_eval_exp = find(lfi, eval_conditions_for_later_use, symbol_function(EQUAL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
            if (NIL != lfi_eval_exp) {
                final SubLObject unit_of_measure = third(lfi_eval_exp);
                if (NIL != unit_of_measure) {
                    lfi_eval_exp = list(unit_of_measure, second(lfi_eval_exp));
                } else {
                    lfi_eval_exp = second(lfi_eval_exp);
                }
                literal_eval_expression_copy = cycl_utilities.expression_subst(lfi_eval_exp, lfi, literal_eval_expression_copy, symbol_function(EQUAL), UNPROVIDED);
            } else {
                final SubLObject decoding = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(lfi, list(literal_ls), list(literal_ps)).first();
                literal_eval_expression_copy = cycl_utilities.expression_subst(decoding, lfi, literal_eval_expression_copy, symbol_function(EQUAL), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        } 
        final SubLObject csql_eval_expression = get_csql_expression_for_evaluatable_expression(literal_eval_expression_copy, literal_ps, literal_ls, literal_ks, query_lit, tac, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject literal_eval_expression_operator = cycl_utilities.formula_operator(literal_eval_expression);
        final SubLObject unit_of_measure2 = (NIL != sksi_infrastructure_utilities.isa_unit_of_measureP(literal_eval_expression_operator)) ? literal_eval_expression_operator : NIL;
        return values(csql_eval_expression, unit_of_measure2);
    }

    public static SubLObject get_csql_expression_for_evaluatable_expression(final SubLObject eval_expression, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject sk_source, final SubLObject query_lit, final SubLObject tac, SubLObject var_lit_pfis, SubLObject var_pfi_encodings, SubLObject lit_pfi_selects) {
        if (var_lit_pfis == UNPROVIDED) {
            var_lit_pfis = NIL;
        }
        if (var_pfi_encodings == UNPROVIDED) {
            var_pfi_encodings = NIL;
        }
        if (lit_pfi_selects == UNPROVIDED) {
            lit_pfi_selects = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != fort_types_interface.sksi_supported_constant_p(eval_expression)) {
            return sksi_kb_accessors.cycl_operator_to_csql_operator(eval_expression);
        }
        if (NIL != variables.variable_p(eval_expression)) {
            return get_csql_expression_for_evaluatable_expression_var(eval_expression, var_lit_pfis, var_pfi_encodings, lit_pfi_selects);
        }
        if (eval_expression.isAtom()) {
            return eval_expression;
        }
        if (NIL != sksi_kb_accessors.physical_field_indexical_p(eval_expression)) {
            return make_csql_field_expression_for_pfi(eval_expression, query_lit, tac);
        }
        if (NIL != sksi_csql_utilities.csql_eval_expression_p(eval_expression)) {
            return sksi_csql_utilities.csql_expression_arg1(eval_expression);
        }
        if (NIL == isa.isaP(eval_expression, $$Time_Quantity, UNPROVIDED, UNPROVIDED)) {
            if (NIL != el_formula_p(eval_expression)) {
                final SubLObject operator = cycl_utilities.formula_operator(eval_expression);
                if ((NIL != sksi_infrastructure_utilities.isa_unit_of_measureP(operator)) && (NIL != el_unary_formula_p(eval_expression))) {
                    return get_csql_expression_for_evaluatable_expression(cycl_utilities.formula_arg1(eval_expression, UNPROVIDED), physical_schema, logical_schema, sk_source, query_lit, tac, var_lit_pfis, var_pfi_encodings, lit_pfi_selects);
                }
                if (NIL != kb_utilities.kbeq(operator, $$QuantityConversionFn)) {
                    final SubLObject to_unit = cycl_utilities.formula_arg1(eval_expression, UNPROVIDED);
                    final SubLObject from_unit = cycl_utilities.formula_operator(cycl_utilities.formula_arg2(eval_expression, UNPROVIDED));
                    final SubLObject factor = quantities.unit_multiplication_factor(from_unit, to_unit, UNPROVIDED);
                    final SubLObject sub_eval = get_csql_expression_for_evaluatable_expression(cycl_utilities.formula_arg2(eval_expression, UNPROVIDED), physical_schema, logical_schema, sk_source, query_lit, tac, var_lit_pfis, var_pfi_encodings, lit_pfi_selects);
                    if (NIL != sub_eval) {
                        return sksi_csql_utilities.make_csql_expression($$CSQLTimesFn, list(factor, sub_eval));
                    }
                    return NIL;
                } else {
                    if (NIL != fort_types_interface.sksi_supported_function_p(operator)) {
                        final SubLObject args = cycl_utilities.formula_args(eval_expression, UNPROVIDED);
                        SubLObject new_args = NIL;
                        SubLObject cdolist_list_var = args;
                        SubLObject arg = NIL;
                        arg = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject arg_csql = get_csql_expression_for_evaluatable_expression(arg, physical_schema, logical_schema, sk_source, query_lit, tac, var_lit_pfis, var_pfi_encodings, lit_pfi_selects);
                            if (NIL == arg_csql) {
                                return NIL;
                            }
                            new_args = cons(arg_csql, new_args);
                            cdolist_list_var = cdolist_list_var.rest();
                            arg = cdolist_list_var.first();
                        } 
                        new_args = nreverse(new_args);
                        return sksi_csql_utilities.make_csql_expression(sksi_kb_accessors.cycl_operator_to_csql_operator(operator), new_args);
                    }
                    final SubLObject pfi_arg = find_if(PHYSICAL_FIELD_INDEXICAL_P, cycl_utilities.formula_args(eval_expression, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != pfi_arg) {
                        return make_csql_field_expression_for_pfi(pfi_arg, query_lit, tac);
                    }
                }
            }
            return NIL;
        }
        final SubLObject seconds = date_utilities.convert_time_quant_to_seconds(eval_expression);
        if (NIL != seconds) {
            return sksi_csql_utilities.make_csql_expression($$CSQLSecondsDurationFn, list(seconds));
        }
        final SubLObject months = date_utilities.convert_time_quant_to_months(eval_expression);
        if (NIL != months) {
            return sksi_csql_utilities.make_csql_expression($$CSQLMonthsDurationFn, list(months));
        }
        final SubLObject years = date_utilities.convert_time_quant_to_years(eval_expression);
        if (NIL != years) {
            return sksi_csql_utilities.make_csql_expression($$CSQLYearsDurationFn, list(years));
        }
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(SEVEN_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str61$__SKSI__A_, $str62$SKSI_could_not_convert___Time_Qua), SEVEN_INTEGER, eval_expression);
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject get_csql_expression_for_evaluatable_expression_var(final SubLObject var, final SubLObject var_lit_pfis, final SubLObject var_pfi_encodings, final SubLObject lit_pfi_selects) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject this_var_lit_pfis = dictionary.dictionary_lookup(var_lit_pfis, var, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL != dictionary.dictionary_p(this_var_lit_pfis)) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(this_var_lit_pfis)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject var_lit = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject var_pfis = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject pfi_selects = dictionary.dictionary_lookup(lit_pfi_selects, var_lit, UNPROVIDED);
                SubLObject cdolist_list_var = var_pfis;
                SubLObject pfi = NIL;
                pfi = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject pfi_select = dictionary.dictionary_lookup(pfi_selects, pfi, UNPROVIDED);
                    if (NIL != pfi_select) {
                        result = append(result, pfi_select);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pfi = cdolist_list_var.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return result.first();
    }

    public static SubLObject make_csql_field_expression_for_pfi(final SubLObject pfi, SubLObject lit, SubLObject tac) {
        if (lit == UNPROVIDED) {
            lit = NIL;
        }
        if (tac == UNPROVIDED) {
            tac = NIL;
        }
        final SubLObject field_name = sksi_kb_accessors.physical_field_indexical_name(pfi);
        SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
        final SubLObject namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace(pfi);
        if ((NIL != lit) && (NIL != tac)) {
            final SubLObject index = sksi_kb_accessors.pfi_index_for_pfi(pfi, ZERO_INTEGER);
            table_name = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, index);
        } else
            if (NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(pfi)) {
                final SubLObject index = sksi_kb_accessors.pfi_alias_fn_naut_index(pfi);
                table_name = sksi_csql_generation.make_table_alias_name(table_name, index);
            }

        return sksi_csql_utilities.construct_csql_field_expression(field_name, table_name, namespace);
    }

    public static SubLObject get_where_expression_from_other_literal(final SubLObject cms_gaf, final SubLObject literal, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cms_gaf) {
            return NIL;
        }
        final SubLObject literal_logical_field_indexicals = sksi_infrastructure_utilities.expression_logical_field_indexicals(literal, NIL, UNPROVIDED);
        final SubLObject literal_logical_field_indexical_forts = list_utilities.fast_delete_duplicates(Mapping.mapcar(LFI_FORT_FOR_LFI, literal_logical_field_indexicals), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject literal_ls = NIL;
        SubLObject literal_ps = NIL;
        SubLObject literal_ks = NIL;
        if (NIL == literal_ls) {
            SubLObject csome_list_var = ant_ls_set;
            SubLObject ls = NIL;
            ls = csome_list_var.first();
            while ((NIL == literal_ls) && (NIL != csome_list_var)) {
                final SubLObject ls_lfis = sksi_kb_accessors.logical_schema_field_indexicals(ls);
                if (NIL != list_utilities.fast_subsetP(literal_logical_field_indexical_forts, ls_lfis, UNPROVIDED)) {
                    literal_ls = ls;
                }
                csome_list_var = csome_list_var.rest();
                ls = csome_list_var.first();
            } 
        }
        literal_ps = keyhash_utilities.fast_intersection(sksi_kb_accessors.logical_schema_physical_schemata(literal_ls), physical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
        if (NIL == literal_ks) {
            SubLObject csome_list_var = sksi_kb_accessors.logical_schema_sources(literal_ls);
            SubLObject ks = NIL;
            ks = csome_list_var.first();
            while ((NIL == literal_ks) && (NIL != csome_list_var)) {
                if (NIL != sksi_kb_accessors.sk_source_sub_ksP(sks, ks)) {
                    literal_ks = ks;
                }
                csome_list_var = csome_list_var.rest();
                ks = csome_list_var.first();
            } 
        }
        final SubLObject ls_ms_list = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences_relevant_to_appropriateness_check(literal_ls, cms_gaf, NIL);
        SubLObject literal_meaning_sentence = sksi_meaning_sentence_utilities.meaning_sentences_type_check(literal, ls_ms_list, T, NIL, NIL, $RAW).first();
        SubLObject ls_cms_list = NIL;
        SubLObject eval_conditions_for_later_use = NIL;
        SubLObject where_clause = NIL;
        if (NIL == literal_meaning_sentence) {
            ls_cms_list = sksi_meaning_sentence_utilities.logical_schema_conditional_meaning_sentence_gafs_relevant_to_appropriateness_check(literal_ls, cms_gaf, NIL);
            SubLObject foundP = NIL;
            SubLObject where_exp = NIL;
            if (NIL == foundP) {
                SubLObject csome_list_var2 = ls_cms_list;
                SubLObject cms = NIL;
                cms = csome_list_var2.first();
                while ((NIL == foundP) && (NIL != csome_list_var2)) {
                    if (NIL != sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(cms, literal_ks)) {
                        final SubLObject consequent_ms = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms, UNPROVIDED);
                        if (NIL != sksi_meaning_sentence_utilities.meaning_sentence_type_check(literal, consequent_ms, T, NIL, NIL, $RAW, UNPROVIDED, UNPROVIDED)) {
                            foundP = T;
                            literal_meaning_sentence = consequent_ms;
                            thread.resetMultipleValues();
                            final SubLObject where_exp_$21 = get_where_expression_from_antecedent_meaning_sentence(cms, content_mt, sks, physical_schemata, NIL, tac);
                            final SubLObject eval_conditions_for_later_use_$22 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            where_exp = where_exp_$21;
                            eval_conditions_for_later_use = eval_conditions_for_later_use_$22;
                        }
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    cms = csome_list_var2.first();
                } 
            }
        }
        where_clause = get_where_expression_from_meaning_sentence(literal, literal_meaning_sentence, list(literal_ls), list(literal_ps), literal_ks, query_lit, tac, eval_conditions_for_later_use, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return values(where_clause, eval_conditions_for_later_use);
    }

    public static SubLObject get_where_expression_from_meaning_sentence(final SubLObject literal, final SubLObject literal_meaning_sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject literal_ks, final SubLObject query_lit, final SubLObject tac, final SubLObject eval_conditions_for_later_use, SubLObject var_pfi_encodings, SubLObject var_lit_pfis, SubLObject lit_pfi_selects, SubLObject var_lfi_map, SubLObject asents, SubLObject meaning_sentence_gafs, SubLObject sks_physical_schemata) {
        if (var_pfi_encodings == UNPROVIDED) {
            var_pfi_encodings = NIL;
        }
        if (var_lit_pfis == UNPROVIDED) {
            var_lit_pfis = NIL;
        }
        if (lit_pfi_selects == UNPROVIDED) {
            lit_pfi_selects = NIL;
        }
        if (var_lfi_map == UNPROVIDED) {
            var_lfi_map = NIL;
        }
        if (asents == UNPROVIDED) {
            asents = NIL;
        }
        if (meaning_sentence_gafs == UNPROVIDED) {
            meaning_sentence_gafs = NIL;
        }
        if (sks_physical_schemata == UNPROVIDED) {
            sks_physical_schemata = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lit_ms_lfis = sksi_infrastructure_utilities.expression_logical_field_indexicals_ordered(literal_meaning_sentence, NIL);
        SubLObject relevant_lit_pfis = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals(lit_ms_lfis, logical_schemata, physical_schemata);
        final SubLObject fixed_lit_pfis = sksi_infrastructure_utilities.sksi_determine_fixed_physical_field_indexicals(logical_schemata, physical_schemata);
        final SubLObject any_pfi_alias_fn_nautP = find_if(PFI_ALIAS_FN_NAUT_P, relevant_lit_pfis, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject literal_lfi_alias = NIL;
        SubLObject literal_where_clause = NIL;
        SubLObject pfi_where_expressions = NIL;
        SubLObject where_clause = NIL;
        SubLObject from_clause = NIL;
        if (NIL == any_pfi_alias_fn_nautP) {
            if (NIL != sksi_query_datastructures.table_aliasing_context_p(tac)) {
                final SubLObject table_name = sksi_kb_accessors.sk_source_name(literal_ks);
                final SubLObject namespace = sksi_kb_accessors.sk_source_namespace(literal_ks);
                final SubLObject table_alias = sksi_query_datastructures.tac_alias_table(tac, query_lit, table_name, namespace, UNPROVIDED);
                if (table_name.isString() && table_alias.isString()) {
                    literal_lfi_alias = sksi_query_datastructures.table_alias_alias_suffix(table_alias, table_name);
                    from_clause = list(NIL != namespace ? list(table_name, table_alias, namespace) : list(table_name, table_alias));
                }
            } else {
                literal_lfi_alias = sksi_kb_accessors.lfi_alias_fn_naut_index(cycl_utilities.expression_find_if(LFI_ALIAS_FN_NAUT_P, literal, NIL, UNPROVIDED));
            }
            if (NIL != literal_lfi_alias) {
                SubLObject new_pfis = NIL;
                SubLObject cdolist_list_var = relevant_lit_pfis;
                SubLObject pfi = NIL;
                pfi = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    new_pfis = cons(sksi_kb_accessors.pfi_alias_naut_for_pfi_and_alias_index(pfi, literal_lfi_alias), new_pfis);
                    cdolist_list_var = cdolist_list_var.rest();
                    pfi = cdolist_list_var.first();
                } 
                relevant_lit_pfis = nreverse(new_pfis);
            }
        }
        thread.resetMultipleValues();
        final SubLObject where = sksi_csql_generation.sksi_determine_csql_where_clause(literal_ks, literal_meaning_sentence, logical_schemata, physical_schemata, relevant_lit_pfis, fixed_lit_pfis, NIL, eval_conditions_for_later_use);
        final SubLObject table_alias_list = thread.secondMultipleValue();
        final SubLObject pfi_where_mapping = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        literal_where_clause = where;
        pfi_where_expressions = pfi_where_mapping;
        if (NIL != literal_where_clause) {
            final SubLObject terms = cycl_utilities.formula_terms(literal, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject arg = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            arg = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                SubLObject physical_field_name = NIL;
                SubLObject replace_term = NIL;
                SubLObject failP = NIL;
                if (NIL == sksi_kb_accessors.logical_field_indexical_p(arg)) {
                    if (NIL != cycl_grammar.hl_variable_p(arg)) {
                        final SubLObject arg_lit_pfis = dictionary.dictionary_lookup(var_lit_pfis, arg, UNPROVIDED);
                        SubLObject iteration_state;
                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(arg_lit_pfis)); (NIL == failP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject lit = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            final SubLObject pfis = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject lit_position = position(lit, asents, symbol_function(EQUAL), CONTEXTUALIZED_ASENT_ASENT, UNPROVIDED, UNPROVIDED);
                            final SubLObject lit_meaning_sentence_gaf = nth(lit_position, meaning_sentence_gafs);
                            final SubLObject lit_meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(lit_meaning_sentence_gaf, UNPROVIDED);
                            failP = T;
                            if (NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(literal, literal_meaning_sentence, lit, lit_meaning_sentence, sks_physical_schemata)) {
                                failP = NIL;
                                final SubLObject pfi_selects_for_lit = dictionary.dictionary_lookup(lit_pfi_selects, lit, UNPROVIDED);
                                SubLObject foundP = NIL;
                                if (NIL == foundP) {
                                    SubLObject csome_list_var = pfis;
                                    SubLObject pfi2 = NIL;
                                    pfi2 = csome_list_var.first();
                                    while ((NIL == foundP) && (NIL != csome_list_var)) {
                                        final SubLObject pfi_selects = dictionary.dictionary_lookup(pfi_selects_for_lit, pfi2, UNPROVIDED);
                                        final SubLObject pfi_select = pfi_selects.first();
                                        final SubLObject ms_arg = cycl_utilities.formula_arg(literal_meaning_sentence, argnum, UNPROVIDED);
                                        replace_term = pfi_select;
                                        if (NIL != sksi_kb_accessors.logical_field_indexical_p(ms_arg)) {
                                            final SubLObject ms_pfis = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical(ms_arg, logical_schemata, physical_schemata);
                                            if (NIL == foundP) {
                                                SubLObject csome_list_var_$23 = ms_pfis;
                                                SubLObject ms_pfi = NIL;
                                                ms_pfi = csome_list_var_$23.first();
                                                while ((NIL == foundP) && (NIL != csome_list_var_$23)) {
                                                    final SubLObject ms_arg_where = dictionary.dictionary_lookup(pfi_where_expressions, ms_pfi, UNPROVIDED);
                                                    if (NIL != ms_arg_where) {
                                                        physical_field_name = sksi_csql_utilities.csql_expression_arg1(sksi_csql_utilities.csql_expression_arg1(ms_arg_where));
                                                        foundP = T;
                                                    }
                                                    csome_list_var_$23 = csome_list_var_$23.rest();
                                                    ms_pfi = csome_list_var_$23.first();
                                                } 
                                            }
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        pfi2 = csome_list_var.first();
                                    } 
                                }
                            }
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    } else
                        if (NIL != literal_meaning_sentence) {
                            final SubLObject ms_arg2 = cycl_utilities.formula_arg(literal_meaning_sentence, argnum, UNPROVIDED);
                            if (NIL != sksi_kb_accessors.logical_field_indexical_p(ms_arg2)) {
                                final SubLObject relevant_field_encoding_pf_indexical_pairs = sksi_incremental_edit.field_encodings_relevant_to_logical_field_indexical(ms_arg2, logical_schemata.first(), physical_schemata.first());
                                if (NIL == replace_term) {
                                    SubLObject csome_list_var2 = relevant_field_encoding_pf_indexical_pairs;
                                    SubLObject relevant_field_encoding_pf_indexical_pair = NIL;
                                    relevant_field_encoding_pf_indexical_pair = csome_list_var2.first();
                                    while ((NIL == replace_term) && (NIL != csome_list_var2)) {
                                        SubLObject current;
                                        final SubLObject datum = current = relevant_field_encoding_pf_indexical_pair;
                                        SubLObject field_encoding = NIL;
                                        SubLObject pf_indexical = NIL;
                                        destructuring_bind_must_consp(current, datum, $list69);
                                        field_encoding = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list69);
                                        pf_indexical = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            physical_field_name = sksi_kb_accessors.physical_field_indexical_name(pf_indexical);
                                            if (NIL != cycl_grammar.el_variable_p(arg)) {
                                                replace_term = $NOT_NULL;
                                            } else {
                                                replace_term = sksi_incremental_edit.sksi_incremental_edit_reformulate(arg, ms_arg2, field_encoding, literal_ks);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list69);
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        relevant_field_encoding_pf_indexical_pair = csome_list_var2.first();
                                    } 
                                }
                            }
                        }

                }
                if (NIL == replace_term) {
                    replace_term = arg;
                }
                if (NIL != failP) {
                    return values(NIL, NIL);
                }
                if (NIL != sksi_csql_utilities.csql_conjunction_p(literal_where_clause)) {
                    final SubLObject csql_subexp = find(physical_field_name, literal_where_clause, symbol_function(EQUAL), CADADR, UNPROVIDED, UNPROVIDED);
                    SubLObject new_csql_subexp = NIL;
                    if (NIL != csql_subexp) {
                        if (replace_term == $NOT_NULL) {
                            new_csql_subexp = sksi_csql_utilities.make_csql_expression($NOT_NULL, list(sksi_csql_utilities.csql_expression_arg1(csql_subexp)));
                        } else {
                            new_csql_subexp = list_utilities.replace_nth(TWO_INTEGER, replace_term, csql_subexp);
                        }
                        literal_where_clause = list_utilities.tree_substitute(literal_where_clause, csql_subexp, new_csql_subexp);
                    }
                } else
                    if (physical_field_name.equal(second(second(literal_where_clause)))) {
                        literal_where_clause = list_utilities.replace_nth(TWO_INTEGER, replace_term, literal_where_clause);
                    }

            }
        }
        if (NIL != sksi_csql_utilities.csql_conjunction_p(literal_where_clause)) {
            final SubLObject conjuncts = sksi_csql_utilities.csql_conjunction_conjuncts(literal_where_clause);
            SubLObject new_conjuncts = NIL;
            SubLObject cdolist_list_var2 = conjuncts;
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL == list_utilities.tree_find($VALUE, conjunct, UNPROVIDED, UNPROVIDED)) {
                    new_conjuncts = cons(conjunct, new_conjuncts);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                conjunct = cdolist_list_var2.first();
            } 
            where_clause = sksi_csql_utilities.csql_conjoin_expressions(nreverse(new_conjuncts));
        } else
            if (NIL == list_utilities.tree_find($VALUE, literal_where_clause, UNPROVIDED, UNPROVIDED)) {
                where_clause = literal_where_clause;
            }

        return values(where_clause, from_clause);
    }

    public static SubLObject get_pair_expression(final SubLObject csql_operator, final SubLObject physical_field_indexical_list_pair, final SubLObject sks, SubLObject lit, SubLObject tac) {
        if (lit == UNPROVIDED) {
            lit = NIL;
        }
        if (tac == UNPROVIDED) {
            tac = NIL;
        }
        SubLObject left_pfi_list = NIL;
        SubLObject right_pfi_list = NIL;
        destructuring_bind_must_consp(physical_field_indexical_list_pair, physical_field_indexical_list_pair, $list73);
        left_pfi_list = physical_field_indexical_list_pair.first();
        SubLObject current = physical_field_indexical_list_pair.rest();
        destructuring_bind_must_consp(current, physical_field_indexical_list_pair, $list73);
        right_pfi_list = current.first();
        current = current.rest();
        if (NIL == current) {
            return apply_csql_operator_to_pfi_list_pair(csql_operator, left_pfi_list, right_pfi_list, sks, lit, lit, tac);
        }
        cdestructuring_bind_error(physical_field_indexical_list_pair, $list73);
        return NIL;
    }

    public static SubLObject binary_predicate_memoized_internal(final SubLObject v_object) {
        return kb_accessors.binary_predicateP(v_object);
    }

    public static SubLObject binary_predicate_memoized(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return binary_predicate_memoized_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, BINARY_PREDICATE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), BINARY_PREDICATE_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, BINARY_PREDICATE_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(binary_predicate_memoized_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject apply_csql_operator_to_pfi_list_pair(final SubLObject operator, final SubLObject pfi_list0, final SubLObject pfi_list1, final SubLObject sks, SubLObject lit0, SubLObject lit1, SubLObject tac) {
        if (lit0 == UNPROVIDED) {
            lit0 = NIL;
        }
        if (lit1 == UNPROVIDED) {
            lit1 = NIL;
        }
        if (tac == UNPROVIDED) {
            tac = NIL;
        }
        if (((NIL != sksi_csql_utilities.csql_where_clause_reflexive_comparison_operator_p(operator)) && lit0.equal(lit1)) && pfi_list0.equal(pfi_list1)) {
            return sksi_csql_utilities.$csql_true$.getGlobalValue();
        }
        if (((NIL != sksi_csql_utilities.csql_where_clause_anti_reflexive_comparison_operator_p(operator)) && lit0.equal(lit1)) && pfi_list0.equal(pfi_list1)) {
            return sksi_csql_utilities.$csql_false$.getGlobalValue();
        }
        SubLObject multi_alist = NIL;
        SubLObject pfi_expressions = NIL;
        if (NIL == list_utilities.same_length_p(pfi_list0, pfi_list1)) {
            sublisp_throw($SKSI_LIST_LENGTH_MISMATCH, list(pfi_list0, pfi_list1));
        }
        SubLObject pfi0 = NIL;
        SubLObject pfi0_$24 = NIL;
        SubLObject pfi2 = NIL;
        SubLObject pfi1_$25 = NIL;
        pfi0 = pfi_list0;
        pfi0_$24 = pfi0.first();
        pfi2 = pfi_list1;
        pfi1_$25 = pfi2.first();
        while ((NIL != pfi2) || (NIL != pfi0)) {
            final SubLObject f_t_tuples0 = physical_field_indexical_field_table_tuples(pfi0_$24, sks, lit0, tac);
            final SubLObject f_t_tuples2 = physical_field_indexical_field_table_tuples(pfi1_$25, sks, lit1, tac);
            final SubLObject sym0 = gensym(UNPROVIDED);
            final SubLObject sym2 = gensym(UNPROVIDED);
            if ((NIL != f_t_tuples0) && (NIL != f_t_tuples2)) {
                multi_alist = cons(cons(sym0, f_t_tuples0), multi_alist);
                multi_alist = cons(cons(sym2, f_t_tuples2), multi_alist);
                pfi_expressions = cons(list(operator, bq_cons($FIELD, sym0), bq_cons($FIELD, sym2)), pfi_expressions);
            }
            pfi0 = pfi0.rest();
            pfi0_$24 = pfi0.first();
            pfi2 = pfi2.rest();
            pfi1_$25 = pfi2.first();
        } 
        final SubLObject pfi_expression = (NIL != sksi_csql_utilities.csql_where_clause_negated_comparison_operator_p(operator)) ? sksi_csql_utilities.csql_disjoin_expressions(pfi_expressions) : sksi_csql_utilities.csql_conjoin_expressions(pfi_expressions);
        return sksi_csql_utilities.csql_conjoin_expressions(list_utilities.multi_sublis(multi_alist, pfi_expression, symbol_function(EQ), UNPROVIDED));
    }

    public static SubLObject apply_csql_operator_to_pfi_list_value_pair(final SubLObject operator, final SubLObject pfi_list, final SubLObject value, final SubLObject pfi_encodings, final SubLObject sks, SubLObject mt, SubLObject lit, SubLObject tac, SubLObject reverseP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (lit == UNPROVIDED) {
            lit = NIL;
        }
        if (tac == UNPROVIDED) {
            tac = NIL;
        }
        if (reverseP == UNPROVIDED) {
            reverseP = NIL;
        }
        final SubLObject aggregation_fn = (NIL != sksi_csql_utilities.csql_where_clause_negated_comparison_operator_p(operator)) ? CSQL_DISJOIN_EXPRESSIONS : CSQL_CONJOIN_EXPRESSIONS;
        SubLObject expressions = NIL;
        SubLObject multi_alist = NIL;
        SubLObject cdolist_list_var = pfi_list;
        SubLObject pfi = NIL;
        pfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject f_t_tuples = physical_field_indexical_field_table_tuples(pfi, sks, lit, tac);
            final SubLObject encodings = dictionary.dictionary_lookup(pfi_encodings, pfi, UNPROVIDED);
            SubLObject pfi_expressions = NIL;
            multi_alist = cons(cons(pfi, f_t_tuples), multi_alist);
            SubLObject cdolist_list_var_$26 = encodings;
            SubLObject encoding = NIL;
            encoding = cdolist_list_var_$26.first();
            while (NIL != cdolist_list_var_$26) {
                final SubLObject lfis = sksi_field_translation_utilities.encoding_logical_field_indexicals(encoding);
                SubLObject alist = NIL;
                SubLObject cdolist_list_var_$27 = lfis;
                SubLObject lfi = NIL;
                lfi = cdolist_list_var_$27.first();
                while (NIL != cdolist_list_var_$27) {
                    alist = cons(cons(lfi, value), alist);
                    cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                    lfi = cdolist_list_var_$27.first();
                } 
                final SubLObject reformed = sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate(alist, encoding, sks, mt);
                if (NIL != sksi_unreformulatable_p(reformed)) {
                    sublisp_throw($SKSI_UNREFORMULATABLE, value);
                }
                if (NIL != reverseP) {
                    pfi_expressions = cons(list(operator, reformed, bq_cons($FIELD, pfi)), pfi_expressions);
                } else {
                    pfi_expressions = cons(list(operator, bq_cons($FIELD, pfi), reformed), pfi_expressions);
                }
                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                encoding = cdolist_list_var_$26.first();
            } 
            expressions = cons(sksi_csql_utilities.csql_conjoin_expressions(pfi_expressions), expressions);
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        } 
        return sksi_csql_utilities.csql_conjoin_expressions(list_utilities.multi_sublis(multi_alist, funcall(aggregation_fn, expressions), symbol_function(EQ), UNPROVIDED));
    }

    public static SubLObject physical_field_indexicals_data_types(final SubLObject physical_field_indexicals) {
        SubLObject data_types = NIL;
        SubLObject cdolist_list_var = physical_field_indexicals;
        SubLObject physical_field_indexical = NIL;
        physical_field_indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            data_types = cons(physical_field_indexical_data_type(physical_field_indexical), data_types);
            cdolist_list_var = cdolist_list_var.rest();
            physical_field_indexical = cdolist_list_var.first();
        } 
        return nreverse(data_types);
    }

    public static SubLObject physical_field_indexical_data_type(final SubLObject physical_field_indexical) {
        final SubLObject physical_field = sksi_kb_accessors.physical_field_for_indexical(physical_field_indexical);
        return sksi_kb_accessors.physical_field_data_type(physical_field);
    }

    public static SubLObject expression_contains_logical_field_indexicalP(final SubLObject logical_field_indexical, final SubLObject expression) {
        return cycl_utilities.expression_find(logical_field_indexical, expression, T, symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject iterate_over_list_of_lists(final SubLObject lists, final SubLObject function, final SubLObject args, SubLObject return_valueP) {
        if (return_valueP == UNPROVIDED) {
            return_valueP = NIL;
        }
        return NIL != return_valueP ? iterate_over_list_of_lists_return_value(lists, function, args) : iterate_over_list_of_lists_side_effect(NIL, lists, function, args);
    }

    public static SubLObject iterate_over_list_of_lists_side_effect(final SubLObject so_far, final SubLObject remaining, final SubLObject function, final SubLObject args) {
        if (NIL == remaining) {
            apply(function, so_far, args);
        } else {
            SubLObject cdolist_list_var = remaining.first();
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                iterate_over_list_of_lists_side_effect(list_utilities.snoc(item, so_far), remaining.rest(), function, args);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject iterate_over_list_of_lists_return_value(final SubLObject lists, final SubLObject function, final SubLObject args) {
        final SubLObject paths = generate_paths(lists, UNPROVIDED);
        SubLObject results = NIL;
        SubLObject cdolist_list_var = paths;
        SubLObject path = NIL;
        path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            results = cons(apply(function, path, args), results);
            cdolist_list_var = cdolist_list_var.rest();
            path = cdolist_list_var.first();
        } 
        return results;
    }

    public static SubLObject generate_paths(final SubLObject lists, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == UNPROVIDED) {
            remove_duplicatesP = T;
        }
        if (NIL != remove_duplicatesP) {
            SubLObject new_lists = NIL;
            SubLObject cdolist_list_var = lists;
            SubLObject list = NIL;
            list = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                new_lists = cons(list_utilities.fast_delete_duplicates(list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), new_lists);
                cdolist_list_var = cdolist_list_var.rest();
                list = cdolist_list_var.first();
            } 
            return generate_paths_int(nreverse(new_lists));
        }
        return generate_paths_int(lists);
    }

    public static SubLObject generate_paths_int(final SubLObject lists) {
        SubLObject paths = NIL;
        if (NIL == lists.rest()) {
            SubLObject cdolist_list_var = lists.first();
            SubLObject elt = NIL;
            elt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                paths = cons(cons(elt, NIL), paths);
                cdolist_list_var = cdolist_list_var.rest();
                elt = cdolist_list_var.first();
            } 
        } else {
            final SubLObject sub_paths = generate_paths(lists.rest(), UNPROVIDED);
            SubLObject cdolist_list_var2 = lists.first();
            SubLObject elt2 = NIL;
            elt2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$28 = sub_paths;
                SubLObject sub_path = NIL;
                sub_path = cdolist_list_var_$28.first();
                while (NIL != cdolist_list_var_$28) {
                    paths = cons(cons(elt2, sub_path), paths);
                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                    sub_path = cdolist_list_var_$28.first();
                } 
                cdolist_list_var2 = cdolist_list_var2.rest();
                elt2 = cdolist_list_var2.first();
            } 
        }
        return paths;
    }

    public static SubLObject non_null_element_positions(final SubLObject list) {
        SubLObject positions = NIL;
        SubLObject list_var = NIL;
        SubLObject element = NIL;
        SubLObject position = NIL;
        list_var = list;
        element = list_var.first();
        for (position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , element = list_var.first() , position = add(ONE_INTEGER, position)) {
            if (NIL != element) {
                positions = cons(position, positions);
            }
        }
        return nreverse(positions);
    }

    public static SubLObject declare_sksi_query_utilities_file() {
        declareFunction(me, "register_combined_sksi_removal_modules_for_sks", "REGISTER-COMBINED-SKSI-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        declareFunction(me, "deregister_combined_sksi_removal_modules_for_sks", "DEREGISTER-COMBINED-SKSI-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        declareFunction(me, "deregister_all_combined_sksi_removal_modules", "DEREGISTER-ALL-COMBINED-SKSI-REMOVAL-MODULES", 0, 1, false);
        declareFunction(me, "combined_sksi_removal_modules_count", "COMBINED-SKSI-REMOVAL-MODULES-COUNT", 0, 0, false);
        declareFunction(me, "some_sksi_removal_module_registeredP", "SOME-SKSI-REMOVAL-MODULE-REGISTERED?", 0, 0, false);
        declareFunction(me, "clear_sksi_query_costs", "CLEAR-SKSI-QUERY-COSTS", 0, 0, false);
        declareFunction(me, "look_up_sksi_query_information", "LOOK-UP-SKSI-QUERY-INFORMATION", 2, 0, false);
        declareFunction(me, "look_up_sksi_query_cost", "LOOK-UP-SKSI-QUERY-COST", 3, 0, false);
        declareFunction(me, "look_up_sksi_query_cost_problem_query", "LOOK-UP-SKSI-QUERY-COST-PROBLEM-QUERY", 2, 1, false);
        declareFunction(me, "look_up_sksi_query_cost_contextualized_dnf", "LOOK-UP-SKSI-QUERY-COST-CONTEXTUALIZED-DNF", 2, 1, false);
        declareFunction(me, "look_up_sksi_query_cost_asent_sense", "LOOK-UP-SKSI-QUERY-COST-ASENT-SENSE", 3, 1, false);
        declareFunction(me, "update_sksi_query_cost", "UPDATE-SKSI-QUERY-COST", 3, 1, false);
        declareFunction(me, "update_sksi_query_cost_problem_query", "UPDATE-SKSI-QUERY-COST-PROBLEM-QUERY", 3, 0, false);
        declareFunction(me, "update_sksi_query_cost_contextualized_dnf", "UPDATE-SKSI-QUERY-COST-CONTEXTUALIZED-DNF", 3, 0, false);
        declareFunction(me, "update_sksi_query_cost_asent_sense", "UPDATE-SKSI-QUERY-COST-ASENT-SENSE", 4, 0, false);
        declareFunction(me, "sksi_cost_reformat_problem_query_internal", "SKSI-COST-REFORMAT-PROBLEM-QUERY-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_cost_reformat_problem_query", "SKSI-COST-REFORMAT-PROBLEM-QUERY", 1, 0, false);
        declareFunction(me, "sksi_cost_reformat_contextualized_dnf", "SKSI-COST-REFORMAT-CONTEXTUALIZED-DNF", 1, 0, false);
        declareFunction(me, "sksi_cost_reformat_asent_sense", "SKSI-COST-REFORMAT-ASENT-SENSE", 2, 0, false);
        declareFunction(me, "neutralize_query", "NEUTRALIZE-QUERY", 1, 0, false);
        declareFunction(me, "neutralize_query_clause", "NEUTRALIZE-QUERY-CLAUSE", 1, 0, false);
        declareFunction(me, "neutralize_literal", "NEUTRALIZE-LITERAL", 1, 0, false);
        declareFunction(me, "guess_cost_from_lrs_cardinality_gafs", "GUESS-COST-FROM-LRS-CARDINALITY-GAFS", 3, 0, false);
        declareFunction(me, "guess_cost_from_rs_cardinality_gafs", "GUESS-COST-FROM-RS-CARDINALITY-GAFS", 3, 3, false);
        declareFunction(me, "cache_cost_from_lrs_cardinality_wrt_value_gafs", "CACHE-COST-FROM-LRS-CARDINALITY-WRT-VALUE-GAFS", 5, 0, false);
        declareFunction(me, "sksi_cost_recording_suspended_for_current_iteratorP", "SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR?", 0, 0, false);
        declareFunction(me, "sksi_cost_recording_suspended_for_current_iterator_initial_state", "SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR-INITIAL-STATE", 0, 0, false);
        declareFunction(me, "sksi_suspend_cost_recording_for_current_iterator", "SKSI-SUSPEND-COST-RECORDING-FOR-CURRENT-ITERATOR", 0, 0, false);
        declareFunction(me, "generate_sksi_conjunctive_cost_recording_iterator", "GENERATE-SKSI-CONJUNCTIVE-COST-RECORDING-ITERATOR", 2, 0, false);
        declareFunction(me, "generate_sksi_single_literal_cost_recording_iterator", "GENERATE-SKSI-SINGLE-LITERAL-COST-RECORDING-ITERATOR", 2, 4, false);
        declareFunction(me, "sksi_cost_recording_iterator_p", "SKSI-COST-RECORDING-ITERATOR-P", 1, 0, false);
        declareFunction(me, "new_sksi_cost_recording_iterator", "NEW-SKSI-COST-RECORDING-ITERATOR", 2, 0, false);
        declareFunction(me, "sksi_cost_recording_iterator_done", "SKSI-COST-RECORDING-ITERATOR-DONE", 1, 0, false);
        new sksi_query_utilities.$sksi_cost_recording_iterator_done$UnaryFunction();
        declareFunction(me, "sksi_cost_recording_iterator_next", "SKSI-COST-RECORDING-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "sksi_cost_recording_iterator_finalize", "SKSI-COST-RECORDING-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "update_sksi_query_cost_store_for_current_tactic", "UPDATE-SKSI-QUERY-COST-STORE-FOR-CURRENT-TACTIC", 1, 0, false);
        declareFunction(me, "sksi_cost_recording_iterator_size", "SKSI-COST-RECORDING-ITERATOR-SIZE", 1, 0, false);
        declareFunction(me, "sksi_reformulation_check", "SKSI-REFORMULATION-CHECK", 1, 0, false);
        declareFunction(me, "sksi_unreformulatable_p", "SKSI-UNREFORMULATABLE-P", 1, 0, false);
        declareFunction(me, "sksi_not_containing_nil_p", "SKSI-NOT-CONTAINING-NIL-P", 1, 0, false);
        declareFunction(me, "get_sksi_removal_module_cost", "GET-SKSI-REMOVAL-MODULE-COST", 3, 1, false);
        declareFunction(me, "sksi_sentence_cost", "SKSI-SENTENCE-COST", 2, 1, false);
        declareFunction(me, "sksi_pos_sentence_cost_internal", "SKSI-POS-SENTENCE-COST-INTERNAL", 3, 1, false);
        declareFunction(me, "sksi_pos_sentence_cost", "SKSI-POS-SENTENCE-COST", 3, 1, false);
        declareFunction(me, "comparison_literal_p", "COMPARISON-LITERAL-P", 1, 0, false);
        declareFunction(me, "sksi_comparison_literal_supported_predicate_p_internal", "SKSI-COMPARISON-LITERAL-SUPPORTED-PREDICATE-P-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_comparison_literal_supported_predicate_p", "SKSI-COMPARISON-LITERAL-SUPPORTED-PREDICATE-P", 1, 0, false);
        declareFunction(me, "contextualized_comparison_literal_p", "CONTEXTUALIZED-COMPARISON-LITERAL-P", 1, 0, false);
        declareFunction(me, "comparison_sentence_p", "COMPARISON-SENTENCE-P", 1, 0, false);
        declareFunction(me, "comparison_operator_forbidden_for_physical_field_indexicalP", "COMPARISON-OPERATOR-FORBIDDEN-FOR-PHYSICAL-FIELD-INDEXICAL?", 2, 0, false);
        declareFunction(me, "comparison_operator_forbidden_for_some_physical_field_indexicalP", "COMPARISON-OPERATOR-FORBIDDEN-FOR-SOME-PHYSICAL-FIELD-INDEXICAL?", 2, 0, false);
        declareFunction(me, "sksi_unknown_sentence_literal_p_internal", "SKSI-UNKNOWN-SENTENCE-LITERAL-P-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_unknown_sentence_literal_p", "SKSI-UNKNOWN-SENTENCE-LITERAL-P", 1, 0, false);
        declareFunction(me, "physical_field_indexical_field_table_tuples", "PHYSICAL-FIELD-INDEXICAL-FIELD-TABLE-TUPLES", 1, 3, false);
        declareFunction(me, "sk_sources_for_physical_schema_internal", "SK-SOURCES-FOR-PHYSICAL-SCHEMA-INTERNAL", 1, 1, false);
        declareFunction(me, "sk_sources_for_physical_schema", "SK-SOURCES-FOR-PHYSICAL-SCHEMA", 1, 1, false);
        declareFunction(me, "get_from_expression_from_antecedent_meaning_sentence", "GET-FROM-EXPRESSION-FROM-ANTECEDENT-MEANING-SENTENCE", 4, 1, false);
        declareFunction(me, "get_from_expression_from_antecedent_meaning_sentence_int", "GET-FROM-EXPRESSION-FROM-ANTECEDENT-MEANING-SENTENCE-INT", 8, 0, false);
        declareFunction(me, "get_where_expression_from_antecedent_meaning_sentence", "GET-WHERE-EXPRESSION-FROM-ANTECEDENT-MEANING-SENTENCE", 4, 2, false);
        declareFunction(me, "get_where_expression_from_antecedent_meaning_sentence_int", "GET-WHERE-EXPRESSION-FROM-ANTECEDENT-MEANING-SENTENCE-INT", 10, 0, false);
        declareFunction(me, "possibly_reorder_conjunctive_antecedent_sentence_conjunts", "POSSIBLY-REORDER-CONJUNCTIVE-ANTECEDENT-SENTENCE-CONJUNTS", 1, 0, false);
        declareFunction(me, "get_where_expression_from_sentence_recursive", "GET-WHERE-EXPRESSION-FROM-SENTENCE-RECURSIVE", 10, 1, false);
        declareFunction(me, "evaluate_literal_p", "EVALUATE-LITERAL-P", 1, 0, false);
        declareFunction(me, "get_where_expression_from_literal", "GET-WHERE-EXPRESSION-FROM-LITERAL", 10, 1, false);
        declareFunction(me, "get_where_expression_from_comparison_literal", "GET-WHERE-EXPRESSION-FROM-COMPARISON-LITERAL", 9, 0, false);
        declareFunction(me, "get_where_expression_from_comparison_literal_single_lfi", "GET-WHERE-EXPRESSION-FROM-COMPARISON-LITERAL-SINGLE-LFI", 8, 0, false);
        declareFunction(me, "get_where_expression_from_comparison_literal_double_lfis", "GET-WHERE-EXPRESSION-FROM-COMPARISON-LITERAL-DOUBLE-LFIS", 8, 0, false);
        declareFunction(me, "get_where_expression_from_evaluate_literal", "GET-WHERE-EXPRESSION-FROM-EVALUATE-LITERAL", 9, 1, false);
        declareFunction(me, "get_where_expression_from_evaluate_literal_int", "GET-WHERE-EXPRESSION-FROM-EVALUATE-LITERAL-INT", 9, 1, false);
        declareFunction(me, "get_csql_expression_for_evaluatable_expression", "GET-CSQL-EXPRESSION-FOR-EVALUATABLE-EXPRESSION", 6, 3, false);
        declareFunction(me, "get_csql_expression_for_evaluatable_expression_var", "GET-CSQL-EXPRESSION-FOR-EVALUATABLE-EXPRESSION-VAR", 4, 0, false);
        declareFunction(me, "make_csql_field_expression_for_pfi", "MAKE-CSQL-FIELD-EXPRESSION-FOR-PFI", 1, 2, false);
        declareFunction(me, "get_where_expression_from_other_literal", "GET-WHERE-EXPRESSION-FROM-OTHER-LITERAL", 10, 0, false);
        declareFunction(me, "get_where_expression_from_meaning_sentence", "GET-WHERE-EXPRESSION-FROM-MEANING-SENTENCE", 8, 7, false);
        declareFunction(me, "get_pair_expression", "GET-PAIR-EXPRESSION", 3, 2, false);
        declareFunction(me, "binary_predicate_memoized_internal", "BINARY-PREDICATE-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "binary_predicate_memoized", "BINARY-PREDICATE-MEMOIZED", 1, 0, false);
        declareFunction(me, "apply_csql_operator_to_pfi_list_pair", "APPLY-CSQL-OPERATOR-TO-PFI-LIST-PAIR", 4, 3, false);
        declareFunction(me, "apply_csql_operator_to_pfi_list_value_pair", "APPLY-CSQL-OPERATOR-TO-PFI-LIST-VALUE-PAIR", 5, 4, false);
        declareFunction(me, "physical_field_indexicals_data_types", "PHYSICAL-FIELD-INDEXICALS-DATA-TYPES", 1, 0, false);
        declareFunction(me, "physical_field_indexical_data_type", "PHYSICAL-FIELD-INDEXICAL-DATA-TYPE", 1, 0, false);
        declareFunction(me, "expression_contains_logical_field_indexicalP", "EXPRESSION-CONTAINS-LOGICAL-FIELD-INDEXICAL?", 2, 0, false);
        declareFunction(me, "iterate_over_list_of_lists", "ITERATE-OVER-LIST-OF-LISTS", 3, 1, false);
        declareFunction(me, "iterate_over_list_of_lists_side_effect", "ITERATE-OVER-LIST-OF-LISTS-SIDE-EFFECT", 4, 0, false);
        declareFunction(me, "iterate_over_list_of_lists_return_value", "ITERATE-OVER-LIST-OF-LISTS-RETURN-VALUE", 3, 0, false);
        declareFunction(me, "generate_paths", "GENERATE-PATHS", 1, 1, false);
        declareFunction(me, "generate_paths_int", "GENERATE-PATHS-INT", 1, 0, false);
        declareFunction(me, "non_null_element_positions", "NON-NULL-ELEMENT-POSITIONS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_query_utilities_file() {
        deflexical("*SKSI-QUERY-HISTORY-LIMIT*", TEN_INTEGER);
        deflexical("*SKSI-QUERY-COSTS*", SubLTrampolineFile.maybeDefault($sksi_query_costs$, $sksi_query_costs$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        defparameter("*SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR?*", NIL);
        deflexical("*SKSI-DEFAULT-QUERY-COST*", SEVENTEEN_INTEGER);
        return NIL;
    }

    public static SubLObject setup_sksi_query_utilities_file() {
        declare_defglobal($sksi_query_costs$);
        memoization_state.note_memoized_function(SKSI_COST_REFORMAT_PROBLEM_QUERY);
        memoization_state.note_memoized_function(SKSI_POS_SENTENCE_COST);
        memoization_state.note_memoized_function(SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P);
        memoization_state.note_memoized_function(SKSI_UNKNOWN_SENTENCE_LITERAL_P);
        memoization_state.note_memoized_function(SK_SOURCES_FOR_PHYSICAL_SCHEMA);
        memoization_state.note_memoized_function(BINARY_PREDICATE_MEMOIZED);
        sunit_external.define_test_category($$$SKSI_Query_Utilities_Category, list($$$SKSI_Category));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_query_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_query_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_query_utilities_file();
    }

    static {





















































































    }

    public static final class $sksi_cost_recording_iterator_done$UnaryFunction extends UnaryFunction {
        public $sksi_cost_recording_iterator_done$UnaryFunction() {
            super(extractFunctionNamed("SKSI-COST-RECORDING-ITERATOR-DONE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sksi_cost_recording_iterator_done(arg1);
        }
    }
}

/**
 * Total time: 771 ms
 */
