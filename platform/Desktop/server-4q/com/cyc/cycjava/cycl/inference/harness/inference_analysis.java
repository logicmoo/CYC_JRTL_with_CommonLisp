package com.cyc.cycjava.cycl.inference.harness;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.cfasl_kb_methods;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.operation_queues;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transcript_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_analysis extends SubLTranslatedFile
{

    public static final SubLFile me = new inference_analysis();
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_analysis";
    public static final String myFingerPrint = "3b592e637e10cdbaeb6a299b678f76fbde7a016b057b961f308a04c3bedced1b";
    private static SubLSymbol $transformation_rule_statistics_table$ = null;
    private static SubLSymbol $transformation_rule_statistics_lock$ = null;
    private static SubLSymbol $transformation_rule_statistics_filename_load_history$ = null;
    private static SubLSymbol $transformation_rule_statistics_received_filename_load_history$ = null;
    public static SubLSymbol $transformation_rule_statistics_update_enabledP$ = null;
    public static SubLSymbol $transformation_rule_historical_success_pruning_threshold$ = null;
    private static SubLSymbol $save_recent_experience_lock$ = null;
    private static SubLSymbol $average_rule_historical_success_probability$ = null;
    private static SubLSymbol $rule_historical_success_happiness_scaling_factor$ = null;
    private static SubLSymbol $transformation_rule_historical_connectivity_graph$ = null;
    private static SubLSymbol $transformation_rule_historical_connectivity_graph_lock$ = null;
    private static SubLSymbol $hl_module_expand_counts_enabledP$ = null;
    public static SubLSymbol $hl_module_expand_counts$ = null;
    private static SubLSymbol $asked_queries_queue$ = null;
    private static SubLSymbol $save_recent_asked_queries_lock$ = null;
    private static SubLSymbol $asked_queries_queue_limit$ = null;
    private static SubLSymbol $asked_query_common_symbols$ = null;
    private static SubLSymbol $asked_query_common_symbols_simple$ = null;
    private static final SubLSymbol $sym0$_TRANSFORMATION_RULE_STATISTICS_TABLE_ = SubLObjectFactory.makeSymbol("*TRANSFORMATION-RULE-STATISTICS-TABLE*");
    private static final SubLInteger $int1$64 = SubLObjectFactory.makeInteger(64);
    private static final SubLSymbol $sym2$_TRANSFORMATION_RULE_STATISTICS_LOCK_ = SubLObjectFactory.makeSymbol("*TRANSFORMATION-RULE-STATISTICS-LOCK*");
    private static final SubLString $str3$Transformation_Rule_Statistics_Lo = SubLObjectFactory.makeString("Transformation Rule Statistics Lock");
    private static final SubLSymbol $sym4$_TRANSFORMATION_RULE_STATISTICS_FILENAME_LOAD_HISTORY_ = SubLObjectFactory.makeSymbol("*TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY*");
    private static final SubLSymbol $sym5$_TRANSFORMATION_RULE_STATISTICS_RECEIVED_FILENAME_LOAD_HISTORY_ = SubLObjectFactory.makeSymbol("*TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY*");
    private static final SubLList $list6 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RULE-VAR"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("RECENT?"), SubLObjectFactory.makeSymbol("RECEIVED?"), SubLObjectFactory.makeSymbol("COPY?"), SubLObjectFactory.makeSymbol("DONE")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLList $list7 = ConsesLow.list(SubLObjectFactory.makeKeyword("RECENT?"), SubLObjectFactory.makeKeyword("RECEIVED?"), SubLObjectFactory.makeKeyword("COPY?"), SubLObjectFactory.makeKeyword("DONE"));
    private static final SubLSymbol $kw8$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
    private static final SubLSymbol $kw9$RECENT_ = SubLObjectFactory.makeKeyword("RECENT?");
    private static final SubLSymbol $kw10$RECEIVED_ = SubLObjectFactory.makeKeyword("RECEIVED?");
    private static final SubLSymbol $kw11$COPY_ = SubLObjectFactory.makeKeyword("COPY?");
    private static final SubLSymbol $kw12$DONE = SubLObjectFactory.makeKeyword("DONE");
    private static final SubLSymbol $sym13$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
    private static final SubLList $list14 = ConsesLow.list(SubLObjectFactory.makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-HELPER"));
    private static final SubLSymbol $sym15$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
    private static final SubLSymbol $sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_ = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-CONDITION-PASSES?");
    private static final SubLSymbol $sym17$STATISTICS_VAR = SubLObjectFactory.makeUninternedSymbol("STATISTICS-VAR");
    private static final SubLSymbol $sym18$DO_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
    private static final SubLList $list19 = ConsesLow.list(SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-STATISTICS-TABLE"));
    private static final SubLSymbol $sym20$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
    private static final SubLSymbol $sym21$TRANSFORMATION_RULE_STATISTICS_TABLE = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-STATISTICS-TABLE");
    private static final SubLSymbol $sym22$DO_TRANSFORMATION_RULES_WITH_STATISTICS = SubLObjectFactory.makeSymbol("DO-TRANSFORMATION-RULES-WITH-STATISTICS");
    private static final SubLSymbol $sym23$TRANSFORMATION_RULES_WITH_STATISTICS_HELPER = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-HELPER");
    private static final SubLSymbol $kw24$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
    private static final SubLSymbol $kw25$NONE = SubLObjectFactory.makeKeyword("NONE");
    private static final SubLSymbol $kw26$CONSIDERED = SubLObjectFactory.makeKeyword("CONSIDERED");
    private static final SubLSymbol $sym27$_ = SubLObjectFactory.makeSymbol(">");
    private static final SubLSymbol $sym28$TRANSFORMATION_RULE_SUCCESS_COUNT = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT");
    private static final SubLSymbol $sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-CONSIDERED-COUNT");
    private static final SubLSymbol $kw30$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
    private static final SubLSymbol $sym31$_ = SubLObjectFactory.makeSymbol("<");
    private static final SubLSymbol $kw32$SUCCESS_PROBABILITY = SubLObjectFactory.makeKeyword("SUCCESS-PROBABILITY");
    private static final SubLSymbol $sym33$TRANSFORMATION_RULE_SUCCESS_PROBABILITY = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-SUCCESS-PROBABILITY");
    private static final SubLSymbol $kw34$HISTORICAL_UTILITY = SubLObjectFactory.makeKeyword("HISTORICAL-UTILITY");
    private static final SubLSymbol $sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-HISTORICAL-UTILITY");
    private static final SubLSymbol $sym36$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
    private static final SubLSymbol $sym37$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
    private static final SubLString $str38$Incrementing_transformation_rule_ = SubLObjectFactory.makeString("Incrementing transformation rule considered count by zero; this is is vacuous and suspicious");
    private static final SubLInteger $int39$_100 = SubLObjectFactory.makeInteger(-100);
    private static final SubLInteger $int40$100 = SubLObjectFactory.makeInteger(100);
    private static final SubLSymbol $sym41$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
    private static final SubLSymbol $sym42$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
    private static final SubLSymbol $kw43$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
    private static final SubLString $str44$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
    private static final SubLSymbol $kw45$INPUT = SubLObjectFactory.makeKeyword("INPUT");
    private static final SubLString $str46$Transformation_rule_statistics_up = SubLObjectFactory.makeString("Transformation rule statistics updating is not enabled.");
    private static final SubLString $str47$_________________________________ = SubLObjectFactory.makeString("~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
    private static final SubLString $str48$______S_rules__sorted_by__A = SubLObjectFactory.makeString("~%;; ~S rules, sorted by ~A");
    private static final SubLString $str49$________S__S___S_____utility____S = SubLObjectFactory.makeString("~%~%;; ~S/~S (~S %)  utility : ~S~%~S");
    private static final SubLString $str50$Save_recent_experience_lock = SubLObjectFactory.makeString("Save recent experience lock");
    private static final SubLString $str51$experience = SubLObjectFactory.makeString("experience");
    private static final SubLString $str52$_TS = SubLObjectFactory.makeString(".TS");
    private static final SubLString $str53$_CFASL = SubLObjectFactory.makeString(".CFASL");
    private static final SubLString $str54$_ts = SubLObjectFactory.makeString(".ts");
    private static final SubLString $str55$_cfasl = SubLObjectFactory.makeString(".cfasl");
    private static final SubLSymbol $sym56$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
    private static final SubLSymbol $sym57$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
    private static final SubLString $str58$Loading_transformation_rule_stati = SubLObjectFactory.makeString("Loading transformation rule statistics");
    private static final SubLString $str59$cdolist = SubLObjectFactory.makeString("cdolist");
    private static final SubLString $str60$_experience_cfasl = SubLObjectFactory.makeString("-experience.cfasl");
    private static final SubLSymbol $sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
    private static final SubLString $str64$_A = SubLObjectFactory.makeString("~A");
    private static final SubLFloat $float65$0_02939361143247565 = SubLObjectFactory.makeDouble(0.029393611432475649D);
    private static final SubLString $str66$Repairing_transformation_rule_sta = SubLObjectFactory.makeString("Repairing transformation rule statistics");
    private static final SubLString $str67$Repairing__a_spurious_zeroes_in__ = SubLObjectFactory.makeString("Repairing ~a spurious zeroes in ~a~%");
    private static final SubLString $str68$_bloated_cfasl = SubLObjectFactory.makeString("-bloated.cfasl");
    private static final SubLString $str69$Could_not_load__a = SubLObjectFactory.makeString("Could not load ~a");
    private static final SubLSymbol $kw70$EOF = SubLObjectFactory.makeKeyword("EOF");
    private static final SubLList $list71 = ConsesLow.cons(SubLObjectFactory.makeSymbol("RULE"), SubLObjectFactory.makeSymbol("VECTOR"));
    private static final SubLSymbol $sym72$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_ = SubLObjectFactory.makeSymbol("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH*");
    private static final SubLInteger $int73$256 = SubLObjectFactory.makeInteger(256);
    private static final SubLSymbol $sym74$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_ = SubLObjectFactory.makeSymbol("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH-LOCK*");
    private static final SubLString $str75$Rule_Historical_Connectivity_Grap = SubLObjectFactory.makeString("Rule Historical Connectivity Graph Lock");
    private static final SubLSymbol $sym76$SET_CONTENTS_P = SubLObjectFactory.makeSymbol("SET-CONTENTS-P");
    private static final SubLString $str77$Got_a_directed_instead_of_undirec = SubLObjectFactory.makeString("Got a directed instead of undirected link in the rule historical connectedness graph while trying to compute the ratio for ~s");
    private static final SubLString $str78$____Rule_____S__Connected_Rules__ = SubLObjectFactory.makeString("~%~%Rule :~%~S~%Connected Rules :");
    private static final SubLString $str79$___S = SubLObjectFactory.makeString("~%~S");
    private static final SubLString $str80$Rule__ = SubLObjectFactory.makeString("Rule :");
    private static final SubLString $str81$Connected_Rules__ = SubLObjectFactory.makeString("Connected Rules :");
    private static final SubLSymbol $sym82$CLET = SubLObjectFactory.makeSymbol("CLET");
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$CDR = SubLObjectFactory.makeSymbol("CDR");
    private static final SubLList $list85 = ConsesLow.cons(SubLObjectFactory.makeSymbol("HL-MODULE"), SubLObjectFactory.makeSymbol("COUNT"));
    private static final SubLString $str86$___4_D__S__ = SubLObjectFactory.makeString("~&~4,D ~S~%");
    private static final SubLSymbol $sym87$_ASKED_QUERIES_QUEUE_ = SubLObjectFactory.makeSymbol("*ASKED-QUERIES-QUEUE*");
    private static final SubLString $str88$Query_logging_lock = SubLObjectFactory.makeString("Query logging lock");
    private static final SubLInteger $int89$300 = SubLObjectFactory.makeInteger(300);
    private static final SubLList $list90 = ConsesLow.list(SubLObjectFactory.makeKeyword("PROBLEM-STORE"));
    private static final SubLString $str91$Read_invalid_query_info__s = SubLObjectFactory.makeString("Read invalid query info ~s");
    private static final SubLList $list92 = ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("QUERY-PROPERTIES"));
    private static final SubLString $str93$asked_queries = SubLObjectFactory.makeString("asked-queries");
    private static final SubLSymbol $kw94$APPEND = SubLObjectFactory.makeKeyword("APPEND");
    private static final SubLSymbol $sym95$QUERY_INFO_P = SubLObjectFactory.makeSymbol("QUERY-INFO-P");
    private static final SubLSymbol $sym96$ASKED_QUERIES_FILENAME_ = SubLObjectFactory.makeSymbol("ASKED-QUERIES-FILENAME?");
    private static final SubLSymbol $sym97$DO_ASKED_QUERIES_IN_DIRECTORY = SubLObjectFactory.makeSymbol("DO-ASKED-QUERIES-IN-DIRECTORY");
    private static final SubLString $str98$local_asked_queries_cfasl = SubLObjectFactory.makeString("local-asked-queries.cfasl");
    private static final SubLSymbol $sym99$_ASKED_QUERY_COMMON_SYMBOLS_ = SubLObjectFactory.makeSymbol("*ASKED-QUERY-COMMON-SYMBOLS*");
    private static final SubLSymbol $sym100$_ASKED_QUERY_COMMON_SYMBOLS_SIMPLE_ = SubLObjectFactory.makeSymbol("*ASKED-QUERY-COMMON-SYMBOLS-SIMPLE*");
    private static final SubLSymbol $sym101$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
    private static final SubLString $str102$Entering__s__ = SubLObjectFactory.makeString("Entering ~s~%");
    private static final SubLInteger $int103$1000 = SubLObjectFactory.makeInteger(1000);
    private static final SubLString $str104$_ = SubLObjectFactory.makeString(".");
    private static final SubLString $str105$__Number_of_saved_queries_per_dir = SubLObjectFactory.makeString("~%Number of saved queries per directory:~%");
    private static final SubLString $str106$__Histogram_of_saved_queries_per_ = SubLObjectFactory.makeString("~%Histogram of saved queries per file:~%");
    private static final SubLString $str107$__Total_number_of_saved_queries__ = SubLObjectFactory.makeString("~%Total number of saved queries: ~s~%");
    private static final SubLString $str108$__Total_number_of_unique_saved_qu = SubLObjectFactory.makeString("~%Total number of unique saved queries: ~s~%~%");
    private static final SubLSymbol $sym109$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
    private static final SubLSymbol $sym110$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
    private static final SubLObject $const111$InferencePSC = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InferencePSC"));
    private static final SubLSymbol $kw112$SKIP = SubLObjectFactory.makeKeyword("SKIP");
    private static final SubLSymbol $sym113$SINGLETON_ = SubLObjectFactory.makeSymbol("SINGLETON?");
    private static final SubLSymbol $sym114$FIRST = SubLObjectFactory.makeSymbol("FIRST");
    private static final SubLString $str115$non_singleton_max_floor_mts_of_si = SubLObjectFactory.makeString("non-singleton max-floor-mts-of-singletons: ~s ~s");
    private static final SubLString $str116$multiple_justifications___s__S = SubLObjectFactory.makeString("multiple justifications: ~s ~S");
    private static final SubLSymbol $sym117$APPEND = SubLObjectFactory.makeSymbol("APPEND");
    private static final SubLObject $const118$EverythingPSC = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EverythingPSC"));
    private static final SubLList $list119 = ConsesLow.list(SubLObjectFactory.makeSymbol("CONCLUDED-MTS"), SubLObjectFactory.makeSymbol("SUPPORT-COMBINATION"));
    private static final SubLSymbol $sym120$HLMT_EQUAL_ = SubLObjectFactory.makeSymbol("HLMT-EQUAL?");
    

    static 
    {
        $list62 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);
        $list83 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("*HL-MODULE-EXPAND-COUNTS-ENABLED?*"), T), ConsesLow.list(SubLObjectFactory.makeSymbol("*HL-MODULE-EXPAND-COUNTS*"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-DICTIONARY"))));
    }
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 846L)
    public static SubLObject problem_store_estimated_problem_reuses_count(final SubLObject store) {
        return Numbers.subtract(inference_datastructures_problem_store.problem_store_dependent_link_count(store), inference_datastructures_problem_store.problem_store_problem_count(store));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 1223L)
    public static SubLObject problem_store_estimated_reuse_ratio(final SubLObject store) {
        final SubLObject problem_count = inference_datastructures_problem_store.problem_store_problem_count(store);
        return (SubLObject)(problem_count.isZero() ? inference_analysis.ZERO_INTEGER : Numbers.divide(problem_store_estimated_problem_reuses_count(store), problem_count));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 2374L)
    public static SubLObject clear_transformation_rule_statistics_filename_load_history() {
        inference_analysis.$transformation_rule_statistics_filename_load_history$.setGlobalValue((SubLObject)inference_analysis.NIL);
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 2535L)
    public static SubLObject clear_transformation_rule_statistics_received_filename_load_history() {
        inference_analysis.$transformation_rule_statistics_received_filename_load_history$.setGlobalValue((SubLObject)inference_analysis.NIL);
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 2714L)
    public static SubLObject add_to_transformation_rule_statistics_filename_load_history(final SubLObject filename, final SubLObject receivedP) {
        if (inference_analysis.NIL != receivedP) {
            final SubLObject new_cons = (SubLObject)ConsesLow.cons(filename, (SubLObject)inference_analysis.NIL);
            final SubLObject list = inference_analysis.$transformation_rule_statistics_received_filename_load_history$.getGlobalValue();
            if (inference_analysis.NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            }
            else {
                inference_analysis.$transformation_rule_statistics_received_filename_load_history$.setGlobalValue(new_cons);
            }
        }
        else {
            final SubLObject new_cons = (SubLObject)ConsesLow.cons(filename, (SubLObject)inference_analysis.NIL);
            final SubLObject list = inference_analysis.$transformation_rule_statistics_filename_load_history$.getGlobalValue();
            if (inference_analysis.NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            }
            else {
                inference_analysis.$transformation_rule_statistics_filename_load_history$.setGlobalValue(new_cons);
            }
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3023L)
    public static SubLObject transformation_rule_statistics_filename_load_history() {
        return inference_analysis.$transformation_rule_statistics_filename_load_history$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3189L)
    public static SubLObject transformation_rule_statistics_received_filename_load_history() {
        return inference_analysis.$transformation_rule_statistics_received_filename_load_history$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3555L)
    public static SubLObject transformation_rule_statistics_update_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_analysis.$transformation_rule_statistics_update_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3682L)
    public static SubLObject enable_transformation_rule_statistics_update() {
        inference_analysis.$transformation_rule_statistics_update_enabledP$.setDynamicValue((SubLObject)inference_analysis.T);
        return (SubLObject)inference_analysis.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3821L)
    public static SubLObject disable_transformation_rule_statistics_update() {
        inference_analysis.$transformation_rule_statistics_update_enabledP$.setDynamicValue((SubLObject)inference_analysis.NIL);
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 3965L)
    public static SubLObject do_transformation_rules_with_statistics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_analysis.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_var = (SubLObject)inference_analysis.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_analysis.$list6);
        rule_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_analysis.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_analysis.NIL;
        SubLObject current_$1 = (SubLObject)inference_analysis.NIL;
        while (inference_analysis.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_analysis.$list6);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_analysis.$list6);
            if (inference_analysis.NIL == conses_high.member(current_$1, (SubLObject)inference_analysis.$list7, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED)) {
                bad = (SubLObject)inference_analysis.T;
            }
            if (current_$1 == inference_analysis.$kw8$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_analysis.NIL != bad && inference_analysis.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_analysis.$list6);
        }
        final SubLObject recentP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_analysis.$kw9$RECENT_, current);
        final SubLObject recentP = (SubLObject)((inference_analysis.NIL != recentP_tail) ? conses_high.cadr(recentP_tail) : inference_analysis.NIL);
        final SubLObject receivedP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_analysis.$kw10$RECEIVED_, current);
        final SubLObject receivedP = (SubLObject)((inference_analysis.NIL != receivedP_tail) ? conses_high.cadr(receivedP_tail) : inference_analysis.NIL);
        final SubLObject copyP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_analysis.$kw11$COPY_, current);
        final SubLObject copyP = (SubLObject)((inference_analysis.NIL != copyP_tail) ? conses_high.cadr(copyP_tail) : inference_analysis.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_analysis.$kw12$DONE, current);
        final SubLObject done = (SubLObject)((inference_analysis.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_analysis.NIL);
        final SubLObject body;
        current = (body = temp);
        if (inference_analysis.NIL != copyP) {
            return (SubLObject)ConsesLow.list((SubLObject)inference_analysis.$sym13$DO_LIST, (SubLObject)ConsesLow.list(rule_var, (SubLObject)inference_analysis.$list14, (SubLObject)inference_analysis.$kw12$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_analysis.$sym15$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_analysis.$sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_, rule_var, recentP, receivedP), ConsesLow.append(body, (SubLObject)inference_analysis.NIL)));
        }
        final SubLObject statistics_var = (SubLObject)inference_analysis.$sym17$STATISTICS_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)inference_analysis.$sym18$DO_HASH_TABLE, (SubLObject)ConsesLow.list(rule_var, statistics_var, (SubLObject)inference_analysis.$list19, (SubLObject)inference_analysis.$kw12$DONE, done), (SubLObject)ConsesLow.list((SubLObject)inference_analysis.$sym20$IGNORE, statistics_var), (SubLObject)ConsesLow.listS((SubLObject)inference_analysis.$sym15$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_analysis.$sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_, rule_var, recentP, receivedP), ConsesLow.append(body, (SubLObject)inference_analysis.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 4876L)
    public static SubLObject transformation_rule_statistics_table() {
        return inference_analysis.$transformation_rule_statistics_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 5037L)
    public static SubLObject transformation_rules_with_statistics_helper() {
        SubLObject rules = (SubLObject)inference_analysis.NIL;
        SubLObject release = (SubLObject)inference_analysis.NIL;
        try {
            release = Locks.seize_lock(inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue());
            rules = hash_table_utilities.hash_table_keys(transformation_rule_statistics_table());
        }
        finally {
            if (inference_analysis.NIL != release) {
                Locks.release_lock(inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 5329L)
    public static SubLObject transformation_rules_with_statistics_condition_passesP(final SubLObject rule, final SubLObject recentP, final SubLObject receivedP) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_analysis.NIL != assertion_handles.valid_assertionP(rule, (SubLObject)inference_analysis.UNPROVIDED) && (inference_analysis.NIL == recentP || inference_analysis.NIL != transformation_rule_has_recent_statisticsP(rule)) && (inference_analysis.NIL == receivedP || inference_analysis.NIL != transformation_rule_has_received_statisticsP(rule)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 5676L)
    public static SubLObject new_transformation_rule_statistics() {
        return Vectors.make_vector((SubLObject)inference_analysis.SIX_INTEGER, (SubLObject)inference_analysis.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 6325L)
    public static SubLObject clear_all_transformation_rule_statistics() {
        SubLObject release = (SubLObject)inference_analysis.NIL;
        try {
            release = Locks.seize_lock(inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue());
            Hashtables.clrhash(inference_analysis.$transformation_rule_statistics_table$.getGlobalValue());
            clear_transformation_rule_statistics_filename_load_history();
        }
        finally {
            if (inference_analysis.NIL != release) {
                Locks.release_lock(inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return (SubLObject)inference_analysis.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 6588L)
    public static SubLObject clear_transformation_rule_statistics(final SubLObject rule) {
        SubLObject result = (SubLObject)inference_analysis.NIL;
        SubLObject release = (SubLObject)inference_analysis.NIL;
        try {
            release = Locks.seize_lock(inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue());
            result = Hashtables.remhash(rule, inference_analysis.$transformation_rule_statistics_table$.getGlobalValue());
        }
        finally {
            if (inference_analysis.NIL != release) {
                Locks.release_lock(inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 6823L)
    public static SubLObject transformation_rules_with_statistics_count() {
        return Hashtables.hash_table_count(inference_analysis.$transformation_rule_statistics_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 6965L)
    public static SubLObject get_transformation_rule_statistics(final SubLObject rule) {
        return Hashtables.gethash_without_values(rule, inference_analysis.$transformation_rule_statistics_table$.getGlobalValue(), (SubLObject)inference_analysis.$kw24$UNINITIALIZED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 7117L)
    public static SubLObject ensure_transformation_rule_statistics(final SubLObject rule) {
        SubLObject statistics = get_transformation_rule_statistics(rule);
        if (inference_analysis.$kw24$UNINITIALIZED == statistics) {
            statistics = new_transformation_rule_statistics();
            SubLObject release = (SubLObject)inference_analysis.NIL;
            try {
                release = Locks.seize_lock(inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue());
                Hashtables.sethash(rule, inference_analysis.$transformation_rule_statistics_table$.getGlobalValue(), statistics);
            }
            finally {
                if (inference_analysis.NIL != release) {
                    Locks.release_lock(inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue());
                }
            }
        }
        return statistics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 7528L)
    public static SubLObject transformation_rules_with_statistics(SubLObject order, SubLObject recentP, SubLObject receivedP) {
        if (order == inference_analysis.UNPROVIDED) {
            order = (SubLObject)inference_analysis.$kw25$NONE;
        }
        if (recentP == inference_analysis.UNPROVIDED) {
            recentP = (SubLObject)inference_analysis.NIL;
        }
        if (receivedP == inference_analysis.UNPROVIDED) {
            receivedP = (SubLObject)inference_analysis.NIL;
        }
        SubLObject rules = (SubLObject)inference_analysis.NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, recentP, receivedP)) {
                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject pcase_var = order;
        if (pcase_var.eql((SubLObject)inference_analysis.$kw26$CONSIDERED)) {
            rules = Sort.sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), (SubLObject)inference_analysis.$sym28$TRANSFORMATION_RULE_SUCCESS_COUNT);
            rules = Sort.stable_sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), (SubLObject)inference_analysis.$sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT);
        }
        else if (pcase_var.eql((SubLObject)inference_analysis.$kw30$SUCCESS)) {
            rules = Sort.sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym31$_), (SubLObject)inference_analysis.$sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT);
            rules = Sort.stable_sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), (SubLObject)inference_analysis.$sym28$TRANSFORMATION_RULE_SUCCESS_COUNT);
        }
        else if (pcase_var.eql((SubLObject)inference_analysis.$kw32$SUCCESS_PROBABILITY)) {
            rules = Sort.sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), (SubLObject)inference_analysis.$sym28$TRANSFORMATION_RULE_SUCCESS_COUNT);
            rules = Sort.stable_sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), (SubLObject)inference_analysis.$sym33$TRANSFORMATION_RULE_SUCCESS_PROBABILITY);
        }
        else if (pcase_var.eql((SubLObject)inference_analysis.$kw34$HISTORICAL_UTILITY)) {
            rules = Sort.sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym31$_), (SubLObject)inference_analysis.$sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT);
            rules = Sort.stable_sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), (SubLObject)inference_analysis.$sym28$TRANSFORMATION_RULE_SUCCESS_COUNT);
            rules = Sort.stable_sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), (SubLObject)inference_analysis.$sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY);
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 8656L)
    public static SubLObject transformation_rules_with_recent_statistics() {
        SubLObject rules = (SubLObject)inference_analysis.NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.T, (SubLObject)inference_analysis.NIL)) {
                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sequences.nreverse(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 8861L)
    public static SubLObject transformation_rules_with_received_statistics() {
        SubLObject rules = (SubLObject)inference_analysis.NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.T)) {
                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sequences.nreverse(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9070L)
    public static SubLObject transformation_rules_with_recent_statistics_count() {
        SubLObject count = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.T, (SubLObject)inference_analysis.NIL)) {
                    count = Numbers.add(count, (SubLObject)inference_analysis.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9263L)
    public static SubLObject transformation_rules_with_received_statistics_count() {
        SubLObject count = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.T)) {
                    count = Numbers.add(count, (SubLObject)inference_analysis.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9460L)
    public static SubLObject any_recent_experienceP() {
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.T, (SubLObject)inference_analysis.NIL)) {
                    return (SubLObject)inference_analysis.T;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9590L)
    public static SubLObject any_received_experienceP() {
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.T)) {
                    return (SubLObject)inference_analysis.T;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9724L)
    public static SubLObject total_transformation_rule_considered_count() {
        SubLObject total = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL)) {
                    total = Numbers.add(total, transformation_rule_considered_count(rule));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9943L)
    public static SubLObject total_transformation_rule_recent_considered_count() {
        SubLObject total = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.T, (SubLObject)inference_analysis.NIL)) {
                    total = Numbers.add(total, transformation_rule_considered_count(rule));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 10180L)
    public static SubLObject total_transformation_rule_received_considered_count() {
        SubLObject total = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.T)) {
                    total = Numbers.add(total, transformation_rule_considered_count(rule));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 10421L)
    public static SubLObject transformation_rule_considered_count(final SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return (SubLObject)((inference_analysis.$kw24$UNINITIALIZED == statistics) ? inference_analysis.ZERO_INTEGER : Numbers.add(Vectors.aref(statistics, (SubLObject)inference_analysis.ZERO_INTEGER), Vectors.aref(statistics, (SubLObject)inference_analysis.FOUR_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 10742L)
    public static SubLObject transformation_rule_recent_considered_count(final SubLObject rule) {
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return (SubLObject)((inference_analysis.$kw24$UNINITIALIZED == statistics) ? inference_analysis.ZERO_INTEGER : Vectors.aref(statistics, (SubLObject)inference_analysis.TWO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 10962L)
    public static SubLObject transformation_rule_received_considered_count(final SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return (SubLObject)((inference_analysis.$kw24$UNINITIALIZED == statistics) ? inference_analysis.ZERO_INTEGER : Vectors.aref(statistics, (SubLObject)inference_analysis.FOUR_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11268L)
    public static SubLObject transformation_rule_has_recent_statisticsP(final SubLObject rule) {
        return Numbers.plusp(transformation_rule_recent_considered_count(rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11405L)
    public static SubLObject transformation_rule_has_received_statisticsP(final SubLObject rule) {
        return Numbers.plusp(transformation_rule_received_considered_count(rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11546L)
    public static SubLObject total_transformation_rule_success_count() {
        SubLObject total = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL)) {
                    total = Numbers.add(total, transformation_rule_success_count(rule));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11759L)
    public static SubLObject total_transformation_rule_recent_success_count() {
        SubLObject total = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.T, (SubLObject)inference_analysis.NIL)) {
                    total = Numbers.add(total, transformation_rule_success_count(rule));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11990L)
    public static SubLObject total_transformation_rule_received_success_count() {
        SubLObject total = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.T)) {
                    total = Numbers.add(total, transformation_rule_success_count(rule));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 12225L)
    public static SubLObject transformation_rule_success_count(final SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return (SubLObject)((inference_analysis.$kw24$UNINITIALIZED == statistics) ? inference_analysis.ZERO_INTEGER : Numbers.add(Vectors.aref(statistics, (SubLObject)inference_analysis.ONE_INTEGER), Vectors.aref(statistics, (SubLObject)inference_analysis.FIVE_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 12543L)
    public static SubLObject transformation_rule_recent_success_count(final SubLObject rule) {
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return (SubLObject)((inference_analysis.$kw24$UNINITIALIZED == statistics) ? inference_analysis.ZERO_INTEGER : Vectors.aref(statistics, (SubLObject)inference_analysis.THREE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 12760L)
    public static SubLObject transformation_rule_received_success_count(final SubLObject rule) {
        possibly_extend_transformation_rule_utility_table();
        final SubLObject statistics = get_transformation_rule_statistics(rule);
        return (SubLObject)((inference_analysis.$kw24$UNINITIALIZED == statistics) ? inference_analysis.ZERO_INTEGER : Vectors.aref(statistics, (SubLObject)inference_analysis.FIVE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 13063L)
    public static SubLObject transformation_rule_success_probability(final SubLObject rule, SubLObject unused_probability) {
        if (unused_probability == inference_analysis.UNPROVIDED) {
            unused_probability = (SubLObject)inference_analysis.ZERO_INTEGER;
        }
        final SubLObject considered = transformation_rule_considered_count(rule);
        if (!considered.isPositive()) {
            return unused_probability;
        }
        final SubLObject success = transformation_rule_success_count(rule);
        return Numbers.divide(success, considered);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 13539L)
    public static SubLObject increment_transformation_rule_considered_count(final SubLObject rule, final SubLObject recentP, SubLObject count, SubLObject receivedP) {
        if (count == inference_analysis.UNPROVIDED) {
            count = (SubLObject)inference_analysis.ONE_INTEGER;
        }
        if (receivedP == inference_analysis.UNPROVIDED) {
            receivedP = (SubLObject)inference_analysis.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_analysis.NIL != assertion_handles.assertion_p(rule) : rule;
        assert inference_analysis.NIL != Types.integerp(count) : count;
        if (inference_analysis.NIL == subl_promotions.positive_integer_p(count)) {
            Errors.warn((SubLObject)inference_analysis.$str38$Incrementing_transformation_rule_);
        }
        final SubLObject statistics = ensure_transformation_rule_statistics(rule);
        if (inference_analysis.NIL != inference_analysis.$transformation_rule_statistics_update_enabledP$.getDynamicValue(thread)) {
            if (inference_analysis.NIL == receivedP) {
                Vectors.set_aref(statistics, (SubLObject)inference_analysis.ZERO_INTEGER, Numbers.add(Vectors.aref(statistics, (SubLObject)inference_analysis.ZERO_INTEGER), count));
            }
            if (inference_analysis.NIL != recentP) {
                Vectors.set_aref(statistics, (SubLObject)inference_analysis.TWO_INTEGER, Numbers.add(Vectors.aref(statistics, (SubLObject)inference_analysis.TWO_INTEGER), count));
            }
            if (inference_analysis.NIL != receivedP) {
                Vectors.set_aref(statistics, (SubLObject)inference_analysis.FOUR_INTEGER, Numbers.add(Vectors.aref(statistics, (SubLObject)inference_analysis.FOUR_INTEGER), count));
            }
        }
        return Vectors.aref(statistics, (SubLObject)inference_analysis.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 14447L)
    public static SubLObject increment_transformation_rule_success_count(final SubLObject rule, final SubLObject recentP, SubLObject count, SubLObject receivedP) {
        if (count == inference_analysis.UNPROVIDED) {
            count = (SubLObject)inference_analysis.ONE_INTEGER;
        }
        if (receivedP == inference_analysis.UNPROVIDED) {
            receivedP = (SubLObject)inference_analysis.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_analysis.NIL != assertion_handles.assertion_p(rule) : rule;
        assert inference_analysis.NIL != Types.integerp(count) : count;
        final SubLObject statistics = ensure_transformation_rule_statistics(rule);
        if (inference_analysis.NIL != inference_analysis.$transformation_rule_statistics_update_enabledP$.getDynamicValue(thread)) {
            if (inference_analysis.NIL == receivedP) {
                Vectors.set_aref(statistics, (SubLObject)inference_analysis.ONE_INTEGER, Numbers.add(Vectors.aref(statistics, (SubLObject)inference_analysis.ONE_INTEGER), count));
            }
            if (inference_analysis.NIL != recentP) {
                Vectors.set_aref(statistics, (SubLObject)inference_analysis.THREE_INTEGER, Numbers.add(Vectors.aref(statistics, (SubLObject)inference_analysis.THREE_INTEGER), count));
            }
            if (inference_analysis.NIL != receivedP) {
                Vectors.set_aref(statistics, (SubLObject)inference_analysis.FIVE_INTEGER, Numbers.add(Vectors.aref(statistics, (SubLObject)inference_analysis.FIVE_INTEGER), count));
            }
        }
        return Vectors.aref(statistics, (SubLObject)inference_analysis.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 15202L)
    public static SubLObject clear_all_recent_transformation_rule_statistics() {
        SubLObject count = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.T, (SubLObject)inference_analysis.NIL)) {
                    clear_transformation_rule_recent_counts(rule);
                    count = Numbers.add(count, (SubLObject)inference_analysis.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 15443L)
    public static SubLObject clear_all_received_transformation_rule_statistics() {
        SubLObject count = (SubLObject)inference_analysis.ZERO_INTEGER;
        clear_transformation_rule_statistics_received_filename_load_history();
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.T)) {
                    clear_transformation_rule_received_counts(rule);
                    count = Numbers.add(count, (SubLObject)inference_analysis.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 15764L)
    public static SubLObject clear_transformation_rule_recent_counts(final SubLObject rule) {
        assert inference_analysis.NIL != assertion_handles.assertion_p(rule) : rule;
        final SubLObject statistics = ensure_transformation_rule_statistics(rule);
        Vectors.set_aref(statistics, (SubLObject)inference_analysis.TWO_INTEGER, (SubLObject)inference_analysis.ZERO_INTEGER);
        Vectors.set_aref(statistics, (SubLObject)inference_analysis.THREE_INTEGER, (SubLObject)inference_analysis.ZERO_INTEGER);
        return (SubLObject)inference_analysis.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 16125L)
    public static SubLObject clear_transformation_rule_received_counts(final SubLObject rule) {
        assert inference_analysis.NIL != assertion_handles.assertion_p(rule) : rule;
        possibly_extend_transformation_rule_utility_table();
        final SubLObject statistics = ensure_transformation_rule_statistics(rule);
        Vectors.set_aref(statistics, (SubLObject)inference_analysis.FOUR_INTEGER, (SubLObject)inference_analysis.ZERO_INTEGER);
        Vectors.set_aref(statistics, (SubLObject)inference_analysis.FIVE_INTEGER, (SubLObject)inference_analysis.ZERO_INTEGER);
        return (SubLObject)inference_analysis.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 16588L)
    public static SubLObject clean_transformation_rule_statistics() {
        SubLObject count = (SubLObject)inference_analysis.ZERO_INTEGER;
        SubLObject dirty_rules = (SubLObject)inference_analysis.NIL;
        SubLObject release = (SubLObject)inference_analysis.NIL;
        try {
            release = Locks.seize_lock(inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue());
            hash_table_utilities.rehash(inference_analysis.$transformation_rule_statistics_table$.getGlobalValue());
            SubLObject rule = (SubLObject)inference_analysis.NIL;
            SubLObject statistics = (SubLObject)inference_analysis.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(inference_analysis.$transformation_rule_statistics_table$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    rule = Hashtables.getEntryKey(cdohash_entry);
                    statistics = Hashtables.getEntryValue(cdohash_entry);
                    if (inference_analysis.NIL == assertion_handles.valid_assertionP(rule, (SubLObject)inference_analysis.UNPROVIDED) || inference_analysis.NIL == assertions_high.rule_assertionP(rule) || Vectors.aref(statistics, (SubLObject)inference_analysis.ZERO_INTEGER).isZero()) {
                        dirty_rules = (SubLObject)ConsesLow.cons(rule, dirty_rules);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            SubLObject cdolist_list_var = dirty_rules;
            SubLObject rule2 = (SubLObject)inference_analysis.NIL;
            rule2 = cdolist_list_var.first();
            while (inference_analysis.NIL != cdolist_list_var) {
                clear_transformation_rule_statistics(rule2);
                count = Numbers.add(count, (SubLObject)inference_analysis.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                rule2 = cdolist_list_var.first();
            }
        }
        finally {
            if (inference_analysis.NIL != release) {
                Locks.release_lock(inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue());
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 17448L)
    public static SubLObject rule_utility_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isInteger() && v_object.numGE((SubLObject)inference_analysis.$int39$_100) && v_object.numLE((SubLObject)inference_analysis.$int40$100));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 17567L)
    public static SubLObject transformation_rule_has_insufficient_historical_utilityP(final SubLObject rule, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject min_rule_utility = inference_datastructures_inference.inference_min_rule_utility(inference);
        if (inference_analysis.ZERO_INTEGER.numE(inference_analysis.$transformation_rule_historical_success_pruning_threshold$.getDynamicValue(thread)) && inference_analysis.$int39$_100.numE(min_rule_utility)) {
            return (SubLObject)inference_analysis.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_rule_success_count(rule).numL(inference_analysis.$transformation_rule_historical_success_pruning_threshold$.getDynamicValue(thread)) || transformation_rule_historical_utility(rule).numL(min_rule_utility));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 18081L)
    public static SubLObject rule_historical_utility_success_threshold(SubLObject success_fraction) {
        if (success_fraction == inference_analysis.UNPROVIDED) {
            success_fraction = (SubLObject)inference_analysis.ONE_INTEGER;
        }
        final SubLObject rules = transformation_rules_with_statistics((SubLObject)inference_analysis.$kw34$HISTORICAL_UTILITY, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject total_successes = total_transformation_rule_success_count();
        final SubLObject success_threshold = Numbers.ceiling(Numbers.multiply(success_fraction, total_successes), (SubLObject)inference_analysis.UNPROVIDED);
        SubLObject sofar = (SubLObject)inference_analysis.ZERO_INTEGER;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            final SubLObject successes = transformation_rule_success_count(rule);
            sofar = Numbers.add(sofar, successes);
            if (sofar.numGE(success_threshold)) {
                return transformation_rule_historical_utility(rule);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return (SubLObject)inference_analysis.$int39$_100;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 18786L)
    public static SubLObject rule_historical_utility_saved_considerations(SubLObject utility_threshold) {
        if (utility_threshold == inference_analysis.UNPROVIDED) {
            utility_threshold = (SubLObject)inference_analysis.ZERO_INTEGER;
        }
        final SubLObject rules = transformation_rules_with_statistics((SubLObject)inference_analysis.$kw34$HISTORICAL_UTILITY, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        SubLObject saved_considerations = (SubLObject)inference_analysis.ZERO_INTEGER;
        SubLObject lost_successes = (SubLObject)inference_analysis.ZERO_INTEGER;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            if (!transformation_rule_historical_utility(rule).numGE(utility_threshold)) {
                final SubLObject considered_count = transformation_rule_considered_count(rule);
                final SubLObject success_count = transformation_rule_success_count(rule);
                saved_considerations = Numbers.add(saved_considerations, considered_count);
                lost_successes = Numbers.add(lost_successes, success_count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Values.values(saved_considerations, lost_successes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 19716L)
    public static SubLObject transformation_rules_considered_with_success(SubLObject recentP, SubLObject receivedP) {
        if (recentP == inference_analysis.UNPROVIDED) {
            recentP = (SubLObject)inference_analysis.NIL;
        }
        if (receivedP == inference_analysis.UNPROVIDED) {
            receivedP = (SubLObject)inference_analysis.NIL;
        }
        SubLObject rules = (SubLObject)inference_analysis.NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, recentP, receivedP) && transformation_rule_success_count(rule).isPositive()) {
                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), Symbols.symbol_function((SubLObject)inference_analysis.$sym28$TRANSFORMATION_RULE_SUCCESS_COUNT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 20150L)
    public static SubLObject transformation_rules_considered_with_no_success() {
        SubLObject rules = (SubLObject)inference_analysis.NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL) && !transformation_rule_success_count(rule).isPositive()) {
                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), Symbols.symbol_function((SubLObject)inference_analysis.$sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 20530L)
    public static SubLObject transformation_rules_considered_with_success_from_mt(final SubLObject mt) {
        final SubLObject rules = transformation_rules_considered_with_success((SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        SubLObject filtered_rules = (SubLObject)inference_analysis.NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            if (inference_analysis.NIL != hlmt.hlmt_equal(mt, assertions_high.assertion_mt(rule))) {
                filtered_rules = (SubLObject)ConsesLow.cons(rule, filtered_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 20926L)
    public static SubLObject transformation_rules_considered_with_no_success_from_mt(final SubLObject mt) {
        final SubLObject rules = transformation_rules_considered_with_no_success();
        SubLObject filtered_rules = (SubLObject)inference_analysis.NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            if (inference_analysis.NIL != hlmt.hlmt_equal(mt, assertions_high.assertion_mt(rule))) {
                filtered_rules = (SubLObject)ConsesLow.cons(rule, filtered_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 21331L)
    public static SubLObject transformation_rules_considered_with_no_success_not_in_mts(final SubLObject mts) {
        final SubLObject rules = transformation_rules_considered_with_no_success();
        SubLObject filtered_rules = (SubLObject)inference_analysis.NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            if (inference_analysis.NIL == subl_promotions.memberP(assertions_high.assertion_mt(rule), mts, Symbols.symbol_function((SubLObject)inference_analysis.$sym41$HLMT_EQUAL), (SubLObject)inference_analysis.UNPROVIDED)) {
                filtered_rules = (SubLObject)ConsesLow.cons(rule, filtered_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 21834L)
    public static SubLObject transformation_rule_mts_considered_with_success() {
        final SubLObject success_mts = set.new_set((SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL) && transformation_rule_success_count(rule).isPositive()) {
                    final SubLObject mt = assertions_high.assertion_mt(rule);
                    set.set_add(mt, success_mts);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return set.set_element_list(success_mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 22326L)
    public static SubLObject transformation_rule_mts_considered_with_no_success() {
        final SubLObject success_mts = set.new_set((SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject considered_mts = set.new_set((SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL)) {
                    final SubLObject mt = assertions_high.assertion_mt(rule);
                    set.set_add(mt, considered_mts);
                    if (!transformation_rule_success_count(rule).isPositive()) {
                        continue;
                    }
                    set.set_add(mt, success_mts);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject useless_mts = set.new_set((SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(considered_mts);
        SubLObject basis_object;
        SubLObject state;
        SubLObject mt2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_analysis.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_analysis.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            mt2 = set_contents.do_set_contents_next(basis_object, state);
            if (inference_analysis.NIL != set_contents.do_set_contents_element_validP(state, mt2) && inference_analysis.NIL == set.set_memberP(mt2, success_mts)) {
                set.set_add(mt2, useless_mts);
            }
        }
        return set.set_element_list(useless_mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 23034L)
    public static SubLObject transformation_rules_considered_with_success_proving_predicate(final SubLObject predicate) {
        SubLObject success_rules = (SubLObject)inference_analysis.NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL) && transformation_rule_success_count(rule).isPositive()) {
                    SubLObject successP;
                    SubLObject rest;
                    SubLObject asent;
                    for (successP = (SubLObject)inference_analysis.NIL, rest = (SubLObject)inference_analysis.NIL, rest = clauses.neg_lits(assertions_high.assertion_cnf(rule)); inference_analysis.NIL == successP && inference_analysis.NIL != rest; rest = rest.rest()) {
                        asent = rest.first();
                        if (predicate.equal(cycl_utilities.atomic_sentence_predicate(asent))) {
                            successP = (SubLObject)inference_analysis.T;
                        }
                    }
                    for (rest = (SubLObject)inference_analysis.NIL, rest = clauses.pos_lits(assertions_high.assertion_cnf(rule)); inference_analysis.NIL == successP && inference_analysis.NIL != rest; rest = rest.rest()) {
                        asent = rest.first();
                        if (predicate.equal(cycl_utilities.atomic_sentence_predicate(asent))) {
                            successP = (SubLObject)inference_analysis.T;
                        }
                    }
                    if (inference_analysis.NIL == successP) {
                        continue;
                    }
                    success_rules = (SubLObject)ConsesLow.cons(rule, success_rules);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(success_rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), Symbols.symbol_function((SubLObject)inference_analysis.$sym28$TRANSFORMATION_RULE_SUCCESS_COUNT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 23802L)
    public static SubLObject transformation_rules_considered_with_no_success_proving_predicate(final SubLObject predicate) {
        SubLObject failure_rules = (SubLObject)inference_analysis.NIL;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL) && !transformation_rule_success_count(rule).isPositive()) {
                    SubLObject successP;
                    SubLObject rest;
                    SubLObject asent;
                    for (successP = (SubLObject)inference_analysis.NIL, rest = (SubLObject)inference_analysis.NIL, rest = clauses.neg_lits(assertions_high.assertion_cnf(rule)); inference_analysis.NIL == successP && inference_analysis.NIL != rest; rest = rest.rest()) {
                        asent = rest.first();
                        if (predicate.equal(cycl_utilities.atomic_sentence_predicate(asent))) {
                            successP = (SubLObject)inference_analysis.T;
                        }
                    }
                    for (rest = (SubLObject)inference_analysis.NIL, rest = clauses.pos_lits(assertions_high.assertion_cnf(rule)); inference_analysis.NIL == successP && inference_analysis.NIL != rest; rest = rest.rest()) {
                        asent = rest.first();
                        if (predicate.equal(cycl_utilities.atomic_sentence_predicate(asent))) {
                            successP = (SubLObject)inference_analysis.T;
                        }
                    }
                    if (inference_analysis.NIL == successP) {
                        continue;
                    }
                    failure_rules = (SubLObject)ConsesLow.cons(rule, failure_rules);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(failure_rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), Symbols.symbol_function((SubLObject)inference_analysis.$sym29$TRANSFORMATION_RULE_CONSIDERED_COUNT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 24525L)
    public static SubLObject transformation_rule_predicates_considered_with_success() {
        final SubLObject success_predicates = set.new_set((SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL)) {
                    final SubLObject successP = Numbers.plusp(transformation_rule_success_count(rule));
                    SubLObject cdolist_list_var = clauses.neg_lits(assertions_high.assertion_cnf(rule));
                    SubLObject asent = (SubLObject)inference_analysis.NIL;
                    asent = cdolist_list_var.first();
                    while (inference_analysis.NIL != cdolist_list_var) {
                        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                        if (inference_analysis.NIL != forts.fort_p(predicate) && inference_analysis.NIL != successP) {
                            set.set_add(predicate, success_predicates);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    }
                    cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(rule));
                    asent = (SubLObject)inference_analysis.NIL;
                    asent = cdolist_list_var.first();
                    while (inference_analysis.NIL != cdolist_list_var) {
                        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                        if (inference_analysis.NIL != forts.fort_p(predicate) && inference_analysis.NIL != successP) {
                            set.set_add(predicate, success_predicates);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    }
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return set.set_element_list(success_predicates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 25275L)
    public static SubLObject transformation_rule_predicates_considered_with_no_success() {
        final SubLObject success_predicates = set.new_set((SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject considered_predicates = set.new_set((SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL)) {
                    final SubLObject successP = Numbers.plusp(transformation_rule_success_count(rule));
                    SubLObject cdolist_list_var = clauses.neg_lits(assertions_high.assertion_cnf(rule));
                    SubLObject asent = (SubLObject)inference_analysis.NIL;
                    asent = cdolist_list_var.first();
                    while (inference_analysis.NIL != cdolist_list_var) {
                        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                        if (inference_analysis.NIL != forts.fort_p(predicate)) {
                            set.set_add(predicate, considered_predicates);
                            if (inference_analysis.NIL != successP) {
                                set.set_add(predicate, success_predicates);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    }
                    cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(rule));
                    asent = (SubLObject)inference_analysis.NIL;
                    asent = cdolist_list_var.first();
                    while (inference_analysis.NIL != cdolist_list_var) {
                        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                        if (inference_analysis.NIL != forts.fort_p(predicate)) {
                            set.set_add(predicate, considered_predicates);
                            if (inference_analysis.NIL != successP) {
                                set.set_add(predicate, success_predicates);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        asent = cdolist_list_var.first();
                    }
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject useless_predicates = set.new_set((SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(considered_predicates);
        SubLObject basis_object;
        SubLObject state;
        SubLObject predicate2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_analysis.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_analysis.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            predicate2 = set_contents.do_set_contents_next(basis_object, state);
            if (inference_analysis.NIL != set_contents.do_set_contents_element_validP(state, predicate2) && inference_analysis.NIL == set.set_memberP(predicate2, success_predicates)) {
                set.set_add(predicate2, useless_predicates);
            }
        }
        return set.set_element_list(useless_predicates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 26314L)
    public static SubLObject reinforce_transformation_rule(final SubLObject rule, SubLObject n) {
        if (n == inference_analysis.UNPROVIDED) {
            n = (SubLObject)inference_analysis.$int40$100;
        }
        assert inference_analysis.NIL != assertions_high.rule_assertionP(rule) : rule;
        increment_transformation_rule_considered_count(rule, (SubLObject)inference_analysis.T, n, (SubLObject)inference_analysis.UNPROVIDED);
        increment_transformation_rule_success_count(rule, (SubLObject)inference_analysis.T, n, (SubLObject)inference_analysis.UNPROVIDED);
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 26573L)
    public static SubLObject reinforce_inference_transformation_rules_in_answers(final SubLObject inference, SubLObject n) {
        if (n == inference_analysis.UNPROVIDED) {
            n = (SubLObject)inference_analysis.$int40$100;
        }
        SubLObject cdolist_list_var;
        final SubLObject rules = cdolist_list_var = inference_datastructures_inference.inference_transformation_rules_in_answers(inference);
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            reinforce_transformation_rule(rule, n);
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.length(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 26907L)
    public static SubLObject reinforce_inference_transformation_rules(final SubLObject inference, SubLObject n) {
        if (n == inference_analysis.UNPROVIDED) {
            n = (SubLObject)inference_analysis.$int40$100;
        }
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject considered_rules = inference_datastructures_problem_store.problem_store_transformation_rules(store);
        final SubLObject success_rules = inference_datastructures_inference.inference_transformation_rules_in_answers(inference);
        SubLObject cdolist_list_var = considered_rules;
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            increment_transformation_rule_considered_count(rule, (SubLObject)inference_analysis.T, n, (SubLObject)inference_analysis.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        cdolist_list_var = success_rules;
        rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            increment_transformation_rule_success_count(rule, (SubLObject)inference_analysis.T, n, (SubLObject)inference_analysis.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Values.values(Sequences.length(success_rules), Sequences.length(considered_rules));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 27469L)
    public static SubLObject save_transformation_rule_statistics(final SubLObject filename, SubLObject internalP) {
        if (internalP == inference_analysis.UNPROVIDED) {
            internalP = (SubLObject)inference_analysis.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clean_transformation_rule_statistics();
        SubLObject stream = (SubLObject)inference_analysis.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)inference_analysis.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)inference_analysis.$kw43$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)inference_analysis.$str44$Unable_to_open__S, filename);
            }
            final SubLObject stream_$2 = stream;
            final SubLObject count = transformation_rules_with_statistics_count();
            cfasl.cfasl_output(count, stream_$2);
            SubLObject cdolist_list_var = transformation_rules_with_statistics_helper();
            SubLObject rule = (SubLObject)inference_analysis.NIL;
            rule = cdolist_list_var.first();
            while (inference_analysis.NIL != cdolist_list_var) {
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL)) {
                    save_transformation_rule_statistics_for_rule(stream_$2, rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL, internalP);
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)inference_analysis.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 27921L)
    public static SubLObject load_transformation_rule_statistics(final SubLObject filename, SubLObject mergeP, SubLObject receivedP) {
        if (mergeP == inference_analysis.UNPROVIDED) {
            mergeP = (SubLObject)inference_analysis.T;
        }
        if (receivedP == inference_analysis.UNPROVIDED) {
            receivedP = (SubLObject)inference_analysis.NIL;
        }
        return load_transformation_rule_statistics_int(filename, mergeP, (SubLObject)inference_analysis.NIL, receivedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 28195L)
    public static SubLObject load_transformation_rule_statistics_except_for_rules(final SubLObject filename, final SubLObject rules, SubLObject mergeP, SubLObject receivedP) {
        if (mergeP == inference_analysis.UNPROVIDED) {
            mergeP = (SubLObject)inference_analysis.T;
        }
        if (receivedP == inference_analysis.UNPROVIDED) {
            receivedP = (SubLObject)inference_analysis.NIL;
        }
        return load_transformation_rule_statistics_int(filename, mergeP, rules, receivedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 28506L)
    public static SubLObject load_transformation_rule_statistics_int(final SubLObject filename, final SubLObject mergeP, final SubLObject exclude_rules, final SubLObject receivedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exclude_rule_set = (SubLObject)((inference_analysis.NIL != exclude_rules) ? set_utilities.construct_set_from_list(exclude_rules, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED) : inference_analysis.NIL);
        load_transformation_rule_statistics_bookkeeping(filename, mergeP, receivedP);
        SubLObject stream = (SubLObject)inference_analysis.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)inference_analysis.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)inference_analysis.$kw45$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)inference_analysis.$str44$Unable_to_open__S, filename);
            }
            final SubLObject stream_$3 = stream;
            SubLObject count;
            SubLObject i;
            for (count = cfasl.cfasl_input(stream_$3, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED), i = (SubLObject)inference_analysis.NIL, i = (SubLObject)inference_analysis.ZERO_INTEGER; i.numL(count); i = Numbers.add(i, (SubLObject)inference_analysis.ONE_INTEGER)) {
                load_transformation_rule_statistics_for_rule(stream_$3, exclude_rule_set, receivedP);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)inference_analysis.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 28998L)
    public static SubLObject load_transformation_rule_statistics_bookkeeping(final SubLObject filename, final SubLObject mergeP, final SubLObject receivedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_analysis.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_analysis.NIL == inference_analysis.$transformation_rule_statistics_update_enabledP$.getDynamicValue(thread)) {
            Errors.error((SubLObject)inference_analysis.$str46$Transformation_rule_statistics_up);
        }
        if (inference_analysis.NIL == mergeP) {
            clear_all_transformation_rule_statistics();
        }
        add_to_transformation_rule_statistics_filename_load_history(filename, receivedP);
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 29373L)
    public static SubLObject save_recent_transformation_rule_statistics(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)inference_analysis.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)inference_analysis.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)inference_analysis.$kw43$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)inference_analysis.$str44$Unable_to_open__S, filename);
            }
            final SubLObject stream_$4 = stream;
            final SubLObject count = transformation_rules_with_recent_statistics_count();
            cfasl.cfasl_output(count, stream_$4);
            SubLObject cdolist_list_var = transformation_rules_with_statistics_helper();
            SubLObject rule = (SubLObject)inference_analysis.NIL;
            rule = cdolist_list_var.first();
            while (inference_analysis.NIL != cdolist_list_var) {
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.T, (SubLObject)inference_analysis.NIL)) {
                    final SubLObject internalP = (SubLObject)inference_analysis.NIL;
                    save_transformation_rule_statistics_for_rule(stream_$4, rule, (SubLObject)inference_analysis.T, (SubLObject)inference_analysis.NIL, internalP);
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)inference_analysis.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 29852L)
    public static SubLObject save_received_experience(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)inference_analysis.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)inference_analysis.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)inference_analysis.$kw43$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)inference_analysis.$str44$Unable_to_open__S, filename);
            }
            final SubLObject stream_$5 = stream;
            final SubLObject count = transformation_rules_with_received_statistics_count();
            cfasl.cfasl_output(count, stream_$5);
            SubLObject cdolist_list_var = transformation_rules_with_statistics_helper();
            SubLObject rule = (SubLObject)inference_analysis.NIL;
            rule = cdolist_list_var.first();
            while (inference_analysis.NIL != cdolist_list_var) {
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.T)) {
                    final SubLObject internalP = (SubLObject)inference_analysis.NIL;
                    save_transformation_rule_statistics_for_rule(stream_$5, rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.T, internalP);
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)inference_analysis.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 30362L)
    public static SubLObject save_transformation_rule_statistics_for_rule(final SubLObject stream, final SubLObject rule, final SubLObject recentP, final SubLObject receivedP, final SubLObject internalP) {
        if (inference_analysis.NIL != internalP) {
            cfasl.cfasl_output(rule, stream);
        }
        else {
            cfasl.cfasl_output_externalized(rule, stream);
        }
        final SubLObject considered = transformation_rule_something_considered_count(rule, recentP, receivedP);
        final SubLObject success = transformation_rule_something_success_count(rule, recentP, receivedP);
        cfasl.cfasl_output(considered, stream);
        cfasl.cfasl_output(success, stream);
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 31023L)
    public static SubLObject transformation_rule_something_considered_count(final SubLObject rule, final SubLObject recentP, final SubLObject receivedP) {
        if (inference_analysis.NIL != recentP) {
            return transformation_rule_recent_considered_count(rule);
        }
        if (inference_analysis.NIL != receivedP) {
            return transformation_rule_received_considered_count(rule);
        }
        return transformation_rule_considered_count(rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 31433L)
    public static SubLObject transformation_rule_something_success_count(final SubLObject rule, final SubLObject recentP, final SubLObject receivedP) {
        if (inference_analysis.NIL != recentP) {
            return transformation_rule_recent_success_count(rule);
        }
        if (inference_analysis.NIL != receivedP) {
            return transformation_rule_received_success_count(rule);
        }
        return transformation_rule_success_count(rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 31822L)
    public static SubLObject load_transformation_rule_statistics_for_rule(final SubLObject stream, final SubLObject exclude_rule_set, final SubLObject receivedP) {
        final SubLObject rule = cfasl.cfasl_input(stream, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject considered = cfasl.cfasl_input(stream, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject success = cfasl.cfasl_input(stream, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        if (inference_analysis.NIL != subl_promotions.non_negative_integer_p(considered) && inference_analysis.NIL != subl_promotions.non_negative_integer_p(success) && inference_analysis.NIL != assertion_handles.valid_assertionP(rule, (SubLObject)inference_analysis.UNPROVIDED) && (inference_analysis.NIL == exclude_rule_set || inference_analysis.NIL == set.set_memberP(rule, exclude_rule_set))) {
            increment_transformation_rule_considered_count(rule, (SubLObject)inference_analysis.NIL, considered, receivedP);
            increment_transformation_rule_success_count(rule, (SubLObject)inference_analysis.NIL, success, receivedP);
        }
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 32649L)
    public static SubLObject show_transformation_rule_statistics(SubLObject stream, SubLObject order) {
        if (stream == inference_analysis.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (order == inference_analysis.UNPROVIDED) {
            order = (SubLObject)inference_analysis.$kw34$HISTORICAL_UTILITY;
        }
        final SubLObject rules = transformation_rules_with_statistics(order, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)inference_analysis.$str47$_________________________________);
        PrintLow.format(stream, (SubLObject)inference_analysis.$str48$______S_rules__sorted_by__A, Sequences.length(rules), order);
        PrintLow.format(stream, (SubLObject)inference_analysis.$str47$_________________________________);
        SubLObject cdolist_list_var = rules;
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            final SubLObject considered = transformation_rule_considered_count(rule);
            final SubLObject success = transformation_rule_success_count(rule);
            final SubLObject probability = transformation_rule_success_probability(rule, (SubLObject)inference_analysis.UNPROVIDED);
            final SubLObject utility = transformation_rule_historical_utility(rule);
            PrintLow.format(stream, (SubLObject)inference_analysis.$str49$________S__S___S_____utility____S, new SubLObject[] { success, considered, number_utilities.significant_digits(Numbers.multiply((SubLObject)inference_analysis.$int40$100, probability), (SubLObject)inference_analysis.FOUR_INTEGER), utility, rule });
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.length(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 33863L)
    public static SubLObject possibly_save_recent_experience() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_analysis.NIL != Locks.lock_idle_p(inference_analysis.$save_recent_experience_lock$.getDynamicValue(thread))) {
            return save_recent_experience();
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 34065L)
    public static SubLObject save_recent_experience() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_analysis.NIL != any_recent_experienceP()) {
            SubLObject release = (SubLObject)inference_analysis.NIL;
            try {
                release = Locks.seize_lock(inference_analysis.$save_recent_experience_lock$.getDynamicValue(thread));
                save_recent_experience_internal();
            }
            finally {
                if (inference_analysis.NIL != release) {
                    Locks.release_lock(inference_analysis.$save_recent_experience_lock$.getDynamicValue(thread));
                }
            }
            return (SubLObject)inference_analysis.T;
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 34248L)
    public static SubLObject local_experience_transcript() {
        return string_utilities.replace_substring(string_utilities.replace_substring(transcript_utilities.construct_transcript_filename(transcript_utilities.make_local_transcript_filename((SubLObject)inference_analysis.$str51$experience)), (SubLObject)inference_analysis.$str52$_TS, (SubLObject)inference_analysis.$str53$_CFASL), (SubLObject)inference_analysis.$str54$_ts, (SubLObject)inference_analysis.$str55$_cfasl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 34461L)
    public static SubLObject save_recent_experience_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)inference_analysis.NIL;
        SubLObject local_experience_transcript = (SubLObject)inference_analysis.NIL;
        SubLObject error = (SubLObject)inference_analysis.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)inference_analysis.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    local_experience_transcript = local_experience_transcript();
                    if (inference_analysis.NIL != local_experience_transcript && inference_analysis.NIL != save_recent_transformation_rule_statistics(local_experience_transcript) && inference_analysis.NIL == error) {
                        successP = (SubLObject)inference_analysis.T;
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)inference_analysis.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 34879L)
    public static SubLObject replace_and_collate_experience(final SubLObject old_experience_file, final SubLObject new_experience_directory) {
        load_transformation_rule_statistics(old_experience_file, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.UNPROVIDED);
        return collate_experience(new_experience_directory);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 35271L)
    public static SubLObject collate_experience(final SubLObject new_experience_directory) {
        return load_all_experience_transcripts_from_directory(new_experience_directory, (SubLObject)inference_analysis.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 35553L)
    public static SubLObject receive_experience() {
        clear_all_received_transformation_rule_statistics();
        return load_all_experience_transcripts_from_directory(transcript_utilities.transcript_directory(), (SubLObject)inference_analysis.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 35926L)
    public static SubLObject load_received_experience(final SubLObject filename) {
        clear_all_received_transformation_rule_statistics();
        return load_experience_transcript(filename, (SubLObject)inference_analysis.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 36128L)
    public static SubLObject load_all_experience_transcripts_from_directory(final SubLObject directory, SubLObject receivedP) {
        if (receivedP == inference_analysis.UNPROVIDED) {
            receivedP = (SubLObject)inference_analysis.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)inference_analysis.ZERO_INTEGER;
        assert inference_analysis.NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)inference_analysis.T);
        final SubLObject progress_message_var = (SubLObject)inference_analysis.$str58$Loading_transformation_rule_stati;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (inference_analysis.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$6 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((inference_analysis.NIL != progress_message_var) ? progress_message_var : inference_analysis.$str59$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)inference_analysis.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)inference_analysis.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)inference_analysis.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)inference_analysis.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject filename = (SubLObject)inference_analysis.NIL;
                    filename = csome_list_var.first();
                    while (inference_analysis.NIL != csome_list_var) {
                        if (inference_analysis.NIL != transformation_rule_utility_experience_filenameP(filename)) {
                            load_experience_transcript(filename, receivedP);
                            count = Numbers.add(count, (SubLObject)inference_analysis.ONE_INTEGER);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)inference_analysis.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        filename = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$6, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 36640L)
    public static SubLObject transformation_rule_utility_experience_filenameP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && inference_analysis.NIL != string_utilities.ends_with(v_object, (SubLObject)inference_analysis.$str60$_experience_cfasl, (SubLObject)inference_analysis.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 36792L)
    public static SubLObject load_experience_transcript(final SubLObject filename, SubLObject receivedP) {
        if (receivedP == inference_analysis.UNPROVIDED) {
            receivedP = (SubLObject)inference_analysis.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_analysis.NIL;
        SubLObject message_var = (SubLObject)inference_analysis.NIL;
        final SubLObject was_appendingP = Eval.eval((SubLObject)inference_analysis.$sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
        Eval.eval((SubLObject)inference_analysis.$list62);
        try {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)inference_analysis.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        result = load_transformation_rule_statistics(filename, (SubLObject)inference_analysis.T, receivedP);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)inference_analysis.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                Eval.eval((SubLObject)ConsesLow.list((SubLObject)inference_analysis.$sym63$CSETQ, (SubLObject)inference_analysis.$sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn((SubLObject)inference_analysis.$str64$_A, message_var);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 37137L)
    public static SubLObject transformation_rule_historical_utility(final SubLObject rule) {
        assert inference_analysis.NIL != assertions_high.rule_assertionP(rule) : rule;
        return rule_historical_utility_from_observations(transformation_rule_success_count(rule), transformation_rule_considered_count(rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 37661L)
    public static SubLObject transformation_rule_historical_utility_G(final SubLObject rule1, final SubLObject rule2) {
        return Numbers.numG(transformation_rule_historical_utility(rule1), transformation_rule_historical_utility(rule2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 37842L)
    public static SubLObject current_average_rule_historical_success_probability(SubLObject unused_probability) {
        if (unused_probability == inference_analysis.UNPROVIDED) {
            unused_probability = (SubLObject)inference_analysis.ZERO_INTEGER;
        }
        SubLObject success = (SubLObject)inference_analysis.ZERO_INTEGER;
        SubLObject considered = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject cdohash_table = transformation_rule_statistics_table();
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        SubLObject statistics_var = (SubLObject)inference_analysis.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                rule = Hashtables.getEntryKey(cdohash_entry);
                statistics_var = Hashtables.getEntryValue(cdohash_entry);
                if (inference_analysis.NIL != transformation_rules_with_statistics_condition_passesP(rule, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL)) {
                    success = Numbers.add(success, transformation_rule_success_count(rule));
                    considered = Numbers.add(considered, transformation_rule_considered_count(rule));
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        if (!considered.isPositive()) {
            return unused_probability;
        }
        return Numbers.divide(success, considered);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 38776L)
    public static SubLObject rule_historical_utility_from_observations(final SubLObject success, final SubLObject considered) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return historical_utility_from_observations(success, considered, inference_analysis.$average_rule_historical_success_probability$.getDynamicValue(thread), inference_analysis.$rule_historical_success_happiness_scaling_factor$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 39023L)
    public static SubLObject historical_utility_from_observations(final SubLObject success, final SubLObject considered, final SubLObject average_historical_probability, final SubLObject utility_scaling_factor) {
        if (!considered.isPositive()) {
            return (SubLObject)inference_analysis.ZERO_INTEGER;
        }
        final SubLObject probability = Numbers.divide(success, considered);
        if (probability.numG(average_historical_probability)) {
            final SubLObject raw_utility = Numbers.multiply(utility_scaling_factor, Numbers.divide(Numbers.subtract(probability, average_historical_probability), Numbers.subtract((SubLObject)inference_analysis.ONE_INTEGER, average_historical_probability)), Numbers.integer_length(considered));
            final SubLObject utility = Numbers.truncate(Numbers.min((SubLObject)inference_analysis.$int40$100, raw_utility), (SubLObject)inference_analysis.UNPROVIDED);
            return utility;
        }
        if (probability.numL(average_historical_probability)) {
            final SubLObject raw_utility = Numbers.multiply(utility_scaling_factor, Numbers.divide(Numbers.subtract(probability, average_historical_probability), average_historical_probability), Numbers.integer_length(considered));
            final SubLObject utility = Numbers.truncate(Numbers.max((SubLObject)inference_analysis.$int39$_100, raw_utility), (SubLObject)inference_analysis.UNPROVIDED);
            return utility;
        }
        return (SubLObject)inference_analysis.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 40045L)
    public static SubLObject repair_all_experience_files_in_directory(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)inference_analysis.ZERO_INTEGER;
        assert inference_analysis.NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)inference_analysis.T);
        final SubLObject progress_message_var = (SubLObject)inference_analysis.$str66$Repairing_transformation_rule_sta;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (inference_analysis.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$8 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((inference_analysis.NIL != progress_message_var) ? progress_message_var : inference_analysis.$str59$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)inference_analysis.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)inference_analysis.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)inference_analysis.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)inference_analysis.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject filename = (SubLObject)inference_analysis.NIL;
                    filename = csome_list_var.first();
                    while (inference_analysis.NIL != csome_list_var) {
                        if (inference_analysis.NIL != transformation_rule_utility_experience_filenameP(filename)) {
                            count = Numbers.add(count, repair_experience_file(filename));
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)inference_analysis.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        filename = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$8, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 40385L)
    public static SubLObject repair_experience_file(final SubLObject filename) {
        SubLObject repaired_rule_count = (SubLObject)inference_analysis.ZERO_INTEGER;
        final SubLObject load_successP = load_transformation_rule_statistics_ignoring_header(filename, (SubLObject)inference_analysis.NIL);
        if (inference_analysis.NIL != load_successP) {
            repaired_rule_count = clean_transformation_rule_statistics();
            if (inference_analysis.NIL != subl_promotions.positive_integer_p(repaired_rule_count)) {
                format_nil.force_format((SubLObject)inference_analysis.T, (SubLObject)inference_analysis.$str67$Repairing__a_spurious_zeroes_in__, repaired_rule_count, filename, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
                final SubLObject new_filename = string_utilities.string_subst((SubLObject)inference_analysis.$str68$_bloated_cfasl, (SubLObject)inference_analysis.$str55$_cfasl, filename, (SubLObject)inference_analysis.UNPROVIDED);
                Filesys.rename_file(filename, new_filename);
                save_transformation_rule_statistics(filename, (SubLObject)inference_analysis.NIL);
            }
        }
        else {
            Errors.warn((SubLObject)inference_analysis.$str69$Could_not_load__a, filename);
        }
        return repaired_rule_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 41343L)
    public static SubLObject load_transformation_rule_statistics_ignoring_header(final SubLObject filename, final SubLObject mergeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)inference_analysis.NIL;
        SubLObject message_var = (SubLObject)inference_analysis.NIL;
        final SubLObject was_appendingP = Eval.eval((SubLObject)inference_analysis.$sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
        Eval.eval((SubLObject)inference_analysis.$list62);
        try {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)inference_analysis.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        load_transformation_rule_statistics_bookkeeping(filename, mergeP, (SubLObject)inference_analysis.NIL);
                        final SubLObject _prev_bind_0_$10 = cfasl.$cfasl_stream_extensions_enabled$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = cfasl.$cfasl_unread_byte$.currentBinding(thread);
                        try {
                            cfasl.$cfasl_stream_extensions_enabled$.bind((SubLObject)inference_analysis.T, thread);
                            cfasl.$cfasl_unread_byte$.bind((SubLObject)inference_analysis.NIL, thread);
                            SubLObject stream = (SubLObject)inference_analysis.NIL;
                            try {
                                final SubLObject _prev_bind_0_$11 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind((SubLObject)inference_analysis.NIL, thread);
                                    stream = compatibility.open_binary(filename, (SubLObject)inference_analysis.$kw45$INPUT);
                                }
                                finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$11, thread);
                                }
                                if (!stream.isStream()) {
                                    Errors.error((SubLObject)inference_analysis.$str44$Unable_to_open__S, filename);
                                }
                                final SubLObject stream_$12 = stream;
                                final SubLObject count = cfasl.cfasl_input(stream_$12, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
                                for (SubLObject eofP = Equality.eq((SubLObject)inference_analysis.$kw70$EOF, cfasl.cfasl_opcode_peek(stream_$12, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.$kw70$EOF)); inference_analysis.NIL == eofP; eofP = Equality.eq((SubLObject)inference_analysis.$kw70$EOF, cfasl.cfasl_opcode_peek(stream_$12, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.$kw70$EOF))) {
                                    load_transformation_rule_statistics_for_rule(stream_$12, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.NIL);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (stream.isStream()) {
                                        streams_high.close(stream, (SubLObject)inference_analysis.UNPROVIDED);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        }
                        finally {
                            cfasl.$cfasl_unread_byte$.rebind(_prev_bind_2, thread);
                            cfasl.$cfasl_stream_extensions_enabled$.rebind(_prev_bind_0_$10, thread);
                        }
                        successP = (SubLObject)inference_analysis.T;
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)inference_analysis.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                Eval.eval((SubLObject)ConsesLow.list((SubLObject)inference_analysis.$sym63$CSETQ, (SubLObject)inference_analysis.$sym61$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn((SubLObject)inference_analysis.$str64$_A, message_var);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 42005L)
    public static SubLObject possibly_extend_transformation_rule_utility_table() {
        if (inference_analysis.NIL != rule_utility_table_uses_new_formatP()) {
            return (SubLObject)inference_analysis.NIL;
        }
        SubLObject cdolist_list_var = hash_table_utilities.hash_table_to_alist(inference_analysis.$transformation_rule_statistics_table$.getGlobalValue());
        SubLObject cons = (SubLObject)inference_analysis.NIL;
        cons = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject rule = (SubLObject)inference_analysis.NIL;
            SubLObject vector = (SubLObject)inference_analysis.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_analysis.$list71);
            rule = current.first();
            current = (vector = current.rest());
            final SubLObject new_vector = vector_utilities.extend_vector(vector, (SubLObject)inference_analysis.TWO_INTEGER, (SubLObject)inference_analysis.ZERO_INTEGER);
            Hashtables.sethash(rule, inference_analysis.$transformation_rule_statistics_table$.getGlobalValue(), new_vector);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)inference_analysis.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 42360L)
    public static SubLObject rule_utility_table_uses_new_formatP() {
        final SubLObject vector = hash_table_utilities.hash_table_arbitrary_value(inference_analysis.$transformation_rule_statistics_table$.getGlobalValue());
        return Numbers.numE((SubLObject)inference_analysis.SIX_INTEGER, Sequences.length(vector));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 43166L)
    public static SubLObject historically_connected_rules_set_contents(final SubLObject rule) {
        assert inference_analysis.NIL != assertion_handles.assertion_p(rule) : rule;
        return Hashtables.gethash_without_values(rule, inference_analysis.$transformation_rule_historical_connectivity_graph$.getGlobalValue(), (SubLObject)inference_analysis.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 43403L)
    public static SubLObject set_historically_connected_rules_set_contents(final SubLObject rule, final SubLObject rule_set_contents) {
        assert inference_analysis.NIL != assertion_handles.assertion_p(rule) : rule;
        assert inference_analysis.NIL != set_contents.set_contents_p(rule_set_contents) : rule_set_contents;
        return Hashtables.sethash(rule, inference_analysis.$transformation_rule_historical_connectivity_graph$.getGlobalValue(), rule_set_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 43713L)
    public static SubLObject rules_historically_connectedP(final SubLObject rule1, final SubLObject rule2) {
        return set_contents.set_contents_memberP(rule2, historically_connected_rules_set_contents(rule1), Symbols.symbol_function((SubLObject)inference_analysis.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 43884L)
    public static SubLObject historically_connected_rules(final SubLObject rule) {
        return set_contents.set_contents_element_list(historically_connected_rules_set_contents(rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 44025L)
    public static SubLObject rule_historical_connectedness_ratio(final SubLObject rules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject n = Sequences.length(rules);
        if (n.numL((SubLObject)inference_analysis.TWO_INTEGER)) {
            return (SubLObject)inference_analysis.ZERO_INTEGER;
        }
        final SubLObject max = number_utilities.choose(n, (SubLObject)inference_analysis.TWO_INTEGER);
        SubLObject count = (SubLObject)inference_analysis.ZERO_INTEGER;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14 = rules;
            SubLObject other_rule = (SubLObject)inference_analysis.NIL;
            other_rule = cdolist_list_var_$14.first();
            while (inference_analysis.NIL != cdolist_list_var_$14) {
                if (!rule.eql(other_rule) && inference_analysis.NIL != rules_historically_connectedP(rule, other_rule)) {
                    count = Numbers.add(count, (SubLObject)inference_analysis.ONE_INTEGER);
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                other_rule = cdolist_list_var_$14.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        if (inference_analysis.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_analysis.NIL == Numbers.evenp(count)) {
            Errors.error((SubLObject)inference_analysis.$str77$Got_a_directed_instead_of_undirec, rules);
        }
        count = Numbers.integerDivide(count, (SubLObject)inference_analysis.TWO_INTEGER);
        return Numbers.divide(count, max);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 44912L)
    public static SubLObject rule_historical_connectedness_percentage(final SubLObject rules) {
        return Numbers.round(Numbers.multiply((SubLObject)inference_analysis.$int40$100, rule_historical_connectedness_ratio(rules)), (SubLObject)inference_analysis.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 45070L)
    public static SubLObject note_rules_historically_connected(final SubLObject from_rule, final SubLObject to_rule) {
        if (!from_rule.eql(to_rule)) {
            SubLObject release = (SubLObject)inference_analysis.NIL;
            try {
                release = Locks.seize_lock(inference_analysis.$transformation_rule_historical_connectivity_graph_lock$.getGlobalValue());
                SubLObject v_set_contents = historically_connected_rules_set_contents(from_rule);
                v_set_contents = set_contents.set_contents_add(to_rule, v_set_contents, Symbols.symbol_function((SubLObject)inference_analysis.EQL));
                set_historically_connected_rules_set_contents(from_rule, v_set_contents);
            }
            finally {
                if (inference_analysis.NIL != release) {
                    Locks.release_lock(inference_analysis.$transformation_rule_historical_connectivity_graph_lock$.getGlobalValue());
                }
            }
            return (SubLObject)inference_analysis.T;
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 45507L)
    public static SubLObject note_inference_answer_proof_rules(final SubLObject rules) {
        if (inference_analysis.NIL != list_utilities.lengthGE(rules, (SubLObject)inference_analysis.TWO_INTEGER, (SubLObject)inference_analysis.UNPROVIDED)) {
            SubLObject cdolist_list_var = rules;
            SubLObject rule = (SubLObject)inference_analysis.NIL;
            rule = cdolist_list_var.first();
            while (inference_analysis.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$15 = rules;
                SubLObject connected_rule = (SubLObject)inference_analysis.NIL;
                connected_rule = cdolist_list_var_$15.first();
                while (inference_analysis.NIL != cdolist_list_var_$15) {
                    if (!rule.eql(connected_rule)) {
                        note_rules_historically_connected(rule, connected_rule);
                    }
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    connected_rule = cdolist_list_var_$15.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            }
            return (SubLObject)inference_analysis.T;
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 45901L)
    public static SubLObject show_transformation_rule_historical_connectivity_graph(SubLObject stream) {
        if (stream == inference_analysis.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject rules = hash_table_utilities.hash_table_keys(inference_analysis.$transformation_rule_historical_connectivity_graph$.getGlobalValue());
        SubLObject cdolist_list_var;
        rules = (cdolist_list_var = Sort.sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), Symbols.symbol_function((SubLObject)inference_analysis.$sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY)));
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            SubLObject connected_rules = historically_connected_rules(rule);
            if (inference_analysis.NIL != connected_rules) {
                connected_rules = Sort.sort(connected_rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), Symbols.symbol_function((SubLObject)inference_analysis.$sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY));
                PrintLow.format(stream, (SubLObject)inference_analysis.$str78$____Rule_____S__Connected_Rules__, rule);
                SubLObject cdolist_list_var_$16 = connected_rules;
                SubLObject connected_rule = (SubLObject)inference_analysis.NIL;
                connected_rule = cdolist_list_var_$16.first();
                while (inference_analysis.NIL != cdolist_list_var_$16) {
                    PrintLow.format(stream, (SubLObject)inference_analysis.$str79$___S, connected_rule);
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    connected_rule = cdolist_list_var_$16.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 46563L)
    public static SubLObject cb_show_transformation_rule_historical_connectivity_graph() {
        SubLObject rules = hash_table_utilities.hash_table_keys(inference_analysis.$transformation_rule_historical_connectivity_graph$.getGlobalValue());
        SubLObject cdolist_list_var;
        rules = (cdolist_list_var = Sort.sort(rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), Symbols.symbol_function((SubLObject)inference_analysis.$sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY)));
        SubLObject rule = (SubLObject)inference_analysis.NIL;
        rule = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            SubLObject connected_rules = historically_connected_rules(rule);
            if (inference_analysis.NIL != connected_rules) {
                connected_rules = Sort.sort(connected_rules, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), Symbols.symbol_function((SubLObject)inference_analysis.$sym35$TRANSFORMATION_RULE_HISTORICAL_UTILITY));
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)inference_analysis.$str80$Rule__);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                cb_utilities.cb_form(rule, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
                html_utilities.html_newline((SubLObject)inference_analysis.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)inference_analysis.$str81$Connected_Rules__);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)inference_analysis.UNPROVIDED);
                SubLObject cdolist_list_var_$17 = connected_rules;
                SubLObject connected_rule = (SubLObject)inference_analysis.NIL;
                connected_rule = cdolist_list_var_$17.first();
                while (inference_analysis.NIL != cdolist_list_var_$17) {
                    cb_utilities.cb_form(connected_rule, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)inference_analysis.UNPROVIDED);
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    connected_rule = cdolist_list_var_$17.first();
                }
                html_utilities.html_newline((SubLObject)inference_analysis.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 47372L)
    public static SubLObject save_transformation_rule_historical_connectivity_graph(final SubLObject filename, SubLObject externalizedP) {
        if (externalizedP == inference_analysis.UNPROVIDED) {
            externalizedP = (SubLObject)inference_analysis.NIL;
        }
        if (inference_analysis.NIL != externalizedP) {
            return cfasl_utilities.cfasl_save_externalized(inference_analysis.$transformation_rule_historical_connectivity_graph$.getGlobalValue(), filename);
        }
        return cfasl_utilities.cfasl_save(inference_analysis.$transformation_rule_historical_connectivity_graph$.getGlobalValue(), filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 47704L)
    public static SubLObject load_transformation_rule_historical_connectivity_graph(final SubLObject filename) {
        inference_analysis.$transformation_rule_historical_connectivity_graph$.setGlobalValue(cfasl_utilities.cfasl_load(filename));
        return Hashtables.hash_table_size(inference_analysis.$transformation_rule_historical_connectivity_graph$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 48260L)
    public static SubLObject clear_hl_module_expand_counts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary(inference_analysis.$hl_module_expand_counts$.getDynamicValue(thread));
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 48370L)
    public static SubLObject noting_hl_module_expand_counts(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_analysis.$sym82$CLET, (SubLObject)inference_analysis.$list83, ConsesLow.append(body, (SubLObject)inference_analysis.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 48556L)
    public static SubLObject hl_module_expand_count(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup(inference_analysis.$hl_module_expand_counts$.getDynamicValue(thread), hl_module, (SubLObject)inference_analysis.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 48675L)
    public static SubLObject all_hl_module_expand_counts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module_expand_counts = dictionary_utilities.dictionary_to_alist(inference_analysis.$hl_module_expand_counts$.getDynamicValue(thread));
        return Sort.sort(hl_module_expand_counts, Symbols.symbol_function((SubLObject)inference_analysis.$sym27$_), Symbols.symbol_function((SubLObject)inference_analysis.$sym84$CDR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 48860L)
    public static SubLObject cinc_hl_module_expand_count(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_analysis.NIL != inference_analysis.$hl_module_expand_counts_enabledP$.getDynamicValue(thread)) {
            SubLObject count = dictionary.dictionary_lookup(inference_analysis.$hl_module_expand_counts$.getDynamicValue(thread), hl_module, (SubLObject)inference_analysis.ZERO_INTEGER);
            count = Numbers.add(count, (SubLObject)inference_analysis.ONE_INTEGER);
            dictionary.dictionary_enter(inference_analysis.$hl_module_expand_counts$.getDynamicValue(thread), hl_module, count);
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 49142L)
    public static SubLObject show_hl_module_expand_counts(SubLObject counts, SubLObject stream) {
        if (counts == inference_analysis.UNPROVIDED) {
            counts = all_hl_module_expand_counts();
        }
        if (stream == inference_analysis.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = counts;
        SubLObject hl_module_expand_count_info = (SubLObject)inference_analysis.NIL;
        hl_module_expand_count_info = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = hl_module_expand_count_info;
            SubLObject hl_module = (SubLObject)inference_analysis.NIL;
            SubLObject count = (SubLObject)inference_analysis.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_analysis.$list85);
            hl_module = current.first();
            current = (count = current.rest());
            PrintLow.format(stream, (SubLObject)inference_analysis.$str86$___4_D__S__, count, hl_module);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module_expand_count_info = cdolist_list_var.first();
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 49458L)
    public static SubLObject cinc_module_expand_count(final SubLObject name) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        return cinc_hl_module_expand_count(hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 50050L)
    public static SubLObject clear_asked_query_queue() {
        queues.clear_queue(inference_analysis.$asked_queries_queue$.getGlobalValue());
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 50144L)
    public static SubLObject possibly_enqueue_asked_query(final SubLObject query_sentence, final SubLObject query_mt, final SubLObject query_properties) {
        SubLObject result = (SubLObject)inference_analysis.NIL;
        if (inference_analysis.NIL != control_vars.save_asked_queriesP() && inference_analysis.NIL == operation_queues.within_a_remote_opP()) {
            result = enqueue_asked_query(query_sentence, query_mt, query_properties);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 50419L)
    public static SubLObject enqueue_asked_query(final SubLObject query_sentence, final SubLObject query_mt, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_info = (SubLObject)ConsesLow.list(query_sentence, query_mt, list_utilities.plist_except(query_properties, (SubLObject)inference_analysis.$list90));
        SubLObject release = (SubLObject)inference_analysis.NIL;
        try {
            release = Locks.seize_lock(inference_analysis.$save_recent_asked_queries_lock$.getDynamicValue(thread));
            queues.enqueue(query_info, inference_analysis.$asked_queries_queue$.getGlobalValue());
        }
        finally {
            if (inference_analysis.NIL != release) {
                Locks.release_lock(inference_analysis.$save_recent_asked_queries_lock$.getDynamicValue(thread));
            }
        }
        if (queues.queue_size(inference_analysis.$asked_queries_queue$.getGlobalValue()).numGE(inference_analysis.$asked_queries_queue_limit$.getGlobalValue())) {
            save_recent_asked_queries();
        }
        return query_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 50883L)
    public static SubLObject possibly_enqueue_asked_query_from_inference(final SubLObject inference) {
        SubLObject result = (SubLObject)inference_analysis.NIL;
        if (inference_analysis.NIL != control_vars.save_asked_queriesP() && inference_analysis.NIL == operation_queues.within_a_remote_opP()) {
            result = enqueue_asked_query_from_inference(inference);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 51126L)
    public static SubLObject enqueue_asked_query_from_inference(final SubLObject inference) {
        final SubLObject el_query_sentence = inference_datastructures_inference.inference_el_query(inference);
        final SubLObject query_sentence = (inference_analysis.NIL != el_query_sentence) ? el_query_sentence : inference_datastructures_inference.inference_hl_query(inference);
        final SubLObject query_mt = inference_datastructures_inference.inference_mt(inference);
        final SubLObject query_properties = inference_datastructures_inference.inference_input_query_properties(inference);
        return enqueue_asked_query(query_sentence, query_mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 51577L)
    public static SubLObject possibly_save_recent_asked_queries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((inference_analysis.NIL != Locks.lock_idle_p(inference_analysis.$save_recent_asked_queries_lock$.getDynamicValue(thread))) ? save_recent_asked_queries() : inference_analysis.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 51789L)
    public static SubLObject load_asked_queries(final SubLObject filename, SubLObject n) {
        if (n == inference_analysis.UNPROVIDED) {
            n = (SubLObject)inference_analysis.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_analysis.NIL == subl_promotions.positive_integer_p(n)) {
            n = number_utilities.positive_infinity();
        }
        SubLObject query_infos = (SubLObject)inference_analysis.NIL;
        SubLObject doneP = (SubLObject)inference_analysis.NIL;
        SubLObject done_varP = (SubLObject)inference_analysis.NIL;
        SubLObject i = (SubLObject)inference_analysis.ZERO_INTEGER;
        SubLObject stream = (SubLObject)inference_analysis.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)inference_analysis.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)inference_analysis.$kw45$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)inference_analysis.$str44$Unable_to_open__S, filename);
            }
            final SubLObject input_stream = stream;
            final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)inference_analysis.NIL, thread);
                cfasl.cfasl_set_common_symbols(asked_query_common_symbols());
                while (inference_analysis.NIL == done_varP) {
                    final SubLObject query_info = load_asked_query_from_stream(input_stream);
                    if (inference_analysis.$kw70$EOF == query_info) {
                        done_varP = (SubLObject)inference_analysis.T;
                    }
                    else if (query_info.isString()) {
                        Errors.warn((SubLObject)inference_analysis.$str91$Read_invalid_query_info__s, query_info);
                    }
                    else {
                        final SubLObject i_$18 = i;
                        if (inference_analysis.NIL != number_utilities.potentially_infinite_integer_GE(i_$18, n)) {
                            doneP = (SubLObject)inference_analysis.T;
                        }
                        if (inference_analysis.NIL == doneP) {
                            query_infos = (SubLObject)ConsesLow.cons(query_info, query_infos);
                        }
                        i = Numbers.add(i, (SubLObject)inference_analysis.ONE_INTEGER);
                    }
                    if (inference_analysis.NIL != doneP) {
                        done_varP = doneP;
                    }
                }
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)inference_analysis.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return Sequences.nreverse(query_infos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 52486L)
    public static SubLObject query_info_p(final SubLObject v_object) {
        if (inference_analysis.NIL != list_utilities.tripleP(v_object)) {
            SubLObject sentence = (SubLObject)inference_analysis.NIL;
            SubLObject mt = (SubLObject)inference_analysis.NIL;
            SubLObject query_properties = (SubLObject)inference_analysis.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)inference_analysis.$list92);
            sentence = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)inference_analysis.$list92);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)inference_analysis.$list92);
            query_properties = current.first();
            current = current.rest();
            if (inference_analysis.NIL == current) {
                return (SubLObject)SubLObjectFactory.makeBoolean(inference_analysis.NIL != el_utilities.possibly_cycl_sentence_p(sentence) && (inference_analysis.NIL == mt || inference_analysis.NIL != hlmt.possibly_mt_p(mt)) && inference_analysis.NIL != list_utilities.property_list_p(query_properties));
            }
            cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)inference_analysis.$list92);
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 52755L)
    public static SubLObject valid_query_infoP(final SubLObject v_object) {
        if (inference_analysis.NIL != query_info_p(v_object) && inference_analysis.NIL == list_utilities.tree_find(cfasl_kb_methods.cfasl_invalid_constant(), v_object, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED) && inference_analysis.NIL == list_utilities.tree_find(cfasl_kb_methods.cfasl_invalid_nart(), v_object, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED)) {
            SubLObject sentence = (SubLObject)inference_analysis.NIL;
            SubLObject mt = (SubLObject)inference_analysis.NIL;
            SubLObject query_properties = (SubLObject)inference_analysis.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)inference_analysis.$list92);
            sentence = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)inference_analysis.$list92);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)inference_analysis.$list92);
            query_properties = current.first();
            current = current.rest();
            if (inference_analysis.NIL == current) {
                if ((inference_analysis.NIL != clauses.dnf_clauses_p(sentence) || inference_analysis.NIL != cycl_grammar.cycl_sentence_p(sentence)) && (inference_analysis.NIL == mt || inference_analysis.NIL != hlmt.hlmt_p(mt)) && inference_analysis.NIL != inference_datastructures_enumerated_types.query_properties_p(query_properties)) {
                    return (SubLObject)inference_analysis.T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)inference_analysis.$list92);
            }
        }
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 53180L)
    public static SubLObject load_asked_query(final SubLObject filename) {
        return load_asked_queries(filename, (SubLObject)inference_analysis.ONE_INTEGER).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 53273L)
    public static SubLObject save_recent_asked_queries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject any_savedP = (SubLObject)inference_analysis.NIL;
        if (inference_analysis.NIL != any_recent_asked_queriesP()) {
            SubLObject release = (SubLObject)inference_analysis.NIL;
            try {
                release = Locks.seize_lock(inference_analysis.$save_recent_asked_queries_lock$.getDynamicValue(thread));
                any_savedP = save_recent_asked_queries_int();
            }
            finally {
                if (inference_analysis.NIL != release) {
                    Locks.release_lock(inference_analysis.$save_recent_asked_queries_lock$.getDynamicValue(thread));
                }
            }
        }
        return any_savedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 53515L)
    public static SubLObject any_recent_asked_queriesP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_analysis.NIL == queues.queue_empty_p(inference_analysis.$asked_queries_queue$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 53617L)
    public static SubLObject local_asked_queries_transcript() {
        return string_utilities.replace_substring(string_utilities.replace_substring(transcript_utilities.construct_transcript_filename(transcript_utilities.make_local_transcript_filename((SubLObject)inference_analysis.$str93$asked_queries)), (SubLObject)inference_analysis.$str52$_TS, (SubLObject)inference_analysis.$str53$_CFASL), (SubLObject)inference_analysis.$str54$_ts, (SubLObject)inference_analysis.$str55$_cfasl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 53836L)
    public static SubLObject save_recent_asked_queries_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)inference_analysis.NIL;
        SubLObject error = (SubLObject)inference_analysis.NIL;
        SubLObject local_asked_queries_transcript = (SubLObject)inference_analysis.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)inference_analysis.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    local_asked_queries_transcript = local_asked_queries_transcript();
                    if (inference_analysis.NIL != local_asked_queries_transcript) {
                        successP = save_recent_asked_queries_to_file(local_asked_queries_transcript);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)inference_analysis.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_analysis.NIL != successP && inference_analysis.NIL == error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 54238L)
    public static SubLObject save_recent_asked_queries_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)inference_analysis.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)inference_analysis.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)inference_analysis.$kw94$APPEND);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)inference_analysis.$str44$Unable_to_open__S, filename);
            }
            final SubLObject stream_$19 = stream;
            for (SubLObject q = inference_analysis.$asked_queries_queue$.getGlobalValue(), done_var = queues.queue_empty_p(q); inference_analysis.NIL == done_var; done_var = queues.queue_empty_p(q)) {
                final SubLObject query = queues.dequeue(q);
                write_asked_query_to_stream(stream_$19, query, (SubLObject)inference_analysis.T);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)inference_analysis.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)inference_analysis.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 54472L)
    public static SubLObject write_asked_query_to_stream(final SubLObject stream, final SubLObject query_info, final SubLObject externalizedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)inference_analysis.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(asked_query_common_symbols_simple());
            cfasl.cfasl_output_maybe_externalized(query_info, stream, externalizedP);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return query_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 54716L)
    public static SubLObject load_asked_query_from_stream(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_info = (SubLObject)inference_analysis.NIL;
        SubLObject error = (SubLObject)inference_analysis.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)inference_analysis.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    query_info = cfasl.cfasl_input(stream, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.UNPROVIDED);
                    if (inference_analysis.$kw70$EOF != query_info && !inference_analysis.assertionsDisabledInClass && inference_analysis.NIL == query_info_p(query_info)) {
                        throw new AssertionError(query_info);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)inference_analysis.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (inference_analysis.NIL != error) {
            query_info = error;
        }
        return query_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 55148L)
    public static SubLObject asked_queries_filenameP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && inference_analysis.NIL != string_utilities.ends_with(v_object, (SubLObject)inference_analysis.$str98$local_asked_queries_cfasl, (SubLObject)inference_analysis.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 55384L)
    public static SubLObject asked_query_common_symbols() {
        if (inference_analysis.NIL == inference_analysis.$asked_query_common_symbols$.getGlobalValue()) {
            inference_analysis.$asked_query_common_symbols$.setGlobalValue(inference_datastructures_enumerated_types.all_query_properties());
        }
        return inference_analysis.$asked_query_common_symbols$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 55710L)
    public static SubLObject asked_query_common_symbols_simple() {
        if (!inference_analysis.$asked_query_common_symbols_simple$.getGlobalValue().isVector()) {
            inference_analysis.$asked_query_common_symbols_simple$.setGlobalValue(Functions.apply((SubLObject)inference_analysis.$sym101$VECTOR, asked_query_common_symbols()));
        }
        return inference_analysis.$asked_query_common_symbols_simple$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 55973L)
    public static SubLObject show_asked_query_statistics(final SubLObject directories) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject directory_stats = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_analysis.EQUAL), (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject filename_stats = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_analysis.EQUAL), (SubLObject)inference_analysis.UNPROVIDED);
        final SubLObject query_info_stats = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_analysis.EQUAL), (SubLObject)inference_analysis.UNPROVIDED);
        SubLObject dot_count = (SubLObject)inference_analysis.ZERO_INTEGER;
        SubLObject cdolist_list_var = directories;
        SubLObject directory = (SubLObject)inference_analysis.NIL;
        directory = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            format_nil.force_format((SubLObject)inference_analysis.T, (SubLObject)inference_analysis.$str102$Entering__s__, directory, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
            assert inference_analysis.NIL != Filesys.directory_p(directory) : directory;
            SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)inference_analysis.T);
            final SubLObject progress_message_var = (SubLObject)inference_analysis.NIL;
            final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
                if (inference_analysis.NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)inference_analysis.NIL, (SubLObject)inference_analysis.UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$20 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((inference_analysis.NIL != progress_message_var) ? progress_message_var : inference_analysis.$str59$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)inference_analysis.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)inference_analysis.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)inference_analysis.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)inference_analysis.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject filename = (SubLObject)inference_analysis.NIL;
                        filename = csome_list_var.first();
                        while (inference_analysis.NIL != csome_list_var) {
                            if (inference_analysis.NIL != asked_queries_filenameP(filename)) {
                                SubLObject done_varP = (SubLObject)inference_analysis.NIL;
                                SubLObject i = (SubLObject)inference_analysis.ZERO_INTEGER;
                                SubLObject stream = (SubLObject)inference_analysis.NIL;
                                try {
                                    final SubLObject _prev_bind_0_$21 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind((SubLObject)inference_analysis.NIL, thread);
                                        stream = compatibility.open_binary(filename, (SubLObject)inference_analysis.$kw45$INPUT);
                                    }
                                    finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$21, thread);
                                    }
                                    if (!stream.isStream()) {
                                        Errors.error((SubLObject)inference_analysis.$str44$Unable_to_open__S, filename);
                                    }
                                    final SubLObject input_stream = stream;
                                    final SubLObject _prev_bind_0_$22 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                                    try {
                                        cfasl.$cfasl_common_symbols$.bind((SubLObject)inference_analysis.NIL, thread);
                                        cfasl.cfasl_set_common_symbols(asked_query_common_symbols());
                                        while (inference_analysis.NIL == done_varP) {
                                            final SubLObject query_info = load_asked_query_from_stream(input_stream);
                                            if (inference_analysis.$kw70$EOF == query_info) {
                                                done_varP = (SubLObject)inference_analysis.T;
                                            }
                                            else if (query_info.isString()) {
                                                Errors.warn((SubLObject)inference_analysis.$str91$Read_invalid_query_info__s, query_info);
                                            }
                                            else {
                                                dot_count = Numbers.add(dot_count, (SubLObject)inference_analysis.ONE_INTEGER);
                                                if (dot_count.numE((SubLObject)inference_analysis.$int103$1000)) {
                                                    format_nil.force_format((SubLObject)inference_analysis.T, (SubLObject)inference_analysis.$str104$_, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
                                                    dot_count = (SubLObject)inference_analysis.ZERO_INTEGER;
                                                }
                                                dictionary_utilities.dictionary_increment(directory_stats, directory, (SubLObject)inference_analysis.UNPROVIDED);
                                                dictionary_utilities.dictionary_increment(filename_stats, filename, (SubLObject)inference_analysis.UNPROVIDED);
                                                dictionary_utilities.dictionary_increment(query_info_stats, query_info, (SubLObject)inference_analysis.UNPROVIDED);
                                                i = Numbers.add(i, (SubLObject)inference_analysis.ONE_INTEGER);
                                            }
                                        }
                                    }
                                    finally {
                                        cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$22, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (stream.isStream()) {
                                            streams_high.close(stream, (SubLObject)inference_analysis.UNPROVIDED);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                    }
                                }
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)inference_analysis.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            filename = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_analysis.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
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
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$20, thread);
                }
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
            }
            show_asked_query_statistics_int(directory_stats, filename_stats, query_info_stats);
            cdolist_list_var = cdolist_list_var.rest();
            directory = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(directory_stats, filename_stats, query_info_stats);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 56776L)
    public static SubLObject show_asked_query_statistics_int(final SubLObject directory_stats, final SubLObject filename_stats, final SubLObject query_info_stats) {
        format_nil.force_format((SubLObject)inference_analysis.T, (SubLObject)inference_analysis.$str105$__Number_of_saved_queries_per_dir, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        dictionary_utilities.print_dictionary_contents(directory_stats, (SubLObject)inference_analysis.UNPROVIDED);
        format_nil.force_format((SubLObject)inference_analysis.T, (SubLObject)inference_analysis.$str106$__Histogram_of_saved_queries_per_, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        list_utilities.pretty_print_histogram(list_utilities.histogram(dictionary.dictionary_values(filename_stats), Symbols.symbol_function((SubLObject)inference_analysis.$sym31$_), Symbols.symbol_function((SubLObject)inference_analysis.EQL), Symbols.symbol_function((SubLObject)inference_analysis.$sym31$_)));
        format_nil.force_format((SubLObject)inference_analysis.T, (SubLObject)inference_analysis.$str107$__Total_number_of_saved_queries__, number_utilities.summation(dictionary.dictionary_values(query_info_stats)), (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        format_nil.force_format((SubLObject)inference_analysis.T, (SubLObject)inference_analysis.$str108$__Total_number_of_unique_saved_qu, dictionary.dictionary_length(query_info_stats), (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        return (SubLObject)inference_analysis.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 60323L)
    public static SubLObject mts_of_inference_answer(final SubLObject v_answer) {
        SubLObject mts = (SubLObject)inference_analysis.NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = (SubLObject)inference_analysis.NIL;
        justification = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$25 = mts_of_inference_answer_justification(justification);
            SubLObject mt = (SubLObject)inference_analysis.NIL;
            mt = cdolist_list_var_$25.first();
            while (inference_analysis.NIL != cdolist_list_var_$25) {
                final SubLObject item_var = mt;
                if (inference_analysis.NIL == conses_high.member(item_var, mts, (SubLObject)inference_analysis.EQUAL, Symbols.symbol_function((SubLObject)inference_analysis.IDENTITY))) {
                    mts = (SubLObject)ConsesLow.cons(item_var, mts);
                }
                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                mt = cdolist_list_var_$25.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return Sort.sort(mts, (SubLObject)inference_analysis.$sym109$GENERALITY_ESTIMATE_, (SubLObject)inference_analysis.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 60842L)
    public static SubLObject mts_of_inference_answer_justification(final SubLObject justification) {
        final SubLObject supports = ConsesLow.append(inference_datastructures_inference.inference_answer_justification_supports(justification), inference_datastructures_inference.inference_answer_justification_pragmatic_supports(justification));
        SubLObject mts = (SubLObject)inference_analysis.NIL;
        SubLObject cdolist_list_var = Mapping.mapcar((SubLObject)inference_analysis.$sym110$SUPPORT_MT, supports);
        SubLObject mt = (SubLObject)inference_analysis.NIL;
        mt = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            final SubLObject item_var = mt;
            if (inference_analysis.NIL == conses_high.member(item_var, mts, (SubLObject)inference_analysis.EQUAL, Symbols.symbol_function((SubLObject)inference_analysis.IDENTITY))) {
                mts = (SubLObject)ConsesLow.cons(item_var, mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        mts = Sequences.remove(inference_analysis.$const111$InferencePSC, mts, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 61311L)
    public static SubLObject max_floor_mts_of_inference(final SubLObject inference, SubLObject preserve_multiple_justificationsP) {
        if (preserve_multiple_justificationsP == inference_analysis.UNPROVIDED) {
            preserve_multiple_justificationsP = (SubLObject)inference_analysis.NIL;
        }
        SubLObject mt_tuples = (SubLObject)inference_analysis.NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (inference_analysis.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_analysis.$kw112$SKIP)) {
            final SubLObject idx_$26 = idx;
            if (inference_analysis.NIL == id_index.id_index_dense_objects_empty_p(idx_$26, (SubLObject)inference_analysis.$kw112$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$26);
                final SubLObject backwardP_var = (SubLObject)inference_analysis.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                SubLObject item_var;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_analysis.NIL, v_iteration = (SubLObject)inference_analysis.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_analysis.ONE_INTEGER)) {
                    id = ((inference_analysis.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_analysis.ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (inference_analysis.NIL == id_index.id_index_tombstone_p(v_answer) || inference_analysis.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_analysis.$kw112$SKIP)) {
                        if (inference_analysis.NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = (SubLObject)inference_analysis.$kw112$SKIP;
                        }
                        item_var = max_floor_mts_of_inference_answer(v_answer, preserve_multiple_justificationsP);
                        if (inference_analysis.NIL == conses_high.member(item_var, mt_tuples, Symbols.symbol_function((SubLObject)inference_analysis.EQUAL), Symbols.symbol_function((SubLObject)inference_analysis.IDENTITY))) {
                            mt_tuples = (SubLObject)ConsesLow.cons(item_var, mt_tuples);
                        }
                    }
                }
            }
            final SubLObject idx_$27 = idx;
            if (inference_analysis.NIL == id_index.id_index_sparse_objects_empty_p(idx_$27)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$27);
                SubLObject id2 = (SubLObject)inference_analysis.NIL;
                SubLObject v_answer2 = (SubLObject)inference_analysis.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        final SubLObject item_var2 = max_floor_mts_of_inference_answer(v_answer2, preserve_multiple_justificationsP);
                        if (inference_analysis.NIL == conses_high.member(item_var2, mt_tuples, Symbols.symbol_function((SubLObject)inference_analysis.EQUAL), Symbols.symbol_function((SubLObject)inference_analysis.IDENTITY))) {
                            mt_tuples = (SubLObject)ConsesLow.cons(item_var2, mt_tuples);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return conjoin_mt_tuples(mt_tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 61726L)
    public static SubLObject max_floor_mts_of_inference_answer(final SubLObject v_answer, SubLObject preserve_multiple_justificationsP) {
        if (preserve_multiple_justificationsP == inference_analysis.UNPROVIDED) {
            preserve_multiple_justificationsP = (SubLObject)inference_analysis.NIL;
        }
        SubLObject mt_tuples = (SubLObject)inference_analysis.NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = (SubLObject)inference_analysis.NIL;
        justification = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            final SubLObject item_var = max_floor_mts_of_inference_answer_justification(justification);
            if (inference_analysis.NIL == conses_high.member(item_var, mt_tuples, Symbols.symbol_function((SubLObject)inference_analysis.EQUAL), Symbols.symbol_function((SubLObject)inference_analysis.IDENTITY))) {
                mt_tuples = (SubLObject)ConsesLow.cons(item_var, mt_tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        if (inference_analysis.NIL != preserve_multiple_justificationsP) {
            return conjoin_mt_tuples(mt_tuples);
        }
        return disjoin_mt_tuples(mt_tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 62139L)
    public static SubLObject conjoin_mt_tuples(final SubLObject mt_tuples) {
        SubLObject mts = (SubLObject)inference_analysis.NIL;
        if (inference_analysis.NIL != list_utilities.singletonP(mt_tuples)) {
            mts = mt_tuples.first();
        }
        else if (inference_analysis.NIL != list_utilities.every_in_list((SubLObject)inference_analysis.$sym113$SINGLETON_, mt_tuples, (SubLObject)inference_analysis.UNPROVIDED)) {
            final SubLObject justification_mts = Mapping.mapcar((SubLObject)inference_analysis.$sym114$FIRST, mt_tuples);
            mts = genl_mts.max_floor_mts(justification_mts, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        }
        else {
            final SubLObject singletons = list_utilities.flatten(list_utilities.remove_if_not((SubLObject)inference_analysis.$sym113$SINGLETON_, mt_tuples, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED));
            final SubLObject max_floor_mts_of_singletons = genl_mts.max_floor_mts(singletons, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
            final SubLObject remaining_tuples = Sequences.remove_if((SubLObject)inference_analysis.$sym113$SINGLETON_, mt_tuples, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
            SubLObject unsubsumed_tuples = (SubLObject)inference_analysis.NIL;
            if (inference_analysis.NIL == list_utilities.singletonP(max_floor_mts_of_singletons)) {
                Errors.warn((SubLObject)inference_analysis.$str115$non_singleton_max_floor_mts_of_si, max_floor_mts_of_singletons, singletons);
                return (SubLObject)inference_analysis.NIL;
            }
            final SubLObject max_floor_of_singletons = max_floor_mts_of_singletons.first();
            SubLObject cdolist_list_var = remaining_tuples;
            SubLObject tuple = (SubLObject)inference_analysis.NIL;
            tuple = cdolist_list_var.first();
            while (inference_analysis.NIL != cdolist_list_var) {
                SubLObject unsubsumed_tuple = (SubLObject)inference_analysis.NIL;
                SubLObject cdolist_list_var_$28 = tuple;
                SubLObject mt = (SubLObject)inference_analysis.NIL;
                mt = cdolist_list_var_$28.first();
                while (inference_analysis.NIL != cdolist_list_var_$28) {
                    if (inference_analysis.NIL == genl_mts.genl_mtP(max_floor_of_singletons, mt, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED)) {
                        unsubsumed_tuple = (SubLObject)ConsesLow.cons(mt, unsubsumed_tuple);
                    }
                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                    mt = cdolist_list_var_$28.first();
                }
                final SubLObject var = unsubsumed_tuple;
                if (inference_analysis.NIL != var) {
                    unsubsumed_tuples = (SubLObject)ConsesLow.cons(var, unsubsumed_tuples);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tuple = cdolist_list_var.first();
            }
            if (inference_analysis.NIL == unsubsumed_tuples) {
                return max_floor_of_singletons;
            }
            Errors.warn((SubLObject)inference_analysis.$str116$multiple_justifications___s__S, max_floor_of_singletons, unsubsumed_tuples);
            return (SubLObject)inference_analysis.NIL;
        }
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 63451L)
    public static SubLObject disjoin_mt_tuples(final SubLObject mt_tuples) {
        return genl_mts.max_mts(Functions.apply((SubLObject)inference_analysis.$sym117$APPEND, mt_tuples), (SubLObject)inference_analysis.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 63609L)
    public static SubLObject max_floor_mts_of_inference_answer_justification(final SubLObject justification) {
        SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
        supports = cycl_utilities.expression_subst(inference_analysis.$const111$InferencePSC, inference_analysis.$const118$EverythingPSC, supports, (SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED);
        return max_floor_mts_of_supports(supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 63990L)
    public static SubLObject max_floor_mts_of_supports(final SubLObject supports) {
        SubLObject mts = (SubLObject)inference_analysis.NIL;
        SubLObject cdolist_list_var;
        final SubLObject mt_support_combinations = cdolist_list_var = forward.compute_all_mt_and_support_combinations(supports, (SubLObject)inference_analysis.UNPROVIDED);
        SubLObject mt_support_combination = (SubLObject)inference_analysis.NIL;
        mt_support_combination = cdolist_list_var.first();
        while (inference_analysis.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = mt_support_combination;
            SubLObject concluded_mts = (SubLObject)inference_analysis.NIL;
            SubLObject support_combination = (SubLObject)inference_analysis.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_analysis.$list119);
            concluded_mts = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_analysis.$list119);
            support_combination = current.first();
            current = current.rest();
            if (inference_analysis.NIL == current) {
                SubLObject cdolist_list_var_$29 = concluded_mts;
                SubLObject concluded_mt = (SubLObject)inference_analysis.NIL;
                concluded_mt = cdolist_list_var_$29.first();
                while (inference_analysis.NIL != cdolist_list_var_$29) {
                    final SubLObject item_var = concluded_mt;
                    if (inference_analysis.NIL == conses_high.member(item_var, mts, Symbols.symbol_function((SubLObject)inference_analysis.$sym120$HLMT_EQUAL_), Symbols.symbol_function((SubLObject)inference_analysis.IDENTITY))) {
                        mts = (SubLObject)ConsesLow.cons(item_var, mts);
                    }
                    cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                    concluded_mt = cdolist_list_var_$29.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_analysis.$list119);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_support_combination = cdolist_list_var.first();
        }
        return Sequences.nreverse(mts);
    }
    
    public static SubLObject declare_inference_analysis_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "problem_store_estimated_problem_reuses_count", "PROBLEM-STORE-ESTIMATED-PROBLEM-REUSES-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "problem_store_estimated_reuse_ratio", "PROBLEM-STORE-ESTIMATED-REUSE-RATIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clear_transformation_rule_statistics_filename_load_history", "CLEAR-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clear_transformation_rule_statistics_received_filename_load_history", "CLEAR-TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "add_to_transformation_rule_statistics_filename_load_history", "ADD-TO-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_statistics_filename_load_history", "TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_statistics_received_filename_load_history", "TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_statistics_update_enabledP", "TRANSFORMATION-RULE-STATISTICS-UPDATE-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "enable_transformation_rule_statistics_update", "ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "disable_transformation_rule_statistics_update", "DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "do_transformation_rules_with_statistics", "DO-TRANSFORMATION-RULES-WITH-STATISTICS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_statistics_table", "TRANSFORMATION-RULE-STATISTICS-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_with_statistics_helper", "TRANSFORMATION-RULES-WITH-STATISTICS-HELPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_with_statistics_condition_passesP", "TRANSFORMATION-RULES-WITH-STATISTICS-CONDITION-PASSES?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "new_transformation_rule_statistics", "NEW-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clear_all_transformation_rule_statistics", "CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clear_transformation_rule_statistics", "CLEAR-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_with_statistics_count", "TRANSFORMATION-RULES-WITH-STATISTICS-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "get_transformation_rule_statistics", "GET-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "ensure_transformation_rule_statistics", "ENSURE-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_with_statistics", "TRANSFORMATION-RULES-WITH-STATISTICS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_with_recent_statistics", "TRANSFORMATION-RULES-WITH-RECENT-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_with_received_statistics", "TRANSFORMATION-RULES-WITH-RECEIVED-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_with_recent_statistics_count", "TRANSFORMATION-RULES-WITH-RECENT-STATISTICS-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_with_received_statistics_count", "TRANSFORMATION-RULES-WITH-RECEIVED-STATISTICS-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "any_recent_experienceP", "ANY-RECENT-EXPERIENCE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "any_received_experienceP", "ANY-RECEIVED-EXPERIENCE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "total_transformation_rule_considered_count", "TOTAL-TRANSFORMATION-RULE-CONSIDERED-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "total_transformation_rule_recent_considered_count", "TOTAL-TRANSFORMATION-RULE-RECENT-CONSIDERED-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "total_transformation_rule_received_considered_count", "TOTAL-TRANSFORMATION-RULE-RECEIVED-CONSIDERED-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_considered_count", "TRANSFORMATION-RULE-CONSIDERED-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_recent_considered_count", "TRANSFORMATION-RULE-RECENT-CONSIDERED-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_received_considered_count", "TRANSFORMATION-RULE-RECEIVED-CONSIDERED-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_has_recent_statisticsP", "TRANSFORMATION-RULE-HAS-RECENT-STATISTICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_has_received_statisticsP", "TRANSFORMATION-RULE-HAS-RECEIVED-STATISTICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "total_transformation_rule_success_count", "TOTAL-TRANSFORMATION-RULE-SUCCESS-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "total_transformation_rule_recent_success_count", "TOTAL-TRANSFORMATION-RULE-RECENT-SUCCESS-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "total_transformation_rule_received_success_count", "TOTAL-TRANSFORMATION-RULE-RECEIVED-SUCCESS-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_success_count", "TRANSFORMATION-RULE-SUCCESS-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_recent_success_count", "TRANSFORMATION-RULE-RECENT-SUCCESS-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_received_success_count", "TRANSFORMATION-RULE-RECEIVED-SUCCESS-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_success_probability", "TRANSFORMATION-RULE-SUCCESS-PROBABILITY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "increment_transformation_rule_considered_count", "INCREMENT-TRANSFORMATION-RULE-CONSIDERED-COUNT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "increment_transformation_rule_success_count", "INCREMENT-TRANSFORMATION-RULE-SUCCESS-COUNT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clear_all_recent_transformation_rule_statistics", "CLEAR-ALL-RECENT-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clear_all_received_transformation_rule_statistics", "CLEAR-ALL-RECEIVED-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clear_transformation_rule_recent_counts", "CLEAR-TRANSFORMATION-RULE-RECENT-COUNTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clear_transformation_rule_received_counts", "CLEAR-TRANSFORMATION-RULE-RECEIVED-COUNTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clean_transformation_rule_statistics", "CLEAN-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "rule_utility_p", "RULE-UTILITY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_has_insufficient_historical_utilityP", "TRANSFORMATION-RULE-HAS-INSUFFICIENT-HISTORICAL-UTILITY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "rule_historical_utility_success_threshold", "RULE-HISTORICAL-UTILITY-SUCCESS-THRESHOLD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "rule_historical_utility_saved_considerations", "RULE-HISTORICAL-UTILITY-SAVED-CONSIDERATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_considered_with_success", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_considered_with_no_success", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_considered_with_success_from_mt", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS-FROM-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_considered_with_no_success_from_mt", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-FROM-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_considered_with_no_success_not_in_mts", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-NOT-IN-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_mts_considered_with_success", "TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-SUCCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_mts_considered_with_no_success", "TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_considered_with_success_proving_predicate", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS-PROVING-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rules_considered_with_no_success_proving_predicate", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-PROVING-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_predicates_considered_with_success", "TRANSFORMATION-RULE-PREDICATES-CONSIDERED-WITH-SUCCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_predicates_considered_with_no_success", "TRANSFORMATION-RULE-PREDICATES-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "reinforce_transformation_rule", "REINFORCE-TRANSFORMATION-RULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "reinforce_inference_transformation_rules_in_answers", "REINFORCE-INFERENCE-TRANSFORMATION-RULES-IN-ANSWERS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "reinforce_inference_transformation_rules", "REINFORCE-INFERENCE-TRANSFORMATION-RULES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "save_transformation_rule_statistics", "SAVE-TRANSFORMATION-RULE-STATISTICS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_transformation_rule_statistics", "LOAD-TRANSFORMATION-RULE-STATISTICS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_transformation_rule_statistics_except_for_rules", "LOAD-TRANSFORMATION-RULE-STATISTICS-EXCEPT-FOR-RULES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_transformation_rule_statistics_int", "LOAD-TRANSFORMATION-RULE-STATISTICS-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_transformation_rule_statistics_bookkeeping", "LOAD-TRANSFORMATION-RULE-STATISTICS-BOOKKEEPING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "save_recent_transformation_rule_statistics", "SAVE-RECENT-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "save_received_experience", "SAVE-RECEIVED-EXPERIENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "save_transformation_rule_statistics_for_rule", "SAVE-TRANSFORMATION-RULE-STATISTICS-FOR-RULE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_something_considered_count", "TRANSFORMATION-RULE-SOMETHING-CONSIDERED-COUNT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_something_success_count", "TRANSFORMATION-RULE-SOMETHING-SUCCESS-COUNT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_transformation_rule_statistics_for_rule", "LOAD-TRANSFORMATION-RULE-STATISTICS-FOR-RULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "show_transformation_rule_statistics", "SHOW-TRANSFORMATION-RULE-STATISTICS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "possibly_save_recent_experience", "POSSIBLY-SAVE-RECENT-EXPERIENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "save_recent_experience", "SAVE-RECENT-EXPERIENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "local_experience_transcript", "LOCAL-EXPERIENCE-TRANSCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "save_recent_experience_internal", "SAVE-RECENT-EXPERIENCE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "replace_and_collate_experience", "REPLACE-AND-COLLATE-EXPERIENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "collate_experience", "COLLATE-EXPERIENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "receive_experience", "RECEIVE-EXPERIENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_received_experience", "LOAD-RECEIVED-EXPERIENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_all_experience_transcripts_from_directory", "LOAD-ALL-EXPERIENCE-TRANSCRIPTS-FROM-DIRECTORY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_utility_experience_filenameP", "TRANSFORMATION-RULE-UTILITY-EXPERIENCE-FILENAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_experience_transcript", "LOAD-EXPERIENCE-TRANSCRIPT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_historical_utility", "TRANSFORMATION-RULE-HISTORICAL-UTILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "transformation_rule_historical_utility_G", "TRANSFORMATION-RULE-HISTORICAL-UTILITY->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "current_average_rule_historical_success_probability", "CURRENT-AVERAGE-RULE-HISTORICAL-SUCCESS-PROBABILITY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "rule_historical_utility_from_observations", "RULE-HISTORICAL-UTILITY-FROM-OBSERVATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "historical_utility_from_observations", "HISTORICAL-UTILITY-FROM-OBSERVATIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "repair_all_experience_files_in_directory", "REPAIR-ALL-EXPERIENCE-FILES-IN-DIRECTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "repair_experience_file", "REPAIR-EXPERIENCE-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_transformation_rule_statistics_ignoring_header", "LOAD-TRANSFORMATION-RULE-STATISTICS-IGNORING-HEADER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "possibly_extend_transformation_rule_utility_table", "POSSIBLY-EXTEND-TRANSFORMATION-RULE-UTILITY-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "rule_utility_table_uses_new_formatP", "RULE-UTILITY-TABLE-USES-NEW-FORMAT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "historically_connected_rules_set_contents", "HISTORICALLY-CONNECTED-RULES-SET-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "set_historically_connected_rules_set_contents", "SET-HISTORICALLY-CONNECTED-RULES-SET-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "rules_historically_connectedP", "RULES-HISTORICALLY-CONNECTED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "historically_connected_rules", "HISTORICALLY-CONNECTED-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "rule_historical_connectedness_ratio", "RULE-HISTORICAL-CONNECTEDNESS-RATIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "rule_historical_connectedness_percentage", "RULE-HISTORICAL-CONNECTEDNESS-PERCENTAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "note_rules_historically_connected", "NOTE-RULES-HISTORICALLY-CONNECTED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "note_inference_answer_proof_rules", "NOTE-INFERENCE-ANSWER-PROOF-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "show_transformation_rule_historical_connectivity_graph", "SHOW-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "cb_show_transformation_rule_historical_connectivity_graph", "CB-SHOW-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "save_transformation_rule_historical_connectivity_graph", "SAVE-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_transformation_rule_historical_connectivity_graph", "LOAD-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clear_hl_module_expand_counts", "CLEAR-HL-MODULE-EXPAND-COUNTS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "noting_hl_module_expand_counts", "NOTING-HL-MODULE-EXPAND-COUNTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "hl_module_expand_count", "HL-MODULE-EXPAND-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "all_hl_module_expand_counts", "ALL-HL-MODULE-EXPAND-COUNTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "cinc_hl_module_expand_count", "CINC-HL-MODULE-EXPAND-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "show_hl_module_expand_counts", "SHOW-HL-MODULE-EXPAND-COUNTS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "cinc_module_expand_count", "CINC-MODULE-EXPAND-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "clear_asked_query_queue", "CLEAR-ASKED-QUERY-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "possibly_enqueue_asked_query", "POSSIBLY-ENQUEUE-ASKED-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "enqueue_asked_query", "ENQUEUE-ASKED-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "possibly_enqueue_asked_query_from_inference", "POSSIBLY-ENQUEUE-ASKED-QUERY-FROM-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "enqueue_asked_query_from_inference", "ENQUEUE-ASKED-QUERY-FROM-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "possibly_save_recent_asked_queries", "POSSIBLY-SAVE-RECENT-ASKED-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_asked_queries", "LOAD-ASKED-QUERIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "query_info_p", "QUERY-INFO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "valid_query_infoP", "VALID-QUERY-INFO?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_asked_query", "LOAD-ASKED-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "save_recent_asked_queries", "SAVE-RECENT-ASKED-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "any_recent_asked_queriesP", "ANY-RECENT-ASKED-QUERIES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "local_asked_queries_transcript", "LOCAL-ASKED-QUERIES-TRANSCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "save_recent_asked_queries_int", "SAVE-RECENT-ASKED-QUERIES-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "save_recent_asked_queries_to_file", "SAVE-RECENT-ASKED-QUERIES-TO-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "write_asked_query_to_stream", "WRITE-ASKED-QUERY-TO-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "load_asked_query_from_stream", "LOAD-ASKED-QUERY-FROM-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "asked_queries_filenameP", "ASKED-QUERIES-FILENAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "asked_query_common_symbols", "ASKED-QUERY-COMMON-SYMBOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "asked_query_common_symbols_simple", "ASKED-QUERY-COMMON-SYMBOLS-SIMPLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "show_asked_query_statistics", "SHOW-ASKED-QUERY-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "show_asked_query_statistics_int", "SHOW-ASKED-QUERY-STATISTICS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "mts_of_inference_answer", "MTS-OF-INFERENCE-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "mts_of_inference_answer_justification", "MTS-OF-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "max_floor_mts_of_inference", "MAX-FLOOR-MTS-OF-INFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "max_floor_mts_of_inference_answer", "MAX-FLOOR-MTS-OF-INFERENCE-ANSWER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "conjoin_mt_tuples", "CONJOIN-MT-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "disjoin_mt_tuples", "DISJOIN-MT-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "max_floor_mts_of_inference_answer_justification", "MAX-FLOOR-MTS-OF-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_analysis", "max_floor_mts_of_supports", "MAX-FLOOR-MTS-OF-SUPPORTS", 1, 0, false);
        return (SubLObject)inference_analysis.NIL;
    }
    
    public static SubLObject init_inference_analysis_file() {
        inference_analysis.$transformation_rule_statistics_table$ = SubLFiles.deflexical("*TRANSFORMATION-RULE-STATISTICS-TABLE*", (inference_analysis.NIL != Symbols.boundp((SubLObject)inference_analysis.$sym0$_TRANSFORMATION_RULE_STATISTICS_TABLE_)) ? inference_analysis.$transformation_rule_statistics_table$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)inference_analysis.$int1$64, Symbols.symbol_function((SubLObject)inference_analysis.EQL), (SubLObject)inference_analysis.UNPROVIDED));
        inference_analysis.$transformation_rule_statistics_lock$ = SubLFiles.deflexical("*TRANSFORMATION-RULE-STATISTICS-LOCK*", (inference_analysis.NIL != Symbols.boundp((SubLObject)inference_analysis.$sym2$_TRANSFORMATION_RULE_STATISTICS_LOCK_)) ? inference_analysis.$transformation_rule_statistics_lock$.getGlobalValue() : Locks.make_lock((SubLObject)inference_analysis.$str3$Transformation_Rule_Statistics_Lo));
        inference_analysis.$transformation_rule_statistics_filename_load_history$ = SubLFiles.deflexical("*TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY*", (SubLObject)((inference_analysis.NIL != Symbols.boundp((SubLObject)inference_analysis.$sym4$_TRANSFORMATION_RULE_STATISTICS_FILENAME_LOAD_HISTORY_)) ? inference_analysis.$transformation_rule_statistics_filename_load_history$.getGlobalValue() : inference_analysis.NIL));
        inference_analysis.$transformation_rule_statistics_received_filename_load_history$ = SubLFiles.deflexical("*TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY*", (SubLObject)((inference_analysis.NIL != Symbols.boundp((SubLObject)inference_analysis.$sym5$_TRANSFORMATION_RULE_STATISTICS_RECEIVED_FILENAME_LOAD_HISTORY_)) ? inference_analysis.$transformation_rule_statistics_received_filename_load_history$.getGlobalValue() : inference_analysis.NIL));
        inference_analysis.$transformation_rule_statistics_update_enabledP$ = SubLFiles.defvar("*TRANSFORMATION-RULE-STATISTICS-UPDATE-ENABLED?*", (SubLObject)inference_analysis.T);
        inference_analysis.$transformation_rule_historical_success_pruning_threshold$ = SubLFiles.defvar("*TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING-THRESHOLD*", (SubLObject)inference_analysis.ZERO_INTEGER);
        inference_analysis.$save_recent_experience_lock$ = SubLFiles.defparameter("*SAVE-RECENT-EXPERIENCE-LOCK*", Locks.make_lock((SubLObject)inference_analysis.$str50$Save_recent_experience_lock));
        inference_analysis.$average_rule_historical_success_probability$ = SubLFiles.defparameter("*AVERAGE-RULE-HISTORICAL-SUCCESS-PROBABILITY*", (SubLObject)inference_analysis.$float65$0_02939361143247565);
        inference_analysis.$rule_historical_success_happiness_scaling_factor$ = SubLFiles.defparameter("*RULE-HISTORICAL-SUCCESS-HAPPINESS-SCALING-FACTOR*", (SubLObject)inference_analysis.TEN_INTEGER);
        inference_analysis.$transformation_rule_historical_connectivity_graph$ = SubLFiles.deflexical("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH*", (inference_analysis.NIL != Symbols.boundp((SubLObject)inference_analysis.$sym72$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_)) ? inference_analysis.$transformation_rule_historical_connectivity_graph$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)inference_analysis.$int73$256, Symbols.symbol_function((SubLObject)inference_analysis.EQL), (SubLObject)inference_analysis.UNPROVIDED));
        inference_analysis.$transformation_rule_historical_connectivity_graph_lock$ = SubLFiles.deflexical("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH-LOCK*", (inference_analysis.NIL != Symbols.boundp((SubLObject)inference_analysis.$sym74$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_)) ? inference_analysis.$transformation_rule_historical_connectivity_graph_lock$.getGlobalValue() : Locks.make_lock((SubLObject)inference_analysis.$str75$Rule_Historical_Connectivity_Grap));
        inference_analysis.$hl_module_expand_counts_enabledP$ = SubLFiles.defvar("*HL-MODULE-EXPAND-COUNTS-ENABLED?*", (SubLObject)inference_analysis.NIL);
        inference_analysis.$hl_module_expand_counts$ = SubLFiles.defvar("*HL-MODULE-EXPAND-COUNTS*", dictionary.new_dictionary((SubLObject)inference_analysis.UNPROVIDED, (SubLObject)inference_analysis.UNPROVIDED));
        inference_analysis.$asked_queries_queue$ = SubLFiles.deflexical("*ASKED-QUERIES-QUEUE*", (inference_analysis.NIL != Symbols.boundp((SubLObject)inference_analysis.$sym87$_ASKED_QUERIES_QUEUE_)) ? inference_analysis.$asked_queries_queue$.getGlobalValue() : queues.create_queue((SubLObject)inference_analysis.UNPROVIDED));
        inference_analysis.$save_recent_asked_queries_lock$ = SubLFiles.defparameter("*SAVE-RECENT-ASKED-QUERIES-LOCK*", Locks.make_lock((SubLObject)inference_analysis.$str88$Query_logging_lock));
        inference_analysis.$asked_queries_queue_limit$ = SubLFiles.deflexical("*ASKED-QUERIES-QUEUE-LIMIT*", (SubLObject)inference_analysis.$int89$300);
        inference_analysis.$asked_query_common_symbols$ = SubLFiles.deflexical("*ASKED-QUERY-COMMON-SYMBOLS*", (SubLObject)((inference_analysis.NIL != Symbols.boundp((SubLObject)inference_analysis.$sym99$_ASKED_QUERY_COMMON_SYMBOLS_)) ? inference_analysis.$asked_query_common_symbols$.getGlobalValue() : inference_analysis.NIL));
        inference_analysis.$asked_query_common_symbols_simple$ = SubLFiles.deflexical("*ASKED-QUERY-COMMON-SYMBOLS-SIMPLE*", (SubLObject)((inference_analysis.NIL != Symbols.boundp((SubLObject)inference_analysis.$sym100$_ASKED_QUERY_COMMON_SYMBOLS_SIMPLE_)) ? inference_analysis.$asked_query_common_symbols_simple$.getGlobalValue() : inference_analysis.NIL));
        return (SubLObject)inference_analysis.NIL;
    }
    
    public static SubLObject setup_inference_analysis_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)inference_analysis.$sym0$_TRANSFORMATION_RULE_STATISTICS_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_analysis.$sym2$_TRANSFORMATION_RULE_STATISTICS_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_analysis.$sym4$_TRANSFORMATION_RULE_STATISTICS_FILENAME_LOAD_HISTORY_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_analysis.$sym5$_TRANSFORMATION_RULE_STATISTICS_RECEIVED_FILENAME_LOAD_HISTORY_);
        access_macros.register_macro_helper((SubLObject)inference_analysis.$sym21$TRANSFORMATION_RULE_STATISTICS_TABLE, (SubLObject)inference_analysis.$sym22$DO_TRANSFORMATION_RULES_WITH_STATISTICS);
        access_macros.register_macro_helper((SubLObject)inference_analysis.$sym23$TRANSFORMATION_RULES_WITH_STATISTICS_HELPER, (SubLObject)inference_analysis.$sym22$DO_TRANSFORMATION_RULES_WITH_STATISTICS);
        access_macros.register_macro_helper((SubLObject)inference_analysis.$sym16$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_, (SubLObject)inference_analysis.$sym22$DO_TRANSFORMATION_RULES_WITH_STATISTICS);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_analysis.$sym72$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_analysis.$sym74$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_);
        utilities_macros.register_global_lock((SubLObject)inference_analysis.$sym74$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_, (SubLObject)inference_analysis.$str75$Rule_Historical_Connectivity_Grap);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_analysis.$sym87$_ASKED_QUERIES_QUEUE_);
        access_macros.register_macro_helper((SubLObject)inference_analysis.$sym96$ASKED_QUERIES_FILENAME_, (SubLObject)inference_analysis.$sym97$DO_ASKED_QUERIES_IN_DIRECTORY);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_analysis.$sym99$_ASKED_QUERY_COMMON_SYMBOLS_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_analysis.$sym100$_ASKED_QUERY_COMMON_SYMBOLS_SIMPLE_);
        return (SubLObject)inference_analysis.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_analysis_file();
    }
    
    public void initializeVariables() {
        init_inference_analysis_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_analysis_file();
    }
    
    }

/*

	Total time: 1158 ms
	 synthetic 
*/