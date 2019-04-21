package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.sunit_external;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_query_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities";
    public static final String myFingerPrint = "8432e58c748b87291a29795069ef7f7597e7f234e5cff3094ac06489aa73389b";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 4412L)
    private static SubLSymbol $sksi_query_history_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 4617L)
    private static SubLSymbol $sksi_query_costs$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 13611L)
    public static SubLSymbol $sksi_cost_recording_suspended_for_current_iteratorP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 18231L)
    public static SubLSymbol $sksi_default_query_cost$;
    private static final SubLSymbol $sym0$_SKSI_QUERY_COSTS_;
    private static final SubLSymbol $sym1$SKSI_COST_REFORMAT_PROBLEM_QUERY;
    private static final SubLSymbol $sym2$FIRST;
    private static final SubLInteger $int3$1000;
    private static final SubLObject $const4$BaseKB;
    private static final SubLSymbol $sym5$NEUTRALIZE_QUERY_CLAUSE;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$NEUTRALIZE_LITERAL;
    private static final SubLSymbol $kw8$FULLY_BOUND;
    private static final SubLSymbol $sym9$VARIABLE_P;
    private static final SubLSymbol $sym10$SETS_EQUAL_;
    private static final SubLString $str11$__logicalResultSetCardinalityWRTV;
    private static final SubLSymbol $kw12$POS;
    private static final SubLSymbol $kw13$SUSPENDED;
    private static final SubLSymbol $kw14$IN_PROGRESS;
    private static final SubLString $str15$Attempted_to_suspend_SKSI_cost_re;
    private static final SubLSymbol $kw16$NORMAL;
    private static final SubLSymbol $sym17$SKSI_COST_RECORDING_ITERATOR_NEXT;
    private static final SubLSymbol $sym18$SKSI_COST_RECORDING_ITERATOR_DONE;
    private static final SubLSymbol $sym19$SKSI_COST_RECORDING_ITERATOR_FINALIZE;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$SKSI_COST_RECORDING_ITERATOR_P;
    private static final SubLSymbol $sym22$SKSI_UNREFORMULATABLE_P;
    private static final SubLSymbol $kw23$UNREFORMULATABLE;
    private static final SubLSymbol $kw24$NEG;
    private static final SubLSymbol $sym25$SKSI_POS_SENTENCE_COST;
    private static final SubLSymbol $sym26$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const27$EverythingPSC;
    private static final SubLSymbol $sym28$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const29$InferencePSC;
    private static final SubLSymbol $sym30$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
    private static final SubLSymbol $sym31$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym32$SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P;
    private static final SubLSymbol $sym33$COMPARISON_LITERAL_P;
    private static final SubLSymbol $sym34$SKSI_UNKNOWN_SENTENCE_LITERAL_P;
    private static final SubLObject $const35$sksiUnknownSentence;
    private static final SubLInteger $int36$2048;
    private static final SubLSymbol $kw37$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL;
    private static final SubLSymbol $sym38$SK_SOURCES_FOR_PHYSICAL_SCHEMA;
    private static final SubLSymbol $sym39$LFI_ALIAS_FN_NAUT_P;
    private static final SubLSymbol $kw40$IGNORE;
    private static final SubLObject $const41$and;
    private static final SubLObject $const42$CSQLAnd;
    private static final SubLObject $const43$or;
    private static final SubLObject $const44$CSQLOr;
    private static final SubLObject $const45$not;
    private static final SubLObject $const46$CSQLNot;
    private static final SubLObject $const47$implies;
    private static final SubLObject $const48$equiv;
    private static final SubLObject $const49$evaluate;
    private static final SubLSymbol $kw50$SKSI_MISSING_ENCODINGS;
    private static final SubLSymbol $kw51$SKSI_UNREFORMULATABLE;
    private static final SubLSymbol $kw52$FIELD;
    private static final SubLSymbol $kw53$SKSI_MISSING_DECODINGS;
    private static final SubLSymbol $sym54$DECODING_PHYSICAL_FIELD_INDEXICALS_ORDERED;
    private static final SubLSymbol $kw55$EVAL;
    private static final SubLSymbol $sym56$LFI_FORT_FOR_LFI;
    private static final SubLObject $const57$Time_Quantity;
    private static final SubLObject $const58$CSQLSecondsDurationFn;
    private static final SubLObject $const59$CSQLMonthsDurationFn;
    private static final SubLObject $const60$CSQLYearsDurationFn;
    private static final SubLString $str61$__SKSI__A_;
    private static final SubLString $str62$SKSI_could_not_convert___Time_Qua;
    private static final SubLObject $const63$QuantityConversionFn;
    private static final SubLObject $const64$CSQLTimesFn;
    private static final SubLSymbol $sym65$PHYSICAL_FIELD_INDEXICAL_P;
    private static final SubLSymbol $kw66$RAW;
    private static final SubLSymbol $sym67$PFI_ALIAS_FN_NAUT_P;
    private static final SubLSymbol $sym68$CONTEXTUALIZED_ASENT_ASENT;
    private static final SubLList $list69;
    private static final SubLSymbol $kw70$NOT_NULL;
    private static final SubLSymbol $sym71$CADADR;
    private static final SubLSymbol $kw72$VALUE;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$BINARY_PREDICATE_MEMOIZED;
    private static final SubLSymbol $kw75$SKSI_LIST_LENGTH_MISMATCH;
    private static final SubLSymbol $sym76$CSQL_DISJOIN_EXPRESSIONS;
    private static final SubLSymbol $sym77$CSQL_CONJOIN_EXPRESSIONS;
    private static final SubLString $str78$SKSI_Query_Utilities_Category;
    private static final SubLString $str79$SKSI_Category;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 1252L)
    public static SubLObject register_combined_sksi_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject add_to_allowed_ksesP) {
        if (mapping_mt == sksi_query_utilities.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_query_utilities.NIL;
        }
        if (add_to_allowed_ksesP == sksi_query_utilities.UNPROVIDED) {
            add_to_allowed_ksesP = (SubLObject)sksi_query_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = (SubLObject)sksi_query_utilities.NIL;
        SubLObject pm_count = (SubLObject)sksi_query_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sksi_query_utilities.NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                thread.resetMultipleValues();
                final SubLObject rm_count_$1 = sksi_removal_module_generation.register_sksi_removal_modules_for_sks(sks, mapping_mt, (SubLObject)sksi_query_utilities.T, (SubLObject)sksi_query_utilities.NIL);
                final SubLObject pm_count_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                rm_count = rm_count_$1;
                pm_count = pm_count_$2;
                rm_count = Numbers.add(new SubLObject[] { rm_count, sksi_conjunctive_removal_module_generation.register_sksi_conjunctive_removal_modules_for_sks(sks, mapping_mt, (SubLObject)sksi_query_utilities.UNPROVIDED), corba_module_utilities.register_sksi_corba_modules_for_sks(sks, mapping_mt, (SubLObject)sksi_query_utilities.UNPROVIDED), sksi_sparql_removal_module_generation.register_sksi_sparql_removal_modules_for_sks(sks, mapping_mt, (SubLObject)sksi_query_utilities.UNPROVIDED) });
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_query_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (sksi_query_utilities.NIL != add_to_allowed_ksesP) {
            sksi_infrastructure_utilities.add_to_external_sources_activated_in_image(sks, (SubLObject)sksi_query_utilities.UNPROVIDED);
        }
        return Values.values(rm_count, pm_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 2250L)
    public static SubLObject deregister_combined_sksi_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject remove_from_allowed_ksesP) {
        if (mapping_mt == sksi_query_utilities.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_query_utilities.NIL;
        }
        if (remove_from_allowed_ksesP == sksi_query_utilities.UNPROVIDED) {
            remove_from_allowed_ksesP = (SubLObject)sksi_query_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = (SubLObject)sksi_query_utilities.NIL;
        SubLObject pm_count = (SubLObject)sksi_query_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sksi_query_utilities.NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                thread.resetMultipleValues();
                final SubLObject rm_count_$4 = sksi_removal_module_generation.deregister_sksi_removal_modules_for_sks(sks, mapping_mt, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
                final SubLObject pm_count_$5 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                rm_count = rm_count_$4;
                pm_count = pm_count_$5;
                rm_count = Numbers.add(new SubLObject[] { rm_count, sksi_conjunctive_removal_module_generation.deregister_sksi_conjunctive_removal_modules_for_sks(sks, mapping_mt, (SubLObject)sksi_query_utilities.UNPROVIDED), corba_module_utilities.deregister_sksi_corba_modules_for_sks(sks, mapping_mt, (SubLObject)sksi_query_utilities.UNPROVIDED), sksi_sparql_removal_module_generation.deregister_sksi_sparql_removal_modules_for_just_sks(sks, mapping_mt) });
            }
            finally {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_query_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (sksi_query_utilities.NIL != remove_from_allowed_ksesP) {
            sksi_infrastructure_utilities.remove_from_external_sources_activated_in_image(sks, (SubLObject)sksi_query_utilities.UNPROVIDED);
        }
        return Values.values(rm_count, pm_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 3162L)
    public static SubLObject deregister_all_combined_sksi_removal_modules(SubLObject clear_allowed_ksesP) {
        if (clear_allowed_ksesP == sksi_query_utilities.UNPROVIDED) {
            clear_allowed_ksesP = (SubLObject)sksi_query_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = (SubLObject)sksi_query_utilities.NIL;
        SubLObject pm_count = (SubLObject)sksi_query_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject rm_count_$7 = sksi_removal_module_generation.deregister_all_sksi_removal_modules();
        final SubLObject pm_count_$8 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        rm_count = rm_count_$7;
        pm_count = pm_count_$8;
        rm_count = Numbers.add(new SubLObject[] { rm_count, sksi_conjunctive_removal_module_generation.deregister_all_sksi_conjunctive_removal_modules(), corba_module_utilities.deregister_all_sksi_corba_modules(), sksi_sparql_removal_module_generation.deregister_all_sksi_sparql_removal_modules() });
        if (sksi_query_utilities.NIL != clear_allowed_ksesP) {
            sksi_infrastructure_utilities.clear_external_sources_activated_in_image();
        }
        return Values.values(rm_count, pm_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 3794L)
    public static SubLObject combined_sksi_removal_modules_count() {
        return Numbers.add(new SubLObject[] { sksi_removal_module_generation.sksi_modules_count(), sksi_conjunctive_removal_module_generation.sksi_conjunctive_removal_modules_count(), corba_module_utilities.sksi_corba_modules_count(), sksi_sparql_removal_module_generation.sksi_sparql_removal_modules_count() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 4061L)
    public static SubLObject some_sksi_removal_module_registeredP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_query_utilities.NIL != sksi_removal_module_generation.some_sksi_single_literal_removal_module_registeredP() || sksi_query_utilities.NIL != sksi_conjunctive_removal_module_generation.some_sksi_conjunctive_removal_module_registeredP() || sksi_query_utilities.NIL != corba_module_utilities.some_sksi_corba_removal_module_registeredP() || sksi_query_utilities.NIL != sksi_sparql_removal_module_generation.some_sksi_sparql_removal_modules_registeredP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 4682L)
    public static SubLObject clear_sksi_query_costs() {
        return dictionary.clear_dictionary(sksi_query_utilities.$sksi_query_costs$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 4772L)
    public static SubLObject look_up_sksi_query_information(final SubLObject query, final SubLObject sks) {
        return dictionary.dictionary_lookup(sksi_query_utilities.$sksi_query_costs$.getGlobalValue(), (SubLObject)ConsesLow.list(query, sks), (SubLObject)sksi_query_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 4895L)
    public static SubLObject look_up_sksi_query_cost(final SubLObject query, final SubLObject sks, final SubLObject guess_costP) {
        SubLObject query_info = look_up_sksi_query_information(query, sks);
        if (sksi_query_utilities.NIL == query_info && sksi_query_utilities.NIL != guess_costP) {
            final SubLObject neutral_query = neutralize_query(query);
            query_info = look_up_sksi_query_information(neutral_query, sks);
        }
        if (sksi_query_utilities.NIL != query_info) {
            SubLObject sum = (SubLObject)sksi_query_utilities.ZERO_INTEGER;
            SubLObject count = (SubLObject)sksi_query_utilities.ZERO_INTEGER;
            SubLObject cdolist_list_var = query_info;
            SubLObject cost = (SubLObject)sksi_query_utilities.NIL;
            cost = cdolist_list_var.first();
            while (sksi_query_utilities.NIL != cdolist_list_var) {
                sum = Numbers.add(sum, cost);
                count = Numbers.add(count, (SubLObject)sksi_query_utilities.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                cost = cdolist_list_var.first();
            }
            return Numbers.divide(sum, count);
        }
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 5562L)
    public static SubLObject look_up_sksi_query_cost_problem_query(final SubLObject problem_query, final SubLObject sks, SubLObject guess_costP) {
        if (guess_costP == sksi_query_utilities.UNPROVIDED) {
            guess_costP = (SubLObject)sksi_query_utilities.T;
        }
        final SubLObject query = sksi_cost_reformat_problem_query(problem_query);
        return look_up_sksi_query_cost(query, sks, guess_costP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 5792L)
    public static SubLObject look_up_sksi_query_cost_contextualized_dnf(final SubLObject contextualized_dnf, final SubLObject sks, SubLObject guess_costP) {
        if (guess_costP == sksi_query_utilities.UNPROVIDED) {
            guess_costP = (SubLObject)sksi_query_utilities.T;
        }
        final SubLObject query = sksi_cost_reformat_contextualized_dnf(contextualized_dnf);
        return look_up_sksi_query_cost(query, sks, guess_costP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 6042L)
    public static SubLObject look_up_sksi_query_cost_asent_sense(final SubLObject asent, final SubLObject sense, final SubLObject sks, SubLObject guess_costP) {
        if (guess_costP == sksi_query_utilities.UNPROVIDED) {
            guess_costP = (SubLObject)sksi_query_utilities.T;
        }
        final SubLObject query = sksi_cost_reformat_asent_sense(asent, sense);
        SubLObject cost = look_up_sksi_query_cost(query, sks, guess_costP);
        if (sksi_query_utilities.NIL == cost) {
            cost = sksi_sentence_cost(asent, sense, sks);
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 6353L)
    public static SubLObject update_sksi_query_cost(final SubLObject query, final SubLObject sks, SubLObject cost, SubLObject replace_historical_costsP) {
        if (replace_historical_costsP == sksi_query_utilities.UNPROVIDED) {
            replace_historical_costsP = (SubLObject)sksi_query_utilities.NIL;
        }
        if (cost.isZero()) {
            cost = control_vars.$cheap_hl_module_check_cost$.getGlobalValue();
        }
        final SubLObject query_info = look_up_sksi_query_information(query, sks);
        final SubLObject neutral_query = neutralize_query(query);
        final SubLObject neutral_query_info = look_up_sksi_query_information(neutral_query, sks);
        if (sksi_query_utilities.NIL != query_info) {
            SubLObject new_query_info = (SubLObject)((sksi_query_utilities.NIL != replace_historical_costsP) ? ConsesLow.list(cost) : ConsesLow.cons(cost, query_info));
            if (sksi_query_utilities.NIL != list_utilities.lengthG(new_query_info, sksi_query_utilities.$sksi_query_history_limit$.getGlobalValue(), (SubLObject)sksi_query_utilities.UNPROVIDED)) {
                new_query_info = list_utilities.first_n(sksi_query_utilities.$sksi_query_history_limit$.getGlobalValue(), new_query_info);
            }
            dictionary.dictionary_enter(sksi_query_utilities.$sksi_query_costs$.getGlobalValue(), (SubLObject)ConsesLow.list(query, sks), new_query_info);
        }
        else {
            dictionary.dictionary_enter(sksi_query_utilities.$sksi_query_costs$.getGlobalValue(), (SubLObject)ConsesLow.list(query, sks), (SubLObject)ConsesLow.list(cost));
        }
        if (sksi_query_utilities.NIL != neutral_query_info) {
            SubLObject new_query_info = (SubLObject)((sksi_query_utilities.NIL != replace_historical_costsP) ? ConsesLow.list(cost) : ConsesLow.cons(cost, neutral_query_info));
            if (sksi_query_utilities.NIL != list_utilities.lengthG(new_query_info, sksi_query_utilities.$sksi_query_history_limit$.getGlobalValue(), (SubLObject)sksi_query_utilities.UNPROVIDED)) {
                new_query_info = list_utilities.first_n(sksi_query_utilities.$sksi_query_history_limit$.getGlobalValue(), new_query_info);
            }
            dictionary.dictionary_enter(sksi_query_utilities.$sksi_query_costs$.getGlobalValue(), (SubLObject)ConsesLow.list(neutral_query, sks), new_query_info);
        }
        else {
            dictionary.dictionary_enter(sksi_query_utilities.$sksi_query_costs$.getGlobalValue(), (SubLObject)ConsesLow.list(neutral_query, sks), (SubLObject)ConsesLow.list(cost));
        }
        return (SubLObject)sksi_query_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 7867L)
    public static SubLObject update_sksi_query_cost_problem_query(final SubLObject problem_query, final SubLObject sks, final SubLObject cost) {
        final SubLObject query = sksi_cost_reformat_problem_query(problem_query);
        return update_sksi_query_cost(query, sks, cost, (SubLObject)sksi_query_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 8067L)
    public static SubLObject update_sksi_query_cost_contextualized_dnf(final SubLObject contextualized_dnf, final SubLObject sks, final SubLObject cost) {
        final SubLObject query = sksi_cost_reformat_contextualized_dnf(contextualized_dnf);
        return update_sksi_query_cost(query, sks, cost, (SubLObject)sksi_query_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 8287L)
    public static SubLObject update_sksi_query_cost_asent_sense(final SubLObject asent, final SubLObject sense, final SubLObject sks, final SubLObject cost) {
        final SubLObject query = sksi_cost_reformat_asent_sense(asent, sense);
        return update_sksi_query_cost(query, sks, cost, (SubLObject)sksi_query_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 8479L)
    public static SubLObject sksi_cost_reformat_problem_query_internal(final SubLObject problem_query) {
        final SubLObject new_problem_query = Mapping.mapcar(Symbols.symbol_function((SubLObject)sksi_query_utilities.$sym2$FIRST), czer_main.rename_clauses_vars_safe(el_utilities.copy_clauses(problem_query)));
        return clause_utilities.decontextualize_contextualized_clauses(new_problem_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 8479L)
    public static SubLObject sksi_cost_reformat_problem_query(final SubLObject problem_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == v_memoization_state) {
            return sksi_cost_reformat_problem_query_internal(problem_query);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_query_utilities.$sym1$SKSI_COST_REFORMAT_PROBLEM_QUERY, (SubLObject)sksi_query_utilities.UNPROVIDED);
        if (sksi_query_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_query_utilities.$sym1$SKSI_COST_REFORMAT_PROBLEM_QUERY, (SubLObject)sksi_query_utilities.ONE_INTEGER, (SubLObject)sksi_query_utilities.$int3$1000, (SubLObject)sksi_query_utilities.EQUAL, (SubLObject)sksi_query_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_query_utilities.$sym1$SKSI_COST_REFORMAT_PROBLEM_QUERY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, problem_query, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_cost_reformat_problem_query_internal(problem_query)));
            memoization_state.caching_state_put(caching_state, problem_query, results, (SubLObject)sksi_query_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 8785L)
    public static SubLObject sksi_cost_reformat_contextualized_dnf(final SubLObject contextualized_dnf) {
        final SubLObject problem_query = inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(contextualized_dnf);
        return sksi_cost_reformat_problem_query(problem_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 9014L)
    public static SubLObject sksi_cost_reformat_asent_sense(final SubLObject asent, final SubLObject sense) {
        final SubLObject casent = inference_datastructures_problem_query.make_contextualized_asent(sksi_query_utilities.$const4$BaseKB, asent);
        final SubLObject problem_query = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(casent, sense);
        return sksi_cost_reformat_problem_query(problem_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 9289L)
    public static SubLObject neutralize_query(final SubLObject query) {
        return Mapping.mapcar((SubLObject)sksi_query_utilities.$sym5$NEUTRALIZE_QUERY_CLAUSE, query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 9395L)
    public static SubLObject neutralize_query_clause(final SubLObject query_clause) {
        SubLObject neg_lits = (SubLObject)sksi_query_utilities.NIL;
        SubLObject pos_lits = (SubLObject)sksi_query_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(query_clause, query_clause, (SubLObject)sksi_query_utilities.$list6);
        neg_lits = query_clause.first();
        SubLObject current = query_clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, query_clause, (SubLObject)sksi_query_utilities.$list6);
        pos_lits = current.first();
        current = current.rest();
        if (sksi_query_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list(Mapping.mapcar((SubLObject)sksi_query_utilities.$sym7$NEUTRALIZE_LITERAL, neg_lits), Mapping.mapcar((SubLObject)sksi_query_utilities.$sym7$NEUTRALIZE_LITERAL, pos_lits));
        }
        cdestructuring_bind.cdestructuring_bind_error(query_clause, (SubLObject)sksi_query_utilities.$list6);
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 9604L)
    public static SubLObject neutralize_literal(final SubLObject lit) {
        return (SubLObject)ConsesLow.cons(lit.first(), list_utilities.substitute_if_not((SubLObject)sksi_query_utilities.$kw8$FULLY_BOUND, (SubLObject)sksi_query_utilities.$sym9$VARIABLE_P, lit.rest(), (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 9727L)
    public static SubLObject guess_cost_from_lrs_cardinality_gafs(final SubLObject select_fields, final SubLObject where_fields, final SubLObject lrs_cardinality_gafs) {
        SubLObject cdolist_list_var = lrs_cardinality_gafs;
        SubLObject lrs_cardinality_gaf = (SubLObject)sksi_query_utilities.NIL;
        lrs_cardinality_gaf = cdolist_list_var.first();
        while (sksi_query_utilities.NIL != cdolist_list_var) {
            final SubLObject bound_fields = el_utilities.extensional_set_elements(sksi_kb_accessors.logical_result_set_cardinality_gaf_bound_fields_set(lrs_cardinality_gaf));
            final SubLObject unbound_fields = el_utilities.extensional_set_elements(sksi_kb_accessors.logical_result_set_cardinality_gaf_unbound_fields_set(lrs_cardinality_gaf));
            if (sksi_query_utilities.NIL != list_utilities.sets_equalP(where_fields, bound_fields, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL)) && sksi_query_utilities.NIL != list_utilities.sets_equalP(select_fields, unbound_fields, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL))) {
                return sksi_kb_accessors.logical_result_set_cardinality_gaf_cost_expression(lrs_cardinality_gaf);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lrs_cardinality_gaf = cdolist_list_var.first();
        }
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 10355L)
    public static SubLObject guess_cost_from_rs_cardinality_gafs(final SubLObject select_fields, final SubLObject where_fields, final SubLObject rs_cardinality_gafs, SubLObject select_test, SubLObject where_test, SubLObject cycl_for_where_expression) {
        if (select_test == sksi_query_utilities.UNPROVIDED) {
            select_test = (SubLObject)sksi_query_utilities.$sym10$SETS_EQUAL_;
        }
        if (where_test == sksi_query_utilities.UNPROVIDED) {
            where_test = (SubLObject)sksi_query_utilities.$sym10$SETS_EQUAL_;
        }
        if (cycl_for_where_expression == sksi_query_utilities.UNPROVIDED) {
            cycl_for_where_expression = (SubLObject)sksi_query_utilities.NIL;
        }
        SubLObject exact_matchP = (SubLObject)sksi_query_utilities.NIL;
        SubLObject cost = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == exact_matchP) {
            SubLObject csome_list_var = rs_cardinality_gafs;
            SubLObject rs_cardinality_gaf = (SubLObject)sksi_query_utilities.NIL;
            rs_cardinality_gaf = csome_list_var.first();
            while (sksi_query_utilities.NIL == exact_matchP && sksi_query_utilities.NIL != csome_list_var) {
                final SubLObject bound_fields = el_utilities.extensional_set_elements(sksi_kb_accessors.result_set_cardinality_gaf_bound_fields_set(rs_cardinality_gaf));
                final SubLObject unbound_fields = el_utilities.extensional_set_elements(sksi_kb_accessors.result_set_cardinality_gaf_unbound_fields_set(rs_cardinality_gaf));
                if (sksi_query_utilities.NIL != list_utilities.sets_equalP(where_fields, bound_fields, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL)) && sksi_query_utilities.NIL != list_utilities.sets_equalP(select_fields, unbound_fields, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL)) && (sksi_query_utilities.NIL == cycl_for_where_expression || sksi_query_utilities.NIL != czer_utilities.equals_elP(cycl_for_where_expression, sksi_kb_accessors.result_set_cardinality_gaf_constraints(rs_cardinality_gaf), (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED))) {
                    exact_matchP = (SubLObject)sksi_query_utilities.T;
                    cost = sksi_kb_accessors.result_set_cardinality_gaf_cost_expression(rs_cardinality_gaf);
                }
                else if ((select_test != sksi_query_utilities.$sym10$SETS_EQUAL_ || where_test != sksi_query_utilities.$sym10$SETS_EQUAL_) && sksi_query_utilities.NIL != Functions.funcall(where_test, where_fields, bound_fields, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL)) && sksi_query_utilities.NIL != Functions.funcall(select_test, select_fields, unbound_fields, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL)) && (sksi_query_utilities.NIL == cycl_for_where_expression || sksi_query_utilities.NIL != czer_utilities.equals_elP(cycl_for_where_expression, sksi_kb_accessors.result_set_cardinality_gaf_constraints(rs_cardinality_gaf), (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED))) {
                    final SubLObject this_cost = sksi_kb_accessors.result_set_cardinality_gaf_cost_expression(rs_cardinality_gaf);
                    if (this_cost.isNumber() && cost.isNumber()) {
                        cost = Numbers.min(this_cost, cost);
                    }
                    else {
                        cost = this_cost;
                    }
                }
                csome_list_var = csome_list_var.rest();
                rs_cardinality_gaf = csome_list_var.first();
            }
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 12033L)
    public static SubLObject cache_cost_from_lrs_cardinality_wrt_value_gafs(final SubLObject sentence, final SubLObject select_fields, final SubLObject where_fields, final SubLObject lrs_cardinality_wrt_value_gafs, final SubLObject sk_source) {
        SubLObject cdolist_list_var = lrs_cardinality_wrt_value_gafs;
        SubLObject lrs_cardinality_wrt_value_gaf = (SubLObject)sksi_query_utilities.NIL;
        lrs_cardinality_wrt_value_gaf = cdolist_list_var.first();
        while (sksi_query_utilities.NIL != cdolist_list_var) {
            final SubLObject bound_fields = el_utilities.extensional_set_elements(sksi_kb_accessors.logical_result_set_cardinality_wrt_value_gaf_bound_fields_set(lrs_cardinality_wrt_value_gaf));
            final SubLObject unbound_fields = el_utilities.extensional_set_elements(sksi_kb_accessors.logical_result_set_cardinality_wrt_value_gaf_unbound_fields_set(lrs_cardinality_wrt_value_gaf));
            if (sksi_query_utilities.NIL == list_utilities.singletonP(bound_fields)) {
                Errors.warn((SubLObject)sksi_query_utilities.$str11$__logicalResultSetCardinalityWRTV, lrs_cardinality_wrt_value_gaf);
                return (SubLObject)sksi_query_utilities.NIL;
            }
            if (sksi_query_utilities.NIL != list_utilities.sets_equalP(where_fields, bound_fields, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL)) && sksi_query_utilities.NIL != list_utilities.sets_equalP(select_fields, unbound_fields, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL))) {
                final SubLObject value = sksi_kb_accessors.logical_result_set_cardinality_wrt_value_gaf_value(lrs_cardinality_wrt_value_gaf);
                final SubLObject cost = sksi_kb_accessors.logical_result_set_cardinality_wrt_value_gaf_cost_expression(lrs_cardinality_wrt_value_gaf);
                SubLObject cost_sentence = sentence;
                SubLObject list_var = (SubLObject)sksi_query_utilities.NIL;
                SubLObject unbound_field = (SubLObject)sksi_query_utilities.NIL;
                SubLObject n = (SubLObject)sksi_query_utilities.NIL;
                list_var = unbound_fields;
                unbound_field = list_var.first();
                for (n = (SubLObject)sksi_query_utilities.ZERO_INTEGER; sksi_query_utilities.NIL != list_var; list_var = list_var.rest(), unbound_field = list_var.first(), n = Numbers.add((SubLObject)sksi_query_utilities.ONE_INTEGER, n)) {
                    final SubLObject unbound_field_indexical = sksi_kb_accessors.indexical_for_logical_field(unbound_field);
                    cost_sentence = list_utilities.tree_substitute(cost_sentence, unbound_field_indexical, variables.get_variable(n));
                }
                cost_sentence = list_utilities.tree_substitute(cost_sentence, sksi_kb_accessors.indexical_for_logical_field(bound_fields.first()), value);
                update_sksi_query_cost(sksi_cost_reformat_asent_sense(cost_sentence, (SubLObject)sksi_query_utilities.$kw12$POS), sk_source, cost, (SubLObject)sksi_query_utilities.T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lrs_cardinality_wrt_value_gaf = cdolist_list_var.first();
        }
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 14051L)
    public static SubLObject sksi_cost_recording_suspended_for_current_iteratorP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq(sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.getDynamicValue(thread), (SubLObject)sksi_query_utilities.$kw13$SUSPENDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 14204L)
    public static SubLObject sksi_cost_recording_suspended_for_current_iterator_initial_state() {
        return (SubLObject)sksi_query_utilities.$kw14$IN_PROGRESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 14312L)
    public static SubLObject sksi_suspend_cost_recording_for_current_iterator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.getDynamicValue(thread) == sksi_query_utilities.$kw14$IN_PROGRESS) {
            sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.setDynamicValue((SubLObject)sksi_query_utilities.$kw13$SUSPENDED, thread);
        }
        else {
            Errors.warn((SubLObject)sksi_query_utilities.$str15$Attempted_to_suspend_SKSI_cost_re);
        }
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 14698L)
    public static SubLObject generate_sksi_conjunctive_cost_recording_iterator(final SubLObject result_set_iterators, final SubLObject sks) {
        final SubLObject pcase_var = Sequences.length(result_set_iterators);
        if (pcase_var.eql((SubLObject)sksi_query_utilities.ZERO_INTEGER)) {
            update_sksi_query_cost_store_for_current_tactic(sks);
            return (SubLObject)sksi_query_utilities.NIL;
        }
        if (pcase_var.eql((SubLObject)sksi_query_utilities.ONE_INTEGER)) {
            return new_sksi_cost_recording_iterator(result_set_iterators.first(), sks);
        }
        return new_sksi_cost_recording_iterator(iteration.new_iterator_iterator(result_set_iterators), sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 15113L)
    public static SubLObject generate_sksi_single_literal_cost_recording_iterator(final SubLObject csql, final SubLObject sks, SubLObject content_mt, SubLObject start_row, SubLObject end_row, SubLObject translation_style) {
        if (content_mt == sksi_query_utilities.UNPROVIDED) {
            content_mt = (SubLObject)sksi_query_utilities.NIL;
        }
        if (start_row == sksi_query_utilities.UNPROVIDED) {
            start_row = (SubLObject)sksi_query_utilities.ZERO_INTEGER;
        }
        if (end_row == sksi_query_utilities.UNPROVIDED) {
            end_row = (SubLObject)sksi_query_utilities.NIL;
        }
        if (translation_style == sksi_query_utilities.UNPROVIDED) {
            translation_style = (SubLObject)sksi_query_utilities.$kw16$NORMAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_query_utilities.NIL;
        final SubLObject _prev_bind_0 = sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.currentBinding(thread);
        try {
            sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.bind(sksi_cost_recording_suspended_for_current_iterator_initial_state(), thread);
            final SubLObject iterator = sksi_sks_interaction.generate_iterator_from_csql(csql, sks, content_mt, start_row, end_row, translation_style);
            if (sksi_query_utilities.NIL != iteration.iterator_p(iterator)) {
                if (sksi_query_utilities.NIL != sksi_cost_recording_suspended_for_current_iteratorP()) {
                    result = iterator;
                }
                else {
                    result = new_sksi_cost_recording_iterator(iterator, sks);
                }
            }
            else {
                if (sksi_query_utilities.NIL == sksi_cost_recording_suspended_for_current_iteratorP()) {
                    update_sksi_query_cost_store_for_current_tactic(sks);
                }
                result = iterator;
            }
        }
        finally {
            sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 15940L)
    public static SubLObject sksi_cost_recording_iterator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_query_utilities.NIL != iteration.iterator_p(v_object) && iteration.iteration_next_peek(v_object) == sksi_query_utilities.$sym17$SKSI_COST_RECORDING_ITERATOR_NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 16115L)
    public static SubLObject new_sksi_cost_recording_iterator(final SubLObject iterator, final SubLObject sks) {
        return (SubLObject)((sksi_query_utilities.NIL != iteration.iterator_p(iterator)) ? iteration.new_iterator((SubLObject)ConsesLow.list(iterator, sks), (SubLObject)sksi_query_utilities.$sym18$SKSI_COST_RECORDING_ITERATOR_DONE, (SubLObject)sksi_query_utilities.$sym17$SKSI_COST_RECORDING_ITERATOR_NEXT, (SubLObject)sksi_query_utilities.$sym19$SKSI_COST_RECORDING_ITERATOR_FINALIZE) : sksi_query_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 16390L)
    public static SubLObject sksi_cost_recording_iterator_done(final SubLObject state) {
        SubLObject iterator = (SubLObject)sksi_query_utilities.NIL;
        SubLObject sks = (SubLObject)sksi_query_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_query_utilities.$list20);
        iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_query_utilities.$list20);
        sks = current.first();
        current = current.rest();
        if (sksi_query_utilities.NIL == current) {
            return iteration.iteration_done(iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_query_utilities.$list20);
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 16548L)
    public static SubLObject sksi_cost_recording_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterator = (SubLObject)sksi_query_utilities.NIL;
        SubLObject sks = (SubLObject)sksi_query_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_query_utilities.$list20);
        iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_query_utilities.$list20);
        sks = current.first();
        current = current.rest();
        if (sksi_query_utilities.NIL == current) {
            SubLObject premature_endP = iteration.iteration_done(iterator);
            SubLObject next = (SubLObject)sksi_query_utilities.NIL;
            SubLObject valid_nextP = (SubLObject)sksi_query_utilities.NIL;
            while (sksi_query_utilities.NIL == valid_nextP && sksi_query_utilities.NIL == premature_endP) {
                thread.resetMultipleValues();
                final SubLObject value = iteration.iteration_next(iterator);
                final SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sksi_query_utilities.NIL != validP) {
                    next = value;
                    valid_nextP = (SubLObject)sksi_query_utilities.T;
                }
                else {
                    premature_endP = iteration.iteration_done(iterator);
                }
            }
            return Values.values(next, state, premature_endP);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_query_utilities.$list20);
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 17043L)
    public static SubLObject sksi_cost_recording_iterator_finalize(final SubLObject state) {
        SubLObject result = (SubLObject)sksi_query_utilities.NIL;
        SubLObject iterator = (SubLObject)sksi_query_utilities.NIL;
        SubLObject sks = (SubLObject)sksi_query_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_query_utilities.$list20);
        iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_query_utilities.$list20);
        sks = current.first();
        current = current.rest();
        if (sksi_query_utilities.NIL == current) {
            try {
                update_sksi_query_cost_store_for_current_tactic(sks);
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_query_utilities.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    result = iteration.iteration_finalize(iterator);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_query_utilities.$list20);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 17316L)
    public static SubLObject update_sksi_query_cost_store_for_current_tactic(final SubLObject sks) {
        final SubLObject tactic = inference_worker.currently_executing_tactic();
        if (sksi_query_utilities.NIL != inference_datastructures_tactic.tactic_p(tactic)) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            final SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
            final SubLObject actual_productivity = inference_worker.content_tactic_actual_productivity(tactic);
            final SubLObject actual_cost = inference_datastructures_enumerated_types.cost_for_productivity(actual_productivity);
            return update_sksi_query_cost_problem_query(problem_query, sks, actual_cost);
        }
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 17797L)
    public static SubLObject sksi_cost_recording_iterator_size(final SubLObject sks_cr_iterator) {
        assert sksi_query_utilities.NIL != sksi_cost_recording_iterator_p(sks_cr_iterator) : sks_cr_iterator;
        final SubLObject state = iteration.iteration_state_peek(sks_cr_iterator);
        if (sksi_query_utilities.NIL != list_utilities.proper_list_p(state)) {
            final SubLObject result_iterator = state.first();
            if (sksi_query_utilities.NIL != sksi_conjunctive_removal_modules_expand.sksi_crm_result_iterator_p(result_iterator)) {
                return sksi_conjunctive_removal_modules_expand.sksi_crm_result_iterator_size(result_iterator);
            }
        }
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 18398L)
    public static SubLObject sksi_reformulation_check(final SubLObject list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_query_utilities.NIL == Sequences.find_if((SubLObject)sksi_query_utilities.$sym22$SKSI_UNREFORMULATABLE_P, list, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 18505L)
    public static SubLObject sksi_unreformulatable_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)sksi_query_utilities.$kw23$UNREFORMULATABLE, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 18596L)
    public static SubLObject sksi_not_containing_nil_p(final SubLObject list) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_query_utilities.NIL == list_utilities.member_eqP((SubLObject)sksi_query_utilities.NIL, list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 18686L)
    public static SubLObject get_sksi_removal_module_cost(final SubLObject asent, final SubLObject sense, final SubLObject sks, SubLObject default_cost) {
        if (default_cost == sksi_query_utilities.UNPROVIDED) {
            default_cost = sksi_query_utilities.$sksi_default_query_cost$.getGlobalValue();
        }
        final SubLObject cost = look_up_sksi_query_cost_asent_sense(asent, sense, sks, (SubLObject)sksi_query_utilities.NIL);
        return (sksi_query_utilities.NIL != cost) ? cost : default_cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 18919L)
    public static SubLObject sksi_sentence_cost(final SubLObject asent, final SubLObject sense, SubLObject sks) {
        if (sks == sksi_query_utilities.UNPROVIDED) {
            sks = (SubLObject)sksi_query_utilities.NIL;
        }
        if (sense.eql((SubLObject)sksi_query_utilities.$kw12$POS)) {
            final SubLObject mt_info = mt_relevance_macros.mt_info((SubLObject)((sksi_query_utilities.NIL != sks) ? sksi_kb_accessors.sk_source_content_mt_in_any_mt(sks) : sksi_query_utilities.NIL));
            return sksi_pos_sentence_cost(asent, sks, mt_info, (SubLObject)sksi_query_utilities.UNPROVIDED);
        }
        if (sense.eql((SubLObject)sksi_query_utilities.$kw24$NEG)) {
            return (SubLObject)((sksi_query_utilities.NIL != variables.fully_bound_p(asent)) ? control_vars.$expensive_hl_module_check_cost$.getGlobalValue() : sksi_query_utilities.NIL);
        }
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 19397L)
    public static SubLObject sksi_pos_sentence_cost_internal(final SubLObject asent, final SubLObject sks, final SubLObject mt_info, SubLObject default_cost) {
        if (default_cost == sksi_query_utilities.UNPROVIDED) {
            default_cost = sksi_query_utilities.$sksi_default_query_cost$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = (SubLObject)sksi_query_utilities.ZERO_INTEGER;
        if (sksi_query_utilities.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)sksi_query_utilities.$sym26$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_query_utilities.$sym26$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(sksi_query_utilities.$const27$EverythingPSC, thread);
                final SubLObject hl_modules = inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, (SubLObject)sksi_query_utilities.$kw12$POS);
                final SubLObject mapping_mt = (SubLObject)((sksi_query_utilities.NIL != sks) ? sksi_kb_accessors.sk_source_mapping_mt(sks) : sksi_query_utilities.NIL);
                SubLObject cdolist_list_var = hl_modules;
                SubLObject mod = (SubLObject)sksi_query_utilities.NIL;
                mod = cdolist_list_var.first();
                while (sksi_query_utilities.NIL != cdolist_list_var) {
                    if (sksi_query_utilities.NIL != sksi_removal_module_generation.sksi_module_p(mod) && sksi_query_utilities.NIL != inference_worker_removal.hl_module_applicable_to_asentP(mod, asent)) {
                        SubLObject relevant_ksP = (SubLObject)sksi_query_utilities.T;
                        final SubLObject mt_var = mapping_mt;
                        final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            if (sksi_query_utilities.NIL != sks && sksi_query_utilities.NIL == sksi_kb_accessors.sk_source_super_ksP(inference_modules.hl_module_source(mod), sks)) {
                                relevant_ksP = (SubLObject)sksi_query_utilities.NIL;
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$10, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$9, thread);
                        }
                        if (sksi_query_utilities.NIL != relevant_ksP) {
                            final SubLObject mod_cost = inference_modules.hl_module_cost_expression(mod);
                            if (mod_cost.isNumber()) {
                                cost = Numbers.add(cost, mod_cost);
                            }
                            else {
                                cost = Numbers.add(cost, default_cost);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mod = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (sksi_query_utilities.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)sksi_query_utilities.$sym28$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_query_utilities.$sym28$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(sksi_query_utilities.$const29$InferencePSC, thread);
                final SubLObject hl_modules = inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, (SubLObject)sksi_query_utilities.$kw12$POS);
                final SubLObject mapping_mt = (SubLObject)((sksi_query_utilities.NIL != sks) ? sksi_kb_accessors.sk_source_mapping_mt(sks) : sksi_query_utilities.NIL);
                SubLObject cdolist_list_var = hl_modules;
                SubLObject mod = (SubLObject)sksi_query_utilities.NIL;
                mod = cdolist_list_var.first();
                while (sksi_query_utilities.NIL != cdolist_list_var) {
                    if (sksi_query_utilities.NIL != sksi_removal_module_generation.sksi_module_p(mod) && sksi_query_utilities.NIL != inference_worker_removal.hl_module_applicable_to_asentP(mod, asent)) {
                        SubLObject relevant_ksP = (SubLObject)sksi_query_utilities.T;
                        final SubLObject mt_var = mapping_mt;
                        final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            if (sksi_query_utilities.NIL != sks && sksi_query_utilities.NIL == sksi_kb_accessors.sk_source_super_ksP(inference_modules.hl_module_source(mod), sks)) {
                                relevant_ksP = (SubLObject)sksi_query_utilities.NIL;
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$11, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$10, thread);
                        }
                        if (sksi_query_utilities.NIL != relevant_ksP) {
                            final SubLObject mod_cost = inference_modules.hl_module_cost_expression(mod);
                            if (mod_cost.isNumber()) {
                                cost = Numbers.add(cost, mod_cost);
                            }
                            else {
                                cost = Numbers.add(cost, default_cost);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mod = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (sksi_query_utilities.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_query_utilities.$sym30$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                final SubLObject hl_modules = inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, (SubLObject)sksi_query_utilities.$kw12$POS);
                final SubLObject mapping_mt = (SubLObject)((sksi_query_utilities.NIL != sks) ? sksi_kb_accessors.sk_source_mapping_mt(sks) : sksi_query_utilities.NIL);
                SubLObject cdolist_list_var = hl_modules;
                SubLObject mod = (SubLObject)sksi_query_utilities.NIL;
                mod = cdolist_list_var.first();
                while (sksi_query_utilities.NIL != cdolist_list_var) {
                    if (sksi_query_utilities.NIL != sksi_removal_module_generation.sksi_module_p(mod) && sksi_query_utilities.NIL != inference_worker_removal.hl_module_applicable_to_asentP(mod, asent)) {
                        SubLObject relevant_ksP = (SubLObject)sksi_query_utilities.T;
                        final SubLObject mt_var = mapping_mt;
                        final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$12 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            if (sksi_query_utilities.NIL != sks && sksi_query_utilities.NIL == sksi_kb_accessors.sk_source_super_ksP(inference_modules.hl_module_source(mod), sks)) {
                                relevant_ksP = (SubLObject)sksi_query_utilities.NIL;
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$12, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$11, thread);
                        }
                        if (sksi_query_utilities.NIL != relevant_ksP) {
                            final SubLObject mod_cost = inference_modules.hl_module_cost_expression(mod);
                            if (mod_cost.isNumber()) {
                                cost = Numbers.add(cost, mod_cost);
                            }
                            else {
                                cost = Numbers.add(cost, default_cost);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mod = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_query_utilities.$sym31$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                final SubLObject hl_modules = inference_worker_removal.literal_simple_removal_candidate_hl_modules(asent, (SubLObject)sksi_query_utilities.$kw12$POS);
                final SubLObject mapping_mt = (SubLObject)((sksi_query_utilities.NIL != sks) ? sksi_kb_accessors.sk_source_mapping_mt(sks) : sksi_query_utilities.NIL);
                SubLObject cdolist_list_var = hl_modules;
                SubLObject mod = (SubLObject)sksi_query_utilities.NIL;
                mod = cdolist_list_var.first();
                while (sksi_query_utilities.NIL != cdolist_list_var) {
                    if (sksi_query_utilities.NIL != sksi_removal_module_generation.sksi_module_p(mod) && sksi_query_utilities.NIL != inference_worker_removal.hl_module_applicable_to_asentP(mod, asent)) {
                        SubLObject relevant_ksP = (SubLObject)sksi_query_utilities.T;
                        final SubLObject mt_var = mapping_mt;
                        final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$13 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            if (sksi_query_utilities.NIL != sks && sksi_query_utilities.NIL == sksi_kb_accessors.sk_source_super_ksP(inference_modules.hl_module_source(mod), sks)) {
                                relevant_ksP = (SubLObject)sksi_query_utilities.NIL;
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$13, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$12, thread);
                        }
                        if (sksi_query_utilities.NIL != relevant_ksP) {
                            final SubLObject mod_cost = inference_modules.hl_module_cost_expression(mod);
                            if (mod_cost.isNumber()) {
                                cost = Numbers.add(cost, mod_cost);
                            }
                            else {
                                cost = Numbers.add(cost, default_cost);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mod = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 19397L)
    public static SubLObject sksi_pos_sentence_cost(final SubLObject asent, final SubLObject sks, final SubLObject mt_info, SubLObject default_cost) {
        if (default_cost == sksi_query_utilities.UNPROVIDED) {
            default_cost = sksi_query_utilities.$sksi_default_query_cost$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == v_memoization_state) {
            return sksi_pos_sentence_cost_internal(asent, sks, mt_info, default_cost);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_query_utilities.$sym25$SKSI_POS_SENTENCE_COST, (SubLObject)sksi_query_utilities.UNPROVIDED);
        if (sksi_query_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_query_utilities.$sym25$SKSI_POS_SENTENCE_COST, (SubLObject)sksi_query_utilities.FOUR_INTEGER, (SubLObject)sksi_query_utilities.$int3$1000, (SubLObject)sksi_query_utilities.EQUAL, (SubLObject)sksi_query_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_query_utilities.$sym25$SKSI_POS_SENTENCE_COST, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(asent, sks, mt_info, default_cost);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_query_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_query_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_query_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sks.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt_info.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_query_utilities.NIL != cached_args && sksi_query_utilities.NIL == cached_args.rest() && default_cost.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_pos_sentence_cost_internal(asent, sks, mt_info, default_cost)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(asent, sks, mt_info, default_cost));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 20260L)
    public static SubLObject comparison_literal_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_query_utilities.NIL != cycl_grammar.cycl_literal_p(v_object) && sksi_query_utilities.NIL != fort_types_interface.sksi_supported_comparison_predicate_p(el_utilities.literal_predicate(v_object, (SubLObject)sksi_query_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 20530L)
    public static SubLObject sksi_comparison_literal_supported_predicate_p_internal(final SubLObject predicate) {
        return fort_types_interface.sksi_supported_comparison_predicate_p(predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 20530L)
    public static SubLObject sksi_comparison_literal_supported_predicate_p(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == v_memoization_state) {
            return sksi_comparison_literal_supported_predicate_p_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_query_utilities.$sym32$SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P, (SubLObject)sksi_query_utilities.UNPROVIDED);
        if (sksi_query_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_query_utilities.$sym32$SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P, (SubLObject)sksi_query_utilities.ONE_INTEGER, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.EQUAL, (SubLObject)sksi_query_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_query_utilities.$sym32$SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_comparison_literal_supported_predicate_p_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, (SubLObject)sksi_query_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 20702L)
    public static SubLObject contextualized_comparison_literal_p(final SubLObject lit) {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
        return comparison_literal_p(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 20855L)
    public static SubLObject comparison_sentence_p(final SubLObject sentence) {
        return cycl_grammar.cycl_boolean_combination_of_type((SubLObject)sksi_query_utilities.$sym33$COMPARISON_LITERAL_P, sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 20982L)
    public static SubLObject comparison_operator_forbidden_for_physical_field_indexicalP(final SubLObject operator, final SubLObject physical_field_indexical) {
        final SubLObject physical_schema = sksi_kb_accessors.physical_field_indexical_schema(physical_field_indexical);
        return sksi_kb_accessors.physical_schema_forbidden_comparison_operator_p(physical_schema, operator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 21272L)
    public static SubLObject comparison_operator_forbidden_for_some_physical_field_indexicalP(final SubLObject operator, final SubLObject physical_field_indexicals) {
        SubLObject forbiddenP = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == forbiddenP) {
            SubLObject csome_list_var = physical_field_indexicals;
            SubLObject physical_field_indexical = (SubLObject)sksi_query_utilities.NIL;
            physical_field_indexical = csome_list_var.first();
            while (sksi_query_utilities.NIL == forbiddenP && sksi_query_utilities.NIL != csome_list_var) {
                if (sksi_query_utilities.NIL != comparison_operator_forbidden_for_physical_field_indexicalP(operator, physical_field_indexical)) {
                    forbiddenP = (SubLObject)sksi_query_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                physical_field_indexical = csome_list_var.first();
            }
        }
        return forbiddenP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 21645L)
    public static SubLObject sksi_unknown_sentence_literal_p_internal(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_query_utilities.NIL != cycl_grammar.cycl_literal_p(v_object) && sksi_query_utilities.NIL != kb_utilities.kbeq(sksi_query_utilities.$const35$sksiUnknownSentence, el_utilities.literal_predicate(v_object, (SubLObject)sksi_query_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 21645L)
    public static SubLObject sksi_unknown_sentence_literal_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == v_memoization_state) {
            return sksi_unknown_sentence_literal_p_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_query_utilities.$sym34$SKSI_UNKNOWN_SENTENCE_LITERAL_P, (SubLObject)sksi_query_utilities.UNPROVIDED);
        if (sksi_query_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_query_utilities.$sym34$SKSI_UNKNOWN_SENTENCE_LITERAL_P, (SubLObject)sksi_query_utilities.ONE_INTEGER, (SubLObject)sksi_query_utilities.$int36$2048, (SubLObject)sksi_query_utilities.EQUAL, (SubLObject)sksi_query_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_query_utilities.$sym34$SKSI_UNKNOWN_SENTENCE_LITERAL_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_unknown_sentence_literal_p_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)sksi_query_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 21965L)
    public static SubLObject physical_field_indexical_field_table_tuples(final SubLObject physical_field_indexical, SubLObject sk_source, SubLObject lit, SubLObject tac) {
        if (sk_source == sksi_query_utilities.UNPROVIDED) {
            sk_source = (SubLObject)sksi_query_utilities.NIL;
        }
        if (lit == sksi_query_utilities.UNPROVIDED) {
            lit = (SubLObject)sksi_query_utilities.NIL;
        }
        if (tac == sksi_query_utilities.UNPROVIDED) {
            tac = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLObject physical_field = sksi_kb_accessors.physical_field_for_indexical(physical_field_indexical);
        if (sksi_query_utilities.NIL == physical_field) {
            Dynamic.sublisp_throw((SubLObject)sksi_query_utilities.$kw37$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL, physical_field_indexical);
        }
        final SubLObject alias_index = sksi_kb_accessors.pfi_index_for_pfi(physical_field_indexical, (SubLObject)sksi_query_utilities.ZERO_INTEGER);
        final SubLObject field_name = sksi_kb_accessors.physical_field_name(physical_field);
        final SubLObject schema = sksi_kb_accessors.physical_field_schema(physical_field);
        final SubLObject tables = sk_sources_for_physical_schema(schema, sk_source);
        SubLObject field_table_tuples = (SubLObject)sksi_query_utilities.NIL;
        SubLObject cdolist_list_var = tables;
        SubLObject table = (SubLObject)sksi_query_utilities.NIL;
        table = cdolist_list_var.first();
        while (sksi_query_utilities.NIL != cdolist_list_var) {
            SubLObject table_name = sksi_kb_accessors.sk_source_name(table);
            final SubLObject namespace = sksi_kb_accessors.sk_source_namespace(table);
            if (sksi_query_utilities.NIL != lit && sksi_query_utilities.NIL != tac) {
                table_name = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, alias_index);
                field_table_tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(field_name, table_name, namespace), field_table_tuples);
            }
            else {
                if (!alias_index.isZero()) {
                    table_name = sksi_csql_generation.make_table_alias_name(table_name, alias_index);
                }
                field_table_tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(field_name, table_name, namespace), field_table_tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        return field_table_tuples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 23196L)
    public static SubLObject sk_sources_for_physical_schema_internal(final SubLObject physical_schema, SubLObject sk_source) {
        if (sk_source == sksi_query_utilities.UNPROVIDED) {
            sk_source = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLObject ps_sk_sources = sksi_kb_accessors.physical_schema_sk_sources_memoized(physical_schema);
        SubLObject tables = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL != sk_source) {
            SubLObject cdolist_list_var = ps_sk_sources;
            SubLObject ps_sk_source = (SubLObject)sksi_query_utilities.NIL;
            ps_sk_source = cdolist_list_var.first();
            while (sksi_query_utilities.NIL != cdolist_list_var) {
                if (sksi_query_utilities.NIL != sksi_kb_accessors.sk_source_sub_ksP(sk_source, ps_sk_source)) {
                    tables = (SubLObject)ConsesLow.cons(ps_sk_source, tables);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ps_sk_source = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = ps_sk_sources;
            SubLObject ps_sk_source = (SubLObject)sksi_query_utilities.NIL;
            ps_sk_source = cdolist_list_var.first();
            while (sksi_query_utilities.NIL != cdolist_list_var) {
                tables = (SubLObject)ConsesLow.cons(ps_sk_source, tables);
                cdolist_list_var = cdolist_list_var.rest();
                ps_sk_source = cdolist_list_var.first();
            }
        }
        return list_utilities.fast_delete_duplicates(tables, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 23196L)
    public static SubLObject sk_sources_for_physical_schema(final SubLObject physical_schema, SubLObject sk_source) {
        if (sk_source == sksi_query_utilities.UNPROVIDED) {
            sk_source = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == v_memoization_state) {
            return sk_sources_for_physical_schema_internal(physical_schema, sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_query_utilities.$sym38$SK_SOURCES_FOR_PHYSICAL_SCHEMA, (SubLObject)sksi_query_utilities.UNPROVIDED);
        if (sksi_query_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_query_utilities.$sym38$SK_SOURCES_FOR_PHYSICAL_SCHEMA, (SubLObject)sksi_query_utilities.TWO_INTEGER, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.EQ, (SubLObject)sksi_query_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_query_utilities.$sym38$SK_SOURCES_FOR_PHYSICAL_SCHEMA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(physical_schema, sk_source);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_query_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_query_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_query_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (physical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_query_utilities.NIL != cached_args && sksi_query_utilities.NIL == cached_args.rest() && sk_source.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sk_sources_for_physical_schema_internal(physical_schema, sk_source)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(physical_schema, sk_source));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 23683L)
    public static SubLObject get_from_expression_from_antecedent_meaning_sentence(final SubLObject conditional_meaning_sentence_gaf, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, SubLObject tac) {
        if (tac == sksi_query_utilities.UNPROVIDED) {
            tac = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLObject ant_ls_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
        final SubLObject ant_ms = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf);
        final SubLObject con_ls_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
        final SubLObject con_ms = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, (SubLObject)sksi_query_utilities.UNPROVIDED);
        return get_from_expression_from_antecedent_meaning_sentence_int(ant_ls_set, ant_ms, con_ls_set, con_ms, content_mt, sks, physical_schemata, tac);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 24222L)
    public static SubLObject get_from_expression_from_antecedent_meaning_sentence_int(final SubLObject ant_ls_set, final SubLObject ant_ms, final SubLObject con_ls_set, final SubLObject con_ms, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject tac) {
        final SubLObject lfi_alias_fn_nauts = cycl_utilities.expression_gather(ant_ms, (SubLObject)sksi_query_utilities.$sym39$LFI_ALIAS_FN_NAUT_P, (SubLObject)sksi_query_utilities.T, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL), (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
        SubLObject csql_table_select = (SubLObject)sksi_query_utilities.NIL;
        SubLObject cdolist_list_var = ant_ls_set;
        SubLObject ant_ls = (SubLObject)sksi_query_utilities.NIL;
        ant_ls = cdolist_list_var.first();
        while (sksi_query_utilities.NIL != cdolist_list_var) {
            final SubLObject ant_sks = sksi_kb_accessors.logical_schema_sources(ant_ls).first();
            final SubLObject ant_sks_name = sksi_kb_accessors.sk_source_name(ant_sks);
            SubLObject table_alias_list = (SubLObject)sksi_query_utilities.NIL;
            SubLObject cdolist_list_var_$17 = lfi_alias_fn_nauts;
            SubLObject lfi = (SubLObject)sksi_query_utilities.NIL;
            lfi = cdolist_list_var_$17.first();
            while (sksi_query_utilities.NIL != cdolist_list_var_$17) {
                if (sksi_query_utilities.NIL != kb_utilities.kbeq(ant_ls, sksi_kb_accessors.logical_field_indexical_schema(sksi_kb_accessors.lfi_fort_for_lfi(lfi)))) {
                    table_alias_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(ant_sks_name, sksi_kb_accessors.lfi_alias_fn_naut_index(lfi)), table_alias_list);
                }
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                lfi = cdolist_list_var_$17.first();
            }
            if (sksi_query_utilities.NIL == table_alias_list) {
                table_alias_list = (SubLObject)ConsesLow.cons(ant_sks_name, table_alias_list);
            }
            table_alias_list = Sequences.nreverse(list_utilities.fast_delete_duplicates(table_alias_list, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED));
            csql_table_select = ConsesLow.append(sksi_csql_generation.sksi_determine_csql_table_select(table_alias_list), csql_table_select);
            cdolist_list_var = cdolist_list_var.rest();
            ant_ls = cdolist_list_var.first();
        }
        return Sequences.nreverse(list_utilities.fast_delete_duplicates(csql_table_select, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 25329L)
    public static SubLObject get_where_expression_from_antecedent_meaning_sentence(final SubLObject conditional_meaning_sentence_gaf, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, SubLObject lit, SubLObject tac) {
        if (lit == sksi_query_utilities.UNPROVIDED) {
            lit = (SubLObject)sksi_query_utilities.NIL;
        }
        if (tac == sksi_query_utilities.UNPROVIDED) {
            tac = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLObject ant_ls_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
        final SubLObject ant_ms = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf);
        final SubLObject con_ls_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
        final SubLObject con_ms = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, (SubLObject)sksi_query_utilities.UNPROVIDED);
        return get_where_expression_from_antecedent_meaning_sentence_int(conditional_meaning_sentence_gaf, ant_ms, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, lit, tac);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 26029L)
    public static SubLObject get_where_expression_from_antecedent_meaning_sentence_int(final SubLObject cms_gaf, final SubLObject ant_ms, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject lit, final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject csql_where = get_where_expression_from_sentence_recursive(cms_gaf, ant_ms, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED);
        final SubLObject eval_conditions = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(sksi_csql_utilities.contract_where_expression(csql_where), eval_conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 26460L)
    public static SubLObject possibly_reorder_conjunctive_antecedent_sentence_conjunts(final SubLObject sentence) {
        SubLObject preceding_conjuncts = (SubLObject)sksi_query_utilities.NIL;
        SubLObject following_conjuncts = (SubLObject)sksi_query_utilities.NIL;
        SubLObject new_sentence = (SubLObject)sksi_query_utilities.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)sksi_query_utilities.$kw40$IGNORE);
        SubLObject conjunct = (SubLObject)sksi_query_utilities.NIL;
        conjunct = cdolist_list_var.first();
        while (sksi_query_utilities.NIL != cdolist_list_var) {
            if (sksi_query_utilities.NIL != comparison_literal_p(conjunct) || sksi_query_utilities.NIL != evaluate_literal_p(conjunct)) {
                following_conjuncts = (SubLObject)ConsesLow.cons(conjunct, following_conjuncts);
            }
            else {
                final SubLObject lfis = sksi_infrastructure_utilities.expression_logical_field_indexicals(sentence, (SubLObject)sksi_query_utilities.T, (SubLObject)sksi_query_utilities.T);
                SubLObject any_virtual_lfisP = (SubLObject)sksi_query_utilities.NIL;
                if (sksi_query_utilities.NIL == any_virtual_lfisP) {
                    SubLObject csome_list_var = lfis;
                    SubLObject lfi = (SubLObject)sksi_query_utilities.NIL;
                    lfi = csome_list_var.first();
                    while (sksi_query_utilities.NIL == any_virtual_lfisP && sksi_query_utilities.NIL != csome_list_var) {
                        if (sksi_query_utilities.NIL != sksi_kb_accessors.logical_field_indexical_virtualP(lfi)) {
                            any_virtual_lfisP = (SubLObject)sksi_query_utilities.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        lfi = csome_list_var.first();
                    }
                }
                if (sksi_query_utilities.NIL != any_virtual_lfisP) {
                    preceding_conjuncts = (SubLObject)ConsesLow.cons(conjunct, preceding_conjuncts);
                }
                else {
                    following_conjuncts = (SubLObject)ConsesLow.cons(conjunct, following_conjuncts);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        preceding_conjuncts = Sequences.nreverse(preceding_conjuncts);
        following_conjuncts = Sequences.nreverse(following_conjuncts);
        new_sentence = el_utilities.make_conjunction(ConsesLow.append(preceding_conjuncts, following_conjuncts));
        return new_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 27701L)
    public static SubLObject get_where_expression_from_sentence_recursive(final SubLObject cms_gaf, SubLObject sentence, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac, SubLObject eval_conditions_for_later_use) {
        if (eval_conditions_for_later_use == sksi_query_utilities.UNPROVIDED) {
            eval_conditions_for_later_use = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_operator(sentence);
        SubLObject where = (SubLObject)sksi_query_utilities.NIL;
        SubLObject eval_conditions = (SubLObject)sksi_query_utilities.NIL;
        SubLObject failP = (SubLObject)sksi_query_utilities.NIL;
        final SubLObject pcase_var = operator;
        if (pcase_var.eql(sksi_query_utilities.$const41$and)) {
            sentence = possibly_reorder_conjunctive_antecedent_sentence_conjunts(sentence);
            final SubLObject args = cycl_utilities.formula_args(sentence, (SubLObject)sksi_query_utilities.$kw40$IGNORE);
            SubLObject rest;
            SubLObject conjunct;
            SubLObject conjunct_where;
            SubLObject conjunct_eval;
            SubLObject conjunct_eval_conditions_for_later_use;
            for (rest = (SubLObject)sksi_query_utilities.NIL, rest = args; sksi_query_utilities.NIL == failP && sksi_query_utilities.NIL != rest; rest = rest.rest()) {
                conjunct = rest.first();
                thread.resetMultipleValues();
                conjunct_where = get_where_expression_from_sentence_recursive(cms_gaf, conjunct, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, eval_conditions_for_later_use);
                conjunct_eval = thread.secondMultipleValue();
                conjunct_eval_conditions_for_later_use = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (sksi_query_utilities.NIL == conjunct_where && sksi_query_utilities.NIL == conjunct_eval) {
                    failP = (SubLObject)sksi_query_utilities.T;
                }
                else {
                    if (sksi_query_utilities.NIL != conjunct_where) {
                        where = (SubLObject)ConsesLow.cons(conjunct_where, where);
                    }
                    if (sksi_query_utilities.NIL != conjunct_eval) {
                        eval_conditions = ConsesLow.append(eval_conditions, conjunct_eval);
                    }
                    if (sksi_query_utilities.NIL != conjunct_eval_conditions_for_later_use) {
                        eval_conditions_for_later_use = ConsesLow.append(eval_conditions_for_later_use, conjunct_eval_conditions_for_later_use);
                    }
                }
            }
            if (sksi_query_utilities.NIL == failP && sksi_query_utilities.NIL != where) {
                where = (SubLObject)ConsesLow.cons(sksi_query_utilities.$const42$CSQLAnd, where);
            }
        }
        else if (pcase_var.eql(sksi_query_utilities.$const43$or)) {
            final SubLObject args = cycl_utilities.formula_args(sentence, (SubLObject)sksi_query_utilities.$kw40$IGNORE);
            SubLObject rest;
            SubLObject disjunct;
            SubLObject disjunct_where;
            for (rest = (SubLObject)sksi_query_utilities.NIL, rest = args; sksi_query_utilities.NIL == failP && sksi_query_utilities.NIL != rest; rest = rest.rest()) {
                disjunct = rest.first();
                disjunct_where = get_where_expression_from_sentence_recursive(cms_gaf, disjunct, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED);
                if (sksi_query_utilities.NIL != disjunct_where) {
                    where = (SubLObject)ConsesLow.cons(disjunct_where, where);
                }
                else {
                    failP = (SubLObject)sksi_query_utilities.T;
                }
            }
            if (sksi_query_utilities.NIL == failP) {
                where = (SubLObject)ConsesLow.cons(sksi_query_utilities.$const44$CSQLOr, where);
            }
        }
        else if (pcase_var.eql(sksi_query_utilities.$const45$not)) {
            final SubLObject not_where = get_where_expression_from_sentence_recursive(cms_gaf, cycl_utilities.formula_arg1(sentence, (SubLObject)sksi_query_utilities.UNPROVIDED), ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED);
            if (sksi_query_utilities.NIL != not_where) {
                where = (SubLObject)((sksi_query_utilities.NIL != kb_utilities.kbeq(sksi_query_utilities.$const46$CSQLNot, not_where.first())) ? conses_high.cadr(not_where) : ConsesLow.list(sksi_query_utilities.$const46$CSQLNot, not_where));
            }
            else {
                failP = (SubLObject)sksi_query_utilities.T;
            }
        }
        else if (pcase_var.eql(sksi_query_utilities.$const47$implies)) {
            final SubLObject ant = get_where_expression_from_sentence_recursive(cms_gaf, cycl_utilities.formula_arg1(sentence, (SubLObject)sksi_query_utilities.UNPROVIDED), ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED);
            final SubLObject con = get_where_expression_from_sentence_recursive(cms_gaf, cycl_utilities.formula_arg2(sentence, (SubLObject)sksi_query_utilities.UNPROVIDED), ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED);
            SubLObject not_ant = (SubLObject)sksi_query_utilities.NIL;
            if (sksi_query_utilities.NIL != ant && sksi_query_utilities.NIL != con) {
                not_ant = (SubLObject)((sksi_query_utilities.NIL != kb_utilities.kbeq(sksi_query_utilities.$const46$CSQLNot, ant.first())) ? conses_high.cadr(ant) : ConsesLow.list(sksi_query_utilities.$const46$CSQLNot, ant));
                where = (SubLObject)ConsesLow.list(sksi_query_utilities.$const44$CSQLOr, not_ant, con);
            }
            else {
                failP = (SubLObject)sksi_query_utilities.T;
            }
        }
        else if (pcase_var.eql(sksi_query_utilities.$const48$equiv)) {
            final SubLObject left = get_where_expression_from_sentence_recursive(cms_gaf, cycl_utilities.formula_arg1(sentence, (SubLObject)sksi_query_utilities.UNPROVIDED), ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED);
            final SubLObject right = get_where_expression_from_sentence_recursive(cms_gaf, cycl_utilities.formula_arg2(sentence, (SubLObject)sksi_query_utilities.UNPROVIDED), ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED);
            SubLObject not_left = (SubLObject)sksi_query_utilities.NIL;
            SubLObject not_right = (SubLObject)sksi_query_utilities.NIL;
            if (sksi_query_utilities.NIL != left && sksi_query_utilities.NIL != right) {
                not_left = (SubLObject)((sksi_query_utilities.NIL != kb_utilities.kbeq(sksi_query_utilities.$const46$CSQLNot, left.first())) ? conses_high.cadr(left) : ConsesLow.list(sksi_query_utilities.$const46$CSQLNot, left));
                not_right = (SubLObject)((sksi_query_utilities.NIL != kb_utilities.kbeq(sksi_query_utilities.$const46$CSQLNot, right.first())) ? conses_high.cadr(right) : ConsesLow.list(sksi_query_utilities.$const46$CSQLNot, right));
                where = (SubLObject)ConsesLow.list(sksi_query_utilities.$const44$CSQLOr, (SubLObject)ConsesLow.list(sksi_query_utilities.$const42$CSQLAnd, left, right), (SubLObject)ConsesLow.list(sksi_query_utilities.$const42$CSQLAnd, not_left, not_right));
            }
            else {
                failP = (SubLObject)sksi_query_utilities.T;
            }
        }
        else {
            thread.resetMultipleValues();
            final SubLObject csql_where = get_where_expression_from_literal(cms_gaf, sentence, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, eval_conditions_for_later_use);
            final SubLObject literal_eval_conditions_for_later_use = thread.secondMultipleValue();
            thread.resetMultipleValues();
            eval_conditions_for_later_use = ConsesLow.append(eval_conditions_for_later_use, literal_eval_conditions_for_later_use);
            if (sksi_query_utilities.NIL == csql_where) {
                failP = (SubLObject)sksi_query_utilities.T;
            }
            else if (csql_where.isCons() && sksi_query_utilities.NIL != sksi_csql_utilities.csql_eval_expression_p(conses_high.second(csql_where))) {
                eval_conditions = (SubLObject)ConsesLow.cons(csql_where, eval_conditions);
                where = (SubLObject)sksi_query_utilities.T;
            }
            else {
                where = csql_where;
            }
        }
        return (sksi_query_utilities.NIL != failP) ? Values.values((SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.NIL) : Values.values(where, eval_conditions, eval_conditions_for_later_use);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 31681L)
    public static SubLObject evaluate_literal_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_query_utilities.NIL != cycl_grammar.cycl_literal_p(v_object) && sksi_query_utilities.NIL != kb_utilities.kbeq(sksi_query_utilities.$const49$evaluate, el_utilities.literal_predicate(v_object, (SubLObject)sksi_query_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 31819L)
    public static SubLObject get_where_expression_from_literal(final SubLObject cms_gaf, final SubLObject literal, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac, SubLObject eval_conditions_for_later_use) {
        if (eval_conditions_for_later_use == sksi_query_utilities.UNPROVIDED) {
            eval_conditions_for_later_use = (SubLObject)sksi_query_utilities.NIL;
        }
        if (sksi_query_utilities.NIL != comparison_literal_p(literal)) {
            return Values.values(get_where_expression_from_comparison_literal(literal, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac), (SubLObject)sksi_query_utilities.NIL);
        }
        if (sksi_query_utilities.NIL != evaluate_literal_p(literal)) {
            return Values.values(get_where_expression_from_evaluate_literal(literal, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, eval_conditions_for_later_use), (SubLObject)sksi_query_utilities.NIL);
        }
        return get_where_expression_from_other_literal(cms_gaf, literal, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 32804L)
    public static SubLObject get_where_expression_from_comparison_literal(final SubLObject literal, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac) {
        final SubLObject pred = el_utilities.literal_predicate(literal, (SubLObject)sksi_query_utilities.UNPROVIDED);
        final SubLObject args = el_utilities.literal_args(literal, (SubLObject)sksi_query_utilities.UNPROVIDED);
        final SubLObject left = args.first();
        final SubLObject right = conses_high.second(args);
        SubLObject csql_operator = sksi_kb_accessors.cycl_operator_to_csql_operator(pred);
        SubLObject negatedP = (SubLObject)sksi_query_utilities.NIL;
        SubLObject where = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL != sksi_csql_utilities.csql_where_clause_negated_comparison_operator_p(csql_operator)) {
            negatedP = (SubLObject)sksi_query_utilities.T;
            csql_operator = sksi_csql_utilities.csql_negate_comparison_relation(csql_operator);
        }
        if (sksi_query_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(left)) {
            if (sksi_query_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(right)) {
                where = get_where_expression_from_comparison_literal_double_lfis(left, right, csql_operator, content_mt, sks, physical_schemata, query_lit, tac);
            }
            else {
                where = get_where_expression_from_comparison_literal_single_lfi(left, right, csql_operator, content_mt, sks, physical_schemata, query_lit, tac);
            }
        }
        else if (sksi_query_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(right)) {
            where = get_where_expression_from_comparison_literal_single_lfi(left, right, csql_operator, content_mt, sks, physical_schemata, query_lit, tac);
        }
        else if (sksi_query_utilities.NIL != sksi_infrastructure_utilities.sksi_supported_function_expression_p(left)) {
            final SubLObject new_left = get_where_expression_from_evaluate_literal_int(left, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED);
            if (sksi_query_utilities.NIL != sksi_infrastructure_utilities.sksi_supported_function_expression_p(right)) {
                final SubLObject new_right = get_where_expression_from_evaluate_literal_int(right, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED);
                where = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(csql_operator, new_left, new_right));
            }
            else {
                where = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(csql_operator, new_left, right));
            }
        }
        else if (sksi_query_utilities.NIL != sksi_infrastructure_utilities.sksi_supported_function_expression_p(right)) {
            final SubLObject new_right2 = get_where_expression_from_evaluate_literal_int(right, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED);
            where = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(csql_operator, left, new_right2));
        }
        if (sksi_query_utilities.NIL == sksi_csql_utilities.csql_true_p(where) && sksi_query_utilities.NIL == list_utilities.singletonP(where) && sksi_query_utilities.NIL == sksi_csql_utilities.csql_conjunction_p(where)) {
            where = sksi_csql_utilities.csql_conjoin_expressions(where);
        }
        if (sksi_query_utilities.NIL != list_utilities.singletonP(where)) {
            where = where.first();
        }
        if (sksi_query_utilities.NIL != negatedP) {
            where = sksi_csql_utilities.csql_negate_expression(where);
        }
        return where;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 35388L)
    public static SubLObject get_where_expression_from_comparison_literal_single_lfi(final SubLObject left, final SubLObject right, final SubLObject csql_operator, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac) {
        final SubLObject left_lfiP = (SubLObject)((sksi_query_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(left)) ? sksi_query_utilities.T : sksi_query_utilities.NIL);
        final SubLObject lfi = (sksi_query_utilities.NIL != left_lfiP) ? left : right;
        final SubLObject non_lfi = (sksi_query_utilities.NIL != left_lfiP) ? right : left;
        final SubLObject encodings = sksi_field_translation_utilities.generate_encoding_compositions_from_logical_field_indexical(lfi, (SubLObject)sksi_query_utilities.NIL, physical_schemata, (SubLObject)sksi_query_utilities.UNPROVIDED);
        SubLObject where = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == encodings) {
            Dynamic.sublisp_throw((SubLObject)sksi_query_utilities.$kw50$SKSI_MISSING_ENCODINGS, lfi);
        }
        else {
            SubLObject cdolist_list_var = encodings;
            SubLObject encoding_pfi_pair = (SubLObject)sksi_query_utilities.NIL;
            encoding_pfi_pair = cdolist_list_var.first();
            while (sksi_query_utilities.NIL != cdolist_list_var) {
                final SubLObject physical_field_indexical = encoding_pfi_pair.first();
                final SubLObject encoding = conses_high.second(encoding_pfi_pair);
                final SubLObject field_table_tuples = physical_field_indexical_field_table_tuples(physical_field_indexical, sks, query_lit, tac);
                final SubLObject reformed = sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate((SubLObject)ConsesLow.list(reader.bq_cons(lfi, non_lfi)), encoding, sks, content_mt);
                if (sksi_query_utilities.NIL != sksi_unreformulatable_p(reformed)) {
                    Dynamic.sublisp_throw((SubLObject)sksi_query_utilities.$kw51$SKSI_UNREFORMULATABLE, non_lfi);
                }
                else if (sksi_query_utilities.NIL != left_lfiP) {
                    SubLObject cdolist_list_var_$18 = field_table_tuples;
                    SubLObject field_table_tuple = (SubLObject)sksi_query_utilities.NIL;
                    field_table_tuple = cdolist_list_var_$18.first();
                    while (sksi_query_utilities.NIL != cdolist_list_var_$18) {
                        where = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(csql_operator, reader.bq_cons((SubLObject)sksi_query_utilities.$kw52$FIELD, field_table_tuple), reformed), where);
                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                        field_table_tuple = cdolist_list_var_$18.first();
                    }
                }
                else {
                    SubLObject cdolist_list_var_$19 = field_table_tuples;
                    SubLObject field_table_tuple = (SubLObject)sksi_query_utilities.NIL;
                    field_table_tuple = cdolist_list_var_$19.first();
                    while (sksi_query_utilities.NIL != cdolist_list_var_$19) {
                        where = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(csql_operator, reformed, reader.bq_cons((SubLObject)sksi_query_utilities.$kw52$FIELD, field_table_tuple)), where);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 36693L)
    public static SubLObject get_where_expression_from_comparison_literal_double_lfis(final SubLObject left, final SubLObject right, final SubLObject csql_operator, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac) {
        final SubLObject left_decodings = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(left, (SubLObject)sksi_query_utilities.NIL, physical_schemata);
        final SubLObject right_decodings = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(right, (SubLObject)sksi_query_utilities.NIL, physical_schemata);
        SubLObject where = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == left_decodings) {
            Dynamic.sublisp_throw((SubLObject)sksi_query_utilities.$kw53$SKSI_MISSING_DECODINGS, left);
        }
        else if (sksi_query_utilities.NIL == right_decodings) {
            Dynamic.sublisp_throw((SubLObject)sksi_query_utilities.$kw53$SKSI_MISSING_DECODINGS, right);
        }
        else {
            final SubLObject left_pfi_lists = Mapping.mapcar((SubLObject)sksi_query_utilities.$sym54$DECODING_PHYSICAL_FIELD_INDEXICALS_ORDERED, left_decodings);
            final SubLObject right_pfi_lists = Mapping.mapcar((SubLObject)sksi_query_utilities.$sym54$DECODING_PHYSICAL_FIELD_INDEXICALS_ORDERED, right_decodings);
            SubLObject cdolist_list_var = left_pfi_lists;
            SubLObject left_pfi_list = (SubLObject)sksi_query_utilities.NIL;
            left_pfi_list = cdolist_list_var.first();
            while (sksi_query_utilities.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$20 = right_pfi_lists;
                SubLObject right_pfi_list = (SubLObject)sksi_query_utilities.NIL;
                right_pfi_list = cdolist_list_var_$20.first();
                while (sksi_query_utilities.NIL != cdolist_list_var_$20) {
                    where = (SubLObject)ConsesLow.cons(get_pair_expression(csql_operator, (SubLObject)ConsesLow.list(left_pfi_list, right_pfi_list), sks, query_lit, tac), where);
                    cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                    right_pfi_list = cdolist_list_var_$20.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                left_pfi_list = cdolist_list_var.first();
            }
            if (sksi_query_utilities.NIL == list_utilities.singletonP(where)) {
                where = sksi_csql_utilities.csql_conjoin_expressions(where);
            }
        }
        return where;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 37810L)
    public static SubLObject get_where_expression_from_evaluate_literal(final SubLObject literal, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac, SubLObject eval_conditions_for_later_use) {
        if (eval_conditions_for_later_use == sksi_query_utilities.UNPROVIDED) {
            eval_conditions_for_later_use = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject literal_var_lfi = cycl_utilities.formula_arg1(literal, (SubLObject)sksi_query_utilities.UNPROVIDED);
        final SubLObject literal_eval_expression = cycl_utilities.formula_arg2(literal, (SubLObject)sksi_query_utilities.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject csql_eval_expression = get_where_expression_from_evaluate_literal_int(literal_eval_expression, ant_ls_set, con_ms, con_ls_set, content_mt, sks, physical_schemata, query_lit, tac, eval_conditions_for_later_use);
        final SubLObject unit_of_measure = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(literal_var_lfi, sksi_csql_utilities.make_csql_expression((SubLObject)sksi_query_utilities.$kw55$EVAL, (SubLObject)ConsesLow.list(csql_eval_expression)), unit_of_measure);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 38450L)
    public static SubLObject get_where_expression_from_evaluate_literal_int(final SubLObject literal_eval_expression, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac, SubLObject eval_conditions_for_later_use) {
        if (eval_conditions_for_later_use == sksi_query_utilities.UNPROVIDED) {
            eval_conditions_for_later_use = (SubLObject)sksi_query_utilities.NIL;
        }
        SubLObject literal_eval_expression_copy = el_utilities.copy_expression(literal_eval_expression);
        final SubLObject literal_logical_field_indexicals = sksi_infrastructure_utilities.expression_logical_field_indexicals(literal_eval_expression, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.UNPROVIDED);
        final SubLObject literal_logical_field_indexical_forts = list_utilities.fast_delete_duplicates(Mapping.mapcar((SubLObject)sksi_query_utilities.$sym56$LFI_FORT_FOR_LFI, literal_logical_field_indexicals), (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
        SubLObject literal_ls = (SubLObject)sksi_query_utilities.NIL;
        SubLObject literal_ps = (SubLObject)sksi_query_utilities.NIL;
        SubLObject literal_ks = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == literal_ls) {
            SubLObject csome_list_var = ant_ls_set;
            SubLObject ls = (SubLObject)sksi_query_utilities.NIL;
            ls = csome_list_var.first();
            while (sksi_query_utilities.NIL == literal_ls && sksi_query_utilities.NIL != csome_list_var) {
                final SubLObject ls_lfis = sksi_kb_accessors.logical_schema_field_indexicals(ls);
                if (sksi_query_utilities.NIL != list_utilities.fast_subsetP(literal_logical_field_indexical_forts, ls_lfis, (SubLObject)sksi_query_utilities.UNPROVIDED)) {
                    literal_ls = ls;
                }
                csome_list_var = csome_list_var.rest();
                ls = csome_list_var.first();
            }
        }
        literal_ps = keyhash_utilities.fast_intersection(sksi_kb_accessors.logical_schema_physical_schemata(literal_ls), physical_schemata, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQ), (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED).first();
        if (sksi_query_utilities.NIL == literal_ks) {
            SubLObject csome_list_var = sksi_kb_accessors.logical_schema_sources(literal_ls);
            SubLObject ks = (SubLObject)sksi_query_utilities.NIL;
            ks = csome_list_var.first();
            while (sksi_query_utilities.NIL == literal_ks && sksi_query_utilities.NIL != csome_list_var) {
                if (sksi_query_utilities.NIL != sksi_kb_accessors.sk_source_sub_ksP(sks, ks)) {
                    literal_ks = ks;
                }
                csome_list_var = csome_list_var.rest();
                ks = csome_list_var.first();
            }
        }
        SubLObject cdolist_list_var = literal_logical_field_indexicals;
        SubLObject lfi = (SubLObject)sksi_query_utilities.NIL;
        lfi = cdolist_list_var.first();
        while (sksi_query_utilities.NIL != cdolist_list_var) {
            SubLObject lfi_eval_exp = Sequences.find(lfi, eval_conditions_for_later_use, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_query_utilities.$sym2$FIRST), (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
            if (sksi_query_utilities.NIL != lfi_eval_exp) {
                final SubLObject unit_of_measure = conses_high.third(lfi_eval_exp);
                if (sksi_query_utilities.NIL != unit_of_measure) {
                    lfi_eval_exp = (SubLObject)ConsesLow.list(unit_of_measure, conses_high.second(lfi_eval_exp));
                }
                else {
                    lfi_eval_exp = conses_high.second(lfi_eval_exp);
                }
                literal_eval_expression_copy = cycl_utilities.expression_subst(lfi_eval_exp, lfi, literal_eval_expression_copy, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL), (SubLObject)sksi_query_utilities.UNPROVIDED);
            }
            else {
                final SubLObject decoding = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(lfi, (SubLObject)ConsesLow.list(literal_ls), (SubLObject)ConsesLow.list(literal_ps)).first();
                literal_eval_expression_copy = cycl_utilities.expression_subst(decoding, lfi, literal_eval_expression_copy, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL), (SubLObject)sksi_query_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        }
        final SubLObject csql_eval_expression = get_csql_expression_for_evaluatable_expression(literal_eval_expression_copy, literal_ps, literal_ls, literal_ks, query_lit, tac, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
        final SubLObject literal_eval_expression_operator = cycl_utilities.formula_operator(literal_eval_expression);
        final SubLObject unit_of_measure2 = (SubLObject)((sksi_query_utilities.NIL != sksi_infrastructure_utilities.isa_unit_of_measureP(literal_eval_expression_operator)) ? literal_eval_expression_operator : sksi_query_utilities.NIL);
        return Values.values(csql_eval_expression, unit_of_measure2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 40894L)
    public static SubLObject get_csql_expression_for_evaluatable_expression(final SubLObject eval_expression, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject sk_source, final SubLObject query_lit, final SubLObject tac, SubLObject var_lit_pfis, SubLObject var_pfi_encodings, SubLObject lit_pfi_selects) {
        if (var_lit_pfis == sksi_query_utilities.UNPROVIDED) {
            var_lit_pfis = (SubLObject)sksi_query_utilities.NIL;
        }
        if (var_pfi_encodings == sksi_query_utilities.UNPROVIDED) {
            var_pfi_encodings = (SubLObject)sksi_query_utilities.NIL;
        }
        if (lit_pfi_selects == sksi_query_utilities.UNPROVIDED) {
            lit_pfi_selects = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_query_utilities.NIL != fort_types_interface.sksi_supported_constant_p(eval_expression)) {
            return sksi_kb_accessors.cycl_operator_to_csql_operator(eval_expression);
        }
        if (sksi_query_utilities.NIL != variables.variable_p(eval_expression)) {
            return get_csql_expression_for_evaluatable_expression_var(eval_expression, var_lit_pfis, var_pfi_encodings, lit_pfi_selects);
        }
        if (eval_expression.isAtom()) {
            return eval_expression;
        }
        if (sksi_query_utilities.NIL != sksi_kb_accessors.physical_field_indexical_p(eval_expression)) {
            return make_csql_field_expression_for_pfi(eval_expression, query_lit, tac);
        }
        if (sksi_query_utilities.NIL != sksi_csql_utilities.csql_eval_expression_p(eval_expression)) {
            return sksi_csql_utilities.csql_expression_arg1(eval_expression);
        }
        if (sksi_query_utilities.NIL == isa.isaP(eval_expression, sksi_query_utilities.$const57$Time_Quantity, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED)) {
            if (sksi_query_utilities.NIL != el_utilities.el_formula_p(eval_expression)) {
                final SubLObject operator = cycl_utilities.formula_operator(eval_expression);
                if (sksi_query_utilities.NIL != sksi_infrastructure_utilities.isa_unit_of_measureP(operator) && sksi_query_utilities.NIL != el_utilities.el_unary_formula_p(eval_expression)) {
                    return get_csql_expression_for_evaluatable_expression(cycl_utilities.formula_arg1(eval_expression, (SubLObject)sksi_query_utilities.UNPROVIDED), physical_schema, logical_schema, sk_source, query_lit, tac, var_lit_pfis, var_pfi_encodings, lit_pfi_selects);
                }
                if (sksi_query_utilities.NIL != kb_utilities.kbeq(operator, sksi_query_utilities.$const63$QuantityConversionFn)) {
                    final SubLObject to_unit = cycl_utilities.formula_arg1(eval_expression, (SubLObject)sksi_query_utilities.UNPROVIDED);
                    final SubLObject from_unit = cycl_utilities.formula_operator(cycl_utilities.formula_arg2(eval_expression, (SubLObject)sksi_query_utilities.UNPROVIDED));
                    final SubLObject factor = quantities.unit_multiplication_factor(from_unit, to_unit, (SubLObject)sksi_query_utilities.UNPROVIDED);
                    final SubLObject sub_eval = get_csql_expression_for_evaluatable_expression(cycl_utilities.formula_arg2(eval_expression, (SubLObject)sksi_query_utilities.UNPROVIDED), physical_schema, logical_schema, sk_source, query_lit, tac, var_lit_pfis, var_pfi_encodings, lit_pfi_selects);
                    if (sksi_query_utilities.NIL != sub_eval) {
                        return sksi_csql_utilities.make_csql_expression(sksi_query_utilities.$const64$CSQLTimesFn, (SubLObject)ConsesLow.list(factor, sub_eval));
                    }
                    return (SubLObject)sksi_query_utilities.NIL;
                }
                else {
                    if (sksi_query_utilities.NIL != fort_types_interface.sksi_supported_function_p(operator)) {
                        final SubLObject args = cycl_utilities.formula_args(eval_expression, (SubLObject)sksi_query_utilities.UNPROVIDED);
                        SubLObject new_args = (SubLObject)sksi_query_utilities.NIL;
                        SubLObject cdolist_list_var = args;
                        SubLObject arg = (SubLObject)sksi_query_utilities.NIL;
                        arg = cdolist_list_var.first();
                        while (sksi_query_utilities.NIL != cdolist_list_var) {
                            final SubLObject arg_csql = get_csql_expression_for_evaluatable_expression(arg, physical_schema, logical_schema, sk_source, query_lit, tac, var_lit_pfis, var_pfi_encodings, lit_pfi_selects);
                            if (sksi_query_utilities.NIL == arg_csql) {
                                return (SubLObject)sksi_query_utilities.NIL;
                            }
                            new_args = (SubLObject)ConsesLow.cons(arg_csql, new_args);
                            cdolist_list_var = cdolist_list_var.rest();
                            arg = cdolist_list_var.first();
                        }
                        new_args = Sequences.nreverse(new_args);
                        return sksi_csql_utilities.make_csql_expression(sksi_kb_accessors.cycl_operator_to_csql_operator(operator), new_args);
                    }
                    final SubLObject pfi_arg = Sequences.find_if((SubLObject)sksi_query_utilities.$sym65$PHYSICAL_FIELD_INDEXICAL_P, cycl_utilities.formula_args(eval_expression, (SubLObject)sksi_query_utilities.UNPROVIDED), (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
                    if (sksi_query_utilities.NIL != pfi_arg) {
                        return make_csql_field_expression_for_pfi(pfi_arg, query_lit, tac);
                    }
                }
            }
            return (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLObject seconds = date_utilities.convert_time_quant_to_seconds(eval_expression);
        if (sksi_query_utilities.NIL != seconds) {
            return sksi_csql_utilities.make_csql_expression(sksi_query_utilities.$const58$CSQLSecondsDurationFn, (SubLObject)ConsesLow.list(seconds));
        }
        final SubLObject months = date_utilities.convert_time_quant_to_months(eval_expression);
        if (sksi_query_utilities.NIL != months) {
            return sksi_csql_utilities.make_csql_expression(sksi_query_utilities.$const59$CSQLMonthsDurationFn, (SubLObject)ConsesLow.list(months));
        }
        final SubLObject years = date_utilities.convert_time_quant_to_years(eval_expression);
        if (sksi_query_utilities.NIL != years) {
            return sksi_csql_utilities.make_csql_expression(sksi_query_utilities.$const60$CSQLYearsDurationFn, (SubLObject)ConsesLow.list(years));
        }
        if (sksi_query_utilities.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_query_utilities.SEVEN_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_query_utilities.$str61$__SKSI__A_, (SubLObject)sksi_query_utilities.$str62$SKSI_could_not_convert___Time_Qua), (SubLObject)sksi_query_utilities.SEVEN_INTEGER, eval_expression);
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 44184L)
    public static SubLObject get_csql_expression_for_evaluatable_expression_var(final SubLObject var, final SubLObject var_lit_pfis, final SubLObject var_pfi_encodings, final SubLObject lit_pfi_selects) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject this_var_lit_pfis = dictionary.dictionary_lookup(var_lit_pfis, var, (SubLObject)sksi_query_utilities.UNPROVIDED);
        SubLObject result = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL != dictionary.dictionary_p(this_var_lit_pfis)) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(this_var_lit_pfis)); sksi_query_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject var_lit = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject var_pfis = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject pfi_selects = dictionary.dictionary_lookup(lit_pfi_selects, var_lit, (SubLObject)sksi_query_utilities.UNPROVIDED);
                SubLObject cdolist_list_var = var_pfis;
                SubLObject pfi = (SubLObject)sksi_query_utilities.NIL;
                pfi = cdolist_list_var.first();
                while (sksi_query_utilities.NIL != cdolist_list_var) {
                    final SubLObject pfi_select = dictionary.dictionary_lookup(pfi_selects, pfi, (SubLObject)sksi_query_utilities.UNPROVIDED);
                    if (sksi_query_utilities.NIL != pfi_select) {
                        result = ConsesLow.append(result, pfi_select);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pfi = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return result.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 44776L)
    public static SubLObject make_csql_field_expression_for_pfi(final SubLObject pfi, SubLObject lit, SubLObject tac) {
        if (lit == sksi_query_utilities.UNPROVIDED) {
            lit = (SubLObject)sksi_query_utilities.NIL;
        }
        if (tac == sksi_query_utilities.UNPROVIDED) {
            tac = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLObject field_name = sksi_kb_accessors.physical_field_indexical_name(pfi);
        SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
        final SubLObject namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace(pfi);
        if (sksi_query_utilities.NIL != lit && sksi_query_utilities.NIL != tac) {
            final SubLObject index = sksi_kb_accessors.pfi_index_for_pfi(pfi, (SubLObject)sksi_query_utilities.ZERO_INTEGER);
            table_name = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, index);
        }
        else if (sksi_query_utilities.NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(pfi)) {
            final SubLObject index = sksi_kb_accessors.pfi_alias_fn_naut_index(pfi);
            table_name = sksi_csql_generation.make_table_alias_name(table_name, index);
        }
        return sksi_csql_utilities.construct_csql_field_expression(field_name, table_name, namespace);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 45426L)
    public static SubLObject get_where_expression_from_other_literal(final SubLObject cms_gaf, final SubLObject literal, final SubLObject ant_ls_set, final SubLObject con_ms, final SubLObject con_ls_set, final SubLObject content_mt, final SubLObject sks, final SubLObject physical_schemata, final SubLObject query_lit, final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_query_utilities.NIL == cms_gaf) {
            return (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLObject literal_logical_field_indexicals = sksi_infrastructure_utilities.expression_logical_field_indexicals(literal, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.UNPROVIDED);
        final SubLObject literal_logical_field_indexical_forts = list_utilities.fast_delete_duplicates(Mapping.mapcar((SubLObject)sksi_query_utilities.$sym56$LFI_FORT_FOR_LFI, literal_logical_field_indexicals), (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
        SubLObject literal_ls = (SubLObject)sksi_query_utilities.NIL;
        SubLObject literal_ps = (SubLObject)sksi_query_utilities.NIL;
        SubLObject literal_ks = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == literal_ls) {
            SubLObject csome_list_var = ant_ls_set;
            SubLObject ls = (SubLObject)sksi_query_utilities.NIL;
            ls = csome_list_var.first();
            while (sksi_query_utilities.NIL == literal_ls && sksi_query_utilities.NIL != csome_list_var) {
                final SubLObject ls_lfis = sksi_kb_accessors.logical_schema_field_indexicals(ls);
                if (sksi_query_utilities.NIL != list_utilities.fast_subsetP(literal_logical_field_indexical_forts, ls_lfis, (SubLObject)sksi_query_utilities.UNPROVIDED)) {
                    literal_ls = ls;
                }
                csome_list_var = csome_list_var.rest();
                ls = csome_list_var.first();
            }
        }
        literal_ps = keyhash_utilities.fast_intersection(sksi_kb_accessors.logical_schema_physical_schemata(literal_ls), physical_schemata, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED).first();
        if (sksi_query_utilities.NIL == literal_ks) {
            SubLObject csome_list_var = sksi_kb_accessors.logical_schema_sources(literal_ls);
            SubLObject ks = (SubLObject)sksi_query_utilities.NIL;
            ks = csome_list_var.first();
            while (sksi_query_utilities.NIL == literal_ks && sksi_query_utilities.NIL != csome_list_var) {
                if (sksi_query_utilities.NIL != sksi_kb_accessors.sk_source_sub_ksP(sks, ks)) {
                    literal_ks = ks;
                }
                csome_list_var = csome_list_var.rest();
                ks = csome_list_var.first();
            }
        }
        final SubLObject ls_ms_list = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences_relevant_to_appropriateness_check(literal_ls, cms_gaf, (SubLObject)sksi_query_utilities.NIL);
        SubLObject literal_meaning_sentence = sksi_meaning_sentence_utilities.meaning_sentences_type_check(literal, ls_ms_list, (SubLObject)sksi_query_utilities.T, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.$kw66$RAW).first();
        SubLObject ls_cms_list = (SubLObject)sksi_query_utilities.NIL;
        SubLObject eval_conditions_for_later_use = (SubLObject)sksi_query_utilities.NIL;
        SubLObject where_clause = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == literal_meaning_sentence) {
            ls_cms_list = sksi_meaning_sentence_utilities.logical_schema_conditional_meaning_sentence_gafs_relevant_to_appropriateness_check(literal_ls, cms_gaf, (SubLObject)sksi_query_utilities.NIL);
            SubLObject foundP = (SubLObject)sksi_query_utilities.NIL;
            SubLObject where_exp = (SubLObject)sksi_query_utilities.NIL;
            if (sksi_query_utilities.NIL == foundP) {
                SubLObject csome_list_var2 = ls_cms_list;
                SubLObject cms = (SubLObject)sksi_query_utilities.NIL;
                cms = csome_list_var2.first();
                while (sksi_query_utilities.NIL == foundP && sksi_query_utilities.NIL != csome_list_var2) {
                    if (sksi_query_utilities.NIL != sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(cms, literal_ks)) {
                        final SubLObject consequent_ms = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms, (SubLObject)sksi_query_utilities.UNPROVIDED);
                        if (sksi_query_utilities.NIL != sksi_meaning_sentence_utilities.meaning_sentence_type_check(literal, consequent_ms, (SubLObject)sksi_query_utilities.T, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.$kw66$RAW, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED)) {
                            foundP = (SubLObject)sksi_query_utilities.T;
                            literal_meaning_sentence = consequent_ms;
                            thread.resetMultipleValues();
                            final SubLObject where_exp_$21 = get_where_expression_from_antecedent_meaning_sentence(cms, content_mt, sks, physical_schemata, (SubLObject)sksi_query_utilities.NIL, tac);
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
        where_clause = get_where_expression_from_meaning_sentence(literal, literal_meaning_sentence, (SubLObject)ConsesLow.list(literal_ls), (SubLObject)ConsesLow.list(literal_ps), literal_ks, query_lit, tac, eval_conditions_for_later_use, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
        return Values.values(where_clause, eval_conditions_for_later_use);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 48272L)
    public static SubLObject get_where_expression_from_meaning_sentence(final SubLObject literal, final SubLObject literal_meaning_sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject literal_ks, final SubLObject query_lit, final SubLObject tac, final SubLObject eval_conditions_for_later_use, SubLObject var_pfi_encodings, SubLObject var_lit_pfis, SubLObject lit_pfi_selects, SubLObject var_lfi_map, SubLObject asents, SubLObject meaning_sentence_gafs, SubLObject sks_physical_schemata) {
        if (var_pfi_encodings == sksi_query_utilities.UNPROVIDED) {
            var_pfi_encodings = (SubLObject)sksi_query_utilities.NIL;
        }
        if (var_lit_pfis == sksi_query_utilities.UNPROVIDED) {
            var_lit_pfis = (SubLObject)sksi_query_utilities.NIL;
        }
        if (lit_pfi_selects == sksi_query_utilities.UNPROVIDED) {
            lit_pfi_selects = (SubLObject)sksi_query_utilities.NIL;
        }
        if (var_lfi_map == sksi_query_utilities.UNPROVIDED) {
            var_lfi_map = (SubLObject)sksi_query_utilities.NIL;
        }
        if (asents == sksi_query_utilities.UNPROVIDED) {
            asents = (SubLObject)sksi_query_utilities.NIL;
        }
        if (meaning_sentence_gafs == sksi_query_utilities.UNPROVIDED) {
            meaning_sentence_gafs = (SubLObject)sksi_query_utilities.NIL;
        }
        if (sks_physical_schemata == sksi_query_utilities.UNPROVIDED) {
            sks_physical_schemata = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lit_ms_lfis = sksi_infrastructure_utilities.expression_logical_field_indexicals_ordered(literal_meaning_sentence, (SubLObject)sksi_query_utilities.NIL);
        SubLObject relevant_lit_pfis = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals(lit_ms_lfis, logical_schemata, physical_schemata);
        final SubLObject fixed_lit_pfis = sksi_infrastructure_utilities.sksi_determine_fixed_physical_field_indexicals(logical_schemata, physical_schemata);
        final SubLObject any_pfi_alias_fn_nautP = Sequences.find_if((SubLObject)sksi_query_utilities.$sym67$PFI_ALIAS_FN_NAUT_P, relevant_lit_pfis, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
        SubLObject literal_lfi_alias = (SubLObject)sksi_query_utilities.NIL;
        SubLObject literal_where_clause = (SubLObject)sksi_query_utilities.NIL;
        SubLObject pfi_where_expressions = (SubLObject)sksi_query_utilities.NIL;
        SubLObject where_clause = (SubLObject)sksi_query_utilities.NIL;
        SubLObject from_clause = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == any_pfi_alias_fn_nautP) {
            if (sksi_query_utilities.NIL != sksi_query_datastructures.table_aliasing_context_p(tac)) {
                final SubLObject table_name = sksi_kb_accessors.sk_source_name(literal_ks);
                final SubLObject namespace = sksi_kb_accessors.sk_source_namespace(literal_ks);
                final SubLObject table_alias = sksi_query_datastructures.tac_alias_table(tac, query_lit, table_name, namespace, (SubLObject)sksi_query_utilities.UNPROVIDED);
                if (table_name.isString() && table_alias.isString()) {
                    literal_lfi_alias = sksi_query_datastructures.table_alias_alias_suffix(table_alias, table_name);
                    from_clause = (SubLObject)ConsesLow.list((SubLObject)((sksi_query_utilities.NIL != namespace) ? ConsesLow.list(table_name, table_alias, namespace) : ConsesLow.list(table_name, table_alias)));
                }
            }
            else {
                literal_lfi_alias = sksi_kb_accessors.lfi_alias_fn_naut_index(cycl_utilities.expression_find_if((SubLObject)sksi_query_utilities.$sym39$LFI_ALIAS_FN_NAUT_P, literal, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.UNPROVIDED));
            }
            if (sksi_query_utilities.NIL != literal_lfi_alias) {
                SubLObject new_pfis = (SubLObject)sksi_query_utilities.NIL;
                SubLObject cdolist_list_var = relevant_lit_pfis;
                SubLObject pfi = (SubLObject)sksi_query_utilities.NIL;
                pfi = cdolist_list_var.first();
                while (sksi_query_utilities.NIL != cdolist_list_var) {
                    new_pfis = (SubLObject)ConsesLow.cons(sksi_kb_accessors.pfi_alias_naut_for_pfi_and_alias_index(pfi, literal_lfi_alias), new_pfis);
                    cdolist_list_var = cdolist_list_var.rest();
                    pfi = cdolist_list_var.first();
                }
                relevant_lit_pfis = Sequences.nreverse(new_pfis);
            }
        }
        thread.resetMultipleValues();
        final SubLObject where = sksi_csql_generation.sksi_determine_csql_where_clause(literal_ks, literal_meaning_sentence, logical_schemata, physical_schemata, relevant_lit_pfis, fixed_lit_pfis, (SubLObject)sksi_query_utilities.NIL, eval_conditions_for_later_use);
        final SubLObject table_alias_list = thread.secondMultipleValue();
        final SubLObject pfi_where_mapping = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        literal_where_clause = where;
        pfi_where_expressions = pfi_where_mapping;
        if (sksi_query_utilities.NIL != literal_where_clause) {
            final SubLObject terms = cycl_utilities.formula_terms(literal, (SubLObject)sksi_query_utilities.$kw40$IGNORE);
            SubLObject list_var = (SubLObject)sksi_query_utilities.NIL;
            SubLObject arg = (SubLObject)sksi_query_utilities.NIL;
            SubLObject argnum = (SubLObject)sksi_query_utilities.NIL;
            list_var = terms;
            arg = list_var.first();
            for (argnum = (SubLObject)sksi_query_utilities.ZERO_INTEGER; sksi_query_utilities.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                SubLObject physical_field_name = (SubLObject)sksi_query_utilities.NIL;
                SubLObject replace_term = (SubLObject)sksi_query_utilities.NIL;
                SubLObject failP = (SubLObject)sksi_query_utilities.NIL;
                if (sksi_query_utilities.NIL == sksi_kb_accessors.logical_field_indexical_p(arg)) {
                    if (sksi_query_utilities.NIL != cycl_grammar.hl_variable_p(arg)) {
                        final SubLObject arg_lit_pfis = dictionary.dictionary_lookup(var_lit_pfis, arg, (SubLObject)sksi_query_utilities.UNPROVIDED);
                        SubLObject iteration_state;
                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(arg_lit_pfis)); sksi_query_utilities.NIL == failP && sksi_query_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject lit = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            final SubLObject pfis = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject lit_position = Sequences.position(lit, asents, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL), (SubLObject)sksi_query_utilities.$sym68$CONTEXTUALIZED_ASENT_ASENT, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
                            final SubLObject lit_meaning_sentence_gaf = ConsesLow.nth(lit_position, meaning_sentence_gafs);
                            final SubLObject lit_meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(lit_meaning_sentence_gaf, (SubLObject)sksi_query_utilities.UNPROVIDED);
                            failP = (SubLObject)sksi_query_utilities.T;
                            if (sksi_query_utilities.NIL == sksi_conjunctive_removal_module_utilities.sksi_crm_literals_incoherent_together(literal, literal_meaning_sentence, lit, lit_meaning_sentence, sks_physical_schemata)) {
                                failP = (SubLObject)sksi_query_utilities.NIL;
                                final SubLObject pfi_selects_for_lit = dictionary.dictionary_lookup(lit_pfi_selects, lit, (SubLObject)sksi_query_utilities.UNPROVIDED);
                                SubLObject foundP = (SubLObject)sksi_query_utilities.NIL;
                                if (sksi_query_utilities.NIL == foundP) {
                                    SubLObject csome_list_var = pfis;
                                    SubLObject pfi2 = (SubLObject)sksi_query_utilities.NIL;
                                    pfi2 = csome_list_var.first();
                                    while (sksi_query_utilities.NIL == foundP && sksi_query_utilities.NIL != csome_list_var) {
                                        final SubLObject pfi_selects = dictionary.dictionary_lookup(pfi_selects_for_lit, pfi2, (SubLObject)sksi_query_utilities.UNPROVIDED);
                                        final SubLObject pfi_select = pfi_selects.first();
                                        final SubLObject ms_arg = cycl_utilities.formula_arg(literal_meaning_sentence, argnum, (SubLObject)sksi_query_utilities.UNPROVIDED);
                                        replace_term = pfi_select;
                                        if (sksi_query_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(ms_arg)) {
                                            final SubLObject ms_pfis = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical(ms_arg, logical_schemata, physical_schemata);
                                            if (sksi_query_utilities.NIL == foundP) {
                                                SubLObject csome_list_var_$23 = ms_pfis;
                                                SubLObject ms_pfi = (SubLObject)sksi_query_utilities.NIL;
                                                ms_pfi = csome_list_var_$23.first();
                                                while (sksi_query_utilities.NIL == foundP && sksi_query_utilities.NIL != csome_list_var_$23) {
                                                    final SubLObject ms_arg_where = dictionary.dictionary_lookup(pfi_where_expressions, ms_pfi, (SubLObject)sksi_query_utilities.UNPROVIDED);
                                                    if (sksi_query_utilities.NIL != ms_arg_where) {
                                                        physical_field_name = sksi_csql_utilities.csql_expression_arg1(sksi_csql_utilities.csql_expression_arg1(ms_arg_where));
                                                        foundP = (SubLObject)sksi_query_utilities.T;
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
                    }
                    else if (sksi_query_utilities.NIL != literal_meaning_sentence) {
                        final SubLObject ms_arg2 = cycl_utilities.formula_arg(literal_meaning_sentence, argnum, (SubLObject)sksi_query_utilities.UNPROVIDED);
                        if (sksi_query_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(ms_arg2)) {
                            final SubLObject relevant_field_encoding_pf_indexical_pairs = sksi_incremental_edit.field_encodings_relevant_to_logical_field_indexical(ms_arg2, logical_schemata.first(), physical_schemata.first());
                            if (sksi_query_utilities.NIL == replace_term) {
                                SubLObject csome_list_var2 = relevant_field_encoding_pf_indexical_pairs;
                                SubLObject relevant_field_encoding_pf_indexical_pair = (SubLObject)sksi_query_utilities.NIL;
                                relevant_field_encoding_pf_indexical_pair = csome_list_var2.first();
                                while (sksi_query_utilities.NIL == replace_term && sksi_query_utilities.NIL != csome_list_var2) {
                                    SubLObject current;
                                    final SubLObject datum = current = relevant_field_encoding_pf_indexical_pair;
                                    SubLObject field_encoding = (SubLObject)sksi_query_utilities.NIL;
                                    SubLObject pf_indexical = (SubLObject)sksi_query_utilities.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_query_utilities.$list69);
                                    field_encoding = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_query_utilities.$list69);
                                    pf_indexical = current.first();
                                    current = current.rest();
                                    if (sksi_query_utilities.NIL == current) {
                                        physical_field_name = sksi_kb_accessors.physical_field_indexical_name(pf_indexical);
                                        if (sksi_query_utilities.NIL != cycl_grammar.el_variable_p(arg)) {
                                            replace_term = (SubLObject)sksi_query_utilities.$kw70$NOT_NULL;
                                        }
                                        else {
                                            replace_term = sksi_incremental_edit.sksi_incremental_edit_reformulate(arg, ms_arg2, field_encoding, literal_ks);
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_query_utilities.$list69);
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    relevant_field_encoding_pf_indexical_pair = csome_list_var2.first();
                                }
                            }
                        }
                    }
                }
                if (sksi_query_utilities.NIL == replace_term) {
                    replace_term = arg;
                }
                if (sksi_query_utilities.NIL != failP) {
                    return Values.values((SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.NIL);
                }
                if (sksi_query_utilities.NIL != sksi_csql_utilities.csql_conjunction_p(literal_where_clause)) {
                    final SubLObject csql_subexp = Sequences.find(physical_field_name, literal_where_clause, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL), (SubLObject)sksi_query_utilities.$sym71$CADADR, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED);
                    SubLObject new_csql_subexp = (SubLObject)sksi_query_utilities.NIL;
                    if (sksi_query_utilities.NIL != csql_subexp) {
                        if (replace_term == sksi_query_utilities.$kw70$NOT_NULL) {
                            new_csql_subexp = sksi_csql_utilities.make_csql_expression((SubLObject)sksi_query_utilities.$kw70$NOT_NULL, (SubLObject)ConsesLow.list(sksi_csql_utilities.csql_expression_arg1(csql_subexp)));
                        }
                        else {
                            new_csql_subexp = list_utilities.replace_nth((SubLObject)sksi_query_utilities.TWO_INTEGER, replace_term, csql_subexp);
                        }
                        literal_where_clause = list_utilities.tree_substitute(literal_where_clause, csql_subexp, new_csql_subexp);
                    }
                }
                else if (physical_field_name.equal(conses_high.second(conses_high.second(literal_where_clause)))) {
                    literal_where_clause = list_utilities.replace_nth((SubLObject)sksi_query_utilities.TWO_INTEGER, replace_term, literal_where_clause);
                }
            }
        }
        if (sksi_query_utilities.NIL != sksi_csql_utilities.csql_conjunction_p(literal_where_clause)) {
            final SubLObject conjuncts = sksi_csql_utilities.csql_conjunction_conjuncts(literal_where_clause);
            SubLObject new_conjuncts = (SubLObject)sksi_query_utilities.NIL;
            SubLObject cdolist_list_var2 = conjuncts;
            SubLObject conjunct = (SubLObject)sksi_query_utilities.NIL;
            conjunct = cdolist_list_var2.first();
            while (sksi_query_utilities.NIL != cdolist_list_var2) {
                if (sksi_query_utilities.NIL == list_utilities.tree_find((SubLObject)sksi_query_utilities.$kw72$VALUE, conjunct, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED)) {
                    new_conjuncts = (SubLObject)ConsesLow.cons(conjunct, new_conjuncts);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                conjunct = cdolist_list_var2.first();
            }
            where_clause = sksi_csql_utilities.csql_conjoin_expressions(Sequences.nreverse(new_conjuncts));
        }
        else if (sksi_query_utilities.NIL == list_utilities.tree_find((SubLObject)sksi_query_utilities.$kw72$VALUE, literal_where_clause, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED)) {
            where_clause = literal_where_clause;
        }
        return Values.values(where_clause, from_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 54652L)
    public static SubLObject get_pair_expression(final SubLObject csql_operator, final SubLObject physical_field_indexical_list_pair, final SubLObject sks, SubLObject lit, SubLObject tac) {
        if (lit == sksi_query_utilities.UNPROVIDED) {
            lit = (SubLObject)sksi_query_utilities.NIL;
        }
        if (tac == sksi_query_utilities.UNPROVIDED) {
            tac = (SubLObject)sksi_query_utilities.NIL;
        }
        SubLObject left_pfi_list = (SubLObject)sksi_query_utilities.NIL;
        SubLObject right_pfi_list = (SubLObject)sksi_query_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(physical_field_indexical_list_pair, physical_field_indexical_list_pair, (SubLObject)sksi_query_utilities.$list73);
        left_pfi_list = physical_field_indexical_list_pair.first();
        SubLObject current = physical_field_indexical_list_pair.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, physical_field_indexical_list_pair, (SubLObject)sksi_query_utilities.$list73);
        right_pfi_list = current.first();
        current = current.rest();
        if (sksi_query_utilities.NIL == current) {
            return apply_csql_operator_to_pfi_list_pair(csql_operator, left_pfi_list, right_pfi_list, sks, lit, lit, tac);
        }
        cdestructuring_bind.cdestructuring_bind_error(physical_field_indexical_list_pair, (SubLObject)sksi_query_utilities.$list73);
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 55128L)
    public static SubLObject binary_predicate_memoized_internal(final SubLObject v_object) {
        return kb_accessors.binary_predicateP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 55128L)
    public static SubLObject binary_predicate_memoized(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == v_memoization_state) {
            return binary_predicate_memoized_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_query_utilities.$sym74$BINARY_PREDICATE_MEMOIZED, (SubLObject)sksi_query_utilities.UNPROVIDED);
        if (sksi_query_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_query_utilities.$sym74$BINARY_PREDICATE_MEMOIZED, (SubLObject)sksi_query_utilities.ONE_INTEGER, (SubLObject)sksi_query_utilities.NIL, (SubLObject)sksi_query_utilities.EQ, (SubLObject)sksi_query_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_query_utilities.$sym74$BINARY_PREDICATE_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(binary_predicate_memoized_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)sksi_query_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 55231L)
    public static SubLObject apply_csql_operator_to_pfi_list_pair(final SubLObject operator, final SubLObject pfi_list0, final SubLObject pfi_list1, final SubLObject sks, SubLObject lit0, SubLObject lit1, SubLObject tac) {
        if (lit0 == sksi_query_utilities.UNPROVIDED) {
            lit0 = (SubLObject)sksi_query_utilities.NIL;
        }
        if (lit1 == sksi_query_utilities.UNPROVIDED) {
            lit1 = (SubLObject)sksi_query_utilities.NIL;
        }
        if (tac == sksi_query_utilities.UNPROVIDED) {
            tac = (SubLObject)sksi_query_utilities.NIL;
        }
        if (sksi_query_utilities.NIL != sksi_csql_utilities.csql_where_clause_reflexive_comparison_operator_p(operator) && lit0.equal(lit1) && pfi_list0.equal(pfi_list1)) {
            return sksi_csql_utilities.$csql_true$.getGlobalValue();
        }
        if (sksi_query_utilities.NIL != sksi_csql_utilities.csql_where_clause_anti_reflexive_comparison_operator_p(operator) && lit0.equal(lit1) && pfi_list0.equal(pfi_list1)) {
            return sksi_csql_utilities.$csql_false$.getGlobalValue();
        }
        SubLObject multi_alist = (SubLObject)sksi_query_utilities.NIL;
        SubLObject pfi_expressions = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == list_utilities.same_length_p(pfi_list0, pfi_list1)) {
            Dynamic.sublisp_throw((SubLObject)sksi_query_utilities.$kw75$SKSI_LIST_LENGTH_MISMATCH, (SubLObject)ConsesLow.list(pfi_list0, pfi_list1));
        }
        SubLObject pfi0 = (SubLObject)sksi_query_utilities.NIL;
        SubLObject pfi0_$24 = (SubLObject)sksi_query_utilities.NIL;
        SubLObject pfi2 = (SubLObject)sksi_query_utilities.NIL;
        SubLObject pfi1_$25 = (SubLObject)sksi_query_utilities.NIL;
        pfi0 = pfi_list0;
        pfi0_$24 = pfi0.first();
        pfi2 = pfi_list1;
        pfi1_$25 = pfi2.first();
        while (sksi_query_utilities.NIL != pfi2 || sksi_query_utilities.NIL != pfi0) {
            final SubLObject f_t_tuples0 = physical_field_indexical_field_table_tuples(pfi0_$24, sks, lit0, tac);
            final SubLObject f_t_tuples2 = physical_field_indexical_field_table_tuples(pfi1_$25, sks, lit1, tac);
            final SubLObject sym0 = Symbols.gensym((SubLObject)sksi_query_utilities.UNPROVIDED);
            final SubLObject sym2 = Symbols.gensym((SubLObject)sksi_query_utilities.UNPROVIDED);
            if (sksi_query_utilities.NIL != f_t_tuples0 && sksi_query_utilities.NIL != f_t_tuples2) {
                multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(sym0, f_t_tuples0), multi_alist);
                multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(sym2, f_t_tuples2), multi_alist);
                pfi_expressions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(operator, reader.bq_cons((SubLObject)sksi_query_utilities.$kw52$FIELD, sym0), reader.bq_cons((SubLObject)sksi_query_utilities.$kw52$FIELD, sym2)), pfi_expressions);
            }
            pfi0 = pfi0.rest();
            pfi0_$24 = pfi0.first();
            pfi2 = pfi2.rest();
            pfi1_$25 = pfi2.first();
        }
        final SubLObject pfi_expression = (sksi_query_utilities.NIL != sksi_csql_utilities.csql_where_clause_negated_comparison_operator_p(operator)) ? sksi_csql_utilities.csql_disjoin_expressions(pfi_expressions) : sksi_csql_utilities.csql_conjoin_expressions(pfi_expressions);
        return sksi_csql_utilities.csql_conjoin_expressions(list_utilities.multi_sublis(multi_alist, pfi_expression, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQ), (SubLObject)sksi_query_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 56710L)
    public static SubLObject apply_csql_operator_to_pfi_list_value_pair(final SubLObject operator, final SubLObject pfi_list, final SubLObject value, final SubLObject pfi_encodings, final SubLObject sks, SubLObject mt, SubLObject lit, SubLObject tac, SubLObject reverseP) {
        if (mt == sksi_query_utilities.UNPROVIDED) {
            mt = (SubLObject)sksi_query_utilities.NIL;
        }
        if (lit == sksi_query_utilities.UNPROVIDED) {
            lit = (SubLObject)sksi_query_utilities.NIL;
        }
        if (tac == sksi_query_utilities.UNPROVIDED) {
            tac = (SubLObject)sksi_query_utilities.NIL;
        }
        if (reverseP == sksi_query_utilities.UNPROVIDED) {
            reverseP = (SubLObject)sksi_query_utilities.NIL;
        }
        final SubLObject aggregation_fn = (SubLObject)((sksi_query_utilities.NIL != sksi_csql_utilities.csql_where_clause_negated_comparison_operator_p(operator)) ? sksi_query_utilities.$sym76$CSQL_DISJOIN_EXPRESSIONS : sksi_query_utilities.$sym77$CSQL_CONJOIN_EXPRESSIONS);
        SubLObject expressions = (SubLObject)sksi_query_utilities.NIL;
        SubLObject multi_alist = (SubLObject)sksi_query_utilities.NIL;
        SubLObject cdolist_list_var = pfi_list;
        SubLObject pfi = (SubLObject)sksi_query_utilities.NIL;
        pfi = cdolist_list_var.first();
        while (sksi_query_utilities.NIL != cdolist_list_var) {
            final SubLObject f_t_tuples = physical_field_indexical_field_table_tuples(pfi, sks, lit, tac);
            final SubLObject encodings = dictionary.dictionary_lookup(pfi_encodings, pfi, (SubLObject)sksi_query_utilities.UNPROVIDED);
            SubLObject pfi_expressions = (SubLObject)sksi_query_utilities.NIL;
            multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pfi, f_t_tuples), multi_alist);
            SubLObject cdolist_list_var_$26 = encodings;
            SubLObject encoding = (SubLObject)sksi_query_utilities.NIL;
            encoding = cdolist_list_var_$26.first();
            while (sksi_query_utilities.NIL != cdolist_list_var_$26) {
                final SubLObject lfis = sksi_field_translation_utilities.encoding_logical_field_indexicals(encoding);
                SubLObject alist = (SubLObject)sksi_query_utilities.NIL;
                SubLObject cdolist_list_var_$27 = lfis;
                SubLObject lfi = (SubLObject)sksi_query_utilities.NIL;
                lfi = cdolist_list_var_$27.first();
                while (sksi_query_utilities.NIL != cdolist_list_var_$27) {
                    alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(lfi, value), alist);
                    cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                    lfi = cdolist_list_var_$27.first();
                }
                final SubLObject reformed = sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate(alist, encoding, sks, mt);
                if (sksi_query_utilities.NIL != sksi_unreformulatable_p(reformed)) {
                    Dynamic.sublisp_throw((SubLObject)sksi_query_utilities.$kw51$SKSI_UNREFORMULATABLE, value);
                }
                if (sksi_query_utilities.NIL != reverseP) {
                    pfi_expressions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(operator, reformed, reader.bq_cons((SubLObject)sksi_query_utilities.$kw52$FIELD, pfi)), pfi_expressions);
                }
                else {
                    pfi_expressions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(operator, reader.bq_cons((SubLObject)sksi_query_utilities.$kw52$FIELD, pfi), reformed), pfi_expressions);
                }
                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                encoding = cdolist_list_var_$26.first();
            }
            expressions = (SubLObject)ConsesLow.cons(sksi_csql_utilities.csql_conjoin_expressions(pfi_expressions), expressions);
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        }
        return sksi_csql_utilities.csql_conjoin_expressions(list_utilities.multi_sublis(multi_alist, Functions.funcall(aggregation_fn, expressions), Symbols.symbol_function((SubLObject)sksi_query_utilities.EQ), (SubLObject)sksi_query_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 57956L)
    public static SubLObject physical_field_indexicals_data_types(final SubLObject physical_field_indexicals) {
        SubLObject data_types = (SubLObject)sksi_query_utilities.NIL;
        SubLObject cdolist_list_var = physical_field_indexicals;
        SubLObject physical_field_indexical = (SubLObject)sksi_query_utilities.NIL;
        physical_field_indexical = cdolist_list_var.first();
        while (sksi_query_utilities.NIL != cdolist_list_var) {
            data_types = (SubLObject)ConsesLow.cons(physical_field_indexical_data_type(physical_field_indexical), data_types);
            cdolist_list_var = cdolist_list_var.rest();
            physical_field_indexical = cdolist_list_var.first();
        }
        return Sequences.nreverse(data_types);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 58350L)
    public static SubLObject physical_field_indexical_data_type(final SubLObject physical_field_indexical) {
        final SubLObject physical_field = sksi_kb_accessors.physical_field_for_indexical(physical_field_indexical);
        return sksi_kb_accessors.physical_field_data_type(physical_field);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 58568L)
    public static SubLObject expression_contains_logical_field_indexicalP(final SubLObject logical_field_indexical, final SubLObject expression) {
        return cycl_utilities.expression_find(logical_field_indexical, expression, (SubLObject)sksi_query_utilities.T, Symbols.symbol_function((SubLObject)sksi_query_utilities.EQ), (SubLObject)sksi_query_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 58739L)
    public static SubLObject iterate_over_list_of_lists(final SubLObject lists, final SubLObject function, final SubLObject args, SubLObject return_valueP) {
        if (return_valueP == sksi_query_utilities.UNPROVIDED) {
            return_valueP = (SubLObject)sksi_query_utilities.NIL;
        }
        return (sksi_query_utilities.NIL != return_valueP) ? iterate_over_list_of_lists_return_value(lists, function, args) : iterate_over_list_of_lists_side_effect((SubLObject)sksi_query_utilities.NIL, lists, function, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 59450L)
    public static SubLObject iterate_over_list_of_lists_side_effect(final SubLObject so_far, final SubLObject remaining, final SubLObject function, final SubLObject args) {
        if (sksi_query_utilities.NIL == remaining) {
            Functions.apply(function, so_far, args);
        }
        else {
            SubLObject cdolist_list_var = remaining.first();
            SubLObject item = (SubLObject)sksi_query_utilities.NIL;
            item = cdolist_list_var.first();
            while (sksi_query_utilities.NIL != cdolist_list_var) {
                iterate_over_list_of_lists_side_effect(list_utilities.snoc(item, so_far), remaining.rest(), function, args);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 59759L)
    public static SubLObject iterate_over_list_of_lists_return_value(final SubLObject lists, final SubLObject function, final SubLObject args) {
        final SubLObject paths = generate_paths(lists, (SubLObject)sksi_query_utilities.UNPROVIDED);
        SubLObject results = (SubLObject)sksi_query_utilities.NIL;
        SubLObject cdolist_list_var = paths;
        SubLObject path = (SubLObject)sksi_query_utilities.NIL;
        path = cdolist_list_var.first();
        while (sksi_query_utilities.NIL != cdolist_list_var) {
            results = (SubLObject)ConsesLow.cons(Functions.apply(function, path, args), results);
            cdolist_list_var = cdolist_list_var.rest();
            path = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 59985L)
    public static SubLObject generate_paths(final SubLObject lists, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == sksi_query_utilities.UNPROVIDED) {
            remove_duplicatesP = (SubLObject)sksi_query_utilities.T;
        }
        if (sksi_query_utilities.NIL != remove_duplicatesP) {
            SubLObject new_lists = (SubLObject)sksi_query_utilities.NIL;
            SubLObject cdolist_list_var = lists;
            SubLObject list = (SubLObject)sksi_query_utilities.NIL;
            list = cdolist_list_var.first();
            while (sksi_query_utilities.NIL != cdolist_list_var) {
                new_lists = (SubLObject)ConsesLow.cons(list_utilities.fast_delete_duplicates(list, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED, (SubLObject)sksi_query_utilities.UNPROVIDED), new_lists);
                cdolist_list_var = cdolist_list_var.rest();
                list = cdolist_list_var.first();
            }
            return generate_paths_int(Sequences.nreverse(new_lists));
        }
        return generate_paths_int(lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 60592L)
    public static SubLObject generate_paths_int(final SubLObject lists) {
        SubLObject paths = (SubLObject)sksi_query_utilities.NIL;
        if (sksi_query_utilities.NIL == lists.rest()) {
            SubLObject cdolist_list_var = lists.first();
            SubLObject elt = (SubLObject)sksi_query_utilities.NIL;
            elt = cdolist_list_var.first();
            while (sksi_query_utilities.NIL != cdolist_list_var) {
                paths = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(elt, (SubLObject)sksi_query_utilities.NIL), paths);
                cdolist_list_var = cdolist_list_var.rest();
                elt = cdolist_list_var.first();
            }
        }
        else {
            final SubLObject sub_paths = generate_paths(lists.rest(), (SubLObject)sksi_query_utilities.UNPROVIDED);
            SubLObject cdolist_list_var2 = lists.first();
            SubLObject elt2 = (SubLObject)sksi_query_utilities.NIL;
            elt2 = cdolist_list_var2.first();
            while (sksi_query_utilities.NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$28 = sub_paths;
                SubLObject sub_path = (SubLObject)sksi_query_utilities.NIL;
                sub_path = cdolist_list_var_$28.first();
                while (sksi_query_utilities.NIL != cdolist_list_var_$28) {
                    paths = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(elt2, sub_path), paths);
                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                    sub_path = cdolist_list_var_$28.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                elt2 = cdolist_list_var2.first();
            }
        }
        return paths;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-utilities.lisp", position = 60927L)
    public static SubLObject non_null_element_positions(final SubLObject list) {
        SubLObject positions = (SubLObject)sksi_query_utilities.NIL;
        SubLObject list_var = (SubLObject)sksi_query_utilities.NIL;
        SubLObject element = (SubLObject)sksi_query_utilities.NIL;
        SubLObject position = (SubLObject)sksi_query_utilities.NIL;
        list_var = list;
        element = list_var.first();
        for (position = (SubLObject)sksi_query_utilities.ZERO_INTEGER; sksi_query_utilities.NIL != list_var; list_var = list_var.rest(), element = list_var.first(), position = Numbers.add((SubLObject)sksi_query_utilities.ONE_INTEGER, position)) {
            if (sksi_query_utilities.NIL != element) {
                positions = (SubLObject)ConsesLow.cons(position, positions);
            }
        }
        return Sequences.nreverse(positions);
    }
    
    public static SubLObject declare_sksi_query_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "register_combined_sksi_removal_modules_for_sks", "REGISTER-COMBINED-SKSI-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "deregister_combined_sksi_removal_modules_for_sks", "DEREGISTER-COMBINED-SKSI-REMOVAL-MODULES-FOR-SKS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "deregister_all_combined_sksi_removal_modules", "DEREGISTER-ALL-COMBINED-SKSI-REMOVAL-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "combined_sksi_removal_modules_count", "COMBINED-SKSI-REMOVAL-MODULES-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "some_sksi_removal_module_registeredP", "SOME-SKSI-REMOVAL-MODULE-REGISTERED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "clear_sksi_query_costs", "CLEAR-SKSI-QUERY-COSTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "look_up_sksi_query_information", "LOOK-UP-SKSI-QUERY-INFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "look_up_sksi_query_cost", "LOOK-UP-SKSI-QUERY-COST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "look_up_sksi_query_cost_problem_query", "LOOK-UP-SKSI-QUERY-COST-PROBLEM-QUERY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "look_up_sksi_query_cost_contextualized_dnf", "LOOK-UP-SKSI-QUERY-COST-CONTEXTUALIZED-DNF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "look_up_sksi_query_cost_asent_sense", "LOOK-UP-SKSI-QUERY-COST-ASENT-SENSE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "update_sksi_query_cost", "UPDATE-SKSI-QUERY-COST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "update_sksi_query_cost_problem_query", "UPDATE-SKSI-QUERY-COST-PROBLEM-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "update_sksi_query_cost_contextualized_dnf", "UPDATE-SKSI-QUERY-COST-CONTEXTUALIZED-DNF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "update_sksi_query_cost_asent_sense", "UPDATE-SKSI-QUERY-COST-ASENT-SENSE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_reformat_problem_query_internal", "SKSI-COST-REFORMAT-PROBLEM-QUERY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_reformat_problem_query", "SKSI-COST-REFORMAT-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_reformat_contextualized_dnf", "SKSI-COST-REFORMAT-CONTEXTUALIZED-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_reformat_asent_sense", "SKSI-COST-REFORMAT-ASENT-SENSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "neutralize_query", "NEUTRALIZE-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "neutralize_query_clause", "NEUTRALIZE-QUERY-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "neutralize_literal", "NEUTRALIZE-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "guess_cost_from_lrs_cardinality_gafs", "GUESS-COST-FROM-LRS-CARDINALITY-GAFS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "guess_cost_from_rs_cardinality_gafs", "GUESS-COST-FROM-RS-CARDINALITY-GAFS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "cache_cost_from_lrs_cardinality_wrt_value_gafs", "CACHE-COST-FROM-LRS-CARDINALITY-WRT-VALUE-GAFS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_recording_suspended_for_current_iteratorP", "SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_recording_suspended_for_current_iterator_initial_state", "SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR-INITIAL-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_suspend_cost_recording_for_current_iterator", "SKSI-SUSPEND-COST-RECORDING-FOR-CURRENT-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "generate_sksi_conjunctive_cost_recording_iterator", "GENERATE-SKSI-CONJUNCTIVE-COST-RECORDING-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "generate_sksi_single_literal_cost_recording_iterator", "GENERATE-SKSI-SINGLE-LITERAL-COST-RECORDING-ITERATOR", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_recording_iterator_p", "SKSI-COST-RECORDING-ITERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "new_sksi_cost_recording_iterator", "NEW-SKSI-COST-RECORDING-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_recording_iterator_done", "SKSI-COST-RECORDING-ITERATOR-DONE", 1, 0, false);
        new $sksi_cost_recording_iterator_done$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_recording_iterator_next", "SKSI-COST-RECORDING-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_recording_iterator_finalize", "SKSI-COST-RECORDING-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "update_sksi_query_cost_store_for_current_tactic", "UPDATE-SKSI-QUERY-COST-STORE-FOR-CURRENT-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_cost_recording_iterator_size", "SKSI-COST-RECORDING-ITERATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_reformulation_check", "SKSI-REFORMULATION-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_unreformulatable_p", "SKSI-UNREFORMULATABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_not_containing_nil_p", "SKSI-NOT-CONTAINING-NIL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_sksi_removal_module_cost", "GET-SKSI-REMOVAL-MODULE-COST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_sentence_cost", "SKSI-SENTENCE-COST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_pos_sentence_cost_internal", "SKSI-POS-SENTENCE-COST-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_pos_sentence_cost", "SKSI-POS-SENTENCE-COST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "comparison_literal_p", "COMPARISON-LITERAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_comparison_literal_supported_predicate_p_internal", "SKSI-COMPARISON-LITERAL-SUPPORTED-PREDICATE-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_comparison_literal_supported_predicate_p", "SKSI-COMPARISON-LITERAL-SUPPORTED-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "contextualized_comparison_literal_p", "CONTEXTUALIZED-COMPARISON-LITERAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "comparison_sentence_p", "COMPARISON-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "comparison_operator_forbidden_for_physical_field_indexicalP", "COMPARISON-OPERATOR-FORBIDDEN-FOR-PHYSICAL-FIELD-INDEXICAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "comparison_operator_forbidden_for_some_physical_field_indexicalP", "COMPARISON-OPERATOR-FORBIDDEN-FOR-SOME-PHYSICAL-FIELD-INDEXICAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_unknown_sentence_literal_p_internal", "SKSI-UNKNOWN-SENTENCE-LITERAL-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sksi_unknown_sentence_literal_p", "SKSI-UNKNOWN-SENTENCE-LITERAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "physical_field_indexical_field_table_tuples", "PHYSICAL-FIELD-INDEXICAL-FIELD-TABLE-TUPLES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sk_sources_for_physical_schema_internal", "SK-SOURCES-FOR-PHYSICAL-SCHEMA-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "sk_sources_for_physical_schema", "SK-SOURCES-FOR-PHYSICAL-SCHEMA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_from_expression_from_antecedent_meaning_sentence", "GET-FROM-EXPRESSION-FROM-ANTECEDENT-MEANING-SENTENCE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_from_expression_from_antecedent_meaning_sentence_int", "GET-FROM-EXPRESSION-FROM-ANTECEDENT-MEANING-SENTENCE-INT", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_antecedent_meaning_sentence", "GET-WHERE-EXPRESSION-FROM-ANTECEDENT-MEANING-SENTENCE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_antecedent_meaning_sentence_int", "GET-WHERE-EXPRESSION-FROM-ANTECEDENT-MEANING-SENTENCE-INT", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "possibly_reorder_conjunctive_antecedent_sentence_conjunts", "POSSIBLY-REORDER-CONJUNCTIVE-ANTECEDENT-SENTENCE-CONJUNTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_sentence_recursive", "GET-WHERE-EXPRESSION-FROM-SENTENCE-RECURSIVE", 10, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "evaluate_literal_p", "EVALUATE-LITERAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_literal", "GET-WHERE-EXPRESSION-FROM-LITERAL", 10, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_comparison_literal", "GET-WHERE-EXPRESSION-FROM-COMPARISON-LITERAL", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_comparison_literal_single_lfi", "GET-WHERE-EXPRESSION-FROM-COMPARISON-LITERAL-SINGLE-LFI", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_comparison_literal_double_lfis", "GET-WHERE-EXPRESSION-FROM-COMPARISON-LITERAL-DOUBLE-LFIS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_evaluate_literal", "GET-WHERE-EXPRESSION-FROM-EVALUATE-LITERAL", 9, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_evaluate_literal_int", "GET-WHERE-EXPRESSION-FROM-EVALUATE-LITERAL-INT", 9, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_csql_expression_for_evaluatable_expression", "GET-CSQL-EXPRESSION-FOR-EVALUATABLE-EXPRESSION", 6, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_csql_expression_for_evaluatable_expression_var", "GET-CSQL-EXPRESSION-FOR-EVALUATABLE-EXPRESSION-VAR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "make_csql_field_expression_for_pfi", "MAKE-CSQL-FIELD-EXPRESSION-FOR-PFI", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_other_literal", "GET-WHERE-EXPRESSION-FROM-OTHER-LITERAL", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_where_expression_from_meaning_sentence", "GET-WHERE-EXPRESSION-FROM-MEANING-SENTENCE", 8, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "get_pair_expression", "GET-PAIR-EXPRESSION", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "binary_predicate_memoized_internal", "BINARY-PREDICATE-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "binary_predicate_memoized", "BINARY-PREDICATE-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "apply_csql_operator_to_pfi_list_pair", "APPLY-CSQL-OPERATOR-TO-PFI-LIST-PAIR", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "apply_csql_operator_to_pfi_list_value_pair", "APPLY-CSQL-OPERATOR-TO-PFI-LIST-VALUE-PAIR", 5, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "physical_field_indexicals_data_types", "PHYSICAL-FIELD-INDEXICALS-DATA-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "physical_field_indexical_data_type", "PHYSICAL-FIELD-INDEXICAL-DATA-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "expression_contains_logical_field_indexicalP", "EXPRESSION-CONTAINS-LOGICAL-FIELD-INDEXICAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "iterate_over_list_of_lists", "ITERATE-OVER-LIST-OF-LISTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "iterate_over_list_of_lists_side_effect", "ITERATE-OVER-LIST-OF-LISTS-SIDE-EFFECT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "iterate_over_list_of_lists_return_value", "ITERATE-OVER-LIST-OF-LISTS-RETURN-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "generate_paths", "GENERATE-PATHS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "generate_paths_int", "GENERATE-PATHS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities", "non_null_element_positions", "NON-NULL-ELEMENT-POSITIONS", 1, 0, false);
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    public static SubLObject init_sksi_query_utilities_file() {
        sksi_query_utilities.$sksi_query_history_limit$ = SubLFiles.deflexical("*SKSI-QUERY-HISTORY-LIMIT*", (SubLObject)sksi_query_utilities.TEN_INTEGER);
        sksi_query_utilities.$sksi_query_costs$ = SubLFiles.deflexical("*SKSI-QUERY-COSTS*", maybeDefault((SubLObject)sksi_query_utilities.$sym0$_SKSI_QUERY_COSTS_, sksi_query_utilities.$sksi_query_costs$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_query_utilities.EQUAL), (SubLObject)sksi_query_utilities.UNPROVIDED))));
        sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$ = SubLFiles.defparameter("*SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR?*", (SubLObject)sksi_query_utilities.NIL);
        sksi_query_utilities.$sksi_default_query_cost$ = SubLFiles.deflexical("*SKSI-DEFAULT-QUERY-COST*", (SubLObject)sksi_query_utilities.SEVENTEEN_INTEGER);
        return (SubLObject)sksi_query_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_query_utilities_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_query_utilities.$sym0$_SKSI_QUERY_COSTS_);
        memoization_state.note_memoized_function((SubLObject)sksi_query_utilities.$sym1$SKSI_COST_REFORMAT_PROBLEM_QUERY);
        memoization_state.note_memoized_function((SubLObject)sksi_query_utilities.$sym25$SKSI_POS_SENTENCE_COST);
        memoization_state.note_memoized_function((SubLObject)sksi_query_utilities.$sym32$SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P);
        memoization_state.note_memoized_function((SubLObject)sksi_query_utilities.$sym34$SKSI_UNKNOWN_SENTENCE_LITERAL_P);
        memoization_state.note_memoized_function((SubLObject)sksi_query_utilities.$sym38$SK_SOURCES_FOR_PHYSICAL_SCHEMA);
        memoization_state.note_memoized_function((SubLObject)sksi_query_utilities.$sym74$BINARY_PREDICATE_MEMOIZED);
        sunit_external.define_test_category((SubLObject)sksi_query_utilities.$str78$SKSI_Query_Utilities_Category, (SubLObject)ConsesLow.list((SubLObject)sksi_query_utilities.$str79$SKSI_Category));
        return (SubLObject)sksi_query_utilities.NIL;
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
        me = (SubLFile)new sksi_query_utilities();
        sksi_query_utilities.$sksi_query_history_limit$ = null;
        sksi_query_utilities.$sksi_query_costs$ = null;
        sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$ = null;
        sksi_query_utilities.$sksi_default_query_cost$ = null;
        $sym0$_SKSI_QUERY_COSTS_ = SubLObjectFactory.makeSymbol("*SKSI-QUERY-COSTS*");
        $sym1$SKSI_COST_REFORMAT_PROBLEM_QUERY = SubLObjectFactory.makeSymbol("SKSI-COST-REFORMAT-PROBLEM-QUERY");
        $sym2$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $int3$1000 = SubLObjectFactory.makeInteger(1000);
        $const4$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym5$NEUTRALIZE_QUERY_CLAUSE = SubLObjectFactory.makeSymbol("NEUTRALIZE-QUERY-CLAUSE");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $sym7$NEUTRALIZE_LITERAL = SubLObjectFactory.makeSymbol("NEUTRALIZE-LITERAL");
        $kw8$FULLY_BOUND = SubLObjectFactory.makeKeyword("FULLY-BOUND");
        $sym9$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym10$SETS_EQUAL_ = SubLObjectFactory.makeSymbol("SETS-EQUAL?");
        $str11$__logicalResultSetCardinalityWRTV = SubLObjectFactory.makeString("#$logicalResultSetCardinalityWRTValue does not yet support multiple bound fields: ~A");
        $kw12$POS = SubLObjectFactory.makeKeyword("POS");
        $kw13$SUSPENDED = SubLObjectFactory.makeKeyword("SUSPENDED");
        $kw14$IN_PROGRESS = SubLObjectFactory.makeKeyword("IN-PROGRESS");
        $str15$Attempted_to_suspend_SKSI_cost_re = SubLObjectFactory.makeString("Attempted to suspend SKSI cost recording when not in a known SKSI cost recording context (single or multiple literal removal.)");
        $kw16$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
        $sym17$SKSI_COST_RECORDING_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SKSI-COST-RECORDING-ITERATOR-NEXT");
        $sym18$SKSI_COST_RECORDING_ITERATOR_DONE = SubLObjectFactory.makeSymbol("SKSI-COST-RECORDING-ITERATOR-DONE");
        $sym19$SKSI_COST_RECORDING_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("SKSI-COST-RECORDING-ITERATOR-FINALIZE");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SKS"));
        $sym21$SKSI_COST_RECORDING_ITERATOR_P = SubLObjectFactory.makeSymbol("SKSI-COST-RECORDING-ITERATOR-P");
        $sym22$SKSI_UNREFORMULATABLE_P = SubLObjectFactory.makeSymbol("SKSI-UNREFORMULATABLE-P");
        $kw23$UNREFORMULATABLE = SubLObjectFactory.makeKeyword("UNREFORMULATABLE");
        $kw24$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym25$SKSI_POS_SENTENCE_COST = SubLObjectFactory.makeSymbol("SKSI-POS-SENTENCE-COST");
        $sym26$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const27$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym28$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const29$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym30$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym31$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym32$SKSI_COMPARISON_LITERAL_SUPPORTED_PREDICATE_P = SubLObjectFactory.makeSymbol("SKSI-COMPARISON-LITERAL-SUPPORTED-PREDICATE-P");
        $sym33$COMPARISON_LITERAL_P = SubLObjectFactory.makeSymbol("COMPARISON-LITERAL-P");
        $sym34$SKSI_UNKNOWN_SENTENCE_LITERAL_P = SubLObjectFactory.makeSymbol("SKSI-UNKNOWN-SENTENCE-LITERAL-P");
        $const35$sksiUnknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiUnknownSentence"));
        $int36$2048 = SubLObjectFactory.makeInteger(2048);
        $kw37$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL = SubLObjectFactory.makeKeyword("SKSI-MISSING-PHYSICAL-FIELD-FOR-INDEXICAL");
        $sym38$SK_SOURCES_FOR_PHYSICAL_SCHEMA = SubLObjectFactory.makeSymbol("SK-SOURCES-FOR-PHYSICAL-SCHEMA");
        $sym39$LFI_ALIAS_FN_NAUT_P = SubLObjectFactory.makeSymbol("LFI-ALIAS-FN-NAUT-P");
        $kw40$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const41$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const42$CSQLAnd = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLAnd"));
        $const43$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const44$CSQLOr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLOr"));
        $const45$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $const46$CSQLNot = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLNot"));
        $const47$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const48$equiv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equiv"));
        $const49$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $kw50$SKSI_MISSING_ENCODINGS = SubLObjectFactory.makeKeyword("SKSI-MISSING-ENCODINGS");
        $kw51$SKSI_UNREFORMULATABLE = SubLObjectFactory.makeKeyword("SKSI-UNREFORMULATABLE");
        $kw52$FIELD = SubLObjectFactory.makeKeyword("FIELD");
        $kw53$SKSI_MISSING_DECODINGS = SubLObjectFactory.makeKeyword("SKSI-MISSING-DECODINGS");
        $sym54$DECODING_PHYSICAL_FIELD_INDEXICALS_ORDERED = SubLObjectFactory.makeSymbol("DECODING-PHYSICAL-FIELD-INDEXICALS-ORDERED");
        $kw55$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $sym56$LFI_FORT_FOR_LFI = SubLObjectFactory.makeSymbol("LFI-FORT-FOR-LFI");
        $const57$Time_Quantity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Time-Quantity"));
        $const58$CSQLSecondsDurationFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLSecondsDurationFn"));
        $const59$CSQLMonthsDurationFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLMonthsDurationFn"));
        $const60$CSQLYearsDurationFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLYearsDurationFn"));
        $str61$__SKSI__A_ = SubLObjectFactory.makeString("~&SKSI-~A ");
        $str62$SKSI_could_not_convert___Time_Qua = SubLObjectFactory.makeString("SKSI could not convert #$Time-Quantity ~S");
        $const63$QuantityConversionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantityConversionFn"));
        $const64$CSQLTimesFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLTimesFn"));
        $sym65$PHYSICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-P");
        $kw66$RAW = SubLObjectFactory.makeKeyword("RAW");
        $sym67$PFI_ALIAS_FN_NAUT_P = SubLObjectFactory.makeSymbol("PFI-ALIAS-FN-NAUT-P");
        $sym68$CONTEXTUALIZED_ASENT_ASENT = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-ASENT-ASENT");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIELD-ENCODING"), (SubLObject)SubLObjectFactory.makeSymbol("PF-INDEXICAL"));
        $kw70$NOT_NULL = SubLObjectFactory.makeKeyword("NOT-NULL");
        $sym71$CADADR = SubLObjectFactory.makeSymbol("CADADR");
        $kw72$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEFT-PFI-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("RIGHT-PFI-LIST"));
        $sym74$BINARY_PREDICATE_MEMOIZED = SubLObjectFactory.makeSymbol("BINARY-PREDICATE-MEMOIZED");
        $kw75$SKSI_LIST_LENGTH_MISMATCH = SubLObjectFactory.makeKeyword("SKSI-LIST-LENGTH-MISMATCH");
        $sym76$CSQL_DISJOIN_EXPRESSIONS = SubLObjectFactory.makeSymbol("CSQL-DISJOIN-EXPRESSIONS");
        $sym77$CSQL_CONJOIN_EXPRESSIONS = SubLObjectFactory.makeSymbol("CSQL-CONJOIN-EXPRESSIONS");
        $str78$SKSI_Query_Utilities_Category = SubLObjectFactory.makeString("SKSI Query Utilities Category");
        $str79$SKSI_Category = SubLObjectFactory.makeString("SKSI Category");
    }
    
    public static final class $sksi_cost_recording_iterator_done$UnaryFunction extends UnaryFunction
    {
        public $sksi_cost_recording_iterator_done$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKSI-COST-RECORDING-ITERATOR-DONE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_query_utilities.sksi_cost_recording_iterator_done(arg1);
        }
    }
}

/*

	Total time: 771 ms
	
*/